package androidx.compose.foundation.text.contextmenu.modifier;

import androidx.compose.foundation.text.selection.C0914;
import androidx.compose.ui.AbstractC2128;
import androidx.compose.ui.node.AbstractC1736;
import kotlin.Metadata;
import p052.InterfaceC6558;

/* JADX INFO: renamed from: androidx.compose.foundation.text.contextmenu.modifier.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/text/contextmenu/modifier/飘花落叶言子楪苏哲兰世;", "Landroidx/compose/ui/node/飘花落叶言子世兰哲楪苏;", "Landroidx/compose/foundation/text/contextmenu/modifier/飘花落叶言子楪苏兰世哲;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class C0826 extends AbstractC1736 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final C0914 f2349;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final InterfaceC6558 f2350;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final InterfaceC6558 f2351;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C0824 f2352;

    public C0826(C0824 c0824, InterfaceC6558 interfaceC6558, InterfaceC6558 interfaceC65582, C0914 c0914) {
        this.f2352 = c0824;
        this.f2350 = interfaceC6558;
        this.f2351 = interfaceC65582;
        this.f2349 = c0914;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0826)) {
            return false;
        }
        C0826 c0826 = (C0826) obj;
        return this.f2352 == c0826.f2352 && this.f2350 == c0826.f2350 && this.f2351 == c0826.f2351 && this.f2349 == c0826.f2349;
    }

    public final int hashCode() {
        return this.f2349.hashCode() + ((this.f2351.hashCode() + ((this.f2350.hashCode() + (this.f2352.hashCode() * 31)) * 31)) * 31);
    }

    @Override // androidx.compose.ui.node.AbstractC1736
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo1096(AbstractC2128 abstractC2128) {
        C0823 c0823 = (C0823) abstractC2128;
        c0823.f2346.f2348 = null;
        C0824 c0824 = this.f2352;
        c0823.f2346 = c0824;
        c0824.f2348 = c0823;
        c0824.f2347 = c0823.f6279 ? ToolbarHandlerState.Attached : ToolbarHandlerState.Detached;
        c0823.f2345 = this.f2350;
        c0823.f2344 = this.f2351;
        c0823.f2343 = this.f2349;
    }

    @Override // androidx.compose.ui.node.AbstractC1736
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final AbstractC2128 mo1097() {
        return new C0823(this.f2352, this.f2350, this.f2351, this.f2349);
    }
}
