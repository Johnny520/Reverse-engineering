package org.luckypray.dexkit.result;

/* JADX INFO: renamed from: org.luckypray.dexkit.result.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5725 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final FieldUsingType f15699;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C5726 f15700;

    public C5725(C5726 c5726, FieldUsingType fieldUsingType) {
        fieldUsingType.getClass();
        this.f15700 = c5726;
        this.f15699 = fieldUsingType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5725)) {
            return false;
        }
        C5725 c5725 = (C5725) obj;
        return this.f15700.equals(c5725.f15700) && this.f15699 == c5725.f15699;
    }

    public final int hashCode() {
        return this.f15699.hashCode() + (this.f15700.f15701.hashCode() * 31);
    }

    public final String toString() {
        return "UsingFieldData(field=" + this.f15700 + ", usingType=" + this.f15699 + ")";
    }
}
