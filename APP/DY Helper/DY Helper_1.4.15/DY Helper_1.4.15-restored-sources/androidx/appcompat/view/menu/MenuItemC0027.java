package androidx.appcompat.view.menu;

/* JADX INFO: renamed from: androidx.appcompat.view.menu.α */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class MenuItemC0027 extends p000.AbstractC1118 implements android.view.MenuItem {

    /* JADX INFO: renamed from: γ */
    public final p000.t12 f454;

    /* JADX INFO: renamed from: δ */
    public java.lang.reflect.Method f455;

    public MenuItemC0027(android.content.Context r1, p000.t12 r2) {
            r0 = this;
            r0.<init>(r1)
            if (r2 == 0) goto L8
            r0.f454 = r2
            return
        L8:
            java.lang.String r0 = "Wrapped Object can not be null."
            p000.C1080.m7275(r0)
            r0 = 0
            throw r0
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
            r0 = this;
            t12 r0 = r0.f454
            boolean r0 = r0.collapseActionView()
            return r0
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
            r0 = this;
            t12 r0 = r0.f454
            boolean r0 = r0.expandActionView()
            return r0
    }

    @Override // android.view.MenuItem
    public final android.view.ActionProvider getActionProvider() {
            r1 = this;
            t12 r1 = r1.f454
            ｘ r1 = r1.mo3666()
            boolean r0 = r1 instanceof p000.mz0
            if (r0 == 0) goto Lf
            mz0 r1 = (p000.mz0) r1
            android.view.ActionProvider r1 = r1.f7333
            return r1
        Lf:
            r1 = 0
            return r1
    }

    @Override // android.view.MenuItem
    public final android.view.View getActionView() {
            r1 = this;
            t12 r1 = r1.f454
            android.view.View r1 = r1.getActionView()
            boolean r0 = r1 instanceof androidx.appcompat.view.menu.MenuItemWrapperICS$CollapsibleActionViewWrapper
            if (r0 == 0) goto L10
            androidx.appcompat.view.menu.MenuItemWrapperICS$CollapsibleActionViewWrapper r1 = (androidx.appcompat.view.menu.MenuItemWrapperICS$CollapsibleActionViewWrapper) r1
            android.view.CollapsibleActionView r1 = r1.f453
            android.view.View r1 = (android.view.View) r1
        L10:
            return r1
    }

    @Override // android.view.MenuItem
    public final int getAlphabeticModifiers() {
            r0 = this;
            t12 r0 = r0.f454
            int r0 = r0.getAlphabeticModifiers()
            return r0
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
            r0 = this;
            t12 r0 = r0.f454
            char r0 = r0.getAlphabeticShortcut()
            return r0
    }

    @Override // android.view.MenuItem
    public final java.lang.CharSequence getContentDescription() {
            r0 = this;
            t12 r0 = r0.f454
            java.lang.CharSequence r0 = r0.getContentDescription()
            return r0
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
            r0 = this;
            t12 r0 = r0.f454
            int r0 = r0.getGroupId()
            return r0
    }

    @Override // android.view.MenuItem
    public final android.graphics.drawable.Drawable getIcon() {
            r0 = this;
            t12 r0 = r0.f454
            android.graphics.drawable.Drawable r0 = r0.getIcon()
            return r0
    }

    @Override // android.view.MenuItem
    public final android.content.res.ColorStateList getIconTintList() {
            r0 = this;
            t12 r0 = r0.f454
            android.content.res.ColorStateList r0 = r0.getIconTintList()
            return r0
    }

    @Override // android.view.MenuItem
    public final android.graphics.PorterDuff.Mode getIconTintMode() {
            r0 = this;
            t12 r0 = r0.f454
            android.graphics.PorterDuff$Mode r0 = r0.getIconTintMode()
            return r0
    }

    @Override // android.view.MenuItem
    public final android.content.Intent getIntent() {
            r0 = this;
            t12 r0 = r0.f454
            android.content.Intent r0 = r0.getIntent()
            return r0
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
            r0 = this;
            t12 r0 = r0.f454
            int r0 = r0.getItemId()
            return r0
    }

    @Override // android.view.MenuItem
    public final android.view.ContextMenu.ContextMenuInfo getMenuInfo() {
            r0 = this;
            t12 r0 = r0.f454
            android.view.ContextMenu$ContextMenuInfo r0 = r0.getMenuInfo()
            return r0
    }

    @Override // android.view.MenuItem
    public final int getNumericModifiers() {
            r0 = this;
            t12 r0 = r0.f454
            int r0 = r0.getNumericModifiers()
            return r0
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
            r0 = this;
            t12 r0 = r0.f454
            char r0 = r0.getNumericShortcut()
            return r0
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
            r0 = this;
            t12 r0 = r0.f454
            int r0 = r0.getOrder()
            return r0
    }

    @Override // android.view.MenuItem
    public final android.view.SubMenu getSubMenu() {
            r0 = this;
            t12 r0 = r0.f454
            android.view.SubMenu r0 = r0.getSubMenu()
            return r0
    }

    @Override // android.view.MenuItem
    public final java.lang.CharSequence getTitle() {
            r0 = this;
            t12 r0 = r0.f454
            java.lang.CharSequence r0 = r0.getTitle()
            return r0
    }

    @Override // android.view.MenuItem
    public final java.lang.CharSequence getTitleCondensed() {
            r0 = this;
            t12 r0 = r0.f454
            java.lang.CharSequence r0 = r0.getTitleCondensed()
            return r0
    }

    @Override // android.view.MenuItem
    public final java.lang.CharSequence getTooltipText() {
            r0 = this;
            t12 r0 = r0.f454
            java.lang.CharSequence r0 = r0.getTooltipText()
            return r0
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
            r0 = this;
            t12 r0 = r0.f454
            boolean r0 = r0.hasSubMenu()
            return r0
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
            r0 = this;
            t12 r0 = r0.f454
            boolean r0 = r0.isActionViewExpanded()
            return r0
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
            r0 = this;
            t12 r0 = r0.f454
            boolean r0 = r0.isCheckable()
            return r0
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
            r0 = this;
            t12 r0 = r0.f454
            boolean r0 = r0.isChecked()
            return r0
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
            r0 = this;
            t12 r0 = r0.f454
            boolean r0 = r0.isEnabled()
            return r0
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
            r0 = this;
            t12 r0 = r0.f454
            boolean r0 = r0.isVisible()
            return r0
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setActionProvider(android.view.ActionProvider r2) {
            r1 = this;
            mz0 r0 = new mz0
            r0.<init>(r1, r2)
            if (r2 == 0) goto L8
            goto L9
        L8:
            r0 = 0
        L9:
            t12 r2 = r1.f454
            r2.mo3667(r0)
            return r1
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setActionView(int r3) {
            r2 = this;
            t12 r0 = r2.f454
            r0.setActionView(r3)
            android.view.View r3 = r0.getActionView()
            boolean r1 = r3 instanceof android.view.CollapsibleActionView
            if (r1 == 0) goto L15
            androidx.appcompat.view.menu.MenuItemWrapperICS$CollapsibleActionViewWrapper r1 = new androidx.appcompat.view.menu.MenuItemWrapperICS$CollapsibleActionViewWrapper
            r1.<init>(r3)
            r0.setActionView(r1)
        L15:
            return r2
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setActionView(android.view.View r2) {
            r1 = this;
            boolean r0 = r2 instanceof android.view.CollapsibleActionView
            if (r0 == 0) goto La
            androidx.appcompat.view.menu.MenuItemWrapperICS$CollapsibleActionViewWrapper r0 = new androidx.appcompat.view.menu.MenuItemWrapperICS$CollapsibleActionViewWrapper
            r0.<init>(r2)
            r2 = r0
        La:
            t12 r0 = r1.f454
            r0.setActionView(r2)
            return r1
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setAlphabeticShortcut(char r2) {
            r1 = this;
            t12 r0 = r1.f454
            r0.setAlphabeticShortcut(r2)
            return r1
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setAlphabeticShortcut(char r2, int r3) {
            r1 = this;
            t12 r0 = r1.f454
            r0.setAlphabeticShortcut(r2, r3)
            return r1
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setCheckable(boolean r2) {
            r1 = this;
            t12 r0 = r1.f454
            r0.setCheckable(r2)
            return r1
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setChecked(boolean r2) {
            r1 = this;
            t12 r0 = r1.f454
            r0.setChecked(r2)
            return r1
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setContentDescription(java.lang.CharSequence r2) {
            r1 = this;
            t12 r0 = r1.f454
            r0.setContentDescription(r2)
            return r1
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setEnabled(boolean r2) {
            r1 = this;
            t12 r0 = r1.f454
            r0.setEnabled(r2)
            return r1
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setIcon(int r2) {
            r1 = this;
            t12 r0 = r1.f454
            r0.setIcon(r2)
            return r1
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setIcon(android.graphics.drawable.Drawable r2) {
            r1 = this;
            t12 r0 = r1.f454
            r0.setIcon(r2)
            return r1
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setIconTintList(android.content.res.ColorStateList r2) {
            r1 = this;
            t12 r0 = r1.f454
            r0.setIconTintList(r2)
            return r1
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setIconTintMode(android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            t12 r0 = r1.f454
            r0.setIconTintMode(r2)
            return r1
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setIntent(android.content.Intent r2) {
            r1 = this;
            t12 r0 = r1.f454
            r0.setIntent(r2)
            return r1
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setNumericShortcut(char r2) {
            r1 = this;
            t12 r0 = r1.f454
            r0.setNumericShortcut(r2)
            return r1
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setNumericShortcut(char r2, int r3) {
            r1 = this;
            t12 r0 = r1.f454
            r0.setNumericShortcut(r2, r3)
            return r1
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setOnActionExpandListener(android.view.MenuItem.OnActionExpandListener r2) {
            r1 = this;
            if (r2 == 0) goto L8
            nz0 r0 = new nz0
            r0.<init>(r1, r2)
            goto L9
        L8:
            r0 = 0
        L9:
            t12 r2 = r1.f454
            r2.setOnActionExpandListener(r0)
            return r1
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setOnMenuItemClickListener(android.view.MenuItem.OnMenuItemClickListener r2) {
            r1 = this;
            if (r2 == 0) goto L8
            q12 r0 = new q12
            r0.<init>(r1, r2)
            goto L9
        L8:
            r0 = 0
        L9:
            t12 r2 = r1.f454
            r2.setOnMenuItemClickListener(r0)
            return r1
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setShortcut(char r2, char r3) {
            r1 = this;
            t12 r0 = r1.f454
            r0.setShortcut(r2, r3)
            return r1
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setShortcut(char r2, char r3, int r4, int r5) {
            r1 = this;
            t12 r0 = r1.f454
            r0.setShortcut(r2, r3, r4, r5)
            return r1
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int r1) {
            r0 = this;
            t12 r0 = r0.f454
            r0.setShowAsAction(r1)
            return
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setShowAsActionFlags(int r2) {
            r1 = this;
            t12 r0 = r1.f454
            r0.setShowAsActionFlags(r2)
            return r1
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setTitle(int r2) {
            r1 = this;
            t12 r0 = r1.f454
            r0.setTitle(r2)
            return r1
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setTitle(java.lang.CharSequence r2) {
            r1 = this;
            t12 r0 = r1.f454
            r0.setTitle(r2)
            return r1
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setTitleCondensed(java.lang.CharSequence r2) {
            r1 = this;
            t12 r0 = r1.f454
            r0.setTitleCondensed(r2)
            return r1
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setTooltipText(java.lang.CharSequence r2) {
            r1 = this;
            t12 r0 = r1.f454
            r0.setTooltipText(r2)
            return r1
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setVisible(boolean r1) {
            r0 = this;
            t12 r0 = r0.f454
            android.view.MenuItem r0 = r0.setVisible(r1)
            return r0
    }
}
