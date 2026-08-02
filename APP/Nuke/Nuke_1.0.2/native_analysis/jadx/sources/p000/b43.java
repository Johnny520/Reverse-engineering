package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class b43 extends vr2 {

    /* JADX INFO: renamed from: e */
    public final vr2 f556e;

    /* JADX INFO: renamed from: f */
    public final boolean f557f;

    /* JADX INFO: renamed from: g */
    public final boolean f558g;

    /* JADX INFO: renamed from: h */
    public in0 f559h;

    /* JADX INFO: renamed from: i */
    public final long f560i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b43(vr2 vr2Var, in0 in0Var, boolean z, boolean z2) {
        in0 in0VarMo77e;
        super(0L, bs2.f1003l);
        ml2 ml2Var = ds2.f2179a;
        this.f556e = vr2Var;
        this.f557f = z;
        this.f558g = z2;
        this.f559h = ds2.m1127k(in0Var, (vr2Var == null || (in0VarMo77e = vr2Var.mo77e()) == null) ? ds2.f2188j.f12557e : in0VarMo77e, z);
        this.f560i = v93.m5656b();
    }

    @Override // p000.vr2
    /* JADX INFO: renamed from: c */
    public final void mo75c() {
        vr2 vr2Var;
        this.f12148c = true;
        if (!this.f558g || (vr2Var = this.f556e) == null) {
            return;
        }
        vr2Var.mo75c();
    }

    @Override // p000.vr2
    /* JADX INFO: renamed from: d */
    public final bs2 mo76d() {
        return m406v().mo76d();
    }

    @Override // p000.vr2
    /* JADX INFO: renamed from: e */
    public final in0 mo77e() {
        return this.f559h;
    }

    @Override // p000.vr2
    /* JADX INFO: renamed from: f */
    public final boolean mo78f() {
        return m406v().mo78f();
    }

    @Override // p000.vr2
    /* JADX INFO: renamed from: g */
    public final long mo79g() {
        return m406v().mo79g();
    }

    @Override // p000.vr2
    /* JADX INFO: renamed from: i */
    public final in0 mo81i() {
        return null;
    }

    @Override // p000.vr2
    /* JADX INFO: renamed from: k */
    public final void mo82k() {
        p40.m3719b0();
        throw null;
    }

    @Override // p000.vr2
    /* JADX INFO: renamed from: l */
    public final void mo83l() {
        p40.m3719b0();
        throw null;
    }

    @Override // p000.vr2
    /* JADX INFO: renamed from: m */
    public final void mo84m() {
        m406v().mo84m();
    }

    @Override // p000.vr2
    /* JADX INFO: renamed from: n */
    public final void mo85n(pu2 pu2Var) {
        m406v().mo85n(pu2Var);
    }

    @Override // p000.vr2
    /* JADX INFO: renamed from: u */
    public final vr2 mo89u(in0 in0Var) {
        in0 in0VarM1127k = ds2.m1127k(in0Var, this.f559h, true);
        return !this.f557f ? ds2.m1123g(m406v().mo89u(null), in0VarM1127k, true) : m406v().mo89u(in0VarM1127k);
    }

    /* JADX INFO: renamed from: v */
    public final vr2 m406v() {
        vr2 vr2Var = this.f556e;
        return vr2Var == null ? ds2.f2188j : vr2Var;
    }
}
