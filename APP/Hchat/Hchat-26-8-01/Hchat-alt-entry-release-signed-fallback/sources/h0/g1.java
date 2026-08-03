package h0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g1 implements fg.l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f4896g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ fg.a f4897h;

    public /* synthetic */ g1(fg.a r1, int r2) {
            r0 = this;
            r0.f4896g = r2
            r0.f4897h = r1
            r0.<init>()
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r2) {
            r1 = this;
            int r0 = r1.f4896g
            switch(r0) {
                case 0: goto L33;
                case 1: goto L19;
                case 2: goto Lf;
                default: goto L5;
            }
        L5:
            e1.b r2 = (e1.b) r2
            fg.a r2 = r1.f4897h
            r2.invoke()
            sf.n r2 = sf.n.f12433a
            return r2
        Lf:
            e1.b r2 = (e1.b) r2
            fg.a r2 = r1.f4897h
            r2.invoke()
            sf.n r2 = sf.n.f12433a
            return r2
        L19:
            f1.d0 r2 = (f1.d0) r2
            r2.getClass()
            fg.a r0 = r1.f4897h
            java.lang.Object r0 = r0.invoke()
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            r2.q(r0)
            r2.i(r0)
            sf.n r2 = sf.n.f12433a
            return r2
        L33:
            u2.c r2 = (u2.c) r2
            fg.a r2 = r1.f4897h
            java.lang.Object r2 = r2.invoke()
            e1.b r2 = (e1.b) r2
            return r2
    }
}
