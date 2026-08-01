package p289u0;

import p252r3.AbstractC6470a;

/* JADX INFO: renamed from: u0.b */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C8478b {

    /* JADX INFO: renamed from: a */
    public static final C8478b f28301a = new C8478b();

    /* JADX INFO: renamed from: b */
    public static final float[][] f28302b = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};

    /* JADX INFO: renamed from: c */
    public static final float[][] f28303c = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};

    /* JADX INFO: renamed from: d */
    public static final float[] f28304d = {95.047f, 100.0f, 108.883f};

    /* JADX INFO: renamed from: e */
    public static final double[][] f28305e = {new double[]{0.41233895d, 0.35762064d, 0.18051042d}, new double[]{0.2126d, 0.7152d, 0.0722d}, new double[]{0.01932141d, 0.11916382d, 0.95034478d}};

    /* JADX INFO: renamed from: f */
    public static final double[][] f28306f = {new double[]{3.2413774792388685d, -1.5376652402851851d, -0.49885366846268053d}, new double[]{-0.9691452513005321d, 1.8758853451067872d, 0.04156585616912061d}, new double[]{0.05562093689691305d, -0.20395524564742123d, 1.0571799111220335d}};

    /* JADX INFO: renamed from: g */
    public static final int f28307g = 8;

    /* JADX INFO: renamed from: a */
    public final int m32552a(double d10, double d11, double d12) {
        return m32554c(m32557f(d10), m32557f(d11), m32557f(d12));
    }

    /* JADX INFO: renamed from: b */
    public final int m32553b(double d10) {
        double d11 = (d10 + 16.0d) / 116.0d;
        double d12 = d10 > 8.0d ? d11 * d11 * d11 : d10 / 903.2962962962963d;
        double d13 = d11 * d11 * d11;
        boolean z10 = d13 > 0.008856451679035631d;
        double d14 = z10 ? d13 : d10 / 903.2962962962963d;
        if (!z10) {
            d13 = d10 / 903.2962962962963d;
        }
        float[] fArr = f28304d;
        return m32555d(d14 * ((double) fArr[0]), d12 * ((double) fArr[1]), d13 * ((double) fArr[2]));
    }

    /* JADX INFO: renamed from: c */
    public final int m32554c(int i10, int i11, int i12) {
        return ((i10 & 255) << 16) | (-16777216) | ((i11 & 255) << 8) | (i12 & 255);
    }

    /* JADX INFO: renamed from: d */
    public final int m32555d(double d10, double d11, double d12) {
        double[][] dArr = f28306f;
        double[] dArr2 = dArr[0];
        double d13 = (dArr2[0] * d10) + (dArr2[1] * d11) + (dArr2[2] * d12);
        double[] dArr3 = dArr[1];
        double d14 = (dArr3[0] * d10) + (dArr3[1] * d11) + (dArr3[2] * d12);
        double[] dArr4 = dArr[2];
        return m32554c(m32557f(d13), m32557f(d14), m32557f((dArr4[0] * d10) + (dArr4[1] * d11) + (dArr4[2] * d12)));
    }

    /* JADX INFO: renamed from: e */
    public final int m32556e(int i10, int i11, int i12) {
        return i12 < i10 ? i10 : i12 > i11 ? i11 : i12;
    }

    /* JADX INFO: renamed from: f */
    public final int m32557f(double d10) {
        double d11 = d10 / 100.0d;
        return m32556e(0, 255, (int) Math.round((d11 <= 0.0031308d ? d11 * 12.92d : (Math.pow(d11, 0.4166666666666667d) * 1.055d) - 0.055d) * 255.0d));
    }

    /* JADX INFO: renamed from: g */
    public final float[][] m32558g() {
        return f28303c;
    }

    /* JADX INFO: renamed from: h */
    public final float[] m32559h() {
        return f28304d;
    }

    /* JADX INFO: renamed from: i */
    public final float[][] m32560i() {
        return f28302b;
    }

    /* JADX INFO: renamed from: j */
    public final int m32561j(float f10) {
        if (f10 < 1.0f) {
            return -16777216;
        }
        if (f10 > 99.0f) {
            return -1;
        }
        float f11 = (f10 + 16.0f) / 116.0f;
        float f12 = f10 > 8.0f ? f11 * f11 * f11 : f10 / 903.2963f;
        float f13 = f11 * f11 * f11;
        boolean z10 = f13 > 0.008856452f;
        float f14 = z10 ? f13 : ((f11 * 116.0f) - 16.0f) / 903.2963f;
        if (!z10) {
            f13 = ((f11 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = f28304d;
        return AbstractC6470a.m25644a(f14 * fArr[0], f12 * fArr[1], f13 * fArr[2]);
    }

    /* JADX INFO: renamed from: k */
    public final float m32562k(int i10) {
        float f10 = i10 / 255.0f;
        return (f10 <= 0.04045f ? f10 / 12.92f : (float) Math.pow((f10 + 0.055f) / 1.055f, 2.4f)) * 100.0f;
    }

    /* JADX INFO: renamed from: l */
    public final float m32563l(int i10) {
        return m32564m(m32567p(i10));
    }

    /* JADX INFO: renamed from: m */
    public final float m32564m(float f10) {
        float f11 = f10 / 100.0f;
        return f11 <= 0.008856452f ? f11 * 903.2963f : (((float) Math.cbrt(f11)) * 116.0f) - 16.0f;
    }

    /* JADX INFO: renamed from: n */
    public final int m32565n(double d10) {
        if (d10 < 0.0d) {
            return -1;
        }
        return d10 == 0.0d ? 0 : 1;
    }

    /* JADX INFO: renamed from: o */
    public final float[] m32566o(int i10) {
        float fM32562k = m32562k((i10 >> 16) & 255);
        float fM32562k2 = m32562k((i10 >> 8) & 255);
        float fM32562k3 = m32562k(i10 & 255);
        double[][] dArr = f28305e;
        double d10 = fM32562k;
        double[] dArr2 = dArr[0];
        double d11 = fM32562k2;
        double d12 = fM32562k3;
        double d13 = (dArr2[0] * d10) + (dArr2[1] * d11) + (dArr2[2] * d12);
        double[] dArr3 = dArr[1];
        double d14 = (dArr3[0] * d10) + (dArr3[1] * d11) + (dArr3[2] * d12);
        double[] dArr4 = dArr[2];
        return new float[]{(float) d13, (float) d14, (float) ((d10 * dArr4[0]) + (d11 * dArr4[1]) + (d12 * dArr4[2]))};
    }

    /* JADX INFO: renamed from: p */
    public final float m32567p(int i10) {
        float fM32562k = m32562k((i10 >> 16) & 255);
        float fM32562k2 = m32562k((i10 >> 8) & 255);
        float fM32562k3 = m32562k(i10 & 255);
        double[] dArr = f28305e[1];
        return (float) ((((double) fM32562k) * dArr[0]) + (((double) fM32562k2) * dArr[1]) + (((double) fM32562k3) * dArr[2]));
    }

    /* JADX INFO: renamed from: q */
    public final double m32568q(double d10) {
        return (d10 > 8.0d ? Math.pow((d10 + 16.0d) / 116.0d, 3.0d) : d10 / 903.2962962962963d) * 100.0d;
    }
}
