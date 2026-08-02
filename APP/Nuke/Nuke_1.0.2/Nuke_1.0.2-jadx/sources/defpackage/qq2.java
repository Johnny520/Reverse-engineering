package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class qq2 extends e32 {
    public static final qq2 c = new qq2(rq2.a);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.l2
    public final int i(Object obj) {
        short[] sArr = (short[]) obj;
        sArr.getClass();
        return sArr.length;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.au, defpackage.l2
    public final void k(vx vxVar, int i, Object obj) {
        pq2 pq2Var = (pq2) obj;
        pq2Var.getClass();
        short sP = vxVar.p(this.b, i);
        pq2Var.b(pq2Var.d() + 1);
        short[] sArr = pq2Var.a;
        int i2 = pq2Var.b;
        pq2Var.b = i2 + 1;
        sArr[i2] = sP;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.l2
    public final Object l(Object obj) {
        short[] sArr = (short[]) obj;
        sArr.getClass();
        pq2 pq2Var = new pq2();
        pq2Var.a = sArr;
        pq2Var.b = sArr.length;
        pq2Var.b(10);
        return pq2Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.e32
    public final Object o() {
        return new short[0];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.e32
    public final void p(wx wxVar, Object obj, int i) {
        short[] sArr = (short[]) obj;
        wxVar.getClass();
        sArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            short s = sArr[i2];
            dv2 dv2Var = (dv2) wxVar;
            d32 d32Var = this.b;
            d32Var.getClass();
            dv2Var.s(d32Var, i2);
            dv2Var.g(s);
        }
    }
}
