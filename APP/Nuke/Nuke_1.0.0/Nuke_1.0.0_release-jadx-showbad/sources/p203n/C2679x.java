package p203n;

/* JADX INFO: renamed from: n.x */
/* JADX INFO: loaded from: classes.dex */
public final class C2679x implements InterfaceC2678w {

    /* JADX INFO: renamed from: a */
    public final float f8544a;

    /* JADX INFO: renamed from: b */
    public final C2625H f8545b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2679x(float f2, float f5, float f6) {
        this.f8544a = f6;
        C2625H c2625h = new C2625H();
        c2625h.f8336a = 1.0f;
        c2625h.f8337b = Math.sqrt(50.0d);
        c2625h.f8338c = 1.0f;
        if (f2 < 0.0f) {
            AbstractC2624G.m4574a("Damping ratio must be non-negative");
        }
        c2625h.f8338c = f2;
        double d5 = c2625h.f8337b;
        if (((float) (d5 * d5)) <= 0.0f) {
            AbstractC2624G.m4574a("Spring stiffness constant must be positive.");
        }
        c2625h.f8337b = Math.sqrt(f5);
        this.f8545b = c2625h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p203n.InterfaceC2678w
    /* JADX INFO: renamed from: b */
    public final float mo4635b(long j5, float f2, float f5, float f6) {
        C2625H c2625h = this.f8545b;
        c2625h.f8336a = f5;
        return Float.intBitsToFloat((int) (c2625h.m4576a(f2, f6, j5 / 1000000) >> 32));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p203n.InterfaceC2678w
    /* JADX INFO: renamed from: c */
    public final float mo4636c(long j5, float f2, float f5, float f6) {
        C2625H c2625h = this.f8545b;
        c2625h.f8336a = f5;
        return Float.intBitsToFloat((int) (c2625h.m4576a(f2, f6, j5 / 1000000) & 4294967295L));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0211  */
    @Override // p203n.InterfaceC2678w
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long mo4637d(float f2, float f5, float f6) {
        double dLog;
        int i5;
        long j5;
        C2625H c2625h = this.f8545b;
        double d5 = c2625h.f8337b;
        float f7 = (float) (d5 * d5);
        float f8 = c2625h.f8338c;
        float f9 = this.f8544a;
        float f10 = (f2 - f5) / f9;
        float f11 = f6 / f9;
        if (f8 == 0.0f) {
            j5 = 9223372036854L;
        } else {
            double d6 = f7;
            double d7 = f8;
            double d8 = f11;
            double d9 = f10;
            double d10 = 1.0f;
            double dSqrt = d7 * 2.0d * Math.sqrt(d6);
            double d11 = (dSqrt * dSqrt) - (d6 * 4.0d);
            double dSqrt2 = d11 < 0.0d ? 0.0d : Math.sqrt(d11);
            double d12 = -dSqrt;
            double d13 = (d12 + dSqrt2) * 0.5d;
            double dSqrt3 = (d11 < 0.0d ? Math.sqrt(Math.abs(d11)) : 0.0d) * 0.5d;
            double d14 = (d12 - dSqrt2) * 0.5d;
            if (d9 == 0.0d && d8 == 0.0d) {
                j5 = 0;
            } else {
                if (d9 < 0.0d) {
                    d8 = -d8;
                }
                double dAbs = Math.abs(d9);
                double dAbs2 = Double.MAX_VALUE;
                if (d7 > 1.0d) {
                    double d15 = (d13 * dAbs) - d8;
                    double d16 = d13 - d14;
                    double d17 = d15 / d16;
                    double d18 = dAbs - d17;
                    dLog = Math.log(Math.abs(d10 / d18)) / d13;
                    double dLog2 = Math.log(Math.abs(d10 / d17)) / d14;
                    if ((Double.doubleToRawLongBits(dLog) & Long.MAX_VALUE) >= 9218868437227405312L) {
                        dLog = dLog2;
                    } else if ((Double.doubleToRawLongBits(dLog2) & Long.MAX_VALUE) < 9218868437227405312L) {
                        dLog = Math.max(dLog, dLog2);
                    }
                    double d19 = d18 * d13;
                    double dLog3 = Math.log(d19 / ((-d17) * d14)) / (d14 - d13);
                    if (Double.isNaN(dLog3) || dLog3 <= 0.0d) {
                        d10 = -d10;
                    } else if (dLog3 > 0.0d) {
                        if ((-((Math.exp(dLog3 * d14) * d17) + (Math.exp(d13 * dLog3) * d18))) < d10) {
                            d10 = -d10;
                            dLog = (d17 <= 0.0d || d18 >= 0.0d) ? dLog : 0.0d;
                        } else {
                            dLog = Math.log((-((d17 * d14) * d14)) / (d19 * d13)) / d16;
                        }
                    }
                    double d20 = d17 * d14;
                    if (Math.abs((Math.exp(d14 * dLog) * d20) + (Math.exp(d13 * dLog) * d19)) >= 1.0E-4d) {
                        int i6 = 0;
                        while (dAbs2 > 0.001d && i6 < 100) {
                            i6++;
                            double d21 = d13 * dLog;
                            double d22 = d14 * dLog;
                            double dExp = dLog - ((((Math.exp(d22) * d17) + (Math.exp(d21) * d18)) + d10) / ((Math.exp(d22) * d20) + (Math.exp(d21) * d19)));
                            dAbs2 = Math.abs(dLog - dExp);
                            dLog = dExp;
                        }
                    }
                } else if (d7 < 1.0d) {
                    double d23 = (d8 - (d13 * dAbs)) / dSqrt3;
                    dLog = Math.log(d10 / Math.sqrt((d23 * d23) + (dAbs * dAbs))) / d13;
                } else {
                    double d24 = d13 * dAbs;
                    double d25 = d8 - d24;
                    double dLog4 = Math.log(Math.abs(d10 / dAbs)) / d13;
                    double dLog5 = Math.log(Math.abs(d10 / d25));
                    double dLog6 = dLog5;
                    for (int i7 = 0; i7 < 6; i7++) {
                        dLog6 = dLog5 - Math.log(Math.abs(dLog6 / d13));
                    }
                    double d26 = dLog6 / d13;
                    if ((Double.doubleToRawLongBits(dLog4) & Long.MAX_VALUE) >= 9218868437227405312L) {
                        dLog4 = d26;
                    } else if ((Double.doubleToRawLongBits(d26) & Long.MAX_VALUE) < 9218868437227405312L) {
                        dLog4 = Math.max(dLog4, d26);
                    }
                    double d27 = (-(d24 + d25)) / (d13 * d25);
                    double d28 = d13 * d27;
                    double dExp2 = (Math.exp(d28) * d25 * d27) + (Math.exp(d28) * dAbs);
                    if (Double.isNaN(d27) || d27 <= 0.0d) {
                        d10 = -d10;
                        dLog = dLog4;
                        i5 = 0;
                        while (dAbs2 > 0.001d && i5 < 100) {
                            i5++;
                            double d29 = d13 * dLog;
                            double dExp3 = dLog - (((Math.exp(d29) * ((d25 * dLog) + dAbs)) + d10) / (Math.exp(d29) * (((((double) 1) + d29) * d25) + d24)));
                            dAbs2 = Math.abs(dLog - dExp3);
                            dLog = dExp3;
                        }
                        break;
                    }
                    if (d27 <= 0.0d || (-dExp2) >= d10) {
                        dLog4 = (-(2.0d / d13)) - (dAbs / d25);
                        dLog = dLog4;
                        i5 = 0;
                        while (dAbs2 > 0.001d) {
                            i5++;
                            double d292 = d13 * dLog;
                            double dExp32 = dLog - (((Math.exp(d292) * ((d25 * dLog) + dAbs)) + d10) / (Math.exp(d292) * (((((double) 1) + d292) * d25) + d24)));
                            dAbs2 = Math.abs(dLog - dExp32);
                            dLog = dExp32;
                        }
                    } else {
                        if (d25 < 0.0d && dAbs > 0.0d) {
                            dLog4 = 0.0d;
                        }
                        d10 = -d10;
                        dLog = dLog4;
                        i5 = 0;
                        while (dAbs2 > 0.001d) {
                        }
                    }
                }
                j5 = (long) (dLog * 1000.0d);
            }
        }
        return j5 * 1000000;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p203n.InterfaceC2678w
    /* JADX INFO: renamed from: e */
    public final float mo4638e(float f2, float f5, float f6) {
        return 0.0f;
    }
}
