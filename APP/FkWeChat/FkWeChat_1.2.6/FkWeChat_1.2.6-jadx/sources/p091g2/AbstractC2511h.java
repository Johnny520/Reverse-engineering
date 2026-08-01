package p091g2;

import p073f2.C2236d0;
import p120i2.AbstractC3167a;
import p185m8.AbstractC5102r;
import p250r1.C6455e;

/* JADX INFO: renamed from: g2.h */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2511h {

    /* JADX INFO: renamed from: a */
    public static boolean f6782a = true;

    /* JADX INFO: renamed from: c */
    public static final void m9012c(C2510g c2510g, C2236d0 c2236d0) {
        m9013d(c2510g, c2236d0, C6455e.f20314b.m25569c());
    }

    /* JADX INFO: renamed from: d */
    public static final void m9013d(C2510g c2510g, C2236d0 c2236d0, long j10) {
        c2510g.m9008b().mo8985b(c2236d0, j10);
    }

    /* JADX INFO: renamed from: e */
    public static final float m9014e(float[] fArr, float[] fArr2, int i10, boolean z10) {
        int i11 = i10 - 1;
        float f10 = fArr2[i11];
        float fSignum = 0.0f;
        int i12 = i11;
        while (i12 > 0) {
            int i13 = i12 - 1;
            float f11 = fArr2[i13];
            if (f10 != f11) {
                float f12 = (z10 ? -fArr[i13] : fArr[i12] - fArr[i13]) / (f10 - f11);
                fSignum += (f12 - (Math.signum(fSignum) * ((float) Math.sqrt(2 * Math.abs(fSignum))))) * Math.abs(f12);
                if (i12 == i11) {
                    fSignum *= 0.5f;
                }
            }
            i12--;
            f10 = f11;
        }
        return Math.signum(fSignum) * ((float) Math.sqrt(2 * Math.abs(fSignum)));
    }

    /* JADX INFO: renamed from: f */
    public static final float m9015f(float[] fArr, float[] fArr2) {
        int length = fArr.length;
        float f10 = 0.0f;
        for (int i10 = 0; i10 < length; i10++) {
            f10 += fArr[i10] * fArr2[i10];
        }
        return f10;
    }

    /* JADX INFO: renamed from: g */
    public static final boolean m9016g() {
        return f6782a;
    }

    /* JADX INFO: renamed from: h */
    public static final float[] m9017h(float[] fArr, float[] fArr2, int i10, int i11, float[] fArr3) {
        int i12 = i11;
        if (i12 < 1) {
            AbstractC3167a.m11955a("The degree must be at positive integer");
        }
        if (i10 == 0) {
            AbstractC3167a.m11955a("At least one point must be provided");
        }
        if (i12 >= i10) {
            i12 = i10 - 1;
        }
        int i13 = i12 + 1;
        float[][] fArr4 = new float[i13][];
        for (int i14 = 0; i14 < i13; i14++) {
            fArr4[i14] = new float[i10];
        }
        for (int i15 = 0; i15 < i10; i15++) {
            fArr4[0][i15] = 1.0f;
            for (int i16 = 1; i16 < i13; i16++) {
                fArr4[i16][i15] = fArr4[i16 - 1][i15] * fArr[i15];
            }
        }
        float[][] fArr5 = new float[i13][];
        for (int i17 = 0; i17 < i13; i17++) {
            fArr5[i17] = new float[i10];
        }
        float[][] fArr6 = new float[i13][];
        for (int i18 = 0; i18 < i13; i18++) {
            fArr6[i18] = new float[i13];
        }
        int i19 = 0;
        while (i19 < i13) {
            float[] fArr7 = fArr5[i19];
            AbstractC5102r.m20657i(fArr4[i19], fArr7, 0, 0, i10);
            for (int i20 = 0; i20 < i19; i20++) {
                float[] fArr8 = fArr5[i20];
                float fM9015f = m9015f(fArr7, fArr8);
                for (int i21 = 0; i21 < i10; i21++) {
                    fArr7[i21] = fArr7[i21] - (fArr8[i21] * fM9015f);
                }
            }
            float fSqrt = (float) Math.sqrt(m9015f(fArr7, fArr7));
            if (fSqrt < 1.0E-6f) {
                fSqrt = 1.0E-6f;
            }
            float f10 = 1.0f / fSqrt;
            for (int i22 = 0; i22 < i10; i22++) {
                fArr7[i22] = fArr7[i22] * f10;
            }
            float[] fArr9 = fArr6[i19];
            int i23 = 0;
            while (i23 < i13) {
                fArr9[i23] = i23 < i19 ? 0.0f : m9015f(fArr7, fArr4[i23]);
                i23++;
            }
            i19++;
        }
        for (int i24 = i12; -1 < i24; i24--) {
            float fM9015f2 = m9015f(fArr5[i24], fArr2);
            float[] fArr10 = fArr6[i24];
            int i25 = i24 + 1;
            if (i25 <= i12) {
                int i26 = i12;
                while (true) {
                    fM9015f2 -= fArr10[i26] * fArr3[i26];
                    if (i26 != i25) {
                        i26--;
                    }
                }
            }
            fArr3[i24] = fM9015f2 / fArr10[i24];
        }
        return fArr3;
    }

    /* JADX INFO: renamed from: i */
    public static final void m9018i(C2504a[] c2504aArr, int i10, long j10, float f10) {
        C2504a c2504a = c2504aArr[i10];
        if (c2504a == null) {
            c2504aArr[i10] = new C2504a(j10, f10);
        } else {
            c2504a.m8983d(j10);
            c2504a.m8982c(f10);
        }
    }
}
