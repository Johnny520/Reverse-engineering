package kotlin.reflect.jvm.internal.impl.p009km;

import kotlin.C6013;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.km.飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5378 extends AbstractC5388 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f13627;

    public C5378(int i) {
        this.f13627 = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C5378) && this.f13627 == ((C5378) obj).f13627;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f13627);
    }

    @Override // kotlin.reflect.jvm.internal.impl.p009km.AbstractC5388
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Object mo9693() {
        return new C6013(this.f13627);
    }
}
