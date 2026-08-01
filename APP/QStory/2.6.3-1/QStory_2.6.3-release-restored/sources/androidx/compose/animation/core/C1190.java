package androidx.compose.animation.core;

import androidx.activity.AbstractC0900;
import java.util.Arrays;

/* JADX INFO: renamed from: androidx.compose.animation.core.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1190 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final float f1509;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final float f1510;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final float f1511;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final float f1512;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final float f1513;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final float f1514;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final float f1515;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final float f1516;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final float f1517;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final float f1518;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final float f1519;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final boolean f1520;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public float f1521;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final float f1522;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final float f1523;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final float f1524;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public float f1525;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final float[] f1526;

    public C1190(int i, float f, float f2, float f3, float f4, float f5, float f6) {
        boolean z;
        int i2;
        float f7;
        this.f1514 = f;
        this.f1513 = f2;
        this.f1512 = f3;
        this.f1511 = f4;
        this.f1510 = f5;
        this.f1509 = f6;
        float f8 = f5 - f3;
        float f9 = f6 - f4;
        float f10 = 0.0f;
        int i3 = 1;
        boolean z2 = i == 1 || (i == 4 ? f9 > 0.0f : !(i != 5 || f9 >= 0.0f));
        float f11 = z2 ? -1.0f : 1.0f;
        this.f1516 = f11;
        float f12 = 1.0f / (f2 - f);
        this.f1523 = f12;
        float[] fArr = new float[101];
        this.f1526 = fArr;
        boolean z3 = i == 3;
        if (z3 || Math.abs(f8) < 0.001f || Math.abs(f9) < 0.001f) {
            float fHypot = (float) Math.hypot(f9, f8);
            this.f1522 = fHypot;
            this.f1524 = fHypot * f12;
            this.f1517 = f8 * f12;
            this.f1518 = f9 * f12;
            this.f1515 = Float.NaN;
            this.f1519 = Float.NaN;
            z = true;
        } else {
            this.f1515 = f8 * f11;
            this.f1519 = f9 * (-f11);
            this.f1517 = z2 ? f5 : f3;
            this.f1518 = z2 ? f4 : f6;
            float f13 = f5 - f3;
            float f14 = f4 - f6;
            float[] fArr2 = AbstractC1176.f1467;
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
            this.f1522 = fHypot2;
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
            this.f1524 = this.f1522 * this.f1523;
            z = z3;
        }
        this.f1520 = z;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m1602(float f) {
        float f2 = (this.f1516 == -1.0f ? this.f1513 - f : f - this.f1514) * this.f1523;
        float fM706 = 0.0f;
        if (f2 > 0.0f) {
            fM706 = 1.0f;
            if (f2 < 1.0f) {
                float f3 = f2 * 100.0f;
                int i = (int) f3;
                float[] fArr = this.f1526;
                float f4 = fArr[i];
                fM706 = AbstractC0900.m706(fArr[i + 1], f4, f3 - i, f4);
            }
        }
        double d = fM706 * 1.5707964f;
        this.f1521 = (float) Math.sin(d);
        this.f1525 = (float) Math.cos(d);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final float m1603() {
        float f = this.f1515 * this.f1525;
        float f2 = (-this.f1519) * this.f1521;
        return f2 * this.f1516 * (this.f1524 / ((float) Math.hypot(f, f2)));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final float m1604() {
        float f = this.f1515 * this.f1525;
        return f * this.f1516 * (this.f1524 / ((float) Math.hypot(f, (-this.f1519) * this.f1521)));
    }
}
