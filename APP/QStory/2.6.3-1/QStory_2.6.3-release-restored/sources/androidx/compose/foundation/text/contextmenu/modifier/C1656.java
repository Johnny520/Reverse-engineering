package androidx.compose.foundation.text.contextmenu.modifier;

import androidx.compose.p001ui.AbstractC2961;
import androidx.compose.p001ui.node.AbstractC2571;
import kotlin.Metadata;
import p068.InterfaceC7383;

/* JADX INFO: renamed from: androidx.compose.foundation.text.contextmenu.modifier.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m150d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m151d2 = {"Landroidx/compose/foundation/text/contextmenu/modifier/飘花落叶言子楪世兰苏哲;", "Landroidx/compose/ui/node/飘花落叶言子世兰哲楪苏;", "Landroidx/compose/foundation/text/contextmenu/modifier/飘花落叶言子楪苏世兰哲;", "foundation"}, m152k = 1, m153mv = {2, 1, 0}, m155xi = 48)
final class C1656 extends AbstractC2571 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC7383 f2676;

    public C1656(InterfaceC7383 interfaceC7383) {
        this.f2676 = interfaceC7383;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1656) {
            return this.f2676 == ((C1656) obj).f2676;
        }
        return false;
    }

    public final int hashCode() {
        return this.f2676.hashCode();
    }

    @Override // androidx.compose.p001ui.node.AbstractC2571
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo1656(AbstractC2961 abstractC2961) {
        ((C1661) abstractC2961).f2682 = this.f2676;
    }

    @Override // androidx.compose.p001ui.node.AbstractC2571
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final AbstractC2961 mo1657() {
        return new C1661(this.f2676);
    }
}
