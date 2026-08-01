package p203n;

import p011B4.AbstractC0231b;
import p179i4.AbstractC2352g;
import p211o0.AbstractC2767z;

/* JADX INFO: renamed from: n.q */
/* JADX INFO: loaded from: classes.dex */
public final class C2672q implements InterfaceC2675t {

    /* JADX INFO: renamed from: d */
    public final float f8527d;

    /* JADX INFO: renamed from: e */
    public final float f8528e;

    /* JADX INFO: renamed from: f */
    public final float f8529f;

    /* JADX INFO: renamed from: g */
    public final float f8530g;

    /* JADX INFO: renamed from: h */
    public final float f8531h;

    /* JADX INFO: renamed from: i */
    public final float f8532i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2672q(float f2, float f5, float f6, float f7) {
        int iM4930C;
        this.f8527d = f2;
        this.f8528e = f5;
        this.f8529f = f6;
        this.f8530g = f7;
        if (!((Float.isNaN(f2) || Float.isNaN(f5) || Float.isNaN(f6) || Float.isNaN(f7)) ? false : true)) {
            AbstractC2624G.m4574a("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: " + f2 + ", " + f5 + ", " + f6 + ", " + f7 + '.');
        }
        float[] fArr = new float[5];
        float f8 = (f5 - 0.0f) * 3.0f;
        float f9 = (f7 - f5) * 3.0f;
        float f10 = (1.0f - f7) * 3.0f;
        double d5 = f8;
        double d6 = f9;
        double d7 = f10;
        double d8 = d6 * 2.0d;
        double d9 = (d5 - d8) + d7;
        if (d9 == 0.0d) {
            iM4930C = d6 == d7 ? 0 : AbstractC2767z.m4930C((float) ((d8 - d7) / (d8 - (d7 * 2.0d))), fArr, 0);
        } else {
            double d10 = -Math.sqrt((d6 * d6) - (d7 * d5));
            double d11 = (-d5) + d6;
            int iM4930C2 = AbstractC2767z.m4930C((float) ((-(d10 + d11)) / d9), fArr, 0);
            int iM4930C3 = AbstractC2767z.m4930C((float) ((d10 - d11) / d9), fArr, iM4930C2) + iM4930C2;
            if (iM4930C3 > 1) {
                float f11 = fArr[0];
                float f12 = fArr[1];
                if (f11 > f12) {
                    fArr[0] = f12;
                    fArr[1] = f11;
                } else if (f11 == f12) {
                    iM4930C = iM4930C3 - 1;
                }
                iM4930C = iM4930C3;
            } else {
                iM4930C = iM4930C3;
            }
        }
        float f13 = (f9 - f8) * 2.0f;
        int iM4930C4 = AbstractC2767z.m4930C((-f13) / (((f10 - f9) * 2.0f) - f13), fArr, iM4930C) + iM4930C;
        float fMin = Math.min(0.0f, 1.0f);
        float fMax = Math.max(0.0f, 1.0f);
        for (int i5 = 0; i5 < iM4930C4; i5++) {
            float f14 = fArr[i5];
            float f15 = (((((((((f5 - f7) * 3.0f) + 1.0f) - 0.0f) * f14) + (((f7 - (f5 * 2.0f)) + 0.0f) * 3.0f)) * f14) + f8) * f14) + 0.0f;
            fMin = Math.min(fMin, f15);
            fMax = Math.max(fMax, f15);
        }
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fMin)) << 32) | (((long) Float.floatToRawIntBits(fMax)) & 4294967295L);
        this.f8531h = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
        this.f8532i = Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0092 A[PHI: r3
  0x0092: PHI (r3v28 float) = (r3v5 float), (r3v16 float), (r3v21 float), (r3v32 float), (r3v37 float) binds: [B:128:0x0236, B:117:0x0206, B:92:0x01bb, B:47:0x00e5, B:22:0x008e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0162 A[PHI: r12
  0x0162: PHI (r12v41 float) = (r12v25 float), (r12v36 float) binds: [B:68:0x0160, B:81:0x0191] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p203n.InterfaceC2675t
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float mo600a(float f2) {
        float f5;
        if (f2 <= 0.0f || f2 >= 1.0f) {
            return f2;
        }
        float fMax = Math.max(f2, 1.1920929E-7f);
        float f6 = 0.0f - fMax;
        float f7 = this.f8527d;
        float f8 = f7 - fMax;
        float f9 = this.f8529f;
        float f10 = f9 - fMax;
        double d5 = f6;
        float f11 = 0.0f;
        double d6 = ((d5 - (((double) f8) * 2.0d)) + ((double) f10)) * 3.0d;
        double d7 = ((double) (f8 - f6)) * 3.0d;
        double d8 = (((double) (f8 - f10)) * 3.0d) + ((double) (-f6)) + ((double) (1.0f - fMax));
        float f12 = Float.NaN;
        if (Math.abs(d8 - 0.0d) >= 1.0E-7d) {
            double d9 = d6 / d8;
            double d10 = d7 / d8;
            double d11 = d5 / d8;
            double d12 = ((d10 * 3.0d) - (d9 * d9)) / 9.0d;
            double d13 = ((d11 * 27.0d) + ((((2.0d * d9) * d9) * d9) - ((9.0d * d9) * d10))) / 54.0d;
            double d14 = d12 * d12 * d12;
            double d15 = (d13 * d13) + d14;
            double d16 = d9 / 3.0d;
            if (d15 < 0.0d) {
                double dSqrt = Math.sqrt(-d14);
                double d17 = (-d13) / dSqrt;
                if (d17 < -1.0d) {
                    d17 = -1.0d;
                }
                if (d17 > 1.0d) {
                    d17 = 1.0d;
                }
                double dAcos = Math.acos(d17);
                double dM4203p = AbstractC2352g.m4203p((float) dSqrt) * 2.0f;
                float fCos = (float) ((Math.cos(dAcos / 3.0d) * dM4203p) - d16);
                float f13 = fCos < 0.0f ? 0.0f : fCos;
                if (f13 > 1.0f) {
                    f13 = 1.0f;
                }
                if (Math.abs(f13 - fCos) > 1.05E-6f) {
                    f13 = Float.NaN;
                }
                if (Float.isNaN(f13)) {
                    float fCos2 = (float) ((Math.cos((6.283185307179586d + dAcos) / 3.0d) * dM4203p) - d16);
                    f13 = fCos2 < 0.0f ? 0.0f : fCos2;
                    if (f13 > 1.0f) {
                        f13 = 1.0f;
                    }
                    if (Math.abs(f13 - fCos2) > 1.05E-6f) {
                        f13 = Float.NaN;
                    }
                    if (Float.isNaN(f13)) {
                        float fCos3 = (float) ((Math.cos((dAcos + 12.566370614359172d) / 3.0d) * dM4203p) - d16);
                        if (fCos3 >= 0.0f) {
                            f11 = fCos3;
                        }
                        f5 = f11 > 1.0f ? 1.0f : f11;
                        if (Math.abs(f5 - fCos3) <= 1.05E-6f) {
                        }
                    }
                } else {
                    f12 = f13;
                }
            } else if (d15 == 0.0d) {
                float f14 = -AbstractC2352g.m4203p((float) d13);
                float f15 = (float) d16;
                float f16 = (f14 * 2.0f) - f15;
                float f17 = f16 < 0.0f ? 0.0f : f16;
                if (f17 > 1.0f) {
                    f17 = 1.0f;
                }
                if (Math.abs(f17 - f16) > 1.05E-6f) {
                    f17 = Float.NaN;
                }
                if (Float.isNaN(f17)) {
                    float f18 = (-f14) - f15;
                    if (f18 >= 0.0f) {
                        f11 = f18;
                    }
                    f5 = f11 > 1.0f ? 1.0f : f11;
                    if (Math.abs(f5 - f18) <= 1.05E-6f) {
                    }
                } else {
                    f12 = f17;
                }
            } else {
                double dSqrt2 = Math.sqrt(d15);
                float fM4203p = (float) (((double) (AbstractC2352g.m4203p((float) ((-d13) + dSqrt2)) - AbstractC2352g.m4203p((float) (d13 + dSqrt2)))) - d16);
                if (fM4203p >= 0.0f) {
                    f11 = fM4203p;
                }
                f5 = f11 > 1.0f ? 1.0f : f11;
                if (Math.abs(f5 - fM4203p) <= 1.05E-6f) {
                }
            }
        } else if (Math.abs(d6 - 0.0d) >= 1.0E-7d) {
            double dSqrt3 = Math.sqrt((d7 * d7) - ((4.0d * d6) * d5));
            double d18 = d6 * 2.0d;
            float f19 = (float) ((dSqrt3 - d7) / d18);
            float f20 = f19 < 0.0f ? 0.0f : f19;
            if (f20 > 1.0f) {
                f20 = 1.0f;
            }
            if (Math.abs(f20 - f19) > 1.05E-6f) {
                f20 = Float.NaN;
            }
            if (Float.isNaN(f20)) {
                float f21 = (float) (((-d7) - dSqrt3) / d18);
                if (f21 >= 0.0f) {
                    f11 = f21;
                }
                f5 = f11 > 1.0f ? 1.0f : f11;
                if (Math.abs(f5 - f21) <= 1.05E-6f) {
                }
            } else {
                f12 = f20;
            }
        } else if (Math.abs(d7 - 0.0d) >= 1.0E-7d) {
            float f22 = (float) ((-d5) / d7);
            if (f22 >= 0.0f) {
                f11 = f22;
            }
            f5 = f11 > 1.0f ? 1.0f : f11;
            if (Math.abs(f5 - f22) <= 1.05E-6f) {
                f12 = f5;
            }
        }
        boolean zIsNaN = Float.isNaN(f12);
        float f23 = this.f8530g;
        float f24 = this.f8528e;
        if (!zIsNaN) {
            float f25 = ((((((f24 - f23) + 0.33333334f) * f12) + (f23 - (2.0f * f24))) * f12) + f24) * 3.0f * f12;
            float f26 = this.f8531h;
            if (f25 < f26) {
                f25 = f26;
            }
            float f27 = this.f8532i;
            return f25 > f27 ? f27 : f25;
        }
        throw new IllegalArgumentException("The cubic curve with parameters (" + f7 + ", " + f24 + ", " + f9 + ", " + f23 + ") has no solution at " + f2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (!(obj instanceof C2672q)) {
            return false;
        }
        C2672q c2672q = (C2672q) obj;
        return this.f8527d == c2672q.f8527d && this.f8528e == c2672q.f8528e && this.f8529f == c2672q.f8529f && this.f8530g == c2672q.f8530g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Float.hashCode(this.f8530g) + AbstractC0231b.m390a(this.f8529f, AbstractC0231b.m390a(this.f8528e, Float.hashCode(this.f8527d) * 31, 31), 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("CubicBezierEasing(a=");
        sb.append(this.f8527d);
        sb.append(", b=");
        sb.append(this.f8528e);
        sb.append(", c=");
        sb.append(this.f8529f);
        sb.append(", d=");
        return AbstractC0231b.m401l(sb, this.f8530g, ')');
    }
}
