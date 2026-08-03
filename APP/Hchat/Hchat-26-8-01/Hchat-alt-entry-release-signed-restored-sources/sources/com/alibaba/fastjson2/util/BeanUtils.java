package com.alibaba.fastjson2.util;

import be.C0305w;
import bsh.C0353j;
import bsh.org.objectweb.asm.Opcodes;
import com.alibaba.fastjson2.JSONB;
import com.alibaba.fastjson2.JSONFactory;
import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.TypeReference;
import com.alibaba.fastjson2.annotation.JSONField;
import com.alibaba.fastjson2.annotation.JSONType;
import com.alibaba.fastjson2.codec.BeanInfo;
import com.alibaba.fastjson2.codec.FieldInfo;
import com.alibaba.fastjson2.reader.C0628g;
import com.alibaba.fastjson2.reader.ObjectReader;
import com.alibaba.fastjson2.reader.ObjectReaderProvider;
import com.alibaba.fastjson2.writer.ObjectWriter;
import com.alibaba.fastjson2.writer.ObjectWriterProvider;
import gg.C1414j;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import mg.InterfaceC2841c;
import okhttp3.HttpUrl;
import p012ah.C0086a;
import p136j8.C2104o;
import p222p.AbstractC3199a;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class BeanUtils {
    private static volatile boolean kotlinClassKlassError;
    private static volatile boolean kotlinError;
    private static volatile Constructor<?> kotlinKClassConstructor;
    private static volatile Method kotlinKClassGetConstructors;
    private static volatile Method kotlinKFunctionGetParameters;
    private static volatile Method kotlinKParameterGetName;
    static final AtomicReference<char[]> charsCache = new AtomicReference<>();
    static final NameCacheEntry[] NAME_CACHE = new NameCacheEntry[Opcodes.ACC_STRICT];
    static final Type[] EMPTY_TYPE_ARRAY = new Type[0];
    static final ConcurrentMap<Class, Field[]> fieldCache = new ConcurrentHashMap();
    static final ConcurrentMap<Class, Map<String, Field>> fieldMapCache = new ConcurrentHashMap();
    static final ConcurrentMap<Class, Field[]> declaredFieldCache = new ConcurrentHashMap();
    static final ConcurrentMap<Class, Method[]> methodCache = new ConcurrentHashMap();
    static final ConcurrentMap<Class, Constructor[]> constructorCache = new ConcurrentHashMap();

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class GenericArrayTypeImpl implements GenericArrayType, Serializable {
        private static final long serialVersionUID = 0;
        private final Type componentType;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public GenericArrayTypeImpl(Type type) {
            this.componentType = BeanUtils.canonicalize(type);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public boolean equals(Object obj) {
            return (obj instanceof GenericArrayType) && BeanUtils.equals(this, (GenericArrayType) obj);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // java.lang.reflect.GenericArrayType
        public Type getGenericComponentType() {
            return this.componentType;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public int hashCode() {
            return this.componentType.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public String toString() {
            return BeanUtils.typeToString(this.componentType) + HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class ParameterizedTypeImpl implements ParameterizedType, Serializable {
        private static final long serialVersionUID = 0;
        private final Type ownerType;
        private final Type rawType;
        private final Type[] typeArguments;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public ParameterizedTypeImpl(Type type, Type type2, Type... typeArr) {
            if (type2 instanceof Class) {
                Class cls = (Class) type2;
                boolean z9 = true;
                boolean z10 = Modifier.isStatic(cls.getModifiers()) || cls.getEnclosingClass() == null;
                if (type == null && !z10) {
                    z9 = false;
                }
                BeanUtils.checkArgument(z9);
            }
            this.ownerType = type == null ? null : BeanUtils.canonicalize(type);
            this.rawType = BeanUtils.canonicalize(type2);
            Type[] typeArr2 = (Type[]) typeArr.clone();
            this.typeArguments = typeArr2;
            int length = typeArr2.length;
            for (int i9 = 0; i9 < length; i9++) {
                BeanUtils.checkNotNull(this.typeArguments[i9]);
                BeanUtils.checkNotPrimitive(this.typeArguments[i9]);
                Type[] typeArr3 = this.typeArguments;
                typeArr3[i9] = BeanUtils.canonicalize(typeArr3[i9]);
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public boolean equals(Object obj) {
            return (obj instanceof ParameterizedType) && BeanUtils.equals(this, (ParameterizedType) obj);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // java.lang.reflect.ParameterizedType
        public Type[] getActualTypeArguments() {
            return (Type[]) this.typeArguments.clone();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // java.lang.reflect.ParameterizedType
        public Type getOwnerType() {
            return this.ownerType;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // java.lang.reflect.ParameterizedType
        public Type getRawType() {
            return this.rawType;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public int hashCode() {
            return (Arrays.hashCode(this.typeArguments) ^ this.rawType.hashCode()) ^ BeanUtils.hashCodeOrZero(this.ownerType);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public String toString() {
            int length = this.typeArguments.length;
            if (length == 0) {
                return BeanUtils.typeToString(this.rawType);
            }
            StringBuilder sb2 = new StringBuilder((length + 1) * 30);
            sb2.append(BeanUtils.typeToString(this.rawType));
            sb2.append("<");
            sb2.append(BeanUtils.typeToString(this.typeArguments[0]));
            for (int i9 = 1; i9 < length; i9++) {
                sb2.append(", ");
                sb2.append(BeanUtils.typeToString(this.typeArguments[i9]));
            }
            sb2.append(">");
            return sb2.toString();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class WildcardTypeImpl implements WildcardType, Serializable {
        private static final long serialVersionUID = 0;
        private final Type lowerBound;
        private final Type upperBound;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public WildcardTypeImpl(Type[] typeArr, Type[] typeArr2) {
            BeanUtils.checkArgument(typeArr2.length <= 1);
            BeanUtils.checkArgument(typeArr.length == 1);
            if (typeArr2.length != 1) {
                BeanUtils.checkNotNull(typeArr[0]);
                BeanUtils.checkNotPrimitive(typeArr[0]);
                this.lowerBound = null;
                this.upperBound = BeanUtils.canonicalize(typeArr[0]);
                return;
            }
            BeanUtils.checkNotNull(typeArr2[0]);
            BeanUtils.checkNotPrimitive(typeArr2[0]);
            BeanUtils.checkArgument(typeArr[0] == Object.class);
            this.lowerBound = BeanUtils.canonicalize(typeArr2[0]);
            this.upperBound = Object.class;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public boolean equals(Object obj) {
            return (obj instanceof WildcardType) && BeanUtils.equals(this, (WildcardType) obj);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // java.lang.reflect.WildcardType
        public Type[] getLowerBounds() {
            Type type = this.lowerBound;
            return type != null ? new Type[]{type} : BeanUtils.EMPTY_TYPE_ARRAY;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // java.lang.reflect.WildcardType
        public Type[] getUpperBounds() {
            return new Type[]{this.upperBound};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public int hashCode() {
            Type type = this.lowerBound;
            return (type != null ? type.hashCode() + 31 : 1) ^ (this.upperBound.hashCode() + 31);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public String toString() {
            if (this.lowerBound != null) {
                return "? super " + BeanUtils.typeToString(this.lowerBound);
            }
            if (this.upperBound == Object.class) {
                return "?";
            }
            return "? extends " + BeanUtils.typeToString(this.upperBound);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void annotationMethods(Class cls, Consumer<Method> consumer) {
        ConcurrentMap<Class, Method[]> concurrentMap = methodCache;
        Method[] methods = concurrentMap.get(cls);
        if (methods == null) {
            methods = cls.getMethods();
            concurrentMap.put(cls, methods);
        }
        for (Method method : methods) {
            if (method.getParameterCount() == 0 && method.getDeclaringClass() != Object.class) {
                String name = method.getName();
                name.getClass();
                switch (name) {
                    case "toString":
                    case "hashCode":
                    case "annotationType":
                        break;
                    default:
                        consumer.accept(method);
                        break;
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static GenericArrayType arrayOf(Type type) {
        return new GenericArrayTypeImpl(type);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Method buildMethod(Class cls, String str) {
        ConcurrentMap<Class, Method[]> concurrentMap = methodCache;
        Method[] methods = concurrentMap.get(cls);
        if (methods == null) {
            methods = cls.getMethods();
            concurrentMap.put(cls, methods);
        }
        for (Method method : methods) {
            if (!Modifier.isStatic(method.getModifiers()) && method.getParameterCount() == 0 && method.getName().equals(str)) {
                return method;
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Type canonicalize(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            return cls.isArray() ? new GenericArrayTypeImpl(canonicalize(cls.getComponentType())) : cls;
        }
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            return new ParameterizedTypeImpl(parameterizedType.getOwnerType(), parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            return new GenericArrayTypeImpl(((GenericArrayType) type).getGenericComponentType());
        }
        if (!(type instanceof WildcardType)) {
            return type;
        }
        WildcardType wildcardType = (WildcardType) type;
        return new WildcardTypeImpl(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void checkArgument(boolean z9) {
        if (z9) {
            return;
        }
        C2104o.m5289o();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static <T> T checkNotNull(T t9) {
        t9.getClass();
        return t9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void checkNotPrimitive(Type type) {
        checkArgument(((type instanceof Class) && ((Class) type).isPrimitive()) ? false : true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void cleanupCache(ClassLoader classLoader) {
        Iterator<Map.Entry<Class, Field[]>> it = fieldCache.entrySet().iterator();
        while (it.hasNext()) {
            if (it.next().getKey().getClassLoader() == classLoader) {
                it.remove();
            }
        }
        Iterator<Map.Entry<Class, Map<String, Field>>> it2 = fieldMapCache.entrySet().iterator();
        while (it2.hasNext()) {
            if (it2.next().getKey().getClassLoader() == classLoader) {
                it2.remove();
            }
        }
        Iterator<Map.Entry<Class, Field[]>> it3 = declaredFieldCache.entrySet().iterator();
        while (it3.hasNext()) {
            if (it3.next().getKey().getClassLoader() == classLoader) {
                it3.remove();
            }
        }
        Iterator<Map.Entry<Class, Method[]>> it4 = methodCache.entrySet().iterator();
        while (it4.hasNext()) {
            if (it4.next().getKey().getClassLoader() == classLoader) {
                it4.remove();
            }
        }
        Iterator<Map.Entry<Class, Constructor[]>> it5 = constructorCache.entrySet().iterator();
        while (it5.hasNext()) {
            if (it5.next().getKey().getClassLoader() == classLoader) {
                it5.remove();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void constructor(Class cls, Consumer<Constructor> consumer) {
        ConcurrentMap<Class, Constructor[]> concurrentMap = constructorCache;
        Constructor<?>[] declaredConstructors = concurrentMap.get(cls);
        if (declaredConstructors == null) {
            declaredConstructors = cls.getDeclaredConstructors();
            concurrentMap.put(cls, declaredConstructors);
        }
        for (Constructor<?> constructor : declaredConstructors) {
            consumer.accept(constructor);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String dashes(String str, int i9, boolean z9) {
        int i10;
        int length = str.length();
        char[] andSet = TypeUtils.CHARS_UPDATER.getAndSet(TypeUtils.CACHE, null);
        if (andSet == null) {
            andSet = new char[128];
        }
        int i11 = i9;
        int i12 = 0;
        while (i11 < length) {
            try {
                char cCharAt = str.charAt(i11);
                if (z9) {
                    if (cCharAt < 'A' || cCharAt > 'Z') {
                        if (cCharAt >= 'a' && cCharAt <= 'z') {
                            i10 = cCharAt - ' ';
                            cCharAt = (char) i10;
                        }
                    } else if (i11 > i9) {
                        andSet[i12] = '-';
                        i12++;
                    }
                } else if (cCharAt >= 'A' && cCharAt <= 'Z') {
                    if (i11 > i9) {
                        andSet[i12] = '-';
                        i12++;
                    }
                    i10 = cCharAt + ' ';
                    cCharAt = (char) i10;
                }
                andSet[i12] = cCharAt;
                i11++;
                i12++;
            } catch (Throwable th2) {
                TypeUtils.CHARS_UPDATER.set(TypeUtils.CACHE, andSet);
                throw th2;
            }
        }
        String str2 = new String(andSet, 0, i12);
        TypeUtils.CHARS_UPDATER.set(TypeUtils.CACHE, andSet);
        return str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void declaredFields(Class cls, Consumer<Field> consumer) {
        boolean zEquals;
        if (cls == null || consumer == null) {
            return;
        }
        Class superclass = cls.getSuperclass();
        if (superclass == null || superclass == Object.class) {
            zEquals = false;
        } else {
            zEquals = superclass.getName().equals("com.google.protobuf.GeneratedMessageV3");
            if (!zEquals) {
                declaredFields(superclass, consumer);
            }
        }
        ConcurrentMap<Class, Field[]> concurrentMap = declaredFieldCache;
        Field[] declaredFields = concurrentMap.get(cls);
        if (declaredFields == null) {
            try {
                declaredFields = cls.getDeclaredFields();
                concurrentMap.put(cls, declaredFields);
            } catch (Throwable unused) {
                declaredFields = new Field[0];
            }
            int length = declaredFields.length;
            int i9 = 0;
            while (true) {
                if (i9 >= length) {
                    break;
                }
                if (Modifier.isStatic(declaredFields[i9].getModifiers())) {
                    ArrayList arrayList = new ArrayList(declaredFields.length);
                    for (Field field : declaredFields) {
                        if (!Modifier.isStatic(field.getModifiers())) {
                            arrayList.add(field);
                        }
                    }
                    declaredFields = (Field[]) arrayList.toArray(new Field[arrayList.size()]);
                } else {
                    i9++;
                }
            }
            fieldCache.put(cls, declaredFields);
        }
        for (Field field2 : declaredFields) {
            if ((field2.getModifiers() & 8) == 0 && field2.getType() != ClassLoader.class) {
                if (zEquals) {
                    String name = field2.getName();
                    Class<?> type = field2.getType();
                    if ("cardsmap_".equals(name) && type.getName().equals("com.google.protobuf.MapField")) {
                        return;
                    }
                }
                Class<?> declaringClass = field2.getDeclaringClass();
                if (declaringClass != AbstractMap.class && declaringClass != HashMap.class && declaringClass != LinkedHashMap.class && declaringClass != TreeMap.class && declaringClass != ConcurrentHashMap.class) {
                    consumer.accept(field2);
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static Class<?> declaringClassOf(TypeVariable<?> typeVariable) {
        GenericDeclaration genericDeclaration = typeVariable.getGenericDeclaration();
        if (genericDeclaration instanceof Class) {
            return (Class) genericDeclaration;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String dots(String str, int i9, boolean z9) {
        int i10;
        int length = str.length();
        char[] andSet = TypeUtils.CHARS_UPDATER.getAndSet(TypeUtils.CACHE, null);
        if (andSet == null) {
            andSet = new char[128];
        }
        int i11 = i9;
        int i12 = 0;
        while (i11 < length) {
            try {
                char cCharAt = str.charAt(i11);
                if (z9) {
                    if (cCharAt < 'A' || cCharAt > 'Z') {
                        if (cCharAt >= 'a' && cCharAt <= 'z') {
                            i10 = cCharAt - ' ';
                            cCharAt = (char) i10;
                        }
                    } else if (i11 > i9) {
                        andSet[i12] = '.';
                        i12++;
                    }
                } else if (cCharAt >= 'A' && cCharAt <= 'Z') {
                    if (i11 > i9) {
                        andSet[i12] = '.';
                        i12++;
                    }
                    i10 = cCharAt + ' ';
                    cCharAt = (char) i10;
                }
                andSet[i12] = cCharAt;
                i11++;
                i12++;
            } catch (Throwable th2) {
                TypeUtils.CHARS_UPDATER.set(TypeUtils.CACHE, andSet);
                throw th2;
            }
        }
        String str2 = new String(andSet, 0, i12);
        TypeUtils.CHARS_UPDATER.set(TypeUtils.CACHE, andSet);
        return str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean equal(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean equals(Type type, Type type2) {
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            return equal(parameterizedType.getOwnerType(), parameterizedType2.getOwnerType()) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            if (type2 instanceof GenericArrayType) {
                return equals(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
            }
            return false;
        }
        if (type instanceof WildcardType) {
            if (!(type2 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type;
            WildcardType wildcardType2 = (WildcardType) type2;
            return Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds());
        }
        if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
            return false;
        }
        TypeVariable typeVariable = (TypeVariable) type;
        TypeVariable typeVariable2 = (TypeVariable) type2;
        return typeVariable.getGenericDeclaration() == typeVariable2.getGenericDeclaration() && typeVariable.getName().equals(typeVariable2.getName());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static String fieldName(String str, String str2) {
        char cCharAt;
        char cCharAt2;
        if (str2 == null) {
            str2 = "CamelCase";
        }
        if (str == null || str.isEmpty()) {
            return str;
        }
        byte b10 = -1;
        switch (str2.hashCode()) {
            case -2068429102:
                if (str2.equals("UpperCase")) {
                    b10 = 0;
                }
                break;
            case -1863045342:
                if (str2.equals("UpperCaseWithDots")) {
                    b10 = 1;
                }
                break;
            case -1112704575:
                if (str2.equals("NeverUseThisValueExceptDefaultValue")) {
                    b10 = 2;
                }
                break;
            case -46641534:
                if (str2.equals("LowerCaseWithUnderScores")) {
                    b10 = 3;
                }
                break;
            case 246111473:
                if (str2.equals("NoChange")) {
                    b10 = 4;
                }
                break;
            case 572594479:
                if (str2.equals("UpperCamelCaseWithUnderScores")) {
                    b10 = 5;
                }
                break;
            case 601822360:
                if (str2.equals("UpperCaseWithDashes")) {
                    b10 = 6;
                }
                break;
            case 928600554:
                if (str2.equals("UpperCamelCaseWithDashes")) {
                    b10 = 7;
                }
                break;
            case 975280372:
                if (str2.equals("UpperCamelCaseWithDots")) {
                    b10 = 8;
                }
                break;
            case 1315531521:
                if (str2.equals("LowerCaseWithDots")) {
                    b10 = 9;
                }
                break;
            case 1336502620:
                if (str2.equals("PascalCase")) {
                    b10 = 10;
                }
                break;
            case 1371349591:
                if (str2.equals("UpperCamelCaseWithSpaces")) {
                    b10 = 11;
                }
                break;
            case 1460726553:
                if (str2.equals("KebabCase")) {
                    b10 = 12;
                }
                break;
            case 1488507313:
                if (str2.equals("LowerCase")) {
                    b10 = 13;
                }
                break;
            case 1492440247:
                if (str2.equals("LowerCaseWithDashes")) {
                    b10 = 14;
                }
                break;
            case 1655544038:
                if (str2.equals("CamelCase")) {
                    b10 = 15;
                }
                break;
            case 1839922637:
                if (str2.equals("CamelCase1x")) {
                    b10 = JSONB.Constants.BC_INT32_NUM_16;
                }
                break;
            case 1976554305:
                if (str2.equals("UpperCaseWithUnderScores")) {
                    b10 = 17;
                }
                break;
            case 2087942256:
                if (str2.equals("SnakeCase")) {
                    b10 = 18;
                }
                break;
        }
        switch (b10) {
            case 0:
                return str.toUpperCase();
            case 1:
                return dots(str, 0, true);
            case 2:
            case 4:
            case 15:
                char cCharAt3 = str.charAt(0);
                char cCharAt4 = str.length() > 1 ? str.charAt(1) : (char) 0;
                if (cCharAt3 >= 'A' && cCharAt3 <= 'Z' && str.length() > 1 && (cCharAt4 < 'A' || cCharAt4 > 'Z')) {
                    char[] charArray = str.toCharArray();
                    charArray[0] = (char) (cCharAt3 + ' ');
                    return new String(charArray);
                }
                return str;
            case 3:
                return underScores(str, 0, false);
            case 5:
                return upperCamelWith(str, 0, '_');
            case 6:
                return dashes(str, 0, true);
            case 7:
                return upperCamelWith(str, 0, '-');
            case 8:
                return upperCamelWith(str, 0, '.');
            case 9:
                return dots(str, 0, false);
            case 10:
                char cCharAt5 = str.charAt(0);
                if (cCharAt5 >= 'a' && cCharAt5 <= 'z' && str.length() > 1 && (cCharAt2 = str.charAt(1)) >= 'a' && cCharAt2 <= 'z') {
                    char[] charArray2 = str.toCharArray();
                    charArray2[0] = (char) (cCharAt5 - ' ');
                    return new String(charArray2);
                }
                if (cCharAt5 == '_' && str.length() > 1 && (cCharAt = str.charAt(1)) >= 'a' && cCharAt <= 'z') {
                    char[] charArray3 = str.toCharArray();
                    charArray3[1] = (char) (cCharAt - ' ');
                    return new String(charArray3);
                }
                return str;
            case 11:
                return upperCamelWith(str, 0, ' ');
            case 12:
                StringBuilder sb2 = new StringBuilder();
                for (int i9 = 0; i9 < str.length(); i9++) {
                    char cCharAt6 = str.charAt(i9);
                    if (cCharAt6 >= 'A' && cCharAt6 <= 'Z') {
                        cCharAt6 = (char) (cCharAt6 + ' ');
                        if (i9 > 0) {
                            sb2.append('-');
                        }
                    }
                    sb2.append(cCharAt6);
                }
                return sb2.toString();
            case 13:
                return str.toLowerCase();
            case 14:
                return dashes(str, 0, false);
            case 16:
                char cCharAt7 = str.charAt(0);
                if (cCharAt7 >= 'A' && cCharAt7 <= 'Z' && str.length() > 1) {
                    char[] charArray4 = str.toCharArray();
                    charArray4[0] = (char) (cCharAt7 + ' ');
                    return new String(charArray4);
                }
                return str;
            case 17:
                return underScores(str, 0, true);
            case 18:
                return snakeCase(str, 0);
            default:
                C0086a.m464w("TODO : ".concat(str2));
                return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void fields(Class cls, Consumer<Field> consumer) {
        ConcurrentMap<Class, Field[]> concurrentMap = fieldCache;
        Field[] fields = concurrentMap.get(cls);
        if (fields == null) {
            fields = cls.getFields();
            concurrentMap.put(cls, fields);
        }
        boolean zIsAssignableFrom = Enum.class.isAssignableFrom(cls);
        for (Field field : fields) {
            int modifiers = field.getModifiers();
            if (field.getType() != ClassLoader.class && (!Modifier.isStatic(modifiers) || zIsAssignableFrom)) {
                consumer.accept(field);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.lang.annotation.Annotation */
    /* JADX WARN: Multi-variable type inference failed */
    public static <A extends Annotation> A findAnnotation(Annotation annotation, Class<A> cls) {
        if (annotation == 0) {
            C0353j.m1305c("annotation must not be null");
            return null;
        }
        if (cls == null) {
            C0353j.m1305c("annotationType must not be null");
            return null;
        }
        if (annotation.annotationType() == cls) {
            return annotation;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Constructor[] getConstructor(Class cls) {
        ConcurrentMap<Class, Constructor[]> concurrentMap = constructorCache;
        Constructor[] constructorArr = concurrentMap.get(cls);
        if (constructorArr != null) {
            return constructorArr;
        }
        Constructor<?>[] declaredConstructors = cls.getDeclaredConstructors();
        concurrentMap.put(cls, declaredConstructors);
        return declaredConstructors;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Field getDeclaredField(Class cls, String str) {
        Map<String, Field> map = fieldMapCache.get(cls);
        if (map == null) {
            HashMap map2 = new HashMap();
            ConcurrentMap<Class, Field[]> concurrentMap = declaredFieldCache;
            Field[] declaredFields = concurrentMap.get(cls);
            if (declaredFields == null) {
                try {
                    declaredFields = cls.getDeclaredFields();
                    concurrentMap.put(cls, declaredFields);
                } catch (Throwable unused) {
                    declaredFields = new Field[0];
                }
                int length = declaredFields.length;
                int i9 = 0;
                while (true) {
                    if (i9 >= length) {
                        break;
                    }
                    if (Modifier.isStatic(declaredFields[i9].getModifiers())) {
                        ArrayList arrayList = new ArrayList(declaredFields.length);
                        for (Field field : declaredFields) {
                            if (!Modifier.isStatic(field.getModifiers())) {
                                arrayList.add(field);
                            }
                        }
                        declaredFields = (Field[]) arrayList.toArray(new Field[arrayList.size()]);
                    } else {
                        i9++;
                    }
                }
                fieldCache.put(cls, declaredFields);
            }
            for (Field field2 : declaredFields) {
                map2.put(field2.getName(), field2);
            }
            ConcurrentMap<Class, Map<String, Field>> concurrentMap2 = fieldMapCache;
            concurrentMap2.put(cls, map2);
            map = concurrentMap2.get(cls);
        }
        return map.get(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Constructor getDefaultConstructor(Class cls, boolean z9) {
        Class<?> declaringClass;
        if (cls == StackTraceElement.class) {
            return null;
        }
        ConcurrentMap<Class, Constructor[]> concurrentMap = constructorCache;
        Constructor[] declaredConstructors = concurrentMap.get(cls);
        if (declaredConstructors == null) {
            declaredConstructors = cls.getDeclaredConstructors();
            concurrentMap.put(cls, declaredConstructors);
        }
        for (Constructor<?> constructor : declaredConstructors) {
            if (constructor.getParameterCount() == 0) {
                return constructor;
            }
        }
        if (z9 && (declaringClass = cls.getDeclaringClass()) != null) {
            for (Constructor<?> constructor2 : declaredConstructors) {
                if (constructor2.getParameterCount() == 1 && declaringClass.equals(constructor2.getParameterTypes()[0])) {
                    return constructor2;
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String[] getEnumAnnotationNames(Class cls) {
        Enum[] enumArr = (Enum[]) cls.getEnumConstants();
        int length = enumArr.length;
        String[] strArr = new String[length];
        ConcurrentMap<Class, Field[]> concurrentMap = fieldCache;
        Field[] fields = concurrentMap.get(cls);
        if (fields == null) {
            fields = cls.getFields();
            concurrentMap.put(cls, fields);
        }
        for (Field field : fields) {
            String name = field.getName();
            int i9 = 0;
            while (true) {
                if (i9 < enumArr.length) {
                    String strName = enumArr[i9].name();
                    if (name.equals(strName)) {
                        JSONField jSONField = (JSONField) field.getAnnotation(JSONField.class);
                        if (jSONField != null) {
                            String strName2 = jSONField.name();
                            if (strName2.length() != 0 && !strName2.equals(strName)) {
                                strArr[i9] = strName2;
                            }
                        }
                    } else {
                        i9++;
                    }
                }
            }
        }
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            if (strArr[i11] == null) {
                i10++;
            }
        }
        if (i10 == length) {
            return null;
        }
        return strArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:88:0x0007 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:91:0x0101 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009d A[PHI: r8
  0x009d: PHI (r8v5 java.lang.reflect.Member) = 
  (r8v1 java.lang.reflect.Member)
  (r8v1 java.lang.reflect.Member)
  (r8v1 java.lang.reflect.Member)
  (r8v1 java.lang.reflect.Member)
  (r8v1 java.lang.reflect.Member)
  (r8v1 java.lang.reflect.Member)
  (r8v1 java.lang.reflect.Member)
  (r8v8 java.lang.reflect.Member)
 binds: [B:11:0x002e, B:14:0x0036, B:17:0x003f, B:19:0x0043, B:22:0x0050, B:38:0x0089, B:40:0x009a, B:41:0x009c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r16v0, types: [java.lang.reflect.Member] */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v3, types: [java.lang.reflect.Member] */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r16v5 */
    /* JADX WARN: Type inference failed for: r16v6, types: [java.lang.reflect.Member] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Member getEnumValueField(Class cls, Object obj) {
        boolean z9;
        ?? r16;
        Class<?> declaringClass;
        Field declaredField;
        ?? r2 = 0;
        r2 = 0;
        if (cls != null) {
            Class<?>[] interfaces = cls.getInterfaces();
            ConcurrentMap<Class, Method[]> concurrentMap = methodCache;
            Method[] methods = concurrentMap.get(cls);
            if (methods == null) {
                methods = cls.getMethods();
                concurrentMap.putIfAbsent(cls, methods);
            }
            int length = methods.length;
            Member member = null;
            int i9 = 0;
            while (i9 < length) {
                final Method method = methods[i9];
                if (method.getReturnType() != Void.class && method.getParameterCount() == 0 && (declaringClass = method.getDeclaringClass()) != Enum.class && declaringClass != Object.class) {
                    final String name = method.getName();
                    if ("values".equals(name)) {
                        r16 = r2;
                    } else {
                        if (isJSONField(method)) {
                            return method;
                        }
                        if (!name.startsWith("get") || (declaredField = getDeclaredField(cls, getterName(name, r2))) == null || !isJSONField(declaredField)) {
                            final AtomicReference atomicReference = new AtomicReference();
                            int length2 = interfaces.length;
                            int i10 = 0;
                            ?? r22 = r2;
                            while (i10 < length2) {
                                Class<?> cls2 = interfaces[i10];
                                ?? r162 = r22;
                                final int i11 = 0;
                                getters(cls2, new Consumer() { // from class: com.alibaba.fastjson2.util.b
                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                    @Override // java.util.function.Consumer
                                    public final void accept(Object obj2) {
                                        switch (i11) {
                                            case 0:
                                                BeanUtils.lambda$getEnumValueField$2(name, atomicReference, method, (Method) obj2);
                                                break;
                                            default:
                                                BeanUtils.lambda$getEnumValueField$3(name, atomicReference, method, (Method) obj2);
                                                break;
                                        }
                                    }
                                });
                                Class mixIn = obj instanceof ObjectReaderProvider ? ((ObjectReaderProvider) obj).getMixIn(cls2) : obj instanceof ObjectWriterProvider ? ((ObjectWriterProvider) obj).getMixIn(cls2) : JSONFactory.defaultObjectWriterProvider.getMixIn(cls2);
                                if (mixIn != null) {
                                    final int i12 = 1;
                                    getters(mixIn, new Consumer() { // from class: com.alibaba.fastjson2.util.b
                                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                        @Override // java.util.function.Consumer
                                        public final void accept(Object obj2) {
                                            switch (i12) {
                                                case 0:
                                                    BeanUtils.lambda$getEnumValueField$2(name, atomicReference, method, (Method) obj2);
                                                    break;
                                                default:
                                                    BeanUtils.lambda$getEnumValueField$3(name, atomicReference, method, (Method) obj2);
                                                    break;
                                            }
                                        }
                                    });
                                }
                                i10++;
                                r22 = r162;
                            }
                            r16 = r22;
                            Member member2 = (Member) atomicReference.get();
                            if (member2 == null) {
                                continue;
                            } else if (member == null) {
                                member = member2;
                            } else if (!member.getName().equals(member2.getName())) {
                                return r16;
                            }
                        } else if (member == null) {
                            r16 = r2;
                            member = method;
                        } else if (member.getName().equals(method.getName())) {
                            if ((member instanceof Method) && ((Method) member).getReturnType().isAssignableFrom(method.getReturnType())) {
                                member = method;
                            }
                            r16 = r2;
                        }
                    }
                }
                i9++;
                r2 = r16;
            }
            ?? r163 = r2;
            if (member != null) {
                return member;
            }
            ConcurrentMap<Class, Field[]> concurrentMap2 = fieldCache;
            Field[] fields = concurrentMap2.get(cls);
            if (fields == null) {
                fields = cls.getFields();
                concurrentMap2.putIfAbsent(cls, fields);
            }
            Enum[] enumArr = (Enum[]) cls.getEnumConstants();
            for (Field field : fields) {
                if (enumArr != null) {
                    String name2 = field.getName();
                    for (Enum r02 : enumArr) {
                        if (name2.equals(r02.name())) {
                            z9 = true;
                            break;
                        }
                    }
                    z9 = false;
                } else {
                    z9 = false;
                }
                if (isJSONField(field) && !z9) {
                    return field;
                }
            }
            return r163;
        }
        return r2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Field getField(Class cls, Method method) {
        boolean z9;
        boolean z10;
        boolean z11;
        final Field[] fieldArr;
        final String name = method.getName();
        final int length = name.length();
        Class<?> returnType = method.getReturnType();
        if (length > 2) {
            char cCharAt = name.charAt(0);
            char cCharAt2 = name.charAt(1);
            char cCharAt3 = name.charAt(2);
            if (cCharAt == 'i' && cCharAt2 == 's') {
                z9 = returnType == Boolean.class || returnType == Boolean.TYPE;
                z10 = false;
                z11 = z10;
            } else if (cCharAt == 'g' && cCharAt2 == 'e' && cCharAt3 == 't') {
                z10 = length > 3;
                z9 = false;
                z11 = false;
            } else {
                if (cCharAt == 's' && cCharAt2 == 'e' && cCharAt3 == 't') {
                    z11 = length > 3 && method.getParameterCount() == 1;
                    z9 = false;
                    z10 = false;
                }
                z9 = false;
                z10 = false;
                z11 = z10;
            }
        } else {
            z9 = false;
            z10 = false;
            z11 = z10;
        }
        Field[] fieldArr2 = new Field[2];
        if (z9 || z10 || z11) {
            if (!z9 && !z10) {
                returnType = method.getParameterTypes()[0];
            }
            final int i9 = z9 ? 2 : 3;
            char[] cArr = new char[length - i9];
            name.getChars(i9, length, cArr, 0);
            final char c10 = cArr[0];
            final Class<?> cls2 = returnType;
            fieldArr = fieldArr2;
            declaredFields(cls, new Consumer() { // from class: com.alibaba.fastjson2.util.a
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    BeanUtils.lambda$getField$4(length, i9, cls2, c10, name, fieldArr, (Field) obj);
                }
            });
        } else {
            fieldArr = fieldArr2;
        }
        Field field = fieldArr[0];
        return field != null ? field : fieldArr[1];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void getFieldInfo(Class cls, FieldInfo fieldInfo, ObjectReaderProvider objectReaderProvider, String str, String str2, String str3) {
        ConcurrentMap<Class, Field[]> concurrentMap = declaredFieldCache;
        Field[] declaredFields = concurrentMap.get(cls);
        if (declaredFields == null) {
            declaredFields = cls.getDeclaredFields();
            concurrentMap.put(cls, declaredFields);
        }
        for (Field field : declaredFields) {
            if ((field.getModifiers() & 8) == 0) {
                String name = field.getName();
                if (name.equals(str)) {
                    objectReaderProvider.getFieldInfo(fieldInfo, cls, field);
                    fieldInfo.features |= FieldInfo.FIELD_MASK;
                } else if (name.equals(str2)) {
                    objectReaderProvider.getFieldInfo(fieldInfo, cls, field);
                    fieldInfo.features |= FieldInfo.FIELD_MASK;
                } else if (name.equals(str3)) {
                    objectReaderProvider.getFieldInfo(fieldInfo, cls, field);
                    fieldInfo.features |= FieldInfo.FIELD_MASK;
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Type getFieldType(TypeReference typeReference, Class<?> cls, Member member, Type type) {
        Class<?> declaringClass = member == null ? null : member.getDeclaringClass();
        while (cls != Object.class) {
            Type type2 = typeReference == null ? null : typeReference.getType();
            if (declaringClass == cls) {
                return resolve(type2, declaringClass, type, new HashMap());
            }
            Type genericSuperclass = cls.getGenericSuperclass();
            if (genericSuperclass == null) {
                break;
            }
            typeReference = TypeReference.get(resolve(type2, cls, genericSuperclass, new HashMap()));
            cls = typeReference.getRawType();
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Type getGenericSupertype(Type type, Class<?> cls, Class<?> cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i9 = 0; i9 < length; i9++) {
                Class<?> cls3 = interfaces[i9];
                if (cls3 == cls2) {
                    return cls.getGenericInterfaces()[i9];
                }
                if (cls2.isAssignableFrom(cls3)) {
                    return getGenericSupertype(cls.getGenericInterfaces()[i9], interfaces[i9], cls2);
                }
            }
        }
        if (cls != null && !cls.isInterface()) {
            while (cls != Object.class) {
                Class<? super Object> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return getGenericSupertype(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void getKotlinConstructor(Class<?> cls, BeanInfo beanInfo) {
        ConcurrentMap<Class, Constructor[]> concurrentMap = constructorCache;
        Constructor[] declaredConstructors = concurrentMap.get(cls);
        if (declaredConstructors == null) {
            declaredConstructors = cls.getDeclaredConstructors();
            concurrentMap.put(cls, declaredConstructors);
        }
        String[] strArr = beanInfo.createParameterNames;
        Constructor<?> constructor = null;
        for (Constructor<?> constructor2 : declaredConstructors) {
            int parameterCount = constructor2.getParameterCount();
            if (strArr == null || parameterCount == strArr.length) {
                if (parameterCount > 2) {
                    Class<?>[] parameterTypes = constructor2.getParameterTypes();
                    if (parameterTypes[parameterCount - 2] == Integer.TYPE && "gg.g".equals(parameterTypes[parameterCount - 1].getName())) {
                        beanInfo.markerConstructor = constructor2;
                    } else if (constructor == null || constructor.getParameterCount() < parameterCount) {
                        constructor = constructor2;
                    }
                }
            }
        }
        beanInfo.creatorConstructor = constructor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String[] getKotlinConstructorParameters(Class<?> cls) {
        if (kotlinKClassConstructor == null && !kotlinClassKlassError) {
            try {
                kotlinKClassConstructor = Class.forName("kotlin.reflect.jvm.internal.KClassImpl").getConstructor(Class.class);
            } catch (Throwable unused) {
                kotlinClassKlassError = true;
            }
        }
        if (kotlinKClassConstructor == null) {
            return null;
        }
        if (kotlinKClassGetConstructors == null && !kotlinClassKlassError) {
            try {
                kotlinKClassGetConstructors = Class.forName("kotlin.reflect.jvm.internal.KClassImpl").getMethod("getConstructors", null);
            } catch (Throwable unused2) {
                kotlinClassKlassError = true;
            }
        }
        if (kotlinKFunctionGetParameters == null && !kotlinClassKlassError) {
            try {
                kotlinKFunctionGetParameters = C1414j.class.getMethod("getParameters", null);
            } catch (Throwable unused3) {
                kotlinClassKlassError = true;
            }
        }
        if (kotlinKParameterGetName == null && !kotlinClassKlassError) {
            try {
                kotlinKParameterGetName = InterfaceC2841c.class.getMethod("getName", null);
            } catch (Throwable unused4) {
                kotlinClassKlassError = true;
            }
        }
        if (kotlinError) {
            return null;
        }
        try {
            Iterator it = ((Iterable) kotlinKClassGetConstructors.invoke(kotlinKClassConstructor.newInstance(cls), null)).iterator();
            Object obj = null;
            while (it.hasNext()) {
                Object next = it.next();
                List list = (List) kotlinKFunctionGetParameters.invoke(next, null);
                if (obj == null || list.size() != 0) {
                    obj = next;
                }
                it.hasNext();
            }
            if (obj == null) {
                return null;
            }
            List list2 = (List) kotlinKFunctionGetParameters.invoke(obj, null);
            String[] strArr = new String[list2.size()];
            for (int i9 = 0; i9 < list2.size(); i9++) {
                strArr[i9] = (String) kotlinKParameterGetName.invoke(list2.get(i9), null);
            }
            return strArr;
        } catch (Throwable unused5) {
            kotlinError = true;
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Method getMethod(Class cls, Method method) {
        if (cls != null && cls != Object.class && cls != Serializable.class) {
            ConcurrentMap<Class, Method[]> concurrentMap = methodCache;
            Method[] methods = concurrentMap.get(cls);
            if (methods == null) {
                methods = cls.getMethods();
                concurrentMap.put(cls, methods);
            }
            for (Method method2 : methods) {
                if (method2.getName().equals(method.getName()) && method2.getParameterCount() == method.getParameterCount()) {
                    Class<?>[] parameterTypes = method2.getParameterTypes();
                    Class<?>[] parameterTypes2 = method.getParameterTypes();
                    for (int i9 = 0; i9 < parameterTypes.length; i9++) {
                        if (!parameterTypes[i9].equals(parameterTypes2[i9])) {
                            break;
                        }
                    }
                    return method2;
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Type getParamType(TypeReference typeReference, Class<?> cls, Class cls2, Type type) {
        while (cls != Object.class) {
            if (cls2 == cls) {
                return resolve(typeReference.getType(), cls2, type, new HashMap());
            }
            typeReference = TypeReference.get(resolve(typeReference.getType(), cls, cls.getGenericSuperclass(), new HashMap()));
            cls = typeReference.getRawType();
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Class<?> getRawType(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            checkArgument(rawType instanceof Class);
            return (Class) rawType;
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance(getRawType(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return getRawType(((WildcardType) type).getUpperBounds()[0]);
        }
        C2104o.m5288m("Expected a Class, ParameterizedType, or GenericArrayType, but <", type, "> is of type ", type == null ? "null" : type.getClass().getName());
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Method getSetter(Class cls, String str) {
        Method[] methodArr = new Method[1];
        setters(cls, new C0305w(str, 7, methodArr));
        return methodArr[0];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String getterName(String str, String str2) {
        char c10;
        if (str2 == null) {
            str2 = "CamelCase";
        }
        int length = str.length();
        int i9 = 0;
        boolean zStartsWith = str.startsWith("is", 0);
        boolean zStartsWith2 = str.startsWith("get", 0);
        int i10 = zStartsWith ? 2 : zStartsWith2 ? 3 : 0;
        if (length == i10) {
            return str;
        }
        switch (str2) {
            case "UpperCase":
                return str.substring(i10).toUpperCase();
            case "UpperCaseWithDots":
                return dots(str, i10, true);
            case "NeverUseThisValueExceptDefaultValue":
            case "CamelCase":
                int i11 = length - i10;
                char[] andSet = charsCache.getAndSet(null);
                if (andSet == null || andSet.length < i11) {
                    andSet = new char[Math.max(32, i11)];
                }
                try {
                    str.getChars(i10, length, andSet, 0);
                    char c11 = andSet[0];
                    boolean z9 = andSet.length > 1 && (c10 = andSet[1]) >= 'A' && c10 <= 'Z';
                    if (c11 >= 'A' && c11 <= 'Z' && !z9) {
                        andSet[0] = (char) (c11 + ' ');
                    }
                    if (i11 <= 8) {
                        long j3 = 0;
                        int i12 = 0;
                        while (true) {
                            if (i12 < i11) {
                                char c12 = andSet[i12];
                                if (c12 > 128) {
                                    j3 = 0;
                                } else {
                                    j3 = (j3 << 8) + ((long) c12);
                                    i12++;
                                }
                            }
                        }
                        if (j3 != 0) {
                            NameCacheEntry[] nameCacheEntryArr = NAME_CACHE;
                            int length2 = ((int) j3) & (nameCacheEntryArr.length - 1);
                            NameCacheEntry nameCacheEntry = nameCacheEntryArr[length2];
                            if (nameCacheEntry == null) {
                                String str3 = new String(andSet, 0, i11);
                                nameCacheEntryArr[length2] = new NameCacheEntry(str3, j3);
                                charsCache.set(andSet);
                                return str3;
                            }
                            if (nameCacheEntry.value == j3) {
                                String str4 = nameCacheEntry.name;
                                charsCache.set(andSet);
                                return str4;
                            }
                        }
                    }
                    String str5 = new String(andSet, 0, i11);
                    charsCache.set(andSet);
                    return str5;
                } catch (Throwable th2) {
                    charsCache.set(andSet);
                    throw th2;
                }
            case "UpperCaseWithDashes":
                return dashes(str, i10, true);
            case "PascalCase":
                return pascal(str, length, i10);
            case "UpperCamelCaseWithSpaces":
                return upperCamelWith(str, i10, ' ');
            case "KebabCase":
                if (zStartsWith) {
                    i9 = 2;
                } else if (zStartsWith2) {
                    i9 = 3;
                }
                StringBuilder sb2 = new StringBuilder();
                for (int i13 = i9; i13 < str.length(); i13++) {
                    char cCharAt = str.charAt(i13);
                    if (cCharAt >= 'A' && cCharAt <= 'Z') {
                        cCharAt = (char) (cCharAt + ' ');
                        if (i13 > i9) {
                            sb2.append('-');
                        }
                    }
                    sb2.append(cCharAt);
                }
                return sb2.toString();
            case "CamelCase1x":
                char[] cArr = new char[length - i10];
                str.getChars(i10, length, cArr, 0);
                char c13 = cArr[0];
                if (c13 >= 'A' && c13 <= 'Z') {
                    cArr[0] = (char) (c13 + ' ');
                }
                return new String(cArr);
            case "UpperCaseWithUnderScores":
                return underScores(str, i10, true);
            case "SnakeCase":
                return snakeCase(str, i10);
            default:
                C0086a.m464w("TODO : ".concat(str2));
                return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:103:0x017d A[PHI: r6 r17 r24
  0x017d: PHI (r6v5 int) = (r6v4 int), (r6v4 int), (r6v7 int) binds: [B:151:0x01f2, B:155:0x01fb, B:102:0x017b] A[DONT_GENERATE, DONT_INLINE]
  0x017d: PHI (r17v2 java.lang.reflect.Method[]) = (r17v1 java.lang.reflect.Method[]), (r17v1 java.lang.reflect.Method[]), (r17v3 java.lang.reflect.Method[]) binds: [B:151:0x01f2, B:155:0x01fb, B:102:0x017b] A[DONT_GENERATE, DONT_INLINE]
  0x017d: PHI (r24v2 boolean) = (r24v1 boolean), (r24v1 boolean), (r24v3 boolean) binds: [B:151:0x01f2, B:155:0x01fb, B:102:0x017b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01e3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void getters(Class cls, Class cls2, boolean z9, Consumer<Method> consumer) {
        Class<?> returnType;
        Class<?> declaringClass;
        int i9;
        Method[] methodArr;
        boolean z10;
        int i10;
        int i11;
        int i12;
        int i13;
        char cCharAt;
        int i14;
        int i15;
        Consumer<Method> consumer2;
        int i16;
        int i17;
        Method method;
        int i18;
        boolean z11;
        boolean z12;
        if (cls == null) {
            return;
        }
        Class<?> superclass = cls.getSuperclass();
        ConcurrentMap<Class, Method[]> concurrentMap = methodCache;
        Method[] methods = concurrentMap.get(cls);
        if (methods == null) {
            methods = cls.getMethods();
            concurrentMap.put(cls, methods);
        }
        int i19 = 1;
        int i20 = 0;
        boolean z13 = superclass != null && superclass.getName().equals("com.google.protobuf.GeneratedMessageV3");
        int length = methods.length;
        int i21 = 0;
        while (i21 < length) {
            Method method2 = methods[i21];
            if ((method2.getModifiers() & 8) == 0 && (returnType = method2.getReturnType()) != Void.class && returnType != ClassLoader.class && (declaringClass = method2.getDeclaringClass()) != Enum.class && declaringClass != Object.class && method2.getParameterCount() == 0) {
                String name = method2.getName();
                name.getClass();
                switch (name.hashCode()) {
                    case -1776922004:
                        i9 = !name.equals("toString") ? -1 : i20;
                        break;
                    case -1650707301:
                        if (name.equals("getSerializedSize")) {
                            i9 = i19;
                            break;
                        }
                        break;
                    case -1295482945:
                        if (name.equals("equals")) {
                            i9 = 2;
                            break;
                        }
                        break;
                    case -176012470:
                        if (name.equals("isInitialized")) {
                            i9 = 3;
                            break;
                        }
                        break;
                    case 147696667:
                        if (name.equals("hashCode")) {
                            i9 = 4;
                            break;
                        }
                        break;
                    case 598581443:
                        if (name.equals("getInitializationErrorString")) {
                            i9 = 5;
                            break;
                        }
                        break;
                }
                switch (i9) {
                    case 0:
                    case 2:
                    case 4:
                        methodArr = methods;
                        i15 = i20;
                        z10 = z13;
                        i10 = i19;
                        break;
                    case 1:
                    case 3:
                    case 5:
                        if (!z13) {
                            if (!z13 || ((!name.endsWith("Type") && !name.endsWith("Bytes")) || !returnType.getName().equals("com.google.protobuf.ByteString"))) {
                                boolean zStartsWith = name.startsWith("isSet", i20);
                                Class<?> cls3 = Boolean.TYPE;
                                if (zStartsWith && returnType == cls3) {
                                    String str = getterName(name, null);
                                    String strConcat = "g".concat(str.substring(i19));
                                    String strConcat2 = "un".concat(str);
                                    int length2 = methods.length;
                                    methodArr = methods;
                                    int i22 = 0;
                                    boolean z14 = false;
                                    boolean z15 = false;
                                    boolean z16 = false;
                                    while (i22 < length2) {
                                        Method method3 = methodArr[i22];
                                        int i23 = length2;
                                        boolean zEquals = method3.getName().equals(str);
                                        Class<?> cls4 = Void.TYPE;
                                        if (zEquals) {
                                            i18 = i22;
                                            z11 = z13;
                                            z12 = true;
                                            if (method3.getParameterCount() == 1 && method3.getReturnType() == cls4) {
                                                z14 = true;
                                            }
                                            i22 = i18 + 1;
                                            length2 = i23;
                                            z13 = z11;
                                        } else {
                                            i18 = i22;
                                            z11 = z13;
                                            z12 = true;
                                        }
                                        if (method3.getName().equals(strConcat) && method3.getParameterCount() == 0) {
                                            z16 = z12;
                                        } else if (method3.getName().equals(strConcat2) && method3.getParameterCount() == 0 && method3.getReturnType() == cls4) {
                                            z15 = z12;
                                        }
                                        i22 = i18 + 1;
                                        length2 = i23;
                                        z13 = z11;
                                    }
                                    z10 = z13;
                                    i10 = 1;
                                    if (z14 && z15 && z16 && findAnnotation(method2, JSONField.class) == null) {
                                        i15 = 0;
                                        break;
                                    }
                                } else {
                                    methodArr = methods;
                                    z10 = z13;
                                    i10 = i19;
                                }
                                int length3 = name.length();
                                int i24 = (length3 <= 3 || !name.startsWith("get", 0)) ? 0 : i10;
                                if (i24 != 0) {
                                    char cCharAt2 = name.charAt(3);
                                    if (cCharAt2 < 'a' || cCharAt2 > 'z') {
                                        i11 = 4;
                                    } else {
                                        i11 = 4;
                                        if (length3 == 4) {
                                            i24 = 0;
                                        }
                                    }
                                } else {
                                    i11 = 4;
                                    if (returnType == cls3 || returnType == Boolean.class || z9) {
                                        i12 = 2;
                                        i13 = (length3 <= 2 || !name.startsWith("is", 0)) ? 0 : i10;
                                        if (i13 != 0 && (cCharAt = name.charAt(2)) >= 'a' && cCharAt <= 'z') {
                                            i14 = 3;
                                            if (length3 == 3) {
                                                i13 = 0;
                                            }
                                        }
                                        if (i13 == 0 && isJSONField(method2)) {
                                            i13 = i10;
                                        }
                                        if (i13 == 0 && cls2 != null && (method = getMethod(cls2, method2)) != null && isJSONField(method)) {
                                            i13 = i10;
                                        }
                                        if (i13 != 0) {
                                            if (!z10) {
                                                i15 = 0;
                                                consumer2 = consumer;
                                            } else if (method2.getDeclaringClass() != superclass) {
                                                Class<?> returnType2 = method2.getReturnType();
                                                switch (name.hashCode()) {
                                                    case -1650707301:
                                                        i16 = !name.equals("getSerializedSize") ? -1 : 0;
                                                        break;
                                                    case 132778702:
                                                        if (name.equals("getParserForType")) {
                                                            i16 = i10;
                                                            break;
                                                        }
                                                        break;
                                                    case 208401389:
                                                        if (name.equals("getUnknownFields")) {
                                                            i16 = i12;
                                                            break;
                                                        }
                                                        break;
                                                    case 313806618:
                                                        if (name.equals("getMessageBytes")) {
                                                            i16 = i14;
                                                            break;
                                                        }
                                                        break;
                                                    case 2019988419:
                                                        if (name.equals("getDefaultInstanceForType")) {
                                                            i16 = i11;
                                                            break;
                                                        }
                                                        break;
                                                }
                                                switch (i16) {
                                                    case 0:
                                                    case 1:
                                                    case 2:
                                                    case 3:
                                                    case 4:
                                                        i15 = 0;
                                                        i17 = (returnType2.getName().startsWith("com.google.protobuf.", 0) || returnType2 == cls) ? i10 : 0;
                                                        break;
                                                    default:
                                                        i15 = 0;
                                                        i17 = 0;
                                                        break;
                                                }
                                                consumer2 = consumer;
                                                if (i17 != 0) {
                                                }
                                                break;
                                            }
                                            consumer2.accept(method2);
                                            break;
                                        }
                                    }
                                    i14 = 3;
                                    if (i13 == 0) {
                                        i13 = i10;
                                    }
                                    if (i13 == 0) {
                                        i13 = i10;
                                    }
                                    if (i13 != 0) {
                                    }
                                }
                                i13 = i24;
                                i12 = 2;
                                i14 = 3;
                                if (i13 == 0) {
                                }
                                if (i13 == 0) {
                                }
                                if (i13 != 0) {
                                }
                            }
                        }
                        break;
                }
            }
            i21++;
            i19 = i10;
            i20 = i15;
            methods = methodArr;
            z13 = z10;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int hashCodeOrZero(Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static int indexOf(Object[] objArr, Object obj) {
        int length = objArr.length;
        for (int i9 = 0; i9 < length; i9++) {
            if (obj.equals(objArr[i9])) {
                return i9;
            }
        }
        C0353j.m1307e();
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static boolean isJSONField(AnnotatedElement annotatedElement) {
        for (Annotation annotation : annotatedElement.getAnnotations()) {
            String name = annotation.annotationType().getName();
            if (name.equals("com.alibaba.fastjson.annotation.JSONField") || name.equals("com.alibaba.fastjson2.annotation.JSONField")) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean isNoneStaticMemberClass(Class cls, Class cls2) {
        Class<?> enclosingClass = cls2.getEnclosingClass();
        if (enclosingClass == null || !(cls == null || cls.equals(enclosingClass))) {
            return false;
        }
        ConcurrentMap<Class, Constructor[]> concurrentMap = constructorCache;
        Constructor[] declaredConstructors = concurrentMap.get(cls2);
        if (declaredConstructors == null) {
            declaredConstructors = cls2.getDeclaredConstructors();
            concurrentMap.put(cls2, declaredConstructors);
        }
        if (declaredConstructors.length == 0) {
            return false;
        }
        Class<?>[] parameterTypes = declaredConstructors[0].getParameterTypes();
        if (parameterTypes.length == 0) {
            return false;
        }
        return enclosingClass.equals(parameterTypes[0]);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean isWriteEnumAsJavaBean(Class cls) {
        for (Annotation annotation : cls.getDeclaredAnnotations()) {
            JSONType jSONType = (JSONType) findAnnotation(annotation, JSONType.class);
            if (jSONType != null) {
                return jSONType.writeEnumAsJavaBean();
            }
            Class<? extends Annotation> clsAnnotationType = annotation.annotationType();
            if ("com.alibaba.fastjson.annotation.JSONType".equals(clsAnnotationType.getName())) {
                BeanInfo beanInfo = new BeanInfo();
                annotationMethods(clsAnnotationType, new C0628g(beanInfo, annotation, 3));
                if (beanInfo.writeEnumAsJavaBean) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$getEnumValueField$2(String str, AtomicReference atomicReference, Method method, Method method2) {
        if (method2.getName().equals(str) && isJSONField(method2)) {
            atomicReference.set(method);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$getEnumValueField$3(String str, AtomicReference atomicReference, Method method, Method method2) {
        if (method2.getName().equals(str) && isJSONField(method2)) {
            atomicReference.set(method);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$getField$4(int i9, int i10, Class cls, char c10, String str, Field[] fieldArr, Field field) {
        String name = field.getName();
        int length = name.length();
        if (length != i9 - i10 || (field.getType() != cls && !cls.isAssignableFrom(field.getType()))) {
            if (Boolean.TYPE == field.getType() && str.equals(name)) {
                fieldArr[0] = field;
                return;
            }
            return;
        }
        if (c10 >= 'A' && c10 <= 'Z' && c10 + ' ' == name.charAt(0) && name.regionMatches(1, str, i10 + 1, length - 1)) {
            fieldArr[0] = field;
        } else if (name.regionMatches(0, str, i10, length)) {
            fieldArr[1] = field;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$getSetter$0(String str, Method[] methodArr, Method method) {
        if (str.equals(method.getName())) {
            methodArr[0] = method;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String[] lookupParameterNames(Constructor constructor) {
        Class declaringClass = constructor.getDeclaringClass();
        Class<?>[] parameterTypes = constructor.getParameterTypes();
        if (Throwable.class.isAssignableFrom(declaringClass)) {
            int length = parameterTypes.length;
            if (length == 1) {
                Class<?> cls = parameterTypes[0];
                if (cls == String.class) {
                    return new String[]{"message"};
                }
                if (Throwable.class.isAssignableFrom(cls)) {
                    return new String[]{"cause"};
                }
            } else if (length == 2 && parameterTypes[0] == String.class && Throwable.class.isAssignableFrom(parameterTypes[1])) {
                return new String[]{"message", "cause"};
            }
        }
        int length2 = parameterTypes.length;
        String[] strArr = new String[length2];
        if (length2 > 0 && parameterTypes[0] == declaringClass.getDeclaringClass() && !Modifier.isStatic(declaringClass.getModifiers())) {
            strArr[0] = "this.$0";
        }
        return strArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static ParameterizedType newParameterizedTypeWithOwner(Type type, Type type2, Type... typeArr) {
        return new ParameterizedTypeImpl(type, type2, typeArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static String pascal(String str, int i9, int i10) {
        char c10;
        char c11;
        int i11 = i9 - i10;
        char[] cArr = new char[i11];
        str.getChars(i10, i9, cArr, 0);
        char c12 = cArr[0];
        if (c12 >= 'a' && c12 <= 'z' && i11 > 1) {
            cArr[0] = (char) (c12 - ' ');
        } else if (c12 == '_' && i11 > 2 && (c10 = cArr[1]) >= 'a' && c10 <= 'z' && (c11 = cArr[2]) >= 'a' && c11 <= 'z') {
            cArr[1] = (char) (c10 - ' ');
        }
        return new String(cArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static void processJSONType1x(BeanInfo beanInfo, Annotation annotation, Method method) {
        try {
            Object objInvoke = method.invoke(annotation, null);
            String name = method.getName();
            int i9 = 0;
            switch (name.hashCode()) {
                case -1678076717:
                    if (name.equals("deserializer")) {
                        Class cls = (Class) objInvoke;
                        if (ObjectReader.class.isAssignableFrom(cls)) {
                            beanInfo.deserializer = cls;
                            return;
                        }
                        return;
                    }
                    return;
                case -1315832283:
                    if (name.equals("serializeEnumAsJavaBean") && ((Boolean) objInvoke).booleanValue()) {
                        beanInfo.writeEnumAsJavaBean = true;
                        return;
                    }
                    return;
                case -1210506547:
                    if (!name.equals("alphabetic") || ((Boolean) objInvoke).booleanValue()) {
                        return;
                    }
                    beanInfo.alphabetic = false;
                    return;
                case -1052827512:
                    if (name.equals("naming")) {
                        beanInfo.namingStrategy = ((Enum) objInvoke).name();
                        return;
                    }
                    return;
                case -1008770331:
                    if (name.equals("orders")) {
                        String[] strArr = (String[]) objInvoke;
                        if (strArr.length != 0) {
                            beanInfo.orders = strArr;
                            return;
                        }
                        return;
                    }
                    return;
                case -940893828:
                    if (!name.equals("serialzeFeatures")) {
                        return;
                    }
                    break;
                case -853109563:
                    if (name.equals("typeKey")) {
                        String str = (String) objInvoke;
                        if (str.isEmpty()) {
                            return;
                        }
                        beanInfo.typeKey = str;
                        return;
                    }
                    return;
                case -676507419:
                    if (name.equals("typeName")) {
                        String str2 = (String) objInvoke;
                        if (str2.isEmpty()) {
                            return;
                        }
                        beanInfo.typeName = str2;
                        return;
                    }
                    return;
                case -597985902:
                    if (name.equals("serializer")) {
                        Class cls2 = (Class) objInvoke;
                        if (ObjectWriter.class.isAssignableFrom(cls2)) {
                            beanInfo.writeEnumAsJavaBean = true;
                            beanInfo.serializer = cls2;
                            return;
                        }
                        return;
                    }
                    return;
                case -167039347:
                    if (name.equals("rootName")) {
                        String str3 = (String) objInvoke;
                        if (str3.isEmpty()) {
                            return;
                        }
                        beanInfo.rootName = str3;
                        return;
                    }
                    return;
                case 90259659:
                    if (name.equals("includes")) {
                        String[] strArr2 = (String[]) objInvoke;
                        if (strArr2.length != 0) {
                            beanInfo.includes = strArr2;
                            return;
                        }
                        return;
                    }
                    return;
                case 1752415457:
                    if (name.equals("ignores")) {
                        String[] strArr3 = (String[]) objInvoke;
                        if (strArr3.length != 0) {
                            if (beanInfo.ignores == null) {
                                beanInfo.ignores = strArr3;
                                return;
                            }
                            LinkedHashSet linkedHashSet = new LinkedHashSet();
                            String[] strArr4 = beanInfo.ignores;
                            int length = strArr4.length;
                            while (i9 < length) {
                                linkedHashSet.add(strArr4[i9]);
                                i9++;
                            }
                            Collections.addAll(linkedHashSet, strArr3);
                            beanInfo.ignores = (String[]) linkedHashSet.toArray(new String[linkedHashSet.size()]);
                            return;
                        }
                        return;
                    }
                    return;
                case 1869860669:
                    if (!name.equals("serializeFeatures")) {
                        return;
                    }
                    break;
                case 1970571962:
                    if (name.equals("seeAlso")) {
                        Class[] clsArr = (Class[]) objInvoke;
                        if (clsArr.length != 0) {
                            beanInfo.seeAlso = clsArr;
                            return;
                        }
                        return;
                    }
                    return;
                default:
                    return;
            }
            Enum[] enumArr = (Enum[]) objInvoke;
            int length2 = enumArr.length;
            while (i9 < length2) {
                String strName = enumArr[i9].name();
                switch (strName.hashCode()) {
                    case -1937516631:
                        if (strName.equals("WriteNullNumberAsZero")) {
                            beanInfo.writerFeatures |= JSONWriter.Feature.WriteNullNumberAsZero.mask;
                        }
                        break;
                    case -1779797023:
                        if (strName.equals("IgnoreErrorGetter")) {
                            beanInfo.writerFeatures |= JSONWriter.Feature.IgnoreErrorGetter.mask;
                        }
                        break;
                    case -335314544:
                        if (strName.equals("WriteEnumUsingToString")) {
                            beanInfo.writerFeatures |= JSONWriter.Feature.WriteEnumUsingToString.mask;
                        }
                        break;
                    case -211922948:
                        if (strName.equals("BrowserCompatible")) {
                            beanInfo.writerFeatures |= JSONWriter.Feature.BrowserCompatible.mask;
                        }
                        break;
                    case -102443356:
                        if (strName.equals("WriteNullStringAsEmpty")) {
                            beanInfo.writerFeatures |= JSONWriter.Feature.WriteNullStringAsEmpty.mask;
                        }
                        break;
                    case -62964779:
                        if (strName.equals("NotWriteRootClassName")) {
                            beanInfo.writerFeatures |= JSONWriter.Feature.NotWriteRootClassName.mask;
                        }
                        break;
                    case 1009181687:
                        if (strName.equals("WriteNullListAsEmpty")) {
                            beanInfo.writerFeatures |= JSONWriter.Feature.WriteNullListAsEmpty.mask;
                        }
                        break;
                    case 1519175029:
                        if (strName.equals("WriteNonStringValueAsString")) {
                            beanInfo.writerFeatures |= JSONWriter.Feature.WriteNonStringValueAsString.mask;
                        }
                        break;
                    case 1808123471:
                        if (strName.equals("WriteNullBooleanAsFalse")) {
                            beanInfo.writerFeatures |= JSONWriter.Feature.WriteNullBooleanAsFalse.mask;
                        }
                        break;
                    case 1879776036:
                        if (strName.equals("WriteClassName")) {
                            beanInfo.writerFeatures |= JSONWriter.Feature.WriteClassName.mask;
                        }
                        break;
                    case 2049970061:
                        if (strName.equals("WriteMapNullValue")) {
                            beanInfo.writerFeatures |= JSONWriter.Feature.WriteNulls.mask;
                        }
                        break;
                }
                i9++;
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:44:0x00a0 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:64:? */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0049  */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r11v10, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.reflect.WildcardType] */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.reflect.WildcardType] */
    /* JADX WARN: Type inference failed for: r11v4, types: [java.lang.reflect.ParameterizedType] */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.lang.reflect.GenericArrayType] */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9, types: [java.lang.Object, java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.util.Map, java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type>] */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static Type resolve(Type type, Class<?> cls, Type type2, Map<TypeVariable<?>, Type> map) {
        Type typeResolve;
        Type typeNewParameterizedTypeWithOwner;
        TypeVariable typeVariable = null;
        while (true) {
            if (type2 instanceof TypeVariable) {
                TypeVariable typeVariable2 = (TypeVariable) type2;
                Type type3 = (Type) map.get(typeVariable2);
                Class cls2 = Void.TYPE;
                if (type3 != null) {
                    return type3 == cls2 ? type2 : type3;
                }
                map.put(typeVariable2, cls2);
                if (typeVariable == null) {
                    typeVariable = typeVariable2;
                }
                type2 = resolveTypeVariable(type, cls, typeVariable2);
                if (type2 == typeVariable2) {
                    break;
                }
            } else if (type2 instanceof Class) {
                Class cls3 = (Class) type2;
                if (cls3.isArray()) {
                    Class<?> componentType = cls3.getComponentType();
                    Type typeResolve2 = resolve(type, cls, componentType, map);
                    if (equal(componentType, typeResolve2)) {
                        type2 = cls3;
                    } else {
                        typeNewParameterizedTypeWithOwner = arrayOf(typeResolve2);
                        type2 = typeNewParameterizedTypeWithOwner;
                    }
                } else if (type2 instanceof GenericArrayType) {
                    type2 = (GenericArrayType) type2;
                    Type genericComponentType = type2.getGenericComponentType();
                    Type typeResolve3 = resolve(type, cls, genericComponentType, map);
                    if (!equal(genericComponentType, typeResolve3)) {
                        typeNewParameterizedTypeWithOwner = arrayOf(typeResolve3);
                        type2 = typeNewParameterizedTypeWithOwner;
                    }
                } else {
                    if (type2 instanceof ParameterizedType) {
                        type2 = (ParameterizedType) type2;
                        Type ownerType = type2.getOwnerType();
                        Type typeResolve4 = resolve(type, cls, ownerType, map);
                        boolean z9 = !equal(typeResolve4, ownerType);
                        Type[] actualTypeArguments = type2.getActualTypeArguments();
                        int length = actualTypeArguments.length;
                        for (int i9 = 0; i9 < length; i9++) {
                            Type type4 = actualTypeArguments[i9];
                            if (type4 != String.class) {
                                Type typeResolve5 = resolve(type, cls, type4, map);
                                if (!equal(typeResolve5, type4)) {
                                    if (!z9) {
                                        actualTypeArguments = (Type[]) actualTypeArguments.clone();
                                        z9 = true;
                                    }
                                    actualTypeArguments[i9] = typeResolve5;
                                }
                            }
                        }
                        if (z9) {
                            typeNewParameterizedTypeWithOwner = newParameterizedTypeWithOwner(typeResolve4, type2.getRawType(), actualTypeArguments);
                            type2 = typeNewParameterizedTypeWithOwner;
                        }
                    } else if (type2 instanceof WildcardType) {
                        WildcardType wildcardType = (WildcardType) type2;
                        Type[] lowerBounds = wildcardType.getLowerBounds();
                        Type[] upperBounds = wildcardType.getUpperBounds();
                        if (lowerBounds.length == 1) {
                            Type typeResolve6 = resolve(type, cls, lowerBounds[0], map);
                            if (typeResolve6 != lowerBounds[0]) {
                                type2 = supertypeOf(typeResolve6);
                            }
                        } else if (upperBounds.length == 1 && (typeResolve = resolve(type, cls, upperBounds[0], map)) != upperBounds[0]) {
                            type2 = subtypeOf(typeResolve);
                        }
                    }
                }
            }
        }
        if (typeVariable != null) {
            map.put(typeVariable, type2);
        }
        return type2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Type resolveTypeVariable(Type type, Class<?> cls, TypeVariable<?> typeVariable) {
        Class<?> clsDeclaringClassOf = declaringClassOf(typeVariable);
        if (clsDeclaringClassOf != null) {
            Type genericSupertype = getGenericSupertype(type, cls, clsDeclaringClassOf);
            if (genericSupertype instanceof ParameterizedType) {
                return ((ParameterizedType) genericSupertype).getActualTypeArguments()[indexOf(clsDeclaringClassOf.getTypeParameters(), typeVariable)];
            }
        }
        return typeVariable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void setNoneStaticMemberClassParent(Object obj, Object obj2) {
        if (obj == null) {
            return;
        }
        Class<?> cls = obj.getClass();
        Field[] declaredFields = declaredFieldCache.get(cls);
        if (declaredFields == null) {
            declaredFields = cls.getDeclaredFields();
            int length = declaredFields.length;
            int i9 = 0;
            while (true) {
                if (i9 >= length) {
                    break;
                }
                if (Modifier.isStatic(declaredFields[i9].getModifiers())) {
                    ArrayList arrayList = new ArrayList(declaredFields.length);
                    for (Field field : declaredFields) {
                        if (!Modifier.isStatic(field.getModifiers())) {
                            arrayList.add(field);
                        }
                    }
                    declaredFields = (Field[]) arrayList.toArray(new Field[arrayList.size()]);
                } else {
                    i9++;
                }
            }
            fieldCache.put(cls, declaredFields);
        }
        Field field2 = null;
        for (Field field3 : declaredFields) {
            if ("this$0".equals(field3.getName())) {
                field2 = field3;
            }
        }
        if (field2 != null) {
            field2.setAccessible(true);
            try {
                field2.set(obj, obj2);
            } catch (IllegalAccessException unused) {
                C0086a.m464w(AbstractC3199a.m6838k(cls, "setNoneStaticMemberClassParent error, class "));
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String setterName(String str, String str2) {
        int i9;
        int i10;
        char c10;
        if (str2 == null) {
            str2 = "CamelCase";
        }
        int length = str.length();
        if (length <= 3) {
            return str;
        }
        i10 = str.startsWith("set", 0) ? 3 : 0;
        switch (str2) {
            case "UpperCase":
                int i11 = length - i10;
                char[] cArr = new char[i11];
                str.getChars(i10, length, cArr, 0);
                char c11 = cArr[0];
                for (i9 = 0; i9 < i11; i9++) {
                    char c12 = cArr[i9];
                    if (c12 >= 'a' && c11 <= 'z') {
                        cArr[i9] = (char) (c12 - ' ');
                    }
                }
                return new String(cArr);
            case "NeverUseThisValueExceptDefaultValue":
            case "CamelCase":
                int i12 = length - i10;
                char[] cArr2 = new char[i12];
                str.getChars(i10, length, cArr2, 0);
                char c13 = cArr2[0];
                boolean z9 = i12 > 1 && (c10 = cArr2[1]) >= 'A' && c10 <= 'Z';
                if (c13 >= 'A' && c13 <= 'Z' && !z9) {
                    cArr2[0] = (char) (c13 + ' ');
                }
                return new String(cArr2);
            case "PascalCase":
                return pascal(str, length, i10);
            case "UpperCaseWithUnderScores":
                return underScores(str, i10, true);
            case "SnakeCase":
                return snakeCase(str, i10);
            default:
                C0086a.m464w("TODO : ".concat(str2));
                return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0153 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void setters(Class cls, BeanInfo beanInfo, Class cls2, Consumer<Method> consumer) {
        String name;
        boolean z9;
        Method method;
        ConcurrentMap<Class, Method[]> concurrentMap = methodCache;
        Method[] methods = concurrentMap.get(cls);
        if (methods == null) {
            methods = cls.getMethods();
            concurrentMap.put(cls, methods);
        }
        for (Method method2 : methods) {
            if (!Modifier.isStatic(method2.getModifiers()) && method2.getDeclaringClass() != Object.class) {
                name = method2.getName();
                name.getClass();
                z9 = true;
                switch (name) {
                    case "toString":
                    case "equals":
                    case "hashCode":
                        break;
                    case "copy":
                        if (beanInfo != null && beanInfo.kotlin) {
                            break;
                        }
                    default:
                        Class<?>[] parameterTypes = method2.getParameterTypes();
                        int length = parameterTypes.length;
                        if (length != 0) {
                            if (length == 2 && method2.getReturnType() == Void.TYPE && parameterTypes[0] == String.class) {
                                Annotation[] declaredAnnotations = method2.getDeclaredAnnotations();
                                int length2 = declaredAnnotations.length;
                                int i9 = 0;
                                while (true) {
                                    if (i9 >= length2) {
                                    }
                                    JSONField jSONField = (JSONField) findAnnotation(declaredAnnotations[i9], JSONField.class);
                                    if (jSONField != null && jSONField.unwrapped()) {
                                        consumer.accept(method2);
                                    } else {
                                        i9++;
                                    }
                                    break;
                                    break;
                                }
                            } else if (length != 1) {
                                break;
                            } else {
                                boolean z10 = name.length() > 3 && name.startsWith("set", 0);
                                if (!z10 && cls2 != null && (method = getMethod(cls2, method2)) != null) {
                                    Annotation[] declaredAnnotations2 = method.getDeclaredAnnotations();
                                    int length3 = declaredAnnotations2.length;
                                    int i10 = 0;
                                    while (true) {
                                        if (i10 < length3) {
                                            Annotation annotation = declaredAnnotations2[i10];
                                            if (annotation.annotationType() != JSONField.class) {
                                                i10++;
                                            } else if (!((JSONField) annotation).unwrapped()) {
                                                z10 = true;
                                            }
                                        }
                                    }
                                }
                                if (!z10) {
                                    Annotation[] declaredAnnotations3 = method2.getDeclaredAnnotations();
                                    int length4 = declaredAnnotations3.length;
                                    int i11 = 0;
                                    while (true) {
                                        if (i11 < length4) {
                                            Annotation annotation2 = declaredAnnotations3[i11];
                                            if (annotation2.annotationType() != JSONField.class) {
                                                i11++;
                                            } else if (((JSONField) annotation2).unwrapped()) {
                                            }
                                        }
                                    }
                                    z9 = z10;
                                    if (!z9) {
                                        consumer.accept(method2);
                                    }
                                    break;
                                } else {
                                    z9 = z10;
                                    if (!z9) {
                                    }
                                }
                            }
                        } else if (name.length() <= 3 || !name.startsWith("get", 0)) {
                            break;
                        } else {
                            Class<?> returnType = method2.getReturnType();
                            if (returnType == AtomicInteger.class || returnType == AtomicLong.class || returnType == AtomicBoolean.class || returnType == AtomicIntegerArray.class || returnType == AtomicLongArray.class || returnType == AtomicReference.class || Collection.class.isAssignableFrom(returnType) || Map.class.isAssignableFrom(returnType)) {
                                consumer.accept(method2);
                                break;
                            }
                        }
                        break;
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String snakeCase(String str, int i9) {
        int length = str.length();
        char[] andSet = TypeUtils.CHARS_UPDATER.getAndSet(TypeUtils.CACHE, null);
        if (andSet == null) {
            andSet = new char[128];
        }
        int i10 = i9;
        int i11 = 0;
        while (i10 < length) {
            try {
                char cCharAt = str.charAt(i10);
                if (cCharAt >= 'A' && cCharAt <= 'Z') {
                    cCharAt = (char) (cCharAt + ' ');
                    if (i10 > i9) {
                        andSet[i11] = '_';
                        i11++;
                    }
                }
                andSet[i11] = cCharAt;
                i10++;
                i11++;
            } catch (Throwable th2) {
                TypeUtils.CHARS_UPDATER.set(TypeUtils.CACHE, andSet);
                throw th2;
            }
        }
        String str2 = new String(andSet, 0, i11);
        TypeUtils.CHARS_UPDATER.set(TypeUtils.CACHE, andSet);
        return str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void staticMethod(Class cls, Consumer<Method> consumer) {
        ConcurrentMap<Class, Method[]> concurrentMap = methodCache;
        Method[] methods = concurrentMap.get(cls);
        if (methods == null) {
            methods = cls.getMethods();
            concurrentMap.put(cls, methods);
        }
        for (Method method : methods) {
            if (Modifier.isStatic(method.getModifiers())) {
                consumer.accept(method);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static WildcardType subtypeOf(Type type) {
        return new WildcardTypeImpl(type instanceof WildcardType ? ((WildcardType) type).getUpperBounds() : new Type[]{type}, EMPTY_TYPE_ARRAY);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static WildcardType supertypeOf(Type type) {
        return new WildcardTypeImpl(new Type[]{Object.class}, type instanceof WildcardType ? ((WildcardType) type).getLowerBounds() : new Type[]{type});
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String typeToString(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String underScores(String str, int i9, boolean z9) {
        int i10;
        int length = str.length();
        char[] andSet = TypeUtils.CHARS_UPDATER.getAndSet(TypeUtils.CACHE, null);
        if (andSet == null) {
            andSet = new char[128];
        }
        int i11 = i9;
        int i12 = 0;
        while (i11 < length) {
            try {
                char cCharAt = str.charAt(i11);
                if (z9) {
                    if (cCharAt < 'A' || cCharAt > 'Z') {
                        if (cCharAt >= 'a' && cCharAt <= 'z') {
                            i10 = cCharAt - ' ';
                            cCharAt = (char) i10;
                        }
                    } else if (i11 > i9) {
                        andSet[i12] = '_';
                        i12++;
                    }
                } else if (cCharAt >= 'A' && cCharAt <= 'Z') {
                    if (i11 > i9) {
                        andSet[i12] = '_';
                        i12++;
                    }
                    i10 = cCharAt + ' ';
                    cCharAt = (char) i10;
                }
                andSet[i12] = cCharAt;
                i11++;
                i12++;
            } catch (Throwable th2) {
                TypeUtils.CHARS_UPDATER.set(TypeUtils.CACHE, andSet);
                throw th2;
            }
        }
        String str2 = new String(andSet, 0, i12);
        TypeUtils.CHARS_UPDATER.set(TypeUtils.CACHE, andSet);
        return str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String upperCamelWith(String str, int i9, char c10) {
        int i10;
        char cCharAt;
        char cCharAt2;
        int i11;
        int i12;
        char cCharAt3;
        int i13;
        char cCharAt4;
        int i14;
        char cCharAt5;
        int length = str.length();
        char[] andSet = TypeUtils.CHARS_UPDATER.getAndSet(TypeUtils.CACHE, null);
        if (andSet == null) {
            andSet = new char[128];
        }
        int i15 = i9;
        int i16 = 0;
        while (i15 < length) {
            try {
                char cCharAt6 = str.charAt(i15);
                if (i15 == i9) {
                    if (cCharAt6 >= 'a' && cCharAt6 <= 'z' && (i14 = i15 + 1) < length && (cCharAt5 = str.charAt(i14)) >= 'a' && cCharAt5 <= 'z') {
                        cCharAt6 = (char) (cCharAt6 - ' ');
                    } else if (cCharAt6 == '_' && (i13 = i15 + 1) < length && (cCharAt4 = str.charAt(i13)) >= 'a' && cCharAt4 <= 'z') {
                        andSet[i16] = cCharAt6;
                        cCharAt6 = (char) (cCharAt4 - ' ');
                        i16++;
                        i15 = i13;
                    }
                } else if (cCharAt6 < 'A' || cCharAt6 > 'Z' || (i12 = i15 + 1) >= length || ((cCharAt3 = str.charAt(i12)) >= 'A' && cCharAt3 <= 'Z')) {
                    if (cCharAt6 >= 'A' && cCharAt6 <= 'Z' && i15 > i9 && (i10 = i15 + 1) < length && (cCharAt = str.charAt(i10)) >= 'A' && cCharAt <= 'Z' && (cCharAt2 = str.charAt(i15 - 1)) >= 'a' && cCharAt2 <= 'z') {
                        i11 = i16 + 1;
                        andSet[i16] = c10;
                        i16 = i11;
                    }
                } else if (i15 > i9) {
                    i11 = i16 + 1;
                    andSet[i16] = c10;
                    i16 = i11;
                }
                andSet[i16] = cCharAt6;
                i15++;
                i16++;
            } catch (Throwable th2) {
                TypeUtils.CHARS_UPDATER.set(TypeUtils.CACHE, andSet);
                throw th2;
            }
        }
        String str2 = new String(andSet, 0, i16);
        TypeUtils.CHARS_UPDATER.set(TypeUtils.CACHE, andSet);
        return str2;
    }

    public static <A extends Annotation> A findAnnotation(AnnotatedElement annotatedElement, Class<A> cls) {
        if (cls != null) {
            return (A) annotatedElement.getAnnotation(cls);
        }
        C0353j.m1305c("annotationType must not be null");
        return null;
    }

    public static Method getMethod(Class cls, String str) {
        ConcurrentMap<Class, Method[]> concurrentMap = methodCache;
        Method[] methods = concurrentMap.get(cls);
        if (methods == null) {
            methods = cls.getMethods();
            concurrentMap.put(cls, methods);
        }
        for (Method method : methods) {
            if (method.getName().equals(str)) {
                return method;
            }
        }
        return null;
    }

    public static Field getField(Class cls, String str) {
        ConcurrentMap<Class, Field[]> concurrentMap = fieldCache;
        Field[] fields = concurrentMap.get(cls);
        if (fields == null) {
            fields = cls.getFields();
            concurrentMap.put(cls, fields);
        }
        for (Field field : fields) {
            if (field.getName().equals(str)) {
                return field;
            }
        }
        return null;
    }

    public static void cleanupCache(Class cls) {
        if (cls == null) {
            return;
        }
        fieldCache.remove(cls);
        fieldMapCache.remove(cls);
        declaredFieldCache.remove(cls);
        methodCache.remove(cls);
        constructorCache.remove(cls);
    }

    public static String setterName(String str, int i9) {
        char c10;
        int length = str.length();
        int i10 = length - i9;
        char[] cArr = new char[i10];
        str.getChars(i9, length, cArr, 0);
        char c11 = cArr[0];
        boolean z9 = i10 > 1 && (c10 = cArr[1]) >= 'A' && c10 <= 'Z';
        if (c11 >= 'A' && c11 <= 'Z' && !z9) {
            cArr[0] = (char) (c11 + ' ');
        }
        return new String(cArr);
    }

    public static Type resolve(Type type, Class<?> cls, Type type2) {
        return resolve(type, cls, type2, new HashMap());
    }

    public static void setters(Class cls, Consumer<Method> consumer) {
        setters(cls, null, null, consumer);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void setters(Class cls, boolean z9, Consumer<Method> consumer) {
        ConcurrentMap<Class, Method[]> concurrentMap = methodCache;
        Method[] methods = concurrentMap.get(cls);
        if (methods == null) {
            methods = cls.getMethods();
            concurrentMap.put(cls, methods);
        }
        for (Method method : methods) {
            int parameterCount = method.getParameterCount();
            if (parameterCount == 0) {
                String name = method.getName();
                if (!z9 || (name.length() > 3 && name.startsWith("get", 0))) {
                    Class<?> returnType = method.getReturnType();
                    if (returnType == AtomicInteger.class || returnType == AtomicLong.class || returnType == AtomicBoolean.class || returnType == AtomicIntegerArray.class || returnType == AtomicLongArray.class || Collection.class.isAssignableFrom(returnType)) {
                        consumer.accept(method);
                    } else if (parameterCount == 1 && !Modifier.isStatic(method.getModifiers())) {
                        String name2 = method.getName();
                        int length = name2.length();
                        if (!z9 || (length > 3 && name2.startsWith("set", 0))) {
                            consumer.accept(method);
                        }
                    }
                }
            }
        }
    }

    public static String getterName(Method method, boolean z9, String str) {
        int iIndexOf;
        Class<?> returnType;
        String name = method.getName();
        if (name.startsWith("is") && (((returnType = method.getReturnType()) != Boolean.class && returnType != Boolean.TYPE) || z9)) {
            return name;
        }
        String strSubstring = getterName(name, str);
        if (z9 && (iIndexOf = strSubstring.indexOf(45)) != -1) {
            strSubstring = strSubstring.substring(0, iIndexOf);
        }
        if (strSubstring.length() > 2 && strSubstring.charAt(0) >= 'A' && strSubstring.charAt(0) <= 'Z' && strSubstring.charAt(1) >= 'A' && strSubstring.charAt(1) <= 'Z') {
            char[] charArray = strSubstring.toCharArray();
            charArray[0] = (char) (charArray[0] + ' ');
            Field declaredField = getDeclaredField(method.getDeclaringClass(), new String(charArray));
            if (declaredField != null && Modifier.isPublic(declaredField.getModifiers())) {
                return declaredField.getName();
            }
        }
        return strSubstring;
    }

    public static void getters(Class cls, Class cls2, Consumer<Method> consumer) {
        getters(cls, cls2, false, consumer);
    }

    public static void getters(Class cls, Consumer<Method> consumer) {
        getters(cls, null, consumer);
    }
}
