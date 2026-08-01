package androidx.compose.p001ui.spatial;

import androidx.collection.AbstractC1120;
import androidx.collection.C1093;
import p221.C8737;

/* JADX INFO: renamed from: androidx.compose.ui.spatial.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2801 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public long f6181;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public long f6182;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public long f6183;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public long f6184;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public C2802 f6185;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C1093 f6186;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public float[] f6187;

    public C2801() {
        C1093 c1093 = AbstractC1120.f1323;
        this.f6186 = new C1093();
        this.f6184 = -1L;
        this.f6183 = 0L;
        this.f6182 = 0L;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean m4252(long j, long j2, float[] fArr, int i, int i2) {
        boolean z;
        if (C8737.m13923(j2, this.f6183)) {
            z = false;
        } else {
            this.f6183 = j2;
            z = true;
        }
        if (!C8737.m13923(j, this.f6182)) {
            this.f6182 = j;
            z = true;
        }
        if (fArr != null) {
            this.f6187 = fArr;
            z = true;
        }
        long j3 = (((long) i) << 32) | (((long) i2) & 4294967295L);
        if (j3 == this.f6181) {
            return z;
        }
        this.f6181 = j3;
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m4253(C2802 c2802, long j, long j2, float[] fArr, long j3) {
        long j4 = c2802.f6195;
        if (j3 - j4 > 0 || j4 == Long.MIN_VALUE) {
            c2802.f6195 = j3;
            c2802.m4255(c2802.f6189, c2802.f6188, j, j2, fArr);
        }
    }
}
