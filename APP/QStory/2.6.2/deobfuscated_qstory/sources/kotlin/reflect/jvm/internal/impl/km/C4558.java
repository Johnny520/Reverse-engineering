package kotlin.reflect.jvm.internal.impl.km;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.km.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4558 extends AbstractC4555 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final boolean f13306;

    public C4558(boolean z) {
        this.f13306 = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4558) && this.f13306 == ((C4558) obj).f13306;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f13306);
    }

    @Override // kotlin.reflect.jvm.internal.impl.km.AbstractC4555
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Object mo9144() {
        return Boolean.valueOf(this.f13306);
    }
}
