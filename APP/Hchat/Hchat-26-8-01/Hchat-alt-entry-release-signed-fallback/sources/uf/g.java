package uf;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements java.util.Map, java.io.Serializable, hg.d {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final uf.g f13783t = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public java.lang.Object[] f13784g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public java.lang.Object[] f13785h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int[] f13786i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int[] f13787j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f13788k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f13789l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f13790m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f13791n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f13792o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public uf.h f13793p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public p0.g f13794q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public uf.h f13795r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f13796s;

    static {
            uf.g r0 = new uf.g
            r1 = 0
            r0.<init>(r1)
            r1 = 1
            r0.f13796s = r1
            uf.g.f13783t = r0
            return
    }

    public g() {
            r1 = this;
            r0 = 8
            r1.<init>(r0)
            return
    }

    public g(int r5) {
            r4 = this;
            if (r5 < 0) goto L2c
            java.lang.Object[] r0 = new java.lang.Object[r5]
            int[] r1 = new int[r5]
            r2 = 1
            if (r5 >= r2) goto La
            r5 = r2
        La:
            int r5 = r5 * 3
            int r5 = java.lang.Integer.highestOneBit(r5)
            int[] r3 = new int[r5]
            r4.<init>()
            r4.f13784g = r0
            r0 = 0
            r4.f13785h = r0
            r4.f13786i = r1
            r4.f13787j = r3
            r0 = 2
            r4.f13788k = r0
            r0 = 0
            r4.f13789l = r0
            int r5 = java.lang.Integer.numberOfLeadingZeros(r5)
            int r5 = r5 + r2
            r4.f13790m = r5
            return
        L2c:
            java.lang.String r5 = "capacity must be non-negative."
            j8.o.t(r5)
            r5 = 0
            throw r5
    }

    public final int a(java.lang.Object r8) {
            r7 = this;
            r7.d()
        L3:
            int r0 = r7.j(r8)
            int r1 = r7.f13788k
            int r1 = r1 * 2
            int[] r2 = r7.f13787j
            int r2 = r2.length
            int r2 = r2 / 2
            if (r1 <= r2) goto L13
            r1 = r2
        L13:
            r2 = 0
        L14:
            int[] r3 = r7.f13787j
            r4 = r3[r0]
            r5 = 1
            if (r4 != 0) goto L43
            int r1 = r7.f13789l
            java.lang.Object[] r4 = r7.f13784g
            int r6 = r4.length
            if (r1 < r6) goto L26
            r7.g(r5)
            goto L3
        L26:
            int r6 = r1 + 1
            r7.f13789l = r6
            r4[r1] = r8
            int[] r8 = r7.f13786i
            r8[r1] = r0
            r3[r0] = r6
            int r8 = r7.f13792o
            int r8 = r8 + r5
            r7.f13792o = r8
            int r8 = r7.f13791n
            int r8 = r8 + r5
            r7.f13791n = r8
            int r8 = r7.f13788k
            if (r2 <= r8) goto L42
            r7.f13788k = r2
        L42:
            return r1
        L43:
            java.lang.Object[] r3 = r7.f13784g
            int r6 = r4 + (-1)
            r3 = r3[r6]
            boolean r3 = gg.l.a(r3, r8)
            if (r3 == 0) goto L51
            int r8 = -r4
            return r8
        L51:
            int r2 = r2 + 1
            if (r2 <= r1) goto L5e
            int[] r0 = r7.f13787j
            int r0 = r0.length
            int r0 = r0 * 2
            r7.k(r0)
            goto L3
        L5e:
            int r3 = r0 + (-1)
            if (r0 != 0) goto L67
            int[] r0 = r7.f13787j
            int r0 = r0.length
            int r0 = r0 - r5
            goto L14
        L67:
            r0 = r3
            goto L14
    }

    public final uf.g c() {
            r1 = this;
            r1.d()
            r0 = 1
            r1.f13796s = r0
            int r0 = r1.f13792o
            if (r0 <= 0) goto Lb
            return r1
        Lb:
            uf.g r0 = uf.g.f13783t
            r0.getClass()
            return r0
    }

    @Override // java.util.Map
    public final void clear() {
            r6 = this;
            r6.d()
            int r0 = r6.f13789l
            int r0 = r0 + (-1)
            r1 = 0
            if (r0 < 0) goto L1d
            r2 = r1
        Lb:
            int[] r3 = r6.f13786i
            r4 = r3[r2]
            if (r4 < 0) goto L18
            int[] r5 = r6.f13787j
            r5[r4] = r1
            r4 = -1
            r3[r2] = r4
        L18:
            if (r2 == r0) goto L1d
            int r2 = r2 + 1
            goto Lb
        L1d:
            java.lang.Object[] r0 = r6.f13784g
            int r2 = r6.f13789l
            r9.e0.g0(r0, r1, r2)
            java.lang.Object[] r0 = r6.f13785h
            if (r0 == 0) goto L2d
            int r2 = r6.f13789l
            r9.e0.g0(r0, r1, r2)
        L2d:
            r6.f13792o = r1
            r6.f13789l = r1
            int r0 = r6.f13791n
            int r0 = r0 + 1
            r6.f13791n = r0
            return
    }

    @Override // java.util.Map
    public final boolean containsKey(java.lang.Object r1) {
            r0 = this;
            int r1 = r0.h(r1)
            if (r1 < 0) goto L8
            r1 = 1
            return r1
        L8:
            r1 = 0
            return r1
    }

    @Override // java.util.Map
    public final boolean containsValue(java.lang.Object r1) {
            r0 = this;
            int r1 = r0.i(r1)
            if (r1 < 0) goto L8
            r1 = 1
            return r1
        L8:
            r1 = 0
            return r1
    }

    public final void d() {
            r1 = this;
            boolean r0 = r1.f13796s
            if (r0 != 0) goto L5
            return
        L5:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    public final void e(boolean r8) {
            r7 = this;
            java.lang.Object[] r0 = r7.f13785h
            r1 = 0
            r2 = r1
        L4:
            int r3 = r7.f13789l
            if (r1 >= r3) goto L29
            int[] r3 = r7.f13786i
            r4 = r3[r1]
            if (r4 < 0) goto L26
            java.lang.Object[] r5 = r7.f13784g
            r6 = r5[r1]
            r5[r2] = r6
            if (r0 == 0) goto L1a
            r5 = r0[r1]
            r0[r2] = r5
        L1a:
            if (r8 == 0) goto L24
            r3[r2] = r4
            int[] r3 = r7.f13787j
            int r5 = r2 + 1
            r3[r4] = r5
        L24:
            int r2 = r2 + 1
        L26:
            int r1 = r1 + 1
            goto L4
        L29:
            java.lang.Object[] r8 = r7.f13784g
            r9.e0.g0(r8, r2, r3)
            if (r0 == 0) goto L35
            int r8 = r7.f13789l
            r9.e0.g0(r0, r2, r8)
        L35:
            r7.f13789l = r2
            return
    }

    @Override // java.util.Map
    public final java.util.Set entrySet() {
            r2 = this;
            uf.h r0 = r2.f13795r
            if (r0 != 0) goto Lc
            uf.h r0 = new uf.h
            r1 = 0
            r0.<init>(r2, r1)
            r2.f13795r = r0
        Lc:
            return r0
    }

    @Override // java.util.Map
    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r3 == r2) goto L1f
            boolean r0 = r3 instanceof java.util.Map
            if (r0 == 0) goto L1d
            java.util.Map r3 = (java.util.Map) r3
            int r0 = r2.f13792o
            int r1 = r3.size()
            if (r0 != r1) goto L1d
            java.util.Set r3 = r3.entrySet()
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r3 = r2.f(r3)
            if (r3 == 0) goto L1d
            goto L1f
        L1d:
            r3 = 0
            return r3
        L1f:
            r3 = 1
            return r3
    }

    public final boolean f(java.util.Collection r5) {
            r4 = this;
            r5.getClass()
            java.util.Iterator r5 = r5.iterator()
        L7:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L34
            java.lang.Object r0 = r5.next()
            r1 = 0
            if (r0 == 0) goto L33
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.ClassCastException -> L33
            java.lang.Object r2 = r0.getKey()     // Catch: java.lang.ClassCastException -> L33
            int r2 = r4.h(r2)     // Catch: java.lang.ClassCastException -> L33
            if (r2 >= 0) goto L22
            r0 = r1
            goto L31
        L22:
            java.lang.Object[] r3 = r4.f13785h     // Catch: java.lang.ClassCastException -> L33
            r3.getClass()     // Catch: java.lang.ClassCastException -> L33
            r2 = r3[r2]     // Catch: java.lang.ClassCastException -> L33
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.ClassCastException -> L33
            boolean r0 = gg.l.a(r2, r0)     // Catch: java.lang.ClassCastException -> L33
        L31:
            if (r0 != 0) goto L7
        L33:
            return r1
        L34:
            r5 = 1
            return r5
    }

    public final void g(int r6) {
            r5 = this;
            java.lang.Object[] r0 = r5.f13784g
            int r1 = r0.length
            int r2 = r5.f13789l
            int r1 = r1 - r2
            int r3 = r5.f13792o
            int r3 = r2 - r3
            r4 = 1
            if (r1 >= r6) goto L19
            int r1 = r1 + r3
            if (r1 < r6) goto L19
            int r1 = r0.length
            int r1 = r1 / 4
            if (r3 < r1) goto L19
            r5.e(r4)
            return
        L19:
            int r2 = r2 + r6
            if (r2 < 0) goto L5b
            int r6 = r0.length
            if (r2 <= r6) goto L5a
            tf.c r6 = tf.f.Companion
            int r0 = r0.length
            r6.getClass()
            int r6 = tf.c.d(r0, r2)
            java.lang.Object[] r0 = r5.f13784g
            r0.getClass()
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r6)
            r5.f13784g = r0
            java.lang.Object[] r0 = r5.f13785h
            if (r0 == 0) goto L3d
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r6)
            goto L3e
        L3d:
            r0 = 0
        L3e:
            r5.f13785h = r0
            int[] r0 = r5.f13786i
            int[] r0 = java.util.Arrays.copyOf(r0, r6)
            r5.f13786i = r0
            if (r6 >= r4) goto L4b
            goto L4c
        L4b:
            r4 = r6
        L4c:
            int r4 = r4 * 3
            int r6 = java.lang.Integer.highestOneBit(r4)
            int[] r0 = r5.f13787j
            int r0 = r0.length
            if (r6 <= r0) goto L5a
            r5.k(r6)
        L5a:
            return
        L5b:
            java.lang.OutOfMemoryError r6 = new java.lang.OutOfMemoryError
            r6.<init>()
            throw r6
    }

    @Override // java.util.Map
    public final java.lang.Object get(java.lang.Object r2) {
            r1 = this;
            int r2 = r1.h(r2)
            if (r2 >= 0) goto L8
            r2 = 0
            return r2
        L8:
            java.lang.Object[] r0 = r1.f13785h
            r0.getClass()
            r2 = r0[r2]
            return r2
    }

    public final int h(java.lang.Object r6) {
            r5 = this;
            int r0 = r5.j(r6)
            int r1 = r5.f13788k
        L6:
            int[] r2 = r5.f13787j
            r2 = r2[r0]
            r3 = -1
            if (r2 != 0) goto Le
            return r3
        Le:
            java.lang.Object[] r4 = r5.f13784g
            int r2 = r2 + (-1)
            r4 = r4[r2]
            boolean r4 = gg.l.a(r4, r6)
            if (r4 == 0) goto L1b
            return r2
        L1b:
            int r1 = r1 + r3
            if (r1 >= 0) goto L1f
            return r3
        L1f:
            int r2 = r0 + (-1)
            if (r0 != 0) goto L29
            int[] r0 = r5.f13787j
            int r0 = r0.length
            int r0 = r0 + (-1)
            goto L6
        L29:
            r0 = r2
            goto L6
    }

    @Override // java.util.Map
    public final int hashCode() {
            r6 = this;
            uf.e r0 = new uf.e
            r1 = 0
            r0.<init>(r6, r1)
            r2 = r1
        L7:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L45
            int r3 = r0.f8713g
            java.lang.Object r4 = r0.f8716j
            uf.g r4 = (uf.g) r4
            int r5 = r4.f13789l
            if (r3 >= r5) goto L40
            int r5 = r3 + 1
            r0.f8713g = r5
            r0.f8714h = r3
            java.lang.Object[] r5 = r4.f13784g
            r3 = r5[r3]
            if (r3 == 0) goto L28
            int r3 = r3.hashCode()
            goto L29
        L28:
            r3 = r1
        L29:
            java.lang.Object[] r4 = r4.f13785h
            r4.getClass()
            int r5 = r0.f8714h
            r4 = r4[r5]
            if (r4 == 0) goto L39
            int r4 = r4.hashCode()
            goto L3a
        L39:
            r4 = r1
        L3a:
            r3 = r3 ^ r4
            r0.d()
            int r2 = r2 + r3
            goto L7
        L40:
            bsh.j.e()
            r0 = 0
            return r0
        L45:
            return r2
    }

    public final int i(java.lang.Object r3) {
            r2 = this;
            int r0 = r2.f13789l
        L2:
            r1 = -1
            int r0 = r0 + r1
            if (r0 < 0) goto L1a
            int[] r1 = r2.f13786i
            r1 = r1[r0]
            if (r1 < 0) goto L2
            java.lang.Object[] r1 = r2.f13785h
            r1.getClass()
            r1 = r1[r0]
            boolean r1 = gg.l.a(r1, r3)
            if (r1 == 0) goto L2
            return r0
        L1a:
            return r1
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
            r1 = this;
            int r0 = r1.f13792o
            if (r0 != 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    public final int j(java.lang.Object r2) {
            r1 = this;
            if (r2 == 0) goto L7
            int r2 = r2.hashCode()
            goto L8
        L7:
            r2 = 0
        L8:
            r0 = -1640531527(0xffffffff9e3779b9, float:-9.713111E-21)
            int r2 = r2 * r0
            int r0 = r1.f13790m
            int r2 = r2 >>> r0
            return r2
    }

    public final void k(int r6) {
            r5 = this;
            int r0 = r5.f13791n
            int r0 = r0 + 1
            r5.f13791n = r0
            int r0 = r5.f13789l
            int r1 = r5.f13792o
            r2 = 0
            if (r0 <= r1) goto L10
            r5.e(r2)
        L10:
            int[] r0 = new int[r6]
            r5.f13787j = r0
            int r6 = java.lang.Integer.numberOfLeadingZeros(r6)
            int r6 = r6 + 1
            r5.f13790m = r6
        L1c:
            int r6 = r5.f13789l
            if (r2 >= r6) goto L4d
            int r6 = r2 + 1
            java.lang.Object[] r0 = r5.f13784g
            r0 = r0[r2]
            int r0 = r5.j(r0)
            int r1 = r5.f13788k
        L2c:
            int[] r3 = r5.f13787j
            r4 = r3[r0]
            if (r4 != 0) goto L3a
            r3[r0] = r6
            int[] r1 = r5.f13786i
            r1[r2] = r0
            r2 = r6
            goto L1c
        L3a:
            int r1 = r1 + (-1)
            if (r1 < 0) goto L48
            int r4 = r0 + (-1)
            if (r0 != 0) goto L46
            int r0 = r3.length
            int r0 = r0 + (-1)
            goto L2c
        L46:
            r0 = r4
            goto L2c
        L48:
            java.lang.String r6 = "This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?"
            j8.o.A(r6)
        L4d:
            return
    }

    @Override // java.util.Map
    public final java.util.Set keySet() {
            r2 = this;
            uf.h r0 = r2.f13793p
            if (r0 != 0) goto Lc
            uf.h r0 = new uf.h
            r1 = 1
            r0.<init>(r2, r1)
            r2.f13793p = r0
        Lc:
            return r0
    }

    public final void l(int r10) {
            r9 = this;
            java.lang.Object[] r0 = r9.f13784g
            r0.getClass()
            r1 = 0
            r0[r10] = r1
            java.lang.Object[] r0 = r9.f13785h
            if (r0 == 0) goto Le
            r0[r10] = r1
        Le:
            int[] r0 = r9.f13786i
            r0 = r0[r10]
            r1 = 0
        L13:
            r2 = r0
            r3 = r1
        L15:
            int r4 = r0 + (-1)
            if (r0 != 0) goto L1f
            int[] r0 = r9.f13787j
            int r0 = r0.length
            int r0 = r0 + (-1)
            goto L20
        L1f:
            r0 = r4
        L20:
            int[] r4 = r9.f13787j
            r5 = r4[r0]
            int r3 = r3 + 1
            int r6 = r9.f13788k
            if (r3 <= r6) goto L2d
            r4[r2] = r1
            goto L31
        L2d:
            if (r5 != 0) goto L42
            r4[r2] = r1
        L31:
            int[] r0 = r9.f13786i
            r1 = -1
            r0[r10] = r1
            int r10 = r9.f13792o
            int r10 = r10 + r1
            r9.f13792o = r10
            int r10 = r9.f13791n
            int r10 = r10 + 1
            r9.f13791n = r10
            return
        L42:
            java.lang.Object[] r4 = r9.f13784g
            int r6 = r5 + (-1)
            r4 = r4[r6]
            int r4 = r9.j(r4)
            int r4 = r4 - r0
            int[] r7 = r9.f13787j
            int r8 = r7.length
            int r8 = r8 + (-1)
            r4 = r4 & r8
            if (r4 < r3) goto L15
            r7[r2] = r5
            int[] r3 = r9.f13786i
            r3[r6] = r2
            goto L13
    }

    @Override // java.util.Map
    public final java.lang.Object put(java.lang.Object r3, java.lang.Object r4) {
            r2 = this;
            r2.d()
            int r3 = r2.a(r3)
            java.lang.Object[] r0 = r2.f13785h
            if (r0 == 0) goto Lc
            goto L15
        Lc:
            java.lang.Object[] r0 = r2.f13784g
            int r0 = r0.length
            if (r0 < 0) goto L23
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r2.f13785h = r0
        L15:
            if (r3 >= 0) goto L1f
            int r3 = -r3
            int r3 = r3 + (-1)
            r1 = r0[r3]
            r0[r3] = r4
            return r1
        L1f:
            r0[r3] = r4
        L21:
            r3 = 0
            return r3
        L23:
            java.lang.String r3 = "capacity must be non-negative."
            j8.o.t(r3)
            goto L21
    }

    @Override // java.util.Map
    public final void putAll(java.util.Map r6) {
            r5 = this;
            r6.getClass()
            r5.d()
            java.util.Set r6 = r6.entrySet()
            java.util.Collection r6 = (java.util.Collection) r6
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L13
            goto L64
        L13:
            int r0 = r6.size()
            r5.g(r0)
            java.util.Iterator r6 = r6.iterator()
        L1e:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L64
            java.lang.Object r0 = r6.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            int r1 = r5.a(r1)
            java.lang.Object[] r2 = r5.f13785h
            if (r2 == 0) goto L37
            goto L40
        L37:
            java.lang.Object[] r2 = r5.f13784g
            int r2 = r2.length
            if (r2 < 0) goto L5f
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r5.f13785h = r2
        L40:
            if (r1 < 0) goto L49
            java.lang.Object r0 = r0.getValue()
            r2[r1] = r0
            goto L1e
        L49:
            int r1 = -r1
            int r1 = r1 + (-1)
            r3 = r2[r1]
            java.lang.Object r4 = r0.getValue()
            boolean r3 = gg.l.a(r4, r3)
            if (r3 != 0) goto L1e
            java.lang.Object r0 = r0.getValue()
            r2[r1] = r0
            goto L1e
        L5f:
            java.lang.String r6 = "capacity must be non-negative."
            j8.o.t(r6)
        L64:
            return
    }

    @Override // java.util.Map
    public final java.lang.Object remove(java.lang.Object r2) {
            r1 = this;
            r1.d()
            int r2 = r1.h(r2)
            if (r2 >= 0) goto Lb
            r2 = 0
            return r2
        Lb:
            java.lang.Object[] r0 = r1.f13785h
            r0.getClass()
            r0 = r0[r2]
            r1.l(r2)
            return r0
    }

    @Override // java.util.Map
    public final int size() {
            r1 = this;
            int r0 = r1.f13792o
            return r0
    }

    public final java.lang.String toString() {
            r7 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r7.f13792o
            int r1 = r1 * 3
            int r1 = r1 + 2
            r0.<init>(r1)
            java.lang.String r1 = "{"
            r0.append(r1)
            uf.e r1 = new uf.e
            r2 = 0
            r1.<init>(r7, r2)
        L16:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L64
            if (r2 <= 0) goto L23
            java.lang.String r3 = ", "
            r0.append(r3)
        L23:
            int r3 = r1.f8713g
            java.lang.Object r4 = r1.f8716j
            uf.g r4 = (uf.g) r4
            int r5 = r4.f13789l
            if (r3 >= r5) goto L5f
            int r5 = r3 + 1
            r1.f8713g = r5
            r1.f8714h = r3
            java.lang.Object[] r5 = r4.f13784g
            r3 = r5[r3]
            java.lang.String r5 = "(this Map)"
            if (r3 != r4) goto L3f
            r0.append(r5)
            goto L42
        L3f:
            r0.append(r3)
        L42:
            r3 = 61
            r0.append(r3)
            java.lang.Object[] r3 = r4.f13785h
            r3.getClass()
            int r6 = r1.f8714h
            r3 = r3[r6]
            if (r3 != r4) goto L56
            r0.append(r5)
            goto L59
        L56:
            r0.append(r3)
        L59:
            r1.d()
            int r2 = r2 + 1
            goto L16
        L5f:
            bsh.j.e()
            r0 = 0
            return r0
        L64:
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // java.util.Map
    public final java.util.Collection values() {
            r2 = this;
            p0.g r0 = r2.f13794q
            if (r0 != 0) goto Lc
            p0.g r0 = new p0.g
            r1 = 1
            r0.<init>(r2, r1)
            r2.f13794q = r0
        Lc:
            return r0
    }
}
