package p000;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* JADX INFO: renamed from: S2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0776S2 {

    /* JADX INFO: renamed from: a */
    public static final LinearInterpolator f2453a = new LinearInterpolator();

    /* JADX INFO: renamed from: b */
    public static final C1370eh f2454b = new C1370eh(1);

    /* JADX INFO: renamed from: c */
    public static final C1370eh f2455c = new C1370eh(0);

    /* JADX INFO: renamed from: d */
    public static final C1370eh f2456d = new C1370eh(C1370eh.f4903e);

    static {
        new DecelerateInterpolator();
    }

    /* JADX INFO: renamed from: a */
    public static float m1596a(float f, float f2, float f3) {
        return ((f2 - f) * f3) + f;
    }

    /* JADX INFO: renamed from: b */
    public static float m1597b(float f, float f2, float f3, float f4, float f5) {
        return f5 <= f3 ? f : f5 >= f4 ? f2 : m1596a(f, f2, (f5 - f3) / (f4 - f3));
    }

    /* JADX INFO: renamed from: c */
    public static int m1598c(int i, int i2, float f) {
        return Math.round(f * (i2 - i)) + i;
    }
}
