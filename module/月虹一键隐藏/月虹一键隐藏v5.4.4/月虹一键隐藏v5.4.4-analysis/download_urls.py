from __future__ import annotations

import hashlib
import json
import mimetypes
import re
import urllib.error
import urllib.parse
import urllib.request
from collections import deque
from pathlib import Path


ROOT = Path(__file__).resolve().parent
INVENTORY = ROOT / "url_inventory.json"
DOWNLOAD_ROOT = ROOT / "downloaded_urls"
REPORT = ROOT / "url_download_report.json"
CSS_URL_RE = re.compile(rb"url\(\s*['\"]?([^'\")]+)", re.IGNORECASE)


def target_path(url: str, content_type: str) -> Path:
    parsed = urllib.parse.urlsplit(url)
    raw_name = Path(parsed.path).name or "index"
    safe_name = re.sub(r"[^A-Za-z0-9._-]+", "_", raw_name)[:120] or "index"
    if "." not in safe_name:
        extension = mimetypes.guess_extension(content_type.split(";", 1)[0].strip()) or ".bin"
        safe_name += extension
    digest = hashlib.sha256(url.encode("utf-8")).hexdigest()[:12]
    host = re.sub(r"[^A-Za-z0-9._-]+", "_", parsed.netloc)
    return DOWNLOAD_ROOT / host / f"{digest}_{safe_name}"


def main() -> None:
    inventory = json.loads(INVENTORY.read_text(encoding="utf-8"))
    queue = deque((url, 0, "inventory") for url in inventory["unique_urls"])
    queued = {url for url in inventory["unique_urls"]}
    results: list[dict[str, object]] = []
    opener = urllib.request.build_opener()
    opener.addheaders = [("User-Agent", "Codex-Static-Analysis/1.0")]

    while queue:
        url, depth, discovered_from = queue.popleft()
        row: dict[str, object] = {"url": url, "depth": depth, "discovered_from": discovered_from}
        try:
            with opener.open(url, timeout=45) as response:
                body = response.read()
                final_url = response.geturl()
                content_type = response.headers.get("Content-Type", "application/octet-stream")
                destination = target_path(url, content_type)
                destination.parent.mkdir(parents=True, exist_ok=True)
                destination.write_bytes(body)
                row.update(
                    {
                        "status": getattr(response, "status", 200),
                        "final_url": final_url,
                        "content_type": content_type,
                        "size": len(body),
                        "sha256": hashlib.sha256(body).hexdigest().upper(),
                        "saved_path": str(destination),
                    }
                )

                if depth < 3 and "text/css" in content_type.lower():
                    for raw in CSS_URL_RE.findall(body):
                        resource = raw.decode("utf-8", "replace").strip()
                        if resource.startswith("data:"):
                            continue
                        child = urllib.parse.urljoin(final_url, resource)
                        if child.startswith(("http://", "https://")) and child not in queued:
                            queued.add(child)
                            queue.append((child, depth + 1, url))
        except (urllib.error.URLError, urllib.error.HTTPError, TimeoutError, OSError) as error:
            row["error"] = repr(error)
        results.append(row)
        REPORT.write_text(json.dumps(results, ensure_ascii=False, indent=2) + "\n", encoding="utf-8")

    print(REPORT)
    print(f"downloaded={sum('saved_path' in row for row in results)} total={len(results)}")


if __name__ == "__main__":
    main()
