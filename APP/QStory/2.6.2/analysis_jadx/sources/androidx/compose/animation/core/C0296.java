package androidx.compose.animation.core;

/* JADX INFO: renamed from: androidx.compose.animation.core.飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C0296 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public float f1025;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public double f1026;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public float f1027;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final long m925(float f, float f2, long j) {
        double dSin;
        double dCos;
        double dExp;
        double dExp2;
        float f3 = f - this.f1027;
        double d = j / 1000.0d;
        float f4 = this.f1025;
        double d2 = ((double) f4) * ((double) f4);
        double d3 = this.f1026;
        double d4 = ((double) (-f4)) * d3;
        if (f4 > 1.0f) {
            double dSqrt = Math.sqrt(d2 - 1.0d) * d3;
            double d5 = d4 + dSqrt;
            double d6 = d4 - dSqrt;
            double d7 = f3;
            double d8 = ((d6 * d7) - ((double) f2)) / (d6 - d5);
            double d9 = d7 - d8;
            double d10 = d6 * d;
            double d11 = d * d5;
            dSin = (Math.exp(d11) * d8) + (Math.exp(d10) * d9);
            dExp = Math.exp(d10) * d9 * d6;
            dExp2 = Math.exp(d11) * d8 * d5;
        } else {
            if (f4 != 1.0f) {
                double dSqrt2 = Math.sqrt(1.0d - d2) * d3;
                double d12 = f3;
                double d13 = (((-d4) * d12) + ((double) f2)) * (1.0d / dSqrt2);
                double d14 = dSqrt2 * d;
                double d15 = d * d4;
                dSin = ((Math.sin(d14) * d13) + (Math.cos(d14) * d12)) * Math.exp(d15);
                dCos = (((Math.cos(d14) * dSqrt2 * d13) + (Math.sin(d14) * (-dSqrt2) * d12)) * Math.exp(d15)) + (d4 * dSin);
                return (((long) Float.floatToRawIntBits((float) dCos)) & 4294967295L) | (Float.floatToRawIntBits((float) (dSin + ((double) this.f1027))) << 32);
            }
            double d16 = f3;
            double d17 = (d3 * d16) + ((double) f2);
            double d18 = (-d3) * d;
            double d19 = (d * d17) + d16;
            dSin = Math.exp(d18) * d19;
            dExp = Math.exp(d18) * d19 * (-this.f1026);
            dExp2 = Math.exp(d18) * d17;
        }
        dCos = dExp2 + dExp;
        return (((long) Float.floatToRawIntBits((float) dCos)) & 4294967295L) | (Float.floatToRawIntBits((float) (dSin + ((double) this.f1027))) << 32);
    }
}
