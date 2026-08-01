package p225;

/* JADX INFO: renamed from: 飘花落叶言子苏哲楪兰世.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8748 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f22285;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static String m13974(int i) {
        return i == 1 ? "Hyphens.None" : i == 2 ? "Hyphens.Auto" : i == 0 ? "Hyphens.Unspecified" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C8748) {
            return this.f22285 == ((C8748) obj).f22285;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f22285);
    }

    public final String toString() {
        return m13974(this.f22285);
    }
}
