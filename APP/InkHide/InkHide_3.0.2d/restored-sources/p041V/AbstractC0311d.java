package p041V;

import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.Objects;
import p022L.AbstractC0174d;

/* JADX INFO: renamed from: V.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0311d {

    /* JADX INFO: renamed from: a */
    public static final Type[] f684a = new Type[0];

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static Type m539a(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            return cls.isArray() ? new C0308a(m539a(cls.getComponentType())) : cls;
        }
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            return new C0309b(parameterizedType.getOwnerType(), parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            return new C0308a(((GenericArrayType) type).getGenericComponentType());
        }
        if (!(type instanceof WildcardType)) {
            return type;
        }
        WildcardType wildcardType = (WildcardType) type;
        return new C0310c(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static void m540b(boolean z2) {
        if (!z2) {
            throw new IllegalArgumentException();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static void m541c(Type type) {
        m540b(((type instanceof Class) && ((Class) type).isPrimitive()) ? false : true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static boolean m542d(Type type, Type type2) {
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
            return Objects.equals(parameterizedType.getOwnerType(), parameterizedType2.getOwnerType()) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            if (type2 instanceof GenericArrayType) {
                return m542d(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
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
    /* JADX INFO: renamed from: e */
    public static void m543e(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static Type m544f(Type type, Class cls, Class cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i2 = 0; i2 < length; i2++) {
                Class<?> cls3 = interfaces[i2];
                if (cls3 == cls2) {
                    return cls.getGenericInterfaces()[i2];
                }
                if (cls2.isAssignableFrom(cls3)) {
                    return m544f(cls.getGenericInterfaces()[i2], interfaces[i2], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<?> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return m544f(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static Class m545g(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            m540b(rawType instanceof Class);
            return (Class) rawType;
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance((Class<?>) m545g(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return m545g(((WildcardType) type).getUpperBounds()[0]);
        }
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + (type == null ? "null" : type.getClass().getName()));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static SimpleDateFormat m546h(int i2, int i3) {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder();
        if (i2 == 0) {
            str = "EEEE, MMMM d, yyyy";
        } else if (i2 == 1) {
            str = "MMMM d, yyyy";
        } else if (i2 == 2) {
            str = "MMM d, yyyy";
        } else {
            if (i2 != 3) {
                throw new IllegalArgumentException(AbstractC0174d.m351g(i2, "Unknown DateFormat style: "));
            }
            str = "M/d/yy";
        }
        sb.append(str);
        sb.append(" ");
        if (i3 == 0 || i3 == 1) {
            str2 = "h:mm:ss a z";
        } else if (i3 == 2) {
            str2 = "h:mm:ss a";
        } else {
            if (i3 != 3) {
                throw new IllegalArgumentException(AbstractC0174d.m351g(i3, "Unknown DateFormat style: "));
            }
            str2 = "h:mm a";
        }
        sb.append(str2);
        return new SimpleDateFormat(sb.toString(), Locale.US);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:57:0x00d4 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:86:0x0058 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:88:? */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x013b A[EDGE_INSN: B:85:0x013b->B:79:0x013b BREAK  A[LOOP:0: B:3:0x0004->B:88:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[LOOP:0: B:3:0x0004->B:88:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r11v10, types: [java.lang.Object, java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v17, types: [java.lang.reflect.Type[]] */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.reflect.WildcardType] */
    /* JADX WARN: Type inference failed for: r11v3, types: [V.c] */
    /* JADX WARN: Type inference failed for: r11v4, types: [V.c] */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.lang.reflect.ParameterizedType] */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.reflect.GenericArrayType] */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX INFO: renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Type m547i(Type type, Class cls, Type type2, HashMap map) {
        Type typeM547i;
        Type c0309b;
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
                GenericDeclaration genericDeclaration = typeVariable2.getGenericDeclaration();
                Class cls3 = genericDeclaration instanceof Class ? (Class) genericDeclaration : null;
                if (cls3 == null) {
                    type2 = typeVariable2;
                    if (type2 != typeVariable2) {
                        break;
                    }
                } else {
                    Type typeM544f = m544f(type, cls, cls3);
                    if (typeM544f instanceof ParameterizedType) {
                        TypeVariable[] typeParameters = cls3.getTypeParameters();
                        int length = typeParameters.length;
                        for (int i2 = 0; i2 < length; i2++) {
                            if (typeVariable2.equals(typeParameters[i2])) {
                                type2 = ((ParameterizedType) typeM544f).getActualTypeArguments()[i2];
                            }
                        }
                        throw new NoSuchElementException();
                    }
                    if (type2 != typeVariable2) {
                    }
                }
            } else if (type2 instanceof Class) {
                Class cls4 = (Class) type2;
                if (cls4.isArray()) {
                    Class<?> componentType = cls4.getComponentType();
                    Type typeM547i2 = m547i(type, cls, componentType, map);
                    if (Objects.equals(componentType, typeM547i2)) {
                        type2 = cls4;
                    } else {
                        c0309b = new C0308a(typeM547i2);
                        type2 = c0309b;
                    }
                } else if (type2 instanceof GenericArrayType) {
                    type2 = (GenericArrayType) type2;
                    Type genericComponentType = type2.getGenericComponentType();
                    Type typeM547i3 = m547i(type, cls, genericComponentType, map);
                    if (!Objects.equals(genericComponentType, typeM547i3)) {
                        c0309b = new C0308a(typeM547i3);
                        type2 = c0309b;
                    }
                } else if (type2 instanceof ParameterizedType) {
                    type2 = (ParameterizedType) type2;
                    Type ownerType = type2.getOwnerType();
                    Type typeM547i4 = m547i(type, cls, ownerType, map);
                    boolean z2 = !Objects.equals(typeM547i4, ownerType);
                    Type[] actualTypeArguments = type2.getActualTypeArguments();
                    int length2 = actualTypeArguments.length;
                    for (int i3 = 0; i3 < length2; i3++) {
                        Type typeM547i5 = m547i(type, cls, actualTypeArguments[i3], map);
                        if (!Objects.equals(typeM547i5, actualTypeArguments[i3])) {
                            if (!z2) {
                                actualTypeArguments = (Type[]) actualTypeArguments.clone();
                                z2 = true;
                            }
                            actualTypeArguments[i3] = typeM547i5;
                        }
                    }
                    if (z2) {
                        c0309b = new C0309b(typeM547i4, type2.getRawType(), actualTypeArguments);
                        type2 = c0309b;
                    }
                } else if (type2 instanceof WildcardType) {
                    type2 = (WildcardType) type2;
                    Type[] lowerBounds = type2.getLowerBounds();
                    Type[] upperBounds = type2.getUpperBounds();
                    if (lowerBounds.length == 1) {
                        Type typeM547i6 = m547i(type, cls, lowerBounds[0], map);
                        if (typeM547i6 != lowerBounds[0]) {
                            type2 = new C0310c(new Type[]{Object.class}, typeM547i6 instanceof WildcardType ? ((WildcardType) typeM547i6).getLowerBounds() : new Type[]{typeM547i6});
                        }
                    } else if (upperBounds.length == 1 && (typeM547i = m547i(type, cls, upperBounds[0], map)) != upperBounds[0]) {
                        type2 = new C0310c(typeM547i instanceof WildcardType ? ((WildcardType) typeM547i).getUpperBounds() : new Type[]{typeM547i}, f684a);
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
    /* JADX INFO: renamed from: j */
    public static String m548j(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public static Class m549k(Class cls) {
        return cls == Integer.TYPE ? Integer.class : cls == Float.TYPE ? Float.class : cls == Byte.TYPE ? Byte.class : cls == Double.TYPE ? Double.class : cls == Long.TYPE ? Long.class : cls == Character.TYPE ? Character.class : cls == Boolean.TYPE ? Boolean.class : cls == Short.TYPE ? Short.class : cls == Void.TYPE ? Void.class : cls;
    }
}
