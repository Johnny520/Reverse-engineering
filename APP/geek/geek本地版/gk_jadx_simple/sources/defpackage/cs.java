package defpackage;

import android.view.animation.Interpolator;

/* JADX INFO: loaded from: classes.dex */
public abstract class cs implements Interpolator {
    public final float[] a;
    public final float b;

    public cs(float[] r2) {
        this.a = r2;
        this.b = 1.0f / (r2.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float r5) {
        if (r5 < 1.0f) goto L6;
        return 1.0f;
    L6:
        if (r5 > 0.0f) goto L8;
        return 0.0f;
    L8:
        float[] r0 = this.a;
        int r1 = Math.min((int) ((r0.length - 1) * r5), r0.length - 2);
        float r3 = this.b;
        float r52 = (r5 - (r1 * r3)) / r3;
        float r2 = r0[r1];
        return ((r0[r1 + 1] - r2) * r52) + r2;
    }
}
