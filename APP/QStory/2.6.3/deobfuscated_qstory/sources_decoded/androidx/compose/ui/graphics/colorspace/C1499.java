package androidx.compose.ui.graphics.colorspace;

import androidx.compose.ui.graphics.AbstractC1581;
import com.bumptech.glide.AbstractC3056;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.colorspace.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1499 extends AbstractC1490 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final float[] f4269;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final float[] f4270;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final float[] f4271;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final float[] f4272;

    static {
        float[] fArrM2674 = AbstractC1501.m2674(new float[]{0.818933f, 0.032984544f, 0.0482003f, 0.36186674f, 0.9293119f, 0.26436627f, -0.12885971f, 0.03614564f, 0.6338517f}, AbstractC1501.m2671(C1491.f4238.f4239, new float[]{0.964212f, 1.0f, 0.8251883f}, new float[]{0.95042855f, 1.0f, 1.0889004f}));
        f4271 = fArrM2674;
        float[] fArr = {0.21045426f, 1.9779985f, 0.025904037f, 0.7936178f, -2.4285922f, 0.78277177f, -0.004072047f, 0.4505937f, -0.80867577f};
        f4270 = fArr;
        f4269 = AbstractC1501.m2675(fArrM2674);
        f4272 = AbstractC1501.m2675(fArr);
    }

    @Override // androidx.compose.ui.graphics.colorspace.AbstractC1490
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final long mo2661(float f, float f2, float f3, float f4, AbstractC1490 abstractC1490) {
        float[] fArr = f4271;
        float f5 = (fArr[6] * f3) + (fArr[3] * f2) + (fArr[0] * f);
        float f6 = (fArr[7] * f3) + (fArr[4] * f2) + (fArr[1] * f);
        float f7 = (fArr[8] * f3) + (fArr[5] * f2) + (fArr[2] * f);
        float fM6720 = AbstractC3056.m6720(f5);
        float fM67202 = AbstractC3056.m6720(f6);
        float fM67203 = AbstractC3056.m6720(f7);
        float[] fArr2 = f4270;
        return AbstractC1581.m2883((fArr2[6] * fM67203) + (fArr2[3] * fM67202) + (fArr2[0] * fM6720), (fArr2[7] * fM67203) + (fArr2[4] * fM67202) + (fArr2[1] * fM6720), (fArr2[8] * fM67203) + (fArr2[5] * fM67202) + (fArr2[2] * fM6720), f4, abstractC1490);
    }

    @Override // androidx.compose.ui.graphics.colorspace.AbstractC1490
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final float mo2662(float f, float f2, float f3) {
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        if (f2 < -0.5f) {
            f2 = -0.5f;
        }
        if (f2 > 0.5f) {
            f2 = 0.5f;
        }
        if (f3 < -0.5f) {
            f3 = -0.5f;
        }
        float f4 = f3 <= 0.5f ? f3 : 0.5f;
        float[] fArr = f4272;
        float f5 = (fArr[6] * f4) + (fArr[3] * f2) + (fArr[0] * f);
        float f6 = (fArr[7] * f4) + (fArr[4] * f2) + (fArr[1] * f);
        float f7 = (fArr[8] * f4) + (fArr[5] * f2) + (fArr[2] * f);
        float f8 = f5 * f5 * f5;
        float f9 = f6 * f6 * f6;
        float f10 = f7 * f7 * f7;
        float[] fArr2 = f4269;
        return (fArr2[8] * f10) + (fArr2[5] * f9) + (fArr2[2] * f8);
    }

    @Override // androidx.compose.ui.graphics.colorspace.AbstractC1490
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final long mo2663(float f, float f2, float f3) {
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        if (f2 < -0.5f) {
            f2 = -0.5f;
        }
        if (f2 > 0.5f) {
            f2 = 0.5f;
        }
        if (f3 < -0.5f) {
            f3 = -0.5f;
        }
        float f4 = f3 <= 0.5f ? f3 : 0.5f;
        float[] fArr = f4272;
        float f5 = (fArr[6] * f4) + (fArr[3] * f2) + (fArr[0] * f);
        float f6 = (fArr[7] * f4) + (fArr[4] * f2) + (fArr[1] * f);
        float f7 = (fArr[8] * f4) + (fArr[5] * f2) + (fArr[2] * f);
        float f8 = f5 * f5 * f5;
        float f9 = f6 * f6 * f6;
        float f10 = f7 * f7 * f7;
        float[] fArr2 = f4269;
        return (((long) Float.floatToRawIntBits((fArr2[6] * f10) + ((fArr2[3] * f9) + (fArr2[0] * f8)))) << 32) | (4294967295L & ((long) Float.floatToRawIntBits((fArr2[7] * f10) + (fArr2[4] * f9) + (fArr2[1] * f8))));
    }

    @Override // androidx.compose.ui.graphics.colorspace.AbstractC1490
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final float mo2665(int i) {
        return i == 0 ? 0.0f : -0.5f;
    }

    @Override // androidx.compose.ui.graphics.colorspace.AbstractC1490
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final float mo2666(int i) {
        return i == 0 ? 1.0f : 0.5f;
    }
}
