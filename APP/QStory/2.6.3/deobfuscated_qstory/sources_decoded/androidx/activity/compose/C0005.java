package androidx.activity.compose;

import com.bumptech.glide.AbstractC3056;

/* JADX INFO: renamed from: androidx.activity.compose.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0005 extends AbstractC3056 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final Object f14;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final long f15;

    public C0005(Object obj, long j) {
        this.f14 = obj;
        this.f15 = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0005)) {
            return false;
        }
        C0005 c0005 = (C0005) obj;
        return this.f14.equals(c0005.f14) && this.f15 == c0005.f15;
    }

    public final int hashCode() {
        return Long.hashCode(this.f15) + (this.f14.hashCode() * 31);
    }

    public final String toString() {
        return "BackHandlerInfo(owner=" + this.f14 + ", compositeKey=" + this.f15 + ')';
    }
}
