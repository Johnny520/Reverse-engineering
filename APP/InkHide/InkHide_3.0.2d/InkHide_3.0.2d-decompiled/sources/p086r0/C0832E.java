package p086r0;

import android.content.Context;
import android.util.SparseArray;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.p055lu.wxmask.MainHook;
import com.p055lu.wxmask.bean.MaskItemBean;
import de.robv.android.xposed.XposedBridge;
import de.robv.android.xposed.callbacks.XC_LoadPackage;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p001A0.AbstractC0039l;
import p001A0.C0013M;
import p001A0.C0037j;
import p001A0.RunnableC0040m;
import p006D.AbstractC0079h;
import p009E0.AbstractC0105e;
import p009E0.C0104d;
import p011F0.AbstractC0120h;
import p011F0.AbstractC0123k;
import p011F0.AbstractC0129q;
import p011F0.C0122j;
import p011F0.C0131s;
import p021K0.C0169h;
import p022L.AbstractC0174d;
import p027N0.AbstractC0223g;
import p027N0.AbstractC0231o;
import p038T0.AbstractC0284i;
import p038T0.C0281f;
import p040U0.AbstractC0299i;
import p040U0.AbstractC0307q;
import p040U0.C0297g;
import p052b1.AbstractC0503h;
import p054c0.AbstractC0514f;
import p062e0.InterfaceC0551a;
import p070i0.AbstractC0731a;
import p077m0.C0768f;
import p084q0.C0804d;
import p084q0.C0808h;
import p102z0.AbstractC1126i;
import p102z0.AbstractC1135r;
import p102z0.C1124g;
import p102z0.C1142y;
import p102z0.C1143z;

/* JADX INFO: renamed from: r0.E */
/* JADX INFO: loaded from: classes.dex */
public final class C0832E implements InterfaceC0551a {

    /* JADX INFO: renamed from: m */
    public static final HashMap f2773m = new HashMap();

    /* JADX INFO: renamed from: n */
    public static final HashSet f2774n = new HashSet();

    /* JADX INFO: renamed from: o */
    public static final C0297g f2775o = new C0297g("(?is)\\bwhere\\b.{0,260}\\b(?:rconversation\\.)?(?:field_)?username\\s*(?:=|in\\s*\\()");

    /* JADX INFO: renamed from: p */
    public static final C0297g f2776p = new C0297g("(?is)\\bwhere\\b");

    /* JADX INFO: renamed from: q */
    public static final C0297g f2777q = new C0297g("(?is)\\b(group\\s+by|order\\s+by|limit)\\b");

    /* JADX INFO: renamed from: a */
    public WeakReference f2778a;

    /* JADX INFO: renamed from: b */
    public WeakReference f2779b;

    /* JADX INFO: renamed from: c */
    public WeakReference f2780c;

    /* JADX INFO: renamed from: d */
    public boolean f2781d;

    /* JADX INFO: renamed from: e */
    public C0037j f2782e;

    /* JADX INFO: renamed from: f */
    public Object f2783f;

    /* JADX INFO: renamed from: g */
    public WeakReference f2784g;

    /* JADX INFO: renamed from: h */
    public WeakReference f2785h;

    /* JADX INFO: renamed from: i */
    public String f2786i;

    /* JADX INFO: renamed from: j */
    public String f2787j;

    /* JADX INFO: renamed from: k */
    public boolean f2788k;

