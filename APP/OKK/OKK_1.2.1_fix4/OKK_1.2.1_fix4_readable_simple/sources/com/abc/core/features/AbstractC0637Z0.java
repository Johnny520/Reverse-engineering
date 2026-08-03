package com.abc.core.features;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import p001A0.AbstractC0040p;
import p007D0.C0137c;
import p007D0.C0140f;
import p009E0.AbstractC0181l;
import p009E0.AbstractC0188s;
import p009E0.C0180k;
import p009E0.C0190u;
import p031Q0.AbstractC0307g;
import p040V0.AbstractC0407j;
import p040V0.C0401d;
import p040V0.C0402e;
import p042W0.AbstractC0433r;

/* JADX INFO: renamed from: c0.Z0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0637Z0 {

    /* JADX INFO: renamed from: a */
    public static final ConcurrentHashMap f1953a = null;

    /* JADX INFO: renamed from: b */
    public static final ConcurrentHashMap f1954b = null;

    /* JADX INFO: renamed from: c */
    public static final ConcurrentHashMap f1955c = null;

    /* JADX INFO: renamed from: d */
    public static final ConcurrentHashMap f1956d = null;

    /* JADX INFO: renamed from: e */
    public static final ConcurrentHashMap f1957e = null;

    /* JADX INFO: renamed from: f */
    public static final AtomicInteger f1958f = null;

    static {
        f1953a = new ConcurrentHashMap();
        f1954b = new ConcurrentHashMap();
        f1955c = new ConcurrentHashMap();
        f1956d = new ConcurrentHashMap();
        f1957e = new ConcurrentHashMap();
        f1958f = new AtomicInteger(0);
    }

    /* JADX INFO: renamed from: a */
    public static List m1535a(Class r5) {
        ConcurrentHashMap r02 = f1953a;
        Object r1 = r02.get(r5);
        Object r12 = r1;
        if (r1 != null) goto L12;
        ArrayList r13 = new ArrayList();
        Class r2 = r5;
    L5:
        if (r2 == null) goto L7;
        Field[] r3 = r2.getDeclaredFields();
        AbstractC0307g.m702d(r3, "getDeclaredFields(...)");
        AbstractC0188s.m561m0(r13, r3);
        r2 = r2.getSuperclass();
        goto L5
    L7:
        Object r52 = r02.putIfAbsent(r5, r13);
        r12 = r13;
        if (r52 == null) goto L12;
        r12 = r52;
    L12:
        return (List) r12;
    }

    /* JADX INFO: renamed from: b */
    public static Object m1536b(Object r6, String r7) {
        Class<?> r02 = r6.getClass();
        String r1 = r02.getName() + "#" + r7;
        ConcurrentHashMap r2 = f1956d;
        Object r3 = r2.get(r1);
        if (r3 != null) goto L19;
        Iterator r03 = m1535a(r02).iterator();
    L6:
        if (r03.hasNext() == false) goto L10;
        Object r32 = r03.next();
        if (AbstractC0307g.m699a(((Field) r32).getName(), r7) == false) goto L6;
    L11:
        Field r33 = (Field) r32;
        if (r33 == null) goto L14;
        r33.setAccessible(true);
    L15:
        C0629V0 r72 = new C0629V0(r33);
        Object r04 = r2.putIfAbsent(r1, r72);
        if (r04 != null) goto L18;
        r3 = r72;
        goto L19
    L18:
        r3 = r04;
        goto L19
    L14:
        r33 = null;
        goto L15
    L10:
        r32 = null;
    L19:
        Field r73 = (Field) ((C0629V0) r3).f1940a;
        if (r73 != null) goto L22;
        return null;
    L22:
        return m1541g(r73, r6);
    }

    /* JADX INFO: renamed from: c */
    public static Object m1537c(int r6, Object r7) {
        Object r02 = null;
        if (r7 == null) goto L60;
        if (r6 < 0) goto L60;
        Object r1 = m1536b(r7, "H");     // Catch: Throwable -> L12
        if (r1 != null) goto L9;
    L8:
        Object r12 = null;
    L26:
        if (r12 != null) goto L70;
        ConcurrentHashMap r13 = f1957e;
        List r2 = (List) r13.get(r7.getClass());
        if (r2 != null) goto L30;
    L29:
        Object r3 = null;
    L52:
        if (r3 != null) goto L59;
        f1958f.incrementAndGet();
        Set r22 = Collections.newSetFromMap(new IdentityHashMap());
        AbstractC0307g.m702d(r22, "newSetFromMap(...)");
        C0627U0 r62 = m1542h(r7, r6, 0, r22, C0190u.f401a);
        if (r62 == null) goto L71;
        r13.put(r7.getClass(), r62.f1938b);
        r02 = r62.f1937a;
    L71:
        return r02;
    L59:
        return r3;
    L30:
        Iterator r23 = r2.iterator();
        r3 = r7;
    L32:
        if (r23.hasNext() == false) goto L49;
        AbstractC0635Y0 r4 = (AbstractC0635Y0) r23.next();
        if ((r4 instanceof C0631W0) == false) goto L37;
        r3 = m1541g(((C0631W0) r4).f1943a, r3);
    L45:
        if (r3 != null) goto L32;
        r3 = null;
        goto L49
    L37:
        if (AbstractC0307g.m699a(r4, C0633X0.f1948a) == false) goto L48;
        if ((r3 instanceof List) == false) goto L41;
        List r32 = (List) r3;
    L42:
        if (r32 == null) goto L44;
        r3 = AbstractC0181l.m545q0(r32, r6);
        goto L45
    L44:
        r3 = null;
        goto L45
    L41:
        r32 = null;
        goto L42
    L48:
        throw new C0137c();
    L49:
        if (r3 == null) goto L29;
        if (m1539e(r3) == false) goto L29;
    L70:
        return r12;
    L9:
        Object r14 = m1536b(r1, "f146203o");     // Catch: Throwable -> L12
        if ((r14 instanceof List) == false) goto L14;
        List r15 = (List) r14;     // Catch: Throwable -> L12
    L15:
        if (r15 == null) goto L8;
        Object r16 = AbstractC0181l.m545q0(r15, r6);     // Catch: Throwable -> L12
        if (r16 == null) goto L8;
        r12 = m1538d(r16);     // Catch: Throwable -> L12
    L24:
        if ((r12 instanceof C0140f) == false) goto L26;
    L14:
        r15 = null;
    L12:
        th = move-exception;
        r12 = AbstractC0040p.m116u(th);
    L60:
        return null;
    }

    /* JADX INFO: renamed from: d */
    public static Object m1538d(Object r5) {
        if (m1539e(r5) == false) goto L5;
        return r5;
    L5:
        C0401d r1 = new C0401d(AbstractC0407j.m995z0(new C0402e(new C0180k(2, m1535a(r5.getClass())), false, new C0570A(14)), new C0606M(3, r5)));
    L7:
        if (r1.hasNext() == false) goto L11;
        Object r02 = r1.next();
        if (m1539e(r02) == false) goto L7;
    L12:
        if (r02 == null) goto L14;
        return r02;
    L14:
        C0401d r03 = new C0401d(AbstractC0407j.m995z0(new C0402e(new C0180k(2, m1535a(r5.getClass())), false, new C0570A(15)), new C0606M(4, r5)));
        if (r03.hasNext() == true) goto L18;
        return null;
    L18:
        return r03.next();
    L11:
        r02 = null;
        goto L12
    }

    /* JADX INFO: renamed from: e */
    public static boolean m1539e(Object r2) {
        if (m1540f(r2, "getCreateTime", "field_createTime") != null) goto L5;
    L7:
        return false;
    L5:
        if (m1540f(r2, "getMsgId", "field_msgId") == null) goto L7;
        return true;
    }

    /* JADX INFO: renamed from: f */
    public static Long m1540f(Object r3, String r4, String r5) {
        Method r42 = m1544j(r3.getClass(), r4);     // Catch: Throwable -> L8
        if (r42 == null) goto L14;
        Object r43 = r42.invoke(r3, null);     // Catch: Throwable -> L8
        if ((r43 instanceof Number) == false) goto L10;
        Number r44 = (Number) r43;     // Catch: Throwable -> L8
    L11:
        if (r44 == null) goto L14;
        Object r45 = Long.valueOf(r44.longValue());     // Catch: Throwable -> L8
    L17:
        if ((r45 instanceof C0140f) == false) goto L19;
        r45 = null;
    L19:
        Long r46 = (Long) r45;
        if (r46 == null) goto L22;
        return r46;
    L22:
        Object r32 = m1536b(r3, r5);
        if ((r32 instanceof Number) == false) goto L25;
        Number r33 = (Number) r32;
    L26:
        if (r33 != null) goto L28;
        return null;
    L28:
        return Long.valueOf(r33.longValue());
    L25:
        r33 = null;
        goto L26
    L10:
        r44 = null;
    L14:
        r45 = null;
    L8:
        th = move-exception;
        r45 = AbstractC0040p.m116u(th);
        goto L17
    }

    /* JADX INFO: renamed from: g */
    public static Object m1541g(Field r1, Object r2) {
        r1.setAccessible(true);     // Catch: Throwable -> L5
        Object r12 = r1.get(r2);     // Catch: Throwable -> L5
    L8:
        if ((r12 instanceof C0140f) == false) goto L13;
        return null;
    L13:
        return r12;
    L5:
        th = move-exception;
        r12 = AbstractC0040p.m116u(th);
        goto L8
    }

    /* JADX INFO: renamed from: h */
    public static C0627U0 m1542h(Object r7, int r8, int r9, Set r10, List r11) {
        if (r7 != null) goto L5;
    L43:
        return null;
    L5:
        if (r9 > 5) goto L43;
        if (r10.add(r7) == true) goto L11;
        return null;
    L11:
        if (m1539e(r7) == false) goto L15;
        return new C0627U0(r7, r11);
    L15:
        if ((r7 instanceof List) == false) goto L21;
        Object r72 = AbstractC0181l.m545q0((List) r7, r8);
        if (r72 == null) goto L54;
        C0633X0 r02 = C0633X0.f1948a;
        ArrayList r1 = new ArrayList(r11.size() + 1);
        r1.addAll(r11);
        r1.add(r02);
        return m1542h(r72, r8, r9 + 1, r10, r1);
    L54:
        return null;
    L21:
        if (m1543i(r7.getClass()) == false) goto L23;
        return null;
    L23:
        Iterator r12 = m1535a(r7.getClass()).iterator();
    L25:
        if (r12.hasNext() == false) goto L43;
        Field r2 = (Field) r12.next();
        if (Modifier.isStatic(r2.getModifiers()) == true) goto L25;
        Class<?> r3 = r2.getType();
        AbstractC0307g.m702d(r3, "getType(...)");
        if (List.class.isAssignableFrom(r3) == false) goto L31;
    L34:
        boolean r32 = false;
    L35:
        if (r32 == true) goto L25;
        Object r33 = m1541g(r2, r7);
        if (r33 == null) goto L25;
        C0631W0 r5 = new C0631W0(r2);
        ArrayList r22 = new ArrayList(r11.size() + 1);
        r22.addAll(r11);
        r22.add(r5);
        C0627U0 r23 = m1542h(r33, r8, r9 + 1, r10, r22);
        if (r23 == null) goto L25;
        return r23;
    L31:
        if (Iterable.class.isAssignableFrom(r3) == true) goto L34;
        r32 = m1543i(r3);
        goto L35
    }

    /* JADX INFO: renamed from: i */
    public static boolean m1543i(Class r3) {
        if (r3.isPrimitive() == false) goto L5;
        return true;
    L5:
        if (r3.isArray() == false) goto L7;
        return true;
    L7:
        if (r3.equals(String.class) == false) goto L9;
        return true;
    L9:
        if (r3.equals(Class.class) == true) goto L28;
        String r32 = r3.getName();
        if (AbstractC0433r.m1033H0(r32, "android.", false) == false) goto L14;
        return true;
    L14:
        if (AbstractC0433r.m1033H0(r32, "java.lang.", false) == false) goto L16;
        return true;
    L16:
        if (AbstractC0433r.m1033H0(r32, "java.io.", false) == false) goto L18;
        return true;
    L18:
        if (AbstractC0433r.m1033H0(r32, "kotlin.", false) == false) goto L21;
        return true;
    L21:
        return false;
    L28:
        return true;
    }

    /* JADX INFO: renamed from: j */
    public static Method m1544j(Class r7, String r8) {
        String r02 = r7.getName() + "#" + r8;
        ConcurrentHashMap r1 = f1955c;
        Object r2 = r1.get(r02);
        if (r2 != null) goto L30;
        ConcurrentHashMap r22 = f1954b;
        Object r3 = r22.get(r7);
        Object r32 = r3;
        if (r3 != null) goto L13;
        ArrayList r33 = new ArrayList();
        Class r4 = r7;
    L7:
        if (r4 == null) goto L9;
        Method[] r5 = r4.getDeclaredMethods();
        AbstractC0307g.m702d(r5, "getDeclaredMethods(...)");
        AbstractC0188s.m561m0(r33, r5);
        r4 = r4.getSuperclass();
        goto L7
    L9:
        Object r72 = r22.putIfAbsent(r7, r33);
        r32 = r33;
        if (r72 == null) goto L13;
        r32 = r72;
    L13:
        Iterator r73 = ((List) r32).iterator();
    L14:
        Method r34 = null;
        if (r73.hasNext() == false) goto L21;
        Object r23 = r73.next();
        Method r42 = (Method) r23;
        if (AbstractC0307g.m699a(r42.getName(), r8) == false) goto L14;
        Class<?>[] r43 = r42.getParameterTypes();
        AbstractC0307g.m702d(r43, "getParameterTypes(...)");
        if (r43.length != 0) goto L14;
    L22:
        Method r24 = (Method) r23;
        if (r24 == null) goto L25;
        r24.setAccessible(true);
        r34 = r24;
    L25:
        C0629V0 r74 = new C0629V0(r34);
        Object r82 = r1.putIfAbsent(r02, r74);
        if (r82 != null) goto L28;
        r2 = r74;
        goto L30
    L28:
        r2 = r82;
        goto L30
    L21:
        r23 = null;
    L30:
        return (Method) ((C0629V0) r2).f1940a;
    }
}
