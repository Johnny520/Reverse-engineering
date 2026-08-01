package p111;

/* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7324 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f19531;

    public final boolean equals(Object obj) {
        if (obj instanceof C7324) {
            return this.f19531 == ((C7324) obj).f19531;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f19531);
    }

    public final String toString() {
        int i = this.f19531;
        return i == 1 ? "Touch" : i == 2 ? "Keyboard" : "Error";
    }
}
