package p231;

import p120.AbstractC8107;

/* JADX INFO: renamed from: 飘花落叶言楪世兰哲子苏.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8786 extends AbstractC8107 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C8786 f22368 = new C8786(false);

    public final boolean equals(Object obj) {
        if (obj instanceof C8786) {
            return this.f19722 == ((C8786) obj).f19722;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f19722);
    }

    public final String toString() {
        return "Loading(endOfPaginationReached=" + this.f19722 + ")";
    }
}
