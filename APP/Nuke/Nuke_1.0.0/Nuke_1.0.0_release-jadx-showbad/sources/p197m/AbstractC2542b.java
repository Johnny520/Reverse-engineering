package p197m;

import com.bumptech.glide.AbstractC1926h;

/* JADX INFO: renamed from: m.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2542b {

    /* JADX INFO: renamed from: a */
    public static final float[] f8114a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        float f2;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        float[] fArr = new float[101];
        f8114a = fArr;
        float[] fArr2 = new float[101];
        float f13 = 0.0f;
        int i5 = 0;
        float f14 = 0.0f;
        while (true) {
            float f15 = 1.0f;
            if (i5 >= 100) {
                fArr2[100] = 1.0f;
                fArr[100] = 1.0f;
                return;
            }
            float f16 = i5 / 100;
            float f17 = 1.0f;
            while (true) {
                f2 = ((f17 - f13) / 2.0f) + f13;
                f5 = f15 - f2;
                f6 = f2 * 3.0f * f5;
                f7 = f2 * f2 * f2;
                float f18 = (((f2 * 0.35000002f) + (f5 * 0.175f)) * f6) + f7;
                f8 = f15;
                if (Math.abs(f18 - f16) < 1.0E-5d) {
                    break;
                }
                if (f18 > f16) {
                    f17 = f2;
                } else {
                    f13 = f2;
                }
                f15 = f8;
            }
            float f19 = 0.5f;
            fArr[i5] = (((f5 * 0.5f) + f2) * f6) + f7;
            float f20 = f8;
            while (true) {
                f9 = ((f20 - f14) / 2.0f) + f14;
                f10 = f8 - f9;
                f11 = f9 * 3.0f * f10;
                f12 = f9 * f9 * f9;
                float f21 = (((f10 * f19) + f9) * f11) + f12;
                float f22 = f20;
                if (Math.abs(f21 - f16) >= 1.0E-5d) {
                    if (f21 > f16) {
                        f20 = f9;
                    } else {
                        f14 = f9;
                        f20 = f22;
                    }
                    f19 = 0.5f;
                }
            }
            fArr2[i5] = (((f9 * 0.35000002f) + (f10 * 0.175f)) * f11) + f12;
            i5++;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static C2541a m4473a(float f2) {
        float f5 = 0.0f;
        float f6 = 1.0f;
        float fM3567j = AbstractC1926h.m3567j(f2, 0.0f, 1.0f);
        float f7 = 100;
        int i5 = (int) (f7 * fM3567j);
        if (i5 < 100) {
            float f8 = i5 / f7;
            int i6 = i5 + 1;
            float f9 = i6 / f7;
            float[] fArr = f8114a;
            float f10 = fArr[i5];
            float f11 = (fArr[i6] - f10) / (f9 - f8);
            float f12 = ((fM3567j - f8) * f11) + f10;
            f5 = f11;
            f6 = f12;
        }
        return new C2541a(f6, f5);
    }
}
