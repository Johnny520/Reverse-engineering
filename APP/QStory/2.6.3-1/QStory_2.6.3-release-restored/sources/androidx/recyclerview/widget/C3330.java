package androidx.recyclerview.widget;

/* JADX INFO: renamed from: androidx.recyclerview.widget.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3330 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public int f7822;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public Object f7823;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int f7824;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public int f7825;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C3330)) {
                return false;
            }
            C3330 c3330 = (C3330) obj;
            int i = this.f7825;
            if (i != c3330.f7825) {
                return false;
            }
            if (i != 8 || Math.abs(this.f7822 - this.f7824) != 1 || this.f7822 != c3330.f7824 || this.f7824 != c3330.f7822) {
                if (this.f7822 != c3330.f7822 || this.f7824 != c3330.f7824) {
                    return false;
                }
                Object obj2 = this.f7823;
                Object obj3 = c3330.f7823;
                if (obj2 != null) {
                    if (!obj2.equals(obj3)) {
                        return false;
                    }
                } else if (obj3 != null) {
                    return false;
                }
            }
        }
        return true;
    }

    public final int hashCode() {
        return (((this.f7825 * 31) + this.f7824) * 31) + this.f7822;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[");
        int i = this.f7825;
        sb.append(i != 1 ? i != 2 ? i != 4 ? i != 8 ? "??" : "mv" : "up" : "rm" : "add");
        sb.append(",s:");
        sb.append(this.f7824);
        sb.append("c:");
        sb.append(this.f7822);
        sb.append(",p:");
        sb.append(this.f7823);
        sb.append("]");
        return sb.toString();
    }
}
