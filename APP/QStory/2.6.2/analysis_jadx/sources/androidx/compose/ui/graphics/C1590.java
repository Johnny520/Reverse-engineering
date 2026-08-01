package androidx.compose.ui.graphics;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1590 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f4677;

    public final boolean equals(Object obj) {
        if (obj instanceof C1590) {
            return this.f4677 == ((C1590) obj).f4677;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f4677);
    }

    public final String toString() {
        int i = this.f4677;
        return i == 0 ? "Argb8888" : i == 1 ? "Alpha8" : i == 2 ? "Rgb565" : i == 3 ? "F16" : i == 4 ? "Gpu" : "Unknown";
    }
}
