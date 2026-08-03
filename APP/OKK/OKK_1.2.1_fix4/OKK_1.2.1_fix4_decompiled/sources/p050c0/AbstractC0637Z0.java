package p050c0;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import p001A0.AbstractC0040p;
import p007D0.C0137c;
import p007D0.C0140f;
import p009E0.AbstractC0181l;
import p009E0.AbstractC0188s;
import p009E0.C0180k;
import p009E0.C0190u;
import p031Q0.AbstractC0307g;
import p040V0.AbstractC0407j;
import p040V0.C0401d;
import p040V0.C0402e;
import p042W0.AbstractC0433r;

/* JADX INFO: renamed from: c0.Z0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0637Z0 {

    /* JADX INFO: renamed from: a */
    public static final ConcurrentHashMap f1953a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b */
    public static final ConcurrentHashMap f1954b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: c */
    public static final ConcurrentHashMap f1955c = new ConcurrentHashMap();

    /* JADX INFO: renamed from: d */
    public static final ConcurrentHashMap f1956d = new ConcurrentHashMap();

    /* JADX INFO: renamed from: e */
    public static final ConcurrentHashMap f1957e = new ConcurrentHashMap();

    /* JADX INFO: renamed from: f */
    public static final AtomicInteger f1958f = new AtomicInteger(0);

    /* JADX INFO: renamed from: a */
    public static List m1535a(Class cls) {
        ConcurrentHashMap concurrentHashMap = f1953a;
        Object obj = concurrentHashMap.get(cls);
        Object obj2 = obj;
        if (obj == null) {
            ArrayList arrayList = new ArrayList();
            for (Class superclass = cls; superclass != null; superclass = superclass.getSuperclass()) {
                Field[] declaredFields = superclass.getDeclaredFields();
                AbstractC0307g.m702d(declaredFields, "getDeclaredFields(...)");
                AbstractC0188s.m561m0(arrayList, declaredFields);
            }
            Object objPutIfAbsent = concurrentHashMap.putIfAbsent(cls, arrayList);
            obj2 = arrayList;
            if (objPutIfAbsent != null) {
                obj2 = objPutIfAbsent;
            }
        }
        return (List) obj2;
    }

    /* JADX INFO: renamed from: b */
    public static Object m1536b(Object obj, String str) {
        Object next;
        Class<?> cls = obj.getClass();
        String str2 = cls.getName() + "#" + str;
        ConcurrentHashMap concurrentHashMap = f1956d;
        Object obj2 = concurrentHashMap.get(str2);
        if (obj2 == null) {
            Iterator it = m1535a(cls).iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (AbstractC0307g.m699a(((Field) next).getName(), str)) {
                    break;
                }
            }
            Field field = (Field) next;
            if (field != null) {
                field.setAccessible(true);
            } else {
                field = null;
            }
            C0629V0 c0629v0 = new C0629V0(field);
            Object objPutIfAbsent = concurrentHashMap.putIfAbsent(str2, c0629v0);
            obj2 = objPutIfAbsent == null ? c0629v0 : objPutIfAbsent;
        }
        Field field2 = (Field) ((C0629V0) obj2).f1940a;
        if (field2 != null) {
            return m1541g(field2, obj);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object m1537c(int i2, Object obj) {
        Object objM116u;
        Object objM545q0;
        Object objM1536b;
        Object objM545q02;
        Object obj2 = null;
        if (obj == null || i2 < 0) {
            return null;
        }
        try {
            objM1536b = m1536b(obj, "H");
        } catch (Throwable th) {
            objM116u = AbstractC0040p.m116u(th);
        }
        if (objM1536b != null) {
            Object objM1536b2 = m1536b(objM1536b, "f146203o");
            List list = objM1536b2 instanceof List ? (List) objM1536b2 : null;
            if (list != null && (objM545q02 = AbstractC0181l.m545q0(list, i2)) != null) {
                objM116u = m1538d(objM545q02);
            }
            if (objM116u instanceof C0140f) {
            }
            if (objM116u == null) {
                return objM116u;
            }
            ConcurrentHashMap concurrentHashMap = f1957e;
            List list2 = (List) concurrentHashMap.get(obj.getClass());
            if (list2 == null) {
                objM545q0 = null;
            } else {
                Iterator it = list2.iterator();
                objM545q0 = obj;
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    AbstractC0635Y0 abstractC0635Y0 = (AbstractC0635Y0) it.next();
                    if (abstractC0635Y0 instanceof C0631W0) {
                        objM545q0 = m1541g(((C0631W0) abstractC0635Y0).f1943a, objM545q0);
                    } else {
                        if (!AbstractC0307g.m699a(abstractC0635Y0, C0633X0.f1948a)) {
                            throw new C0137c();
                        }
                        List list3 = objM545q0 instanceof List ? (List) objM545q0 : null;
                        objM545q0 = list3 != null ? AbstractC0181l.m545q0(list3, i2) : null;
                    }
                    if (objM545q0 == null) {
                        objM545q0 = null;
                        break;
                    }
                }
                if (objM545q0 == null || !m1539e(objM545q0)) {
                }
            }
            if (objM545q0 != null) {
                return objM545q0;
            }
            f1958f.incrementAndGet();
            Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap());
            AbstractC0307g.m702d(setNewSetFromMap, "newSetFromMap(...)");
            C0627U0 c0627u0M1542h = m1542h(obj, i2, 0, setNewSetFromMap, C0190u.f401a);
            if (c0627u0M1542h != null) {
                concurrentHashMap.put(obj.getClass(), c0627u0M1542h.f1938b);
                obj2 = c0627u0M1542h.f1937a;
            }
            return obj2;
        }
        objM116u = null;
        if (objM116u == null) {
        }
    }

    /* JADX INFO: renamed from: d */
    public static Object m1538d(Object obj) {
        Object next;
        if (m1539e(obj)) {
            return obj;
        }
        C0401d c0401d = new C0401d(AbstractC0407j.m995z0(new C0402e(new C0180k(2, m1535a(obj.getClass())), false, new C0570A(14)), new C0606M(3, obj)));
        while (true) {
            if (!c0401d.hasNext()) {
                next = null;
                break;
            }
            next = c0401d.next();
            if (m1539e(next)) {
                break;
            }
        }
        if (next != null) {
            return next;
        }
        C0401d c0401d2 = new C0401d(AbstractC0407j.m995z0(new C0402e(new C0180k(2, m1535a(obj.getClass())), false, new C0570A(15)), new C0606M(4, obj)));
        if (c0401d2.hasNext()) {
            return c0401d2.next();
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m1539e(Object obj) {
        return (m1540f(obj, "getCreateTime", "field_createTime") == null || m1540f(obj, "getMsgId", "field_msgId") == null) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0024  */
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Long m1540f(Object obj, String str, String str2) {
        Object objM116u;
        try {
            Method methodM1544j = m1544j(obj.getClass(), str);
            if (methodM1544j != null) {
                Object objInvoke = methodM1544j.invoke(obj, null);
                Number number = objInvoke instanceof Number ? (Number) objInvoke : null;
                objM116u = number != null ? Long.valueOf(number.longValue()) : null;
            }
        } catch (Throwable th) {
            objM116u = AbstractC0040p.m116u(th);
        }
        if (objM116u instanceof C0140f) {
            objM116u = null;
        }
        Long l2 = (Long) objM116u;
        if (l2 != null) {
            return l2;
        }
        Object objM1536b = m1536b(obj, str2);
        Number number2 = objM1536b instanceof Number ? (Number) objM1536b : null;
        if (number2 != null) {
            return Long.valueOf(number2.longValue());
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public static Object m1541g(Field field, Object obj) {
        Object objM116u;
        try {
            field.setAccessible(true);
            objM116u = field.get(obj);
        } catch (Throwable th) {
            objM116u = AbstractC0040p.m116u(th);
        }
        if (objM116u instanceof C0140f) {
            return null;
        }
        return objM116u;
    }

    /* JADX INFO: renamed from: h */
    public static C0627U0 m1542h(Object obj, int i2, int i3, Set set, List list) {
        Object objM1541g;
        if (obj == null || i3 > 5 || !set.add(obj)) {
            return null;
        }
        if (m1539e(obj)) {
            return new C0627U0(obj, list);
        }
        if (obj instanceof List) {
            Object objM545q0 = AbstractC0181l.m545q0((List) obj, i2);
            if (objM545q0 == null) {
                return null;
            }
            C0633X0 c0633x0 = C0633X0.f1948a;
            ArrayList arrayList = new ArrayList(list.size() + 1);
            arrayList.addAll(list);
            arrayList.add(c0633x0);
            return m1542h(objM545q0, i2, i3 + 1, set, arrayList);
        }
        if (m1543i(obj.getClass())) {
            return null;
        }
        for (Field field : m1535a(obj.getClass())) {
            if (!Modifier.isStatic(field.getModifiers())) {
                Class<?> type = field.getType();
                AbstractC0307g.m702d(type, "getType(...)");
                if (!((List.class.isAssignableFrom(type) || Iterable.class.isAssignableFrom(type)) ? false : m1543i(type)) && (objM1541g = m1541g(field, obj)) != null) {
                    C0631W0 c0631w0 = new C0631W0(field);
                    ArrayList arrayList2 = new ArrayList(list.size() + 1);
                    arrayList2.addAll(list);
                    arrayList2.add(c0631w0);
                    C0627U0 c0627u0M1542h = m1542h(objM1541g, i2, i3 + 1, set, arrayList2);
                    if (c0627u0M1542h != null) {
                        return c0627u0M1542h;
                    }
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: i */
    public static boolean m1543i(Class cls) {
        if (cls.isPrimitive() || cls.isArray() || cls.equals(String.class) || cls.equals(Class.class)) {
            return true;
        }
        String name = cls.getName();
        return AbstractC0433r.m1033H0(name, "android.", false) || AbstractC0433r.m1033H0(name, "java.lang.", false) || AbstractC0433r.m1033H0(name, "java.io.", false) || AbstractC0433r.m1033H0(name, "kotlin.", false);
    }

    /* JADX INFO: renamed from: j */
    public static Method m1544j(Class cls, String str) {
        Method method;
        Object next;
        String str2 = cls.getName() + "#" + str;
        ConcurrentHashMap concurrentHashMap = f1955c;
        Object obj = concurrentHashMap.get(str2);
        if (obj == null) {
            ConcurrentHashMap concurrentHashMap2 = f1954b;
            Object obj2 = concurrentHashMap2.get(cls);
            Object obj3 = obj2;
            if (obj2 == null) {
                ArrayList arrayList = new ArrayList();
                for (Class superclass = cls; superclass != null; superclass = superclass.getSuperclass()) {
                    Method[] declaredMethods = superclass.getDeclaredMethods();
                    AbstractC0307g.m702d(declaredMethods, "getDeclaredMethods(...)");
                    AbstractC0188s.m561m0(arrayList, declaredMethods);
                }
                Object objPutIfAbsent = concurrentHashMap2.putIfAbsent(cls, arrayList);
                obj3 = arrayList;
                if (objPutIfAbsent != null) {
                    obj3 = objPutIfAbsent;
                }
            }
            Iterator it = ((List) obj3).iterator();
            while (true) {
                method = null;
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                Method method2 = (Method) next;
                if (AbstractC0307g.m699a(method2.getName(), str)) {
                    Class<?>[] parameterTypes = method2.getParameterTypes();
                    AbstractC0307g.m702d(parameterTypes, "getParameterTypes(...)");
                    if (parameterTypes.length == 0) {
                        break;
                    }
                }
            }
            Method method3 = (Method) next;
            if (method3 != null) {
                method3.setAccessible(true);
                method = method3;
            }
            C0629V0 c0629v0 = new C0629V0(method);
            Object objPutIfAbsent2 = concurrentHashMap.putIfAbsent(str2, c0629v0);
            obj = objPutIfAbsent2 == null ? c0629v0 : objPutIfAbsent2;
        }
        return (Method) ((C0629V0) obj).f1940a;
    }
}
