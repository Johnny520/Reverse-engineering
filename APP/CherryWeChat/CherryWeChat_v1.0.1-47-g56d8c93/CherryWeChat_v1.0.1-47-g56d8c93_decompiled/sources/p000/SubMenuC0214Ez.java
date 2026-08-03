package p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* JADX INFO: renamed from: Ez */
/* JADX INFO: loaded from: classes.dex */
public final class SubMenuC0214Ez extends MenuC2204lr implements SubMenu {

    /* JADX INFO: renamed from: A */
    public final C2427qr f630A;

    /* JADX INFO: renamed from: z */
    public final MenuC2204lr f631z;

    public SubMenuC0214Ez(Context context, MenuC2204lr menuC2204lr, C2427qr c2427qr) {
        super(context);
        this.f631z = menuC2204lr;
        this.f630A = c2427qr;
    }

    @Override // p000.MenuC2204lr
    /* JADX INFO: renamed from: d */
    public final boolean mo426d(C2427qr c2427qr) {
        return this.f631z.mo426d(c2427qr);
    }

    @Override // p000.MenuC2204lr
    /* JADX INFO: renamed from: e */
    public final boolean mo427e(MenuC2204lr menuC2204lr, MenuItem menuItem) {
        return super.mo427e(menuC2204lr, menuItem) || this.f631z.mo427e(menuC2204lr, menuItem);
    }

    @Override // p000.MenuC2204lr
    /* JADX INFO: renamed from: f */
    public final boolean mo428f(C2427qr c2427qr) {
        return this.f631z.mo428f(c2427qr);
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.f630A;
    }

    @Override // p000.MenuC2204lr
    /* JADX INFO: renamed from: j */
    public final String mo429j() {
        C2427qr c2427qr = this.f630A;
        int i = c2427qr != null ? c2427qr.f8492a : 0;
        if (i == 0) {
            return null;
        }
        return AbstractC2374ph.m4812i(i, "android:menu:actionviewstates:");
    }

    @Override // p000.MenuC2204lr
    /* JADX INFO: renamed from: k */
    public final MenuC2204lr mo430k() {
        return this.f631z.mo430k();
    }

    @Override // p000.MenuC2204lr
    /* JADX INFO: renamed from: m */
    public final boolean mo431m() {
        return this.f631z.mo431m();
    }

    @Override // p000.MenuC2204lr
    /* JADX INFO: renamed from: n */
    public final boolean mo432n() {
        return this.f631z.mo432n();
    }

    @Override // p000.MenuC2204lr
    /* JADX INFO: renamed from: o */
    public final boolean mo433o() {
        return this.f631z.mo433o();
    }

    @Override // p000.MenuC2204lr, android.view.Menu
    public final void setGroupDividerEnabled(boolean z) {
        this.f631z.setGroupDividerEnabled(z);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        m4440u(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        m4440u(0, charSequence, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        m4440u(0, null, 0, null, view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.f630A.setIcon(drawable);
        return this;
    }

    @Override // p000.MenuC2204lr, android.view.Menu
    public final void setQwertyMode(boolean z) {
        this.f631z.setQwertyMode(z);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i) {
        m4440u(0, null, i, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i) {
        m4440u(i, null, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i) {
        this.f630A.setIcon(i);
        return this;
    }
}
