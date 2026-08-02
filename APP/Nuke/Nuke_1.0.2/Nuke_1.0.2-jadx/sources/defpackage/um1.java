package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
final class um1 extends yh1 {
    public final tm1 a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public um1(tm1 tm1Var) {
        this.a = tm1Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        return (obj instanceof um1) && ((um1) obj).a == this.a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.yh1
    public final th1 f() {
        return new xm1(op0.a, this.a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.yh1
    public final void g(th1 th1Var) {
        xm1 xm1Var = (xm1) th1Var;
        xm1Var.v = op0.a;
        tm1 tm1Var = xm1Var.w;
        if (tm1Var.a == xm1Var) {
            tm1Var.a = null;
        }
        tm1 tm1Var2 = this.a;
        if (tm1Var2 != tm1Var) {
            xm1Var.w = tm1Var2;
        }
        if (xm1Var.u) {
            tm1 tm1Var3 = xm1Var.w;
            tm1Var3.a = xm1Var;
            tm1Var3.b = null;
            xm1Var.x = null;
            tm1Var3.c = new ea(17, xm1Var);
            tm1Var3.d = xm1Var.A0();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.a.hashCode() + (op0.a.hashCode() * 31);
    }
}
