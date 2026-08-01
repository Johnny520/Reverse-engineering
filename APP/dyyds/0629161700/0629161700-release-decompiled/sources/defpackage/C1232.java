package defpackage;

/* JADX INFO: renamed from: ᛷᛲᲁᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1232 {

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final java.lang.Object[] f5533;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final defpackage.C1100 f5534;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final java.lang.String f5535;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final java.lang.String f5536;

    public C1232(java.lang.String r1, java.lang.String r2, defpackage.C1100 r3, java.lang.Object... r4) {
            r0 = this;
            r0.<init>()
            r0.f5535 = r1
            r0.f5536 = r2
            r0.f5534 = r3
            r0.f5533 = r4
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r3 != r2) goto L3
            goto L32
        L3:
            boolean r0 = r3 instanceof defpackage.C1232
            if (r0 != 0) goto L8
            goto L34
        L8:
            ᛷᛲᲁᲇ r3 = (defpackage.C1232) r3
            java.lang.String r0 = r2.f5535
            java.lang.String r1 = r3.f5535
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L34
            java.lang.String r0 = r2.f5536
            java.lang.String r1 = r3.f5536
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L34
            ᛶᛶᲇᛲ r0 = r2.f5534
            ᛶᛶᲇᛲ r1 = r3.f5534
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L34
            java.lang.Object[] r2 = r2.f5533
            java.lang.Object[] r3 = r3.f5533
            boolean r2 = java.util.Arrays.equals(r2, r3)
            if (r2 == 0) goto L34
        L32:
            r2 = 1
            return r2
        L34:
            r2 = 0
            return r2
    }

    public final int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.f5535
            int r0 = r0.hashCode()
            java.lang.String r1 = r3.f5536
            int r1 = r1.hashCode()
            r2 = 8
            int r1 = java.lang.Integer.rotateLeft(r1, r2)
            r0 = r0 ^ r1
            ᛶᛶᲇᛲ r1 = r3.f5534
            int r1 = r1.hashCode()
            r2 = 16
            int r1 = java.lang.Integer.rotateLeft(r1, r2)
            r0 = r0 ^ r1
            java.lang.Object[] r3 = r3.f5533
            int r3 = java.util.Arrays.hashCode(r3)
            r1 = 24
            int r3 = java.lang.Integer.rotateLeft(r3, r1)
            r3 = r3 ^ r0
            return r3
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.Object[] r0 = r3.f5533
            java.lang.String r0 = java.util.Arrays.toString(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r3.f5535
            r1.append(r2)
            java.lang.String r2 = " : "
            r1.append(r2)
            java.lang.String r2 = r3.f5536
            r1.append(r2)
            java.lang.String r2 = " "
            r1.append(r2)
            ᛶᛶᲇᛲ r3 = r3.f5534
            r1.append(r3)
            r1.append(r2)
            r1.append(r0)
            java.lang.String r3 = r1.toString()
            return r3
    }
}
