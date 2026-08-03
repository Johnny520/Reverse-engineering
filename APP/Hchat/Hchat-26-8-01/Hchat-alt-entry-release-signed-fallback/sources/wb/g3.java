package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g3 implements fg.l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f16300g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f16301h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f16302i;

    public /* synthetic */ g3(java.lang.Object r1, boolean r2, int r3) {
            r0 = this;
            r0.f16300g = r3
            r0.f16302i = r1
            r0.f16301h = r2
            r0.<init>()
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r10) {
            r9 = this;
            int r0 = r9.f16300g
            switch(r0) {
                case 0: goto L42;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r9.f16302i
            android.content.SharedPreferences r0 = (android.content.SharedPreferences) r0
            r.h r10 = (r.h) r10
            r10.getClass()
            s0.d r1 = wb.p0.j4
            r2 = 0
            r3 = 3
            r.h.a(r10, r2, r1, r3)
            wb.gm r1 = new wb.gm
            r4 = 0
            boolean r5 = r9.f16301h
            r1.<init>(r0, r5, r4)
            s0.d r4 = new s0.d
            r6 = 902745978(0x35cecf7a, float:1.540858E-6)
            r7 = 1
            r4.<init>(r6, r1, r7)
            r.h.a(r10, r2, r4, r3)
            s0.d r1 = wb.p0.f18283k4
            r.h.a(r10, r2, r1, r3)
            wb.gm r1 = new wb.gm
            r4 = 1
            r1.<init>(r0, r5, r4)
            s0.d r0 = new s0.d
            r4 = -1856824648(0xffffffff91531ab8, float:-1.6653198E-28)
            r0.<init>(r4, r1, r7)
            r.h.a(r10, r2, r0, r3)
        L3f:
            sf.n r10 = sf.n.f12433a
            return r10
        L42:
            java.lang.Object r0 = r9.f16302i
            xb.i r0 = (xb.i) r0
            r1 = r10
            h1.d r1 = (h1.d) r1
            r1.getClass()
            float r10 = r0.a()
            r0 = 1036831949(0x3dcccccd, float:0.1)
            boolean r2 = r9.f16301h
            if (r2 != 0) goto L5e
            long r2 = f1.w.f3126b
        L59:
            long r2 = f1.w.b(r2, r0)
            goto L61
        L5e:
            long r2 = f1.w.f3127c
            goto L59
        L61:
            r0 = 1065353216(0x3f800000, float:1.0)
            float r6 = r0 - r10
            r7 = 0
            r8 = 118(0x76, float:1.65E-43)
            r4 = 0
            h1.d.Z(r1, r2, r4, r6, r7, r8)
            long r2 = f1.w.f3126b
            r0 = 1022739087(0x3cf5c28f, float:0.03)
            float r10 = r10 * r0
            long r2 = f1.w.b(r2, r10)
            r8 = 126(0x7e, float:1.77E-43)
            r6 = 0
            h1.d.Z(r1, r2, r4, r6, r7, r8)
            goto L3f
    }
}
