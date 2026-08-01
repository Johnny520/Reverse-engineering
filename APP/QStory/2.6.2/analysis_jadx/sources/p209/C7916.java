package p209;

import p195.AbstractC7833;

/* JADX INFO: renamed from: 飘花落叶言子苏哲楪兰世.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7916 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final float f21937;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final float f21938;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final float f21939;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final float f21940;

    static {
        m13385(0.0f);
        m13385(0.5f);
        f21939 = 0.5f;
        m13385(-1.0f);
        f21938 = -1.0f;
        m13385(1.0f);
        f21937 = 1.0f;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static String m13384(float f) {
        if (f == 0.0f) {
            return "LineHeightStyle.Alignment.Top";
        }
        if (f == f21939) {
            return "LineHeightStyle.Alignment.Center";
        }
        if (f == f21938) {
            return "LineHeightStyle.Alignment.Proportional";
        }
        if (f == f21937) {
            return "LineHeightStyle.Alignment.Bottom";
        }
        return "LineHeightStyle.Alignment(topPercentage = " + f + ')';
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static void m13385(float f) {
        if ((0.0f > f || f > 1.0f) && f != -1.0f) {
            AbstractC7833.m13169("topRatio should be in [0..1] range or -1");
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C7916) {
            return Float.compare(this.f21940, ((C7916) obj).f21940) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f21940);
    }

    public final String toString() {
        return m13384(this.f21940);
    }
}
