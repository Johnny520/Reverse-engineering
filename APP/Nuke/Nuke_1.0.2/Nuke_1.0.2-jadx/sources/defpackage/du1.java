package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class du1 extends iv1 {
    public static final du1 c = new du1(0, 2, 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.iv1
    public final void a(bo0 bo0Var, rf rfVar, tr2 tr2Var, z72 z72Var, jv1 jv1Var) {
        ao0 ao0Var = (ao0) bo0Var.d(0);
        Object objD = bo0Var.d(1);
        if (objD instanceof lo0) {
            lo0 lo0Var = (lo0) objD;
            z72Var.e.b(lo0Var);
            z72Var.d.a(lo0Var);
        }
        if (tr2Var.n != 0) {
            tx.a("Can only append a slot if not current inserting");
        }
        int i = tr2Var.i;
        int i2 = tr2Var.j;
        int iC = tr2Var.c(ao0Var);
        int iG = tr2Var.g(tr2Var.b, tr2Var.r(iC + 1));
        tr2Var.i = iG;
        tr2Var.j = iG;
        tr2Var.x(1, iC);
        if (i >= iG) {
            i++;
            i2++;
        }
        tr2Var.c[iG] = objD;
        tr2Var.i = i;
        tr2Var.j = i2;
    }
}
