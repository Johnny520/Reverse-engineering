package xhss;

/* JADX INFO: renamed from: xhss.ᛳᛲᛷᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0243 implements java.util.Collection, xhss.InterfaceC0057 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final java.lang.Object[] f910;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final boolean f911;

    public C0243(boolean r1, java.lang.Object[] r2) {
            r0 = this;
            r0.<init>()
            r0.f910 = r2
            r0.f911 = r1
            return
    }

    @Override // java.util.Collection
    public final boolean add(java.lang.Object r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.Collection
    public final boolean addAll(java.util.Collection r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.Collection
    public final void clear() {
            r1 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r1.<init>(r0)
            throw r1
    }

    @Override // java.util.Collection
    public final boolean contains(java.lang.Object r1) {
            r0 = this;
            java.lang.Object[] r0 = r0.f910
            int r0 = xhss.AbstractC0193.m455(r0, r1)
            if (r0 < 0) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    @Override // java.util.Collection
    public final boolean containsAll(java.util.Collection r3) {
            r2 = this;
            boolean r0 = r3.isEmpty()
            r1 = 1
            if (r0 == 0) goto L8
            return r1
        L8:
            java.util.Iterator r3 = r3.iterator()
        Lc:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L1e
            java.lang.Object r0 = r3.next()
            boolean r0 = r2.contains(r0)
            if (r0 != 0) goto Lc
            r2 = 0
            return r2
        L1e:
            return r1
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
            r0 = this;
            java.lang.Object[] r0 = r0.f910
            int r0 = r0.length
            if (r0 != 0) goto L7
            r0 = 1
            return r0
        L7:
            r0 = 0
            return r0
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final java.util.Iterator iterator() {
            r2 = this;
            xhss.ᛸᛲᲀᛵ r0 = new xhss.ᛸᛲᲀᛵ
            r1 = 1
            java.lang.Object[] r2 = r2.f910
            r0.<init>(r1, r2)
            return r0
    }

    @Override // java.util.Collection
    public final boolean remove(java.lang.Object r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.Collection
    public final boolean removeAll(java.util.Collection r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.Collection
    public final boolean retainAll(java.util.Collection r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.Collection
    public final int size() {
            r0 = this;
            java.lang.Object[] r0 = r0.f910
            int r0 = r0.length
            return r0
    }

    @Override // java.util.Collection
    public final java.lang.Object[] toArray() {
            r2 = this;
            java.lang.Object[] r0 = r2.f910
            boolean r2 = r2.f911
            java.lang.Class<java.lang.Object[]> r1 = java.lang.Object[].class
            if (r2 == 0) goto L13
            java.lang.Class r2 = r0.getClass()
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L13
            return r0
        L13:
            int r2 = r0.length
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r0, r2, r1)
            return r2
    }

    @Override // java.util.Collection
    public final java.lang.Object[] toArray(java.lang.Object[] r1) {
            r0 = this;
            java.lang.Object[] r0 = xhss.AbstractC0561.m998(r0, r1)
            return r0
    }
}
