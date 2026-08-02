package p000;

import android.graphics.Color;

/* JADX INFO: renamed from: fp */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0211fp {

    /* JADX INFO: renamed from: a */
    public final float f3086a;

    /* JADX INFO: renamed from: b */
    public final float f3087b;

    /* JADX INFO: renamed from: c */
    public final float f3088c;

    /* JADX INFO: renamed from: d */
    public final float f3089d;

    /* JADX INFO: renamed from: e */
    public final float f3090e;

    /* JADX INFO: renamed from: f */
    public final float f3091f;

    public /* synthetic */ C0211fp(float f, float f2, float f3, float f4, float f5, float f6) {
        this.f3086a = f;
        this.f3087b = f2;
        this.f3088c = f3;
        this.f3089d = f4;
        this.f3090e = f5;
        this.f3091f = f6;
    }

    /* JADX INFO: renamed from: a */
    public static C0211fp m1708a(int i) {
        ub3 ub3Var = ub3.f11214k;
        float fM6102T = xe1.m6102T(Color.red(i));
        float fM6102T2 = xe1.m6102T(Color.green(i));
        float fM6102T3 = xe1.m6102T(Color.blue(i));
        float[][] fArr = xe1.f12995d;
        float[] fArr2 = fArr[0];
        float f = (fArr2[2] * fM6102T3) + (fArr2[1] * fM6102T2) + (fArr2[0] * fM6102T);
        float[] fArr3 = fArr[1];
        float f2 = (fArr3[2] * fM6102T3) + (fArr3[1] * fM6102T2) + (fArr3[0] * fM6102T);
        float[] fArr4 = fArr[2];
        float f3 = (fM6102T3 * fArr4[2]) + (fM6102T2 * fArr4[1]) + (fM6102T * fArr4[0]);
        float[][] fArr5 = xe1.f12992a;
        float[] fArr6 = fArr5[0];
        float f4 = (fArr6[2] * f3) + (fArr6[1] * f2) + (fArr6[0] * f);
        float[] fArr7 = fArr5[1];
        float f5 = (fArr7[2] * f3) + (fArr7[1] * f2) + (fArr7[0] * f);
        float[] fArr8 = fArr5[2];
        float f6 = (f3 * fArr8[2]) + (f2 * fArr8[1]) + (f * fArr8[0]);
        float[] fArr9 = ub3Var.f11221g;
        float f7 = ub3Var.f11223i;
        float f8 = ub3Var.f11218d;
        float f9 = ub3Var.f11215a;
        float f10 = fArr9[0] * f4;
        float f11 = fArr9[1] * f5;
        float f12 = fArr9[2] * f6;
        float f13 = ub3Var.f11222h;
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
        float fPow4 = ((float) Math.pow((f18 * ub3Var.f11216b) / f9, ub3Var.f11224j * f8)) * 100.0f;
        Math.sqrt(fPow4 / 100.0f);
        float f20 = f9 + 4.0f;
        float fPow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, ub3Var.f11220f), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos(((((double) (((double) fAtan2) < 20.14d ? 360.0f + fAtan2 : fAtan2)) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * ub3Var.f11219e) * ub3Var.f11217c) * ((float) Math.sqrt((f15 * f15) + (f14 * f14)))) / (f17 + 0.305f), 0.9d)) * ((float) Math.sqrt(((double) fPow4) / 100.0d));
        Math.sqrt((r0 * f8) / f20);
        float f21 = (1.7f * fPow4) / ((0.007f * fPow4) + 1.0f);
        float fLog = ((float) Math.log((f7 * fPow5 * 0.0228f) + 1.0f)) * 43.85965f;
        double d2 = f19;
        return new C0211fp(fAtan2, fPow5, fPow4, f21, fLog * ((float) Math.cos(d2)), fLog * ((float) Math.sin(d2)));
    }

    /* JADX INFO: renamed from: b */
    public static C0211fp m1709b(float f, float f2, float f3) {
        ub3 ub3Var = ub3.f11214k;
        float f4 = ub3Var.f11218d;
        Math.sqrt(((double) f) / 100.0d);
        float f5 = ub3Var.f11215a + 4.0f;
        float f6 = ub3Var.f11223i * f2;
        Math.sqrt(((f2 / ((float) Math.sqrt(r1))) * ub3Var.f11218d) / f5);
        float f7 = (1.7f * f) / ((0.007f * f) + 1.0f);
        float fLog = ((float) Math.log((((double) f6) * 0.0228d) + 1.0d)) * 43.85965f;
        double d = (3.1415927f * f3) / 180.0f;
        return new C0211fp(f3, f2, f, f7, fLog * ((float) Math.cos(d)), fLog * ((float) Math.sin(d)));
    }

    /* JADX INFO: renamed from: c */
    public int m1710c(um0 um0Var) {
        float f = this.f3087b;
        float fSqrt = (f == 0.0f || this.f3088c == 0.0f) ? 0.0f : f / ((float) Math.sqrt(r3 / 100.0f));
        float f2 = um0Var.f11362a;
        float f3 = um0Var.f11369h;
        float fPow = fSqrt / ((float) Math.pow(1.64f - ((float) Math.pow((float) Math.pow(0.28999999165534973d, f2), 0.7300000190734863d)), 1.1111111640930176d));
        float f4 = (this.f3086a * 3.1415927f) / 180.0f;
        float fCos = (((float) Math.cos(2.0f + f4)) + 3.8f) * 0.25f;
        float fPow2 = um0Var.f11363b * ((float) Math.pow(r3 / 100.0f, (1.0f / um0Var.f11366e) / um0Var.f11371j));
        float f5 = fCos * 3846.1538f * um0Var.f11367f * um0Var.f11365d;
        float f6 = fPow2 / um0Var.f11364c;
        double d = f4;
        float fSin = (float) Math.sin(d);
        float fCos2 = (float) Math.cos(d);
        float f7 = (((0.305f + f6) * 23.0f) * fPow) / (((fPow * 108.0f) * fSin) + (((11.0f * fPow) * fCos2) + (f5 * 23.0f)));
        float f8 = fCos2 * f7;
        float f9 = f7 * fSin;
        float f10 = f6 * 460.0f;
        float f11 = ((288.0f * f9) + ((451.0f * f8) + f10)) / 1403.0f;
        float f12 = ((f10 - (891.0f * f8)) - (261.0f * f9)) / 1403.0f;
        float f13 = 100.0f / f3;
        float fSignum = Math.signum(f11) * f13 * ((float) Math.pow(Math.max(0.0f, (Math.abs(f11) * 27.13f) / (400.0f - Math.abs(f11))), 2.3809523582458496d));
        float fSignum2 = Math.signum(f12) * f13 * ((float) Math.pow(Math.max(0.0f, (Math.abs(f12) * 27.13f) / (400.0f - Math.abs(f12))), 2.3809523582458496d));
        float fSignum3 = Math.signum(((f10 - (f8 * 220.0f)) - (f9 * 6300.0f)) / 1403.0f) * f13 * ((float) Math.pow(Math.max(0.0f, (Math.abs(r6) * 27.13f) / (400.0f - Math.abs(r6))), 2.3809523582458496d));
        float[] fArr = um0Var.f11368g;
        float f14 = fSignum / fArr[0];
        float f15 = fSignum2 / fArr[1];
        float f16 = fSignum3 / fArr[2];
        float[][] fArr2 = rg3.f9560b;
        float[] fArr3 = fArr2[0];
        float f17 = (fArr3[2] * f16) + (fArr3[1] * f15) + (fArr3[0] * f14);
        float[] fArr4 = fArr2[1];
        float f18 = (fArr4[2] * f16) + (fArr4[1] * f15) + (fArr4[0] * f14);
        float[] fArr5 = fArr2[2];
        return AbstractC0899xu.m6181a(f17, f18, (f16 * fArr5[2]) + (f15 * fArr5[1]) + (f14 * fArr5[0]));
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int m1711d(ub3 ub3Var) {
        float fSqrt;
        float f = this.f3087b;
        double d = f;
        float f2 = this.f3088c;
        if (d != 0.0d) {
            double d2 = f2;
            fSqrt = d2 == 0.0d ? 0.0f : f / ((float) Math.sqrt(d2 / 100.0d));
        }
        float f3 = ub3Var.f11220f;
        float f4 = ub3Var.f11222h;
        float fPow = (float) Math.pow(((double) fSqrt) / Math.pow(1.64d - Math.pow(0.29d, f3), 0.73d), 1.1111111111111112d);
        double d3 = (this.f3086a * 3.1415927f) / 180.0f;
        float fCos = ((float) (Math.cos(2.0d + d3) + 3.8d)) * 0.25f;
        float fPow2 = ub3Var.f11215a * ((float) Math.pow(((double) f2) / 100.0d, (1.0d / ((double) ub3Var.f11218d)) / ((double) ub3Var.f11224j)));
        float f5 = fCos * 3846.1538f * ub3Var.f11219e * ub3Var.f11217c;
        float f6 = fPow2 / ub3Var.f11216b;
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
        float[] fArr = ub3Var.f11221g;
        float f15 = fSignum / fArr[0];
        float f16 = fSignum2 / fArr[1];
        float f17 = fSignum3 / fArr[2];
        float[][] fArr2 = xe1.f12993b;
        float[] fArr3 = fArr2[0];
        float f18 = (fArr3[2] * f17) + (fArr3[1] * f16) + (fArr3[0] * f15);
        float[] fArr4 = fArr2[1];
        float f19 = (fArr4[2] * f17) + (fArr4[1] * f16) + (fArr4[0] * f15);
        float[] fArr5 = fArr2[2];
        return AbstractC0899xu.m6181a(f18, f19, (f17 * fArr5[2]) + (f16 * fArr5[1]) + (f15 * fArr5[0]));
    }
}
