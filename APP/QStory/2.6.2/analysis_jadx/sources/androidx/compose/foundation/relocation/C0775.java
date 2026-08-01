package androidx.compose.foundation.relocation;

import androidx.compose.ui.AbstractC2128;
import androidx.compose.ui.node.AbstractC1736;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4394;

/* JADX INFO: renamed from: androidx.compose.foundation.relocation.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/relocation/飘花落叶言子楪世苏兰哲;", "Landroidx/compose/ui/node/飘花落叶言子世兰哲楪苏;", "Landroidx/compose/foundation/relocation/飘花落叶言子楪世兰苏哲;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class C0775 extends AbstractC1736 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC0776 f2244;

    public C0775(InterfaceC0776 interfaceC0776) {
        this.f2244 = interfaceC0776;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0775) {
            return AbstractC4394.m8917(this.f2244, ((C0775) obj).f2244);
        }
        return false;
    }

    public final int hashCode() {
        return this.f2244.hashCode();
    }

    @Override // androidx.compose.ui.node.AbstractC1736
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo1095(AbstractC2128 abstractC2128) {
        C0772 c0772 = (C0772) abstractC2128;
        InterfaceC0776 interfaceC0776 = c0772.f2242;
        if (interfaceC0776 instanceof C0774) {
            ((C0774) interfaceC0776).f2243.m2045(c0772);
        }
        InterfaceC0776 interfaceC07762 = this.f2244;
        if (interfaceC07762 instanceof C0774) {
            ((C0774) interfaceC07762).f2243.m2037(c0772);
        }
        c0772.f2242 = interfaceC07762;
    }

    @Override // androidx.compose.ui.node.AbstractC1736
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final AbstractC2128 mo1096() {
        C0772 c0772 = new C0772();
        c0772.f2242 = this.f2244;
        return c0772;
    }
}
