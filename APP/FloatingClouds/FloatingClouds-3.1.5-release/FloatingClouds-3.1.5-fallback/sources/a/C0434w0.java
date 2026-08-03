package a;

/* JADX INFO: renamed from: a.w0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0434w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final android.view.animation.LinearInterpolator f744a = null;
    public static final a.C0243l6 b = null;
    public static final a.C0243l6 c = null;
    public static final a.C0243l6 d = null;
    public static final android.view.animation.DecelerateInterpolator e = null;

    static {
            android.view.animation.LinearInterpolator r0 = new android.view.animation.LinearInterpolator
            r0.<init>()
            a.C0434w0.f744a = r0
            a.l6 r0 = new a.l6
            float[] r1 = a.C0243l6.d
            r0.<init>(r1)
            a.C0434w0.b = r0
            a.l6 r0 = new a.l6
            r0.<init>()
            a.C0434w0.c = r0
            a.l6 r0 = new a.l6
            float[] r1 = a.C0243l6.e
            r0.<init>(r1)
            a.C0434w0.d = r0
            android.view.animation.DecelerateInterpolator r0 = new android.view.animation.DecelerateInterpolator
            r0.<init>()
            a.C0434w0.e = r0
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

    public static int c(int r0, int r1, float r2) {
            int r1 = r1 - r0
            float r1 = (float) r1
            float r2 = r2 * r1
            int r1 = java.lang.Math.round(r2)
            int r1 = r1 + r0
            return r1
    }
}
