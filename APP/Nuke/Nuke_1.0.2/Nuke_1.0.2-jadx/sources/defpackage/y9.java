package defpackage;

import android.graphics.Path;
import android.graphics.RectF;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class y9 {
    public final Path a;
    public RectF b;
    public float[] c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public y9(Path path) {
        this.a = path;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void a(y9 y9Var, y9 y9Var2) {
        y9Var.a.addPath(y9Var2.a, Float.intBitsToFloat(0), Float.intBitsToFloat(0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void b(y9 y9Var, db2 db2Var) {
        if (y9Var.b == null) {
            y9Var.b = new RectF();
        }
        RectF rectF = y9Var.b;
        rectF.getClass();
        float f = db2Var.a;
        long j = db2Var.h;
        long j2 = db2Var.g;
        long j3 = db2Var.f;
        long j4 = db2Var.e;
        rectF.set(f, db2Var.b, db2Var.c, db2Var.d);
        if (y9Var.c == null) {
            y9Var.c = new float[8];
        }
        float[] fArr = y9Var.c;
        fArr.getClass();
        fArr[0] = Float.intBitsToFloat((int) (j4 >> 32));
        fArr[1] = Float.intBitsToFloat((int) (j4 & 4294967295L));
        fArr[2] = Float.intBitsToFloat((int) (j3 >> 32));
        fArr[3] = Float.intBitsToFloat((int) (j3 & 4294967295L));
        fArr[4] = Float.intBitsToFloat((int) (j2 >> 32));
        fArr[5] = Float.intBitsToFloat((int) (j2 & 4294967295L));
        fArr[6] = Float.intBitsToFloat((int) (j >> 32));
        fArr[7] = Float.intBitsToFloat((int) (j & 4294967295L));
        Path path = y9Var.a;
        RectF rectF2 = y9Var.b;
        rectF2.getClass();
        float[] fArr2 = y9Var.c;
        fArr2.getClass();
        path.addRoundRect(rectF2, fArr2, aa.b(ux1.h));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void c(float f, float f2, float f3, float f4, float f5, float f6) {
        this.a.cubicTo(f, f2, f3, f4, f5, f6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final o62 d() {
        if (this.b == null) {
            this.b = new RectF();
        }
        RectF rectF = this.b;
        rectF.getClass();
        this.a.computeBounds(rectF, true);
        return new o62(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void e(float f, float f2) {
        this.a.lineTo(f, f2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean f(y9 y9Var, y9 y9Var2, int i) {
        Path.Op op = i == 0 ? Path.Op.DIFFERENCE : i == 1 ? Path.Op.INTERSECT : i == 4 ? Path.Op.REVERSE_DIFFERENCE : i == 2 ? Path.Op.UNION : Path.Op.XOR;
        if (!(y9Var instanceof y9)) {
            c80.t("Unable to obtain android.graphics.Path");
            return false;
        }
        Path path = y9Var.a;
        if (y9Var2 instanceof y9) {
            return this.a.op(path, y9Var2.a, op);
        }
        c80.t("Unable to obtain android.graphics.Path");
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void g() {
        this.a.reset();
    }
}
