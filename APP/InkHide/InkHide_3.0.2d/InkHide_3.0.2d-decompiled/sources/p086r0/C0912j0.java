package p086r0;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.activity.RunnableC0371b;
import com.p055lu.wxmask.bean.MaskItemBean;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedBridge;
import de.robv.android.xposed.callbacks.XC_LoadPackage;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import p001A0.AbstractC0039l;
import p001A0.C0026a;
import p001A0.C0035h;
import p001A0.C0048u;
import p001A0.C0052y;
import p001A0.C0053z;
import p004C.C0060d;
import p006D.AbstractC0079h;
import p009E0.AbstractC0105e;
import p009E0.C0104d;
import p011F0.AbstractC0120h;
import p011F0.AbstractC0123k;
import p011F0.AbstractC0129q;
import p011F0.C0131s;
import p011F0.C0133u;
import p027N0.AbstractC0223g;
import p034R0.C0243b;
import p040U0.AbstractC0299i;
import p040U0.AbstractC0307q;
import p052b1.AbstractC0503h;
import p054c0.AbstractC0514f;
import p062e0.InterfaceC0551a;
import p084q0.C0808h;
import p102z0.AbstractC1126i;
import p102z0.C1124g;

/* JADX INFO: renamed from: r0.j0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0912j0 implements InterfaceC0551a {

    /* JADX INFO: renamed from: a */
    public final WeakHashMap f3219a = new WeakHashMap();

    /* JADX INFO: renamed from: b */
    public final Set f3220b = Collections.newSetFromMap(new IdentityHashMap());

    /* JADX INFO: renamed from: c */
    public final Set f3221c = Collections.newSetFromMap(new WeakHashMap());

    /* JADX INFO: renamed from: d */
    public final Set f3222d = Collections.newSetFromMap(new WeakHashMap());

    /* JADX INFO: renamed from: e */
    public final Set f3223e = Collections.newSetFromMap(new IdentityHashMap());

    /* JADX INFO: renamed from: f */
    public final IdentityHashMap f3224f = new IdentityHashMap();

    /* JADX INFO: renamed from: g */
    public final IdentityHashMap f3225g = new IdentityHashMap();

    /* JADX INFO: renamed from: h */
    public final LinkedHashSet f3226h;

    /* JADX INFO: renamed from: i */
    public final IdentityHashMap f3227i;

    /* JADX INFO: renamed from: j */
    public final IdentityHashMap f3228j;

    /* JADX INFO: renamed from: k */
    public final WeakHashMap f3229k;

    /* JADX INFO: renamed from: l */
    public C0053z f3230l;

    /* JADX INFO: renamed from: m */
    public Context f3231m;

    /* JADX INFO: renamed from: n */
    public int f3232n;

    /* JADX INFO: renamed from: o */
    public WeakReference f3233o;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0912j0() {
        new IdentityHashMap();
        this.f3226h = new LinkedHashSet();
        this.f3227i = new IdentityHashMap();
        this.f3228j = new IdentityHashMap();
        this.f3229k = new WeakHashMap();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static Object m1960a(Object obj, String str, Object... objArr) {
        Object c0104d;
        Method method;
        Method method2;
        try {
            ArrayList arrayList = new ArrayList(objArr.length);
            int length = objArr.length;
            int i2 = 0;
            for (int i3 = 0; i3 < length; i3++) {
                Object obj2 = objArr[i3];
                arrayList.add(obj2 != null ? obj2.getClass() : Object.class);
            }
            Method[] methods = obj.getClass().getMethods();
            AbstractC0223g.m417d(methods, "getMethods(...)");
            int length2 = methods.length;
            int i4 = 0;
            loop1: while (true) {
                if (i4 >= length2) {
                    method = null;
                    break;
                }
                method = methods[i4];
                if (AbstractC0223g.m414a(method.getName(), str) && method.getParameterTypes().length == objArr.length) {
                    Class<?>[] parameterTypes = method.getParameterTypes();
                    AbstractC0223g.m417d(parameterTypes, "getParameterTypes(...)");
                    Iterable iterableM256d0 = AbstractC0120h.m256d0(parameterTypes);
                    if (!(iterableM256d0 instanceof Collection) || !((Collection) iterableM256d0).isEmpty()) {
                        Iterator it = iterableM256d0.iterator();
                        while (((C0243b) it).f588c) {
                            int iM458a = ((C0243b) it).m458a();
                            if (objArr[iM458a] != null) {
                                Class<?> cls = method.getParameterTypes()[iM458a];
                                Object obj3 = objArr[iM458a];
                                AbstractC0223g.m415b(obj3);
                                if (cls.isAssignableFrom(obj3.getClass())) {
                                }
                            }
                        }
                        break loop1;
                    }
                    break;
                }
                i4++;
            }
            if (method == null || (c0104d = method.invoke(obj, Arrays.copyOf(objArr, objArr.length))) == null) {
                Method[] declaredMethods = obj.getClass().getDeclaredMethods();
                AbstractC0223g.m417d(declaredMethods, "getDeclaredMethods(...)");
                int length3 = declaredMethods.length;
                loop2: while (true) {
                    if (i2 >= length3) {
                        method2 = null;
                        break;
                    }
                    method2 = declaredMethods[i2];
                    if (AbstractC0223g.m414a(method2.getName(), str) && method2.getParameterTypes().length == objArr.length) {
                        Class<?>[] parameterTypes2 = method2.getParameterTypes();
                        AbstractC0223g.m417d(parameterTypes2, "getParameterTypes(...)");
                        Iterable iterableM256d02 = AbstractC0120h.m256d0(parameterTypes2);
                        if (!(iterableM256d02 instanceof Collection) || !((Collection) iterableM256d02).isEmpty()) {
                            Iterator it2 = iterableM256d02.iterator();
                            while (((C0243b) it2).f588c) {
                                int iM458a2 = ((C0243b) it2).m458a();
                                if (objArr[iM458a2] != null) {
                                    Class<?> cls2 = method2.getParameterTypes()[iM458a2];
                                    Object obj4 = objArr[iM458a2];
                                    AbstractC0223g.m415b(obj4);
                                    if (cls2.isAssignableFrom(obj4.getClass())) {
                                    }
                                }
                            }
                            break loop2;
                        }
                        break;
                    }
                    i2++;
                }
                if (method2 != null) {
                    method2.setAccessible(true);
                    c0104d = method2.invoke(obj, Arrays.copyOf(objArr, objArr.length));
                } else {
                    c0104d = null;
                }
            }
        } catch (Throwable th) {
            c0104d = new C0104d(th);
        }
        if (c0104d instanceof C0104d) {
            return null;
        }
        return c0104d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:42:0x008e */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [F0.u] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.AbstractCollection, java.util.LinkedHashSet] */
    /* JADX INFO: renamed from: b */
    public static Set m1961b(Object obj, int i2, Set set) {
        Object c0104d;
        ?? linkedHashSet = C0133u.f428a;
        if (obj != null && i2 <= 3) {
            if (obj instanceof CharSequence) {
                String string = AbstractC0299i.m507C0(obj.toString()).toString();
                if (!AbstractC0307q.m534d0(string)) {
                    return AbstractC0079h.m175T(string);
                }
            } else if (set.add(obj)) {
                Class<?> cls = obj.getClass();
                if (!AbstractC0307q.m538h0(cls.getName(), false, "java.") && !AbstractC0307q.m538h0(cls.getName(), false, "android.")) {
                    linkedHashSet = new LinkedHashSet();
                    Field[] declaredFields = cls.getDeclaredFields();
                    AbstractC0223g.m417d(declaredFields, "getDeclaredFields(...)");
                    for (Field field : declaredFields) {
                        if (!Modifier.isStatic(field.getModifiers())) {
                            try {
                                field.setAccessible(true);
                                c0104d = m1961b(field.get(obj), 1 + i2, set);
                            } catch (Throwable th) {
                                c0104d = new C0104d(th);
                            }
                            if (c0104d instanceof C0104d) {
                                c0104d = null;
                            }
                            Set set2 = (Set) c0104d;
                            if (set2 != null) {
                                linkedHashSet.addAll(set2);
                            }
                        }
                    }
                }
            }
        }
        return linkedHashSet;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static final void m1962c(ArrayList arrayList, View view) {
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
                m1962c(arrayList, childAt);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static boolean m1963e(View view, String str) {
        if (AbstractC0223g.m414a(m1972o(view), str)) {
            return true;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = viewGroup.getChildAt(i2);
                AbstractC0223g.m417d(childAt, "getChildAt(...)");
                if (m1963e(childAt, str)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static Set m1964f(Set set) {
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
    /* JADX INFO: renamed from: g */
    public static Set m1965g() {
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
        return AbstractC0123k.m265B0(arrayList3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static String m1966h(Object obj, int i2, Set set) {
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
                                c0104d = m1966h(field.get(obj), i2 + 1, set);
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
    /* JADX INFO: renamed from: i */
    public static /* synthetic */ String m1967i(C0912j0 c0912j0, Object obj) {
        Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap());
        c0912j0.getClass();
        return m1966h(obj, 0, setNewSetFromMap);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static Activity m1968j(Context context) {
        for (int i2 = 0; i2 < 12; i2++) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            if (!(context instanceof ContextWrapper)) {
                return null;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Duplicate block (B:5:0x000c) to fix multi-entry loop: BACK_EDGE: B:5:0x000c -> B:6:0x000d */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x000d, code lost:
    
        r2 = null;
     */
    /* JADX INFO: renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ListView m1969k(View view) {
        View view2;
        Object parent = view.getParent();
        if (parent instanceof View) {
            view2 = (View) parent;
            while (view2 != null) {
                if (view2 instanceof ListView) {
                    return (ListView) view2;
                }
                Object parent2 = view2.getParent();
                if (parent2 instanceof View) {
                    view2 = (View) parent2;
                }
            }
            return null;
        }
        view2 = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public static boolean m1970l(View view, String str) {
        if (view instanceof TextView) {
            CharSequence text = ((TextView) view).getText();
            if (AbstractC0223g.m414a(text != null ? text.toString() : null, str)) {
                return true;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = viewGroup.getChildAt(i2);
                AbstractC0223g.m417d(childAt, "getChildAt(...)");
                if (m1970l(childAt, str)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public static Object m1971n(View view) {
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
    /* JADX INFO: renamed from: o */
    public static String m1972o(View view) {
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
    /* JADX INFO: renamed from: t */
    public static boolean m1973t(View view) {
        if (m1963e(view, "mie") && m1963e(view, "kbq")) {
            return true;
        }
        if (m1963e(view, "mie") && m1963e(view, "odf")) {
            return true;
        }
        return m1963e(view, "pzy") && m1963e(view, "n5b");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: x */
    public static boolean m1974x(View view) {
        for (Class<?> superclass = view.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
            if (superclass.getName().equals("androidx.recyclerview.widget.RecyclerView") || superclass.getName().equals("android.support.v7.widget.RecyclerView") || superclass.getName().endsWith(".RecyclerView") || superclass.getName().endsWith(".WxRecyclerView")) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: z */
    public static String m1975z(Method method) {
        String name = method.getDeclaringClass().getName();
        String name2 = method.getName();
        Class<?>[] parameterTypes = method.getParameterTypes();
        AbstractC0223g.m417d(parameterTypes, "getParameterTypes(...)");
        return name + "#" + name2 + "(" + AbstractC0120h.m260h0(parameterTypes, ",", new C0863P(7), 30) + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: A */
    public final void m1976A(Object... objArr) {
        int i2 = this.f3232n;
        if (i2 >= 80) {
            return;
        }
        this.f3232n = i2 + 1;
        XposedBridge.log("MaskContactSelectProbe(group): ".concat(AbstractC0120h.m260h0(objArr, " | ", new C0863P(5), 30)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: B */
    public final void m1977B(ListView listView) {
        ListAdapter wrappedAdapter;
        ListAdapter adapter = listView.getAdapter();
        if (adapter == null) {
            return;
        }
        Set set = this.f3223e;
        set.remove(adapter);
        IdentityHashMap identityHashMap = this.f3227i;
        identityHashMap.remove(adapter);
        if (!(adapter instanceof HeaderViewListAdapter) || (wrappedAdapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter()) == null) {
            return;
        }
        set.remove(wrappedAdapter);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: C */
    public final void m1978C(View view) {
        ListAdapter adapter;
        Object c0104d;
        Object c0104d2;
        Object objM1989s;
        String strM1967i;
        ListView listViewM1969k = m1969k(view);
        if (listViewM1969k == null || (adapter = listViewM1969k.getAdapter()) == null) {
            return;
        }
        try {
            c0104d = Integer.valueOf(listViewM1969k.getPositionForView(view));
        } catch (Throwable th) {
            c0104d = new C0104d(th);
        }
        if (c0104d instanceof C0104d) {
            c0104d = -1;
        }
        int iIntValue = ((Number) c0104d).intValue();
        if (iIntValue < 0) {
            return;
        }
        boolean zContains = this.f3223e.contains(adapter);
        IdentityHashMap identityHashMap = this.f3228j;
        IdentityHashMap identityHashMap2 = this.f3227i;
        if (zContains) {
            List list = (List) identityHashMap2.get(adapter);
            if (list == null) {
                Set setM1965g = m1965g();
                Set setM1964f = m1964f(setM1965g);
                Method method = (Method) this.f3225g.get(adapter.getClass());
                Integer num = null;
                if (method != null) {
                    try {
                        c0104d2 = XposedBridge.invokeOriginalMethod(method, adapter, new Object[0]);
                    } catch (Throwable th2) {
                        c0104d2 = new C0104d(th2);
                    }
                    if (c0104d2 instanceof C0104d) {
                        c0104d2 = null;
                    }
                    if (c0104d2 instanceof Integer) {
                        num = (Integer) c0104d2;
                    }
                }
                if (num != null) {
                    int iIntValue2 = num.intValue();
                    ArrayList arrayList = new ArrayList();
                    Set set = (Set) identityHashMap.get(adapter);
                    if (set == null) {
                        set = C0133u.f428a;
                    }
                    for (int i2 = 0; i2 < iIntValue2; i2++) {
                        if (!set.contains(Integer.valueOf(i2)) && ((strM1967i = m1967i(this, (objM1989s = m1989s(adapter, i2)))) == null || AbstractC0307q.m534d0(strM1967i) || !setM1965g.contains(strM1967i))) {
                            Set setM1961b = m1961b(objM1989s, 0, Collections.newSetFromMap(new IdentityHashMap()));
                            if (setM1961b.isEmpty()) {
                                arrayList.add(Integer.valueOf(i2));
                            } else {
                                Iterator it = setM1961b.iterator();
                                while (it.hasNext()) {
                                    if (setM1964f.contains((String) it.next())) {
                                        break;
                                    }
                                }
                                arrayList.add(Integer.valueOf(i2));
                            }
                        }
                    }
                    identityHashMap2.put(adapter, arrayList);
                    list = arrayList;
                } else {
                    list = C0131s.f426a;
                }
            }
            Integer num2 = (Integer) AbstractC0123k.m269k0(list, iIntValue);
            if (num2 != null) {
                iIntValue = num2.intValue();
            }
        }
        Object linkedHashSet = identityHashMap.get(adapter);
        if (linkedHashSet == null) {
            linkedHashSet = new LinkedHashSet();
            identityHashMap.put(adapter, linkedHashSet);
        }
        if (((Set) linkedHashSet).add(Integer.valueOf(iIntValue))) {
            identityHashMap2.remove(adapter);
            try {
                listViewM1969k.post(new RunnableC0371b(6, listViewM1969k));
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: D */
    public final boolean m1979D(View view) {
        int iIntValue;
        int iIntValue2;
        C0906h0 c0906h0 = (C0906h0) this.f3219a.remove(view);
        boolean z2 = false;
        if (c0906h0 == null) {
            return false;
        }
        int visibility = view.getVisibility();
        boolean z3 = true;
        int i2 = c0906h0.f3199a;
        boolean z4 = visibility != i2;
        view.setVisibility(i2);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            Integer num = c0906h0.f3200b;
            if (num != null && layoutParams.width != (iIntValue2 = num.intValue())) {
                layoutParams.width = iIntValue2;
                z2 = true;
            }
            Integer num2 = c0906h0.f3201c;
            if (num2 != null && layoutParams.height != (iIntValue = num2.intValue())) {
                layoutParams.height = iIntValue;
                z2 = true;
            }
            if (z2) {
                view.setLayoutParams(layoutParams);
            } else {
                z3 = z4;
            }
            z4 = z3;
        }
        if (z4) {
            view.requestLayout();
        }
        return z4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Duplicate block (B:61:0x00ac) to fix multi-entry loop: BACK_EDGE: B:61:0x00ac -> B:62:0x00ad */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x00ad, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0067 A[PHI: r3
  0x0067: PHI (r3v27 java.lang.String) = (r3v7 java.lang.String), (r3v26 java.lang.String) binds: [B:34:0x0065, B:56:0x009e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0078  */
    /* JADX INFO: renamed from: E */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m1980E(View view) {
        View view2;
        View view3;
        Number number;
        Object objM1971n;
        Object c0104d;
        int positionForView;
        ListAdapter adapter;
        Object c0104d2;
        ListView listViewM1969k = m1969k(view);
        String strM1967i = null;
        if (listViewM1969k == null) {
            view2 = view;
        } else {
            Object parent = view.getParent();
            View view4 = parent instanceof View ? (View) parent : null;
            view2 = view;
            while (view4 != null && view4 != listViewM1969k) {
                Object parent2 = view4.getParent();
                View view5 = parent2 instanceof View ? (View) parent2 : null;
                view2 = view4;
                view4 = view5;
            }
        }
        if (!m1992w(view.getRootView())) {
            return m1979D(view2);
        }
        if (!m1973t(view)) {
            return m1979D(view2);
        }
        boolean z2 = AbstractC1126i.f3786a;
        if (!C1124g.m2448x()) {
            return m1979D(view2);
        }
        Set setM1965g = m1965g();
        if (setM1965g.isEmpty()) {
            return m1979D(view2);
        }
        String strM1985m = m1985m(view);
        if (strM1985m == null) {
            ListView listViewM1969k2 = m1969k(view);
            if (listViewM1969k2 != null && (positionForView = listViewM1969k2.getPositionForView(view)) >= 0) {
                if (positionForView >= 0 && (adapter = listViewM1969k2.getAdapter()) != null) {
                    Object objM1989s = m1989s(adapter, positionForView);
                    if (objM1989s == null) {
                        try {
                            c0104d2 = adapter.getItem(positionForView);
                        } catch (Throwable th) {
                            c0104d2 = new C0104d(th);
                        }
                        objM1989s = c0104d2 instanceof C0104d ? null : c0104d2;
                    }
                    strM1985m = m1967i(this, objM1989s);
                    if (strM1985m != null) {
                        strM1967i = strM1985m;
                    }
                }
            }
            Object parent3 = view.getParent();
            if (parent3 instanceof View) {
                view3 = (View) parent3;
                while (true) {
                    if (view3 == null) {
                        view3 = null;
                        break;
                    }
                    if (m1974x(view3)) {
                        break;
                    }
                    Object parent4 = view3.getParent();
                    if (parent4 instanceof View) {
                        view3 = (View) parent4;
                    }
                }
                if (view3 != null) {
                    String[] strArr = {"getChildAdapterPosition", "getChildLayoutPosition"};
                    int i2 = 0;
                    while (true) {
                        if (i2 < 2) {
                            Object objM1960a = m1960a(view3, strArr[i2], view);
                            number = objM1960a instanceof Number ? (Number) objM1960a : null;
                            if (number != null) {
                                break;
                            }
                            i2++;
                        } else {
                            Object objM1960a2 = m1960a(view3, "findContainingViewHolder", view);
                            if (objM1960a2 == null && (objM1960a2 = m1960a(view3, "getChildViewHolder", view)) == null) {
                                number = null;
                            } else {
                                String[] strArr2 = {"getBindingAdapterPosition", "getAbsoluteAdapterPosition", "getAdapterPosition", "getLayoutPosition"};
                                for (int i3 = 0; i3 < 4; i3++) {
                                    Object objM1960a3 = m1960a(objM1960a2, strArr2[i3], new Object[0]);
                                    Number number2 = objM1960a3 instanceof Number ? (Number) objM1960a3 : null;
                                    if (number2 != null) {
                                        number = number2;
                                        break;
                                    }
                                }
                                number = null;
                            }
                        }
                    }
                    if (number != null) {
                        int iIntValue = number.intValue();
                        if (iIntValue >= 0 && (objM1971n = m1971n(view3)) != null) {
                            String[] strArr3 = {"getItem", "getItemAt", "getItemByPosition"};
                            int i4 = 0;
                            while (true) {
                                if (i4 < 3) {
                                    try {
                                        c0104d = AbstractC0514f.f1622b.mo1012c(objM1971n, strArr3[i4], Integer.valueOf(iIntValue));
                                    } catch (Throwable th2) {
                                        c0104d = new C0104d(th2);
                                    }
                                    if (c0104d instanceof C0104d) {
                                        c0104d = null;
                                    }
                                    if (c0104d != null) {
                                        break;
                                    }
                                    i4++;
                                } else {
                                    Field[] declaredFields = objM1971n.getClass().getDeclaredFields();
                                    AbstractC0223g.m417d(declaredFields, "getDeclaredFields(...)");
                                    for (Field field : declaredFields) {
                                        if (!Modifier.isStatic(field.getModifiers())) {
                                            try {
                                                field.setAccessible(true);
                                                Object obj = field.get(objM1971n);
                                                c0104d = (!(obj instanceof List) || iIntValue >= ((List) obj).size()) ? null : ((List) obj).get(iIntValue);
                                            } catch (Throwable th3) {
                                                c0104d = new C0104d(th3);
                                            }
                                            if (c0104d instanceof C0104d) {
                                                c0104d = null;
                                            }
                                            if (c0104d != null) {
                                                break;
                                            }
                                        }
                                    }
                                }
                            }
                            if (c0104d != null) {
                                strM1967i = m1967i(this, c0104d);
                            }
                        } else {
                            c0104d = null;
                            if (c0104d != null) {
                            }
                        }
                    }
                }
            }
            view3 = null;
        }
        if (strM1967i != null && !AbstractC0307q.m534d0(strM1967i) && setM1965g.contains(strM1967i)) {
            m1978C(view);
            return m1986p(view2);
        }
        Set setM1964f = m1964f(setM1965g);
        ArrayList arrayList = new ArrayList();
        m1962c(arrayList, view);
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (setM1964f.contains((String) it.next())) {
                    m1978C(view);
                    return m1986p(view2);
                }
            }
        }
        return m1979D(view2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: F */
    public final void m1981F(View view) {
        if (view == null) {
            return;
        }
        boolean z2 = view instanceof ListView;
        WeakHashMap weakHashMap = this.f3229k;
        if (z2) {
            ListView listView = (ListView) view;
            if (m1990u(listView)) {
                this.f3222d.add(view);
                weakHashMap.put(view, Long.valueOf(System.currentTimeMillis()));
                m1982G(listView);
                return;
            }
        }
        if (m1991v(view)) {
            this.f3221c.add(view);
            weakHashMap.put(view, Long.valueOf(System.currentTimeMillis()));
            Object objM1971n = m1971n(view);
            if (objM1971n != null) {
                m1987q(objM1971n.getClass());
            }
            m1983H(view);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                m1981F(viewGroup.getChildAt(i2));
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: G */
    public final void m1982G(ListView listView) {
        m1977B(listView);
        int childCount = listView.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = listView.getChildAt(i2);
            AbstractC0223g.m417d(childAt, "getChildAt(...)");
            m1980E(childAt);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: H */
    public final void m1983H(View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = viewGroup.getChildAt(i2);
                AbstractC0223g.m417d(childAt, "getChildAt(...)");
                m1980E(childAt);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final boolean m1984d(ViewGroup viewGroup) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        WeakHashMap weakHashMap = this.f3229k;
        Long l2 = (Long) weakHashMap.get(viewGroup);
        if (jCurrentTimeMillis - (l2 != null ? l2.longValue() : 0L) < 120) {
            return false;
        }
        weakHashMap.put(viewGroup, Long.valueOf(jCurrentTimeMillis));
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0074 A[PHI: r11
  0x0074: PHI (r11v6 java.lang.Class) = (r11v5 java.lang.Class), (r11v24 java.lang.Class) binds: [B:9:0x0064, B:11:0x0071] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0093 A[PHI: r6
  0x0093: PHI (r6v3 java.lang.Class) = (r6v2 java.lang.Class), (r6v6 java.lang.Class) binds: [B:14:0x0081, B:16:0x0090] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c8 A[PHI: r11
  0x00c8: PHI (r11v10 java.lang.Class) = (r11v9 java.lang.Class), (r11v22 java.lang.Class) binds: [B:22:0x00b8, B:24:0x00c5] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p062e0.InterfaceC0551a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void handleHook(Context context, XC_LoadPackage.LoadPackageParam loadPackageParam) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            applicationContext = context;
        }
        this.f3231m = applicationContext;
        this.f3230l = AbstractC0039l.m69g(context);
        CopyOnWriteArrayList copyOnWriteArrayList = C0052y.f291a;
        C0052y.m98c(context, new C0048u("group-create-contact", "选择联系人密友隐藏", new C0863P(6), new C0035h(context, 14), new C0060d(2, this), new C0026a(16)));
        Method methodMo1011b = AbstractC0514f.f1622b.mo1011b(ListView.class, "setAdapter", ListAdapter.class);
        if (methodMo1011b != null) {
            AbstractC0514f.m1027d(methodMo1011b, new C0909i0(this, 3));
        }
        ClassLoader classLoader = loadPackageParam.classLoader;
        AbstractC0223g.m417d(classLoader, "classLoader");
        Class clsMo1021l = AbstractC0514f.f1622b.mo1021l(classLoader, "androidx.recyclerview.widget.RecyclerView");
        if (clsMo1021l == null) {
            ClassLoader classLoader2 = loadPackageParam.classLoader;
            AbstractC0223g.m417d(classLoader2, "classLoader");
            clsMo1021l = AbstractC0514f.f1622b.mo1021l(classLoader2, "android.support.v7.widget.RecyclerView");
            if (clsMo1021l != null) {
                ClassLoader classLoader3 = loadPackageParam.classLoader;
                AbstractC0223g.m417d(classLoader3, "classLoader");
                Class clsMo1021l2 = AbstractC0514f.f1622b.mo1021l(classLoader3, "androidx.recyclerview.widget.RecyclerView$Adapter");
                if (clsMo1021l2 == null) {
                    ClassLoader classLoader4 = loadPackageParam.classLoader;
                    AbstractC0223g.m417d(classLoader4, "classLoader");
                    clsMo1021l2 = AbstractC0514f.f1622b.mo1021l(classLoader4, "android.support.v7.widget.RecyclerView$Adapter");
                    if (clsMo1021l2 != null) {
                        Method methodMo1011b2 = AbstractC0514f.f1622b.mo1011b(clsMo1021l, "setAdapter", clsMo1021l2);
                        if (methodMo1011b2 != null) {
                            AbstractC0514f.m1027d(methodMo1011b2, new C0909i0(this, 6));
                        }
                    }
                }
            }
        }
        ClassLoader classLoader5 = loadPackageParam.classLoader;
        AbstractC0223g.m417d(classLoader5, "classLoader");
        Class clsMo1021l3 = AbstractC0514f.f1622b.mo1021l(classLoader5, "androidx.recyclerview.widget.RecyclerView");
        Class cls = Boolean.TYPE;
        if (clsMo1021l3 == null) {
            ClassLoader classLoader6 = loadPackageParam.classLoader;
            AbstractC0223g.m417d(classLoader6, "classLoader");
            clsMo1021l3 = AbstractC0514f.f1622b.mo1021l(classLoader6, "android.support.v7.widget.RecyclerView");
            if (clsMo1021l3 != null) {
                C0909i0 c0909i0 = new C0909i0(this, 5);
                Class cls2 = Integer.TYPE;
                Method methodMo1011b3 = AbstractC0514f.f1622b.mo1011b(clsMo1021l3, "onLayout", cls, cls2, cls2, cls2, cls2);
                if (methodMo1011b3 != null) {
                    AbstractC0514f.m1027d(methodMo1011b3, c0909i0);
                }
                Method methodMo1011b4 = AbstractC0514f.f1622b.mo1011b(clsMo1021l3, "dispatchDraw", Canvas.class);
                if (methodMo1011b4 != null) {
                    AbstractC0514f.m1027d(methodMo1011b4, c0909i0);
                }
            }
        }
        m1988r(Activity.class, "startActivity", "startActivities", "startActivityForResult");
        m1988r(ContextWrapper.class, "startActivity", "startActivities");
        Method methodMo1011b5 = AbstractC0514f.f1622b.mo1011b(Activity.class, "onResume", new Object[0]);
        if (methodMo1011b5 != null) {
            AbstractC0514f.m1027d(methodMo1011b5, new C0909i0(this, 4));
        }
        Method methodMo1011b6 = AbstractC0514f.f1622b.mo1011b(Activity.class, "onWindowFocusChanged", cls);
        if (methodMo1011b6 != null) {
            AbstractC0514f.m1027d(methodMo1011b6, new C0909i0(this, 0));
        }
        Method methodMo1011b7 = AbstractC0514f.f1622b.mo1011b(ViewGroup.class, "dispatchDraw", Canvas.class);
        if (methodMo1011b7 != null) {
            AbstractC0514f.m1027d(methodMo1011b7, new C0909i0(this, 7));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public final String m1985m(View view) {
        String strM1967i = m1967i(this, view.getTag());
        if (strM1967i != null) {
            return strM1967i;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            AbstractC0223g.m417d(childAt, "getChildAt(...)");
            String strM1985m = m1985m(childAt);
            if (strM1985m != null) {
                return strM1985m;
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public final boolean m1986p(View view) {
        boolean z2;
        WeakHashMap weakHashMap = this.f3219a;
        if (!weakHashMap.containsKey(view) && view.getVisibility() == 8) {
            return false;
        }
        if (!weakHashMap.containsKey(view)) {
            int visibility = view.getVisibility();
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            Integer numValueOf = layoutParams != null ? Integer.valueOf(layoutParams.width) : null;
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            weakHashMap.put(view, new C0906h0(visibility, numValueOf, layoutParams2 != null ? Integer.valueOf(layoutParams2.height) : null));
        }
        boolean z3 = true;
        if (view.getVisibility() != 8) {
            view.setVisibility(8);
            z2 = true;
        } else {
            z2 = false;
        }
        ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
        if (layoutParams3 != null) {
            if (layoutParams3.width != 0) {
                layoutParams3.width = 0;
                z2 = true;
            }
            if (layoutParams3.height != 0) {
                layoutParams3.height = 0;
            } else {
                z3 = z2;
            }
            if (z3) {
                view.setLayoutParams(layoutParams3);
            }
            z2 = z3;
        }
        if (z2) {
            view.setMinimumHeight(0);
            view.requestLayout();
        }
        return z2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public final void m1987q(Class cls) {
        if (this.f3220b.add(cls)) {
            Method[] methods = cls.getMethods();
            AbstractC0223g.m417d(methods, "getMethods(...)");
            ArrayList arrayList = new ArrayList();
            for (Method method : methods) {
                if (AbstractC0223g.m414a(method.getName(), "onBindViewHolder") && method.getParameterTypes().length >= 2 && AbstractC0223g.m414a(method.getParameterTypes()[1], Integer.TYPE)) {
                    arrayList.add(method);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                AbstractC0514f.m1027d((Method) it.next(), new C0909i0(this, 1));
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public final void m1988r(Class cls, String... strArr) {
        XC_MethodHook.Unhook c0104d;
        Class<?> componentType;
        Method[] methods = cls.getMethods();
        AbstractC0223g.m417d(methods, "getMethods(...)");
        List listM262j0 = AbstractC0120h.m262j0(methods);
        Method[] declaredMethods = cls.getDeclaredMethods();
        AbstractC0223g.m417d(declaredMethods, "getDeclaredMethods(...)");
        ArrayList arrayListM273o0 = AbstractC0123k.m273o0(listM262j0, AbstractC0120h.m262j0(declaredMethods));
        ArrayList arrayList = new ArrayList();
        for (Object obj : arrayListM273o0) {
            Method method = (Method) obj;
            if (AbstractC0120h.m254b0(strArr, method.getName())) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                AbstractC0223g.m417d(parameterTypes, "getParameterTypes(...)");
                for (Class<?> cls2 : parameterTypes) {
                    if (Intent.class.isAssignableFrom(cls2) || (cls2.isArray() && (componentType = cls2.getComponentType()) != null && Intent.class.isAssignableFrom(componentType))) {
                        arrayList.add(obj);
                        break;
                    }
                }
            }
        }
        HashSet hashSet = new HashSet();
        ArrayList<Method> arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            Method method2 = (Method) obj2;
            AbstractC0223g.m415b(method2);
            if (hashSet.add(m1975z(method2))) {
                arrayList2.add(obj2);
            }
        }
        for (Method method3 : arrayList2) {
            LinkedHashSet linkedHashSet = this.f3226h;
            AbstractC0223g.m415b(method3);
            if (linkedHashSet.add(m1975z(method3))) {
                try {
                    method3.setAccessible(true);
                    c0104d = AbstractC0514f.f1622b.mo1014e(method3, new C0909i0(this, 2));
                } catch (Throwable th) {
                    c0104d = new C0104d(th);
                }
                if (AbstractC0105e.m246a(c0104d) != null) {
                    linkedHashSet.remove(m1975z(method3));
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public final Object m1989s(ListAdapter listAdapter, int i2) {
        Object c0104d;
        Method method = (Method) this.f3224f.get(listAdapter.getClass());
        if (method == null) {
            return null;
        }
        try {
            c0104d = XposedBridge.invokeOriginalMethod(method, listAdapter, new Integer[]{Integer.valueOf(i2)});
        } catch (Throwable th) {
            c0104d = new C0104d(th);
        }
        if (c0104d instanceof C0104d) {
            return null;
        }
        return c0104d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003c  */
    /* JADX INFO: renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m1990u(ListView listView) {
        List list;
        Set setM265B0;
        if (!m1992w(listView.getRootView())) {
            return false;
        }
        String strM1972o = m1972o(listView);
        C0053z c0053zM69g = this.f3230l;
        if (c0053zM69g != null) {
            list = c0053zM69g == null ? c0053zM69g.f297c : null;
            if (list == null) {
                list = C0131s.f426a;
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (!AbstractC0307q.m534d0((String) obj)) {
                    arrayList.add(obj);
                }
            }
            setM265B0 = AbstractC0123k.m265B0(AbstractC0123k.m273o0(arrayList, AbstractC0079h.m167E("mil")));
        } else {
            Context context = this.f3231m;
            if (context == null) {
                setM265B0 = AbstractC0079h.m175T("mil");
            } else {
                c0053zM69g = AbstractC0039l.m69g(context);
                if (c0053zM69g == null) {
                }
                if (list == null) {
                }
                ArrayList arrayList2 = new ArrayList();
                while (r2.hasNext()) {
                }
                setM265B0 = AbstractC0123k.m265B0(AbstractC0123k.m273o0(arrayList2, AbstractC0079h.m167E("mil")));
            }
        }
        if (setM265B0.contains(strM1972o)) {
            return true;
        }
        int childCount = listView.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = listView.getChildAt(i2);
            AbstractC0223g.m417d(childAt, "getChildAt(...)");
            if (m1973t(childAt)) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: v */
    public final boolean m1991v(View view) {
        if (m1974x(view) && m1992w(view.getRootView())) {
            String strM1972o = m1972o(view);
            if (AbstractC0223g.m414a(strM1972o, "mim") || AbstractC0223g.m414a(strM1972o, "q0l")) {
                return true;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = viewGroup.getChildAt(i2);
                    AbstractC0223g.m417d(childAt, "getChildAt(...)");
                    if (m1973t(childAt)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w */
    public final boolean m1992w(View view) {
        WeakReference weakReference;
        if (view == null) {
            return false;
        }
        Activity activityM1968j = m1968j(view.getContext());
        Activity activity = null;
        if (AbstractC0223g.m414a(activityM1968j != null ? activityM1968j.getClass().getName() : null, "com.tencent.mm.ui.transmit.SelectConversationUI")) {
            return false;
        }
        if (m1963e(view, "mil") && m1963e(view, "gz0") && m1963e(view, "m7g") && m1963e(view, "gze")) {
            return false;
        }
        Activity activityM1968j2 = m1968j(view.getContext());
        if (activityM1968j2 != null || ((weakReference = this.f3233o) != null && (activityM1968j2 = (Activity) weakReference.get()) != null && !activityM1968j2.isFinishing())) {
            activity = activityM1968j2;
        }
        if (activity != null) {
            return (activity.getClass().getName().equals("com.tencent.mm.ui.transmit.SelectConversationUI") || AbstractC0503h.m970F(activity) || !m1993y(activity.getClass().getName())) ? false : true;
        }
        if (m1963e(view, "mil")) {
            return false;
        }
        if (m1963e(view, "mjt") && m1963e(view, "g6_")) {
            return true;
        }
        if (m1963e(view, "k13") && (m1963e(view, "oom") || m1963e(view, "q0d"))) {
            return false;
        }
        if (m1963e(view, "r2d") && m1963e(view, "k13")) {
            return true;
        }
        if (m1963e(view, "cek") && m1963e(view, "k13") && m1963e(view, "mim")) {
            return true;
        }
        return (m1963e(view, "mil") && m1963e(view, "fp")) || m1970l(view, "鍙戣捣缇よ亰") || m1970l(view, "閫夋嫨鑱旂郴浜?") || m1970l(view, "閫夋嫨鏈嬪弸");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0015  */
    /* JADX INFO: renamed from: y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m1993y(String str) {
        List list;
        Set setM265B0;
        C0053z c0053zM69g = this.f3230l;
        if (c0053zM69g != null) {
            list = c0053zM69g == null ? c0053zM69g.f295a : null;
            if (list == null) {
                list = C0131s.f426a;
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (!AbstractC0307q.m534d0((String) obj)) {
                    arrayList.add(obj);
                }
            }
            setM265B0 = AbstractC0123k.m265B0(AbstractC0123k.m273o0(arrayList, AbstractC0120h.m252Z(new String[]{"com.tencent.mm.ui.contact.SelectContactUI", "com.tencent.mm.ui.contact.OnlyChatContactMgrUI"})));
        } else {
            Context context = this.f3231m;
            if (context == null) {
                setM265B0 = C0133u.f428a;
            } else {
                c0053zM69g = AbstractC0039l.m69g(context);
                if (c0053zM69g == null) {
                }
                if (list == null) {
                }
                ArrayList arrayList2 = new ArrayList();
                while (r0.hasNext()) {
                }
                setM265B0 = AbstractC0123k.m265B0(AbstractC0123k.m273o0(arrayList2, AbstractC0120h.m252Z(new String[]{"com.tencent.mm.ui.contact.SelectContactUI", "com.tencent.mm.ui.contact.OnlyChatContactMgrUI"})));
            }
        }
        return setM265B0.contains(str) || str.equals("com.tencent.mm.ui.contact.SelectContactUI") || str.equals("com.tencent.mm.ui.contact.OnlyChatContactMgrUI") || str.equals("com.tencent.mm.ui.mvvm.MvvmContactListUI");
    }
}
