package p028P;

import android.view.animation.Interpolator;

/* JADX INFO: renamed from: P.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractInterpolatorC0274b implements Interpolator {

    /* JADX INFO: renamed from: a */
    public final float[] f573a;

    /* JADX INFO: renamed from: b */
    public final float f574b;

    public AbstractInterpolatorC0274b(float[] r2) {
        this.f573a = r2;
        this.f574b = 1.0f / (r2.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float r5) {
        if (r5 < 1.0f) goto L6;
        return 1.0f;
    L6:
        if (r5 > 0.0f) goto L8;
        return 0.0f;
    L8:
        float[] r02 = this.f573a;
        int r1 = Math.min((int) ((r02.length - 1) * r5), r02.length - 2);
        float r3 = this.f574b;
        float r52 = (r5 - (r1 * r3)) / r3;
        float r2 = r02[r1];
        return ((r02[r1 + 1] - r2) * r52) + r2;
    }
}
