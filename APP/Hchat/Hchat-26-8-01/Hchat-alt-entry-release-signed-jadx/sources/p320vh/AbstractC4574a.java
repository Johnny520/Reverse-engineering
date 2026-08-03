package p320vh;

import p222p.AbstractC3199a;

/* JADX INFO: renamed from: vh.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4574a {

    /* JADX INFO: renamed from: a */
    public static final String[][] f15063a;

    /* JADX INFO: renamed from: b */
    public static final String[][] f15064b;

    /* JADX INFO: renamed from: c */
    public static final float[] f15065c;

    /* JADX INFO: renamed from: d */
    public static final float[] f15066d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        String[][] strArr = new String[8][];
        for (int i9 = 0; i9 < 8; i9++) {
            String[] strArr2 = new String[5];
            for (int i10 = 0; i10 < 5; i10++) {
                strArr2[i10] = AbstractC3199a.m6837j(i9, "LMGauss", "_H_d", 1 << i10);
            }
            strArr[i9] = strArr2;
        }
        f15063a = strArr;
        String[][] strArr3 = new String[8][];
        for (int i11 = 0; i11 < 8; i11++) {
            String[] strArr4 = new String[5];
            for (int i12 = 0; i12 < 5; i12++) {
                strArr4[i12] = AbstractC3199a.m6837j(i11, "LMGauss", "_V_d", 1 << i12);
            }
            strArr3[i11] = strArr4;
        }
        f15064b = strArr3;
        f15065c = new float[]{0.0f, 3.0265f, 7.5625f, 9.0f, 202.696f};
        f15066d = new float[]{3.5496478f, 9.5f, 20.0f, 44.10215f};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final int m9021a(float f3, double[] dArr, float[] fArr, float[] fArr2) {
        int i9;
        dArr.getClass();
        fArr.getClass();
        fArr2.getClass();
        if (f3 <= 0.25f) {
            return 0;
        }
        double d10 = f3;
        for (int i10 = 0; i10 < 14; i10++) {
            double d11 = i10;
            dArr[i10] = Math.exp((((-0.5d) * d11) * d11) / d10);
        }
        double d12 = dArr[0];
        for (int i11 = 1; i11 < 14; i11++) {
            d12 += dArr[i11] * 2.0d;
        }
        for (int i12 = 0; i12 < 14; i12++) {
            dArr[i12] = dArr[i12] / d12;
        }
        double d13 = dArr[0] * 0.5d;
        double d14 = dArr[1];
        double d15 = d13 + d14;
        if (d15 > 1.0E-6d) {
            fArr[0] = (float) (d14 / d15);
            i9 = 1;
        } else {
            i9 = 0;
        }
        for (int i13 = 2; i13 < 14 && i9 < 7; i13 += 2) {
            double d16 = dArr[i13];
            int i14 = i13 + 1;
            double d17 = i14 < 14 ? dArr[i14] : 0.0d;
            double d18 = d16 + d17;
            if (d18 < 0.002d) {
                break;
            }
            fArr[i9] = (float) (((d17 * ((double) i14)) + (d16 * ((double) i13))) / d18);
            fArr2[i9] = (float) d18;
            i9++;
        }
        float f10 = 0.0f;
        for (int i15 = 1; i15 < i9; i15++) {
            f10 += fArr2[i15];
        }
        float f11 = 0.5f - f10;
        if (f11 < 0.0f) {
            f11 = 0.0f;
        }
        fArr2[0] = f11;
        for (int i16 = 0; i16 < i9; i16++) {
            float f12 = fArr2[i16];
            if (f12 <= 0.0f || f12 >= 1.0f) {
                fArr2[i16] = 0.0f;
            }
        }
        return i9;
    }
}
