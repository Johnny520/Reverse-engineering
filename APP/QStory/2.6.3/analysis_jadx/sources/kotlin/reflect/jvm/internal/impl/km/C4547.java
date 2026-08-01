package kotlin.reflect.jvm.internal.impl.km;

import kotlin.C5178;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.km.飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4547 extends AbstractC4556 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final byte f13283;

    public C4547(byte b) {
        this.f13283 = b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4547) && this.f13283 == ((C4547) obj).f13283;
    }

    public final int hashCode() {
        return Byte.hashCode(this.f13283);
    }

    @Override // kotlin.reflect.jvm.internal.impl.km.AbstractC4556
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Object mo9134() {
        return new C5178(this.f13283);
    }
}
