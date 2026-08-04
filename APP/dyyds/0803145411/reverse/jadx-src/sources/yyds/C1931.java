package yyds;

/* JADX INFO: renamed from: yyds.ᲀᛱᲁᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1931 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public int f9729;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public int f9730;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public Object f9731;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public int f9732;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C1931)) {
                return false;
            }
            C1931 c1931 = (C1931) obj;
            int i = this.f9729;
            if (i != c1931.f9729) {
                return false;
            }
            if (i != 8 || Math.abs(this.f9732 - this.f9730) != 1 || this.f9732 != c1931.f9730 || this.f9730 != c1931.f9732) {
                if (this.f9732 != c1931.f9732 || this.f9730 != c1931.f9730) {
                    return false;
                }
                Object obj2 = this.f9731;
                Object obj3 = c1931.f9731;
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
        return (((this.f9729 * 31) + this.f9730) * 31) + this.f9732;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[");
        int i = this.f9729;
        sb.append(i != 1 ? i != 2 ? i != 4 ? i != 8 ? "??" : "mv" : "up" : "rm" : "add");
        sb.append(",s:");
        sb.append(this.f9730);
        sb.append("c:");
        sb.append(this.f9732);
        sb.append(",p:");
        sb.append(this.f9731);
        sb.append("]");
        return sb.toString();
    }
}
