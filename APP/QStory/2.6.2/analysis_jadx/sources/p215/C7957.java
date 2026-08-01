package p215;

import p104.AbstractC7277;

/* JADX INFO: renamed from: 飘花落叶言楪世兰哲子苏.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7957 extends AbstractC7277 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Throwable f22027;

    public C7957(Throwable th) {
        super(false);
        this.f22027 = th;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C7957)) {
            return false;
        }
        C7957 c7957 = (C7957) obj;
        return this.f19382 == c7957.f19382 && this.f22027.equals(c7957.f22027);
    }

    public final int hashCode() {
        return this.f22027.hashCode() + Boolean.hashCode(this.f19382);
    }

    public final String toString() {
        return "Error(endOfPaginationReached=" + this.f19382 + ", error=" + this.f22027 + ")";
    }
}
