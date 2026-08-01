package kotlin.reflect.jvm.internal.impl.km;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.km.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4552 extends AbstractC4555 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f13301;

    public C4552(int i) {
        this.f13301 = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4552) && this.f13301 == ((C4552) obj).f13301;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f13301);
    }

    @Override // kotlin.reflect.jvm.internal.impl.km.AbstractC4555
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Object mo9144() {
        return Integer.valueOf(this.f13301);
    }
}
