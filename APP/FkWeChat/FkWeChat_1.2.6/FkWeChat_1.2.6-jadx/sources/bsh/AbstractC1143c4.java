package bsh;

import bsh.C1281x0;
import bsh.This;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.security.Security;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import p368z4.C9849a;

/* JADX INFO: renamed from: bsh.c4 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1143c4 {

    /* JADX INFO: renamed from: a */
    public static final Object[] f3483a = new Object[0];

    /* JADX INFO: renamed from: b */
    public static final Class[] f3484b = new Class[0];

    /* JADX INFO: renamed from: c */
    public static final Map f3485c = new WeakHashMap();

    /* JADX INFO: renamed from: d */
    public static final Pattern f3486d = Pattern.compile("[^\\.]+|bsh\\..*");

    /* JADX INFO: renamed from: e */
    public static final Pattern f3487e;

    /* JADX INFO: renamed from: f */
    public static final Map f3488f;

    static {
        String property = Security.getProperty("package.access");
        if (property == null) {
            property = "null";
        }
        f3487e = Pattern.compile((String) Stream.of((Object[]) property.split(",")).filter(new Predicate() { // from class: bsh.b4
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return AbstractC1143c4.m4169g((String) obj);
            }
        }).collect(Collectors.joining("|", "(?:", ").*")));
        f3488f = new WeakHashMap();
    }

    /* JADX INFO: renamed from: A */
    public static Object[] m4130A(final Class cls) {
        return Stream.of((Object[]) cls.getFields()).filter(new Predicate() { // from class: bsh.v3
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return AbstractC1143c4.m4173i(cls, (Field) obj);
            }
        }).map(new Function() { // from class: bsh.w3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return AbstractC1143c4.m4167f((Field) obj);
            }
        }).filter(new Predicate() { // from class: bsh.x3
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return Objects.nonNull(obj);
            }
        }).toArray(new IntFunction() { // from class: bsh.y3
            @Override // java.util.function.IntFunction
            public final Object apply(int i10) {
                return AbstractC1143c4.m4161c(cls, i10);
            }
        });
    }

    /* JADX INFO: renamed from: A0 */
    public static C1231o4 m4131A0(InvocationTargetException invocationTargetException, String str, C1174f1 c1174f1, InterfaceC1188h3 interfaceC1188h3) {
        String str2 = "Method Invocation " + str;
        Throwable cause = invocationTargetException.getCause();
        boolean z10 = true;
        if ((cause instanceof C1163d2) && (!(cause instanceof C1231o4) || !((C1231o4) cause).m4996h())) {
            z10 = false;
        }
        return new C1231o4(str2, cause, interfaceC1188h3, c1174f1, z10);
    }

    /* JADX INFO: renamed from: B */
    public static Object m4132B(Class cls, Object obj, String str, boolean z10) throws C1285x4 {
        try {
            return m4196t0(cls, str, z10).mo4332q(obj, new Object[0]);
        } catch (C1165d4 e10) {
            C1182g3 c1182g3M4147Q = m4147Q(cls);
            if (m4174i0(cls) && c1182g3M4147Q != null && c1182g3M4147Q.f3570G) {
                if (z10) {
                    C1291y4 c1291y4M4354P = c1182g3M4147Q.m4354P(str, true);
                    Primitive primitive = Primitive.VOID;
                    Object objM4407y0 = (c1291y4M4354P == null || (c1291y4M4354P.m5226h("private") && !C1180g1.m4328e())) ? primitive : c1182g3M4147Q.m4407y0(c1291y4M4354P);
                    if (primitive != objM4407y0) {
                        return objM4407y0;
                    }
                } else {
                    C1182g3 c1182g3M4148R = m4148R(obj);
                    if (c1182g3M4148R != null) {
                        C1291y4 c1291y4M4354P2 = c1182g3M4148R.m4354P(str, true);
                        Primitive primitive2 = Primitive.VOID;
                        Object objM4407y02 = (c1291y4M4354P2 == null || (c1291y4M4354P2.m5226h("private") && !C1180g1.m4328e())) ? primitive2 : c1182g3M4148R.m4407y0(c1291y4M4354P2);
                        if (primitive2 != objM4407y02) {
                            return objM4407y02;
                        }
                    }
                }
            }
            throw e10;
        } catch (InvocationTargetException e11) {
            if (e11.getCause() instanceof C1211l2) {
                throw ((C1211l2) e11.getCause());
            }
            if (e11.getCause() instanceof C1279w4) {
                throw new C1285x4(e11.getCause());
            }
            throw new C1165d4("Can't access field: " + str, e11.getCause());
        }
    }

    /* JADX INFO: renamed from: C */
    public static C1265u2 m4133C(Object obj, String str) {
        C1291y4 c1291y4M4354P;
        if (obj instanceof This) {
            return new C1265u2(((This) obj).namespace, str, false);
        }
        try {
            return new C1265u2(obj, m4196t0(obj.getClass(), str, false));
        } catch (C1165d4 e10) {
            C1182g3 c1182g3M4148R = m4148R(obj);
            if (m4174i0(obj.getClass()) && c1182g3M4148R != null && c1182g3M4148R.f3570G && (c1291y4M4354P = c1182g3M4148R.m4354P(str, true)) != null && (!c1291y4M4354P.m5226h("private") || C1180g1.m4328e())) {
                return new C1265u2(c1182g3M4148R, str);
            }
            if (m4164d0(obj.getClass(), str)) {
                return new C1265u2(obj, str);
            }
            throw e10;
        }
    }

    /* JADX INFO: renamed from: D */
    public static C1265u2 m4134D(Class cls, String str) {
        C1291y4 c1291y4M4354P;
        try {
            return new C1265u2(m4196t0(cls, str, true));
        } catch (C1165d4 e10) {
            C1182g3 c1182g3M4147Q = m4147Q(cls);
            if (m4174i0(cls) && c1182g3M4147Q != null && c1182g3M4147Q.f3570G && (c1291y4M4354P = c1182g3M4147Q.m4354P(str, true)) != null && (!c1291y4M4354P.m5226h("private") || C1180g1.m4328e())) {
                return new C1265u2(c1182g3M4147Q, str);
            }
            if (m4164d0(cls, str)) {
                return new C1265u2(cls, str);
            }
            throw e10;
        }
    }

    /* JADX INFO: renamed from: E */
    public static C1168e1 m4135E(C1182g3 c1182g3, String str, Class[] clsArr) {
        return m4136F(c1182g3, str, clsArr, true);
    }

    /* JADX INFO: renamed from: F */
    public static C1168e1 m4136F(C1182g3 c1182g3, String str, Class[] clsArr, boolean z10) {
        if (c1182g3 == null) {
            return null;
        }
        try {
            return c1182g3.m4342D(str, clsArr, z10);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: G */
    public static C1168e1 m4137G(Class cls, String str, Class[] clsArr) {
        return m4135E(m4147Q(cls), str, clsArr);
    }

    /* JADX INFO: renamed from: H */
    public static C1168e1 m4138H(Object obj, String str, Class[] clsArr) {
        return m4135E(m4148R(obj), str, clsArr);
    }

    /* JADX INFO: renamed from: I */
    public static C1168e1[] m4139I(C1182g3 c1182g3) {
        return c1182g3 == null ? new C1168e1[0] : c1182g3.m4344F();
    }

    /* JADX INFO: renamed from: J */
    public static C1168e1[] m4140J(Class cls) {
        return m4139I(m4147Q(cls));
    }

    /* JADX INFO: renamed from: K */
    public static C1168e1[] m4141K(Object obj) {
        return m4139I(m4148R(obj));
    }

    /* JADX INFO: renamed from: L */
    public static Object m4142L(Class cls) {
        Map map = f3488f;
        if (map.containsKey(cls)) {
            return map.get(cls);
        }
        try {
            map.put(cls, cls.getConstructor(null).newInstance(null));
        } catch (IllegalArgumentException | ReflectiveOperationException | SecurityException unused) {
            f3488f.put(cls, null);
        }
        return f3488f.get(cls);
    }

    /* JADX INFO: renamed from: M */
    public static Object m4143M(Object obj, String str) throws C1285x4 {
        if (obj instanceof This) {
            return ((This) obj).namespace.m4352N(str);
        }
        if (obj == Primitive.NULL) {
            throw new C1285x4(new NullPointerException("Attempt to access field '" + str + "' on null value"));
        }
        try {
            return m4132B(obj.getClass(), obj, str, false);
        } catch (C1165d4 e10) {
            if (m4162c0(obj.getClass(), str)) {
                return m4145O(obj, str);
            }
            throw e10;
        }
    }

    /* JADX INFO: renamed from: N */
    public static Object m4144N(Object obj, Object obj2) {
        if (AbstractC1273v4.m5129E(obj)) {
            Map map = (Map) obj;
            return map.containsKey(obj2) ? map.get(obj2) : Primitive.VOID;
        }
        if (AbstractC1273v4.m5126B(obj)) {
            Map.Entry entry = (Map.Entry) obj;
            return obj2.equals(entry.getKey()) ? entry.getValue() : Primitive.VOID;
        }
        Class<?> cls = obj.getClass();
        if (AbstractC1273v4.m5127C(cls)) {
            Map.Entry entryM4207z = m4207z(obj2, (Map.Entry[]) obj);
            return entryM4207z != null ? entryM4207z.getValue() : Primitive.VOID;
        }
        if (obj instanceof Class) {
            cls = (Class) obj;
        }
        AbstractC1241q2 abstractC1241q2M5181f = ((C1281x0.b) C1281x0.memberCache.m38264c(cls)).m5181f(obj2.toString());
        if (abstractC1241q2M5181f == null) {
            RunnableC1205k2.m4462e("property getter not found");
            return Primitive.VOID;
        }
        try {
            return abstractC1241q2M5181f.mo4332q(obj, new Object[0]);
        } catch (InvocationTargetException unused) {
            RunnableC1205k2.m4462e("Property accessor threw exception");
            return Primitive.VOID;
        }
    }

    /* JADX INFO: renamed from: O */
    public static Object m4145O(Object obj, String str) {
        if (AbstractC1273v4.m5126B(obj)) {
            str.getClass();
            switch (str) {
                case "key":
                    return ((Map.Entry) obj).getKey();
                case "val":
                case "value":
                    return ((Map.Entry) obj).getValue();
            }
        }
        return m4144N(obj, str);
    }

    /* JADX INFO: renamed from: P */
    public static Object m4146P(Class cls, String str) {
        return m4132B(cls, null, str, true);
    }

    /* JADX INFO: renamed from: Q */
    public static C1182g3 m4147Q(Class cls) {
        if (!m4174i0(cls)) {
            return null;
        }
        try {
            return m4199v(cls, cls.getSimpleName()).namespace;
        } catch (Exception e10) {
            if (e10.getCause() instanceof C1285x4) {
                throw new C1211l2(e10.getCause().getCause().getMessage(), e10.getCause().getCause());
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: R */
    public static C1182g3 m4148R(Object obj) {
        if (obj == null) {
            return null;
        }
        Class<?> cls = obj.getClass();
        if (!m4174i0(cls)) {
            return null;
        }
        try {
            return obj instanceof Proxy ? m4147Q(cls.getInterfaces()[0]) : m4195t(obj, cls.getSimpleName()).namespace;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: S */
    public static Class m4149S(Object obj) {
        return AbstractC1273v4.m5141k(obj);
    }

    /* JADX INFO: renamed from: T */
    public static C1291y4 m4150T(C1182g3 c1182g3, String str) {
        if (c1182g3 == null) {
            return null;
        }
        try {
            return c1182g3.m4354P(str, false);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: U */
    public static C1291y4 m4151U(Class cls, String str) {
        return m4150T(m4147Q(cls), str);
    }

    /* JADX INFO: renamed from: V */
    public static C1291y4 m4152V(Object obj, String str) {
        return m4150T(m4148R(obj), str);
    }

    /* JADX INFO: renamed from: W */
    public static String[] m4153W(C1182g3 c1182g3) {
        return c1182g3 == null ? new String[0] : (String[]) Stream.of((Object[]) c1182g3.m4355Q()).filter(new Predicate() { // from class: bsh.z3
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return AbstractC1143c4.m4157a((String) obj);
            }
        }).toArray(new IntFunction() { // from class: bsh.a4
            @Override // java.util.function.IntFunction
            public final Object apply(int i10) {
                return AbstractC1143c4.m4159b(i10);
            }
        });
    }

    /* JADX INFO: renamed from: X */
    public static C1291y4[] m4154X(C1182g3 c1182g3) {
        return m4155Y(c1182g3, m4153W(c1182g3));
    }

    /* JADX INFO: renamed from: Y */
    public static C1291y4[] m4155Y(final C1182g3 c1182g3, String[] strArr) {
        return (c1182g3 == null || strArr == null) ? new C1291y4[0] : (C1291y4[]) Stream.of((Object[]) strArr).map(new Function() { // from class: bsh.r3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return AbstractC1143c4.m4150T(c1182g3, (String) obj);
            }
        }).filter(new Predicate() { // from class: bsh.t3
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return Objects.nonNull((C1291y4) obj);
            }
        }).toArray(new IntFunction() { // from class: bsh.u3
            @Override // java.util.function.IntFunction
            public final Object apply(int i10) {
                return AbstractC1143c4.m4171h(i10);
            }
        });
    }

    /* JADX INFO: renamed from: Z */
    public static C1291y4[] m4156Z(Class cls) {
        return m4154X(m4147Q(cls));
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ boolean m4157a(String str) {
        return !str.matches("_?bsh.*");
    }

    /* JADX INFO: renamed from: a0 */
    public static C1291y4[] m4158a0(Object obj) {
        return m4154X(m4148R(obj));
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ String[] m4159b(int i10) {
        return new String[i10];
    }

    /* JADX INFO: renamed from: b0 */
    public static boolean m4160b0(String str, int i10) {
        return Modifier.toString(i10).contains(str);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ Object[] m4161c(Class cls, int i10) {
        return (Object[]) Array.newInstance((Class<?>) cls, i10);
    }

    /* JADX INFO: renamed from: c0 */
    public static boolean m4162c0(Class cls, String str) {
        if (AbstractC1273v4.m5156z(cls)) {
            return true;
        }
        C9849a c9849a = C1281x0.memberCache;
        return ((C1281x0.b) c9849a.m38264c(cls)).m5188m(str) && ((C1281x0.b) c9849a.m38264c(cls)).m5181f(str) != null;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ Class[] m4163d(int i10) {
        return new Class[i10];
    }

    /* JADX INFO: renamed from: d0 */
    public static boolean m4164d0(Class cls, String str) {
        if (AbstractC1273v4.m5156z(cls)) {
            return true;
        }
        C9849a c9849a = C1281x0.memberCache;
        return ((C1281x0.b) c9849a.m38264c(cls)).m5188m(str) && ((C1281x0.b) c9849a.m38264c(cls)).m5185j(str) != null;
    }

    /* JADX INFO: renamed from: e0 */
    public static Object m4166e0(Class cls, Object[] objArr, RunnableC1205k2 runnableC1205k2, C1174f1 c1174f1, InterfaceC1188h3 interfaceC1188h3) throws C1279w4 {
        Object[] objArr2 = new Object[objArr.length + 2];
        objArr2[0] = runnableC1205k2;
        objArr2[1] = c1174f1;
        System.arraycopy(objArr, 0, objArr2, 2, objArr.length);
        try {
            return m4172h0(runnableC1205k2.m4492m(), cls, "invoke", objArr2, interfaceC1188h3);
        } catch (C1165d4 e10) {
            throw new C1279w4("Error invoking compiled command: " + e10, e10);
        } catch (InvocationTargetException e11) {
            throw new C1279w4("Error in compiled command: " + e11.getCause(), e11);
        }
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ Object m4167f(Field field) {
        try {
            return field.get(null);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: f0 */
    public static Object m4168f0(Class cls, Object obj, Class cls2, String str, Object[] objArr, RunnableC1205k2 runnableC1205k2, C1174f1 c1174f1, InterfaceC1188h3 interfaceC1188h3) throws C1163d2 {
        Object objM4170g0 = m4170g0(Primitive.castWrapper(cls, obj), str, objArr, runnableC1205k2, c1174f1, interfaceC1188h3);
        return ((objM4170g0 instanceof Primitive) && ((Primitive) objM4170g0).getType() == cls) ? Primitive.wrap(Primitive.castWrapper(cls2, objM4170g0), (Class<?>) cls2) : objM4170g0;
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ boolean m4169g(String str) {
        return !str.isEmpty();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g0 */
    public static Object m4170g0(Object obj, String str, Object[] objArr, RunnableC1205k2 runnableC1205k2, C1174f1 c1174f1, InterfaceC1188h3 interfaceC1188h3) throws C1163d2 {
        Object obj2;
        C1279w4 c1279w4;
        C1174f1 c1174f12;
        Object[] objArr2;
        Class<?> cls;
        Object obj3;
        C1174f1 c1174f13;
        AbstractC1241q2 abstractC1241q2M4198u0;
        if ((obj instanceof This) && !This.isExposedThisMethod(str)) {
            return ((This) obj).invokeMethod(str, objArr, runnableC1205k2, c1174f1, interfaceC1188h3, false);
        }
        InterfaceC1188h3 interfaceC1188h32 = interfaceC1188h3;
        C1281x0 c1281x0M4492m = runnableC1205k2.m4492m();
        boolean z10 = obj instanceof Primitive;
        try {
            Class<?> type = obj.getClass();
            if (z10) {
                try {
                    if (str.equals("equals")) {
                        return Boolean.valueOf(((Primitive) obj).equals(objArr[0]));
                    }
                    if (obj != Primitive.NULL && obj != Primitive.VOID) {
                        type = ((Primitive) obj).getType();
                        obj = Primitive.unwrap(obj);
                    }
                    if (!str.equals("getType")) {
                        if (str.equals("getClass")) {
                        }
                    }
                    return obj == Primitive.VOID ? ((Primitive) obj).getType() : type;
                } catch (C1279w4 e10) {
                    c1279w4 = e10;
                    c1174f12 = c1174f1;
                    throw c1279w4.mo5167a(interfaceC1188h32, c1174f12);
                }
            }
            Class<?> cls2 = type;
            Object obj4 = obj;
            objArr2 = objArr;
            try {
                try {
                    abstractC1241q2M4198u0 = m4198u0(c1281x0M4492m, cls2, obj4, str, objArr2, false);
                    cls = cls2;
                    obj3 = obj4;
                } catch (InvocationTargetException e11) {
                    throw m4131A0(e11, str, c1174f1, interfaceC1188h32);
                }
            } catch (C1165d4 e12) {
                e = e12;
                cls = cls2;
                obj3 = obj4;
            }
        } catch (C1279w4 e13) {
            e = e13;
            obj2 = c1174f1;
        }
        try {
            C1182g3 c1182g3M4148R = m4148R(obj3);
            if (c1182g3M4148R != null) {
                c1182g3M4148R.m4387o0(interfaceC1188h32);
            }
            return abstractC1241q2M4198u0.mo4332q(obj3, objArr2);
        } catch (C1165d4 e14) {
            e = e14;
            C1165d4 c1165d4 = e;
            try {
                if (obj3 == Primitive.VOID) {
                    throw new C1163d2("Attempt to invoke method: " + str + "() on undefined", interfaceC1188h32, c1174f1, c1165d4);
                }
                if (obj3 instanceof AbstractC1128a1) {
                    try {
                        try {
                            return ((AbstractC1128a1) obj3).mo4062g(objArr2 != null ? objArr2 : new Object[0]);
                        } catch (Exception e15) {
                            throw new C1163d2("Lambda execution failed: " + e15.getMessage(), interfaceC1188h32, c1174f1, e15);
                        }
                    } catch (C1163d2 e16) {
                        if (e16.m4271a() != null) {
                            throw e16;
                        }
                        e16.m4276f(interfaceC1188h32);
                        throw e16;
                    } catch (C1279w4 e17) {
                        throw e17.mo5167a(interfaceC1188h32, c1174f1);
                    }
                }
                if (!z10 || runnableC1205k2.m4499v()) {
                    c1174f13 = c1174f1;
                } else {
                    try {
                        if (!AbstractC1273v4.m5153w(obj3)) {
                            try {
                                return m4170g0(obj3, str, objArr2, runnableC1205k2, c1174f1, interfaceC1188h32);
                            } catch (C1231o4 e18) {
                                throw e18;
                            } catch (C1163d2 unused) {
                                c1174f13 = c1174f1;
                                interfaceC1188h32 = interfaceC1188h3;
                                throw new C1163d2("Error in method invocation: " + c1165d4.getMessage(), interfaceC1188h32, c1174f13, c1165d4);
                            } catch (C1279w4 e19) {
                                c1279w4 = e19;
                                c1174f12 = c1174f1;
                                interfaceC1188h32 = interfaceC1188h3;
                                throw c1279w4.mo5167a(interfaceC1188h32, c1174f12);
                            }
                        }
                        try {
                            return m4194s0(obj3, cls, str, objArr2, runnableC1205k2, c1174f1, interfaceC1188h32);
                        } catch (C1231o4 e20) {
                            e = e20;
                            throw e;
                        } catch (C1163d2 unused2) {
                            c1174f13 = c1174f1;
                            interfaceC1188h32 = interfaceC1188h32;
                            throw new C1163d2("Error in method invocation: " + c1165d4.getMessage(), interfaceC1188h32, c1174f13, c1165d4);
                        } catch (C1279w4 e21) {
                            e = e21;
                            obj2 = c1174f1;
                            interfaceC1188h32 = interfaceC1188h32;
                            c1279w4 = e;
                            c1174f12 = obj2;
                            throw c1279w4.mo5167a(interfaceC1188h32, c1174f12);
                        }
                    } catch (C1231o4 e22) {
                        e = e22;
                    } catch (C1163d2 unused3) {
                        c1174f13 = c1174f1;
                        throw new C1163d2("Error in method invocation: " + c1165d4.getMessage(), interfaceC1188h32, c1174f13, c1165d4);
                    }
                }
                throw new C1163d2("Error in method invocation: " + c1165d4.getMessage(), interfaceC1188h32, c1174f13, c1165d4);
            } catch (C1279w4 e23) {
                e = e23;
                obj2 = objArr2;
            }
            c1279w4 = e;
            c1174f12 = obj2;
            throw c1279w4.mo5167a(interfaceC1188h32, c1174f12);
        }
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ C1291y4[] m4171h(int i10) {
        return new C1291y4[i10];
    }

    /* JADX INFO: renamed from: h0 */
    public static Object m4172h0(C1281x0 c1281x0, Class cls, String str, Object[] objArr, InterfaceC1188h3 interfaceC1188h3) {
        RunnableC1205k2.m4462e("invoke static Method");
        C1182g3 c1182g3M4147Q = m4147Q(cls);
        if (c1182g3M4147Q != null) {
            c1182g3M4147Q.m4387o0(interfaceC1188h3);
        }
        return m4198u0(c1281x0, cls, null, str, objArr, true).mo4332q(null, objArr);
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ boolean m4173i(Class cls, Field field) {
        return field.getType() == cls;
    }

    /* JADX INFO: renamed from: i0 */
    public static boolean m4174i0(Class cls) {
        return (cls == null || cls == GeneratedClass.class || !GeneratedClass.class.isAssignableFrom(cls)) ? false : true;
    }

    /* JADX INFO: renamed from: j */
    public static String m4175j(String str, String str2) {
        Map map = f3485c;
        if (!map.containsKey(str2)) {
            char[] charArray = str2.toCharArray();
            charArray[0] = Character.toUpperCase(charArray[0]);
            map.put(str2, new String(charArray));
        }
        return str + ((String) map.get(str2));
    }

    /* JADX INFO: renamed from: j0 */
    public static boolean m4176j0(Class cls) {
        return C1180g1.m4328e() || !f3487e.matcher(cls.getName()).matches();
    }

    /* JADX INFO: renamed from: k */
    public static C1165d4 m4177k(Class cls, Class[] clsArr) {
        if (clsArr.length == 0) {
            return new C1165d4("Can't find default constructor for: " + cls);
        }
        return new C1165d4("Can't find constructor: " + AbstractC1225n4.m4976o(cls.getName(), clsArr) + " in class: " + cls.getName());
    }

    /* JADX INFO: renamed from: k0 */
    public static boolean m4178k0(Class cls) {
        return f3486d.matcher(cls.getName()).matches();
    }

    /* JADX INFO: renamed from: l */
    public static void m4179l(AbstractC1241q2 abstractC1241q2, boolean z10, Class cls) throws C1279w4 {
        if (abstractC1241q2 == null || !z10 || abstractC1241q2.mo4109v()) {
            return;
        }
        throw new C1279w4("Cannot reach instance method: " + AbstractC1225n4.m4976o(abstractC1241q2.getName(), abstractC1241q2.mo4321m()) + " from static context: " + cls.getName());
    }

    /* JADX INFO: renamed from: l0 */
    public static boolean m4180l0(Class cls) {
        return Modifier.isPrivate(cls.getModifiers());
    }

    /* JADX INFO: renamed from: m */
    public static Object m4181m(Class cls, Object obj, Object[] objArr) throws InvocationTargetException {
        if (cls == null) {
            return Primitive.NULL;
        }
        if (cls.isInterface()) {
            throw new C1165d4("Can't create instance of an interface: " + cls);
        }
        Class[] clsArrM5143m = AbstractC1273v4.m5143m(objArr);
        if (cls.isMemberClass() && !m4186o0(cls) && obj != null) {
            clsArrM5143m = (Class[]) Stream.concat(Stream.of(obj.getClass()), Stream.of((Object[]) clsArrM5143m)).toArray(new IntFunction() { // from class: bsh.s3
                @Override // java.util.function.IntFunction
                public final Object apply(int i10) {
                    return AbstractC1143c4.m4163d(i10);
                }
            });
        }
        RunnableC1205k2.m4462e("Looking for most specific constructor: ", cls);
        AbstractC1241q2 abstractC1241q2M5183h = ((C1281x0.b) C1281x0.memberCache.m38264c(cls)).m5183h(cls.getName(), clsArrM5143m);
        if (abstractC1241q2M5183h == null || !(objArr.length == abstractC1241q2M5183h.mo4320l() || abstractC1241q2M5183h.mo4323w() || abstractC1241q2M5183h.mo4108t())) {
            throw m4177k(cls, clsArrM5143m);
        }
        try {
            return abstractC1241q2M5183h.mo4332q(obj, objArr);
        } catch (InvocationTargetException e10) {
            if (!(e10.getCause().getCause() instanceof IllegalAccessException)) {
                throw e10;
            }
            throw new C1165d4("We don't have permission to create an instance. " + e10.getCause().getCause().getMessage() + " Use setAccessibility(true) to enable access.", e10.getCause().getCause());
        }
    }

    /* JADX INFO: renamed from: m0 */
    public static boolean m4182m0(Class cls) {
        return Modifier.isPublic(cls.getModifiers());
    }

    /* JADX INFO: renamed from: n */
    public static Object m4183n(Class cls, Object[] objArr) {
        return m4181m(cls, null, objArr);
    }

    /* JADX INFO: renamed from: n0 */
    public static boolean m4184n0(Member member) {
        return Modifier.isPublic(member.getModifiers());
    }

    /* JADX INFO: renamed from: o */
    public static C1168e1 m4185o(Class[] clsArr, List list) {
        RunnableC1205k2.m4462e("find most specific BshMethod for: " + Arrays.toString(clsArr));
        int iM4187p = m4187p(clsArr, list);
        if (iM4187p == -1) {
            return null;
        }
        return (C1168e1) list.get(iM4187p);
    }

    /* JADX INFO: renamed from: o0 */
    public static boolean m4186o0(Class cls) {
        return Modifier.isStatic(cls.getModifiers());
    }

    /* JADX INFO: renamed from: p */
    public static int m4187p(Class[] clsArr, List list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            RunnableC1205k2.m4462e("  " + i10 + ":" + ((C1168e1) list.get(i10)).toString() + " " + ((C1168e1) list.get(i10)).getClass().getName());
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            Class[] clsArrMo4123k = ((C1168e1) it.next()).mo4123k();
            if (clsArr.length == clsArrMo4123k.length) {
                arrayList2.add(Integer.valueOf(i11));
                arrayList.add(clsArrMo4123k);
            }
            i11++;
        }
        int iM4193s = m4193s(clsArr, (Class[][]) arrayList.toArray(new Class[arrayList.size()][]));
        if (iM4193s >= 0) {
            int iIntValue = ((Integer) arrayList2.get(iM4193s)).intValue();
            RunnableC1205k2.m4462e(" remap: " + arrayList2);
            RunnableC1205k2.m4462e(" match:" + iIntValue);
            return iIntValue;
        }
        arrayList.clear();
        arrayList2.clear();
        Iterator it2 = list.iterator();
        int i12 = 0;
        while (it2.hasNext()) {
            C1168e1 c1168e1 = (C1168e1) it2.next();
            Class[] clsArrMo4123k2 = c1168e1.mo4123k();
            if (c1168e1.m4294r() && clsArr.length >= clsArrMo4123k2.length - 1) {
                Class[] clsArr2 = new Class[clsArr.length];
                System.arraycopy(clsArrMo4123k2, 0, clsArr2, 0, clsArrMo4123k2.length - 1);
                Arrays.fill(clsArr2, clsArrMo4123k2.length - 1, clsArr.length, clsArrMo4123k2[clsArrMo4123k2.length - 1].getComponentType());
                arrayList2.add(Integer.valueOf(i12));
                arrayList.add(clsArr2);
            }
            i12++;
        }
        int iM4193s2 = m4193s(clsArr, (Class[][]) arrayList.toArray(new Class[arrayList.size()][]));
        if (iM4193s2 < 0) {
            return iM4193s2;
        }
        int iIntValue2 = ((Integer) arrayList2.get(iM4193s2)).intValue();
        RunnableC1205k2.m4462e(" remap (varargs): " + Arrays.toString(arrayList2.toArray(new Integer[0])));
        RunnableC1205k2.m4462e(" match (varargs):" + iIntValue2);
        return iIntValue2;
    }

    /* JADX INFO: renamed from: p0 */
    public static boolean m4188p0(Member member) {
        return Modifier.isStatic(member.getModifiers());
    }

    /* JADX INFO: renamed from: q */
    public static AbstractC1241q2 m4189q(Class[] clsArr, List list) {
        RunnableC1205k2.m4462e("find most specific Invocable for: " + Arrays.toString(clsArr));
        int iM4191r = m4191r(clsArr, list);
        if (iM4191r == -1) {
            return null;
        }
        return (AbstractC1241q2) list.get(iM4191r);
    }

    /* JADX INFO: renamed from: q0 */
    public static void m4190q0(String str, AbstractC1241q2 abstractC1241q2, List list) {
        if (((Boolean) RunnableC1205k2.f3633D.get()).booleanValue()) {
            m4192r0(str, abstractC1241q2, list.toArray());
        }
    }

    /* JADX INFO: renamed from: r */
    public static int m4191r(Class[] clsArr, List list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            RunnableC1205k2.m4462e("  " + i10 + "=" + ((AbstractC1241q2) list.get(i10)).toString());
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            Class[] clsArrMo4321m = ((AbstractC1241q2) it.next()).mo4321m();
            if (clsArr.length == clsArrMo4321m.length) {
                arrayList2.add(Integer.valueOf(i11));
                arrayList.add(clsArrMo4321m);
            }
            i11++;
        }
        int iM4193s = m4193s(clsArr, (Class[][]) arrayList.toArray(new Class[arrayList.size()][]));
        if (iM4193s >= 0) {
            int iIntValue = ((Integer) arrayList2.get(iM4193s)).intValue();
            RunnableC1205k2.m4462e(" remap=" + Arrays.toString(arrayList2.toArray(new Integer[0])));
            RunnableC1205k2.m4462e(" match=" + iIntValue);
            return iIntValue;
        }
        arrayList.clear();
        arrayList2.clear();
        Iterator it2 = list.iterator();
        int i12 = 0;
        while (it2.hasNext()) {
            AbstractC1241q2 abstractC1241q2 = (AbstractC1241q2) it2.next();
            Class[] clsArrMo4321m2 = abstractC1241q2.mo4321m();
            if (abstractC1241q2.mo4323w() && clsArr.length >= clsArrMo4321m2.length - 1) {
                Class[] clsArr2 = new Class[clsArr.length];
                System.arraycopy(clsArrMo4321m2, 0, clsArr2, 0, clsArrMo4321m2.length - 1);
                Arrays.fill(clsArr2, clsArrMo4321m2.length - 1, clsArr.length, abstractC1241q2.mo4322p());
                arrayList2.add(Integer.valueOf(i12));
                arrayList.add(clsArr2);
            }
            i12++;
        }
        int iM4193s2 = m4193s(clsArr, (Class[][]) arrayList.toArray(new Class[arrayList.size()][]));
        if (iM4193s2 >= 0) {
            iM4193s2 = ((Integer) arrayList2.get(iM4193s2)).intValue();
        }
        RunnableC1205k2.m4462e(" remap (varargs) =" + Arrays.toString(arrayList2.toArray(new Integer[0])));
        RunnableC1205k2.m4462e(" match (varargs) =" + iM4193s2);
        return iM4193s2;
    }

    /* JADX INFO: renamed from: r0 */
    public static void m4192r0(String str, AbstractC1241q2 abstractC1241q2, Object[] objArr) {
        if (((Boolean) RunnableC1205k2.f3633D.get()).booleanValue()) {
            RunnableC1205k2.m4462e(str, abstractC1241q2, " with args:");
            for (int i10 = 0; i10 < objArr.length; i10++) {
                Object obj = objArr[i10];
                RunnableC1205k2.m4462e("args[", Integer.valueOf(i10), "] = ", obj, " type = ", obj == null ? "<unknown>" : obj.getClass());
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public static int m4193s(Class[] clsArr, Class[][] clsArr2) {
        int i10 = 1;
        while (true) {
            int i11 = -1;
            if (i10 > 4) {
                return -1;
            }
            Class[] clsArr3 = null;
            for (int i12 = 0; i12 < clsArr2.length; i12++) {
                Class[] clsArr4 = clsArr2[i12];
                if ((clsArr3 == null || !AbstractC1273v4.m5131a(clsArr4, clsArr3)) && AbstractC1273v4.m5130F(clsArr, clsArr4, i10) && (clsArr3 == null || AbstractC1273v4.m5131a(clsArr, clsArr4) || (AbstractC1273v4.m5130F(clsArr4, clsArr3, 1) && !AbstractC1273v4.m5131a(clsArr, clsArr3)))) {
                    i11 = i12;
                    clsArr3 = clsArr4;
                }
            }
            if (clsArr3 != null) {
                return i11;
            }
            i10++;
        }
    }

    /* JADX INFO: renamed from: s0 */
    public static Object m4194s0(Object obj, Class cls, String str, Object[] objArr, RunnableC1205k2 runnableC1205k2, C1174f1 c1174f1, InterfaceC1188h3 interfaceC1188h3) throws C1163d2 {
        Class cls2 = AbstractC1273v4.m5147q(obj) ? BigDecimal.class : BigInteger.class;
        try {
            return m4168f0(cls2, obj, cls, str, objArr, runnableC1205k2, c1174f1, interfaceC1188h3);
        } catch (C1231o4 e10) {
            throw e10.mo4275e("Method found on " + cls2.getSimpleName() + " but with error");
        } catch (C1163d2 unused) {
            return m4168f0(AbstractC1273v4.m5147q(obj) ? BigInteger.class : BigDecimal.class, obj, cls, str, objArr, runnableC1205k2, c1174f1, interfaceC1188h3);
        }
    }

    /* JADX INFO: renamed from: t */
    public static This m4195t(Object obj, String str) {
        try {
            return (This) Primitive.unwrap(m4143M(obj, This.Keys.BSHTHIS + str));
        } catch (Exception e10) {
            C1237p4.m5045a("Generated class: Error getting This ", e10);
            return null;
        }
    }

    /* JADX INFO: renamed from: t0 */
    public static AbstractC1241q2 m4196t0(Class cls, String str, boolean z10) throws C1279w4 {
        AbstractC1241q2 abstractC1241q2M5180e = ((C1281x0.b) C1281x0.memberCache.m38264c(cls)).m5180e(str);
        if (abstractC1241q2M5180e == null) {
            throw new C1165d4("No such field: " + str + " for class: " + cls.getName());
        }
        if (!z10 || abstractC1241q2M5180e.mo4109v()) {
            return abstractC1241q2M5180e;
        }
        throw new C1279w4("Can't reach instance field: " + str + " from static context: " + cls.getName());
    }

    /* JADX INFO: renamed from: u */
    public static C1283x2 m4197u(Class cls) {
        try {
            return (C1283x2) m4151U(cls, This.Keys.BSHCLASSMODIFIERS.toString()).m5225g();
        } catch (Exception unused) {
            return new C1283x2(cls.isInterface() ? 1 : 0);
        }
    }

    /* JADX INFO: renamed from: u0 */
    public static AbstractC1241q2 m4198u0(C1281x0 c1281x0, Class cls, Object obj, String str, Object[] objArr, boolean z10) throws C1285x4 {
        if (obj == Primitive.NULL) {
            throw new C1285x4(new NullPointerException("Attempt to invoke method " + str + " on null value"));
        }
        Class[] clsArrM5143m = AbstractC1273v4.m5143m(objArr);
        AbstractC1241q2 abstractC1241q2M4202w0 = m4202w0(cls, str, clsArrM5143m, z10);
        if (c1281x0 != null && c1281x0.getStrictJava() && abstractC1241q2M4202w0 != null && abstractC1241q2M4202w0.getDeclaringClass().isInterface() && abstractC1241q2M4202w0.getDeclaringClass() != cls && Modifier.isStatic(abstractC1241q2M4202w0.getModifiers())) {
            abstractC1241q2M4202w0 = null;
        }
        if (abstractC1241q2M4202w0 != null) {
            return abstractC1241q2M4202w0;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(z10 ? "Static method " : "Method ");
        sb2.append(AbstractC1225n4.m4976o(str, clsArrM5143m));
        sb2.append(" not found in class'");
        sb2.append(cls.getName());
        sb2.append("'");
        throw new C1165d4(sb2.toString());
    }

    /* JADX INFO: renamed from: v */
    public static This m4199v(Class cls, String str) {
        try {
            return (This) m4146P(cls, This.Keys.BSHSTATIC + str);
        } catch (Exception e10) {
            C1237p4.m5045a("Unable to get class static space: ", e10);
            return null;
        }
    }

    /* JADX INFO: renamed from: v0 */
    public static AbstractC1241q2 m4200v0(Class cls, String str, boolean z10) {
        try {
            return m4196t0(cls, str, z10);
        } catch (C1165d4 unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: w */
    public static C1168e1 m4201w(Class cls, String str, Class[] clsArr) {
        if (!m4174i0(cls)) {
            return null;
        }
        C1168e1 c1168e1M4137G = m4137G(cls, str, clsArr);
        return (c1168e1M4137G != null || cls.isInterface()) ? c1168e1M4137G : m4138H(m4142L(cls), str, clsArr);
    }

    /* JADX INFO: renamed from: w0 */
    public static AbstractC1241q2 m4202w0(Class cls, String str, Class[] clsArr, boolean z10) {
        if (cls == null) {
            throw new C1211l2("null class");
        }
        AbstractC1241q2 abstractC1241q2M5183h = ((C1281x0.b) C1281x0.memberCache.m38264c(cls)).m5183h(str, clsArr);
        RunnableC1205k2.m4462e("resolved java method: ", abstractC1241q2M5183h, " on class: ", cls);
        m4179l(abstractC1241q2M5183h, z10, cls);
        return abstractC1241q2M5183h;
    }

    /* JADX INFO: renamed from: x */
    public static C1168e1[] m4203x(Class cls) {
        return !m4174i0(cls) ? new C1168e1[0] : cls.isInterface() ? m4140J(cls) : m4141K(m4142L(cls));
    }

    /* JADX INFO: renamed from: x0 */
    public static Object m4204x0(Object obj, Object obj2, Object obj3) {
        if (AbstractC1273v4.m5129E(obj)) {
            return ((Map) obj).put(obj2, Primitive.unwrap(obj3));
        }
        if (AbstractC1273v4.m5126B(obj)) {
            Map.Entry entry = (Map.Entry) obj;
            if (obj2.equals(entry.getKey())) {
                return entry.setValue(Primitive.unwrap(obj3));
            }
            StringBuilder sb2 = new StringBuilder("No such property setter: ");
            sb2.append(obj2);
            String strM4982u = AbstractC1225n4.m4982u(obj);
            sb2.append(" for type: ");
            sb2.append(strM4982u);
            throw new C1165d4(sb2.toString());
        }
        Class<?> cls = obj.getClass();
        if (AbstractC1273v4.m5127C(cls)) {
            return m4207z(obj2, (Map.Entry[]) obj).setValue(Primitive.unwrap(obj3));
        }
        if (obj instanceof Class) {
            cls = (Class) obj;
        }
        AbstractC1241q2 abstractC1241q2M5185j = ((C1281x0.b) C1281x0.memberCache.m38264c(cls)).m5185j(obj2.toString());
        if (abstractC1241q2M5185j != null) {
            try {
                return abstractC1241q2M5185j.mo4332q(obj, Primitive.unwrap(obj3));
            } catch (InvocationTargetException e10) {
                throw new C1165d4("Property accessor threw exception: " + e10.getCause(), e10.getCause());
            }
        }
        StringBuilder sb3 = new StringBuilder("No such property setter: ");
        sb3.append(obj2);
        String strM4981t = AbstractC1225n4.m4981t(cls);
        sb3.append(" for type: ");
        sb3.append(strM4981t);
        throw new C1165d4(sb3.toString());
    }

    /* JADX INFO: renamed from: y */
    public static C1291y4[] m4205y(Class cls) {
        return !m4174i0(cls) ? new C1291y4[0] : cls.isInterface() ? m4156Z(cls) : m4158a0(m4142L(cls));
    }

    /* JADX INFO: renamed from: y0 */
    public static Object m4206y0(Object obj, String str, Object obj2) {
        if (AbstractC1273v4.m5126B(obj)) {
            str.getClass();
            if (str.equals("val") || str.equals("value")) {
                return ((Map.Entry) obj).setValue(obj2);
            }
        }
        return m4204x0(obj, str, obj2);
    }

    /* JADX INFO: renamed from: z */
    public static Map.Entry m4207z(Object obj, Map.Entry[] entryArr) {
        for (Map.Entry entry : entryArr) {
            if (obj.equals(entry.getKey())) {
                return entry;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: z0 */
    public static C1168e1 m4208z0(Class cls, String str) {
        AbstractC1241q2 abstractC1241q2M5186k = ((C1281x0.b) C1281x0.memberCache.m38264c(cls)).m5186k(str);
        if (abstractC1241q2M5186k != null) {
            return new C1168e1(abstractC1241q2M5186k, (Object) null);
        }
        return null;
    }
}
