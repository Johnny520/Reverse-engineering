package defpackage;

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
    public static final Map f = Collections.synchronizedMap(new HashMap());
    public static final HashMap g;
    public static final HashMap h;
    public static final HashMap i;
    public final Class a;
    public File c;
    public ClassLoader b = i42.class.getClassLoader();
    public final Object[] d = new Object[0];
    public final ArrayList e = new ArrayList();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        HashMap map = new HashMap();
        g = map;
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
        h = new HashMap();
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Iterator it2 = it;
            a63 a63VarA = a63.a((Class) entry.getKey());
            Class<Character> cls12 = cls11;
            a63 a63VarA2 = a63.a((Class) entry.getValue());
            h.put(a63VarA, a63VarA2.b(a63VarA2, "valueOf", a63VarA));
            cls3 = cls3;
            cls11 = cls12;
            it = it2;
            cls5 = cls5;
        }
        HashMap map2 = new HashMap();
        map2.put(cls, a63.a(Boolean.class).b(a63.d, "booleanValue", new a63[0]));
        map2.put(cls2, a63.a(cls3).b(a63.i, "intValue", new a63[0]));
        map2.put(cls4, a63.a(cls5).b(a63.e, "byteValue", new a63[0]));
        map2.put(cls6, a63.a(Long.class).b(a63.j, "longValue", new a63[0]));
        map2.put(cls7, a63.a(Short.class).b(a63.k, "shortValue", new a63[0]));
        map2.put(cls8, a63.a(Float.class).b(a63.h, "floatValue", new a63[0]));
        map2.put(cls9, a63.a(Double.class).b(a63.g, "doubleValue", new a63[0]));
        map2.put(cls10, a63.a(cls11).b(a63.f, "charValue", new a63[0]));
        i = map2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public i42(Class cls) {
        this.a = cls;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Object a(Object obj, Method method, Object... objArr) throws Throwable {
        try {
            return obj.getClass().getMethod(c(method), method.getParameterTypes()).invoke(obj, objArr);
        } catch (InvocationTargetException e) {
            throw e.getCause();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void b(HashSet hashSet, HashSet hashSet2, Class cls) {
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
                b(hashSet, hashSet2, cls2);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String c(Method method) {
        return "super$" + method.getName() + "$" + method.getReturnType().getName().replace('.', '_').replace('[', '_').replace(';', '_');
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void d(wt wtVar, Method method, yb1 yb1Var, yb1 yb1Var2) {
        a63 a63VarA = a63.a(AbstractMethodError.class);
        a63[] a63VarArr = {a63.n};
        a63VarA.getClass();
        vg1 vg1Var = new vg1(a63VarA, a63.l, "<init>", new e63(a63VarArr));
        wtVar.i(yb1Var, "'" + method + "' cannot be called");
        yb1[] yb1VarArr = {yb1Var};
        if (yb1Var2 == null) {
            throw new IllegalArgumentException();
        }
        wtVar.a(new j23(cb2.C1, wtVar.h, s72.j, wtVar.j, a63VarA.c), null);
        wtVar.j(yb1Var2, true);
        String strA = vg1Var.a(true);
        ConcurrentHashMap concurrentHashMap = d42.l;
        d42 d42VarB = (d42) concurrentHashMap.get(strA);
        if (d42VarB == null) {
            d42VarB = d42.b(strA);
            d42 d42Var = (d42) concurrentHashMap.putIfAbsent(d42VarB.h, d42VarB);
            if (d42Var != null) {
                d42VarB = d42Var;
            }
        }
        wtVar.g(new za2(52, d42VarB.c(), wu2.q), vg1Var, null, yb1Var2, yb1VarArr);
        wtVar.a(new k23(cb2.h1, wtVar.h, s72.h(yb1Var2.a()), wtVar.j), null);
    }
}
