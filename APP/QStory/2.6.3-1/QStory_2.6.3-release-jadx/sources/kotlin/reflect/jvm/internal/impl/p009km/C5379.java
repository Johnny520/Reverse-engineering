package kotlin.reflect.jvm.internal.impl.p009km;

import kotlin.C6010;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.km.飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5379 extends AbstractC5388 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final byte f13628;

    public C5379(byte b) {
        this.f13628 = b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C5379) && this.f13628 == ((C5379) obj).f13628;
    }

    public final int hashCode() {
        return Byte.hashCode(this.f13628);
    }

    @Override // kotlin.reflect.jvm.internal.impl.p009km.AbstractC5388
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Object mo9693() {
        return new C6010(this.f13628);
    }
}
