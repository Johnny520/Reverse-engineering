package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class su1 extends iv1 {

    /* JADX INFO: renamed from: c */
    public static final su1 f10374c = new su1(0, 3, 1);

    @Override // p000.iv1
    /* JADX INFO: renamed from: a */
    public final void mo296a(bo0 bo0Var, InterfaceC0654rf interfaceC0654rf, tr2 tr2Var, z72 z72Var, jv1 jv1Var) {
        dq1 dq1Var;
        qr2 qr2Var = (qr2) bo0Var.m579d(1);
        ao0 ao0Var = (ao0) bo0Var.m579d(0);
        lj0 lj0Var = (lj0) bo0Var.m579d(2);
        tr2 tr2VarM4275d = qr2Var.m4275d();
        if (jv1Var != null) {
            try {
                dq1Var = new dq1(4, jv1Var, tr2Var);
            } catch (Throwable th) {
                tr2VarM4275d.m5414e(false);
                throw th;
            }
        } else {
            dq1Var = null;
        }
        if (!lj0Var.f6145n.m2742W()) {
            AbstractC0752tx.m5443a("FixupList has pending fixup operations that were not realized. Were there mismatched insertNode() and endNodeInsert() calls?");
        }
        lj0Var.f6144m.m2741V(interfaceC0654rf, tr2VarM4275d, z72Var, dq1Var);
        tr2VarM4275d.m5414e(true);
        tr2Var.m5413d();
        ao0Var.getClass();
        tr2Var.m5389A(qr2Var, qr2Var.m4272a(ao0Var));
        tr2Var.m5419k();
    }
}
