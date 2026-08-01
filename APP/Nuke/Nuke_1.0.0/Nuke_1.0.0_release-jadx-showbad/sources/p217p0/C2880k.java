package p217p0;

import p211o0.AbstractC2767z;

/* JADX INFO: renamed from: p0.k */
/* JADX INFO: loaded from: classes.dex */
public final class C2880k extends AbstractC2872c {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f9109d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2880k(int i5, int i6, long j5, String str) {
        super(str, j5, i5);
        this.f9109d = i6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p217p0.AbstractC2872c
    /* JADX INFO: renamed from: a */
    public final float mo5070a(int i5) {
        switch (this.f9109d) {
            case 0:
                return i5 == 0 ? 100.0f : 128.0f;
            default:
                return 2.0f;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p217p0.AbstractC2872c
    /* JADX INFO: renamed from: b */
    public final float mo5071b(int i5) {
        switch (this.f9109d) {
            case 0:
                return i5 == 0 ? 0.0f : -128.0f;
            default:
                return -2.0f;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p217p0.AbstractC2872c
    /* JADX INFO: renamed from: d */
    public final long mo5073d(float f2, float f5, float f6) {
        switch (this.f9109d) {
            case 0:
                if (f2 < 0.0f) {
                    f2 = 0.0f;
                }
                if (f2 > 100.0f) {
                    f2 = 100.0f;
                }
                if (f5 < -128.0f) {
                    f5 = -128.0f;
                }
                if (f5 > 128.0f) {
                    f5 = 128.0f;
                }
                float f7 = (f2 + 16.0f) / 116.0f;
                float f8 = (f5 * 0.002f) + f7;
                float f9 = f8 > 0.20689656f ? f8 * f8 * f8 : (f8 - 0.13793103f) * 0.12841855f;
                float f10 = f7 > 0.20689656f ? f7 * f7 * f7 : (f7 - 0.13793103f) * 0.12841855f;
                float[] fArr = AbstractC2879j.f9108e;
                return (((long) Float.floatToRawIntBits(f10 * fArr[1])) & 4294967295L) | (((long) Float.floatToRawIntBits(f9 * fArr[0])) << 32);
            default:
                if (f2 < -2.0f) {
                    f2 = -2.0f;
                }
                if (f2 > 2.0f) {
                    f2 = 2.0f;
                }
                if (f5 < -2.0f) {
                    f5 = -2.0f;
                }
                return (((long) Float.floatToRawIntBits(f2)) << 32) | (((long) Float.floatToRawIntBits(f5 <= 2.0f ? f5 : 2.0f)) & 4294967295L);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p217p0.AbstractC2872c
    /* JADX INFO: renamed from: e */
    public final float mo5074e(float f2, float f5, float f6) {
        switch (this.f9109d) {
            case 0:
                if (f2 < 0.0f) {
                    f2 = 0.0f;
                }
                if (f2 > 100.0f) {
                    f2 = 100.0f;
                }
                if (f6 < -128.0f) {
                    f6 = -128.0f;
                }
                if (f6 > 128.0f) {
                    f6 = 128.0f;
                }
                float f7 = ((f2 + 16.0f) / 116.0f) - (f6 * 0.005f);
                return (f7 > 0.20689656f ? f7 * f7 * f7 : 0.12841855f * (f7 - 0.13793103f)) * AbstractC2879j.f9108e[2];
            default:
                if (f6 < -2.0f) {
                    f6 = -2.0f;
                }
                if (f6 > 2.0f) {
                    return 2.0f;
                }
                return f6;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p217p0.AbstractC2872c
    /* JADX INFO: renamed from: f */
    public final long mo5075f(float f2, float f5, float f6, float f7, AbstractC2872c abstractC2872c) {
        switch (this.f9109d) {
            case 0:
                float[] fArr = AbstractC2879j.f9108e;
                float f8 = f2 / fArr[0];
                float f9 = f5 / fArr[1];
                float f10 = f6 / fArr[2];
                float fCbrt = f8 > 0.008856452f ? (float) Math.cbrt(f8) : (f8 * 7.787037f) + 0.13793103f;
                float fCbrt2 = f9 > 0.008856452f ? (float) Math.cbrt(f9) : (f9 * 7.787037f) + 0.13793103f;
                float f11 = (116.0f * fCbrt2) - 16.0f;
                float f12 = (fCbrt - fCbrt2) * 500.0f;
                float fCbrt3 = (fCbrt2 - (f10 > 0.008856452f ? (float) Math.cbrt(f10) : (f10 * 7.787037f) + 0.13793103f)) * 200.0f;
                if (f11 < 0.0f) {
                    f11 = 0.0f;
                }
                if (f11 > 100.0f) {
                    f11 = 100.0f;
                }
                if (f12 < -128.0f) {
                    f12 = -128.0f;
                }
                if (f12 > 128.0f) {
                    f12 = 128.0f;
                }
                if (fCbrt3 < -128.0f) {
                    fCbrt3 = -128.0f;
                }
                return AbstractC2767z.m4932b(f11, f12, fCbrt3 <= 128.0f ? fCbrt3 : 128.0f, f7, abstractC2872c);
            default:
                if (f2 < -2.0f) {
                    f2 = -2.0f;
                }
                if (f2 > 2.0f) {
                    f2 = 2.0f;
                }
                if (f5 < -2.0f) {
                    f5 = -2.0f;
                }
                if (f5 > 2.0f) {
                    f5 = 2.0f;
                }
                if (f6 < -2.0f) {
                    f6 = -2.0f;
                }
                return AbstractC2767z.m4932b(f2, f5, f6 <= 2.0f ? f6 : 2.0f, f7, abstractC2872c);
        }
    }
}
