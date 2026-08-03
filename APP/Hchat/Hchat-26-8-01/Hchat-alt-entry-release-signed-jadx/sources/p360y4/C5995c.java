package p360y4;

import bsh.org.objectweb.asm.Opcodes;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.jar.JarEntry;
import java.util.jar.JarOutputStream;
import p014b.C0126e;
import p068eh.AbstractC0921a;
import p071f1.C1005h;
import p089g1.C1275d;
import p092g4.AbstractC1341a;
import p092g4.C1342b;
import p092g4.C1343c;
import p092g4.C1344d;
import p092g4.C1345e;
import p092g4.C1346f;
import p092g4.C1347g;
import p092g4.C1348h;
import p092g4.C1349i;
import p092g4.C1350j;
import p092g4.C1351k;
import p104h4.C1607u;
import p136j8.C2104o;
import p192n4.C2893a;
import p222p.AbstractC3199a;
import p227p4.C3320y;
import p242q8.C3447b;
import p255r4.C3679k;
import p255r4.C3683m;
import p255r4.C3689p;
import p255r4.C3693r;
import p255r4.C3697t;
import p295u4.AbstractC4259i;
import p295u4.AbstractC4269s;
import p295u4.C4252b;
import p295u4.C4253c;
import p295u4.C4263m;
import p295u4.C4265o;
import p295u4.C4266p;
import p295u4.C4268r;
import p295u4.C4270t;
import p295u4.C4271u;
import p295u4.C4272v;
import p311v4.C4451c0;
import p311v4.C4453d0;
import p311v4.C4464m;
import p311v4.C4469r;
import p311v4.C4476y;
import p311v4.C4477z;
import p326w4.C4681a;
import p326w4.C4682b;
import p326w4.C4683c;
import p376z4.C6093g;

