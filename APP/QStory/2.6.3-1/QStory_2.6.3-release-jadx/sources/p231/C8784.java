package p231;

import p120.AbstractC8107;

/* JADX INFO: renamed from: 飘花落叶言楪世兰哲子苏.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8784 extends AbstractC8107 {
    public final boolean equals(Object obj) {
        if (obj instanceof C8784) {
            return this.f19722 == ((C8784) obj).f19722;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f19722);
    }

    public final String toString() {
        return "NotLoading(endOfPaginationReached=" + this.f19722 + ")";
    }
}
