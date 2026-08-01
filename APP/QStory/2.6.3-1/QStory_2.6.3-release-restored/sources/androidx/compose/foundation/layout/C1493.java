package androidx.compose.foundation.layout;

import androidx.compose.p001ui.AbstractC2961;
import androidx.compose.p001ui.node.AbstractC2571;
import androidx.compose.p001ui.node.AbstractC2620;
import androidx.compose.p001ui.node.C2583;
import androidx.compose.p001ui.node.C2586;
import kotlin.Metadata;
import p068.InterfaceC7387;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.飘花落叶言子苏世兰楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m150d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m151d2 = {"Landroidx/compose/foundation/layout/飘花落叶言子苏世兰楪哲;", "Landroidx/compose/ui/node/飘花落叶言子世兰哲楪苏;", "Landroidx/compose/foundation/layout/飘花落叶言子苏世兰哲楪;", "foundation-layout"}, m152k = 1, m153mv = {2, 1, 0}, m155xi = 48)
final class C1493 extends AbstractC2571 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC7387 f2170;

    public C1493(InterfaceC7387 interfaceC7387) {
        this.f2170 = interfaceC7387;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        C1493 c1493 = obj instanceof C1493 ? (C1493) obj : null;
        return c1493 != null && this.f2170 == c1493.f2170;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.f2170.hashCode() * 31);
    }

    public final String toString() {
        return "OffsetPxModifier(offset=" + this.f2170 + ", rtlAware=true)";
    }

    @Override // androidx.compose.p001ui.node.AbstractC2571
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo1656(AbstractC2961 abstractC2961) {
        C1492 c1492 = (C1492) abstractC2961;
        InterfaceC7387 interfaceC7387 = c1492.f2168;
        InterfaceC7387 interfaceC73872 = this.f2170;
        if (interfaceC7387 != interfaceC73872 || !c1492.f2169) {
            C2583 c2583M3906 = AbstractC2620.m3906(c1492);
            C2586 c2586 = C2583.f5434;
            c2583M3906.m3785(false);
        }
        c1492.f2168 = interfaceC73872;
        c1492.f2169 = true;
    }

    @Override // androidx.compose.p001ui.node.AbstractC2571
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final AbstractC2961 mo1657() {
        C1492 c1492 = new C1492();
        c1492.f2168 = this.f2170;
        c1492.f2169 = true;
        return c1492;
    }
}
