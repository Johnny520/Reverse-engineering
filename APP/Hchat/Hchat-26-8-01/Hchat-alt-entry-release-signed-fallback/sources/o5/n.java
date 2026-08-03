package o5;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class n implements java.util.Iterator {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f9531g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ o5.o f9532h;

    public n(o5.o r1) {
            r0 = this;
            r0.<init>()
            r0.f9532h = r1
            r1 = 0
            r0.f9531g = r1
            return
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
            r2 = this;
            int r0 = r2.f9531g
            o5.o r1 = r2.f9532h
            int r1 = r1.size()
            if (r0 >= r1) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
            r2 = this;
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L13
            int r0 = r2.f9531g
            int r1 = r0 + 1
            r2.f9531g = r1
            o5.o r1 = r2.f9532h
            java.lang.Object r0 = r1.a(r0)
            return r0
        L13:
            bsh.j.e()
            r0 = 0
            return r0
    }

    @Override // java.util.Iterator
    public final void remove() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }
}
