package p000a;

import android.content.Context;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import p000a.C0901wd;

/* JADX INFO: renamed from: a.ah */
/* JADX INFO: loaded from: classes.dex */
public final class C0487ah {

    /* JADX INFO: renamed from: a */
    public static final Class<? extends Object>[] f1814a;

    /* JADX INFO: renamed from: b */
    public static final String[] f1815b;

    /* JADX INFO: renamed from: c */
    public static Class<?> f1816c;

    /* JADX INFO: renamed from: d */
    public static ArrayList f1817d;

    /* JADX INFO: renamed from: e */
    public static Method f1818e;

    /* JADX INFO: renamed from: f */
    public static Method f1819f;

    /* JADX INFO: renamed from: g */
    public static Method f1820g;

    static {
        Class cls = Long.TYPE;
        Class cls2 = Boolean.TYPE;
        f1814a = new Class[]{String.class, cls2, cls2, cls};
        f1815b = new String[]{"i", "f309528i", "f", "f309528f"};
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x007b  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final String m1180a(Object obj) {
        Object objM2206a;
        Object objM2206a2;
        String[] strArr = f1815b;
        int i = 0;
        while (true) {
            if (i >= 4) {
                for (Field field : m1181b(obj.getClass())) {
                    try {
                        if (C0631i9.m1478a(field.getType(), String.class)) {
                            field.setAccessible(true);
                            Object obj2 = field.get(obj);
                            String str = obj2 instanceof String ? (String) obj2 : null;
                            if (str != null) {
                                boolean zM2221a = C0943yh.m2221a(str);
                                objM2206a = str;
                                if (!zM2221a) {
                                    objM2206a = null;
                                }
                            }
                        }
                    } catch (Throwable th) {
                        objM2206a = C0920xd.m2206a(th);
                    }
                    boolean z = objM2206a instanceof C0901wd.a;
                    Object obj3 = objM2206a;
                    if (z) {
                        obj3 = null;
                    }
                    String str2 = (String) obj3;
                    if (str2 != null) {
                        return str2;
                    }
                }
                return null;
            }
            try {
                Field declaredField = obj.getClass().getDeclaredField(strArr[i]);
                declaredField.setAccessible(true);
                Object obj4 = declaredField.get(obj);
                objM2206a2 = obj4 instanceof String ? (String) obj4 : null;
            } catch (Throwable th2) {
                objM2206a2 = C0920xd.m2206a(th2);
            }
            String str3 = (String) (objM2206a2 instanceof C0901wd.a ? null : objM2206a2);
            if (str3 != null && !C0034Be.m101P(str3)) {
                return str3;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: b */
    public static ArrayList m1181b(Class cls) {
        ArrayList arrayList = new ArrayList();
        while (cls != null && !cls.equals(Object.class)) {
            Field[] declaredFields = cls.getDeclaredFields();
            C0631i9.m1481d(declaredFields, "getDeclaredFields(...)");
            List listAsList = Arrays.asList(declaredFields);
            C0631i9.m1481d(listAsList, "asList(...)");
            arrayList.addAll(listAsList);
            cls = cls.getSuperclass();
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006e  */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m1182c(Class cls) {
        boolean z;
        boolean z2;
        boolean z3;
        if (!cls.equals(Object.class)) {
            ArrayList<Field> arrayListM1181b = m1181b(cls);
            if (arrayListM1181b.isEmpty()) {
                z = false;
                if (arrayListM1181b.isEmpty()) {
                    for (Field field : arrayListM1181b) {
                        if (C0631i9.m1478a(field.getType(), Integer.TYPE) || C0631i9.m1478a(field.getType(), Integer.class)) {
                            z2 = true;
                            break;
                        }
                    }
                    z2 = false;
                    if (arrayListM1181b.isEmpty()) {
                    }
                } else {
                    z2 = false;
                    if (arrayListM1181b.isEmpty()) {
                        for (Field field2 : arrayListM1181b) {
                            if (C0631i9.m1478a(field2.getType(), Long.TYPE) || C0631i9.m1478a(field2.getType(), Long.class)) {
                                z3 = true;
                                break;
                            }
                        }
                        z3 = false;
                        if (!z) {
                        }
                    } else {
                        z3 = false;
                        if (!z && z2 && z3) {
                            return true;
                        }
                    }
                }
            } else {
                Iterator it = arrayListM1181b.iterator();
                while (it.hasNext()) {
                    if (C0631i9.m1478a(((Field) it.next()).getType(), String.class)) {
                        z = true;
                        break;
                    }
                }
                z = false;
                if (arrayListM1181b.isEmpty()) {
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public static void m1183d(String str) {
        C0908x1.m2194b(Arrays.copyOf(new Object[]{C0944z.m2231k("[VoipClassResolver] ", str)}, 1));
    }

    /* JADX INFO: renamed from: e */
    public static final List<Method> m1184e(ClassLoader classLoader) {
        C0631i9.m1482e(classLoader, "classLoader");
        ArrayList arrayList = f1817d;
        if (arrayList != null) {
            return arrayList;
        }
        Class clsM1188i = m1188i(classLoader);
        if (clsM1188i == null) {
            m1183d("resolveVoipMgrClass returned null");
            return C0439Y5.f1645a;
        }
        Method[] declaredMethods = clsM1188i.getDeclaredMethods();
        C0631i9.m1481d(declaredMethods, "getDeclaredMethods(...)");
        ArrayList arrayList2 = new ArrayList();
        for (Method method : declaredMethods) {
            if (C0631i9.m1478a(method.getReturnType(), Void.TYPE) && Arrays.equals(method.getParameterTypes(), f1814a)) {
                arrayList2.add(method);
            }
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            ((Method) it.next()).setAccessible(true);
        }
        if (arrayList2.isEmpty()) {
            m1183d("cannot find bindVoipForegroundIfNeed method in ".concat(clsM1188i.getName()));
            return arrayList2;
        }
        f1817d = arrayList2;
        m1183d("resolved bind methods: " + C0834t3.m1952p0(arrayList2, null, new C0673kd(28), 31));
        return arrayList2;
    }

    /* JADX INFO: renamed from: f */
    public static final Method m1185f(ClassLoader classLoader) {
        Class cls;
        C0631i9.m1482e(classLoader, "classLoader");
        Method method = f1819f;
        if (method != null) {
            return method;
        }
        Class clsM1188i = m1188i(classLoader);
        if (clsM1188i == null) {
            return null;
        }
        Method[] declaredMethods = clsM1188i.getDeclaredMethods();
        C0631i9.m1481d(declaredMethods, "getDeclaredMethods(...)");
        ArrayList arrayList = new ArrayList();
        int length = declaredMethods.length;
        int i = 0;
        while (true) {
            cls = Void.TYPE;
            if (i >= length) {
                break;
            }
            Method method2 = declaredMethods[i];
            if ((C0631i9.m1478a(method2.getName(), "h") || C0631i9.m1478a(method2.getName(), "H")) && C0631i9.m1478a(method2.getReturnType(), cls) && method2.getParameterTypes().length == 1) {
                Class<?> cls2 = method2.getParameterTypes()[0];
                C0631i9.m1481d(cls2, "get(...)");
                if (m1182c(cls2)) {
                    arrayList.add(method2);
                }
            }
            i++;
        }
        Method method3 = (Method) C0834t3.m1950n0(arrayList);
        if (method3 != null) {
            method3.setAccessible(true);
            f1819f = method3;
            String name = method3.getDeclaringClass().getName();
            String name2 = method3.getName();
            String name3 = method3.getParameterTypes()[0].getName();
            StringBuilder sbM2229i = C0944z.m2229i("resolved incoming call handler method: ", name, "#", name2, " param=");
            sbM2229i.append(name3);
            m1183d(sbM2229i.toString());
            return method3;
        }
        m1183d("cannot find incoming call handler method in ".concat(clsM1188i.getName()));
        Method[] declaredMethods2 = clsM1188i.getDeclaredMethods();
        C0631i9.m1481d(declaredMethods2, "getDeclaredMethods(...)");
        ArrayList arrayList2 = new ArrayList();
        for (Method method4 : declaredMethods2) {
            if (C0631i9.m1478a(method4.getReturnType(), cls) && method4.getParameterTypes().length == 1) {
                Class<?> cls3 = method4.getParameterTypes()[0];
                C0631i9.m1481d(cls3, "get(...)");
                if (m1182c(cls3)) {
                    arrayList2.add(method4);
                }
            }
        }
        Method method5 = (Method) C0834t3.m1950n0(arrayList2);
        if (method5 == null) {
            return method3;
        }
        method5.setAccessible(true);
        f1819f = method5;
        m1183d("fallback resolved incoming call handler method: " + method5.getDeclaringClass().getName() + "#" + method5.getName());
        return method5;
    }

    /* JADX INFO: renamed from: g */
    public static final Method m1186g(ClassLoader classLoader) {
        Class clsM887h;
        C0631i9.m1482e(classLoader, "classLoader");
        Method method = f1818e;
        if (method != null) {
            return method;
        }
        m1183d("resolveIncomingCallManagerMethod start");
        try {
            C0319Rb.f1143a.getClass();
            clsM887h = C0319Rb.m887h(classLoader);
            if (clsM887h != null) {
                m1183d("use incoming call mgr (DexKit/Fallback): ".concat(clsM887h.getName()));
            } else {
                m1183d("incoming call mgr not found (DexKit + fallback 均失败)");
            }
        } catch (Throwable th) {
            m1183d("resolveIncomingCallMgrClass threw: " + th.getClass().getName() + ": " + th.getMessage());
            clsM887h = null;
        }
        if (clsM887h == null) {
            m1183d("resolveIncomingCallManagerMethod: mgrClass is null");
            return null;
        }
        m1183d("resolveIncomingCallManagerMethod: scanning " + clsM887h.getName() + ", methods=" + clsM887h.getDeclaredMethods().length);
        Method[] declaredMethods = clsM887h.getDeclaredMethods();
        C0631i9.m1481d(declaredMethods, "getDeclaredMethods(...)");
        ArrayList<Method> arrayList = new ArrayList();
        for (Method method2 : declaredMethods) {
            if (C0631i9.m1478a(method2.getName(), "a") && C0631i9.m1478a(method2.getReturnType(), Boolean.TYPE) && method2.getParameterTypes().length == 1) {
                arrayList.add(method2);
            }
        }
        for (Method method3 : arrayList) {
            String name = method3.getName();
            Class<?>[] parameterTypes = method3.getParameterTypes();
            C0631i9.m1481d(parameterTypes, "getParameterTypes(...)");
            String strM631e0 = C0238N1.m631e0(parameterTypes, null, new C0673kd(27), 31);
            String name2 = method3.getReturnType().getName();
            StringBuilder sbM2229i = C0944z.m2229i("  candidate: ", name, "(", strM631e0, ") return=");
            sbM2229i.append(name2);
            m1183d(sbM2229i.toString());
        }
        Method method4 = (Method) C0834t3.m1950n0(arrayList);
        if (method4 != null) {
            method4.setAccessible(true);
            f1818e = method4;
            String name3 = method4.getDeclaringClass().getName();
            String name4 = method4.getName();
            String name5 = method4.getParameterTypes()[0].getName();
            StringBuilder sbM2229i2 = C0944z.m2229i("resolved incoming call method: ", name3, "#", name4, " param=");
            sbM2229i2.append(name5);
            m1183d(sbM2229i2.toString());
        } else {
            m1183d("cannot find incoming call method in ".concat(clsM887h.getName()));
        }
        return method4;
    }

    /* JADX INFO: renamed from: h */
    public static final Method m1187h(ClassLoader classLoader) {
        char c;
        Class cls;
        Class cls2;
        Class cls3;
        int i;
        char c2;
        Method method;
        Method method2;
        Method method3;
        char c3;
        C0631i9.m1482e(classLoader, "classLoader");
        Method method4 = f1820g;
        if (method4 != null) {
            return method4;
        }
        Class clsM1188i = m1188i(classLoader);
        if (clsM1188i == null) {
            return null;
        }
        Method[] declaredMethods = clsM1188i.getDeclaredMethods();
        C0631i9.m1481d(declaredMethods, "getDeclaredMethods(...)");
        int length = declaredMethods.length;
        int i2 = 0;
        while (true) {
            c = 4;
            cls = Boolean.TYPE;
            cls2 = Long.TYPE;
            cls3 = Void.TYPE;
            if (i2 >= length) {
                i = 0;
                c2 = 5;
                method = null;
                break;
            }
            Method method5 = declaredMethods[i2];
            i = 0;
            c2 = 5;
            if (C0631i9.m1478a(method5.getName(), "M") && C0631i9.m1478a(method5.getReturnType(), cls3) && method5.getParameterTypes().length == 6 && C0631i9.m1478a(method5.getParameterTypes()[0], Context.class) && C0631i9.m1478a(method5.getParameterTypes()[1], String.class) && C0631i9.m1478a(method5.getParameterTypes()[2], cls2) && C0631i9.m1478a(method5.getParameterTypes()[3], cls) && C0631i9.m1478a(method5.getParameterTypes()[4], cls) && C0631i9.m1478a(method5.getParameterTypes()[5], cls)) {
                method = method5;
                break;
            }
            i2++;
        }
        if (method != null) {
            method.setAccessible(true);
            f1820g = method;
            m1183d("resolved incoming call UI method: " + method.getDeclaringClass().getName() + "#" + method.getName());
            return method;
        }
        m1183d("cannot find incoming call UI method in ".concat(clsM1188i.getName()));
        Method[] declaredMethods2 = clsM1188i.getDeclaredMethods();
        C0631i9.m1481d(declaredMethods2, "getDeclaredMethods(...)");
        int length2 = declaredMethods2.length;
        int i3 = i;
        while (true) {
            if (i3 >= length2) {
                method2 = null;
                break;
            }
            method2 = declaredMethods2[i3];
            if (C0631i9.m1478a(method2.getReturnType(), cls3) && method2.getParameterTypes().length == 6 && C0631i9.m1478a(method2.getParameterTypes()[i], Context.class) && C0631i9.m1478a(method2.getParameterTypes()[1], String.class)) {
                if (C0631i9.m1478a(method2.getParameterTypes()[2], cls2)) {
                    c3 = c;
                } else {
                    c3 = c;
                    if (!C0631i9.m1478a(method2.getParameterTypes()[2], Long.class)) {
                        continue;
                    }
                }
                if (C0631i9.m1478a(method2.getParameterTypes()[3], cls) && C0631i9.m1478a(method2.getParameterTypes()[c3], cls) && C0631i9.m1478a(method2.getParameterTypes()[c2], cls)) {
                    break;
                }
            } else {
                c3 = c;
            }
            i3++;
            c = c3;
        }
        if (method2 != null) {
            method2.setAccessible(true);
            method3 = method2;
        } else {
            method3 = null;
        }
        if (method3 == null) {
            return method;
        }
        f1820g = method3;
        m1183d("fallback resolved incoming call UI method: " + method3.getDeclaringClass().getName() + "#" + method3.getName());
        return method3;
    }

    /* JADX INFO: renamed from: i */
    public static Class m1188i(ClassLoader classLoader) {
        Class<?> cls = f1816c;
        if (cls != null) {
            return cls;
        }
        C0319Rb.f1143a.getClass();
        Class<?> clsM890k = C0319Rb.m890k(classLoader);
        if (clsM890k == null) {
            return null;
        }
        f1816c = clsM890k;
        m1183d("use VoIP mgr (DexKit/Fallback): ".concat(clsM890k.getName()));
        return clsM890k;
    }
}
