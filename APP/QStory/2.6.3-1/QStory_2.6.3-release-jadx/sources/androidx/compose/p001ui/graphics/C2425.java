package androidx.compose.p001ui.graphics;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2425 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f5023;

    public final boolean equals(Object obj) {
        if (obj instanceof C2425) {
            return this.f5023 == ((C2425) obj).f5023;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f5023);
    }

    public final String toString() {
        int i = this.f5023;
        return i == 0 ? "Argb8888" : i == 1 ? "Alpha8" : i == 2 ? "Rgb565" : i == 3 ? "F16" : i == 4 ? "Gpu" : "Unknown";
    }
}
