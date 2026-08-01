package p000;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: me */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0471me {

    /* JADX INFO: renamed from: c */
    public static final C0471me f3919c = new C0471me();

    /* JADX INFO: renamed from: a */
    public final HashMap f3920a = new HashMap();

    /* JADX INFO: renamed from: b */
    public final HashMap f3921b = new HashMap();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static void m2497b(HashMap map, C0428le c0428le, q90 q90Var, Class cls) {
        q90 q90Var2 = (q90) map.get(c0428le);
        if (q90Var2 == null || q90Var == q90Var2) {
            if (q90Var2 == null) {
                map.put(c0428le, q90Var);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + c0428le.f3423b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + q90Var2 + ", new value " + q90Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final C0389ke m2498a(Class cls, Method[] methodArr) {
        int i;
        Class superclass = cls.getSuperclass();
        HashMap map = new HashMap();
        HashMap map2 = this.f3920a;
        if (superclass != null) {
            C0389ke c0389keM2498a = (C0389ke) map2.get(superclass);
            if (c0389keM2498a == null) {
                c0389keM2498a = m2498a(superclass, null);
            }
            map.putAll(c0389keM2498a.f3086b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            C0389ke c0389keM2498a2 = (C0389ke) map2.get(cls2);
            if (c0389keM2498a2 == null) {
                c0389keM2498a2 = m2498a(cls2, null);
            }
            for (Map.Entry entry : c0389keM2498a2.f3086b.entrySet()) {
                m2497b(map, (C0428le) entry.getKey(), (q90) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
            }
        }
        boolean z = false;
        for (Method method : methodArr) {
            el0 el0Var = (el0) method.getAnnotation(el0.class);
            if (el0Var != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else {
                    if (!x90.class.isAssignableFrom(parameterTypes[0])) {
                        C0921xc.m5131l("invalid parameter type. Must be one and instanceof LifecycleOwner");
                        return null;
                    }
                    i = 1;
                }
                q90 q90VarValue = el0Var.value();
                if (parameterTypes.length > 1) {
                    if (!q90.class.isAssignableFrom(parameterTypes[1])) {
                        C0921xc.m5131l("invalid parameter type. second arg must be an event");
                        return null;
                    }
                    if (q90VarValue != q90.ON_ANY) {
                        C0921xc.m5131l("Second arg is supported only for ON_ANY value");
                        return null;
                    }
                    i = 2;
                }
                if (parameterTypes.length > 2) {
                    C0921xc.m5131l("cannot have more than 2 params");
                    return null;
                }
                m2497b(map, new C0428le(i, method), q90VarValue, cls);
                z = true;
            }
        }
        C0389ke c0389ke = new C0389ke(map);
        map2.put(cls, c0389ke);
        this.f3921b.put(cls, Boolean.valueOf(z));
        return c0389ke;
    }
}
