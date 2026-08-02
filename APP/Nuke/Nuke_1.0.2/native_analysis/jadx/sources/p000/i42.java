package p000;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class i42 {

    /* JADX INFO: renamed from: f */
    public static final Map f4259f = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: g */
    public static final HashMap f4260g;

    /* JADX INFO: renamed from: h */
    public static final HashMap f4261h;

    /* JADX INFO: renamed from: i */
    public static final HashMap f4262i;

    /* JADX INFO: renamed from: a */
    public final Class f4263a;

    /* JADX INFO: renamed from: c */
    public File f4265c;

    /* JADX INFO: renamed from: b */
    public ClassLoader f4264b = i42.class.getClassLoader();

    /* JADX INFO: renamed from: d */
    public final Object[] f4266d = new Object[0];

    /* JADX INFO: renamed from: e */
    public final ArrayList f4267e = new ArrayList();

    static {
        HashMap map = new HashMap();
        f4260g = map;
        Class cls = Boolean.TYPE;
        map.put(cls, Boolean.class);
        Class cls2 = Integer.TYPE;
        Class<Integer> cls3 = Integer.class;
        map.put(cls2, cls3);
        Class cls4 = Byte.TYPE;
        Class<Byte> cls5 = Byte.class;
        map.put(cls4, cls5);
        Class cls6 = Long.TYPE;
        map.put(cls6, Long.class);
        Class cls7 = Short.TYPE;
        map.put(cls7, Short.class);
        Class cls8 = Float.TYPE;
        map.put(cls8, Float.class);
        Class cls9 = Double.TYPE;
        map.put(cls9, Double.class);
        Class cls10 = Character.TYPE;
        Class<Character> cls11 = Character.class;
        map.put(cls10, cls11);
        f4261h = new HashMap();
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Iterator it2 = it;
            a63 a63VarM101a = a63.m101a((Class) entry.getKey());
            Class<Character> cls12 = cls11;
            a63 a63VarM101a2 = a63.m101a((Class) entry.getValue());
            f4261h.put(a63VarM101a, a63VarM101a2.m102b(a63VarM101a2, "valueOf", a63VarM101a));
            cls3 = cls3;
            cls11 = cls12;
            it = it2;
            cls5 = cls5;
        }
        HashMap map2 = new HashMap();
        map2.put(cls, a63.m101a(Boolean.class).m102b(a63.f83d, "booleanValue", new a63[0]));
        map2.put(cls2, a63.m101a(cls3).m102b(a63.f88i, "intValue", new a63[0]));
        map2.put(cls4, a63.m101a(cls5).m102b(a63.f84e, "byteValue", new a63[0]));
        map2.put(cls6, a63.m101a(Long.class).m102b(a63.f89j, "longValue", new a63[0]));
        map2.put(cls7, a63.m101a(Short.class).m102b(a63.f90k, "shortValue", new a63[0]));
        map2.put(cls8, a63.m101a(Float.class).m102b(a63.f87h, "floatValue", new a63[0]));
        map2.put(cls9, a63.m101a(Double.class).m102b(a63.f86g, "doubleValue", new a63[0]));
        map2.put(cls10, a63.m101a(cls11).m102b(a63.f85f, "charValue", new a63[0]));
        f4262i = map2;
    }

    public i42(Class cls) {
        this.f4263a = cls;
    }

    /* JADX INFO: renamed from: a */
    public static Object m2265a(Object obj, Method method, Object... objArr) throws Throwable {
        try {
            return obj.getClass().getMethod(m2267c(method), method.getParameterTypes()).invoke(obj, objArr);
        } catch (InvocationTargetException e) {
            throw e.getCause();
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m2266b(HashSet hashSet, HashSet hashSet2, Class cls) {
        for (Method method : cls.getDeclaredMethods()) {
            if ((method.getModifiers() & 16) != 0) {
                g42 g42Var = new g42(method);
                hashSet2.add(g42Var);
                hashSet.remove(g42Var);
            } else if ((method.getModifiers() & 8) == 0 && ((Modifier.isPublic(method.getModifiers()) || Modifier.isProtected(method.getModifiers())) && (!method.getName().equals("finalize") || method.getParameterTypes().length != 0))) {
                g42 g42Var2 = new g42(method);
                if (!hashSet2.contains(g42Var2)) {
                    hashSet.add(g42Var2);
                }
            }
        }
        if (cls.isInterface()) {
            for (Class<?> cls2 : cls.getInterfaces()) {
                m2266b(hashSet, hashSet2, cls2);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static String m2267c(Method method) {
        return "super$" + method.getName() + "$" + method.getReturnType().getName().replace('.', '_').replace('[', '_').replace(';', '_');
    }

    /* JADX INFO: renamed from: d */
    public static void m2268d(C0859wt c0859wt, Method method, yb1 yb1Var, yb1 yb1Var2) {
        a63 a63VarM101a = a63.m101a(AbstractMethodError.class);
        a63[] a63VarArr = {a63.f93n};
        a63VarM101a.getClass();
        vg1 vg1Var = new vg1(a63VarM101a, a63.f91l, "<init>", new e63(a63VarArr));
        c0859wt.m5993i(yb1Var, "'" + method + "' cannot be called");
        yb1[] yb1VarArr = {yb1Var};
        if (yb1Var2 == null) {
            throw new IllegalArgumentException();
        }
        c0859wt.m5986a(new j23(cb2.f1310C1, c0859wt.f12633h, s72.f9958j, c0859wt.f12635j, a63VarM101a.f97c), null);
        c0859wt.m5994j(yb1Var2, true);
        String strM5673a = vg1Var.m5673a(true);
        ConcurrentHashMap concurrentHashMap = d42.f1862l;
        d42 d42VarM959b = (d42) concurrentHashMap.get(strM5673a);
        if (d42VarM959b == null) {
            d42VarM959b = d42.m959b(strM5673a);
            d42 d42Var = (d42) concurrentHashMap.putIfAbsent(d42VarM959b.f1863h, d42VarM959b);
            if (d42Var != null) {
                d42VarM959b = d42Var;
            }
        }
        c0859wt.m5991g(new za2(52, d42VarM959b.m961c(), wu2.f12679q), vg1Var, null, yb1Var2, yb1VarArr);
        c0859wt.m5986a(new k23(cb2.f1410h1, c0859wt.f12633h, s72.m4746h(yb1Var2.m6248a()), c0859wt.f12635j), null);
    }
}
