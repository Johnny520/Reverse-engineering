package com.materialkolor.dynamiccolor;

/* JADX INFO: renamed from: com.materialkolor.dynamiccolor.飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3803 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final double f11969;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final double f11970;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final double f11971;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final double f11972;

    public C3803(double d, double d2, double d3, double d4) {
        this.f11972 = d;
        this.f11971 = d2;
        this.f11970 = d3;
        this.f11969 = d4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3803)) {
            return false;
        }
        C3803 c3803 = (C3803) obj;
        return Double.compare(this.f11972, c3803.f11972) == 0 && Double.compare(this.f11971, c3803.f11971) == 0 && Double.compare(this.f11970, c3803.f11970) == 0 && Double.compare(this.f11969, c3803.f11969) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f11969) + ((Double.hashCode(this.f11970) + ((Double.hashCode(this.f11971) + (Double.hashCode(this.f11972) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ContrastCurve(low=" + this.f11972 + ", normal=" + this.f11971 + ", medium=" + this.f11970 + ", high=" + this.f11969 + ")";
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final double m8131() {
        return (0.0d * this.f11970) + (1.0d * this.f11971);
    }
}
