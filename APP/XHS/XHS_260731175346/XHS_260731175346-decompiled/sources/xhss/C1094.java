package xhss;

/* JADX INFO: renamed from: xhss.ᲇᲁᛷᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C1094 extends java.util.AbstractCollection implements java.util.Collection, xhss.InterfaceC0601 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final xhss.C0686 f3527;

    public C1094(xhss.C0686 r1) {
            r0 = this;
            r0.<init>()
            r0.f3527 = r1
            return
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(java.lang.Object r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(java.util.Collection r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
            r0 = this;
            xhss.ᛷᛸᛵᛶ r0 = r0.f3527
            r0.clear()
            return
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(java.lang.Object r1) {
            r0 = this;
            xhss.ᛷᛸᛵᛶ r0 = r0.f3527
            boolean r0 = r0.containsValue(r1)
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
            r0 = this;
            xhss.ᛷᛸᛵᛶ r0 = r0.f3527
            boolean r0 = r0.isEmpty()
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator iterator() {
            r2 = this;
            xhss.ᲈᛴᲈᛵ r0 = new xhss.ᲈᛴᲈᛵ
            r1 = 2
            xhss.ᛷᛸᛵᛶ r2 = r2.f3527
            r0.<init>(r2, r1)
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(java.lang.Object r3) {
            r2 = this;
            xhss.ᛷᛸᛵᛶ r2 = r2.f3527
            r2.m1164()
            int r0 = r2.f2328
        L7:
            r1 = -1
            int r0 = r0 + r1
            if (r0 < 0) goto L1c
            int[] r1 = r2.f2329
            r1 = r1[r0]
            if (r1 < 0) goto L7
            java.lang.Object[] r1 = r2.f2321
            r1 = r1[r0]
            boolean r1 = xhss.AbstractC0007.m97(r1, r3)
            if (r1 == 0) goto L7
            r1 = r0
        L1c:
            if (r1 >= 0) goto L20
            r2 = 0
            return r2
        L20:
            r2.m1168(r1)
            r2 = 1
            return r2
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(java.util.Collection r2) {
            r1 = this;
            xhss.ᛷᛸᛵᛶ r0 = r1.f3527
            r0.m1164()
            boolean r1 = super.removeAll(r2)
            return r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(java.util.Collection r2) {
            r1 = this;
            xhss.ᛷᛸᛵᛶ r0 = r1.f3527
            r0.m1164()
            boolean r1 = super.retainAll(r2)
            return r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
            r0 = this;
            xhss.ᛷᛸᛵᛶ r0 = r0.f3527
            int r0 = r0.f2327
            return r0
    }
}
