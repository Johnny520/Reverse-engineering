package p021L;

import android.view.animation.Interpolator;

/* JADX INFO: renamed from: L.d */
/* JADX INFO: loaded from: classes.dex */
public final class InterpolatorC0244d implements Interpolator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f501a;

    public /* synthetic */ InterpolatorC0244d(int r1) {
        this.f501a = r1;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float r3) {
        switch(this.f501a) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        float r32 = r3 - 1.0f;
        return ((((r32 * r32) * r32) * r32) * r32) + 1.0f;
    L6:
        float r33 = r3 - 1.0f;
        return ((((r33 * r33) * r33) * r33) * r33) + 1.0f;
    }
}
