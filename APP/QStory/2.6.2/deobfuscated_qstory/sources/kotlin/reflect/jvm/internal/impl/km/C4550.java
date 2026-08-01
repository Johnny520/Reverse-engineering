package kotlin.reflect.jvm.internal.impl.km;

import kotlin.C5172;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.km.飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4550 extends AbstractC4555 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final short f13299;

    public C4550(short s) {
        this.f13299 = s;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4550) && this.f13299 == ((C4550) obj).f13299;
    }

    public final int hashCode() {
        return Short.hashCode(this.f13299);
    }

    @Override // kotlin.reflect.jvm.internal.impl.km.AbstractC4555
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Object mo9144() {
        return new C5172(this.f13299);
    }
}
