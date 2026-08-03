package u2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f13347a;

    public /* synthetic */ j(long r1) {
            r0 = this;
            r0.<init>()
            r0.f13347a = r1
            return
    }

    public static long a(int r4, int r5, long r6, int r8) {
            r0 = r8 & 1
            r1 = 32
            if (r0 == 0) goto L9
            long r2 = r6 >> r1
            int r4 = (int) r2
        L9:
            r8 = r8 & 2
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            if (r8 == 0) goto L15
            long r5 = r6 & r2
            int r5 = (int) r5
        L15:
            long r6 = (long) r4
            long r6 = r6 << r1
            long r4 = (long) r5
            long r4 = r4 & r2
            long r4 = r4 | r6
            return r4
    }

    public static final boolean b(long r0, long r2) {
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    public static final long c(long r4, long r6) {
            r0 = 32
            long r1 = r4 >> r0
            int r1 = (int) r1
            long r2 = r6 >> r0
            int r2 = (int) r2
            int r1 = r1 - r2
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r4 = r4 & r2
            int r4 = (int) r4
            long r5 = r6 & r2
            int r5 = (int) r5
            int r4 = r4 - r5
            long r5 = (long) r1
            long r5 = r5 << r0
            long r0 = (long) r4
            long r0 = r0 & r2
            long r4 = r5 | r0
            return r4
    }

    public static final long d(long r4, long r6) {
            r0 = 32
            long r1 = r4 >> r0
            int r1 = (int) r1
            long r2 = r6 >> r0
            int r2 = (int) r2
            int r1 = r1 + r2
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r4 = r4 & r2
            int r4 = (int) r4
            long r5 = r6 & r2
            int r5 = (int) r5
            int r4 = r4 + r5
            long r5 = (long) r1
            long r5 = r5 << r0
            long r0 = (long) r4
            long r0 = r0 & r2
            long r4 = r5 | r0
            return r4
    }

    public static java.lang.String e(long r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "("
            r0.<init>(r1)
            r1 = 32
            long r1 = r3 >> r1
            int r1 = (int) r1
            r0.append(r1)
            java.lang.String r1 = ", "
            r0.append(r1)
            r1 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r3 = r3 & r1
            int r3 = (int) r3
            r4 = 41
            java.lang.String r3 = p.a.n(r0, r3, r4)
            return r3
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            boolean r0 = r5 instanceof u2.j
            if (r0 != 0) goto L5
            goto Lf
        L5:
            u2.j r5 = (u2.j) r5
            long r0 = r5.f13347a
            long r2 = r4.f13347a
            int r5 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r5 == 0) goto L11
        Lf:
            r5 = 0
            return r5
        L11:
            r5 = 1
            return r5
    }

    public final int hashCode() {
            r2 = this;
            long r0 = r2.f13347a
            int r0 = java.lang.Long.hashCode(r0)
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            long r0 = r2.f13347a
            java.lang.String r0 = e(r0)
            return r0
    }
}
