package androidx.compose.ui.spatial;

import androidx.collection.AbstractC0273;
import androidx.collection.C0246;
import p205.C7908;

/* JADX INFO: renamed from: androidx.compose.ui.spatial.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1966 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public long f5836;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public long f5837;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public long f5838;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public long f5839;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public C1967 f5840;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C0246 f5841;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public float[] f5842;

    public C1966() {
        C0246 c0246 = AbstractC0273.f978;
        this.f5841 = new C0246();
        this.f5839 = -1L;
        this.f5838 = 0L;
        this.f5837 = 0L;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean m3692(long j, long j2, float[] fArr, int i, int i2) {
        boolean z;
        if (C7908.m13364(j2, this.f5838)) {
            z = false;
        } else {
            this.f5838 = j2;
            z = true;
        }
        if (!C7908.m13364(j, this.f5837)) {
            this.f5837 = j;
            z = true;
        }
        if (fArr != null) {
            this.f5842 = fArr;
            z = true;
        }
        long j3 = (((long) i) << 32) | (((long) i2) & 4294967295L);
        if (j3 == this.f5836) {
            return z;
        }
        this.f5836 = j3;
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m3693(C1967 c1967, long j, long j2, float[] fArr, long j3) {
        long j4 = c1967.f5850;
        if (j3 - j4 > 0 || j4 == Long.MIN_VALUE) {
            c1967.f5850 = j3;
            c1967.m3695(c1967.f5844, c1967.f5843, j, j2, fArr);
        }
    }
}
