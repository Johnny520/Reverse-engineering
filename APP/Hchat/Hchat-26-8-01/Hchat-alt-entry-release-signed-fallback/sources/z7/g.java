package z7;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements java.util.Iterator {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final java.util.Iterator f22603g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.util.function.Function f22604h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public java.lang.Object f22605i;

    public g(java.util.Iterator r1, java.util.function.Function r2) {
            r0 = this;
            r0.<init>()
            r0.f22603g = r1
            r0.f22604h = r2
            return
    }

    public final java.lang.Object a() {
            r2 = this;
            java.lang.Object r0 = r2.f22605i
            if (r0 != 0) goto L1a
        L4:
            java.util.Iterator r0 = r2.f22603g
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1a
            java.util.function.Function r1 = r2.f22604h
            java.lang.Object r0 = r0.next()
            java.lang.Object r0 = r1.apply(r0)
            if (r0 == 0) goto L4
            r2.f22605i = r0
        L1a:
            java.lang.Object r0 = r2.f22605i
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
            r2.f22605i = r1
            return r0
        La:
            bsh.j.e()
            r0 = 0
            return r0
    }
}
