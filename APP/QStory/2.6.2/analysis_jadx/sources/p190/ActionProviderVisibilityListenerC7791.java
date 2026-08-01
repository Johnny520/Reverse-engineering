package p190;

import android.view.ActionProvider;
import top.suzhelan.qstory.hook.item.chat.C5851;

/* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class ActionProviderVisibilityListenerC7791 implements ActionProvider.VisibilityListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final ActionProvider f21201;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public C5851 f21202;

    public ActionProviderVisibilityListenerC7791(MenuItemC7792 menuItemC7792, ActionProvider actionProvider) {
        this.f21201 = actionProvider;
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z) {
        C5851 c5851 = this.f21202;
        if (c5851 != null) {
            MenuC7801 menuC7801 = ((C7799) c5851.f16007).f21228;
            menuC7801.f21266 = true;
            menuC7801.m13136(true);
        }
    }
}
