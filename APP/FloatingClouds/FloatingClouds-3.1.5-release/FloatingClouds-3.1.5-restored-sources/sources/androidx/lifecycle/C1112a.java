package androidx.lifecycle;

import androidx.lifecycle.AbstractC1116e;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p000a.InterfaceC0916x9;
import p000a.InterfaceC0935y9;

/* JADX INFO: renamed from: androidx.lifecycle.a */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class C1112a {

    /* JADX INFO: renamed from: c */
    public static final C1112a f4665c = new C1112a();

    /* JADX INFO: renamed from: a */
    public final HashMap f4666a = new HashMap();

    /* JADX INFO: renamed from: b */
    public final HashMap f4667b = new HashMap();

    /* JADX INFO: renamed from: androidx.lifecycle.a$a */
    @Deprecated
    public static class a {

        /* JADX INFO: renamed from: a */
        public final HashMap f4668a = new HashMap();

        /* JADX INFO: renamed from: b */
        public final HashMap f4669b;

        public a(HashMap map) {
            this.f4669b = map;
            for (Map.Entry entry : map.entrySet()) {
                AbstractC1116e.a aVar = (AbstractC1116e.a) entry.getValue();
                List arrayList = (List) this.f4668a.get(aVar);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    this.f4668a.put(aVar, arrayList);
                }
                arrayList.add((b) entry.getKey());
            }
        }

        /* JADX INFO: renamed from: a */
        public static void m2588a(List list, InterfaceC0935y9 interfaceC0935y9, AbstractC1116e.a aVar, InterfaceC0916x9 interfaceC0916x9) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    b bVar = (b) list.get(size);
                    bVar.getClass();
                    try {
                        int i = bVar.f4670a;
                        Method method = bVar.f4671b;
                        if (i == 0) {
                            method.invoke(interfaceC0916x9, null);
                        } else if (i == 1) {
                            method.invoke(interfaceC0916x9, interfaceC0935y9);
                        } else if (i == 2) {
                            method.invoke(interfaceC0916x9, interfaceC0935y9, aVar);
                        }
                    } catch (IllegalAccessException e) {
                        throw new RuntimeException(e);
                    } catch (InvocationTargetException e2) {
                        throw new RuntimeException("Failed to call observer method", e2.getCause());
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.a$b */
    @Deprecated
    public static final class b {

        /* JADX INFO: renamed from: a */
        public final int f4670a;

        /* JADX INFO: renamed from: b */
        public final Method f4671b;

        public b(int i, Method method) {
            this.f4670a = i;
            this.f4671b = method;
            method.setAccessible(true);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f4670a == bVar.f4670a && this.f4671b.getName().equals(bVar.f4671b.getName());
        }

        public final int hashCode() {
            return this.f4671b.getName().hashCode() + (this.f4670a * 31);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m2586b(HashMap map, b bVar, AbstractC1116e.a aVar, Class cls) {
        AbstractC1116e.a aVar2 = (AbstractC1116e.a) map.get(bVar);
        if (aVar2 == null || aVar == aVar2) {
            if (aVar2 == null) {
                map.put(bVar, aVar);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + bVar.f4671b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + aVar2 + ", new value " + aVar);
    }

    /* JADX INFO: renamed from: a */
    public final a m2587a(Class<?> cls, Method[] methodArr) {
        int i;
        Class<? super Object> superclass = cls.getSuperclass();
        HashMap map = new HashMap();
        HashMap map2 = this.f4666a;
        if (superclass != null) {
            a aVarM2587a = (a) map2.get(superclass);
            if (aVarM2587a == null) {
                aVarM2587a = m2587a(superclass, null);
            }
            map.putAll(aVarM2587a.f4669b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            a aVarM2587a2 = (a) map2.get(cls2);
            if (aVarM2587a2 == null) {
                aVarM2587a2 = m2587a(cls2, null);
            }
            for (Map.Entry entry : aVarM2587a2.f4669b.entrySet()) {
                m2586b(map, (b) entry.getKey(), (AbstractC1116e.a) entry.getValue(), cls);
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
            InterfaceC1120i interfaceC1120i = (InterfaceC1120i) method.getAnnotation(InterfaceC1120i.class);
            if (interfaceC1120i != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else {
                    if (!InterfaceC0935y9.class.isAssignableFrom(parameterTypes[0])) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i = 1;
                }
                AbstractC1116e.a aVarValue = interfaceC1120i.value();
                if (parameterTypes.length > 1) {
                    if (!AbstractC1116e.a.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (aVarValue != AbstractC1116e.a.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                m2586b(map, new b(i, method), aVarValue, cls);
                z = true;
            }
        }
        a aVar = new a(map);
        map2.put(cls, aVar);
        this.f4667b.put(cls, Boolean.valueOf(z));
        return aVar;
    }
}
