package ci;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q implements fg.l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1791g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ci.s f1792h;

    public /* synthetic */ q(ci.s r1, int r2) {
            r0 = this;
            r0.f1791g = r2
            r0.f1792h = r1
            r0.<init>()
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r4) {
            r3 = this;
            int r0 = r3.f1791g
            switch(r0) {
                case 0: goto L1f;
                default: goto L5;
            }
        L5:
            f1.d0 r4 = (f1.d0) r4
            r4.getClass()
            ci.s r0 = r3.f1792h
            ci.p r0 = r0.f1797u
            float r1 = r0.f1770a
            r4.s(r1)
            float r0 = r0.f1771b
            r4.g(r0)
            r0 = 1
            r4.r(r0)
            sf.n r4 = sf.n.f12433a
            return r4
        L1f:
            fg.p r4 = (fg.p) r4
            r4.getClass()
            ci.s r0 = r3.f1792h
            qg.t r0 = r0.Y0()
            r1 = 0
            r2 = 3
            qg.e1 r4 = qg.v.q(r0, r1, r4, r2)
            return r4
    }
}
