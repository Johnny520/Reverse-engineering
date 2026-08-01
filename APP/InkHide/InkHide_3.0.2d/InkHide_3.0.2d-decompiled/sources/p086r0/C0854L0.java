package p086r0;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.p055lu.wxmask.MainHook;
import com.p055lu.wxmask.bean.MaskItemBean;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedBridge;
import de.robv.android.xposed.callbacks.XC_LoadPackage;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import p001A0.AbstractC0039l;
import p001A0.C0020U;
import p001A0.C0026a;
import p001A0.C0035h;
import p001A0.C0048u;
import p001A0.C0052y;
import p001A0.RunnableC0045r;
import p004C.C0060d;
import p006D.AbstractC0079h;
import p009E0.AbstractC0105e;
import p009E0.C0104d;
import p011F0.AbstractC0120h;
import p011F0.AbstractC0123k;
import p011F0.AbstractC0129q;
import p011F0.AbstractC0135w;
import p011F0.C0131s;
import p011F0.C0133u;
import p022L.AbstractC0174d;
import p027N0.AbstractC0223g;
import p027N0.AbstractC0231o;
import p029O0.InterfaceC0233a;
import p040U0.AbstractC0299i;
import p040U0.AbstractC0307q;
import p052b1.AbstractC0503h;
import p054c0.AbstractC0514f;
import p062e0.InterfaceC0551a;
import p084q0.C0808h;
import p102z0.AbstractC1126i;
import p102z0.AbstractC1135r;
import p102z0.C1124g;

