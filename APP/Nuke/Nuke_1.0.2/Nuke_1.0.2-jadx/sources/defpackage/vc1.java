package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class vc1 extends e32 {
    public static final vc1 c = new vc1(ed1.a);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.l2
    public final int i(Object obj) {
        long[] jArr = (long[]) obj;
        jArr.getClass();
        return jArr.length;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.au, defpackage.l2
    public final void k(vx vxVar, int i, Object obj) {
        uc1 uc1Var = (uc1) obj;
        uc1Var.getClass();
        long jZ = vxVar.z(this.b, i);
        uc1Var.b(uc1Var.d() + 1);
        long[] jArr = uc1Var.a;
        int i2 = uc1Var.b;
        uc1Var.b = i2 + 1;
        jArr[i2] = jZ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.l2
    public final Object l(Object obj) {
        long[] jArr = (long[]) obj;
        jArr.getClass();
        uc1 uc1Var = new uc1();
        uc1Var.a = jArr;
        uc1Var.b = jArr.length;
        uc1Var.b(10);
        return uc1Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.e32
    public final Object o() {
        return new long[0];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.e32
    public final void p(wx wxVar, Object obj, int i) {
        long[] jArr = (long[]) obj;
        wxVar.getClass();
        jArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            ((dv2) wxVar).v(this.b, i2, jArr[i2]);
        }
    }
}
