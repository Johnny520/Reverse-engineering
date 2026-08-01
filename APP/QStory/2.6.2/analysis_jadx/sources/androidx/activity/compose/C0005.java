package androidx.activity.compose;

import androidx.compose.foundation.draganddrop.AbstractC0455;

/* JADX INFO: renamed from: androidx.activity.compose.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0005 extends AbstractC0455 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final long f14;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Object f15;

    public C0005(Object obj, long j) {
        this.f15 = obj;
        this.f14 = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0005)) {
            return false;
        }
        C0005 c0005 = (C0005) obj;
        return this.f15.equals(c0005.f15) && this.f14 == c0005.f14;
    }

    public final int hashCode() {
        return Long.hashCode(this.f14) + (this.f15.hashCode() * 31);
    }

    public final String toString() {
        return "BackHandlerInfo(owner=" + this.f15 + ", compositeKey=" + this.f14 + ')';
    }
}
