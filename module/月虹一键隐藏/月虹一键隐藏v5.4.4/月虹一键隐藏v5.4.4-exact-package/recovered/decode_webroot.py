from __future__ import annotations

import base64
import gzip
import re
from pathlib import Path


ROOT = Path(__file__).resolve().parent
SOURCE = ROOT.parent / "月虹一键隐藏v5.4.4" / "webroot" / "index.html"
OUTPUT = ROOT / "webroot.decoded.html"


def value(source: str, name: str) -> str:
    match = re.search(rf"(?:\b(?:const|let|var)\s+|,)\s*{re.escape(name)}\s*=\s*['\"]([^'\"]+)['\"]", source)
    if not match:
        raise ValueError(f"Could not find {name}")
    return match.group(1)


def rc4(key: bytes, data: bytes) -> bytes:
    state = list(range(256))
    j = 0
    for i in range(256):
        j = (j + state[i] + key[i % len(key)]) & 0xFF
        state[i], state[j] = state[j], state[i]
    i = j = 0
    result = bytearray()
    for item in data:
        i = (i + 1) & 0xFF
        j = (j + state[i]) & 0xFF
        state[i], state[j] = state[j], state[i]
        result.append(item ^ state[(state[i] + state[j]) & 0xFF])
    return bytes(result)


def main() -> None:
    source = SOURCE.read_text(encoding="utf-8")
    encoded = base64.b64decode(value(source, "_e"))
    xor_key = value(source, "_rk").encode("ascii")
    rc4_key = value(source, "_k").encode("ascii")
    xored = bytes(byte ^ xor_key[index % len(xor_key)] for index, byte in enumerate(encoded))
    decoded = base64.b64decode(rc4(rc4_key, xored))
    OUTPUT.write_bytes(gzip.decompress(decoded))
    print(OUTPUT)


if __name__ == "__main__":
    main()
