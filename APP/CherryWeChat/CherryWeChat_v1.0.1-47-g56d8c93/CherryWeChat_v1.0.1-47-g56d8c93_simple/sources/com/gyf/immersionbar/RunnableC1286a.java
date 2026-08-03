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
import android.view.WindowInsetsController;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import p000.AbstractActivityC1244c3;
import p000.AbstractActivityC2148ki;
import p000.AbstractC0360IF;
import p000.AbstractC0688Q;
import p000.AbstractC0773S;
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

    public RunnableC1286a(Activity r3) {
        this.f4713f = false;
        this.f4714g = false;
        this.f4717j = 0;
        this.f4718k = 0;
        new HashMap();
        this.f4719l = false;
        this.f4708a = r3;
        m2515e(r3.getWindow());
    }

    /* JADX INFO: renamed from: a */
    public static boolean m2510a(View r5) {
        if (r5 != null) goto L6;
        return false;
    L6:
        if (r5.getFitsSystemWindows() == false) goto L9;
        return true;
    L9:
        if ((r5 instanceof ViewGroup) == false) goto L16;
        ViewGroup r52 = (ViewGroup) r5;
        int r1 = r52.getChildCount();
        int r3 = 0;
    L11:
        if (r3 >= r1) goto L16;
        if (r52.getChildAt(r3).getFitsSystemWindows() == true) goto L14;
        r3 = r3 + 1;
        goto L11
    L14:
        return true;
    L16:
        return false;
    }

    /* JADX INFO: renamed from: i */
    public static RunnableC1286a m2511i(Activity r9) {
        C2118jw r0 = AbstractC2074iw.f7330a;
        Handler r1 = r0.f7439b;
        if (r9 == null) goto L49;
        String r3 = (r0.f7438a + r9.getClass().getName()) + System.identityHashCode(r9) + ".tag.notOnly.";
        if ((r9 instanceof AbstractActivityC2148ki) == false) goto L27;
        AbstractC2805zi r4 = ((AbstractActivityC2148ki) r9).getSupportFragmentManager();
        HashMap r02 = r0.f7441d;
        C0601Nz r6 = (C0601Nz) r4.m5380C(r3);
        if (r6 != null) goto L23;
        r6 = (C0601Nz) r02.get(r4);
        if (r6 != null) goto L23;
        Iterator r62 = r4.f9494c.m4882t().iterator();
    L12:
        if (r62.hasNext() == false) goto L21;
        AbstractComponentCallbacksC1503hi r7 = (AbstractComponentCallbacksC1503hi) r62.next();
        if ((r7 instanceof C0601Nz) == false) goto L12;
        String r8 = r7.f5333x;
        if (r8 == null) goto L17;
        if (r8.contains(".tag.notOnly.") == false) goto L12;
        C1483h5 r82 = new C1483h5(r4);
        r82.m2844g(r7);
        r82.m2841d(true);
        goto L12
    L17:
        C1483h5 r83 = new C1483h5(r4);
        r83.m2844g(r7);
        r83.m2841d(true);
        goto L12
    L21:
        r6 = new C0601Nz();
        r02.put(r4, r6);
        C1483h5 r03 = new C1483h5(r4);
        r03.m2842e(0, r6, r3, 1);
        r03.m2841d(true);
        r1.obtainMessage(2, r4).sendToTarget();
    L23:
        if (r6.f1941T != null) goto L26;
        r6.f1941T = new RunnableC0431K0(r9);
    L26:
        return (RunnableC1286a) r6.f1941T.f1419b;
    L27:
        FragmentManager r42 = r9.getFragmentManager();
        HashMap r04 = r0.f7440c;
        FragmentC1069Yv r63 = (FragmentC1069Yv) r42.findFragmentByTag(r3);
        if (r63 != null) goto L44;
        r63 = (FragmentC1069Yv) r04.get(r42);
        if (r63 != null) goto L44;
        Iterator<Fragment> r64 = r42.getFragments().iterator();
    L33:
        if (r64.hasNext() == false) goto L42;
        Fragment r72 = r64.next();
        if ((r72 instanceof FragmentC1069Yv) == false) goto L33;
        String r84 = r72.getTag();
        if (r84 == null) goto L38;
        if (r84.contains(".tag.notOnly.") == false) goto L33;
        r42.beginTransaction().remove(r72).commitAllowingStateLoss();
        goto L33
    L38:
        r42.beginTransaction().remove(r72).commitAllowingStateLoss();
        goto L33
    L42:
        r63 = new FragmentC1069Yv();
        r04.put(r42, r63);
        r42.beginTransaction().add(r63, r3).commitAllowingStateLoss();
        r1.obtainMessage(1, r42).sendToTarget();
    L44:
        if (r63.f3380a != null) goto L47;
        r63.f3380a = new RunnableC0431K0(r9);
    L47:
        return (RunnableC1286a) r63.f3380a.f1419b;
    L49:
        throw new NullPointerException("activity is null");
    }

    /* JADX INFO: renamed from: b */
    public final void m2512b() {
        if (this.f4712e != null) goto L5;
        this.f4712e = m2511i(this.f4708a);
    L5:
        RunnableC1286a r0 = this.f4712e;
        if (r0 != null) goto L8;
        return;
    L8:
        if (r0.f4719l == true) goto L12;
        r0.m2514d();
        return;
    }

    /* JADX INFO: renamed from: c */
    public final void m2513c() {
        if (OSUtils.isEMUI3_x() == false) goto L5;
        this.f4715h.getClass();
        m2516f();
    L10:
        if (this.f4715h.f8075c == false) goto L13;
        int r0 = this.f4716i.f7974a;
        return;
    L13:
        return;
    L5:
        if (m2510a(this.f4710c.findViewById(R.id.content)) == false) goto L7;
        m2517g(0, 0, 0);
        goto L10
    L7:
        this.f4715h.getClass();
        this.f4715h.getClass();
        m2517g(0, 0, 0);
        goto L10
    }

    /* JADX INFO: renamed from: d */
    public final void m2514d() {
        if (this.f4715h.f8079g == false) goto L119;
        this.f4715h.getClass();
        AbstractC2797za.m5364b(0, -16777216, 0.0f);
        this.f4715h.getClass();
        this.f4715h.getClass();
        this.f4715h.getClass();
        this.f4715h.getClass();
        AbstractC2797za.m5364b(-16777216, -16777216, 0.0f);
        this.f4715h.getClass();
        boolean r3 = this.f4719l;
        boolean r4 = this.f4713f;
        if (r3 == false) goto L7;
        if (r4 == true) goto L7;
    L8:
        RunnableC1286a r32 = this.f4712e;
        if (r32 == null) goto L12;
        if (r4 == false) goto L12;
        r32.f4715h = this.f4715h;
    L12:
        boolean r33 = OSUtils.isEMUI3_x();
        Activity r6 = this.f4708a;
        if (r33 == false) goto L15;
        this.f4709b.addFlags(67108864);
        View r34 = this.f4710c.findViewById(io.github.cherrywechat.R.id.immersion_status_bar_view);
        if (r34 != null) goto L39;
        r34 = new View(r6);
        FrameLayout.LayoutParams r11 = new FrameLayout.LayoutParams(-1, this.f4716i.f7974a);
        r11.gravity = 48;
        r34.setLayoutParams(r11);
        r34.setVisibility(0);
        r34.setId(io.github.cherrywechat.R.id.immersion_status_bar_view);
        this.f4710c.addView(r34);
    L39:
        this.f4715h.getClass();
        this.f4715h.getClass();
        this.f4715h.getClass();
        this.f4715h.getClass();
        r34.setBackgroundColor(AbstractC2797za.m5364b(0, -16777216, 0.0f));
        if (this.f4716i.f7976c == false) goto L42;
    L43:
        C2305o5 r35 = this.f4715h;
        if (r35.f8076d == true) goto L46;
    L48:
        this.f4709b.clearFlags(134217728);
    L50:
        if (this.f4717j != 0) goto L53;
        this.f4717j = this.f4716i.f7977d;
    L53:
        if (this.f4718k != 0) goto L55;
        this.f4718k = this.f4716i.f7978e;
    L55:
        View r36 = this.f4710c.findViewById(io.github.cherrywechat.R.id.immersion_navigation_bar_view);
        if (r36 != null) goto L59;
        r36 = new View(r6);
        r36.setId(io.github.cherrywechat.R.id.immersion_navigation_bar_view);
        this.f4710c.addView(r36);
    L59:
        if (this.f4716i.m4601c() == false) goto L61;
        FrameLayout.LayoutParams r7 = new FrameLayout.LayoutParams(-1, this.f4716i.f7977d);
        r7.gravity = 80;
    L62:
        r36.setLayoutParams(r7);
        this.f4715h.getClass();
        this.f4715h.getClass();
        this.f4715h.getClass();
        r36.setBackgroundColor(AbstractC2797za.m5364b(-16777216, -16777216, 0.0f));
        C2305o5 r72 = this.f4715h;
        if (r72.f8076d == true) goto L65;
    L67:
        r36.setVisibility(8);
    L68:
        int r37 = 256;
    L69:
        int r73 = Build.VERSION.SDK_INT;
        if (r73 >= 30) goto L73;
        this.f4715h.getClass();
        r37 = r37 | 4096;
    L73:
        this.f4710c.setSystemUiVisibility(r37);
        if (OSUtils.isMIUI6Later() == false) goto L79;
        Window r38 = this.f4709b;
        this.f4715h.getClass();
        SpecialBarFontUtils.setMIUIBarDark(r38, "EXTRA_FLAG_STATUS_BAR_DARK_MODE", false);
        if (this.f4715h.f8076d == false) goto L79;
        SpecialBarFontUtils.setMIUIBarDark(this.f4709b, "EXTRA_FLAG_NAVIGATION_BAR_DARK_MODE", false);
    L79:
        if (OSUtils.isFlymeOS4Later() == false) goto L81;
        this.f4715h.getClass();
        this.f4715h.getClass();
        SpecialBarFontUtils.setStatusBarDarkIcon(r6, false);
    L81:
        if (r73 < 30) goto L85;
        WindowInsetsController r39 = AbstractC0773S.m1580k(this.f4711d);
        if (r39 == null) goto L85;
        this.f4715h.getClass();
        AbstractC0773S.m1588s(r39, AbstractC0773S.m1590u());
        AbstractC0773S.m1588s(r39, AbstractC0773S.m1594y());
        AbstractC0773S.m1587r(r39);
    L85:
        this.f4715h.getClass();
        m2513c();
        if (r4 == true) goto L88;
        this.f4715h.getClass();
    L92:
        if (this.f4715h.f8074b.size() == 0) goto L105;
        Iterator r310 = this.f4715h.f8074b.entrySet().iterator();
    L95:
        if (r310.hasNext() == false) goto L105;
        Map.Entry r42 = (Map.Entry) r310.next();
        View r62 = (View) r42.getKey();
        Map r43 = (Map) r42.getValue();
        this.f4715h.getClass();
        Integer r74 = 0;
        this.f4715h.getClass();
        Integer r8 = -16777216;
        Iterator r44 = r43.entrySet().iterator();
    L98:
        if (r44.hasNext() == false) goto L100;
        Map.Entry r75 = (Map.Entry) r44.next();
        Integer r82 = (Integer) r75.getKey();
        r8 = (Integer) r75.getValue();
        r74 = r82;
        goto L98
    L100:
        if (r62 == null) goto L95;
        this.f4715h.getClass();
        if (Math.abs(0.0f) == 0.0f) goto L103;
        int r45 = r74.intValue();
        int r76 = r8.intValue();
        this.f4715h.getClass();
        r62.setBackgroundColor(AbstractC2797za.m5364b(r45, r76, 0.0f));
        goto L95
    L103:
        int r46 = r74.intValue();
        int r77 = r8.intValue();
        this.f4715h.getClass();
        r62.setBackgroundColor(AbstractC2797za.m5364b(r46, r77, 0.0f));
    L105:
        this.f4719l = true;
        return;
    L88:
        RunnableC1286a r311 = this.f4712e;
        if (r311 == null) goto L92;
        r311.f4715h.getClass();
        goto L92
    L65:
        if (r72.f8077e == false) goto L67;
        r36.setVisibility(0);
        goto L68
    L61:
        r7 = new FrameLayout.LayoutParams(this.f4716i.f7978e, -1);
        r7.gravity = 8388613;
        goto L62
    L46:
        if (r35.f8077e == false) goto L48;
        this.f4709b.addFlags(134217728);
        goto L50
    L42:
        if (OSUtils.isEMUI3_x() == false) goto L68;
    L15:
        if (this.f4719l == true) goto L18;
        WindowManager.LayoutParams r312 = this.f4709b.getAttributes();     // Catch: Exception -> L107
        r312.layoutInDisplayCutoutMode = 1;     // Catch: Exception -> L107
        this.f4709b.setAttributes(r312);     // Catch: Exception -> L107
    L18:
        if (this.f4719l == true) goto L20;
        C2305o5 r313 = this.f4715h;
        r313.f8073a = this.f4709b.getNavigationBarColor();
    L20:
        this.f4715h.getClass();
        this.f4709b.clearFlags(67108864);
        if (this.f4716i.f7976c == false) goto L23;
        this.f4709b.clearFlags(134217728);
    L23:
        this.f4709b.addFlags(Integer.MIN_VALUE);
        this.f4715h.getClass();
        int r314 = Build.VERSION.SDK_INT;
        if (r314 < 29) goto L26;
        AbstractC0688Q.m1414r(this.f4709b);
    L26:
        Window r83 = this.f4709b;
        this.f4715h.getClass();
        this.f4715h.getClass();
        this.f4715h.getClass();
        r83.setStatusBarColor(AbstractC2797za.m5364b(0, -16777216, 0.0f));
        C2305o5 r84 = this.f4715h;
        if (r84.f8076d == false) goto L31;
        if (r314 < 29) goto L30;
        AbstractC0688Q.m1394B(this.f4709b);
    L30:
        Window r78 = this.f4709b;
        this.f4715h.getClass();
        this.f4715h.getClass();
        this.f4715h.getClass();
        r78.setNavigationBarColor(AbstractC2797za.m5364b(-16777216, -16777216, 0.0f));
    L32:
        this.f4715h.getClass();
        if (r314 < 30) goto L35;
        WindowInsetsController r315 = AbstractC0773S.m1580k(this.f4711d);
        this.f4715h.getClass();
        AbstractC0360IF.m801d(r315);
        WindowInsetsController r316 = AbstractC0773S.m1580k(this.f4711d);
        this.f4715h.getClass();
        AbstractC0360IF.m803f(r316);
    L35:
        r37 = 1280;
        goto L69
    L31:
        this.f4709b.setNavigationBarColor(r84.f8073a);
    L7:
        m2518h();
        goto L8
    }

    /* JADX INFO: renamed from: e */
    public final void m2515e(Window r2) {
        this.f4709b = r2;
        C2305o5 r22 = new C2305o5();
        r22.f8073a = -16777216;
        r22.f8074b = new HashMap();
        r22.f8075c = true;
        r22.f8076d = true;
        r22.f8077e = true;
        r22.f8078f = true;
        r22.f8079g = true;
        this.f4715h = r22;
        ViewGroup r23 = (ViewGroup) this.f4709b.getDecorView();
        this.f4710c = r23;
        this.f4711d = (ViewGroup) r23.findViewById(R.id.content);
    }

    /* JADX INFO: renamed from: f */
    public final void m2516f() {
        if (m2510a(this.f4710c.findViewById(R.id.content)) == false) goto L5;
        m2517g(0, 0, 0);
    L21:
        if (this.f4713f == false) goto L23;
        return;
    L23:
        if (OSUtils.isEMUI3_x() == false) goto L52;
        View r0 = this.f4710c.findViewById(io.github.cherrywechat.R.id.immersion_navigation_bar_view);
        C2305o5 r1 = this.f4715h;
        if (r1.f8076d == true) goto L27;
    L45:
        int r12 = C1052Ye.f3352d;
        ArrayList r13 = AbstractC1009Xe.f3214a.f3353a;
        if (r13 == null) goto L49;
        r13.remove(this);
    L49:
        r0.setVisibility(8);
        return;
    L27:
        if (r1.f8077e == false) goto L45;
        if (r0 == null) goto L53;
        int r02 = C1052Ye.f3352d;
        C1052Ye r03 = AbstractC1009Xe.f3214a;
        if (r03.f3353a != null) goto L33;
        r03.f3353a = new ArrayList();
    L33:
        if (r03.f3353a.contains(this) == true) goto L35;
        r03.f3353a.add(this);
    L35:
        Application r14 = this.f4708a.getApplication();
        r03.f3354b = r14;
        if (r14 != null) goto L38;
        return;
    L38:
        if (r14.getContentResolver() != null) goto L40;
        return;
    L40:
        if (r03.f3355c.booleanValue() == true) goto L56;
        Uri r15 = Settings.System.getUriFor("navigationbar_is_min");
        if (r15 == null) goto L57;
        r03.f3354b.getContentResolver().registerContentObserver(r15, true, r03);
        r03.f3355c = Boolean.TRUE;
        return;
    L57:
        return;
    L56:
        return;
    L53:
        return;
    L52:
        return;
    L5:
        this.f4715h.getClass();
        this.f4715h.getClass();
        C2262n5 r04 = this.f4716i;
        if (r04.f7976c == false) goto L18;
        C2305o5 r2 = this.f4715h;
        if (r2.f8076d == false) goto L18;
        if (r2.f8077e == false) goto L18;
        if (r04.m4601c() == false) goto L14;
        int r22 = this.f4716i.f7977d;
        int r05 = 0;
    L15:
        this.f4715h.getClass();
        if (this.f4716i.m4601c() == true) goto L19;
        r05 = this.f4716i.f7978e;
    L19:
        m2517g(0, r05, r22);
        goto L21
    L14:
        r05 = this.f4716i.f7978e;
        r22 = 0;
    L18:
        r05 = 0;
        r22 = 0;
        goto L19
    }

    /* JADX INFO: renamed from: g */
    public final void m2517g(int r3, int r4, int r5) {
        ViewGroup r0 = this.f4711d;
        if (r0 == null) goto L6;
        r0.setPadding(0, r3, r4, r5);
        return;
    }

    /* JADX INFO: renamed from: h */
    public final void m2518h() {
        this.f4716i = new C2262n5(this.f4708a);
    }

    @Override // java.lang.Runnable
    public final void run() {
        m2516f();
    }

    public RunnableC1286a(AbstractComponentCallbacksC1503hi r3) {
        this.f4713f = false;
        this.f4714g = false;
        this.f4717j = 0;
        this.f4718k = 0;
        new HashMap();
        this.f4719l = false;
        this.f4713f = true;
        C2104ji r32 = r3.f5328s;
        if (r32 != null) goto L5;
        AbstractActivityC1244c3 r33 = null;
    L6:
        this.f4708a = r33;
        m2512b();
        m2515e(r33.getWindow());
        return;
    L5:
        r33 = r32.f7400l;
        goto L6
    }

    public RunnableC1286a(Fragment r3) {
        this.f4713f = false;
        this.f4714g = false;
        this.f4717j = 0;
        this.f4718k = 0;
        new HashMap();
        this.f4719l = false;
        this.f4713f = true;
        Activity r32 = r3.getActivity();
        this.f4708a = r32;
        m2512b();
        m2515e(r32.getWindow());
    }

    public RunnableC1286a(DialogInterfaceOnCancelListenerC0450Kd r3) {
        this.f4713f = false;
        this.f4714g = false;
        this.f4717j = 0;
        this.f4718k = 0;
        new HashMap();
        this.f4719l = false;
        this.f4714g = true;
        C2104ji r0 = r3.f5328s;
        if (r0 != null) goto L5;
        AbstractActivityC1244c3 r02 = null;
    L6:
        this.f4708a = r02;
        Dialog r32 = r3.f1479c0;
        m2512b();
        m2515e(r32.getWindow());
        return;
    L5:
        r02 = r0.f7400l;
        goto L6
    }

    public RunnableC1286a(DialogFragment r3) {
        this.f4713f = false;
        this.f4714g = false;
        this.f4717j = 0;
        this.f4718k = 0;
        new HashMap();
        this.f4719l = false;
        this.f4714g = true;
        this.f4708a = r3.getActivity();
        Dialog r32 = r3.getDialog();
        m2512b();
        m2515e(r32.getWindow());
    }
}
