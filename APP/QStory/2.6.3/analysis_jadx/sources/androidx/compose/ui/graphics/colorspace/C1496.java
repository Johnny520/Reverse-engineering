package androidx.compose.ui.graphics.colorspace;

import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.colorspace.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1496 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final double f4261;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final double f4262;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final double f4263;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final double f4264;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final double f4265;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final double f4266;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final double f4267;

    public C1496(double d, double d2, double d3, double d4, double d5, double d6, double d7) {
        this.f4266 = d;
        this.f4265 = d2;
        this.f4264 = d3;
        this.f4263 = d4;
        this.f4262 = d5;
        this.f4261 = d6;
        this.f4267 = d7;
        if (Double.isNaN(d2) || Double.isNaN(d3) || Double.isNaN(d4) || Double.isNaN(d5) || Double.isNaN(d6) || Double.isNaN(d7) || Double.isNaN(d)) {
            C5925.m11310("Parameters cannot be NaN");
            throw null;
        }
        if (d == -2.0d || d == -3.0d) {
            return;
        }
        if (d5 < 0.0d || d5 > 1.0d) {
            throw new IllegalArgumentException("Parameter d must be in the range [0..1], was " + d5);
        }
        if (d5 == 0.0d && (d2 == 0.0d || d == 0.0d)) {
            C5925.m11310("Parameter a or g is zero, the transfer function is constant");
            throw null;
        }
        if (d5 >= 1.0d && d4 == 0.0d) {
            C5925.m11310("Parameter c is zero, the transfer function is constant");
            throw null;
        }
        if ((d2 == 0.0d || d == 0.0d) && d4 == 0.0d) {
            C5925.m11310("Parameter a or g is zero, and c is zero, the transfer function is constant");
            throw null;
        }
        if (d4 < 0.0d) {
            C5925.m11310("The transfer function must be increasing");
            throw null;
        }
        if (d2 < 0.0d || d < 0.0d) {
            C5925.m11310("The transfer function must be positive or increasing");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1496)) {
            return false;
        }
        C1496 c1496 = (C1496) obj;
        return Double.compare(this.f4266, c1496.f4266) == 0 && Double.compare(this.f4265, c1496.f4265) == 0 && Double.compare(this.f4264, c1496.f4264) == 0 && Double.compare(this.f4263, c1496.f4263) == 0 && Double.compare(this.f4262, c1496.f4262) == 0 && Double.compare(this.f4261, c1496.f4261) == 0 && Double.compare(this.f4267, c1496.f4267) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f4267) + ((Double.hashCode(this.f4261) + ((Double.hashCode(this.f4262) + ((Double.hashCode(this.f4263) + ((Double.hashCode(this.f4264) + ((Double.hashCode(this.f4265) + (Double.hashCode(this.f4266) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "TransferParameters(gamma=" + this.f4266 + ", a=" + this.f4265 + ", b=" + this.f4264 + ", c=" + this.f4263 + ", d=" + this.f4262 + ", e=" + this.f4261 + ", f=" + this.f4267 + ')';
    }

    public /* synthetic */ C1496(double d, double d2, double d3, double d4, double d5) {
        this(d, d2, d3, d4, d5, 0.0d, 0.0d);
    }
}
