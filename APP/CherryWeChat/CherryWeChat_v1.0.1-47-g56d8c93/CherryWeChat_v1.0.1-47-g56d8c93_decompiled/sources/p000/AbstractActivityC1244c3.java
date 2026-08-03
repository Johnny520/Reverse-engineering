package p000;

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
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* JADX INFO: renamed from: c3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractActivityC1244c3 extends AbstractActivityC2148ki implements InterfaceC1437g3, InterfaceC2133kA {

    /* JADX INFO: renamed from: z */
    public LayoutInflaterFactory2C0176E3 f4231z;

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        LayoutInflaterFactory2C0176E3 layoutInflaterFactory2C0176E3 = (LayoutInflaterFactory2C0176E3) getDelegate();
        layoutInflaterFactory2C0176E3.m357w();
        ((ViewGroup) layoutInflaterFactory2C0176E3.f460A.findViewById(R.id.content)).addView(view, layoutParams);
        layoutInflaterFactory2C0176E3.f496m.m5304a(layoutInflaterFactory2C0176E3.f495l.getCallback());
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00aa  */
    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void attachBaseContext(Context context) {
        Configuration configuration;
        LayoutInflaterFactory2C0176E3 layoutInflaterFactory2C0176E3 = (LayoutInflaterFactory2C0176E3) getDelegate();
        layoutInflaterFactory2C0176E3.f474O = true;
        int i = layoutInflaterFactory2C0176E3.f478S;
        if (i == -100) {
            i = AbstractC2397q3.f8399b;
        }
        int iM334C = layoutInflaterFactory2C0176E3.m334C(context, i);
        if (AbstractC2397q3.m4833b(context) && AbstractC2397q3.m4833b(context)) {
            if (Build.VERSION.SDK_INT < 33) {
                synchronized (AbstractC2397q3.f8406i) {
                    try {
                        C1105Zo c1105Zo = AbstractC2397q3.f8400c;
                        if (c1105Zo == null) {
                            if (AbstractC2397q3.f8401d == null) {
                                AbstractC2397q3.f8401d = C1105Zo.m2029a(AbstractC0585Nj.m1131L(context));
                            }
                            if (!AbstractC2397q3.f8401d.f3499a.f4071a.isEmpty()) {
                                AbstractC2397q3.f8400c = AbstractC2397q3.f8401d;
                            }
                        } else if (!c1105Zo.equals(AbstractC2397q3.f8401d)) {
                            C1105Zo c1105Zo2 = AbstractC2397q3.f8400c;
                            AbstractC2397q3.f8401d = c1105Zo2;
                            AbstractC0585Nj.m1130K(context, c1105Zo2.f3499a.f4071a.toLanguageTags());
                        }
                    } finally {
                    }
                }
            } else if (!AbstractC2397q3.f8403f) {
                AbstractC2397q3.f8398a.execute(new RunnableC2126k3(context, 0));
            }
        }
        C1105Zo c1105ZoM330p = LayoutInflaterFactory2C0176E3.m330p(context);
        if (context instanceof ContextThemeWrapper) {
            try {
                ((ContextThemeWrapper) context).applyOverrideConfiguration(LayoutInflaterFactory2C0176E3.m331t(context, iM334C, c1105ZoM330p, null, false));
            } catch (IllegalStateException unused) {
                if (!(context instanceof C0147Db)) {
                }
            }
        } else if (!(context instanceof C0147Db)) {
            try {
                ((C0147Db) context).m265a(LayoutInflaterFactory2C0176E3.m331t(context, iM334C, c1105ZoM330p, null, false));
            } catch (IllegalStateException unused2) {
                if (LayoutInflaterFactory2C0176E3.f459j0) {
                }
            }
        } else if (LayoutInflaterFactory2C0176E3.f459j0) {
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
                    int i2 = configuration3.mcc;
                    int i3 = configuration4.mcc;
                    if (i2 != i3) {
                        configuration.mcc = i3;
                    }
                    int i4 = configuration3.mnc;
                    int i5 = configuration4.mnc;
                    if (i4 != i5) {
                        configuration.mnc = i5;
                    }
                    AbstractC2612v3.m5122a(configuration3, configuration4, configuration);
                    int i6 = configuration3.touchscreen;
                    int i7 = configuration4.touchscreen;
                    if (i6 != i7) {
                        configuration.touchscreen = i7;
                    }
                    int i8 = configuration3.keyboard;
                    int i9 = configuration4.keyboard;
                    if (i8 != i9) {
                        configuration.keyboard = i9;
                    }
                    int i10 = configuration3.keyboardHidden;
                    int i11 = configuration4.keyboardHidden;
                    if (i10 != i11) {
                        configuration.keyboardHidden = i11;
                    }
                    int i12 = configuration3.navigation;
                    int i13 = configuration4.navigation;
                    if (i12 != i13) {
                        configuration.navigation = i13;
                    }
                    int i14 = configuration3.navigationHidden;
                    int i15 = configuration4.navigationHidden;
                    if (i14 != i15) {
                        configuration.navigationHidden = i15;
                    }
                    int i16 = configuration3.orientation;
                    int i17 = configuration4.orientation;
                    if (i16 != i17) {
                        configuration.orientation = i17;
                    }
                    int i18 = configuration3.screenLayout & 15;
                    int i19 = configuration4.screenLayout & 15;
                    if (i18 != i19) {
                        configuration.screenLayout |= i19;
                    }
                    int i20 = configuration3.screenLayout & 192;
                    int i21 = configuration4.screenLayout & 192;
                    if (i20 != i21) {
                        configuration.screenLayout |= i21;
                    }
                    int i22 = configuration3.screenLayout & 48;
                    int i23 = configuration4.screenLayout & 48;
                    if (i22 != i23) {
                        configuration.screenLayout |= i23;
                    }
                    int i24 = configuration3.screenLayout & 768;
                    int i25 = configuration4.screenLayout & 768;
                    if (i24 != i25) {
                        configuration.screenLayout |= i25;
                    }
                    int i26 = configuration3.colorMode & 3;
                    int i27 = configuration4.colorMode & 3;
                    if (i26 != i27) {
                        configuration.colorMode |= i27;
                    }
                    int i28 = configuration3.colorMode & 12;
                    int i29 = configuration4.colorMode & 12;
                    if (i28 != i29) {
                        configuration.colorMode |= i29;
                    }
                    int i30 = configuration3.uiMode & 15;
                    int i31 = configuration4.uiMode & 15;
                    if (i30 != i31) {
                        configuration.uiMode |= i31;
                    }
                    int i32 = configuration3.uiMode & 48;
                    int i33 = configuration4.uiMode & 48;
                    if (i32 != i33) {
                        configuration.uiMode |= i33;
                    }
                    int i34 = configuration3.screenWidthDp;
                    int i35 = configuration4.screenWidthDp;
                    if (i34 != i35) {
                        configuration.screenWidthDp = i35;
                    }
                    int i36 = configuration3.screenHeightDp;
                    int i37 = configuration4.screenHeightDp;
                    if (i36 != i37) {
                        configuration.screenHeightDp = i37;
                    }
                    int i38 = configuration3.smallestScreenWidthDp;
                    int i39 = configuration4.smallestScreenWidthDp;
                    if (i38 != i39) {
                        configuration.smallestScreenWidthDp = i39;
                    }
                    int i40 = configuration3.densityDpi;
                    int i41 = configuration4.densityDpi;
                    if (i40 != i41) {
                        configuration.densityDpi = i41;
                    }
                }
            }
            Configuration configurationM331t = LayoutInflaterFactory2C0176E3.m331t(context, iM334C, c1105ZoM330p, configuration, true);
            C0147Db c0147Db = new C0147Db(context, io.github.cherrywechat.R.style.Theme_AppCompat_Empty);
            c0147Db.m265a(configurationM331t);
            try {
                if (context.getTheme() != null) {
                    Resources.Theme theme = c0147Db.getTheme();
                    if (Build.VERSION.SDK_INT >= 29) {
                        AbstractC2785z4.m5358c(theme);
                    } else {
                        synchronized (AbstractC0585Nj.f1900e) {
                            if (!AbstractC0585Nj.f1902g) {
                                try {
                                    Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", null);
                                    AbstractC0585Nj.f1901f = declaredMethod;
                                    declaredMethod.setAccessible(true);
                                } catch (NoSuchMethodException unused3) {
                                }
                                AbstractC0585Nj.f1902g = true;
                            }
                            Method method = AbstractC0585Nj.f1901f;
                            if (method != null) {
                                try {
                                    method.invoke(theme, null);
                                } catch (IllegalAccessException | InvocationTargetException unused4) {
                                    AbstractC0585Nj.f1901f = null;
                                }
                            }
                        }
                    }
                }
            } catch (NullPointerException unused5) {
            }
            context = c0147Db;
        }
        super.attachBaseContext(context);
    }

    @Override // android.app.Activity
    public void closeOptionsMenu() {
        AbstractC2257n0 supportActionBar = getSupportActionBar();
        if (getWindow().hasFeature(0)) {
            if (supportActionBar == null || !supportActionBar.mo4586a()) {
                super.closeOptionsMenu();
            }
        }
    }

    @Override // p000.AbstractActivityC0790Sa, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        AbstractC2257n0 supportActionBar = getSupportActionBar();
        if (keyCode == 82 && supportActionBar != null && supportActionBar.mo4589k(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public <T extends View> T findViewById(int i) {
        LayoutInflaterFactory2C0176E3 layoutInflaterFactory2C0176E3 = (LayoutInflaterFactory2C0176E3) getDelegate();
        layoutInflaterFactory2C0176E3.m357w();
        return (T) layoutInflaterFactory2C0176E3.f495l.findViewById(i);
    }

    public AbstractC2397q3 getDelegate() {
        if (this.f4231z == null) {
            ExecutorC2303o3 executorC2303o3 = AbstractC2397q3.f8398a;
            this.f4231z = new LayoutInflaterFactory2C0176E3(this, null, this, this);
        }
        return this.f4231z;
    }

    public InterfaceC2394q0 getDrawerToggleDelegate() {
        ((LayoutInflaterFactory2C0176E3) getDelegate()).getClass();
        return new C1456gf(21);
    }

    @Override // android.app.Activity
    public MenuInflater getMenuInflater() {
        LayoutInflaterFactory2C0176E3 layoutInflaterFactory2C0176E3 = (LayoutInflaterFactory2C0176E3) getDelegate();
        if (layoutInflaterFactory2C0176E3.f499p == null) {
            layoutInflaterFactory2C0176E3.m332A();
            AbstractC2257n0 abstractC2257n0 = layoutInflaterFactory2C0176E3.f498o;
            layoutInflaterFactory2C0176E3.f499p = new C0515Lz(abstractC2257n0 != null ? abstractC2257n0.mo4505e() : layoutInflaterFactory2C0176E3.f494k);
        }
        return layoutInflaterFactory2C0176E3.f499p;
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        int i = AbstractC0573ND.f1867a;
        return super.getResources();
    }

    public AbstractC2257n0 getSupportActionBar() {
        LayoutInflaterFactory2C0176E3 layoutInflaterFactory2C0176E3 = (LayoutInflaterFactory2C0176E3) getDelegate();
        layoutInflaterFactory2C0176E3.m332A();
        return layoutInflaterFactory2C0176E3.f498o;
    }

    @Override // p000.InterfaceC2133kA
    public Intent getSupportParentActivityIntent() {
        return AbstractC1293cr.m2559y(this);
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
        getDelegate().mo341a();
    }

    @Override // p000.AbstractActivityC0833Ta, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        LayoutInflaterFactory2C0176E3 layoutInflaterFactory2C0176E3 = (LayoutInflaterFactory2C0176E3) getDelegate();
        if (layoutInflaterFactory2C0176E3.f465F && layoutInflaterFactory2C0176E3.f509z) {
            layoutInflaterFactory2C0176E3.m332A();
            AbstractC2257n0 abstractC2257n0 = layoutInflaterFactory2C0176E3.f498o;
            if (abstractC2257n0 != null) {
                abstractC2257n0.mo4507h();
            }
        }
        C0262G3 c0262g3M539a = C0262G3.m539a();
        Context context = layoutInflaterFactory2C0176E3.f494k;
        synchronized (c0262g3M539a) {
            C2776yw c2776yw = c0262g3M539a.f844a;
            synchronized (c2776yw) {
                C2640vp c2640vp = (C2640vp) c2776yw.f9430b.get(context);
                if (c2640vp != null) {
                    c2640vp.m5166a();
                }
            }
        }
        layoutInflaterFactory2C0176E3.f477R = new Configuration(layoutInflaterFactory2C0176E3.f494k.getResources().getConfiguration());
        layoutInflaterFactory2C0176E3.m350m(false, false);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onContentChanged() {
        onSupportContentChanged();
    }

    public void onCreateSupportNavigateUpTaskStack(C2181lA c2181lA) {
        ArrayList arrayList = c2181lA.f7611a;
        AbstractActivityC1244c3 abstractActivityC1244c3 = c2181lA.f7612b;
        Intent supportParentActivityIntent = getSupportParentActivityIntent();
        if (supportParentActivityIntent == null) {
            supportParentActivityIntent = AbstractC1293cr.m2559y(this);
        }
        if (supportParentActivityIntent != null) {
            ComponentName component = supportParentActivityIntent.getComponent();
            if (component == null) {
                component = supportParentActivityIntent.resolveActivity(abstractActivityC1244c3.getPackageManager());
            }
            int size = arrayList.size();
            try {
                for (Intent intentM2560z = AbstractC1293cr.m2560z(abstractActivityC1244c3, component); intentM2560z != null; intentM2560z = AbstractC1293cr.m2560z(abstractActivityC1244c3, intentM2560z.getComponent())) {
                    arrayList.add(size, intentM2560z);
                }
                arrayList.add(supportParentActivityIntent);
            } catch (PackageManager.NameNotFoundException e) {
                throw new IllegalArgumentException(e);
            }
        }
    }

    @Override // p000.AbstractActivityC2148ki, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        getDelegate().mo343e();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        return super.onKeyDown(i, keyEvent);
    }

    public void onLocalesChanged(C1105Zo c1105Zo) {
    }

    @Override // p000.AbstractActivityC2148ki, p000.AbstractActivityC0833Ta, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        AbstractC2257n0 supportActionBar = getSupportActionBar();
        if (menuItem.getItemId() != 16908332 || supportActionBar == null || (supportActionBar.mo4504d() & 4) == 0) {
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

    @Override // p000.AbstractActivityC0833Ta, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        ((LayoutInflaterFactory2C0176E3) getDelegate()).m357w();
    }

    @Override // p000.AbstractActivityC2148ki, android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        LayoutInflaterFactory2C0176E3 layoutInflaterFactory2C0176E3 = (LayoutInflaterFactory2C0176E3) getDelegate();
        layoutInflaterFactory2C0176E3.m332A();
        AbstractC2257n0 abstractC2257n0 = layoutInflaterFactory2C0176E3.f498o;
        if (abstractC2257n0 != null) {
            abstractC2257n0.mo4510n(true);
        }
    }

    public void onPrepareSupportNavigateUpTaskStack(C2181lA c2181lA) {
    }

    @Override // p000.AbstractActivityC2148ki, android.app.Activity
    public void onStart() {
        super.onStart();
        ((LayoutInflaterFactory2C0176E3) getDelegate()).m350m(true, false);
    }

    @Override // p000.AbstractActivityC2148ki, android.app.Activity
    public void onStop() {
        super.onStop();
        LayoutInflaterFactory2C0176E3 layoutInflaterFactory2C0176E3 = (LayoutInflaterFactory2C0176E3) getDelegate();
        layoutInflaterFactory2C0176E3.m332A();
        AbstractC2257n0 abstractC2257n0 = layoutInflaterFactory2C0176E3.f498o;
        if (abstractC2257n0 != null) {
            abstractC2257n0.mo4510n(false);
        }
    }

    @Override // p000.InterfaceC1437g3
    public void onSupportActionModeFinished(AbstractC0345I0 abstractC0345I0) {
    }

    @Override // p000.InterfaceC1437g3
    public void onSupportActionModeStarted(AbstractC0345I0 abstractC0345I0) {
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
        C2181lA c2181lA = new C2181lA(this);
        onCreateSupportNavigateUpTaskStack(c2181lA);
        onPrepareSupportNavigateUpTaskStack(c2181lA);
        ArrayList arrayList = c2181lA.f7611a;
        if (arrayList.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        c2181lA.f7612b.startActivities(intentArr, null);
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
        getDelegate().mo348k(charSequence);
    }

    @Override // p000.InterfaceC1437g3
    public AbstractC0345I0 onWindowStartingSupportActionMode(InterfaceC0302H0 interfaceC0302H0) {
        return null;
    }

    @Override // android.app.Activity
    public void openOptionsMenu() {
        AbstractC2257n0 supportActionBar = getSupportActionBar();
        if (getWindow().hasFeature(0)) {
            if (supportActionBar == null || !supportActionBar.mo4590l()) {
                super.openOptionsMenu();
            }
        }
    }

    @Override // android.app.Activity
    public void setContentView(int i) {
        initializeViewTreeOwners();
        getDelegate().mo345h(i);
    }

    public void setSupportActionBar(Toolbar toolbar) {
        LayoutInflaterFactory2C0176E3 layoutInflaterFactory2C0176E3 = (LayoutInflaterFactory2C0176E3) getDelegate();
        if (layoutInflaterFactory2C0176E3.f493j instanceof Activity) {
            layoutInflaterFactory2C0176E3.m332A();
            AbstractC2257n0 abstractC2257n0 = layoutInflaterFactory2C0176E3.f498o;
            if (abstractC2257n0 instanceof C2229mF) {
                throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
            }
            layoutInflaterFactory2C0176E3.f499p = null;
            if (abstractC2257n0 != null) {
                abstractC2257n0.mo4588i();
            }
            layoutInflaterFactory2C0176E3.f498o = null;
            if (toolbar != null) {
                Object obj = layoutInflaterFactory2C0176E3.f493j;
                C2577uB c2577uB = new C2577uB(toolbar, obj instanceof Activity ? ((Activity) obj).getTitle() : layoutInflaterFactory2C0176E3.f500q, layoutInflaterFactory2C0176E3.f496m);
                layoutInflaterFactory2C0176E3.f498o = c2577uB;
                layoutInflaterFactory2C0176E3.f496m.f9346b = c2577uB.f8931c;
                toolbar.setBackInvokedCallbackEnabled(true);
            } else {
                layoutInflaterFactory2C0176E3.f496m.f9346b = null;
            }
            layoutInflaterFactory2C0176E3.mo341a();
        }
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
        ((LayoutInflaterFactory2C0176E3) getDelegate()).f479T = i;
    }

    public AbstractC0345I0 startSupportActionMode(InterfaceC0302H0 interfaceC0302H0) {
        return getDelegate().mo349l(interfaceC0302H0);
    }

    public void supportInvalidateOptionsMenu() {
        getDelegate().mo341a();
    }

    public void supportNavigateUpTo(Intent intent) {
        navigateUpTo(intent);
    }

    public boolean supportRequestWindowFeature(int i) {
        return getDelegate().mo344g(i);
    }

    public boolean supportShouldUpRecreateTask(Intent intent) {
        return shouldUpRecreateTask(intent);
    }

    @Override // p000.AbstractActivityC0833Ta, android.app.Activity
    public void setContentView(View view) {
        initializeViewTreeOwners();
        getDelegate().mo346i(view);
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        getDelegate().mo347j(view, layoutParams);
    }
}
