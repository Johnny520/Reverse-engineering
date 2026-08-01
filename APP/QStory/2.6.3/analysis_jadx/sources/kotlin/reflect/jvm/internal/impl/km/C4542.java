package kotlin.reflect.jvm.internal.impl.km;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.km.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4542 extends AbstractC4548 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C4543 f13249;

    public C4542(C4543 c4543) {
        this.f13249 = c4543;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4542) && this.f13249.equals(((C4542) obj).f13249);
    }

    public final int hashCode() {
        return this.f13249.hashCode();
    }

    public final String toString() {
        return "AnnotationValue(" + this.f13249 + ')';
    }
}
