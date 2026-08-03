package p000a;

import android.content.Context;
import io.github.libxposed.api.XposedInterface;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import p000a.C0186K3;
import p000a.C0901wd;
import top.mmjz.floatingclouds.bean.MaskItemBean;
import top.mmjz.floatingclouds.plugin.IPlugin;

/* JADX INFO: renamed from: a.D8 */
/* JADX INFO: loaded from: classes.dex */
public final class C0065D8 implements IPlugin {
    /* JADX INFO: renamed from: a */
    public static String m156a(Object obj) {
        C0901wd.a aVarM2206a;
        Field fieldM160e;
        try {
            Method methodM158c = m158c(obj.getClass());
            if (methodM158c != null) {
                Object objInvoke = methodM158c.invoke(obj, null);
                String str = objInvoke instanceof String ? (String) objInvoke : null;
                if (str != null && !C0034Be.m101P(str)) {
                    return str;
                }
            }
            C0112G1 c0112g1M2122I = C0889w1.m2122I(obj.getClass().getMethods());
            while (c0112g1M2122I.hasNext()) {
                Method method = (Method) c0112g1M2122I.next();
                Class<?>[] parameterTypes = method.getParameterTypes();
                C0631i9.m1481d(parameterTypes, "getParameterTypes(...)");
                if (parameterTypes.length == 0 && C0631i9.m1478a(method.getReturnType(), String.class) && !C0631i9.m1478a(method.getName(), "toString") && !C0631i9.m1478a(method.getName(), "getClass")) {
                    try {
                        Object objInvoke2 = method.invoke(obj, null);
                        String str2 = objInvoke2 instanceof String ? (String) objInvoke2 : null;
                        if (str2 != null && C0943yh.m2221a(str2)) {
                            return str2;
                        }
                        C0413Wf c0413Wf = C0413Wf.f1577a;
                    } catch (Throwable th) {
                        C0920xd.m2206a(th);
                    }
                }
            }
            C0413Wf c0413Wf2 = C0413Wf.f1577a;
        } catch (Throwable th2) {
            C0920xd.m2206a(th2);
        }
        try {
            C0112G1 c0112g1M2122I2 = C0889w1.m2122I(obj.getClass().getDeclaredFields());
            while (c0112g1M2122I2.hasNext()) {
                Field field = (Field) c0112g1M2122I2.next();
                if (!Modifier.isStatic(field.getModifiers()) && !field.getType().isPrimitive() && !C0631i9.m1478a(field.getType(), String.class)) {
                    field.setAccessible(true);
                    Object obj2 = field.get(obj);
                    if (obj2 != null && (fieldM160e = m160e(obj2.getClass())) != null) {
                        fieldM160e.setAccessible(true);
                        Object obj3 = fieldM160e.get(obj2);
                        String str3 = obj3 instanceof String ? (String) obj3 : null;
                        if (str3 != null && !C0034Be.m101P(str3)) {
                            return str3;
                        }
                    }
                }
            }
            C0413Wf c0413Wf3 = C0413Wf.f1577a;
        } catch (Throwable th3) {
            C0920xd.m2206a(th3);
        }
        try {
            for (Class<?> superclass = obj.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                if (superclass.equals(Object.class)) {
                    break;
                }
                C0112G1 c0112g1M2122I3 = C0889w1.m2122I(superclass.getDeclaredFields());
                while (c0112g1M2122I3.hasNext()) {
                    Field field2 = (Field) c0112g1M2122I3.next();
                    if (!Modifier.isStatic(field2.getModifiers()) && C0631i9.m1478a(field2.getType(), String.class)) {
                        field2.setAccessible(true);
                        Object obj4 = field2.get(obj);
                        String str4 = obj4 instanceof String ? (String) obj4 : null;
                        if (str4 != null && C0943yh.m2221a(str4)) {
                            return str4;
                        }
                    }
                }
            }
            aVarM2206a = null;
        } catch (Throwable th4) {
            aVarM2206a = C0920xd.m2206a(th4);
        }
        return (String) (aVarM2206a == null ? aVarM2206a : null);
    }

