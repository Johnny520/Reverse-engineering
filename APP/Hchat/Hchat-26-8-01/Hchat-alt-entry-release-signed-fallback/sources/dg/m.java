package dg;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class m implements java.util.Iterator, hg.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public java.lang.String f2258g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f2259h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ dg.n f2260i;

    public m(dg.n r1) {
            r0 = this;
            r0.<init>()
            r0.f2260i = r1
            return
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
            r2 = this;
            java.lang.String r0 = r2.f2258g
            r1 = 1
            if (r0 != 0) goto L19
            boolean r0 = r2.f2259h
            if (r0 != 0) goto L19
            dg.n r0 = r2.f2260i
            java.lang.Object r0 = r0.f2262b
            java.io.BufferedReader r0 = (java.io.BufferedReader) r0
            java.lang.String r0 = r0.readLine()
            r2.f2258g = r0
            if (r0 != 0) goto L19
            r2.f2259h = r1
        L19:
            java.lang.String r0 = r2.f2258g
            if (r0 == 0) goto L1e
            return r1
        L1e:
            r0 = 0
            return r0
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
            r2 = this;
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto Lf
            java.lang.String r0 = r2.f2258g
            r1 = 0
            r2.f2258g = r1
            r0.getClass()
            return r0
        Lf:
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
