package androidx.compose.ui.graphics.colorspace;

import androidx.compose.ui.graphics.C1599;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.colorspace.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class C1486 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final float[] f4203;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final AbstractC1490 f4204;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final AbstractC1490 f4205;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final AbstractC1490 f4206;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C1486(androidx.compose.ui.graphics.colorspace.AbstractC1490 r9, androidx.compose.ui.graphics.colorspace.AbstractC1490 r10, int r11) {
        /*
            r8 = this;
            long r0 = r9.f4236
            r2 = 12884901888(0x300000000, double:6.365987373E-314)
            boolean r0 = androidx.compose.ui.graphics.colorspace.AbstractC1501.m2668(r0, r2)
            if (r0 == 0) goto L12
            androidx.compose.ui.graphics.colorspace.飘花落叶言子楪世苏兰哲 r0 = androidx.compose.ui.graphics.colorspace.AbstractC1501.m2673(r9)
            goto L13
        L12:
            r0 = r9
        L13:
            long r4 = r10.f4236
            boolean r1 = androidx.compose.ui.graphics.colorspace.AbstractC1501.m2668(r4, r2)
            if (r1 == 0) goto L20
            androidx.compose.ui.graphics.colorspace.飘花落叶言子楪世苏兰哲 r1 = androidx.compose.ui.graphics.colorspace.AbstractC1501.m2673(r10)
            goto L21
        L20:
            r1 = r10
        L21:
            r4 = 3
            if (r11 != r4) goto L6c
            long r5 = r9.f4236
            boolean r11 = androidx.compose.ui.graphics.colorspace.AbstractC1501.m2668(r5, r2)
            long r5 = r10.f4236
            boolean r2 = androidx.compose.ui.graphics.colorspace.AbstractC1501.m2668(r5, r2)
            if (r11 == 0) goto L35
            if (r2 == 0) goto L35
            goto L6c
        L35:
            if (r11 != 0) goto L39
            if (r2 == 0) goto L6c
        L39:
            if (r11 == 0) goto L3c
            goto L3d
        L3c:
            r9 = r10
        L3d:
            androidx.compose.ui.graphics.colorspace.飘花落叶言子楪哲苏世兰 r9 = (androidx.compose.ui.graphics.colorspace.C1495) r9
            androidx.compose.ui.graphics.colorspace.飘花落叶言子楪哲兰世苏 r9 = r9.f4249
            float[] r3 = androidx.compose.ui.graphics.colorspace.AbstractC1501.f4275
            if (r11 == 0) goto L4a
            float[] r11 = r9.m2667()
            goto L4b
        L4a:
            r11 = r3
        L4b:
            if (r2 == 0) goto L51
            float[] r3 = r9.m2667()
        L51:
            r9 = 0
            r2 = r11[r9]
            r5 = r3[r9]
            float r2 = r2 / r5
            r5 = 1
            r6 = r11[r5]
            r7 = r3[r5]
            float r6 = r6 / r7
            r7 = 2
            r11 = r11[r7]
            r3 = r3[r7]
            float r11 = r11 / r3
            float[] r3 = new float[r4]
            r3[r9] = r2
            r3[r5] = r6
            r3[r7] = r11
            goto L6d
        L6c:
            r3 = 0
        L6d:
            r8.<init>(r10, r0, r1, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.colorspace.C1486.<init>(androidx.compose.ui.graphics.colorspace.飘花落叶言子楪世苏兰哲, androidx.compose.ui.graphics.colorspace.飘花落叶言子楪世苏兰哲, int):void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public long mo2656(long j) {
        float fM2952 = C1599.m2952(j);
        float fM2953 = C1599.m2953(j);
        float fM2947 = C1599.m2947(j);
        float fM2948 = C1599.m2948(j);
        AbstractC1490 abstractC1490 = this.f4205;
        long jMo2663 = abstractC1490.mo2663(fM2952, fM2953, fM2947);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jMo2663 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jMo2663 & 4294967295L));
        float fMo2662 = abstractC1490.mo2662(fM2952, fM2953, fM2947);
        float[] fArr = this.f4203;
        if (fArr != null) {
            fIntBitsToFloat *= fArr[0];
            fIntBitsToFloat2 *= fArr[1];
            fMo2662 *= fArr[2];
        }
        float f = fIntBitsToFloat;
        float f2 = fIntBitsToFloat2;
        return this.f4204.mo2661(f, f2, fMo2662, fM2948, this.f4206);
    }

    public C1486(AbstractC1490 abstractC1490, AbstractC1490 abstractC14902, AbstractC1490 abstractC14903, float[] fArr) {
        this.f4206 = abstractC1490;
        this.f4205 = abstractC14902;
        this.f4204 = abstractC14903;
        this.f4203 = fArr;
    }
}
