package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class bo extends e32 {
    public static final bo c = new bo(mo.a);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.l2
    public final int i(Object obj) {
        byte[] bArr = (byte[]) obj;
        bArr.getClass();
        return bArr.length;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.au, defpackage.l2
    public final void k(vx vxVar, int i, Object obj) {
        zn znVar = (zn) obj;
        znVar.getClass();
        byte bM = vxVar.m(this.b, i);
        znVar.b(znVar.d() + 1);
        byte[] bArr = znVar.a;
        int i2 = znVar.b;
        znVar.b = i2 + 1;
        bArr[i2] = bM;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.l2
    public final Object l(Object obj) {
        byte[] bArr = (byte[]) obj;
        bArr.getClass();
        zn znVar = new zn();
        znVar.a = bArr;
        znVar.b = bArr.length;
        znVar.b(10);
        return znVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.e32
    public final Object o() {
        return new byte[0];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.e32
    public final void p(wx wxVar, Object obj, int i) {
        byte[] bArr = (byte[]) obj;
        wxVar.getClass();
        bArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            byte b = bArr[i2];
            dv2 dv2Var = (dv2) wxVar;
            d32 d32Var = this.b;
            d32Var.getClass();
            dv2Var.s(d32Var, i2);
            dv2Var.i(b);
        }
    }
}
