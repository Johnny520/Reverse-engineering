package f;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class p implements java.lang.Cloneable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public /* synthetic */ boolean f2878g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public /* synthetic */ long[] f2879h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ java.lang.Object[] f2880i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public /* synthetic */ int f2881j;

    public /* synthetic */ p() {
            r1 = this;
            r0 = 10
            r1.<init>(r0)
            return
    }

    public p(int r3) {
            r2 = this;
            r2.<init>()
            if (r3 != 0) goto Le
            long[] r3 = g.a.f3961b
            r2.f2879h = r3
            java.lang.Object[] r3 = g.a.f3962c
            r2.f2880i = r3
            return
        Le:
            int r3 = r3 * 8
            r0 = 4
        L11:
            r1 = 32
            if (r0 >= r1) goto L20
            r1 = 1
            int r1 = r1 << r0
            int r1 = r1 + (-12)
            if (r3 > r1) goto L1d
            r3 = r1
            goto L20
        L1d:
            int r0 = r0 + 1
            goto L11
        L20:
            int r3 = r3 / 8
            long[] r0 = new long[r3]
            r2.f2879h = r0
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r2.f2880i = r3
            return
    }

    public final long a(int r10) {
            r9 = this;
            if (r10 < 0) goto L32
            int r0 = r9.f2881j
            if (r10 >= r0) goto L32
            boolean r1 = r9.f2878g
            if (r1 == 0) goto L2d
            long[] r1 = r9.f2879h
            java.lang.Object[] r2 = r9.f2880i
            r3 = 0
            r4 = r3
            r5 = r4
        L11:
            if (r4 >= r0) goto L29
            r6 = r2[r4]
            java.lang.Object r7 = f.q.f2884a
            if (r6 == r7) goto L26
            if (r4 == r5) goto L24
            r7 = r1[r4]
            r1[r5] = r7
            r2[r5] = r6
            r6 = 0
            r2[r4] = r6
        L24:
            int r5 = r5 + 1
        L26:
            int r4 = r4 + 1
            goto L11
        L29:
            r9.f2878g = r3
            r9.f2881j = r5
        L2d:
            long[] r0 = r9.f2879h
            r1 = r0[r10]
            return r1
        L32:
            java.lang.String r0 = "Expected index to be within 0..size()-1, but was "
            java.lang.String r10 = eh.a.l(r10, r0)
            j8.o.t(r10)
            r0 = 0
            return r0
    }

    public final void b(java.lang.Object r11, long r12) {
            r10 = this;
            java.lang.Object r0 = f.q.f2884a
            long[] r1 = r10.f2879h
            int r2 = r10.f2881j
            int r1 = g.a.b(r1, r2, r12)
            if (r1 < 0) goto L11
            java.lang.Object[] r12 = r10.f2880i
            r12[r1] = r11
            return
        L11:
            int r1 = ~r1
            int r2 = r10.f2881j
            if (r1 >= r2) goto L23
            java.lang.Object[] r3 = r10.f2880i
            r4 = r3[r1]
            if (r4 != r0) goto L23
            long[] r0 = r10.f2879h
            r0[r1] = r12
            r3[r1] = r11
            return
        L23:
            boolean r3 = r10.f2878g
            if (r3 == 0) goto L52
            long[] r3 = r10.f2879h
            int r4 = r3.length
            if (r2 < r4) goto L52
            java.lang.Object[] r1 = r10.f2880i
            r4 = 0
            r5 = r4
            r6 = r5
        L31:
            if (r5 >= r2) goto L47
            r7 = r1[r5]
            if (r7 == r0) goto L44
            if (r5 == r6) goto L42
            r8 = r3[r5]
            r3[r6] = r8
            r1[r6] = r7
            r7 = 0
            r1[r5] = r7
        L42:
            int r6 = r6 + 1
        L44:
            int r5 = r5 + 1
            goto L31
        L47:
            r10.f2878g = r4
            r10.f2881j = r6
            long[] r0 = r10.f2879h
            int r0 = g.a.b(r0, r6, r12)
            int r1 = ~r0
        L52:
            int r0 = r10.f2881j
            long[] r2 = r10.f2879h
            int r2 = r2.length
            r3 = 1
            if (r0 < r2) goto L7f
            int r0 = r0 + r3
            int r0 = r0 * 8
            r2 = 4
        L5e:
            r4 = 32
            if (r2 >= r4) goto L6d
            int r4 = r3 << r2
            int r4 = r4 + (-12)
            if (r0 > r4) goto L6a
            r0 = r4
            goto L6d
        L6a:
            int r2 = r2 + 1
            goto L5e
        L6d:
            int r0 = r0 / 8
            long[] r2 = r10.f2879h
            long[] r2 = java.util.Arrays.copyOf(r2, r0)
            r10.f2879h = r2
            java.lang.Object[] r2 = r10.f2880i
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r2, r0)
            r10.f2880i = r0
        L7f:
            int r0 = r10.f2881j
            int r2 = r0 - r1
            if (r2 == 0) goto L93
            long[] r2 = r10.f2879h
            int r4 = r1 + 1
            tf.l.q0(r2, r2, r4, r1, r0)
            java.lang.Object[] r0 = r10.f2880i
            int r2 = r10.f2881j
            tf.l.n0(r4, r1, r0, r2, r0)
        L93:
            long[] r0 = r10.f2879h
            r0[r1] = r12
            java.lang.Object[] r12 = r10.f2880i
            r12[r1] = r11
            int r11 = r10.f2881j
            int r11 = r11 + r3
            r10.f2881j = r11
            return
    }

    public final void c(long r3) {
            r2 = this;
            long[] r0 = r2.f2879h
            int r1 = r2.f2881j
            int r3 = g.a.b(r0, r1, r3)
            if (r3 < 0) goto L17
            java.lang.Object[] r4 = r2.f2880i
            r0 = r4[r3]
            java.lang.Object r1 = f.q.f2884a
            if (r0 == r1) goto L17
            r4[r3] = r1
            r3 = 1
            r2.f2878g = r3
        L17:
            return
    }

    public final java.lang.Object clone() {
            r2 = this;
            java.lang.Object r0 = super.clone()
            r0.getClass()
            f.p r0 = (f.p) r0
            long[] r1 = r2.f2879h
            java.lang.Object r1 = r1.clone()
            long[] r1 = (long[]) r1
            r0.f2879h = r1
            java.lang.Object[] r1 = r2.f2880i
            java.lang.Object r1 = r1.clone()
            java.lang.Object[] r1 = (java.lang.Object[]) r1
            r0.f2880i = r1
            return r0
    }

    public final int d() {
            r9 = this;
            boolean r0 = r9.f2878g
            if (r0 == 0) goto L29
            int r0 = r9.f2881j
            long[] r1 = r9.f2879h
            java.lang.Object[] r2 = r9.f2880i
            r3 = 0
            r4 = r3
            r5 = r4
        Ld:
            if (r4 >= r0) goto L25
            r6 = r2[r4]
            java.lang.Object r7 = f.q.f2884a
            if (r6 == r7) goto L22
            if (r4 == r5) goto L20
            r7 = r1[r4]
            r1[r5] = r7
            r2[r5] = r6
            r6 = 0
            r2[r4] = r6
        L20:
            int r5 = r5 + 1
        L22:
            int r4 = r4 + 1
            goto Ld
        L25:
            r9.f2878g = r3
            r9.f2881j = r5
        L29:
            int r0 = r9.f2881j
            return r0
    }

    public final java.lang.Object e(int r10) {
            r9 = this;
            if (r10 < 0) goto L32
            int r0 = r9.f2881j
            if (r10 >= r0) goto L32
            boolean r1 = r9.f2878g
            if (r1 == 0) goto L2d
            long[] r1 = r9.f2879h
            java.lang.Object[] r2 = r9.f2880i
            r3 = 0
            r4 = r3
            r5 = r4
        L11:
            if (r4 >= r0) goto L29
            r6 = r2[r4]
            java.lang.Object r7 = f.q.f2884a
            if (r6 == r7) goto L26
            if (r4 == r5) goto L24
            r7 = r1[r4]
            r1[r5] = r7
            r2[r5] = r6
            r6 = 0
            r2[r4] = r6
        L24:
            int r5 = r5 + 1
        L26:
            int r4 = r4 + 1
            goto L11
        L29:
            r9.f2878g = r3
            r9.f2881j = r5
        L2d:
            java.lang.Object[] r0 = r9.f2880i
            r10 = r0[r10]
            return r10
        L32:
            java.lang.String r0 = "Expected index to be within 0..size()-1, but was "
            java.lang.String r10 = eh.a.l(r10, r0)
            j8.o.t(r10)
            r10 = 0
            return r10
    }

    public final java.lang.String toString() {
            r5 = this;
            int r0 = r5.d()
            if (r0 > 0) goto L9
            java.lang.String r0 = "{}"
            return r0
        L9:
            int r0 = r5.f2881j
            int r0 = r0 * 28
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r0 = 123(0x7b, float:1.72E-43)
            r1.append(r0)
            int r0 = r5.f2881j
            r2 = 0
        L1a:
            if (r2 >= r0) goto L41
            if (r2 <= 0) goto L23
            java.lang.String r3 = ", "
            r1.append(r3)
        L23:
            long r3 = r5.a(r2)
            r1.append(r3)
            r3 = 61
            r1.append(r3)
            java.lang.Object r3 = r5.e(r2)
            if (r3 == r1) goto L39
            r1.append(r3)
            goto L3e
        L39:
            java.lang.String r3 = "(this Map)"
            r1.append(r3)
        L3e:
            int r2 = r2 + 1
            goto L1a
        L41:
            r0 = 125(0x7d, float:1.75E-43)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
    }
}
