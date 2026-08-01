package p203n;

import java.util.Arrays;

/* JADX INFO: renamed from: n.p */
/* JADX INFO: loaded from: classes.dex */
public final class C2671p {

    /* JADX INFO: renamed from: a */
    public final float f8509a;

    /* JADX INFO: renamed from: b */
    public final float f8510b;

    /* JADX INFO: renamed from: c */
    public final float f8511c;

    /* JADX INFO: renamed from: d */
    public final float f8512d;

    /* JADX INFO: renamed from: e */
    public final float f8513e;

    /* JADX INFO: renamed from: f */
    public final float f8514f;

    /* JADX INFO: renamed from: g */
    public final float f8515g;

    /* JADX INFO: renamed from: h */
    public float f8516h;

    /* JADX INFO: renamed from: i */
    public float f8517i;

    /* JADX INFO: renamed from: j */
    public final float[] f8518j;

    /* JADX INFO: renamed from: k */
    public final float f8519k;

    /* JADX INFO: renamed from: l */
    public final float f8520l;

    /* JADX INFO: renamed from: m */
    public final float f8521m;

    /* JADX INFO: renamed from: n */
    public final float f8522n;

    /* JADX INFO: renamed from: o */
    public final float f8523o;

    /* JADX INFO: renamed from: p */
    public final boolean f8524p;

    /* JADX INFO: renamed from: q */
    public final float f8525q;

    /* JADX INFO: renamed from: r */
    public final float f8526r;

    public C2671p(int i5, float f2, float f5, float f6, float f7, float f8, float f9) {
        boolean z5;
        int i6;
        float f10;
        float f11;
        this.f8509a = f2;
        this.f8510b = f5;
        this.f8511c = f6;
        this.f8512d = f7;
        this.f8513e = f8;
        this.f8514f = f9;
        float f12 = f8 - f6;
        float f13 = f9 - f7;
        float f14 = 0.0f;
        int i7 = 1;
        boolean z6 = i5 == 1 || (i5 == 4 ? f13 > 0.0f : !(i5 != 5 || f13 >= 0.0f));
        float f15 = z6 ? -1.0f : 1.0f;
        this.f8521m = f15;
        float f16 = 1 / (f5 - f2);
        this.f8519k = f16;
        float[] fArr = new float[101];
        this.f8518j = fArr;
        boolean z7 = i5 == 3;
        if (z7 || Math.abs(f12) < 0.001f || Math.abs(f13) < 0.001f) {
            float fHypot = (float) Math.hypot(f13, f12);
            this.f8515g = fHypot;
            this.f8520l = fHypot * f16;
            this.f8525q = f12 * f16;
            this.f8526r = f13 * f16;
            this.f8522n = Float.NaN;
            this.f8523o = Float.NaN;
            z5 = true;
        } else {
            this.f8522n = f12 * f15;
            this.f8523o = f13 * (-f15);
            this.f8525q = z6 ? f8 : f6;
            this.f8526r = z6 ? f7 : f9;
            float f17 = f8 - f6;
            float f18 = f7 - f9;
            float[] fArr2 = AbstractC2649d.f8445i;
            int i8 = 90;
            float f19 = 90;
            float f20 = f18;
            float fHypot2 = 0.0f;
            float f21 = 0.0f;
            int i9 = 1;
            while (true) {
                i6 = i7;
                f10 = f14;
                double radians = (float) Math.toRadians((((double) i9) * 90.0d) / ((double) i8));
                float fSin = ((float) Math.sin(radians)) * f17;
                float fCos = ((float) Math.cos(radians)) * f18;
                float f22 = fSin - f21;
                f11 = f19;
                fHypot2 += (float) Math.hypot(f22, fCos - f20);
                fArr2[i9] = fHypot2;
                i8 = 90;
                if (i9 == 90) {
                    break;
                }
                i9++;
                f20 = fCos;
                f19 = f11;
                f14 = f10;
                f21 = fSin;
                i7 = i6;
            }
            this.f8515g = fHypot2;
            int i10 = i6;
            while (true) {
                fArr2[i10] = fArr2[i10] / fHypot2;
                if (i10 == 90) {
                    break;
                } else {
                    i10++;
                }
            }
            int length = fArr.length;
            for (int i11 = 0; i11 < length; i11++) {
                float f23 = i11 / 100.0f;
                int iBinarySearch = Arrays.binarySearch(fArr2, 0, 91, f23);
                if (iBinarySearch >= 0) {
                    fArr[i11] = iBinarySearch / f11;
                } else if (iBinarySearch == -1) {
                    fArr[i11] = f10;
                } else {
                    int i12 = -iBinarySearch;
                    int i13 = i12 - 2;
                    float f24 = i13;
                    float f25 = fArr2[i13];
                    fArr[i11] = (((f23 - f25) / (fArr2[i12 - 1] - f25)) + f24) / f11;
                }
            }
            this.f8520l = this.f8515g * this.f8519k;
            z5 = z7;
        }
        this.f8524p = z5;
    }

    /* JADX INFO: renamed from: a */
    public final float m4632a() {
        float f2 = this.f8522n * this.f8517i;
        return f2 * this.f8521m * (this.f8520l / ((float) Math.hypot(f2, (-this.f8523o) * this.f8516h)));
    }

    /* JADX INFO: renamed from: b */
    public final float m4633b() {
        float f2 = this.f8522n * this.f8517i;
        float f5 = (-this.f8523o) * this.f8516h;
        return f5 * this.f8521m * (this.f8520l / ((float) Math.hypot(f2, f5)));
    }

    /* JADX INFO: renamed from: c */
    public final void m4634c(float f2) {
        float f5 = (this.f8521m == -1.0f ? this.f8510b - f2 : f2 - this.f8509a) * this.f8519k;
        float f6 = 0.0f;
        if (f5 > 0.0f) {
            f6 = 1.0f;
            if (f5 < 1.0f) {
                float f7 = f5 * 100;
                int i5 = (int) f7;
                float[] fArr = this.f8518j;
                float f8 = fArr[i5];
                f6 = ((fArr[i5 + 1] - f8) * (f7 - i5)) + f8;
            }
        }
        double d5 = f6 * 1.5707964f;
        this.f8516h = (float) Math.sin(d5);
        this.f8517i = (float) Math.cos(d5);
    }
}
