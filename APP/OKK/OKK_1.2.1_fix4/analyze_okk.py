from __future__ import annotations

import json
import re
from collections import defaultdict
from pathlib import Path


ROOT = Path(__file__).resolve().parent
JADX = ROOT / "OKK_1.2.1_fix4_decompiled" / "sources"
APKTOOL = ROOT / "OKK_1.2.1_fix4_apktool"
OUT = ROOT / "OKK_1.2.1_fix4_analysis"

APP_DIRS = [
    JADX / "com" / "abc",
    JADX / "p049b0",
    JADX / "p050c0",
    JADX / "p052d0",
    JADX / "p054e0",
    JADX / "p056f0",
]

JAVA_STRING_RE = re.compile(r'"((?:\\.|[^"\\])*)"')
SMALI_STRING_RE = re.compile(r'const-string(?:/jumbo)?\s+[^,]+,\s+"((?:\\.|[^"\\])*)"')
URL_RE = re.compile(r'(?i)\b(?:https?|wss?|ftp)://[^\s"\'<>)]+' )
DOMAIN_RE = re.compile(r'(?i)(?<![\w.-])(?:[a-z0-9-]+\.)+(?:com|cn|net|org|io|me|app|dev|top|xyz|cc)(?![\w.-])')


def java_unescape(s: str) -> str:
    """Decode Java/smali escapes without corrupting existing Unicode."""
    def repl(m: re.Match[str]) -> str:
        token = m.group(0)
        if token.startswith("\\u"):
            return chr(int(token[2:], 16))
        table = {
            r"\n": "\n", r"\r": "\r", r"\t": "\t", r"\b": "\b",
            r"\f": "\f", r'\"': '"', r"\'": "'", r"\\": "\\",
        }
        return table.get(token, token)

    return re.sub(r"\\u[0-9a-fA-F]{4}|\\[nrtbf\"'\\]", repl, s)


def repair_mojibake(s: str) -> str:
    """Repair the common UTF-8 bytes decoded as GBK pattern in JADX output."""
    if not any(ch in s for ch in "鏃ュ織鍚敤绯荤粺妯″潡璁剧疆寮€鍏抽棴锛屻€傦紝"): 
        return s
    try:
        candidate = s.encode("gbk").decode("utf-8")
    except (UnicodeEncodeError, UnicodeDecodeError):
        return s
    old_bad = sum(s.count(ch) for ch in "鏃ュ織鍚敤绯荤粺妯″潡璁剧疆寮€鍏抽棴锛屻€傦紝")
    new_bad = sum(candidate.count(ch) for ch in "鏃ュ織鍚敤绯荤粺妯″潡璁剧疆寮€鍏抽棴锛屻€傦紝")
    return candidate if new_bad < old_bad else s


def iter_java_strings():
    seen_paths: set[Path] = set()
    for base in APP_DIRS:
        if not base.exists():
            continue
        for path in base.rglob("*.java"):
            if path in seen_paths:
                continue
            seen_paths.add(path)
            text = path.read_text("utf-8", errors="replace")
            for lineno, line in enumerate(text.splitlines(), 1):
                for m in JAVA_STRING_RE.finditer(line):
                    value = repair_mojibake(java_unescape(m.group(1)))
                    yield path.relative_to(JADX).as_posix(), lineno, value


def iter_smali_strings():
    smali_root = APKTOOL / "smali"
    for path in smali_root.rglob("*.smali"):
        text = path.read_text("utf-8", errors="replace")
        for lineno, line in enumerate(text.splitlines(), 1):
            m = SMALI_STRING_RE.search(line)
            if m:
                yield path.relative_to(APKTOOL).as_posix(), lineno, java_unescape(m.group(1))


def main() -> None:
    OUT.mkdir(exist_ok=True)

    java_rows = list(iter_java_strings())
    smali_rows = list(iter_smali_strings())

    # Human-facing strings and configuration keys from app code.
    values: dict[str, list[str]] = defaultdict(list)
    for path, line, value in java_rows:
        if value and len(value) <= 500:
            values[value].append(f"{path}:{line}")

    config_like = {}
    ui_like = {}
    technical = {}
    for value, refs in sorted(values.items(), key=lambda kv: kv[0].casefold()):
        if re.fullmatch(r"[a-z][a-z0-9_]{2,}", value):
            config_like[value] = refs
        elif any("\u4e00" <= ch <= "\u9fff" for ch in value):
            ui_like[value] = refs
        elif re.search(r"[.$/]|hook|wechat|wx|class|method|field|sqlite|database", value, re.I):
            technical[value] = refs

    all_rows = java_rows + smali_rows
    urls: dict[str, list[str]] = defaultdict(list)
    domains: dict[str, list[str]] = defaultdict(list)
    for path, line, value in all_rows:
        for url in URL_RE.findall(value):
            urls[url].append(f"{path}:{line}")
        for domain in DOMAIN_RE.findall(value):
            domains[domain].append(f"{path}:{line}")

    data = {
        "urls": dict(sorted(urls.items())),
        "domains": dict(sorted(domains.items())),
        "config_keys": config_like,
        "ui_strings": ui_like,
        "technical_strings": technical,
        "counts": {
            "java_string_occurrences": len(java_rows),
            "smali_string_occurrences": len(smali_rows),
            "unique_app_strings": len(values),
        },
    }
    (OUT / "strings_and_urls.json").write_text(
        json.dumps(data, ensure_ascii=False, indent=2), "utf-8"
    )

    with (OUT / "app_strings.tsv").open("w", encoding="utf-8", newline="") as f:
        f.write("value\treferences\n")
        for value, refs in sorted(values.items(), key=lambda kv: kv[0].casefold()):
            clean = value.replace("\t", "\\t").replace("\r", "\\r").replace("\n", "\\n")
            f.write(f"{clean}\t{' | '.join(refs)}\n")

    # Per-source feature index: useful for assigning semantic names to R8 classes.
    per_file: dict[str, dict[str, list[str]]] = defaultdict(lambda: defaultdict(list))
    for path, _line, value in java_rows:
        if re.fullmatch(r"[a-z][a-z0-9_]{2,}", value):
            if value not in per_file[path]["keys"]:
                per_file[path]["keys"].append(value)
        elif any("\u4e00" <= ch <= "\u9fff" for ch in value) and len(value) <= 120:
            if value not in per_file[path]["ui"]:
                per_file[path]["ui"].append(value)
        elif re.search(r"com\.tencent|SQLite|DexKit|Hook|hook|WeChat|wechat|wx", value):
            if value not in per_file[path]["tech"]:
                per_file[path]["tech"].append(value)
    (OUT / "per_file_features.json").write_text(
        json.dumps(per_file, ensure_ascii=False, indent=2, sort_keys=True), "utf-8"
    )

    print(json.dumps(data["counts"], ensure_ascii=False))
    print(f"URLs: {len(urls)}; domains: {len(domains)}; config keys: {len(config_like)}; UI strings: {len(ui_like)}")
    for url, refs in sorted(urls.items()):
        print(f"URL {url} <- {refs[0]}")


if __name__ == "__main__":
    main()
