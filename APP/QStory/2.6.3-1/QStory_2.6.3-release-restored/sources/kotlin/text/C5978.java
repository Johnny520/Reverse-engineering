package kotlin.text;

import p064.C7348;

/* JADX INFO: renamed from: kotlin.text.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5978 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C7348 f15034;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f15035;

    public C5978(String str, C7348 c7348) {
        this.f15035 = str;
        this.f15034 = c7348;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5978)) {
            return false;
        }
        C5978 c5978 = (C5978) obj;
        return this.f15035.equals(c5978.f15035) && this.f15034.equals(c5978.f15034);
    }

    public final int hashCode() {
        return this.f15034.hashCode() + (this.f15035.hashCode() * 31);
    }

    public final String toString() {
        return "MatchGroup(value=" + this.f15035 + ", range=" + this.f15034 + ')';
    }
}
