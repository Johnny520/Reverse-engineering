package defpackage;

import android.view.WindowInsets;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public class je3 extends pe3 {
    public final WindowInsets.Builder e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public je3(cf3 cf3Var) {
        super(cf3Var);
        WindowInsets windowInsetsB = cf3Var.b();
        this.e = windowInsetsB != null ? wq0.i(windowInsetsB) : wq0.h();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.pe3
    public cf3 b() {
        a();
        cf3 cf3VarC = cf3.c(null, this.e.build());
        zz0[] zz0VarArr = this.b;
        ye3 ye3Var = cf3VarC.a;
        ye3Var.w(zz0VarArr);
        ye3Var.v(null);
        ye3Var.B(this.c);
        ye3Var.C(this.d);
        return cf3VarC;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.pe3
    public void e(zz0 zz0Var) {
        this.e.setMandatorySystemGestureInsets(zz0Var.d());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.pe3
    public void f(zz0 zz0Var) {
        this.e.setStableInsets(zz0Var.d());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.pe3
    public void g(zz0 zz0Var) {
        this.e.setSystemGestureInsets(zz0Var.d());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.pe3
    public void h(zz0 zz0Var) {
        this.e.setSystemWindowInsets(zz0Var.d());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.pe3
    public void i(zz0 zz0Var) {
        this.e.setTappableElementInsets(zz0Var.d());
    }

    public je3() {
        this.e = wq0.h();
    }
}
