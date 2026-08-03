from __future__ import annotations

import json
import re
import struct
from pathlib import Path


ROOT = Path(__file__).resolve().parent
LIB_DIR = ROOT / "FunBox_v2162_apktool" / "lib" / "arm64-v8a"
OUT = ROOT / "FunBox_v2162_analysis"
URL_RE = re.compile(r"(?i)\b(?:https?|wss?|ftp)://[^\s\x00\"'<>)]{3,}")
DOMAIN_RE = re.compile(r"(?i)(?<![\w.-])(?:[a-z0-9-]+\.)+(?:com|cn|net|org|io|me|app|dev|top|xyz|cc)(?![\w.-])")
ASCII_RE = re.compile(rb"[\x20-\x7e]{4,}")


def cstr(blob: bytes, offset: int) -> str:
    end = blob.find(b"\0", offset)
    if end == -1:
        end = len(blob)
    return blob[offset:end].decode("utf-8", errors="replace")


def parse_elf64_symbols(data: bytes) -> list[str]:
    if data[:4] != b"\x7fELF" or data[4] != 2 or data[5] != 1:
        return []
    # ELF64 little-endian header: e_shoff at 0x28, e_shentsize at 0x3a, e_shnum at 0x3c, e_shstrndx at 0x3e.
    shoff = struct.unpack_from("<Q", data, 0x28)[0]
    shentsize = struct.unpack_from("<H", data, 0x3A)[0]
    shnum = struct.unpack_from("<H", data, 0x3C)[0]
    shstrndx = struct.unpack_from("<H", data, 0x3E)[0]
    if not shoff or not shentsize or shoff + shentsize * shnum > len(data):
        return []
    sections = []
    for i in range(shnum):
        o = shoff + i * shentsize
        sh_name, sh_type = struct.unpack_from("<II", data, o)
        sh_offset, sh_size = struct.unpack_from("<QQ", data, o + 0x18)
        sh_link = struct.unpack_from("<I", data, o + 0x28)[0]
        sh_entsize = struct.unpack_from("<Q", data, o + 0x38)[0]
        sections.append((sh_name, sh_type, sh_offset, sh_size, sh_link, sh_entsize))
    if shstrndx >= len(sections):
        return []
    _, _, str_off, str_size, _, _ = sections[shstrndx]
    shstr = data[str_off:str_off + str_size]
    names = []
    for _sh_name, sh_type, sh_offset, sh_size, sh_link, sh_entsize in sections:
        if sh_type not in (2, 11) or sh_link >= len(sections) or not sh_entsize:
            continue
        _, _, st_off, st_size, _, _ = sections[sh_link]
        strtab = data[st_off:st_off + st_size]
        for pos in range(sh_offset, sh_offset + sh_size, sh_entsize):
            if pos + 4 > len(data):
                break
            st_name = struct.unpack_from("<I", data, pos)[0]
            if st_name < len(strtab):
                name = cstr(strtab, st_name)
                if name:
                    names.append(name)
    return sorted(set(names))


def main() -> None:
    OUT.mkdir(exist_ok=True)
    result = {"libraries": {}, "urls": {}, "domains": {}}
    for path in sorted(LIB_DIR.glob("*.so")):
        data = path.read_bytes()
        symbols = parse_elf64_symbols(data)
        strings = [m.group().decode("ascii", errors="ignore") for m in ASCII_RE.finditer(data)]
        candidates = [s for s in strings if any(k.lower() in s.lower() for k in ["JNI", "FunBox", "hook", "zygisk", "load", "dex", "http", "qq", "wechat", "tencent", "aweme", "/data/"])]
        result["libraries"][path.name] = {
            "size": len(data),
            "symbols": symbols,
            "notable_strings": sorted(set(candidates))[:500],
        }
        for value in strings:
            for url in URL_RE.findall(value):
                result["urls"].setdefault(url, []).append(path.name)
            for domain in DOMAIN_RE.findall(value):
                result["domains"].setdefault(domain, []).append(path.name)
    for d in (result["urls"], result["domains"]):
        for key, value in d.items():
            d[key] = sorted(set(value))
    (OUT / "native_analysis.json").write_text(json.dumps(result, ensure_ascii=False, indent=2), "utf-8")
    for name, item in result["libraries"].items():
        print(f"{name}: symbols={len(item['symbols'])}, notable_strings={len(item['notable_strings'])}")
        print("  " + ", ".join(item["symbols"][:30]))
    print("URLs:", json.dumps(result["urls"], ensure_ascii=False))


if __name__ == "__main__":
    main()
