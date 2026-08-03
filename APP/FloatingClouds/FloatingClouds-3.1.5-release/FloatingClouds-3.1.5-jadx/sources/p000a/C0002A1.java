package p000a;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: a.A1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0002A1 {

    /* JADX INFO: renamed from: a */
    public static final WeakHashMap<Object, Map<String, Object>> f22a = new WeakHashMap<>();

    /* JADX INFO: renamed from: a */
    public static final Object m12a(Object obj, String str, Object... objArr) {
        if (obj == null) {
            return null;
        }
        for (Class<?> superclass = obj.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
            C0112G1 c0112g1M2122I = C0889w1.m2122I(superclass.getDeclaredMethods());
            while (c0112g1M2122I.hasNext()) {
                Method method = (Method) c0112g1M2122I.next();
                if (C0631i9.m1478a(method.getName(), str) && method.getParameterTypes().length == objArr.length) {
                    method.setAccessible(true);
                    try {
                        return method.invoke(obj, Arrays.copyOf(objArr, objArr.length));
                    } catch (Exception unused) {
                        continue;
                    }
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static final Class m13b(ClassLoader classLoader, String str) {
        C0631i9.m1482e(str, "className");
        C0631i9.m1482e(classLoader, "classLoader");
        try {
            return classLoader.loadClass(str);
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static final Field m14c(Class<?> cls, Class<?> cls2) {
        while (cls != null) {
            C0112G1 c0112g1M2122I = C0889w1.m2122I(cls.getDeclaredFields());
            while (c0112g1M2122I.hasNext()) {
                Field field = (Field) c0112g1M2122I.next();
                if (C0631i9.m1478a(field.getType(), cls2)) {
                    field.setAccessible(true);
                    return field;
                }
            }
            cls = cls.getSuperclass();
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004e, code lost:
    
        r0 = new java.util.ArrayList(r11.length);
        r2 = r11.length;
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0056, code lost:
    
        if (r5 >= r2) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0058, code lost:
    
        r6 = r11[r5];
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005c, code lost:
    
        if ((r6 instanceof java.lang.Class) == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005e, code lost:
    
        r6 = (java.lang.Class) r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0063, code lost:
    
        if ((r6 instanceof java.lang.String) == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0065, code lost:
    
        r7 = r9.getClassLoader();
        p000a.C0631i9.m1481d(r7, "getClassLoader(...)");
        r6 = m13b(r7, (java.lang.String) r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0075, code lost:
    
        if (r6 == 0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0077, code lost:
    
        r6 = r6.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007c, code lost:
    
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007d, code lost:
    
        r0.add(r6);
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0083, code lost:
    
        r11 = (java.lang.Class[]) r0.toArray(new java.lang.Class[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x008b, code lost:
    
        r0 = r9.getDeclaredMethod(r10, (java.lang.Class[]) java.util.Arrays.copyOf(r11, r11.length));
        r0.setAccessible(true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0099, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x009a, code lost:
    
        r9 = r9.getSuperclass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a0, code lost:
    
        r0 = r9.getDeclaredMethod(r10, (java.lang.Class[]) java.util.Arrays.copyOf(r11, r11.length));
        r0.setAccessible(true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ae, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00af, code lost:
    
        r9 = r9.getSuperclass();
     */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Method m15d(Class<?> cls, String str, Object... objArr) {
        C0631i9.m1482e(cls, "clazz");
        C0631i9.m1482e(str, "methodName");
        C0631i9.m1482e(objArr, "parameterTypes");
        int length = objArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            if (objArr[i] == null) {
                while (cls != null) {
                    C0112G1 c0112g1M2122I = C0889w1.m2122I(cls.getDeclaredMethods());
                    while (c0112g1M2122I.hasNext()) {
                        Method method = (Method) c0112g1M2122I.next();
                        if (C0631i9.m1478a(method.getName(), str) && method.getParameterTypes().length == objArr.length) {
                            method.setAccessible(true);
                            return method;
                        }
                    }
                    cls = cls.getSuperclass();
                }
            } else {
                i++;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public static final Method m16e(String str, ClassLoader classLoader, String str2, Object... objArr) {
        C0631i9.m1482e(str, "className");
        C0631i9.m1482e(classLoader, "classLoader");
        C0631i9.m1482e(str2, "methodName");
        C0631i9.m1482e(objArr, "parameterTypes");
        Class clsM13b = m13b(classLoader, str);
        if (clsM13b == null) {
            return null;
        }
        return m15d(clsM13b, str2, Arrays.copyOf(objArr, objArr.length));
    }

    /* JADX INFO: renamed from: f */
    public static final Method[] m17f(Class<?> cls, InterfaceC0064D7<? super Method, Boolean> interfaceC0064D7) {
        C0631i9.m1482e(cls, "clazz");
        Method[] declaredMethods = cls.getDeclaredMethods();
        C0631i9.m1481d(declaredMethods, "getDeclaredMethods(...)");
        ArrayList arrayList = new ArrayList();
        for (Method method : declaredMethods) {
            if (interfaceC0064D7.mo53f(method).booleanValue()) {
                arrayList.add(method);
            }
        }
        return (Method[]) arrayList.toArray(new Method[0]);
    }

    /* JADX INFO: renamed from: g */
    public static final synchronized Object m18g(Object obj) {
        Map<String, Object> map;
        map = f22a.get(obj);
        return map != null ? map.get("wxmask_origin_user") : null;
    }

    /* JADX INFO: renamed from: h */
    public static final Object m19h(Object obj, String str) {
        C0631i9.m1482e(str, "fieldName");
        if (obj == null) {
            return null;
        }
        for (Class<?> superclass = obj.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
            try {
                Field declaredField = superclass.getDeclaredField(str);
                declaredField.setAccessible(true);
                return declaredField.get(obj);
            } catch (NoSuchFieldException unused) {
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: i */
    public static final void m20i(Object obj, String str, String str2) throws IllegalAccessException {
        C0631i9.m1482e(str, "fieldName");
        if (obj == null) {
            return;
        }
        for (Class<?> superclass = obj.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
            try {
                Field declaredField = superclass.getDeclaredField(str);
                declaredField.setAccessible(true);
                declaredField.set(obj, str2);
                return;
            } catch (NoSuchFieldException unused) {
            }
        }
    }
}
