package kotlin.reflect.jvm.internal.impl.km;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.km.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4561 extends AbstractC4555 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final char f13310;

    public C4561(char c) {
        this.f13310 = c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4561) && this.f13310 == ((C4561) obj).f13310;
    }

    public final int hashCode() {
        return Character.hashCode(this.f13310);
    }

    @Override // kotlin.reflect.jvm.internal.impl.km.AbstractC4555
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Object mo9144() {
        return Character.valueOf(this.f13310);
    }
}
