package androidx.appcompat.app;

import android.R;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AbstractC0991;
import androidx.appcompat.widget.C0977;
import androidx.appcompat.widget.C1018;
import androidx.appcompat.widget.Toolbar;
import androidx.collection.C1110;
import androidx.core.os.C3011;
import androidx.fragment.app.FragmentActivity;
import com.android.p002dx.p005io.Opcodes;
import com.davemorrissey.labs.subscaleview.C0328R;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import p177.AbstractC8471;
import p177.AbstractC8478;
import p178.AbstractC8482;
import p178.C8487;
import p208.AbstractC8639;
import p208.C8637;
import p208.C8646;
import p208.InterfaceC8640;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class AppCompatActivity extends FragmentActivity implements InterfaceC0943 {
    private static final String DELEGATE_TAG = "androidx:appcompat";
    private AbstractC0941 mDelegate;
    private Resources mResources;

    public AppCompatActivity() {
        initDelegate();
    }

    private void initDelegate() {
        getSavedStateRegistry().m13320(DELEGATE_TAG, new C0952(this));
        addOnContextAvailableListener(new C0944(this));
    }

    private boolean performMenuItemShortcut(KeyEvent keyEvent) {
        return false;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        LayoutInflaterFactory2C0915 layoutInflaterFactory2C0915 = (LayoutInflaterFactory2C0915) getDelegate();
        layoutInflaterFactory2C0915.m794();
        ((ViewGroup) layoutInflaterFactory2C0915.f505.findViewById(R.id.content)).addView(view, layoutParams);
        layoutInflaterFactory2C0915.f512.m881(layoutInflaterFactory2C0915.f513.getCallback());
    }

    /* JADX WARN: Removed duplicated region for block: B:165:0x0211 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00aa  */
    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void attachBaseContext(Context context) {
        Configuration configuration;
        Method method;
        LayoutInflaterFactory2C0915 layoutInflaterFactory2C0915 = (LayoutInflaterFactory2C0915) getDelegate();
        layoutInflaterFactory2C0915.f528 = true;
        int i = layoutInflaterFactory2C0915.f524;
        if (i == -100) {
            i = AbstractC0941.f618;
        }
        int iM775 = layoutInflaterFactory2C0915.m775(context, i);
        int i2 = 0;
        if (AbstractC0941.m887(context) && AbstractC0941.m887(context)) {
            if (Build.VERSION.SDK_INT < 33) {
                synchronized (AbstractC0941.f615) {
                    try {
                        C3011 c3011 = AbstractC0941.f619;
                        if (c3011 == null) {
                            if (AbstractC0941.f613 == null) {
                                AbstractC0941.f613 = C3011.m4534(AbstractC8482.m13481(context));
                            }
                            if (!AbstractC0941.f613.f6798.f6800.isEmpty()) {
                                AbstractC0941.f619 = AbstractC0941.f613;
                            }
                        } else if (!c3011.equals(AbstractC0941.f613)) {
                            C3011 c30112 = AbstractC0941.f619;
                            AbstractC0941.f613 = c30112;
                            AbstractC8482.m13474(context, c30112.f6798.f6800.toLanguageTags());
                        }
                    } finally {
                    }
                }
            } else if (!AbstractC0941.f616) {
                AbstractC0941.f620.execute(new RunnableC0947(context, i2));
            }
        }
        C3011 c3011M774 = LayoutInflaterFactory2C0915.m774(context);
        if (context instanceof ContextThemeWrapper) {
            try {
                ((ContextThemeWrapper) context).applyOverrideConfiguration(LayoutInflaterFactory2C0915.m773(context, iM775, c3011M774, null, false));
            } catch (IllegalStateException unused) {
                if (!(context instanceof C8637)) {
                }
            }
        } else if (!(context instanceof C8637)) {
            try {
                ((C8637) context).m13730(LayoutInflaterFactory2C0915.m773(context, iM775, c3011M774, null, false));
            } catch (IllegalStateException unused2) {
                if (LayoutInflaterFactory2C0915.f495) {
                }
            }
        } else if (LayoutInflaterFactory2C0915.f495) {
            Configuration configuration2 = new Configuration();
            configuration2.uiMode = -1;
            configuration2.fontScale = 0.0f;
            Configuration configuration3 = context.createConfigurationContext(configuration2).getResources().getConfiguration();
            Configuration configuration4 = context.getResources().getConfiguration();
            configuration3.uiMode = configuration4.uiMode;
            if (configuration3.equals(configuration4)) {
                configuration = null;
            } else {
                configuration = new Configuration();
                configuration.fontScale = 0.0f;
                if (configuration3.diff(configuration4) != 0) {
                    float f = configuration3.fontScale;
                    float f2 = configuration4.fontScale;
                    if (f != f2) {
                        configuration.fontScale = f2;
                    }
                    int i3 = configuration3.mcc;
                    int i4 = configuration4.mcc;
                    if (i3 != i4) {
                        configuration.mcc = i4;
                    }
                    int i5 = configuration3.mnc;
                    int i6 = configuration4.mnc;
                    if (i5 != i6) {
                        configuration.mnc = i6;
                    }
                    AbstractC0921.m812(configuration3, configuration4, configuration);
                    int i7 = configuration3.touchscreen;
                    int i8 = configuration4.touchscreen;
                    if (i7 != i8) {
                        configuration.touchscreen = i8;
                    }
                    int i9 = configuration3.keyboard;
                    int i10 = configuration4.keyboard;
                    if (i9 != i10) {
                        configuration.keyboard = i10;
                    }
                    int i11 = configuration3.keyboardHidden;
                    int i12 = configuration4.keyboardHidden;
                    if (i11 != i12) {
                        configuration.keyboardHidden = i12;
                    }
                    int i13 = configuration3.navigation;
                    int i14 = configuration4.navigation;
                    if (i13 != i14) {
                        configuration.navigation = i14;
                    }
                    int i15 = configuration3.navigationHidden;
                    int i16 = configuration4.navigationHidden;
                    if (i15 != i16) {
                        configuration.navigationHidden = i16;
                    }
                    int i17 = configuration3.orientation;
                    int i18 = configuration4.orientation;
                    if (i17 != i18) {
                        configuration.orientation = i18;
                    }
                    int i19 = configuration3.screenLayout & 15;
                    int i20 = configuration4.screenLayout & 15;
                    if (i19 != i20) {
                        configuration.screenLayout |= i20;
                    }
                    int i21 = configuration3.screenLayout & 192;
                    int i22 = configuration4.screenLayout & 192;
                    if (i21 != i22) {
                        configuration.screenLayout |= i22;
                    }
                    int i23 = configuration3.screenLayout & 48;
                    int i24 = configuration4.screenLayout & 48;
                    if (i23 != i24) {
                        configuration.screenLayout |= i24;
                    }
                    int i25 = configuration3.screenLayout & Opcodes.FILL_ARRAY_DATA_PAYLOAD;
                    int i26 = configuration4.screenLayout & Opcodes.FILL_ARRAY_DATA_PAYLOAD;
                    if (i25 != i26) {
                        configuration.screenLayout |= i26;
                    }
                    int i27 = configuration3.colorMode & 3;
                    int i28 = configuration4.colorMode & 3;
                    if (i27 != i28) {
                        configuration.colorMode |= i28;
                    }
                    int i29 = configuration3.colorMode & 12;
                    int i30 = configuration4.colorMode & 12;
                    if (i29 != i30) {
                        configuration.colorMode |= i30;
                    }
                    int i31 = configuration3.uiMode & 15;
                    int i32 = configuration4.uiMode & 15;
                    if (i31 != i32) {
                        configuration.uiMode |= i32;
                    }
                    int i33 = configuration3.uiMode & 48;
                    int i34 = configuration4.uiMode & 48;
                    if (i33 != i34) {
                        configuration.uiMode |= i34;
                    }
                    int i35 = configuration3.screenWidthDp;
                    int i36 = configuration4.screenWidthDp;
                    if (i35 != i36) {
                        configuration.screenWidthDp = i36;
                    }
                    int i37 = configuration3.screenHeightDp;
                    int i38 = configuration4.screenHeightDp;
                    if (i37 != i38) {
                        configuration.screenHeightDp = i38;
                    }
                    int i39 = configuration3.smallestScreenWidthDp;
                    int i40 = configuration4.smallestScreenWidthDp;
                    if (i39 != i40) {
                        configuration.smallestScreenWidthDp = i40;
                    }
                    int i41 = configuration3.densityDpi;
                    int i42 = configuration4.densityDpi;
                    if (i41 != i42) {
                        configuration.densityDpi = i42;
                    }
                }
            }
            Configuration configurationM773 = LayoutInflaterFactory2C0915.m773(context, iM775, c3011M774, configuration, true);
            C8637 c8637 = new C8637(context, C0328R.style.Theme_AppCompat_Empty);
            c8637.m13730(configurationM773);
            try {
                if (context.getTheme() != null) {
                    Resources.Theme theme = c8637.getTheme();
                    if (Build.VERSION.SDK_INT >= 29) {
                        AbstractC8478.m13472(theme);
                    } else {
                        synchronized (AbstractC8471.f21080) {
                            if (AbstractC8471.f21085) {
                                method = AbstractC8471.f21079;
                                if (method != null) {
                                }
                            } else {
                                try {
                                    Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", null);
                                    AbstractC8471.f21079 = declaredMethod;
                                    declaredMethod.setAccessible(true);
                                } catch (NoSuchMethodException e) {
                                    Log.i("ResourcesCompat", "Failed to retrieve rebase() method", e);
                                }
                                AbstractC8471.f21085 = true;
                                method = AbstractC8471.f21079;
                                if (method != null) {
                                    try {
                                        method.invoke(theme, null);
                                    } catch (IllegalAccessException | InvocationTargetException e2) {
                                        Log.i("ResourcesCompat", "Failed to invoke rebase() method via reflection", e2);
                                        AbstractC8471.f21079 = null;
                                    }
                                }
                            }
                        }
                    }
                }
            } catch (NullPointerException unused3) {
            }
            context = c8637;
        }
        super.attachBaseContext(context);
    }

    @Override // android.app.Activity
    public void closeOptionsMenu() {
        AbstractC0935 supportActionBar = getSupportActionBar();
        if (getWindow().hasFeature(0)) {
            if (supportActionBar == null || !supportActionBar.mo733()) {
                super.closeOptionsMenu();
            }
        }
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        AbstractC0935 supportActionBar = getSupportActionBar();
        if (keyCode == 82 && supportActionBar != null && supportActionBar.mo742(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public <T extends View> T findViewById(int i) {
        LayoutInflaterFactory2C0915 layoutInflaterFactory2C0915 = (LayoutInflaterFactory2C0915) getDelegate();
        layoutInflaterFactory2C0915.m794();
        return (T) layoutInflaterFactory2C0915.f513.findViewById(i);
    }

    public AbstractC0941 getDelegate() {
        if (this.mDelegate == null) {
            ExecutorC0938 executorC0938 = AbstractC0941.f620;
            this.mDelegate = new LayoutInflaterFactory2C0915(this, null, this, this);
        }
        return this.mDelegate;
    }

    public InterfaceC0934 getDrawerToggleDelegate() {
        ((LayoutInflaterFactory2C0915) getDelegate()).getClass();
        return new C0924();
    }

    @Override // android.app.Activity
    public MenuInflater getMenuInflater() {
        LayoutInflaterFactory2C0915 layoutInflaterFactory2C0915 = (LayoutInflaterFactory2C0915) getDelegate();
        if (layoutInflaterFactory2C0915.f521 == null) {
            layoutInflaterFactory2C0915.m777();
            AbstractC0935 abstractC0935 = layoutInflaterFactory2C0915.f510;
            layoutInflaterFactory2C0915.f521 = new C8646(abstractC0935 != null ? abstractC0935.mo729() : layoutInflaterFactory2C0915.f514);
        }
        return layoutInflaterFactory2C0915.f521;
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        Resources resources = this.mResources;
        if (resources == null) {
            int i = AbstractC0991.f951;
        }
        return resources == null ? super.getResources() : resources;
    }

    public AbstractC0935 getSupportActionBar() {
        LayoutInflaterFactory2C0915 layoutInflaterFactory2C0915 = (LayoutInflaterFactory2C0915) getDelegate();
        layoutInflaterFactory2C0915.m777();
        return layoutInflaterFactory2C0915.f510;
    }

    public Intent getSupportParentActivityIntent() {
        return AbstractC8482.m13477(this);
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
        getDelegate().mo789();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        LayoutInflaterFactory2C0915 layoutInflaterFactory2C0915 = (LayoutInflaterFactory2C0915) getDelegate();
        if (layoutInflaterFactory2C0915.f498 && layoutInflaterFactory2C0915.f504) {
            layoutInflaterFactory2C0915.m777();
            AbstractC0935 abstractC0935 = layoutInflaterFactory2C0915.f510;
            if (abstractC0935 != null) {
                abstractC0935.mo738();
            }
        }
        C0977 c0977M1100 = C0977.m1100();
        Context context = layoutInflaterFactory2C0915.f514;
        synchronized (c0977M1100) {
            C1018 c1018 = c0977M1100.f917;
            synchronized (c1018) {
                C1110 c1110 = (C1110) c1018.f1030.get(context);
                if (c1110 != null) {
                    c1110.m1387();
                }
            }
        }
        layoutInflaterFactory2C0915.f525 = new Configuration(layoutInflaterFactory2C0915.f514.getResources().getConfiguration());
        layoutInflaterFactory2C0915.m798(false, false);
        if (this.mResources != null) {
            this.mResources.updateConfiguration(super.getResources().getConfiguration(), super.getResources().getDisplayMetrics());
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onContentChanged() {
        onSupportContentChanged();
    }

    public void onCreateSupportNavigateUpTaskStack(C8487 c8487) {
        ArrayList arrayList = c8487.f21133;
        AppCompatActivity appCompatActivity = c8487.f21132;
        Intent supportParentActivityIntent = getSupportParentActivityIntent();
        if (supportParentActivityIntent == null) {
            supportParentActivityIntent = AbstractC8482.m13477(this);
        }
        if (supportParentActivityIntent != null) {
            ComponentName component = supportParentActivityIntent.getComponent();
            if (component == null) {
                component = supportParentActivityIntent.resolveActivity(appCompatActivity.getPackageManager());
            }
            int size = arrayList.size();
            try {
                for (Intent intentM13476 = AbstractC8482.m13476(appCompatActivity, component); intentM13476 != null; intentM13476 = AbstractC8482.m13476(appCompatActivity, intentM13476.getComponent())) {
                    arrayList.add(size, intentM13476);
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
        getDelegate().mo787();
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
        AbstractC0935 supportActionBar = getSupportActionBar();
        if (menuItem.getItemId() != 16908332 || supportActionBar == null || (supportActionBar.mo730() & 4) == 0) {
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
        ((LayoutInflaterFactory2C0915) getDelegate()).m794();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        LayoutInflaterFactory2C0915 layoutInflaterFactory2C0915 = (LayoutInflaterFactory2C0915) getDelegate();
        layoutInflaterFactory2C0915.m777();
        AbstractC0935 abstractC0935 = layoutInflaterFactory2C0915.f510;
        if (abstractC0935 != null) {
            abstractC0935.mo735(true);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        ((LayoutInflaterFactory2C0915) getDelegate()).m798(true, false);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        LayoutInflaterFactory2C0915 layoutInflaterFactory2C0915 = (LayoutInflaterFactory2C0915) getDelegate();
        layoutInflaterFactory2C0915.m777();
        AbstractC0935 abstractC0935 = layoutInflaterFactory2C0915.f510;
        if (abstractC0935 != null) {
            abstractC0935.mo735(false);
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
        C8487 c8487 = new C8487(this);
        onCreateSupportNavigateUpTaskStack(c8487);
        onPrepareSupportNavigateUpTaskStack(c8487);
        ArrayList arrayList = c8487.f21133;
        if (arrayList.isEmpty()) {
            C6755.m11870("No intents added to TaskStackBuilder; cannot startActivities");
            return false;
        }
        Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        c8487.f21132.startActivities(intentArr, null);
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
        getDelegate().mo803(charSequence);
    }

    @Override // androidx.appcompat.app.InterfaceC0943
    public AbstractC8639 onWindowStartingSupportActionMode(InterfaceC8640 interfaceC8640) {
        return null;
    }

    @Override // android.app.Activity
    public void openOptionsMenu() {
        AbstractC0935 supportActionBar = getSupportActionBar();
        if (getWindow().hasFeature(0)) {
            if (supportActionBar == null || !supportActionBar.mo739()) {
                super.openOptionsMenu();
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i) {
        initializeViewTreeOwners();
        getDelegate().mo800(i);
    }

    public void setSupportActionBar(Toolbar toolbar) {
        LayoutInflaterFactory2C0915 layoutInflaterFactory2C0915 = (LayoutInflaterFactory2C0915) getDelegate();
        if (layoutInflaterFactory2C0915.f515 instanceof Activity) {
            layoutInflaterFactory2C0915.m777();
            AbstractC0935 abstractC0935 = layoutInflaterFactory2C0915.f510;
            if (abstractC0935 instanceof C0958) {
                C6755.m11870("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
                return;
            }
            layoutInflaterFactory2C0915.f521 = null;
            if (abstractC0935 != null) {
                abstractC0935.mo737();
            }
            layoutInflaterFactory2C0915.f510 = null;
            if (toolbar != null) {
                Object obj = layoutInflaterFactory2C0915.f515;
                C0907 c0907 = new C0907(toolbar, obj instanceof Activity ? ((Activity) obj).getTitle() : layoutInflaterFactory2C0915.f520, layoutInflaterFactory2C0915.f512);
                layoutInflaterFactory2C0915.f510 = c0907;
                layoutInflaterFactory2C0915.f512.f587 = c0907.f470;
                toolbar.setBackInvokedCallbackEnabled(true);
            } else {
                layoutInflaterFactory2C0915.f512.f587 = null;
            }
            layoutInflaterFactory2C0915.mo789();
        }
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        super.setTheme(i);
        ((LayoutInflaterFactory2C0915) getDelegate()).f540 = i;
    }

    public AbstractC8639 startSupportActionMode(InterfaceC8640 interfaceC8640) {
        return getDelegate().mo796(interfaceC8640);
    }

    @Override // androidx.fragment.app.FragmentActivity
    public void supportInvalidateOptionsMenu() {
        getDelegate().mo789();
    }

    public void supportNavigateUpTo(Intent intent) {
        navigateUpTo(intent);
    }

    public boolean supportRequestWindowFeature(int i) {
        return getDelegate().mo801(i);
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
        getDelegate().mo804(view);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        getDelegate().mo802(view, layoutParams);
    }

    @Deprecated
    public void onSupportContentChanged() {
    }

    public void onLocalesChanged(C3011 c3011) {
    }

    public void onNightModeChanged(int i) {
    }

    public void onPrepareSupportNavigateUpTaskStack(C8487 c8487) {
    }

    @Override // androidx.appcompat.app.InterfaceC0943
    public void onSupportActionModeFinished(AbstractC8639 abstractC8639) {
    }

    @Override // androidx.appcompat.app.InterfaceC0943
    public void onSupportActionModeStarted(AbstractC8639 abstractC8639) {
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
