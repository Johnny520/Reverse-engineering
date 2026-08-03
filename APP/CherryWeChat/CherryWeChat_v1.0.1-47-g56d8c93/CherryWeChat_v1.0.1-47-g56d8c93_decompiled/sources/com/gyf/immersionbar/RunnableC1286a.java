package com.gyf.immersionbar;

import android.R;
import android.app.Activity;
import android.app.Application;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.Fragment;
import android.app.FragmentManager;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.provider.Settings;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import p000.AbstractActivityC1244c3;
import p000.AbstractActivityC2148ki;
import p000.AbstractC1009Xe;
import p000.AbstractC2074iw;
import p000.AbstractC2797za;
import p000.AbstractC2805zi;
import p000.AbstractComponentCallbacksC1503hi;
import p000.C0601Nz;
import p000.C1052Ye;
import p000.C1483h5;
import p000.C2104ji;
import p000.C2118jw;
import p000.C2262n5;
import p000.C2305o5;
import p000.DialogInterfaceOnCancelListenerC0450Kd;
import p000.FragmentC1069Yv;
import p000.RunnableC0431K0;

/* JADX INFO: renamed from: com.gyf.immersionbar.a */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1286a implements Runnable {

    /* JADX INFO: renamed from: a */
    public final Activity f4708a;

    /* JADX INFO: renamed from: b */
    public Window f4709b;

    /* JADX INFO: renamed from: c */
    public ViewGroup f4710c;

    /* JADX INFO: renamed from: d */
    public ViewGroup f4711d;

    /* JADX INFO: renamed from: e */
    public RunnableC1286a f4712e;

    /* JADX INFO: renamed from: f */
    public final boolean f4713f;

    /* JADX INFO: renamed from: g */
    public final boolean f4714g;

    /* JADX INFO: renamed from: h */
    public C2305o5 f4715h;

    /* JADX INFO: renamed from: i */
    public C2262n5 f4716i;

    /* JADX INFO: renamed from: j */
    public int f4717j;

    /* JADX INFO: renamed from: k */
    public int f4718k;

    /* JADX INFO: renamed from: l */
    public boolean f4719l;

    public RunnableC1286a(Activity activity) {
        this.f4713f = false;
        this.f4714g = false;
        this.f4717j = 0;
        this.f4718k = 0;
        new HashMap();
        this.f4719l = false;
        this.f4708a = activity;
        m2515e(activity.getWindow());
    }

    /* JADX INFO: renamed from: a */
    public static boolean m2510a(View view) {
        if (view == null) {
            return false;
        }
        if (view.getFitsSystemWindows()) {
            return true;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                if (viewGroup.getChildAt(i).getFitsSystemWindows()) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: i */
    public static RunnableC1286a m2511i(Activity activity) {
        C2118jw c2118jw = AbstractC2074iw.f7330a;
        Handler handler = c2118jw.f7439b;
        if (activity == null) {
            throw new NullPointerException("activity is null");
        }
        String str = (c2118jw.f7438a + activity.getClass().getName()) + System.identityHashCode(activity) + ".tag.notOnly.";
        if (!(activity instanceof AbstractActivityC2148ki)) {
            FragmentManager fragmentManager = activity.getFragmentManager();
            HashMap map = c2118jw.f7440c;
            FragmentC1069Yv fragmentC1069Yv = (FragmentC1069Yv) fragmentManager.findFragmentByTag(str);
            if (fragmentC1069Yv == null && (fragmentC1069Yv = (FragmentC1069Yv) map.get(fragmentManager)) == null) {
                for (Fragment fragment : fragmentManager.getFragments()) {
                    if (fragment instanceof FragmentC1069Yv) {
                        String tag = fragment.getTag();
                        if (tag == null) {
                            fragmentManager.beginTransaction().remove(fragment).commitAllowingStateLoss();
                        } else if (tag.contains(".tag.notOnly.")) {
                            fragmentManager.beginTransaction().remove(fragment).commitAllowingStateLoss();
                        }
                    }
                }
                fragmentC1069Yv = new FragmentC1069Yv();
                map.put(fragmentManager, fragmentC1069Yv);
                fragmentManager.beginTransaction().add(fragmentC1069Yv, str).commitAllowingStateLoss();
                handler.obtainMessage(1, fragmentManager).sendToTarget();
            }
            if (fragmentC1069Yv.f3380a == null) {
                fragmentC1069Yv.f3380a = new RunnableC0431K0(activity);
            }
            return (RunnableC1286a) fragmentC1069Yv.f3380a.f1419b;
        }
        AbstractC2805zi supportFragmentManager = ((AbstractActivityC2148ki) activity).getSupportFragmentManager();
        HashMap map2 = c2118jw.f7441d;
        C0601Nz c0601Nz = (C0601Nz) supportFragmentManager.m5380C(str);
        if (c0601Nz == null && (c0601Nz = (C0601Nz) map2.get(supportFragmentManager)) == null) {
            for (AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hi : supportFragmentManager.f9494c.m4882t()) {
                if (abstractComponentCallbacksC1503hi instanceof C0601Nz) {
                    String str2 = abstractComponentCallbacksC1503hi.f5333x;
                    if (str2 == null) {
                        C1483h5 c1483h5 = new C1483h5(supportFragmentManager);
                        c1483h5.m2844g(abstractComponentCallbacksC1503hi);
                        c1483h5.m2841d(true);
                    } else if (str2.contains(".tag.notOnly.")) {
                        C1483h5 c1483h52 = new C1483h5(supportFragmentManager);
                        c1483h52.m2844g(abstractComponentCallbacksC1503hi);
                        c1483h52.m2841d(true);
                    }
                }
            }
            c0601Nz = new C0601Nz();
            map2.put(supportFragmentManager, c0601Nz);
            C1483h5 c1483h53 = new C1483h5(supportFragmentManager);
            c1483h53.m2842e(0, c0601Nz, str, 1);
            c1483h53.m2841d(true);
            handler.obtainMessage(2, supportFragmentManager).sendToTarget();
        }
        if (c0601Nz.f1941T == null) {
            c0601Nz.f1941T = new RunnableC0431K0(activity);
        }
        return (RunnableC1286a) c0601Nz.f1941T.f1419b;
    }

    /* JADX INFO: renamed from: b */
    public final void m2512b() {
        if (this.f4712e == null) {
            this.f4712e = m2511i(this.f4708a);
        }
        RunnableC1286a runnableC1286a = this.f4712e;
        if (runnableC1286a == null || runnableC1286a.f4719l) {
            return;
        }
        runnableC1286a.m2514d();
    }

    /* JADX INFO: renamed from: c */
    public final void m2513c() {
        if (OSUtils.isEMUI3_x()) {
            this.f4715h.getClass();
            m2516f();
        } else if (m2510a(this.f4710c.findViewById(R.id.content))) {
            m2517g(0, 0, 0);
        } else {
            this.f4715h.getClass();
            this.f4715h.getClass();
            m2517g(0, 0, 0);
        }
        if (this.f4715h.f8075c) {
            int i = this.f4716i.f7974a;
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m2514d() {
        FrameLayout.LayoutParams layoutParams;
        int i;
        WindowInsetsController windowInsetsController;
        if (this.f4715h.f8079g) {
            this.f4715h.getClass();
            AbstractC2797za.m5364b(0, -16777216, 0.0f);
            this.f4715h.getClass();
            this.f4715h.getClass();
            this.f4715h.getClass();
            this.f4715h.getClass();
            AbstractC2797za.m5364b(-16777216, -16777216, 0.0f);
            this.f4715h.getClass();
            boolean z = this.f4719l;
            boolean z2 = this.f4713f;
            if (!z || z2) {
                m2518h();
            }
            RunnableC1286a runnableC1286a = this.f4712e;
            if (runnableC1286a != null && z2) {
                runnableC1286a.f4715h = this.f4715h;
            }
            boolean zIsEMUI3_x = OSUtils.isEMUI3_x();
            Activity activity = this.f4708a;
            if (zIsEMUI3_x) {
                this.f4709b.addFlags(67108864);
                View viewFindViewById = this.f4710c.findViewById(io.github.cherrywechat.R.id.immersion_status_bar_view);
                if (viewFindViewById == null) {
                    viewFindViewById = new View(activity);
                    FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, this.f4716i.f7974a);
                    layoutParams2.gravity = 48;
                    viewFindViewById.setLayoutParams(layoutParams2);
                    viewFindViewById.setVisibility(0);
                    viewFindViewById.setId(io.github.cherrywechat.R.id.immersion_status_bar_view);
                    this.f4710c.addView(viewFindViewById);
                }
                this.f4715h.getClass();
                this.f4715h.getClass();
                this.f4715h.getClass();
                this.f4715h.getClass();
                viewFindViewById.setBackgroundColor(AbstractC2797za.m5364b(0, -16777216, 0.0f));
                if (this.f4716i.f7976c || OSUtils.isEMUI3_x()) {
                    C2305o5 c2305o5 = this.f4715h;
                    if (c2305o5.f8076d && c2305o5.f8077e) {
                        this.f4709b.addFlags(134217728);
                    } else {
                        this.f4709b.clearFlags(134217728);
                    }
                    if (this.f4717j == 0) {
                        this.f4717j = this.f4716i.f7977d;
                    }
                    if (this.f4718k == 0) {
                        this.f4718k = this.f4716i.f7978e;
                    }
                    View viewFindViewById2 = this.f4710c.findViewById(io.github.cherrywechat.R.id.immersion_navigation_bar_view);
                    if (viewFindViewById2 == null) {
                        viewFindViewById2 = new View(activity);
                        viewFindViewById2.setId(io.github.cherrywechat.R.id.immersion_navigation_bar_view);
                        this.f4710c.addView(viewFindViewById2);
                    }
                    if (this.f4716i.m4601c()) {
                        layoutParams = new FrameLayout.LayoutParams(-1, this.f4716i.f7977d);
                        layoutParams.gravity = 80;
                    } else {
                        layoutParams = new FrameLayout.LayoutParams(this.f4716i.f7978e, -1);
                        layoutParams.gravity = 8388613;
                    }
                    viewFindViewById2.setLayoutParams(layoutParams);
                    this.f4715h.getClass();
                    this.f4715h.getClass();
                    this.f4715h.getClass();
                    viewFindViewById2.setBackgroundColor(AbstractC2797za.m5364b(-16777216, -16777216, 0.0f));
                    C2305o5 c2305o52 = this.f4715h;
                    if (c2305o52.f8076d && c2305o52.f8077e) {
                        viewFindViewById2.setVisibility(0);
                    } else {
                        viewFindViewById2.setVisibility(8);
                    }
                }
                i = 256;
            } else {
                if (!this.f4719l) {
                    try {
                        WindowManager.LayoutParams attributes = this.f4709b.getAttributes();
                        attributes.layoutInDisplayCutoutMode = 1;
                        this.f4709b.setAttributes(attributes);
                    } catch (Exception unused) {
                    }
                }
                if (!this.f4719l) {
                    this.f4715h.f8073a = this.f4709b.getNavigationBarColor();
                }
                this.f4715h.getClass();
                this.f4709b.clearFlags(67108864);
                if (this.f4716i.f7976c) {
                    this.f4709b.clearFlags(134217728);
                }
                this.f4709b.addFlags(Integer.MIN_VALUE);
                this.f4715h.getClass();
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 29) {
                    this.f4709b.setStatusBarContrastEnforced(false);
                }
                Window window = this.f4709b;
                this.f4715h.getClass();
                this.f4715h.getClass();
                this.f4715h.getClass();
                window.setStatusBarColor(AbstractC2797za.m5364b(0, -16777216, 0.0f));
                C2305o5 c2305o53 = this.f4715h;
                if (c2305o53.f8076d) {
                    if (i2 >= 29) {
                        this.f4709b.setNavigationBarContrastEnforced(false);
                    }
                    Window window2 = this.f4709b;
                    this.f4715h.getClass();
                    this.f4715h.getClass();
                    this.f4715h.getClass();
                    window2.setNavigationBarColor(AbstractC2797za.m5364b(-16777216, -16777216, 0.0f));
                } else {
                    this.f4709b.setNavigationBarColor(c2305o53.f8073a);
                }
                this.f4715h.getClass();
                if (i2 >= 30) {
                    WindowInsetsController windowInsetsController2 = this.f4711d.getWindowInsetsController();
                    this.f4715h.getClass();
                    windowInsetsController2.setSystemBarsAppearance(0, 8);
                    WindowInsetsController windowInsetsController3 = this.f4711d.getWindowInsetsController();
                    this.f4715h.getClass();
                    windowInsetsController3.setSystemBarsAppearance(0, 16);
                }
                i = 1280;
            }
            int i3 = Build.VERSION.SDK_INT;
            if (i3 < 30) {
                this.f4715h.getClass();
                i |= 4096;
            }
            this.f4710c.setSystemUiVisibility(i);
            if (OSUtils.isMIUI6Later()) {
                Window window3 = this.f4709b;
                this.f4715h.getClass();
                SpecialBarFontUtils.setMIUIBarDark(window3, "EXTRA_FLAG_STATUS_BAR_DARK_MODE", false);
                if (this.f4715h.f8076d) {
                    SpecialBarFontUtils.setMIUIBarDark(this.f4709b, "EXTRA_FLAG_NAVIGATION_BAR_DARK_MODE", false);
                }
            }
            if (OSUtils.isFlymeOS4Later()) {
                this.f4715h.getClass();
                this.f4715h.getClass();
                SpecialBarFontUtils.setStatusBarDarkIcon(activity, false);
            }
            if (i3 >= 30 && (windowInsetsController = this.f4711d.getWindowInsetsController()) != null) {
                this.f4715h.getClass();
                windowInsetsController.show(WindowInsets.Type.statusBars());
                windowInsetsController.show(WindowInsets.Type.navigationBars());
                windowInsetsController.setSystemBarsBehavior(2);
            }
            this.f4715h.getClass();
            m2513c();
            if (z2) {
                RunnableC1286a runnableC1286a2 = this.f4712e;
                if (runnableC1286a2 != null) {
                    runnableC1286a2.f4715h.getClass();
                }
            } else {
                this.f4715h.getClass();
            }
            if (this.f4715h.f8074b.size() != 0) {
                for (Map.Entry entry : this.f4715h.f8074b.entrySet()) {
                    View view = (View) entry.getKey();
                    Map map = (Map) entry.getValue();
                    this.f4715h.getClass();
                    Integer num = 0;
                    this.f4715h.getClass();
                    Integer num2 = -16777216;
                    for (Map.Entry entry2 : map.entrySet()) {
                        Integer num3 = (Integer) entry2.getKey();
                        num2 = (Integer) entry2.getValue();
                        num = num3;
                    }
                    if (view != null) {
                        this.f4715h.getClass();
                        if (Math.abs(0.0f) == 0.0f) {
                            int iIntValue = num.intValue();
                            int iIntValue2 = num2.intValue();
                            this.f4715h.getClass();
                            view.setBackgroundColor(AbstractC2797za.m5364b(iIntValue, iIntValue2, 0.0f));
                        } else {
                            int iIntValue3 = num.intValue();
                            int iIntValue4 = num2.intValue();
                            this.f4715h.getClass();
                            view.setBackgroundColor(AbstractC2797za.m5364b(iIntValue3, iIntValue4, 0.0f));
                        }
                    }
                }
            }
            this.f4719l = true;
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m2515e(Window window) {
        this.f4709b = window;
        C2305o5 c2305o5 = new C2305o5();
        c2305o5.f8073a = -16777216;
        c2305o5.f8074b = new HashMap();
        c2305o5.f8075c = true;
        c2305o5.f8076d = true;
        c2305o5.f8077e = true;
        c2305o5.f8078f = true;
        c2305o5.f8079g = true;
        this.f4715h = c2305o5;
        ViewGroup viewGroup = (ViewGroup) this.f4709b.getDecorView();
        this.f4710c = viewGroup;
        this.f4711d = (ViewGroup) viewGroup.findViewById(R.id.content);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0052  */
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2516f() {
        int i;
        int i2;
        Uri uriFor;
        if (m2510a(this.f4710c.findViewById(R.id.content))) {
            m2517g(0, 0, 0);
        } else {
            this.f4715h.getClass();
            this.f4715h.getClass();
            C2262n5 c2262n5 = this.f4716i;
            if (c2262n5.f7976c) {
                C2305o5 c2305o5 = this.f4715h;
                if (c2305o5.f8076d && c2305o5.f8077e) {
                    if (c2262n5.m4601c()) {
                        i2 = this.f4716i.f7977d;
                        i = 0;
                    } else {
                        i = this.f4716i.f7978e;
                        i2 = 0;
                    }
                    this.f4715h.getClass();
                    if (!this.f4716i.m4601c()) {
                        i = this.f4716i.f7978e;
                    }
                } else {
                    i = 0;
                    i2 = 0;
                }
                m2517g(0, i, i2);
            }
        }
        if (this.f4713f || !OSUtils.isEMUI3_x()) {
            return;
        }
        View viewFindViewById = this.f4710c.findViewById(io.github.cherrywechat.R.id.immersion_navigation_bar_view);
        C2305o5 c2305o52 = this.f4715h;
        if (!c2305o52.f8076d || !c2305o52.f8077e) {
            int i3 = C1052Ye.f3352d;
            ArrayList arrayList = AbstractC1009Xe.f3214a.f3353a;
            if (arrayList != null) {
                arrayList.remove(this);
            }
            viewFindViewById.setVisibility(8);
            return;
        }
        if (viewFindViewById != null) {
            int i4 = C1052Ye.f3352d;
            C1052Ye c1052Ye = AbstractC1009Xe.f3214a;
            if (c1052Ye.f3353a == null) {
                c1052Ye.f3353a = new ArrayList();
            }
            if (!c1052Ye.f3353a.contains(this)) {
                c1052Ye.f3353a.add(this);
            }
            Application application = this.f4708a.getApplication();
            c1052Ye.f3354b = application;
            if (application == null || application.getContentResolver() == null || c1052Ye.f3355c.booleanValue() || (uriFor = Settings.System.getUriFor("navigationbar_is_min")) == null) {
                return;
            }
            c1052Ye.f3354b.getContentResolver().registerContentObserver(uriFor, true, c1052Ye);
            c1052Ye.f3355c = Boolean.TRUE;
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m2517g(int i, int i2, int i3) {
        ViewGroup viewGroup = this.f4711d;
        if (viewGroup != null) {
            viewGroup.setPadding(0, i, i2, i3);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m2518h() {
        this.f4716i = new C2262n5(this.f4708a);
    }

    @Override // java.lang.Runnable
    public final void run() {
        m2516f();
    }

    public RunnableC1286a(AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hi) {
        this.f4713f = false;
        this.f4714g = false;
        this.f4717j = 0;
        this.f4718k = 0;
        new HashMap();
        this.f4719l = false;
        this.f4713f = true;
        C2104ji c2104ji = abstractComponentCallbacksC1503hi.f5328s;
        AbstractActivityC1244c3 abstractActivityC1244c3 = c2104ji == null ? null : c2104ji.f7400l;
        this.f4708a = abstractActivityC1244c3;
        m2512b();
        m2515e(abstractActivityC1244c3.getWindow());
    }

    public RunnableC1286a(Fragment fragment) {
        this.f4713f = false;
        this.f4714g = false;
        this.f4717j = 0;
        this.f4718k = 0;
        new HashMap();
        this.f4719l = false;
        this.f4713f = true;
        Activity activity = fragment.getActivity();
        this.f4708a = activity;
        m2512b();
        m2515e(activity.getWindow());
    }

    public RunnableC1286a(DialogInterfaceOnCancelListenerC0450Kd dialogInterfaceOnCancelListenerC0450Kd) {
        this.f4713f = false;
        this.f4714g = false;
        this.f4717j = 0;
        this.f4718k = 0;
        new HashMap();
        this.f4719l = false;
        this.f4714g = true;
        C2104ji c2104ji = dialogInterfaceOnCancelListenerC0450Kd.f5328s;
        this.f4708a = c2104ji == null ? null : c2104ji.f7400l;
        Dialog dialog = dialogInterfaceOnCancelListenerC0450Kd.f1479c0;
        m2512b();
        m2515e(dialog.getWindow());
    }

    public RunnableC1286a(DialogFragment dialogFragment) {
        this.f4713f = false;
        this.f4714g = false;
        this.f4717j = 0;
        this.f4718k = 0;
        new HashMap();
        this.f4719l = false;
        this.f4714g = true;
        this.f4708a = dialogFragment.getActivity();
        Dialog dialog = dialogFragment.getDialog();
        m2512b();
        m2515e(dialog.getWindow());
    }
}
