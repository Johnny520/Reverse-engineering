package p000;

import android.view.animation.Interpolator;

/* JADX INFO: renamed from: cs */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractInterpolatorC0125cs implements Interpolator {

    /* JADX INFO: renamed from: a */
    public final float[] f1317a;

    /* JADX INFO: renamed from: b */
    public final float f1318b;

    public AbstractInterpolatorC0125cs(float[] fArr) {
        this.f1317a = fArr;
        this.f1318b = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        if (f >= 1.0f) {
            return 1.0f;
        }
        if (f <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f1317a;
        int iMin = Math.min((int) ((fArr.length - 1) * f), fArr.length - 2);
        float f2 = this.f1318b;
        float f3 = (f - (iMin * f2)) / f2;
        float f4 = fArr[iMin];
        return ((fArr[iMin + 1] - f4) * f3) + f4;
    }
}
