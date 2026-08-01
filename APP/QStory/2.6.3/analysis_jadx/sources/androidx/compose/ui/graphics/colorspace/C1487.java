package androidx.compose.ui.graphics.colorspace;

import androidx.compose.ui.graphics.AbstractC1581;
import androidx.compose.ui.graphics.C1599;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.colorspace.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1487 extends C1486 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C1495 f4207;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C1495 f4208;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final float[] f4209;

    public C1487(C1495 c1495, C1495 c14952) {
        float[] fArrM2674;
        super(c14952, c1495, c14952, null);
        this.f4208 = c1495;
        this.f4207 = c14952;
        float[] fArr = C1491.f4238.f4239;
        C1494 c1494 = c1495.f4249;
        float[] fArr2 = c1495.f4259;
        C1494 c14942 = c14952.f4249;
        float[] fArr3 = c14952.f4260;
        if (AbstractC1501.m2670(c1494, c14942)) {
            fArrM2674 = AbstractC1501.m2674(fArr3, fArr2);
        } else {
            float[] fArrM2667 = c1494.m2667();
            float[] fArrM26672 = c14942.m2667();
            C1494 c14943 = AbstractC1501.f4278;
            fArrM2674 = AbstractC1501.m2674(AbstractC1501.m2670(c14942, c14943) ? fArr3 : AbstractC1501.m2675(AbstractC1501.m2674(AbstractC1501.m2671(fArr, fArrM26672, new float[]{0.964212f, 1.0f, 0.825188f}), c14952.f4259)), AbstractC1501.m2670(c1494, c14943) ? fArr2 : AbstractC1501.m2674(AbstractC1501.m2671(fArr, fArrM2667, new float[]{0.964212f, 1.0f, 0.825188f}), fArr2));
        }
        this.f4209 = fArrM2674;
    }

    @Override // androidx.compose.ui.graphics.colorspace.C1486
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final long mo2656(long j) {
        float fM2952 = C1599.m2952(j);
        float fM2953 = C1599.m2953(j);
        float fM2947 = C1599.m2947(j);
        float fM2948 = C1599.m2948(j);
        C1500 c1500 = this.f4208.f4254;
        float fMo853 = (float) c1500.mo853(fM2952);
        float fMo8532 = (float) c1500.mo853(fM2953);
        float fMo8533 = (float) c1500.mo853(fM2947);
        float[] fArr = this.f4209;
        float f = (fArr[6] * fMo8533) + (fArr[3] * fMo8532) + (fArr[0] * fMo853);
        float f2 = (fArr[7] * fMo8533) + (fArr[4] * fMo8532) + (fArr[1] * fMo853);
        float f3 = (fArr[8] * fMo8533) + (fArr[5] * fMo8532) + (fArr[2] * fMo853);
        C1495 c1495 = this.f4207;
        float fMo8534 = (float) c1495.f4251.mo853(f);
        C1500 c15002 = c1495.f4251;
        return AbstractC1581.m2883(fMo8534, (float) c15002.mo853(f2), (float) c15002.mo853(f3), fM2948, c1495);
    }
}
