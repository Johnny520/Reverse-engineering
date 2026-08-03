package Yue;

import android.view.animation.Interpolator;

/* JADX INFO: renamed from: Yue.ۥۣ۠ۨۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractInterpolatorC5889 implements Interpolator {

    /* JADX INFO: renamed from: ۥ */
    public final float[] f1755;

    /* JADX INFO: renamed from: ۥ۟ */
    public final float f1756;

    public AbstractInterpolatorC5889(float[] fArr) {
        this.f1755 = fArr;
        this.f1756 = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        if (f >= 1.0f) {
            return 1.0f;
        }
        if (f <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f1755;
        int iMin = Math.min((int) ((fArr.length - 1) * f), fArr.length - 2);
        float f2 = this.f1756;
        float f3 = (f - (iMin * f2)) / f2;
        float[] fArr2 = this.f1755;
        float f4 = fArr2[iMin];
        return f4 + (f3 * (fArr2[iMin + 1] - f4));
    }
}
