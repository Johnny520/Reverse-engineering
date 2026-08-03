package j6;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends java.util.AbstractSet {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f6740g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f6741h;

    public /* synthetic */ l(java.util.Map r1, int r2) {
            r0 = this;
            r0.f6740g = r2
            r0.f6741h = r1
            r0.<init>()
            return
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
            r1 = this;
            int r0 = r1.f6740g
            switch(r0) {
                case 0: goto L11;
                case 1: goto L9;
                default: goto L5;
            }
        L5:
            super.clear()
            return
        L9:
            java.util.Map r0 = r1.f6741h
            j6.n r0 = (j6.n) r0
            r0.clear()
            return
        L11:
            java.util.Map r0 = r1.f6741h
            j6.n r0 = (j6.n) r0
            r0.clear()
            return
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(java.lang.Object r5) {
            r4 = this;
            int r0 = r4.f6740g
            switch(r0) {
                case 0: goto L13;
                case 1: goto La;
                default: goto L5;
            }
        L5:
            boolean r5 = super.contains(r5)
            return r5
        La:
            java.util.Map r0 = r4.f6741h
            j6.n r0 = (j6.n) r0
            boolean r5 = r0.containsKey(r5)
            return r5
        L13:
            boolean r0 = r5 instanceof java.util.Map.Entry
            r1 = 0
            if (r0 == 0) goto L3d
            java.util.Map r0 = r4.f6741h
            j6.n r0 = (j6.n) r0
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r2 = r5.getKey()
            r3 = 0
            if (r2 == 0) goto L2a
            j6.m r0 = r0.a(r2, r1)     // Catch: java.lang.ClassCastException -> L2a
            goto L2b
        L2a:
            r0 = r3
        L2b:
            if (r0 == 0) goto L3a
            java.lang.Object r2 = r0.f6749n
            java.lang.Object r5 = r5.getValue()
            boolean r5 = java.util.Objects.equals(r2, r5)
            if (r5 == 0) goto L3a
            r3 = r0
        L3a:
            if (r3 == 0) goto L3d
            r1 = 1
        L3d:
            return r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final java.util.Iterator iterator() {
            r3 = this;
            int r0 = r3.f6740g
            switch(r0) {
                case 0: goto L1a;
                case 1: goto Lf;
                default: goto L5;
            }
        L5:
            f.c r0 = new f.c
            java.util.Map r1 = r3.f6741h
            f.e r1 = (f.e) r1
            r0.<init>(r1)
            return r0
        Lf:
            j6.k r0 = new j6.k
            java.util.Map r1 = r3.f6741h
            j6.n r1 = (j6.n) r1
            r2 = 1
            r0.<init>(r1, r2)
            return r0
        L1a:
            j6.k r0 = new j6.k
            java.util.Map r1 = r3.f6741h
            j6.n r1 = (j6.n) r1
            r2 = 0
            r0.<init>(r1, r2)
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(java.lang.Object r6) {
            r5 = this;
            int r0 = r5.f6740g
            switch(r0) {
                case 0: goto L20;
                case 1: goto La;
                default: goto L5;
            }
        L5:
            boolean r6 = super.remove(r6)
            return r6
        La:
            java.util.Map r0 = r5.f6741h
            j6.n r0 = (j6.n) r0
            r1 = 0
            r2 = 0
            if (r6 == 0) goto L16
            j6.m r2 = r0.a(r6, r1)     // Catch: java.lang.ClassCastException -> L16
        L16:
            r6 = 1
            if (r2 == 0) goto L1c
            r0.d(r2, r6)
        L1c:
            if (r2 == 0) goto L1f
            r1 = r6
        L1f:
            return r1
        L20:
            java.util.Map r0 = r5.f6741h
            j6.n r0 = (j6.n) r0
            boolean r1 = r6 instanceof java.util.Map.Entry
            r2 = 0
            if (r1 != 0) goto L2a
            goto L4f
        L2a:
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            java.lang.Object r1 = r6.getKey()
            r3 = 0
            if (r1 == 0) goto L38
            j6.m r1 = r0.a(r1, r2)     // Catch: java.lang.ClassCastException -> L38
            goto L39
        L38:
            r1 = r3
        L39:
            if (r1 == 0) goto L48
            java.lang.Object r4 = r1.f6749n
            java.lang.Object r6 = r6.getValue()
            boolean r6 = java.util.Objects.equals(r4, r6)
            if (r6 == 0) goto L48
            r3 = r1
        L48:
            if (r3 != 0) goto L4b
            goto L4f
        L4b:
            r2 = 1
            r0.d(r3, r2)
        L4f:
            return r2
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
            r1 = this;
            int r0 = r1.f6740g
            switch(r0) {
                case 0: goto L13;
                case 1: goto Lc;
                default: goto L5;
            }
        L5:
            java.util.Map r0 = r1.f6741h
            f.e r0 = (f.e) r0
            int r0 = r0.f2792i
            return r0
        Lc:
            java.util.Map r0 = r1.f6741h
            j6.n r0 = (j6.n) r0
            int r0 = r0.f6755j
            return r0
        L13:
            java.util.Map r0 = r1.f6741h
            j6.n r0 = (j6.n) r0
            int r0 = r0.f6755j
            return r0
    }
}
