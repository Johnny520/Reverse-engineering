package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class ax0 extends p000.AbstractC1077 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f1358;

    /* JADX INFO: renamed from: ζ */
    public final p000.zw0 f1359;

    public /* synthetic */ ax0(p000.zw0 r1, int r2) {
            r0 = this;
            r0.f1358 = r2
            r0.<init>()
            r0.f1359 = r1
            return
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(java.lang.Object r1) {
            r0 = this;
            int r0 = r0.f1358
            switch(r0) {
                case 0: goto Lb;
                default: goto L5;
            }
        L5:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
        Lb:
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            r1.getClass()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(java.util.Collection r1) {
            r0 = this;
            int r0 = r0.f1358
            r1.getClass()
            switch(r0) {
                case 0: goto Le;
                default: goto L8;
            }
        L8:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
        Le:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
            r1 = this;
            int r0 = r1.f1358
            switch(r0) {
                case 0: goto Lb;
                default: goto L5;
            }
        L5:
            zw0 r1 = r1.f1359
            r1.clear()
            return
        Lb:
            zw0 r1 = r1.f1359
            r1.clear()
            return
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(java.lang.Object r3) {
            r2 = this;
            int r0 = r2.f1358
            switch(r0) {
                case 0: goto Lc;
                default: goto L5;
            }
        L5:
            zw0 r2 = r2.f1359
            boolean r2 = r2.containsKey(r3)
            return r2
        Lc:
            boolean r0 = r3 instanceof java.util.Map.Entry
            r1 = 0
            if (r0 != 0) goto L12
            goto L33
        L12:
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            zw0 r2 = r2.f1359
            r2.getClass()
            java.lang.Object r0 = r3.getKey()
            int r0 = r2.m7246(r0)
            if (r0 >= 0) goto L24
            goto L33
        L24:
            java.lang.Object[] r2 = r2.f13329
            r2.getClass()
            r2 = r2[r0]
            java.lang.Object r3 = r3.getValue()
            boolean r1 = p000.ln0.m3626(r2, r3)
        L33:
            return r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(java.util.Collection r2) {
            r1 = this;
            int r0 = r1.f1358
            switch(r0) {
                case 0: goto La;
                default: goto L5;
            }
        L5:
            boolean r1 = super.containsAll(r2)
            return r1
        La:
            r2.getClass()
            zw0 r1 = r1.f1359
            boolean r1 = r1.m7244(r2)
            return r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
            r1 = this;
            int r0 = r1.f1358
            switch(r0) {
                case 0: goto Lc;
                default: goto L5;
            }
        L5:
            zw0 r1 = r1.f1359
            boolean r1 = r1.isEmpty()
            return r1
        Lc:
            zw0 r1 = r1.f1359
            boolean r1 = r1.isEmpty()
            return r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final java.util.Iterator iterator() {
            r2 = this;
            int r0 = r2.f1358
            switch(r0) {
                case 0: goto L11;
                default: goto L5;
            }
        L5:
            zw0 r2 = r2.f1359
            r2.getClass()
            ww0 r0 = new ww0
            r1 = 1
            r0.<init>(r2, r1)
            return r0
        L11:
            zw0 r2 = r2.f1359
            r2.getClass()
            ww0 r0 = new ww0
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(java.lang.Object r4) {
            r3 = this;
            int r0 = r3.f1358
            switch(r0) {
                case 0: goto L17;
                default: goto L5;
            }
        L5:
            zw0 r3 = r3.f1359
            r3.m7242()
            int r4 = r3.m7246(r4)
            if (r4 >= 0) goto L12
            r3 = 0
            goto L16
        L12:
            r3.m7250(r4)
            r3 = 1
        L16:
            return r3
        L17:
            boolean r0 = r4 instanceof java.util.Map.Entry
            r1 = 0
            if (r0 != 0) goto L1d
            goto L48
        L1d:
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            zw0 r3 = r3.f1359
            r3.getClass()
            r3.m7242()
            java.lang.Object r0 = r4.getKey()
            int r0 = r3.m7246(r0)
            if (r0 >= 0) goto L32
            goto L48
        L32:
            java.lang.Object[] r2 = r3.f13329
            r2.getClass()
            r2 = r2[r0]
            java.lang.Object r4 = r4.getValue()
            boolean r4 = p000.ln0.m3626(r2, r4)
            if (r4 != 0) goto L44
            goto L48
        L44:
            r3.m7250(r0)
            r1 = 1
        L48:
            return r1
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(java.util.Collection r2) {
            r1 = this;
            int r0 = r1.f1358
            r2.getClass()
            switch(r0) {
                case 0: goto L12;
                default: goto L8;
            }
        L8:
            zw0 r0 = r1.f1359
            r0.m7242()
            boolean r1 = super.removeAll(r2)
            return r1
        L12:
            zw0 r0 = r1.f1359
            r0.m7242()
            boolean r1 = super.removeAll(r2)
            return r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(java.util.Collection r2) {
            r1 = this;
            int r0 = r1.f1358
            r2.getClass()
            switch(r0) {
                case 0: goto L12;
                default: goto L8;
            }
        L8:
            zw0 r0 = r1.f1359
            r0.m7242()
            boolean r1 = super.retainAll(r2)
            return r1
        L12:
            zw0 r0 = r1.f1359
            r0.m7242()
            boolean r1 = super.retainAll(r2)
            return r1
    }

    @Override // p000.AbstractC1077
    /* JADX INFO: renamed from: α */
    public final int mo618() {
            r1 = this;
            int r0 = r1.f1358
            switch(r0) {
                case 0: goto La;
                default: goto L5;
            }
        L5:
            zw0 r1 = r1.f1359
            int r1 = r1.f13336
            return r1
        La:
            zw0 r1 = r1.f1359
            int r1 = r1.f13336
            return r1
    }
}
