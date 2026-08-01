package kotlin.text;

import p048.C6518;

/* JADX INFO: renamed from: kotlin.text.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5145 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C6518 f14689;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f14690;

    public C5145(String str, C6518 c6518) {
        this.f14690 = str;
        this.f14689 = c6518;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5145)) {
            return false;
        }
        C5145 c5145 = (C5145) obj;
        return this.f14690.equals(c5145.f14690) && this.f14689.equals(c5145.f14689);
    }

    public final int hashCode() {
        return this.f14689.hashCode() + (this.f14690.hashCode() * 31);
    }

    public final String toString() {
        return "MatchGroup(value=" + this.f14690 + ", range=" + this.f14689 + ')';
    }
}
