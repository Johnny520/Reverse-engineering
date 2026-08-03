package com.abc.core.features;

import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.LinearLayout;
import de.robv.android.xposed.AbstractC0762d;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import p001A0.AbstractC0040p;
import p007D0.C0140f;
import p009E0.AbstractC0181l;
import p009E0.AbstractC0182m;
import p009E0.C0172c;
import p009E0.C0178i;
import p031Q0.AbstractC0307g;
import p031Q0.AbstractC0317q;
import p037U.AbstractC0358S;
import p042W0.AbstractC0425j;
import p042W0.AbstractC0433r;

/* JADX INFO: renamed from: c0.q0 */
/* JADX INFO: loaded from: classes.dex */
public final class FoldBannerPinHook {

    /* JADX INFO: renamed from: a */
    public static final FoldBannerPinHook f2154a = new FoldBannerPinHook();

    /* JADX INFO: renamed from: b */
    public static final AtomicBoolean f2155b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c */
    public static volatile boolean f2156c = true;

    /* JADX INFO: renamed from: d */
    public static volatile long f2157d;

    /* JADX INFO: renamed from: e */
    public static final Set f2158e;

    /* JADX INFO: renamed from: f */
    public static volatile WeakReference f2159f;

    /* JADX INFO: renamed from: g */
    public static volatile String f2160g;

    /* JADX INFO: renamed from: h */
    public static volatile String f2161h;

    /* JADX INFO: renamed from: i */
    public static final ThreadLocal f2162i;

