package h0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y implements fg.l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f5025g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ w.y0 f5026h;

    public /* synthetic */ y(w.y0 r1, int r2) {
            r0 = this;
            r0.f5025g = r2
            r0.f5026h = r1
            r0.<init>()
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r4) {
            r3 = this;
            int r0 = r3.f5025g
            switch(r0) {
                case 0: goto L23;
                case 1: goto L13;
                default: goto L5;
            }
        L5:
            e1.b r4 = (e1.b) r4
            long r0 = r4.f2294a
            g1.d r4 = h0.w.f5009d
            w.y0 r2 = r3.f5026h
            r2.a(r0, r4)
        L10:
            sf.n r4 = sf.n.f12433a
            return r4
        L13:
            s1.t r4 = (s1.t) r4
            r0 = 0
            long r0 = s1.s.h(r4, r0)
            w.y0 r2 = r3.f5026h
            r2.e(r0)
            r4.a()
            goto L10
        L23:
            s1.t r4 = (s1.t) r4
            r0 = 0
            long r0 = s1.s.h(r4, r0)
            w.y0 r2 = r3.f5026h
            r2.e(r0)
            r4.a()
            goto L10
    }
}
