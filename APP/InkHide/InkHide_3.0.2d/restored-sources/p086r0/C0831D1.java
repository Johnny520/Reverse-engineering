package p086r0;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.TextView;
import de.robv.android.xposed.callbacks.XC_LoadPackage;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import p001A0.AbstractC0039l;
import p001A0.C0029b0;
import p001A0.C0035h;
import p001A0.C0048u;
import p001A0.C0052y;
import p001A0.RunnableC0040m;
import p001A0.RunnableC0045r;
import p004C.C0060d;
import p006D.AbstractC0079h;
import p009E0.C0104d;
import p011F0.AbstractC0120h;
import p011F0.AbstractC0123k;
import p011F0.AbstractC0124l;
import p011F0.AbstractC0125m;
import p011F0.AbstractC0129q;
import p011F0.AbstractC0135w;
import p011F0.C0131s;
import p011F0.C0133u;
import p013G0.C0141a;
import p022L.AbstractC0174d;
import p027N0.AbstractC0223g;
import p027N0.AbstractC0231o;
import p034R0.C0243b;
import p040U0.AbstractC0299i;
import p040U0.AbstractC0307q;
import p052b1.AbstractC0503h;
import p054c0.AbstractC0514f;
import p062e0.InterfaceC0551a;
import p070i0.AbstractC0731a;
import p084q0.C0808h;
import p102z0.AbstractC1126i;
import p102z0.AbstractC1135r;
import p102z0.C1124g;

