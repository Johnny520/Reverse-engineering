package xh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements fg.l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f21635g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ i.c f21636h;

    public /* synthetic */ a(i.c r1, int r2) {
            r0 = this;
            r0.f21635g = r2
            r0.f21636h = r1
            r0.<init>()
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r3) {
            r2 = this;
            int r0 = r2.f21635g
            f1.d0 r3 = (f1.d0) r3
            switch(r0) {
                case 0: goto L1c;
                default: goto L7;
            }
        L7:
            r3.getClass()
            i.c r0 = r2.f21636h
            java.lang.Object r0 = r0.d()
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            r3.n(r0)
        L19:
            sf.n r3 = sf.n.f12433a
            return r3
        L1c:
            r3.getClass()
            i.c r0 = r2.f21636h
            java.lang.Object r0 = r0.d()
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            r1 = 1045220557(0x3e4ccccd, float:0.2)
            float r0 = r0 * r1
            r1 = 1065353216(0x3f800000, float:1.0)
            float r1 = r1 - r0
            r3.q(r1)
            r3.i(r1)
            goto L19
    }
}
