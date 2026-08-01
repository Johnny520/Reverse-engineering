package p215;

import p104.AbstractC7278;

/* JADX INFO: renamed from: 飘花落叶言楪世兰哲子苏.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7957 extends AbstractC7278 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C7957 f22023 = new C7957(false);

    public final boolean equals(Object obj) {
        if (obj instanceof C7957) {
            return this.f19377 == ((C7957) obj).f19377;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f19377);
    }

    public final String toString() {
        return "Loading(endOfPaginationReached=" + this.f19377 + ")";
    }
}
