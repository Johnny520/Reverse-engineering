package f;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements java.util.Set, hg.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f2825g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final f.k0 f2826h;

    public h(f.k0 r1, int r2) {
            r0 = this;
            r0.f2825g = r2
            r1.getClass()
            switch(r2) {
                case 1: goto Le;
                default: goto L8;
            }
        L8:
            r0.<init>()
            r0.f2826h = r1
            return
        Le:
            r0.<init>()
            r0.f2826h = r1
            return
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(java.lang.Object r2) {
            r1 = this;
            int r2 = r1.f2825g
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

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(java.util.Collection r2) {
            r1 = this;
            int r2 = r1.f2825g
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

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
            r2 = this;
            int r0 = r2.f2825g
            switch(r0) {
                case 0: goto Ld;
                default: goto L5;
            }
        L5:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
        Ld:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(java.lang.Object r3) {
            r2 = this;
            int r0 = r2.f2825g
            switch(r0) {
                case 0: goto Lc;
                default: goto L5;
            }
        L5:
            f.k0 r0 = r2.f2826h
            boolean r3 = r0.c(r3)
            return r3
        Lc:
            boolean r0 = r3 instanceof java.util.Map.Entry
            if (r0 != 0) goto L12
            r3 = 0
            goto L26
        L12:
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            f.k0 r0 = r2.f2826h
            java.lang.Object r1 = r3.getKey()
            java.lang.Object r0 = r0.g(r1)
            java.lang.Object r3 = r3.getValue()
            boolean r3 = gg.l.a(r0, r3)
        L26:
            return r3
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(java.util.Collection r5) {
            r4 = this;
            int r0 = r4.f2825g
            r5.getClass()
            switch(r0) {
                case 0: goto L2d;
                default: goto L8;
            }
        L8:
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            r0 = r5
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            r1 = 1
            if (r0 == 0) goto L15
            goto L2c
        L15:
            java.util.Iterator r5 = r5.iterator()
        L19:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L2c
            java.lang.Object r0 = r5.next()
            f.k0 r2 = r4.f2826h
            boolean r0 = r2.c(r0)
            if (r0 != 0) goto L19
            r1 = 0
        L2c:
            return r1
        L2d:
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            r0 = r5
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            r1 = 1
            if (r0 == 0) goto L3a
            goto L5f
        L3a:
            java.util.Iterator r5 = r5.iterator()
        L3e:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L5f
            java.lang.Object r0 = r5.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            f.k0 r2 = r4.f2826h
            java.lang.Object r3 = r0.getKey()
            java.lang.Object r2 = r2.g(r3)
            java.lang.Object r0 = r0.getValue()
            boolean r0 = gg.l.a(r2, r0)
            if (r0 != 0) goto L3e
            r1 = 0
        L5f:
            return r1
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
            r1 = this;
            int r0 = r1.f2825g
            switch(r0) {
                case 0: goto Lc;
                default: goto L5;
            }
        L5:
            f.k0 r0 = r1.f2826h
            boolean r0 = r0.i()
            return r0
        Lc:
            f.k0 r0 = r1.f2826h
            boolean r0 = r0.i()
            return r0
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator iterator() {
            r3 = this;
            int r0 = r3.f2825g
            switch(r0) {
                case 0: goto L11;
                default: goto L5;
            }
        L5:
            f.g r0 = new f.g
            r1 = 0
            r2 = 1
            r0.<init>(r3, r1, r2)
            ng.k r0 = fb.v0.B(r0)
            return r0
        L11:
            f.g r0 = new f.g
            r1 = 0
            r2 = 0
            r0.<init>(r3, r1, r2)
            ng.k r0 = fb.v0.B(r0)
            return r0
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(java.lang.Object r2) {
            r1 = this;
            int r2 = r1.f2825g
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

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(java.util.Collection r2) {
            r1 = this;
            int r2 = r1.f2825g
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

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(java.util.Collection r2) {
            r1 = this;
            int r2 = r1.f2825g
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

    @Override // java.util.Set, java.util.Collection
    public final int size() {
            r1 = this;
            int r0 = r1.f2825g
            switch(r0) {
                case 0: goto La;
                default: goto L5;
            }
        L5:
            f.k0 r0 = r1.f2826h
            int r0 = r0.f2852e
            return r0
        La:
            f.k0 r0 = r1.f2826h
            int r0 = r0.f2852e
            return r0
    }

    @Override // java.util.Set, java.util.Collection
    public final java.lang.Object[] toArray() {
            r1 = this;
            int r0 = r1.f2825g
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

    @Override // java.util.Set, java.util.Collection
    public final java.lang.Object[] toArray(java.lang.Object[] r2) {
            r1 = this;
            int r0 = r1.f2825g
            switch(r0) {
                case 0: goto Ld;
                default: goto L5;
            }
        L5:
            r2.getClass()
            java.lang.Object[] r2 = gg.k.b(r1, r2)
            return r2
        Ld:
            r2.getClass()
            java.lang.Object[] r2 = gg.k.b(r1, r2)
            return r2
    }
}
