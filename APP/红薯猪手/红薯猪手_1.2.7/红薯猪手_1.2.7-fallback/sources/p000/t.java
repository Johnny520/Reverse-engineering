package p000;

/* JADX INFO: loaded from: classes.dex */
public final class t<T> implements java.util.Collection<T>, p000.n4 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final T[] f1014;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final boolean f1015;

    public t(java.lang.Object[] r1) {
            r0 = this;
            r0.<init>()
            r0.f1014 = r1
            r1 = 1
            r0.f1015 = r1
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
            T[] r0 = r5.f1014
            java.lang.String r1 = "<this>"
            p000.h4.m189(r1, r0)
            r1 = 0
            if (r6 != 0) goto L16
            int r6 = r0.length
            r2 = r1
        Lc:
            if (r2 >= r6) goto L27
            r3 = r0[r2]
            if (r3 != 0) goto L13
            goto L28
        L13:
            int r2 = r2 + 1
            goto Lc
        L16:
            int r2 = r0.length
            r3 = r1
        L18:
            if (r3 >= r2) goto L27
            r4 = r0[r3]
            boolean r4 = p000.h4.m185(r6, r4)
            if (r4 == 0) goto L24
            r2 = r3
            goto L28
        L24:
            int r3 = r3 + 1
            goto L18
        L27:
            r2 = -1
        L28:
            if (r2 < 0) goto L2b
            r1 = 1
        L2b:
            return r1
    }

    @Override // java.util.Collection
    public final boolean containsAll(java.util.Collection<? extends java.lang.Object> r3) {
            r2 = this;
            java.lang.String r0 = "elements"
            p000.h4.m189(r0, r3)
            boolean r0 = r3.isEmpty()
            r1 = 1
            if (r0 == 0) goto Ld
            goto L22
        Ld:
            java.util.Iterator r3 = r3.iterator()
        L11:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L22
            java.lang.Object r0 = r3.next()
            boolean r0 = r2.contains(r0)
            if (r0 != 0) goto L11
            r1 = 0
        L22:
            return r1
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
            r1 = this;
            T[] r0 = r1.f1014
            int r0 = r0.length
            if (r0 != 0) goto L7
            r0 = 1
            goto L8
        L7:
            r0 = 0
        L8:
            return r0
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final java.util.Iterator<T> iterator() {
            r2 = this;
            T[] r0 = r2.f1014
            java.lang.String r1 = "array"
            p000.h4.m189(r1, r0)
            ۟.u r1 = new ۟.u
            r1.<init>(r0)
            return r1
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
            T[] r0 = r1.f1014
            int r0 = r0.length
            return r0
    }

    @Override // java.util.Collection
    public final java.lang.Object[] toArray() {
            r4 = this;
            T[] r0 = r4.f1014
            boolean r1 = r4.f1015
            java.lang.Class<java.lang.Object[]> r2 = java.lang.Object[].class
            java.lang.String r3 = "<this>"
            p000.h4.m189(r3, r0)
            if (r1 == 0) goto L18
            java.lang.Class r1 = r0.getClass()
            boolean r1 = p000.h4.m185(r1, r2)
            if (r1 == 0) goto L18
            goto L22
        L18:
            int r1 = r0.length
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1, r2)
            java.lang.String r1 = "copyOf(...)"
            p000.h4.m188(r1, r0)
        L22:
            return r0
    }

    @Override // java.util.Collection
    public final <T> T[] toArray(T[] r2) {
            r1 = this;
            java.lang.String r0 = "array"
            p000.h4.m189(r0, r2)
            java.lang.Object[] r2 = p000.jb.m221(r1, r2)
            return r2
    }
}
