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
import java.lang.reflect.Method;
import java.util.ArrayList;

/* JADX INFO: renamed from: c3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractActivityC1244c3 extends AbstractActivityC2148ki implements InterfaceC1437g3, InterfaceC2133kA {

    /* JADX INFO: renamed from: z */
    public LayoutInflaterFactory2C0176E3 f4231z;

    @Override // android.app.Activity
    public void addContentView(View r4, ViewGroup.LayoutParams r5) {
        initializeViewTreeOwners();
        LayoutInflaterFactory2C0176E3 r0 = (LayoutInflaterFactory2C0176E3) getDelegate();
        r0.m357w();
        ((ViewGroup) r0.f460A.findViewById(R.id.content)).addView(r4, r5);
        r0.f496m.m5304a(r0.f495l.getCallback());
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context r10) {
        LayoutInflaterFactory2C0176E3 r0 = (LayoutInflaterFactory2C0176E3) getDelegate();
        r0.f474O = true;
        int r2 = r0.f478S;
        if (r2 != (-100)) goto L6;
        r2 = AbstractC2397q3.f8399b;
    L6:
        int r02 = r0.m334C(r10, r2);
        if (AbstractC2397q3.m4833b(r10) == true) goto L9;
    L37:
        C1105Zo r22 = LayoutInflaterFactory2C0176E3.m330p(r10);
        if ((r10 instanceof ContextThemeWrapper) == false) goto L43;
        ((ContextThemeWrapper) r10).applyOverrideConfiguration(LayoutInflaterFactory2C0176E3.m331t(r10, r02, r22, null, false));     // Catch: IllegalStateException -> L146
    L144:
        super.attachBaseContext(r10);
        return;
    L43:
        if ((r10 instanceof C0147Db) == false) goto L48;
        ((C0147Db) r10).m265a(LayoutInflaterFactory2C0176E3.m331t(r10, r02, r22, null, false));     // Catch: IllegalStateException -> L147
    L48:
        if (LayoutInflaterFactory2C0176E3.f459j0 == false) goto L144;
        Configuration r3 = new Configuration();
        r3.uiMode = -1;
        r3.fontScale = 0.0f;
        Configuration r32 = r10.createConfigurationContext(r3).getResources().getConfiguration();
        Configuration r6 = r10.getResources().getConfiguration();
        r32.uiMode = r6.uiMode;
        if (r32.equals(r6) == true) goto L118;
        Configuration r7 = new Configuration();
        r7.fontScale = 0.0f;
        if (r32.diff(r6) == 0) goto L119;
        float r4 = r32.fontScale;
        float r8 = r6.fontScale;
        if (r4 == r8) goto L58;
        r7.fontScale = r8;
    L58:
        int r42 = r32.mcc;
        int r82 = r6.mcc;
        if (r42 == r82) goto L61;
        r7.mcc = r82;
    L61:
        int r43 = r32.mnc;
        int r83 = r6.mnc;
        if (r43 == r83) goto L64;
        r7.mnc = r83;
    L64:
        AbstractC2612v3.m5122a(r32, r6, r7);
        int r44 = r32.touchscreen;
        int r84 = r6.touchscreen;
        if (r44 == r84) goto L67;
        r7.touchscreen = r84;
    L67:
        int r45 = r32.keyboard;
        int r85 = r6.keyboard;
        if (r45 == r85) goto L70;
        r7.keyboard = r85;
    L70:
        int r46 = r32.keyboardHidden;
        int r86 = r6.keyboardHidden;
        if (r46 == r86) goto L73;
        r7.keyboardHidden = r86;
    L73:
        int r47 = r32.navigation;
        int r87 = r6.navigation;
        if (r47 == r87) goto L76;
        r7.navigation = r87;
    L76:
        int r48 = r32.navigationHidden;
        int r88 = r6.navigationHidden;
        if (r48 == r88) goto L79;
        r7.navigationHidden = r88;
    L79:
        int r49 = r32.orientation;
        int r89 = r6.orientation;
        if (r49 == r89) goto L82;
        r7.orientation = r89;
    L82:
        int r410 = r32.screenLayout & 15;
        int r810 = r6.screenLayout & 15;
        if (r410 == r810) goto L85;
        r7.screenLayout |= r810;
    L85:
        int r411 = r32.screenLayout & 192;
        int r811 = r6.screenLayout & 192;
        if (r411 == r811) goto L88;
        r7.screenLayout |= r811;
    L88:
        int r412 = r32.screenLayout & 48;
        int r812 = r6.screenLayout & 48;
        if (r412 == r812) goto L91;
        r7.screenLayout |= r812;
    L91:
        int r413 = r32.screenLayout & 768;
        int r813 = r6.screenLayout & 768;
        if (r413 == r813) goto L94;
        r7.screenLayout |= r813;
    L94:
        int r414 = r32.colorMode & 3;
        int r814 = r6.colorMode & 3;
        if (r414 == r814) goto L97;
        r7.colorMode |= r814;
    L97:
        int r415 = r32.colorMode & 12;
        int r815 = r6.colorMode & 12;
        if (r415 == r815) goto L100;
        r7.colorMode |= r815;
    L100:
        int r416 = r32.uiMode & 15;
        int r816 = r6.uiMode & 15;
        if (r416 == r816) goto L103;
        r7.uiMode |= r816;
    L103:
        int r417 = r32.uiMode & 48;
        int r817 = r6.uiMode & 48;
        if (r417 == r817) goto L106;
        r7.uiMode |= r817;
    L106:
        int r418 = r32.screenWidthDp;
        int r818 = r6.screenWidthDp;
        if (r418 == r818) goto L109;
        r7.screenWidthDp = r818;
    L109:
        int r419 = r32.screenHeightDp;
        int r819 = r6.screenHeightDp;
        if (r419 == r819) goto L112;
        r7.screenHeightDp = r819;
    L112:
        int r420 = r32.smallestScreenWidthDp;
        int r820 = r6.smallestScreenWidthDp;
        if (r420 == r820) goto L115;
        r7.smallestScreenWidthDp = r820;
    L115:
        int r33 = r32.densityDpi;
        int r421 = r6.densityDpi;
        if (r33 == r421) goto L119;
        r7.densityDpi = r421;
    L119:
        Configuration r03 = LayoutInflaterFactory2C0176E3.m331t(r10, r02, r22, r7, true);
        C0147Db r23 = new C0147Db(r10, io.github.cherrywechat.R.style.Theme_AppCompat_Empty);
        r23.m265a(r03);
        if (r10.getTheme() == null) goto L143;
        Resources.Theme r102 = r23.getTheme();
        if (Build.VERSION.SDK_INT < 29) goto L125;
        AbstractC2785z4.m5358c(r102);
        goto L143
    L125:
        Object r04 = AbstractC0585Nj.f1900e;
        monitor-enter(r04);
    L131:
        th = move-exception;
        throw th;
    L128:
        if (AbstractC0585Nj.f1902g == false) goto L158;
    L134:
        Method r1 = AbstractC0585Nj.f1901f;     // Catch: Throwable -> L131
        if (r1 != null) goto L156;
    L139:
        monitor-exit(r04);     // Catch: Throwable -> L131
        goto L143
    L156:
        r1.invoke(r102, null);     // Catch: Throwable -> L131 Throwable -> L138
    L138:
        AbstractC0585Nj.f1901f = null;     // Catch: Throwable -> L131
        goto L139
    L158:
        Method r34 = Resources.Theme.class.getDeclaredMethod("rebase", null);     // Catch: Throwable -> L131 NoSuchMethodException -> L148
        AbstractC0585Nj.f1901f = r34;     // Catch: Throwable -> L131 NoSuchMethodException -> L148
        r34.setAccessible(true);     // Catch: Throwable -> L131 NoSuchMethodException -> L148
    L133:
        AbstractC0585Nj.f1902g = true;     // Catch: Throwable -> L131
    L143:
        r10 = r23;
        goto L144
    L118:
        r7 = null;
        goto L119
    L9:
        if (AbstractC2397q3.m4833b(r10) == false) goto L37;
        if (Build.VERSION.SDK_INT >= 33) goto L14;
        Object r24 = AbstractC2397q3.f8406i;
        monitor-enter(r24);
        C1105Zo r422 = AbstractC2397q3.f8400c;     // Catch: Throwable -> L23
        if (r422 != null) goto L31;
        if (AbstractC2397q3.f8401d != null) goto L26;
        AbstractC2397q3.f8401d = C1105Zo.m2029a(AbstractC0585Nj.m1131L(r10));     // Catch: Throwable -> L23
    L26:
        if (AbstractC2397q3.f8401d.f3499a.f4071a.isEmpty() == false) goto L29;
        monitor-exit(r24);     // Catch: Throwable -> L23
        goto L37
    L29:
        AbstractC2397q3.f8400c = AbstractC2397q3.f8401d;     // Catch: Throwable -> L23
    L33:
        monitor-exit(r24);     // Catch: Throwable -> L23
        goto L37
    L31:
        if (r422.equals(AbstractC2397q3.f8401d) == true) goto L33;
        C1105Zo r423 = AbstractC2397q3.f8400c;     // Catch: Throwable -> L23
        AbstractC2397q3.f8401d = r423;     // Catch: Throwable -> L23
        AbstractC0585Nj.m1130K(r10, r423.f3499a.f4071a.toLanguageTags());     // Catch: Throwable -> L23
    L23:
        th = move-exception;
        throw th;
    L14:
        if (AbstractC2397q3.f8403f == true) goto L37;
        AbstractC2397q3.f8398a.execute(new RunnableC2126k3(r10, 0));
        goto L37
    }

    @Override // android.app.Activity
    public void closeOptionsMenu() {
        AbstractC2257n0 r0 = getSupportActionBar();
        if (getWindow().hasFeature(0) == false) goto L9;
        if (r0 != null) goto L6;
    L7:
        super.closeOptionsMenu();
        return;
    L6:
        if (r0.mo4586a() == false) goto L7;
        return;
    }

    @Override // p000.AbstractActivityC0790Sa, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent r4) {
        int r0 = r4.getKeyCode();
        AbstractC2257n0 r1 = getSupportActionBar();
        if (r0 != 82) goto L10;
        if (r1 == null) goto L10;
        if (r1.mo4589k(r4) == false) goto L10;
        return true;
    L10:
        return super.dispatchKeyEvent(r4);
    }

    @Override // android.app.Activity
    public <T extends View> T findViewById(int r2) {
        LayoutInflaterFactory2C0176E3 r0 = (LayoutInflaterFactory2C0176E3) getDelegate();
        r0.m357w();
        return (T) r0.f495l.findViewById(r2);
    }

    public AbstractC2397q3 getDelegate() {
        if (this.f4231z != null) goto L6;
        ExecutorC2303o3 r0 = AbstractC2397q3.f8398a;
        this.f4231z = new LayoutInflaterFactory2C0176E3(this, null, this, this);
    L6:
        return this.f4231z;
    }

    public InterfaceC2394q0 getDrawerToggleDelegate() {
        ((LayoutInflaterFactory2C0176E3) getDelegate()).getClass();
        return new C1456gf(21);
    }

    @Override // android.app.Activity
    public MenuInflater getMenuInflater() {
        LayoutInflaterFactory2C0176E3 r0 = (LayoutInflaterFactory2C0176E3) getDelegate();
        if (r0.f499p != null) goto L10;
        r0.m332A();
        AbstractC2257n0 r2 = r0.f498o;
        if (r2 == null) goto L7;
        Context r22 = r2.mo4505e();
    L8:
        r0.f499p = new C0515Lz(r22);
        goto L10
    L7:
        r22 = r0.f494k;
    L10:
        return r0.f499p;
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        int r0 = AbstractC0573ND.f1867a;
        return super.getResources();
    }

    public AbstractC2257n0 getSupportActionBar() {
        LayoutInflaterFactory2C0176E3 r0 = (LayoutInflaterFactory2C0176E3) getDelegate();
        r0.m332A();
        return r0.f498o;
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
    public void onConfigurationChanged(Configuration r5) {
        super.onConfigurationChanged(r5);
        LayoutInflaterFactory2C0176E3 r52 = (LayoutInflaterFactory2C0176E3) getDelegate();
        if (r52.f465F == true) goto L5;
    L9:
        C0262G3 r0 = C0262G3.m539a();
        Context r1 = r52.f494k;
        monitor-enter(r0);
        C2776yw r2 = r0.f844a;     // Catch: Throwable -> L25
        monitor-enter(r2);     // Catch: Throwable -> L25
        C2640vp r12 = (C2640vp) r2.f9430b.get(r1);     // Catch: Throwable -> L17
        if (r12 == null) goto L19;
        r12.m5166a();     // Catch: Throwable -> L17
    L19:
        monitor-exit(r2);     // Catch: Throwable -> L25
        monitor-exit(r0);
        r52.f477R = new Configuration(r52.f494k.getResources().getConfiguration());
        r52.m350m(false, false);
        return;
    L17:
        th = move-exception;
        throw th;     // Catch: Throwable -> L25
    L25:
        th = move-exception;
        throw th;
    L5:
        if (r52.f509z == false) goto L9;
        r52.m332A();
        AbstractC2257n0 r02 = r52.f498o;
        if (r02 == null) goto L9;
        r02.mo4507h();
        goto L9
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onContentChanged() {
        onSupportContentChanged();
    }

    public void onCreateSupportNavigateUpTaskStack(C2181lA r5) {
        ArrayList r0 = r5.f7611a;
        AbstractActivityC1244c3 r52 = r5.f7612b;
        Intent r1 = getSupportParentActivityIntent();
        if (r1 != null) goto L5;
        r1 = AbstractC1293cr.m2559y(this);
    L5:
        if (r1 == null) goto L20;
        ComponentName r2 = r1.getComponent();
        if (r2 != null) goto L9;
        r2 = r1.resolveActivity(r52.getPackageManager());
    L9:
        int r3 = r0.size();
        Intent r22 = AbstractC1293cr.m2560z(r52, r2);     // Catch: PackageManager.NameNotFoundException -> L14
    L11:
        if (r22 == null) goto L16;
        r0.add(r3, r22);     // Catch: PackageManager.NameNotFoundException -> L14
        r22 = AbstractC1293cr.m2560z(r52, r22.getComponent());     // Catch: PackageManager.NameNotFoundException -> L14
        goto L11
    L16:
        r0.add(r1);
        return;
    L14:
        e = move-exception;
        throw new IllegalArgumentException(e);
    }

    @Override // p000.AbstractActivityC2148ki, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        getDelegate().mo343e();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int r1, KeyEvent r2) {
        return super.onKeyDown(r1, r2);
    }

    public void onLocalesChanged(C1105Zo r1) {
    }

    @Override // p000.AbstractActivityC2148ki, p000.AbstractActivityC0833Ta, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int r2, MenuItem r3) {
        if (super.onMenuItemSelected(r2, r3) == false) goto L6;
        return true;
    L6:
        AbstractC2257n0 r22 = getSupportActionBar();
        if (r3.getItemId() != 16908332) goto L13;
        if (r22 != null) goto L10;
        return false;
    L10:
        if ((r22.mo4504d() & 4) != 0) goto L12;
        return false;
    L12:
        return onSupportNavigateUp();
    L13:
        return false;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuOpened(int r1, Menu r2) {
        return super.onMenuOpened(r1, r2);
    }

    public void onNightModeChanged(int r1) {
    }

    @Override // p000.AbstractActivityC0833Ta, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int r1, Menu r2) {
        super.onPanelClosed(r1, r2);
    }

    @Override // android.app.Activity
    public void onPostCreate(Bundle r1) {
        super.onPostCreate(r1);
        ((LayoutInflaterFactory2C0176E3) getDelegate()).m357w();
    }

    @Override // p000.AbstractActivityC2148ki, android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        LayoutInflaterFactory2C0176E3 r0 = (LayoutInflaterFactory2C0176E3) getDelegate();
        r0.m332A();
        AbstractC2257n0 r02 = r0.f498o;
        if (r02 == null) goto L6;
        r02.mo4510n(true);
        return;
    }

    public void onPrepareSupportNavigateUpTaskStack(C2181lA r1) {
    }

    @Override // p000.AbstractActivityC2148ki, android.app.Activity
    public void onStart() {
        super.onStart();
        ((LayoutInflaterFactory2C0176E3) getDelegate()).m350m(true, false);
    }

    @Override // p000.AbstractActivityC2148ki, android.app.Activity
    public void onStop() {
        super.onStop();
        LayoutInflaterFactory2C0176E3 r0 = (LayoutInflaterFactory2C0176E3) getDelegate();
        r0.m332A();
        AbstractC2257n0 r02 = r0.f498o;
        if (r02 == null) goto L6;
        r02.mo4510n(false);
        return;
    }

    @Override // p000.InterfaceC1437g3
    public void onSupportActionModeFinished(AbstractC0345I0 r1) {
    }

    @Override // p000.InterfaceC1437g3
    public void onSupportActionModeStarted(AbstractC0345I0 r1) {
    }

    @Deprecated
    public void onSupportContentChanged() {
    }

    public boolean onSupportNavigateUp() {
        Intent r0 = getSupportParentActivityIntent();
        if (r0 != null) goto L5;
        return false;
    L5:
        if (supportShouldUpRecreateTask(r0) == false) goto L14;
        C2181lA r02 = new C2181lA(this);
        onCreateSupportNavigateUpTaskStack(r02);
        onPrepareSupportNavigateUpTaskStack(r02);
        ArrayList r2 = r02.f7611a;
        if (r2.isEmpty() == true) goto L13;
        Intent[] r22 = (Intent[]) r2.toArray(new Intent[0]);
        r22[0] = new Intent(r22[0]).addFlags(268484608);
        r02.f7612b.startActivities(r22, null);
        finishAffinity();     // Catch: IllegalStateException -> L11
        return true;
    L11:
        finish();
        return true;
    L13:
        throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
    L14:
        supportNavigateUpTo(r0);
        return true;
    }

    @Override // android.app.Activity
    public void onTitleChanged(CharSequence r1, int r2) {
        super.onTitleChanged(r1, r2);
        getDelegate().mo348k(r1);
    }

    @Override // p000.InterfaceC1437g3
    public AbstractC0345I0 onWindowStartingSupportActionMode(InterfaceC0302H0 r1) {
        return null;
    }

    @Override // android.app.Activity
    public void openOptionsMenu() {
        AbstractC2257n0 r0 = getSupportActionBar();
        if (getWindow().hasFeature(0) == false) goto L9;
        if (r0 != null) goto L6;
    L7:
        super.openOptionsMenu();
        return;
    L6:
        if (r0.mo4590l() == false) goto L7;
        return;
    }

    @Override // android.app.Activity
    public void setContentView(int r2) {
        initializeViewTreeOwners();
        getDelegate().mo345h(r2);
    }

    public void setSupportActionBar(Toolbar r5) {
        LayoutInflaterFactory2C0176E3 r0 = (LayoutInflaterFactory2C0176E3) getDelegate();
        if ((r0.f493j instanceof Activity) == true) goto L5;
        return;
    L5:
        r0.m332A();
        AbstractC2257n0 r1 = r0.f498o;
        if ((r1 instanceof C2229mF) == true) goto L21;
        r0.f499p = null;
        if (r1 == null) goto L10;
        r1.mo4588i();
    L10:
        r0.f498o = null;
        if (r5 == null) goto L17;
        Object r2 = r0.f493j;
        if ((r2 instanceof Activity) == false) goto L15;
        CharSequence r22 = ((Activity) r2).getTitle();
    L16:
        C2577uB r12 = new C2577uB(r5, r22, r0.f496m);
        r0.f498o = r12;
        WindowCallbackC2741y3 r23 = r0.f496m;
        r23.f9346b = r12.f8931c;
        r5.setBackInvokedCallbackEnabled(true);
    L18:
        r0.mo341a();
        return;
    L15:
        r22 = r0.f500q;
        goto L16
    L17:
        r0.f496m.f9346b = null;
        goto L18
    L21:
        throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
    }

    @Deprecated
    public void setSupportProgress(int r1) {
    }

    @Deprecated
    public void setSupportProgressBarIndeterminate(boolean r1) {
    }

    @Deprecated
    public void setSupportProgressBarIndeterminateVisibility(boolean r1) {
    }

    @Deprecated
    public void setSupportProgressBarVisibility(boolean r1) {
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int r2) {
        super.setTheme(r2);
        ((LayoutInflaterFactory2C0176E3) getDelegate()).f479T = r2;
    }

    public AbstractC0345I0 startSupportActionMode(InterfaceC0302H0 r2) {
        return getDelegate().mo349l(r2);
    }

    public void supportInvalidateOptionsMenu() {
        getDelegate().mo341a();
    }

    public void supportNavigateUpTo(Intent r1) {
        navigateUpTo(r1);
    }

    public boolean supportRequestWindowFeature(int r2) {
        return getDelegate().mo344g(r2);
    }

    public boolean supportShouldUpRecreateTask(Intent r1) {
        return shouldUpRecreateTask(r1);
    }

    @Override // p000.AbstractActivityC0833Ta, android.app.Activity
    public void setContentView(View r2) {
        initializeViewTreeOwners();
        getDelegate().mo346i(r2);
    }

    @Override // android.app.Activity
    public void setContentView(View r2, ViewGroup.LayoutParams r3) {
        initializeViewTreeOwners();
        getDelegate().mo347j(r2, r3);
    }
}
