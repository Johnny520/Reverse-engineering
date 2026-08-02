package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class nl0 extends u60 implements os1, gy {
    public final pl0 x;
    public e81 y;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public nl0() {
        pl0 pl0Var = new pl0(0, new ml0(2, this, nl0.class, "onFocusStateChange", "onFocusStateChange(Landroidx/compose/ui/focus/FocusState;Landroidx/compose/ui/focus/FocusState;)V", 0, 0, 0), 9);
        M0(pl0Var);
        this.x = pl0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.os1
    public final void L() {
        o72 o72Var = new o72();
        s11.S(this, new t6(4, o72Var, this));
        e81 e81Var = (e81) o72Var.i;
        if (this.x.R0().a()) {
            e81 e81Var2 = this.y;
            if (e81Var2 != null) {
                e81Var2.b();
            }
            if (e81Var != null) {
                e81Var.a();
            } else {
                e81Var = null;
            }
            this.y = e81Var;
        }
    }
}
