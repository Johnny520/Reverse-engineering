package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import p000a.C0944z;

/* JADX INFO: renamed from: androidx.appcompat.view.menu.m */
/* JADX INFO: loaded from: classes.dex */
public final class SubMenuC1005m extends C0998f implements SubMenu {

    /* JADX INFO: renamed from: A */
    public final C1000h f3875A;

    /* JADX INFO: renamed from: z */
    public final C0998f f3876z;

    public SubMenuC1005m(Context context, C0998f c0998f, C1000h c1000h) {
        super(context);
        this.f3876z = c0998f;
        this.f3875A = c1000h;
    }

    @Override // androidx.appcompat.view.menu.C0998f
    /* JADX INFO: renamed from: d */
    public final boolean mo2319d(C1000h c1000h) {
        return this.f3876z.mo2319d(c1000h);
    }

    @Override // androidx.appcompat.view.menu.C0998f
    /* JADX INFO: renamed from: e */
    public final boolean mo2320e(C0998f c0998f, MenuItem menuItem) {
        return super.mo2320e(c0998f, menuItem) || this.f3876z.mo2320e(c0998f, menuItem);
    }

    @Override // androidx.appcompat.view.menu.C0998f
    /* JADX INFO: renamed from: f */
    public final boolean mo2321f(C1000h c1000h) {
        return this.f3876z.mo2321f(c1000h);
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.f3875A;
    }

    @Override // androidx.appcompat.view.menu.C0998f
    /* JADX INFO: renamed from: j */
    public final String mo2325j() {
        C1000h c1000h = this.f3875A;
        int i = c1000h != null ? c1000h.f3814a : 0;
        if (i == 0) {
            return null;
        }
        return C0944z.m2225e("android:menu:actionviewstates:", i);
    }

    @Override // androidx.appcompat.view.menu.C0998f
    /* JADX INFO: renamed from: k */
    public final C0998f mo2326k() {
        return this.f3876z.mo2326k();
    }

    @Override // androidx.appcompat.view.menu.C0998f
    /* JADX INFO: renamed from: m */
    public final boolean mo2328m() {
        return this.f3876z.mo2328m();
    }

    @Override // androidx.appcompat.view.menu.C0998f
    /* JADX INFO: renamed from: n */
    public final boolean mo2329n() {
        return this.f3876z.mo2329n();
    }

    @Override // androidx.appcompat.view.menu.C0998f
    /* JADX INFO: renamed from: o */
    public final boolean mo2330o() {
        return this.f3876z.mo2330o();
    }

    @Override // androidx.appcompat.view.menu.C0998f, android.view.Menu
    public final void setGroupDividerEnabled(boolean z) {
        this.f3876z.setGroupDividerEnabled(z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        m2336u(0, null, 0, drawable, null);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        m2336u(0, charSequence, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        m2336u(0, null, 0, null, view);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.f3875A.setIcon(drawable);
        return this;
    }

    @Override // androidx.appcompat.view.menu.C0998f, android.view.Menu
    public final void setQwertyMode(boolean z) {
        this.f3876z.setQwertyMode(z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i) {
        m2336u(0, null, i, null, null);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i) {
        m2336u(i, null, 0, null, null);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i) {
        this.f3875A.setIcon(i);
        return this;
    }
}
