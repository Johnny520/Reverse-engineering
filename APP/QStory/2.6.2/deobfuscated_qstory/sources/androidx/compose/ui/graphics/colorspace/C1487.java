package androidx.compose.ui.graphics.colorspace;

import androidx.compose.ui.graphics.AbstractC1581;
import androidx.compose.ui.graphics.C1599;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.colorspace.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1487 extends C1486 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C1495 f4206;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C1495 f4207;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final float[] f4208;

    public C1487(C1495 c1495, C1495 c14952) {
        float[] fArrM2664;
        super(c14952, c1495, c14952, null);
        this.f4207 = c1495;
        this.f4206 = c14952;
        float[] fArr = C1491.f4237.f4238;
        C1494 c1494 = c1495.f4248;
        float[] fArr2 = c1495.f4258;
        C1494 c14942 = c14952.f4248;
        float[] fArr3 = c14952.f4259;
        if (AbstractC1501.m2660(c1494, c14942)) {
            fArrM2664 = AbstractC1501.m2664(fArr3, fArr2);
        } else {
            float[] fArrM2657 = c1494.m2657();
            float[] fArrM26572 = c14942.m2657();
            C1494 c14943 = AbstractC1501.f4277;
            fArrM2664 = AbstractC1501.m2664(AbstractC1501.m2660(c14942, c14943) ? fArr3 : AbstractC1501.m2665(AbstractC1501.m2664(AbstractC1501.m2661(fArr, fArrM26572, new float[]{0.964212f, 1.0f, 0.825188f}), c14952.f4258)), AbstractC1501.m2660(c1494, c14943) ? fArr2 : AbstractC1501.m2664(AbstractC1501.m2661(fArr, fArrM2657, new float[]{0.964212f, 1.0f, 0.825188f}), fArr2));
        }
        this.f4208 = fArrM2664;
    }

    @Override // androidx.compose.ui.graphics.colorspace.C1486
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final long mo2646(long j) {
        float fM2942 = C1599.m2942(j);
        float fM2943 = C1599.m2943(j);
        float fM2937 = C1599.m2937(j);
        float fM2938 = C1599.m2938(j);
        C1500 c1500 = this.f4207.f4253;
        float fMo852 = (float) c1500.mo852(fM2942);
        float fMo8522 = (float) c1500.mo852(fM2943);
        float fMo8523 = (float) c1500.mo852(fM2937);
        float[] fArr = this.f4208;
        float f = (fArr[6] * fMo8523) + (fArr[3] * fMo8522) + (fArr[0] * fMo852);
        float f2 = (fArr[7] * fMo8523) + (fArr[4] * fMo8522) + (fArr[1] * fMo852);
        float f3 = (fArr[8] * fMo8523) + (fArr[5] * fMo8522) + (fArr[2] * fMo852);
        C1495 c1495 = this.f4206;
        float fMo8524 = (float) c1495.f4250.mo852(f);
        C1500 c15002 = c1495.f4250;
        return AbstractC1581.m2873(fMo8524, (float) c15002.mo852(f2), (float) c15002.mo852(f3), fM2938, c1495);
    }
}
