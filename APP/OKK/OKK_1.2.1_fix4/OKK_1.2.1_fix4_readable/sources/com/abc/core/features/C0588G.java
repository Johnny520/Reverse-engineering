package com.abc.core.features;

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
import com.abc.internal.probe.C0552b;
import com.abc.internal.probe.C0555e;
import com.abc.internal.probe.DexKitManager;
import com.abc.ui.FloatingBottomTabView;
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

/* JADX INFO: renamed from: c0.G */
/* JADX INFO: loaded from: classes.dex */
public final class C0588G {

    /* JADX INFO: renamed from: c */
    public static volatile FloatingBottomTabView f1770c;

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

    /* JADX INFO: renamed from: v */
    public static volatile boolean f1789v;

    /* JADX INFO: renamed from: a */
    public static final C0588G f1768a = new C0588G();

    /* JADX INFO: renamed from: b */
    public static final AtomicBoolean f1769b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: u */
    public static final AtomicReference f1788u = new AtomicReference(new WeakReference(null));

    /* JADX INFO: renamed from: a */
    public static final boolean m1414a(View view) {
        if (AbstractC0307g.m699a(view.getTag(2114916353), Boolean.TRUE) || view == f1770c) {
            return false;
        }
        String name = view.getClass().getName();
        if (!name.equals("com.tencent.mm.ui.LauncherUIBottomTabView") && !AbstractC0433r.m1028C0(name, "LauncherUIBottomTabView")) {
            for (Class<?> superclass = view.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                if (!superclass.getName().equals("com.tencent.mm.ui.LauncherUIBottomTabView") && !AbstractC0433r.m1028C0(superclass.getName(), "LauncherUIBottomTabView")) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public static final String m1415b(String str) {
        List listM1808c = BottomTabConfig.m1808c();
        List list = BottomTabConfig.f2234a;
        String string = AbstractC0425j.m1022a1(str).toString();
        if (string.length() == 0) {
            return null;
        }
        C0139e c0139eM1433t = m1433t(string);
        String str2 = (String) c0139eM1433t.f328a;
        String str3 = (String) c0139eM1433t.f329b;
        if (str2.length() == 0 || str2.length() > 12) {
            return null;
        }
        String string2 = AbstractC0425j.m1023b1(str2).toString();
        int iMin = Math.min(4, Math.min(list.size(), listM1808c.size()));
        for (int i2 = 0; i2 < iMin; i2++) {
            if (AbstractC0307g.m699a(string2, list.get(i2)) || AbstractC0307g.m699a(string2, listM1808c.get(i2))) {
                String str4 = listM1808c.get(i2) + str3;
                if (AbstractC0307g.m699a(str4, string)) {
                    return null;
                }
                return str4;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static void m1416c() {
        FloatingBottomTabView floatingBottomTabView = f1770c;
        if (floatingBottomTabView == null) {
            return;
        }
        floatingBottomTabView.setMainUnread(f1778k);
        floatingBottomTabView.setContactUnread(f1779l);
        boolean z2 = false;
        floatingBottomTabView.setContactDot(false);
        floatingBottomTabView.setFriendUnread(f1780m);
        if (f1780m <= 0 && (f1781n || f1782o)) {
            z2 = true;
        }
        floatingBottomTabView.setFriendDot(z2);
    }

    /* JADX INFO: renamed from: d */
    public static void m1417d(int i2) {
        Activity activity;
        Object objM116u;
        Object obj;
        Object obj2;
        TextView textView;
        View decorView;
        f1784q = i2;
        if (BottomTabConfig.m1807b()) {
            List listM1808c = BottomTabConfig.m1808c();
            if (i2 < 0 || i2 >= listM1808c.size()) {
                return;
            }
            String strConcat = (String) listM1808c.get(i2);
            if (AbstractC0425j.m1013R0(strConcat)) {
                return;
            }
            WeakReference weakReference = f1785r;
            if (weakReference == null || (activity = (Activity) weakReference.get()) == null) {
                FloatingBottomTabView floatingBottomTabView = f1770c;
                Context context = floatingBottomTabView != null ? floatingBottomTabView.getContext() : null;
                activity = context instanceof Activity ? (Activity) context : null;
                if (activity == null) {
                    return;
                }
            }
            if (m1431r(activity)) {
                f1783p = true;
                try {
                    try {
                        ActionBar actionBar = activity.getActionBar();
                        objM116u = actionBar != null ? actionBar.getCustomView() : null;
                    } finally {
                    }
                    if (objM116u instanceof C0140f) {
                        objM116u = null;
                    }
                    View view = (View) objM116u;
                    if (view == null) {
                        try {
                            Object objM887g = AbstractC0358S.m887g(AbstractC0358S.m887g(activity, "getSupportActionBar", new Object[0]), "getCustomView", new Object[0]);
                            obj = objM887g instanceof View ? (View) objM887g : null;
                        } catch (Throwable th) {
                        }
                        if (obj instanceof C0140f) {
                            obj = null;
                        }
                        view = (View) obj;
                        if (view == null) {
                            try {
                                Object objM887g2 = AbstractC0358S.m887g(AbstractC0358S.m887g(activity, "getSupportActionBar", new Object[0]), "j", new Object[0]);
                                obj2 = objM887g2 instanceof View ? (View) objM887g2 : null;
                            } catch (Throwable th2) {
                            }
                            if (obj2 instanceof C0140f) {
                                obj2 = null;
                            }
                            view = (View) obj2;
                        }
                    }
                    if (view == null || (textView = (TextView) view.findViewById(R.id.text1)) == null) {
                        Window window = activity.getWindow();
                        textView = (window == null || (decorView = window.getDecorView()) == null) ? null : (TextView) decorView.findViewById(R.id.text1);
                    }
                    String str = "";
                    if (textView != null && m1428o(textView)) {
                        CharSequence text = textView.getText();
                        String string = text != null ? text.toString() : null;
                        if (string != null) {
                            str = string;
                        }
                        String str2 = (String) m1433t(AbstractC0425j.m1022a1(str).toString()).f329b;
                        if (i2 == 0 && str2.length() > 0) {
                            strConcat = strConcat.concat(str2);
                        }
                        CharSequence text2 = textView.getText();
                        if (!AbstractC0307g.m699a(text2 != null ? text2.toString() : null, strConcat)) {
                            textView.setText(strConcat);
                        }
                        f1783p = false;
                        return;
                    }
                    Window window2 = activity.getWindow();
                    View decorView2 = window2 != null ? window2.getDecorView() : null;
                    ViewGroup viewGroup = decorView2 instanceof ViewGroup ? (ViewGroup) decorView2 : null;
                    if (viewGroup == null) {
                        f1783p = false;
                        return;
                    }
                    C0313m c0313m = new C0313m();
                    m1422i(c0313m, (int) (viewGroup.getResources().getDisplayMetrics().heightPixels * 0.16f), viewGroup, 0);
                    TextView textView2 = (TextView) c0313m.f595a;
                    if (textView2 != null) {
                        CharSequence text3 = textView2.getText();
                        String string2 = text3 != null ? text3.toString() : null;
                        if (string2 != null) {
                            str = string2;
                        }
                        String str3 = (String) m1433t(AbstractC0425j.m1022a1(str).toString()).f329b;
                        if (i2 == 0 && str3.length() > 0) {
                            strConcat = strConcat.concat(str3);
                        }
                        CharSequence text4 = textView2.getText();
                        if (!AbstractC0307g.m699a(text4 != null ? text4.toString() : null, strConcat)) {
                            textView2.setText(strConcat);
                        }
                    }
                    f1783p = false;
                } catch (Throwable th3) {
                    f1783p = false;
                }
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m1418e(View view) {
        if (view == null || !BottomTabConfig.m1807b()) {
            return;
        }
        C0178i c0178i = new C0178i();
        c0178i.addLast(view);
        int i2 = 0;
        while ((!c0178i.isEmpty()) && i2 < 600) {
            i2++;
            View view2 = (View) c0178i.removeFirst();
            String name = view2.getClass().getName();
            if (name.equals("com.tencent.mm.ui.FrostedContentView") || AbstractC0433r.m1028C0(name, "FrostedContentView")) {
                m1437x(view2);
            }
            if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                int childCount = viewGroup.getChildCount();
                for (int i3 = 0; i3 < childCount; i3++) {
                    View childAt = viewGroup.getChildAt(i3);
                    if (childAt != null) {
                        c0178i.addLast(childAt);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m1419f(FloatingBottomTabView floatingBottomTabView, ViewGroup viewGroup, int i2) {
        if (floatingBottomTabView.isAttachedToWindow()) {
            m1423j(viewGroup);
            floatingBottomTabView.bringToFront();
            if (viewGroup.getWidth() > 0) {
                floatingBottomTabView.setMinimumWidth(viewGroup.getWidth());
                floatingBottomTabView.requestLayout();
                floatingBottomTabView.invalidate();
            } else if (i2 > 0) {
                floatingBottomTabView.postDelayed(new RunnableC0321a(i2, floatingBottomTabView, viewGroup, 1), 50L);
            }
            m1436w("layout try parentW=" + viewGroup.getWidth() + " bar=" + floatingBottomTabView.getWidth() + "x" + floatingBottomTabView.getHeight() + " vis=" + floatingBottomTabView.getVisibility() + " children=" + viewGroup.getChildCount());
        }
    }

    /* JADX INFO: renamed from: g */
    public static View.OnClickListener m1420g(View view) {
        Object objM116u;
        try {
            Method declaredMethod = View.class.getDeclaredMethod("getListenerInfo", null);
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(view, null);
            if (objInvoke == null) {
                return null;
            }
            Field declaredField = objInvoke.getClass().getDeclaredField("mOnClickListener");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(objInvoke);
            objM116u = obj instanceof View.OnClickListener ? (View.OnClickListener) obj : null;
        } catch (Throwable th) {
            objM116u = AbstractC0040p.m116u(th);
        }
        return (View.OnClickListener) (objM116u instanceof C0140f ? null : objM116u);
    }

    /* JADX INFO: renamed from: h */
    public static Method m1421h(Class cls) {
        while (cls != null) {
            C0172c c0172cM714c = AbstractC0317q.m714c(cls.getDeclaredMethods());
            while (c0172cM714c.hasNext()) {
                Method method = (Method) c0172cM714c.next();
                if (AbstractC0307g.m699a(method.getName(), "onTabClick") && method.getParameterTypes().length == 1) {
                    return method;
                }
            }
            cls = cls.getSuperclass();
        }
        return null;
    }

    /* JADX INFO: renamed from: i */
    public static final void m1422i(C0313m c0313m, int i2, View view, int i3) {
        if (c0313m.f595a != null || i3 > 14) {
            return;
        }
        String name = view.getClass().getName();
        if (AbstractC0425j.m1005J0(name, "RecyclerView", false) || AbstractC0425j.m1005J0(name, "ListView", false) || AbstractC0425j.m1005J0(name, "BottomTab", false) || AbstractC0425j.m1005J0(name, "OKKFloating", false)) {
            return;
        }
        if (view instanceof TextView) {
            TextView textView = (TextView) view;
            if (textView.getId() == 16908308 && textView.isShown()) {
                int[] iArr = new int[2];
                try {
                    view.getLocationOnScreen(iArr);
                } catch (Throwable th) {
                    AbstractC0040p.m116u(th);
                }
                int i4 = iArr[1];
                if (i4 >= 0 && i4 <= i2) {
                    c0313m.f595a = view;
                    return;
                }
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = viewGroup.getChildAt(i5);
                AbstractC0307g.m702d(childAt, "getChildAt(...)");
                m1422i(c0313m, i2, childAt, i3 + 1);
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m1423j(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if ((childAt instanceof ViewGroup) && m1429p(childAt.getClass())) {
                m1434u((ViewGroup) childAt);
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public static void m1424k(Class cls) {
        m1425l(cls, "onPageScrolled", new C0555e(28));
        m1425l(cls, "onPageSelected", new C0555e(29));
        m1425l(cls, "onPageScrollStateChanged", new C0570A(0));
    }

    /* JADX INFO: renamed from: l */
    public static final void m1425l(Class cls, String str, InterfaceC0286l interfaceC0286l) {
        C0172c c0172cM714c = AbstractC0317q.m714c(cls.getDeclaredMethods());
        while (c0172cM714c.hasNext()) {
            Method method = (Method) c0172cM714c.next();
            if (AbstractC0307g.m699a(method.getName(), str)) {
                try {
                    AbstractC0762d.m1952b(method, new C0582E(interfaceC0286l, 0));
                    m1436w("hooked " + cls.getSimpleName() + "." + str);
                } catch (Throwable th) {
                    AbstractC0040p.m116u(th);
                }
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public static final boolean m1426m(Method method, InterfaceC0286l interfaceC0286l) {
        Object objM116u;
        if (method == null || method.getParameterTypes().length != 1 || !AbstractC0307g.m699a(method.getParameterTypes()[0], Integer.TYPE)) {
            return false;
        }
        try {
            method.setAccessible(true);
            AbstractC0762d.m1952b(method, new C0582E(interfaceC0286l, 2));
            m1436w("hooked unread int " + method.getDeclaringClass().getSimpleName() + "." + method.getName());
            objM116u = Boolean.TRUE;
        } catch (Throwable th) {
            objM116u = AbstractC0040p.m116u(th);
        }
        Object obj = Boolean.FALSE;
        if (objM116u instanceof C0140f) {
            objM116u = obj;
        }
        return ((Boolean) objM116u).booleanValue();
    }

    /* JADX INFO: renamed from: n */
    public static final Method m1427n(Context context, ClassLoader classLoader, String str, Class cls, String... strArr) {
        if (context == null) {
            return null;
        }
        AtomicBoolean atomicBoolean = DexKitManager.f1646a;
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        AbstractC0307g.m703e(classLoader, "classLoader");
        AbstractC0307g.m703e(strArr2, "strings");
        Method method = (Method) DexKitManager.m1367f(context, classLoader, str, new C0552b(classLoader, strArr2, 2));
        if (method == null) {
            return null;
        }
        if (cls.isAssignableFrom(method.getDeclaringClass()) || method.getDeclaringClass().isAssignableFrom(cls)) {
            return method;
        }
        return null;
    }

    /* JADX INFO: renamed from: o */
    public static boolean m1428o(TextView textView) {
        Object objM116u;
        if (textView.getId() != 16908308) {
            return false;
        }
        Object parent = textView.getParent();
        for (int i2 = 0; i2 < 8; i2++) {
            String name = parent != null ? parent.getClass().getName() : null;
            if (name == null) {
                name = "";
            }
            if (AbstractC0425j.m1005J0(name, "RecyclerView", false) || AbstractC0425j.m1005J0(name, "ListView", false) || AbstractC0425j.m1005J0(name, "BottomTab", false) || AbstractC0425j.m1005J0(name, "OKKFloating", false) || AbstractC0425j.m1005J0(name, "Preference", false)) {
                return false;
            }
            if (AbstractC0425j.m1005J0(name, "ActionBar", false) || AbstractC0425j.m1005J0(name, "Toolbar", false) || AbstractC0425j.m1005J0(name, "action_bar", false) || AbstractC0425j.m1005J0(name, "ActionMenuView", false)) {
                return true;
            }
            View view = parent instanceof View ? (View) parent : null;
            parent = view != null ? view.getParent() : null;
        }
        if (!textView.isAttachedToWindow()) {
            return false;
        }
        int[] iArr = new int[2];
        try {
            textView.getLocationOnScreen(iArr);
            objM116u = C0146l.f339a;
        } catch (Throwable th) {
            objM116u = AbstractC0040p.m116u(th);
        }
        if (AbstractC0141g.m465a(objM116u) != null) {
            return false;
        }
        int i3 = iArr[1];
        return i3 >= 0 && i3 <= ((int) (((float) textView.getResources().getDisplayMetrics().heightPixels) * 0.16f));
    }

    /* JADX INFO: renamed from: p */
    public static boolean m1429p(Class cls) {
        while (cls != null) {
            if (cls.getName().equals("com.tencent.mm.ui.LauncherUIBottomTabView") || AbstractC0433r.m1028C0(cls.getName(), "LauncherUIBottomTabView")) {
                return true;
            }
            cls = cls.getSuperclass();
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0056  */
    /* JADX INFO: renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m1430q(String str) {
        Iterator it;
        String string = AbstractC0425j.m1023b1(str).toString();
        if (string.length() == 0 || string.length() > 12) {
            return false;
        }
        List listM1808c = BottomTabConfig.m1808c();
        List list = BottomTabConfig.f2234a;
        if ((list instanceof Collection) && list.isEmpty()) {
            if (!(listM1808c instanceof Collection)) {
            }
            it = listM1808c.iterator();
            while (it.hasNext()) {
            }
            return false;
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            if (AbstractC0307g.m699a((String) it2.next(), string)) {
                break;
            }
        }
        if (!(listM1808c instanceof Collection) && listM1808c.isEmpty()) {
            return false;
        }
        it = listM1808c.iterator();
        while (it.hasNext()) {
            if (AbstractC0307g.m699a((String) it.next(), string)) {
            }
        }
        return false;
        return true;
    }

    /* JADX INFO: renamed from: r */
    public static boolean m1431r(Context context) {
        WeakReference weakReference = (WeakReference) f1788u.get();
        if ((weakReference != null ? (Context) weakReference.get() : null) == context) {
            return f1789v;
        }
        Context baseContext = context;
        boolean z2 = false;
        for (int i2 = 0; i2 < 8; i2++) {
            String name = baseContext != null ? baseContext.getClass().getName() : null;
            if (name == null) {
                name = "";
            }
            if (name.equals("com.tencent.mm.ui.LauncherUI") || AbstractC0433r.m1028C0(name, ".LauncherUI")) {
                z2 = true;
            } else {
                ContextWrapper contextWrapper = baseContext instanceof ContextWrapper ? (ContextWrapper) baseContext : null;
                baseContext = contextWrapper != null ? contextWrapper.getBaseContext() : null;
            }
        }
        f1788u.set(new WeakReference(context));
        f1789v = z2;
        return z2;
    }

    /* JADX INFO: renamed from: s */
    public static void m1432s(int i2) {
        Method method;
        Object objM116u;
        Object obj = f1771d;
        if (obj == null || (method = f1772e) == null) {
            return;
        }
        try {
            method.setAccessible(true);
            objM116u = method.invoke(obj, Integer.valueOf(i2));
        } catch (Throwable th) {
            objM116u = AbstractC0040p.m116u(th);
        }
        Throwable thM465a = AbstractC0141g.m465a(objM116u);
        if (thM465a != null) {
            m1436w("onTabClick: " + thM465a.getMessage());
        }
        f1776i = i2 == 0 ? SystemClock.uptimeMillis() : 0L;
        FloatingBottomTabView floatingBottomTabView = f1770c;
        if (floatingBottomTabView != null) {
            floatingBottomTabView.m1942e(i2, true);
        }
        m1417d(i2);
    }

    /* JADX INFO: renamed from: t */
    public static C0139e m1433t(String str) {
        Pattern patternCompile = Pattern.compile("^(.*?)(\\s*[\\(（]\\d+[\\)）])$");
        AbstractC0307g.m702d(patternCompile, "compile(...)");
        AbstractC0307g.m703e(str, "input");
        Matcher matcher = patternCompile.matcher(str);
        AbstractC0307g.m702d(matcher, "matcher(...)");
        C0419d c0419d = !matcher.matches() ? null : new C0419d(matcher, str);
        if (c0419d != null) {
            return new C0139e(AbstractC0425j.m1023b1((String) ((C0195z) c0419d.m1002a()).get(1)).toString(), ((C0195z) c0419d.m1002a()).get(2));
        }
        Pattern patternCompile2 = Pattern.compile("^(.*?)(\\s+\\d+)$");
        AbstractC0307g.m702d(patternCompile2, "compile(...)");
        Matcher matcher2 = patternCompile2.matcher(str);
        AbstractC0307g.m702d(matcher2, "matcher(...)");
        C0419d c0419d2 = matcher2.matches() ? new C0419d(matcher2, str) : null;
        if (c0419d2 != null) {
            String string = AbstractC0425j.m1023b1((String) ((C0195z) c0419d2.m1002a()).get(1)).toString();
            if (!m1430q(string)) {
                List list = BottomTabConfig.f2234a;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (AbstractC0307g.m699a((String) it.next(), string)) {
                        }
                    }
                }
            }
            return new C0139e(string, ((C0195z) c0419d2.m1002a()).get(2));
        }
        return new C0139e(AbstractC0425j.m1023b1(str).toString(), "");
    }

    /* JADX INFO: renamed from: u */
    public static void m1434u(ViewGroup viewGroup) {
        f1777j = true;
        try {
            try {
                viewGroup.removeAllViews();
            } catch (Throwable th) {
                try {
                    m1436w("suppress: " + th.getMessage());
                } finally {
                    f1777j = false;
                }
            }
        } finally {
        }
        viewGroup.setVisibility(8);
        float f2 = 0.0f;
        viewGroup.setAlpha(0.0f);
        viewGroup.setBackgroundColor(0);
        viewGroup.setBackground(null);
        viewGroup.setMinimumHeight(0);
        viewGroup.setMinimumWidth(0);
        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        if (layoutParams != null && layoutParams.height != 0) {
            layoutParams.height = 0;
            viewGroup.setLayoutParams(layoutParams);
        }
        float height = viewGroup.getHeight();
        if (height >= 0.0f) {
            f2 = height;
        }
        viewGroup.setTranslationY(f2);
        viewGroup.setClickable(false);
        viewGroup.setFocusable(false);
        viewGroup.setEnabled(false);
    }

    /* JADX INFO: renamed from: v */
    public static final void m1435v(final int i2, final ViewGroup viewGroup, final ViewGroup viewGroup2, final Object obj, final Object obj2) {
        ViewGroup viewGroup3;
        Activity activity;
        CharSequence text;
        String string;
        View decorView;
        View decorView2;
        Object objM920y;
        if (BottomTabConfig.m1807b()) {
            FloatingBottomTabView floatingBottomTabView = f1770c;
            if (floatingBottomTabView != null && floatingBottomTabView.isAttachedToWindow()) {
                m1423j(viewGroup);
                return;
            }
            int childCount = viewGroup.getChildCount();
            int i3 = 0;
            while (true) {
                if (i3 >= childCount) {
                    viewGroup3 = null;
                    break;
                }
                View childAt = viewGroup.getChildAt(i3);
                if ((childAt instanceof ViewGroup) && m1429p(childAt.getClass())) {
                    viewGroup3 = (ViewGroup) childAt;
                    break;
                }
                i3++;
            }
            if (viewGroup3 == null && i2 > 0) {
                viewGroup2.postDelayed(new Runnable() { // from class: c0.C
                    @Override // java.lang.Runnable
                    public final void run() {
                        ViewGroup viewGroup4 = viewGroup;
                        AbstractC0307g.m703e(viewGroup4, "$parent");
                        Object obj3 = obj;
                        AbstractC0307g.m703e(obj3, "$mainTabUi");
                        C0588G.m1435v(i2 - 1, viewGroup4, viewGroup2, obj3, obj2);
                    }
                }, 60L);
                return;
            }
            f1771d = obj2;
            f1772e = m1421h(obj2.getClass());
            if (viewGroup3 != null) {
                View.OnClickListener onClickListenerM1420g = m1420g(viewGroup3);
                if (onClickListenerM1420g == null && (onClickListenerM1420g = m1420g(viewGroup3)) == null) {
                    C0178i c0178i = new C0178i();
                    c0178i.addLast(viewGroup3);
                    while (true) {
                        if (!(!c0178i.isEmpty())) {
                            onClickListenerM1420g = null;
                            break;
                        }
                        View view = (View) c0178i.removeFirst();
                        View.OnClickListener onClickListenerM1420g2 = m1420g(view);
                        if (onClickListenerM1420g2 != null) {
                            onClickListenerM1420g = onClickListenerM1420g2;
                            break;
                        }
                        if (view instanceof ViewGroup) {
                            ViewGroup viewGroup4 = (ViewGroup) view;
                            int childCount2 = viewGroup4.getChildCount();
                            for (int i4 = 0; i4 < childCount2; i4++) {
                                View childAt2 = viewGroup4.getChildAt(i4);
                                AbstractC0307g.m702d(childAt2, "getChildAt(...)");
                                c0178i.addLast(childAt2);
                            }
                        }
                    }
                }
                f1773f = onClickListenerM1420g;
            }
            try {
                objM920y = AbstractC0358S.m920y(obj, "f190271a");
            } catch (Throwable th) {
                AbstractC0040p.m116u(th);
            }
            if (objM920y instanceof Activity) {
                activity = (Activity) objM920y;
            } else {
                Context context = viewGroup2.getContext();
                int i5 = 0;
                while (context != null) {
                    int i6 = i5 + 1;
                    if (i5 >= 8) {
                        break;
                    }
                    if (context instanceof Activity) {
                        activity = (Activity) context;
                        break;
                    } else {
                        ContextWrapper contextWrapper = context instanceof ContextWrapper ? (ContextWrapper) context : null;
                        context = contextWrapper != null ? contextWrapper.getBaseContext() : null;
                        i5 = i6;
                    }
                }
                activity = null;
            }
            Context context2 = activity != null ? activity : viewGroup2.getContext();
            if (activity != null) {
                f1785r = new WeakReference(activity);
                Window window = activity.getWindow();
                if (window != null && (decorView2 = window.getDecorView()) != null) {
                    decorView2.post(new RunnableC0713z(0));
                }
                Window window2 = activity.getWindow();
                if (window2 != null && (decorView = window2.getDecorView()) != null) {
                    decorView.postDelayed(new RunnableC0713z(1), 200L);
                }
            }
            for (int childCount3 = viewGroup.getChildCount() - 1; -1 < childCount3; childCount3--) {
                if (AbstractC0307g.m699a(viewGroup.getChildAt(childCount3).getTag(2114916353), Boolean.TRUE)) {
                    viewGroup.removeViewAt(childCount3);
                }
            }
            AbstractC0307g.m700b(context2);
            List list = BottomTabConfig.f2234a;
            List listM1808c = BottomTabConfig.m1808c();
            BottomTabConfig.m1806a(System.currentTimeMillis());
            boolean z2 = BottomTabConfig.f2238e;
            BottomTabConfig.m1806a(System.currentTimeMillis());
            FloatingBottomTabView floatingBottomTabView2 = new FloatingBottomTabView(context2, listM1808c, z2, BottomTabConfig.f2239f, new C0570A(1), new C0570A(2));
            f1770c = floatingBottomTabView2;
            floatingBottomTabView2.setTag(2114916353, Boolean.TRUE);
            if (viewGroup3 != null) {
                try {
                    Object objM887g = AbstractC0358S.m887g(viewGroup3, "getShowFriendPoint", new Object[0]);
                    Boolean bool = objM887g instanceof Boolean ? (Boolean) objM887g : null;
                    f1781n = bool != null ? bool.booleanValue() : false;
                } catch (Throwable th2) {
                    AbstractC0040p.m116u(th2);
                }
                try {
                    Object objM887g2 = AbstractC0358S.m887g(viewGroup3, "getFriendUnreadCountView", new Object[0]);
                    TextView textView = objM887g2 instanceof TextView ? (TextView) objM887g2 : null;
                    String string2 = (textView == null || (text = textView.getText()) == null || (string = text.toString()) == null) ? null : AbstractC0425j.m1022a1(string).toString();
                    if (string2 == null) {
                        string2 = "";
                    }
                    f1782o = textView != null && textView.getVisibility() == 0 && string2.length() > 0 && AbstractC0432q.m1026A0(string2) == null;
                } catch (Throwable th3) {
                    AbstractC0040p.m116u(th3);
                }
                m1436w("sync badge native main=" + f1778k + " contact=" + f1779l + " friend=" + f1780m + " dot=" + f1781n + " text=" + f1782o);
            }
            m1416c();
            if (viewGroup3 != null) {
                m1434u(viewGroup3);
            } else {
                m1423j(viewGroup);
            }
            viewGroup.setClipChildren(false);
            viewGroup.setClipToPadding(false);
            try {
                viewGroup.addView(floatingBottomTabView2, viewGroup instanceof FrameLayout ? new FrameLayout.LayoutParams(-1, -2, 80) : new FrameLayout.LayoutParams(-1, -2, 80));
                floatingBottomTabView2.bringToFront();
                floatingBottomTabView2.post(new RunnableC0328h(floatingBottomTabView2, viewGroup, 1));
                m1418e(viewGroup2.getRootView());
                floatingBottomTabView2.post(new RunnableC0579D(viewGroup2, 0));
                floatingBottomTabView2.postDelayed(new RunnableC0579D(viewGroup2, 1), 200L);
                floatingBottomTabView2.postDelayed(new RunnableC0579D(viewGroup2, 2), 800L);
                m1436w("injected parent=" + viewGroup.getClass().getSimpleName() + " click=" + (f1772e != null) + " listener=" + (f1773f != null));
            } catch (Throwable th4) {
                f1770c = null;
                m1436w("addView fail: " + th4.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: w */
    public static void m1436w(String str) {
        try {
            AbstractC0762d.m1954d("[OKK-FloatTab] " + str);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: x */
    public static void m1437x(View view) {
        if (view == null) {
            return;
        }
        try {
            AbstractC0358S.m887g(view, "setBottomBlurAreaHeight", 0);
        } catch (Throwable th) {
            AbstractC0040p.m116u(th);
        }
        Iterator it = AbstractC0182m.m556h0("bottomBlurAreaHeight", "m").iterator();
        while (it.hasNext()) {
            try {
                Field declaredField = view.getClass().getDeclaredField((String) it.next());
                if (AbstractC0307g.m699a(declaredField.getType(), Integer.TYPE)) {
                    declaredField.setAccessible(true);
                    declaredField.setInt(view, 0);
                }
            } catch (Throwable th2) {
                AbstractC0040p.m116u(th2);
            }
        }
        view.postInvalidate();
    }
}
