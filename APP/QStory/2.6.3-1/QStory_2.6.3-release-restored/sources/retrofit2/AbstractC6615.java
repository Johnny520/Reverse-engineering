package retrofit2;

import androidx.activity.AbstractC0900;
import androidx.window.area.AbstractC3400;
import bsh.C3466;
import com.kongzue.dialogx.interfaces.RunnableC4574;
import io.ktor.util.C5043;
import java.lang.annotation.Annotation;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;
import kotlin.AbstractC6017;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.AbstractC6227;
import kotlinx.coroutines.C6276;
import lin.xposed.hook.javaplugin.C6385;
import p025.AbstractC7012;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: retrofit2.飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6615 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static Constructor f16223 = null;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static boolean f16224 = true;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final Type[] f16225 = new Type[0];

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static Type m11734(Class cls, Class cls2, Type type) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i = 0; i < length; i++) {
                Class<?> cls3 = interfaces[i];
                if (cls3 == cls2) {
                    return cls.getGenericInterfaces()[i];
                }
                if (cls2.isAssignableFrom(cls3)) {
                    return m11734(interfaces[i], cls2, cls.getGenericInterfaces()[i]);
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
                    return m11734(superclass, cls2, cls.getGenericSuperclass());
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static boolean m11735(Type type, Type type2) {
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
            Type ownerType = parameterizedType.getOwnerType();
            Type ownerType2 = parameterizedType2.getOwnerType();
            return (ownerType == ownerType2 || (ownerType != null && ownerType.equals(ownerType2))) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            if (type2 instanceof GenericArrayType) {
                return m11735(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
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

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static void m11736(Type type) {
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            C6755.m11865();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final Object m11737(InterfaceC6608 interfaceC6608, InterfaceC5189 interfaceC5189) {
        C6276 c6276 = new C6276(1, AbstractC3400.m5624(interfaceC5189));
        c6276.m11102();
        c6276.m11100(new C6617(interfaceC6608, 1));
        interfaceC6608.mo11722(new C6618(c6276, 1));
        Object objM11099 = c6276.m11099();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return objM11099;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final Object m11738(InterfaceC6608 interfaceC6608, InterfaceC5189 interfaceC5189) {
        C6276 c6276 = new C6276(1, AbstractC3400.m5624(interfaceC5189));
        c6276.m11102();
        c6276.m11100(new C6617(interfaceC6608, 0));
        interfaceC6608.mo11722(new C6618(c6276, 0));
        Object objM11099 = c6276.m11099();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return objM11099;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static String m11739(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static IllegalArgumentException m11740(Method method, int i, String str, Object... objArr) {
        return m11741(method, null, str + " (" + AbstractC6591.f16158.mo11716(method, i) + ")", objArr);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static IllegalArgumentException m11741(Method method, Exception exc, String str, Object... objArr) {
        StringBuilder sbM12143 = AbstractC7012.m12143(String.format(str, objArr), "\n    for method ");
        sbM12143.append(method.getDeclaringClass().getSimpleName());
        sbM12143.append(".");
        sbM12143.append(method.getName());
        return new IllegalArgumentException(sbM12143.toString(), exc);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final CoroutineSingletons m11742(Throwable th, InterfaceC5189 interfaceC5189) {
        KotlinExtensions$suspendAndThrow$1 kotlinExtensions$suspendAndThrow$1;
        if (interfaceC5189 instanceof KotlinExtensions$suspendAndThrow$1) {
            kotlinExtensions$suspendAndThrow$1 = (KotlinExtensions$suspendAndThrow$1) interfaceC5189;
            int i = kotlinExtensions$suspendAndThrow$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                kotlinExtensions$suspendAndThrow$1.label = i - Integer.MIN_VALUE;
            } else {
                kotlinExtensions$suspendAndThrow$1 = new KotlinExtensions$suspendAndThrow$1(interfaceC5189);
            }
        }
        Object obj = kotlinExtensions$suspendAndThrow$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = kotlinExtensions$suspendAndThrow$1.label;
        if (i2 == 0) {
            AbstractC6017.m10769(obj);
            kotlinExtensions$suspendAndThrow$1.L$0 = th;
            kotlinExtensions$suspendAndThrow$1.label = 1;
            AbstractC6227.f15375.mo4018(kotlinExtensions$suspendAndThrow$1.getContext(), new RunnableC4574(4, kotlinExtensions$suspendAndThrow$1, th, false));
            return coroutineSingletons;
        }
        if (i2 != 1) {
            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC6017.m10769(obj);
        C5043.m9161();
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static void m11743(Throwable th) {
        if (th instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th);
        }
        if (th instanceof ThreadDeath) {
            throw ((ThreadDeath) th);
        }
        if (th instanceof LinkageError) {
            throw ((LinkageError) th);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static IllegalArgumentException m11744(Method method, Exception exc, int i, String str, Object... objArr) {
        return m11741(method, exc, str + " (" + AbstractC6591.f16158.mo11716(method, i) + ")", objArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003e  */
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Type m11745(Class cls, Type type, Type type2) {
        Type type3;
        Type type4 = type2;
        while (true) {
            int i = 0;
            if (!(type4 instanceof TypeVariable)) {
                if (type4 instanceof Class) {
                    Class cls2 = (Class) type4;
                    if (cls2.isArray()) {
                        Class<?> componentType = cls2.getComponentType();
                        Type typeM11745 = m11745(cls, type, componentType);
                        return componentType == typeM11745 ? cls2 : new C6584(typeM11745);
                    }
                }
                if (type4 instanceof GenericArrayType) {
                    GenericArrayType genericArrayType = (GenericArrayType) type4;
                    Type genericComponentType = genericArrayType.getGenericComponentType();
                    Type typeM117452 = m11745(cls, type, genericComponentType);
                    return genericComponentType == typeM117452 ? genericArrayType : new C6584(typeM117452);
                }
                if (type4 instanceof ParameterizedType) {
                    ParameterizedType parameterizedType = (ParameterizedType) type4;
                    Type ownerType = parameterizedType.getOwnerType();
                    Type typeM117453 = m11745(cls, type, ownerType);
                    boolean z = typeM117453 != ownerType;
                    Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                    int length = actualTypeArguments.length;
                    while (i < length) {
                        Type typeM117454 = m11745(cls, type, actualTypeArguments[i]);
                        if (typeM117454 != actualTypeArguments[i]) {
                            if (!z) {
                                actualTypeArguments = (Type[]) actualTypeArguments.clone();
                                z = true;
                            }
                            actualTypeArguments[i] = typeM117454;
                        }
                        i++;
                    }
                    return z ? new C6632(typeM117453, parameterizedType.getRawType(), actualTypeArguments) : parameterizedType;
                }
                boolean z2 = type4 instanceof WildcardType;
                Type type5 = type4;
                if (z2) {
                    WildcardType wildcardType = (WildcardType) type4;
                    Type[] lowerBounds = wildcardType.getLowerBounds();
                    Type[] upperBounds = wildcardType.getUpperBounds();
                    if (lowerBounds.length == 1) {
                        Type typeM117455 = m11745(cls, type, lowerBounds[0]);
                        type5 = wildcardType;
                        if (typeM117455 != lowerBounds[0]) {
                            return new C6631(new Type[]{Object.class}, new Type[]{typeM117455});
                        }
                    } else {
                        type5 = wildcardType;
                        if (upperBounds.length == 1) {
                            Type typeM117456 = m11745(cls, type, upperBounds[0]);
                            type5 = wildcardType;
                            if (typeM117456 != upperBounds[0]) {
                                return new C6631(new Type[]{typeM117456}, f16225);
                            }
                        }
                    }
                }
                return type5;
            }
            TypeVariable typeVariable = (TypeVariable) type4;
            GenericDeclaration genericDeclaration = typeVariable.getGenericDeclaration();
            Class cls3 = genericDeclaration instanceof Class ? (Class) genericDeclaration : null;
            if (cls3 == null) {
                type3 = typeVariable;
            } else {
                Type typeM11734 = m11734(cls, cls3, type);
                if (typeM11734 instanceof ParameterizedType) {
                    TypeVariable[] typeParameters = cls3.getTypeParameters();
                    while (i < typeParameters.length) {
                        if (typeVariable.equals(typeParameters[i])) {
                            type3 = ((ParameterizedType) typeM11734).getActualTypeArguments()[i];
                        } else {
                            i++;
                        }
                    }
                    C3466.m5896();
                    return null;
                }
            }
            if (type3 == typeVariable) {
                return type3;
            }
            type4 = type3;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static Class m11746(Type type) {
        Objects.requireNonNull(type, "type == null");
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            if (rawType instanceof Class) {
                return (Class) rawType;
            }
            C6755.m11865();
            return null;
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance((Class<?>) m11746(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return m11746(((WildcardType) type).getUpperBounds()[0]);
        }
        StringBuilder sb = new StringBuilder("Expected a Class, ParameterizedType, or GenericArrayType, but <");
        sb.append(type);
        C6385.m11435(sb, "> is of type ", type.getClass().getName());
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static Type m11747(int i, ParameterizedType parameterizedType) {
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        if (i >= 0 && i < actualTypeArguments.length) {
            Type type = actualTypeArguments[i];
            return type instanceof WildcardType ? ((WildcardType) type).getUpperBounds()[0] : type;
        }
        StringBuilder sbM710 = AbstractC0900.m710(i, "Index ", " not in range [0,");
        sbM710.append(actualTypeArguments.length);
        sbM710.append(") for ");
        sbM710.append(parameterizedType);
        throw new IllegalArgumentException(sbM710.toString());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static Object m11748(Method method, Class cls, Object obj, Object[] objArr) throws NoSuchMethodException {
        Constructor declaredConstructor = f16223;
        if (declaredConstructor == null) {
            declaredConstructor = MethodHandles.Lookup.class.getDeclaredConstructor(Class.class, Integer.TYPE);
            declaredConstructor.setAccessible(true);
            f16223 = declaredConstructor;
        }
        return ((MethodHandles.Lookup) declaredConstructor.newInstance(cls, -1)).unreflectSpecial(method, cls).bindTo(obj).invokeWithArguments(objArr);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static boolean m11749(Annotation[] annotationArr, Class cls) {
        for (Annotation annotation : annotationArr) {
            if (cls.isInstance(annotation)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static Type m11750(Class cls, Type type) {
        if (Map.class.isAssignableFrom(cls)) {
            return m11745(cls, type, m11734(cls, Map.class, type));
        }
        C6755.m11865();
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static boolean m11751(Type type) {
        if (type instanceof Class) {
            return false;
        }
        if (!(type instanceof ParameterizedType)) {
            if (type instanceof GenericArrayType) {
                return m11751(((GenericArrayType) type).getGenericComponentType());
            }
            if ((type instanceof TypeVariable) || (type instanceof WildcardType)) {
                return true;
            }
            C6385.m11433("Expected a Class, ParameterizedType, or GenericArrayType, but <", type, "> is of type ", type == null ? "null" : type.getClass().getName());
            return false;
        }
        for (Type type2 : ((ParameterizedType) type).getActualTypeArguments()) {
            if (m11751(type2)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public abstract void mo11710(C6589 c6589, Object obj);
}
