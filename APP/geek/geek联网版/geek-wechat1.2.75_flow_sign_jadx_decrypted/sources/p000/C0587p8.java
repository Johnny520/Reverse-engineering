package p000;

import android.graphics.Color;

/* JADX INFO: renamed from: p8 */
/* JADX INFO: loaded from: classes.dex */
public final class C0587p8 {

    /* JADX INFO: renamed from: a */
    public final float f3609a;

    /* JADX INFO: renamed from: b */
    public final float f3610b;

    /* JADX INFO: renamed from: c */
    public final float f3611c;

    /* JADX INFO: renamed from: d */
    public final float f3612d;

    /* JADX INFO: renamed from: e */
    public final float f3613e;

    /* JADX INFO: renamed from: f */
    public final float f3614f;

    public C0587p8(float f, float f2, float f3, float f4, float f5, float f6) {
        this.f3609a = f;
        this.f3610b = f2;
        this.f3611c = f3;
        this.f3612d = f4;
        this.f3613e = f5;
        this.f3614f = f6;
    }

    /* JADX INFO: renamed from: a */
    public static C0587p8 m2075a(int i) {
        lb0 lb0Var = lb0.f2979k;
        float fM1229F = AbstractC0259gf.m1229F(Color.red(i));
        float fM1229F2 = AbstractC0259gf.m1229F(Color.green(i));
        float fM1229F3 = AbstractC0259gf.m1229F(Color.blue(i));
        float[][] fArr = AbstractC0259gf.f1965j;
        float[] fArr2 = fArr[0];
        float f = (fArr2[2] * fM1229F3) + (fArr2[1] * fM1229F2) + (fArr2[0] * fM1229F);
        float[] fArr3 = fArr[1];
        float f2 = (fArr3[2] * fM1229F3) + (fArr3[1] * fM1229F2) + (fArr3[0] * fM1229F);
        float[] fArr4 = fArr[2];
        float[] fArr5 = {f, f2, (fM1229F3 * fArr4[2]) + (fM1229F2 * fArr4[1]) + (fM1229F * fArr4[0])};
        float[][] fArr6 = AbstractC0259gf.f1962g;
        float f3 = fArr5[0];
        float[] fArr7 = fArr6[0];
        float f4 = fArr7[0] * f3;
        float f5 = fArr5[1];
        float f6 = (fArr7[1] * f5) + f4;
        float f7 = fArr5[2];
        float f8 = (fArr7[2] * f7) + f6;
        float[] fArr8 = fArr6[1];
        float f9 = (fArr8[2] * f7) + (fArr8[1] * f5) + (fArr8[0] * f3);
        float[] fArr9 = fArr6[2];
        float f10 = (f7 * fArr9[2]) + (f5 * fArr9[1]) + (f3 * fArr9[0]);
        float[] fArr10 = lb0Var.f2986g;
        float f11 = lb0Var.f2988i;
        float f12 = lb0Var.f2983d;
        float f13 = lb0Var.f2980a;
        float f14 = fArr10[0] * f8;
        float f15 = fArr10[1] * f9;
        float f16 = fArr10[2] * f10;
        float f17 = lb0Var.f2987h;
        float fPow = (float) Math.pow(((double) (Math.abs(f14) * f17)) / 100.0d, 0.42d);
        float fPow2 = (float) Math.pow(((double) (Math.abs(f15) * f17)) / 100.0d, 0.42d);
        float fPow3 = (float) Math.pow(((double) (Math.abs(f16) * f17)) / 100.0d, 0.42d);
        float fSignum = ((Math.signum(f14) * 400.0f) * fPow) / (fPow + 27.13f);
        float fSignum2 = ((Math.signum(f15) * 400.0f) * fPow2) / (fPow2 + 27.13f);
        float fSignum3 = ((Math.signum(f16) * 400.0f) * fPow3) / (fPow3 + 27.13f);
        double d = fSignum3;
        float f18 = ((float) (((((double) fSignum2) * (-12.0d)) + (((double) fSignum) * 11.0d)) + d)) / 11.0f;
        float f19 = ((float) (((double) (fSignum + fSignum2)) - (d * 2.0d))) / 9.0f;
        float f20 = fSignum2 * 20.0f;
        float f21 = ((21.0f * fSignum3) + ((fSignum * 20.0f) + f20)) / 20.0f;
        float f22 = (((fSignum * 40.0f) + f20) + fSignum3) / 20.0f;
        float fAtan2 = (((float) Math.atan2(f19, f18)) * 180.0f) / 3.1415927f;
        if (fAtan2 < 0.0f) {
            fAtan2 += 360.0f;
        } else if (fAtan2 >= 360.0f) {
            fAtan2 -= 360.0f;
        }
        float f23 = (3.1415927f * fAtan2) / 180.0f;
        float fPow4 = ((float) Math.pow((f22 * lb0Var.f2981b) / f13, lb0Var.f2989j * f12)) * 100.0f;
        Math.sqrt(fPow4 / 100.0f);
        float f24 = f13 + 4.0f;
        float fPow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, lb0Var.f2985f), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos(((((double) (((double) fAtan2) < 20.14d ? 360.0f + fAtan2 : fAtan2)) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * lb0Var.f2984e) * lb0Var.f2982c) * ((float) Math.sqrt((f19 * f19) + (f18 * f18)))) / (f21 + 0.305f), 0.9d)) * ((float) Math.sqrt(((double) fPow4) / 100.0d));
        Math.sqrt((r0 * f12) / f24);
        float f25 = (1.7f * fPow4) / ((0.007f * fPow4) + 1.0f);
        float fLog = ((float) Math.log((f11 * fPow5 * 0.0228f) + 1.0f)) * 43.85965f;
        double d2 = f23;
        return new C0587p8(fAtan2, fPow5, fPow4, f25, fLog * ((float) Math.cos(d2)), fLog * ((float) Math.sin(d2)));
    }

    /* JADX INFO: renamed from: b */
    public static C0587p8 m2076b(float f, float f2, float f3) {
        lb0 lb0Var = lb0.f2979k;
        float f4 = lb0Var.f2983d;
        Math.sqrt(((double) f) / 100.0d);
        float f5 = lb0Var.f2980a + 4.0f;
        float f6 = lb0Var.f2988i * f2;
        Math.sqrt(((f2 / ((float) Math.sqrt(r1))) * lb0Var.f2983d) / f5);
        float f7 = (1.7f * f) / ((0.007f * f) + 1.0f);
        float fLog = ((float) Math.log((((double) f6) * 0.0228d) + 1.0d)) * 43.85965f;
        double d = (3.1415927f * f3) / 180.0f;
        return new C0587p8(f3, f2, f, f7, fLog * ((float) Math.cos(d)), fLog * ((float) Math.sin(d)));
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int m2077c(p000.lb0 r20) {
        /*
            Method dump skipped, instruction units count: 388
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0587p8.m2077c(lb0):int");
    }
}
