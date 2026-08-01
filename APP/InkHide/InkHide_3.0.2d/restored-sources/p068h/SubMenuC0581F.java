package p068h;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import p022L.AbstractC0174d;

/* JADX INFO: renamed from: h.F */
/* JADX INFO: loaded from: classes.dex */
public final class SubMenuC0581F extends MenuC0594m implements SubMenu {

    /* JADX INFO: renamed from: A */
    public final C0596o f1961A;

    /* JADX INFO: renamed from: z */
    public final MenuC0594m f1962z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public SubMenuC0581F(Context context, MenuC0594m menuC0594m, C0596o c0596o) {
        super(context);
        this.f1962z = menuC0594m;
        this.f1961A = c0596o;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p068h.MenuC0594m
    /* JADX INFO: renamed from: d */
    public final boolean mo1160d(C0596o c0596o) {
        return this.f1962z.mo1160d(c0596o);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p068h.MenuC0594m
    /* JADX INFO: renamed from: e */
    public final boolean mo1161e(MenuC0594m menuC0594m, MenuItem menuItem) {
        return super.mo1161e(menuC0594m, menuItem) || this.f1962z.mo1161e(menuC0594m, menuItem);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p068h.MenuC0594m
    /* JADX INFO: renamed from: f */
    public final boolean mo1162f(C0596o c0596o) {
        return this.f1962z.mo1162f(c0596o);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.f1961A;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p068h.MenuC0594m
    /* JADX INFO: renamed from: j */
    public final String mo1163j() {
        C0596o c0596o = this.f1961A;
        int i2 = c0596o != null ? c0596o.f2060a : 0;
        if (i2 == 0) {
            return null;
        }
        return AbstractC0174d.m351g(i2, "android:menu:actionviewstates:");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p068h.MenuC0594m
    /* JADX INFO: renamed from: k */
    public final MenuC0594m mo1164k() {
        return this.f1962z.mo1164k();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p068h.MenuC0594m
    /* JADX INFO: renamed from: m */
    public final boolean mo1165m() {
        return this.f1962z.mo1165m();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p068h.MenuC0594m
    /* JADX INFO: renamed from: n */
    public final boolean mo1166n() {
        return this.f1962z.mo1166n();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p068h.MenuC0594m
    /* JADX INFO: renamed from: o */
    public final boolean mo1167o() {
        return this.f1962z.mo1167o();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p068h.MenuC0594m, android.view.Menu
    public final void setGroupDividerEnabled(boolean z2) {
        this.f1962z.setGroupDividerEnabled(z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        m1194u(0, null, 0, drawable, null);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        m1194u(0, charSequence, 0, null, null);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        m1194u(0, null, 0, null, view);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.f1961A.setIcon(drawable);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p068h.MenuC0594m, android.view.Menu
    public final void setQwertyMode(boolean z2) {
        this.f1962z.setQwertyMode(z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i2) {
        m1194u(0, null, i2, null, null);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i2) {
        m1194u(i2, null, 0, null, null);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i2) {
        this.f1961A.setIcon(i2);
        return this;
    }
}
