package p215;

import p104.AbstractC7277;

/* JADX INFO: renamed from: 飘花落叶言楪世兰哲子苏.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7954 extends AbstractC7277 {
    public final boolean equals(Object obj) {
        if (obj instanceof C7954) {
            return this.f19382 == ((C7954) obj).f19382;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f19382);
    }

    public final String toString() {
        return "NotLoading(endOfPaginationReached=" + this.f19382 + ")";
    }
}
