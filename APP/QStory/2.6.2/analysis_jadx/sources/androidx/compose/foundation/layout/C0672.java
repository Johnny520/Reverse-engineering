package androidx.compose.foundation.layout;

import androidx.compose.ui.AbstractC2128;
import androidx.compose.ui.node.AbstractC1736;
import kotlin.Metadata;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.飘花落叶言子苏楪兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/飘花落叶言子苏楪兰哲世;", "Landroidx/compose/ui/node/飘花落叶言子世兰哲楪苏;", "Landroidx/compose/foundation/layout/飘花落叶言子苏世楪哲兰;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class C0672 extends AbstractC1736 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final IntrinsicSize f1868;

    public C0672(IntrinsicSize intrinsicSize) {
        this.f1868 = intrinsicSize;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        C0672 c0672 = obj instanceof C0672 ? (C0672) obj : null;
        return c0672 != null && this.f1868 == c0672.f1868;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.f1868.hashCode() * 31);
    }

    @Override // androidx.compose.ui.node.AbstractC1736
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo1095(AbstractC2128 abstractC2128) {
        C0656 c0656 = (C0656) abstractC2128;
        c0656.f1831 = this.f1868;
        c0656.f1832 = true;
    }

    @Override // androidx.compose.ui.node.AbstractC1736
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final AbstractC2128 mo1096() {
        C0656 c0656 = new C0656();
        c0656.f1831 = this.f1868;
        c0656.f1832 = true;
        return c0656;
    }
}
