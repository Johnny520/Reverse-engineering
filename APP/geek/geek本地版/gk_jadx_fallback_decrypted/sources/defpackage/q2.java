package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class q2 {
    public static final android.view.animation.LinearInterpolator a = null;
    public static final defpackage.tj b = null;
    public static final defpackage.tj c = null;
    public static final defpackage.tj d = null;

    static {
            android.view.animation.LinearInterpolator r0 = new android.view.animation.LinearInterpolator
            r0.<init>()
            defpackage.q2.a = r0
            tj r0 = new tj
            float[] r1 = defpackage.tj.d
            r0.<init>(r1)
            defpackage.q2.b = r0
            tj r0 = new tj
            float[] r1 = defpackage.tj.c
            r0.<init>(r1)
            defpackage.q2.c = r0
            tj r0 = new tj
            float[] r1 = defpackage.tj.e
            r0.<init>(r1)
            defpackage.q2.d = r0
            android.view.animation.DecelerateInterpolator r0 = new android.view.animation.DecelerateInterpolator
            r0.<init>()
            return
    }

    public static float a(float r0, float r1, float r2) {
            float r1 = r1 - r0
            float r1 = r1 * r2
            float r1 = r1 + r0
            return r1
    }

    public static float b(float r1, float r2, float r3, float r4, float r5) {
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 > 0) goto L5
            return r1
        L5:
            int r0 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r0 < 0) goto La
            return r2
        La:
            float r5 = r5 - r3
            float r4 = r4 - r3
            float r5 = r5 / r4
            float r1 = a(r1, r2, r5)
            return r1
    }

    public static int c(float r0, int r1, int r2) {
            int r2 = r2 - r1
            float r2 = (float) r2
            float r0 = r0 * r2
            int r0 = java.lang.Math.round(r0)
            int r0 = r0 + r1
            return r0
    }
}
