package p116i;

/* JADX INFO: renamed from: i.a0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1734a0 implements InterfaceC1805z {

    /* JADX INFO: renamed from: a */
    public final float f5770a;

    /* JADX INFO: renamed from: b */
    public final C1782q0 f5771b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1734a0(float f3, float f10, float f11) {
        this.f5770a = f11;
        C1782q0 c1782q0 = new C1782q0();
        c1782q0.f5930a = 1.0f;
        c1782q0.f5931b = Math.sqrt(50.0d);
        c1782q0.f5932c = 1.0f;
        if (f3 < 0.0f) {
            AbstractC1776o0.m4429a("Damping ratio must be non-negative");
        }
        c1782q0.f5932c = f3;
        double d10 = c1782q0.f5931b;
        if (((float) (d10 * d10)) <= 0.0f) {
            AbstractC1776o0.m4429a("Spring stiffness constant must be positive.");
        }
        c1782q0.f5931b = Math.sqrt(f10);
        this.f5771b = c1782q0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0211  */
    @Override // p116i.InterfaceC1805z
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long mo4353b(float f3, float f10, float f11) {
        double dLog;
        int i9;
        long j3;
        C1782q0 c1782q0 = this.f5771b;
        double d10 = c1782q0.f5931b;
        float f12 = (float) (d10 * d10);
        float f13 = c1782q0.f5932c;
        float f14 = this.f5770a;
        float f15 = (f3 - f10) / f14;
        float f16 = f11 / f14;
        if (f13 == 0.0f) {
            j3 = 9223372036854L;
        } else {
            double d11 = f12;
            double d12 = f13;
            double d13 = f16;
            double d14 = f15;
            double d15 = 1.0f;
            double dSqrt = d12 * 2.0d * Math.sqrt(d11);
            double d16 = (dSqrt * dSqrt) - (d11 * 4.0d);
            double dSqrt2 = d16 < 0.0d ? 0.0d : Math.sqrt(d16);
            double d17 = -dSqrt;
            double d18 = (d17 + dSqrt2) * 0.5d;
            double dSqrt3 = (d16 < 0.0d ? Math.sqrt(Math.abs(d16)) : 0.0d) * 0.5d;
            double d19 = (d17 - dSqrt2) * 0.5d;
            if (d14 == 0.0d && d13 == 0.0d) {
                j3 = 0;
            } else {
                if (d14 < 0.0d) {
                    d13 = -d13;
                }
                double dAbs = Math.abs(d14);
                double dAbs2 = Double.MAX_VALUE;
                if (d12 > 1.0d) {
                    double d20 = (d18 * dAbs) - d13;
                    double d21 = d18 - d19;
                    double d22 = d20 / d21;
                    double d23 = dAbs - d22;
                    dLog = Math.log(Math.abs(d15 / d23)) / d18;
                    double dLog2 = Math.log(Math.abs(d15 / d22)) / d19;
                    if ((Double.doubleToRawLongBits(dLog) & Long.MAX_VALUE) >= 9218868437227405312L) {
                        dLog = dLog2;
                    } else if ((Double.doubleToRawLongBits(dLog2) & Long.MAX_VALUE) < 9218868437227405312L) {
                        dLog = Math.max(dLog, dLog2);
                    }
                    double d24 = d23 * d18;
                    double dLog3 = Math.log(d24 / ((-d22) * d19)) / (d19 - d18);
                    if (Double.isNaN(dLog3) || dLog3 <= 0.0d) {
                        d15 = -d15;
                    } else if (dLog3 > 0.0d) {
                        if ((-((Math.exp(dLog3 * d19) * d22) + (Math.exp(d18 * dLog3) * d23))) < d15) {
                            d15 = -d15;
                            dLog = (d22 <= 0.0d || d23 >= 0.0d) ? dLog : 0.0d;
                        } else {
                            dLog = Math.log((-((d22 * d19) * d19)) / (d24 * d18)) / d21;
                        }
                    }
                    double d25 = d22 * d19;
                    if (Math.abs((Math.exp(d19 * dLog) * d25) + (Math.exp(d18 * dLog) * d24)) >= 1.0E-4d) {
                        int i10 = 0;
                        while (dAbs2 > 0.001d && i10 < 100) {
                            i10++;
                            double d26 = d18 * dLog;
                            double d27 = d19 * dLog;
                            double dExp = dLog - ((((Math.exp(d27) * d22) + (Math.exp(d26) * d23)) + d15) / ((Math.exp(d27) * d25) + (Math.exp(d26) * d24)));
                            dAbs2 = Math.abs(dLog - dExp);
                            dLog = dExp;
                        }
                    }
                } else if (d12 < 1.0d) {
                    double d28 = (d13 - (d18 * dAbs)) / dSqrt3;
                    dLog = Math.log(d15 / Math.sqrt((d28 * d28) + (dAbs * dAbs))) / d18;
                } else {
                    double d29 = d18 * dAbs;
                    double d30 = d13 - d29;
                    double dLog4 = Math.log(Math.abs(d15 / dAbs)) / d18;
                    double dLog5 = Math.log(Math.abs(d15 / d30));
                    double dLog6 = dLog5;
                    for (int i11 = 0; i11 < 6; i11++) {
                        dLog6 = dLog5 - Math.log(Math.abs(dLog6 / d18));
                    }
                    double d31 = dLog6 / d18;
                    if ((Double.doubleToRawLongBits(dLog4) & Long.MAX_VALUE) >= 9218868437227405312L) {
                        dLog4 = d31;
                    } else if ((Double.doubleToRawLongBits(d31) & Long.MAX_VALUE) < 9218868437227405312L) {
                        dLog4 = Math.max(dLog4, d31);
                    }
                    double d32 = (-(d29 + d30)) / (d18 * d30);
                    double d33 = d18 * d32;
                    double dExp2 = (Math.exp(d33) * d30 * d32) + (Math.exp(d33) * dAbs);
                    if (Double.isNaN(d32) || d32 <= 0.0d) {
                        d15 = -d15;
                        dLog = dLog4;
                        i9 = 0;
                        while (dAbs2 > 0.001d && i9 < 100) {
                            i9++;
                            double d34 = d18 * dLog;
                            double dExp3 = dLog - (((Math.exp(d34) * ((d30 * dLog) + dAbs)) + d15) / (Math.exp(d34) * (((((double) 1) + d34) * d30) + d29)));
                            dAbs2 = Math.abs(dLog - dExp3);
                            dLog = dExp3;
                        }
                        break;
                    }
                    if (d32 <= 0.0d || (-dExp2) >= d15) {
                        dLog4 = (-(2.0d / d18)) - (dAbs / d30);
                        dLog = dLog4;
                        i9 = 0;
                        while (dAbs2 > 0.001d) {
                            i9++;
                            double d342 = d18 * dLog;
                            double dExp32 = dLog - (((Math.exp(d342) * ((d30 * dLog) + dAbs)) + d15) / (Math.exp(d342) * (((((double) 1) + d342) * d30) + d29)));
                            dAbs2 = Math.abs(dLog - dExp32);
                            dLog = dExp32;
                        }
                    } else {
                        if (d30 < 0.0d && dAbs > 0.0d) {
                            dLog4 = 0.0d;
                        }
                        d15 = -d15;
                        dLog = dLog4;
                        i9 = 0;
                        while (dAbs2 > 0.001d) {
                        }
                    }
                }
                j3 = (long) (dLog * 1000.0d);
            }
        }
        return j3 * 1000000;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p116i.InterfaceC1805z
    /* JADX INFO: renamed from: c */
    public final float mo4354c(float f3, float f10, float f11, long j3) {
        C1782q0 c1782q0 = this.f5771b;
        c1782q0.f5930a = f10;
        return Float.intBitsToFloat((int) (c1782q0.m4433a(f3, f11, j3 / 1000000) & 4294967295L));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p116i.InterfaceC1805z
    /* JADX INFO: renamed from: d */
    public final float mo4355d(float f3, float f10, float f11) {
        return 0.0f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p116i.InterfaceC1805z
    /* JADX INFO: renamed from: e */
    public final float mo4356e(float f3, float f10, float f11, long j3) {
        C1782q0 c1782q0 = this.f5771b;
        c1782q0.f5930a = f10;
        return Float.intBitsToFloat((int) (c1782q0.m4433a(f3, f11, j3 / 1000000) >> 32));
    }
}
