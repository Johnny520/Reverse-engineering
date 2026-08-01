package p122;

import androidx.compose.p001ui.AbstractC2961;
import androidx.compose.p001ui.node.AbstractC2571;
import kotlin.Metadata;
import p068.InterfaceC7387;

/* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m150d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m151d2 = {"L飘花落叶言子世兰哲楪苏/飘花落叶言子楪世哲苏兰;", "Landroidx/compose/ui/node/飘花落叶言子世兰哲楪苏;", "L飘花落叶言子世兰哲楪苏/飘花落叶言子楪世兰哲苏;", "ui"}, m152k = 1, m153mv = {2, 1, 0}, m155xi = 48)
final class C8138 extends AbstractC2571 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final InterfaceC7387 f19796;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC7387 f19797;

    public C8138(InterfaceC7387 interfaceC7387, InterfaceC7387 interfaceC73872) {
        this.f19797 = interfaceC7387;
        this.f19796 = interfaceC73872;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8138)) {
            return false;
        }
        C8138 c8138 = (C8138) obj;
        return this.f19797 == c8138.f19797 && this.f19796 == c8138.f19796;
    }

    public final int hashCode() {
        InterfaceC7387 interfaceC7387 = this.f19797;
        int iHashCode = (interfaceC7387 != null ? interfaceC7387.hashCode() : 0) * 31;
        InterfaceC7387 interfaceC73872 = this.f19796;
        return iHashCode + (interfaceC73872 != null ? interfaceC73872.hashCode() : 0);
    }

    @Override // androidx.compose.p001ui.node.AbstractC2571
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo1656(AbstractC2961 abstractC2961) {
        C8135 c8135 = (C8135) abstractC2961;
        c8135.f19794 = this.f19797;
        c8135.f19795 = this.f19796;
    }

    @Override // androidx.compose.p001ui.node.AbstractC2571
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final AbstractC2961 mo1657() {
        C8135 c8135 = new C8135();
        c8135.f19794 = this.f19797;
        c8135.f19795 = this.f19796;
        return c8135;
    }
}
