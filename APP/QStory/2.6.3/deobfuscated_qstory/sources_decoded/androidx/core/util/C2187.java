package androidx.core.util;

import java.util.Objects;

/* JADX INFO: renamed from: androidx.core.util.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2187 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Object f6459;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Object f6460;

    public C2187(Object obj, Object obj2) {
        this.f6460 = obj;
        this.f6459 = obj2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2187)) {
            return false;
        }
        C2187 c2187 = (C2187) obj;
        return Objects.equals(c2187.f6460, this.f6460) && Objects.equals(c2187.f6459, this.f6459);
    }

    public final int hashCode() {
        Object obj = this.f6460;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f6459;
        return iHashCode ^ (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "Pair{" + this.f6460 + " " + this.f6459 + "}";
    }
}
