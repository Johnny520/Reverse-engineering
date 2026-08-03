package p000;

import android.view.MenuItem;

/* JADX INFO: renamed from: tr */
/* JADX INFO: loaded from: classes.dex */
public final class MenuItemOnActionExpandListenerC2556tr implements MenuItem.OnActionExpandListener {

    /* JADX INFO: renamed from: a */
    public final MenuItem.OnActionExpandListener f8877a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ MenuItemC2599ur f8878b;

    public MenuItemOnActionExpandListenerC2556tr(MenuItemC2599ur menuItemC2599ur, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f8878b = menuItemC2599ur;
        this.f8877a = onActionExpandListener;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.f8877a.onMenuItemActionCollapse(this.f8878b.m83i(menuItem));
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.f8877a.onMenuItemActionExpand(this.f8878b.m83i(menuItem));
    }
}
