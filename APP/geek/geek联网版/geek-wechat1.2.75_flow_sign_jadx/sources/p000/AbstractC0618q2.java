package p000;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* JADX INFO: renamed from: q2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0618q2 {

    /* JADX INFO: renamed from: a */
    public static final LinearInterpolator f3770a = new LinearInterpolator();

    /* JADX INFO: renamed from: b */
    public static final C0820vj f3771b = new C0820vj(C0820vj.f4961d);

    /* JADX INFO: renamed from: c */
    public static final C0820vj f3772c = new C0820vj(C0820vj.f4960c);

    /* JADX INFO: renamed from: d */
    public static final C0820vj f3773d = new C0820vj(C0820vj.f4962e);

    static {
        new DecelerateInterpolator();
    }

    /* JADX INFO: renamed from: a */
    public static float m2108a(float f, float f2, float f3) {
        return ((f2 - f) * f3) + f;
    }

    /* JADX INFO: renamed from: b */
    public static float m2109b(float f, float f2, float f3, float f4, float f5) {
        return f5 <= f3 ? f : f5 >= f4 ? f2 : m2108a(f, f2, (f5 - f3) / (f4 - f3));
    }

    /* JADX INFO: renamed from: c */
    public static int m2110c(float f, int i, int i2) {
        return Math.round(f * (i2 - i)) + i;
    }
}
