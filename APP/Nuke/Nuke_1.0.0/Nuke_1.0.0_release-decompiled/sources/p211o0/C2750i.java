package p211o0;

import android.graphics.Path;
import android.graphics.RectF;
import p117X2.AbstractC1665j;
import p204n0.C2684c;
import p204n0.C2685d;

/* JADX INFO: renamed from: o0.i */
/* JADX INFO: loaded from: classes.dex */
public final class C2750i {

    /* JADX INFO: renamed from: a */
    public final Path f8742a;

    /* JADX INFO: renamed from: b */
    public RectF f8743b;

    /* JADX INFO: renamed from: c */
    public float[] f8744c;

    public C2750i(Path path) {
        this.f8742a = path;
    }

    /* JADX INFO: renamed from: a */
    public static void m4877a(C2750i c2750i, C2750i c2750i2) {
        c2750i.f8742a.addPath(c2750i2.f8742a, Float.intBitsToFloat((int) 0), Float.intBitsToFloat((int) 0));
    }

    /* JADX INFO: renamed from: b */
    public static void m4878b(C2750i c2750i, C2685d c2685d) {
        if (c2750i.f8743b == null) {
            c2750i.f8743b = new RectF();
        }
        RectF rectF = c2750i.f8743b;
        AbstractC1665j.m2982b(rectF);
        float f2 = c2685d.f8562a;
        long j5 = c2685d.f8569h;
        long j6 = c2685d.f8568g;
        long j7 = c2685d.f8567f;
        long j8 = c2685d.f8566e;
        rectF.set(f2, c2685d.f8563b, c2685d.f8564c, c2685d.f8565d);
        if (c2750i.f8744c == null) {
            c2750i.f8744c = new float[8];
        }
        float[] fArr = c2750i.f8744c;
        AbstractC1665j.m2982b(fArr);
        fArr[0] = Float.intBitsToFloat((int) (j8 >> 32));
        fArr[1] = Float.intBitsToFloat((int) (j8 & 4294967295L));
        fArr[2] = Float.intBitsToFloat((int) (j7 >> 32));
        fArr[3] = Float.intBitsToFloat((int) (j7 & 4294967295L));
        fArr[4] = Float.intBitsToFloat((int) (j6 >> 32));
        fArr[5] = Float.intBitsToFloat((int) (j6 & 4294967295L));
        fArr[6] = Float.intBitsToFloat((int) (j5 >> 32));
        fArr[7] = Float.intBitsToFloat((int) (j5 & 4294967295L));
        Path path = c2750i.f8742a;
        RectF rectF2 = c2750i.f8743b;
        AbstractC1665j.m2982b(rectF2);
        float[] fArr2 = c2750i.f8744c;
        AbstractC1665j.m2982b(fArr2);
        path.addRoundRect(rectF2, fArr2, Path.Direction.CCW);
    }

    /* JADX INFO: renamed from: c */
    public final void m4879c(float f2, float f5, float f6, float f7, float f8, float f9) {
        this.f8742a.cubicTo(f2, f5, f6, f7, f8, f9);
    }

    /* JADX INFO: renamed from: d */
    public final C2684c m4880d() {
        if (this.f8743b == null) {
            this.f8743b = new RectF();
        }
        RectF rectF = this.f8743b;
        AbstractC1665j.m2982b(rectF);
        this.f8742a.computeBounds(rectF, true);
        return new C2684c(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    /* JADX INFO: renamed from: e */
    public final void m4881e(float f2, float f5) {
        this.f8742a.lineTo(f2, f5);
    }

    /* JADX INFO: renamed from: f */
    public final boolean m4882f(C2750i c2750i, C2750i c2750i2, int i5) {
        Path.Op op = i5 == 0 ? Path.Op.DIFFERENCE : i5 == 1 ? Path.Op.INTERSECT : i5 == 4 ? Path.Op.REVERSE_DIFFERENCE : i5 == 2 ? Path.Op.UNION : Path.Op.XOR;
        if (!(c2750i instanceof C2750i)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        Path path = c2750i.f8742a;
        if (c2750i2 instanceof C2750i) {
            return this.f8742a.op(path, c2750i2.f8742a, op);
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    /* JADX INFO: renamed from: g */
    public final void m4883g() {
        this.f8742a.reset();
    }
}
