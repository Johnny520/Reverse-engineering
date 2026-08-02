package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class l73 extends e32 {
    public static final l73 c = new l73(m73.a);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.l2
    public final int i(Object obj) {
        return ((j73) obj).h.length;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.au, defpackage.l2
    public final void k(vx vxVar, int i, Object obj) {
        k73 k73Var = (k73) obj;
        k73Var.getClass();
        long jD = vxVar.e(this.b, i).d();
        k73Var.b(k73Var.d() + 1);
        long[] jArr = k73Var.a;
        int i2 = k73Var.b;
        k73Var.b = i2 + 1;
        jArr[i2] = jD;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.l2
    public final Object l(Object obj) {
        long[] jArr = ((j73) obj).h;
        k73 k73Var = new k73();
        k73Var.a = jArr;
        k73Var.b = jArr.length;
        k73Var.b(10);
        return k73Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.e32
    public final Object o() {
        return new j73(new long[0]);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.e32
    public final void p(wx wxVar, Object obj, int i) {
        long[] jArr = ((j73) obj).h;
        wxVar.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            ((dv2) wxVar).t(this.b, i2).n(jArr[i2]);
        }
    }
}
