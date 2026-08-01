package p190;

import android.view.MenuItem;

/* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class MenuItemOnActionExpandListenerC7795 implements MenuItem.OnActionExpandListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ MenuItemC7793 f21203;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final MenuItem.OnActionExpandListener f21204;

    public MenuItemOnActionExpandListenerC7795(MenuItemC7793 menuItemC7793, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f21203 = menuItemC7793;
        this.f21204 = onActionExpandListener;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.f21204.onMenuItemActionCollapse(this.f21203.m311(menuItem));
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.f21204.onMenuItemActionExpand(this.f21203.m311(menuItem));
    }
}
