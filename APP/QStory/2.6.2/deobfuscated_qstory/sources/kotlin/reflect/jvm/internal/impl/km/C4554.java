package kotlin.reflect.jvm.internal.impl.km;

import kotlin.jvm.internal.AbstractC4394;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.km.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4554 extends AbstractC4555 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f13303;

    public C4554(String str) {
        str.getClass();
        this.f13303 = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4554) && AbstractC4394.m8917(this.f13303, ((C4554) obj).f13303);
    }

    public final int hashCode() {
        return this.f13303.hashCode();
    }

    @Override // kotlin.reflect.jvm.internal.impl.km.AbstractC4555
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Object mo9144() {
        return this.f13303;
    }
}
