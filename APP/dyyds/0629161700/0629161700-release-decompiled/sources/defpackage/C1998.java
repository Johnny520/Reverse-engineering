package defpackage;

/* JADX INFO: renamed from: ᲇᛲᛴᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1998 {

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final java.lang.String f8638;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final java.lang.String f8639;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final boolean f8640;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final boolean f8641;

    public C1998(boolean r4, java.lang.String r5, java.lang.String r6, int r7) {
            r3 = this;
            r0 = r7 & 2
            if (r0 == 0) goto L6
            r0 = 0
            goto L7
        L6:
            r0 = 1
        L7:
            r7 = r7 & 8
            if (r7 == 0) goto Lc
            r6 = 0
        Lc:
            r1 = -414245585329710(0xfffe873eef0961d2, double:NaN)
            r3.<init>()
            r3.f8640 = r4
            r3.f8641 = r0
            r3.f8639 = r5
            r3.f8638 = r6
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L2f
        L3:
            boolean r0 = r3 instanceof defpackage.C1998
            if (r0 != 0) goto L8
            goto L2d
        L8:
            ᲇᛲᛴᛴ r3 = (defpackage.C1998) r3
            boolean r0 = r2.f8640
            boolean r1 = r3.f8640
            if (r0 == r1) goto L11
            goto L2d
        L11:
            boolean r0 = r2.f8641
            boolean r1 = r3.f8641
            if (r0 == r1) goto L18
            goto L2d
        L18:
            java.lang.String r0 = r2.f8639
            java.lang.String r1 = r3.f8639
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L23
            goto L2d
        L23:
            java.lang.String r2 = r2.f8638
            java.lang.String r3 = r3.f8638
            boolean r2 = defpackage.AbstractC0498.m1280(r2, r3)
            if (r2 != 0) goto L2f
        L2d:
            r2 = 0
            return r2
        L2f:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r3 = this;
            boolean r0 = r3.f8640
            int r0 = java.lang.Boolean.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            boolean r2 = r3.f8641
            int r2 = java.lang.Boolean.hashCode(r2)
            int r2 = r2 + r0
            int r2 = r2 * r1
            java.lang.String r0 = r3.f8639
            int r0 = defpackage.AbstractC1124.m2153(r0, r2, r1)
            java.lang.String r3 = r3.f8638
            if (r3 != 0) goto L1d
            r3 = 0
            goto L21
        L1d:
            int r3 = r3.hashCode()
        L21:
            int r0 = r0 + r3
            return r0
    }

    public final java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = -414314304806446(0xfffe872eef0961d2, double:NaN)
            java.lang.String r1 = "DownloadResult(success="
            r0.<init>(r1)
            boolean r1 = r4.f8640
            r0.append(r1)
            r1 = -414417384021550(0xfffe8716ef0961d2, double:NaN)
            java.lang.String r1 = ", cancelled="
            r0.append(r1)
            boolean r1 = r4.f8641
            r0.append(r1)
            r1 = -414473218596398(0xfffe8709ef0961d2, double:NaN)
            java.lang.String r1 = ", message="
            r0.append(r1)
            java.lang.String r1 = r4.f8639
            r2 = -414520463236654(0xfffe86feef0961d2, double:NaN)
            r0.append(r1); r0.append(", filePath=")
            java.lang.String r4 = r4.f8638
            r1 = 41
            java.lang.String r4 = defpackage.AbstractC0225.m823(r0, r4, r1)
            return r4
    }
}
