package androidx.compose.p001ui.semantics;

/* JADX INFO: renamed from: androidx.compose.ui.semantics.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2789 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f6118;

    public final boolean equals(Object obj) {
        if (obj instanceof C2789) {
            return this.f6118 == ((C2789) obj).f6118;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f6118);
    }

    public final String toString() {
        int i = this.f6118;
        return i == 0 ? "Button" : i == 1 ? "Checkbox" : i == 2 ? "Switch" : i == 3 ? "RadioButton" : i == 4 ? "Tab" : i == 5 ? "Image" : i == 6 ? "DropdownList" : i == 7 ? "Picker" : i == 8 ? "Carousel" : "Unknown";
    }
}
