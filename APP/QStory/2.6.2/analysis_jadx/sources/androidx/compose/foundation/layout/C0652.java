package androidx.compose.foundation.layout;

import androidx.compose.ui.AbstractC2128;
import androidx.compose.ui.node.AbstractC1736;
import androidx.compose.ui.node.AbstractC1785;
import androidx.compose.ui.node.C1748;
import androidx.compose.ui.node.C1751;
import kotlin.Metadata;
import p052.InterfaceC6557;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.飘花落叶言子苏世兰楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/飘花落叶言子苏世兰楪哲;", "Landroidx/compose/ui/node/飘花落叶言子世兰哲楪苏;", "Landroidx/compose/foundation/layout/飘花落叶言子苏世兰哲楪;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class C0652 extends AbstractC1736 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC6557 f1824;

    public C0652(InterfaceC6557 interfaceC6557) {
        this.f1824 = interfaceC6557;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        C0652 c0652 = obj instanceof C0652 ? (C0652) obj : null;
        return c0652 != null && this.f1824 == c0652.f1824;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.f1824.hashCode() * 31);
    }

    public final String toString() {
        return "OffsetPxModifier(offset=" + this.f1824 + ", rtlAware=true)";
    }

    @Override // androidx.compose.ui.node.AbstractC1736
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo1095(AbstractC2128 abstractC2128) {
        C0651 c0651 = (C0651) abstractC2128;
        InterfaceC6557 interfaceC6557 = c0651.f1822;
        InterfaceC6557 interfaceC65572 = this.f1824;
        if (interfaceC6557 != interfaceC65572 || !c0651.f1823) {
            C1748 c1748M3336 = AbstractC1785.m3336(c0651);
            C1751 c1751 = C1748.f5088;
            c1748M3336.m3215(false);
        }
        c0651.f1822 = interfaceC65572;
        c0651.f1823 = true;
    }

    @Override // androidx.compose.ui.node.AbstractC1736
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final AbstractC2128 mo1096() {
        C0651 c0651 = new C0651();
        c0651.f1822 = this.f1824;
        c0651.f1823 = true;
        return c0651;
    }
}
