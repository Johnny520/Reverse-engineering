package kotlin.reflect.jvm.internal.impl.p009km;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.km.飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5386 extends AbstractC5388 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final short f13651;

    public C5386(short s) {
        this.f13651 = s;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C5386) && this.f13651 == ((C5386) obj).f13651;
    }

    public final int hashCode() {
        return Short.hashCode(this.f13651);
    }

    @Override // kotlin.reflect.jvm.internal.impl.p009km.AbstractC5388
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Object mo9693() {
        return Short.valueOf(this.f13651);
    }
}
