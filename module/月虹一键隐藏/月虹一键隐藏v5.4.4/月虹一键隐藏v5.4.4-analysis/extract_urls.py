from __future__ import annotations

import json
import re
from pathlib import Path


ROOT = Path(__file__).resolve().parent
SOURCES = (
    ROOT.parent / "月虹一键隐藏v5.4.4" / "main",
    ROOT / "main.unpacked",
    ROOT / "webroot.decoded.html",
    ROOT / "strings_ascii.txt",
    ROOT / "decoded_embedded_payloads.txt",
    ROOT.parent / "月虹一键隐藏v5.4.4" / "customize.sh",
    ROOT.parent / "月虹一键隐藏v5.4.4" / "service.sh",
)
URL_RE = re.compile(r"https?://[^\s\"'<>]+", re.IGNORECASE)


def classify(url: str) -> str:
    lowered = url.lower()
    if "cdnjs.cloudflare.com" in lowered:
        return "runtime-resource"
    if "android.googlesource.com/toolchain/llvm-project" in lowered:
        return "compiler-metadata"
    if "t.me/klee_tusi" in lowered:
        return "obfuscator-metadata"
    if "upx.sf.net" in lowered:
        return "packer-metadata"
    if "w3.org/2000/svg" in lowered:
        return "xml-namespace"
    return "unclassified"


def clean_url(url: str) -> str:
    return url.rstrip("),.;]}\\")


def main() -> None:
    rows: list[dict[str, object]] = []
    seen: set[tuple[str, str, int]] = set()
    for source in SOURCES:
        if not source.exists():
            continue
        text = source.read_bytes().decode("latin-1")
        for match in URL_RE.finditer(text):
            url = clean_url(match.group())
            line_number = text.count("\n", 0, match.start()) + 1
            key = (str(source), url, match.start())
            if key in seen:
                continue
            seen.add(key)
            rows.append(
                {
                    "url": url,
                    "category": classify(url),
                    "source": str(source),
                    "line": line_number,
                    "offset": match.start(),
                }
            )

    unique_urls = sorted({str(row["url"]) for row in rows})
    payload = {"unique_url_count": len(unique_urls), "unique_urls": unique_urls, "references": rows}
    (ROOT / "url_inventory.json").write_text(
        json.dumps(payload, ensure_ascii=False, indent=2) + "\n",
        encoding="utf-8",
    )
    (ROOT / "url_inventory.tsv").write_text(
        "category\turl\tsource\tline\toffset\n"
        + "\n".join(
            f"{row['category']}\t{row['url']}\t{row['source']}\t{row['line']}\t{row['offset']}" for row in rows
        )
        + "\n",
        encoding="utf-8",
    )
    print(ROOT / "url_inventory.json")
    print(ROOT / "url_inventory.tsv")


if __name__ == "__main__":
    main()
