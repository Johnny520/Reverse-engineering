package bsh;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: bsh.飘花落叶言子苏世哲楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2661 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final Map f7970 = Collections.unmodifiableMap(new HashMap<Class<?>, Integer>() { // from class: bsh.Types$1
        private static final long serialVersionUID = 1;

        {
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
    });

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final Primitive f7969 = new Primitive(1);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final Primitive f7968 = new Primitive(-1);

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public static String m5327(Class cls) {
        if (cls == null) {
            return "null";
        }
        if (!cls.isArray()) {
            return cls.getName();
        }
        return m5327(cls.getComponentType()) + "[]";
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static Object m5328(Object obj, Class cls, int i) {
        if (obj != null) {
            return m5329(cls, m5350(obj, false), obj, i, false);
        }
        if (i == 0) {
            return (cls.isPrimitive() || cls == BigInteger.class || cls == BigDecimal.class || Primitive.isWrapperType(cls)) ? Primitive.getDefaultValue(cls) : Primitive.NULL;
        }
        C2632.m5297("Cast error: null fromValue for toType: ".concat(cls.getSimpleName()));
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:167:0x029f, code lost:
    
        if (r15 != false) goto L215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x0312, code lost:
    
        if (r15 != false) goto L215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x031c, code lost:
    
        if (r15 != false) goto L215;
     */
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object m5329(java.lang.Class r11, java.lang.Class r12, java.lang.Object r13, int r14, boolean r15) throws bsh.UtilEvalError {
        /*
            Method dump skipped, instruction units count: 802
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bsh.AbstractC2661.m5329(java.lang.Class, java.lang.Class, java.lang.Object, int, boolean):java.lang.Object");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static UtilEvalError m5330(String str, String str2, Object obj, int i) {
        String str3 = "";
        if (i == 1) {
            StringBuilder sb = new StringBuilder("Cannot assign ");
            sb.append(str2);
            if (obj != null) {
                str3 = " with value \"" + obj + "\"";
            }
            sb.append(str3);
            sb.append(" to ");
            sb.append(str);
            return new UtilEvalError(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder("Cannot cast ");
        sb2.append(str2);
        if (obj != null) {
            str3 = " with value \"" + obj + "\"";
        }
        sb2.append(str3);
        sb2.append(" to ");
        sb2.append(str);
        return new UtilTargetError(new ClassCastException(sb2.toString()));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static Class m5331(Class cls) {
        if (cls == null) {
            return null;
        }
        while (cls.isArray()) {
            cls = cls.getComponentType();
        }
        return cls;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static int m5332(Class cls) {
        if (cls == null || !cls.isArray()) {
            return 0;
        }
        return cls.getName().lastIndexOf(91) + 1;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static boolean m5333(Class[] clsArr, Class[] clsArr2) {
        if (clsArr.length != clsArr2.length) {
            return false;
        }
        for (int i = 0; i < clsArr.length; i++) {
            if (clsArr[i] != clsArr2[i]) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static boolean m5334(Class cls) {
        if (Number.class.isAssignableFrom(cls.isPrimitive() ? Primitive.boxType(cls) : cls)) {
            return true;
        }
        if (cls.isPrimitive()) {
            cls = Primitive.boxType(cls);
        }
        return Character.class.isAssignableFrom(cls);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static boolean m5335(Class cls, Class cls2) {
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
            return m5343(cls, cls2);
        }
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public static boolean m5336(Class[] clsArr, Class[] clsArr2, int i) {
        if (i != 3 && clsArr.length != clsArr2.length) {
            return false;
        }
        for (int i2 = 0; i2 < clsArr.length; i2++) {
            if (!m5348(clsArr[i2], clsArr2[i2], i)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public static boolean m5337(Class[] clsArr, Type[] typeArr, int i) {
        if (i != 3 && clsArr.length != typeArr.length) {
            return false;
        }
        for (int i2 = 0; i2 < clsArr.length; i2++) {
            if (!m5349(clsArr[i2], typeArr[i2], i)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static boolean m5338(Object obj) {
        return (obj instanceof Number) || (obj instanceof Character);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static boolean m5339(Class cls) {
        return cls.isArray() && Map.Entry.class.isAssignableFrom(cls.getComponentType());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static boolean m5340(Class cls, Class cls2) {
        try {
            return m5329(cls, cls2, null, 1, true) == f7969;
        } catch (UtilEvalError e) {
            C2632.m5293("err in cast check: ", e);
            return false;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static boolean m5341(Type type, Class cls, int i) {
        if (type instanceof Class) {
            return m5341(type, cls, i);
        }
        if (type instanceof ParameterizedType) {
            return m5341(((ParameterizedType) type).getRawType(), cls, i);
        }
        if (type instanceof TypeVariable) {
            for (Type type2 : ((TypeVariable) type).getBounds()) {
                if (!m5341(type2, cls, i)) {
                    return false;
                }
            }
            return true;
        }
        if (!(type instanceof WildcardType)) {
            return cls == null;
        }
        WildcardType wildcardType = (WildcardType) type;
        for (Type type3 : wildcardType.getUpperBounds()) {
            if (!m5341(type3, cls, i)) {
                return false;
            }
        }
        for (Type type4 : wildcardType.getLowerBounds()) {
            if (!m5349(cls, type4, i)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static boolean m5342(Class cls) {
        if (cls != null && cls.isInterface()) {
            if (cls.getAnnotation(FunctionalInterface.class) == null) {
                Method[] methods = cls.getMethods();
                int length = methods.length;
                int i = 0;
                int i2 = 0;
                while (true) {
                    if (i < length) {
                        Method method = methods[i];
                        if (Modifier.isAbstract(method.getModifiers()) && !method.isBridge() && !method.isSynthetic()) {
                            try {
                                Object.class.getMethod(method.getName(), method.getParameterTypes());
                            } catch (NoSuchMethodException unused) {
                                int i3 = i2 + 1;
                                if (i2 > 1) {
                                    return false;
                                }
                                i2 = i3;
                            }
                        }
                        i++;
                    } else if (i2 == 1) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static boolean m5343(Class cls, Class cls2) {
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
            Map map = f7970;
            return map.containsKey(cls2) && map.containsKey(cls) && ((Integer) map.get(cls2)).intValue() < ((Integer) map.get(cls)).intValue();
        }
        if (((cls == BigInteger.class || cls == BigDecimal.class) && m5334(cls2)) || cls.isAssignableFrom(cls2)) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static boolean m5344(Class cls) {
        return Collection.class.isAssignableFrom(cls) || Map.class.isAssignableFrom(cls) || Map.Entry.class.isAssignableFrom(cls);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static boolean m5345(Object obj) {
        return (obj instanceof Float) || (obj instanceof Double) || (obj instanceof BigDecimal);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static Class m5346(Class cls, Class cls2) {
        if (cls != null) {
            if (cls2 == null || cls.isAssignableFrom(cls2)) {
                return cls;
            }
            Map map = f7970;
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

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static String m5347(String str) {
        int iLastIndexOf = str.lastIndexOf("$");
        return iLastIndexOf == -1 ? str : str.substring(iLastIndexOf + 1);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static boolean m5348(Class cls, Class cls2, int i) {
        if (m5342(cls2) && AbstractC2650.m5309(cls, cls2, i)) {
            return true;
        }
        if (i == 1) {
            return m5343(cls2, cls);
        }
        if (i == 2) {
            return m5335(cls2, cls);
        }
        if (i == 3) {
            return false;
        }
        if (i == 4) {
            return m5340(cls2, cls);
        }
        C2632.m5297("bad case");
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static boolean m5349(Class cls, Type type, int i) {
        if (type instanceof Class) {
            return m5348(cls, (Class) type, i);
        }
        if (type instanceof ParameterizedType) {
            return m5349(cls, ((ParameterizedType) type).getRawType(), i);
        }
        if (type instanceof TypeVariable) {
            for (Type type2 : ((TypeVariable) type).getBounds()) {
                if (!m5349(cls, type2, i)) {
                    return false;
                }
            }
            return true;
        }
        if (!(type instanceof WildcardType)) {
            return type == null;
        }
        WildcardType wildcardType = (WildcardType) type;
        for (Type type3 : wildcardType.getUpperBounds()) {
            if (!m5349(cls, type3, i)) {
                return false;
            }
        }
        for (Type type4 : wildcardType.getLowerBounds()) {
            if (!m5341(type4, cls, i)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static Class m5350(Object obj, boolean z) {
        if (obj == null || Primitive.NULL == obj) {
            return null;
        }
        return (!(obj instanceof Primitive) || z) ? obj instanceof AbstractC2650 ? ((AbstractC2650) obj).f7933 : Primitive.unwrap(obj).getClass() : ((Primitive) obj).getType();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static Class[] m5351(Object[] objArr) {
        if (objArr == null) {
            return AbstractC2666.f7999;
        }
        Class[] clsArr = new Class[objArr.length];
        for (int i = 0; i < objArr.length; i++) {
            clsArr[i] = m5350(objArr[i], false);
        }
        return clsArr;
    }
}