/* JADX INFO: renamed from: r0.L0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0854L0 implements InterfaceC0551a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2923a;

    /* JADX INFO: renamed from: b */
    public final WeakHashMap f2924b;

    /* JADX INFO: renamed from: c */
    public final Set f2925c;

    /* JADX INFO: renamed from: d */
    public final Set f2926d;

    /* JADX INFO: renamed from: e */
    public final Set f2927e;

    /* JADX INFO: renamed from: f */
    public final Set f2928f;

    /* JADX INFO: renamed from: g */
    public final Set f2929g;

    /* JADX INFO: renamed from: h */
    public final WeakHashMap f2930h;

    /* JADX INFO: renamed from: i */
    public long f2931i;

    /* JADX INFO: renamed from: j */
    public Set f2932j;

    /* JADX INFO: renamed from: k */
    public Set f2933k;

    /* JADX INFO: renamed from: l */
    public final Object f2934l;

    /* JADX INFO: renamed from: m */
    public final Object f2935m;

    /* JADX INFO: renamed from: n */
    public Object f2936n;

    /* JADX INFO: renamed from: o */
    public Object f2937o;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0854L0(int i2) {
        this.f2923a = i2;
        switch (i2) {
            case 1:
                this.f2924b = new WeakHashMap();
                this.f2925c = Collections.newSetFromMap(new IdentityHashMap());
                this.f2926d = Collections.newSetFromMap(new WeakHashMap());
                this.f2927e = Collections.newSetFromMap(new WeakHashMap());
                this.f2928f = Collections.newSetFromMap(new WeakHashMap());
                this.f2929g = Collections.newSetFromMap(new WeakHashMap());
                this.f2930h = new WeakHashMap();
                this.f2934l = new WeakHashMap();
                this.f2935m = new IdentityHashMap();
                this.f2936n = new IdentityHashMap();
                this.f2937o = new ThreadLocal();
                C0133u c0133u = C0133u.f428a;
                this.f2932j = c0133u;
                this.f2933k = c0133u;
                break;
            default:
                Collections.newSetFromMap(new IdentityHashMap());
                this.f2925c = Collections.newSetFromMap(new IdentityHashMap());
                this.f2926d = Collections.newSetFromMap(new IdentityHashMap());
                this.f2927e = Collections.newSetFromMap(new IdentityHashMap());
                this.f2924b = new WeakHashMap();
                this.f2930h = new WeakHashMap();
                this.f2928f = Collections.newSetFromMap(new WeakHashMap());
                this.f2929g = Collections.newSetFromMap(new WeakHashMap());
                new WeakHashMap();
                this.f2932j = C0133u.f428a;
                this.f2933k = AbstractC0135w.m302a0("com.tencent.mm.ui.transmit.recent.i", "com.tencent.mm.ui.transmit.recent.d");
                this.f2934l = AbstractC0135w.m302a0("com.tencent.mm.ui.mvvm.datasource.a", "com.tencent.mm.ui.mvvm.a.a.a");
                this.f2935m = AbstractC0079h.m175T("com.tencent.mm.ui.contact.p6");
                AbstractC0079h.m175T("com.tencent.mm.view.recyclerview.WxRecyclerAdapter");
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: B */
    public static Object m1712B(View view) {
        Object c0104d;
        try {
            c0104d = AbstractC0514f.f1622b.mo1012c(view, "getAdapter", new Object[0]);
        } catch (Throwable th) {
            c0104d = new C0104d(th);
        }
        if (c0104d instanceof C0104d) {
            return null;
        }
        return c0104d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: C */
    public static String m1713C(View view) {
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
    /* JADX INFO: renamed from: O */
    public static boolean m1714O(ListView listView) {
        View rootView;
        String strM1713C = m1713C(listView);
        if ((!AbstractC0223g.m414a(strM1713C, "mil") && !AbstractC0223g.m414a(strM1713C, "q0h")) || (rootView = listView.getRootView()) == null) {
            return false;
        }
        Object context = rootView.getContext();
        for (int i2 = 0; i2 < 8; i2++) {
            if (context.getClass().getName().equals("com.tencent.mm.ui.transmit.SelectConversationUI")) {
                break;
            }
            try {
                Field declaredField = context.getClass().getDeclaredField("mBase");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(context);
                context = obj instanceof Context ? (Context) obj : null;
            } catch (Throwable th) {
                context = new C0104d(th);
            }
            if (context == null) {
                break;
            }
            if (AbstractC0105e.m246a(context) != null) {
                break;
            }
        }
        if (!m1733z(rootView)) {
            return false;
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final void m1715a(C0854L0 c0854l0, Activity activity) {
        Window window;
        View decorView;
        if (!c0854l0.f2929g.add(activity) || (window = activity.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        decorView.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserverOnPreDrawListenerC0845I0(decorView, c0854l0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static final void m1716b(C0854L0 c0854l0, XC_MethodHook.MethodHookParam methodHookParam, Set set) {
        c0854l0.getClass();
        Object result = methodHookParam.getResult();
        if (!(result instanceof List)) {
            if (AbstractC0231o.m427c(result)) {
                AbstractC0223g.m416c(result, "null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.Any?, kotlin.Any?>");
                if (result instanceof InterfaceC0233a) {
                    AbstractC0231o.m429e(result, "kotlin.collections.MutableMap");
                    throw null;
                }
                try {
                    c0854l0.m1753w((Map) result, set);
                    return;
                } catch (ClassCastException e2) {
                    AbstractC0223g.m419f(e2, AbstractC0231o.class.getName());
                    throw e2;
                }
            }
            return;
        }
        List list = (List) result;
        ArrayList arrayList = new ArrayList(list.size());
        for (Object obj : list) {
            String strM1731s = m1731s(c0854l0, obj);
            if (strM1731s == null || !set.contains(strM1731s)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.size() != list.size()) {
            methodHookParam.setResult(arrayList);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static final void m1717c(C0854L0 c0854l0, Object obj, Set set) {
        c0854l0.getClass();
        if (obj == null) {
            return;
        }
        while (true) {
            boolean z2 = false;
            for (Field field : m1722h(obj.getClass())) {
                if (!Modifier.isStatic(field.getModifiers())) {
                    try {
                        field.setAccessible(true);
                        Object obj2 = field.get(obj);
                        if (AbstractC0231o.m426b(obj2)) {
                            if (!c0854l0.m1752v((List) obj2, set) && !z2) {
                                break;
                            }
                            z2 = true;
                        } else if (AbstractC0231o.m427c(obj2)) {
                            if (!c0854l0.m1753w((Map) obj2, set) && !z2) {
                                break;
                            }
                            z2 = true;
                        } else {
                            continue;
                        }
                    } catch (Throwable unused) {
                        continue;
                    }
                }
            }
            return;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static final boolean m1718d(C0854L0 c0854l0) {
        c0854l0.getClass();
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        AbstractC0223g.m417d(stackTrace, "getStackTrace(...)");
        for (StackTraceElement stackTraceElement : stackTrace) {
            String className = stackTraceElement.getClassName();
            if (AbstractC0223g.m414a(className, "com.tencent.mm.ui.contact.item.q1")) {
                return true;
            }
            AbstractC0223g.m415b(className);
            if (AbstractC0307q.m538h0(className, false, "com.tencent.mm.ui.mvvm.uic.conversation.recent.") || AbstractC0307q.m538h0(className, false, "com.tencent.mm.ui.transmit.recent.")) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static final void m1719e(C0854L0 c0854l0, ListView listView, boolean z2) {
        Method method;
        Object c0104d;
        ListAdapter wrappedAdapter;
        c0854l0.getClass();
        ListAdapter adapter = listView.getAdapter();
        if (adapter == null) {
            return;
        }
        if ((adapter instanceof HeaderViewListAdapter) && (wrappedAdapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter()) != null) {
            adapter = wrappedAdapter;
        }
        boolean zAdd = c0854l0.f2927e.add(adapter);
        Class<?> superclass = adapter.getClass();
        if (c0854l0.f2925c.add(superclass)) {
            Class cls = Integer.TYPE;
            Method methodMo1011b = AbstractC0514f.f1622b.mo1011b(superclass, "getItem", cls);
            Method methodMo1011b2 = AbstractC0514f.f1622b.mo1011b(superclass, "getCount", new Object[0]);
            Method methodMo1011b3 = AbstractC0514f.f1622b.mo1011b(superclass, "getItemId", cls);
            if (methodMo1011b != null) {
                ((IdentityHashMap) c0854l0.f2935m).put(superclass, methodMo1011b);
            }
            if (methodMo1011b2 != null) {
                ((IdentityHashMap) c0854l0.f2936n).put(superclass, methodMo1011b2);
            }
            if (methodMo1011b2 != null && methodMo1011b != null) {
                AbstractC0514f.m1027d(methodMo1011b2, new C0886a1(c0854l0, 0));
                AbstractC0514f.m1027d(methodMo1011b, new C0886a1(c0854l0, 1));
            }
            if (methodMo1011b3 != null) {
                AbstractC0514f.m1027d(methodMo1011b3, new C0886a1(c0854l0, 2));
            }
            Method methodMo1011b4 = AbstractC0514f.f1622b.mo1011b(superclass, "notifyDataSetChanged", new Object[0]);
            if (methodMo1011b4 != null) {
                AbstractC0514f.m1027d(methodMo1011b4, new C0886a1(c0854l0, 3));
            }
            while (true) {
                method = null;
                method = null;
                if (superclass == null || superclass.equals(Object.class)) {
                    break;
                }
                try {
                    c0104d = superclass.getDeclaredMethod("getView", cls, View.class, ViewGroup.class);
                } catch (Throwable th) {
                    c0104d = new C0104d(th);
                }
                method = (Method) (c0104d instanceof C0104d ? null : c0104d);
                if (method != null) {
                    break;
                } else {
                    superclass = superclass.getSuperclass();
                }
            }
            if (method != null) {
                AbstractC0514f.m1027d(method, new C0886a1(c0854l0, 4));
            }
        }
        if (z2 && zAdd) {
            c0854l0.f2930h.remove(adapter);
            try {
                listView.invalidateViews();
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static final void m1720f(C0854L0 c0854l0) {
        ClassLoader classLoader = (ClassLoader) c0854l0.f2936n;
        if (classLoader == null) {
            return;
        }
        c0854l0.m1739H(classLoader);
        c0854l0.m1738G(classLoader);
        c0854l0.m1737F(classLoader);
        c0854l0.m1740I(classLoader);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static final boolean m1721g(C0854L0 c0854l0, Object obj) {
        if (obj == null) {
            c0854l0.getClass();
            return false;
        }
        if (c0854l0.f2927e.contains(obj)) {
            boolean z2 = AbstractC1126i.f3786a;
            if (C1124g.m2448x() && !c0854l0.m1749m().isEmpty()) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static ArrayList m1722h(Class cls) {
        ArrayList arrayList = new ArrayList();
        while (cls != null && !cls.equals(Object.class)) {
            Field[] declaredFields = cls.getDeclaredFields();
            AbstractC0223g.m417d(declaredFields, "getDeclaredFields(...)");
            AbstractC0129q.m292f0(arrayList, declaredFields);
            cls = cls.getSuperclass();
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static final void m1723i(C0854L0 c0854l0, LinkedHashSet linkedHashSet, View view) {
        c0854l0.getClass();
        String strM1713C = m1713C(view);
        if (strM1713C != null) {
            linkedHashSet.add(strM1713C);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = viewGroup.getChildAt(i2);
                AbstractC0223g.m417d(childAt, "getChildAt(...)");
                m1723i(c0854l0, linkedHashSet, childAt);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:41:0x0092 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [F0.s] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList] */
    /* JADX INFO: renamed from: j */
    public static List m1724j(Object obj, int i2, Set set) {
        ?? arrayList = C0131s.f426a;
        if (obj != null && i2 <= 3) {
            if (obj instanceof String) {
                List listM167E = AbstractC0079h.m167E(AbstractC0299i.m507C0((String) obj).toString());
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : listM167E) {
                    if (!AbstractC0307q.m534d0((String) obj2)) {
                        arrayList2.add(obj2);
                    }
                }
                return arrayList2;
            }
            if (set.add(obj)) {
                Class<?> cls = obj.getClass();
                if (!AbstractC0307q.m538h0(cls.getName(), false, "java.") && !AbstractC0307q.m538h0(cls.getName(), false, "android.")) {
                    arrayList = new ArrayList();
                    Field[] declaredFields = cls.getDeclaredFields();
                    AbstractC0223g.m417d(declaredFields, "getDeclaredFields(...)");
                    for (Field field : declaredFields) {
                        if (!Modifier.isStatic(field.getModifiers())) {
                            try {
                                field.setAccessible(true);
                                arrayList.addAll(m1724j(field.get(obj), 1 + i2, set));
                            } catch (Throwable unused) {
                            }
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public static final void m1725k(ArrayList arrayList, View view) {
        String string;
        if (view instanceof TextView) {
            CharSequence text = ((TextView) view).getText();
            String string2 = (text == null || (string = text.toString()) == null) ? null : AbstractC0299i.m507C0(string).toString();
            if (string2 == null) {
                string2 = "";
            }
            if (!AbstractC0307q.m534d0(string2)) {
                arrayList.add(string2);
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = viewGroup.getChildAt(i2);
                AbstractC0223g.m417d(childAt, "getChildAt(...)");
                m1725k(arrayList, childAt);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public static Set m1726l(Set set) {
        boolean z2 = AbstractC1126i.f3786a;
        ArrayList arrayListM2433i = C1124g.m2433i();
        ArrayList<MaskItemBean> arrayList = new ArrayList();
        Iterator it = arrayListM2433i.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            String maskId = ((MaskItemBean) next).getMaskId();
            String string = maskId != null ? AbstractC0299i.m507C0(maskId).toString() : null;
            if (set.contains(string != null ? string : "")) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (MaskItemBean maskItemBean : arrayList) {
            String maskId2 = maskItemBean.getMaskId();
            String string2 = maskId2 != null ? AbstractC0299i.m507C0(maskId2).toString() : null;
            if (string2 == null) {
                string2 = "";
            }
            String tagName = maskItemBean.getTagName();
            String string3 = tagName != null ? AbstractC0299i.m507C0(tagName).toString() : null;
            if (string3 == null) {
                string3 = "";
            }
            AbstractC0129q.m291e0(AbstractC0120h.m252Z(new String[]{string2, string3}), arrayList2);
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : arrayList2) {
            if (!AbstractC0307q.m534d0((String) obj)) {
                arrayList3.add(obj);
            }
        }
        return AbstractC0123k.m265B0(arrayList3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public static ListAdapter m1727o(ListView listView) {
        ListAdapter adapter = listView.getAdapter();
        if (adapter == null) {
            return null;
        }
        ListAdapter wrappedAdapter = adapter instanceof HeaderViewListAdapter ? ((HeaderViewListAdapter) adapter).getWrappedAdapter() : adapter;
        return wrappedAdapter == null ? adapter : wrappedAdapter;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public static Integer m1728p(ListView listView, int i2) {
        if (i2 >= 0) {
            ListAdapter adapter = listView.getAdapter();
            HeaderViewListAdapter headerViewListAdapter = adapter instanceof HeaderViewListAdapter ? (HeaderViewListAdapter) adapter : null;
            int headersCount = i2 - (headerViewListAdapter != null ? headerViewListAdapter.getHeadersCount() : 0);
            Integer numValueOf = Integer.valueOf(headersCount);
            if (headersCount >= 0) {
                return numValueOf;
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public static String m1729q(Object obj, int i2, Set set) {
        Object c0104d;
        if (obj != null && i2 <= 3) {
            if (obj instanceof String) {
                String str = (String) obj;
                if (!AbstractC0307q.m538h0(str, false, "wxid_") && !str.endsWith("@chatroom") && !AbstractC0307q.m538h0(str, false, "gh_") && !AbstractC0299i.m511i0(str, "@openim", true)) {
                    obj = null;
                }
                return (String) obj;
            }
            if (set.add(obj)) {
                Class<?> cls = obj.getClass();
                if (!AbstractC0307q.m538h0(cls.getName(), false, "java.") && !AbstractC0307q.m538h0(cls.getName(), false, "android.")) {
                    Field[] declaredFields = cls.getDeclaredFields();
                    AbstractC0223g.m417d(declaredFields, "getDeclaredFields(...)");
                    for (Field field : declaredFields) {
                        if (!Modifier.isStatic(field.getModifiers())) {
                            try {
                                field.setAccessible(true);
                                c0104d = m1729q(field.get(obj), i2 + 1, set);
                            } catch (Throwable th) {
                                c0104d = new C0104d(th);
                            }
                            if (c0104d instanceof C0104d) {
                                c0104d = null;
                            }
                            String str2 = (String) c0104d;
                            if (str2 != null) {
                                return str2;
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public static String m1730r(Object obj, int i2, Set set) {
        Object c0104d;
        if (obj != null && i2 <= 3) {
            if (obj instanceof String) {
                String str = (String) obj;
                if (!AbstractC0307q.m538h0(str, false, "wxid_") && !str.endsWith("@chatroom") && !AbstractC0307q.m538h0(str, false, "gh_") && !AbstractC0299i.m511i0(str, "@openim", true)) {
                    obj = null;
                }
                return (String) obj;
            }
            if (set.add(obj)) {
                Class<?> cls = obj.getClass();
                if (!AbstractC0307q.m538h0(cls.getName(), false, "java.") && !AbstractC0307q.m538h0(cls.getName(), false, "android.")) {
                    Field[] declaredFields = cls.getDeclaredFields();
                    AbstractC0223g.m417d(declaredFields, "getDeclaredFields(...)");
                    for (Field field : declaredFields) {
                        if (!Modifier.isStatic(field.getModifiers())) {
                            try {
                                field.setAccessible(true);
                                c0104d = m1730r(field.get(obj), i2 + 1, set);
                            } catch (Throwable th) {
                                c0104d = new C0104d(th);
                            }
                            if (c0104d instanceof C0104d) {
                                c0104d = null;
                            }
                            String str2 = (String) c0104d;
                            if (str2 != null) {
                                return str2;
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public static /* synthetic */ String m1731s(C0854L0 c0854l0, Object obj) {
        Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap());
        c0854l0.getClass();
        return m1729q(obj, 0, setNewSetFromMap);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t */
    public static /* synthetic */ String m1732t(C0854L0 c0854l0, Object obj) {
        Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap());
        c0854l0.getClass();
        return m1730r(obj, 0, setNewSetFromMap);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: z */
    public static boolean m1733z(View view) {
        if (view instanceof TextView) {
            CharSequence text = ((TextView) view).getText();
            if (AbstractC0223g.m414a(text != null ? text.toString() : null, "选择一个聊天")) {
                return true;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = viewGroup.getChildAt(i2);
                AbstractC0223g.m417d(childAt, "getChildAt(...)");
                if (m1733z(childAt)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: A */
    public String m1734A(View view) {
        String strM1732t = m1732t(this, view.getTag());
        if (strM1732t != null) {
            return strM1732t;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            AbstractC0223g.m417d(childAt, "getChildAt(...)");
            String strM1734A = m1734A(childAt);
            if (strM1734A != null) {
                return strM1734A;
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: D */
    public List m1735D(Object obj) {
        Object c0104d;
        Object objM1741J;
        String strM1732t;
        WeakHashMap weakHashMap = this.f2930h;
        List list = (List) weakHashMap.get(obj);
        if (list != null) {
            return list;
        }
        Set setM1749m = m1749m();
        Set setM1726l = AbstractC0223g.m414a(setM1749m, this.f2932j) ? this.f2933k : m1726l(setM1749m);
        Method method = (Method) ((IdentityHashMap) this.f2936n).get(obj.getClass());
        Integer num = null;
        if (method != null) {
            try {
                c0104d = XposedBridge.invokeOriginalMethod(method, obj, new Object[0]);
            } catch (Throwable th) {
                c0104d = new C0104d(th);
            }
            if (c0104d instanceof C0104d) {
                c0104d = null;
            }
            if (c0104d instanceof Integer) {
                num = (Integer) c0104d;
            }
        }
        if (num == null) {
            return C0131s.f426a;
        }
        int iIntValue = num.intValue();
        ArrayList arrayList = new ArrayList();
        Set set = (Set) ((WeakHashMap) this.f2934l).get(obj);
        if (set == null) {
            set = C0133u.f428a;
        }
        for (int i2 = 0; i2 < iIntValue; i2++) {
            if (!set.contains(Integer.valueOf(i2)) && ((strM1732t = m1732t(this, (objM1741J = m1741J(i2, obj)))) == null || AbstractC0307q.m534d0(strM1732t) || !setM1749m.contains(strM1732t))) {
                List listM1724j = m1724j(objM1741J, 0, Collections.newSetFromMap(new IdentityHashMap()));
                if (listM1724j.isEmpty()) {
                    arrayList.add(Integer.valueOf(i2));
                } else {
                    Iterator it = listM1724j.iterator();
                    while (it.hasNext()) {
                        if (setM1726l.contains((String) it.next())) {
                            break;
                        }
                    }
                    arrayList.add(Integer.valueOf(i2));
                }
            }
        }
        weakHashMap.put(obj, arrayList);
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: E */
    public void m1736E(View view, ListView listView) {
        WeakHashMap weakHashMap = this.f2924b;
        if (weakHashMap.containsKey(view)) {
            return;
        }
        int visibility = view.getVisibility();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Integer numValueOf = layoutParams != null ? Integer.valueOf(layoutParams.width) : null;
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        weakHashMap.put(view, new C0883Z0(visibility, numValueOf, layoutParams2 != null ? Integer.valueOf(layoutParams2.height) : null, view.getMinimumHeight()));
        view.setVisibility(8);
        view.setMinimumHeight(0);
        ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
        if (layoutParams3 != null) {
            layoutParams3.width = 0;
            layoutParams3.height = 0;
            view.setLayoutParams(layoutParams3);
        }
        view.requestLayout();
        listView.requestLayout();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: F */
    public void m1737F(ClassLoader classLoader) {
        for (String str : (Set) this.f2935m) {
            AbstractC0223g.m418e(str, "clazz");
            AbstractC0223g.m418e(classLoader, "classLoader");
            Class clsMo1021l = AbstractC0514f.f1622b.mo1021l(classLoader, str);
            if (clsMo1021l != null && this.f2926d.add(clsMo1021l)) {
                Method[] declaredMethods = clsMo1021l.getDeclaredMethods();
                AbstractC0223g.m417d(declaredMethods, "getDeclaredMethods(...)");
                ArrayList<Method> arrayList = new ArrayList();
                for (Method method : declaredMethods) {
                    if (AbstractC0223g.m414a(method.getName(), "v") && method.getParameterTypes().length == 1 && AbstractC0223g.m414a(method.getParameterTypes()[0], Integer.TYPE) && !Modifier.isAbstract(method.getModifiers())) {
                        arrayList.add(method);
                    }
                }
                for (Method method2 : arrayList) {
                    if (MainHook.uniqueMetaStore.add(AbstractC0174d.m354j("hide-recent-forward-contact-adapter-", method2))) {
                        AbstractC0514f.m1027d(method2, new C0848J0(this, 0));
                    }
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: G */
    public void m1738G(ClassLoader classLoader) {
        for (String str : (Set) this.f2934l) {
            AbstractC0223g.m418e(str, "clazz");
            AbstractC0223g.m418e(classLoader, "classLoader");
            Class clsMo1021l = AbstractC0514f.f1622b.mo1021l(classLoader, str);
            if (clsMo1021l != null && this.f2926d.add(clsMo1021l)) {
                Method[] declaredMethods = clsMo1021l.getDeclaredMethods();
                AbstractC0223g.m417d(declaredMethods, "getDeclaredMethods(...)");
                ArrayList<Method> arrayList = new ArrayList();
                for (Method method : declaredMethods) {
                    if (AbstractC0223g.m414a(method.getName(), "onCreate")) {
                        Class<?>[] parameterTypes = method.getParameterTypes();
                        AbstractC0223g.m417d(parameterTypes, "getParameterTypes(...)");
                        if (parameterTypes.length == 0 && !Modifier.isAbstract(method.getModifiers())) {
                            arrayList.add(method);
                        }
                    }
                }
                for (Method method2 : arrayList) {
                    if (MainHook.uniqueMetaStore.add(AbstractC0174d.m354j("hide-recent-forward-mvvm-source-", method2))) {
                        AbstractC0514f.m1027d(method2, new C0851K0(this, method2, 0));
                    }
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: H */
    public void m1739H(ClassLoader classLoader) {
        for (String str : this.f2933k) {
            AbstractC0223g.m418e(str, "clazz");
            AbstractC0223g.m418e(classLoader, "classLoader");
            Class clsMo1021l = AbstractC0514f.f1622b.mo1021l(classLoader, str);
            if (clsMo1021l != null && this.f2926d.add(clsMo1021l)) {
                Method[] declaredMethods = clsMo1021l.getDeclaredMethods();
                AbstractC0223g.m417d(declaredMethods, "getDeclaredMethods(...)");
                ArrayList<Method> arrayList = new ArrayList();
                for (Method method : declaredMethods) {
                    if (AbstractC0223g.m414a(method.getName(), "a") || AbstractC0223g.m414a(method.getName(), "b")) {
                        Class<?>[] parameterTypes = method.getParameterTypes();
                        AbstractC0223g.m417d(parameterTypes, "getParameterTypes(...)");
                        if (parameterTypes.length == 0 && !AbstractC0223g.m414a(method.getReturnType(), Void.TYPE) && !Modifier.isAbstract(method.getModifiers())) {
                            arrayList.add(method);
                        }
                    }
                }
                for (Method method2 : arrayList) {
                    if (MainHook.uniqueMetaStore.add(AbstractC0174d.m354j("hide-recent-forward-provider-", method2))) {
                        AbstractC0514f.m1027d(method2, new C0851K0(this, method2, 1));
                    }
                }
                Constructor<?>[] declaredConstructors = clsMo1021l.getDeclaredConstructors();
                AbstractC0223g.m417d(declaredConstructors, "getDeclaredConstructors(...)");
                ArrayList<Constructor> arrayList2 = new ArrayList();
                for (Constructor<?> constructor : declaredConstructors) {
                    if (!Modifier.isAbstract(constructor.getModifiers())) {
                        arrayList2.add(constructor);
                    }
                }
                for (Constructor constructor2 : arrayList2) {
                    if (MainHook.uniqueMetaStore.add("hide-recent-forward-provider-ctor-" + constructor2)) {
                        AbstractC0514f.m1027d(constructor2, new C0848J0(this, 3));
                    }
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: I */
    public void m1740I(ClassLoader classLoader) {
        AbstractC0223g.m418e(classLoader, "classLoader");
        Class clsMo1021l = AbstractC0514f.f1622b.mo1021l(classLoader, "com.tencent.mm.view.recyclerview.WxRecyclerAdapter");
        if (clsMo1021l != null && this.f2925c.add(clsMo1021l)) {
            Constructor<?>[] declaredConstructors = clsMo1021l.getDeclaredConstructors();
            AbstractC0223g.m417d(declaredConstructors, "getDeclaredConstructors(...)");
            for (Constructor<?> constructor : declaredConstructors) {
                if (MainHook.uniqueMetaStore.add("hide-recent-forward-adapter-constructor-" + constructor)) {
                    AbstractC0514f.m1027d(constructor, new C0848J0(this, 5));
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: J */
    public Object m1741J(int i2, Object obj) {
        Object c0104d;
        Method method = (Method) ((IdentityHashMap) this.f2935m).get(obj.getClass());
        if (method == null) {
            return null;
        }
        try {
            c0104d = XposedBridge.invokeOriginalMethod(method, obj, new Integer[]{Integer.valueOf(i2)});
        } catch (Throwable th) {
            c0104d = new C0104d(th);
        }
        if (c0104d instanceof C0104d) {
            return null;
        }
        return c0104d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: K */
    public boolean m1742K(View view) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        m1723i(this, linkedHashSet, view);
        return linkedHashSet.containsAll(AbstractC0120h.m263k0(new String[]{"mjc", "a_4", "odf"})) || linkedHashSet.containsAll(AbstractC0120h.m263k0(new String[]{"q26", "ajr", "sdh"}));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: L */
    public boolean m1743L(Activity activity) {
        String name = activity.getClass().getName();
        if (!name.equals("com.tencent.mm.ui.mvvm.MvvmContactListUI")) {
            Context applicationContext = activity.getApplicationContext();
            C0020U c0020uM73k = (C0020U) this.f2937o;
            if (c0020uM73k == null) {
                if (applicationContext == null || (c0020uM73k = AbstractC0039l.m73k(applicationContext)) == null) {
                    c0020uM73k = null;
                } else {
                    this.f2937o = c0020uM73k;
                }
            }
            if (c0020uM73k == null || !c0020uM73k.f157a.contains(name)) {
                return false;
            }
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: M */
    public boolean m1744M(View view) {
        Context context = view.getContext();
        for (int i2 = 0; i2 < 8; i2++) {
            if (context instanceof Activity) {
                return context.getClass().getName().equals("com.tencent.mm.ui.transmit.SelectConversationUI") || m1743L((Activity) context);
            }
            if (!(context instanceof ContextWrapper)) {
                break;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: N */
    public boolean m1745N(View view) {
        Object c0104d;
        Object objM1712B;
        Object c0104d2;
        boolean z2;
        C0020U c0020u;
        for (Class<?> superclass = view.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
            if (superclass.getName().equals("androidx.recyclerview.widget.RecyclerView") || superclass.getName().equals("android.support.v7.widget.RecyclerView") || superclass.getName().endsWith(".RecyclerView") || superclass.getName().endsWith(".WxRecyclerView")) {
                int id = view.getId();
                String str = null;
                if (id != -1) {
                    try {
                        c0104d = view.getResources().getResourceEntryName(id);
                    } catch (Throwable th) {
                        c0104d = new C0104d(th);
                    }
                    str = (String) (c0104d instanceof C0104d ? null : c0104d);
                }
                if (AbstractC0223g.m414a(str, "llt") || AbstractC0223g.m414a(str, "ovi") || !(str == null || AbstractC0307q.m534d0(str) || (c0020u = (C0020U) this.f2937o) == null || !c0020u.f160d.contains(str))) {
                    return m1744M(view);
                }
                if (AbstractC1135r.m2498t()) {
                    Set set = this.f2928f;
                    if (set.contains(view)) {
                        return true;
                    }
                    if (!m1744M(view) || view.getWidth() <= view.getHeight() || (objM1712B = m1712B(view)) == null) {
                        return false;
                    }
                    Set setM1750n = m1750n();
                    if (setM1750n.isEmpty()) {
                        return false;
                    }
                    Field[] declaredFields = objM1712B.getClass().getDeclaredFields();
                    AbstractC0223g.m417d(declaredFields, "getDeclaredFields(...)");
                    for (Field field : declaredFields) {
                        if (!Modifier.isStatic(field.getModifiers())) {
                            try {
                                field.setAccessible(true);
                                Object obj = field.get(objM1712B);
                                if (obj instanceof List) {
                                    Iterable iterable = (Iterable) obj;
                                    if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                                        Iterator it = iterable.iterator();
                                        while (it.hasNext()) {
                                            String strM1731s = m1731s(this, it.next());
                                            if (strM1731s != null && setM1750n.contains(strM1731s)) {
                                                z2 = true;
                                                break;
                                            }
                                        }
                                    }
                                    z2 = false;
                                } else {
                                    if (obj instanceof Map) {
                                        Map map = (Map) obj;
                                        if (!map.isEmpty()) {
                                            for (Map.Entry entry : map.entrySet()) {
                                                Object key = entry.getKey();
                                                Object value = entry.getValue();
                                                String strM1731s2 = m1731s(this, key);
                                                if (strM1731s2 == null) {
                                                    strM1731s2 = m1731s(this, value);
                                                }
                                                if (strM1731s2 != null && setM1750n.contains(strM1731s2)) {
                                                    z2 = true;
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                    z2 = false;
                                }
                                c0104d2 = Boolean.valueOf(z2);
                            } catch (Throwable th2) {
                                c0104d2 = new C0104d(th2);
                            }
                            Boolean bool = Boolean.FALSE;
                            boolean z3 = c0104d2 instanceof C0104d;
                            Object obj2 = c0104d2;
                            if (z3) {
                                obj2 = bool;
                            }
                            if (((Boolean) obj2).booleanValue()) {
                                set.add(view);
                                return true;
                            }
                        }
                    }
                    return false;
                }
                return false;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: P */
    public void m1746P(View view, ListView listView) {
        Object c0104d;
        Integer numM1728p;
        Integer num;
        ListAdapter listAdapterM1727o = m1727o(listView);
        if (listAdapterM1727o == null) {
            return;
        }
        try {
            c0104d = Integer.valueOf(listView.getPositionForView(view));
        } catch (Throwable th) {
            c0104d = new C0104d(th);
        }
        if (c0104d instanceof C0104d) {
            c0104d = -1;
        }
        int iIntValue = ((Number) c0104d).intValue();
        if (iIntValue >= 0 && (numM1728p = m1728p(listView, iIntValue)) != null) {
            int iIntValue2 = numM1728p.intValue();
            if (this.f2927e.contains(listAdapterM1727o) && (num = (Integer) AbstractC0123k.m269k0(m1735D(listAdapterM1727o), iIntValue2)) != null) {
                iIntValue2 = num.intValue();
            }
            WeakHashMap weakHashMap = (WeakHashMap) this.f2934l;
            Object linkedHashSet = weakHashMap.get(listAdapterM1727o);
            if (linkedHashSet == null) {
                linkedHashSet = new LinkedHashSet();
                weakHashMap.put(listAdapterM1727o, linkedHashSet);
            }
            if (((Set) linkedHashSet).add(Integer.valueOf(iIntValue2))) {
                WeakHashMap weakHashMap2 = this.f2930h;
                weakHashMap2.remove(listAdapterM1727o);
                weakHashMap2.remove(listAdapterM1727o);
                if (this.f2928f.add(listView)) {
                    listView.postOnAnimation(new RunnableC0045r(this, listView, listAdapterM1727o, 10));
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Q */
    public void m1747Q(View view) {
        int iIntValue;
        C0883Z0 c0883z0 = (C0883Z0) this.f2924b.remove(view);
        if (c0883z0 == null) {
            return;
        }
        view.setVisibility(c0883z0.f3056a);
        view.setMinimumHeight(c0883z0.f3059d);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            boolean z2 = true;
            boolean z3 = false;
            Integer num = c0883z0.f3057b;
            if (num != null && layoutParams.width != (iIntValue = num.intValue())) {
                layoutParams.width = iIntValue;
                z3 = true;
            }
            Integer num2 = c0883z0.f3058c;
            if (num2 != null) {
                int iIntValue2 = num2.intValue();
                if (layoutParams.height != iIntValue2) {
                    layoutParams.height = iIntValue2;
                } else {
                    z2 = z3;
                }
                z3 = z2;
            }
            if (z3) {
                view.setLayoutParams(layoutParams);
            }
        }
        view.requestLayout();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00ef  */
    /* JADX INFO: renamed from: R */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m1748R(View view, ListView listView) {
        Object c0104d;
        Object c0104d2;
        String strM1734A;
        Object c0104d3;
        if (!this.f2926d.contains(listView) && !m1714O(listView)) {
            m1747Q(view);
            return;
        }
        ListAdapter adapter = listView.getAdapter();
        HeaderViewListAdapter headerViewListAdapter = adapter instanceof HeaderViewListAdapter ? (HeaderViewListAdapter) adapter : null;
        if (headerViewListAdapter != null) {
            try {
                c0104d = Integer.valueOf(listView.getPositionForView(view));
            } catch (Throwable th) {
                c0104d = new C0104d(th);
            }
            if (c0104d instanceof C0104d) {
                c0104d = -1;
            }
            int iIntValue = ((Number) c0104d).intValue();
            if (iIntValue >= 0 && iIntValue < headerViewListAdapter.getHeadersCount()) {
                boolean z2 = AbstractC1126i.f3786a;
                if (!C1124g.m2448x() || m1749m().isEmpty()) {
                    m1747Q(view);
                    return;
                }
                ArrayList arrayList = new ArrayList();
                m1725k(arrayList, view);
                if (arrayList.isEmpty() && !m1742K(view)) {
                    m1736E(view, listView);
                    return;
                }
                m1747Q(view);
            }
        }
        if (!m1742K(view)) {
            m1747Q(view);
            return;
        }
        boolean z3 = AbstractC1126i.f3786a;
        if (!C1124g.m2448x()) {
            m1747Q(view);
            return;
        }
        Set setM1749m = m1749m();
        if (setM1749m.isEmpty()) {
            m1747Q(view);
            return;
        }
        try {
            c0104d2 = Integer.valueOf(listView.getPositionForView(view));
        } catch (Throwable th2) {
            c0104d2 = new C0104d(th2);
        }
        if (c0104d2 instanceof C0104d) {
            c0104d2 = -1;
        }
        int iIntValue2 = ((Number) c0104d2).intValue();
        if (iIntValue2 >= 0) {
            ListAdapter listAdapterM1727o = m1727o(listView);
            Integer numM1728p = m1728p(listView, iIntValue2);
            if (listAdapterM1727o == null || numM1728p == null) {
                strM1734A = m1734A(view);
            } else {
                try {
                    c0104d3 = listAdapterM1727o.getItem(numM1728p.intValue());
                } catch (Throwable th3) {
                    c0104d3 = new C0104d(th3);
                }
                strM1734A = m1732t(this, c0104d3 instanceof C0104d ? null : c0104d3);
                if (strM1734A == null) {
                }
            }
        }
        WeakHashMap weakHashMap = this.f2924b;
        if (strM1734A != null && !AbstractC0307q.m534d0(strM1734A) && setM1749m.contains(strM1734A)) {
            m1746P(view, listView);
            if (weakHashMap.containsKey(view)) {
                return;
            }
            m1736E(view, listView);
            return;
        }
        Set setM1726l = AbstractC0223g.m414a(setM1749m, this.f2932j) ? this.f2933k : m1726l(setM1749m);
        ArrayList arrayList2 = new ArrayList();
        m1725k(arrayList2, view);
        if (!arrayList2.isEmpty()) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                if (setM1726l.contains((String) it.next())) {
                    m1746P(view, listView);
                    if (weakHashMap.containsKey(view)) {
                        return;
                    }
                    m1736E(view, listView);
                    return;
                }
            }
        }
        m1747Q(view);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00d9 A[PHI: r12
  0x00d9: PHI (r12v7 java.lang.Class) = (r12v6 java.lang.Class), (r12v16 java.lang.Class) binds: [B:17:0x00c7, B:19:0x00d6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00f8 A[PHI: r3
  0x00f8: PHI (r3v8 java.lang.Class) = (r3v7 java.lang.Class), (r3v10 java.lang.Class) binds: [B:22:0x00e6, B:24:0x00f5] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p062e0.InterfaceC0551a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void handleHook(Context context, XC_LoadPackage.LoadPackageParam loadPackageParam) {
        int i2 = 4;
        int i3 = 16;
        switch (this.f2923a) {
            case 0:
                this.f2936n = loadPackageParam.classLoader;
                this.f2937o = AbstractC0039l.m73k(context);
                CopyOnWriteArrayList copyOnWriteArrayList = C0052y.f291a;
                C0052y.m98c(context, new C0048u("recent_forward", "最近转发隐藏", new C0863P(21), new C0035h(context, i3), new C0060d(i2, this), new C0026a(i3)));
                ClassLoader classLoader = loadPackageParam.classLoader;
                AbstractC0223g.m417d(classLoader, "classLoader");
                m1739H(classLoader);
                ClassLoader classLoader2 = loadPackageParam.classLoader;
                AbstractC0223g.m417d(classLoader2, "classLoader");
                m1738G(classLoader2);
                ClassLoader classLoader3 = loadPackageParam.classLoader;
                AbstractC0223g.m417d(classLoader3, "classLoader");
                m1737F(classLoader3);
                ClassLoader classLoader4 = loadPackageParam.classLoader;
                AbstractC0223g.m417d(classLoader4, "classLoader");
                m1740I(classLoader4);
                ClassLoader classLoader5 = loadPackageParam.classLoader;
                AbstractC0223g.m417d(classLoader5, "classLoader");
                Class clsMo1021l = AbstractC0514f.f1622b.mo1021l(classLoader5, "androidx.recyclerview.widget.RecyclerView");
                if (clsMo1021l == null) {
                    ClassLoader classLoader6 = loadPackageParam.classLoader;
                    AbstractC0223g.m417d(classLoader6, "classLoader");
                    clsMo1021l = AbstractC0514f.f1622b.mo1021l(classLoader6, "android.support.v7.widget.RecyclerView");
                    if (clsMo1021l != null) {
                        ClassLoader classLoader7 = loadPackageParam.classLoader;
                        AbstractC0223g.m417d(classLoader7, "classLoader");
                        Class clsMo1021l2 = AbstractC0514f.f1622b.mo1021l(classLoader7, "androidx.recyclerview.widget.RecyclerView$Adapter");
                        if (clsMo1021l2 == null) {
                            ClassLoader classLoader8 = loadPackageParam.classLoader;
                            AbstractC0223g.m417d(classLoader8, "classLoader");
                            clsMo1021l2 = AbstractC0514f.f1622b.mo1021l(classLoader8, "android.support.v7.widget.RecyclerView$Adapter");
                            if (clsMo1021l2 != null) {
                                Method methodMo1011b = AbstractC0514f.f1622b.mo1011b(clsMo1021l, "setAdapter", clsMo1021l2);
                                if (methodMo1011b != null) {
                                    AbstractC0514f.m1027d(methodMo1011b, new C0848J0(this, i2));
                                }
                            }
                        }
                    }
                }
                Method methodMo1011b2 = AbstractC0514f.f1622b.mo1011b(Activity.class, "onResume", new Object[0]);
                if (methodMo1011b2 != null) {
                    if (MainHook.uniqueMetaStore.add(AbstractC0174d.m354j("hide-recent-forward-resume-", methodMo1011b2))) {
                        AbstractC0514f.m1027d(methodMo1011b2, new C0848J0(this, 2));
                    }
                }
                Method methodMo1011b3 = AbstractC0514f.f1622b.mo1011b(Activity.class, "onWindowFocusChanged", Boolean.TYPE);
                if (methodMo1011b3 != null) {
                    if (MainHook.uniqueMetaStore.add(AbstractC0174d.m354j("hide-recent-forward-focus-", methodMo1011b3))) {
                        AbstractC0514f.m1027d(methodMo1011b3, new C0848J0(this, 1));
                        break;
                    }
                }
                break;
            default:
                Method methodMo1011b4 = AbstractC0514f.f1622b.mo1011b(ListView.class, "setAdapter", ListAdapter.class);
                if (methodMo1011b4 != null) {
                    if (MainHook.uniqueMetaStore.add("hide-share-select-set-adapter-" + methodMo1011b4)) {
                        AbstractC0514f.m1027d(methodMo1011b4, new C0886a1(this, 6));
                    }
                }
                C0886a1 c0886a1 = new C0886a1(this, 5);
                Method methodMo1011b5 = AbstractC0514f.f1622b.mo1011b(ListView.class, "dispatchDraw", Canvas.class);
                if (methodMo1011b5 != null) {
                    if (MainHook.uniqueMetaStore.add("hide-share-select-dispatch-draw-" + methodMo1011b5)) {
                        AbstractC0514f.m1027d(methodMo1011b5, c0886a1);
                    }
                }
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public Set m1749m() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.f2931i < 300) {
            return this.f2932j;
        }
        ((C0808h) AbstractC0503h.m988u(C0808h.class)).m1474c();
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
            String str2 = (String) obj;
            if (!AbstractC0307q.m534d0(str2)) {
                boolean z3 = AbstractC1126i.f3786a;
                if (!C1124g.m2429e(str2)) {
                    arrayList3.add(obj);
                }
            }
        }
        Set setM265B0 = AbstractC0123k.m265B0(arrayList3);
        if (!setM265B0.equals(this.f2932j)) {
            this.f2930h.clear();
            ((WeakHashMap) this.f2934l).clear();
        }
        this.f2931i = jCurrentTimeMillis;
        this.f2932j = setM265B0;
        this.f2933k = m1726l(setM265B0);
        return setM265B0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public Set m1750n() {
        Set setM265B0;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.f2931i < 300) {
            return this.f2932j;
        }
        ((C0808h) AbstractC0503h.m988u(C0808h.class)).m1474c();
        boolean z2 = AbstractC1126i.f3786a;
        if (C1124g.m2448x()) {
            ArrayList arrayListM266h0 = AbstractC0123k.m266h0(!C1124g.m2443s() ? C0131s.f426a : new ArrayList(((C0808h) AbstractC0503h.m988u(C0808h.class)).f2684a));
            ArrayList arrayList = new ArrayList();
            for (Object obj : arrayListM266h0) {
                String str = (String) obj;
                if (!AbstractC0307q.m534d0(str)) {
                    boolean z3 = AbstractC1126i.f3786a;
                    if (!C1124g.m2429e(str)) {
                        arrayList.add(obj);
                    }
                }
            }
            setM265B0 = AbstractC0123k.m265B0(arrayList);
        } else {
            setM265B0 = C0133u.f428a;
        }
        this.f2931i = jCurrentTimeMillis;
        this.f2932j = setM265B0;
        return setM265B0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u */
    public boolean m1751u(List list, Set set) {
        if (!AbstractC0231o.m426b(list)) {
            list = null;
        }
        if (list == null) {
            return false;
        }
        int size = list.size();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String strM1731s = m1731s(this, it.next());
            if (strM1731s != null && set.contains(strM1731s)) {
                it.remove();
            }
        }
        return list.size() != size;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: v */
    public boolean m1752v(List list, Set set) {
        List list2 = AbstractC0231o.m426b(list) ? list : null;
        if (list2 != null) {
            WeakHashMap weakHashMap = this.f2924b;
            Object arrayList = weakHashMap.get(list);
            if (arrayList == null) {
                arrayList = new ArrayList(list2);
                weakHashMap.put(list, arrayList);
            }
            List list3 = (List) arrayList;
            for (Object obj : list2) {
                String strM1731s = m1731s(this, obj);
                if (strM1731s != null) {
                    if (!list3.isEmpty()) {
                        Iterator it = list3.iterator();
                        while (it.hasNext()) {
                            if (AbstractC0223g.m414a(m1731s(this, it.next()), strM1731s)) {
                                break;
                            }
                        }
                    }
                    list3.add(obj);
                } else {
                    if (!list3.isEmpty()) {
                        Iterator it2 = list3.iterator();
                        while (it2.hasNext()) {
                            if (it2.next() == obj) {
                                break;
                            }
                        }
                    }
                    list3.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : list3) {
                String strM1731s2 = m1731s(this, obj2);
                if (strM1731s2 == null || !set.contains(strM1731s2)) {
                    arrayList2.add(obj2);
                }
            }
            if (list2.size() == arrayList2.size()) {
                int size = list2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    if (list2.get(i2) == arrayList2.get(i2)) {
                    }
                }
            }
            list2.clear();
            list2.addAll(arrayList2);
            return true;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w */
    public boolean m1753w(Map map, Set set) {
        Map map2 = AbstractC0231o.m427c(map) ? map : null;
        if (map2 == null) {
            return false;
        }
        WeakHashMap weakHashMap = this.f2930h;
        Object obj = weakHashMap.get(map);
        Object obj2 = obj;
        if (obj == null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.putAll(map2);
            weakHashMap.put(map, linkedHashMap);
            obj2 = linkedHashMap;
        }
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) obj2;
        for (Map.Entry entry : map2.entrySet()) {
            linkedHashMap2.putIfAbsent(entry.getKey(), entry.getValue());
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
            Object key = entry2.getKey();
            Object value = entry2.getValue();
            String strM1731s = m1731s(this, key);
            if (strM1731s == null) {
                strM1731s = m1731s(this, value);
            }
            if (strM1731s == null || !set.contains(strM1731s)) {
                linkedHashMap3.put(key, value);
            }
        }
        if (map2.size() == linkedHashMap3.size()) {
            Set<Map.Entry> setEntrySet = map2.entrySet();
            if (setEntrySet != null && setEntrySet.isEmpty()) {
                return false;
            }
            for (Map.Entry entry3 : setEntrySet) {
                if (linkedHashMap3.get(entry3.getKey()) == entry3.getValue()) {
                }
            }
            return false;
        }
        map2.clear();
        map2.putAll(linkedHashMap3);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007e  */
    /* JADX INFO: renamed from: x */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean m1754x(Object obj, Set set) {
        boolean zBooleanValue;
        Object c0104d;
        C0020U c0020u;
        ArrayList<Field> arrayListM1722h = m1722h(obj.getClass());
        if (arrayListM1722h.isEmpty()) {
            return false;
        }
        for (Field field : arrayListM1722h) {
            if (!Modifier.isStatic(field.getModifiers())) {
                String name = field.getName();
                AbstractC0223g.m417d(name, "getName(...)");
                if (!name.equals("data") && ((c0020u = (C0020U) this.f2937o) == null || !c0020u.f159c.contains(name))) {
                    zBooleanValue = false;
                } else {
                    try {
                        field.setAccessible(true);
                        Object obj2 = field.get(obj);
                        c0104d = Boolean.valueOf(AbstractC0231o.m426b(obj2) && m1751u((List) obj2, set));
                    } catch (Throwable th) {
                        c0104d = new C0104d(th);
                    }
                    Object obj3 = Boolean.FALSE;
                    if (c0104d instanceof C0104d) {
                        c0104d = obj3;
                    }
                    zBooleanValue = ((Boolean) c0104d).booleanValue();
                }
            }
            if (zBooleanValue) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: y */
    public View m1755y(View view) {
        if (view == null) {
            return null;
        }
        if (m1745N(view)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View viewM1755y = m1755y(viewGroup.getChildAt(i2));
                if (viewM1755y != null) {
                    return viewM1755y;
                }
            }
        }
        return null;
    }
}
