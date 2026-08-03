package bsh;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import okhttp3.HttpUrl;
import p068eh.AbstractC0921a;
import p332wb.AbstractC4855en;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
class Types {
    static final int ASSIGNMENT = 1;
    static final int BSH_ASSIGNABLE = 4;
    static final int CAST = 0;
    static final int FIRST_ROUND_ASSIGNABLE = 1;
    static final int JAVA_BASE_ASSIGNABLE = 1;
    static final int JAVA_BOX_TYPES_ASSIGABLE = 2;
    static final int JAVA_VARARGS_ASSIGNABLE = 3;
    static final int LAST_ROUND_ASSIGNABLE = 4;
    private static final Map<Class<?>, Integer> NUMBER_ORDER = Collections.unmodifiableMap(new HashMap<Class<?>, Integer>() { // from class: bsh.Types.1
        private static final long serialVersionUID = 1;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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
    static Primitive VALID_CAST = new Primitive(1);
    static Primitive INVALID_CAST = new Primitive(-1);

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static class MapEntry extends AbstractMap.SimpleEntry<Object, Object> {
        private static final long serialVersionUID = 1;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public MapEntry(Object obj, Object obj2) {
            super(obj, obj2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static class Suffix {

        /* JADX INFO: renamed from: m */
        private static final Map<String, Class<?>> f989m = Collections.unmodifiableMap(new HashMap<String, Class<?>>() { // from class: bsh.Types.Suffix.1
            private static final long serialVersionUID = 1;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                put("O", Byte.TYPE);
                put("S", Short.TYPE);
                put("I", Integer.TYPE);
                put("L", Long.TYPE);
                put("W", BigInteger.class);
                put("w", BigDecimal.class);
                put("d", Double.TYPE);
                put("f", Float.TYPE);
            }
        });

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public static Class<?> getFloatingPointType(Character ch2) {
            return f989m.get(toLowerKey(ch2));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public static Class<?> getIntegralType(Character ch2) {
            return f989m.get(toUpperKey(ch2));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public static boolean isFloatingPoint(Character ch2) {
            return f989m.containsKey(toLowerKey(ch2));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public static boolean isIntegral(Character ch2) {
            return f989m.containsKey(toUpperKey(ch2));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        private static String toLowerKey(Character ch2) {
            return ch2.toString().toLowerCase();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        private static String toUpperKey(Character ch2) {
            return ch2.toString().toUpperCase();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean areSignaturesEqual(Class<?>[] clsArr, Class<?>[] clsArr2) {
        if (clsArr.length != clsArr2.length) {
            return false;
        }
        for (int i9 = 0; i9 < clsArr.length; i9++) {
            if (clsArr[i9] != clsArr2[i9]) {
                return false;
            }
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int arrayDimensions(Class<?> cls) {
        if (cls == null || !cls.isArray()) {
            return 0;
        }
        return cls.getName().lastIndexOf(91) + 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Class<?> arrayElementType(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        while (cls.isArray()) {
            cls = cls.getComponentType();
        }
        return cls;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static UtilEvalError castError(String str, String str2, Object obj, int i9) {
        String str3 = HttpUrl.FRAGMENT_ENCODE_SET;
        if (i9 == 1) {
            StringBuilder sb2 = new StringBuilder("Cannot assign ");
            sb2.append(str2);
            if (obj != null) {
                str3 = " with value \"" + obj + "\"";
            }
            sb2.append(str3);
            sb2.append(" to ");
            sb2.append(str);
            return new UtilEvalError(sb2.toString());
        }
        StringBuilder sb3 = new StringBuilder("Cannot cast ");
        sb3.append(str2);
        if (obj != null) {
            str3 = " with value \"" + obj + "\"";
        }
        sb3.append(str3);
        sb3.append(" to ");
        sb3.append(str);
        return new UtilTargetError(new ClassCastException(sb3.toString()));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Object castObject(Class<?> cls, Class<?> cls2, Object obj, int i9, boolean z9) throws UtilEvalError {
        if (cls == null || cls == cls2) {
            if (z9) {
                return VALID_CAST;
            }
        } else {
            if (cls2 != null && cls2.isArray() && (i9 == 0 || Collection.class.isAssignableFrom(cls))) {
                return z9 ? VALID_CAST : BshArray.castArray(cls, cls2, obj);
            }
            boolean zIsPrimitive = cls.isPrimitive();
            Class<?> cls3 = Void.TYPE;
            if (zIsPrimitive) {
                if (cls2 == cls3 || cls2 == null || cls2.isPrimitive()) {
                    if (!Primitive.class.isInstance(obj)) {
                        obj = Primitive.wrap(obj, cls2);
                    }
                    return Primitive.castPrimitive(cls, cls2, (Primitive) obj, z9, i9);
                }
                if (((isNumeric(cls2) || String.valueOf(obj).matches("[-+0-9.]*")) && isNumeric(cls)) || cls == Boolean.TYPE) {
                    return z9 ? VALID_CAST : Primitive.wrap(Primitive.castWrapper(cls, obj), cls);
                }
                if (z9) {
                    return INVALID_CAST;
                }
                throw castError(cls, cls2, obj, i9);
            }
            if (cls2 == cls3 || cls2 == null || cls2.isPrimitive() || cls == Boolean.class || (String.valueOf(obj).matches("[-+0-9.]*") && isNumeric(cls))) {
                if (Primitive.isWrapperType(cls) && cls2 != cls3 && cls2 != null) {
                    return z9 ? VALID_CAST : Primitive.castWrapper(Primitive.unboxType(cls), obj);
                }
                if (cls == Object.class && cls2 != cls3 && cls2 != null) {
                    return z9 ? VALID_CAST : Primitive.unwrap(obj);
                }
                if (cls2 == null || cls2.isPrimitive() || !cls.isAssignableFrom(cls2)) {
                    return Primitive.castPrimitive(cls, cls2, (Primitive) obj, z9, i9);
                }
                if (z9) {
                    return VALID_CAST;
                }
            } else {
                if (isFunctionalInterface(cls) && (obj instanceof BshLambda)) {
                    return z9 ? VALID_CAST : ((BshLambda) obj).convertTo(cls);
                }
                if (cls.isAssignableFrom(cls2)) {
                    if (z9) {
                        return VALID_CAST;
                    }
                    if (Reflect.isGeneratedClass(cls) && !Proxy.isProxyClass(cls2)) {
                        return Reflect.getClassInstanceThis(obj, cls.getSimpleName());
                    }
                } else {
                    if (!This.class.isInstance(obj) || ((This) obj).getNameSpace().classStatic != cls) {
                        if (cls.isInterface() && This.class.isAssignableFrom(cls2)) {
                            return z9 ? VALID_CAST : ((This) obj).getInterface(cls);
                        }
                        if (Primitive.isWrapperType(cls) && Primitive.isWrapperType(cls2)) {
                            return z9 ? VALID_CAST : Primitive.castWrapper(cls, obj);
                        }
                        if (z9) {
                            return INVALID_CAST;
                        }
                        throw castError(cls, cls2, obj, i9);
                    }
                    if (z9) {
                        return VALID_CAST;
                    }
                }
            }
        }
        return obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static ParameterizedType createParameterizedType(final Type type, final Type[] typeArr) {
        return new ParameterizedType() { // from class: bsh.Types.2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // java.lang.reflect.ParameterizedType
            public Type[] getActualTypeArguments() {
                return typeArr;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // java.lang.reflect.ParameterizedType
            public Type getOwnerType() {
                return null;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // java.lang.reflect.ParameterizedType
            public Type getRawType() {
                return type;
            }
        };
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String getASMClassSignature(TypeVariable<?>[] typeVariableArr, Type type, Type... typeArr) {
        StringBuilder sb2 = new StringBuilder();
        if (typeVariableArr.length != 0) {
            sb2.append("<");
            for (TypeVariable<?> typeVariable : typeVariableArr) {
                sb2.append(typeVariable.getName());
                for (Type type2 : typeVariable.getBounds()) {
                    sb2.append(":");
                    sb2.append(getASMSignature(type2));
                }
            }
            sb2.append(">");
        }
        sb2.append(getASMSignature(type));
        for (Type type3 : typeArr) {
            sb2.append(getASMSignature(type3));
        }
        return sb2.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String getASMMethodSignature(TypeVariable<?>[] typeVariableArr, Type[] typeArr, Type type, Type[] typeArr2) {
        StringBuilder sb2 = new StringBuilder();
        if (typeVariableArr.length > 0) {
            sb2.append("<");
            for (TypeVariable<?> typeVariable : typeVariableArr) {
                sb2.append(typeVariable.getName());
                for (Type type2 : typeVariable.getBounds()) {
                    sb2.append(":");
                    sb2.append(getASMSignature(type2));
                }
            }
            sb2.append(">");
        }
        sb2.append("(");
        for (Type type3 : typeArr) {
            sb2.append(getASMSignature(type3));
        }
        sb2.append(")");
        sb2.append(getASMSignature(type));
        for (Type type4 : typeArr2) {
            sb2.append("^");
            sb2.append(getASMSignature(type4));
        }
        return sb2.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String getASMSignature(Type type) {
        if (type instanceof Class) {
            return bsh.org.objectweb.asm.Type.getDescriptor((Class) type);
        }
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("L" + bsh.org.objectweb.asm.Type.getInternalName((Class) parameterizedType.getRawType()));
            sb2.append("<");
            for (Type type2 : parameterizedType.getActualTypeArguments()) {
                sb2.append(getASMSignature(type2));
            }
            sb2.append(">;");
            return sb2.toString();
        }
        if (type instanceof TypeVariable) {
            return "T" + ((TypeVariable) type).getName() + ";";
        }
        if (!(type instanceof WildcardType)) {
            StringBuilder sb3 = new StringBuilder("Can't get the signature of this type because its Class is unknown: ");
            sb3.append(type != null ? type.getClass() : null);
            throw new IllegalArgumentException(sb3.toString());
        }
        WildcardType wildcardType = (WildcardType) type;
        Type[] lowerBounds = wildcardType.getLowerBounds();
        if (lowerBounds.length > 0) {
            return "-" + bsh.org.objectweb.asm.Type.getDescriptor((Class) lowerBounds[0]);
        }
        return "+" + bsh.org.objectweb.asm.Type.getDescriptor((Class) wildcardType.getUpperBounds()[0]);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static bsh.org.objectweb.asm.Type getASMType(Class<?> cls) {
        return bsh.org.objectweb.asm.Type.getType(cls);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String getBaseName(String str) {
        int iLastIndexOf = str.lastIndexOf("$");
        return iLastIndexOf == -1 ? str : str.substring(iLastIndexOf + 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Class<?> getCommonType(Class<?> cls, Class<?> cls2) {
        if (cls != null) {
            if (cls2 == null || cls.isAssignableFrom(cls2)) {
                return cls;
            }
            Map<Class<?>, Integer> map = NUMBER_ORDER;
            if (!map.containsKey(cls) || !map.containsKey(cls2)) {
                do {
                    cls = cls.getSuperclass();
                    if (cls == null || Object.class == cls) {
                        return Object.class;
                    }
                } while (!cls.isAssignableFrom(cls2));
                return cls;
            }
            if (map.get(cls).intValue() >= map.get(cls2).intValue()) {
                return cls;
            }
        }
        return cls2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String getDescriptor(Class<?> cls) {
        return bsh.org.objectweb.asm.Type.getDescriptor(cls);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String getInternalName(Class<?> cls) {
        return bsh.org.objectweb.asm.Type.getInternalName(cls);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String[] getInternalNames(Class<?>[] clsArr) {
        String[] strArr = new String[clsArr.length];
        for (int i9 = 0; i9 < clsArr.length; i9++) {
            strArr[i9] = bsh.org.objectweb.asm.Type.getInternalName(clsArr[i9]);
        }
        return strArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String getMethodDescriptor(Class<?> cls, Class<?>... clsArr) {
        bsh.org.objectweb.asm.Type[] typeArr = new bsh.org.objectweb.asm.Type[clsArr.length];
        for (int i9 = 0; i9 < clsArr.length; i9++) {
            typeArr[i9] = bsh.org.objectweb.asm.Type.getType(clsArr[i9]);
        }
        return bsh.org.objectweb.asm.Type.getMethodDescriptor(bsh.org.objectweb.asm.Type.getType(cls), typeArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Class<?> getType(Object obj, boolean z9) {
        if (obj == null || Primitive.NULL == obj) {
            return null;
        }
        return (!(obj instanceof Primitive) || z9) ? obj instanceof BshLambda ? ((BshLambda) obj).dummyType : Primitive.unwrap(obj).getClass() : ((Primitive) obj).getType();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Class<?>[] getTypes(Object[] objArr) {
        if (objArr == null) {
            return Reflect.ZERO_TYPES;
        }
        Class<?>[] clsArr = new Class[objArr.length];
        for (int i9 = 0; i9 < objArr.length; i9++) {
            clsArr[i9] = getType(objArr[i9]);
        }
        return clsArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean isAssignable(Class<?> cls, Type type, int i9) {
        if (type instanceof Class) {
            return isAssignable(cls, (Class<?>) type, i9);
        }
        if (type instanceof ParameterizedType) {
            return isAssignable(cls, ((ParameterizedType) type).getRawType(), i9);
        }
        if (type instanceof TypeVariable) {
            for (Type type2 : ((TypeVariable) type).getBounds()) {
                if (!isAssignable(cls, type2, i9)) {
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
            if (!isAssignable(cls, type3, i9)) {
                return false;
            }
        }
        for (Type type4 : wildcardType.getLowerBounds()) {
            if (!isAssignable(type4, cls, i9)) {
                return false;
            }
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean isBshAssignable(Class<?> cls, Class<?> cls2) {
        try {
            return castObject(cls, cls2, null, 1, true) == VALID_CAST;
        } catch (UtilEvalError e6) {
            C0353j.m1306d("err in cast check: ", e6);
            return false;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean isCollectionType(Class<?> cls) {
        return Collection.class.isAssignableFrom(cls) || Map.class.isAssignableFrom(cls) || Map.Entry.class.isAssignableFrom(cls);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean isFloatingpoint(Object obj) {
        return (obj instanceof Float) || (obj instanceof Double) || (obj instanceof BigDecimal);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean isFunctionalInterface(Class<?> cls) {
        if (cls != null && cls.isInterface()) {
            if (cls.getAnnotation(FunctionalInterface.class) != null) {
                return true;
            }
            int i9 = 0;
            for (Method method : cls.getMethods()) {
                if (Modifier.isAbstract(method.getModifiers()) && !method.isBridge() && !method.isSynthetic() && !isObjectClassMethod(method)) {
                    int i10 = i9 + 1;
                    if (i9 > 1) {
                        return false;
                    }
                    i9 = i10;
                }
            }
            if (i9 == 1) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean isJavaAssignable(Class<?> cls, Class<?> cls2) {
        return isJavaBaseAssignable(cls, cls2) || isJavaBoxTypesAssignable(cls, cls2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean isJavaBaseAssignable(Class<?> cls, Class<?> cls2) {
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
            Map<Class<?>, Integer> map = NUMBER_ORDER;
            return map.containsKey(cls2) && map.containsKey(cls) && map.get(cls2).intValue() < map.get(cls).intValue();
        }
        if (((cls == BigInteger.class || cls == BigDecimal.class) && isNumeric(cls2)) || cls.isAssignableFrom(cls2)) {
            return true;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean isJavaBoxTypesAssignable(Class<?> cls, Class<?> cls2) {
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
            return isJavaBaseAssignable(cls, cls2);
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean isNumeric(Class<?> cls) {
        if (Number.class.isAssignableFrom(cls.isPrimitive() ? Primitive.boxType(cls) : cls)) {
            return true;
        }
        if (cls.isPrimitive()) {
            cls = Primitive.boxType(cls);
        }
        return Character.class.isAssignableFrom(cls);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean isObjectClassMethod(Method method) {
        try {
            Object.class.getMethod(method.getName(), method.getParameterTypes());
            return true;
        } catch (NoSuchMethodException unused) {
            return false;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean isPrimitive(Class<?> cls) {
        return cls.isPrimitive() || cls == BigInteger.class || cls == BigDecimal.class;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean isPropertyType(Class<?> cls) {
        return isPropertyTypeMap(cls) || isPropertyTypeEntry(cls) || isPropertyTypeEntryList(cls);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean isPropertyTypeEntry(Class<?> cls) {
        return Map.Entry.class.isAssignableFrom(cls);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean isPropertyTypeEntryList(Class<?> cls) {
        return cls.isArray() && isPropertyTypeEntry(cls.getComponentType());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean isPropertyTypeMap(Class<?> cls) {
        return Map.class.isAssignableFrom(cls);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean isSignatureAssignable(Class<?>[] clsArr, Class<?>[] clsArr2, int i9) {
        if (i9 != 3 && clsArr.length != clsArr2.length) {
            return false;
        }
        for (int i10 = 0; i10 < clsArr.length; i10++) {
            if (!isAssignable(clsArr[i10], clsArr2[i10], i9)) {
                return false;
            }
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static String prettyName(Type type, boolean z9) {
        if (type instanceof Class) {
            return prettyName((Class<?>) type);
        }
        int i9 = 0;
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            String[] strArr = new String[actualTypeArguments.length];
            for (int i10 = 0; i10 < actualTypeArguments.length; i10++) {
                strArr[i10] = prettyName(actualTypeArguments[i10], false);
            }
            return AbstractC4855en.m9265i(prettyName(parameterizedType.getRawType()), "<", String.join(", ", strArr), ">");
        }
        if (type instanceof TypeVariable) {
            TypeVariable typeVariable = (TypeVariable) type;
            Type[] bounds = typeVariable.getBounds();
            if (!z9 || (bounds.length == 1 && bounds[0] == Object.class)) {
                return typeVariable.getName();
            }
            String[] strArr2 = new String[bounds.length];
            while (i9 < bounds.length) {
                strArr2[i9] = prettyName(bounds[i9]);
                i9++;
            }
            return AbstractC4855en.m9264h(typeVariable.getName(), " extends ", String.join(" & ", strArr2));
        }
        if (!(type instanceof WildcardType)) {
            if (type == null) {
                return "null";
            }
            C0353j.m1309g("Can't return a pretty name because the type is unknown!");
            return null;
        }
        WildcardType wildcardType = (WildcardType) type;
        Type[] upperBounds = wildcardType.getUpperBounds();
        if (upperBounds[0] != Object.class) {
            String[] strArr3 = new String[upperBounds.length];
            while (i9 < upperBounds.length) {
                strArr3[i9] = prettyName(upperBounds[i9]);
                i9++;
            }
            return AbstractC4855en.m9263g("? extends ", String.join(" & ", strArr3));
        }
        Type[] lowerBounds = wildcardType.getLowerBounds();
        if (lowerBounds.length == 0) {
            return "?";
        }
        String[] strArr4 = new String[lowerBounds.length];
        while (i9 < lowerBounds.length) {
            strArr4[i9] = prettyName(lowerBounds[i9]);
            i9++;
        }
        return AbstractC4855en.m9263g("? super ", String.join(" & ", strArr4));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String[] prettyNames(Type[] typeArr) {
        String[] strArr = new String[typeArr.length];
        for (int i9 = 0; i9 < typeArr.length; i9++) {
            strArr[i9] = prettyName(typeArr[i9]);
        }
        return strArr;
    }

    public static boolean isPropertyTypeEntry(Object obj) {
        return obj instanceof Map.Entry;
    }

    public static boolean isPropertyTypeMap(Object obj) {
        return obj instanceof Map;
    }

    public static String getMethodDescriptor(Method method) {
        return bsh.org.objectweb.asm.Type.getMethodDescriptor(method);
    }

    public static boolean isSignatureAssignable(Class<?>[] clsArr, Type[] typeArr, int i9) {
        if (i9 != 3 && clsArr.length != typeArr.length) {
            return false;
        }
        for (int i10 = 0; i10 < clsArr.length; i10++) {
            if (!isAssignable(clsArr[i10], typeArr[i10], i9)) {
                return false;
            }
        }
        return true;
    }

    public static Class<?> getType(boolean z9) {
        return Boolean.TYPE;
    }

    public static Class<?> getType(byte b10) {
        return Byte.TYPE;
    }

    public static Class<?> getType(char c10) {
        return Character.TYPE;
    }

    public static Class<?> getType(int i9) {
        return Integer.TYPE;
    }

    public static boolean isNumeric(Object obj) {
        return (obj instanceof Number) || (obj instanceof Character);
    }

    public static Class<?> getType(long j3) {
        return Long.TYPE;
    }

    public static Class<?> getType(short s10) {
        return Short.TYPE;
    }

    public static Class<?> getType(double d10) {
        return Double.TYPE;
    }

    public static Class<?> getType(float f3) {
        return Float.TYPE;
    }

    public static Class<?> getType(Object obj) {
        return getType(obj, false);
    }

    public static boolean isAssignable(Class<?> cls, Class<?> cls2, int i9) {
        if (isFunctionalInterface(cls2) && BshLambda.isAssignable(cls, cls2, i9)) {
            return true;
        }
        if (i9 == 1) {
            return isJavaBaseAssignable(cls2, cls);
        }
        if (i9 == 2) {
            return isJavaBoxTypesAssignable(cls2, cls);
        }
        if (i9 == 3) {
            return false;
        }
        if (i9 == 4) {
            return isBshAssignable(cls2, cls);
        }
        C0353j.m1308f("bad case");
        return false;
    }

    public static UtilEvalError castError(String str, String str2, int i9) {
        return castError(str, str2, (Object) null, i9);
    }

    public static UtilEvalError castError(Class<?> cls, Class<?> cls2, Object obj, int i9) {
        return castError(StringUtil.typeString(cls), StringUtil.typeString(cls2), obj, i9);
    }

    public static boolean isAssignable(Type type, Class<?> cls, int i9) {
        if (type instanceof Class) {
            return isAssignable(type, cls, i9);
        }
        if (type instanceof ParameterizedType) {
            return isAssignable(((ParameterizedType) type).getRawType(), cls, i9);
        }
        if (type instanceof TypeVariable) {
            for (Type type2 : ((TypeVariable) type).getBounds()) {
                if (!isAssignable(type2, cls, i9)) {
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
            if (!isAssignable(type3, cls, i9)) {
                return false;
            }
        }
        for (Type type4 : wildcardType.getLowerBounds()) {
            if (!isAssignable(cls, type4, i9)) {
                return false;
            }
        }
        return true;
    }

    public static String getASMMethodSignature(Method method) {
        return getASMMethodSignature(method.getTypeParameters(), method.getGenericParameterTypes(), method.getGenericReturnType(), method.getGenericExceptionTypes());
    }

    public static String prettyName(Type type) {
        return prettyName(type, true);
    }

    public static String prettyName(Class<?> cls) {
        if (cls == null) {
            return "null";
        }
        if (!cls.isArray()) {
            return cls.getName();
        }
        return AbstractC0921a.m2255r(new StringBuilder(), prettyName(cls.getComponentType()), HttpUrl.PATH_SEGMENT_ENCODE_SET_URI);
    }

    public static Object castObject(Object obj, Class<?> cls, int i9) {
        if (obj != null) {
            return castObject(cls, getType(obj), obj, i9, false);
        }
        if (i9 == 0) {
            if (!isPrimitive(cls) && !Primitive.isWrapperType(cls)) {
                return Primitive.NULL;
            }
            return Primitive.getDefaultValue(cls);
        }
        C0353j.m1308f("Cast error: null fromValue for toType: ".concat(cls.getSimpleName()));
        return null;
    }
}
