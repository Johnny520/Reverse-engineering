package p000a;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.location.LocationManager;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.C0983R;
import androidx.appcompat.view.menu.C0996d;
import androidx.appcompat.view.menu.C0996d.a;
import androidx.appcompat.view.menu.C0998f;
import androidx.appcompat.view.menu.ExpandedMenuView;
import androidx.appcompat.view.menu.InterfaceC1002j;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.ViewStubCompat;
import androidx.core.C1066R;
import androidx.lifecycle.AbstractC1116e;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Calendar;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.WeakHashMap;
import p000a.AbstractC0272P;
import p000a.C0125Ge;
import p000a.C0174J9;
import p000a.C0180Jf;
import p000a.C0851u1;
import p000a.C0865uf;
import p000a.C0866ug;
import p000a.WindowCallbackC0658jh;

/* JADX INFO: renamed from: a.Q0 */
/* JADX INFO: loaded from: classes.dex */
public final class LayoutInflaterFactory2C0291Q0 extends AbstractC0255O0 implements C0998f.a, LayoutInflater.Factory2 {

    /* JADX INFO: renamed from: i0 */
    public static final C0598ge<String, Integer> f988i0 = new C0598ge<>();

    /* JADX INFO: renamed from: j0 */
    public static final int[] f989j0 = {R.attr.windowBackground};

    /* JADX INFO: renamed from: k0 */
    public static final boolean f990k0 = !"robolectric".equals(Build.FINGERPRINT);

    /* JADX INFO: renamed from: A */
    public boolean f991A;

    /* JADX INFO: renamed from: B */
    public ViewGroup f992B;

    /* JADX INFO: renamed from: C */
    public TextView f993C;

    /* JADX INFO: renamed from: D */
    public View f994D;

    /* JADX INFO: renamed from: E */
    public boolean f995E;

    /* JADX INFO: renamed from: F */
    public boolean f996F;

    /* JADX INFO: renamed from: G */
    public boolean f997G;

    /* JADX INFO: renamed from: H */
    public boolean f998H;

    /* JADX INFO: renamed from: I */
    public boolean f999I;

    /* JADX INFO: renamed from: J */
    public boolean f1000J;

    /* JADX INFO: renamed from: K */
    public boolean f1001K;

    /* JADX INFO: renamed from: L */
    public boolean f1002L;

    /* JADX INFO: renamed from: M */
    public m[] f1003M;

    /* JADX INFO: renamed from: N */
    public m f1004N;

    /* JADX INFO: renamed from: O */
    public boolean f1005O;

    /* JADX INFO: renamed from: P */
    public boolean f1006P;

    /* JADX INFO: renamed from: Q */
    public boolean f1007Q;

    /* JADX INFO: renamed from: R */
    public boolean f1008R;

    /* JADX INFO: renamed from: S */
    public Configuration f1009S;

    /* JADX INFO: renamed from: T */
    public final int f1010T;

    /* JADX INFO: renamed from: U */
    public int f1011U;

    /* JADX INFO: renamed from: V */
    public int f1012V;

    /* JADX INFO: renamed from: W */
    public boolean f1013W;

    /* JADX INFO: renamed from: X */
    public k f1014X;

    /* JADX INFO: renamed from: Y */
    public i f1015Y;

    /* JADX INFO: renamed from: Z */
    public boolean f1016Z;

    /* JADX INFO: renamed from: a0 */
    public int f1017a0;

    /* JADX INFO: renamed from: c0 */
    public boolean f1019c0;

    /* JADX INFO: renamed from: d0 */
    public Rect f1020d0;

    /* JADX INFO: renamed from: e0 */
    public Rect f1021e0;

    /* JADX INFO: renamed from: f0 */
    public C0851u1 f1022f0;

    /* JADX INFO: renamed from: g0 */
    public OnBackInvokedDispatcher f1023g0;

    /* JADX INFO: renamed from: h0 */
    public OnBackInvokedCallback f1024h0;

    /* JADX INFO: renamed from: j */
    public final Object f1025j;

    /* JADX INFO: renamed from: k */
    public final Context f1026k;

    /* JADX INFO: renamed from: l */
    public Window f1027l;

    /* JADX INFO: renamed from: m */
    public h f1028m;

    /* JADX INFO: renamed from: n */
    public final Object f1029n;

    /* JADX INFO: renamed from: o */
    public AbstractC0200L f1030o;

    /* JADX INFO: renamed from: p */
    public C0161Ie f1031p;

    /* JADX INFO: renamed from: q */
    public CharSequence f1032q;

    /* JADX INFO: renamed from: r */
    public InterfaceC0223M4 f1033r;

    /* JADX INFO: renamed from: s */
    public c f1034s;

    /* JADX INFO: renamed from: t */
    public n f1035t;

    /* JADX INFO: renamed from: u */
    public AbstractC0272P f1036u;

    /* JADX INFO: renamed from: v */
    public ActionBarContextView f1037v;

    /* JADX INFO: renamed from: w */
    public PopupWindow f1038w;

    /* JADX INFO: renamed from: x */
    public RunnableC0344T0 f1039x;

    /* JADX INFO: renamed from: y */
    public C0181Jg f1040y = null;

    /* JADX INFO: renamed from: z */
    public final boolean f1041z = true;

    /* JADX INFO: renamed from: b0 */
    public final a f1018b0 = new a();

    /* JADX INFO: renamed from: a.Q0$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            LayoutInflaterFactory2C0291Q0 layoutInflaterFactory2C0291Q0 = LayoutInflaterFactory2C0291Q0.this;
            if ((layoutInflaterFactory2C0291Q0.f1017a0 & 1) != 0) {
                layoutInflaterFactory2C0291Q0.m802L(0);
            }
            if ((layoutInflaterFactory2C0291Q0.f1017a0 & 4096) != 0) {
                layoutInflaterFactory2C0291Q0.m802L(108);
            }
            layoutInflaterFactory2C0291Q0.f1016Z = false;
            layoutInflaterFactory2C0291Q0.f1017a0 = 0;
        }
    }

    /* JADX INFO: renamed from: a.Q0$b */
    public class b implements InterfaceC0236N {
    }

    /* JADX INFO: renamed from: a.Q0$c */
    public final class c implements InterfaceC1002j.a {
        public c() {
        }

        @Override // androidx.appcompat.view.menu.InterfaceC1002j.a
        /* JADX INFO: renamed from: a */
        public final void mo818a(C0998f c0998f, boolean z) {
            LayoutInflaterFactory2C0291Q0.this.m799H(c0998f);
        }

        @Override // androidx.appcompat.view.menu.InterfaceC1002j.a
        /* JADX INFO: renamed from: b */
        public final boolean mo819b(C0998f c0998f) {
            Window.Callback callback = LayoutInflaterFactory2C0291Q0.this.f1027l.getCallback();
            if (callback == null) {
                return true;
            }
            callback.onMenuOpened(108, c0998f);
            return true;
        }
    }

    /* JADX INFO: renamed from: a.Q0$d */
    public class d implements AbstractC0272P.a {

        /* JADX INFO: renamed from: a */
        public final AbstractC0272P.a f1044a;

        /* JADX INFO: renamed from: a.Q0$d$a */
        public class a extends C0726n9 {
            public a() {
            }

            @Override // p000a.InterfaceC0217Lg
            /* JADX INFO: renamed from: a */
            public final void mo553a() {
                d dVar = d.this;
                LayoutInflaterFactory2C0291Q0.this.f1037v.setVisibility(8);
                LayoutInflaterFactory2C0291Q0 layoutInflaterFactory2C0291Q0 = LayoutInflaterFactory2C0291Q0.this;
                PopupWindow popupWindow = layoutInflaterFactory2C0291Q0.f1038w;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (layoutInflaterFactory2C0291Q0.f1037v.getParent() instanceof View) {
                    View view = (View) layoutInflaterFactory2C0291Q0.f1037v.getParent();
                    WeakHashMap<View, C0181Jg> weakHashMap = C0866ug.f3395a;
                    C0866ug.c.m2008c(view);
                }
                layoutInflaterFactory2C0291Q0.f1037v.m2350h();
                layoutInflaterFactory2C0291Q0.f1040y.m491d(null);
                layoutInflaterFactory2C0291Q0.f1040y = null;
                ViewGroup viewGroup = layoutInflaterFactory2C0291Q0.f992B;
                WeakHashMap<View, C0181Jg> weakHashMap2 = C0866ug.f3395a;
                C0866ug.c.m2008c(viewGroup);
            }
        }

        public d(AbstractC0272P.a aVar) {
            this.f1044a = aVar;
        }

        @Override // p000a.AbstractC0272P.a
        /* JADX INFO: renamed from: a */
        public final boolean mo329a(AbstractC0272P abstractC0272P, C0998f c0998f) {
            return this.f1044a.mo329a(abstractC0272P, c0998f);
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [a.I0, java.lang.Object] */
        @Override // p000a.AbstractC0272P.a
        /* JADX INFO: renamed from: b */
        public final void mo330b(AbstractC0272P abstractC0272P) {
            this.f1044a.mo330b(abstractC0272P);
            LayoutInflaterFactory2C0291Q0 layoutInflaterFactory2C0291Q0 = LayoutInflaterFactory2C0291Q0.this;
            if (layoutInflaterFactory2C0291Q0.f1038w != null) {
                layoutInflaterFactory2C0291Q0.f1027l.getDecorView().removeCallbacks(layoutInflaterFactory2C0291Q0.f1039x);
            }
            if (layoutInflaterFactory2C0291Q0.f1037v != null) {
                C0181Jg c0181Jg = layoutInflaterFactory2C0291Q0.f1040y;
                if (c0181Jg != null) {
                    c0181Jg.m489b();
                }
                C0181Jg c0181JgM1994a = C0866ug.m1994a(layoutInflaterFactory2C0291Q0.f1037v);
                c0181JgM1994a.m488a(0.0f);
                layoutInflaterFactory2C0291Q0.f1040y = c0181JgM1994a;
                c0181JgM1994a.m491d(new a());
            }
            ?? r0 = layoutInflaterFactory2C0291Q0.f1029n;
            if (r0 != 0) {
                r0.onSupportActionModeFinished(layoutInflaterFactory2C0291Q0.f1036u);
            }
            layoutInflaterFactory2C0291Q0.f1036u = null;
            ViewGroup viewGroup = layoutInflaterFactory2C0291Q0.f992B;
            WeakHashMap<View, C0181Jg> weakHashMap = C0866ug.f3395a;
            C0866ug.c.m2008c(viewGroup);
            layoutInflaterFactory2C0291Q0.m815Y();
        }

        @Override // p000a.AbstractC0272P.a
        /* JADX INFO: renamed from: c */
        public final boolean mo331c(AbstractC0272P abstractC0272P, C0998f c0998f) {
            ViewGroup viewGroup = LayoutInflaterFactory2C0291Q0.this.f992B;
            WeakHashMap<View, C0181Jg> weakHashMap = C0866ug.f3395a;
            C0866ug.c.m2008c(viewGroup);
            return this.f1044a.mo331c(abstractC0272P, c0998f);
        }

        @Override // p000a.AbstractC0272P.a
        /* JADX INFO: renamed from: d */
        public final boolean mo332d(AbstractC0272P abstractC0272P, MenuItem menuItem) {
            return this.f1044a.mo332d(abstractC0272P, menuItem);
        }
    }

    /* JADX INFO: renamed from: a.Q0$e */
    public static class e {
        /* JADX INFO: renamed from: a */
        public static boolean m820a(PowerManager powerManager) {
            return powerManager.isPowerSaveMode();
        }

        /* JADX INFO: renamed from: b */
        public static String m821b(Locale locale) {
            return locale.toLanguageTag();
        }
    }

    /* JADX INFO: renamed from: a.Q0$f */
    public static class f {
        /* JADX INFO: renamed from: a */
        public static void m822a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            LocaleList locales = configuration.getLocales();
            LocaleList locales2 = configuration2.getLocales();
            if (locales.equals(locales2)) {
                return;
            }
            configuration3.setLocales(locales2);
            configuration3.locale = configuration2.locale;
        }

