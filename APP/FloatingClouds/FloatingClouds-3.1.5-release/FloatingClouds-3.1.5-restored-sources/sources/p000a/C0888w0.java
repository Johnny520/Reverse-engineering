package p000a;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* JADX INFO: renamed from: a.w0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0888w0 {

    /* JADX INFO: renamed from: a */
    public static final LinearInterpolator f3468a = new LinearInterpolator();

    /* JADX INFO: renamed from: b */
    public static final C0685l6 f3469b = new C0685l6(C0685l6.f2549d);

    /* JADX INFO: renamed from: c */
    public static final C0685l6 f3470c = new C0685l6();

    /* JADX INFO: renamed from: d */
    public static final C0685l6 f3471d = new C0685l6(C0685l6.f2550e);

    /* JADX INFO: renamed from: e */
    public static final DecelerateInterpolator f3472e = new DecelerateInterpolator();

    /* JADX INFO: renamed from: a */
    public static float m2112a(float f, float f2, float f3) {
        return ((f2 - f) * f3) + f;
    }

    /* JADX INFO: renamed from: b */
    public static float m2113b(float f, float f2, float f3, float f4, float f5) {
        return f5 <= f3 ? f : f5 >= f4 ? f2 : m2112a(f, f2, (f5 - f3) / (f4 - f3));
    }

    /* JADX INFO: renamed from: c */
    public static int m2114c(int i, int i2, float f) {
        return Math.round(f * (i2 - i)) + i;
    }
}
