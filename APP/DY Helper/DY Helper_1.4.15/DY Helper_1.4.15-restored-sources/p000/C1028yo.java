package p000;

/* JADX INFO: renamed from: yo */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C1028yo {

    /* JADX INFO: renamed from: α */
    public final long f12706;

    public /* synthetic */ C1028yo(long r1) {
            r0 = this;
            r0.<init>()
            r0.f12706 = r1
            return
    }

    /* JADX INFO: renamed from: α */
    public static long m6946(int r1, int r2, long r3) {
            int r0 = m6953(r3)
            int r3 = m6952(r3)
            if (r0 < r1) goto L11
            if (r3 < r2) goto L11
            if (r1 < 0) goto L11
            if (r2 < 0) goto L11
            goto L16
        L11:
            java.lang.String r4 = "maxWidth must be >= than minWidth,\nmaxHeight must be >= than minHeight,\nminWidth and minHeight must be >= 0"
            p000.cm0.m1265(r4)
        L16:
            long r1 = p000.AbstractC1065zo.m7213(r1, r0, r2, r3)
            return r1
    }

    /* JADX INFO: renamed from: β */
    public static final boolean m6947(long r0, long r2) {
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: γ */
    public static final boolean m6948(long r3) {
            r0 = 3
            long r0 = r0 & r3
            int r0 = (int) r0
            r1 = r0 & 1
            r2 = 1
            int r1 = r1 << r2
            r0 = r0 & 2
            int r0 = r0 >> r2
            int r0 = r0 * 3
            int r0 = r0 + r1
            int r1 = 18 - r0
            int r1 = r2 << r1
            int r1 = r1 - r2
            int r0 = r0 + 46
            long r3 = r3 >> r0
            int r3 = (int) r3
            r3 = r3 & r1
            if (r3 == 0) goto L1b
            return r2
        L1b:
            r3 = 0
            return r3
    }

    /* JADX INFO: renamed from: δ */
    public static final boolean m6949(long r3) {
            r0 = 3
            long r0 = r0 & r3
            int r0 = (int) r0
            r1 = r0 & 1
            r2 = 1
            int r1 = r1 << r2
            r0 = r0 & 2
            int r0 = r0 >> r2
            int r0 = r0 * 3
            int r0 = r0 + r1
            int r0 = r0 + 13
            int r0 = r2 << r0
            int r0 = r0 - r2
            r1 = 33
            long r3 = r3 >> r1
            int r3 = (int) r3
            r3 = r3 & r0
            if (r3 == 0) goto L1b
            return r2
        L1b:
            r3 = 0
            return r3
    }

    /* JADX INFO: renamed from: ε */
    public static final boolean m6950(long r5) {
            r0 = 3
            long r0 = r0 & r5
            int r0 = (int) r0
            r1 = r0 & 1
            r2 = 1
            int r1 = r1 << r2
            r0 = r0 & 2
            int r0 = r0 >> r2
            int r0 = r0 * 3
            int r0 = r0 + r1
            int r1 = 18 - r0
            int r1 = r2 << r1
            int r1 = r1 - r2
            int r3 = r0 + 15
            long r3 = r5 >> r3
            int r3 = (int) r3
            r3 = r3 & r1
            int r0 = r0 + 46
            long r5 = r5 >> r0
            int r5 = (int) r5
            r5 = r5 & r1
            if (r5 != 0) goto L24
            r5 = 2147483647(0x7fffffff, float:NaN)
            goto L25
        L24:
            int r5 = r5 - r2
        L25:
            if (r3 != r5) goto L28
            return r2
        L28:
            r5 = 0
            return r5
    }

    /* JADX INFO: renamed from: ζ */
    public static final boolean m6951(long r5) {
            r0 = 3
            long r0 = r0 & r5
            int r0 = (int) r0
            r1 = r0 & 1
            r2 = 1
            int r1 = r1 << r2
            r3 = 2
            r0 = r0 & r3
            int r0 = r0 >> r2
            int r0 = r0 * 3
            int r0 = r0 + r1
            int r0 = r0 + 13
            int r0 = r2 << r0
            int r0 = r0 - r2
            long r3 = r5 >> r3
            int r1 = (int) r3
            r1 = r1 & r0
            r3 = 33
            long r5 = r5 >> r3
            int r5 = (int) r5
            r5 = r5 & r0
            if (r5 != 0) goto L22
            r5 = 2147483647(0x7fffffff, float:NaN)
            goto L23
        L22:
            int r5 = r5 - r2
        L23:
            if (r1 != r5) goto L26
            return r2
        L26:
            r5 = 0
            return r5
    }

    /* JADX INFO: renamed from: η */
    public static final int m6952(long r3) {
            r0 = 3
            long r0 = r0 & r3
            int r0 = (int) r0
            r1 = r0 & 1
            r2 = 1
            int r1 = r1 << r2
            r0 = r0 & 2
            int r0 = r0 >> r2
            int r0 = r0 * 3
            int r0 = r0 + r1
            int r1 = 18 - r0
            int r1 = r2 << r1
            int r1 = r1 - r2
            int r0 = r0 + 46
            long r3 = r3 >> r0
            int r3 = (int) r3
            r3 = r3 & r1
            if (r3 != 0) goto L1e
            r3 = 2147483647(0x7fffffff, float:NaN)
            return r3
        L1e:
            int r3 = r3 - r2
            return r3
    }

    /* JADX INFO: renamed from: θ */
    public static final int m6953(long r3) {
            r0 = 3
            long r0 = r0 & r3
            int r0 = (int) r0
            r1 = r0 & 1
            r2 = 1
            int r1 = r1 << r2
            r0 = r0 & 2
            int r0 = r0 >> r2
            int r0 = r0 * 3
            int r0 = r0 + r1
            int r0 = r0 + 13
            int r0 = r2 << r0
            int r0 = r0 - r2
            r1 = 33
            long r3 = r3 >> r1
            int r3 = (int) r3
            r3 = r3 & r0
            if (r3 != 0) goto L1e
            r3 = 2147483647(0x7fffffff, float:NaN)
            return r3
        L1e:
            int r3 = r3 - r2
            return r3
    }

    /* JADX INFO: renamed from: ι */
    public static final int m6954(long r3) {
            r0 = 3
            long r0 = r0 & r3
            int r0 = (int) r0
            r1 = r0 & 1
            r2 = 1
            int r1 = r1 << r2
            r0 = r0 & 2
            int r0 = r0 >> r2
            int r0 = r0 * 3
            int r0 = r0 + r1
            int r1 = 18 - r0
            int r1 = r2 << r1
            int r1 = r1 - r2
            int r0 = r0 + 15
            long r3 = r3 >> r0
            int r3 = (int) r3
            r3 = r3 & r1
            return r3
    }

    /* JADX INFO: renamed from: κ */
    public static final int m6955(long r4) {
            r0 = 3
            long r0 = r0 & r4
            int r0 = (int) r0
            r1 = r0 & 1
            r2 = 1
            int r1 = r1 << r2
            r3 = 2
            r0 = r0 & r3
            int r0 = r0 >> r2
            int r0 = r0 * 3
            int r0 = r0 + r1
            int r0 = r0 + 13
            int r0 = r2 << r0
            int r0 = r0 - r2
            long r4 = r4 >> r3
            int r4 = (int) r4
            r4 = r4 & r0
            return r4
    }

    /* JADX INFO: renamed from: λ */
    public static java.lang.String m6956(long r4) {
            int r0 = m6953(r4)
            java.lang.String r1 = "Infinity"
            r2 = 2147483647(0x7fffffff, float:NaN)
            if (r0 != r2) goto Ld
            r0 = r1
            goto L11
        Ld:
            java.lang.String r0 = java.lang.String.valueOf(r0)
        L11:
            int r3 = m6952(r4)
            if (r3 != r2) goto L18
            goto L1c
        L18:
            java.lang.String r1 = java.lang.String.valueOf(r3)
        L1c:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Constraints(minWidth = "
            r2.<init>(r3)
            int r3 = m6955(r4)
            r2.append(r3)
            java.lang.String r3 = ", maxWidth = "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = ", minHeight = "
            r2.append(r0)
            int r4 = m6954(r4)
            r2.append(r4)
            java.lang.String r4 = ", maxHeight = "
            r2.append(r4)
            r4 = 41
            java.lang.String r4 = p000.AbstractC0602nx.m4132(r2, r1, r4)
            return r4
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof p000.C1028yo
            if (r0 != 0) goto L5
            goto Lf
        L5:
            yo r3 = (p000.C1028yo) r3
            long r0 = r3.f12706
            long r2 = r2.f12706
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 == 0) goto L11
        Lf:
            r2 = 0
            return r2
        L11:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r2 = this;
            long r0 = r2.f12706
            int r2 = java.lang.Long.hashCode(r0)
            return r2
    }

    public final java.lang.String toString() {
            r2 = this;
            long r0 = r2.f12706
            java.lang.String r2 = m6956(r0)
            return r2
    }
}
