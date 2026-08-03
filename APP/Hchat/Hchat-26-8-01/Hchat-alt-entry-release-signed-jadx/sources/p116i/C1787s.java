package p116i;

import p068eh.AbstractC0921a;
import p071f1.AbstractC0996c0;
import p080fb.AbstractC1184v0;

/* JADX INFO: renamed from: i.s */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1787s implements InterfaceC1796v {

    /* JADX INFO: renamed from: g */
    public final float f5958g;

    /* JADX INFO: renamed from: h */
    public final float f5959h;

    /* JADX INFO: renamed from: i */
    public final float f5960i;

    /* JADX INFO: renamed from: j */
    public final float f5961j;

    /* JADX INFO: renamed from: k */
    public final float f5962k;

    /* JADX INFO: renamed from: l */
    public final float f5963l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1787s(float f3, float f10, float f11, float f12) {
        int iM2504B;
        this.f5958g = f3;
        this.f5959h = f10;
        this.f5960i = f11;
        this.f5961j = f12;
        if (!((Float.isNaN(f3) || Float.isNaN(f10) || Float.isNaN(f11) || Float.isNaN(f12)) ? false : true)) {
            AbstractC1776o0.m4429a("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: " + f3 + ", " + f10 + ", " + f11 + ", " + f12 + '.');
        }
        float[] fArr = new float[5];
        float f13 = (f10 - 0.0f) * 3.0f;
        float f14 = (f12 - f10) * 3.0f;
        float f15 = (1.0f - f12) * 3.0f;
        double d10 = f13;
        double d11 = f14;
        double d12 = f15;
        double d13 = d11 * 2.0d;
        double d14 = (d10 - d13) + d12;
        if (d14 == 0.0d) {
            iM2504B = d11 == d12 ? 0 : AbstractC0996c0.m2504B((float) ((d13 - d12) / (d13 - (d12 * 2.0d))), fArr, 0);
        } else {
            double d15 = -Math.sqrt((d11 * d11) - (d12 * d10));
            double d16 = (-d10) + d11;
            int iM2504B2 = AbstractC0996c0.m2504B((float) ((-(d15 + d16)) / d14), fArr, 0);
            int iM2504B3 = AbstractC0996c0.m2504B((float) ((d15 - d16) / d14), fArr, iM2504B2) + iM2504B2;
            if (iM2504B3 > 1) {
                float f16 = fArr[0];
                float f17 = fArr[1];
                if (f16 > f17) {
                    fArr[0] = f17;
                    fArr[1] = f16;
                } else if (f16 == f17) {
                    iM2504B = iM2504B3 - 1;
                }
                iM2504B = iM2504B3;
            } else {
                iM2504B = iM2504B3;
            }
        }
        float f18 = (f14 - f13) * 2.0f;
        int iM2504B4 = AbstractC0996c0.m2504B((-f18) / (((f15 - f14) * 2.0f) - f18), fArr, iM2504B) + iM2504B;
        float fMin = Math.min(0.0f, 1.0f);
        float fMax = Math.max(0.0f, 1.0f);
        for (int i9 = 0; i9 < iM2504B4; i9++) {
            float f19 = fArr[i9];
            float f20 = (((((((((f10 - f12) * 3.0f) + 1.0f) - 0.0f) * f19) + (((f12 - (f10 * 2.0f)) + 0.0f) * 3.0f)) * f19) + f13) * f19) + 0.0f;
            fMin = Math.min(fMin, f20);
            fMax = Math.max(fMax, f20);
        }
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fMin)) << 32) | (((long) Float.floatToRawIntBits(fMax)) & 4294967295L);
        this.f5962k = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
        this.f5963l = Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0092 A[PHI: r3
  0x0092: PHI (r3v28 float) = (r3v5 float), (r3v16 float), (r3v21 float), (r3v32 float), (r3v37 float) binds: [B:128:0x0236, B:117:0x0206, B:92:0x01bb, B:47:0x00e5, B:22:0x008e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0162 A[PHI: r12
  0x0162: PHI (r12v41 float) = (r12v25 float), (r12v36 float) binds: [B:68:0x0160, B:81:0x0191] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p116i.InterfaceC1796v
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float mo3416b(float f3) {
        float f10;
        if (f3 <= 0.0f || f3 >= 1.0f) {
            return f3;
        }
        float fMax = Math.max(f3, 1.1920929E-7f);
        float f11 = 0.0f - fMax;
        float f12 = this.f5958g;
        float f13 = f12 - fMax;
        float f14 = this.f5960i;
        float f15 = f14 - fMax;
        double d10 = f11;
        float f16 = 0.0f;
        double d11 = ((d10 - (((double) f13) * 2.0d)) + ((double) f15)) * 3.0d;
        double d12 = ((double) (f13 - f11)) * 3.0d;
        double d13 = (((double) (f13 - f15)) * 3.0d) + ((double) (-f11)) + ((double) (1.0f - fMax));
        float f17 = Float.NaN;
        if (Math.abs(d13 - 0.0d) >= 1.0E-7d) {
            double d14 = d11 / d13;
            double d15 = d12 / d13;
            double d16 = d10 / d13;
            double d17 = ((d15 * 3.0d) - (d14 * d14)) / 9.0d;
            double d18 = ((d16 * 27.0d) + ((((2.0d * d14) * d14) * d14) - ((9.0d * d14) * d15))) / 54.0d;
            double d19 = d17 * d17 * d17;
            double d20 = (d18 * d18) + d19;
            double d21 = d14 / 3.0d;
            if (d20 < 0.0d) {
                double dSqrt = Math.sqrt(-d19);
                double d22 = (-d18) / dSqrt;
                if (d22 < -1.0d) {
                    d22 = -1.0d;
                }
                if (d22 > 1.0d) {
                    d22 = 1.0d;
                }
                double dAcos = Math.acos(d22);
                double dM3205o = AbstractC1184v0.m3205o((float) dSqrt) * 2.0f;
                float fCos = (float) ((Math.cos(dAcos / 3.0d) * dM3205o) - d21);
                float f18 = fCos < 0.0f ? 0.0f : fCos;
                if (f18 > 1.0f) {
                    f18 = 1.0f;
                }
                if (Math.abs(f18 - fCos) > 1.05E-6f) {
                    f18 = Float.NaN;
                }
                if (Float.isNaN(f18)) {
                    float fCos2 = (float) ((Math.cos((6.283185307179586d + dAcos) / 3.0d) * dM3205o) - d21);
                    f18 = fCos2 < 0.0f ? 0.0f : fCos2;
                    if (f18 > 1.0f) {
                        f18 = 1.0f;
                    }
                    if (Math.abs(f18 - fCos2) > 1.05E-6f) {
                        f18 = Float.NaN;
                    }
                    if (Float.isNaN(f18)) {
                        float fCos3 = (float) ((Math.cos((dAcos + 12.566370614359172d) / 3.0d) * dM3205o) - d21);
                        if (fCos3 >= 0.0f) {
                            f16 = fCos3;
                        }
                        f10 = f16 > 1.0f ? 1.0f : f16;
                        if (Math.abs(f10 - fCos3) <= 1.05E-6f) {
                        }
                    }
                } else {
                    f17 = f18;
                }
            } else if (d20 == 0.0d) {
                float f19 = -AbstractC1184v0.m3205o((float) d18);
                float f20 = (float) d21;
                float f21 = (f19 * 2.0f) - f20;
                float f22 = f21 < 0.0f ? 0.0f : f21;
                if (f22 > 1.0f) {
                    f22 = 1.0f;
                }
                if (Math.abs(f22 - f21) > 1.05E-6f) {
                    f22 = Float.NaN;
                }
                if (Float.isNaN(f22)) {
                    float f23 = (-f19) - f20;
                    if (f23 >= 0.0f) {
                        f16 = f23;
                    }
                    f10 = f16 > 1.0f ? 1.0f : f16;
                    if (Math.abs(f10 - f23) <= 1.05E-6f) {
                    }
                } else {
                    f17 = f22;
                }
            } else {
                double dSqrt2 = Math.sqrt(d20);
                float fM3205o = (float) (((double) (AbstractC1184v0.m3205o((float) ((-d18) + dSqrt2)) - AbstractC1184v0.m3205o((float) (d18 + dSqrt2)))) - d21);
                if (fM3205o >= 0.0f) {
                    f16 = fM3205o;
                }
                f10 = f16 > 1.0f ? 1.0f : f16;
                if (Math.abs(f10 - fM3205o) <= 1.05E-6f) {
                }
            }
        } else if (Math.abs(d11 - 0.0d) >= 1.0E-7d) {
            double dSqrt3 = Math.sqrt((d12 * d12) - ((4.0d * d11) * d10));
            double d23 = d11 * 2.0d;
            float f24 = (float) ((dSqrt3 - d12) / d23);
            float f25 = f24 < 0.0f ? 0.0f : f24;
            if (f25 > 1.0f) {
                f25 = 1.0f;
            }
            if (Math.abs(f25 - f24) > 1.05E-6f) {
                f25 = Float.NaN;
            }
            if (Float.isNaN(f25)) {
                float f26 = (float) (((-d12) - dSqrt3) / d23);
                if (f26 >= 0.0f) {
                    f16 = f26;
                }
                f10 = f16 > 1.0f ? 1.0f : f16;
                if (Math.abs(f10 - f26) <= 1.05E-6f) {
                }
            } else {
                f17 = f25;
            }
        } else if (Math.abs(d12 - 0.0d) >= 1.0E-7d) {
            float f27 = (float) ((-d10) / d12);
            if (f27 >= 0.0f) {
                f16 = f27;
            }
            f10 = f16 > 1.0f ? 1.0f : f16;
            if (Math.abs(f10 - f27) <= 1.05E-6f) {
                f17 = f10;
            }
        }
        boolean zIsNaN = Float.isNaN(f17);
        float f28 = this.f5961j;
        float f29 = this.f5959h;
        if (!zIsNaN) {
            float f30 = ((((((f29 - f28) + 0.33333334f) * f17) + (f28 - (2.0f * f29))) * f17) + f29) * 3.0f * f17;
            float f31 = this.f5962k;
            if (f30 < f31) {
                f30 = f31;
            }
            float f32 = this.f5963l;
            return f30 > f32 ? f32 : f30;
        }
        throw new IllegalArgumentException("The cubic curve with parameters (" + f12 + ", " + f29 + ", " + f14 + ", " + f28 + ") has no solution at " + f3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (!(obj instanceof C1787s)) {
            return false;
        }
        C1787s c1787s = (C1787s) obj;
        return this.f5958g == c1787s.f5958g && this.f5959h == c1787s.f5959h && this.f5960i == c1787s.f5960i && this.f5961j == c1787s.f5961j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Float.hashCode(this.f5961j) + AbstractC0921a.m2241d(this.f5960i, AbstractC0921a.m2241d(this.f5959h, Float.hashCode(this.f5958g) * 31, 31), 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CubicBezierEasing(a=");
        sb2.append(this.f5958g);
        sb2.append(", b=");
        sb2.append(this.f5959h);
        sb2.append(", c=");
        sb2.append(this.f5960i);
        sb2.append(", d=");
        return AbstractC0921a.m2252o(sb2, this.f5961j, ')');
    }
}
