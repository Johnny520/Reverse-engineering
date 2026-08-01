package defpackage;

/* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0050 implements java.util.Collection, defpackage.InterfaceC0958 {
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
    public boolean contains(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r2.isEmpty()
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            java.util.Iterator r2 = r2.iterator()
        Lc:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L1e
            java.lang.Object r0 = r2.next()
            boolean r0 = defpackage.AbstractC0498.m1280(r0, r3)
            if (r0 == 0) goto Lc
            r2 = 1
            return r2
        L1e:
            return r1
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
    public boolean isEmpty() {
            r0 = this;
            int r0 = r0.mo395()
            if (r0 != 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
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
    public final /* bridge */ int size() {
            r0 = this;
            int r0 = r0.mo395()
            return r0
    }

    @Override // java.util.Collection
    public java.lang.Object[] toArray() {
            r0 = this;
            java.lang.Object[] r0 = defpackage.AbstractC1533.m2786(r0)
            return r0
    }

    @Override // java.util.Collection
    public java.lang.Object[] toArray(java.lang.Object[] r1) {
            r0 = this;
            java.lang.Object[] r0 = defpackage.AbstractC1533.m2783(r0, r1)
            return r0
    }

    public final java.lang.String toString() {
            r6 = this;
            ᲈᲈᛸᲁ r4 = new ᲈᲈᛸᲁ
            r0 = 0
            r4.<init>(r0, r6)
            r5 = 24
            java.lang.String r1 = ", "
            java.lang.String r2 = "["
            java.lang.String r3 = "]"
            r0 = r6
            java.lang.String r6 = defpackage.AbstractC1107.m2125(r0, r1, r2, r3, r4, r5)
            return r6
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public abstract int mo395();
}
