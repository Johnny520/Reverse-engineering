package p000;

import android.graphics.Color;

/* JADX INFO: renamed from: I6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0351I6 {

    /* JADX INFO: renamed from: a */
    public final float f1178a;

    /* JADX INFO: renamed from: b */
    public final float f1179b;

    /* JADX INFO: renamed from: c */
    public final float f1180c;

    /* JADX INFO: renamed from: d */
    public final float f1181d;

    /* JADX INFO: renamed from: e */
    public final float f1182e;

    /* JADX INFO: renamed from: f */
    public final float f1183f;

    public C0351I6(float f, float f2, float f3, float f4, float f5, float f6) {
        this.f1178a = f;
        this.f1179b = f2;
        this.f1180c = f3;
        this.f1181d = f4;
        this.f1182e = f5;
        this.f1183f = f6;
    }

    /* JADX INFO: renamed from: a */
    public static C0351I6 m752a(int i) {
        C0917VE c0917ve = C0917VE.f2864k;
        float fM1229L = AbstractC0628Oj.m1229L(Color.red(i));
        float fM1229L2 = AbstractC0628Oj.m1229L(Color.green(i));
        float fM1229L3 = AbstractC0628Oj.m1229L(Color.blue(i));
        float[][] fArr = AbstractC0628Oj.f2010d;
        float[] fArr2 = fArr[0];
        float f = (fArr2[2] * fM1229L3) + (fArr2[1] * fM1229L2) + (fArr2[0] * fM1229L);
        float[] fArr3 = fArr[1];
        float f2 = (fArr3[2] * fM1229L3) + (fArr3[1] * fM1229L2) + (fArr3[0] * fM1229L);
        float[] fArr4 = fArr[2];
        float f3 = (fM1229L3 * fArr4[2]) + (fM1229L2 * fArr4[1]) + (fM1229L * fArr4[0]);
        float[][] fArr5 = AbstractC0628Oj.f2007a;
        float[] fArr6 = fArr5[0];
        float f4 = (fArr6[2] * f3) + (fArr6[1] * f2) + (fArr6[0] * f);
        float[] fArr7 = fArr5[1];
        float f5 = (fArr7[2] * f3) + (fArr7[1] * f2) + (fArr7[0] * f);
        float[] fArr8 = fArr5[2];
        float f6 = (f3 * fArr8[2]) + (f2 * fArr8[1]) + (f * fArr8[0]);
        float[] fArr9 = c0917ve.f2871g;
        float f7 = c0917ve.f2873i;
        float f8 = c0917ve.f2868d;
        float f9 = c0917ve.f2865a;
        float f10 = fArr9[0] * f4;
        float f11 = fArr9[1] * f5;
        float f12 = fArr9[2] * f6;
        float f13 = c0917ve.f2872h;
        float fPow = (float) Math.pow(((double) (Math.abs(f10) * f13)) / 100.0d, 0.42d);
        float fPow2 = (float) Math.pow(((double) (Math.abs(f11) * f13)) / 100.0d, 0.42d);
        float fPow3 = (float) Math.pow(((double) (Math.abs(f12) * f13)) / 100.0d, 0.42d);
        float fSignum = ((Math.signum(f10) * 400.0f) * fPow) / (fPow + 27.13f);
        float fSignum2 = ((Math.signum(f11) * 400.0f) * fPow2) / (fPow2 + 27.13f);
        float fSignum3 = ((Math.signum(f12) * 400.0f) * fPow3) / (fPow3 + 27.13f);
        double d = fSignum3;
        float f14 = ((float) (((((double) fSignum2) * (-12.0d)) + (((double) fSignum) * 11.0d)) + d)) / 11.0f;
        float f15 = ((float) (((double) (fSignum + fSignum2)) - (d * 2.0d))) / 9.0f;
        float f16 = fSignum2 * 20.0f;
        float f17 = ((21.0f * fSignum3) + ((fSignum * 20.0f) + f16)) / 20.0f;
        float f18 = (((fSignum * 40.0f) + f16) + fSignum3) / 20.0f;
        float fAtan2 = (((float) Math.atan2(f15, f14)) * 180.0f) / 3.1415927f;
        if (fAtan2 < 0.0f) {
            fAtan2 += 360.0f;
        } else if (fAtan2 >= 360.0f) {
            fAtan2 -= 360.0f;
        }
        float f19 = (3.1415927f * fAtan2) / 180.0f;
        float fPow4 = ((float) Math.pow((f18 * c0917ve.f2866b) / f9, c0917ve.f2874j * f8)) * 100.0f;
        Math.sqrt(fPow4 / 100.0f);
        float f20 = f9 + 4.0f;
        float fPow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, c0917ve.f2870f), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos(((((double) (((double) fAtan2) < 20.14d ? 360.0f + fAtan2 : fAtan2)) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * c0917ve.f2869e) * c0917ve.f2867c) * ((float) Math.sqrt((f15 * f15) + (f14 * f14)))) / (f17 + 0.305f), 0.9d)) * ((float) Math.sqrt(((double) fPow4) / 100.0d));
        Math.sqrt((r0 * f8) / f20);
        float f21 = (1.7f * fPow4) / ((0.007f * fPow4) + 1.0f);
        float fLog = ((float) Math.log((f7 * fPow5 * 0.0228f) + 1.0f)) * 43.85965f;
        double d2 = f19;
        return new C0351I6(fAtan2, fPow5, fPow4, f21, fLog * ((float) Math.cos(d2)), fLog * ((float) Math.sin(d2)));
    }

    /* JADX INFO: renamed from: b */
    public static C0351I6 m753b(float f, float f2, float f3) {
        C0917VE c0917ve = C0917VE.f2864k;
        float f4 = c0917ve.f2868d;
        Math.sqrt(((double) f) / 100.0d);
        float f5 = c0917ve.f2865a + 4.0f;
        float f6 = c0917ve.f2873i * f2;
        Math.sqrt(((f2 / ((float) Math.sqrt(r1))) * c0917ve.f2868d) / f5);
        float f7 = (1.7f * f) / ((0.007f * f) + 1.0f);
        float fLog = ((float) Math.log((((double) f6) * 0.0228d) + 1.0d)) * 43.85965f;
        double d = (3.1415927f * f3) / 180.0f;
        return new C0351I6(f3, f2, f, f7, fLog * ((float) Math.cos(d)), fLog * ((float) Math.sin(d)));
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m754c(C0917VE c0917ve) {
        float fSqrt;
        float f = this.f1179b;
        double d = f;
        float f2 = this.f1180c;
        if (d != 0.0d) {
            double d2 = f2;
            fSqrt = d2 == 0.0d ? 0.0f : f / ((float) Math.sqrt(d2 / 100.0d));
        }
        float f3 = c0917ve.f2870f;
        float f4 = c0917ve.f2872h;
        float fPow = (float) Math.pow(((double) fSqrt) / Math.pow(1.64d - Math.pow(0.29d, f3), 0.73d), 1.1111111111111112d);
        double d3 = (this.f1178a * 3.1415927f) / 180.0f;
        float fCos = ((float) (Math.cos(2.0d + d3) + 3.8d)) * 0.25f;
        float fPow2 = c0917ve.f2865a * ((float) Math.pow(((double) f2) / 100.0d, (1.0d / ((double) c0917ve.f2868d)) / ((double) c0917ve.f2874j)));
        float f5 = fCos * 3846.1538f * c0917ve.f2869e * c0917ve.f2867c;
        float f6 = fPow2 / c0917ve.f2866b;
        float fSin = (float) Math.sin(d3);
        float fCos2 = (float) Math.cos(d3);
        float f7 = (((0.305f + f6) * 23.0f) * fPow) / (((fPow * 108.0f) * fSin) + (((11.0f * fPow) * fCos2) + (f5 * 23.0f)));
        float f8 = fCos2 * f7;
        float f9 = f7 * fSin;
        float f10 = f6 * 460.0f;
        float f11 = ((288.0f * f9) + ((451.0f * f8) + f10)) / 1403.0f;
        float f12 = ((f10 - (891.0f * f8)) - (261.0f * f9)) / 1403.0f;
        float f13 = ((f10 - (f8 * 220.0f)) - (f9 * 6300.0f)) / 1403.0f;
        float f14 = 100.0f / f4;
        float fSignum = Math.signum(f11) * f14 * ((float) Math.pow((float) Math.max(0.0d, (((double) Math.abs(f11)) * 27.13d) / (400.0d - ((double) Math.abs(f11)))), 2.380952380952381d));
        float fSignum2 = Math.signum(f12) * f14 * ((float) Math.pow((float) Math.max(0.0d, (((double) Math.abs(f12)) * 27.13d) / (400.0d - ((double) Math.abs(f12)))), 2.380952380952381d));
        float fSignum3 = Math.signum(f13) * f14 * ((float) Math.pow((float) Math.max(0.0d, (((double) Math.abs(f13)) * 27.13d) / (400.0d - ((double) Math.abs(f13)))), 2.380952380952381d));
        float[] fArr = c0917ve.f2871g;
        float f15 = fSignum / fArr[0];
        float f16 = fSignum2 / fArr[1];
        float f17 = fSignum3 / fArr[2];
        float[][] fArr2 = AbstractC0628Oj.f2008b;
        float[] fArr3 = fArr2[0];
        float f18 = (fArr3[2] * f17) + (fArr3[1] * f16) + (fArr3[0] * f15);
        float[] fArr4 = fArr2[1];
        float f19 = (fArr4[2] * f17) + (fArr4[1] * f16) + (fArr4[0] * f15);
        float[] fArr5 = fArr2[2];
        return AbstractC2797za.m5363a(f18, f19, (f17 * fArr5[2]) + (f16 * fArr5[1]) + (f15 * fArr5[0]));
    }
}
