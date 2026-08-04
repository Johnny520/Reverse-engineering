package yyds;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: yyds.ᲇᛸᛶᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2501 {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public static final C2501 f12313 = new C2501();

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final HashMap f12314 = new HashMap();

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final HashMap f12315 = new HashMap();

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static void m4539(HashMap map, C2538 c2538, EnumC0637 enumC0637, Class cls) {
        EnumC0637 enumC06372 = (EnumC0637) map.get(c2538);
        if (enumC06372 == null || enumC0637 == enumC06372) {
            if (enumC06372 == null) {
                map.put(c2538, enumC0637);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + c2538.f12517.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + enumC06372 + ", new value " + enumC0637);
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final C2274 m4540(Class cls, Method[] methodArr) {
        int i;
        Class superclass = cls.getSuperclass();
        HashMap map = new HashMap();
        HashMap map2 = this.f12314;
        if (superclass != null) {
            C2274 c2274M4540 = (C2274) map2.get(superclass);
            if (c2274M4540 == null) {
                c2274M4540 = m4540(superclass, null);
            }
            map.putAll(c2274M4540.f11205);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            C2274 c2274M45402 = (C2274) map2.get(cls2);
            if (c2274M45402 == null) {
                c2274M45402 = m4540(cls2, null);
            }
            for (Map.Entry entry : c2274M45402.f11205.entrySet()) {
                m4539(map, (C2538) entry.getKey(), (EnumC0637) entry.getValue(), cls);
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
            InterfaceC1626 interfaceC1626 = (InterfaceC1626) method.getAnnotation(InterfaceC1626.class);
            if (interfaceC1626 != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else {
                    if (!InterfaceC2345.class.isAssignableFrom(parameterTypes[0])) {
                        C0188.m798("invalid parameter type. Must be one and instanceof LifecycleOwner");
                        return null;
                    }
                    i = 1;
                }
                EnumC0637 enumC0637Value = interfaceC1626.value();
                if (parameterTypes.length > 1) {
                    if (!EnumC0637.class.isAssignableFrom(parameterTypes[1])) {
                        C0188.m798("invalid parameter type. second arg must be an event");
                        return null;
                    }
                    if (enumC0637Value != EnumC0637.ON_ANY) {
                        C0188.m798("Second arg is supported only for ON_ANY value");
                        return null;
                    }
                    i = 2;
                }
                if (parameterTypes.length > 2) {
                    C0188.m798("cannot have more than 2 params");
                    return null;
                }
                m4539(map, new C2538(method, i), enumC0637Value, cls);
                z = true;
            }
        }
        C2274 c2274 = new C2274(map);
        map2.put(cls, c2274);
        this.f12315.put(cls, Boolean.valueOf(z));
        return c2274;
    }
}
