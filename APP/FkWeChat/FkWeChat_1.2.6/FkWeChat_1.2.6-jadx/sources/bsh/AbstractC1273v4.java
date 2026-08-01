package bsh;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: renamed from: bsh.v4 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1273v4 {

    /* JADX INFO: renamed from: a */
    public static final Map f3847a = Collections.unmodifiableMap(new a());

    /* JADX INFO: renamed from: b */
    public static Primitive f3848b = new Primitive(1);

    /* JADX INFO: renamed from: c */
    public static Primitive f3849c = new Primitive(-1);

    /* JADX INFO: renamed from: bsh.v4$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public class a extends HashMap {
        private static final long serialVersionUID = 1;

        public a() {
            put(Byte.TYPE, 0);
            put(Byte.class, 1);
            put(Short.TYPE, 2);
            put(Short.class, 3);
            put(Character.TYPE, 4);
            put(Character.class, 5);
            put(Integer.TYPE, 6);
            put(Integer.class, 7);
            put(Long.TYPE, 8);
            put(Long.class, 9);
            put(Float.TYPE, 10);
            put(Float.class, 11);
            put(Double.TYPE, 12);
            put(Double.class, 13);
            put(BigInteger.class, 14);
            put(BigDecimal.class, 15);
        }
    }

    /* JADX INFO: renamed from: bsh.v4$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class b extends AbstractMap.SimpleEntry {
        private static final long serialVersionUID = 1;

        public b(Object obj, Object obj2) {
            super(obj, obj2);
        }
    }

    /* JADX INFO: renamed from: bsh.v4$c */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class c {

        /* JADX INFO: renamed from: a */
        public static final Map f3850a = Collections.unmodifiableMap(new a());

        /* JADX INFO: renamed from: bsh.v4$c$a */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public class a extends HashMap {
            private static final long serialVersionUID = 1;

            public a() {
                put("O", Byte.TYPE);
                put("S", Short.TYPE);
                put("I", Integer.TYPE);
                put("L", Long.TYPE);
                put("W", BigInteger.class);
                put("w", BigDecimal.class);
                put("d", Double.TYPE);
                put("f", Float.TYPE);
            }
        }

        /* JADX INFO: renamed from: a */
        public static Class m5157a(Character ch) {
            return (Class) f3850a.get(m5161e(ch));
        }

        /* JADX INFO: renamed from: b */
        public static Class m5158b(Character ch) {
            return (Class) f3850a.get(m5162f(ch));
        }

        /* JADX INFO: renamed from: c */
        public static boolean m5159c(Character ch) {
            return f3850a.containsKey(m5161e(ch));
        }

        /* JADX INFO: renamed from: d */
        public static boolean m5160d(Character ch) {
            return f3850a.containsKey(m5162f(ch));
        }

        /* JADX INFO: renamed from: e */
        public static String m5161e(Character ch) {
            return ch.toString().toLowerCase();
        }

        /* JADX INFO: renamed from: f */
        public static String m5162f(Character ch) {
            return ch.toString().toUpperCase();
        }
    }

    /* JADX INFO: renamed from: A */
    public static boolean m5125A(Class cls) {
        return Map.Entry.class.isAssignableFrom(cls);
    }

    /* JADX INFO: renamed from: B */
    public static boolean m5126B(Object obj) {
        return obj instanceof Map.Entry;
    }

    /* JADX INFO: renamed from: C */
    public static boolean m5127C(Class cls) {
        return cls.isArray() && m5125A(cls.getComponentType());
    }

    /* JADX INFO: renamed from: D */
    public static boolean m5128D(Class cls) {
        return Map.class.isAssignableFrom(cls);
    }

    /* JADX INFO: renamed from: E */
    public static boolean m5129E(Object obj) {
        return obj instanceof Map;
    }

    /* JADX INFO: renamed from: F */
    public static boolean m5130F(Class[] clsArr, Class[] clsArr2, int i10) {
        if (i10 != 3 && clsArr.length != clsArr2.length) {
            return false;
        }
        for (int i11 = 0; i11 < clsArr.length; i11++) {
            if (!m5144n(clsArr[i11], clsArr2[i11], i10)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m5131a(Class[] clsArr, Class[] clsArr2) {
        if (clsArr.length != clsArr2.length) {
            return false;
        }
        for (int i10 = 0; i10 < clsArr.length; i10++) {
            if (clsArr[i10] != clsArr2[i10]) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public static int m5132b(Class cls) {
        if (cls == null || !cls.isArray()) {
            return 0;
        }
        return cls.getName().lastIndexOf(91) + 1;
    }

    /* JADX INFO: renamed from: c */
    public static Class m5133c(Class cls) {
        if (cls == null) {
            return null;
        }
        while (cls.isArray()) {
            cls = cls.getComponentType();
        }
        return cls;
    }

    /* JADX INFO: renamed from: d */
    public static C1279w4 m5134d(Class cls, Class cls2, Object obj, int i10) {
        return m5136f(AbstractC1225n4.m4981t(cls), AbstractC1225n4.m4981t(cls2), obj, i10);
    }

    /* JADX INFO: renamed from: e */
    public static C1279w4 m5135e(String str, String str2, int i10) {
        return m5136f(str, str2, null, i10);
    }

    /* JADX INFO: renamed from: f */
    public static C1279w4 m5136f(String str, String str2, Object obj, int i10) {
        String str3 = _UrlKt.FRAGMENT_ENCODE_SET;
        if (i10 == 1) {
            StringBuilder sb2 = new StringBuilder("Cannot assign ");
            sb2.append(str2);
            if (obj != null) {
                str3 = " with value \"" + obj + "\"";
            }
            sb2.append(str3);
            sb2.append(" to ");
            sb2.append(str);
            return new C1279w4(sb2.toString());
        }
        StringBuilder sb3 = new StringBuilder("Cannot cast ");
        sb3.append(str2);
        if (obj != null) {
            str3 = " with value \"" + obj + "\"";
        }
        sb3.append(str3);
        sb3.append(" to ");
        sb3.append(str);
        return new C1285x4(new ClassCastException(sb3.toString()));
    }

    /* JADX INFO: renamed from: g */
    public static Object m5137g(Class cls, Class cls2, Object obj, int i10, boolean z10) throws C1279w4 {
        if (cls == null || cls == cls2) {
            if (z10) {
                return f3848b;
            }
        } else {
            if (cls2 != null && cls2.isArray() && (i10 == 0 || Collection.class.isAssignableFrom(cls))) {
                return z10 ? f3848b : AbstractC1269v0.m5110b(cls, cls2, obj);
            }
            boolean zIsPrimitive = cls.isPrimitive();
            Class cls3 = Void.TYPE;
            if (zIsPrimitive) {
                if (cls2 == cls3 || cls2 == null || cls2.isPrimitive()) {
                    if (!Primitive.class.isInstance(obj)) {
                        obj = Primitive.wrap(obj, (Class<?>) cls2);
                    }
                    return Primitive.castPrimitive(cls, cls2, (Primitive) obj, z10, i10);
                }
                if (((m5152v(cls2) || String.valueOf(obj).matches("[-+0-9.]*")) && m5152v(cls)) || cls == Boolean.TYPE) {
                    return z10 ? f3848b : Primitive.wrap(Primitive.castWrapper(cls, obj), (Class<?>) cls);
                }
                if (z10) {
                    return f3849c;
                }
                throw m5134d(cls, cls2, obj, i10);
            }
            if (cls2 == cls3 || cls2 == null || cls2.isPrimitive() || cls == Boolean.class || (String.valueOf(obj).matches("[-+0-9.]*") && m5152v(cls))) {
                if (Primitive.isWrapperType(cls) && cls2 != cls3 && cls2 != null) {
                    return z10 ? f3848b : Primitive.castWrapper(Primitive.unboxType(cls), obj);
                }
                if (cls == Object.class && cls2 != cls3 && cls2 != null) {
                    return z10 ? f3848b : Primitive.unwrap(obj);
                }
                if (cls2 == null || cls2.isPrimitive() || !cls.isAssignableFrom(cls2)) {
                    return Primitive.castPrimitive(cls, cls2, (Primitive) obj, z10, i10);
                }
                if (z10) {
                    return f3848b;
                }
            } else {
                if (m5148r(cls) && (obj instanceof AbstractC1128a1)) {
                    return z10 ? f3848b : ((AbstractC1128a1) obj).m4060c(cls);
                }
                if (cls.isAssignableFrom(cls2)) {
                    if (z10) {
                        return f3848b;
                    }
                    if (AbstractC1143c4.m4174i0(cls) && !Proxy.isProxyClass(cls2)) {
                        return AbstractC1143c4.m4195t(obj, cls.getSimpleName());
                    }
                } else {
                    if (!This.class.isInstance(obj) || ((This) obj).getNameSpace().f3573J != cls) {
                        if (cls.isInterface() && This.class.isAssignableFrom(cls2)) {
                            return z10 ? f3848b : ((This) obj).getInterface((Class<?>) cls);
                        }
                        if (Primitive.isWrapperType(cls) && Primitive.isWrapperType(cls2)) {
                            return z10 ? f3848b : Primitive.castWrapper(cls, obj);
                        }
                        if (z10) {
                            return f3849c;
                        }
                        throw m5134d(cls, cls2, obj, i10);
                    }
                    if (z10) {
                        return f3848b;
                    }
                }
            }
        }
        return obj;
    }

    /* JADX INFO: renamed from: h */
    public static Object m5138h(Object obj, Class cls, int i10) {
        if (obj != null) {
            return m5137g(cls, m5141k(obj), obj, i10, false);
        }
        if (i10 == 0) {
            return (m5155y(cls) || Primitive.isWrapperType(cls)) ? Primitive.getDefaultValue(cls) : Primitive.NULL;
        }
        throw new C1211l2("Cast error: null fromValue for toType: ".concat(cls.getSimpleName()));
    }

    /* JADX INFO: renamed from: i */
    public static String m5139i(String str) {
        int iLastIndexOf = str.lastIndexOf("$");
        return iLastIndexOf == -1 ? str : str.substring(iLastIndexOf + 1);
    }

    /* JADX INFO: renamed from: j */
    public static Class m5140j(Class cls, Class cls2) {
        if (cls != null) {
            if (cls2 == null || cls.isAssignableFrom(cls2)) {
                return cls;
            }
            Map map = f3847a;
            if (!map.containsKey(cls) || !map.containsKey(cls2)) {
                do {
                    cls = cls.getSuperclass();
                    if (cls == null || Object.class == cls) {
                        return Object.class;
                    }
                } while (!cls.isAssignableFrom(cls2));
                return cls;
            }
            if (((Integer) map.get(cls)).intValue() >= ((Integer) map.get(cls2)).intValue()) {
                return cls;
            }
        }
        return cls2;
    }

    /* JADX INFO: renamed from: k */
    public static Class m5141k(Object obj) {
        return m5142l(obj, false);
    }

    /* JADX INFO: renamed from: l */
    public static Class m5142l(Object obj, boolean z10) {
        if (obj == null || Primitive.NULL == obj) {
            return null;
        }
        return (!(obj instanceof Primitive) || z10) ? Primitive.unwrap(obj).getClass() : ((Primitive) obj).getType();
    }

    /* JADX INFO: renamed from: m */
    public static Class[] m5143m(Object[] objArr) {
        if (objArr == null) {
            return AbstractC1143c4.f3484b;
        }
        Class[] clsArr = new Class[objArr.length];
        for (int i10 = 0; i10 < objArr.length; i10++) {
            clsArr[i10] = m5141k(objArr[i10]);
        }
        return clsArr;
    }

    /* JADX INFO: renamed from: n */
    public static boolean m5144n(Class cls, Class cls2, int i10) {
        if (m5148r(cls2) && AbstractC1128a1.m4058h(cls, cls2, i10)) {
            return true;
        }
        if (i10 == 1) {
            return m5150t(cls2, cls);
        }
        if (i10 == 2) {
            return m5151u(cls2, cls);
        }
        if (i10 == 3) {
            return false;
        }
        if (i10 == 4) {
            return m5145o(cls2, cls);
        }
        throw new C1211l2("bad case");
    }

    /* JADX INFO: renamed from: o */
    public static boolean m5145o(Class cls, Class cls2) {
        try {
            return m5137g(cls, cls2, null, 1, true) == f3848b;
        } catch (C1279w4 e10) {
            C1237p4.m5045a("err in cast check: ", e10);
            return false;
        }
    }

    /* JADX INFO: renamed from: p */
    public static boolean m5146p(Class cls) {
        return Collection.class.isAssignableFrom(cls) || Map.class.isAssignableFrom(cls) || Map.Entry.class.isAssignableFrom(cls);
    }

    /* JADX INFO: renamed from: q */
    public static boolean m5147q(Object obj) {
        return (obj instanceof Float) || (obj instanceof Double) || (obj instanceof BigDecimal);
    }

    /* JADX INFO: renamed from: r */
    public static boolean m5148r(Class cls) {
        if (cls != null && cls.isInterface()) {
            if (cls.getAnnotation(FunctionalInterface.class) != null) {
                return true;
            }
            int i10 = 0;
            for (Method method : cls.getMethods()) {
                if (Modifier.isAbstract(method.getModifiers()) && !method.isBridge() && !method.isSynthetic() && !m5154x(method)) {
                    int i11 = i10 + 1;
                    if (i10 > 1) {
                        return false;
                    }
                    i10 = i11;
                }
            }
            if (i10 == 1) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: s */
    public static boolean m5149s(Class cls, Class cls2) {
        return m5150t(cls, cls2) || m5151u(cls, cls2);
    }

    /* JADX INFO: renamed from: t */
    public static boolean m5150t(Class cls, Class cls2) {
        if (cls == null) {
            return false;
        }
        if (cls2 == null) {
            return cls == String.class;
        }
        if (cls.isPrimitive() && cls2.isPrimitive()) {
            if (cls == cls2) {
                return true;
            }
            Map map = f3847a;
            return map.containsKey(cls2) && map.containsKey(cls) && ((Integer) map.get(cls2)).intValue() < ((Integer) map.get(cls)).intValue();
        }
        if (((cls == BigInteger.class || cls == BigDecimal.class) && m5152v(cls2)) || cls.isAssignableFrom(cls2)) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: u */
    public static boolean m5151u(Class cls, Class cls2) {
        if (cls == null) {
            return false;
        }
        if (cls == Object.class) {
            return true;
        }
        if (cls2 == null) {
            return (cls.isPrimitive() || cls.isArray()) ? false : true;
        }
        if ((cls != Number.class || cls2 == Character.TYPE || cls2 == Boolean.TYPE) && Primitive.wrapperMap.get(cls) != cls2) {
            return m5150t(cls, cls2);
        }
        return true;
    }

    /* JADX INFO: renamed from: v */
    public static boolean m5152v(Class cls) {
        if (Number.class.isAssignableFrom(cls.isPrimitive() ? Primitive.boxType(cls) : cls)) {
            return true;
        }
        if (cls.isPrimitive()) {
            cls = Primitive.boxType(cls);
        }
        return Character.class.isAssignableFrom(cls);
    }

    /* JADX INFO: renamed from: w */
    public static boolean m5153w(Object obj) {
        return (obj instanceof Number) || (obj instanceof Character);
    }

    /* JADX INFO: renamed from: x */
    public static boolean m5154x(Method method) {
        try {
            Object.class.getMethod(method.getName(), method.getParameterTypes());
            return true;
        } catch (NoSuchMethodException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: y */
    public static boolean m5155y(Class cls) {
        return cls.isPrimitive() || cls == BigInteger.class || cls == BigDecimal.class;
    }

    /* JADX INFO: renamed from: z */
    public static boolean m5156z(Class cls) {
        return m5128D(cls) || m5125A(cls) || m5127C(cls);
    }
}
