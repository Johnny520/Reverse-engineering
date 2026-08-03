package p000a;

import android.content.Context;
import io.github.libxposed.api.XposedInterface;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import p000a.C0319Rb;
import p000a.C0901wd;

/* JADX INFO: renamed from: a.Gb */
/* JADX INFO: loaded from: classes.dex */
public final class C0122Gb {

    /* JADX INFO: renamed from: a */
    public static final C0122Gb f389a = new C0122Gb();

    /* JADX INFO: renamed from: b */
    public static volatile boolean f390b;

    /* JADX INFO: renamed from: c */
    public static volatile Object f391c;

    /* JADX INFO: renamed from: d */
    public static volatile Method f392d;

    /* JADX INFO: renamed from: e */
    public static volatile Method f393e;

    /* JADX INFO: renamed from: f */
    public static volatile Field f394f;

    /* JADX INFO: renamed from: g */
    public static volatile Object f395g;

    /* JADX INFO: renamed from: h */
    public static volatile C0319Rb.a f396h;

    /* JADX INFO: renamed from: i */
    public static volatile int f397i;

    /* JADX INFO: renamed from: j */
    public static volatile long f398j;

    /* JADX INFO: renamed from: k */
    public static final Object f399k;

    /* JADX INFO: renamed from: l */
    public static final C0233Me f400l;

    static {
        new ThreadLocal();
        f399k = new Object();
        f400l = new C0233Me(new C0891w3(4));
    }

    /* JADX INFO: renamed from: a */
    public static long m313a() {
        if (f397i <= 1) {
            return 5000L;
        }
        return f397i == 2 ? 15000L : 60000L;
    }

    /* JADX INFO: renamed from: b */
    public static void m314b(ClassLoader classLoader) {
        C0631i9.m1482e(classLoader, "classLoader");
        if (f390b) {
            return;
        }
        m322j("DIAG ensureInitialized ENTER methodsReady=" + f390b);
        if (!m321i(classLoader)) {
            m322j("ensureInitialized: native path failed, hide will not work this session");
        } else {
            f390b = true;
            m322j("ensureInitialized: NATIVE path ready, methodsReady=true");
        }
    }

