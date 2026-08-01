package p237q3;

/* JADX INFO: renamed from: q3.i */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C6243i {

    /* JADX INFO: renamed from: k */
    public static final C6243i f19373k = m24627k(AbstractC6236b.f19365c, (float) ((((double) AbstractC6236b.m24589h(50.0f)) * 63.66197723675813d) / 100.0d), 50.0f, 2.0f, false);

    /* JADX INFO: renamed from: a */
    public final float f19374a;

    /* JADX INFO: renamed from: b */
    public final float f19375b;

    /* JADX INFO: renamed from: c */
    public final float f19376c;

    /* JADX INFO: renamed from: d */
    public final float f19377d;

    /* JADX INFO: renamed from: e */
    public final float f19378e;

    /* JADX INFO: renamed from: f */
    public final float f19379f;

    /* JADX INFO: renamed from: g */
    public final float[] f19380g;

    /* JADX INFO: renamed from: h */
    public final float f19381h;

    /* JADX INFO: renamed from: i */
    public final float f19382i;

    /* JADX INFO: renamed from: j */
    public final float f19383j;

    public C6243i(float f10, float f11, float f12, float f13, float f14, float f15, float[] fArr, float f16, float f17, float f18) {
        this.f19379f = f10;
        this.f19374a = f11;
        this.f19375b = f12;
        this.f19376c = f13;
        this.f19377d = f14;
        this.f19378e = f15;
        this.f19380g = fArr;
        this.f19381h = f16;
        this.f19382i = f17;
        this.f19383j = f18;
    }

    /* JADX INFO: renamed from: k */
    public static C6243i m24627k(float[] fArr, float f10, float f11, float f12, boolean z10) {
        float[][] fArr2 = AbstractC6236b.f19363a;
        float f13 = fArr[0];
        float[] fArr3 = fArr2[0];
        float f14 = fArr3[0] * f13;
        float f15 = fArr[1];
        float f16 = f14 + (fArr3[1] * f15);
        float f17 = fArr[2];
        float f18 = f16 + (fArr3[2] * f17);
        float[] fArr4 = fArr2[1];
        float f19 = (fArr4[0] * f13) + (fArr4[1] * f15) + (fArr4[2] * f17);
        float[] fArr5 = fArr2[2];
        float f20 = (f13 * fArr5[0]) + (f15 * fArr5[1]) + (f17 * fArr5[2]);
        float f21 = (f12 / 10.0f) + 0.8f;
        float fM24585d = ((double) f21) >= 0.9d ? AbstractC6236b.m24585d(0.59f, 0.69f, (f21 - 0.9f) * 10.0f) : AbstractC6236b.m24585d(0.525f, 0.59f, (f21 - 0.8f) * 10.0f);
        float fExp = z10 ? 1.0f : (1.0f - (((float) Math.exp(((-f10) - 42.0f) / 92.0f)) * 0.2777778f)) * f21;
        double d10 = fExp;
        if (d10 > 1.0d) {
            fExp = 1.0f;
        } else if (d10 < 0.0d) {
            fExp = 0.0f;
        }
        float[] fArr6 = {(((100.0f / f18) * fExp) + 1.0f) - fExp, (((100.0f / f19) * fExp) + 1.0f) - fExp, (((100.0f / f20) * fExp) + 1.0f) - fExp};
        float f22 = 1.0f / ((5.0f * f10) + 1.0f);
        float f23 = f22 * f22 * f22 * f22;
        float f24 = 1.0f - f23;
        float fCbrt = (f23 * f10) + (0.1f * f24 * f24 * ((float) Math.cbrt(((double) f10) * 5.0d)));
        float fM24589h = AbstractC6236b.m24589h(f11) / fArr[1];
        double d11 = fM24589h;
        float fSqrt = ((float) Math.sqrt(d11)) + 1.48f;
        float fPow = 0.725f / ((float) Math.pow(d11, 0.2d));
        float[] fArr7 = {(float) Math.pow(((double) ((fArr6[0] * fCbrt) * f18)) / 100.0d, 0.42d), (float) Math.pow(((double) ((fArr6[1] * fCbrt) * f19)) / 100.0d, 0.42d), (float) Math.pow(((double) ((fArr6[2] * fCbrt) * f20)) / 100.0d, 0.42d)};
        float f25 = fArr7[0];
        float f26 = (f25 * 400.0f) / (f25 + 27.13f);
        float f27 = fArr7[1];
        float f28 = (f27 * 400.0f) / (f27 + 27.13f);
        float f29 = fArr7[2];
        float[] fArr8 = {f26, f28, (400.0f * f29) / (f29 + 27.13f)};
        return new C6243i(fM24589h, ((fArr8[0] * 2.0f) + fArr8[1] + (fArr8[2] * 0.05f)) * fPow, fPow, fPow, fM24585d, f21, fArr6, fCbrt, (float) Math.pow(fCbrt, 0.25d), fSqrt);
    }

    /* JADX INFO: renamed from: a */
    public float m24628a() {
        return this.f19374a;
    }

    /* JADX INFO: renamed from: b */
    public float m24629b() {
        return this.f19377d;
    }

    /* JADX INFO: renamed from: c */
    public float m24630c() {
        return this.f19381h;
    }

    /* JADX INFO: renamed from: d */
    public float m24631d() {
        return this.f19382i;
    }

    /* JADX INFO: renamed from: e */
    public float m24632e() {
        return this.f19379f;
    }

    /* JADX INFO: renamed from: f */
    public float m24633f() {
        return this.f19375b;
    }

    /* JADX INFO: renamed from: g */
    public float m24634g() {
        return this.f19378e;
    }

    /* JADX INFO: renamed from: h */
    public float m24635h() {
        return this.f19376c;
    }

    /* JADX INFO: renamed from: i */
    public float[] m24636i() {
        return this.f19380g;
    }

    /* JADX INFO: renamed from: j */
    public float m24637j() {
        return this.f19383j;
    }
}
