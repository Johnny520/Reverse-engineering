package p000;

/* JADX INFO: loaded from: classes.dex */
public final class gb0 {

    /* JADX INFO: renamed from: k */
    public static final gb0 f2049k;

    /* JADX INFO: renamed from: a */
    public final float f2050a;

    /* JADX INFO: renamed from: b */
    public final float f2051b;

    /* JADX INFO: renamed from: c */
    public final float f2052c;

    /* JADX INFO: renamed from: d */
    public final float f2053d;

    /* JADX INFO: renamed from: e */
    public final float f2054e;

    /* JADX INFO: renamed from: f */
    public final float f2055f;

    /* JADX INFO: renamed from: g */
    public final float[] f2056g;

    /* JADX INFO: renamed from: h */
    public final float f2057h;

    /* JADX INFO: renamed from: i */
    public final float f2058i;

    /* JADX INFO: renamed from: j */
    public final float f2059j;

    static {
        float[] fArr = AbstractC0222ff.f1942i;
        float fM1182a0 = (float) ((((double) AbstractC0222ff.m1182a0()) * 63.66197723675813d) / 100.0d);
        float[][] fArr2 = AbstractC0222ff.f1940g;
        float f = fArr[0];
        float[] fArr3 = fArr2[0];
        float f2 = fArr3[0] * f;
        float f3 = fArr[1];
        float f4 = (fArr3[1] * f3) + f2;
        float f5 = fArr[2];
        float f6 = (fArr3[2] * f5) + f4;
        float[] fArr4 = fArr2[1];
        float f7 = (fArr4[2] * f5) + (fArr4[1] * f3) + (fArr4[0] * f);
        float[] fArr5 = fArr2[2];
        float f8 = (f5 * fArr5[2]) + (f3 * fArr5[1]) + (f * fArr5[0]);
        float f9 = ((double) 1.0f) >= 0.9d ? 0.69f : 0.655f;
        float fExp = (1.0f - (((float) Math.exp(((-fM1182a0) - 42.0f) / 92.0f)) * 0.2777778f)) * 1.0f;
        double d = fExp;
        if (d > 1.0d) {
            fExp = 1.0f;
        } else if (d < 0.0d) {
            fExp = 0.0f;
        }
        float[] fArr6 = {(((100.0f / f6) * fExp) + 1.0f) - fExp, (((100.0f / f7) * fExp) + 1.0f) - fExp, (((100.0f / f8) * fExp) + 1.0f) - fExp};
        float f10 = 1.0f / ((5.0f * fM1182a0) + 1.0f);
        float f11 = f10 * f10 * f10 * f10;
        float f12 = 1.0f - f11;
        float fCbrt = (0.1f * f12 * f12 * ((float) Math.cbrt(((double) fM1182a0) * 5.0d))) + (f11 * fM1182a0);
        float fM1182a02 = AbstractC0222ff.m1182a0() / fArr[1];
        double d2 = fM1182a02;
        float fSqrt = ((float) Math.sqrt(d2)) + 1.48f;
        float fPow = 0.725f / ((float) Math.pow(d2, 0.2d));
        float[] fArr7 = {(float) Math.pow(((double) ((fArr6[0] * fCbrt) * f6)) / 100.0d, 0.42d), (float) Math.pow(((double) ((fArr6[1] * fCbrt) * f7)) / 100.0d, 0.42d), (float) Math.pow(((double) ((fArr6[2] * fCbrt) * f8)) / 100.0d, 0.42d)};
        float f13 = fArr7[0];
        float f14 = (f13 * 400.0f) / (f13 + 27.13f);
        float f15 = fArr7[1];
        float f16 = (f15 * 400.0f) / (f15 + 27.13f);
        float f17 = fArr7[2];
        float[] fArr8 = {f14, f16, (400.0f * f17) / (f17 + 27.13f)};
        f2049k = new gb0(fM1182a02, ((fArr8[2] * 0.05f) + (fArr8[0] * 2.0f) + fArr8[1]) * fPow, fPow, fPow, f9, 1.0f, fArr6, fCbrt, (float) Math.pow(fCbrt, 0.25d), fSqrt);
    }

    public gb0(float f, float f2, float f3, float f4, float f5, float f6, float[] fArr, float f7, float f8, float f9) {
        this.f2055f = f;
        this.f2050a = f2;
        this.f2051b = f3;
        this.f2052c = f4;
        this.f2053d = f5;
        this.f2054e = f6;
        this.f2056g = fArr;
        this.f2057h = f7;
        this.f2058i = f8;
        this.f2059j = f9;
    }
}
