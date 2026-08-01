package kotlin.reflect.jvm.internal.impl.km;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.km.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4557 extends AbstractC4556 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final long f13308;

    public C4557(long j) {
        this.f13308 = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4557) && this.f13308 == ((C4557) obj).f13308;
    }

    public final int hashCode() {
        return Long.hashCode(this.f13308);
    }

    @Override // kotlin.reflect.jvm.internal.impl.km.AbstractC4556
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Object mo9134() {
        return Long.valueOf(this.f13308);
    }
}
