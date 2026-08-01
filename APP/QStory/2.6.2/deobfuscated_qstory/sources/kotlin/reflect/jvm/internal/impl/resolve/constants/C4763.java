package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.reflect.jvm.internal.impl.types.AbstractC4881;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.resolve.constants.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4763 extends AbstractC4754 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final AbstractC4881 f13898;

    public C4763(AbstractC4881 abstractC4881) {
        this.f13898 = abstractC4881;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4763) && this.f13898.equals(((C4763) obj).f13898);
    }

    public final int hashCode() {
        return this.f13898.hashCode();
    }

    public final String toString() {
        return "LocalClass(type=" + this.f13898 + ')';
    }
}
