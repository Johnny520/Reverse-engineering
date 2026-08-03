package Yue;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.view.animation.Interpolator;

/* JADX INFO: renamed from: Yue.ۥۣۡۧۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class InterpolatorC6619 implements Interpolator {

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final float f16989 = 0.002f;

    /* JADX INFO: renamed from: ۥ */
    public final float[] f2180;

    /* JADX INFO: renamed from: ۥ۟ */
    public final float[] f2181;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public InterpolatorC6619(Path path) {
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = pathMeasure.getLength();
        int i = (int) (length / 0.002f);
        int i2 = i + 1;
        this.f2180 = new float[i2];
        this.f2181 = new float[i2];
        float[] fArr = new float[2];
        for (int i3 = 0; i3 < i2; i3++) {
            pathMeasure.getPosTan((i3 * length) / i, fArr, null);
            this.f2180[i3] = fArr[0];
            this.f2181[i3] = fArr[1];
        }
    }

    /* JADX INFO: renamed from: ۥ */
    public static Path m3089(float f, float f2, float f3, float f4) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.cubicTo(f, f2, f3, f4, 1.0f, 1.0f);
        return path;
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static Path m3090(float f, float f2) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.quadTo(f, f2, 1.0f, 1.0f);
        return path;
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        if (f <= 0.0f) {
            return 0.0f;
        }
        if (f >= 1.0f) {
            return 1.0f;
        }
        int length = this.f2180.length - 1;
        int i = 0;
        while (length - i > 1) {
            int i2 = (i + length) / 2;
            if (f < this.f2180[i2]) {
                length = i2;
            } else {
                i = i2;
            }
        }
        float[] fArr = this.f2180;
        float f2 = fArr[length];
        float f3 = fArr[i];
        float f4 = f2 - f3;
        if (f4 == 0.0f) {
            return this.f2181[i];
        }
        float f5 = (f - f3) / f4;
        float[] fArr2 = this.f2181;
        float f6 = fArr2[i];
        return f6 + (f5 * (fArr2[length] - f6));
    }

    public InterpolatorC6619(float f, float f2) {
        this(m3090(f, f2));
    }

    public InterpolatorC6619(float f, float f2, float f3, float f4) {
        this(m3089(f, f2, f3, f4));
    }
}
