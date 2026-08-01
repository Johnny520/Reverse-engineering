package p000;

import android.graphics.Path;
import android.graphics.RectF;

/* JADX INFO: renamed from: d6 */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0118d6 {

    /* JADX INFO: renamed from: a */
    public final Path f973a;

    /* JADX INFO: renamed from: b */
    public RectF f974b;

    /* JADX INFO: renamed from: c */
    public float[] f975c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0118d6(Path path) {
        this.f973a = path;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static void m634a(C0118d6 c0118d6, C0118d6 c0118d62) {
        c0118d6.f973a.addPath(c0118d62.f973a, Float.intBitsToFloat(0), Float.intBitsToFloat(0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static void m635b(C0118d6 c0118d6, bw0 bw0Var) {
        if (c0118d6.f974b == null) {
            c0118d6.f974b = new RectF();
        }
        RectF rectF = c0118d6.f974b;
        rectF.getClass();
        float f = bw0Var.f596a;
        long j = bw0Var.f603h;
        long j2 = bw0Var.f602g;
        long j3 = bw0Var.f601f;
        long j4 = bw0Var.f600e;
        rectF.set(f, bw0Var.f597b, bw0Var.f598c, bw0Var.f599d);
        if (c0118d6.f975c == null) {
            c0118d6.f975c = new float[8];
        }
        float[] fArr = c0118d6.f975c;
        fArr.getClass();
        fArr[0] = Float.intBitsToFloat((int) (j4 >> 32));
        fArr[1] = Float.intBitsToFloat((int) (j4 & 4294967295L));
        fArr[2] = Float.intBitsToFloat((int) (j3 >> 32));
        fArr[3] = Float.intBitsToFloat((int) (j3 & 4294967295L));
        fArr[4] = Float.intBitsToFloat((int) (j2 >> 32));
        fArr[5] = Float.intBitsToFloat((int) (j2 & 4294967295L));
        fArr[6] = Float.intBitsToFloat((int) (j >> 32));
        fArr[7] = Float.intBitsToFloat((int) (j & 4294967295L));
        Path path = c0118d6.f973a;
        RectF rectF2 = c0118d6.f974b;
        rectF2.getClass();
        float[] fArr2 = c0118d6.f975c;
        fArr2.getClass();
        path.addRoundRect(rectF2, fArr2, Path.Direction.CCW);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final st0 m636c() {
        if (this.f974b == null) {
            this.f974b = new RectF();
        }
        RectF rectF = this.f974b;
        rectF.getClass();
        this.f973a.computeBounds(rectF, true);
        return new st0(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final boolean m637d(C0118d6 c0118d6, C0118d6 c0118d62, int i) {
        Path.Op op = i == 0 ? Path.Op.DIFFERENCE : i == 1 ? Path.Op.INTERSECT : i == 4 ? Path.Op.REVERSE_DIFFERENCE : i == 2 ? Path.Op.UNION : Path.Op.XOR;
        if (!(c0118d6 instanceof C0118d6)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        Path path = c0118d6.f973a;
        if (c0118d62 instanceof C0118d6) {
            return this.f973a.op(path, c0118d62.f973a, op);
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final void m638e() {
        this.f973a.reset();
    }
}
