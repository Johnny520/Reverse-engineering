package p000;

import android.view.MenuItem;

/* JADX INFO: renamed from: zu */
/* JADX INFO: loaded from: classes.dex */
public final class MenuItemOnActionExpandListenerC0980zu implements MenuItem.OnActionExpandListener {

    /* JADX INFO: renamed from: a */
    public final MenuItem.OnActionExpandListener f5620a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ MenuItemC0045av f5621b;

    public MenuItemOnActionExpandListenerC0980zu(MenuItemC0045av menuItemC0045av, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f5621b = menuItemC0045av;
        this.f5620a = onActionExpandListener;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.f5620a.onMenuItemActionCollapse(this.f5621b.m1968g(menuItem));
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.f5620a.onMenuItemActionExpand(this.f5621b.m1968g(menuItem));
    }
}
