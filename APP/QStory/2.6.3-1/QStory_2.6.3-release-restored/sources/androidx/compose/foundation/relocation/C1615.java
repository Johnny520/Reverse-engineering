package androidx.compose.foundation.relocation;

import androidx.compose.p001ui.AbstractC2961;
import androidx.compose.p001ui.node.AbstractC2571;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5227;

/* JADX INFO: renamed from: androidx.compose.foundation.relocation.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m150d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m151d2 = {"Landroidx/compose/foundation/relocation/飘花落叶言子楪世苏兰哲;", "Landroidx/compose/ui/node/飘花落叶言子世兰哲楪苏;", "Landroidx/compose/foundation/relocation/飘花落叶言子楪世兰苏哲;", "foundation"}, m152k = 1, m153mv = {2, 1, 0}, m155xi = 48)
final class C1615 extends AbstractC2571 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC1616 f2590;

    public C1615(InterfaceC1616 interfaceC1616) {
        this.f2590 = interfaceC1616;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1615) {
            return AbstractC5227.m9466(this.f2590, ((C1615) obj).f2590);
        }
        return false;
    }

    public final int hashCode() {
        return this.f2590.hashCode();
    }

    @Override // androidx.compose.p001ui.node.AbstractC2571
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo1656(AbstractC2961 abstractC2961) {
        C1612 c1612 = (C1612) abstractC2961;
        InterfaceC1616 interfaceC1616 = c1612.f2588;
        if (interfaceC1616 instanceof C1614) {
            ((C1614) interfaceC1616).f2589.m2615(c1612);
        }
        InterfaceC1616 interfaceC16162 = this.f2590;
        if (interfaceC16162 instanceof C1614) {
            ((C1614) interfaceC16162).f2589.m2607(c1612);
        }
        c1612.f2588 = interfaceC16162;
    }

    @Override // androidx.compose.p001ui.node.AbstractC2571
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final AbstractC2961 mo1657() {
        C1612 c1612 = new C1612();
        c1612.f2588 = this.f2590;
        return c1612;
    }
}
