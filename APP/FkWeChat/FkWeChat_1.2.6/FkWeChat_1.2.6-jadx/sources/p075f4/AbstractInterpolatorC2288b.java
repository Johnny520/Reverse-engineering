package p075f4;

import android.view.animation.Interpolator;

/* JADX INFO: renamed from: f4.b */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractInterpolatorC2288b implements Interpolator {

    /* JADX INFO: renamed from: a */
    public final float[] f6262a;

    /* JADX INFO: renamed from: b */
    public final float f6263b;

    public AbstractInterpolatorC2288b(float[] fArr) {
        this.f6262a = fArr;
        this.f6263b = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f10) {
        if (f10 >= 1.0f) {
            return 1.0f;
        }
        if (f10 <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f6262a;
        int iMin = Math.min((int) ((fArr.length - 1) * f10), fArr.length - 2);
        float f11 = this.f6263b;
        float f12 = (f10 - (iMin * f11)) / f11;
        float[] fArr2 = this.f6262a;
        float f13 = fArr2[iMin];
        return f13 + (f12 * (fArr2[iMin + 1] - f13));
    }
}
