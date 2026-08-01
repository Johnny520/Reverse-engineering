package androidx.compose.runtime.tooling;

import kotlin.jvm.internal.AbstractC4395;

/* JADX INFO: renamed from: androidx.compose.runtime.tooling.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1299 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Integer f3787;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f3788;

    public C1299(int i, Integer num) {
        this.f3788 = i;
        this.f3787 = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1299)) {
            return false;
        }
        C1299 c1299 = (C1299) obj;
        return this.f3788 == c1299.f3788 && AbstractC4395.m8907(this.f3787, c1299.f3787);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f3788) * 31;
        Integer num = this.f3787;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "ObjectLocation(group=" + this.f3788 + ", dataOffset=" + this.f3787 + ')';
    }
}
