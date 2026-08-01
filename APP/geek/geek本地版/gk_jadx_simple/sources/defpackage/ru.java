package defpackage;

import android.view.MenuItem;

/* JADX INFO: loaded from: classes.dex */
public final class ru implements MenuItem.OnActionExpandListener {
    public final MenuItem.OnActionExpandListener a;
    public final /* synthetic */ su b;

    public ru(su r1, MenuItem.OnActionExpandListener r2) {
        this.b = r1;
        this.a = r2;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionCollapse(MenuItem r2) {
        MenuItem r22 = this.b.g(r2);
        return this.a.onMenuItemActionCollapse(r22);
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionExpand(MenuItem r2) {
        MenuItem r22 = this.b.g(r2);
        return this.a.onMenuItemActionExpand(r22);
    }
}
