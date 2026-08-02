package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class va1 {

    /* JADX INFO: renamed from: b */
    public static final float f11864b;

    /* JADX INFO: renamed from: c */
    public static final float f11865c;

    /* JADX INFO: renamed from: d */
    public static final float f11866d;

    /* JADX INFO: renamed from: a */
    public final float f11867a;

    static {
        m5660a(0.0f);
        m5660a(0.5f);
        f11864b = 0.5f;
        m5660a(-1.0f);
        f11865c = -1.0f;
        m5660a(1.0f);
        f11866d = 1.0f;
    }

    /* JADX INFO: renamed from: a */
    public static void m5660a(float f) {
        if ((0.0f > f || f > 1.0f) && f != -1.0f) {
            lz0.m2989b("topRatio should be in [0..1] range or -1");
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m5661b(float f) {
        if (f == 0.0f) {
            return "LineHeightStyle.Alignment.Top";
        }
        if (f == f11864b) {
            return "LineHeightStyle.Alignment.Center";
        }
        if (f == f11865c) {
            return "LineHeightStyle.Alignment.Proportional";
        }
        if (f == f11866d) {
            return "LineHeightStyle.Alignment.Bottom";
        }
        return "LineHeightStyle.Alignment(topPercentage = " + f + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof va1) {
            return Float.compare(this.f11867a, ((va1) obj).f11867a) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f11867a);
    }

    public final String toString() {
        return m5661b(this.f11867a);
    }
}
