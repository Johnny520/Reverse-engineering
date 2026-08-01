package kotlin.collections;

import kotlin.jvm.internal.AbstractC4395;

/* JADX INFO: renamed from: kotlin.collections.飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4341 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Object f12923;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f12924;

    public C4341(int i, Object obj) {
        this.f12924 = i;
        this.f12923 = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4341)) {
            return false;
        }
        C4341 c4341 = (C4341) obj;
        return this.f12924 == c4341.f12924 && AbstractC4395.m8907(this.f12923, c4341.f12923);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f12924) * 31;
        Object obj = this.f12923;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return "IndexedValue(index=" + this.f12924 + ", value=" + this.f12923 + ')';
    }
}
