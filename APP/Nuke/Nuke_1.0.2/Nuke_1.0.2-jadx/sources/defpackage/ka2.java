package defpackage;

import java.util.Arrays;
import nuke.module.wechat.ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ka2 extends su {
    public static final c80 r = new c80(20);
    public final qd3 d;
    public final float e;
    public final float f;
    public final l33 g;
    public final float[] h;
    public final float[] i;
    public final float[] j;
    public final sa0 k;
    public final ja2 l;
    public final ga2 m;
    public final sa0 n;
    public final ja2 o;
    public final ga2 p;
    public final boolean q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r10v1, resolved type: boolean */
    /* JADX DEBUG: Multi-variable search result rejected for r10v2, resolved type: boolean */
    /* JADX DEBUG: Multi-variable search result rejected for r10v3, resolved type: boolean */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0260  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ka2(String str, float[] fArr, qd3 qd3Var, float[] fArr2, sa0 sa0Var, sa0 sa0Var2, float f, float f2, l33 l33Var, int i) {
        char c;
        float f3;
        float f4;
        boolean z;
        double d;
        super(str, 12884901888L, i);
        this.d = qd3Var;
        this.e = f;
        this.f = f2;
        this.g = l33Var;
        this.k = sa0Var;
        int i2 = 1;
        this.l = new ja2(this, i2);
        int i3 = 0;
        this.m = new ga2(this, i3);
        this.n = sa0Var2;
        this.o = new ja2(this, i3);
        this.p = new ga2(this, i2);
        if (fArr.length != 6 && fArr.length != 9) {
            s.j("The color space's primaries must be defined as an array of 6 floats in xyY or 9 floats in XYZ");
            throw null;
        }
        if (f >= f2) {
            throw new IllegalArgumentException("Invalid range: min=" + f + ", max=" + f2 + "; min must be strictly < max");
        }
        float[] fArr3 = new float[6];
        if (fArr.length == 9) {
            float f5 = fArr[0];
            float f6 = fArr[1];
            float f7 = f5 + f6 + fArr[2];
            fArr3[0] = f5 / f7;
            fArr3[1] = f6 / f7;
            float f8 = fArr[3];
            float f9 = fArr[4];
            float f10 = f8 + f9 + fArr[5];
            fArr3[2] = f8 / f10;
            fArr3[3] = f9 / f10;
            float f11 = fArr[6];
            float f12 = fArr[7];
            float f13 = f11 + f12 + fArr[8];
            fArr3[4] = f11 / f13;
            fArr3[5] = f12 / f13;
        } else {
            System.arraycopy(fArr, 0, fArr3, 0, 6);
        }
        this.h = fArr3;
        if (fArr2 == null) {
            float f14 = fArr3[0];
            float f15 = fArr3[1];
            float f16 = fArr3[2];
            float f17 = fArr3[3];
            float f18 = fArr3[4];
            float f19 = fArr3[5];
            f3 = 1.0f;
            float f20 = qd3Var.a;
            c = 1;
            float f21 = qd3Var.b;
            float f22 = 1.0f - f14;
            float f23 = f22 / f15;
            float f24 = 1.0f - f16;
            float f25 = 1.0f - f18;
            float f26 = (1.0f - f20) / f21;
            float f27 = f14 / f15;
            float f28 = (f16 / f17) - f27;
            float f29 = (f20 / f21) - f27;
            float f30 = (f24 / f17) - f23;
            float f31 = (f18 / f19) - f27;
            float f32 = (((f26 - f23) * f28) - (f29 * f30)) / ((((f25 / f19) - f23) * f28) - (f30 * f31));
            float f33 = (f29 - (f31 * f32)) / f28;
            float f34 = (1.0f - f33) - f32;
            float f35 = f34 / f15;
            float f36 = f33 / f17;
            float f37 = f32 / f19;
            this.i = new float[]{f14 * f35, f34, (f22 - f15) * f35, f16 * f36, f33, (f24 - f17) * f36, f18 * f37, f32, (f25 - f19) * f37};
        } else {
            c = 1;
            f3 = 1.0f;
            if (fArr2.length != 9) {
                throw new IllegalArgumentException("Transform must have 9 entries! Has " + fArr2.length);
            }
            this.i = fArr2;
        }
        this.j = s11.N(this.i);
        float fD = xe1.d(fArr3);
        float[] fArr4 = uu.a;
        if (fD / xe1.d(uu.b) > 0.9f) {
            float[] fArr5 = uu.a;
            float f38 = fArr3[0];
            float f39 = fArr5[0];
            float f40 = fArr3[c];
            float f41 = fArr5[c];
            float f42 = fArr3[2];
            float f43 = fArr5[2];
            float f44 = fArr3[3];
            float f45 = fArr5[3];
            float f46 = fArr3[4];
            float f47 = fArr5[4];
            float f48 = fArr3[5];
            float f49 = fArr5[5];
            f4 = 0.0f;
            float[] fArr6 = new float[6];
            fArr6[0] = f38 - f39;
            fArr6[c] = f40 - f41;
            fArr6[2] = f42 - f43;
            fArr6[3] = f44 - f45;
            fArr6[4] = f46 - f47;
            fArr6[5] = f48 - f49;
            float f50 = fArr6[0];
            float f51 = fArr6[c];
            if (((f41 - f49) * f50) - ((f39 - f47) * f51) >= 0.0f && ((f39 - f43) * f51) - ((f41 - f45) * f50) >= 0.0f) {
                float f52 = fArr6[2];
                float f53 = fArr6[3];
                if (((f45 - f41) * f52) - ((f43 - f39) * f53) >= 0.0f && ((f43 - f47) * f53) - ((f45 - f49) * f52) >= 0.0f) {
                    float f54 = fArr6[4];
                    float f55 = fArr6[5];
                    if (((f49 - f45) * f54) - ((f47 - f43) * f55) < 0.0f || ((f47 - f39) * f55) - ((f49 - f41) * f54) < 0.0f) {
                    }
                }
            }
            if (i != 0) {
                float[] fArr7 = uu.a;
                if (fArr3 != fArr7) {
                    for (int i4 = 0; i4 < 6; i4++) {
                        if (Float.compare(fArr3[i4], fArr7[i4]) != 0 && Math.abs(fArr3[i4] - fArr7[i4]) > 0.001f) {
                            break;
                        }
                    }
                    if (s11.B(qd3Var, pp0.g)) {
                        float[] fArr8 = uu.a;
                        ka2 ka2Var = uu.e;
                        while (d <= 1.0d) {
                        }
                        z = c;
                    }
                    z = 0;
                    break;
                }
                if (s11.B(qd3Var, pp0.g) && f == f4 && f2 == f3) {
                    float[] fArr82 = uu.a;
                    ka2 ka2Var2 = uu.e;
                    for (d = 0.0d; d <= 1.0d; d += 0.00392156862745098d) {
                        if (Math.abs(sa0Var.e(d) - ka2Var2.k.e(d)) <= 0.001d && Math.abs(sa0Var2.e(d) - ka2Var2.n.e(d)) <= 0.001d) {
                        }
                    }
                    z = c;
                }
                z = 0;
                break;
            }
            z = c;
            this.q = z;
        }
        f4 = 0.0f;
        int i5 = (f > f4 ? 1 : (f == f4 ? 0 : -1));
        if (i != 0) {
        }
        this.q = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.su
    public final float a(int i) {
        return this.f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.su
    public final float b(int i) {
        return this.e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.su
    public final boolean c() {
        return this.q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.su
    public final long d(float f, float f2, float f3) {
        double d = f;
        ga2 ga2Var = this.p;
        float fE = (float) ga2Var.e(d);
        float fE2 = (float) ga2Var.e(f2);
        float fE3 = (float) ga2Var.e(f3);
        float[] fArr = this.i;
        if (fArr.length < 9) {
            return 0L;
        }
        return (((long) Float.floatToRawIntBits((fArr[6] * fE3) + ((fArr[3] * fE2) + (fArr[0] * fE)))) << 32) | (4294967295L & ((long) Float.floatToRawIntBits((fArr[7] * fE3) + (fArr[4] * fE2) + (fArr[1] * fE))));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.su
    public final float e(float f, float f2, float f3) {
        double d = f;
        ga2 ga2Var = this.p;
        float fE = (float) ga2Var.e(d);
        float fE2 = (float) ga2Var.e(f2);
        float fE3 = (float) ga2Var.e(f3);
        float[] fArr = this.i;
        return (fArr[8] * fE3) + (fArr[5] * fE2) + (fArr[2] * fE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.su
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ka2.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        ka2 ka2Var = (ka2) obj;
        if (Float.compare(ka2Var.e, this.e) != 0 || Float.compare(ka2Var.f, this.f) != 0 || !t11.l(this.d, ka2Var.d) || !Arrays.equals(this.h, ka2Var.h)) {
            return false;
        }
        l33 l33Var = ka2Var.g;
        l33 l33Var2 = this.g;
        if (l33Var2 != null) {
            return t11.l(l33Var2, l33Var);
        }
        if (l33Var == null) {
            return true;
        }
        if (t11.l(this.k, ka2Var.k)) {
            return t11.l(this.n, ka2Var.n);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.su
    public final long f(float f, float f2, float f3, float f4, su suVar) {
        float[] fArr = this.j;
        float f5 = (fArr[6] * f3) + (fArr[3] * f2) + (fArr[0] * f);
        float f6 = (fArr[7] * f3) + (fArr[4] * f2) + (fArr[1] * f);
        float f7 = (fArr[8] * f3) + (fArr[5] * f2) + (fArr[2] * f);
        ga2 ga2Var = this.m;
        return sp0.a((float) ga2Var.e(f5), (float) ga2Var.e(f6), (float) ga2Var.e(f7), f4, suVar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.su
    public final int hashCode() {
        int iHashCode = (Arrays.hashCode(this.h) + ((this.d.hashCode() + (super.hashCode() * 31)) * 31)) * 31;
        float f = this.e;
        int iFloatToIntBits = (iHashCode + (f == 0.0f ? 0 : Float.floatToIntBits(f))) * 31;
        float f2 = this.f;
        int iFloatToIntBits2 = (iFloatToIntBits + (f2 == 0.0f ? 0 : Float.floatToIntBits(f2))) * 31;
        l33 l33Var = this.g;
        int iHashCode2 = iFloatToIntBits2 + (l33Var != null ? l33Var.hashCode() : 0);
        if (l33Var != null) {
            return iHashCode2;
        }
        return this.n.hashCode() + ((this.k.hashCode() + (iHashCode2 * 31)) * 31);
    }

    public ka2(String str, float[] fArr, qd3 qd3Var, final l33 l33Var, int i) {
        double d;
        sa0 sa0Var;
        sa0 sa0Var2;
        double d2 = l33Var.a;
        final int i2 = 0;
        final int i3 = 1;
        boolean z = d2 == -3.0d;
        double d3 = l33Var.g;
        double d4 = l33Var.f;
        if (z) {
            d = -3.0d;
            final int i4 = 4;
            sa0Var = new sa0() { // from class: ia2
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // defpackage.sa0
                public final double e(double d5) {
                    int i5 = i4;
                    l33 l33Var2 = l33Var;
                    switch (i5) {
                        case 0:
                            float[] fArr2 = uu.a;
                            return uu.a(l33Var2, d5);
                        case 1:
                            float[] fArr3 = uu.a;
                            return uu.c(l33Var2, d5);
                        case 2:
                            double d6 = l33Var2.b;
                            return d5 >= l33Var2.e ? Math.pow((d6 * d5) + l33Var2.c, l33Var2.a) : l33Var2.d * d5;
                        case 3:
                            double d7 = l33Var2.b;
                            double d8 = l33Var2.c;
                            double d9 = l33Var2.d;
                            return d5 >= l33Var2.e ? Math.pow((d7 * d5) + d8, l33Var2.a) + l33Var2.f : (d9 * d5) + l33Var2.g;
                        case 4:
                            float[] fArr4 = uu.a;
                            return uu.b(l33Var2, d5);
                        case 5:
                            float[] fArr5 = uu.a;
                            return uu.d(l33Var2, d5);
                        case AIChatConfig.DefaultContextRounds /* 6 */:
                            double d10 = l33Var2.b;
                            double d11 = l33Var2.c;
                            double d12 = l33Var2.d;
                            return d5 >= l33Var2.e * d12 ? (Math.pow(d5, 1.0d / l33Var2.a) - d11) / d10 : d5 / d12;
                        default:
                            double d13 = l33Var2.b;
                            double d14 = l33Var2.c;
                            double d15 = l33Var2.d;
                            return d5 >= l33Var2.e * d15 ? (Math.pow(d5 - l33Var2.f, 1.0d / l33Var2.a) - d14) / d13 : (d5 - l33Var2.g) / d15;
                    }
                }
            };
        } else {
            d = -3.0d;
            if (d2 == -2.0d) {
                final int i5 = 5;
                sa0Var = new sa0() { // from class: ia2
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    @Override // defpackage.sa0
                    public final double e(double d5) {
                        int i52 = i5;
                        l33 l33Var2 = l33Var;
                        switch (i52) {
                            case 0:
                                float[] fArr2 = uu.a;
                                return uu.a(l33Var2, d5);
                            case 1:
                                float[] fArr3 = uu.a;
                                return uu.c(l33Var2, d5);
                            case 2:
                                double d6 = l33Var2.b;
                                return d5 >= l33Var2.e ? Math.pow((d6 * d5) + l33Var2.c, l33Var2.a) : l33Var2.d * d5;
                            case 3:
                                double d7 = l33Var2.b;
                                double d8 = l33Var2.c;
                                double d9 = l33Var2.d;
                                return d5 >= l33Var2.e ? Math.pow((d7 * d5) + d8, l33Var2.a) + l33Var2.f : (d9 * d5) + l33Var2.g;
                            case 4:
                                float[] fArr4 = uu.a;
                                return uu.b(l33Var2, d5);
                            case 5:
                                float[] fArr5 = uu.a;
                                return uu.d(l33Var2, d5);
                            case AIChatConfig.DefaultContextRounds /* 6 */:
                                double d10 = l33Var2.b;
                                double d11 = l33Var2.c;
                                double d12 = l33Var2.d;
                                return d5 >= l33Var2.e * d12 ? (Math.pow(d5, 1.0d / l33Var2.a) - d11) / d10 : d5 / d12;
                            default:
                                double d13 = l33Var2.b;
                                double d14 = l33Var2.c;
                                double d15 = l33Var2.d;
                                return d5 >= l33Var2.e * d15 ? (Math.pow(d5 - l33Var2.f, 1.0d / l33Var2.a) - d14) / d13 : (d5 - l33Var2.g) / d15;
                        }
                    }
                };
            } else if (d4 == 0.0d && d3 == 0.0d) {
                final int i6 = 6;
                sa0Var = new sa0() { // from class: ia2
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    @Override // defpackage.sa0
                    public final double e(double d5) {
                        int i52 = i6;
                        l33 l33Var2 = l33Var;
                        switch (i52) {
                            case 0:
                                float[] fArr2 = uu.a;
                                return uu.a(l33Var2, d5);
                            case 1:
                                float[] fArr3 = uu.a;
                                return uu.c(l33Var2, d5);
                            case 2:
                                double d6 = l33Var2.b;
                                return d5 >= l33Var2.e ? Math.pow((d6 * d5) + l33Var2.c, l33Var2.a) : l33Var2.d * d5;
                            case 3:
                                double d7 = l33Var2.b;
                                double d8 = l33Var2.c;
                                double d9 = l33Var2.d;
                                return d5 >= l33Var2.e ? Math.pow((d7 * d5) + d8, l33Var2.a) + l33Var2.f : (d9 * d5) + l33Var2.g;
                            case 4:
                                float[] fArr4 = uu.a;
                                return uu.b(l33Var2, d5);
                            case 5:
                                float[] fArr5 = uu.a;
                                return uu.d(l33Var2, d5);
                            case AIChatConfig.DefaultContextRounds /* 6 */:
                                double d10 = l33Var2.b;
                                double d11 = l33Var2.c;
                                double d12 = l33Var2.d;
                                return d5 >= l33Var2.e * d12 ? (Math.pow(d5, 1.0d / l33Var2.a) - d11) / d10 : d5 / d12;
                            default:
                                double d13 = l33Var2.b;
                                double d14 = l33Var2.c;
                                double d15 = l33Var2.d;
                                return d5 >= l33Var2.e * d15 ? (Math.pow(d5 - l33Var2.f, 1.0d / l33Var2.a) - d14) / d13 : (d5 - l33Var2.g) / d15;
                        }
                    }
                };
            } else {
                final int i7 = 7;
                sa0Var = new sa0() { // from class: ia2
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    @Override // defpackage.sa0
                    public final double e(double d5) {
                        int i52 = i7;
                        l33 l33Var2 = l33Var;
                        switch (i52) {
                            case 0:
                                float[] fArr2 = uu.a;
                                return uu.a(l33Var2, d5);
                            case 1:
                                float[] fArr3 = uu.a;
                                return uu.c(l33Var2, d5);
                            case 2:
                                double d6 = l33Var2.b;
                                return d5 >= l33Var2.e ? Math.pow((d6 * d5) + l33Var2.c, l33Var2.a) : l33Var2.d * d5;
                            case 3:
                                double d7 = l33Var2.b;
                                double d8 = l33Var2.c;
                                double d9 = l33Var2.d;
                                return d5 >= l33Var2.e ? Math.pow((d7 * d5) + d8, l33Var2.a) + l33Var2.f : (d9 * d5) + l33Var2.g;
                            case 4:
                                float[] fArr4 = uu.a;
                                return uu.b(l33Var2, d5);
                            case 5:
                                float[] fArr5 = uu.a;
                                return uu.d(l33Var2, d5);
                            case AIChatConfig.DefaultContextRounds /* 6 */:
                                double d10 = l33Var2.b;
                                double d11 = l33Var2.c;
                                double d12 = l33Var2.d;
                                return d5 >= l33Var2.e * d12 ? (Math.pow(d5, 1.0d / l33Var2.a) - d11) / d10 : d5 / d12;
                            default:
                                double d13 = l33Var2.b;
                                double d14 = l33Var2.c;
                                double d15 = l33Var2.d;
                                return d5 >= l33Var2.e * d15 ? (Math.pow(d5 - l33Var2.f, 1.0d / l33Var2.a) - d14) / d13 : (d5 - l33Var2.g) / d15;
                        }
                    }
                };
            }
        }
        if (d2 == d) {
            sa0Var2 = new sa0() { // from class: ia2
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // defpackage.sa0
                public final double e(double d5) {
                    int i52 = i2;
                    l33 l33Var2 = l33Var;
                    switch (i52) {
                        case 0:
                            float[] fArr2 = uu.a;
                            return uu.a(l33Var2, d5);
                        case 1:
                            float[] fArr3 = uu.a;
                            return uu.c(l33Var2, d5);
                        case 2:
                            double d6 = l33Var2.b;
                            return d5 >= l33Var2.e ? Math.pow((d6 * d5) + l33Var2.c, l33Var2.a) : l33Var2.d * d5;
                        case 3:
                            double d7 = l33Var2.b;
                            double d8 = l33Var2.c;
                            double d9 = l33Var2.d;
                            return d5 >= l33Var2.e ? Math.pow((d7 * d5) + d8, l33Var2.a) + l33Var2.f : (d9 * d5) + l33Var2.g;
                        case 4:
                            float[] fArr4 = uu.a;
                            return uu.b(l33Var2, d5);
                        case 5:
                            float[] fArr5 = uu.a;
                            return uu.d(l33Var2, d5);
                        case AIChatConfig.DefaultContextRounds /* 6 */:
                            double d10 = l33Var2.b;
                            double d11 = l33Var2.c;
                            double d12 = l33Var2.d;
                            return d5 >= l33Var2.e * d12 ? (Math.pow(d5, 1.0d / l33Var2.a) - d11) / d10 : d5 / d12;
                        default:
                            double d13 = l33Var2.b;
                            double d14 = l33Var2.c;
                            double d15 = l33Var2.d;
                            return d5 >= l33Var2.e * d15 ? (Math.pow(d5 - l33Var2.f, 1.0d / l33Var2.a) - d14) / d13 : (d5 - l33Var2.g) / d15;
                    }
                }
            };
        } else if (d2 == -2.0d) {
            sa0Var2 = new sa0() { // from class: ia2
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // defpackage.sa0
                public final double e(double d5) {
                    int i52 = i3;
                    l33 l33Var2 = l33Var;
                    switch (i52) {
                        case 0:
                            float[] fArr2 = uu.a;
                            return uu.a(l33Var2, d5);
                        case 1:
                            float[] fArr3 = uu.a;
                            return uu.c(l33Var2, d5);
                        case 2:
                            double d6 = l33Var2.b;
                            return d5 >= l33Var2.e ? Math.pow((d6 * d5) + l33Var2.c, l33Var2.a) : l33Var2.d * d5;
                        case 3:
                            double d7 = l33Var2.b;
                            double d8 = l33Var2.c;
                            double d9 = l33Var2.d;
                            return d5 >= l33Var2.e ? Math.pow((d7 * d5) + d8, l33Var2.a) + l33Var2.f : (d9 * d5) + l33Var2.g;
                        case 4:
                            float[] fArr4 = uu.a;
                            return uu.b(l33Var2, d5);
                        case 5:
                            float[] fArr5 = uu.a;
                            return uu.d(l33Var2, d5);
                        case AIChatConfig.DefaultContextRounds /* 6 */:
                            double d10 = l33Var2.b;
                            double d11 = l33Var2.c;
                            double d12 = l33Var2.d;
                            return d5 >= l33Var2.e * d12 ? (Math.pow(d5, 1.0d / l33Var2.a) - d11) / d10 : d5 / d12;
                        default:
                            double d13 = l33Var2.b;
                            double d14 = l33Var2.c;
                            double d15 = l33Var2.d;
                            return d5 >= l33Var2.e * d15 ? (Math.pow(d5 - l33Var2.f, 1.0d / l33Var2.a) - d14) / d13 : (d5 - l33Var2.g) / d15;
                    }
                }
            };
        } else if (d4 == 0.0d && d3 == 0.0d) {
            final int i8 = 2;
            sa0Var2 = new sa0() { // from class: ia2
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // defpackage.sa0
                public final double e(double d5) {
                    int i52 = i8;
                    l33 l33Var2 = l33Var;
                    switch (i52) {
                        case 0:
                            float[] fArr2 = uu.a;
                            return uu.a(l33Var2, d5);
                        case 1:
                            float[] fArr3 = uu.a;
                            return uu.c(l33Var2, d5);
                        case 2:
                            double d6 = l33Var2.b;
                            return d5 >= l33Var2.e ? Math.pow((d6 * d5) + l33Var2.c, l33Var2.a) : l33Var2.d * d5;
                        case 3:
                            double d7 = l33Var2.b;
                            double d8 = l33Var2.c;
                            double d9 = l33Var2.d;
                            return d5 >= l33Var2.e ? Math.pow((d7 * d5) + d8, l33Var2.a) + l33Var2.f : (d9 * d5) + l33Var2.g;
                        case 4:
                            float[] fArr4 = uu.a;
                            return uu.b(l33Var2, d5);
                        case 5:
                            float[] fArr5 = uu.a;
                            return uu.d(l33Var2, d5);
                        case AIChatConfig.DefaultContextRounds /* 6 */:
                            double d10 = l33Var2.b;
                            double d11 = l33Var2.c;
                            double d12 = l33Var2.d;
                            return d5 >= l33Var2.e * d12 ? (Math.pow(d5, 1.0d / l33Var2.a) - d11) / d10 : d5 / d12;
                        default:
                            double d13 = l33Var2.b;
                            double d14 = l33Var2.c;
                            double d15 = l33Var2.d;
                            return d5 >= l33Var2.e * d15 ? (Math.pow(d5 - l33Var2.f, 1.0d / l33Var2.a) - d14) / d13 : (d5 - l33Var2.g) / d15;
                    }
                }
            };
        } else {
            final int i9 = 3;
            sa0Var2 = new sa0() { // from class: ia2
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // defpackage.sa0
                public final double e(double d5) {
                    int i52 = i9;
                    l33 l33Var2 = l33Var;
                    switch (i52) {
                        case 0:
                            float[] fArr2 = uu.a;
                            return uu.a(l33Var2, d5);
                        case 1:
                            float[] fArr3 = uu.a;
                            return uu.c(l33Var2, d5);
                        case 2:
                            double d6 = l33Var2.b;
                            return d5 >= l33Var2.e ? Math.pow((d6 * d5) + l33Var2.c, l33Var2.a) : l33Var2.d * d5;
                        case 3:
                            double d7 = l33Var2.b;
                            double d8 = l33Var2.c;
                            double d9 = l33Var2.d;
                            return d5 >= l33Var2.e ? Math.pow((d7 * d5) + d8, l33Var2.a) + l33Var2.f : (d9 * d5) + l33Var2.g;
                        case 4:
                            float[] fArr4 = uu.a;
                            return uu.b(l33Var2, d5);
                        case 5:
                            float[] fArr5 = uu.a;
                            return uu.d(l33Var2, d5);
                        case AIChatConfig.DefaultContextRounds /* 6 */:
                            double d10 = l33Var2.b;
                            double d11 = l33Var2.c;
                            double d12 = l33Var2.d;
                            return d5 >= l33Var2.e * d12 ? (Math.pow(d5, 1.0d / l33Var2.a) - d11) / d10 : d5 / d12;
                        default:
                            double d13 = l33Var2.b;
                            double d14 = l33Var2.c;
                            double d15 = l33Var2.d;
                            return d5 >= l33Var2.e * d15 ? (Math.pow(d5 - l33Var2.f, 1.0d / l33Var2.a) - d14) / d13 : (d5 - l33Var2.g) / d15;
                    }
                }
            };
        }
        this(str, fArr, qd3Var, null, sa0Var, sa0Var2, 0.0f, 1.0f, l33Var, i);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ka2(String str, float[] fArr, qd3 qd3Var, final double d, float f, float f2, int i) {
        sa0 sa0Var;
        sa0 sa0Var2 = r;
        if (d == 1.0d) {
            sa0Var = sa0Var2;
        } else {
            final int i2 = 0;
            sa0Var = new sa0() { // from class: ha2
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // defpackage.sa0
                public final double e(double d2) {
                    switch (i2) {
                        case 0:
                            if (d2 < 0.0d) {
                                d2 = 0.0d;
                            }
                            return Math.pow(d2, 1.0d / d);
                        default:
                            if (d2 < 0.0d) {
                                d2 = 0.0d;
                            }
                            return Math.pow(d2, d);
                    }
                }
            };
        }
        if (d != 1.0d) {
            final int i3 = 1;
            sa0Var2 = new sa0() { // from class: ha2
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // defpackage.sa0
                public final double e(double d2) {
                    switch (i3) {
                        case 0:
                            if (d2 < 0.0d) {
                                d2 = 0.0d;
                            }
                            return Math.pow(d2, 1.0d / d);
                        default:
                            if (d2 < 0.0d) {
                                d2 = 0.0d;
                            }
                            return Math.pow(d2, d);
                    }
                }
            };
        }
        this(str, fArr, qd3Var, null, sa0Var, sa0Var2, f, f2, new l33(d, 1.0d, 0.0d, 0.0d, 0.0d), i);
    }
}
