package defpackage;

/* JADX INFO: renamed from: ᛲᛲᛶᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0254 implements defpackage.InterfaceMenuItemC0997 {

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public java.lang.CharSequence f1479;

    /* JADX INFO: renamed from: ᛲᛲᛵ, reason: contains not printable characters */
    public int f1480;

    /* JADX INFO: renamed from: ᛲᛲᛸᲈ, reason: contains not printable characters */
    public boolean f1481;

    /* JADX INFO: renamed from: ᛲᛴᛱᛶ, reason: contains not printable characters */
    public char f1482;

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public android.content.Intent f1483;

    /* JADX INFO: renamed from: ᛲᲈᛷᛵ, reason: contains not printable characters */
    public android.content.res.ColorStateList f1484;

    /* JADX INFO: renamed from: ᛳᲁᲈᲁ, reason: contains not printable characters */
    public java.lang.CharSequence f1485;

    /* JADX INFO: renamed from: ᛴᛸᲀ, reason: contains not printable characters */
    public int f1486;

    /* JADX INFO: renamed from: ᛴᛸᲈᲈ, reason: contains not printable characters */
    public java.lang.CharSequence f1487;

    /* JADX INFO: renamed from: ᛴᲀᲁᛴ, reason: contains not printable characters */
    public android.view.View f1488;

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final int f1489;

    /* JADX INFO: renamed from: ᛶᛳᲀᲈ, reason: contains not printable characters */
    public defpackage.ActionProviderVisibilityListenerC0803 f1490;

    /* JADX INFO: renamed from: ᛶᛷᛱᲀ, reason: contains not printable characters */
    public int f1491;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final int f1492;

    /* JADX INFO: renamed from: ᛷᛷᲀᛴ, reason: contains not printable characters */
    public android.graphics.PorterDuff.Mode f1493;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final int f1494;

    /* JADX INFO: renamed from: ᛸᛵᛸᛷ, reason: contains not printable characters */
    public char f1495;

    /* JADX INFO: renamed from: ᲀᛳᲀᛵ, reason: contains not printable characters */
    public android.graphics.drawable.Drawable f1496;

    /* JADX INFO: renamed from: ᲀᲀᛴᛳ, reason: contains not printable characters */
    public boolean f1497;

    /* JADX INFO: renamed from: ᲁᛱᛲᲈ, reason: contains not printable characters */
    public android.view.MenuItem.OnActionExpandListener f1498;

    /* JADX INFO: renamed from: ᲁᛴᛵᛲ, reason: contains not printable characters */
    public boolean f1499;

    /* JADX INFO: renamed from: ᲁᲈᛳ, reason: contains not printable characters */
    public int f1500;

    /* JADX INFO: renamed from: ᲁᲈᲇᲁ, reason: contains not printable characters */
    public defpackage.SubMenuC1502 f1501;

    /* JADX INFO: renamed from: ᲇᛱᛸᲇ, reason: contains not printable characters */
    public android.view.MenuItem.OnMenuItemClickListener f1502;

    /* JADX INFO: renamed from: ᲇᛳᛴᲈ, reason: contains not printable characters */
    public int f1503;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public final int f1504;

    /* JADX INFO: renamed from: ᲇᲀᛲᛱ, reason: contains not printable characters */
    public final defpackage.MenuC1701 f1505;

    /* JADX INFO: renamed from: ᲈᛵᲀᛱ, reason: contains not printable characters */
    public boolean f1506;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public java.lang.CharSequence f1507;

    public C0254(defpackage.MenuC1701 r3, int r4, int r5, int r6, int r7, java.lang.CharSequence r8, int r9) {
            r2 = this;
            r2.<init>()
            r0 = 4096(0x1000, float:5.74E-42)
            r2.f1480 = r0
            r2.f1491 = r0
            r0 = 0
            r2.f1486 = r0
            r1 = 0
            r2.f1484 = r1
            r2.f1493 = r1
            r2.f1497 = r0
            r2.f1499 = r0
            r2.f1506 = r0
            r1 = 16
            r2.f1503 = r1
            r2.f1481 = r0
            r2.f1505 = r3
            r2.f1494 = r5
            r2.f1492 = r4
            r2.f1489 = r6
            r2.f1504 = r7
            r2.f1507 = r8
            r2.f1500 = r9
            return
    }

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public static void m878(java.lang.StringBuilder r0, int r1, int r2, java.lang.String r3) {
            r1 = r1 & r2
            if (r1 != r2) goto L6
            r0.append(r3)
        L6:
            return
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
            r1 = this;
            int r0 = r1.f1500
            r0 = r0 & 8
            if (r0 != 0) goto L7
            goto L18
        L7:
            android.view.View r0 = r1.f1488
            if (r0 != 0) goto Ld
            r1 = 1
            return r1
        Ld:
            android.view.MenuItem$OnActionExpandListener r0 = r1.f1498
            if (r0 == 0) goto L1a
            boolean r0 = r0.onMenuItemActionCollapse(r1)
            if (r0 == 0) goto L18
            goto L1a
        L18:
            r1 = 0
            return r1
        L1a:
            ᲀᛷᛱᲇ r0 = r1.f1505
            boolean r1 = r0.mo2720(r1)
            return r1
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
            r1 = this;
            boolean r0 = r1.m879()
            if (r0 != 0) goto L7
            goto L12
        L7:
            android.view.MenuItem$OnActionExpandListener r0 = r1.f1498
            if (r0 == 0) goto L14
            boolean r0 = r0.onMenuItemActionExpand(r1)
            if (r0 == 0) goto L12
            goto L14
        L12:
            r1 = 0
            return r1
        L14:
            ᲀᛷᛱᲇ r0 = r1.f1505
            boolean r1 = r0.mo2723(r1)
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
            android.view.View r0 = r1.f1488
            if (r0 == 0) goto L5
            return r0
        L5:
            ᛴᲈᲇᲀ r0 = r1.f1490
            if (r0 == 0) goto L12
            android.view.ActionProvider r0 = r0.f3711
            android.view.View r0 = r0.onCreateActionView(r1)
            r1.f1488 = r0
            return r0
        L12:
            r1 = 0
            return r1
    }

    @Override // defpackage.InterfaceMenuItemC0997, android.view.MenuItem
    public final int getAlphabeticModifiers() {
            r0 = this;
            int r0 = r0.f1491
            return r0
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
            r0 = this;
            char r0 = r0.f1482
            return r0
    }

    @Override // defpackage.InterfaceMenuItemC0997, android.view.MenuItem
    public final java.lang.CharSequence getContentDescription() {
            r0 = this;
            java.lang.CharSequence r0 = r0.f1487
            return r0
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
            r0 = this;
            int r0 = r0.f1492
            return r0
    }

    @Override // android.view.MenuItem
    public final android.graphics.drawable.Drawable getIcon() {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.f1496
            if (r0 == 0) goto L9
            android.graphics.drawable.Drawable r2 = r2.m880(r0)
            return r2
        L9:
            int r0 = r2.f1486
            if (r0 == 0) goto L1f
            ᲀᛷᛱᲇ r1 = r2.f1505
            android.content.Context r1 = r1.f7572
            android.graphics.drawable.Drawable r0 = defpackage.AbstractC1592.m2873(r1, r0)
            r1 = 0
            r2.f1486 = r1
            r2.f1496 = r0
            android.graphics.drawable.Drawable r2 = r2.m880(r0)
            return r2
        L1f:
            r2 = 0
            return r2
    }

    @Override // defpackage.InterfaceMenuItemC0997, android.view.MenuItem
    public final android.content.res.ColorStateList getIconTintList() {
            r0 = this;
            android.content.res.ColorStateList r0 = r0.f1484
            return r0
    }

    @Override // defpackage.InterfaceMenuItemC0997, android.view.MenuItem
    public final android.graphics.PorterDuff.Mode getIconTintMode() {
            r0 = this;
            android.graphics.PorterDuff$Mode r0 = r0.f1493
            return r0
    }

    @Override // android.view.MenuItem
    public final android.content.Intent getIntent() {
            r0 = this;
            android.content.Intent r0 = r0.f1483
            return r0
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
            r0 = this;
            int r0 = r0.f1494
            return r0
    }

    @Override // android.view.MenuItem
    public final android.view.ContextMenu.ContextMenuInfo getMenuInfo() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // defpackage.InterfaceMenuItemC0997, android.view.MenuItem
    public final int getNumericModifiers() {
            r0 = this;
            int r0 = r0.f1480
            return r0
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
            r0 = this;
            char r0 = r0.f1495
            return r0
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
            r0 = this;
            int r0 = r0.f1489
            return r0
    }

    @Override // android.view.MenuItem
    public final android.view.SubMenu getSubMenu() {
            r0 = this;
            ᛸᛶᛳᛴ r0 = r0.f1501
            return r0
    }

    @Override // android.view.MenuItem
    public final java.lang.CharSequence getTitle() {
            r0 = this;
            java.lang.CharSequence r0 = r0.f1507
            return r0
    }

    @Override // android.view.MenuItem
    public final java.lang.CharSequence getTitleCondensed() {
            r1 = this;
            java.lang.CharSequence r0 = r1.f1479
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.CharSequence r1 = r1.f1507
            return r1
    }

    @Override // defpackage.InterfaceMenuItemC0997, android.view.MenuItem
    public final java.lang.CharSequence getTooltipText() {
            r0 = this;
            java.lang.CharSequence r0 = r0.f1485
            return r0
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
            r0 = this;
            ᛸᛶᛳᛴ r0 = r0.f1501
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
            boolean r0 = r0.f1481
            return r0
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
            r1 = this;
            int r1 = r1.f1503
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
            int r1 = r1.f1503
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
            int r0 = r0.f1503
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
            ᛴᲈᲇᲀ r0 = r3.f1490
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L20
            android.view.ActionProvider r0 = r0.f3711
            boolean r0 = r0.overridesItemVisibility()
            if (r0 == 0) goto L20
            int r0 = r3.f1503
            r0 = r0 & 8
            if (r0 != 0) goto L1f
            ᛴᲈᲇᲀ r3 = r3.f1490
            android.view.ActionProvider r3 = r3.f3711
            boolean r3 = r3.isVisible()
            if (r3 == 0) goto L1f
            return r2
        L1f:
            return r1
        L20:
            int r3 = r3.f1503
            r3 = r3 & 8
            if (r3 != 0) goto L27
            return r2
        L27:
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
            ᲀᛷᛱᲇ r0 = r4.f1505
            android.content.Context r1 = r0.f7572
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r1)
            android.widget.LinearLayout r3 = new android.widget.LinearLayout
            r3.<init>(r1)
            r1 = 0
            android.view.View r5 = r2.inflate(r5, r3, r1)
            r4.f1488 = r5
            r1 = 0
            r4.f1490 = r1
            if (r5 == 0) goto L27
            int r1 = r5.getId()
            r2 = -1
            if (r1 != r2) goto L27
            int r1 = r4.f1494
            if (r1 <= 0) goto L27
            r5.setId(r1)
        L27:
            r5 = 1
            r0.f7569 = r5
            r0.m3088(r5)
            return r4
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setActionView(android.view.View r3) {
            r2 = this;
            r2.f1488 = r3
            r0 = 0
            r2.f1490 = r0
            if (r3 == 0) goto L15
            int r0 = r3.getId()
            r1 = -1
            if (r0 != r1) goto L15
            int r0 = r2.f1494
            if (r0 <= 0) goto L15
            r3.setId(r0)
        L15:
            ᲀᛷᛱᲇ r3 = r2.f1505
            r0 = 1
            r3.f7569 = r0
            r3.m3088(r0)
            return r2
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setAlphabeticShortcut(char r2) {
            r1 = this;
            char r0 = r1.f1482
            if (r0 != r2) goto L5
            return r1
        L5:
            char r2 = java.lang.Character.toLowerCase(r2)
            r1.f1482 = r2
            ᲀᛷᛱᲇ r2 = r1.f1505
            r0 = 0
            r2.m3088(r0)
            return r1
    }

    @Override // defpackage.InterfaceMenuItemC0997, android.view.MenuItem
    public final android.view.MenuItem setAlphabeticShortcut(char r2, int r3) {
            r1 = this;
            char r0 = r1.f1482
            if (r0 != r2) goto L9
            int r0 = r1.f1491
            if (r0 != r3) goto L9
            return r1
        L9:
            char r2 = java.lang.Character.toLowerCase(r2)
            r1.f1482 = r2
            int r2 = android.view.KeyEvent.normalizeMetaState(r3)
            r1.f1491 = r2
            ᲀᛷᛱᲇ r2 = r1.f1505
            r3 = 0
            r2.m3088(r3)
            return r1
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setCheckable(boolean r3) {
            r2 = this;
            int r0 = r2.f1503
            r1 = r0 & (-2)
            r3 = r3 | r1
            r2.f1503 = r3
            if (r0 == r3) goto Lf
            ᲀᛷᛱᲇ r3 = r2.f1505
            r0 = 0
            r3.m3088(r0)
        Lf:
            return r2
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setChecked(boolean r10) {
            r9 = this;
            int r0 = r9.f1503
            r1 = r0 & 4
            r2 = 2
            ᲀᛷᛱᲇ r3 = r9.f1505
            r4 = 0
            if (r1 == 0) goto L4e
            java.util.ArrayList r10 = r3.f7560
            int r0 = r10.size()
            r3.m3084()
            r1 = r4
        L14:
            if (r1 >= r0) goto L4a
            java.lang.Object r5 = r10.get(r1)
            ᛲᛲᛶᲁ r5 = (defpackage.C0254) r5
            int r6 = r5.f1492
            int r7 = r9.f1492
            if (r6 != r7) goto L47
            int r6 = r5.f1503
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
            int r7 = r5.f1503
            r8 = r7 & (-3)
            if (r6 == 0) goto L3c
            r6 = r2
            goto L3d
        L3c:
            r6 = r4
        L3d:
            r6 = r6 | r8
            r5.f1503 = r6
            if (r7 == r6) goto L47
            ᲀᛷᛱᲇ r5 = r5.f1505
            r5.m3088(r4)
        L47:
            int r1 = r1 + 1
            goto L14
        L4a:
            r3.m3081()
            return r9
        L4e:
            r1 = r0 & (-3)
            if (r10 == 0) goto L53
            goto L54
        L53:
            r2 = r4
        L54:
            r10 = r1 | r2
            r9.f1503 = r10
            if (r0 == r10) goto L5d
            r3.m3088(r4)
        L5d:
            return r9
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ android.view.MenuItem setContentDescription(java.lang.CharSequence r1) {
            r0 = this;
            r0.setContentDescription(r1)
            return r0
    }

    @Override // defpackage.InterfaceMenuItemC0997, android.view.MenuItem
    public final defpackage.InterfaceMenuItemC0997 setContentDescription(java.lang.CharSequence r2) {
            r1 = this;
            r1.f1487 = r2
            ᲀᛷᛱᲇ r2 = r1.f1505
            r0 = 0
            r2.m3088(r0)
            return r1
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setEnabled(boolean r2) {
            r1 = this;
            int r0 = r1.f1503
            if (r2 == 0) goto L9
            r2 = r0 | 16
            r1.f1503 = r2
            goto Ld
        L9:
            r2 = r0 & (-17)
            r1.f1503 = r2
        Ld:
            ᲀᛷᛱᲇ r2 = r1.f1505
            r0 = 0
            r2.m3088(r0)
            return r1
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setIcon(int r2) {
            r1 = this;
            r0 = 0
            r1.f1496 = r0
            r1.f1486 = r2
            r2 = 1
            r1.f1506 = r2
            ᲀᛷᛱᲇ r2 = r1.f1505
            r0 = 0
            r2.m3088(r0)
            return r1
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setIcon(android.graphics.drawable.Drawable r2) {
            r1 = this;
            r0 = 0
            r1.f1486 = r0
            r1.f1496 = r2
            r2 = 1
            r1.f1506 = r2
            ᲀᛷᛱᲇ r2 = r1.f1505
            r2.m3088(r0)
            return r1
    }

    @Override // defpackage.InterfaceMenuItemC0997, android.view.MenuItem
    public final android.view.MenuItem setIconTintList(android.content.res.ColorStateList r2) {
            r1 = this;
            r1.f1484 = r2
            r2 = 1
            r1.f1497 = r2
            r1.f1506 = r2
            ᲀᛷᛱᲇ r2 = r1.f1505
            r0 = 0
            r2.m3088(r0)
            return r1
    }

    @Override // defpackage.InterfaceMenuItemC0997, android.view.MenuItem
    public final android.view.MenuItem setIconTintMode(android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            r1.f1493 = r2
            r2 = 1
            r1.f1499 = r2
            r1.f1506 = r2
            ᲀᛷᛱᲇ r2 = r1.f1505
            r0 = 0
            r2.m3088(r0)
            return r1
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setIntent(android.content.Intent r1) {
            r0 = this;
            r0.f1483 = r1
            return r0
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setNumericShortcut(char r2) {
            r1 = this;
            char r0 = r1.f1495
            if (r0 != r2) goto L5
            return r1
        L5:
            r1.f1495 = r2
            ᲀᛷᛱᲇ r2 = r1.f1505
            r0 = 0
            r2.m3088(r0)
            return r1
    }

    @Override // defpackage.InterfaceMenuItemC0997, android.view.MenuItem
    public final android.view.MenuItem setNumericShortcut(char r2, int r3) {
            r1 = this;
            char r0 = r1.f1495
            if (r0 != r2) goto L9
            int r0 = r1.f1480
            if (r0 != r3) goto L9
            return r1
        L9:
            r1.f1495 = r2
            int r2 = android.view.KeyEvent.normalizeMetaState(r3)
            r1.f1480 = r2
            ᲀᛷᛱᲇ r2 = r1.f1505
            r3 = 0
            r2.m3088(r3)
            return r1
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setOnActionExpandListener(android.view.MenuItem.OnActionExpandListener r1) {
            r0 = this;
            r0.f1498 = r1
            return r0
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setOnMenuItemClickListener(android.view.MenuItem.OnMenuItemClickListener r1) {
            r0 = this;
            r0.f1502 = r1
            return r0
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setShortcut(char r1, char r2) {
            r0 = this;
            r0.f1495 = r1
            char r1 = java.lang.Character.toLowerCase(r2)
            r0.f1482 = r1
            ᲀᛷᛱᲇ r1 = r0.f1505
            r2 = 0
            r1.m3088(r2)
            return r0
    }

    @Override // defpackage.InterfaceMenuItemC0997, android.view.MenuItem
    public final android.view.MenuItem setShortcut(char r1, char r2, int r3, int r4) {
            r0 = this;
            r0.f1495 = r1
            int r1 = android.view.KeyEvent.normalizeMetaState(r3)
            r0.f1480 = r1
            char r1 = java.lang.Character.toLowerCase(r2)
            r0.f1482 = r1
            int r1 = android.view.KeyEvent.normalizeMetaState(r4)
            r0.f1491 = r1
            ᲀᛷᛱᲇ r1 = r0.f1505
            r2 = 0
            r1.m3088(r2)
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
            defpackage.C2264.m3684(r3)
            return
        L11:
            r3.f1500 = r4
            ᲀᛷᛱᲇ r3 = r3.f1505
            r3.f7569 = r1
            r3.m3088(r1)
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
            ᲀᛷᛱᲇ r0 = r1.f1505
            android.content.Context r0 = r0.f7572
            java.lang.String r2 = r0.getString(r2)
            r1.setTitle(r2)
            return r1
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setTitle(java.lang.CharSequence r3) {
            r2 = this;
            r2.f1507 = r3
            ᲀᛷᛱᲇ r0 = r2.f1505
            r1 = 0
            r0.m3088(r1)
            ᛸᛶᛳᛴ r0 = r2.f1501
            if (r0 == 0) goto Lf
            r0.setHeaderTitle(r3)
        Lf:
            return r2
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setTitleCondensed(java.lang.CharSequence r2) {
            r1 = this;
            r1.f1479 = r2
            ᲀᛷᛱᲇ r2 = r1.f1505
            r0 = 0
            r2.m3088(r0)
            return r1
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ android.view.MenuItem setTooltipText(java.lang.CharSequence r1) {
            r0 = this;
            r0.setTooltipText(r1)
            return r0
    }

    @Override // defpackage.InterfaceMenuItemC0997, android.view.MenuItem
    public final defpackage.InterfaceMenuItemC0997 setTooltipText(java.lang.CharSequence r2) {
            r1 = this;
            r1.f1485 = r2
            ᲀᛷᛱᲇ r2 = r1.f1505
            r0 = 0
            r2.m3088(r0)
            return r1
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setVisible(boolean r3) {
            r2 = this;
            int r0 = r2.f1503
            r1 = r0 & (-9)
            if (r3 == 0) goto L8
            r3 = 0
            goto La
        L8:
            r3 = 8
        La:
            r3 = r3 | r1
            r2.f1503 = r3
            if (r0 == r3) goto L17
            ᲀᛷᛱᲇ r3 = r2.f1505
            r0 = 1
            r3.f7573 = r0
            r3.m3088(r0)
        L17:
            return r2
    }

    public final java.lang.String toString() {
            r0 = this;
            java.lang.CharSequence r0 = r0.f1507
            if (r0 == 0) goto L9
            java.lang.String r0 = r0.toString()
            return r0
        L9:
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final boolean m879() {
            r3 = this;
            int r0 = r3.f1500
            r0 = r0 & 8
            r1 = 0
            if (r0 == 0) goto L1b
            android.view.View r0 = r3.f1488
            if (r0 != 0) goto L17
            ᛴᲈᲇᲀ r2 = r3.f1490
            if (r2 == 0) goto L17
            android.view.ActionProvider r0 = r2.f3711
            android.view.View r0 = r0.onCreateActionView(r3)
            r3.f1488 = r0
        L17:
            if (r0 == 0) goto L1b
            r3 = 1
            return r3
        L1b:
            return r1
    }

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final android.graphics.drawable.Drawable m880(android.graphics.drawable.Drawable r2) {
            r1 = this;
            if (r2 == 0) goto L27
            boolean r0 = r1.f1506
            if (r0 == 0) goto L27
            boolean r0 = r1.f1497
            if (r0 != 0) goto Le
            boolean r0 = r1.f1499
            if (r0 == 0) goto L27
        Le:
            android.graphics.drawable.Drawable r2 = r2.mutate()
            boolean r0 = r1.f1497
            if (r0 == 0) goto L1b
            android.content.res.ColorStateList r0 = r1.f1484
            r2.setTintList(r0)
        L1b:
            boolean r0 = r1.f1499
            if (r0 == 0) goto L24
            android.graphics.PorterDuff$Mode r0 = r1.f1493
            r2.setTintMode(r0)
        L24:
            r0 = 0
            r1.f1506 = r0
        L27:
            return r2
    }

    @Override // defpackage.InterfaceMenuItemC0997
    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final defpackage.InterfaceMenuItemC0997 mo881(defpackage.ActionProviderVisibilityListenerC0803 r2) {
            r1 = this;
            r0 = 0
            r1.f1488 = r0
            r1.f1490 = r2
            ᲀᛷᛱᲇ r2 = r1.f1505
            r0 = 1
            r2.m3088(r0)
            ᛴᲈᲇᲀ r2 = r1.f1490
            if (r2 == 0) goto L1b
            ᛶᲈᛱᲈ r0 = new ᛶᲈᛱᲈ
            r0.<init>(r1)
            r2.f3712 = r0
            android.view.ActionProvider r0 = r2.f3711
            r0.setVisibilityListener(r2)
        L1b:
            return r1
    }

    @Override // defpackage.InterfaceMenuItemC0997
    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final defpackage.ActionProviderVisibilityListenerC0803 mo882() {
            r0 = this;
            ᛴᲈᲇᲀ r0 = r0.f1490
            return r0
    }

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public final void m883(boolean r2) {
            r1 = this;
            int r0 = r1.f1503
            if (r2 == 0) goto L9
            r2 = r0 | 32
            r1.f1503 = r2
            return
        L9:
            r2 = r0 & (-33)
            r1.f1503 = r2
            return
    }
}
