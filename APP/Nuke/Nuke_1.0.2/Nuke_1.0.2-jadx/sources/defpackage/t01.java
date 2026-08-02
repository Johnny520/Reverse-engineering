package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class t01 extends e32 {
    public static final t01 c = new t01(f11.a);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.l2
    public final int i(Object obj) {
        int[] iArr = (int[]) obj;
        iArr.getClass();
        return iArr.length;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.au, defpackage.l2
    public final void k(vx vxVar, int i, Object obj) {
        s01 s01Var = (s01) obj;
        s01Var.getClass();
        int iU = vxVar.u(this.b, i);
        s01Var.b(s01Var.d() + 1);
        int[] iArr = s01Var.a;
        int i2 = s01Var.b;
        s01Var.b = i2 + 1;
        iArr[i2] = iU;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.l2
    public final Object l(Object obj) {
        int[] iArr = (int[]) obj;
        iArr.getClass();
        s01 s01Var = new s01();
        s01Var.a = iArr;
        s01Var.b = iArr.length;
        s01Var.b(10);
        return s01Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.e32
    public final Object o() {
        return new int[0];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.e32
    public final void p(wx wxVar, Object obj, int i) {
        int[] iArr = (int[]) obj;
        wxVar.getClass();
        iArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            ((dv2) wxVar).u(i2, iArr[i2], this.b);
        }
    }
}
