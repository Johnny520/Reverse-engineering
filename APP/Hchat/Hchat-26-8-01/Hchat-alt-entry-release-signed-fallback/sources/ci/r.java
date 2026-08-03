package ci;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r implements fg.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1795g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ci.s f1796h;

    public /* synthetic */ r(ci.s r1, int r2) {
            r0 = this;
            r0.f1795g = r2
            r0.f1796h = r1
            r0.<init>()
            return
    }

    @Override // fg.a
    public final java.lang.Object invoke() {
            r2 = this;
            int r0 = r2.f1795g
            switch(r0) {
                case 0: goto L1d;
                case 1: goto L12;
                default: goto L5;
            }
        L5:
            ci.s r0 = r2.f1796h
            x1.f0 r0 = x1.k.w(r0)
            r1 = 0
            r0.U(r1)
            sf.n r0 = sf.n.f12433a
            return r0
        L12:
            ci.s r0 = r2.f1796h
            i0.u r1 = ci.b0.f1669a
            java.lang.Object r0 = x1.k.h(r0, r1)
            ci.z r0 = (ci.z) r0
            return r0
        L1d:
            ci.s r0 = r2.f1796h
            i0.u r1 = sh.h0.f12595a
            java.lang.Object r0 = x1.k.h(r0, r1)
            if (r0 != 0) goto L29
        L27:
            r0 = 0
            goto L2d
        L29:
            ah.a.d()
            goto L27
        L2d:
            return r0
    }
}
