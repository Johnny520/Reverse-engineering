package kotlin.reflect.jvm.internal.impl.p009km;

import kotlin.C6005;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.km.飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5383 extends AbstractC5388 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final short f13648;

    public C5383(short s) {
        this.f13648 = s;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C5383) && this.f13648 == ((C5383) obj).f13648;
    }

    public final int hashCode() {
        return Short.hashCode(this.f13648);
    }

    @Override // kotlin.reflect.jvm.internal.impl.p009km.AbstractC5388
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Object mo9693() {
        return new C6005(this.f13648);
    }
}
