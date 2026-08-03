package p085v;

import android.graphics.Path;

/* JADX INFO: renamed from: v.f */
/* JADX INFO: loaded from: classes.dex */
public final class C1105f {

    /* JADX INFO: renamed from: a */
    public final char f4254a;

    /* JADX INFO: renamed from: b */
    public final float[] f4255b;

    public C1105f(char c, float[] fArr) {
        this.f4254a = c;
        this.f4255b = fArr;
    }

    /* JADX INFO: renamed from: a */
    public static void m2602a(Path path, float f2, float f3, float f4, float f5, float f6, float f7, float f8, boolean z2, boolean z3) {
        double d2;
        double d3;
        double radians = Math.toRadians(f8);
        double dCos = Math.cos(radians);
        double dSin = Math.sin(radians);
        double d4 = f2;
        double d5 = f3;
        double d6 = (d5 * dSin) + (d4 * dCos);
        double d7 = d4;
        double d8 = f6;
        double d9 = d6 / d8;
        double d10 = f7;
        double d11 = ((d5 * dCos) + (((double) (-f2)) * dSin)) / d10;
        double d12 = d5;
        double d13 = f5;
        double d14 = ((d13 * dSin) + (((double) f4) * dCos)) / d8;
        double d15 = ((d13 * dCos) + (((double) (-f4)) * dSin)) / d10;
        double d16 = d9 - d14;
        double d17 = d11 - d15;
        double d18 = (d9 + d14) / 2.0d;
        double d19 = (d11 + d15) / 2.0d;
        double d20 = (d17 * d17) + (d16 * d16);
        if (d20 == 0.0d) {
            return;
        }
        double d21 = (1.0d / d20) - 0.25d;
        if (d21 < 0.0d) {
            float fSqrt = (float) (Math.sqrt(d20) / 1.99999d);
            m2602a(path, f2, f3, f4, f5, f6 * fSqrt, f7 * fSqrt, f8, z2, z3);
            return;
        }
        double dSqrt = Math.sqrt(d21);
        double d22 = d16 * dSqrt;
        double d23 = dSqrt * d17;
        if (z2 == z3) {
            d2 = d18 - d23;
            d3 = d19 + d22;
        } else {
            d2 = d18 + d23;
            d3 = d19 - d22;
        }
        double dAtan2 = Math.atan2(d11 - d3, d9 - d2);
        double dAtan22 = Math.atan2(d15 - d3, d14 - d2) - dAtan2;
        if (z3 != (dAtan22 >= 0.0d)) {
            dAtan22 = dAtan22 > 0.0d ? dAtan22 - 6.283185307179586d : dAtan22 + 6.283185307179586d;
        }
        double d24 = d2 * d8;
        double d25 = d3 * d10;
        double d26 = (d24 * dCos) - (d25 * dSin);
        double d27 = (d25 * dCos) + (d24 * dSin);
        int iCeil = (int) Math.ceil(Math.abs((dAtan22 * 4.0d) / 3.141592653589793d));
        double dCos2 = Math.cos(radians);
        double dSin2 = Math.sin(radians);
        double dCos3 = Math.cos(dAtan2);
        double dSin3 = Math.sin(dAtan2);
        double d28 = -d8;
        double d29 = d28 * dCos2;
        double d30 = d10 * dSin2;
        double d31 = (d29 * dSin3) - (d30 * dCos3);
        double d32 = d28 * dSin2;
        double d33 = d10 * dCos2;
        double d34 = (dCos3 * d33) + (dSin3 * d32);
        double d35 = d33;
        double d36 = dAtan22 / ((double) iCeil);
        int i2 = 0;
        while (i2 < iCeil) {
            double d37 = dAtan2 + d36;
            double dSin4 = Math.sin(d37);
            double dCos4 = Math.cos(d37);
            double d38 = d36;
            double d39 = (((d8 * dCos2) * dCos4) + d26) - (d30 * dSin4);
            double d40 = d35;
            double d41 = d26;
            double d42 = (d40 * dSin4) + (d8 * dSin2 * dCos4) + d27;
            double d43 = (d29 * dSin4) - (d30 * dCos4);
            double d44 = (dCos4 * d40) + (dSin4 * d32);
            double d45 = d37 - dAtan2;
            double dTan = Math.tan(d45 / 2.0d);
            double dSqrt2 = ((Math.sqrt(((dTan * 3.0d) * dTan) + 4.0d) - 1.0d) * Math.sin(d45)) / 3.0d;
            path.rLineTo(0.0f, 0.0f);
            path.cubicTo((float) ((d31 * dSqrt2) + d7), (float) ((d34 * dSqrt2) + d12), (float) (d39 - (dSqrt2 * d43)), (float) (d42 - (dSqrt2 * d44)), (float) d39, (float) d42);
            i2++;
            dAtan2 = d37;
            d32 = d32;
            dCos2 = dCos2;
            iCeil = iCeil;
            d34 = d44;
            d8 = d8;
            d31 = d43;
            d7 = d39;
            d12 = d42;
            d26 = d41;
            d36 = d38;
            d35 = d40;
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m2603b(C1105f[] c1105fArr, Path path) {
        int i2;
        int i3;
        char c;
        int i4;
        int i5;
        C1105f c1105f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        float f13;
        C1105f[] c1105fArr2 = c1105fArr;
        int i6 = 6;
        float[] fArr = new float[6];
        int length = c1105fArr2.length;
        int i7 = 0;
        char c2 = 'm';
        while (i7 < length) {
            C1105f c1105f2 = c1105fArr2[i7];
            char c3 = c1105f2.f4254a;
            float f14 = fArr[0];
            float f15 = fArr[1];
            float f16 = fArr[2];
            float f17 = fArr[3];
            float f18 = fArr[4];
            float f19 = fArr[5];
            switch (c3) {
                case 'A':
                case 'a':
                    i2 = 7;
                    break;
                case 'C':
                case 'c':
                    i2 = i6;
                    break;
                case 'H':
                case 'V':
                case 'h':
                case 'v':
                    i2 = 1;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case 's':
                    i2 = 4;
                    break;
                case 'Z':
                case 'z':
                    path.close();
                    path.moveTo(f18, f19);
                    f14 = f18;
                    f16 = f14;
                    f15 = f19;
                    f17 = f15;
                default:
                    i2 = 2;
                    break;
            }
            float f20 = f18;
            float f21 = f19;
            float f22 = f14;
            float f23 = f15;
            int i8 = 0;
            while (true) {
                float[] fArr2 = c1105f2.f4255b;
                if (i8 < fArr2.length) {
                    if (c3 != 'A') {
                        if (c3 != 'C') {
                            if (c3 == 'H') {
                                i3 = i8;
                                c = c3;
                                i4 = i7;
                                i5 = length;
                                c1105f = c1105f2;
                                path.lineTo(fArr2[i3], f23);
                                f22 = fArr2[i3];
                            } else if (c3 == 'Q') {
                                i3 = i8;
                                c = c3;
                                i4 = i7;
                                i5 = length;
                                c1105f = c1105f2;
                                float f24 = fArr2[i3];
                                int i9 = i3 + 1;
                                float f25 = fArr2[i9];
                                int i10 = i3 + 2;
                                int i11 = i3 + 3;
                                path.quadTo(f24, f25, fArr2[i10], fArr2[i11]);
                                f2 = fArr2[i3];
                                f3 = fArr2[i9];
                                f22 = fArr2[i10];
                                f23 = fArr2[i11];
                            } else if (c3 == 'V') {
                                i3 = i8;
                                c = c3;
                                i4 = i7;
                                i5 = length;
                                c1105f = c1105f2;
                                path.lineTo(f22, fArr2[i3]);
                                f23 = fArr2[i3];
                            } else if (c3 != 'a') {
                                if (c3 != 'c') {
                                    if (c3 != 'h') {
                                        if (c3 == 'q') {
                                            i3 = i8;
                                            float f26 = f23;
                                            float f27 = f22;
                                            int i12 = i3 + 1;
                                            int i13 = i3 + 2;
                                            int i14 = i3 + 3;
                                            path.rQuadTo(fArr2[i3], fArr2[i12], fArr2[i13], fArr2[i14]);
                                            float f28 = f27 + fArr2[i3];
                                            float f29 = fArr2[i12] + f26;
                                            float f30 = f27 + fArr2[i13];
                                            f23 = f26 + fArr2[i14];
                                            f17 = f29;
                                            f16 = f28;
                                            c = c3;
                                            i4 = i7;
                                            i5 = length;
                                            f22 = f30;
                                        } else if (c3 == 'v') {
                                            i3 = i8;
                                            path.rLineTo(0.0f, fArr2[i3]);
                                            f23 += fArr2[i3];
                                        } else if (c3 == 'L') {
                                            i3 = i8;
                                            int i15 = i3 + 1;
                                            path.lineTo(fArr2[i3], fArr2[i15]);
                                            f22 = fArr2[i3];
                                            f23 = fArr2[i15];
                                        } else if (c3 == 'M') {
                                            i3 = i8;
                                            f22 = fArr2[i3];
                                            f23 = fArr2[i3 + 1];
                                            if (i3 > 0) {
                                                path.lineTo(f22, f23);
                                            } else {
                                                path.moveTo(f22, f23);
                                                f21 = f23;
                                                f20 = f22;
                                            }
                                        } else if (c3 == 'S') {
                                            i3 = i8;
                                            float f31 = f23;
                                            float f32 = f22;
                                            if (c2 == 'c' || c2 == 's' || c2 == 'C' || c2 == 'S') {
                                                f8 = (f31 * 2.0f) - f17;
                                                f9 = (f32 * 2.0f) - f16;
                                            } else {
                                                f9 = f32;
                                                f8 = f31;
                                            }
                                            int i16 = i3 + 1;
                                            int i17 = i3 + 2;
                                            int i18 = i3 + 3;
                                            path.cubicTo(f9, f8, fArr2[i3], fArr2[i16], fArr2[i17], fArr2[i18]);
                                            float f33 = fArr2[i3];
                                            float f34 = fArr2[i16];
                                            f22 = fArr2[i17];
                                            f23 = fArr2[i18];
                                            f17 = f34;
                                            f16 = f33;
                                        } else if (c3 == 'T') {
                                            i3 = i8;
                                            float f35 = f23;
                                            float f36 = f22;
                                            if (c2 == 'q' || c2 == 't' || c2 == 'Q' || c2 == 'T') {
                                                f4 = (f36 * 2.0f) - f16;
                                                f5 = (f35 * 2.0f) - f17;
                                            } else {
                                                f4 = f36;
                                                f5 = f35;
                                            }
                                            int i19 = i3 + 1;
                                            path.quadTo(f4, f5, fArr2[i3], fArr2[i19]);
                                            f6 = fArr2[i3];
                                            f7 = fArr2[i19];
                                        } else if (c3 == 'l') {
                                            i3 = i8;
                                            int i20 = i3 + 1;
                                            path.rLineTo(fArr2[i3], fArr2[i20]);
                                            f22 += fArr2[i3];
                                            f23 += fArr2[i20];
                                        } else if (c3 == 'm') {
                                            i3 = i8;
                                            float f37 = fArr2[i3];
                                            f22 += f37;
                                            float f38 = fArr2[i3 + 1];
                                            f23 += f38;
                                            if (i3 > 0) {
                                                path.rLineTo(f37, f38);
                                            } else {
                                                path.rMoveTo(f37, f38);
                                                f21 = f23;
                                                f20 = f22;
                                            }
                                        } else if (c3 == 's') {
                                            if (c2 == 'c' || c2 == 's' || c2 == 'C' || c2 == 'S') {
                                                float f39 = f22 - f16;
                                                f10 = f23 - f17;
                                                f11 = f39;
                                            } else {
                                                f10 = 0.0f;
                                                f11 = 0.0f;
                                            }
                                            int i21 = i8 + 1;
                                            int i22 = i8 + 2;
                                            int i23 = i8 + 3;
                                            i3 = i8;
                                            float f40 = f23;
                                            float f41 = f22;
                                            path.rCubicTo(f11, f10, fArr2[i8], fArr2[i21], fArr2[i22], fArr2[i23]);
                                            f4 = f41 + fArr2[i3];
                                            f5 = f40 + fArr2[i21];
                                            f6 = f41 + fArr2[i22];
                                            f7 = fArr2[i23] + f40;
                                        } else if (c3 != 't') {
                                            i3 = i8;
                                        } else {
                                            if (c2 == 'q' || c2 == 't' || c2 == 'Q' || c2 == 'T') {
                                                f12 = f22 - f16;
                                                f13 = f23 - f17;
                                            } else {
                                                f13 = 0.0f;
                                                f12 = 0.0f;
                                            }
                                            int i24 = i8 + 1;
                                            path.rQuadTo(f12, f13, fArr2[i8], fArr2[i24]);
                                            float f42 = f12 + f22;
                                            float f43 = f13 + f23;
                                            f22 += fArr2[i8];
                                            f23 += fArr2[i24];
                                            f17 = f43;
                                            i3 = i8;
                                            c = c3;
                                            i4 = i7;
                                            i5 = length;
                                            f16 = f42;
                                        }
                                        c1105f = c1105f2;
                                    } else {
                                        i3 = i8;
                                        path.rLineTo(fArr2[i3], 0.0f);
                                        f22 += fArr2[i3];
                                    }
                                    c = c3;
                                    i4 = i7;
                                    i5 = length;
                                    c1105f = c1105f2;
                                } else {
                                    i3 = i8;
                                    float f44 = f23;
                                    float f45 = f22;
                                    int i25 = i3 + 2;
                                    int i26 = i3 + 3;
                                    int i27 = i3 + 4;
                                    int i28 = i3 + 5;
                                    path.rCubicTo(fArr2[i3], fArr2[i3 + 1], fArr2[i25], fArr2[i26], fArr2[i27], fArr2[i28]);
                                    f4 = f45 + fArr2[i25];
                                    f5 = f44 + fArr2[i26];
                                    f6 = f45 + fArr2[i27];
                                    f7 = fArr2[i28] + f44;
                                }
                                f17 = f5;
                                f16 = f4;
                                c = c3;
                                i4 = i7;
                                i5 = length;
                                f22 = f6;
                                f23 = f7;
                                c1105f = c1105f2;
                            } else {
                                i3 = i8;
                                float f46 = f23;
                                float f47 = f22;
                                int i29 = i3 + 5;
                                int i30 = i3 + 6;
                                c = c3;
                                i5 = length;
                                c1105f = c1105f2;
                                i4 = i7;
                                m2602a(path, f47, f46, fArr2[i29] + f47, fArr2[i30] + f46, fArr2[i3], fArr2[i3 + 1], fArr2[i3 + 2], fArr2[i3 + 3] != 0.0f, fArr2[i3 + 4] != 0.0f);
                                f22 = f47 + fArr2[i29];
                                f23 = f46 + fArr2[i30];
                            }
                            i8 = i3 + i2;
                            c1105f2 = c1105f;
                            length = i5;
                            c2 = c;
                            c3 = c2;
                            i7 = i4;
                        } else {
                            i3 = i8;
                            c = c3;
                            i4 = i7;
                            i5 = length;
                            c1105f = c1105f2;
                            int i31 = i3 + 2;
                            int i32 = i3 + 3;
                            int i33 = i3 + 4;
                            int i34 = i3 + 5;
                            path.cubicTo(fArr2[i3], fArr2[i3 + 1], fArr2[i31], fArr2[i32], fArr2[i33], fArr2[i34]);
                            f22 = fArr2[i33];
                            f23 = fArr2[i34];
                            f2 = fArr2[i31];
                            f3 = fArr2[i32];
                        }
                        f16 = f2;
                        f17 = f3;
                        i8 = i3 + i2;
                        c1105f2 = c1105f;
                        length = i5;
                        c2 = c;
                        c3 = c2;
                        i7 = i4;
                    } else {
                        i3 = i8;
                        c = c3;
                        i4 = i7;
                        i5 = length;
                        c1105f = c1105f2;
                        int i35 = i3 + 5;
                        int i36 = i3 + 6;
                        m2602a(path, f22, f23, fArr2[i35], fArr2[i36], fArr2[i3], fArr2[i3 + 1], fArr2[i3 + 2], fArr2[i3 + 3] != 0.0f, fArr2[i3 + 4] != 0.0f);
                        f22 = fArr2[i35];
                        f23 = fArr2[i36];
                    }
                    f17 = f23;
                    f16 = f22;
                    i8 = i3 + i2;
                    c1105f2 = c1105f;
                    length = i5;
                    c2 = c;
                    c3 = c2;
                    i7 = i4;
                }
            }
            fArr[0] = f22;
            fArr[1] = f23;
            fArr[2] = f16;
            fArr[3] = f17;
            fArr[4] = f20;
            fArr[5] = f21;
            c2 = c1105f2.f4254a;
            i7++;
            c1105fArr2 = c1105fArr;
            length = length;
            i6 = 6;
        }
    }
}
