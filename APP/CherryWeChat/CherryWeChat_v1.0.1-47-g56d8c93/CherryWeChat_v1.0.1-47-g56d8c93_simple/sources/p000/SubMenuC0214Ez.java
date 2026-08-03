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

    public SubMenuC0214Ez(Context r1, MenuC2204lr r2, C2427qr r3) {
        super(r1);
        this.f631z = r2;
        this.f630A = r3;
    }

    @Override // p000.MenuC2204lr
    /* JADX INFO: renamed from: d */
    public final boolean mo426d(C2427qr r2) {
        return this.f631z.mo426d(r2);
    }

    @Override // p000.MenuC2204lr
    /* JADX INFO: renamed from: e */
    public final boolean mo427e(MenuC2204lr r2, MenuItem r3) {
        if (super.mo427e(r2, r3) == false) goto L5;
        return true;
    L5:
        if (this.f631z.mo427e(r2, r3) == true) goto L11;
        return false;
    L11:
        return true;
    }

    @Override // p000.MenuC2204lr
    /* JADX INFO: renamed from: f */
    public final boolean mo428f(C2427qr r2) {
        return this.f631z.mo428f(r2);
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.f630A;
    }

    @Override // p000.MenuC2204lr
    /* JADX INFO: renamed from: j */
    public final String mo429j() {
        C2427qr r0 = this.f630A;
        if (r0 == null) goto L5;
        int r02 = r0.f8492a;
    L6:
        if (r02 != 0) goto L10;
        return null;
    L10:
        return AbstractC2374ph.m4812i(r02, "android:menu:actionviewstates:");
    L5:
        r02 = 0;
        goto L6
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
    public final void setGroupDividerEnabled(boolean r2) {
        this.f631z.setGroupDividerEnabled(r2);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable r7) {
        m4440u(0, null, 0, r7, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence r7) {
        m4440u(0, r7, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View r7) {
        m4440u(0, null, 0, null, r7);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable r2) {
        this.f630A.setIcon(r2);
        return this;
    }

    @Override // p000.MenuC2204lr, android.view.Menu
    public final void setQwertyMode(boolean r2) {
        this.f631z.setQwertyMode(r2);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int r7) {
        m4440u(0, null, r7, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int r7) {
        m4440u(r7, null, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int r2) {
        this.f630A.setIcon(r2);
        return this;
    }
}
