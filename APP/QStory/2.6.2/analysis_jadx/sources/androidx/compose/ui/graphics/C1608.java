package androidx.compose.ui.graphics;

import androidx.compose.ui.AbstractC2128;
import androidx.compose.ui.node.AbstractC1736;
import androidx.compose.ui.node.AbstractC1785;
import androidx.compose.ui.node.AbstractC1794;
import kotlin.Metadata;
import p052.InterfaceC6557;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/飘花落叶言子楪哲苏兰世;", "Landroidx/compose/ui/node/飘花落叶言子世兰哲楪苏;", "Landroidx/compose/ui/graphics/飘花落叶言子楪哲兰世苏;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class C1608 extends AbstractC1736 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC6557 f4712;

    public C1608(InterfaceC6557 interfaceC6557) {
        this.f4712 = interfaceC6557;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1608) {
            return this.f4712 == ((C1608) obj).f4712;
        }
        return false;
    }

    public final int hashCode() {
        return this.f4712.hashCode();
    }

    @Override // androidx.compose.ui.node.AbstractC1736
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo1095(AbstractC2128 abstractC2128) {
        AbstractC1794 abstractC1794;
        C1605 c1605 = (C1605) abstractC2128;
        InterfaceC6557 interfaceC6557 = this.f4712;
        c1605.f4704 = interfaceC6557;
        if (c1605.f6291.f6278 && (abstractC1794 = AbstractC1785.m3338(c1605, 2).f5256) != null) {
            abstractC1794.m3401(interfaceC6557, true);
        }
    }

    @Override // androidx.compose.ui.node.AbstractC1736
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final AbstractC2128 mo1096() {
        return new C1605(this.f4712);
    }
}
