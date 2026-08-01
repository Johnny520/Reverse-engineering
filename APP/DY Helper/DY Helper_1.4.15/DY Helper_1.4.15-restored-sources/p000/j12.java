package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class j12 implements java.util.Collection, p000.lo0 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f5294;

    /* JADX INFO: renamed from: ζ */
    public final java.lang.Object f5295;

    public j12() {
            r2 = this;
            r0 = 0
            r2.f5294 = r0
            int r0 = p000.k81.f5808
            w11 r0 = new w11
            r1 = 6
            r0.<init>(r1)
            r2.<init>()
            r2.f5295 = r0
            return
    }

    public j12(p000.b21 r2) {
            r1 = this;
            r0 = 1
            r1.f5294 = r0
            r2.getClass()
            r1.<init>()
            r1.f5295 = r2
            return
    }

    @Override // java.util.Collection
    public final boolean add(java.lang.Object r2) {
            r1 = this;
            int r0 = r1.f5294
            switch(r0) {
                case 0: goto Ld;
                default: goto L5;
            }
        L5:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Operation is not supported for read-only collection"
            r1.<init>(r2)
            throw r1
        Ld:
            java.lang.Object r1 = r1.f5295
            w11 r1 = (p000.w11) r1
            boolean r1 = r1.m6299(r2)
            return r1
    }

    @Override // java.util.Collection
    public final boolean addAll(java.util.Collection r1) {
            r0 = this;
            int r0 = r0.f5294
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

    @Override // java.util.Collection
    public final void clear() {
            r1 = this;
            int r0 = r1.f5294
            switch(r0) {
                case 0: goto Ld;
                default: goto L5;
            }
        L5:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r1.<init>(r0)
            throw r1
        Ld:
            java.lang.Object r1 = r1.f5295
            w11 r1 = (p000.w11) r1
            r1.m6300()
            return
    }

    @Override // java.util.Collection
    public final boolean contains(java.lang.Object r2) {
            r1 = this;
            int r0 = r1.f5294
            switch(r0) {
                case 0: goto Le;
                default: goto L5;
            }
        L5:
            java.lang.Object r1 = r1.f5295
            b21 r1 = (p000.b21) r1
            boolean r1 = r1.m692(r2)
            return r1
        Le:
            java.lang.Object r1 = r1.f5295
            w11 r1 = (p000.w11) r1
            boolean r1 = r1.m6301(r2)
            return r1
    }

    @Override // java.util.Collection
    public final boolean containsAll(java.util.Collection r4) {
            r3 = this;
            int r0 = r3.f5294
            switch(r0) {
                case 0: goto L2f;
                default: goto L5;
            }
        L5:
            r4.getClass()
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            r0 = r4
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            r1 = 1
            if (r0 == 0) goto L15
            goto L2e
        L15:
            java.util.Iterator r4 = r4.iterator()
        L19:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L2e
            java.lang.Object r0 = r4.next()
            java.lang.Object r2 = r3.f5295
            b21 r2 = (p000.b21) r2
            boolean r0 = r2.m692(r0)
            if (r0 != 0) goto L19
            r1 = 0
        L2e:
            return r1
        L2f:
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.Iterator r4 = r4.iterator()
        L35:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L4b
            java.lang.Object r0 = r4.next()
            java.lang.Object r1 = r3.f5295
            w11 r1 = (p000.w11) r1
            boolean r0 = r1.m6301(r0)
            if (r0 != 0) goto L35
            r3 = 0
            goto L4c
        L4b:
            r3 = 1
        L4c:
            return r3
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
            r1 = this;
            int r0 = r1.f5294
            switch(r0) {
                case 0: goto Le;
                default: goto L5;
            }
        L5:
            java.lang.Object r1 = r1.f5295
            b21 r1 = (p000.b21) r1
            boolean r1 = r1.m697()
            return r1
        Le:
            java.lang.Object r1 = r1.f5295
            w11 r1 = (p000.w11) r1
            int r1 = r1.f11525
            if (r1 != 0) goto L18
            r1 = 1
            goto L19
        L18:
            r1 = 0
        L19:
            return r1
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final java.util.Iterator iterator() {
            r3 = this;
            int r0 = r3.f5294
            switch(r0) {
                case 0: goto L11;
                default: goto L5;
            }
        L5:
            oz r0 = new oz
            r1 = 0
            r2 = 3
            r0.<init>(r3, r1, r2)
            ts1 r3 = p000.e81.m1879(r0)
            return r3
        L11:
            java.lang.Object r3 = r3.f5295
            w11 r3 = (p000.w11) r3
            r3.getClass()
            y11 r0 = new y11
            r0.<init>(r3)
            f90 r3 = new f90
            r3.<init>(r0)
            return r3
    }

    @Override // java.util.Collection
    public final boolean remove(java.lang.Object r2) {
            r1 = this;
            int r0 = r1.f5294
            switch(r0) {
                case 0: goto Ld;
                default: goto L5;
            }
        L5:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Operation is not supported for read-only collection"
            r1.<init>(r2)
            throw r1
        Ld:
            java.lang.Object r1 = r1.f5295
            w11 r1 = (p000.w11) r1
            boolean r1 = r1.m6305(r2)
            return r1
    }

    @Override // java.util.Collection
    public final boolean removeAll(java.util.Collection r2) {
            r1 = this;
            int r0 = r1.f5294
            switch(r0) {
                case 0: goto Ld;
                default: goto L5;
            }
        L5:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Operation is not supported for read-only collection"
            r1.<init>(r2)
            throw r1
        Ld:
            java.lang.Object r1 = r1.f5295
            w11 r1 = (p000.w11) r1
            boolean r1 = r1.m6305(r2)
            return r1
    }

    @Override // java.util.Collection
    public final boolean removeIf(java.util.function.Predicate r1) {
            r0 = this;
            int r0 = r0.f5294
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

    @Override // java.util.Collection
    public final boolean retainAll(java.util.Collection r2) {
            r1 = this;
            int r0 = r1.f5294
            switch(r0) {
                case 0: goto Ld;
                default: goto L5;
            }
        L5:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Operation is not supported for read-only collection"
            r1.<init>(r2)
            throw r1
        Ld:
            java.lang.Object r1 = r1.f5295
            w11 r1 = (p000.w11) r1
            boolean r1 = r1.m6307(r2)
            return r1
    }

    @Override // java.util.Collection
    public final int size() {
            r1 = this;
            int r0 = r1.f5294
            switch(r0) {
                case 0: goto Lc;
                default: goto L5;
            }
        L5:
            java.lang.Object r1 = r1.f5295
            b21 r1 = (p000.b21) r1
            int r1 = r1.f1431
            return r1
        Lc:
            java.lang.Object r1 = r1.f5295
            w11 r1 = (p000.w11) r1
            int r1 = r1.f11525
            return r1
    }

    @Override // java.util.Collection
    public final java.lang.Object[] toArray() {
            r1 = this;
            int r0 = r1.f5294
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

    @Override // java.util.Collection
    public final java.lang.Object[] toArray(java.lang.Object[] r2) {
            r1 = this;
            int r0 = r1.f5294
            switch(r0) {
                case 0: goto Ld;
                default: goto L5;
            }
        L5:
            r2.getClass()
            java.lang.Object[] r1 = p000.AbstractC0782s1.m5321(r1, r2)
            return r1
        Ld:
            java.lang.Object[] r1 = p000.AbstractC0782s1.m5321(r1, r2)
            return r1
    }
}
