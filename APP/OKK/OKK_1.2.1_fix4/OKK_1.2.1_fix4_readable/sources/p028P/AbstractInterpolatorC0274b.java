package p028P;

import android.view.animation.Interpolator;

/* JADX INFO: renamed from: P.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractInterpolatorC0274b implements Interpolator {

    /* JADX INFO: renamed from: a */
    public final float[] f573a;

    /* JADX INFO: renamed from: b */
    public final float f574b;

    public AbstractInterpolatorC0274b(float[] fArr) {
        this.f573a = fArr;
        this.f574b = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f2) {
        if (f2 >= 1.0f) {
            return 1.0f;
        }
        if (f2 <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f573a;
        int iMin = Math.min((int) ((fArr.length - 1) * f2), fArr.length - 2);
        float f3 = this.f574b;
        float f4 = (f2 - (iMin * f3)) / f3;
        float f5 = fArr[iMin];
        return ((fArr[iMin + 1] - f5) * f4) + f5;
    }
}
