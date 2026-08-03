package p050c0;

import android.R;
import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.TextView;
import de.robv.android.xposed.AbstractC0762d;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p001A0.AbstractC0040p;
import p007D0.AbstractC0141g;
import p007D0.C0139e;
import p007D0.C0140f;
import p007D0.C0146l;
import p009E0.AbstractC0182m;
import p009E0.C0172c;
import p009E0.C0178i;
import p009E0.C0195z;
import p029P0.InterfaceC0286l;
import p031Q0.AbstractC0307g;
import p031Q0.AbstractC0317q;
import p031Q0.C0313m;
import p034S.RunnableC0321a;
import p034S.RunnableC0328h;
import p037U.AbstractC0358S;
import p042W0.AbstractC0425j;
import p042W0.AbstractC0432q;
import p042W0.AbstractC0433r;
import p042W0.C0419d;
import p049b0.AbstractC0553c;
import p049b0.C0552b;
import p049b0.C0555e;
import p052d0.C0758s;

/* JADX INFO: renamed from: c0.G */
/* JADX INFO: loaded from: classes.dex */
public final class C0588G {

    /* JADX INFO: renamed from: a */
    public static final C0588G f1768a = null;

    /* JADX INFO: renamed from: b */
    public static final AtomicBoolean f1769b = null;

    /* JADX INFO: renamed from: c */
    public static volatile C0758s f1770c;

    /* JADX INFO: renamed from: d */
    public static volatile Object f1771d;

    /* JADX INFO: renamed from: e */
    public static volatile Method f1772e;

    /* JADX INFO: renamed from: f */
    public static volatile View.OnClickListener f1773f;

    /* JADX INFO: renamed from: g */
    public static volatile boolean f1774g;

    /* JADX INFO: renamed from: h */
    public static volatile boolean f1775h;

    /* JADX INFO: renamed from: i */
    public static volatile long f1776i;

    /* JADX INFO: renamed from: j */
    public static volatile boolean f1777j;

    /* JADX INFO: renamed from: k */
    public static volatile int f1778k;

    /* JADX INFO: renamed from: l */
    public static volatile int f1779l;

    /* JADX INFO: renamed from: m */
    public static volatile int f1780m;

    /* JADX INFO: renamed from: n */
    public static volatile boolean f1781n;

    /* JADX INFO: renamed from: o */
    public static volatile boolean f1782o;

    /* JADX INFO: renamed from: p */
    public static volatile boolean f1783p;

    /* JADX INFO: renamed from: q */
    public static volatile int f1784q;

    /* JADX INFO: renamed from: r */
    public static volatile WeakReference f1785r;

    /* JADX INFO: renamed from: s */
    public static volatile Context f1786s;

    /* JADX INFO: renamed from: t */
    public static volatile String f1787t;

    /* JADX INFO: renamed from: u */
    public static final AtomicReference f1788u = null;

    /* JADX INFO: renamed from: v */
    public static volatile boolean f1789v;

