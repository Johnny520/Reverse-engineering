package p000;

/* JADX INFO: renamed from: jz */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0450jz implements java.util.List, java.io.Serializable, java.util.RandomAccess, p000.lo0 {

    /* JADX INFO: renamed from: ε */
    public static final p000.C0450jz f5672 = null;

    static {
            jz r0 = new jz
            r0.<init>()
            p000.C0450jz.f5672 = r0
            return
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ void add(int r1, java.lang.Object r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(java.lang.Object r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.List
    public final boolean addAll(int r1, java.util.Collection r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(java.util.Collection r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
            r1 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r1.<init>(r0)
            throw r1
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(java.lang.Object r1) {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(java.util.Collection r1) {
            r0 = this;
            r1.getClass()
            boolean r0 = r1.isEmpty()
            return r0
    }

    @Override // java.util.List, java.util.Collection
    public final boolean equals(java.lang.Object r1) {
            r0 = this;
            boolean r0 = r1 instanceof java.util.List
            if (r0 == 0) goto Le
            java.util.List r1 = (java.util.List) r1
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto Le
            r0 = 1
            return r0
        Le:
            r0 = 0
            return r0
    }

    @Override // java.util.List
    public final java.lang.Object get(int r3) {
            r2 = this;
            java.lang.IndexOutOfBoundsException r2 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Empty list doesn't contain element at index "
            r0.<init>(r1)
            r0.append(r3)
            r3 = 46
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r2.<init>(r3)
            throw r2
    }

    @Override // java.util.List, java.util.Collection
    public final int hashCode() {
            r0 = this;
            r0 = 1
            return r0
    }

    @Override // java.util.List
    public final /* bridge */ int indexOf(java.lang.Object r1) {
            r0 = this;
            r0 = -1
            return r0
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
            r0 = this;
            r0 = 1
            return r0
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator iterator() {
            r0 = this;
            iz r0 = p000.C0412iz.f5249
            return r0
    }

    @Override // java.util.List
    public final /* bridge */ int lastIndexOf(java.lang.Object r1) {
            r0 = this;
            r0 = -1
            return r0
    }

    @Override // java.util.List
    public final java.util.ListIterator listIterator() {
            r0 = this;
            iz r0 = p000.C0412iz.f5249
            return r0
    }

    @Override // java.util.List
    public final java.util.ListIterator listIterator(int r1) {
            r0 = this;
            if (r1 != 0) goto L5
            iz r0 = p000.C0412iz.f5249
            return r0
        L5:
            java.lang.String r0 = "Index: "
            java.lang.String r0 = p000.a12.m17(r0, r1)
            p000.C1080.m7269(r0)
            r0 = 0
            return r0
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ java.lang.Object remove(int r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(java.lang.Object r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(java.util.Collection r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(java.util.Collection r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ java.lang.Object set(int r1, java.lang.Object r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // java.util.List
    public final java.util.List subList(int r2, int r3) {
            r1 = this;
            if (r2 != 0) goto L5
            if (r3 != 0) goto L5
            return r1
        L5:
            java.lang.String r1 = "fromIndex: "
            java.lang.String r0 = ", toIndex: "
            java.lang.String r1 = p000.AbstractC0602nx.m4125(r2, r3, r1, r0)
            p000.C1080.m7269(r1)
            r1 = 0
            return r1
    }

    @Override // java.util.List, java.util.Collection
    public final java.lang.Object[] toArray() {
            r0 = this;
            java.lang.Object[] r0 = p000.AbstractC0782s1.m5320(r0)
            return r0
    }

    @Override // java.util.List, java.util.Collection
    public final java.lang.Object[] toArray(java.lang.Object[] r1) {
            r0 = this;
            r1.getClass()
            java.lang.Object[] r0 = p000.AbstractC0782s1.m5321(r0, r1)
            return r0
    }

    public final java.lang.String toString() {
            r0 = this;
            java.lang.String r0 = "[]"
            return r0
    }
}
