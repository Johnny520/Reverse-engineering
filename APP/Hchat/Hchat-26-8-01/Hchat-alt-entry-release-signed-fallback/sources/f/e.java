package f;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements java.util.Map {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int[] f2790g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public java.lang.Object[] f2791h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f2792i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public j6.l f2793j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public f.b f2794k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public f.d f2795l;

    public e() {
            r1 = this;
            r1.<init>()
            int[] r0 = g.a.f3960a
            r1.f2790g = r0
            java.lang.Object[] r0 = g.a.f3962c
            r1.f2791h = r0
            return
    }

    public final int a(java.lang.Object r6) {
            r5 = this;
            int r0 = r5.f2792i
            int r0 = r0 * 2
            java.lang.Object[] r1 = r5.f2791h
            r2 = 1
            if (r6 != 0) goto L15
            r6 = r2
        La:
            if (r6 >= r0) goto L26
            r3 = r1[r6]
            if (r3 != 0) goto L12
            int r6 = r6 >> r2
            return r6
        L12:
            int r6 = r6 + 2
            goto La
        L15:
            r3 = r2
        L16:
            if (r3 >= r0) goto L26
            r4 = r1[r3]
            boolean r4 = r6.equals(r4)
            if (r4 == 0) goto L23
            int r6 = r3 >> 1
            return r6
        L23:
            int r3 = r3 + 2
            goto L16
        L26:
            r6 = -1
            return r6
    }

    public final boolean c(java.util.Collection r2) {
            r1 = this;
            java.util.Iterator r2 = r2.iterator()
        L4:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L16
            java.lang.Object r0 = r2.next()
            boolean r0 = r1.d(r0)
            if (r0 != 0) goto L4
            r2 = 0
            return r2
        L16:
            r2 = 1
            return r2
    }

    @Override // java.util.Map
    public final void clear() {
            r1 = this;
            int r0 = r1.f2792i
            if (r0 <= 0) goto Lf
            int[] r0 = g.a.f3960a
            r1.f2790g = r0
            java.lang.Object[] r0 = g.a.f3962c
            r1.f2791h = r0
            r0 = 0
            r1.f2792i = r0
        Lf:
            int r0 = r1.f2792i
            if (r0 > 0) goto L14
            return
        L14:
            java.util.ConcurrentModificationException r0 = new java.util.ConcurrentModificationException
            r0.<init>()
            throw r0
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ boolean containsKey(java.lang.Object r1) {
            r0 = this;
            boolean r1 = r0.d(r1)
            return r1
    }

    @Override // java.util.Map
    public boolean containsValue(java.lang.Object r1) {
            r0 = this;
            int r1 = r0.a(r1)
            if (r1 < 0) goto L8
            r1 = 1
            return r1
        L8:
            r1 = 0
            return r1
    }

    public final boolean d(java.lang.Object r1) {
            r0 = this;
            int r1 = r0.f(r1)
            if (r1 < 0) goto L8
            r1 = 1
            return r1
        L8:
            r1 = 0
            return r1
    }

    public final int e(int r6, java.lang.Object r7) {
            r5 = this;
            int r0 = r5.f2792i
            if (r0 != 0) goto L6
            r6 = -1
            return r6
        L6:
            int[] r1 = r5.f2790g
            int r1 = g.a.a(r1, r0, r6)
            if (r1 >= 0) goto Lf
            goto L1b
        Lf:
            java.lang.Object[] r2 = r5.f2791h
            int r3 = r1 << 1
            r2 = r2[r3]
            boolean r2 = gg.l.a(r7, r2)
            if (r2 == 0) goto L1c
        L1b:
            return r1
        L1c:
            int r2 = r1 + 1
        L1e:
            if (r2 >= r0) goto L36
            int[] r3 = r5.f2790g
            r3 = r3[r2]
            if (r3 != r6) goto L36
            java.lang.Object[] r3 = r5.f2791h
            int r4 = r2 << 1
            r3 = r3[r4]
            boolean r3 = gg.l.a(r7, r3)
            if (r3 == 0) goto L33
            return r2
        L33:
            int r2 = r2 + 1
            goto L1e
        L36:
            int r1 = r1 + (-1)
        L38:
            if (r1 < 0) goto L50
            int[] r0 = r5.f2790g
            r0 = r0[r1]
            if (r0 != r6) goto L50
            java.lang.Object[] r0 = r5.f2791h
            int r3 = r1 << 1
            r0 = r0[r3]
            boolean r0 = gg.l.a(r7, r0)
            if (r0 == 0) goto L4d
            return r1
        L4d:
            int r1 = r1 + (-1)
            goto L38
        L50:
            int r6 = ~r2
            return r6
    }

    @Override // java.util.Map
    public final java.util.Set entrySet() {
            r2 = this;
            j6.l r0 = r2.f2793j
            if (r0 != 0) goto Lc
            j6.l r0 = new j6.l
            r1 = 2
            r0.<init>(r2, r1)
            r2.f2793j = r0
        Lc:
            return r0
    }

    @Override // java.util.Map
    public final boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            r1 = 0
            boolean r2 = r8 instanceof f.e     // Catch: java.lang.Throwable -> L77
            if (r2 == 0) goto L3a
            int r2 = r7.f2792i     // Catch: java.lang.Throwable -> L77
            r3 = r8
            f.e r3 = (f.e) r3     // Catch: java.lang.Throwable -> L77
            int r3 = r3.f2792i     // Catch: java.lang.Throwable -> L77
            if (r2 == r3) goto L13
            return r1
        L13:
            f.e r8 = (f.e) r8     // Catch: java.lang.Throwable -> L77
            r3 = r1
        L16:
            if (r3 >= r2) goto L39
            java.lang.Object r4 = r7.h(r3)     // Catch: java.lang.Throwable -> L77
            java.lang.Object r5 = r7.l(r3)     // Catch: java.lang.Throwable -> L77
            java.lang.Object r6 = r8.get(r4)     // Catch: java.lang.Throwable -> L77
            if (r5 != 0) goto L2f
            if (r6 != 0) goto L2e
            boolean r4 = r8.containsKey(r4)     // Catch: java.lang.Throwable -> L77
            if (r4 != 0) goto L36
        L2e:
            return r1
        L2f:
            boolean r4 = r5.equals(r6)     // Catch: java.lang.Throwable -> L77
            if (r4 != 0) goto L36
            return r1
        L36:
            int r3 = r3 + 1
            goto L16
        L39:
            return r0
        L3a:
            boolean r2 = r8 instanceof java.util.Map     // Catch: java.lang.Throwable -> L77
            if (r2 == 0) goto L77
            int r2 = r7.f2792i     // Catch: java.lang.Throwable -> L77
            r3 = r8
            java.util.Map r3 = (java.util.Map) r3     // Catch: java.lang.Throwable -> L77
            int r3 = r3.size()     // Catch: java.lang.Throwable -> L77
            if (r2 == r3) goto L4a
            return r1
        L4a:
            int r2 = r7.f2792i     // Catch: java.lang.Throwable -> L77
            r3 = r1
        L4d:
            if (r3 >= r2) goto L76
            java.lang.Object r4 = r7.h(r3)     // Catch: java.lang.Throwable -> L77
            java.lang.Object r5 = r7.l(r3)     // Catch: java.lang.Throwable -> L77
            r6 = r8
            java.util.Map r6 = (java.util.Map) r6     // Catch: java.lang.Throwable -> L77
            java.lang.Object r6 = r6.get(r4)     // Catch: java.lang.Throwable -> L77
            if (r5 != 0) goto L6c
            if (r6 != 0) goto L6b
            r5 = r8
            java.util.Map r5 = (java.util.Map) r5     // Catch: java.lang.Throwable -> L77
            boolean r4 = r5.containsKey(r4)     // Catch: java.lang.Throwable -> L77
            if (r4 != 0) goto L73
        L6b:
            return r1
        L6c:
            boolean r4 = r5.equals(r6)     // Catch: java.lang.Throwable -> L77
            if (r4 != 0) goto L73
            return r1
        L73:
            int r3 = r3 + 1
            goto L4d
        L76:
            return r0
        L77:
            return r1
    }

    public final int f(java.lang.Object r2) {
            r1 = this;
            if (r2 != 0) goto L7
            int r2 = r1.g()
            return r2
        L7:
            int r0 = r2.hashCode()
            int r2 = r1.e(r0, r2)
            return r2
    }

    public final int g() {
            r5 = this;
            int r0 = r5.f2792i
            if (r0 != 0) goto L6
            r0 = -1
            return r0
        L6:
            int[] r1 = r5.f2790g
            r2 = 0
            int r1 = g.a.a(r1, r0, r2)
            if (r1 >= 0) goto L10
            goto L18
        L10:
            java.lang.Object[] r2 = r5.f2791h
            int r3 = r1 << 1
            r2 = r2[r3]
            if (r2 != 0) goto L19
        L18:
            return r1
        L19:
            int r2 = r1 + 1
        L1b:
            if (r2 >= r0) goto L2f
            int[] r3 = r5.f2790g
            r3 = r3[r2]
            if (r3 != 0) goto L2f
            java.lang.Object[] r3 = r5.f2791h
            int r4 = r2 << 1
            r3 = r3[r4]
            if (r3 != 0) goto L2c
            return r2
        L2c:
            int r2 = r2 + 1
            goto L1b
        L2f:
            int r1 = r1 + (-1)
        L31:
            if (r1 < 0) goto L45
            int[] r0 = r5.f2790g
            r0 = r0[r1]
            if (r0 != 0) goto L45
            java.lang.Object[] r0 = r5.f2791h
            int r3 = r1 << 1
            r0 = r0[r3]
            if (r0 != 0) goto L42
            return r1
        L42:
            int r1 = r1 + (-1)
            goto L31
        L45:
            int r0 = ~r2
            return r0
    }

    @Override // java.util.Map
    public java.lang.Object get(java.lang.Object r2) {
            r1 = this;
            int r2 = r1.f(r2)
            if (r2 < 0) goto Lf
            java.lang.Object[] r0 = r1.f2791h
            int r2 = r2 << 1
            int r2 = r2 + 1
            r2 = r0[r2]
            return r2
        Lf:
            r2 = 0
            return r2
    }

    @Override // java.util.Map
    public final java.lang.Object getOrDefault(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            int r1 = r0.f(r1)
            if (r1 < 0) goto Lf
            java.lang.Object[] r2 = r0.f2791h
            int r1 = r1 << 1
            int r1 = r1 + 1
            r1 = r2[r1]
            return r1
        Lf:
            return r2
    }

    public final java.lang.Object h(int r2) {
            r1 = this;
            if (r2 < 0) goto Ld
            int r0 = r1.f2792i
            if (r2 >= r0) goto Ld
            java.lang.Object[] r0 = r1.f2791h
            int r2 = r2 << 1
            r2 = r0[r2]
            return r2
        Ld:
            java.lang.String r0 = "Expected index to be within 0..size()-1, but was "
            java.lang.String r2 = eh.a.l(r2, r0)
            j8.o.t(r2)
            r2 = 0
            return r2
    }

    @Override // java.util.Map
    public final int hashCode() {
            r9 = this;
            int[] r0 = r9.f2790g
            java.lang.Object[] r1 = r9.f2791h
            int r2 = r9.f2792i
            r3 = 0
            r4 = 1
            r5 = r3
            r6 = r5
        La:
            if (r5 >= r2) goto L1f
            r7 = r1[r4]
            r8 = r0[r5]
            if (r7 == 0) goto L17
            int r7 = r7.hashCode()
            goto L18
        L17:
            r7 = r3
        L18:
            r7 = r7 ^ r8
            int r6 = r6 + r7
            int r5 = r5 + 1
            int r4 = r4 + 2
            goto La
        L1f:
            return r6
    }

    public final java.lang.Object i(java.lang.Object r1) {
            r0 = this;
            int r1 = r0.f(r1)
            if (r1 < 0) goto Lb
            java.lang.Object r1 = r0.j(r1)
            return r1
        Lb:
            r1 = 0
            return r1
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
            r1 = this;
            int r0 = r1.f2792i
            if (r0 > 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    public final java.lang.Object j(int r10) {
            r9 = this;
            if (r10 < 0) goto L88
            int r0 = r9.f2792i
            if (r10 >= r0) goto L88
            java.lang.Object[] r1 = r9.f2791h
            int r2 = r10 << 1
            int r3 = r2 + 1
            r3 = r1[r3]
            r4 = 1
            if (r0 > r4) goto L15
            r9.clear()
            return r3
        L15:
            int r5 = r0 + (-1)
            int[] r6 = r9.f2790g
            int r7 = r6.length
            r8 = 8
            if (r7 <= r8) goto L62
            int r7 = r6.length
            int r7 = r7 / 3
            if (r0 >= r7) goto L62
            if (r0 <= r8) goto L29
            int r7 = r0 >> 1
            int r8 = r0 + r7
        L29:
            int[] r7 = java.util.Arrays.copyOf(r6, r8)
            r9.f2790g = r7
            java.lang.Object[] r7 = r9.f2791h
            int r8 = r8 << r4
            java.lang.Object[] r7 = java.util.Arrays.copyOf(r7, r8)
            r9.f2791h = r7
            int r7 = r9.f2792i
            if (r0 != r7) goto L5c
            if (r10 <= 0) goto L49
            int[] r7 = r9.f2790g
            r8 = 0
            tf.l.p0(r6, r7, r8, r8, r10)
            java.lang.Object[] r7 = r9.f2791h
            tf.l.n0(r8, r8, r1, r2, r7)
        L49:
            if (r10 >= r5) goto L7b
            int[] r7 = r9.f2790g
            int r8 = r10 + 1
            tf.l.p0(r6, r7, r10, r8, r0)
            java.lang.Object[] r10 = r9.f2791h
            int r4 = r8 << 1
            int r6 = r0 << 1
            tf.l.n0(r2, r4, r1, r6, r10)
            goto L7b
        L5c:
            java.util.ConcurrentModificationException r10 = new java.util.ConcurrentModificationException
            r10.<init>()
            throw r10
        L62:
            if (r10 >= r5) goto L71
            int r1 = r10 + 1
            tf.l.p0(r6, r6, r10, r1, r0)
            java.lang.Object[] r10 = r9.f2791h
            int r1 = r1 << r4
            int r6 = r0 << 1
            tf.l.n0(r2, r1, r10, r6, r10)
        L71:
            java.lang.Object[] r10 = r9.f2791h
            int r1 = r5 << 1
            r2 = 0
            r10[r1] = r2
            int r1 = r1 + r4
            r10[r1] = r2
        L7b:
            int r10 = r9.f2792i
            if (r0 != r10) goto L82
            r9.f2792i = r5
            return r3
        L82:
            java.util.ConcurrentModificationException r10 = new java.util.ConcurrentModificationException
            r10.<init>()
            throw r10
        L88:
            java.lang.String r0 = "Expected index to be within 0..size()-1, but was "
            java.lang.String r10 = eh.a.l(r10, r0)
            j8.o.t(r10)
            r10 = 0
            return r10
    }

    public final java.lang.Object k(int r3, java.lang.Object r4) {
            r2 = this;
            if (r3 < 0) goto L11
            int r0 = r2.f2792i
            if (r3 >= r0) goto L11
            int r3 = r3 << 1
            int r3 = r3 + 1
            java.lang.Object[] r0 = r2.f2791h
            r1 = r0[r3]
            r0[r3] = r4
            return r1
        L11:
            java.lang.String r4 = "Expected index to be within 0..size()-1, but was "
            java.lang.String r3 = eh.a.l(r3, r4)
            j8.o.t(r3)
            r3 = 0
            return r3
    }

    @Override // java.util.Map
    public final java.util.Set keySet() {
            r1 = this;
            f.b r0 = r1.f2794k
            if (r0 != 0) goto Lb
            f.b r0 = new f.b
            r0.<init>(r1)
            r1.f2794k = r0
        Lb:
            return r0
    }

    public final java.lang.Object l(int r2) {
            r1 = this;
            if (r2 < 0) goto Lf
            int r0 = r1.f2792i
            if (r2 >= r0) goto Lf
            java.lang.Object[] r0 = r1.f2791h
            int r2 = r2 << 1
            int r2 = r2 + 1
            r2 = r0[r2]
            return r2
        Lf:
            java.lang.String r0 = "Expected index to be within 0..size()-1, but was "
            java.lang.String r2 = eh.a.l(r2, r0)
            j8.o.t(r2)
            r2 = 0
            return r2
    }

    @Override // java.util.Map
    public final java.lang.Object put(java.lang.Object r8, java.lang.Object r9) {
            r7 = this;
            int r0 = r7.f2792i
            if (r8 == 0) goto L9
            int r1 = r8.hashCode()
            goto La
        L9:
            r1 = 0
        La:
            if (r8 == 0) goto L11
            int r2 = r7.e(r1, r8)
            goto L15
        L11:
            int r2 = r7.g()
        L15:
            if (r2 < 0) goto L22
            int r8 = r2 << 1
            int r8 = r8 + 1
            java.lang.Object[] r0 = r7.f2791h
            r1 = r0[r8]
            r0[r8] = r9
            return r1
        L22:
            int r2 = ~r2
            int[] r3 = r7.f2790g
            int r4 = r3.length
            if (r0 < r4) goto L50
            r4 = 8
            if (r0 < r4) goto L30
            int r4 = r0 >> 1
            int r4 = r4 + r0
            goto L35
        L30:
            r5 = 4
            if (r0 < r5) goto L34
            goto L35
        L34:
            r4 = r5
        L35:
            int[] r3 = java.util.Arrays.copyOf(r3, r4)
            r7.f2790g = r3
            java.lang.Object[] r3 = r7.f2791h
            int r4 = r4 << 1
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r4)
            r7.f2791h = r3
            int r3 = r7.f2792i
            if (r0 != r3) goto L4a
            goto L50
        L4a:
            java.util.ConcurrentModificationException r8 = new java.util.ConcurrentModificationException
            r8.<init>()
            throw r8
        L50:
            if (r2 >= r0) goto L66
            int[] r3 = r7.f2790g
            int r4 = r2 + 1
            tf.l.p0(r3, r3, r4, r2, r0)
            java.lang.Object[] r3 = r7.f2791h
            int r4 = r4 << 1
            int r5 = r2 << 1
            int r6 = r7.f2792i
            int r6 = r6 << 1
            tf.l.n0(r4, r5, r3, r6, r3)
        L66:
            int r3 = r7.f2792i
            if (r0 != r3) goto L81
            int[] r0 = r7.f2790g
            int r4 = r0.length
            if (r2 >= r4) goto L81
            r0[r2] = r1
            java.lang.Object[] r0 = r7.f2791h
            int r1 = r2 << 1
            r0[r1] = r8
            int r1 = r1 + 1
            r0[r1] = r9
            int r3 = r3 + 1
            r7.f2792i = r3
            r8 = 0
            return r8
        L81:
            java.util.ConcurrentModificationException r8 = new java.util.ConcurrentModificationException
            r8.<init>()
            throw r8
    }

    @Override // java.util.Map
    public final void putAll(java.util.Map r5) {
            r4 = this;
            int r0 = r4.f2792i
            int r1 = r5.size()
            int r1 = r1 + r0
            int r0 = r4.f2792i
            int[] r2 = r4.f2790g
            int r3 = r2.length
            if (r3 >= r1) goto L1e
            int[] r2 = java.util.Arrays.copyOf(r2, r1)
            r4.f2790g = r2
            java.lang.Object[] r2 = r4.f2791h
            int r1 = r1 * 2
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r2, r1)
            r4.f2791h = r1
        L1e:
            int r1 = r4.f2792i
            if (r1 != r0) goto L43
            java.util.Set r5 = r5.entrySet()
            java.util.Iterator r5 = r5.iterator()
        L2a:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L42
            java.lang.Object r0 = r5.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.Object r0 = r0.getValue()
            r4.put(r1, r0)
            goto L2a
        L42:
            return
        L43:
            java.util.ConcurrentModificationException r5 = new java.util.ConcurrentModificationException
            r5.<init>()
            throw r5
    }

    @Override // java.util.Map
    public final java.lang.Object putIfAbsent(java.lang.Object r2, java.lang.Object r3) {
            r1 = this;
            java.lang.Object r0 = r1.get(r2)
            if (r0 != 0) goto Lb
            java.lang.Object r2 = r1.put(r2, r3)
            return r2
        Lb:
            return r0
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ java.lang.Object remove(java.lang.Object r1) {
            r0 = this;
            java.lang.Object r1 = r0.i(r1)
            return r1
    }

    @Override // java.util.Map
    public final boolean remove(java.lang.Object r2, java.lang.Object r3) {
            r1 = this;
            int r2 = r1.f(r2)
            if (r2 < 0) goto L15
            java.lang.Object r0 = r1.l(r2)
            boolean r3 = gg.l.a(r3, r0)
            if (r3 == 0) goto L15
            r1.j(r2)
            r2 = 1
            return r2
        L15:
            r2 = 0
            return r2
    }

    @Override // java.util.Map
    public final java.lang.Object replace(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            int r1 = r0.f(r1)
            if (r1 < 0) goto Lb
            java.lang.Object r1 = r0.k(r1, r2)
            return r1
        Lb:
            r1 = 0
            return r1
    }

    @Override // java.util.Map
    public final boolean replace(java.lang.Object r2, java.lang.Object r3, java.lang.Object r4) {
            r1 = this;
            int r2 = r1.f(r2)
            if (r2 < 0) goto L15
            java.lang.Object r0 = r1.l(r2)
            boolean r3 = gg.l.a(r3, r0)
            if (r3 == 0) goto L15
            r1.k(r2, r4)
            r2 = 1
            return r2
        L15:
            r2 = 0
            return r2
    }

    @Override // java.util.Map
    public final int size() {
            r1 = this;
            int r0 = r1.f2792i
            return r0
    }

    public final java.lang.String toString() {
            r5 = this;
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L9
            java.lang.String r0 = "{}"
            return r0
        L9:
            int r0 = r5.f2792i
            int r0 = r0 * 28
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r0 = 123(0x7b, float:1.72E-43)
            r1.append(r0)
            int r0 = r5.f2792i
            r2 = 0
        L1a:
            if (r2 >= r0) goto L47
            if (r2 <= 0) goto L23
            java.lang.String r3 = ", "
            r1.append(r3)
        L23:
            java.lang.Object r3 = r5.h(r2)
            java.lang.String r4 = "(this Map)"
            if (r3 == r1) goto L2f
            r1.append(r3)
            goto L32
        L2f:
            r1.append(r4)
        L32:
            r3 = 61
            r1.append(r3)
            java.lang.Object r3 = r5.l(r2)
            if (r3 == r1) goto L41
            r1.append(r3)
            goto L44
        L41:
            r1.append(r4)
        L44:
            int r2 = r2 + 1
            goto L1a
        L47:
            r0 = 125(0x7d, float:1.75E-43)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
    }

    @Override // java.util.Map
    public final java.util.Collection values() {
            r1 = this;
            f.d r0 = r1.f2795l
            if (r0 != 0) goto Lb
            f.d r0 = new f.d
            r0.<init>(r1)
            r1.f2795l = r0
        Lb:
            return r0
    }
}
