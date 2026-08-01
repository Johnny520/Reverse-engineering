package p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class c50 extends MenuC0424ku implements SubMenu {

    /* JADX INFO: renamed from: A */
    public final C0572ou f889A;

    /* JADX INFO: renamed from: z */
    public final MenuC0424ku f890z;

    public c50(Context context, MenuC0424ku menuC0424ku, C0572ou c0572ou) {
        super(context);
        this.f890z = menuC0424ku;
        this.f889A = c0572ou;
    }

    @Override // p000.MenuC0424ku
    /* JADX INFO: renamed from: d */
    public final boolean mo629d(C0572ou c0572ou) {
        return this.f890z.mo629d(c0572ou);
    }

    @Override // p000.MenuC0424ku
    /* JADX INFO: renamed from: e */
    public final boolean mo630e(MenuC0424ku menuC0424ku, MenuItem menuItem) {
        return super.mo630e(menuC0424ku, menuItem) || this.f890z.mo630e(menuC0424ku, menuItem);
    }

    @Override // p000.MenuC0424ku
    /* JADX INFO: renamed from: f */
    public final boolean mo631f(C0572ou c0572ou) {
        return this.f890z.mo631f(c0572ou);
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.f889A;
    }

    @Override // p000.MenuC0424ku
    /* JADX INFO: renamed from: j */
    public final String mo632j() {
        C0572ou c0572ou = this.f889A;
        int i = c0572ou != null ? c0572ou.f3586a : 0;
        if (i == 0) {
            return null;
        }
        return "android:menu:actionviewstates:" + i;
    }

    @Override // p000.MenuC0424ku
    /* JADX INFO: renamed from: k */
    public final MenuC0424ku mo633k() {
        return this.f890z.mo633k();
    }

    @Override // p000.MenuC0424ku
    /* JADX INFO: renamed from: m */
    public final boolean mo634m() {
        return this.f890z.mo634m();
    }

    @Override // p000.MenuC0424ku
    /* JADX INFO: renamed from: n */
    public final boolean mo635n() {
        return this.f890z.mo635n();
    }

    @Override // p000.MenuC0424ku
    /* JADX INFO: renamed from: o */
    public final boolean mo636o() {
        return this.f890z.mo636o();
    }

    @Override // p000.MenuC0424ku, android.view.Menu
    public final void setGroupDividerEnabled(boolean z) {
        this.f890z.setGroupDividerEnabled(z);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        m1728u(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        m1728u(0, charSequence, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        m1728u(0, null, 0, null, view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.f889A.setIcon(drawable);
        return this;
    }

    @Override // p000.MenuC0424ku, android.view.Menu
    public final void setQwertyMode(boolean z) {
        this.f890z.setQwertyMode(z);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i) {
        m1728u(0, null, i, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i) {
        m1728u(i, null, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i) {
        this.f889A.setIcon(i);
        return this;
    }
}
