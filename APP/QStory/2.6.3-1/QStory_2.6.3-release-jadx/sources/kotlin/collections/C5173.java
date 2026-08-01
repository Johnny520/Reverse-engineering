package kotlin.collections;

import kotlin.jvm.internal.AbstractC5227;

/* JADX INFO: renamed from: kotlin.collections.飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5173 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Object f13268;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f13269;

    public C5173(int i, Object obj) {
        this.f13269 = i;
        this.f13268 = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5173)) {
            return false;
        }
        C5173 c5173 = (C5173) obj;
        return this.f13269 == c5173.f13269 && AbstractC5227.m9466(this.f13268, c5173.f13268);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f13269) * 31;
        Object obj = this.f13268;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return "IndexedValue(index=" + this.f13269 + ", value=" + this.f13268 + ')';
    }
}
