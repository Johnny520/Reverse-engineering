package androidx.compose.runtime.tooling;

import kotlin.jvm.internal.AbstractC5227;

/* JADX INFO: renamed from: androidx.compose.runtime.tooling.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2134 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Integer f4132;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f4133;

    public C2134(int i, Integer num) {
        this.f4133 = i;
        this.f4132 = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2134)) {
            return false;
        }
        C2134 c2134 = (C2134) obj;
        return this.f4133 == c2134.f4133 && AbstractC5227.m9466(this.f4132, c2134.f4132);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f4133) * 31;
        Integer num = this.f4132;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "ObjectLocation(group=" + this.f4133 + ", dataOffset=" + this.f4132 + ')';
    }
}
