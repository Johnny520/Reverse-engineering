package p102z0;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import p001A0.C0022W;
import p009E0.AbstractC0105e;
import p009E0.C0104d;
import p011F0.AbstractC0120h;
import p011F0.AbstractC0123k;
import p011F0.C0131s;
import p011F0.C0133u;
import p022L.AbstractC0174d;
import p027N0.AbstractC0223g;
import p040U0.AbstractC0299i;
import p040U0.AbstractC0306p;
import p040U0.AbstractC0307q;
import p040U0.C0297g;
import p070i0.AbstractC0731a;

/* JADX INFO: renamed from: z0.w */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1140w {

    /* JADX INFO: renamed from: g */
    public static volatile C0022W f3852g;

    /* JADX INFO: renamed from: a */
    public static final ConcurrentHashMap f3846a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b */
    public static final ConcurrentHashMap f3847b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: c */
    public static final ConcurrentHashMap f3848c = new ConcurrentHashMap();

    /* JADX INFO: renamed from: d */
    public static final ConcurrentHashMap f3849d = new ConcurrentHashMap();

    /* JADX INFO: renamed from: e */
    public static final ConcurrentHashMap f3850e = new ConcurrentHashMap();

    /* JADX INFO: renamed from: f */
    public static final ConcurrentHashMap f3851f = new ConcurrentHashMap();

    /* JADX INFO: renamed from: h */
    public static final String[] f3853h = {"Username", "UserName", "userName", "username", "field_userName", "field_username"};

    /* JADX INFO: renamed from: i */
    public static final String[] f3854i = {"field_snsId", "snsId"};

    /* JADX INFO: renamed from: j */
    public static final String[] f3855j = {"localid", "field_localid", "localId"};

    /* JADX INFO: renamed from: k */
    public static final String[] f3856k = {"UserName", "Username", "userName", "username"};

    /* JADX INFO: renamed from: l */
    public static final String[] f3857l = {"ExtFlag"};

    /* JADX INFO: renamed from: m */
    public static final String[] f3858m = {"LikeUserList"};

    /* JADX INFO: renamed from: n */
    public static final String[] f3859n = {"LikeCount"};

    /* JADX INFO: renamed from: o */
    public static final String[] f3860o = {"LikeUserListCount"};

    /* JADX INFO: renamed from: p */
    public static final String[] f3861p = {"CommentUserList"};

    /* JADX INFO: renamed from: q */
    public static final String[] f3862q = {"CommentCount"};

    /* JADX INFO: renamed from: r */
    public static final String[] f3863r = {"CommentUserListCount"};

    /* JADX INFO: renamed from: s */
    public static final String[] f3864s = {"field_userName", "field_snsId", "field_createTime", "field_content", "LikeUserList", "CommentUserList"};

    /* JADX INFO: renamed from: t */
    public static final Set f3865t = AbstractC0120h.m263k0(new String[]{"刚刚", "今天", "昨天", "前天", "just now", "yesterday"});

    /* JADX INFO: renamed from: u */
    public static final C0297g[] f3866u = {new C0297g("^\\d+\\s*分钟前$"), new C0297g("^\\d+\\s*小时前$"), new C0297g("^\\d+\\s*天前$"), new C0297g(0, "^\\d+\\s*mins?\\s*ago$"), new C0297g(0, "^\\d+\\s*hrs?\\s*ago$"), new C0297g(0, "^\\d+\\s*days?\\s*ago$")};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static List m2507a(Class cls) {
        ConcurrentHashMap concurrentHashMap = f3846a;
        Object obj = concurrentHashMap.get(cls);
        Object obj2 = obj;
        if (obj == null) {
            ArrayList arrayList = new ArrayList();
            for (Class superclass = cls; superclass != null; superclass = superclass.getSuperclass()) {
                Field[] declaredFields = superclass.getDeclaredFields();
                AbstractC0223g.m417d(declaredFields, "getDeclaredFields(...)");
                for (Field field : declaredFields) {
                    field.setAccessible(true);
                    arrayList.add(field);
                }
            }
            Object objPutIfAbsent = concurrentHashMap.putIfAbsent(cls, arrayList);
            obj2 = arrayList;
            if (objPutIfAbsent != null) {
                obj2 = objPutIfAbsent;
            }
        }
        return (List) obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static void m2508b(Object obj, Class cls, Class cls2, int i2, LinkedHashSet linkedHashSet) {
        Object c0104d;
        Object c0104d2;
        if (obj != null && i2 <= 2 && linkedHashSet.size() < 6) {
            linkedHashSet.addAll(m2519m(obj));
            if (linkedHashSet.isEmpty()) {
                if (AbstractC0174d.m360p(obj, "com.tencent.mm.plugin.sns.", false) || ((cls != null && cls.isInstance(obj)) || (cls2 != null && cls2.isInstance(obj)))) {
                    Iterator it = AbstractC0123k.m277s0(m2516j(obj.getClass()), 4).iterator();
                    do {
                        if (!it.hasNext()) {
                            for (Field field : AbstractC0123k.m277s0(m2507a(obj.getClass()), 16)) {
                                try {
                                    field.setAccessible(true);
                                    c0104d = field.get(obj);
                                } catch (Throwable th) {
                                    c0104d = new C0104d(th);
                                }
                                if (c0104d instanceof C0104d) {
                                    c0104d = null;
                                }
                                m2508b(c0104d, cls, cls2, i2 + 1, linkedHashSet);
                                if (!linkedHashSet.isEmpty()) {
                                    return;
                                }
                            }
                            return;
                        }
                        Method method = (Method) it.next();
                        try {
                            method.setAccessible(true);
                            c0104d2 = method.invoke(obj, null);
                        } catch (Throwable th2) {
                            c0104d2 = new C0104d(th2);
                        }
                        m2508b(c0104d2 instanceof C0104d ? null : c0104d2, cls, cls2, i2 + 1, linkedHashSet);
                    } while (linkedHashSet.isEmpty());
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static void m2509c(Object obj, List list, int i2) {
        Object c0104d;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Field fieldM2513g = m2513g(obj.getClass(), str);
            boolean zBooleanValue = false;
            int i3 = 0;
            if (fieldM2513g != null) {
                try {
                    fieldM2513g.setAccessible(true);
                    Object obj2 = fieldM2513g.get(obj);
                    Number number = obj2 instanceof Number ? (Number) obj2 : null;
                    int iIntValue = (number != null ? number.intValue() : 0) - i2;
                    if (iIntValue >= 0) {
                        i3 = iIntValue;
                    }
                    if (AbstractC0223g.m414a(fieldM2513g.getType(), Integer.TYPE)) {
                        fieldM2513g.setInt(obj, i3);
                    } else {
                        fieldM2513g.set(obj, Integer.valueOf(i3));
                    }
                    c0104d = Boolean.TRUE;
                } catch (Throwable th) {
                    c0104d = new C0104d(th);
                }
                Throwable thM246a = AbstractC0105e.m246a(c0104d);
                if (thM246a != null) {
                    AbstractC0731a.m1387d("sns set count fail", str, thM246a);
                }
                Boolean bool = Boolean.FALSE;
                if (c0104d instanceof C0104d) {
                    c0104d = bool;
                }
                zBooleanValue = ((Boolean) c0104d).booleanValue();
            }
            if (zBooleanValue) {
                return;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static String m2510d(Object obj, Set set, Class cls, Class cls2) {
        Object c0104d;
        Object c0104d2;
        Iterable<Method> iterable;
        Object c0104d3;
        String strM2511e;
        if (cls == null || cls.isInstance(obj)) {
            if (cls != null || AbstractC0174d.m360p(obj, "com.tencent.mm.plugin.sns.", false)) {
                String strM2514h = m2514h(obj, set);
                if (strM2514h != null) {
                    return strM2514h;
                }
                try {
                    c0104d = obj.getClass().getMethod("getUserName", null);
                } catch (Throwable th) {
                    c0104d = new C0104d(th);
                }
                if (c0104d instanceof C0104d) {
                    c0104d = null;
                }
                Method method = (Method) c0104d;
                if (method != null) {
                    try {
                        method.setAccessible(true);
                        Object objInvoke = method.invoke(obj, null);
                        c0104d2 = objInvoke instanceof String ? (String) objInvoke : null;
                    } catch (Throwable th2) {
                        c0104d2 = new C0104d(th2);
                    }
                    if (c0104d2 instanceof C0104d) {
                        c0104d2 = null;
                    }
                    String str = (String) c0104d2;
                    String string = str != null ? AbstractC0299i.m507C0(str).toString() : null;
                    if (string != null && !AbstractC0307q.m534d0(string) && set.contains(string)) {
                        return string;
                    }
                }
                Class<?> cls3 = obj.getClass();
                if (cls2 == null) {
                    iterable = C0131s.f426a;
                } else {
                    ConcurrentHashMap concurrentHashMap = f3851f;
                    Object obj2 = concurrentHashMap.get(cls3);
                    if (obj2 == null) {
                        Method[] declaredMethods = cls3.getDeclaredMethods();
                        AbstractC0223g.m417d(declaredMethods, "getDeclaredMethods(...)");
                        ArrayList arrayList = new ArrayList();
                        for (Method method2 : declaredMethods) {
                            Class<?>[] parameterTypes = method2.getParameterTypes();
                            AbstractC0223g.m417d(parameterTypes, "getParameterTypes(...)");
                            if (parameterTypes.length == 0 && AbstractC0223g.m414a(method2.getReturnType(), cls2)) {
                                arrayList.add(method2);
                            }
                        }
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            ((Method) it.next()).setAccessible(true);
                        }
                        Object objPutIfAbsent = concurrentHashMap.putIfAbsent(cls3, arrayList);
                        obj2 = objPutIfAbsent == null ? arrayList : objPutIfAbsent;
                    }
                    iterable = (List) obj2;
                }
                for (Method method3 : iterable) {
                    try {
                        method3.setAccessible(true);
                        c0104d3 = method3.invoke(obj, null);
                    } catch (Throwable th3) {
                        c0104d3 = new C0104d(th3);
                    }
                    if (c0104d3 instanceof C0104d) {
                        c0104d3 = null;
                    }
                    if (c0104d3 != null && (strM2511e = m2511e(c0104d3, set, cls2)) != null) {
                        return strM2511e;
                    }
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static String m2511e(Object obj, Set set, Class cls) {
        if (cls == null || cls.isInstance(obj)) {
            C0022W c0022w = f3852g;
            List list = c0022w != null ? c0022w.f170h : null;
            if (list == null) {
                list = C0131s.f426a;
            }
            String str = (String) m2518l(obj, AbstractC0123k.m281w0(AbstractC0123k.m264A0(AbstractC0123k.m274p0(list, f3856k))));
            String string = str != null ? AbstractC0299i.m507C0(str).toString() : null;
            if (string != null && !AbstractC0307q.m534d0(string) && set.contains(string)) {
                return string;
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static int m2512f(Object obj, List list, List list2, List list3, Set set) {
        List list4 = (List) m2518l(obj, list);
        if (list4 == null) {
            return 0;
        }
        int size = list4.size();
        Iterator it = list4.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next != null && m2514h(next, set) != null) {
                it.remove();
            }
        }
        int size2 = size - list4.size();
        if (size2 <= 0) {
            return 0;
        }
        m2509c(obj, list2, size2);
        m2509c(obj, list3, size2);
        return size2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static Field m2513g(Class cls, String str) {
        while (cls != null) {
            try {
                return cls.getDeclaredField(str);
            } catch (Throwable unused) {
                cls = cls.getSuperclass();
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static String m2514h(Object obj, Set set) {
        Object c0104d;
        Iterator it = m2525s().iterator();
        while (true) {
            if (!it.hasNext()) {
                for (Field field : m2507a(obj.getClass())) {
                    try {
                        field.setAccessible(true);
                        Object obj2 = field.get(obj);
                        c0104d = obj2 instanceof String ? (String) obj2 : null;
                    } catch (Throwable th) {
                        c0104d = new C0104d(th);
                    }
                    if (c0104d instanceof C0104d) {
                        c0104d = null;
                    }
                    String str = (String) c0104d;
                    String string = str != null ? AbstractC0299i.m507C0(str).toString() : null;
                    if (string != null && !AbstractC0307q.m534d0(string) && set.contains(string)) {
                        return string;
                    }
                }
                return null;
            }
            String str2 = (String) m2517k(obj, (String) it.next());
            String string2 = str2 != null ? AbstractC0299i.m507C0(str2).toString() : null;
            if (string2 != null && !AbstractC0307q.m534d0(string2) && set.contains(string2)) {
                return string2;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0279 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:202:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x00b6 A[EXC_TOP_SPLITTER, PHI: r0
  0x00b6: PHI (r0v5 z0.v) = (r0v4 z0.v), (r0v132 z0.v) binds: [B:6:0x0022, B:46:0x00b2] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:304:0x0276 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0132  */
    /* JADX INFO: renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String m2515i(Object obj, Set set, Class cls, Class cls2) {
        Object c0104d;
        String str;
        Object objInvoke;
        Object objM277s0;
        Iterator it;
        String strM2511e;
        Object c0104d2;
        String strM2514h;
        Object c0104d3;
        Object c0104d4;
        Object c0104d5;
        Object c0104d6;
        Object c0104d7;
        C1139v c1139v;
        Object c0104d8;
        Field fieldM2524r;
        Object c0104d9;
        Field fieldM2524r2;
        AbstractC0223g.m418e(obj, "target");
        if (!set.isEmpty()) {
            ConcurrentHashMap concurrentHashMap = f3850e;
            C1139v c1139v2 = (C1139v) concurrentHashMap.get(obj.getClass());
            if (c1139v2 != null) {
                try {
                    Method method = c1139v2.f3843a;
                    if (method != null) {
                        objInvoke = method.invoke(obj, null);
                    } else {
                        Field field = c1139v2.f3844b;
                        objInvoke = field != null ? field.get(obj) : obj;
                    }
                } catch (Throwable th) {
                    c0104d = new C0104d(th);
                }
                if (objInvoke == null) {
                    c0104d = null;
                    if (c0104d instanceof C0104d) {
                        c0104d = null;
                    }
                    str = (String) c0104d;
                    if (str == null && !AbstractC0307q.m534d0(str)) {
                        if (set.contains(str)) {
                            return str;
                        }
                        return null;
                    }
                    boolean z2 = false;
                    if (AbstractC0174d.m360p(obj, "com.tencent.mm.plugin.sns.", false)) {
                        String strM2514h2 = m2514h(obj, set);
                        if (strM2514h2 != null) {
                            return strM2514h2;
                        }
                        String strM2511e2 = m2511e(obj, set, cls2);
                        if (strM2511e2 != null) {
                            return strM2511e2;
                        }
                        String strM2510d = m2510d(obj, set, cls, cls2);
                        if (strM2510d != null) {
                            return strM2510d;
                        }
                    }
                    ConcurrentHashMap concurrentHashMap2 = f3848c;
                    Class<?> cls3 = obj.getClass();
                    objM277s0 = concurrentHashMap2.get(cls3);
                    String[] strArr = f3864s;
                    if (objM277s0 == null) {
                        List listM2516j = m2516j(obj.getClass());
                        ArrayList arrayList = new ArrayList();
                        for (Object obj2 : listM2516j) {
                            try {
                                c0104d6 = ((Method) obj2).invoke(obj, null);
                            } catch (Throwable th2) {
                                c0104d6 = new C0104d(th2);
                            }
                            Object obj3 = c0104d6 instanceof C0104d ? null : c0104d6;
                            if (obj3 != null) {
                                if ((cls != null && cls.isInstance(obj3)) || ((cls2 != null && cls2.isInstance(obj3)) || AbstractC0174d.m360p(obj3, "com.tencent.mm.plugin.sns.", z2) || m2520n(obj3, strArr))) {
                                    arrayList.add(obj2);
                                    break;
                                    break;
                                }
                                List listM2507a = m2507a(obj3.getClass());
                                if (!listM2507a.isEmpty()) {
                                    Iterator it2 = listM2507a.iterator();
                                    while (it2.hasNext()) {
                                        try {
                                            c0104d7 = ((Field) it2.next()).get(obj3);
                                        } catch (Throwable th3) {
                                            c0104d7 = new C0104d(th3);
                                        }
                                        if (c0104d7 instanceof C0104d) {
                                            c0104d7 = null;
                                        }
                                        if (c0104d7 != null && ((cls2 != null && cls2.isInstance(c0104d7)) || ((cls != null && cls.isInstance(c0104d7)) || m2520n(c0104d7, strArr)))) {
                                            arrayList.add(obj2);
                                            break;
                                        }
                                    }
                                }
                            }
                            z2 = false;
                        }
                        objM277s0 = AbstractC0123k.m277s0(arrayList, 2);
                        Object objPutIfAbsent = concurrentHashMap2.putIfAbsent(cls3, objM277s0);
                        if (objPutIfAbsent != null) {
                            objM277s0 = objPutIfAbsent;
                        }
                    }
                    it = ((List) objM277s0).iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            strM2511e = null;
                            break;
                        }
                        try {
                            c0104d4 = ((Method) it.next()).invoke(obj, null);
                        } catch (Throwable th4) {
                            c0104d4 = new C0104d(th4);
                        }
                        Object obj4 = c0104d4 instanceof C0104d ? null : c0104d4;
                        if (obj4 != null) {
                            strM2511e = m2511e(obj4, set, cls2);
                            if (strM2511e == null && (strM2511e = m2510d(obj4, set, cls, cls2)) == null && (!m2520n(obj4, strArr) || (strM2511e = m2514h(obj4, set)) == null)) {
                                Iterator it3 = m2507a(obj4.getClass()).iterator();
                                while (true) {
                                    if (!it3.hasNext()) {
                                        strM2511e = null;
                                        break;
                                    }
                                    Field field2 = (Field) it3.next();
                                    try {
                                        field2.setAccessible(true);
                                        c0104d5 = field2.get(obj4);
                                    } catch (Throwable th5) {
                                        c0104d5 = new C0104d(th5);
                                    }
                                    if (c0104d5 instanceof C0104d) {
                                        c0104d5 = null;
                                    }
                                    if (c0104d5 != null) {
                                        String strM2511e3 = m2511e(c0104d5, set, cls2);
                                        if (strM2511e3 != null) {
                                            strM2511e = strM2511e3;
                                            break;
                                        }
                                        if (m2520n(c0104d5, strArr) && (strM2511e = m2514h(c0104d5, set)) != null) {
                                            break;
                                        }
                                    }
                                }
                            }
                            if (strM2511e != null) {
                                break;
                            }
                        }
                    }
                    if (strM2511e != null) {
                        return strM2511e;
                    }
                    Class<?> cls4 = obj.getClass();
                    ConcurrentHashMap concurrentHashMap3 = f3849d;
                    Object obj5 = concurrentHashMap3.get(cls4);
                    if (obj5 == null) {
                        Method[] declaredMethods = cls4.getDeclaredMethods();
                        AbstractC0223g.m417d(declaredMethods, "getDeclaredMethods(...)");
                        ArrayList arrayList2 = new ArrayList();
                        for (Method method2 : declaredMethods) {
                            Class<?>[] parameterTypes = method2.getParameterTypes();
                            AbstractC0223g.m417d(parameterTypes, "getParameterTypes(...)");
                            if (parameterTypes.length == 0 && !method2.getReturnType().isPrimitive() && !AbstractC0223g.m414a(method2.getReturnType(), Void.TYPE) && ((cls2 != null && AbstractC0223g.m414a(method2.getReturnType(), cls2)) || (cls != null && AbstractC0223g.m414a(method2.getReturnType(), cls)))) {
                                arrayList2.add(method2);
                            }
                        }
                        Iterator it4 = arrayList2.iterator();
                        while (it4.hasNext()) {
                            ((Method) it4.next()).setAccessible(true);
                        }
                        Object objPutIfAbsent2 = concurrentHashMap3.putIfAbsent(cls4, arrayList2);
                        obj5 = objPutIfAbsent2 == null ? arrayList2 : objPutIfAbsent2;
                    }
                    for (Method method3 : (List) obj5) {
                        try {
                            method3.setAccessible(true);
                            c0104d3 = method3.invoke(obj, null);
                        } catch (Throwable th6) {
                            c0104d3 = new C0104d(th6);
                        }
                        if (c0104d3 instanceof C0104d) {
                            c0104d3 = null;
                        }
                        if (c0104d3 != null) {
                            String strM2511e4 = m2511e(c0104d3, set, cls2);
                            if (strM2511e4 != null) {
                                return strM2511e4;
                            }
                            String strM2510d2 = m2510d(c0104d3, set, cls, cls2);
                            if (strM2510d2 != null) {
                                return strM2510d2;
                            }
                            String strM2514h3 = m2514h(c0104d3, set);
                            if (strM2514h3 != null) {
                                return strM2514h3;
                            }
                        }
                    }
                    for (Field field3 : m2507a(obj.getClass())) {
                        try {
                            field3.setAccessible(true);
                            c0104d2 = field3.get(obj);
                        } catch (Throwable th7) {
                            c0104d2 = new C0104d(th7);
                        }
                        if (c0104d2 instanceof C0104d) {
                            c0104d2 = null;
                        }
                        if (c0104d2 != null) {
                            String strM2511e5 = m2511e(c0104d2, set, cls2);
                            if (strM2511e5 != null) {
                                return strM2511e5;
                            }
                            String strM2510d3 = m2510d(c0104d2, set, cls, cls2);
                            if (strM2510d3 != null) {
                                return strM2510d3;
                            }
                            if (AbstractC0174d.m360p(c0104d2, "com.tencent.mm.plugin.sns.", false) && (strM2514h = m2514h(c0104d2, set)) != null) {
                                return strM2514h;
                            }
                        }
                    }
                } else {
                    Object obj6 = c1139v2.f3845c.get(objInvoke);
                    String str2 = obj6 instanceof String ? (String) obj6 : null;
                    if (str2 != null) {
                        c0104d = AbstractC0299i.m507C0(str2).toString();
                    }
                    if (c0104d instanceof C0104d) {
                    }
                    str = (String) c0104d;
                    if (str == null) {
                    }
                    boolean z22 = false;
                    if (AbstractC0174d.m360p(obj, "com.tencent.mm.plugin.sns.", false)) {
                    }
                    ConcurrentHashMap concurrentHashMap22 = f3848c;
                    Class<?> cls32 = obj.getClass();
                    objM277s0 = concurrentHashMap22.get(cls32);
                    String[] strArr2 = f3864s;
                    if (objM277s0 == null) {
                    }
                    it = ((List) objM277s0).iterator();
                    while (true) {
                        if (!it.hasNext()) {
                        }
                    }
                    if (strM2511e != null) {
                    }
                }
            } else {
                Field fieldM2524r3 = m2524r(obj, cls, cls2);
                if (fieldM2524r3 == null) {
                    Iterator it5 = m2516j(obj.getClass()).iterator();
                    while (true) {
                        if (it5.hasNext()) {
                            Method method4 = (Method) it5.next();
                            try {
                                c0104d9 = method4.invoke(obj, null);
                            } catch (Throwable th8) {
                                c0104d9 = new C0104d(th8);
                            }
                            if (c0104d9 instanceof C0104d) {
                                c0104d9 = null;
                            }
                            if (c0104d9 != null && (fieldM2524r2 = m2524r(c0104d9, cls, cls2)) != null) {
                                c1139v = new C1139v(method4, null, fieldM2524r2);
                                break;
                            }
                        } else {
                            Iterator it6 = m2507a(obj.getClass()).iterator();
                            while (true) {
                                if (!it6.hasNext()) {
                                    c1139v = null;
                                    break;
                                }
                                Field field4 = (Field) it6.next();
                                try {
                                    c0104d8 = field4.get(obj);
                                } catch (Throwable th9) {
                                    c0104d8 = new C0104d(th9);
                                }
                                if (c0104d8 instanceof C0104d) {
                                    c0104d8 = null;
                                }
                                if (c0104d8 != null && (fieldM2524r = m2524r(c0104d8, cls, cls2)) != null) {
                                    c1139v = new C1139v(null, field4, fieldM2524r);
                                    break;
                                }
                            }
                        }
                    }
                } else {
                    c1139v = new C1139v(null, null, fieldM2524r3);
                }
                if (c1139v != null) {
                    concurrentHashMap.put(obj.getClass(), c1139v);
                    c1139v2 = c1139v;
                } else {
                    c1139v2 = null;
                }
                if (c1139v2 == null) {
                    str = null;
                }
                if (str == null) {
                }
                boolean z222 = false;
                if (AbstractC0174d.m360p(obj, "com.tencent.mm.plugin.sns.", false)) {
                }
                ConcurrentHashMap concurrentHashMap222 = f3848c;
                Class<?> cls322 = obj.getClass();
                objM277s0 = concurrentHashMap222.get(cls322);
                String[] strArr22 = f3864s;
                if (objM277s0 == null) {
                }
                it = ((List) objM277s0).iterator();
                while (true) {
                    if (!it.hasNext()) {
                    }
                }
                if (strM2511e != null) {
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static List m2516j(Class cls) {
        ConcurrentHashMap concurrentHashMap = f3847b;
        Object obj = concurrentHashMap.get(cls);
        if (obj == null) {
            Method[] declaredMethods = cls.getDeclaredMethods();
            AbstractC0223g.m417d(declaredMethods, "getDeclaredMethods(...)");
            ArrayList arrayList = new ArrayList();
            for (Method method : declaredMethods) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                AbstractC0223g.m417d(parameterTypes, "getParameterTypes(...)");
                if (parameterTypes.length == 0 && !method.getReturnType().isPrimitive() && !AbstractC0223g.m414a(method.getReturnType(), Void.TYPE) && !AbstractC0223g.m414a(method.getReturnType(), String.class) && !method.getReturnType().getName().equals("java.lang.Class")) {
                    arrayList.add(method);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((Method) it.next()).setAccessible(true);
            }
            Object objPutIfAbsent = concurrentHashMap.putIfAbsent(cls, arrayList);
            obj = objPutIfAbsent == null ? arrayList : objPutIfAbsent;
        }
        return (List) obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public static Object m2517k(Object obj, String str) {
        Object c0104d;
        try {
            Field fieldM2513g = m2513g(obj.getClass(), str);
            if (fieldM2513g == null) {
                return null;
            }
            fieldM2513g.setAccessible(true);
            c0104d = fieldM2513g.get(obj);
            if (c0104d == null) {
                c0104d = null;
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
    /* JADX INFO: renamed from: l */
    public static Object m2518l(Object obj, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Object objM2517k = m2517k(obj, (String) it.next());
            if (objM2517k != null) {
                return objM2517k;
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public static Set m2519m(Object obj) {
        Object c0104d;
        Object c0104d2;
        String string;
        Object objM2518l;
        String strM2523q;
        String strM2523q2;
        Method method;
        if (obj == null) {
            return C0133u.f428a;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        C0022W c0022w = f3852g;
        List list = c0022w != null ? c0022w.f168f : null;
        List list2 = C0131s.f426a;
        if (list == null) {
            list = list2;
        }
        Long l2 = (Long) m2518l(obj, AbstractC0123k.m281w0(AbstractC0123k.m264A0(AbstractC0123k.m274p0(list, f3854i))));
        if (l2 != null) {
            if (l2.longValue() <= 0) {
                l2 = null;
            }
            if (l2 != null) {
                linkedHashSet.add("sns:" + l2.longValue());
            }
        }
        C0022W c0022w2 = f3852g;
        List list3 = c0022w2 != null ? c0022w2.f169g : null;
        if (list3 != null) {
            list2 = list3;
        }
        Integer num = (Integer) m2518l(obj, AbstractC0123k.m281w0(AbstractC0123k.m264A0(AbstractC0123k.m274p0(list2, f3855j))));
        if (num != null) {
            if (num.intValue() <= 0) {
                num = null;
            }
            if (num != null) {
                linkedHashSet.add("local:" + num.intValue());
            }
        }
        try {
            Method[] methods = obj.getClass().getMethods();
            AbstractC0223g.m417d(methods, "getMethods(...)");
            int length = methods.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    method = null;
                    break;
                }
                method = methods[i2];
                if (AbstractC0223g.m414a(method.getName(), "getSnsId")) {
                    Class<?>[] parameterTypes = method.getParameterTypes();
                    AbstractC0223g.m417d(parameterTypes, "getParameterTypes(...)");
                    if (parameterTypes.length == 0) {
                        break;
                    }
                }
                i2++;
            }
            if (method == null) {
                c0104d = null;
            } else {
                method.setAccessible(true);
                c0104d = method.invoke(obj, null);
            }
        } catch (Throwable th) {
            c0104d = new C0104d(th);
        }
        if (c0104d instanceof C0104d) {
            c0104d = null;
        }
        if (c0104d != null && (strM2523q2 = m2523q(c0104d)) != null) {
            linkedHashSet.add("sns:".concat(strM2523q2));
        }
        if (obj.getClass().getName().equals("com.tencent.mm.protocal.protobuf.TimeLineObject") && (objM2518l = m2518l(obj, AbstractC0120h.m252Z(new String[]{"Id", "id"}))) != null && (strM2523q = m2523q(objM2518l)) != null) {
            linkedHashSet.add("sns:".concat(strM2523q));
        }
        try {
            Method method2 = obj.getClass().getMethod("getLocalid", null);
            method2.setAccessible(true);
            Object objInvoke = method2.invoke(obj, null);
            c0104d2 = objInvoke instanceof String ? (String) objInvoke : null;
        } catch (Throwable th2) {
            c0104d2 = new C0104d(th2);
        }
        if (c0104d2 instanceof C0104d) {
            c0104d2 = null;
        }
        String str = (String) c0104d2;
        if (str != null && (string = AbstractC0299i.m507C0(str).toString()) != null) {
            if (AbstractC0307q.m534d0(string)) {
                string = null;
            }
            if (string != null) {
                linkedHashSet.add("localStr:".concat(string));
                Integer numM530Z = AbstractC0306p.m530Z(string);
                if (numM530Z != null) {
                    Integer num2 = numM530Z.intValue() > 0 ? numM530Z : null;
                    if (num2 != null) {
                        linkedHashSet.add("local:" + num2.intValue());
                    }
                }
            }
        }
        return linkedHashSet;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public static boolean m2520n(Object obj, String[] strArr) {
        for (String str : strArr) {
            if (m2513g(obj.getClass(), str) != null) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public static int m2521o(View view, int i2, String[] strArr, int i3) {
        int iM2521o;
        if (i3 > 18 || view.getVisibility() == 8) {
            return 0;
        }
        CharSequence contentDescription = view.getContentDescription();
        String string = contentDescription != null ? contentDescription.toString() : null;
        if (string == null) {
            string = "";
        }
        if (view.getId() == i2) {
            view.setVisibility(8);
            view.setClickable(false);
            view.setFocusable(false);
            iM2521o = 1;
            break;
        }
        for (String str : strArr) {
            if (AbstractC0299i.m511i0(string, str, false)) {
                view.setVisibility(8);
                view.setClickable(false);
                view.setFocusable(false);
                iM2521o = 1;
                break;
            }
        }
        iM2521o = 0;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = viewGroup.getChildAt(i4);
                AbstractC0223g.m417d(childAt, "getChildAt(...)");
                iM2521o += m2521o(childAt, i2, strArr, i3 + 1);
            }
        }
        return iM2521o;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public static int m2522p(View view, int i2) {
        int iM2522p;
        if (i2 > 18 || view.getVisibility() == 8 || !(view instanceof ViewGroup)) {
            return 0;
        }
        ArrayList arrayList = new ArrayList();
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        boolean z2 = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = viewGroup.getChildAt(i3);
            AbstractC0223g.m415b(childAt);
            String name = childAt.getClass().getName();
            if (name.equals("com.tencent.mm.ui.widget.imageview.WeImageView") || name.endsWith(".WeImageView") || AbstractC0299i.m511i0(name, "WeImageView", false)) {
                arrayList.add(childAt);
            }
            if (childAt instanceof TextView) {
                CharSequence text = ((TextView) childAt).getText();
                String string = text != null ? text.toString() : null;
                if (string == null) {
                    string = "";
                }
                String string2 = AbstractC0299i.m507C0(string).toString();
                if (string2.length() != 0) {
                    if (f3865t.contains(string2)) {
                        z2 = true;
                        break;
                    }
                    for (C0297g c0297g : f3866u) {
                        if (c0297g.m504d(string2)) {
                            z2 = true;
                            break;
                            break;
                        }
                    }
                }
            }
        }
        if (!z2 || arrayList.size() <= 1) {
            iM2522p = 0;
        } else {
            View view2 = (View) AbstractC0123k.m267i0(arrayList);
            view2.setVisibility(8);
            view2.setClickable(false);
            view2.setFocusable(false);
            iM2522p = 1;
        }
        int childCount2 = viewGroup.getChildCount();
        for (int i4 = 0; i4 < childCount2; i4++) {
            View childAt2 = viewGroup.getChildAt(i4);
            AbstractC0223g.m417d(childAt2, "getChildAt(...)");
            iM2522p += m2522p(childAt2, i2 + 1);
        }
        return iM2522p;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public static String m2523q(Object obj) {
        if (obj instanceof Number) {
            long jLongValue = ((Number) obj).longValue();
            Long lValueOf = Long.valueOf(jLongValue);
            if (jLongValue == 0) {
                lValueOf = null;
            }
            if (lValueOf != null) {
                return lValueOf.toString();
            }
        } else if (obj instanceof CharSequence) {
            String string = AbstractC0299i.m507C0(obj.toString()).toString();
            if (string.length() > 0) {
                for (int i2 = 0; i2 < string.length(); i2++) {
                    if (Character.isDigit(string.charAt(i2))) {
                    }
                }
                return string;
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public static Field m2524r(Object obj, Class cls, Class cls2) {
        if (cls2 != null && cls2.isInstance(obj)) {
            C0022W c0022w = f3852g;
            List list = c0022w != null ? c0022w.f170h : null;
            if (list == null) {
                list = C0131s.f426a;
            }
            Iterator it = AbstractC0123k.m281w0(AbstractC0123k.m264A0(AbstractC0123k.m274p0(list, f3856k))).iterator();
            while (it.hasNext()) {
                Field fieldM2513g = m2513g(obj.getClass(), (String) it.next());
                if (fieldM2513g != null) {
                    fieldM2513g.setAccessible(true);
                    return fieldM2513g;
                }
            }
        }
        if (cls != null && cls.isInstance(obj)) {
            Iterator it2 = m2525s().iterator();
            while (it2.hasNext()) {
                Field fieldM2513g2 = m2513g(obj.getClass(), (String) it2.next());
                if (fieldM2513g2 != null) {
                    fieldM2513g2.setAccessible(true);
                    return fieldM2513g2;
                }
            }
        }
        if (m2520n(obj, f3864s) || AbstractC0174d.m360p(obj, "com.tencent.mm.plugin.sns.", false)) {
            Iterator it3 = m2525s().iterator();
            while (it3.hasNext()) {
                Field fieldM2513g3 = m2513g(obj.getClass(), (String) it3.next());
                if (fieldM2513g3 != null) {
                    fieldM2513g3.setAccessible(true);
                    return fieldM2513g3;
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public static List m2525s() {
        C0022W c0022w = f3852g;
        List list = c0022w != null ? c0022w.f167e : null;
        if (list == null) {
            list = C0131s.f426a;
        }
        return AbstractC0123k.m281w0(AbstractC0123k.m264A0(AbstractC0123k.m274p0(list, f3853h)));
    }
}
