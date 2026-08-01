package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ru implements android.view.MenuItem.OnActionExpandListener {
    public final android.view.MenuItem.OnActionExpandListener a;
    public final /* synthetic */ defpackage.su b;

    public ru(defpackage.su r1, android.view.MenuItem.OnActionExpandListener r2) {
            r0 = this;
            r0.<init>()
            r0.b = r1
            r0.a = r2
            return
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionCollapse(android.view.MenuItem r2) {
            r1 = this;
            su r0 = r1.b
            android.view.MenuItem r2 = r0.g(r2)
            android.view.MenuItem$OnActionExpandListener r0 = r1.a
            boolean r2 = r0.onMenuItemActionCollapse(r2)
            return r2
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionExpand(android.view.MenuItem r2) {
            r1 = this;
            su r0 = r1.b
            android.view.MenuItem r2 = r0.g(r2)
            android.view.MenuItem$OnActionExpandListener r0 = r1.a
            boolean r2 = r0.onMenuItemActionExpand(r2)
            return r2
    }
}
