package androidx.compose.p001ui.graphics.colorspace;

import androidx.compose.p001ui.graphics.AbstractC2416;
import com.bumptech.glide.AbstractC3888;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.colorspace.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2334 extends AbstractC2325 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final float[] f4614;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final float[] f4615;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final float[] f4616;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final float[] f4617;

    static {
        float[] fArrM3234 = AbstractC2336.m3234(new float[]{0.818933f, 0.032984544f, 0.0482003f, 0.36186674f, 0.9293119f, 0.26436627f, -0.12885971f, 0.03614564f, 0.6338517f}, AbstractC2336.m3231(C2326.f4583.f4584, new float[]{0.964212f, 1.0f, 0.8251883f}, new float[]{0.95042855f, 1.0f, 1.0889004f}));
        f4616 = fArrM3234;
        float[] fArr = {0.21045426f, 1.9779985f, 0.025904037f, 0.7936178f, -2.4285922f, 0.78277177f, -0.004072047f, 0.4505937f, -0.80867577f};
        f4615 = fArr;
        f4614 = AbstractC2336.m3235(fArrM3234);
        f4617 = AbstractC2336.m3235(fArr);
    }

    @Override // androidx.compose.p001ui.graphics.colorspace.AbstractC2325
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final long mo3221(float f, float f2, float f3, float f4, AbstractC2325 abstractC2325) {
        float[] fArr = f4616;
        float f5 = (fArr[6] * f3) + (fArr[3] * f2) + (fArr[0] * f);
        float f6 = (fArr[7] * f3) + (fArr[4] * f2) + (fArr[1] * f);
        float f7 = (fArr[8] * f3) + (fArr[5] * f2) + (fArr[2] * f);
        float fM7280 = AbstractC3888.m7280(f5);
        float fM72802 = AbstractC3888.m7280(f6);
        float fM72803 = AbstractC3888.m7280(f7);
        float[] fArr2 = f4615;
        return AbstractC2416.m3443((fArr2[6] * fM72803) + (fArr2[3] * fM72802) + (fArr2[0] * fM7280), (fArr2[7] * fM72803) + (fArr2[4] * fM72802) + (fArr2[1] * fM7280), (fArr2[8] * fM72803) + (fArr2[5] * fM72802) + (fArr2[2] * fM7280), f4, abstractC2325);
    }

    @Override // androidx.compose.p001ui.graphics.colorspace.AbstractC2325
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final float mo3222(float f, float f2, float f3) {
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
        float[] fArr = f4617;
        float f5 = (fArr[6] * f4) + (fArr[3] * f2) + (fArr[0] * f);
        float f6 = (fArr[7] * f4) + (fArr[4] * f2) + (fArr[1] * f);
        float f7 = (fArr[8] * f4) + (fArr[5] * f2) + (fArr[2] * f);
        float f8 = f5 * f5 * f5;
        float f9 = f6 * f6 * f6;
        float f10 = f7 * f7 * f7;
        float[] fArr2 = f4614;
        return (fArr2[8] * f10) + (fArr2[5] * f9) + (fArr2[2] * f8);
    }

    @Override // androidx.compose.p001ui.graphics.colorspace.AbstractC2325
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final long mo3223(float f, float f2, float f3) {
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
        float[] fArr = f4617;
        float f5 = (fArr[6] * f4) + (fArr[3] * f2) + (fArr[0] * f);
        float f6 = (fArr[7] * f4) + (fArr[4] * f2) + (fArr[1] * f);
        float f7 = (fArr[8] * f4) + (fArr[5] * f2) + (fArr[2] * f);
        float f8 = f5 * f5 * f5;
        float f9 = f6 * f6 * f6;
        float f10 = f7 * f7 * f7;
        float[] fArr2 = f4614;
        return (((long) Float.floatToRawIntBits((fArr2[6] * f10) + ((fArr2[3] * f9) + (fArr2[0] * f8)))) << 32) | (4294967295L & ((long) Float.floatToRawIntBits((fArr2[7] * f10) + (fArr2[4] * f9) + (fArr2[1] * f8))));
    }

    @Override // androidx.compose.p001ui.graphics.colorspace.AbstractC2325
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final float mo3225(int i) {
        return i == 0 ? 0.0f : -0.5f;
    }

    @Override // androidx.compose.p001ui.graphics.colorspace.AbstractC2325
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final float mo3226(int i) {
        return i == 0 ? 1.0f : 0.5f;
    }
}
