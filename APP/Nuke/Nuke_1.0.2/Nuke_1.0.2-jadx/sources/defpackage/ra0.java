package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ra0 extends e32 {
    public static final ra0 c = new ra0(ta0.a);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.l2
    public final int i(Object obj) {
        double[] dArr = (double[]) obj;
        dArr.getClass();
        return dArr.length;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.au, defpackage.l2
    public final void k(vx vxVar, int i, Object obj) {
        qa0 qa0Var = (qa0) obj;
        qa0Var.getClass();
        double dK = vxVar.k(this.b, i);
        qa0Var.b(qa0Var.d() + 1);
        double[] dArr = qa0Var.a;
        int i2 = qa0Var.b;
        qa0Var.b = i2 + 1;
        dArr[i2] = dK;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.l2
    public final Object l(Object obj) {
        double[] dArr = (double[]) obj;
        dArr.getClass();
        qa0 qa0Var = new qa0();
        qa0Var.a = dArr;
        qa0Var.b = dArr.length;
        qa0Var.b(10);
        return qa0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.e32
    public final Object o() {
        return new double[0];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.e32
    public final void p(wx wxVar, Object obj, int i) {
        double[] dArr = (double[]) obj;
        wxVar.getClass();
        dArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            double d = dArr[i2];
            dv2 dv2Var = (dv2) wxVar;
            d32 d32Var = this.b;
            d32Var.getClass();
            dv2Var.s(d32Var, i2);
            dv2Var.f(d);
        }
    }
}
