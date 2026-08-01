package androidx.compose.foundation.text.contextmenu.modifier;

import androidx.compose.foundation.text.contextmenu.provider.AbstractC1673;
import androidx.compose.foundation.text.contextmenu.provider.InterfaceC1674;
import androidx.compose.p001ui.node.AbstractC2620;
import kotlinx.coroutines.AbstractC6231;
import kotlinx.coroutines.C6249;
import kotlinx.coroutines.CoroutineStart;
import p192.AbstractC8570;

/* JADX INFO: renamed from: androidx.compose.foundation.text.contextmenu.modifier.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1664 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public ToolbarHandlerState f2692;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public C1663 f2693;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m2202() {
        InterfaceC1674 interfaceC1674;
        if (this.f2692 == ToolbarHandlerState.Uninitialized) {
            AbstractC8570.m13654("ToolbarRequester is not initialized.");
        }
        C1663 c1663 = this.f2693;
        if (c1663 == null || !c1663.f6624) {
            return;
        }
        C6249 c6249 = c1663.f2687;
        if ((c6249 == null || !c6249.mo11121()) && (interfaceC1674 = (InterfaceC1674) AbstractC2620.m3916(c1663, AbstractC1673.f2713)) != null) {
            c1663.f2687 = AbstractC6231.m11036(c1663.m4427(), null, CoroutineStart.UNDISPATCHED, new TextContextMenuToolbarHandlerNode$show$1(c1663, interfaceC1674, null), 1);
        }
    }
}
