package androidx.compose.p001ui.graphics.colorspace;

import androidx.compose.p001ui.graphics.C2434;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.colorspace.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class C2321 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final float[] f4548;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final AbstractC2325 f4549;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final AbstractC2325 f4550;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final AbstractC2325 f4551;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C2321(AbstractC2325 abstractC2325, AbstractC2325 abstractC23252, int i) {
        float[] fArr;
        AbstractC2325 abstractC2325M3233 = AbstractC2336.m3228(abstractC2325.f4581, 12884901888L) ? AbstractC2336.m3233(abstractC2325) : abstractC2325;
        AbstractC2325 abstractC2325M32332 = AbstractC2336.m3228(abstractC23252.f4581, 12884901888L) ? AbstractC2336.m3233(abstractC23252) : abstractC23252;
        if (i == 3) {
            boolean zM3228 = AbstractC2336.m3228(abstractC2325.f4581, 12884901888L);
            boolean zM32282 = AbstractC2336.m3228(abstractC23252.f4581, 12884901888L);
            if (!(zM3228 && zM32282) && (zM3228 || zM32282)) {
                C2329 c2329 = ((C2330) (zM3228 ? abstractC2325 : abstractC23252)).f4594;
                float[] fArrM3227 = AbstractC2336.f4620;
                float[] fArrM32272 = zM3228 ? c2329.m3227() : fArrM3227;
                fArrM3227 = zM32282 ? c2329.m3227() : fArrM3227;
                fArr = new float[]{fArrM32272[0] / fArrM3227[0], fArrM32272[1] / fArrM3227[1], fArrM32272[2] / fArrM3227[2]};
            } else {
                fArr = null;
            }
        }
        this(abstractC23252, abstractC2325M3233, abstractC2325M32332, fArr);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public long mo3216(long j) {
        float fM3512 = C2434.m3512(j);
        float fM3513 = C2434.m3513(j);
        float fM3507 = C2434.m3507(j);
        float fM3508 = C2434.m3508(j);
        AbstractC2325 abstractC2325 = this.f4550;
        long jMo3223 = abstractC2325.mo3223(fM3512, fM3513, fM3507);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jMo3223 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jMo3223 & 4294967295L));
        float fMo3222 = abstractC2325.mo3222(fM3512, fM3513, fM3507);
        float[] fArr = this.f4548;
        if (fArr != null) {
            fIntBitsToFloat *= fArr[0];
            fIntBitsToFloat2 *= fArr[1];
            fMo3222 *= fArr[2];
        }
        float f = fIntBitsToFloat;
        float f2 = fIntBitsToFloat2;
        return this.f4549.mo3221(f, f2, fMo3222, fM3508, this.f4551);
    }

    public C2321(AbstractC2325 abstractC2325, AbstractC2325 abstractC23252, AbstractC2325 abstractC23253, float[] fArr) {
        this.f4551 = abstractC2325;
        this.f4550 = abstractC23252;
        this.f4549 = abstractC23253;
        this.f4548 = fArr;
    }
}
