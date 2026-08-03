package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o8 implements fg.l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f18015g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.List f18016h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ fg.p f18017i;

    public /* synthetic */ o8(java.util.List r1, fg.p r2, int r3) {
            r0 = this;
            r0.f18015g = r3
            r0.f18016h = r1
            r0.f18017i = r2
            r0.<init>()
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r7) {
            r6 = this;
            int r0 = r6.f18015g
            r.h r7 = (r.h) r7
            switch(r0) {
                case 0: goto L4b;
                case 1: goto L2a;
                default: goto L7;
            }
        L7:
            r7.getClass()
            s0.d r0 = wb.p0.Q2
            r1 = 0
            r2 = 3
            r.h.a(r7, r1, r0, r2)
            wb.nc r0 = new wb.nc
            r3 = 2
            java.util.List r4 = r6.f18016h
            fg.p r5 = r6.f18017i
            r0.<init>(r4, r5, r3)
            s0.d r3 = new s0.d
            r4 = -1763359004(0xffffffff96e546e4, float:-3.7041684E-25)
            r5 = 1
            r3.<init>(r4, r0, r5)
            r.h.a(r7, r1, r3, r2)
        L27:
            sf.n r7 = sf.n.f12433a
            return r7
        L2a:
            r7.getClass()
            s0.d r0 = wb.p0.H4
            r1 = 0
            r2 = 3
            r.h.a(r7, r1, r0, r2)
            wb.nc r0 = new wb.nc
            r3 = 0
            java.util.List r4 = r6.f18016h
            fg.p r5 = r6.f18017i
            r0.<init>(r4, r5, r3)
            s0.d r3 = new s0.d
            r4 = -228795409(0xfffffffff25cdbef, float:-4.3745655E30)
            r5 = 1
            r3.<init>(r4, r0, r5)
            r.h.a(r7, r1, r3, r2)
            goto L27
        L4b:
            r7.getClass()
            s0.d r0 = wb.p0.f18344s5
            r1 = 0
            r2 = 3
            r.h.a(r7, r1, r0, r2)
            wb.nc r0 = new wb.nc
            r3 = 1
            java.util.List r4 = r6.f18016h
            fg.p r5 = r6.f18017i
            r0.<init>(r4, r5, r3)
            s0.d r3 = new s0.d
            r4 = 1105260703(0x41e0f09f, float:28.11749)
            r5 = 1
            r3.<init>(r4, r0, r5)
            r.h.a(r7, r1, r3, r2)
            goto L27
    }
}
