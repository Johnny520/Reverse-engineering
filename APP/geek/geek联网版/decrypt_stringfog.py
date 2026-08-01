import base64
import codecs
import json
import re
import shutil
from pathlib import Path


ROOT = Path(__file__).resolve().parent
SRC_ROOT = ROOT / "geek-wechat1.2.75_flow_sign_jadx"
OUT_ROOT = ROOT / "geek-wechat1.2.75_flow_sign_jadx_decrypted"

CALL_RE = re.compile(
    r'(?P<full>(?:p000\.)?b50\.m492a\(\s*"(?P<a>(?:\\.|[^"\\])*)"\s*,\s*"(?P<b>(?:\\.|[^"\\])*)"\s*\))',
    re.S,
)
DYNAMIC_RE = re.compile(r'\b(?:p000\.)?b50\.m492a\(\s*(?!")')


def unescape_java_string(text: str) -> str:
    return codecs.decode(text, "unicode_escape")


def decrypt_pair(enc_a: str, enc_b: str) -> str:
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
    if not SRC_ROOT.exists():
        raise SystemExit(f"missing source tree: {SRC_ROOT}")
    if OUT_ROOT.exists():
        raise SystemExit(f"output already exists: {OUT_ROOT}")

    shutil.copytree(SRC_ROOT, OUT_ROOT)

    cache: dict[tuple[str, str], str] = {}
    replaced = 0
    touched_files = 0
    failures: list[tuple[str, str, str]] = []

    for path in OUT_ROOT.rglob("*.java"):
        text = path.read_text(encoding="utf-8")

        def repl(match: re.Match[str]) -> str:
            nonlocal replaced
            key = (match.group("a"), match.group("b"))
            if key not in cache:
                try:
                    cache[key] = decrypt_pair(*key)
                except Exception as exc:
                    failures.append((str(path), key[0], key[1], repr(exc)))
                    return match.group("full")
            replaced += 1
            return java_string_literal(cache[key])

        new_text = CALL_RE.sub(repl, text)
        if new_text != text:
            touched_files += 1
            path.write_text(new_text, encoding="utf-8")

    dynamic_calls = 0
    for path in OUT_ROOT.rglob("*.java"):
        dynamic_calls += len(DYNAMIC_RE.findall(path.read_text(encoding="utf-8")))

    summary = {
        "source_root": str(SRC_ROOT),
        "output_root": str(OUT_ROOT),
        "unique_static_pairs": len(cache),
        "replaced_call_sites": replaced,
        "touched_files": touched_files,
        "remaining_dynamic_call_sites": dynamic_calls,
        "failures": failures,
    }

    (OUT_ROOT / "stringfog-decrypt-summary.json").write_text(
        json.dumps(summary, ensure_ascii=True, indent=2),
        encoding="utf-8",
    )
    (OUT_ROOT / "stringfog-decrypt-map.json").write_text(
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
