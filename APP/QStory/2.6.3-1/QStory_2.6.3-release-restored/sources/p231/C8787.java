package p231;

import p120.AbstractC8107;

/* JADX INFO: renamed from: 飘花落叶言楪世兰哲子苏.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8787 extends AbstractC8107 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Throwable f22369;

    public C8787(Throwable th) {
        super(false);
        this.f22369 = th;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C8787)) {
            return false;
        }
        C8787 c8787 = (C8787) obj;
        return this.f19722 == c8787.f19722 && this.f22369.equals(c8787.f22369);
    }

    public final int hashCode() {
        return this.f22369.hashCode() + Boolean.hashCode(this.f19722);
    }

    public final String toString() {
        return "Error(endOfPaginationReached=" + this.f19722 + ", error=" + this.f22369 + ")";
    }
}
