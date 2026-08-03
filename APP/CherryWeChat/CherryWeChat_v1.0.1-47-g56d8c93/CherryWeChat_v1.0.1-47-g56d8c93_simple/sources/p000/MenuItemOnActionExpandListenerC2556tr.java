package p000;

import android.view.MenuItem;

/* JADX INFO: renamed from: tr */
/* JADX INFO: loaded from: classes.dex */
public final class MenuItemOnActionExpandListenerC2556tr implements MenuItem.OnActionExpandListener {

    /* JADX INFO: renamed from: a */
    public final MenuItem.OnActionExpandListener f8877a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ MenuItemC2599ur f8878b;

    public MenuItemOnActionExpandListenerC2556tr(MenuItemC2599ur r1, MenuItem.OnActionExpandListener r2) {
        this.f8878b = r1;
        this.f8877a = r2;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionCollapse(MenuItem r2) {
        MenuItem r22 = this.f8878b.m83i(r2);
        return this.f8877a.onMenuItemActionCollapse(r22);
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionExpand(MenuItem r2) {
        MenuItem r22 = this.f8878b.m83i(r2);
        return this.f8877a.onMenuItemActionExpand(r22);
    }
}
