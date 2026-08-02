package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class sq extends e32 {
    public static final sq c = new sq(vq.a);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.l2
    public final int i(Object obj) {
        char[] cArr = (char[]) obj;
        cArr.getClass();
        return cArr.length;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.au, defpackage.l2
    public final void k(vx vxVar, int i, Object obj) {
        qq qqVar = (qq) obj;
        qqVar.getClass();
        char cL = vxVar.l(this.b, i);
        qqVar.b(qqVar.d() + 1);
        char[] cArr = qqVar.a;
        int i2 = qqVar.b;
        qqVar.b = i2 + 1;
        cArr[i2] = cL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.l2
    public final Object l(Object obj) {
        char[] cArr = (char[]) obj;
        cArr.getClass();
        qq qqVar = new qq();
        qqVar.a = cArr;
        qqVar.b = cArr.length;
        qqVar.b(10);
        return qqVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.e32
    public final Object o() {
        return new char[0];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.e32
    public final void p(wx wxVar, Object obj, int i) {
        char[] cArr = (char[]) obj;
        wxVar.getClass();
        cArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            char c2 = cArr[i2];
            dv2 dv2Var = (dv2) wxVar;
            d32 d32Var = this.b;
            d32Var.getClass();
            dv2Var.s(d32Var, i2);
            dv2Var.o(c2);
        }
    }
}
