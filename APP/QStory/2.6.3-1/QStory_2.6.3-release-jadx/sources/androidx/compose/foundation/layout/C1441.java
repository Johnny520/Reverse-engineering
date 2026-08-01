package androidx.compose.foundation.layout;

import androidx.compose.p001ui.AbstractC2961;
import androidx.compose.p001ui.node.AbstractC2571;
import kotlin.Metadata;
import p068.InterfaceC7387;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m150d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m151d2 = {"Landroidx/compose/foundation/layout/飘花落叶言子世楪苏哲兰;", "Landroidx/compose/ui/node/飘花落叶言子世兰哲楪苏;", "Landroidx/compose/foundation/layout/飘花落叶言子世楪苏兰哲;", "foundation-layout"}, m152k = 1, m153mv = {2, 1, 0}, m155xi = 48)
final class C1441 extends AbstractC2571 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC7387 f2025;

    public C1441(InterfaceC7387 interfaceC7387) {
        this.f2025 = interfaceC7387;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1441) && ((C1441) obj).f2025 == this.f2025;
    }

    public final int hashCode() {
        return this.f2025.hashCode();
    }

    @Override // androidx.compose.p001ui.node.AbstractC2571
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo1656(AbstractC2961 abstractC2961) {
        C1440 c1440 = (C1440) abstractC2961;
        InterfaceC7387 interfaceC7387 = c1440.f2024;
        InterfaceC7387 interfaceC73872 = this.f2025;
        if (interfaceC73872 != interfaceC7387) {
            c1440.f2024 = interfaceC73872;
        }
    }

    @Override // androidx.compose.p001ui.node.AbstractC2571
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final AbstractC2961 mo1657() {
        C1440 c1440 = new C1440();
        c1440.f2024 = this.f2025;
        return c1440;
    }
}
