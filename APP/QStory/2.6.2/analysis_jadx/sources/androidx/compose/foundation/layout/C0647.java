package androidx.compose.foundation.layout;

import androidx.compose.ui.AbstractC2128;
import androidx.compose.ui.C2131;
import androidx.compose.ui.node.AbstractC1736;
import kotlin.Metadata;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/飘花落叶言子楪苏兰世哲;", "Landroidx/compose/ui/node/飘花落叶言子世兰哲楪苏;", "Landroidx/compose/foundation/layout/飘花落叶言子楪苏兰哲世;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class C0647 extends AbstractC1736 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C2131 f1817;

    public C0647(C2131 c2131) {
        this.f1817 = c2131;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        C0647 c0647 = obj instanceof C0647 ? (C0647) obj : null;
        return c0647 != null && this.f1817.equals(c0647.f1817);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (this.f1817.hashCode() * 31);
    }

    @Override // androidx.compose.ui.node.AbstractC1736
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo1095(AbstractC2128 abstractC2128) {
        ((C0648) abstractC2128).f1818 = this.f1817;
    }

    @Override // androidx.compose.ui.node.AbstractC1736
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final AbstractC2128 mo1096() {
        C0648 c0648 = new C0648();
        c0648.f1818 = this.f1817;
        return c0648;
    }
}
