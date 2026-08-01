package p000;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: xa */
/* JADX INFO: loaded from: classes.dex */
public final class C0886xa {

    /* JADX INFO: renamed from: c */
    public static final C0886xa f5228c = new C0886xa();

    /* JADX INFO: renamed from: a */
    public final HashMap f5229a = new HashMap();

    /* JADX INFO: renamed from: b */
    public final HashMap f5230b = new HashMap();

    /* JADX INFO: renamed from: b */
    public static void m2672b(HashMap map, C0849wa c0849wa, EnumC0494mq enumC0494mq, Class cls) {
        EnumC0494mq enumC0494mq2 = (EnumC0494mq) map.get(c0849wa);
        if (enumC0494mq2 == null || enumC0494mq == enumC0494mq2) {
            if (enumC0494mq2 == null) {
                map.put(c0849wa, enumC0494mq);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + c0849wa.f5076b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + enumC0494mq2 + ", new value " + enumC0494mq);
    }

    /* JADX INFO: renamed from: a */
    public final C0811va m2673a(Class cls, Method[] methodArr) {
        int i;
        Class superclass = cls.getSuperclass();
        HashMap map = new HashMap();
        HashMap map2 = this.f5229a;
        if (superclass != null) {
            C0811va c0811vaM2673a = (C0811va) map2.get(superclass);
            if (c0811vaM2673a == null) {
                c0811vaM2673a = m2673a(superclass, null);
            }
            map.putAll(c0811vaM2673a.f4923b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            C0811va c0811vaM2673a2 = (C0811va) map2.get(cls2);
            if (c0811vaM2673a2 == null) {
                c0811vaM2673a2 = m2673a(cls2, null);
            }
            for (Map.Entry entry : c0811vaM2673a2.f4923b.entrySet()) {
                m2672b(map, (C0849wa) entry.getKey(), (EnumC0494mq) entry.getValue(), cls);
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
            InterfaceC0314hx interfaceC0314hx = (InterfaceC0314hx) method.getAnnotation(InterfaceC0314hx.class);
            if (interfaceC0314hx != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else {
                    if (!InterfaceC0716sq.class.isAssignableFrom(parameterTypes[0])) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i = 1;
                }
                EnumC0494mq enumC0494mqValue = interfaceC0314hx.value();
                if (parameterTypes.length > 1) {
                    if (!EnumC0494mq.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (enumC0494mqValue != EnumC0494mq.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                m2672b(map, new C0849wa(i, method), enumC0494mqValue, cls);
                z = true;
            }
        }
        C0811va c0811va = new C0811va(map);
        map2.put(cls, c0811va);
        this.f5230b.put(cls, Boolean.valueOf(z));
        return c0811va;
    }
}
