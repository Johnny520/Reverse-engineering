package v1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class i1 extends gg.m implements fg.p {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f13952g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ v1.j1 f13953h;

    public /* synthetic */ i1(v1.j1 r1, int r2) {
            r0 = this;
            r0.f13952g = r2
            r0.f13953h = r1
            r1 = 2
            r0.<init>(r1)
            return
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r4, java.lang.Object r5) {
            r3 = this;
            int r0 = r3.f13952g
            switch(r0) {
                case 0: goto L4f;
                case 1: goto L38;
                default: goto L5;
            }
        L5:
            x1.f0 r4 = (x1.f0) r4
            v1.j1 r5 = (v1.j1) r5
            v1.j1 r5 = r3.f13953h
            v1.l1 r0 = r5.f13971a
            v1.j0 r1 = r4.N
            if (r1 != 0) goto L18
            v1.j0 r1 = new v1.j0
            r1.<init>(r4, r0)
            r4.N = r1
        L18:
            r5.f13972b = r1
            v1.j0 r4 = r5.a()
            r4.h()
            v1.j0 r4 = r5.a()
            v1.l1 r5 = r4.f13957i
            if (r5 == r0) goto L35
            r4.f13957i = r0
            r5 = 0
            r4.i(r5)
            x1.f0 r4 = r4.f13955g
            r0 = 7
            x1.f0.V(r4, r5, r0)
        L35:
            sf.n r4 = sf.n.f12433a
            return r4
        L38:
            x1.f0 r4 = (x1.f0) r4
            fg.p r5 = (fg.p) r5
            v1.j1 r0 = r3.f13953h
            v1.j0 r0 = r0.a()
            java.lang.String r1 = r0.f13970v
            v1.f0 r2 = new v1.f0
            r2.<init>(r0, r5, r1)
            r4.c0(r2)
            sf.n r4 = sf.n.f12433a
            return r4
        L4f:
            x1.f0 r4 = (x1.f0) r4
            i0.o r5 = (i0.o) r5
            v1.j1 r4 = r3.f13953h
            v1.j0 r4 = r4.a()
            r4.f13956h = r5
            sf.n r4 = sf.n.f12433a
            return r4
    }
}
