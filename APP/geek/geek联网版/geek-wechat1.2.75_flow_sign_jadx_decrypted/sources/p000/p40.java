package p000;

/* JADX INFO: loaded from: classes.dex */
public final class p40 {

    /* JADX INFO: renamed from: a */
    public double f3582a;

    /* JADX INFO: renamed from: b */
    public double f3583b;

    /* JADX INFO: renamed from: c */
    public boolean f3584c;

    /* JADX INFO: renamed from: d */
    public double f3585d;

    /* JADX INFO: renamed from: e */
    public double f3586e;

    /* JADX INFO: renamed from: f */
    public double f3587f;

    /* JADX INFO: renamed from: g */
    public double f3588g;

    /* JADX INFO: renamed from: h */
    public double f3589h;

    /* JADX INFO: renamed from: i */
    public double f3590i;

    /* JADX INFO: renamed from: j */
    public final C0744th f3591j;

    public p40() {
        this.f3582a = Math.sqrt(1500.0d);
        this.f3583b = 0.5d;
        this.f3584c = false;
        this.f3590i = Double.MAX_VALUE;
        this.f3591j = new C0744th();
    }

    /* JADX INFO: renamed from: a */
    public final void m2063a(float f) {
        if (f < 0.0f) {
            throw new IllegalArgumentException("Damping ratio must be non-negative");
        }
        this.f3583b = f;
        this.f3584c = false;
    }

    /* JADX INFO: renamed from: b */
    public final void m2064b(float f) {
        if (f <= 0.0f) {
            throw new IllegalArgumentException("Spring stiffness constant must be positive.");
        }
        this.f3582a = Math.sqrt(f);
        this.f3584c = false;
    }

    /* JADX INFO: renamed from: c */
    public final C0744th m2065c(double d, double d2, long j) {
        double dSin;
        double dCos;
        if (!this.f3584c) {
            if (this.f3590i == Double.MAX_VALUE) {
                throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
            }
            double d3 = this.f3583b;
            if (d3 > 1.0d) {
                double d4 = this.f3582a;
                this.f3587f = (Math.sqrt((d3 * d3) - 1.0d) * d4) + ((-d3) * d4);
                double d5 = this.f3583b;
                double d6 = this.f3582a;
                this.f3588g = ((-d5) * d6) - (Math.sqrt((d5 * d5) - 1.0d) * d6);
            } else if (d3 >= 0.0d && d3 < 1.0d) {
                this.f3589h = Math.sqrt(1.0d - (d3 * d3)) * this.f3582a;
            }
            this.f3584c = true;
        }
        double d7 = j / 1000.0d;
        double d8 = d - this.f3590i;
        double d9 = this.f3583b;
        if (d9 > 1.0d) {
            double d10 = this.f3588g;
            double d11 = ((d10 * d8) - d2) / (d10 - this.f3587f);
            double d12 = d8 - d11;
            dSin = (Math.pow(2.718281828459045d, this.f3587f * d7) * d11) + (Math.pow(2.718281828459045d, d10 * d7) * d12);
            double d13 = this.f3588g;
            double dPow = Math.pow(2.718281828459045d, d13 * d7) * d12 * d13;
            double d14 = this.f3587f;
            dCos = (Math.pow(2.718281828459045d, d14 * d7) * d11 * d14) + dPow;
        } else if (d9 == 1.0d) {
            double d15 = this.f3582a;
            double d16 = (d15 * d8) + d2;
            double d17 = (d16 * d7) + d8;
            double dPow2 = Math.pow(2.718281828459045d, (-d15) * d7) * d17;
            double dPow3 = Math.pow(2.718281828459045d, (-this.f3582a) * d7) * d17;
            double d18 = -this.f3582a;
            dCos = (Math.pow(2.718281828459045d, d18 * d7) * d16) + (dPow3 * d18);
            dSin = dPow2;
        } else {
            double d19 = 1.0d / this.f3589h;
            double d20 = this.f3582a;
            double d21 = ((d9 * d20 * d8) + d2) * d19;
            dSin = ((Math.sin(this.f3589h * d7) * d21) + (Math.cos(this.f3589h * d7) * d8)) * Math.pow(2.718281828459045d, (-d9) * d20 * d7);
            double d22 = this.f3582a;
            double d23 = this.f3583b;
            double d24 = (-d22) * dSin * d23;
            double dPow4 = Math.pow(2.718281828459045d, (-d23) * d22 * d7);
            double d25 = this.f3589h;
            double dSin2 = Math.sin(d25 * d7) * (-d25) * d8;
            double d26 = this.f3589h;
            dCos = (((Math.cos(d26 * d7) * d21 * d26) + dSin2) * dPow4) + d24;
        }
        float f = (float) (dSin + this.f3590i);
        C0744th c0744th = this.f3591j;
        c0744th.f4523a = f;
        c0744th.f4524b = (float) dCos;
        return c0744th;
    }

    public p40(float f) {
        this.f3582a = Math.sqrt(1500.0d);
        this.f3583b = 0.5d;
        this.f3584c = false;
        this.f3591j = new C0744th();
        this.f3590i = f;
    }
}
