package androidx.compose.animation.core;

/* JADX INFO: renamed from: androidx.compose.animation.core.飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1154 implements InterfaceC1156 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C1142 f1392;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final float f1393;

    public C1154(float f, float f2, float f3) {
        this.f1393 = f3;
        C1142 c1142 = new C1142();
        c1142.f1372 = 1.0f;
        c1142.f1371 = Math.sqrt(50.0d);
        c1142.f1370 = 1.0f;
        if (f < 0.0f) {
            AbstractC1146.m1489("Damping ratio must be non-negative");
        }
        c1142.f1370 = f;
        double d = c1142.f1371;
        if (((float) (d * d)) <= 0.0f) {
            AbstractC1146.m1489("Spring stiffness constant must be positive.");
        }
        c1142.f1371 = Math.sqrt(f2);
        this.f1392 = c1142;
    }

    @Override // androidx.compose.animation.core.InterfaceC1156
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final float mo1494(long j, float f, float f2, float f3) {
        C1142 c1142 = this.f1392;
        c1142.f1372 = f2;
        return Float.intBitsToFloat((int) (c1142.m1486(f, f3, j / 1000000) >> 32));
    }

    @Override // androidx.compose.animation.core.InterfaceC1156
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final float mo1497(float f, float f2, float f3) {
        return 0.0f;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0132  */
    @Override // androidx.compose.animation.core.InterfaceC1156
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long mo1495(float f, float f2, float f3) {
        double dLog;
        long j;
        double d;
        C1142 c1142 = this.f1392;
        double d2 = c1142.f1371;
        float f4 = (float) (d2 * d2);
        float f5 = c1142.f1370;
        float f6 = this.f1393;
        float f7 = (f - f2) / f6;
        float f8 = f3 / f6;
        if (f5 == 0.0f) {
            j = 9223372036854L;
        } else {
            double d3 = f4;
            double d4 = f5;
            double d5 = f8;
            double d6 = f7;
            double dSqrt = Math.sqrt(d3) * d4 * 2.0d;
            double d7 = (dSqrt * dSqrt) - (d3 * 4.0d);
            double dSqrt2 = d7 < 0.0d ? 0.0d : Math.sqrt(d7);
            double d8 = -dSqrt;
            double d9 = (d8 + dSqrt2) * 0.5d;
            double dSqrt3 = (d7 < 0.0d ? Math.sqrt(Math.abs(d7)) : 0.0d) * 0.5d;
            double d10 = (d8 - dSqrt2) * 0.5d;
            if (d6 == 0.0d && d5 == 0.0d) {
                j = 0;
            } else {
                if (d6 < 0.0d) {
                    d5 = -d5;
                }
                double dAbs = Math.abs(d6);
                double d11 = 1.0d;
                double d12 = -1.0d;
                double dAbs2 = Double.MAX_VALUE;
                if (d4 > 1.0d) {
                    double d13 = (d9 * dAbs) - d5;
                    double d14 = d9 - d10;
                    double d15 = d13 / d14;
                    double d16 = dAbs - d15;
                    dLog = Math.log(Math.abs(1.0d / d16)) / d9;
                    double dLog2 = Math.log(Math.abs(1.0d / d15)) / d10;
                    if ((Double.doubleToRawLongBits(dLog) & Long.MAX_VALUE) >= 9218868437227405312L) {
                        dLog = dLog2;
                    } else if ((Double.doubleToRawLongBits(dLog2) & Long.MAX_VALUE) < 9218868437227405312L) {
                        dLog = Math.max(dLog, dLog2);
                    }
                    double d17 = d16 * d9;
                    double dLog3 = Math.log(d17 / ((-d15) * d10)) / (d10 - d9);
                    if (Double.isNaN(dLog3) || dLog3 <= 0.0d) {
                        d11 = -1.0d;
                        d = d15 * d10;
                        if (Math.abs((Math.exp(d10 * dLog) * d) + (Math.exp(d9 * dLog) * d17)) >= 1.0E-4d) {
                            int i = 0;
                            while (dAbs2 > 0.001d && i < 100) {
                                i++;
                                double d18 = d9 * dLog;
                                double d19 = d10 * dLog;
                                double dExp = dLog - ((((Math.exp(d19) * d15) + (Math.exp(d18) * d16)) + d11) / ((Math.exp(d19) * d) + (Math.exp(d18) * d17)));
                                dAbs2 = Math.abs(dLog - dExp);
                                dLog = dExp;
                            }
                        }
                    } else {
                        if (dLog3 > 0.0d) {
                            if ((-((Math.exp(dLog3 * d10) * d15) + (Math.exp(d9 * dLog3) * d16))) < 1.0d) {
                                dLog = (d15 <= 0.0d || d16 >= 0.0d) ? dLog : 0.0d;
                                d11 = -1.0d;
                                d = d15 * d10;
                                if (Math.abs((Math.exp(d10 * dLog) * d) + (Math.exp(d9 * dLog) * d17)) >= 1.0E-4d) {
                                }
                            }
                        }
                        dLog = Math.log((-((d15 * d10) * d10)) / (d17 * d9)) / d14;
                        d = d15 * d10;
                        if (Math.abs((Math.exp(d10 * dLog) * d) + (Math.exp(d9 * dLog) * d17)) >= 1.0E-4d) {
                        }
                    }
                } else if (d4 < 1.0d) {
                    double d20 = (d5 - (d9 * dAbs)) / dSqrt3;
                    dLog = Math.log(1.0d / Math.sqrt((d20 * d20) + (dAbs * dAbs))) / d9;
                } else {
                    double d21 = d9 * dAbs;
                    double d22 = d5 - d21;
                    double dLog4 = Math.log(Math.abs(1.0d / dAbs)) / d9;
                    double dLog5 = Math.log(Math.abs(1.0d / d22));
                    double dLog6 = dLog5;
                    for (int i2 = 0; i2 < 6; i2++) {
                        dLog6 = dLog5 - Math.log(Math.abs(dLog6 / d9));
                    }
                    double d23 = dLog6 / d9;
                    if ((Double.doubleToRawLongBits(dLog4) & Long.MAX_VALUE) >= 9218868437227405312L) {
                        dLog4 = d23;
                    } else if ((Double.doubleToRawLongBits(d23) & Long.MAX_VALUE) < 9218868437227405312L) {
                        dLog4 = Math.max(dLog4, d23);
                    }
                    double d24 = (-(d21 + d22)) / (d9 * d22);
                    double d25 = d9 * d24;
                    double dExp2 = (Math.exp(d25) * d22 * d24) + (Math.exp(d25) * dAbs);
                    if (!Double.isNaN(d24) && d24 > 0.0d) {
                        if (d24 <= 0.0d || (-dExp2) >= 1.0d) {
                            dLog4 = (-(2.0d / d9)) - (dAbs / d22);
                            d12 = 1.0d;
                        } else {
                            dLog4 = (d22 >= 0.0d || dAbs <= 0.0d) ? dLog4 : 0.0d;
                        }
                    }
                    dLog = dLog4;
                    int i3 = 0;
                    while (dAbs2 > 0.001d && i3 < 100) {
                        i3++;
                        double d26 = d9 * dLog;
                        double dExp3 = dLog - (((Math.exp(d26) * ((d22 * dLog) + dAbs)) + d12) / (Math.exp(d26) * (((d26 + 1.0d) * d22) + d21)));
                        dAbs2 = Math.abs(dLog - dExp3);
                        dLog = dExp3;
                    }
                }
                j = (long) (dLog * 1000.0d);
            }
        }
        return j * 1000000;
    }

    @Override // androidx.compose.animation.core.InterfaceC1156
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final float mo1496(long j, float f, float f2, float f3) {
        C1142 c1142 = this.f1392;
        c1142.f1372 = f2;
        return Float.intBitsToFloat((int) (c1142.m1486(f, f3, j / 1000000) & 4294967295L));
    }
}
