package p372;

import androidx.compose.animation.core.C0325;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import net.bytebuddy.pool.TypePool;
import org.apache.commons.lang3.AbstractC5685;
import org.apache.commons.lang3.AbstractC5691;
import org.apache.commons.lang3.AbstractC5700;
import org.apache.commons.lang3.ObjectUtils$Null;
import p144.C7546;
import p330.C8796;

/* JADX INFO: renamed from: 飘花落叶言苏子哲兰楪世.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC8972 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C0325 f25213 = new C0325((String) null, (String) null, " & ", new C8796(6));

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C0325 f25212 = new C0325((String) null, (String) null, ", ", new C8796(7));

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C0325 f25211 = new C0325("<", ">", ", ", new C8796(8));

    static {
        ObjectUtils$Null objectUtils$Null = AbstractC5691.f15625;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static Class m14548(ParameterizedType parameterizedType) {
        Type rawType = parameterizedType.getRawType();
        if (rawType instanceof Class) {
            return (Class) rawType;
        }
        C7546.m12745(rawType, "Type of rawType: ");
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static Type[] m14549(WildcardType wildcardType) {
        Objects.requireNonNull(wildcardType, "wildcardType");
        return m14558(wildcardType.getUpperBounds());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static Type[] m14550(WildcardType wildcardType) {
        Objects.requireNonNull(wildcardType, "wildcardType");
        Type[] lowerBounds = wildcardType.getLowerBounds();
        return lowerBounds.length == 0 ? new Type[]{null} : lowerBounds;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static Type[] m14551(TypeVariable typeVariable) {
        Objects.requireNonNull(typeVariable, "typeVariable");
        return m14558(typeVariable.getBounds());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static Type m14552(Class cls, Class cls2) {
        Class clsM14548;
        if (cls2.isInterface()) {
            Type type = null;
            for (Type type2 : cls.getGenericInterfaces()) {
                if (type2 instanceof ParameterizedType) {
                    clsM14548 = m14548((ParameterizedType) type2);
                } else {
                    if (!(type2 instanceof Class)) {
                        C7546.m12745(type2, "Unexpected generic interface type found: ");
                        return null;
                    }
                    clsM14548 = (Class) type2;
                }
                if (m14559(cls2, clsM14548) && m14557(type, clsM14548)) {
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
    public static String m14553(Class cls) {
        if (cls.isArray()) {
            return m14554(cls.getComponentType()).concat("[]");
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
            sb.append(m14553(cls.getEnclosingClass()));
            sb.append(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
            sb.append(cls.getSimpleName());
        } else {
            sb.append(cls.getName());
        }
        if (cls.getTypeParameters().length > 0) {
            f25212.m960(cls.getTypeParameters(), sb);
        }
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:98:0x01af  */
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String m14554(java.lang.reflect.Type r11) {
        /*
            Method dump skipped, instruction units count: 517
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p372.AbstractC8972.m14554(java.lang.reflect.Type):java.lang.String");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static Map m14555(Type type, Class cls, Map map) {
        if (type instanceof Class) {
            Class cls2 = (Class) type;
            if (m14559(cls, cls2)) {
                if (cls2.isPrimitive()) {
                    if (cls.isPrimitive()) {
                        return new HashMap();
                    }
                    HashMap map2 = AbstractC5700.f15639;
                    if (cls2.isPrimitive()) {
                        cls2 = (Class) AbstractC5700.f15639.get(cls2);
                    }
                }
                HashMap map3 = map == null ? new HashMap() : new HashMap(map);
                return cls.equals(cls2) ? map3 : m14555(m14552(cls2, cls), cls, map3);
            }
        } else {
            if (type instanceof ParameterizedType) {
                return m14556((ParameterizedType) type, cls, map);
            }
            if (type instanceof GenericArrayType) {
                Type genericComponentType = ((GenericArrayType) type).getGenericComponentType();
                if (cls.isArray()) {
                    cls = cls.getComponentType();
                }
                return m14555(genericComponentType, cls, map);
            }
            int i = 0;
            if (type instanceof WildcardType) {
                Type[] typeArrM14549 = m14549((WildcardType) type);
                int length = typeArrM14549.length;
                while (i < length) {
                    Type type2 = typeArrM14549[i];
                    if (m14559(cls, type2)) {
                        return m14555(type2, cls, map);
                    }
                    i++;
                }
            } else {
                if (!(type instanceof TypeVariable)) {
                    C7546.m12745(type, "found an unhandled type: ");
                    return null;
                }
                Type[] typeArrM14551 = m14551((TypeVariable) type);
                int length2 = typeArrM14551.length;
                while (i < length2) {
                    Type type3 = typeArrM14551[i];
                    if (m14559(cls, type3)) {
                        return m14555(type3, cls, map);
                    }
                    i++;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static Map m14556(ParameterizedType parameterizedType, Class cls, Map map) {
        Map map2;
        Class clsM14548 = m14548(parameterizedType);
        if (!m14559(cls, clsM14548)) {
            return null;
        }
        Type ownerType = parameterizedType.getOwnerType();
        if (ownerType instanceof ParameterizedType) {
            ParameterizedType parameterizedType2 = (ParameterizedType) ownerType;
            map2 = m14556(parameterizedType2, m14548(parameterizedType2), map);
        } else {
            map2 = map == null ? new HashMap() : new HashMap(map);
        }
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        TypeVariable[] typeParameters = clsM14548.getTypeParameters();
        for (int i = 0; i < typeParameters.length; i++) {
            Type type = actualTypeArguments[i];
            map2.put(typeParameters[i], (Type) map2.getOrDefault(type, type));
        }
        return cls.equals(clsM14548) ? map2 : m14555(m14552(clsM14548, cls), cls, map2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static boolean m14557(Type type, Type type2) {
        Type type3;
        Type type4;
        if (type2 == null || (type2 instanceof Class)) {
            return m14559((Class) type2, type);
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
                Class clsM14548 = m14548(parameterizedType);
                Map mapM14555 = m14555(type, clsM14548, null);
                if (mapM14555 != null) {
                    if (mapM14555.isEmpty()) {
                        return true;
                    }
                    Map mapM14556 = m14556(parameterizedType, clsM14548, null);
                    for (TypeVariable typeVariable : mapM14556.keySet()) {
                        TypeVariable typeVariable2 = typeVariable;
                        while (true) {
                            type3 = (Type) mapM14556.get(typeVariable2);
                            if (!(type3 instanceof TypeVariable) || type3.equals(typeVariable2)) {
                                break;
                            }
                            typeVariable2 = (TypeVariable) type3;
                        }
                        while (true) {
                            type4 = (Type) mapM14555.get(typeVariable);
                            if (!(type4 instanceof TypeVariable) || type4.equals(typeVariable)) {
                                break;
                            }
                            typeVariable = (TypeVariable) type4;
                        }
                        if (type3 != null || !(type4 instanceof Class)) {
                            if (type4 == null || type3 == null || type3.equals(type4) || ((type3 instanceof WildcardType) && m14557(type4, type3))) {
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
                if (cls.isArray() && m14557(cls.getComponentType(), genericComponentType)) {
                    return true;
                }
            } else {
                if (type instanceof GenericArrayType) {
                    return m14557(((GenericArrayType) type).getGenericComponentType(), genericComponentType);
                }
                if (type instanceof WildcardType) {
                    for (Type type5 : m14549((WildcardType) type)) {
                        if (m14557(type5, genericArrayType)) {
                            return true;
                        }
                    }
                } else if (type instanceof TypeVariable) {
                    for (Type type6 : m14551((TypeVariable) type)) {
                        if (m14557(type6, genericArrayType)) {
                            return true;
                        }
                    }
                } else if (!(type instanceof ParameterizedType)) {
                    C7546.m12745(type, "found an unhandled type: ");
                    return false;
                }
            }
        } else {
            if (!(type2 instanceof WildcardType)) {
                if (type2 instanceof TypeVariable) {
                    return m14560(type, (TypeVariable) type2);
                }
                C7546.m12745(type2, "found an unhandled type: ");
                return false;
            }
            WildcardType wildcardType = (WildcardType) type2;
            if (type == null || wildcardType.equals(type)) {
                return true;
            }
            Type[] typeArrM14549 = m14549(wildcardType);
            Type[] typeArrM14550 = m14550(wildcardType);
            if (type instanceof WildcardType) {
                WildcardType wildcardType2 = (WildcardType) type;
                Type[] typeArrM145492 = m14549(wildcardType2);
                Type[] typeArrM145502 = m14550(wildcardType2);
                int length = typeArrM14549.length;
                int i = 0;
                loop5: while (true) {
                    if (i >= length) {
                        for (Type type7 : typeArrM14550) {
                            for (Type type8 : typeArrM145502) {
                                if (m14557(type7, type8)) {
                                }
                            }
                        }
                        return true;
                    }
                    Type type9 = typeArrM14549[i];
                    for (Type type10 : typeArrM145492) {
                        if (!m14557(type10, type9)) {
                            break loop5;
                        }
                    }
                    i++;
                }
            } else {
                int length2 = typeArrM14549.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length2) {
                        for (Type type11 : typeArrM14550) {
                            if (m14557(type11, type)) {
                            }
                        }
                        return true;
                    }
                    if (!m14557(type, typeArrM14549[i2])) {
                        break;
                    }
                    i2++;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static Type[] m14558(Type[] typeArr) {
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
                i = (type == type2 || !m14557(type2, type)) ? i + 1 : 0;
            }
        }
        return (Type[]) hashSet.toArray(AbstractC5685.f15616);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x003f A[PHI: r8
  0x003f: PHI (r8v8 java.lang.Class<?>) = (r8v7 java.lang.Class<?>), (r8v7 java.lang.Class<?>), (r8v23 java.lang.Class<?>) binds: [B:16:0x0025, B:18:0x002b, B:22:0x003b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00f9  */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m14559(java.lang.Class r7, java.lang.reflect.Type r8) {
        /*
            Method dump skipped, instruction units count: 367
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p372.AbstractC8972.m14559(java.lang.Class, java.lang.reflect.Type):boolean");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static boolean m14560(Type type, TypeVariable typeVariable) {
        if (type == null) {
            return true;
        }
        if (typeVariable != null) {
            if (typeVariable.equals(type)) {
                return true;
            }
            if (type instanceof TypeVariable) {
                for (Type type2 : m14551((TypeVariable) type)) {
                    if (m14560(type2, typeVariable)) {
                        return true;
                    }
                }
            }
            if (!(type instanceof Class) && !(type instanceof ParameterizedType) && !(type instanceof GenericArrayType) && !(type instanceof WildcardType)) {
                C7546.m12745(type, "found an unhandled type: ");
            }
        }
        return false;
    }
}
