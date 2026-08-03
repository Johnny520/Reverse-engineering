package o0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends tf.g implements java.util.Collection, hg.b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public o0.c f9480g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public java.lang.Object[] f9481h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public java.lang.Object[] f9482i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f9483j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public r0.b f9484k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public java.lang.Object[] f9485l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public java.lang.Object[] f9486m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f9487n;

    public f(o0.c r1, java.lang.Object[] r2, java.lang.Object[] r3, int r4) {
            r0 = this;
            r0.<init>()
            r0.f9480g = r1
            r0.f9481h = r2
            r0.f9482i = r3
            r0.f9483j = r4
            r0.b r4 = new r0.b
            r4.<init>()
            r0.f9484k = r4
            r0.f9485l = r2
            r0.f9486m = r3
            int r1 = r1.size()
            r0.f9487n = r1
            return
    }

    public static void e(java.lang.Object[] r2, int r3, java.util.Iterator r4) {
        L0:
            r0 = 32
            if (r3 >= r0) goto L14
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L14
            int r0 = r3 + 1
            java.lang.Object r1 = r4.next()
            r2[r3] = r1
            r3 = r0
            goto L0
        L14:
            return
    }

    public final java.lang.Object[] A(java.lang.Object[] r6, int r7, int r8, h3.f r9) {
            r5 = this;
            int r0 = g4.a.x(r8, r7)
            r1 = 31
            if (r7 != 0) goto L1c
            r7 = r6[r0]
            java.lang.Object[] r8 = r5.l(r6)
            int r2 = r0 + 1
            r3 = 32
            tf.l.n0(r0, r2, r6, r3, r8)
            java.lang.Object r6 = r9.f5065a
            r8[r1] = r6
            r9.f5065a = r7
            return r8
        L1c:
            r2 = r6[r1]
            if (r2 != 0) goto L2a
            int r1 = r5.C()
            int r1 = r1 + (-1)
            int r1 = g4.a.x(r1, r7)
        L2a:
            java.lang.Object[] r6 = r5.l(r6)
            int r7 = r7 + (-5)
            int r2 = r0 + 1
            if (r2 > r1) goto L47
        L34:
            r3 = r6[r1]
            r3.getClass()
            java.lang.Object[] r3 = (java.lang.Object[]) r3
            r4 = 0
            java.lang.Object[] r3 = r5.A(r3, r7, r4, r9)
            r6[r1] = r3
            if (r1 == r2) goto L47
            int r1 = r1 + (-1)
            goto L34
        L47:
            r1 = r6[r0]
            r1.getClass()
            java.lang.Object[] r1 = (java.lang.Object[]) r1
            java.lang.Object[] r7 = r5.A(r1, r7, r8, r9)
            r6[r0] = r7
            return r6
    }

    public final java.lang.Object B(java.lang.Object[] r7, int r8, int r9, int r10) {
            r6 = this;
            int r0 = r6.f9487n
            int r0 = r0 - r8
            java.lang.Object[] r1 = r6.f9486m
            r2 = 1
            if (r0 != r2) goto Lf
            r10 = 0
            r10 = r1[r10]
            r6.r(r7, r8, r9)
            return r10
        Lf:
            r3 = r1[r10]
            java.lang.Object[] r4 = r6.l(r1)
            int r5 = r10 + 1
            tf.l.n0(r10, r5, r1, r0, r4)
            int r10 = r0 + (-1)
            r1 = 0
            r4[r10] = r1
            r6.f9485l = r7
            r6.f9486m = r4
            int r8 = r8 + r0
            int r8 = r8 - r2
            r6.f9487n = r8
            r6.f9483j = r9
            return r3
    }

    public final int C() {
            r2 = this;
            int r0 = r2.f9487n
            r1 = 32
            if (r0 > r1) goto L8
            r0 = 0
            return r0
        L8:
            int r0 = r0 + (-1)
            r0 = r0 & (-32)
            return r0
    }

    public final java.lang.Object[] D(java.lang.Object[] r9, int r10, int r11, java.lang.Object r12, h3.f r13) {
            r8 = this;
            int r0 = g4.a.x(r11, r10)
            java.lang.Object[] r1 = r8.l(r9)
            if (r10 != 0) goto L19
            if (r1 == r9) goto L12
            int r9 = r8.modCount
            int r9 = r9 + 1
            r8.modCount = r9
        L12:
            r9 = r1[r0]
            r13.f5065a = r9
            r1[r0] = r12
            return r1
        L19:
            r9 = r1[r0]
            r9.getClass()
            r3 = r9
            java.lang.Object[] r3 = (java.lang.Object[]) r3
            int r4 = r10 + (-5)
            r2 = r8
            r5 = r11
            r6 = r12
            r7 = r13
            java.lang.Object[] r9 = r2.D(r3, r4, r5, r6, r7)
            r1[r0] = r9
            return r1
    }

    public final void E(java.util.Collection r6, int r7, java.lang.Object[] r8, int r9, java.lang.Object[][] r10, int r11, java.lang.Object[] r12) {
            r5 = this;
            r0 = 1
            if (r11 < r0) goto L4
            goto L9
        L4:
            java.lang.String r1 = "requires at least one nullBuffer"
            i0.n1.a(r1)
        L9:
            java.lang.Object[] r8 = r5.l(r8)
            r1 = 0
            r10[r1] = r8
            r2 = r7 & 31
            int r3 = r6.size()
            int r3 = r3 + r7
            int r3 = r3 - r0
            r7 = r3 & 31
            int r3 = r9 - r2
            int r3 = r3 + r7
            r4 = 32
            if (r3 >= r4) goto L26
            int r7 = r7 + r0
            tf.l.n0(r7, r2, r8, r9, r12)
            goto L3e
        L26:
            int r3 = r3 + (-31)
            if (r11 != r0) goto L2c
            r4 = r8
            goto L34
        L2c:
            java.lang.Object[] r4 = r5.n()
            int r11 = r11 + (-1)
            r10[r11] = r4
        L34:
            int r3 = r9 - r3
            tf.l.n0(r1, r3, r8, r9, r12)
            int r7 = r7 + r0
            tf.l.n0(r7, r2, r8, r3, r4)
            r12 = r4
        L3e:
            java.util.Iterator r6 = r6.iterator()
            e(r8, r2, r6)
        L45:
            if (r0 >= r11) goto L53
            java.lang.Object[] r7 = r5.n()
            e(r7, r1, r6)
            r10[r0] = r7
            int r0 = r0 + 1
            goto L45
        L53:
            e(r12, r1, r6)
            return
    }

    public final int F() {
            r2 = this;
            int r0 = r2.f9487n
            r1 = 32
            if (r0 > r1) goto L7
            return r0
        L7:
            int r1 = r0 + (-1)
            r1 = r1 & (-32)
            int r0 = r0 - r1
            return r0
    }

    @Override // tf.g
    public final int a() {
            r1 = this;
            int r0 = r1.f9487n
            return r0
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int r9, java.lang.Object r10) {
            r8 = this;
            int r0 = r8.a()
            be.h.n(r9, r0)
            int r0 = r8.a()
            if (r9 != r0) goto L11
            r8.add(r10)
            return
        L11:
            int r0 = r8.modCount
            int r0 = r0 + 1
            r8.modCount = r0
            int r0 = r8.C()
            if (r9 < r0) goto L24
            java.lang.Object[] r1 = r8.f9485l
            int r9 = r9 - r0
            r8.i(r10, r9, r1)
            return
        L24:
            h3.f r7 = new h3.f
            r0 = 0
            r7.<init>(r0)
            java.lang.Object[] r3 = r8.f9485l
            r3.getClass()
            int r4 = r8.f9483j
            r2 = r8
            r5 = r9
            r6 = r10
            java.lang.Object[] r9 = r2.h(r3, r4, r5, r6, r7)
            r10 = 0
            java.lang.Object r0 = r7.f5065a
            r8.i(r0, r10, r9)
            return
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(java.lang.Object r4) {
            r3 = this;
            int r0 = r3.modCount
            r1 = 1
            int r0 = r0 + r1
            r3.modCount = r0
            int r0 = r3.F()
            r2 = 32
            if (r0 >= r2) goto L20
            java.lang.Object[] r2 = r3.f9486m
            java.lang.Object[] r2 = r3.l(r2)
            r2[r0] = r4
            r3.f9486m = r2
            int r4 = r3.a()
            int r4 = r4 + r1
            r3.f9487n = r4
            goto L2b
        L20:
            java.lang.Object[] r4 = r3.o(r4)
            java.lang.Object[] r0 = r3.f9485l
            java.lang.Object[] r2 = r3.f9486m
            r3.u(r0, r2, r4)
        L2b:
            return r1
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int r14, java.util.Collection r15) {
            r13 = this;
            int r0 = r13.f9487n
            be.h.n(r14, r0)
            int r0 = r13.f9487n
            if (r14 != r0) goto Le
            boolean r14 = r13.addAll(r15)
            return r14
        Le:
            boolean r0 = r15.isEmpty()
            r1 = 0
            if (r0 == 0) goto L16
            return r1
        L16:
            int r0 = r13.modCount
            r2 = 1
            int r0 = r0 + r2
            r13.modCount = r0
            int r0 = r14 >> 5
            int r0 = r0 << 5
            int r3 = r13.f9487n
            int r3 = r3 - r0
            int r4 = r15.size()
            int r4 = r4 + r3
            int r4 = r4 - r2
            r3 = 32
            int r10 = r4 / 32
            if (r10 != 0) goto L5a
            r0 = r14 & 31
            int r1 = r15.size()
            int r1 = r1 + r14
            int r1 = r1 - r2
            r14 = r1 & 31
            java.lang.Object[] r1 = r13.f9486m
            java.lang.Object[] r3 = r13.l(r1)
            int r14 = r14 + r2
            int r4 = r13.F()
            tf.l.n0(r14, r0, r1, r4, r3)
            java.util.Iterator r14 = r15.iterator()
            e(r3, r0, r14)
            r13.f9486m = r3
            int r14 = r13.f9487n
            int r15 = r15.size()
            int r15 = r15 + r14
            r13.f9487n = r15
            return r2
        L5a:
            java.lang.Object[][] r7 = new java.lang.Object[r10][]
            int r9 = r13.F()
            int r4 = r13.f9487n
            int r5 = r15.size()
            int r5 = r5 + r4
            if (r5 > r3) goto L6a
            goto L6f
        L6a:
            int r4 = r5 + (-1)
            r4 = r4 & (-32)
            int r5 = r5 - r4
        L6f:
            int r4 = r13.C()
            if (r14 < r4) goto L86
            java.lang.Object[] r12 = r13.n()
            java.lang.Object[] r8 = r13.f9486m
            r5 = r13
            r6 = r15
            r11 = r10
            r10 = r7
            r7 = r14
            r5.E(r6, r7, r8, r9, r10, r11, r12)
            r14 = r5
            r7 = r10
            goto Lb8
        L86:
            r6 = r15
            r15 = r14
            r14 = r13
            java.lang.Object[] r4 = r14.f9486m
            if (r5 <= r9) goto L9c
            int r8 = r5 - r9
            java.lang.Object[] r11 = r13.m(r8, r4)
            r5 = r14
            r9 = r7
            r7 = r15
            r5.g(r6, r7, r8, r9, r10, r11)
            r7 = r9
            r12 = r11
            goto Lb8
        L9c:
            java.lang.Object[] r12 = r13.n()
            int r5 = r9 - r5
            tf.l.n0(r1, r5, r4, r9, r12)
            int r3 = r3 - r5
            java.lang.Object[] r1 = r14.f9486m
            java.lang.Object[] r9 = r13.m(r3, r1)
            int r8 = r10 + (-1)
            r7[r8] = r9
            r5 = r15
            r4 = r6
            r6 = r3
            r3 = r14
            r3.g(r4, r5, r6, r7, r8, r9)
            r6 = r4
        Lb8:
            java.lang.Object[] r15 = r14.f9485l
            java.lang.Object[] r15 = r13.t(r15, r0, r7)
            r14.f9485l = r15
            r14.f9486m = r12
            int r15 = r14.f9487n
            int r0 = r6.size()
            int r0 = r0 + r15
            r14.f9487n = r0
            return r2
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(java.util.Collection r8) {
            r7 = this;
            boolean r0 = r8.isEmpty()
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            int r0 = r7.modCount
            r2 = 1
            int r0 = r0 + r2
            r7.modCount = r0
            int r0 = r7.F()
            java.util.Iterator r3 = r8.iterator()
            int r4 = 32 - r0
            int r5 = r8.size()
            if (r4 < r5) goto L33
            java.lang.Object[] r1 = r7.f9486m
            java.lang.Object[] r1 = r7.l(r1)
            e(r1, r0, r3)
            r7.f9486m = r1
            int r0 = r7.f9487n
            int r8 = r8.size()
            int r8 = r8 + r0
            r7.f9487n = r8
            return r2
        L33:
            int r4 = r8.size()
            int r4 = r4 + r0
            int r4 = r4 - r2
            int r4 = r4 / 32
            java.lang.Object[][] r5 = new java.lang.Object[r4][]
            java.lang.Object[] r6 = r7.f9486m
            java.lang.Object[] r6 = r7.l(r6)
            e(r6, r0, r3)
            r5[r1] = r6
            r0 = r2
        L49:
            if (r0 >= r4) goto L57
            java.lang.Object[] r6 = r7.n()
            e(r6, r1, r3)
            r5[r0] = r6
            int r0 = r0 + 1
            goto L49
        L57:
            java.lang.Object[] r0 = r7.f9485l
            int r4 = r7.C()
            java.lang.Object[] r0 = r7.t(r0, r4, r5)
            r7.f9485l = r0
            java.lang.Object[] r0 = r7.n()
            e(r0, r1, r3)
            r7.f9486m = r0
            int r0 = r7.f9487n
            int r8 = r8.size()
            int r8 = r8 + r0
            r7.f9487n = r8
            return r2
    }

    @Override // tf.g
    public final java.lang.Object c(int r6) {
            r5 = this;
            int r0 = r5.a()
            be.h.m(r6, r0)
            int r0 = r5.modCount
            int r0 = r0 + 1
            r5.modCount = r0
            int r0 = r5.C()
            if (r6 < r0) goto L1d
            java.lang.Object[] r1 = r5.f9485l
            int r2 = r5.f9483j
            int r6 = r6 - r0
            java.lang.Object r6 = r5.B(r1, r0, r2, r6)
            return r6
        L1d:
            h3.f r1 = new h3.f
            java.lang.Object[] r2 = r5.f9486m
            r3 = 0
            r2 = r2[r3]
            r1.<init>(r2)
            java.lang.Object[] r2 = r5.f9485l
            r2.getClass()
            int r4 = r5.f9483j
            java.lang.Object[] r6 = r5.A(r2, r4, r6, r1)
            int r2 = r5.f9483j
            r5.B(r6, r0, r2, r3)
            java.lang.Object r6 = r1.f5065a
            return r6
    }

    public final o0.c d() {
            r5 = this;
            java.lang.Object[] r0 = r5.f9485l
            java.lang.Object[] r1 = r5.f9481h
            if (r0 != r1) goto Lf
            java.lang.Object[] r1 = r5.f9486m
            java.lang.Object[] r2 = r5.f9482i
            if (r1 != r2) goto Lf
            o0.c r0 = r5.f9480g
            goto L3a
        Lf:
            r0.b r1 = new r0.b
            r1.<init>()
            r5.f9484k = r1
            r5.f9481h = r0
            java.lang.Object[] r1 = r5.f9486m
            r5.f9482i = r1
            if (r0 != 0) goto L30
            int r0 = r1.length
            if (r0 != 0) goto L24
            o0.i r0 = o0.i.f9494h
            goto L3a
        L24:
            o0.i r0 = new o0.i
            int r2 = r5.f9487n
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r2)
            r0.<init>(r1)
            goto L3a
        L30:
            o0.e r2 = new o0.e
            int r3 = r5.f9487n
            int r4 = r5.f9483j
            r2.<init>(r0, r1, r3, r4)
            r0 = r2
        L3a:
            r5.f9480g = r0
            return r0
    }

    public final int f() {
            r1 = this;
            int r0 = r1.modCount
            return r0
    }

    public final void g(java.util.Collection r10, int r11, int r12, java.lang.Object[][] r13, int r14, java.lang.Object[] r15) {
            r9 = this;
            java.lang.Object[] r0 = r9.f9485l
            if (r0 == 0) goto L53
            int r0 = r11 >> 5
            int r1 = r9.C()
            int r1 = r1 >> 5
            o0.a r1 = r9.k(r1)
            r3 = r14
            r2 = r15
        L12:
            int r4 = r1.f9470g
            int r4 = r4 + (-1)
            if (r4 == r0) goto L2f
            java.lang.Object r4 = r1.previous()
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            int r5 = 32 - r12
            r6 = 0
            r7 = 32
            tf.l.n0(r6, r5, r4, r7, r2)
            java.lang.Object[] r2 = r9.m(r12, r4)
            int r3 = r3 + (-1)
            r13[r3] = r2
            goto L12
        L2f:
            java.lang.Object r12 = r1.previous()
            r4 = r12
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            int r12 = r9.C()
            int r12 = r12 >> 5
            int r12 = r12 + (-1)
            int r12 = r12 - r0
            int r7 = r14 - r12
            if (r7 >= r14) goto L48
            r15 = r13[r7]
            r15.getClass()
        L48:
            r8 = r15
            r5 = 32
            r1 = r9
            r2 = r10
            r3 = r11
            r6 = r13
            r1.E(r2, r3, r4, r5, r6, r7, r8)
            return
        L53:
            java.lang.String r10 = "root is null"
            j8.o.A(r10)
            return
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.lang.Object get(int r4) {
            r3 = this;
            int r0 = r3.a()
            be.h.m(r4, r0)
            int r0 = r3.C()
            if (r0 > r4) goto L10
            java.lang.Object[] r0 = r3.f9486m
            goto L27
        L10:
            java.lang.Object[] r0 = r3.f9485l
            r0.getClass()
            int r1 = r3.f9483j
        L17:
            if (r1 <= 0) goto L27
            int r2 = g4.a.x(r4, r1)
            r0 = r0[r2]
            r0.getClass()
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            int r1 = r1 + (-5)
            goto L17
        L27:
            r4 = r4 & 31
            r4 = r0[r4]
            return r4
    }

    public final java.lang.Object[] h(java.lang.Object[] r8, int r9, int r10, java.lang.Object r11, h3.f r12) {
            r7 = this;
            int r0 = g4.a.x(r10, r9)
            if (r9 != 0) goto L18
            r9 = 31
            r10 = r8[r9]
            r12.f5065a = r10
            java.lang.Object[] r10 = r7.l(r8)
            int r12 = r0 + 1
            tf.l.n0(r12, r0, r8, r9, r10)
            r10[r0] = r11
            return r10
        L18:
            java.lang.Object[] r8 = r7.l(r8)
            int r3 = r9 + (-5)
            r9 = r8[r0]
            r9.getClass()
            r2 = r9
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            r1 = r7
            r4 = r10
            r5 = r11
            r6 = r12
            java.lang.Object[] r9 = r1.h(r2, r3, r4, r5, r6)
            r8[r0] = r9
        L30:
            int r0 = r0 + 1
            r9 = 32
            if (r0 >= r9) goto L48
            r9 = r8[r0]
            if (r9 == 0) goto L48
            r2 = r9
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            r4 = 0
            java.lang.Object r5 = r6.f5065a
            r1 = r7
            java.lang.Object[] r9 = r1.h(r2, r3, r4, r5, r6)
            r8[r0] = r9
            goto L30
        L48:
            return r8
    }

    public final void i(java.lang.Object r6, int r7, java.lang.Object[] r8) {
            r5 = this;
            int r0 = r5.F()
            java.lang.Object[] r1 = r5.f9486m
            java.lang.Object[] r1 = r5.l(r1)
            java.lang.Object[] r2 = r5.f9486m
            r3 = 32
            if (r0 >= r3) goto L22
            int r3 = r7 + 1
            tf.l.n0(r3, r7, r2, r0, r1)
            r1[r7] = r6
            r5.f9485l = r8
            r5.f9486m = r1
            int r6 = r5.f9487n
            int r6 = r6 + 1
            r5.f9487n = r6
            return
        L22:
            r0 = 31
            r3 = r2[r0]
            int r4 = r7 + 1
            tf.l.n0(r4, r7, r2, r0, r1)
            r1[r7] = r6
            java.lang.Object[] r6 = r5.o(r3)
            r5.u(r8, r1, r6)
            return
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final java.util.Iterator iterator() {
            r1 = this;
            r0 = 0
            java.util.ListIterator r0 = r1.listIterator(r0)
            return r0
    }

    public final boolean j(java.lang.Object[] r3) {
            r2 = this;
            int r0 = r3.length
            r1 = 33
            if (r0 != r1) goto Lf
            r0 = 32
            r3 = r3[r0]
            r0.b r0 = r2.f9484k
            if (r3 != r0) goto Lf
            r3 = 1
            return r3
        Lf:
            r3 = 0
            return r3
    }

    public final o0.a k(int r5) {
            r4 = this;
            java.lang.Object[] r0 = r4.f9485l
            if (r0 == 0) goto L1f
            int r1 = r4.C()
            int r1 = r1 >> 5
            be.h.n(r5, r1)
            int r2 = r4.f9483j
            if (r2 != 0) goto L17
            o0.d r1 = new o0.d
            r1.<init>(r0, r5)
            return r1
        L17:
            int r2 = r2 / 5
            o0.j r3 = new o0.j
            r3.<init>(r0, r5, r1, r2)
            return r3
        L1f:
            java.lang.String r5 = "Invalid root"
            j8.o.A(r5)
            r5 = 0
            return r5
    }

    public final java.lang.Object[] l(java.lang.Object[] r5) {
            r4 = this;
            if (r5 != 0) goto L7
            java.lang.Object[] r5 = r4.n()
            return r5
        L7:
            boolean r0 = r4.j(r5)
            if (r0 == 0) goto Le
            return r5
        Le:
            java.lang.Object[] r0 = r4.n()
            int r1 = r5.length
            r2 = 32
            if (r1 <= r2) goto L18
            r1 = r2
        L18:
            r2 = 6
            r3 = 0
            tf.l.r0(r3, r1, r5, r2, r0)
            return r0
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.util.ListIterator listIterator() {
            r1 = this;
            r0 = 0
            java.util.ListIterator r0 = r1.listIterator(r0)
            return r0
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.util.ListIterator listIterator(int r2) {
            r1 = this;
            int r0 = r1.f9487n
            be.h.n(r2, r0)
            o0.h r0 = new o0.h
            r0.<init>(r1, r2)
            return r0
    }

    public final java.lang.Object[] m(int r4, java.lang.Object[] r5) {
            r3 = this;
            boolean r0 = r3.j(r5)
            r1 = 0
            if (r0 == 0) goto Ld
            int r0 = 32 - r4
            tf.l.n0(r4, r1, r5, r0, r5)
            return r5
        Ld:
            java.lang.Object[] r0 = r3.n()
            int r2 = 32 - r4
            tf.l.n0(r4, r1, r5, r2, r0)
            return r0
    }

    public final java.lang.Object[] n() {
            r3 = this;
            r0 = 33
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 32
            r0.b r2 = r3.f9484k
            r0[r1] = r2
            return r0
    }

    public final java.lang.Object[] o(java.lang.Object r3) {
            r2 = this;
            r0 = 33
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r3
            r3 = 32
            r0.b r1 = r2.f9484k
            r0[r3] = r1
            return r0
    }

    public final java.lang.Object[] p(java.lang.Object[] r4, int r5, int r6) {
            r3 = this;
            if (r6 < 0) goto L3
            goto L8
        L3:
            java.lang.String r0 = "shift should be positive"
            i0.n1.a(r0)
        L8:
            if (r6 != 0) goto Lb
            return r4
        Lb:
            int r0 = g4.a.x(r5, r6)
            r1 = r4[r0]
            r1.getClass()
            java.lang.Object[] r1 = (java.lang.Object[]) r1
            int r6 = r6 + (-5)
            java.lang.Object[] r5 = r3.p(r1, r5, r6)
            r6 = 31
            if (r0 >= r6) goto L3b
            int r6 = r0 + 1
            r1 = r4[r6]
            if (r1 == 0) goto L3b
            boolean r1 = r3.j(r4)
            if (r1 == 0) goto L32
            r1 = 0
            r2 = 32
            java.util.Arrays.fill(r4, r6, r2, r1)
        L32:
            java.lang.Object[] r1 = r3.n()
            r2 = 0
            tf.l.n0(r2, r2, r4, r6, r1)
            r4 = r1
        L3b:
            r6 = r4[r0]
            if (r5 == r6) goto L45
            java.lang.Object[] r4 = r3.l(r4)
            r4[r0] = r5
        L45:
            return r4
    }

    public final java.lang.Object[] q(java.lang.Object[] r5, int r6, int r7, h3.f r8) {
            r4 = this;
            int r0 = r7 + (-1)
            int r0 = g4.a.x(r0, r6)
            r1 = 0
            r2 = 5
            if (r6 != r2) goto L10
            r6 = r5[r0]
            r8.f5065a = r6
            r6 = r1
            goto L1c
        L10:
            r3 = r5[r0]
            r3.getClass()
            java.lang.Object[] r3 = (java.lang.Object[]) r3
            int r6 = r6 - r2
            java.lang.Object[] r6 = r4.q(r3, r6, r7, r8)
        L1c:
            if (r6 != 0) goto L21
            if (r0 != 0) goto L21
            return r1
        L21:
            java.lang.Object[] r5 = r4.l(r5)
            r5[r0] = r6
            return r5
    }

    public final void r(java.lang.Object[] r4, int r5, int r6) {
            r3 = this;
            r0 = 0
            r1 = 0
            if (r6 != 0) goto L11
            r3.f9485l = r1
            if (r4 != 0) goto La
            java.lang.Object[] r4 = new java.lang.Object[r0]
        La:
            r3.f9486m = r4
            r3.f9487n = r5
            r3.f9483j = r6
            return
        L11:
            h3.f r2 = new h3.f
            r2.<init>(r1)
            r4.getClass()
            java.lang.Object[] r4 = r3.q(r4, r6, r5, r2)
            r4.getClass()
            java.lang.Object r1 = r2.f5065a
            r1.getClass()
            java.lang.Object[] r1 = (java.lang.Object[]) r1
            r3.f9486m = r1
            r3.f9487n = r5
            r5 = 1
            r5 = r4[r5]
            if (r5 != 0) goto L3b
            r4 = r4[r0]
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            r3.f9485l = r4
            int r6 = r6 + (-5)
            r3.f9483j = r6
            return
        L3b:
            r3.f9485l = r4
            r3.f9483j = r6
            return
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(java.util.Collection r3) {
            r2 = this;
            o0.b r0 = new o0.b
            r1 = 1
            r0.<init>(r1, r3)
            boolean r3 = r2.z(r0)
            return r3
    }

    public final java.lang.Object[] s(java.lang.Object[] r5, int r6, int r7, java.util.Iterator r8) {
            r4 = this;
            boolean r0 = r8.hasNext()
            if (r0 != 0) goto Lb
            java.lang.String r0 = "invalid buffersIterator"
            i0.n1.a(r0)
        Lb:
            r0 = 0
            r1 = 1
            if (r7 < 0) goto L11
            r2 = r1
            goto L12
        L11:
            r2 = r0
        L12:
            if (r2 != 0) goto L19
            java.lang.String r2 = "negative shift"
            i0.n1.a(r2)
        L19:
            if (r7 != 0) goto L22
            java.lang.Object r5 = r8.next()
            java.lang.Object[] r5 = (java.lang.Object[]) r5
            return r5
        L22:
            java.lang.Object[] r5 = r4.l(r5)
            int r2 = g4.a.x(r6, r7)
            r3 = r5[r2]
            java.lang.Object[] r3 = (java.lang.Object[]) r3
            int r7 = r7 + (-5)
            java.lang.Object[] r6 = r4.s(r3, r6, r7, r8)
            r5[r2] = r6
        L36:
            int r2 = r2 + r1
            r6 = 32
            if (r2 >= r6) goto L4c
            boolean r6 = r8.hasNext()
            if (r6 == 0) goto L4c
            r6 = r5[r2]
            java.lang.Object[] r6 = (java.lang.Object[]) r6
            java.lang.Object[] r6 = r4.s(r6, r0, r7, r8)
            r5[r2] = r6
            goto L36
        L4c:
            return r5
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.lang.Object set(int r9, java.lang.Object r10) {
            r8 = this;
            int r0 = r8.a()
            be.h.m(r9, r0)
            int r0 = r8.C()
            if (r0 > r9) goto L26
            java.lang.Object[] r0 = r8.f9486m
            java.lang.Object[] r0 = r8.l(r0)
            java.lang.Object[] r1 = r8.f9486m
            if (r0 == r1) goto L1d
            int r1 = r8.modCount
            int r1 = r1 + 1
            r8.modCount = r1
        L1d:
            r9 = r9 & 31
            r1 = r0[r9]
            r0[r9] = r10
            r8.f9486m = r0
            return r1
        L26:
            h3.f r7 = new h3.f
            r0 = 0
            r7.<init>(r0)
            java.lang.Object[] r3 = r8.f9485l
            r3.getClass()
            int r4 = r8.f9483j
            r2 = r8
            r5 = r9
            r6 = r10
            java.lang.Object[] r9 = r2.D(r3, r4, r5, r6, r7)
            r2.f9485l = r9
            java.lang.Object r9 = r7.f5065a
            return r9
    }

    public final java.lang.Object[] t(java.lang.Object[] r5, int r6, java.lang.Object[][] r7) {
            r4 = this;
            gg.b r0 = new gg.b
            r0.<init>(r7)
            int r7 = r6 >> 5
            int r1 = r4.f9483j
            r2 = 1
            int r3 = r2 << r1
            if (r7 >= r3) goto L13
            java.lang.Object[] r5 = r4.s(r5, r6, r1, r0)
            goto L17
        L13:
            java.lang.Object[] r5 = r4.l(r5)
        L17:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L2f
            int r6 = r4.f9483j
            int r6 = r6 + 5
            r4.f9483j = r6
            java.lang.Object[] r5 = r4.o(r5)
            int r6 = r4.f9483j
            int r7 = r2 << r6
            r4.s(r5, r7, r6, r0)
            goto L17
        L2f:
            return r5
    }

    public final void u(java.lang.Object[] r6, java.lang.Object[] r7, java.lang.Object[] r8) {
            r5 = this;
            int r0 = r5.f9487n
            int r1 = r0 >> 5
            int r2 = r5.f9483j
            r3 = 1
            int r4 = r3 << r2
            if (r1 <= r4) goto L27
            java.lang.Object[] r6 = r5.o(r6)
            int r0 = r5.f9483j
            int r0 = r0 + 5
            java.lang.Object[] r6 = r5.v(r0, r6, r7)
            r5.f9485l = r6
            r5.f9486m = r8
            int r6 = r5.f9483j
            int r6 = r6 + 5
            r5.f9483j = r6
            int r6 = r5.f9487n
            int r6 = r6 + r3
            r5.f9487n = r6
            return
        L27:
            if (r6 != 0) goto L31
            r5.f9485l = r7
            r5.f9486m = r8
            int r0 = r0 + r3
            r5.f9487n = r0
            return
        L31:
            java.lang.Object[] r6 = r5.v(r2, r6, r7)
            r5.f9485l = r6
            r5.f9486m = r8
            int r6 = r5.f9487n
            int r6 = r6 + r3
            r5.f9487n = r6
            return
    }

    public final java.lang.Object[] v(int r4, java.lang.Object[] r5, java.lang.Object[] r6) {
            r3 = this;
            int r0 = r3.a()
            int r0 = r0 + (-1)
            int r0 = g4.a.x(r0, r4)
            java.lang.Object[] r5 = r3.l(r5)
            r1 = 5
            if (r4 != r1) goto L14
            r5[r0] = r6
            return r5
        L14:
            r2 = r5[r0]
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            int r4 = r4 - r1
            java.lang.Object[] r4 = r3.v(r4, r2, r6)
            r5[r0] = r4
            return r5
    }

    public final int w(fg.l r7, java.lang.Object[] r8, int r9, int r10, h3.f r11, java.util.ArrayList r12, java.util.ArrayList r13) {
            r6 = this;
            boolean r0 = r6.j(r8)
            if (r0 == 0) goto L9
            r12.add(r8)
        L9:
            java.lang.Object r0 = r11.f5065a
            r0.getClass()
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            r1 = 0
            r3 = r0
            r2 = r1
        L13:
            if (r2 >= r9) goto L49
            r4 = r8[r2]
            java.lang.Object r5 = r7.invoke(r4)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 != 0) goto L46
            r5 = 32
            if (r10 != r5) goto L41
            boolean r10 = r12.isEmpty()
            if (r10 != 0) goto L3b
            int r10 = r12.size()
            int r10 = r10 + (-1)
            java.lang.Object r10 = r12.remove(r10)
            java.lang.Object[] r10 = (java.lang.Object[]) r10
        L39:
            r3 = r10
            goto L40
        L3b:
            java.lang.Object[] r10 = r6.n()
            goto L39
        L40:
            r10 = r1
        L41:
            int r5 = r10 + 1
            r3[r10] = r4
            r10 = r5
        L46:
            int r2 = r2 + 1
            goto L13
        L49:
            r11.f5065a = r3
            if (r0 == r3) goto L50
            r13.add(r0)
        L50:
            return r10
    }

    public final int x(fg.l r7, java.lang.Object[] r8, int r9, h3.f r10) {
            r6 = this;
            r0 = 0
            r2 = r8
            r3 = r9
            r1 = r0
        L4:
            if (r0 >= r9) goto L27
            r4 = r8[r0]
            java.lang.Object r5 = r7.invoke(r4)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L1d
            if (r1 != 0) goto L24
            java.lang.Object[] r2 = r6.l(r8)
            r1 = 1
            r3 = r0
            goto L24
        L1d:
            if (r1 == 0) goto L24
            int r5 = r3 + 1
            r2[r3] = r4
            r3 = r5
        L24:
            int r0 = r0 + 1
            goto L4
        L27:
            r10.f5065a = r2
            return r3
    }

    public final int y(fg.l r2, int r3, h3.f r4) {
            r1 = this;
            java.lang.Object[] r0 = r1.f9486m
            int r2 = r1.x(r2, r0, r3, r4)
            java.lang.Object r4 = r4.f5065a
            if (r2 != r3) goto Lb
            return r3
        Lb:
            r4.getClass()
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            r0 = 0
            java.util.Arrays.fill(r4, r2, r3, r0)
            r1.f9486m = r4
            int r4 = r1.f9487n
            int r3 = r3 - r2
            int r4 = r4 - r3
            r1.f9487n = r4
            return r2
    }

    public final boolean z(fg.l r16) {
            r15 = this;
            r1 = r16
            int r8 = r15.F()
            h3.f r5 = new h3.f
            r9 = 0
            r5.<init>(r9)
            java.lang.Object[] r0 = r15.f9485l
            r10 = 0
            r11 = 1
            if (r0 != 0) goto L1b
            int r0 = r15.y(r1, r8, r5)
            if (r0 == r8) goto Ld1
        L18:
            r10 = r11
            goto Ld1
        L1b:
            o0.a r12 = r15.k(r10)
            r13 = 32
            r0 = r13
        L22:
            if (r0 != r13) goto L35
            boolean r2 = r12.hasNext()
            if (r2 == 0) goto L35
            java.lang.Object r0 = r12.next()
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            int r0 = r15.x(r1, r0, r13, r5)
            goto L22
        L35:
            if (r0 != r13) goto L49
            int r0 = r15.y(r1, r8, r5)
            if (r0 != 0) goto L46
            java.lang.Object[] r1 = r15.f9485l
            int r2 = r15.f9487n
            int r3 = r15.f9483j
            r15.r(r1, r2, r3)
        L46:
            if (r0 == r8) goto Ld1
            goto L18
        L49:
            int r2 = r12.f9470g
            int r2 = r2 - r11
            int r14 = r2 << 5
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r4 = r0
        L59:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L70
            java.lang.Object r0 = r12.next()
            r2 = r0
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            r3 = 32
            r0 = r15
            int r4 = r0.w(r1, r2, r3, r4, r5, r6, r7)
            r1 = r16
            goto L59
        L70:
            java.lang.Object[] r2 = r15.f9486m
            r0 = r15
            r1 = r16
            r3 = r8
            int r1 = r0.w(r1, r2, r3, r4, r5, r6, r7)
            java.lang.Object r2 = r5.f5065a
            r2.getClass()
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            java.util.Arrays.fill(r2, r1, r13, r9)
            boolean r3 = r7.isEmpty()
            java.lang.Object[] r4 = r15.f9485l
            if (r3 == 0) goto L90
            r4.getClass()
            goto L9a
        L90:
            int r3 = r15.f9483j
            java.util.Iterator r5 = r7.iterator()
            java.lang.Object[] r4 = r15.s(r4, r14, r3, r5)
        L9a:
            int r3 = r7.size()
            int r3 = r3 << 5
            int r14 = r14 + r3
            r3 = r14 & 31
            if (r3 != 0) goto La6
            goto Lab
        La6:
            java.lang.String r3 = "invalid size"
            i0.n1.a(r3)
        Lab:
            if (r14 != 0) goto Lb0
            r15.f9483j = r10
            goto Lc8
        Lb0:
            int r3 = r14 + (-1)
        Lb2:
            int r5 = r15.f9483j
            int r6 = r3 >> r5
            if (r6 != 0) goto Lc4
            int r5 = r5 + (-5)
            r15.f9483j = r5
            r4 = r4[r10]
            r4.getClass()
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            goto Lb2
        Lc4:
            java.lang.Object[] r9 = r15.p(r4, r3, r5)
        Lc8:
            r15.f9485l = r9
            r15.f9486m = r2
            int r14 = r14 + r1
            r15.f9487n = r14
            goto L18
        Ld1:
            if (r10 == 0) goto Ld8
            int r1 = r15.modCount
            int r1 = r1 + r11
            r15.modCount = r1
        Ld8:
            return r10
    }
}
