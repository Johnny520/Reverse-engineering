package kotlin.collections;

import kotlin.jvm.internal.AbstractC4394;

/* JADX INFO: renamed from: kotlin.collections.飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4340 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Object f12919;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f12920;

    public C4340(int i, Object obj) {
        this.f12920 = i;
        this.f12919 = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4340)) {
            return false;
        }
        C4340 c4340 = (C4340) obj;
        return this.f12920 == c4340.f12920 && AbstractC4394.m8917(this.f12919, c4340.f12919);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f12920) * 31;
        Object obj = this.f12919;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return "IndexedValue(index=" + this.f12920 + ", value=" + this.f12919 + ')';
    }
}
