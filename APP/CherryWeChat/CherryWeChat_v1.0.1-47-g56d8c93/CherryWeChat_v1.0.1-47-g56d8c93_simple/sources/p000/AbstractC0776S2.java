package p000;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* JADX INFO: renamed from: S2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0776S2 {

    /* JADX INFO: renamed from: a */
    public static final LinearInterpolator f2453a = null;

    /* JADX INFO: renamed from: b */
    public static final C1370eh f2454b = null;

    /* JADX INFO: renamed from: c */
    public static final C1370eh f2455c = null;

    /* JADX INFO: renamed from: d */
    public static final C1370eh f2456d = null;

    static {
        f2453a = new LinearInterpolator();
        f2454b = new C1370eh(1);
        f2455c = new C1370eh(0);
        f2456d = new C1370eh(C1370eh.f4903e);
        new DecelerateInterpolator();
    }

    /* JADX INFO: renamed from: a */
    public static float m1596a(float r0, float r1, float r2) {
        return ((r1 - r0) * r2) + r0;
    }

    /* JADX INFO: renamed from: b */
    public static float m1597b(float r1, float r2, float r3, float r4, float r5) {
        if (r5 > r3) goto L6;
        return r1;
    L6:
        if (r5 < r4) goto L9;
        return r2;
    L9:
        return m1596a(r1, r2, (r5 - r3) / (r4 - r3));
    }

    /* JADX INFO: renamed from: c */
    public static int m1598c(int r0, int r1, float r2) {
        return Math.round(r2 * (r1 - r0)) + r0;
    }
}
