package p021L;

import android.view.animation.Interpolator;

/* JADX INFO: renamed from: L.d */
/* JADX INFO: loaded from: classes.dex */
public final class InterpolatorC0244d implements Interpolator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f501a;

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f2) {
        switch (this.f501a) {
            case 0:
                float f3 = f2 - 1.0f;
                return (f3 * f3 * f3 * f3 * f3) + 1.0f;
            default:
                float f4 = f2 - 1.0f;
                return (f4 * f4 * f4 * f4 * f4) + 1.0f;
        }
    }
}
