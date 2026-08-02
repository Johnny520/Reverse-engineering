package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class dv1 extends iv1 {
    public static final dv1 c = new dv1(1, 0, 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.iv1
    public final void a(bo0 bo0Var, rf rfVar, tr2 tr2Var, z72 z72Var, jv1 jv1Var) {
        int iC = bo0Var.c(0);
        int i = tr2Var.v;
        int iN = tr2Var.N(tr2Var.b, tr2Var.r(i));
        int iG = tr2Var.g(tr2Var.b, tr2Var.r(i + 1));
        for (int iMax = Math.max(iN, iG - iC); iMax < iG; iMax++) {
            Object obj = tr2Var.c[tr2Var.h(iMax)];
            if (obj instanceof lo0) {
                z72Var.e((lo0) obj);
            } else if (obj instanceof b62) {
                ((b62) obj).c();
            }
        }
        if (iC <= 0) {
            tx.a("Check failed");
        }
        int i2 = tr2Var.v;
        int iN2 = tr2Var.N(tr2Var.b, tr2Var.r(i2));
        int iG2 = tr2Var.g(tr2Var.b, tr2Var.r(i2 + 1)) - iC;
        if (iG2 < iN2) {
            tx.a("Check failed");
        }
        tr2Var.J(iG2, iC, i2);
        int i3 = tr2Var.i;
        if (i3 >= iN2) {
            tr2Var.i = i3 - iC;
        }
    }
}