    static {
        f1768a = new C0588G();
        f1769b = new AtomicBoolean(false);
        f1788u = new AtomicReference(new WeakReference(null));
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m1414a(View r5) {
        if (AbstractC0307g.m699a(r5.getTag(2114916353), Boolean.TRUE) == false) goto L6;
        return false;
    L6:
        if (r5 == f1770c) goto L27;
        String r02 = r5.getClass().getName();
        if (r02.equals("com.tencent.mm.ui.LauncherUIBottomTabView") == true) goto L22;
        if (AbstractC0433r.m1028C0(r02, "LauncherUIBottomTabView") == true) goto L22;
        Class<?> r52 = r5.getClass();
    L14:
        if (r52 == null) goto L28;
        if (r52.getName().equals("com.tencent.mm.ui.LauncherUIBottomTabView") == true) goto L22;
        if (AbstractC0433r.m1028C0(r52.getName(), "LauncherUIBottomTabView") == true) goto L22;
        r52 = r52.getSuperclass();
        goto L14
    L28:
        return false;
    L22:
        return true;
    L27:
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static final String m1415b(String r8) {
        List r02 = C0710y.m1808c();
        List r1 = C0710y.f2234a;
        String r82 = AbstractC0425j.m1022a1(r8).toString();
        if (r82.length() == 0) goto L27;
        C0139e r2 = m1433t(r82);
        String r4 = (String) r2.f328a;
        String r22 = (String) r2.f329b;
        if (r4.length() != 0) goto L9;
        return null;
    L9:
        if (r4.length() > 12) goto L29;
        String r42 = AbstractC0425j.m1023b1(r4).toString();
        int r5 = Math.min(4, Math.min(r1.size(), r02.size()));
        int r6 = 0;
    L12:
        if (r6 >= r5) goto L30;
        if (AbstractC0307g.m699a(r42, r1.get(r6)) == true) goto L19;
        if (AbstractC0307g.m699a(r42, r02.get(r6)) == true) goto L19;
        r6 = r6 + 1;
    L19:
        String r03 = r02.get(r6) + r22;
        if (AbstractC0307g.m699a(r03, r82) == false) goto L22;
        return null;
    L22:
        return r03;
    L30:
        return null;
    L29:
        return null;
    L27:
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static void m1416c() {
        C0758s r02 = f1770c;
        if (r02 != null) goto L5;
        return;
    L5:
        r02.setMainUnread(f1778k);
        r02.setContactUnread(f1779l);
        boolean r1 = false;
        r02.setContactDot(false);
        r02.setFriendUnread(f1780m);
        if (f1780m <= 0) goto L8;
    L12:
        r02.setFriendDot(r1);
        return;
    L8:
        if (f1781n == false) goto L10;
    L11:
        r1 = true;
        goto L12
    L10:
        if (f1782o == false) goto L12;
        goto L11
    }

    /* JADX INFO: renamed from: d */
    public static void m1417d(int r8) {
        f1784q = r8;
        if (C0710y.m1807b() == true) goto L5;
        return;
    L5:
        List r1 = C0710y.m1808c();
        if (r8 >= 0) goto L8;
        return;
    L8:
        if (r8 >= r1.size()) goto L148;
        String r12 = (String) r1.get(r8);
        if (AbstractC0425j.m1013R0(r12) == false) goto L12;
        return;
    L12:
        WeakReference r2 = f1785r;
        String r3 = null;
        if (r2 == null) goto L16;
        Activity r22 = (Activity) r2.get();
        if (r22 == null) goto L16;
    L27:
        if (m1431r(r22) == true) goto L29;
        return;
    L29:
        f1783p = true;
        ActionBar r5 = r22.getActionBar();     // Catch: Throwable -> L34
        if (r5 == null) goto L36;
        Object r52 = r5.getCustomView();     // Catch: Throwable -> L34
    L39:
        if ((r52 instanceof C0140f) == false) goto L41;
        r52 = null;
    L41:
        View r53 = (View) r52;     // Catch: Throwable -> L68
        if (r53 != null) goto L71;
        Object r54 = AbstractC0358S.m887g(AbstractC0358S.m887g(r22, "getSupportActionBar", new Object[0]), "getCustomView", new Object[0]);     // Catch: Throwable -> L47
        if ((r54 instanceof View) == false) goto L49;
        Object r55 = (View) r54;     // Catch: Throwable -> L47
    L52:
        if ((r55 instanceof C0140f) == false) goto L54;
        r55 = null;
    L54:
        r53 = (View) r55;     // Catch: Throwable -> L68
        if (r53 != null) goto L71;
        Object r02 = AbstractC0358S.m887g(AbstractC0358S.m887g(r22, "getSupportActionBar", new Object[0]), "j", new Object[0]);     // Catch: Throwable -> L60
        if ((r02 instanceof View) == false) goto L62;
        Object r03 = (View) r02;     // Catch: Throwable -> L60
    L65:
        if ((r03 instanceof C0140f) == false) goto L67;
        r03 = null;
    L67:
        r53 = (View) r03;     // Catch: Throwable -> L68
        goto L71
    L62:
        r03 = null;
    L60:
        th = move-exception;
        r03 = AbstractC0040p.m116u(th);     // Catch: Throwable -> L68
        goto L65
    L49:
        r55 = null;
    L47:
        th = move-exception;
        r55 = AbstractC0040p.m116u(th);     // Catch: Throwable -> L68
    L71:
        if (r53 == null) goto L74;
        TextView r56 = (TextView) r53.findViewById(R.id.text1);     // Catch: Throwable -> L68
        if (r56 == null) goto L74;
    L81:
        String r04 = "";
        if (r56 != null) goto L84;
    L105:
        Window r23 = r22.getWindow();     // Catch: Throwable -> L68
        if (r23 == null) goto L108;
        View r24 = r23.getDecorView();     // Catch: Throwable -> L68
    L110:
        if ((r24 instanceof ViewGroup) == false) goto L113;
        ViewGroup r25 = (ViewGroup) r24;     // Catch: Throwable -> L68
    L114:
        if (r25 != null) goto L117;
        f1783p = false;
        return;
    L117:
        C0313m r6 = new C0313m();     // Catch: Throwable -> L68
        m1422i(r6, (int) (r25.getResources().getDisplayMetrics().heightPixels * 0.16f), r25, 0);     // Catch: Throwable -> L68
        TextView r26 = (TextView) r6.f595a;     // Catch: Throwable -> L68
        if (r26 == null) goto L137;
        CharSequence r57 = r26.getText();     // Catch: Throwable -> L68
        if (r57 == null) goto L122;
        String r58 = r57.toString();     // Catch: Throwable -> L68
    L123:
        if (r58 == null) goto L126;
        r04 = r58;
    L126:
        String r05 = (String) m1433t(AbstractC0425j.m1022a1(r04).toString()).f329b;     // Catch: Throwable -> L68
        if (r8 == 0) goto L129;
    L131:
        CharSequence r82 = r26.getText();     // Catch: Throwable -> L68
        if (r82 == null) goto L135;
        r3 = r82.toString();     // Catch: Throwable -> L68
    L135:
        if (AbstractC0307g.m699a(r3, r12) == true) goto L137;
        r26.setText(r12);     // Catch: Throwable -> L68
        goto L137
    L129:
        if (r05.length() <= 0) goto L131;
        r12 = r12.concat(r05);     // Catch: Throwable -> L68
        goto L131
    L122:
        r58 = null;
    L137:
        f1783p = false;
        return;
    L113:
        r25 = null;
        goto L114
    L108:
        r24 = null;
        goto L110
    L84:
        if (m1428o(r56) == false) goto L105;
        CharSequence r27 = r56.getText();     // Catch: Throwable -> L68
        if (r27 == null) goto L88;
        String r28 = r27.toString();     // Catch: Throwable -> L68
    L89:
        if (r28 == null) goto L92;
        r04 = r28;
    L92:
        String r06 = (String) m1433t(AbstractC0425j.m1022a1(r04).toString()).f329b;     // Catch: Throwable -> L68
        if (r8 == 0) goto L95;
    L97:
        CharSequence r83 = r56.getText();     // Catch: Throwable -> L68
        if (r83 == null) goto L101;
        r3 = r83.toString();     // Catch: Throwable -> L68
    L101:
        if (AbstractC0307g.m699a(r3, r12) == true) goto L103;
        r56.setText(r12);     // Catch: Throwable -> L68
    L103:
        f1783p = false;
        return;
    L95:
        if (r06.length() <= 0) goto L97;
        r12 = r12.concat(r06);     // Catch: Throwable -> L68
        goto L97
    L88:
        r28 = null;
    L74:
        Window r59 = r22.getWindow();     // Catch: Throwable -> L68
        if (r59 == null) goto L80;
        View r510 = r59.getDecorView();     // Catch: Throwable -> L68
        if (r510 == null) goto L80;
        r56 = (TextView) r510.findViewById(R.id.text1);     // Catch: Throwable -> L68
    L80:
        r56 = null;
        goto L81
    L36:
        r52 = null;
    L68:
        th = move-exception;
        f1783p = false;
        throw th;
    L34:
        th = move-exception;
        r52 = AbstractC0040p.m116u(th);     // Catch: Throwable -> L68
    L16:
        C0758s r29 = f1770c;
        if (r29 == null) goto L19;
        Context r210 = r29.getContext();
    L21:
        if ((r210 instanceof Activity) == false) goto L23;
        r22 = (Activity) r210;
    L24:
        if (r22 != null) goto L27;
        return;
    L23:
        r22 = null;
        goto L24
    L19:
        r210 = null;
        goto L21
    }

    /* JADX INFO: renamed from: e */
    public static void m1418e(View r6) {
        if (r6 != null) goto L4;
        return;
    L4:
        if (C0710y.m1807b() == false) goto L33;
        C0178i r02 = new C0178i();
        r02.addLast(r6);
        int r1 = 0;
    L8:
        if ((!r02.isEmpty()) == false) goto L34;
        if (r1 >= 600) goto L35;
        r1 = r1 + 1;
        View r2 = (View) r02.removeFirst();
        String r3 = r2.getClass().getName();
        if (r3.equals("com.tencent.mm.ui.FrostedContentView") == false) goto L14;
    L15:
        m1437x(r2);
    L17:
        if ((r2 instanceof ViewGroup) == false) goto L8;
        ViewGroup r22 = (ViewGroup) r2;
        int r32 = r22.getChildCount();
        int r4 = 0;
    L19:
        if (r4 >= r32) goto L8;
        View r5 = r22.getChildAt(r4);
        if (r5 == null) goto L23;
        r02.addLast(r5);
    L23:
        r4 = r4 + 1;
        goto L19
    L14:
        if (AbstractC0433r.m1028C0(r3, "FrostedContentView") == false) goto L17;
    L35:
        return;
    L34:
        return;
    }

    /* JADX INFO: renamed from: f */
    public static final void m1419f(C0758s r4, ViewGroup r5, int r6) {
        if (r4.isAttachedToWindow() == true) goto L5;
        return;
    L5:
        m1423j(r5);
        r4.bringToFront();
        if (r5.getWidth() <= 0) goto L8;
        r4.setMinimumWidth(r5.getWidth());
        r4.requestLayout();
        r4.invalidate();
    L10:
        m1436w("layout try parentW=" + r5.getWidth() + " bar=" + r4.getWidth() + "x" + r4.getHeight() + " vis=" + r4.getVisibility() + " children=" + r5.getChildCount());
        return;
    L8:
        if (r6 <= 0) goto L10;
        r4.postDelayed(new RunnableC0321a(r6, r4, r5, 1), 50);
        goto L10
    }

    /* JADX INFO: renamed from: g */
    public static View.OnClickListener m1420g(View r4) {
        Object r02 = null;
        Method r1 = View.class.getDeclaredMethod("getListenerInfo", null);     // Catch: Throwable -> L10
        r1.setAccessible(true);     // Catch: Throwable -> L10
        Object r42 = r1.invoke(r4, null);     // Catch: Throwable -> L10
        if (r42 != null) goto L6;
        return null;
    L6:
        Field r12 = r42.getClass().getDeclaredField("mOnClickListener");     // Catch: Throwable -> L10
        r12.setAccessible(true);     // Catch: Throwable -> L10
        Object r43 = r12.get(r42);     // Catch: Throwable -> L10
        if ((r43 instanceof View.OnClickListener) == false) goto L12;
        Object r44 = (View.OnClickListener) r43;     // Catch: Throwable -> L10
    L15:
        if ((r44 instanceof C0140f) == true) goto L19;
        r02 = r44;
    L19:
        return (View.OnClickListener) r02;
    L12:
        r44 = null;
    L10:
        th = move-exception;
        r44 = AbstractC0040p.m116u(th);
        goto L15
    }

    /* JADX INFO: renamed from: h */
    public static Method m1421h(Class r4) {
    L2:
        if (r4 == null) goto L12;
        C0172c r02 = AbstractC0317q.m714c(r4.getDeclaredMethods());
    L5:
        if (r02.hasNext() == false) goto L11;
        Method r1 = (Method) r02.next();
        if (AbstractC0307g.m699a(r1.getName(), "onTabClick") == false) goto L5;
        if (r1.getParameterTypes().length != 1) goto L5;
        return r1;
    L11:
        r4 = r4.getSuperclass();
        goto L2
    L12:
        return null;
    }

    /* JADX INFO: renamed from: i */
    public static final void m1422i(C0313m r5, int r6, View r7, int r8) {
        if (r5.f595a == null) goto L5;
        return;
    L5:
        if (r8 > 14) goto L45;
        String r02 = r7.getClass().getName();
        int r2 = 0;
        if (AbstractC0425j.m1005J0(r02, "RecyclerView", false) == false) goto L10;
        return;
    L10:
        if (AbstractC0425j.m1005J0(r02, "ListView", false) == false) goto L12;
        return;
    L12:
        if (AbstractC0425j.m1005J0(r02, "BottomTab", false) == false) goto L14;
        return;
    L14:
        if (AbstractC0425j.m1005J0(r02, "OKKFloating", false) == false) goto L17;
        return;
    L17:
        if ((r7 instanceof TextView) == false) goto L33;
        TextView r03 = (TextView) r7;
        if (r03.getId() != 16908308) goto L33;
        if (r03.isShown() == false) goto L33;
        int[] r04 = new int[2];
        r7.getLocationOnScreen(r04);     // Catch: Throwable -> L25
    L27:
        int r05 = r04[1];
        if (r05 < 0) goto L33;
        if (r05 > r6) goto L33;
        r5.f595a = r7;
        return;
    L25:
        th = move-exception;
        AbstractC0040p.m116u(th);
    L33:
        if ((r7 instanceof ViewGroup) == false) goto L44;
        ViewGroup r72 = (ViewGroup) r7;
        int r06 = r72.getChildCount();
    L35:
        if (r2 >= r06) goto L47;
        View r3 = r72.getChildAt(r2);
        AbstractC0307g.m702d(r3, "getChildAt(...)");
        m1422i(r5, r6, r3, r8 + 1);
        r2 = r2 + 1;
        goto L35
    L47:
        return;
    L44:
        return;
    }

    /* JADX INFO: renamed from: j */
    public static void m1423j(ViewGroup r4) {
        int r02 = r4.getChildCount();
        int r1 = 0;
    L3:
        if (r1 >= r02) goto L10;
        View r2 = r4.getChildAt(r1);
        if ((r2 instanceof ViewGroup) == false) goto L9;
        if (m1429p(r2.getClass()) == false) goto L9;
        m1434u((ViewGroup) r2);
    L9:
        r1 = r1 + 1;
        goto L3
    }

    /* JADX INFO: renamed from: k */
    public static void m1424k(Class r2) {
        m1425l(r2, "onPageScrolled", new C0555e(28));
        m1425l(r2, "onPageSelected", new C0555e(29));
        m1425l(r2, "onPageScrollStateChanged", new C0570A(0));
    }

    /* JADX INFO: renamed from: l */
    public static final void m1425l(Class r4, String r5, InterfaceC0286l r6) {
        C0172c r02 = AbstractC0317q.m714c(r4.getDeclaredMethods());
    L4:
        if (r02.hasNext() == false) goto L11;
        Method r1 = (Method) r02.next();
        if (AbstractC0307g.m699a(r1.getName(), r5) == false) goto L4;
        AbstractC0762d.m1952b(r1, new C0582E(r6, 0));     // Catch: Throwable -> L9
        m1436w("hooked " + r4.getSimpleName() + "." + r5);     // Catch: Throwable -> L9
    L9:
        th = move-exception;
        AbstractC0040p.m116u(th);
        goto L4
    }

    /* JADX INFO: renamed from: m */
    public static final boolean m1426m(Method r5, InterfaceC0286l r6) {
        if (r5 != null) goto L6;
        return false;
    L6:
        if (r5.getParameterTypes().length == 1) goto L8;
    L19:
        return false;
    L8:
        if (AbstractC0307g.m699a(r5.getParameterTypes()[0], Integer.TYPE) == false) goto L19;
        r5.setAccessible(true);     // Catch: Throwable -> L12
        AbstractC0762d.m1952b(r5, new C0582E(r6, 2));     // Catch: Throwable -> L12
        m1436w("hooked unread int " + r5.getDeclaringClass().getSimpleName() + "." + r5.getName());     // Catch: Throwable -> L12
        Object r52 = Boolean.TRUE;     // Catch: Throwable -> L12
    L14:
        Object r62 = Boolean.FALSE;
        if ((r52 instanceof C0140f) == false) goto L18;
        r52 = r62;
    L18:
        return ((Boolean) r52).booleanValue();
    L12:
        th = move-exception;
        r52 = AbstractC0040p.m116u(th);
        goto L14
    }

    /* JADX INFO: renamed from: n */
    public static final Method m1427n(Context r3, ClassLoader r4, String r5, Class r6, String... r7) {
        if (r3 != null) goto L5;
        return null;
    L5:
        AtomicBoolean r1 = AbstractC0553c.f1646a;
        String[] r72 = (String[]) Arrays.copyOf(r7, r7.length);
        AbstractC0307g.m703e(r4, "classLoader");
        AbstractC0307g.m703e(r72, "strings");
        Method r32 = (Method) AbstractC0553c.m1367f(r3, r4, r5, new C0552b(r4, r72, 2));
        if (r32 != null) goto L9;
        return null;
    L9:
        if (r6.isAssignableFrom(r32.getDeclaringClass()) == true) goto L13;
        if (r32.getDeclaringClass().isAssignableFrom(r6) == true) goto L13;
        return null;
    L13:
        return r32;
    }

    /* JADX INFO: renamed from: o */
    public static boolean m1428o(TextView r7) {
        if (r7.getId() == 16908308) goto L5;
        return false;
    L5:
        Object r02 = r7.getParent();
        int r1 = 0;
    L7:
        if (r1 >= 8) goto L45;
        if (r02 == null) goto L11;
        String r5 = r02.getClass().getName();
    L12:
        if (r5 != null) goto L15;
        r5 = "";
    L15:
        if (AbstractC0425j.m1005J0(r5, "RecyclerView", false) == true) goto L43;
        if (AbstractC0425j.m1005J0(r5, "ListView", false) == true) goto L43;
        if (AbstractC0425j.m1005J0(r5, "BottomTab", false) == true) goto L43;
        if (AbstractC0425j.m1005J0(r5, "OKKFloating", false) == true) goto L43;
        if (AbstractC0425j.m1005J0(r5, "Preference", false) == true) goto L43;
        if (AbstractC0425j.m1005J0(r5, "ActionBar", false) == true) goto L42;
        if (AbstractC0425j.m1005J0(r5, "Toolbar", false) == true) goto L42;
        if (AbstractC0425j.m1005J0(r5, "action_bar", false) == true) goto L42;
        if (AbstractC0425j.m1005J0(r5, "ActionMenuView", false) == true) goto L42;
        if ((r02 instanceof View) == false) goto L37;
        View r03 = (View) r02;
    L38:
        if (r03 == null) goto L40;
        r02 = r03.getParent();
    L41:
        r1 = r1 + 1;
        goto L7
    L40:
        r02 = null;
        goto L41
    L37:
        r03 = null;
    L42:
        return true;
    L43:
        return false;
    L11:
        r5 = null;
        goto L12
    L45:
        if (r7.isAttachedToWindow() == true) goto L47;
        return false;
    L47:
        int[] r04 = new int[2];
        r7.getLocationOnScreen(r04);     // Catch: Throwable -> L50
        Object r12 = C0146l.f339a;     // Catch: Throwable -> L50
    L53:
        if (AbstractC0141g.m465a(r12) == null) goto L55;
        return false;
    L55:
        int r05 = r04[1];
        int r72 = (int) (r7.getResources().getDisplayMetrics().heightPixels * 0.16f);
        if (r05 < 0) goto L74;
        if (r05 <= r72) goto L59;
        return false;
    L59:
        return true;
    L74:
        return false;
    L50:
        th = move-exception;
        r12 = AbstractC0040p.m116u(th);
        goto L53
    }

    /* JADX INFO: renamed from: p */
    public static boolean m1429p(Class r2) {
    L2:
        if (r2 == null) goto L11;
        if (r2.getName().equals("com.tencent.mm.ui.LauncherUIBottomTabView") == true) goto L9;
        if (AbstractC0433r.m1028C0(r2.getName(), "LauncherUIBottomTabView") == true) goto L16;
        r2 = r2.getSuperclass();
        goto L2
    L16:
        return true;
    L9:
        return true;
    L11:
        return false;
    }

    /* JADX INFO: renamed from: q */
    public static boolean m1430q(String r4) {
        String r42 = AbstractC0425j.m1023b1(r4).toString();
        if (r42.length() != 0) goto L6;
    L7:
        return false;
    L6:
        if (r42.length() > 12) goto L7;
        List r02 = C0710y.m1808c();
        List r2 = C0710y.f2234a;
        if ((r2 instanceof Collection) == true) goto L11;
    L13:
        Iterator r22 = r2.iterator();
    L15:
        if (r22.hasNext() == false) goto L20;
        if (AbstractC0307g.m699a((String) r22.next(), r42) == false) goto L15;
    L29:
        return true;
    L20:
        if ((r02 instanceof Collection) == true) goto L22;
    L24:
        Iterator r03 = r02.iterator();
    L26:
        if (r03.hasNext() == false) goto L38;
        if (AbstractC0307g.m699a((String) r03.next(), r42) == false) goto L26;
    L38:
        return false;
    L22:
        if (r02.isEmpty() == false) goto L24;
        return false;
    L11:
        if (r2.isEmpty() == false) goto L13;
        goto L13
    }

    /* JADX INFO: renamed from: r */
    public static boolean m1431r(Context r6) {
        WeakReference r02 = (WeakReference) f1788u.get();
        if (r02 == null) goto L5;
        Context r03 = (Context) r02.get();
    L6:
        if (r03 == r6) goto L8;
        int r04 = 0;
        Context r3 = r6;
        boolean r2 = false;
    L11:
        if (r04 >= 8) goto L31;
        if (r3 == null) goto L14;
        String r4 = r3.getClass().getName();
    L15:
        if (r4 != null) goto L18;
        r4 = "";
    L18:
        if (r4.equals("com.tencent.mm.ui.LauncherUI") == false) goto L20;
    L29:
        r2 = true;
    L30:
        r04 = r04 + 1;
        goto L11
    L20:
        if (AbstractC0433r.m1028C0(r4, ".LauncherUI") == true) goto L29;
        if ((r3 instanceof ContextWrapper) == false) goto L25;
        ContextWrapper r32 = (ContextWrapper) r3;
    L26:
        if (r32 == null) goto L28;
        r3 = r32.getBaseContext();
        goto L30
    L28:
        r3 = null;
        goto L30
    L25:
        r32 = null;
        goto L26
    L14:
        r4 = null;
        goto L15
    L31:
        f1788u.set(new WeakReference(r6));
        f1789v = r2;
        return r2;
    L8:
        return f1789v;
    L5:
        r03 = null;
        goto L6
    }

    /* JADX INFO: renamed from: s */
    public static void m1432s(int r4) {
        Object r02 = f1771d;
        if (r02 != null) goto L5;
        return;
    L5:
        Method r1 = f1772e;
        if (r1 != null) goto L24;
        return;
    L24:
        r1.setAccessible(true);     // Catch: Throwable -> L11
        Object r03 = r1.invoke(r02, new Object[]{Integer.valueOf(r4)});     // Catch: Throwable -> L11
    L13:
        Throwable r04 = AbstractC0141g.m465a(r03);
        if (r04 == null) goto L16;
        m1436w("onTabClick: " + r04.getMessage());
    L16:
        if (r4 != 0) goto L18;
        long r05 = SystemClock.uptimeMillis();
    L19:
        f1776i = r05;
        C0758s r06 = f1770c;
        if (r06 == null) goto L22;
        r06.m1942e(r4, true);
    L22:
        m1417d(r4);
        return;
    L18:
        r05 = 0;
    L11:
        th = move-exception;
        r03 = AbstractC0040p.m116u(th);
        goto L13
    }

    /* JADX INFO: renamed from: t */
    public static C0139e m1433t(String r6) {
        Pattern r02 = Pattern.compile("^(.*?)(\\s*[\\(（]\\d+[\\)）])$");
        AbstractC0307g.m702d(r02, "compile(...)");
        AbstractC0307g.m703e(r6, "input");
        Matcher r03 = r02.matcher(r6);
        AbstractC0307g.m702d(r03, "matcher(...)");
        C0419d r4 = null;
        if (r03.matches() == true) goto L5;
        C0419d r3 = null;
    L7:
        if (r3 != null) goto L9;
        Pattern r32 = Pattern.compile("^(.*?)(\\s+\\d+)$");
        AbstractC0307g.m702d(r32, "compile(...)");
        Matcher r1 = r32.matcher(r6);
        AbstractC0307g.m702d(r1, "matcher(...)");
        if (r1.matches() == false) goto L14;
        r4 = new C0419d(r1, r6);
    L14:
        if (r4 == null) goto L30;
        String r12 = AbstractC0425j.m1023b1((String) ((C0195z) r4.m1002a()).get(1)).toString();
        if (m1430q(r12) == true) goto L28;
        List r2 = C0710y.f2234a;
        if ((r2 instanceof Collection) == true) goto L20;
    L22:
        Iterator r22 = r2.iterator();
    L24:
        if (r22.hasNext() == false) goto L30;
        if (AbstractC0307g.m699a((String) r22.next(), r12) == false) goto L24;
    L20:
        if (r2.isEmpty() == false) goto L22;
    L28:
        return new C0139e(r12, ((C0195z) r4.m1002a()).get(2));
    L30:
        return new C0139e(AbstractC0425j.m1023b1(r6).toString(), "");
    L9:
        return new C0139e(AbstractC0425j.m1023b1((String) ((C0195z) r3.m1002a()).get(1)).toString(), ((C0195z) r3.m1002a()).get(2));
    L5:
        r3 = new C0419d(r03, r6);
        goto L7
    }

    /* JADX INFO: renamed from: u */
    public static void m1434u(ViewGroup r5) {
        f1777j = true;
        r5.removeAllViews();     // Catch: Throwable -> L5
    L7:
        r5.setVisibility(8);     // Catch: Throwable -> L12
        float r2 = 0.0f;
        r5.setAlpha(0.0f);     // Catch: Throwable -> L12
        r5.setBackgroundColor(0);     // Catch: Throwable -> L12
        r5.setBackground(null);     // Catch: Throwable -> L12
        r5.setMinimumHeight(0);     // Catch: Throwable -> L12
        r5.setMinimumWidth(0);     // Catch: Throwable -> L12
        ViewGroup.LayoutParams r3 = r5.getLayoutParams();     // Catch: Throwable -> L12
        if (r3 != null) goto L10;
    L14:
        float r32 = r5.getHeight();     // Catch: Throwable -> L12
        if (r32 < 0.0f) goto L18;
        r2 = r32;
    L18:
        r5.setTranslationY(r2);     // Catch: Throwable -> L12
        r5.setClickable(false);     // Catch: Throwable -> L12
        r5.setFocusable(false);     // Catch: Throwable -> L12
        r5.setEnabled(false);     // Catch: Throwable -> L12
    L19:
        f1777j = false;
        return;
    L10:
        if (r3.height == 0) goto L14;
        r3.height = 0;     // Catch: Throwable -> L12
        r5.setLayoutParams(r3);     // Catch: Throwable -> L12
        goto L14
    L12:
        th = move-exception;
        m1436w("suppress: " + th.getMessage());     // Catch: Throwable -> L23
    L23:
        th = move-exception;
        f1777j = false;
        throw th;
    L5:
        th = move-exception;
        AbstractC0040p.m116u(th);     // Catch: Throwable -> L12
        goto L7
    }

    /* JADX INFO: renamed from: v */
    public static final void m1435v(final int r19, final ViewGroup r20, final ViewGroup r21, final Object r22, final Object r23) {
        boolean r4 = false;
        if (C0710y.m1807b() == true) goto L5;
        return;
    L5:
        C0758s r02 = f1770c;
        if (r02 != null) goto L8;
    L11:
        int r03 = r20.getChildCount();
        int r6 = 0;
    L12:
        if (r6 >= r03) goto L19;
        View r9 = r20.getChildAt(r6);
        if ((r9 instanceof ViewGroup) == false) goto L18;
        if (m1429p(r9.getClass()) == false) goto L18;
        ViewGroup r92 = (ViewGroup) r9;
    L20:
        if (r92 != null) goto L24;
        if (r19 <= 0) goto L24;
        r21.postDelayed(new RunnableC0576C(r19, r20, r21, r22, r23), 60);
        return;
    L24:
        f1771d = r23;
        f1772e = m1421h(r23.getClass());
        if (r92 == null) goto L154;
        View.OnClickListener r04 = m1420g(r92);
        if (r04 != null) goto L43;
        r04 = m1420g(r92);
        if (r04 != null) goto L43;
        C0178i r05 = new C0178i();
        r05.addLast(r92);
    L33:
        if ((!r05.isEmpty()) == false) goto L42;
        View r62 = (View) r05.removeFirst();
        View.OnClickListener r10 = m1420g(r62);
        if (r10 != null) goto L36;
        if ((r62 instanceof ViewGroup) == false) goto L33;
        ViewGroup r63 = (ViewGroup) r62;
        int r102 = r63.getChildCount();
        int r11 = 0;
    L40:
        if (r11 >= r102) goto L33;
        View r12 = r63.getChildAt(r11);
        AbstractC0307g.m702d(r12, "getChildAt(...)");
        r05.addLast(r12);
        r11 = r11 + 1;
        goto L40
    L36:
        r04 = r10;
        goto L43
    L42:
        r04 = null;
    L43:
        f1773f = r04;
    L154:
        Object r06 = AbstractC0358S.m920y(r22, "f190271a");     // Catch: Throwable -> L48
        if ((r06 instanceof Activity) == false) goto L50;
        Activity r07 = (Activity) r06;     // Catch: Throwable -> L48
    L66:
        if (r07 == null) goto L68;
        Context r112 = r07;
    L70:
        if (r07 == null) goto L81;
        f1785r = new WeakReference(r07);
        Window r64 = r07.getWindow();
        if (r64 == null) goto L76;
        View r65 = r64.getDecorView();
        if (r65 == null) goto L76;
        r65.post(new RunnableC0713z(0));
    L76:
        Window r08 = r07.getWindow();
        if (r08 == null) goto L81;
        View r09 = r08.getDecorView();
        if (r09 == null) goto L81;
        r09.postDelayed(new RunnableC0713z(1), 200);
    L81:
        int r010 = r20.getChildCount() - 1;
    L83:
        if ((-1) >= r010) goto L88;
        if (AbstractC0307g.m699a(r20.getChildAt(r010).getTag(2114916353), Boolean.TRUE) == false) goto L87;
        r20.removeViewAt(r010);
    L87:
        r010 = r010 - 1;
        goto L83
    L88:
        AbstractC0307g.m700b(r112);
        List r011 = C0710y.f2234a;
        List r122 = C0710y.m1808c();
        C0710y.m1806a(System.currentTimeMillis());
        boolean r012 = C0710y.f2238e;
        C0710y.m1806a(System.currentTimeMillis());
        C0758s r13 = new C0758s(r112, r122, r012, C0710y.f2239f, new C0570A(1), new C0570A(2));
        f1770c = r13;
        r13.setTag(2114916353, Boolean.TRUE);
        if (r92 != null) goto L158;
    L130:
        m1416c();
        if (r92 == null) goto L133;
        m1434u(r92);
    L134:
        r20.setClipChildren(false);
        r20.setClipToPadding(false);
        if ((r20 instanceof FrameLayout) == false) goto L137;
        ViewGroup.LayoutParams r013 = new FrameLayout.LayoutParams(-1, -2, 80);
    L152:
        r20.addView(r13, r013);     // Catch: Throwable -> L148
        r13.bringToFront();     // Catch: Throwable -> L148
        r13.post(new RunnableC0328h(r13, r20, 1));     // Catch: Throwable -> L148
        m1418e(r21.getRootView());     // Catch: Throwable -> L148
        r13.post(new RunnableC0579D(r21, 0));     // Catch: Throwable -> L148
        r13.postDelayed(new RunnableC0579D(r21, 1), 200);     // Catch: Throwable -> L148
        r13.postDelayed(new RunnableC0579D(r21, 2), 800);     // Catch: Throwable -> L148
        String r014 = r20.getClass().getSimpleName();     // Catch: Throwable -> L148
        if (f1772e == null) goto L141;
        boolean r1 = true;
    L143:
        if (f1773f == null) goto L145;
        r4 = true;
    L145:
        m1436w("injected parent=" + r014 + " click=" + r1 + " listener=" + r4);     // Catch: Throwable -> L148
        return;
    L141:
        r1 = false;
    L148:
        th = move-exception;
        f1770c = null;
        m1436w("addView fail: " + th.getMessage());
        return;
    L137:
        r013 = new FrameLayout.LayoutParams(-1, -2, 80);
        goto L152
    L133:
        m1423j(r20);
        goto L134
    L158:
        Object r015 = AbstractC0358S.m887g(r92, "getShowFriendPoint", new Object[0]);     // Catch: Throwable -> L93
        if ((r015 instanceof Boolean) == false) goto L95;
        Boolean r016 = (Boolean) r015;     // Catch: Throwable -> L93
    L96:
        if (r016 == null) goto L98;
        boolean r017 = r016.booleanValue();     // Catch: Throwable -> L93
    L99:
        f1781n = r017;     // Catch: Throwable -> L93
    L156:
        Object r018 = AbstractC0358S.m887g(r92, "getFriendUnreadCountView", new Object[0]);     // Catch: Throwable -> L105
        if ((r018 instanceof TextView) == false) goto L107;
        TextView r019 = (TextView) r018;     // Catch: Throwable -> L105
    L108:
        if (r019 == null) goto L114;
        CharSequence r66 = r019.getText();     // Catch: Throwable -> L105
        if (r66 == null) goto L114;
        String r67 = r66.toString();     // Catch: Throwable -> L105
        if (r67 == null) goto L114;
        String r68 = AbstractC0425j.m1022a1(r67).toString();     // Catch: Throwable -> L105
    L115:
        if (r68 != null) goto L117;
        r68 = "";
    L117:
        if (r019 != null) goto L119;
    L125:
        boolean r020 = false;
    L126:
        f1782o = r020;     // Catch: Throwable -> L105
    L129:
        m1436w("sync badge native main=" + f1778k + " contact=" + f1779l + " friend=" + f1780m + " dot=" + f1781n + " text=" + f1782o);
        goto L130
    L119:
        if (r019.getVisibility() != 0) goto L125;
        if (r68.length() <= 0) goto L125;
        if (AbstractC0432q.m1026A0(r68) != null) goto L125;
        r020 = true;
    L114:
        r68 = null;
        goto L115
    L107:
        r019 = null;
    L105:
        th = move-exception;
        AbstractC0040p.m116u(th);
        goto L129
    L98:
        r017 = false;
        goto L99
    L95:
        r016 = null;
    L93:
        th = move-exception;
        AbstractC0040p.m116u(th);
        goto L156
    L68:
        r112 = r21.getContext();
    L50:
        Context r021 = r21.getContext();
        int r69 = 0;
    L51:
        if (r021 == null) goto L65;
        int r103 = r69 + 1;
        if (r69 >= 8) goto L65;
        if ((r021 instanceof Activity) == true) goto L56;
        if ((r021 instanceof ContextWrapper) == false) goto L60;
        ContextWrapper r022 = (ContextWrapper) r021;
    L61:
        if (r022 == null) goto L63;
        r021 = r022.getBaseContext();
    L64:
        r69 = r103;
        goto L51
    L63:
        r021 = null;
        goto L64
    L60:
        r022 = null;
        goto L61
    L56:
        r07 = (Activity) r021;
    L65:
        r07 = null;
    L48:
        th = move-exception;
        AbstractC0040p.m116u(th);
    L18:
        r6 = r6 + 1;
        goto L12
    L19:
        r92 = null;
        goto L20
    L8:
        if (r02.isAttachedToWindow() != true) goto L11;
        m1423j(r20);
    }

    /* JADX INFO: renamed from: w */
    public static void m1436w(String r2) {
        AbstractC0762d.m1954d("[OKK-FloatTab] " + r2);     // Catch: Throwable -> L5
        return;
    }

    /* JADX INFO: renamed from: x */
    public static void m1437x(View r5) {
        if (r5 != null) goto L21;
        return;
    L21:
        AbstractC0358S.m887g(r5, "setBottomBlurAreaHeight", new Object[]{0});     // Catch: Throwable -> L7
    L9:
        Iterator r1 = AbstractC0182m.m556h0(new String[]{"bottomBlurAreaHeight", "m"}).iterator();
    L11:
        if (r1.hasNext() == false) goto L19;
        String r2 = (String) r1.next();
        Field r22 = r5.getClass().getDeclaredField(r2);     // Catch: Throwable -> L17
        if (AbstractC0307g.m699a(r22.getType(), Integer.TYPE) == false) goto L11;
        r22.setAccessible(true);     // Catch: Throwable -> L17
        r22.setInt(r5, 0);     // Catch: Throwable -> L17
    L17:
        th = move-exception;
        AbstractC0040p.m116u(th);
        goto L11
    L19:
        r5.postInvalidate();
        return;
    L7:
        th = move-exception;
        AbstractC0040p.m116u(th);
        goto L9
    }
}
