package bsh;

import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

/* JADX INFO: renamed from: bsh.飘花落叶言子苏世哲楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3495 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final Map f8317 = Collections.unmodifiableMap(new HashMap<Class<?>, Integer>() { // from class: bsh.Types$1
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
    public static final Primitive f8316 = new Primitive(1);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final Primitive f8315 = new Primitive(-1);

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public static String m5932(Class cls) {
        if (cls == null) {
            return "null";
        }
        if (!cls.isArray()) {
            return cls.getName();
        }
        return m5932(cls.getComponentType()) + "[]";
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static Object m5933(Object obj, Class cls, int i) {
        if (obj != null) {
            return m5934(cls, m5955(obj, false), obj, i, false);
        }
        if (i == 0) {
            return (cls.isPrimitive() || cls == BigInteger.class || cls == BigDecimal.class || Primitive.isWrapperType(cls)) ? Primitive.getDefaultValue(cls) : Primitive.NULL;
        }
        C3466.m5902("Cast error: null fromValue for toType: ".concat(cls.getSimpleName()));
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
    */
    public static Object m5934(Class cls, Class cls2, Object obj, int i, boolean z) throws UtilEvalError {
        if (cls != null && cls != cls2) {
            int i2 = 0;
            if (cls2 == null || !cls2.isArray() || (i != 0 && !Collection.class.isAssignableFrom(cls))) {
                boolean zIsPrimitive = cls.isPrimitive();
                Class cls3 = Void.TYPE;
                if (zIsPrimitive) {
                    if (cls2 == cls3 || cls2 == null || cls2.isPrimitive()) {
                        if (!Primitive.class.isInstance(obj)) {
                            obj = Primitive.wrap(obj, (Class<?>) cls2);
                        }
                        return Primitive.castPrimitive(cls, cls2, (Primitive) obj, z, i);
                    }
                    if (((!m5939(cls2) && !String.valueOf(obj).matches("[-+0-9.]*")) || !m5939(cls)) && cls != Boolean.TYPE) {
                        if (!z) {
                            throw m5935(AbstractC3462.m5885(cls), AbstractC3462.m5885(cls2), obj, i);
                        }
                        return f8315;
                    }
                    if (!z) {
                        return Primitive.wrap(Primitive.castWrapper(cls, obj), (Class<?>) cls);
                    }
                } else if (cls2 == cls3 || cls2 == null || cls2.isPrimitive() || cls == Boolean.class || (String.valueOf(obj).matches("[-+0-9.]*") && m5939(cls))) {
                    if (!Primitive.isWrapperType(cls) || cls2 == cls3 || cls2 == null) {
                        if (cls != Object.class || cls2 == cls3 || cls2 == null) {
                            if (cls2 == null || cls2.isPrimitive() || !cls.isAssignableFrom(cls2)) {
                                return Primitive.castPrimitive(cls, cls2, (Primitive) obj, z, i);
                            }
                        } else if (!z) {
                            return Primitive.unwrap(obj);
                        }
                    } else if (!z) {
                        return Primitive.castWrapper(Primitive.unboxType(cls), obj);
                    }
                } else if (m5947(cls) && (obj instanceof AbstractC3484)) {
                    if (!z) {
                        AbstractC3484 abstractC3484 = (AbstractC3484) obj;
                        if (!AbstractC3484.m5914(abstractC3484.f8280, cls, 4)) {
                            throw new UtilEvalError("This BshLambda can't be converted to ".concat(cls.getName()));
                        }
                        try {
                            return Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new C3494(abstractC3484, i2));
                        } catch (Throwable th) {
                            throw new UtilEvalError("Can't create a instance for the generate class for the BshLambda: " + th.getMessage(), th);
                        }
                    }
                } else if (cls.isAssignableFrom(cls2)) {
                    if (!z) {
                        if (AbstractC3500.m5992(cls) && !Proxy.isProxyClass(cls2)) {
                            return AbstractC3500.m5998(obj, cls.getSimpleName());
                        }
                        return obj;
                    }
                } else if (!This.class.isInstance(obj) || ((This) obj).getNameSpace().classStatic != cls) {
                    if (!cls.isInterface() || !This.class.isAssignableFrom(cls2)) {
                        if (!Primitive.isWrapperType(cls) || !Primitive.isWrapperType(cls2)) {
                            if (!z) {
                                throw m5935(AbstractC3462.m5885(cls), AbstractC3462.m5885(cls2), obj, i);
                            }
                            return f8315;
                        }
                        if (!z) {
                            return Primitive.castWrapper(cls, obj);
                        }
                    } else if (!z) {
                        return ((This) obj).getInterface((Class<?>) cls);
                    }
                }
            } else if (!z) {
                if (Collection.class.isAssignableFrom(cls)) {
                    if (List.class.isAssignableFrom(cls) || Queue.class == cls) {
                        if (cls.isAssignableFrom(ArrayList.class)) {
                            return new ArrayList(Arrays.asList((Object[]) m5933(obj, Object.class, 0)));
                        }
                        if (cls.isAssignableFrom(LinkedList.class)) {
                            return new LinkedList(Arrays.asList((Object[]) m5933(obj, Object.class, 0)));
                        }
                    } else {
                        if (cls.isAssignableFrom(ArrayDeque.class)) {
                            return new ArrayDeque(Arrays.asList((Object[]) m5933(obj, Object.class, 0)));
                        }
                        if (cls.isAssignableFrom(LinkedHashSet.class)) {
                            return new LinkedHashSet(Arrays.asList((Object[]) m5933(obj, Object.class, 0)));
                        }
                    }
                }
                Class clsM5936 = m5936(cls2);
                if (Map.class.isAssignableFrom(cls)) {
                    if (Map.Entry.class.isAssignableFrom(clsM5936)) {
                        Map.Entry[] entryArr = (Map.Entry[]) obj;
                        LinkedHashMap linkedHashMap = new LinkedHashMap(entryArr.length);
                        int length = entryArr.length;
                        while (i2 < length) {
                            Map.Entry entry = entryArr[i2];
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                            i2++;
                        }
                        return linkedHashMap;
                    }
                    if (cls.isAssignableFrom(LinkedHashMap.class)) {
                        int length2 = Array.getLength(obj);
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap((int) Math.ceil((((double) length2) + 0.0d) / 2.0d));
                        while (i2 < length2) {
                            int i3 = i2 + 1;
                            linkedHashMap2.put(Array.get(obj, i2), i3 < length2 ? Array.get(obj, i3) : null);
                            i2 += 2;
                        }
                        return linkedHashMap2;
                    }
                }
                int[] iArrM5882 = AbstractC3462.m5882(obj);
                int i4 = iArrM5882[0];
                if (i4 == 0) {
                    return Array.newInstance((Class<?>) cls, iArrM5882);
                }
                if (Object.class == clsM5936) {
                    Class clsM5951 = null;
                    for (int i5 = 0; i5 < i4; i5++) {
                        clsM5951 = m5951(clsM5951, m5955(Array.get(obj, 0), false));
                        if (Object.class == clsM5951) {
                            break;
                        }
                    }
                    if (clsM5951 != null && clsM5951 != clsM5936) {
                        clsM5936 = clsM5951;
                    }
                }
                if (!Map.Entry.class.isAssignableFrom(cls)) {
                    Class clsM59362 = m5936(cls);
                    Object objNewInstance = Array.newInstance((Class<?>) clsM59362, iArrM5882);
                    AbstractC3462.m5883(clsM59362, objNewInstance, obj);
                    return objNewInstance;
                }
                if (Map.Entry.class.isAssignableFrom(clsM5936)) {
                    if (Types$MapEntry.class != clsM5936) {
                        return obj;
                    }
                    Map.Entry[] entryArr2 = new Map.Entry[Array.getLength(obj)];
                    AbstractC3462.m5883(Map.Entry.class, entryArr2, obj);
                    return entryArr2;
                }
                if (i4 == 1) {
                    return new Types$MapEntry(Array.get(obj, 0), null);
                }
                if (i4 == 2) {
                    return new Types$MapEntry(Array.get(obj, 0), Array.get(obj, 1));
                }
                Map.Entry[] entryArr3 = new Map.Entry[(int) Math.ceil((((double) i4) + 0.0d) / 2.0d)];
                int i6 = 0;
                while (i2 < i4) {
                    int i7 = i6 + 1;
                    int i8 = i2 + 1;
                    entryArr3[i6] = new Types$MapEntry(Array.get(obj, i2), i8 < i4 ? Array.get(obj, i8) : null);
                    i2 += 2;
                    i6 = i7;
                }
                return entryArr3;
            }
            return f8316;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static UtilEvalError m5935(String str, String str2, Object obj, int i) {
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
    public static Class m5936(Class cls) {
        if (cls == null) {
            return null;
        }
        while (cls.isArray()) {
            cls = cls.getComponentType();
        }
        return cls;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static int m5937(Class cls) {
        if (cls == null || !cls.isArray()) {
            return 0;
        }
        return cls.getName().lastIndexOf(91) + 1;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static boolean m5938(Class[] clsArr, Class[] clsArr2) {
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
    public static boolean m5939(Class cls) {
        if (Number.class.isAssignableFrom(cls.isPrimitive() ? Primitive.boxType(cls) : cls)) {
            return true;
        }
        if (cls.isPrimitive()) {
            cls = Primitive.boxType(cls);
        }
        return Character.class.isAssignableFrom(cls);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static boolean m5940(Class cls, Class cls2) {
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
            return m5948(cls, cls2);
        }
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public static boolean m5941(Class[] clsArr, Class[] clsArr2, int i) {
        if (i != 3 && clsArr.length != clsArr2.length) {
            return false;
        }
        for (int i2 = 0; i2 < clsArr.length; i2++) {
            if (!m5953(clsArr[i2], clsArr2[i2], i)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public static boolean m5942(Class[] clsArr, Type[] typeArr, int i) {
        if (i != 3 && clsArr.length != typeArr.length) {
            return false;
        }
        for (int i2 = 0; i2 < clsArr.length; i2++) {
            if (!m5954(clsArr[i2], typeArr[i2], i)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static boolean m5943(Object obj) {
        return (obj instanceof Number) || (obj instanceof Character);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static boolean m5944(Class cls) {
        return cls.isArray() && Map.Entry.class.isAssignableFrom(cls.getComponentType());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static boolean m5945(Class cls, Class cls2) {
        try {
            return m5934(cls, cls2, null, 1, true) == f8316;
        } catch (UtilEvalError e) {
            C3466.m5898("err in cast check: ", e);
            return false;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static boolean m5946(Type type, Class cls, int i) {
        if (type instanceof Class) {
            return m5946(type, cls, i);
        }
        if (type instanceof ParameterizedType) {
            return m5946(((ParameterizedType) type).getRawType(), cls, i);
        }
        if (type instanceof TypeVariable) {
            for (Type type2 : ((TypeVariable) type).getBounds()) {
                if (!m5946(type2, cls, i)) {
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
            if (!m5946(type3, cls, i)) {
                return false;
            }
        }
        for (Type type4 : wildcardType.getLowerBounds()) {
            if (!m5954(cls, type4, i)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static boolean m5947(Class cls) {
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
    public static boolean m5948(Class cls, Class cls2) {
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
            Map map = f8317;
            return map.containsKey(cls2) && map.containsKey(cls) && ((Integer) map.get(cls2)).intValue() < ((Integer) map.get(cls)).intValue();
        }
        if (((cls == BigInteger.class || cls == BigDecimal.class) && m5939(cls2)) || cls.isAssignableFrom(cls2)) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static boolean m5949(Class cls) {
        return Collection.class.isAssignableFrom(cls) || Map.class.isAssignableFrom(cls) || Map.Entry.class.isAssignableFrom(cls);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static boolean m5950(Object obj) {
        return (obj instanceof Float) || (obj instanceof Double) || (obj instanceof BigDecimal);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static Class m5951(Class cls, Class cls2) {
        if (cls != null) {
            if (cls2 == null || cls.isAssignableFrom(cls2)) {
                return cls;
            }
            Map map = f8317;
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
    public static String m5952(String str) {
        int iLastIndexOf = str.lastIndexOf("$");
        return iLastIndexOf == -1 ? str : str.substring(iLastIndexOf + 1);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static boolean m5953(Class cls, Class cls2, int i) {
        if (m5947(cls2) && AbstractC3484.m5914(cls, cls2, i)) {
            return true;
        }
        if (i == 1) {
            return m5948(cls2, cls);
        }
        if (i == 2) {
            return m5940(cls2, cls);
        }
        if (i == 3) {
            return false;
        }
        if (i == 4) {
            return m5945(cls2, cls);
        }
        C3466.m5902("bad case");
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static boolean m5954(Class cls, Type type, int i) {
        if (type instanceof Class) {
            return m5953(cls, (Class) type, i);
        }
        if (type instanceof ParameterizedType) {
            return m5954(cls, ((ParameterizedType) type).getRawType(), i);
        }
        if (type instanceof TypeVariable) {
            for (Type type2 : ((TypeVariable) type).getBounds()) {
                if (!m5954(cls, type2, i)) {
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
            if (!m5954(cls, type3, i)) {
                return false;
            }
        }
        for (Type type4 : wildcardType.getLowerBounds()) {
            if (!m5946(type4, cls, i)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static Class m5955(Object obj, boolean z) {
        if (obj == null || Primitive.NULL == obj) {
            return null;
        }
        return (!(obj instanceof Primitive) || z) ? obj instanceof AbstractC3484 ? ((AbstractC3484) obj).f8280 : Primitive.unwrap(obj).getClass() : ((Primitive) obj).getType();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static Class[] m5956(Object[] objArr) {
        if (objArr == null) {
            return AbstractC3500.f8346;
        }
        Class[] clsArr = new Class[objArr.length];
        for (int i = 0; i < objArr.length; i++) {
            clsArr[i] = m5955(objArr[i], false);
        }
        return clsArr;
    }
}
