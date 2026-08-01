package androidx.compose.foundation.text.contextmenu.modifier;

import androidx.compose.foundation.text.contextmenu.provider.AbstractC0833;
import androidx.compose.foundation.text.contextmenu.provider.InterfaceC0834;
import androidx.compose.ui.node.AbstractC1785;
import kotlinx.coroutines.AbstractC5399;
import kotlinx.coroutines.C5417;
import kotlinx.coroutines.CoroutineStart;
import p176.AbstractC7741;

/* JADX INFO: renamed from: androidx.compose.foundation.text.contextmenu.modifier.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0824 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public ToolbarHandlerState f2347;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public C0823 f2348;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m1642() {
        InterfaceC0834 interfaceC0834;
        if (this.f2347 == ToolbarHandlerState.Uninitialized) {
            AbstractC7741.m13095("ToolbarRequester is not initialized.");
        }
        C0823 c0823 = this.f2348;
        if (c0823 == null || !c0823.f6279) {
            return;
        }
        C5417 c5417 = c0823.f2342;
        if ((c5417 == null || !c5417.mo10562()) && (interfaceC0834 = (InterfaceC0834) AbstractC1785.m3356(c0823, AbstractC0833.f2368)) != null) {
            c0823.f2342 = AbstractC5399.m10477(c0823.m3867(), null, CoroutineStart.UNDISPATCHED, new TextContextMenuToolbarHandlerNode$show$1(c0823, interfaceC0834, null), 1);
        }
    }
}
