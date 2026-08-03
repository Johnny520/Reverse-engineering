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

    public SubMenuC0789t(Context r1, MenuC0779j r2, MenuItemC0780k r3) {
        super(r1);
        this.f2867v = r2;
        this.f2868w = r3;
    }

    @Override // p055f.MenuC0779j
    /* JADX INFO: renamed from: d */
    public final boolean mo1998d(MenuItemC0780k r2) {
        return this.f2867v.mo1998d(r2);
    }

    @Override // p055f.MenuC0779j
    /* JADX INFO: renamed from: e */
    public final boolean mo1999e(MenuC0779j r2, MenuItem r3) {
        if (super.mo1999e(r2, r3) == false) goto L5;
    L8:
        return true;
    L5:
        if (this.f2867v.mo1999e(r2, r3) == true) goto L8;
        return false;
    }

    @Override // p055f.MenuC0779j
    /* JADX INFO: renamed from: f */
    public final boolean mo2000f(MenuItemC0780k r2) {
        return this.f2867v.mo2000f(r2);
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
    public final void setGroupDividerEnabled(boolean r2) {
        this.f2867v.setGroupDividerEnabled(r2);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable r2) {
        m2011q(0, null, 0, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence r3) {
        m2011q(0, r3, 0, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View r3) {
        m2011q(0, null, 0, r3);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable r2) {
        this.f2868w.setIcon(r2);
        return this;
    }

    @Override // p055f.MenuC0779j, android.view.Menu
    public final void setQwertyMode(boolean r2) {
        this.f2867v.setQwertyMode(r2);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int r3) {
        m2011q(0, null, r3, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int r3) {
        m2011q(r3, null, 0, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int r2) {
        this.f2868w.setIcon(r2);
        return this;
    }
}
