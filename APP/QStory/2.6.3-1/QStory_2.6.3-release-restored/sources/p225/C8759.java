package p225;

/* JADX INFO: renamed from: 飘花落叶言子苏哲楪兰世.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8759 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f22303;

    public final boolean equals(Object obj) {
        if (obj instanceof C8759) {
            return this.f22303 == ((C8759) obj).f22303;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f22303);
    }

    public final String toString() {
        int i = this.f22303;
        return i == 0 ? "LineHeightStyle.Mode.Fixed" : i == 1 ? "LineHeightStyle.Mode.Minimum" : i == 2 ? "LineHeightStyle.Mode.Tight" : "Invalid";
    }
}
