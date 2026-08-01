package androidx.compose.ui.text.font;

/* JADX INFO: renamed from: androidx.compose.ui.text.font.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1990 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f5880;

    public final boolean equals(Object obj) {
        if (obj instanceof C1990) {
            return this.f5880 == ((C1990) obj).f5880;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f5880);
    }

    public final String toString() {
        int i = this.f5880;
        return i == 0 ? "Normal" : i == 1 ? "Italic" : "Invalid";
    }
}
