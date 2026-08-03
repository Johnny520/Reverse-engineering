package w;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j0 implements fg.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f14507g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ w.k0 f14508h;

    public /* synthetic */ j0(w.k0 r1, int r2) {
            r0 = this;
            r0.f14507g = r2
            r0.f14508h = r1
            r0.<init>()
            return
    }

    @Override // fg.a
    public final java.lang.Object invoke() {
            r1 = this;
            int r0 = r1.f14507g
            switch(r0) {
                case 0: goto L18;
                default: goto L5;
            }
        L5:
            w.k0 r0 = r1.f14508h
            m2.r r0 = r0.B
            if (r0 == 0) goto Le
            sf.n r0 = sf.n.f12433a
            goto L17
        Le:
            java.lang.String r0 = "Font resolution state is not set."
            o.b.b(r0)
            okio.a.c()
            r0 = 0
        L17:
            return r0
        L18:
            w.k0 r0 = r1.f14508h
            m2.r r0 = r0.B
            if (r0 == 0) goto L21
            sf.n r0 = sf.n.f12433a
            goto L2a
        L21:
            java.lang.String r0 = "Font resolution state is not set."
            o.b.b(r0)
            okio.a.c()
            r0 = 0
        L2a:
            return r0
    }
}
