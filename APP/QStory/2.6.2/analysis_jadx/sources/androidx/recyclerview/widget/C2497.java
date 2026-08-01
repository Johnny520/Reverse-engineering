package androidx.recyclerview.widget;

/* JADX INFO: renamed from: androidx.recyclerview.widget.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2497 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public int f7476;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public Object f7477;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int f7478;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public int f7479;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C2497)) {
                return false;
            }
            C2497 c2497 = (C2497) obj;
            int i = this.f7479;
            if (i != c2497.f7479) {
                return false;
            }
            if (i != 8 || Math.abs(this.f7476 - this.f7478) != 1 || this.f7476 != c2497.f7478 || this.f7478 != c2497.f7476) {
                if (this.f7476 != c2497.f7476 || this.f7478 != c2497.f7478) {
                    return false;
                }
                Object obj2 = this.f7477;
                Object obj3 = c2497.f7477;
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
        return (((this.f7479 * 31) + this.f7478) * 31) + this.f7476;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[");
        int i = this.f7479;
        sb.append(i != 1 ? i != 2 ? i != 4 ? i != 8 ? "??" : "mv" : "up" : "rm" : "add");
        sb.append(",s:");
        sb.append(this.f7478);
        sb.append("c:");
        sb.append(this.f7476);
        sb.append(",p:");
        sb.append(this.f7477);
        sb.append("]");
        return sb.toString();
    }
}
