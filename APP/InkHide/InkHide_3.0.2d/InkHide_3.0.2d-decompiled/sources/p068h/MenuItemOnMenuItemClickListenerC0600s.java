package p068h;

import android.view.MenuItem;

/* JADX INFO: renamed from: h.s */
/* JADX INFO: loaded from: classes.dex */
public final class MenuItemOnMenuItemClickListenerC0600s implements MenuItem.OnMenuItemClickListener {

    /* JADX INFO: renamed from: a */
    public final MenuItem.OnMenuItemClickListener f2092a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ MenuItemC0601t f2093b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public MenuItemOnMenuItemClickListenerC0600s(MenuItemC0601t menuItemC0601t, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f2093b = menuItemC0601t;
        this.f2092a = onMenuItemClickListener;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        return this.f2092a.onMenuItemClick(this.f2093b.m829g(menuItem));
    }
}
