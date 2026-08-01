package defpackage;

/* JADX INFO: renamed from: ᲇᛷᛵᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public class C2090 extends defpackage.AbstractC0758 {
    public C2090() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // defpackage.AbstractC0758
    /* JADX INFO: renamed from: ᛷᛸᛵᲇ */
    public final void mo561(defpackage.C0353 r1, java.lang.Object r2) {
            r0 = this;
            java.util.Locale r2 = (java.util.Locale) r2
            if (r2 != 0) goto L6
            r0 = 0
            goto La
        L6:
            java.lang.String r0 = r2.toString()
        La:
            r1.m1075(r0)
            return
    }

    @Override // defpackage.AbstractC0758
    /* JADX INFO: renamed from: ᲇᛶᛵᲇ */
    public final java.lang.Object mo562(defpackage.C1103 r4) {
            r3 = this;
            int r3 = r4.m2090()
            r0 = 9
            r1 = 0
            if (r3 != r0) goto Ld
            r4.m2108()
            return r1
        Ld:
            java.lang.String r3 = r4.m2096()
            java.util.StringTokenizer r4 = new java.util.StringTokenizer
            java.lang.String r0 = "_"
            r4.<init>(r3, r0)
            boolean r3 = r4.hasMoreElements()
            if (r3 == 0) goto L23
            java.lang.String r3 = r4.nextToken()
            goto L24
        L23:
            r3 = r1
        L24:
            boolean r0 = r4.hasMoreElements()
            if (r0 == 0) goto L2f
            java.lang.String r0 = r4.nextToken()
            goto L30
        L2f:
            r0 = r1
        L30:
            boolean r2 = r4.hasMoreElements()
            if (r2 == 0) goto L3a
            java.lang.String r1 = r4.nextToken()
        L3a:
            if (r0 != 0) goto L44
            if (r1 != 0) goto L44
            java.util.Locale r4 = new java.util.Locale
            r4.<init>(r3)
            return r4
        L44:
            if (r1 != 0) goto L4c
            java.util.Locale r4 = new java.util.Locale
            r4.<init>(r3, r0)
            return r4
        L4c:
            java.util.Locale r4 = new java.util.Locale
            r4.<init>(r3, r0, r1)
            return r4
    }
}
