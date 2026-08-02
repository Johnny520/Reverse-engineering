package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class q73 extends e32 {
    public static final q73 c = new q73(r73.a);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.l2
    public final int i(Object obj) {
        return ((o73) obj).h.length;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.au, defpackage.l2
    public final void k(vx vxVar, int i, Object obj) {
        p73 p73Var = (p73) obj;
        p73Var.getClass();
        short sV = vxVar.e(this.b, i).v();
        p73Var.b(p73Var.d() + 1);
        short[] sArr = p73Var.a;
        int i2 = p73Var.b;
        p73Var.b = i2 + 1;
        sArr[i2] = sV;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.l2
    public final Object l(Object obj) {
        short[] sArr = ((o73) obj).h;
        p73 p73Var = new p73();
        p73Var.a = sArr;
        p73Var.b = sArr.length;
        p73Var.b(10);
        return p73Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.e32
    public final Object o() {
        return new o73(new short[0]);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.e32
    public final void p(wx wxVar, Object obj, int i) {
        short[] sArr = ((o73) obj).h;
        wxVar.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            ((dv2) wxVar).t(this.b, i2).g(sArr[i2]);
        }
    }
}