    static {
        Set setNewSetFromMap = Collections.newSetFromMap(new WeakHashMap());
        AbstractC0307g.m702d(setNewSetFromMap, "newSetFromMap(...)");
        f2158e = setNewSetFromMap;
        f2162i = ThreadLocal.withInitial(new C0681o0(0));
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m1754a(View view) {
        Set set = f2158e;
        if (set.contains(view)) {
            return true;
        }
        if (m1760g(view)) {
            m1762i(view);
            return true;
        }
        for (int i2 = 0; view != null && i2 < 6; i2++) {
            if (set.contains(view) || m1760g(view)) {
                m1762i(view);
                return true;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static final void m1755b() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - f2157d < 3000) {
            return;
        }
        f2157d = jCurrentTimeMillis;
        m1763j(false);
    }

    /* JADX INFO: renamed from: c */
    public static final void m1756c(Object obj) {
        View viewM1761h;
        View view;
        if (obj == null) {
            return;
        }
        WeakReference weakReference = f2159f;
        if (weakReference != null && (view = (View) weakReference.get()) != null) {
            m1762i(view);
            m1759f(view);
        }
        Object objM1757d = m1757d(obj);
        View viewM1761h2 = objM1757d == null ? null : m1761h(objM1757d);
        if (viewM1761h2 != null) {
            m1762i(viewM1761h2);
            m1759f(viewM1761h2);
        }
        try {
            Object objM1757d2 = m1757d(obj);
            if (objM1757d2 == null || (viewM1761h = m1761h(objM1757d2)) == null) {
                return;
            }
            m1762i(viewM1761h);
            m1759f(viewM1761h);
        } catch (Throwable th) {
            AbstractC0040p.m116u(th);
        }
    }

    /* JADX INFO: renamed from: d */
    public static Object m1757d(Object obj) {
        Object objM116u;
        Object objM116u2;
        String str = f2161h;
        if (str != null) {
            try {
                return AbstractC0358S.m920y(obj, str);
            } catch (Throwable th) {
                AbstractC0040p.m116u(th);
            }
        }
        C0172c c0172cM714c = AbstractC0317q.m714c(obj.getClass().getDeclaredFields());
        while (true) {
            if (!c0172cM714c.hasNext()) {
                C0172c c0172cM714c2 = AbstractC0317q.m714c(obj.getClass().getDeclaredFields());
                while (c0172cM714c2.hasNext()) {
                    Field field = (Field) c0172cM714c2.next();
                    field.setAccessible(true);
                    try {
                        objM116u = field.get(obj);
                    } catch (Throwable th2) {
                        objM116u = AbstractC0040p.m116u(th2);
                    }
                    if (objM116u instanceof C0140f) {
                        objM116u = null;
                    }
                    if (objM116u != null && AbstractC0433r.m1033H0(objM116u.getClass().getName(), "com.tencent.mm.ui.conversation.", false) && !(objM116u instanceof AbsListView)) {
                        Field[] declaredFields = objM116u.getClass().getDeclaredFields();
                        AbstractC0307g.m702d(declaredFields, "getDeclaredFields(...)");
                        for (Field field2 : declaredFields) {
                            if (LinearLayout.class.isAssignableFrom(field2.getType())) {
                                f2161h = field.getName();
                                return objM116u;
                            }
                        }
                    }
                }
                return null;
            }
            Field field3 = (Field) c0172cM714c.next();
            String name = field3.getType().getName();
            if (name.equals("com.tencent.mm.ui.conversation.l5") || AbstractC0433r.m1028C0(name, ".l5") || AbstractC0425j.m1005J0(name, "FolderHelper", false)) {
                field3.setAccessible(true);
                try {
                    objM116u2 = field3.get(obj);
                } catch (Throwable th3) {
                    objM116u2 = AbstractC0040p.m116u(th3);
                }
                Object obj2 = objM116u2 instanceof C0140f ? null : objM116u2;
                if (obj2 != null) {
                    f2161h = field3.getName();
                    return obj2;
                }
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public static View m1758e(ViewGroup viewGroup) {
        C0178i c0178i = new C0178i();
        c0178i.addLast(viewGroup);
        int i2 = 0;
        while ((!c0178i.isEmpty()) && i2 < 800) {
            i2++;
            View view = (View) c0178i.removeFirst();
            if (AbstractC0307g.m699a(m1764k(view), "lt5")) {
                return view;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup2 = (ViewGroup) view;
                int childCount = viewGroup2.getChildCount();
                for (int i3 = 0; i3 < childCount; i3++) {
                    View childAt = viewGroup2.getChildAt(i3);
                    if (childAt != null) {
                        c0178i.addLast(childAt);
                    }
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public static void m1759f(View view) {
        ThreadLocal threadLocal = f2162i;
        Object obj = threadLocal.get();
        Boolean bool = Boolean.TRUE;
        if (AbstractC0307g.m699a(obj, bool)) {
            return;
        }
        threadLocal.set(bool);
        try {
            if (view.getVisibility() != 8) {
                view.setVisibility(8);
            }
            if (view.getTranslationY() != 0.0f) {
                view.setTranslationY(0.0f);
            }
            if (view.getAlpha() != 0.0f) {
                view.setAlpha(0.0f);
            }
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null && layoutParams.height != 0) {
                layoutParams.height = 0;
                view.setLayoutParams(layoutParams);
            }
            if (view instanceof ViewGroup) {
                int childCount = ((ViewGroup) view).getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = ((ViewGroup) view).getChildAt(i2);
                    if (childAt != null) {
                        if (childAt.getVisibility() != 8) {
                            childAt.setVisibility(8);
                        }
                        if (childAt.getAlpha() != 0.0f) {
                            childAt.setAlpha(0.0f);
                        }
                    }
                }
            }
            threadLocal.set(Boolean.FALSE);
        } catch (Throwable th) {
            threadLocal.set(Boolean.FALSE);
            throw th;
        }
    }

    /* JADX INFO: renamed from: g */
    public static boolean m1760g(View view) {
        String strM1764k = m1764k(view);
        if (strM1764k == null) {
            return false;
        }
        if (strM1764k.equals("lt5")) {
            return true;
        }
        return AbstractC0425j.m1005J0(strM1764k, "fold", true) && ((view instanceof LinearLayout) || (view instanceof ViewGroup));
    }

    /* JADX INFO: renamed from: h */
    public static View m1761h(Object obj) {
        Object objM116u;
        Object next;
        Object objM116u2;
        Class<?> cls = obj.getClass();
        if (f2160g == null) {
            Iterator it = AbstractC0182m.m556h0("f200744h", "h", "foldBanner", "banner").iterator();
            while (it.hasNext()) {
                try {
                    objM116u2 = cls.getDeclaredField((String) it.next());
                } catch (Throwable th) {
                    objM116u2 = AbstractC0040p.m116u(th);
                }
                if (objM116u2 instanceof C0140f) {
                    objM116u2 = null;
                }
                Field field = (Field) objM116u2;
                if (field != null && (View.class.isAssignableFrom(field.getType()) || LinearLayout.class.isAssignableFrom(field.getType()))) {
                    field.setAccessible(true);
                    f2160g = field.getName();
                    m1765l("banner field=" + field.getName());
                    break;
                }
            }
            Field[] declaredFields = cls.getDeclaredFields();
            AbstractC0307g.m702d(declaredFields, "getDeclaredFields(...)");
            ArrayList arrayList = new ArrayList();
            for (Field field2 : declaredFields) {
                if (LinearLayout.class.isAssignableFrom(field2.getType()) || View.class.isAssignableFrom(field2.getType())) {
                    arrayList.add(field2);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                String name = ((Field) next).getName();
                AbstractC0307g.m702d(name, "getName(...)");
                String lowerCase = name.toLowerCase(Locale.ROOT);
                AbstractC0307g.m702d(lowerCase, "toLowerCase(...)");
                if (AbstractC0425j.m1005J0(lowerCase, "banner", false) || lowerCase.equals("h") || AbstractC0433r.m1028C0(lowerCase, "h") || AbstractC0425j.m1005J0(lowerCase, "fold", false) || lowerCase.equals("f200744h")) {
                    break;
                }
            }
            Field field3 = (Field) next;
            if (field3 == null) {
                field3 = (Field) (arrayList.size() == 1 ? arrayList.get(0) : null);
                if (field3 == null) {
                    field3 = (Field) AbstractC0181l.m544p0(arrayList);
                }
            }
            if (field3 != null) {
                field3.setAccessible(true);
                f2160g = field3.getName();
                m1765l("banner field=" + field3.getName());
            }
        }
        String str = f2160g;
        if (str == null) {
            return null;
        }
        try {
            Object objM920y = AbstractC0358S.m920y(obj, str);
            objM116u = objM920y instanceof View ? (View) objM920y : null;
        } catch (Throwable th2) {
            objM116u = AbstractC0040p.m116u(th2);
        }
        return (View) (objM116u instanceof C0140f ? null : objM116u);
    }

    /* JADX INFO: renamed from: i */
    public static void m1762i(View view) {
        f2159f = new WeakReference(view);
        f2158e.add(view);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = viewGroup.getChildAt(i2);
                if (childAt != null) {
                    f2158e.add(childAt);
                }
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m1763j(boolean z2) {
        View view;
        if (z2 || !f2156c) {
            f2156c = true;
            m1765l("enabled=true (always on)");
            WeakReference weakReference = f2159f;
            if (weakReference != null && (view = (View) weakReference.get()) != null) {
                m1759f(view);
            }
            Iterator it = f2158e.iterator();
            while (it.hasNext()) {
                m1759f((View) it.next());
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public static String m1764k(View view) {
        Object objM116u;
        try {
            objM116u = view.getId() == -1 ? null : view.getResources().getResourceEntryName(view.getId());
        } catch (Throwable th) {
            objM116u = AbstractC0040p.m116u(th);
        }
        return (String) (objM116u instanceof C0140f ? null : objM116u);
    }

    /* JADX INFO: renamed from: l */
    public static void m1765l(String str) {
        try {
            AbstractC0762d.m1954d("OKK-FoldBanner: " + str);
        } catch (Throwable th) {
            AbstractC0040p.m116u(th);
        }
    }
}
