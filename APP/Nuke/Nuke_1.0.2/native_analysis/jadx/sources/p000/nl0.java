package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class nl0 extends u60 implements os1, InterfaceC0257gy {

    /* JADX INFO: renamed from: x */
    public final pl0 f7212x;

    /* JADX INFO: renamed from: y */
    public e81 f7213y;

    public nl0() {
        pl0 pl0Var = new pl0(0, new ml0(2, this, nl0.class, "onFocusStateChange", "onFocusStateChange(Landroidx/compose/ui/focus/FocusState;Landroidx/compose/ui/focus/FocusState;)V", 0, 0, 0), 9);
        m5468M0(pl0Var);
        this.f7212x = pl0Var;
    }

    @Override // p000.os1
    /* JADX INFO: renamed from: L */
    public final void mo1847L() {
        o72 o72Var = new o72();
        s11.m4674S(this, new C0723t6(4, o72Var, this));
        e81 e81Var = (e81) o72Var.f7574i;
        if (this.f7212x.m3876R0().m2718a()) {
            e81 e81Var2 = this.f7213y;
            if (e81Var2 != null) {
                e81Var2.m1292b();
            }
            if (e81Var != null) {
                e81Var.m1291a();
            } else {
                e81Var = null;
            }
            this.f7213y = e81Var;
        }
    }
}
