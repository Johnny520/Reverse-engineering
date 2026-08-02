package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class um0 {

    /* JADX INFO: renamed from: k */
    public static final um0 f11361k;

    /* JADX INFO: renamed from: a */
    public final float f11362a;

    /* JADX INFO: renamed from: b */
    public final float f11363b;

    /* JADX INFO: renamed from: c */
    public final float f11364c;

    /* JADX INFO: renamed from: d */
    public final float f11365d;

    /* JADX INFO: renamed from: e */
    public final float f11366e;

    /* JADX INFO: renamed from: f */
    public final float f11367f;

    /* JADX INFO: renamed from: g */
    public final float[] f11368g;

    /* JADX INFO: renamed from: h */
    public final float f11369h;

    /* JADX INFO: renamed from: i */
    public final float f11370i;

    /* JADX INFO: renamed from: j */
    public final float f11371j;

    static {
        float[] fArr = rg3.f9561c;
        float fPow = (float) (((Math.pow(0.5689655172413793d, 3.0d) * 100.0d) * 63.66197723675813d) / 100.0d);
        float[][] fArr2 = rg3.f9559a;
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
        float fExp = (1.0f - (((float) Math.exp(((-fPow) - 42.0f) / 92.0f)) * 0.2777778f)) * 1.0f;
        double d = fExp;
        if (d > 1.0d) {
            fExp = 1.0f;
        } else if (d < 0.0d) {
            fExp = 0.0f;
        }
        float f9 = 1.0f / ((5.0f * fPow) + 1.0f);
        float f10 = f9 * f9 * f9 * f9;
        float f11 = 1.0f - f10;
        float fCbrt = (0.1f * f11 * f11 * ((float) Math.cbrt(((double) fPow) * 5.0d))) + (f10 * fPow);
        float fPow2 = ((float) (Math.pow(0.5689655172413793d, 3.0d) * 100.0d)) / fArr[1];
        double d2 = fPow2;
        float fSqrt = ((float) Math.sqrt(d2)) + 1.48f;
        float fPow3 = 0.725f / ((float) Math.pow(d2, 0.20000000298023224d));
        float[] fArr6 = {(float) Math.pow(((r7[0] * fCbrt) * f6) / 100.0f, 0.41999998688697815d), (float) Math.pow(((r7[1] * fCbrt) * f7) / 100.0f, 0.41999998688697815d), (float) Math.pow(((r7[2] * fCbrt) * f8) / 100.0f, 0.41999998688697815d)};
        float f12 = fArr6[0];
        float f13 = (f12 * 400.0f) / (f12 + 27.13f);
        float f14 = fArr6[1];
        float f15 = (f14 * 400.0f) / (f14 + 27.13f);
        float f16 = fArr6[2];
        float[] fArr7 = {f13, f15, (400.0f * f16) / (f16 + 27.13f)};
        f11361k = new um0(fPow2, ((fArr7[2] * 0.05f) + (fArr7[0] * 2.0f) + fArr7[1]) * fPow3, fPow3, fPow3, 0.69000006f, 1.0f, new float[]{(((100.0f / f6) * fExp) + 1.0f) - fExp, (((100.0f / f7) * fExp) + 1.0f) - fExp, (((100.0f / f8) * fExp) + 1.0f) - fExp}, fCbrt, (float) Math.pow(fCbrt, 0.25d), fSqrt);
    }

    public um0(float f, float f2, float f3, float f4, float f5, float f6, float[] fArr, float f7, float f8, float f9) {
        this.f11362a = f;
        this.f11363b = f2;
        this.f11364c = f3;
        this.f11365d = f4;
        this.f11366e = f5;
        this.f11367f = f6;
        this.f11368g = fArr;
        this.f11369h = f7;
        this.f11370i = f8;
        this.f11371j = f9;
    }
}
