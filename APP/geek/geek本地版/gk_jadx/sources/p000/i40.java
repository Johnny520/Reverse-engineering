package p000;

/* JADX INFO: loaded from: classes.dex */
public final class i40 {

    /* JADX INFO: renamed from: a */
    public double f2344a;

    /* JADX INFO: renamed from: b */
    public double f2345b;

    /* JADX INFO: renamed from: c */
    public boolean f2346c;

    /* JADX INFO: renamed from: d */
    public double f2347d;

    /* JADX INFO: renamed from: e */
    public double f2348e;

    /* JADX INFO: renamed from: f */
    public double f2349f;

    /* JADX INFO: renamed from: g */
    public double f2350g;

    /* JADX INFO: renamed from: h */
    public double f2351h;

    /* JADX INFO: renamed from: i */
    public double f2352i;

    /* JADX INFO: renamed from: j */
    public final C0671rh f2353j;

    public i40() {
        this.f2344a = Math.sqrt(1500.0d);
        this.f2345b = 0.5d;
        this.f2346c = false;
        this.f2352i = Double.MAX_VALUE;
        this.f2353j = new C0671rh();
    }

    /* JADX INFO: renamed from: a */
    public final void m1393a(float f) {
        if (f < 0.0f) {
            throw new IllegalArgumentException("Damping ratio must be non-negative");
        }
        this.f2345b = f;
        this.f2346c = false;
    }

    /* JADX INFO: renamed from: b */
    public final void m1394b(float f) {
        if (f <= 0.0f) {
            throw new IllegalArgumentException("Spring stiffness constant must be positive.");
        }
        this.f2344a = Math.sqrt(f);
        this.f2346c = false;
    }

    /* JADX INFO: renamed from: c */
    public final C0671rh m1395c(double d, double d2, long j) {
        double dSin;
        double dCos;
        if (!this.f2346c) {
            if (this.f2352i == Double.MAX_VALUE) {
                throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
            }
            double d3 = this.f2345b;
            if (d3 > 1.0d) {
                double d4 = this.f2344a;
                this.f2349f = (Math.sqrt((d3 * d3) - 1.0d) * d4) + ((-d3) * d4);
                double d5 = this.f2345b;
                double d6 = this.f2344a;
                this.f2350g = ((-d5) * d6) - (Math.sqrt((d5 * d5) - 1.0d) * d6);
            } else if (d3 >= 0.0d && d3 < 1.0d) {
                this.f2351h = Math.sqrt(1.0d - (d3 * d3)) * this.f2344a;
            }
            this.f2346c = true;
        }
        double d7 = j / 1000.0d;
        double d8 = d - this.f2352i;
        double d9 = this.f2345b;
        if (d9 > 1.0d) {
            double d10 = this.f2350g;
            double d11 = ((d10 * d8) - d2) / (d10 - this.f2349f);
            double d12 = d8 - d11;
            dSin = (Math.pow(2.718281828459045d, this.f2349f * d7) * d11) + (Math.pow(2.718281828459045d, d10 * d7) * d12);
            double d13 = this.f2350g;
            double dPow = Math.pow(2.718281828459045d, d13 * d7) * d12 * d13;
            double d14 = this.f2349f;
            dCos = (Math.pow(2.718281828459045d, d14 * d7) * d11 * d14) + dPow;
        } else if (d9 == 1.0d) {
            double d15 = this.f2344a;
            double d16 = (d15 * d8) + d2;
            double d17 = (d16 * d7) + d8;
            double dPow2 = Math.pow(2.718281828459045d, (-d15) * d7) * d17;
            double dPow3 = Math.pow(2.718281828459045d, (-this.f2344a) * d7) * d17;
            double d18 = -this.f2344a;
            dCos = (Math.pow(2.718281828459045d, d18 * d7) * d16) + (dPow3 * d18);
            dSin = dPow2;
        } else {
            double d19 = 1.0d / this.f2351h;
            double d20 = this.f2344a;
            double d21 = ((d9 * d20 * d8) + d2) * d19;
            dSin = ((Math.sin(this.f2351h * d7) * d21) + (Math.cos(this.f2351h * d7) * d8)) * Math.pow(2.718281828459045d, (-d9) * d20 * d7);
            double d22 = this.f2344a;
            double d23 = this.f2345b;
            double d24 = (-d22) * dSin * d23;
            double dPow4 = Math.pow(2.718281828459045d, (-d23) * d22 * d7);
            double d25 = this.f2351h;
            double dSin2 = Math.sin(d25 * d7) * (-d25) * d8;
            double d26 = this.f2351h;
            dCos = (((Math.cos(d26 * d7) * d21 * d26) + dSin2) * dPow4) + d24;
        }
        float f = (float) (dSin + this.f2352i);
        C0671rh c0671rh = this.f2353j;
        c0671rh.f4284a = f;
        c0671rh.f4285b = (float) dCos;
        return c0671rh;
    }

    public i40(float f) {
        this.f2344a = Math.sqrt(1500.0d);
        this.f2345b = 0.5d;
        this.f2346c = false;
        this.f2353j = new C0671rh();
        this.f2352i = f;
    }
}
