package tf;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class t implements java.util.List, java.io.Serializable, java.util.RandomAccess, hg.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final tf.t f13167g = null;

    static {
            tf.t r0 = new tf.t
            r0.<init>()
            tf.t.f13167g = r0
            return
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

    @Override // java.util.List, java.util.Collection
    public final void clear() {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(java.lang.Object r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(java.util.Collection r1) {
            r0 = this;
            r1.getClass()
            boolean r1 = r1.isEmpty()
            return r1
    }

    @Override // java.util.List, java.util.Collection
    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof java.util.List
            if (r0 == 0) goto Le
            java.util.List r2 = (java.util.List) r2
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto Le
            r2 = 1
            return r2
        Le:
            r2 = 0
            return r2
    }

    @Override // java.util.List
    public final java.lang.Object get(int r4) {
            r3 = this;
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Empty list doesn't contain element at index "
            r1.<init>(r2)
            r1.append(r4)
            r4 = 46
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    @Override // java.util.List, java.util.Collection
    public final int hashCode() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // java.util.List
    public final /* bridge */ int indexOf(java.lang.Object r1) {
            r0 = this;
            r1 = -1
            return r1
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator iterator() {
            r1 = this;
            tf.s r0 = tf.s.f13166g
            return r0
    }

    @Override // java.util.List
    public final /* bridge */ int lastIndexOf(java.lang.Object r1) {
            r0 = this;
            r1 = -1
            return r1
    }

    @Override // java.util.List
    public final java.util.ListIterator listIterator() {
            r1 = this;
            tf.s r0 = tf.s.f13166g
            return r0
    }

    @Override // java.util.List
    public final java.util.ListIterator listIterator(int r2) {
            r1 = this;
            if (r2 != 0) goto L5
            tf.s r2 = tf.s.f13166g
            return r2
        L5:
            java.lang.String r0 = "Index: "
            java.lang.String r2 = eh.a.l(r2, r0)
            okio.a.i(r2)
            r2 = 0
            return r2
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
    public final /* bridge */ int size() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // java.util.List
    public final java.util.List subList(int r3, int r4) {
            r2 = this;
            if (r3 != 0) goto L5
            if (r4 != 0) goto L5
            return r2
        L5:
            java.lang.String r0 = "fromIndex: "
            java.lang.String r1 = ", toIndex: "
            java.lang.String r3 = p.a.j(r3, r0, r1, r4)
            okio.a.i(r3)
            r3 = 0
            return r3
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
            r1.getClass()
            java.lang.Object[] r1 = gg.k.b(r0, r1)
            return r1
    }

    public final java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = "[]"
            return r0
    }
}
