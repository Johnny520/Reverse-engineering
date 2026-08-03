package u2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f13338a;

    public /* synthetic */ a(long r1) {
            r0 = this;
            r0.<init>()
            r0.f13338a = r1
            return
    }

    public static long a(long r1, int r3, int r4, int r5, int r6, int r7) {
            r0 = r7 & 1
            if (r0 == 0) goto L8
            int r3 = j(r1)
        L8:
            r0 = r7 & 2
            if (r0 == 0) goto L10
            int r4 = h(r1)
        L10:
            r0 = r7 & 4
            if (r0 == 0) goto L18
            int r5 = i(r1)
        L18:
            r7 = r7 & 8
            if (r7 == 0) goto L20
            int r6 = g(r1)
        L20:
            if (r4 < r3) goto L29
            if (r6 < r5) goto L29
            if (r3 < 0) goto L29
            if (r5 < 0) goto L29
            goto L2e
        L29:
            java.lang.String r1 = "maxWidth must be >= than minWidth,\nmaxHeight must be >= than minHeight,\nminWidth and minHeight must be >= 0"
            u2.i.a(r1)
        L2e:
            long r1 = u2.b.h(r3, r4, r5, r6)
            return r1
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

    public static final boolean c(long r3) {
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

    public static final boolean d(long r5) {
            r0 = 3
            long r0 = r0 & r5
            int r0 = (int) r0
            r1 = r0 & 1
            r2 = 1
            int r1 = r1 << r2
            r0 = r0 & 2
            int r0 = r0 >> r2
            r3 = 3
            r4 = 13
            int r0 = p.a.g(r0, r3, r1, r4)
            int r0 = r2 << r0
            int r0 = r0 - r2
            r1 = 33
            long r5 = r5 >> r1
            int r5 = (int) r5
            r5 = r5 & r0
            if (r5 == 0) goto L1d
            return r2
        L1d:
            r5 = 0
            return r5
    }

    public static final boolean e(long r5) {
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

    public static final boolean f(long r6) {
            r0 = 3
            long r0 = r0 & r6
            int r0 = (int) r0
            r1 = r0 & 1
            r2 = 1
            int r1 = r1 << r2
            r3 = 2
            r0 = r0 & r3
            int r0 = r0 >> r2
            r4 = 3
            r5 = 13
            int r0 = p.a.g(r0, r4, r1, r5)
            int r0 = r2 << r0
            int r0 = r0 - r2
            long r3 = r6 >> r3
            int r1 = (int) r3
            r1 = r1 & r0
            r3 = 33
            long r6 = r6 >> r3
            int r6 = (int) r6
            r6 = r6 & r0
            if (r6 != 0) goto L24
            r6 = 2147483647(0x7fffffff, float:NaN)
            goto L25
        L24:
            int r6 = r6 - r2
        L25:
            if (r1 != r6) goto L28
            return r2
        L28:
            r6 = 0
            return r6
    }

    public static final int g(long r3) {
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

    public static final int h(long r5) {
            r0 = 3
            long r0 = r0 & r5
            int r0 = (int) r0
            r1 = r0 & 1
            r2 = 1
            int r1 = r1 << r2
            r0 = r0 & 2
            int r0 = r0 >> r2
            r3 = 3
            r4 = 13
            int r0 = p.a.g(r0, r3, r1, r4)
            int r0 = r2 << r0
            int r0 = r0 - r2
            r1 = 33
            long r5 = r5 >> r1
            int r5 = (int) r5
            r5 = r5 & r0
            if (r5 != 0) goto L20
            r5 = 2147483647(0x7fffffff, float:NaN)
            return r5
        L20:
            int r5 = r5 - r2
            return r5
    }

    public static final int i(long r3) {
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

    public static final int j(long r6) {
            r0 = 3
            long r0 = r0 & r6
            int r0 = (int) r0
            r1 = r0 & 1
            r2 = 1
            int r1 = r1 << r2
            r3 = 2
            r0 = r0 & r3
            int r0 = r0 >> r2
            r4 = 3
            r5 = 13
            int r0 = p.a.g(r0, r4, r1, r5)
            int r0 = r2 << r0
            int r0 = r0 - r2
            long r6 = r6 >> r3
            int r6 = (int) r6
            r6 = r6 & r0
            return r6
    }

    public static java.lang.String k(long r4) {
            int r0 = h(r4)
            java.lang.String r1 = "Infinity"
            r2 = 2147483647(0x7fffffff, float:NaN)
            if (r0 != r2) goto Ld
            r0 = r1
            goto L11
        Ld:
            java.lang.String r0 = java.lang.String.valueOf(r0)
        L11:
            int r3 = g(r4)
            if (r3 != r2) goto L18
            goto L1c
        L18:
            java.lang.String r1 = java.lang.String.valueOf(r3)
        L1c:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Constraints(minWidth = "
            r2.<init>(r3)
            int r3 = j(r4)
            r2.append(r3)
            java.lang.String r3 = ", maxWidth = "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = ", minHeight = "
            r2.append(r0)
            int r4 = i(r4)
            r2.append(r4)
            java.lang.String r4 = ", maxHeight = "
            r2.append(r4)
            r4 = 41
            java.lang.String r4 = eh.a.q(r2, r1, r4)
            return r4
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            boolean r0 = r5 instanceof u2.a
            if (r0 != 0) goto L5
            goto Lf
        L5:
            u2.a r5 = (u2.a) r5
            long r0 = r5.f13338a
            long r2 = r4.f13338a
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
            long r0 = r2.f13338a
            int r0 = java.lang.Long.hashCode(r0)
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            long r0 = r2.f13338a
            java.lang.String r0 = k(r0)
            return r0
    }
}
