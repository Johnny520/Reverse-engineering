package tf;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends tf.g {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final java.lang.Object[] f13162j = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f13163g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public java.lang.Object[] f13164h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f13165i;

    static {
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            tf.k.f13162j = r0
            return
    }

    public k() {
            r1 = this;
            r1.<init>()
            java.lang.Object[] r0 = tf.k.f13162j
            r1.f13164h = r0
            return
    }

    @Override // tf.g
    public final int a() {
            r1 = this;
            int r0 = r1.f13165i
            return r0
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int r8, java.lang.Object r9) {
            r7 = this;
            tf.c r0 = tf.f.Companion
            int r1 = r7.f13165i
            r0.getClass()
            tf.c.b(r8, r1)
            int r0 = r7.f13165i
            if (r8 != r0) goto L12
            r7.addLast(r9)
            return
        L12:
            if (r8 != 0) goto L18
            r7.addFirst(r9)
            return
        L18:
            r7.k()
            int r0 = r7.f13165i
            r1 = 1
            int r0 = r0 + r1
            r7.e(r0)
            int r0 = r7.f13163g
            int r0 = r0 + r8
            int r0 = r7.j(r0)
            int r2 = r7.f13165i
            int r3 = r2 + 1
            int r3 = r3 >> r1
            r4 = 0
            if (r8 >= r3) goto L74
            if (r0 != 0) goto L3b
            java.lang.Object[] r8 = r7.f13164h
            r8.getClass()
            int r8 = r8.length
            int r8 = r8 - r1
            goto L3d
        L3b:
            int r8 = r0 + (-1)
        L3d:
            int r0 = r7.f13163g
            if (r0 != 0) goto L47
            java.lang.Object[] r0 = r7.f13164h
            r0.getClass()
            int r0 = r0.length
        L47:
            int r0 = r0 - r1
            int r2 = r7.f13163g
            java.lang.Object[] r3 = r7.f13164h
            if (r8 < r2) goto L5a
            r4 = r3[r2]
            r3[r0] = r4
            int r4 = r2 + 1
            int r5 = r8 + 1
            tf.l.n0(r2, r4, r3, r5, r3)
            goto L6d
        L5a:
            int r5 = r2 + (-1)
            int r6 = r3.length
            tf.l.n0(r5, r2, r3, r6, r3)
            java.lang.Object[] r2 = r7.f13164h
            int r3 = r2.length
            int r3 = r3 - r1
            r5 = r2[r4]
            r2[r3] = r5
            int r3 = r8 + 1
            tf.l.n0(r4, r1, r2, r3, r2)
        L6d:
            java.lang.Object[] r2 = r7.f13164h
            r2[r8] = r9
            r7.f13163g = r0
            goto L9b
        L74:
            int r8 = r7.f13163g
            int r2 = r2 + r8
            int r8 = r7.j(r2)
            java.lang.Object[] r2 = r7.f13164h
            if (r0 >= r8) goto L85
            int r3 = r0 + 1
            tf.l.n0(r3, r0, r2, r8, r2)
            goto L97
        L85:
            tf.l.n0(r1, r4, r2, r8, r2)
            java.lang.Object[] r8 = r7.f13164h
            int r2 = r8.length
            int r2 = r2 - r1
            r2 = r8[r2]
            r8[r4] = r2
            int r2 = r0 + 1
            int r3 = r8.length
            int r3 = r3 - r1
            tf.l.n0(r2, r0, r8, r3, r8)
        L97:
            java.lang.Object[] r8 = r7.f13164h
            r8[r0] = r9
        L9b:
            int r8 = r7.f13165i
            int r8 = r8 + r1
            r7.f13165i = r8
            return
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(java.lang.Object r1) {
            r0 = this;
            r0.addLast(r1)
            r1 = 1
            return r1
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int r9, java.util.Collection r10) {
            r8 = this;
            r10.getClass()
            tf.c r0 = tf.f.Companion
            int r1 = r8.f13165i
            r0.getClass()
            tf.c.b(r9, r1)
            boolean r0 = r10.isEmpty()
            r1 = 0
            if (r0 == 0) goto L15
            return r1
        L15:
            int r0 = r8.f13165i
            if (r9 != r0) goto L1e
            boolean r9 = r8.addAll(r10)
            return r9
        L1e:
            r8.k()
            int r0 = r8.f13165i
            int r2 = r10.size()
            int r2 = r2 + r0
            r8.e(r2)
            int r0 = r8.f13163g
            int r2 = r8.f13165i
            int r2 = r2 + r0
            int r0 = r8.j(r2)
            int r2 = r8.f13163g
            int r2 = r2 + r9
            int r2 = r8.j(r2)
            int r3 = r10.size()
            int r4 = r8.f13165i
            r5 = 1
            int r4 = r4 + r5
            int r4 = r4 >> r5
            if (r9 >= r4) goto L91
            int r9 = r8.f13163g
            int r0 = r9 - r3
            java.lang.Object[] r4 = r8.f13164h
            if (r2 < r9) goto L6e
            if (r0 < 0) goto L54
            tf.l.n0(r0, r9, r4, r2, r4)
            goto L86
        L54:
            int r6 = r4.length
            int r0 = r0 + r6
            int r6 = r2 - r9
            int r7 = r4.length
            int r7 = r7 - r0
            if (r7 < r6) goto L60
            tf.l.n0(r0, r9, r4, r2, r4)
            goto L86
        L60:
            int r6 = r9 + r7
            tf.l.n0(r0, r9, r4, r6, r4)
            java.lang.Object[] r9 = r8.f13164h
            int r4 = r8.f13163g
            int r4 = r4 + r7
            tf.l.n0(r1, r4, r9, r2, r9)
            goto L86
        L6e:
            int r6 = r4.length
            tf.l.n0(r0, r9, r4, r6, r4)
            java.lang.Object[] r9 = r8.f13164h
            if (r3 < r2) goto L7c
            int r4 = r9.length
            int r4 = r4 - r3
            tf.l.n0(r4, r1, r9, r2, r9)
            goto L86
        L7c:
            int r4 = r9.length
            int r4 = r4 - r3
            tf.l.n0(r4, r1, r9, r3, r9)
            java.lang.Object[] r9 = r8.f13164h
            tf.l.n0(r1, r3, r9, r2, r9)
        L86:
            r8.f13163g = r0
            int r2 = r2 - r3
            int r9 = r8.h(r2)
            r8.d(r9, r10)
            return r5
        L91:
            int r9 = r2 + r3
            java.lang.Object[] r4 = r8.f13164h
            if (r2 >= r0) goto Lb5
            int r3 = r3 + r0
            int r6 = r4.length
            if (r3 > r6) goto L9f
            tf.l.n0(r9, r2, r4, r0, r4)
            goto Ld1
        L9f:
            int r6 = r4.length
            if (r9 < r6) goto La8
            int r1 = r4.length
            int r9 = r9 - r1
            tf.l.n0(r9, r2, r4, r0, r4)
            goto Ld1
        La8:
            int r6 = r4.length
            int r3 = r3 - r6
            int r3 = r0 - r3
            tf.l.n0(r1, r3, r4, r0, r4)
            java.lang.Object[] r0 = r8.f13164h
            tf.l.n0(r9, r2, r0, r3, r0)
            goto Ld1
        Lb5:
            tf.l.n0(r3, r1, r4, r0, r4)
            java.lang.Object[] r0 = r8.f13164h
            int r4 = r0.length
            if (r9 < r4) goto Lc4
            int r1 = r0.length
            int r9 = r9 - r1
            int r1 = r0.length
            tf.l.n0(r9, r2, r0, r1, r0)
            goto Ld1
        Lc4:
            int r4 = r0.length
            int r4 = r4 - r3
            int r6 = r0.length
            tf.l.n0(r1, r4, r0, r6, r0)
            java.lang.Object[] r0 = r8.f13164h
            int r1 = r0.length
            int r1 = r1 - r3
            tf.l.n0(r9, r2, r0, r1, r0)
        Ld1:
            r8.d(r2, r10)
            return r5
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(java.util.Collection r3) {
            r2 = this;
            r3.getClass()
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto Lb
            r3 = 0
            return r3
        Lb:
            r2.k()
            int r0 = r2.a()
            int r1 = r3.size()
            int r1 = r1 + r0
            r2.e(r1)
            int r0 = r2.f13163g
            int r1 = r2.a()
            int r1 = r1 + r0
            int r0 = r2.j(r1)
            r2.d(r0, r3)
            r3 = 1
            return r3
    }

    public final void addFirst(java.lang.Object r3) {
            r2 = this;
            r2.k()
            int r0 = r2.f13165i
            int r0 = r0 + 1
            r2.e(r0)
            int r0 = r2.f13163g
            if (r0 != 0) goto L14
            java.lang.Object[] r0 = r2.f13164h
            r0.getClass()
            int r0 = r0.length
        L14:
            int r0 = r0 + (-1)
            r2.f13163g = r0
            java.lang.Object[] r1 = r2.f13164h
            r1[r0] = r3
            int r3 = r2.f13165i
            int r3 = r3 + 1
            r2.f13165i = r3
            return
    }

    public final void addLast(java.lang.Object r4) {
            r3 = this;
            r3.k()
            int r0 = r3.a()
            int r0 = r0 + 1
            r3.e(r0)
            java.lang.Object[] r0 = r3.f13164h
            int r1 = r3.f13163g
            int r2 = r3.a()
            int r2 = r2 + r1
            int r1 = r3.j(r2)
            r0[r1] = r4
            int r4 = r3.a()
            int r4 = r4 + 1
            r3.f13165i = r4
            return
    }

    @Override // tf.g
    public final java.lang.Object c(int r9) {
            r8 = this;
            tf.c r0 = tf.f.Companion
            int r1 = r8.f13165i
            r0.getClass()
            tf.c.a(r9, r1)
            int r0 = r8.a()
            r1 = 1
            int r0 = r0 - r1
            if (r9 != r0) goto L17
            java.lang.Object r9 = r8.removeLast()
            return r9
        L17:
            if (r9 != 0) goto L1e
            java.lang.Object r9 = r8.removeFirst()
            return r9
        L1e:
            r8.k()
            int r0 = r8.f13163g
            int r0 = r0 + r9
            int r0 = r8.j(r0)
            java.lang.Object[] r2 = r8.f13164h
            r3 = r2[r0]
            int r4 = r8.f13165i
            int r4 = r4 >> r1
            int r5 = r8.f13163g
            r6 = 0
            r7 = 0
            if (r9 >= r4) goto L5e
            if (r0 < r5) goto L3d
            int r9 = r5 + 1
            tf.l.n0(r9, r5, r2, r0, r2)
            goto L51
        L3d:
            tf.l.n0(r1, r7, r2, r0, r2)
            java.lang.Object[] r9 = r8.f13164h
            int r0 = r9.length
            int r0 = r0 - r1
            r0 = r9[r0]
            r9[r7] = r0
            int r0 = r8.f13163g
            int r2 = r0 + 1
            int r4 = r9.length
            int r4 = r4 - r1
            tf.l.n0(r2, r0, r9, r4, r9)
        L51:
            java.lang.Object[] r9 = r8.f13164h
            int r0 = r8.f13163g
            r9[r0] = r6
            int r9 = r8.f(r0)
            r8.f13163g = r9
            goto L8b
        L5e:
            int r9 = r8.a()
            int r9 = r9 - r1
            int r9 = r9 + r5
            int r9 = r8.j(r9)
            java.lang.Object[] r2 = r8.f13164h
            if (r0 > r9) goto L74
            int r4 = r0 + 1
            int r5 = r9 + 1
            tf.l.n0(r0, r4, r2, r5, r2)
            goto L87
        L74:
            int r4 = r0 + 1
            int r5 = r2.length
            tf.l.n0(r0, r4, r2, r5, r2)
            java.lang.Object[] r0 = r8.f13164h
            int r2 = r0.length
            int r2 = r2 - r1
            r4 = r0[r7]
            r0[r2] = r4
            int r2 = r9 + 1
            tf.l.n0(r7, r1, r0, r2, r0)
        L87:
            java.lang.Object[] r0 = r8.f13164h
            r0[r9] = r6
        L8b:
            int r9 = r8.f13165i
            int r9 = r9 - r1
            r8.f13165i = r9
            return r3
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
            r2 = this;
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L19
            r2.k()
            int r0 = r2.f13163g
            int r1 = r2.a()
            int r1 = r1 + r0
            int r0 = r2.j(r1)
            int r1 = r2.f13163g
            r2.i(r1, r0)
        L19:
            r0 = 0
            r2.f13163g = r0
            r2.f13165i = r0
            return
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(java.lang.Object r2) {
            r1 = this;
            int r2 = r1.indexOf(r2)
            r0 = -1
            if (r2 == r0) goto L9
            r2 = 1
            return r2
        L9:
            r2 = 0
            return r2
    }

    public final void d(int r5, java.util.Collection r6) {
            r4 = this;
            java.util.Iterator r0 = r6.iterator()
            java.lang.Object[] r1 = r4.f13164h
            int r1 = r1.length
        L7:
            if (r5 >= r1) goto L1a
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L1a
            java.lang.Object[] r2 = r4.f13164h
            java.lang.Object r3 = r0.next()
            r2[r5] = r3
            int r5 = r5 + 1
            goto L7
        L1a:
            int r5 = r4.f13163g
            r1 = 0
        L1d:
            if (r1 >= r5) goto L30
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L30
            java.lang.Object[] r2 = r4.f13164h
            java.lang.Object r3 = r0.next()
            r2[r1] = r3
            int r1 = r1 + 1
            goto L1d
        L30:
            int r5 = r4.f13165i
            int r6 = r6.size()
            int r6 = r6 + r5
            r4.f13165i = r6
            return
    }

    public final void e(int r5) {
            r4 = this;
            if (r5 < 0) goto L39
            java.lang.Object[] r0 = r4.f13164h
            int r1 = r0.length
            if (r5 > r1) goto L8
            return
        L8:
            java.lang.Object[] r1 = tf.k.f13162j
            if (r0 != r1) goto L16
            r0 = 10
            if (r5 >= r0) goto L11
            r5 = r0
        L11:
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r4.f13164h = r5
            return
        L16:
            tf.c r1 = tf.f.Companion
            int r0 = r0.length
            r1.getClass()
            int r5 = tf.c.d(r0, r5)
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.Object[] r0 = r4.f13164h
            int r1 = r4.f13163g
            int r2 = r0.length
            r3 = 0
            tf.l.n0(r3, r1, r0, r2, r5)
            java.lang.Object[] r0 = r4.f13164h
            int r1 = r0.length
            int r2 = r4.f13163g
            int r1 = r1 - r2
            tf.l.n0(r1, r3, r0, r2, r5)
            r4.f13163g = r3
            r4.f13164h = r5
            return
        L39:
            java.lang.String r5 = "Deque is too big."
            j8.o.A(r5)
            return
    }

    public final int f(int r2) {
            r1 = this;
            java.lang.Object[] r0 = r1.f13164h
            r0.getClass()
            int r0 = r0.length
            int r0 = r0 + (-1)
            if (r2 != r0) goto Lc
            r2 = 0
            return r2
        Lc:
            int r2 = r2 + 1
            return r2
    }

    public final java.lang.Object g() {
            r3 = this;
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L8
            r0 = 0
            return r0
        L8:
            java.lang.Object[] r0 = r3.f13164h
            int r1 = r3.f13163g
            int r2 = r3.size()
            int r2 = r2 + (-1)
            int r2 = r2 + r1
            int r1 = r3.j(r2)
            r0 = r0[r1]
            return r0
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.lang.Object get(int r3) {
            r2 = this;
            tf.c r0 = tf.f.Companion
            int r1 = r2.f13165i
            r0.getClass()
            tf.c.a(r3, r1)
            java.lang.Object[] r0 = r2.f13164h
            int r1 = r2.f13163g
            int r1 = r1 + r3
            int r3 = r2.j(r1)
            r3 = r0[r3]
            return r3
    }

    public final int h(int r2) {
            r1 = this;
            if (r2 >= 0) goto L6
            java.lang.Object[] r0 = r1.f13164h
            int r0 = r0.length
            int r2 = r2 + r0
        L6:
            return r2
    }

    public final void i(int r4, int r5) {
            r3 = this;
            java.lang.Object[] r0 = r3.f13164h
            r1 = 0
            if (r4 >= r5) goto L9
            tf.l.v0(r4, r5, r1, r0)
            return
        L9:
            int r2 = r0.length
            tf.l.v0(r4, r2, r1, r0)
            java.lang.Object[] r4 = r3.f13164h
            r0 = 0
            tf.l.v0(r0, r5, r1, r4)
            return
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(java.lang.Object r5) {
            r4 = this;
            int r0 = r4.f13163g
            int r1 = r4.a()
            int r1 = r1 + r0
            int r0 = r4.j(r1)
            int r1 = r4.f13163g
            if (r1 >= r0) goto L22
        Lf:
            if (r1 >= r0) goto L58
            java.lang.Object[] r2 = r4.f13164h
            r2 = r2[r1]
            boolean r2 = gg.l.a(r5, r2)
            if (r2 == 0) goto L1f
            int r5 = r4.f13163g
        L1d:
            int r1 = r1 - r5
            return r1
        L1f:
            int r1 = r1 + 1
            goto Lf
        L22:
            boolean r1 = r4.isEmpty()
            if (r1 != 0) goto L58
            int r1 = r4.f13163g
            if (r1 < r0) goto L58
            java.lang.Object[] r2 = r4.f13164h
            int r2 = r2.length
        L2f:
            if (r1 >= r2) goto L41
            java.lang.Object[] r3 = r4.f13164h
            r3 = r3[r1]
            boolean r3 = gg.l.a(r5, r3)
            if (r3 == 0) goto L3e
            int r5 = r4.f13163g
            goto L1d
        L3e:
            int r1 = r1 + 1
            goto L2f
        L41:
            r1 = 0
        L42:
            if (r1 >= r0) goto L58
            java.lang.Object[] r2 = r4.f13164h
            r2 = r2[r1]
            boolean r2 = gg.l.a(r5, r2)
            if (r2 == 0) goto L55
            java.lang.Object[] r5 = r4.f13164h
            int r5 = r5.length
            int r1 = r1 + r5
            int r5 = r4.f13163g
            goto L1d
        L55:
            int r1 = r1 + 1
            goto L42
        L58:
            r5 = -1
            return r5
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
            r1 = this;
            int r0 = r1.a()
            if (r0 != 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    public final int j(int r3) {
            r2 = this;
            java.lang.Object[] r0 = r2.f13164h
            int r1 = r0.length
            if (r3 < r1) goto L7
            int r0 = r0.length
            int r3 = r3 - r0
        L7:
            return r3
    }

    public final void k() {
            r1 = this;
            int r0 = r1.modCount
            int r0 = r0 + 1
            r1.modCount = r0
            return
    }

    public final java.lang.Object last() {
            r3 = this;
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L18
            java.lang.Object[] r0 = r3.f13164h
            int r1 = r3.f13163g
            int r2 = r3.size()
            int r2 = r2 + (-1)
            int r2 = r2 + r1
            int r1 = r3.j(r2)
            r0 = r0[r1]
            return r0
        L18:
            java.lang.String r0 = "ArrayDeque is empty."
            j8.o.l(r0)
            r0 = 0
            return r0
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(java.lang.Object r5) {
            r4 = this;
            int r0 = r4.f13163g
            int r1 = r4.f13165i
            int r1 = r1 + r0
            int r0 = r4.j(r1)
            int r1 = r4.f13163g
            r2 = -1
            if (r1 >= r0) goto L25
            int r0 = r0 + (-1)
            if (r1 > r0) goto L63
        L12:
            java.lang.Object[] r3 = r4.f13164h
            r3 = r3[r0]
            boolean r3 = gg.l.a(r5, r3)
            if (r3 == 0) goto L20
            int r5 = r4.f13163g
        L1e:
            int r0 = r0 - r5
            return r0
        L20:
            if (r0 == r1) goto L63
            int r0 = r0 + (-1)
            goto L12
        L25:
            boolean r1 = r4.isEmpty()
            if (r1 != 0) goto L63
            int r1 = r4.f13163g
            if (r1 < r0) goto L63
            int r0 = r0 + (-1)
        L31:
            java.lang.Object[] r1 = r4.f13164h
            if (r2 >= r0) goto L47
            r1 = r1[r0]
            boolean r1 = gg.l.a(r5, r1)
            if (r1 == 0) goto L44
            java.lang.Object[] r5 = r4.f13164h
            int r5 = r5.length
            int r0 = r0 + r5
            int r5 = r4.f13163g
            goto L1e
        L44:
            int r0 = r0 + (-1)
            goto L31
        L47:
            r1.getClass()
            int r0 = r1.length
            int r0 = r0 + (-1)
            int r1 = r4.f13163g
            if (r1 > r0) goto L63
        L51:
            java.lang.Object[] r3 = r4.f13164h
            r3 = r3[r0]
            boolean r3 = gg.l.a(r5, r3)
            if (r3 == 0) goto L5e
            int r5 = r4.f13163g
            goto L1e
        L5e:
            if (r0 == r1) goto L63
            int r0 = r0 + (-1)
            goto L51
        L63:
            return r2
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(java.lang.Object r2) {
            r1 = this;
            int r2 = r1.indexOf(r2)
            r0 = -1
            if (r2 != r0) goto L9
            r2 = 0
            return r2
        L9:
            r1.c(r2)
            r2 = 1
            return r2
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(java.util.Collection r12) {
            r11 = this;
            r12.getClass()
            boolean r0 = r11.isEmpty()
            r1 = 0
            if (r0 != 0) goto L8d
            java.lang.Object[] r0 = r11.f13164h
            int r0 = r0.length
            if (r0 != 0) goto L11
            goto L8d
        L11:
            int r0 = r11.f13163g
            int r2 = r11.a()
            int r2 = r2 + r0
            int r0 = r11.j(r2)
            int r2 = r11.f13163g
            r3 = 0
            r4 = 1
            if (r2 >= r0) goto L3f
            r5 = r2
        L23:
            java.lang.Object[] r6 = r11.f13164h
            if (r2 >= r0) goto L3b
            r6 = r6[r2]
            boolean r7 = r12.contains(r6)
            if (r7 != 0) goto L37
            java.lang.Object[] r7 = r11.f13164h
            int r8 = r5 + 1
            r7[r5] = r6
            r5 = r8
            goto L38
        L37:
            r1 = r4
        L38:
            int r2 = r2 + 1
            goto L23
        L3b:
            tf.l.v0(r5, r0, r3, r6)
            goto L7f
        L3f:
            java.lang.Object[] r5 = r11.f13164h
            int r5 = r5.length
            r7 = r1
            r6 = r2
        L44:
            if (r2 >= r5) goto L5e
            java.lang.Object[] r8 = r11.f13164h
            r9 = r8[r2]
            r8[r2] = r3
            boolean r8 = r12.contains(r9)
            if (r8 != 0) goto L5a
            java.lang.Object[] r8 = r11.f13164h
            int r10 = r6 + 1
            r8[r6] = r9
            r6 = r10
            goto L5b
        L5a:
            r7 = r4
        L5b:
            int r2 = r2 + 1
            goto L44
        L5e:
            int r2 = r11.j(r6)
            r5 = r2
        L63:
            if (r1 >= r0) goto L7e
            java.lang.Object[] r2 = r11.f13164h
            r6 = r2[r1]
            r2[r1] = r3
            boolean r2 = r12.contains(r6)
            if (r2 != 0) goto L7a
            java.lang.Object[] r2 = r11.f13164h
            r2[r5] = r6
            int r5 = r11.f(r5)
            goto L7b
        L7a:
            r7 = r4
        L7b:
            int r1 = r1 + 1
            goto L63
        L7e:
            r1 = r7
        L7f:
            if (r1 == 0) goto L8d
            r11.k()
            int r12 = r11.f13163g
            int r5 = r5 - r12
            int r12 = r11.h(r5)
            r11.f13165i = r12
        L8d:
            return r1
    }

    public final java.lang.Object removeFirst() {
            r4 = this;
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L21
            r4.k()
            java.lang.Object[] r0 = r4.f13164h
            int r1 = r4.f13163g
            r2 = r0[r1]
            r3 = 0
            r0[r1] = r3
            int r0 = r4.f(r1)
            r4.f13163g = r0
            int r0 = r4.a()
            int r0 = r0 + (-1)
            r4.f13165i = r0
            return r2
        L21:
            java.lang.String r0 = "ArrayDeque is empty."
            j8.o.l(r0)
            r0 = 0
            return r0
    }

    public final java.lang.Object removeLast() {
            r4 = this;
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L26
            r4.k()
            int r0 = r4.f13163g
            int r1 = r4.size()
            int r1 = r1 + (-1)
            int r1 = r1 + r0
            int r0 = r4.j(r1)
            java.lang.Object[] r1 = r4.f13164h
            r2 = r1[r0]
            r3 = 0
            r1[r0] = r3
            int r0 = r4.a()
            int r0 = r0 + (-1)
            r4.f13165i = r0
            return r2
        L26:
            java.lang.String r0 = "ArrayDeque is empty."
            j8.o.l(r0)
            r0 = 0
            return r0
    }

    @Override // java.util.AbstractList
    public final void removeRange(int r8, int r9) {
            r7 = this;
            tf.c r0 = tf.f.Companion
            int r1 = r7.f13165i
            r0.getClass()
            tf.c.c(r8, r9, r1)
            int r0 = r9 - r8
            if (r0 != 0) goto Lf
            return
        Lf:
            int r1 = r7.f13165i
            if (r0 != r1) goto L17
            r7.clear()
            return
        L17:
            r1 = 1
            if (r0 != r1) goto L1e
            r7.c(r8)
            return
        L1e:
            r7.k()
            int r2 = r7.f13165i
            int r2 = r2 - r9
            int r3 = r7.f13163g
            if (r8 >= r2) goto L69
            int r2 = r8 + (-1)
            int r2 = r2 + r3
            int r2 = r7.j(r2)
            int r9 = r9 - r1
            int r1 = r7.f13163g
            int r1 = r1 + r9
            int r9 = r7.j(r1)
        L37:
            if (r8 <= 0) goto L5a
            int r1 = r2 + 1
            int r3 = r9 + 1
            int r3 = java.lang.Math.min(r1, r3)
            int r3 = java.lang.Math.min(r8, r3)
            java.lang.Object[] r4 = r7.f13164h
            int r9 = r9 - r3
            int r5 = r9 + 1
            int r2 = r2 - r3
            int r6 = r2 + 1
            tf.l.n0(r5, r6, r4, r1, r4)
            int r2 = r7.h(r2)
            int r9 = r7.h(r9)
            int r8 = r8 - r3
            goto L37
        L5a:
            int r8 = r7.f13163g
            int r8 = r8 + r0
            int r8 = r7.j(r8)
            int r9 = r7.f13163g
            r7.i(r9, r8)
            r7.f13163g = r8
            goto Lab
        L69:
            int r3 = r3 + r9
            int r1 = r7.j(r3)
            int r2 = r7.f13163g
            int r2 = r2 + r8
            int r8 = r7.j(r2)
            int r2 = r7.f13165i
        L77:
            int r2 = r2 - r9
            if (r2 <= 0) goto L99
            java.lang.Object[] r9 = r7.f13164h
            int r3 = r9.length
            int r3 = r3 - r1
            int r9 = r9.length
            int r9 = r9 - r8
            int r9 = java.lang.Math.min(r3, r9)
            int r9 = java.lang.Math.min(r2, r9)
            java.lang.Object[] r3 = r7.f13164h
            int r4 = r1 + r9
            tf.l.n0(r8, r1, r3, r4, r3)
            int r1 = r7.j(r4)
            int r8 = r8 + r9
            int r8 = r7.j(r8)
            goto L77
        L99:
            int r8 = r7.f13163g
            int r9 = r7.f13165i
            int r9 = r9 + r8
            int r8 = r7.j(r9)
            int r9 = r8 - r0
            int r9 = r7.h(r9)
            r7.i(r9, r8)
        Lab:
            int r8 = r7.f13165i
            int r8 = r8 - r0
            r7.f13165i = r8
            return
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(java.util.Collection r12) {
            r11 = this;
            r12.getClass()
            boolean r0 = r11.isEmpty()
            r1 = 0
            if (r0 != 0) goto L8d
            java.lang.Object[] r0 = r11.f13164h
            int r0 = r0.length
            if (r0 != 0) goto L11
            goto L8d
        L11:
            int r0 = r11.f13163g
            int r2 = r11.a()
            int r2 = r2 + r0
            int r0 = r11.j(r2)
            int r2 = r11.f13163g
            r3 = 0
            r4 = 1
            if (r2 >= r0) goto L3f
            r5 = r2
        L23:
            java.lang.Object[] r6 = r11.f13164h
            if (r2 >= r0) goto L3b
            r6 = r6[r2]
            boolean r7 = r12.contains(r6)
            if (r7 == 0) goto L37
            java.lang.Object[] r7 = r11.f13164h
            int r8 = r5 + 1
            r7[r5] = r6
            r5 = r8
            goto L38
        L37:
            r1 = r4
        L38:
            int r2 = r2 + 1
            goto L23
        L3b:
            tf.l.v0(r5, r0, r3, r6)
            goto L7f
        L3f:
            java.lang.Object[] r5 = r11.f13164h
            int r5 = r5.length
            r7 = r1
            r6 = r2
        L44:
            if (r2 >= r5) goto L5e
            java.lang.Object[] r8 = r11.f13164h
            r9 = r8[r2]
            r8[r2] = r3
            boolean r8 = r12.contains(r9)
            if (r8 == 0) goto L5a
            java.lang.Object[] r8 = r11.f13164h
            int r10 = r6 + 1
            r8[r6] = r9
            r6 = r10
            goto L5b
        L5a:
            r7 = r4
        L5b:
            int r2 = r2 + 1
            goto L44
        L5e:
            int r2 = r11.j(r6)
            r5 = r2
        L63:
            if (r1 >= r0) goto L7e
            java.lang.Object[] r2 = r11.f13164h
            r6 = r2[r1]
            r2[r1] = r3
            boolean r2 = r12.contains(r6)
            if (r2 == 0) goto L7a
            java.lang.Object[] r2 = r11.f13164h
            r2[r5] = r6
            int r5 = r11.f(r5)
            goto L7b
        L7a:
            r7 = r4
        L7b:
            int r1 = r1 + 1
            goto L63
        L7e:
            r1 = r7
        L7f:
            if (r1 == 0) goto L8d
            r11.k()
            int r12 = r11.f13163g
            int r5 = r5 - r12
            int r12 = r11.h(r5)
            r11.f13165i = r12
        L8d:
            return r1
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.lang.Object set(int r3, java.lang.Object r4) {
            r2 = this;
            tf.c r0 = tf.f.Companion
            int r1 = r2.f13165i
            r0.getClass()
            tf.c.a(r3, r1)
            int r0 = r2.f13163g
            int r0 = r0 + r3
            int r3 = r2.j(r0)
            java.lang.Object[] r0 = r2.f13164h
            r1 = r0[r3]
            r0[r3] = r4
            return r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final java.lang.Object[] toArray() {
            r1 = this;
            int r0 = r1.a()
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Object[] r0 = r1.toArray(r0)
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final java.lang.Object[] toArray(java.lang.Object[] r6) {
            r5 = this;
            r6.getClass()
            int r0 = r6.length
            int r1 = r5.f13165i
            if (r0 < r1) goto L9
            goto L1a
        L9:
            java.lang.Class r6 = r6.getClass()
            java.lang.Class r6 = r6.getComponentType()
            java.lang.Object r6 = java.lang.reflect.Array.newInstance(r6, r1)
            r6.getClass()
            java.lang.Object[] r6 = (java.lang.Object[]) r6
        L1a:
            int r0 = r5.f13163g
            int r1 = r5.f13165i
            int r1 = r1 + r0
            int r0 = r5.j(r1)
            int r1 = r5.f13163g
            if (r1 >= r0) goto L2e
            java.lang.Object[] r2 = r5.f13164h
            r3 = 2
            tf.l.r0(r1, r0, r2, r3, r6)
            goto L46
        L2e:
            boolean r1 = r5.isEmpty()
            if (r1 != 0) goto L46
            java.lang.Object[] r1 = r5.f13164h
            int r2 = r5.f13163g
            int r3 = r1.length
            r4 = 0
            tf.l.n0(r4, r2, r1, r3, r6)
            java.lang.Object[] r1 = r5.f13164h
            int r2 = r1.length
            int r3 = r5.f13163g
            int r2 = r2 - r3
            tf.l.n0(r2, r4, r1, r0, r6)
        L46:
            int r0 = r5.f13165i
            int r1 = r6.length
            if (r0 >= r1) goto L4e
            r1 = 0
            r6[r0] = r1
        L4e:
            return r6
    }
}
