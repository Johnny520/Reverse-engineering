package defpackage;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class wu1 extends iv1 {
    public static final wu1 c = new wu1(0, 1, 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.iv1
    public final void a(bo0 bo0Var, rf rfVar, tr2 tr2Var, z72 z72Var, jv1 jv1Var) {
        b62 b62Var = (b62) bo0Var.d(0);
        Set set = z72Var.a;
        if (set == null) {
            return;
        }
        ty1 ty1Var = new ty1(set);
        rk1 rk1Var = z72Var.i;
        if (rk1Var == null) {
            long[] jArr = ed2.a;
            rk1Var = new rk1();
            z72Var.i = rk1Var;
        }
        rk1Var.m(b62Var, ty1Var);
        z72Var.e.b(new lo0(ty1Var, -1));
    }
}
