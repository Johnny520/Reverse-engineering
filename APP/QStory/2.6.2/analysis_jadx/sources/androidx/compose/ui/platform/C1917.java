package androidx.compose.ui.platform;

import p205.C7905;

/* JADX INFO: renamed from: androidx.compose.ui.platform.飘花落叶言子苏哲楪世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1917 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C1917 f5661 = new C1917(0, 0);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final long f5662;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final long f5663;

    public C1917(long j, long j2) {
        this.f5663 = j;
        this.f5662 = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1917) {
            C1917 c1917 = (C1917) obj;
            return C7905.m13329(this.f5663, c1917.f5663) && this.f5662 == c1917.f5662;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f5662) + (Long.hashCode(this.f5663) * 31);
    }
}
