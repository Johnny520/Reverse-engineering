package p086R;

import android.graphics.Color;
import p199m1.AbstractC2596a;
import p199m1.C2599d;
import p205n1.AbstractC2687a;

/* JADX INFO: renamed from: R.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1187a {

    /* JADX INFO: renamed from: a */
    public final float f3880a;

    /* JADX INFO: renamed from: b */
    public final float f3881b;

    /* JADX INFO: renamed from: c */
    public final float f3882c;

    /* JADX INFO: renamed from: d */
    public final float f3883d;

    /* JADX INFO: renamed from: e */
    public final float f3884e;

    /* JADX INFO: renamed from: f */
    public final float f3885f;

    public /* synthetic */ C1187a(float f2, float f5, float f6, float f7, float f8, float f9) {
        this.f3880a = f2;
        this.f3881b = f5;
        this.f3882c = f6;
        this.f3883d = f7;
        this.f3884e = f8;
        this.f3885f = f9;
    }

    /* JADX INFO: renamed from: a */
    public static C1187a m2235a(int i5) {
        C2599d c2599d = C2599d.f8263k;
        float fM4543c = AbstractC2596a.m4543c(Color.red(i5));
        float fM4543c2 = AbstractC2596a.m4543c(Color.green(i5));
        float fM4543c3 = AbstractC2596a.m4543c(Color.blue(i5));
        float[][] fArr = AbstractC2596a.f8260d;
        float[] fArr2 = fArr[0];
        float f2 = (fArr2[2] * fM4543c3) + (fArr2[1] * fM4543c2) + (fArr2[0] * fM4543c);
        float[] fArr3 = fArr[1];
        float f5 = (fArr3[2] * fM4543c3) + (fArr3[1] * fM4543c2) + (fArr3[0] * fM4543c);
        float[] fArr4 = fArr[2];
        float f6 = (fM4543c3 * fArr4[2]) + (fM4543c2 * fArr4[1]) + (fM4543c * fArr4[0]);
        float[][] fArr5 = AbstractC2596a.f8257a;
        float[] fArr6 = fArr5[0];
        float f7 = (fArr6[2] * f6) + (fArr6[1] * f5) + (fArr6[0] * f2);
        float[] fArr7 = fArr5[1];
        float f8 = (fArr7[2] * f6) + (fArr7[1] * f5) + (fArr7[0] * f2);
        float[] fArr8 = fArr5[2];
        float f9 = (f6 * fArr8[2]) + (f5 * fArr8[1]) + (f2 * fArr8[0]);
        float[] fArr9 = c2599d.f8270g;
        float f10 = c2599d.f8272i;
        float f11 = c2599d.f8267d;
        float f12 = c2599d.f8264a;
        float f13 = fArr9[0] * f7;
        float f14 = fArr9[1] * f8;
        float f15 = fArr9[2] * f9;
        float f16 = c2599d.f8271h;
        float fPow = (float) Math.pow(((double) (Math.abs(f13) * f16)) / 100.0d, 0.42d);
        float fPow2 = (float) Math.pow(((double) (Math.abs(f14) * f16)) / 100.0d, 0.42d);
        float fPow3 = (float) Math.pow(((double) (Math.abs(f15) * f16)) / 100.0d, 0.42d);
        float fSignum = ((Math.signum(f13) * 400.0f) * fPow) / (fPow + 27.13f);
        float fSignum2 = ((Math.signum(f14) * 400.0f) * fPow2) / (fPow2 + 27.13f);
        float fSignum3 = ((Math.signum(f15) * 400.0f) * fPow3) / (fPow3 + 27.13f);
        double d5 = fSignum3;
        float f17 = ((float) (((((double) fSignum2) * (-12.0d)) + (((double) fSignum) * 11.0d)) + d5)) / 11.0f;
        float f18 = ((float) (((double) (fSignum + fSignum2)) - (d5 * 2.0d))) / 9.0f;
        float f19 = fSignum2 * 20.0f;
        float f20 = ((21.0f * fSignum3) + ((fSignum * 20.0f) + f19)) / 20.0f;
        float f21 = (((fSignum * 40.0f) + f19) + fSignum3) / 20.0f;
        float fAtan2 = (((float) Math.atan2(f18, f17)) * 180.0f) / 3.1415927f;
        if (fAtan2 < 0.0f) {
            fAtan2 += 360.0f;
        } else if (fAtan2 >= 360.0f) {
            fAtan2 -= 360.0f;
        }
        float f22 = (3.1415927f * fAtan2) / 180.0f;
        float fPow4 = ((float) Math.pow((f21 * c2599d.f8265b) / f12, c2599d.f8273j * f11)) * 100.0f;
        Math.sqrt(fPow4 / 100.0f);
        float f23 = f12 + 4.0f;
        float fPow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, c2599d.f8269f), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos(((((double) (((double) fAtan2) < 20.14d ? 360.0f + fAtan2 : fAtan2)) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * c2599d.f8268e) * c2599d.f8266c) * ((float) Math.sqrt((f18 * f18) + (f17 * f17)))) / (f20 + 0.305f), 0.9d)) * ((float) Math.sqrt(((double) fPow4) / 100.0d));
        Math.sqrt((r0 * f11) / f23);
        float f24 = (1.7f * fPow4) / ((0.007f * fPow4) + 1.0f);
        float fLog = ((float) Math.log((f10 * fPow5 * 0.0228f) + 1.0f)) * 43.85965f;
        double d6 = f22;
        return new C1187a(fAtan2, fPow5, fPow4, f24, fLog * ((float) Math.cos(d6)), fLog * ((float) Math.sin(d6)));
    }

    /* JADX INFO: renamed from: b */
    public static C1187a m2236b(float f2, float f5, float f6) {
        C2599d c2599d = C2599d.f8263k;
        float f7 = c2599d.f8267d;
        Math.sqrt(((double) f2) / 100.0d);
        float f8 = c2599d.f8264a + 4.0f;
        float f9 = c2599d.f8272i * f5;
        Math.sqrt(((f5 / ((float) Math.sqrt(r1))) * c2599d.f8267d) / f8);
        float f10 = (1.7f * f2) / ((0.007f * f2) + 1.0f);
        float fLog = ((float) Math.log((((double) f9) * 0.0228d) + 1.0d)) * 43.85965f;
        double d5 = (3.1415927f * f6) / 180.0f;
        return new C1187a(f6, f5, f2, f10, fLog * ((float) Math.cos(d5)), fLog * ((float) Math.sin(d5)));
    }

    /* JADX INFO: renamed from: c */
    public int m2237c(C1189c c1189c) {
        float f2 = this.f3881b;
        float fSqrt = (f2 == 0.0f || this.f3882c == 0.0f) ? 0.0f : f2 / ((float) Math.sqrt(r3 / 100.0f));
        float f5 = c1189c.f3896a;
        float f6 = c1189c.f3903h;
        float fPow = fSqrt / ((float) Math.pow(1.64f - ((float) Math.pow((float) Math.pow(0.29f, f5), 0.73f)), 1.1111112f));
        float f7 = (this.f3880a * 3.1415927f) / 180.0f;
        float fCos = (((float) Math.cos(2.0f + f7)) + 3.8f) * 0.25f;
        float fPow2 = c1189c.f3897b * ((float) Math.pow(r3 / 100.0f, (1.0f / c1189c.f3900e) / c1189c.f3905j));
        float f8 = fCos * 3846.1538f * c1189c.f3901f * c1189c.f3899d;
        float f9 = fPow2 / c1189c.f3898c;
        double d5 = f7;
        float fSin = (float) Math.sin(d5);
        float fCos2 = (float) Math.cos(d5);
        float f10 = (((0.305f + f9) * 23.0f) * fPow) / (((fPow * 108.0f) * fSin) + (((11.0f * fPow) * fCos2) + (f8 * 23.0f)));
        float f11 = fCos2 * f10;
        float f12 = f10 * fSin;
        float f13 = f9 * 460.0f;
        float f14 = ((288.0f * f12) + ((451.0f * f11) + f13)) / 1403.0f;
        float f15 = ((f13 - (891.0f * f11)) - (261.0f * f12)) / 1403.0f;
        float f16 = ((f13 - (f11 * 220.0f)) - (f12 * 6300.0f)) / 1403.0f;
        float f17 = 100.0f / f6;
        double d6 = 2.3809524f;
        float fSignum = Math.signum(f14) * f17 * ((float) Math.pow(Math.max(0.0f, (Math.abs(f14) * 27.13f) / (400.0f - Math.abs(f14))), d6));
        float fSignum2 = Math.signum(f15) * f17 * ((float) Math.pow(Math.max(0.0f, (Math.abs(f15) * 27.13f) / (400.0f - Math.abs(f15))), d6));
        float fSignum3 = Math.signum(f16) * f17 * ((float) Math.pow(Math.max(0.0f, (Math.abs(f16) * 27.13f) / (400.0f - Math.abs(f16))), d6));
        float[] fArr = c1189c.f3902g;
        float f18 = fSignum / fArr[0];
        float f19 = fSignum2 / fArr[1];
        float f20 = fSignum3 / fArr[2];
        float[][] fArr2 = AbstractC1188b.f3887b;
        float[] fArr3 = fArr2[0];
        float f21 = (fArr3[2] * f20) + (fArr3[1] * f19) + (fArr3[0] * f18);
        float[] fArr4 = fArr2[1];
        float f22 = (fArr4[2] * f20) + (fArr4[1] * f19) + (fArr4[0] * f18);
        float[] fArr5 = fArr2[2];
        return AbstractC2687a.m4665a(f21, f22, (f20 * fArr5[2]) + (f19 * fArr5[1]) + (f18 * fArr5[0]));
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int m2238d(p199m1.C2599d r20) {
        /*
            Method dump skipped, instruction units count: 388
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p086R.C1187a.m2238d(m1.d):int");
    }
}
