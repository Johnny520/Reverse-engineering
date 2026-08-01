package androidx.compose.p001ui.text.font;

/* JADX INFO: renamed from: androidx.compose.ui.text.font.飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2821 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f6215;

    public final boolean equals(Object obj) {
        if (obj instanceof C2821) {
            return this.f6215 == ((C2821) obj).f6215;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f6215);
    }

    public final String toString() {
        int i = this.f6215;
        return i == 0 ? "None" : i == 1 ? "Weight" : i == 2 ? "Style" : i == 65535 ? "All" : "Invalid";
    }
}
