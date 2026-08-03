package x1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class p implements java.util.List, hg.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final f.f0 f21015g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final f.y f21016h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f21017i;

    public p() {
            r2 = this;
            r2.<init>()
            f.f0 r0 = new f.f0
            r1 = 16
            r0.<init>(r1)
            r2.f21015g = r0
            f.y r0 = new f.y
            r0.<init>(r1)
            r2.f21016h = r0
            r0 = -1
            r2.f21017i = r0
            return
    }

    public final long a() {
            r7 = this;
            r0 = 2139095040(0x7f800000, float:Infinity)
            r1 = 0
            long r0 = x1.k.a(r0, r1, r1)
            int r2 = r7.f21017i
            int r2 = r2 + 1
            f.f0 r3 = r7.f21015g
            int r3 = r3.f2804b
            int r3 = r3 + (-1)
            if (r2 > r3) goto L46
        L13:
            f.y r4 = r7.f21016h
            if (r2 < 0) goto L3c
            int r5 = r4.f2924b
            if (r2 >= r5) goto L3f
            long[] r4 = r4.f2923a
            r5 = r4[r2]
            int r4 = x1.k.g(r5, r0)
            if (r4 >= 0) goto L26
            r0 = r5
        L26:
            float r4 = x1.k.k(r0)
            r5 = 0
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 >= 0) goto L36
            boolean r4 = x1.k.p(r0)
            if (r4 == 0) goto L36
            goto L3b
        L36:
            if (r2 == r3) goto L3b
            int r2 = r2 + 1
            goto L13
        L3b:
            return r0
        L3c:
            r4.getClass()
        L3f:
            java.lang.String r0 = "Index must be between 0 and size"
            okio.a.i(r0)
            r0 = 0
        L46:
            return r0
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ void add(int r1, java.lang.Object r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Operation is not supported for read-only collection"
            r1.<init>(r2)
            throw r1
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(java.lang.Object r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r2.<init>(r0)
            throw r2
    }

    @Override // java.util.List
    public final boolean addAll(int r1, java.util.Collection r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Operation is not supported for read-only collection"
            r1.<init>(r2)
            throw r1
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(java.util.Collection r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r2.<init>(r0)
            throw r2
    }

    public final void c(int r4, int r5) {
            r3 = this;
            if (r4 < r5) goto L3
            goto L25
        L3:
            f.f0 r0 = r3.f21015g
            r0.l(r4, r5)
            f.y r0 = r3.f21016h
            if (r4 < 0) goto L2c
            int r1 = r0.f2924b
            if (r4 > r1) goto L2f
            if (r5 < 0) goto L2f
            if (r5 > r1) goto L2f
            if (r5 < r4) goto L26
            if (r5 == r4) goto L25
            if (r5 >= r1) goto L1f
            long[] r2 = r0.f2923a
            tf.l.q0(r2, r2, r4, r5, r1)
        L1f:
            int r1 = r0.f2924b
            int r5 = r5 - r4
            int r1 = r1 - r5
            r0.f2924b = r1
        L25:
            return
        L26:
            java.lang.String r4 = "The end index must be < start index"
            j8.o.t(r4)
            return
        L2c:
            r0.getClass()
        L2f:
            java.lang.String r4 = "Index must be between 0 and size"
            okio.a.i(r4)
            return
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
            r2 = this;
            r0 = -1
            r2.f21017i = r0
            f.f0 r0 = r2.f21015g
            r0.d()
            f.y r0 = r2.f21016h
            r1 = 0
            r0.f2924b = r1
            return
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof y0.n
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            y0.n r3 = (y0.n) r3
            int r3 = r2.indexOf(r3)
            r0 = -1
            if (r3 == r0) goto L11
            r3 = 1
            return r3
        L11:
            return r1
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(java.util.Collection r2) {
            r1 = this;
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r2 = r2.iterator()
        L6:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L1a
            java.lang.Object r0 = r2.next()
            y0.n r0 = (y0.n) r0
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L6
            r2 = 0
            return r2
        L1a:
            r2 = 1
            return r2
    }

    @Override // java.util.List
    public final java.lang.Object get(int r2) {
            r1 = this;
            f.f0 r0 = r1.f21015g
            java.lang.Object r2 = r0.f(r2)
            r2.getClass()
            y0.n r2 = (y0.n) r2
            return r2
    }

    @Override // java.util.List
    public final int indexOf(java.lang.Object r5) {
            r4 = this;
            boolean r0 = r5 instanceof y0.n
            r1 = -1
            if (r0 != 0) goto L6
            return r1
        L6:
            y0.n r5 = (y0.n) r5
            int r0 = r4.size()
            int r0 = r0 + (-1)
            if (r0 < 0) goto L23
            r2 = 0
        L11:
            f.f0 r3 = r4.f21015g
            java.lang.Object r3 = r3.f(r2)
            boolean r3 = gg.l.a(r3, r5)
            if (r3 == 0) goto L1e
            return r2
        L1e:
            if (r2 == r0) goto L23
            int r2 = r2 + 1
            goto L11
        L23:
            return r1
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
            r1 = this;
            f.f0 r0 = r1.f21015g
            boolean r0 = r0.h()
            return r0
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator iterator() {
            r3 = this;
            uf.a r0 = new uf.a
            r1 = 0
            r2 = 7
            r0.<init>(r3, r1, r2)
            return r0
    }

    @Override // java.util.List
    public final int lastIndexOf(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof y0.n
            r1 = -1
            if (r0 != 0) goto L6
            return r1
        L6:
            y0.n r4 = (y0.n) r4
            int r0 = r3.size()
            int r0 = r0 + (-1)
        Le:
            if (r1 >= r0) goto L20
            f.f0 r2 = r3.f21015g
            java.lang.Object r2 = r2.f(r0)
            boolean r2 = gg.l.a(r2, r4)
            if (r2 == 0) goto L1d
            return r0
        L1d:
            int r0 = r0 + (-1)
            goto Le
        L20:
            return r1
    }

    @Override // java.util.List
    public final java.util.ListIterator listIterator() {
            r3 = this;
            uf.a r0 = new uf.a
            r1 = 0
            r2 = 7
            r0.<init>(r3, r1, r2)
            return r0
    }

    @Override // java.util.List
    public final java.util.ListIterator listIterator(int r3) {
            r2 = this;
            uf.a r0 = new uf.a
            r1 = 6
            r0.<init>(r2, r3, r1)
            return r0
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ java.lang.Object remove(int r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r2.<init>(r0)
            throw r2
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(java.lang.Object r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r2.<init>(r0)
            throw r2
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(java.util.Collection r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r2.<init>(r0)
            throw r2
    }

    @Override // java.util.List
    public final void replaceAll(java.util.function.UnaryOperator r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r2.<init>(r0)
            throw r2
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(java.util.Collection r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r2.<init>(r0)
            throw r2
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ java.lang.Object set(int r1, java.lang.Object r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Operation is not supported for read-only collection"
            r1.<init>(r2)
            throw r1
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
            r1 = this;
            f.f0 r0 = r1.f21015g
            int r0 = r0.f2804b
            return r0
    }

    @Override // java.util.List
    public final void sort(java.util.Comparator r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r2.<init>(r0)
            throw r2
    }

    @Override // java.util.List
    public final java.util.List subList(int r2, int r3) {
            r1 = this;
            x1.o r0 = new x1.o
            r0.<init>(r1, r2, r3)
            return r0
    }

    @Override // java.util.List, java.util.Collection
    public final java.lang.Object[] toArray() {
            r1 = this;
            java.lang.Object[] r0 = gg.k.a(r1)
            return r0
    }

    @Override // java.util.List, java.util.Collection
    public final java.lang.Object[] toArray(java.lang.Object[] r1) {
            r0 = this;
            java.lang.Object[] r1 = gg.k.b(r0, r1)
            return r1
    }
}
