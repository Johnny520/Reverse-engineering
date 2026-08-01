package defpackage;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* JADX INFO: loaded from: classes.dex */
public abstract class q2 {
    public static final LinearInterpolator a = null;
    public static final tj b = null;
    public static final tj c = null;
    public static final tj d = null;

    static {
        a = new LinearInterpolator();
        b = new tj(tj.d);
        c = new tj(tj.c);
        d = new tj(tj.e);
        new DecelerateInterpolator();
    }

    public static float a(float r0, float r1, float r2) {
        return ((r1 - r0) * r2) + r0;
    }

    public static float b(float r1, float r2, float r3, float r4, float r5) {
        if (r5 > r3) goto L6;
        return r1;
    L6:
        if (r5 < r4) goto L9;
        return r2;
    L9:
        return a(r1, r2, (r5 - r3) / (r4 - r3));
    }

    public static int c(float r0, int r1, int r2) {
        return Math.round(r0 * (r2 - r1)) + r1;
    }
}
