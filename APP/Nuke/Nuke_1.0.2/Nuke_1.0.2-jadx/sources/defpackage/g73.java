package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class g73 extends e32 {
    public static final g73 c = new g73(h73.a);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.l2
    public final int i(Object obj) {
        return ((e73) obj).h.length;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.au, defpackage.l2
    public final void k(vx vxVar, int i, Object obj) {
        f73 f73Var = (f73) obj;
        f73Var.getClass();
        int iO = vxVar.e(this.b, i).o();
        f73Var.b(f73Var.d() + 1);
        int[] iArr = f73Var.a;
        int i2 = f73Var.b;
        f73Var.b = i2 + 1;
        iArr[i2] = iO;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.l2
    public final Object l(Object obj) {
        int[] iArr = ((e73) obj).h;
        f73 f73Var = new f73();
        f73Var.a = iArr;
        f73Var.b = iArr.length;
        f73Var.b(10);
        return f73Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.e32
    public final Object o() {
        return new e73(new int[0]);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.e32
    public final void p(wx wxVar, Object obj, int i) {
        int[] iArr = ((e73) obj).h;
        wxVar.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            ((dv2) wxVar).t(this.b, i2).l(iArr[i2]);
        }
    }
}
