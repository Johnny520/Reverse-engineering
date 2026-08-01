package p000;

/* JADX INFO: renamed from: ｎ */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C1144 implements p000.t12 {

    /* JADX INFO: renamed from: α */
    public java.lang.CharSequence f13490;

    /* JADX INFO: renamed from: β */
    public java.lang.CharSequence f13491;

    /* JADX INFO: renamed from: γ */
    public android.content.Intent f13492;

    /* JADX INFO: renamed from: δ */
    public char f13493;

    /* JADX INFO: renamed from: ε */
    public int f13494;

    /* JADX INFO: renamed from: ζ */
    public char f13495;

    /* JADX INFO: renamed from: η */
    public int f13496;

    /* JADX INFO: renamed from: θ */
    public android.graphics.drawable.Drawable f13497;

    /* JADX INFO: renamed from: ι */
    public android.content.Context f13498;

    /* JADX INFO: renamed from: κ */
    public java.lang.CharSequence f13499;

    /* JADX INFO: renamed from: λ */
    public java.lang.CharSequence f13500;

    /* JADX INFO: renamed from: μ */
    public android.content.res.ColorStateList f13501;

    /* JADX INFO: renamed from: ν */
    public android.graphics.PorterDuff.Mode f13502;

    /* JADX INFO: renamed from: ξ */
    public boolean f13503;

    /* JADX INFO: renamed from: ο */
    public boolean f13504;

    /* JADX INFO: renamed from: π */
    public int f13505;

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // android.view.MenuItem
    public final android.view.ActionProvider getActionProvider() {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // android.view.MenuItem
    public final android.view.View getActionView() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // p000.t12, android.view.MenuItem
    public final int getAlphabeticModifiers() {
            r0 = this;
            int r0 = r0.f13496
            return r0
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
            r0 = this;
            char r0 = r0.f13495
            return r0
    }

    @Override // p000.t12, android.view.MenuItem
    public final java.lang.CharSequence getContentDescription() {
            r0 = this;
            java.lang.CharSequence r0 = r0.f13499
            return r0
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // android.view.MenuItem
    public final android.graphics.drawable.Drawable getIcon() {
            r0 = this;
            android.graphics.drawable.Drawable r0 = r0.f13497
            return r0
    }

    @Override // p000.t12, android.view.MenuItem
    public final android.content.res.ColorStateList getIconTintList() {
            r0 = this;
            android.content.res.ColorStateList r0 = r0.f13501
            return r0
    }

    @Override // p000.t12, android.view.MenuItem
    public final android.graphics.PorterDuff.Mode getIconTintMode() {
            r0 = this;
            android.graphics.PorterDuff$Mode r0 = r0.f13502
            return r0
    }

    @Override // android.view.MenuItem
    public final android.content.Intent getIntent() {
            r0 = this;
            android.content.Intent r0 = r0.f13492
            return r0
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
            r0 = this;
            r0 = 16908332(0x102002c, float:2.3877352E-38)
            return r0
    }

    @Override // android.view.MenuItem
    public final android.view.ContextMenu.ContextMenuInfo getMenuInfo() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // p000.t12, android.view.MenuItem
    public final int getNumericModifiers() {
            r0 = this;
            int r0 = r0.f13494
            return r0
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
            r0 = this;
            char r0 = r0.f13493
            return r0
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // android.view.MenuItem
    public final android.view.SubMenu getSubMenu() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // android.view.MenuItem
    public final java.lang.CharSequence getTitle() {
            r0 = this;
            java.lang.CharSequence r0 = r0.f13490
            return r0
    }

    @Override // android.view.MenuItem
    public final java.lang.CharSequence getTitleCondensed() {
            r1 = this;
            java.lang.CharSequence r0 = r1.f13491
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.CharSequence r1 = r1.f13490
            return r1
    }

    @Override // p000.t12, android.view.MenuItem
    public final java.lang.CharSequence getTooltipText() {
            r0 = this;
            java.lang.CharSequence r0 = r0.f13500
            return r0
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
            r1 = this;
            int r1 = r1.f13505
            r0 = 1
            r1 = r1 & r0
            if (r1 == 0) goto L7
            return r0
        L7:
            r1 = 0
            return r1
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
            r0 = this;
            int r0 = r0.f13505
            r0 = r0 & 2
            if (r0 == 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
            r0 = this;
            int r0 = r0.f13505
            r0 = r0 & 16
            if (r0 == 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
            r0 = this;
            int r0 = r0.f13505
            r0 = r0 & 8
            if (r0 != 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setActionProvider(android.view.ActionProvider r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setActionView(int r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setActionView(android.view.View r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setAlphabeticShortcut(char r1) {
            r0 = this;
            char r1 = java.lang.Character.toLowerCase(r1)
            r0.f13495 = r1
            return r0
    }

    @Override // p000.t12, android.view.MenuItem
    public final android.view.MenuItem setAlphabeticShortcut(char r1, int r2) {
            r0 = this;
            char r1 = java.lang.Character.toLowerCase(r1)
            r0.f13495 = r1
            int r1 = android.view.KeyEvent.normalizeMetaState(r2)
            r0.f13496 = r1
            return r0
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setCheckable(boolean r2) {
            r1 = this;
            int r0 = r1.f13505
            r0 = r0 & (-2)
            r2 = r2 | r0
            r1.f13505 = r2
            return r1
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setChecked(boolean r2) {
            r1 = this;
            int r0 = r1.f13505
            r0 = r0 & (-3)
            if (r2 == 0) goto L8
            r2 = 2
            goto L9
        L8:
            r2 = 0
        L9:
            r2 = r2 | r0
            r1.f13505 = r2
            return r1
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setContentDescription(java.lang.CharSequence r1) {
            r0 = this;
            r0.f13499 = r1
            return r0
    }

    @Override // p000.t12, android.view.MenuItem
    public final p000.t12 setContentDescription(java.lang.CharSequence r1) {
            r0 = this;
            r0.f13499 = r1
            return r0
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setEnabled(boolean r2) {
            r1 = this;
            int r0 = r1.f13505
            r0 = r0 & (-17)
            if (r2 == 0) goto L9
            r2 = 16
            goto La
        L9:
            r2 = 0
        La:
            r2 = r2 | r0
            r1.f13505 = r2
            return r1
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setIcon(int r2) {
            r1 = this;
            android.content.Context r0 = r1.f13498
            android.graphics.drawable.Drawable r2 = r0.getDrawable(r2)
            r1.f13497 = r2
            r1.m7362()
            return r1
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setIcon(android.graphics.drawable.Drawable r1) {
            r0 = this;
            r0.f13497 = r1
            r0.m7362()
            return r0
    }

    @Override // p000.t12, android.view.MenuItem
    public final android.view.MenuItem setIconTintList(android.content.res.ColorStateList r1) {
            r0 = this;
            r0.f13501 = r1
            r1 = 1
            r0.f13503 = r1
            r0.m7362()
            return r0
    }

    @Override // p000.t12, android.view.MenuItem
    public final android.view.MenuItem setIconTintMode(android.graphics.PorterDuff.Mode r1) {
            r0 = this;
            r0.f13502 = r1
            r1 = 1
            r0.f13504 = r1
            r0.m7362()
            return r0
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setIntent(android.content.Intent r1) {
            r0 = this;
            r0.f13492 = r1
            return r0
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setNumericShortcut(char r1) {
            r0 = this;
            r0.f13493 = r1
            return r0
    }

    @Override // p000.t12, android.view.MenuItem
    public final android.view.MenuItem setNumericShortcut(char r1, int r2) {
            r0 = this;
            r0.f13493 = r1
            int r1 = android.view.KeyEvent.normalizeMetaState(r2)
            r0.f13494 = r1
            return r0
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setOnActionExpandListener(android.view.MenuItem.OnActionExpandListener r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setOnMenuItemClickListener(android.view.MenuItem.OnMenuItemClickListener r1) {
            r0 = this;
            return r0
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setShortcut(char r1, char r2) {
            r0 = this;
            r0.f13493 = r1
            char r1 = java.lang.Character.toLowerCase(r2)
            r0.f13495 = r1
            return r0
    }

    @Override // p000.t12, android.view.MenuItem
    public final android.view.MenuItem setShortcut(char r1, char r2, int r3, int r4) {
            r0 = this;
            r0.f13493 = r1
            int r1 = android.view.KeyEvent.normalizeMetaState(r3)
            r0.f13494 = r1
            char r1 = java.lang.Character.toLowerCase(r2)
            r0.f13495 = r1
            int r1 = android.view.KeyEvent.normalizeMetaState(r4)
            r0.f13496 = r1
            return r0
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int r1) {
            r0 = this;
            return
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setShowAsActionFlags(int r1) {
            r0 = this;
            return r0
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setTitle(int r2) {
            r1 = this;
            android.content.Context r0 = r1.f13498
            android.content.res.Resources r0 = r0.getResources()
            java.lang.String r2 = r0.getString(r2)
            r1.f13490 = r2
            return r1
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setTitle(java.lang.CharSequence r1) {
            r0 = this;
            r0.f13490 = r1
            return r0
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setTitleCondensed(java.lang.CharSequence r1) {
            r0 = this;
            r0.f13491 = r1
            return r0
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setTooltipText(java.lang.CharSequence r1) {
            r0 = this;
            r0.f13500 = r1
            return r0
    }

    @Override // p000.t12, android.view.MenuItem
    public final p000.t12 setTooltipText(java.lang.CharSequence r1) {
            r0 = this;
            r0.f13500 = r1
            return r0
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setVisible(boolean r3) {
            r2 = this;
            int r0 = r2.f13505
            r1 = 8
            r0 = r0 & r1
            if (r3 == 0) goto L8
            r1 = 0
        L8:
            r3 = r0 | r1
            r2.f13505 = r3
            return r2
    }

    @Override // p000.t12
    /* JADX INFO: renamed from: α */
    public final p000.AbstractC1154 mo3666() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // p000.t12
    /* JADX INFO: renamed from: β */
    public final p000.t12 mo3667(p000.AbstractC1154 r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    /* JADX INFO: renamed from: γ */
    public final void m7362() {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.f13497
            if (r0 == 0) goto L28
            boolean r1 = r2.f13503
            if (r1 != 0) goto Lc
            boolean r1 = r2.f13504
            if (r1 == 0) goto L28
        Lc:
            r2.f13497 = r0
            android.graphics.drawable.Drawable r0 = r0.mutate()
            r2.f13497 = r0
            boolean r1 = r2.f13503
            if (r1 == 0) goto L1d
            android.content.res.ColorStateList r1 = r2.f13501
            r0.setTintList(r1)
        L1d:
            boolean r0 = r2.f13504
            if (r0 == 0) goto L28
            android.graphics.drawable.Drawable r0 = r2.f13497
            android.graphics.PorterDuff$Mode r2 = r2.f13502
            r0.setTintMode(r2)
        L28:
            return
    }
}
