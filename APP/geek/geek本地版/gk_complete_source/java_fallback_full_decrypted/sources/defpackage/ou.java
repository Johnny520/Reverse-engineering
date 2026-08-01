package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ou implements defpackage.l50 {
    public defpackage.pu A;
    public android.view.MenuItem.OnActionExpandListener B;
    public boolean C;
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public java.lang.CharSequence e;
    public java.lang.CharSequence f;
    public android.content.Intent g;
    public char h;
    public int i;
    public char j;
    public int k;
    public android.graphics.drawable.Drawable l;
    public int m;
    public final defpackage.ku n;
    public defpackage.c50 o;
    public android.view.MenuItem.OnMenuItemClickListener p;
    public java.lang.CharSequence q;
    public java.lang.CharSequence r;
    public android.content.res.ColorStateList s;
    public android.graphics.PorterDuff.Mode t;
    public boolean u;
    public boolean v;
    public boolean w;
    public int x;
    public int y;
    public android.view.View z;

    public ou(defpackage.ku r3, int r4, int r5, int r6, int r7, java.lang.CharSequence r8, int r9) {
            r2 = this;
            r2.<init>()
            r0 = 4096(0x1000, float:5.74E-42)
            r2.i = r0
            r2.k = r0
            r0 = 0
            r2.m = r0
            r1 = 0
            r2.s = r1
            r2.t = r1
            r2.u = r0
            r2.v = r0
            r2.w = r0
            r1 = 16
            r2.x = r1
            r2.C = r0
            r2.n = r3
            r2.a = r5
            r2.b = r4
            r2.c = r6
            r2.d = r7
            r2.e = r8
            r2.y = r9
            return
    }

    public static void c(java.lang.StringBuilder r0, int r1, int r2, java.lang.String r3) {
            r1 = r1 & r2
            if (r1 != r2) goto L6
            r0.append(r3)
        L6:
            return
    }

    @Override // defpackage.l50
    public final defpackage.l50 a(defpackage.pu r3) {
            r2 = this;
            r0 = 0
            r2.z = r0
            r2.A = r3
            ku r3 = r2.n
            r0 = 1
            r3.p(r0)
            pu r3 = r2.A
            if (r3 == 0) goto L1d
            l0 r0 = new l0
            r1 = 21
            r0.<init>(r1, r2)
            r3.b = r0
            android.view.ActionProvider r0 = r3.a
            r0.setVisibilityListener(r3)
        L1d:
            return r2
    }

    @Override // defpackage.l50
    public final defpackage.pu b() {
            r1 = this;
            pu r0 = r1.A
            return r0
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
            r2 = this;
            int r0 = r2.y
            r0 = r0 & 8
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            android.view.View r0 = r2.z
            if (r0 != 0) goto Le
            r0 = 1
            return r0
        Le:
            android.view.MenuItem$OnActionExpandListener r0 = r2.B
            if (r0 == 0) goto L1a
            boolean r0 = r0.onMenuItemActionCollapse(r2)
            if (r0 == 0) goto L19
            goto L1a
        L19:
            return r1
        L1a:
            ku r0 = r2.n
            boolean r0 = r0.d(r2)
            return r0
    }

    public final android.graphics.drawable.Drawable d(android.graphics.drawable.Drawable r2) {
            r1 = this;
            if (r2 == 0) goto L27
            boolean r0 = r1.w
            if (r0 == 0) goto L27
            boolean r0 = r1.u
            if (r0 != 0) goto Le
            boolean r0 = r1.v
            if (r0 == 0) goto L27
        Le:
            android.graphics.drawable.Drawable r2 = r2.mutate()
            boolean r0 = r1.u
            if (r0 == 0) goto L1b
            android.content.res.ColorStateList r0 = r1.s
            defpackage.ch.h(r2, r0)
        L1b:
            boolean r0 = r1.v
            if (r0 == 0) goto L24
            android.graphics.PorterDuff$Mode r0 = r1.t
            defpackage.ch.i(r2, r0)
        L24:
            r0 = 0
            r1.w = r0
        L27:
            return r2
    }

    public final boolean e() {
            r1 = this;
            int r0 = r1.y
            r0 = r0 & 8
            if (r0 == 0) goto L1a
            android.view.View r0 = r1.z
            if (r0 != 0) goto L14
            pu r0 = r1.A
            if (r0 == 0) goto L14
            android.view.View r0 = r0.a(r1)
            r1.z = r0
        L14:
            android.view.View r0 = r1.z
            if (r0 == 0) goto L1a
            r0 = 1
            return r0
        L1a:
            r0 = 0
            return r0
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
            r1 = this;
            boolean r0 = r1.e()
            if (r0 != 0) goto L7
            goto L12
        L7:
            android.view.MenuItem$OnActionExpandListener r0 = r1.B
            if (r0 == 0) goto L14
            boolean r0 = r0.onMenuItemActionExpand(r1)
            if (r0 == 0) goto L12
            goto L14
        L12:
            r0 = 0
            return r0
        L14:
            ku r0 = r1.n
            boolean r0 = r0.f(r1)
            return r0
    }

    public final void f(boolean r1) {
            r0 = this;
            if (r1 == 0) goto L9
            int r1 = r0.x
            r1 = r1 | 32
            r0.x = r1
            return
        L9:
            int r1 = r0.x
            r1 = r1 & (-33)
            r0.x = r1
            return
    }

    @Override // android.view.MenuItem
    public final android.view.ActionProvider getActionProvider() {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "This is not supported, use MenuItemCompat.getActionProvider()"
            r0.<init>(r1)
            throw r0
    }

    @Override // android.view.MenuItem
    public final android.view.View getActionView() {
            r1 = this;
            android.view.View r0 = r1.z
            if (r0 == 0) goto L5
            return r0
        L5:
            pu r0 = r1.A
            if (r0 == 0) goto L10
            android.view.View r0 = r0.a(r1)
            r1.z = r0
            return r0
        L10:
            r0 = 0
            return r0
    }

    @Override // defpackage.l50, android.view.MenuItem
    public final int getAlphabeticModifiers() {
            r1 = this;
            int r0 = r1.k
            return r0
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
            r1 = this;
            char r0 = r1.j
            return r0
    }

    @Override // defpackage.l50, android.view.MenuItem
    public final java.lang.CharSequence getContentDescription() {
            r1 = this;
            java.lang.CharSequence r0 = r1.q
            return r0
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
            r1 = this;
            int r0 = r1.b
            return r0
    }

    @Override // android.view.MenuItem
    public final android.graphics.drawable.Drawable getIcon() {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.l
            if (r0 == 0) goto L9
            android.graphics.drawable.Drawable r0 = r2.d(r0)
            return r0
        L9:
            int r0 = r2.m
            if (r0 == 0) goto L1f
            ku r1 = r2.n
            android.content.Context r1 = r1.a
            android.graphics.drawable.Drawable r0 = defpackage.ff.r(r1, r0)
            r1 = 0
            r2.m = r1
            r2.l = r0
            android.graphics.drawable.Drawable r0 = r2.d(r0)
            return r0
        L1f:
            r0 = 0
            return r0
    }

    @Override // defpackage.l50, android.view.MenuItem
    public final android.content.res.ColorStateList getIconTintList() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.s
            return r0
    }

    @Override // defpackage.l50, android.view.MenuItem
    public final android.graphics.PorterDuff.Mode getIconTintMode() {
            r1 = this;
            android.graphics.PorterDuff$Mode r0 = r1.t
            return r0
    }

    @Override // android.view.MenuItem
    public final android.content.Intent getIntent() {
            r1 = this;
            android.content.Intent r0 = r1.g
            return r0
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
            r1 = this;
            int r0 = r1.a
            return r0
    }

    @Override // android.view.MenuItem
    public final android.view.ContextMenu.ContextMenuInfo getMenuInfo() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // defpackage.l50, android.view.MenuItem
    public final int getNumericModifiers() {
            r1 = this;
            int r0 = r1.i
            return r0
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
            r1 = this;
            char r0 = r1.h
            return r0
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
            r1 = this;
            int r0 = r1.c
            return r0
    }

    @Override // android.view.MenuItem
    public final android.view.SubMenu getSubMenu() {
            r1 = this;
            c50 r0 = r1.o
            return r0
    }

    @Override // android.view.MenuItem
    public final java.lang.CharSequence getTitle() {
            r1 = this;
            java.lang.CharSequence r0 = r1.e
            return r0
    }

    @Override // android.view.MenuItem
    public final java.lang.CharSequence getTitleCondensed() {
            r1 = this;
            java.lang.CharSequence r0 = r1.f
            if (r0 == 0) goto L5
            goto L7
        L5:
            java.lang.CharSequence r0 = r1.e
        L7:
            return r0
    }

    @Override // defpackage.l50, android.view.MenuItem
    public final java.lang.CharSequence getTooltipText() {
            r1 = this;
            java.lang.CharSequence r0 = r1.r
            return r0
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
            r1 = this;
            c50 r0 = r1.o
            if (r0 == 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
            r1 = this;
            boolean r0 = r1.C
            return r0
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
            r2 = this;
            int r0 = r2.x
            r1 = 1
            r0 = r0 & r1
            if (r0 != r1) goto L7
            return r1
        L7:
            r0 = 0
            return r0
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
            r2 = this;
            int r0 = r2.x
            r1 = 2
            r0 = r0 & r1
            if (r0 != r1) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
            r1 = this;
            int r0 = r1.x
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
            r1 = this;
            pu r0 = r1.A
            if (r0 == 0) goto L1d
            android.view.ActionProvider r0 = r0.a
            boolean r0 = r0.overridesItemVisibility()
            if (r0 == 0) goto L1d
            int r0 = r1.x
            r0 = r0 & 8
            if (r0 != 0) goto L25
            pu r0 = r1.A
            android.view.ActionProvider r0 = r0.a
            boolean r0 = r0.isVisible()
            if (r0 == 0) goto L25
            goto L23
        L1d:
            int r0 = r1.x
            r0 = r0 & 8
            if (r0 != 0) goto L25
        L23:
            r0 = 1
            return r0
        L25:
            r0 = 0
            return r0
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setActionProvider(android.view.ActionProvider r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "This is not supported, use MenuItemCompat.setActionProvider()"
            r2.<init>(r0)
            throw r2
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setActionView(int r5) {
            r4 = this;
            ku r0 = r4.n
            android.content.Context r1 = r0.a
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r1)
            android.widget.LinearLayout r3 = new android.widget.LinearLayout
            r3.<init>(r1)
            r1 = 0
            android.view.View r5 = r2.inflate(r5, r3, r1)
            r4.z = r5
            r1 = 0
            r4.A = r1
            if (r5 == 0) goto L27
            int r1 = r5.getId()
            r2 = -1
            if (r1 != r2) goto L27
            int r1 = r4.a
            if (r1 <= 0) goto L27
            r5.setId(r1)
        L27:
            r5 = 1
            r0.k = r5
            r0.p(r5)
            return r4
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setActionView(android.view.View r3) {
            r2 = this;
            r2.z = r3
            r0 = 0
            r2.A = r0
            if (r3 == 0) goto L15
            int r0 = r3.getId()
            r1 = -1
            if (r0 != r1) goto L15
            int r0 = r2.a
            if (r0 <= 0) goto L15
            r3.setId(r0)
        L15:
            ku r3 = r2.n
            r0 = 1
            r3.k = r0
            r3.p(r0)
            return r2
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setAlphabeticShortcut(char r2) {
            r1 = this;
            char r0 = r1.j
            if (r0 != r2) goto L5
            return r1
        L5:
            char r2 = java.lang.Character.toLowerCase(r2)
            r1.j = r2
            ku r2 = r1.n
            r0 = 0
            r2.p(r0)
            return r1
    }

    @Override // defpackage.l50, android.view.MenuItem
    public final android.view.MenuItem setAlphabeticShortcut(char r2, int r3) {
            r1 = this;
            char r0 = r1.j
            if (r0 != r2) goto L9
            int r0 = r1.k
            if (r0 != r3) goto L9
            return r1
        L9:
            char r2 = java.lang.Character.toLowerCase(r2)
            r1.j = r2
            int r2 = android.view.KeyEvent.normalizeMetaState(r3)
            r1.k = r2
            ku r2 = r1.n
            r3 = 0
            r2.p(r3)
            return r1
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setCheckable(boolean r3) {
            r2 = this;
            int r0 = r2.x
            r1 = r0 & (-2)
            r3 = r3 | r1
            r2.x = r3
            if (r0 == r3) goto Lf
            ku r3 = r2.n
            r0 = 0
            r3.p(r0)
        Lf:
            return r2
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setChecked(boolean r10) {
            r9 = this;
            int r0 = r9.x
            r1 = r0 & 4
            r2 = 2
            ku r3 = r9.n
            r4 = 0
            if (r1 == 0) goto L4e
            java.util.ArrayList r10 = r3.f
            int r0 = r10.size()
            r3.w()
            r1 = r4
        L14:
            if (r1 >= r0) goto L4a
            java.lang.Object r5 = r10.get(r1)
            ou r5 = (defpackage.ou) r5
            int r6 = r5.b
            int r7 = r9.b
            if (r6 != r7) goto L47
            int r6 = r5.x
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
            int r7 = r5.x
            r8 = r7 & (-3)
            if (r6 == 0) goto L3c
            r6 = r2
            goto L3d
        L3c:
            r6 = r4
        L3d:
            r6 = r6 | r8
            r5.x = r6
            if (r7 == r6) goto L47
            ku r5 = r5.n
            r5.p(r4)
        L47:
            int r1 = r1 + 1
            goto L14
        L4a:
            r3.v()
            return r9
        L4e:
            r1 = r0 & (-3)
            if (r10 == 0) goto L53
            goto L54
        L53:
            r2 = r4
        L54:
            r10 = r1 | r2
            r9.x = r10
            if (r0 == r10) goto L5d
            r3.p(r4)
        L5d:
            return r9
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ android.view.MenuItem setContentDescription(java.lang.CharSequence r1) {
            r0 = this;
            r0.setContentDescription(r1)
            return r0
    }

    @Override // defpackage.l50, android.view.MenuItem
    public final defpackage.l50 setContentDescription(java.lang.CharSequence r2) {
            r1 = this;
            r1.q = r2
            ku r2 = r1.n
            r0 = 0
            r2.p(r0)
            return r1
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setEnabled(boolean r2) {
            r1 = this;
            if (r2 == 0) goto L9
            int r2 = r1.x
            r2 = r2 | 16
            r1.x = r2
            goto Lf
        L9:
            int r2 = r1.x
            r2 = r2 & (-17)
            r1.x = r2
        Lf:
            ku r2 = r1.n
            r0 = 0
            r2.p(r0)
            return r1
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setIcon(int r2) {
            r1 = this;
            r0 = 0
            r1.l = r0
            r1.m = r2
            r2 = 1
            r1.w = r2
            ku r2 = r1.n
            r0 = 0
            r2.p(r0)
            return r1
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setIcon(android.graphics.drawable.Drawable r2) {
            r1 = this;
            r0 = 0
            r1.m = r0
            r1.l = r2
            r2 = 1
            r1.w = r2
            ku r2 = r1.n
            r2.p(r0)
            return r1
    }

    @Override // defpackage.l50, android.view.MenuItem
    public final android.view.MenuItem setIconTintList(android.content.res.ColorStateList r2) {
            r1 = this;
            r1.s = r2
            r2 = 1
            r1.u = r2
            r1.w = r2
            ku r2 = r1.n
            r0 = 0
            r2.p(r0)
            return r1
    }

    @Override // defpackage.l50, android.view.MenuItem
    public final android.view.MenuItem setIconTintMode(android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            r1.t = r2
            r2 = 1
            r1.v = r2
            r1.w = r2
            ku r2 = r1.n
            r0 = 0
            r2.p(r0)
            return r1
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setIntent(android.content.Intent r1) {
            r0 = this;
            r0.g = r1
            return r0
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setNumericShortcut(char r2) {
            r1 = this;
            char r0 = r1.h
            if (r0 != r2) goto L5
            return r1
        L5:
            r1.h = r2
            ku r2 = r1.n
            r0 = 0
            r2.p(r0)
            return r1
    }

    @Override // defpackage.l50, android.view.MenuItem
    public final android.view.MenuItem setNumericShortcut(char r2, int r3) {
            r1 = this;
            char r0 = r1.h
            if (r0 != r2) goto L9
            int r0 = r1.i
            if (r0 != r3) goto L9
            return r1
        L9:
            r1.h = r2
            int r2 = android.view.KeyEvent.normalizeMetaState(r3)
            r1.i = r2
            ku r2 = r1.n
            r3 = 0
            r2.p(r3)
            return r1
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setOnActionExpandListener(android.view.MenuItem.OnActionExpandListener r1) {
            r0 = this;
            r0.B = r1
            return r0
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setOnMenuItemClickListener(android.view.MenuItem.OnMenuItemClickListener r1) {
            r0 = this;
            r0.p = r1
            return r0
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setShortcut(char r1, char r2) {
            r0 = this;
            r0.h = r1
            char r1 = java.lang.Character.toLowerCase(r2)
            r0.j = r1
            ku r1 = r0.n
            r2 = 0
            r1.p(r2)
            return r0
    }

    @Override // defpackage.l50, android.view.MenuItem
    public final android.view.MenuItem setShortcut(char r1, char r2, int r3, int r4) {
            r0 = this;
            r0.h = r1
            int r1 = android.view.KeyEvent.normalizeMetaState(r3)
            r0.i = r1
            char r1 = java.lang.Character.toLowerCase(r2)
            r0.j = r1
            int r1 = android.view.KeyEvent.normalizeMetaState(r4)
            r0.k = r1
            ku r1 = r0.n
            r2 = 0
            r1.p(r2)
            return r0
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int r4) {
            r3 = this;
            r0 = r4 & 3
            r1 = 1
            if (r0 == 0) goto L13
            if (r0 == r1) goto L13
            r2 = 2
            if (r0 != r2) goto Lb
            goto L13
        Lb:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive."
            r4.<init>(r0)
            throw r4
        L13:
            r3.y = r4
            ku r4 = r3.n
            r4.k = r1
            r4.p(r1)
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
            ku r0 = r1.n
            android.content.Context r0 = r0.a
            java.lang.String r2 = r0.getString(r2)
            r1.setTitle(r2)
            return r1
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setTitle(java.lang.CharSequence r3) {
            r2 = this;
            r2.e = r3
            ku r0 = r2.n
            r1 = 0
            r0.p(r1)
            c50 r0 = r2.o
            if (r0 == 0) goto Lf
            r0.setHeaderTitle(r3)
        Lf:
            return r2
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setTitleCondensed(java.lang.CharSequence r2) {
            r1 = this;
            r1.f = r2
            ku r2 = r1.n
            r0 = 0
            r2.p(r0)
            return r1
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ android.view.MenuItem setTooltipText(java.lang.CharSequence r1) {
            r0 = this;
            r0.setTooltipText(r1)
            return r0
    }

    @Override // defpackage.l50, android.view.MenuItem
    public final defpackage.l50 setTooltipText(java.lang.CharSequence r2) {
            r1 = this;
            r1.r = r2
            ku r2 = r1.n
            r0 = 0
            r2.p(r0)
            return r1
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setVisible(boolean r3) {
            r2 = this;
            int r0 = r2.x
            r1 = r0 & (-9)
            if (r3 == 0) goto L8
            r3 = 0
            goto La
        L8:
            r3 = 8
        La:
            r3 = r3 | r1
            r2.x = r3
            if (r0 == r3) goto L17
            ku r3 = r2.n
            r0 = 1
            r3.h = r0
            r3.p(r0)
        L17:
            return r2
    }

    public final java.lang.String toString() {
            r1 = this;
            java.lang.CharSequence r0 = r1.e
            if (r0 == 0) goto L9
            java.lang.String r0 = r0.toString()
            return r0
        L9:
            r0 = 0
            return r0
    }
}
