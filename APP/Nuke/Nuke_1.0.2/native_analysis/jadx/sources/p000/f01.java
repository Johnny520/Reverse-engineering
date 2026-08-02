package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class f01 extends th1 implements j61, d43 {

    /* JADX INFO: renamed from: v */
    public vd3 f2708v;

    /* JADX INFO: renamed from: w */
    public vd3 f2709w;

    /* JADX INFO: renamed from: x */
    public vd3 f2710x;

    @Override // p000.th1
    /* JADX INFO: renamed from: E0 */
    public final void mo212E0() {
        tb3.m5157c(this, "androidx.compose.foundation.layout.ConsumedInsetsProvider", new a01(this, 1));
        m1487M0();
    }

    @Override // p000.th1
    /* JADX INFO: renamed from: F0 */
    public final void mo213F0() {
        this.f2709w = this.f2708v;
        tb3.m5159e(this, "androidx.compose.foundation.layout.ConsumedInsetsProvider", new a01(this, 0));
    }

    @Override // p000.th1
    /* JADX INFO: renamed from: G0 */
    public final void mo1486G0() {
        this.f2708v = AbstractC0738tl.f10827h;
    }

    /* JADX INFO: renamed from: M0 */
    public final void m1487M0() {
        this.f2709w = new z73(this.f2708v, this.f2710x);
        tb3.m5159e(this, "androidx.compose.foundation.layout.ConsumedInsetsProvider", new a01(this, 0));
        gf1.m1853A(this);
    }

    @Override // p000.j61
    /* JADX INFO: renamed from: e */
    public final of1 mo1363e(pf1 pf1Var, if1 if1Var, long j) {
        int iMo2197a = this.f2709w.mo2197a(pf1Var, pf1Var.getLayoutDirection()) - this.f2708v.mo2197a(pf1Var, pf1Var.getLayoutDirection());
        int iMo2198b = this.f2709w.mo2198b(pf1Var) - this.f2708v.mo2198b(pf1Var);
        int iMo2199c = (this.f2709w.mo2199c(pf1Var, pf1Var.getLayoutDirection()) - this.f2708v.mo2199c(pf1Var, pf1Var.getLayoutDirection())) + iMo2197a;
        int iMo2200d = (this.f2709w.mo2200d(pf1Var) - this.f2708v.mo2200d(pf1Var)) + iMo2198b;
        sz1 sz1VarMo2340e = if1Var.mo2340e(AbstractC0258gz.m2035i(-iMo2199c, -iMo2200d, j));
        return pf1Var.mo696j0(AbstractC0258gz.m2033g(j, sz1VarMo2340e.f10438h + iMo2199c), AbstractC0258gz.m2032f(j, sz1VarMo2340e.f10439i + iMo2200d), ce0.f1492h, new e01(iMo2197a, iMo2198b, 0, sz1VarMo2340e));
    }

    @Override // p000.d43
    /* JADX INFO: renamed from: r */
    public final Object mo962r() {
        return "androidx.compose.foundation.layout.ConsumedInsetsProvider";
    }
}
