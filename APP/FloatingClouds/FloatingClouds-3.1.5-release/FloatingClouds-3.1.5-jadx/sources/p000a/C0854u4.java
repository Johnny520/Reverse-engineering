package p000a;

import io.github.libxposed.api.XposedInterface;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import p000a.C0186K3;
import p000a.C0582fh;
import p000a.C0901wd;

/* JADX INFO: renamed from: a.u4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0854u4 {

    /* JADX INFO: renamed from: a */
    public static final C0854u4 f3353a = new C0854u4();

    /* JADX INFO: renamed from: b */
    public static volatile boolean f3354b;

    /* JADX INFO: renamed from: c */
    public static final Set<Object> f3355c;

    /* JADX INFO: renamed from: d */
    public static volatile Object f3356d;

    /* JADX INFO: renamed from: e */
    public static final Set<Object> f3357e;

    /* JADX INFO: renamed from: f */
    public static volatile Method f3358f;

    static {
        Collections.newSetFromMap(new ConcurrentHashMap());
        f3355c = Collections.newSetFromMap(new ConcurrentHashMap());
        f3357e = Collections.newSetFromMap(new ConcurrentHashMap());
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0059  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String m1979a(Object obj) {
        Object objM2206a;
        Method method;
        try {
            Method[] methods = obj.getClass().getMethods();
            C0631i9.m1481d(methods, "getMethods(...)");
            int length = methods.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    method = null;
                    break;
                }
                method = methods[i];
                if (C0631i9.m1478a(method.getName(), "v")) {
                    Class<?>[] parameterTypes = method.getParameterTypes();
                    C0631i9.m1481d(parameterTypes, "getParameterTypes(...)");
                    if (parameterTypes.length == 0 && C0631i9.m1478a(method.getReturnType(), String.class)) {
                        break;
                    }
                }
                i++;
            }
            if (method != null) {
                method.setAccessible(true);
                Object objInvoke = method.invoke(obj, null);
                String str = objInvoke instanceof String ? (String) objInvoke : null;
                if (str != null) {
                    boolean zM101P = C0034Be.m101P(str);
                    objM2206a = str;
                    if (zM101P) {
                        objM2206a = null;
                    }
                }
            }
        } catch (Throwable th) {
            objM2206a = C0920xd.m2206a(th);
        }
        return (String) (objM2206a instanceof C0901wd.a ? null : objM2206a);
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:87:0x00f5 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r8v0, types: [a.wd$a] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX INFO: renamed from: b */
    public static String m1980b(Object obj) {
        ?? M2206a;
        Object objM2206a;
        Method method;
        Object objM2206a2;
        try {
            Class<?> superclass = obj.getClass();
            int i = 0;
            loop0: while (superclass != null) {
                if (superclass.equals(Object.class) || i >= 3) {
                    break;
                }
                C0112G1 c0112g1M2122I = C0889w1.m2122I(superclass.getDeclaredFields());
                while (c0112g1M2122I.hasNext()) {
                    Field field = (Field) c0112g1M2122I.next();
                    if (!Modifier.isStatic(field.getModifiers()) && !field.getType().isPrimitive() && !C0631i9.m1478a(field.getType(), String.class)) {
                        field.setAccessible(true);
                        try {
                            objM2206a = field.get(obj);
                        } catch (Throwable th) {
                            objM2206a = C0920xd.m2206a(th);
                        }
                        if (objM2206a instanceof C0901wd.a) {
                            objM2206a = null;
                        }
                        if (objM2206a != null) {
                            Method[] methods = objM2206a.getClass().getMethods();
                            C0631i9.m1481d(methods, "getMethods(...)");
                            int length = methods.length;
                            int i2 = 0;
                            while (true) {
                                if (i2 >= length) {
                                    method = null;
                                    break;
                                }
                                method = methods[i2];
                                if (C0631i9.m1478a(method.getName(), "i1")) {
                                    Class<?>[] parameterTypes = method.getParameterTypes();
                                    C0631i9.m1481d(parameterTypes, "getParameterTypes(...)");
                                    if (parameterTypes.length == 0 && C0631i9.m1478a(method.getReturnType(), String.class)) {
                                        break;
                                    }
                                }
                                i2++;
                            }
                            if (method != null) {
                                method.setAccessible(true);
                                Object objInvoke = method.invoke(objM2206a, null);
                                M2206a = objInvoke instanceof String ? (String) objInvoke : 0;
                                if (M2206a != 0 && !C0034Be.m101P(M2206a)) {
                                    break loop0;
                                }
                            }
                            try {
                                objM2206a2 = objM2206a.getClass().getDeclaredField("field_username");
                            } catch (Throwable th2) {
                                objM2206a2 = C0920xd.m2206a(th2);
                            }
                            if (objM2206a2 instanceof C0901wd.a) {
                                objM2206a2 = null;
                            }
                            Field field2 = (Field) objM2206a2;
                            if (field2 != null) {
                                field2.setAccessible(true);
                                Object obj2 = field2.get(objM2206a);
                                M2206a = obj2 instanceof String ? (String) obj2 : 0;
                                if (M2206a != 0 && !C0034Be.m101P(M2206a)) {
                                    break loop0;
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                }
                superclass = superclass.getSuperclass();
                i++;
            }
            M2206a = 0;
        } catch (Throwable th3) {
            M2206a = C0920xd.m2206a(th3);
        }
        return (String) (M2206a instanceof C0901wd.a ? 0 : M2206a);
    }

    /* JADX INFO: renamed from: c */
    public static Class m1981c(Class cls) {
        Object objM2206a;
        Object next;
        try {
            C0112G1 c0112g1M2122I = C0889w1.m2122I(cls.getDeclaredFields());
            loop0: while (true) {
                if (c0112g1M2122I.hasNext()) {
                    Field field = (Field) c0112g1M2122I.next();
                    if (C0631i9.m1478a(field.getType(), ArrayList.class)) {
                        Type genericType = field.getGenericType();
                        if (genericType instanceof ParameterizedType) {
                            Type[] actualTypeArguments = ((ParameterizedType) genericType).getActualTypeArguments();
                            C0631i9.m1481d(actualTypeArguments, "getActualTypeArguments(...)");
                            Type type = (Type) C0238N1.m630d0(actualTypeArguments);
                            if ((type instanceof Class) && ((Class) type).isInterface()) {
                                objM2206a = (Class) type;
                                break;
                            }
                            if (type instanceof TypeVariable) {
                                C0112G1 c0112g1M2122I2 = C0889w1.m2122I(((TypeVariable) type).getBounds());
                                while (c0112g1M2122I2.hasNext()) {
                                    Type type2 = (Type) c0112g1M2122I2.next();
                                    if ((type2 instanceof Class) && ((Class) type2).isInterface() && !C0631i9.m1478a(type2, Object.class)) {
                                        objM2206a = (Class) type2;
                                        break loop0;
                                    }
                                }
                            } else {
                                continue;
                            }
                        } else {
                            continue;
                        }
                    }
                } else {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    C0112G1 c0112g1M2122I3 = C0889w1.m2122I(cls.getDeclaredMethods());
                    while (c0112g1M2122I3.hasNext()) {
                        Method method = (Method) c0112g1M2122I3.next();
                        if (C0631i9.m1478a(method.getReturnType(), Void.TYPE) && method.getParameterTypes().length == 2 && C0631i9.m1478a(method.getParameterTypes()[1], Boolean.TYPE)) {
                            Class<?> cls2 = method.getParameterTypes()[0];
                            if (cls2.isInterface() && !C0015Ae.m49H(cls2.getName(), "java.", false) && !C0015Ae.m49H(cls2.getName(), "kotlin.", false)) {
                                Integer num = (Integer) linkedHashMap.get(cls2);
                                linkedHashMap.put(cls2, Integer.valueOf((num != null ? num.intValue() : 0) + 1));
                            }
                        }
                    }
                    Iterator it = linkedHashMap.entrySet().iterator();
                    if (it.hasNext()) {
                        next = it.next();
                        if (it.hasNext()) {
                            int iIntValue = ((Number) ((Map.Entry) next).getValue()).intValue();
                            do {
                                Object next2 = it.next();
                                int iIntValue2 = ((Number) ((Map.Entry) next2).getValue()).intValue();
                                if (iIntValue < iIntValue2) {
                                    next = next2;
                                    iIntValue = iIntValue2;
                                }
                            } while (it.hasNext());
                        }
                    } else {
                        next = null;
                    }
                    Map.Entry entry = (Map.Entry) next;
                    objM2206a = entry != null ? (Class) entry.getKey() : null;
                }
            }
        } catch (Throwable th) {
            objM2206a = C0920xd.m2206a(th);
        }
        return (Class) (objM2206a instanceof C0901wd.a ? null : objM2206a);
    }

    /* JADX INFO: renamed from: e */
    public static void m1982e(Object obj, Object obj2, String str) {
        Object objM2206a;
        Object objM2206a2;
        Object objM2206a3;
        Method method = f3358f;
        if (method == null) {
            return;
        }
        String strM1979a = m1979a(obj2);
        if (strM1979a == null) {
            strM1979a = str;
        }
        try {
            method.invoke(obj, strM1979a);
            String str2 = "GUARD: submitRemove(" + strM1979a + ") — masked friend blocked from memory list";
            C0631i9.m1482e(str2, "msg");
            C0908x1.m2194b("[ConvMemGuard] ".concat(str2));
            objM2206a = C0413Wf.f1577a;
        } catch (Throwable th) {
            objM2206a = C0920xd.m2206a(th);
        }
        Throwable thM2189a = C0901wd.m2189a(objM2206a);
        if (thM2189a != null) {
            String str3 = "GUARD: submitRemove failed for " + strM1979a + ": " + thM2189a.getMessage();
            C0631i9.m1482e(str3, "msg");
            C0908x1.m2197e("[ConvMemGuard] ".concat(str3));
        }
        try {
            Object objM19h = C0002A1.m19h(obj, "f165013o");
            List list = objM19h instanceof List ? (List) objM19h : null;
            if (list != null) {
                Iterator it = list.iterator();
                C0631i9.m1481d(it, "iterator(...)");
                int i = 0;
                while (it.hasNext()) {
                    Object next = it.next();
                    if (next != null) {
                        try {
                            objM2206a3 = m1979a(next);
                        } catch (Throwable th2) {
                            objM2206a3 = C0920xd.m2206a(th2);
                        }
                        if (objM2206a3 instanceof C0901wd.a) {
                            objM2206a3 = null;
                        }
                        String strM1980b = m1980b(next);
                        if (C0631i9.m1478a((String) objM2206a3, strM1979a) || C0631i9.m1478a(strM1980b, str)) {
                            it.remove();
                            i++;
                        }
                    }
                }
                if (i > 0) {
                    String str4 = "GUARD: truth-list purge removed " + i + " item(s) for " + str + " (render window closed)";
                    C0631i9.m1482e(str4, "msg");
                    C0908x1.m2194b("[ConvMemGuard] " + str4);
                }
            }
            objM2206a2 = C0413Wf.f1577a;
        } catch (Throwable th3) {
            objM2206a2 = C0920xd.m2206a(th3);
        }
        Throwable thM2189a2 = C0901wd.m2189a(objM2206a2);
        if (thM2189a2 != null) {
            String str5 = "GUARD: truth-list purge failed: " + thM2189a2.getMessage();
            C0631i9.m1482e(str5, "msg");
            C0908x1.m2197e("[ConvMemGuard] ".concat(str5));
        }
    }

    /* JADX INFO: renamed from: f */
    public static boolean m1983f(Object obj, Class cls) {
        Object objM2206a;
        boolean z = true;
        if (obj != f3356d) {
            Set<Object> set = f3357e;
            if (!set.contains(obj)) {
                Set<Object> set2 = f3355c;
                if (set2.contains(obj)) {
                    return false;
                }
                if (set.size() >= 4) {
                    set2.add(obj);
                    return false;
                }
                try {
                    loop0: for (Class<?> superclass = obj.getClass(); superclass != null && !superclass.equals(Object.class); superclass = superclass.getSuperclass()) {
                        C0112G1 c0112g1M2122I = C0889w1.m2122I(superclass.getDeclaredFields());
                        while (c0112g1M2122I.hasNext()) {
                            Field field = (Field) c0112g1M2122I.next();
                            if (!Modifier.isStatic(field.getModifiers()) && !field.getType().isPrimitive() && !C0631i9.m1478a(field.getType(), String.class) && field.getType().isInterface()) {
                                field.setAccessible(true);
                                Object obj2 = field.get(obj);
                                if (obj2 != null) {
                                    Class<?> cls2 = obj2.getClass();
                                    if (cls != null && cls.isInstance(obj2)) {
                                        break loop0;
                                    }
                                    if (cls == null && cls2.getName().equals("fh5.w")) {
                                        Method[] declaredMethods = cls2.getDeclaredMethods();
                                        C0631i9.m1481d(declaredMethods, "getDeclaredMethods(...)");
                                        for (Method method : declaredMethods) {
                                            if (method.getParameterTypes().length == 2 && C0631i9.m1478a(method.getParameterTypes()[0], Integer.TYPE) && C0631i9.m1478a(method.getParameterTypes()[1], String.class)) {
                                                break loop0;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    z = false;
                    objM2206a = Boolean.valueOf(z);
                } catch (Throwable th) {
                    objM2206a = C0920xd.m2206a(th);
                }
                Object obj3 = Boolean.FALSE;
                if (objM2206a instanceof C0901wd.a) {
                    objM2206a = obj3;
                }
                boolean zBooleanValue = ((Boolean) objM2206a).booleanValue();
                if (zBooleanValue) {
                    if (f3356d == null) {
                        f3356d = obj;
                        String str = "isConvMvvmList: locked main conv list instance=" + obj.getClass().getName() + "@" + System.identityHashCode(obj);
                        C0631i9.m1482e(str, "msg");
                        C0908x1.m2194b("[ConvMemGuard] ".concat(str));
                    }
                    Set<Object> set3 = f3357e;
                    set3.add(obj);
                    String str2 = "isConvMvvmList: guard instance #" + set3.size() + "=" + obj.getClass().getName() + "@" + System.identityHashCode(obj);
                    C0631i9.m1482e(str2, "msg");
                    C0908x1.m2194b("[ConvMemGuard] ".concat(str2));
                } else {
                    f3355c.add(obj);
                }
                return zBooleanValue;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: g */
    public static boolean m1984g() {
        C0186K3.f638a.getClass();
        if (!C0186K3.a.m511l() || !C0186K3.a.m508i().f2444n) {
            return false;
        }
        C0915x8 c0915x8 = C0915x8.f3530a;
        return (C0915x8.m2203a() || C0889w1.f3489q) ? false : true;
    }

    /* JADX INFO: renamed from: d */
    public final void m1985d(C0173J8 c0173j8, final Class<?> cls) {
        Object objM2206a;
        Class clsM13b;
        String str;
        Class cls2;
        String str2;
        int i;
        ArrayList<Method> arrayList;
        int i2;
        Method method;
        Method method2;
        boolean z;
        int i3;
        String str3;
        if (f3354b) {
            return;
        }
        try {
            ClassLoader classLoader = c0173j8.f608a;
            clsM13b = C0002A1.m13b(classLoader, "com.tencent.mm.plugin.mvvmlist.MvvmList");
            str = "] ";
            if (clsM13b == null) {
                Iterator it = C0889w1.m2157p("MvvmList").iterator();
                while (true) {
                    if (!it.hasNext()) {
                        clsM13b = null;
                        break;
                    }
                    Class clsM13b2 = C0002A1.m13b(classLoader, (String) it.next());
                    if (clsM13b2 != null) {
                        clsM13b = clsM13b2;
                        break;
                    }
                }
                if (clsM13b != null) {
                    String str4 = "install: MvvmList located via DexKit: " + clsM13b.getName();
                    C0631i9.m1482e(str4, "msg");
                    C0908x1.m2194b("[ConvMemGuard] " + str4);
                }
            }
        } catch (Throwable th) {
            objM2206a = C0920xd.m2206a(th);
        }
        if (clsM13b == null) {
            C0908x1.m2197e("[ConvMemGuard] install: MvvmList class not found, guard disabled");
            return;
        }
        Class clsM1981c = m1981c(clsM13b);
        Class cls3 = Boolean.TYPE;
        Class cls4 = Void.TYPE;
        if (clsM1981c != null) {
            i = 1;
            Method[] declaredMethods = clsM13b.getDeclaredMethods();
            C0631i9.m1481d(declaredMethods, "getDeclaredMethods(...)");
            arrayList = new ArrayList();
            cls2 = clsM13b;
            int length = declaredMethods.length;
            int i4 = 0;
            while (i4 < length) {
                int i5 = length;
                Method method3 = declaredMethods[i4];
                int i6 = i4;
                if (C0631i9.m1478a(method3.getReturnType(), cls4)) {
                    str3 = str;
                    if (method3.getParameterTypes().length == 2 && C0631i9.m1478a(method3.getParameterTypes()[0], clsM1981c) && C0631i9.m1478a(method3.getParameterTypes()[1], cls3)) {
                        arrayList.add(method3);
                    }
                } else {
                    str3 = str;
                }
                i4 = i6 + 1;
                length = i5;
                str = str3;
            }
            str2 = str;
        } else {
            cls2 = clsM13b;
            str2 = "] ";
            i = 1;
            Method[] declaredMethods2 = cls2.getDeclaredMethods();
            C0631i9.m1481d(declaredMethods2, "getDeclaredMethods(...)");
            arrayList = new ArrayList();
            int length2 = declaredMethods2.length;
            int i7 = 0;
            while (i7 < length2) {
                Class cls5 = clsM1981c;
                Method method4 = declaredMethods2[i7];
                Method[] methodArr = declaredMethods2;
                if (C0631i9.m1478a(method4.getReturnType(), cls4)) {
                    i2 = length2;
                    if (method4.getParameterTypes().length == 2 && !method4.getParameterTypes()[0].isPrimitive() && !C0631i9.m1478a(method4.getParameterTypes()[0], String.class) && !C0631i9.m1478a(method4.getParameterTypes()[0], List.class) && method4.getParameterTypes()[0].isInterface() && C0631i9.m1478a(method4.getParameterTypes()[1], cls3)) {
                        arrayList.add(method4);
                    }
                } else {
                    i2 = length2;
                }
                i7++;
                clsM1981c = cls5;
                declaredMethods2 = methodArr;
                length2 = i2;
            }
        }
        Class cls6 = clsM1981c;
        Method[] declaredMethods3 = cls2.getDeclaredMethods();
        C0631i9.m1481d(declaredMethods3, "getDeclaredMethods(...)");
        int length3 = declaredMethods3.length;
        int i8 = 0;
        while (true) {
            if (i8 >= length3) {
                method = null;
                break;
            }
            method = declaredMethods3[i8];
            Method[] methodArr2 = declaredMethods3;
            if (C0631i9.m1478a(method.getReturnType(), cls4)) {
                i3 = length3;
                if (method.getParameterTypes().length == 2 && C0631i9.m1478a(method.getParameterTypes()[0], List.class) && C0631i9.m1478a(method.getParameterTypes()[i], cls3)) {
                    break;
                }
            } else {
                i3 = length3;
            }
            i8++;
            declaredMethods3 = methodArr2;
            length3 = i3;
        }
        Method[] declaredMethods4 = cls2.getDeclaredMethods();
        C0631i9.m1481d(declaredMethods4, "getDeclaredMethods(...)");
        int length4 = declaredMethods4.length;
        int i9 = 0;
        while (true) {
            if (i9 >= length4) {
                method2 = null;
                break;
            }
            method2 = declaredMethods4[i9];
            if (C0631i9.m1478a(method2.getReturnType(), cls4) && method2.getParameterTypes().length == i && C0631i9.m1478a(method2.getParameterTypes()[0], String.class)) {
                break;
            }
            i9++;
            i = 1;
        }
        if (method2 != null) {
            z = true;
            method2.setAccessible(true);
            f3358f = method2;
        } else {
            z = true;
        }
        int i10 = 0;
        for (Method method5 : arrayList) {
            C0631i9.m1479b(method5);
            final int i11 = 0;
            C0173J8.m469h(c0173j8, "F035", method5, new InterfaceC0064D7(this) { // from class: a.t4

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ C0854u4 f3304b;

                {
                    this.f3304b = this;
                }

                /* JADX WARN: Removed duplicated region for block: B:6:0x0028  */
                @Override // p000a.InterfaceC0064D7
                /* JADX INFO: renamed from: f */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object mo53f(Object obj) {
                    String strM1980b;
                    ArrayList arrayList2;
                    Object objProceed;
                    String strM1980b2;
                    Class cls7 = cls;
                    C0854u4 c0854u4 = this.f3304b;
                    XposedInterface.Chain chain = (XposedInterface.Chain) obj;
                    switch (i11) {
                        case 0:
                            C0631i9.m1482e(chain, "chain");
                            Object objProceed2 = chain.proceed();
                            Object thisObject = chain.getThisObject();
                            Object obj2 = chain.getArgs().get(0);
                            c0854u4.getClass();
                            if (thisObject != null && obj2 != null && C0854u4.m1984g() && C0854u4.m1983f(thisObject, cls7) && (strM1980b = C0854u4.m1980b(obj2)) != null) {
                                ExecutorService executorService = C0582fh.f2149G;
                                if (C0582fh.a.m1423a(strM1980b)) {
                                    C0854u4.m1982e(thisObject, obj2, strM1980b);
                                }
                            }
                            return objProceed2;
                        default:
                            C0631i9.m1482e(chain, "chain");
                            Object thisObject2 = chain.getThisObject();
                            Object obj3 = chain.getArgs().get(0);
                            c0854u4.getClass();
                            if (C0854u4.m1984g() && thisObject2 != null && obj3 != null && C0854u4.m1983f(thisObject2, cls7)) {
                                List list = obj3 instanceof List ? (List) obj3 : null;
                                if (list != null && !list.isEmpty()) {
                                    arrayList2 = new ArrayList(list.size());
                                    boolean z2 = false;
                                    for (Object obj4 : list) {
                                        if (obj4 == null) {
                                            arrayList2.add(null);
                                        } else {
                                            String strM1980b3 = C0854u4.m1980b(obj4);
                                            if (strM1980b3 != null) {
                                                ExecutorService executorService2 = C0582fh.f2149G;
                                                if (C0582fh.a.m1423a(strM1980b3)) {
                                                    String str5 = "BEFORE-FILTER: masked item blocked (wxid=" + strM1980b3 + ")";
                                                    C0631i9.m1482e(str5, "msg");
                                                    C0908x1.m2194b("[ConvMemGuard] ".concat(str5));
                                                    z2 = true;
                                                }
                                            }
                                            arrayList2.add(obj4);
                                        }
                                    }
                                    if (!z2) {
                                        arrayList2 = null;
                                    }
                                }
                            }
                            if (arrayList2 != null) {
                                List args = chain.getArgs();
                                C0631i9.m1481d(args, "getArgs(...)");
                                objProceed = chain.proceed(new Object[]{arrayList2, C0834t3.m1951o0(args, 1)});
                            } else {
                                objProceed = chain.proceed();
                            }
                            if (arrayList2 == null) {
                                Object thisObject3 = chain.getThisObject();
                                Object obj5 = chain.getArgs().get(0);
                                if (thisObject3 != null && obj5 != null && C0854u4.m1984g() && C0854u4.m1983f(thisObject3, cls7)) {
                                    List list2 = obj5 instanceof List ? (List) obj5 : null;
                                    if (list2 != null && !list2.isEmpty()) {
                                        for (Object obj6 : list2) {
                                            if (obj6 != null && (strM1980b2 = C0854u4.m1980b(obj6)) != null) {
                                                ExecutorService executorService3 = C0582fh.f2149G;
                                                if (C0582fh.a.m1423a(strM1980b2)) {
                                                    C0854u4.m1982e(thisObject3, obj6, strM1980b2);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            return objProceed;
                    }
                }
            });
            i10++;
        }
        if (method != null) {
            final int i12 = 1;
            C0173J8.m469h(c0173j8, "F035", method, new InterfaceC0064D7(this) { // from class: a.t4

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ C0854u4 f3304b;

                {
                    this.f3304b = this;
                }

                /* JADX WARN: Removed duplicated region for block: B:6:0x0028  */
                @Override // p000a.InterfaceC0064D7
                /* JADX INFO: renamed from: f */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object mo53f(Object obj) {
                    String strM1980b;
                    ArrayList arrayList2;
                    Object objProceed;
                    String strM1980b2;
                    Class cls7 = cls;
                    C0854u4 c0854u4 = this.f3304b;
                    XposedInterface.Chain chain = (XposedInterface.Chain) obj;
                    switch (i12) {
                        case 0:
                            C0631i9.m1482e(chain, "chain");
                            Object objProceed2 = chain.proceed();
                            Object thisObject = chain.getThisObject();
                            Object obj2 = chain.getArgs().get(0);
                            c0854u4.getClass();
                            if (thisObject != null && obj2 != null && C0854u4.m1984g() && C0854u4.m1983f(thisObject, cls7) && (strM1980b = C0854u4.m1980b(obj2)) != null) {
                                ExecutorService executorService = C0582fh.f2149G;
                                if (C0582fh.a.m1423a(strM1980b)) {
                                    C0854u4.m1982e(thisObject, obj2, strM1980b);
                                }
                            }
                            return objProceed2;
                        default:
                            C0631i9.m1482e(chain, "chain");
                            Object thisObject2 = chain.getThisObject();
                            Object obj3 = chain.getArgs().get(0);
                            c0854u4.getClass();
                            if (C0854u4.m1984g() && thisObject2 != null && obj3 != null && C0854u4.m1983f(thisObject2, cls7)) {
                                List list = obj3 instanceof List ? (List) obj3 : null;
                                if (list != null && !list.isEmpty()) {
                                    arrayList2 = new ArrayList(list.size());
                                    boolean z2 = false;
                                    for (Object obj4 : list) {
                                        if (obj4 == null) {
                                            arrayList2.add(null);
                                        } else {
                                            String strM1980b3 = C0854u4.m1980b(obj4);
                                            if (strM1980b3 != null) {
                                                ExecutorService executorService2 = C0582fh.f2149G;
                                                if (C0582fh.a.m1423a(strM1980b3)) {
                                                    String str5 = "BEFORE-FILTER: masked item blocked (wxid=" + strM1980b3 + ")";
                                                    C0631i9.m1482e(str5, "msg");
                                                    C0908x1.m2194b("[ConvMemGuard] ".concat(str5));
                                                    z2 = true;
                                                }
                                            }
                                            arrayList2.add(obj4);
                                        }
                                    }
                                    if (!z2) {
                                        arrayList2 = null;
                                    }
                                }
                            }
                            if (arrayList2 != null) {
                                List args = chain.getArgs();
                                C0631i9.m1481d(args, "getArgs(...)");
                                objProceed = chain.proceed(new Object[]{arrayList2, C0834t3.m1951o0(args, 1)});
                            } else {
                                objProceed = chain.proceed();
                            }
                            if (arrayList2 == null) {
                                Object thisObject3 = chain.getThisObject();
                                Object obj5 = chain.getArgs().get(0);
                                if (thisObject3 != null && obj5 != null && C0854u4.m1984g() && C0854u4.m1983f(thisObject3, cls7)) {
                                    List list2 = obj5 instanceof List ? (List) obj5 : null;
                                    if (list2 != null && !list2.isEmpty()) {
                                        for (Object obj6 : list2) {
                                            if (obj6 != null && (strM1980b2 = C0854u4.m1980b(obj6)) != null) {
                                                ExecutorService executorService3 = C0582fh.f2149G;
                                                if (C0582fh.a.m1423a(strM1980b2)) {
                                                    C0854u4.m1982e(thisObject3, obj6, strM1980b2);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            return objProceed;
                    }
                }
            });
            i10++;
        }
        f3354b = i10 > 0 ? z : false;
        String str5 = "install: hooked " + i10 + " methods on MvvmList (single=" + arrayList.size() + ", batch=" + (method != null ? z : false) + ", remove=" + (method2 != null ? z : false) + ", itemIface=" + (cls6 != null ? cls6.getName() : null) + ")";
        C0631i9.m1482e(str5, "msg");
        C0908x1.m2194b("[ConvMemGuard" + str2 + str5);
        objM2206a = C0413Wf.f1577a;
        Throwable thM2189a = C0901wd.m2189a(objM2206a);
        if (thM2189a != null) {
            String str6 = "install FAILED: " + thM2189a.getMessage();
            C0631i9.m1482e(str6, "msg");
            C0908x1.m2193a("[ConvMemGuard] ".concat(str6));
        }
    }
}
