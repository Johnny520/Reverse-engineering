package p000;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class nv0 extends AbstractC0549of {

    /* JADX INFO: renamed from: r */
    public static final C0921xc f4347r = new C0921xc(19);

    /* JADX INFO: renamed from: d */
    public final cd1 f4348d;

    /* JADX INFO: renamed from: e */
    public final float f4349e;

    /* JADX INFO: renamed from: f */
    public final float f4350f;

    /* JADX INFO: renamed from: g */
    public final s81 f4351g;

    /* JADX INFO: renamed from: h */
    public final float[] f4352h;

    /* JADX INFO: renamed from: i */
    public final float[] f4353i;

    /* JADX INFO: renamed from: j */
    public final float[] f4354j;

    /* JADX INFO: renamed from: k */
    public final InterfaceC1011zo f4355k;

    /* JADX INFO: renamed from: l */
    public final mv0 f4356l;

    /* JADX INFO: renamed from: m */
    public final jv0 f4357m;

    /* JADX INFO: renamed from: n */
    public final InterfaceC1011zo f4358n;

    /* JADX INFO: renamed from: o */
    public final mv0 f4359o;

    /* JADX INFO: renamed from: p */
    public final jv0 f4360p;

    /* JADX INFO: renamed from: q */
    public final boolean f4361q;

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
    public nv0(String str, float[] fArr, cd1 cd1Var, float[] fArr2, InterfaceC1011zo interfaceC1011zo, InterfaceC1011zo interfaceC1011zo2, float f, float f2, s81 s81Var, int i) {
        char c;
        float f3;
        float f4;
        boolean z;
        double d;
        super(str, 12884901888L, i);
        this.f4348d = cd1Var;
        this.f4349e = f;
        this.f4350f = f2;
        this.f4351g = s81Var;
        this.f4355k = interfaceC1011zo;
        int i2 = 1;
        this.f4356l = new mv0(this, i2);
        int i3 = 0;
        this.f4357m = new jv0(this, i3);
        this.f4358n = interfaceC1011zo2;
        this.f4359o = new mv0(this, i3);
        this.f4360p = new jv0(this, i2);
        if (fArr.length != 6 && fArr.length != 9) {
            C0921xc.m5131l("The color space's primaries must be defined as an array of 6 floats in xyY or 9 floats in XYZ");
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
        this.f4352h = fArr3;
        if (fArr2 == null) {
            float f14 = fArr3[0];
            float f15 = fArr3[1];
            float f16 = fArr3[2];
            float f17 = fArr3[3];
            float f18 = fArr3[4];
            float f19 = fArr3[5];
            f3 = 1.0f;
            float f20 = cd1Var.f792a;
            c = 1;
            float f21 = cd1Var.f793b;
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
            this.f4353i = new float[]{f14 * f35, f34, (f22 - f15) * f35, f16 * f36, f33, (f24 - f17) * f36, f18 * f37, f32, (f25 - f19) * f37};
        } else {
            c = 1;
            f3 = 1.0f;
            if (fArr2.length != 9) {
                throw new IllegalArgumentException("Transform must have 9 entries! Has " + fArr2.length);
            }
            this.f4353i = fArr2;
        }
        this.f4354j = s91.m4016A(this.f4353i);
        float fM5439i = z60.m5439i(fArr3);
        float[] fArr4 = C0687rf.f5387a;
        if (fM5439i / z60.m5439i(C0687rf.f5388b) > 0.9f) {
            float[] fArr5 = C0687rf.f5387a;
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
                float[] fArr7 = C0687rf.f5387a;
                if (fArr3 != fArr7) {
                    for (int i4 = 0; i4 < 6; i4++) {
                        if (Float.compare(fArr3[i4], fArr7[i4]) != 0 && Math.abs(fArr3[i4] - fArr7[i4]) > 0.001f) {
                            break;
                        }
                    }
                    if (s91.m4053r(cd1Var, rd0.f5370i)) {
                        float[] fArr8 = C0687rf.f5387a;
                        nv0 nv0Var = C0687rf.f5391e;
                        while (d <= 1.0d) {
                        }
                        z = c;
                    }
                    z = 0;
                    break;
                }
                if (s91.m4053r(cd1Var, rd0.f5370i) && f == f4 && f2 == f3) {
                    float[] fArr82 = C0687rf.f5387a;
                    nv0 nv0Var2 = C0687rf.f5391e;
                    for (d = 0.0d; d <= 1.0d; d += 0.00392156862745098d) {
                        if (Math.abs(interfaceC1011zo.mo1740c(d) - nv0Var2.f4355k.mo1740c(d)) <= 0.001d && Math.abs(interfaceC1011zo2.mo1740c(d) - nv0Var2.f4358n.mo1740c(d)) <= 0.001d) {
                        }
                    }
                    z = c;
                }
                z = 0;
                break;
            }
            z = c;
            this.f4361q = z;
        }
        f4 = 0.0f;
        int i5 = (f > f4 ? 1 : (f == f4 ? 0 : -1));
        if (i != 0) {
        }
        this.f4361q = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0549of
    /* JADX INFO: renamed from: a */
    public final float mo253a(int i) {
        return this.f4350f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0549of
    /* JADX INFO: renamed from: b */
    public final float mo254b(int i) {
        return this.f4349e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0549of
    /* JADX INFO: renamed from: c */
    public final boolean mo2741c() {
        return this.f4361q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0549of
    /* JADX INFO: renamed from: d */
    public final long mo255d(float f, float f2, float f3) {
        double d = f;
        jv0 jv0Var = this.f4360p;
        float fMo1740c = (float) jv0Var.mo1740c(d);
        float fMo1740c2 = (float) jv0Var.mo1740c(f2);
        float fMo1740c3 = (float) jv0Var.mo1740c(f3);
        float[] fArr = this.f4353i;
        if (fArr.length < 9) {
            return 0L;
        }
        return (((long) Float.floatToRawIntBits((fArr[6] * fMo1740c3) + ((fArr[3] * fMo1740c2) + (fArr[0] * fMo1740c)))) << 32) | (4294967295L & ((long) Float.floatToRawIntBits((fArr[7] * fMo1740c3) + (fArr[4] * fMo1740c2) + (fArr[1] * fMo1740c))));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0549of
    /* JADX INFO: renamed from: e */
    public final float mo256e(float f, float f2, float f3) {
        double d = f;
        jv0 jv0Var = this.f4360p;
        float fMo1740c = (float) jv0Var.mo1740c(d);
        float fMo1740c2 = (float) jv0Var.mo1740c(f2);
        float fMo1740c3 = (float) jv0Var.mo1740c(f3);
        float[] fArr = this.f4353i;
        return (fArr[8] * fMo1740c3) + (fArr[5] * fMo1740c2) + (fArr[2] * fMo1740c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0549of
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || nv0.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        nv0 nv0Var = (nv0) obj;
        if (Float.compare(nv0Var.f4349e, this.f4349e) != 0 || Float.compare(nv0Var.f4350f, this.f4350f) != 0 || !p30.m3002l(this.f4348d, nv0Var.f4348d) || !Arrays.equals(this.f4352h, nv0Var.f4352h)) {
            return false;
        }
        s81 s81Var = nv0Var.f4351g;
        s81 s81Var2 = this.f4351g;
        if (s81Var2 != null) {
            return p30.m3002l(s81Var2, s81Var);
        }
        if (s81Var == null) {
            return true;
        }
        if (p30.m3002l(this.f4355k, nv0Var.f4355k)) {
            return p30.m3002l(this.f4358n, nv0Var.f4358n);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0549of
    /* JADX INFO: renamed from: f */
    public final long mo257f(float f, float f2, float f3, float f4, AbstractC0549of abstractC0549of) {
        float[] fArr = this.f4354j;
        float f5 = (fArr[6] * f3) + (fArr[3] * f2) + (fArr[0] * f);
        float f6 = (fArr[7] * f3) + (fArr[4] * f2) + (fArr[1] * f);
        float f7 = (fArr[8] * f3) + (fArr[5] * f2) + (fArr[2] * f);
        jv0 jv0Var = this.f4357m;
        return p30.m2991a((float) jv0Var.mo1740c(f5), (float) jv0Var.mo1740c(f6), (float) jv0Var.mo1740c(f7), f4, abstractC0549of);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0549of
    public final int hashCode() {
        int iHashCode = (Arrays.hashCode(this.f4352h) + ((this.f4348d.hashCode() + (super.hashCode() * 31)) * 31)) * 31;
        float f = this.f4349e;
        int iFloatToIntBits = (iHashCode + (f == 0.0f ? 0 : Float.floatToIntBits(f))) * 31;
        float f2 = this.f4350f;
        int iFloatToIntBits2 = (iFloatToIntBits + (f2 == 0.0f ? 0 : Float.floatToIntBits(f2))) * 31;
        s81 s81Var = this.f4351g;
        int iHashCode2 = iFloatToIntBits2 + (s81Var != null ? s81Var.hashCode() : 0);
        if (s81Var != null) {
            return iHashCode2;
        }
        return this.f4358n.hashCode() + ((this.f4355k.hashCode() + (iHashCode2 * 31)) * 31);
    }

    public nv0(String str, float[] fArr, cd1 cd1Var, final s81 s81Var, int i) {
        double d;
        InterfaceC1011zo interfaceC1011zo;
        InterfaceC1011zo interfaceC1011zo2;
        double d2 = s81Var.f5683a;
        final int i2 = 0;
        final int i3 = 1;
        boolean z = d2 == -3.0d;
        double d3 = s81Var.f5689g;
        double d4 = s81Var.f5688f;
        if (z) {
            d = -3.0d;
            final int i4 = 4;
            interfaceC1011zo = new InterfaceC1011zo() { // from class: lv0
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // p000.InterfaceC1011zo
                /* JADX INFO: renamed from: c */
                public final double mo1740c(double d5) {
                    int i5 = i4;
                    s81 s81Var2 = s81Var;
                    switch (i5) {
                        case 0:
                            float[] fArr2 = C0687rf.f5387a;
                            return C0687rf.m3503a(s81Var2, d5);
                        case 1:
                            float[] fArr3 = C0687rf.f5387a;
                            return C0687rf.m3505c(s81Var2, d5);
                        case 2:
                            double d6 = s81Var2.f5684b;
                            return d5 >= s81Var2.f5687e ? Math.pow((d6 * d5) + s81Var2.f5685c, s81Var2.f5683a) : s81Var2.f5686d * d5;
                        case 3:
                            double d7 = s81Var2.f5684b;
                            double d8 = s81Var2.f5685c;
                            double d9 = s81Var2.f5686d;
                            return d5 >= s81Var2.f5687e ? Math.pow((d7 * d5) + d8, s81Var2.f5683a) + s81Var2.f5688f : (d9 * d5) + s81Var2.f5689g;
                        case 4:
                            float[] fArr4 = C0687rf.f5387a;
                            return C0687rf.m3504b(s81Var2, d5);
                        case 5:
                            float[] fArr5 = C0687rf.f5387a;
                            return C0687rf.m3506d(s81Var2, d5);
                        case 6:
                            double d10 = s81Var2.f5684b;
                            double d11 = s81Var2.f5685c;
                            double d12 = s81Var2.f5686d;
                            return d5 >= s81Var2.f5687e * d12 ? (Math.pow(d5, 1.0d / s81Var2.f5683a) - d11) / d10 : d5 / d12;
                        default:
                            double d13 = s81Var2.f5684b;
                            double d14 = s81Var2.f5685c;
                            double d15 = s81Var2.f5686d;
                            return d5 >= s81Var2.f5687e * d15 ? (Math.pow(d5 - s81Var2.f5688f, 1.0d / s81Var2.f5683a) - d14) / d13 : (d5 - s81Var2.f5689g) / d15;
                    }
                }
            };
        } else {
            d = -3.0d;
            if (d2 == -2.0d) {
                final int i5 = 5;
                interfaceC1011zo = new InterfaceC1011zo() { // from class: lv0
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    @Override // p000.InterfaceC1011zo
                    /* JADX INFO: renamed from: c */
                    public final double mo1740c(double d5) {
                        int i52 = i5;
                        s81 s81Var2 = s81Var;
                        switch (i52) {
                            case 0:
                                float[] fArr2 = C0687rf.f5387a;
                                return C0687rf.m3503a(s81Var2, d5);
                            case 1:
                                float[] fArr3 = C0687rf.f5387a;
                                return C0687rf.m3505c(s81Var2, d5);
                            case 2:
                                double d6 = s81Var2.f5684b;
                                return d5 >= s81Var2.f5687e ? Math.pow((d6 * d5) + s81Var2.f5685c, s81Var2.f5683a) : s81Var2.f5686d * d5;
                            case 3:
                                double d7 = s81Var2.f5684b;
                                double d8 = s81Var2.f5685c;
                                double d9 = s81Var2.f5686d;
                                return d5 >= s81Var2.f5687e ? Math.pow((d7 * d5) + d8, s81Var2.f5683a) + s81Var2.f5688f : (d9 * d5) + s81Var2.f5689g;
                            case 4:
                                float[] fArr4 = C0687rf.f5387a;
                                return C0687rf.m3504b(s81Var2, d5);
                            case 5:
                                float[] fArr5 = C0687rf.f5387a;
                                return C0687rf.m3506d(s81Var2, d5);
                            case 6:
                                double d10 = s81Var2.f5684b;
                                double d11 = s81Var2.f5685c;
                                double d12 = s81Var2.f5686d;
                                return d5 >= s81Var2.f5687e * d12 ? (Math.pow(d5, 1.0d / s81Var2.f5683a) - d11) / d10 : d5 / d12;
                            default:
                                double d13 = s81Var2.f5684b;
                                double d14 = s81Var2.f5685c;
                                double d15 = s81Var2.f5686d;
                                return d5 >= s81Var2.f5687e * d15 ? (Math.pow(d5 - s81Var2.f5688f, 1.0d / s81Var2.f5683a) - d14) / d13 : (d5 - s81Var2.f5689g) / d15;
                        }
                    }
                };
            } else if (d4 == 0.0d && d3 == 0.0d) {
                final int i6 = 6;
                interfaceC1011zo = new InterfaceC1011zo() { // from class: lv0
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    @Override // p000.InterfaceC1011zo
                    /* JADX INFO: renamed from: c */
                    public final double mo1740c(double d5) {
                        int i52 = i6;
                        s81 s81Var2 = s81Var;
                        switch (i52) {
                            case 0:
                                float[] fArr2 = C0687rf.f5387a;
                                return C0687rf.m3503a(s81Var2, d5);
                            case 1:
                                float[] fArr3 = C0687rf.f5387a;
                                return C0687rf.m3505c(s81Var2, d5);
                            case 2:
                                double d6 = s81Var2.f5684b;
                                return d5 >= s81Var2.f5687e ? Math.pow((d6 * d5) + s81Var2.f5685c, s81Var2.f5683a) : s81Var2.f5686d * d5;
                            case 3:
                                double d7 = s81Var2.f5684b;
                                double d8 = s81Var2.f5685c;
                                double d9 = s81Var2.f5686d;
                                return d5 >= s81Var2.f5687e ? Math.pow((d7 * d5) + d8, s81Var2.f5683a) + s81Var2.f5688f : (d9 * d5) + s81Var2.f5689g;
                            case 4:
                                float[] fArr4 = C0687rf.f5387a;
                                return C0687rf.m3504b(s81Var2, d5);
                            case 5:
                                float[] fArr5 = C0687rf.f5387a;
                                return C0687rf.m3506d(s81Var2, d5);
                            case 6:
                                double d10 = s81Var2.f5684b;
                                double d11 = s81Var2.f5685c;
                                double d12 = s81Var2.f5686d;
                                return d5 >= s81Var2.f5687e * d12 ? (Math.pow(d5, 1.0d / s81Var2.f5683a) - d11) / d10 : d5 / d12;
                            default:
                                double d13 = s81Var2.f5684b;
                                double d14 = s81Var2.f5685c;
                                double d15 = s81Var2.f5686d;
                                return d5 >= s81Var2.f5687e * d15 ? (Math.pow(d5 - s81Var2.f5688f, 1.0d / s81Var2.f5683a) - d14) / d13 : (d5 - s81Var2.f5689g) / d15;
                        }
                    }
                };
            } else {
                final int i7 = 7;
                interfaceC1011zo = new InterfaceC1011zo() { // from class: lv0
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    @Override // p000.InterfaceC1011zo
                    /* JADX INFO: renamed from: c */
                    public final double mo1740c(double d5) {
                        int i52 = i7;
                        s81 s81Var2 = s81Var;
                        switch (i52) {
                            case 0:
                                float[] fArr2 = C0687rf.f5387a;
                                return C0687rf.m3503a(s81Var2, d5);
                            case 1:
                                float[] fArr3 = C0687rf.f5387a;
                                return C0687rf.m3505c(s81Var2, d5);
                            case 2:
                                double d6 = s81Var2.f5684b;
                                return d5 >= s81Var2.f5687e ? Math.pow((d6 * d5) + s81Var2.f5685c, s81Var2.f5683a) : s81Var2.f5686d * d5;
                            case 3:
                                double d7 = s81Var2.f5684b;
                                double d8 = s81Var2.f5685c;
                                double d9 = s81Var2.f5686d;
                                return d5 >= s81Var2.f5687e ? Math.pow((d7 * d5) + d8, s81Var2.f5683a) + s81Var2.f5688f : (d9 * d5) + s81Var2.f5689g;
                            case 4:
                                float[] fArr4 = C0687rf.f5387a;
                                return C0687rf.m3504b(s81Var2, d5);
                            case 5:
                                float[] fArr5 = C0687rf.f5387a;
                                return C0687rf.m3506d(s81Var2, d5);
                            case 6:
                                double d10 = s81Var2.f5684b;
                                double d11 = s81Var2.f5685c;
                                double d12 = s81Var2.f5686d;
                                return d5 >= s81Var2.f5687e * d12 ? (Math.pow(d5, 1.0d / s81Var2.f5683a) - d11) / d10 : d5 / d12;
                            default:
                                double d13 = s81Var2.f5684b;
                                double d14 = s81Var2.f5685c;
                                double d15 = s81Var2.f5686d;
                                return d5 >= s81Var2.f5687e * d15 ? (Math.pow(d5 - s81Var2.f5688f, 1.0d / s81Var2.f5683a) - d14) / d13 : (d5 - s81Var2.f5689g) / d15;
                        }
                    }
                };
            }
        }
        if (d2 == d) {
            interfaceC1011zo2 = new InterfaceC1011zo() { // from class: lv0
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // p000.InterfaceC1011zo
                /* JADX INFO: renamed from: c */
                public final double mo1740c(double d5) {
                    int i52 = i2;
                    s81 s81Var2 = s81Var;
                    switch (i52) {
                        case 0:
                            float[] fArr2 = C0687rf.f5387a;
                            return C0687rf.m3503a(s81Var2, d5);
                        case 1:
                            float[] fArr3 = C0687rf.f5387a;
                            return C0687rf.m3505c(s81Var2, d5);
                        case 2:
                            double d6 = s81Var2.f5684b;
                            return d5 >= s81Var2.f5687e ? Math.pow((d6 * d5) + s81Var2.f5685c, s81Var2.f5683a) : s81Var2.f5686d * d5;
                        case 3:
                            double d7 = s81Var2.f5684b;
                            double d8 = s81Var2.f5685c;
                            double d9 = s81Var2.f5686d;
                            return d5 >= s81Var2.f5687e ? Math.pow((d7 * d5) + d8, s81Var2.f5683a) + s81Var2.f5688f : (d9 * d5) + s81Var2.f5689g;
                        case 4:
                            float[] fArr4 = C0687rf.f5387a;
                            return C0687rf.m3504b(s81Var2, d5);
                        case 5:
                            float[] fArr5 = C0687rf.f5387a;
                            return C0687rf.m3506d(s81Var2, d5);
                        case 6:
                            double d10 = s81Var2.f5684b;
                            double d11 = s81Var2.f5685c;
                            double d12 = s81Var2.f5686d;
                            return d5 >= s81Var2.f5687e * d12 ? (Math.pow(d5, 1.0d / s81Var2.f5683a) - d11) / d10 : d5 / d12;
                        default:
                            double d13 = s81Var2.f5684b;
                            double d14 = s81Var2.f5685c;
                            double d15 = s81Var2.f5686d;
                            return d5 >= s81Var2.f5687e * d15 ? (Math.pow(d5 - s81Var2.f5688f, 1.0d / s81Var2.f5683a) - d14) / d13 : (d5 - s81Var2.f5689g) / d15;
                    }
                }
            };
        } else if (d2 == -2.0d) {
            interfaceC1011zo2 = new InterfaceC1011zo() { // from class: lv0
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // p000.InterfaceC1011zo
                /* JADX INFO: renamed from: c */
                public final double mo1740c(double d5) {
                    int i52 = i3;
                    s81 s81Var2 = s81Var;
                    switch (i52) {
                        case 0:
                            float[] fArr2 = C0687rf.f5387a;
                            return C0687rf.m3503a(s81Var2, d5);
                        case 1:
                            float[] fArr3 = C0687rf.f5387a;
                            return C0687rf.m3505c(s81Var2, d5);
                        case 2:
                            double d6 = s81Var2.f5684b;
                            return d5 >= s81Var2.f5687e ? Math.pow((d6 * d5) + s81Var2.f5685c, s81Var2.f5683a) : s81Var2.f5686d * d5;
                        case 3:
                            double d7 = s81Var2.f5684b;
                            double d8 = s81Var2.f5685c;
                            double d9 = s81Var2.f5686d;
                            return d5 >= s81Var2.f5687e ? Math.pow((d7 * d5) + d8, s81Var2.f5683a) + s81Var2.f5688f : (d9 * d5) + s81Var2.f5689g;
                        case 4:
                            float[] fArr4 = C0687rf.f5387a;
                            return C0687rf.m3504b(s81Var2, d5);
                        case 5:
                            float[] fArr5 = C0687rf.f5387a;
                            return C0687rf.m3506d(s81Var2, d5);
                        case 6:
                            double d10 = s81Var2.f5684b;
                            double d11 = s81Var2.f5685c;
                            double d12 = s81Var2.f5686d;
                            return d5 >= s81Var2.f5687e * d12 ? (Math.pow(d5, 1.0d / s81Var2.f5683a) - d11) / d10 : d5 / d12;
                        default:
                            double d13 = s81Var2.f5684b;
                            double d14 = s81Var2.f5685c;
                            double d15 = s81Var2.f5686d;
                            return d5 >= s81Var2.f5687e * d15 ? (Math.pow(d5 - s81Var2.f5688f, 1.0d / s81Var2.f5683a) - d14) / d13 : (d5 - s81Var2.f5689g) / d15;
                    }
                }
            };
        } else if (d4 == 0.0d && d3 == 0.0d) {
            final int i8 = 2;
            interfaceC1011zo2 = new InterfaceC1011zo() { // from class: lv0
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // p000.InterfaceC1011zo
                /* JADX INFO: renamed from: c */
                public final double mo1740c(double d5) {
                    int i52 = i8;
                    s81 s81Var2 = s81Var;
                    switch (i52) {
                        case 0:
                            float[] fArr2 = C0687rf.f5387a;
                            return C0687rf.m3503a(s81Var2, d5);
                        case 1:
                            float[] fArr3 = C0687rf.f5387a;
                            return C0687rf.m3505c(s81Var2, d5);
                        case 2:
                            double d6 = s81Var2.f5684b;
                            return d5 >= s81Var2.f5687e ? Math.pow((d6 * d5) + s81Var2.f5685c, s81Var2.f5683a) : s81Var2.f5686d * d5;
                        case 3:
                            double d7 = s81Var2.f5684b;
                            double d8 = s81Var2.f5685c;
                            double d9 = s81Var2.f5686d;
                            return d5 >= s81Var2.f5687e ? Math.pow((d7 * d5) + d8, s81Var2.f5683a) + s81Var2.f5688f : (d9 * d5) + s81Var2.f5689g;
                        case 4:
                            float[] fArr4 = C0687rf.f5387a;
                            return C0687rf.m3504b(s81Var2, d5);
                        case 5:
                            float[] fArr5 = C0687rf.f5387a;
                            return C0687rf.m3506d(s81Var2, d5);
                        case 6:
                            double d10 = s81Var2.f5684b;
                            double d11 = s81Var2.f5685c;
                            double d12 = s81Var2.f5686d;
                            return d5 >= s81Var2.f5687e * d12 ? (Math.pow(d5, 1.0d / s81Var2.f5683a) - d11) / d10 : d5 / d12;
                        default:
                            double d13 = s81Var2.f5684b;
                            double d14 = s81Var2.f5685c;
                            double d15 = s81Var2.f5686d;
                            return d5 >= s81Var2.f5687e * d15 ? (Math.pow(d5 - s81Var2.f5688f, 1.0d / s81Var2.f5683a) - d14) / d13 : (d5 - s81Var2.f5689g) / d15;
                    }
                }
            };
        } else {
            final int i9 = 3;
            interfaceC1011zo2 = new InterfaceC1011zo() { // from class: lv0
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // p000.InterfaceC1011zo
                /* JADX INFO: renamed from: c */
                public final double mo1740c(double d5) {
                    int i52 = i9;
                    s81 s81Var2 = s81Var;
                    switch (i52) {
                        case 0:
                            float[] fArr2 = C0687rf.f5387a;
                            return C0687rf.m3503a(s81Var2, d5);
                        case 1:
                            float[] fArr3 = C0687rf.f5387a;
                            return C0687rf.m3505c(s81Var2, d5);
                        case 2:
                            double d6 = s81Var2.f5684b;
                            return d5 >= s81Var2.f5687e ? Math.pow((d6 * d5) + s81Var2.f5685c, s81Var2.f5683a) : s81Var2.f5686d * d5;
                        case 3:
                            double d7 = s81Var2.f5684b;
                            double d8 = s81Var2.f5685c;
                            double d9 = s81Var2.f5686d;
                            return d5 >= s81Var2.f5687e ? Math.pow((d7 * d5) + d8, s81Var2.f5683a) + s81Var2.f5688f : (d9 * d5) + s81Var2.f5689g;
                        case 4:
                            float[] fArr4 = C0687rf.f5387a;
                            return C0687rf.m3504b(s81Var2, d5);
                        case 5:
                            float[] fArr5 = C0687rf.f5387a;
                            return C0687rf.m3506d(s81Var2, d5);
                        case 6:
                            double d10 = s81Var2.f5684b;
                            double d11 = s81Var2.f5685c;
                            double d12 = s81Var2.f5686d;
                            return d5 >= s81Var2.f5687e * d12 ? (Math.pow(d5, 1.0d / s81Var2.f5683a) - d11) / d10 : d5 / d12;
                        default:
                            double d13 = s81Var2.f5684b;
                            double d14 = s81Var2.f5685c;
                            double d15 = s81Var2.f5686d;
                            return d5 >= s81Var2.f5687e * d15 ? (Math.pow(d5 - s81Var2.f5688f, 1.0d / s81Var2.f5683a) - d14) / d13 : (d5 - s81Var2.f5689g) / d15;
                    }
                }
            };
        }
        this(str, fArr, cd1Var, null, interfaceC1011zo, interfaceC1011zo2, 0.0f, 1.0f, s81Var, i);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public nv0(String str, float[] fArr, cd1 cd1Var, final double d, float f, float f2, int i) {
        InterfaceC1011zo interfaceC1011zo;
        InterfaceC1011zo interfaceC1011zo2 = f4347r;
        if (d == 1.0d) {
            interfaceC1011zo = interfaceC1011zo2;
        } else {
            final int i2 = 0;
            interfaceC1011zo = new InterfaceC1011zo() { // from class: kv0
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // p000.InterfaceC1011zo
                /* JADX INFO: renamed from: c */
                public final double mo1740c(double d2) {
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
            interfaceC1011zo2 = new InterfaceC1011zo() { // from class: kv0
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // p000.InterfaceC1011zo
                /* JADX INFO: renamed from: c */
                public final double mo1740c(double d2) {
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
        this(str, fArr, cd1Var, null, interfaceC1011zo, interfaceC1011zo2, f, f2, new s81(d, 1.0d, 0.0d, 0.0d, 0.0d), i);
    }
}
