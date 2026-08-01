package p190;

import android.view.MenuItem;

/* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class MenuItemOnMenuItemClickListenerC7796 implements MenuItem.OnMenuItemClickListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ MenuItemC7793 f21205;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final MenuItem.OnMenuItemClickListener f21206;

    public MenuItemOnMenuItemClickListenerC7796(MenuItemC7793 menuItemC7793, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f21205 = menuItemC7793;
        this.f21206 = onMenuItemClickListener;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        return this.f21206.onMenuItemClick(this.f21205.m311(menuItem));
    }
}
