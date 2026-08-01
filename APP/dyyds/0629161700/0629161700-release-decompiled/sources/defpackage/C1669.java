package defpackage;

/* JADX INFO: renamed from: ᲀᛵᛳᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1669 {

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public int f7451;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public java.lang.Object f7452;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public int f7453;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public int f7454;

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            goto L4d
        L4:
            boolean r1 = r4 instanceof defpackage.C1669
            if (r1 != 0) goto L9
            goto L4b
        L9:
            ᲀᛵᛳᛵ r4 = (defpackage.C1669) r4
            int r1 = r3.f7453
            int r2 = r4.f7453
            if (r1 == r2) goto L12
            goto L4b
        L12:
            r2 = 8
            if (r1 != r2) goto L2e
            int r1 = r3.f7451
            int r2 = r3.f7454
            int r1 = r1 - r2
            int r1 = java.lang.Math.abs(r1)
            if (r1 != r0) goto L2e
            int r1 = r3.f7451
            int r2 = r4.f7454
            if (r1 != r2) goto L2e
            int r1 = r3.f7454
            int r2 = r4.f7451
            if (r1 != r2) goto L2e
            goto L4d
        L2e:
            int r1 = r3.f7451
            int r2 = r4.f7451
            if (r1 == r2) goto L35
            goto L4b
        L35:
            int r1 = r3.f7454
            int r2 = r4.f7454
            if (r1 == r2) goto L3c
            goto L4b
        L3c:
            java.lang.Object r3 = r3.f7452
            java.lang.Object r4 = r4.f7452
            if (r3 == 0) goto L49
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L4d
            goto L4b
        L49:
            if (r4 == 0) goto L4d
        L4b:
            r3 = 0
            return r3
        L4d:
            return r0
    }

    public final int hashCode() {
            r2 = this;
            int r0 = r2.f7453
            int r0 = r0 * 31
            int r1 = r2.f7454
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r2 = r2.f7451
            int r0 = r0 + r2
            return r0
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = java.lang.System.identityHashCode(r3)
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
            java.lang.String r1 = "["
            r0.append(r1)
            int r1 = r3.f7453
            r2 = 1
            if (r1 == r2) goto L30
            r2 = 2
            if (r1 == r2) goto L2d
            r2 = 4
            if (r1 == r2) goto L2a
            r2 = 8
            if (r1 == r2) goto L27
            java.lang.String r1 = "??"
            goto L32
        L27:
            java.lang.String r1 = "mv"
            goto L32
        L2a:
            java.lang.String r1 = "up"
            goto L32
        L2d:
            java.lang.String r1 = "rm"
            goto L32
        L30:
            java.lang.String r1 = "add"
        L32:
            r0.append(r1)
            java.lang.String r1 = ",s:"
            r0.append(r1)
            int r1 = r3.f7454
            r0.append(r1)
            java.lang.String r1 = "c:"
            r0.append(r1)
            int r1 = r3.f7451
            r0.append(r1)
            java.lang.String r1 = ",p:"
            r0.append(r1)
            java.lang.Object r3 = r3.f7452
            r0.append(r3)
            java.lang.String r3 = "]"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }
}
