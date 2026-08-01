package com.materialkolor.dynamiccolor;

/* JADX INFO: renamed from: com.materialkolor.dynamiccolor.飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3802 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final double f11964;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final double f11965;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final double f11966;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final double f11967;

    public C3802(double d, double d2, double d3, double d4) {
        this.f11967 = d;
        this.f11966 = d2;
        this.f11965 = d3;
        this.f11964 = d4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3802)) {
            return false;
        }
        C3802 c3802 = (C3802) obj;
        return Double.compare(this.f11967, c3802.f11967) == 0 && Double.compare(this.f11966, c3802.f11966) == 0 && Double.compare(this.f11965, c3802.f11965) == 0 && Double.compare(this.f11964, c3802.f11964) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f11964) + ((Double.hashCode(this.f11965) + ((Double.hashCode(this.f11966) + (Double.hashCode(this.f11967) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ContrastCurve(low=" + this.f11967 + ", normal=" + this.f11966 + ", medium=" + this.f11965 + ", high=" + this.f11964 + ")";
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final double m8144() {
        return (0.0d * this.f11965) + (1.0d * this.f11966);
    }
}
