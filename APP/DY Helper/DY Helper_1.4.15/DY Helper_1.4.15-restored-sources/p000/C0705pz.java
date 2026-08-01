package p000;

/* JADX INFO: renamed from: pz */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0705pz implements java.util.Set, p000.lo0 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f8760;

    /* JADX INFO: renamed from: ζ */
    public final p000.b21 f8761;

    public C0705pz(p000.b21 r1, int r2) {
            r0 = this;
            r0.f8760 = r2
            r1.getClass()
            switch(r2) {
                case 1: goto Le;
                default: goto L8;
            }
        L8:
            r0.<init>()
            r0.f8761 = r1
            return
        Le:
            r0.<init>()
            r0.f8761 = r1
            return
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(java.lang.Object r1) {
            r0 = this;
            int r0 = r0.f8760
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
    public final boolean addAll(java.util.Collection r1) {
            r0 = this;
            int r0 = r0.f8760
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
    public final void clear() {
            r1 = this;
            int r1 = r1.f8760
            switch(r1) {
                case 0: goto Ld;
                default: goto L5;
            }
        L5:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r1.<init>(r0)
            throw r1
        Ld:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r1.<init>(r0)
            throw r1
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(java.lang.Object r2) {
            r1 = this;
            int r0 = r1.f8760
            switch(r0) {
                case 0: goto Lc;
                default: goto L5;
            }
        L5:
            b21 r1 = r1.f8761
            boolean r1 = r1.m691(r2)
            return r1
        Lc:
            boolean r0 = r2 instanceof java.util.Map.Entry
            if (r0 != 0) goto L12
            r1 = 0
            goto L26
        L12:
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            b21 r1 = r1.f8761
            java.lang.Object r0 = r2.getKey()
            java.lang.Object r1 = r1.m695(r0)
            java.lang.Object r2 = r2.getValue()
            boolean r1 = p000.ln0.m3626(r1, r2)
        L26:
            return r1
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(java.util.Collection r5) {
            r4 = this;
            int r0 = r4.f8760
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
            b21 r2 = r4.f8761
            boolean r0 = r2.m691(r0)
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
            b21 r2 = r4.f8761
            java.lang.Object r3 = r0.getKey()
            java.lang.Object r2 = r2.m695(r3)
            java.lang.Object r0 = r0.getValue()
            boolean r0 = p000.ln0.m3626(r2, r0)
            if (r0 != 0) goto L3e
            r1 = 0
        L5f:
            return r1
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
            r1 = this;
            int r0 = r1.f8760
            switch(r0) {
                case 0: goto Lc;
                default: goto L5;
            }
        L5:
            b21 r1 = r1.f8761
            boolean r1 = r1.m697()
            return r1
        Lc:
            b21 r1 = r1.f8761
            boolean r1 = r1.m697()
            return r1
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator iterator() {
            r3 = this;
            int r0 = r3.f8760
            switch(r0) {
                case 0: goto L11;
                default: goto L5;
            }
        L5:
            oz r0 = new oz
            r1 = 0
            r2 = 1
            r0.<init>(r3, r1, r2)
            ts1 r3 = p000.e81.m1879(r0)
            return r3
        L11:
            oz r0 = new oz
            r1 = 0
            r2 = 0
            r0.<init>(r3, r1, r2)
            ts1 r3 = p000.e81.m1879(r0)
            return r3
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(java.lang.Object r1) {
            r0 = this;
            int r0 = r0.f8760
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
    public final boolean removeAll(java.util.Collection r1) {
            r0 = this;
            int r0 = r0.f8760
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
    public final boolean retainAll(java.util.Collection r1) {
            r0 = this;
            int r0 = r0.f8760
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
    public final int size() {
            r1 = this;
            int r0 = r1.f8760
            switch(r0) {
                case 0: goto La;
                default: goto L5;
            }
        L5:
            b21 r1 = r1.f8761
            int r1 = r1.f1431
            return r1
        La:
            b21 r1 = r1.f8761
            int r1 = r1.f1431
            return r1
    }

    @Override // java.util.Set, java.util.Collection
    public final java.lang.Object[] toArray() {
            r1 = this;
            int r0 = r1.f8760
            switch(r0) {
                case 0: goto La;
                default: goto L5;
            }
        L5:
            java.lang.Object[] r1 = p000.AbstractC0782s1.m5320(r1)
            return r1
        La:
            java.lang.Object[] r1 = p000.AbstractC0782s1.m5320(r1)
            return r1
    }

    @Override // java.util.Set, java.util.Collection
    public final java.lang.Object[] toArray(java.lang.Object[] r2) {
            r1 = this;
            int r0 = r1.f8760
            switch(r0) {
                case 0: goto Ld;
                default: goto L5;
            }
        L5:
            r2.getClass()
            java.lang.Object[] r1 = p000.AbstractC0782s1.m5321(r1, r2)
            return r1
        Ld:
            r2.getClass()
            java.lang.Object[] r1 = p000.AbstractC0782s1.m5321(r1, r2)
            return r1
    }
}
