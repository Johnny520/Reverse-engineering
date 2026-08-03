package com.tendcloud.tenddata;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.tendcloud.tenddata.ad */
/* JADX INFO: loaded from: classes.dex */
final class C0022ad {

    /* JADX INFO: renamed from: a */
    private static final Map<Class<?>, Map<Class<?>, Set<Method>>> f153a = new ConcurrentHashMap();

    private C0022ad() {
    }

    /* JADX INFO: renamed from: a */
    public static Map<Class<?>, Set<C0023ae>> m96a(Object obj) {
        HashMap map = new HashMap();
        try {
            Class<?> cls = obj.getClass();
            Map<Class<?>, Map<Class<?>, Set<Method>>> map2 = f153a;
            if (!map2.containsKey(cls)) {
                m97a(cls);
            }
            Map<Class<?>, Set<Method>> map3 = map2.get(cls);
            if (map3 != null && !map3.isEmpty()) {
                for (Map.Entry<Class<?>, Set<Method>> entry : map3.entrySet()) {
                    HashSet hashSet = new HashSet();
                    Iterator<Method> it = entry.getValue().iterator();
                    while (it.hasNext()) {
                        hashSet.add(new C0023ae(obj, it.next()));
                    }
                    map.put(entry.getKey(), hashSet);
                }
            }
        } catch (Throwable unused) {
        }
        return map;
    }

    /* JADX INFO: renamed from: a */
    private static void m97a(Class<?> cls) {
        try {
            HashMap map = new HashMap();
            for (Method method : cls.getDeclaredMethods()) {
                if (method.getName().startsWith("onTDEBEvent") && method.getParameterTypes().length == 1) {
                    Class<?>[] parameterTypes = method.getParameterTypes();
                    if (parameterTypes.length != 1) {
                        C0115h.eForInternal("Method " + method + " must have one and only one argument.");
                    }
                    Class<?> cls2 = parameterTypes[0];
                    if (cls2.isInterface()) {
                        C0115h.eForInternal("Method " + method + " must have a argument whose type is a class which can be instantialized.");
                    }
                    if ((method.getModifiers() & 1) == 0) {
                        C0115h.eForInternal("Method " + method + " must be 'public'.");
                    }
                    Set hashSet = (Set) map.get(cls2);
                    if (hashSet == null) {
                        hashSet = new HashSet();
                        map.put(cls2, hashSet);
                    }
                    hashSet.add(method);
                }
            }
            f153a.put(cls, map);
        } catch (Throwable unused) {
        }
    }
}
