package a;

/* JADX INFO: loaded from: classes.dex */
public class E0 extends a.X6 implements a.I0, a.Se.a {
    private static final java.lang.String DELEGATE_TAG = "androidx:appcompat";
    private a.O0 mDelegate;
    private android.content.res.Resources mResources;

    public class a implements androidx.savedstate.a.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a.E0 f63a;

        public a(a.E0 r1) {
                r0 = this;
                r0.<init>()
                r0.f63a = r1
                return
        }

        @Override // androidx.savedstate.a.b
        public final android.os.Bundle a() {
                r2 = this;
                android.os.Bundle r0 = new android.os.Bundle
                r0.<init>()
                a.E0 r1 = r2.f63a
                a.O0 r1 = r1.getDelegate()
                r1.getClass()
                return r0
        }
    }

    public class b implements a.InterfaceC0050ac {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a.E0 f64a;

        public b(a.E0 r1) {
                r0 = this;
                r0.<init>()
                r0.f64a = r1
                return
        }

        @Override // a.InterfaceC0050ac
        public final void a(androidx.activity.ComponentActivity r3) {
                r2 = this;
                a.E0 r3 = r2.f64a
                a.O0 r0 = r3.getDelegate()
                r0.k()
                androidx.savedstate.a r3 = r3.getSavedStateRegistry()
                java.lang.String r1 = "androidx:appcompat"
                r3.a(r1)
                r0.o()
                return
        }
    }

    public E0() {
            r0 = this;
            r0.<init>()
            r0.initDelegate()
            return
    }

    public E0(int r1) {
            r0 = this;
            r0.<init>(r1)
            r0.initDelegate()
            return
    }

    private void initDelegate() {
            r3 = this;
            androidx.savedstate.a r0 = r3.getSavedStateRegistry()
            a.E0$a r1 = new a.E0$a
            r1.<init>(r3)
            java.lang.String r2 = "androidx:appcompat"
            r0.c(r2, r1)
            a.E0$b r0 = new a.E0$b
            r0.<init>(r3)
            r3.addOnContextAvailableListener(r0)
            return
    }

    private void initViewTreeOwners() {
            r2 = this;
            android.view.Window r0 = r2.getWindow()
            android.view.View r0 = r0.getDecorView()
            a.Mg.a(r0, r2)
            android.view.Window r0 = r2.getWindow()
            android.view.View r0 = r0.getDecorView()
            java.lang.String r1 = "<this>"
            a.C0193i9.e(r0, r1)
            int r1 = androidx.lifecycle.viewmodel.R.id.view_tree_view_model_store_owner
            r0.setTag(r1, r2)
            android.view.Window r0 = r2.getWindow()
            android.view.View r0 = r0.getDecorView()
            androidx.savedstate.b.a(r0, r2)
            android.view.Window r0 = r2.getWindow()
            android.view.View r0 = r0.getDecorView()
            androidx.activity.c.a(r0, r2)
            return
    }

    private boolean performMenuItemShortcut(android.view.KeyEvent r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void addContentView(android.view.View r2, android.view.ViewGroup.LayoutParams r3) {
            r1 = this;
            r1.initViewTreeOwners()
            a.O0 r0 = r1.getDelegate()
            r0.c(r2, r3)
            return
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context r2) {
            r1 = this;
            a.O0 r0 = r1.getDelegate()
            android.content.Context r2 = r0.d(r2)
            super.attachBaseContext(r2)
            return
    }

    @Override // android.app.Activity
    public void closeOptionsMenu() {
            r3 = this;
            a.L r0 = r3.getSupportActionBar()
            android.view.Window r1 = r3.getWindow()
            r2 = 0
            boolean r1 = r1.hasFeature(r2)
            if (r1 == 0) goto L1a
            if (r0 == 0) goto L17
            boolean r0 = r0.a()
            if (r0 != 0) goto L1a
        L17:
            super.closeOptionsMenu()
        L1a:
            return
    }

    @Override // a.D3, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(android.view.KeyEvent r4) {
            r3 = this;
            int r0 = r4.getKeyCode()
            a.L r1 = r3.getSupportActionBar()
            r2 = 82
            if (r0 != r2) goto L16
            if (r1 == 0) goto L16
            boolean r0 = r1.j(r4)
            if (r0 == 0) goto L16
            r4 = 1
            return r4
        L16:
            boolean r4 = super.dispatchKeyEvent(r4)
            return r4
    }

    @Override // android.app.Activity
    public <T extends android.view.View> T findViewById(int r2) {
            r1 = this;
            a.O0 r0 = r1.getDelegate()
            android.view.View r2 = r0.e(r2)
            return r2
    }

    public a.O0 getDelegate() {
            r2 = this;
            a.O0 r0 = r2.mDelegate
            if (r0 != 0) goto Le
            a.O0$c r0 = a.O0.f192a
            a.Q0 r0 = new a.Q0
            r1 = 0
            r0.<init>(r2, r1, r2, r2)
            r2.mDelegate = r0
        Le:
            a.O0 r0 = r2.mDelegate
            return r0
    }

    public a.N getDrawerToggleDelegate() {
            r1 = this;
            a.O0 r0 = r1.getDelegate()
            a.Q0$b r0 = r0.g()
            return r0
    }

    @Override // android.app.Activity
    public android.view.MenuInflater getMenuInflater() {
            r1 = this;
            a.O0 r0 = r1.getDelegate()
            android.view.MenuInflater r0 = r0.i()
            return r0
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public android.content.res.Resources getResources() {
            r2 = this;
            android.content.res.Resources r0 = r2.mResources
            if (r0 != 0) goto L6
            int r1 = a.C0128eg.f462a
        L6:
            if (r0 != 0) goto Lc
            android.content.res.Resources r0 = super.getResources()
        Lc:
            return r0
    }

    public a.L getSupportActionBar() {
            r1 = this;
            a.O0 r0 = r1.getDelegate()
            a.L r0 = r0.j()
            return r0
    }

    @Override // a.Se.a
    public android.content.Intent getSupportParentActivityIntent() {
            r1 = this;
            android.content.Intent r0 = a.Hb.a(r1)
            return r0
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
            r1 = this;
            a.O0 r0 = r1.getDelegate()
            r0.l()
            return
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration r3) {
            r2 = this;
            super.onConfigurationChanged(r3)
            a.O0 r0 = r2.getDelegate()
            r0.n(r3)
            android.content.res.Resources r3 = r2.mResources
            if (r3 == 0) goto L23
            android.content.res.Resources r3 = super.getResources()
            android.content.res.Configuration r3 = r3.getConfiguration()
            android.content.res.Resources r0 = super.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            android.content.res.Resources r1 = r2.mResources
            r1.updateConfiguration(r3, r0)
        L23:
            return
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onContentChanged() {
            r0 = this;
            r0.onSupportContentChanged()
            return
    }

    public void onCreateSupportNavigateUpTaskStack(a.Se r5) {
            r4 = this;
            r5.getClass()
            android.content.Intent r0 = r4.getSupportParentActivityIntent()
            if (r0 != 0) goto Ld
            android.content.Intent r0 = a.Hb.a(r4)
        Ld:
            if (r0 == 0) goto L4a
            android.content.ComponentName r1 = r0.getComponent()
            a.E0 r2 = r5.b
            if (r1 != 0) goto L1f
            android.content.pm.PackageManager r1 = r2.getPackageManager()
            android.content.ComponentName r1 = r0.resolveActivity(r1)
        L1f:
            java.util.ArrayList<android.content.Intent> r5 = r5.f265a
            int r3 = r5.size()
            android.content.Intent r1 = a.Hb.b(r2, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L37
        L29:
            if (r1 == 0) goto L39
            r5.add(r3, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L37
            android.content.ComponentName r1 = r1.getComponent()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L37
            android.content.Intent r1 = a.Hb.b(r2, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L37
            goto L29
        L37:
            r5 = move-exception
            goto L3d
        L39:
            r5.add(r0)
            return
        L3d:
            java.lang.String r0 = "TaskStackBuilder"
            java.lang.String r1 = "Bad ComponentName while traversing activity parent metadata"
            android.util.Log.e(r0, r1)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r5)
            throw r0
        L4a:
            return
    }

    @Override // a.X6, android.app.Activity
    public void onDestroy() {
            r1 = this;
            super.onDestroy()
            a.O0 r0 = r1.getDelegate()
            r0.p()
            return
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int r2, android.view.KeyEvent r3) {
            r1 = this;
            boolean r0 = r1.performMenuItemShortcut(r3)
            if (r0 == 0) goto L8
            r2 = 1
            return r2
        L8:
            boolean r2 = super.onKeyDown(r2, r3)
            return r2
    }

    public void onLocalesChanged(a.J9 r1) {
            r0 = this;
            return
    }

    @Override // a.X6, androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int r2, android.view.MenuItem r3) {
            r1 = this;
            boolean r2 = super.onMenuItemSelected(r2, r3)
            if (r2 == 0) goto L8
            r2 = 1
            return r2
        L8:
            a.L r2 = r1.getSupportActionBar()
            int r3 = r3.getItemId()
            r0 = 16908332(0x102002c, float:2.3877352E-38)
            if (r3 != r0) goto L24
            if (r2 == 0) goto L24
            int r2 = r2.d()
            r2 = r2 & 4
            if (r2 == 0) goto L24
            boolean r2 = r1.onSupportNavigateUp()
            return r2
        L24:
            r2 = 0
            return r2
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuOpened(int r1, android.view.Menu r2) {
            r0 = this;
            boolean r1 = super.onMenuOpened(r1, r2)
            return r1
    }

    public void onNightModeChanged(int r1) {
            r0 = this;
            return
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int r1, android.view.Menu r2) {
            r0 = this;
            super.onPanelClosed(r1, r2)
            return
    }

    @Override // android.app.Activity
    public void onPostCreate(android.os.Bundle r1) {
            r0 = this;
            super.onPostCreate(r1)
            a.O0 r1 = r0.getDelegate()
            r1.q()
            return
    }

    @Override // a.X6, android.app.Activity
    public void onPostResume() {
            r1 = this;
            super.onPostResume()
            a.O0 r0 = r1.getDelegate()
            r0.r()
            return
    }

    public void onPrepareSupportNavigateUpTaskStack(a.Se r1) {
            r0 = this;
            return
    }

    @Override // a.X6, android.app.Activity
    public void onStart() {
            r1 = this;
            super.onStart()
            a.O0 r0 = r1.getDelegate()
            r0.s()
            return
    }

    @Override // a.X6, android.app.Activity
    public void onStop() {
            r1 = this;
            super.onStop()
            a.O0 r0 = r1.getDelegate()
            r0.t()
            return
    }

    @Override // a.I0
    public void onSupportActionModeFinished(a.P r1) {
            r0 = this;
            return
    }

    @Override // a.I0
    public void onSupportActionModeStarted(a.P r1) {
            r0 = this;
            return
    }

    @java.lang.Deprecated
    public void onSupportContentChanged() {
            r0 = this;
            return
    }

    public boolean onSupportNavigateUp() {
            r5 = this;
            android.content.Intent r0 = r5.getSupportParentActivityIntent()
            r1 = 0
            if (r0 == 0) goto L53
            boolean r2 = r5.supportShouldUpRecreateTask(r0)
            if (r2 == 0) goto L4e
            a.Se r0 = new a.Se
            r0.<init>(r5)
            r5.onCreateSupportNavigateUpTaskStack(r0)
            r5.onPrepareSupportNavigateUpTaskStack(r0)
            java.util.ArrayList<android.content.Intent> r2 = r0.f265a
            boolean r3 = r2.isEmpty()
            if (r3 != 0) goto L46
            android.content.Intent[] r3 = new android.content.Intent[r1]
            java.lang.Object[] r2 = r2.toArray(r3)
            android.content.Intent[] r2 = (android.content.Intent[]) r2
            android.content.Intent r3 = new android.content.Intent
            r4 = r2[r1]
            r3.<init>(r4)
            r4 = 268484608(0x1000c000, float:2.539146E-29)
            android.content.Intent r3 = r3.addFlags(r4)
            r2[r1] = r3
            a.E0 r0 = r0.b
            r1 = 0
            r0.startActivities(r2, r1)
            r5.finishAffinity()     // Catch: java.lang.IllegalStateException -> L42
            goto L51
        L42:
            r5.finish()
            goto L51
        L46:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "No intents added to TaskStackBuilder; cannot startActivities"
            r0.<init>(r1)
            throw r0
        L4e:
            r5.supportNavigateUpTo(r0)
        L51:
            r0 = 1
            return r0
        L53:
            return r1
    }

    @Override // android.app.Activity
    public void onTitleChanged(java.lang.CharSequence r1, int r2) {
            r0 = this;
            super.onTitleChanged(r1, r2)
            a.O0 r2 = r0.getDelegate()
            r2.B(r1)
            return
    }

    @Override // a.I0
    public a.P onWindowStartingSupportActionMode(a.P.a r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // android.app.Activity
    public void openOptionsMenu() {
            r3 = this;
            a.L r0 = r3.getSupportActionBar()
            android.view.Window r1 = r3.getWindow()
            r2 = 0
            boolean r1 = r1.hasFeature(r2)
            if (r1 == 0) goto L1a
            if (r0 == 0) goto L17
            boolean r0 = r0.k()
            if (r0 != 0) goto L1a
        L17:
            super.openOptionsMenu()
        L1a:
            return
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int r2) {
            r1 = this;
            r1.initViewTreeOwners()
            a.O0 r0 = r1.getDelegate()
            r0.w(r2)
            return
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(android.view.View r2) {
            r1 = this;
            r1.initViewTreeOwners()
            a.O0 r0 = r1.getDelegate()
            r0.x(r2)
            return
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(android.view.View r2, android.view.ViewGroup.LayoutParams r3) {
            r1 = this;
            r1.initViewTreeOwners()
            a.O0 r0 = r1.getDelegate()
            r0.y(r2, r3)
            return
    }

    public void setSupportActionBar(androidx.appcompat.widget.Toolbar r2) {
            r1 = this;
            a.O0 r0 = r1.getDelegate()
            r0.z(r2)
            return
    }

    @java.lang.Deprecated
    public void setSupportProgress(int r1) {
            r0 = this;
            return
    }

    @java.lang.Deprecated
    public void setSupportProgressBarIndeterminate(boolean r1) {
            r0 = this;
            return
    }

    @java.lang.Deprecated
    public void setSupportProgressBarIndeterminateVisibility(boolean r1) {
            r0 = this;
            return
    }

    @java.lang.Deprecated
    public void setSupportProgressBarVisibility(boolean r1) {
            r0 = this;
            return
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int r2) {
            r1 = this;
            super.setTheme(r2)
            a.O0 r0 = r1.getDelegate()
            r0.A(r2)
            return
    }

    public a.P startSupportActionMode(a.P.a r2) {
            r1 = this;
            a.O0 r0 = r1.getDelegate()
            a.P r2 = r0.C(r2)
            return r2
    }

    @Override // a.X6
    public void supportInvalidateOptionsMenu() {
            r1 = this;
            a.O0 r0 = r1.getDelegate()
            r0.l()
            return
    }

    public void supportNavigateUpTo(android.content.Intent r1) {
            r0 = this;
            r0.navigateUpTo(r1)
            return
    }

    public boolean supportRequestWindowFeature(int r2) {
            r1 = this;
            a.O0 r0 = r1.getDelegate()
            boolean r2 = r0.v(r2)
            return r2
    }

    public boolean supportShouldUpRecreateTask(android.content.Intent r1) {
            r0 = this;
            boolean r1 = r0.shouldUpRecreateTask(r1)
            return r1
    }
}
