package p190;

import android.view.MenuItem;

/* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class MenuItemOnActionExpandListenerC7794 implements MenuItem.OnActionExpandListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ MenuItemC7792 f21206;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final MenuItem.OnActionExpandListener f21207;

    public MenuItemOnActionExpandListenerC7794(MenuItemC7792 menuItemC7792, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f21206 = menuItemC7792;
        this.f21207 = onActionExpandListener;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.f21207.onMenuItemActionCollapse(this.f21206.m310(menuItem));
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.f21207.onMenuItemActionExpand(this.f21206.m310(menuItem));
    }
}
