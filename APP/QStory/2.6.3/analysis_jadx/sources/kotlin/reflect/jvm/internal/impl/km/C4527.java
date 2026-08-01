package kotlin.reflect.jvm.internal.impl.km;

import kotlin.jvm.internal.AbstractC4395;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.km.飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4527 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C4527 f13189 = new C4527(null, null);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C4534 f13190;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final KmVariance f13191;

    public C4527(KmVariance kmVariance, C4534 c4534) {
        this.f13191 = kmVariance;
        this.f13190 = c4534;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4527)) {
            return false;
        }
        C4527 c4527 = (C4527) obj;
        return this.f13191 == c4527.f13191 && AbstractC4395.m8907(this.f13190, c4527.f13190);
    }

    public final int hashCode() {
        KmVariance kmVariance = this.f13191;
        int iHashCode = (kmVariance == null ? 0 : kmVariance.hashCode()) * 31;
        C4534 c4534 = this.f13190;
        return iHashCode + (c4534 != null ? c4534.hashCode() : 0);
    }

    public final String toString() {
        return "KmTypeProjection(variance=" + this.f13191 + ", type=" + this.f13190 + ')';
    }
}
