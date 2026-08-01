package androidx.compose.ui.text.font;

/* JADX INFO: renamed from: androidx.compose.ui.text.font.飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1987 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f5869;

    public final boolean equals(Object obj) {
        if (obj instanceof C1987) {
            return this.f5869 == ((C1987) obj).f5869;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f5869);
    }

    public final String toString() {
        int i = this.f5869;
        return i == 0 ? "None" : i == 1 ? "Weight" : i == 2 ? "Style" : i == 65535 ? "All" : "Invalid";
    }
}
