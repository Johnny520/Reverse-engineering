package p000;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class cv1 extends iv1 {

    /* JADX INFO: renamed from: c */
    public static final cv1 f1746c = new cv1(0, 1, 1);

    @Override // p000.iv1
    /* JADX INFO: renamed from: a */
    public final void mo296a(bo0 bo0Var, InterfaceC0654rf interfaceC0654rf, tr2 tr2Var, z72 z72Var, jv1 jv1Var) {
        b62 b62Var = (b62) bo0Var.m579d(0);
        rk1 rk1Var = z72Var.f13776i;
        ty1 ty1Var = rk1Var != null ? (ty1) rk1Var.m4505g(b62Var) : null;
        if (ty1Var != null) {
            ArrayList arrayList = z72Var.f13777j;
            if (arrayList == null) {
                arrayList = new ArrayList();
                z72Var.f13777j = arrayList;
            }
            arrayList.add(z72Var.f13772e);
            z72Var.f13772e = ty1Var.f11002i;
        }
    }
}
