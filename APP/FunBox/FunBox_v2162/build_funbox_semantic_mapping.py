from pathlib import Path


ROOT = Path(__file__).resolve().parent
SOURCE = ROOT / "FunBox_v2162.jobf"
TARGET = ROOT / "FunBox_v2162_semantic.jobf"


PACKAGE_ALIASES = {
    "a": "fun.box001.internal.dexbridge",
    "b": "fun.box001.internal.error",
    "c": "fun.box001.internal.dexmaker",
    "d": "fun.box001.internal.collections",
    "e": "fun.box001.internal.dexformat",
    "f": "fun.box001.internal.dexformat.util",
    "g": "fun.box001.internal.dexformat.instructions",
    "h": "fun.box001.internal.dexformat.annotations",
    "i": "fun.box001.internal.dexformat.constants",
    "j": "fun.box001.internal.dexformat.writer",
    "k": "fun.box001.internal.dexformat.writer.code",
    "l": "fun.box001.internal.dexformat.writer.data",
    "m": "fun.box001.internal.dexformat.io",
    "n": "fun.box001.internal.dexformat.output",
    "o": "fun.box001.internal.hookbackend",
    "p": "fun.box001.internal.hookbackend.xposed",
}


CLASS_ALIASES = {
    "a.b": "RuntimeDexGenerator",
    "b.a": "DexGenerationException",
    "com.shooker.a": "HookReplacementRecord",
    "fun.box001.loader.a": "ZygiskAppFactoryCallback",
    "o.a": "HookRecord",
    "p.f": "SHookerHookBackend",
    "p.k": "XposedHookBackend",
}


def main() -> None:
    lines = SOURCE.read_text("utf-8").splitlines()
    out, seen_p, seen_c = [], set(), set()
    for line in lines:
        if line.startswith("p ") and " = " in line:
            raw = line[2:].split(" = ", 1)[0]
            if raw in PACKAGE_ALIASES:
                line = f"p {raw} = {PACKAGE_ALIASES[raw]}"
                seen_p.add(raw)
        elif line.startswith("c ") and " = " in line:
            raw = line[2:].split(" = ", 1)[0]
            if raw in CLASS_ALIASES:
                line = f"c {raw} = {CLASS_ALIASES[raw]}"
                seen_c.add(raw)
        out.append(line)
    if set(PACKAGE_ALIASES) != seen_p or set(CLASS_ALIASES) != seen_c:
        raise SystemExit(f"missing package={set(PACKAGE_ALIASES)-seen_p}, class={set(CLASS_ALIASES)-seen_c}")
    TARGET.write_text("\n".join(out) + "\n", "utf-8")
    print(f"Wrote {TARGET.name}: packages={len(PACKAGE_ALIASES)}, classes={len(CLASS_ALIASES)}")


if __name__ == "__main__":
    main()
