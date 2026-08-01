package p106;

import androidx.compose.ui.AbstractC2128;
import androidx.compose.ui.node.AbstractC1736;
import kotlin.Metadata;
import p052.InterfaceC6557;

/* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"L飘花落叶言子世兰哲楪苏/飘花落叶言子楪世哲苏兰;", "Landroidx/compose/ui/node/飘花落叶言子世兰哲楪苏;", "L飘花落叶言子世兰哲楪苏/飘花落叶言子楪世兰哲苏;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class C7308 extends AbstractC1736 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final InterfaceC6557 f19456;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC6557 f19457;

    public C7308(InterfaceC6557 interfaceC6557, InterfaceC6557 interfaceC65572) {
        this.f19457 = interfaceC6557;
        this.f19456 = interfaceC65572;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7308)) {
            return false;
        }
        C7308 c7308 = (C7308) obj;
        return this.f19457 == c7308.f19457 && this.f19456 == c7308.f19456;
    }

    public final int hashCode() {
        InterfaceC6557 interfaceC6557 = this.f19457;
        int iHashCode = (interfaceC6557 != null ? interfaceC6557.hashCode() : 0) * 31;
        InterfaceC6557 interfaceC65572 = this.f19456;
        return iHashCode + (interfaceC65572 != null ? interfaceC65572.hashCode() : 0);
    }

    @Override // androidx.compose.ui.node.AbstractC1736
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo1095(AbstractC2128 abstractC2128) {
        C7305 c7305 = (C7305) abstractC2128;
        c7305.f19454 = this.f19457;
        c7305.f19455 = this.f19456;
    }

    @Override // androidx.compose.ui.node.AbstractC1736
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final AbstractC2128 mo1096() {
        C7305 c7305 = new C7305();
        c7305.f19454 = this.f19457;
        c7305.f19455 = this.f19456;
        return c7305;
    }
}
