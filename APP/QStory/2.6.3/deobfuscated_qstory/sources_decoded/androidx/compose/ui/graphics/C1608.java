package androidx.compose.ui.graphics;

import androidx.compose.ui.AbstractC2128;
import androidx.compose.ui.node.AbstractC1736;
import androidx.compose.ui.node.AbstractC1785;
import androidx.compose.ui.node.AbstractC1794;
import kotlin.Metadata;
import p052.InterfaceC6558;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/飘花落叶言子楪哲苏兰世;", "Landroidx/compose/ui/node/飘花落叶言子世兰哲楪苏;", "Landroidx/compose/ui/graphics/飘花落叶言子楪哲兰世苏;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class C1608 extends AbstractC1736 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC6558 f4713;

    public C1608(InterfaceC6558 interfaceC6558) {
        this.f4713 = interfaceC6558;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1608) {
            return this.f4713 == ((C1608) obj).f4713;
        }
        return false;
    }

    public final int hashCode() {
        return this.f4713.hashCode();
    }

    @Override // androidx.compose.ui.node.AbstractC1736
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo1096(AbstractC2128 abstractC2128) {
        AbstractC1794 abstractC1794;
        C1605 c1605 = (C1605) abstractC2128;
        InterfaceC6558 interfaceC6558 = this.f4713;
        c1605.f4705 = interfaceC6558;
        if (c1605.f6292.f6279 && (abstractC1794 = AbstractC1785.m3348(c1605, 2).f5257) != null) {
            abstractC1794.m3411(interfaceC6558, true);
        }
    }

    @Override // androidx.compose.ui.node.AbstractC1736
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final AbstractC2128 mo1097() {
        return new C1605(this.f4713);
    }
}
