package p000;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: J9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0397J9 {

    /* JADX INFO: renamed from: c */
    public static final C0397J9 f1340c = new C0397J9();

    /* JADX INFO: renamed from: a */
    public final HashMap f1341a = new HashMap();

    /* JADX INFO: renamed from: b */
    public final HashMap f1342b = new HashMap();

    /* JADX INFO: renamed from: b */
    public static void m834b(HashMap map, C0354I9 c0354i9, EnumC0632On enumC0632On, Class cls) {
        EnumC0632On enumC0632On2 = (EnumC0632On) map.get(c0354i9);
        if (enumC0632On2 == null || enumC0632On == enumC0632On2) {
            if (enumC0632On2 == null) {
                map.put(c0354i9, enumC0632On);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + c0354i9.f1189b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + enumC0632On2 + ", new value " + enumC0632On);
    }

    /* JADX INFO: renamed from: a */
    public final C0311H9 m835a(Class cls, Method[] methodArr) {
        int i;
        Class superclass = cls.getSuperclass();
        HashMap map = new HashMap();
        HashMap map2 = this.f1341a;
        if (superclass != null) {
            C0311H9 c0311h9M835a = (C0311H9) map2.get(superclass);
            if (c0311h9M835a == null) {
                c0311h9M835a = m835a(superclass, null);
            }
            map.putAll(c0311h9M835a.f1031b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            C0311H9 c0311h9M835a2 = (C0311H9) map2.get(cls2);
            if (c0311h9M835a2 == null) {
                c0311h9M835a2 = m835a(cls2, null);
            }
            for (Map.Entry entry : c0311h9M835a2.f1031b.entrySet()) {
                m834b(map, (C0354I9) entry.getKey(), (EnumC0632On) entry.getValue(), cls);
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
            InterfaceC2429qt interfaceC2429qt = (InterfaceC2429qt) method.getAnnotation(InterfaceC2429qt.class);
            if (interfaceC2429qt != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else {
                    if (!InterfaceC1061Yn.class.isAssignableFrom(parameterTypes[0])) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i = 1;
                }
                EnumC0632On enumC0632OnValue = interfaceC2429qt.value();
                if (parameterTypes.length > 1) {
                    if (!EnumC0632On.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (enumC0632OnValue != EnumC0632On.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                m834b(map, new C0354I9(i, method), enumC0632OnValue, cls);
                z = true;
            }
        }
        C0311H9 c0311h9 = new C0311H9(map);
        map2.put(cls, c0311h9);
        this.f1342b.put(cls, Boolean.valueOf(z));
        return c0311h9;
    }
}
