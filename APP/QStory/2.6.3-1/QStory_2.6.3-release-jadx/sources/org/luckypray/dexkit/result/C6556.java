package org.luckypray.dexkit.result;

/* JADX INFO: renamed from: org.luckypray.dexkit.result.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6556 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final FieldUsingType f16044;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C6557 f16045;

    public C6556(C6557 c6557, FieldUsingType fieldUsingType) {
        fieldUsingType.getClass();
        this.f16045 = c6557;
        this.f16044 = fieldUsingType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6556)) {
            return false;
        }
        C6556 c6556 = (C6556) obj;
        return this.f16045.equals(c6556.f16045) && this.f16044 == c6556.f16044;
    }

    public final int hashCode() {
        return this.f16044.hashCode() + (this.f16045.f16046.hashCode() * 31);
    }

    public final String toString() {
        return "UsingFieldData(field=" + this.f16045 + ", usingType=" + this.f16044 + ")";
    }
}
