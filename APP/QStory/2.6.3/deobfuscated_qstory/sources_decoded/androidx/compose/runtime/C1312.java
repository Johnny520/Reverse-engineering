package androidx.compose.runtime;

import kotlin.jvm.internal.AbstractC4395;

/* JADX INFO: renamed from: androidx.compose.runtime.飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1312 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Object f3807;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Integer f3808;

    public C1312(Integer num, Object obj) {
        this.f3808 = num;
        this.f3807 = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1312)) {
            return false;
        }
        C1312 c1312 = (C1312) obj;
        return this.f3808.equals(c1312.f3808) && AbstractC4395.m8907(this.f3807, c1312.f3807);
    }

    public final int hashCode() {
        int iHashCode = this.f3808.hashCode() * 31;
        Object obj = this.f3807;
        return (obj instanceof Enum ? ((Enum) obj).ordinal() : obj != null ? obj.hashCode() : 0) + iHashCode;
    }

    public final String toString() {
        return "JoinedKey(left=" + this.f3808 + ", right=" + this.f3807 + ')';
    }
}
