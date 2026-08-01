package defpackage;

/* JADX INFO: renamed from: ᲁᲁᛱᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1921 {

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public java.lang.Class f8359;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public java.lang.Class f8360;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public java.lang.Class f8361;

    public C1921(java.lang.Class r1, java.lang.Class r2, java.lang.Class r3) {
            r0 = this;
            r0.<init>()
            r0.f8360 = r1
            r0.f8361 = r2
            r0.f8359 = r3
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L34
            java.lang.Class<ᲁᲁᛱᛲ> r2 = defpackage.C1921.class
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L10
            goto L34
        L10:
            ᲁᲁᛱᛲ r5 = (defpackage.C1921) r5
            java.lang.Class r2 = r4.f8360
            java.lang.Class r3 = r5.f8360
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L1d
            return r1
        L1d:
            java.lang.Class r2 = r4.f8361
            java.lang.Class r3 = r5.f8361
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L28
            return r1
        L28:
            java.lang.Class r4 = r4.f8359
            java.lang.Class r5 = r5.f8359
            boolean r4 = defpackage.AbstractC1754.m3144(r4, r5)
            if (r4 != 0) goto L33
            return r1
        L33:
            return r0
        L34:
            return r1
    }

    public final int hashCode() {
            r2 = this;
            java.lang.Class r0 = r2.f8360
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.lang.Class r1 = r2.f8361
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.Class r2 = r2.f8359
            if (r2 == 0) goto L1a
            int r2 = r2.hashCode()
            goto L1b
        L1a:
            r2 = 0
        L1b:
            int r1 = r1 + r2
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "MultiClassKey{first="
            r0.<init>(r1)
            java.lang.Class r1 = r2.f8360
            r0.append(r1)
            java.lang.String r1 = ", second="
            r0.append(r1)
            java.lang.Class r2 = r2.f8361
            r0.append(r2)
            r2 = 125(0x7d, float:1.75E-43)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
