package androidx.compose.runtime;

import kotlin.jvm.internal.AbstractC4394;

/* JADX INFO: renamed from: androidx.compose.runtime.飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1312 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Object f3806;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Integer f3807;

    public C1312(Integer num, Object obj) {
        this.f3807 = num;
        this.f3806 = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1312)) {
            return false;
        }
        C1312 c1312 = (C1312) obj;
        return this.f3807.equals(c1312.f3807) && AbstractC4394.m8917(this.f3806, c1312.f3806);
    }

    public final int hashCode() {
        int iHashCode = this.f3807.hashCode() * 31;
        Object obj = this.f3806;
        return (obj instanceof Enum ? ((Enum) obj).ordinal() : obj != null ? obj.hashCode() : 0) + iHashCode;
    }

    public final String toString() {
        return "JoinedKey(left=" + this.f3807 + ", right=" + this.f3806 + ')';
    }
}
