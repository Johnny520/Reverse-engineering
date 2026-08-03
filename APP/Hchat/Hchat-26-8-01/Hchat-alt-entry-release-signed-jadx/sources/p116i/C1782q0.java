package p116i;

/* JADX INFO: renamed from: i.q0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1782q0 {

    /* JADX INFO: renamed from: a */
    public float f5930a;

    /* JADX INFO: renamed from: b */
    public double f5931b;

    /* JADX INFO: renamed from: c */
    public float f5932c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final long m4433a(float f3, float f10, long j3) {
        double dSin;
        double dCos;
        double dExp;
        double dExp2;
        float f11 = f3 - this.f5930a;
        double d10 = j3 / 1000.0d;
        float f12 = this.f5932c;
        double d11 = ((double) f12) * ((double) f12);
        double d12 = this.f5931b;
        double d13 = ((double) (-f12)) * d12;
        if (f12 > 1.0f) {
            double dSqrt = Math.sqrt(d11 - ((double) 1)) * d12;
            double d14 = d13 + dSqrt;
            double d15 = d13 - dSqrt;
            double d16 = f11;
            double d17 = ((d15 * d16) - ((double) f10)) / (d15 - d14);
            double d18 = d16 - d17;
            double d19 = d15 * d10;
            double d20 = d10 * d14;
            dSin = (Math.exp(d20) * d17) + (Math.exp(d19) * d18);
            dExp = Math.exp(d19) * d18 * d15;
            dExp2 = Math.exp(d20) * d17 * d14;
        } else {
            if (f12 != 1.0f) {
                double d21 = 1;
                double dSqrt2 = Math.sqrt(d21 - d11) * d12;
                double d22 = f11;
                double d23 = (((-d13) * d22) + ((double) f10)) * (d21 / dSqrt2);
                double d24 = dSqrt2 * d10;
                double d25 = d10 * d13;
                dSin = ((Math.sin(d24) * d23) + (Math.cos(d24) * d22)) * Math.exp(d25);
                dCos = (((Math.cos(d24) * dSqrt2 * d23) + (Math.sin(d24) * (-dSqrt2) * d22)) * Math.exp(d25)) + (d13 * dSin);
                return (((long) Float.floatToRawIntBits((float) dCos)) & 4294967295L) | (Float.floatToRawIntBits((float) (dSin + ((double) this.f5930a))) << 32);
            }
            double d26 = f11;
            double d27 = (d12 * d26) + ((double) f10);
            double d28 = (-d12) * d10;
            double d29 = (d10 * d27) + d26;
            dSin = Math.exp(d28) * d29;
            dExp = Math.exp(d28) * d29 * (-this.f5931b);
            dExp2 = Math.exp(d28) * d27;
        }
        dCos = dExp2 + dExp;
        return (((long) Float.floatToRawIntBits((float) dCos)) & 4294967295L) | (Float.floatToRawIntBits((float) (dSin + ((double) this.f5930a))) << 32);
    }
}
