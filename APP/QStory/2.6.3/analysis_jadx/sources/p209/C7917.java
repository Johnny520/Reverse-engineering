package p209;

import p195.AbstractC7834;

/* JADX INFO: renamed from: 飘花落叶言子苏哲楪兰世.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7917 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final float f21934;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final float f21935;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final float f21936;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final float f21937;

    static {
        m13413(0.0f);
        m13413(0.5f);
        f21936 = 0.5f;
        m13413(-1.0f);
        f21935 = -1.0f;
        m13413(1.0f);
        f21934 = 1.0f;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static String m13412(float f) {
        if (f == 0.0f) {
            return "LineHeightStyle.Alignment.Top";
        }
        if (f == f21936) {
            return "LineHeightStyle.Alignment.Center";
        }
        if (f == f21935) {
            return "LineHeightStyle.Alignment.Proportional";
        }
        if (f == f21934) {
            return "LineHeightStyle.Alignment.Bottom";
        }
        return "LineHeightStyle.Alignment(topPercentage = " + f + ')';
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static void m13413(float f) {
        if ((0.0f > f || f > 1.0f) && f != -1.0f) {
            AbstractC7834.m13197("topRatio should be in [0..1] range or -1");
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C7917) {
            return Float.compare(this.f21937, ((C7917) obj).f21937) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f21937);
    }

    public final String toString() {
        return m13412(this.f21937);
    }
}
