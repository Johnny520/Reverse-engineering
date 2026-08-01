package kotlin.reflect.jvm.internal.impl.km;

import kotlin.jvm.internal.AbstractC4394;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.km.飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4526 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C4526 f13185 = new C4526(null, null);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C4533 f13186;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final KmVariance f13187;

    public C4526(KmVariance kmVariance, C4533 c4533) {
        this.f13187 = kmVariance;
        this.f13186 = c4533;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4526)) {
            return false;
        }
        C4526 c4526 = (C4526) obj;
        return this.f13187 == c4526.f13187 && AbstractC4394.m8917(this.f13186, c4526.f13186);
    }

    public final int hashCode() {
        KmVariance kmVariance = this.f13187;
        int iHashCode = (kmVariance == null ? 0 : kmVariance.hashCode()) * 31;
        C4533 c4533 = this.f13186;
        return iHashCode + (c4533 != null ? c4533.hashCode() : 0);
    }

    public final String toString() {
        return "KmTypeProjection(variance=" + this.f13187 + ", type=" + this.f13186 + ')';
    }
}
