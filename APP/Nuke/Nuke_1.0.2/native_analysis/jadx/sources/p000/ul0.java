package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ul0 extends u60 implements on2, dq0, InterfaceC0257gy, os1, d43 {

    /* JADX INFO: renamed from: D */
    public static final C0160eb f11344D = new C0160eb(23);

    /* JADX INFO: renamed from: A */
    public e81 f11345A;

    /* JADX INFO: renamed from: B */
    public zn1 f11346B;

    /* JADX INFO: renamed from: C */
    public final pl0 f11347C;

    /* JADX INFO: renamed from: x */
    public bk1 f11348x;

    /* JADX INFO: renamed from: y */
    public final in0 f11349y;

    /* JADX INFO: renamed from: z */
    public tk0 f11350z;

    public ul0(bk1 bk1Var, int i, C0151e2 c0151e2) {
        this.f11348x = bk1Var;
        this.f11349y = c0151e2;
        pl0 pl0Var = new pl0(i, new ml0(2, this, ul0.class, "onFocusStateChange", "onFocusStateChange(Landroidx/compose/ui/focus/FocusState;Landroidx/compose/ui/focus/FocusState;)V", 0, 0, 1), 10);
        m5468M0(pl0Var);
        this.f11347C = pl0Var;
    }

    @Override // p000.th1
    /* JADX INFO: renamed from: B0 */
    public final boolean mo210B0() {
        return false;
    }

    @Override // p000.th1
    /* JADX INFO: renamed from: G0 */
    public final void mo1486G0() {
        e81 e81Var = this.f11345A;
        if (e81Var != null) {
            e81Var.m1292b();
        }
        this.f11345A = null;
    }

    @Override // p000.os1
    /* JADX INFO: renamed from: L */
    public final void mo1847L() {
        o72 o72Var = new o72();
        s11.m4674S(this, new C0640r1(16, o72Var, this));
        e81 e81Var = (e81) o72Var.f7574i;
        if (this.f11347C.m3876R0().m2718a()) {
            e81 e81Var2 = this.f11345A;
            if (e81Var2 != null) {
                e81Var2.m1292b();
            }
            if (e81Var != null) {
                e81Var.m1291a();
            } else {
                e81Var = null;
            }
            this.f11345A = e81Var;
        }
    }

    /* JADX INFO: renamed from: P0 */
    public final void m5509P0(bk1 bk1Var, j11 j11Var) {
        if (!this.f10770u) {
            bk1Var.m555b(j11Var);
            return;
        }
        k21 k21Var = (k21) ((s00) m5255A0()).f9850h.mo15o(C0700sn.f10207K);
        AbstractC0570p7.m3745A(m5255A0(), null, new C0040b2(bk1Var, j11Var, k21Var != null ? k21Var.mo1707t(new C0115d2(13, bk1Var, j11Var)) : null, null, 8), 3);
    }

    /* JADX INFO: renamed from: Q0 */
    public final void m5510Q0(bk1 bk1Var) {
        tk0 tk0Var;
        if (t11.m5086l(this.f11348x, bk1Var)) {
            return;
        }
        bk1 bk1Var2 = this.f11348x;
        if (bk1Var2 != null && (tk0Var = this.f11350z) != null) {
            bk1Var2.m555b(new uk0(tk0Var));
        }
        this.f11350z = null;
        this.f11348x = bk1Var;
    }

    @Override // p000.on2
    /* JADX INFO: renamed from: l0 */
    public final void mo232l0(zn2 zn2Var) {
        boolean zM2718a = this.f11347C.m3876R0().m2718a();
        v41[] v41VarArr = xn2.f13086a;
        yn2 yn2Var = vn2.f12069l;
        v41 v41Var = xn2.f13086a[4];
        zn2Var.mo1533a(yn2Var, Boolean.valueOf(zM2718a));
        zn2Var.mo1533a(kn2.f5681w, new C0603q3(null, new C0645r6(0, this, ul0.class, "requestFocus", "requestFocus()Z", 0, 0, 3)));
    }

    @Override // p000.d43
    /* JADX INFO: renamed from: r */
    public final Object mo962r() {
        return f11344D;
    }

    @Override // p000.dq0
    /* JADX INFO: renamed from: w */
    public final void mo1069w(zn1 zn1Var) {
        this.f11346B = zn1Var;
        if (this.f11347C.m3876R0().m2718a()) {
            boolean z = zn1Var.mo2843S0().f10770u;
            C0953z8 c0953z8 = vl0.f12006v;
            if (!z) {
                if (this.f10770u) {
                    tb3.m5155a(this, c0953z8);
                }
            } else {
                zn1 zn1Var2 = this.f11346B;
                if (zn1Var2 != null && zn1Var2.mo2843S0().f10770u && this.f10770u) {
                    tb3.m5155a(this, c0953z8);
                }
            }
        }
    }
}
