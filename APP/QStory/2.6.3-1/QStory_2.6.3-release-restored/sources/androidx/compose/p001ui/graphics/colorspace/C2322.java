package androidx.compose.p001ui.graphics.colorspace;

import androidx.compose.p001ui.graphics.AbstractC2416;
import androidx.compose.p001ui.graphics.C2434;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.colorspace.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2322 extends C2321 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C2330 f4552;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C2330 f4553;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final float[] f4554;

    public C2322(C2330 c2330, C2330 c23302) {
        float[] fArrM3234;
        super(c23302, c2330, c23302, null);
        this.f4553 = c2330;
        this.f4552 = c23302;
        float[] fArr = C2326.f4583.f4584;
        C2329 c2329 = c2330.f4594;
        float[] fArr2 = c2330.f4604;
        C2329 c23292 = c23302.f4594;
        float[] fArr3 = c23302.f4605;
        if (AbstractC2336.m3230(c2329, c23292)) {
            fArrM3234 = AbstractC2336.m3234(fArr3, fArr2);
        } else {
            float[] fArrM3227 = c2329.m3227();
            float[] fArrM32272 = c23292.m3227();
            C2329 c23293 = AbstractC2336.f4623;
            fArrM3234 = AbstractC2336.m3234(AbstractC2336.m3230(c23292, c23293) ? fArr3 : AbstractC2336.m3235(AbstractC2336.m3234(AbstractC2336.m3231(fArr, fArrM32272, new float[]{0.964212f, 1.0f, 0.825188f}), c23302.f4604)), AbstractC2336.m3230(c2329, c23293) ? fArr2 : AbstractC2336.m3234(AbstractC2336.m3231(fArr, fArrM3227, new float[]{0.964212f, 1.0f, 0.825188f}), fArr2));
        }
        this.f4554 = fArrM3234;
    }

    @Override // androidx.compose.p001ui.graphics.colorspace.C2321
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final long mo3216(long j) {
        float fM3512 = C2434.m3512(j);
        float fM3513 = C2434.m3513(j);
        float fM3507 = C2434.m3507(j);
        float fM3508 = C2434.m3508(j);
        C2335 c2335 = this.f4553.f4599;
        float fMo1413 = (float) c2335.mo1413(fM3512);
        float fMo14132 = (float) c2335.mo1413(fM3513);
        float fMo14133 = (float) c2335.mo1413(fM3507);
        float[] fArr = this.f4554;
        float f = (fArr[6] * fMo14133) + (fArr[3] * fMo14132) + (fArr[0] * fMo1413);
        float f2 = (fArr[7] * fMo14133) + (fArr[4] * fMo14132) + (fArr[1] * fMo1413);
        float f3 = (fArr[8] * fMo14133) + (fArr[5] * fMo14132) + (fArr[2] * fMo1413);
        C2330 c2330 = this.f4552;
        float fMo14134 = (float) c2330.f4596.mo1413(f);
        C2335 c23352 = c2330.f4596;
        return AbstractC2416.m3443(fMo14134, (float) c23352.mo1413(f2), (float) c23352.mo1413(f3), fM3508, c2330);
    }
}
