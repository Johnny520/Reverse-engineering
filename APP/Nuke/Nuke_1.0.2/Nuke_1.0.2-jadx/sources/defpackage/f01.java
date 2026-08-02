package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class f01 extends th1 implements j61, d43 {
    public vd3 v;
    public vd3 w;
    public vd3 x;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.th1
    public final void E0() {
        tb3.c(this, "androidx.compose.foundation.layout.ConsumedInsetsProvider", new a01(this, 1));
        M0();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.th1
    public final void F0() {
        this.w = this.v;
        tb3.e(this, "androidx.compose.foundation.layout.ConsumedInsetsProvider", new a01(this, 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.th1
    public final void G0() {
        this.v = tl.h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void M0() {
        this.w = new z73(this.v, this.x);
        tb3.e(this, "androidx.compose.foundation.layout.ConsumedInsetsProvider", new a01(this, 0));
        gf1.A(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.j61
    public final of1 e(pf1 pf1Var, if1 if1Var, long j) {
        int iA = this.w.a(pf1Var, pf1Var.getLayoutDirection()) - this.v.a(pf1Var, pf1Var.getLayoutDirection());
        int iB = this.w.b(pf1Var) - this.v.b(pf1Var);
        int iC = (this.w.c(pf1Var, pf1Var.getLayoutDirection()) - this.v.c(pf1Var, pf1Var.getLayoutDirection())) + iA;
        int iD = (this.w.d(pf1Var) - this.v.d(pf1Var)) + iB;
        sz1 sz1VarE = if1Var.e(gz.i(-iC, -iD, j));
        return pf1Var.j0(gz.g(j, sz1VarE.h + iC), gz.f(j, sz1VarE.i + iD), ce0.h, new e01(iA, iB, 0, sz1VarE));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.d43
    public final Object r() {
        return "androidx.compose.foundation.layout.ConsumedInsetsProvider";
    }
}
