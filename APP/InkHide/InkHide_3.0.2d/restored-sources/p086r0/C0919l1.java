package p086r0;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.AbsListView;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.p055lu.wxmask.MainHook;
import de.robv.android.xposed.XposedBridge;
import de.robv.android.xposed.callbacks.XC_LoadPackage;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONException;
import p001A0.AbstractC0039l;
import p001A0.C0025Z;
import p001A0.C0026a;
import p001A0.C0048u;
import p001A0.C0052y;
import p004C.C0060d;
import p006D.AbstractC0079h;
import p009E0.AbstractC0105e;
import p009E0.C0103c;
import p009E0.C0104d;
import p011F0.AbstractC0120h;
import p011F0.AbstractC0123k;
import p011F0.AbstractC0125m;
import p011F0.AbstractC0129q;
import p011F0.C0131s;
import p011F0.C0133u;
import p022L.AbstractC0174d;
import p025M0.InterfaceC0204l;
import p027N0.AbstractC0223g;
import p027N0.AbstractC0231o;
import p027N0.C0227k;
import p038T0.C0282g;
import p040U0.AbstractC0299i;
import p040U0.AbstractC0307q;
import p040U0.C0294d;
import p040U0.C0297g;
import p052b1.AbstractC0503h;
import p054c0.AbstractC0514f;
import p062e0.InterfaceC0551a;
import p070i0.AbstractC0731a;
import p081o0.C0780a;
import p081o0.C0781b;
import p084q0.C0808h;
import p102z0.AbstractC1126i;
import p102z0.AbstractC1135r;
import p102z0.C1124g;

