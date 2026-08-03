package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟۟ۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
public class C0180 implements Yue.InterfaceMenuItemC6061 {

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public static final int f408 = 1;

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public static final int f409 = 2;

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public static final int f410 = 4;

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public static final int f411 = 8;

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public static final int f412 = 16;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public final int f413;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public final int f414;

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public final int f415;

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public java.lang.CharSequence f416;

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public java.lang.CharSequence f417;

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public android.content.Intent f418;

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public char f419;

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public int f420;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public char f421;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public int f422;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public android.graphics.drawable.Drawable f423;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public android.content.Context f424;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public android.view.MenuItem.OnMenuItemClickListener f425;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public java.lang.CharSequence f426;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public java.lang.CharSequence f427;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public android.content.res.ColorStateList f428;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public android.graphics.PorterDuff.Mode f429;

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public boolean f430;

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public boolean f431;

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public int f432;

    public C0180(android.content.Context r1, int r2, int r3, int r4, int r5, java.lang.CharSequence r6) {
            r0 = this;
            r0.<init>()
            r4 = 4096(0x1000, float:5.74E-42)
            r0.f420 = r4
            r0.f422 = r4
            r4 = 0
            r0.f428 = r4
            r0.f429 = r4
            r4 = 0
            r0.f430 = r4
            r0.f431 = r4
            r4 = 16
            r0.f432 = r4
            r0.f424 = r1
            r0.f413 = r3
            r0.f414 = r2
            r0.f415 = r5
            r0.f416 = r6
            return
    }

    @Override // Yue.InterfaceMenuItemC6061, android.view.MenuItem
    public boolean collapseActionView() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // Yue.InterfaceMenuItemC6061, android.view.MenuItem
    public boolean expandActionView() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // android.view.MenuItem
    public android.view.ActionProvider getActionProvider() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // Yue.InterfaceMenuItemC6061, android.view.MenuItem
    public android.view.View getActionView() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // Yue.InterfaceMenuItemC6061, android.view.MenuItem
    public int getAlphabeticModifiers() {
            r1 = this;
            int r0 = r1.f422
            return r0
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
            r1 = this;
            char r0 = r1.f421
            return r0
    }

    @Override // Yue.InterfaceMenuItemC6061, android.view.MenuItem
    public java.lang.CharSequence getContentDescription() {
            r1 = this;
            java.lang.CharSequence r0 = r1.f426
            return r0
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
            r1 = this;
            int r0 = r1.f414
            return r0
    }

