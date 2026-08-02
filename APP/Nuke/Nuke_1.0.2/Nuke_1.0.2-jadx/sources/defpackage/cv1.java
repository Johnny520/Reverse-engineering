package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class cv1 extends iv1 {
    public static final cv1 c = new cv1(0, 1, 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.iv1
    public final void a(bo0 bo0Var, rf rfVar, tr2 tr2Var, z72 z72Var, jv1 jv1Var) {
        b62 b62Var = (b62) bo0Var.d(0);
        rk1 rk1Var = z72Var.i;
        ty1 ty1Var = rk1Var != null ? (ty1) rk1Var.g(b62Var) : null;
        if (ty1Var != null) {
            ArrayList arrayList = z72Var.j;
            if (arrayList == null) {
                arrayList = new ArrayList();
                z72Var.j = arrayList;
            }
            arrayList.add(z72Var.e);
            z72Var.e = ty1Var.i;
        }
    }
}
