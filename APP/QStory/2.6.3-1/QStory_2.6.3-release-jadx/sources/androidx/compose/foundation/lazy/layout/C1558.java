package androidx.compose.foundation.lazy.layout;

import androidx.compose.p001ui.AbstractC2961;
import androidx.compose.p001ui.node.AbstractC2571;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5227;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m150d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m151d2 = {"Landroidx/compose/foundation/lazy/layout/飘花落叶言子楪哲兰苏世;", "Landroidx/compose/ui/node/飘花落叶言子世兰哲楪苏;", "Landroidx/compose/foundation/lazy/layout/飘花落叶言子楪兰世苏哲;", "foundation"}, m152k = 1, m153mv = {2, 1, 0}, m155xi = 48)
final /* data */ class C1558 extends AbstractC2571 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C1553 f2364;

    public C1558(C1553 c1553) {
        this.f2364 = c1553;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1558) && this.f2364 == ((C1558) obj).f2364;
    }

    public final int hashCode() {
        return this.f2364.hashCode();
    }

    public final String toString() {
        return "DisplayingDisappearingItemsElement(animator=" + this.f2364 + ')';
    }

    @Override // androidx.compose.p001ui.node.AbstractC2571
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo1656(AbstractC2961 abstractC2961) {
        C1550 c1550 = (C1550) abstractC2961;
        C1553 c1553 = c1550.f2343;
        C1553 c15532 = this.f2364;
        if (AbstractC5227.m9466(c1553, c15532) || !c1550.f6637.f6624) {
            return;
        }
        C1553 c15533 = c1550.f2343;
        c15533.m2070();
        c15533.f2356 = null;
        c1550.f2343 = c15532;
    }

    @Override // androidx.compose.p001ui.node.AbstractC2571
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final AbstractC2961 mo1657() {
        C1550 c1550 = new C1550();
        c1550.f2343 = this.f2364;
        return c1550;
    }
}