    @Override // android.view.MenuItem
    public android.graphics.drawable.Drawable getIcon() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f423
            return r0
    }

    @Override // Yue.InterfaceMenuItemC6061, android.view.MenuItem
    public android.content.res.ColorStateList getIconTintList() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.f428
            return r0
    }

    @Override // Yue.InterfaceMenuItemC6061, android.view.MenuItem
    public android.graphics.PorterDuff.Mode getIconTintMode() {
            r1 = this;
            android.graphics.PorterDuff$Mode r0 = r1.f429
            return r0
    }

    @Override // android.view.MenuItem
    public android.content.Intent getIntent() {
            r1 = this;
            android.content.Intent r0 = r1.f418
            return r0
    }

    @Override // android.view.MenuItem
    public int getItemId() {
            r1 = this;
            int r0 = r1.f413
            return r0
    }

    @Override // android.view.MenuItem
    public android.view.ContextMenu.ContextMenuInfo getMenuInfo() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // Yue.InterfaceMenuItemC6061, android.view.MenuItem
    public int getNumericModifiers() {
            r1 = this;
            int r0 = r1.f420
            return r0
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
            r1 = this;
            char r0 = r1.f419
            return r0
    }

    @Override // android.view.MenuItem
    public int getOrder() {
            r1 = this;
            int r0 = r1.f415
            return r0
    }

    @Override // android.view.MenuItem
    public android.view.SubMenu getSubMenu() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // android.view.MenuItem
    public java.lang.CharSequence getTitle() {
            r1 = this;
            java.lang.CharSequence r0 = r1.f416
            return r0
    }

    @Override // android.view.MenuItem
    public java.lang.CharSequence getTitleCondensed() {
            r1 = this;
            java.lang.CharSequence r0 = r1.f417
            if (r0 == 0) goto L5
            goto L7
        L5:
            java.lang.CharSequence r0 = r1.f416
        L7:
            return r0
    }

    @Override // Yue.InterfaceMenuItemC6061, android.view.MenuItem
    public java.lang.CharSequence getTooltipText() {
            r1 = this;
            java.lang.CharSequence r0 = r1.f427
            return r0
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // Yue.InterfaceMenuItemC6061, android.view.MenuItem
    public boolean isActionViewExpanded() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
            r2 = this;
            int r0 = r2.f432
            r1 = 1
            r0 = r0 & r1
            if (r0 == 0) goto L7
            goto L8
        L7:
            r1 = 0
        L8:
            return r1
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
            r1 = this;
            int r0 = r1.f432
            r0 = r0 & 2
            if (r0 == 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
            r1 = this;
            int r0 = r1.f432
            r0 = r0 & 16
            if (r0 == 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
            r1 = this;
            int r0 = r1.f432
            r0 = r0 & 8
            if (r0 != 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setActionProvider(android.view.ActionProvider r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // Yue.InterfaceMenuItemC6061, android.view.MenuItem
    @Yue.InterfaceC4410
    public /* bridge */ /* synthetic */ android.view.MenuItem setActionView(int r1) {
            r0 = this;
            Yue.ۥۢ۠ۥۣ r1 = r0.m997(r1)
            return r1
    }

    @Override // Yue.InterfaceMenuItemC6061, android.view.MenuItem
    @Yue.InterfaceC4410
    public /* bridge */ /* synthetic */ android.view.MenuItem setActionView(android.view.View r1) {
            r0 = this;
            Yue.ۥۢ۠ۥۣ r1 = r0.m998(r1)
            return r1
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setAlphabeticShortcut(char r1) {
            r0 = this;
            char r1 = java.lang.Character.toLowerCase(r1)
            r0.f421 = r1
            return r0
    }

    @Override // Yue.InterfaceMenuItemC6061, android.view.MenuItem
    @Yue.InterfaceC4410
    public android.view.MenuItem setAlphabeticShortcut(char r1, int r2) {
            r0 = this;
            char r1 = java.lang.Character.toLowerCase(r1)
            r0.f421 = r1
            int r1 = android.view.KeyEvent.normalizeMetaState(r2)
            r0.f422 = r1
            return r0
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setCheckable(boolean r2) {
            r1 = this;
            int r0 = r1.f432
            r0 = r0 & (-2)
            r2 = r2 | r0
            r1.f432 = r2
            return r1
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setChecked(boolean r2) {
            r1 = this;
            int r0 = r1.f432
            r0 = r0 & (-3)
            if (r2 == 0) goto L8
            r2 = 2
            goto L9
        L8:
            r2 = 0
        L9:
            r2 = r2 | r0
            r1.f432 = r2
            return r1
    }

    @Override // Yue.InterfaceMenuItemC6061, android.view.MenuItem
    @Yue.InterfaceC4410
    public Yue.InterfaceMenuItemC6061 setContentDescription(java.lang.CharSequence r1) {
            r0 = this;
            r0.f426 = r1
            return r0
    }

    @Override // Yue.InterfaceMenuItemC6061, android.view.MenuItem
    @Yue.InterfaceC4410
    public /* bridge */ /* synthetic */ android.view.MenuItem setContentDescription(java.lang.CharSequence r1) {
            r0 = this;
            Yue.ۥۢ۠ۥۣ r1 = r0.setContentDescription(r1)
            return r1
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setEnabled(boolean r2) {
            r1 = this;
            int r0 = r1.f432
            r0 = r0 & (-17)
            if (r2 == 0) goto L9
            r2 = 16
            goto La
        L9:
            r2 = 0
        La:
            r2 = r2 | r0
            r1.f432 = r2
            return r1
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setIcon(int r2) {
            r1 = this;
            android.content.Context r0 = r1.f424
            android.graphics.drawable.Drawable r2 = Yue.C1584.m7766(r0, r2)
            r1.f423 = r2
            r1.m995()
            return r1
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setIcon(android.graphics.drawable.Drawable r1) {
            r0 = this;
            r0.f423 = r1
            r0.m995()
            return r0
    }

    @Override // Yue.InterfaceMenuItemC6061, android.view.MenuItem
    @Yue.InterfaceC4410
    public android.view.MenuItem setIconTintList(@Yue.InterfaceC4544 android.content.res.ColorStateList r1) {
            r0 = this;
            r0.f428 = r1
            r1 = 1
            r0.f430 = r1
            r0.m995()
            return r0
    }

    @Override // Yue.InterfaceMenuItemC6061, android.view.MenuItem
    @Yue.InterfaceC4410
    public android.view.MenuItem setIconTintMode(android.graphics.PorterDuff.Mode r1) {
            r0 = this;
            r0.f429 = r1
            r1 = 1
            r0.f431 = r1
            r0.m995()
            return r0
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setIntent(android.content.Intent r1) {
            r0 = this;
            r0.f418 = r1
            return r0
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setNumericShortcut(char r1) {
            r0 = this;
            r0.f419 = r1
            return r0
    }

    @Override // Yue.InterfaceMenuItemC6061, android.view.MenuItem
    @Yue.InterfaceC4410
    public android.view.MenuItem setNumericShortcut(char r1, int r2) {
            r0 = this;
            r0.f419 = r1
            int r1 = android.view.KeyEvent.normalizeMetaState(r2)
            r0.f420 = r1
            return r0
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setOnActionExpandListener(android.view.MenuItem.OnActionExpandListener r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setOnMenuItemClickListener(android.view.MenuItem.OnMenuItemClickListener r1) {
            r0 = this;
            r0.f425 = r1
            return r0
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setShortcut(char r1, char r2) {
            r0 = this;
            r0.f419 = r1
            char r1 = java.lang.Character.toLowerCase(r2)
            r0.f421 = r1
            return r0
    }

    @Override // Yue.InterfaceMenuItemC6061, android.view.MenuItem
    @Yue.InterfaceC4410
    public android.view.MenuItem setShortcut(char r1, char r2, int r3, int r4) {
            r0 = this;
            r0.f419 = r1
            int r1 = android.view.KeyEvent.normalizeMetaState(r3)
            r0.f420 = r1
            char r1 = java.lang.Character.toLowerCase(r2)
            r0.f421 = r1
            int r1 = android.view.KeyEvent.normalizeMetaState(r4)
            r0.f422 = r1
            return r0
    }

    @Override // Yue.InterfaceMenuItemC6061, android.view.MenuItem
    public void setShowAsAction(int r1) {
            r0 = this;
            return
    }

    @Override // Yue.InterfaceMenuItemC6061, android.view.MenuItem
    @Yue.InterfaceC4410
    public /* bridge */ /* synthetic */ android.view.MenuItem setShowAsActionFlags(int r1) {
            r0 = this;
            Yue.ۥۢ۠ۥۣ r1 = r0.m1000(r1)
            return r1
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setTitle(int r2) {
            r1 = this;
            android.content.Context r0 = r1.f424
            android.content.res.Resources r0 = r0.getResources()
            java.lang.String r2 = r0.getString(r2)
            r1.f416 = r2
            return r1
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setTitle(java.lang.CharSequence r1) {
            r0 = this;
            r0.f416 = r1
            return r0
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setTitleCondensed(java.lang.CharSequence r1) {
            r0 = this;
            r0.f417 = r1
            return r0
    }

    @Override // Yue.InterfaceMenuItemC6061, android.view.MenuItem
    @Yue.InterfaceC4410
    public Yue.InterfaceMenuItemC6061 setTooltipText(java.lang.CharSequence r1) {
            r0 = this;
            r0.f427 = r1
            return r0
    }

    @Override // Yue.InterfaceMenuItemC6061, android.view.MenuItem
    @Yue.InterfaceC4410
    public /* bridge */ /* synthetic */ android.view.MenuItem setTooltipText(java.lang.CharSequence r1) {
            r0 = this;
            Yue.ۥۢ۠ۥۣ r1 = r0.setTooltipText(r1)
            return r1
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setVisible(boolean r3) {
            r2 = this;
            int r0 = r2.f432
            r1 = 8
            r0 = r0 & r1
            if (r3 == 0) goto L8
            r1 = 0
        L8:
            r3 = r0 | r1
            r2.f432 = r3
            return r2
    }

    @Override // Yue.InterfaceMenuItemC6061
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public Yue.AbstractC0183 mo991() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // Yue.InterfaceMenuItemC6061
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public boolean mo992() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // Yue.InterfaceMenuItemC6061
    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public Yue.InterfaceMenuItemC6061 mo993(Yue.AbstractC0183 r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // Yue.InterfaceMenuItemC6061
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public boolean mo994() {
            r1 = this;
            r0 = 1
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final void m995() {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.f423
            if (r0 == 0) goto L2c
            boolean r1 = r2.f430
            if (r1 != 0) goto Lc
            boolean r1 = r2.f431
            if (r1 == 0) goto L2c
        Lc:
            android.graphics.drawable.Drawable r0 = Yue.C1995.m9235(r0)
            r2.f423 = r0
            android.graphics.drawable.Drawable r0 = r0.mutate()
            r2.f423 = r0
            boolean r1 = r2.f430
            if (r1 == 0) goto L21
            android.content.res.ColorStateList r1 = r2.f428
            Yue.C1995.m9232(r0, r1)
        L21:
            boolean r0 = r2.f431
            if (r0 == 0) goto L2c
            android.graphics.drawable.Drawable r0 = r2.f423
            android.graphics.PorterDuff$Mode r1 = r2.f429
            Yue.C1995.m9233(r0, r1)
        L2c:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public boolean m996() {
            r3 = this;
            android.view.MenuItem$OnMenuItemClickListener r0 = r3.f425
            r1 = 1
            if (r0 == 0) goto Lc
            boolean r0 = r0.onMenuItemClick(r3)
            if (r0 == 0) goto Lc
            return r1
        Lc:
            android.content.Intent r0 = r3.f418
            if (r0 == 0) goto L16
            android.content.Context r2 = r3.f424
            r2.startActivity(r0)
            return r1
        L16:
            r0 = 0
            return r0
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public Yue.InterfaceMenuItemC6061 m997(int r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public Yue.InterfaceMenuItemC6061 m998(android.view.View r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public Yue.C0180 m999(boolean r2) {
            r1 = this;
            int r0 = r1.f432
            r0 = r0 & (-5)
            if (r2 == 0) goto L8
            r2 = 4
            goto L9
        L8:
            r2 = 0
        L9:
            r2 = r2 | r0
            r1.f432 = r2
            return r1
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public Yue.InterfaceMenuItemC6061 m1000(int r1) {
            r0 = this;
            r0.setShowAsAction(r1)
            return r0
    }
}
