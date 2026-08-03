package p083u;

/* JADX INFO: renamed from: u.n */
/* JADX INFO: loaded from: classes.dex */
public final class C1095n {

    /* JADX INFO: renamed from: k */
    public static final C1095n f4213k;

    /* JADX INFO: renamed from: a */
    public final float f4214a;

    /* JADX INFO: renamed from: b */
    public final float f4215b;

    /* JADX INFO: renamed from: c */
    public final float f4216c;

    /* JADX INFO: renamed from: d */
    public final float f4217d;

    /* JADX INFO: renamed from: e */
    public final float f4218e;

    /* JADX INFO: renamed from: f */
    public final float f4219f;

    /* JADX INFO: renamed from: g */
    public final float[] f4220g;

    /* JADX INFO: renamed from: h */
    public final float f4221h;

    /* JADX INFO: renamed from: i */
    public final float f4222i;

    /* JADX INFO: renamed from: j */
    public final float f4223j;

    static {
        float[] fArr = AbstractC1083b.f4191c;
        float fM2575k = (float) ((((double) AbstractC1083b.m2575k()) * 63.66197723675813d) / 100.0d);
        float[][] fArr2 = AbstractC1083b.f4189a;
        float f2 = fArr[0];
        float[] fArr3 = fArr2[0];
        float f3 = fArr3[0] * f2;
        float f4 = fArr[1];
        float f5 = (fArr3[1] * f4) + f3;
        float f6 = fArr[2];
        float f7 = (fArr3[2] * f6) + f5;
        float[] fArr4 = fArr2[1];
        float f8 = (fArr4[2] * f6) + (fArr4[1] * f4) + (fArr4[0] * f2);
        float[] fArr5 = fArr2[2];
        float f9 = (f6 * fArr5[2]) + (f4 * fArr5[1]) + (f2 * fArr5[0]);
        float f10 = ((double) 1.0f) >= 0.9d ? 0.69f : 0.655f;
        float fExp = (1.0f - (((float) Math.exp(((-fM2575k) - 42.0f) / 92.0f)) * 0.2777778f)) * 1.0f;
        double d2 = fExp;
        if (d2 > 1.0d) {
            fExp = 1.0f;
        } else if (d2 < 0.0d) {
            fExp = 0.0f;
        }
        float[] fArr6 = {(((100.0f / f7) * fExp) + 1.0f) - fExp, (((100.0f / f8) * fExp) + 1.0f) - fExp, (((100.0f / f9) * fExp) + 1.0f) - fExp};
        float f11 = 1.0f / ((5.0f * fM2575k) + 1.0f);
        float f12 = f11 * f11 * f11 * f11;
        float f13 = 1.0f - f12;
        float fCbrt = (0.1f * f13 * f13 * ((float) Math.cbrt(((double) fM2575k) * 5.0d))) + (f12 * fM2575k);
        float fM2575k2 = AbstractC1083b.m2575k() / fArr[1];
        double d3 = fM2575k2;
        float fSqrt = ((float) Math.sqrt(d3)) + 1.48f;
        float fPow = 0.725f / ((float) Math.pow(d3, 0.2d));
        float[] fArr7 = {(float) Math.pow(((double) ((fArr6[0] * fCbrt) * f7)) / 100.0d, 0.42d), (float) Math.pow(((double) ((fArr6[1] * fCbrt) * f8)) / 100.0d, 0.42d), (float) Math.pow(((double) ((fArr6[2] * fCbrt) * f9)) / 100.0d, 0.42d)};
        float f14 = fArr7[0];
        float f15 = (f14 * 400.0f) / (f14 + 27.13f);
        float f16 = fArr7[1];
        float f17 = (f16 * 400.0f) / (f16 + 27.13f);
        float f18 = fArr7[2];
        float[] fArr8 = {f15, f17, (400.0f * f18) / (f18 + 27.13f)};
        f4213k = new C1095n(fM2575k2, ((fArr8[2] * 0.05f) + (fArr8[0] * 2.0f) + fArr8[1]) * fPow, fPow, fPow, f10, 1.0f, fArr6, fCbrt, (float) Math.pow(fCbrt, 0.25d), fSqrt);
    }

    public C1095n(float f2, float f3, float f4, float f5, float f6, float f7, float[] fArr, float f8, float f9, float f10) {
        this.f4219f = f2;
        this.f4214a = f3;
        this.f4215b = f4;
        this.f4216c = f5;
        this.f4217d = f6;
        this.f4218e = f7;
        this.f4220g = fArr;
        this.f4221h = f8;
        this.f4222i = f9;
        this.f4223j = f10;
    }
}
