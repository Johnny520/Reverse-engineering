package p000a;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.C0979c;
import androidx.activity.ComponentActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.viewmodel.C1137R;
import androidx.savedstate.C1224a;
import androidx.savedstate.C1225b;
import java.util.ArrayList;
import p000a.AbstractC0255O0;
import p000a.AbstractC0272P;
import p000a.C0340Se;

/* JADX INFO: renamed from: a.E0 */
/* JADX INFO: loaded from: classes.dex */
public class ActivityC0075E0 extends ActivityC0422X6 implements InterfaceC0147I0, C0340Se.a {
    private static final String DELEGATE_TAG = "androidx:appcompat";
    private AbstractC0255O0 mDelegate;
    private Resources mResources;

    /* JADX INFO: renamed from: a.E0$a */
    public class a implements C1224a.b {
        public a() {
        }

        @Override // androidx.savedstate.C1224a.b
        /* JADX INFO: renamed from: a */
        public final Bundle mo57a() {
            Bundle bundle = new Bundle();
            ActivityC0075E0.this.getDelegate().getClass();
            return bundle;
        }
    }

    /* JADX INFO: renamed from: a.E0$b */
    public class b implements InterfaceC0482ac {
        public b() {
        }

        @Override // p000a.InterfaceC0482ac
        /* JADX INFO: renamed from: a */
        public final void mo125a(ComponentActivity componentActivity) {
            ActivityC0075E0 activityC0075E0 = ActivityC0075E0.this;
            AbstractC0255O0 delegate = activityC0075E0.getDelegate();
            delegate.mo706k();
            activityC0075E0.getSavedStateRegistry().m3007a(ActivityC0075E0.DELEGATE_TAG);
            delegate.mo709o();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ActivityC0075E0() {
        initDelegate();
    }

    private void initDelegate() {
        getSavedStateRegistry().m3009c(DELEGATE_TAG, new a());
        addOnContextAvailableListener(new b());
    }

    private void initViewTreeOwners() {
        C0235Mg.m628a(getWindow().getDecorView(), this);
        View decorView = getWindow().getDecorView();
        C0631i9.m1482e(decorView, "<this>");
        decorView.setTag(C1137R.id.view_tree_view_model_store_owner, this);
        C1225b.m3011a(getWindow().getDecorView(), this);
        C0979c.m2290a(getWindow().getDecorView(), this);
    }

    private boolean performMenuItemShortcut(KeyEvent keyEvent) {
        return false;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initViewTreeOwners();
        getDelegate().mo698c(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(getDelegate().mo699d(context));
    }

    @Override // android.app.Activity
    public void closeOptionsMenu() {
        AbstractC0200L supportActionBar = getSupportActionBar();
        if (getWindow().hasFeature(0)) {
            if (supportActionBar == null || !supportActionBar.mo555a()) {
                super.closeOptionsMenu();
            }
        }
    }

    @Override // p000a.ActivityC0060D3, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        AbstractC0200L supportActionBar = getSupportActionBar();
        if (keyCode == 82 && supportActionBar != null && supportActionBar.mo564j(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public <T extends View> T findViewById(int i) {
        return (T) getDelegate().mo700e(i);
    }

    public AbstractC0255O0 getDelegate() {
        if (this.mDelegate == null) {
            AbstractC0255O0.c cVar = AbstractC0255O0.f886a;
            this.mDelegate = new LayoutInflaterFactory2C0291Q0(this, null, this, this);
        }
        return this.mDelegate;
    }

    public InterfaceC0236N getDrawerToggleDelegate() {
        return getDelegate().mo702g();
    }

    @Override // android.app.Activity
    public MenuInflater getMenuInflater() {
        return getDelegate().mo704i();
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        Resources resources = this.mResources;
        if (resources == null) {
            int i = C0562eg.f2104a;
        }
        return resources == null ? super.getResources() : resources;
    }

    public AbstractC0200L getSupportActionBar() {
        return getDelegate().mo705j();
    }

    @Override // p000a.C0340Se.a
    public Intent getSupportParentActivityIntent() {
        return C0140Hb.m364a(this);
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
        getDelegate().mo707l();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        getDelegate().mo708n(configuration);
        if (this.mResources != null) {
            this.mResources.updateConfiguration(super.getResources().getConfiguration(), super.getResources().getDisplayMetrics());
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onContentChanged() {
        onSupportContentChanged();
    }

    public void onCreateSupportNavigateUpTaskStack(C0340Se c0340Se) {
        c0340Se.getClass();
        Intent supportParentActivityIntent = getSupportParentActivityIntent();
        if (supportParentActivityIntent == null) {
            supportParentActivityIntent = C0140Hb.m364a(this);
        }
        if (supportParentActivityIntent != null) {
            ComponentName component = supportParentActivityIntent.getComponent();
            ActivityC0075E0 activityC0075E0 = c0340Se.f1203b;
            if (component == null) {
                component = supportParentActivityIntent.resolveActivity(activityC0075E0.getPackageManager());
            }
            ArrayList<Intent> arrayList = c0340Se.f1202a;
            int size = arrayList.size();
            try {
                for (Intent intentM365b = C0140Hb.m365b(activityC0075E0, component); intentM365b != null; intentM365b = C0140Hb.m365b(activityC0075E0, intentM365b.getComponent())) {
                    arrayList.add(size, intentM365b);
                }
                arrayList.add(supportParentActivityIntent);
            } catch (PackageManager.NameNotFoundException e) {
                Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
                throw new IllegalArgumentException(e);
            }
        }
    }

    @Override // p000a.ActivityC0422X6, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        getDelegate().mo710p();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (performMenuItemShortcut(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    public void onLocalesChanged(C0174J9 c0174j9) {
    }

    @Override // p000a.ActivityC0422X6, androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        AbstractC0200L supportActionBar = getSupportActionBar();
        if (menuItem.getItemId() != 16908332 || supportActionBar == null || (supportActionBar.mo558d() & 4) == 0) {
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
    public void onPanelClosed(int i, Menu menu) {
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        getDelegate().mo711q();
    }

    @Override // p000a.ActivityC0422X6, android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        getDelegate().mo712r();
    }

    public void onPrepareSupportNavigateUpTaskStack(C0340Se c0340Se) {
    }

    @Override // p000a.ActivityC0422X6, android.app.Activity
    public void onStart() {
        super.onStart();
        getDelegate().mo713s();
    }

    @Override // p000a.ActivityC0422X6, android.app.Activity
    public void onStop() {
        super.onStop();
        getDelegate().mo714t();
    }

    @Override // p000a.InterfaceC0147I0
    public void onSupportActionModeFinished(AbstractC0272P abstractC0272P) {
    }

    @Override // p000a.InterfaceC0147I0
    public void onSupportActionModeStarted(AbstractC0272P abstractC0272P) {
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
        C0340Se c0340Se = new C0340Se(this);
        onCreateSupportNavigateUpTaskStack(c0340Se);
        onPrepareSupportNavigateUpTaskStack(c0340Se);
        ArrayList<Intent> arrayList = c0340Se.f1202a;
        if (arrayList.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        c0340Se.f1203b.startActivities(intentArr, null);
        try {
            finishAffinity();
            return true;
        } catch (IllegalStateException unused) {
            finish();
            return true;
        }
    }

    @Override // android.app.Activity
    public void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        getDelegate().mo696B(charSequence);
    }

    @Override // p000a.InterfaceC0147I0
    public AbstractC0272P onWindowStartingSupportActionMode(AbstractC0272P.a aVar) {
        return null;
    }

    @Override // android.app.Activity
    public void openOptionsMenu() {
        AbstractC0200L supportActionBar = getSupportActionBar();
        if (getWindow().hasFeature(0)) {
            if (supportActionBar == null || !supportActionBar.mo565k()) {
                super.openOptionsMenu();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i) {
        initViewTreeOwners();
        getDelegate().mo716w(i);
    }

    public void setSupportActionBar(Toolbar toolbar) {
        getDelegate().mo719z(toolbar);
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
    public void setTheme(int i) {
        super.setTheme(i);
        getDelegate().mo695A(i);
    }

    public AbstractC0272P startSupportActionMode(AbstractC0272P.a aVar) {
        return getDelegate().mo697C(aVar);
    }

    @Override // p000a.ActivityC0422X6
    public void supportInvalidateOptionsMenu() {
        getDelegate().mo707l();
    }

    public void supportNavigateUpTo(Intent intent) {
        navigateUpTo(intent);
    }

    public boolean supportRequestWindowFeature(int i) {
        return getDelegate().mo715v(i);
    }

    public boolean supportShouldUpRecreateTask(Intent intent) {
        return shouldUpRecreateTask(intent);
    }

    public ActivityC0075E0(int i) {
        super(i);
        initDelegate();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        initViewTreeOwners();
        getDelegate().mo717x(view);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initViewTreeOwners();
        getDelegate().mo718y(view, layoutParams);
    }
}
