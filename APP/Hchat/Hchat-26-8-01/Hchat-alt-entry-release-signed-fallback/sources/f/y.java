package f;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f2923a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2924b;

    public /* synthetic */ y() {
            r1 = this;
            r0 = 16
            r1.<init>(r0)
            return
    }

    public y(int r1) {
            r0 = this;
            r0.<init>()
            if (r1 != 0) goto L8
            long[] r1 = f.o.f2876a
            goto La
        L8:
            long[] r1 = new long[r1]
        La:
            r0.f2923a = r1
            return
    }

    public final void a(long r4) {
            r3 = this;
            int r0 = r3.f2924b
            int r0 = r0 + 1
            long[] r1 = r3.f2923a
            int r2 = r1.length
            if (r2 >= r0) goto L18
            int r2 = r1.length
            int r2 = r2 * 3
            int r2 = r2 / 2
            int r0 = java.lang.Math.max(r0, r2)
            long[] r0 = java.util.Arrays.copyOf(r1, r0)
            r3.f2923a = r0
        L18:
            long[] r0 = r3.f2923a
            int r1 = r3.f2924b
            r0[r1] = r4
            int r1 = r1 + 1
            r3.f2924b = r1
            return
    }

    public final boolean equals(java.lang.Object r9) {
            r8 = this;
            boolean r0 = r9 instanceof f.y
            r1 = 0
            if (r0 == 0) goto L2c
            f.y r9 = (f.y) r9
            int r0 = r9.f2924b
            int r2 = r8.f2924b
            if (r0 == r2) goto Le
            goto L2c
        Le:
            long[] r0 = r8.f2923a
            long[] r9 = r9.f2923a
            lg.d r2 = r9.e0.r0(r1, r2)
            int r3 = r2.f8042g
            int r2 = r2.f8043h
            if (r3 > r2) goto L2a
        L1c:
            r4 = r0[r3]
            r6 = r9[r3]
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L25
            return r1
        L25:
            if (r3 == r2) goto L2a
            int r3 = r3 + 1
            goto L1c
        L2a:
            r9 = 1
            return r9
        L2c:
            return r1
    }

    public final int hashCode() {
            r6 = this;
            long[] r0 = r6.f2923a
            int r1 = r6.f2924b
            r2 = 0
            r3 = r2
        L6:
            if (r2 >= r1) goto L14
            r4 = r0[r2]
            int r4 = java.lang.Long.hashCode(r4)
            int r4 = r4 * 31
            int r3 = r3 + r4
            int r2 = r2 + 1
            goto L6
        L14:
            return r3
    }

    public final java.lang.String toString() {
            r7 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "["
            r0.append(r1)
            long[] r1 = r7.f2923a
            int r2 = r7.f2924b
            r3 = 0
        Lf:
            if (r3 >= r2) goto L29
            r4 = r1[r3]
            r6 = -1
            if (r3 != r6) goto L1c
            java.lang.String r1 = "..."
            r0.append(r1)
            goto L2e
        L1c:
            if (r3 == 0) goto L23
            java.lang.String r6 = ", "
            r0.append(r6)
        L23:
            r0.append(r4)
            int r3 = r3 + 1
            goto Lf
        L29:
            java.lang.String r1 = "]"
            r0.append(r1)
        L2e:
            java.lang.String r0 = r0.toString()
            return r0
    }
}
