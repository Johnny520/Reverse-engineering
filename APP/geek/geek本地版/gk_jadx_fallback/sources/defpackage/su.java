package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class su extends defpackage.o3 implements android.view.MenuItem {
    public final defpackage.l50 c;
    public java.lang.reflect.Method d;

    public su(android.content.Context r1, defpackage.l50 r2) {
            r0 = this;
            r0.<init>(r1)
            if (r2 == 0) goto L8
            r0.c = r2
            return
        L8:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Wrapped Object can not be null."
            r1.<init>(r2)
            throw r1
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
            r1 = this;
            l50 r0 = r1.c
            boolean r0 = r0.collapseActionView()
            return r0
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
            r1 = this;
            l50 r0 = r1.c
            boolean r0 = r0.expandActionView()
            return r0
    }

    @Override // android.view.MenuItem
    public final android.view.ActionProvider getActionProvider() {
            r1 = this;
            l50 r0 = r1.c
            pu r0 = r0.b()
            if (r0 == 0) goto Lb
            android.view.ActionProvider r0 = r0.a
            return r0
        Lb:
            r0 = 0
            return r0
    }

    @Override // android.view.MenuItem
    public final android.view.View getActionView() {
            r2 = this;
            l50 r0 = r2.c
            android.view.View r0 = r0.getActionView()
            boolean r1 = r0 instanceof defpackage.qu
            if (r1 == 0) goto L10
            qu r0 = (defpackage.qu) r0
            android.view.CollapsibleActionView r0 = r0.a
            android.view.View r0 = (android.view.View) r0
        L10:
            return r0
    }

    @Override // android.view.MenuItem
    public final int getAlphabeticModifiers() {
            r1 = this;
            l50 r0 = r1.c
            int r0 = r0.getAlphabeticModifiers()
            return r0
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
            r1 = this;
            l50 r0 = r1.c
            char r0 = r0.getAlphabeticShortcut()
            return r0
    }

    @Override // android.view.MenuItem
    public final java.lang.CharSequence getContentDescription() {
            r1 = this;
            l50 r0 = r1.c
            java.lang.CharSequence r0 = r0.getContentDescription()
            return r0
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
            r1 = this;
            l50 r0 = r1.c
            int r0 = r0.getGroupId()
            return r0
    }

    @Override // android.view.MenuItem
    public final android.graphics.drawable.Drawable getIcon() {
            r1 = this;
            l50 r0 = r1.c
            android.graphics.drawable.Drawable r0 = r0.getIcon()
            return r0
    }

    @Override // android.view.MenuItem
    public final android.content.res.ColorStateList getIconTintList() {
            r1 = this;
            l50 r0 = r1.c
            android.content.res.ColorStateList r0 = r0.getIconTintList()
            return r0
    }

    @Override // android.view.MenuItem
    public final android.graphics.PorterDuff.Mode getIconTintMode() {
            r1 = this;
            l50 r0 = r1.c
            android.graphics.PorterDuff$Mode r0 = r0.getIconTintMode()
            return r0
    }

    @Override // android.view.MenuItem
    public final android.content.Intent getIntent() {
            r1 = this;
            l50 r0 = r1.c
            android.content.Intent r0 = r0.getIntent()
            return r0
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
            r1 = this;
            l50 r0 = r1.c
            int r0 = r0.getItemId()
            return r0
    }

    @Override // android.view.MenuItem
    public final android.view.ContextMenu.ContextMenuInfo getMenuInfo() {
            r1 = this;
            l50 r0 = r1.c
            android.view.ContextMenu$ContextMenuInfo r0 = r0.getMenuInfo()
            return r0
    }

    @Override // android.view.MenuItem
    public final int getNumericModifiers() {
            r1 = this;
            l50 r0 = r1.c
            int r0 = r0.getNumericModifiers()
            return r0
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
            r1 = this;
            l50 r0 = r1.c
            char r0 = r0.getNumericShortcut()
            return r0
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
            r1 = this;
            l50 r0 = r1.c
            int r0 = r0.getOrder()
            return r0
    }

    @Override // android.view.MenuItem
    public final android.view.SubMenu getSubMenu() {
            r1 = this;
            l50 r0 = r1.c
            android.view.SubMenu r0 = r0.getSubMenu()
            return r0
    }

    @Override // android.view.MenuItem
    public final java.lang.CharSequence getTitle() {
            r1 = this;
            l50 r0 = r1.c
            java.lang.CharSequence r0 = r0.getTitle()
            return r0
    }

    @Override // android.view.MenuItem
    public final java.lang.CharSequence getTitleCondensed() {
            r1 = this;
            l50 r0 = r1.c
            java.lang.CharSequence r0 = r0.getTitleCondensed()
            return r0
    }

    @Override // android.view.MenuItem
    public final java.lang.CharSequence getTooltipText() {
            r1 = this;
            l50 r0 = r1.c
            java.lang.CharSequence r0 = r0.getTooltipText()
            return r0
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
            r1 = this;
            l50 r0 = r1.c
            boolean r0 = r0.hasSubMenu()
            return r0
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
            r1 = this;
            l50 r0 = r1.c
            boolean r0 = r0.isActionViewExpanded()
            return r0
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
            r1 = this;
            l50 r0 = r1.c
            boolean r0 = r0.isCheckable()
            return r0
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
            r1 = this;
            l50 r0 = r1.c
            boolean r0 = r0.isChecked()
            return r0
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
            r1 = this;
            l50 r0 = r1.c
            boolean r0 = r0.isEnabled()
            return r0
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
            r1 = this;
            l50 r0 = r1.c
            boolean r0 = r0.isVisible()
            return r0
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setActionProvider(android.view.ActionProvider r2) {
            r1 = this;
            pu r0 = new pu
            r0.<init>(r1, r2)
            if (r2 == 0) goto L8
            goto L9
        L8:
            r0 = 0
        L9:
            l50 r2 = r1.c
            r2.a(r0)
            return r1
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setActionView(int r3) {
            r2 = this;
            l50 r0 = r2.c
            r0.setActionView(r3)
            android.view.View r3 = r0.getActionView()
            boolean r1 = r3 instanceof android.view.CollapsibleActionView
            if (r1 == 0) goto L15
            qu r1 = new qu
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
            qu r0 = new qu
            r0.<init>(r2)
            r2 = r0
        La:
            l50 r0 = r1.c
            r0.setActionView(r2)
            return r1
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setAlphabeticShortcut(char r2) {
            r1 = this;
            l50 r0 = r1.c
            r0.setAlphabeticShortcut(r2)
            return r1
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setAlphabeticShortcut(char r2, int r3) {
            r1 = this;
            l50 r0 = r1.c
            r0.setAlphabeticShortcut(r2, r3)
            return r1
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setCheckable(boolean r2) {
            r1 = this;
            l50 r0 = r1.c
            r0.setCheckable(r2)
            return r1
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setChecked(boolean r2) {
            r1 = this;
            l50 r0 = r1.c
            r0.setChecked(r2)
            return r1
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setContentDescription(java.lang.CharSequence r2) {
            r1 = this;
            l50 r0 = r1.c
            r0.setContentDescription(r2)
            return r1
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setEnabled(boolean r2) {
            r1 = this;
            l50 r0 = r1.c
            r0.setEnabled(r2)
            return r1
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setIcon(int r2) {
            r1 = this;
            l50 r0 = r1.c
            r0.setIcon(r2)
            return r1
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setIcon(android.graphics.drawable.Drawable r2) {
            r1 = this;
            l50 r0 = r1.c
            r0.setIcon(r2)
            return r1
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setIconTintList(android.content.res.ColorStateList r2) {
            r1 = this;
            l50 r0 = r1.c
            r0.setIconTintList(r2)
            return r1
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setIconTintMode(android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            l50 r0 = r1.c
            r0.setIconTintMode(r2)
            return r1
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setIntent(android.content.Intent r2) {
            r1 = this;
            l50 r0 = r1.c
            r0.setIntent(r2)
            return r1
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setNumericShortcut(char r2) {
            r1 = this;
            l50 r0 = r1.c
            r0.setNumericShortcut(r2)
            return r1
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setNumericShortcut(char r2, int r3) {
            r1 = this;
            l50 r0 = r1.c
            r0.setNumericShortcut(r2, r3)
            return r1
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setOnActionExpandListener(android.view.MenuItem.OnActionExpandListener r2) {
            r1 = this;
            if (r2 == 0) goto L8
            ru r0 = new ru
            r0.<init>(r1, r2)
            goto L9
        L8:
            r0 = 0
        L9:
            l50 r2 = r1.c
            r2.setOnActionExpandListener(r0)
            return r1
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setOnMenuItemClickListener(android.view.MenuItem.OnMenuItemClickListener r2) {
            r1 = this;
            if (r2 == 0) goto L8
            i50 r0 = new i50
            r0.<init>(r1, r2)
            goto L9
        L8:
            r0 = 0
        L9:
            l50 r2 = r1.c
            r2.setOnMenuItemClickListener(r0)
            return r1
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setShortcut(char r2, char r3) {
            r1 = this;
            l50 r0 = r1.c
            r0.setShortcut(r2, r3)
            return r1
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setShortcut(char r2, char r3, int r4, int r5) {
            r1 = this;
            l50 r0 = r1.c
            r0.setShortcut(r2, r3, r4, r5)
            return r1
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int r2) {
            r1 = this;
            l50 r0 = r1.c
            r0.setShowAsAction(r2)
            return
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setShowAsActionFlags(int r2) {
            r1 = this;
            l50 r0 = r1.c
            r0.setShowAsActionFlags(r2)
            return r1
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setTitle(int r2) {
            r1 = this;
            l50 r0 = r1.c
            r0.setTitle(r2)
            return r1
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setTitle(java.lang.CharSequence r2) {
            r1 = this;
            l50 r0 = r1.c
            r0.setTitle(r2)
            return r1
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setTitleCondensed(java.lang.CharSequence r2) {
            r1 = this;
            l50 r0 = r1.c
            r0.setTitleCondensed(r2)
            return r1
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setTooltipText(java.lang.CharSequence r2) {
            r1 = this;
            l50 r0 = r1.c
            r0.setTooltipText(r2)
            return r1
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setVisible(boolean r2) {
            r1 = this;
            l50 r0 = r1.c
            android.view.MenuItem r2 = r0.setVisible(r2)
            return r2
    }
}
