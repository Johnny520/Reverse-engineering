package p289u0;

import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;

/* JADX INFO: renamed from: u0.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C8477a {

    /* JADX INFO: renamed from: i */
    public static final a f28291i = new a(null);

    /* JADX INFO: renamed from: j */
    public static final int f28292j = 8;

    /* JADX INFO: renamed from: a */
    public final float f28293a;

    /* JADX INFO: renamed from: b */
    public final float f28294b;

    /* JADX INFO: renamed from: c */
    public final float f28295c;

    /* JADX INFO: renamed from: d */
    public final float f28296d;

    /* JADX INFO: renamed from: e */
    public final float f28297e;

    /* JADX INFO: renamed from: f */
    public float f28298f;

    /* JADX INFO: renamed from: g */
    public final float f28299g;

    /* JADX INFO: renamed from: h */
    public final float f28300h;

    public C8477a(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17) {
        this.f28293a = f10;
        this.f28294b = f11;
        this.f28295c = f12;
        this.f28296d = f13;
        this.f28297e = f14;
        this.f28298f = f15;
        this.f28299g = f16;
        this.f28300h = f17;
    }

    /* JADX INFO: renamed from: a */
    public final float m32539a(C8477a c8477a) {
        float f10 = this.f28298f - c8477a.f28298f;
        float f11 = this.f28299g - c8477a.f28299g;
        float f12 = this.f28300h - c8477a.f28300h;
        return (float) (Math.pow(Math.sqrt((f10 * f10) + (f11 * f11) + (f12 * f12)), 0.63d) * 1.41d);
    }

    /* JADX INFO: renamed from: b */
    public final float m32540b() {
        return this.f28294b;
    }

    /* JADX INFO: renamed from: c */
    public final float m32541c() {
        return this.f28293a;
    }

    /* JADX INFO: renamed from: d */
    public final float m32542d() {
        return this.f28295c;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0010  */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int m32543e(p289u0.C8479c r14) {
        /*
            Method dump skipped, instruction units count: 393
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p289u0.C8477a.m32543e(u0.c):int");
    }

    /* JADX INFO: renamed from: f */
    public final int m32544f() {
        return m32543e(C8479c.f28308k.m32580a());
    }

    /* JADX INFO: renamed from: u0.a$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C8477a m32545a(float f10, float f11, float f12) {
            float f13 = 100.0f;
            float f14 = 1000.0f;
            float f15 = 0.0f;
            C8477a c8477a = null;
            float f16 = 1000.0f;
            while (Math.abs(f15 - f13) > 0.009999999776482582d) {
                float f17 = ((f13 - f15) / 2) + f15;
                int iM32544f = m32548d(f17, f11, f10).m32544f();
                float fM32563l = C8478b.f28301a.m32563l(iM32544f);
                float fAbs = (float) Math.abs(f12 - fM32563l);
                if (fAbs < 0.2f) {
                    C8477a c8477aM32546b = m32546b(iM32544f);
                    float fM32539a = c8477aM32546b.m32539a(m32548d(c8477aM32546b.m32542d(), c8477aM32546b.m32540b(), f10));
                    if (fM32539a <= 1.0f) {
                        c8477a = c8477aM32546b;
                        f14 = fAbs;
                        f16 = fM32539a;
                    }
                }
                if (f14 == 0.0f && f16 == 0.0f) {
                    return c8477a;
                }
                if (fM32563l < f12) {
                    f15 = f17;
                } else {
                    f13 = f17;
                }
            }
            return c8477a;
        }

        /* JADX INFO: renamed from: b */
        public final C8477a m32546b(int i10) {
            return m32547c(i10, C8479c.f28308k.m32580a());
        }

        /* JADX INFO: renamed from: c */
        public final C8477a m32547c(int i10, C8479c c8479c) {
            C8478b c8478b = C8478b.f28301a;
            float[] fArrM32566o = c8478b.m32566o(i10);
            float[][] fArrM32560i = c8478b.m32560i();
            float f10 = fArrM32566o[0];
            float[] fArr = fArrM32560i[0];
            float f11 = fArr[0] * f10;
            float f12 = fArrM32566o[1];
            float f13 = f11 + (fArr[1] * f12);
            float f14 = fArrM32566o[2];
            float f15 = f13 + (fArr[2] * f14);
            float[] fArr2 = fArrM32560i[1];
            float f16 = (fArr2[0] * f10) + (fArr2[1] * f12) + (fArr2[2] * f14);
            float[] fArr3 = fArrM32560i[2];
            float f17 = (f10 * fArr3[0]) + (f12 * fArr3[1]) + (f14 * fArr3[2]);
            float f18 = c8479c.m32578j()[0] * f15;
            float f19 = c8479c.m32578j()[1] * f16;
            float f20 = c8479c.m32578j()[2] * f17;
            double d10 = 0.42f;
            float fPow = (float) Math.pow((c8479c.m32572d() * Math.abs(f18)) / 100.0f, d10);
            float fPow2 = (float) Math.pow((c8479c.m32572d() * Math.abs(f19)) / 100.0f, d10);
            float fPow3 = (float) Math.pow((c8479c.m32572d() * Math.abs(f20)) / 100.0f, d10);
            float fSignum = ((Math.signum(f18) * 400.0f) * fPow) / (fPow + 27.13f);
            float fSignum2 = ((Math.signum(f19) * 400.0f) * fPow2) / (fPow2 + 27.13f);
            float fSignum3 = ((Math.signum(f20) * 400.0f) * fPow3) / (fPow3 + 27.13f);
            float f21 = (((fSignum * 11.0f) + ((-12.0f) * fSignum2)) + fSignum3) / 11.0f;
            float f22 = ((fSignum + fSignum2) - (fSignum3 * 2.0f)) / 9.0f;
            float f23 = fSignum2 * 20.0f;
            float f24 = (((fSignum * 20.0f) + f23) + (21.0f * fSignum3)) / 20.0f;
            float f25 = (((fSignum * 40.0f) + f23) + fSignum3) / 20.0f;
            float fAtan2 = (((float) Math.atan2(f22, f21)) * 180.0f) / 3.1415927f;
            if (fAtan2 < 0.0f) {
                fAtan2 += 360.0f;
            } else if (fAtan2 >= 360.0f) {
                fAtan2 -= 360.0f;
            }
            float f26 = fAtan2;
            float f27 = (f26 * 3.1415927f) / 180.0f;
            float fPow4 = ((float) Math.pow((f25 * c8479c.m32575g()) / c8479c.m32570b(), c8479c.m32571c() * c8479c.m32579k())) * 100.0f;
            float fPow5 = ((float) Math.pow(((((((((float) Math.cos((((((double) f26) < 20.14d ? 360 + f26 : f26) * 3.1415927f) / 180.0f) + 2.0f)) + 3.8f) * 0.25f) * 3846.1538f) * c8479c.m32576h()) * c8479c.m32577i()) * ((float) Math.sqrt((f21 * f21) + (f22 * f22)))) / (f24 + 0.305f), 0.9f)) * ((float) Math.pow(1.64f - ((float) Math.pow(0.29f, c8479c.m32574f())), 0.73f)) * ((float) Math.sqrt(fPow4 / 100.0f));
            float fM32573e = fPow5 * c8479c.m32573e();
            float fSqrt = ((float) Math.sqrt((r0 * c8479c.m32571c()) / (c8479c.m32570b() + 4.0f))) * 50.0f;
            float f28 = (1.7f * fPow4) / ((0.007f * fPow4) + 1.0f);
            float fLog = ((float) Math.log((0.0228f * fM32573e) + 1.0f)) * 43.85965f;
            double d11 = f27;
            return new C8477a(f26, fPow5, fPow4, fM32573e, fSqrt, f28, fLog * ((float) Math.cos(d11)), fLog * ((float) Math.sin(d11)));
        }

        /* JADX INFO: renamed from: d */
        public final C8477a m32548d(float f10, float f11, float f12) {
            return m32549e(f10, f11, f12, C8479c.f28308k.m32580a());
        }

        /* JADX INFO: renamed from: e */
        public final C8477a m32549e(float f10, float f11, float f12, C8479c c8479c) {
            float fM32573e = f11 * c8479c.m32573e();
            float fSqrt = ((float) Math.sqrt(((f11 / ((float) Math.sqrt(((double) f10) / 100.0d))) * c8479c.m32571c()) / (c8479c.m32570b() + 4.0f))) * 50.0f;
            float f13 = (1.7f * f10) / ((0.007f * f10) + 1.0f);
            float fLog = ((float) Math.log((((double) fM32573e) * 0.0228d) + 1.0d)) * 43.85965f;
            double d10 = (3.1415927f * f12) / 180.0f;
            return new C8477a(f12, f11, f10, fM32573e, fSqrt, f13, fLog * ((float) Math.cos(d10)), fLog * ((float) Math.sin(d10)));
        }

        /* JADX INFO: renamed from: f */
        public final int m32550f(float f10, float f11, float f12) {
            return m32551g(f10, f11, f12, C8479c.f28308k.m32580a());
        }

        /* JADX INFO: renamed from: g */
        public final int m32551g(float f10, float f11, float f12, C8479c c8479c) {
            if (AbstractC1061t.m3842c(c8479c, C8479c.f28308k.m32580a())) {
                return C8481e.f28321a.m32600q(f10, f11, f12);
            }
            if (f11 < 1.0d || Math.round(f12) <= 0.0d || Math.round(f12) >= 100.0d) {
                return C8478b.f28301a.m32561j(f12);
            }
            float fMin = f10 < 0.0f ? 0.0f : Math.min(360.0f, f10);
            C8477a c8477a = null;
            boolean z10 = true;
            float f13 = 0.0f;
            float f14 = f11;
            while (Math.abs(f13 - f11) >= 0.4000000059604645d) {
                C8477a c8477aM32545a = m32545a(fMin, f14, f12);
                if (!z10) {
                    if (c8477aM32545a == null) {
                        f11 = f14;
                    } else {
                        f13 = f14;
                        c8477a = c8477aM32545a;
                    }
                    f14 = ((f11 - f13) / 2.0f) + f13;
                } else {
                    if (c8477aM32545a != null) {
                        return c8477aM32545a.m32543e(c8479c);
                    }
                    f14 = ((f11 - f13) / 2.0f) + f13;
                    z10 = false;
                }
            }
            return c8477a == null ? C8478b.f28301a.m32561j(f12) : c8477a.m32543e(c8479c);
        }

        public a() {
        }
    }
}
