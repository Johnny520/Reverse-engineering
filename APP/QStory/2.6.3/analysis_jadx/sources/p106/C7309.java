package p106;

import androidx.compose.ui.AbstractC2128;
import androidx.compose.ui.node.AbstractC1736;
import kotlin.Metadata;
import p052.InterfaceC6558;

/* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"L飘花落叶言子世兰哲楪苏/飘花落叶言子楪世哲苏兰;", "Landroidx/compose/ui/node/飘花落叶言子世兰哲楪苏;", "L飘花落叶言子世兰哲楪苏/飘花落叶言子楪世兰哲苏;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class C7309 extends AbstractC1736 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final InterfaceC6558 f19451;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC6558 f19452;

    public C7309(InterfaceC6558 interfaceC6558, InterfaceC6558 interfaceC65582) {
        this.f19452 = interfaceC6558;
        this.f19451 = interfaceC65582;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7309)) {
            return false;
        }
        C7309 c7309 = (C7309) obj;
        return this.f19452 == c7309.f19452 && this.f19451 == c7309.f19451;
    }

    public final int hashCode() {
        InterfaceC6558 interfaceC6558 = this.f19452;
        int iHashCode = (interfaceC6558 != null ? interfaceC6558.hashCode() : 0) * 31;
        InterfaceC6558 interfaceC65582 = this.f19451;
        return iHashCode + (interfaceC65582 != null ? interfaceC65582.hashCode() : 0);
    }

    @Override // androidx.compose.ui.node.AbstractC1736
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo1096(AbstractC2128 abstractC2128) {
        C7306 c7306 = (C7306) abstractC2128;
        c7306.f19449 = this.f19452;
        c7306.f19450 = this.f19451;
    }

    @Override // androidx.compose.ui.node.AbstractC1736
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final AbstractC2128 mo1097() {
        C7306 c7306 = new C7306();
        c7306.f19449 = this.f19452;
        c7306.f19450 = this.f19451;
        return c7306;
    }
}