/* JADX INFO: renamed from: r0.l1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0919l1 implements InterfaceC0551a {

    /* JADX INFO: renamed from: l */
    public static final C0297g f3262l = new C0297g("(?<![A-Za-z0-9_])([A-Za-z][A-Za-z0-9_\\-]{4,})(?![A-Za-z0-9_@\\-])");

    /* JADX INFO: renamed from: m */
    public static final C0297g f3263m = new C0297g("[A-Za-z][A-Za-z0-9_\\-]{4,}");

    /* JADX INFO: renamed from: n */
    public static final List f3264n = AbstractC0120h.m252Z(new Long[]{0L, 120L, 360L, 800L});

    /* JADX INFO: renamed from: o */
    public static final List f3265o;

    /* JADX INFO: renamed from: p */
    public static final C0913j1 f3266p;

    /* JADX INFO: renamed from: q */
    public static final C0913j1 f3267q;

    /* JADX INFO: renamed from: r */
    public static final C0913j1 f3268r;

    /* JADX INFO: renamed from: s */
    public static final C0913j1 f3269s;

    /* JADX INFO: renamed from: a */
    public boolean f3270a;

    /* JADX INFO: renamed from: b */
    public final Set f3271b = Collections.newSetFromMap(new WeakHashMap());

    /* JADX INFO: renamed from: c */
    public final Set f3272c = Collections.synchronizedSet(new LinkedHashSet());

    /* JADX INFO: renamed from: d */
    public final Set f3273d = Collections.newSetFromMap(new WeakHashMap());

    /* JADX INFO: renamed from: e */
    public final Map f3274e = Collections.synchronizedMap(new WeakHashMap());

    /* JADX INFO: renamed from: f */
    public final Map f3275f = Collections.synchronizedMap(new LinkedHashMap());

    /* JADX INFO: renamed from: g */
    public final Map f3276g = Collections.synchronizedMap(new LinkedHashMap());

    /* JADX INFO: renamed from: h */
    public final ThreadLocal f3277h = new ThreadLocal();

    /* JADX INFO: renamed from: i */
    public final Set f3278i = Collections.synchronizedSet(new LinkedHashSet());

    /* JADX INFO: renamed from: j */
    public Context f3279j;

    /* JADX INFO: renamed from: k */
    public C0025Z f3280k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        Boolean bool = Boolean.FALSE;
        f3265o = AbstractC0079h.m167E(new C0103c(0L, bool));
        f3266p = new C0913j1(AbstractC0079h.m175T("xs1.s2"), AbstractC0079h.m175T("xs1.c"), AbstractC0079h.m175T("trf"), AbstractC0079h.m167E("C7"));
        f3267q = new C0913j1(AbstractC0079h.m175T("bu1.s2"), AbstractC0079h.m175T("bu1.c"), AbstractC0079h.m175T("tsy"), AbstractC0079h.m167E("I7"));
        Set setM175T = AbstractC0079h.m175T("zu1.u2");
        Set setM175T2 = AbstractC0079h.m175T("zu1.c");
        Set setM263k0 = AbstractC0120h.m263k0(new String[]{"trf", "tsy"});
        List listM167E = AbstractC0079h.m167E("N7");
        List listM252Z = AbstractC0120h.m252Z(new Long[]{0L, 120L, 360L, 800L, 1500L, 3000L});
        C0103c c0103c = new C0103c(0L, bool);
        C0103c c0103c2 = new C0103c(80L, bool);
        Boolean bool2 = Boolean.TRUE;
        f3268r = new C0913j1(setM175T, setM175T2, setM263k0, listM167E, listM252Z, AbstractC0120h.m252Z(new C0103c[]{c0103c, c0103c2, new C0103c(220L, bool2)}));
        f3269s = new C0913j1(AbstractC0079h.m175T("cw1.u2"), AbstractC0079h.m175T("cw1.c"), AbstractC0120h.m263k0(new String[]{"trf", "tsy"}), AbstractC0079h.m167E("m7"), AbstractC0120h.m252Z(new Long[]{0L, 120L, 360L, 800L, 1500L, 3000L}), AbstractC0120h.m252Z(new C0103c[]{new C0103c(0L, bool), new C0103c(80L, bool), new C0103c(220L, bool2)}));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: A */
    public static boolean m1999A(Activity activity) {
        String name = activity.getClass().getName();
        return name.equals("com.tencent.mm.ui.vas.VASCommonActivity") || AbstractC0299i.m511i0(name, "CleanChatting", true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: B */
    public static boolean m2000B(AbsListView absListView) {
        Activity activityM2013k = m2013k(absListView.getContext());
        if (activityM2013k == null) {
            return false;
        }
        return m1999A(activityM2013k);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: C */
    public static boolean m2001C(AbsListView absListView) {
        Activity activityM2013k;
        boolean z2 = AbstractC1126i.f3786a;
        if (C1124g.m2413D() && (activityM2013k = m2013k(absListView.getContext())) != null && activityM2013k.getClass().getName().equals("com.tencent.mm.ui.vas.VASCommonActivity")) {
            return m2019z(absListView);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: D */
    public static boolean m2002D(String str) {
        if (AbstractC0307q.m534d0(str) || AbstractC0299i.m511i0(str, "@chatroom", true)) {
            return false;
        }
        return AbstractC0307q.m538h0(str, true, "wxid_") || AbstractC0307q.m538h0(str, true, "gh_") || f3263m.m504d(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: H */
    public static String m2003H(Method method) {
        String name = method.getDeclaringClass().getName();
        String name2 = method.getName();
        Class<?>[] parameterTypes = method.getParameterTypes();
        AbstractC0223g.m417d(parameterTypes, "getParameterTypes(...)");
        return name + "#" + name2 + "(" + AbstractC0120h.m260h0(parameterTypes, ",", new C0863P(28), 30) + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: J */
    public static void m2004J(View view) {
        view.setVisibility(0);
        view.setAlpha(1.0f);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = null;
        } else if (layoutParams.height == 0) {
            layoutParams.height = -2;
        }
        view.setLayoutParams(layoutParams);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = viewGroup.getChildAt(i2);
                AbstractC0223g.m417d(childAt, "getChildAt(...)");
                m2004J(childAt);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: M */
    public static boolean m2005M(Activity activity, View view) {
        return (view == null || !m1999A(activity) || activity.isFinishing()) ? false : true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final boolean m2006a(C0919l1 c0919l1, View view) {
        c0919l1.getClass();
        return m2012g(view, "odf") || m2012g(view, "cut") || m2012g(view, "mie") || m2012g(view, "bxc");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static final void m2007b(C0919l1 c0919l1, AbsListView absListView, View view) {
        c0919l1.getClass();
        if (m2019z(absListView)) {
            if (!m2001C(absListView)) {
                c0919l1.m2024K(view);
                return;
            }
            c0919l1.m2022G((ListAdapter) absListView.getAdapter());
            if (view != absListView) {
                c0919l1.m2024K(view);
                return;
            }
            int childCount = absListView.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = absListView.getChildAt(i2);
                if (childAt != null) {
                    c0919l1.m2024K(childAt);
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static final void m2008c(C0919l1 c0919l1, Activity activity) {
        View decorView;
        c0919l1.getClass();
        Window window = activity.getWindow();
        if (window == null || (decorView = window.getDecorView()) == null || !m2005M(activity, decorView)) {
            return;
        }
        Iterator it = AbstractC0120h.m252Z(new Long[]{0L, 120L, 360L, 800L, 1500L}).iterator();
        while (it.hasNext()) {
            decorView.postDelayed(new RunnableC0904g1(activity, c0919l1, 2), ((Number) it.next()).longValue());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static final void m2009d(C0919l1 c0919l1, Activity activity) {
        Window window;
        View decorView;
        c0919l1.getClass();
        if (m1999A(activity) && (window = activity.getWindow()) != null && (decorView = window.getDecorView()) != null && m2005M(activity, decorView)) {
            Iterator it = AbstractC0120h.m252Z(new Long[]{0L, 200L, 600L, 1200L, 2500L, 5000L, 8000L}).iterator();
            while (it.hasNext()) {
                decorView.postDelayed(new RunnableC0904g1(c0919l1, activity, 1), ((Number) it.next()).longValue());
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static ArrayList m2010e(Class cls) {
        ArrayList arrayList = new ArrayList();
        while (cls != null && !cls.equals(Object.class)) {
            arrayList.add(cls);
            cls = cls.getSuperclass();
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static void m2011f(View view, String str, ArrayList arrayList) {
        if (AbstractC0223g.m414a(m2018p(view), str)) {
            arrayList.add(view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = viewGroup.getChildAt(i2);
                AbstractC0223g.m417d(childAt, "getChildAt(...)");
                m2011f(childAt, str, arrayList);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static boolean m2012g(View view, String str) {
        if (AbstractC0223g.m414a(m2018p(view), str)) {
            return true;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = viewGroup.getChildAt(i2);
                AbstractC0223g.m417d(childAt, "getChildAt(...)");
                if (m2012g(childAt, str)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public static Activity m2013k(Context context) {
        while (!(context instanceof Activity)) {
            if (!(context instanceof ContextWrapper)) {
                return null;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return (Activity) context;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public static Method m2014l(Map map, Object obj) {
        Object next;
        Method method = (Method) map.get(obj.getClass());
        if (method != null) {
            return method;
        }
        Iterator it = map.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((Class) ((Map.Entry) next).getKey()).isAssignableFrom(obj.getClass())) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return (Method) entry.getValue();
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Duplicate block (B:5:0x000c) to fix multi-entry loop: BACK_EDGE: B:5:0x000c -> B:6:0x000d */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x000d, code lost:
    
        r0 = null;
     */
    /* JADX INFO: renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static View m2015m(TextView textView, View view) {
        View view2;
        Object parent = textView.getParent();
        if (parent instanceof View) {
            view2 = (View) parent;
            while (view2 != null && view2 != view) {
                int width = view2.getWidth();
                int height = view2.getHeight();
                if (view2.isClickable() || (width >= view.getWidth() * 0.6f && 80 <= height && height < 261)) {
                    return view2;
                }
                Object parent2 = view2.getParent();
                if (parent2 instanceof View) {
                    view2 = (View) parent2;
                }
            }
            Object parent3 = textView.getParent();
            View view3 = parent3 instanceof View ? (View) parent3 : null;
            return view3 == null ? textView : view3;
        }
        view2 = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public static void m2016n(View view, InterfaceC0204l interfaceC0204l) {
        if (view instanceof TextView) {
            interfaceC0204l.mo8c(view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = viewGroup.getChildAt(i2);
                AbstractC0223g.m417d(childAt, "getChildAt(...)");
                m2016n(childAt, interfaceC0204l);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public static Set m2017o() {
        boolean z2 = AbstractC1126i.f3786a;
        Iterable<String> arrayList = !C1124g.m2443s() ? C0131s.f426a : new ArrayList(((C0808h) AbstractC0503h.m988u(C0808h.class)).f2684a);
        ArrayList arrayList2 = new ArrayList();
        for (String str : arrayList) {
            String string = str != null ? AbstractC0299i.m507C0(str).toString() : null;
            if (string != null) {
                arrayList2.add(string);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : arrayList2) {
            if (!AbstractC0307q.m534d0((String) obj)) {
                arrayList3.add(obj);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : arrayList3) {
            boolean z3 = AbstractC1126i.f3786a;
            if (!C1124g.m2429e((String) obj2)) {
                arrayList4.add(obj2);
            }
        }
        return AbstractC0123k.m265B0(arrayList4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public static String m2018p(View view) {
        Object c0104d;
        int id = view.getId();
        if (id == -1) {
            return null;
        }
        try {
            c0104d = view.getResources().getResourceEntryName(id);
        } catch (Throwable th) {
            c0104d = new C0104d(th);
        }
        return (String) (c0104d instanceof C0104d ? null : c0104d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: z */
    public static boolean m2019z(AbsListView absListView) {
        return AbstractC0223g.m414a(m2018p(absListView), "i3p") || m2012g(absListView, "odf") || m2012g(absListView, "cut");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: E */
    public final void m2020E(Object obj) throws JSONException {
        if (obj == null) {
            return;
        }
        String name = obj.getClass().getName();
        if (m2037y(obj)) {
            return;
        }
        Class<?> cls = obj.getClass();
        String name2 = cls.getName();
        Set setM2029q = m2029q();
        ArrayList arrayList = new ArrayList(AbstractC0125m.m289c0(setM2029q));
        Iterator it = setM2029q.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC0299i.m528z0((String) it.next()));
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (!AbstractC0307q.m534d0((String) obj2)) {
                arrayList2.add(obj2);
            }
        }
        if (AbstractC0123k.m265B0(arrayList2).contains(AbstractC0299i.m528z0(name2))) {
            ArrayList arrayListM2010e = m2010e(cls);
            if (arrayListM2010e.isEmpty()) {
                return;
            }
            Iterator it2 = arrayListM2010e.iterator();
            while (it2.hasNext()) {
                Field[] declaredFields = ((Class) it2.next()).getDeclaredFields();
                AbstractC0223g.m417d(declaredFields, "getDeclaredFields(...)");
                for (Field field : declaredFields) {
                    if (!Modifier.isStatic(field.getModifiers()) && AbstractC0223g.m414a(field.getType(), String.class)) {
                        C0025Z c0025z = this.f3280k;
                        List list = c0025z != null ? c0025z.f199c : null;
                        if (list == null) {
                            list = C0131s.f426a;
                        }
                        if (AbstractC0123k.m281w0(AbstractC0123k.m264A0(AbstractC0123k.m272n0(list, "a"))).contains(field.getName())) {
                            C0025Z c0025z2 = this.f3280k;
                            if (c0025z2 == null) {
                                return;
                            }
                            C0025Z c0025zM5a = C0025Z.m5a(c0025z2, AbstractC0123k.m281w0(AbstractC0123k.m264A0(AbstractC0123k.m272n0(c0025z2.f198b, name))), null, 61);
                            this.f3280k = c0025zM5a;
                            this.f3274e.clear();
                            Context context = this.f3279j;
                            if (context != null) {
                                AbstractC0039l.m87y(context, c0025zM5a);
                                return;
                            }
                            return;
                        }
                    }
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: F */
    public final void m2021F(Activity activity, View view) {
        Set set;
        ArrayList arrayList = new ArrayList();
        m2016n(view, new C0780a(this, arrayList, view, 2));
        List listM281w0 = AbstractC0123k.m281w0(AbstractC0123k.m264A0(arrayList));
        ArrayList arrayList2 = new ArrayList();
        Iterator it = listM281w0.iterator();
        while (it.hasNext()) {
            String strM2018p = m2018p((View) it.next());
            if (strM2018p != null) {
                arrayList2.add(strM2018p);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : arrayList2) {
            if (!AbstractC0307q.m534d0((String) obj)) {
                arrayList3.add(obj);
            }
        }
        List listM281w02 = AbstractC0123k.m281w0(AbstractC0123k.m264A0(arrayList3));
        if (listM281w02.isEmpty()) {
            return;
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it2 = listM281w02.iterator();
        while (true) {
            boolean zHasNext = it2.hasNext();
            set = this.f3278i;
            if (!zHasNext) {
                break;
            }
            Object next = it2.next();
            String str = (String) next;
            if (!set.contains(str)) {
                C0025Z c0025z = this.f3280k;
                List list = c0025z != null ? c0025z.f201e : null;
                if (list == null) {
                    list = C0131s.f426a;
                }
                if (!list.contains(str)) {
                    arrayList4.add(next);
                }
            }
        }
        if (arrayList4.isEmpty()) {
            return;
        }
        set.addAll(arrayList4);
        C0025Z c0025z2 = this.f3280k;
        if (c0025z2 == null) {
            return;
        }
        C0025Z c0025zM5a = C0025Z.m5a(c0025z2, null, AbstractC0123k.m281w0(AbstractC0123k.m264A0(AbstractC0123k.m273o0(c0025z2.f201e, arrayList4))), 47);
        this.f3280k = c0025zM5a;
        Context applicationContext = activity.getApplicationContext();
        AbstractC0223g.m417d(applicationContext, "getApplicationContext(...)");
        AbstractC0039l.m87y(applicationContext, c0025zM5a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: G */
    public final void m2022G(ListAdapter listAdapter) {
        if (listAdapter == null) {
            return;
        }
        if (m2029q().contains(listAdapter.getClass().getName())) {
            boolean zAdd = this.f3273d.add(listAdapter);
            this.f3274e.remove(listAdapter);
            m2034v(listAdapter);
            boolean zM2027i = m2027i(listAdapter);
            if (zAdd || zM2027i) {
                try {
                    AbstractC0514f.f1622b.mo1012c(listAdapter, "notifyDataSetChanged", new Object[0]);
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: I */
    public final void m2023I(Object obj) {
        List<C0103c> list;
        Object c0104d;
        if (obj == null) {
            return;
        }
        Class<?> cls = obj.getClass();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Field[] declaredFields = cls.getDeclaredFields();
        AbstractC0223g.m417d(declaredFields, "getDeclaredFields(...)");
        for (Field field : declaredFields) {
            try {
                field.setAccessible(true);
                Object obj2 = field.get(obj);
                if (obj2 != null) {
                    if (obj2 instanceof AbsListView) {
                        arrayList2.add(obj2);
                        ListAdapter listAdapter = (ListAdapter) ((AbsListView) obj2).getAdapter();
                        if (listAdapter != null) {
                            arrayList.add(listAdapter);
                        }
                    } else if (obj2 instanceof AdapterView) {
                        Adapter adapter = ((AdapterView) obj2).getAdapter();
                        if (adapter != null) {
                            arrayList.add(adapter);
                        }
                    } else if (obj2 instanceof ListAdapter) {
                        arrayList.add(obj2);
                    } else {
                        Method[] methods = obj2.getClass().getMethods();
                        AbstractC0223g.m417d(methods, "getMethods(...)");
                        int length = methods.length;
                        int i2 = 0;
                        while (true) {
                            if (i2 >= length) {
                                obj2 = null;
                                break;
                            } else if (AbstractC0223g.m414a(methods[i2].getName(), "notifyDataSetChanged")) {
                                break;
                            } else {
                                i2++;
                            }
                        }
                        if (obj2 != null) {
                            arrayList.add(obj2);
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : arrayList) {
            if (hashSet.add(Integer.valueOf(System.identityHashCode(obj3)))) {
                arrayList3.add(obj3);
            }
        }
        Iterator it = arrayList3.iterator();
        while (it.hasNext()) {
            try {
                c0104d = AbstractC0514f.f1622b.mo1012c(it.next(), "notifyDataSetChanged", new Object[0]);
            } catch (Throwable th) {
                c0104d = new C0104d(th);
            }
            Throwable thM246a = AbstractC0105e.m246a(c0104d);
            if (thM246a != null) {
                AbstractC0731a.m1387d("hide storage chat history adapter refresh fail", thM246a);
            }
        }
        HashSet hashSet2 = new HashSet();
        ArrayList<AbsListView> arrayList4 = new ArrayList();
        for (Object obj4 : arrayList2) {
            if (hashSet2.add(Integer.valueOf(System.identityHashCode((AbsListView) obj4)))) {
                arrayList4.add(obj4);
            }
        }
        for (AbsListView absListView : arrayList4) {
            if (m2000B(absListView)) {
                C0913j1 c0913j1M2129a = C0951w0.m2129a();
                if (c0913j1M2129a == null || (list = c0913j1M2129a.f3239f) == null) {
                    list = f3265o;
                }
                for (C0103c c0103c : list) {
                    absListView.postDelayed(new RunnableC0910i1(this, absListView, ((Boolean) c0103c.f395b).booleanValue(), 0), ((Number) c0103c.f394a).longValue());
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: K */
    public final void m2024K(View view) {
        if (this.f3271b.remove(view)) {
            view.setVisibility(0);
            view.setAlpha(1.0f);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = null;
            } else if (layoutParams.height == 0) {
                layoutParams.height = -2;
            }
            view.setLayoutParams(layoutParams);
            view.requestLayout();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: L */
    public final boolean m2025L(Object obj, Set set) throws JSONException {
        Object c0104d;
        String string;
        Object obj2 = null;
        if (obj != null) {
            m2020E(obj);
            if (m2037y(obj)) {
                C0025Z c0025z = this.f3280k;
                List list = c0025z != null ? c0025z.f199c : null;
                if (list == null) {
                    list = C0131s.f426a;
                }
                Iterator it = AbstractC0123k.m281w0(AbstractC0123k.m264A0(AbstractC0123k.m272n0(list, "a"))).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    try {
                        c0104d = (String) AbstractC0514f.f1622b.mo1015f(obj, (String) it.next());
                    } catch (Throwable th) {
                        c0104d = new C0104d(th);
                    }
                    if (c0104d instanceof C0104d) {
                        c0104d = null;
                    }
                    String str = (String) c0104d;
                    if (str != null && (string = AbstractC0299i.m507C0(str).toString()) != null) {
                        if (AbstractC0307q.m534d0(string)) {
                            string = null;
                        }
                        if (string != null) {
                            obj2 = string;
                            break;
                        }
                    }
                }
            }
        }
        if (obj2 == null) {
            return false;
        }
        return set.contains(obj2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00bf  */
    /* JADX INFO: renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m2026h(Object obj) {
        String string;
        String string2;
        Object c0104d;
        boolean z2 = AbstractC1126i.f3786a;
        if (C1124g.m2413D() && obj != null) {
            ArrayList arrayListM266h0 = AbstractC0123k.m266h0(!C1124g.m2443s() ? C0131s.f426a : new ArrayList(((C0808h) AbstractC0503h.m988u(C0808h.class)).f2684a));
            ArrayList arrayList = new ArrayList(AbstractC0125m.m289c0(arrayListM266h0));
            Iterator it = arrayListM266h0.iterator();
            while (it.hasNext()) {
                arrayList.add(AbstractC0299i.m507C0((String) it.next()).toString());
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : arrayList) {
                if (!AbstractC0307q.m534d0((String) obj2)) {
                    arrayList2.add(obj2);
                }
            }
            Set setM265B0 = AbstractC0123k.m265B0(arrayList2);
            if (!setM265B0.isEmpty()) {
                Field[] declaredFields = obj.getClass().getDeclaredFields();
                AbstractC0223g.m417d(declaredFields, "getDeclaredFields(...)");
                int length = declaredFields.length;
                int i2 = 0;
                boolean z3 = false;
                while (true) {
                    if (i2 >= length) {
                        break;
                    }
                    Field field = declaredFields[i2];
                    if (!Modifier.isStatic(field.getModifiers())) {
                        try {
                            field.setAccessible(true);
                            c0104d = field.get(obj);
                        } catch (Throwable th) {
                            c0104d = new C0104d(th);
                        }
                        Object obj3 = c0104d instanceof C0104d ? null : c0104d;
                        if (obj3 != null) {
                            if (obj3 instanceof ListAdapter) {
                                if (m2027i(obj3)) {
                                    z3 = true;
                                }
                            } else if (obj3 instanceof AdapterView) {
                                Adapter adapter = ((AdapterView) obj3).getAdapter();
                                if (!(adapter instanceof ListAdapter) || !m2027i(adapter)) {
                                }
                            }
                        }
                    }
                    i2++;
                }
                ArrayList<Map> arrayList3 = new ArrayList();
                Class<?> cls = obj.getClass();
                Iterator it2 = AbstractC0079h.m167E("Q").iterator();
                while (it2.hasNext()) {
                    try {
                        Field declaredField = cls.getDeclaredField((String) it2.next());
                        declaredField.setAccessible(true);
                        Object obj4 = declaredField.get(obj);
                        Map map = AbstractC0231o.m427c(obj4) ? (Map) obj4 : null;
                        if (map != null) {
                            arrayList3.add(map);
                        }
                    } catch (Throwable unused) {
                    }
                }
                if (arrayList3.isEmpty()) {
                    Field[] declaredFields2 = cls.getDeclaredFields();
                    AbstractC0223g.m417d(declaredFields2, "getDeclaredFields(...)");
                    for (Field field2 : declaredFields2) {
                        try {
                            field2.setAccessible(true);
                            Object obj5 = field2.get(obj);
                            Map map2 = AbstractC0231o.m427c(obj5) ? (Map) obj5 : null;
                            if (map2 != null) {
                                if (map2.isEmpty()) {
                                    map2 = null;
                                }
                                if (map2 != null) {
                                    arrayList3.add(map2);
                                }
                            }
                        } catch (Throwable unused2) {
                        }
                    }
                    HashSet hashSet = new HashSet();
                    ArrayList arrayList4 = new ArrayList();
                    for (Object obj6 : arrayList3) {
                        if (hashSet.add(Integer.valueOf(System.identityHashCode((Map) obj6)))) {
                            arrayList4.add(obj6);
                        }
                    }
                    arrayList3 = arrayList4;
                }
                for (Map map3 : arrayList3) {
                    Set setKeySet = map3.keySet();
                    ArrayList arrayList5 = new ArrayList();
                    for (Object obj7 : setKeySet) {
                        if (obj7 != null && (string = obj7.toString()) != null && (string2 = AbstractC0299i.m507C0(string).toString()) != null && !AbstractC0307q.m534d0(string2) && !AbstractC0299i.m511i0(string2, "@chatroom", true)) {
                            LinkedHashSet linkedHashSet = new LinkedHashSet();
                            if (m2002D(string2)) {
                                linkedHashSet.add(string2);
                            }
                            C0282g c0282g = new C0282g(C0297g.m501c(f3262l, string2));
                            while (c0282g.hasNext()) {
                                C0294d c0294d = (C0294d) c0282g.next();
                                String strGroup = (String) AbstractC0123k.m269k0(c0294d.m500a(), 1);
                                if (strGroup == null) {
                                    strGroup = c0294d.f670a.group();
                                    AbstractC0223g.m417d(strGroup, "group(...)");
                                } else {
                                    if (AbstractC0307q.m534d0(strGroup)) {
                                        strGroup = null;
                                    }
                                    if (strGroup == null) {
                                    }
                                }
                                if (m2002D(strGroup)) {
                                    linkedHashSet.add(strGroup);
                                }
                            }
                            if (!linkedHashSet.isEmpty()) {
                                Iterator it3 = linkedHashSet.iterator();
                                while (true) {
                                    if (!it3.hasNext()) {
                                        break;
                                    }
                                    if (setM265B0.contains((String) it3.next())) {
                                        arrayList5.add(obj7);
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    Iterator it4 = arrayList5.iterator();
                    while (it4.hasNext()) {
                        map3.remove(it4.next());
                        z3 = true;
                    }
                }
                return z3;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:242:0x0382 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v14, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Iterable, java.util.List] */
    @Override // p062e0.InterfaceC0551a
    public final void handleHook(Context context, XC_LoadPackage.LoadPackageParam loadPackageParam) {
        ?? arrayList;
        int i2 = 1;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            applicationContext = context;
        }
        this.f3279j = applicationContext;
        this.f3280k = AbstractC0039l.m76n(context);
        CopyOnWriteArrayList copyOnWriteArrayList = C0052y.f291a;
        C0052y.m98c(context, new C0048u("storage_chat_history", "存储空间聊天记录隐藏", new C0863P(27), new C0907h1(this), new C0907h1(this), new C0026a(16)));
        boolean z2 = AbstractC1126i.f3786a;
        String strM355k = AbstractC0174d.m355k("enabled=", C1124g.m2413D());
        String strM355k2 = AbstractC0174d.m355k("cached=", this.f3280k != null);
        String strM355k3 = AbstractC0174d.m355k("support=", (C0951w0.m2129a() == null && this.f3280k == null) ? false : true);
        C0025Z c0025z = this.f3280k;
        List list = c0025z != null ? c0025z.f197a : null;
        List<String> list2 = C0131s.f426a;
        AbstractC0731a.m1384a("hide storage handleHook", strM355k, strM355k2, strM355k3, "adapters=".concat(AbstractC0123k.m271m0(list == null ? list2 : list, "|", null, null, null, 62)));
        if (C0951w0.m2129a() == null && this.f3280k == null) {
            return;
        }
        if (!this.f3270a) {
            Context applicationContext2 = context.getApplicationContext();
            Application application = applicationContext2 instanceof Application ? (Application) applicationContext2 : null;
            if (application != null) {
                this.f3270a = true;
                application.registerActivityLifecycleCallbacks(new C0911j(this, 3));
            }
        }
        Class clsMo1021l = AbstractC0514f.f1622b.mo1021l(context.getClassLoader(), "com.tencent.mm.ui.vas.VASCommonActivity");
        if (clsMo1021l != null && !MainHook.uniqueMetaStore.contains("hide-storage-vas-common-activity")) {
            Method methodMo1011b = AbstractC0514f.f1622b.mo1011b(clsMo1021l, "onResume", new Object[0]);
            if (methodMo1011b != null) {
                AbstractC0514f.m1027d(methodMo1011b, new C0916k1(this, 9));
            }
            Method methodMo1011b2 = AbstractC0514f.f1622b.mo1011b(clsMo1021l, "onWindowFocusChanged", Boolean.TYPE);
            if (methodMo1011b2 != null) {
                AbstractC0514f.m1027d(methodMo1011b2, new C0916k1(this, 10));
            }
            MainHook.uniqueMetaStore.add("hide-storage-vas-common-activity");
        }
        if (!MainHook.uniqueMetaStore.contains("hide-storage-viewgroup-addview")) {
            Method[] declaredMethods = ViewGroup.class.getDeclaredMethods();
            AbstractC0223g.m417d(declaredMethods, "getDeclaredMethods(...)");
            ArrayList arrayList2 = new ArrayList();
            for (Method method : declaredMethods) {
                if (AbstractC0223g.m414a(method.getName(), "addView")) {
                    Class<?>[] parameterTypes = method.getParameterTypes();
                    AbstractC0223g.m417d(parameterTypes, "getParameterTypes(...)");
                    if (parameterTypes.length == 0) {
                        continue;
                    } else {
                        Class<?>[] parameterTypes2 = method.getParameterTypes();
                        AbstractC0223g.m417d(parameterTypes2, "getParameterTypes(...)");
                        if (parameterTypes2.length == 0) {
                            throw new NoSuchElementException("Array is empty.");
                        }
                        if (View.class.isAssignableFrom(parameterTypes2[0])) {
                            arrayList2.add(method);
                        }
                    }
                }
            }
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                AbstractC0514f.m1027d((Method) it.next(), new C0916k1(this, 8));
            }
            MainHook.uniqueMetaStore.add("hide-storage-viewgroup-addview");
        }
        if (!MainHook.uniqueMetaStore.contains("hide-storage-abslistview")) {
            Method[] declaredMethods2 = AbsListView.class.getDeclaredMethods();
            AbstractC0223g.m417d(declaredMethods2, "getDeclaredMethods(...)");
            ArrayList arrayList3 = new ArrayList();
            int length = declaredMethods2.length;
            int i3 = 0;
            while (i3 < length) {
                Method method2 = declaredMethods2[i3];
                int i4 = i2;
                if (AbstractC0223g.m414a(method2.getName(), "obtainView") && method2.getParameterTypes().length == 2 && AbstractC0223g.m414a(method2.getParameterTypes()[0], Integer.TYPE) && AbstractC0223g.m414a(method2.getParameterTypes()[i4], boolean[].class)) {
                    arrayList3.add(method2);
                }
                i3++;
                i2 = i4;
            }
            int i5 = i2;
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                AbstractC0514f.m1027d((Method) it2.next(), new C0916k1(this, 0));
            }
            Method methodMo1011b3 = AbstractC0514f.f1622b.mo1011b(AbsListView.class, "layoutChildren", new Object[0]);
            if (methodMo1011b3 != null) {
                AbstractC0514f.m1027d(methodMo1011b3, new C0916k1(this, i5));
            }
            MainHook.uniqueMetaStore.add("hide-storage-abslistview");
        }
        if (!MainHook.uniqueMetaStore.contains("hide-storage-adapter-attach")) {
            Iterator it3 = AbstractC0120h.m252Z(new Class[]{AdapterView.class, AbsListView.class, ListView.class}).iterator();
            while (it3.hasNext()) {
                Method[] declaredMethods3 = ((Class) it3.next()).getDeclaredMethods();
                AbstractC0223g.m417d(declaredMethods3, "getDeclaredMethods(...)");
                ArrayList arrayList4 = new ArrayList();
                for (Method method3 : declaredMethods3) {
                    if (AbstractC0223g.m414a(method3.getName(), "setAdapter") && method3.getParameterTypes().length == 1 && ListAdapter.class.isAssignableFrom(method3.getParameterTypes()[0])) {
                        arrayList4.add(method3);
                    }
                }
                Iterator it4 = arrayList4.iterator();
                while (it4.hasNext()) {
                    AbstractC0514f.m1027d((Method) it4.next(), new C0916k1(this, 3));
                }
            }
            MainHook.uniqueMetaStore.add("hide-storage-adapter-attach");
        }
        Class clsMo1021l2 = AbstractC0514f.f1622b.mo1021l(context.getClassLoader(), "com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingNewUI");
        if (clsMo1021l2 == null) {
            AbstractC0731a.m1387d("hide storage chat history class missing", "com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingNewUI");
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            C0025Z c0025z2 = this.f3280k;
            List list3 = c0025z2 != null ? c0025z2.f200d : null;
            if (list3 == null) {
                list3 = list2;
            }
            C0913j1 c0913j1M2129a = C0951w0.m2129a();
            List list4 = c0913j1M2129a != null ? c0913j1M2129a.f3237d : null;
            if (list4 == null) {
                list4 = list2;
            }
            Iterator it5 = AbstractC1135r.m2477E("storage", "refreshMethods", AbstractC0123k.m273o0(list3, list4)).iterator();
            while (it5.hasNext()) {
                Method methodMo1011b4 = AbstractC0514f.f1622b.mo1011b(clsMo1021l2, (String) it5.next(), new Object[0]);
                if (methodMo1011b4 != null) {
                    linkedHashSet.add(methodMo1011b4);
                }
            }
            if (linkedHashSet.isEmpty()) {
                Method[] declaredMethods4 = clsMo1021l2.getDeclaredMethods();
                AbstractC0223g.m417d(declaredMethods4, "getDeclaredMethods(...)");
                ArrayList arrayList5 = new ArrayList();
                for (Method method4 : declaredMethods4) {
                    Class<?>[] parameterTypes3 = method4.getParameterTypes();
                    AbstractC0223g.m417d(parameterTypes3, "getParameterTypes(...)");
                    if (parameterTypes3.length == 0 && AbstractC0223g.m414a(method4.getReturnType(), Void.TYPE) && !Modifier.isStatic(method4.getModifiers())) {
                        arrayList5.add(method4);
                    }
                }
                arrayList = new ArrayList();
                for (Object obj : arrayList5) {
                    Method method5 = (Method) obj;
                    if (method5.getName().length() <= 3) {
                        String name = method5.getName();
                        AbstractC0223g.m417d(name, "getName(...)");
                        Character chM514l0 = AbstractC0299i.m514l0(name);
                        if (chM514l0 != null && Character.isLetterOrDigit(chM514l0.charValue())) {
                            arrayList.add(obj);
                        }
                    }
                }
            } else {
                arrayList = AbstractC0123k.m281w0(linkedHashSet);
            }
            if (arrayList.isEmpty()) {
                AbstractC0731a.m1387d("hide storage chat history method missing", clsMo1021l2.getName());
            } else {
                for (Method method6 : arrayList) {
                    String strM352h = AbstractC0174d.m352h("hide-storage-chat-history-", m2003H(method6));
                    if (!MainHook.uniqueMetaStore.contains(strM352h)) {
                        AbstractC0514f.m1027d(method6, new C0830D0(this, 1));
                        AbstractC0731a.m1384a("hide storage hook clean refresh", m2003H(method6));
                        MainHook.uniqueMetaStore.add(strM352h);
                    }
                }
            }
        }
        C0025Z c0025z3 = this.f3280k;
        List list5 = c0025z3 != null ? c0025z3.f202f : null;
        if (list5 != null) {
            list2 = list5;
        }
        for (String str : list2) {
            Class clsMo1021l3 = AbstractC0514f.f1622b.mo1021l(context.getClassLoader(), str);
            if (clsMo1021l3 != null) {
                String strM352h2 = AbstractC0174d.m352h("hide-storage-file-sort-activity-", str);
                if (!MainHook.uniqueMetaStore.contains(strM352h2)) {
                    Method methodMo1011b5 = AbstractC0514f.f1622b.mo1011b(clsMo1021l3, "onCreate", Bundle.class);
                    if (methodMo1011b5 != null) {
                        AbstractC0514f.m1027d(methodMo1011b5, new C0916k1(this, 6));
                    }
                    Method methodMo1011b6 = AbstractC0514f.f1622b.mo1011b(clsMo1021l3, "onResume", new Object[0]);
                    if (methodMo1011b6 != null) {
                        AbstractC0514f.m1027d(methodMo1011b6, new C0916k1(this, 7));
                    }
                    MainHook.uniqueMetaStore.add(strM352h2);
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public final boolean m2027i(Object obj) {
        if (m2029q().contains(obj.getClass().getName())) {
            Set setM2017o = m2017o();
            if (!setM2017o.isEmpty()) {
                Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap());
                AbstractC0223g.m417d(setNewSetFromMap, "newSetFromMap(...)");
                boolean zM2028j = m2028j(obj, setM2017o, setNewSetFromMap, 0);
                if (zM2028j) {
                    this.f3274e.remove(obj);
                }
                return zM2028j;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:50:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a2  */
    /* JADX INFO: renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m2028j(Object obj, Set set, Set set2, int i2) {
        Object c0104d;
        Object c0104d2;
        if (obj == null || i2 > 2 || !set2.add(obj)) {
            return false;
        }
        Iterator it = m2010e(obj.getClass()).iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            Field[] declaredFields = ((Class) it.next()).getDeclaredFields();
            AbstractC0223g.m417d(declaredFields, "getDeclaredFields(...)");
            for (Field field : declaredFields) {
                if (!Modifier.isStatic(field.getModifiers())) {
                    try {
                        field.setAccessible(true);
                        c0104d = field.get(obj);
                    } catch (Throwable th) {
                        c0104d = new C0104d(th);
                    }
                    if (c0104d instanceof C0104d) {
                        c0104d = null;
                    }
                    if (c0104d != null) {
                        if (AbstractC0231o.m426b(c0104d)) {
                            try {
                                c0104d2 = AbstractC0231o.m425a(c0104d).listIterator();
                            } catch (Throwable th2) {
                                c0104d2 = new C0104d(th2);
                            }
                            ListIterator listIterator = (ListIterator) (c0104d2 instanceof C0104d ? null : c0104d2);
                            boolean z3 = false;
                            if (listIterator != null) {
                                while (listIterator.hasNext()) {
                                    if (m2025L(listIterator.next(), set)) {
                                        try {
                                            listIterator.remove();
                                            z3 = true;
                                        } catch (Throwable unused) {
                                        }
                                    }
                                }
                            }
                            if (z3) {
                                z2 = true;
                            }
                        } else if (!m2037y(c0104d) && !(c0104d instanceof Collection) && !(c0104d instanceof Map) && !c0104d.getClass().isArray()) {
                            String name = c0104d.getClass().getName();
                            boolean z4 = (AbstractC0307q.m538h0(name, true, "java.") || AbstractC0307q.m538h0(name, true, "android.")) ? false : true;
                            if (z4 && m2028j(c0104d, set, set2, i2 + 1)) {
                            }
                        }
                    }
                }
            }
        }
        return z2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public final Set m2029q() {
        C0025Z c0025z = this.f3280k;
        List list = c0025z != null ? c0025z.f197a : null;
        if (list == null) {
            list = C0131s.f426a;
        }
        C0913j1 c0913j1M2129a = C0951w0.m2129a();
        Set set = c0913j1M2129a != null ? c0913j1M2129a.f3234a : null;
        if (set == null) {
            set = C0133u.f428a;
        }
        return AbstractC0123k.m265B0(AbstractC1135r.m2477E("storage", "adapter", AbstractC0123k.m281w0(AbstractC0123k.m265B0(AbstractC0123k.m273o0(list, set)))));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public final Set m2030r() {
        C0025Z c0025z = this.f3280k;
        List list = c0025z != null ? c0025z.f201e : null;
        if (list == null) {
            list = C0131s.f426a;
        }
        C0913j1 c0913j1M2129a = C0951w0.m2129a();
        Set set = c0913j1M2129a != null ? c0913j1M2129a.f3236c : null;
        if (set == null) {
            set = C0133u.f428a;
        }
        return AbstractC0123k.m265B0(AbstractC1135r.m2477E("storage", "fileSortEntryNames", AbstractC0123k.m281w0(AbstractC0123k.m265B0(AbstractC0123k.m273o0(list, set)))));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX INFO: renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int[] m2031s(Object obj) {
        Object c0104d;
        int iIntValue;
        Object c0104d2;
        m2027i(obj);
        Map map = this.f3274e;
        int[] iArr = (int[]) map.get(obj);
        if (iArr != null) {
            return iArr;
        }
        Map map2 = this.f3275f;
        AbstractC0223g.m417d(map2, "originalGetCountMethods");
        Method methodM2014l = m2014l(map2, obj);
        int i2 = 0;
        if (methodM2014l == null) {
            iIntValue = 0;
        } else {
            try {
                Object objInvokeOriginalMethod = XposedBridge.invokeOriginalMethod(methodM2014l, obj, new Object[0]);
                c0104d = objInvokeOriginalMethod instanceof Integer ? (Integer) objInvokeOriginalMethod : null;
            } catch (Throwable th) {
                c0104d = new C0104d(th);
            }
            if (c0104d instanceof C0104d) {
                c0104d = null;
            }
            Integer num = (Integer) c0104d;
            if (num != null) {
                iIntValue = num.intValue();
            }
        }
        if (iIntValue <= 0) {
            int[] iArr2 = new int[0];
            map.put(obj, iArr2);
            return iArr2;
        }
        Set setM2017o = m2017o();
        if (setM2017o.isEmpty()) {
            int[] iArr3 = new int[iIntValue];
            while (i2 < iIntValue) {
                iArr3[i2] = i2;
                i2++;
            }
            map.put(obj, iArr3);
            return iArr3;
        }
        ArrayList arrayList = new ArrayList(iIntValue);
        while (i2 < iIntValue) {
            Map map3 = this.f3276g;
            AbstractC0223g.m417d(map3, "originalGetItemMethods");
            Method methodM2014l2 = m2014l(map3, obj);
            if (methodM2014l2 == null) {
                c0104d2 = null;
            } else {
                try {
                    c0104d2 = XposedBridge.invokeOriginalMethod(methodM2014l2, obj, new Integer[]{Integer.valueOf(i2)});
                } catch (Throwable th2) {
                    c0104d2 = new C0104d(th2);
                }
                if (c0104d2 instanceof C0104d) {
                }
            }
            m2020E(c0104d2);
            if (!m2025L(c0104d2, setM2017o)) {
                arrayList.add(Integer.valueOf(i2));
            }
            i2++;
        }
        int[] iArrM280v0 = AbstractC0123k.m280v0(arrayList);
        map.put(obj, iArrM280v0);
        return iArrM280v0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t */
    public final void m2032t(View view) {
        if (view.getVisibility() == 8) {
            return;
        }
        this.f3271b.add(view);
        view.setVisibility(8);
        view.setAlpha(0.0f);
        view.setMinimumHeight(0);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = 0;
        } else {
            layoutParams = null;
        }
        view.setLayoutParams(layoutParams);
        view.requestLayout();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u */
    public final void m2033u(View view) {
        ArrayList arrayList = new ArrayList();
        m2016n(view, new C0780a(this, arrayList, view, 2));
        Iterator it = AbstractC0123k.m281w0(AbstractC0123k.m264A0(arrayList)).iterator();
        while (it.hasNext()) {
            m2032t((View) it.next());
        }
        for (String str : m2030r()) {
            ArrayList arrayList2 = new ArrayList();
            m2011f(view, str, arrayList2);
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                m2032t((View) it2.next());
            }
        }
        m2016n(view, new C0781b(this, view, 6));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: v */
    public final void m2034v(ListAdapter listAdapter) {
        if (listAdapter == null) {
            return;
        }
        Class<?> cls = listAdapter.getClass();
        if (this.f3272c.add(cls.getName())) {
            boolean zContains = m2029q().contains(cls.getName());
            Class cls2 = Integer.TYPE;
            if (zContains) {
                ArrayList arrayListM2010e = m2010e(cls);
                ArrayList arrayList = new ArrayList();
                Iterator it = arrayListM2010e.iterator();
                while (it.hasNext()) {
                    Method[] declaredMethods = ((Class) it.next()).getDeclaredMethods();
                    AbstractC0223g.m417d(declaredMethods, "getDeclaredMethods(...)");
                    AbstractC0129q.m291e0(AbstractC0120h.m251Y(declaredMethods), arrayList);
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : arrayList) {
                    Method method = (Method) obj;
                    if (AbstractC0223g.m414a(method.getName(), "getCount")) {
                        Class<?>[] parameterTypes = method.getParameterTypes();
                        AbstractC0223g.m417d(parameterTypes, "getParameterTypes(...)");
                        if (parameterTypes.length == 0 && AbstractC0223g.m414a(method.getReturnType(), cls2)) {
                            arrayList2.add(obj);
                        }
                    }
                }
                HashSet hashSet = new HashSet();
                ArrayList<Method> arrayList3 = new ArrayList();
                for (Object obj2 : arrayList2) {
                    Method method2 = (Method) obj2;
                    AbstractC0223g.m415b(method2);
                    if (hashSet.add(m2003H(method2))) {
                        arrayList3.add(obj2);
                    }
                }
                for (Method method3 : arrayList3) {
                    Map map = this.f3275f;
                    AbstractC0223g.m417d(map, "originalGetCountMethods");
                    map.put(method3.getDeclaringClass(), method3);
                    AbstractC0514f.m1027d(method3, new C0916k1(this, 4));
                }
                ArrayList arrayListM2010e2 = m2010e(cls);
                ArrayList arrayList4 = new ArrayList();
                Iterator it2 = arrayListM2010e2.iterator();
                while (it2.hasNext()) {
                    Method[] declaredMethods2 = ((Class) it2.next()).getDeclaredMethods();
                    AbstractC0223g.m417d(declaredMethods2, "getDeclaredMethods(...)");
                    AbstractC0129q.m291e0(AbstractC0120h.m251Y(declaredMethods2), arrayList4);
                }
                ArrayList arrayList5 = new ArrayList();
                for (Object obj3 : arrayList4) {
                    Method method4 = (Method) obj3;
                    if (AbstractC0223g.m414a(method4.getName(), "getItem") && method4.getParameterTypes().length == 1 && AbstractC0223g.m414a(method4.getParameterTypes()[0], cls2)) {
                        arrayList5.add(obj3);
                    }
                }
                HashSet hashSet2 = new HashSet();
                ArrayList<Method> arrayList6 = new ArrayList();
                for (Object obj4 : arrayList5) {
                    Method method5 = (Method) obj4;
                    AbstractC0223g.m415b(method5);
                    if (hashSet2.add(m2003H(method5))) {
                        arrayList6.add(obj4);
                    }
                }
                for (Method method6 : arrayList6) {
                    Map map2 = this.f3276g;
                    AbstractC0223g.m417d(map2, "originalGetItemMethods");
                    map2.put(method6.getDeclaringClass(), method6);
                    AbstractC0514f.m1027d(method6, new C0916k1(this, 5));
                }
            }
            ArrayList arrayListM2010e3 = m2010e(cls);
            ArrayList arrayList7 = new ArrayList();
            Iterator it3 = arrayListM2010e3.iterator();
            while (it3.hasNext()) {
                Method[] declaredMethods3 = ((Class) it3.next()).getDeclaredMethods();
                AbstractC0223g.m417d(declaredMethods3, "getDeclaredMethods(...)");
                AbstractC0129q.m291e0(AbstractC0120h.m251Y(declaredMethods3), arrayList7);
            }
            ArrayList arrayList8 = new ArrayList();
            for (Object obj5 : arrayList7) {
                Method method7 = (Method) obj5;
                if (AbstractC0223g.m414a(method7.getName(), "getView") && method7.getParameterTypes().length == 3 && AbstractC0223g.m414a(method7.getParameterTypes()[0], cls2) && View.class.isAssignableFrom(method7.getReturnType()) && View.class.isAssignableFrom(method7.getParameterTypes()[1]) && ViewGroup.class.isAssignableFrom(method7.getParameterTypes()[2])) {
                    arrayList8.add(obj5);
                }
            }
            HashSet hashSet3 = new HashSet();
            ArrayList arrayList9 = new ArrayList();
            for (Object obj6 : arrayList8) {
                Method method8 = (Method) obj6;
                AbstractC0223g.m415b(method8);
                if (hashSet3.add(m2003H(method8))) {
                    arrayList9.add(obj6);
                }
            }
            Iterator it4 = arrayList9.iterator();
            while (it4.hasNext()) {
                AbstractC0514f.m1027d((Method) it4.next(), new C0916k1(this, 2));
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w */
    public final void m2035w(View view) {
        if (view instanceof AbsListView) {
            AbsListView absListView = (AbsListView) view;
            if (m2019z(absListView)) {
                if (m2001C(absListView)) {
                    ListAdapter listAdapter = (ListAdapter) absListView.getAdapter();
                    if (listAdapter != null) {
                        if (m2029q().contains(listAdapter.getClass().getName())) {
                            m2022G((ListAdapter) absListView.getAdapter());
                        }
                    }
                } else {
                    m2034v((ListAdapter) absListView.getAdapter());
                }
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = viewGroup.getChildAt(i2);
                AbstractC0223g.m417d(childAt, "getChildAt(...)");
                m2035w(childAt);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00d6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00d2 A[SYNTHETIC] */
    /* JADX INFO: renamed from: x */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m2036x(Activity activity, View view) {
        int width;
        String name = activity.getClass().getName();
        if (!name.equals("com.tencent.mm.ui.vas.VASCommonActivity") && !AbstractC0299i.m511i0(name, "CleanChatting", true)) {
            return false;
        }
        ArrayList<View> arrayList = new ArrayList();
        m2011f(view, "odf", arrayList);
        boolean z2 = false;
        for (View view2 : arrayList) {
            if (view2 instanceof TextView) {
                View view3 = (TextView) view2;
                while (view3 != null && view3 != view) {
                    boolean z3 = view3 instanceof ViewGroup;
                    if (z3 && m2012g(view3, "odf") && m2012g(view3, "cut") && (m2012g(view3, "mie") || m2012g(view3, "bxc"))) {
                        break;
                    }
                    if (z3 && m2012g(view3, "odf") && m2012g(view3, "cut")) {
                        ViewGroup viewGroup = (ViewGroup) view3;
                        if (viewGroup.getParent() instanceof ViewGroup) {
                            ViewParent parent = viewGroup.getParent();
                            AbstractC0223g.m416c(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                            ViewGroup viewGroup2 = (ViewGroup) parent;
                            if (m2012g(viewGroup2, "mie") || m2012g(viewGroup2, "bxc")) {
                                view3 = viewGroup2;
                                break;
                            }
                            width = view.getWidth();
                            Integer numValueOf = Integer.valueOf(width);
                            if (width <= 0) {
                            }
                            if (numValueOf == null) {
                            }
                            int width2 = view3.getWidth();
                            int height = view3.getHeight();
                            if (!z3) {
                            }
                            Object parent2 = view3.getParent();
                            if (!(parent2 instanceof View)) {
                            }
                        }
                    } else {
                        width = view.getWidth();
                        Integer numValueOf2 = Integer.valueOf(width);
                        if (width <= 0) {
                            numValueOf2 = null;
                        }
                        int iIntValue = numValueOf2 == null ? numValueOf2.intValue() : 0;
                        int width22 = view3.getWidth();
                        int height2 = view3.getHeight();
                        if (!z3 && iIntValue > 0 && width22 >= iIntValue * 0.55f && 60 <= height2 && height2 < 361) {
                            break;
                        }
                        Object parent22 = view3.getParent();
                        view3 = !(parent22 instanceof View) ? (View) parent22 : null;
                    }
                }
                view3 = null;
                if (view3 != null) {
                    z2 = true;
                }
            }
        }
        if (!z2) {
            Set<String> setM2030r = m2030r();
            if (!setM2030r.isEmpty()) {
                for (String str : setM2030r) {
                    ArrayList arrayList2 = new ArrayList();
                    m2011f(view, str, arrayList2);
                    if (!arrayList2.isEmpty()) {
                    }
                }
            }
            C0227k c0227k = new C0227k();
            m2016n(view, new C0060d(7, c0227k));
            return c0227k.f567a;
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: y */
    public final boolean m2037y(Object obj) {
        C0025Z c0025z = this.f3280k;
        List list = c0025z != null ? c0025z.f198b : null;
        if (list == null) {
            list = C0131s.f426a;
        }
        C0913j1 c0913j1M2129a = C0951w0.m2129a();
        Set set = c0913j1M2129a != null ? c0913j1M2129a.f3235b : null;
        if (set == null) {
            set = C0133u.f428a;
        }
        return AbstractC0123k.m265B0(AbstractC1135r.m2477E("storage", "item", AbstractC0123k.m281w0(AbstractC0123k.m265B0(AbstractC0123k.m273o0(list, set))))).contains(obj != null ? obj.getClass().getName() : null);
    }
}
