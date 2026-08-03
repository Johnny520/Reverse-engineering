package a;

/* JADX INFO: loaded from: classes.dex */
public final class E1<T> implements java.util.Collection<T>, a.InterfaceC0336q9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T[] f65a;
    public final boolean b;

    public E1(T[] r2, boolean r3) {
            r1 = this;
            java.lang.String r0 = "values"
            a.C0193i9.e(r2, r0)
            r1.<init>()
            r1.f65a = r2
            r1.b = r3
            return
    }

    @Override // java.util.Collection
    public final boolean add(T r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r2.<init>(r0)
            throw r2
    }

    @Override // java.util.Collection
    public final boolean addAll(java.util.Collection<? extends T> r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r2.<init>(r0)
            throw r2
    }

    @Override // java.util.Collection
    public final void clear() {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.Collection
    public final boolean contains(java.lang.Object r6) {
            r5 = this;
            java.lang.String r0 = "<this>"
            T[] r1 = r5.f65a
            a.C0193i9.e(r1, r0)
            r0 = 0
            if (r6 != 0) goto L16
            int r6 = r1.length
            r2 = r0
        Lc:
            if (r2 >= r6) goto L27
            r3 = r1[r2]
            if (r3 != 0) goto L13
            goto L28
        L13:
            int r2 = r2 + 1
            goto Lc
        L16:
            int r2 = r1.length
            r3 = r0
        L18:
            if (r3 >= r2) goto L27
            r4 = r1[r3]
            boolean r4 = r6.equals(r4)
            if (r4 == 0) goto L24
            r2 = r3
            goto L28
        L24:
            int r3 = r3 + 1
            goto L18
        L27:
            r2 = -1
        L28:
            if (r2 < 0) goto L2c
            r6 = 1
            return r6
        L2c:
            return r0
    }

    @Override // java.util.Collection
    public final boolean containsAll(java.util.Collection<? extends java.lang.Object> r3) {
            r2 = this;
            java.lang.String r0 = "elements"
            a.C0193i9.e(r3, r0)
            boolean r0 = r3.isEmpty()
            r1 = 1
            if (r0 == 0) goto Ld
            return r1
        Ld:
            java.util.Iterator r3 = r3.iterator()
        L11:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L23
            java.lang.Object r0 = r3.next()
            boolean r0 = r2.contains(r0)
            if (r0 != 0) goto L11
            r3 = 0
            return r3
        L23:
            return r1
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
            r1 = this;
            T[] r0 = r1.f65a
            int r0 = r0.length
            if (r0 != 0) goto L7
            r0 = 1
            return r0
        L7:
            r0 = 0
            return r0
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final java.util.Iterator<T> iterator() {
            r1 = this;
            T[] r0 = r1.f65a
            a.G1 r0 = a.C0435w1.I(r0)
            return r0
    }

    @Override // java.util.Collection
    public final boolean remove(java.lang.Object r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r2.<init>(r0)
            throw r2
    }

    @Override // java.util.Collection
    public final boolean removeAll(java.util.Collection<? extends java.lang.Object> r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r2.<init>(r0)
            throw r2
    }

    @Override // java.util.Collection
    public final boolean retainAll(java.util.Collection<? extends java.lang.Object> r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r2.<init>(r0)
            throw r2
    }

    @Override // java.util.Collection
    public final int size() {
            r1 = this;
            T[] r0 = r1.f65a
            int r0 = r0.length
            return r0
    }

    @Override // java.util.Collection
    public final java.lang.Object[] toArray() {
            r3 = this;
            T[] r0 = r3.f65a
            java.lang.String r1 = "<this>"
            a.C0193i9.e(r0, r1)
            boolean r1 = r3.b
            java.lang.Class<java.lang.Object[]> r2 = java.lang.Object[].class
            if (r1 == 0) goto L18
            java.lang.Class r1 = r0.getClass()
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L18
            return r0
        L18:
            int r1 = r0.length
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1, r2)
            java.lang.String r1 = "copyOf(...)"
            a.C0193i9.d(r0, r1)
            return r0
    }

    @Override // java.util.Collection
    public final <T> T[] toArray(T[] r2) {
            r1 = this;
            java.lang.String r0 = "array"
            a.C0193i9.e(r2, r0)
            java.lang.Object[] r2 = a.C0435w1.X(r1, r2)
            return r2
    }
}
