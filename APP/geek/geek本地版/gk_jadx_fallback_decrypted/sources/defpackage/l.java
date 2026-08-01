package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class l implements java.util.List, java.util.Collection {
    public abstract int a();

    @Override // java.util.List
    public final void add(int r1, java.lang.Object r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Operation is not supported for read-only collection"
            r1.<init>(r2)
            throw r1
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(java.lang.Object r2) {
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
    public boolean contains(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r3.isEmpty()
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            java.util.Iterator r0 = r3.iterator()
        Lc:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L1e
            java.lang.Object r2 = r0.next()
            boolean r2 = defpackage.ip.i(r2, r4)
            if (r2 == 0) goto Lc
            r4 = 1
            return r4
        L1e:
            return r1
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(java.util.Collection r3) {
            r2 = this;
            java.lang.String r0 = "elements"
            defpackage.ip.o(r0, r3)
            boolean r0 = r3.isEmpty()
            r1 = 1
            if (r0 == 0) goto Ld
            return r1
        Ld:
            java.util.Iterator r3 = r3.iterator()
        L11:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L23
            java.lang.Object r0 = r3.next()
            boolean r0 = r2.contains(r0)
            if (r0 != 0) goto L11
            r3 = 0
            return r3
        L23:
            return r1
    }

    @Override // java.util.List, java.util.Collection
    public final boolean equals(java.lang.Object r6) {
            r5 = this;
            r0 = 1
            if (r6 != r5) goto L4
            return r0
        L4:
            boolean r1 = r6 instanceof java.util.List
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            java.util.Collection r6 = (java.util.Collection) r6
            int r1 = r5.size()
            int r3 = r6.size()
            if (r1 == r3) goto L17
            goto L33
        L17:
            java.util.Iterator r6 = r6.iterator()
            java.util.Iterator r1 = r5.iterator()
        L1f:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L34
            java.lang.Object r3 = r1.next()
            java.lang.Object r4 = r6.next()
            boolean r3 = defpackage.ip.i(r3, r4)
            if (r3 != 0) goto L1f
        L33:
            return r2
        L34:
            return r0
    }

    @Override // java.util.List, java.util.Collection
    public final int hashCode() {
            r3 = this;
            java.util.Iterator r0 = r3.iterator()
            r1 = 1
        L5:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L1b
            java.lang.Object r2 = r0.next()
            int r1 = r1 * 31
            if (r2 == 0) goto L18
            int r2 = r2.hashCode()
            goto L19
        L18:
            r2 = 0
        L19:
            int r1 = r1 + r2
            goto L5
        L1b:
            return r1
    }

    @Override // java.util.List
    public int indexOf(java.lang.Object r4) {
            r3 = this;
            java.util.Iterator r0 = r3.iterator()
            r1 = 0
        L5:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L19
            java.lang.Object r2 = r0.next()
            boolean r2 = defpackage.ip.i(r2, r4)
            if (r2 == 0) goto L16
            return r1
        L16:
            int r1 = r1 + 1
            goto L5
        L19:
            r4 = -1
            return r4
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
            r1 = this;
            int r0 = r1.a()
            if (r0 != 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator iterator() {
            r1 = this;
            i r0 = new i
            r0.<init>(r1)
            return r0
    }

    @Override // java.util.List
    public int lastIndexOf(java.lang.Object r3) {
            r2 = this;
            int r0 = r2.size()
            java.util.ListIterator r0 = r2.listIterator(r0)
        L8:
            boolean r1 = r0.hasPrevious()
            if (r1 == 0) goto L1d
            java.lang.Object r1 = r0.previous()
            boolean r1 = defpackage.ip.i(r1, r3)
            if (r1 == 0) goto L8
            int r3 = r0.nextIndex()
            return r3
        L1d:
            r3 = -1
            return r3
    }

    @Override // java.util.List
    public final java.util.ListIterator listIterator() {
            r2 = this;
            j r0 = new j
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    @Override // java.util.List
    public final java.util.ListIterator listIterator(int r2) {
            r1 = this;
            j r0 = new j
            r0.<init>(r1, r2)
            return r0
    }

    @Override // java.util.List
    public final java.lang.Object remove(int r2) {
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
    public final java.lang.Object set(int r1, java.lang.Object r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Operation is not supported for read-only collection"
            r1.<init>(r2)
            throw r1
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
            r1 = this;
            int r0 = r1.a()
            return r0
    }

    @Override // java.util.List
    public final java.util.List subList(int r2, int r3) {
            r1 = this;
            k r0 = new k
            r0.<init>(r1, r2, r3)
            return r0
    }

    @Override // java.util.List, java.util.Collection
    public final java.lang.Object[] toArray() {
            r1 = this;
            java.lang.Object[] r0 = defpackage.ip.Y(r1)
            return r0
    }

    @Override // java.util.List, java.util.Collection
    public final java.lang.Object[] toArray(java.lang.Object[] r2) {
            r1 = this;
            java.lang.String r0 = "array"
            defpackage.ip.o(r0, r2)
            java.lang.Object[] r2 = defpackage.ip.Z(r1, r2)
            return r2
    }

    public final java.lang.String toString() {
            r3 = this;
            f r0 = new f
            r1 = 0
            r0.<init>(r1, r3)
            r1 = 24
            java.lang.String r2 = ", "
            java.lang.String r0 = defpackage.ab.j0(r3, r2, r0, r1)
            return r0
    }
}
