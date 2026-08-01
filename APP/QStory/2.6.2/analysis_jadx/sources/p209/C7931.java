package p209;

/* JADX INFO: renamed from: 飘花落叶言子苏哲楪兰世.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7931 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f21966;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static String m13391(int i) {
        return i == 1 ? "Ltr" : i == 2 ? "Rtl" : i == 3 ? "Content" : i == 4 ? "ContentOrLtr" : i == 5 ? "ContentOrRtl" : i == 0 ? "Unspecified" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C7931) {
            return this.f21966 == ((C7931) obj).f21966;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f21966);
    }

    public final String toString() {
        return m13391(this.f21966);
    }
}
