package uf;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends tf.g implements java.util.RandomAccess, java.io.Serializable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public java.lang.Object[] f13769g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f13770h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f13771i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final uf.b f13772j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final uf.c f13773k;

    public b(java.lang.Object[] r1, int r2, int r3, uf.b r4, uf.c r5) {
            r0 = this;
            r1.getClass()
            r5.getClass()
            r0.<init>()
            r0.f13769g = r1
            r0.f13770h = r2
            r0.f13771i = r3
            r0.f13772j = r4
            r0.f13773k = r5
            int r1 = uf.c.d(r5)
            r0.modCount = r1
            return
    }

    public static final /* synthetic */ int d(uf.b r0) {
            int r0 = r0.modCount
            return r0
    }

    @Override // tf.g
    public final int a() {
            r1 = this;
            r1.g()
            int r0 = r1.f13771i
            return r0
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int r3, java.lang.Object r4) {
            r2 = this;
            r2.h()
            r2.g()
            tf.c r0 = tf.f.Companion
            int r1 = r2.f13771i
            r0.getClass()
            tf.c.b(r3, r1)
            int r0 = r2.f13770h
            int r0 = r0 + r3
            r2.f(r0, r4)
            return
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(java.lang.Object r3) {
            r2 = this;
            r2.h()
            r2.g()
            int r0 = r2.f13770h
            int r1 = r2.f13771i
            int r0 = r0 + r1
            r2.f(r0, r3)
            r3 = 1
            return r3
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int r3, java.util.Collection r4) {
            r2 = this;
            r4.getClass()
            r2.h()
            r2.g()
            tf.c r0 = tf.f.Companion
            int r1 = r2.f13771i
            r0.getClass()
            tf.c.b(r3, r1)
            int r0 = r4.size()
            int r1 = r2.f13770h
            int r1 = r1 + r3
            r2.e(r1, r4, r0)
            if (r0 <= 0) goto L21
            r3 = 1
            return r3
        L21:
            r3 = 0
            return r3
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(java.util.Collection r4) {
            r3 = this;
            r4.getClass()
            r3.h()
            r3.g()
            int r0 = r4.size()
            int r1 = r3.f13770h
            int r2 = r3.f13771i
            int r1 = r1 + r2
            r3.e(r1, r4, r0)
            if (r0 <= 0) goto L19
            r4 = 1
            return r4
        L19:
            r4 = 0
            return r4
    }

    @Override // tf.g
    public final java.lang.Object c(int r3) {
            r2 = this;
            r2.h()
            r2.g()
            tf.c r0 = tf.f.Companion
            int r1 = r2.f13771i
            r0.getClass()
            tf.c.a(r3, r1)
            int r0 = r2.f13770h
            int r0 = r0 + r3
            java.lang.Object r3 = r2.i(r0)
            return r3
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
            r2 = this;
            r2.h()
            r2.g()
            int r0 = r2.f13770h
            int r1 = r2.f13771i
            r2.j(r0, r1)
            return
    }

    public final void e(int r3, java.util.Collection r4, int r5) {
            r2 = this;
            int r0 = r2.modCount
            int r0 = r0 + 1
            r2.modCount = r0
            uf.c r0 = r2.f13773k
            uf.b r1 = r2.f13772j
            if (r1 == 0) goto L10
            r1.e(r3, r4, r5)
            goto L15
        L10:
            uf.c r1 = uf.c.f13774j
            r0.e(r3, r4, r5)
        L15:
            java.lang.Object[] r3 = r0.f13775g
            r2.f13769g = r3
            int r3 = r2.f13771i
            int r3 = r3 + r5
            r2.f13771i = r3
            return
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(java.lang.Object r7) {
            r6 = this;
            r6.g()
            if (r7 == r6) goto L2e
            boolean r0 = r7 instanceof java.util.List
            r1 = 0
            if (r0 == 0) goto L2d
            java.util.List r7 = (java.util.List) r7
            java.lang.Object[] r0 = r6.f13769g
            int r2 = r6.f13771i
            int r3 = r7.size()
            if (r2 == r3) goto L17
            goto L2d
        L17:
            r3 = r1
        L18:
            if (r3 >= r2) goto L2e
            int r4 = r6.f13770h
            int r4 = r4 + r3
            r4 = r0[r4]
            java.lang.Object r5 = r7.get(r3)
            boolean r4 = gg.l.a(r4, r5)
            if (r4 != 0) goto L2a
            goto L2d
        L2a:
            int r3 = r3 + 1
            goto L18
        L2d:
            return r1
        L2e:
            r7 = 1
            return r7
    }

    public final void f(int r3, java.lang.Object r4) {
            r2 = this;
            int r0 = r2.modCount
            int r0 = r0 + 1
            r2.modCount = r0
            uf.c r0 = r2.f13773k
            uf.b r1 = r2.f13772j
            if (r1 == 0) goto L10
            r1.f(r3, r4)
            goto L15
        L10:
            uf.c r1 = uf.c.f13774j
            r0.f(r3, r4)
        L15:
            java.lang.Object[] r3 = r0.f13775g
            r2.f13769g = r3
            int r3 = r2.f13771i
            int r3 = r3 + 1
            r2.f13771i = r3
            return
    }

    public final void g() {
            r2 = this;
            uf.c r0 = r2.f13773k
            int r0 = uf.c.d(r0)
            int r1 = r2.modCount
            if (r0 != r1) goto Lb
            return
        Lb:
            java.util.ConcurrentModificationException r0 = new java.util.ConcurrentModificationException
            r0.<init>()
            throw r0
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.lang.Object get(int r3) {
            r2 = this;
            r2.g()
            tf.c r0 = tf.f.Companion
            int r1 = r2.f13771i
            r0.getClass()
            tf.c.a(r3, r1)
            java.lang.Object[] r0 = r2.f13769g
            int r1 = r2.f13770h
            int r1 = r1 + r3
            r3 = r0[r1]
            return r3
    }

    public final void h() {
            r1 = this;
            uf.c r0 = r1.f13773k
            boolean r0 = r0.f13777i
            if (r0 != 0) goto L7
            return
        L7:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
            r6 = this;
            r6.g()
            java.lang.Object[] r0 = r6.f13769g
            int r1 = r6.f13771i
            r2 = 1
            r3 = 0
            r4 = r3
        La:
            if (r4 >= r1) goto L1f
            int r5 = r6.f13770h
            int r5 = r5 + r4
            r5 = r0[r5]
            int r2 = r2 * 31
            if (r5 == 0) goto L1a
            int r5 = r5.hashCode()
            goto L1b
        L1a:
            r5 = r3
        L1b:
            int r2 = r2 + r5
            int r4 = r4 + 1
            goto La
        L1f:
            return r2
    }

    public final java.lang.Object i(int r2) {
            r1 = this;
            int r0 = r1.modCount
            int r0 = r0 + 1
            r1.modCount = r0
            uf.b r0 = r1.f13772j
            if (r0 == 0) goto Lf
            java.lang.Object r2 = r0.i(r2)
            goto L17
        Lf:
            uf.c r0 = uf.c.f13774j
            uf.c r0 = r1.f13773k
            java.lang.Object r2 = r0.i(r2)
        L17:
            int r0 = r1.f13771i
            int r0 = r0 + (-1)
            r1.f13771i = r0
            return r2
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(java.lang.Object r4) {
            r3 = this;
            r3.g()
            r0 = 0
        L4:
            int r1 = r3.f13771i
            if (r0 >= r1) goto L19
            java.lang.Object[] r1 = r3.f13769g
            int r2 = r3.f13770h
            int r2 = r2 + r0
            r1 = r1[r2]
            boolean r1 = gg.l.a(r1, r4)
            if (r1 == 0) goto L16
            return r0
        L16:
            int r0 = r0 + 1
            goto L4
        L19:
            r4 = -1
            return r4
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
            r1 = this;
            r1.g()
            int r0 = r1.f13771i
            if (r0 != 0) goto L9
            r0 = 1
            return r0
        L9:
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

    public final void j(int r2, int r3) {
            r1 = this;
            if (r3 <= 0) goto L8
            int r0 = r1.modCount
            int r0 = r0 + 1
            r1.modCount = r0
        L8:
            uf.b r0 = r1.f13772j
            if (r0 == 0) goto L10
            r0.j(r2, r3)
            goto L17
        L10:
            uf.c r0 = uf.c.f13774j
            uf.c r0 = r1.f13773k
            r0.j(r2, r3)
        L17:
            int r2 = r1.f13771i
            int r2 = r2 - r3
            r1.f13771i = r2
            return
    }

    public final int k(int r2, int r3, java.util.Collection r4, boolean r5) {
            r1 = this;
            uf.b r0 = r1.f13772j
            if (r0 == 0) goto L9
            int r2 = r0.k(r2, r3, r4, r5)
            goto L11
        L9:
            uf.c r0 = uf.c.f13774j
            uf.c r0 = r1.f13773k
            int r2 = r0.k(r2, r3, r4, r5)
        L11:
            if (r2 <= 0) goto L19
            int r3 = r1.modCount
            int r3 = r3 + 1
            r1.modCount = r3
        L19:
            int r3 = r1.f13771i
            int r3 = r3 - r2
            r1.f13771i = r3
            return r2
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(java.lang.Object r4) {
            r3 = this;
            r3.g()
            int r0 = r3.f13771i
            int r0 = r0 + (-1)
        L7:
            if (r0 < 0) goto L1a
            java.lang.Object[] r1 = r3.f13769g
            int r2 = r3.f13770h
            int r2 = r2 + r0
            r1 = r1[r2]
            boolean r1 = gg.l.a(r1, r4)
            if (r1 == 0) goto L17
            return r0
        L17:
            int r0 = r0 + (-1)
            goto L7
        L1a:
            r4 = -1
            return r4
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
            r2.g()
            tf.c r0 = tf.f.Companion
            int r1 = r2.f13771i
            r0.getClass()
            tf.c.b(r3, r1)
            uf.a r0 = new uf.a
            r0.<init>(r2, r3)
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(java.lang.Object r1) {
            r0 = this;
            r0.h()
            r0.g()
            int r1 = r0.indexOf(r1)
            if (r1 < 0) goto Lf
            r0.c(r1)
        Lf:
            if (r1 < 0) goto L13
            r1 = 1
            return r1
        L13:
            r1 = 0
            return r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(java.util.Collection r4) {
            r3 = this;
            r4.getClass()
            r3.h()
            r3.g()
            int r0 = r3.f13771i
            int r1 = r3.f13770h
            r2 = 0
            int r4 = r3.k(r1, r0, r4, r2)
            if (r4 <= 0) goto L16
            r4 = 1
            return r4
        L16:
            return r2
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(java.util.Collection r4) {
            r3 = this;
            r4.getClass()
            r3.h()
            r3.g()
            int r0 = r3.f13771i
            int r1 = r3.f13770h
            r2 = 1
            int r4 = r3.k(r1, r0, r4, r2)
            if (r4 <= 0) goto L15
            return r2
        L15:
            r4 = 0
            return r4
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.lang.Object set(int r3, java.lang.Object r4) {
            r2 = this;
            r2.h()
            r2.g()
            tf.c r0 = tf.f.Companion
            int r1 = r2.f13771i
            r0.getClass()
            tf.c.a(r3, r1)
            java.lang.Object[] r0 = r2.f13769g
            int r1 = r2.f13770h
            int r1 = r1 + r3
            r3 = r0[r1]
            r0[r1] = r4
            return r3
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.util.List subList(int r9, int r10) {
            r8 = this;
            tf.c r0 = tf.f.Companion
            int r1 = r8.f13771i
            r0.getClass()
            tf.c.c(r9, r10, r1)
            uf.b r2 = new uf.b
            java.lang.Object[] r3 = r8.f13769g
            int r0 = r8.f13770h
            int r4 = r0 + r9
            int r5 = r10 - r9
            uf.c r7 = r8.f13773k
            r6 = r8
            r2.<init>(r3, r4, r5, r6, r7)
            return r2
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final java.lang.Object[] toArray() {
            r3 = this;
            r3.g()
            java.lang.Object[] r0 = r3.f13769g
            int r1 = r3.f13771i
            int r2 = r3.f13770h
            int r1 = r1 + r2
            java.lang.Object[] r0 = tf.l.u0(r0, r2, r1)
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final java.lang.Object[] toArray(java.lang.Object[] r5) {
            r4 = this;
            r5.getClass()
            r4.g()
            int r0 = r5.length
            int r1 = r4.f13771i
            java.lang.Object[] r2 = r4.f13769g
            int r3 = r4.f13770h
            if (r0 >= r1) goto L1c
            int r1 = r1 + r3
            java.lang.Class r5 = r5.getClass()
            java.lang.Object[] r5 = java.util.Arrays.copyOfRange(r2, r3, r1, r5)
            r5.getClass()
            return r5
        L1c:
            r0 = 0
            int r1 = r1 + r3
            tf.l.n0(r0, r3, r2, r1, r5)
            int r0 = r4.f13771i
            int r1 = r5.length
            if (r0 >= r1) goto L29
            r1 = 0
            r5[r0] = r1
        L29:
            return r5
    }

    @Override // java.util.AbstractCollection
    public final java.lang.String toString() {
            r3 = this;
            r3.g()
            java.lang.Object[] r0 = r3.f13769g
            int r1 = r3.f13770h
            int r2 = r3.f13771i
            java.lang.String r0 = r9.e0.i(r0, r1, r2, r3)
            return r0
    }
}
