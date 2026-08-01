package androidx.compose.ui.graphics.colorspace;

import androidx.compose.ui.graphics.C1599;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.colorspace.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public class C1486 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final float[] f4202;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final AbstractC1490 f4203;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final AbstractC1490 f4204;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final AbstractC1490 f4205;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C1486(androidx.compose.ui.graphics.colorspace.AbstractC1490 r9, androidx.compose.ui.graphics.colorspace.AbstractC1490 r10, int r11) {
        /*
            r8 = this;
            long r0 = r9.f4235
            r2 = 12884901888(0x300000000, double:6.365987373E-314)
            boolean r0 = androidx.compose.ui.graphics.colorspace.AbstractC1501.m2658(r0, r2)
            if (r0 == 0) goto L12
            androidx.compose.ui.graphics.colorspace.飘花落叶言子楪世苏兰哲 r0 = androidx.compose.ui.graphics.colorspace.AbstractC1501.m2663(r9)
            goto L13
        L12:
            r0 = r9
        L13:
            long r4 = r10.f4235
            boolean r1 = androidx.compose.ui.graphics.colorspace.AbstractC1501.m2658(r4, r2)
            if (r1 == 0) goto L20
            androidx.compose.ui.graphics.colorspace.飘花落叶言子楪世苏兰哲 r1 = androidx.compose.ui.graphics.colorspace.AbstractC1501.m2663(r10)
            goto L21
        L20:
            r1 = r10
        L21:
            r4 = 3
            if (r11 != r4) goto L6c
            long r5 = r9.f4235
            boolean r11 = androidx.compose.ui.graphics.colorspace.AbstractC1501.m2658(r5, r2)
            long r5 = r10.f4235
            boolean r2 = androidx.compose.ui.graphics.colorspace.AbstractC1501.m2658(r5, r2)
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
            androidx.compose.ui.graphics.colorspace.飘花落叶言子楪哲兰世苏 r9 = r9.f4248
            float[] r3 = androidx.compose.ui.graphics.colorspace.AbstractC1501.f4274
            if (r11 == 0) goto L4a
            float[] r11 = r9.m2657()
            goto L4b
        L4a:
            r11 = r3
        L4b:
            if (r2 == 0) goto L51
            float[] r3 = r9.m2657()
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
    public long mo2646(long j) {
        float fM2942 = C1599.m2942(j);
        float fM2943 = C1599.m2943(j);
        float fM2937 = C1599.m2937(j);
        float fM2938 = C1599.m2938(j);
        AbstractC1490 abstractC1490 = this.f4204;
        long jMo2653 = abstractC1490.mo2653(fM2942, fM2943, fM2937);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jMo2653 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jMo2653 & 4294967295L));
        float fMo2652 = abstractC1490.mo2652(fM2942, fM2943, fM2937);
        float[] fArr = this.f4202;
        if (fArr != null) {
            fIntBitsToFloat *= fArr[0];
            fIntBitsToFloat2 *= fArr[1];
            fMo2652 *= fArr[2];
        }
        float f = fIntBitsToFloat;
        float f2 = fIntBitsToFloat2;
        return this.f4203.mo2651(f, f2, fMo2652, fM2938, this.f4205);
    }

    public C1486(AbstractC1490 abstractC1490, AbstractC1490 abstractC14902, AbstractC1490 abstractC14903, float[] fArr) {
        this.f4205 = abstractC1490;
        this.f4204 = abstractC14902;
        this.f4203 = abstractC14903;
        this.f4202 = fArr;
    }
}