    /* JADX INFO: renamed from: l */
    public Object f2789l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:182:0x0093 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0151  */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v35 */
    /* JADX WARN: Type inference failed for: r0v36, types: [java.util.ArrayList, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r0v64 */
    /* JADX INFO: renamed from: A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int m1543A(Object obj, Set set) {
        Object c0104d;
        ?? c0104d2;
        List list;
        Class<?> cls;
        Object next;
        Object next2;
        Object next3;
        C0820A c0820a;
        Object c0104d3;
        Object c0104d4;
        int i2;
        int i3;
        String str;
        Set set2 = set;
        Class<?> superclass = obj.getClass();
        int i4 = 0;
        while (superclass != null && !superclass.equals(Object.class)) {
            Field[] declaredFields = superclass.getDeclaredFields();
            AbstractC0223g.m417d(declaredFields, "getDeclaredFields(...)");
            int length = declaredFields.length;
            int i5 = i4;
            int i6 = 0;
            while (i6 < length) {
                Field field = declaredFields[i6];
                try {
                    field.setAccessible(true);
                    try {
                        c0104d = field.get(obj);
                    } catch (Throwable th) {
                        th = th;
                        c0104d = new C0104d(th);
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
                Object obj2 = c0104d instanceof C0104d ? null : c0104d;
                if (obj2 == null) {
                    cls = superclass;
                } else {
                    Class<?> cls2 = obj2.getClass();
                    HashMap map = f2773m;
                    C0820A c0820a2 = (C0820A) map.get(cls2.getName());
                    if (c0820a2 != null) {
                        c0820a = c0820a2;
                        cls = superclass;
                    } else {
                        HashSet hashSet = f2774n;
                        if (hashSet.contains(cls2.getName())) {
                            cls = superclass;
                        } else {
                            try {
                                c0104d2 = new ArrayList();
                                Class<?> superclass2 = cls2;
                                while (superclass2 != null && !superclass2.equals(Object.class)) {
                                    Field[] declaredFields2 = superclass2.getDeclaredFields();
                                    AbstractC0223g.m417d(declaredFields2, "getDeclaredFields(...)");
                                    AbstractC0129q.m292f0(c0104d2, declaredFields2);
                                    superclass2 = superclass2.getSuperclass();
                                }
                            } catch (Throwable th3) {
                                c0104d2 = new C0104d(th3);
                            }
                            C0131s c0131s = C0131s.f426a;
                            boolean z2 = c0104d2 instanceof C0104d;
                            ?? r02 = c0104d2;
                            if (z2) {
                                r02 = c0131s;
                            }
                            List list2 = (List) r02;
                            Iterator it = list2.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    list = list2;
                                    cls = superclass;
                                    next = null;
                                    break;
                                }
                                next = it.next();
                                list = list2;
                                cls = superclass;
                                if (SparseArray.class.isAssignableFrom(((Field) next).getType())) {
                                    break;
                                }
                                list2 = list;
                                superclass = cls;
                            }
                            Field field2 = (Field) next;
                            Iterator it2 = list.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    next2 = null;
                                    break;
                                }
                                next2 = it2.next();
                                Iterator it3 = it2;
                                if (Map.class.isAssignableFrom(((Field) next2).getType())) {
                                    break;
                                }
                                it2 = it3;
                            }
                            Field field3 = (Field) next2;
                            if (field2 == null || field3 == null) {
                                hashSet.add(cls2.getName());
                            } else {
                                field2.setAccessible(true);
                                field3.setAccessible(true);
                                Iterator it4 = list.iterator();
                                while (true) {
                                    if (!it4.hasNext()) {
                                        next3 = null;
                                        break;
                                    }
                                    next3 = it4.next();
                                    Iterator it5 = it4;
                                    if (AbstractC0223g.m414a(((Field) next3).getType(), Integer.TYPE)) {
                                        break;
                                    }
                                    it4 = it5;
                                }
                                Field field4 = (Field) next3;
                                if (field4 != null) {
                                    field4.setAccessible(true);
                                } else {
                                    field4 = null;
                                }
                                C0820A c0820a3 = new C0820A(field2, field3, field4);
                                map.put(cls2.getName(), c0820a3);
                                AbstractC0731a.m1384a("hide close friend mapping fields cached", cls2.getName());
                                c0820a = c0820a3;
                            }
                        }
                        c0820a = null;
                    }
                    if (c0820a == null) {
                        i2 = 0;
                        i5 += i2;
                    } else {
                        try {
                            Object obj3 = c0820a.f2735a.get(obj2);
                            c0104d3 = obj3 instanceof SparseArray ? (SparseArray) obj3 : null;
                        } catch (Throwable th4) {
                            c0104d3 = new C0104d(th4);
                        }
                        if (c0104d3 instanceof C0104d) {
                            c0104d3 = null;
                        }
                        SparseArray sparseArray = (SparseArray) c0104d3;
                        if (sparseArray != null) {
                            try {
                                Object obj4 = c0820a.f2736b.get(obj2);
                                c0104d4 = AbstractC0231o.m427c(obj4) ? (Map) obj4 : null;
                            } catch (Throwable th5) {
                                c0104d4 = new C0104d(th5);
                            }
                            if (c0104d4 instanceof C0104d) {
                                c0104d4 = null;
                            }
                            Map map2 = (Map) c0104d4;
                            if (map2 != null) {
                                Iterator it6 = set2.iterator();
                                i2 = 0;
                                while (it6.hasNext()) {
                                    if (map2.remove((String) it6.next()) != null) {
                                        i2++;
                                    }
                                }
                                if (i2 <= 0) {
                                    int size = sparseArray.size();
                                    for (int i7 = 0; i7 < size; i7++) {
                                        Object objValueAt = sparseArray.valueAt(i7);
                                        if (!set2.contains(objValueAt != null ? objValueAt.toString() : null)) {
                                        }
                                    }
                                    i2 = 0;
                                    i5 += i2;
                                }
                                SparseArray sparseArray2 = new SparseArray();
                                int size2 = sparseArray.size();
                                int i8 = 0;
                                int i9 = 0;
                                while (i8 < size2) {
                                    Object objValueAt2 = sparseArray.valueAt(i8);
                                    if (objValueAt2 != null) {
                                        String string = objValueAt2.toString();
                                        i3 = size2;
                                        str = string;
                                    } else {
                                        i3 = size2;
                                        str = null;
                                    }
                                    if (str != null && !AbstractC0307q.m534d0(str) && !set2.contains(str)) {
                                        sparseArray2.put(i9, str);
                                        i9++;
                                    } else if (set2.contains(str)) {
                                        i2++;
                                    }
                                    i8++;
                                    size2 = i3;
                                }
                                sparseArray.clear();
                                int size3 = sparseArray2.size();
                                for (int i10 = 0; i10 < size3; i10++) {
                                    sparseArray.put(sparseArray2.keyAt(i10), sparseArray2.valueAt(i10));
                                }
                                Field field5 = c0820a.f2737c;
                                if (field5 != null) {
                                    try {
                                        field5.setInt(obj2, sparseArray.size());
                                    } catch (Throwable unused) {
                                    }
                                }
                                AbstractC0731a.m1384a("hide close friend mapping remove", obj2.getClass().getName(), Integer.valueOf(i2), AbstractC0174d.m351g(sparseArray.size(), "count="));
                                i5 += i2;
                            }
                        }
                    }
                }
                i6++;
                set2 = set;
                superclass = cls;
            }
            superclass = superclass.getSuperclass();
            set2 = set;
            i4 = i5;
        }
        return i4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: B */
    public static int m1544B(Object obj, Set set) {
        Object c0104d;
        int iM1562z = 0;
        for (Class<?> superclass = obj.getClass(); superclass != null && !superclass.equals(Object.class); superclass = superclass.getSuperclass()) {
            Field[] declaredFields = superclass.getDeclaredFields();
            AbstractC0223g.m417d(declaredFields, "getDeclaredFields(...)");
            for (Field field : declaredFields) {
                try {
                    field.setAccessible(true);
                    c0104d = field.get(obj);
                } catch (Throwable th) {
                    c0104d = new C0104d(th);
                }
                if (c0104d instanceof C0104d) {
                    c0104d = null;
                }
                if (c0104d != null && AbstractC0299i.m511i0(c0104d.getClass().getName(), "MvvmList", false)) {
                    iM1562z = m1562z(c0104d, set) + iM1562z;
                }
            }
        }
        return iM1562z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: D */
    public static void m1545D() {
        Object c0104d;
        if (AbstractC1135r.m2485g() == null && AbstractC1135r.m2496r(3060)) {
            try {
                C0808h c0808h = (C0808h) AbstractC0503h.m988u(C0808h.class);
                Field declaredField = C0808h.class.getDeclaredField("hideMainUIListPluginPart");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(c0808h);
                if (obj == null) {
                    return;
                }
                AbstractC0514f.m1024a(obj, "requestRefreshVisibleConversationList", new Object[0]);
                AbstractC0731a.m1384a("hide close friend legacy main refresh fallback");
                c0104d = Boolean.TRUE;
            } catch (Throwable th) {
                c0104d = new C0104d(th);
            }
            Throwable thM246a = AbstractC0105e.m246a(c0104d);
            if (thM246a != null) {
                AbstractC0731a.m1387d("hide close friend legacy main refresh fallback fail", thM246a);
            }
            Boolean bool = Boolean.FALSE;
            if (c0104d instanceof C0104d) {
                c0104d = bool;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final void m1546a(C0832E c0832e, Object obj) {
        ListView listView;
        Object obj2;
        c0832e.getClass();
        if (obj == null) {
            return;
        }
        c0832e.f2779b = new WeakReference(obj);
        c0832e.m1570l(obj);
        ListView listView2 = (ListView) m1555p(obj, "f434549h", "h");
        if (listView2 != null) {
            c0832e.f2778a = new WeakReference(listView2);
        }
        String name = obj.getClass().getName();
        WeakReference weakReference = c0832e.f2780c;
        String name2 = null;
        String strM352h = AbstractC0174d.m352h("datasource=", (weakReference == null || (obj2 = weakReference.get()) == null) ? null : obj2.getClass().getName());
        WeakReference weakReference2 = c0832e.f2778a;
        if (weakReference2 != null && (listView = (ListView) weakReference2.get()) != null) {
            name2 = listView.getClass().getName();
        }
        AbstractC0731a.m1384a("hide close friend adapter cache", name, strM352h, AbstractC0174d.m352h("listView=", name2));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static String m1547b() {
        boolean z2 = AbstractC1126i.f3786a;
        String strM497Y = AbstractC0284i.m497Y(new C0122j(3, new C0281f(new C0169h(new C0122j(1, C1124g.m2433i()), new C0804d(19)), true, new C0804d(20))));
        String strM497Y2 = AbstractC0284i.m497Y(new C0122j(3, new C0281f(new C0169h(new C0122j(1, C1124g.m2439o()), C0823B.f2743i), true, C0826C.f2749i)));
        return C1124g.m2448x() + "|" + strM497Y + "|" + strM497Y2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static String m1548e(Object obj, String str) {
        Method method;
        Object c0104d;
        for (Class<?> superclass = obj.getClass(); superclass != null && !superclass.equals(Object.class); superclass = superclass.getSuperclass()) {
            Method[] declaredMethods = superclass.getDeclaredMethods();
            AbstractC0223g.m417d(declaredMethods, "getDeclaredMethods(...)");
            int length = declaredMethods.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    method = null;
                    break;
                }
                method = declaredMethods[i2];
                if (AbstractC0223g.m414a(method.getName(), str)) {
                    Class<?>[] parameterTypes = method.getParameterTypes();
                    AbstractC0223g.m417d(parameterTypes, "getParameterTypes(...)");
                    if (parameterTypes.length == 0 && AbstractC0223g.m414a(method.getReturnType(), String.class)) {
                        break;
                    }
                }
                i2++;
            }
            if (method != null) {
                try {
                    method.setAccessible(true);
                    Object objInvoke = method.invoke(obj, null);
                    c0104d = objInvoke instanceof String ? (String) objInvoke : null;
                } catch (Throwable th) {
                    c0104d = new C0104d(th);
                }
                if (c0104d instanceof C0104d) {
                    c0104d = null;
                }
                String str2 = (String) c0104d;
                if (str2 == null || AbstractC0307q.m534d0(str2)) {
                    return null;
                }
                return str2;
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static String m1549g() {
        int i2 = -1;
        if (AbstractC1135r.f3833e == -1) {
            try {
                i2 = AbstractC0503h.m991x().getPackageManager().getPackageInfo(AbstractC0503h.m991x().getPackageName(), 0).versionCode;
            } catch (Exception e2) {
                AbstractC0731a.m1385b(e2);
            }
            AbstractC1135r.f3833e = i2;
        }
        return AbstractC1135r.f3833e >= 3060 ? "8070-plus" : m1559w() ? "8067-8069" : m1558v() ? "8065-8066" : "legacy-other";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static Method m1550h(Class cls, List list, Class... clsArr) {
        Iterator it = AbstractC0123k.m281w0(AbstractC0123k.m264A0(list)).iterator();
        while (it.hasNext()) {
            Method methodMo1011b = AbstractC0514f.f1622b.mo1011b(cls, (String) it.next(), Arrays.copyOf(clsArr, clsArr.length));
            if (methodMo1011b != null) {
                return methodMo1011b;
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static Class m1551i(Context context, List list) {
        int i2 = -1;
        if (AbstractC1135r.f3833e == -1) {
            try {
                i2 = AbstractC0503h.m991x().getPackageManager().getPackageInfo(AbstractC0503h.m991x().getPackageName(), 0).versionCode;
            } catch (Exception e2) {
                AbstractC0731a.m1385b(e2);
            }
            AbstractC1135r.f3833e = i2;
        }
        int i3 = AbstractC1135r.f3833e;
        for (String str : AbstractC0123k.m266h0(list)) {
            ClassLoader classLoader = context.getClassLoader();
            AbstractC0223g.m417d(classLoader, "getClassLoader(...)");
            AbstractC0223g.m418e(str, "clazz");
            Class clsMo1021l = AbstractC0514f.f1622b.mo1021l(classLoader, str);
            if (clsMo1021l != null) {
                AbstractC0731a.m1384a("hide close friend version class", Integer.valueOf(i3), str);
                return clsMo1021l;
            }
            AbstractC0731a.m1387d("hide close friend version class missing", Integer.valueOf(i3), str);
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public static Object m1552k(Object obj, Object obj2) {
        Object c0104d;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int i2 = -1;
        if (AbstractC1135r.f3833e == -1) {
            try {
                i2 = AbstractC0503h.m991x().getPackageManager().getPackageInfo(AbstractC0503h.m991x().getPackageName(), 0).versionCode;
            } catch (Exception e2) {
                AbstractC0731a.m1385b(e2);
            }
            AbstractC1135r.f3833e = i2;
        }
        if (AbstractC1135r.f3833e == 3120) {
            linkedHashSet.add("c");
        }
        linkedHashSet.add("a");
        for (String str : AbstractC0123k.m281w0(linkedHashSet)) {
            try {
                c0104d = AbstractC0514f.f1622b.mo1012c(obj, str, new Object[0]);
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
        return m1555p(obj2, "f434569g", "g");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public static String m1553n(Object obj) {
        if (obj == null) {
            return null;
        }
        String str = (String) m1556r(obj, "field_username");
        if (str != null && !AbstractC0307q.m534d0(str)) {
            return str;
        }
        String strM1548e = m1548e(obj, "f1");
        return strM1548e != null ? strM1548e : m1548e(obj, "h1");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public static String m1554o(Object obj) {
        Object c0104d;
        String strM1553n;
        String strM1553n2 = m1553n(obj);
        if (strM1553n2 != null) {
            return strM1553n2;
        }
        Object objM1556r = m1556r(obj, "f434581d");
        if (objM1556r == null) {
            objM1556r = m1556r(obj, "d");
        }
        String strM1553n3 = m1553n(objM1556r);
        if (strM1553n3 != null) {
            return strM1553n3;
        }
        for (Class<?> superclass = obj.getClass(); superclass != null && !superclass.equals(Object.class); superclass = superclass.getSuperclass()) {
            Field[] declaredFields = superclass.getDeclaredFields();
            AbstractC0223g.m417d(declaredFields, "getDeclaredFields(...)");
            for (Field field : declaredFields) {
                try {
                    field.setAccessible(true);
                    c0104d = field.get(obj);
                } catch (Throwable th) {
                    c0104d = new C0104d(th);
                }
                if (c0104d instanceof C0104d) {
                    c0104d = null;
                }
                if (c0104d != null && (strM1553n = m1553n(c0104d)) != null) {
                    return strM1553n;
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public static Object m1555p(Object obj, String... strArr) {
        for (String str : strArr) {
            Object objM1556r = m1556r(obj, str);
            if (objM1556r != null) {
                return objM1556r;
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public static Object m1556r(Object obj, String str) {
        if (obj != null) {
            for (Class<?> superclass = obj.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                try {
                    Field declaredField = superclass.getDeclaredField(str);
                    declaredField.setAccessible(true);
                    Object obj2 = declaredField.get(obj);
                    if (obj2 == null) {
                        return null;
                    }
                    return obj2;
                } catch (NoSuchFieldException unused) {
                } catch (Throwable th) {
                    AbstractC0731a.m1387d("hide close friend get field fail", str, th);
                    return null;
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u */
    public static boolean m1557u() {
        return AbstractC0307q.m538h0(AbstractC1135r.m2495q(), false, "8.0.72") && (AbstractC1135r.m2494p() == 3083 || AbstractC1135r.m2498t());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: v */
    public static boolean m1558v() {
        int iM2494p = AbstractC1135r.m2494p();
        String strM2495q = AbstractC1135r.m2495q();
        if (AbstractC0307q.m538h0(strM2495q, false, "8.0.65") || AbstractC0307q.m538h0(strM2495q, false, "8.0.66")) {
            return true;
        }
        return 2960 <= iM2494p && iM2494p < 3000;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w */
    public static boolean m1559w() {
        int iM2494p = AbstractC1135r.m2494p();
        String strM2495q = AbstractC1135r.m2495q();
        if (AbstractC0307q.m538h0(strM2495q, false, "8.0.67") || AbstractC0307q.m538h0(strM2495q, false, "8.0.68") || AbstractC0307q.m538h0(strM2495q, false, "8.0.69")) {
            return true;
        }
        return 3000 <= iM2494p && iM2494p < 3060;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: x */
    public static void m1560x(Object obj) {
        if (m1558v()) {
            try {
                AbstractC0514f.m1024a(obj, "notifyDataSetChanged", new Object[0]);
                AbstractC0731a.m1384a("hide close friend adapter refresh", obj.getClass().getName(), "8065-8066-notify");
                return;
            } catch (Throwable unused) {
                return;
            }
        }
        int i2 = 0;
        for (String str : AbstractC0120h.m252Z(new String[]{"clearCache", "i2", "j0", "i0", "notifyDataSetChanged"})) {
            Method methodMo1011b = AbstractC0514f.f1622b.mo1011b(obj.getClass(), str, new Object[0]);
            if (methodMo1011b != null) {
                try {
                    methodMo1011b.invoke(obj, null);
                    i2++;
                    AbstractC0731a.m1384a("hide close friend adapter refresh", obj.getClass().getName(), str);
                } catch (Throwable unused2) {
                }
            }
        }
        Method methodMo1011b2 = AbstractC0514f.f1622b.mo1011b(obj.getClass(), "a", String.class, Boolean.TYPE);
        if (methodMo1011b2 != null) {
            try {
                methodMo1011b2.invoke(obj, "wxmask", Boolean.TRUE);
                i2++;
                AbstractC0731a.m1384a("hide close friend adapter refresh", obj.getClass().getName(), "a");
            } catch (Throwable unused3) {
            }
        }
        if (i2 <= 0) {
            AbstractC0731a.m1387d("hide close friend adapter refresh no method", obj.getClass().getName());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: y */
    public static void m1561y(Object obj, Object obj2, String str) {
        boolean z2;
        Object c0104d;
        try {
            Map map = (Map) m1555p(obj, "f434578s", "s");
            if (map != null) {
                map.remove(str);
            }
        } catch (Throwable unused) {
        }
        if (obj2 != null) {
            try {
                AbstractC0514f.m1024a(obj2, "c", str);
                z2 = true;
            } catch (Throwable th) {
                c0104d = new C0104d(th);
            }
        } else {
            z2 = false;
        }
        c0104d = Boolean.valueOf(z2);
        Object obj3 = Boolean.FALSE;
        if (c0104d instanceof C0104d) {
            c0104d = obj3;
        }
        AbstractC0731a.m1384a("hide close friend live remove", str, (Boolean) c0104d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: z */
    public static int m1562z(Object obj, Set set) {
        Object c0104d;
        String strM1554o;
        int i2 = 0;
        for (Class<?> superclass = obj.getClass(); superclass != null && !superclass.equals(Object.class); superclass = superclass.getSuperclass()) {
            Field[] declaredFields = superclass.getDeclaredFields();
            AbstractC0223g.m417d(declaredFields, "getDeclaredFields(...)");
            for (Field field : declaredFields) {
                if (List.class.isAssignableFrom(field.getType())) {
                    try {
                        field.setAccessible(true);
                        c0104d = field.get(obj);
                    } catch (Throwable th) {
                        c0104d = new C0104d(th);
                    }
                    if (c0104d instanceof C0104d) {
                        c0104d = null;
                    }
                    if (c0104d != null && AbstractC0231o.m426b(c0104d)) {
                        List listM425a = AbstractC0231o.m425a(c0104d);
                        int i3 = 0;
                        for (int size = listM425a.size() - 1; -1 < size; size--) {
                            Object obj2 = listM425a.get(size);
                            if (obj2 != null && (strM1554o = m1554o(obj2)) != null && set.contains(strM1554o)) {
                                listM425a.remove(size);
                                i3++;
                            }
                        }
                        i2 += i3;
                    }
                }
            }
        }
        return i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: C */
    public final void m1563C(Object obj) {
        C0013M c0013mM70h;
        ListView listView;
        List listM1572q = m1572q();
        if (listM1572q.isEmpty()) {
            return;
        }
        Object objM1570l = m1570l(obj);
        String str = null;
        if (objM1570l == null) {
            WeakReference weakReference = this.f2780c;
            objM1570l = weakReference != null ? weakReference.get() : null;
        }
        Object objM1552k = m1552k(obj, objM1570l);
        Iterator it = listM1572q.iterator();
        while (it.hasNext()) {
            m1561y(objM1570l, objM1552k, (String) it.next());
        }
        if (m1559w()) {
            Set setM265B0 = AbstractC0123k.m265B0(listM1572q);
            if (m1559w()) {
                WeakReference weakReference2 = this.f2778a;
                Context context = (weakReference2 == null || (listView = (ListView) weakReference2.get()) == null) ? null : listView.getContext();
                C0037j c0037jM68f = this.f2782e;
                if (c0037jM68f == null) {
                    c0037jM68f = context != null ? AbstractC0039l.m68f(context) : null;
                }
                this.f2782e = c0037jM68f;
                List list = c0037jM68f != null ? c0037jM68f.f241a : null;
                if (list == null) {
                    list = C0131s.f426a;
                }
                List list2 = list;
                if (context != null && (c0013mM70h = AbstractC0039l.m70h(context)) != null) {
                    str = c0013mM70h.f120a;
                }
                boolean z2 = list2.contains(obj.getClass().getName()) || AbstractC0223g.m414a(str, obj.getClass().getName());
                if (!z2) {
                    String name = obj.getClass().getName();
                    String strConcat = "dex=".concat(AbstractC0123k.m271m0(list2, ",", null, null, null, 62));
                    if (str == null) {
                        str = "";
                    }
                    AbstractC0731a.m1384a("hide close friend mvvm sync adapter not matched", name, strConcat, "legacy=".concat(str));
                }
                if (!z2) {
                    AbstractC0731a.m1384a("hide close friend mvvm sync skipped non dex adapter", obj.getClass().getName());
                    return;
                }
            }
            int iM1543A = m1543A(obj, setM265B0) + m1544B(obj, setM265B0) + m1562z(obj, setM265B0);
            if (objM1570l != null && objM1570l != obj) {
                iM1543A = m1544B(objM1570l, setM265B0) + m1562z(objM1570l, setM265B0) + iM1543A + m1543A(objM1570l, setM265B0);
            }
            if (iM1543A > 0) {
                System.currentTimeMillis();
                AbstractC0731a.m1384a("hide close friend adapter list remove", obj.getClass().getName(), Integer.valueOf(iM1543A));
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0107  */
    /* JADX INFO: renamed from: E */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1564E() {
        boolean zM1567d;
        boolean z2;
        WeakReference weakReference;
        ListView listView;
        ListView listView2;
        ListView listView3;
        if (AbstractC1135r.m2499u() && !m1559w()) {
            this.f2786i = m1547b();
        }
        ((C0808h) AbstractC0503h.m988u(C0808h.class)).m1474c();
        WeakReference weakReference2 = this.f2779b;
        Object obj = null;
        Object obj2 = weakReference2 != null ? weakReference2.get() : null;
        Object objM1570l = m1570l(obj2);
        if (objM1570l == null) {
            WeakReference weakReference3 = this.f2780c;
            if (weakReference3 != null) {
                obj = weakReference3.get();
            }
        } else {
            obj = objM1570l;
        }
        if (obj == null) {
            AbstractC0731a.m1387d("hide close friend native refresh skipped, datasource null");
            zM1567d = false;
        } else {
            boolean z3 = AbstractC1126i.f3786a;
            if (C1124g.m2448x()) {
                Iterator it = m1572q().iterator();
                while (it.hasNext()) {
                    m1567d(obj, (String) it.next());
                }
            }
            zM1567d = m1567d(obj, "");
            AbstractC0731a.m1384a("hide close friend native refresh", Boolean.valueOf(zM1567d), obj.getClass().getName());
        }
        if (zM1567d && AbstractC1135r.m2499u() && !m1559w()) {
            return;
        }
        if (obj2 == null) {
            m1545D();
            WeakReference weakReference4 = this.f2778a;
            if (weakReference4 == null || (listView3 = (ListView) weakReference4.get()) == null) {
                return;
            }
            listView3.post(new RunnableC0959z(this, 0));
            return;
        }
        boolean z4 = AbstractC1126i.f3786a;
        if (C1124g.m2448x() && !m1558v()) {
            m1563C(obj2);
        }
        m1560x(obj2);
        WeakReference weakReference5 = this.f2778a;
        if (weakReference5 != null && (listView2 = (ListView) weakReference5.get()) != null) {
            listView2.post(new RunnableC0959z(this, 1));
        }
        if (AbstractC1135r.m2485g() == null) {
            int i2 = -1;
            if (AbstractC1135r.f3833e == -1) {
                try {
                    i2 = AbstractC0503h.m991x().getPackageManager().getPackageInfo(AbstractC0503h.m991x().getPackageName(), 0).versionCode;
                } catch (Exception e2) {
                    AbstractC0731a.m1385b(e2);
                }
                AbstractC1135r.f3833e = i2;
            }
            z2 = AbstractC1135r.f3833e < 3060;
        }
        if (z2 && (weakReference = this.f2778a) != null && (listView = (ListView) weakReference.get()) != null) {
            listView.postDelayed(new RunnableC0040m(this, obj2, 6), m1558v() ? 160L : 120L);
        }
        m1545D();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0038  */
    /* JADX INFO: renamed from: F */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m1565F(String str) {
        if (str != null && !AbstractC0307q.m534d0(str)) {
            switch (str.hashCode()) {
                case -1959409558:
                    if (!str.equals("appbrand_notify_message")) {
                        if (m1557u()) {
                            Collection<Set> collectionValues = m1573s().values();
                            if (collectionValues == null || !collectionValues.isEmpty()) {
                                for (Set<String> set : collectionValues) {
                                    if (set.contains(str)) {
                                        if (set.isEmpty()) {
                                            return true;
                                        }
                                        for (String str2 : set) {
                                            boolean z2 = AbstractC1126i.f3786a;
                                            if (C1124g.m2429e(str2)) {
                                            }
                                            break;
                                        }
                                        return true;
                                    }
                                }
                            }
                        } else {
                            boolean z3 = AbstractC1126i.f3786a;
                            if (!C1124g.m2429e(str)) {
                                C0808h c0808h = (C0808h) AbstractC0503h.m988u(C0808h.class);
                                if (C1124g.m2443s()) {
                                    if (!AbstractC0307q.m534d0(str)) {
                                        return c0808h.f2685b.contains(str);
                                    }
                                    AbstractC0731a.m1387d("chatUser is null or blank");
                                    return false;
                                }
                            }
                        }
                    }
                    break;
                case -1376155870:
                    if (!str.equals("floatbottle")) {
                    }
                    break;
                case -1286491847:
                    if (!str.equals("message_fold")) {
                    }
                    break;
                case 323997302:
                    if (!str.equals("qmessage")) {
                    }
                    break;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final List m1566c() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int i2 = -1;
        if (AbstractC1135r.f3833e == -1) {
            try {
                i2 = AbstractC0503h.m991x().getPackageManager().getPackageInfo(AbstractC0503h.m991x().getPackageName(), 0).versionCode;
            } catch (Exception e2) {
                AbstractC0731a.m1385b(e2);
            }
            AbstractC1135r.f3833e = i2;
        }
        if (AbstractC1135r.f3833e >= 3060) {
            linkedHashSet.add("k");
        }
        C0037j c0037j = this.f2782e;
        if (c0037j != null) {
            String str = c0037j.f249i;
            if (AbstractC0307q.m534d0(str)) {
                str = null;
            }
            if (str != null) {
                linkedHashSet.add(str);
            }
        }
        linkedHashSet.add("k");
        return AbstractC0123k.m281w0(linkedHashSet);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final boolean m1567d(Object obj, String str) {
        Object c0104d;
        Object c0104d2;
        boolean z2;
        boolean z3 = true;
        try {
            this.f2781d = true;
            List<String> listM1566c = m1566c();
            if (listM1566c.isEmpty()) {
                z3 = false;
                c0104d = Boolean.valueOf(z3);
            } else {
                for (String str2 : listM1566c) {
                    try {
                        Method methodM1550h = m1550h(obj.getClass(), AbstractC0079h.m167E(str2), Integer.TYPE, String.class);
                        if (methodM1550h == null) {
                            z2 = false;
                        } else {
                            methodM1550h.invoke(obj, 5, str);
                            AbstractC0731a.m1384a("hide close friend native update call", str2, 5, str);
                            z2 = true;
                        }
                        c0104d2 = Boolean.valueOf(z2);
                    } catch (Throwable th) {
                        c0104d2 = new C0104d(th);
                    }
                    Object obj2 = Boolean.FALSE;
                    if (c0104d2 instanceof C0104d) {
                        c0104d2 = obj2;
                    }
                    if (((Boolean) c0104d2).booleanValue()) {
                        break;
                    }
                }
                z3 = false;
                c0104d = Boolean.valueOf(z3);
            }
        } catch (Throwable th2) {
            c0104d = new C0104d(th2);
        }
        Throwable thM246a = AbstractC0105e.m246a(c0104d);
        if (thM246a != null) {
            AbstractC0731a.m1387d("hide close friend native update fail", 5, str, thM246a);
        }
        this.f2781d = false;
        Boolean bool = Boolean.FALSE;
        if (c0104d instanceof C0104d) {
            c0104d = bool;
        }
        return ((Boolean) c0104d).booleanValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final boolean m1568f(String str) {
        List<String> listM1572q = m1572q();
        if (!listM1572q.isEmpty()) {
            for (String str2 : listM1572q) {
                if (AbstractC0299i.m511i0(str, "'" + str2 + "'", false)) {
                    return true;
                }
                if (AbstractC0299i.m511i0(str, "\"" + str2 + "\"", false)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f7  */
    @Override // p062e0.InterfaceC0551a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void handleHook(Context context, XC_LoadPackage.LoadPackageParam loadPackageParam) {
        Method methodM1550h;
        Method methodM1550h2;
        Method methodM1550h3;
        int i2 = 2;
        int i3 = 1;
        int i4 = 0;
        this.f2782e = AbstractC0039l.m68f(context);
        boolean z2 = AbstractC1126i.f3786a;
        AbstractC0731a.m1384a("hide close friend handleHook", AbstractC0174d.m355k("enabled=", C1124g.m2448x()), AbstractC0174d.m351g(C1124g.m2433i().size(), "maskCount="));
        ClassLoader classLoader = AbstractC0503h.m991x().getClassLoader();
        AbstractC0223g.m418e(classLoader, "classLoader");
        Method[] methodArrMo1013d = AbstractC0514f.f1622b.mo1013d(AbstractC0514f.f1622b.mo1021l(classLoader, "com.tencent.wcdb.database.SQLiteDatabase"), new C0804d(21));
        AbstractC0223g.m417d(methodArrMo1013d, "findMethodsByExactPredicate(...)");
        for (Method method : methodArrMo1013d) {
            AbstractC0514f.m1027d(method, new C0829D(this, i4));
        }
        Class clsM1569j = m1569j(context);
        if (clsM1569j != null) {
            String str = "hide-close-friend-adapter-ctor-" + clsM1569j;
            if (!MainHook.uniqueMetaStore.contains(str)) {
                XposedBridge.hookAllConstructors(clsM1569j, new C0829D(this, 4));
                MainHook.uniqueMetaStore.add(str);
            }
            Method methodMo1011b = AbstractC0514f.f1622b.mo1011b(clsM1569j, "onCreate", new Object[0]);
            if (methodMo1011b != null) {
                String strM354j = AbstractC0174d.m354j("hide-close-friend-adapter-oncreate-", methodMo1011b);
                if (!MainHook.uniqueMetaStore.contains(strM354j)) {
                    AbstractC0514f.m1027d(methodMo1011b, new C0829D(this, 5));
                    MainHook.uniqueMetaStore.add(strM354j);
                }
            }
        }
        Class clsM1569j2 = m1569j(context);
        if (clsM1569j2 != null) {
            String str2 = "c0";
            if (!AbstractC1135r.m2499u()) {
                if (AbstractC0514f.f1622b.mo1011b(clsM1569j2, "e0", ListView.class) != null) {
                    str2 = "e0";
                } else if (AbstractC0514f.f1622b.mo1011b(clsM1569j2, "f0", ListView.class) != null) {
                    str2 = "f0";
                } else if (AbstractC0514f.f1622b.mo1011b(clsM1569j2, "c0", ListView.class) == null) {
                    String name = clsM1569j2.getName();
                    if (!name.equals("kc5.v0")) {
                        if (name.equals("sd5.x0")) {
                        }
                    }
                }
                Method methodMo1011b2 = AbstractC0514f.f1622b.mo1011b(clsM1569j2, str2, ListView.class);
                if (methodMo1011b2 != null) {
                    String strM354j2 = AbstractC0174d.m354j("hide-close-friend-bind-", methodMo1011b2);
                    if (!MainHook.uniqueMetaStore.contains(strM354j2)) {
                        AbstractC0514f.m1027d(methodMo1011b2, new C0829D(this, i3));
                        MainHook.uniqueMetaStore.add(strM354j2);
                    }
                }
            }
        }
        Method methodMo1011b3 = AbstractC0514f.f1622b.mo1011b(ListView.class, "setAdapter", ListAdapter.class);
        if (methodMo1011b3 != null) {
            String strM354j3 = AbstractC0174d.m354j("hide-close-friend-listview-bind-", methodMo1011b3);
            if (!MainHook.uniqueMetaStore.contains(strM354j3)) {
                AbstractC0514f.m1027d(methodMo1011b3, new C0768f(this, context, i2));
                MainHook.uniqueMetaStore.add(strM354j3);
            }
        }
        Class clsM1571m = m1571m(context);
        if (clsM1571m != null) {
            String str3 = "hide-close-friend-datasource-ctor-" + clsM1571m;
            if (!MainHook.uniqueMetaStore.contains(str3)) {
                XposedBridge.hookAllConstructors(clsM1571m, new C0829D(this, 6));
                MainHook.uniqueMetaStore.add(str3);
            }
        }
        Class clsM1571m2 = m1571m(context);
        if (clsM1571m2 != null) {
            C0037j c0037jM68f = AbstractC0039l.m68f(context);
            if (c0037jM68f == null) {
                c0037jM68f = this.f2782e;
            }
            this.f2782e = c0037jM68f;
            List list = c0037jM68f != null ? c0037jM68f.f246f : null;
            List listM281w0 = C0131s.f426a;
            if (list == null) {
                list = listM281w0;
            }
            String str4 = (String) AbstractC1135r.m2476D("va5.j0", "kc5.j0", "sd5.l0", null);
            if (str4 != null) {
                listM281w0 = AbstractC0079h.m167E(str4);
            }
            if (!list.isEmpty()) {
                listM281w0 = AbstractC0123k.m281w0(AbstractC0123k.m264A0(AbstractC0123k.m273o0(list, listM281w0)));
            }
            Class clsM1551i = m1551i(context, AbstractC1135r.m2477E("conversation", "request", listM281w0));
            if (clsM1551i != null && (methodM1550h3 = m1550h(clsM1571m2, AbstractC0079h.m167E("g"), clsM1551i)) != null) {
                String strM354j4 = AbstractC0174d.m354j("hide-close-friend-batch-", methodM1550h3);
                if (!MainHook.uniqueMetaStore.contains(strM354j4)) {
                    AbstractC0514f.m1027d(methodM1550h3, new C0829D(this, i2));
                    MainHook.uniqueMetaStore.add(strM354j4);
                }
            }
        }
        Class clsM1571m3 = m1571m(context);
        if (clsM1571m3 != null && (methodM1550h2 = m1550h(clsM1571m3, AbstractC0079h.m167E("h"), String.class)) != null) {
            String strM354j5 = AbstractC0174d.m354j("hide-close-friend-single-", methodM1550h2);
            if (!MainHook.uniqueMetaStore.contains(strM354j5)) {
                AbstractC0514f.m1027d(methodM1550h2, new C0829D(this, 3));
                MainHook.uniqueMetaStore.add(strM354j5);
            }
        }
        Class clsM1571m4 = m1571m(context);
        if (clsM1571m4 == null || (methodM1550h = m1550h(clsM1571m4, m1566c(), Integer.TYPE, String.class)) == null) {
            return;
        }
        String strM354j6 = AbstractC0174d.m354j("hide-close-friend-live-update-", methodM1550h);
        if (MainHook.uniqueMetaStore.contains(strM354j6)) {
            return;
        }
        AbstractC0514f.m1027d(methodM1550h, new C0829D(this, 7));
        MainHook.uniqueMetaStore.add(strM354j6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public final Class m1569j(Context context) {
        C0037j c0037jM68f = AbstractC0039l.m68f(context);
        if (c0037jM68f == null) {
            c0037jM68f = this.f2782e;
        }
        this.f2782e = c0037jM68f;
        List list = c0037jM68f != null ? c0037jM68f.f241a : null;
        List listM281w0 = C0131s.f426a;
        if (list == null) {
            list = listM281w0;
        }
        String str = (String) AbstractC1135r.m2476D("va5.v0", "kc5.v0", "sd5.x0", "yf5.w0");
        if (str != null) {
            listM281w0 = AbstractC0079h.m167E(str);
        }
        if (!list.isEmpty()) {
            listM281w0 = AbstractC0123k.m281w0(AbstractC0123k.m264A0(AbstractC0123k.m273o0(list, listM281w0)));
        }
        return m1551i(context, AbstractC1135r.m2477E("conversation", "adapter", listM281w0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public final Object m1570l(Object obj) {
        int i2;
        Object c0104d;
        Object objM1555p;
        if (obj != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            C0037j c0037j = this.f2782e;
            if (c0037j != null) {
                String str = c0037j.f247g;
                if (AbstractC0307q.m534d0(str)) {
                    str = null;
                }
                if (str != null) {
                    linkedHashSet.add(str);
                }
            }
            int i3 = -1;
            if (AbstractC1135r.f3833e == -1) {
                try {
                    i2 = AbstractC0503h.m991x().getPackageManager().getPackageInfo(AbstractC0503h.m991x().getPackageName(), 0).versionCode;
                } catch (Exception e2) {
                    AbstractC0731a.m1385b(e2);
                    i2 = -1;
                }
                AbstractC1135r.f3833e = i2;
            }
            if (AbstractC1135r.f3833e == 3120) {
                linkedHashSet.add("d");
            }
            linkedHashSet.add("c");
            for (String str2 : AbstractC0123k.m281w0(linkedHashSet)) {
                try {
                    c0104d = AbstractC0514f.f1622b.mo1012c(obj, str2, new Object[0]);
                } catch (Throwable th) {
                    c0104d = new C0104d(th);
                }
                if (c0104d instanceof C0104d) {
                    c0104d = null;
                }
                if (c0104d != null) {
                    if (AbstractC1135r.f3833e == -1) {
                        try {
                            i3 = AbstractC0503h.m991x().getPackageManager().getPackageInfo(AbstractC0503h.m991x().getPackageName(), 0).versionCode;
                        } catch (Exception e3) {
                            AbstractC0731a.m1385b(e3);
                        }
                        AbstractC1135r.f3833e = i3;
                    }
                    if (AbstractC1135r.f3833e == 3120 && !AbstractC0223g.m414a(str2, "d") && (objM1555p = m1555p(c0104d, "a")) != null) {
                        c0104d = objM1555p;
                    }
                    this.f2780c = new WeakReference(c0104d);
                    return c0104d;
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public final Class m1571m(Context context) {
        C0037j c0037jM68f = AbstractC0039l.m68f(context);
        if (c0037jM68f == null) {
            c0037jM68f = this.f2782e;
        }
        this.f2782e = c0037jM68f;
        List list = c0037jM68f != null ? c0037jM68f.f242b : null;
        List listM281w0 = C0131s.f426a;
        if (list == null) {
            list = listM281w0;
        }
        String str = (String) AbstractC1135r.m2476D("va5.x", "kc5.x", "sd5.x", "yf5.w");
        if (str != null) {
            listM281w0 = AbstractC0079h.m167E(str);
        }
        if (!list.isEmpty()) {
            listM281w0 = AbstractC0123k.m281w0(AbstractC0123k.m264A0(AbstractC0123k.m273o0(list, listM281w0)));
        }
        return m1551i(context, AbstractC1135r.m2477E("conversation", "dataSource", listM281w0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public final List m1572q() {
        if (!m1557u()) {
            ArrayList arrayListM266h0 = AbstractC0123k.m266h0(AbstractC0123k.m281w0(((C0808h) AbstractC0503h.m988u(C0808h.class)).f2684a));
            ArrayList arrayList = new ArrayList();
            for (Object obj : arrayListM266h0) {
                if (!AbstractC0307q.m534d0((String) obj)) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : arrayList) {
                boolean z2 = AbstractC1126i.f3786a;
                if (!C1124g.m2429e((String) obj2)) {
                    arrayList2.add(obj2);
                }
            }
            return arrayList2;
        }
        Collection collectionValues = m1573s().values();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : collectionValues) {
            Set<String> set = (Set) obj3;
            if (set == null || !set.isEmpty()) {
                for (String str : set) {
                    boolean z3 = AbstractC1126i.f3786a;
                    if (C1124g.m2429e(str)) {
                        break;
                    }
                }
            }
            arrayList3.add(obj3);
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it = arrayList3.iterator();
        while (it.hasNext()) {
            AbstractC0129q.m291e0((Iterable) it.next(), arrayList4);
        }
        return AbstractC0123k.m281w0(AbstractC0123k.m264A0(arrayList4));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0056  */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX INFO: renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Map m1573s() {
        ?? r3;
        String string;
        boolean z2 = AbstractC1126i.f3786a;
        ArrayList arrayListM2433i = C1124g.m2433i();
        ArrayList<String> arrayList = new ArrayList();
        Iterator it = arrayListM2433i.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            String string2 = AbstractC0299i.m507C0(((MaskItemBean) it.next()).getMaskId()).toString();
            String str = AbstractC0307q.m534d0(string2) ? null : string2;
            if (str != null) {
                arrayList.add(str);
            }
        }
        String strM271m0 = AbstractC0123k.m271m0(arrayList, "|", null, null, null, 62);
        boolean z3 = this.f2783f != null;
        Object obj = this.f2789l;
        if (AbstractC0223g.m414a(this.f2787j, strM271m0)) {
            r3 = obj;
            if (this.f2788k != z3) {
                r3 = 0;
            }
        }
        if (r3 != 0) {
            return r3;
        }
        C1143z.f3876a.m2534h(this.f2783f);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str2 : arrayList) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            linkedHashSet.add(str2);
            C1143z c1143z = C1143z.f3876a;
            C1142y c1142yM2528b = C1143z.m2528b(str2);
            if (c1142yM2528b != null) {
                List<String> listM252Z = AbstractC0120h.m252Z(new String[]{c1142yM2528b.f3868a, c1142yM2528b.f3869b, c1142yM2528b.f3870c});
                ArrayList arrayList2 = new ArrayList();
                for (String str3 : listM252Z) {
                    if (str3 == null || (string = AbstractC0299i.m507C0(str3).toString()) == null || AbstractC0307q.m534d0(string)) {
                        string = null;
                    }
                    if (string != null) {
                        arrayList2.add(string);
                    }
                }
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    linkedHashSet.add((String) it2.next());
                }
            }
            linkedHashMap.put(str2, linkedHashSet);
        }
        this.f2787j = strM271m0;
        this.f2788k = z3;
        this.f2789l = linkedHashMap;
        return linkedHashMap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t */
    public final boolean m1574t(Object obj) {
        List arrayList;
        if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            arrayList = new ArrayList();
            int length = objArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                Object obj2 = objArr[i2];
                String string = obj2 != null ? obj2.toString() : null;
                if (string != null) {
                    arrayList.add(string);
                }
            }
        } else if (obj instanceof Iterable) {
            arrayList = new ArrayList();
            Iterator it = ((Iterable) obj).iterator();
            while (it.hasNext()) {
                Object next = it.next();
                String string2 = next != null ? next.toString() : null;
                if (string2 != null) {
                    arrayList.add(string2);
                }
            }
        } else {
            arrayList = C0131s.f426a;
        }
        if (arrayList.isEmpty() || arrayList.isEmpty()) {
            return false;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            if (m1565F((String) it2.next())) {
                return true;
            }
        }
        return false;
    }
}
