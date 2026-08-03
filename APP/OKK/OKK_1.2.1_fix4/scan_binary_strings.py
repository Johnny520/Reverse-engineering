from __future__ import annotations

import json
import re
import zipfile
from pathlib import Path


ROOT = Path(__file__).resolve().parent
APK = ROOT / "OKK_1.2.1_fix4.apk"
OUT = ROOT / "OKK_1.2.1_fix4_analysis" / "binary_string_scan.json"
ASCII = re.compile(rb"[\x20-\x7e]{4,}")
URL = re.compile(r"(?i)\b(?:https?|wss?|ftp)://[^\s\x00\"'<>)]{3,}")
DOMAIN = re.compile(r"(?i)(?<![\w.-])(?:[a-z0-9-]+\.)+(?:com|cn|net|org|io|me|app|dev|top|xyz|cc)(?![\w.-])")


def main() -> None:
    hits = {"urls": {}, "domains": {}}
    with zipfile.ZipFile(APK) as zf:
        targets = [n for n in zf.namelist() if n.endswith((".dex", ".so"))]
        for name in targets:
            data = zf.read(name)
            strings = [m.group().decode("ascii", errors="ignore") for m in ASCII.finditer(data)]
            for s in strings:
                for value in URL.findall(s):
                    hits["urls"].setdefault(value, []).append(name)
                for value in DOMAIN.findall(s):
                    hits["domains"].setdefault(value, []).append(name)
    for group in hits.values():
        for key in list(group):
            group[key] = sorted(set(group[key]))
    OUT.write_text(json.dumps(hits, ensure_ascii=False, indent=2, sort_keys=True), "utf-8")
    print(json.dumps(hits, ensure_ascii=False, indent=2, sort_keys=True))


if __name__ == "__main__":
    main()
