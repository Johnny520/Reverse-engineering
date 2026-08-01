package androidx.compose.p001ui.graphics;

import androidx.compose.p001ui.AbstractC2961;
import androidx.compose.p001ui.node.AbstractC2571;
import androidx.compose.p001ui.node.AbstractC2620;
import androidx.compose.p001ui.node.AbstractC2629;
import kotlin.Metadata;
import p068.InterfaceC7387;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m150d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m151d2 = {"Landroidx/compose/ui/graphics/飘花落叶言子楪哲苏兰世;", "Landroidx/compose/ui/node/飘花落叶言子世兰哲楪苏;", "Landroidx/compose/ui/graphics/飘花落叶言子楪哲兰世苏;", "ui"}, m152k = 1, m153mv = {2, 1, 0}, m155xi = 48)
final class C2443 extends AbstractC2571 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC7387 f5058;

    public C2443(InterfaceC7387 interfaceC7387) {
        this.f5058 = interfaceC7387;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2443) {
            return this.f5058 == ((C2443) obj).f5058;
        }
        return false;
    }

    public final int hashCode() {
        return this.f5058.hashCode();
    }

    @Override // androidx.compose.p001ui.node.AbstractC2571
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo1656(AbstractC2961 abstractC2961) {
        AbstractC2629 abstractC2629;
        C2440 c2440 = (C2440) abstractC2961;
        InterfaceC7387 interfaceC7387 = this.f5058;
        c2440.f5050 = interfaceC7387;
        if (c2440.f6637.f6624 && (abstractC2629 = AbstractC2620.m3908(c2440, 2).f5602) != null) {
            abstractC2629.m3971(interfaceC7387, true);
        }
    }

    @Override // androidx.compose.p001ui.node.AbstractC2571
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final AbstractC2961 mo1657() {
        return new C2440(this.f5058);
    }
}
