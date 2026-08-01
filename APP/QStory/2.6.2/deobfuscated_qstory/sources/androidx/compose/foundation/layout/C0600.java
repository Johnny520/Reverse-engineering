package androidx.compose.foundation.layout;

import androidx.compose.ui.AbstractC2128;
import androidx.compose.ui.node.AbstractC1736;
import kotlin.Metadata;
import p052.InterfaceC6557;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/飘花落叶言子世楪苏哲兰;", "Landroidx/compose/ui/node/飘花落叶言子世兰哲楪苏;", "Landroidx/compose/foundation/layout/飘花落叶言子世楪苏兰哲;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class C0600 extends AbstractC1736 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC6557 f1679;

    public C0600(InterfaceC6557 interfaceC6557) {
        this.f1679 = interfaceC6557;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0600) && ((C0600) obj).f1679 == this.f1679;
    }

    public final int hashCode() {
        return this.f1679.hashCode();
    }

    @Override // androidx.compose.ui.node.AbstractC1736
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo1095(AbstractC2128 abstractC2128) {
        C0599 c0599 = (C0599) abstractC2128;
        InterfaceC6557 interfaceC6557 = c0599.f1678;
        InterfaceC6557 interfaceC65572 = this.f1679;
        if (interfaceC65572 != interfaceC6557) {
            c0599.f1678 = interfaceC65572;
        }
    }

    @Override // androidx.compose.ui.node.AbstractC1736
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final AbstractC2128 mo1096() {
        C0599 c0599 = new C0599();
        c0599.f1678 = this.f1679;
        return c0599;
    }
}
