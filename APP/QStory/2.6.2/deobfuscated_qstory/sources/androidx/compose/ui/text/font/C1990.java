package androidx.compose.ui.text.font;

/* JADX INFO: renamed from: androidx.compose.ui.text.font.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1990 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f5879;

    public final boolean equals(Object obj) {
        if (obj instanceof C1990) {
            return this.f5879 == ((C1990) obj).f5879;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f5879);
    }

    public final String toString() {
        int i = this.f5879;
        return i == 0 ? "Normal" : i == 1 ? "Italic" : "Invalid";
    }
}
