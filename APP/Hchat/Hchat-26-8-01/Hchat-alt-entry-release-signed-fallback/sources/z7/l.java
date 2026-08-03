package z7;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class l implements java.util.Iterator {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final z7.s f22614g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f22615h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public java.lang.Object f22616i;

    public l(z7.s r1) {
            r0 = this;
            r0.<init>()
            r0.f22614g = r1
            return
    }

    public final java.lang.Object a() {
            r3 = this;
            java.lang.Object r0 = r3.f22616i
            if (r0 != 0) goto L1f
        L4:
            int r0 = r3.f22615h
            z7.s r1 = r3.f22614g
            int r2 = r1.size()
            if (r0 >= r2) goto L1f
            int r0 = r3.f22615h
            java.lang.Object r0 = r1.get(r0)
            int r1 = r3.f22615h
            int r1 = r1 + 1
            r3.f22615h = r1
            if (r0 != 0) goto L1d
            goto L4
        L1d:
            r3.f22616i = r0
        L1f:
            java.lang.Object r0 = r3.f22616i
            return r0
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
            r1 = this;
            java.lang.Object r0 = r1.a()
            if (r0 == 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
            r2 = this;
            java.lang.Object r0 = r2.a()
            if (r0 == 0) goto La
            r1 = 0
            r2.f22616i = r1
            return r0
        La:
            bsh.j.e()
            r0 = 0
            return r0
    }
}
