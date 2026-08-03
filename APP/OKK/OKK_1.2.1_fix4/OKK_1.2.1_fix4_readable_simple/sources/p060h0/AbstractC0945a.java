package p060h0;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import p028P.C0273a;

/* JADX INFO: renamed from: h0.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0945a {

    /* JADX INFO: renamed from: a */
    public static final LinearInterpolator f3354a = null;

    /* JADX INFO: renamed from: b */
    public static final C0273a f3355b = null;

    /* JADX INFO: renamed from: c */
    public static final C0273a f3356c = null;

    /* JADX INFO: renamed from: d */
    public static final C0273a f3357d = null;

    static {
        f3354a = new LinearInterpolator();
        f3355b = new C0273a(1);
        f3356c = new C0273a(0);
        f3357d = new C0273a(2);
        new DecelerateInterpolator();
    }

    /* JADX INFO: renamed from: a */
    public static float m2275a(float r02, float r1, float r2) {
        return ((r1 - r02) * r2) + r02;
    }

    /* JADX INFO: renamed from: b */
    public static float m2276b(float r1, float r2, float r3, float r4, float r5) {
        if (r5 > r3) goto L6;
        return r1;
    L6:
        if (r5 < r4) goto L9;
        return r2;
    L9:
        return m2275a(r1, r2, (r5 - r3) / (r4 - r3));
    }

    /* JADX INFO: renamed from: c */
    public static int m2277c(int r02, int r1, float r2) {
        return Math.round(r2 * (r1 - r02)) + r02;
    }
}
