package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class m91 extends th1 implements gy, dq0 {
    public l9 v;
    public t91 w;
    public b03 x;
    public final nx1 y = op0.u(null);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public m91(l9 l9Var, t91 t91Var, b03 b03Var) {
        this.v = l9Var;
        this.w = t91Var;
        this.x = b03Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.th1
    public final void E0() {
        l9 l9Var = this.v;
        if (l9Var.a != null) {
            nz0.c("Expected textInputModifierNode to be null");
        }
        l9Var.a = this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.th1
    public final void F0() {
        this.v.k(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.dq0
    public final void w(zn1 zn1Var) {
        this.y.setValue(zn1Var);
    }
}
