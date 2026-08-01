package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class lz0 implements p000.t12 {

    /* JADX INFO: renamed from: Α */
    public int f6848;

    /* JADX INFO: renamed from: Β */
    public android.view.View f6849;

    /* JADX INFO: renamed from: Γ */
    public p000.AbstractC1154 f6850;

    /* JADX INFO: renamed from: Δ */
    public android.view.MenuItem.OnActionExpandListener f6851;

    /* JADX INFO: renamed from: Ε */
    public boolean f6852;

    /* JADX INFO: renamed from: α */
    public final int f6853;

    /* JADX INFO: renamed from: β */
    public final int f6854;

    /* JADX INFO: renamed from: γ */
    public final int f6855;

    /* JADX INFO: renamed from: δ */
    public final int f6856;

    /* JADX INFO: renamed from: ε */
    public java.lang.CharSequence f6857;

    /* JADX INFO: renamed from: ζ */
    public java.lang.CharSequence f6858;

    /* JADX INFO: renamed from: η */
    public android.content.Intent f6859;

    /* JADX INFO: renamed from: θ */
    public char f6860;

    /* JADX INFO: renamed from: ι */
    public int f6861;

    /* JADX INFO: renamed from: κ */
    public char f6862;

    /* JADX INFO: renamed from: λ */
    public int f6863;

    /* JADX INFO: renamed from: μ */
    public android.graphics.drawable.Drawable f6864;

    /* JADX INFO: renamed from: ν */
    public int f6865;

    /* JADX INFO: renamed from: ξ */
    public final p000.iz0 f6866;

    /* JADX INFO: renamed from: ο */
    public p000.b12 f6867;

    /* JADX INFO: renamed from: π */
    public android.view.MenuItem.OnMenuItemClickListener f6868;

    /* JADX INFO: renamed from: ρ */
    public java.lang.CharSequence f6869;

    /* JADX INFO: renamed from: σ */
    public java.lang.CharSequence f6870;

    /* JADX INFO: renamed from: τ */
    public android.content.res.ColorStateList f6871;

    /* JADX INFO: renamed from: υ */
    public android.graphics.PorterDuff.Mode f6872;

    /* JADX INFO: renamed from: φ */
    public boolean f6873;

    /* JADX INFO: renamed from: χ */
    public boolean f6874;

    /* JADX INFO: renamed from: ψ */
    public boolean f6875;

    /* JADX INFO: renamed from: ω */
    public int f6876;

    public lz0(p000.iz0 r3, int r4, int r5, int r6, int r7, java.lang.CharSequence r8, int r9) {
            r2 = this;
            r2.<init>()
            r0 = 4096(0x1000, float:5.74E-42)
            r2.f6861 = r0
            r2.f6863 = r0
            r0 = 0
            r2.f6865 = r0
            r1 = 0
            r2.f6871 = r1
            r2.f6872 = r1
            r2.f6873 = r0
            r2.f6874 = r0
            r2.f6875 = r0
            r1 = 16
            r2.f6876 = r1
            r2.f6852 = r0
            r2.f6866 = r3
            r2.f6853 = r5
            r2.f6854 = r4
            r2.f6855 = r6
            r2.f6856 = r7
            r2.f6857 = r8
            r2.f6848 = r9
            return
    }

    /* JADX INFO: renamed from: γ */
    public static void m3665(java.lang.StringBuilder r0, int r1, int r2, java.lang.String r3) {
            r1 = r1 & r2
            if (r1 != r2) goto L6
            r0.append(r3)
        L6:
            return
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
            r1 = this;
            int r0 = r1.f6848
            r0 = r0 & 8
            if (r0 != 0) goto L7
            goto L18
        L7:
            android.view.View r0 = r1.f6849
            if (r0 != 0) goto Ld
            r1 = 1
            return r1
        Ld:
            android.view.MenuItem$OnActionExpandListener r0 = r1.f6851
            if (r0 == 0) goto L1a
            boolean r0 = r0.onMenuItemActionCollapse(r1)
            if (r0 == 0) goto L18
            goto L1a
        L18:
            r1 = 0
            return r1
        L1a:
            iz0 r0 = r1.f6866
            boolean r1 = r0.mo681(r1)
            return r1
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
            r1 = this;
            boolean r0 = r1.m3669()
            if (r0 != 0) goto L7
            goto L12
        L7:
            android.view.MenuItem$OnActionExpandListener r0 = r1.f6851
            if (r0 == 0) goto L14
            boolean r0 = r0.onMenuItemActionExpand(r1)
            if (r0 == 0) goto L12
            goto L14
        L12:
            r1 = 0
            return r1
        L14:
            iz0 r0 = r1.f6866
            boolean r1 = r0.mo683(r1)
            return r1
    }

    @Override // android.view.MenuItem
    public final android.view.ActionProvider getActionProvider() {
            r1 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "This is not supported, use MenuItemCompat.getActionProvider()"
            r1.<init>(r0)
            throw r1
    }

    @Override // android.view.MenuItem
    public final android.view.View getActionView() {
            r1 = this;
            android.view.View r0 = r1.f6849
            if (r0 == 0) goto L5
            return r0
        L5:
            ｘ r0 = r1.f6850
            if (r0 == 0) goto L14
            mz0 r0 = (p000.mz0) r0
            android.view.ActionProvider r0 = r0.f7333
            android.view.View r0 = r0.onCreateActionView(r1)
            r1.f6849 = r0
            return r0
        L14:
            r1 = 0
            return r1
    }

    @Override // p000.t12, android.view.MenuItem
    public final int getAlphabeticModifiers() {
            r0 = this;
            int r0 = r0.f6863
            return r0
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
            r0 = this;
            char r0 = r0.f6862
            return r0
    }

    @Override // p000.t12, android.view.MenuItem
    public final java.lang.CharSequence getContentDescription() {
            r0 = this;
            java.lang.CharSequence r0 = r0.f6869
            return r0
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
            r0 = this;
            int r0 = r0.f6854
            return r0
    }

    @Override // android.view.MenuItem
    public final android.graphics.drawable.Drawable getIcon() {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.f6864
            if (r0 == 0) goto L9
            android.graphics.drawable.Drawable r2 = r2.m3668(r0)
            return r2
        L9:
            int r0 = r2.f6865
            if (r0 == 0) goto L1f
            iz0 r1 = r2.f6866
            android.content.Context r1 = r1.f5251
            android.graphics.drawable.Drawable r0 = p000.ln0.m3603(r1, r0)
            r1 = 0
            r2.f6865 = r1
            r2.f6864 = r0
            android.graphics.drawable.Drawable r2 = r2.m3668(r0)
            return r2
        L1f:
            r2 = 0
            return r2
    }

    @Override // p000.t12, android.view.MenuItem
    public final android.content.res.ColorStateList getIconTintList() {
            r0 = this;
            android.content.res.ColorStateList r0 = r0.f6871
            return r0
    }

    @Override // p000.t12, android.view.MenuItem
    public final android.graphics.PorterDuff.Mode getIconTintMode() {
            r0 = this;
            android.graphics.PorterDuff$Mode r0 = r0.f6872
            return r0
    }

    @Override // android.view.MenuItem
    public final android.content.Intent getIntent() {
            r0 = this;
            android.content.Intent r0 = r0.f6859
            return r0
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
            r0 = this;
            int r0 = r0.f6853
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
            int r0 = r0.f6861
            return r0
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
            r0 = this;
            char r0 = r0.f6860
            return r0
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
            r0 = this;
            int r0 = r0.f6855
            return r0
    }

    @Override // android.view.MenuItem
    public final android.view.SubMenu getSubMenu() {
            r0 = this;
            b12 r0 = r0.f6867
            return r0
    }

    @Override // android.view.MenuItem
    public final java.lang.CharSequence getTitle() {
            r0 = this;
            java.lang.CharSequence r0 = r0.f6857
            return r0
    }

    @Override // android.view.MenuItem
    public final java.lang.CharSequence getTitleCondensed() {
            r1 = this;
            java.lang.CharSequence r0 = r1.f6858
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.CharSequence r1 = r1.f6857
            return r1
    }

    @Override // p000.t12, android.view.MenuItem
    public final java.lang.CharSequence getTooltipText() {
            r0 = this;
            java.lang.CharSequence r0 = r0.f6870
            return r0
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
            r0 = this;
            b12 r0 = r0.f6867
            if (r0 == 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
            r0 = this;
            boolean r0 = r0.f6852
            return r0
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
            r1 = this;
            int r1 = r1.f6876
            r0 = 1
            r1 = r1 & r0
            if (r1 != r0) goto L7
            return r0
        L7:
            r1 = 0
            return r1
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
            r1 = this;
            int r1 = r1.f6876
            r0 = 2
            r1 = r1 & r0
            if (r1 != r0) goto L8
            r1 = 1
            return r1
        L8:
            r1 = 0
            return r1
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
            r0 = this;
            int r0 = r0.f6876
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
            r3 = this;
            ｘ r0 = r3.f6850
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L24
            mz0 r0 = (p000.mz0) r0
            android.view.ActionProvider r0 = r0.f7333
            boolean r0 = r0.overridesItemVisibility()
            if (r0 == 0) goto L24
            int r0 = r3.f6876
            r0 = r0 & 8
            if (r0 != 0) goto L23
            ｘ r3 = r3.f6850
            mz0 r3 = (p000.mz0) r3
            android.view.ActionProvider r3 = r3.f7333
            boolean r3 = r3.isVisible()
            if (r3 == 0) goto L23
            return r2
        L23:
            return r1
        L24:
            int r3 = r3.f6876
            r3 = r3 & 8
            if (r3 != 0) goto L2b
            return r2
        L2b:
            return r1
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setActionProvider(android.view.ActionProvider r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "This is not supported, use MenuItemCompat.setActionProvider()"
            r0.<init>(r1)
            throw r0
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setActionView(int r5) {
            r4 = this;
            iz0 r0 = r4.f6866
            android.content.Context r1 = r0.f5251
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r1)
            android.widget.LinearLayout r3 = new android.widget.LinearLayout
            r3.<init>(r1)
            r1 = 0
            android.view.View r5 = r2.inflate(r5, r3, r1)
            r4.f6849 = r5
            r1 = 0
            r4.f6850 = r1
            if (r5 == 0) goto L27
            int r1 = r5.getId()
            r2 = -1
            if (r1 != r2) goto L27
            int r1 = r4.f6853
            if (r1 <= 0) goto L27
            r5.setId(r1)
        L27:
            r5 = 1
            r0.f5261 = r5
            r0.m2836(r5)
            return r4
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setActionView(android.view.View r3) {
            r2 = this;
            r2.f6849 = r3
            r0 = 0
            r2.f6850 = r0
            if (r3 == 0) goto L15
            int r0 = r3.getId()
            r1 = -1
            if (r0 != r1) goto L15
            int r0 = r2.f6853
            if (r0 <= 0) goto L15
            r3.setId(r0)
        L15:
            iz0 r3 = r2.f6866
            r0 = 1
            r3.f5261 = r0
            r3.m2836(r0)
            return r2
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setAlphabeticShortcut(char r2) {
            r1 = this;
            char r0 = r1.f6862
            if (r0 != r2) goto L5
            return r1
        L5:
            char r2 = java.lang.Character.toLowerCase(r2)
            r1.f6862 = r2
            iz0 r2 = r1.f6866
            r0 = 0
            r2.m2836(r0)
            return r1
    }

    @Override // p000.t12, android.view.MenuItem
    public final android.view.MenuItem setAlphabeticShortcut(char r2, int r3) {
            r1 = this;
            char r0 = r1.f6862
            if (r0 != r2) goto L9
            int r0 = r1.f6863
            if (r0 != r3) goto L9
            return r1
        L9:
            char r2 = java.lang.Character.toLowerCase(r2)
            r1.f6862 = r2
            int r2 = android.view.KeyEvent.normalizeMetaState(r3)
            r1.f6863 = r2
            iz0 r2 = r1.f6866
            r3 = 0
            r2.m2836(r3)
            return r1
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setCheckable(boolean r3) {
            r2 = this;
            int r0 = r2.f6876
            r1 = r0 & (-2)
            r3 = r3 | r1
            r2.f6876 = r3
            if (r0 == r3) goto Lf
            iz0 r3 = r2.f6866
            r0 = 0
            r3.m2836(r0)
        Lf:
            return r2
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setChecked(boolean r10) {
            r9 = this;
            int r0 = r9.f6876
            r1 = r0 & 4
            r2 = 2
            iz0 r3 = r9.f6866
            r4 = 0
            if (r1 == 0) goto L4e
            java.util.ArrayList r10 = r3.f5256
            int r0 = r10.size()
            r3.m2843()
            r1 = r4
        L14:
            if (r1 >= r0) goto L4a
            java.lang.Object r5 = r10.get(r1)
            lz0 r5 = (p000.lz0) r5
            int r6 = r5.f6854
            int r7 = r9.f6854
            if (r6 != r7) goto L47
            int r6 = r5.f6876
            r6 = r6 & 4
            if (r6 == 0) goto L47
            boolean r6 = r5.isCheckable()
            if (r6 != 0) goto L2f
            goto L47
        L2f:
            if (r5 != r9) goto L33
            r6 = 1
            goto L34
        L33:
            r6 = r4
        L34:
            int r7 = r5.f6876
            r8 = r7 & (-3)
            if (r6 == 0) goto L3c
            r6 = r2
            goto L3d
        L3c:
            r6 = r4
        L3d:
            r6 = r6 | r8
            r5.f6876 = r6
            if (r7 == r6) goto L47
            iz0 r5 = r5.f6866
            r5.m2836(r4)
        L47:
            int r1 = r1 + 1
            goto L14
        L4a:
            r3.m2842()
            return r9
        L4e:
            r1 = r0 & (-3)
            if (r10 == 0) goto L53
            goto L54
        L53:
            r2 = r4
        L54:
            r10 = r1 | r2
            r9.f6876 = r10
            if (r0 == r10) goto L5d
            r3.m2836(r4)
        L5d:
            return r9
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ android.view.MenuItem setContentDescription(java.lang.CharSequence r1) {
            r0 = this;
            r0.setContentDescription(r1)
            return r0
    }

    @Override // p000.t12, android.view.MenuItem
    public final p000.t12 setContentDescription(java.lang.CharSequence r2) {
            r1 = this;
            r1.f6869 = r2
            iz0 r2 = r1.f6866
            r0 = 0
            r2.m2836(r0)
            return r1
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setEnabled(boolean r2) {
            r1 = this;
            int r0 = r1.f6876
            if (r2 == 0) goto L9
            r2 = r0 | 16
            r1.f6876 = r2
            goto Ld
        L9:
            r2 = r0 & (-17)
            r1.f6876 = r2
        Ld:
            iz0 r2 = r1.f6866
            r0 = 0
            r2.m2836(r0)
            return r1
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setIcon(int r2) {
            r1 = this;
            r0 = 0
            r1.f6864 = r0
            r1.f6865 = r2
            r2 = 1
            r1.f6875 = r2
            iz0 r2 = r1.f6866
            r0 = 0
            r2.m2836(r0)
            return r1
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setIcon(android.graphics.drawable.Drawable r2) {
            r1 = this;
            r0 = 0
            r1.f6865 = r0
            r1.f6864 = r2
            r2 = 1
            r1.f6875 = r2
            iz0 r2 = r1.f6866
            r2.m2836(r0)
            return r1
    }

    @Override // p000.t12, android.view.MenuItem
    public final android.view.MenuItem setIconTintList(android.content.res.ColorStateList r2) {
            r1 = this;
            r1.f6871 = r2
            r2 = 1
            r1.f6873 = r2
            r1.f6875 = r2
            iz0 r2 = r1.f6866
            r0 = 0
            r2.m2836(r0)
            return r1
    }

    @Override // p000.t12, android.view.MenuItem
    public final android.view.MenuItem setIconTintMode(android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            r1.f6872 = r2
            r2 = 1
            r1.f6874 = r2
            r1.f6875 = r2
            iz0 r2 = r1.f6866
            r0 = 0
            r2.m2836(r0)
            return r1
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setIntent(android.content.Intent r1) {
            r0 = this;
            r0.f6859 = r1
            return r0
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setNumericShortcut(char r2) {
            r1 = this;
            char r0 = r1.f6860
            if (r0 != r2) goto L5
            return r1
        L5:
            r1.f6860 = r2
            iz0 r2 = r1.f6866
            r0 = 0
            r2.m2836(r0)
            return r1
    }

    @Override // p000.t12, android.view.MenuItem
    public final android.view.MenuItem setNumericShortcut(char r2, int r3) {
            r1 = this;
            char r0 = r1.f6860
            if (r0 != r2) goto L9
            int r0 = r1.f6861
            if (r0 != r3) goto L9
            return r1
        L9:
            r1.f6860 = r2
            int r2 = android.view.KeyEvent.normalizeMetaState(r3)
            r1.f6861 = r2
            iz0 r2 = r1.f6866
            r3 = 0
            r2.m2836(r3)
            return r1
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setOnActionExpandListener(android.view.MenuItem.OnActionExpandListener r1) {
            r0 = this;
            r0.f6851 = r1
            return r0
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setOnMenuItemClickListener(android.view.MenuItem.OnMenuItemClickListener r1) {
            r0 = this;
            r0.f6868 = r1
            return r0
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setShortcut(char r1, char r2) {
            r0 = this;
            r0.f6860 = r1
            char r1 = java.lang.Character.toLowerCase(r2)
            r0.f6862 = r1
            iz0 r1 = r0.f6866
            r2 = 0
            r1.m2836(r2)
            return r0
    }

    @Override // p000.t12, android.view.MenuItem
    public final android.view.MenuItem setShortcut(char r1, char r2, int r3, int r4) {
            r0 = this;
            r0.f6860 = r1
            int r1 = android.view.KeyEvent.normalizeMetaState(r3)
            r0.f6861 = r1
            char r1 = java.lang.Character.toLowerCase(r2)
            r0.f6862 = r1
            int r1 = android.view.KeyEvent.normalizeMetaState(r4)
            r0.f6863 = r1
            iz0 r1 = r0.f6866
            r2 = 0
            r1.m2836(r2)
            return r0
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int r4) {
            r3 = this;
            r0 = r4 & 3
            r1 = 1
            if (r0 == 0) goto L11
            if (r0 == r1) goto L11
            r2 = 2
            if (r0 != r2) goto Lb
            goto L11
        Lb:
            java.lang.String r3 = "SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive."
            p000.C1080.m7275(r3)
            return
        L11:
            r3.f6848 = r4
            iz0 r3 = r3.f6866
            r3.f5261 = r1
            r3.m2836(r1)
            return
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setShowAsActionFlags(int r1) {
            r0 = this;
            r0.setShowAsAction(r1)
            return r0
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setTitle(int r2) {
            r1 = this;
            iz0 r0 = r1.f6866
            android.content.Context r0 = r0.f5251
            java.lang.String r2 = r0.getString(r2)
            r1.setTitle(r2)
            return r1
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setTitle(java.lang.CharSequence r3) {
            r2 = this;
            r2.f6857 = r3
            iz0 r0 = r2.f6866
            r1 = 0
            r0.m2836(r1)
            b12 r0 = r2.f6867
            if (r0 == 0) goto Lf
            r0.setHeaderTitle(r3)
        Lf:
            return r2
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setTitleCondensed(java.lang.CharSequence r2) {
            r1 = this;
            r1.f6858 = r2
            iz0 r2 = r1.f6866
            r0 = 0
            r2.m2836(r0)
            return r1
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ android.view.MenuItem setTooltipText(java.lang.CharSequence r1) {
            r0 = this;
            r0.setTooltipText(r1)
            return r0
    }

    @Override // p000.t12, android.view.MenuItem
    public final p000.t12 setTooltipText(java.lang.CharSequence r2) {
            r1 = this;
            r1.f6870 = r2
            iz0 r2 = r1.f6866
            r0 = 0
            r2.m2836(r0)
            return r1
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setVisible(boolean r3) {
            r2 = this;
            int r0 = r2.f6876
            r1 = r0 & (-9)
            if (r3 == 0) goto L8
            r3 = 0
            goto La
        L8:
            r3 = 8
        La:
            r3 = r3 | r1
            r2.f6876 = r3
            if (r0 == r3) goto L17
            iz0 r3 = r2.f6866
            r0 = 1
            r3.f5258 = r0
            r3.m2836(r0)
        L17:
            return r2
    }

    public final java.lang.String toString() {
            r0 = this;
            java.lang.CharSequence r0 = r0.f6857
            if (r0 == 0) goto L9
            java.lang.String r0 = r0.toString()
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // p000.t12
    /* JADX INFO: renamed from: α */
    public final p000.AbstractC1154 mo3666() {
            r0 = this;
            ｘ r0 = r0.f6850
            return r0
    }

    @Override // p000.t12
    /* JADX INFO: renamed from: β */
    public final p000.t12 mo3667(p000.AbstractC1154 r3) {
            r2 = this;
            ｘ r0 = r2.f6850
            r1 = 0
            if (r0 == 0) goto L7
            r0.f13522 = r1
        L7:
            r2.f6849 = r1
            r2.f6850 = r3
            iz0 r3 = r2.f6866
            r0 = 1
            r3.m2836(r0)
            ｘ r3 = r2.f6850
            if (r3 == 0) goto L25
            n r0 = new n
            r1 = 29
            r0.<init>(r1, r2)
            mz0 r3 = (p000.mz0) r3
            r3.f7332 = r0
            android.view.ActionProvider r0 = r3.f7333
            r0.setVisibilityListener(r3)
        L25:
            return r2
    }

    /* JADX INFO: renamed from: δ */
    public final android.graphics.drawable.Drawable m3668(android.graphics.drawable.Drawable r2) {
            r1 = this;
            if (r2 == 0) goto L27
            boolean r0 = r1.f6875
            if (r0 == 0) goto L27
            boolean r0 = r1.f6873
            if (r0 != 0) goto Le
            boolean r0 = r1.f6874
            if (r0 == 0) goto L27
        Le:
            android.graphics.drawable.Drawable r2 = r2.mutate()
            boolean r0 = r1.f6873
            if (r0 == 0) goto L1b
            android.content.res.ColorStateList r0 = r1.f6871
            r2.setTintList(r0)
        L1b:
            boolean r0 = r1.f6874
            if (r0 == 0) goto L24
            android.graphics.PorterDuff$Mode r0 = r1.f6872
            r2.setTintMode(r0)
        L24:
            r0 = 0
            r1.f6875 = r0
        L27:
            return r2
    }

    /* JADX INFO: renamed from: ε */
    public final boolean m3669() {
            r2 = this;
            int r0 = r2.f6848
            r0 = r0 & 8
            r1 = 0
            if (r0 == 0) goto L1f
            android.view.View r0 = r2.f6849
            if (r0 != 0) goto L19
            ｘ r0 = r2.f6850
            if (r0 == 0) goto L19
            mz0 r0 = (p000.mz0) r0
            android.view.ActionProvider r0 = r0.f7333
            android.view.View r0 = r0.onCreateActionView(r2)
            r2.f6849 = r0
        L19:
            android.view.View r2 = r2.f6849
            if (r2 == 0) goto L1f
            r2 = 1
            return r2
        L1f:
            return r1
    }

    /* JADX INFO: renamed from: ζ */
    public final void m3670(boolean r2) {
            r1 = this;
            int r0 = r1.f6876
            if (r2 == 0) goto L9
            r2 = r0 | 32
            r1.f6876 = r2
            return
        L9:
            r2 = r0 & (-33)
            r1.f6876 = r2
            return
    }
}
