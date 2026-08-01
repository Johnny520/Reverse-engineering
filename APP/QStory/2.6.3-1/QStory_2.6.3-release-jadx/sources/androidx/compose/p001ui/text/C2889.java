package androidx.compose.p001ui.text;

/* JADX INFO: renamed from: androidx.compose.ui.text.飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2889 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f6435;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final boolean f6436;

    public C2889() {
        this.f6436 = false;
        this.f6435 = 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2889)) {
            return false;
        }
        C2889 c2889 = (C2889) obj;
        return this.f6436 == c2889.f6436 && this.f6435 == c2889.f6435;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f6435) + (Boolean.hashCode(this.f6436) * 31);
    }

    public final String toString() {
        return "PlatformParagraphStyle(includeFontPadding=" + this.f6436 + ", emojiSupportMatch=" + ((Object) C2905.m4365(this.f6435)) + ')';
    }

    public C2889(int i, boolean z) {
        this.f6436 = z;
        this.f6435 = i;
    }
}
