package androidx.lifecycle;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import p136j8.C2104o;

/* JADX INFO: renamed from: androidx.lifecycle.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0095c {

    /* JADX INFO: renamed from: c */
    public static final C0095c f277c = new C0095c();

    /* JADX INFO: renamed from: a */
    public final HashMap f278a = new HashMap();

    /* JADX INFO: renamed from: b */
    public final HashMap f279b = new HashMap();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static void m539b(HashMap map, C0093b c0093b, EnumC0106k enumC0106k, Class cls) {
        EnumC0106k enumC0106k2 = (EnumC0106k) map.get(c0093b);
        if (enumC0106k2 == null || enumC0106k == enumC0106k2) {
            if (enumC0106k2 == null) {
                map.put(c0093b, enumC0106k);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + c0093b.f276b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + enumC0106k2 + ", new value " + enumC0106k);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final C0091a m540a(Class cls, Method[] methodArr) {
        int i9;
        Class superclass = cls.getSuperclass();
        HashMap map = new HashMap();
        HashMap map2 = this.f278a;
        if (superclass != null) {
            C0091a c0091aM540a = (C0091a) map2.get(superclass);
            if (c0091aM540a == null) {
                c0091aM540a = m540a(superclass, null);
            }
            map.putAll(c0091aM540a.f274b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            C0091a c0091aM540a2 = (C0091a) map2.get(cls2);
            if (c0091aM540a2 == null) {
                c0091aM540a2 = m540a(cls2, null);
            }
            for (Map.Entry entry : c0091aM540a2.f274b.entrySet()) {
                m539b(map, (C0093b) entry.getKey(), (EnumC0106k) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e6) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e6);
            }
        }
        boolean z9 = false;
        for (Method method : methodArr) {
            InterfaceC0116u interfaceC0116u = (InterfaceC0116u) method.getAnnotation(InterfaceC0116u.class);
            if (interfaceC0116u != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i9 = 0;
                } else {
                    if (!InterfaceC0112q.class.isAssignableFrom(parameterTypes[0])) {
                        C2104o.m5294t("invalid parameter type. Must be one and instanceof LifecycleOwner");
                        return null;
                    }
                    i9 = 1;
                }
                EnumC0106k enumC0106kValue = interfaceC0116u.value();
                if (parameterTypes.length > 1) {
                    if (!EnumC0106k.class.isAssignableFrom(parameterTypes[1])) {
                        C2104o.m5294t("invalid parameter type. second arg must be an event");
                        return null;
                    }
                    if (enumC0106kValue != EnumC0106k.ON_ANY) {
                        C2104o.m5294t("Second arg is supported only for ON_ANY value");
                        return null;
                    }
                    i9 = 2;
                }
                if (parameterTypes.length > 2) {
                    C2104o.m5294t("cannot have more than 2 params");
                    return null;
                }
                m539b(map, new C0093b(method, i9), enumC0106kValue, cls);
                z9 = true;
            }
        }
        C0091a c0091a = new C0091a(map);
        map2.put(cls, c0091a);
        this.f279b.put(cls, Boolean.valueOf(z9));
        return c0091a;
    }
}
