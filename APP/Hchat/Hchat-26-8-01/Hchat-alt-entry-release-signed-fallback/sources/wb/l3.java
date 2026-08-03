package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l3 implements fg.l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f17386g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ uh.b f17387h;

    public /* synthetic */ l3(uh.b r1, int r2) {
            r0 = this;
            r0.f17386g = r2
            r0.f17387h = r1
            r0.<init>()
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r4) {
            r3 = this;
            int r0 = r3.f17386g
            th.g r4 = (th.g) r4
            switch(r0) {
                case 0: goto L15;
                default: goto L7;
            }
        L7:
            r4.getClass()
            r4 = 0
            r0 = 5
            uh.b r1 = r3.f17387h
            r2 = 1061158912(0x3f400000, float:0.75)
            uh.b r4 = uh.b.a(r1, r2, r4, r0)
            return r4
        L15:
            r4.getClass()
            r4 = 0
            r0 = 5
            uh.b r1 = r3.f17387h
            r2 = 1061158912(0x3f400000, float:0.75)
            uh.b r4 = uh.b.a(r1, r2, r4, r0)
            return r4
    }
}