        /* JADX INFO: renamed from: b */
        public static C0174J9 m823b(Configuration configuration) {
            return C0174J9.m471a(configuration.getLocales().toLanguageTags());
        }

        /* JADX INFO: renamed from: c */
        public static void m824c(C0174J9 c0174j9) {
            LocaleList.setDefault(LocaleList.forLanguageTags(c0174j9.f612a.f697a.toLanguageTags()));
        }

        /* JADX INFO: renamed from: d */
        public static void m825d(Configuration configuration, C0174J9 c0174j9) {
            configuration.setLocales(LocaleList.forLanguageTags(c0174j9.f612a.f697a.toLanguageTags()));
        }
    }

    /* JADX INFO: renamed from: a.Q0$g */
    public static class g {
        /* JADX INFO: renamed from: a */
        public static OnBackInvokedDispatcher m826a(Activity activity) {
            return activity.getOnBackInvokedDispatcher();
        }

        /* JADX INFO: renamed from: b */
        public static OnBackInvokedCallback m827b(Object obj, LayoutInflaterFactory2C0291Q0 layoutInflaterFactory2C0291Q0) {
            Objects.requireNonNull(layoutInflaterFactory2C0291Q0);
            C0380V0 c0380v0 = new C0380V0(0, layoutInflaterFactory2C0291Q0);
            C0128H.m338e(obj).registerOnBackInvokedCallback(1000000, c0380v0);
            return c0380v0;
        }

        /* JADX INFO: renamed from: c */
        public static void m828c(Object obj, Object obj2) {
            C0128H.m338e(obj).unregisterOnBackInvokedCallback(C0128H.m335b(obj2));
        }
    }

    /* JADX INFO: renamed from: a.Q0$i */
    public class i extends j {

        /* JADX INFO: renamed from: c */
        public final PowerManager f1052c;

        public i(Context context) {
            super();
            this.f1052c = (PowerManager) context.getApplicationContext().getSystemService("power");
        }

        @Override // p000a.LayoutInflaterFactory2C0291Q0.j
        /* JADX INFO: renamed from: b */
        public final IntentFilter mo830b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }

        @Override // p000a.LayoutInflaterFactory2C0291Q0.j
        /* JADX INFO: renamed from: c */
        public final int mo831c() {
            return e.m820a(this.f1052c) ? 2 : 1;
        }

