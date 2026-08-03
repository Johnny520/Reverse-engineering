package p000;

/* JADX INFO: renamed from: Py */
/* JADX INFO: loaded from: classes.dex */
public final class C0686Py {

    /* JADX INFO: renamed from: a */
    public double f2204a;

    /* JADX INFO: renamed from: b */
    public double f2205b;

    /* JADX INFO: renamed from: c */
    public boolean f2206c;

    /* JADX INFO: renamed from: d */
    public double f2207d;

    /* JADX INFO: renamed from: e */
    public double f2208e;

    /* JADX INFO: renamed from: f */
    public double f2209f;

    /* JADX INFO: renamed from: g */
    public double f2210g;

    /* JADX INFO: renamed from: h */
    public double f2211h;

    /* JADX INFO: renamed from: i */
    public double f2212i;

    /* JADX INFO: renamed from: j */
    public final C0751Re f2213j;

    public C0686Py() {
        this.f2204a = Math.sqrt(1500.0d);
        this.f2205b = 0.5d;
        this.f2206c = false;
        this.f2212i = Double.MAX_VALUE;
        this.f2213j = new C0751Re();
    }

    /* JADX INFO: renamed from: a */
    public final C0751Re m1384a(double d, double d2, long j) {
        double dSin;
        double dCos;
        if (!this.f2206c) {
            if (this.f2212i == Double.MAX_VALUE) {
                throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
            }
            double d3 = this.f2205b;
            if (d3 > 1.0d) {
                double d4 = this.f2204a;
                this.f2209f = (Math.sqrt((d3 * d3) - 1.0d) * d4) + ((-d3) * d4);
                double d5 = this.f2205b;
                double d6 = this.f2204a;
                this.f2210g = ((-d5) * d6) - (Math.sqrt((d5 * d5) - 1.0d) * d6);
            } else if (d3 >= 0.0d && d3 < 1.0d) {
                this.f2211h = Math.sqrt(1.0d - (d3 * d3)) * this.f2204a;
            }
            this.f2206c = true;
        }
        double d7 = j / 1000.0d;
        double d8 = d - this.f2212i;
        double d9 = this.f2205b;
        if (d9 > 1.0d) {
            double d10 = this.f2210g;
            double d11 = ((d10 * d8) - d2) / (d10 - this.f2209f);
            double d12 = d8 - d11;
            dSin = (Math.pow(2.718281828459045d, this.f2209f * d7) * d11) + (Math.pow(2.718281828459045d, d10 * d7) * d12);
            double d13 = this.f2210g;
            double dPow = Math.pow(2.718281828459045d, d13 * d7) * d12 * d13;
            double d14 = this.f2209f;
            dCos = (Math.pow(2.718281828459045d, d14 * d7) * d11 * d14) + dPow;
        } else if (d9 == 1.0d) {
            double d15 = this.f2204a;
            double d16 = (d15 * d8) + d2;
            double d17 = (d16 * d7) + d8;
            double dPow2 = Math.pow(2.718281828459045d, (-d15) * d7) * d17;
            double dPow3 = Math.pow(2.718281828459045d, (-this.f2204a) * d7) * d17;
            double d18 = -this.f2204a;
            dCos = (Math.pow(2.718281828459045d, d18 * d7) * d16) + (dPow3 * d18);
            dSin = dPow2;
        } else {
            double d19 = 1.0d / this.f2211h;
            double d20 = this.f2204a;
            double d21 = ((d9 * d20 * d8) + d2) * d19;
            dSin = ((Math.sin(this.f2211h * d7) * d21) + (Math.cos(this.f2211h * d7) * d8)) * Math.pow(2.718281828459045d, (-d9) * d20 * d7);
            double d22 = this.f2204a;
            double d23 = this.f2205b;
            double d24 = (-d22) * dSin * d23;
            double dPow4 = Math.pow(2.718281828459045d, (-d23) * d22 * d7);
            double d25 = this.f2211h;
            double dSin2 = Math.sin(d25 * d7) * (-d25) * d8;
            double d26 = this.f2211h;
            dCos = (((Math.cos(d26 * d7) * d21 * d26) + dSin2) * dPow4) + d24;
        }
        float f = (float) (dSin + this.f2212i);
        C0751Re c0751Re = this.f2213j;
        c0751Re.f2387a = f;
        c0751Re.f2388b = (float) dCos;
        return c0751Re;
    }

    public C0686Py(float f) {
        this.f2204a = Math.sqrt(1500.0d);
        this.f2205b = 0.5d;
        this.f2206c = false;
        this.f2213j = new C0751Re();
        this.f2212i = f;
    }
}
