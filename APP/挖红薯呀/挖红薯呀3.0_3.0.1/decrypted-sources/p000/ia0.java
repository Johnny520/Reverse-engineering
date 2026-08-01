package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class ia0 {

    /* JADX INFO: renamed from: b */
    public static final float f2498b;

    /* JADX INFO: renamed from: c */
    public static final float f2499c;

    /* JADX INFO: renamed from: d */
    public static final float f2500d;

    /* JADX INFO: renamed from: a */
    public final float f2501a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        m1570a(0.0f);
        m1570a(0.5f);
        f2498b = 0.5f;
        m1570a(-1.0f);
        f2499c = -1.0f;
        m1570a(1.0f);
        f2500d = 1.0f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static void m1570a(float f) {
        if ((0.0f > f || f > 1.0f) && f != -1.0f) {
            x10.m5083b("topRatio should be in [0..1] range or -1");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static String m1571b(float f) {
        if (f == 0.0f) {
            return "LineHeightStyle.Alignment.Top";
        }
        if (f == f2498b) {
            return "LineHeightStyle.Alignment.Center";
        }
        if (f == f2499c) {
            return "LineHeightStyle.Alignment.Proportional";
        }
        if (f == f2500d) {
            return "LineHeightStyle.Alignment.Bottom";
        }
        return "LineHeightStyle.Alignment(topPercentage = " + f + ')';
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj instanceof ia0) {
            return Float.compare(this.f2501a, ((ia0) obj).f2501a) == 0;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Float.hashCode(this.f2501a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return m1571b(this.f2501a);
    }
}
