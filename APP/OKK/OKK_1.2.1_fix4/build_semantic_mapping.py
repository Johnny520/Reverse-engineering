from pathlib import Path


ROOT = Path(__file__).resolve().parent
SOURCE = ROOT / "OKK_1.2.1_fix4.jobf"
TARGET = ROOT / "OKK_1.2.1_fix4_semantic.jobf"


PACKAGE_ALIASES = {
    "b0": "com.abc.internal.probe",
    "c0": "com.abc.core.features",
    "d0": "com.abc.ui",
    "e0": "com.abc.core.status",
    "f0": "com.abc.core.runtime",
}


CLASS_ALIASES = {
    # DexKit / compatibility / diagnostics
    "b0.a": "AppFingerprint",
    "b0.c": "DexKitManager",
    "b0.k": "FeatureProbeCatalog",
    "b0.m": "DiagnosticLevel",
    "b0.n": "DiagnosticItem",
    "b0.s": "CompatibilityReport",

    # Configuration and feature implementations
    "c0.B1": "ThemeWallpaperConfig",
    "c0.D0": "HomeAvatarHook",
    "c0.F0": "InputStatsConfig",
    "c0.G1": "WallpaperOverlayHook",
    "c0.H": "SettingsEntryHook",
    "c0.I0": "InputStatsDatabase",
    "c0.L1": "VirtualLocationHook",
    "c0.N0": "GroupMemberTitleHook",
    "c0.O1": "MapPickerResultHandler",
    "c0.Z": "CustomBubbleHook",
    "c0.a0": "MessageDetailHook",
    "c0.c0": "HotUpdateBlocker",
    "c0.d1": "MomentsAdsBlocker",
    "c0.e0": "DownloadRedirector",
    "c0.g": "MomentsCommentProtectHook",
    "c0.h1": "ConfigStore",
    "c0.j": "InputStatsMessageHook",
    "c0.k": "MomentsHook",
    "c0.m": "MessageActionDispatcher",
    "c0.n": "MessageDatabaseHook",
    "c0.n0": "MessageEditHook",
    "c0.o": "AntiRevokeProcessor",
    "c0.q0": "FoldBannerPinHook",
    "c0.q1": "RealNameTailHook",
    "c0.r": "PcAutoLoginConfig",
    "c0.v1": "RoundAvatarHook",
    "c0.w1": "AvatarHook",
    "c0.y": "BottomTabConfig",

    # Settings / overlay UI
    "d0.c": "SettingsAction",
    "d0.e": "SettingsCallback",
    "d0.s": "FloatingBottomTabView",

    # Feature installation status
    "e0.a": "FeatureInstallResult",
    "e0.b": "FeatureInstallStatus",
    "e0.c": "FeatureStatusRegistry",

    # Runtime entry and feature orchestration
    "f0.V": "SettingsUiBuilder",
    "f0.W": "FeatureInstallTask",
    "f0.Z": "FeatureInstaller",
    "f0.c0": "ModuleBootstrap",
    "f0.f0": "SettingsEntryInjector",
    "f0.i": "HookDiagnostics",
}


def main() -> None:
    lines = SOURCE.read_text("utf-8").splitlines()
    out = []
    seen_packages = set()
    seen_classes = set()
    for line in lines:
        if line.startswith("p ") and " = " in line:
            raw = line[2:].split(" = ", 1)[0]
            if raw in PACKAGE_ALIASES:
                line = f"p {raw} = {PACKAGE_ALIASES[raw]}"
                seen_packages.add(raw)
        elif line.startswith("c ") and " = " in line:
            raw = line[2:].split(" = ", 1)[0]
            if raw in CLASS_ALIASES:
                line = f"c {raw} = {CLASS_ALIASES[raw]}"
                seen_classes.add(raw)
        out.append(line)

    missing_p = sorted(set(PACKAGE_ALIASES) - seen_packages)
    missing_c = sorted(set(CLASS_ALIASES) - seen_classes)
    if missing_p or missing_c:
        raise SystemExit(f"mapping entries not found: packages={missing_p}, classes={missing_c}")

    TARGET.write_text("\n".join(out) + "\n", "utf-8")
    print(f"Wrote {TARGET.name}: {len(PACKAGE_ALIASES)} packages, {len(CLASS_ALIASES)} classes")


if __name__ == "__main__":
    main()
