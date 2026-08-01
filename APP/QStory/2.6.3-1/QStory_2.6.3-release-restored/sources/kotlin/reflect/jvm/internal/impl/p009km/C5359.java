package kotlin.reflect.jvm.internal.impl.p009km;

import kotlin.jvm.internal.AbstractC5227;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.km.飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5359 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C5359 f13534 = new C5359(null, null);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C5366 f13535;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final KmVariance f13536;

    public C5359(KmVariance kmVariance, C5366 c5366) {
        this.f13536 = kmVariance;
        this.f13535 = c5366;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5359)) {
            return false;
        }
        C5359 c5359 = (C5359) obj;
        return this.f13536 == c5359.f13536 && AbstractC5227.m9466(this.f13535, c5359.f13535);
    }

    public final int hashCode() {
        KmVariance kmVariance = this.f13536;
        int iHashCode = (kmVariance == null ? 0 : kmVariance.hashCode()) * 31;
        C5366 c5366 = this.f13535;
        return iHashCode + (c5366 != null ? c5366.hashCode() : 0);
    }

    public final String toString() {
        return "KmTypeProjection(variance=" + this.f13536 + ", type=" + this.f13535 + ')';
    }
}
