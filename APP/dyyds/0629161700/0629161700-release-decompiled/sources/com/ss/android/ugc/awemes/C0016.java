package com.ss.android.ugc.awemes;

/* JADX INFO: renamed from: com.ss.android.ugc.awemes.ᲇᛸᲁᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0016 implements java.util.Comparator {

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final /* synthetic */ com.ss.android.ugc.awemes.C0011 f448;

    public C0016(com.ss.android.ugc.awemes.C0011 r1) {
            r0 = this;
            r0.<init>()
            r0.f448 = r1
            return
    }

    @Override // java.util.Comparator
    public final int compare(java.lang.Object r3, java.lang.Object r4) {
            r2 = this;
            com.ss.android.ugc.awemes.ᛵᛱᛵᛲ r2 = r2.f448
            int r2 = r2.compare(r3, r4)
            if (r2 == 0) goto L9
            return r2
        L9:
            com.ss.android.ugc.awemes.MainActivity$InstalledAdaptedApp r3 = (com.ss.android.ugc.awemes.MainActivity.InstalledAdaptedApp) r3
            java.lang.String r2 = r3.getLabel()
            java.util.Locale r3 = java.util.Locale.ROOT
            java.lang.String r2 = r2.toLowerCase(r3)
            r0 = -783617067753006(0xfffd374def0961d2, double:NaN)
            com.ss.android.ugc.awemes.MainActivity$InstalledAdaptedApp r4 = (com.ss.android.ugc.awemes.MainActivity.InstalledAdaptedApp) r4
            java.lang.String r4 = r4.getLabel()
            java.lang.String r3 = r4.toLowerCase(r3)
            r0 = -783690082197038(0xfffd373cef0961d2, double:NaN)
            int r2 = defpackage.AbstractC1171.m2273(r2, r3)
            return r2
    }
}
