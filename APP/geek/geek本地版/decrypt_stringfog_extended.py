import argparse
import base64
import codecs
import json
import re
import shutil
from pathlib import Path


CALL_PATTERNS = {
    "b50.m492a": re.compile(
        r'(?P<full>(?:p000\.|defpackage\.)?b50\.(?:m492a|a)\(\s*"(?P<a>(?:\\.|[^"\\])*)"\s*,\s*"(?P<b>(?:\\.|[^"\\])*)"\s*\))',
        re.S,
    ),
    "u40": re.compile(
        r'(?P<full>(?:p000\.|defpackage\.)?u40\.(?:m2419a|a)\(\s*"(?P<a>(?:\\.|[^"\\])*)"\s*,\s*"(?P<b>(?:\\.|[^"\\])*)"\s*\))',
        re.S,
    ),
}

ASSIGNMENT_PATTERN = re.compile(
    r'(?P<prefix>(?:(?:java\.lang\.)?String\s+)?(?P<var>[A-Za-z_$][\w$]*)\s*=\s*)"(?P<value>(?:\\.|[^"\\])*)"\s*(?P<suffix>;?)'
)
VAR_CALL_PATTERN = re.compile(
    r'(?P<full>(?:p000\.|defpackage\.)?u40\.(?:m2419a|a)\(\s*(?P<a>[A-Za-z_$][\w$]*)\s*,\s*(?P<b>[A-Za-z_$][\w$]*)\s*\))'
)


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


def replace_static_calls(text: str, path: Path, cache, counts, failures) -> str:
    for label, pattern in CALL_PATTERNS.items():

        def repl(match: re.Match[str]) -> str:
            key = (match.group("a"), match.group("b"))
            if key not in cache:
                try:
                    cache[key] = decrypt_stringfog(*key)
                except Exception as exc:
                    failures.append((str(path), label, key[0], key[1], repr(exc)))
                    return match.group("full")
            counts[label] = counts.get(label, 0) + 1
            return java_string_literal(cache[key])

        text = pattern.sub(repl, text)
    return text


def replace_variable_calls(text: str, path: Path, cache, counts, failures) -> str:
    # Conservative line-oriented constant propagation. It only keeps literals
    # assigned in the current linear block and clears state at method/class
    # boundaries where register names can be reused.
    known: dict[str, str] = {}
    out_lines: list[str] = []
    for line in text.splitlines(keepends=True):
        stripped = line.strip()
        if stripped.startswith("public ") or stripped.startswith("private ") or stripped.startswith("protected "):
            if "(" in stripped and (stripped.endswith("{") or stripped.endswith(")") or stripped.endswith("*/")):
                known.clear()
        if stripped.startswith("case ") or stripped.endswith(":") or stripped.startswith("goto ") or stripped.startswith("if "):
            # Branch-heavy decompiler output reuses temporary names; do not
            # carry constants across labels or branches.
            known.clear()

        def repl(match: re.Match[str]) -> str:
            a_var = match.group("a")
            b_var = match.group("b")
            if a_var not in known or b_var not in known:
                return match.group("full")
            key = (known[a_var], known[b_var])
            if key not in cache:
                try:
                    cache[key] = decrypt_stringfog(*key)
                except Exception as exc:
                    failures.append((str(path), "u40.var", key[0], key[1], repr(exc)))
                    return match.group("full")
            counts["u40.var"] = counts.get("u40.var", 0) + 1
            return java_string_literal(cache[key])

        new_line = VAR_CALL_PATTERN.sub(repl, line)
        assign = ASSIGNMENT_PATTERN.search(new_line)
        if assign:
            known[assign.group("var")] = assign.group("value")
        else:
            # Invalidate variables that are assigned non-literals on this line.
            simple_assign = re.search(r'(?:(?:java\.lang\.)?String\s+)?([A-Za-z_$][\w$]*)\s*=', new_line)
            if simple_assign:
                known.pop(simple_assign.group(1), None)
        out_lines.append(new_line)
    return "".join(out_lines)


def count_remaining(root: Path) -> dict[str, int]:
    patterns = {
        "u40_literal": re.compile(r'(?:p000\.|defpackage\.)?u40\.(?:m2419a|a)\(\s*"'),
        "u40_any": re.compile(r'(?:p000\.|defpackage\.)?u40\.(?:m2419a|a)\('),
        "b50_literal": re.compile(r'(?:p000\.|defpackage\.)?b50\.(?:m492a|a)\(\s*"'),
        "method_not_decompiled": re.compile(r"Method not decompiled"),
    }
    counts = {name: 0 for name in patterns}
    for path in root.rglob("*.java"):
        text = path.read_text(encoding="utf-8", errors="ignore")
        for name, pattern in patterns.items():
            counts[name] += len(pattern.findall(text))
    return counts


def main() -> None:
    parser = argparse.ArgumentParser()
    parser.add_argument("source", type=Path)
    parser.add_argument("output", type=Path)
    args = parser.parse_args()

    if not args.source.exists():
        raise SystemExit(f"missing source root: {args.source}")
    if args.output.exists():
        raise SystemExit(f"output already exists: {args.output}")

    shutil.copytree(args.source, args.output)
    cache: dict[tuple[str, str], str] = {}
    counts: dict[str, int] = {}
    failures: list[tuple[str, str, str, str, str]] = []
    touched_files = 0

    for path in args.output.rglob("*.java"):
        text = path.read_text(encoding="utf-8", errors="ignore")
        original = text
        text = replace_static_calls(text, path, cache, counts, failures)
        text = replace_variable_calls(text, path, cache, counts, failures)
        if text != original:
            touched_files += 1
            path.write_text(text, encoding="utf-8")

    summary = {
        "source_root": str(args.source),
        "output_root": str(args.output),
        "unique_pairs": len(cache),
        "replaced_call_sites": counts,
        "touched_files": touched_files,
        "remaining": count_remaining(args.output),
        "failures": failures,
    }
    (args.output / "stringfog-extended-summary.json").write_text(
        json.dumps(summary, ensure_ascii=True, indent=2),
        encoding="utf-8",
    )
    (args.output / "stringfog-extended-map.json").write_text(
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
