package Yue;

/* JADX INFO: renamed from: Yue.ۥۡ۠ۦۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
public class MenuItemC4130 extends Yue.AbstractC0737 implements android.view.MenuItem {

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static final java.lang.String f12690 = "MenuItemWrapper";

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public final Yue.InterfaceMenuItemC6061 f12691;

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public java.lang.reflect.Method f12692;

    /* JADX INFO: renamed from: Yue.ۥۡ۠ۦۥ$ۥ, reason: contains not printable characters */
    public class ActionProviderVisibilityListenerC4131 extends Yue.AbstractC0183 implements android.view.ActionProvider.VisibilityListener {

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public Yue.AbstractC0183.InterfaceC0185 f12693;

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public final android.view.ActionProvider f12694;

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public final /* synthetic */ Yue.MenuItemC4130 f12695;

        public ActionProviderVisibilityListenerC4131(Yue.MenuItemC4130 r1, android.content.Context r2, android.view.ActionProvider r3) {
                r0 = this;
                r0.f12695 = r1
                r0.<init>(r2)
                r0.f12694 = r3
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
        public static /* synthetic */ android.view.ActionProvider m16209(Yue.MenuItemC4130.ActionProviderVisibilityListenerC4131 r0) {
                android.view.ActionProvider r0 = r0.f12694
                return r0
        }

        @Override // android.view.ActionProvider.VisibilityListener
        public void onActionProviderVisibilityChanged(boolean r2) {
                r1 = this;
                Yue.ۥ۟۟ۧ۠$ۥ۟ r0 = r1.f12693
                if (r0 == 0) goto L7
                r0.onActionProviderVisibilityChanged(r2)
            L7:
                return
        }

        @Override // Yue.AbstractC0183
        /* JADX INFO: renamed from: ۥ۟ */
        public boolean mo1024() {
                r1 = this;
                android.view.ActionProvider r0 = r1.f12694
                boolean r0 = r0.hasSubMenu()
                return r0
        }

        @Override // Yue.AbstractC0183
        /* JADX INFO: renamed from: ۥ۟۟ */
        public boolean mo1025() {
                r1 = this;
                android.view.ActionProvider r0 = r1.f12694
                boolean r0 = r0.isVisible()
                return r0
        }

        @Override // Yue.AbstractC0183
        @Yue.InterfaceC4410
        /* JADX INFO: renamed from: ۥ۟۟۟ */
        public android.view.View mo1026() {
                r1 = this;
                android.view.ActionProvider r0 = r1.f12694
                android.view.View r0 = r0.onCreateActionView()
                return r0
        }

        @Override // Yue.AbstractC0183
        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public android.view.View mo1027(android.view.MenuItem r2) {
                r1 = this;
                android.view.ActionProvider r0 = r1.f12694
                android.view.View r2 = r0.onCreateActionView(r2)
                return r2
        }

        @Override // Yue.AbstractC0183
        /* JADX INFO: renamed from: ۥ۟۟۟۠ */
        public boolean mo1028() {
                r1 = this;
                android.view.ActionProvider r0 = r1.f12694
                boolean r0 = r0.onPerformDefaultAction()
                return r0
        }

        @Override // Yue.AbstractC0183
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
        public void mo1029(android.view.SubMenu r3) {
                r2 = this;
                android.view.ActionProvider r0 = r2.f12694
                Yue.ۥۡ۠ۦۥ r1 = r2.f12695
                android.view.SubMenu r3 = r1.m4573(r3)
                r0.onPrepareSubMenu(r3)
                return
        }

        @Override // Yue.AbstractC0183
        /* JADX INFO: renamed from: ۥ۟۟۟ۢ */
        public boolean mo1030() {
                r1 = this;
                android.view.ActionProvider r0 = r1.f12694
                boolean r0 = r0.overridesItemVisibility()
                return r0
        }

        @Override // Yue.AbstractC0183
        /* JADX INFO: renamed from: ۥۣ۟۟۟ */
        public void mo1031() {
                r1 = this;
                android.view.ActionProvider r0 = r1.f12694
                r0.refreshVisibility()
                return
        }

        @Override // Yue.AbstractC0183
        /* JADX INFO: renamed from: ۥ۟۟۟ۦ */
        public void mo1034(Yue.AbstractC0183.InterfaceC0185 r2) {
                r1 = this;
                r1.f12693 = r2
                android.view.ActionProvider r0 = r1.f12694
                if (r2 == 0) goto L8
                r2 = r1
                goto L9
            L8:
                r2 = 0
            L9:
                r0.setVisibilityListener(r2)
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡ۠ۦۥ$ۥ۟, reason: contains not printable characters */
    public static class C4132 extends android.widget.FrameLayout implements Yue.InterfaceC1203 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final android.view.CollapsibleActionView f12696;

        public C4132(android.view.View r2) {
                r1 = this;
                android.content.Context r0 = r2.getContext()
                r1.<init>(r0)
                r0 = r2
                android.view.CollapsibleActionView r0 = (android.view.CollapsibleActionView) r0
                r1.f12696 = r0
                r1.addView(r2)
                return
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public android.view.View m16210() {
                r1 = this;
                android.view.CollapsibleActionView r0 = r1.f12696
                android.view.View r0 = (android.view.View) r0
                return r0
        }

        @Override // Yue.InterfaceC1203
        /* JADX INFO: renamed from: ۥ۟ */
        public void mo6173() {
                r1 = this;
                android.view.CollapsibleActionView r0 = r1.f12696
                r0.onActionViewExpanded()
                return
        }

        @Override // Yue.InterfaceC1203
        /* JADX INFO: renamed from: ۥ۟۟ */
        public void mo6174() {
                r1 = this;
                android.view.CollapsibleActionView r0 = r1.f12696
                r0.onActionViewCollapsed()
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡ۠ۦۥ$ۥ۟۟, reason: contains not printable characters */
    public class MenuItemOnActionExpandListenerC4133 implements android.view.MenuItem.OnActionExpandListener {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final android.view.MenuItem.OnActionExpandListener f12697;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final /* synthetic */ Yue.MenuItemC4130 f12698;

        public MenuItemOnActionExpandListenerC4133(Yue.MenuItemC4130 r1, android.view.MenuItem.OnActionExpandListener r2) {
                r0 = this;
                r0.f12698 = r1
                r0.<init>()
                r0.f12697 = r2
                return
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionCollapse(android.view.MenuItem r3) {
                r2 = this;
                android.view.MenuItem$OnActionExpandListener r0 = r2.f12697
                Yue.ۥۡ۠ۦۥ r1 = r2.f12698
                android.view.MenuItem r3 = r1.m4572(r3)
                boolean r3 = r0.onMenuItemActionCollapse(r3)
                return r3
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionExpand(android.view.MenuItem r3) {
                r2 = this;
                android.view.MenuItem$OnActionExpandListener r0 = r2.f12697
                Yue.ۥۡ۠ۦۥ r1 = r2.f12698
                android.view.MenuItem r3 = r1.m4572(r3)
                boolean r3 = r0.onMenuItemActionExpand(r3)
                return r3
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡ۠ۦۥ$ۥ۟۟۟, reason: contains not printable characters */
    public class MenuItemOnMenuItemClickListenerC4134 implements android.view.MenuItem.OnMenuItemClickListener {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final android.view.MenuItem.OnMenuItemClickListener f12699;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final /* synthetic */ Yue.MenuItemC4130 f12700;

        public MenuItemOnMenuItemClickListenerC4134(Yue.MenuItemC4130 r1, android.view.MenuItem.OnMenuItemClickListener r2) {
                r0 = this;
                r0.f12700 = r1
                r0.<init>()
                r0.f12699 = r2
                return
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(android.view.MenuItem r3) {
                r2 = this;
                android.view.MenuItem$OnMenuItemClickListener r0 = r2.f12699
                Yue.ۥۡ۠ۦۥ r1 = r2.f12700
                android.view.MenuItem r3 = r1.m4572(r3)
                boolean r3 = r0.onMenuItemClick(r3)
                return r3
        }
    }

    public MenuItemC4130(android.content.Context r1, Yue.InterfaceMenuItemC6061 r2) {
            r0 = this;
            r0.<init>(r1)
            if (r2 == 0) goto L8
            r0.f12691 = r2
            return
        L8:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Wrapped Object can not be null."
            r1.<init>(r2)
            throw r1
    }

    @Override // android.view.MenuItem
    public boolean collapseActionView() {
            r1 = this;
            Yue.ۥۢ۠ۥۣ r0 = r1.f12691
            boolean r0 = r0.collapseActionView()
            return r0
    }

    @Override // android.view.MenuItem
    public boolean expandActionView() {
            r1 = this;
            Yue.ۥۢ۠ۥۣ r0 = r1.f12691
            boolean r0 = r0.expandActionView()
            return r0
    }

    @Override // android.view.MenuItem
    public android.view.ActionProvider getActionProvider() {
            r2 = this;
            Yue.ۥۢ۠ۥۣ r0 = r2.f12691
            Yue.ۥ۟۟ۧ۠ r0 = r0.mo991()
            boolean r1 = r0 instanceof Yue.MenuItemC4130.ActionProviderVisibilityListenerC4131
            if (r1 == 0) goto L11
            Yue.ۥۡ۠ۦۥ$ۥ r0 = (Yue.MenuItemC4130.ActionProviderVisibilityListenerC4131) r0
            android.view.ActionProvider r0 = Yue.MenuItemC4130.ActionProviderVisibilityListenerC4131.m16209(r0)
            return r0
        L11:
            r0 = 0
            return r0
    }

    @Override // android.view.MenuItem
    public android.view.View getActionView() {
            r2 = this;
            Yue.ۥۢ۠ۥۣ r0 = r2.f12691
            android.view.View r0 = r0.getActionView()
            boolean r1 = r0 instanceof Yue.MenuItemC4130.C4132
            if (r1 == 0) goto L10
            Yue.ۥۡ۠ۦۥ$ۥ۟ r0 = (Yue.MenuItemC4130.C4132) r0
            android.view.View r0 = r0.m16210()
        L10:
            return r0
    }

    @Override // android.view.MenuItem
    public int getAlphabeticModifiers() {
            r1 = this;
            Yue.ۥۢ۠ۥۣ r0 = r1.f12691
            int r0 = r0.getAlphabeticModifiers()
            return r0
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
            r1 = this;
            Yue.ۥۢ۠ۥۣ r0 = r1.f12691
            char r0 = r0.getAlphabeticShortcut()
            return r0
    }

    @Override // android.view.MenuItem
    public java.lang.CharSequence getContentDescription() {
            r1 = this;
            Yue.ۥۢ۠ۥۣ r0 = r1.f12691
            java.lang.CharSequence r0 = r0.getContentDescription()
            return r0
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
            r1 = this;
            Yue.ۥۢ۠ۥۣ r0 = r1.f12691
            int r0 = r0.getGroupId()
            return r0
    }

    @Override // android.view.MenuItem
    public android.graphics.drawable.Drawable getIcon() {
            r1 = this;
            Yue.ۥۢ۠ۥۣ r0 = r1.f12691
            android.graphics.drawable.Drawable r0 = r0.getIcon()
            return r0
    }

    @Override // android.view.MenuItem
    public android.content.res.ColorStateList getIconTintList() {
            r1 = this;
            Yue.ۥۢ۠ۥۣ r0 = r1.f12691
            android.content.res.ColorStateList r0 = r0.getIconTintList()
            return r0
    }

    @Override // android.view.MenuItem
    public android.graphics.PorterDuff.Mode getIconTintMode() {
            r1 = this;
            Yue.ۥۢ۠ۥۣ r0 = r1.f12691
            android.graphics.PorterDuff$Mode r0 = r0.getIconTintMode()
            return r0
    }

    @Override // android.view.MenuItem
    public android.content.Intent getIntent() {
            r1 = this;
            Yue.ۥۢ۠ۥۣ r0 = r1.f12691
            android.content.Intent r0 = r0.getIntent()
            return r0
    }

    @Override // android.view.MenuItem
    public int getItemId() {
            r1 = this;
            Yue.ۥۢ۠ۥۣ r0 = r1.f12691
            int r0 = r0.getItemId()
            return r0
    }

    @Override // android.view.MenuItem
    public android.view.ContextMenu.ContextMenuInfo getMenuInfo() {
            r1 = this;
            Yue.ۥۢ۠ۥۣ r0 = r1.f12691
            android.view.ContextMenu$ContextMenuInfo r0 = r0.getMenuInfo()
            return r0
    }

    @Override // android.view.MenuItem
    public int getNumericModifiers() {
            r1 = this;
            Yue.ۥۢ۠ۥۣ r0 = r1.f12691
            int r0 = r0.getNumericModifiers()
            return r0
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
            r1 = this;
            Yue.ۥۢ۠ۥۣ r0 = r1.f12691
            char r0 = r0.getNumericShortcut()
            return r0
    }

    @Override // android.view.MenuItem
    public int getOrder() {
            r1 = this;
            Yue.ۥۢ۠ۥۣ r0 = r1.f12691
            int r0 = r0.getOrder()
            return r0
    }

    @Override // android.view.MenuItem
    public android.view.SubMenu getSubMenu() {
            r1 = this;
            Yue.ۥۢ۠ۥۣ r0 = r1.f12691
            android.view.SubMenu r0 = r0.getSubMenu()
            android.view.SubMenu r0 = r1.m4573(r0)
            return r0
    }

    @Override // android.view.MenuItem
    public java.lang.CharSequence getTitle() {
            r1 = this;
            Yue.ۥۢ۠ۥۣ r0 = r1.f12691
            java.lang.CharSequence r0 = r0.getTitle()
            return r0
    }

    @Override // android.view.MenuItem
    public java.lang.CharSequence getTitleCondensed() {
            r1 = this;
            Yue.ۥۢ۠ۥۣ r0 = r1.f12691
            java.lang.CharSequence r0 = r0.getTitleCondensed()
            return r0
    }

    @Override // android.view.MenuItem
    public java.lang.CharSequence getTooltipText() {
            r1 = this;
            Yue.ۥۢ۠ۥۣ r0 = r1.f12691
            java.lang.CharSequence r0 = r0.getTooltipText()
            return r0
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
            r1 = this;
            Yue.ۥۢ۠ۥۣ r0 = r1.f12691
            boolean r0 = r0.hasSubMenu()
            return r0
    }

    @Override // android.view.MenuItem
    public boolean isActionViewExpanded() {
            r1 = this;
            Yue.ۥۢ۠ۥۣ r0 = r1.f12691
            boolean r0 = r0.isActionViewExpanded()
            return r0
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
            r1 = this;
            Yue.ۥۢ۠ۥۣ r0 = r1.f12691
            boolean r0 = r0.isCheckable()
            return r0
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
            r1 = this;
            Yue.ۥۢ۠ۥۣ r0 = r1.f12691
            boolean r0 = r0.isChecked()
            return r0
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
            r1 = this;
            Yue.ۥۢ۠ۥۣ r0 = r1.f12691
            boolean r0 = r0.isEnabled()
            return r0
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
            r1 = this;
            Yue.ۥۢ۠ۥۣ r0 = r1.f12691
            boolean r0 = r0.isVisible()
            return r0
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setActionProvider(android.view.ActionProvider r3) {
            r2 = this;
            Yue.ۥۡ۠ۦۥ$ۥ r0 = new Yue.ۥۡ۠ۦۥ$ۥ
            android.content.Context r1 = r2.f2062
            r0.<init>(r2, r1, r3)
            Yue.ۥۢ۠ۥۣ r1 = r2.f12691
            if (r3 == 0) goto Lc
            goto Ld
        Lc:
            r0 = 0
        Ld:
            r1.mo993(r0)
            return r2
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setActionView(int r3) {
            r2 = this;
            Yue.ۥۢ۠ۥۣ r0 = r2.f12691
            r0.setActionView(r3)
            Yue.ۥۢ۠ۥۣ r3 = r2.f12691
            android.view.View r3 = r3.getActionView()
            boolean r0 = r3 instanceof android.view.CollapsibleActionView
            if (r0 == 0) goto L19
            Yue.ۥۢ۠ۥۣ r0 = r2.f12691
            Yue.ۥۡ۠ۦۥ$ۥ۟ r1 = new Yue.ۥۡ۠ۦۥ$ۥ۟
            r1.<init>(r3)
            r0.setActionView(r1)
        L19:
            return r2
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setActionView(android.view.View r2) {
            r1 = this;
            boolean r0 = r2 instanceof android.view.CollapsibleActionView
            if (r0 == 0) goto La
            Yue.ۥۡ۠ۦۥ$ۥ۟ r0 = new Yue.ۥۡ۠ۦۥ$ۥ۟
            r0.<init>(r2)
            r2 = r0
        La:
            Yue.ۥۢ۠ۥۣ r0 = r1.f12691
            r0.setActionView(r2)
            return r1
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setAlphabeticShortcut(char r2) {
            r1 = this;
            Yue.ۥۢ۠ۥۣ r0 = r1.f12691
            r0.setAlphabeticShortcut(r2)
            return r1
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setAlphabeticShortcut(char r2, int r3) {
            r1 = this;
            Yue.ۥۢ۠ۥۣ r0 = r1.f12691
            r0.setAlphabeticShortcut(r2, r3)
            return r1
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setCheckable(boolean r2) {
            r1 = this;
            Yue.ۥۢ۠ۥۣ r0 = r1.f12691
            r0.setCheckable(r2)
            return r1
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setChecked(boolean r2) {
            r1 = this;
            Yue.ۥۢ۠ۥۣ r0 = r1.f12691
            r0.setChecked(r2)
            return r1
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setContentDescription(java.lang.CharSequence r2) {
            r1 = this;
            Yue.ۥۢ۠ۥۣ r0 = r1.f12691
            r0.setContentDescription(r2)
            return r1
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setEnabled(boolean r2) {
            r1 = this;
            Yue.ۥۢ۠ۥۣ r0 = r1.f12691
            r0.setEnabled(r2)
            return r1
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setIcon(int r2) {
            r1 = this;
            Yue.ۥۢ۠ۥۣ r0 = r1.f12691
            r0.setIcon(r2)
            return r1
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setIcon(android.graphics.drawable.Drawable r2) {
            r1 = this;
            Yue.ۥۢ۠ۥۣ r0 = r1.f12691
            r0.setIcon(r2)
            return r1
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setIconTintList(android.content.res.ColorStateList r2) {
            r1 = this;
            Yue.ۥۢ۠ۥۣ r0 = r1.f12691
            r0.setIconTintList(r2)
            return r1
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setIconTintMode(android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            Yue.ۥۢ۠ۥۣ r0 = r1.f12691
            r0.setIconTintMode(r2)
            return r1
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setIntent(android.content.Intent r2) {
            r1 = this;
            Yue.ۥۢ۠ۥۣ r0 = r1.f12691
            r0.setIntent(r2)
            return r1
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setNumericShortcut(char r2) {
            r1 = this;
            Yue.ۥۢ۠ۥۣ r0 = r1.f12691
            r0.setNumericShortcut(r2)
            return r1
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setNumericShortcut(char r2, int r3) {
            r1 = this;
            Yue.ۥۢ۠ۥۣ r0 = r1.f12691
            r0.setNumericShortcut(r2, r3)
            return r1
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setOnActionExpandListener(android.view.MenuItem.OnActionExpandListener r3) {
            r2 = this;
            Yue.ۥۢ۠ۥۣ r0 = r2.f12691
            if (r3 == 0) goto La
            Yue.ۥۡ۠ۦۥ$ۥ۟۟ r1 = new Yue.ۥۡ۠ۦۥ$ۥ۟۟
            r1.<init>(r2, r3)
            goto Lb
        La:
            r1 = 0
        Lb:
            r0.setOnActionExpandListener(r1)
            return r2
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setOnMenuItemClickListener(android.view.MenuItem.OnMenuItemClickListener r3) {
            r2 = this;
            Yue.ۥۢ۠ۥۣ r0 = r2.f12691
            if (r3 == 0) goto La
            Yue.ۥۡ۠ۦۥ$ۥ۟۟۟ r1 = new Yue.ۥۡ۠ۦۥ$ۥ۟۟۟
            r1.<init>(r2, r3)
            goto Lb
        La:
            r1 = 0
        Lb:
            r0.setOnMenuItemClickListener(r1)
            return r2
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setShortcut(char r2, char r3) {
            r1 = this;
            Yue.ۥۢ۠ۥۣ r0 = r1.f12691
            r0.setShortcut(r2, r3)
            return r1
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setShortcut(char r2, char r3, int r4, int r5) {
            r1 = this;
            Yue.ۥۢ۠ۥۣ r0 = r1.f12691
            r0.setShortcut(r2, r3, r4, r5)
            return r1
    }

    @Override // android.view.MenuItem
    public void setShowAsAction(int r2) {
            r1 = this;
            Yue.ۥۢ۠ۥۣ r0 = r1.f12691
            r0.setShowAsAction(r2)
            return
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setShowAsActionFlags(int r2) {
            r1 = this;
            Yue.ۥۢ۠ۥۣ r0 = r1.f12691
            r0.setShowAsActionFlags(r2)
            return r1
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setTitle(int r2) {
            r1 = this;
            Yue.ۥۢ۠ۥۣ r0 = r1.f12691
            r0.setTitle(r2)
            return r1
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setTitle(java.lang.CharSequence r2) {
            r1 = this;
            Yue.ۥۢ۠ۥۣ r0 = r1.f12691
            r0.setTitle(r2)
            return r1
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setTitleCondensed(java.lang.CharSequence r2) {
            r1 = this;
            Yue.ۥۢ۠ۥۣ r0 = r1.f12691
            r0.setTitleCondensed(r2)
            return r1
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setTooltipText(java.lang.CharSequence r2) {
            r1 = this;
            Yue.ۥۢ۠ۥۣ r0 = r1.f12691
            r0.setTooltipText(r2)
            return r1
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setVisible(boolean r2) {
            r1 = this;
            Yue.ۥۢ۠ۥۣ r0 = r1.f12691
            android.view.MenuItem r2 = r0.setVisible(r2)
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public void m16208(boolean r4) {
            r3 = this;
            java.lang.reflect.Method r0 = r3.f12692     // Catch: java.lang.Exception -> L19
            if (r0 != 0) goto L1b
            Yue.ۥۢ۠ۥۣ r0 = r3.f12691     // Catch: java.lang.Exception -> L19
            java.lang.Class r0 = r0.getClass()     // Catch: java.lang.Exception -> L19
            java.lang.String r1 = "setExclusiveCheckable"
            java.lang.Class r2 = java.lang.Boolean.TYPE     // Catch: java.lang.Exception -> L19
            java.lang.Class[] r2 = new java.lang.Class[]{r2}     // Catch: java.lang.Exception -> L19
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r2)     // Catch: java.lang.Exception -> L19
            r3.f12692 = r0     // Catch: java.lang.Exception -> L19
            goto L1b
        L19:
            r4 = move-exception
            goto L2b
        L1b:
            java.lang.reflect.Method r0 = r3.f12692     // Catch: java.lang.Exception -> L19
            Yue.ۥۢ۠ۥۣ r1 = r3.f12691     // Catch: java.lang.Exception -> L19
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)     // Catch: java.lang.Exception -> L19
            java.lang.Object[] r4 = new java.lang.Object[]{r4}     // Catch: java.lang.Exception -> L19
            r0.invoke(r1, r4)     // Catch: java.lang.Exception -> L19
            goto L32
        L2b:
            java.lang.String r0 = "MenuItemWrapper"
            java.lang.String r1 = "Error while calling setExclusiveCheckable"
            android.util.Log.w(r0, r1, r4)
        L32:
            return
    }
}
