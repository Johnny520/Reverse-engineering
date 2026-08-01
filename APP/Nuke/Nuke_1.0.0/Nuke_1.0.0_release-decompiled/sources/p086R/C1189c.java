package p086R;

/* JADX INFO: renamed from: R.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1189c {

    /* JADX INFO: renamed from: k */
    public static final C1189c f3895k;

    /* JADX INFO: renamed from: a */
    public final float f3896a;

    /* JADX INFO: renamed from: b */
    public final float f3897b;

    /* JADX INFO: renamed from: c */
    public final float f3898c;

    /* JADX INFO: renamed from: d */
    public final float f3899d;

    /* JADX INFO: renamed from: e */
    public final float f3900e;

    /* JADX INFO: renamed from: f */
    public final float f3901f;

    /* JADX INFO: renamed from: g */
    public final float[] f3902g;

    /* JADX INFO: renamed from: h */
    public final float f3903h;

    /* JADX INFO: renamed from: i */
    public final float f3904i;

    /* JADX INFO: renamed from: j */
    public final float f3905j;

    static {
        float[] fArr = AbstractC1188b.f3888c;
        float fPow = (float) (((Math.pow(0.5689655172413793d, 3.0d) * 100.0d) * 63.66197723675813d) / 100.0d);
        float[][] fArr2 = AbstractC1188b.f3886a;
        float f2 = fArr[0];
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
        float f12 = ((double) 1.0f) >= 0.9d ? 0.69000006f : 0.6549999f;
        float fExp = (1.0f - (((float) Math.exp(((-fPow) - 42.0f) / 92.0f)) * 0.2777778f)) * 1.0f;
        double d5 = fExp;
        if (d5 > 1.0d) {
            fExp = 1.0f;
        } else if (d5 < 0.0d) {
            fExp = 0.0f;
        }
        float[] fArr6 = {(((100.0f / f9) * fExp) + 1.0f) - fExp, (((100.0f / f10) * fExp) + 1.0f) - fExp, (((100.0f / f11) * fExp) + 1.0f) - fExp};
        float f13 = 1.0f / ((5.0f * fPow) + 1.0f);
        float f14 = f13 * f13 * f13 * f13;
        float f15 = 1.0f - f14;
        float fCbrt = (0.1f * f15 * f15 * ((float) Math.cbrt(((double) fPow) * 5.0d))) + (f14 * fPow);
        double d6 = 50.0f;
        float fPow2 = ((float) (d6 > 8.0d ? Math.pow((d6 + 16.0d) / 116.0d, 3.0d) * 100.0d : (d6 / 903.2962962962963d) * 100.0d)) / fArr[1];
        double d7 = fPow2;
        float fSqrt = ((float) Math.sqrt(d7)) + 1.48f;
        float fPow3 = 0.725f / ((float) Math.pow(d7, 0.2f));
        double d8 = 0.42f;
        float[] fArr7 = {(float) Math.pow(((fArr6[0] * fCbrt) * f9) / 100.0f, d8), (float) Math.pow(((fArr6[1] * fCbrt) * f10) / 100.0f, d8), (float) Math.pow(((fArr6[2] * fCbrt) * f11) / 100.0f, d8)};
        float f16 = fArr7[0];
        float f17 = (f16 * 400.0f) / (f16 + 27.13f);
        float f18 = fArr7[1];
        float f19 = (f18 * 400.0f) / (f18 + 27.13f);
        float f20 = fArr7[2];
        float[] fArr8 = {f17, f19, (400.0f * f20) / (f20 + 27.13f)};
        f3895k = new C1189c(fPow2, ((fArr8[2] * 0.05f) + (fArr8[0] * 2.0f) + fArr8[1]) * fPow3, fPow3, fPow3, f12, 1.0f, fArr6, fCbrt, (float) Math.pow(fCbrt, 0.25f), fSqrt);
    }

    public C1189c(float f2, float f5, float f6, float f7, float f8, float f9, float[] fArr, float f10, float f11, float f12) {
        this.f3896a = f2;
        this.f3897b = f5;
        this.f3898c = f6;
        this.f3899d = f7;
        this.f3900e = f8;
        this.f3901f = f9;
        this.f3902g = fArr;
        this.f3903h = f10;
        this.f3904i = f11;
        this.f3905j = f12;
    }
}
