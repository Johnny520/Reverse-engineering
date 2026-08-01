package androidx.compose.runtime;

import kotlin.jvm.internal.AbstractC5227;

/* JADX INFO: renamed from: androidx.compose.runtime.飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2147 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Object f4152;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Integer f4153;

    public C2147(Integer num, Object obj) {
        this.f4153 = num;
        this.f4152 = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2147)) {
            return false;
        }
        C2147 c2147 = (C2147) obj;
        return this.f4153.equals(c2147.f4153) && AbstractC5227.m9466(this.f4152, c2147.f4152);
    }

    public final int hashCode() {
        int iHashCode = this.f4153.hashCode() * 31;
        Object obj = this.f4152;
        return (obj instanceof Enum ? ((Enum) obj).ordinal() : obj != null ? obj.hashCode() : 0) + iHashCode;
    }

    public final String toString() {
        return "JoinedKey(left=" + this.f4153 + ", right=" + this.f4152 + ')';
    }
}
