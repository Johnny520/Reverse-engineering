package androidx.lifecycle;

import androidx.lifecycle.AbstractC0668k;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import okhttp3.C5750e;
import p280t5.C8130u;
import p376zd.C9987e;

/* JADX INFO: renamed from: androidx.lifecycle.c */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C0652c {

    /* JADX INFO: renamed from: c */
    public static C0652c f1931c = new C0652c();

    /* JADX INFO: renamed from: a */
    public final Map f1932a = new HashMap();

    /* JADX INFO: renamed from: b */
    public final Map f1933b = new HashMap();

    /* JADX INFO: renamed from: androidx.lifecycle.c$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class a {

        /* JADX INFO: renamed from: a */
        public final Map f1934a = new HashMap();

        /* JADX INFO: renamed from: b */
        public final Map f1935b;

        public a(Map map) {
            this.f1935b = map;
            for (Map.Entry entry : map.entrySet()) {
                AbstractC0668k.a aVar = (AbstractC0668k.a) entry.getValue();
                List arrayList = (List) this.f1934a.get(aVar);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    this.f1934a.put(aVar, arrayList);
                }
                arrayList.add((b) entry.getKey());
            }
        }

        /* JADX INFO: renamed from: b */
        public static void m2590b(List list, InterfaceC0676o interfaceC0676o, AbstractC0668k.a aVar, Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    ((b) list.get(size)).m2592a(interfaceC0676o, aVar, obj);
                }
            }
        }

        /* JADX INFO: renamed from: a */
        public void m2591a(InterfaceC0676o interfaceC0676o, AbstractC0668k.a aVar, Object obj) {
            m2590b((List) this.f1934a.get(aVar), interfaceC0676o, aVar, obj);
            m2590b((List) this.f1934a.get(AbstractC0668k.a.ON_ANY), interfaceC0676o, aVar, obj);
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.c$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public final int f1936a;

        /* JADX INFO: renamed from: b */
        public final Method f1937b;

        public b(int i10, Method method) {
            this.f1936a = i10;
            this.f1937b = method;
            method.setAccessible(true);
        }

        /* JADX INFO: renamed from: a */
        public void m2592a(InterfaceC0676o interfaceC0676o, AbstractC0668k.a aVar, Object obj) {
            try {
                int i10 = this.f1936a;
                if (i10 == 0) {
                    this.f1937b.invoke(obj, null);
                } else if (i10 == 1) {
                    this.f1937b.invoke(obj, interfaceC0676o);
                } else {
                    if (i10 != 2) {
                        return;
                    }
                    this.f1937b.invoke(obj, interfaceC0676o, aVar);
                }
            } catch (IllegalAccessException e10) {
                C5750e.m23251a(e10);
            } catch (InvocationTargetException e11) {
                C8130u.m31512a("Failed to call observer method", e11.getCause());
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f1936a == bVar.f1936a && this.f1937b.getName().equals(bVar.f1937b.getName());
        }

        public int hashCode() {
            return (this.f1936a * 31) + this.f1937b.getName().hashCode();
        }
    }

    /* JADX INFO: renamed from: a */
    public final a m2585a(Class cls, Method[] methodArr) {
        int i10;
        a aVarM2587c;
        Class superclass = cls.getSuperclass();
        HashMap map = new HashMap();
        if (superclass != null && (aVarM2587c = m2587c(superclass)) != null) {
            map.putAll(aVarM2587c.f1935b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            for (Map.Entry entry : m2587c(cls2).f1935b.entrySet()) {
                m2589e(map, (b) entry.getKey(), (AbstractC0668k.a) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = m2586b(cls);
        }
        boolean z10 = false;
        for (Method method : methodArr) {
            InterfaceC0686v interfaceC0686v = (InterfaceC0686v) method.getAnnotation(InterfaceC0686v.class);
            if (interfaceC0686v != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i10 = 0;
                } else {
                    if (!InterfaceC0676o.class.isAssignableFrom(parameterTypes[0])) {
                        C9987e.m38645a("invalid parameter type. Must be one and instanceof LifecycleOwner");
                        return null;
                    }
                    i10 = 1;
                }
                AbstractC0668k.a aVarValue = interfaceC0686v.value();
                if (parameterTypes.length > 1) {
                    if (!AbstractC0668k.a.class.isAssignableFrom(parameterTypes[1])) {
                        C9987e.m38645a("invalid parameter type. second arg must be an event");
                        return null;
                    }
                    if (aVarValue != AbstractC0668k.a.ON_ANY) {
                        C9987e.m38645a("Second arg is supported only for ON_ANY value");
                        return null;
                    }
                    i10 = 2;
                }
                if (parameterTypes.length > 2) {
                    C9987e.m38645a("cannot have more than 2 params");
                    return null;
                }
                m2589e(map, new b(i10, method), aVarValue, cls);
                z10 = true;
            }
        }
        a aVar = new a(map);
        this.f1932a.put(cls, aVar);
        this.f1933b.put(cls, Boolean.valueOf(z10));
        return aVar;
    }

    /* JADX INFO: renamed from: b */
    public final Method[] m2586b(Class cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e10) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e10);
        }
    }

    /* JADX INFO: renamed from: c */
    public a m2587c(Class cls) {
        a aVar = (a) this.f1932a.get(cls);
        return aVar != null ? aVar : m2585a(cls, null);
    }

    /* JADX INFO: renamed from: d */
    public boolean m2588d(Class cls) {
        Boolean bool = (Boolean) this.f1933b.get(cls);
        if (bool != null) {
            return bool.booleanValue();
        }
        Method[] methodArrM2586b = m2586b(cls);
        for (Method method : methodArrM2586b) {
            if (((InterfaceC0686v) method.getAnnotation(InterfaceC0686v.class)) != null) {
                m2585a(cls, methodArrM2586b);
                return true;
            }
        }
        this.f1933b.put(cls, Boolean.FALSE);
        return false;
    }

    /* JADX INFO: renamed from: e */
    public final void m2589e(Map map, b bVar, AbstractC0668k.a aVar, Class cls) {
        AbstractC0668k.a aVar2 = (AbstractC0668k.a) map.get(bVar);
        if (aVar2 == null || aVar == aVar2) {
            if (aVar2 == null) {
                map.put(bVar, aVar);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + bVar.f1937b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + aVar2 + ", new value " + aVar);
    }
}
