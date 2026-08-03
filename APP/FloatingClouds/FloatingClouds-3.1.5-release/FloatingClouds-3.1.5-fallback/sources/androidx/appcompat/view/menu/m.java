package androidx.appcompat.view.menu;

/* JADX INFO: loaded from: classes.dex */
public final class m extends androidx.appcompat.view.menu.f implements android.view.SubMenu {
    public final androidx.appcompat.view.menu.h A;
    public final androidx.appcompat.view.menu.f z;

    public m(android.content.Context r1, androidx.appcompat.view.menu.f r2, androidx.appcompat.view.menu.h r3) {
            r0 = this;
            r0.<init>(r1)
            r0.z = r2
            r0.A = r3
            return
    }

    @Override // androidx.appcompat.view.menu.f
    public final boolean d(androidx.appcompat.view.menu.h r2) {
            r1 = this;
            androidx.appcompat.view.menu.f r0 = r1.z
            boolean r2 = r0.d(r2)
            return r2
    }

    @Override // androidx.appcompat.view.menu.f
    public final boolean e(androidx.appcompat.view.menu.f r2, android.view.MenuItem r3) {
            r1 = this;
            boolean r0 = super.e(r2, r3)
            if (r0 != 0) goto L11
            androidx.appcompat.view.menu.f r0 = r1.z
            boolean r2 = r0.e(r2, r3)
            if (r2 == 0) goto Lf
            goto L11
        Lf:
            r2 = 0
            return r2
        L11:
            r2 = 1
            return r2
    }

    @Override // androidx.appcompat.view.menu.f
    public final boolean f(androidx.appcompat.view.menu.h r2) {
            r1 = this;
            androidx.appcompat.view.menu.f r0 = r1.z
            boolean r2 = r0.f(r2)
            return r2
    }

    @Override // android.view.SubMenu
    public final android.view.MenuItem getItem() {
            r1 = this;
            androidx.appcompat.view.menu.h r0 = r1.A
            return r0
    }

    @Override // androidx.appcompat.view.menu.f
    public final java.lang.String j() {
            r2 = this;
            androidx.appcompat.view.menu.h r0 = r2.A
            if (r0 == 0) goto L7
            int r0 = r0.f824a
            goto L8
        L7:
            r0 = 0
        L8:
            if (r0 != 0) goto Lc
            r0 = 0
            return r0
        Lc:
            java.lang.String r1 = "android:menu:actionviewstates:"
            java.lang.String r0 = a.C0487z.e(r1, r0)
            return r0
    }

    @Override // androidx.appcompat.view.menu.f
    public final androidx.appcompat.view.menu.f k() {
            r1 = this;
            androidx.appcompat.view.menu.f r0 = r1.z
            androidx.appcompat.view.menu.f r0 = r0.k()
            return r0
    }

    @Override // androidx.appcompat.view.menu.f
    public final boolean m() {
            r1 = this;
            androidx.appcompat.view.menu.f r0 = r1.z
            boolean r0 = r0.m()
            return r0
    }

    @Override // androidx.appcompat.view.menu.f
    public final boolean n() {
            r1 = this;
            androidx.appcompat.view.menu.f r0 = r1.z
            boolean r0 = r0.n()
            return r0
    }

    @Override // androidx.appcompat.view.menu.f
    public final boolean o() {
            r1 = this;
            androidx.appcompat.view.menu.f r0 = r1.z
            boolean r0 = r0.o()
            return r0
    }

    @Override // androidx.appcompat.view.menu.f, android.view.Menu
    public final void setGroupDividerEnabled(boolean r2) {
            r1 = this;
            androidx.appcompat.view.menu.f r0 = r1.z
            r0.setGroupDividerEnabled(r2)
            return
    }

    @Override // android.view.SubMenu
    public final android.view.SubMenu setHeaderIcon(int r7) {
            r6 = this;
            r1 = 0
            r2 = 0
            r4 = 0
            r5 = 0
            r0 = r6
            r3 = r7
            r0.u(r1, r2, r3, r4, r5)
            return r0
    }

    @Override // android.view.SubMenu
    public final android.view.SubMenu setHeaderIcon(android.graphics.drawable.Drawable r7) {
            r6 = this;
            r1 = 0
            r2 = 0
            r3 = 0
            r5 = 0
            r0 = r6
            r4 = r7
            r0.u(r1, r2, r3, r4, r5)
            return r0
    }

    @Override // android.view.SubMenu
    public final android.view.SubMenu setHeaderTitle(int r7) {
            r6 = this;
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r0 = r6
            r1 = r7
            r0.u(r1, r2, r3, r4, r5)
            return r0
    }

    @Override // android.view.SubMenu
    public final android.view.SubMenu setHeaderTitle(java.lang.CharSequence r7) {
            r6 = this;
            r1 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r0 = r6
            r2 = r7
            r0.u(r1, r2, r3, r4, r5)
            return r0
    }

    @Override // android.view.SubMenu
    public final android.view.SubMenu setHeaderView(android.view.View r7) {
            r6 = this;
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r0 = r6
            r5 = r7
            r0.u(r1, r2, r3, r4, r5)
            return r0
    }

    @Override // android.view.SubMenu
    public final android.view.SubMenu setIcon(int r2) {
            r1 = this;
            androidx.appcompat.view.menu.h r0 = r1.A
            r0.setIcon(r2)
            return r1
    }

    @Override // android.view.SubMenu
    public final android.view.SubMenu setIcon(android.graphics.drawable.Drawable r2) {
            r1 = this;
            androidx.appcompat.view.menu.h r0 = r1.A
            r0.setIcon(r2)
            return r1
    }

    @Override // androidx.appcompat.view.menu.f, android.view.Menu
    public final void setQwertyMode(boolean r2) {
            r1 = this;
            androidx.appcompat.view.menu.f r0 = r1.z
            r0.setQwertyMode(r2)
            return
    }
}
