package defpackage;

/* JADX INFO: renamed from: ᲁᲇᛶᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1945 {

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final java.lang.String f8461;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final java.lang.String f8462;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final java.lang.String f8463;

    public C1945(java.lang.String r3, java.lang.String r4, java.lang.String r5) {
            r2 = this;
            r0 = -502567292804654(0xfffe36eaef0961d2, double:NaN)
            r0 = -502588767641134(0xfffe36e5ef0961d2, double:NaN)
            r0 = -502627422346798(0xfffe36dcef0961d2, double:NaN)
            r2.<init>()
            r2.f8462 = r3
            r2.f8463 = r4
            r2.f8461 = r5
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof defpackage.C1945
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            ᲁᲇᛶᛱ r5 = (defpackage.C1945) r5
            java.lang.String r1 = r4.f8462
            java.lang.String r3 = r5.f8462
            boolean r1 = defpackage.AbstractC0498.m1280(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r1 = r4.f8463
            java.lang.String r3 = r5.f8463
            boolean r1 = defpackage.AbstractC0498.m1280(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            java.lang.String r4 = r4.f8461
            java.lang.String r5 = r5.f8461
            boolean r4 = defpackage.AbstractC0498.m1280(r4, r5)
            if (r4 != 0) goto L2d
            return r2
        L2d:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.f8462
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r3.f8463
            int r0 = defpackage.AbstractC1124.m2153(r2, r0, r1)
            java.lang.String r3 = r3.f8461
            int r3 = r3.hashCode()
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = -502936659992110(0xfffe3694ef0961d2, double:NaN)
            java.lang.String r1 = "Config(host="
            r0.<init>(r1)
            java.lang.String r1 = r4.f8462
            r2 = -502992494566958(0xfffe3687ef0961d2, double:NaN)
            r0.append(r1); r0.append(", username=")
            java.lang.String r1 = r4.f8463
            r2 = -503044034174510(0xfffe367bef0961d2, double:NaN)
            r0.append(r1); r0.append(", password=")
            java.lang.String r4 = r4.f8461
            r1 = 41
            java.lang.String r4 = defpackage.AbstractC0225.m823(r0, r4, r1)
            return r4
    }
}
