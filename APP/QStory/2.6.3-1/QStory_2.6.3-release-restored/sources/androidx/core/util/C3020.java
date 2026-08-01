package androidx.core.util;

import java.util.Objects;

/* JADX INFO: renamed from: androidx.core.util.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3020 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Object f6804;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Object f6805;

    public C3020(Object obj, Object obj2) {
        this.f6805 = obj;
        this.f6804 = obj2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3020)) {
            return false;
        }
        C3020 c3020 = (C3020) obj;
        return Objects.equals(c3020.f6805, this.f6805) && Objects.equals(c3020.f6804, this.f6804);
    }

    public final int hashCode() {
        Object obj = this.f6805;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f6804;
        return iHashCode ^ (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "Pair{" + this.f6805 + " " + this.f6804 + "}";
    }
}
