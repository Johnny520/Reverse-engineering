package p209;

/* JADX INFO: renamed from: 飘花落叶言子苏哲楪兰世.飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7924 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f21949;

    public final boolean equals(Object obj) {
        if (obj instanceof C7924) {
            return this.f21949 == ((C7924) obj).f21949;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f21949);
    }

    public final String toString() {
        int i = this.f21949;
        return i == 1 ? "Linearity.Linear" : i == 2 ? "Linearity.FontHinting" : i == 3 ? "Linearity.None" : "Invalid";
    }
}
