package androidx.compose.foundation.layout;

import androidx.compose.ui.AbstractC2128;
import androidx.compose.ui.node.AbstractC1736;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4394;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/飘花落叶言子苏楪世兰哲;", "Landroidx/compose/ui/node/飘花落叶言子世兰哲楪苏;", "Landroidx/compose/foundation/layout/飘花落叶言子苏楪哲兰世;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class C0669 extends AbstractC1736 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C0653 f1859;

    public C0669(C0653 c0653) {
        this.f1859 = c0653;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0669) {
            return ((C0669) obj).f1859.equals(this.f1859);
        }
        return false;
    }

    public final int hashCode() {
        return this.f1859.hashCode();
    }

    @Override // androidx.compose.ui.node.AbstractC1736
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo1095(AbstractC2128 abstractC2128) {
        C0674 c0674 = (C0674) abstractC2128;
        InterfaceC0608 interfaceC0608 = c0674.f1873;
        C0653 c0653 = this.f1859;
        if (AbstractC4394.m8917(c0653, interfaceC0608)) {
            return;
        }
        c0674.f1873 = c0653;
        c0674.mo1348();
    }

    @Override // androidx.compose.ui.node.AbstractC1736
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final AbstractC2128 mo1096() {
        return new C0674(this.f1859);
    }
}
