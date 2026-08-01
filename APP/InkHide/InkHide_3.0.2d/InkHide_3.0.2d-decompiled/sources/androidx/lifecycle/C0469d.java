package androidx.lifecycle;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: androidx.lifecycle.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0469d {

    /* JADX INFO: renamed from: c */
    public static final C0469d f1512c = new C0469d();

    /* JADX INFO: renamed from: a */
    public final HashMap f1513a = new HashMap();

    /* JADX INFO: renamed from: b */
    public final HashMap f1514b = new HashMap();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static void m922b(HashMap map, C0468c c0468c, EnumC0478m enumC0478m, Class cls) {
        EnumC0478m enumC0478m2 = (EnumC0478m) map.get(c0468c);
        if (enumC0478m2 == null || enumC0478m == enumC0478m2) {
            if (enumC0478m2 == null) {
                map.put(c0468c, enumC0478m);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + c0468c.f1511b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + enumC0478m2 + ", new value " + enumC0478m);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final C0467b m923a(Class cls, Method[] methodArr) {
        int i2;
        Class superclass = cls.getSuperclass();
        HashMap map = new HashMap();
        HashMap map2 = this.f1513a;
        if (superclass != null) {
            C0467b c0467bM923a = (C0467b) map2.get(superclass);
            if (c0467bM923a == null) {
                c0467bM923a = m923a(superclass, null);
            }
            map.putAll(c0467bM923a.f1509b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            C0467b c0467bM923a2 = (C0467b) map2.get(cls2);
            if (c0467bM923a2 == null) {
                c0467bM923a2 = m923a(cls2, null);
            }
            for (Map.Entry entry : c0467bM923a2.f1509b.entrySet()) {
                m922b(map, (C0468c) entry.getKey(), (EnumC0478m) entry.getValue(), cls);
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
            InterfaceC0490y interfaceC0490y = (InterfaceC0490y) method.getAnnotation(InterfaceC0490y.class);
            if (interfaceC0490y != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i2 = 0;
                } else {
                    if (!InterfaceC0484s.class.isAssignableFrom(parameterTypes[0])) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i2 = 1;
                }
                EnumC0478m enumC0478mValue = interfaceC0490y.value();
                if (parameterTypes.length > 1) {
                    if (!EnumC0478m.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (enumC0478mValue != EnumC0478m.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i2 = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                m922b(map, new C0468c(i2, method), enumC0478mValue, cls);
                z2 = true;
            }
        }
        C0467b c0467b = new C0467b(map);
        map2.put(cls, c0467b);
        this.f1514b.put(cls, Boolean.valueOf(z2));
        return c0467b;
    }
}
