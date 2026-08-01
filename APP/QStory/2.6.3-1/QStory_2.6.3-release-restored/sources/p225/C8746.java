package p225;

import p211.AbstractC8663;

/* JADX INFO: renamed from: 飘花落叶言子苏哲楪兰世.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8746 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final float f22279;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final float f22280;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final float f22281;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final float f22282;

    static {
        m13972(0.0f);
        m13972(0.5f);
        f22281 = 0.5f;
        m13972(-1.0f);
        f22280 = -1.0f;
        m13972(1.0f);
        f22279 = 1.0f;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static String m13971(float f) {
        if (f == 0.0f) {
            return "LineHeightStyle.Alignment.Top";
        }
        if (f == f22281) {
            return "LineHeightStyle.Alignment.Center";
        }
        if (f == f22280) {
            return "LineHeightStyle.Alignment.Proportional";
        }
        if (f == f22279) {
            return "LineHeightStyle.Alignment.Bottom";
        }
        return "LineHeightStyle.Alignment(topPercentage = " + f + ')';
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static void m13972(float f) {
        if ((0.0f > f || f > 1.0f) && f != -1.0f) {
            AbstractC8663.m13756("topRatio should be in [0..1] range or -1");
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C8746) {
            return Float.compare(this.f22282, ((C8746) obj).f22282) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f22282);
    }

    public final String toString() {
        return m13971(this.f22282);
    }
}
