package p237q3;

import p252r3.AbstractC6470a;

/* JADX INFO: renamed from: q3.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class C6235a {

    /* JADX INFO: renamed from: a */
    public final float f19354a;

    /* JADX INFO: renamed from: b */
    public final float f19355b;

    /* JADX INFO: renamed from: c */
    public final float f19356c;

    /* JADX INFO: renamed from: d */
    public final float f19357d;

    /* JADX INFO: renamed from: e */
    public final float f19358e;

    /* JADX INFO: renamed from: f */
    public final float f19359f;

    /* JADX INFO: renamed from: g */
    public final float f19360g;

    /* JADX INFO: renamed from: h */
    public final float f19361h;

    /* JADX INFO: renamed from: i */
    public final float f19362i;

    public C6235a(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18) {
        this.f19354a = f10;
        this.f19355b = f11;
        this.f19356c = f12;
        this.f19357d = f13;
        this.f19358e = f14;
        this.f19359f = f15;
        this.f19360g = f16;
        this.f19361h = f17;
        this.f19362i = f18;
    }

    /* JADX INFO: renamed from: b */
    public static C6235a m24566b(float f10, float f11, float f12) {
        float f13 = 100.0f;
        float f14 = 1000.0f;
        float f15 = 0.0f;
        C6235a c6235a = null;
        float f16 = 1000.0f;
        while (Math.abs(f15 - f13) > 0.01f) {
            float f17 = ((f13 - f15) / 2.0f) + f15;
            int iM24581p = m24569e(f17, f11, f10).m24581p();
            float fM24583b = AbstractC6236b.m24583b(iM24581p);
            float fAbs = Math.abs(f12 - fM24583b);
            if (fAbs < 0.2f) {
                C6235a c6235aM24567c = m24567c(iM24581p);
                float fM24573a = c6235aM24567c.m24573a(m24569e(c6235aM24567c.m24578k(), c6235aM24567c.m24576i(), f10));
                if (fM24573a <= 1.0f) {
                    c6235a = c6235aM24567c;
                    f14 = fAbs;
                    f16 = fM24573a;
                }
            }
            if (f14 == 0.0f && f16 == 0.0f) {
                return c6235a;
            }
            if (fM24583b < f12) {
                f15 = f17;
            } else {
                f13 = f17;
            }
        }
        return c6235a;
    }

    /* JADX INFO: renamed from: c */
    public static C6235a m24567c(int i10) {
        float[] fArr = new float[7];
        float[] fArr2 = new float[3];
        m24568d(i10, C6243i.f19373k, fArr, fArr2);
        return new C6235a(fArr2[0], fArr2[1], fArr[0], fArr[1], fArr[2], fArr[3], fArr[4], fArr[5], fArr[6]);
    }

    /* JADX INFO: renamed from: d */
    public static void m24568d(int i10, C6243i c6243i, float[] fArr, float[] fArr2) {
        AbstractC6236b.m24587f(i10, fArr2);
        float[][] fArr3 = AbstractC6236b.f19363a;
        float f10 = fArr2[0];
        float[] fArr4 = fArr3[0];
        float f11 = fArr4[0] * f10;
        float f12 = fArr2[1];
        float f13 = f11 + (fArr4[1] * f12);
        float f14 = fArr2[2];
        float f15 = f13 + (fArr4[2] * f14);
        float[] fArr5 = fArr3[1];
        float f16 = (fArr5[0] * f10) + (fArr5[1] * f12) + (fArr5[2] * f14);
        float[] fArr6 = fArr3[2];
        float f17 = (f10 * fArr6[0]) + (f12 * fArr6[1]) + (f14 * fArr6[2]);
        float f18 = c6243i.m24636i()[0] * f15;
        float f19 = c6243i.m24636i()[1] * f16;
        float f20 = c6243i.m24636i()[2] * f17;
        float fPow = (float) Math.pow(((double) (c6243i.m24630c() * Math.abs(f18))) / 100.0d, 0.42d);
        float fPow2 = (float) Math.pow(((double) (c6243i.m24630c() * Math.abs(f19))) / 100.0d, 0.42d);
        float fPow3 = (float) Math.pow(((double) (c6243i.m24630c() * Math.abs(f20))) / 100.0d, 0.42d);
        float fSignum = ((Math.signum(f18) * 400.0f) * fPow) / (fPow + 27.13f);
        float fSignum2 = ((Math.signum(f19) * 400.0f) * fPow2) / (fPow2 + 27.13f);
        float fSignum3 = ((Math.signum(f20) * 400.0f) * fPow3) / (fPow3 + 27.13f);
        double d10 = fSignum3;
        float f21 = ((float) (((((double) fSignum) * 11.0d) + (((double) fSignum2) * (-12.0d))) + d10)) / 11.0f;
        float f22 = ((float) (((double) (fSignum + fSignum2)) - (d10 * 2.0d))) / 9.0f;
        float f23 = fSignum2 * 20.0f;
        float f24 = (((fSignum * 20.0f) + f23) + (21.0f * fSignum3)) / 20.0f;
        float f25 = (((fSignum * 40.0f) + f23) + fSignum3) / 20.0f;
        float fAtan2 = (((float) Math.atan2(f22, f21)) * 180.0f) / 3.1415927f;
        if (fAtan2 < 0.0f) {
            fAtan2 += 360.0f;
        } else if (fAtan2 >= 360.0f) {
            fAtan2 -= 360.0f;
        }
        float f26 = (3.1415927f * fAtan2) / 180.0f;
        float fPow4 = ((float) Math.pow((f25 * c6243i.m24633f()) / c6243i.m24628a(), c6243i.m24629b() * c6243i.m24637j())) * 100.0f;
        float fM24629b = (4.0f / c6243i.m24629b()) * ((float) Math.sqrt(fPow4 / 100.0f)) * (c6243i.m24628a() + 4.0f) * c6243i.m24631d();
        float fSqrt = ((float) Math.sqrt(((double) fPow4) / 100.0d)) * ((float) Math.pow(1.64d - Math.pow(0.29d, c6243i.m24632e()), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos(((((double) (((double) fAtan2) < 20.14d ? 360.0f + fAtan2 : fAtan2)) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * c6243i.m24634g()) * c6243i.m24635h()) * ((float) Math.sqrt((f21 * f21) + (f22 * f22)))) / (f24 + 0.305f), 0.9d));
        float fM24631d = c6243i.m24631d() * fSqrt;
        float fSqrt2 = ((float) Math.sqrt((r4 * c6243i.m24629b()) / (c6243i.m24628a() + 4.0f))) * 50.0f;
        float f27 = (1.7f * fPow4) / ((0.007f * fPow4) + 1.0f);
        float fLog = ((float) Math.log((0.0228f * fM24631d) + 1.0f)) * 43.85965f;
        double d11 = f26;
        float fCos = ((float) Math.cos(d11)) * fLog;
        float fSin = fLog * ((float) Math.sin(d11));
        fArr2[0] = fAtan2;
        fArr2[1] = fSqrt;
        if (fArr != null) {
            fArr[0] = fPow4;
            fArr[1] = fM24629b;
            fArr[2] = fM24631d;
            fArr[3] = fSqrt2;
            fArr[4] = f27;
            fArr[5] = fCos;
            fArr[6] = fSin;
        }
    }

    /* JADX INFO: renamed from: e */
    public static C6235a m24569e(float f10, float f11, float f12) {
        return m24570f(f10, f11, f12, C6243i.f19373k);
    }

    /* JADX INFO: renamed from: f */
    public static C6235a m24570f(float f10, float f11, float f12, C6243i c6243i) {
        float fM24629b = (4.0f / c6243i.m24629b()) * ((float) Math.sqrt(((double) f10) / 100.0d)) * (c6243i.m24628a() + 4.0f) * c6243i.m24631d();
        float fM24631d = c6243i.m24631d() * f11;
        float fSqrt = ((float) Math.sqrt(((f11 / ((float) Math.sqrt(r4))) * c6243i.m24629b()) / (c6243i.m24628a() + 4.0f))) * 50.0f;
        float f13 = (1.7f * f10) / ((0.007f * f10) + 1.0f);
        float fLog = ((float) Math.log((((double) fM24631d) * 0.0228d) + 1.0d)) * 43.85965f;
        double d10 = (3.1415927f * f12) / 180.0f;
        return new C6235a(f12, f11, f10, fM24629b, fM24631d, fSqrt, f13, ((float) Math.cos(d10)) * fLog, fLog * ((float) Math.sin(d10)));
    }

    /* JADX INFO: renamed from: m */
    public static int m24571m(float f10, float f11, float f12) {
        return m24572n(f10, f11, f12, C6243i.f19373k);
    }

    /* JADX INFO: renamed from: n */
    public static int m24572n(float f10, float f11, float f12, C6243i c6243i) {
        if (f11 < 1.0d || Math.round(f12) <= 0.0d || Math.round(f12) >= 100.0d) {
            return AbstractC6236b.m24582a(f12);
        }
        float fMin = f10 < 0.0f ? 0.0f : Math.min(360.0f, f10);
        C6235a c6235a = null;
        boolean z10 = true;
        float f13 = 0.0f;
        float f14 = f11;
        while (Math.abs(f13 - f11) >= 0.4f) {
            C6235a c6235aM24566b = m24566b(fMin, f14, f12);
            if (!z10) {
                if (c6235aM24566b == null) {
                    f11 = f14;
                } else {
                    f13 = f14;
                    c6235a = c6235aM24566b;
                }
                f14 = ((f11 - f13) / 2.0f) + f13;
            } else {
                if (c6235aM24566b != null) {
                    return c6235aM24566b.m24580o(c6243i);
                }
                f14 = ((f11 - f13) / 2.0f) + f13;
                z10 = false;
            }
        }
        return c6235a == null ? AbstractC6236b.m24582a(f12) : c6235a.m24580o(c6243i);
    }

    /* JADX INFO: renamed from: a */
    public float m24573a(C6235a c6235a) {
        float fM24579l = m24579l() - c6235a.m24579l();
        float fM24574g = m24574g() - c6235a.m24574g();
        float fM24575h = m24575h() - c6235a.m24575h();
        return (float) (Math.pow(Math.sqrt((fM24579l * fM24579l) + (fM24574g * fM24574g) + (fM24575h * fM24575h)), 0.63d) * 1.41d);
    }

    /* JADX INFO: renamed from: g */
    public float m24574g() {
        return this.f19361h;
    }

    /* JADX INFO: renamed from: h */
    public float m24575h() {
        return this.f19362i;
    }

    /* JADX INFO: renamed from: i */
    public float m24576i() {
        return this.f19355b;
    }

    /* JADX INFO: renamed from: j */
    public float m24577j() {
        return this.f19354a;
    }

    /* JADX INFO: renamed from: k */
    public float m24578k() {
        return this.f19356c;
    }

    /* JADX INFO: renamed from: l */
    public float m24579l() {
        return this.f19360g;
    }

    /* JADX INFO: renamed from: o */
    public int m24580o(C6243i c6243i) {
        float fPow = (float) Math.pow(((double) ((((double) m24576i()) == 0.0d || ((double) m24578k()) == 0.0d) ? 0.0f : m24576i() / ((float) Math.sqrt(((double) m24578k()) / 100.0d)))) / Math.pow(1.64d - Math.pow(0.29d, c6243i.m24632e()), 0.73d), 1.1111111111111112d);
        double dM24577j = (m24577j() * 3.1415927f) / 180.0f;
        float fCos = ((float) (Math.cos(2.0d + dM24577j) + 3.8d)) * 0.25f;
        float fM24628a = c6243i.m24628a() * ((float) Math.pow(((double) m24578k()) / 100.0d, (1.0d / ((double) c6243i.m24629b())) / ((double) c6243i.m24637j())));
        float fM24634g = fCos * 3846.1538f * c6243i.m24634g() * c6243i.m24635h();
        float fM24633f = fM24628a / c6243i.m24633f();
        float fSin = (float) Math.sin(dM24577j);
        float fCos2 = (float) Math.cos(dM24577j);
        float f10 = (((0.305f + fM24633f) * 23.0f) * fPow) / (((fM24634g * 23.0f) + ((11.0f * fPow) * fCos2)) + ((fPow * 108.0f) * fSin));
        float f11 = fCos2 * f10;
        float f12 = f10 * fSin;
        float f13 = fM24633f * 460.0f;
        float f14 = (((451.0f * f11) + f13) + (288.0f * f12)) / 1403.0f;
        float f15 = ((f13 - (891.0f * f11)) - (261.0f * f12)) / 1403.0f;
        float fSignum = Math.signum(f14) * (100.0f / c6243i.m24630c()) * ((float) Math.pow((float) Math.max(0.0d, (((double) Math.abs(f14)) * 27.13d) / (400.0d - ((double) Math.abs(f14)))), 2.380952380952381d));
        float fSignum2 = Math.signum(f15) * (100.0f / c6243i.m24630c()) * ((float) Math.pow((float) Math.max(0.0d, (((double) Math.abs(f15)) * 27.13d) / (400.0d - ((double) Math.abs(f15)))), 2.380952380952381d));
        float fSignum3 = Math.signum(((f13 - (f11 * 220.0f)) - (f12 * 6300.0f)) / 1403.0f) * (100.0f / c6243i.m24630c()) * ((float) Math.pow((float) Math.max(0.0d, (((double) Math.abs(r8)) * 27.13d) / (400.0d - ((double) Math.abs(r8)))), 2.380952380952381d));
        float f16 = fSignum / c6243i.m24636i()[0];
        float f17 = fSignum2 / c6243i.m24636i()[1];
        float f18 = fSignum3 / c6243i.m24636i()[2];
        float[][] fArr = AbstractC6236b.f19364b;
        float[] fArr2 = fArr[0];
        float f19 = (fArr2[0] * f16) + (fArr2[1] * f17) + (fArr2[2] * f18);
        float[] fArr3 = fArr[1];
        float f20 = (fArr3[0] * f16) + (fArr3[1] * f17) + (fArr3[2] * f18);
        float[] fArr4 = fArr[2];
        return AbstractC6470a.m25644a(f19, f20, (f16 * fArr4[0]) + (f17 * fArr4[1]) + (f18 * fArr4[2]));
    }

    /* JADX INFO: renamed from: p */
    public int m24581p() {
        return m24580o(C6243i.f19373k);
    }
}
