package p147d1;

import p120Y0.AbstractC1732a;

/* JADX INFO: renamed from: d1.f */
/* JADX INFO: loaded from: classes.dex */
public final class C1956f {

    /* JADX INFO: renamed from: b */
    public static final float f6626b;

    /* JADX INFO: renamed from: c */
    public static final float f6627c;

    /* JADX INFO: renamed from: d */
    public static final float f6628d;

    /* JADX INFO: renamed from: a */
    public final float f6629a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        m3624a(0.0f);
        m3624a(0.5f);
        f6626b = 0.5f;
        m3624a(-1.0f);
        f6627c = -1.0f;
        m3624a(1.0f);
        f6628d = 1.0f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static void m3624a(float f2) {
        if ((0.0f > f2 || f2 > 1.0f) && f2 != -1.0f) {
            AbstractC1732a.m3086b("topRatio should be in [0..1] range or -1");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static String m3625b(float f2) {
        if (f2 == 0.0f) {
            return "LineHeightStyle.Alignment.Top";
        }
        if (f2 == f6626b) {
            return "LineHeightStyle.Alignment.Center";
        }
        if (f2 == f6627c) {
            return "LineHeightStyle.Alignment.Proportional";
        }
        if (f2 == f6628d) {
            return "LineHeightStyle.Alignment.Bottom";
        }
        return "LineHeightStyle.Alignment(topPercentage = " + f2 + ')';
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj instanceof C1956f) {
            return Float.compare(this.f6629a, ((C1956f) obj).f6629a) == 0;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Float.hashCode(this.f6629a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return m3625b(this.f6629a);
    }
}
