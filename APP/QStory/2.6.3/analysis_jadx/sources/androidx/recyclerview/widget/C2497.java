package androidx.recyclerview.widget;

/* JADX INFO: renamed from: androidx.recyclerview.widget.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2497 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public int f7477;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public Object f7478;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int f7479;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public int f7480;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C2497)) {
                return false;
            }
            C2497 c2497 = (C2497) obj;
            int i = this.f7480;
            if (i != c2497.f7480) {
                return false;
            }
            if (i != 8 || Math.abs(this.f7477 - this.f7479) != 1 || this.f7477 != c2497.f7479 || this.f7479 != c2497.f7477) {
                if (this.f7477 != c2497.f7477 || this.f7479 != c2497.f7479) {
                    return false;
                }
                Object obj2 = this.f7478;
                Object obj3 = c2497.f7478;
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
        return (((this.f7480 * 31) + this.f7479) * 31) + this.f7477;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[");
        int i = this.f7480;
        sb.append(i != 1 ? i != 2 ? i != 4 ? i != 8 ? "??" : "mv" : "up" : "rm" : "add");
        sb.append(",s:");
        sb.append(this.f7479);
        sb.append("c:");
        sb.append(this.f7477);
        sb.append(",p:");
        sb.append(this.f7478);
        sb.append("]");
        return sb.toString();
    }
}
