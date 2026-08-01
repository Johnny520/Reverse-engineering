package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.reflect.jvm.internal.impl.types.AbstractC4882;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.resolve.constants.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4764 extends AbstractC4755 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final AbstractC4882 f13902;

    public C4764(AbstractC4882 abstractC4882) {
        this.f13902 = abstractC4882;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4764) && this.f13902.equals(((C4764) obj).f13902);
    }

    public final int hashCode() {
        return this.f13902.hashCode();
    }

    public final String toString() {
        return "LocalClass(type=" + this.f13902 + ')';
    }
}
