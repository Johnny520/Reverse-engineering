package p068h;

import android.view.MenuItem;

/* JADX INFO: renamed from: h.r */
/* JADX INFO: loaded from: classes.dex */
public final class MenuItemOnActionExpandListenerC0599r implements MenuItem.OnActionExpandListener {

    /* JADX INFO: renamed from: a */
    public final MenuItem.OnActionExpandListener f2090a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ MenuItemC0601t f2091b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public MenuItemOnActionExpandListenerC0599r(MenuItemC0601t menuItemC0601t, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f2091b = menuItemC0601t;
        this.f2090a = onActionExpandListener;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.f2090a.onMenuItemActionCollapse(this.f2091b.m829g(menuItem));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.f2090a.onMenuItemActionExpand(this.f2091b.m829g(menuItem));
    }
}
