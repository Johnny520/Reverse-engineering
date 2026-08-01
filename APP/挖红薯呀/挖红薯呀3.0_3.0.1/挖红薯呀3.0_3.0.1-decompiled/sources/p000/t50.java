package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class t50 extends qj0 {

    /* JADX INFO: renamed from: V */
    public static final C0877w5 f5914V;

    /* JADX INFO: renamed from: T */
    public r50 f5915T;

    /* JADX INFO: renamed from: U */
    public s50 f5916U;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        C0877w5 c0877w5M2767g = o30.m2767g();
        c0877w5M2767g.m4871e(C0207ff.f1705e);
        c0877w5M2767g.f7002a.setStrokeWidth(1.0f);
        c0877w5M2767g.m4876j(1);
        f5914V = c0877w5M2767g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: r50 */
    /* JADX WARN: Multi-variable type inference failed */
    public t50(b60 b60Var, r50 r50Var) {
        super(b60Var);
        this.f5915T = r50Var;
        this.f5916U = b60Var.f413l != null ? new s50(this) : null;
        if ((((oe0) r50Var).f4529d.f4531f & 512) == 0) {
            return;
        }
        C0921xc.m5123d();
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.qj0
    /* JADX INFO: renamed from: B0 */
    public final void mo434B0() {
        if (this.f5916U == null) {
            this.f5916U = new s50(this);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.qj0
    /* JADX INFO: renamed from: E0 */
    public final ac0 mo435E0() {
        return this.f5916U;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.qj0
    /* JADX INFO: renamed from: G0 */
    public final oe0 mo436G0() {
        return ((oe0) this.f5915T).f4529d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.sd0
    /* JADX INFO: renamed from: I */
    public final int mo181I(int i) {
        r50 r50Var = this.f5915T;
        qj0 qj0Var = this.f5181s;
        qj0Var.getClass();
        return r50Var.mo2086G(this, qj0Var, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.sd0
    /* JADX INFO: renamed from: O */
    public final int mo182O(int i) {
        r50 r50Var = this.f5915T;
        qj0 qj0Var = this.f5181s;
        qj0Var.getClass();
        return r50Var.mo2087d(this, qj0Var, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.sd0
    /* JADX INFO: renamed from: R */
    public final int mo183R(int i) {
        r50 r50Var = this.f5915T;
        qj0 qj0Var = this.f5181s;
        qj0Var.getClass();
        return r50Var.mo2089s(this, qj0Var, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.qj0
    /* JADX INFO: renamed from: W0 */
    public final void mo438W0(InterfaceC0051bd interfaceC0051bd, C0868vx c0868vx) {
        qj0 qj0Var;
        qj0 qj0Var2 = this.f5181s;
        qj0Var2.getClass();
        qj0Var2.m3294z0(interfaceC0051bd, c0868vx);
        if (!((ViewTreeObserverOnGlobalLayoutListenerC0875w3) e60.m789a(this.f5180r)).getShowLayoutBounds() || (qj0Var = this.f5181s) == null) {
            return;
        }
        if (d30.m628a(this.f7402f, qj0Var.f7402f) && w20.m4833a(qj0Var.f5167C, 0L)) {
            return;
        }
        long j = this.f7402f;
        interfaceC0051bd.mo247m(0.5f, 0.5f, ((int) (j >> 32)) - 0.5f, ((int) (j & 4294967295L)) - 0.5f, f5914V);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.xq0
    /* JADX INFO: renamed from: X */
    public final void mo47X(long j, float f, InterfaceC0742sw interfaceC0742sw) {
        m3282X0(j, f, interfaceC0742sw);
        if (this.f7596m) {
            return;
        }
        m3278S0();
        qj0 qj0Var = this.f5181s;
        qj0Var.getClass();
        qj0Var.f7597n = this.f7597n;
        mo56o0().mo668b();
        qj0Var.f7597n = false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.yb0
    /* JADX INFO: renamed from: c0 */
    public final int mo234c0(AbstractC0535o2 abstractC0535o2) {
        s50 s50Var = this.f5916U;
        if (s50Var == null) {
            return u50.m4263d(this, abstractC0535o2);
        }
        ch0 ch0Var = s50Var.f106w;
        int iM534d = ch0Var.m534d(abstractC0535o2);
        if (iM534d >= 0) {
            return ch0Var.f812c[iM534d];
        }
        return Integer.MIN_VALUE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.sd0
    /* JADX INFO: renamed from: e */
    public final xq0 mo184e(long j) {
        m5146a0(j);
        r50 r50Var = this.f5915T;
        qj0 qj0Var = this.f5181s;
        qj0Var.getClass();
        m3285a1(r50Var.mo790Y(this, qj0Var, j));
        m3277R0();
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.sd0
    /* JADX INFO: renamed from: f */
    public final int mo185f(int i) {
        r50 r50Var = this.f5915T;
        qj0 qj0Var = this.f5181s;
        qj0Var.getClass();
        return r50Var.mo2088i(this, qj0Var, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: r50 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f1 */
    public final void m4188f1(r50 r50Var) {
        if (r50Var.equals(this.f5915T) || (((oe0) r50Var).f4529d.f4531f & 512) == 0) {
            this.f5915T = r50Var;
        } else {
            C0921xc.m5123d();
        }
    }
}
