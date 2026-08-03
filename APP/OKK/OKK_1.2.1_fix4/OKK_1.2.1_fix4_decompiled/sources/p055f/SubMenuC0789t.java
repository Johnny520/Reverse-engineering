package p055f;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* JADX INFO: renamed from: f.t */
/* JADX INFO: loaded from: classes.dex */
public final class SubMenuC0789t extends MenuC0779j implements SubMenu {

    /* JADX INFO: renamed from: v */
    public final MenuC0779j f2867v;

    /* JADX INFO: renamed from: w */
    public final MenuItemC0780k f2868w;

    public SubMenuC0789t(Context context, MenuC0779j menuC0779j, MenuItemC0780k menuItemC0780k) {
        super(context);
        this.f2867v = menuC0779j;
        this.f2868w = menuItemC0780k;
    }

    @Override // p055f.MenuC0779j
    /* JADX INFO: renamed from: d */
    public final boolean mo1998d(MenuItemC0780k menuItemC0780k) {
        return this.f2867v.mo1998d(menuItemC0780k);
    }

    @Override // p055f.MenuC0779j
    /* JADX INFO: renamed from: e */
    public final boolean mo1999e(MenuC0779j menuC0779j, MenuItem menuItem) {
        return super.mo1999e(menuC0779j, menuItem) || this.f2867v.mo1999e(menuC0779j, menuItem);
    }

    @Override // p055f.MenuC0779j
    /* JADX INFO: renamed from: f */
    public final boolean mo2000f(MenuItemC0780k menuItemC0780k) {
        return this.f2867v.mo2000f(menuItemC0780k);
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.f2868w;
    }

    @Override // p055f.MenuC0779j
    /* JADX INFO: renamed from: j */
    public final MenuC0779j mo2004j() {
        return this.f2867v.mo2004j();
    }

    @Override // p055f.MenuC0779j
    /* JADX INFO: renamed from: l */
    public final boolean mo2006l() {
        return this.f2867v.mo2006l();
    }

    @Override // p055f.MenuC0779j
    /* JADX INFO: renamed from: m */
    public final boolean mo2007m() {
        return this.f2867v.mo2007m();
    }

    @Override // p055f.MenuC0779j
    /* JADX INFO: renamed from: n */
    public final boolean mo2008n() {
        return this.f2867v.mo2008n();
    }

    @Override // p055f.MenuC0779j, android.view.Menu
    public final void setGroupDividerEnabled(boolean z2) {
        this.f2867v.setGroupDividerEnabled(z2);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        m2011q(0, null, 0, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        m2011q(0, charSequence, 0, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        m2011q(0, null, 0, view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.f2868w.setIcon(drawable);
        return this;
    }

    @Override // p055f.MenuC0779j, android.view.Menu
    public final void setQwertyMode(boolean z2) {
        this.f2867v.setQwertyMode(z2);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i2) {
        m2011q(0, null, i2, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i2) {
        m2011q(i2, null, 0, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i2) {
        this.f2868w.setIcon(i2);
        return this;
    }
}
