import argparse
import base64
import codecs
import json
import re
import shutil
from pathlib import Path


ENTRYPOINTS = {
    "b50.m492a": re.compile(
        r'(?P<full>(?:p000\.)?b50\.m492a\(\s*"(?P<a>(?:\\.|[^"\\])*)"\s*,\s*"(?P<b>(?:\\.|[^"\\])*)"\s*\))',
        re.S,
    ),
    "u40.m2419a": re.compile(
        r'(?P<full>(?:p000\.)?u40\.m2419a\(\s*"(?P<a>(?:\\.|[^"\\])*)"\s*,\s*"(?P<b>(?:\\.|[^"\\])*)"\s*\))',
        re.S,
    ),
}


def unescape_java_string(text: str) -> str:
    return codecs.decode(text, "unicode_escape")


def decrypt_stringfog(enc_a: str, enc_b: str) -> str:
    a_text = unescape_java_string(enc_a)
    b_text = unescape_java_string(enc_b)
    a_bytes = base64.b64decode("".join(a_text.split()))
    b_bytes = base64.b64decode("".join(b_text.split()))
    if not b_bytes:
        raise ValueError("empty key")
    out = bytes(a_bytes[i] ^ b_bytes[i % len(b_bytes)] for i in range(len(a_bytes)))
    return out.decode("utf-8")


def java_string_literal(value: str) -> str:
    return json.dumps(value, ensure_ascii=True)


def main() -> None:
    parser = argparse.ArgumentParser()
    parser.add_argument("source", type=Path)
    parser.add_argument("output", type=Path)
    args = parser.parse_args()

    src_root = args.source
    out_root = args.output

    if not src_root.exists():
        raise SystemExit(f"missing source root: {src_root}")
    if out_root.exists():
        raise SystemExit(f"output already exists: {out_root}")

    shutil.copytree(src_root, out_root)

    cache: dict[tuple[str, str], str] = {}
    counts = {name: 0 for name in ENTRYPOINTS}
    touched_files = 0
    failures: list[tuple[str, str, str, str]] = []

    for path in out_root.rglob("*.java"):
        text = path.read_text(encoding="utf-8")
        original = text
        for label, pattern in ENTRYPOINTS.items():
            def repl(match: re.Match[str]) -> str:
                key = (match.group("a"), match.group("b"))
                if key not in cache:
                    try:
                        cache[key] = decrypt_stringfog(*key)
                    except Exception as exc:
                        failures.append((str(path), label, key[0], key[1], repr(exc)))
                        return match.group("full")
                counts[label] += 1
                return java_string_literal(cache[key])

            text = pattern.sub(repl, text)
        if text != original:
            touched_files += 1
            path.write_text(text, encoding="utf-8")

    dynamic_counts = {}
    for label, pattern in ENTRYPOINTS.items():
        dynamic_counts[label] = 0
    for path in out_root.rglob("*.java"):
        text = path.read_text(encoding="utf-8")
        for label, pattern in ENTRYPOINTS.items():
            dynamic_counts[label] += len(pattern.findall(text))

    summary = {
        "source_root": str(src_root),
        "output_root": str(out_root),
        "unique_static_pairs": len(cache),
        "replaced_call_sites": counts,
        "touched_files": touched_files,
        "remaining_call_sites": dynamic_counts,
        "failures": failures,
    }

    (out_root / "stringfog-decrypt-summary.json").write_text(
        json.dumps(summary, ensure_ascii=True, indent=2),
        encoding="utf-8",
    )
    (out_root / "stringfog-decrypt-map.json").write_text(
        json.dumps(
            {f"{a} || {b}": cache[(a, b)] for (a, b) in cache},
            ensure_ascii=True,
            indent=2,
        ),
        encoding="utf-8",
    )

    print(json.dumps(summary, ensure_ascii=True, indent=2))


if __name__ == "__main__":
    main()
