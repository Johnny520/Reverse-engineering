package xhss;

/* JADX INFO: renamed from: xhss.ᛱᛲᲁᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0020 implements java.util.Set, java.io.Serializable, xhss.InterfaceC0057 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public static final xhss.C0020 f200 = null;

    static {
            xhss.ᛱᛲᲁᛴ r0 = new xhss.ᛱᛲᲁᛴ
            r0.<init>()
            xhss.C0020.f200 = r0
            return
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(java.lang.Object r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(java.util.Collection r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
            r1 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r1.<init>(r0)
            throw r1
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ boolean contains(java.lang.Object r1) {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(java.util.Collection r1) {
            r0 = this;
            boolean r0 = r1.isEmpty()
            return r0
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(java.lang.Object r1) {
            r0 = this;
            boolean r0 = r1 instanceof java.util.Set
            if (r0 == 0) goto Le
            java.util.Set r1 = (java.util.Set) r1
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto Le
            r0 = 1
            return r0
        Le:
            r0 = 0
            return r0
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
            r0 = this;
            r0 = 1
            return r0
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator iterator() {
            r0 = this;
            xhss.ᛲᲇᲇᲁ r0 = xhss.C0219.f803
            return r0
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(java.lang.Object r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(java.util.Collection r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(java.util.Collection r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // java.util.Set, java.util.Collection
    public final java.lang.Object[] toArray() {
            r0 = this;
            java.lang.Object[] r0 = xhss.AbstractC0561.m1014(r0)
            return r0
    }

    @Override // java.util.Set, java.util.Collection
    public final java.lang.Object[] toArray(java.lang.Object[] r1) {
            r0 = this;
            java.lang.Object[] r0 = xhss.AbstractC0561.m998(r0, r1)
            return r0
    }

    public final java.lang.String toString() {
            r0 = this;
            java.lang.String r0 = "[]"
            return r0
    }
}
