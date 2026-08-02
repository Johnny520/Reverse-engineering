package p000;

import android.graphics.Path;
import android.graphics.RectF;

/* JADX INFO: renamed from: y9 */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0915y9 {

    /* JADX INFO: renamed from: a */
    public final Path f13365a;

    /* JADX INFO: renamed from: b */
    public RectF f13366b;

    /* JADX INFO: renamed from: c */
    public float[] f13367c;

    public C0915y9(Path path) {
        this.f13365a = path;
    }

    /* JADX INFO: renamed from: a */
    public static void m6229a(C0915y9 c0915y9, C0915y9 c0915y92) {
        c0915y9.f13365a.addPath(c0915y92.f13365a, Float.intBitsToFloat(0), Float.intBitsToFloat(0));
    }

    /* JADX INFO: renamed from: b */
    public static void m6230b(C0915y9 c0915y9, db2 db2Var) {
        if (c0915y9.f13366b == null) {
            c0915y9.f13366b = new RectF();
        }
        RectF rectF = c0915y9.f13366b;
        rectF.getClass();
        float f = db2Var.f1956a;
        long j = db2Var.f1963h;
        long j2 = db2Var.f1962g;
        long j3 = db2Var.f1961f;
        long j4 = db2Var.f1960e;
        rectF.set(f, db2Var.f1957b, db2Var.f1958c, db2Var.f1959d);
        if (c0915y9.f13367c == null) {
            c0915y9.f13367c = new float[8];
        }
        float[] fArr = c0915y9.f13367c;
        fArr.getClass();
        fArr[0] = Float.intBitsToFloat((int) (j4 >> 32));
        fArr[1] = Float.intBitsToFloat((int) (j4 & 4294967295L));
        fArr[2] = Float.intBitsToFloat((int) (j3 >> 32));
        fArr[3] = Float.intBitsToFloat((int) (j3 & 4294967295L));
        fArr[4] = Float.intBitsToFloat((int) (j2 >> 32));
        fArr[5] = Float.intBitsToFloat((int) (j2 & 4294967295L));
        fArr[6] = Float.intBitsToFloat((int) (j >> 32));
        fArr[7] = Float.intBitsToFloat((int) (j & 4294967295L));
        Path path = c0915y9.f13365a;
        RectF rectF2 = c0915y9.f13366b;
        rectF2.getClass();
        float[] fArr2 = c0915y9.f13367c;
        fArr2.getClass();
        path.addRoundRect(rectF2, fArr2, AbstractC0011aa.m118b(ux1.f11544h));
    }

    /* JADX INFO: renamed from: c */
    public final void m6231c(float f, float f2, float f3, float f4, float f5, float f6) {
        this.f13365a.cubicTo(f, f2, f3, f4, f5, f6);
    }

    /* JADX INFO: renamed from: d */
    public final o62 m6232d() {
        if (this.f13366b == null) {
            this.f13366b = new RectF();
        }
        RectF rectF = this.f13366b;
        rectF.getClass();
        this.f13365a.computeBounds(rectF, true);
        return new o62(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    /* JADX INFO: renamed from: e */
    public final void m6233e(float f, float f2) {
        this.f13365a.lineTo(f, f2);
    }

    /* JADX INFO: renamed from: f */
    public final boolean m6234f(C0915y9 c0915y9, C0915y9 c0915y92, int i) {
        Path.Op op = i == 0 ? Path.Op.DIFFERENCE : i == 1 ? Path.Op.INTERSECT : i == 4 ? Path.Op.REVERSE_DIFFERENCE : i == 2 ? Path.Op.UNION : Path.Op.XOR;
        if (!(c0915y9 instanceof C0915y9)) {
            c80.m676t("Unable to obtain android.graphics.Path");
            return false;
        }
        Path path = c0915y9.f13365a;
        if (c0915y92 instanceof C0915y9) {
            return this.f13365a.op(path, c0915y92.f13365a, op);
        }
        c80.m676t("Unable to obtain android.graphics.Path");
        return false;
    }

    /* JADX INFO: renamed from: g */
    public final void m6235g() {
        this.f13365a.reset();
    }
}
