package androidx.compose.foundation.layout;

import androidx.compose.ui.AbstractC2128;
import androidx.compose.ui.node.AbstractC1736;
import androidx.compose.ui.node.AbstractC1785;
import androidx.compose.ui.node.C1748;
import androidx.compose.ui.node.C1751;
import kotlin.Metadata;
import p052.InterfaceC6558;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.飘花落叶言子苏世兰楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/飘花落叶言子苏世兰楪哲;", "Landroidx/compose/ui/node/飘花落叶言子世兰哲楪苏;", "Landroidx/compose/foundation/layout/飘花落叶言子苏世兰哲楪;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class C0652 extends AbstractC1736 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC6558 f1825;

    public C0652(InterfaceC6558 interfaceC6558) {
        this.f1825 = interfaceC6558;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        C0652 c0652 = obj instanceof C0652 ? (C0652) obj : null;
        return c0652 != null && this.f1825 == c0652.f1825;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.f1825.hashCode() * 31);
    }

    public final String toString() {
        return "OffsetPxModifier(offset=" + this.f1825 + ", rtlAware=true)";
    }

    @Override // androidx.compose.ui.node.AbstractC1736
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo1096(AbstractC2128 abstractC2128) {
        C0651 c0651 = (C0651) abstractC2128;
        InterfaceC6558 interfaceC6558 = c0651.f1823;
        InterfaceC6558 interfaceC65582 = this.f1825;
        if (interfaceC6558 != interfaceC65582 || !c0651.f1824) {
            C1748 c1748M3346 = AbstractC1785.m3346(c0651);
            C1751 c1751 = C1748.f5089;
            c1748M3346.m3225(false);
        }
        c0651.f1823 = interfaceC65582;
        c0651.f1824 = true;
    }

    @Override // androidx.compose.ui.node.AbstractC1736
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final AbstractC2128 mo1097() {
        C0651 c0651 = new C0651();
        c0651.f1823 = this.f1825;
        c0651.f1824 = true;
        return c0651;
    }
}
