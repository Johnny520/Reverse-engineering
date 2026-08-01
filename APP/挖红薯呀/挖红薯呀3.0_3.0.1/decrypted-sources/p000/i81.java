package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class i81 extends oe0 implements r50 {

    /* JADX INFO: renamed from: r */
    public g30 f2482r;

    /* JADX INFO: renamed from: s */
    public boolean f2483s;

    /* JADX INFO: renamed from: t */
    public o31 f2484t;

    /* JADX INFO: renamed from: u */
    public boolean f2485u;

    /* JADX INFO: renamed from: v */
    public C0045b7 f2486v;

    /* JADX INFO: renamed from: w */
    public C0045b7 f2487w;

    /* JADX INFO: renamed from: x */
    public float f2488x;

    /* JADX INFO: renamed from: y */
    public float f2489y;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.r50
    /* JADX INFO: renamed from: Y */
    public final yd0 mo790Y(zd0 zd0Var, sd0 sd0Var, long j) {
        float f = o30.f4422H;
        int i = 0;
        int i2 = 1;
        float fMo654p = zd0Var.mo654p(this.f2485u ? o30.f4417C : ((sd0Var.mo185f(C0617pj.m3137h(j)) != 0 && sd0Var.mo182O(C0617pj.m3136g(j)) != 0) || this.f2483s) ? w51.f7006a : w51.f7007b);
        C0045b7 c0045b7 = this.f2487w;
        int iFloatValue = (int) (c0045b7 != null ? ((Number) c0045b7.m323d()).floatValue() : fMo654p);
        if (!((iFloatValue >= 0) & (iFloatValue >= 0))) {
            y10.m5197a("width and height must be >= 0");
        }
        xq0 xq0VarMo184e = sd0Var.mo184e(AbstractC0654qj.m3260g(iFloatValue, iFloatValue, iFloatValue, iFloatValue));
        float fMo654p2 = zd0Var.mo654p((w51.f7009d - zd0Var.mo653i0(fMo654p)) / 2.0f);
        float fMo654p3 = zd0Var.mo654p((w51.f7008c - w51.f7006a) - w51.f7010e);
        boolean z = this.f2485u;
        if (z && this.f2483s) {
            fMo654p2 = fMo654p3 - zd0Var.mo654p(f);
        } else if (z && !this.f2483s) {
            fMo654p2 = zd0Var.mo654p(f);
        } else if (this.f2483s) {
            fMo654p2 = fMo654p3;
        }
        C0045b7 c0045b72 = this.f2487w;
        InterfaceC0322ik interfaceC0322ik = null;
        Float f2 = c0045b72 != null ? (Float) c0045b72.f434e.getValue() : null;
        if (f2 == null || f2.floatValue() != fMo654p) {
            AbstractC0307i4.m1547w(m2879k0(), null, new h81(this, fMo654p, interfaceC0322ik, i), 3);
        }
        C0045b7 c0045b73 = this.f2486v;
        Float f3 = c0045b73 != null ? (Float) c0045b73.f434e.getValue() : null;
        if (f3 == null || f3.floatValue() != fMo654p2) {
            AbstractC0307i4.m1547w(m2879k0(), null, new h81(this, fMo654p2, interfaceC0322ik, i2), 3);
        }
        if (Float.isNaN(this.f2489y) && Float.isNaN(this.f2488x)) {
            this.f2489y = fMo654p;
            this.f2488x = fMo654p2;
        }
        return zd0Var.mo1279Q(iFloatValue, iFloatValue, C0330is.f2614d, new g81(xq0VarMo184e, this, fMo654p2));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.oe0
    /* JADX INFO: renamed from: l0 */
    public final boolean mo548l0() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.oe0
    /* JADX INFO: renamed from: o0 */
    public final void mo656o0() {
        AbstractC0307i4.m1547w(m2879k0(), null, new C0091cg(this, (InterfaceC0322ik) null, 9), 3);
    }
}
