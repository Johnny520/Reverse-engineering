package kotlin.reflect.jvm.internal.impl.km;

import kotlin.C5179;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.km.飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4550 extends AbstractC4556 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final long f13302;

    public C4550(long j) {
        this.f13302 = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4550) && this.f13302 == ((C4550) obj).f13302;
    }

    public final int hashCode() {
        return Long.hashCode(this.f13302);
    }

    @Override // kotlin.reflect.jvm.internal.impl.km.AbstractC4556
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Object mo9134() {
        return new C5179(this.f13302);
    }
}
