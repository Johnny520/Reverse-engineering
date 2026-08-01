package p384;

import androidx.compose.animation.core.C1171;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import net.bytebuddy.pool.TypePool;
import org.apache.commons.lang3.AbstractC6516;
import org.apache.commons.lang3.AbstractC6522;
import org.apache.commons.lang3.AbstractC6531;
import org.apache.commons.lang3.ObjectUtils$Null;
import p025.AbstractC7012;
import p160.C8376;
import p352.C9620;

/* JADX INFO: renamed from: 飘花落叶言苏子哲世兰楪.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC9785 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C1171 f25503 = new C1171((String) null, (String) null, " & ", new C9620(7));

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C1171 f25502 = new C1171((String) null, (String) null, ", ", new C9620(8));

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C1171 f25501 = new C1171("<", ">", ", ", new C9620(9));

    static {
        ObjectUtils$Null objectUtils$Null = AbstractC6522.f15970;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static Class m15119(ParameterizedType parameterizedType) {
        Type rawType = parameterizedType.getRawType();
        if (rawType instanceof Class) {
            return (Class) rawType;
        }
        C8376.m13333(rawType, "Type of rawType: ");
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static Type[] m15120(WildcardType wildcardType) {
        Objects.requireNonNull(wildcardType, "wildcardType");
        return m15129(wildcardType.getUpperBounds());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static Type[] m15121(WildcardType wildcardType) {
        Objects.requireNonNull(wildcardType, "wildcardType");
        Type[] lowerBounds = wildcardType.getLowerBounds();
        return lowerBounds.length == 0 ? new Type[]{null} : lowerBounds;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static Type[] m15122(TypeVariable typeVariable) {
        Objects.requireNonNull(typeVariable, "typeVariable");
        return m15129(typeVariable.getBounds());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static Type m15123(Class cls, Class cls2) {
        Class clsM15119;
        if (cls2.isInterface()) {
            Type type = null;
            for (Type type2 : cls.getGenericInterfaces()) {
                if (type2 instanceof ParameterizedType) {
                    clsM15119 = m15119((ParameterizedType) type2);
                } else {
                    if (!(type2 instanceof Class)) {
                        C8376.m13333(type2, "Unexpected generic interface type found: ");
                        return null;
                    }
                    clsM15119 = (Class) type2;
                }
                if (m15130(cls2, clsM15119) && m15128(type, clsM15119)) {
                    type = type2;
                }
            }
            if (type != null) {
                return type;
            }
        }
        return cls.getGenericSuperclass();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static String m15124(Class cls) {
        if (cls.isArray()) {
            return m15125(cls.getComponentType()).concat("[]");
        }
        for (TypeVariable typeVariable : cls.getTypeParameters()) {
            for (Type type : typeVariable.getBounds()) {
                if (type.getTypeName().contains(cls.getName())) {
                    return cls.getSimpleName().concat("(cycle)");
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        if (cls.getEnclosingClass() != null) {
            sb.append(m15124(cls.getEnclosingClass()));
            sb.append(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
            sb.append(cls.getSimpleName());
        } else {
            sb.append(cls.getName());
        }
        if (cls.getTypeParameters().length > 0) {
            f25502.m1521(cls.getTypeParameters(), sb);
        }
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:98:0x01af  */
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String m15125(Type type) {
        int i;
        int i2;
        Objects.requireNonNull(type, "type");
        if (type instanceof Class) {
            return m15124((Class) type);
        }
        if (!(type instanceof ParameterizedType)) {
            boolean z = type instanceof WildcardType;
            C1171 c1171 = f25503;
            if (z) {
                WildcardType wildcardType = (WildcardType) type;
                StringBuilder sb = new StringBuilder();
                sb.append('?');
                Type[] lowerBounds = wildcardType.getLowerBounds();
                Type[] upperBounds = wildcardType.getUpperBounds();
                if (lowerBounds.length > 1 || (lowerBounds.length == 1 && lowerBounds[0] != null)) {
                    sb.append(" super ");
                    c1171.m1521(lowerBounds, sb);
                } else if (upperBounds.length > 1 || (upperBounds.length == 1 && !Object.class.equals(upperBounds[0]))) {
                    sb.append(" extends ");
                    c1171.m1521(upperBounds, sb);
                }
                return sb.toString();
            }
            if (!(type instanceof TypeVariable)) {
                if (type instanceof GenericArrayType) {
                    return m15125(((GenericArrayType) type).getGenericComponentType()).concat("[]");
                }
                ObjectUtils$Null objectUtils$Null = AbstractC6522.f15970;
                String name = type.getClass().getName();
                String hexString = Integer.toHexString(System.identityHashCode(type));
                StringBuilder sb2 = new StringBuilder(hexString.length() + name.length() + 1);
                sb2.append(name);
                sb2.append('@');
                sb2.append(hexString);
                throw new IllegalArgumentException(sb2.toString());
            }
            TypeVariable typeVariable = (TypeVariable) type;
            StringBuilder sb3 = new StringBuilder(typeVariable.getName());
            Type[] bounds = typeVariable.getBounds();
            if (bounds.length > 0 && (bounds.length != 1 || !Object.class.equals(bounds[0]))) {
                Type type2 = bounds[0];
                if (type2 instanceof ParameterizedType) {
                    Type rawType = ((ParameterizedType) type2).getRawType();
                    if (!(rawType instanceof Class) || !((Class) rawType).isInterface()) {
                        sb3.append(" extends ");
                        c1171.m1521(bounds, sb3);
                    }
                }
            }
            return sb3.toString();
        }
        ParameterizedType parameterizedType = (ParameterizedType) type;
        StringBuilder sb4 = new StringBuilder();
        Type ownerType = parameterizedType.getOwnerType();
        Class cls = (Class) parameterizedType.getRawType();
        if (ownerType == null) {
            sb4.append(cls.getName());
        } else {
            if (ownerType instanceof Class) {
                sb4.append(((Class) ownerType).getName());
            } else {
                sb4.append(ownerType);
            }
            sb4.append(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
            sb4.append(cls.getSimpleName());
        }
        Type[] typeArr = (Type[]) Arrays.copyOf(parameterizedType.getActualTypeArguments(), parameterizedType.getActualTypeArguments().length);
        int[] iArr = new int[0];
        for (int i3 = 0; i3 < typeArr.length; i3++) {
            Type type3 = typeArr[i3];
            if ((type3 instanceof TypeVariable) && AbstractC6516.m11613(parameterizedType, ((TypeVariable) type3).getBounds())) {
                int length = Array.getLength(iArr);
                Object objNewInstance = Array.newInstance(iArr.getClass().getComponentType(), length + 1);
                System.arraycopy(iArr, 0, objNewInstance, 0, length);
                int[] iArr2 = (int[]) objNewInstance;
                iArr2[iArr2.length - 1] = i3;
                iArr = iArr2;
            }
        }
        int length2 = iArr.length;
        C1171 c11712 = f25501;
        if (length2 > 0) {
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            for (int i4 = 0; i4 < iArr.length; i4++) {
                c11712.m1521(new Object[]{actualTypeArguments[i4].toString()}, sb4);
            }
            Object objNewInstance2 = null;
            if (actualTypeArguments != null) {
                int length3 = Array.getLength(actualTypeArguments);
                int[] iArr3 = (int[]) iArr.clone();
                Arrays.sort(iArr3);
                if (!AbstractC6516.m11611(iArr3)) {
                    int length4 = iArr3.length;
                    i = 0;
                    int i5 = length3;
                    while (true) {
                        length4--;
                        if (length4 < 0) {
                            break;
                        }
                        i2 = iArr3[length4];
                        if (i2 < 0 || i2 >= length3) {
                            break;
                        }
                        if (i2 < i5) {
                            i++;
                            i5 = i2;
                        }
                    }
                    C8376.m13331(AbstractC7012.m12150(i2, length3, "Index: ", ", Length: "));
                    return null;
                }
                i = 0;
                int i6 = length3 - i;
                objNewInstance2 = Array.newInstance(actualTypeArguments.getClass().getComponentType(), i6);
                if (i < length3) {
                    int length5 = iArr3.length - 1;
                    while (length5 >= 0) {
                        int i7 = iArr3[length5];
                        int i8 = length3 - i7;
                        if (i8 > 1) {
                            int i9 = i8 - 1;
                            i6 -= i9;
                            System.arraycopy(actualTypeArguments, i7 + 1, objNewInstance2, i6, i9);
                        }
                        length5--;
                        length3 = i7;
                    }
                    if (length3 > 0) {
                        System.arraycopy(actualTypeArguments, 0, objNewInstance2, 0, length3);
                    }
                }
            }
            Type[] typeArr2 = (Type[]) ((Object[]) objNewInstance2);
            if (typeArr2.length > 0) {
                c11712.m1521(typeArr2, sb4);
            }
        } else {
            c11712.m1521(parameterizedType.getActualTypeArguments(), sb4);
        }
        return sb4.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static Map m15126(Type type, Class cls, Map map) {
        if (type instanceof Class) {
            Class cls2 = (Class) type;
            if (m15130(cls, cls2)) {
                if (cls2.isPrimitive()) {
                    if (cls.isPrimitive()) {
                        return new HashMap();
                    }
                    HashMap map2 = AbstractC6531.f15984;
                    if (cls2.isPrimitive()) {
                        cls2 = (Class) AbstractC6531.f15984.get(cls2);
                    }
                }
                HashMap map3 = map == null ? new HashMap() : new HashMap(map);
                return cls.equals(cls2) ? map3 : m15126(m15123(cls2, cls), cls, map3);
            }
        } else {
            if (type instanceof ParameterizedType) {
                return m15127((ParameterizedType) type, cls, map);
            }
            if (type instanceof GenericArrayType) {
                Type genericComponentType = ((GenericArrayType) type).getGenericComponentType();
                if (cls.isArray()) {
                    cls = cls.getComponentType();
                }
                return m15126(genericComponentType, cls, map);
            }
            int i = 0;
            if (type instanceof WildcardType) {
                Type[] typeArrM15120 = m15120((WildcardType) type);
                int length = typeArrM15120.length;
                while (i < length) {
                    Type type2 = typeArrM15120[i];
                    if (m15130(cls, type2)) {
                        return m15126(type2, cls, map);
                    }
                    i++;
                }
            } else {
                if (!(type instanceof TypeVariable)) {
                    C8376.m13333(type, "found an unhandled type: ");
                    return null;
                }
                Type[] typeArrM15122 = m15122((TypeVariable) type);
                int length2 = typeArrM15122.length;
                while (i < length2) {
                    Type type3 = typeArrM15122[i];
                    if (m15130(cls, type3)) {
                        return m15126(type3, cls, map);
                    }
                    i++;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static Map m15127(ParameterizedType parameterizedType, Class cls, Map map) {
        Map map2;
        Class clsM15119 = m15119(parameterizedType);
        if (!m15130(cls, clsM15119)) {
            return null;
        }
        Type ownerType = parameterizedType.getOwnerType();
        if (ownerType instanceof ParameterizedType) {
            ParameterizedType parameterizedType2 = (ParameterizedType) ownerType;
            map2 = m15127(parameterizedType2, m15119(parameterizedType2), map);
        } else {
            map2 = map == null ? new HashMap() : new HashMap(map);
        }
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        TypeVariable[] typeParameters = clsM15119.getTypeParameters();
        for (int i = 0; i < typeParameters.length; i++) {
            Type type = actualTypeArguments[i];
            map2.put(typeParameters[i], (Type) map2.getOrDefault(type, type));
        }
        return cls.equals(clsM15119) ? map2 : m15126(m15123(clsM15119, cls), cls, map2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static boolean m15128(Type type, Type type2) {
        Type type3;
        Type type4;
        if (type2 == null || (type2 instanceof Class)) {
            return m15130((Class) type2, type);
        }
        if (type2 instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type2;
            if (type == null) {
                return true;
            }
            if (!(type instanceof GenericArrayType)) {
                if (parameterizedType.equals(type)) {
                    return true;
                }
                Class clsM15119 = m15119(parameterizedType);
                Map mapM15126 = m15126(type, clsM15119, null);
                if (mapM15126 != null) {
                    if (mapM15126.isEmpty()) {
                        return true;
                    }
                    Map mapM15127 = m15127(parameterizedType, clsM15119, null);
                    for (TypeVariable typeVariable : mapM15127.keySet()) {
                        TypeVariable typeVariable2 = typeVariable;
                        while (true) {
                            type3 = (Type) mapM15127.get(typeVariable2);
                            if (!(type3 instanceof TypeVariable) || type3.equals(typeVariable2)) {
                                break;
                            }
                            typeVariable2 = (TypeVariable) type3;
                        }
                        while (true) {
                            type4 = (Type) mapM15126.get(typeVariable);
                            if (!(type4 instanceof TypeVariable) || type4.equals(typeVariable)) {
                                break;
                            }
                            typeVariable = (TypeVariable) type4;
                        }
                        if (type3 != null || !(type4 instanceof Class)) {
                            if (type4 == null || type3 == null || type3.equals(type4) || ((type3 instanceof WildcardType) && m15128(type4, type3))) {
                            }
                        }
                    }
                    return true;
                }
            }
        } else if (type2 instanceof GenericArrayType) {
            GenericArrayType genericArrayType = (GenericArrayType) type2;
            if (type == null || genericArrayType.equals(type)) {
                return true;
            }
            Type genericComponentType = genericArrayType.getGenericComponentType();
            if (type instanceof Class) {
                Class cls = (Class) type;
                if (cls.isArray() && m15128(cls.getComponentType(), genericComponentType)) {
                    return true;
                }
            } else {
                if (type instanceof GenericArrayType) {
                    return m15128(((GenericArrayType) type).getGenericComponentType(), genericComponentType);
                }
                if (type instanceof WildcardType) {
                    for (Type type5 : m15120((WildcardType) type)) {
                        if (m15128(type5, genericArrayType)) {
                            return true;
                        }
                    }
                } else if (type instanceof TypeVariable) {
                    for (Type type6 : m15122((TypeVariable) type)) {
                        if (m15128(type6, genericArrayType)) {
                            return true;
                        }
                    }
                } else if (!(type instanceof ParameterizedType)) {
                    C8376.m13333(type, "found an unhandled type: ");
                    return false;
                }
            }
        } else {
            if (!(type2 instanceof WildcardType)) {
                if (type2 instanceof TypeVariable) {
                    return m15131(type, (TypeVariable) type2);
                }
                C8376.m13333(type2, "found an unhandled type: ");
                return false;
            }
            WildcardType wildcardType = (WildcardType) type2;
            if (type == null || wildcardType.equals(type)) {
                return true;
            }
            Type[] typeArrM15120 = m15120(wildcardType);
            Type[] typeArrM15121 = m15121(wildcardType);
            if (type instanceof WildcardType) {
                WildcardType wildcardType2 = (WildcardType) type;
                Type[] typeArrM151202 = m15120(wildcardType2);
                Type[] typeArrM151212 = m15121(wildcardType2);
                int length = typeArrM15120.length;
                int i = 0;
                loop5: while (true) {
                    if (i >= length) {
                        for (Type type7 : typeArrM15121) {
                            for (Type type8 : typeArrM151212) {
                                if (m15128(type7, type8)) {
                                }
                            }
                        }
                        return true;
                    }
                    Type type9 = typeArrM15120[i];
                    for (Type type10 : typeArrM151202) {
                        if (!m15128(type10, type9)) {
                            break loop5;
                        }
                    }
                    i++;
                }
            } else {
                int length2 = typeArrM15120.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length2) {
                        for (Type type11 : typeArrM15121) {
                            if (m15128(type11, type)) {
                            }
                        }
                        return true;
                    }
                    if (!m15128(type, typeArrM15120[i2])) {
                        break;
                    }
                    i2++;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static Type[] m15129(Type[] typeArr) {
        int i;
        if (typeArr.length == 0) {
            return new Type[]{Object.class};
        }
        if (typeArr.length < 2) {
            return typeArr;
        }
        HashSet hashSet = new HashSet(typeArr.length);
        for (Type type : typeArr) {
            int length = typeArr.length;
            while (true) {
                if (i >= length) {
                    hashSet.add(type);
                    break;
                }
                Type type2 = typeArr[i];
                i = (type == type2 || !m15128(type2, type)) ? i + 1 : 0;
            }
        }
        return (Type[]) hashSet.toArray(AbstractC6516.f15961);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x003f A[PHI: r8
  0x003f: PHI (r8v8 java.lang.Class<?>) = (r8v7 java.lang.Class<?>), (r8v7 java.lang.Class<?>), (r8v23 java.lang.Class<?>) binds: [B:16:0x0025, B:18:0x002b, B:22:0x003b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00f9  */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m15130(Class cls, Type type) {
        if (type == null) {
            if (cls == null || !cls.isPrimitive()) {
                return true;
            }
        } else if (cls != null) {
            if (cls.equals(type)) {
                return true;
            }
            if (type instanceof Class) {
                Class<?> cls2 = (Class) type;
                HashMap map = AbstractC6531.f15984;
                if (cls2.isPrimitive() && !cls.isPrimitive()) {
                    if (cls2.isPrimitive()) {
                        cls2 = (Class) AbstractC6531.f15984.get(cls2);
                    }
                    if (cls2 != null) {
                    }
                } else if (!cls.isPrimitive() || cls2.isPrimitive() || (cls2 = (Class) AbstractC6531.f15983.get(cls2)) != null) {
                    if (cls2.equals(cls)) {
                        return true;
                    }
                    if (!cls2.isPrimitive()) {
                        return cls.isAssignableFrom(cls2);
                    }
                    if (cls.isPrimitive()) {
                        Class cls3 = Integer.TYPE;
                        boolean zEquals = cls3.equals(cls2);
                        Class cls4 = Long.TYPE;
                        Class cls5 = Double.TYPE;
                        Class cls6 = Float.TYPE;
                        if (zEquals) {
                            if (cls4.equals(cls) || cls6.equals(cls) || cls5.equals(cls)) {
                                return true;
                            }
                        } else if (cls4.equals(cls2)) {
                            if (cls6.equals(cls) || cls5.equals(cls)) {
                                return true;
                            }
                        } else if (!Boolean.TYPE.equals(cls2) && !cls5.equals(cls2)) {
                            if (cls6.equals(cls2)) {
                                return cls5.equals(cls);
                            }
                            if (!Character.TYPE.equals(cls2)) {
                                Class cls7 = Short.TYPE;
                                if (!cls7.equals(cls2)) {
                                    if (Byte.TYPE.equals(cls2) && (cls7.equals(cls) || cls3.equals(cls) || cls4.equals(cls) || cls6.equals(cls) || cls5.equals(cls))) {
                                        return true;
                                    }
                                } else if (cls3.equals(cls) || cls4.equals(cls) || cls6.equals(cls) || cls5.equals(cls)) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            } else {
                if (type instanceof ParameterizedType) {
                    return m15130(cls, m15119((ParameterizedType) type));
                }
                if (type instanceof TypeVariable) {
                    for (Type type2 : ((TypeVariable) type).getBounds()) {
                        if (m15130(cls, type2)) {
                            return true;
                        }
                    }
                } else if (type instanceof GenericArrayType) {
                    if (cls.equals(Object.class)) {
                        return true;
                    }
                    if (cls.isArray()) {
                        if (m15130(cls.getComponentType(), ((GenericArrayType) type).getGenericComponentType())) {
                            return true;
                        }
                    }
                } else if (!(type instanceof WildcardType)) {
                    C8376.m13333(type, "found an unhandled type: ");
                    return false;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static boolean m15131(Type type, TypeVariable typeVariable) {
        if (type == null) {
            return true;
        }
        if (typeVariable != null) {
            if (typeVariable.equals(type)) {
                return true;
            }
            if (type instanceof TypeVariable) {
                for (Type type2 : m15122((TypeVariable) type)) {
                    if (m15131(type2, typeVariable)) {
                        return true;
                    }
                }
            }
            if (!(type instanceof Class) && !(type instanceof ParameterizedType) && !(type instanceof GenericArrayType) && !(type instanceof WildcardType)) {
                C8376.m13333(type, "found an unhandled type: ");
            }
        }
        return false;
    }
}
