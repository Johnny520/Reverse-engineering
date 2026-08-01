package org.luckypray.dexkit.result;

/* JADX INFO: renamed from: org.luckypray.dexkit.result.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5726 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final FieldUsingType f15699;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C5727 f15700;

    public C5726(C5727 c5727, FieldUsingType fieldUsingType) {
        fieldUsingType.getClass();
        this.f15700 = c5727;
        this.f15699 = fieldUsingType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5726)) {
            return false;
        }
        C5726 c5726 = (C5726) obj;
        return this.f15700.equals(c5726.f15700) && this.f15699 == c5726.f15699;
    }

    public final int hashCode() {
        return this.f15699.hashCode() + (this.f15700.f15701.hashCode() * 31);
    }

    public final String toString() {
        return "UsingFieldData(field=" + this.f15700 + ", usingType=" + this.f15699 + ")";
    }
}
