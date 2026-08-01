package defpackage;

/* JADX INFO: renamed from: ᛶᛶᛶᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1093 {

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final java.lang.String f4889;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final java.lang.String f4890;

    public C1093(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            r0 = -70360438840878(0xffffc001ef0961d2, double:NaN)
            r0 = -70373323742766(0xffffbffeef0961d2, double:NaN)
            r2.<init>()
            r2.f4889 = r3
            r2.f4890 = r4
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof defpackage.C1093
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            ᛶᛶᛶᛲ r5 = (defpackage.C1093) r5
            java.lang.String r1 = r4.f4889
            java.lang.String r3 = r5.f4889
            boolean r1 = defpackage.AbstractC0498.m1280(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r4 = r4.f4890
            java.lang.String r5 = r5.f4890
            boolean r4 = defpackage.AbstractC0498.m1280(r4, r5)
            if (r4 != 0) goto L22
            return r2
        L22:
            return r0
    }

    public final int hashCode() {
            r1 = this;
            java.lang.String r0 = r1.f4889
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.lang.String r1 = r1.f4890
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r0 = this;
            java.lang.String r0 = r0.f4890
            return r0
    }
}
