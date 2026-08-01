package androidx.compose.ui.spatial;

import androidx.activity.AbstractC0053;
import androidx.compose.foundation.lazy.layout.C0704;
import java.util.Arrays;

/* JADX INFO: renamed from: androidx.compose.ui.spatial.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1960 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final float[] f5811;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final long f5812;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final long f5813;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final long f5814;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final long f5815;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final long f5816;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final C0704 f5817;

    public C1960(long j, long j2, long j3, long j4, long j5, float[] fArr, C0704 c0704) {
        this.f5816 = j;
        this.f5815 = j2;
        this.f5814 = j3;
        this.f5813 = j4;
        this.f5812 = j5;
        this.f5811 = fArr;
        this.f5817 = c0704;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 1
            if (r6 != r7) goto L4
            return r0
        L4:
            r1 = 0
            if (r7 == 0) goto L61
            java.lang.Class<androidx.compose.ui.spatial.飘花落叶言子楪世兰哲苏> r2 = androidx.compose.ui.spatial.C1960.class
            java.lang.Class r3 = r7.getClass()
            if (r2 == r3) goto L10
            goto L61
        L10:
            androidx.compose.ui.spatial.飘花落叶言子楪世兰哲苏 r7 = (androidx.compose.ui.spatial.C1960) r7
            long r2 = r6.f5816
            long r4 = r7.f5816
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L1b
            goto L61
        L1b:
            long r2 = r6.f5815
            long r4 = r7.f5815
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L24
            goto L61
        L24:
            long r2 = r6.f5812
            long r4 = r7.f5812
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L2d
            goto L61
        L2d:
            long r2 = r6.f5814
            long r4 = r7.f5814
            boolean r2 = p205.C7907.m13336(r2, r4)
            if (r2 != 0) goto L38
            goto L61
        L38:
            long r2 = r6.f5813
            long r4 = r7.f5813
            boolean r2 = p205.C7907.m13336(r2, r4)
            if (r2 != 0) goto L43
            goto L61
        L43:
            float[] r2 = r7.f5811
            float[] r3 = r6.f5811
            if (r3 != 0) goto L4f
            if (r2 != 0) goto L4d
            r2 = r0
            goto L56
        L4d:
            r2 = r1
            goto L56
        L4f:
            if (r2 != 0) goto L52
            goto L4d
        L52:
            boolean r2 = r3.equals(r2)
        L56:
            if (r2 != 0) goto L59
            goto L61
        L59:
            androidx.compose.foundation.lazy.layout.飘花落叶言子楪世哲兰苏 r6 = r6.f5817
            androidx.compose.foundation.lazy.layout.飘花落叶言子楪世哲兰苏 r7 = r7.f5817
            if (r6 == r7) goto L60
            return r1
        L60:
            return r0
        L61:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.spatial.C1960.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int iM141 = AbstractC0053.m141(AbstractC0053.m141(AbstractC0053.m141(AbstractC0053.m141(Long.hashCode(this.f5816) * 31, 31, this.f5815), 31, this.f5812), 31, this.f5814), 31, this.f5813);
        float[] fArr = this.f5811;
        return this.f5817.hashCode() + ((iM141 + (fArr != null ? Arrays.hashCode(fArr) : 0)) * 31);
    }
}
