package p000;

import android.view.animation.Interpolator;

/* JADX INFO: renamed from: wp */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractInterpolatorC2683wp implements Interpolator {

    /* JADX INFO: renamed from: a */
    public final float[] f9243a;

    /* JADX INFO: renamed from: b */
    public final float f9244b;

    public AbstractInterpolatorC2683wp(float[] fArr) {
        this.f9243a = fArr;
        this.f9244b = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        if (f >= 1.0f) {
            return 1.0f;
        }
        if (f <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f9243a;
        int iMin = Math.min((int) ((fArr.length - 1) * f), fArr.length - 2);
        float f2 = this.f9244b;
        float f3 = (f - (iMin * f2)) / f2;
        float f4 = fArr[iMin];
        return ((fArr[iMin + 1] - f4) * f3) + f4;
    }
}
