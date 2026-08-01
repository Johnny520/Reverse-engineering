package kotlin.reflect.jvm.internal.impl.km;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.km.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4553 extends AbstractC4556 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f13305;

    public C4553(int i) {
        this.f13305 = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4553) && this.f13305 == ((C4553) obj).f13305;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f13305);
    }

    @Override // kotlin.reflect.jvm.internal.impl.km.AbstractC4556
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Object mo9134() {
        return Integer.valueOf(this.f13305);
    }
}
