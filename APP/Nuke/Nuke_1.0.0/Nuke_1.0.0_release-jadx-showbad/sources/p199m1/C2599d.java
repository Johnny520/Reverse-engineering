package p199m1;

/* JADX INFO: renamed from: m1.d */
/* JADX INFO: loaded from: classes.dex */
public final class C2599d {

    /* JADX INFO: renamed from: k */
    public static final C2599d f8263k;

    /* JADX INFO: renamed from: a */
    public final float f8264a;

    /* JADX INFO: renamed from: b */
    public final float f8265b;

    /* JADX INFO: renamed from: c */
    public final float f8266c;

    /* JADX INFO: renamed from: d */
    public final float f8267d;

    /* JADX INFO: renamed from: e */
    public final float f8268e;

    /* JADX INFO: renamed from: f */
    public final float f8269f;

    /* JADX INFO: renamed from: g */
    public final float[] f8270g;

    /* JADX INFO: renamed from: h */
    public final float f8271h;

    /* JADX INFO: renamed from: i */
    public final float f8272i;

    /* JADX INFO: renamed from: j */
    public final float f8273j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        float fM4544d = (float) ((((double) AbstractC2596a.m4544d()) * 63.66197723675813d) / 100.0d);
        float[] fArr = AbstractC2596a.f8259c;
        float f2 = fArr[0];
        float[][] fArr2 = AbstractC2596a.f8257a;
        float[] fArr3 = fArr2[0];
        float f5 = fArr3[0] * f2;
        float f6 = fArr[1];
        float f7 = (fArr3[1] * f6) + f5;
        float f8 = fArr[2];
        float f9 = (fArr3[2] * f8) + f7;
        float[] fArr4 = fArr2[1];
        float f10 = (fArr4[2] * f8) + (fArr4[1] * f6) + (fArr4[0] * f2);
        float[] fArr5 = fArr2[2];
        float f11 = (f8 * fArr5[2]) + (f6 * fArr5[1]) + (f2 * fArr5[0]);
        float f12 = ((double) 1.0f) >= 0.9d ? 0.69f : 0.655f;
        float fExp = (1.0f - (((float) Math.exp(((-fM4544d) - 42.0f) / 92.0f)) * 0.2777778f)) * 1.0f;
        double d5 = fExp;
        if (d5 > 1.0d) {
            fExp = 1.0f;
        } else if (d5 < 0.0d) {
            fExp = 0.0f;
        }
        float[] fArr6 = {(((100.0f / f9) * fExp) + 1.0f) - fExp, (((100.0f / f10) * fExp) + 1.0f) - fExp, (((100.0f / f11) * fExp) + 1.0f) - fExp};
        float f13 = 1.0f / ((5.0f * fM4544d) + 1.0f);
        float f14 = f13 * f13 * f13 * f13;
        float f15 = 1.0f - f14;
        float fCbrt = (0.1f * f15 * f15 * ((float) Math.cbrt(((double) fM4544d) * 5.0d))) + (f14 * fM4544d);
        float fM4544d2 = AbstractC2596a.m4544d() / fArr[1];
        double d6 = fM4544d2;
        float fSqrt = ((float) Math.sqrt(d6)) + 1.48f;
        float fPow = 0.725f / ((float) Math.pow(d6, 0.2d));
        float[] fArr7 = {(float) Math.pow(((double) ((fArr6[0] * fCbrt) * f9)) / 100.0d, 0.42d), (float) Math.pow(((double) ((fArr6[1] * fCbrt) * f10)) / 100.0d, 0.42d), (float) Math.pow(((double) ((fArr6[2] * fCbrt) * f11)) / 100.0d, 0.42d)};
        float f16 = fArr7[0];
        float f17 = (f16 * 400.0f) / (f16 + 27.13f);
        float f18 = fArr7[1];
        float f19 = (f18 * 400.0f) / (f18 + 27.13f);
        float f20 = fArr7[2];
        float[] fArr8 = {f17, f19, (400.0f * f20) / (f20 + 27.13f)};
        f8263k = new C2599d(fM4544d2, ((fArr8[2] * 0.05f) + (fArr8[0] * 2.0f) + fArr8[1]) * fPow, fPow, fPow, f12, 1.0f, fArr6, fCbrt, (float) Math.pow(fCbrt, 0.25d), fSqrt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2599d(float f2, float f5, float f6, float f7, float f8, float f9, float[] fArr, float f10, float f11, float f12) {
        this.f8269f = f2;
        this.f8264a = f5;
        this.f8265b = f6;
        this.f8266c = f7;
        this.f8267d = f8;
        this.f8268e = f9;
        this.f8270g = fArr;
        this.f8271h = f10;
        this.f8272i = f11;
        this.f8273j = f12;
    }
}
