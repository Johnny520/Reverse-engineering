package Yue;

/* JADX INFO: renamed from: Yue.ۥۢۥ۟۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C8385 {

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final C8385 f24986 = m27951(C3658.f6479, (float) ((((double) C3658.m10010(50.0f)) * 63.66197723675813d) / 100.0d), 50.0f, 2.0f, false);

    /* JADX INFO: renamed from: ۥ */
    public final float f3446;

    /* JADX INFO: renamed from: ۥ۟ */
    public final float f3447;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final float f24987;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final float f24988;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final float f24989;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final float f24990;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final float[] f24991;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final float f24992;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final float f24993;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final float f24994;

    public C8385(float f, float f2, float f3, float f4, float f5, float f6, float[] fArr, float f7, float f8, float f9) {
        this.f24990 = f;
        this.f3446 = f2;
        this.f3447 = f3;
        this.f24987 = f4;
        this.f24988 = f5;
        this.f24989 = f6;
        this.f24991 = fArr;
        this.f24992 = f7;
        this.f24993 = f8;
        this.f24994 = f9;
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static C8385 m27951(@InterfaceC6391 float[] fArr, float f, float f2, float f3, boolean z) {
        float[][] fArr2 = C3658.f446;
        float f4 = fArr[0];
        float[] fArr3 = fArr2[0];
        float f5 = fArr3[0] * f4;
        float f6 = fArr[1];
        float f7 = f5 + (fArr3[1] * f6);
        float f8 = fArr[2];
        float f9 = f7 + (fArr3[2] * f8);
        float[] fArr4 = fArr2[1];
        float f10 = (fArr4[0] * f4) + (fArr4[1] * f6) + (fArr4[2] * f8);
        float[] fArr5 = fArr2[2];
        float f11 = (f4 * fArr5[0]) + (f6 * fArr5[1]) + (f8 * fArr5[2]);
        float f12 = (f3 / 10.0f) + 0.8f;
        float fM10006 = ((double) f12) >= 0.9d ? C3658.m10006(0.59f, 0.69f, (f12 - 0.9f) * 10.0f) : C3658.m10006(0.525f, 0.59f, (f12 - 0.8f) * 10.0f);
        float fExp = z ? 1.0f : (1.0f - (((float) Math.exp(((-f) - 42.0f) / 92.0f)) * 0.2777778f)) * f12;
        double d = fExp;
        if (d > 1.0d) {
            fExp = 1.0f;
        } else if (d < 0.0d) {
            fExp = 0.0f;
        }
        float[] fArr6 = {(((100.0f / f9) * fExp) + 1.0f) - fExp, (((100.0f / f10) * fExp) + 1.0f) - fExp, (((100.0f / f11) * fExp) + 1.0f) - fExp};
        float f13 = 1.0f / ((5.0f * f) + 1.0f);
        float f14 = f13 * f13 * f13 * f13;
        float f15 = 1.0f - f14;
        float fCbrt = (f14 * f) + (0.1f * f15 * f15 * ((float) Math.cbrt(((double) f) * 5.0d)));
        float fM10010 = C3658.m10010(f2) / fArr[1];
        double d2 = fM10010;
        float fSqrt = ((float) Math.sqrt(d2)) + 1.48f;
        float fPow = 0.725f / ((float) Math.pow(d2, 0.2d));
        float[] fArr7 = {(float) Math.pow(((double) ((fArr6[0] * fCbrt) * f9)) / 100.0d, 0.42d), (float) Math.pow(((double) ((fArr6[1] * fCbrt) * f10)) / 100.0d, 0.42d), (float) Math.pow(((double) ((fArr6[2] * fCbrt) * f11)) / 100.0d, 0.42d)};
        float f16 = fArr7[0];
        float f17 = (f16 * 400.0f) / (f16 + 27.13f);
        float f18 = fArr7[1];
        float f19 = (f18 * 400.0f) / (f18 + 27.13f);
        float f20 = fArr7[2];
        float[] fArr8 = {f17, f19, (400.0f * f20) / (f20 + 27.13f)};
        return new C8385(fM10010, ((fArr8[0] * 2.0f) + fArr8[1] + (fArr8[2] * 0.05f)) * fPow, fPow, fPow, fM10006, f12, fArr6, fCbrt, (float) Math.pow(fCbrt, 0.25d), fSqrt);
    }

    /* JADX INFO: renamed from: ۥ */
    public float m4369() {
        return this.f3446;
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public float m4370() {
        return this.f24988;
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public float m27952() {
        return this.f24992;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public float m27953() {
        return this.f24993;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public float m27954() {
        return this.f24990;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public float m27955() {
        return this.f3447;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public float m27956() {
        return this.f24989;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public float m27957() {
        return this.f24987;
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public float[] m27958() {
        return this.f24991;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public float m27959() {
        return this.f24994;
    }
}
