package p000;

/* JADX INFO: renamed from: mc */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0469mc extends oe0 implements mk0, InterfaceC0050bc, InterfaceC0775tq {

    /* JADX INFO: renamed from: r */
    public final C0507nc f3911r;

    /* JADX INFO: renamed from: s */
    public boolean f3912s;

    /* JADX INFO: renamed from: t */
    public final C0532o f3913t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0469mc(C0507nc c0507nc, C0532o c0532o) {
        this.f3911r = c0507nc;
        this.f3913t = c0532o;
        c0507nc.f4234d = this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0775tq
    /* JADX INFO: renamed from: B */
    public final void mo1679B(d60 d60Var) {
        boolean z = this.f3912s;
        C0507nc c0507nc = this.f3911r;
        if (!z) {
            c0507nc.f4235e = null;
            r60.m3420v(this, new C0458m3(4, this, c0507nc));
            if (c0507nc.f4235e == null) {
                throw AbstractC0748t1.m4149g("DrawResult not defined, did you forget to call onDraw?");
            }
            this.f3912s = true;
        }
        C0910x1 c0910x1 = c0507nc.f4235e;
        c0910x1.getClass();
        ((InterfaceC0742sw) c0910x1.f7232e).invoke(d60Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0694rm, p000.qr0
    /* JADX INFO: renamed from: a */
    public final void mo759a() {
        m2491w0();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0050bc
    /* JADX INFO: renamed from: b */
    public final InterfaceC0968ym mo338b() {
        return pf1.m3039Q(this).f388B;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0050bc
    /* JADX INFO: renamed from: c */
    public final long mo339c() {
        return o30.m2759C(pf1.m3037O(this, 4).f7402f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0775tq
    /* JADX INFO: renamed from: d0 */
    public final void mo2489d0() {
        m2491w0();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0694rm
    /* JADX INFO: renamed from: g0 */
    public final void mo2490g0() {
        m2491w0();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0050bc
    public final k50 getLayoutDirection() {
        return pf1.m3039Q(this).f389C;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.oe0
    /* JADX INFO: renamed from: q0 */
    public final void mo694q0() {
        m2491w0();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w0 */
    public final void m2491w0() {
        this.f3912s = false;
        this.f3911r.f4235e = null;
        AbstractC0398kl.m1932r(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.mk0
    /* JADX INFO: renamed from: z */
    public final void mo734z() {
        m2491w0();
    }

    @Override // p000.oe0
    /* JADX INFO: renamed from: p0 */
    public final void mo657p0() {
    }
}
