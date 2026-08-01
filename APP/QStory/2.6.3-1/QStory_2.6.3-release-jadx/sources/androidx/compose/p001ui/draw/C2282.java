package androidx.compose.p001ui.draw;

import androidx.compose.p001ui.AbstractC2961;
import androidx.compose.p001ui.node.AbstractC2571;
import kotlin.Metadata;
import p068.InterfaceC7387;

/* JADX INFO: renamed from: androidx.compose.ui.draw.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m150d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m151d2 = {"Landroidx/compose/ui/draw/飘花落叶言子楪苏兰世哲;", "Landroidx/compose/ui/node/飘花落叶言子世兰哲楪苏;", "Landroidx/compose/ui/draw/飘花落叶言子楪苏兰哲世;", "ui"}, m152k = 1, m153mv = {2, 1, 0}, m155xi = 48)
final class C2282 extends AbstractC2571 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC7387 f4487;

    public C2282(InterfaceC7387 interfaceC7387) {
        this.f4487 = interfaceC7387;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2282) {
            return this.f4487 == ((C2282) obj).f4487;
        }
        return false;
    }

    public final int hashCode() {
        return this.f4487.hashCode();
    }

    @Override // androidx.compose.p001ui.node.AbstractC2571
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo1656(AbstractC2961 abstractC2961) {
        ((C2283) abstractC2961).f4488 = this.f4487;
    }

    @Override // androidx.compose.p001ui.node.AbstractC2571
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final AbstractC2961 mo1657() {
        C2283 c2283 = new C2283();
        c2283.f4488 = this.f4487;
        return c2283;
    }
}
