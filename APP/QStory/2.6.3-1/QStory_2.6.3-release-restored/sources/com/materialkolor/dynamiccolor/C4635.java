package com.materialkolor.dynamiccolor;

/* JADX INFO: renamed from: com.materialkolor.dynamiccolor.飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4635 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final double f12314;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final double f12315;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final double f12316;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final double f12317;

    public C4635(double d, double d2, double d3, double d4) {
        this.f12317 = d;
        this.f12316 = d2;
        this.f12315 = d3;
        this.f12314 = d4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4635)) {
            return false;
        }
        C4635 c4635 = (C4635) obj;
        return Double.compare(this.f12317, c4635.f12317) == 0 && Double.compare(this.f12316, c4635.f12316) == 0 && Double.compare(this.f12315, c4635.f12315) == 0 && Double.compare(this.f12314, c4635.f12314) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f12314) + ((Double.hashCode(this.f12315) + ((Double.hashCode(this.f12316) + (Double.hashCode(this.f12317) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ContrastCurve(low=" + this.f12317 + ", normal=" + this.f12316 + ", medium=" + this.f12315 + ", high=" + this.f12314 + ")";
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final double m8690() {
        return (0.0d * this.f12315) + (1.0d * this.f12316);
    }
}
