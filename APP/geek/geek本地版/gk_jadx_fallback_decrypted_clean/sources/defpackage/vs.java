package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class vs implements java.util.Collection {
    public final /* synthetic */ defpackage.m6 a;

    public vs(defpackage.m6 r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // java.util.Collection
    public final boolean add(java.lang.Object r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // java.util.Collection
    public final boolean addAll(java.util.Collection r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // java.util.Collection
    public final void clear() {
            r1 = this;
            m6 r0 = r1.a
            r0.a()
            return
    }

    @Override // java.util.Collection
    public final boolean contains(java.lang.Object r2) {
            r1 = this;
            m6 r0 = r1.a
            int r2 = r0.f(r2)
            if (r2 < 0) goto La
            r2 = 1
            return r2
        La:
            r2 = 0
            return r2
    }

    @Override // java.util.Collection
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

    @Override // java.util.Collection
    public final boolean isEmpty() {
            r1 = this;
            m6 r0 = r1.a
            int r0 = r0.d()
            if (r0 != 0) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final java.util.Iterator iterator() {
            r3 = this;
            ss r0 = new ss
            m6 r1 = r3.a
            r2 = 1
            r0.<init>(r1, r2)
            return r0
    }

    @Override // java.util.Collection
    public final boolean remove(java.lang.Object r2) {
            r1 = this;
            m6 r0 = r1.a
            int r2 = r0.f(r2)
            if (r2 < 0) goto Ld
            r0.g(r2)
            r2 = 1
            return r2
        Ld:
            r2 = 0
            return r2
    }

    @Override // java.util.Collection
    public final boolean removeAll(java.util.Collection r7) {
            r6 = this;
            m6 r0 = r6.a
            int r1 = r0.d()
            r2 = 0
            r3 = r2
        L8:
            if (r2 >= r1) goto L1f
            r4 = 1
            java.lang.Object r5 = r0.b(r2, r4)
            boolean r5 = r7.contains(r5)
            if (r5 == 0) goto L1d
            r0.g(r2)
            int r2 = r2 + (-1)
            int r1 = r1 + (-1)
            r3 = r4
        L1d:
            int r2 = r2 + r4
            goto L8
        L1f:
            return r3
    }

    @Override // java.util.Collection
    public final boolean retainAll(java.util.Collection r7) {
            r6 = this;
            m6 r0 = r6.a
            int r1 = r0.d()
            r2 = 0
            r3 = r2
        L8:
            if (r2 >= r1) goto L1f
            r4 = 1
            java.lang.Object r5 = r0.b(r2, r4)
            boolean r5 = r7.contains(r5)
            if (r5 != 0) goto L1d
            r0.g(r2)
            int r2 = r2 + (-1)
            int r1 = r1 + (-1)
            r3 = r4
        L1d:
            int r2 = r2 + r4
            goto L8
        L1f:
            return r3
    }

    @Override // java.util.Collection
    public final int size() {
            r1 = this;
            m6 r0 = r1.a
            int r0 = r0.d()
            return r0
    }

    @Override // java.util.Collection
    public final java.lang.Object[] toArray() {
            r5 = this;
            m6 r0 = r5.a
            int r1 = r0.d()
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r3 = 0
        L9:
            if (r3 >= r1) goto L15
            r4 = 1
            java.lang.Object r4 = r0.b(r3, r4)
            r2[r3] = r4
            int r3 = r3 + 1
            goto L9
        L15:
            return r2
    }

    @Override // java.util.Collection
    public final java.lang.Object[] toArray(java.lang.Object[] r3) {
            r2 = this;
            m6 r0 = r2.a
            r1 = 1
            java.lang.Object[] r3 = r0.i(r3, r1)
            return r3
    }
}
