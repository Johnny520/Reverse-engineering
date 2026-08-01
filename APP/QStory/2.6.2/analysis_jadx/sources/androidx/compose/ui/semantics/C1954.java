package androidx.compose.ui.semantics;

/* JADX INFO: renamed from: androidx.compose.ui.semantics.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1954 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f5772;

    public final boolean equals(Object obj) {
        if (obj instanceof C1954) {
            return this.f5772 == ((C1954) obj).f5772;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f5772);
    }

    public final String toString() {
        int i = this.f5772;
        return i == 0 ? "Button" : i == 1 ? "Checkbox" : i == 2 ? "Switch" : i == 3 ? "RadioButton" : i == 4 ? "Tab" : i == 5 ? "Image" : i == 6 ? "DropdownList" : i == 7 ? "Picker" : i == 8 ? "Carousel" : "Unknown";
    }
}
