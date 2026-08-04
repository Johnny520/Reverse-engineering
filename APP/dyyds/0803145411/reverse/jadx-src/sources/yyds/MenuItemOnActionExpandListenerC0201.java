package yyds;

import android.view.MenuItem;

/* JADX INFO: renamed from: yyds.ᛱᲀᛶᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class MenuItemOnActionExpandListenerC0201 implements MenuItem.OnActionExpandListener {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final MenuItem.OnActionExpandListener f1173;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final /* synthetic */ MenuItemC1806 f1174;

    public MenuItemOnActionExpandListenerC0201(MenuItemC1806 menuItemC1806, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f1174 = menuItemC1806;
        this.f1173 = onActionExpandListener;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.f1173.onMenuItemActionCollapse(this.f1174.m4327(menuItem));
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.f1173.onMenuItemActionExpand(this.f1174.m4327(menuItem));
    }
}
