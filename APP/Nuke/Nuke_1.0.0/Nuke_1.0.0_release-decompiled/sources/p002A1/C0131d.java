package p002A1;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: A1.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0131d {

    /* JADX INFO: renamed from: c */
    public static final C0131d f523c = new C0131d();

    /* JADX INFO: renamed from: a */
    public final HashMap f524a = new HashMap();

    /* JADX INFO: renamed from: b */
    public final HashMap f525b = new HashMap();

    /* JADX INFO: renamed from: b */
    public static void m178b(HashMap map, C0130c c0130c, EnumC0140m enumC0140m, Class cls) {
        EnumC0140m enumC0140m2 = (EnumC0140m) map.get(c0130c);
        if (enumC0140m2 == null || enumC0140m == enumC0140m2) {
            if (enumC0140m2 == null) {
                map.put(c0130c, enumC0140m);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + c0130c.f522b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + enumC0140m2 + ", new value " + enumC0140m);
    }

    /* JADX INFO: renamed from: a */
    public final C0129b m179a(Class cls, Method[] methodArr) {
        int i5;
        Class superclass = cls.getSuperclass();
        HashMap map = new HashMap();
        HashMap map2 = this.f524a;
        if (superclass != null) {
            C0129b c0129bM179a = (C0129b) map2.get(superclass);
            if (c0129bM179a == null) {
                c0129bM179a = m179a(superclass, null);
            }
            map.putAll(c0129bM179a.f520b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            C0129b c0129bM179a2 = (C0129b) map2.get(cls2);
            if (c0129bM179a2 == null) {
                c0129bM179a2 = m179a(cls2, null);
            }
            for (Map.Entry entry : c0129bM179a2.f520b.entrySet()) {
                m178b(map, (C0130c) entry.getKey(), (EnumC0140m) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e5) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e5);
            }
        }
        boolean z5 = false;
        for (Method method : methodArr) {
            InterfaceC0149v interfaceC0149v = (InterfaceC0149v) method.getAnnotation(InterfaceC0149v.class);
            if (interfaceC0149v != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i5 = 0;
                } else {
                    if (!InterfaceC0145r.class.isAssignableFrom(parameterTypes[0])) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i5 = 1;
                }
                EnumC0140m enumC0140mValue = interfaceC0149v.value();
                if (parameterTypes.length > 1) {
                    if (!EnumC0140m.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (enumC0140mValue != EnumC0140m.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i5 = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                m178b(map, new C0130c(method, i5), enumC0140mValue, cls);
                z5 = true;
            }
        }
        C0129b c0129b = new C0129b(map);
        map2.put(cls, c0129b);
        this.f525b.put(cls, Boolean.valueOf(z5));
        return c0129b;
    }
}
