package p190;

import android.view.MenuItem;

/* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class MenuItemOnMenuItemClickListenerC7795 implements MenuItem.OnMenuItemClickListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ MenuItemC7792 f21208;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final MenuItem.OnMenuItemClickListener f21209;

    public MenuItemOnMenuItemClickListenerC7795(MenuItemC7792 menuItemC7792, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f21208 = menuItemC7792;
        this.f21209 = onMenuItemClickListener;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        return this.f21209.onMenuItemClick(this.f21208.m310(menuItem));
    }
}
