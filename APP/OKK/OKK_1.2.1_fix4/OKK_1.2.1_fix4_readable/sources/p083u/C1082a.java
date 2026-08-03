package p083u;

import android.graphics.Color;
import p085v.AbstractC1100a;

/* JADX INFO: renamed from: u.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1082a {

    /* JADX INFO: renamed from: a */
    public final float f4183a;

    /* JADX INFO: renamed from: b */
    public final float f4184b;

    /* JADX INFO: renamed from: c */
    public final float f4185c;

    /* JADX INFO: renamed from: d */
    public final float f4186d;

    /* JADX INFO: renamed from: e */
    public final float f4187e;

    /* JADX INFO: renamed from: f */
    public final float f4188f;

    public C1082a(float f2, float f3, float f4, float f5, float f6, float f7) {
        this.f4183a = f2;
        this.f4184b = f3;
        this.f4185c = f4;
        this.f4186d = f5;
        this.f4187e = f6;
        this.f4188f = f7;
    }

    /* JADX INFO: renamed from: a */
    public static C1082a m2565a(int i2) {
        C1095n c1095n = C1095n.f4213k;
        float fM2571e = AbstractC1083b.m2571e(Color.red(i2));
        float fM2571e2 = AbstractC1083b.m2571e(Color.green(i2));
        float fM2571e3 = AbstractC1083b.m2571e(Color.blue(i2));
        float[][] fArr = AbstractC1083b.f4192d;
        float[] fArr2 = fArr[0];
        float f2 = (fArr2[2] * fM2571e3) + (fArr2[1] * fM2571e2) + (fArr2[0] * fM2571e);
        float[] fArr3 = fArr[1];
        float f3 = (fArr3[2] * fM2571e3) + (fArr3[1] * fM2571e2) + (fArr3[0] * fM2571e);
        float[] fArr4 = fArr[2];
        float f4 = (fM2571e3 * fArr4[2]) + (fM2571e2 * fArr4[1]) + (fM2571e * fArr4[0]);
        float[][] fArr5 = AbstractC1083b.f4189a;
        float[] fArr6 = fArr5[0];
        float f5 = (fArr6[2] * f4) + (fArr6[1] * f3) + (fArr6[0] * f2);
        float[] fArr7 = fArr5[1];
        float f6 = (fArr7[2] * f4) + (fArr7[1] * f3) + (fArr7[0] * f2);
        float[] fArr8 = fArr5[2];
        float f7 = (f4 * fArr8[2]) + (f3 * fArr8[1]) + (f2 * fArr8[0]);
        float[] fArr9 = c1095n.f4220g;
        float f8 = fArr9[0] * f5;
        float f9 = fArr9[1] * f6;
        float f10 = fArr9[2] * f7;
        float fAbs = Math.abs(f8);
        float f11 = c1095n.f4221h;
        float fPow = (float) Math.pow(((double) (fAbs * f11)) / 100.0d, 0.42d);
        float fPow2 = (float) Math.pow(((double) (Math.abs(f9) * f11)) / 100.0d, 0.42d);
        float fPow3 = (float) Math.pow(((double) (Math.abs(f10) * f11)) / 100.0d, 0.42d);
        float fSignum = ((Math.signum(f8) * 400.0f) * fPow) / (fPow + 27.13f);
        float fSignum2 = ((Math.signum(f9) * 400.0f) * fPow2) / (fPow2 + 27.13f);
        float fSignum3 = ((Math.signum(f10) * 400.0f) * fPow3) / (fPow3 + 27.13f);
        double d2 = fSignum3;
        float f12 = ((float) (((((double) fSignum2) * (-12.0d)) + (((double) fSignum) * 11.0d)) + d2)) / 11.0f;
        float f13 = ((float) (((double) (fSignum + fSignum2)) - (d2 * 2.0d))) / 9.0f;
        float f14 = fSignum2 * 20.0f;
        float f15 = ((21.0f * fSignum3) + ((fSignum * 20.0f) + f14)) / 20.0f;
        float f16 = (((fSignum * 40.0f) + f14) + fSignum3) / 20.0f;
        float fAtan2 = (((float) Math.atan2(f13, f12)) * 180.0f) / 3.1415927f;
        if (fAtan2 < 0.0f) {
            fAtan2 += 360.0f;
        } else if (fAtan2 >= 360.0f) {
            fAtan2 -= 360.0f;
        }
        float f17 = fAtan2;
        float f18 = (3.1415927f * f17) / 180.0f;
        float f19 = f16 * c1095n.f4215b;
        float f20 = c1095n.f4214a;
        float f21 = c1095n.f4217d;
        float fPow4 = ((float) Math.pow(f19 / f20, c1095n.f4223j * f21)) * 100.0f;
        Math.sqrt(fPow4 / 100.0f);
        float f22 = f20 + 4.0f;
        float fPow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, c1095n.f4219f), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos(((((double) (((double) f17) < 20.14d ? 360.0f + f17 : f17)) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * c1095n.f4218e) * c1095n.f4216c) * ((float) Math.sqrt((f13 * f13) + (f12 * f12)))) / (f15 + 0.305f), 0.9d)) * ((float) Math.sqrt(((double) fPow4) / 100.0d));
        float f23 = c1095n.f4222i * fPow5;
        Math.sqrt((r3 * f21) / f22);
        float f24 = (1.7f * fPow4) / ((0.007f * fPow4) + 1.0f);
        float fLog = ((float) Math.log((f23 * 0.0228f) + 1.0f)) * 43.85965f;
        double d3 = f18;
        return new C1082a(f17, fPow5, fPow4, f24, fLog * ((float) Math.cos(d3)), fLog * ((float) Math.sin(d3)));
    }

    /* JADX INFO: renamed from: b */
    public static C1082a m2566b(float f2, float f3, float f4) {
        C1095n c1095n = C1095n.f4213k;
        float f5 = c1095n.f4217d;
        Math.sqrt(((double) f2) / 100.0d);
        float f6 = c1095n.f4214a + 4.0f;
        float f7 = c1095n.f4222i * f3;
        Math.sqrt(((f3 / ((float) Math.sqrt(r1))) * c1095n.f4217d) / f6);
        float f8 = (1.7f * f2) / ((0.007f * f2) + 1.0f);
        float fLog = ((float) Math.log((((double) f7) * 0.0228d) + 1.0d)) * 43.85965f;
        double d2 = (3.1415927f * f4) / 180.0f;
        return new C1082a(f4, f3, f2, f8, fLog * ((float) Math.cos(d2)), fLog * ((float) Math.sin(d2)));
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m2567c(C1095n c1095n) {
        float fSqrt;
        float f2 = this.f4184b;
        double d2 = f2;
        float f3 = this.f4185c;
        if (d2 != 0.0d) {
            double d3 = f3;
            fSqrt = d3 == 0.0d ? 0.0f : f2 / ((float) Math.sqrt(d3 / 100.0d));
        }
        float fPow = (float) Math.pow(((double) fSqrt) / Math.pow(1.64d - Math.pow(0.29d, c1095n.f4219f), 0.73d), 1.1111111111111112d);
        double d4 = (this.f4183a * 3.1415927f) / 180.0f;
        float fCos = ((float) (Math.cos(2.0d + d4) + 3.8d)) * 0.25f;
        float fPow2 = c1095n.f4214a * ((float) Math.pow(((double) f3) / 100.0d, (1.0d / ((double) c1095n.f4217d)) / ((double) c1095n.f4223j)));
        float f4 = fCos * 3846.1538f * c1095n.f4218e * c1095n.f4216c;
        float f5 = fPow2 / c1095n.f4215b;
        float fSin = (float) Math.sin(d4);
        float fCos2 = (float) Math.cos(d4);
        float f6 = (((0.305f + f5) * 23.0f) * fPow) / (((fPow * 108.0f) * fSin) + (((11.0f * fPow) * fCos2) + (f4 * 23.0f)));
        float f7 = fCos2 * f6;
        float f8 = f6 * fSin;
        float f9 = f5 * 460.0f;
        float f10 = ((288.0f * f8) + ((451.0f * f7) + f9)) / 1403.0f;
        float f11 = ((f9 - (891.0f * f7)) - (261.0f * f8)) / 1403.0f;
        float f12 = ((f9 - (f7 * 220.0f)) - (f8 * 6300.0f)) / 1403.0f;
        float fMax = (float) Math.max(0.0d, (((double) Math.abs(f10)) * 27.13d) / (400.0d - ((double) Math.abs(f10))));
        float fSignum = Math.signum(f10);
        float f13 = 100.0f / c1095n.f4221h;
        float fPow3 = fSignum * f13 * ((float) Math.pow(fMax, 2.380952380952381d));
        float fSignum2 = Math.signum(f11) * f13 * ((float) Math.pow((float) Math.max(0.0d, (((double) Math.abs(f11)) * 27.13d) / (400.0d - ((double) Math.abs(f11)))), 2.380952380952381d));
        float fSignum3 = Math.signum(f12) * f13 * ((float) Math.pow((float) Math.max(0.0d, (((double) Math.abs(f12)) * 27.13d) / (400.0d - ((double) Math.abs(f12)))), 2.380952380952381d));
        float[] fArr = c1095n.f4220g;
        float f14 = fPow3 / fArr[0];
        float f15 = fSignum2 / fArr[1];
        float f16 = fSignum3 / fArr[2];
        float[][] fArr2 = AbstractC1083b.f4190b;
        float[] fArr3 = fArr2[0];
        float f17 = (fArr3[2] * f16) + (fArr3[1] * f15) + (fArr3[0] * f14);
        float[] fArr4 = fArr2[1];
        float f18 = (fArr4[2] * f16) + (fArr4[1] * f15) + (fArr4[0] * f14);
        float[] fArr5 = fArr2[2];
        return AbstractC1100a.m2592a(f17, f18, (f16 * fArr5[2]) + (f15 * fArr5[1]) + (f14 * fArr5[0]));
    }
}
