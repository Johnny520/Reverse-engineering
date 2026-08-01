package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class c50 extends defpackage.ku implements android.view.SubMenu {
    public final defpackage.ou A;
    public final defpackage.ku z;

    public c50(android.content.Context r1, defpackage.ku r2, defpackage.ou r3) {
            r0 = this;
            r0.<init>(r1)
            r0.z = r2
            r0.A = r3
            return
    }

    @Override // defpackage.ku
    public final boolean d(defpackage.ou r2) {
            r1 = this;
            ku r0 = r1.z
            boolean r2 = r0.d(r2)
            return r2
    }

    @Override // defpackage.ku
    public final boolean e(defpackage.ku r2, android.view.MenuItem r3) {
            r1 = this;
            boolean r0 = super.e(r2, r3)
            if (r0 != 0) goto L11
            ku r0 = r1.z
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

    @Override // defpackage.ku
    public final boolean f(defpackage.ou r2) {
            r1 = this;
            ku r0 = r1.z
            boolean r2 = r0.f(r2)
            return r2
    }

    @Override // android.view.SubMenu
    public final android.view.MenuItem getItem() {
            r1 = this;
            ou r0 = r1.A
            return r0
    }

    @Override // defpackage.ku
    public final java.lang.String j() {
            r3 = this;
            ou r0 = r3.A
            if (r0 == 0) goto L7
            int r0 = r0.a
            goto L8
        L7:
            r0 = 0
        L8:
            if (r0 != 0) goto Lc
            r0 = 0
            return r0
        Lc:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "android:menu:actionviewstates:"
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
    }

    @Override // defpackage.ku
    public final defpackage.ku k() {
            r1 = this;
            ku r0 = r1.z
            ku r0 = r0.k()
            return r0
    }

    @Override // defpackage.ku
    public final boolean m() {
            r1 = this;
            ku r0 = r1.z
            boolean r0 = r0.m()
            return r0
    }

    @Override // defpackage.ku
    public final boolean n() {
            r1 = this;
            ku r0 = r1.z
            boolean r0 = r0.n()
            return r0
    }

    @Override // defpackage.ku
    public final boolean o() {
            r1 = this;
            ku r0 = r1.z
            boolean r0 = r0.o()
            return r0
    }

    @Override // defpackage.ku, android.view.Menu
    public final void setGroupDividerEnabled(boolean r2) {
            r1 = this;
            ku r0 = r1.z
            r0.setGroupDividerEnabled(r2)
            return
    }

    @Override // android.view.SubMenu
    public final android.view.SubMenu setHeaderIcon(int r7) {
            r6 = this;
            r4 = 0
            r5 = 0
            r1 = 0
            r2 = 0
            r0 = r6
            r3 = r7
            r0.u(r1, r2, r3, r4, r5)
            return r0
    }

    @Override // android.view.SubMenu
    public final android.view.SubMenu setHeaderIcon(android.graphics.drawable.Drawable r7) {
            r6 = this;
            r3 = 0
            r5 = 0
            r1 = 0
            r2 = 0
            r0 = r6
            r4 = r7
            r0.u(r1, r2, r3, r4, r5)
            return r0
    }

    @Override // android.view.SubMenu
    public final android.view.SubMenu setHeaderTitle(int r7) {
            r6 = this;
            r4 = 0
            r5 = 0
            r2 = 0
            r3 = 0
            r0 = r6
            r1 = r7
            r0.u(r1, r2, r3, r4, r5)
            return r0
    }

    @Override // android.view.SubMenu
    public final android.view.SubMenu setHeaderTitle(java.lang.CharSequence r7) {
            r6 = this;
            r4 = 0
            r5 = 0
            r1 = 0
            r3 = 0
            r0 = r6
            r2 = r7
            r0.u(r1, r2, r3, r4, r5)
            return r0
    }

    @Override // android.view.SubMenu
    public final android.view.SubMenu setHeaderView(android.view.View r7) {
            r6 = this;
            r3 = 0
            r4 = 0
            r1 = 0
            r2 = 0
            r0 = r6
            r5 = r7
            r0.u(r1, r2, r3, r4, r5)
            return r0
    }

    @Override // android.view.SubMenu
    public final android.view.SubMenu setIcon(int r2) {
            r1 = this;
            ou r0 = r1.A
            r0.setIcon(r2)
            return r1
    }

    @Override // android.view.SubMenu
    public final android.view.SubMenu setIcon(android.graphics.drawable.Drawable r2) {
            r1 = this;
            ou r0 = r1.A
            r0.setIcon(r2)
            return r1
    }

    @Override // defpackage.ku, android.view.Menu
    public final void setQwertyMode(boolean r2) {
            r1 = this;
            ku r0 = r1.z
            r0.setQwertyMode(r2)
            return
    }
}
