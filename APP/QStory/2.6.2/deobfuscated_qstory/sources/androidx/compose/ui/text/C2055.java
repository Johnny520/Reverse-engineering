package androidx.compose.ui.text;

/* JADX INFO: renamed from: androidx.compose.ui.text.飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2055 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f6089;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final boolean f6090;

    public C2055() {
        this.f6090 = false;
        this.f6089 = 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2055)) {
            return false;
        }
        C2055 c2055 = (C2055) obj;
        return this.f6090 == c2055.f6090 && this.f6089 == c2055.f6089;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f6089) + (Boolean.hashCode(this.f6090) * 31);
    }

    public final String toString() {
        return "PlatformParagraphStyle(includeFontPadding=" + this.f6090 + ", emojiSupportMatch=" + ((Object) C2071.m3795(this.f6089)) + ')';
    }

    public C2055(int i, boolean z) {
        this.f6090 = z;
        this.f6089 = i;
    }
}
