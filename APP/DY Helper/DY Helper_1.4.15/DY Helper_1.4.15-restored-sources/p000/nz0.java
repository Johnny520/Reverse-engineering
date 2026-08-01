package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class nz0 implements android.view.MenuItem.OnActionExpandListener {

    /* JADX INFO: renamed from: α */
    public final android.view.MenuItem.OnActionExpandListener f7826;

    /* JADX INFO: renamed from: β */
    public final /* synthetic */ androidx.appcompat.view.menu.MenuItemC0027 f7827;

    public nz0(androidx.appcompat.view.menu.MenuItemC0027 r1, android.view.MenuItem.OnActionExpandListener r2) {
            r0 = this;
            r0.<init>()
            r0.f7827 = r1
            r0.f7826 = r2
            return
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionCollapse(android.view.MenuItem r2) {
            r1 = this;
            androidx.appcompat.view.menu.α r0 = r1.f7827
            android.view.MenuItem r2 = r0.m7304(r2)
            android.view.MenuItem$OnActionExpandListener r1 = r1.f7826
            boolean r1 = r1.onMenuItemActionCollapse(r2)
            return r1
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionExpand(android.view.MenuItem r2) {
            r1 = this;
            androidx.appcompat.view.menu.α r0 = r1.f7827
            android.view.MenuItem r2 = r0.m7304(r2)
            android.view.MenuItem$OnActionExpandListener r1 = r1.f7826
            boolean r1 = r1.onMenuItemActionExpand(r2)
            return r1
    }
}
