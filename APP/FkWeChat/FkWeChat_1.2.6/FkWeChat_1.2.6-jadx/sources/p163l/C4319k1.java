package p163l;

/* JADX INFO: renamed from: l.k1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C4319k1 {

    /* JADX INFO: renamed from: a */
    public float f12642a;

    /* JADX INFO: renamed from: b */
    public double f12643b = Math.sqrt(50.0d);

    /* JADX INFO: renamed from: c */
    public float f12644c = 1.0f;

    public C4319k1(float f10) {
        this.f12642a = f10;
    }

    /* JADX INFO: renamed from: a */
    public final float m16959a() {
        return this.f12644c;
    }

    /* JADX INFO: renamed from: b */
    public final float m16960b() {
        double d10 = this.f12643b;
        return (float) (d10 * d10);
    }

    /* JADX INFO: renamed from: c */
    public final void m16961c(float f10) {
        if (f10 < 0.0f) {
            AbstractC4294f1.m16849a("Damping ratio must be non-negative");
        }
        this.f12644c = f10;
    }

    /* JADX INFO: renamed from: d */
    public final void m16962d(float f10) {
        this.f12642a = f10;
    }

    /* JADX INFO: renamed from: e */
    public final void m16963e(float f10) {
        if (m16960b() <= 0.0f) {
            AbstractC4294f1.m16849a("Spring stiffness constant must be positive.");
        }
        this.f12643b = Math.sqrt(f10);
    }

    /* JADX INFO: renamed from: f */
    public final long m16964f(float f10, float f11, long j10) {
        double dExp;
        double dExp2;
        float f12 = f10 - this.f12642a;
        double d10 = j10 / 1000.0d;
        float f13 = this.f12644c;
        double d11 = ((double) f13) * ((double) f13);
        double d12 = this.f12643b;
        double d13 = ((double) (-f13)) * d12;
        if (f13 > 1.0f) {
            double dSqrt = d12 * Math.sqrt(d11 - ((double) 1));
            double d14 = d13 + dSqrt;
            double d15 = d13 - dSqrt;
            double d16 = f12;
            double d17 = ((d15 * d16) - ((double) f11)) / (d15 - d14);
            double d18 = d16 - d17;
            double d19 = d15 * d10;
            double d20 = d10 * d14;
            dExp2 = (Math.exp(d19) * d18) + (Math.exp(d20) * d17);
            dExp = (d18 * d15 * Math.exp(d19)) + (d17 * d14 * Math.exp(d20));
        } else if (f13 == 1.0f) {
            double d21 = f12;
            double d22 = ((double) f11) + (d12 * d21);
            double d23 = (-d12) * d10;
            double d24 = d21 + (d10 * d22);
            dExp2 = d24 * Math.exp(d23);
            dExp = (d24 * Math.exp(d23) * (-this.f12643b)) + (d22 * Math.exp(d23));
        } else {
            double d25 = 1;
            double dSqrt2 = d12 * Math.sqrt(d25 - d11);
            double d26 = f12;
            double d27 = (d25 / dSqrt2) * (((-d13) * d26) + ((double) f11));
            double d28 = dSqrt2 * d10;
            double d29 = d10 * d13;
            double dExp3 = Math.exp(d29) * ((Math.cos(d28) * d26) + (Math.sin(d28) * d27));
            dExp = (d13 * dExp3) + (Math.exp(d29) * (((-dSqrt2) * d26 * Math.sin(d28)) + (dSqrt2 * d27 * Math.cos(d28))));
            dExp2 = dExp3;
        }
        return AbstractC4393z0.m17170a((((long) Float.floatToRawIntBits((float) dExp)) & 4294967295L) | (Float.floatToRawIntBits((float) (dExp2 + ((double) this.f12642a))) << 32));
    }
}