    /* JADX INFO: renamed from: c */
    public static Method m315c(Class cls) {
        while (cls != null) {
            C0112G1 c0112g1M2122I = C0889w1.m2122I(cls.getDeclaredMethods());
            while (c0112g1M2122I.hasNext()) {
                Method method = (Method) c0112g1M2122I.next();
                if (method.getParameterTypes().length == 2 && method.getParameterTypes()[0].isArray() && C0631i9.m1478a(method.getParameterTypes()[0].getComponentType(), String.class) && C0631i9.m1478a(method.getParameterTypes()[1], String.class) && C0631i9.m1478a(method.getReturnType(), Void.TYPE)) {
                    method.setAccessible(true);
                    return method;
                }
            }
            cls = cls.getSuperclass();
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public static Object m316d(Class cls) throws IllegalAccessException {
        Object objM2206a;
        Object objM2206a2;
        String name = cls.getName();
        C0112G1 c0112g1M2122I = C0889w1.m2122I(cls.getDeclaredMethods());
        while (true) {
            if (!c0112g1M2122I.hasNext()) {
                m322j("findStorageInstance: " + name + " — no static singleton method found");
                for (String str : C0739o3.m1757d0("INSTANCE", "instance", "sInstance", "a")) {
                    try {
                        Field declaredField = cls.getDeclaredField(str);
                        if (Modifier.isStatic(declaredField.getModifiers()) && cls.isAssignableFrom(declaredField.getType())) {
                            declaredField.setAccessible(true);
                            Object obj = declaredField.get(null);
                            if (obj != null) {
                                m322j("findStorageInstance: static field " + str + " on " + cls.getSimpleName());
                                return obj;
                            }
                            continue;
                        }
                    } catch (NoSuchFieldException unused) {
                    }
                }
                try {
                    Constructor declaredConstructor = cls.getDeclaredConstructor(null);
                    declaredConstructor.setAccessible(true);
                    objM2206a = declaredConstructor.newInstance(null);
                    m322j("findStorageInstance: no-arg constructor on " + cls.getSimpleName());
                } catch (Throwable th) {
                    objM2206a = C0920xd.m2206a(th);
                }
                C0901wd.m2189a(objM2206a);
                if (objM2206a instanceof C0901wd.a) {
                    return null;
                }
                return objM2206a;
            }
            Method method = (Method) c0112g1M2122I.next();
            if (Modifier.isStatic(method.getModifiers())) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                C0631i9.m1481d(parameterTypes, "getParameterTypes(...)");
                if (parameterTypes.length == 0 && cls.isAssignableFrom(method.getReturnType())) {
                    method.setAccessible(true);
                    try {
                        objM2206a2 = method.invoke(null, null);
                    } catch (Throwable th2) {
                        objM2206a2 = C0920xd.m2206a(th2);
                    }
                    Object obj2 = objM2206a2 instanceof C0901wd.a ? null : objM2206a2;
                    if (obj2 != null) {
                        m322j("findStorageInstance: static method " + method.getName() + "() on " + cls.getSimpleName());
                        return obj2;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public static boolean m317e(Class cls) {
        while (cls != null) {
            C0112G1 c0112g1M2122I = C0889w1.m2122I(cls.getDeclaredMethods());
            while (c0112g1M2122I.hasNext()) {
                Method method = (Method) c0112g1M2122I.next();
                if (C0631i9.m1478a(method.getReturnType(), Void.TYPE) && method.getParameterTypes().length == 2 && method.getParameterTypes()[0].isArray() && C0631i9.m1478a(method.getParameterTypes()[0].getComponentType(), String.class) && C0631i9.m1478a(method.getParameterTypes()[1], String.class)) {
                    return true;
                }
            }
            cls = cls.getSuperclass();
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public static final void m318f(Class<?> cls, Class<?> cls2, String str) {
        synchronized (f399k) {
            f396h = new C0319Rb.a(cls, cls2, str);
            f397i = 0;
            f398j = 0L;
            C0122Gb c0122Gb = f389a;
            String str2 = "injectConvStoragePair: storage=" + cls.getName() + " helper=" + cls2.getName() + " getter=" + str;
            c0122Gb.getClass();
            m322j(str2);
            C0413Wf c0413Wf = C0413Wf.f1577a;
        }
    }

    /* JADX INFO: renamed from: g */
    public static final void m319g(C0173J8 c0173j8) {
        Object objM2206a;
        C0122Gb c0122Gb = f389a;
        try {
            ClassLoader classLoader = c0173j8.f608a;
            ArrayList arrayListM1758e0 = C0739o3.m1758e0("com.tencent.mm.storage.m4", "com.tencent.mm.storage.l4");
            C0319Rb.a aVar = f396h;
            int i = 0;
            if (aVar != null) {
                String name = aVar.f1150a.getName();
                if (!arrayListM1758e0.contains(name)) {
                    arrayListM1758e0.add(0, name);
                }
            }
            List listM1154c = C0475a5.m1154c();
            ArrayList arrayList = new ArrayList();
            for (Object obj : listM1154c) {
                if (!arrayListM1758e0.contains((String) obj)) {
                    arrayList.add(obj);
                }
            }
            arrayListM1758e0.addAll(arrayList);
            C0742o6 c0742o6M291a = C0106Fd.m291a("F010");
            Iterator it = arrayListM1758e0.iterator();
            while (it.hasNext()) {
                Class clsM13b = C0002A1.m13b(classLoader, (String) it.next());
                if (clsM13b != null) {
                    c0122Gb.getClass();
                    if (m317e(clsM13b)) {
                        C0112G1 c0112g1M2122I = C0889w1.m2122I(clsM13b.getDeclaredConstructors());
                        while (c0112g1M2122I.hasNext()) {
                            Constructor constructor = (Constructor) c0112g1M2122I.next();
                            try {
                                C0631i9.m1479b(constructor);
                                c0173j8.m470f(constructor).setPriority(50).setExceptionMode(XposedInterface.ExceptionMode.PROTECTIVE).intercept(new C0700m2(7, c0742o6M291a));
                                i++;
                            } catch (Throwable th) {
                                C0920xd.m2206a(th);
                            }
                        }
                    }
                }
            }
            c0122Gb.getClass();
            m322j("registerInstanceCapture: total ctor hooks=" + i + " (guarded)");
            objM2206a = C0413Wf.f1577a;
        } catch (Throwable th2) {
            objM2206a = C0920xd.m2206a(th2);
        }
        Throwable thM2189a = C0901wd.m2189a(objM2206a);
        if (thM2189a != null) {
            C0122Gb c0122Gb2 = f389a;
            String str = "registerInstanceCapture: unexpected: " + thM2189a.getMessage();
            c0122Gb2.getClass();
            m322j(str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00a8  */
    /* JADX INFO: renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C0319Rb.a m320h(ClassLoader classLoader) {
        C0319Rb.a aVar;
        C0631i9.m1482e(classLoader, "classLoader");
        C0319Rb.a aVar2 = f396h;
        if (aVar2 != null) {
            return aVar2;
        }
        if (f398j > 0 && System.currentTimeMillis() - f398j < m313a()) {
            return null;
        }
        synchronized (f399k) {
            C0319Rb.a aVar3 = f396h;
            if (aVar3 != null) {
                return aVar3;
            }
            if (f398j > 0) {
                long jCurrentTimeMillis = System.currentTimeMillis() - f398j;
                f389a.getClass();
                if (jCurrentTimeMillis < m313a()) {
                    return null;
                }
            }
            int i = -1;
            if (C0021B1.f64a == -1) {
                try {
                    Context context = C0889w1.f3488p;
                    C0631i9.m1479b(context);
                    i = context.getPackageManager().getPackageInfo("com.tencent.mm", 0).versionCode;
                } catch (Exception e) {
                    C0908x1.m2193a(Arrays.copyOf(new Object[]{e}, 1));
                }
                C0021B1.f64a = i;
            }
            C0578fd c0578fd = new C0578fd(C0021B1.f64a, classLoader);
            C0616hd.f2278a.getClass();
            C0597gd c0597gdM1467a = C0616hd.m1467a("F010_conv_storage_pair", c0578fd);
            if (!c0597gdM1467a.f2208a || c0597gdM1467a.f2209b == null) {
                aVar = null;
            } else {
                Class<?> clsM1426a = c0597gdM1467a.m1426a("helper");
                String strM1427b = c0597gdM1467a.m1427b("convGetter");
                if (clsM1426a != null && strM1427b != null) {
                    aVar = new C0319Rb.a(c0597gdM1467a.f2209b, clsM1426a, strM1427b);
                }
            }
            if (aVar != null) {
                f396h = aVar;
                f397i = 0;
                f398j = 0L;
                C0122Gb c0122Gb = f389a;
                String str = "getConvPair via=ENGINE path=" + c0597gdM1467a.f2211d + " storage=" + aVar.f1150a.getName() + " helper=" + aVar.f1151b.getName() + " getter=" + aVar.f1152c;
                c0122Gb.getClass();
                m322j(str);
            } else {
                f397i++;
                f398j = System.currentTimeMillis();
                C0122Gb c0122Gb2 = f389a;
                int i2 = f397i;
                c0122Gb2.getClass();
                long jM313a = m313a();
                C0647j6 c0647j6 = c0597gdM1467a.f2210c;
                m322j("getConvPair FAILED via=ENGINE (count=" + i2 + ", backoff=" + jM313a + "ms) reason=" + (c0647j6 != null ? c0647j6.f2390c : null));
            }
            return aVar;
        }
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:150:0x00b4 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v3, types: [a.Y5] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.Collection, java.util.List] */
    /* JADX INFO: renamed from: i */
    public static boolean m321i(ClassLoader classLoader) throws IllegalAccessException {
        JSONObject jSONObject;
        Object objM316d;
        Method method;
        Object objM2206a;
        JSONArray jSONArrayOptJSONArray;
        String str;
        Method methodM315c;
        if (f392d != null && f391c != null) {
            m322j("resolveNativeHide: already resolved");
            return true;
        }
        Object obj = f395g;
        if (obj != null && (methodM315c = m315c(obj.getClass())) != null) {
            f391c = obj;
            f392d = methodM315c;
            m322j("resolveNativeHide OK via captured live instance: store=" + obj.getClass().getName() + " P=" + methodM315c.getName());
            C0908x1.m2194b("ConvHide", "resolveNativeHide OK via captured live instance");
            return true;
        }
        ?? r1 = C0475a5.f1753a;
        if (r1 == 0 || (str = (String) r1.get("p_method")) == null) {
            jSONObject = null;
        } else {
            try {
                jSONObject = new JSONObject(str);
            } catch (Exception unused) {
                jSONObject = null;
            }
        }
        ?? arrayList = C0439Y5.f1645a;
        if (jSONObject != null && (jSONArrayOptJSONArray = jSONObject.optJSONArray("hits")) != null) {
            arrayList = new ArrayList();
            int length = jSONArrayOptJSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject != null) {
                    String strOptString = jSONObjectOptJSONObject.optString("class", "");
                    String strOptString2 = jSONObjectOptJSONObject.optString("method", "");
                    String strOptString3 = jSONObjectOptJSONObject.optString("sig", "");
                    C0631i9.m1479b(strOptString);
                    if (strOptString.length() > 0) {
                        arrayList.add(new C0144Hf(strOptString, strOptString2, strOptString3));
                    }
                }
            }
        }
        m322j("resolveNativeHide: DexKit P-method hits=" + arrayList.size());
        boolean zIsEmpty = arrayList.isEmpty();
        Class cls = Void.TYPE;
        if (!zIsEmpty) {
            for (C0144Hf c0144Hf : arrayList) {
                String str2 = (String) c0144Hf.f500a;
                Class clsM13b = C0002A1.m13b(classLoader, str2);
                if (clsM13b != null) {
                    Object objM316d2 = m316d(clsM13b);
                    if (objM316d2 != null) {
                        Method method2 = null;
                        while (clsM13b != null && method2 == null) {
                            C0112G1 c0112g1M2122I = C0889w1.m2122I(clsM13b.getDeclaredMethods());
                            while (true) {
                                if (c0112g1M2122I.hasNext()) {
                                    Method method3 = (Method) c0112g1M2122I.next();
                                    if (method3.getParameterTypes().length == 2 && method3.getParameterTypes()[0].isArray() && C0631i9.m1478a(method3.getParameterTypes()[0].getComponentType(), String.class) && C0631i9.m1478a(method3.getParameterTypes()[1], String.class) && C0631i9.m1478a(method3.getReturnType(), cls)) {
                                        method3.setAccessible(true);
                                        method2 = method3;
                                        break;
                                    }
                                }
                            }
                            clsM13b = clsM13b.getSuperclass();
                        }
                        if (method2 != null) {
                            f391c = objM316d2;
                            f392d = method2;
                            m322j("resolveNativeHide OK via DexKit P-method: cls=" + str2 + " method=" + method2.getName());
                            return true;
                        }
                    }
                    m322j("resolveNativeHide: DexKit hit " + str2 + " — cannot get instance, skip");
                }
            }
        }
        ArrayList<String> arrayList2 = new ArrayList();
        C0319Rb.a aVar = f396h;
        if (aVar != null) {
            String name = aVar.f1150a.getName();
            arrayList2.add(name);
            f389a.getClass();
            m322j("resolveNativeHide: added injected convPair storage=" + name + " to candidates");
        }
        arrayList2.add("com.tencent.mm.storage.l4");
        arrayList2.add("com.tencent.mm.storage.m4");
        arrayList2.add("com.tencent.mm.storage.g9");
        List listM1154c = C0475a5.m1154c();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : listM1154c) {
            if (!arrayList2.contains((String) obj2)) {
                arrayList3.add(obj2);
            }
        }
        arrayList2.addAll(arrayList3);
        m322j("resolveNativeHide: candidateClassNames count=" + arrayList2.size());
        for (String str3 : arrayList2) {
            Class clsM13b2 = C0002A1.m13b(classLoader, str3);
            if (clsM13b2 != null && (objM316d = m316d(clsM13b2)) != null) {
                Method method4 = null;
                for (Class superclass = clsM13b2; superclass != null && method4 == null; superclass = superclass.getSuperclass()) {
                    C0112G1 c0112g1M2122I2 = C0889w1.m2122I(superclass.getDeclaredMethods());
                    while (true) {
                        if (c0112g1M2122I2.hasNext()) {
                            Method method5 = (Method) c0112g1M2122I2.next();
                            if (method5.getParameterTypes().length == 2 && method5.getParameterTypes()[0].isArray() && C0631i9.m1478a(method5.getParameterTypes()[0].getComponentType(), String.class) && C0631i9.m1478a(method5.getParameterTypes()[1], String.class) && C0631i9.m1478a(method5.getReturnType(), cls)) {
                                method5.setAccessible(true);
                                method4 = method5;
                                break;
                            }
                        }
                    }
                }
                if (method4 != null) {
                    f391c = objM316d;
                    f392d = method4;
                    m322j("resolveNativeHide OK: cls=" + str3 + " method=" + method4.getName());
                    Method[] declaredMethods = clsM13b2.getDeclaredMethods();
                    C0631i9.m1481d(declaredMethods, "getDeclaredMethods(...)");
                    int length2 = declaredMethods.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length2) {
                            method = null;
                            break;
                        }
                        method = declaredMethods[i2];
                        if ((C0631i9.m1478a(method.getName(), "x") || C0631i9.m1478a(method.getName(), "p")) && method.getParameterTypes().length == 1 && C0631i9.m1478a(method.getParameterTypes()[0], String.class) && !method.getReturnType().isPrimitive() && !C0631i9.m1478a(method.getReturnType(), cls)) {
                            break;
                        }
                        i2++;
                    }
                    if (method != null) {
                        method.setAccessible(true);
                    } else {
                        method = null;
                    }
                    f393e = method;
                    if (method != null) {
                        try {
                            objM2206a = method.invoke(objM316d, "filehelper");
                        } catch (Throwable th) {
                            objM2206a = C0920xd.m2206a(th);
                        }
                        Object obj3 = objM2206a instanceof C0901wd.a ? null : objM2206a;
                        if (obj3 != null) {
                            for (Class<?> superclass2 = obj3.getClass(); superclass2 != null; superclass2 = superclass2.getSuperclass()) {
                                try {
                                    Field declaredField = superclass2.getDeclaredField("field_parentRef");
                                    declaredField.setAccessible(true);
                                    f394f = declaredField;
                                    break;
                                } catch (NoSuchFieldException unused2) {
                                }
                            }
                        }
                    }
                    return true;
                }
            }
        }
        m322j("resolveNativeHide: all candidates failed, native path unavailable this session");
        return false;
    }

    /* JADX INFO: renamed from: j */
    public static void m322j(String str) {
        C0908x1.m2194b(Arrays.copyOf(new Object[]{C0944z.m2231k("ConvHide: ", str)}, 1));
    }
}
