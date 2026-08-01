package p209;

/* JADX INFO: renamed from: 飘花落叶言子苏哲楪兰世.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7926 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean f21949;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f21950;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C7926 f21948 = new C7926(2, false);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C7926 f21947 = new C7926(1, true);

    public C7926(int i, boolean z) {
        this.f21950 = i;
        this.f21949 = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7926)) {
            return false;
        }
        C7926 c7926 = (C7926) obj;
        return this.f21950 == c7926.f21950 && this.f21949 == c7926.f21949;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f21949) + (Integer.hashCode(this.f21950) * 31);
    }

    public final String toString() {
        return equals(f21948) ? "TextMotion.Static" : equals(f21947) ? "TextMotion.Animated" : "Invalid";
    }
}
