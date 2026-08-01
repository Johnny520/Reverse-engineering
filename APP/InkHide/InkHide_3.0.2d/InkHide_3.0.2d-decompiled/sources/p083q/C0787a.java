package p083q;

import android.graphics.Color;
import p085r.AbstractC0809a;

/* JADX INFO: renamed from: q.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0787a {

    /* JADX INFO: renamed from: a */
    public final float f2624a;

    /* JADX INFO: renamed from: b */
    public final float f2625b;

    /* JADX INFO: renamed from: c */
    public final float f2626c;

    /* JADX INFO: renamed from: d */
    public final float f2627d;

    /* JADX INFO: renamed from: e */
    public final float f2628e;

    /* JADX INFO: renamed from: f */
    public final float f2629f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0787a(float f, float f2, float f3, float f4, float f5, float f6) {
        this.f2624a = f;
        this.f2625b = f2;
        this.f2626c = f3;
        this.f2627d = f4;
        this.f2628e = f5;
        this.f2629f = f6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static C0787a m1454a(int i2) {
        C0800n c0800n = C0800n.f2657k;
        float fM1458b = AbstractC0788b.m1458b(Color.red(i2));
        float fM1458b2 = AbstractC0788b.m1458b(Color.green(i2));
        float fM1458b3 = AbstractC0788b.m1458b(Color.blue(i2));
        float[][] fArr = AbstractC0788b.f2633d;
        float[] fArr2 = fArr[0];
        float f = (fArr2[2] * fM1458b3) + (fArr2[1] * fM1458b2) + (fArr2[0] * fM1458b);
        float[] fArr3 = fArr[1];
        float f2 = (fArr3[2] * fM1458b3) + (fArr3[1] * fM1458b2) + (fArr3[0] * fM1458b);
        float[] fArr4 = fArr[2];
        float f3 = (fM1458b3 * fArr4[2]) + (fM1458b2 * fArr4[1]) + (fM1458b * fArr4[0]);
        float[][] fArr5 = AbstractC0788b.f2630a;
        float[] fArr6 = fArr5[0];
        float f4 = (fArr6[2] * f3) + (fArr6[1] * f2) + (fArr6[0] * f);
        float[] fArr7 = fArr5[1];
        float f5 = (fArr7[2] * f3) + (fArr7[1] * f2) + (fArr7[0] * f);
        float[] fArr8 = fArr5[2];
        float f6 = (f3 * fArr8[2]) + (f2 * fArr8[1]) + (f * fArr8[0]);
        float[] fArr9 = c0800n.f2664g;
        float f7 = fArr9[0] * f4;
        float f8 = fArr9[1] * f5;
        float f9 = fArr9[2] * f6;
        float fAbs = Math.abs(f7);
        float f10 = c0800n.f2665h;
        float fPow = (float) Math.pow(((double) (fAbs * f10)) / 100.0d, 0.42d);
        float fPow2 = (float) Math.pow(((double) (Math.abs(f8) * f10)) / 100.0d, 0.42d);
        float fPow3 = (float) Math.pow(((double) (Math.abs(f9) * f10)) / 100.0d, 0.42d);
        float fSignum = ((Math.signum(f7) * 400.0f) * fPow) / (fPow + 27.13f);
        float fSignum2 = ((Math.signum(f8) * 400.0f) * fPow2) / (fPow2 + 27.13f);
        float fSignum3 = ((Math.signum(f9) * 400.0f) * fPow3) / (fPow3 + 27.13f);
        double d2 = fSignum3;
        float f11 = ((float) (((((double) fSignum2) * (-12.0d)) + (((double) fSignum) * 11.0d)) + d2)) / 11.0f;
        float f12 = ((float) (((double) (fSignum + fSignum2)) - (d2 * 2.0d))) / 9.0f;
        float f13 = fSignum2 * 20.0f;
        float f14 = ((21.0f * fSignum3) + ((fSignum * 20.0f) + f13)) / 20.0f;
        float f15 = (((fSignum * 40.0f) + f13) + fSignum3) / 20.0f;
        float fAtan2 = (((float) Math.atan2(f12, f11)) * 180.0f) / 3.1415927f;
        if (fAtan2 < 0.0f) {
            fAtan2 += 360.0f;
        } else if (fAtan2 >= 360.0f) {
            fAtan2 -= 360.0f;
        }
        float f16 = fAtan2;
        float f17 = (3.1415927f * f16) / 180.0f;
        float f18 = f15 * c0800n.f2659b;
        float f19 = c0800n.f2658a;
        float f20 = c0800n.f2661d;
        float fPow4 = ((float) Math.pow(f18 / f19, c0800n.f2667j * f20)) * 100.0f;
        Math.sqrt(fPow4 / 100.0f);
        float f21 = f19 + 4.0f;
        float fPow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, c0800n.f2663f), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos(((((double) (((double) f16) < 20.14d ? f16 + 360.0f : f16)) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * c0800n.f2662e) * c0800n.f2660c) * ((float) Math.sqrt((f12 * f12) + (f11 * f11)))) / (f14 + 0.305f), 0.9d)) * ((float) Math.sqrt(((double) fPow4) / 100.0d));
        float f22 = c0800n.f2666i * fPow5;
        Math.sqrt((r3 * f20) / f21);
        float f23 = (1.7f * fPow4) / ((0.007f * fPow4) + 1.0f);
        float fLog = ((float) Math.log((f22 * 0.0228f) + 1.0f)) * 43.85965f;
        double d3 = f17;
        return new C0787a(f16, fPow5, fPow4, f23, fLog * ((float) Math.cos(d3)), fLog * ((float) Math.sin(d3)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static C0787a m1455b(float f, float f2, float f3) {
        C0800n c0800n = C0800n.f2657k;
        float f4 = c0800n.f2661d;
        Math.sqrt(((double) f) / 100.0d);
        float f5 = c0800n.f2658a + 4.0f;
        float f6 = c0800n.f2666i * f2;
        Math.sqrt(((f2 / ((float) Math.sqrt(r1))) * c0800n.f2661d) / f5);
        float f7 = (1.7f * f) / ((0.007f * f) + 1.0f);
        float fLog = ((float) Math.log((((double) f6) * 0.0228d) + 1.0d)) * 43.85965f;
        double d2 = (3.1415927f * f3) / 180.0f;
        return new C0787a(f3, f2, f, f7, fLog * ((float) Math.cos(d2)), fLog * ((float) Math.sin(d2)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m1456c(C0800n c0800n) {
        float fSqrt;
        float f = this.f2625b;
        double d2 = f;
        float f2 = this.f2626c;
        if (d2 != 0.0d) {
            double d3 = f2;
            fSqrt = d3 == 0.0d ? 0.0f : f / ((float) Math.sqrt(d3 / 100.0d));
        }
        float fPow = (float) Math.pow(((double) fSqrt) / Math.pow(1.64d - Math.pow(0.29d, c0800n.f2663f), 0.73d), 1.1111111111111112d);
        double d4 = (this.f2624a * 3.1415927f) / 180.0f;
        float fCos = ((float) (Math.cos(2.0d + d4) + 3.8d)) * 0.25f;
        float fPow2 = c0800n.f2658a * ((float) Math.pow(((double) f2) / 100.0d, (1.0d / ((double) c0800n.f2661d)) / ((double) c0800n.f2667j)));
        float f3 = fCos * 3846.1538f * c0800n.f2662e * c0800n.f2660c;
        float f4 = fPow2 / c0800n.f2659b;
        float fSin = (float) Math.sin(d4);
        float fCos2 = (float) Math.cos(d4);
        float f5 = (((0.305f + f4) * 23.0f) * fPow) / (((fPow * 108.0f) * fSin) + (((11.0f * fPow) * fCos2) + (f3 * 23.0f)));
        float f6 = fCos2 * f5;
        float f7 = f5 * fSin;
        float f8 = f4 * 460.0f;
        float f9 = ((288.0f * f7) + ((451.0f * f6) + f8)) / 1403.0f;
        float f10 = ((f8 - (891.0f * f6)) - (261.0f * f7)) / 1403.0f;
        float f11 = ((f8 - (f6 * 220.0f)) - (f7 * 6300.0f)) / 1403.0f;
        float fMax = (float) Math.max(0.0d, (((double) Math.abs(f9)) * 27.13d) / (400.0d - ((double) Math.abs(f9))));
        float fSignum = Math.signum(f9);
        float f12 = 100.0f / c0800n.f2665h;
        float fPow3 = fSignum * f12 * ((float) Math.pow(fMax, 2.380952380952381d));
        float fSignum2 = Math.signum(f10) * f12 * ((float) Math.pow((float) Math.max(0.0d, (((double) Math.abs(f10)) * 27.13d) / (400.0d - ((double) Math.abs(f10)))), 2.380952380952381d));
        float fSignum3 = Math.signum(f11) * f12 * ((float) Math.pow((float) Math.max(0.0d, (((double) Math.abs(f11)) * 27.13d) / (400.0d - ((double) Math.abs(f11)))), 2.380952380952381d));
        float[] fArr = c0800n.f2664g;
        float f13 = fPow3 / fArr[0];
        float f14 = fSignum2 / fArr[1];
        float f15 = fSignum3 / fArr[2];
        float[][] fArr2 = AbstractC0788b.f2631b;
        float[] fArr3 = fArr2[0];
        float f16 = (fArr3[2] * f15) + (fArr3[1] * f14) + (fArr3[0] * f13);
        float[] fArr4 = fArr2[1];
        float f17 = (fArr4[2] * f15) + (fArr4[1] * f14) + (fArr4[0] * f13);
        float[] fArr5 = fArr2[2];
        return AbstractC0809a.m1475a(f16, f17, (f15 * fArr5[2]) + (f14 * fArr5[1]) + (f13 * fArr5[0]));
    }
}
