from __future__ import annotations

import json
from pathlib import Path

from build_semantic_mapping import CLASS_ALIASES, PACKAGE_ALIASES


ROOT = Path(__file__).resolve().parent


def main() -> None:
    required = [
        ROOT / "OKK_1.2.1_fix4.apk",
        ROOT / "OKK_1.2.1_fix4_readable/sources",
        ROOT / "OKK_1.2.1_fix4_readable/resources/AndroidManifest.xml",
        ROOT / "OKK_1.2.1_fix4_readable_simple/sources",
        ROOT / "OKK_1.2.1_fix4_apktool/smali",
        ROOT / "OKK_1.2.1_fix4_apktool/res",
        ROOT / "OKK_1.2.1_fix4_完整解密说明.md",
        ROOT / "OKK_1.2.1_fix4_readable/解密说明.md",
        ROOT / "OKK_1.2.1_fix4_analysis/URL清单.tsv",
        ROOT / "OKK_1.2.1_fix4_analysis/重要类语义映射.tsv",
        ROOT / "OKK_1.2.1_fix4_analysis/binary_string_scan.json",
    ]
    missing = [str(p) for p in required if not p.exists()]
    if missing:
        raise SystemExit("Missing outputs:\n" + "\n".join(missing))

    missing_classes = []
    for raw, alias in CLASS_ALIASES.items():
        raw_pkg = raw.rsplit(".", 1)[0]
        pkg = PACKAGE_ALIASES.get(raw_pkg, raw_pkg)
        p = ROOT / "OKK_1.2.1_fix4_readable/sources" / Path(*pkg.split(".")) / f"{alias}.java"
        if not p.is_file():
            missing_classes.append(str(p))
    if missing_classes:
        raise SystemExit("Missing semantic classes:\n" + "\n".join(missing_classes))

    report = (ROOT / "OKK_1.2.1_fix4_完整解密说明.md").read_text("utf-8")
    for marker in [
        "完整解密与源码说明",
        "https://t.me/OKK_Group",
        "https://android.googlesource.com/toolchain/llvm-project",
        "ConfigStore.java",
        "FeatureInstaller.java",
    ]:
        if marker not in report:
            raise SystemExit(f"Report marker missing: {marker}")

    scan = json.loads((ROOT / "OKK_1.2.1_fix4_analysis/binary_string_scan.json").read_text("utf-8"))
    if "https://t.me/OKK_Group" not in scan["urls"]:
        raise SystemExit("Telegram URL missing from binary scan")

    counts = {
        "readable_java": len(list((ROOT / "OKK_1.2.1_fix4_readable/sources").rglob("*.java"))),
        "simple_java": len(list((ROOT / "OKK_1.2.1_fix4_readable_simple/sources").rglob("*.java"))),
        "smali": len(list((ROOT / "OKK_1.2.1_fix4_apktool/smali").rglob("*.smali"))),
        "semantic_classes": len(CLASS_ALIASES),
    }
    if counts["readable_java"] < 1400 or counts["smali"] < 1500:
        raise SystemExit(f"Unexpected output counts: {counts}")
    print(json.dumps({"status": "ok", **counts}, ensure_ascii=False))


if __name__ == "__main__":
    main()
