package androidx.compose.foundation.text.contextmenu.modifier;

import androidx.compose.foundation.C1067;
import androidx.compose.foundation.text.selection.C0889;
import androidx.compose.ui.AbstractC2128;
import androidx.compose.ui.node.AbstractC1736;
import kotlin.Metadata;

/* JADX INFO: renamed from: androidx.compose.foundation.text.contextmenu.modifier.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/text/contextmenu/modifier/飘花落叶言子楪世苏兰哲;", "Landroidx/compose/ui/node/飘花落叶言子世兰哲楪苏;", "Landroidx/compose/foundation/text/contextmenu/modifier/飘花落叶言子楪世哲苏兰;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class C0819 extends AbstractC1736 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C0889 f2333;

    public C0819(C0889 c0889) {
        this.f2333 = c0889;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0819) {
            return this.f2333 == ((C0819) obj).f2333;
        }
        return false;
    }

    public final int hashCode() {
        return this.f2333.hashCode();
    }

    @Override // androidx.compose.ui.node.AbstractC1736
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo1095(AbstractC2128 abstractC2128) {
        ((C0818) abstractC2128).f2332 = this.f2333;
    }

    @Override // androidx.compose.ui.node.AbstractC1736
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final AbstractC2128 mo1096() {
        C0818 c0818 = new C0818();
        c0818.f2332 = this.f2333;
        C1067 c1067 = new C1067(c0818, 7);
        C0820 c0820 = new C0820();
        c0820.f2334 = c1067;
        c0818.m3354(c0820);
        return c0818;
    }
}
