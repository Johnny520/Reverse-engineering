package p000;

import java.util.Arrays;

/* JADX INFO: renamed from: sf */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0692sf {

    /* JADX INFO: renamed from: a */
    public final float f10082a;

    /* JADX INFO: renamed from: b */
    public final float f10083b;

    /* JADX INFO: renamed from: c */
    public final float f10084c;

    /* JADX INFO: renamed from: d */
    public final float f10085d;

    /* JADX INFO: renamed from: e */
    public final float f10086e;

    /* JADX INFO: renamed from: f */
    public final float f10087f;

    /* JADX INFO: renamed from: g */
    public final float f10088g;

    /* JADX INFO: renamed from: h */
    public float f10089h;

    /* JADX INFO: renamed from: i */
    public float f10090i;

    /* JADX INFO: renamed from: j */
    public final float[] f10091j;

    /* JADX INFO: renamed from: k */
    public final float f10092k;

    /* JADX INFO: renamed from: l */
    public final float f10093l;

    /* JADX INFO: renamed from: m */
    public final float f10094m;

    /* JADX INFO: renamed from: n */
    public final float f10095n;

    /* JADX INFO: renamed from: o */
    public final float f10096o;

    /* JADX INFO: renamed from: p */
    public final boolean f10097p;

    /* JADX INFO: renamed from: q */
    public final float f10098q;

    /* JADX INFO: renamed from: r */
    public final float f10099r;

    public C0692sf(int i, float f, float f2, float f3, float f4, float f5, float f6) {
        boolean z;
        int i2;
        float f7;
        this.f10082a = f;
        this.f10083b = f2;
        this.f10084c = f3;
        this.f10085d = f4;
        this.f10086e = f5;
        this.f10087f = f6;
        float f8 = f5 - f3;
        float f9 = f6 - f4;
        float f10 = 0.0f;
        int i3 = 1;
        boolean z2 = i == 1 || (i == 4 ? f9 > 0.0f : !(i != 5 || f9 >= 0.0f));
        float f11 = z2 ? -1.0f : 1.0f;
        this.f10094m = f11;
        float f12 = 1.0f / (f2 - f);
        this.f10092k = f12;
        float[] fArr = new float[101];
        this.f10091j = fArr;
        boolean z3 = i == 3;
        if (z3 || Math.abs(f8) < 0.001f || Math.abs(f9) < 0.001f) {
            float fHypot = (float) Math.hypot(f9, f8);
            this.f10088g = fHypot;
            this.f10093l = fHypot * f12;
            this.f10098q = f8 * f12;
            this.f10099r = f9 * f12;
            this.f10095n = Float.NaN;
            this.f10096o = Float.NaN;
            z = true;
        } else {
            this.f10095n = f8 * f11;
            this.f10096o = f9 * (-f11);
            this.f10098q = z2 ? f5 : f3;
            this.f10099r = z2 ? f4 : f6;
            float f13 = f5 - f3;
            float f14 = f4 - f6;
            float[] fArr2 = AbstractC0179eu.f2627a;
            float f15 = f14;
            float fHypot2 = 0.0f;
            float f16 = 0.0f;
            int i4 = 1;
            while (true) {
                double d = (float) (((((double) i4) * 90.0d) / 90.0d) * 0.017453292519943295d);
                i2 = i3;
                float fSin = ((float) Math.sin(d)) * f13;
                float fCos = ((float) Math.cos(d)) * f14;
                f7 = f10;
                fHypot2 += (float) Math.hypot(fSin - f16, fCos - f15);
                fArr2[i4] = fHypot2;
                if (i4 == 90) {
                    break;
                }
                i4++;
                f16 = fSin;
                f15 = fCos;
                i3 = i2;
                f10 = f7;
            }
            this.f10088g = fHypot2;
            int i5 = i2;
            while (true) {
                fArr2[i5] = fArr2[i5] / fHypot2;
                if (i5 == 90) {
                    break;
                } else {
                    i5++;
                }
            }
            int length = fArr.length;
            for (int i6 = 0; i6 < length; i6++) {
                float f17 = i6 / 100.0f;
                int iBinarySearch = Arrays.binarySearch(fArr2, 0, 91, f17);
                if (iBinarySearch >= 0) {
                    fArr[i6] = iBinarySearch / 90.0f;
                } else if (iBinarySearch == -1) {
                    fArr[i6] = f7;
                } else {
                    int i7 = -iBinarySearch;
                    int i8 = i7 - 2;
                    float f18 = i8;
                    float f19 = fArr2[i8];
                    fArr[i6] = (((f17 - f19) / (fArr2[i7 - i2] - f19)) + f18) / 90.0f;
                }
            }
            this.f10093l = this.f10088g * this.f10092k;
            z = z3;
        }
        this.f10097p = z;
    }

    /* JADX INFO: renamed from: a */
    public final float m4859a() {
        float f = this.f10095n * this.f10090i;
        return f * this.f10094m * (this.f10093l / ((float) Math.hypot(f, (-this.f10096o) * this.f10089h)));
    }

    /* JADX INFO: renamed from: b */
    public final float m4860b() {
        float f = this.f10095n * this.f10090i;
        float f2 = (-this.f10096o) * this.f10089h;
        return f2 * this.f10094m * (this.f10093l / ((float) Math.hypot(f, f2)));
    }

    /* JADX INFO: renamed from: c */
    public final void m4861c(float f) {
        float f2 = (this.f10094m == -1.0f ? this.f10083b - f : f - this.f10082a) * this.f10092k;
        float f3 = 0.0f;
        if (f2 > 0.0f) {
            f3 = 1.0f;
            if (f2 < 1.0f) {
                float f4 = f2 * 100.0f;
                int i = (int) f4;
                float[] fArr = this.f10091j;
                float f5 = fArr[i];
                f3 = ((fArr[i + 1] - f5) * (f4 - i)) + f5;
            }
        }
        double d = f3 * 1.5707964f;
        this.f10089h = (float) Math.sin(d);
        this.f10090i = (float) Math.cos(d);
    }
}
