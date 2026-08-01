package defpackage;

/* JADX INFO: renamed from: ᛳᲁᛱᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0552 {

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final java.lang.String f2723;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final int f2724;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final boolean f2725;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final java.lang.String f2726;

    public C0552(java.lang.String r3, int r4, int r5, java.lang.String r6, boolean r7) {
            r2 = this;
            r0 = r5 & 2
            r1 = 0
            if (r0 == 0) goto L6
            r3 = r1
        L6:
            r0 = r5 & 4
            if (r0 == 0) goto Lb
            r4 = 0
        Lb:
            r5 = r5 & 8
            if (r5 == 0) goto L10
            r6 = r1
        L10:
            r2.<init>()
            r2.f2725 = r7
            r2.f2726 = r3
            r2.f2724 = r4
            r2.f2723 = r6
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L2f
        L3:
            boolean r0 = r3 instanceof defpackage.C0552
            if (r0 != 0) goto L8
            goto L2d
        L8:
            ᛳᲁᛱᛷ r3 = (defpackage.C0552) r3
            boolean r0 = r2.f2725
            boolean r1 = r3.f2725
            if (r0 == r1) goto L11
            goto L2d
        L11:
            java.lang.String r0 = r2.f2726
            java.lang.String r1 = r3.f2726
            boolean r0 = defpackage.AbstractC0498.m1280(r0, r1)
            if (r0 != 0) goto L1c
            goto L2d
        L1c:
            int r0 = r2.f2724
            int r1 = r3.f2724
            if (r0 == r1) goto L23
            goto L2d
        L23:
            java.lang.String r2 = r2.f2723
            java.lang.String r3 = r3.f2723
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
            r4 = this;
            boolean r0 = r4.f2725
            int r0 = java.lang.Boolean.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            r2 = 0
            java.lang.String r3 = r4.f2726
            if (r3 != 0) goto L10
            r3 = r2
            goto L14
        L10:
            int r3 = r3.hashCode()
        L14:
            int r0 = r0 + r3
            int r0 = r0 * r1
            int r3 = r4.f2724
            int r0 = defpackage.AbstractC0225.m820(r3, r0, r1)
            java.lang.String r4 = r4.f2723
            if (r4 != 0) goto L21
            goto L25
        L21:
            int r2 = r4.hashCode()
        L25:
            int r0 = r0 + r2
            return r0
    }

    public final java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = -1156252725321262(0xfffbe464ef0961d2, double:NaN)
            java.lang.String r1 = "ConvertResult(success="
            r0.<init>(r1)
            boolean r1 = r4.f2725
            r0.append(r1)
            r1 = -1156351509569070(0xfffbe44def0961d2, double:NaN)
            java.lang.String r1 = ", outputPath="
            r0.append(r1)
            java.lang.String r1 = r4.f2726
            r2 = -1156411639111214(0xfffbe43fef0961d2, double:NaN)
            r0.append(r1); r0.append(", frameCount=")
            int r1 = r4.f2724
            r2 = -1156471768653358(0xfffbe431ef0961d2, double:NaN)
            r0.append(r1); r0.append(", errorMessage=")
            java.lang.String r4 = r4.f2723
            r1 = 41
            java.lang.String r4 = defpackage.AbstractC0225.m823(r0, r4, r1)
            return r4
    }
}
