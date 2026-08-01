package defpackage;

/* JADX INFO: renamed from: ᲇᛴᛵᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C2035 {

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final java.lang.String f8769;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final java.lang.String f8770;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final java.lang.String f8771;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final java.lang.String f8772;

    public C2035(java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6) {
            r2 = this;
            r0 = -420791115488814(0xfffe814aef0961d2, double:NaN)
            r0 = -420812590325294(0xfffe8145ef0961d2, double:NaN)
            r0 = -420851245030958(0xfffe813cef0961d2, double:NaN)
            r0 = -420889899736622(0xfffe8133ef0961d2, double:NaN)
            r2.<init>()
            r2.f8771 = r3
            r2.f8772 = r4
            r2.f8770 = r5
            r2.f8769 = r6
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L37
        L3:
            boolean r0 = r3 instanceof defpackage.C2035
            if (r0 != 0) goto L8
            goto L35
        L8:
            ᲇᛴᛵᛱ r3 = (defpackage.C2035) r3
            java.lang.String r0 = r2.f8771
            java.lang.String r1 = r3.f8771
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L35
        L15:
            java.lang.String r0 = r2.f8772
            java.lang.String r1 = r3.f8772
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L20
            goto L35
        L20:
            java.lang.String r0 = r2.f8770
            java.lang.String r1 = r3.f8770
            boolean r0 = defpackage.AbstractC0498.m1280(r0, r1)
            if (r0 != 0) goto L2b
            goto L35
        L2b:
            java.lang.String r2 = r2.f8769
            java.lang.String r3 = r3.f8769
            boolean r2 = defpackage.AbstractC0498.m1280(r2, r3)
            if (r2 != 0) goto L37
        L35:
            r2 = 0
            return r2
        L37:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.f8771
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r3.f8772
            int r0 = defpackage.AbstractC1124.m2153(r2, r0, r1)
            java.lang.String r2 = r3.f8770
            int r0 = defpackage.AbstractC1124.m2153(r2, r0, r1)
            java.lang.String r3 = r3.f8769
            int r3 = r3.hashCode()
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = -421083173264942(0xfffe8106ef0961d2, double:NaN)
            java.lang.String r1 = "PendingExport(type="
            r0.<init>(r1)
            java.lang.String r1 = r4.f8771
            r2 = -421169072610862(0xfffe80f2ef0961d2, double:NaN)
            r0.append(r1); r0.append(", typeName=")
            java.lang.String r1 = r4.f8772
            r2 = -421220612218414(0xfffe80e6ef0961d2, double:NaN)
            r0.append(r1); r0.append(", targetId=")
            java.lang.String r1 = r4.f8770
            r2 = -421272151825966(0xfffe80daef0961d2, double:NaN)
            r0.append(r1); r0.append(", targetName=")
            java.lang.String r4 = r4.f8769
            r1 = 41
            java.lang.String r4 = defpackage.AbstractC0225.m823(r0, r4, r1)
            return r4
    }
}
