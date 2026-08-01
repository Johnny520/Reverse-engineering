package p000;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: pa */
/* JADX INFO: loaded from: classes.dex */
public final class C0590pa {

    /* JADX INFO: renamed from: c */
    public static final C0590pa f3686c = new C0590pa();

    /* JADX INFO: renamed from: a */
    public final HashMap f3687a = new HashMap();

    /* JADX INFO: renamed from: b */
    public final HashMap f3688b = new HashMap();

    /* JADX INFO: renamed from: b */
    public static void m2071b(HashMap map, C0552oa c0552oa, EnumC0347iq enumC0347iq, Class cls) {
        EnumC0347iq enumC0347iq2 = (EnumC0347iq) map.get(c0552oa);
        if (enumC0347iq2 == null || enumC0347iq == enumC0347iq2) {
            if (enumC0347iq2 == null) {
                map.put(c0552oa, enumC0347iq);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + c0552oa.f3517b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + enumC0347iq2 + ", new value " + enumC0347iq);
    }

    /* JADX INFO: renamed from: a */
    public final C0515na m2072a(Class cls, Method[] methodArr) {
        int i;
        Class superclass = cls.getSuperclass();
        HashMap map = new HashMap();
        HashMap map2 = this.f3687a;
        if (superclass != null) {
            C0515na c0515naM2072a = (C0515na) map2.get(superclass);
            if (c0515naM2072a == null) {
                c0515naM2072a = m2072a(superclass, null);
            }
            map.putAll(c0515naM2072a.f3364b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            C0515na c0515naM2072a2 = (C0515na) map2.get(cls2);
            if (c0515naM2072a2 == null) {
                c0515naM2072a2 = m2072a(cls2, null);
            }
            for (Map.Entry entry : c0515naM2072a2.f3364b.entrySet()) {
                m2071b(map, (C0552oa) entry.getKey(), (EnumC0347iq) entry.getValue(), cls);
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
            InterfaceC0982zw interfaceC0982zw = (InterfaceC0982zw) method.getAnnotation(InterfaceC0982zw.class);
            if (interfaceC0982zw != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else {
                    if (!InterfaceC0568oq.class.isAssignableFrom(parameterTypes[0])) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i = 1;
                }
                EnumC0347iq enumC0347iqValue = interfaceC0982zw.value();
                if (parameterTypes.length > 1) {
                    if (!EnumC0347iq.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (enumC0347iqValue != EnumC0347iq.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                m2071b(map, new C0552oa(i, method), enumC0347iqValue, cls);
                z = true;
            }
        }
        C0515na c0515na = new C0515na(map);
        map2.put(cls, c0515na);
        this.f3688b.put(cls, Boolean.valueOf(z));
        return c0515na;
    }
}
