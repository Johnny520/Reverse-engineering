package yyds;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* JADX INFO: renamed from: yyds.ᛵᛱᛴᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class SubMenuC1011 extends MenuC0836 implements SubMenu {

    /* JADX INFO: renamed from: ᛱᛳᛶᛳ, reason: contains not printable characters */
    public final C1148 f4600;

    /* JADX INFO: renamed from: ᛷᛸᲇᛶ, reason: contains not printable characters */
    public final MenuC0836 f4601;

    public SubMenuC1011(Context context, MenuC0836 menuC0836, C1148 c1148) {
        super(context);
        this.f4601 = menuC0836;
        this.f4600 = c1148;
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.f4600;
    }

    @Override // yyds.MenuC0836, android.view.Menu
    public final void setGroupDividerEnabled(boolean z) {
        this.f4601.setGroupDividerEnabled(z);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        m1909(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        m1909(0, charSequence, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        m1909(0, null, 0, null, view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.f4600.setIcon(drawable);
        return this;
    }

    @Override // yyds.MenuC0836, android.view.Menu
    public final void setQwertyMode(boolean z) {
        this.f4601.setQwertyMode(z);
    }

    @Override // yyds.MenuC0836
    /* JADX INFO: renamed from: ᛱᛳᲇ */
    public final boolean mo1895() {
        return this.f4601.mo1895();
    }

    @Override // yyds.MenuC0836
    /* JADX INFO: renamed from: ᛲᛲᲈᲈ */
    public final boolean mo1897() {
        return this.f4601.mo1897();
    }

    @Override // yyds.MenuC0836
    /* JADX INFO: renamed from: ᛲᛴᛳᛲ */
    public final boolean mo1899(MenuC0836 menuC0836, MenuItem menuItem) {
        return super.mo1899(menuC0836, menuItem) || this.f4601.mo1899(menuC0836, menuItem);
    }

    @Override // yyds.MenuC0836
    /* JADX INFO: renamed from: ᛳᲁᲁᲇ */
    public final boolean mo1902() {
        return this.f4601.mo1902();
    }

    @Override // yyds.MenuC0836
    /* JADX INFO: renamed from: ᛷᛲᲈᛱ */
    public final MenuC0836 mo1910() {
        return this.f4601.mo1910();
    }

    @Override // yyds.MenuC0836
    /* JADX INFO: renamed from: ᛷᲈᲈᲁ */
    public final String mo1912() {
        int i = this.f4600.f5275;
        if (i == 0) {
            return null;
        }
        return AbstractC0897.m1989(i, "android:menu:actionviewstates:");
    }

    @Override // yyds.MenuC0836
    /* JADX INFO: renamed from: ᲇᲇᲇᛱ */
    public final boolean mo1916(C1148 c1148) {
        return this.f4601.mo1916(c1148);
    }

    @Override // yyds.MenuC0836
    /* JADX INFO: renamed from: ᲇᲈᛵᛷ */
    public final boolean mo1917(C1148 c1148) {
        return this.f4601.mo1917(c1148);
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i) {
        this.f4600.setIcon(i);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i) {
        m1909(0, null, i, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i) {
        m1909(i, null, 0, null, null);
        return this;
    }
}
