package f;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public java.lang.Object[] f2803a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2804b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public f.d0 f2805c;

    public /* synthetic */ f0() {
            r1 = this;
            r0 = 16
            r1.<init>(r0)
            return
    }

    public f0(int r1) {
            r0 = this;
            r0.<init>()
            if (r1 != 0) goto L8
            java.lang.Object[] r1 = f.p0.f2882a
            goto La
        L8:
            java.lang.Object[] r1 = new java.lang.Object[r1]
        La:
            r0.f2803a = r1
            return
    }

    public final void a(java.lang.Object r4) {
            r3 = this;
            int r0 = r3.f2804b
            int r0 = r0 + 1
            java.lang.Object[] r1 = r3.f2803a
            int r2 = r1.length
            if (r2 >= r0) goto Lc
            r3.m(r0, r1)
        Lc:
            java.lang.Object[] r0 = r3.f2803a
            int r1 = r3.f2804b
            r0[r1] = r4
            int r1 = r1 + 1
            r3.f2804b = r1
            return
    }

    public final void b(f.f0 r6) {
            r5 = this;
            r6.getClass()
            boolean r0 = r6.h()
            if (r0 == 0) goto La
            goto L2a
        La:
            int r0 = r5.f2804b
            int r1 = r6.f2804b
            int r0 = r0 + r1
            java.lang.Object[] r1 = r5.f2803a
            int r2 = r1.length
            if (r2 >= r0) goto L17
            r5.m(r0, r1)
        L17:
            java.lang.Object[] r0 = r5.f2803a
            java.lang.Object[] r1 = r6.f2803a
            int r2 = r5.f2804b
            int r3 = r6.f2804b
            r4 = 0
            tf.l.n0(r2, r4, r1, r3, r0)
            int r0 = r5.f2804b
            int r6 = r6.f2804b
            int r0 = r0 + r6
            r5.f2804b = r0
        L2a:
            return
    }

    public final void c(java.util.List r7) {
            r6 = this;
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L7
            goto L33
        L7:
            int r0 = r6.f2804b
            int r1 = r7.size()
            int r1 = r1 + r0
            java.lang.Object[] r2 = r6.f2803a
            int r3 = r2.length
            if (r3 >= r1) goto L16
            r6.m(r1, r2)
        L16:
            java.lang.Object[] r1 = r6.f2803a
            int r2 = r7.size()
            r3 = 0
        L1d:
            if (r3 >= r2) goto L2a
            int r4 = r3 + r0
            java.lang.Object r5 = r7.get(r3)
            r1[r4] = r5
            int r3 = r3 + 1
            goto L1d
        L2a:
            int r0 = r6.f2804b
            int r7 = r7.size()
            int r7 = r7 + r0
            r6.f2804b = r7
        L33:
            return
    }

    public final void d() {
            r4 = this;
            java.lang.Object[] r0 = r4.f2803a
            int r1 = r4.f2804b
            r2 = 0
            r3 = 0
            tf.l.v0(r2, r1, r3, r0)
            r4.f2804b = r2
            return
    }

    public final java.lang.Object e() {
            r2 = this;
            boolean r0 = r2.h()
            if (r0 != 0) goto Lc
            java.lang.Object[] r0 = r2.f2803a
            r1 = 0
            r0 = r0[r1]
            return r0
        Lc:
            java.lang.String r0 = "ObjectList is empty."
            j8.o.l(r0)
            r0 = 0
            return r0
    }

    public final boolean equals(java.lang.Object r7) {
            r6 = this;
            boolean r0 = r7 instanceof f.f0
            r1 = 0
            if (r0 == 0) goto L2e
            f.f0 r7 = (f.f0) r7
            int r0 = r7.f2804b
            int r2 = r6.f2804b
            if (r0 == r2) goto Le
            goto L2e
        Le:
            java.lang.Object[] r0 = r6.f2803a
            java.lang.Object[] r7 = r7.f2803a
            lg.d r2 = r9.e0.r0(r1, r2)
            int r3 = r2.f8042g
            int r2 = r2.f8043h
            if (r3 > r2) goto L2c
        L1c:
            r4 = r0[r3]
            r5 = r7[r3]
            boolean r4 = gg.l.a(r4, r5)
            if (r4 != 0) goto L27
            return r1
        L27:
            if (r3 == r2) goto L2c
            int r3 = r3 + 1
            goto L1c
        L2c:
            r7 = 1
            return r7
        L2e:
            return r1
    }

    public final java.lang.Object f(int r2) {
            r1 = this;
            if (r2 < 0) goto Lb
            int r0 = r1.f2804b
            if (r2 >= r0) goto Lb
            java.lang.Object[] r0 = r1.f2803a
            r2 = r0[r2]
            return r2
        Lb:
            r1.o(r2)
            r2 = 0
            throw r2
    }

    public final int g(java.lang.Object r5) {
            r4 = this;
            java.lang.Object[] r0 = r4.f2803a
            r1 = 0
            if (r5 != 0) goto L11
            int r5 = r4.f2804b
        L7:
            if (r1 >= r5) goto L21
            r2 = r0[r1]
            if (r2 != 0) goto Le
            return r1
        Le:
            int r1 = r1 + 1
            goto L7
        L11:
            int r2 = r4.f2804b
        L13:
            if (r1 >= r2) goto L21
            r3 = r0[r1]
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L1e
            return r1
        L1e:
            int r1 = r1 + 1
            goto L13
        L21:
            r5 = -1
            return r5
    }

    public final boolean h() {
            r1 = this;
            int r0 = r1.f2804b
            if (r0 != 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    public final int hashCode() {
            r6 = this;
            java.lang.Object[] r0 = r6.f2803a
            int r1 = r6.f2804b
            r2 = 0
            r3 = r2
            r4 = r3
        L7:
            if (r3 >= r1) goto L19
            r5 = r0[r3]
            if (r5 == 0) goto L12
            int r5 = r5.hashCode()
            goto L13
        L12:
            r5 = r2
        L13:
            int r5 = r5 * 31
            int r4 = r4 + r5
            int r3 = r3 + 1
            goto L7
        L19:
            return r4
    }

    public final boolean i() {
            r1 = this;
            int r0 = r1.f2804b
            if (r0 == 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    public final boolean j(java.lang.Object r1) {
            r0 = this;
            int r1 = r0.g(r1)
            if (r1 < 0) goto Lb
            r0.k(r1)
            r1 = 1
            return r1
        Lb:
            r1 = 0
            return r1
    }

    public final java.lang.Object k(int r6) {
            r5 = this;
            r0 = 0
            if (r6 < 0) goto L1d
            int r1 = r5.f2804b
            if (r6 >= r1) goto L1d
            java.lang.Object[] r2 = r5.f2803a
            r3 = r2[r6]
            int r4 = r1 + (-1)
            if (r6 == r4) goto L14
            int r4 = r6 + 1
            tf.l.n0(r6, r4, r2, r1, r2)
        L14:
            int r6 = r5.f2804b
            int r6 = r6 + (-1)
            r5.f2804b = r6
            r2[r6] = r0
            return r3
        L1d:
            r5.o(r6)
            throw r0
    }

    public final void l(int r4, int r5) {
            r3 = this;
            java.lang.String r0 = "Start ("
            if (r4 < 0) goto L44
            int r1 = r3.f2804b
            if (r4 > r1) goto L44
            if (r5 < 0) goto L44
            if (r5 > r1) goto L44
            if (r5 < r4) goto L25
            if (r5 == r4) goto L24
            if (r5 >= r1) goto L17
            java.lang.Object[] r0 = r3.f2803a
            tf.l.n0(r4, r5, r0, r1, r0)
        L17:
            int r0 = r3.f2804b
            int r5 = r5 - r4
            int r4 = r0 - r5
            java.lang.Object[] r5 = r3.f2803a
            r1 = 0
            tf.l.v0(r4, r0, r1, r5)
            r3.f2804b = r4
        L24:
            return
        L25:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r4)
            java.lang.String r4 = ") is more than end ("
            r1.append(r4)
            r1.append(r5)
            r4 = 41
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            r5.<init>(r4)
            throw r5
        L44:
            java.lang.String r1 = ") and end ("
            java.lang.String r2 = ") must be in 0.."
            java.lang.StringBuilder r4 = eh.a.s(r4, r5, r0, r1, r2)
            int r5 = r3.f2804b
            j8.o.e(r5, r4)
            return
    }

    public final void m(int r3, java.lang.Object[] r4) {
            r2 = this;
            r4.getClass()
            int r0 = r4.length
            int r1 = r0 * 3
            int r1 = r1 / 2
            int r3 = java.lang.Math.max(r3, r1)
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r1 = 0
            tf.l.n0(r1, r1, r4, r0, r3)
            r2.f2803a = r3
            return
    }

    public final java.lang.Object n(int r3, java.lang.Object r4) {
            r2 = this;
            if (r3 < 0) goto Ld
            int r0 = r2.f2804b
            if (r3 >= r0) goto Ld
            java.lang.Object[] r0 = r2.f2803a
            r1 = r0[r3]
            r0[r3] = r4
            return r1
        Ld:
            r2.o(r3)
            r3 = 0
            throw r3
    }

    public final void o(int r3) {
            r2 = this;
            java.lang.String r0 = "Index "
            java.lang.String r1 = " must be in 0.."
            java.lang.StringBuilder r3 = eh.a.t(r3, r0, r1)
            int r0 = r2.f2804b
            int r0 = r0 + (-1)
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            r0.<init>(r3)
            throw r0
    }

    public final void p(int r3) {
            r2 = this;
            java.lang.String r0 = "Index "
            java.lang.String r1 = " must be in 0.."
            java.lang.StringBuilder r3 = eh.a.t(r3, r0, r1)
            int r0 = r2.f2804b
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            r0.<init>(r3)
            throw r0
    }

    public final java.lang.String toString() {
            r7 = this;
            b1.f r0 = new b1.f
            r1 = 4
            r0.<init>(r7, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "["
            r1.<init>(r2)
            java.lang.Object[] r2 = r7.f2803a
            int r3 = r7.f2804b
            r4 = 0
        L12:
            if (r4 >= r3) goto L32
            r5 = r2[r4]
            r6 = -1
            if (r4 != r6) goto L1f
            java.lang.String r0 = "..."
            r1.append(r0)
            goto L37
        L1f:
            if (r4 == 0) goto L26
            java.lang.String r6 = ", "
            r1.append(r6)
        L26:
            java.lang.Object r5 = r0.invoke(r5)
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            r1.append(r5)
            int r4 = r4 + 1
            goto L12
        L32:
            java.lang.String r0 = "]"
            r1.append(r0)
        L37:
            java.lang.String r0 = r1.toString()
            return r0
    }
}
