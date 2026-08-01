package kotlin.reflect.jvm.internal.impl.name;

import kotlin.jvm.internal.AbstractC4395;
import kotlin.text.AbstractC5139;
import net.bytebuddy.pool.TypePool;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.name.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4689 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C4691 f13700;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C4687 f13701;

    static {
        C4691 c4691 = AbstractC4692.f13706;
        C4687 c4687 = C4687.f13694;
        AbstractC4684.m9308(c4691);
    }

    public C4689(C4687 c4687, C4691 c4691) {
        c4687.getClass();
        this.f13701 = c4687;
        this.f13700 = c4691;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4689)) {
            return false;
        }
        C4689 c4689 = (C4689) obj;
        return AbstractC4395.m8907(this.f13701, c4689.f13701) && this.f13700.equals(c4689.f13700);
    }

    public final int hashCode() {
        return this.f13700.hashCode() + ((this.f13701.hashCode() + 527) * 961);
    }

    public final String toString() {
        return AbstractC5139.m10129(this.f13701.f13696.f13693, TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH, '/') + "/" + this.f13700;
    }
}
