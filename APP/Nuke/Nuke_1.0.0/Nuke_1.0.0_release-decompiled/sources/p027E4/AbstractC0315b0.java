package p027E4;

import com.bumptech.glide.AbstractC1923e;
import java.lang.annotation.Annotation;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;
import p011B4.AbstractC0231b;
import p074O2.InterfaceC1046d;
import p160f3.C2135g;

/* JADX INFO: renamed from: E4.b0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0315b0 {

    /* JADX INFO: renamed from: a */
    public static final Type[] f1038a = new Type[0];

    /* JADX INFO: renamed from: b */
    public static boolean f1039b = true;

    /* JADX INFO: renamed from: c */
    public static Constructor f1040c;

    /* JADX INFO: renamed from: b */
    public static final Object m531b(InterfaceC0318e interfaceC0318e, InterfaceC1046d interfaceC1046d) {
        C2135g c2135g = new C2135g(1, AbstractC1923e.m3448G(interfaceC1046d));
        c2135g.m3968t();
        c2135g.m3970w(new C0335v(interfaceC0318e, 0));
        interfaceC0318e.mo510c(new C0336w(c2135g, 0));
        return c2135g.m3967r();
    }

    /* JADX INFO: renamed from: c */
    public static final Object m532c(InterfaceC0318e interfaceC0318e, InterfaceC1046d interfaceC1046d) {
        C2135g c2135g = new C2135g(1, AbstractC1923e.m3448G(interfaceC1046d));
        c2135g.m3968t();
        c2135g.m3970w(new C0335v(interfaceC0318e, 1));
        interfaceC0318e.mo510c(new C0336w(c2135g, 1));
        return c2135g.m3967r();
    }

    /* JADX INFO: renamed from: d */
    public static void m533d(Type type) {
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            throw new IllegalArgumentException();
        }
    }

    /* JADX INFO: renamed from: e */
    public static boolean m534e(Type type, Type type2) {
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
                return m534e(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
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
    public static Type m535f(Type type, Class cls, Class cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i5 = 0; i5 < length; i5++) {
                Class<?> cls3 = interfaces[i5];
                if (cls3 == cls2) {
                    return cls.getGenericInterfaces()[i5];
                }
                if (cls2.isAssignableFrom(cls3)) {
                    return m535f(cls.getGenericInterfaces()[i5], interfaces[i5], cls2);
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
                    return m535f(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    /* JADX INFO: renamed from: g */
    public static Type m536g(int i5, ParameterizedType parameterizedType) {
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        if (i5 >= 0 && i5 < actualTypeArguments.length) {
            Type type = actualTypeArguments[i5];
            return type instanceof WildcardType ? ((WildcardType) type).getUpperBounds()[0] : type;
        }
        StringBuilder sbM404o = AbstractC0231b.m404o(i5, "Index ", " not in range [0,");
        sbM404o.append(actualTypeArguments.length);
        sbM404o.append(") for ");
        sbM404o.append(parameterizedType);
        throw new IllegalArgumentException(sbM404o.toString());
    }

    /* JADX INFO: renamed from: h */
    public static Class m537h(Type type) {
        Objects.requireNonNull(type, "type == null");
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            if (rawType instanceof Class) {
                return (Class) rawType;
            }
            throw new IllegalArgumentException();
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance((Class<?>) m537h(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return m537h(((WildcardType) type).getUpperBounds()[0]);
        }
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + type.getClass().getName());
    }

    /* JADX INFO: renamed from: i */
    public static Type m538i(Type type, Class cls) {
        if (Map.class.isAssignableFrom(cls)) {
            return m545p(type, cls, m535f(type, cls, Map.class));
        }
        throw new IllegalArgumentException();
    }

    /* JADX INFO: renamed from: j */
    public static boolean m539j(Type type) {
        if (type instanceof Class) {
            return false;
        }
        if (type instanceof ParameterizedType) {
            for (Type type2 : ((ParameterizedType) type).getActualTypeArguments()) {
                if (m539j(type2)) {
                    return true;
                }
            }
            return false;
        }
        if (type instanceof GenericArrayType) {
            return m539j(((GenericArrayType) type).getGenericComponentType());
        }
        if ((type instanceof TypeVariable) || (type instanceof WildcardType)) {
            return true;
        }
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + (type == null ? "null" : type.getClass().getName()));
    }

    /* JADX INFO: renamed from: k */
    public static Object m540k(Method method, Class cls, Object obj, Object[] objArr) throws NoSuchMethodException {
        Constructor declaredConstructor = f1040c;
        if (declaredConstructor == null) {
            declaredConstructor = MethodHandles.Lookup.class.getDeclaredConstructor(Class.class, Integer.TYPE);
            declaredConstructor.setAccessible(true);
            f1040c = declaredConstructor;
        }
        return ((MethodHandles.Lookup) declaredConstructor.newInstance(cls, -1)).unreflectSpecial(method, cls).bindTo(obj).invokeWithArguments(objArr);
    }

    /* JADX INFO: renamed from: l */
    public static boolean m541l(Annotation[] annotationArr, Class cls) {
        for (Annotation annotation : annotationArr) {
            if (cls.isInstance(annotation)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: m */
    public static IllegalArgumentException m542m(Method method, Exception exc, String str, Object... objArr) {
        return new IllegalArgumentException(String.format(str, objArr) + "\n    for method " + method.getDeclaringClass().getSimpleName() + "." + method.getName(), exc);
    }

    /* JADX INFO: renamed from: n */
    public static IllegalArgumentException m543n(Method method, int i5, String str, Object... objArr) {
        return m542m(method, null, str + " (" + AbstractC0300N.f961b.mo516d(method, i5) + ")", objArr);
    }

    /* JADX INFO: renamed from: o */
    public static IllegalArgumentException m544o(Method method, Exception exc, int i5, String str, Object... objArr) {
        return m542m(method, exc, str + " (" + AbstractC0300N.f961b.mo516d(method, i5) + ")", objArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003f  */
    /* JADX INFO: renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.reflect.Type m545p(java.lang.reflect.Type r8, java.lang.Class r9, java.lang.reflect.Type r10) {
        /*
            Method dump skipped, instruction units count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p027E4.AbstractC0315b0.m545p(java.lang.reflect.Type, java.lang.Class, java.lang.reflect.Type):java.lang.reflect.Type");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m546q(java.lang.Throwable r4, p074O2.InterfaceC1046d r5) {
        /*
            boolean r0 = r5 instanceof p027E4.C0337x
            if (r0 == 0) goto L13
            r0 = r5
            E4.x r0 = (p027E4.C0337x) r0
            int r1 = r0.f1066h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1066h = r1
            goto L18
        L13:
            E4.x r0 = new E4.x
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f1065g
            int r1 = r0.f1066h
            r2 = 1
            if (r1 == 0) goto L32
            if (r1 == r2) goto L29
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L29:
            p127Z2.AbstractC1784a.m3205S(r5)
            E4.q r4 = new E4.q
            r4.<init>()
            throw r4
        L32:
            p127Z2.AbstractC1784a.m3205S(r5)
            r0.f1066h = r2
            m3.e r5 = p160f3.AbstractC2100C.f7029a
            O2.i r1 = r0.f3866e
            p117X2.AbstractC1665j.m2982b(r1)
            E4.y r2 = new E4.y
            r3 = 0
            r2.<init>(r3, r0, r4)
            r5.mo1207D(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p027E4.AbstractC0315b0.m546q(java.lang.Throwable, O2.d):void");
    }

    /* JADX INFO: renamed from: r */
    public static void m547r(Throwable th) {
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

    /* JADX INFO: renamed from: s */
    public static String m548s(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo515a(C0303Q c0303q, Object obj);
}
