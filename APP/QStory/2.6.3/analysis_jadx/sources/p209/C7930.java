package p209;

/* JADX INFO: renamed from: 飘花落叶言子苏哲楪兰世.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7930 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f21958;

    public final boolean equals(Object obj) {
        if (obj instanceof C7930) {
            return this.f21958 == ((C7930) obj).f21958;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f21958);
    }

    public final String toString() {
        int i = this.f21958;
        return i == 0 ? "LineHeightStyle.Mode.Fixed" : i == 1 ? "LineHeightStyle.Mode.Minimum" : i == 2 ? "LineHeightStyle.Mode.Tight" : "Invalid";
    }
}
