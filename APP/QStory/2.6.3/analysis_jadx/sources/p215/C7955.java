package p215;

import p104.AbstractC7278;

/* JADX INFO: renamed from: 飘花落叶言楪世兰哲子苏.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7955 extends AbstractC7278 {
    public final boolean equals(Object obj) {
        if (obj instanceof C7955) {
            return this.f19377 == ((C7955) obj).f19377;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f19377);
    }

    public final String toString() {
        return "NotLoading(endOfPaginationReached=" + this.f19377 + ")";
    }
}
