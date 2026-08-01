package p225;

/* JADX INFO: renamed from: 飘花落叶言子苏哲楪兰世.飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8754 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f22291;

    public final boolean equals(Object obj) {
        if (obj instanceof C8754) {
            return this.f22291 == ((C8754) obj).f22291;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f22291);
    }

    public final String toString() {
        int i = this.f22291;
        return i == 1 ? "Linearity.Linear" : i == 2 ? "Linearity.FontHinting" : i == 3 ? "Linearity.None" : "Invalid";
    }
}
