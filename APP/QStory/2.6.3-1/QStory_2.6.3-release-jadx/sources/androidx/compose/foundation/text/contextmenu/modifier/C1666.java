package androidx.compose.foundation.text.contextmenu.modifier;

import androidx.compose.foundation.text.selection.C1752;
import androidx.compose.p001ui.AbstractC2961;
import androidx.compose.p001ui.node.AbstractC2571;
import kotlin.Metadata;
import p068.InterfaceC7387;

/* JADX INFO: renamed from: androidx.compose.foundation.text.contextmenu.modifier.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m150d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m151d2 = {"Landroidx/compose/foundation/text/contextmenu/modifier/飘花落叶言子楪苏哲兰世;", "Landroidx/compose/ui/node/飘花落叶言子世兰哲楪苏;", "Landroidx/compose/foundation/text/contextmenu/modifier/飘花落叶言子楪苏兰世哲;", "foundation"}, m152k = 1, m153mv = {2, 1, 0}, m155xi = 48)
final class C1666 extends AbstractC2571 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final C1752 f2694;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final InterfaceC7387 f2695;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final InterfaceC7387 f2696;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C1664 f2697;

    public C1666(C1664 c1664, InterfaceC7387 interfaceC7387, InterfaceC7387 interfaceC73872, C1752 c1752) {
        this.f2697 = c1664;
        this.f2695 = interfaceC7387;
        this.f2696 = interfaceC73872;
        this.f2694 = c1752;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1666)) {
            return false;
        }
        C1666 c1666 = (C1666) obj;
        return this.f2697 == c1666.f2697 && this.f2695 == c1666.f2695 && this.f2696 == c1666.f2696 && this.f2694 == c1666.f2694;
    }

    public final int hashCode() {
        return this.f2694.hashCode() + ((this.f2696.hashCode() + ((this.f2695.hashCode() + (this.f2697.hashCode() * 31)) * 31)) * 31);
    }

    @Override // androidx.compose.p001ui.node.AbstractC2571
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo1656(AbstractC2961 abstractC2961) {
        C1663 c1663 = (C1663) abstractC2961;
        c1663.f2691.f2693 = null;
        C1664 c1664 = this.f2697;
        c1663.f2691 = c1664;
        c1664.f2693 = c1663;
        c1664.f2692 = c1663.f6624 ? ToolbarHandlerState.Attached : ToolbarHandlerState.Detached;
        c1663.f2690 = this.f2695;
        c1663.f2689 = this.f2696;
        c1663.f2688 = this.f2694;
    }

    @Override // androidx.compose.p001ui.node.AbstractC2571
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final AbstractC2961 mo1657() {
        return new C1663(this.f2697, this.f2695, this.f2696, this.f2694);
    }
}
