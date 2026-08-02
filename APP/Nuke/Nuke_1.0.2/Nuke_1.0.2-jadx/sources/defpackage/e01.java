package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e01 implements in0 {
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ int j;
    public final /* synthetic */ int k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ e01(int i, int i2, int i3, Object obj) {
        this.h = i3;
        this.i = obj;
        this.j = i;
        this.k = i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.in0
    public final Object j(Object obj) {
        int i = this.h;
        a83 a83Var = a83.a;
        int i2 = this.k;
        int i3 = this.j;
        Object obj2 = this.i;
        switch (i) {
            case 0:
                rz1.g((rz1) obj, (sz1) obj2, i3, i2);
                break;
            case 1:
                rz1.g((rz1) obj, (sz1) obj2, i3, i2);
                break;
            default:
                y9 y9Var = (y9) obj2;
                rw1 rw1Var = (rw1) obj;
                t9 t9Var = rw1Var.a;
                int iD = rw1Var.d(i3);
                int iD2 = rw1Var.d(i2);
                CharSequence charSequence = t9Var.e;
                if (iD < 0 || iD > iD2 || iD2 > charSequence.length()) {
                    StringBuilder sbK = hk1.k("start(", iD, iD2, ") or end(", ") is out of range [0..");
                    sbK.append(charSequence.length());
                    sbK.append("], or start > end!");
                    lz0.a(sbK.toString());
                }
                Path path = new Path();
                w03 w03Var = t9Var.d;
                w03Var.f.getSelectionPath(iD, iD2, path);
                int i4 = w03Var.h;
                if (i4 != 0 && !path.isEmpty()) {
                    path.offset(0.0f, i4);
                }
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(rw1Var.f)) & 4294967295L);
                Matrix matrix = new Matrix();
                matrix.setTranslate(Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)), Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)));
                path.transform(matrix);
                y9Var.a.addPath(path, Float.intBitsToFloat(0), Float.intBitsToFloat(0));
                break;
        }
        return a83Var;
    }
}
