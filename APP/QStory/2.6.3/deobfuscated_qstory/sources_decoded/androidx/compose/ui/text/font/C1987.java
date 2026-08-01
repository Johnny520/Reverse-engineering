package androidx.compose.ui.text.font;

/* JADX INFO: renamed from: androidx.compose.ui.text.font.飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1987 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f5870;

    public final boolean equals(Object obj) {
        if (obj instanceof C1987) {
            return this.f5870 == ((C1987) obj).f5870;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f5870);
    }

    public final String toString() {
        int i = this.f5870;
        return i == 0 ? "None" : i == 1 ? "Weight" : i == 2 ? "Style" : i == 65535 ? "All" : "Invalid";
    }
}
