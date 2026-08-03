package p000a;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;
import p000a.C0901wd;

/* JADX INFO: renamed from: a.Rb */
/* JADX INFO: loaded from: classes.dex */
public final class C0319Rb {

    /* JADX INFO: renamed from: a */
    public static final C0319Rb f1143a = new C0319Rb();

    /* JADX INFO: renamed from: b */
    public static volatile Set<Class<?>> f1144b;

    /* JADX INFO: renamed from: c */
    public static final List<String> f1145c;

    /* JADX INFO: renamed from: d */
    public static volatile a f1146d;

    /* JADX INFO: renamed from: e */
    public static volatile int f1147e;

    /* JADX INFO: renamed from: f */
    public static volatile long f1148f;

    /* JADX INFO: renamed from: g */
    public static final Object f1149g;

    /* JADX INFO: renamed from: a.Rb$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final Class<?> f1150a;

        /* JADX INFO: renamed from: b */
        public final Class<?> f1151b;

        /* JADX INFO: renamed from: c */
        public final String f1152c;

        public a(Class<?> cls, Class<?> cls2, String str) {
            C0631i9.m1482e(cls, "storageInterface");
            this.f1150a = cls;
            this.f1151b = cls2;
            this.f1152c = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C0631i9.m1478a(this.f1150a, aVar.f1150a) && C0631i9.m1478a(this.f1151b, aVar.f1151b) && C0631i9.m1478a(this.f1152c, aVar.f1152c);
        }

