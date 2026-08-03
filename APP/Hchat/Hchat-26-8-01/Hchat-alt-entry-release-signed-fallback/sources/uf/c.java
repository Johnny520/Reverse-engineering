package uf;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends tf.g implements java.util.RandomAccess, java.io.Serializable {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final uf.c f13774j = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public java.lang.Object[] f13775g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f13776h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f13777i;

    static {
            uf.c r0 = new uf.c
            r1 = 0
            r0.<init>(r1)
            r1 = 1
            r0.f13777i = r1
            uf.c.f13774j = r0
            return
    }

    public c(int r1) {
            r0 = this;
            r0.<init>()
            if (r1 < 0) goto La
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r0.f13775g = r1
            return
        La:
            java.lang.String r1 = "capacity must be non-negative."
            j8.o.t(r1)
            r1 = 0
            throw r1
    }

    public static final /* synthetic */ int d(uf.c r0) {
            int r0 = r0.modCount
            return r0
    }

    @Override // tf.g
    public final int a() {
            r1 = this;
            int r0 = r1.f13776h
            return r0
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int r3, java.lang.Object r4) {
            r2 = this;
            r2.g()
            tf.c r0 = tf.f.Companion
            int r1 = r2.f13776h
            r0.getClass()
            tf.c.b(r3, r1)
            int r0 = r2.modCount
            r1 = 1
            int r0 = r0 + r1
            r2.modCount = r0
            r2.h(r3, r1)
            java.lang.Object[] r0 = r2.f13775g
            r0[r3] = r4
            return
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(java.lang.Object r4) {
            r3 = this;
            r3.g()
            int r0 = r3.f13776h
            int r1 = r3.modCount
            r2 = 1
            int r1 = r1 + r2
            r3.modCount = r1
            r3.h(r0, r2)
            java.lang.Object[] r1 = r3.f13775g
            r1[r0] = r4
            return r2
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int r3, java.util.Collection r4) {
            r2 = this;
            r4.getClass()
            r2.g()
            tf.c r0 = tf.f.Companion
            int r1 = r2.f13776h
            r0.getClass()
            tf.c.b(r3, r1)
            int r0 = r4.size()
            r2.e(r3, r4, r0)
            if (r0 <= 0) goto L1b
            r3 = 1
            return r3
        L1b:
            r3 = 0
            return r3
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(java.util.Collection r3) {
            r2 = this;
            r3.getClass()
            r2.g()
            int r0 = r3.size()
            int r1 = r2.f13776h
            r2.e(r1, r3, r0)
            if (r0 <= 0) goto L13
            r3 = 1
            return r3
        L13:
            r3 = 0
            return r3
    }

    @Override // tf.g
    public final java.lang.Object c(int r3) {
            r2 = this;
            r2.g()
            tf.c r0 = tf.f.Companion
            int r1 = r2.f13776h
            r0.getClass()
            tf.c.a(r3, r1)
            java.lang.Object r3 = r2.i(r3)
            return r3
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
            r2 = this;
            r2.g()
            r0 = 0
            int r1 = r2.f13776h
            r2.j(r0, r1)
            return
    }

    public final void e(int r5, java.util.Collection r6, int r7) {
            r4 = this;
            int r0 = r4.modCount
            int r0 = r0 + 1
            r4.modCount = r0
            r4.h(r5, r7)
            java.util.Iterator r6 = r6.iterator()
            r0 = 0
        Le:
            if (r0 >= r7) goto L1d
            java.lang.Object[] r1 = r4.f13775g
            int r2 = r5 + r0
            java.lang.Object r3 = r6.next()
            r1[r2] = r3
            int r0 = r0 + 1
            goto Le
        L1d:
            return
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(java.lang.Object r7) {
            r6 = this;
            if (r7 == r6) goto L28
            boolean r0 = r7 instanceof java.util.List
            r1 = 0
            if (r0 == 0) goto L27
            java.util.List r7 = (java.util.List) r7
            java.lang.Object[] r0 = r6.f13775g
            int r2 = r6.f13776h
            int r3 = r7.size()
            if (r2 == r3) goto L14
            goto L27
        L14:
            r3 = r1
        L15:
            if (r3 >= r2) goto L28
            r4 = r0[r3]
            java.lang.Object r5 = r7.get(r3)
            boolean r4 = gg.l.a(r4, r5)
            if (r4 != 0) goto L24
            goto L27
        L24:
            int r3 = r3 + 1
            goto L15
        L27:
            return r1
        L28:
            r7 = 1
            return r7
    }

    public final void f(int r3, java.lang.Object r4) {
            r2 = this;
            int r0 = r2.modCount
            r1 = 1
            int r0 = r0 + r1
            r2.modCount = r0
            r2.h(r3, r1)
            java.lang.Object[] r0 = r2.f13775g
            r0[r3] = r4
            return
    }

    public final void g() {
            r1 = this;
            boolean r0 = r1.f13777i
            if (r0 != 0) goto L5
            return
        L5:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.lang.Object get(int r3) {
            r2 = this;
            tf.c r0 = tf.f.Companion
            int r1 = r2.f13776h
            r0.getClass()
            tf.c.a(r3, r1)
            java.lang.Object[] r0 = r2.f13775g
            r3 = r0[r3]
            return r3
    }

    public final void h(int r4, int r5) {
            r3 = this;
            int r0 = r3.f13776h
            int r0 = r0 + r5
            if (r0 < 0) goto L2e
            java.lang.Object[] r1 = r3.f13775g
            int r2 = r1.length
            if (r0 <= r2) goto L1f
            tf.c r2 = tf.f.Companion
            int r1 = r1.length
            r2.getClass()
            int r0 = tf.c.d(r1, r0)
            java.lang.Object[] r1 = r3.f13775g
            r1.getClass()
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r1, r0)
            r3.f13775g = r0
        L1f:
            java.lang.Object[] r0 = r3.f13775g
            int r1 = r3.f13776h
            int r2 = r4 + r5
            tf.l.n0(r2, r4, r0, r1, r0)
            int r4 = r3.f13776h
            int r4 = r4 + r5
            r3.f13776h = r4
            return
        L2e:
            java.lang.OutOfMemoryError r4 = new java.lang.OutOfMemoryError
            r4.<init>()
            throw r4
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
            r6 = this;
            java.lang.Object[] r0 = r6.f13775g
            int r1 = r6.f13776h
            r2 = 1
            r3 = 0
            r4 = r3
        L7:
            if (r4 >= r1) goto L19
            r5 = r0[r4]
            int r2 = r2 * 31
            if (r5 == 0) goto L14
            int r5 = r5.hashCode()
            goto L15
        L14:
            r5 = r3
        L15:
            int r2 = r2 + r5
            int r4 = r4 + 1
            goto L7
        L19:
            return r2
    }

    public final java.lang.Object i(int r5) {
            r4 = this;
            int r0 = r4.modCount
            int r0 = r0 + 1
            r4.modCount = r0
            java.lang.Object[] r0 = r4.f13775g
            r1 = r0[r5]
            int r2 = r5 + 1
            int r3 = r4.f13776h
            tf.l.n0(r5, r2, r0, r3, r0)
            java.lang.Object[] r5 = r4.f13775g
            int r0 = r4.f13776h
            int r0 = r0 + (-1)
            r5.getClass()
            r2 = 0
            r5[r0] = r2
            int r5 = r4.f13776h
            int r5 = r5 + (-1)
            r4.f13776h = r5
            return r1
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(java.lang.Object r3) {
            r2 = this;
            r0 = 0
        L1:
            int r1 = r2.f13776h
            if (r0 >= r1) goto L13
            java.lang.Object[] r1 = r2.f13775g
            r1 = r1[r0]
            boolean r1 = gg.l.a(r1, r3)
            if (r1 == 0) goto L10
            return r0
        L10:
            int r0 = r0 + 1
            goto L1
        L13:
            r3 = -1
            return r3
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
            r1 = this;
            int r0 = r1.f13776h
            if (r0 != 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final java.util.Iterator iterator() {
            r1 = this;
            r0 = 0
            java.util.ListIterator r0 = r1.listIterator(r0)
            return r0
    }

    public final void j(int r4, int r5) {
            r3 = this;
            if (r5 <= 0) goto L8
            int r0 = r3.modCount
            int r0 = r0 + 1
            r3.modCount = r0
        L8:
            java.lang.Object[] r0 = r3.f13775g
            int r1 = r4 + r5
            int r2 = r3.f13776h
            tf.l.n0(r4, r1, r0, r2, r0)
            java.lang.Object[] r4 = r3.f13775g
            int r0 = r3.f13776h
            int r1 = r0 - r5
            r9.e0.g0(r4, r1, r0)
            int r4 = r3.f13776h
            int r4 = r4 - r5
            r3.f13776h = r4
            return
    }

    public final int k(int r6, int r7, java.util.Collection r8, boolean r9) {
            r5 = this;
            r0 = 0
            r1 = r0
        L2:
            java.lang.Object[] r2 = r5.f13775g
            if (r0 >= r7) goto L20
            int r3 = r6 + r0
            r2 = r2[r3]
            boolean r2 = r8.contains(r2)
            if (r2 != r9) goto L1d
            java.lang.Object[] r2 = r5.f13775g
            int r4 = r1 + 1
            int r1 = r1 + r6
            int r0 = r0 + 1
            r3 = r2[r3]
            r2[r1] = r3
            r1 = r4
            goto L2
        L1d:
            int r0 = r0 + 1
            goto L2
        L20:
            int r8 = r7 - r1
            int r7 = r7 + r6
            int r9 = r5.f13776h
            int r6 = r6 + r1
            tf.l.n0(r6, r7, r2, r9, r2)
            java.lang.Object[] r6 = r5.f13775g
            int r7 = r5.f13776h
            int r9 = r7 - r8
            r9.e0.g0(r6, r9, r7)
            if (r8 <= 0) goto L3a
            int r6 = r5.modCount
            int r6 = r6 + 1
            r5.modCount = r6
        L3a:
            int r6 = r5.f13776h
            int r6 = r6 - r8
            r5.f13776h = r6
            return r8
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(java.lang.Object r3) {
            r2 = this;
            int r0 = r2.f13776h
            int r0 = r0 + (-1)
        L4:
            if (r0 < 0) goto L14
            java.lang.Object[] r1 = r2.f13775g
            r1 = r1[r0]
            boolean r1 = gg.l.a(r1, r3)
            if (r1 == 0) goto L11
            return r0
        L11:
            int r0 = r0 + (-1)
            goto L4
        L14:
            r3 = -1
            return r3
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.util.ListIterator listIterator() {
            r1 = this;
            r0 = 0
            java.util.ListIterator r0 = r1.listIterator(r0)
            return r0
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.util.ListIterator listIterator(int r3) {
            r2 = this;
            tf.c r0 = tf.f.Companion
            int r1 = r2.f13776h
            r0.getClass()
            tf.c.b(r3, r1)
            uf.a r0 = new uf.a
            r0.<init>(r2, r3)
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(java.lang.Object r1) {
            r0 = this;
            r0.g()
            int r1 = r0.indexOf(r1)
            if (r1 < 0) goto Lc
            r0.c(r1)
        Lc:
            if (r1 < 0) goto L10
            r1 = 1
            return r1
        L10:
            r1 = 0
            return r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(java.util.Collection r3) {
            r2 = this;
            r3.getClass()
            r2.g()
            int r0 = r2.f13776h
            r1 = 0
            int r3 = r2.k(r1, r0, r3, r1)
            if (r3 <= 0) goto L11
            r3 = 1
            return r3
        L11:
            return r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(java.util.Collection r4) {
            r3 = this;
            r4.getClass()
            r3.g()
            int r0 = r3.f13776h
            r1 = 0
            r2 = 1
            int r4 = r3.k(r1, r0, r4, r2)
            if (r4 <= 0) goto L11
            return r2
        L11:
            return r1
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.lang.Object set(int r3, java.lang.Object r4) {
            r2 = this;
            r2.g()
            tf.c r0 = tf.f.Companion
            int r1 = r2.f13776h
            r0.getClass()
            tf.c.a(r3, r1)
            java.lang.Object[] r0 = r2.f13775g
            r1 = r0[r3]
            r0[r3] = r4
            return r1
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.util.List subList(int r9, int r10) {
            r8 = this;
            tf.c r0 = tf.f.Companion
            int r1 = r8.f13776h
            r0.getClass()
            tf.c.c(r9, r10, r1)
            uf.b r2 = new uf.b
            java.lang.Object[] r3 = r8.f13775g
            int r5 = r10 - r9
            r6 = 0
            r7 = r8
            r4 = r9
            r2.<init>(r3, r4, r5, r6, r7)
            return r2
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final java.lang.Object[] toArray() {
            r3 = this;
            java.lang.Object[] r0 = r3.f13775g
            r1 = 0
            int r2 = r3.f13776h
            java.lang.Object[] r0 = tf.l.u0(r0, r1, r2)
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final java.lang.Object[] toArray(java.lang.Object[] r5) {
            r4 = this;
            r5.getClass()
            int r0 = r5.length
            int r1 = r4.f13776h
            java.lang.Object[] r2 = r4.f13775g
            r3 = 0
            if (r0 >= r1) goto L17
            java.lang.Class r5 = r5.getClass()
            java.lang.Object[] r5 = java.util.Arrays.copyOfRange(r2, r3, r1, r5)
            r5.getClass()
            return r5
        L17:
            tf.l.n0(r3, r3, r2, r1, r5)
            int r0 = r4.f13776h
            int r1 = r5.length
            if (r0 >= r1) goto L22
            r1 = 0
            r5[r0] = r1
        L22:
            return r5
    }

    @Override // java.util.AbstractCollection
    public final java.lang.String toString() {
            r3 = this;
            java.lang.Object[] r0 = r3.f13775g
            r1 = 0
            int r2 = r3.f13776h
            java.lang.String r0 = r9.e0.i(r0, r1, r2, r3)
            return r0
    }
}
