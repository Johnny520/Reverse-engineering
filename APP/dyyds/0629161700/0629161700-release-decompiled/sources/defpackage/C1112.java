package defpackage;

/* JADX INFO: renamed from: ᛶᛷᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1112 extends java.util.AbstractCollection implements java.util.Collection, defpackage.InterfaceC0958 {

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final defpackage.C0665 f4981;

    public C1112(defpackage.C0665 r1) {
            r0 = this;
            r0.<init>()
            r0.f4981 = r1
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
            ᛴᛴᲁᲇ r0 = r0.f4981
            r0.clear()
            return
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(java.lang.Object r1) {
            r0 = this;
            ᛴᛴᲁᲇ r0 = r0.f4981
            boolean r0 = r0.containsValue(r1)
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
            r0 = this;
            ᛴᛴᲁᲇ r0 = r0.f4981
            boolean r0 = r0.isEmpty()
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator iterator() {
            r2 = this;
            ᲇᛲᛱᛵ r0 = new ᲇᛲᛱᛵ
            r1 = 2
            ᛴᛴᲁᲇ r2 = r2.f4981
            r0.<init>(r2, r1)
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(java.lang.Object r3) {
            r2 = this;
            ᛴᛴᲁᲇ r2 = r2.f4981
            r2.m1500()
            int r0 = r2.f3221
        L7:
            r1 = -1
            int r0 = r0 + r1
            if (r0 < 0) goto L1c
            int[] r1 = r2.f3226
            r1 = r1[r0]
            if (r1 < 0) goto L7
            java.lang.Object[] r1 = r2.f3228
            r1 = r1[r0]
            boolean r1 = defpackage.AbstractC0498.m1280(r1, r3)
            if (r1 == 0) goto L7
            r1 = r0
        L1c:
            if (r1 >= 0) goto L20
            r2 = 0
            return r2
        L20:
            r2.m1495(r1)
            r2 = 1
            return r2
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(java.util.Collection r2) {
            r1 = this;
            ᛴᛴᲁᲇ r0 = r1.f4981
            r0.m1500()
            boolean r1 = super.removeAll(r2)
            return r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(java.util.Collection r2) {
            r1 = this;
            ᛴᛴᲁᲇ r0 = r1.f4981
            r0.m1500()
            boolean r1 = super.retainAll(r2)
            return r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
            r0 = this;
            ᛴᛴᲁᲇ r0 = r0.f4981
            int r0 = r0.f3222
            return r0
    }
}
