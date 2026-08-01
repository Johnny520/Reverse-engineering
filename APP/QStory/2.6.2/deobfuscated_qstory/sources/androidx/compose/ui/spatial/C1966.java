package androidx.compose.ui.spatial;

import androidx.collection.AbstractC0273;
import androidx.collection.C0246;
import p205.C7907;

/* JADX INFO: renamed from: androidx.compose.ui.spatial.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1966 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public long f5835;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public long f5836;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public long f5837;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public long f5838;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public C1967 f5839;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C0246 f5840;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public float[] f5841;

    public C1966() {
        C0246 c0246 = AbstractC0273.f978;
        this.f5840 = new C0246();
        this.f5838 = -1L;
        this.f5837 = 0L;
        this.f5836 = 0L;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean m3682(long j, long j2, float[] fArr, int i, int i2) {
        boolean z;
        if (C7907.m13336(j2, this.f5837)) {
            z = false;
        } else {
            this.f5837 = j2;
            z = true;
        }
        if (!C7907.m13336(j, this.f5836)) {
            this.f5836 = j;
            z = true;
        }
        if (fArr != null) {
            this.f5841 = fArr;
            z = true;
        }
        long j3 = (((long) i) << 32) | (((long) i2) & 4294967295L);
        if (j3 == this.f5835) {
            return z;
        }
        this.f5835 = j3;
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m3683(C1967 c1967, long j, long j2, float[] fArr, long j3) {
        long j4 = c1967.f5849;
        if (j3 - j4 > 0 || j4 == Long.MIN_VALUE) {
            c1967.f5849 = j3;
            c1967.m3685(c1967.f5843, c1967.f5842, j, j2, fArr);
        }
    }
}
