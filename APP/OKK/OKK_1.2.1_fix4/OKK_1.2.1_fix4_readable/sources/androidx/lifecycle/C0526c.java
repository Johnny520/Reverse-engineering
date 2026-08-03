package androidx.lifecycle;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: androidx.lifecycle.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0526c {

    /* JADX INFO: renamed from: c */
    public static final C0526c f1477c = new C0526c();

    /* JADX INFO: renamed from: a */
    public final HashMap f1478a = new HashMap();

    /* JADX INFO: renamed from: b */
    public final HashMap f1479b = new HashMap();

    /* JADX INFO: renamed from: b */
    public static void m1249b(HashMap map, C0525b c0525b, EnumC0535l enumC0535l, Class cls) {
        EnumC0535l enumC0535l2 = (EnumC0535l) map.get(c0525b);
        if (enumC0535l2 == null || enumC0535l == enumC0535l2) {
            if (enumC0535l2 == null) {
                map.put(c0525b, enumC0535l);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + c0525b.f1476b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + enumC0535l2 + ", new value " + enumC0535l);
    }

    /* JADX INFO: renamed from: a */
    public final C0524a m1250a(Class cls, Method[] methodArr) {
        int i2;
        Class superclass = cls.getSuperclass();
        HashMap map = new HashMap();
        HashMap map2 = this.f1478a;
        if (superclass != null) {
            C0524a c0524aM1250a = (C0524a) map2.get(superclass);
            if (c0524aM1250a == null) {
                c0524aM1250a = m1250a(superclass, null);
            }
            map.putAll(c0524aM1250a.f1474b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            C0524a c0524aM1250a2 = (C0524a) map2.get(cls2);
            if (c0524aM1250a2 == null) {
                c0524aM1250a2 = m1250a(cls2, null);
            }
            for (Map.Entry entry : c0524aM1250a2.f1474b.entrySet()) {
                m1249b(map, (C0525b) entry.getKey(), (EnumC0535l) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e2) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e2);
            }
        }
        boolean z2 = false;
        for (Method method : methodArr) {
            InterfaceC0546w interfaceC0546w = (InterfaceC0546w) method.getAnnotation(InterfaceC0546w.class);
            if (interfaceC0546w != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i2 = 0;
                } else {
                    if (!InterfaceC0541r.class.isAssignableFrom(parameterTypes[0])) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i2 = 1;
                }
                EnumC0535l enumC0535lValue = interfaceC0546w.value();
                if (parameterTypes.length > 1) {
                    if (!EnumC0535l.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (enumC0535lValue != EnumC0535l.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i2 = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                m1249b(map, new C0525b(i2, method), enumC0535lValue, cls);
                z2 = true;
            }
        }
        C0524a c0524a = new C0524a(map);
        map2.put(cls, c0524a);
        this.f1479b.put(cls, Boolean.valueOf(z2));
        return c0524a;
    }
}
