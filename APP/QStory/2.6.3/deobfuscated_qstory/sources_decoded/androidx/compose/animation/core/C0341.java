package androidx.compose.animation.core;

import androidx.activity.AbstractC0053;
import androidx.compose.ui.graphics.AbstractC1581;
import net.bytebuddy.pool.TypePool;

/* JADX INFO: renamed from: androidx.compose.animation.core.飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0341 implements InterfaceC0335 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final float f1150;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final float f1151;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final float f1152;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final float f1153;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final float f1154;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final float f1155;

    public C0341(float f, float f2, float f3, float f4) {
        int iM2876;
        this.f1155 = f;
        this.f1153 = f2;
        this.f1154 = f3;
        this.f1151 = f4;
        if (!((Float.isNaN(f) || Float.isNaN(f2) || Float.isNaN(f3) || Float.isNaN(f4)) ? false : true)) {
            AbstractC0300.m929("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: " + f + ", " + f2 + ", " + f3 + ", " + f4 + TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
        }
        float[] fArr = new float[5];
        float f5 = (f2 - 0.0f) * 3.0f;
        float f6 = (f4 - f2) * 3.0f;
        float f7 = (1.0f - f4) * 3.0f;
        double d = f5;
        double d2 = f6;
        double d3 = f7;
        double d4 = d2 * 2.0d;
        double d5 = (d - d4) + d3;
        if (d5 == 0.0d) {
            iM2876 = d2 == d3 ? 0 : AbstractC1581.m2876((float) ((d4 - d3) / (d4 - (d3 * 2.0d))), fArr, 0);
        } else {
            double d6 = -Math.sqrt((d2 * d2) - (d3 * d));
            double d7 = (-d) + d2;
            int iM28762 = AbstractC1581.m2876((float) ((-(d6 + d7)) / d5), fArr, 0);
            int iM28763 = AbstractC1581.m2876((float) ((d6 - d7) / d5), fArr, iM28762) + iM28762;
            if (iM28763 > 1) {
                float f8 = fArr[0];
                float f9 = fArr[1];
                if (f8 > f9) {
                    fArr[0] = f9;
                    fArr[1] = f8;
                } else if (f8 == f9) {
                    iM2876 = iM28763 - 1;
                }
                iM2876 = iM28763;
            } else {
                iM2876 = iM28763;
            }
        }
        float f10 = (f6 - f5) * 2.0f;
        int iM28764 = AbstractC1581.m2876((-f10) / (((f7 - f6) * 2.0f) - f10), fArr, iM2876) + iM2876;
        float fMin = Math.min(0.0f, 1.0f);
        float fMax = Math.max(0.0f, 1.0f);
        for (int i = 0; i < iM28764; i++) {
            float f11 = fArr[i];
            float f12 = (((((((((f2 - f4) * 3.0f) + 1.0f) - 0.0f) * f11) + (((f4 - (f2 * 2.0f)) + 0.0f) * 3.0f)) * f11) + f5) * f11) + 0.0f;
            fMin = Math.min(fMin, f12);
            fMax = Math.max(fMax, f12);
        }
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fMin)) << 32) | (((long) Float.floatToRawIntBits(fMax)) & 4294967295L);
        this.f1150 = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
        this.f1152 = Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0341)) {
            return false;
        }
        C0341 c0341 = (C0341) obj;
        return this.f1155 == c0341.f1155 && this.f1153 == c0341.f1153 && this.f1154 == c0341.f1154 && this.f1151 == c0341.f1151;
    }

    public final int hashCode() {
        return Float.hashCode(this.f1151) + AbstractC0053.m145(AbstractC0053.m145(Float.hashCode(this.f1155) * 31, this.f1153, 31), this.f1154, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CubicBezierEasing(a=");
        sb.append(this.f1155);
        sb.append(", b=");
        sb.append(this.f1153);
        sb.append(", c=");
        sb.append(this.f1154);
        sb.append(", d=");
        return AbstractC0053.m155(sb, this.f1151, ')');
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0092 A[PHI: r3
  0x0092: PHI (r3v27 float) = (r3v5 float), (r3v16 float), (r3v21 float), (r3v31 float), (r3v36 float) binds: [B:128:0x0236, B:117:0x0206, B:92:0x01bb, B:47:0x00e5, B:22:0x008e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0162 A[PHI: r12
  0x0162: PHI (r12v41 float) = (r12v25 float), (r12v36 float) binds: [B:68:0x0160, B:81:0x0191] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.compose.animation.core.InterfaceC0335
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float mo851(float r27) {
        /*
            Method dump skipped, instruction units count: 658
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.C0341.mo851(float):float");
    }
}
