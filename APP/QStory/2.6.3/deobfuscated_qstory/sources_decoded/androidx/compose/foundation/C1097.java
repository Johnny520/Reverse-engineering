package androidx.compose.foundation;

import androidx.compose.foundation.interaction.InterfaceC0579;
import androidx.compose.ui.AbstractC2128;
import androidx.compose.ui.node.AbstractC1736;
import androidx.compose.ui.node.InterfaceC1787;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4395;

/* JADX INFO: renamed from: androidx.compose.foundation.飘花落叶言子苏楪哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/飘花落叶言子苏楪哲兰世;", "Landroidx/compose/ui/node/飘花落叶言子世兰哲楪苏;", "Landroidx/compose/foundation/飘花落叶言子苏楪兰世哲;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class C1097 extends AbstractC1736 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final InterfaceC1095 f3225;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC0579 f3226;

    public C1097(InterfaceC0579 interfaceC0579, InterfaceC1095 interfaceC1095) {
        this.f3226 = interfaceC0579;
        this.f3225 = interfaceC1095;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1097)) {
            return false;
        }
        C1097 c1097 = (C1097) obj;
        return AbstractC4395.m8907(this.f3226, c1097.f3226) && AbstractC4395.m8907(this.f3225, c1097.f3225);
    }

    public final int hashCode() {
        return this.f3225.hashCode() + (this.f3226.hashCode() * 31);
    }

    @Override // androidx.compose.ui.node.AbstractC1736
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo1096(AbstractC2128 abstractC2128) {
        C1094 c1094 = (C1094) abstractC2128;
        InterfaceC1787 interfaceC1787Mo1944 = this.f3225.mo1944(this.f3226);
        c1094.m3368(c1094.f3224);
        c1094.f3224 = interfaceC1787Mo1944;
        c1094.m3364(interfaceC1787Mo1944);
    }

    @Override // androidx.compose.ui.node.AbstractC1736
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final AbstractC2128 mo1097() {
        InterfaceC1787 interfaceC1787Mo1944 = this.f3225.mo1944(this.f3226);
        C1094 c1094 = new C1094();
        c1094.f3224 = interfaceC1787Mo1944;
        c1094.m3364(interfaceC1787Mo1944);
        return c1094;
    }
}
