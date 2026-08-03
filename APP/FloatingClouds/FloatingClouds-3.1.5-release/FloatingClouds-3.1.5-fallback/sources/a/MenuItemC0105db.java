package a;

/* JADX INFO: renamed from: a.db, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class MenuItemC0105db extends a.AbstractC0059b2 implements android.view.MenuItem {
    public final a.Je d;
    public java.lang.reflect.Method e;

    /* JADX INFO: renamed from: a.db$a */
    public class a extends a.Q implements android.view.ActionProvider.VisibilityListener {
        public androidx.appcompat.view.menu.h.a b;
        public final android.view.ActionProvider c;
        public final /* synthetic */ a.MenuItemC0105db d;

        public a(a.MenuItemC0105db r1, android.view.ActionProvider r2) {
                r0 = this;
                r0.<init>()
                r0.d = r1
                r0.c = r2
                return
        }

        @Override // a.Q
        public final boolean a() {
                r1 = this;
                android.view.ActionProvider r0 = r1.c
                boolean r0 = r0.hasSubMenu()
                return r0
        }

        @Override // a.Q
        public final boolean b() {
                r1 = this;
                android.view.ActionProvider r0 = r1.c
                boolean r0 = r0.isVisible()
                return r0
        }

        @Override // a.Q
        public final android.view.View c() {
                r1 = this;
                android.view.ActionProvider r0 = r1.c
                android.view.View r0 = r0.onCreateActionView()
                return r0
        }

        @Override // a.Q
        public final android.view.View d(androidx.appcompat.view.menu.h r2) {
                r1 = this;
                android.view.ActionProvider r0 = r1.c
                android.view.View r2 = r0.onCreateActionView(r2)
                return r2
        }

        @Override // a.Q
        public final boolean e() {
                r1 = this;
                android.view.ActionProvider r0 = r1.c
                boolean r0 = r0.onPerformDefaultAction()
                return r0
        }

        @Override // a.Q
        public final void f(androidx.appcompat.view.menu.m r2) {
                r1 = this;
                a.db r0 = r1.d
                android.view.SubMenu r2 = r0.d(r2)
                android.view.ActionProvider r0 = r1.c
                r0.onPrepareSubMenu(r2)
                return
        }

        @Override // a.Q
        public final boolean g() {
                r1 = this;
                android.view.ActionProvider r0 = r1.c
                boolean r0 = r0.overridesItemVisibility()
                return r0
        }

        @Override // a.Q
        public final void h(androidx.appcompat.view.menu.h.a r1) {
                r0 = this;
                r0.b = r1
                android.view.ActionProvider r1 = r0.c
                r1.setVisibilityListener(r0)
                return
        }

        @Override // android.view.ActionProvider.VisibilityListener
        public final void onActionProviderVisibilityChanged(boolean r2) {
                r1 = this;
                androidx.appcompat.view.menu.h$a r2 = r1.b
                if (r2 == 0) goto Le
                androidx.appcompat.view.menu.h r2 = r2.f825a
                androidx.appcompat.view.menu.f r2 = r2.n
                r0 = 1
                r2.h = r0
                r2.p(r0)
            Le:
                return
        }
    }

    /* JADX INFO: renamed from: a.db$b */
    public static class b extends android.widget.FrameLayout implements a.InterfaceC0258m3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final android.view.CollapsibleActionView f436a;

        public b(android.view.View r2) {
                r1 = this;
                android.content.Context r0 = r2.getContext()
                r1.<init>(r0)
                r0 = r2
                android.view.CollapsibleActionView r0 = (android.view.CollapsibleActionView) r0
                r1.f436a = r0
                r1.addView(r2)
                return
        }

        @Override // a.InterfaceC0258m3
        public final void d() {
                r1 = this;
                android.view.CollapsibleActionView r0 = r1.f436a
                r0.onActionViewExpanded()
                return
        }

        @Override // a.InterfaceC0258m3
        public final void e() {
                r1 = this;
                android.view.CollapsibleActionView r0 = r1.f436a
                r0.onActionViewCollapsed()
                return
        }
    }

    /* JADX INFO: renamed from: a.db$c */
    public class c implements android.view.MenuItem.OnActionExpandListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final android.view.MenuItem.OnActionExpandListener f437a;
        public final /* synthetic */ a.MenuItemC0105db b;

        public c(a.MenuItemC0105db r1, android.view.MenuItem.OnActionExpandListener r2) {
                r0 = this;
                r0.<init>()
                r0.b = r1
                r0.f437a = r2
                return
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public final boolean onMenuItemActionCollapse(android.view.MenuItem r2) {
                r1 = this;
                a.db r0 = r1.b
                android.view.MenuItem r2 = r0.c(r2)
                android.view.MenuItem$OnActionExpandListener r0 = r1.f437a
                boolean r2 = r0.onMenuItemActionCollapse(r2)
                return r2
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public final boolean onMenuItemActionExpand(android.view.MenuItem r2) {
                r1 = this;
                a.db r0 = r1.b
                android.view.MenuItem r2 = r0.c(r2)
                android.view.MenuItem$OnActionExpandListener r0 = r1.f437a
                boolean r2 = r0.onMenuItemActionExpand(r2)
                return r2
        }
    }

    /* JADX INFO: renamed from: a.db$d */
    public class d implements android.view.MenuItem.OnMenuItemClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final android.view.MenuItem.OnMenuItemClickListener f438a;
        public final /* synthetic */ a.MenuItemC0105db b;

        public d(a.MenuItemC0105db r1, android.view.MenuItem.OnMenuItemClickListener r2) {
                r0 = this;
                r0.<init>()
                r0.b = r1
                r0.f438a = r2
                return
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public final boolean onMenuItemClick(android.view.MenuItem r2) {
                r1 = this;
                a.db r0 = r1.b
                android.view.MenuItem r2 = r0.c(r2)
                android.view.MenuItem$OnMenuItemClickListener r0 = r1.f438a
                boolean r2 = r0.onMenuItemClick(r2)
                return r2
        }
    }

    public MenuItemC0105db(android.content.Context r1, a.Je r2) {
            r0 = this;
            r0.<init>(r1)
            if (r2 == 0) goto L8
            r0.d = r2
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
            a.Je r0 = r1.d
            boolean r0 = r0.collapseActionView()
            return r0
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
            r1 = this;
            a.Je r0 = r1.d
            boolean r0 = r0.expandActionView()
            return r0
    }

    @Override // android.view.MenuItem
    public final android.view.ActionProvider getActionProvider() {
            r2 = this;
            a.Je r0 = r2.d
            a.Q r0 = r0.a()
            boolean r1 = r0 instanceof a.MenuItemC0105db.a
            if (r1 == 0) goto Lf
            a.db$a r0 = (a.MenuItemC0105db.a) r0
            android.view.ActionProvider r0 = r0.c
            return r0
        Lf:
            r0 = 0
            return r0
    }

    @Override // android.view.MenuItem
    public final android.view.View getActionView() {
            r2 = this;
            a.Je r0 = r2.d
            android.view.View r0 = r0.getActionView()
            boolean r1 = r0 instanceof a.MenuItemC0105db.b
            if (r1 == 0) goto L10
            a.db$b r0 = (a.MenuItemC0105db.b) r0
            android.view.CollapsibleActionView r0 = r0.f436a
            android.view.View r0 = (android.view.View) r0
        L10:
            return r0
    }

    @Override // android.view.MenuItem
    public final int getAlphabeticModifiers() {
            r1 = this;
            a.Je r0 = r1.d
            int r0 = r0.getAlphabeticModifiers()
            return r0
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
            r1 = this;
            a.Je r0 = r1.d
            char r0 = r0.getAlphabeticShortcut()
            return r0
    }

    @Override // android.view.MenuItem
    public final java.lang.CharSequence getContentDescription() {
            r1 = this;
            a.Je r0 = r1.d
            java.lang.CharSequence r0 = r0.getContentDescription()
            return r0
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
            r1 = this;
            a.Je r0 = r1.d
            int r0 = r0.getGroupId()
            return r0
    }

    @Override // android.view.MenuItem
    public final android.graphics.drawable.Drawable getIcon() {
            r1 = this;
            a.Je r0 = r1.d
            android.graphics.drawable.Drawable r0 = r0.getIcon()
            return r0
    }

    @Override // android.view.MenuItem
    public final android.content.res.ColorStateList getIconTintList() {
            r1 = this;
            a.Je r0 = r1.d
            android.content.res.ColorStateList r0 = r0.getIconTintList()
            return r0
    }

    @Override // android.view.MenuItem
    public final android.graphics.PorterDuff.Mode getIconTintMode() {
            r1 = this;
            a.Je r0 = r1.d
            android.graphics.PorterDuff$Mode r0 = r0.getIconTintMode()
            return r0
    }

    @Override // android.view.MenuItem
    public final android.content.Intent getIntent() {
            r1 = this;
            a.Je r0 = r1.d
            android.content.Intent r0 = r0.getIntent()
            return r0
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
            r1 = this;
            a.Je r0 = r1.d
            int r0 = r0.getItemId()
            return r0
    }

    @Override // android.view.MenuItem
    public final android.view.ContextMenu.ContextMenuInfo getMenuInfo() {
            r1 = this;
            a.Je r0 = r1.d
            android.view.ContextMenu$ContextMenuInfo r0 = r0.getMenuInfo()
            return r0
    }

    @Override // android.view.MenuItem
    public final int getNumericModifiers() {
            r1 = this;
            a.Je r0 = r1.d
            int r0 = r0.getNumericModifiers()
            return r0
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
            r1 = this;
            a.Je r0 = r1.d
            char r0 = r0.getNumericShortcut()
            return r0
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
            r1 = this;
            a.Je r0 = r1.d
            int r0 = r0.getOrder()
            return r0
    }

    @Override // android.view.MenuItem
    public final android.view.SubMenu getSubMenu() {
            r1 = this;
            a.Je r0 = r1.d
            android.view.SubMenu r0 = r0.getSubMenu()
            android.view.SubMenu r0 = r1.d(r0)
            return r0
    }

    @Override // android.view.MenuItem
    public final java.lang.CharSequence getTitle() {
            r1 = this;
            a.Je r0 = r1.d
            java.lang.CharSequence r0 = r0.getTitle()
            return r0
    }

    @Override // android.view.MenuItem
    public final java.lang.CharSequence getTitleCondensed() {
            r1 = this;
            a.Je r0 = r1.d
            java.lang.CharSequence r0 = r0.getTitleCondensed()
            return r0
    }

    @Override // android.view.MenuItem
    public final java.lang.CharSequence getTooltipText() {
            r1 = this;
            a.Je r0 = r1.d
            java.lang.CharSequence r0 = r0.getTooltipText()
            return r0
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
            r1 = this;
            a.Je r0 = r1.d
            boolean r0 = r0.hasSubMenu()
            return r0
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
            r1 = this;
            a.Je r0 = r1.d
            boolean r0 = r0.isActionViewExpanded()
            return r0
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
            r1 = this;
            a.Je r0 = r1.d
            boolean r0 = r0.isCheckable()
            return r0
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
            r1 = this;
            a.Je r0 = r1.d
            boolean r0 = r0.isChecked()
            return r0
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
            r1 = this;
            a.Je r0 = r1.d
            boolean r0 = r0.isEnabled()
            return r0
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
            r1 = this;
            a.Je r0 = r1.d
            boolean r0 = r0.isVisible()
            return r0
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setActionProvider(android.view.ActionProvider r2) {
            r1 = this;
            a.db$a r0 = new a.db$a
            r0.<init>(r1, r2)
            if (r2 == 0) goto L8
            goto L9
        L8:
            r0 = 0
        L9:
            a.Je r2 = r1.d
            r2.b(r0)
            return r1
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setActionView(int r3) {
            r2 = this;
            a.Je r0 = r2.d
            r0.setActionView(r3)
            android.view.View r3 = r0.getActionView()
            boolean r1 = r3 instanceof android.view.CollapsibleActionView
            if (r1 == 0) goto L15
            a.db$b r1 = new a.db$b
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
            a.db$b r0 = new a.db$b
            r0.<init>(r2)
            r2 = r0
        La:
            a.Je r0 = r1.d
            r0.setActionView(r2)
            return r1
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setAlphabeticShortcut(char r2) {
            r1 = this;
            a.Je r0 = r1.d
            r0.setAlphabeticShortcut(r2)
            return r1
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setAlphabeticShortcut(char r2, int r3) {
            r1 = this;
            a.Je r0 = r1.d
            r0.setAlphabeticShortcut(r2, r3)
            return r1
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setCheckable(boolean r2) {
            r1 = this;
            a.Je r0 = r1.d
            r0.setCheckable(r2)
            return r1
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setChecked(boolean r2) {
            r1 = this;
            a.Je r0 = r1.d
            r0.setChecked(r2)
            return r1
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setContentDescription(java.lang.CharSequence r2) {
            r1 = this;
            a.Je r0 = r1.d
            r0.setContentDescription(r2)
            return r1
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setEnabled(boolean r2) {
            r1 = this;
            a.Je r0 = r1.d
            r0.setEnabled(r2)
            return r1
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setIcon(int r2) {
            r1 = this;
            a.Je r0 = r1.d
            r0.setIcon(r2)
            return r1
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setIcon(android.graphics.drawable.Drawable r2) {
            r1 = this;
            a.Je r0 = r1.d
            r0.setIcon(r2)
            return r1
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setIconTintList(android.content.res.ColorStateList r2) {
            r1 = this;
            a.Je r0 = r1.d
            r0.setIconTintList(r2)
            return r1
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setIconTintMode(android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            a.Je r0 = r1.d
            r0.setIconTintMode(r2)
            return r1
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setIntent(android.content.Intent r2) {
            r1 = this;
            a.Je r0 = r1.d
            r0.setIntent(r2)
            return r1
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setNumericShortcut(char r2) {
            r1 = this;
            a.Je r0 = r1.d
            r0.setNumericShortcut(r2)
            return r1
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setNumericShortcut(char r2, int r3) {
            r1 = this;
            a.Je r0 = r1.d
            r0.setNumericShortcut(r2, r3)
            return r1
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setOnActionExpandListener(android.view.MenuItem.OnActionExpandListener r2) {
            r1 = this;
            if (r2 == 0) goto L8
            a.db$c r0 = new a.db$c
            r0.<init>(r1, r2)
            goto L9
        L8:
            r0 = 0
        L9:
            a.Je r2 = r1.d
            r2.setOnActionExpandListener(r0)
            return r1
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setOnMenuItemClickListener(android.view.MenuItem.OnMenuItemClickListener r2) {
            r1 = this;
            if (r2 == 0) goto L8
            a.db$d r0 = new a.db$d
            r0.<init>(r1, r2)
            goto L9
        L8:
            r0 = 0
        L9:
            a.Je r2 = r1.d
            r2.setOnMenuItemClickListener(r0)
            return r1
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setShortcut(char r2, char r3) {
            r1 = this;
            a.Je r0 = r1.d
            r0.setShortcut(r2, r3)
            return r1
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setShortcut(char r2, char r3, int r4, int r5) {
            r1 = this;
            a.Je r0 = r1.d
            r0.setShortcut(r2, r3, r4, r5)
            return r1
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int r2) {
            r1 = this;
            a.Je r0 = r1.d
            r0.setShowAsAction(r2)
            return
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setShowAsActionFlags(int r2) {
            r1 = this;
            a.Je r0 = r1.d
            r0.setShowAsActionFlags(r2)
            return r1
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setTitle(int r2) {
            r1 = this;
            a.Je r0 = r1.d
            r0.setTitle(r2)
            return r1
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setTitle(java.lang.CharSequence r2) {
            r1 = this;
            a.Je r0 = r1.d
            r0.setTitle(r2)
            return r1
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setTitleCondensed(java.lang.CharSequence r2) {
            r1 = this;
            a.Je r0 = r1.d
            r0.setTitleCondensed(r2)
            return r1
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setTooltipText(java.lang.CharSequence r2) {
            r1 = this;
            a.Je r0 = r1.d
            r0.setTooltipText(r2)
            return r1
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setVisible(boolean r2) {
            r1 = this;
            a.Je r0 = r1.d
            android.view.MenuItem r2 = r0.setVisible(r2)
            return r2
    }
}
