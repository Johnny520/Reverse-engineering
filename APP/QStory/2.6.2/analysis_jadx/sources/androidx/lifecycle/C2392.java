package androidx.lifecycle;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: androidx.lifecycle.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2392 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C2392 f7030 = new C2392();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final HashMap f7032 = new HashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final HashMap f7031 = new HashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static void m4497(HashMap map, C2393 c2393, Lifecycle$Event lifecycle$Event, Class cls) {
        Lifecycle$Event lifecycle$Event2 = (Lifecycle$Event) map.get(c2393);
        if (lifecycle$Event2 == null || lifecycle$Event == lifecycle$Event2) {
            if (lifecycle$Event2 == null) {
                map.put(c2393, lifecycle$Event);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + c2393.f7033.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + lifecycle$Event2 + ", new value " + lifecycle$Event);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C2394 m4498(Class cls, Method[] methodArr) {
        int i;
        Class superclass = cls.getSuperclass();
        HashMap map = new HashMap();
        HashMap map2 = this.f7032;
        if (superclass != null) {
            C2394 c2394M4498 = (C2394) map2.get(superclass);
            if (c2394M4498 == null) {
                c2394M4498 = m4498(superclass, null);
            }
            map.putAll(c2394M4498.f7035);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            C2394 c2394M44982 = (C2394) map2.get(cls2);
            if (c2394M44982 == null) {
                c2394M44982 = m4498(cls2, null);
            }
            for (Map.Entry entry : c2394M44982.f7035.entrySet()) {
                m4497(map, (C2393) entry.getKey(), (Lifecycle$Event) entry.getValue(), cls);
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
            InterfaceC2369 interfaceC2369 = (InterfaceC2369) method.getAnnotation(InterfaceC2369.class);
            if (interfaceC2369 != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else {
                    if (!InterfaceC2388.class.isAssignableFrom(parameterTypes[0])) {
                        C5919.m11249("invalid parameter type. Must be one and instanceof LifecycleOwner");
                        return null;
                    }
                    i = 1;
                }
                Lifecycle$Event lifecycle$EventValue = interfaceC2369.value();
                if (parameterTypes.length > 1) {
                    if (!Lifecycle$Event.class.isAssignableFrom(parameterTypes[1])) {
                        C5919.m11249("invalid parameter type. second arg must be an event");
                        return null;
                    }
                    if (lifecycle$EventValue != Lifecycle$Event.ON_ANY) {
                        C5919.m11249("Second arg is supported only for ON_ANY value");
                        return null;
                    }
                    i = 2;
                }
                if (parameterTypes.length > 2) {
                    C5919.m11249("cannot have more than 2 params");
                    return null;
                }
                m4497(map, new C2393(method, i), lifecycle$EventValue, cls);
                z = true;
            }
        }
        C2394 c2394 = new C2394(map);
        map2.put(cls, c2394);
        this.f7031.put(cls, Boolean.valueOf(z));
        return c2394;
    }
}
