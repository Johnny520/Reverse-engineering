package p000a;

import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p000a.C0597gd;

/* JADX INFO: renamed from: a.Cd */
/* JADX INFO: loaded from: classes.dex */
public final class C0052Cd {

    /* JADX INFO: renamed from: a */
    public static final C0052Cd f184a = new C0052Cd();

    /* JADX INFO: renamed from: b */
    public static final LinkedHashMap f185b;

    static {
        C0908x1.m2194b("RuleSystem", "loaded");
        f185b = new LinkedHashMap();
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.Map] */
    /* JADX INFO: renamed from: a */
    public static C0597gd m131a(C0587g3 c0587g3, C0578fd c0578fd) {
        String str;
        Object next;
        Class clsM135g;
        EnumC0540dd enumC0540dd = EnumC0540dd.f1946c;
        C0631i9.m1482e(c0587g3, "rule");
        C0631i9.m1482e(c0578fd, "ctx");
        String str2 = c0587g3.f2184a;
        C0631i9.m1482e(str2, "ruleId");
        ?? r4 = C0475a5.f1753a;
        String str3 = r4 != 0 ? (String) r4.get("rule_class_".concat(str2)) : null;
        ClassLoader classLoader = c0578fd.f2146b;
        if (str3 != null && (clsM135g = m135g(classLoader, str3)) != null) {
            return C0597gd.a.m1428a(clsM135g, EnumC0521cd.f1910c, null, null, 28);
        }
        boolean zM2121H = C0889w1.m2121H();
        EnumC0521cd enumC0521cd = EnumC0521cd.f1909b;
        if (!zM2121H) {
            return new C0597gd(false, null, new C0647j6("DK_NOT_READY", c0587g3.f2184a, "DkBridge not initialized", "", System.currentTimeMillis()), enumC0521cd, EnumC0540dd.f1945b, null, null);
        }
        try {
            List listM2157p = C0889w1.m2157p(C0034Be.m104S(c0587g3.f2185b, "."));
            if (listM2157p.isEmpty()) {
                return new C0597gd(false, null, new C0647j6("DEXKIT_NO_MATCH", c0587g3.f2184a, "no class matched", "", System.currentTimeMillis()), enumC0521cd, enumC0540dd, null, null);
            }
            List<String> list = c0587g3.f2186c;
            if (list.isEmpty()) {
                str = (String) C0834t3.m1949m0(listM2157p);
            } else {
                Iterator it = listM2157p.iterator();
                loop0: while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    f184a.getClass();
                    Class clsM135g2 = m135g(classLoader, (String) next);
                    if (clsM135g2 != null) {
                        Class<?>[] interfaces = clsM135g2.getInterfaces();
                        C0631i9.m1481d(interfaces, "getInterfaces(...)");
                        for (Class<?> cls : interfaces) {
                            if (!list.isEmpty()) {
                                Iterator<T> it2 = list.iterator();
                                while (it2.hasNext()) {
                                    if (C0034Be.m94I(cls.getName(), (String) it2.next(), false)) {
                                        break loop0;
                                    }
                                }
                            }
                        }
                    }
                }
                str = (String) next;
                if (str == null) {
                    str = (String) C0834t3.m1949m0(listM2157p);
                }
            }
            Class clsM135g3 = m135g(classLoader, str);
            if (clsM135g3 == null) {
                return new C0597gd(false, null, new C0647j6("CLASS_LOAD_FAILED", c0587g3.f2184a, C0944z.m2227g("forName(", str, ") failed"), "", System.currentTimeMillis()), enumC0521cd, EnumC0540dd.f1947d, null, null);
            }
            C0475a5.m1159h(str2, str);
            C0908x1.m2194b("RuleSystem", "DEXKIT_PRIMARY rule=" + str2 + " cls=" + str);
            return C0597gd.a.m1428a(clsM135g3, EnumC0521cd.f1908a, null, null, 28);
        } catch (Exception e) {
            C0908x1.m2193a("RuleSystem", "DK_SEARCH_FAILED ".concat(str2), e);
            String message = e.getMessage();
            if (message == null) {
                message = "";
            }
            String str4 = message;
            StringWriter stringWriter = new StringWriter();
            PrintWriter printWriter = new PrintWriter(stringWriter);
            e.printStackTrace(printWriter);
            printWriter.flush();
            String string = stringWriter.toString();
            C0631i9.m1481d(string, "toString(...)");
            return new C0597gd(false, null, new C0647j6("DK_SEARCH_FAILED", c0587g3.f2184a, str4, string, System.currentTimeMillis()), enumC0521cd, enumC0540dd, null, null);
        }
    }

    /* JADX INFO: renamed from: d */
    public static boolean m132d(Class cls) {
        Method[] methods = cls.getMethods();
        C0631i9.m1481d(methods, "getMethods(...)");
        for (Method method : methods) {
            if (C0631i9.m1478a(method.getName(), "k") && method.getParameterTypes().length == 2 && C0631i9.m1478a(method.getParameterTypes()[0], Integer.TYPE) && C0631i9.m1478a(method.getParameterTypes()[1], String.class)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m133e(String str) {
        String strM47F = C0015Ae.m47F(str, '/', '.');
        return strM47F.equals("java.util.ArrayList") || strM47F.endsWith("ArrayList;") || strM47F.endsWith(".ArrayList");
    }

    /* JADX INFO: renamed from: f */
    public static boolean m134f(Class cls) {
        if (ListAdapter.class.isAssignableFrom(cls) || BaseAdapter.class.isAssignableFrom(cls)) {
            return true;
        }
        while (cls != null && !cls.equals(Object.class)) {
            if (cls.getName().equals("android.widget.BaseAdapter") || cls.getName().equals("android.widget.ListAdapter")) {
                return true;
            }
            cls = cls.getSuperclass();
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public static Class m135g(ClassLoader classLoader, String str) {
        try {
            return Class.forName(str, false, classLoader);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: h */
    public static List m136h() {
        List listM2165x;
        C0439Y5 c0439y5 = C0439Y5.f1645a;
        try {
            listM2165x = C0889w1.m2165x("com.tencent.mm.plugin.mvvmlist.MvvmList", "void", C0739o3.m1757d0("java.util.List", "boolean"), null, 8);
        } catch (Exception e) {
            C0908x1.m2193a("RuleSystem", "DK_SEARCH_FAILED F004_contact_list_fields submitReset(JVM)", e);
            listM2165x = c0439y5;
        }
        if (!listM2165x.isEmpty()) {
            return listM2165x;
        }
        try {
            return C0889w1.m2165x("com.tencent.mm.plugin.mvvmlist.MvvmList", "V", C0739o3.m1757d0("Ljava/util/List;", "Z"), null, 8);
        } catch (Exception e2) {
            C0908x1.m2193a("RuleSystem", "DK_SEARCH_FAILED F004_contact_list_fields submitReset(desc)", e2);
            return c0439y5;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x00f1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:108:? A[LOOP:2: B:56:0x009c->B:108:?, LOOP_END, SYNTHETIC] */
    /* JADX INFO: renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C0144Hf m137j(ClassLoader classLoader, List list, List list2, Class cls, Class cls2, Class cls3) {
        C0052Cd c0052Cd;
        Class cls4;
        Class clsM135g;
        Class clsM135g2;
        Iterable iterableM2158q;
        Iterator it = list.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            c0052Cd = f184a;
            cls4 = null;
            if (!zHasNext) {
                clsM135g = null;
                break;
            }
            String str = (String) it.next();
            c0052Cd.getClass();
            clsM135g = m135g(classLoader, str);
            if (clsM135g == null || !m134f(clsM135g)) {
                clsM135g = null;
            }
            if (clsM135g != null) {
                break;
            }
        }
        if (clsM135g == null) {
            if (cls != null) {
                c0052Cd.getClass();
                Class cls5 = m134f(cls) ? cls : null;
                if (cls5 != null) {
                    cls = cls5;
                }
            }
            clsM135g = cls;
        }
        Iterator it2 = list2.iterator();
        while (true) {
            if (!it2.hasNext()) {
                clsM135g2 = null;
                break;
            }
            String str2 = (String) it2.next();
            c0052Cd.getClass();
            clsM135g2 = m135g(classLoader, str2);
            if (clsM135g2 == null || !m132d(clsM135g2)) {
                clsM135g2 = null;
            }
            if (clsM135g2 != null) {
                break;
            }
        }
        if (clsM135g2 == null && cls2 != null && m132d(cls2)) {
            clsM135g2 = cls2;
        }
        if (clsM135g2 != null) {
            cls2 = clsM135g2;
        }
        if (clsM135g != null) {
            String name = clsM135g.getName();
            c0052Cd.getClass();
            String strM106U = C0034Be.m106U(name, name);
            if (strM106U.length() != 0 && !strM106U.equals(name)) {
                try {
                    iterableM2158q = C0889w1.m2158q(strM106U);
                } catch (Exception unused) {
                    iterableM2158q = C0439Y5.f1645a;
                }
                Iterator it3 = iterableM2158q.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    Class clsM135g3 = m135g(classLoader, (String) it3.next());
                    if (clsM135g3 != null) {
                        Method[] declaredMethods = clsM135g3.getDeclaredMethods();
                        C0631i9.m1481d(declaredMethods, "getDeclaredMethods(...)");
                        for (Method method : declaredMethods) {
                            if (method.getParameterTypes().length == 1 && !method.getParameterTypes()[0].isPrimitive() && !C0631i9.m1478a(method.getParameterTypes()[0], String.class) && List.class.isAssignableFrom(method.getParameterTypes()[0])) {
                                break;
                            }
                        }
                        clsM135g3 = null;
                        if (clsM135g3 == null) {
                            cls4 = clsM135g3;
                            break;
                        }
                    } else {
                        clsM135g3 = null;
                        if (clsM135g3 == null) {
                        }
                    }
                }
            }
        }
        if (cls4 == null && cls3 != null) {
            Method[] methods = cls3.getMethods();
            C0631i9.m1481d(methods, "getMethods(...)");
            int length = methods.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                Method method2 = methods[i];
                if (C0631i9.m1478a(method2.getName(), "a") && method2.getParameterTypes().length == 1 && List.class.isAssignableFrom(method2.getParameterTypes()[0])) {
                    cls4 = cls3;
                    break;
                }
                i++;
            }
        }
        if (cls4 != null) {
            cls3 = cls4;
        }
        return new C0144Hf(clsM135g, cls2, cls3);
    }

    /* JADX INFO: renamed from: k */
    public static boolean m138k(Class cls, String str) {
        if (str.length() != 0) {
            if (str.equals("void")) {
                return C0631i9.m1478a(cls, Void.TYPE);
            }
            Map mapM1229E = C0499ba.m1229E(new C0710mc("I", "int"), new C0710mc("Z", "boolean"), new C0710mc("J", "long"), new C0710mc("D", "double"), new C0710mc("F", "float"), new C0710mc("B", "byte"), new C0710mc("C", "char"), new C0710mc("S", "short"));
            String strM104S = C0034Be.m104S(str, "[");
            if (strM104S.endsWith(";")) {
                strM104S = strM104S.substring(0, strM104S.length() - 1);
                C0631i9.m1481d(strM104S, "substring(...)");
            }
            String strM105T = C0034Be.m105T(strM104S, '/');
            String str2 = (String) mapM1229E.get(strM105T);
            if (str2 != null) {
                strM105T = str2;
            }
            boolean z = C0015Ae.m49H(str, "[", false) == cls.isArray();
            if (cls.isArray()) {
                cls = cls.getComponentType();
            }
            String strM105T2 = C0034Be.m105T(cls.getName(), '.');
            if (!z || !strM105T.equals(strM105T2)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public final C0597gd m139b(C0785qb c0785qb, C0578fd c0578fd) {
        Class<?> cls;
        InterfaceC0286Pd c0220m1;
        List<String> list;
        String str;
        Object next;
        int i = 1;
        C0631i9.m1482e(c0578fd, "ctx");
        String str2 = c0785qb.f3101e;
        InterfaceC0711md interfaceC0711mdM140c = m140c(str2);
        C0587g3 c0587g3 = interfaceC0711mdM140c instanceof C0587g3 ? (C0587g3) interfaceC0711mdM140c : null;
        EnumC0521cd enumC0521cd = EnumC0521cd.f1909b;
        EnumC0540dd enumC0540dd = EnumC0540dd.f1946c;
        if (c0587g3 == null) {
            return new C0597gd(false, null, new C0647j6("NO_CLASS_RULE", c0785qb.f3097a, C0944z.m2227g("declaredClassRuleId=", str2, " not registered"), "", System.currentTimeMillis()), enumC0521cd, enumC0540dd, null, null);
        }
        C0597gd c0597gdM131a = m131a(c0587g3, c0578fd);
        if (!c0597gdM131a.f2208a || (cls = c0597gdM131a.f2209b) == null) {
            return new C0597gd(false, null, new C0647j6("CLASS_UNRESOLVED", c0785qb.f3097a, C0944z.m2228h(new StringBuilder("declared class "), c0587g3.f2185b, " unresolved"), "", System.currentTimeMillis()), enumC0521cd, enumC0540dd, null, null);
        }
        if (c0785qb.f3103g) {
            C0351T7 c0351t7 = new C0351T7(new C0004A3(6, cls), new C0673kd(1));
            C0673kd c0673kd = new C0673kd(2);
            C0357Td c0357Td = C0357Td.f1352i;
            c0220m1 = new C0045C6(c0351t7, c0673kd);
        } else {
            Method[] declaredMethods = cls.getDeclaredMethods();
            C0631i9.m1481d(declaredMethods, "getDeclaredMethods(...)");
            c0220m1 = declaredMethods.length == 0 ? C0476a6.f1788a : new C0220M1(0, declaredMethods);
        }
        Iterator it = c0220m1.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            list = c0785qb.f3099c;
            str = c0785qb.f3098b;
            if (!zHasNext) {
                next = null;
                break;
            }
            next = it.next();
            Method method = (Method) next;
            Class<?> returnType = method.getReturnType();
            C0631i9.m1481d(returnType, "getReturnType(...)");
            f184a.getClass();
            if (m138k(returnType, str)) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                C0631i9.m1481d(parameterTypes, "getParameterTypes(...)");
                if (list.size() != parameterTypes.length) {
                    continue;
                } else {
                    Iterable c0574f9 = new C0574f9(0, list.size() - i, i);
                    if (!(c0574f9 instanceof Collection) || !((Collection) c0574f9).isEmpty()) {
                        Iterator<Integer> it2 = c0574f9.iterator();
                        while (((C0555e9) it2).f2095c) {
                            int iMo1278a = ((AbstractC0517c9) it2).mo1278a();
                            if (!m138k(parameterTypes[iMo1278a], list.get(iMo1278a))) {
                                break;
                            }
                        }
                    }
                    String str3 = c0785qb.f3100d;
                    if (str3.length() == 0) {
                        break;
                    }
                    String name = method.getName();
                    C0631i9.m1481d(name, "getName(...)");
                    if (C0034Be.m94I(name, str3, false)) {
                        break;
                    }
                }
            }
            i = 1;
        }
        Method method2 = (Method) next;
        if (method2 == null) {
            StringBuilder sbM2229i = C0944z.m2229i("no method in ", cls.getName(), " matches returnType=", str, " params=");
            sbM2229i.append(list);
            return new C0597gd(false, null, new C0647j6("METHOD_NOT_FOUND", c0785qb.f3097a, sbM2229i.toString(), "", System.currentTimeMillis()), enumC0521cd, enumC0540dd, null, null);
        }
        String name2 = cls.getName();
        String name3 = method2.getName();
        Class<?>[] parameterTypes2 = method2.getParameterTypes();
        C0631i9.m1481d(parameterTypes2, "getParameterTypes(...)");
        C0908x1.m2194b("RuleSystem", "METHOD_RESOLVED rule=" + c0785qb.f3097a + " class=" + name2 + " method=" + name3 + "(" + C0238N1.m631e0(parameterTypes2, null, new C0673kd(3), 31) + ")");
        return C0597gd.a.m1428a(cls, EnumC0521cd.f1908a, method2, null, 20);
    }

    /* JADX INFO: renamed from: c */
    public final synchronized InterfaceC0711md m140c(String str) {
        C0631i9.m1482e(str, "ruleId");
        return (InterfaceC0711md) f185b.get(str);
    }

    /* JADX INFO: renamed from: i */
    public final synchronized void m141i(InterfaceC0711md interfaceC0711md) {
        C0631i9.m1482e(interfaceC0711md, "rule");
        C0908x1.m2194b("RuleSystem", "register() called ruleId=" + interfaceC0711md.mo1424a());
        f185b.put(interfaceC0711md.mo1424a(), interfaceC0711md);
        C0908x1.m2194b("RuleSystem", "REGISTER ruleId=" + interfaceC0711md.mo1424a() + " type=" + interfaceC0711md.getClass().getSimpleName());
    }
}
