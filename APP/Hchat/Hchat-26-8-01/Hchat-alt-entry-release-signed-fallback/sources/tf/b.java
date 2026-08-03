package tf;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b implements java.util.Iterator, hg.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f13138g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public java.lang.Object f13139h;

    public abstract void a();

    @Override // java.util.Iterator
    public final boolean hasNext() {
            r3 = this;
            int r0 = r3.f13138g
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L14
            if (r0 == r2) goto L13
            r2 = 2
            if (r0 != r2) goto Lc
            return r1
        Lc:
            java.lang.String r0 = "hasNext called when the iterator is in the FAILED state."
            j8.o.t(r0)
            r0 = 0
            return r0
        L13:
            return r2
        L14:
            r0 = 3
            r3.f13138g = r0
            r3.a()
            int r0 = r3.f13138g
            if (r0 != r2) goto L1f
            return r2
        L1f:
            return r1
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
            r4 = this;
            int r0 = r4.f13138g
            r1 = 0
            r2 = 1
            if (r0 != r2) goto Lb
            r4.f13138g = r1
            java.lang.Object r0 = r4.f13139h
            return r0
        Lb:
            r3 = 2
            if (r0 == r3) goto L1d
            r0 = 3
            r4.f13138g = r0
            r4.a()
            int r0 = r4.f13138g
            if (r0 != r2) goto L1d
            r4.f13138g = r1
            java.lang.Object r0 = r4.f13139h
            return r0
        L1d:
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