    /* JADX INFO: renamed from: b */
    public static int m157b(ArrayList arrayList, HashSet hashSet) {
        C0901wd.a aVarM2206a;
        String strM156a;
        Object next;
        Iterator it = arrayList.iterator();
        C0631i9.m1481d(it, "iterator(...)");
        int i = 0;
        while (it.hasNext()) {
            Object next2 = it.next();
            if (next2 != null) {
                try {
                    for (Class<?> superclass = next2.getClass(); superclass != null && !superclass.equals(Object.class); superclass = superclass.getSuperclass()) {
                        C0112G1 c0112g1M2122I = C0889w1.m2122I(superclass.getDeclaredFields());
                        while (c0112g1M2122I.hasNext()) {
                            Field field = (Field) c0112g1M2122I.next();
                            if (!Modifier.isStatic(field.getModifiers()) && Collection.class.isAssignableFrom(field.getType())) {
                                field.setAccessible(true);
                                Object obj = field.get(next2);
                                Collection collection = obj instanceof Collection ? (Collection) obj : null;
                                if (collection != null) {
                                    Iterator it2 = collection.iterator();
                                    while (true) {
                                        if (!it2.hasNext()) {
                                            next = null;
                                            break;
                                        }
                                        next = it2.next();
                                        if (next != null) {
                                            break;
                                        }
                                    }
                                    if (next != null && (strM156a = m156a(next)) != null && !C0034Be.m101P(strM156a)) {
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    aVarM2206a = null;
                } catch (Throwable th) {
                    aVarM2206a = C0920xd.m2206a(th);
                }
                strM156a = (String) (aVarM2206a == null ? aVarM2206a : null);
                if (strM156a != null && hashSet.contains(strM156a)) {
                    it.remove();
                    i++;
                }
            }
        }
        return i;
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:26:0x0040 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r4v0, types: [a.wd$a] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object, java.lang.reflect.Method[]] */
    /* JADX INFO: renamed from: c */
    public static Method m158c(Class cls) {
        ?? M2206a;
        try {
            ?? methods = cls.getMethods();
            C0631i9.m1481d(methods, "getMethods(...)");
            int length = methods.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    M2206a = 0;
                    break;
                }
                M2206a = methods[i];
                if (C0631i9.m1478a(M2206a.getName(), "o") && C0631i9.m1478a(M2206a.getReturnType(), String.class)) {
                    Class<?>[] parameterTypes = M2206a.getParameterTypes();
                    C0631i9.m1481d(parameterTypes, "getParameterTypes(...)");
                    if (parameterTypes.length == 0) {
                        break;
                    }
                }
                i++;
            }
        } catch (Throwable th) {
            M2206a = C0920xd.m2206a(th);
        }
        return (Method) (M2206a instanceof C0901wd.a ? 0 : M2206a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x005a, code lost:
    
        if (r12 == null) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0060, code lost:
    
        if (r12.equals(java.lang.Object.class) != false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0062, code lost:
    
        r0 = r12.getDeclaredMethods();
        p000a.C0631i9.m1481d(r0, "getDeclaredMethods(...)");
        r7 = r0.length;
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006b, code lost:
    
        if (r8 >= r7) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006d, code lost:
    
        r9 = r0[r8];
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0079, code lost:
    
        if (java.util.List.class.isAssignableFrom(r9.getReturnType()) == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0080, code lost:
    
        if (r9.getParameterTypes().length != 2) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x008c, code lost:
    
        if (java.util.Collection.class.isAssignableFrom(r9.getParameterTypes()[0]) == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x008f, code lost:
    
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0092, code lost:
    
        r9 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0093, code lost:
    
        if (r9 == null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0095, code lost:
    
        return r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0096, code lost:
    
        r12 = r12.getSuperclass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x009b, code lost:
    
        return null;
     */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Method m159d(Class cls) {
        Class superclass = cls;
        while (true) {
            Method method = null;
            if (superclass == null || superclass.equals(Object.class)) {
                break;
            }
            Method[] declaredMethods = superclass.getDeclaredMethods();
            C0631i9.m1481d(declaredMethods, "getDeclaredMethods(...)");
            int length = declaredMethods.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                Method method2 = declaredMethods[i];
                if (ArrayList.class.isAssignableFrom(method2.getReturnType()) && method2.getParameterTypes().length == 2 && Collection.class.isAssignableFrom(method2.getParameterTypes()[0]) && C0631i9.m1478a(method2.getParameterTypes()[1], String.class)) {
                    method = method2;
                    break;
                }
                i++;
            }
            if (method != null) {
                return method;
            }
            superclass = superclass.getSuperclass();
        }
    }

    /* JADX INFO: renamed from: e */
    public static Field m160e(Class cls) {
        while (cls != null && !cls.equals(Object.class)) {
            C0112G1 c0112g1M2122I = C0889w1.m2122I(cls.getDeclaredFields());
            while (c0112g1M2122I.hasNext()) {
                Field field = (Field) c0112g1M2122I.next();
                if (C0631i9.m1478a(field.getType(), String.class)) {
                    String name = field.getName();
                    C0631i9.m1481d(name, "getName(...)");
                    String lowerCase = name.toLowerCase(Locale.ROOT);
                    C0631i9.m1481d(lowerCase, "toLowerCase(...)");
                    if (C0034Be.m94I(lowerCase, "username", false) || C0034Be.m94I(lowerCase, "user_name", false) || lowerCase.equals("field_username")) {
                        return field;
                    }
                }
            }
            cls = cls.getSuperclass();
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public static HashSet m161f() {
        C0186K3.f638a.getClass();
        ArrayList arrayListM505f = C0186K3.a.m505f();
        ArrayList arrayList = new ArrayList(C0758p3.m1800g0(arrayListM505f, 10));
        Iterator it = arrayListM505f.iterator();
        while (it.hasNext()) {
            arrayList.add(((MaskItemBean) it.next()).getMaskId());
        }
        return C0834t3.m1957u0(arrayList);
    }

    /* JADX INFO: renamed from: i */
    public static boolean m162i() {
        C0186K3.f638a.getClass();
        return C0186K3.a.m511l() && C0186K3.a.m508i().f2413E;
    }

    /* JADX INFO: renamed from: g */
    public final void m163g(C0173J8 c0173j8, Method method, String str) {
        method.setAccessible(true);
        C0173J8.m469h(c0173j8, "F024", method, new C0683l4(this, 4, str));
        ConcurrentHashMap<String, C0101F8> concurrentHashMap = C0083E8.f263a;
        C0083E8.m209b("F024", "R6_".concat(str), method.getDeclaringClass().getSimpleName() + "." + method.getName());
        String name = method.getDeclaringClass().getName();
        String name2 = method.getName();
        StringBuilder sbM2229i = C0944z.m2229i("HideTextStatus: hooked ", str, " R6 = ", name, ".");
        sbM2229i.append(name2);
        C0908x1.m2194b(Arrays.copyOf(new Object[]{sbM2229i.toString()}, 1));
    }

    /* JADX INFO: renamed from: h */
    public final void m164h(C0173J8 c0173j8, String str, String str2) {
        Object objM2206a;
        Class clsM13b;
        try {
            clsM13b = C0002A1.m13b(c0173j8.f608a, str);
        } catch (Throwable th) {
            objM2206a = C0920xd.m2206a(th);
        }
        if (clsM13b == null) {
            C0908x1.m2197e(Arrays.copyOf(new Object[]{"HideTextStatus: " + str + " not found, skip " + str2}, 1));
            C0083E8.m208a("F024", str2, str, "class not found");
            return;
        }
        Method methodM159d = m159d(clsM13b);
        if (methodM159d == null) {
            C0908x1.m2197e(Arrays.copyOf(new Object[]{"HideTextStatus: R6 method not found in " + str + " (searched hierarchy)"}, 1));
            C0083E8.m208a("F024", str2, str, "R6 method not found");
            return;
        }
        m163g(c0173j8, methodM159d, str2);
        objM2206a = C0413Wf.f1577a;
        Throwable thM2189a = C0901wd.m2189a(objM2206a);
        if (thM2189a != null) {
            C0908x1.m2193a(Arrays.copyOf(new Object[]{"HideTextStatus: hookStatusFeedR6(" + str2 + ") fail: " + thM2189a.getMessage()}, 1));
            ConcurrentHashMap<String, C0101F8> concurrentHashMap = C0083E8.f263a;
            String message = thM2189a.getMessage();
            if (message == null) {
                message = "unknown";
            }
            C0083E8.m208a("F024", str2, str, message);
        }
    }

    @Override // top.mmjz.floatingclouds.plugin.IPlugin
    public final void handleHook(C0173J8 c0173j8) {
        int i;
        String name;
        String name2;
        Object objM2206a;
        Class clsM13b;
        Object objM2206a2;
        Class clsM13b2;
        Method method;
        Class<?> cls;
        Class<?> cls2;
        final int i2 = 0;
        final int i3 = 1;
        C0631i9.m1482e(c0173j8, "session");
        ClassLoader classLoader = c0173j8.f608a;
        int i4 = -1;
        if (C0021B1.f64a == -1) {
            try {
                Context context = C0889w1.f3488p;
                C0631i9.m1479b(context);
                i = context.getPackageManager().getPackageInfo("com.tencent.mm", 0).versionCode;
            } catch (Exception e) {
                C0908x1.m2193a(Arrays.copyOf(new Object[]{e}, 1));
                i = -1;
            }
            C0021B1.f64a = i;
        }
        C0578fd c0578fd = new C0578fd(C0021B1.f64a, classLoader);
        C0616hd.f2278a.getClass();
        C0597gd c0597gdM1467a = C0616hd.m1467a("F024_status_store", c0578fd);
        Method method2 = null;
        if (!c0597gdM1467a.f2208a || (cls2 = c0597gdM1467a.f2209b) == null) {
            C0647j6 c0647j6 = c0597gdM1467a.f2210c;
            C0908x1.m2197e(Arrays.copyOf(new Object[]{C0944z.m2227g("HideTextStatus: statusStore resolve FAILED (reason=", c0647j6 != null ? c0647j6.f2390c : null, ")")}, 1));
            name = null;
        } else {
            C0908x1.m2194b(Arrays.copyOf(new Object[]{"HideTextStatus: statusStore resolved via " + c0597gdM1467a.f2211d + ": " + cls2.getName()}, 1));
            name = c0597gdM1467a.f2209b.getName();
        }
        ClassLoader classLoader2 = c0173j8.f608a;
        if (C0021B1.f64a == -1) {
            try {
                Context context2 = C0889w1.f3488p;
                C0631i9.m1479b(context2);
                i4 = context2.getPackageManager().getPackageInfo("com.tencent.mm", 0).versionCode;
            } catch (Exception e2) {
                C0908x1.m2193a(Arrays.copyOf(new Object[]{e2}, 1));
            }
            C0021B1.f64a = i4;
        }
        C0578fd c0578fd2 = new C0578fd(C0021B1.f64a, classLoader2);
        C0616hd.f2278a.getClass();
        C0597gd c0597gdM1467a2 = C0616hd.m1467a("F024_mvvm_submit_param", c0578fd2);
        if (!c0597gdM1467a2.f2208a || (cls = c0597gdM1467a2.f2209b) == null) {
            C0647j6 c0647j62 = c0597gdM1467a2.f2210c;
            C0908x1.m2197e(Arrays.copyOf(new Object[]{C0944z.m2227g("HideTextStatus: mvvmSubmitParam resolve FAILED (reason=", c0647j62 != null ? c0647j62.f2390c : null, ")")}, 1));
            name2 = null;
        } else {
            C0908x1.m2194b(Arrays.copyOf(new Object[]{"HideTextStatus: mvvmSubmitParam resolved via " + c0597gdM1467a2.f2211d + ": " + cls.getName()}, 1));
            name2 = c0597gdM1467a2.f2209b.getName();
        }
        if (name != null) {
            try {
                clsM13b2 = C0002A1.m13b(c0173j8.f608a, name);
            } catch (Throwable th) {
                objM2206a2 = C0920xd.m2206a(th);
            }
            if (clsM13b2 == null) {
                C0908x1.m2197e(Arrays.copyOf(new Object[]{"HideTextStatus: " + name + " not found"}, 1));
            } else {
                Method[] declaredMethods = clsM13b2.getDeclaredMethods();
                C0631i9.m1481d(declaredMethods, "getDeclaredMethods(...)");
                int length = declaredMethods.length;
                int i5 = 0;
                while (true) {
                    if (i5 >= length) {
                        method = null;
                        break;
                    }
                    method = declaredMethods[i5];
                    if (C0631i9.m1478a(method.getName(), "K")) {
                        Class<?>[] parameterTypes = method.getParameterTypes();
                        C0631i9.m1481d(parameterTypes, "getParameterTypes(...)");
                        if (parameterTypes.length == 0 && List.class.isAssignableFrom(method.getReturnType())) {
                            break;
                        }
                    }
                    i5++;
                }
                if (method == null) {
                    C0908x1.m2197e(Arrays.copyOf(new Object[]{"HideTextStatus: K() method not found in " + name}, 1));
                } else {
                    method.setAccessible(true);
                    C0173J8.m469h(c0173j8, "F024", method, new InterfaceC0064D7(this) { // from class: a.B8

                        /* JADX INFO: renamed from: b */
                        public final /* synthetic */ C0065D8 f91b;

                        {
                            this.f91b = this;
                        }

                        @Override // p000a.InterfaceC0064D7
                        /* JADX INFO: renamed from: f */
                        public final Object mo53f(Object obj) {
                            Object obj2;
                            Object obj3;
                            Field field;
                            XposedInterface.Chain chain = (XposedInterface.Chain) obj;
                            switch (i3) {
                                case 0:
                                    C0631i9.m1482e(chain, "chain");
                                    C0065D8 c0065d8 = this.f91b;
                                    if (!C0065D8.m162i()) {
                                        return chain.proceed();
                                    }
                                    try {
                                        obj2 = chain.getArgs().get(0);
                                    } catch (Throwable th2) {
                                        C0908x1.m2193a(Arrays.copyOf(new Object[]{C0944z.m2231k("HideTextStatus: [MvvmList] error: ", th2.getMessage())}, 1));
                                    }
                                    if (obj2 == null) {
                                        return chain.proceed();
                                    }
                                    Field[] declaredFields = obj2.getClass().getDeclaredFields();
                                    C0631i9.m1481d(declaredFields, "getDeclaredFields(...)");
                                    int length2 = declaredFields.length;
                                    int i6 = 0;
                                    while (true) {
                                        obj3 = null;
                                        if (i6 < length2) {
                                            field = declaredFields[i6];
                                            if (!List.class.isAssignableFrom(field.getType())) {
                                                i6++;
                                            }
                                        } else {
                                            field = null;
                                        }
                                    }
                                    if (field == null) {
                                        return chain.proceed();
                                    }
                                    field.setAccessible(true);
                                    Object obj4 = field.get(obj2);
                                    List list = C0198Kf.m549b(obj4) ? (List) obj4 : null;
                                    if (list != null && !list.isEmpty()) {
                                        Iterator it = list.iterator();
                                        while (true) {
                                            if (it.hasNext()) {
                                                Object next = it.next();
                                                if (next != null) {
                                                    obj3 = next;
                                                }
                                            }
                                        }
                                        if (obj3 == null) {
                                            return chain.proceed();
                                        }
                                        String name3 = obj3.getClass().getName();
                                        C0908x1.m2194b(Arrays.copyOf(new Object[]{"HideTextStatus: [MvvmList-DIAG] items=" + list.size() + " cls=" + name3}, 1));
                                        if (!C0015Ae.m49H(name3, "qk4.", false) && !C0034Be.m94I(name3, "textstatus", false) && !C0034Be.m94I(name3, "lk4.", false) && !C0034Be.m94I(name3, "pk4.", false)) {
                                            return chain.proceed();
                                        }
                                        HashSet hashSetM161f = C0065D8.m161f();
                                        if (hashSetM161f.isEmpty()) {
                                            return chain.proceed();
                                        }
                                        int size = list.size();
                                        C0815s3.m1887i0(list, new C0047C8(c0065d8, hashSetM161f, 0));
                                        int size2 = size - list.size();
                                        if (size2 > 0) {
                                            C0908x1.m2194b(Arrays.copyOf(new Object[]{"HideTextStatus: [MvvmList] filtered " + size2 + " masked status items"}, 1));
                                        }
                                        return chain.proceed();
                                    }
                                    return chain.proceed();
                                default:
                                    C0631i9.m1482e(chain, "chain");
                                    Object objProceed = chain.proceed();
                                    C0065D8 c0065d82 = this.f91b;
                                    if (C0065D8.m162i()) {
                                        try {
                                            List list2 = C0198Kf.m549b(objProceed) ? (List) objProceed : null;
                                            if (list2 != null) {
                                                int size3 = list2.size();
                                                Object objM1950n0 = C0834t3.m1950n0(list2);
                                                C0908x1.m2194b(Arrays.copyOf(new Object[]{"HideTextStatus: [StoreK] K() called, list.size=" + size3 + ", itemType=" + (objM1950n0 != null ? objM1950n0.getClass().getName() : null)}, 1));
                                                HashSet hashSetM161f2 = C0065D8.m161f();
                                                if (!hashSetM161f2.isEmpty()) {
                                                    int size4 = list2.size();
                                                    C0815s3.m1887i0(list2, new C0047C8(c0065d82, hashSetM161f2, 1));
                                                    int size5 = size4 - list2.size();
                                                    if (size5 > 0) {
                                                        C0908x1.m2194b(Arrays.copyOf(new Object[]{"HideTextStatus: [StoreK] filtered " + size5 + " masked items"}, 1));
                                                    }
                                                    break;
                                                }
                                            }
                                        } catch (Throwable th3) {
                                            C0908x1.m2193a(Arrays.copyOf(new Object[]{C0944z.m2231k("HideTextStatus: [StoreK] error: ", th3.getMessage())}, 1));
                                        }
                                    }
                                    return objProceed;
                            }
                        }
                    });
                    ConcurrentHashMap<String, C0101F8> concurrentHashMap = C0083E8.f263a;
                    C0083E8.m209b("F024", "store_K", name + ".K()");
                    C0908x1.m2194b(Arrays.copyOf(new Object[]{"HideTextStatus: hooked " + name + ".K() (universal status data source)"}, 1));
                    objM2206a2 = C0413Wf.f1577a;
                    Throwable thM2189a = C0901wd.m2189a(objM2206a2);
                    if (thM2189a != null) {
                        C0908x1.m2193a(Arrays.copyOf(new Object[]{C0944z.m2231k("HideTextStatus: hookStatusStoreK fail: ", thM2189a.getMessage())}, 1));
                    }
                }
            }
        }
        if (name2 != null) {
            try {
                clsM13b = C0002A1.m13b(c0173j8.f608a, "com.tencent.mm.plugin.mvvmlist.MvvmList");
            } catch (Throwable th2) {
                objM2206a = C0920xd.m2206a(th2);
            }
            if (clsM13b == null) {
                C0908x1.m2197e(Arrays.copyOf(new Object[]{"HideTextStatus: MvvmList class not found"}, 1));
            } else {
                Method[] declaredMethods2 = clsM13b.getDeclaredMethods();
                C0631i9.m1481d(declaredMethods2, "getDeclaredMethods(...)");
                int length2 = declaredMethods2.length;
                int i6 = 0;
                while (true) {
                    if (i6 >= length2) {
                        break;
                    }
                    Method method3 = declaredMethods2[i6];
                    if (C0631i9.m1478a(method3.getName(), "x") && method3.getParameterTypes().length == 1 && method3.getParameterTypes()[0].getName().equals(name2)) {
                        method2 = method3;
                        break;
                    }
                    i6++;
                }
                if (method2 == null) {
                    C0908x1.m2197e(Arrays.copyOf(new Object[]{"HideTextStatus: MvvmList.x(" + name2 + ") not found"}, 1));
                } else {
                    method2.setAccessible(true);
                    C0173J8.m469h(c0173j8, "F024", method2, new InterfaceC0064D7(this) { // from class: a.B8

                        /* JADX INFO: renamed from: b */
                        public final /* synthetic */ C0065D8 f91b;

                        {
                            this.f91b = this;
                        }

                        @Override // p000a.InterfaceC0064D7
                        /* JADX INFO: renamed from: f */
                        public final Object mo53f(Object obj) {
                            Object obj2;
                            Object obj3;
                            Field field;
                            XposedInterface.Chain chain = (XposedInterface.Chain) obj;
                            switch (i2) {
                                case 0:
                                    C0631i9.m1482e(chain, "chain");
                                    C0065D8 c0065d8 = this.f91b;
                                    if (!C0065D8.m162i()) {
                                        return chain.proceed();
                                    }
                                    try {
                                        obj2 = chain.getArgs().get(0);
                                    } catch (Throwable th22) {
                                        C0908x1.m2193a(Arrays.copyOf(new Object[]{C0944z.m2231k("HideTextStatus: [MvvmList] error: ", th22.getMessage())}, 1));
                                    }
                                    if (obj2 == null) {
                                        return chain.proceed();
                                    }
                                    Field[] declaredFields = obj2.getClass().getDeclaredFields();
                                    C0631i9.m1481d(declaredFields, "getDeclaredFields(...)");
                                    int length22 = declaredFields.length;
                                    int i62 = 0;
                                    while (true) {
                                        obj3 = null;
                                        if (i62 < length22) {
                                            field = declaredFields[i62];
                                            if (!List.class.isAssignableFrom(field.getType())) {
                                                i62++;
                                            }
                                        } else {
                                            field = null;
                                        }
                                    }
                                    if (field == null) {
                                        return chain.proceed();
                                    }
                                    field.setAccessible(true);
                                    Object obj4 = field.get(obj2);
                                    List list = C0198Kf.m549b(obj4) ? (List) obj4 : null;
                                    if (list != null && !list.isEmpty()) {
                                        Iterator it = list.iterator();
                                        while (true) {
                                            if (it.hasNext()) {
                                                Object next = it.next();
                                                if (next != null) {
                                                    obj3 = next;
                                                }
                                            }
                                        }
                                        if (obj3 == null) {
                                            return chain.proceed();
                                        }
                                        String name3 = obj3.getClass().getName();
                                        C0908x1.m2194b(Arrays.copyOf(new Object[]{"HideTextStatus: [MvvmList-DIAG] items=" + list.size() + " cls=" + name3}, 1));
                                        if (!C0015Ae.m49H(name3, "qk4.", false) && !C0034Be.m94I(name3, "textstatus", false) && !C0034Be.m94I(name3, "lk4.", false) && !C0034Be.m94I(name3, "pk4.", false)) {
                                            return chain.proceed();
                                        }
                                        HashSet hashSetM161f = C0065D8.m161f();
                                        if (hashSetM161f.isEmpty()) {
                                            return chain.proceed();
                                        }
                                        int size = list.size();
                                        C0815s3.m1887i0(list, new C0047C8(c0065d8, hashSetM161f, 0));
                                        int size2 = size - list.size();
                                        if (size2 > 0) {
                                            C0908x1.m2194b(Arrays.copyOf(new Object[]{"HideTextStatus: [MvvmList] filtered " + size2 + " masked status items"}, 1));
                                        }
                                        return chain.proceed();
                                    }
                                    return chain.proceed();
                                default:
                                    C0631i9.m1482e(chain, "chain");
                                    Object objProceed = chain.proceed();
                                    C0065D8 c0065d82 = this.f91b;
                                    if (C0065D8.m162i()) {
                                        try {
                                            List list2 = C0198Kf.m549b(objProceed) ? (List) objProceed : null;
                                            if (list2 != null) {
                                                int size3 = list2.size();
                                                Object objM1950n0 = C0834t3.m1950n0(list2);
                                                C0908x1.m2194b(Arrays.copyOf(new Object[]{"HideTextStatus: [StoreK] K() called, list.size=" + size3 + ", itemType=" + (objM1950n0 != null ? objM1950n0.getClass().getName() : null)}, 1));
                                                HashSet hashSetM161f2 = C0065D8.m161f();
                                                if (!hashSetM161f2.isEmpty()) {
                                                    int size4 = list2.size();
                                                    C0815s3.m1887i0(list2, new C0047C8(c0065d82, hashSetM161f2, 1));
                                                    int size5 = size4 - list2.size();
                                                    if (size5 > 0) {
                                                        C0908x1.m2194b(Arrays.copyOf(new Object[]{"HideTextStatus: [StoreK] filtered " + size5 + " masked items"}, 1));
                                                    }
                                                    break;
                                                }
                                            }
                                        } catch (Throwable th3) {
                                            C0908x1.m2193a(Arrays.copyOf(new Object[]{C0944z.m2231k("HideTextStatus: [StoreK] error: ", th3.getMessage())}, 1));
                                        }
                                    }
                                    return objProceed;
                            }
                        }
                    });
                    C0083E8.m209b("F024", "mvvmlist_x", "MvvmList.x(o0)");
                    C0908x1.m2194b(Arrays.copyOf(new Object[]{"HideTextStatus: hooked MvvmList.x() (UI data submit)"}, 1));
                    objM2206a = C0413Wf.f1577a;
                    Throwable thM2189a2 = C0901wd.m2189a(objM2206a);
                    if (thM2189a2 != null) {
                        C0908x1.m2193a(Arrays.copyOf(new Object[]{C0944z.m2231k("HideTextStatus: hookMvvmListSubmitUI fail: ", thM2189a2.getMessage())}, 1));
                    }
                }
            }
        }
        m164h(c0173j8, "com.tencent.mm.plugin.textstatus.ui.TextStatusCardFeedsActivity", "mainFeed");
        m164h(c0173j8, "com.tencent.mm.plugin.textstatus.ui.TextStatusProfileCardFeedActivity", "profileFeed");
        C0908x1.m2194b(Arrays.copyOf(new Object[]{"HideTextStatus: handleHook DONE (statusStore=" + name + ", submitParam=" + name2 + ")"}, 1));
    }
}