        @Override // p000a.LayoutInflaterFactory2C0291Q0.j
        /* JADX INFO: renamed from: d */
        public final void mo832d() {
            LayoutInflaterFactory2C0291Q0.this.m796D(true, true);
        }
    }

    /* JADX INFO: renamed from: a.Q0$j */
    public abstract class j {

        /* JADX INFO: renamed from: a */
        public a f1054a;

        /* JADX INFO: renamed from: a.Q0$j$a */
        public class a extends BroadcastReceiver {
            public a() {
            }

            @Override // android.content.BroadcastReceiver
            public final void onReceive(Context context, Intent intent) {
                j.this.mo832d();
            }
        }

        public j() {
        }

        /* JADX INFO: renamed from: a */
        public final void m833a() {
            a aVar = this.f1054a;
            if (aVar != null) {
                try {
                    LayoutInflaterFactory2C0291Q0.this.f1026k.unregisterReceiver(aVar);
                } catch (IllegalArgumentException unused) {
                }
                this.f1054a = null;
            }
        }

        /* JADX INFO: renamed from: b */
        public abstract IntentFilter mo830b();

        /* JADX INFO: renamed from: c */
        public abstract int mo831c();

        /* JADX INFO: renamed from: d */
        public abstract void mo832d();

        /* JADX INFO: renamed from: e */
        public final void m834e() {
            m833a();
            IntentFilter intentFilterMo830b = mo830b();
            if (intentFilterMo830b.countActions() == 0) {
                return;
            }
            if (this.f1054a == null) {
                this.f1054a = new a();
            }
            LayoutInflaterFactory2C0291Q0.this.f1026k.registerReceiver(this.f1054a, intentFilterMo830b);
        }
    }

    /* JADX INFO: renamed from: a.Q0$k */
    public class k extends j {

        /* JADX INFO: renamed from: c */
        public final C0180Jf f1057c;

        public k(C0180Jf c0180Jf) {
            super();
            this.f1057c = c0180Jf;
        }

        @Override // p000a.LayoutInflaterFactory2C0291Q0.j
        /* JADX INFO: renamed from: b */
        public final IntentFilter mo830b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        @Override // p000a.LayoutInflaterFactory2C0291Q0.j
        /* JADX INFO: renamed from: c */
        public final int mo831c() {
            Location location;
            boolean z;
            long j;
            C0180Jf c0180Jf = this.f1057c;
            C0180Jf.a aVar = c0180Jf.f625c;
            if (aVar.f627b > System.currentTimeMillis()) {
                z = aVar.f626a;
            } else {
                Context context = c0180Jf.f623a;
                int iM1666i = C0726n9.m1666i(context, "android.permission.ACCESS_COARSE_LOCATION");
                Location lastKnownLocation = null;
                LocationManager locationManager = c0180Jf.f624b;
                if (iM1666i == 0) {
                    try {
                    } catch (Exception e) {
                        Log.d("TwilightManager", "Failed to get last known location", e);
                    }
                    Location lastKnownLocation2 = locationManager.isProviderEnabled("network") ? locationManager.getLastKnownLocation("network") : null;
                    location = lastKnownLocation2;
                } else {
                    location = null;
                }
                if (C0726n9.m1666i(context, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                    try {
                        if (locationManager.isProviderEnabled("gps")) {
                            lastKnownLocation = locationManager.getLastKnownLocation("gps");
                        }
                    } catch (Exception e2) {
                        Log.d("TwilightManager", "Failed to get last known location", e2);
                    }
                }
                if (lastKnownLocation == null || location == null ? lastKnownLocation != null : lastKnownLocation.getTime() > location.getTime()) {
                    location = lastKnownLocation;
                }
                if (location != null) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (C0162If.f582d == null) {
                        C0162If.f582d = new C0162If();
                    }
                    C0162If c0162If = C0162If.f582d;
                    c0162If.m445a(jCurrentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
                    c0162If.m445a(jCurrentTimeMillis, location.getLatitude(), location.getLongitude());
                    z = c0162If.f585c == 1;
                    long j2 = c0162If.f584b;
                    long j3 = c0162If.f583a;
                    c0162If.m445a(86400000 + jCurrentTimeMillis, location.getLatitude(), location.getLongitude());
                    long j4 = c0162If.f584b;
                    if (j2 == -1 || j3 == -1) {
                        j = jCurrentTimeMillis + 43200000;
                    } else {
                        if (jCurrentTimeMillis <= j3) {
                            j4 = jCurrentTimeMillis > j2 ? j3 : j2;
                        }
                        j = j4 + 60000;
                    }
                    aVar.f626a = z;
                    aVar.f627b = j;
                } else {
                    Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
                    int i = Calendar.getInstance().get(11);
                    if (i < 6 || i >= 22) {
                        z = true;
                    }
                }
            }
            return z ? 2 : 1;
        }

        @Override // p000a.LayoutInflaterFactory2C0291Q0.j
        /* JADX INFO: renamed from: d */
        public final void mo832d() {
            LayoutInflaterFactory2C0291Q0.this.m796D(true, true);
        }
    }

    /* JADX INFO: renamed from: a.Q0$l */
    public class l extends ContentFrameLayout {
        public l(C0455Z3 c0455z3) {
            super(c0455z3, null);
        }

        @Override // android.view.ViewGroup, android.view.View
        public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return LayoutInflaterFactory2C0291Q0.this.m801K(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // android.view.ViewGroup
        public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0) {
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                if (x < -5 || y < -5 || x > getWidth() + 5 || y > getHeight() + 5) {
                    LayoutInflaterFactory2C0291Q0 layoutInflaterFactory2C0291Q0 = LayoutInflaterFactory2C0291Q0.this;
                    layoutInflaterFactory2C0291Q0.m800I(layoutInflaterFactory2C0291Q0.m806P(0), true);
                    return true;
                }
            }
            return super.onInterceptTouchEvent(motionEvent);
        }

        @Override // android.view.View
        public final void setBackgroundResource(int i) {
            setBackgroundDrawable(C0889w1.m2115A(getContext(), i));
        }
    }

    /* JADX INFO: renamed from: a.Q0$m */
    public static final class m {

        /* JADX INFO: renamed from: a */
        public int f1060a;

        /* JADX INFO: renamed from: b */
        public int f1061b;

        /* JADX INFO: renamed from: c */
        public int f1062c;

        /* JADX INFO: renamed from: d */
        public int f1063d;

        /* JADX INFO: renamed from: e */
        public l f1064e;

        /* JADX INFO: renamed from: f */
        public View f1065f;

        /* JADX INFO: renamed from: g */
        public View f1066g;

        /* JADX INFO: renamed from: h */
        public C0998f f1067h;

        /* JADX INFO: renamed from: i */
        public C0996d f1068i;

        /* JADX INFO: renamed from: j */
        public C0455Z3 f1069j;

        /* JADX INFO: renamed from: k */
        public boolean f1070k;

        /* JADX INFO: renamed from: l */
        public boolean f1071l;

        /* JADX INFO: renamed from: m */
        public boolean f1072m;

        /* JADX INFO: renamed from: n */
        public boolean f1073n;

        /* JADX INFO: renamed from: o */
        public boolean f1074o;

        /* JADX INFO: renamed from: p */
        public Bundle f1075p;
    }

    /* JADX INFO: renamed from: a.Q0$n */
    public final class n implements InterfaceC1002j.a {
        public n() {
        }

        @Override // androidx.appcompat.view.menu.InterfaceC1002j.a
        /* JADX INFO: renamed from: a */
        public final void mo818a(C0998f c0998f, boolean z) {
            m mVar;
            C0998f c0998fMo2326k = c0998f.mo2326k();
            int i = 0;
            boolean z2 = c0998fMo2326k != c0998f;
            if (z2) {
                c0998f = c0998fMo2326k;
            }
            LayoutInflaterFactory2C0291Q0 layoutInflaterFactory2C0291Q0 = LayoutInflaterFactory2C0291Q0.this;
            m[] mVarArr = layoutInflaterFactory2C0291Q0.f1003M;
            int length = mVarArr != null ? mVarArr.length : 0;
            while (true) {
                if (i < length) {
                    mVar = mVarArr[i];
                    if (mVar != null && mVar.f1067h == c0998f) {
                        break;
                    } else {
                        i++;
                    }
                } else {
                    mVar = null;
                    break;
                }
            }
            if (mVar != null) {
                if (!z2) {
                    layoutInflaterFactory2C0291Q0.m800I(mVar, z);
                } else {
                    layoutInflaterFactory2C0291Q0.m798G(mVar.f1060a, mVar, c0998fMo2326k);
                    layoutInflaterFactory2C0291Q0.m800I(mVar, true);
                }
            }
        }

        @Override // androidx.appcompat.view.menu.InterfaceC1002j.a
        /* JADX INFO: renamed from: b */
        public final boolean mo819b(C0998f c0998f) {
            Window.Callback callback;
            if (c0998f != c0998f.mo2326k()) {
                return true;
            }
            LayoutInflaterFactory2C0291Q0 layoutInflaterFactory2C0291Q0 = LayoutInflaterFactory2C0291Q0.this;
            if (!layoutInflaterFactory2C0291Q0.f997G || (callback = layoutInflaterFactory2C0291Q0.f1027l.getCallback()) == null || layoutInflaterFactory2C0291Q0.f1008R) {
                return true;
            }
            callback.onMenuOpened(108, c0998f);
            return true;
        }
    }

    public LayoutInflaterFactory2C0291Q0(Context context, Window window, InterfaceC0147I0 interfaceC0147I0, Object obj) {
        C0598ge<String, Integer> c0598ge;
        Integer orDefault;
        ActivityC0075E0 activityC0075E0;
        this.f1010T = -100;
        this.f1026k = context;
        this.f1029n = interfaceC0147I0;
        this.f1025j = obj;
        if (obj instanceof Dialog) {
            while (context != null) {
                if (!(context instanceof ActivityC0075E0)) {
                    if (!(context instanceof ContextWrapper)) {
                        break;
                    } else {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                } else {
                    activityC0075E0 = (ActivityC0075E0) context;
                    break;
                }
            }
            activityC0075E0 = null;
            if (activityC0075E0 != null) {
                this.f1010T = activityC0075E0.getDelegate().mo703h();
            }
        }
        if (this.f1010T == -100 && (orDefault = (c0598ge = f988i0).getOrDefault(this.f1025j.getClass().getName(), null)) != null) {
            this.f1010T = orDefault.intValue();
            c0598ge.remove(this.f1025j.getClass().getName());
        }
        if (window != null) {
            m797E(window);
        }
        C0434Y0.m1082d();
    }

    /* JADX INFO: renamed from: F */
    public static C0174J9 m794F(Context context) {
        C0174J9 c0174j9;
        C0174J9 c0174j92;
        if (Build.VERSION.SDK_INT >= 33 || (c0174j9 = AbstractC0255O0.f888c) == null) {
            return null;
        }
        C0174J9 c0174j9M823b = f.m823b(context.getApplicationContext().getResources().getConfiguration());
        LocaleList localeList = c0174j9.f612a.f697a;
        if (localeList.isEmpty()) {
            c0174j92 = C0174J9.f611b;
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i2 = 0;
            while (i2 < c0174j9M823b.f612a.f697a.size() + localeList.size()) {
                Locale locale = i2 < localeList.size() ? localeList.get(i2) : c0174j9M823b.f612a.f697a.get(i2 - localeList.size());
                if (locale != null) {
                    linkedHashSet.add(locale);
                }
                i2++;
            }
            c0174j92 = new C0174J9(new C0210L9(C0174J9.b.m474a((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]))));
        }
        return c0174j92.f612a.f697a.isEmpty() ? c0174j9M823b : c0174j92;
    }

    /* JADX INFO: renamed from: J */
    public static Configuration m795J(Context context, int i2, C0174J9 c0174j9, Configuration configuration, boolean z) {
        int i3 = i2 != 1 ? i2 != 2 ? z ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i3 | (configuration2.uiMode & (-49));
        if (c0174j9 != null) {
            f.m825d(configuration2, c0174j9);
        }
        return configuration2;
    }

    @Override // p000a.AbstractC0255O0
    /* JADX INFO: renamed from: A */
    public final void mo695A(int i2) {
        this.f1011U = i2;
    }

    @Override // p000a.AbstractC0255O0
    /* JADX INFO: renamed from: B */
    public final void mo696B(CharSequence charSequence) {
        this.f1032q = charSequence;
        InterfaceC0223M4 interfaceC0223M4 = this.f1033r;
        if (interfaceC0223M4 != null) {
            interfaceC0223M4.setWindowTitle(charSequence);
            return;
        }
        AbstractC0200L abstractC0200L = this.f1030o;
        if (abstractC0200L != null) {
            abstractC0200L.mo568n(charSequence);
            return;
        }
        TextView textView = this.f993C;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0049  */
    /* JADX WARN: Type inference failed for: r1v0, types: [a.I0, java.lang.Object] */
    @Override // p000a.AbstractC0255O0
    /* JADX INFO: renamed from: C */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AbstractC0272P mo697C(AbstractC0272P.a aVar) {
        AbstractC0272P abstractC0272POnWindowStartingSupportActionMode;
        ViewGroup viewGroup;
        AbstractC0272P abstractC0272P;
        if (aVar == null) {
            throw new IllegalArgumentException("ActionMode callback can not be null.");
        }
        AbstractC0272P abstractC0272P2 = this.f1036u;
        if (abstractC0272P2 != null) {
            abstractC0272P2.mo761c();
        }
        d dVar = new d(aVar);
        m807Q();
        AbstractC0200L abstractC0200L = this.f1030o;
        ?? r1 = this.f1029n;
        if (abstractC0200L != null) {
            AbstractC0272P abstractC0272PMo569o = abstractC0200L.mo569o(dVar);
            this.f1036u = abstractC0272PMo569o;
            if (abstractC0272PMo569o != null && r1 != 0) {
                r1.onSupportActionModeStarted(abstractC0272PMo569o);
            }
        }
        if (this.f1036u == null) {
            C0181Jg c0181Jg = this.f1040y;
            if (c0181Jg != null) {
                c0181Jg.m489b();
            }
            AbstractC0272P abstractC0272P3 = this.f1036u;
            if (abstractC0272P3 != null) {
                abstractC0272P3.mo761c();
            }
            if (r1 == 0 || this.f1008R) {
                abstractC0272POnWindowStartingSupportActionMode = null;
                if (abstractC0272POnWindowStartingSupportActionMode == null) {
                    this.f1036u = abstractC0272POnWindowStartingSupportActionMode;
                } else {
                    if (this.f1037v == null) {
                        boolean z = this.f1000J;
                        Context context = this.f1026k;
                        if (z) {
                            TypedValue typedValue = new TypedValue();
                            Resources.Theme theme = context.getTheme();
                            theme.resolveAttribute(C0983R.attr.actionBarTheme, typedValue, true);
                            if (typedValue.resourceId != 0) {
                                Resources.Theme themeNewTheme = context.getResources().newTheme();
                                themeNewTheme.setTo(theme);
                                themeNewTheme.applyStyle(typedValue.resourceId, true);
                                C0455Z3 c0455z3 = new C0455Z3(context, 0);
                                c0455z3.getTheme().setTo(themeNewTheme);
                                context = c0455z3;
                            }
                            this.f1037v = new ActionBarContextView(context, null);
                            PopupWindow popupWindow = new PopupWindow(context, (AttributeSet) null, C0983R.attr.actionModePopupWindowStyle);
                            this.f1038w = popupWindow;
                            C0087Ec.m216d(popupWindow, 2);
                            this.f1038w.setContentView(this.f1037v);
                            this.f1038w.setWidth(-1);
                            context.getTheme().resolveAttribute(C0983R.attr.actionBarSize, typedValue, true);
                            this.f1037v.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics()));
                            this.f1038w.setHeight(-2);
                            this.f1039x = new RunnableC0344T0(this);
                        } else {
                            ViewStubCompat viewStubCompat = (ViewStubCompat) this.f992B.findViewById(C0983R.id.action_mode_bar_stub);
                            if (viewStubCompat != null) {
                                m807Q();
                                AbstractC0200L abstractC0200L2 = this.f1030o;
                                Context contextMo559e = abstractC0200L2 != null ? abstractC0200L2.mo559e() : null;
                                if (contextMo559e != null) {
                                    context = contextMo559e;
                                }
                                viewStubCompat.setLayoutInflater(LayoutInflater.from(context));
                                this.f1037v = (ActionBarContextView) viewStubCompat.m2396a();
                            }
                        }
                    }
                    if (this.f1037v != null) {
                        C0181Jg c0181Jg2 = this.f1040y;
                        if (c0181Jg2 != null) {
                            c0181Jg2.m489b();
                        }
                        this.f1037v.m2350h();
                        Context context2 = this.f1037v.getContext();
                        ActionBarContextView actionBarContextView = this.f1037v;
                        C0807re c0807re = new C0807re();
                        c0807re.f3197c = context2;
                        c0807re.f3198d = actionBarContextView;
                        c0807re.f3199e = dVar;
                        C0998f c0998f = new C0998f(actionBarContextView.getContext());
                        c0998f.f3795l = 1;
                        c0807re.f3202h = c0998f;
                        c0998f.f3788e = c0807re;
                        if (dVar.f1044a.mo329a(c0807re, c0998f)) {
                            c0807re.mo767i();
                            this.f1037v.m2348f(c0807re);
                            this.f1036u = c0807re;
                            if (this.f991A && (viewGroup = this.f992B) != null && viewGroup.isLaidOut()) {
                                this.f1037v.setAlpha(0.0f);
                                C0181Jg c0181JgM1994a = C0866ug.m1994a(this.f1037v);
                                c0181JgM1994a.m488a(1.0f);
                                this.f1040y = c0181JgM1994a;
                                c0181JgM1994a.m491d(new C0362U0(this));
                            } else {
                                this.f1037v.setAlpha(1.0f);
                                this.f1037v.setVisibility(0);
                                if (this.f1037v.getParent() instanceof View) {
                                    View view = (View) this.f1037v.getParent();
                                    WeakHashMap<View, C0181Jg> weakHashMap = C0866ug.f3395a;
                                    C0866ug.c.m2008c(view);
                                }
                            }
                            if (this.f1038w != null) {
                                this.f1027l.getDecorView().post(this.f1039x);
                            }
                        } else {
                            this.f1036u = null;
                        }
                    }
                }
                abstractC0272P = this.f1036u;
                if (abstractC0272P != null && r1 != 0) {
                    r1.onSupportActionModeStarted(abstractC0272P);
                }
                m815Y();
                this.f1036u = this.f1036u;
            } else {
                try {
                    abstractC0272POnWindowStartingSupportActionMode = r1.onWindowStartingSupportActionMode(dVar);
                } catch (AbstractMethodError unused) {
                    abstractC0272POnWindowStartingSupportActionMode = null;
                }
                if (abstractC0272POnWindowStartingSupportActionMode == null) {
                }
                abstractC0272P = this.f1036u;
                if (abstractC0272P != null) {
                    r1.onSupportActionModeStarted(abstractC0272P);
                }
                m815Y();
                this.f1036u = this.f1036u;
            }
        }
        m815Y();
        return this.f1036u;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v27, resolved type: android.app.Activity */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00e5  */
    /* JADX INFO: renamed from: D */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m796D(boolean z, boolean z2) {
        int i2;
        boolean z3;
        if (this.f1008R) {
            return false;
        }
        int i3 = this.f1010T;
        if (i3 == -100) {
            i3 = AbstractC0255O0.f887b;
        }
        int i4 = i3;
        Context context = this.f1026k;
        int iM809S = m809S(context, i4);
        int i5 = Build.VERSION.SDK_INT;
        C0174J9 c0174j9M794F = i5 < 33 ? m794F(context) : null;
        if (!z2 && c0174j9M794F != null) {
            c0174j9M794F = f.m823b(context.getResources().getConfiguration());
        }
        Configuration configurationM795J = m795J(context, iM809S, c0174j9M794F, null, false);
        boolean z4 = this.f1013W;
        Object obj = this.f1025j;
        boolean z5 = true;
        if (z4 || !(obj instanceof Activity)) {
            this.f1013W = true;
            i2 = this.f1012V;
        } else {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                i2 = 0;
            } else {
                try {
                    ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(context, obj.getClass()), i5 >= 29 ? 269221888 : 786432);
                    if (activityInfo != null) {
                        this.f1012V = activityInfo.configChanges;
                    }
                } catch (PackageManager.NameNotFoundException e2) {
                    Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e2);
                    this.f1012V = 0;
                }
                this.f1013W = true;
                i2 = this.f1012V;
            }
        }
        Configuration configuration = this.f1009S;
        if (configuration == null) {
            configuration = context.getResources().getConfiguration();
        }
        int i6 = configuration.uiMode & 48;
        int i7 = configurationM795J.uiMode & 48;
        C0174J9 c0174j9M823b = f.m823b(configuration);
        C0174J9 c0174j9M823b2 = c0174j9M794F == null ? null : f.m823b(configurationM795J);
        int i8 = i6 != i7 ? 512 : 0;
        if (c0174j9M823b2 != null && !c0174j9M823b.equals(c0174j9M823b2)) {
            i8 |= 8196;
        }
        if (((~i2) & i8) != 0 && z && this.f1006P && ((f990k0 || this.f1007Q) && (obj instanceof Activity))) {
            Activity activity = (Activity) obj;
            if (!activity.isChild()) {
                if (Build.VERSION.SDK_INT >= 31 && (i8 & 8192) != 0) {
                    activity.getWindow().getDecorView().setLayoutDirection(configurationM795J.getLayoutDirection());
                }
                activity.recreate();
                z3 = true;
            }
        } else {
            z3 = false;
        }
        if (z3 || i8 == 0) {
            z5 = z3;
        } else {
            boolean z6 = (i2 & i8) == i8;
            Resources resources = context.getResources();
            Configuration configuration2 = new Configuration(resources.getConfiguration());
            configuration2.uiMode = (resources.getConfiguration().uiMode & (-49)) | i7;
            if (c0174j9M823b2 != null) {
                f.m825d(configuration2, c0174j9M823b2);
            }
            resources.updateConfiguration(configuration2, null);
            int i9 = this.f1011U;
            if (i9 != 0) {
                context.setTheme(i9);
                context.getTheme().applyStyle(this.f1011U, true);
            }
            if (z6 && (obj instanceof Activity)) {
                Activity activity2 = (Activity) obj;
                if (activity2 instanceof InterfaceC0935y9) {
                    if (((InterfaceC0935y9) activity2).getLifecycle().mo2593b().compareTo(AbstractC1116e.b.f4674c) >= 0) {
                        activity2.onConfigurationChanged(configuration2);
                    }
                } else if (this.f1007Q && !this.f1008R) {
                    activity2.onConfigurationChanged(configuration2);
                }
            }
        }
        if (z5 && (obj instanceof ActivityC0075E0)) {
            if ((i8 & 512) != 0) {
                ((ActivityC0075E0) obj).onNightModeChanged(iM809S);
            }
            if ((i8 & 4) != 0) {
                ((ActivityC0075E0) obj).onLocalesChanged(c0174j9M794F);
            }
        }
        if (c0174j9M823b2 != null) {
            f.m824c(f.m823b(context.getResources().getConfiguration()));
        }
        if (i4 == 0) {
            m805O(context).m834e();
        } else {
            k kVar = this.f1014X;
            if (kVar != null) {
                kVar.m833a();
            }
        }
        if (i4 == 3) {
            if (this.f1015Y == null) {
                this.f1015Y = new i(context);
            }
            this.f1015Y.m834e();
        } else {
            i iVar = this.f1015Y;
            if (iVar != null) {
                iVar.m833a();
            }
        }
        return z5;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0074  */
    /* JADX INFO: renamed from: E */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m797E(Window window) {
        Drawable drawableM1810d;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        OnBackInvokedCallback onBackInvokedCallback;
        int resourceId;
        if (this.f1027l != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof h) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        h hVar = new h(callback);
        this.f1028m = hVar;
        window.setCallback(hVar);
        Context context = this.f1026k;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, f989j0);
        if (!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0) {
            drawableM1810d = null;
        } else {
            C0434Y0 c0434y0M1080a = C0434Y0.m1080a();
            synchronized (c0434y0M1080a) {
                drawableM1810d = c0434y0M1080a.f1632a.m1810d(context, resourceId, true);
            }
        }
        if (drawableM1810d != null) {
            window.setBackgroundDrawable(drawableM1810d);
        }
        typedArrayObtainStyledAttributes.recycle();
        this.f1027l = window;
        if (Build.VERSION.SDK_INT < 33 || (onBackInvokedDispatcher = this.f1023g0) != null) {
            return;
        }
        if (onBackInvokedDispatcher != null && (onBackInvokedCallback = this.f1024h0) != null) {
            g.m828c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f1024h0 = null;
        }
        Object obj = this.f1025j;
        if (obj instanceof Activity) {
            Activity activity = (Activity) obj;
            if (activity.getWindow() != null) {
                this.f1023g0 = g.m826a(activity);
            } else {
                this.f1023g0 = null;
            }
        }
        m815Y();
    }

    /* JADX INFO: renamed from: G */
    public final void m798G(int i2, m mVar, C0998f c0998f) {
        if (c0998f == null) {
            if (mVar == null && i2 >= 0) {
                m[] mVarArr = this.f1003M;
                if (i2 < mVarArr.length) {
                    mVar = mVarArr[i2];
                }
            }
            if (mVar != null) {
                c0998f = mVar.f1067h;
            }
        }
        if ((mVar == null || mVar.f1072m) && !this.f1008R) {
            h hVar = this.f1028m;
            Window.Callback callback = this.f1027l.getCallback();
            hVar.getClass();
            try {
                hVar.f1050e = true;
                callback.onPanelClosed(i2, c0998f);
            } finally {
                hVar.f1050e = false;
            }
        }
    }

    /* JADX INFO: renamed from: H */
    public final void m799H(C0998f c0998f) {
        if (this.f1002L) {
            return;
        }
        this.f1002L = true;
        this.f1033r.mo615l();
        Window.Callback callback = this.f1027l.getCallback();
        if (callback != null && !this.f1008R) {
            callback.onPanelClosed(108, c0998f);
        }
        this.f1002L = false;
    }

    /* JADX INFO: renamed from: I */
    public final void m800I(m mVar, boolean z) {
        l lVar;
        InterfaceC0223M4 interfaceC0223M4;
        if (z && mVar.f1060a == 0 && (interfaceC0223M4 = this.f1033r) != null && interfaceC0223M4.mo608b()) {
            m799H(mVar.f1067h);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f1026k.getSystemService("window");
        if (windowManager != null && mVar.f1072m && (lVar = mVar.f1064e) != null) {
            windowManager.removeView(lVar);
            if (z) {
                m798G(mVar.f1060a, mVar, null);
            }
        }
        mVar.f1070k = false;
        mVar.f1071l = false;
        mVar.f1072m = false;
        mVar.f1065f = null;
        mVar.f1073n = true;
        if (this.f1004N == mVar) {
            this.f1004N = null;
        }
        if (mVar.f1060a == 0) {
            m815Y();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d7  */
    /* JADX INFO: renamed from: K */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m801K(KeyEvent keyEvent) {
        boolean zMo609d;
        boolean zM813W;
        Object obj = this.f1025j;
        if (((obj instanceof InterfaceC0840t9) || (obj instanceof DialogC0416X0)) && this.f1027l.getDecorView() != null) {
            WeakHashMap<View, C0181Jg> weakHashMap = C0866ug.f3395a;
        }
        if (keyEvent.getKeyCode() == 82) {
            h hVar = this.f1028m;
            Window.Callback callback = this.f1027l.getCallback();
            hVar.getClass();
            try {
                hVar.f1049d = true;
                if (!callback.dispatchKeyEvent(keyEvent)) {
                    int keyCode = keyEvent.getKeyCode();
                    if (keyEvent.getAction() == 0) {
                        if (keyCode == 4) {
                            this.f1005O = (keyEvent.getFlags() & 128) != 0;
                            return false;
                        }
                        if (keyCode == 82) {
                            if (keyEvent.getRepeatCount() == 0) {
                                m mVarM806P = m806P(0);
                                if (!mVarM806P.f1072m) {
                                    m813W(mVarM806P, keyEvent);
                                    return true;
                                }
                            }
                        }
                        return false;
                    }
                    if (keyCode != 4) {
                        if (keyCode == 82) {
                            if (this.f1036u == null) {
                                m mVarM806P2 = m806P(0);
                                InterfaceC0223M4 interfaceC0223M4 = this.f1033r;
                                Context context = this.f1026k;
                                if (interfaceC0223M4 == null || !interfaceC0223M4.mo613h() || ViewConfiguration.get(context).hasPermanentMenuKey()) {
                                    boolean z = mVarM806P2.f1072m;
                                    if (z || mVarM806P2.f1071l) {
                                        m800I(mVarM806P2, true);
                                        zMo609d = z;
                                    } else if (mVarM806P2.f1070k) {
                                        if (mVarM806P2.f1074o) {
                                            mVarM806P2.f1070k = false;
                                            zM813W = m813W(mVarM806P2, keyEvent);
                                        } else {
                                            zM813W = true;
                                        }
                                        if (zM813W) {
                                            m811U(mVarM806P2, keyEvent);
                                            zMo609d = true;
                                        }
                                    } else {
                                        zMo609d = false;
                                    }
                                    if (zMo609d) {
                                        AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
                                        if (audioManager != null) {
                                            audioManager.playSoundEffect(0);
                                            return true;
                                        }
                                        Log.w("AppCompatDelegate", "Couldn't get audio manager");
                                        return true;
                                    }
                                } else {
                                    if (this.f1033r.mo608b()) {
                                        zMo609d = this.f1033r.mo609d();
                                    } else if (!this.f1008R && m813W(mVarM806P2, keyEvent)) {
                                        zMo609d = this.f1033r.mo611f();
                                    }
                                    if (zMo609d) {
                                    }
                                }
                            }
                        }
                        return false;
                    }
                    if (!m810T()) {
                        return false;
                    }
                }
            } finally {
                hVar.f1049d = false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: L */
    public final void m802L(int i2) {
        m mVarM806P = m806P(i2);
        if (mVarM806P.f1067h != null) {
            Bundle bundle = new Bundle();
            mVarM806P.f1067h.m2335t(bundle);
            if (bundle.size() > 0) {
                mVarM806P.f1075p = bundle;
            }
            mVarM806P.f1067h.m2338w();
            mVarM806P.f1067h.clear();
        }
        mVarM806P.f1074o = true;
        mVarM806P.f1073n = true;
        if ((i2 == 108 || i2 == 0) && this.f1033r != null) {
            m mVarM806P2 = m806P(0);
            mVarM806P2.f1070k = false;
            m813W(mVarM806P2, null);
        }
    }

    /* JADX INFO: renamed from: M */
    public final void m803M() {
        ViewGroup viewGroup;
        if (this.f991A) {
            return;
        }
        int[] iArr = C0983R.styleable.AppCompatTheme;
        Context context = this.f1026k;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        if (!typedArrayObtainStyledAttributes.hasValue(C0983R.styleable.AppCompatTheme_windowActionBar)) {
            typedArrayObtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (typedArrayObtainStyledAttributes.getBoolean(C0983R.styleable.AppCompatTheme_windowNoTitle, false)) {
            mo715v(1);
        } else if (typedArrayObtainStyledAttributes.getBoolean(C0983R.styleable.AppCompatTheme_windowActionBar, false)) {
            mo715v(108);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(C0983R.styleable.AppCompatTheme_windowActionBarOverlay, false)) {
            mo715v(109);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(C0983R.styleable.AppCompatTheme_windowActionModeOverlay, false)) {
            mo715v(10);
        }
        this.f1000J = typedArrayObtainStyledAttributes.getBoolean(C0983R.styleable.AppCompatTheme_android_windowIsFloating, false);
        typedArrayObtainStyledAttributes.recycle();
        m804N();
        this.f1027l.getDecorView();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        if (this.f1001K) {
            viewGroup = this.f999I ? (ViewGroup) layoutInflaterFrom.inflate(C0983R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) layoutInflaterFrom.inflate(C0983R.layout.abc_screen_simple, (ViewGroup) null);
        } else if (this.f1000J) {
            viewGroup = (ViewGroup) layoutInflaterFrom.inflate(C0983R.layout.abc_dialog_title_material, (ViewGroup) null);
            this.f998H = false;
            this.f997G = false;
        } else if (this.f997G) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(C0983R.attr.actionBarTheme, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new C0455Z3(context, typedValue.resourceId) : context).inflate(C0983R.layout.abc_screen_toolbar, (ViewGroup) null);
            InterfaceC0223M4 interfaceC0223M4 = (InterfaceC0223M4) viewGroup.findViewById(C0983R.id.decor_content_parent);
            this.f1033r = interfaceC0223M4;
            interfaceC0223M4.setWindowCallback(this.f1027l.getCallback());
            if (this.f998H) {
                this.f1033r.mo614k(109);
            }
            if (this.f995E) {
                this.f1033r.mo614k(2);
            }
            if (this.f996F) {
                this.f1033r.mo614k(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.f997G + ", windowActionBarOverlay: " + this.f998H + ", android:windowIsFloating: " + this.f1000J + ", windowActionModeOverlay: " + this.f999I + ", windowNoTitle: " + this.f1001K + " }");
        }
        C0308R0 c0308r0 = new C0308R0(this);
        WeakHashMap<View, C0181Jg> weakHashMap = C0866ug.f3395a;
        C0866ug.d.m2029u(viewGroup, c0308r0);
        if (this.f1033r == null) {
            this.f993C = (TextView) viewGroup.findViewById(C0983R.id.title);
        }
        try {
            Method method = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", null);
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            method.invoke(viewGroup, null);
        } catch (IllegalAccessException e2) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e2);
        } catch (NoSuchMethodException unused) {
            Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
        } catch (InvocationTargetException e3) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e3);
        }
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(C0983R.id.action_bar_activity_content);
        ViewGroup viewGroup2 = (ViewGroup) this.f1027l.findViewById(R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(R.id.content);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.f1027l.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new C0326S0(this));
        this.f992B = viewGroup;
        Object obj = this.f1025j;
        CharSequence title = obj instanceof Activity ? ((Activity) obj).getTitle() : this.f1032q;
        if (!TextUtils.isEmpty(title)) {
            InterfaceC0223M4 interfaceC0223M42 = this.f1033r;
            if (interfaceC0223M42 != null) {
                interfaceC0223M42.setWindowTitle(title);
            } else {
                AbstractC0200L abstractC0200L = this.f1030o;
                if (abstractC0200L != null) {
                    abstractC0200L.mo568n(title);
                } else {
                    TextView textView = this.f993C;
                    if (textView != null) {
                        textView.setText(title);
                    }
                }
            }
        }
        ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.f992B.findViewById(R.id.content);
        View decorView = this.f1027l.getDecorView();
        contentFrameLayout2.f3963g.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        if (contentFrameLayout2.isLaidOut()) {
            contentFrameLayout2.requestLayout();
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(C0983R.styleable.AppCompatTheme);
        typedArrayObtainStyledAttributes2.getValue(C0983R.styleable.AppCompatTheme_windowMinWidthMajor, contentFrameLayout2.getMinWidthMajor());
        typedArrayObtainStyledAttributes2.getValue(C0983R.styleable.AppCompatTheme_windowMinWidthMinor, contentFrameLayout2.getMinWidthMinor());
        if (typedArrayObtainStyledAttributes2.hasValue(C0983R.styleable.AppCompatTheme_windowFixedWidthMajor)) {
            typedArrayObtainStyledAttributes2.getValue(C0983R.styleable.AppCompatTheme_windowFixedWidthMajor, contentFrameLayout2.getFixedWidthMajor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(C0983R.styleable.AppCompatTheme_windowFixedWidthMinor)) {
            typedArrayObtainStyledAttributes2.getValue(C0983R.styleable.AppCompatTheme_windowFixedWidthMinor, contentFrameLayout2.getFixedWidthMinor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(C0983R.styleable.AppCompatTheme_windowFixedHeightMajor)) {
            typedArrayObtainStyledAttributes2.getValue(C0983R.styleable.AppCompatTheme_windowFixedHeightMajor, contentFrameLayout2.getFixedHeightMajor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(C0983R.styleable.AppCompatTheme_windowFixedHeightMinor)) {
            typedArrayObtainStyledAttributes2.getValue(C0983R.styleable.AppCompatTheme_windowFixedHeightMinor, contentFrameLayout2.getFixedHeightMinor());
        }
        typedArrayObtainStyledAttributes2.recycle();
        contentFrameLayout2.requestLayout();
        this.f991A = true;
        m mVarM806P = m806P(0);
        if (this.f1008R || mVarM806P.f1067h != null) {
            return;
        }
        m808R(108);
    }

    /* JADX INFO: renamed from: N */
    public final void m804N() {
        if (this.f1027l == null) {
            Object obj = this.f1025j;
            if (obj instanceof Activity) {
                m797E(((Activity) obj).getWindow());
            }
        }
        if (this.f1027l == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    /* JADX INFO: renamed from: O */
    public final j m805O(Context context) {
        if (this.f1014X == null) {
            if (C0180Jf.f622d == null) {
                Context applicationContext = context.getApplicationContext();
                C0180Jf.f622d = new C0180Jf(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.f1014X = new k(C0180Jf.f622d);
        }
        return this.f1014X;
    }

    /* JADX INFO: renamed from: P */
    public final m m806P(int i2) {
        m[] mVarArr = this.f1003M;
        if (mVarArr == null || mVarArr.length <= i2) {
            m[] mVarArr2 = new m[i2 + 1];
            if (mVarArr != null) {
                System.arraycopy(mVarArr, 0, mVarArr2, 0, mVarArr.length);
            }
            this.f1003M = mVarArr2;
            mVarArr = mVarArr2;
        }
        m mVar = mVarArr[i2];
        if (mVar != null) {
            return mVar;
        }
        m mVar2 = new m();
        mVar2.f1060a = i2;
        mVar2.f1073n = false;
        mVarArr[i2] = mVar2;
        return mVar2;
    }

    /* JADX INFO: renamed from: Q */
    public final void m807Q() {
        m803M();
        if (this.f997G && this.f1030o == null) {
            Object obj = this.f1025j;
            if (obj instanceof Activity) {
                this.f1030o = new C0696lh((Activity) obj, this.f998H);
            } else if (obj instanceof Dialog) {
                this.f1030o = new C0696lh((Dialog) obj);
            }
            AbstractC0200L abstractC0200L = this.f1030o;
            if (abstractC0200L != null) {
                abstractC0200L.mo566l(this.f1019c0);
            }
        }
    }

    /* JADX INFO: renamed from: R */
    public final void m808R(int i2) {
        this.f1017a0 = (1 << i2) | this.f1017a0;
        if (this.f1016Z) {
            return;
        }
        View decorView = this.f1027l.getDecorView();
        WeakHashMap<View, C0181Jg> weakHashMap = C0866ug.f3395a;
        decorView.postOnAnimation(this.f1018b0);
        this.f1016Z = true;
    }

    /* JADX INFO: renamed from: S */
    public final int m809S(Context context, int i2) {
        if (i2 != -100) {
            if (i2 != -1) {
                if (i2 != 0) {
                    if (i2 != 1 && i2 != 2) {
                        if (i2 != 3) {
                            throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                        }
                        if (this.f1015Y == null) {
                            this.f1015Y = new i(context);
                        }
                        return this.f1015Y.mo831c();
                    }
                } else if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() != 0) {
                    return m805O(context).mo831c();
                }
            }
            return i2;
        }
        return -1;
    }

    /* JADX INFO: renamed from: T */
    public final boolean m810T() {
        boolean z = this.f1005O;
        this.f1005O = false;
        m mVarM806P = m806P(0);
        if (!mVarM806P.f1072m) {
            AbstractC0272P abstractC0272P = this.f1036u;
            if (abstractC0272P != null) {
                abstractC0272P.mo761c();
                return true;
            }
            m807Q();
            AbstractC0200L abstractC0200L = this.f1030o;
            if (abstractC0200L == null || !abstractC0200L.mo556b()) {
                return false;
            }
        } else if (!z) {
            m800I(mVarM806P, true);
            return true;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x0175, code lost:
    
        if (r3.f3774g.getCount() > 0) goto L88;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: U */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m811U(m mVar, KeyEvent keyEvent) {
        int i2;
        ViewGroup.LayoutParams layoutParams;
        if (mVar.f1072m || this.f1008R) {
            return;
        }
        int i3 = mVar.f1060a;
        Context context = this.f1026k;
        if (i3 == 0 && (context.getResources().getConfiguration().screenLayout & 15) == 4) {
            return;
        }
        Window.Callback callback = this.f1027l.getCallback();
        if (callback != null && !callback.onMenuOpened(i3, mVar.f1067h)) {
            m800I(mVar, true);
            return;
        }
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager == null || !m813W(mVar, keyEvent)) {
            return;
        }
        l lVar = mVar.f1064e;
        if (lVar != null && !mVar.f1073n) {
            View view = mVar.f1066g;
            if (view != null && (layoutParams = view.getLayoutParams()) != null && layoutParams.width == -1) {
                i2 = -1;
            }
            mVar.f1071l = false;
            WindowManager.LayoutParams layoutParams2 = new WindowManager.LayoutParams(i2, -2, 0, 0, 1002, 8519680, -3);
            layoutParams2.gravity = mVar.f1062c;
            layoutParams2.windowAnimations = mVar.f1063d;
            windowManager.addView(mVar.f1064e, layoutParams2);
            mVar.f1072m = true;
            if (i3 != 0) {
                m815Y();
                return;
            }
            return;
        }
        if (lVar == null) {
            m807Q();
            AbstractC0200L abstractC0200L = this.f1030o;
            Context contextMo559e = abstractC0200L != null ? abstractC0200L.mo559e() : null;
            if (contextMo559e != null) {
                context = contextMo559e;
            }
            TypedValue typedValue = new TypedValue();
            Resources.Theme themeNewTheme = context.getResources().newTheme();
            themeNewTheme.setTo(context.getTheme());
            themeNewTheme.resolveAttribute(C0983R.attr.actionBarPopupTheme, typedValue, true);
            int i4 = typedValue.resourceId;
            if (i4 != 0) {
                themeNewTheme.applyStyle(i4, true);
            }
            themeNewTheme.resolveAttribute(C0983R.attr.panelMenuListTheme, typedValue, true);
            int i5 = typedValue.resourceId;
            if (i5 != 0) {
                themeNewTheme.applyStyle(i5, true);
            } else {
                themeNewTheme.applyStyle(C0983R.style.Theme_AppCompat_CompactMenu, true);
            }
            C0455Z3 c0455z3 = new C0455Z3(context, 0);
            c0455z3.getTheme().setTo(themeNewTheme);
            mVar.f1069j = c0455z3;
            TypedArray typedArrayObtainStyledAttributes = c0455z3.obtainStyledAttributes(C0983R.styleable.AppCompatTheme);
            mVar.f1061b = typedArrayObtainStyledAttributes.getResourceId(C0983R.styleable.AppCompatTheme_panelBackground, 0);
            mVar.f1063d = typedArrayObtainStyledAttributes.getResourceId(C0983R.styleable.AppCompatTheme_android_windowAnimationStyle, 0);
            typedArrayObtainStyledAttributes.recycle();
            mVar.f1064e = new l(mVar.f1069j);
            mVar.f1062c = 81;
        } else if (mVar.f1073n && lVar.getChildCount() > 0) {
            mVar.f1064e.removeAllViews();
        }
        View view2 = mVar.f1066g;
        if (view2 == null) {
            if (mVar.f1067h != null) {
                if (this.f1035t == null) {
                    this.f1035t = new n();
                }
                n nVar = this.f1035t;
                if (mVar.f1068i == null) {
                    C0996d c0996d = new C0996d(mVar.f1069j, C0983R.layout.abc_list_menu_item_layout);
                    mVar.f1068i = c0996d;
                    c0996d.f3773f = nVar;
                    C0998f c0998f = mVar.f1067h;
                    c0998f.m2317b(c0996d, c0998f.f3784a);
                }
                C0996d c0996d2 = mVar.f1068i;
                l lVar2 = mVar.f1064e;
                if (c0996d2.f3771d == null) {
                    c0996d2.f3771d = (ExpandedMenuView) c0996d2.f3769b.inflate(C0983R.layout.abc_expanded_menu_layout, (ViewGroup) lVar2, false);
                    if (c0996d2.f3774g == null) {
                        c0996d2.f3774g = c0996d2.new a();
                    }
                    c0996d2.f3771d.setAdapter((ListAdapter) c0996d2.f3774g);
                    c0996d2.f3771d.setOnItemClickListener(c0996d2);
                }
                ExpandedMenuView expandedMenuView = c0996d2.f3771d;
                mVar.f1065f = expandedMenuView;
                if (expandedMenuView != null) {
                }
            }
            mVar.f1073n = true;
            return;
        }
        mVar.f1065f = view2;
        if (mVar.f1065f != null) {
            if (mVar.f1066g == null) {
                C0996d c0996d3 = mVar.f1068i;
                if (c0996d3.f3774g == null) {
                    c0996d3.f3774g = c0996d3.new a();
                }
            }
            ViewGroup.LayoutParams layoutParams3 = mVar.f1065f.getLayoutParams();
            if (layoutParams3 == null) {
                layoutParams3 = new ViewGroup.LayoutParams(-2, -2);
            }
            mVar.f1064e.setBackgroundResource(mVar.f1061b);
            ViewParent parent = mVar.f1065f.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(mVar.f1065f);
            }
            mVar.f1064e.addView(mVar.f1065f, layoutParams3);
            if (!mVar.f1065f.hasFocus()) {
                mVar.f1065f.requestFocus();
            }
        }
        mVar.f1073n = true;
        return;
        i2 = -2;
        mVar.f1071l = false;
        WindowManager.LayoutParams layoutParams22 = new WindowManager.LayoutParams(i2, -2, 0, 0, 1002, 8519680, -3);
        layoutParams22.gravity = mVar.f1062c;
        layoutParams22.windowAnimations = mVar.f1063d;
        windowManager.addView(mVar.f1064e, layoutParams22);
        mVar.f1072m = true;
        if (i3 != 0) {
        }
    }

    /* JADX INFO: renamed from: V */
    public final boolean m812V(m mVar, int i2, KeyEvent keyEvent) {
        C0998f c0998f;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((mVar.f1070k || m813W(mVar, keyEvent)) && (c0998f = mVar.f1067h) != null) {
            return c0998f.performShortcut(i2, keyEvent, 1);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x00d0  */
    /* JADX INFO: renamed from: W */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m813W(m mVar, KeyEvent keyEvent) {
        InterfaceC0223M4 interfaceC0223M4;
        InterfaceC0223M4 interfaceC0223M42;
        Resources.Theme themeNewTheme;
        InterfaceC0223M4 interfaceC0223M43;
        InterfaceC0223M4 interfaceC0223M44;
        if (!this.f1008R) {
            if (mVar.f1070k) {
                return true;
            }
            m mVar2 = this.f1004N;
            if (mVar2 != null && mVar2 != mVar) {
                m800I(mVar2, false);
            }
            Window.Callback callback = this.f1027l.getCallback();
            int i2 = mVar.f1060a;
            if (callback != null) {
                mVar.f1066g = callback.onCreatePanelView(i2);
            }
            boolean z = i2 == 0 || i2 == 108;
            if (z && (interfaceC0223M44 = this.f1033r) != null) {
                interfaceC0223M44.mo612g();
            }
            if (mVar.f1066g == null && (!z || !(this.f1030o instanceof C0865uf))) {
                C0998f c0998f = mVar.f1067h;
                if (c0998f == null || mVar.f1074o) {
                    if (c0998f == null) {
                        Context context = this.f1026k;
                        if ((i2 == 0 || i2 == 108) && this.f1033r != null) {
                            TypedValue typedValue = new TypedValue();
                            Resources.Theme theme = context.getTheme();
                            theme.resolveAttribute(C0983R.attr.actionBarTheme, typedValue, true);
                            if (typedValue.resourceId != 0) {
                                themeNewTheme = context.getResources().newTheme();
                                themeNewTheme.setTo(theme);
                                themeNewTheme.applyStyle(typedValue.resourceId, true);
                                themeNewTheme.resolveAttribute(C0983R.attr.actionBarWidgetTheme, typedValue, true);
                            } else {
                                theme.resolveAttribute(C0983R.attr.actionBarWidgetTheme, typedValue, true);
                                themeNewTheme = null;
                            }
                            if (typedValue.resourceId != 0) {
                                if (themeNewTheme == null) {
                                    themeNewTheme = context.getResources().newTheme();
                                    themeNewTheme.setTo(theme);
                                }
                                themeNewTheme.applyStyle(typedValue.resourceId, true);
                            }
                            if (themeNewTheme != null) {
                                C0455Z3 c0455z3 = new C0455Z3(context, 0);
                                c0455z3.getTheme().setTo(themeNewTheme);
                                context = c0455z3;
                            }
                        }
                        C0998f c0998f2 = new C0998f(context);
                        c0998f2.f3788e = this;
                        C0998f c0998f3 = mVar.f1067h;
                        if (c0998f2 != c0998f3) {
                            if (c0998f3 != null) {
                                c0998f3.m2333r(mVar.f1068i);
                            }
                            mVar.f1067h = c0998f2;
                            C0996d c0996d = mVar.f1068i;
                            if (c0996d != null) {
                                c0998f2.m2317b(c0996d, c0998f2.f3784a);
                            }
                        }
                        if (mVar.f1067h != null) {
                            if (z && (interfaceC0223M42 = this.f1033r) != null) {
                                if (this.f1034s == null) {
                                    this.f1034s = new c();
                                }
                                interfaceC0223M42.mo610e(mVar.f1067h, this.f1034s);
                            }
                            mVar.f1067h.m2338w();
                            if (callback.onCreatePanelMenu(i2, mVar.f1067h)) {
                                mVar.f1074o = false;
                            } else {
                                C0998f c0998f4 = mVar.f1067h;
                                if (c0998f4 != null) {
                                    if (c0998f4 != null) {
                                        c0998f4.m2333r(mVar.f1068i);
                                    }
                                    mVar.f1067h = null;
                                }
                                if (z && (interfaceC0223M4 = this.f1033r) != null) {
                                    interfaceC0223M4.mo610e(null, this.f1034s);
                                }
                            }
                        }
                    }
                }
                mVar.f1067h.m2338w();
                Bundle bundle = mVar.f1075p;
                if (bundle != null) {
                    mVar.f1067h.m2334s(bundle);
                    mVar.f1075p = null;
                }
                if (!callback.onPreparePanel(0, mVar.f1066g, mVar.f1067h)) {
                    if (z && (interfaceC0223M43 = this.f1033r) != null) {
                        interfaceC0223M43.mo610e(null, this.f1034s);
                    }
                    mVar.f1067h.m2337v();
                    return false;
                }
                mVar.f1067h.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
                mVar.f1067h.m2337v();
            }
            mVar.f1070k = true;
            mVar.f1071l = false;
            this.f1004N = mVar;
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: X */
    public final void m814X() {
        if (this.f991A) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    /* JADX INFO: renamed from: Y */
    public final void m815Y() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z = false;
            if (this.f1023g0 != null && (m806P(0).f1072m || this.f1036u != null)) {
                z = true;
            }
            if (z && this.f1024h0 == null) {
                this.f1024h0 = g.m827b(this.f1023g0, this);
            } else {
                if (z || (onBackInvokedCallback = this.f1024h0) == null) {
                    return;
                }
                g.m828c(this.f1023g0, onBackInvokedCallback);
                this.f1024h0 = null;
            }
        }
    }

    @Override // androidx.appcompat.view.menu.C0998f.a
    /* JADX INFO: renamed from: a */
    public final boolean mo816a(C0998f c0998f, MenuItem menuItem) {
        m mVar;
        Window.Callback callback = this.f1027l.getCallback();
        if (callback != null && !this.f1008R) {
            C0998f c0998fMo2326k = c0998f.mo2326k();
            m[] mVarArr = this.f1003M;
            int length = mVarArr != null ? mVarArr.length : 0;
            int i2 = 0;
            while (true) {
                if (i2 < length) {
                    mVar = mVarArr[i2];
                    if (mVar != null && mVar.f1067h == c0998fMo2326k) {
                        break;
                    }
                    i2++;
                } else {
                    mVar = null;
                    break;
                }
            }
            if (mVar != null) {
                return callback.onMenuItemSelected(mVar.f1060a, menuItem);
            }
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.C0998f.a
    /* JADX INFO: renamed from: b */
    public final void mo817b(C0998f c0998f) {
        InterfaceC0223M4 interfaceC0223M4 = this.f1033r;
        if (interfaceC0223M4 == null || !interfaceC0223M4.mo613h() || (ViewConfiguration.get(this.f1026k).hasPermanentMenuKey() && !this.f1033r.mo607a())) {
            m mVarM806P = m806P(0);
            mVarM806P.f1073n = true;
            m800I(mVarM806P, false);
            m811U(mVarM806P, null);
            return;
        }
        Window.Callback callback = this.f1027l.getCallback();
        if (this.f1033r.mo608b()) {
            this.f1033r.mo609d();
            if (this.f1008R) {
                return;
            }
            callback.onPanelClosed(108, m806P(0).f1067h);
            return;
        }
        if (callback == null || this.f1008R) {
            return;
        }
        if (this.f1016Z && (1 & this.f1017a0) != 0) {
            View decorView = this.f1027l.getDecorView();
            a aVar = this.f1018b0;
            decorView.removeCallbacks(aVar);
            aVar.run();
        }
        m mVarM806P2 = m806P(0);
        C0998f c0998f2 = mVarM806P2.f1067h;
        if (c0998f2 == null || mVarM806P2.f1074o || !callback.onPreparePanel(0, mVarM806P2.f1066g, c0998f2)) {
            return;
        }
        callback.onMenuOpened(108, mVarM806P2.f1067h);
        this.f1033r.mo611f();
    }

    @Override // p000a.AbstractC0255O0
    /* JADX INFO: renamed from: c */
    public final void mo698c(View view, ViewGroup.LayoutParams layoutParams) {
        m803M();
        ((ViewGroup) this.f992B.findViewById(R.id.content)).addView(view, layoutParams);
        this.f1028m.m829a(this.f1027l.getCallback());
    }

    @Override // p000a.AbstractC0255O0
    /* JADX INFO: renamed from: d */
    public final Context mo699d(Context context) {
        Configuration configuration;
        int i2 = 0;
        this.f1006P = true;
        int i3 = this.f1010T;
        if (i3 == -100) {
            i3 = AbstractC0255O0.f887b;
        }
        int iM809S = m809S(context, i3);
        if (AbstractC0255O0.m693m(context) && AbstractC0255O0.m693m(context)) {
            if (Build.VERSION.SDK_INT < 33) {
                synchronized (AbstractC0255O0.f894i) {
                    try {
                        C0174J9 c0174j9 = AbstractC0255O0.f888c;
                        if (c0174j9 == null) {
                            if (AbstractC0255O0.f889d == null) {
                                AbstractC0255O0.f889d = C0174J9.m471a(C0889w1.m2132S(context));
                            }
                            if (!AbstractC0255O0.f889d.f612a.f697a.isEmpty()) {
                                AbstractC0255O0.f888c = AbstractC0255O0.f889d;
                            }
                        } else if (!c0174j9.equals(AbstractC0255O0.f889d)) {
                            C0174J9 c0174j92 = AbstractC0255O0.f888c;
                            AbstractC0255O0.f889d = c0174j92;
                            C0889w1.m2126M(context, c0174j92.f612a.f697a.toLanguageTags());
                        }
                    } finally {
                    }
                }
            } else if (!AbstractC0255O0.f891f) {
                AbstractC0255O0.f886a.execute(new RunnableC0237N0(context, i2));
            }
        }
        C0174J9 c0174j9M794F = m794F(context);
        if (context instanceof ContextThemeWrapper) {
            try {
                ((ContextThemeWrapper) context).applyOverrideConfiguration(m795J(context, iM809S, c0174j9M794F, null, false));
                return context;
            } catch (IllegalStateException unused) {
            }
        }
        if (context instanceof C0455Z3) {
            try {
                ((C0455Z3) context).m1116a(m795J(context, iM809S, c0174j9M794F, null, false));
                return context;
            } catch (IllegalStateException unused2) {
            }
        }
        if (!f990k0) {
            return context;
        }
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
                float f2 = configuration3.fontScale;
                float f3 = configuration4.fontScale;
                if (f2 != f3) {
                    configuration.fontScale = f3;
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
                f.m822a(configuration3, configuration4, configuration);
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
                int i28 = configuration3.colorMode & 3;
                int i29 = configuration4.colorMode & 3;
                if (i28 != i29) {
                    configuration.colorMode |= i29;
                }
                int i30 = configuration3.colorMode & 12;
                int i31 = configuration4.colorMode & 12;
                if (i30 != i31) {
                    configuration.colorMode |= i31;
                }
                int i32 = configuration3.uiMode & 15;
                int i33 = configuration4.uiMode & 15;
                if (i32 != i33) {
                    configuration.uiMode |= i33;
                }
                int i34 = configuration3.uiMode & 48;
                int i35 = configuration4.uiMode & 48;
                if (i34 != i35) {
                    configuration.uiMode |= i35;
                }
                int i36 = configuration3.screenWidthDp;
                int i37 = configuration4.screenWidthDp;
                if (i36 != i37) {
                    configuration.screenWidthDp = i37;
                }
                int i38 = configuration3.screenHeightDp;
                int i39 = configuration4.screenHeightDp;
                if (i38 != i39) {
                    configuration.screenHeightDp = i39;
                }
                int i40 = configuration3.smallestScreenWidthDp;
                int i41 = configuration4.smallestScreenWidthDp;
                if (i40 != i41) {
                    configuration.smallestScreenWidthDp = i41;
                }
                int i42 = configuration3.densityDpi;
                int i43 = configuration4.densityDpi;
                if (i42 != i43) {
                    configuration.densityDpi = i43;
                }
            }
        }
        Configuration configurationM795J = m795J(context, iM809S, c0174j9M794F, configuration, true);
        C0455Z3 c0455z3 = new C0455Z3(context, C0983R.style.Theme_AppCompat_Empty);
        c0455z3.m1116a(configurationM795J);
        try {
            if (context.getTheme() != null) {
                Resources.Theme theme = c0455z3.getTheme();
                if (Build.VERSION.SDK_INT >= 29) {
                    C0844td.m1969a(theme);
                } else {
                    synchronized (C0825sd.f3284a) {
                        if (!C0825sd.f3286c) {
                            try {
                                Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", null);
                                C0825sd.f3285b = declaredMethod;
                                declaredMethod.setAccessible(true);
                            } catch (NoSuchMethodException e2) {
                                Log.i("ResourcesCompat", "Failed to retrieve rebase() method", e2);
                            }
                            C0825sd.f3286c = true;
                        }
                        Method method = C0825sd.f3285b;
                        if (method != null) {
                            try {
                                method.invoke(theme, null);
                            } catch (IllegalAccessException | InvocationTargetException e3) {
                                Log.i("ResourcesCompat", "Failed to invoke rebase() method via reflection", e3);
                                C0825sd.f3285b = null;
                            }
                        }
                    }
                }
            }
        } catch (NullPointerException unused3) {
        }
        return c0455z3;
    }

    @Override // p000a.AbstractC0255O0
    /* JADX INFO: renamed from: e */
    public final <T extends View> T mo700e(int i2) {
        m803M();
        return (T) this.f1027l.findViewById(i2);
    }

    @Override // p000a.AbstractC0255O0
    /* JADX INFO: renamed from: f */
    public final Context mo701f() {
        return this.f1026k;
    }

    @Override // p000a.AbstractC0255O0
    /* JADX INFO: renamed from: g */
    public final b mo702g() {
        return new b();
    }

    @Override // p000a.AbstractC0255O0
    /* JADX INFO: renamed from: h */
    public final int mo703h() {
        return this.f1010T;
    }

    @Override // p000a.AbstractC0255O0
    /* JADX INFO: renamed from: i */
    public final MenuInflater mo704i() {
        if (this.f1031p == null) {
            m807Q();
            AbstractC0200L abstractC0200L = this.f1030o;
            this.f1031p = new C0161Ie(abstractC0200L != null ? abstractC0200L.mo559e() : this.f1026k);
        }
        return this.f1031p;
    }

    @Override // p000a.AbstractC0255O0
    /* JADX INFO: renamed from: j */
    public final AbstractC0200L mo705j() {
        m807Q();
        return this.f1030o;
    }

    @Override // p000a.AbstractC0255O0
    /* JADX INFO: renamed from: k */
    public final void mo706k() {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f1026k);
        if (layoutInflaterFrom.getFactory() == null) {
            layoutInflaterFrom.setFactory2(this);
        } else {
            if (layoutInflaterFrom.getFactory2() instanceof LayoutInflaterFactory2C0291Q0) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    @Override // p000a.AbstractC0255O0
    /* JADX INFO: renamed from: l */
    public final void mo707l() {
        if (this.f1030o != null) {
            m807Q();
            if (this.f1030o.mo560f()) {
                return;
            }
            m808R(0);
        }
    }

    @Override // p000a.AbstractC0255O0
    /* JADX INFO: renamed from: n */
    public final void mo708n(Configuration configuration) {
        if (this.f997G && this.f991A) {
            m807Q();
            AbstractC0200L abstractC0200L = this.f1030o;
            if (abstractC0200L != null) {
                abstractC0200L.mo561g();
            }
        }
        C0434Y0 c0434y0M1080a = C0434Y0.m1080a();
        Context context = this.f1026k;
        synchronized (c0434y0M1080a) {
            C0768pd c0768pd = c0434y0M1080a.f1632a;
            synchronized (c0768pd) {
                C0371U9<WeakReference<Drawable.ConstantState>> c0371u9 = c0768pd.f3038b.get(context);
                if (c0371u9 != null) {
                    c0371u9.m988a();
                }
            }
        }
        this.f1009S = new Configuration(this.f1026k.getResources().getConfiguration());
        m796D(false, false);
    }

    @Override // p000a.AbstractC0255O0
    /* JADX INFO: renamed from: o */
    public final void mo709o() {
        String strM366c;
        this.f1006P = true;
        m796D(false, true);
        m804N();
        Object obj = this.f1025j;
        if (obj instanceof Activity) {
            try {
                Activity activity = (Activity) obj;
                try {
                    strM366c = C0140Hb.m366c(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e2) {
                    throw new IllegalArgumentException(e2);
                }
            } catch (IllegalArgumentException unused) {
                strM366c = null;
            }
            if (strM366c != null) {
                AbstractC0200L abstractC0200L = this.f1030o;
                if (abstractC0200L == null) {
                    this.f1019c0 = true;
                } else {
                    abstractC0200L.mo566l(true);
                }
            }
            synchronized (AbstractC0255O0.f893h) {
                AbstractC0255O0.m694u(this);
                AbstractC0255O0.f892g.add(new WeakReference<>(this));
            }
        }
        this.f1009S = new Configuration(this.f1026k.getResources().getConfiguration());
        this.f1007Q = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        C0851u1 c0851u1;
        Context c0455z3;
        View c0642j1;
        View view2 = null;
        if (this.f1022f0 == null) {
            int[] iArr = C0983R.styleable.AppCompatTheme;
            Context context2 = this.f1026k;
            TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(iArr);
            String string = typedArrayObtainStyledAttributes.getString(C0983R.styleable.AppCompatTheme_viewInflaterClass);
            typedArrayObtainStyledAttributes.recycle();
            if (string == null) {
                this.f1022f0 = new C0851u1();
            } else {
                try {
                    this.f1022f0 = (C0851u1) context2.getClassLoader().loadClass(string).getDeclaredConstructor(null).newInstance(null);
                } catch (Throwable th) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th);
                    this.f1022f0 = new C0851u1();
                }
            }
        }
        c0851u1 = this.f1022f0;
        int i2 = C0562eg.f2104a;
        c0851u1.getClass();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, C0983R.styleable.View, 0, 0);
        int resourceId = typedArrayObtainStyledAttributes2.getResourceId(C0983R.styleable.View_theme, 0);
        if (resourceId != 0) {
            Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        typedArrayObtainStyledAttributes2.recycle();
        c0455z3 = (resourceId == 0 || ((context instanceof C0455Z3) && ((C0455Z3) context).f1715a == resourceId)) ? context : new C0455Z3(context, resourceId);
        str.getClass();
        switch (str) {
            case "RatingBar":
                c0642j1 = new C0642j1(c0455z3, attributeSet);
                break;
            case "CheckedTextView":
                c0642j1 = new C0183K0(c0455z3, attributeSet);
                break;
            case "MultiAutoCompleteTextView":
                c0642j1 = new C0566f1(c0455z3, attributeSet);
                break;
            case "TextView":
                c0642j1 = c0851u1.mo1975e(c0455z3, attributeSet);
                break;
            case "ImageButton":
                c0642j1 = new C0509c1(c0455z3, attributeSet);
                break;
            case "SeekBar":
                c0642j1 = new C0680l1(c0455z3, attributeSet);
                break;
            case "Spinner":
                c0642j1 = new C0737o1(c0455z3, attributeSet, C0983R.attr.spinnerStyle);
                break;
            case "RadioButton":
                c0642j1 = c0851u1.mo1974d(c0455z3, attributeSet);
                break;
            case "ToggleButton":
                c0642j1 = new C0832t1(c0455z3, attributeSet);
                break;
            case "ImageView":
                c0642j1 = new C0547e1(c0455z3, attributeSet, 0);
                break;
            case "AutoCompleteTextView":
                c0642j1 = c0851u1.mo1971a(c0455z3, attributeSet);
                break;
            case "CheckBox":
                c0642j1 = c0851u1.mo1973c(c0455z3, attributeSet);
                break;
            case "EditText":
                c0642j1 = new C0452Z0(c0455z3, attributeSet);
                break;
            case "Button":
                c0642j1 = c0851u1.mo1972b(c0455z3, attributeSet);
                break;
            default:
                c0642j1 = null;
                break;
        }
        if (c0642j1 == null && context != c0455z3) {
            Object[] objArr = c0851u1.f3346a;
            if (str.equals("view")) {
                str = attributeSet.getAttributeValue(null, "class");
            }
            try {
                objArr[0] = c0455z3;
                objArr[1] = attributeSet;
                if (-1 == str.indexOf(46)) {
                    int i3 = 0;
                    while (true) {
                        String[] strArr = C0851u1.f3344g;
                        if (i3 < 3) {
                            View viewM1976f = c0851u1.m1976f(c0455z3, str, strArr[i3]);
                            if (viewM1976f != null) {
                                objArr[0] = null;
                                objArr[1] = null;
                                view2 = viewM1976f;
                            } else {
                                i3++;
                            }
                        }
                    }
                } else {
                    View viewM1976f2 = c0851u1.m1976f(c0455z3, str, null);
                    objArr[0] = null;
                    objArr[1] = null;
                    view2 = viewM1976f2;
                }
            } catch (Exception unused) {
            } finally {
                objArr[0] = null;
                objArr[1] = null;
            }
            c0642j1 = view2;
        }
        if (c0642j1 != null) {
            Context context3 = c0642j1.getContext();
            if ((context3 instanceof ContextWrapper) && c0642j1.hasOnClickListeners()) {
                TypedArray typedArrayObtainStyledAttributes3 = context3.obtainStyledAttributes(attributeSet, C0851u1.f3340c);
                String string2 = typedArrayObtainStyledAttributes3.getString(0);
                if (string2 != null) {
                    c0642j1.setOnClickListener(new C0851u1.a(c0642j1, string2));
                }
                typedArrayObtainStyledAttributes3.recycle();
            }
            if (Build.VERSION.SDK_INT <= 28) {
                TypedArray typedArrayObtainStyledAttributes4 = c0455z3.obtainStyledAttributes(attributeSet, C0851u1.f3341d);
                if (typedArrayObtainStyledAttributes4.hasValue(0)) {
                    boolean z = typedArrayObtainStyledAttributes4.getBoolean(0, false);
                    WeakHashMap<View, C0181Jg> weakHashMap = C0866ug.f3395a;
                    new C0847tg(C1066R.id.tag_accessibility_heading, Boolean.class, 0, 28).m2005c(c0642j1, Boolean.valueOf(z));
                }
                typedArrayObtainStyledAttributes4.recycle();
                TypedArray typedArrayObtainStyledAttributes5 = c0455z3.obtainStyledAttributes(attributeSet, C0851u1.f3342e);
                if (typedArrayObtainStyledAttributes5.hasValue(0)) {
                    C0866ug.m2004k(c0642j1, typedArrayObtainStyledAttributes5.getString(0));
                }
                typedArrayObtainStyledAttributes5.recycle();
                TypedArray typedArrayObtainStyledAttributes6 = c0455z3.obtainStyledAttributes(attributeSet, C0851u1.f3343f);
                if (typedArrayObtainStyledAttributes6.hasValue(0)) {
                    boolean z2 = typedArrayObtainStyledAttributes6.getBoolean(0, false);
                    WeakHashMap<View, C0181Jg> weakHashMap2 = C0866ug.f3395a;
                    new C0790qg(C1066R.id.tag_screen_reader_focusable, Boolean.class, 0, 28).m2005c(c0642j1, Boolean.valueOf(z2));
                }
                typedArrayObtainStyledAttributes6.recycle();
            }
        }
        return c0642j1;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    @Override // p000a.AbstractC0255O0
    /* JADX INFO: renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo710p() {
        if (this.f1025j instanceof Activity) {
            synchronized (AbstractC0255O0.f893h) {
                AbstractC0255O0.m694u(this);
            }
        }
        if (this.f1016Z) {
            this.f1027l.getDecorView().removeCallbacks(this.f1018b0);
        }
        this.f1008R = true;
        if (this.f1010T != -100) {
            Object obj = this.f1025j;
            if ((obj instanceof Activity) && ((Activity) obj).isChangingConfigurations()) {
                f988i0.put(this.f1025j.getClass().getName(), Integer.valueOf(this.f1010T));
            } else {
                f988i0.remove(this.f1025j.getClass().getName());
            }
        }
        AbstractC0200L abstractC0200L = this.f1030o;
        if (abstractC0200L != null) {
            abstractC0200L.mo562h();
        }
        k kVar = this.f1014X;
        if (kVar != null) {
            kVar.m833a();
        }
        i iVar = this.f1015Y;
        if (iVar != null) {
            iVar.m833a();
        }
    }

    @Override // p000a.AbstractC0255O0
    /* JADX INFO: renamed from: q */
    public final void mo711q() {
        m803M();
    }

    @Override // p000a.AbstractC0255O0
    /* JADX INFO: renamed from: r */
    public final void mo712r() {
        m807Q();
        AbstractC0200L abstractC0200L = this.f1030o;
        if (abstractC0200L != null) {
            abstractC0200L.mo567m(true);
        }
    }

    @Override // p000a.AbstractC0255O0
    /* JADX INFO: renamed from: s */
    public final void mo713s() {
        m796D(true, false);
    }

    @Override // p000a.AbstractC0255O0
    /* JADX INFO: renamed from: t */
    public final void mo714t() {
        m807Q();
        AbstractC0200L abstractC0200L = this.f1030o;
        if (abstractC0200L != null) {
            abstractC0200L.mo567m(false);
        }
    }

    @Override // p000a.AbstractC0255O0
    /* JADX INFO: renamed from: v */
    public final boolean mo715v(int i2) {
        if (i2 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i2 = 108;
        } else if (i2 == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i2 = 109;
        }
        if (this.f1001K && i2 == 108) {
            return false;
        }
        if (this.f997G && i2 == 1) {
            this.f997G = false;
        }
        if (i2 == 1) {
            m814X();
            this.f1001K = true;
            return true;
        }
        if (i2 == 2) {
            m814X();
            this.f995E = true;
            return true;
        }
        if (i2 == 5) {
            m814X();
            this.f996F = true;
            return true;
        }
        if (i2 == 10) {
            m814X();
            this.f999I = true;
            return true;
        }
        if (i2 == 108) {
            m814X();
            this.f997G = true;
            return true;
        }
        if (i2 != 109) {
            return this.f1027l.requestFeature(i2);
        }
        m814X();
        this.f998H = true;
        return true;
    }

    @Override // p000a.AbstractC0255O0
    /* JADX INFO: renamed from: w */
    public final void mo716w(int i2) {
        m803M();
        ViewGroup viewGroup = (ViewGroup) this.f992B.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f1026k).inflate(i2, viewGroup);
        this.f1028m.m829a(this.f1027l.getCallback());
    }

    @Override // p000a.AbstractC0255O0
    /* JADX INFO: renamed from: x */
    public final void mo717x(View view) {
        m803M();
        ViewGroup viewGroup = (ViewGroup) this.f992B.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f1028m.m829a(this.f1027l.getCallback());
    }

    @Override // p000a.AbstractC0255O0
    /* JADX INFO: renamed from: y */
    public final void mo718y(View view, ViewGroup.LayoutParams layoutParams) {
        m803M();
        ViewGroup viewGroup = (ViewGroup) this.f992B.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f1028m.m829a(this.f1027l.getCallback());
    }

    @Override // p000a.AbstractC0255O0
    /* JADX INFO: renamed from: z */
    public final void mo719z(Toolbar toolbar) {
        Object obj = this.f1025j;
        if (obj instanceof Activity) {
            m807Q();
            AbstractC0200L abstractC0200L = this.f1030o;
            if (abstractC0200L instanceof C0696lh) {
                throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
            }
            this.f1031p = null;
            if (abstractC0200L != null) {
                abstractC0200L.mo562h();
            }
            this.f1030o = null;
            if (toolbar != null) {
                C0865uf c0865uf = new C0865uf(toolbar, obj instanceof Activity ? ((Activity) obj).getTitle() : this.f1032q, this.f1028m);
                this.f1030o = c0865uf;
                this.f1028m.f1047b = c0865uf.f3383c;
                toolbar.setBackInvokedCallbackEnabled(true);
            } else {
                this.f1028m.f1047b = null;
            }
            mo707l();
        }
    }

    /* JADX INFO: renamed from: a.Q0$h */
    public class h extends WindowCallbackC0658jh {

        /* JADX INFO: renamed from: b */
        public C0865uf.e f1047b;

        /* JADX INFO: renamed from: c */
        public boolean f1048c;

        /* JADX INFO: renamed from: d */
        public boolean f1049d;

        /* JADX INFO: renamed from: e */
        public boolean f1050e;

        public h(Window.Callback callback) {
            super(callback);
        }

        /* JADX INFO: renamed from: a */
        public final void m829a(Window.Callback callback) {
            try {
                this.f1048c = true;
                callback.onContentChanged();
            } finally {
                this.f1048c = false;
            }
        }

        @Override // android.view.Window.Callback
        public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
            boolean z = this.f1049d;
            Window.Callback callback = this.f2468a;
            return z ? callback.dispatchKeyEvent(keyEvent) : LayoutInflaterFactory2C0291Q0.this.m801K(keyEvent) || callback.dispatchKeyEvent(keyEvent);
        }

        @Override // android.view.Window.Callback
        public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            if (!this.f2468a.dispatchKeyShortcutEvent(keyEvent)) {
                int keyCode = keyEvent.getKeyCode();
                LayoutInflaterFactory2C0291Q0 layoutInflaterFactory2C0291Q0 = LayoutInflaterFactory2C0291Q0.this;
                layoutInflaterFactory2C0291Q0.m807Q();
                AbstractC0200L abstractC0200L = layoutInflaterFactory2C0291Q0.f1030o;
                if (abstractC0200L == null || !abstractC0200L.mo563i(keyCode, keyEvent)) {
                    m mVar = layoutInflaterFactory2C0291Q0.f1004N;
                    if (mVar == null || !layoutInflaterFactory2C0291Q0.m812V(mVar, keyEvent.getKeyCode(), keyEvent)) {
                        if (layoutInflaterFactory2C0291Q0.f1004N == null) {
                            m mVarM806P = layoutInflaterFactory2C0291Q0.m806P(0);
                            layoutInflaterFactory2C0291Q0.m813W(mVarM806P, keyEvent);
                            boolean zM812V = layoutInflaterFactory2C0291Q0.m812V(mVarM806P, keyEvent.getKeyCode(), keyEvent);
                            mVarM806P.f1070k = false;
                            if (zM812V) {
                            }
                        }
                        return false;
                    }
                    m mVar2 = layoutInflaterFactory2C0291Q0.f1004N;
                    if (mVar2 != null) {
                        mVar2.f1071l = true;
                        return true;
                    }
                }
            }
            return true;
        }

        @Override // android.view.Window.Callback
        public final void onContentChanged() {
            if (this.f1048c) {
                this.f2468a.onContentChanged();
            }
        }

        @Override // android.view.Window.Callback
        public final boolean onCreatePanelMenu(int i, Menu menu) {
            if (i != 0 || (menu instanceof C0998f)) {
                return this.f2468a.onCreatePanelMenu(i, menu);
            }
            return false;
        }

        @Override // android.view.Window.Callback
        public final View onCreatePanelView(int i) {
            C0865uf.e eVar = this.f1047b;
            if (eVar != null) {
                View view = i == 0 ? new View(C0865uf.this.f3381a.f4123a.getContext()) : null;
                if (view != null) {
                    return view;
                }
            }
            return this.f2468a.onCreatePanelView(i);
        }

        @Override // p000a.WindowCallbackC0658jh, android.view.Window.Callback
        public final boolean onMenuOpened(int i, Menu menu) {
            super.onMenuOpened(i, menu);
            LayoutInflaterFactory2C0291Q0 layoutInflaterFactory2C0291Q0 = LayoutInflaterFactory2C0291Q0.this;
            if (i == 108) {
                layoutInflaterFactory2C0291Q0.m807Q();
                AbstractC0200L abstractC0200L = layoutInflaterFactory2C0291Q0.f1030o;
                if (abstractC0200L != null) {
                    abstractC0200L.mo557c(true);
                }
            } else {
                layoutInflaterFactory2C0291Q0.getClass();
            }
            return true;
        }

        @Override // p000a.WindowCallbackC0658jh, android.view.Window.Callback
        public final void onPanelClosed(int i, Menu menu) {
            if (this.f1050e) {
                this.f2468a.onPanelClosed(i, menu);
                return;
            }
            super.onPanelClosed(i, menu);
            LayoutInflaterFactory2C0291Q0 layoutInflaterFactory2C0291Q0 = LayoutInflaterFactory2C0291Q0.this;
            if (i == 108) {
                layoutInflaterFactory2C0291Q0.m807Q();
                AbstractC0200L abstractC0200L = layoutInflaterFactory2C0291Q0.f1030o;
                if (abstractC0200L != null) {
                    abstractC0200L.mo557c(false);
                    return;
                }
                return;
            }
            if (i != 0) {
                layoutInflaterFactory2C0291Q0.getClass();
                return;
            }
            m mVarM806P = layoutInflaterFactory2C0291Q0.m806P(i);
            if (mVarM806P.f1072m) {
                layoutInflaterFactory2C0291Q0.m800I(mVarM806P, false);
            }
        }

        @Override // android.view.Window.Callback
        public final boolean onPreparePanel(int i, View view, Menu menu) {
            C0998f c0998f = menu instanceof C0998f ? (C0998f) menu : null;
            if (i == 0 && c0998f == null) {
                return false;
            }
            if (c0998f != null) {
                c0998f.f3807x = true;
            }
            C0865uf.e eVar = this.f1047b;
            if (eVar != null && i == 0) {
                C0865uf c0865uf = C0865uf.this;
                if (!c0865uf.f3384d) {
                    c0865uf.f3381a.f4134l = true;
                    c0865uf.f3384d = true;
                }
            }
            boolean zOnPreparePanel = this.f2468a.onPreparePanel(i, view, menu);
            if (c0998f != null) {
                c0998f.f3807x = false;
            }
            return zOnPreparePanel;
        }

        @Override // p000a.WindowCallbackC0658jh, android.view.Window.Callback
        public final void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i) {
            C0998f c0998f = LayoutInflaterFactory2C0291Q0.this.m806P(0).f1067h;
            if (c0998f != null) {
                super.onProvideKeyboardShortcuts(list, c0998f, i);
            } else {
                super.onProvideKeyboardShortcuts(list, menu, i);
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // android.view.Window.Callback
        public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
            LayoutInflaterFactory2C0291Q0 layoutInflaterFactory2C0291Q0 = LayoutInflaterFactory2C0291Q0.this;
            if (!layoutInflaterFactory2C0291Q0.f1041z || i != 0) {
                return WindowCallbackC0658jh.a.m1532b(this.f2468a, callback, i);
            }
            C0125Ge.a aVar = new C0125Ge.a(layoutInflaterFactory2C0291Q0.f1026k, callback);
            AbstractC0272P abstractC0272PMo697C = layoutInflaterFactory2C0291Q0.mo697C(aVar);
            if (abstractC0272PMo697C != null) {
                return aVar.m333e(abstractC0272PMo697C);
            }
            return null;
        }

        @Override // android.view.Window.Callback
        public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            return null;
        }
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
