package p206;

import android.view.ActionProvider;
import top.suzhelan.qstory.hook.item.chat.C6686;

/* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class ActionProviderVisibilityListenerC8621 implements ActionProvider.VisibilityListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final ActionProvider f21543;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public C6686 f21544;

    public ActionProviderVisibilityListenerC8621(MenuItemC8622 menuItemC8622, ActionProvider actionProvider) {
        this.f21543 = actionProvider;
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z) {
        C6686 c6686 = this.f21544;
        if (c6686 != null) {
            MenuC8631 menuC8631 = ((C8629) c6686.f16359).f21570;
            menuC8631.f21608 = true;
            menuC8631.m13723(true);
        }
    }
}
