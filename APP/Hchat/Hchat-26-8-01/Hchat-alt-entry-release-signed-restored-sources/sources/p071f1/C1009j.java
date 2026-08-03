package p071f1;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import p057e1.C0808c;
import p057e1.C0809d;
import p136j8.C2104o;

/* JADX INFO: renamed from: f1.j */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1009j {

    /* JADX INFO: renamed from: a */
    public final Path f3191a;

    /* JADX INFO: renamed from: b */
    public RectF f3192b;

    /* JADX INFO: renamed from: c */
    public float[] f3193c;

    /* JADX INFO: renamed from: d */
    public Matrix f3194d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1009j(Path path) {
        this.f3191a = path;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static void m2599a(C1009j c1009j, C1009j c1009j2) {
        Path path = c1009j.f3191a;
        if (c1009j2 instanceof C1009j) {
            path.addPath(c1009j2.f3191a, Float.intBitsToFloat((int) 0), Float.intBitsToFloat((int) 0));
        } else {
            C2104o.m5297w("Unable to obtain android.graphics.Path");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static void m2600b(C1009j c1009j, C0808c c0808c) {
        c1009j.getClass();
        float f3 = c0808c.f2416a;
        float f10 = c0808c.f2419d;
        float f11 = c0808c.f2418c;
        float f12 = c0808c.f2417b;
        if (Float.isNaN(f3) || Float.isNaN(f12) || Float.isNaN(f11) || Float.isNaN(f10)) {
            AbstractC1013l.m2610b("Invalid rectangle, make sure no value is NaN");
        }
        if (c1009j.f3192b == null) {
            c1009j.f3192b = new RectF();
        }
        RectF rectF = c1009j.f3192b;
        rectF.getClass();
        rectF.set(f3, f12, f11, f10);
        Path path = c1009j.f3191a;
        RectF rectF2 = c1009j.f3192b;
        rectF2.getClass();
        path.addRect(rectF2, Path.Direction.CCW);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static void m2601c(C1009j c1009j, C0809d c0809d) {
        if (c1009j.f3192b == null) {
            c1009j.f3192b = new RectF();
        }
        RectF rectF = c1009j.f3192b;
        rectF.getClass();
        float f3 = c0809d.f2420a;
        long j3 = c0809d.f2427h;
        long j4 = c0809d.f2426g;
        long j5 = c0809d.f2425f;
        long j10 = c0809d.f2424e;
        rectF.set(f3, c0809d.f2421b, c0809d.f2422c, c0809d.f2423d);
        if (c1009j.f3193c == null) {
            c1009j.f3193c = new float[8];
        }
        float[] fArr = c1009j.f3193c;
        fArr.getClass();
        fArr[0] = Float.intBitsToFloat((int) (j10 >> 32));
        fArr[1] = Float.intBitsToFloat((int) (j10 & 4294967295L));
        fArr[2] = Float.intBitsToFloat((int) (j5 >> 32));
        fArr[3] = Float.intBitsToFloat((int) (j5 & 4294967295L));
        fArr[4] = Float.intBitsToFloat((int) (j4 >> 32));
        fArr[5] = Float.intBitsToFloat((int) (j4 & 4294967295L));
        fArr[6] = Float.intBitsToFloat((int) (j3 >> 32));
        fArr[7] = Float.intBitsToFloat((int) (j3 & 4294967295L));
        Path path = c1009j.f3191a;
        RectF rectF2 = c1009j.f3192b;
        rectF2.getClass();
        float[] fArr2 = c1009j.f3193c;
        fArr2.getClass();
        path.addRoundRect(rectF2, fArr2, Path.Direction.CCW);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final void m2602d(float f3, float f10, float f11, float f12, float f13, float f14) {
        this.f3191a.cubicTo(f3, f10, f11, f12, f13, f14);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final C0808c m2603e() {
        if (this.f3192b == null) {
            this.f3192b = new RectF();
        }
        RectF rectF = this.f3192b;
        rectF.getClass();
        this.f3191a.computeBounds(rectF, true);
        return new C0808c(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final void m2604f(float f3, float f10) {
        this.f3191a.lineTo(f3, f10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final boolean m2605g(C1009j c1009j, C1009j c1009j2, int i9) {
        Path.Op op = i9 == 0 ? Path.Op.DIFFERENCE : i9 == 1 ? Path.Op.INTERSECT : i9 == 4 ? Path.Op.REVERSE_DIFFERENCE : i9 == 2 ? Path.Op.UNION : Path.Op.XOR;
        if (!(c1009j instanceof C1009j)) {
            C2104o.m5297w("Unable to obtain android.graphics.Path");
            return false;
        }
        Path path = c1009j.f3191a;
        if (c1009j2 instanceof C1009j) {
            return this.f3191a.op(path, c1009j2.f3191a, op);
        }
        C2104o.m5297w("Unable to obtain android.graphics.Path");
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public final void m2606h() {
        this.f3191a.reset();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public final void m2607i(long j3) {
        Matrix matrix = this.f3194d;
        if (matrix == null) {
            this.f3194d = new Matrix();
        } else {
            matrix.reset();
        }
        Matrix matrix2 = this.f3194d;
        matrix2.getClass();
        matrix2.setTranslate(Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (j3 & 4294967295L)));
        Matrix matrix3 = this.f3194d;
        matrix3.getClass();
        this.f3191a.transform(matrix3);
    }
}
