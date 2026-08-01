package defpackage;

/* JADX INFO: renamed from: ᛶᛴᛴᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1057 extends defpackage.AbstractC1986 {

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final defpackage.C0665 f4660;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final /* synthetic */ int f4661;

    public /* synthetic */ C1057(defpackage.C0665 r1, int r2) {
            r0 = this;
            r0.f4661 = r2
            r0.<init>()
            r0.f4660 = r1
            return
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(java.lang.Object r1) {
            r0 = this;
            int r0 = r0.f4661
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
    public final boolean addAll(java.util.Collection r1) {
            r0 = this;
            int r0 = r0.f4661
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

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
            r1 = this;
            int r0 = r1.f4661
            ᛴᛴᲁᲇ r1 = r1.f4660
            switch(r0) {
                case 0: goto Lb;
                default: goto L7;
            }
        L7:
            r1.clear()
            return
        Lb:
            r1.clear()
            return
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(java.lang.Object r3) {
            r2 = this;
            int r0 = r2.f4661
            ᛴᛴᲁᲇ r2 = r2.f4660
            switch(r0) {
                case 0: goto Lc;
                default: goto L7;
            }
        L7:
            boolean r2 = r2.containsKey(r3)
            return r2
        Lc:
            boolean r0 = r3 instanceof java.util.Map.Entry
            r1 = 0
            if (r0 != 0) goto L12
            goto L2b
        L12:
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r0 = r3.getKey()
            int r0 = r2.m1496(r0)
            if (r0 >= 0) goto L1f
            goto L2b
        L1f:
            java.lang.Object[] r2 = r2.f3228
            r2 = r2[r0]
            java.lang.Object r3 = r3.getValue()
            boolean r1 = defpackage.AbstractC0498.m1280(r2, r3)
        L2b:
            return r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(java.util.Collection r5) {
            r4 = this;
            int r0 = r4.f4661
            switch(r0) {
                case 0: goto La;
                default: goto L5;
            }
        L5:
            boolean r4 = super.containsAll(r5)
            return r4
        La:
            ᛴᛴᲁᲇ r4 = r4.f4660
            java.util.Iterator r5 = r5.iterator()
        L10:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L3a
            java.lang.Object r0 = r5.next()
            r1 = 0
            if (r0 == 0) goto L3b
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.ClassCastException -> L3b
            java.lang.Object r2 = r0.getKey()     // Catch: java.lang.ClassCastException -> L3b
            int r2 = r4.m1496(r2)     // Catch: java.lang.ClassCastException -> L3b
            if (r2 >= 0) goto L2b
            r0 = r1
            goto L37
        L2b:
            java.lang.Object[] r3 = r4.f3228     // Catch: java.lang.ClassCastException -> L3b
            r2 = r3[r2]     // Catch: java.lang.ClassCastException -> L3b
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.ClassCastException -> L3b
            boolean r0 = defpackage.AbstractC0498.m1280(r2, r0)     // Catch: java.lang.ClassCastException -> L3b
        L37:
            if (r0 != 0) goto L10
            goto L3b
        L3a:
            r1 = 1
        L3b:
            return r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
            r1 = this;
            int r0 = r1.f4661
            ᛴᛴᲁᲇ r1 = r1.f4660
            switch(r0) {
                case 0: goto Lc;
                default: goto L7;
            }
        L7:
            boolean r1 = r1.isEmpty()
            return r1
        Lc:
            boolean r1 = r1.isEmpty()
            return r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final java.util.Iterator iterator() {
            r2 = this;
            int r0 = r2.f4661
            ᛴᛴᲁᲇ r2 = r2.f4660
            switch(r0) {
                case 0: goto Le;
                default: goto L7;
            }
        L7:
            ᲇᛲᛱᛵ r0 = new ᲇᛲᛱᛵ
            r1 = 1
            r0.<init>(r2, r1)
            return r0
        Le:
            ᲇᛲᛱᛵ r0 = new ᲇᛲᛱᛵ
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(java.lang.Object r5) {
            r4 = this;
            int r0 = r4.f4661
            r1 = 1
            r2 = 0
            ᛴᛴᲁᲇ r4 = r4.f4660
            switch(r0) {
                case 0: goto L18;
                default: goto L9;
            }
        L9:
            r4.m1500()
            int r5 = r4.m1496(r5)
            if (r5 >= 0) goto L14
            r1 = r2
            goto L17
        L14:
            r4.m1495(r5)
        L17:
            return r1
        L18:
            boolean r0 = r5 instanceof java.util.Map.Entry
            if (r0 != 0) goto L1d
            goto L3b
        L1d:
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            r4.m1500()
            java.lang.Object r0 = r5.getKey()
            int r0 = r4.m1496(r0)
            if (r0 >= 0) goto L2d
            goto L3b
        L2d:
            java.lang.Object[] r3 = r4.f3228
            r3 = r3[r0]
            java.lang.Object r5 = r5.getValue()
            boolean r5 = defpackage.AbstractC0498.m1280(r3, r5)
            if (r5 != 0) goto L3d
        L3b:
            r1 = r2
            goto L40
        L3d:
            r4.m1495(r0)
        L40:
            return r1
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(java.util.Collection r3) {
            r2 = this;
            int r0 = r2.f4661
            ᛴᛴᲁᲇ r1 = r2.f4660
            switch(r0) {
                case 0: goto Lf;
                default: goto L7;
            }
        L7:
            r1.m1500()
            boolean r2 = super.removeAll(r3)
            return r2
        Lf:
            r1.m1500()
            boolean r2 = super.removeAll(r3)
            return r2
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(java.util.Collection r3) {
            r2 = this;
            int r0 = r2.f4661
            ᛴᛴᲁᲇ r1 = r2.f4660
            switch(r0) {
                case 0: goto Lf;
                default: goto L7;
            }
        L7:
            r1.m1500()
            boolean r2 = super.retainAll(r3)
            return r2
        Lf:
            r1.m1500()
            boolean r2 = super.retainAll(r3)
            return r2
    }

    @Override // defpackage.AbstractC1986
    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final int mo2011() {
            r1 = this;
            int r0 = r1.f4661
            ᛴᛴᲁᲇ r1 = r1.f4660
            switch(r0) {
                case 0: goto La;
                default: goto L7;
            }
        L7:
            int r1 = r1.f3222
            return r1
        La:
            int r1 = r1.f3222
            return r1
    }
}
