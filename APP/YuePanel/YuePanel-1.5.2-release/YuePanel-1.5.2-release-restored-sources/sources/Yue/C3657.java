package Yue;

import Yue.InterfaceC7144;

/* JADX INFO: renamed from: Yue.ۥۣ۟ۧۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP})
public class C3657 {

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final float f6468 = 0.2f;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final float f6469 = 1.0f;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final float f6470 = 0.4f;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static final float f6471 = 0.01f;

    /* JADX INFO: renamed from: ۥ */
    public final float f444;

    /* JADX INFO: renamed from: ۥ۟ */
    public final float f445;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final float f6472;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final float f6473;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final float f6474;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final float f6475;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final float f6476;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final float f6477;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final float f6478;

    public C3657(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        this.f444 = f;
        this.f445 = f2;
        this.f6472 = f3;
        this.f6473 = f4;
        this.f6474 = f5;
        this.f6475 = f6;
        this.f6476 = f7;
        this.f6477 = f8;
        this.f6478 = f9;
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟ */
    public static C3657 m727(@InterfaceC4885(from = 0.0d, m1796to = 360.0d) float f, @InterfaceC4885(from = 0.0d, m1796to = C4490.f9442, toInclusive = false) float f2, @InterfaceC4885(from = 0.0d, m1796to = C3913.f572) float f3) {
        float f4 = 100.0f;
        float f5 = 1000.0f;
        float f6 = 0.0f;
        C3657 c3657 = null;
        float f7 = 1000.0f;
        while (Math.abs(f6 - f4) > 0.01f) {
            float f8 = ((f4 - f6) / 2.0f) + f6;
            int iM10004 = m9989(f8, f2, f).m10004();
            float fM730 = C3658.m730(iM10004);
            float fAbs = Math.abs(f3 - fM730);
            if (fAbs < 0.2f) {
                C3657 c3657M9987 = m9987(iM10004);
                float fM728 = c3657M9987.m728(m9989(c3657M9987.m9998(), c3657M9987.m9996(), f));
                if (fM728 <= 1.0f) {
                    c3657 = c3657M9987;
                    f5 = fAbs;
                    f7 = fM728;
                }
            }
            if (f5 == 0.0f && f7 == 0.0f) {
                break;
            }
            if (fM730 < f3) {
                f6 = f8;
            } else {
                f4 = f8;
            }
        }
        return c3657;
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static C3657 m9987(@InterfaceC3897 int i) {
        float[] fArr = new float[7];
        float[] fArr2 = new float[3];
        m9988(i, C8385.f24986, fArr, fArr2);
        return new C3657(fArr2[0], fArr2[1], fArr[0], fArr[1], fArr[2], fArr[3], fArr[4], fArr[5], fArr[6]);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static void m9988(@InterfaceC3897 int i, @InterfaceC6391 C8385 c8385, @InterfaceC7473(7) @InterfaceC6490 float[] fArr, @InterfaceC6391 @InterfaceC7473(3) float[] fArr2) {
        C3658.m10008(i, fArr2);
        float[][] fArr3 = C3658.f446;
        float f = fArr2[0];
        float[] fArr4 = fArr3[0];
        float f2 = fArr4[0] * f;
        float f3 = fArr2[1];
        float f4 = f2 + (fArr4[1] * f3);
        float f5 = fArr2[2];
        float f6 = f4 + (fArr4[2] * f5);
        float[] fArr5 = fArr3[1];
        float f7 = (fArr5[0] * f) + (fArr5[1] * f3) + (fArr5[2] * f5);
        float[] fArr6 = fArr3[2];
        float f8 = (f * fArr6[0]) + (f3 * fArr6[1]) + (f5 * fArr6[2]);
        float f9 = c8385.m27958()[0] * f6;
        float f10 = c8385.m27958()[1] * f7;
        float f11 = c8385.m27958()[2] * f8;
        float fPow = (float) Math.pow(((double) (c8385.m27952() * Math.abs(f9))) / 100.0d, 0.42d);
        float fPow2 = (float) Math.pow(((double) (c8385.m27952() * Math.abs(f10))) / 100.0d, 0.42d);
        float fPow3 = (float) Math.pow(((double) (c8385.m27952() * Math.abs(f11))) / 100.0d, 0.42d);
        float fSignum = ((Math.signum(f9) * 400.0f) * fPow) / (fPow + 27.13f);
        float fSignum2 = ((Math.signum(f10) * 400.0f) * fPow2) / (fPow2 + 27.13f);
        float fSignum3 = ((Math.signum(f11) * 400.0f) * fPow3) / (fPow3 + 27.13f);
        double d = fSignum3;
        float f12 = ((float) (((((double) fSignum) * 11.0d) + (((double) fSignum2) * (-12.0d))) + d)) / 11.0f;
        float f13 = ((float) (((double) (fSignum + fSignum2)) - (d * 2.0d))) / 9.0f;
        float f14 = fSignum2 * 20.0f;
        float f15 = (((fSignum * 20.0f) + f14) + (21.0f * fSignum3)) / 20.0f;
        float f16 = (((fSignum * 40.0f) + f14) + fSignum3) / 20.0f;
        float fAtan2 = (((float) Math.atan2(f13, f12)) * 180.0f) / 3.1415927f;
        if (fAtan2 < 0.0f) {
            fAtan2 += 360.0f;
        } else if (fAtan2 >= 360.0f) {
            fAtan2 -= 360.0f;
        }
        float f17 = (3.1415927f * fAtan2) / 180.0f;
        float fPow4 = ((float) Math.pow((f16 * c8385.m27955()) / c8385.m4369(), c8385.m4370() * c8385.m27959())) * 100.0f;
        float fM4370 = (4.0f / c8385.m4370()) * ((float) Math.sqrt(fPow4 / 100.0f)) * (c8385.m4369() + 4.0f) * c8385.m27953();
        float fSqrt = ((float) Math.sqrt(((double) fPow4) / 100.0d)) * ((float) Math.pow(1.64d - Math.pow(0.29d, c8385.m27954()), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos(((((double) (((double) fAtan2) < 20.14d ? 360.0f + fAtan2 : fAtan2)) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * c8385.m27956()) * c8385.m27957()) * ((float) Math.sqrt((f12 * f12) + (f13 * f13)))) / (f15 + 0.305f), 0.9d));
        float fM27953 = c8385.m27953() * fSqrt;
        float fSqrt2 = ((float) Math.sqrt((r7 * c8385.m4370()) / (c8385.m4369() + 4.0f))) * 50.0f;
        float f18 = (1.7f * fPow4) / ((0.007f * fPow4) + 1.0f);
        float fLog = ((float) Math.log((0.0228f * fM27953) + 1.0f)) * 43.85965f;
        double d2 = f17;
        float fCos = ((float) Math.cos(d2)) * fLog;
        float fSin = fLog * ((float) Math.sin(d2));
        fArr2[0] = fAtan2;
        fArr2[1] = fSqrt;
        if (fArr != null) {
            fArr[0] = fPow4;
            fArr[1] = fM4370;
            fArr[2] = fM27953;
            fArr[3] = fSqrt2;
            fArr[4] = f18;
            fArr[5] = fCos;
            fArr[6] = fSin;
        }
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static C3657 m9989(@InterfaceC4885(from = 0.0d, m1796to = C3913.f572) float f, @InterfaceC4885(from = 0.0d, m1796to = C4490.f9442, toInclusive = false) float f2, @InterfaceC4885(from = 0.0d, m1796to = 360.0d) float f3) {
        return m9990(f, f2, f3, C8385.f24986);
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static C3657 m9990(@InterfaceC4885(from = 0.0d, m1796to = C3913.f572) float f, @InterfaceC4885(from = 0.0d, m1796to = C4490.f9442, toInclusive = false) float f2, @InterfaceC4885(from = 0.0d, m1796to = 360.0d) float f3, C8385 c8385) {
        float fM4370 = (4.0f / c8385.m4370()) * ((float) Math.sqrt(((double) f) / 100.0d)) * (c8385.m4369() + 4.0f) * c8385.m27953();
        float fM27953 = f2 * c8385.m27953();
        float fSqrt = ((float) Math.sqrt(((f2 / ((float) Math.sqrt(r4))) * c8385.m4370()) / (c8385.m4369() + 4.0f))) * 50.0f;
        float f4 = (1.7f * f) / ((0.007f * f) + 1.0f);
        float fLog = ((float) Math.log((((double) fM27953) * 0.0228d) + 1.0d)) * 43.85965f;
        double d = (3.1415927f * f3) / 180.0f;
        return new C3657(f3, f2, f, fM4370, fM27953, fSqrt, f4, fLog * ((float) Math.cos(d)), fLog * ((float) Math.sin(d)));
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static void m9991(@InterfaceC3897 int i, @InterfaceC6391 @InterfaceC7473(3) float[] fArr) {
        m9988(i, C8385.f24986, null, fArr);
        fArr[2] = C3658.m730(i);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static int m9992(@InterfaceC4885(from = 0.0d, m1796to = 360.0d) float f, @InterfaceC4885(from = 0.0d, m1796to = C4490.f9442, toInclusive = false) float f2, @InterfaceC4885(from = 0.0d, m1796to = C3913.f572) float f3) {
        return m9993(f, f2, f3, C8385.f24986);
    }

    @InterfaceC3897
    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static int m9993(@InterfaceC4885(from = 0.0d, m1796to = 360.0d) float f, @InterfaceC4885(from = 0.0d, m1796to = C4490.f9442, toInclusive = false) float f2, @InterfaceC4885(from = 0.0d, m1796to = C3913.f572) float f3, @InterfaceC6391 C8385 c8385) {
        if (f2 < 1.0d || Math.round(f3) <= 0.0d || Math.round(f3) >= 100.0d) {
            return C3658.m729(f3);
        }
        float fMin = f < 0.0f ? 0.0f : Math.min(360.0f, f);
        C3657 c3657 = null;
        boolean z = true;
        float f4 = 0.0f;
        float f5 = f2;
        while (Math.abs(f4 - f2) >= 0.4f) {
            C3657 c3657M727 = m727(fMin, f5, f3);
            if (!z) {
                if (c3657M727 == null) {
                    f2 = f5;
                } else {
                    f4 = f5;
                    c3657 = c3657M727;
                }
                f5 = ((f2 - f4) / 2.0f) + f4;
            } else {
                if (c3657M727 != null) {
                    return c3657M727.m10003(c8385);
                }
                f5 = ((f2 - f4) / 2.0f) + f4;
                z = false;
            }
        }
        return c3657 == null ? C3658.m729(f3) : c3657.m10003(c8385);
    }

    /* JADX INFO: renamed from: ۥ */
    public float m728(@InterfaceC6391 C3657 c3657) {
        float fM9999 = m9999() - c3657.m9999();
        float fM9994 = m9994() - c3657.m9994();
        float fM9995 = m9995() - c3657.m9995();
        return (float) (Math.pow(Math.sqrt((fM9999 * fM9999) + (fM9994 * fM9994) + (fM9995 * fM9995)), 0.63d) * 1.41d);
    }

    @InterfaceC4885(from = C4490.f9443, fromInclusive = false, m1796to = C4490.f9442, toInclusive = false)
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public float m9994() {
        return this.f6477;
    }

    @InterfaceC4885(from = C4490.f9443, fromInclusive = false, m1796to = C4490.f9442, toInclusive = false)
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public float m9995() {
        return this.f6478;
    }

    @InterfaceC4885(from = 0.0d, m1796to = C4490.f9442, toInclusive = false)
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public float m9996() {
        return this.f445;
    }

    @InterfaceC4885(from = 0.0d, m1796to = 360.0d, toInclusive = false)
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public float m9997() {
        return this.f444;
    }

    @InterfaceC4885(from = 0.0d, m1796to = C3913.f572)
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public float m9998() {
        return this.f6472;
    }

    @InterfaceC4885(from = 0.0d, m1796to = C3913.f572)
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public float m9999() {
        return this.f6476;
    }

    @InterfaceC4885(from = 0.0d, m1796to = C4490.f9442, toInclusive = false)
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public float m10000() {
        return this.f6474;
    }

    @InterfaceC4885(from = 0.0d, m1796to = C4490.f9442, toInclusive = false)
    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public float m10001() {
        return this.f6473;
    }

    @InterfaceC4885(from = 0.0d, m1796to = C4490.f9442, toInclusive = false)
    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public float m10002() {
        return this.f6475;
    }

    @InterfaceC3897
    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public int m10003(@InterfaceC6391 C8385 c8385) {
        float fPow = (float) Math.pow(((double) ((((double) m9996()) == 0.0d || ((double) m9998()) == 0.0d) ? 0.0f : m9996() / ((float) Math.sqrt(((double) m9998()) / 100.0d)))) / Math.pow(1.64d - Math.pow(0.29d, c8385.m27954()), 0.73d), 1.1111111111111112d);
        double dM9997 = (m9997() * 3.1415927f) / 180.0f;
        float fCos = ((float) (Math.cos(2.0d + dM9997) + 3.8d)) * 0.25f;
        float fM4369 = c8385.m4369() * ((float) Math.pow(((double) m9998()) / 100.0d, (1.0d / ((double) c8385.m4370())) / ((double) c8385.m27959())));
        float fM27956 = fCos * 3846.1538f * c8385.m27956() * c8385.m27957();
        float fM27955 = fM4369 / c8385.m27955();
        float fSin = (float) Math.sin(dM9997);
        float fCos2 = (float) Math.cos(dM9997);
        float f = (((0.305f + fM27955) * 23.0f) * fPow) / (((fM27956 * 23.0f) + ((11.0f * fPow) * fCos2)) + ((fPow * 108.0f) * fSin));
        float f2 = fCos2 * f;
        float f3 = f * fSin;
        float f4 = fM27955 * 460.0f;
        float f5 = (((451.0f * f2) + f4) + (288.0f * f3)) / 1403.0f;
        float f6 = ((f4 - (891.0f * f2)) - (261.0f * f3)) / 1403.0f;
        float fSignum = Math.signum(f5) * (100.0f / c8385.m27952()) * ((float) Math.pow((float) Math.max(0.0d, (((double) Math.abs(f5)) * 27.13d) / (400.0d - ((double) Math.abs(f5)))), 2.380952380952381d));
        float fSignum2 = Math.signum(f6) * (100.0f / c8385.m27952()) * ((float) Math.pow((float) Math.max(0.0d, (((double) Math.abs(f6)) * 27.13d) / (400.0d - ((double) Math.abs(f6)))), 2.380952380952381d));
        float fSignum3 = Math.signum(((f4 - (f2 * 220.0f)) - (f3 * 6300.0f)) / 1403.0f) * (100.0f / c8385.m27952()) * ((float) Math.pow((float) Math.max(0.0d, (((double) Math.abs(r8)) * 27.13d) / (400.0d - ((double) Math.abs(r8)))), 2.380952380952381d));
        float f7 = fSignum / c8385.m27958()[0];
        float f8 = fSignum2 / c8385.m27958()[1];
        float f9 = fSignum3 / c8385.m27958()[2];
        float[][] fArr = C3658.f447;
        float[] fArr2 = fArr[0];
        float f10 = (fArr2[0] * f7) + (fArr2[1] * f8) + (fArr2[2] * f9);
        float[] fArr3 = fArr[1];
        float f11 = (fArr3[0] * f7) + (fArr3[1] * f8) + (fArr3[2] * f9);
        float[] fArr4 = fArr[2];
        return C3913.m11151(f10, f11, (f7 * fArr4[0]) + (f8 * fArr4[1]) + (f9 * fArr4[2]));
    }

    @InterfaceC3897
    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public int m10004() {
        return m10003(C8385.f24986);
    }
}
