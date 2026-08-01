package androidx.compose.foundation.text.contextmenu.modifier;

import androidx.compose.foundation.text.contextmenu.provider.AbstractC0833;
import androidx.compose.foundation.text.contextmenu.provider.InterfaceC0834;
import androidx.compose.ui.node.AbstractC1785;
import kotlinx.coroutines.AbstractC5398;
import kotlinx.coroutines.C5416;
import kotlinx.coroutines.CoroutineStart;
import p176.AbstractC7740;

/* JADX INFO: renamed from: androidx.compose.foundation.text.contextmenu.modifier.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C0824 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public ToolbarHandlerState f2346;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public C0823 f2347;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m1632() {
        InterfaceC0834 interfaceC0834;
        if (this.f2346 == ToolbarHandlerState.Uninitialized) {
            AbstractC7740.m13067("ToolbarRequester is not initialized.");
        }
        C0823 c0823 = this.f2347;
        if (c0823 == null || !c0823.f6278) {
            return;
        }
        C5416 c5416 = c0823.f2341;
        if ((c5416 == null || !c5416.mo10557()) && (interfaceC0834 = (InterfaceC0834) AbstractC1785.m3346(c0823, AbstractC0833.f2367)) != null) {
            c0823.f2341 = AbstractC5398.m10473(c0823.m3857(), null, CoroutineStart.UNDISPATCHED, new TextContextMenuToolbarHandlerNode$show$1(c0823, interfaceC0834, null), 1);
        }
    }
}
