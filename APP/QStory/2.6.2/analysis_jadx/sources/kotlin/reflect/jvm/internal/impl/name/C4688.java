package kotlin.reflect.jvm.internal.impl.name;

import kotlin.jvm.internal.AbstractC4394;
import kotlin.text.AbstractC5138;
import net.bytebuddy.pool.TypePool;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.name.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4688 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C4690 f13696;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C4686 f13697;

    static {
        C4690 c4690 = AbstractC4691.f13702;
        C4686 c4686 = C4686.f13690;
        AbstractC4683.m9318(c4690);
    }

    public C4688(C4686 c4686, C4690 c4690) {
        c4686.getClass();
        this.f13697 = c4686;
        this.f13696 = c4690;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4688)) {
            return false;
        }
        C4688 c4688 = (C4688) obj;
        return AbstractC4394.m8917(this.f13697, c4688.f13697) && this.f13696.equals(c4688.f13696);
    }

    public final int hashCode() {
        return this.f13696.hashCode() + ((this.f13697.hashCode() + 527) * 961);
    }

    public final String toString() {
        return AbstractC5138.m10129(this.f13697.f13692.f13689, TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH, '/') + "/" + this.f13696;
    }
}
