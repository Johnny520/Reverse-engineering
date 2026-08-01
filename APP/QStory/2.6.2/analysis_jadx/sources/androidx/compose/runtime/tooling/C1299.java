package androidx.compose.runtime.tooling;

import kotlin.jvm.internal.AbstractC4394;

/* JADX INFO: renamed from: androidx.compose.runtime.tooling.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1299 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Integer f3786;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f3787;

    public C1299(int i, Integer num) {
        this.f3787 = i;
        this.f3786 = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1299)) {
            return false;
        }
        C1299 c1299 = (C1299) obj;
        return this.f3787 == c1299.f3787 && AbstractC4394.m8917(this.f3786, c1299.f3786);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f3787) * 31;
        Integer num = this.f3786;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "ObjectLocation(group=" + this.f3787 + ", dataOffset=" + this.f3786 + ')';
    }
}
