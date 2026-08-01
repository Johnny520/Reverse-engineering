import base64
import codecs
import re
from pathlib import Path


ROOT = Path(r"D:\PC\Downloads\codex")
SRC = ROOT / "analysis_jadx" / "sources"
OUT = ROOT / "deobfuscated_qstory"

CHUNK_CLASSES = [
    ("AbstractC8405.java", "f23283", 8191),
    ("AbstractC8403.java", "f23281", 8191),
    ("AbstractC8402.java", "f23280", 8191),
    ("AbstractC8401.java", "f23279", 8191),
    ("AbstractC8410.java", "f23286", 8191),
    ("AbstractC8409.java", "f23285", 8191),
    ("AbstractC8413.java", "f23289", 8191),
    ("AbstractC8414.java", "f23290", 8191),
    ("AbstractC8411.java", "f23287", 8191),
    ("AbstractC8412.java", "f23288", 8191),
    ("AbstractC8404.java", "f23282", 2908),
]


MASK64 = (1 << 64) - 1


def u64(x: int) -> int:
    return x & MASK64


def zshr(x: int, n: int) -> int:
    return (x & MASK64) >> n


def java_short(x: int) -> int:
    x &= 0xFFFF
    return x - 0x10000 if x >= 0x8000 else x


def m13950(x: int) -> int:
    j = u64((x ^ zshr(x, 33)) * 7109453100751455733)
    return zshr(u64((j ^ zshr(j, 28)) * -3808689974395783757), 32)


def m13951(state: int) -> int:
    s = java_short(state & 0xFFFF)
    s2 = java_short((state >> 16) & 0xFFFF)
    i = java_short(s + s2) & 0xFFFF
    s3 = java_short(java_short((i >> 7) | (i << 9)) + s)
    s4 = java_short(s2 ^ s)
    i2 = s & 0xFFFF
    s5 = java_short(java_short(java_short((i2 >> 3) | (i2 << 13)) ^ s4) ^ (s4 << 5))
    i3 = s4 & 0xFFFF
    top = java_short((i3 >> 6) | (i3 << 10)) & 0xFFFF
    return u64((((top | ((s3 & 0xFFFF) << 16)) << 16) | (s5 & 0xFFFF)))


def read_chunk(java_file: str, total_len: int) -> str:
    text = (SRC / "p287" / java_file).read_text(encoding="utf-8", errors="replace")
    m = re.search(r'm13949\("([^"]+)"\)', text, re.S)
    if not m:
        raise RuntimeError(f"missing chunk data in {java_file}")
    data = base64.b64decode(m.group(1))
    chars = []
    for i in range(total_len):
        chars.append(chr((data[2 * i] << 8) | data[(2 * i) + 1]))
    return "".join(chars)


def load_chunks() -> list[str]:
    return [read_chunk(java_file, total_len) for java_file, _field, total_len in CHUNK_CLASSES]


CHUNKS = load_chunks()


def m6683(i: int, state: int) -> int:
    state = m13951(state)
    idx = i // 8191
    return u64((ord(CHUNKS[idx][i - (idx * 8191)]) << 32) ^ state)


def m6668(j: int) -> str:
    j &= MASK64
    state = m13951(m13950(j & 0xFFFFFFFF))
    j2 = (state >> 32) & 0xFFFF
    state2 = m13951(state)
    i = int(((j >> 32) ^ j2) ^ ((state2 >> 16) & 0xFFFF0000))
    state3 = m6683(i, state2)
    length = (state3 >> 32) & 0xFFFF
    chars = []
    for n in range(length):
        state3 = m6683(i + n + 1, state3)
        chars.append(chr((state3 >> 32) & 0xFFFF))
    return "".join(chars)


def java_literal(s: str) -> str:
    return '"' + s.encode("unicode_escape").decode("ascii").replace('"', '\\"') + '"'


def fix_mojibake(path: Path) -> str:
    raw = path.read_bytes()
    text = raw.decode("utf-8", errors="replace")
    try:
        fixed = text.encode("latin1", errors="ignore").decode("utf-8")
        return fixed if len(fixed.strip()) > 0 else text
    except UnicodeDecodeError:
        return text


def main() -> None:
    OUT.mkdir(exist_ok=True)
    mapping = {}
    pattern = re.compile(r"AbstractC3056\.m6668\((-?\d+)L\)")
    files = list(SRC.rglob("*.java"))
    for file in files:
        text = file.read_text(encoding="utf-8", errors="replace")
        for value in pattern.findall(text):
            if value not in mapping:
                mapping[value] = m6668(int(value))

    (OUT / "m6668_strings.tsv").write_text(
        "\n".join(f"{k}\t{v.encode('unicode_escape').decode('ascii')}" for k, v in sorted(mapping.items(), key=lambda kv: int(kv[0]))),
        encoding="utf-8",
    )

    src_out = OUT / "sources"
    for file in files:
        rel = file.relative_to(SRC)
        text = file.read_text(encoding="utf-8", errors="replace")

        def repl(match: re.Match) -> str:
            return java_literal(mapping[match.group(1)])

        new_text = pattern.sub(repl, text)
        target = src_out / rel
        target.parent.mkdir(parents=True, exist_ok=True)
        target.write_text(new_text, encoding="utf-8")

    raw_out = OUT / "raw"
    raw_out.mkdir(exist_ok=True)
    raw_dir = ROOT / "analysis_apktool" / "res" / "raw"
    for file in raw_dir.glob("*"):
        (raw_out / file.name).write_text(fix_mojibake(file), encoding="utf-8")

    print(f"decoded {len(mapping)} unique m6668 strings")
    print(f"wrote {OUT}")


if __name__ == "__main__":
    main()
