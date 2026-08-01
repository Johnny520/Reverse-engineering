package p265s1;

import p117i.AbstractC3057h;
import p152k3.AbstractC3950d;

/* JADX INFO: renamed from: s1.y0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7164y0 {
    /* JADX INFO: renamed from: b */
    public static final long m28264b(float f10, float f11, float f12, float f13, float[] fArr, int i10) {
        float f14 = (f11 - f10) * 3.0f;
        float f15 = (f12 - f11) * 3.0f;
        float f16 = (f13 - f12) * 3.0f;
        int iM28268f = m28268f(f14, f15, f16, fArr, i10);
        float f17 = (f15 - f14) * 2.0f;
        int iM28269g = iM28268f + m28269g((-f17) / (((f16 - f15) * 2.0f) - f17), fArr, i10 + iM28268f);
        float fMin = Math.min(f10, f13);
        float fMax = Math.max(f10, f13);
        for (int i11 = 0; i11 < iM28269g; i11++) {
            float fM28266d = m28266d(f10, f11, f12, f13, fArr[i11]);
            fMin = Math.min(fMin, fM28266d);
            fMax = Math.max(fMax, fM28266d);
        }
        return AbstractC3057h.m11312a(fMin, fMax);
    }

    /* JADX INFO: renamed from: c */
    public static final float m28265c(float f10, float f11, float f12) {
        return ((((((f10 - f11) + 0.33333334f) * f12) + (f11 - (2.0f * f10))) * f12) + f10) * 3.0f * f12;
    }

    /* JADX INFO: renamed from: d */
    public static final float m28266d(float f10, float f11, float f12, float f13, float f14) {
        float f15 = (f13 + ((f11 - f12) * 3.0f)) - f10;
        return (((((f15 * f14) + (((f12 - (2.0f * f11)) + f10) * 3.0f)) * f14) + ((f11 - f10) * 3.0f)) * f14) + f10;
    }

    /* JADX INFO: renamed from: e */
    public static final float m28267e(float f10, float f11, float f12, float f13) {
        float f14;
        float f15;
        double d10 = f10;
        double d11 = ((d10 - (((double) f11) * 2.0d)) + ((double) f12)) * 3.0d;
        double d12 = ((double) (f11 - f10)) * 3.0d;
        double d13 = ((double) (-f10)) + (((double) (f11 - f12)) * 3.0d) + ((double) f13);
        if (Math.abs(d13 - 0.0d) < 1.0E-7d) {
            if (Math.abs(d11 - 0.0d) < 1.0E-7d) {
                if (Math.abs(d12 - 0.0d) < 1.0E-7d) {
                    return Float.NaN;
                }
                float f16 = (float) ((-d10) / d12);
                f14 = f16 >= 0.0f ? f16 : 0.0f;
                f15 = f14 <= 1.0f ? f14 : 1.0f;
                if (Math.abs(f15 - f16) > 1.05E-6f) {
                    return Float.NaN;
                }
                return f15;
            }
            double dSqrt = Math.sqrt((d12 * d12) - ((4.0d * d11) * d10));
            double d14 = d11 * 2.0d;
            float f17 = (float) ((dSqrt - d12) / d14);
            float f18 = f17 < 0.0f ? 0.0f : f17;
            if (f18 > 1.0f) {
                f18 = 1.0f;
            }
            if (Math.abs(f18 - f17) > 1.05E-6f) {
                f18 = Float.NaN;
            }
            if (!Float.isNaN(f18)) {
                return f18;
            }
            float f19 = (float) (((-d12) - dSqrt) / d14);
            f14 = f19 >= 0.0f ? f19 : 0.0f;
            f15 = f14 <= 1.0f ? f14 : 1.0f;
            if (Math.abs(f15 - f19) > 1.05E-6f) {
                return Float.NaN;
            }
            return f15;
        }
        double d15 = d11 / d13;
        double d16 = d12 / d13;
        double d17 = d10 / d13;
        double d18 = ((d16 * 3.0d) - (d15 * d15)) / 9.0d;
        double d19 = (((((2.0d * d15) * d15) * d15) - ((9.0d * d15) * d16)) + (d17 * 27.0d)) / 54.0d;
        double d20 = d18 * d18 * d18;
        double d21 = (d19 * d19) + d20;
        double d22 = d15 / 3.0d;
        if (d21 >= 0.0d) {
            if (d21 != 0.0d) {
                double dSqrt2 = Math.sqrt(d21);
                float fM15659a = (float) (((double) (AbstractC3950d.m15659a((float) ((-d19) + dSqrt2)) - AbstractC3950d.m15659a((float) (d19 + dSqrt2)))) - d22);
                f14 = fM15659a >= 0.0f ? fM15659a : 0.0f;
                f15 = f14 <= 1.0f ? f14 : 1.0f;
                if (Math.abs(f15 - fM15659a) > 1.05E-6f) {
                    return Float.NaN;
                }
                return f15;
            }
            float f20 = -AbstractC3950d.m15659a((float) d19);
            float f21 = (float) d22;
            float f22 = (2.0f * f20) - f21;
            float f23 = f22 < 0.0f ? 0.0f : f22;
            if (f23 > 1.0f) {
                f23 = 1.0f;
            }
            if (Math.abs(f23 - f22) > 1.05E-6f) {
                f23 = Float.NaN;
            }
            if (!Float.isNaN(f23)) {
                return f23;
            }
            float f24 = (-f20) - f21;
            f14 = f24 >= 0.0f ? f24 : 0.0f;
            f15 = f14 <= 1.0f ? f14 : 1.0f;
            if (Math.abs(f15 - f24) > 1.05E-6f) {
                return Float.NaN;
            }
            return f15;
        }
        double dSqrt3 = Math.sqrt(-d20);
        double d23 = (-d19) / dSqrt3;
        if (d23 < -1.0d) {
            d23 = -1.0d;
        }
        if (d23 > 1.0d) {
            d23 = 1.0d;
        }
        double dAcos = Math.acos(d23);
        double dM15659a = AbstractC3950d.m15659a((float) dSqrt3) * 2.0f;
        float fCos = (float) ((Math.cos(dAcos / 3.0d) * dM15659a) - d22);
        float f25 = fCos < 0.0f ? 0.0f : fCos;
        if (f25 > 1.0f) {
            f25 = 1.0f;
        }
        if (Math.abs(f25 - fCos) > 1.05E-6f) {
            f25 = Float.NaN;
        }
        if (!Float.isNaN(f25)) {
            return f25;
        }
        float fCos2 = (float) ((Math.cos((6.283185307179586d + dAcos) / 3.0d) * dM15659a) - d22);
        float f26 = fCos2 < 0.0f ? 0.0f : fCos2;
        if (f26 > 1.0f) {
            f26 = 1.0f;
        }
        if (Math.abs(f26 - fCos2) > 1.05E-6f) {
            f26 = Float.NaN;
        }
        if (!Float.isNaN(f26)) {
            return f26;
        }
        float fCos3 = (float) ((dM15659a * Math.cos((dAcos + 12.566370614359172d) / 3.0d)) - d22);
        f14 = fCos3 >= 0.0f ? fCos3 : 0.0f;
        f15 = f14 <= 1.0f ? f14 : 1.0f;
        if (Math.abs(f15 - fCos3) > 1.05E-6f) {
            return Float.NaN;
        }
        return f15;
    }

    /* JADX INFO: renamed from: f */
    public static final int m28268f(float f10, float f11, float f12, float[] fArr, int i10) {
        double d10 = f10;
        double d11 = f11;
        double d12 = f12;
        double d13 = d11 * 2.0d;
        double d14 = (d10 - d13) + d12;
        if (d14 == 0.0d) {
            if (d11 == d12) {
                return 0;
            }
            return m28269g((float) ((d13 - d12) / (d13 - (d12 * 2.0d))), fArr, i10);
        }
        double d15 = -Math.sqrt((d11 * d11) - (d12 * d10));
        double d16 = (-d10) + d11;
        int iM28269g = m28269g((float) ((-(d15 + d16)) / d14), fArr, i10);
        int iM28269g2 = iM28269g + m28269g((float) ((d15 - d16) / d14), fArr, i10 + iM28269g);
        if (iM28269g2 <= 1) {
            return iM28269g2;
        }
        float f13 = fArr[i10];
        int i11 = i10 + 1;
        float f14 = fArr[i11];
        if (f13 <= f14) {
            return f13 == f14 ? iM28269g2 - 1 : iM28269g2;
        }
        fArr[i10] = f14;
        fArr[i11] = f13;
        return iM28269g2;
    }

    /* JADX INFO: renamed from: g */
    public static final int m28269g(float f10, float[] fArr, int i10) {
        float f11 = f10 >= 0.0f ? f10 : 0.0f;
        if (f11 > 1.0f) {
            f11 = 1.0f;
        }
        if (Math.abs(f11 - f10) > 1.05E-6f) {
            f11 = Float.NaN;
        }
        fArr[i10] = f11;
        return !Float.isNaN(f11) ? 1 : 0;
    }
}