/* JADX INFO: renamed from: r0.D1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0831D1 implements InterfaceC0551a {

    /* JADX INFO: renamed from: i */
    public boolean f2767i;

    /* JADX INFO: renamed from: j */
    public int f2768j;

    /* JADX INFO: renamed from: k */
    public int f2769k;

    /* JADX INFO: renamed from: l */
    public Context f2770l;

    /* JADX INFO: renamed from: m */
    public C0029b0 f2771m;

    /* JADX INFO: renamed from: a */
    public final WeakHashMap f2759a = new WeakHashMap();

    /* JADX INFO: renamed from: b */
    public final Set f2760b = Collections.newSetFromMap(new WeakHashMap());

    /* JADX INFO: renamed from: c */
    public final Set f2761c = Collections.newSetFromMap(new IdentityHashMap());

    /* JADX INFO: renamed from: d */
    public final Set f2762d = Collections.newSetFromMap(new WeakHashMap());

    /* JADX INFO: renamed from: e */
    public final Set f2763e = Collections.newSetFromMap(new IdentityHashMap());

    /* JADX INFO: renamed from: f */
    public final Set f2764f = Collections.newSetFromMap(new IdentityHashMap());

    /* JADX INFO: renamed from: g */
    public final WeakHashMap f2765g = new WeakHashMap();

    /* JADX INFO: renamed from: h */
    public final WeakHashMap f2766h = new WeakHashMap();

    /* JADX INFO: renamed from: n */
    public final Set f2772n = Collections.newSetFromMap(new IdentityHashMap());

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: C */
    public static boolean m1503C(String str) {
        return AbstractC0307q.m538h0(str, false, "wxid_") || str.endsWith("@chatroom") || AbstractC0307q.m538h0(str, false, "gh_") || AbstractC0299i.m511i0(str, "@openim", true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: E */
    public static Object m1504E(int i2, Object obj) {
        Object c0104d;
        if (i2 < 0 || i2 < 0) {
            return null;
        }
        for (Field field : m1509b(obj.getClass())) {
            if (!Modifier.isStatic(field.getModifiers())) {
                try {
                    field.setAccessible(true);
                    Object obj2 = field.get(obj);
                    c0104d = (!(obj2 instanceof List) || i2 >= ((List) obj2).size()) ? null : ((List) obj2).get(i2);
                } catch (Throwable th) {
                    c0104d = new C0104d(th);
                }
                if (c0104d instanceof C0104d) {
                    c0104d = null;
                }
                if (c0104d != null) {
                    return c0104d;
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: F */
    public static Object m1505F(Object obj) {
        Object c0104d;
        if (obj != null) {
            for (Field field : m1509b(obj.getClass())) {
                try {
                    field.setAccessible(true);
                    c0104d = field.get(obj);
                } catch (Throwable th) {
                    c0104d = new C0104d(th);
                }
                if (c0104d instanceof C0104d) {
                    c0104d = null;
                }
                if (c0104d != null && !(c0104d instanceof View) && !AbstractC0174d.m360p(c0104d, "android.", false) && !m1512h(c0104d, 0, Collections.newSetFromMap(new IdentityHashMap())).isEmpty()) {
                    return c0104d;
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: K */
    public static boolean m1506K() {
        String str = "";
        if (AbstractC0307q.m534d0(AbstractC1135r.f3834f)) {
            try {
                String str2 = AbstractC0503h.m991x().getPackageManager().getPackageInfo(AbstractC0503h.m991x().getPackageName(), 0).versionName;
                if (str2 != null) {
                    str = str2;
                }
            } catch (Exception e2) {
                AbstractC0731a.m1385b(e2);
            }
            AbstractC1135r.f3834f = str;
        }
        String str3 = AbstractC1135r.f3834f;
        return AbstractC0307q.m538h0(str3, false, "8.0.65") || AbstractC0307q.m538h0(str3, false, "8.0.66");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: L */
    public static Set m1507L(String str) {
        List listM523u0 = AbstractC0299i.m523u0(str, new char[]{',', ';', '|', ' ', '\n', '\t', ':', '=', '(', ')', '[', ']'});
        ArrayList arrayList = new ArrayList(AbstractC0125m.m289c0(listM523u0));
        Iterator it = listM523u0.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC0299i.m507C0((String) it.next()).toString());
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (m1503C((String) obj)) {
                arrayList2.add(obj);
            }
        }
        return AbstractC0123k.m265B0(arrayList2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final void m1508a(C0831D1 c0831d1, Activity activity) {
        View decorView;
        c0831d1.getClass();
        Window window = activity.getWindow();
        if (window == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        long[] jArr = {0, 80, 200, 500, 1000};
        for (int i2 = 0; i2 < 5; i2++) {
            decorView.postDelayed(new RunnableC0040m((InterfaceC0551a) c0831d1, activity, 9), jArr[i2]);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static ArrayList m1509b(Class cls) {
        Object c0104d;
        ArrayList arrayList = new ArrayList();
        while (cls != null && !cls.equals(Object.class)) {
            try {
                Field[] declaredFields = cls.getDeclaredFields();
                AbstractC0223g.m417d(declaredFields, "getDeclaredFields(...)");
                c0104d = AbstractC0120h.m262j0(declaredFields);
            } catch (Throwable th) {
                c0104d = new C0104d(th);
            }
            Object obj = C0131s.f426a;
            if (c0104d instanceof C0104d) {
                c0104d = obj;
            }
            arrayList.addAll((Collection) c0104d);
            cls = cls.getSuperclass();
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static ArrayList m1510c(Class cls) {
        Object c0104d;
        ArrayList arrayList = new ArrayList();
        while (cls != null && !cls.equals(Object.class)) {
            try {
                Method[] declaredMethods = cls.getDeclaredMethods();
                AbstractC0223g.m417d(declaredMethods, "getDeclaredMethods(...)");
                c0104d = AbstractC0120h.m262j0(declaredMethods);
            } catch (Throwable th) {
                c0104d = new C0104d(th);
            }
            Object obj = C0131s.f426a;
            if (c0104d instanceof C0104d) {
                c0104d = obj;
            }
            arrayList.addAll((Collection) c0104d);
            cls = cls.getSuperclass();
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static Set m1511d() {
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
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:48:0x00b8 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [F0.u] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.AbstractCollection, java.util.LinkedHashSet] */
    /* JADX INFO: renamed from: h */
    public static Set m1512h(Object obj, int i2, Set set) {
        ?? linkedHashSet = C0133u.f428a;
        if (obj != null && i2 <= 4) {
            if (obj instanceof String) {
                return m1507L((String) obj);
            }
            if (obj instanceof Collection) {
                ArrayList arrayList = new ArrayList();
                Iterator it = ((Iterable) obj).iterator();
                while (it.hasNext()) {
                    AbstractC0129q.m291e0(m1512h(it.next(), i2 + 1, set), arrayList);
                }
                return AbstractC0123k.m265B0(arrayList);
            }
            if (obj instanceof Object[]) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : (Object[]) obj) {
                    AbstractC0129q.m291e0(m1512h(obj2, i2 + 1, set), arrayList2);
                }
                return AbstractC0123k.m265B0(arrayList2);
            }
            if (set.add(obj)) {
                Class<?> cls = obj.getClass();
                if (!AbstractC0307q.m538h0(cls.getName(), false, "java.") && !AbstractC0307q.m538h0(cls.getName(), false, "android.")) {
                    linkedHashSet = new LinkedHashSet();
                    for (Field field : m1509b(cls)) {
                        if (!Modifier.isStatic(field.getModifiers())) {
                            try {
                                field.setAccessible(true);
                                AbstractC0129q.m291e0(m1512h(field.get(obj), i2 + 1, set), linkedHashSet);
                            } catch (Throwable unused) {
                            }
                        }
                    }
                }
            }
        }
        return linkedHashSet;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public static View m1513k(View view) {
        for (int i2 = 0; i2 < 10; i2++) {
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
            if (view == null) {
                break;
            }
            if (m1515n(view, "om7") != null && m1515n(view, "iib") != null) {
                return view;
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public static final void m1514m(Set set, C0831D1 c0831d1, ArrayList arrayList, View view) {
        if (view instanceof TextView) {
            c0831d1.getClass();
            if (set.contains(m1519r(view))) {
                arrayList.add(view);
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = viewGroup.getChildAt(i2);
                AbstractC0223g.m417d(childAt, "getChildAt(...)");
                m1514m(set, c0831d1, arrayList, childAt);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public static View m1515n(View view, String str) {
        if (AbstractC0223g.m414a(m1519r(view), str)) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            AbstractC0223g.m417d(childAt, "getChildAt(...)");
            View viewM1515n = m1515n(childAt, str);
            if (viewM1515n != null) {
                return viewM1515n;
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public static Object m1516o(View view, View view2) {
        Method method;
        Object c0104d;
        Method[] methods = view.getClass().getMethods();
        AbstractC0223g.m417d(methods, "getMethods(...)");
        int length = methods.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                method = null;
                break;
            }
            method = methods[i2];
            if (AbstractC0223g.m414a(method.getName(), "getChildViewHolder") && method.getParameterTypes().length == 1 && method.getParameterTypes()[0].isAssignableFrom(view2.getClass())) {
                break;
            }
            i2++;
        }
        if (method == null) {
            return null;
        }
        try {
            c0104d = method.invoke(view, view2);
        } catch (Throwable th) {
            c0104d = new C0104d(th);
        }
        if (c0104d instanceof C0104d) {
            return null;
        }
        return c0104d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public static int m1517p(Object obj) {
        Object c0104d;
        if (obj == null) {
            return -1;
        }
        String[] strArr = {"getAdapterPosition", "getLayoutPosition", "getBindingAdapterPosition", "getAbsoluteAdapterPosition"};
        for (int i2 = 0; i2 < 4; i2++) {
            try {
                Object objMo1012c = AbstractC0514f.f1622b.mo1012c(obj, strArr[i2], new Object[0]);
                c0104d = objMo1012c instanceof Number ? (Number) objMo1012c : null;
            } catch (Throwable th) {
                c0104d = new C0104d(th);
            }
            Number number = (Number) (c0104d instanceof C0104d ? null : c0104d);
            if (number != null) {
                return number.intValue();
            }
        }
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public static Object m1518q(View view) {
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
    /* JADX WARN: Removed duplicated region for block: B:16:0x0021  */
    /* JADX INFO: renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String m1519r(View view) {
        Object c0104d;
        int id = view != null ? view.getId() : -1;
        if (id == -1) {
            return null;
        }
        if (view != null) {
            try {
                Resources resources = view.getResources();
                String resourceEntryName = resources != null ? resources.getResourceEntryName(id) : null;
                c0104d = resourceEntryName;
            } catch (Throwable th) {
                c0104d = new C0104d(th);
            }
        }
        return (String) (c0104d instanceof C0104d ? null : c0104d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u */
    public static boolean m1520u(View view) {
        for (Class<?> superclass = view.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
            if (superclass.getName().equals("androidx.recyclerview.widget.RecyclerView") || superclass.getName().equals("android.support.v7.widget.RecyclerView") || superclass.getName().endsWith(".RecyclerView") || superclass.getName().endsWith(".WxRecyclerView")) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: v */
    public static boolean m1521v(String str) {
        char cCharAt;
        int iM517o0 = AbstractC0299i.m517o0(str, '.', 0, 6);
        if (2 <= iM517o0 && iM517o0 < 4) {
            String strSubstring = str.substring(0, iM517o0);
            AbstractC0223g.m417d(strSubstring, "substring(...)");
            String strSubstring2 = str.substring(iM517o0 + 1);
            AbstractC0223g.m417d(strSubstring2, "substring(...)");
            Character chValueOf = strSubstring.length() == 0 ? null : Character.valueOf(strSubstring.charAt(strSubstring.length() - 1));
            if (chValueOf != null && Character.isDigit(chValueOf.charValue()) && strSubstring2.length() == 1 && 'a' <= (cCharAt = strSubstring2.charAt(0)) && cCharAt < 'i') {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: y */
    public static boolean m1522y(String str) {
        return AbstractC0307q.m538h0(str, false, "mc4.") || AbstractC0307q.m538h0(str, false, "qf4.") || AbstractC0307q.m538h0(str, false, "ah4.") || m1521v(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: A */
    public final boolean m1523A(Object obj) {
        if (obj == null) {
            return false;
        }
        String name = obj.getClass().getName();
        C0029b0 c0029b0M1531N = m1531N();
        List list = c0029b0M1531N != null ? c0029b0M1531N.f214e : null;
        if (list == null) {
            list = C0131s.f426a;
        }
        if (AbstractC0123k.m265B0(AbstractC0123k.m272n0(list, "kf4.d")).contains(name) || name.equals("mc4.d") || name.equals("qf4.d") || name.equals("ah4.d")) {
            return true;
        }
        return m1521v(name) && name.endsWith(".d");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: B */
    public final void m1524B(String str, Object obj, Set set, boolean z2) {
        int i2 = this.f2769k;
        if (i2 >= 40) {
            return;
        }
        this.f2769k = i2 + 1;
        String str2 = z2 ? "状态页分组命中" : "状态页分组扫描";
        String strConcat = "title=".concat(str);
        String name = obj != null ? obj.getClass().getName() : null;
        if (name == null) {
            name = "";
        }
        AbstractC0731a.m1384a(str2, strConcat, "item=".concat(name), "users=".concat(AbstractC0123k.m271m0(set, ",", null, null, null, 62)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: D */
    public final void m1525D(Object obj) {
        this.f2763e.add(obj);
        Class<?> cls = obj.getClass();
        if (this.f2761c.add(cls)) {
            Method[] methods = cls.getMethods();
            AbstractC0223g.m417d(methods, "getMethods(...)");
            ArrayList arrayList = new ArrayList();
            for (Method method : methods) {
                String name = method.getName();
                AbstractC0223g.m417d(name, "getName(...)");
                if (AbstractC0307q.m538h0(name, false, "notify") && !AbstractC0223g.m414a(method.getName(), "notify")) {
                    arrayList.add(method);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                AbstractC0514f.m1027d((Method) it.next(), new C0828C1(this, 2));
            }
            Method[] methods2 = cls.getMethods();
            AbstractC0223g.m417d(methods2, "getMethods(...)");
            ArrayList arrayList2 = new ArrayList();
            for (Method method2 : methods2) {
                if (AbstractC0223g.m414a(method2.getName(), "onBindViewHolder") && method2.getParameterTypes().length >= 2 && AbstractC0223g.m414a(method2.getParameterTypes()[1], Integer.TYPE)) {
                    arrayList2.add(method2);
                }
            }
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                AbstractC0514f.m1027d((Method) it2.next(), new C0828C1(this, 3));
            }
        }
        m1535i(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: G */
    public final void m1526G(View view) {
        int iIntValue;
        C0825B1 c0825b1 = (C0825B1) this.f2759a.remove(view);
        if (c0825b1 == null) {
            return;
        }
        view.setVisibility(c0825b1.f2746a);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            boolean z2 = true;
            boolean z3 = false;
            Integer num = c0825b1.f2747b;
            if (num != null && layoutParams.width != (iIntValue = num.intValue())) {
                layoutParams.width = iIntValue;
                z3 = true;
            }
            Integer num2 = c0825b1.f2748c;
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
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: H */
    public final void m1527H(View view, Object obj) {
        String name;
        Set set = this.f2760b;
        if (set.contains(view)) {
            m1538s(view);
            return;
        }
        boolean z2 = AbstractC1126i.f3786a;
        if (!C1124g.m2414E()) {
            m1526G(view);
            return;
        }
        Set setM1511d = m1511d();
        if (setM1511d.isEmpty()) {
            m1526G(view);
            return;
        }
        Set setM1532e = m1532e(0, obj);
        if (this.f2768j < 20 && (!setM1532e.isEmpty() || obj != null)) {
            this.f2768j++;
            String name2 = obj != null ? obj.getClass().getName() : null;
            if (name2 == null) {
                name2 = "";
            }
            AbstractC0731a.m1384a("状态页样本", "item=".concat(name2), "users=".concat(AbstractC0123k.m271m0(setM1532e, ",", null, null, null, 62)), AbstractC0174d.m351g(setM1511d.size(), "hidden="));
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : setM1532e) {
            if (setM1511d.contains((String) obj2)) {
                arrayList.add(obj2);
            }
        }
        if (arrayList.isEmpty()) {
            m1526G(view);
            return;
        }
        if (AbstractC0223g.m414a(m1519r(view), "m97")) {
            Set setM265B0 = AbstractC0123k.m265B0(arrayList);
            View viewM1513k = m1513k(view);
            if (viewM1513k == null) {
                m1538s(view);
                set.add(view);
                AbstractC0731a.m1384a("状态页隐藏头像列表", AbstractC0123k.m271m0(setM265B0, ",", null, null, null, 62));
                return;
            } else {
                m1538s(viewM1513k);
                set.add(viewM1513k);
                AbstractC0731a.m1384a("状态页隐藏整列", AbstractC0123k.m271m0(setM265B0, ",", null, null, null, 62));
                return;
            }
        }
        Set setM300Y = AbstractC0135w.m300Y(setM1532e, setM1511d);
        if (setM300Y.isEmpty()) {
            String strM271m0 = AbstractC0123k.m271m0(arrayList, ",", null, null, null, 62);
            name = obj != null ? obj.getClass().getName() : null;
            AbstractC0731a.m1384a("状态页隐藏命中", strM271m0, name != null ? name : "");
            m1539t(view);
            return;
        }
        String strConcat = "hit=".concat(AbstractC0123k.m271m0(arrayList, ",", null, null, null, 62));
        String strConcat2 = "remain=".concat(AbstractC0123k.m271m0(setM300Y, ",", null, null, null, 62));
        name = obj != null ? obj.getClass().getName() : null;
        AbstractC0731a.m1384a("状态页隐藏混合分组", strConcat, strConcat2, name != null ? name : "");
        Set setM265B02 = AbstractC0123k.m265B0(arrayList);
        View viewM1513k2 = m1513k(view);
        if (viewM1513k2 == null) {
            m1539t(view);
            AbstractC0731a.m1384a("状态页隐藏行", AbstractC0123k.m271m0(setM265B02, ",", null, null, null, 62));
        } else {
            m1538s(viewM1513k2);
            set.add(viewM1513k2);
            AbstractC0731a.m1384a("状态页隐藏整列", AbstractC0123k.m271m0(setM265B02, ",", null, null, null, 62));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: I */
    public final void m1528I(View view) {
        if (view == null) {
            return;
        }
        if (!m1541x(view)) {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    m1528I(viewGroup.getChildAt(i2));
                }
                return;
            }
            return;
        }
        this.f2762d.add(view);
        Object objM1518q = m1518q(view);
        if (objM1518q != null) {
            this.f2765g.put(objM1518q, view);
            if (m1506K() && AbstractC0223g.m414a(m1519r(view), "m97")) {
                this.f2764f.add(objM1518q);
            }
            m1525D(objM1518q);
        }
        m1529J(view);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r25v0, resolved type: r0.D1 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v4, types: [boolean, int] */
    /* JADX INFO: renamed from: J */
    public final void m1529J(View view) {
        Object objM1518q;
        boolean z2 = true;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            boolean z3 = AbstractC1126i.f3786a;
            ?? r5 = 0;
            if (C1124g.m2414E()) {
                Set setM1511d = m1511d();
                if (!setM1511d.isEmpty() && (objM1518q = m1518q(viewGroup)) != null) {
                    int childCount = viewGroup.getChildCount();
                    int i2 = 0;
                    while (i2 < childCount) {
                        View childAt = viewGroup.getChildAt(i2);
                        AbstractC0223g.m415b(childAt);
                        TextView textViewM1537l = m1537l(childAt);
                        if (textViewM1537l != null) {
                            Object objM1516o = m1516o(viewGroup, childAt);
                            int iM1517p = m1517p(objM1516o);
                            Integer numValueOf = Integer.valueOf(iM1517p);
                            if (iM1517p < 0) {
                                numValueOf = null;
                            }
                            int iIntValue = numValueOf != null ? numValueOf.intValue() : i2;
                            View viewM1536j = m1536j(viewGroup, i2);
                            Object objM1516o2 = viewM1536j != null ? m1516o(viewGroup, viewM1536j) : null;
                            int iM1517p2 = m1517p(objM1516o2);
                            Integer numValueOf2 = Integer.valueOf(iM1517p2);
                            if (iM1517p2 < 0) {
                                numValueOf2 = null;
                            }
                            int iIntValue2 = numValueOf2 != null ? numValueOf2.intValue() : iIntValue + 1;
                            Object objM1505F = m1505F(objM1516o2);
                            if (objM1505F == null && (objM1505F = m1504E(iIntValue2, objM1518q)) == null && (objM1505F = m1505F(objM1516o)) == null) {
                                objM1505F = m1504E(iIntValue, objM1518q);
                            }
                            Set setM1532e = m1532e(r5, objM1505F);
                            CharSequence text = textViewM1537l.getText();
                            String string = text != null ? text.toString() : null;
                            if (string == null) {
                                string = "";
                            }
                            m1524B(string, objM1505F, setM1532e, r5);
                            ArrayList arrayList = new ArrayList();
                            for (Object obj : setM1532e) {
                                if (setM1511d.contains((String) obj)) {
                                    arrayList.add(obj);
                                }
                            }
                            if (!arrayList.isEmpty()) {
                                CharSequence text2 = textViewM1537l.getText();
                                String string2 = text2 != null ? text2.toString() : null;
                                if (string2 == null) {
                                    string2 = "";
                                }
                                m1524B(string2, objM1505F, AbstractC0123k.m265B0(arrayList), true);
                                m1538s(childAt);
                                Set set = this.f2760b;
                                set.add(childAt);
                                if (viewM1536j != null) {
                                    m1538s(viewM1536j);
                                }
                                if (viewM1536j != null) {
                                    set.add(viewM1536j);
                                }
                                String strM271m0 = AbstractC0123k.m271m0(arrayList, ",", null, null, null, 62);
                                String name = objM1505F != null ? objM1505F.getClass().getName() : null;
                                AbstractC0731a.m1384a("状态页隐藏分组", strM271m0, name != null ? name : "");
                            }
                        }
                        i2++;
                        z2 = true;
                        r5 = 0;
                    }
                }
            }
            Object objM1518q2 = m1518q(view);
            int childCount2 = viewGroup.getChildCount();
            for (int i3 = 0; i3 < childCount2; i3++) {
                View childAt2 = viewGroup.getChildAt(i3);
                AbstractC0223g.m415b(childAt2);
                Object objM1516o3 = m1516o(view, childAt2);
                Object objM1505F2 = m1505F(objM1516o3);
                if (objM1505F2 == null) {
                    objM1505F2 = objM1518q2 != null ? m1504E(m1517p(objM1516o3), objM1518q2) : null;
                    if (objM1505F2 == null) {
                        objM1505F2 = objM1518q2 != null ? m1504E(i3, objM1518q2) : null;
                    }
                }
                m1527H(childAt2, objM1505F2);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: M */
    public final Set m1530M() {
        C0029b0 c0029b0M1531N = m1531N();
        List list = c0029b0M1531N != null ? c0029b0M1531N.f212c : null;
        if (list == null) {
            list = C0131s.f426a;
        }
        return AbstractC0123k.m265B0(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: N */
    public final C0029b0 m1531N() {
        C0029b0 c0029b0M78p;
        C0029b0 c0029b0 = this.f2771m;
        if (c0029b0 != null) {
            return c0029b0;
        }
        Context context = this.f2770l;
        if (context == null || (c0029b0M78p = AbstractC0039l.m78p(context)) == null) {
            return null;
        }
        this.f2771m = c0029b0M78p;
        return c0029b0M78p;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:457:0x0471 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:160:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x048a  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x04fc  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x05cd  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x06bc  */
    /* JADX WARN: Removed duplicated region for block: B:421:0x06df A[EDGE_INSN: B:505:0x06df->B:421:0x06df BREAK  A[LOOP:4: B:406:0x06a1->B:506:?]] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0193 A[Catch: all -> 0x022e, PHI: r11
  0x0193: PHI (r11v13 ??) = (r11v26 ?? I:??[boolean, int, float, short, byte, char]), (r11v12 ??), (r11v14 ??) binds: [B:89:0x0173, B:91:0x0182, B:95:0x0192] A[DONT_GENERATE, DONT_INLINE], TryCatch #8 {all -> 0x022e, blocks: (B:88:0x016f, B:90:0x0175, B:92:0x0184, B:96:0x0193, B:98:0x01a8, B:99:0x01b6, B:101:0x01bc, B:104:0x01c9, B:106:0x01cf, B:107:0x01db, B:109:0x01e1, B:112:0x01f2, B:114:0x01fe, B:122:0x0219, B:126:0x0221, B:121:0x0213, B:103:0x01c2, B:118:0x020a), top: B:476:0x016f, inners: #10 }] */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v13, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v26 */
    /* JADX WARN: Type inference failed for: r13v18, types: [java.lang.reflect.AccessibleObject, java.lang.reflect.Field] */
    /* JADX WARN: Type inference failed for: r40v0, types: [r0.D1] */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.util.AbstractCollection, java.util.LinkedHashSet] */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.lang.Iterable] */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Set m1532e(int i2, Object obj) {
        String str;
        LinkedHashSet linkedHashSet;
        String str2;
        String str3;
        Object obj2;
        String str4;
        String str5;
        Object c0104d;
        String str6;
        Iterator it;
        String str7;
        int i3;
        Object obj3;
        Object c0104d2;
        Object c0104d3;
        Object c0104d4;
        Object c0104d5;
        Iterator it2;
        ?? linkedHashSet2;
        String str8;
        Object c0104d6;
        String str9;
        String str10;
        Object c0104d7;
        Object c0104d8;
        Set setM1507L;
        Object c0104d9;
        String str11;
        String str12;
        String str13;
        String str14;
        Object obj4;
        Object c0104d10;
        C0133u c0133u = C0133u.f428a;
        if (obj == null || i2 > 2 || m1523A(obj)) {
            return c0133u;
        }
        if (obj instanceof String) {
            return m1507L((String) obj);
        }
        String name = obj.getClass().getName();
        boolean zEquals = name.equals("mj4.k");
        Set set = this.f2772n;
        String str15 = "getName(...)";
        String str16 = "textstatus";
        String str17 = "l";
        String str18 = "android.";
        String str19 = "o";
        String str20 = "java.";
        Object obj5 = String.class;
        if (!zEquals && !name.endsWith(".k")) {
            str = ".k";
            if (!AbstractC0307q.m538h0(name, false, "b74.") && !m1522y(name) && !name.equals("lc3.t0") && !set.contains(obj)) {
                str2 = "l";
                str3 = "o";
                str4 = str16;
                obj2 = obj5;
                linkedHashSet = null;
            }
            str5 = str20;
            if (linkedHashSet != null) {
                LinkedHashSet linkedHashSet3 = !linkedHashSet.isEmpty() ? linkedHashSet : null;
                if (linkedHashSet3 != null) {
                    return linkedHashSet3;
                }
            }
            if (obj instanceof Collection) {
                ArrayList arrayList = new ArrayList();
                Iterator it3 = ((Iterable) obj).iterator();
                while (it3.hasNext()) {
                    AbstractC0129q.m291e0(m1532e(i2 + 1, it3.next()), arrayList);
                }
                return AbstractC0123k.m265B0(arrayList);
            }
            if (obj instanceof Object[]) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj6 : (Object[]) obj) {
                    AbstractC0129q.m291e0(m1532e(i2 + 1, obj6), arrayList2);
                }
                return AbstractC0123k.m265B0(arrayList2);
            }
            LinkedHashSet linkedHashSet4 = new LinkedHashSet();
            String name2 = obj.getClass().getName();
            if (name2.equals("mj4.k") || name2.endsWith(str)) {
                linkedHashSet2 = new LinkedHashSet();
                try {
                    str8 = str3;
                    try {
                        Object objMo1012c = AbstractC0514f.f1622b.mo1012c(obj, str8, new Object[0]);
                        c0104d6 = objMo1012c instanceof String ? (String) objMo1012c : null;
                    } catch (Throwable th) {
                        th = th;
                        c0104d6 = new C0104d(th);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    str8 = str3;
                }
                if (c0104d6 instanceof C0104d) {
                    c0104d6 = null;
                }
                String str21 = (String) c0104d6;
                if (str21 != null) {
                    AbstractC0129q.m291e0(m1507L(str21), linkedHashSet2);
                }
                try {
                    str9 = "pj4.";
                    str10 = str2;
                    try {
                        Object objMo1012c2 = AbstractC0514f.f1622b.mo1012c(obj, str10, new Object[0]);
                        c0104d7 = objMo1012c2 instanceof String ? (String) objMo1012c2 : null;
                    } catch (Throwable th3) {
                        th = th3;
                        c0104d7 = new C0104d(th);
                    }
                } catch (Throwable th4) {
                    th = th4;
                    str9 = "pj4.";
                    str10 = str2;
                }
                if (c0104d7 instanceof C0104d) {
                    c0104d7 = null;
                }
                String str22 = (String) c0104d7;
                if (str22 != null) {
                    AbstractC0129q.m291e0(m1507L(str22), linkedHashSet2);
                }
                try {
                    AbstractC0129q.m291e0(m1534g(AbstractC0514f.f1622b.mo1015f(obj, "b")), linkedHashSet2);
                } catch (Throwable unused) {
                }
            } else {
                str9 = "pj4.";
                linkedHashSet2 = c0133u;
                str10 = str2;
                str8 = str3;
            }
            AbstractC0129q.m291e0(linkedHashSet2, linkedHashSet4);
            String name3 = obj.getClass().getName();
            if (AbstractC0307q.m538h0(name3, false, "mj4.") || AbstractC0299i.m511i0(name3, str4, true)) {
                try {
                    c0104d8 = obj.toString();
                } catch (Throwable th5) {
                    c0104d8 = new C0104d(th5);
                }
                if (c0104d8 instanceof C0104d) {
                    c0104d8 = null;
                }
                String str23 = (String) c0104d8;
                String str24 = str23 == null ? "" : str23;
                setM1507L = AbstractC0307q.m534d0(str24) ? c0133u : m1507L(str24);
            }
            AbstractC0129q.m291e0(setM1507L, linkedHashSet4);
            LinkedHashSet linkedHashSet5 = new LinkedHashSet();
            Set setM1530M = m1530M();
            String name4 = obj.getClass().getName();
            for (Method method : m1510c(obj.getClass())) {
                if (!Modifier.isStatic(method.getModifiers())) {
                    Class<?>[] parameterTypes = method.getParameterTypes();
                    AbstractC0223g.m417d(parameterTypes, "getParameterTypes(...)");
                    if (parameterTypes.length == 0 && AbstractC0223g.m414a(method.getReturnType(), obj2)) {
                        String name5 = method.getName();
                        AbstractC0223g.m417d(name5, str15);
                        if (name5.equals(str8)) {
                            str14 = str15;
                        } else {
                            str14 = str15;
                            if (name5.equals("getUserName") || name5.equals("getUsername") || name5.equals("username") || name5.equals("getTalkerUserName") || name5.equals("field_UserName") || name5.equals(str10) || name5.equals("v") || name5.equals("getStatusID") || name5.equals("getStatusId") || setM1530M.contains(method.getName()) || AbstractC0307q.m538h0(name4, false, "b74.") || m1522y(name4)) {
                            }
                        }
                        try {
                            method.setAccessible(true);
                            obj4 = null;
                            try {
                                Object objInvoke = method.invoke(obj, null);
                                c0104d10 = objInvoke instanceof String ? (String) objInvoke : null;
                            } catch (Throwable th6) {
                                th = th6;
                                c0104d10 = new C0104d(th);
                            }
                        } catch (Throwable th7) {
                            th = th7;
                            obj4 = null;
                        }
                        if (c0104d10 instanceof C0104d) {
                            c0104d10 = obj4;
                        }
                        String str25 = (String) c0104d10;
                        if (str25 != null) {
                            AbstractC0129q.m291e0(m1507L(str25), linkedHashSet5);
                        }
                    } else {
                        str14 = str15;
                    }
                }
                str15 = str14;
            }
            Object obj7 = null;
            AbstractC0129q.m291e0(linkedHashSet5, linkedHashSet4);
            for (Field field : m1509b(obj.getClass())) {
                if (Modifier.isStatic(field.getModifiers())) {
                    str12 = str9;
                    str13 = str18;
                    str11 = str5;
                } else {
                    String name6 = field.getName();
                    AbstractC0223g.m415b(name6);
                    String name7 = obj.getClass().getName();
                    if (m1530M().contains(name6) || (AbstractC0307q.m538h0(name7, false, "mj4.") || AbstractC0307q.m538h0(name7, false, "rj4.") || m1522y(name7) ? AbstractC0307q.m538h0(name6, false, "field_") || AbstractC0120h.m263k0(new String[]{"b", "c", "d", "e", "f", "g", "h", "i", "j"}).contains(name6) : AbstractC0299i.m511i0(name6, "user", true) || AbstractC0299i.m511i0(name6, "status", true) || AbstractC0299i.m511i0(name6, "topic", true) || AbstractC0299i.m511i0(name6, "info", true))) {
                        try {
                            field.setAccessible(true);
                            c0104d9 = field.get(obj);
                        } catch (Throwable th8) {
                            c0104d9 = new C0104d(th8);
                        }
                        if (c0104d9 instanceof C0104d) {
                            c0104d9 = obj7;
                        }
                        if (c0104d9 != null) {
                            if (c0104d9 instanceof String) {
                                String str26 = (String) c0104d9;
                                if (!AbstractC0307q.m534d0(str26)) {
                                    if (!m1503C(str26)) {
                                        if (i2 == 0 && str26.length() <= 120) {
                                            List listM523u0 = AbstractC0299i.m523u0(str26, new char[]{',', ';', '|', ' ', '\n', '\t'});
                                            if (!listM523u0.isEmpty()) {
                                                Iterator it4 = listM523u0.iterator();
                                                while (it4.hasNext()) {
                                                    if (m1503C(AbstractC0299i.m507C0((String) it4.next()).toString())) {
                                                        break;
                                                    }
                                                }
                                                if (!m1530M().contains(name6)) {
                                                    AbstractC0129q.m291e0(m1507L(str26), linkedHashSet4);
                                                }
                                            }
                                        } else if (!m1530M().contains(name6) || AbstractC0299i.m511i0(name6, "user", true) || AbstractC0299i.m511i0(name6, "status", true) || AbstractC0299i.m511i0(name6, "topic", true) || AbstractC0299i.m511i0(name6, "info", true)) {
                                            AbstractC0129q.m291e0(m1507L(str26), linkedHashSet4);
                                        }
                                    }
                                }
                                str12 = str9;
                                str13 = str18;
                                str11 = str5;
                            } else if (i2 >= 2) {
                                str12 = str9;
                                str13 = str18;
                                str11 = str5;
                            } else {
                                String name8 = c0104d9.getClass().getName();
                                str11 = str5;
                                if (AbstractC0307q.m538h0(name8, false, str11)) {
                                    str12 = str9;
                                    str13 = str18;
                                } else {
                                    str13 = str18;
                                    if (AbstractC0307q.m538h0(name8, false, str13)) {
                                        str12 = str9;
                                    } else if (AbstractC0307q.m538h0(name8, false, "kotlin.")) {
                                        str12 = str9;
                                    } else {
                                        if (AbstractC0120h.m263k0(new String[]{"b", "a", "c", "item", "data", "info", "baseData", "detail", "status", "statusInfo", "user", "userInfo", "topic"}).contains(field.getName())) {
                                            str12 = str9;
                                        } else if (AbstractC0307q.m538h0(name8, false, "mj4.") || AbstractC0307q.m538h0(name8, false, "rj4.") || m1522y(name8)) {
                                            str12 = str9;
                                        } else {
                                            str12 = str9;
                                            if (!AbstractC0307q.m538h0(name8, false, str12)) {
                                                if (AbstractC0299i.m511i0(name8, str4, true)) {
                                                }
                                            }
                                        }
                                        AbstractC0129q.m291e0(m1532e(i2 + 1, c0104d9), linkedHashSet4);
                                    }
                                }
                            }
                        }
                    }
                }
                str9 = str12;
                str5 = str11;
                str18 = str13;
                obj7 = null;
            }
            linkedHashSet4.isEmpty();
            return linkedHashSet4;
        }
        str = ".k";
        linkedHashSet = new LinkedHashSet();
        if (name.equals("lc3.t0") || set.contains(obj)) {
            str2 = "l";
            str3 = "o";
            LinkedHashSet linkedHashSet6 = new LinkedHashSet();
            for (Method method2 : m1510c(obj.getClass())) {
                if (!Modifier.isStatic(method2.getModifiers())) {
                    Class<?>[] parameterTypes2 = method2.getParameterTypes();
                    AbstractC0223g.m417d(parameterTypes2, "getParameterTypes(...)");
                    if (parameterTypes2.length == 0) {
                        obj3 = obj5;
                        if (AbstractC0223g.m414a(method2.getReturnType(), obj3)) {
                            try {
                                method2.setAccessible(true);
                                Object objInvoke2 = method2.invoke(obj, null);
                                c0104d2 = objInvoke2 instanceof String ? (String) objInvoke2 : null;
                            } catch (Throwable th9) {
                                c0104d2 = new C0104d(th9);
                            }
                            if (c0104d2 instanceof C0104d) {
                                c0104d2 = null;
                            }
                            String str27 = (String) c0104d2;
                            if (str27 != null) {
                                AbstractC0129q.m291e0(m1507L(str27), linkedHashSet6);
                            }
                        }
                    } else {
                        obj3 = obj5;
                    }
                }
                obj5 = obj3;
            }
            obj2 = obj5;
            Iterator it5 = m1509b(obj.getClass()).iterator();
            while (it5.hasNext()) {
                Field field2 = (Field) it5.next();
                if (Modifier.isStatic(field2.getModifiers())) {
                    str6 = str20;
                    it = it5;
                    str7 = str16;
                } else {
                    try {
                        field2.setAccessible(true);
                        c0104d = field2.get(obj);
                    } catch (Throwable th10) {
                        c0104d = new C0104d(th10);
                    }
                    if (c0104d instanceof C0104d) {
                        c0104d = null;
                    }
                    if (c0104d != null) {
                        if (c0104d instanceof String) {
                            AbstractC0129q.m291e0(m1507L((String) c0104d), linkedHashSet6);
                            str6 = str20;
                            it = it5;
                            str7 = str16;
                        } else if ((c0104d instanceof Collection) || (c0104d instanceof Object[])) {
                            str6 = str20;
                            it = it5;
                            str7 = str16;
                            AbstractC0129q.m291e0(m1532e(1, c0104d), linkedHashSet6);
                        } else {
                            String name9 = c0104d.getClass().getName();
                            String str28 = str20;
                            it = it5;
                            str6 = str28;
                            if (AbstractC0307q.m538h0(name9, false, str28)) {
                                str7 = str16;
                            } else {
                                String str29 = str18;
                                if (AbstractC0307q.m538h0(name9, false, str29)) {
                                    str18 = str29;
                                    str7 = str16;
                                } else {
                                    str18 = str29;
                                    if (AbstractC0307q.m538h0(name9, false, "lc3.") || AbstractC0307q.m538h0(name9, false, "mj4.") || AbstractC0307q.m538h0(name9, false, "pj4.")) {
                                        str7 = str16;
                                        i3 = 1;
                                    } else {
                                        str7 = str16;
                                        i3 = 1;
                                        if (AbstractC0299i.m511i0(name9, str7, true)) {
                                        }
                                    }
                                    AbstractC0129q.m291e0(m1532e(i3, c0104d), linkedHashSet6);
                                }
                            }
                        }
                    }
                }
                str16 = str7;
                it5 = it;
                str20 = str6;
            }
            str4 = str16;
            str5 = str20;
            AbstractC0129q.m291e0(linkedHashSet6, linkedHashSet);
            if (linkedHashSet.isEmpty()) {
                linkedHashSet = null;
            }
            if (linkedHashSet != null) {
            }
            if (obj instanceof Collection) {
            }
        } else {
            try {
                Object objMo1012c3 = AbstractC0514f.f1622b.mo1012c(obj, "o", new Object[0]);
                c0104d3 = objMo1012c3 instanceof String ? (String) objMo1012c3 : null;
            } catch (Throwable th11) {
                c0104d3 = new C0104d(th11);
            }
            if (c0104d3 instanceof C0104d) {
                c0104d3 = null;
            }
            String str30 = (String) c0104d3;
            try {
                Object objMo1012c4 = AbstractC0514f.f1622b.mo1012c(obj, "l", new Object[0]);
                c0104d4 = objMo1012c4 instanceof String ? (String) objMo1012c4 : null;
            } catch (Throwable th12) {
                c0104d4 = new C0104d(th12);
            }
            if (c0104d4 instanceof C0104d) {
                c0104d4 = null;
            }
            String str31 = (String) c0104d4;
            if (str30 != null) {
                AbstractC0129q.m291e0(m1507L(str30), linkedHashSet);
            }
            if (str31 != null) {
                AbstractC0129q.m291e0(m1507L(str31), linkedHashSet);
            }
            try {
                Object objMo1015f = AbstractC0514f.f1622b.mo1015f(obj, "b");
                String name10 = objMo1015f != null ? objMo1015f.getClass().getName() : null;
                if (name10 == null) {
                    name10 = "";
                }
                if (objMo1015f == null || !(AbstractC0307q.m538h0(name10, false, "mj4.") || AbstractC0307q.m538h0(name10, false, "pj4."))) {
                    str2 = "l";
                    str3 = "o";
                } else {
                    AbstractC0129q.m291e0(m1534g(objMo1015f), linkedHashSet);
                    Iterator it6 = m1509b(objMo1015f.getClass()).iterator();
                    while (it6.hasNext()) {
                        ?? r13 = (Field) it6.next();
                        if (Modifier.isStatic(r13.getModifiers())) {
                            str2 = str17;
                            it2 = it6;
                            str3 = str19;
                        } else {
                            it2 = it6;
                            String name11 = r13.getName();
                            AbstractC0223g.m417d(name11, "getName(...)");
                            str2 = str17;
                            str3 = str19;
                            ?? r11 = 1;
                            r11 = 1;
                            try {
                                if (!AbstractC0299i.m511i0(name11, "PrivateInfo", true)) {
                                    String name12 = r13.getName();
                                    AbstractC0223g.m417d(name12, "getName(...)");
                                    if (AbstractC0299i.m511i0(name12, "User", true)) {
                                        r13.setAccessible(r11);
                                        AbstractC0129q.m291e0(m1532e(r11, r13.get(objMo1015f)), linkedHashSet);
                                    } else {
                                        String name13 = r13.getName();
                                        AbstractC0223g.m417d(name13, "getName(...)");
                                        if (AbstractC0299i.m511i0(name13, "status", true)) {
                                            r11 = 1;
                                            r13.setAccessible(r11);
                                            AbstractC0129q.m291e0(m1532e(r11, r13.get(objMo1015f)), linkedHashSet);
                                        }
                                    }
                                }
                            } catch (Throwable unused2) {
                            }
                        }
                        it6 = it2;
                        str17 = str2;
                        str19 = str3;
                    }
                    str2 = str17;
                    str3 = str19;
                    AbstractC0129q.m291e0(m1532e(1, objMo1015f), linkedHashSet);
                }
                if (AbstractC0307q.m538h0(name, false, "b74.") || m1522y(name)) {
                    AbstractC0129q.m291e0(m1533f(obj), linkedHashSet);
                }
                if (linkedHashSet.isEmpty()) {
                    for (Field field3 : m1509b(obj.getClass())) {
                        if (!Modifier.isStatic(field3.getModifiers()) && (AbstractC0223g.m414a(field3.getName(), "d") || AbstractC0223g.m414a(field3.getName(), "b"))) {
                            try {
                                field3.setAccessible(true);
                                c0104d5 = field3.get(obj);
                            } catch (Throwable th13) {
                                c0104d5 = new C0104d(th13);
                            }
                            if (c0104d5 instanceof C0104d) {
                                c0104d5 = null;
                            }
                            if (c0104d5 != null) {
                                AbstractC0129q.m291e0(m1532e(1, c0104d5), linkedHashSet);
                            }
                        }
                    }
                }
            } catch (Throwable unused3) {
                str2 = str17;
                str3 = str19;
            }
            if (linkedHashSet.isEmpty()) {
                linkedHashSet = null;
            }
            str4 = str16;
            obj2 = obj5;
            str5 = str20;
            if (linkedHashSet != null) {
            }
            if (obj instanceof Collection) {
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final LinkedHashSet m1533f(Object obj) {
        Object c0104d;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Field field : m1509b(obj.getClass())) {
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
                    String name = c0104d.getClass().getName();
                    if (c0104d instanceof String) {
                        AbstractC0129q.m291e0(m1507L((String) c0104d), linkedHashSet);
                    } else if (!AbstractC0307q.m538h0(name, false, "java.") && !AbstractC0307q.m538h0(name, false, "android.")) {
                        if ((c0104d instanceof Collection) || (c0104d instanceof Object[])) {
                            AbstractC0129q.m291e0(m1532e(1, c0104d), linkedHashSet);
                        } else if (AbstractC0299i.m511i0(name, "text", true) || AbstractC0307q.m538h0(name, false, "b74.") || m1522y(name) || AbstractC0307q.m538h0(name, false, "mj4.") || AbstractC0307q.m538h0(name, false, "pj4.")) {
                            AbstractC0129q.m291e0(m1532e(1, c0104d), linkedHashSet);
                        }
                    }
                }
            }
        }
        return linkedHashSet;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:70:0x012b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Set m1534g(Object obj) {
        Object c0104d;
        Object c0104d2;
        C0133u c0133u = C0133u.f428a;
        if (obj != null) {
            String name = obj.getClass().getName();
            if (AbstractC0307q.m538h0(name, false, "mj4.") || AbstractC0307q.m538h0(name, false, "pj4.")) {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Iterator it = m1510c(obj.getClass()).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Method method = (Method) it.next();
                    if (!Modifier.isStatic(method.getModifiers())) {
                        Class<?>[] parameterTypes = method.getParameterTypes();
                        AbstractC0223g.m417d(parameterTypes, "getParameterTypes(...)");
                        if (parameterTypes.length == 0 && AbstractC0223g.m414a(method.getReturnType(), String.class) && AbstractC0120h.m263k0(new String[]{"o", "l", "a", "b", "c", "d", "e", "f", "g"}).contains(method.getName())) {
                            try {
                                method.setAccessible(true);
                                Object objInvoke = method.invoke(obj, null);
                                c0104d2 = objInvoke instanceof String ? (String) objInvoke : null;
                            } catch (Throwable th) {
                                c0104d2 = new C0104d(th);
                            }
                            String str = (String) (c0104d2 instanceof C0104d ? null : c0104d2);
                            if (str != null) {
                                AbstractC0129q.m291e0(m1507L(str), linkedHashSet);
                            }
                        }
                    }
                }
                for (Field field : m1509b(obj.getClass())) {
                    if (!Modifier.isStatic(field.getModifiers()) && (AbstractC0223g.m414a(field.getType(), String.class) || Collection.class.isAssignableFrom(field.getType()))) {
                        String name2 = field.getName();
                        AbstractC0223g.m417d(name2, "getName(...)");
                        if (!AbstractC0299i.m511i0(name2, "PrivateInfo", true)) {
                            String name3 = field.getName();
                            AbstractC0223g.m417d(name3, "getName(...)");
                            if (!AbstractC0299i.m511i0(name3, "User", true)) {
                                String name4 = field.getName();
                                AbstractC0223g.m417d(name4, "getName(...)");
                                if (AbstractC0299i.m511i0(name4, "status", true) || AbstractC0223g.m414a(field.getName(), "b")) {
                                    try {
                                        field.setAccessible(true);
                                        c0104d = field.get(obj);
                                    } catch (Throwable th2) {
                                        c0104d = new C0104d(th2);
                                    }
                                    if (c0104d instanceof C0104d) {
                                        c0104d = null;
                                    }
                                    if (c0104d != null) {
                                        AbstractC0129q.m291e0(m1532e(1, c0104d), linkedHashSet);
                                    }
                                }
                            }
                        }
                    }
                }
                return linkedHashSet;
            }
        }
        return c0133u;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0073 A[PHI: r4
  0x0073: PHI (r4v3 java.lang.Class) = (r4v2 java.lang.Class), (r4v7 java.lang.Class) binds: [B:8:0x0061, B:10:0x0070] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a7 A[PHI: r10
  0x00a7: PHI (r10v7 java.lang.Class) = (r10v6 java.lang.Class), (r10v14 java.lang.Class) binds: [B:16:0x0097, B:18:0x00a4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0054 A[PHI: r10
  0x0054: PHI (r10v3 java.lang.Class) = (r10v2 java.lang.Class), (r10v16 java.lang.Class) binds: [B:3:0x0044, B:5:0x0051] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p062e0.InterfaceC0551a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void handleHook(Context context, XC_LoadPackage.LoadPackageParam loadPackageParam) {
        this.f2770l = context;
        this.f2771m = AbstractC0039l.m78p(context);
        CopyOnWriteArrayList copyOnWriteArrayList = C0052y.f291a;
        C0052y.m98c(context, new C0048u("text_status", "状态页密友隐藏", new C0925n1(9), new C0035h(context, 20), new C0060d(8, this), new C0925n1(10)));
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
                        Method methodMo1011b = AbstractC0514f.f1622b.mo1011b(clsMo1021l, "setAdapter", clsMo1021l2);
                        if (methodMo1011b != null) {
                            AbstractC0514f.m1027d(methodMo1011b, new C0828C1(this, 5));
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
                C0828C1 c0828c1 = new C0828C1(this, 4);
                Method methodMo1011b2 = AbstractC0514f.f1622b.mo1011b(clsMo1021l3, "onAttachedToWindow", new Object[0]);
                if (methodMo1011b2 != null) {
                    AbstractC0514f.m1027d(methodMo1011b2, c0828c1);
                }
                Class cls2 = Integer.TYPE;
                Method methodMo1011b3 = AbstractC0514f.f1622b.mo1011b(clsMo1021l3, "onLayout", cls, cls2, cls2, cls2, cls2);
                if (methodMo1011b3 != null) {
                    AbstractC0514f.m1027d(methodMo1011b3, c0828c1);
                }
                Method methodMo1011b4 = AbstractC0514f.f1622b.mo1011b(clsMo1021l3, "dispatchDraw", Canvas.class);
                if (methodMo1011b4 != null) {
                    AbstractC0514f.m1027d(methodMo1011b4, c0828c1);
                }
            }
        }
        Method methodMo1011b5 = AbstractC0514f.f1622b.mo1011b(Activity.class, "onWindowFocusChanged", cls);
        if (methodMo1011b5 != null) {
            AbstractC0514f.m1027d(methodMo1011b5, new C0828C1(this, 0));
        }
        Method methodMo1011b6 = AbstractC0514f.f1622b.mo1011b(Activity.class, "onResume", new Object[0]);
        if (methodMo1011b6 != null) {
            AbstractC0514f.m1027d(methodMo1011b6, new C0828C1(this, 1));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0062  */
    /* JADX INFO: renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m1535i(Object obj) {
        Object c0104d;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5 = true;
        boolean z6 = AbstractC1126i.f3786a;
        if (C1124g.m2414E()) {
            Set setM1511d = m1511d();
            if (!setM1511d.isEmpty()) {
                boolean z7 = false;
                for (Field field : m1509b(obj.getClass())) {
                    if (Modifier.isStatic(field.getModifiers())) {
                        z2 = z5;
                    } else {
                        try {
                            field.setAccessible(z5);
                            Object obj2 = field.get(obj);
                            c0104d = AbstractC0231o.m426b(obj2) ? (List) obj2 : null;
                        } catch (Throwable th) {
                            c0104d = new C0104d(th);
                        }
                        if (c0104d instanceof C0104d) {
                            c0104d = null;
                        }
                        List list = (List) c0104d;
                        if (list != null) {
                            LinkedHashSet linkedHashSet = new LinkedHashSet();
                            int i2 = 0;
                            for (Object obj3 : list) {
                                int i3 = i2 + 1;
                                if (i2 < 0) {
                                    AbstractC0124l.m288b0();
                                    throw null;
                                }
                                if (obj3 != null && m1540w(obj3)) {
                                    Set setM1532e = m1532e(0, obj3);
                                    ArrayList arrayList = new ArrayList();
                                    for (Object obj4 : setM1532e) {
                                        boolean z8 = z5;
                                        if (setM1511d.contains((String) obj4)) {
                                            arrayList.add(obj4);
                                        }
                                        z5 = z8;
                                    }
                                    z4 = z5;
                                    if (!arrayList.isEmpty()) {
                                        linkedHashSet.add(Integer.valueOf(i2));
                                        int i4 = i2 - 1;
                                        if (i4 >= 0 && m1523A(AbstractC0123k.m269k0(list, i4))) {
                                            linkedHashSet.add(Integer.valueOf(i4));
                                        }
                                        if (i3 < list.size() && m1523A(AbstractC0123k.m269k0(list, i3))) {
                                            linkedHashSet.add(Integer.valueOf(i3));
                                        }
                                        AbstractC0731a.m1384a("状态页移除分组项", AbstractC0123k.m271m0(arrayList, ",", null, null, null, 62), obj3.getClass().getName());
                                    }
                                } else {
                                    z4 = z5;
                                }
                                i2 = i3;
                                z5 = z4;
                            }
                            z2 = z5;
                            if (linkedHashSet.isEmpty()) {
                                ListIterator listIterator = list.listIterator();
                                z3 = false;
                                while (listIterator.hasNext()) {
                                    Object next = listIterator.next();
                                    if (next != null) {
                                        Set setM1532e2 = m1532e(0, next);
                                        ArrayList arrayList2 = new ArrayList();
                                        for (Object obj5 : setM1532e2) {
                                            if (setM1511d.contains((String) obj5)) {
                                                arrayList2.add(obj5);
                                            }
                                        }
                                        if (!arrayList2.isEmpty()) {
                                            Set setM300Y = AbstractC0135w.m300Y(setM1532e2, setM1511d);
                                            if (setM300Y.isEmpty()) {
                                                listIterator.remove();
                                                AbstractC0731a.m1384a("状态页移除项", AbstractC0123k.m271m0(arrayList2, ",", null, null, null, 62), next.getClass().getName());
                                                z3 = z2;
                                            } else {
                                                AbstractC0731a.m1384a("状态页保留混合项", "hit=".concat(AbstractC0123k.m271m0(arrayList2, ",", null, null, null, 62)), "remain=".concat(AbstractC0123k.m271m0(setM300Y, ",", null, null, null, 62)), next.getClass().getName());
                                            }
                                        }
                                    }
                                }
                            } else {
                                Iterator it = AbstractC0123k.m276r0(linkedHashSet, C0141a.f441c).iterator();
                                while (it.hasNext()) {
                                    int iIntValue = ((Number) it.next()).intValue();
                                    if (iIntValue >= 0 && iIntValue < list.size()) {
                                        list.remove(iIntValue);
                                    }
                                }
                                z3 = z2;
                            }
                            z7 = (z3 || z7) ? z2 : false;
                        }
                    }
                    z5 = z2;
                }
                if (z7) {
                    AbstractC0731a.m1384a("状态页数据已过滤", obj.getClass().getName());
                    View view = (View) this.f2765g.get(obj);
                    if (view != null) {
                        view.post(new RunnableC0045r(this, view, obj, 11));
                    }
                }
                return z7;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public final View m1536j(ViewGroup viewGroup, int i2) {
        C0029b0 c0029b0M1531N = m1531N();
        List list = c0029b0M1531N != null ? c0029b0M1531N.f217h : null;
        if (list == null) {
            list = C0131s.f426a;
        }
        Set<String> setM265B0 = AbstractC0123k.m265B0(AbstractC0123k.m272n0(AbstractC0123k.m272n0(list, "iib"), "l06"));
        int childCount = viewGroup.getChildCount();
        for (int i3 = i2 + 1; i3 < childCount; i3++) {
            View childAt = viewGroup.getChildAt(i3);
            if (!setM265B0.isEmpty()) {
                for (String str : setM265B0) {
                    AbstractC0223g.m415b(childAt);
                    if (m1515n(childAt, str) != null) {
                        return childAt;
                    }
                }
            }
            AbstractC0223g.m415b(childAt);
            if (m1537l(childAt) != null) {
                break;
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public final TextView m1537l(View view) {
        ArrayList arrayList = new ArrayList();
        C0029b0 c0029b0M1531N = m1531N();
        List list = c0029b0M1531N != null ? c0029b0M1531N.f216g : null;
        if (list == null) {
            list = C0131s.f426a;
        }
        m1514m(AbstractC0123k.m265B0(AbstractC0123k.m272n0(AbstractC0123k.m272n0(list, "om7"), "spk")), this, arrayList, view);
        return (TextView) AbstractC0123k.m268j0(arrayList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public final void m1538s(View view) {
        WeakHashMap weakHashMap = this.f2759a;
        if (!weakHashMap.containsKey(view)) {
            int visibility = view.getVisibility();
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            Integer numValueOf = layoutParams != null ? Integer.valueOf(layoutParams.width) : null;
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            weakHashMap.put(view, new C0825B1(visibility, numValueOf, layoutParams2 != null ? Integer.valueOf(layoutParams2.height) : null));
        }
        view.setVisibility(8);
        ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
        if (layoutParams3 != null) {
            layoutParams3.width = 0;
            layoutParams3.height = 0;
            view.setLayoutParams(layoutParams3);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t */
    public final void m1539t(View view) {
        m1538s(view);
        Set set = this.f2760b;
        set.add(view);
        ViewParent parent = view.getParent();
        Object obj = null;
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null && m1541x(viewGroup)) {
            Iterator it = AbstractC0079h.m176U(0, viewGroup.getChildCount()).iterator();
            while (true) {
                C0243b c0243b = (C0243b) it;
                if (!c0243b.f588c) {
                    break;
                }
                Object next = c0243b.next();
                if (viewGroup.getChildAt(((Number) next).intValue()) == view) {
                    obj = next;
                    break;
                }
            }
            Integer num = (Integer) obj;
            if (num != null) {
                int iIntValue = num.intValue();
                int i2 = iIntValue - 1;
                while (true) {
                    if (-1 >= i2) {
                        break;
                    }
                    View childAt = viewGroup.getChildAt(i2);
                    AbstractC0223g.m415b(childAt);
                    if (m1537l(childAt) != null) {
                        m1538s(childAt);
                        set.add(childAt);
                        break;
                    }
                    i2--;
                }
                View viewM1536j = m1536j(viewGroup, iIntValue);
                if (viewM1536j != null) {
                    m1538s(viewM1536j);
                    set.add(viewM1536j);
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w */
    public final boolean m1540w(Object obj) {
        String name = obj.getClass().getName();
        C0029b0 c0029b0M1531N = m1531N();
        List list = c0029b0M1531N != null ? c0029b0M1531N.f213d : null;
        if (list == null) {
            list = C0131s.f426a;
        }
        if (AbstractC0123k.m265B0(AbstractC0123k.m272n0(list, "kf4.c")).contains(name) || AbstractC0307q.m538h0(name, false, "mj4.") || name.equals("mc4.c") || name.equals("qf4.c") || name.equals("ah4.c")) {
            return true;
        }
        return (m1521v(name) && name.endsWith(".c")) || name.endsWith(".k");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: x */
    public final boolean m1541x(View view) {
        Object c0104d;
        Field declaredField;
        int i2 = 0;
        if (view != null && m1520u(view)) {
            C0029b0 c0029b0M1531N = m1531N();
            Activity activity = null;
            List list = c0029b0M1531N != null ? c0029b0M1531N.f215f : null;
            if (list == null) {
                list = C0131s.f426a;
            }
            ArrayList arrayListM272n0 = AbstractC0123k.m272n0(list, "m91");
            if ((m1506K() ? AbstractC0123k.m265B0(AbstractC0123k.m272n0(AbstractC0123k.m272n0(arrayListM272n0, "m97"), "pmd")) : AbstractC0123k.m265B0(AbstractC0123k.m272n0(arrayListM272n0, "pmd"))).contains(m1519r(view))) {
                Context context = view.getContext();
                while (true) {
                    if (i2 >= 8) {
                        break;
                    }
                    if (context instanceof Activity) {
                        activity = (Activity) context;
                        break;
                    }
                    if (context != null) {
                        try {
                            declaredField = context.getClass().getDeclaredField("mBase");
                        } catch (Throwable th) {
                            c0104d = new C0104d(th);
                        }
                    } else {
                        declaredField = null;
                    }
                    if (declaredField != null) {
                        declaredField.setAccessible(true);
                    }
                    Object obj = declaredField != null ? declaredField.get(context) : null;
                    c0104d = obj instanceof Context ? (Context) obj : null;
                    if (c0104d instanceof C0104d) {
                        c0104d = null;
                    }
                    context = (Context) c0104d;
                    if (context == null) {
                        break;
                    }
                    i2++;
                }
                return m1542z(activity);
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: z */
    public final boolean m1542z(Activity activity) {
        if (activity == null) {
            return false;
        }
        String name = activity.getClass().getName();
        C0029b0 c0029b0M1531N = m1531N();
        List list = c0029b0M1531N != null ? c0029b0M1531N.f210a : null;
        if (list == null) {
            list = C0131s.f426a;
        }
        return AbstractC0123k.m265B0(AbstractC0123k.m272n0(list, "com.tencent.mm.plugin.textstatus.ui.TextStatusOtherTopicFriendsActivity")).contains(name);
    }
}
