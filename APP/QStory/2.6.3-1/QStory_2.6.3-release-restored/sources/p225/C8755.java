package p225;

/* JADX INFO: renamed from: 飘花落叶言子苏哲楪兰世.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8755 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean f22294;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f22295;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C8755 f22293 = new C8755(2, false);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C8755 f22292 = new C8755(1, true);

    public C8755(int i, boolean z) {
        this.f22295 = i;
        this.f22294 = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8755)) {
            return false;
        }
        C8755 c8755 = (C8755) obj;
        return this.f22295 == c8755.f22295 && this.f22294 == c8755.f22294;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f22294) + (Integer.hashCode(this.f22295) * 31);
    }

    public final String toString() {
        return equals(f22293) ? "TextMotion.Static" : equals(f22292) ? "TextMotion.Animated" : "Invalid";
    }
}
