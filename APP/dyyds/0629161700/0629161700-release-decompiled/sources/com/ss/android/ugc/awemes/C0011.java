package com.ss.android.ugc.awemes;

/* JADX INFO: renamed from: com.ss.android.ugc.awemes.ᛵᛱᛵᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0011 implements java.util.Comparator {
    @Override // java.util.Comparator
    public final int compare(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            com.ss.android.ugc.awemes.MainActivity$InstalledAdaptedApp r2 = (com.ss.android.ugc.awemes.MainActivity.InstalledAdaptedApp) r2
            boolean r0 = r2.isCurrentVersionAdapted()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            com.ss.android.ugc.awemes.MainActivity$InstalledAdaptedApp r1 = (com.ss.android.ugc.awemes.MainActivity.InstalledAdaptedApp) r1
            boolean r1 = r1.isCurrentVersionAdapted()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = defpackage.AbstractC1171.m2273(r0, r1)
            return r0
    }
}
