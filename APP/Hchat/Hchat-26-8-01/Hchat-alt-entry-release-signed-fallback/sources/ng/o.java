package ng;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class o implements java.util.Iterator, hg.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f9449g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.io.File f9450h;

    public o(java.io.File r1) {
            r0 = this;
            r0.<init>()
            r0.f9450h = r1
            r1 = 1
            r0.f9449g = r1
            return
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
            r1 = this;
            boolean r0 = r1.f9449g
            return r0
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
            r1 = this;
            boolean r0 = r1.f9449g
            if (r0 == 0) goto La
            r0 = 0
            r1.f9449g = r0
            java.io.File r0 = r1.f9450h
            return r0
        La:
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
}
