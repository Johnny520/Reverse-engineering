package p209;

/* JADX INFO: renamed from: 飘花落叶言子苏哲楪兰世.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7925 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean f21952;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f21953;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C7925 f21951 = new C7925(2, false);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C7925 f21950 = new C7925(1, true);

    public C7925(int i, boolean z) {
        this.f21953 = i;
        this.f21952 = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7925)) {
            return false;
        }
        C7925 c7925 = (C7925) obj;
        return this.f21953 == c7925.f21953 && this.f21952 == c7925.f21952;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f21952) + (Integer.hashCode(this.f21953) * 31);
    }

    public final String toString() {
        return equals(f21951) ? "TextMotion.Static" : equals(f21950) ? "TextMotion.Animated" : "Invalid";
    }
}
