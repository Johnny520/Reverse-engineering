package p206;

import android.view.MenuItem;

/* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class MenuItemOnMenuItemClickListenerC8625 implements MenuItem.OnMenuItemClickListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ MenuItemC8622 f21550;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final MenuItem.OnMenuItemClickListener f21551;

    public MenuItemOnMenuItemClickListenerC8625(MenuItemC8622 menuItemC8622, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f21550 = menuItemC8622;
        this.f21551 = onMenuItemClickListener;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        return this.f21551.onMenuItemClick(this.f21550.m871(menuItem));
    }
}
