package defpackage;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ee1 extends yh1 {
    public final gp1 a;
    public final f03 b;
    public final f02 c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ee1(gp1 gp1Var, f03 f03Var, f02 f02Var) {
        this.a = gp1Var;
        this.b = f03Var;
        this.c = f02Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        return this == obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.yh1
    public final th1 f() {
        return new ge1(this.a, this.b, this.c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.yh1
    public final void g(th1 th1Var) {
        ge1 ge1Var = (ge1) th1Var;
        ge1Var.getClass();
        f02 f02Var = ge1Var.x;
        View view = ge1Var.y;
        e70 e70Var = ge1Var.z;
        ge1Var.v = this.a;
        ge1Var.w = this.b;
        f02 f02Var2 = this.c;
        ge1Var.x = f02Var2;
        View viewH = tp0.H(ge1Var);
        e70 e70Var2 = sp0.c0(ge1Var).F;
        if (ge1Var.A != null) {
            yn2 yn2Var = he1.a;
            if (((!Float.isNaN(Float.NaN) || !Float.isNaN(Float.NaN)) && !f02Var2.a()) || !za0.b(Float.NaN, Float.NaN) || !za0.b(Float.NaN, Float.NaN) || !f02Var2.equals(f02Var) || !viewH.equals(view) || !t11.l(e70Var2, e70Var)) {
                ge1Var.N0();
            }
        }
        ge1Var.O0();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + hk1.d(vi0.c(Float.NaN, vi0.c(Float.NaN, hk1.c(hk1.d(vi0.c(Float.NaN, this.a.hashCode() * 961, 31), 31, true), 31, 9205357640488583168L), 31), 31), 31, true)) * 31);
    }
}
