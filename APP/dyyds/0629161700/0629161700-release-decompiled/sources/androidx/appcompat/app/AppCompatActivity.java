package androidx.appcompat.app;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public class AppCompatActivity extends androidx.fragment.app.FragmentActivity implements defpackage.InterfaceC0832 {
    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void addContentView(android.view.View r1, android.view.ViewGroup.LayoutParams r2) {
            r0 = this;
            r0.m10()
            r0 = 0
            throw r0
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(android.content.Context r1) {
            r0 = this;
            r0 = 0
            throw r0
    }

    @Override // android.app.Activity
    public final void closeOptionsMenu() {
            r0 = this;
            r0 = 0
            throw r0
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(android.view.KeyEvent r1) {
            r0 = this;
            r1.getKeyCode()
            r0 = 0
            throw r0
    }

    @Override // android.app.Activity
    public final android.view.View findViewById(int r1) {
            r0 = this;
            r0 = 0
            throw r0
    }

    @Override // android.app.Activity
    public final android.view.MenuInflater getMenuInflater() {
            r0 = this;
            r0 = 0
            throw r0
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final android.content.res.Resources getResources() {
            r0 = this;
            r0 = 0
            throw r0
    }

    @Override // android.app.Activity
    public final void invalidateOptionsMenu() {
            r0 = this;
            r0 = 0
            throw r0
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(android.content.res.Configuration r1) {
            r0 = this;
            super.onConfigurationChanged(r1)
            r0 = 0
            throw r0
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onContentChanged() {
            r0 = this;
            return
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
            r0 = this;
            super.onDestroy()
            r0 = 0
            throw r0
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int r1, android.view.MenuItem r2) {
            r0 = this;
            boolean r0 = super.onMenuItemSelected(r1, r2)
            if (r0 == 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            throw r0
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public final void onPanelClosed(int r1, android.view.Menu r2) {
            r0 = this;
            r0 = 0
            throw r0
    }

    @Override // android.app.Activity
    public final void onPostCreate(android.os.Bundle r1) {
            r0 = this;
            super.onPostCreate(r1)
            r0 = 0
            throw r0
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPostResume() {
            r0 = this;
            super.onPostResume()
            r0 = 0
            throw r0
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStart() {
            r0 = this;
            r0 = 0
            throw r0
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStop() {
            r0 = this;
            super.onStop()
            r0 = 0
            throw r0
    }

    @Override // android.app.Activity
    public final void onTitleChanged(java.lang.CharSequence r1, int r2) {
            r0 = this;
            super.onTitleChanged(r1, r2)
            r0 = 0
            throw r0
    }

    @Override // android.app.Activity
    public final void openOptionsMenu() {
            r0 = this;
            r0 = 0
            throw r0
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void setContentView(int r1) {
            r0 = this;
            r0.m10()
            r0 = 0
            throw r0
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(android.view.View r1) {
            r0 = this;
            r0.m10()
            r0 = 0
            throw r0
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void setContentView(android.view.View r1, android.view.ViewGroup.LayoutParams r2) {
            r0 = this;
            r0.m10()
            r0 = 0
            throw r0
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int r1) {
            r0 = this;
            super.setTheme(r1)
            r0 = 0
            throw r0
    }

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public final void m10() {
            r2 = this;
            android.view.Window r0 = r2.getWindow()
            android.view.View r0 = r0.getDecorView()
            r1 = 1711867116(0x660904ec, float:1.6176375E23)
            r0.setTag(r1, r2)
            android.view.Window r0 = r2.getWindow()
            android.view.View r0 = r0.getDecorView()
            r1 = 1711867119(0x660904ef, float:1.617638E23)
            r0.setTag(r1, r2)
            android.view.Window r0 = r2.getWindow()
            android.view.View r0 = r0.getDecorView()
            r1 = 1711867118(0x660904ee, float:1.6176379E23)
            r0.setTag(r1, r2)
            android.view.Window r0 = r2.getWindow()
            android.view.View r0 = r0.getDecorView()
            r1 = 1711867117(0x660904ed, float:1.6176377E23)
            r0.setTag(r1, r2)
            return
    }
}
