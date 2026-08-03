package Yue;

import android.graphics.Color;

/* JADX INFO: renamed from: Yue.ۥۣۣ۟ۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C3658 {

    /* JADX INFO: renamed from: ۥ */
    public static final float[][] f446 = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};

    /* JADX INFO: renamed from: ۥ۟ */
    public static final float[][] f447 = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final float[] f6479 = {95.047f, 100.0f, 108.883f};

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final float[][] f6480 = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};

    /* JADX INFO: renamed from: ۥ */
    public static int m729(float f) {
        if (f < 1.0f) {
            return C8273.f24692;
        }
        if (f > 99.0f) {
            return -1;
        }
        float f2 = (f + 16.0f) / 116.0f;
        float f3 = f > 8.0f ? f2 * f2 * f2 : f / 903.2963f;
        float f4 = f2 * f2 * f2;
        boolean z = f4 > 0.008856452f;
        float f5 = z ? f4 : ((f2 * 116.0f) - 16.0f) / 903.2963f;
        if (!z) {
            f4 = ((f2 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = f6479;
        return C3913.m11151(f5 * fArr[0], f3 * fArr[1], f4 * fArr[2]);
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static float m730(int i) {
        return m10005(m10009(i));
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static float m10005(float f) {
        float f2 = f / 100.0f;
        return f2 <= 0.008856452f ? f2 * 903.2963f : (((float) Math.cbrt(f2)) * 116.0f) - 16.0f;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static float m10006(float f, float f2, float f3) {
        return f + ((f2 - f) * f3);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static float m10007(int i) {
        float f = i / 255.0f;
        return (f <= 0.04045f ? f / 12.92f : (float) Math.pow((f + 0.055f) / 1.055f, 2.4000000953674316d)) * 100.0f;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static void m10008(int i, @InterfaceC6391 float[] fArr) {
        float fM10007 = m10007(Color.red(i));
        float fM100072 = m10007(Color.green(i));
        float fM100073 = m10007(Color.blue(i));
        float[][] fArr2 = f6480;
        float[] fArr3 = fArr2[0];
        fArr[0] = (fArr3[0] * fM10007) + (fArr3[1] * fM100072) + (fArr3[2] * fM100073);
        float[] fArr4 = fArr2[1];
        fArr[1] = (fArr4[0] * fM10007) + (fArr4[1] * fM100072) + (fArr4[2] * fM100073);
        float[] fArr5 = fArr2[2];
        fArr[2] = (fM10007 * fArr5[0]) + (fM100072 * fArr5[1]) + (fM100073 * fArr5[2]);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static float m10009(int i) {
        float fM10007 = m10007(Color.red(i));
        float fM100072 = m10007(Color.green(i));
        float fM100073 = m10007(Color.blue(i));
        float[] fArr = f6480[1];
        return (fM10007 * fArr[0]) + (fM100072 * fArr[1]) + (fM100073 * fArr[2]);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static float m10010(float f) {
        return (f > 8.0f ? (float) Math.pow((((double) f) + 16.0d) / 116.0d, 3.0d) : f / 903.2963f) * 100.0f;
    }
}
