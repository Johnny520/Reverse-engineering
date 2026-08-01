package com.alibaba.fastjson2.util;

import bsh.C1189h4;
import bsh.C1259t2;
import com.alibaba.fastjson2.C1569c;
import com.alibaba.fastjson2.C1605j;
import com.alibaba.fastjson2.JSONB;
import com.alibaba.fastjson2.JSONFactory;
import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.TypeReference;
import com.alibaba.fastjson2.annotation.JSONType;
import com.alibaba.fastjson2.codec.BeanInfo;
import com.alibaba.fastjson2.codec.FieldInfo;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.alibaba.fastjson2.reader.ObjectReader;
import com.alibaba.fastjson2.writer.ObjectWriter;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.annotation.Inherited;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class BeanUtils {
    private static volatile Class RECORD_CLASS = null;
    private static volatile Method RECORD_COMPONENT_GET_NAME = null;
    private static volatile Method RECORD_GET_RECORD_COMPONENTS = null;
    public static final String SUPER = "$super$";
    static final Type[] EMPTY_TYPE_ARRAY = new Type[0];
    static final ConcurrentMap<Class, Field[]> fieldCache = new ConcurrentHashMap();
    static final ConcurrentMap<Class, Map<String, Field>> fieldMapCache = new ConcurrentHashMap();
    static final ConcurrentMap<Class, Field[]> declaredFieldCache = new ConcurrentHashMap();
    static final ConcurrentMap<Class, Method[]> methodCache = new ConcurrentHashMap();
    static final ConcurrentMap<Class, Constructor[]> constructorCache = new ConcurrentHashMap();
    static final long[] IGNORE_CLASS_HASH_CODES = {-9214723784238596577L, -9030616758866828325L, -8335274122997354104L, -6963030519018899258L, -4863137578837233966L, -3653547262287832698L, -2819277587813726773L, -2669552864532011468L, -2458634727370886912L, -2291619803571459675L, -1811306045128064037L, -864440709753525476L, -779604756358333743L, 8731803887940231L, 1616814008855344660L, 2164749833121980361L, 2688642392827789427L, 3724195282986200606L, 3742915795806478647L, 3977020351318456359L, 4775491097662790952L, 4882459834864833642L, 6033839080488254886L, 7981148566008458638L, 8344106065386396833L, 9215465129261900012L};

    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class GenericArrayTypeImpl implements GenericArrayType, Serializable {
        private static final long serialVersionUID = 0;
        private final Type componentType;

        public GenericArrayTypeImpl(Type type) {
            this.componentType = BeanUtils.canonicalize(type);
        }

        public boolean equals(Object obj) {
            return (obj instanceof GenericArrayType) && BeanUtils.equals(this, (GenericArrayType) obj);
        }

        @Override // java.lang.reflect.GenericArrayType
        public Type getGenericComponentType() {
            return this.componentType;
        }

        public int hashCode() {
            return this.componentType.hashCode();
        }

        public String toString() {
            return BeanUtils.typeToString(this.componentType) + _UrlKt.PATH_SEGMENT_ENCODE_SET_URI;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class ParameterizedTypeImpl implements ParameterizedType, Serializable {
        private static final long serialVersionUID = 0;
        private final Type ownerType;
        private final Type rawType;
        private final Type[] typeArguments;

        public ParameterizedTypeImpl(Type type, Type type2, Type... typeArr) {
            if (type2 instanceof Class) {
                Class cls = (Class) type2;
                boolean z10 = true;
                boolean z11 = Modifier.isStatic(cls.getModifiers()) || cls.getEnclosingClass() == null;
                if (type == null && !z11) {
                    z10 = false;
                }
                BeanUtils.checkArgument(z10);
            }
            this.ownerType = type == null ? null : BeanUtils.canonicalize(type);
            this.rawType = BeanUtils.canonicalize(type2);
            Type[] typeArr2 = (Type[]) typeArr.clone();
            this.typeArguments = typeArr2;
            int length = typeArr2.length;
            for (int i10 = 0; i10 < length; i10++) {
                BeanUtils.checkNotPrimitive(this.typeArguments[i10]);
                Type[] typeArr3 = this.typeArguments;
                typeArr3[i10] = BeanUtils.canonicalize(typeArr3[i10]);
            }
        }

        public boolean equals(Object obj) {
            return (obj instanceof ParameterizedType) && BeanUtils.equals(this, (ParameterizedType) obj);
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type[] getActualTypeArguments() {
            return (Type[]) this.typeArguments.clone();
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getOwnerType() {
            return this.ownerType;
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getRawType() {
            return this.rawType;
        }

        public int hashCode() {
            return (Arrays.hashCode(this.typeArguments) ^ this.rawType.hashCode()) ^ BeanUtils.hashCodeOrZero(this.ownerType);
        }

        public String toString() {
            int length = this.typeArguments.length;
            if (length == 0) {
                return BeanUtils.typeToString(this.rawType);
            }
            StringBuilder sb2 = new StringBuilder((length + 1) * 30);
            sb2.append(BeanUtils.typeToString(this.rawType));
            sb2.append("<");
            sb2.append(BeanUtils.typeToString(this.typeArguments[0]));
            for (int i10 = 1; i10 < length; i10++) {
                sb2.append(", ");
                sb2.append(BeanUtils.typeToString(this.typeArguments[i10]));
            }
            sb2.append(">");
            return sb2.toString();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class WildcardTypeImpl implements WildcardType, Serializable {
        private static final long serialVersionUID = 0;
        private final Type lowerBound;
        private final Type upperBound;

        public WildcardTypeImpl(Type[] typeArr, Type[] typeArr2) {
            BeanUtils.checkArgument(typeArr2.length <= 1);
            BeanUtils.checkArgument(typeArr.length == 1);
            if (typeArr2.length != 1) {
                BeanUtils.checkNotPrimitive(typeArr[0]);
                this.lowerBound = null;
                this.upperBound = BeanUtils.canonicalize(typeArr[0]);
            } else {
                BeanUtils.checkNotPrimitive(typeArr2[0]);
                BeanUtils.checkArgument(typeArr[0] == Object.class);
                this.lowerBound = BeanUtils.canonicalize(typeArr2[0]);
                this.upperBound = Object.class;
            }
        }

        public boolean equals(Object obj) {
            return (obj instanceof WildcardType) && BeanUtils.equals(this, (WildcardType) obj);
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getLowerBounds() {
            Type type = this.lowerBound;
            return type != null ? new Type[]{type} : BeanUtils.EMPTY_TYPE_ARRAY;
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getUpperBounds() {
            return new Type[]{this.upperBound};
        }

        public int hashCode() {
            Type type = this.lowerBound;
            return (type != null ? type.hashCode() + 31 : 1) ^ (this.upperBound.hashCode() + 31);
        }

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

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m6475a(Class cls, List list, Field field) {
        int modifiers = field.getModifiers();
        if (Modifier.isStatic(modifiers) || Modifier.isTransient(modifiers) || field.getDeclaringClass().isAssignableFrom(cls) || "this$0".equals(field.getName())) {
            return;
        }
        list.add(field);
    }

    public static void annotationMethods(Class cls, Consumer<Method> consumer) {
        ConcurrentMap<Class, Method[]> concurrentMap = methodCache;
        Method[] methods = concurrentMap.get(cls);
        if (methods == null) {
            methods = getMethods(cls);
            concurrentMap.putIfAbsent(cls, methods);
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

    public static GenericArrayType arrayOf(Type type) {
        return new GenericArrayTypeImpl(type);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m6476b(String str, AtomicReference atomicReference, Method method, Method method2) {
        if (method2.getName().equals(str) && isJSONField(method2)) {
            atomicReference.set(method);
        }
    }

    public static Method buildMethod(Class cls, String str) {
        ConcurrentMap<Class, Method[]> concurrentMap = methodCache;
        Method[] methods = concurrentMap.get(cls);
        if (methods == null) {
            methods = getMethods(cls);
            concurrentMap.putIfAbsent(cls, methods);
        }
        for (Method method : methods) {
            if (!Modifier.isStatic(method.getModifiers()) && method.getParameterCount() == 0 && method.getName().equals(str)) {
                return method;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m6477c(Annotation annotation, String str, String[] strArr, int i10, Method method) {
        String name = method.getName();
        try {
            Object objInvoke = method.invoke(annotation, null);
            if ("value".equals(name)) {
                String str2 = (String) objInvoke;
                if (str2.length() == 0 || str2.equals(str)) {
                    return;
                }
                strArr[i10] = str2;
            }
        } catch (Exception unused) {
        }
    }

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

    public static void checkArgument(boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException();
        }
    }

    public static void checkNotPrimitive(Type type) {
        checkArgument(((type instanceof Class) && ((Class) type).isPrimitive()) ? false : true);
    }

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

    public static void constructor(Class cls, Consumer<Constructor> consumer) {
        ConcurrentMap<Class, Constructor[]> concurrentMap = constructorCache;
        Constructor<?>[] declaredConstructors = concurrentMap.get(cls);
        if (declaredConstructors == null) {
            declaredConstructors = cls.getDeclaredConstructors();
            concurrentMap.putIfAbsent(cls, declaredConstructors);
        }
        boolean zIsRecord = isRecord(cls);
        for (Constructor<?> constructor : declaredConstructors) {
            if (!zIsRecord || constructor.getParameterCount() != 0) {
                consumer.accept(constructor);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m6478d(String str, Method[] methodArr, Method method) {
        if (str.equals(method.getName())) {
            methodArr[0] = method;
        }
    }

    public static String dashes(String str, int i10, boolean z10) {
        int i11;
        int length = str.length();
        char[] andSet = TypeUtils.CHARS_UPDATER.getAndSet(TypeUtils.CACHE, null);
        if (andSet == null) {
            andSet = new char[128];
        }
        int i12 = i10;
        int i13 = 0;
        while (i12 < length) {
            try {
                char cCharAt = str.charAt(i12);
                if (z10) {
                    if (cCharAt < 'A' || cCharAt > 'Z') {
                        if (cCharAt >= 'a' && cCharAt <= 'z') {
                            i11 = cCharAt - ' ';
                            cCharAt = (char) i11;
                        }
                    } else if (i12 > i10) {
                        andSet[i13] = '-';
                        i13++;
                    }
                } else if (cCharAt >= 'A' && cCharAt <= 'Z') {
                    if (i12 > i10) {
                        andSet[i13] = '-';
                        i13++;
                    }
                    i11 = cCharAt + ' ';
                    cCharAt = (char) i11;
                }
                andSet[i13] = cCharAt;
                i12++;
                i13++;
            } catch (Throwable th) {
                TypeUtils.CHARS_UPDATER.set(TypeUtils.CACHE, andSet);
                throw th;
            }
        }
        String str2 = new String(andSet, 0, i13);
        TypeUtils.CHARS_UPDATER.set(TypeUtils.CACHE, andSet);
        return str2;
    }

    public static void declaredFields(Class cls, Consumer<Field> consumer) {
        boolean zEquals;
        if (cls == null || consumer == null || ignore(cls) || cls.getName().contains("$$Lambda") || JdbcSupport.isStruct(cls)) {
            return;
        }
        if (TypeUtils.isProxy(cls)) {
            declaredFields(cls.getSuperclass(), consumer);
            return;
        }
        Class superclass = cls.getSuperclass();
        if (superclass == null || superclass == Object.class) {
            zEquals = false;
        } else {
            zEquals = "com.google.protobuf.GeneratedMessageV3".equals(superclass.getName());
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
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    break;
                }
                if (Modifier.isStatic(declaredFields[i10].getModifiers())) {
                    boolean zIsAssignableFrom = Enum.class.isAssignableFrom(cls);
                    ArrayList arrayList = new ArrayList(declaredFields.length);
                    for (Field field : declaredFields) {
                        if (zIsAssignableFrom || !Modifier.isStatic(field.getModifiers())) {
                            arrayList.add(field);
                        }
                    }
                    declaredFields = (Field[]) arrayList.toArray(new Field[arrayList.size()]);
                } else {
                    i10++;
                }
            }
            fieldCache.putIfAbsent(cls, declaredFields);
        }
        for (Field field2 : declaredFields) {
            int modifiers = field2.getModifiers();
            Class<?> type = field2.getType();
            if ((modifiers & 8) == 0 && !ignore(type)) {
                if (zEquals && "cardsmap_".equals(field2.getName()) && "com.google.protobuf.MapField".equals(type.getName())) {
                    return;
                }
                Class<?> declaringClass = field2.getDeclaringClass();
                if (declaringClass != AbstractMap.class && declaringClass != HashMap.class && declaringClass != LinkedHashMap.class && declaringClass != TreeMap.class && declaringClass != ConcurrentHashMap.class) {
                    consumer.accept(field2);
                }
            }
        }
    }

    private static Class<?> declaringClassOf(TypeVariable<?> typeVariable) {
        GenericDeclaration genericDeclaration = typeVariable.getGenericDeclaration();
        if (genericDeclaration instanceof Class) {
            return (Class) genericDeclaration;
        }
        return null;
    }

    public static String dots(String str, int i10, boolean z10) {
        int i11;
        int length = str.length();
        char[] andSet = TypeUtils.CHARS_UPDATER.getAndSet(TypeUtils.CACHE, null);
        if (andSet == null) {
            andSet = new char[128];
        }
        int i12 = i10;
        int i13 = 0;
        while (i12 < length) {
            try {
                char cCharAt = str.charAt(i12);
                if (z10) {
                    if (cCharAt < 'A' || cCharAt > 'Z') {
                        if (cCharAt >= 'a' && cCharAt <= 'z') {
                            i11 = cCharAt - ' ';
                            cCharAt = (char) i11;
                        }
                    } else if (i12 > i10) {
                        andSet[i13] = '.';
                        i13++;
                    }
                } else if (cCharAt >= 'A' && cCharAt <= 'Z') {
                    if (i12 > i10) {
                        andSet[i13] = '.';
                        i13++;
                    }
                    i11 = cCharAt + ' ';
                    cCharAt = (char) i11;
                }
                andSet[i13] = cCharAt;
                i12++;
                i13++;
            } catch (Throwable th) {
                TypeUtils.CHARS_UPDATER.set(TypeUtils.CACHE, andSet);
                throw th;
            }
        }
        String str2 = new String(andSet, 0, i13);
        TypeUtils.CHARS_UPDATER.set(TypeUtils.CACHE, andSet);
        return str2;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m6479e(String str, Field[] fieldArr, Field field) {
        if (field.getName().equals(str)) {
            fieldArr[0] = field;
        }
    }

    public static boolean equal(Object obj, Object obj2) {
        return Objects.equals(obj, obj2);
    }

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

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m6480f(Annotation annotation, String[] strArr, Method method) {
        String name = method.getName();
        try {
            Object objInvoke = method.invoke(annotation, null);
            int iHashCode = name.hashCode();
            if (iHashCode == -1097462182) {
                if (name.equals("locale")) {
                    strArr[2] = (String) objInvoke;
                }
            } else if (iHashCode == -791090288) {
                if (name.equals("pattern")) {
                    strArr[0] = (String) objInvoke;
                }
            } else if (iHashCode == 109399969 && name.equals("shape")) {
                strArr[1] = ((Enum) objInvoke).name();
            }
        } catch (Throwable unused) {
        }
    }

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
            case Opcodes.FCONST_0 /* 11 */:
                return upperCamelWith(str, 0, ' ');
            case Opcodes.FCONST_1 /* 12 */:
                StringBuilder sb2 = new StringBuilder();
                for (int i10 = 0; i10 < str.length(); i10++) {
                    char cCharAt6 = str.charAt(i10);
                    if (cCharAt6 >= 'A' && cCharAt6 <= 'Z') {
                        cCharAt6 = (char) (cCharAt6 + ' ');
                        if (i10 > 0) {
                            sb2.append('-');
                        }
                    }
                    sb2.append(cCharAt6);
                }
                return sb2.toString();
            case Opcodes.FCONST_2 /* 13 */:
                return str.toLowerCase();
            case Opcodes.DCONST_0 /* 14 */:
                return dashes(str, 0, false);
            case 16:
                char cCharAt7 = str.charAt(0);
                if (cCharAt7 >= 'A' && cCharAt7 <= 'Z' && str.length() > 1) {
                    char[] charArray4 = str.toCharArray();
                    charArray4[0] = (char) (cCharAt7 + ' ');
                    return new String(charArray4);
                }
                return str;
            case Opcodes.SIPUSH /* 17 */:
                return underScores(str, 0, true);
            case Opcodes.LDC /* 18 */:
                return snakeCase(str, 0);
            default:
                C1569c.m6258a("TODO : ".concat(str2));
                return null;
        }
    }

    public static void fields(Class cls, Consumer<Field> consumer) {
        if (TypeUtils.isProxy(cls)) {
            fields(cls.getSuperclass(), consumer);
            return;
        }
        ConcurrentMap<Class, Field[]> concurrentMap = fieldCache;
        Field[] fields = concurrentMap.get(cls);
        if (fields == null) {
            fields = cls.getFields();
            concurrentMap.putIfAbsent(cls, fields);
        }
        boolean zIsAssignableFrom = Enum.class.isAssignableFrom(cls);
        for (Field field : fields) {
            if ((!Modifier.isStatic(field.getModifiers()) || zIsAssignableFrom) && !ignore(field.getType())) {
                consumer.accept(field);
            }
        }
    }

    private static <A extends Annotation> A findAnnotation(AnnotatedElement annotatedElement, Class<A> cls, boolean z10, Set<Annotation> set) {
        Class superclass;
        A a10;
        A a11;
        if (annotatedElement == null || cls == null) {
            return null;
        }
        A a12 = (A) annotatedElement.getDeclaredAnnotation(cls);
        if (a12 != null) {
            return a12;
        }
        A a13 = (A) findMetaAnnotation(cls, annotatedElement.getDeclaredAnnotations(), z10, set);
        if (a13 != null) {
            return a13;
        }
        if (annotatedElement instanceof Class) {
            Class cls2 = (Class) annotatedElement;
            for (Class<?> cls3 : cls2.getInterfaces()) {
                if (cls3 != Annotation.class && (a11 = (A) findAnnotation(cls3, cls, z10, set)) != null) {
                    return a11;
                }
            }
            if (z10 && (superclass = cls2.getSuperclass()) != null && superclass != Object.class && (a10 = (A) findAnnotation(superclass, cls, true, set)) != null) {
                return a10;
            }
        }
        return (A) findMetaAnnotation(cls, getAnnotations(annotatedElement), z10, set);
    }

    private static <A extends Annotation> A findMetaAnnotation(Class<A> cls, Annotation[] annotationArr, boolean z10, Set<Annotation> set) {
        A a10;
        for (Annotation annotation : annotationArr) {
            Class<? extends Annotation> clsAnnotationType = annotation.annotationType();
            String name = clsAnnotationType.getName();
            if (!name.startsWith("java.lang.annotation") && !name.startsWith("kotlin.") && set.add(annotation) && (a10 = (A) findAnnotation(clsAnnotationType, cls, z10, set)) != null) {
                return a10;
            }
        }
        return null;
    }

    public static Method fluentSetter(Class cls, String str, Class cls2) {
        ConcurrentMap<Class, Method[]> concurrentMap = methodCache;
        Method[] methods = concurrentMap.get(cls);
        if (methods == null) {
            methods = getMethods(cls);
            concurrentMap.putIfAbsent(cls, methods);
        }
        for (Method method : methods) {
            if (method.getName().equals(str) && method.getReturnType() == cls && method.getParameterCount() == 1 && method.getParameterTypes()[0] == cls2) {
                return method;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m6481g(Annotation annotation, FieldInfo fieldInfo, Method method) {
        String name = method.getName();
        try {
            Object objInvoke = method.invoke(annotation, null);
            int iHashCode = name.hashCode();
            if (iHashCode == -1408024454) {
                if (name.equals("alternate")) {
                    String[] strArr = (String[]) objInvoke;
                    if (strArr.length != 0) {
                        fieldInfo.alternateNames = strArr;
                        return;
                    }
                    return;
                }
                return;
            }
            if (iHashCode == 111972721 && name.equals("value")) {
                String str = (String) objInvoke;
                if (str.isEmpty()) {
                    return;
                }
                fieldInfo.fieldName = str;
            }
        } catch (Throwable unused) {
        }
    }

    public static Annotation[] getAnnotations(AnnotatedElement annotatedElement) {
        try {
            return annotatedElement.getDeclaredAnnotations();
        } catch (Throwable unused) {
            return new Annotation[0];
        }
    }

    public static Constructor[] getConstructor(Class cls) {
        ConcurrentMap<Class, Constructor[]> concurrentMap = constructorCache;
        Constructor[] constructorArr = concurrentMap.get(cls);
        if (constructorArr != null) {
            return constructorArr;
        }
        Constructor<?>[] declaredConstructors = cls.getDeclaredConstructors();
        concurrentMap.putIfAbsent(cls, declaredConstructors);
        return declaredConstructors;
    }

    public static Field getDeclaredField(Class cls, String str) {
        ConcurrentMap<Class, Map<String, Field>> concurrentMap = fieldMapCache;
        Map<String, Field> map = concurrentMap.get(cls);
        if (map == null) {
            final HashMap map2 = new HashMap();
            declaredFields(cls, new Consumer() { // from class: com.alibaba.fastjson2.util.j
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    Field field = (Field) obj;
                    map2.put(field.getName(), field);
                }
            });
            concurrentMap.putIfAbsent(cls, map2);
            map = concurrentMap.get(cls);
        }
        return map.get(str);
    }

    public static Constructor getDefaultConstructor(Class cls, boolean z10) {
        Class<?> declaringClass;
        if ((cls == StackTraceElement.class && JDKUtils.JVM_VERSION >= 9) || isRecord(cls)) {
            return null;
        }
        ConcurrentMap<Class, Constructor[]> concurrentMap = constructorCache;
        Constructor[] declaredConstructors = concurrentMap.get(cls);
        if (declaredConstructors == null) {
            declaredConstructors = cls.getDeclaredConstructors();
            concurrentMap.putIfAbsent(cls, declaredConstructors);
        }
        for (Constructor<?> constructor : declaredConstructors) {
            if (constructor.getParameterCount() == 0) {
                return constructor;
            }
        }
        if (z10 && (declaringClass = cls.getDeclaringClass()) != null) {
            for (Constructor<?> constructor2 : declaredConstructors) {
                if (constructor2.getParameterCount() == 1 && declaringClass.equals(constructor2.getParameterTypes()[0])) {
                    return constructor2;
                }
            }
        }
        return null;
    }

    public static String[] getEnumAnnotationNames(Class cls) {
        final Enum[] enumArr = (Enum[]) cls.getEnumConstants();
        int length = enumArr.length;
        final String[] strArr = new String[length];
        fields(cls, new Consumer() { // from class: com.alibaba.fastjson2.util.d
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                BeanUtils.m6491q(enumArr, strArr, (Field) obj);
            }
        });
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

    /* JADX WARN: Removed duplicated region for block: B:34:0x0070 A[PHI: r7
  0x0070: PHI (r7v8 java.lang.reflect.Member) = (r7v9 java.lang.reflect.Member), (r7v10 java.lang.reflect.Member), (r7v11 java.lang.reflect.Member) binds: [B:54:0x00cf, B:33:0x006e, B:40:0x0094] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.reflect.Member getEnumValueField(java.lang.Class r14, com.alibaba.fastjson2.modules.ObjectCodecProvider r15) {
        /*
            Method dump skipped, instruction units count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.util.BeanUtils.getEnumValueField(java.lang.Class, com.alibaba.fastjson2.modules.ObjectCodecProvider):java.lang.reflect.Member");
    }

    public static Field getField(Class cls, final Method method) {
        boolean z10;
        boolean z11;
        boolean z12;
        final String name = method.getName();
        final int length = name.length();
        Class<?> returnType = method.getReturnType();
        if (length > 2) {
            char cCharAt = name.charAt(0);
            char cCharAt2 = name.charAt(1);
            char cCharAt3 = name.charAt(2);
            if (cCharAt == 'i' && cCharAt2 == 's') {
                z10 = returnType == Boolean.class || returnType == Boolean.TYPE;
                z11 = false;
                z12 = z11;
            } else if (cCharAt == 'g' && cCharAt2 == 'e' && cCharAt3 == 't') {
                z11 = length > 3;
                z10 = false;
                z12 = false;
            } else {
                if (cCharAt == 's' && cCharAt2 == 'e' && cCharAt3 == 't') {
                    z12 = length > 3 && method.getParameterCount() == 1;
                    z10 = false;
                    z11 = false;
                }
                z10 = false;
                z11 = false;
                z12 = z11;
            }
        } else {
            z10 = false;
            z11 = false;
            z12 = z11;
        }
        final Field[] fieldArr = new Field[2];
        if (z10 || z11 || z12) {
            final Class<?> cls2 = (z10 || z11) ? returnType : method.getParameterTypes()[0];
            final int i10 = z10 ? 2 : 3;
            char[] cArr = new char[length - i10];
            name.getChars(i10, length, cArr, 0);
            final char c10 = cArr[0];
            declaredFields(cls, new Consumer() { // from class: com.alibaba.fastjson2.util.l
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    BeanUtils.m6495u(method, length, i10, cls2, c10, name, fieldArr, (Field) obj);
                }
            });
        }
        Field field = fieldArr[0];
        if (field == null) {
            field = fieldArr[1];
        }
        if (Throwable.class.isAssignableFrom(cls)) {
            if (returnType == String.class && ((field == null && "getMessage".equals(name)) || (field == null && "getLocalizedMessage".equals(name)))) {
                return getDeclaredField(cls, "detailMessage");
            }
            if (returnType == Throwable[].class && "getSuppressed".equals(name)) {
                return getDeclaredField(cls, "suppressedExceptions");
            }
        }
        return field;
    }

    public static Type getFieldType(TypeReference typeReference, Class<?> cls, Member member, Type type) {
        Class<?> declaringClass = member == null ? null : member.getDeclaringClass();
        while (cls != Object.class) {
            Type type2 = typeReference == null ? null : typeReference.getType();
            if (declaringClass == cls) {
                return resolve(type2, declaringClass, type);
            }
            Type genericSuperclass = cls.getGenericSuperclass();
            if (genericSuperclass == null) {
                break;
            }
            typeReference = TypeReference.get(resolve(type2, cls, genericSuperclass));
            cls = typeReference.getRawType();
        }
        return null;
    }

    public static Type getGenericSupertype(Type type, Class<?> cls, Class<?> cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i10 = 0; i10 < length; i10++) {
                Class<?> cls3 = interfaces[i10];
                if (cls3 == cls2) {
                    return cls.getGenericInterfaces()[i10];
                }
                if (cls2.isAssignableFrom(cls3)) {
                    return getGenericSupertype(cls.getGenericInterfaces()[i10], interfaces[i10], cls2);
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

    public static Method getMethod(Class cls, Method method) {
        if (cls != null && cls != Object.class && cls != Serializable.class) {
            ConcurrentMap<Class, Method[]> concurrentMap = methodCache;
            Method[] methods = concurrentMap.get(cls);
            if (methods == null) {
                methods = getMethods(cls);
                concurrentMap.putIfAbsent(cls, methods);
            }
            for (Method method2 : methods) {
                if (method2.getName().equals(method.getName()) && method2.getParameterCount() == method.getParameterCount()) {
                    Class<?>[] parameterTypes = method2.getParameterTypes();
                    Class<?>[] parameterTypes2 = method.getParameterTypes();
                    for (int i10 = 0; i10 < parameterTypes.length; i10++) {
                        if (!parameterTypes[i10].equals(parameterTypes2[i10])) {
                            break;
                        }
                    }
                    return method2;
                }
            }
        }
        return null;
    }

    private static Method[] getMethods(Class cls) {
        try {
            return isRecord(cls) ? getRecordMethods(cls) : cls.getMethods();
        } catch (NoClassDefFoundError unused) {
            return new Method[0];
        }
    }

    public static Type getParamType(TypeReference typeReference, Class<?> cls, Class cls2, Parameter parameter, Type type) {
        while (cls != Object.class) {
            if (cls2 == cls) {
                return resolve(typeReference.getType(), cls2, type);
            }
            typeReference = TypeReference.get(resolve(typeReference.getType(), cls, cls.getGenericSuperclass()));
            cls = typeReference.getRawType();
        }
        return null;
    }

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
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + (type == null ? "null" : type.getClass().getName()));
    }

    public static String[] getRecordFieldNames(Class<?> cls) {
        if (JDKUtils.JVM_VERSION < 14 && JDKUtils.ANDROID_SDK_INT < 33) {
            return new String[0];
        }
        try {
            if (RECORD_GET_RECORD_COMPONENTS == null) {
                RECORD_GET_RECORD_COMPONENTS = Class.class.getMethod("getRecordComponents", null);
            }
            if (RECORD_COMPONENT_GET_NAME == null) {
                RECORD_COMPONENT_GET_NAME = Class.forName("java.lang.reflect.RecordComponent").getMethod("getName", null);
            }
            Object[] objArr = (Object[]) RECORD_GET_RECORD_COMPONENTS.invoke(cls, null);
            String[] strArr = new String[objArr.length];
            for (int i10 = 0; i10 < objArr.length; i10++) {
                strArr[i10] = (String) RECORD_COMPONENT_GET_NAME.invoke(objArr[i10], null);
            }
            return strArr;
        } catch (Exception e10) {
            throw new RuntimeException(String.format("Failed to access Methods needed to support `java.lang.Record`: (%s) %s", e10.getClass().getName(), e10.getMessage()), e10);
        }
    }

    private static Method[] getRecordMethods(Class<?> cls) {
        if (JDKUtils.JVM_VERSION < 14 && JDKUtils.ANDROID_SDK_INT < 33) {
            return new Method[0];
        }
        try {
            if (RECORD_GET_RECORD_COMPONENTS == null) {
                RECORD_GET_RECORD_COMPONENTS = Class.class.getMethod("getRecordComponents", null);
            }
            if (RECORD_COMPONENT_GET_NAME == null) {
                RECORD_COMPONENT_GET_NAME = Class.forName("java.lang.reflect.RecordComponent").getMethod("getName", null);
            }
            Object[] objArr = (Object[]) RECORD_GET_RECORD_COMPONENTS.invoke(cls, null);
            Method[] methods = cls.getMethods();
            int length = objArr.length;
            String[] strArr = new String[length];
            for (int i10 = 0; i10 < objArr.length; i10++) {
                strArr[i10] = (String) RECORD_COMPONENT_GET_NAME.invoke(objArr[i10], null);
            }
            int length2 = objArr.length;
            Method[] methodArr = new Method[length2];
            boolean[] zArr = new boolean[methods.length];
            for (int i11 = 0; i11 < methods.length; i11++) {
                Method method = methods[i11];
                if (method.getParameterCount() == 0) {
                    String name = method.getName();
                    int i12 = 0;
                    while (true) {
                        if (i12 >= length) {
                            break;
                        }
                        if (!strArr[i12].equals(name)) {
                            i12++;
                        } else if (methodArr[i12] == null) {
                            methodArr[i12] = method;
                            zArr[i11] = true;
                        }
                    }
                }
            }
            Method[] methodArr2 = new Method[methods.length];
            int i13 = 0;
            for (int i14 = 0; i14 < length2; i14++) {
                Method method2 = methodArr[i14];
                if (method2 != null) {
                    methodArr2[i13] = method2;
                    i13++;
                }
            }
            for (int i15 = 0; i15 < methods.length; i15++) {
                if (!zArr[i15]) {
                    int i16 = i13 + 1;
                    methodArr2[i13] = methods[i15];
                    i13 = i16;
                }
            }
            return methodArr2;
        } catch (Exception e10) {
            throw new RuntimeException(String.format("Failed to access Methods needed to support `java.lang.Record`: (%s) %s", e10.getClass().getName(), e10.getMessage()), e10);
        }
    }

    public static Method getSetter(Class cls, final String str) {
        final Method[] methodArr = new Method[1];
        setters(cls, new Consumer() { // from class: com.alibaba.fastjson2.util.n
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                BeanUtils.m6478d(str, methodArr, (Method) obj);
            }
        });
        return methodArr[0];
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static String getterName(String str, String str2) {
        char c10;
        if (str2 == null) {
            str2 = "CamelCase";
        }
        int length = str.length();
        boolean zStartsWith = str.startsWith("is");
        boolean zStartsWith2 = str.startsWith("get");
        int i10 = 3;
        int i11 = zStartsWith ? 2 : zStartsWith2 ? 3 : 0;
        if (length == i11) {
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
            case 572594479:
                if (str2.equals("UpperCamelCaseWithUnderScores")) {
                    b10 = 4;
                }
                break;
            case 601822360:
                if (str2.equals("UpperCaseWithDashes")) {
                    b10 = 5;
                }
                break;
            case 928600554:
                if (str2.equals("UpperCamelCaseWithDashes")) {
                    b10 = 6;
                }
                break;
            case 975280372:
                if (str2.equals("UpperCamelCaseWithDots")) {
                    b10 = 7;
                }
                break;
            case 1315531521:
                if (str2.equals("LowerCaseWithDots")) {
                    b10 = 8;
                }
                break;
            case 1336502620:
                if (str2.equals("PascalCase")) {
                    b10 = 9;
                }
                break;
            case 1371349591:
                if (str2.equals("UpperCamelCaseWithSpaces")) {
                    b10 = 10;
                }
                break;
            case 1460726553:
                if (str2.equals("KebabCase")) {
                    b10 = 11;
                }
                break;
            case 1488507313:
                if (str2.equals("LowerCase")) {
                    b10 = 12;
                }
                break;
            case 1492440247:
                if (str2.equals("LowerCaseWithDashes")) {
                    b10 = 13;
                }
                break;
            case 1655544038:
                if (str2.equals("CamelCase")) {
                    b10 = 14;
                }
                break;
            case 1839922637:
                if (str2.equals("CamelCase1x")) {
                    b10 = 15;
                }
                break;
            case 1976554305:
                if (str2.equals("UpperCaseWithUnderScores")) {
                    b10 = JSONB.Constants.BC_INT32_NUM_16;
                }
                break;
            case 2087942256:
                if (str2.equals("SnakeCase")) {
                    b10 = 17;
                }
                break;
        }
        switch (b10) {
            case 0:
                return str.substring(i11).toUpperCase();
            case 1:
                return dots(str, i11, true);
            case 2:
            case Opcodes.DCONST_0 /* 14 */:
                int i12 = length - i11;
                char[] cArr = new char[i12];
                str.getChars(i11, length, cArr, 0);
                char c11 = cArr[0];
                boolean z10 = i12 > 1 && (c10 = cArr[1]) >= 'A' && c10 <= 'Z';
                if (c11 >= 'A' && c11 <= 'Z' && !z10) {
                    cArr[0] = (char) (c11 + ' ');
                }
                return new String(cArr);
            case 3:
                return underScores(str, i11, false);
            case 4:
                return upperCamelWith(str, i11, '_');
            case 5:
                return dashes(str, i11, true);
            case 6:
                return upperCamelWith(str, i11, '-');
            case 7:
                return upperCamelWith(str, i11, '.');
            case 8:
                return dots(str, i11, false);
            case 9:
                return pascal(str, length, i11);
            case 10:
                return upperCamelWith(str, i11, ' ');
            case Opcodes.FCONST_0 /* 11 */:
                StringBuilder sb2 = new StringBuilder();
                if (zStartsWith) {
                    i10 = 2;
                } else if (!zStartsWith2) {
                    i10 = 0;
                }
                for (int i13 = i10; i13 < str.length(); i13++) {
                    char cCharAt = str.charAt(i13);
                    if (cCharAt >= 'A' && cCharAt <= 'Z') {
                        cCharAt = (char) (cCharAt + ' ');
                        if (i13 > i10) {
                            sb2.append('-');
                        }
                    }
                    sb2.append(cCharAt);
                }
                return sb2.toString();
            case Opcodes.FCONST_1 /* 12 */:
                return str.substring(i11).toLowerCase();
            case Opcodes.FCONST_2 /* 13 */:
                return dashes(str, i11, false);
            case 15:
                char[] cArr2 = new char[length - i11];
                str.getChars(i11, length, cArr2, 0);
                char c12 = cArr2[0];
                if (c12 >= 'A' && c12 <= 'Z') {
                    cArr2[0] = (char) (c12 + ' ');
                }
                return new String(cArr2);
            case 16:
                return underScores(str, i11, true);
            case Opcodes.SIPUSH /* 17 */:
                return snakeCase(str, i11);
            default:
                C1569c.m6258a("TODO : ".concat(str2));
                return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x025f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0270 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x02ee A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x012d  */
    /* JADX WARN: Type inference failed for: r19v0 */
    /* JADX WARN: Type inference failed for: r19v1 */
    /* JADX WARN: Type inference failed for: r19v10 */
    /* JADX WARN: Type inference failed for: r19v11 */
    /* JADX WARN: Type inference failed for: r19v2 */
    /* JADX WARN: Type inference failed for: r19v3 */
    /* JADX WARN: Type inference failed for: r19v4 */
    /* JADX WARN: Type inference failed for: r19v5 */
    /* JADX WARN: Type inference failed for: r19v6 */
    /* JADX WARN: Type inference failed for: r19v7 */
    /* JADX WARN: Type inference failed for: r19v8 */
    /* JADX WARN: Type inference failed for: r19v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void getters(java.lang.Class r30, java.lang.Class r31, boolean r32, java.util.function.Consumer<java.lang.reflect.Method> r33) {
        /*
            Method dump skipped, instruction units count: 846
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.util.BeanUtils.getters(java.lang.Class, java.lang.Class, boolean, java.util.function.Consumer):void");
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m6482h(Annotation annotation, BeanInfo beanInfo, int i10, Method method) {
        String name = method.getName();
        try {
            Object objInvoke = method.invoke(annotation, null);
            int iHashCode = name.hashCode();
            if (iHashCode == 3373707) {
                if (name.equals("name")) {
                    beanInfo.seeAlsoNames[i10] = (String) objInvoke;
                    return;
                }
                return;
            }
            if (iHashCode == 111972721 && name.equals("value")) {
                beanInfo.seeAlso[i10] = (Class) objInvoke;
            }
        } catch (Throwable unused) {
        }
    }

    public static boolean hasPublicDefaultConstructor(Class cls) {
        Constructor defaultConstructor = getDefaultConstructor(cls, false);
        return defaultConstructor != null && Modifier.isPublic(defaultConstructor.getModifiers());
    }

    public static int hashCodeOrZero(Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m6483i(Annotation annotation, BeanInfo beanInfo, Method method) {
        String name = method.getName();
        try {
            Object objInvoke = method.invoke(annotation, null);
            if ("value".equals(name)) {
                String str = (String) objInvoke;
                if (str.isEmpty()) {
                    return;
                }
                beanInfo.typeName = str;
            }
        } catch (Throwable unused) {
        }
    }

    public static boolean ignore(Class cls) {
        return cls == null || Arrays.binarySearch(IGNORE_CLASS_HASH_CODES, Fnv.hashCode64(cls.getName())) >= 0;
    }

    private static int indexOf(Object[] objArr, Object obj) {
        int length = objArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (obj.equals(objArr[i10])) {
                return i10;
            }
        }
        C1189h4.m4429a();
        return 0;
    }

    public static boolean isExtendedMap(Class cls) {
        if (cls == HashMap.class || cls == LinkedHashMap.class || cls == TreeMap.class || cls.getSimpleName().isEmpty()) {
            return false;
        }
        final Class superclass = cls.getSuperclass();
        if ((superclass != HashMap.class && superclass != LinkedHashMap.class && superclass != TreeMap.class) || getDefaultConstructor(cls, false) != null) {
            return false;
        }
        final ArrayList arrayList = new ArrayList();
        declaredFields(cls, new Consumer() { // from class: com.alibaba.fastjson2.util.c
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                BeanUtils.m6475a(superclass, arrayList, (Field) obj);
            }
        });
        return !arrayList.isEmpty();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean isJSONField(java.lang.reflect.AnnotatedElement r6) {
        /*
            java.lang.annotation.Annotation[] r6 = r6.getAnnotations()
            int r0 = r6.length
            r1 = 0
            r2 = r1
        L7:
            if (r2 >= r0) goto L50
            r3 = r6[r2]
            java.lang.Class r3 = r3.annotationType()
            java.lang.String r3 = r3.getName()
            java.lang.String r4 = "com.fasterxml.jackson.annotation.JsonValue"
            boolean r4 = r3.equals(r4)
            r5 = 1
            if (r4 != 0) goto L46
            java.lang.String r4 = "com.fasterxml.jackson.annotation.JsonProperty"
            boolean r4 = r3.equals(r4)
            if (r4 != 0) goto L46
            java.lang.String r4 = "com.alibaba.fastjson.annotation.JSONField"
            boolean r4 = r3.equals(r4)
            if (r4 != 0) goto L45
            java.lang.String r4 = "com.fasterxml.jackson.annotation.JsonRawValue"
            boolean r4 = r3.equals(r4)
            if (r4 != 0) goto L46
            java.lang.String r4 = "com.alibaba.fastjson2.annotation.JSONField"
            boolean r4 = r3.equals(r4)
            if (r4 != 0) goto L45
            java.lang.String r4 = "com.fasterxml.jackson.annotation.JsonUnwrapped"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L46
            goto L4d
        L45:
            return r5
        L46:
            boolean r3 = com.alibaba.fastjson2.JSONFactory.isUseJacksonAnnotation()
            if (r3 == 0) goto L4d
            return r5
        L4d:
            int r2 = r2 + 1
            goto L7
        L50:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.util.BeanUtils.isJSONField(java.lang.reflect.AnnotatedElement):boolean");
    }

    public static boolean isNoneStaticMemberClass(Class cls, Class cls2) {
        Class<?> enclosingClass;
        if (cls2 == null || cls2.isPrimitive() || cls2 == String.class || cls2 == List.class || (enclosingClass = cls2.getEnclosingClass()) == null) {
            return false;
        }
        if (cls != null && !cls.equals(enclosingClass)) {
            return false;
        }
        ConcurrentMap<Class, Constructor[]> concurrentMap = constructorCache;
        Constructor[] declaredConstructors = concurrentMap.get(cls2);
        if (declaredConstructors == null) {
            declaredConstructors = cls2.getDeclaredConstructors();
            concurrentMap.putIfAbsent(cls2, declaredConstructors);
        }
        if (declaredConstructors.length == 0) {
            return false;
        }
        Constructor<?> constructor = declaredConstructors[0];
        if (constructor.getParameterCount() == 0) {
            return false;
        }
        return enclosingClass.equals(constructor.getParameterTypes()[0]);
    }

    public static boolean isRecord(Class cls) {
        Class superclass = cls.getSuperclass();
        if (superclass == null) {
            return false;
        }
        if (RECORD_CLASS != null) {
            return superclass == RECORD_CLASS;
        }
        if (!"com.android.tools.r8.RecordTag".equals(superclass.getName())) {
            return false;
        }
        RECORD_CLASS = superclass;
        return true;
    }

    public static boolean isWriteEnumAsJavaBean(Class cls) {
        for (final Annotation annotation : getAnnotations(cls)) {
            JSONType jSONType = (JSONType) findAnnotation(annotation, JSONType.class);
            if (jSONType != null) {
                return jSONType.writeEnumAsJavaBean();
            }
            Class<? extends Annotation> clsAnnotationType = annotation.annotationType();
            String name = clsAnnotationType.getName();
            final BeanInfo beanInfo = new BeanInfo(JSONFactory.getDefaultObjectWriterProvider());
            if (name.equals("com.fasterxml.jackson.annotation.JsonFormat")) {
                if (JSONFactory.isUseJacksonAnnotation()) {
                    processJacksonJsonFormat(beanInfo, annotation);
                }
            } else if (name.equals("com.alibaba.fastjson.annotation.JSONType")) {
                annotationMethods(clsAnnotationType, new Consumer() { // from class: com.alibaba.fastjson2.util.a
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        BeanUtils.processJSONType1x(beanInfo, annotation, (Method) obj);
                    }
                });
            }
            if (beanInfo.writeEnumAsJavaBean) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m6484j(Annotation annotation, AtomicBoolean atomicBoolean, Method method) {
        try {
            if ("unwrapped".equals(method.getName()) && ((Boolean) method.invoke(annotation, null)).booleanValue()) {
                atomicBoolean.set(true);
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m6485k(String str, AtomicReference atomicReference, Method method, Method method2) {
        if (method2.getName().equals(str) && isJSONField(method2)) {
            atomicReference.set(method);
        }
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m6486l(Annotation annotation, FieldInfo fieldInfo, Method method) {
        String name = method.getName();
        try {
            Object objInvoke = method.invoke(annotation, null);
            if ("enabled".equals(name) && ((Boolean) objInvoke).booleanValue()) {
                fieldInfo.features = FieldInfo.UNWRAPPED_MASK;
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m6487m(Annotation annotation, BeanInfo beanInfo, Method method) {
        String name = method.getName();
        try {
            Object objInvoke = method.invoke(annotation, null);
            if ("value".equals(name)) {
                String strName = ((Enum) objInvoke).name();
                int iHashCode = strName.hashCode();
                if (iHashCode == -7755493) {
                    if (strName.equals("NON_EMPTY")) {
                        beanInfo.writerFeatures |= JSONWriter.Feature.NotWriteEmptyArray.mask;
                    }
                } else if (iHashCode == 10566287) {
                    if (strName.equals("NON_DEFAULT")) {
                        beanInfo.writerFeatures |= JSONWriter.Feature.NotWriteDefaultValue.mask;
                    }
                } else if (iHashCode == 1933739535 && strName.equals("ALWAYS")) {
                    beanInfo.writerFeatures |= JSONWriter.Feature.WriteNulls.mask;
                }
            }
        } catch (Throwable unused) {
        }
    }

    public static ParameterizedType newParameterizedTypeWithOwner(Type type, Type type2, Type... typeArr) {
        return new ParameterizedTypeImpl(type, type2, typeArr);
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m6489o(Annotation annotation, String str, String[] strArr, int i10, Method method) {
        String name = method.getName();
        try {
            Object objInvoke = method.invoke(annotation, null);
            if ("name".equals(name)) {
                String str2 = (String) objInvoke;
                if (str2.length() == 0 || str2.equals(str)) {
                    return;
                }
                strArr[i10] = str2;
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m6490p(Annotation annotation, FieldInfo fieldInfo, Method method) {
        String name = method.getName();
        try {
            Object objInvoke = method.invoke(annotation, null);
            if ("value".equals(name)) {
                String strName = ((Enum) objInvoke).name();
                int iHashCode = strName.hashCode();
                if (iHashCode == -7755493) {
                    if (strName.equals("NON_EMPTY")) {
                        long j10 = fieldInfo.features | JSONWriter.Feature.NotWriteEmptyArray.mask;
                        fieldInfo.features = j10;
                        fieldInfo.features = j10 | JSONWriter.Feature.IgnoreEmpty.mask;
                        return;
                    }
                    return;
                }
                if (iHashCode == 10566287) {
                    if (strName.equals("NON_DEFAULT")) {
                        fieldInfo.features |= JSONWriter.Feature.NotWriteDefaultValue.mask;
                    }
                } else if (iHashCode == 1933739535 && strName.equals("ALWAYS")) {
                    fieldInfo.features |= JSONWriter.Feature.WriteNulls.mask;
                }
            }
        } catch (Throwable unused) {
        }
    }

    private static String pascal(String str, int i10, int i11) {
        char c10;
        char c11;
        int i12 = i10 - i11;
        char[] cArr = new char[i12];
        str.getChars(i11, i10, cArr, 0);
        char c12 = cArr[0];
        if (c12 >= 'a' && c12 <= 'z' && i12 > 1) {
            cArr[0] = (char) (c12 - ' ');
        } else if (c12 == '_' && i12 > 2 && (c10 = cArr[1]) >= 'a' && c10 <= 'z' && (c11 = cArr[2]) >= 'a' && c11 <= 'z') {
            cArr[1] = (char) (c10 - ' ');
        }
        return new String(cArr);
    }

    public static void processGsonSerializedName(final FieldInfo fieldInfo, final Annotation annotation) {
        annotationMethods(annotation.getClass(), new Consumer() { // from class: com.alibaba.fastjson2.util.b
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                BeanUtils.m6481g(annotation, fieldInfo, (Method) obj);
            }
        });
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static void processJSONType1x(BeanInfo beanInfo, Annotation annotation, Method method) {
        try {
            Object objInvoke = method.invoke(annotation, null);
            String name = method.getName();
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
                            linkedHashSet.addAll(Arrays.asList(beanInfo.ignores));
                            linkedHashSet.addAll(Arrays.asList(strArr3));
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
            for (Enum r02 : (Enum[]) objInvoke) {
                String strName = r02.name();
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
            }
        } catch (Throwable unused) {
        }
    }

    public static void processJacksonJsonFormat(FieldInfo fieldInfo, final Annotation annotation) {
        final String[] strArr = new String[3];
        annotationMethods(annotation.getClass(), new Consumer() { // from class: com.alibaba.fastjson2.util.r
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                BeanUtils.m6480f(annotation, strArr, (Method) obj);
            }
        });
        if (strArr[0].length() != 0) {
            fieldInfo.format = strArr[0];
        }
        if ("STRING".equals(strArr[1]) && fieldInfo.format == null) {
            fieldInfo.format = "string";
        } else if ("NUMBER".equals(strArr[1])) {
            fieldInfo.format = "millis";
        }
        if (strArr[2].isEmpty() || "##default".equals(strArr[2])) {
            return;
        }
        fieldInfo.locale = Locale.forLanguageTag(strArr[2]);
    }

    public static void processJacksonJsonIgnore(final FieldInfo fieldInfo, final Annotation annotation) {
        fieldInfo.ignore = true;
        annotationMethods(annotation.getClass(), new Consumer() { // from class: com.alibaba.fastjson2.util.t
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                BeanUtils.m6493s(annotation, fieldInfo, (Method) obj);
            }
        });
    }

    public static void processJacksonJsonInclude(final BeanInfo beanInfo, final Annotation annotation) {
        annotationMethods(annotation.getClass(), new Consumer() { // from class: com.alibaba.fastjson2.util.g
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                BeanUtils.m6487m(annotation, beanInfo, (Method) obj);
            }
        });
    }

    public static void processJacksonJsonSubTypesType(final BeanInfo beanInfo, final int i10, final Annotation annotation) {
        annotationMethods(annotation.getClass(), new Consumer() { // from class: com.alibaba.fastjson2.util.o
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                BeanUtils.m6482h(annotation, beanInfo, i10, (Method) obj);
            }
        });
    }

    public static void processJacksonJsonTypeName(final BeanInfo beanInfo, final Annotation annotation) {
        annotationMethods(annotation.getClass(), new Consumer() { // from class: com.alibaba.fastjson2.util.h
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                BeanUtils.m6483i(annotation, beanInfo, (Method) obj);
            }
        });
    }

    public static void processJacksonJsonUnwrapped(final FieldInfo fieldInfo, final Annotation annotation) {
        annotationMethods(annotation.getClass(), new Consumer() { // from class: com.alibaba.fastjson2.util.p
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                BeanUtils.m6486l(annotation, fieldInfo, (Method) obj);
            }
        });
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m6491q(Enum[] enumArr, final String[] strArr, Field field) {
        String name = field.getName();
        for (final int i10 = 0; i10 < enumArr.length; i10++) {
            final String strName = enumArr[i10].name();
            if (name.equals(strName)) {
                for (final Annotation annotation : field.getAnnotations()) {
                    Class<? extends Annotation> clsAnnotationType = annotation.annotationType();
                    String name2 = clsAnnotationType.getName();
                    if ("com.alibaba.fastjson2.annotation.JSONField".equals(name2) || "com.alibaba.fastjson.annotation.JSONField".equals(name2)) {
                        annotationMethods(clsAnnotationType, new Consumer() { // from class: com.alibaba.fastjson2.util.e
                            @Override // java.util.function.Consumer
                            public final void accept(Object obj) {
                                BeanUtils.m6489o(annotation, strName, strArr, i10, (Method) obj);
                            }
                        });
                    } else if ("com.fasterxml.jackson.annotation.JsonProperty".equals(name2)) {
                        annotationMethods(clsAnnotationType, new Consumer() { // from class: com.alibaba.fastjson2.util.f
                            @Override // java.util.function.Consumer
                            public final void accept(Object obj) {
                                BeanUtils.m6477c(annotation, strName, strArr, i10, (Method) obj);
                            }
                        });
                    }
                }
                return;
            }
        }
    }

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
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.reflect.Type resolve(java.lang.reflect.Type r9, java.lang.Class<?> r10, java.lang.reflect.Type r11, java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type> r12) {
        /*
            Method dump skipped, instruction units count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.util.BeanUtils.resolve(java.lang.reflect.Type, java.lang.Class, java.lang.reflect.Type, java.util.Map):java.lang.reflect.Type");
    }

    public static Type resolveCollectionItemType(Type type, Class<?> cls) {
        if (type == null) {
            type = cls;
        }
        Type genericSupertype = getGenericSupertype(type, cls, List.class);
        if (genericSupertype == null || genericSupertype == List.class) {
            genericSupertype = getGenericSupertype(type, cls, Collection.class);
        }
        Type typeResolve = resolve(type, cls, genericSupertype);
        if (!(typeResolve instanceof ParameterizedType)) {
            return null;
        }
        Type[] actualTypeArguments = ((ParameterizedType) typeResolve).getActualTypeArguments();
        if (actualTypeArguments.length == 1) {
            return actualTypeArguments[0];
        }
        return null;
    }

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

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ void m6493s(Annotation annotation, FieldInfo fieldInfo, Method method) {
        String name = method.getName();
        try {
            Object objInvoke = method.invoke(annotation, null);
            if ("value".equals(name)) {
                fieldInfo.ignore = ((Boolean) objInvoke).booleanValue();
            }
        } catch (Throwable unused) {
        }
    }

    public static void setNoneStaticMemberClassParent(Object obj, Object obj2) {
        Class<?> cls = obj.getClass();
        Field[] declaredFields = declaredFieldCache.get(cls);
        if (declaredFields == null) {
            declaredFields = cls.getDeclaredFields();
            int length = declaredFields.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    break;
                }
                if (Modifier.isStatic(declaredFields[i10].getModifiers())) {
                    ArrayList arrayList = new ArrayList(declaredFields.length);
                    for (Field field : declaredFields) {
                        if (!Modifier.isStatic(field.getModifiers())) {
                            arrayList.add(field);
                        }
                    }
                    declaredFields = (Field[]) arrayList.toArray(new Field[arrayList.size()]);
                } else {
                    i10++;
                }
            }
            fieldCache.putIfAbsent(cls, declaredFields);
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
                C1605j.m6294a("setNoneStaticMemberClassParent error, class ", cls);
            }
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static String setterName(String str, String str2) {
        char c10;
        if (str2 == null) {
            str2 = "CamelCase";
        }
        int length = str.length();
        byte b10 = 3;
        if (length <= 3) {
            return str;
        }
        int i10 = str.startsWith("set") ? 3 : 0;
        switch (str2.hashCode()) {
            case -2068429102:
                b10 = str2.equals("UpperCase") ? (byte) 0 : (byte) -1;
                break;
            case -1863045342:
                b10 = str2.equals("UpperCaseWithDots") ? (byte) 1 : (byte) -1;
                break;
            case -1112704575:
                b10 = str2.equals("NeverUseThisValueExceptDefaultValue") ? (byte) 2 : (byte) -1;
                break;
            case -46641534:
                if (!str2.equals("LowerCaseWithUnderScores")) {
                    b10 = -1;
                }
                break;
            case 572594479:
                b10 = str2.equals("UpperCamelCaseWithUnderScores") ? (byte) 4 : (byte) -1;
                break;
            case 601822360:
                b10 = str2.equals("UpperCaseWithDashes") ? (byte) 5 : (byte) -1;
                break;
            case 928600554:
                b10 = str2.equals("UpperCamelCaseWithDashes") ? (byte) 6 : (byte) -1;
                break;
            case 975280372:
                b10 = str2.equals("UpperCamelCaseWithDots") ? (byte) 7 : (byte) -1;
                break;
            case 1315531521:
                b10 = str2.equals("LowerCaseWithDots") ? (byte) 8 : (byte) -1;
                break;
            case 1336502620:
                b10 = str2.equals("PascalCase") ? (byte) 9 : (byte) -1;
                break;
            case 1371349591:
                b10 = str2.equals("UpperCamelCaseWithSpaces") ? (byte) 10 : (byte) -1;
                break;
            case 1460726553:
                b10 = str2.equals("KebabCase") ? (byte) 11 : (byte) -1;
                break;
            case 1488507313:
                b10 = str2.equals("LowerCase") ? (byte) 12 : (byte) -1;
                break;
            case 1492440247:
                b10 = str2.equals("LowerCaseWithDashes") ? (byte) 13 : (byte) -1;
                break;
            case 1655544038:
                b10 = str2.equals("CamelCase") ? (byte) 14 : (byte) -1;
                break;
            case 1839922637:
                b10 = str2.equals("CamelCase1x") ? (byte) 15 : (byte) -1;
                break;
            case 1976554305:
                b10 = str2.equals("UpperCaseWithUnderScores") ? JSONB.Constants.BC_INT32_NUM_16 : (byte) -1;
                break;
            case 2087942256:
                b10 = str2.equals("SnakeCase") ? (byte) 17 : (byte) -1;
                break;
            default:
                b10 = -1;
                break;
        }
        switch (b10) {
            case 0:
                int i11 = length - i10;
                char[] cArr = new char[i11];
                str.getChars(i10, length, cArr, 0);
                char c11 = cArr[0];
                for (int i12 = 0; i12 < i11; i12++) {
                    char c12 = cArr[i12];
                    if (c12 >= 'a' && c11 <= 'z') {
                        cArr[i12] = (char) (c12 - ' ');
                    }
                }
                return new String(cArr);
            case 1:
                return dots(str, i10, true);
            case 2:
            case Opcodes.DCONST_0 /* 14 */:
                int i13 = length - i10;
                char[] cArr2 = new char[i13];
                str.getChars(i10, length, cArr2, 0);
                char c13 = cArr2[0];
                boolean z10 = i13 > 1 && (c10 = cArr2[1]) >= 'A' && c10 <= 'Z';
                if (c13 >= 'A' && c13 <= 'Z' && !z10) {
                    cArr2[0] = (char) (c13 + ' ');
                }
                return new String(cArr2);
            case 3:
                return underScores(str, i10, false);
            case 4:
                return upperCamelWith(str, i10, '_');
            case 5:
                return dashes(str, i10, true);
            case 6:
                return upperCamelWith(str, i10, '-');
            case 7:
                return upperCamelWith(str, i10, '.');
            case 8:
                return dots(str, i10, false);
            case 9:
                return pascal(str, length, i10);
            case 10:
                return upperCamelWith(str, i10, ' ');
            case Opcodes.FCONST_0 /* 11 */:
                StringBuilder sb2 = new StringBuilder();
                for (int i14 = i10; i14 < str.length(); i14++) {
                    char cCharAt = str.charAt(i14);
                    if (cCharAt >= 'A' && cCharAt <= 'Z') {
                        cCharAt = (char) (cCharAt + ' ');
                        if (i14 > i10) {
                            sb2.append('-');
                        }
                    }
                    sb2.append(cCharAt);
                }
                return sb2.toString();
            case Opcodes.FCONST_1 /* 12 */:
                return str.substring(i10).toLowerCase();
            case Opcodes.FCONST_2 /* 13 */:
                return dashes(str, i10, false);
            case 15:
                char[] cArr3 = new char[length - i10];
                str.getChars(i10, length, cArr3, 0);
                char c14 = cArr3[0];
                if (c14 >= 'A' && c14 <= 'Z') {
                    cArr3[0] = (char) (c14 + ' ');
                }
                return new String(cArr3);
            case 16:
                return underScores(str, i10, true);
            case Opcodes.SIPUSH /* 17 */:
                return snakeCase(str, i10);
            default:
                C1569c.m6258a("TODO : ".concat(str2));
                return null;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01ac A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00cf  */
    /* JADX WARN: Type inference failed for: r12v10, types: [int] */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void setters(java.lang.Class r18, com.alibaba.fastjson2.codec.BeanInfo r19, java.lang.Class r20, java.util.function.Consumer<java.lang.reflect.Method> r21) {
        /*
            Method dump skipped, instruction units count: 464
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.util.BeanUtils.setters(java.lang.Class, com.alibaba.fastjson2.codec.BeanInfo, java.lang.Class, java.util.function.Consumer):void");
    }

    public static String snakeCase(String str, int i10) {
        int length = str.length();
        char[] andSet = TypeUtils.CHARS_UPDATER.getAndSet(TypeUtils.CACHE, null);
        if (andSet == null) {
            andSet = new char[128];
        }
        int i11 = i10;
        int i12 = 0;
        while (i11 < length) {
            try {
                char cCharAt = str.charAt(i11);
                if (cCharAt >= 'A' && cCharAt <= 'Z') {
                    cCharAt = (char) (cCharAt + ' ');
                    if (i11 > i10) {
                        andSet[i12] = '_';
                        i12++;
                    }
                }
                andSet[i12] = cCharAt;
                i11++;
                i12++;
            } catch (Throwable th) {
                TypeUtils.CHARS_UPDATER.set(TypeUtils.CACHE, andSet);
                throw th;
            }
        }
        String str2 = new String(andSet, 0, i12);
        TypeUtils.CHARS_UPDATER.set(TypeUtils.CACHE, andSet);
        return str2;
    }

    public static void staticMethod(Class cls, Consumer<Method> consumer) {
        ConcurrentMap<Class, Method[]> concurrentMap = methodCache;
        Method[] methods = concurrentMap.get(cls);
        if (methods == null) {
            methods = getMethods(cls);
            concurrentMap.putIfAbsent(cls, methods);
        }
        for (Method method : methods) {
            if (Modifier.isStatic(method.getModifiers())) {
                consumer.accept(method);
            }
        }
    }

    public static WildcardType subtypeOf(Type type) {
        return new WildcardTypeImpl(type instanceof WildcardType ? ((WildcardType) type).getUpperBounds() : new Type[]{type}, EMPTY_TYPE_ARRAY);
    }

    public static WildcardType supertypeOf(Type type) {
        return new WildcardTypeImpl(new Type[]{Object.class}, type instanceof WildcardType ? ((WildcardType) type).getLowerBounds() : new Type[]{type});
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ void m6494t(Annotation annotation, BeanInfo beanInfo, Method method) {
        String name = method.getName();
        try {
            Object objInvoke = method.invoke(annotation, null);
            int iHashCode = name.hashCode();
            if (iHashCode == -1097462182) {
                if (name.equals("locale")) {
                    String str = (String) objInvoke;
                    if (str.isEmpty() || "##default".equals(str)) {
                        return;
                    }
                    beanInfo.locale = Locale.forLanguageTag(str);
                    return;
                }
                return;
            }
            if (iHashCode == -791090288) {
                if (name.equals("pattern")) {
                    String str2 = (String) objInvoke;
                    if (str2.isEmpty()) {
                        return;
                    }
                    beanInfo.format = str2;
                    return;
                }
                return;
            }
            if (iHashCode == 109399969 && name.equals("shape")) {
                String strName = ((Enum) objInvoke).name();
                if ("NUMBER".equals(strName)) {
                    beanInfo.format = "millis";
                } else if ("OBJECT".equals(strName)) {
                    beanInfo.writeEnumAsJavaBean = true;
                }
            }
        } catch (Throwable unused) {
        }
    }

    public static String typeToString(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ void m6495u(Method method, int i10, int i11, Class cls, char c10, String str, Field[] fieldArr, Field field) {
        if (field.getDeclaringClass() != method.getDeclaringClass()) {
            return;
        }
        String name = field.getName();
        int length = name.length();
        if (length != i10 - i11 || (field.getType() != cls && !cls.isAssignableFrom(field.getType()))) {
            if (Boolean.TYPE == field.getType() && str.equals(name)) {
                fieldArr[0] = field;
                return;
            }
            return;
        }
        if (c10 >= 'A' && c10 <= 'Z' && c10 + ' ' == name.charAt(0) && name.regionMatches(1, str, i11 + 1, length - 1)) {
            fieldArr[0] = field;
        } else if (name.regionMatches(0, str, i11, length)) {
            fieldArr[1] = field;
        }
    }

    public static String underScores(String str, int i10, boolean z10) {
        int i11;
        int length = str.length();
        char[] andSet = TypeUtils.CHARS_UPDATER.getAndSet(TypeUtils.CACHE, null);
        if (andSet == null) {
            andSet = new char[128];
        }
        int i12 = i10;
        int i13 = 0;
        while (i12 < length) {
            try {
                char cCharAt = str.charAt(i12);
                if (z10) {
                    if (cCharAt < 'A' || cCharAt > 'Z') {
                        if (cCharAt >= 'a' && cCharAt <= 'z') {
                            i11 = cCharAt - ' ';
                            cCharAt = (char) i11;
                        }
                    } else if (i12 > i10) {
                        andSet[i13] = '_';
                        i13++;
                    }
                } else if (cCharAt >= 'A' && cCharAt <= 'Z') {
                    if (i12 > i10) {
                        andSet[i13] = '_';
                        i13++;
                    }
                    i11 = cCharAt + ' ';
                    cCharAt = (char) i11;
                }
                andSet[i13] = cCharAt;
                i12++;
                i13++;
            } catch (Throwable th) {
                TypeUtils.CHARS_UPDATER.set(TypeUtils.CACHE, andSet);
                throw th;
            }
        }
        String str2 = new String(andSet, 0, i13);
        TypeUtils.CHARS_UPDATER.set(TypeUtils.CACHE, andSet);
        return str2;
    }

    public static String upperCamelWith(String str, int i10, char c10) {
        int i11;
        char cCharAt;
        char cCharAt2;
        int i12;
        int i13;
        char cCharAt3;
        int i14;
        char cCharAt4;
        int i15;
        char cCharAt5;
        int length = str.length();
        char[] andSet = TypeUtils.CHARS_UPDATER.getAndSet(TypeUtils.CACHE, null);
        if (andSet == null) {
            andSet = new char[128];
        }
        int i16 = i10;
        int i17 = 0;
        while (i16 < length) {
            try {
                char cCharAt6 = str.charAt(i16);
                if (i16 == i10) {
                    if (cCharAt6 >= 'a' && cCharAt6 <= 'z' && (i15 = i16 + 1) < length && (cCharAt5 = str.charAt(i15)) >= 'a' && cCharAt5 <= 'z') {
                        cCharAt6 = (char) (cCharAt6 - ' ');
                    } else if (cCharAt6 == '_' && (i14 = i16 + 1) < length && (cCharAt4 = str.charAt(i14)) >= 'a' && cCharAt4 <= 'z') {
                        andSet[i17] = cCharAt6;
                        cCharAt6 = (char) (cCharAt4 - ' ');
                        i17++;
                        i16 = i14;
                    }
                } else if (cCharAt6 < 'A' || cCharAt6 > 'Z' || (i13 = i16 + 1) >= length || ((cCharAt3 = str.charAt(i13)) >= 'A' && cCharAt3 <= 'Z')) {
                    if (cCharAt6 >= 'A' && cCharAt6 <= 'Z' && i16 > i10 && (i11 = i16 + 1) < length && (cCharAt = str.charAt(i11)) >= 'A' && cCharAt <= 'Z' && (cCharAt2 = str.charAt(i16 - 1)) >= 'a' && cCharAt2 <= 'z') {
                        i12 = i17 + 1;
                        andSet[i17] = c10;
                        i17 = i12;
                    }
                } else if (i16 > i10) {
                    i12 = i17 + 1;
                    andSet[i17] = c10;
                    i17 = i12;
                }
                andSet[i17] = cCharAt6;
                i16++;
                i17++;
            } catch (Throwable th) {
                TypeUtils.CHARS_UPDATER.set(TypeUtils.CACHE, andSet);
                throw th;
            }
        }
        String str2 = new String(andSet, 0, i17);
        TypeUtils.CHARS_UPDATER.set(TypeUtils.CACHE, andSet);
        return str2;
    }

    public static void processJacksonJsonInclude(final FieldInfo fieldInfo, final Annotation annotation) {
        annotationMethods(annotation.getClass(), new Consumer() { // from class: com.alibaba.fastjson2.util.q
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                BeanUtils.m6490p(annotation, fieldInfo, (Method) obj);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <A extends Annotation> A findAnnotation(Annotation annotation, Class<A> cls) {
        if (annotation == 0) {
            C1259t2.m5095a("annotation must not be null");
            return null;
        }
        if (cls != null) {
            Class<? extends Annotation> clsAnnotationType = annotation.annotationType();
            return clsAnnotationType == cls ? annotation : (A) findAnnotation(clsAnnotationType, cls, cls.isAnnotationPresent(Inherited.class), new HashSet());
        }
        C1259t2.m5095a("annotationType must not be null");
        return null;
    }

    public static <A extends Annotation> A findAnnotation(AnnotatedElement annotatedElement, Class<A> cls) {
        if (cls != null) {
            return (A) findAnnotation(annotatedElement, cls, cls.isAnnotationPresent(Inherited.class), new HashSet());
        }
        C1259t2.m5095a("annotationType must not be null");
        return null;
    }

    public static void processJacksonJsonFormat(final BeanInfo beanInfo, final Annotation annotation) {
        annotationMethods(annotation.getClass(), new Consumer() { // from class: com.alibaba.fastjson2.util.i
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                BeanUtils.m6494t(annotation, beanInfo, (Method) obj);
            }
        });
    }

    public static Method getMethod(Class cls, String str) {
        ConcurrentMap<Class, Method[]> concurrentMap = methodCache;
        Method[] methods = concurrentMap.get(cls);
        if (methods == null) {
            methods = getMethods(cls);
            concurrentMap.putIfAbsent(cls, methods);
        }
        for (Method method : methods) {
            if (method.getName().equals(str)) {
                return method;
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

    public static Field getField(Class cls, final String str) {
        final Field[] fieldArr = new Field[1];
        declaredFields(cls, new Consumer() { // from class: com.alibaba.fastjson2.util.s
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                BeanUtils.m6479e(str, fieldArr, (Field) obj);
            }
        });
        return fieldArr[0];
    }

    public static Type resolve(Type type, Class<?> cls, Type type2) {
        return resolve(type, cls, type2, new HashMap());
    }

    public static void setters(Class cls, Class cls2, Consumer<Method> consumer) {
        setters(cls, null, cls2, consumer);
    }

    public static void setters(Class cls, Consumer<Method> consumer) {
        setters(cls, null, null, consumer);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void setters(java.lang.Class r7, boolean r8, java.util.function.Consumer<java.lang.reflect.Method> r9) {
        /*
            boolean r0 = ignore(r7)
            if (r0 == 0) goto L8
            goto L89
        L8:
            java.util.concurrent.ConcurrentMap<java.lang.Class, java.lang.reflect.Method[]> r0 = com.alibaba.fastjson2.util.BeanUtils.methodCache
            java.lang.Object r1 = r0.get(r7)
            java.lang.reflect.Method[] r1 = (java.lang.reflect.Method[]) r1
            if (r1 != 0) goto L19
            java.lang.reflect.Method[] r1 = getMethods(r7)
            r0.putIfAbsent(r7, r1)
        L19:
            int r7 = r1.length
            r0 = 0
        L1b:
            if (r0 >= r7) goto L89
            r2 = r1[r0]
            int r3 = r2.getParameterCount()
            r4 = 3
            if (r3 != 0) goto L5f
            java.lang.String r5 = r2.getName()
            if (r8 == 0) goto L3b
            int r6 = r5.length()
            if (r6 <= r4) goto L86
            java.lang.String r6 = "get"
            boolean r5 = r5.startsWith(r6)
            if (r5 != 0) goto L3b
            goto L86
        L3b:
            java.lang.Class r5 = r2.getReturnType()
            java.lang.Class<java.util.concurrent.atomic.AtomicInteger> r6 = java.util.concurrent.atomic.AtomicInteger.class
            if (r5 == r6) goto L5b
            java.lang.Class<java.util.concurrent.atomic.AtomicLong> r6 = java.util.concurrent.atomic.AtomicLong.class
            if (r5 == r6) goto L5b
            java.lang.Class<java.util.concurrent.atomic.AtomicBoolean> r6 = java.util.concurrent.atomic.AtomicBoolean.class
            if (r5 == r6) goto L5b
            java.lang.Class<java.util.concurrent.atomic.AtomicIntegerArray> r6 = java.util.concurrent.atomic.AtomicIntegerArray.class
            if (r5 == r6) goto L5b
            java.lang.Class<java.util.concurrent.atomic.AtomicLongArray> r6 = java.util.concurrent.atomic.AtomicLongArray.class
            if (r5 == r6) goto L5b
            java.lang.Class<java.util.Collection> r6 = java.util.Collection.class
            boolean r5 = r6.isAssignableFrom(r5)
            if (r5 == 0) goto L5f
        L5b:
            r9.accept(r2)
            goto L86
        L5f:
            r5 = 1
            if (r3 == r5) goto L63
            goto L86
        L63:
            int r3 = r2.getModifiers()
            boolean r3 = java.lang.reflect.Modifier.isStatic(r3)
            if (r3 == 0) goto L6e
            goto L86
        L6e:
            java.lang.String r3 = r2.getName()
            int r5 = r3.length()
            if (r8 == 0) goto L83
            if (r5 <= r4) goto L86
            java.lang.String r4 = "set"
            boolean r3 = r3.startsWith(r4)
            if (r3 != 0) goto L83
            goto L86
        L83:
            r9.accept(r2)
        L86:
            int r0 = r0 + 1
            goto L1b
        L89:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.util.BeanUtils.setters(java.lang.Class, boolean, java.util.function.Consumer):void");
    }

    public static String getterName(Method method, boolean z10, String str) {
        int iIndexOf;
        Class<?> returnType;
        String name = method.getName();
        if (name.startsWith("is") && (((returnType = method.getReturnType()) != Boolean.class && returnType != Boolean.TYPE) || z10)) {
            return name;
        }
        String strSubstring = getterName(name, str);
        if (z10 && (iIndexOf = strSubstring.indexOf(45)) != -1) {
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

    public static String setterName(String str, int i10) {
        char c10;
        int length = str.length();
        int i11 = length - i10;
        char[] cArr = new char[i11];
        str.getChars(i10, length, cArr, 0);
        char c11 = cArr[0];
        boolean z10 = i11 > 1 && (c10 = cArr[1]) >= 'A' && c10 <= 'Z';
        if (c11 >= 'A' && c11 <= 'Z' && !z10) {
            cArr[0] = (char) (c11 + ' ');
        }
        return new String(cArr);
    }

    public static String getterName(Method method, String str) {
        return getterName(method, false, str);
    }

    public static void getters(Class cls, Class cls2, Consumer<Method> consumer) {
        getters(cls, cls2, false, consumer);
    }

    public static void getters(Class cls, Consumer<Method> consumer) {
        getters(cls, null, consumer);
    }
}
