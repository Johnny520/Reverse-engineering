package kotlin.reflect.jvm.internal.impl.km;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.km.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4541 extends AbstractC4547 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C4542 f13245;

    public C4541(C4542 c4542) {
        this.f13245 = c4542;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4541) && this.f13245.equals(((C4541) obj).f13245);
    }

    public final int hashCode() {
        return this.f13245.hashCode();
    }

    public final String toString() {
        return "AnnotationValue(" + this.f13245 + ')';
    }
}
