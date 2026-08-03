package ng;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends ng.l implements java.util.Iterator, wf.c, hg.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f9445g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public java.lang.Object f9446h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public java.util.Iterator f9447i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public wf.c f9448j;

    @Override // ng.l
    public final void a(java.lang.Object r1, wf.c r2) {
            r0 = this;
            r0.f9446h = r1
            r1 = 3
            r0.f9445g = r1
            r0.f9448j = r2
            r2.getClass()
            return
    }

    public final java.lang.RuntimeException c() {
            r3 = this;
            int r0 = r3.f9445g
            r1 = 4
            if (r0 == r1) goto L26
            r1 = 5
            if (r0 == r1) goto L1e
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unexpected state of the iterator: "
            r1.<init>(r2)
            int r2 = r3.f9445g
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            return r0
        L1e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Iterator has failed."
            r0.<init>(r1)
            return r0
        L26:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            return r0
    }

    @Override // wf.c
    public final wf.g getContext() {
            r1 = this;
            wf.h r0 = wf.h.f20786g
            return r0
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
            r4 = this;
        L0:
            int r0 = r4.f9445g
            r1 = 0
            if (r0 == 0) goto L29
            r2 = 2
            r3 = 1
            if (r0 == r3) goto L19
            if (r0 == r2) goto L18
            r1 = 3
            if (r0 == r1) goto L18
            r1 = 4
            if (r0 != r1) goto L13
            r0 = 0
            return r0
        L13:
            java.lang.RuntimeException r0 = r4.c()
            throw r0
        L18:
            return r3
        L19:
            java.util.Iterator r0 = r4.f9447i
            r0.getClass()
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L27
            r4.f9445g = r2
            return r3
        L27:
            r4.f9447i = r1
        L29:
            r0 = 5
            r4.f9445g = r0
            wf.c r0 = r4.f9448j
            r0.getClass()
            r4.f9448j = r1
            sf.n r1 = sf.n.f12433a
            r0.resumeWith(r1)
            goto L0
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
            r3 = this;
            int r0 = r3.f9445g
            if (r0 == 0) goto L27
            r1 = 1
            if (r0 == r1) goto L27
            r2 = 2
            if (r0 == r2) goto L1b
            r1 = 3
            if (r0 != r1) goto L16
            r0 = 0
            r3.f9445g = r0
            java.lang.Object r0 = r3.f9446h
            r1 = 0
            r3.f9446h = r1
            return r0
        L16:
            java.lang.RuntimeException r0 = r3.c()
            throw r0
        L1b:
            r3.f9445g = r1
            java.util.Iterator r0 = r3.f9447i
            r0.getClass()
            java.lang.Object r0 = r0.next()
            return r0
        L27:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L32
            java.lang.Object r0 = r3.next()
            return r0
        L32:
            bsh.j.e()
            r0 = 0
            return r0
    }

    @Override // java.util.Iterator
    public final void remove() {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }

    @Override // wf.c
    public final void resumeWith(java.lang.Object r1) {
            r0 = this;
            f8.i.I0(r1)
            r1 = 4
            r0.f9445g = r1
            return
    }
}
