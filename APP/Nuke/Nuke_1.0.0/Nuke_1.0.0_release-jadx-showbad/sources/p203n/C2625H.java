package p203n;

/* JADX INFO: renamed from: n.H */
/* JADX INFO: loaded from: classes.dex */
public final class C2625H {

    /* JADX INFO: renamed from: a */
    public float f8336a;

    /* JADX INFO: renamed from: b */
    public double f8337b;

    /* JADX INFO: renamed from: c */
    public float f8338c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final long m4576a(float f2, float f5, long j5) {
        double dSin;
        double dCos;
        double dExp;
        double dExp2;
        float f6 = f2 - this.f8336a;
        double d5 = j5 / 1000.0d;
        float f7 = this.f8338c;
        double d6 = ((double) f7) * ((double) f7);
        double d7 = this.f8337b;
        double d8 = ((double) (-f7)) * d7;
        if (f7 > 1.0f) {
            double dSqrt = Math.sqrt(d6 - ((double) 1)) * d7;
            double d9 = d8 + dSqrt;
            double d10 = d8 - dSqrt;
            double d11 = f6;
            double d12 = ((d10 * d11) - ((double) f5)) / (d10 - d9);
            double d13 = d11 - d12;
            double d14 = d10 * d5;
            double d15 = d5 * d9;
            dSin = (Math.exp(d15) * d12) + (Math.exp(d14) * d13);
            dExp = Math.exp(d14) * d13 * d10;
            dExp2 = Math.exp(d15) * d12 * d9;
        } else {
            if (f7 != 1.0f) {
                double d16 = 1;
                double dSqrt2 = Math.sqrt(d16 - d6) * d7;
                double d17 = f6;
                double d18 = (((-d8) * d17) + ((double) f5)) * (d16 / dSqrt2);
                double d19 = dSqrt2 * d5;
                double d20 = d5 * d8;
                dSin = ((Math.sin(d19) * d18) + (Math.cos(d19) * d17)) * Math.exp(d20);
                dCos = (((Math.cos(d19) * dSqrt2 * d18) + (Math.sin(d19) * (-dSqrt2) * d17)) * Math.exp(d20)) + (d8 * dSin);
                return (((long) Float.floatToRawIntBits((float) dCos)) & 4294967295L) | (Float.floatToRawIntBits((float) (dSin + ((double) this.f8336a))) << 32);
            }
            double d21 = f6;
            double d22 = (d7 * d21) + ((double) f5);
            double d23 = (-d7) * d5;
            double d24 = (d5 * d22) + d21;
            dSin = Math.exp(d23) * d24;
            dExp = Math.exp(d23) * d24 * (-this.f8337b);
            dExp2 = Math.exp(d23) * d22;
        }
        dCos = dExp2 + dExp;
        return (((long) Float.floatToRawIntBits((float) dCos)) & 4294967295L) | (Float.floatToRawIntBits((float) (dSin + ((double) this.f8336a))) << 32);
    }
}
