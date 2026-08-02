package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class xy extends yy {
    public final ka2 e;
    public final ka2 f;
    public final float[] g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public xy(ka2 ka2Var, ka2 ka2Var2) {
        float[] fArrQ;
        super(ka2Var2, ka2Var, ka2Var2, null);
        this.e = ka2Var;
        this.f = ka2Var2;
        float[] fArr = j5.c.b;
        qd3 qd3Var = ka2Var.d;
        float[] fArr2 = ka2Var.i;
        qd3 qd3Var2 = ka2Var2.d;
        float[] fArr3 = ka2Var2.j;
        if (s11.B(qd3Var, qd3Var2)) {
            fArrQ = s11.Q(fArr3, fArr2);
        } else {
            float[] fArrA = qd3Var.a();
            float[] fArrA2 = qd3Var2.a();
            qd3 qd3Var3 = pp0.e;
            fArrQ = s11.Q(s11.B(qd3Var2, qd3Var3) ? fArr3 : s11.N(s11.Q(s11.y(fArr, fArrA2, new float[]{0.964212f, 1.0f, 0.825188f}), ka2Var2.i)), s11.B(qd3Var, qd3Var3) ? fArr2 : s11.Q(s11.y(fArr, fArrA, new float[]{0.964212f, 1.0f, 0.825188f}), fArr2));
        }
        this.g = fArrQ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.yy
    public final long a(long j) {
        float fH = ju.h(j);
        float fG = ju.g(j);
        float fE = ju.e(j);
        float fD = ju.d(j);
        ga2 ga2Var = this.e.p;
        float fE2 = (float) ga2Var.e(fH);
        float fE3 = (float) ga2Var.e(fG);
        float fE4 = (float) ga2Var.e(fE);
        float[] fArr = this.g;
        float f = (fArr[6] * fE4) + (fArr[3] * fE3) + (fArr[0] * fE2);
        float f2 = (fArr[7] * fE4) + (fArr[4] * fE3) + (fArr[1] * fE2);
        float f3 = (fArr[8] * fE4) + (fArr[5] * fE3) + (fArr[2] * fE2);
        ka2 ka2Var = this.f;
        float fE5 = (float) ka2Var.m.e(f);
        ga2 ga2Var2 = ka2Var.m;
        return sp0.a(fE5, (float) ga2Var2.e(f2), (float) ga2Var2.e(f3), fD, ka2Var);
    }
}
