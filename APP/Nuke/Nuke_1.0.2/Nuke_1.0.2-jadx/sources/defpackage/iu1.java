package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class iu1 extends iv1 {
    public static final iu1 c = new iu1(0, 2, 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.iv1
    public final void a(bo0 bo0Var, rf rfVar, tr2 tr2Var, z72 z72Var, jv1 jv1Var) {
        int i;
        e11 e11Var = (e11) bo0Var.d(0);
        int iC = tr2Var.c((ao0) bo0Var.d(1));
        if (tr2Var.t >= iC) {
            tx.a("Check failed");
        }
        xe1.g0(tr2Var, rfVar, iC);
        int i2 = tr2Var.t;
        int iE = tr2Var.v;
        while (iE >= 0 && !tr2Var.y(iE)) {
            iE = tr2Var.E(tr2Var.b, iE);
        }
        int iU = iE + 1;
        int iL = 0;
        while (iU < i2) {
            if (tr2Var.v(i2, iU)) {
                if (tr2Var.y(iU)) {
                    iL = 0;
                }
                iU++;
            } else {
                iL += tr2Var.y(iU) ? 1 : tr2Var.b[(tr2Var.r(iU) * 5) + 1] & 67108863;
                iU += tr2Var.u(iU);
            }
        }
        while (true) {
            i = tr2Var.t;
            if (i >= iC) {
                break;
            }
            if (tr2Var.v(iC, i)) {
                int i3 = tr2Var.t;
                if (i3 < tr2Var.u && (tr2Var.b[(tr2Var.r(i3) * 5) + 1] & 1073741824) != 0) {
                    rfVar.b(tr2Var.D(tr2Var.t));
                    iL = 0;
                }
                tr2Var.P();
            } else {
                iL += tr2Var.L();
            }
        }
        if (i != iC) {
            tx.a("Check failed");
        }
        e11Var.a = iL;
    }
}
