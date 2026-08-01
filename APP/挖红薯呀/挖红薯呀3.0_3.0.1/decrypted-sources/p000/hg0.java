package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hg0 implements InterfaceC0742sw {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C0215fn f2256d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ zt0 f2257e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ wt0 f2258f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ lz0 f2259g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ vt0 f2260h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ hg0(C0215fn c0215fn, zt0 zt0Var, wt0 wt0Var, lz0 lz0Var, vt0 vt0Var) {
        this.f2256d = c0215fn;
        this.f2257e = zt0Var;
        this.f2258f = wt0Var;
        this.f2259g = lz0Var;
        this.f2260h = vt0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0742sw
    public final Object invoke(Object obj) {
        float fFloatValue = ((Float) obj).floatValue();
        C0215fn c0215fn = this.f2256d;
        fg0 fg0VarM1165g = C0215fn.m1165g((C0834vb) c0215fn.f1775f);
        if (fg0VarM1165g != null) {
            c0215fn.m1170h(fg0VarM1165g);
            zt0 zt0Var = this.f2257e;
            fg0 fg0VarM1103a = ((fg0) zt0Var.f7995d).m1103a(fg0VarM1165g);
            zt0Var.f7995d = fg0VarM1103a;
            long j = fg0VarM1103a.f1722a;
            lz0 lz0Var = this.f2259g;
            this.f2258f.f7189d = lz0Var.m2098i(lz0Var.m2094e(j));
            this.f2260h.f6825d = !r60.m3403e(r0 - fFloatValue);
        }
        return Boolean.valueOf(fg0VarM1165g != null);
    }
}
