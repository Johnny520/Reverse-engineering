package p121;

import kotlin.jvm.internal.AbstractC5227;

/* JADX INFO: renamed from: 飘花落叶言世苏楪子哲兰.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8134 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Object f19792;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Object f19793;

    public C8134(Object obj, Object obj2) {
        this.f19793 = obj;
        this.f19792 = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8134)) {
            return false;
        }
        C8134 c8134 = (C8134) obj;
        return AbstractC5227.m9466(this.f19793, c8134.f19793) && AbstractC5227.m9466(this.f19792, c8134.f19792);
    }

    public final int hashCode() {
        Object obj = this.f19793;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f19792;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "ApproximationBounds(lower=" + this.f19793 + ", upper=" + this.f19792 + ')';
    }
}
