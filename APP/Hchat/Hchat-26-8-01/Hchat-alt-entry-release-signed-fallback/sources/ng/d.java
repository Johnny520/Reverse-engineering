package ng;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements java.util.Iterator, hg.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f9430g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f9431h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.util.Iterator f9432i;

    public d(java.util.Iterator r2) {
            r1 = this;
            r0 = 2
            r1.f9430g = r0
            r2.getClass()
            r1.<init>()
            r1.f9432i = r2
            return
    }

    public d(ng.e r2) {
            r1 = this;
            r0 = 0
            r1.f9430g = r0
            r1.<init>()
            ng.j r0 = r2.f9434b
            java.util.Iterator r0 = r0.iterator()
            r1.f9432i = r0
            int r2 = r2.f9435c
            r1.f9431h = r2
            return
    }

    public d(ng.e r1, byte r2) {
            r0 = this;
            r2 = 1
            r0.f9430g = r2
            r0.<init>()
            int r2 = r1.f9435c
            r0.f9431h = r2
            ng.j r1 = r1.f9434b
            java.util.Iterator r1 = r1.iterator()
            r0.f9432i = r1
            return
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
            r2 = this;
            int r0 = r2.f9430g
            switch(r0) {
                case 0: goto L1c;
                case 1: goto Lc;
                default: goto L5;
            }
        L5:
            java.util.Iterator r0 = r2.f9432i
            boolean r0 = r0.hasNext()
            return r0
        Lc:
            int r0 = r2.f9431h
            if (r0 <= 0) goto L1a
            java.util.Iterator r0 = r2.f9432i
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L1a
            r0 = 1
            goto L1b
        L1a:
            r0 = 0
        L1b:
            return r0
        L1c:
            int r0 = r2.f9431h
            java.util.Iterator r1 = r2.f9432i
            if (r0 <= 0) goto L32
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L32
            r1.next()
            int r0 = r2.f9431h
            int r0 = r0 + (-1)
            r2.f9431h = r0
            goto L1c
        L32:
            boolean r0 = r1.hasNext()
            return r0
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
            r3 = this;
            int r0 = r3.f9430g
            switch(r0) {
                case 0: goto L32;
                case 1: goto L1e;
                default: goto L5;
            }
        L5:
            tf.w r0 = new tf.w
            int r1 = r3.f9431h
            int r2 = r1 + 1
            r3.f9431h = r2
            if (r1 < 0) goto L19
            java.util.Iterator r2 = r3.f9432i
            java.lang.Object r2 = r2.next()
            r0.<init>(r1, r2)
            return r0
        L19:
            a.a.Q0()
            r0 = 0
            throw r0
        L1e:
            int r0 = r3.f9431h
            if (r0 == 0) goto L2d
            int r0 = r0 + (-1)
            r3.f9431h = r0
            java.util.Iterator r0 = r3.f9432i
            java.lang.Object r0 = r0.next()
            goto L31
        L2d:
            bsh.j.e()
            r0 = 0
        L31:
            return r0
        L32:
            int r0 = r3.f9431h
            java.util.Iterator r1 = r3.f9432i
            if (r0 <= 0) goto L48
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L48
            r1.next()
            int r0 = r3.f9431h
            int r0 = r0 + (-1)
            r3.f9431h = r0
            goto L32
        L48:
            java.lang.Object r0 = r1.next()
            return r0
    }

    @Override // java.util.Iterator
    public final void remove() {
            r2 = this;
            int r0 = r2.f9430g
            switch(r0) {
                case 0: goto L15;
                case 1: goto Ld;
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
        L15:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }
}
