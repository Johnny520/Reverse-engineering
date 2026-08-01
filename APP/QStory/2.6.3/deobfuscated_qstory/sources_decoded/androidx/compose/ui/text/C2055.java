package androidx.compose.ui.text;

/* JADX INFO: renamed from: androidx.compose.ui.text.飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2055 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f6090;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final boolean f6091;

    public C2055() {
        this.f6091 = false;
        this.f6090 = 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2055)) {
            return false;
        }
        C2055 c2055 = (C2055) obj;
        return this.f6091 == c2055.f6091 && this.f6090 == c2055.f6090;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f6090) + (Boolean.hashCode(this.f6091) * 31);
    }

    public final String toString() {
        return "PlatformParagraphStyle(includeFontPadding=" + this.f6091 + ", emojiSupportMatch=" + ((Object) C2071.m3805(this.f6090)) + ')';
    }

    public C2055(int i, boolean z) {
        this.f6091 = z;
        this.f6090 = i;
    }
}
