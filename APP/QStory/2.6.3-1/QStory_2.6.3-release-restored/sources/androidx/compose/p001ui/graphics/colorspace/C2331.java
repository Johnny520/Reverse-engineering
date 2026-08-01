package androidx.compose.p001ui.graphics.colorspace;

import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.colorspace.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2331 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final double f4606;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final double f4607;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final double f4608;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final double f4609;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final double f4610;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final double f4611;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final double f4612;

    public C2331(double d, double d2, double d3, double d4, double d5, double d6, double d7) {
        this.f4611 = d;
        this.f4610 = d2;
        this.f4609 = d3;
        this.f4608 = d4;
        this.f4607 = d5;
        this.f4606 = d6;
        this.f4612 = d7;
        if (Double.isNaN(d2) || Double.isNaN(d3) || Double.isNaN(d4) || Double.isNaN(d5) || Double.isNaN(d6) || Double.isNaN(d7) || Double.isNaN(d)) {
            C6755.m11869("Parameters cannot be NaN");
            throw null;
        }
        if (d == -2.0d || d == -3.0d) {
            return;
        }
        if (d5 < 0.0d || d5 > 1.0d) {
            throw new IllegalArgumentException("Parameter d must be in the range [0..1], was " + d5);
        }
        if (d5 == 0.0d && (d2 == 0.0d || d == 0.0d)) {
            C6755.m11869("Parameter a or g is zero, the transfer function is constant");
            throw null;
        }
        if (d5 >= 1.0d && d4 == 0.0d) {
            C6755.m11869("Parameter c is zero, the transfer function is constant");
            throw null;
        }
        if ((d2 == 0.0d || d == 0.0d) && d4 == 0.0d) {
            C6755.m11869("Parameter a or g is zero, and c is zero, the transfer function is constant");
            throw null;
        }
        if (d4 < 0.0d) {
            C6755.m11869("The transfer function must be increasing");
            throw null;
        }
        if (d2 < 0.0d || d < 0.0d) {
            C6755.m11869("The transfer function must be positive or increasing");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2331)) {
            return false;
        }
        C2331 c2331 = (C2331) obj;
        return Double.compare(this.f4611, c2331.f4611) == 0 && Double.compare(this.f4610, c2331.f4610) == 0 && Double.compare(this.f4609, c2331.f4609) == 0 && Double.compare(this.f4608, c2331.f4608) == 0 && Double.compare(this.f4607, c2331.f4607) == 0 && Double.compare(this.f4606, c2331.f4606) == 0 && Double.compare(this.f4612, c2331.f4612) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f4612) + ((Double.hashCode(this.f4606) + ((Double.hashCode(this.f4607) + ((Double.hashCode(this.f4608) + ((Double.hashCode(this.f4609) + ((Double.hashCode(this.f4610) + (Double.hashCode(this.f4611) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "TransferParameters(gamma=" + this.f4611 + ", a=" + this.f4610 + ", b=" + this.f4609 + ", c=" + this.f4608 + ", d=" + this.f4607 + ", e=" + this.f4606 + ", f=" + this.f4612 + ')';
    }

    public /* synthetic */ C2331(double d, double d2, double d3, double d4, double d5) {
        this(d, d2, d3, d4, d5, 0.0d, 0.0d);
    }
}
