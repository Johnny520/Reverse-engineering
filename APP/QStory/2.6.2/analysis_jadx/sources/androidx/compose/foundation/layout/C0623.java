package androidx.compose.foundation.layout;

import androidx.activity.AbstractC0053;
import androidx.compose.ui.AbstractC2128;
import androidx.compose.ui.node.AbstractC1736;
import kotlin.Metadata;
import p052.InterfaceC6553;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.飘花落叶言子哲苏兰世楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/飘花落叶言子哲苏兰世楪;", "Landroidx/compose/ui/node/飘花落叶言子世兰哲楪苏;", "Landroidx/compose/foundation/layout/飘花落叶言子哲兰楪苏世;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class C0623 extends AbstractC1736 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final InterfaceC6553 f1736;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final Object f1737;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Direction f1738;

    public C0623(Direction direction, InterfaceC6553 interfaceC6553, Object obj) {
        this.f1738 = direction;
        this.f1736 = interfaceC6553;
        this.f1737 = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0623.class != obj.getClass()) {
            return false;
        }
        C0623 c0623 = (C0623) obj;
        return this.f1738 == c0623.f1738 && this.f1737.equals(c0623.f1737);
    }

    public final int hashCode() {
        return this.f1737.hashCode() + AbstractC0053.m140(this.f1738.hashCode() * 31, 31, false);
    }

    @Override // androidx.compose.ui.node.AbstractC1736
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo1095(AbstractC2128 abstractC2128) {
        C0614 c0614 = (C0614) abstractC2128;
        c0614.f1711 = this.f1738;
        c0614.f1712 = this.f1736;
    }

    @Override // androidx.compose.ui.node.AbstractC1736
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final AbstractC2128 mo1096() {
        C0614 c0614 = new C0614();
        c0614.f1711 = this.f1738;
        c0614.f1712 = this.f1736;
        return c0614;
    }
}
