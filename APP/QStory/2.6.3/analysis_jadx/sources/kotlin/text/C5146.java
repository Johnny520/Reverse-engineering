package kotlin.text;

import p048.C6519;

/* JADX INFO: renamed from: kotlin.text.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5146 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C6519 f14689;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f14690;

    public C5146(String str, C6519 c6519) {
        this.f14690 = str;
        this.f14689 = c6519;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5146)) {
            return false;
        }
        C5146 c5146 = (C5146) obj;
        return this.f14690.equals(c5146.f14690) && this.f14689.equals(c5146.f14689);
    }

    public final int hashCode() {
        return this.f14689.hashCode() + (this.f14690.hashCode() * 31);
    }

    public final String toString() {
        return "MatchGroup(value=" + this.f14690 + ", range=" + this.f14689 + ')';
    }
}
