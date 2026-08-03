package uf;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends tf.h {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f13797g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final uf.g f13798h;

    public /* synthetic */ h(uf.g r1, int r2) {
            r0 = this;
            r0.f13797g = r2
            r0.<init>()
            r0.f13798h = r1
            return
    }

    @Override // tf.h
    public final int a() {
            r1 = this;
            int r0 = r1.f13797g
            switch(r0) {
                case 0: goto La;
                default: goto L5;
            }
        L5:
            uf.g r0 = r1.f13798h
            int r0 = r0.f13792o
            return r0
        La:
            uf.g r0 = r1.f13798h
            int r0 = r0.f13792o
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(java.lang.Object r2) {
            r1 = this;
            int r0 = r1.f13797g
            switch(r0) {
                case 0: goto Lb;
                default: goto L5;
            }
        L5:
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            r2.<init>()
            throw r2
        Lb:
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            r2.getClass()
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            r2.<init>()
            throw r2
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(java.util.Collection r2) {
            r1 = this;
            int r0 = r1.f13797g
            r2.getClass()
            switch(r0) {
                case 0: goto Le;
                default: goto L8;
            }
        L8:
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            r2.<init>()
            throw r2
        Le:
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            r2.<init>()
            throw r2
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
            r1 = this;
            int r0 = r1.f13797g
            switch(r0) {
                case 0: goto Lb;
                default: goto L5;
            }
        L5:
            uf.g r0 = r1.f13798h
            r0.clear()
            return
        Lb:
            uf.g r0 = r1.f13798h
            r0.clear()
            return
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(java.lang.Object r4) {
            r3 = this;
            int r0 = r3.f13797g
            switch(r0) {
                case 0: goto Lc;
                default: goto L5;
            }
        L5:
            uf.g r0 = r3.f13798h
            boolean r4 = r0.containsKey(r4)
            return r4
        Lc:
            boolean r0 = r4 instanceof java.util.Map.Entry
            r1 = 0
            if (r0 != 0) goto L12
            goto L33
        L12:
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            uf.g r0 = r3.f13798h
            r0.getClass()
            java.lang.Object r2 = r4.getKey()
            int r2 = r0.h(r2)
            if (r2 >= 0) goto L24
            goto L33
        L24:
            java.lang.Object[] r0 = r0.f13785h
            r0.getClass()
            r0 = r0[r2]
            java.lang.Object r4 = r4.getValue()
            boolean r1 = gg.l.a(r0, r4)
        L33:
            return r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(java.util.Collection r2) {
            r1 = this;
            int r0 = r1.f13797g
            switch(r0) {
                case 0: goto La;
                default: goto L5;
            }
        L5:
            boolean r2 = super.containsAll(r2)
            return r2
        La:
            r2.getClass()
            uf.g r0 = r1.f13798h
            boolean r2 = r0.f(r2)
            return r2
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
            r1 = this;
            int r0 = r1.f13797g
            switch(r0) {
                case 0: goto Lc;
                default: goto L5;
            }
        L5:
            uf.g r0 = r1.f13798h
            boolean r0 = r0.isEmpty()
            return r0
        Lc:
            uf.g r0 = r1.f13798h
            boolean r0 = r0.isEmpty()
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final java.util.Iterator iterator() {
            r3 = this;
            int r0 = r3.f13797g
            switch(r0) {
                case 0: goto L11;
                default: goto L5;
            }
        L5:
            uf.g r0 = r3.f13798h
            r0.getClass()
            uf.e r1 = new uf.e
            r2 = 1
            r1.<init>(r0, r2)
            return r1
        L11:
            uf.g r0 = r3.f13798h
            r0.getClass()
            uf.e r1 = new uf.e
            r2 = 0
            r1.<init>(r0, r2)
            return r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(java.lang.Object r5) {
            r4 = this;
            int r0 = r4.f13797g
            switch(r0) {
                case 0: goto L17;
                default: goto L5;
            }
        L5:
            uf.g r0 = r4.f13798h
            r0.d()
            int r5 = r0.h(r5)
            if (r5 >= 0) goto L12
            r5 = 0
            goto L16
        L12:
            r0.l(r5)
            r5 = 1
        L16:
            return r5
        L17:
            boolean r0 = r5 instanceof java.util.Map.Entry
            r1 = 0
            if (r0 != 0) goto L1d
            goto L48
        L1d:
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            uf.g r0 = r4.f13798h
            r0.getClass()
            r0.d()
            java.lang.Object r2 = r5.getKey()
            int r2 = r0.h(r2)
            if (r2 >= 0) goto L32
            goto L48
        L32:
            java.lang.Object[] r3 = r0.f13785h
            r3.getClass()
            r3 = r3[r2]
            java.lang.Object r5 = r5.getValue()
            boolean r5 = gg.l.a(r3, r5)
            if (r5 != 0) goto L44
            goto L48
        L44:
            r0.l(r2)
            r1 = 1
        L48:
            return r1
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(java.util.Collection r2) {
            r1 = this;
            int r0 = r1.f13797g
            r2.getClass()
            switch(r0) {
                case 0: goto L12;
                default: goto L8;
            }
        L8:
            uf.g r0 = r1.f13798h
            r0.d()
            boolean r2 = super.removeAll(r2)
            return r2
        L12:
            uf.g r0 = r1.f13798h
            r0.d()
            boolean r2 = super.removeAll(r2)
            return r2
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(java.util.Collection r2) {
            r1 = this;
            int r0 = r1.f13797g
            r2.getClass()
            switch(r0) {
                case 0: goto L12;
                default: goto L8;
            }
        L8:
            uf.g r0 = r1.f13798h
            r0.d()
            boolean r2 = super.retainAll(r2)
            return r2
        L12:
            uf.g r0 = r1.f13798h
            r0.d()
            boolean r2 = super.retainAll(r2)
            return r2
    }
}
