package z7;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements java.util.List {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final z7.i f22607g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final java.lang.Object[] f22608h = null;

    static {
            z7.i r0 = new z7.i
            r0.<init>()
            z7.i.f22607g = r0
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            z7.i.f22608h = r0
            return
    }

    @Override // java.util.List
    public final void add(int r1, java.lang.Object r2) {
            r0 = this;
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Empty list"
            r1.<init>(r2)
            throw r1
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(java.lang.Object r2) {
            r1 = this;
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Empty list"
            r2.<init>(r0)
            throw r2
    }

    @Override // java.util.List
    public final boolean addAll(int r1, java.util.Collection r2) {
            r0 = this;
            if (r2 == 0) goto L10
            boolean r1 = r2.isEmpty()
            if (r1 == 0) goto L9
            goto L10
        L9:
            java.lang.String r1 = "Empty list"
            j8.o.t(r1)
            r1 = 0
            return r1
        L10:
            r1 = 0
            return r1
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(java.util.Collection r1) {
            r0 = this;
            if (r1 == 0) goto L10
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L9
            goto L10
        L9:
            java.lang.String r1 = "Empty list"
            j8.o.t(r1)
            r1 = 0
            return r1
        L10:
            r1 = 0
            return r1
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
            r0 = this;
            return
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(java.lang.Object r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(java.util.Collection r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // java.util.List, java.util.Collection
    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r2 != r1) goto L4
            r2 = 1
            return r2
        L4:
            boolean r0 = r2 instanceof java.util.Collection
            if (r0 != 0) goto La
            r2 = 0
            return r2
        La:
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            return r2
    }

    @Override // java.util.List
    public final java.lang.Object get(int r2) {
            r1 = this;
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Empty list"
            r2.<init>(r0)
            throw r2
    }

    @Override // java.util.List
    public final int indexOf(java.lang.Object r1) {
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
            z7.h r0 = z7.h.f22606g
            return r0
    }

    @Override // java.util.List
    public final int lastIndexOf(java.lang.Object r1) {
            r0 = this;
            r1 = -1
            return r1
    }

    @Override // java.util.List
    public final java.util.ListIterator listIterator() {
            r1 = this;
            z7.h r0 = z7.h.f22606g
            return r0
    }

    @Override // java.util.List
    public final java.util.ListIterator listIterator(int r1) {
            r0 = this;
            z7.h r1 = z7.h.f22606g
            return r1
    }

    @Override // java.util.List
    public final java.lang.Object remove(int r2) {
            r1 = this;
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Empty list"
            r2.<init>(r0)
            throw r2
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(java.lang.Object r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(java.util.Collection r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(java.util.Collection r2) {
            r1 = this;
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Empty list"
            r2.<init>(r0)
            throw r2
    }

    @Override // java.util.List
    public final java.lang.Object set(int r1, java.lang.Object r2) {
            r0 = this;
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Empty list"
            r1.<init>(r2)
            throw r1
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // java.util.List
    public final void sort(java.util.Comparator r1) {
            r0 = this;
            return
    }

    @Override // java.util.List
    public final java.util.List subList(int r1, int r2) {
            r0 = this;
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Empty list"
            r1.<init>(r2)
            throw r1
    }

    @Override // java.util.List, java.util.Collection
    public final java.lang.Object[] toArray() {
            r1 = this;
            java.lang.Object[] r0 = z7.i.f22608h
            return r0
    }

    @Override // java.util.List, java.util.Collection
    public final java.lang.Object[] toArray(java.lang.Object[] r1) {
            r0 = this;
            return r1
    }
}
