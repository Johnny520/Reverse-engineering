package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ul0 extends u60 implements on2, dq0, gy, os1, d43 {
    public static final eb D = new eb(23);
    public e81 A;
    public zn1 B;
    public final pl0 C;
    public bk1 x;
    public final in0 y;
    public tk0 z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ul0(bk1 bk1Var, int i, e2 e2Var) {
        this.x = bk1Var;
        this.y = e2Var;
        pl0 pl0Var = new pl0(i, new ml0(2, this, ul0.class, "onFocusStateChange", "onFocusStateChange(Landroidx/compose/ui/focus/FocusState;Landroidx/compose/ui/focus/FocusState;)V", 0, 0, 1), 10);
        M0(pl0Var);
        this.C = pl0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.th1
    public final boolean B0() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.th1
    public final void G0() {
        e81 e81Var = this.A;
        if (e81Var != null) {
            e81Var.b();
        }
        this.A = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.os1
    public final void L() {
        o72 o72Var = new o72();
        s11.S(this, new r1(16, o72Var, this));
        e81 e81Var = (e81) o72Var.i;
        if (this.C.R0().a()) {
            e81 e81Var2 = this.A;
            if (e81Var2 != null) {
                e81Var2.b();
            }
            if (e81Var != null) {
                e81Var.a();
            } else {
                e81Var = null;
            }
            this.A = e81Var;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void P0(bk1 bk1Var, j11 j11Var) {
        if (!this.u) {
            bk1Var.b(j11Var);
            return;
        }
        k21 k21Var = (k21) ((s00) A0()).h.o(sn.K);
        p7.A(A0(), null, new b2(bk1Var, j11Var, k21Var != null ? k21Var.t(new d2(13, bk1Var, j11Var)) : null, null, 8), 3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void Q0(bk1 bk1Var) {
        tk0 tk0Var;
        if (t11.l(this.x, bk1Var)) {
            return;
        }
        bk1 bk1Var2 = this.x;
        if (bk1Var2 != null && (tk0Var = this.z) != null) {
            bk1Var2.b(new uk0(tk0Var));
        }
        this.z = null;
        this.x = bk1Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.on2
    public final void l0(zn2 zn2Var) {
        boolean zA = this.C.R0().a();
        v41[] v41VarArr = xn2.a;
        yn2 yn2Var = vn2.l;
        v41 v41Var = xn2.a[4];
        zn2Var.a(yn2Var, Boolean.valueOf(zA));
        zn2Var.a(kn2.w, new q3(null, new r6(0, this, ul0.class, "requestFocus", "requestFocus()Z", 0, 0, 3)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.d43
    public final Object r() {
        return D;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.dq0
    public final void w(zn1 zn1Var) {
        this.B = zn1Var;
        if (this.C.R0().a()) {
            boolean z = zn1Var.S0().u;
            z8 z8Var = vl0.v;
            if (!z) {
                if (this.u) {
                    tb3.a(this, z8Var);
                }
            } else {
                zn1 zn1Var2 = this.B;
                if (zn1Var2 != null && zn1Var2.S0().u && this.u) {
                    tb3.a(this, z8Var);
                }
            }
        }
    }
}
