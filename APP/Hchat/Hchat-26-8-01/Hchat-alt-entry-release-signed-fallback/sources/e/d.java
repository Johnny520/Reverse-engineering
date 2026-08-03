package e;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends e.e implements java.util.Iterator {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public e.c f2275g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f2276h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ e.a f2277i;

    public d(e.a r1) {
            r0 = this;
            r0.<init>()
            r0.f2277i = r1
            r1 = 1
            r0.f2276h = r1
            return
    }

    @Override // e.e
    public final void a(e.c r2) {
            r1 = this;
            e.c r0 = r1.f2275g
            if (r2 != r0) goto Lf
            e.c r2 = r0.f2274j
            r1.f2275g = r2
            if (r2 != 0) goto Lc
            r2 = 1
            goto Ld
        Lc:
            r2 = 0
        Ld:
            r1.f2276h = r2
        Lf:
            return
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
            r3 = this;
            boolean r0 = r3.f2276h
            r1 = 0
            r2 = 1
            if (r0 == 0) goto Le
            e.a r0 = r3.f2277i
            e.c r0 = r0.f2263g
            if (r0 == 0) goto Ld
            return r2
        Ld:
            return r1
        Le:
            e.c r0 = r3.f2275g
            if (r0 == 0) goto L17
            e.c r0 = r0.f2273i
            if (r0 == 0) goto L17
            return r2
        L17:
            return r1
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
            r1 = this;
            boolean r0 = r1.f2276h
            if (r0 == 0) goto Le
            r0 = 0
            r1.f2276h = r0
            e.a r0 = r1.f2277i
            e.c r0 = r0.f2263g
            r1.f2275g = r0
            goto L18
        Le:
            e.c r0 = r1.f2275g
            if (r0 == 0) goto L15
            e.c r0 = r0.f2273i
            goto L16
        L15:
            r0 = 0
        L16:
            r1.f2275g = r0
        L18:
            e.c r0 = r1.f2275g
            return r0
    }
}
