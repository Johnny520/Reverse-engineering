package defpackage;

import kotlin.UByteArray;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class u63 extends e32 {
    public static final u63 c = new u63(v63.a);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.l2
    public final int i(Object obj) {
        return ((UByteArray) obj).h.length;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.au, defpackage.l2
    public final void k(vx vxVar, int i, Object obj) {
        t63 t63Var = (t63) obj;
        t63Var.getClass();
        byte bR = vxVar.e(this.b, i).r();
        t63Var.b(t63Var.d() + 1);
        byte[] bArr = t63Var.a;
        int i2 = t63Var.b;
        t63Var.b = i2 + 1;
        bArr[i2] = bR;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.l2
    public final Object l(Object obj) {
        byte[] bArr = ((UByteArray) obj).h;
        t63 t63Var = new t63();
        t63Var.a = bArr;
        t63Var.b = bArr.length;
        t63Var.b(10);
        return t63Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.e32
    public final Object o() {
        return new UByteArray(new byte[0]);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.e32
    public final void p(wx wxVar, Object obj, int i) {
        byte[] bArr = ((UByteArray) obj).h;
        wxVar.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            ((dv2) wxVar).t(this.b, i2).i(bArr[i2]);
        }
    }
}
