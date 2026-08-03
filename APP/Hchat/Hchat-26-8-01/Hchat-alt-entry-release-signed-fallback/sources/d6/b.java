package d6;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements java.util.SortedSet {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final java.lang.Object[] f2005g;

    public b(java.lang.Object[] r1) {
            r0 = this;
            r0.<init>()
            r0.f2005g = r1
            return
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(java.lang.Object r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(java.util.Collection r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // java.util.SortedSet
    public final java.util.Comparator comparator() {
            r1 = this;
            d6.e r0 = d6.e.f2006h
            return r0
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(java.lang.Object r3) {
            r2 = this;
            java.lang.Object[] r0 = r2.f2005g
            d6.e r1 = d6.e.f2006h
            int r3 = java.util.Arrays.binarySearch(r0, r3, r1)
            if (r3 < 0) goto Lc
            r3 = 1
            return r3
        Lc:
            r3 = 0
            return r3
    }

    @Override // java.util.Set, java.util.Collection
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

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 0
            if (r5 != 0) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof java.util.SortedSet
            java.lang.Object[] r2 = r4.f2005g
            if (r1 == 0) goto L3f
            java.util.SortedSet r5 = (java.util.SortedSet) r5
            int r1 = r2.length
            int r2 = r5.size()
            if (r1 == r2) goto L14
            return r0
        L14:
            java.util.Iterator r1 = r4.iterator()
            java.util.Iterator r5 = r5.iterator()
        L1c:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L38
            boolean r2 = r5.hasNext()
            if (r2 != 0) goto L29
            goto L37
        L29:
            java.lang.Object r2 = r1.next()
            java.lang.Object r3 = r5.next()
            boolean r2 = java.util.Objects.equals(r2, r3)
            if (r2 != 0) goto L1c
        L37:
            return r0
        L38:
            boolean r5 = r5.hasNext()
            r5 = r5 ^ 1
            return r5
        L3f:
            boolean r1 = r5 instanceof java.util.Set
            if (r1 == 0) goto L52
            java.util.Set r5 = (java.util.Set) r5
            int r1 = r2.length
            int r2 = r5.size()
            if (r1 == r2) goto L4d
            return r0
        L4d:
            boolean r5 = r4.containsAll(r5)
            return r5
        L52:
            return r0
    }

    @Override // java.util.SortedSet
    public final java.lang.Object first() {
            r2 = this;
            java.lang.Object[] r0 = r2.f2005g
            int r1 = r0.length
            if (r1 == 0) goto L9
            r1 = 0
            r0 = r0[r1]
            return r0
        L9:
            bsh.j.e()
            r0 = 0
            return r0
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
            r5 = this;
            java.lang.Object[] r0 = r5.f2005g
            int r1 = r0.length
            r2 = 0
            r3 = r2
        L5:
            if (r2 >= r1) goto L11
            r4 = r0[r2]
            int r4 = r4.hashCode()
            int r3 = r3 + r4
            int r2 = r2 + 1
            goto L5
        L11:
            return r3
    }

    @Override // java.util.SortedSet
    public final java.util.SortedSet headSet(java.lang.Object r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
            r1 = this;
            java.lang.Object[] r0 = r1.f2005g
            int r0 = r0.length
            if (r0 <= 0) goto L7
            r0 = 1
            return r0
        L7:
            r0 = 0
            return r0
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator iterator() {
            r1 = this;
            java.lang.Object[] r0 = r1.f2005g
            java.util.List r0 = java.util.Arrays.asList(r0)
            java.util.Iterator r0 = r0.iterator()
            return r0
    }

    @Override // java.util.SortedSet
    public final java.lang.Object last() {
            r2 = this;
            java.lang.Object[] r0 = r2.f2005g
            int r1 = r0.length
            if (r1 == 0) goto Lb
            int r1 = r0.length
            int r1 = r1 + (-1)
            r0 = r0[r1]
            return r0
        Lb:
            bsh.j.e()
            r0 = 0
            return r0
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(java.lang.Object r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(java.util.Collection r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(java.util.Collection r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
            r1 = this;
            java.lang.Object[] r0 = r1.f2005g
            int r0 = r0.length
            return r0
    }

    @Override // java.util.SortedSet
    public final java.util.SortedSet subSet(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // java.util.SortedSet
    public final java.util.SortedSet tailSet(java.lang.Object r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // java.util.Set, java.util.Collection
    public final java.lang.Object[] toArray() {
            r1 = this;
            java.lang.Object[] r0 = r1.f2005g
            java.lang.Object r0 = r0.clone()
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            return r0
    }

    @Override // java.util.Set, java.util.Collection
    public final java.lang.Object[] toArray(java.lang.Object[] r4) {
            r3 = this;
            int r0 = r4.length
            java.lang.Object[] r1 = r3.f2005g
            int r2 = r1.length
            if (r0 > r2) goto Lc
            int r0 = r1.length
            r2 = 0
            java.lang.System.arraycopy(r1, r2, r4, r2, r0)
            return r4
        Lc:
            int r4 = r1.length
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r1, r4)
            return r4
    }
}
