package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class ja1 extends p000.AbstractC1077 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f5387;

    /* JADX INFO: renamed from: ζ */
    public final p000.fa1 f5388;

    public /* synthetic */ ja1(int r1, p000.fa1 r2) {
            r0 = this;
            r0.f5387 = r1
            r0.<init>()
            r0.f5388 = r2
            return
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(java.lang.Object r1) {
            r0 = this;
            int r0 = r0.f5387
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
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
            r1 = this;
            int r0 = r1.f5387
            switch(r0) {
                case 0: goto Lb;
                default: goto L5;
            }
        L5:
            fa1 r1 = r1.f5388
            r1.clear()
            return
        Lb:
            fa1 r1 = r1.f5388
            r1.clear()
            return
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(java.lang.Object r3) {
            r2 = this;
            int r0 = r2.f5387
            switch(r0) {
                case 0: goto Lc;
                default: goto L5;
            }
        L5:
            fa1 r2 = r2.f5388
            boolean r2 = r2.containsKey(r3)
            return r2
        Lc:
            boolean r0 = r3 instanceof java.util.Map.Entry
            r1 = 0
            if (r0 != 0) goto L12
            goto L3a
        L12:
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r0 = r3.getKey()
            fa1 r2 = r2.f5388
            java.lang.Object r0 = r2.get(r0)
            if (r0 == 0) goto L29
            java.lang.Object r2 = r3.getValue()
            boolean r1 = r0.equals(r2)
            goto L3a
        L29:
            java.lang.Object r0 = r3.getValue()
            if (r0 != 0) goto L3a
            java.lang.Object r3 = r3.getKey()
            boolean r2 = r2.containsKey(r3)
            if (r2 == 0) goto L3a
            r1 = 1
        L3a:
            return r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final java.util.Iterator iterator() {
            r6 = this;
            int r0 = r6.f5387
            switch(r0) {
                case 0: goto L1f;
                default: goto L5;
            }
        L5:
            la1 r0 = new la1
            r1 = 8
            a62[] r2 = new p000.a62[r1]
            r3 = 0
        Lc:
            if (r3 >= r1) goto L19
            b62 r4 = new b62
            r5 = 1
            r4.<init>(r5)
            r2[r3] = r4
            int r3 = r3 + 1
            goto Lc
        L19:
            fa1 r6 = r6.f5388
            r0.<init>(r6, r2)
            return r0
        L1f:
            ka1 r0 = new ka1
            fa1 r6 = r6.f5388
            r0.<init>(r6)
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(java.lang.Object r2) {
            r1 = this;
            int r0 = r1.f5387
            switch(r0) {
                case 0: goto L14;
                default: goto L5;
            }
        L5:
            fa1 r1 = r1.f5388
            boolean r0 = r1.containsKey(r2)
            if (r0 == 0) goto L12
            r1.remove(r2)
            r1 = 1
            goto L13
        L12:
            r1 = 0
        L13:
            return r1
        L14:
            boolean r0 = r2 instanceof java.util.Map.Entry
            if (r0 != 0) goto L1a
            r1 = 0
            goto L2a
        L1a:
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r0 = r2.getKey()
            java.lang.Object r2 = r2.getValue()
            fa1 r1 = r1.f5388
            boolean r1 = r1.remove(r0, r2)
        L2a:
            return r1
    }

    @Override // p000.AbstractC1077
    /* JADX INFO: renamed from: α */
    public final int mo618() {
            r1 = this;
            int r0 = r1.f5387
            switch(r0) {
                case 0: goto La;
                default: goto L5;
            }
        L5:
            fa1 r1 = r1.f5388
            int r1 = r1.f3843
            return r1
        La:
            fa1 r1 = r1.f5388
            int r1 = r1.f3843
            return r1
    }
}
