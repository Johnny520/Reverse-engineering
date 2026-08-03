package p060h0;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import p028P.C0273a;

/* JADX INFO: renamed from: h0.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0945a {

    /* JADX INFO: renamed from: a */
    public static final LinearInterpolator f3354a = new LinearInterpolator();

    /* JADX INFO: renamed from: b */
    public static final C0273a f3355b = new C0273a(1);

    /* JADX INFO: renamed from: c */
    public static final C0273a f3356c = new C0273a(0);

    /* JADX INFO: renamed from: d */
    public static final C0273a f3357d = new C0273a(2);

    static {
        new DecelerateInterpolator();
    }

    /* JADX INFO: renamed from: a */
    public static float m2275a(float f2, float f3, float f4) {
        return ((f3 - f2) * f4) + f2;
    }

    /* JADX INFO: renamed from: b */
    public static float m2276b(float f2, float f3, float f4, float f5, float f6) {
        return f6 <= f4 ? f2 : f6 >= f5 ? f3 : m2275a(f2, f3, (f6 - f4) / (f5 - f4));
    }

    /* JADX INFO: renamed from: c */
    public static int m2277c(int i2, int i3, float f2) {
        return Math.round(f2 * (i3 - i2)) + i2;
    }
}
