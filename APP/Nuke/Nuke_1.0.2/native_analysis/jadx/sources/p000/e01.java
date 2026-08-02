package p000;

import android.graphics.Matrix;
import android.graphics.Path;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e01 implements in0 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f2283h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f2284i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f2285j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ int f2286k;

    public /* synthetic */ e01(int i, int i2, int i3, Object obj) {
        this.f2283h = i3;
        this.f2284i = obj;
        this.f2285j = i;
        this.f2286k = i2;
    }

    @Override // p000.in0
    /* JADX INFO: renamed from: j */
    public final Object mo5j(Object obj) {
        int i = this.f2283h;
        a83 a83Var = a83.f116a;
        int i2 = this.f2286k;
        int i3 = this.f2285j;
        Object obj2 = this.f2284i;
        switch (i) {
            case 0:
                rz1.m4639g((rz1) obj, (sz1) obj2, i3, i2);
                break;
            case 1:
                rz1.m4639g((rz1) obj, (sz1) obj2, i3, i2);
                break;
            default:
                C0915y9 c0915y9 = (C0915y9) obj2;
                rw1 rw1Var = (rw1) obj;
                C0726t9 c0726t9 = rw1Var.f9775a;
                int iM4623d = rw1Var.m4623d(i3);
                int iM4623d2 = rw1Var.m4623d(i2);
                CharSequence charSequence = c0726t9.f10617e;
                if (iM4623d < 0 || iM4623d > iM4623d2 || iM4623d2 > charSequence.length()) {
                    StringBuilder sbM2212k = hk1.m2212k("start(", iM4623d, iM4623d2, ") or end(", ") is out of range [0..");
                    sbM2212k.append(charSequence.length());
                    sbM2212k.append("], or start > end!");
                    lz0.m2988a(sbM2212k.toString());
                }
                Path path = new Path();
                w03 w03Var = c0726t9.f10616d;
                w03Var.f12246f.getSelectionPath(iM4623d, iM4623d2, path);
                int i4 = w03Var.f12248h;
                if (i4 != 0 && !path.isEmpty()) {
                    path.offset(0.0f, i4);
                }
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(rw1Var.f9780f)) & 4294967295L);
                Matrix matrix = new Matrix();
                matrix.setTranslate(Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)), Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)));
                path.transform(matrix);
                c0915y9.f13365a.addPath(path, Float.intBitsToFloat(0), Float.intBitsToFloat(0));
                break;
        }
        return a83Var;
    }
}
