package defpackage;

/* JADX INFO: renamed from: ᛵᛴᲇᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0880 {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final java.lang.String f3965;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final java.lang.String f3966;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final java.lang.String f3967;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final java.lang.String f3968;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final java.lang.String f3969;

    public C0880(java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7) {
            r2 = this;
            r0 = -497525001199150(0xfffe3b80ef0961d2, double:NaN)
            r0 = -497559360937518(0xfffe3b78ef0961d2, double:NaN)
            r0 = -497576540806702(0xfffe3b74ef0961d2, double:NaN)
            r0 = -497610900545070(0xfffe3b6cef0961d2, double:NaN)
            r2.<init>()
            r2.f3968 = r3
            r2.f3969 = r4
            r2.f3967 = r5
            r2.f3966 = r6
            r2.f3965 = r7
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L42
        L3:
            boolean r0 = r3 instanceof defpackage.C0880
            if (r0 != 0) goto L8
            goto L40
        L8:
            ᛵᛴᲇᲁ r3 = (defpackage.C0880) r3
            java.lang.String r0 = r2.f3968
            java.lang.String r1 = r3.f3968
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L40
        L15:
            java.lang.String r0 = r2.f3969
            java.lang.String r1 = r3.f3969
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L20
            goto L40
        L20:
            java.lang.String r0 = r2.f3967
            java.lang.String r1 = r3.f3967
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L2b
            goto L40
        L2b:
            java.lang.String r0 = r2.f3966
            java.lang.String r1 = r3.f3966
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L36
            goto L40
        L36:
            java.lang.String r2 = r2.f3965
            java.lang.String r3 = r3.f3965
            boolean r2 = defpackage.AbstractC0498.m1280(r2, r3)
            if (r2 != 0) goto L42
        L40:
            r2 = 0
            return r2
        L42:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.f3968
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r3.f3969
            int r0 = defpackage.AbstractC1124.m2153(r2, r0, r1)
            java.lang.String r2 = r3.f3967
            int r0 = defpackage.AbstractC1124.m2153(r2, r0, r1)
            java.lang.String r2 = r3.f3966
            int r0 = defpackage.AbstractC1124.m2153(r2, r0, r1)
            java.lang.String r3 = r3.f3965
            if (r3 != 0) goto L21
            r3 = 0
            goto L25
        L21:
            int r3 = r3.hashCode()
        L25:
            int r0 = r0 + r3
            return r0
    }

    public final java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = -497774109302318(0xfffe3b46ef0961d2, double:NaN)
            java.lang.String r1 = "SharedComment(awemeId="
            r0.<init>(r1)
            java.lang.String r1 = r4.f3968
            r2 = -497872893550126(0xfffe3b2fef0961d2, double:NaN)
            r0.append(r1); r0.append(", cid=")
            java.lang.String r1 = r4.f3969
            r2 = -497902958321198(0xfffe3b28ef0961d2, double:NaN)
            r0.append(r1); r0.append(", command=")
            java.lang.String r1 = r4.f3967
            r2 = -497950202961454(0xfffe3b1def0961d2, double:NaN)
            r0.append(r1); r0.append(", type=")
            java.lang.String r1 = r4.f3966
            r2 = -497984562699822(0xfffe3b15ef0961d2, double:NaN)
            r0.append(r1); r0.append(", uid=")
            java.lang.String r4 = r4.f3965
            r1 = 41
            java.lang.String r4 = defpackage.AbstractC0225.m823(r0, r4, r1)
            return r4
    }
}
