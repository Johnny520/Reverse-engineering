package p206;

import android.view.MenuItem;

/* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class MenuItemOnActionExpandListenerC8624 implements MenuItem.OnActionExpandListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ MenuItemC8622 f21548;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final MenuItem.OnActionExpandListener f21549;

    public MenuItemOnActionExpandListenerC8624(MenuItemC8622 menuItemC8622, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f21548 = menuItemC8622;
        this.f21549 = onActionExpandListener;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.f21549.onMenuItemActionCollapse(this.f21548.m871(menuItem));
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.f21549.onMenuItemActionExpand(this.f21548.m871(menuItem));
    }
}
