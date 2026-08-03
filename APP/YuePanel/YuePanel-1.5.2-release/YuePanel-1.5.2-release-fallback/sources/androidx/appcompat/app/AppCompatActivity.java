package androidx.appcompat.app;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatActivity extends androidx.fragment.app.FragmentActivity implements Yue.InterfaceC0437, Yue.C6127.InterfaceC6128, androidx.appcompat.app.C7275.InterfaceC7278 {
    private static final java.lang.String DELEGATE_TAG = "androidx:appcompat";
    private androidx.appcompat.app.AbstractC7283 mDelegate;
    private android.content.res.Resources mResources;

    /* JADX INFO: renamed from: androidx.appcompat.app.AppCompatActivity$ۥ, reason: contains not printable characters */
    public class C7265 implements androidx.savedstate.C7816.InterfaceC7819 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final /* synthetic */ androidx.appcompat.app.AppCompatActivity f25099;

        public C7265(androidx.appcompat.app.AppCompatActivity r1) {
                r0 = this;
                r0.f25099 = r1
                r0.<init>()
                return
        }

        @Override // androidx.savedstate.C7816.InterfaceC7819
        @Yue.InterfaceC4410
        public android.os.Bundle saveState() {
                r2 = this;
                android.os.Bundle r0 = new android.os.Bundle
                r0.<init>()
                androidx.appcompat.app.AppCompatActivity r1 = r2.f25099
                androidx.appcompat.app.ۥ۟۟۟ r1 = r1.getDelegate()
                r1.mo28005(r0)
                return r0
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.AppCompatActivity$ۥ۟, reason: contains not printable characters */
    public class C7266 implements Yue.InterfaceC4613 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final /* synthetic */ androidx.appcompat.app.AppCompatActivity f25100;

        public C7266(androidx.appcompat.app.AppCompatActivity r1) {
                r0 = this;
                r0.f25100 = r1
                r0.<init>()
                return
        }

        @Override // Yue.InterfaceC4613
        /* JADX INFO: renamed from: ۥ */
        public void mo7067(@Yue.InterfaceC4410 android.content.Context r3) {
                r2 = this;
                androidx.appcompat.app.AppCompatActivity r3 = r2.f25100
                androidx.appcompat.app.ۥ۟۟۟ r3 = r3.getDelegate()
                r3.mo27997()
                androidx.appcompat.app.AppCompatActivity r0 = r2.f25100
                androidx.savedstate.ۥ r0 = r0.getSavedStateRegistry()
                java.lang.String r1 = "androidx:appcompat"
                android.os.Bundle r0 = r0.m30359(r1)
                r3.mo28001(r0)
                return
        }
    }

    public AppCompatActivity() {
            r0 = this;
            r0.<init>()
            r0.m27819()
            return
    }

    @Yue.InterfaceC1578
    public AppCompatActivity(@Yue.InterfaceC3573 int r1) {
            r0 = this;
            r0.<init>(r1)
            r0.m27819()
            return
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void addContentView(android.view.View r2, android.view.ViewGroup.LayoutParams r3) {
            r1 = this;
            r1.initializeViewTreeOwners()
            androidx.appcompat.app.ۥ۟۟۟ r0 = r1.getDelegate()
            r0.mo27983(r2, r3)
            return
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context r2) {
            r1 = this;
            androidx.appcompat.app.ۥ۟۟۟ r0 = r1.getDelegate()
            android.content.Context r2 = r0.mo27988(r2)
            super.attachBaseContext(r2)
            return
    }

    @Override // android.app.Activity
    public void closeOptionsMenu() {
            r3 = this;
            androidx.appcompat.app.ۥ r0 = r3.getSupportActionBar()
            android.view.Window r1 = r3.getWindow()
            r2 = 0
            boolean r1 = r1.hasFeature(r2)
            if (r1 == 0) goto L1a
            if (r0 == 0) goto L17
            boolean r0 = r0.mo27826()
            if (r0 != 0) goto L1a
        L17:
            super.closeOptionsMenu()
        L1a:
            return
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(android.view.KeyEvent r4) {
            r3 = this;
            int r0 = r4.getKeyCode()
            androidx.appcompat.app.ۥ r1 = r3.getSupportActionBar()
            r2 = 82
            if (r0 != r2) goto L16
            if (r1 == 0) goto L16
            boolean r0 = r1.mo27852(r4)
            if (r0 == 0) goto L16
            r4 = 1
            return r4
        L16:
            boolean r4 = super.dispatchKeyEvent(r4)
            return r4
    }

    @Override // android.app.Activity
    public <T extends android.view.View> T findViewById(@Yue.InterfaceC3214 int r2) {
            r1 = this;
            androidx.appcompat.app.ۥ۟۟۟ r0 = r1.getDelegate()
            android.view.View r2 = r0.mo27990(r2)
            return r2
    }

    @Yue.InterfaceC4410
    public androidx.appcompat.app.AbstractC7283 getDelegate() {
            r1 = this;
            androidx.appcompat.app.ۥ۟۟۟ r0 = r1.mDelegate
            if (r0 != 0) goto La
            androidx.appcompat.app.ۥ۟۟۟ r0 = androidx.appcompat.app.AbstractC7283.m27961(r1, r1)
            r1.mDelegate = r0
        La:
            androidx.appcompat.app.ۥ۟۟۟ r0 = r1.mDelegate
            return r0
    }

    @Override // androidx.appcompat.app.C7275.InterfaceC7278
    @Yue.InterfaceC4544
    public androidx.appcompat.app.C7275.InterfaceC7277 getDrawerToggleDelegate() {
            r1 = this;
            androidx.appcompat.app.ۥ۟۟۟ r0 = r1.getDelegate()
            androidx.appcompat.app.ۥ۟$ۥ۟ r0 = r0.mo27992()
            return r0
    }

    @Override // android.app.Activity
    @Yue.InterfaceC4410
    public android.view.MenuInflater getMenuInflater() {
            r1 = this;
            androidx.appcompat.app.ۥ۟۟۟ r0 = r1.getDelegate()
            android.view.MenuInflater r0 = r0.mo27994()
            return r0
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public android.content.res.Resources getResources() {
            r2 = this;
            android.content.res.Resources r0 = r2.mResources
            if (r0 != 0) goto L15
            boolean r0 = Yue.C6670.m25687()
            if (r0 == 0) goto L15
            Yue.ۥۣۢۥۤ r0 = new Yue.ۥۣۢۥۤ
            android.content.res.Resources r1 = super.getResources()
            r0.<init>(r2, r1)
            r2.mResources = r0
        L15:
            android.content.res.Resources r0 = r2.mResources
            if (r0 != 0) goto L1d
            android.content.res.Resources r0 = super.getResources()
        L1d:
            return r0
    }

    @Yue.InterfaceC4544
    public androidx.appcompat.app.AbstractC7267 getSupportActionBar() {
            r1 = this;
            androidx.appcompat.app.ۥ۟۟۟ r0 = r1.getDelegate()
            androidx.appcompat.app.ۥ r0 = r0.mo27995()
            return r0
    }

    @Override // Yue.C6127.InterfaceC6128
    @Yue.InterfaceC4544
    public android.content.Intent getSupportParentActivityIntent() {
            r1 = this;
            android.content.Intent r0 = Yue.C4372.m17212(r1)
            return r0
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
            r1 = this;
            androidx.appcompat.app.ۥ۟۟۟ r0 = r1.getDelegate()
            r0.mo27998()
            return
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(@Yue.InterfaceC4410 android.content.res.Configuration r3) {
            r2 = this;
            super.onConfigurationChanged(r3)
            androidx.appcompat.app.ۥ۟۟۟ r0 = r2.getDelegate()
            r0.mo28000(r3)
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

    public void onCreateSupportNavigateUpTaskStack(@Yue.InterfaceC4410 Yue.C6127 r1) {
            r0 = this;
            r1.m22983(r0)
            return
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
            r1 = this;
            super.onDestroy()
            androidx.appcompat.app.ۥ۟۟۟ r0 = r1.getDelegate()
            r0.mo28002()
            return
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int r2, android.view.KeyEvent r3) {
            r1 = this;
            boolean r0 = r1.m27820(r3)
            if (r0 == 0) goto L8
            r2 = 1
            return r2
        L8:
            boolean r2 = super.onKeyDown(r2, r3)
            return r2
    }

    public void onLocalesChanged(@Yue.InterfaceC4410 Yue.C3698 r1) {
            r0 = this;
            return
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int r2, @Yue.InterfaceC4410 android.view.MenuItem r3) {
            r1 = this;
            boolean r2 = super.onMenuItemSelected(r2, r3)
            if (r2 == 0) goto L8
            r2 = 1
            return r2
        L8:
            androidx.appcompat.app.ۥ r2 = r1.getSupportActionBar()
            int r3 = r3.getItemId()
            r0 = 16908332(0x102002c, float:2.3877352E-38)
            if (r3 != r0) goto L24
            if (r2 == 0) goto L24
            int r2 = r2.mo27830()
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
    public void onPanelClosed(int r1, @Yue.InterfaceC4410 android.view.Menu r2) {
            r0 = this;
            super.onPanelClosed(r1, r2)
            return
    }

    @Override // android.app.Activity
    public void onPostCreate(@Yue.InterfaceC4544 android.os.Bundle r2) {
            r1 = this;
            super.onPostCreate(r2)
            androidx.appcompat.app.ۥ۟۟۟ r0 = r1.getDelegate()
            r0.mo28003(r2)
            return
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPostResume() {
            r1 = this;
            super.onPostResume()
            androidx.appcompat.app.ۥ۟۟۟ r0 = r1.getDelegate()
            r0.mo28004()
            return
    }

    public void onPrepareSupportNavigateUpTaskStack(@Yue.InterfaceC4410 Yue.C6127 r1) {
            r0 = this;
            return
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
            r1 = this;
            super.onStart()
            androidx.appcompat.app.ۥ۟۟۟ r0 = r1.getDelegate()
            r0.mo28006()
            return
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
            r1 = this;
            super.onStop()
            androidx.appcompat.app.ۥ۟۟۟ r0 = r1.getDelegate()
            r0.mo28007()
            return
    }

    @Override // Yue.InterfaceC0437
    @Yue.InterfaceC0907
    public void onSupportActionModeFinished(@Yue.InterfaceC4410 Yue.AbstractC0181 r1) {
            r0 = this;
            return
    }

    @Override // Yue.InterfaceC0437
    @Yue.InterfaceC0907
    public void onSupportActionModeStarted(@Yue.InterfaceC4410 Yue.AbstractC0181 r1) {
            r0 = this;
            return
    }

    @java.lang.Deprecated
    public void onSupportContentChanged() {
            r0 = this;
            return
    }

    public boolean onSupportNavigateUp() {
            r2 = this;
            android.content.Intent r0 = r2.getSupportParentActivityIntent()
            if (r0 == 0) goto L26
            boolean r1 = r2.supportShouldUpRecreateTask(r0)
            if (r1 == 0) goto L21
            Yue.ۥۣۢۡ۟ r0 = Yue.C6127.m22979(r2)
            r2.onCreateSupportNavigateUpTaskStack(r0)
            r2.onPrepareSupportNavigateUpTaskStack(r0)
            r0.m22992()
            Yue.C0188.m1038(r2)     // Catch: java.lang.IllegalStateException -> L1d
            goto L24
        L1d:
            r2.finish()
            goto L24
        L21:
            r2.supportNavigateUpTo(r0)
        L24:
            r0 = 1
            return r0
        L26:
            r0 = 0
            return r0
    }

    @Override // android.app.Activity
    public void onTitleChanged(java.lang.CharSequence r1, int r2) {
            r0 = this;
            super.onTitleChanged(r1, r2)
            androidx.appcompat.app.ۥ۟۟۟ r2 = r0.getDelegate()
            r2.mo28017(r1)
            return
    }

    @Override // Yue.InterfaceC0437
    @Yue.InterfaceC4544
    public Yue.AbstractC0181 onWindowStartingSupportActionMode(@Yue.InterfaceC4410 Yue.AbstractC0181.InterfaceC0182 r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // android.app.Activity
    public void openOptionsMenu() {
            r3 = this;
            androidx.appcompat.app.ۥ r0 = r3.getSupportActionBar()
            android.view.Window r1 = r3.getWindow()
            r2 = 0
            boolean r1 = r1.hasFeature(r2)
            if (r1 == 0) goto L1a
            if (r0 == 0) goto L17
            boolean r0 = r0.mo27853()
            if (r0 != 0) goto L1a
        L17:
            super.openOptionsMenu()
        L1a:
            return
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(@Yue.InterfaceC3573 int r2) {
            r1 = this;
            r1.initializeViewTreeOwners()
            androidx.appcompat.app.ۥ۟۟۟ r0 = r1.getDelegate()
            r0.mo28009(r2)
            return
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(android.view.View r2) {
            r1 = this;
            r1.initializeViewTreeOwners()
            androidx.appcompat.app.ۥ۟۟۟ r0 = r1.getDelegate()
            r0.mo28010(r2)
            return
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(android.view.View r2, android.view.ViewGroup.LayoutParams r3) {
            r1 = this;
            r1.initializeViewTreeOwners()
            androidx.appcompat.app.ۥ۟۟۟ r0 = r1.getDelegate()
            r0.mo28011(r2, r3)
            return
    }

    public void setSupportActionBar(@Yue.InterfaceC4544 androidx.appcompat.widget.Toolbar r2) {
            r1 = this;
            androidx.appcompat.app.ۥ۟۟۟ r0 = r1.getDelegate()
            r0.mo28015(r2)
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
    public void setTheme(@Yue.InterfaceC6018 int r2) {
            r1 = this;
            super.setTheme(r2)
            androidx.appcompat.app.ۥ۟۟۟ r0 = r1.getDelegate()
            r0.mo28016(r2)
            return
    }

    @Yue.InterfaceC4544
    public Yue.AbstractC0181 startSupportActionMode(@Yue.InterfaceC4410 Yue.AbstractC0181.InterfaceC0182 r2) {
            r1 = this;
            androidx.appcompat.app.ۥ۟۟۟ r0 = r1.getDelegate()
            Yue.ۥ۟۟ۧ۟ r2 = r0.mo28018(r2)
            return r2
    }

    @Override // androidx.fragment.app.FragmentActivity
    public void supportInvalidateOptionsMenu() {
            r1 = this;
            androidx.appcompat.app.ۥ۟۟۟ r0 = r1.getDelegate()
            r0.mo27998()
            return
    }

    public void supportNavigateUpTo(@Yue.InterfaceC4410 android.content.Intent r1) {
            r0 = this;
            Yue.C4372.m17218(r0, r1)
            return
    }

    public boolean supportRequestWindowFeature(int r2) {
            r1 = this;
            androidx.appcompat.app.ۥ۟۟۟ r0 = r1.getDelegate()
            boolean r2 = r0.mo28008(r2)
            return r2
    }

    public boolean supportShouldUpRecreateTask(@Yue.InterfaceC4410 android.content.Intent r1) {
            r0 = this;
            boolean r1 = Yue.C4372.m17219(r0, r1)
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final void m27819() {
            r3 = this;
            androidx.savedstate.ۥ r0 = r3.getSavedStateRegistry()
            androidx.appcompat.app.AppCompatActivity$ۥ r1 = new androidx.appcompat.app.AppCompatActivity$ۥ
            r1.<init>(r3)
            java.lang.String r2 = "androidx:appcompat"
            r0.m30366(r2, r1)
            androidx.appcompat.app.AppCompatActivity$ۥ۟ r0 = new androidx.appcompat.app.AppCompatActivity$ۥ۟
            r0.<init>(r3)
            r3.addOnContextAvailableListener(r0)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final boolean m27820(android.view.KeyEvent r1) {
            r0 = this;
            r1 = 0
            return r1
    }
}
