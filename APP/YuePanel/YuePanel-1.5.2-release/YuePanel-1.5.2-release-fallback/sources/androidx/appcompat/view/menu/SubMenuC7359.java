package androidx.appcompat.view.menu;

/* JADX INFO: renamed from: androidx.appcompat.view.menu.ۥ۟۟۟ۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
public class SubMenuC7359 extends androidx.appcompat.view.menu.C7343 implements android.view.SubMenu {
    private androidx.appcompat.view.menu.C7348 mItem;
    private androidx.appcompat.view.menu.C7343 mParentMenu;

    public SubMenuC7359(android.content.Context r1, androidx.appcompat.view.menu.C7343 r2, androidx.appcompat.view.menu.C7348 r3) {
            r0 = this;
            r0.<init>(r1)
            r0.mParentMenu = r2
            r0.mItem = r3
            return
    }

    @Override // androidx.appcompat.view.menu.C7343
    public boolean collapseItemActionView(androidx.appcompat.view.menu.C7348 r2) {
            r1 = this;
            androidx.appcompat.view.menu.ۥ۟۟۟۟ r0 = r1.mParentMenu
            boolean r2 = r0.collapseItemActionView(r2)
            return r2
    }

    @Override // androidx.appcompat.view.menu.C7343
    public boolean dispatchMenuItemSelected(@Yue.InterfaceC4410 androidx.appcompat.view.menu.C7343 r2, @Yue.InterfaceC4410 android.view.MenuItem r3) {
            r1 = this;
            boolean r0 = super.dispatchMenuItemSelected(r2, r3)
            if (r0 != 0) goto L11
            androidx.appcompat.view.menu.ۥ۟۟۟۟ r0 = r1.mParentMenu
            boolean r2 = r0.dispatchMenuItemSelected(r2, r3)
            if (r2 == 0) goto Lf
            goto L11
        Lf:
            r2 = 0
            goto L12
        L11:
            r2 = 1
        L12:
            return r2
    }

    @Override // androidx.appcompat.view.menu.C7343
    public boolean expandItemActionView(androidx.appcompat.view.menu.C7348 r2) {
            r1 = this;
            androidx.appcompat.view.menu.ۥ۟۟۟۟ r0 = r1.mParentMenu
            boolean r2 = r0.expandItemActionView(r2)
            return r2
    }

    @Override // androidx.appcompat.view.menu.C7343
    public java.lang.String getActionViewStatesKey() {
            r3 = this;
            androidx.appcompat.view.menu.ۥ۟۟۟ۢ r0 = r3.mItem
            if (r0 == 0) goto L9
            int r0 = r0.getItemId()
            goto La
        L9:
            r0 = 0
        La:
            if (r0 != 0) goto Le
            r0 = 0
            return r0
        Le:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = super.getActionViewStatesKey()
            r1.append(r2)
            java.lang.String r2 = ":"
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
    }

    @Override // android.view.SubMenu
    public android.view.MenuItem getItem() {
            r1 = this;
            androidx.appcompat.view.menu.ۥ۟۟۟ۢ r0 = r1.mItem
            return r0
    }

    public android.view.Menu getParentMenu() {
            r1 = this;
            androidx.appcompat.view.menu.ۥ۟۟۟۟ r0 = r1.mParentMenu
            return r0
    }

    @Override // androidx.appcompat.view.menu.C7343
    public androidx.appcompat.view.menu.C7343 getRootMenu() {
            r1 = this;
            androidx.appcompat.view.menu.ۥ۟۟۟۟ r0 = r1.mParentMenu
            androidx.appcompat.view.menu.ۥ۟۟۟۟ r0 = r0.getRootMenu()
            return r0
    }

    @Override // androidx.appcompat.view.menu.C7343
    public boolean isGroupDividerEnabled() {
            r1 = this;
            androidx.appcompat.view.menu.ۥ۟۟۟۟ r0 = r1.mParentMenu
            boolean r0 = r0.isGroupDividerEnabled()
            return r0
    }

    @Override // androidx.appcompat.view.menu.C7343
    public boolean isQwertyMode() {
            r1 = this;
            androidx.appcompat.view.menu.ۥ۟۟۟۟ r0 = r1.mParentMenu
            boolean r0 = r0.isQwertyMode()
            return r0
    }

    @Override // androidx.appcompat.view.menu.C7343
    public boolean isShortcutsVisible() {
            r1 = this;
            androidx.appcompat.view.menu.ۥ۟۟۟۟ r0 = r1.mParentMenu
            boolean r0 = r0.isShortcutsVisible()
            return r0
    }

    @Override // androidx.appcompat.view.menu.C7343
    public void setCallback(androidx.appcompat.view.menu.C7343.InterfaceC7344 r2) {
            r1 = this;
            androidx.appcompat.view.menu.ۥ۟۟۟۟ r0 = r1.mParentMenu
            r0.setCallback(r2)
            return
    }

    @Override // androidx.appcompat.view.menu.C7343, Yue.InterfaceMenuC6057, android.view.Menu
    public void setGroupDividerEnabled(boolean r2) {
            r1 = this;
            androidx.appcompat.view.menu.ۥ۟۟۟۟ r0 = r1.mParentMenu
            r0.setGroupDividerEnabled(r2)
            return
    }

    @Override // android.view.SubMenu
    public android.view.SubMenu setHeaderIcon(int r1) {
            r0 = this;
            androidx.appcompat.view.menu.ۥ۟۟۟۟ r1 = super.setHeaderIconInt(r1)
            android.view.SubMenu r1 = (android.view.SubMenu) r1
            return r1
    }

    @Override // android.view.SubMenu
    public android.view.SubMenu setHeaderIcon(android.graphics.drawable.Drawable r1) {
            r0 = this;
            androidx.appcompat.view.menu.ۥ۟۟۟۟ r1 = super.setHeaderIconInt(r1)
            android.view.SubMenu r1 = (android.view.SubMenu) r1
            return r1
    }

    @Override // android.view.SubMenu
    public android.view.SubMenu setHeaderTitle(int r1) {
            r0 = this;
            androidx.appcompat.view.menu.ۥ۟۟۟۟ r1 = super.setHeaderTitleInt(r1)
            android.view.SubMenu r1 = (android.view.SubMenu) r1
            return r1
    }

    @Override // android.view.SubMenu
    public android.view.SubMenu setHeaderTitle(java.lang.CharSequence r1) {
            r0 = this;
            androidx.appcompat.view.menu.ۥ۟۟۟۟ r1 = super.setHeaderTitleInt(r1)
            android.view.SubMenu r1 = (android.view.SubMenu) r1
            return r1
    }

    @Override // android.view.SubMenu
    public android.view.SubMenu setHeaderView(android.view.View r1) {
            r0 = this;
            androidx.appcompat.view.menu.ۥ۟۟۟۟ r1 = super.setHeaderViewInt(r1)
            android.view.SubMenu r1 = (android.view.SubMenu) r1
            return r1
    }

    @Override // android.view.SubMenu
    public android.view.SubMenu setIcon(int r2) {
            r1 = this;
            androidx.appcompat.view.menu.ۥ۟۟۟ۢ r0 = r1.mItem
            r0.setIcon(r2)
            return r1
    }

    @Override // android.view.SubMenu
    public android.view.SubMenu setIcon(android.graphics.drawable.Drawable r2) {
            r1 = this;
            androidx.appcompat.view.menu.ۥ۟۟۟ۢ r0 = r1.mItem
            r0.setIcon(r2)
            return r1
    }

    @Override // androidx.appcompat.view.menu.C7343, android.view.Menu
    public void setQwertyMode(boolean r2) {
            r1 = this;
            androidx.appcompat.view.menu.ۥ۟۟۟۟ r0 = r1.mParentMenu
            r0.setQwertyMode(r2)
            return
    }

    @Override // androidx.appcompat.view.menu.C7343
    public void setShortcutsVisible(boolean r2) {
            r1 = this;
            androidx.appcompat.view.menu.ۥ۟۟۟۟ r0 = r1.mParentMenu
            r0.setShortcutsVisible(r2)
            return
    }
}
