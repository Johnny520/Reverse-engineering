package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class eu1 extends iv1 {
    public static final eu1 c = new eu1(0, 2, 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.iv1
    public final void a(bo0 bo0Var, rf rfVar, tr2 tr2Var, z72 z72Var, jv1 jv1Var) {
        e11 e11Var = (e11) bo0Var.d(1);
        int i = e11Var != null ? e11Var.a : 0;
        dq dqVar = (dq) bo0Var.d(0);
        if (i > 0) {
            rfVar = new ko(rfVar, i);
        }
        dqVar.b0(rfVar, tr2Var, z72Var, jv1Var != null ? new dq1(4, jv1Var, tr2Var) : null);
    }
}
