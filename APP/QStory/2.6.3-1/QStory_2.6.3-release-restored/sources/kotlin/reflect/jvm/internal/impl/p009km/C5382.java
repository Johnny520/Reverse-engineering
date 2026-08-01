package kotlin.reflect.jvm.internal.impl.p009km;

import kotlin.C6011;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.km.飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5382 extends AbstractC5388 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final long f13647;

    public C5382(long j) {
        this.f13647 = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C5382) && this.f13647 == ((C5382) obj).f13647;
    }

    public final int hashCode() {
        return Long.hashCode(this.f13647);
    }

    @Override // kotlin.reflect.jvm.internal.impl.p009km.AbstractC5388
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Object mo9693() {
        return new C6011(this.f13647);
    }
}
