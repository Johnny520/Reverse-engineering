package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class me0 implements java.util.List, p000.lo0 {

    /* JADX INFO: renamed from: ε */
    public final int f7097;

    /* JADX INFO: renamed from: ζ */
    public final int f7098;

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ p000.ne0 f7099;

    public me0(p000.ne0 r1, int r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.f7099 = r1
            r0.f7097 = r2
            r0.f7098 = r3
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

    public final /* bridge */ /* synthetic */ void addFirst(java.lang.Object r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }

    public final /* bridge */ /* synthetic */ void addLast(java.lang.Object r1) {
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
    public final boolean contains(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof p000.q01
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            q01 r3 = (p000.q01) r3
            int r2 = r2.indexOf(r3)
            r3 = -1
            if (r2 == r3) goto L11
            r2 = 1
            return r2
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
            q01 r0 = (p000.q01) r0
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L6
            r1 = 0
            return r1
        L1a:
            r1 = 1
            return r1
    }

    @Override // java.util.List
    public final java.lang.Object get(int r2) {
            r1 = this;
            ne0 r0 = r1.f7099
            v11 r0 = r0.f7580
            int r1 = r1.f7097
            int r2 = r2 + r1
            java.lang.Object r1 = r0.m6020(r2)
            r1.getClass()
            q01 r1 = (p000.q01) r1
            return r1
    }

    @Override // java.util.List
    public final int indexOf(java.lang.Object r5) {
            r4 = this;
            boolean r0 = r5 instanceof p000.q01
            if (r0 != 0) goto L5
            goto L23
        L5:
            q01 r5 = (p000.q01) r5
            int r0 = r4.f7097
            int r1 = r4.f7098
            if (r0 > r1) goto L23
            r2 = r0
        Le:
            ne0 r3 = r4.f7099
            v11 r3 = r3.f7580
            java.lang.Object r3 = r3.m6020(r2)
            boolean r3 = p000.ln0.m3626(r3, r5)
            if (r3 == 0) goto L1e
            int r2 = r2 - r0
            return r2
        L1e:
            if (r2 == r1) goto L23
            int r2 = r2 + 1
            goto Le
        L23:
            r4 = -1
            return r4
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
            r0 = this;
            int r0 = r0.size()
            if (r0 != 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator iterator() {
            r3 = this;
            le0 r0 = new le0
            int r1 = r3.f7097
            int r2 = r3.f7098
            ne0 r3 = r3.f7099
            r0.<init>(r3, r1, r1, r2)
            return r0
    }

    @Override // java.util.List
    public final int lastIndexOf(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof p000.q01
            if (r0 != 0) goto L5
            goto L22
        L5:
            q01 r4 = (p000.q01) r4
            int r0 = r3.f7098
            int r1 = r3.f7097
            if (r1 > r0) goto L22
        Ld:
            ne0 r2 = r3.f7099
            v11 r2 = r2.f7580
            java.lang.Object r2 = r2.m6020(r0)
            boolean r2 = p000.ln0.m3626(r2, r4)
            if (r2 == 0) goto L1d
            int r0 = r0 - r1
            return r0
        L1d:
            if (r0 == r1) goto L22
            int r0 = r0 + (-1)
            goto Ld
        L22:
            r3 = -1
            return r3
    }

    @Override // java.util.List
    public final java.util.ListIterator listIterator() {
            r3 = this;
            le0 r0 = new le0
            int r1 = r3.f7097
            int r2 = r3.f7098
            ne0 r3 = r3.f7099
            r0.<init>(r3, r1, r1, r2)
            return r0
    }

    @Override // java.util.List
    public final java.util.ListIterator listIterator(int r4) {
            r3 = this;
            le0 r0 = new le0
            int r1 = r3.f7097
            int r4 = r4 + r1
            int r2 = r3.f7098
            ne0 r3 = r3.f7099
            r0.<init>(r3, r4, r1, r2)
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

    public final /* bridge */ /* synthetic */ java.lang.Object removeFirst() {
            r1 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r1.<init>(r0)
            throw r1
    }

    public final /* bridge */ /* synthetic */ java.lang.Object removeLast() {
            r1 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r1.<init>(r0)
            throw r1
    }

    @Override // java.util.List
    public final void replaceAll(java.util.function.UnaryOperator r1) {
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
    public final int size() {
            r1 = this;
            int r0 = r1.f7098
            int r1 = r1.f7097
            int r0 = r0 - r1
            return r0
    }

    @Override // java.util.List
    public final void sort(java.util.Comparator r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.List
    public final java.util.List subList(int r3, int r4) {
            r2 = this;
            me0 r0 = new me0
            int r1 = r2.f7097
            int r3 = r3 + r1
            int r1 = r1 + r4
            ne0 r2 = r2.f7099
            r0.<init>(r2, r3, r1)
            return r0
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
            java.lang.Object[] r0 = p000.AbstractC0782s1.m5321(r0, r1)
            return r0
    }
}
