package p378z6;

import p007a7.AbstractC0018a;

/* JADX INFO: renamed from: z6.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C6102b {

    /* JADX INFO: renamed from: l */
    public static final C6102b f24622l = new C6102b();

    /* JADX INFO: renamed from: a */
    public final double f24623a;

    /* JADX INFO: renamed from: b */
    public final double f24624b;

    /* JADX INFO: renamed from: c */
    public final double f24625c;

    /* JADX INFO: renamed from: d */
    public final double f24626d;

    /* JADX INFO: renamed from: e */
    public final double f24627e;

    /* JADX INFO: renamed from: f */
    public final double f24628f;

    /* JADX INFO: renamed from: g */
    public final double f24629g;

    /* JADX INFO: renamed from: h */
    public final double f24630h;

    /* JADX INFO: renamed from: i */
    public final double f24631i;

    /* JADX INFO: renamed from: j */
    public final double f24632j;

    /* JADX INFO: renamed from: k */
    public final double[][][] f24633k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C6102b() {
        double dCos = Math.cos(0.39269908169872414d);
        this.f24623a = dCos;
        double dSin = Math.sin(0.39269908169872414d);
        this.f24624b = dSin;
        double dTan = 1.0d / Math.tan(0.39269908169872414d);
        this.f24625c = dTan;
        double d10 = dCos * dCos;
        this.f24626d = d10;
        double d11 = dSin * dSin;
        this.f24627e = d11;
        double d12 = d11 * dSin;
        this.f24628f = d12;
        double d13 = d11 + 9.0d;
        this.f24629g = (((((2.8284271247461903d * dCos) * d13) + ((((1.4142135623730951d - r21) * 2.0d) * d12) - 9.0d)) - (((d11 * 2.0d) + 9.0d) * (d10 * 2.0d))) * dSin * 2.0d) + ((((8.485281374238571d * d10) + (1.4142135623730951d - (6.0d * dCos))) - ((d10 * dCos) * 4.0d)) * 27.0d * dTan);
        this.f24630h = ((((d10 * (-1.1715728752538097d)) + ((1.6568542494923806d * dCos) - 0.5857864376269049d)) * (-81.0d)) * dTan) - (((((-0.5857864376269049d) * dCos) * d13) + ((d12 * 1.4142135623730951d) + 3.727922061357857d)) * (4.0d * dSin));
        this.f24631i = ((dSin * (-0.3431457505076194d)) + (((dCos * (-0.3431457505076194d)) + 0.24264068711928566d) * 9.0d * dTan)) * 9.0d;
        this.f24632j = dTan * 2.7136367114850355d;
        this.f24633k = new double[][][]{new double[][]{m10859a(0.0d), m10860b(0.0d, 1.0d)}, new double[][]{m10860b(1.0d, 0.0d), m10859a(1.0d)}};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final double[] m10859a(double d10) {
        double d11 = -(0.6666666666666666d * d10);
        double d12 = this.f24628f;
        double d13 = this.f24624b;
        double dM240d = AbstractC0018a.m240d(this.f24632j, this.f24631i, (8.0d * d11 * d12 * d13) + this.f24630h, this.f24629g);
        double d14 = (((-0.7071067811865476d) + d13) / dM240d) + 0.7071067811865476d;
        double d15 = this.f24623a;
        double d16 = ((0.7071067811865476d - d15) / dM240d) + 0.2928932188134524d;
        double d17 = d14 - (this.f24625c * d16);
        double d18 = dM240d * 1.5d;
        double d19 = d17 - (((d18 * d16) * d16) / d12);
        double d20 = 1.0d - d16;
        double d21 = 1.0d - d14;
        double d22 = 1.0d - d17;
        double d23 = 1.0d - d11;
        double d24 = this.f24626d - this.f24627e;
        double dSqrt = (Math.sqrt((d24 * d24) - ((4.0d * d18) * (-(((d21 - d16) * d15) - ((d20 - d14) * d13))))) + (-d24)) / (2.0d * d18);
        double d25 = d15 * dSqrt;
        double d26 = dSqrt * d13;
        return new double[]{d11, 0.0d, d19, 0.0d, d17, 0.0d, d14, d16, d25 + d14, d26 + d16, d20 - d26, d21 - d25, d20, d21, 1.0d, d22, 1.0d, 1.0d - d19, 1.0d, d23};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final double[] m10860b(double d10, double d11) {
        double d12 = -(0.6666666666666666d * d10);
        double d13 = this.f24628f;
        double d14 = this.f24624b;
        double d15 = this.f24630h;
        double dM240d = AbstractC0018a.m240d(this.f24632j, this.f24631i, (d12 * 8.0d * d13 * d14) + d15, this.f24629g);
        double d16 = -(0.6666666666666666d * d11);
        double dM240d2 = AbstractC0018a.m240d(this.f24632j, this.f24631i, (d16 * 8.0d * d13 * d14) + d15, this.f24629g);
        double d17 = (-0.7071067811865476d) + d14;
        double d18 = (d17 / dM240d) + 0.7071067811865476d;
        double d19 = this.f24623a;
        double d20 = 0.7071067811865476d - d19;
        double d21 = (d20 / dM240d) + 0.2928932188134524d;
        double d22 = this.f24625c;
        double d23 = d18 - (d21 * d22);
        double d24 = dM240d * 1.5d;
        double d25 = d23 - (((d24 * d21) * d21) / d13);
        double d26 = (d17 / dM240d2) + 0.7071067811865476d;
        double d27 = (d20 / dM240d2) + 0.2928932188134524d;
        double d28 = d26 - (d22 * d27);
        double d29 = dM240d2 * 1.5d;
        double d30 = d28 - (((d29 * d27) * d27) / d13);
        double d31 = 1.0d - d27;
        double d32 = 1.0d - d26;
        double d33 = 1.0d - d28;
        double d34 = 1.0d - d16;
        double d35 = this.f24626d - this.f24627e;
        double d36 = d31 - d18;
        double d37 = d32 - d21;
        double d38 = -((d19 * d37) - (d14 * d36));
        double d39 = (d37 * d14) - (d36 * d19);
        double d40 = (d39 / d29) * 2.0d;
        double d41 = d24 * d29 * d29;
        double d42 = ((d35 * d35) * d35) / d41;
        double d43 = (((d38 * d35) * d35) + ((d24 * d39) * d39)) / d41;
        double d44 = (-d40) / 2.0d;
        double d45 = -d43;
        double d46 = ((d43 * d40) / 2.0d) - ((d42 * d42) / 8.0d);
        double d47 = ((d45 * 3.0d) - (d44 * d44)) / 3.0d;
        double d48 = ((d46 * 27.0d) + ((((d44 * 2.0d) * d44) * d44) - ((9.0d * d44) * d45))) / 27.0d;
        double d49 = -d47;
        double dCos = (Math.cos(Math.acos((-d48) / (Math.sqrt(((d49 * d47) * d47) / 27.0d) * 2.0d)) / 3.0d) * (Math.sqrt(d49 / 3.0d) * 2.0d)) - (d44 / 3.0d);
        double dSqrt = Math.sqrt((dCos * 2.0d) - d40);
        double dSqrt2 = (dSqrt - Math.sqrt((dSqrt * dSqrt) - (((d42 / (dSqrt * 2.0d)) + dCos) * 4.0d))) / 2.0d;
        double d50 = ((-d39) - ((d29 * dSqrt2) * dSqrt2)) / d35;
        return new double[]{d12, 0.0d, d25, 0.0d, d23, 0.0d, d18, d21, (d50 * d19) + d18, (d50 * d14) + d21, d31 - (d14 * dSqrt2), d32 - (dSqrt2 * d19), d31, d32, 1.0d, d33, 1.0d, 1.0d - d30, 1.0d, d34};
    }
}
