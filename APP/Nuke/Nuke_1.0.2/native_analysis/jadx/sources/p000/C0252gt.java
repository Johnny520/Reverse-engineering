package p000;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: gt */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0252gt {

    /* JADX INFO: renamed from: c */
    public static final C0252gt f3696c = new C0252gt();

    /* JADX INFO: renamed from: a */
    public final HashMap f3697a = new HashMap();

    /* JADX INFO: renamed from: b */
    public final HashMap f3698b = new HashMap();

    /* JADX INFO: renamed from: b */
    public static void m2024b(HashMap map, C0215ft c0215ft, z91 z91Var, Class cls) {
        z91 z91Var2 = (z91) map.get(c0215ft);
        if (z91Var2 == null || z91Var == z91Var2) {
            if (z91Var2 == null) {
                map.put(c0215ft, z91Var);
                return;
            }
            return;
        }
        String name = c0215ft.f3132b.getName();
        String name2 = cls.getName();
        String strValueOf = String.valueOf(z91Var2);
        String strValueOf2 = String.valueOf(z91Var);
        StringBuilder sbM5696o = vi0.m5696o("Method ", name, " in ", name2, " already declared with different @OnLifecycleEvent value: previous value ");
        sbM5696o.append(strValueOf);
        sbM5696o.append(", new value ");
        sbM5696o.append(strValueOf2);
        throw new IllegalArgumentException(sbM5696o.toString());
    }

    /* JADX INFO: renamed from: a */
    public final C0178et m2025a(Class cls, Method[] methodArr) {
        int i;
        Class superclass = cls.getSuperclass();
        HashMap map = new HashMap();
        HashMap map2 = this.f3697a;
        if (superclass != null) {
            C0178et c0178etM2025a = (C0178et) map2.get(superclass);
            if (c0178etM2025a == null) {
                c0178etM2025a = m2025a(superclass, null);
            }
            map.putAll(c0178etM2025a.f2587b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            C0178et c0178etM2025a2 = (C0178et) map2.get(cls2);
            if (c0178etM2025a2 == null) {
                c0178etM2025a2 = m2025a(cls2, null);
            }
            for (Map.Entry entry : c0178etM2025a2.f2587b.entrySet()) {
                m2024b(map, (C0215ft) entry.getKey(), (z91) entry.getValue(), cls);
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
            tt1 tt1Var = (tt1) method.getAnnotation(tt1.class);
            if (tt1Var != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else {
                    if (!ia1.class.isAssignableFrom(parameterTypes[0])) {
                        C0676s.m4651j("invalid parameter type. Must be one and instanceof LifecycleOwner");
                        return null;
                    }
                    i = 1;
                }
                z91 z91VarValue = tt1Var.value();
                if (parameterTypes.length > 1) {
                    if (!z91.class.isAssignableFrom(parameterTypes[1])) {
                        C0676s.m4651j("invalid parameter type. second arg must be an event");
                        return null;
                    }
                    if (z91VarValue != z91.ON_ANY) {
                        C0676s.m4651j("Second arg is supported only for ON_ANY value");
                        return null;
                    }
                    i = 2;
                }
                if (parameterTypes.length > 2) {
                    C0676s.m4651j("cannot have more than 2 params");
                    return null;
                }
                m2024b(map, new C0215ft(method, i), z91VarValue, cls);
                z = true;
            }
        }
        C0178et c0178et = new C0178et(map);
        map2.put(cls, c0178et);
        this.f3698b.put(cls, Boolean.valueOf(z));
        return c0178et;
    }
}
