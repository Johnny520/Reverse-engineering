package defpackage;

/* JADX INFO: renamed from: ᛳᛵᛷᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0486 implements defpackage.InterfaceC2267 {

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public static final java.util.Set f2425 = null;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final defpackage.C1336 f2426;

    static {
            java.util.HashSet r0 = new java.util.HashSet
            java.lang.String r1 = "content"
            java.lang.String r2 = "android.resource"
            java.lang.String r3 = "file"
            java.lang.String[] r1 = new java.lang.String[]{r3, r1, r2}
            java.util.List r1 = java.util.Arrays.asList(r1)
            r0.<init>(r1)
            java.util.Set r0 = java.util.Collections.unmodifiableSet(r0)
            defpackage.C0486.f2425 = r0
            return
    }

    public C0486(defpackage.C1336 r1) {
            r0 = this;
            r0.<init>()
            r0.f2426 = r1
            return
    }

    @Override // defpackage.InterfaceC2267
    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final boolean mo1265(java.lang.Object r1) {
            r0 = this;
            android.net.Uri r1 = (android.net.Uri) r1
            java.util.Set r0 = defpackage.C0486.f2425
            java.lang.String r1 = r1.getScheme()
            boolean r0 = r0.contains(r1)
            return r0
    }

    @Override // defpackage.InterfaceC2267
    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final defpackage.C0402 mo1266(java.lang.Object r3, int r4, int r5, defpackage.C0533 r6) {
            r2 = this;
            android.net.Uri r3 = (android.net.Uri) r3
            ᛳᛱᛱᛲ r4 = new ᛳᛱᛱᛲ
            ᛵᛶᲈᛵ r5 = new ᛵᛶᲈᛵ
            r5.<init>(r3)
            ᛷᛸᛶᛸ r2 = r2.f2426
            int r6 = r2.f5911
            switch(r6) {
                case 0: goto L25;
                case 1: goto L1a;
                default: goto L10;
            }
        L10:
            ᛶᲁᛳᛳ r6 = new ᛶᲁᛳᛳ
            android.content.ContentResolver r0 = r2.f5910
            boolean r2 = r2.f5909
            r6.<init>(r0, r3, r2)
            goto L2f
        L1a:
            ᛱᛷᛸᛱ r6 = new ᛱᛷᛸᛱ
            android.content.ContentResolver r0 = r2.f5910
            boolean r2 = r2.f5909
            r1 = 1
            r6.<init>(r0, r3, r2, r1)
            goto L2f
        L25:
            ᛱᛷᛸᛱ r6 = new ᛱᛷᛸᛱ
            android.content.ContentResolver r0 = r2.f5910
            boolean r2 = r2.f5909
            r1 = 0
            r6.<init>(r0, r3, r2, r1)
        L2f:
            r4.<init>(r5, r6)
            return r4
    }
}
