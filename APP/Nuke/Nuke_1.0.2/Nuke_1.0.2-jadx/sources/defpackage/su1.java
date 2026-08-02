package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class su1 extends iv1 {
    public static final su1 c = new su1(0, 3, 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.iv1
    public final void a(bo0 bo0Var, rf rfVar, tr2 tr2Var, z72 z72Var, jv1 jv1Var) {
        dq1 dq1Var;
        qr2 qr2Var = (qr2) bo0Var.d(1);
        ao0 ao0Var = (ao0) bo0Var.d(0);
        lj0 lj0Var = (lj0) bo0Var.d(2);
        tr2 tr2VarD = qr2Var.d();
        if (jv1Var != null) {
            try {
                dq1Var = new dq1(4, jv1Var, tr2Var);
            } catch (Throwable th) {
                tr2VarD.e(false);
                throw th;
            }
        } else {
            dq1Var = null;
        }
        if (!lj0Var.n.W()) {
            tx.a("FixupList has pending fixup operations that were not realized. Were there mismatched insertNode() and endNodeInsert() calls?");
        }
        lj0Var.m.V(rfVar, tr2VarD, z72Var, dq1Var);
        tr2VarD.e(true);
        tr2Var.d();
        ao0Var.getClass();
        tr2Var.A(qr2Var, qr2Var.a(ao0Var));
        tr2Var.k();
    }
}
