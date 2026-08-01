package p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class j50 extends MenuC0646qu implements SubMenu {

    /* JADX INFO: renamed from: A */
    public final C0869wu f2660A;

    /* JADX INFO: renamed from: z */
    public final MenuC0646qu f2661z;

    public j50(Context context, MenuC0646qu menuC0646qu, C0869wu c0869wu) {
        super(context);
        this.f2661z = menuC0646qu;
        this.f2660A = c0869wu;
    }

    @Override // p000.MenuC0646qu
    /* JADX INFO: renamed from: d */
    public final boolean mo1566d(C0869wu c0869wu) {
        return this.f2661z.mo1566d(c0869wu);
    }

    @Override // p000.MenuC0646qu
    /* JADX INFO: renamed from: e */
    public final boolean mo1567e(MenuC0646qu menuC0646qu, MenuItem menuItem) {
        return super.mo1567e(menuC0646qu, menuItem) || this.f2661z.mo1567e(menuC0646qu, menuItem);
    }

    @Override // p000.MenuC0646qu
    /* JADX INFO: renamed from: f */
    public final boolean mo1568f(C0869wu c0869wu) {
        return this.f2661z.mo1568f(c0869wu);
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.f2660A;
    }

    @Override // p000.MenuC0646qu
    /* JADX INFO: renamed from: j */
    public final String mo1569j() {
        C0869wu c0869wu = this.f2660A;
        int i = c0869wu != null ? c0869wu.f5112a : 0;
        if (i == 0) {
            return null;
        }
        return "android:menu:actionviewstates:" + i;
    }

    @Override // p000.MenuC0646qu
    /* JADX INFO: renamed from: k */
    public final MenuC0646qu mo1570k() {
        return this.f2661z.mo1570k();
    }

    @Override // p000.MenuC0646qu
    /* JADX INFO: renamed from: m */
    public final boolean mo1571m() {
        return this.f2661z.mo1571m();
    }

    @Override // p000.MenuC0646qu
    /* JADX INFO: renamed from: n */
    public final boolean mo1572n() {
        return this.f2661z.mo1572n();
    }

    @Override // p000.MenuC0646qu
    /* JADX INFO: renamed from: o */
    public final boolean mo1573o() {
        return this.f2661z.mo1573o();
    }

    @Override // p000.MenuC0646qu, android.view.Menu
    public final void setGroupDividerEnabled(boolean z) {
        this.f2661z.setGroupDividerEnabled(z);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        m2177u(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        m2177u(0, charSequence, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        m2177u(0, null, 0, null, view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.f2660A.setIcon(drawable);
        return this;
    }

    @Override // p000.MenuC0646qu, android.view.Menu
    public final void setQwertyMode(boolean z) {
        this.f2661z.setQwertyMode(z);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i) {
        m2177u(0, null, i, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i) {
        m2177u(i, null, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i) {
        this.f2660A.setIcon(i);
        return this;
    }
}
