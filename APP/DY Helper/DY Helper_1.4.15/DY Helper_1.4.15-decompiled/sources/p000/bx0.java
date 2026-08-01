package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class bx0 extends java.util.AbstractCollection implements java.util.Collection, p000.mo0 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f1881;

    /* JADX INFO: renamed from: ζ */
    public final java.lang.Object f1882;

    public /* synthetic */ bx0(int r1, java.lang.Object r2) {
            r0 = this;
            r0.f1881 = r1
            r0.<init>()
            r0.f1882 = r2
            return
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(java.lang.Object r1) {
            r0 = this;
            int r0 = r0.f1881
            switch(r0) {
                case 0: goto Lb;
                default: goto L5;
            }
        L5:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
        Lb:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean addAll(java.util.Collection r2) {
            r1 = this;
            int r0 = r1.f1881
            switch(r0) {
                case 0: goto La;
                default: goto L5;
            }
        L5:
            boolean r1 = super.addAll(r2)
            return r1
        La:
            r2.getClass()
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
            r1 = this;
            int r0 = r1.f1881
            switch(r0) {
                case 0: goto Ld;
                default: goto L5;
            }
        L5:
            java.lang.Object r1 = r1.f1882
            fa1 r1 = (p000.fa1) r1
            r1.clear()
            return
        Ld:
            java.lang.Object r1 = r1.f1882
            zw0 r1 = (p000.zw0) r1
            r1.clear()
            return
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(java.lang.Object r2) {
            r1 = this;
            int r0 = r1.f1881
            switch(r0) {
                case 0: goto Le;
                default: goto L5;
            }
        L5:
            java.lang.Object r1 = r1.f1882
            fa1 r1 = (p000.fa1) r1
            boolean r1 = r1.containsValue(r2)
            return r1
        Le:
            java.lang.Object r1 = r1.f1882
            zw0 r1 = (p000.zw0) r1
            boolean r1 = r1.containsValue(r2)
            return r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
            r1 = this;
            int r0 = r1.f1881
            switch(r0) {
                case 0: goto La;
                default: goto L5;
            }
        L5:
            boolean r1 = super.isEmpty()
            return r1
        La:
            java.lang.Object r1 = r1.f1882
            zw0 r1 = (p000.zw0) r1
            boolean r1 = r1.isEmpty()
            return r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator iterator() {
            r6 = this;
            int r0 = r6.f1881
            switch(r0) {
                case 0: goto L21;
                default: goto L5;
            }
        L5:
            la1 r0 = new la1
            java.lang.Object r6 = r6.f1882
            fa1 r6 = (p000.fa1) r6
            r1 = 8
            a62[] r2 = new p000.a62[r1]
            r3 = 0
        L10:
            if (r3 >= r1) goto L1d
            b62 r4 = new b62
            r5 = 2
            r4.<init>(r5)
            r2[r3] = r4
            int r3 = r3 + 1
            goto L10
        L1d:
            r0.<init>(r6, r2)
            return r0
        L21:
            java.lang.Object r6 = r6.f1882
            zw0 r6 = (p000.zw0) r6
            r6.getClass()
            ww0 r0 = new ww0
            r1 = 2
            r0.<init>(r6, r1)
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(java.lang.Object r2) {
            r1 = this;
            int r0 = r1.f1881
            switch(r0) {
                case 0: goto La;
                default: goto L5;
            }
        L5:
            boolean r1 = super.remove(r2)
            return r1
        La:
            java.lang.Object r1 = r1.f1882
            zw0 r1 = (p000.zw0) r1
            r1.m7242()
            int r2 = r1.m7247(r2)
            if (r2 >= 0) goto L19
            r1 = 0
            goto L1d
        L19:
            r1.m7250(r2)
            r1 = 1
        L1d:
            return r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(java.util.Collection r2) {
            r1 = this;
            int r0 = r1.f1881
            switch(r0) {
                case 0: goto La;
                default: goto L5;
            }
        L5:
            boolean r1 = super.removeAll(r2)
            return r1
        La:
            r2.getClass()
            java.lang.Object r0 = r1.f1882
            zw0 r0 = (p000.zw0) r0
            r0.m7242()
            boolean r1 = super.removeAll(r2)
            return r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(java.util.Collection r2) {
            r1 = this;
            int r0 = r1.f1881
            switch(r0) {
                case 0: goto La;
                default: goto L5;
            }
        L5:
            boolean r1 = super.retainAll(r2)
            return r1
        La:
            r2.getClass()
            java.lang.Object r0 = r1.f1882
            zw0 r0 = (p000.zw0) r0
            r0.m7242()
            boolean r1 = super.retainAll(r2)
            return r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
            r1 = this;
            int r0 = r1.f1881
            switch(r0) {
                case 0: goto Lc;
                default: goto L5;
            }
        L5:
            java.lang.Object r1 = r1.f1882
            fa1 r1 = (p000.fa1) r1
            int r1 = r1.f3843
            goto L12
        Lc:
            java.lang.Object r1 = r1.f1882
            zw0 r1 = (p000.zw0) r1
            int r1 = r1.f13336
        L12:
            return r1
    }
}
