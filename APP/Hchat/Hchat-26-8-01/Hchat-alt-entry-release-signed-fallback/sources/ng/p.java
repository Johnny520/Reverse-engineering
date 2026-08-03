package ng;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class p implements java.lang.Iterable, hg.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f9451g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.Object f9452h;

    public /* synthetic */ p(java.lang.Object r1, int r2) {
            r0 = this;
            r0.f9451g = r2
            r0.f9452h = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator iterator() {
            r2 = this;
            int r0 = r2.f9451g
            switch(r0) {
                case 0: goto L21;
                case 1: goto L17;
                default: goto L5;
            }
        L5:
            ng.d r0 = new ng.d
            java.lang.Object r1 = r2.f9452h
            i.e0 r1 = (i.e0) r1
            java.lang.Object r1 = r1.f5657h
            java.util.List r1 = (java.util.List) r1
            java.util.Iterator r1 = r1.iterator()
            r0.<init>(r1)
            return r0
        L17:
            java.lang.Object r0 = r2.f9452h
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            gg.b r1 = new gg.b
            r1.<init>(r0)
            return r1
        L21:
            java.lang.Object r0 = r2.f9452h
            og.c r0 = (og.c) r0
            og.b r1 = new og.b
            r1.<init>(r0)
            return r1
    }
}
