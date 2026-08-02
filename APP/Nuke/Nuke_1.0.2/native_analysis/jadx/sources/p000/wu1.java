package p000;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class wu1 extends iv1 {

    /* JADX INFO: renamed from: c */
    public static final wu1 f12652c = new wu1(0, 1, 1);

    @Override // p000.iv1
    /* JADX INFO: renamed from: a */
    public final void mo296a(bo0 bo0Var, InterfaceC0654rf interfaceC0654rf, tr2 tr2Var, z72 z72Var, jv1 jv1Var) {
        b62 b62Var = (b62) bo0Var.m579d(0);
        Set set = z72Var.f13768a;
        if (set == null) {
            return;
        }
        ty1 ty1Var = new ty1(set);
        rk1 rk1Var = z72Var.f13776i;
        if (rk1Var == null) {
            long[] jArr = ed2.f2401a;
            rk1Var = new rk1();
            z72Var.f13776i = rk1Var;
        }
        rk1Var.m4511m(b62Var, ty1Var);
        z72Var.f13772e.m6423b(new lo0(ty1Var, -1));
    }
}