/* JADX INFO: renamed from: y4.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5995c {

    /* JADX INFO: renamed from: f */
    public static final Map f24350f = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: g */
    public static final HashMap f24351g;

    /* JADX INFO: renamed from: h */
    public static final HashMap f24352h;

    /* JADX INFO: renamed from: i */
    public static final HashMap f24353i;

    /* JADX INFO: renamed from: a */
    public final Class f24354a;

    /* JADX INFO: renamed from: c */
    public File f24356c;

    /* JADX INFO: renamed from: b */
    public ClassLoader f24355b = C5995c.class.getClassLoader();

    /* JADX INFO: renamed from: d */
    public final Object[] f24357d = new Object[0];

    /* JADX INFO: renamed from: e */
    public final ArrayList f24358e = new ArrayList();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        HashMap map = new HashMap();
        f24351g = map;
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
        f24352h = new HashMap();
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Iterator it2 = it;
            C1350j c1350jM3626a = C1350j.m3626a((Class) entry.getKey());
            Class<Character> cls12 = cls11;
            C1350j c1350jM3626a2 = C1350j.m3626a((Class) entry.getValue());
            f24352h.put(c1350jM3626a, c1350jM3626a2.m3627b(c1350jM3626a2, "valueOf", c1350jM3626a));
            cls3 = cls3;
            cls11 = cls12;
            it = it2;
            cls5 = cls5;
        }
        HashMap map2 = new HashMap();
        map2.put(cls, C1350j.m3626a(Boolean.class).m3627b(C1350j.f4467d, "booleanValue", new C1350j[0]));
        map2.put(cls2, C1350j.m3626a(cls3).m3627b(C1350j.f4472i, "intValue", new C1350j[0]));
        map2.put(cls4, C1350j.m3626a(cls5).m3627b(C1350j.f4468e, "byteValue", new C1350j[0]));
        map2.put(cls6, C1350j.m3626a(Long.class).m3627b(C1350j.f4473j, "longValue", new C1350j[0]));
        map2.put(cls7, C1350j.m3626a(Short.class).m3627b(C1350j.f4474k, "shortValue", new C1350j[0]));
        map2.put(cls8, C1350j.m3626a(Float.class).m3627b(C1350j.f4471h, "floatValue", new C1350j[0]));
        map2.put(cls9, C1350j.m3626a(Double.class).m3627b(C1350j.f4470g, "doubleValue", new C1350j[0]));
        map2.put(cls10, C1350j.m3626a(cls11).m3627b(C1350j.f4469f, "charValue", new C1350j[0]));
        f24353i = map2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5995c(Class cls) {
        this.f24354a = cls;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static Object m10731b(Object obj, Method method, Object... objArr) throws Throwable {
        try {
            return obj.getClass().getMethod(m10734e(method), method.getParameterTypes()).invoke(obj, objArr);
        } catch (InvocationTargetException e6) {
            throw e6.getCause();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static void m10732c(HashSet hashSet, HashSet hashSet2, Class cls) {
        for (Method method : cls.getDeclaredMethods()) {
            if ((method.getModifiers() & 16) != 0) {
                C5993a c5993a = new C5993a(method);
                hashSet2.add(c5993a);
                hashSet.remove(c5993a);
            } else if ((method.getModifiers() & 8) == 0 && ((Modifier.isPublic(method.getModifiers()) || Modifier.isProtected(method.getModifiers())) && (!method.getName().equals("finalize") || method.getParameterTypes().length != 0))) {
                C5993a c5993a2 = new C5993a(method);
                if (!hashSet2.contains(c5993a2)) {
                    hashSet.add(c5993a2);
                }
            }
        }
        if (cls.isInterface()) {
            for (Class<?> cls2 : cls.getInterfaces()) {
                m10732c(hashSet, hashSet2, cls2);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static void m10733d(Object obj, C3447b c3447b) {
        try {
            Field declaredField = obj.getClass().getDeclaredField("$__handler");
            declaredField.setAccessible(true);
            declaredField.set(obj, c3447b);
        } catch (IllegalAccessException e6) {
            C2104o.m5281f(e6);
        } catch (NoSuchFieldException e7) {
            throw new IllegalArgumentException("Not a valid proxy instance", e7);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static String m10734e(Method method) {
        return "super$" + method.getName() + "$" + method.getReturnType().getName().replace('.', '_').replace('[', '_').replace(';', '_');
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static void m10735f(C1342b c1342b, Method method, C1348h c1348h, C1348h c1348h2) {
        C1350j c1350jM3626a = C1350j.m3626a(AbstractMethodError.class);
        C1350j[] c1350jArr = {C1350j.f4477n};
        c1350jM3626a.getClass();
        C1349i c1349i = new C1349i(c1350jM3626a, C1350j.f4475l, "<init>", new C1351k(c1350jArr));
        c1342b.m3619i(c1348h, "'" + method + "' cannot be called");
        C1348h[] c1348hArr = {c1348h};
        if (c1348h2 == null) {
            C2104o.m5289o();
            return;
        }
        c1342b.m3612a(new C4272v(AbstractC4269s.f14072Y1, c1342b.f4431h, C4266p.f13968i, c1342b.f4433j, c1350jM3626a.f4481c), null);
        c1342b.m3620j(c1348h2, true);
        c1342b.m3617g(new C4268r(52, C4681a.m9174d(c1349i.m3625a(true)).m9176c(), C4682b.f15598p), c1349i, null, c1348h2, c1348hArr);
        c1342b.m3612a(new C4271u(AbstractC4269s.f13992D1, c1342b.f4431h, C4266p.m8567p(c1348h2.m3624a()), c1342b.f4433j), null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v22, resolved type: java.lang.Class */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:145:0x06eb  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0705  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Class m10736a() throws IOException {
        Iterator it;
        JarOutputStream jarOutputStream;
        ClassLoader classLoaderM642t;
        ClassLoader classLoader;
        String str;
        File file;
        Iterator it2;
        ClassLoader classLoader2;
        String str2;
        Iterator it3;
        File file2;
        LinkedHashMap linkedHashMap;
        C3697t c3697t;
        int i9;
        String str3;
        ClassLoader classLoader3;
        File[] fileArrM3606v;
        C1348h c1348hM3621k;
        C1348h c1348hM3621k2;
        C1350j c1350j;
        Class<?>[] clsArr;
        C1350j c1350j2;
        C1349i c1349i;
        C1348h c1348h;
        C1348h[] c1348hArr;
        Method method;
        C1348h c1348h2;
        C1342b c1342b;
        int i10;
        Class<Method[]> cls;
        Constructor<?>[] constructorArr;
        int i11;
        ClassLoader classLoader4 = this.f24355b;
        Class cls2 = this.f24354a;
        ArrayList arrayList = this.f24358e;
        C5994b c5994b = new C5994b(cls2, arrayList, classLoader4);
        Map map = f24350f;
        Class cls3 = (Class) map.get(c5994b);
        if (cls3 != null) {
            return cls3;
        }
        C0126e c0126e = new C0126e(7);
        String hexString = Integer.toHexString(arrayList.hashCode());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(cls2.getName().replace(".", "/"));
        sb2.append("_");
        String strM2255r = AbstractC0921a.m2255r(sb2, hexString, "_Proxy");
        String strM2251n = AbstractC0921a.m2251n("L", strM2255r, ";");
        C1350j c1350j3 = new C1350j(strM2251n, C4683c.m9184o(strM2251n));
        C1350j c1350jM3626a = C1350j.m3626a(cls2);
        Class<InvocationHandler> cls4 = InvocationHandler.class;
        C1350j c1350jM3626a2 = C1350j.m3626a(cls4);
        Class<Method[]> cls5 = Method[].class;
        C1350j c1350jM3626a3 = C1350j.m3626a(cls5);
        c0126e.m638p(new C1346f(c1350j3, c1350jM3626a2, "$__handler"), 2);
        String str4 = "$__methodArray";
        c0126e.m638p(new C1346f(c1350j3, c1350jM3626a3, "$__methodArray"), 10);
        Constructor<?>[] declaredConstructors = cls2.getDeclaredConstructors();
        int length = declaredConstructors.length;
        int i12 = 0;
        while (true) {
            ArrayList arrayList2 = arrayList;
            C1348h c1348h3 = null;
            if (i12 >= length) {
                Class<InvocationHandler> cls6 = cls4;
                Class<Method[]> cls7 = cls5;
                HashSet hashSet = new HashSet();
                HashSet hashSet2 = new HashSet();
                for (Class superclass = cls2; superclass != null; superclass = superclass.getSuperclass()) {
                    m10732c(hashSet, hashSet2, superclass);
                }
                Class superclass2 = cls2;
                while (superclass2 != null) {
                    Class<?>[] interfaces = superclass2.getInterfaces();
                    int length2 = interfaces.length;
                    int i13 = 0;
                    while (i13 < length2) {
                        m10732c(hashSet, hashSet2, interfaces[i13]);
                        i13++;
                        superclass2 = superclass2;
                    }
                    superclass2 = superclass2.getSuperclass();
                }
                Iterator it4 = arrayList2.iterator();
                while (it4.hasNext()) {
                    m10732c(hashSet, hashSet2, (Class) it4.next());
                }
                int size = hashSet.size();
                Method[] methodArr = new Method[size];
                Iterator it5 = hashSet.iterator();
                int i14 = 0;
                while (it5.hasNext()) {
                    methodArr[i14] = ((C5993a) it5.next()).f24346d;
                    i14++;
                }
                Arrays.sort(methodArr, new C3683m(4));
                C1350j c1350jM3626a4 = C1350j.m3626a(cls6);
                C1350j c1350jM3626a5 = C1350j.m3626a(cls7);
                c1350jM3626a4.getClass();
                C4477z c4477z = new C4477z(new C4451c0("$__handler"), new C4451c0(c1350jM3626a4.f4479a));
                C4453d0 c4453d0 = c1350j3.f4481c;
                C4464m c4464m = new C4464m(c4453d0, c4477z);
                c1350jM3626a5.getClass();
                C4464m c4464m2 = new C4464m(c4453d0, new C4477z(new C4451c0("$__methodArray"), new C4451c0(c1350jM3626a5.f4479a)));
                C1350j c1350jM3626a6 = C1350j.m3626a(Method.class);
                C1350j c1350jM3626a7 = C1350j.m3626a(Object[].class);
                C1350j c1350j4 = C1350j.f4476m;
                C1349i c1349iM3627b = c1350jM3626a4.m3627b(c1350j4, "invoke", c1350j4, c1350jM3626a6, c1350jM3626a7);
                int i15 = 0;
                while (i15 < size) {
                    Method method2 = methodArr[i15];
                    int i16 = size;
                    String name = method2.getName();
                    int i17 = i15;
                    Class<?>[] parameterTypes = method2.getParameterTypes();
                    C5994b c5994b2 = c5994b;
                    int length3 = parameterTypes.length;
                    Method[] methodArr2 = methodArr;
                    C1350j[] c1350jArr = new C1350j[length3];
                    String str5 = str4;
                    for (int i18 = 0; i18 < length3; i18++) {
                        c1350jArr[i18] = C1350j.m3626a(parameterTypes[i18]);
                    }
                    Class<?> returnType = method2.getReturnType();
                    C1350j c1350jM3626a8 = C1350j.m3626a(returnType);
                    String str6 = strM2255r;
                    C1349i c1349iM3627b2 = c1350j3.m3627b(c1350jM3626a8, name, c1350jArr);
                    C1350j c1350jM3626a9 = C1350j.m3626a(AbstractMethodError.class);
                    C1342b c1342bM637o = c0126e.m637o(c1349iM3627b2);
                    C0126e c0126e2 = c0126e;
                    C1348h c1348h4 = c1342bM637o.f4428e;
                    if (c1348h4 == null) {
                        Class cls8 = c1348h3;
                        C2104o.m5276A("static methods cannot access 'this'");
                        return cls8;
                    }
                    C1342b.m3611d(c1348h4, c1350j3);
                    C1350j c1350j5 = c1350j3;
                    C4682b c4682b = c1342bM637o.f4433j;
                    C1349i c1349i2 = c1349iM3627b;
                    C4270t c4270t = c1342bM637o.f4431h;
                    C1348h c1348hM3621k3 = c1342bM637o.m3621k(c1350jM3626a4);
                    int i19 = length3;
                    C1350j c1350j6 = c1348hM3621k3.f4459b;
                    C1350j c1350j7 = C1350j.f4476m;
                    C1348h c1348hM3621k4 = c1342bM637o.m3621k(c1350j7);
                    C1350j c1350j8 = C1350j.f4472i;
                    C1348h c1348hM3621k5 = c1342bM637o.m3621k(c1350j8);
                    C1348h c1348hM3621k6 = c1342bM637o.m3621k(c1350jM3626a7);
                    C1350j c1350j9 = c1350jM3626a7;
                    C1350j c1350j10 = c1348hM3621k6.f4459b;
                    C1348h c1348hM3621k7 = c1342bM637o.m3621k(c1350j8);
                    C1348h c1348hM3621k8 = c1342bM637o.m3621k(c1350j7);
                    C1348h c1348hM3621k9 = c1342bM637o.m3621k(c1350jM3626a8);
                    C1348h c1348hM3621k10 = c1342bM637o.m3621k(c1350jM3626a5);
                    C1350j c1350j11 = c1350jM3626a5;
                    C1348h c1348hM3621k11 = c1342bM637o.m3621k(c1350jM3626a6);
                    C1348h c1348hM3621k12 = c1342bM637o.m3621k(c1350j8);
                    C1350j c1350j12 = c1350jM3626a6;
                    Class cls9 = (Class) f24351g.get(returnType);
                    C1348h c1348hM3621k13 = cls9 != null ? c1342bM637o.m3621k(C1350j.m3626a(cls9)) : c1348h3;
                    C1348h c1348hM3621k14 = c1342bM637o.m3621k(c1350jM3626a4);
                    C1350j c1350j13 = c1350jM3626a4;
                    if ((method2.getModifiers() & 1024) == 0) {
                        C1348h[] c1348hArr2 = new C1348h[parameterTypes.length];
                        C1348h c1348hM3621k15 = c1342bM637o.m3621k(c1350jM3626a8);
                        C1349i c1349iM3627b3 = c1350jM3626a.m3627b(c1350jM3626a8, name, c1350jArr);
                        c1350j = c1350jM3626a;
                        clsArr = parameterTypes;
                        c1350j2 = c1350jM3626a9;
                        c1348h = c1348hM3621k15;
                        c1348hArr = c1348hArr2;
                        c1349i = c1349iM3627b3;
                        c1348hM3621k = c1348h3;
                        c1348hM3621k2 = c1348hM3621k;
                    } else {
                        c1348hM3621k = c1342bM637o.m3621k(C1350j.f4477n);
                        c1348hM3621k2 = c1342bM637o.m3621k(c1350jM3626a9);
                        c1350j = c1350jM3626a;
                        clsArr = parameterTypes;
                        c1350j2 = c1350jM3626a9;
                        C1348h c1348h5 = c1348h3;
                        C1348h c1348h6 = c1348h5;
                        c1349i = c1348h6;
                        c1348hArr = c1348h5;
                        c1348h = c1348h6;
                    }
                    c1342bM637o.m3619i(c1348hM3621k12, Integer.valueOf(i17));
                    c1342bM637o.m3612a(new C4272v(AbstractC4269s.m8581f(c1348hM3621k10.f4459b.f4480b), c1342bM637o.f4431h, C4266p.f13968i, c1342bM637o.f4433j, c4464m2), c1348h3);
                    c1342bM637o.m3620j(c1348hM3621k10, true);
                    c1342bM637o.m3612a(new C4271u(AbstractC4269s.m8576a(c1348hM3621k11.f4459b.f4480b), c4270t, C4266p.m8568q(c1348hM3621k10.m3624a(), c1348hM3621k12.m3624a()), c4682b), null);
                    c1342bM637o.m3620j(c1348hM3621k11, true);
                    c1342bM637o.m3619i(c1348hM3621k7, Integer.valueOf(i19));
                    c1342bM637o.m3612a(new C4272v(AbstractC4269s.m8586k(c1350j10.f4480b), c1342bM637o.f4431h, C4266p.m8567p(c1348hM3621k7.m3624a()), c1342bM637o.f4433j, c1350j10.f4481c), null);
                    c1342bM637o.m3620j(c1348hM3621k6, true);
                    c1342bM637o.m3612a(new C4272v(AbstractC4269s.m8580e(c1350j6.f4480b), c1342bM637o.f4431h, C4266p.m8567p(c1348h4.m3624a()), c1342bM637o.f4433j, c4464m), null);
                    c1342bM637o.m3620j(c1348hM3621k3, true);
                    c1342bM637o.m3619i(c1348hM3621k14, null);
                    C1347g c1347g = new C1347g();
                    c1342bM637o.m3613b(c1347g);
                    C1348h c1348h7 = c1348hM3621k;
                    c1342bM637o.m3612a(new C4263m(AbstractC4269s.m8589n(C4682b.m9179q(c1348hM3621k14.f4459b.f4480b, c1350j6.f4480b), AbstractC4269s.f14152t, AbstractC4269s.f14176z, AbstractC4269s.f13982B, AbstractC4269s.f14006H), c4270t, (C4265o) null, C4266p.m8568q(c1348hM3621k14.m3624a(), c1348hM3621k3.m3624a())), c1347g);
                    int i20 = 0;
                    C1348h c1348h8 = c1348h;
                    while (true) {
                        int i21 = i19;
                        if (i20 >= i21) {
                            break;
                        }
                        C1348h c1348h9 = c1348hM3621k5;
                        c1342bM637o.m3619i(c1348h9, Integer.valueOf(i20));
                        C1348h c1348hM3615e = c1342bM637o.m3615e(i20, c1350jArr[i20]);
                        int i22 = i20;
                        C1349i c1349i3 = (C1349i) f24352h.get(c1348hM3615e.f4459b);
                        if (c1349i3 == null) {
                            i19 = i21;
                            c1342b = c1342bM637o;
                        } else {
                            i19 = i21;
                            C1342b c1342b2 = c1342bM637o;
                            c1342b2.m3617g(new C4268r(49, C4681a.m9174d(c1349i3.m3625a(true)).m9176c(), C4682b.f15598p), c1349i3, c1348hM3621k8, null, c1348hM3615e);
                            c1342b = c1342b2;
                            c1348hM3615e = c1348hM3621k8;
                        }
                        C4268r c4268rM8577b = AbstractC4269s.m8577b(c1348hM3615e.f4459b.f4480b);
                        C4265o c4265oM3624a = c1348hM3615e.m3624a();
                        C4265o c4265oM3624a2 = c1348hM3621k6.m3624a();
                        c1348hM3621k5 = c1348h9;
                        C4265o c4265oM3624a3 = c1348hM3621k5.m3624a();
                        C1348h c1348h10 = c1348hM3621k2;
                        C4266p c4266p = new C4266p(3);
                        c4266p.m10841m(0, c4265oM3624a);
                        c4266p.m10841m(1, c4265oM3624a2);
                        c4266p.m10841m(2, c4265oM3624a3);
                        c1342b.m3612a(new C4271u(c4268rM8577b, c4270t, c4266p, c4682b), null);
                        c1342bM637o = c1342b;
                        i20 = i22 + 1;
                        c1348hM3621k2 = c1348h10;
                        c1348h8 = c1348h8;
                    }
                    C1342b c1342b3 = c1342bM637o;
                    C1348h c1348h11 = c1348hM3621k2;
                    C1348h c1348h12 = c1348h8;
                    C1348h[] c1348hArr3 = {c1348h4, c1348hM3621k11, c1348hM3621k6};
                    c1349iM3627b = c1349i2;
                    C4682b c4682bM9176c = C4681a.m9174d(c1349iM3627b.m3625a(true)).m9176c();
                    C4682b c4682b2 = C4682b.f15598p;
                    c1342b3.m3617g(new C4268r(53, c4682bM9176c, c4682b2), c1349iM3627b, c1348hM3621k4, c1348hM3621k3, c1348hArr3);
                    HashMap map2 = f24353i;
                    boolean zContainsKey = map2.containsKey(returnType);
                    Class cls10 = Void.TYPE;
                    if (zContainsKey) {
                        C1348h c1348h13 = c1348hM3621k13;
                        c1342b3.m3614c(c1348h13, c1348hM3621k4);
                        C1349i c1349i4 = (C1349i) map2.get(returnType);
                        c1342b3.m3617g(new C4268r(50, C4681a.m9174d(c1349i4.m3625a(true)).m9176c(), c4682b2), c1349i4, c1348hM3621k9, c1348h13, new C1348h[0]);
                        c1342b3.m3622l(c1348hM3621k9);
                    } else if (cls10.equals(returnType)) {
                        c1342b3.m3623m();
                    } else {
                        c1342b3.m3614c(c1348hM3621k9, c1348hM3621k4);
                        c1342b3.m3622l(c1348hM3621k9);
                    }
                    c1342b3.m3613b(c1347g);
                    if (c1347g.f4453c) {
                        C2104o.m5276A("already marked");
                        return null;
                    }
                    c1347g.f4453c = true;
                    if (c1342b3.f4426c != null) {
                        c1342b3.m3613b(c1347g);
                        c1342b3.m3612a(new C4263m(AbstractC4269s.f14148s, c4270t, (C4265o) null, C4266p.f13968i), c1347g);
                    }
                    c1342b3.f4426c = c1347g;
                    if ((method2.getModifiers() & 1024) == 0) {
                        for (int i23 = 0; i23 < c1348hArr.length; i23++) {
                            c1348hArr[i23] = c1342b3.m3615e(i23, c1350jArr[i23]);
                        }
                        if (cls10.equals(returnType)) {
                            c1342b3.m3618h(c1349i, null, c1348h4, c1348hArr);
                            c1342b3.m3623m();
                        } else {
                            c1342b3.m3618h(c1349i, c1348h12, c1348h4, c1348hArr);
                            c1342b3.m3622l(c1348h12);
                        }
                        method = method2;
                    } else {
                        method = method2;
                        m10735f(c1342b3, method, c1348h7, c1348h11);
                    }
                    C1342b c1342bM637o2 = c0126e2.m637o(c1350j5.m3627b(c1350jM3626a8, m10734e(method), c1350jArr));
                    if ((method.getModifiers() & 1024) == 0) {
                        C1348h c1348h14 = c1342bM637o2.f4428e;
                        if (c1348h14 == null) {
                            C2104o.m5276A("static methods cannot access 'this'");
                            return null;
                        }
                        C1342b.m3611d(c1348h14, c1350j5);
                        int length4 = clsArr.length;
                        C1348h[] c1348hArr4 = new C1348h[length4];
                        for (int i24 = 0; i24 < length4; i24++) {
                            c1348hArr4[i24] = c1342bM637o2.m3615e(i24, c1350jArr[i24]);
                        }
                        if (cls10.equals(returnType)) {
                            c1348h2 = null;
                            c1342bM637o2.m3618h(c1349i, null, c1348h14, c1348hArr4);
                            c1342bM637o2.m3623m();
                        } else {
                            c1348h2 = null;
                            C1348h c1348hM3621k16 = c1342bM637o2.m3621k(c1350jM3626a8);
                            c1342bM637o2.m3618h(c1349i, c1348hM3621k16, c1348h14, c1348hArr4);
                            c1342bM637o2.m3622l(c1348hM3621k16);
                        }
                    } else {
                        c1348h2 = null;
                        m10735f(c1342bM637o2, method, c1342bM637o2.m3621k(C1350j.f4477n), c1342bM637o2.m3621k(c1350j2));
                    }
                    i15 = i17 + 1;
                    c1350j3 = c1350j5;
                    c1348h3 = c1348h2;
                    c0126e = c0126e2;
                    size = i16;
                    c5994b = c5994b2;
                    methodArr = methodArr2;
                    str4 = str5;
                    strM2255r = str6;
                    c1350jM3626a7 = c1350j9;
                    c1350jM3626a5 = c1350j11;
                    c1350jM3626a6 = c1350j12;
                    c1350jM3626a4 = c1350j13;
                    c1350jM3626a = c1350j;
                }
                C5994b c5994b3 = c5994b;
                String str7 = strM2255r;
                C1350j c1350j14 = c1350jM3626a;
                C1350j c1350j15 = c1350j3;
                Method[] methodArr3 = methodArr;
                String str8 = str4;
                C0126e c0126e3 = c0126e;
                String str9 = str7;
                String strConcat = str9.concat(".generated");
                C1350j[] c1350jArr2 = new C1350j[arrayList2.size()];
                Iterator it6 = arrayList2.iterator();
                int i25 = 0;
                while (it6.hasNext()) {
                    c1350jArr2[i25] = C1350j.m3626a((Class) it6.next());
                    i25++;
                }
                C1345e c1345eM643u = c0126e3.m643u(c1350j15);
                if (c1345eM643u.f4440b) {
                    C1275d.m3413g(c1350j15, "already declared: ");
                    return null;
                }
                c1345eM643u.f4440b = true;
                c1345eM643u.f4441c = 1;
                c1345eM643u.f4442d = c1350j14;
                c1345eM643u.f4443e = strConcat;
                c1345eM643u.f4444f = new C1351k(c1350jArr2);
                ClassLoader classLoader5 = this.f24355b;
                File file3 = this.f24356c;
                LinkedHashMap linkedHashMap2 = (LinkedHashMap) c0126e3.f332h;
                if (file3 == null) {
                    String property = System.getProperty("dexmaker.dexcache");
                    if (property != null) {
                        file3 = new File(property);
                    } else {
                        try {
                            ClassLoader classLoader6 = AbstractC1341a.class.getClassLoader();
                            Class<?> cls11 = Class.forName("dalvik.system.PathClassLoader");
                            cls11.cast(classLoader6);
                            fileArrM3606v = AbstractC1341a.m3606v(AbstractC1341a.m3605u(classLoader6, cls11));
                        } catch (ClassCastException | ClassNotFoundException unused) {
                        }
                        file3 = fileArrM3606v.length > 0 ? fileArrM3606v[0] : null;
                        if (file3 == null) {
                            C2104o.m5294t("dexcache == null (and no default could be found; consider setting the 'dexmaker.dexcache' system property)");
                            return null;
                        }
                    }
                }
                Set setKeySet = linkedHashMap2.keySet();
                Iterator it7 = setKeySet.iterator();
                int size2 = setKeySet.size();
                int[] iArr = new int[size2];
                int i26 = 0;
                while (it7.hasNext()) {
                    C1345e c1345eM643u2 = c0126e3.m643u((C1350j) it7.next());
                    Set setKeySet2 = c1345eM643u2.f4447i.keySet();
                    C1350j c1350j16 = c1345eM643u2.f4442d;
                    if (c1350j16 != null) {
                        iArr[i26] = setKeySet2.hashCode() + ((Arrays.hashCode(c1345eM643u2.f4444f.f4482a) + (c1350j16.f4479a.hashCode() * 31)) * 31);
                        i26++;
                    }
                }
                Arrays.sort(iArr);
                int i27 = 1;
                for (int i28 = 0; i28 < size2; i28++) {
                    i27 = (i27 * 31) + iArr[i28];
                }
                File file4 = new File(file3, AbstractC0921a.m2250m(i27, "Generated_", ".jar"));
                if (!file4.exists()) {
                    if (((C3689p) c0126e3.f333i) == null) {
                        c0126e3.f333i = new C3689p(new C2893a());
                    }
                    it = linkedHashMap2.values().iterator();
                    while (it.hasNext()) {
                        C1345e c1345e = (C1345e) it.next();
                        C3689p c3689p = (C3689p) c0126e3.f333i;
                        LinkedHashMap linkedHashMap3 = c1345e.f4447i;
                        LinkedHashMap linkedHashMap4 = c1345e.f4446h;
                        C1350j c1350j17 = c1345e.f4439a;
                        if (!c1345e.f4440b) {
                            StringBuilder sb3 = new StringBuilder("Undeclared type ");
                            sb3.append(c1350j17);
                            sb3.append(" declares members: ");
                            sb3.append(linkedHashMap4.keySet());
                            Set setKeySet3 = linkedHashMap3.keySet();
                            sb3.append(" ");
                            sb3.append(setKeySet3);
                            throw new IllegalStateException(sb3.toString());
                        }
                        C2893a c2893a = new C2893a();
                        C4453d0 c4453d02 = c1350j17.f4481c;
                        if (c1345e.f4445g == null) {
                            it2 = it;
                            c1345e.f4445g = new C3679k(c4453d02, c1345e.f4441c, c1345e.f4442d.f4481c, c1345e.f4444f.f4483b, new C4451c0(c1345e.f4443e));
                            Iterator it8 = linkedHashMap3.values().iterator();
                            while (it8.hasNext()) {
                                C1344d c1344d = (C1344d) it8.next();
                                C4476y c4476y = c1344d.f4436a.f4466e;
                                int i29 = c1344d.f4437b;
                                C1342b c1342b4 = c1344d.f4438c;
                                if ((i29 & 1024) == 0 && (i29 & Opcodes.ACC_NATIVE) == 0) {
                                    ArrayList arrayList3 = c1342b4.f4425b;
                                    if (!c1342b4.f4427d) {
                                        c1342b4.m3616f();
                                    }
                                    Iterator it9 = arrayList3.iterator();
                                    it3 = it8;
                                    int i30 = 0;
                                    while (it9.hasNext()) {
                                        LinkedHashMap linkedHashMap5 = linkedHashMap4;
                                        C1347g c1347g2 = (C1347g) it9.next();
                                        Iterator it10 = it9;
                                        if (c1347g2.f4451a.isEmpty()) {
                                            it10.remove();
                                            classLoader3 = classLoader5;
                                            str3 = str9;
                                        } else {
                                            str3 = str9;
                                            for (int i31 = 0; i31 < c1347g2.f4454d.size(); i31++) {
                                                while (((C1347g) c1347g2.f4454d.get(i31)).f4451a.isEmpty()) {
                                                    List list = c1347g2.f4454d;
                                                    list.set(i31, ((C1347g) list.get(i31)).f4455e);
                                                    classLoader5 = classLoader5;
                                                }
                                            }
                                            classLoader3 = classLoader5;
                                            while (true) {
                                                C1347g c1347g3 = c1347g2.f4455e;
                                                if (c1347g3 == null || !c1347g3.f4451a.isEmpty()) {
                                                    break;
                                                }
                                                c1347g2.f4455e = c1347g2.f4455e.f4455e;
                                            }
                                            while (true) {
                                                C1347g c1347g4 = c1347g2.f4456f;
                                                if (c1347g4 == null || !c1347g4.f4451a.isEmpty()) {
                                                    break;
                                                }
                                                c1347g2.f4456f = c1347g2.f4456f.f4455e;
                                            }
                                            c1347g2.f4457g = i30;
                                            i30++;
                                        }
                                        it9 = it10;
                                        linkedHashMap4 = linkedHashMap5;
                                        classLoader5 = classLoader3;
                                        str9 = str3;
                                    }
                                    classLoader2 = classLoader5;
                                    str2 = str9;
                                    linkedHashMap = linkedHashMap4;
                                    C4253c c4253c = new C4253c(arrayList3.size());
                                    int i32 = 0;
                                    while (i32 < arrayList3.size()) {
                                        C1347g c1347g5 = (C1347g) arrayList3.get(i32);
                                        ArrayList arrayList4 = c1347g5.f4451a;
                                        ArrayList arrayList5 = arrayList3;
                                        C1607u c1607u = new C1607u(arrayList4.size());
                                        File file5 = file3;
                                        for (int i33 = 0; i33 < arrayList4.size(); i33++) {
                                            c1607u.m10841m(i33, (AbstractC4259i) arrayList4.get(i33));
                                        }
                                        c1607u.f24613g = false;
                                        C6093g c6093g = new C6093g(4);
                                        Iterator it11 = c1347g5.f4454d.iterator();
                                        while (it11.hasNext()) {
                                            c6093g.m10844l(((C1347g) it11.next()).f4457g);
                                        }
                                        C1347g c1347g6 = c1347g5.f4455e;
                                        if (c1347g6 != null) {
                                            i9 = c1347g6.f4457g;
                                            c6093g.m10844l(i9);
                                        } else {
                                            i9 = -1;
                                        }
                                        C1347g c1347g7 = c1347g5.f4456f;
                                        if (c1347g7 != null) {
                                            c6093g.m10844l(c1347g7.f4457g);
                                        }
                                        c6093g.f24613g = false;
                                        c4253c.m10853q(i32, new C4252b(c1347g5.f4457g, c1607u, c6093g, i9));
                                        c4253c.f13934j = -1;
                                        i32++;
                                        arrayList3 = arrayList5;
                                        file3 = file5;
                                    }
                                    file2 = file3;
                                    C1005h c1005h = new C1005h(c4253c, 0);
                                    Iterator it12 = c1342b4.f4429f.iterator();
                                    int iM9188i = 0;
                                    while (it12.hasNext()) {
                                        iM9188i += ((C1348h) it12.next()).f4459b.f4480b.m9188i();
                                    }
                                    c3697t = new C3697t(c4476y, i29, C3320y.m7040b(c1005h, 1, iM9188i, c2893a), C4682b.f15591i);
                                } else {
                                    classLoader2 = classLoader5;
                                    str2 = str9;
                                    it3 = it8;
                                    file2 = file3;
                                    linkedHashMap = linkedHashMap4;
                                    c3697t = new C3697t(c4476y, i29, null, C4682b.f15591i);
                                }
                                int i34 = 65546 & i29;
                                C3679k c3679k = c1345e.f4445g;
                                if (i34 != 0) {
                                    c3679k.f11952m.f11942o.add(c3697t);
                                } else {
                                    c3679k.f11952m.f11943p.add(c3697t);
                                }
                                it8 = it3;
                                linkedHashMap4 = linkedHashMap;
                                file3 = file2;
                                classLoader5 = classLoader2;
                                str9 = str2;
                            }
                            classLoader = classLoader5;
                            str = str9;
                            file = file3;
                            for (C1343c c1343c : linkedHashMap4.values()) {
                                C1346f c1346f = c1343c.f4434a;
                                int i35 = c1343c.f4435b;
                                C3693r c3693r = new C3693r(c1346f.f4450c, i35);
                                int i36 = i35 & 8;
                                C3679k c3679k2 = c1345e.f4445g;
                                if (i36 != 0) {
                                    c3679k2.m7673i(c3693r, C4469r.f14816g);
                                } else {
                                    c3679k2.f11952m.f11941n.add(c3693r);
                                }
                            }
                        } else {
                            classLoader = classLoader5;
                            str = str9;
                            file = file3;
                            it2 = it;
                        }
                        c3689p.m7701a(c1345e.f4445g);
                        it = it2;
                        file3 = file;
                        classLoader5 = classLoader;
                        str9 = str;
                    }
                    ClassLoader classLoader7 = classLoader5;
                    String str10 = str9;
                    File file6 = file3;
                    try {
                        C3689p c3689p2 = (C3689p) c0126e3.f333i;
                        c3689p2.getClass();
                        byte[] bArr = c3689p2.m7703c(false, false).f24595b;
                        jarOutputStream = new JarOutputStream(new BufferedOutputStream(new FileOutputStream(file4)));
                        file4.setReadOnly();
                        try {
                            JarEntry jarEntry = new JarEntry("classes.dex");
                            jarEntry.setSize(bArr.length);
                            jarOutputStream.putNextEntry(jarEntry);
                            try {
                                jarOutputStream.write(bArr);
                                jarOutputStream.close();
                                classLoaderM642t = c0126e3.m642t(file4, file6, classLoader7);
                                str9 = str10;
                            } finally {
                                jarOutputStream.closeEntry();
                            }
                        } catch (Throwable th2) {
                            jarOutputStream.close();
                            throw th2;
                        }
                    } catch (IOException e6) {
                        throw new RuntimeException(e6);
                    }
                } else if (file4.canWrite()) {
                    file4.delete();
                    if (((C3689p) c0126e3.f333i) == null) {
                    }
                    it = linkedHashMap2.values().iterator();
                    while (it.hasNext()) {
                    }
                    ClassLoader classLoader72 = classLoader5;
                    String str102 = str9;
                    File file62 = file3;
                    C3689p c3689p22 = (C3689p) c0126e3.f333i;
                    c3689p22.getClass();
                    byte[] bArr2 = c3689p22.m7703c(false, false).f24595b;
                    jarOutputStream = new JarOutputStream(new BufferedOutputStream(new FileOutputStream(file4)));
                    file4.setReadOnly();
                    JarEntry jarEntry2 = new JarEntry("classes.dex");
                    jarEntry2.setSize(bArr2.length);
                    jarOutputStream.putNextEntry(jarEntry2);
                    jarOutputStream.write(bArr2);
                    jarOutputStream.close();
                    classLoaderM642t = c0126e3.m642t(file4, file62, classLoader72);
                    str9 = str102;
                } else {
                    classLoaderM642t = c0126e3.m642t(file4, file3, classLoader5);
                }
                try {
                    Class<?> clsLoadClass = classLoaderM642t.loadClass(str9);
                    try {
                        Field declaredField = clsLoadClass.getDeclaredField(str8);
                        declaredField.setAccessible(true);
                        declaredField.set(null, methodArr3);
                        map.put(c5994b3, clsLoadClass);
                        return clsLoadClass;
                    } catch (IllegalAccessException e7) {
                        C2104o.m5281f(e7);
                        return null;
                    } catch (NoSuchFieldException e10) {
                        C2104o.m5281f(e10);
                        return null;
                    }
                } catch (ClassNotFoundException e11) {
                    C2104o.m5281f(e11);
                    return null;
                } catch (IllegalAccessError e12) {
                    throw new UnsupportedOperationException(AbstractC3199a.m6838k(cls2, "cannot proxy inaccessible class "), e12);
                }
            }
            Constructor<?> constructor = declaredConstructors[i12];
            Class<InvocationHandler> cls12 = cls4;
            if (constructor.getModifiers() == 16) {
                i10 = i12;
                cls = cls5;
                constructorArr = declaredConstructors;
                i11 = length;
            } else {
                Class<?>[] parameterTypes2 = constructor.getParameterTypes();
                int length5 = parameterTypes2.length;
                i10 = i12;
                C1350j[] c1350jArr3 = new C1350j[length5];
                cls = cls5;
                constructorArr = declaredConstructors;
                for (int i37 = 0; i37 < parameterTypes2.length; i37++) {
                    c1350jArr3[i37] = C1350j.m3626a(parameterTypes2[i37]);
                }
                i11 = length;
                C1342b c1342bM637o3 = c0126e.m637o(new C1349i(c1350j3, C1350j.f4475l, "<init>", new C1351k(c1350jArr3)));
                C1348h c1348h15 = c1342bM637o3.f4428e;
                if (c1348h15 == null) {
                    C2104o.m5276A("static methods cannot access 'this'");
                    return null;
                }
                C1342b.m3611d(c1348h15, c1350j3);
                C1348h[] c1348hArr5 = new C1348h[length5];
                int i38 = 0;
                while (i38 < length5) {
                    c1348hArr5[i38] = c1342bM637o3.m3615e(i38, c1350jArr3[i38]);
                    i38++;
                    length5 = length5;
                }
                c1350jM3626a.getClass();
                C1349i c1349i5 = new C1349i(c1350jM3626a, C1350j.f4475l, "<init>", new C1351k(c1350jArr3));
                C4681a c4681aM9174d = C4681a.m9174d(c1349i5.m3625a(true));
                C4268r c4268r = AbstractC4269s.f14076a;
                c1342bM637o3.m3617g(new C4268r(52, c4681aM9174d.m9176c(), C4682b.f15598p), c1349i5, null, c1348h15, c1348hArr5);
                c1342bM637o3.m3623m();
            }
            i12 = i10 + 1;
            arrayList = arrayList2;
            cls4 = cls12;
            cls5 = cls;
            declaredConstructors = constructorArr;
            length = i11;
        }
    }
}
