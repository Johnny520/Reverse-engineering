package p000;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* JADX INFO: renamed from: q2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0619q2 {

    /* JADX INFO: renamed from: a */
    public static final LinearInterpolator f3971a = new LinearInterpolator();

    /* JADX INFO: renamed from: b */
    public static final C0747tj f3972b = new C0747tj(C0747tj.f4578d);

    /* JADX INFO: renamed from: c */
    public static final C0747tj f3973c = new C0747tj(C0747tj.f4577c);

    /* JADX INFO: renamed from: d */
    public static final C0747tj f3974d = new C0747tj(C0747tj.f4579e);

    static {
        new DecelerateInterpolator();
    }

    /* JADX INFO: renamed from: a */
    public static float m2139a(float f, float f2, float f3) {
        return ((f2 - f) * f3) + f;
    }

    /* JADX INFO: renamed from: b */
    public static float m2140b(float f, float f2, float f3, float f4, float f5) {
        return f5 <= f3 ? f : f5 >= f4 ? f2 : m2139a(f, f2, (f5 - f3) / (f4 - f3));
    }

    /* JADX INFO: renamed from: c */
    public static int m2141c(float f, int i, int i2) {
        return Math.round(f * (i2 - i)) + i;
    }
}
