package p190;

import android.view.ActionProvider;
import top.suzhelan.qstory.hook.item.chat.C5856;

/* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class ActionProviderVisibilityListenerC7792 implements ActionProvider.VisibilityListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final ActionProvider f21198;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public C5856 f21199;

    public ActionProviderVisibilityListenerC7792(MenuItemC7793 menuItemC7793, ActionProvider actionProvider) {
        this.f21198 = actionProvider;
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z) {
        C5856 c5856 = this.f21199;
        if (c5856 != null) {
            MenuC7802 menuC7802 = ((C7800) c5856.f16014).f21225;
            menuC7802.f21263 = true;
            menuC7802.m13164(true);
        }
    }
}
