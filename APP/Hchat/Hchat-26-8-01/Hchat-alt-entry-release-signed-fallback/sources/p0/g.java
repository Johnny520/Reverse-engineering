package p0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends java.util.AbstractCollection implements java.util.Collection, hg.b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f10061g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.Object f10062h;

    public /* synthetic */ g(java.lang.Object r1, int r2) {
            r0 = this;
            r0.f10061g = r2
            r0.<init>()
            r0.f10062h = r1
            return
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(java.lang.Object r1) {
            r0 = this;
            int r1 = r0.f10061g
            switch(r1) {
                case 0: goto Lb;
                default: goto L5;
            }
        L5:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
        Lb:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean addAll(java.util.Collection r2) {
            r1 = this;
            int r0 = r1.f10061g
            switch(r0) {
                case 1: goto La;
                default: goto L5;
            }
        L5:
            boolean r2 = super.addAll(r2)
            return r2
        La:
            r2.getClass()
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            r2.<init>()
            throw r2
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
            r1 = this;
            int r0 = r1.f10061g
            switch(r0) {
                case 0: goto Ld;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r1.f10062h
            uf.g r0 = (uf.g) r0
            r0.clear()
            return
        Ld:
            java.lang.Object r0 = r1.f10062h
            s0.g r0 = (s0.g) r0
            r0.clear()
            return
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(java.lang.Object r2) {
            r1 = this;
            int r0 = r1.f10061g
            switch(r0) {
                case 0: goto Le;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r1.f10062h
            uf.g r0 = (uf.g) r0
            boolean r2 = r0.containsValue(r2)
            return r2
        Le:
            java.lang.Object r0 = r1.f10062h
            s0.g r0 = (s0.g) r0
            boolean r2 = r0.containsValue(r2)
            return r2
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
            r1 = this;
            int r0 = r1.f10061g
            switch(r0) {
                case 1: goto La;
                default: goto L5;
            }
        L5:
            boolean r0 = super.isEmpty()
            return r0
        La:
            java.lang.Object r0 = r1.f10062h
            uf.g r0 = (uf.g) r0
            boolean r0 = r0.isEmpty()
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator iterator() {
            r7 = this;
            int r0 = r7.f10061g
            switch(r0) {
                case 0: goto L13;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r7.f10062h
            uf.g r0 = (uf.g) r0
            r0.getClass()
            uf.e r1 = new uf.e
            r2 = 2
            r1.<init>(r0, r2)
            return r1
        L13:
            p0.f r0 = new p0.f
            java.lang.Object r1 = r7.f10062h
            s0.g r1 = (s0.g) r1
            r2 = 8
            p0.k[] r3 = new p0.k[r2]
            r4 = 0
        L1e:
            if (r4 >= r2) goto L2b
            p0.l r5 = new p0.l
            r6 = 2
            r5.<init>(r6)
            r3[r4] = r5
            int r4 = r4 + 1
            goto L1e
        L2b:
            r0.<init>(r1, r3)
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(java.lang.Object r2) {
            r1 = this;
            int r0 = r1.f10061g
            switch(r0) {
                case 1: goto La;
                default: goto L5;
            }
        L5:
            boolean r2 = super.remove(r2)
            return r2
        La:
            java.lang.Object r0 = r1.f10062h
            uf.g r0 = (uf.g) r0
            r0.d()
            int r2 = r0.i(r2)
            if (r2 >= 0) goto L19
            r2 = 0
            goto L1d
        L19:
            r0.l(r2)
            r2 = 1
        L1d:
            return r2
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(java.util.Collection r2) {
            r1 = this;
            int r0 = r1.f10061g
            switch(r0) {
                case 1: goto La;
                default: goto L5;
            }
        L5:
            boolean r2 = super.removeAll(r2)
            return r2
        La:
            r2.getClass()
            java.lang.Object r0 = r1.f10062h
            uf.g r0 = (uf.g) r0
            r0.d()
            boolean r2 = super.removeAll(r2)
            return r2
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(java.util.Collection r2) {
            r1 = this;
            int r0 = r1.f10061g
            switch(r0) {
                case 1: goto La;
                default: goto L5;
            }
        L5:
            boolean r2 = super.retainAll(r2)
            return r2
        La:
            r2.getClass()
            java.lang.Object r0 = r1.f10062h
            uf.g r0 = (uf.g) r0
            r0.d()
            boolean r2 = super.retainAll(r2)
            return r2
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
            r1 = this;
            int r0 = r1.f10061g
            switch(r0) {
                case 0: goto Lc;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r1.f10062h
            uf.g r0 = (uf.g) r0
            int r0 = r0.f13792o
            goto L12
        Lc:
            java.lang.Object r0 = r1.f10062h
            s0.g r0 = (s0.g) r0
            int r0 = r0.f12193k
        L12:
            return r0
    }
}
