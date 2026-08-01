package androidx.appcompat.app;

import android.R;
import android.app.Activity;
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
import androidx.appcompat.widget.AbstractC0144;
import androidx.appcompat.widget.C0130;
import androidx.appcompat.widget.C0171;
import androidx.appcompat.widget.Toolbar;
import androidx.collection.C0263;
import androidx.core.os.C2178;
import androidx.fragment.app.FragmentActivity;
import java.util.ArrayList;
import p162.AbstractC7652;
import p162.C7657;
import p192.AbstractC7809;
import p192.C7816;
import p192.InterfaceC7810;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public class AppCompatActivity extends FragmentActivity implements InterfaceC0096 {
    private static final String DELEGATE_TAG = "androidx:appcompat";
    private AbstractC0094 mDelegate;
    private Resources mResources;

    public AppCompatActivity() {
        initDelegate();
    }

    private void initDelegate() {
        getSavedStateRegistry().m12732(DELEGATE_TAG, new C0105(this));
        addOnContextAvailableListener(new C0097(this));
    }

    private boolean performMenuItemShortcut(KeyEvent keyEvent) {
        return false;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        LayoutInflaterFactory2C0068 layoutInflaterFactory2C0068 = (LayoutInflaterFactory2C0068) getDelegate();
        layoutInflaterFactory2C0068.m233();
        ((ViewGroup) layoutInflaterFactory2C0068.f160.findViewById(R.id.content)).addView(view, layoutParams);
        layoutInflaterFactory2C0068.f167.m320(layoutInflaterFactory2C0068.f168.getCallback());
    }

    /* JADX WARN: Removed duplicated region for block: B:165:0x0211 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00aa  */
    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void attachBaseContext(android.content.Context r10) {
        /*
            Method dump skipped, instruction units count: 554
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatActivity.attachBaseContext(android.content.Context):void");
    }

    @Override // android.app.Activity
    public void closeOptionsMenu() {
        AbstractC0088 supportActionBar = getSupportActionBar();
        if (getWindow().hasFeature(0)) {
            if (supportActionBar == null || !supportActionBar.mo172()) {
                super.closeOptionsMenu();
            }
        }
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        AbstractC0088 supportActionBar = getSupportActionBar();
        if (keyCode == 82 && supportActionBar != null && supportActionBar.mo181(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public <T extends View> T findViewById(int i) {
        LayoutInflaterFactory2C0068 layoutInflaterFactory2C0068 = (LayoutInflaterFactory2C0068) getDelegate();
        layoutInflaterFactory2C0068.m233();
        return (T) layoutInflaterFactory2C0068.f168.findViewById(i);
    }

    public AbstractC0094 getDelegate() {
        if (this.mDelegate == null) {
            ExecutorC0091 executorC0091 = AbstractC0094.f275;
            this.mDelegate = new LayoutInflaterFactory2C0068(this, null, this, this);
        }
        return this.mDelegate;
    }

    public InterfaceC0087 getDrawerToggleDelegate() {
        ((LayoutInflaterFactory2C0068) getDelegate()).getClass();
        return new C0077();
    }

    @Override // android.app.Activity
    public MenuInflater getMenuInflater() {
        LayoutInflaterFactory2C0068 layoutInflaterFactory2C0068 = (LayoutInflaterFactory2C0068) getDelegate();
        if (layoutInflaterFactory2C0068.f176 == null) {
            layoutInflaterFactory2C0068.m216();
            AbstractC0088 abstractC0088 = layoutInflaterFactory2C0068.f165;
            layoutInflaterFactory2C0068.f176 = new C7816(abstractC0088 != null ? abstractC0088.mo168() : layoutInflaterFactory2C0068.f169);
        }
        return layoutInflaterFactory2C0068.f176;
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        Resources resources = this.mResources;
        if (resources == null) {
            int i = AbstractC0144.f606;
        }
        return resources == null ? super.getResources() : resources;
    }

    public AbstractC0088 getSupportActionBar() {
        LayoutInflaterFactory2C0068 layoutInflaterFactory2C0068 = (LayoutInflaterFactory2C0068) getDelegate();
        layoutInflaterFactory2C0068.m216();
        return layoutInflaterFactory2C0068.f165;
    }

    public Intent getSupportParentActivityIntent() {
        return AbstractC7652.m12889(this);
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
        getDelegate().mo228();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        LayoutInflaterFactory2C0068 layoutInflaterFactory2C0068 = (LayoutInflaterFactory2C0068) getDelegate();
        if (layoutInflaterFactory2C0068.f153 && layoutInflaterFactory2C0068.f159) {
            layoutInflaterFactory2C0068.m216();
            AbstractC0088 abstractC0088 = layoutInflaterFactory2C0068.f165;
            if (abstractC0088 != null) {
                abstractC0088.mo177();
            }
        }
        C0130 c0130M539 = C0130.m539();
        Context context = layoutInflaterFactory2C0068.f169;
        synchronized (c0130M539) {
            C0171 c0171 = c0130M539.f572;
            synchronized (c0171) {
                C0263 c0263 = (C0263) c0171.f685.get(context);
                if (c0263 != null) {
                    c0263.m826();
                }
            }
        }
        layoutInflaterFactory2C0068.f180 = new Configuration(layoutInflaterFactory2C0068.f169.getResources().getConfiguration());
        layoutInflaterFactory2C0068.m237(false, false);
        if (this.mResources != null) {
            this.mResources.updateConfiguration(super.getResources().getConfiguration(), super.getResources().getDisplayMetrics());
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onContentChanged() {
        onSupportContentChanged();
    }

    public void onCreateSupportNavigateUpTaskStack(C7657 c7657) {
        ArrayList arrayList = c7657.f20793;
        AppCompatActivity appCompatActivity = c7657.f20792;
        Intent supportParentActivityIntent = getSupportParentActivityIntent();
        if (supportParentActivityIntent == null) {
            supportParentActivityIntent = AbstractC7652.m12889(this);
        }
        if (supportParentActivityIntent != null) {
            ComponentName component = supportParentActivityIntent.getComponent();
            if (component == null) {
                component = supportParentActivityIntent.resolveActivity(appCompatActivity.getPackageManager());
            }
            int size = arrayList.size();
            try {
                for (Intent intentM12888 = AbstractC7652.m12888(appCompatActivity, component); intentM12888 != null; intentM12888 = AbstractC7652.m12888(appCompatActivity, intentM12888.getComponent())) {
                    arrayList.add(size, intentM12888);
                }
                arrayList.add(supportParentActivityIntent);
            } catch (PackageManager.NameNotFoundException e) {
                Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
                throw new IllegalArgumentException(e);
            }
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        getDelegate().mo226();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (performMenuItemShortcut(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        AbstractC0088 supportActionBar = getSupportActionBar();
        if (menuItem.getItemId() != 16908332 || supportActionBar == null || (supportActionBar.mo169() & 4) == 0) {
            return false;
        }
        return onSupportNavigateUp();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuOpened(int i, Menu menu) {
        return super.onMenuOpened(i, menu);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        ((LayoutInflaterFactory2C0068) getDelegate()).m233();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        LayoutInflaterFactory2C0068 layoutInflaterFactory2C0068 = (LayoutInflaterFactory2C0068) getDelegate();
        layoutInflaterFactory2C0068.m216();
        AbstractC0088 abstractC0088 = layoutInflaterFactory2C0068.f165;
        if (abstractC0088 != null) {
            abstractC0088.mo174(true);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        ((LayoutInflaterFactory2C0068) getDelegate()).m237(true, false);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        LayoutInflaterFactory2C0068 layoutInflaterFactory2C0068 = (LayoutInflaterFactory2C0068) getDelegate();
        layoutInflaterFactory2C0068.m216();
        AbstractC0088 abstractC0088 = layoutInflaterFactory2C0068.f165;
        if (abstractC0088 != null) {
            abstractC0088.mo174(false);
        }
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
        C7657 c7657 = new C7657(this);
        onCreateSupportNavigateUpTaskStack(c7657);
        onPrepareSupportNavigateUpTaskStack(c7657);
        ArrayList arrayList = c7657.f20793;
        if (arrayList.isEmpty()) {
            C5919.m11250("No intents added to TaskStackBuilder; cannot startActivities");
            return false;
        }
        Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        c7657.f20792.startActivities(intentArr, null);
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
        getDelegate().mo242(charSequence);
    }

    @Override // androidx.appcompat.app.InterfaceC0096
    public AbstractC7809 onWindowStartingSupportActionMode(InterfaceC7810 interfaceC7810) {
        return null;
    }

    @Override // android.app.Activity
    public void openOptionsMenu() {
        AbstractC0088 supportActionBar = getSupportActionBar();
        if (getWindow().hasFeature(0)) {
            if (supportActionBar == null || !supportActionBar.mo178()) {
                super.openOptionsMenu();
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i) {
        initializeViewTreeOwners();
        getDelegate().mo239(i);
    }

    public void setSupportActionBar(Toolbar toolbar) {
        LayoutInflaterFactory2C0068 layoutInflaterFactory2C0068 = (LayoutInflaterFactory2C0068) getDelegate();
        if (layoutInflaterFactory2C0068.f170 instanceof Activity) {
            layoutInflaterFactory2C0068.m216();
            AbstractC0088 abstractC0088 = layoutInflaterFactory2C0068.f165;
            if (abstractC0088 instanceof C0111) {
                C5919.m11250("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
                return;
            }
            layoutInflaterFactory2C0068.f176 = null;
            if (abstractC0088 != null) {
                abstractC0088.mo176();
            }
            layoutInflaterFactory2C0068.f165 = null;
            if (toolbar != null) {
                Object obj = layoutInflaterFactory2C0068.f170;
                C0060 c0060 = new C0060(toolbar, obj instanceof Activity ? ((Activity) obj).getTitle() : layoutInflaterFactory2C0068.f175, layoutInflaterFactory2C0068.f167);
                layoutInflaterFactory2C0068.f165 = c0060;
                layoutInflaterFactory2C0068.f167.f242 = c0060.f125;
                toolbar.setBackInvokedCallbackEnabled(true);
            } else {
                layoutInflaterFactory2C0068.f167.f242 = null;
            }
            layoutInflaterFactory2C0068.mo228();
        }
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        super.setTheme(i);
        ((LayoutInflaterFactory2C0068) getDelegate()).f195 = i;
    }

    public AbstractC7809 startSupportActionMode(InterfaceC7810 interfaceC7810) {
        return getDelegate().mo235(interfaceC7810);
    }

    @Override // androidx.fragment.app.FragmentActivity
    public void supportInvalidateOptionsMenu() {
        getDelegate().mo228();
    }

    public void supportNavigateUpTo(Intent intent) {
        navigateUpTo(intent);
    }

    public boolean supportRequestWindowFeature(int i) {
        return getDelegate().mo240(i);
    }

    public boolean supportShouldUpRecreateTask(Intent intent) {
        return shouldUpRecreateTask(intent);
    }

    public AppCompatActivity(int i) {
        super(i);
        initDelegate();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        initializeViewTreeOwners();
        getDelegate().mo243(view);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        getDelegate().mo241(view, layoutParams);
    }

    @Deprecated
    public void onSupportContentChanged() {
    }

    public void onLocalesChanged(C2178 c2178) {
    }

    public void onNightModeChanged(int i) {
    }

    public void onPrepareSupportNavigateUpTaskStack(C7657 c7657) {
    }

    @Override // androidx.appcompat.app.InterfaceC0096
    public void onSupportActionModeFinished(AbstractC7809 abstractC7809) {
    }

    @Override // androidx.appcompat.app.InterfaceC0096
    public void onSupportActionModeStarted(AbstractC7809 abstractC7809) {
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
}
