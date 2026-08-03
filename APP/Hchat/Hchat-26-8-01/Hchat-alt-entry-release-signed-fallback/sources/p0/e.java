package p0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends tf.h {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f10059g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final s0.g f10060h;

    public /* synthetic */ e(int r1, s0.g r2) {
            r0 = this;
            r0.f10059g = r1
            r0.<init>()
            r0.f10060h = r2
            return
    }

    @Override // tf.h
    public final int a() {
            r1 = this;
            int r0 = r1.f10059g
            switch(r0) {
                case 0: goto La;
                default: goto L5;
            }
        L5:
            s0.g r0 = r1.f10060h
            int r0 = r0.f12193k
            return r0
        La:
            s0.g r0 = r1.f10060h
            int r0 = r0.f12193k
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(java.lang.Object r2) {
            r1 = this;
            int r0 = r1.f10059g
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
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            r2.<init>()
            throw r2
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
            r1 = this;
            int r0 = r1.f10059g
            switch(r0) {
                case 0: goto Lb;
                default: goto L5;
            }
        L5:
            s0.g r0 = r1.f10060h
            r0.clear()
            return
        Lb:
            s0.g r0 = r1.f10060h
            r0.clear()
            return
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(java.lang.Object r4) {
            r3 = this;
            int r0 = r3.f10059g
            switch(r0) {
                case 0: goto Lc;
                default: goto L5;
            }
        L5:
            s0.g r0 = r3.f10060h
            boolean r4 = r0.containsKey(r4)
            return r4
        Lc:
            boolean r0 = r4 instanceof java.util.Map.Entry
            r1 = 0
            if (r0 != 0) goto L12
            goto L3a
        L12:
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r0 = r4.getKey()
            s0.g r2 = r3.f10060h
            java.lang.Object r0 = r2.get(r0)
            if (r0 == 0) goto L29
            java.lang.Object r4 = r4.getValue()
            boolean r1 = r0.equals(r4)
            goto L3a
        L29:
            java.lang.Object r0 = r4.getValue()
            if (r0 != 0) goto L3a
            java.lang.Object r4 = r4.getKey()
            boolean r4 = r2.containsKey(r4)
            if (r4 == 0) goto L3a
            r1 = 1
        L3a:
            return r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final java.util.Iterator iterator() {
            r6 = this;
            int r0 = r6.f10059g
            switch(r0) {
                case 0: goto L1f;
                default: goto L5;
            }
        L5:
            p0.f r0 = new p0.f
            r1 = 8
            p0.k[] r2 = new p0.k[r1]
            r3 = 0
        Lc:
            if (r3 >= r1) goto L19
            p0.l r4 = new p0.l
            r5 = 1
            r4.<init>(r5)
            r2[r3] = r4
            int r3 = r3 + 1
            goto Lc
        L19:
            s0.g r1 = r6.f10060h
            r0.<init>(r1, r2)
            return r0
        L1f:
            m1.f0 r0 = new m1.f0
            s0.g r1 = r6.f10060h
            r0.<init>(r1)
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(java.lang.Object r3) {
            r2 = this;
            int r0 = r2.f10059g
            switch(r0) {
                case 0: goto L14;
                default: goto L5;
            }
        L5:
            s0.g r0 = r2.f10060h
            boolean r1 = r0.containsKey(r3)
            if (r1 == 0) goto L12
            r0.remove(r3)
            r3 = 1
            goto L13
        L12:
            r3 = 0
        L13:
            return r3
        L14:
            boolean r0 = r3 instanceof java.util.Map.Entry
            if (r0 != 0) goto L1a
            r3 = 0
            goto L2a
        L1a:
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r0 = r3.getKey()
            java.lang.Object r3 = r3.getValue()
            s0.g r1 = r2.f10060h
            boolean r3 = r1.remove(r0, r3)
        L2a:
            return r3
    }
}
