package androidx.lifecycle;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: androidx.lifecycle.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3225 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C3225 f7376 = new C3225();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final HashMap f7378 = new HashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final HashMap f7377 = new HashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static void m5067(HashMap map, C3226 c3226, Lifecycle$Event lifecycle$Event, Class cls) {
        Lifecycle$Event lifecycle$Event2 = (Lifecycle$Event) map.get(c3226);
        if (lifecycle$Event2 == null || lifecycle$Event == lifecycle$Event2) {
            if (lifecycle$Event2 == null) {
                map.put(c3226, lifecycle$Event);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + c3226.f7379.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + lifecycle$Event2 + ", new value " + lifecycle$Event);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C3227 m5068(Class cls, Method[] methodArr) {
        int i;
        Class superclass = cls.getSuperclass();
        HashMap map = new HashMap();
        HashMap map2 = this.f7378;
        if (superclass != null) {
            C3227 c3227M5068 = (C3227) map2.get(superclass);
            if (c3227M5068 == null) {
                c3227M5068 = m5068(superclass, null);
            }
            map.putAll(c3227M5068.f7381);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            C3227 c3227M50682 = (C3227) map2.get(cls2);
            if (c3227M50682 == null) {
                c3227M50682 = m5068(cls2, null);
            }
            for (Map.Entry entry : c3227M50682.f7381.entrySet()) {
                m5067(map, (C3226) entry.getKey(), (Lifecycle$Event) entry.getValue(), cls);
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
            InterfaceC3202 interfaceC3202 = (InterfaceC3202) method.getAnnotation(InterfaceC3202.class);
            if (interfaceC3202 != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else {
                    if (!InterfaceC3221.class.isAssignableFrom(parameterTypes[0])) {
                        C6755.m11869("invalid parameter type. Must be one and instanceof LifecycleOwner");
                        return null;
                    }
                    i = 1;
                }
                Lifecycle$Event lifecycle$EventValue = interfaceC3202.value();
                if (parameterTypes.length > 1) {
                    if (!Lifecycle$Event.class.isAssignableFrom(parameterTypes[1])) {
                        C6755.m11869("invalid parameter type. second arg must be an event");
                        return null;
                    }
                    if (lifecycle$EventValue != Lifecycle$Event.ON_ANY) {
                        C6755.m11869("Second arg is supported only for ON_ANY value");
                        return null;
                    }
                    i = 2;
                }
                if (parameterTypes.length > 2) {
                    C6755.m11869("cannot have more than 2 params");
                    return null;
                }
                m5067(map, new C3226(method, i), lifecycle$EventValue, cls);
                z = true;
            }
        }
        C3227 c3227 = new C3227(map);
        map2.put(cls, c3227);
        this.f7377.put(cls, Boolean.valueOf(z));
        return c3227;
    }
}
