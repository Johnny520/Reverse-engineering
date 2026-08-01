package androidx.compose.foundation.layout;

import androidx.compose.p001ui.AbstractC2961;
import androidx.compose.p001ui.node.AbstractC2571;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5227;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.飘花落叶言子苏哲世兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m150d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m151d2 = {"Landroidx/compose/foundation/layout/飘花落叶言子苏哲世兰楪;", "Landroidx/compose/ui/node/飘花落叶言子世兰哲楪苏;", "Landroidx/compose/foundation/layout/飘花落叶言子苏哲兰世楪;", "foundation-layout"}, m152k = 1, m153mv = {2, 1, 0}, m155xi = 48)
final class C1504 extends AbstractC2571 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC1505 f2190;

    public C1504(InterfaceC1505 interfaceC1505) {
        this.f2190 = interfaceC1505;
    }

    public final boolean equals(Object obj) {
        C1504 c1504 = obj instanceof C1504 ? (C1504) obj : null;
        if (c1504 == null) {
            return false;
        }
        return AbstractC5227.m9466(this.f2190, c1504.f2190);
    }

    public final int hashCode() {
        return this.f2190.hashCode();
    }

    @Override // androidx.compose.p001ui.node.AbstractC2571
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo1656(AbstractC2961 abstractC2961) {
        ((C1506) abstractC2961).f2191 = this.f2190;
    }

    @Override // androidx.compose.p001ui.node.AbstractC2571
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final AbstractC2961 mo1657() {
        C1506 c1506 = new C1506();
        c1506.f2191 = this.f2190;
        return c1506;
    }
}
