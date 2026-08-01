package defpackage;

/* JADX INFO: renamed from: ᲇᛸᛵᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class MenuItemOnActionExpandListenerC2103 implements android.view.MenuItem.OnActionExpandListener {

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final android.view.MenuItem.OnActionExpandListener f9013;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final /* synthetic */ defpackage.MenuItemC1719 f9014;

    public MenuItemOnActionExpandListenerC2103(defpackage.MenuItemC1719 r1, android.view.MenuItem.OnActionExpandListener r2) {
            r0 = this;
            r0.<init>()
            r0.f9014 = r1
            r0.f9013 = r2
            return
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionCollapse(android.view.MenuItem r2) {
            r1 = this;
            ᲀᛸᛱᲈ r0 = r1.f9014
            android.view.MenuItem r2 = r0.m2355(r2)
            android.view.MenuItem$OnActionExpandListener r1 = r1.f9013
            boolean r1 = r1.onMenuItemActionCollapse(r2)
            return r1
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionExpand(android.view.MenuItem r2) {
            r1 = this;
            ᲀᛸᛱᲈ r0 = r1.f9014
            android.view.MenuItem r2 = r0.m2355(r2)
            android.view.MenuItem$OnActionExpandListener r1 = r1.f9013
            boolean r1 = r1.onMenuItemActionExpand(r2)
            return r1
    }
}
