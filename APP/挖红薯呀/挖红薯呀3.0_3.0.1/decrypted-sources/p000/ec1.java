package p000;

import io.github.libxposed.api.XposedInterface;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class ec1 {

    /* JADX INFO: renamed from: a */
    public static final ec1 f1395a = new ec1();

    /* JADX INFO: renamed from: b */
    private static final u60 f1396b = new x51(new us0(25));

    /* JADX INFO: renamed from: c */
    private static final u60 f1397c = new x51(new us0(27));

    /* JADX INFO: renamed from: d */
    private static final u60 f1398d = new x51(new us0(28));

    /* JADX INFO: renamed from: e */
    private static final u60 f1399e = new x51(new us0(29));

    /* JADX INFO: renamed from: f */
    private static final u60 f1400f = new x51(new cc1(0));

    /* JADX INFO: renamed from: g */
    private static final u60 f1401g = new x51(new cc1(1));

    /* JADX INFO: renamed from: h */
    private static final u60 f1402h = new x51(new cc1(2));

    /* JADX INFO: renamed from: i */
    private static final u60 f1403i = new x51(new cc1(3));

    /* JADX INFO: renamed from: j */
    private static final u60 f1404j = new x51(new cc1(4));

    /* JADX INFO: renamed from: k */
    private static final u60 f1405k = new x51(new cc1(5));

    /* JADX INFO: renamed from: l */
    private static final u60 f1406l = new x51(new cc1(6));

    /* JADX INFO: renamed from: m */
    private static final u60 f1407m = new x51(new cc1(7));

    /* JADX INFO: renamed from: n */
    private static final u60 f1408n = new x51(new cc1(8));

    /* JADX INFO: renamed from: o */
    private static final u60 f1409o = new x51(new cc1(9));

    /* JADX INFO: renamed from: p */
    private static final u60 f1410p = new x51(new cc1(10));

    /* JADX INFO: renamed from: q */
    private static final u60 f1411q = new x51(new cc1(11));

    /* JADX INFO: renamed from: r */
    private static final u60 f1412r = new x51(new cc1(12));

    /* JADX INFO: renamed from: s */
    private static final u60 f1413s = new x51(new cc1(13));

    /* JADX INFO: renamed from: t */
    private static final u60 f1414t = new x51(new cc1(14));

    /* JADX INFO: renamed from: u */
    private static final u60 f1415u = new x51(new us0(26));

    /* JADX INFO: renamed from: v */
    public static final int f1416v = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private ec1() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final String m843A() {
        return "P2";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: A0 */
    private final boolean m844A0(List<?> list) {
        String strM920C0;
        try {
            for (Object obj : list) {
                if (obj != null) {
                    List list2 = null;
                    try {
                        Object objM861P = m861P(obj, m884h0(), new Object[0]);
                        if (objM861P instanceof List) {
                            list2 = (List) objM861P;
                        }
                    } catch (Exception unused) {
                    }
                    if (list2 == null) {
                        continue;
                    } else {
                        for (Object obj2 : list2) {
                            if (obj2 != null && (strM920C0 = m920C0(obj2, m870a0())) != null && (m866X().contains(strM920C0) || m919z0(obj2))) {
                                return true;
                            }
                        }
                    }
                }
            }
        } catch (Exception unused2) {
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final String m845B() {
        return "P9";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: B0 */
    private final void m846B0(Object obj) {
        if (obj == null) {
            return;
        }
        String strM920C0 = m920C0(obj, m870a0());
        if (p30.m3002l(strM920C0, "video")) {
            String strM920C02 = m920C0(obj, "id");
            String strM920C03 = m920C0(obj, "title");
            String strM867Y = m867Y(obj);
            if (strM867Y != null) {
                C1021zy c1021zy = C1021zy.f8036a;
                c1021zy.m5620b();
                c1021zy.m5643y(true);
                c1021zy.m5642x(strM867Y, strM920C02, strM920C03);
                lb0.f3404a.m2017e(m876d0(), "scope-capture ok");
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final String m847C() {
        return "Q9";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final String m848D() {
        return "b";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D0 */
    public static final Set m849D0() {
        String[] strArr = {"VideoSpeed", "ClearScreen", "ExitClearScreen", "AutoScroll", "Captions", "MorePlaySetting", "Nice"};
        LinkedHashSet linkedHashSet = new LinkedHashSet(md0.m2495x(7));
        for (int i = 0; i < 7; i++) {
            linkedHashSet.add(strArr[i]);
        }
        return linkedHashSet;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final String m850E() {
        return "e";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final String m851F() {
        return "M";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final String m852G() {
        return "N";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final String m853H() {
        return "a0";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final String m854I() {
        return "c";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final String m855J() {
        return "Y";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final String m856K() {
        return "T";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final String m857L() {
        return "W";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public static final String m858M() {
        return "com.xingin.entities.notedetail.NoteFeed";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public static final String m859N() {
        return "videoV1";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public static final String m860O() {
        return "videoV2";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: P */
    private final Object m861P(Object obj, String str, Object... objArr) {
        try {
            C0822v c0822vM1933s = AbstractC0398kl.m1933s(obj.getClass().getMethods());
            while (c0822vM1933s.hasNext()) {
                Method method = (Method) c0822vM1933s.next();
                if (p30.m3002l(method.getName(), str) && method.getParameterTypes().length == objArr.length) {
                    try {
                        return method.invoke(obj, Arrays.copyOf(objArr, objArr.length));
                    } catch (Exception unused) {
                        continue;
                    }
                }
            }
            return null;
        } catch (Exception unused2) {
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0036, code lost:
    
        return null;
     */
    /* JADX INFO: renamed from: S */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Method m862S(Class<?> cls, String str, int i) {
        while (true) {
            Method method = null;
            if (cls == null || cls.equals(Object.class)) {
                break;
            }
            try {
                Method[] declaredMethods = cls.getDeclaredMethods();
                declaredMethods.getClass();
                int length = declaredMethods.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    }
                    Method method2 = declaredMethods[i2];
                    if (p30.m3002l(method2.getName(), str) && method2.getParameterTypes().length == i) {
                        method = method2;
                        break;
                    }
                    i2++;
                }
            } catch (Throwable unused) {
            }
            if (method != null) {
                return method;
            }
            cls = cls.getSuperclass();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: U */
    private final Object m863U(List<?> list) {
        Object objM864V;
        for (Object obj : list) {
            if (obj != null && (objM864V = m864V(obj, new HashSet<>(), 0)) != null) {
                return objM864V;
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: V */
    private final Object m864V(Object obj, HashSet<Integer> hashSet, int i) {
        Object objM864V;
        Object obj2;
        if (i > 4 || !hashSet.add(Integer.valueOf(System.identityHashCode(obj)))) {
            return null;
        }
        for (Class<?> superclass = obj.getClass(); superclass != null && !superclass.equals(Object.class); superclass = superclass.getSuperclass()) {
            C0822v c0822vM1933s = AbstractC0398kl.m1933s(superclass.getDeclaredFields());
            while (c0822vM1933s.hasNext()) {
                Field field = (Field) c0822vM1933s.next();
                field.setAccessible(true);
                if (field.getType().getName().equals(m902q0()) && (obj2 = field.get(obj)) != null) {
                    return obj2;
                }
                Object obj3 = field.get(obj);
                if (obj3 != null && (obj3 instanceof List)) {
                    for (Object obj4 : (List) obj3) {
                        if (obj4 != null && (objM864V = m864V(obj4, hashSet, i + 1)) != null) {
                            return objM864V;
                        }
                    }
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: W */
    private final List<?> m865W(Object obj) {
        Object objM861P = m861P(obj, m898o0(), new Object[0]);
        if (objM861P != null && (objM861P instanceof List)) {
            return (List) objM861P;
        }
        Object objM861P2 = m861P(obj, m894m0(), new Object[0]);
        if (objM861P2 != null && (objM861P2 instanceof List)) {
            return (List) objM861P2;
        }
        for (Class<?> superclass = obj.getClass(); superclass != null && !superclass.equals(Object.class); superclass = superclass.getSuperclass()) {
            C0822v c0822vM1933s = AbstractC0398kl.m1933s(superclass.getDeclaredMethods());
            while (c0822vM1933s.hasNext()) {
                Method method = (Method) c0822vM1933s.next();
                Class<?>[] parameterTypes = method.getParameterTypes();
                parameterTypes.getClass();
                if (parameterTypes.length == 0 && List.class.isAssignableFrom(method.getReturnType())) {
                    try {
                        Object objInvoke = method.invoke(obj, null);
                        if ((objInvoke instanceof List) && !((Collection) objInvoke).isEmpty()) {
                            Object obj2 = ((List) objInvoke).get(0);
                            obj2.getClass();
                            if (m861P(obj2, m896n0(), new Object[0]) instanceof List) {
                                return (List) objInvoke;
                            }
                            continue;
                        }
                    } catch (Throwable unused) {
                        continue;
                    }
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: X */
    private final Set<String> m866X() {
        return (Set) f1415u.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Y */
    private final String m867Y(Object obj) {
        String strM868Z = m868Z(obj);
        if (strM868Z != null) {
            return strM868Z;
        }
        try {
            Field fieldM923T = m923T(obj.getClass(), m904r0());
            Object obj2 = fieldM923T != null ? fieldM923T.get(obj) : null;
            if (obj2 != null) {
                Object objM861P = m861P(obj2, m890k0(), new Object[0]);
                String str = objM861P instanceof String ? (String) objM861P : null;
                if (str != null && str.length() != 0 && r41.m3382S(str, "http", false)) {
                    return str;
                }
                Object objM861P2 = m861P(obj2, m900p0(), new Object[0]);
                String str2 = objM861P2 instanceof String ? (String) objM861P2 : null;
                if (str2 != null && str2.length() != 0 && r41.m3382S(str2, "http", false)) {
                    return str2;
                }
                Object objM861P3 = m861P(obj2, m888j0(), new Object[0]);
                String str3 = objM861P3 instanceof String ? (String) objM861P3 : null;
                if (str3 != null && str3.length() != 0 && r41.m3382S(str3, "http", false)) {
                    return str3;
                }
                Object objM861P4 = m861P(obj2, m892l0(), new Object[0]);
                String str4 = objM861P4 instanceof String ? (String) objM861P4 : null;
                if (str4 != null && str4.length() != 0) {
                    if (r41.m3382S(str4, "http", false)) {
                        return str4;
                    }
                }
            }
        } catch (Exception unused) {
        }
        try {
            Field fieldM923T2 = m923T(obj.getClass(), m906s0());
            Object obj3 = fieldM923T2 != null ? fieldM923T2.get(obj) : null;
            if (obj3 != null) {
                Object objM861P5 = m861P(obj3, m884h0(), null);
                if (objM861P5 == null) {
                    objM861P5 = m861P(obj3, m886i0(), new Object[0]);
                }
                if (objM861P5 != null) {
                    Object objM861P6 = m861P(objM861P5, m890k0(), new Object[0]);
                    String str5 = objM861P6 instanceof String ? (String) objM861P6 : null;
                    if (str5 != null && str5.length() != 0 && r41.m3382S(str5, "http", false)) {
                        return str5;
                    }
                    Object objM861P7 = m861P(objM861P5, m900p0(), new Object[0]);
                    String str6 = objM861P7 instanceof String ? (String) objM861P7 : null;
                    if (str6 != null && str6.length() != 0 && r41.m3382S(str6, "http", false)) {
                        return str6;
                    }
                    Object objM861P8 = m861P(objM861P5, m888j0(), new Object[0]);
                    String str7 = objM861P8 instanceof String ? (String) objM861P8 : null;
                    if (str7 != null && str7.length() != 0 && r41.m3382S(str7, "http", false)) {
                        return str7;
                    }
                    Object objM861P9 = m861P(objM861P5, m892l0(), new Object[0]);
                    String str8 = objM861P9 instanceof String ? (String) objM861P9 : null;
                    if (str8 != null && str8.length() != 0) {
                        if (r41.m3382S(str8, "http", false)) {
                            return str8;
                        }
                    }
                }
            }
        } catch (Exception unused2) {
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Z */
    private final String m868Z(Object obj) {
        Object obj2;
        Object objM861P;
        List<?> listM865W;
        try {
            Field fieldM923T = m923T(obj.getClass(), m906s0());
            if (fieldM923T != null && (obj2 = fieldM923T.get(obj)) != null && (objM861P = m861P(obj2, m884h0(), null)) != null && (listM865W = m865W(objM861P)) != null) {
                for (Object obj3 : listM865W) {
                    if (obj3 != null) {
                        Object objM861P2 = m861P(obj3, m896n0(), new Object[0]);
                        List list = objM861P2 instanceof List ? (List) objM861P2 : null;
                        if (list != null) {
                            Object objM5241K = AbstractC0960ye.m5241K(list);
                            String str = objM5241K instanceof String ? (String) objM5241K : null;
                            if (str != null && str.length() != 0 && r41.m3382S(str, "http", false)) {
                                return str;
                            }
                        }
                    }
                }
            }
        } catch (Exception unused) {
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a0 */
    private final String m870a0() {
        return (String) f1409o.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b0 */
    private final String m872b0() {
        return (String) f1410p.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c0 */
    private final String m874c0() {
        return (String) f1411q.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d0 */
    private final String m876d0() {
        return (String) f1397c.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e0 */
    private final String m878e0() {
        return (String) f1400f.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f0 */
    private final String m880f0() {
        return (String) f1399e.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g0 */
    private final String m882g0() {
        return (String) f1398d.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h0 */
    private final String m884h0() {
        return (String) f1401g.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i0 */
    private final String m886i0() {
        return (String) f1402h.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j0 */
    private final String m888j0() {
        return (String) f1405k.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k0 */
    private final String m890k0() {
        return (String) f1403i.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l0 */
    private final String m892l0() {
        return (String) f1406l.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m0 */
    private final String m894m0() {
        return (String) f1413s.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n0 */
    private final String m896n0() {
        return (String) f1414t.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o0 */
    private final String m898o0() {
        return (String) f1412r.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p0 */
    private final String m900p0() {
        return (String) f1404j.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q0 */
    private final String m902q0() {
        return (String) f1396b.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r0 */
    private final String m904r0() {
        return (String) f1407m.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s0 */
    private final String m906s0() {
        return (String) f1408n.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u0 */
    private final void m909u0(Class<?> cls) {
        XposedInterface.HookBuilder hookBuilderHook;
        try {
            Method declaredMethod = cls.getDeclaredMethod(m884h0(), List.class);
            kf1 kf1VarM1887b = kf1.f3100G.m1887b();
            if (kf1VarM1887b != null && (hookBuilderHook = kf1VarM1887b.hook(declaredMethod)) != null) {
                hookBuilderHook.intercept(new C0796ua(29));
            }
            lb0.f3404a.m2017e(m876d0(), m874c0() + " done");
        } catch (Throwable unused) {
            lb0.f3404a.m2017e(m876d0(), m874c0() + " miss");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v0 */
    public static final Object m911v0(XposedInterface.Chain chain) {
        C1021zy c1021zy;
        List<?> list;
        chain.getClass();
        try {
            c1021zy = C1021zy.f8036a;
            c1021zy.m5643y(false);
            Object obj = chain.getArgs().get(0);
            list = obj instanceof List ? (List) obj : null;
        } catch (Exception e) {
            lb0 lb0Var = lb0.f3404a;
            ec1 ec1Var = f1395a;
            lb0Var.m2014a(ec1Var.m876d0(), ec1Var.m874c0() + " err: " + e.getMessage());
        }
        if (list == null) {
            return chain.proceed();
        }
        ec1 ec1Var2 = f1395a;
        if (!ec1Var2.m844A0(list)) {
            return chain.proceed();
        }
        lb0.f3404a.m2017e(ec1Var2.m876d0(), ec1Var2.m874c0() + " ok");
        c1021zy.m5643y(true);
        c1021zy.m5620b();
        return chain.proceed();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final String m912w() {
        return "type";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w0 */
    private final void m913w0(Class<?> cls) {
        Method method;
        Method method2;
        try {
            Method[] declaredMethods = cls.getDeclaredMethods();
            declaredMethods.getClass();
            int length = declaredMethods.length;
            int i = 0;
            int i2 = 0;
            while (true) {
                method = null;
                if (i2 >= length) {
                    method2 = null;
                    break;
                }
                method2 = declaredMethods[i2];
                if (p30.m3002l(method2.getName(), f1395a.m882g0()) && method2.getParameterTypes().length == 1) {
                    break;
                } else {
                    i2++;
                }
            }
            if (method2 != null) {
                m915x0(method2, m882g0());
                return;
            }
            Method[] declaredMethods2 = cls.getDeclaredMethods();
            declaredMethods2.getClass();
            int length2 = declaredMethods2.length;
            while (true) {
                if (i >= length2) {
                    break;
                }
                Method method3 = declaredMethods2[i];
                if (p30.m3002l(method3.getName(), f1395a.m880f0()) && method3.getParameterTypes().length == 1) {
                    method = method3;
                    break;
                }
                i++;
            }
            if (method != null) {
                m915x0(method, m880f0());
                return;
            }
            Method methodM862S = m862S(cls, m878e0(), 1);
            if (methodM862S != null) {
                m915x0(methodM862S, m878e0());
                return;
            }
            lb0.f3404a.m2017e(m876d0(), m872b0() + " miss");
        } catch (Throwable unused) {
            lb0.f3404a.m2017e(m876d0(), m872b0() + " miss");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final String m914x() {
        return "D1";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: x0 */
    private final void m915x0(Method method, String str) {
        XposedInterface.HookBuilder hookBuilderHook;
        kf1 kf1VarM1887b = kf1.f3100G.m1887b();
        if (kf1VarM1887b != null && (hookBuilderHook = kf1VarM1887b.hook(method)) != null) {
            hookBuilderHook.intercept(new dc1(0));
        }
        lb0.f3404a.m2017e(m876d0(), m872b0() + " done");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final String m916y() {
        return "D2";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:29:0x0003 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:31:0x00ef */
    /* JADX DEBUG: Multi-variable search result rejected for r11v0, resolved type: io.github.libxposed.api.XposedInterface$Chain */
    /* JADX DEBUG: Multi-variable search result rejected for r11v2, resolved type: io.github.libxposed.api.XposedInterface$Chain */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v4, types: [java.lang.Object] */
    /* JADX INFO: renamed from: y0 */
    public static final Object m917y0(XposedInterface.Chain chain) {
        Class<?> superclass;
        chain.getClass();
        try {
        } catch (Exception e) {
            lb0 lb0Var = lb0.f3404a;
            ec1 ec1Var = f1395a;
            lb0Var.m2014a(ec1Var.m876d0(), ec1Var.m872b0() + " err: " + e.getMessage());
        }
        for (superclass = chain.getThisObject().getClass(); superclass != null && !superclass.equals(Object.class); superclass = superclass.getSuperclass()) {
            C0822v c0822vM1933s = AbstractC0398kl.m1933s(superclass.getDeclaredFields());
            while (c0822vM1933s.hasNext()) {
                Field field = (Field) c0822vM1933s.next();
                String name = field.getType().getName();
                ec1 ec1Var2 = f1395a;
                if (name.equals(ec1Var2.m902q0())) {
                    field.setAccessible(true);
                    Object obj = field.get(chain.getThisObject());
                    if (obj != null) {
                        String strM920C0 = ec1Var2.m920C0(obj, ec1Var2.m870a0());
                        if (p30.m3002l(strM920C0, "video")) {
                            String strM920C02 = ec1Var2.m920C0(obj, "id");
                            String strM920C03 = ec1Var2.m920C0(obj, "title");
                            String strM867Y = ec1Var2.m867Y(obj);
                            if (strM867Y != null) {
                                C1021zy.f8036a.m5642x(strM867Y, strM920C02, strM920C03);
                                lb0.f3404a.m2017e(ec1Var2.m876d0(), ec1Var2.m872b0() + " ok");
                            }
                            chain = chain.proceed();
                            return chain;
                        }
                        return chain.proceed();
                    }
                }
            }
        }
        return chain.proceed();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final String m918z() {
        return "[VH]";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: z0 */
    private final boolean m919z0(Object obj) {
        try {
            for (Class<?> superclass = obj.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                if (superclass.equals(Object.class)) {
                    return false;
                }
                C0822v c0822vM1933s = AbstractC0398kl.m1933s(superclass.getDeclaredFields());
                while (c0822vM1933s.hasNext()) {
                    Field field = (Field) c0822vM1933s.next();
                    field.setAccessible(true);
                    Object obj2 = field.get(obj);
                    if (obj2 != null && !(obj2 instanceof String)) {
                        try {
                            C0822v c0822vM1933s2 = AbstractC0398kl.m1933s(obj2.getClass().getDeclaredFields());
                            while (c0822vM1933s2.hasNext()) {
                                Field field2 = (Field) c0822vM1933s2.next();
                                field2.setAccessible(true);
                                Object obj3 = field2.get(obj2);
                                if (obj3 != null && (obj3 instanceof String)) {
                                    if (r41.m3382S((String) obj3, "video_speed", true) || r41.m3382S((String) obj3, "video_screen", true) || r41.m3382S((String) obj3, "video_auto_scroll", true) || r41.m3382S((String) obj3, "video_caption", true) || r41.m3380Q((String) obj3, "_native_voive", true) || r41.m3382S((String) obj3, "panel_more_play", true)) {
                                        return true;
                                    }
                                }
                            }
                        } catch (Exception unused) {
                            continue;
                        }
                    }
                }
            }
            return false;
        } catch (Exception unused2) {
            return false;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: C0 */
    public final String m920C0(Object obj, String str) {
        obj.getClass();
        str.getClass();
        try {
            Field fieldM923T = m923T(obj.getClass(), str);
            Object obj2 = fieldM923T != null ? fieldM923T.get(obj) : null;
            if (obj2 instanceof String) {
                return (String) obj2;
            }
        } catch (Exception unused) {
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Q */
    public final void m921Q(List<?> list) {
        list.getClass();
        try {
            m846B0(m863U(list));
        } catch (Exception e) {
            AbstractC0748t1.m4161s("menu-capture err: ", e.getMessage(), lb0.f3404a, m876d0());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: R */
    public final void m922R(Object obj) {
        if (obj == null) {
            return;
        }
        try {
            m846B0(obj instanceof List ? m863U((List) obj) : m864V(obj, new HashSet<>(), 0));
        } catch (Exception e) {
            AbstractC0748t1.m4161s("scope-capture err: ", e.getMessage(), lb0.f3404a, m876d0());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: T */
    public final Field m923T(Class<?> cls, String str) {
        cls.getClass();
        str.getClass();
        while (cls != null && !cls.equals(Object.class)) {
            try {
                Field declaredField = cls.getDeclaredField(str);
                declaredField.setAccessible(true);
                return declaredField;
            } catch (NoSuchFieldException unused) {
                cls = cls.getSuperclass();
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t0 */
    public final void m924t0(ClassLoader classLoader, Class<?> cls, Class<?> cls2) {
        classLoader.getClass();
        if (cls != null) {
            f1395a.m913w0(cls);
        }
        if (cls2 != null) {
            f1395a.m909u0(cls2);
        }
    }
}
