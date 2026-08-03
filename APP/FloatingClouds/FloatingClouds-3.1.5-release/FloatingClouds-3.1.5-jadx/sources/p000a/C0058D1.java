package p000a;

/* JADX INFO: renamed from: a.D1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0058D1 {

    /* JADX INFO: renamed from: a */
    public final int f194a;

    /* JADX INFO: renamed from: b */
    public final float f195b;

    /* JADX INFO: renamed from: c */
    public int f196c;

    /* JADX INFO: renamed from: d */
    public int f197d;

    /* JADX INFO: renamed from: e */
    public final float f198e;

    /* JADX INFO: renamed from: f */
    public final float f199f;

    /* JADX INFO: renamed from: g */
    public final int f200g;

    /* JADX INFO: renamed from: h */
    public final float f201h;

    /* JADX WARN: Removed duplicated region for block: B:49:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0058D1(int i, float f, float f2, float f3, int i2, float f4, int i3, float f5, int i4, float f6) {
        float fAbs;
        this.f194a = i;
        if (f < f2) {
            f = f2;
        } else if (f > f3) {
            f = f3;
        }
        this.f195b = f;
        this.f196c = i2;
        this.f198e = f4;
        this.f197d = i3;
        this.f199f = f5;
        this.f200g = i4;
        float f7 = i4;
        float f8 = (f4 * i3) + (f5 * f7);
        float f9 = i2;
        float f10 = f6 - ((f * f9) + f8);
        if (i2 > 0 && f10 > 0.0f) {
            this.f195b = Math.min(f10 / f9, f3 - f) + f;
        } else if (i2 > 0 && f10 < 0.0f) {
            this.f195b = Math.max(f10 / f9, f2 - f) + f;
        }
        int i5 = this.f196c;
        float f11 = i5 > 0 ? this.f195b : 0.0f;
        this.f195b = f11;
        int i6 = this.f197d;
        float f12 = i6;
        float f13 = f12 / 2.0f;
        float f14 = (f6 - ((i5 + f13) * (i5 > 0 ? f11 : 0.0f))) / (f13 + f7);
        this.f199f = f14;
        float f15 = (f11 + f14) / 2.0f;
        this.f198e = f15;
        if (i6 > 0 && f14 != f5) {
            float f16 = (f5 - f14) * f7;
            float fMin = Math.min(Math.abs(f16), f15 * 0.1f * f12);
            if (f16 > 0.0f) {
                this.f198e -= fMin / this.f197d;
                this.f199f = (fMin / f7) + this.f199f;
            } else {
                this.f198e = (fMin / this.f197d) + this.f198e;
                this.f199f -= fMin / f7;
            }
        }
        if (i4 <= 0 || this.f196c <= 0 || this.f197d <= 0) {
            fAbs = (i4 <= 0 || this.f196c <= 0 || this.f199f > this.f195b) ? i * Math.abs(f5 - this.f199f) : Float.MAX_VALUE;
        } else {
            float f17 = this.f199f;
            float f18 = this.f198e;
            if (f17 <= f18 || f18 <= this.f195b) {
            }
        }
        this.f201h = fAbs;
    }

    /* JADX INFO: renamed from: a */
    public static C0058D1 m154a(float f, float f2, float f3, float f4, int[] iArr, float f5, int[] iArr2, float f6, int[] iArr3) {
        C0058D1 c0058d1 = null;
        int i = 1;
        for (int i2 : iArr3) {
            int length = iArr2.length;
            int i3 = 0;
            while (i3 < length) {
                int i4 = iArr2[i3];
                int length2 = iArr.length;
                int i5 = 0;
                while (i5 < length2) {
                    int i6 = length;
                    int i7 = i3;
                    int i8 = i;
                    int i9 = length2;
                    int i10 = i5;
                    C0058D1 c0058d12 = new C0058D1(i8, f2, f3, f4, iArr[i5], f5, i4, f6, i2, f);
                    float f7 = c0058d12.f201h;
                    if (c0058d1 == null || f7 < c0058d1.f201h) {
                        if (f7 == 0.0f) {
                            return c0058d12;
                        }
                        c0058d1 = c0058d12;
                    }
                    int i11 = i8 + 1;
                    i5 = i10 + 1;
                    i3 = i7;
                    i = i11;
                    length = i6;
                    length2 = i9;
                }
                i3++;
                i = i;
                length = length;
            }
        }
        return c0058d1;
    }

    public final String toString() {
        return "Arrangement [priority=" + this.f194a + ", smallCount=" + this.f196c + ", smallSize=" + this.f195b + ", mediumCount=" + this.f197d + ", mediumSize=" + this.f198e + ", largeCount=" + this.f200g + ", largeSize=" + this.f199f + ", cost=" + this.f201h + "]";
    }
}
