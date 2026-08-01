package kotlin.reflect.jvm.internal.impl.km;

import kotlin.C5173;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.km.飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4551 extends AbstractC4556 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final short f13303;

    public C4551(short s) {
        this.f13303 = s;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4551) && this.f13303 == ((C4551) obj).f13303;
    }

    public final int hashCode() {
        return Short.hashCode(this.f13303);
    }

    @Override // kotlin.reflect.jvm.internal.impl.km.AbstractC4556
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Object mo9134() {
        return new C5173(this.f13303);
    }
}
