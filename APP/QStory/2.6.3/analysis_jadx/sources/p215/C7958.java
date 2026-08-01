package p215;

import p104.AbstractC7278;

/* JADX INFO: renamed from: 飘花落叶言楪世兰哲子苏.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7958 extends AbstractC7278 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Throwable f22024;

    public C7958(Throwable th) {
        super(false);
        this.f22024 = th;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C7958)) {
            return false;
        }
        C7958 c7958 = (C7958) obj;
        return this.f19377 == c7958.f19377 && this.f22024.equals(c7958.f22024);
    }

    public final int hashCode() {
        return this.f22024.hashCode() + Boolean.hashCode(this.f19377);
    }

    public final String toString() {
        return "Error(endOfPaginationReached=" + this.f19377 + ", error=" + this.f22024 + ")";
    }
}
