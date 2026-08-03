package f;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements java.util.Collection {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ f.e f2787g;

    public d(f.e r1) {
            r0 = this;
            r0.<init>()
            r0.f2787g = r1
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
            f.e r0 = r1.f2787g
            r0.clear()
            return
    }

    @Override // java.util.Collection
    public final boolean contains(java.lang.Object r2) {
            r1 = this;
            f.e r0 = r1.f2787g
            int r2 = r0.a(r2)
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
            f.e r0 = r1.f2787g
            boolean r0 = r0.isEmpty()
            return r0
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final java.util.Iterator iterator() {
            r3 = this;
            f.a r0 = new f.a
            f.e r1 = r3.f2787g
            r2 = 1
            r0.<init>(r1, r2)
            return r0
    }

    @Override // java.util.Collection
    public final boolean remove(java.lang.Object r2) {
            r1 = this;
            f.e r0 = r1.f2787g
            int r2 = r0.a(r2)
            if (r2 < 0) goto Ld
            r0.j(r2)
            r2 = 1
            return r2
        Ld:
            r2 = 0
            return r2
    }

    @Override // java.util.Collection
    public final boolean removeAll(java.util.Collection r7) {
            r6 = this;
            f.e r0 = r6.f2787g
            int r1 = r0.f2792i
            r2 = 0
            r3 = r2
        L6:
            if (r2 >= r1) goto L1d
            java.lang.Object r4 = r0.l(r2)
            boolean r4 = r7.contains(r4)
            r5 = 1
            if (r4 == 0) goto L1b
            r0.j(r2)
            int r2 = r2 + (-1)
            int r1 = r1 + (-1)
            r3 = r5
        L1b:
            int r2 = r2 + r5
            goto L6
        L1d:
            return r3
    }

    @Override // java.util.Collection
    public final boolean retainAll(java.util.Collection r7) {
            r6 = this;
            f.e r0 = r6.f2787g
            int r1 = r0.f2792i
            r2 = 0
            r3 = r2
        L6:
            if (r2 >= r1) goto L1d
            java.lang.Object r4 = r0.l(r2)
            boolean r4 = r7.contains(r4)
            r5 = 1
            if (r4 != 0) goto L1b
            r0.j(r2)
            int r2 = r2 + (-1)
            int r1 = r1 + (-1)
            r3 = r5
        L1b:
            int r2 = r2 + r5
            goto L6
        L1d:
            return r3
    }

    @Override // java.util.Collection
    public final int size() {
            r1 = this;
            f.e r0 = r1.f2787g
            int r0 = r0.f2792i
            return r0
    }

    @Override // java.util.Collection
    public final java.lang.Object[] toArray() {
            r5 = this;
            f.e r0 = r5.f2787g
            int r1 = r0.f2792i
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r3 = 0
        L7:
            if (r3 >= r1) goto L12
            java.lang.Object r4 = r0.l(r3)
            r2[r3] = r4
            int r3 = r3 + 1
            goto L7
        L12:
            return r2
    }

    @Override // java.util.Collection
    public final java.lang.Object[] toArray(java.lang.Object[] r5) {
            r4 = this;
            f.e r0 = r4.f2787g
            int r1 = r0.f2792i
            int r2 = r5.length
            if (r2 >= r1) goto L15
            java.lang.Class r5 = r5.getClass()
            java.lang.Class r5 = r5.getComponentType()
            java.lang.Object r5 = java.lang.reflect.Array.newInstance(r5, r1)
            java.lang.Object[] r5 = (java.lang.Object[]) r5
        L15:
            r2 = 0
        L16:
            if (r2 >= r1) goto L21
            java.lang.Object r3 = r0.l(r2)
            r5[r2] = r3
            int r2 = r2 + 1
            goto L16
        L21:
            int r0 = r5.length
            if (r0 <= r1) goto L27
            r0 = 0
            r5[r1] = r0
        L27:
            return r5
    }
}
