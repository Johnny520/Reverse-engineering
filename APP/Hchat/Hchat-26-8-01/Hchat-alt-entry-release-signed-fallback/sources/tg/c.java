package tg;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements tg.d {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final tg.d f13192g;

    public c(tg.d r1) {
            r0 = this;
            r0.<init>()
            r0.f13192g = r1
            return
    }

    @Override // tg.d
    public final java.lang.Object b(tg.e r3, wf.c r4) {
            r2 = this;
            gg.u r0 = new gg.u
            r0.<init>()
            l3.q r1 = ug.c.f13807b
            r0.f4564g = r1
            h0.l0 r1 = new h0.l0
            r1.<init>(r2, r0, r3)
            tg.d r3 = r2.f13192g
            java.lang.Object r3 = r3.b(r1, r4)
            xf.a r4 = xf.a.f21579g
            if (r3 != r4) goto L19
            return r3
        L19:
            sf.n r3 = sf.n.f12433a
            return r3
    }
}
