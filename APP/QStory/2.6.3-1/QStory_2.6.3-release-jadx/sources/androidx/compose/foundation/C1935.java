package androidx.compose.foundation;

import androidx.compose.foundation.interaction.InterfaceC1420;
import androidx.compose.p001ui.AbstractC2961;
import androidx.compose.p001ui.node.AbstractC2571;
import androidx.compose.p001ui.node.InterfaceC2622;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5227;

/* JADX INFO: renamed from: androidx.compose.foundation.飘花落叶言子苏楪哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m150d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m151d2 = {"Landroidx/compose/foundation/飘花落叶言子苏楪哲兰世;", "Landroidx/compose/ui/node/飘花落叶言子世兰哲楪苏;", "Landroidx/compose/foundation/飘花落叶言子苏楪兰世哲;", "foundation"}, m152k = 1, m153mv = {2, 1, 0}, m155xi = 48)
final class C1935 extends AbstractC2571 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final InterfaceC1933 f3570;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC1420 f3571;

    public C1935(InterfaceC1420 interfaceC1420, InterfaceC1933 interfaceC1933) {
        this.f3571 = interfaceC1420;
        this.f3570 = interfaceC1933;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1935)) {
            return false;
        }
        C1935 c1935 = (C1935) obj;
        return AbstractC5227.m9466(this.f3571, c1935.f3571) && AbstractC5227.m9466(this.f3570, c1935.f3570);
    }

    public final int hashCode() {
        return this.f3570.hashCode() + (this.f3571.hashCode() * 31);
    }

    @Override // androidx.compose.p001ui.node.AbstractC2571
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo1656(AbstractC2961 abstractC2961) {
        C1932 c1932 = (C1932) abstractC2961;
        InterfaceC2622 interfaceC2622Mo2504 = this.f3570.mo2504(this.f3571);
        c1932.m3928(c1932.f3569);
        c1932.f3569 = interfaceC2622Mo2504;
        c1932.m3924(interfaceC2622Mo2504);
    }

    @Override // androidx.compose.p001ui.node.AbstractC2571
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final AbstractC2961 mo1657() {
        InterfaceC2622 interfaceC2622Mo2504 = this.f3570.mo2504(this.f3571);
        C1932 c1932 = new C1932();
        c1932.f3569 = interfaceC2622Mo2504;
        c1932.m3924(interfaceC2622Mo2504);
        return c1932;
    }
}
