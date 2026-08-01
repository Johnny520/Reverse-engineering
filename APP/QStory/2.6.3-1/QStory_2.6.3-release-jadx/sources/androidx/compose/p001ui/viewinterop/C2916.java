package androidx.compose.p001ui.viewinterop;

import androidx.compose.p001ui.AbstractC2961;
import androidx.compose.p001ui.node.AbstractC2571;
import kotlin.Metadata;
import p068.InterfaceC7387;

/* JADX INFO: renamed from: androidx.compose.ui.viewinterop.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m150d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m151d2 = {"Landroidx/compose/ui/viewinterop/飘花落叶言子楪苏世兰哲;", "Landroidx/compose/ui/node/飘花落叶言子世兰哲楪苏;", "Landroidx/compose/ui/viewinterop/飘花落叶言子楪苏哲世兰;", "ui"}, m152k = 1, m153mv = {2, 1, 0}, m155xi = 48)
final class C2916 extends AbstractC2571 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC7387 f6526;

    public C2916(InterfaceC7387 interfaceC7387) {
        this.f6526 = interfaceC7387;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2916) {
            return this.f6526 == ((C2916) obj).f6526;
        }
        return false;
    }

    public final int hashCode() {
        return this.f6526.hashCode();
    }

    @Override // androidx.compose.p001ui.node.AbstractC2571
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo1656(AbstractC2961 abstractC2961) {
        C2920 c2920 = (C2920) abstractC2961;
        InterfaceC7387 interfaceC7387 = this.f6526;
        c2920.f6532 = interfaceC7387;
        if (c2920.f6624) {
            interfaceC7387.invoke(c2920.f6533);
        }
    }

    @Override // androidx.compose.p001ui.node.AbstractC2571
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final AbstractC2961 mo1657() {
        return new C2920(this.f6526);
    }
}
