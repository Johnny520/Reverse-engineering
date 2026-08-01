package p061e;

import android.R;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.activity.AbstractActivityC0376g;
import androidx.fragment.app.AbstractComponentCallbacksC0434l;
import androidx.fragment.app.C0417H;
import androidx.fragment.app.C0435m;
import androidx.fragment.app.C0436n;
import androidx.fragment.app.C0437o;
import androidx.fragment.app.C0448z;
import androidx.lifecycle.C0486u;
import androidx.lifecycle.EnumC0478m;
import androidx.lifecycle.EnumC0479n;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import p004C.C0064h;
import p004C.C0066j;
import p020K.C0161a;
import p024M.C0190d;
import p027N0.AbstractC0223g;
import p052b1.AbstractC0503h;
import p066g.C0564d;
import p066g.C0569i;
import p066g.C0571k;
import p069i.AbstractC0712r1;
import p069i.C0635N0;
import p069i.C0697m1;
import p069i.C0719u;
import p075l.C0745c;
import p075l.C0747e;
import p075l.C0754l;
import p083q.AbstractC0788b;
import p083q.AbstractC0798l;

/* JADX INFO: renamed from: e.i */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractActivityC0533i extends AbstractActivityC0376g implements InterfaceC0534j {

    /* JADX INFO: renamed from: r */
    public boolean f1751r;

    /* JADX INFO: renamed from: s */
    public boolean f1752s;

    /* JADX INFO: renamed from: u */
    public LayoutInflaterFactory2C0545u f1754u;

    /* JADX INFO: renamed from: p */
    public final C0066j f1749p = new C0066j(11, new C0437o(this));

    /* JADX INFO: renamed from: q */
    public final C0486u f1750q = new C0486u(this);

    /* JADX INFO: renamed from: t */
    public boolean f1753t = true;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractActivityC0533i() {
        ((C0190d) this.f895f.f547d).m398f("android:support:fragments", new C0435m(this, 0));
        m638f(new C0436n(this, 0));
        ((C0190d) this.f895f.f547d).m398f("androidx:appcompat", new C0435m(this, 1));
        m638f(new C0436n(this, 1));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public static boolean m1071l(C0448z c0448z) {
        boolean zM1071l = false;
        for (AbstractComponentCallbacksC0434l abstractComponentCallbacksC0434l : c0448z.f1432c.m127q()) {
            if (abstractComponentCallbacksC0434l != null) {
                C0437o c0437o = abstractComponentCallbacksC0434l.f1383t;
                if ((c0437o == null ? null : c0437o.f1398h) != null) {
                    zM1071l |= m1071l(abstractComponentCallbacksC0434l.m840e());
                }
                C0417H c0417h = abstractComponentCallbacksC0434l.f1361N;
                EnumC0479n enumC0479n = EnumC0479n.f1520d;
                if (c0417h != null) {
                    c0417h.m807e();
                    if (c0417h.f1267c.f1528c.compareTo(enumC0479n) >= 0) {
                        abstractComponentCallbacksC0434l.f1361N.f1267c.m933g();
                        zM1071l = true;
                    }
                }
                if (abstractComponentCallbacksC0434l.f1360M.f1528c.compareTo(enumC0479n) >= 0) {
                    abstractComponentCallbacksC0434l.f1360M.m933g();
                    zM1071l = true;
                }
            }
        }
        return zM1071l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Activity
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m1074k();
        LayoutInflaterFactory2C0545u layoutInflaterFactory2C0545u = (LayoutInflaterFactory2C0545u) m1072i();
        layoutInflaterFactory2C0545u.m1114u();
        ((ViewGroup) layoutInflaterFactory2C0545u.f1836u.findViewById(R.id.content)).addView(view, layoutParams);
        layoutInflaterFactory2C0545u.f1822g.m1097a(layoutInflaterFactory2C0545u.f1821f.getCallback());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01d8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0041  */
    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void attachBaseContext(Context context) {
        Configuration configuration;
        Method method;
        LayoutInflaterFactory2C0545u layoutInflaterFactory2C0545u = (LayoutInflaterFactory2C0545u) m1072i();
        layoutInflaterFactory2C0545u.f1802I = true;
        int i2 = layoutInflaterFactory2C0545u.f1806M;
        if (i2 == -100) {
            i2 = -100;
        }
        int iM1102A = layoutInflaterFactory2C0545u.m1102A(context, i2);
        if (LayoutInflaterFactory2C0545u.f1793c0 && (context instanceof ContextThemeWrapper)) {
            try {
                ((ContextThemeWrapper) context).applyOverrideConfiguration(LayoutInflaterFactory2C0545u.m1101r(context, iM1102A, null, false));
            } catch (IllegalStateException unused) {
                if (!(context instanceof C0564d)) {
                }
            }
        } else if (!(context instanceof C0564d)) {
            try {
                ((C0564d) context).m1131a(LayoutInflaterFactory2C0545u.m1101r(context, iM1102A, null, false));
            } catch (IllegalStateException unused2) {
                if (LayoutInflaterFactory2C0545u.f1792b0) {
                }
            }
        } else if (LayoutInflaterFactory2C0545u.f1792b0) {
            int i3 = Build.VERSION.SDK_INT;
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
                    int i4 = configuration3.mcc;
                    int i5 = configuration4.mcc;
                    if (i4 != i5) {
                        configuration.mcc = i5;
                    }
                    int i6 = configuration3.mnc;
                    int i7 = configuration4.mnc;
                    if (i6 != i7) {
                        configuration.mnc = i7;
                    }
                    LocaleList locales = configuration3.getLocales();
                    LocaleList locales2 = configuration4.getLocales();
                    if (!locales.equals(locales2)) {
                        configuration.setLocales(locales2);
                        configuration.locale = configuration4.locale;
                    }
                    int i8 = configuration3.touchscreen;
                    int i9 = configuration4.touchscreen;
                    if (i8 != i9) {
                        configuration.touchscreen = i9;
                    }
                    int i10 = configuration3.keyboard;
                    int i11 = configuration4.keyboard;
                    if (i10 != i11) {
                        configuration.keyboard = i11;
                    }
                    int i12 = configuration3.keyboardHidden;
                    int i13 = configuration4.keyboardHidden;
                    if (i12 != i13) {
                        configuration.keyboardHidden = i13;
                    }
                    int i14 = configuration3.navigation;
                    int i15 = configuration4.navigation;
                    if (i14 != i15) {
                        configuration.navigation = i15;
                    }
                    int i16 = configuration3.navigationHidden;
                    int i17 = configuration4.navigationHidden;
                    if (i16 != i17) {
                        configuration.navigationHidden = i17;
                    }
                    int i18 = configuration3.orientation;
                    int i19 = configuration4.orientation;
                    if (i18 != i19) {
                        configuration.orientation = i19;
                    }
                    int i20 = configuration3.screenLayout & 15;
                    int i21 = configuration4.screenLayout & 15;
                    if (i20 != i21) {
                        configuration.screenLayout |= i21;
                    }
                    int i22 = configuration3.screenLayout & 192;
                    int i23 = configuration4.screenLayout & 192;
                    if (i22 != i23) {
                        configuration.screenLayout |= i23;
                    }
                    int i24 = configuration3.screenLayout & 48;
                    int i25 = configuration4.screenLayout & 48;
                    if (i24 != i25) {
                        configuration.screenLayout |= i25;
                    }
                    int i26 = configuration3.screenLayout & 768;
                    int i27 = configuration4.screenLayout & 768;
                    if (i26 != i27) {
                        configuration.screenLayout |= i27;
                    }
                    if (i3 >= 26) {
                        if ((configuration3.colorMode & 3) != (configuration4.colorMode & 3)) {
                            configuration.colorMode |= configuration4.colorMode & 3;
                        }
                        if ((configuration3.colorMode & 12) != (configuration4.colorMode & 12)) {
                            configuration.colorMode |= configuration4.colorMode & 12;
                        }
                    }
                    int i28 = configuration3.uiMode & 15;
                    int i29 = configuration4.uiMode & 15;
                    if (i28 != i29) {
                        configuration.uiMode |= i29;
                    }
                    int i30 = configuration3.uiMode & 48;
                    int i31 = configuration4.uiMode & 48;
                    if (i30 != i31) {
                        configuration.uiMode |= i31;
                    }
                    int i32 = configuration3.screenWidthDp;
                    int i33 = configuration4.screenWidthDp;
                    if (i32 != i33) {
                        configuration.screenWidthDp = i33;
                    }
                    int i34 = configuration3.screenHeightDp;
                    int i35 = configuration4.screenHeightDp;
                    if (i34 != i35) {
                        configuration.screenHeightDp = i35;
                    }
                    int i36 = configuration3.smallestScreenWidthDp;
                    int i37 = configuration4.smallestScreenWidthDp;
                    if (i36 != i37) {
                        configuration.smallestScreenWidthDp = i37;
                    }
                    int i38 = configuration3.densityDpi;
                    int i39 = configuration4.densityDpi;
                    if (i38 != i39) {
                        configuration.densityDpi = i39;
                    }
                }
            }
            Configuration configurationM1101r = LayoutInflaterFactory2C0545u.m1101r(context, iM1102A, configuration, true);
            C0564d c0564d = new C0564d(context, com.p055lu.wxmask272.R.style.Theme_AppCompat_Empty);
            c0564d.m1131a(configurationM1101r);
            try {
                if (context.getTheme() != null) {
                    Resources.Theme theme = c0564d.getTheme();
                    if (i3 >= 29) {
                        AbstractC0798l.m1467a(theme);
                    } else {
                        synchronized (AbstractC0788b.f2634e) {
                            if (AbstractC0788b.f2636g) {
                                method = AbstractC0788b.f2635f;
                                if (method != null) {
                                }
                            } else {
                                try {
                                    Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", null);
                                    AbstractC0788b.f2635f = declaredMethod;
                                    declaredMethod.setAccessible(true);
                                } catch (NoSuchMethodException e2) {
                                    Log.i("ResourcesCompat", "Failed to retrieve rebase() method", e2);
                                }
                                AbstractC0788b.f2636g = true;
                                method = AbstractC0788b.f2635f;
                                if (method != null) {
                                    try {
                                        method.invoke(theme, null);
                                    } catch (IllegalAccessException | InvocationTargetException e3) {
                                        Log.i("ResourcesCompat", "Failed to invoke rebase() method via reflection", e3);
                                        AbstractC0788b.f2635f = null;
                                    }
                                }
                            }
                        }
                    }
                }
            } catch (NullPointerException unused3) {
            }
            context = c0564d;
        }
        super.attachBaseContext(context);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Activity
    public final void closeOptionsMenu() {
        m1073j();
        if (getWindow().hasFeature(0)) {
            super.closeOptionsMenu();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.activity.AbstractActivityC0376g, android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        keyEvent.getKeyCode();
        m1073j();
        return super.dispatchKeyEvent(keyEvent);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Activity
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str2 = str + "  ";
        printWriter.print(str2);
        printWriter.print("mCreated=");
        printWriter.print(this.f1751r);
        printWriter.print(" mResumed=");
        printWriter.print(this.f1752s);
        printWriter.print(" mStopped=");
        printWriter.print(this.f1753t);
        if (getApplication() != null) {
            C0754l c0754l = ((C0161a) new C0064h(getViewModelStore(), C0161a.f473e).m119i(C0161a.class)).f474d;
            if (c0754l.f2560c > 0) {
                printWriter.print(str2);
                printWriter.println("Loaders:");
                if (c0754l.f2560c > 0) {
                    if (c0754l.f2559b[0] != null) {
                        throw new ClassCastException();
                    }
                    printWriter.print(str2);
                    printWriter.print("  #");
                    printWriter.print(c0754l.f2558a[0]);
                    printWriter.print(": ");
                    throw null;
                }
            }
        }
        ((C0437o) this.f1749p.f312c).f1397g.m897t(str, fileDescriptor, printWriter, strArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Activity
    public final View findViewById(int i2) {
        LayoutInflaterFactory2C0545u layoutInflaterFactory2C0545u = (LayoutInflaterFactory2C0545u) m1072i();
        layoutInflaterFactory2C0545u.m1114u();
        return layoutInflaterFactory2C0545u.f1821f.findViewById(i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Activity
    public final MenuInflater getMenuInflater() {
        LayoutInflaterFactory2C0545u layoutInflaterFactory2C0545u = (LayoutInflaterFactory2C0545u) m1072i();
        if (layoutInflaterFactory2C0545u.f1825j == null) {
            layoutInflaterFactory2C0545u.m1118y();
            C0524E c0524e = layoutInflaterFactory2C0545u.f1824i;
            layoutInflaterFactory2C0545u.f1825j = new C0569i(c0524e != null ? c0524e.m1063R() : layoutInflaterFactory2C0545u.f1820e);
        }
        return layoutInflaterFactory2C0545u.f1825j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        int i2 = AbstractC0712r1.f2410a;
        return super.getResources();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public final AbstractC0535k m1072i() {
        if (this.f1754u == null) {
            C0745c c0745c = AbstractC0535k.f1755b;
            this.f1754u = new LayoutInflaterFactory2C0545u(this, null, this, this);
        }
        return this.f1754u;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Activity
    public final void invalidateOptionsMenu() {
        m1072i().mo1084b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public final C0524E m1073j() {
        LayoutInflaterFactory2C0545u layoutInflaterFactory2C0545u = (LayoutInflaterFactory2C0545u) m1072i();
        layoutInflaterFactory2C0545u.m1118y();
        return layoutInflaterFactory2C0545u.f1824i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public final void m1074k() {
        View decorView = getWindow().getDecorView();
        AbstractC0223g.m418e(decorView, "<this>");
        decorView.setTag(com.p055lu.wxmask272.R.id.view_tree_lifecycle_owner, this);
        View decorView2 = getWindow().getDecorView();
        AbstractC0223g.m418e(decorView2, "<this>");
        decorView2.setTag(com.p055lu.wxmask272.R.id.view_tree_view_model_store_owner, this);
        View decorView3 = getWindow().getDecorView();
        AbstractC0223g.m418e(decorView3, "<this>");
        decorView3.setTag(com.p055lu.wxmask272.R.id.view_tree_saved_state_registry_owner, this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public final void m1075m(Configuration configuration) {
        C0066j c0066j = this.f1749p;
        c0066j.m152x();
        super.onConfigurationChanged(configuration);
        ((C0437o) c0066j.f312c).f1397g.m885h();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public final void m1076n() {
        super.onDestroy();
        ((C0437o) this.f1749p.f312c).f1397g.m888k();
        this.f1750q.m930d(EnumC0478m.ON_DESTROY);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public final boolean m1077o(int i2, MenuItem menuItem) {
        if (super.onMenuItemSelected(i2, menuItem)) {
            return true;
        }
        C0066j c0066j = this.f1749p;
        if (i2 == 0) {
            return ((C0437o) c0066j.f312c).f1397g.m891n();
        }
        if (i2 != 6) {
            return false;
        }
        return ((C0437o) c0066j.f312c).f1397g.m886i();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.activity.AbstractActivityC0376g, android.app.Activity
    public final void onActivityResult(int i2, int i3, Intent intent) {
        this.f1749p.m152x();
        super.onActivityResult(i2, i3, intent);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.activity.AbstractActivityC0376g, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        m1075m(configuration);
        LayoutInflaterFactory2C0545u layoutInflaterFactory2C0545u = (LayoutInflaterFactory2C0545u) m1072i();
        if (layoutInflaterFactory2C0545u.f1841z && layoutInflaterFactory2C0545u.f1835t) {
            layoutInflaterFactory2C0545u.m1118y();
            C0524E c0524e = layoutInflaterFactory2C0545u.f1824i;
            if (c0524e != null) {
                c0524e.m1066U(c0524e.f1697p.getResources().getBoolean(com.p055lu.wxmask272.R.bool.abc_action_bar_embed_tabs));
            }
        }
        C0719u c0719uM1367a = C0719u.m1367a();
        Context context = layoutInflaterFactory2C0545u.f1820e;
        synchronized (c0719uM1367a) {
            C0635N0 c0635n0 = c0719uM1367a.f2439a;
            synchronized (c0635n0) {
                C0747e c0747e = (C0747e) c0635n0.f2178b.get(context);
                if (c0747e != null) {
                    int i2 = c0747e.f2532d;
                    Object[] objArr = c0747e.f2531c;
                    for (int i3 = 0; i3 < i2; i3++) {
                        objArr[i3] = null;
                    }
                    c0747e.f2532d = 0;
                    c0747e.f2529a = false;
                }
            }
        }
        layoutInflaterFactory2C0545u.f1805L = new Configuration(layoutInflaterFactory2C0545u.f1820e.getResources().getConfiguration());
        layoutInflaterFactory2C0545u.m1107m(false);
        configuration.updateFrom(layoutInflaterFactory2C0545u.f1820e.getResources().getConfiguration());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.activity.AbstractActivityC0376g, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f1750q.m930d(EnumC0478m.ON_CREATE);
        C0448z c0448z = ((C0437o) this.f1749p.f312c).f1397g;
        c0448z.f1454y = false;
        c0448z.f1455z = false;
        c0448z.f1428F.f1236i = false;
        c0448z.m896s(1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.activity.AbstractActivityC0376g, android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i2, Menu menu) {
        if (i2 != 0) {
            super.onCreatePanelMenu(i2, menu);
            return true;
        }
        super.onCreatePanelMenu(i2, menu);
        getMenuInflater();
        ((C0437o) this.f1749p.f312c).f1397g.m887j();
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View viewOnCreateView = ((C0437o) this.f1749p.f312c).f1397g.f1435f.onCreateView(view, str, context, attributeSet);
        return viewOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : viewOnCreateView;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Activity
    public void onDestroy() {
        m1076n();
        m1072i().mo1086d();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i2, KeyEvent keyEvent) {
        Window window;
        if (Build.VERSION.SDK_INT >= 26 || keyEvent.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) || keyEvent.getRepeatCount() != 0 || KeyEvent.isModifierKey(keyEvent.getKeyCode()) || (window = getWindow()) == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) {
            return super.onKeyDown(i2, keyEvent);
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onLowMemory() {
        super.onLowMemory();
        ((C0437o) this.f1749p.f312c).f1397g.m889l();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.activity.AbstractActivityC0376g, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i2, MenuItem menuItem) {
        Intent intentM993z;
        if (!m1077o(i2, menuItem)) {
            C0524E c0524eM1073j = m1073j();
            if (menuItem.getItemId() != 16908332 || c0524eM1073j == null || (((C0697m1) c0524eM1073j.f1701t).f2352b & 4) == 0 || (intentM993z = AbstractC0503h.m993z(this)) == null) {
                return false;
            }
            if (!shouldUpRecreateTask(intentM993z)) {
                navigateUpTo(intentM993z);
                return true;
            }
            ArrayList arrayList = new ArrayList();
            Intent intentM993z2 = AbstractC0503h.m993z(this);
            if (intentM993z2 == null) {
                intentM993z2 = AbstractC0503h.m993z(this);
            }
            if (intentM993z2 != null) {
                ComponentName component = intentM993z2.getComponent();
                if (component == null) {
                    component = intentM993z2.resolveActivity(getPackageManager());
                }
                int size = arrayList.size();
                try {
                    Intent intentM965A = AbstractC0503h.m965A(this, component);
                    while (intentM965A != null) {
                        arrayList.add(size, intentM965A);
                        intentM965A = AbstractC0503h.m965A(this, intentM965A.getComponent());
                    }
                    arrayList.add(intentM993z2);
                } catch (PackageManager.NameNotFoundException e2) {
                    Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
                    throw new IllegalArgumentException(e2);
                }
            }
            if (arrayList.isEmpty()) {
                throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
            }
            Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            startActivities(intentArr, null);
            try {
                finishAffinity();
            } catch (IllegalStateException unused) {
                finish();
            }
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z2) {
        ((C0437o) this.f1749p.f312c).f1397g.m890m();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.activity.AbstractActivityC0376g, android.app.Activity
    public void onNewIntent(Intent intent) {
        this.f1749p.m152x();
        super.onNewIntent(intent);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.activity.AbstractActivityC0376g, android.app.Activity, android.view.Window.Callback
    public final void onPanelClosed(int i2, Menu menu) {
        m1078p(i2, menu);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Activity
    public final void onPause() {
        super.onPause();
        this.f1752s = false;
        ((C0437o) this.f1749p.f312c).f1397g.m896s(5);
        this.f1750q.m930d(EnumC0478m.ON_PAUSE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z2) {
        ((C0437o) this.f1749p.f312c).f1397g.m894q();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Activity
    public final void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        ((LayoutInflaterFactory2C0545u) m1072i()).m1114u();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Activity
    public final void onPostResume() {
        m1079q();
        LayoutInflaterFactory2C0545u layoutInflaterFactory2C0545u = (LayoutInflaterFactory2C0545u) m1072i();
        layoutInflaterFactory2C0545u.m1118y();
        C0524E c0524e = layoutInflaterFactory2C0545u.f1824i;
        if (c0524e != null) {
            c0524e.f1692J = true;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.activity.AbstractActivityC0376g, android.app.Activity, android.view.Window.Callback
    public final boolean onPreparePanel(int i2, View view, Menu menu) {
        if (i2 != 0) {
            super.onPreparePanel(i2, view, menu);
            return true;
        }
        super.onPreparePanel(0, view, menu);
        ((C0437o) this.f1749p.f312c).f1397g.m895r();
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.activity.AbstractActivityC0376g, android.app.Activity
    public final void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        this.f1749p.m152x();
        super.onRequestPermissionsResult(i2, strArr, iArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Activity
    public void onResume() {
        C0066j c0066j = this.f1749p;
        c0066j.m152x();
        super.onResume();
        this.f1752s = true;
        ((C0437o) c0066j.f312c).f1397g.m899v(true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Activity
    public final void onStart() {
        m1080r();
        ((LayoutInflaterFactory2C0545u) m1072i()).m1107m(true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Activity
    public final void onStateNotSaved() {
        this.f1749p.m152x();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Activity
    public final void onStop() {
        m1081s();
        LayoutInflaterFactory2C0545u layoutInflaterFactory2C0545u = (LayoutInflaterFactory2C0545u) m1072i();
        layoutInflaterFactory2C0545u.m1118y();
        C0524E c0524e = layoutInflaterFactory2C0545u.f1824i;
        if (c0524e != null) {
            c0524e.f1692J = false;
            C0571k c0571k = c0524e.f1691I;
            if (c0571k != null) {
                c0571k.m1137a();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Activity
    public final void onTitleChanged(CharSequence charSequence, int i2) {
        super.onTitleChanged(charSequence, i2);
        m1072i().mo1091l(charSequence);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Activity
    public final void openOptionsMenu() {
        m1073j();
        if (getWindow().hasFeature(0)) {
            super.openOptionsMenu();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public final void m1078p(int i2, Menu menu) {
        if (i2 == 0) {
            ((C0437o) this.f1749p.f312c).f1397g.m892o();
        }
        super.onPanelClosed(i2, menu);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public final void m1079q() {
        super.onPostResume();
        this.f1750q.m930d(EnumC0478m.ON_RESUME);
        C0448z c0448z = ((C0437o) this.f1749p.f312c).f1397g;
        c0448z.f1454y = false;
        c0448z.f1455z = false;
        c0448z.f1428F.f1236i = false;
        c0448z.m896s(7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public final void m1080r() {
        C0066j c0066j = this.f1749p;
        c0066j.m152x();
        super.onStart();
        this.f1753t = false;
        boolean z2 = this.f1751r;
        C0437o c0437o = (C0437o) c0066j.f312c;
        if (!z2) {
            this.f1751r = true;
            C0448z c0448z = c0437o.f1397g;
            c0448z.f1454y = false;
            c0448z.f1455z = false;
            c0448z.f1428F.f1236i = false;
            c0448z.m896s(4);
        }
        c0437o.f1397g.m899v(true);
        this.f1750q.m930d(EnumC0478m.ON_START);
        C0448z c0448z2 = c0437o.f1397g;
        c0448z2.f1454y = false;
        c0448z2.f1455z = false;
        c0448z2.f1428F.f1236i = false;
        c0448z2.m896s(5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public final void m1081s() {
        C0066j c0066j;
        super.onStop();
        this.f1753t = true;
        do {
            c0066j = this.f1749p;
        } while (m1071l(((C0437o) c0066j.f312c).f1397g));
        C0448z c0448z = ((C0437o) c0066j.f312c).f1397g;
        c0448z.f1455z = true;
        c0448z.f1428F.f1236i = true;
        c0448z.m896s(4);
        this.f1750q.m930d(EnumC0478m.ON_STOP);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Activity
    public final void setContentView(int i2) {
        m1074k();
        m1072i().mo1088i(i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i2) {
        super.setTheme(i2);
        ((LayoutInflaterFactory2C0545u) m1072i()).f1807N = i2;
    }

    @Override // androidx.activity.AbstractActivityC0376g, android.app.Activity
    public void setContentView(View view) {
        m1074k();
        m1072i().mo1089j(view);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View viewOnCreateView = ((C0437o) this.f1749p.f312c).f1397g.f1435f.onCreateView(null, str, context, attributeSet);
        return viewOnCreateView == null ? super.onCreateView(str, context, attributeSet) : viewOnCreateView;
    }

    @Override // android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m1074k();
        m1072i().mo1090k(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onContentChanged() {
    }
}
