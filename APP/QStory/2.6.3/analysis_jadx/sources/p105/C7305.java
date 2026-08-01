package p105;

import kotlin.jvm.internal.AbstractC4395;

/* JADX INFO: renamed from: 飘花落叶言世苏楪子哲兰.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7305 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Object f19447;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Object f19448;

    public C7305(Object obj, Object obj2) {
        this.f19448 = obj;
        this.f19447 = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7305)) {
            return false;
        }
        C7305 c7305 = (C7305) obj;
        return AbstractC4395.m8907(this.f19448, c7305.f19448) && AbstractC4395.m8907(this.f19447, c7305.f19447);
    }

    public final int hashCode() {
        Object obj = this.f19448;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f19447;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "ApproximationBounds(lower=" + this.f19448 + ", upper=" + this.f19447 + ')';
    }
}