        public final int hashCode() {
            return this.f1152c.hashCode() + ((this.f1151b.hashCode() + (this.f1150a.hashCode() * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ConvStoragePair(storageInterface=");
            sb.append(this.f1150a);
            sb.append(", helper=");
            sb.append(this.f1151b);
            sb.append(", convGetter=");
            return C0944z.m2228h(sb, this.f1152c, ")");
        }
    }

    static {
        Set<Class<?>> setNewSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap(8));
        C0631i9.m1481d(setNewSetFromMap, "newSetFromMap(...)");
        f1144b = setNewSetFromMap;
        f1145c = C0739o3.m1757d0("vg3.x3", "c25.e", "rv1.f", "i35.g", "zq1.a0", "pz2.a", "e42.k0", "yj0.j1", "tk0.j1", "dl0.k1");
        f1149g = new Object();
    }

    /* JADX INFO: renamed from: a */
    public static long m880a() {
        if (f1147e <= 1) {
            return 5000L;
        }
        return f1147e == 2 ? 15000L : 60000L;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m881b(Class cls) {
        Method[] declaredMethods = cls.getDeclaredMethods();
        C0631i9.m1481d(declaredMethods, "getDeclaredMethods(...)");
        for (Method method : declaredMethods) {
            if (C0631i9.m1478a(method.getName(), "s") && Modifier.isStatic(method.getModifiers()) && method.getParameterTypes().length == 1) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m882c(Object obj) {
        Object objM2206a;
        Object objM891l;
        try {
            objM891l = m891l(obj);
        } catch (Throwable th) {
            objM2206a = C0920xd.m2206a(th);
        }
        if (objM891l == null) {
            return false;
        }
        String strM892m = m892m(objM891l);
        if (strM892m != null) {
            return strM892m.equalsIgnoreCase("rconversation");
        }
        for (Class<?> superclass = objM891l.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
            Field[] declaredFields = superclass.getDeclaredFields();
            C0631i9.m1481d(declaredFields, "getDeclaredFields(...)");
            for (Field field : declaredFields) {
                if (C0631i9.m1478a(field.getName(), "field_parentRef")) {
                    return true;
                }
            }
        }
        objM2206a = Boolean.FALSE;
        Object obj2 = Boolean.FALSE;
        if (objM2206a instanceof C0901wd.a) {
            objM2206a = obj2;
        }
        return ((Boolean) objM2206a).booleanValue();
    }

    /* JADX INFO: renamed from: d */
    public static Class m883d(ClassLoader classLoader, List list, InterfaceC0064D7 interfaceC0064D7, InterfaceC0819s7 interfaceC0819s7) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Class clsM13b = C0002A1.m13b(classLoader, str);
            if (clsM13b != null && ((Boolean) interfaceC0064D7.mo53f(clsM13b)).booleanValue()) {
                C0908x1.m2194b(Arrays.copyOf(new Object[]{"ObfResolv: DexKit 命中 ".concat(str)}, 1));
                return clsM13b;
            }
        }
        return (Class) interfaceC0819s7.mo31a();
    }

    /* JADX INFO: renamed from: e */
    public static Class m884e(ClassLoader classLoader) {
        C0631i9.m1482e(classLoader, "cl");
        for (String str : C0475a5.m1154c()) {
            Class clsM13b = C0002A1.m13b(classLoader, str);
            if (clsM13b != null) {
                f1143a.getClass();
                if (m881b(clsM13b)) {
                    C0908x1.m2194b(Arrays.copyOf(new Object[]{"ObfResolv: DexKit 命中 ".concat(str)}, 1));
                    return clsM13b;
                }
            }
        }
        Class clsM13b2 = C0002A1.m13b(classLoader, "com.tencent.mm.storage.e4");
        return (clsM13b2 == null && (clsM13b2 = C0002A1.m13b(classLoader, "com.tencent.mm.storage.l4")) == null && (clsM13b2 = C0002A1.m13b(classLoader, "e3.x3")) == null && (clsM13b2 = C0002A1.m13b(classLoader, "ge3.x3")) == null && (clsM13b2 = C0002A1.m13b(classLoader, "sc3.x3")) == null && (clsM13b2 = C0002A1.m13b(classLoader, "sc3.x")) == null) ? C0002A1.m13b(classLoader, "sc3.x0") : clsM13b2;
    }

    /* JADX INFO: renamed from: f */
    public static Class m885f(ClassLoader classLoader) {
        C0631i9.m1482e(classLoader, "cl");
        JSONObject jSONObjectM1155d = C0475a5.m1155d("conv_storage_helper_v1");
        for (String str : jSONObjectM1155d != null ? C0475a5.m1158g("classNames", jSONObjectM1155d) : C0439Y5.f1645a) {
            Class clsM13b = C0002A1.m13b(classLoader, str);
            if (clsM13b != null) {
                f1143a.getClass();
                if (m881b(clsM13b)) {
                    C0908x1.m2194b(Arrays.copyOf(new Object[]{"ObfResolv: DexKit 命中 ".concat(str)}, 1));
                    return clsM13b;
                }
            }
        }
        Iterator it = C0739o3.m1757d0("yj0.j1", "yj0.h1", "yj0.i1", "yj0.g1", "yj0.f1", "yj0.e1", "yj0.d1", "yj0.c1", "yj0.b1", "yj0.a1", "yk0.j1", "yk0.h1", "yk0.i1", "yj0.k1", "yj0.l1", "zh0.j1", "zg0.j1", "zf0.j1").iterator();
        while (it.hasNext()) {
            Class clsM13b2 = C0002A1.m13b(classLoader, (String) it.next());
            if (clsM13b2 != null) {
                return clsM13b2;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public static a m886g(ClassLoader classLoader) {
        a aVarM889j;
        C0631i9.m1482e(classLoader, "cl");
        a aVar = f1146d;
        if (aVar != null) {
            return aVar;
        }
        if (f1148f > 0 && System.currentTimeMillis() - f1148f < m880a()) {
            return null;
        }
        synchronized (f1149g) {
            a aVar2 = f1146d;
            if (aVar2 != null) {
                return aVar2;
            }
            if (f1148f > 0) {
                long jCurrentTimeMillis = System.currentTimeMillis() - f1148f;
                f1143a.getClass();
                if (jCurrentTimeMillis < m880a()) {
                    return null;
                }
            }
            Iterator<Class<?>> it = f1144b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    aVarM889j = null;
                    break;
                }
                Class<?> next = it.next();
                f1143a.getClass();
                aVarM889j = m889j(classLoader, next);
                if (aVarM889j != null) {
                    break;
                }
            }
            if (aVarM889j == null) {
                Iterator<String> it2 = f1145c.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    String next2 = it2.next();
                    Class clsM13b = C0002A1.m13b(classLoader, next2);
                    if (clsM13b != null) {
                        f1143a.getClass();
                        a aVarM889j2 = m889j(classLoader, clsM13b);
                        if (aVarM889j2 != null) {
                            C0908x1.m2194b(Arrays.copyOf(new Object[]{"ObfResolv: 接口候选命中 " + next2}, 1));
                            aVarM889j = aVarM889j2;
                            break;
                        }
                    }
                }
            }
            if (aVarM889j == null) {
                List listM1154c = C0475a5.m1154c();
                JSONObject jSONObjectM1155d = C0475a5.m1155d("conv_storage_helper_v1");
                List listM1158g = jSONObjectM1155d != null ? C0475a5.m1158g("classNames", jSONObjectM1155d) : C0439Y5.f1645a;
                Iterator it3 = listM1154c.iterator();
                loop2: while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    Class clsM13b2 = C0002A1.m13b(classLoader, (String) it3.next());
                    if (clsM13b2 != null) {
                        Iterator it4 = listM1158g.iterator();
                        while (it4.hasNext()) {
                            Class clsM13b3 = C0002A1.m13b(classLoader, (String) it4.next());
                            if (clsM13b3 != null) {
                                f1143a.getClass();
                                a aVarM888i = m888i(clsM13b3, clsM13b2);
                                if (aVarM888i != null) {
                                    aVarM889j = aVarM888i;
                                    break loop2;
                                }
                            }
                        }
                    }
                }
            }
            if (aVarM889j == null) {
                JSONObject jSONObjectM1155d2 = C0475a5.m1155d("all_j1_classes");
                Iterator it5 = (jSONObjectM1155d2 != null ? C0475a5.m1158g("classes", jSONObjectM1155d2) : C0439Y5.f1645a).iterator();
                while (true) {
                    if (!it5.hasNext()) {
                        break;
                    }
                    Class clsM13b4 = C0002A1.m13b(classLoader, (String) it5.next());
                    if (clsM13b4 != null) {
                        f1143a.getClass();
                        a aVarM888i2 = m888i(clsM13b4, null);
                        if (aVarM888i2 != null) {
                            aVarM889j = aVarM888i2;
                            break;
                        }
                    }
                }
            }
            if (aVarM889j != null) {
                f1146d = aVarM889j;
                f1147e = 0;
                f1148f = 0L;
            } else {
                f1147e++;
                f1148f = System.currentTimeMillis();
                int i = f1147e;
                f1143a.getClass();
                C0908x1.m2197e(Arrays.copyOf(new Object[]{"ObfResolv: resolveConvStoragePair FAILED (count=" + i + ", backoff=" + m880a() + "ms)"}, 1));
            }
            return aVarM889j;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    /* JADX INFO: renamed from: h */
    public static Class m887h(ClassLoader classLoader) {
        JSONArray jSONArrayOptJSONArray;
        String str;
        C0631i9.m1482e(classLoader, "cl");
        ?? r0 = C0475a5.f1753a;
        JSONObject jSONObject = null;
        if (r0 != 0 && (str = (String) r0.get("incoming_call_mgr_v1")) != null) {
            try {
                jSONObject = new JSONObject(str);
            } catch (Exception unused) {
            }
        }
        List list = C0439Y5.f1645a;
        if (jSONObject != null && (jSONArrayOptJSONArray = jSONObject.optJSONArray("classNames")) != null) {
            C0574f9 c0574f9M749D = C0267Oc.m749D(0, jSONArrayOptJSONArray.length());
            ArrayList arrayList = new ArrayList(C0758p3.m1800g0(c0574f9M749D, 10));
            Iterator<Integer> it = c0574f9M749D.iterator();
            while (((C0555e9) it).f2095c) {
                arrayList.add(jSONArrayOptJSONArray.optString(((AbstractC0517c9) it).mo1278a(), ""));
            }
            list = arrayList;
        }
        return m883d(classLoader, list, new C0263O8(21), new C0302Qb(1, classLoader));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: A */
    /* JADX DEBUG: Multi-variable search result rejected for r3v18, resolved type: A */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x02d6, code lost:
    
        r23 = r5;
        r22 = r8;
        r24 = r10;
        r0 = (p000a.C0710mc) p000a.C0834t3.m1950n0(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x02e2, code lost:
    
        if (r0 == null) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x02e4, code lost:
    
        r2 = (java.lang.reflect.Method) r0.f2680a;
        r0 = r0.f2681b;
        r3 = r2.getName();
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x02ee, code lost:
    
        r0 = m891l(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x02f2, code lost:
    
        if (r0 == null) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x02f4, code lost:
    
        r0 = m892m(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x02f9, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x02fb, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x02fd, code lost:
    
        r0 = p000a.C0920xd.m2206a(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0347, code lost:
    
        r0 = r12.getClass().getDeclaredMethods();
        p000a.C0631i9.m1481d(r0, "getDeclaredMethods(...)");
        r3 = r0.length;
        r4 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0355, code lost:
    
        if (r4 >= r3) goto L221;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0357, code lost:
    
        r5 = r0[r4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0361, code lost:
    
        if (p000a.C0631i9.m1478a(r5.getName(), "n") == false) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0369, code lost:
    
        if (r5.getParameterTypes().length != 2) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0375, code lost:
    
        if (p000a.C0631i9.m1478a(r5.getParameterTypes()[r16], java.lang.String.class) == false) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0383, code lost:
    
        if (p000a.C0631i9.m1478a(r5.getParameterTypes()[1], r7) == false) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0385, code lost:
    
        p000a.C0908x1.m2194b(java.util.Arrays.copyOf(new java.lang.Object[]{"ObfResolv: 解析命中(旧链) helper=" + r25.getName() + " iface=" + r6.getName() + " getter=Tg"}, 1));
        r0 = new p000a.C0319Rb.a(r6, r25, "Tg");
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x03c1, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x03c4, code lost:
    
        r7 = r16;
        r4 = r19;
        r8 = r22;
        r5 = r23;
        r10 = r24;
        r3 = null;
        r9 = true;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:162:0x03dc  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x03de  */
    /* JADX INFO: renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static a m888i(Class cls, Class cls2) {
        Object objM2206a;
        Method[] declaredMethods;
        ArrayList arrayList;
        int length;
        int i;
        int i2;
        boolean z;
        Class cls3;
        Class cls4;
        Object objM2206a2;
        Object obj;
        Method method;
        String name;
        Object objM2206a3;
        Object objM2206a4;
        Object objM2206a5;
        int i3;
        Object objM2206a6;
        Class<?>[] clsArr = null;
        try {
            declaredMethods = cls.getDeclaredMethods();
            C0631i9.m1481d(declaredMethods, "getDeclaredMethods(...)");
            arrayList = new ArrayList();
            length = declaredMethods.length;
            i = 0;
            i2 = 0;
        } catch (Throwable th) {
            objM2206a = C0920xd.m2206a(th);
        }
        while (true) {
            z = true;
            cls3 = Void.TYPE;
            if (i2 >= length) {
                break;
            }
            Method method2 = declaredMethods[i2];
            if (Modifier.isStatic(method2.getModifiers()) && method2.getParameterTypes().length == 1 && !method2.getReturnType().isPrimitive() && !C0631i9.m1478a(method2.getReturnType(), cls3)) {
                arrayList.add(method2);
            }
            i2++;
            return (a) (objM2206a instanceof C0901wd.a ? null : objM2206a);
        }
        if (!arrayList.isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            if (cls2 != null) {
                arrayList2.add(cls2);
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Class<?> cls5 = ((Method) it.next()).getParameterTypes()[0];
                if (cls5.isInterface()) {
                    arrayList2.add(cls5);
                }
            }
            C0908x1.m2194b(Arrays.copyOf(new Object[]{"ObfResolv: resolveViaHelperOnly helper=" + cls.getName() + " ifaceCands=" + arrayList2.size()}, 1));
            Iterator it2 = C0834t3.m1959w0(new LinkedHashSet(arrayList2)).iterator();
            loop2: while (true) {
                if (!it2.hasNext()) {
                    objM2206a = null;
                    break;
                }
                cls4 = (Class) it2.next();
                ArrayList arrayListM1758e0 = C0739o3.m1758e0(cls4);
                try {
                    objM2206a2 = cls4.getDeclaredConstructor(clsArr).newInstance(clsArr);
                } catch (Throwable th2) {
                    objM2206a2 = C0920xd.m2206a(th2);
                }
                if (objM2206a2 instanceof C0901wd.a) {
                    objM2206a2 = clsArr;
                }
                if (objM2206a2 != null) {
                    arrayListM1758e0.add(objM2206a2);
                }
                Iterator it3 = arrayListM1758e0.iterator();
                while (it3.hasNext()) {
                    Object next = it3.next();
                    Iterator it4 = arrayList.iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            obj = clsArr;
                            break;
                        }
                        Method method3 = (Method) it4.next();
                        method3.setAccessible(z);
                        try {
                            objM2206a6 = method3.invoke(clsArr, next);
                        } catch (Throwable th3) {
                            objM2206a6 = C0920xd.m2206a(th3);
                        }
                        if (objM2206a6 instanceof C0901wd.a) {
                            objM2206a6 = clsArr;
                        }
                        if (objM2206a6 != null) {
                            obj = objM2206a6;
                            break;
                        }
                    }
                    if (obj != null) {
                        ArrayList arrayList3 = new ArrayList();
                        Method[] declaredMethods2 = obj.getClass().getDeclaredMethods();
                        C0631i9.m1481d(declaredMethods2, "getDeclaredMethods(...)");
                        ArrayList arrayList4 = new ArrayList();
                        int length2 = declaredMethods2.length;
                        int i4 = i;
                        while (i < length2) {
                            Method method4 = declaredMethods2[i];
                            Class<?>[] parameterTypes = method4.getParameterTypes();
                            Method[] methodArr = declaredMethods2;
                            C0631i9.m1481d(parameterTypes, "getParameterTypes(...)");
                            if (parameterTypes.length == 0 && !C0631i9.m1478a(method4.getReturnType(), cls3) && !method4.getReturnType().isPrimitive()) {
                                arrayList4.add(method4);
                            }
                            i++;
                            declaredMethods2 = methodArr;
                        }
                        Iterator it5 = arrayList4.iterator();
                        while (true) {
                            boolean zHasNext = it5.hasNext();
                            Class cls6 = Boolean.TYPE;
                            if (!zHasNext) {
                                break;
                            }
                            Method method5 = (Method) it5.next();
                            Iterator it6 = it5;
                            method5.setAccessible(true);
                            try {
                                objM2206a5 = method5.invoke(obj, null);
                            } catch (Throwable th4) {
                                objM2206a5 = C0920xd.m2206a(th4);
                            }
                            if (objM2206a5 instanceof C0901wd.a) {
                                objM2206a5 = null;
                            }
                            if (objM2206a5 == null) {
                                it5 = it6;
                            } else {
                                Method[] declaredMethods3 = objM2206a5.getClass().getDeclaredMethods();
                                C0631i9.m1481d(declaredMethods3, "getDeclaredMethods(...)");
                                Iterator it7 = it2;
                                int length3 = declaredMethods3.length;
                                int i5 = i4;
                                while (true) {
                                    if (i5 >= length3) {
                                        break;
                                    }
                                    Method method6 = declaredMethods3[i5];
                                    int i6 = i5;
                                    if (C0631i9.m1478a(method6.getName(), "n")) {
                                        i3 = length3;
                                        if (method6.getParameterTypes().length == 2 && C0631i9.m1478a(method6.getParameterTypes()[i4], String.class) && C0631i9.m1478a(method6.getParameterTypes()[1], cls6)) {
                                            arrayList3.add(new C0710mc(method5, objM2206a5));
                                            break;
                                        }
                                    } else {
                                        i3 = length3;
                                    }
                                    i5 = i6 + 1;
                                    length3 = i3;
                                }
                                it5 = it6;
                                it2 = it7;
                            }
                            objM2206a = C0920xd.m2206a(th);
                        }
                        Iterator it8 = it2;
                        Iterator it9 = arrayList3.iterator();
                        while (true) {
                            if (!it9.hasNext()) {
                                break;
                            }
                            C0710mc c0710mc = (C0710mc) it9.next();
                            Iterator it10 = it9;
                            Method method7 = (Method) c0710mc.f2680a;
                            B b = c0710mc.f2681b;
                            try {
                                Object objM891l = m891l(b);
                                objM2206a4 = objM891l != null ? m892m(objM891l) : null;
                            } catch (Throwable th5) {
                                objM2206a4 = C0920xd.m2206a(th5);
                            }
                            if (objM2206a4 instanceof C0901wd.a) {
                                objM2206a4 = null;
                            }
                            String name2 = method7.getName();
                            ArrayList arrayList5 = arrayList;
                            String name3 = b.getClass().getName();
                            Iterator it11 = it3;
                            StringBuilder sb = new StringBuilder();
                            Class cls7 = cls3;
                            sb.append("ObfResolv: 候选 getter=");
                            sb.append(name2);
                            sb.append(" convStore=");
                            sb.append(name3);
                            sb.append(" sampleTable=");
                            sb.append((String) objM2206a4);
                            C0908x1.m2194b(Arrays.copyOf(new Object[]{sb.toString()}, 1));
                            if (m882c(b)) {
                                C0908x1.m2194b(Arrays.copyOf(new Object[]{"ObfResolv: 解析命中(已验证rconversation) helper=" + cls.getName() + " iface=" + cls4.getName() + " getter=" + method7.getName() + " viaArg=" + (next == cls4 ? "Class" : "instance")}, 1));
                                String name4 = method7.getName();
                                C0631i9.m1481d(name4, "getName(...)");
                                objM2206a = new a(cls4, cls, name4);
                            } else {
                                it9 = it10;
                                it3 = it11;
                                arrayList = arrayList5;
                                cls3 = cls7;
                            }
                        }
                    }
                }
            }
        } else {
            objM2206a = null;
        }
        return (a) (objM2206a instanceof C0901wd.a ? null : objM2206a);
        if (objM2206a3 instanceof C0901wd.a) {
            objM2206a3 = null;
        }
        C0908x1.m2197e(Arrays.copyOf(new Object[]{"ObfResolv: WARN 未验证到 rconversation 存储，回退首个 getter=" + name + " table=" + ((String) objM2206a3) + " (可能误选联系人存储) helper=" + cls.getName()}, 1));
        String name5 = method.getName();
        C0631i9.m1481d(name5, "getName(...)");
        objM2206a = new a(cls4, cls, name5);
        return (a) (objM2206a instanceof C0901wd.a ? null : objM2206a);
    }

    /* JADX INFO: renamed from: j */
    public static a m889j(ClassLoader classLoader, Class cls) {
        a aVarM888i;
        ArrayList arrayListM1758e0 = C0739o3.m1758e0("gm0.j1");
        JSONObject jSONObjectM1155d = C0475a5.m1155d("all_j1_classes");
        Iterable iterableM1158g = jSONObjectM1155d != null ? C0475a5.m1158g("classes", jSONObjectM1155d) : C0439Y5.f1645a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterableM1158g) {
            if (!C0631i9.m1478a((String) obj, "gm0.j1")) {
                arrayList.add(obj);
            }
        }
        arrayListM1758e0.addAll(arrayList);
        C0908x1.m2194b(Arrays.copyOf(new Object[]{C0944z.m2225e("ObfResolv: resolveViaInterface helperNames count=", arrayListM1758e0.size())}, 1));
        Iterator it = arrayListM1758e0.iterator();
        while (it.hasNext()) {
            Class clsM13b = C0002A1.m13b(classLoader, (String) it.next());
            if (clsM13b != null && (aVarM888i = m888i(clsM13b, cls)) != null) {
                return aVarM888i;
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    /* JADX INFO: renamed from: k */
    public static Class m890k(ClassLoader classLoader) {
        JSONArray jSONArrayOptJSONArray;
        String str;
        C0631i9.m1482e(classLoader, "cl");
        ?? r0 = C0475a5.f1753a;
        JSONObject jSONObject = null;
        if (r0 != 0 && (str = (String) r0.get("voip_mgr_class_v1")) != null) {
            try {
                jSONObject = new JSONObject(str);
            } catch (Exception unused) {
            }
        }
        List list = C0439Y5.f1645a;
        if (jSONObject != null && (jSONArrayOptJSONArray = jSONObject.optJSONArray("classNames")) != null) {
            C0574f9 c0574f9M749D = C0267Oc.m749D(0, jSONArrayOptJSONArray.length());
            ArrayList arrayList = new ArrayList(C0758p3.m1800g0(c0574f9M749D, 10));
            Iterator<Integer> it = c0574f9M749D.iterator();
            while (((C0555e9) it).f2095c) {
                arrayList.add(jSONArrayOptJSONArray.optString(((AbstractC0517c9) it).mo1278a(), ""));
            }
            list = arrayList;
        }
        return m883d(classLoader, list, new C0263O8(20), new C0302Qb(0, classLoader));
    }

    /* JADX INFO: renamed from: l */
    public static Object m891l(Object obj) {
        Object objM2206a;
        Method method;
        try {
            Method[] declaredMethods = obj.getClass().getDeclaredMethods();
            C0631i9.m1481d(declaredMethods, "getDeclaredMethods(...)");
            int length = declaredMethods.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    method = null;
                    break;
                }
                method = declaredMethods[i];
                if (C0631i9.m1478a(method.getName(), "n") && method.getParameterTypes().length == 2 && C0631i9.m1478a(method.getParameterTypes()[0], String.class) && C0631i9.m1478a(method.getParameterTypes()[1], Boolean.TYPE)) {
                    break;
                }
                i++;
            }
            if (method == null) {
                return null;
            }
            method.setAccessible(true);
            objM2206a = method.invoke(obj, "filehelper", Boolean.TRUE);
        } catch (Throwable th) {
            objM2206a = C0920xd.m2206a(th);
        }
        if (objM2206a instanceof C0901wd.a) {
            return null;
        }
        return objM2206a;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0061  */
    /* JADX INFO: renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String m892m(Object obj) {
        C0901wd.a aVarM2206a;
        Class<?> superclass;
        Method method;
        try {
        } catch (Throwable th) {
            aVarM2206a = C0920xd.m2206a(th);
        }
        for (superclass = obj.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
            Method[] declaredMethods = superclass.getDeclaredMethods();
            C0631i9.m1481d(declaredMethods, "getDeclaredMethods(...)");
            int length = declaredMethods.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    method = null;
                    break;
                }
                method = declaredMethods[i];
                if (C0631i9.m1478a(method.getName(), "getTableName")) {
                    Class<?>[] parameterTypes = method.getParameterTypes();
                    C0631i9.m1481d(parameterTypes, "getParameterTypes(...)");
                    if (parameterTypes.length == 0 && C0631i9.m1478a(method.getReturnType(), String.class)) {
                        break;
                    }
                }
                i++;
            }
            if (method != null) {
                method.setAccessible(true);
                Object objInvoke = method.invoke(obj, null);
                if (objInvoke instanceof String) {
                    return (String) objInvoke;
                }
                return null;
            }
            return (String) (aVarM2206a == null ? aVarM2206a : null);
        }
        aVarM2206a = null;
        return (String) (aVarM2206a == null ? aVarM2206a : null);
    }
}
