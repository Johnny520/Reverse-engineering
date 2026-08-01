package androidx.activity.compose;

import com.bumptech.glide.AbstractC3888;

/* JADX INFO: renamed from: androidx.activity.compose.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0852 extends AbstractC3888 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final Object f359;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final long f360;

    public C0852(Object obj, long j) {
        this.f359 = obj;
        this.f360 = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0852)) {
            return false;
        }
        C0852 c0852 = (C0852) obj;
        return this.f359.equals(c0852.f359) && this.f360 == c0852.f360;
    }

    public final int hashCode() {
        return Long.hashCode(this.f360) + (this.f359.hashCode() * 31);
    }

    public final String toString() {
        return "BackHandlerInfo(owner=" + this.f359 + ", compositeKey=" + this.f360 + ')';
    }
}
