package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.reflect.jvm.internal.impl.types.AbstractC5714;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.resolve.constants.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5596 extends AbstractC5587 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final AbstractC5714 f14247;

    public C5596(AbstractC5714 abstractC5714) {
        this.f14247 = abstractC5714;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C5596) && this.f14247.equals(((C5596) obj).f14247);
    }

    public final int hashCode() {
        return this.f14247.hashCode();
    }

    public final String toString() {
        return "LocalClass(type=" + this.f14247 + ')';
    }
}
