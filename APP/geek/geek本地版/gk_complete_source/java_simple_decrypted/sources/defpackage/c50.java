package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class c50 extends ku implements SubMenu {
    public final ou A;
    public final ku z;

    public c50(Context r1, ku r2, ou r3) {
        super(r1);
        this.z = r2;
        this.A = r3;
    }

    @Override // defpackage.ku
    public final boolean d(ou r2) {
        return this.z.d(r2);
    }

    @Override // defpackage.ku
    public final boolean e(ku r2, MenuItem r3) {
        if (super.e(r2, r3) == false) goto L5;
        return true;
    L5:
        if (this.z.e(r2, r3) == true) goto L11;
        return false;
    L11:
        return true;
    }

    @Override // defpackage.ku
    public final boolean f(ou r2) {
        return this.z.f(r2);
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.A;
    }

    @Override // defpackage.ku
    public final String j() {
        ou r0 = this.A;
        if (r0 == null) goto L5;
        int r02 = r0.a;
    L6:
        if (r02 != 0) goto L10;
        return null;
    L10:
        return "android:menu:actionviewstates:" + r02;
    L5:
        r02 = 0;
        goto L6
    }

    @Override // defpackage.ku
    public final ku k() {
        return this.z.k();
    }

    @Override // defpackage.ku
    public final boolean m() {
        return this.z.m();
    }

    @Override // defpackage.ku
    public final boolean n() {
        return this.z.n();
    }

    @Override // defpackage.ku
    public final boolean o() {
        return this.z.o();
    }

    @Override // defpackage.ku, android.view.Menu
    public final void setGroupDividerEnabled(boolean r2) {
        this.z.setGroupDividerEnabled(r2);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable r7) {
        u(0, null, 0, r7, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence r7) {
        u(0, r7, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View r7) {
        u(0, null, 0, null, r7);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable r2) {
        this.A.setIcon(r2);
        return this;
    }

    @Override // defpackage.ku, android.view.Menu
    public final void setQwertyMode(boolean r2) {
        this.z.setQwertyMode(r2);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int r7) {
        u(0, null, r7, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int r7) {
        u(r7, null, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int r2) {
        this.A.setIcon(r2);
        return this;
    }
}
