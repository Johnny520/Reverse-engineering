package f;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class u0 implements java.util.Collection, hg.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f2913g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.Object f2914h;

    public u0() {
            r2 = this;
            r0 = 1
            r2.f2913g = r0
            int r0 = f.q0.f2887a
            f.g0 r0 = new f.g0
            r1 = 6
            r0.<init>(r1)
            r2.<init>()
            r2.f2914h = r0
            return
    }

    public u0(f.k0 r2) {
            r1 = this;
            r0 = 0
            r1.f2913g = r0
            r2.getClass()
            r1.<init>()
            r1.f2914h = r2
            return
    }

    @Override // java.util.Collection
    public final boolean add(java.lang.Object r2) {
            r1 = this;
            int r0 = r1.f2913g
            switch(r0) {
                case 0: goto Le;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r1.f2914h
            f.g0 r0 = (f.g0) r0
            boolean r2 = r0.a(r2)
            return r2
        Le:
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r2.<init>(r0)
            throw r2
    }

    @Override // java.util.Collection
    public final boolean addAll(java.util.Collection r2) {
            r1 = this;
            int r2 = r1.f2913g
            switch(r2) {
                case 0: goto Ld;
                default: goto L5;
            }
        L5:
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r2.<init>(r0)
            throw r2
        Ld:
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r2.<init>(r0)
            throw r2
    }

    @Override // java.util.Collection
    public final void clear() {
            r2 = this;
            int r0 = r2.f2913g
            switch(r0) {
                case 0: goto Ld;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r2.f2914h
            f.g0 r0 = (f.g0) r0
            r0.b()
            return
        Ld:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.Collection
    public final boolean contains(java.lang.Object r2) {
            r1 = this;
            int r0 = r1.f2913g
            switch(r0) {
                case 0: goto Le;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r1.f2914h
            f.g0 r0 = (f.g0) r0
            boolean r2 = r0.c(r2)
            return r2
        Le:
            java.lang.Object r0 = r1.f2914h
            f.k0 r0 = (f.k0) r0
            boolean r2 = r0.d(r2)
            return r2
    }

    @Override // java.util.Collection
    public final boolean containsAll(java.util.Collection r4) {
            r3 = this;
            int r0 = r3.f2913g
            switch(r0) {
                case 0: goto L23;
                default: goto L5;
            }
        L5:
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.Iterator r4 = r4.iterator()
        Lb:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L21
            java.lang.Object r0 = r4.next()
            java.lang.Object r1 = r3.f2914h
            f.g0 r1 = (f.g0) r1
            boolean r0 = r1.c(r0)
            if (r0 != 0) goto Lb
            r4 = 0
            goto L22
        L21:
            r4 = 1
        L22:
            return r4
        L23:
            r4.getClass()
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            r0 = r4
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            r1 = 1
            if (r0 == 0) goto L33
            goto L4c
        L33:
            java.util.Iterator r4 = r4.iterator()
        L37:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L4c
            java.lang.Object r0 = r4.next()
            java.lang.Object r2 = r3.f2914h
            f.k0 r2 = (f.k0) r2
            boolean r0 = r2.d(r0)
            if (r0 != 0) goto L37
            r1 = 0
        L4c:
            return r1
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
            r1 = this;
            int r0 = r1.f2913g
            switch(r0) {
                case 0: goto L11;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r1.f2914h
            f.g0 r0 = (f.g0) r0
            int r0 = r0.f2823g
            if (r0 != 0) goto Lf
            r0 = 1
            goto L10
        Lf:
            r0 = 0
        L10:
            return r0
        L11:
            java.lang.Object r0 = r1.f2914h
            f.k0 r0 = (f.k0) r0
            boolean r0 = r0.i()
            return r0
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final java.util.Iterator iterator() {
            r3 = this;
            int r0 = r3.f2913g
            switch(r0) {
                case 0: goto L17;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r3.f2914h
            f.g0 r0 = (f.g0) r0
            r0.getClass()
            f.j0 r1 = new f.j0
            r1.<init>(r0)
            f.i0 r0 = new f.i0
            r0.<init>(r1)
            return r0
        L17:
            f.g r0 = new f.g
            r1 = 0
            r2 = 2
            r0.<init>(r3, r1, r2)
            ng.k r0 = fb.v0.B(r0)
            return r0
    }

    @Override // java.util.Collection
    public final boolean remove(java.lang.Object r2) {
            r1 = this;
            int r0 = r1.f2913g
            switch(r0) {
                case 0: goto Le;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r1.f2914h
            f.g0 r0 = (f.g0) r0
            boolean r2 = r0.g(r2)
            return r2
        Le:
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r2.<init>(r0)
            throw r2
    }

    @Override // java.util.Collection
    public final boolean removeAll(java.util.Collection r2) {
            r1 = this;
            int r0 = r1.f2913g
            switch(r0) {
                case 0: goto Le;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r1.f2914h
            f.g0 r0 = (f.g0) r0
            boolean r2 = r0.g(r2)
            return r2
        Le:
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r2.<init>(r0)
            throw r2
    }

    @Override // java.util.Collection
    public final boolean removeIf(java.util.function.Predicate r2) {
            r1 = this;
            int r2 = r1.f2913g
            switch(r2) {
                case 0: goto Ld;
                default: goto L5;
            }
        L5:
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r2.<init>(r0)
            throw r2
        Ld:
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r2.<init>(r0)
            throw r2
    }

    @Override // java.util.Collection
    public final boolean retainAll(java.util.Collection r2) {
            r1 = this;
            int r0 = r1.f2913g
            switch(r0) {
                case 0: goto Le;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r1.f2914h
            f.g0 r0 = (f.g0) r0
            boolean r2 = r0.i(r2)
            return r2
        Le:
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r2.<init>(r0)
            throw r2
    }

    @Override // java.util.Collection
    public final int size() {
            r1 = this;
            int r0 = r1.f2913g
            switch(r0) {
                case 0: goto Lc;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r1.f2914h
            f.g0 r0 = (f.g0) r0
            int r0 = r0.f2823g
            return r0
        Lc:
            java.lang.Object r0 = r1.f2914h
            f.k0 r0 = (f.k0) r0
            int r0 = r0.f2852e
            return r0
    }

    @Override // java.util.Collection
    public final java.lang.Object[] toArray() {
            r1 = this;
            int r0 = r1.f2913g
            switch(r0) {
                case 0: goto La;
                default: goto L5;
            }
        L5:
            java.lang.Object[] r0 = gg.k.a(r1)
            return r0
        La:
            java.lang.Object[] r0 = gg.k.a(r1)
            return r0
    }

    @Override // java.util.Collection
    public final java.lang.Object[] toArray(java.lang.Object[] r2) {
            r1 = this;
            int r0 = r1.f2913g
            switch(r0) {
                case 0: goto La;
                default: goto L5;
            }
        L5:
            java.lang.Object[] r2 = gg.k.b(r1, r2)
            return r2
        La:
            r2.getClass()
            java.lang.Object[] r2 = gg.k.b(r1, r2)
            return r2
    }
}
