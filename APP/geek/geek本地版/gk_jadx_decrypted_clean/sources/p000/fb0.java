package p000;

/* JADX INFO: loaded from: classes.dex */
public final class fb0 {

    /* JADX INFO: renamed from: k */
    public static final fb0 f1917k;

    /* JADX INFO: renamed from: a */
    public final double f1918a;

    /* JADX INFO: renamed from: b */
    public final double f1919b;

    /* JADX INFO: renamed from: c */
    public final double f1920c;

    /* JADX INFO: renamed from: d */
    public final double f1921d;

    /* JADX INFO: renamed from: e */
    public final double f1922e;

    /* JADX INFO: renamed from: f */
    public final double f1923f;

    /* JADX INFO: renamed from: g */
    public final double[] f1924g;

    /* JADX INFO: renamed from: h */
    public final double f1925h;

    /* JADX INFO: renamed from: i */
    public final double f1926i;

    /* JADX INFO: renamed from: j */
    public final double f1927j;

    static {
        double[] dArr = a80.f70c;
        double dM36J = (a80.m36J(50.0d) * 63.66197723675813d) / 100.0d;
        double dMax = Math.max(0.1d, 50.0d);
        double[][] dArr2 = a80.f68a;
        double d = dArr[0];
        double[] dArr3 = dArr2[0];
        double d2 = dArr3[0] * d;
        double d3 = dArr[1];
        double d4 = (dArr3[1] * d3) + d2;
        double d5 = dArr[2];
        double d6 = (dArr3[2] * d5) + d4;
        double[] dArr4 = dArr2[1];
        double d7 = (dArr4[2] * d5) + (dArr4[1] * d3) + (dArr4[0] * d);
        double[] dArr5 = dArr2[2];
        double d8 = (d5 * dArr5[2]) + (d3 * dArr5[1]) + (d * dArr5[0]);
        double dExp = (1.0d - (Math.exp(((-dM36J) - 42.0d) / 92.0d) * 0.2777777777777778d)) * 1.0d;
        if (dExp < 0.0d) {
            dExp = 0.0d;
        } else if (dExp > 1.0d) {
            dExp = 1.0d;
        }
        double[] dArr6 = {(((100.0d / d6) * dExp) + 1.0d) - dExp, (((100.0d / d7) * dExp) + 1.0d) - dExp, (((100.0d / d8) * dExp) + 1.0d) - dExp};
        double d9 = 5.0d * dM36J;
        double d10 = 1.0d / (d9 + 1.0d);
        double d11 = d10 * d10 * d10 * d10;
        double d12 = 1.0d - d11;
        double dCbrt = (Math.cbrt(d9) * 0.1d * d12 * d12) + (d11 * dM36J);
        double dM36J2 = a80.m36J(dMax) / dArr[1];
        double dSqrt = Math.sqrt(dM36J2) + 1.48d;
        double dPow = 0.725d / Math.pow(dM36J2, 0.2d);
        double[] dArr7 = {Math.pow(((dArr6[0] * dCbrt) * d6) / 100.0d, 0.42d), Math.pow(((dArr6[1] * dCbrt) * d7) / 100.0d, 0.42d), Math.pow(((dArr6[2] * dCbrt) * d8) / 100.0d, 0.42d)};
        double d13 = dArr7[0];
        double d14 = (d13 * 400.0d) / (d13 + 27.13d);
        double d15 = dArr7[1];
        double d16 = (d15 * 400.0d) / (d15 + 27.13d);
        double d17 = dArr7[2];
        double[] dArr8 = {d14, d16, (400.0d * d17) / (d17 + 27.13d)};
        f1917k = new fb0(dM36J2, ((dArr8[2] * 0.05d) + (dArr8[0] * 2.0d) + dArr8[1]) * dPow, dPow, dPow, 0.69d, 1.0d, dArr6, dCbrt, Math.pow(dCbrt, 0.25d), dSqrt);
    }

    public fb0(double d, double d2, double d3, double d4, double d5, double d6, double[] dArr, double d7, double d8, double d9) {
        this.f1923f = d;
        this.f1918a = d2;
        this.f1919b = d3;
        this.f1920c = d4;
        this.f1921d = d5;
        this.f1922e = d6;
        this.f1924g = dArr;
        this.f1925h = d7;
        this.f1926i = d8;
        this.f1927j = d9;
    }
}
