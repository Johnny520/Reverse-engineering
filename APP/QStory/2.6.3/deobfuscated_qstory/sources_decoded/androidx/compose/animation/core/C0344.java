package androidx.compose.animation.core;

import androidx.activity.AbstractC0053;
import java.util.Arrays;

/* JADX INFO: renamed from: androidx.compose.animation.core.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0344 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final float f1164;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final float f1165;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final float f1166;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final float f1167;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final float f1168;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final float f1169;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final float f1170;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final float f1171;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final float f1172;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final float f1173;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final float f1174;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final boolean f1175;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public float f1176;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final float f1177;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final float f1178;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final float f1179;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public float f1180;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final float[] f1181;

    public C0344(int i, float f, float f2, float f3, float f4, float f5, float f6) {
        boolean z;
        int i2;
        float f7;
        this.f1169 = f;
        this.f1168 = f2;
        this.f1167 = f3;
        this.f1166 = f4;
        this.f1165 = f5;
        this.f1164 = f6;
        float f8 = f5 - f3;
        float f9 = f6 - f4;
        float f10 = 0.0f;
        int i3 = 1;
        boolean z2 = i == 1 || (i == 4 ? f9 > 0.0f : !(i != 5 || f9 >= 0.0f));
        float f11 = z2 ? -1.0f : 1.0f;
        this.f1171 = f11;
        float f12 = 1.0f / (f2 - f);
        this.f1178 = f12;
        float[] fArr = new float[101];
        this.f1181 = fArr;
        boolean z3 = i == 3;
        if (z3 || Math.abs(f8) < 0.001f || Math.abs(f9) < 0.001f) {
            float fHypot = (float) Math.hypot(f9, f8);
            this.f1177 = fHypot;
            this.f1179 = fHypot * f12;
            this.f1172 = f8 * f12;
            this.f1173 = f9 * f12;
            this.f1170 = Float.NaN;
            this.f1174 = Float.NaN;
            z = true;
        } else {
            this.f1170 = f8 * f11;
            this.f1174 = f9 * (-f11);
            this.f1172 = z2 ? f5 : f3;
            this.f1173 = z2 ? f4 : f6;
            float f13 = f5 - f3;
            float f14 = f4 - f6;
            float[] fArr2 = AbstractC0330.f1122;
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
            this.f1177 = fHypot2;
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
            this.f1179 = this.f1177 * this.f1178;
            z = z3;
        }
        this.f1175 = z;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m1042(float f) {
        float f2 = (this.f1171 == -1.0f ? this.f1168 - f : f - this.f1169) * this.f1178;
        float fM146 = 0.0f;
        if (f2 > 0.0f) {
            fM146 = 1.0f;
            if (f2 < 1.0f) {
                float f3 = f2 * 100.0f;
                int i = (int) f3;
                float[] fArr = this.f1181;
                float f4 = fArr[i];
                fM146 = AbstractC0053.m146(fArr[i + 1], f4, f3 - i, f4);
            }
        }
        double d = fM146 * 1.5707964f;
        this.f1176 = (float) Math.sin(d);
        this.f1180 = (float) Math.cos(d);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final float m1043() {
        float f = this.f1170 * this.f1180;
        float f2 = (-this.f1174) * this.f1176;
        return f2 * this.f1171 * (this.f1179 / ((float) Math.hypot(f, f2)));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final float m1044() {
        float f = this.f1170 * this.f1180;
        return f * this.f1171 * (this.f1179 / ((float) Math.hypot(f, (-this.f1174) * this.f1176)));
    }
}
