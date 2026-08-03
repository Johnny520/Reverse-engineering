package androidx.appcompat.app;

import Yue.AbstractC3086;
import Yue.C3090;
import Yue.C5782;
import Yue.C6355;
import Yue.C7736;
import Yue.C8170;
import Yue.InterfaceC3285;
import Yue.InterfaceC3647;
import Yue.InterfaceC4183;
import Yue.InterfaceC5411;
import Yue.InterfaceC5683;
import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import Yue.InterfaceC6551;
import Yue.InterfaceC7651;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.C1584;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentActivity;
import androidx.savedstate.C1794;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatActivity extends FragmentActivity implements InterfaceC3285, C7736.InterfaceC1340, C1584.InterfaceC8647 {
    private static final String DELEGATE_TAG = "androidx:appcompat";
    private AbstractC8651 mDelegate;
    private Resources mResources;

    /* JADX INFO: renamed from: androidx.appcompat.app.AppCompatActivity$ۥ */
    public class C1581 implements C1794.InterfaceC9000 {
        public C1581() {
        }

        @Override // androidx.savedstate.C1794.InterfaceC9000
        @InterfaceC6391
        public Bundle saveState() {
            Bundle bundle = new Bundle();
            AppCompatActivity.this.getDelegate().mo28860(bundle);
            return bundle;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.AppCompatActivity$ۥ۟ */
    public class C1582 implements InterfaceC6551 {
        public C1582() {
        }

        @Override // Yue.InterfaceC6551
        /* JADX INFO: renamed from: ۥ */
        public void mo1013(@InterfaceC6391 Context context) {
            AbstractC8651 delegate = AppCompatActivity.this.getDelegate();
            delegate.mo28852();
            delegate.mo28856(AppCompatActivity.this.getSavedStateRegistry().m5022(AppCompatActivity.DELEGATE_TAG));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AppCompatActivity() {
        m28686();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        getDelegate().mo28838(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(getDelegate().mo28843(context));
    }

    @Override // android.app.Activity
    public void closeOptionsMenu() {
        AbstractC1583 supportActionBar = getSupportActionBar();
        if (getWindow().hasFeature(0)) {
            if (supportActionBar == null || !supportActionBar.mo28693()) {
                super.closeOptionsMenu();
            }
        }
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        AbstractC1583 supportActionBar = getSupportActionBar();
        if (keyCode == 82 && supportActionBar != null && supportActionBar.mo28719(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public <T extends View> T findViewById(@InterfaceC5411 int i) {
        return (T) getDelegate().mo28845(i);
    }

    @InterfaceC6391
    public AbstractC8651 getDelegate() {
        if (this.mDelegate == null) {
            this.mDelegate = AbstractC8651.m28816(this, this);
        }
        return this.mDelegate;
    }

    @Override // androidx.appcompat.app.C1584.InterfaceC8647
    @InterfaceC6490
    public C1584.InterfaceC8646 getDrawerToggleDelegate() {
        return getDelegate().mo28847();
    }

    @Override // android.app.Activity
    @InterfaceC6391
    public MenuInflater getMenuInflater() {
        return getDelegate().mo28849();
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        if (this.mResources == null && C8170.m26954()) {
            this.mResources = new C8170(this, super.getResources());
        }
        Resources resources = this.mResources;
        return resources == null ? super.getResources() : resources;
    }

    @InterfaceC6490
    public AbstractC1583 getSupportActionBar() {
        return getDelegate().mo28850();
    }

    @Override // Yue.C7736.InterfaceC1340
    @InterfaceC6490
    public Intent getSupportParentActivityIntent() {
        return C6355.m2817(this);
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
        getDelegate().mo28853();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(@InterfaceC6391 Configuration configuration) {
        super.onConfigurationChanged(configuration);
        getDelegate().mo28855(configuration);
        if (this.mResources != null) {
            this.mResources.updateConfiguration(super.getResources().getConfiguration(), super.getResources().getDisplayMetrics());
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onContentChanged() {
        onSupportContentChanged();
    }

    public void onCreateSupportNavigateUpTaskStack(@InterfaceC6391 C7736 c7736) {
        c7736.m24612(this);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        getDelegate().mo28857();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (m28687(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    public void onLocalesChanged(@InterfaceC6391 C5782 c5782) {
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, @InterfaceC6391 MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        AbstractC1583 supportActionBar = getSupportActionBar();
        if (menuItem.getItemId() != 16908332 || supportActionBar == null || (supportActionBar.mo28697() & 4) == 0) {
            return false;
        }
        return onSupportNavigateUp();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuOpened(int i, Menu menu) {
        return super.onMenuOpened(i, menu);
    }

    public void onNightModeChanged(int i) {
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, @InterfaceC6391 Menu menu) {
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public void onPostCreate(@InterfaceC6490 Bundle bundle) {
        super.onPostCreate(bundle);
        getDelegate().mo28858(bundle);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        getDelegate().mo28859();
    }

    public void onPrepareSupportNavigateUpTaskStack(@InterfaceC6391 C7736 c7736) {
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        getDelegate().mo28861();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        getDelegate().mo28862();
    }

    @Override // Yue.InterfaceC3285
    @InterfaceC3647
    public void onSupportActionModeFinished(@InterfaceC6391 AbstractC3086 abstractC3086) {
    }

    @Override // Yue.InterfaceC3285
    @InterfaceC3647
    public void onSupportActionModeStarted(@InterfaceC6391 AbstractC3086 abstractC3086) {
    }

    @Deprecated
    public void onSupportContentChanged() {
    }

    public boolean onSupportNavigateUp() {
        Intent supportParentActivityIntent = getSupportParentActivityIntent();
        if (supportParentActivityIntent == null) {
            return false;
        }
        if (!supportShouldUpRecreateTask(supportParentActivityIntent)) {
            supportNavigateUpTo(supportParentActivityIntent);
            return true;
        }
        C7736 c7736M24610 = C7736.m24610(this);
        onCreateSupportNavigateUpTaskStack(c7736M24610);
        onPrepareSupportNavigateUpTaskStack(c7736M24610);
        c7736M24610.m24621();
        try {
            C3090.m6301(this);
            return true;
        } catch (IllegalStateException unused) {
            finish();
            return true;
        }
    }

    @Override // android.app.Activity
    public void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        getDelegate().mo28872(charSequence);
    }

    @Override // Yue.InterfaceC3285
    @InterfaceC6490
    public AbstractC3086 onWindowStartingSupportActionMode(@InterfaceC6391 AbstractC3086.InterfaceC0044 interfaceC0044) {
        return null;
    }

    @Override // android.app.Activity
    public void openOptionsMenu() {
        AbstractC1583 supportActionBar = getSupportActionBar();
        if (getWindow().hasFeature(0)) {
            if (supportActionBar == null || !supportActionBar.mo28720()) {
                super.openOptionsMenu();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(@InterfaceC5683 int i) {
        initializeViewTreeOwners();
        getDelegate().mo28864(i);
    }

    public void setSupportActionBar(@InterfaceC6490 Toolbar toolbar) {
        getDelegate().mo28870(toolbar);
    }

    @Deprecated
    public void setSupportProgress(int i) {
    }

    @Deprecated
    public void setSupportProgressBarIndeterminate(boolean z) {
    }

    @Deprecated
    public void setSupportProgressBarIndeterminateVisibility(boolean z) {
    }

    @Deprecated
    public void setSupportProgressBarVisibility(boolean z) {
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(@InterfaceC7651 int i) {
        super.setTheme(i);
        getDelegate().mo28871(i);
    }

    @InterfaceC6490
    public AbstractC3086 startSupportActionMode(@InterfaceC6391 AbstractC3086.InterfaceC0044 interfaceC0044) {
        return getDelegate().mo28873(interfaceC0044);
    }

    @Override // androidx.fragment.app.FragmentActivity
    public void supportInvalidateOptionsMenu() {
        getDelegate().mo28853();
    }

    public void supportNavigateUpTo(@InterfaceC6391 Intent intent) {
        C6355.m19861(this, intent);
    }

    public boolean supportRequestWindowFeature(int i) {
        return getDelegate().mo28863(i);
    }

    public boolean supportShouldUpRecreateTask(@InterfaceC6391 Intent intent) {
        return C6355.m19862(this, intent);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final void m28686() {
        getSavedStateRegistry().m30806(DELEGATE_TAG, new C1581());
        addOnContextAvailableListener(new C1582());
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final boolean m28687(KeyEvent keyEvent) {
        return false;
    }

    @InterfaceC4183
    public AppCompatActivity(@InterfaceC5683 int i) {
        super(i);
        m28686();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        initializeViewTreeOwners();
        getDelegate().mo28865(view);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        getDelegate().mo28866(view, layoutParams);
    }
}
