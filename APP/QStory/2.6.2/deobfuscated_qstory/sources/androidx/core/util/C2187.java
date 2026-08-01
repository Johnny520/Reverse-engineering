package androidx.core.util;

import java.util.Objects;

/* JADX INFO: renamed from: androidx.core.util.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2187 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Object f6458;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Object f6459;

    public C2187(Object obj, Object obj2) {
        this.f6459 = obj;
        this.f6458 = obj2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2187)) {
            return false;
        }
        C2187 c2187 = (C2187) obj;
        return Objects.equals(c2187.f6459, this.f6459) && Objects.equals(c2187.f6458, this.f6458);
    }

    public final int hashCode() {
        Object obj = this.f6459;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f6458;
        return iHashCode ^ (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "Pair{" + this.f6459 + " " + this.f6458 + "}";
    }
}
