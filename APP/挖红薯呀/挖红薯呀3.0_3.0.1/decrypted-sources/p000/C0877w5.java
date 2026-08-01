package p000;

import android.graphics.Paint;
import android.graphics.Shader;

/* JADX INFO: renamed from: w5 */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0877w5 {

    /* JADX INFO: renamed from: a */
    public final Paint f7002a;

    /* JADX INFO: renamed from: b */
    public int f7003b = 3;

    /* JADX INFO: renamed from: c */
    public Shader f7004c;

    /* JADX INFO: renamed from: d */
    public C0348ja f7005d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0877w5(Paint paint) {
        this.f7002a = paint;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final int m4867a() {
        Paint.Cap strokeCap = this.f7002a.getStrokeCap();
        int i = strokeCap == null ? -1 : AbstractC0914x5.f7262a[strokeCap.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i != 2) {
            return i != 3 ? 0 : 2;
        }
        return 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final int m4868b() {
        Paint.Join strokeJoin = this.f7002a.getStrokeJoin();
        int i = strokeJoin == null ? -1 : AbstractC0914x5.f7263b[strokeJoin.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i != 2) {
            return i != 3 ? 0 : 1;
        }
        return 2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final void m4869c(float f) {
        this.f7002a.setAlpha((int) Math.rint(f * 255.0f));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final void m4870d(int i) {
        if (this.f7003b == i) {
            return;
        }
        this.f7003b = i;
        this.f7002a.setBlendMode(o30.m2758B(i));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final void m4871e(long j) {
        this.f7002a.setColor(p30.m2987W(j));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final void m4872f(C0348ja c0348ja) {
        this.f7005d = c0348ja;
        this.f7002a.setColorFilter(c0348ja != null ? c0348ja.f2775a : null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final void m4873g(Shader shader) {
        this.f7004c = shader;
        this.f7002a.setShader(shader);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public final void m4874h(int i) {
        this.f7002a.setStrokeCap(i == 2 ? Paint.Cap.SQUARE : i == 1 ? Paint.Cap.ROUND : i == 0 ? Paint.Cap.BUTT : Paint.Cap.BUTT);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public final void m4875i(int i) {
        this.f7002a.setStrokeJoin(i == 0 ? Paint.Join.MITER : i == 2 ? Paint.Join.BEVEL : i == 1 ? Paint.Join.ROUND : Paint.Join.MITER);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public final void m4876j(int i) {
        this.f7002a.setStyle(i == 1 ? Paint.Style.STROKE : Paint.Style.FILL);
    }
}
