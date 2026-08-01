package p163l;

/* JADX INFO: renamed from: l.j1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4314j1 {
    /* JADX INFO: renamed from: a */
    public static final long m16952a(double d10, double d11, double d12, double d13, double d14) {
        double dSqrt = 2.0d * d11 * Math.sqrt(d10);
        double d15 = (dSqrt * dSqrt) - (4.0d * d10);
        double dSqrt2 = d15 < 0.0d ? 0.0d : Math.sqrt(d15);
        double d16 = -dSqrt;
        return m16955d((d16 + dSqrt2) * 0.5d, (d15 < 0.0d ? Math.sqrt(Math.abs(d15)) : 0.0d) * 0.5d, (d16 - dSqrt2) * 0.5d, d11, d12, d13, d14);
    }

    /* JADX INFO: renamed from: b */
    public static final long m16953b(float f10, float f11, float f12, float f13, float f14) {
        if (f11 == 0.0f) {
            return 9223372036854L;
        }
        return m16952a(f10, f11, f12, f13, f14);
    }

    /* JADX INFO: renamed from: c */
    public static final double m16954c(double d10, double d11, double d12, double d13) {
        double d14 = d13;
        double d15 = d10 * d11;
        double d16 = d12 - d15;
        double dLog = Math.log(Math.abs(d14 / d11)) / d10;
        double dLog2 = Math.log(Math.abs(d14 / d16));
        int i10 = 0;
        double dLog3 = dLog2;
        for (int i11 = 0; i11 < 6; i11++) {
            dLog3 = dLog2 - Math.log(Math.abs(dLog3 / d10));
        }
        double d17 = dLog3 / d10;
        if (!((Double.doubleToRawLongBits(dLog) & Long.MAX_VALUE) < 9218868437227405312L)) {
            dLog = d17;
        } else if ((Double.doubleToRawLongBits(d17) & Long.MAX_VALUE) < 9218868437227405312L) {
            dLog = Math.max(dLog, d17);
        }
        double d18 = (-(d15 + d16)) / (d10 * d16);
        double d19 = d10 * d18;
        double dExp = (Math.exp(d19) * d11) + (d16 * d18 * Math.exp(d19));
        if (Double.isNaN(d18) || d18 <= 0.0d) {
            d14 = -d14;
        } else if (d18 <= 0.0d || (-dExp) >= d14) {
            dLog = (-(2.0d / d10)) - (d11 / d16);
        } else {
            if (d16 < 0.0d && d11 > 0.0d) {
                dLog = 0.0d;
            }
            d14 = -d14;
        }
        double dAbs = Double.MAX_VALUE;
        while (dAbs > 0.001d && i10 < 100) {
            i10++;
            double d20 = d10 * dLog;
            double d21 = d14;
            double dExp2 = dLog - ((((d11 + (d16 * dLog)) * Math.exp(d20)) + d14) / ((((((double) 1) + d20) * d16) + d15) * Math.exp(d20)));
            dAbs = Math.abs(dLog - dExp2);
            dLog = dExp2;
            d14 = d21;
        }
        return dLog;
    }

    /* JADX INFO: renamed from: d */
    public static final long m16955d(double d10, double d11, double d12, double d13, double d14, double d15, double d16) {
        double d17 = d14;
        if (d15 == 0.0d && d17 == 0.0d) {
            return 0L;
        }
        if (d15 < 0.0d) {
            d17 = -d17;
        }
        double d18 = d17;
        double dAbs = Math.abs(d15);
        return (long) ((d13 > 1.0d ? m16956e(d10, d12, dAbs, d18, d16) : d13 < 1.0d ? m16958g(d10, d11, dAbs, d18, d16) : m16954c(d10, dAbs, d18, d16)) * 1000.0d);
    }

    /* JADX INFO: renamed from: e */
    public static final double m16956e(double d10, double d11, double d12, double d13, double d14) {
        double d15 = d14;
        double d16 = d10 - d11;
        double d17 = ((d10 * d12) - d13) / d16;
        double d18 = d12 - d17;
        double dLog = Math.log(Math.abs(d15 / d18)) / d10;
        double dLog2 = Math.log(Math.abs(d15 / d17)) / d11;
        if ((Double.doubleToRawLongBits(dLog) & Long.MAX_VALUE) < 9218868437227405312L) {
            if ((Double.doubleToRawLongBits(dLog2) & Long.MAX_VALUE) < 9218868437227405312L) {
                dLog = Math.max(dLog, dLog2);
            }
        } else {
            dLog = dLog2;
        }
        double d19 = d18 * d10;
        double dLog3 = Math.log(d19 / ((-d17) * d11)) / (d11 - d10);
        if (Double.isNaN(dLog3) || dLog3 <= 0.0d) {
            d15 = -d15;
        } else if (dLog3 <= 0.0d || (-m16957f(d18, d10, dLog3, d17, d11)) >= d15) {
            dLog = Math.log((-((d17 * d11) * d11)) / (d19 * d10)) / d16;
        } else {
            if (d17 > 0.0d && d18 < 0.0d) {
                dLog = 0.0d;
            }
            d15 = -d15;
        }
        double d20 = d17 * d11;
        if (Math.abs((Math.exp(d10 * dLog) * d19) + (Math.exp(d11 * dLog) * d20)) < 1.0E-4d) {
            return dLog;
        }
        double dAbs = Double.MAX_VALUE;
        int i10 = 0;
        while (dAbs > 0.001d && i10 < 100) {
            i10++;
            double d21 = d10 * dLog;
            double d22 = d11 * dLog;
            double dExp = dLog - ((((Math.exp(d21) * d18) + (Math.exp(d22) * d17)) + d15) / ((Math.exp(d21) * d19) + (Math.exp(d22) * d20)));
            dAbs = Math.abs(dLog - dExp);
            dLog = dExp;
        }
        return dLog;
    }

    /* JADX INFO: renamed from: f */
    public static final double m16957f(double d10, double d11, double d12, double d13, double d14) {
        return (d10 * Math.exp(d11 * d12)) + (d13 * Math.exp(d14 * d12));
    }

    /* JADX INFO: renamed from: g */
    public static final double m16958g(double d10, double d11, double d12, double d13, double d14) {
        double d15 = (d13 - (d10 * d12)) / d11;
        return Math.log(d14 / Math.sqrt((d12 * d12) + (d15 * d15))) / d10;
    }
}
