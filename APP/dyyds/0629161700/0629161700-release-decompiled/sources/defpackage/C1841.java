package defpackage;

/* JADX INFO: renamed from: ᲁᛴᛲᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1841 {

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final java.lang.String f8037;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final java.lang.String f8038;

    public C1841(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            r0 = -216827413569070(0xffff3acbef0961d2, double:NaN)
            r0 = -216853183372846(0xffff3ac5ef0961d2, double:NaN)
            r2.<init>()
            r2.f8037 = r3
            r2.f8038 = r4
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L21
        L3:
            boolean r0 = r3 instanceof defpackage.C1841
            if (r0 != 0) goto L8
            goto L1f
        L8:
            ᲁᛴᛲᛲ r3 = (defpackage.C1841) r3
            java.lang.String r0 = r2.f8037
            java.lang.String r1 = r3.f8037
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L1f
        L15:
            java.lang.String r2 = r2.f8038
            java.lang.String r3 = r3.f8038
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L21
        L1f:
            r2 = 0
            return r2
        L21:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r1 = this;
            java.lang.String r0 = r1.f8037
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.lang.String r1 = r1.f8038
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = -216939082718766(0xffff3ab1ef0961d2, double:NaN)
            java.lang.String r1 = "FrameworkStatusInfo(title="
            r0.<init>(r1)
            java.lang.String r1 = r4.f8037
            r2 = -217055046835758(0xffff3a96ef0961d2, double:NaN)
            r0.append(r1); r0.append(", detail=")
            java.lang.String r4 = r4.f8038
            r1 = 41
            java.lang.String r4 = defpackage.AbstractC0225.m823(r0, r4, r1)
            return r4
    }
}
