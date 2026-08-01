package p000;

import android.view.MenuItem;

/* JADX INFO: renamed from: ru */
/* JADX INFO: loaded from: classes.dex */
public final class MenuItemOnActionExpandListenerC0684ru implements MenuItem.OnActionExpandListener {

    /* JADX INFO: renamed from: a */
    public final MenuItem.OnActionExpandListener f4345a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ MenuItemC0721su f4346b;

    public MenuItemOnActionExpandListenerC0684ru(MenuItemC0721su menuItemC0721su, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f4346b = menuItemC0721su;
        this.f4345a = onActionExpandListener;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.f4345a.onMenuItemActionCollapse(this.f4346b.m1987g(menuItem));
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.f4345a.onMenuItemActionExpand(this.f4346b.m1987g(menuItem));
    }
}
