package defpackage;

/* JADX INFO: renamed from: ᛴᛸᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0739 {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    @defpackage.InterfaceC1248("chineseName")
    private final java.lang.String f3488;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    @defpackage.InterfaceC1248("numericCode")
    private final java.lang.String f3489;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    @defpackage.InterfaceC1248("code3")
    private final java.lang.String f3490;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    @defpackage.InterfaceC1248("englishName")
    private final java.lang.String f3491;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    @defpackage.InterfaceC1248("code2")
    private final java.lang.String f3492;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    @defpackage.InterfaceC1248("phoneCode")
    private final java.lang.String f3493;

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof defpackage.C0739
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            ᛴᛸᲈ r5 = (defpackage.C0739) r5
            java.lang.String r1 = r4.f3491
            java.lang.String r3 = r5.f3491
            boolean r1 = defpackage.AbstractC0498.m1280(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r1 = r4.f3492
            java.lang.String r3 = r5.f3492
            boolean r1 = defpackage.AbstractC0498.m1280(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            java.lang.String r1 = r4.f3490
            java.lang.String r3 = r5.f3490
            boolean r1 = defpackage.AbstractC0498.m1280(r1, r3)
            if (r1 != 0) goto L2d
            return r2
        L2d:
            java.lang.String r1 = r4.f3489
            java.lang.String r3 = r5.f3489
            boolean r1 = defpackage.AbstractC0498.m1280(r1, r3)
            if (r1 != 0) goto L38
            return r2
        L38:
            java.lang.String r1 = r4.f3488
            java.lang.String r3 = r5.f3488
            boolean r1 = defpackage.AbstractC0498.m1280(r1, r3)
            if (r1 != 0) goto L43
            return r2
        L43:
            java.lang.String r4 = r4.f3493
            java.lang.String r5 = r5.f3493
            boolean r4 = defpackage.AbstractC0498.m1280(r4, r5)
            if (r4 != 0) goto L4e
            return r2
        L4e:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.f3491
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r3.f3492
            int r0 = defpackage.AbstractC1124.m2153(r2, r0, r1)
            java.lang.String r2 = r3.f3490
            int r0 = defpackage.AbstractC1124.m2153(r2, r0, r1)
            java.lang.String r2 = r3.f3489
            int r0 = defpackage.AbstractC1124.m2153(r2, r0, r1)
            java.lang.String r2 = r3.f3488
            int r0 = defpackage.AbstractC1124.m2153(r2, r0, r1)
            java.lang.String r3 = r3.f3493
            int r3 = r3.hashCode()
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = -967278459264558(0xfffc9043ef0961d2, double:NaN)
            java.lang.String r1 = "Country(englishName="
            r0.<init>(r1)
            java.lang.String r1 = r4.f3491
            r2 = -967368653577774(0xfffc902eef0961d2, double:NaN)
            r0.append(r1); r0.append(", code2=")
            java.lang.String r1 = r4.f3492
            r2 = -967407308283438(0xfffc9025ef0961d2, double:NaN)
            r0.append(r1); r0.append(", code3=")
            java.lang.String r1 = r4.f3490
            r2 = -967445962989102(0xfffc901cef0961d2, double:NaN)
            r0.append(r1); r0.append(", numericCode=")
            java.lang.String r1 = r4.f3489
            r2 = -967510387498542(0xfffc900def0961d2, double:NaN)
            r0.append(r1); r0.append(", chineseName=")
            java.lang.String r1 = r4.f3488
            r2 = -967574812007982(0xfffc8ffeef0961d2, double:NaN)
            r0.append(r1); r0.append(", phoneCode=")
            java.lang.String r4 = r4.f3493
            r1 = 41
            java.lang.String r4 = defpackage.AbstractC0225.m823(r0, r4, r1)
            return r4
    }

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final java.lang.String m1655() {
            r0 = this;
            java.lang.String r0 = r0.f3490
            return r0
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final java.lang.String m1656() {
            r0 = this;
            java.lang.String r0 = r0.f3488
            return r0
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final java.lang.String m1657() {
            r0 = this;
            java.lang.String r0 = r0.f3492
            return r0
    }
}
