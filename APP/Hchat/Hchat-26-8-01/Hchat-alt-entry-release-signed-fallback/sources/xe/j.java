package xe;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class j implements java.util.List, java.util.RandomAccess {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final java.lang.Object[] f21567g;

    public j(java.util.List r1) {
            r0 = this;
            java.util.Objects.requireNonNull(r1)
            java.lang.Object[] r1 = r1.toArray()
            r0.<init>()
            java.util.Objects.requireNonNull(r1)
            r0.f21567g = r1
            return
    }

    @Override // java.util.List
    public final void add(int r1, java.lang.Object r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(java.lang.Object r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // java.util.List
    public final boolean addAll(int r1, java.util.Collection r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(java.util.Collection r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // java.util.List, java.util.Collection
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

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(java.util.Collection r2) {
            r1 = this;
            java.util.Iterator r2 = r2.iterator()
        L4:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L16
            java.lang.Object r0 = r2.next()
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L4
            r2 = 0
            return r2
        L16:
            r2 = 1
            return r2
    }

    @Override // java.util.List, java.util.Collection
    public final boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof xe.j
            java.lang.Object[] r2 = r7.f21567g
            if (r1 == 0) goto L13
            xe.j r8 = (xe.j) r8
            java.lang.Object[] r8 = r8.f21567g
            boolean r8 = java.util.Arrays.equals(r2, r8)
            return r8
        L13:
            boolean r1 = r8 instanceof java.util.List
            r3 = 0
            if (r1 == 0) goto L36
            java.util.List r8 = (java.util.List) r8
            int r1 = r2.length
            int r4 = r8.size()
            if (r1 == r4) goto L22
            return r3
        L22:
            r4 = r3
        L23:
            if (r4 >= r1) goto L35
            r5 = r2[r4]
            java.lang.Object r6 = r8.get(r4)
            boolean r5 = java.util.Objects.equals(r5, r6)
            if (r5 != 0) goto L32
            return r3
        L32:
            int r4 = r4 + 1
            goto L23
        L35:
            return r0
        L36:
            return r3
    }

    @Override // java.lang.Iterable
    public final void forEach(java.util.function.Consumer r5) {
            r4 = this;
            java.lang.Object[] r0 = r4.f21567g
            int r1 = r0.length
            r2 = 0
        L4:
            if (r2 >= r1) goto Le
            r3 = r0[r2]
            r5.accept(r3)
            int r2 = r2 + 1
            goto L4
        Le:
            return
    }

    @Override // java.util.List
    public final java.lang.Object get(int r2) {
            r1 = this;
            java.lang.Object[] r0 = r1.f21567g
            r2 = r0[r2]
            return r2
    }

    @Override // java.util.List, java.util.Collection
    public final int hashCode() {
            r1 = this;
            java.lang.Object[] r0 = r1.f21567g
            int r0 = java.util.Arrays.hashCode(r0)
            return r0
    }

    @Override // java.util.List
    public final int indexOf(java.lang.Object r5) {
            r4 = this;
            java.lang.Object[] r0 = r4.f21567g
            int r1 = r0.length
            r2 = 0
        L4:
            if (r2 >= r1) goto L12
            r3 = r0[r2]
            boolean r3 = java.util.Objects.equals(r3, r5)
            if (r3 == 0) goto Lf
            return r2
        Lf:
            int r2 = r2 + 1
            goto L4
        L12:
            r5 = -1
            return r5
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
            r1 = this;
            java.lang.Object[] r0 = r1.f21567g
            int r0 = r0.length
            if (r0 != 0) goto L7
            r0 = 1
            return r0
        L7:
            r0 = 0
            return r0
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator iterator() {
            r1 = this;
            xe.i r0 = new xe.i
            r0.<init>(r1)
            return r0
    }

    @Override // java.util.List
    public final int lastIndexOf(java.lang.Object r4) {
            r3 = this;
            java.lang.Object[] r0 = r3.f21567g
            int r1 = r0.length
            int r1 = r1 + (-1)
        L5:
            if (r1 <= 0) goto L13
            r2 = r0[r1]
            boolean r2 = java.util.Objects.equals(r2, r4)
            if (r2 == 0) goto L10
            return r1
        L10:
            int r1 = r1 + (-1)
            goto L5
        L13:
            r4 = -1
            return r4
    }

    @Override // java.util.List
    public final java.util.ListIterator listIterator() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // java.util.List
    public final java.util.ListIterator listIterator(int r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // java.util.List
    public final java.lang.Object remove(int r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(java.lang.Object r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(java.util.Collection r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // java.util.Collection
    public final boolean removeIf(java.util.function.Predicate r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // java.util.List
    public final void replaceAll(java.util.function.UnaryOperator r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(java.util.Collection r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // java.util.List
    public final java.lang.Object set(int r1, java.lang.Object r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
            r1 = this;
            java.lang.Object[] r0 = r1.f21567g
            int r0 = r0.length
            return r0
    }

    @Override // java.util.List
    public final void sort(java.util.Comparator r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // java.util.List
    public final java.util.List subList(int r1, int r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // java.util.List, java.util.Collection
    public final java.lang.Object[] toArray() {
            r2 = this;
            java.lang.Object[] r0 = r2.f21567g
            int r1 = r0.length
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)
            return r0
    }

    @Override // java.util.List, java.util.Collection
    public final java.lang.Object[] toArray(java.lang.Object[] r2) {
            r1 = this;
            java.lang.Object[] r2 = r1.f21567g
            int r0 = r2.length
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r0)
            return r2
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.Object[] r0 = r3.f21567g
            java.lang.String r0 = java.util.Arrays.toString(r0)
            java.lang.String r1 = "ImmutableList{"
            java.lang.String r2 = "}"
            java.lang.String r0 = eh.a.n(r1, r0, r2)
            return r0
    }
}
