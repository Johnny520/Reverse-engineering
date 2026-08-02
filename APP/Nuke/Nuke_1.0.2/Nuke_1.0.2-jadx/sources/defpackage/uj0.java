package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class uj0 extends e32 {
    public static final uj0 c = new uj0(vj0.a);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.l2
    public final int i(Object obj) {
        float[] fArr = (float[]) obj;
        fArr.getClass();
        return fArr.length;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.au, defpackage.l2
    public final void k(vx vxVar, int i, Object obj) {
        tj0 tj0Var = (tj0) obj;
        tj0Var.getClass();
        float fI = vxVar.i(this.b, i);
        tj0Var.b(tj0Var.d() + 1);
        float[] fArr = tj0Var.a;
        int i2 = tj0Var.b;
        tj0Var.b = i2 + 1;
        fArr[i2] = fI;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.l2
    public final Object l(Object obj) {
        float[] fArr = (float[]) obj;
        fArr.getClass();
        tj0 tj0Var = new tj0();
        tj0Var.a = fArr;
        tj0Var.b = fArr.length;
        tj0Var.b(10);
        return tj0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.e32
    public final Object o() {
        return new float[0];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.e32
    public final void p(wx wxVar, Object obj, int i) {
        float[] fArr = (float[]) obj;
        wxVar.getClass();
        fArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            float f = fArr[i2];
            dv2 dv2Var = (dv2) wxVar;
            d32 d32Var = this.b;
            d32Var.getClass();
            dv2Var.s(d32Var, i2);
            dv2Var.m(f);
        }
    }
}
