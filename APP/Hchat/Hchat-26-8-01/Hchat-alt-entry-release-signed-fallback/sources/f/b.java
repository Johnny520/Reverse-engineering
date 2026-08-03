package f;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements java.util.Set {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ f.e f2773g;

    public b(f.e r1) {
            r0 = this;
            r0.<init>()
            r0.f2773g = r1
            return
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(java.lang.Object r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(java.util.Collection r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
            r1 = this;
            f.e r0 = r1.f2773g
            r0.clear()
            return
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(java.lang.Object r2) {
            r1 = this;
            f.e r0 = r1.f2773g
            boolean r2 = r0.containsKey(r2)
            return r2
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(java.util.Collection r2) {
            r1 = this;
            f.e r0 = r1.f2773g
            boolean r2 = r0.c(r2)
            return r2
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            f.e r0 = r3.f2773g
            if (r3 != r4) goto L5
            goto L19
        L5:
            boolean r1 = r4 instanceof java.util.Set
            if (r1 == 0) goto L1b
            java.util.Set r4 = (java.util.Set) r4
            int r1 = r0.f2792i     // Catch: java.lang.Throwable -> L1b
            int r2 = r4.size()     // Catch: java.lang.Throwable -> L1b
            if (r1 != r2) goto L1b
            boolean r4 = r0.c(r4)     // Catch: java.lang.Throwable -> L1b
            if (r4 == 0) goto L1b
        L19:
            r4 = 1
            return r4
        L1b:
            r4 = 0
            return r4
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
            r5 = this;
            f.e r0 = r5.f2773g
            int r1 = r0.f2792i
            int r1 = r1 + (-1)
            r2 = 0
            r3 = r2
        L8:
            if (r1 < 0) goto L1a
            java.lang.Object r4 = r0.h(r1)
            if (r4 != 0) goto L12
            r4 = r2
            goto L16
        L12:
            int r4 = r4.hashCode()
        L16:
            int r3 = r3 + r4
            int r1 = r1 + (-1)
            goto L8
        L1a:
            return r3
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
            r1 = this;
            f.e r0 = r1.f2773g
            boolean r0 = r0.isEmpty()
            return r0
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator iterator() {
            r3 = this;
            f.a r0 = new f.a
            f.e r1 = r3.f2773g
            r2 = 0
            r0.<init>(r1, r2)
            return r0
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(java.lang.Object r2) {
            r1 = this;
            f.e r0 = r1.f2773g
            int r2 = r0.f(r2)
            if (r2 < 0) goto Ld
            r0.j(r2)
            r2 = 1
            return r2
        Ld:
            r2 = 0
            return r2
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(java.util.Collection r4) {
            r3 = this;
            f.e r0 = r3.f2773g
            int r1 = r0.f2792i
            java.util.Iterator r4 = r4.iterator()
        L8:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L16
            java.lang.Object r2 = r4.next()
            r0.i(r2)
            goto L8
        L16:
            int r4 = r0.f2792i
            if (r1 == r4) goto L1c
            r4 = 1
            goto L1d
        L1c:
            r4 = 0
        L1d:
            return r4
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(java.util.Collection r5) {
            r4 = this;
            f.e r0 = r4.f2773g
            int r1 = r0.f2792i
            int r2 = r1 + (-1)
        L6:
            if (r2 < 0) goto L18
            java.lang.Object r3 = r0.h(r2)
            boolean r3 = r5.contains(r3)
            if (r3 != 0) goto L15
            r0.j(r2)
        L15:
            int r2 = r2 + (-1)
            goto L6
        L18:
            int r5 = r0.f2792i
            if (r1 == r5) goto L1e
            r5 = 1
            return r5
        L1e:
            r5 = 0
            return r5
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
            r1 = this;
            f.e r0 = r1.f2773g
            int r0 = r0.f2792i
            return r0
    }

    @Override // java.util.Set, java.util.Collection
    public final java.lang.Object[] toArray() {
            r5 = this;
            f.e r0 = r5.f2773g
            int r1 = r0.f2792i
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r3 = 0
        L7:
            if (r3 >= r1) goto L12
            java.lang.Object r4 = r0.h(r3)
            r2[r3] = r4
            int r3 = r3 + 1
            goto L7
        L12:
            return r2
    }

    @Override // java.util.Set, java.util.Collection
    public final java.lang.Object[] toArray(java.lang.Object[] r5) {
            r4 = this;
            f.e r0 = r4.f2773g
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
            java.lang.Object r3 = r0.h(r2)
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
