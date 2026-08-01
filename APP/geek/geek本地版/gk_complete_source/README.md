# gk.apk decrypted source package

This folder contains the decompiled and decrypted outputs for `D:\folder\codex\gk.apk`.

## Contents

- `java_readable_decrypted/`
  - Main jadx output with StringFog literal calls inlined.
  - Best for reading normal Java structure and package names.
  - `com.ljx.wechatmod.auth.StringFog` has been manually restored from smali.
  - Remaining `Method not decompiled` entries are jadx/control-flow-confusion failures.

- `java_simple_decrypted/`
  - jadx simple-mode output with decrypted strings.
  - Best compromise between readability and completeness.
  - Only 2 `Method not decompiled` markers remain:
    - `defpackage.ct.i(android.content.Context, android.content.res.Resources, int, java.lang.String, int)`
    - `defpackage.qs.onPreDraw()`

- `java_fallback_full_decrypted/`
  - jadx fallback/register-style output with no `Method not decompiled` markers.
  - Best for checking methods that failed in the readable tree.
  - This is not pretty Java, but it preserves method bodies instead of dropping them.

- `apktool_smali_full/`
  - Full apktool/smali output.
  - This is the closest complete representation of the APK bytecode.

- `decrypt_stringfog_extended.py`
  - Script used for the second-pass StringFog decoding.

## Decryption Summary

- Original static StringFog pass: 846 `u40.m2419a(...)` call sites replaced.
- Extended readable-tree pass: 22 extra variable-argument `u40` call sites replaced.
- Extended simple-mode pass: 2635 static `u40.a(...)` call sites replaced.
- Extended fallback pass: 2142 fallback/register `u40.a(...)` call sites replaced.
- Static literal `u40` and `b50` call sites remaining: 0.
- Simple tree `Method not decompiled` remaining: 2.
- Fallback full tree `Method not decompiled` remaining: 0.

## Notes

The APK contains `assets/protected_by_np/ApkControlFlowConfusion_8.0_88a94207145f483bb6d8b553b3b57a25.txt`, so some Java cannot be reconstructed as clean source by jadx. For those methods, use `java_fallback_full_decrypted/` or `apktool_smali_full/`.
