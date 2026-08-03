package p116i;

import java.util.Arrays;

/* JADX INFO: renamed from: i.r */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1784r {

    /* JADX INFO: renamed from: a */
    public final float f5933a;

    /* JADX INFO: renamed from: b */
    public final float f5934b;

    /* JADX INFO: renamed from: c */
    public final float f5935c;

    /* JADX INFO: renamed from: d */
    public final float f5936d;

    /* JADX INFO: renamed from: e */
    public final float f5937e;

    /* JADX INFO: renamed from: f */
    public final float f5938f;

    /* JADX INFO: renamed from: g */
    public final float f5939g;

    /* JADX INFO: renamed from: h */
    public float f5940h;

    /* JADX INFO: renamed from: i */
    public float f5941i;

    /* JADX INFO: renamed from: j */
    public final float[] f5942j;

    /* JADX INFO: renamed from: k */
    public final float f5943k;

    /* JADX INFO: renamed from: l */
    public final float f5944l;

    /* JADX INFO: renamed from: m */
    public final float f5945m;

    /* JADX INFO: renamed from: n */
    public final float f5946n;

    /* JADX INFO: renamed from: o */
    public final float f5947o;

    /* JADX INFO: renamed from: p */
    public final boolean f5948p;

    /* JADX INFO: renamed from: q */
    public final float f5949q;

    /* JADX INFO: renamed from: r */
    public final float f5950r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1784r(int i9, float f3, float f10, float f11, float f12, float f13, float f14) {
        boolean z9;
        int i10;
        float f15;
        float f16;
        this.f5933a = f3;
        this.f5934b = f10;
        this.f5935c = f11;
        this.f5936d = f12;
        this.f5937e = f13;
        this.f5938f = f14;
        float f17 = f13 - f11;
        float f18 = f14 - f12;
        float f19 = 0.0f;
        int i11 = 1;
        boolean z10 = i9 == 1 || (i9 == 4 ? f18 > 0.0f : !(i9 != 5 || f18 >= 0.0f));
        float f20 = z10 ? -1.0f : 1.0f;
        this.f5945m = f20;
        float f21 = 1 / (f10 - f3);
        this.f5943k = f21;
        float[] fArr = new float[101];
        this.f5942j = fArr;
        boolean z11 = i9 == 3;
        if (z11 || Math.abs(f17) < 0.001f || Math.abs(f18) < 0.001f) {
            float fHypot = (float) Math.hypot(f18, f17);
            this.f5939g = fHypot;
            this.f5944l = fHypot * f21;
            this.f5949q = f17 * f21;
            this.f5950r = f18 * f21;
            this.f5946n = Float.NaN;
            this.f5947o = Float.NaN;
            z9 = true;
        } else {
            this.f5946n = f17 * f20;
            this.f5947o = f18 * (-f20);
            this.f5949q = z10 ? f13 : f11;
            this.f5950r = z10 ? f12 : f14;
            float f22 = f13 - f11;
            float f23 = f12 - f14;
            float[] fArr2 = AbstractC1742d.f5809i;
            int i12 = 90;
            float f24 = 90;
            float f25 = f23;
            float fHypot2 = 0.0f;
            float f26 = 0.0f;
            int i13 = 1;
            while (true) {
                i10 = i11;
                f15 = f19;
                double d10 = (float) (((((double) i13) * 90.0d) / ((double) i12)) * 0.017453292519943295d);
                float fSin = ((float) Math.sin(d10)) * f22;
                float fCos = ((float) Math.cos(d10)) * f23;
                float f27 = fSin - f26;
                f16 = f24;
                fHypot2 += (float) Math.hypot(f27, fCos - f25);
                fArr2[i13] = fHypot2;
                i12 = 90;
                if (i13 == 90) {
                    break;
                }
                i13++;
                f25 = fCos;
                f24 = f16;
                f19 = f15;
                f26 = fSin;
                i11 = i10;
            }
            this.f5939g = fHypot2;
            int i14 = i10;
            while (true) {
                fArr2[i14] = fArr2[i14] / fHypot2;
                if (i14 == 90) {
                    break;
                } else {
                    i14++;
                }
            }
            int length = fArr.length;
            for (int i15 = 0; i15 < length; i15++) {
                float f28 = i15 / 100.0f;
                int iBinarySearch = Arrays.binarySearch(fArr2, 0, 91, f28);
                if (iBinarySearch >= 0) {
                    fArr[i15] = iBinarySearch / f16;
                } else if (iBinarySearch == -1) {
                    fArr[i15] = f15;
                } else {
                    int i16 = -iBinarySearch;
                    int i17 = i16 - 2;
                    float f29 = i17;
                    float f30 = fArr2[i17];
                    fArr[i15] = (((f28 - f30) / (fArr2[i16 - 1] - f30)) + f29) / f16;
                }
            }
            this.f5944l = this.f5939g * this.f5943k;
            z9 = z11;
        }
        this.f5948p = z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final float m4434a() {
        float f3 = this.f5946n * this.f5941i;
        return f3 * this.f5945m * (this.f5944l / ((float) Math.hypot(f3, (-this.f5947o) * this.f5940h)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final float m4435b() {
        float f3 = this.f5946n * this.f5941i;
        float f10 = (-this.f5947o) * this.f5940h;
        return f10 * this.f5945m * (this.f5944l / ((float) Math.hypot(f3, f10)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final void m4436c(float f3) {
        float f10 = (this.f5945m == -1.0f ? this.f5934b - f3 : f3 - this.f5933a) * this.f5943k;
        float f11 = 0.0f;
        if (f10 > 0.0f) {
            f11 = 1.0f;
            if (f10 < 1.0f) {
                float f12 = f10 * 100;
                int i9 = (int) f12;
                float[] fArr = this.f5942j;
                float f13 = fArr[i9];
                f11 = ((fArr[i9 + 1] - f13) * (f12 - i9)) + f13;
            }
        }
        double d10 = f11 * 1.5707964f;
        this.f5940h = (float) Math.sin(d10);
        this.f5941i = (float) Math.cos(d10);
    }
}
