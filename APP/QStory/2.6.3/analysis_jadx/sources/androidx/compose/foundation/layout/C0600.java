package androidx.compose.foundation.layout;

import androidx.compose.ui.AbstractC2128;
import androidx.compose.ui.node.AbstractC1736;
import kotlin.Metadata;
import p052.InterfaceC6558;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/飘花落叶言子世楪苏哲兰;", "Landroidx/compose/ui/node/飘花落叶言子世兰哲楪苏;", "Landroidx/compose/foundation/layout/飘花落叶言子世楪苏兰哲;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class C0600 extends AbstractC1736 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC6558 f1680;

    public C0600(InterfaceC6558 interfaceC6558) {
        this.f1680 = interfaceC6558;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0600) && ((C0600) obj).f1680 == this.f1680;
    }

    public final int hashCode() {
        return this.f1680.hashCode();
    }

    @Override // androidx.compose.ui.node.AbstractC1736
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo1096(AbstractC2128 abstractC2128) {
        C0599 c0599 = (C0599) abstractC2128;
        InterfaceC6558 interfaceC6558 = c0599.f1679;
        InterfaceC6558 interfaceC65582 = this.f1680;
        if (interfaceC65582 != interfaceC6558) {
            c0599.f1679 = interfaceC65582;
        }
    }

    @Override // androidx.compose.ui.node.AbstractC1736
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final AbstractC2128 mo1097() {
        C0599 c0599 = new C0599();
        c0599.f1679 = this.f1680;
        return c0599;
    }
}
