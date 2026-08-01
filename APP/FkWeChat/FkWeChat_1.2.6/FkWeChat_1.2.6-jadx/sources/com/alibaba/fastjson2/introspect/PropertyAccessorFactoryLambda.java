package com.alibaba.fastjson2.introspect;

import com.alibaba.fastjson2.function.ObjBoolConsumer;
import com.alibaba.fastjson2.function.ObjByteConsumer;
import com.alibaba.fastjson2.function.ObjCharConsumer;
import com.alibaba.fastjson2.function.ObjFloatConsumer;
import com.alibaba.fastjson2.function.ObjShortConsumer;
import com.alibaba.fastjson2.function.ToByteFunction;
import com.alibaba.fastjson2.function.ToCharFunction;
import com.alibaba.fastjson2.function.ToFloatFunction;
import com.alibaba.fastjson2.function.ToShortFunction;
import com.alibaba.fastjson2.util.JDKUtils;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Objects;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.DoubleFunction;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.LongFunction;
import java.util.function.ObjDoubleConsumer;
import java.util.function.ObjIntConsumer;
import java.util.function.ObjLongConsumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;
import p181m4.C4965b;
import p376zd.C9987e;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class PropertyAccessorFactoryLambda extends PropertyAccessorFactory {
    private static final boolean USE_UNSAFE;

    static {
        USE_UNSAFE = JDKUtils.UNSAFE != null;
    }

    public static Class<?> box(Class cls) {
        return cls == Integer.TYPE ? Integer.class : cls == Long.TYPE ? Long.class : cls == Boolean.TYPE ? Boolean.class : cls == Short.TYPE ? Short.class : cls == Byte.TYPE ? Byte.class : cls == Character.TYPE ? Character.class : cls == Float.TYPE ? Float.class : cls == Double.TYPE ? Double.class : cls;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ char m6285d(PropertyAccessorFactoryLambda propertyAccessorFactoryLambda, Method method, Object obj) {
        return (char) propertyAccessorFactoryLambda.getInt(method).applyAsInt(obj);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ short m6286e(PropertyAccessorFactoryLambda propertyAccessorFactoryLambda, Method method, Object obj) {
        return (short) propertyAccessorFactoryLambda.getInt(method).applyAsInt(obj);
    }

    public static boolean isChainableSetter(Method method) {
        return method.getReturnType() == method.getDeclaringClass();
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ float m6292k(ToDoubleFunction toDoubleFunction, Object obj) {
        return (float) toDoubleFunction.applyAsDouble(obj);
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ byte m6293l(PropertyAccessorFactoryLambda propertyAccessorFactoryLambda, Method method, Object obj) {
        return (byte) propertyAccessorFactoryLambda.getInt(method).applyAsInt(obj);
    }

    public static void validateMethodAndParameterType(Method method, Class<?> cls) {
        Class<?>[] parameterTypes = method.getParameterTypes();
        if (parameterTypes.length != 1 || !parameterTypes[0].equals(cls)) {
            throw validateMethodAndParameterTypeError(cls, parameterTypes);
        }
    }

    private static IllegalArgumentException validateMethodAndParameterTypeError(Class<?> cls, Class<?>[] clsArr) {
        StringBuilder sb2 = new StringBuilder("Method parameter type mismatch. Expected: ");
        sb2.append(cls.getSimpleName());
        sb2.append(", Actual: ");
        sb2.append(clsArr.length > 0 ? clsArr[0].getSimpleName() : "no parameters");
        return new IllegalArgumentException(sb2.toString());
    }

    public static void validateMethodAndReturnType(Method method, Class<?> cls) {
        if (!method.getReturnType().equals(cls)) {
            throw validateMethodAndReturnTypeEror(method, cls);
        }
    }

    private static IllegalArgumentException validateMethodAndReturnTypeEror(Method method, Class<?> cls) {
        return new IllegalArgumentException("Method return type mismatch. Expected: " + cls.getSimpleName() + ", Actual: " + method.getReturnType().getSimpleName());
    }

    @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory
    public PropertyAccessor create(String str, Class<?> cls, Type type, Method method, Method method2, BiFunction<PropertyAccessor, Throwable, RuntimeException> biFunction) {
        if (cls == null) {
            if (method != null) {
                cls = method.getReturnType();
            } else {
                Class<?>[] parameterTypes = method2.getParameterTypes();
                if (parameterTypes.length == 1) {
                    cls = parameterTypes[0];
                } else if (parameterTypes.length == 2 && String.class.equals(parameterTypes[0])) {
                    cls = parameterTypes[1];
                }
            }
        }
        Class<?> cls2 = cls;
        if (!(method != null ? method.getDeclaringClass() : method2.getDeclaringClass()).getName().contains("$$Lambda") && (method2 == null || !isChainableSetter(method2))) {
            if (cls2 == Boolean.TYPE) {
                return create(str, getBoolean(method), setBoolean(method2));
            }
            if (JDKUtils.JVM_VERSION == 8) {
                if (cls2 == Byte.TYPE) {
                    return create(str, getByte(method), setByte(method2));
                }
                if (cls2 == Short.TYPE) {
                    return create(str, getShort(method), setShort(method2));
                }
                if (cls2 == Character.TYPE) {
                    return create(str, getChar(method), setChar(method2));
                }
            }
            if (cls2 == Integer.TYPE) {
                return create(str, getInt(method), setInt(method2));
            }
            if (cls2 == Long.TYPE) {
                return create(str, getLong(method), setLong(method2));
            }
            if (cls2 == Float.TYPE) {
                return create(str, getFloat(method), setFloat(method2));
            }
            if (cls2 == Double.TYPE) {
                return create(str, getDouble(method), setDouble(method2));
            }
            if (!cls2.isPrimitive()) {
                if (type == null) {
                    if (method != null) {
                        type = method.getGenericReturnType();
                    } else {
                        Type[] genericParameterTypes = method2.getGenericParameterTypes();
                        if (genericParameterTypes.length == 1) {
                            type = genericParameterTypes[0];
                        } else if (genericParameterTypes.length == 2 && String.class.equals(genericParameterTypes[0])) {
                            type = genericParameterTypes[1];
                        }
                    }
                }
                return create(str, cls2, type, getObject(method), setObject(str, method2), biFunction);
            }
        }
        return super.create(str, cls2, type, method, method2, biFunction);
    }

    @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory
    public BiFunction createBiFunction(Constructor constructor) {
        try {
            Class<?> declaringClass = constructor.getDeclaringClass();
            MethodHandles.Lookup lookupTrustedLookup = JDKUtils.trustedLookup(declaringClass);
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            Class<?> cls = parameterTypes[0];
            Class<?> cls2 = parameterTypes[1];
            return (BiFunction) LambdaMetafactory.metafactory(lookupTrustedLookup, "apply", TypeUtils.METHOD_TYPE_BI_FUNCTION, TypeUtils.METHOD_TYPE_OBJECT_OBJECT_OBJECT, lookupTrustedLookup.findConstructor(declaringClass, MethodType.methodType(Void.TYPE, cls, cls2)), MethodType.methodType(declaringClass, box(cls), box(cls2))).getTarget().invokeExact();
        } catch (Throwable unused) {
            return super.createBiFunction(constructor);
        }
    }

    @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory
    public DoubleFunction createDoubleFunction(Constructor constructor) {
        try {
            Class<?> declaringClass = constructor.getDeclaringClass();
            MethodHandles.Lookup lookupTrustedLookup = JDKUtils.trustedLookup(declaringClass);
            Class<?> cls = constructor.getParameterTypes()[0];
            return (DoubleFunction) LambdaMetafactory.metafactory(lookupTrustedLookup, "apply", TypeUtils.METHOD_TYPE_DOUBLE_FUNCTION, TypeUtils.METHOD_TYPE_OBJECT_DOUBLE, lookupTrustedLookup.findConstructor(declaringClass, MethodType.methodType((Class<?>) Void.TYPE, cls)), MethodType.methodType(declaringClass, box(cls))).getTarget().invokeExact();
        } catch (Throwable unused) {
            return super.createDoubleFunction(constructor);
        }
    }

    @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory
    public Function createFunction(Constructor constructor) {
        try {
            Class<?> declaringClass = constructor.getDeclaringClass();
            MethodHandles.Lookup lookupTrustedLookup = JDKUtils.trustedLookup(declaringClass);
            Class<?> cls = constructor.getParameterTypes()[0];
            return (Function) LambdaMetafactory.metafactory(lookupTrustedLookup, "apply", TypeUtils.METHOD_TYPE_FUNCTION, TypeUtils.METHOD_TYPE_OBJECT_OBJECT, lookupTrustedLookup.findConstructor(declaringClass, MethodType.methodType((Class<?>) Void.TYPE, cls)), MethodType.methodType(declaringClass, box(cls))).getTarget().invokeExact();
        } catch (Throwable unused) {
            return super.createFunction(constructor);
        }
    }

    @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory
    public IntFunction createIntFunction(Constructor constructor) {
        try {
            Class<?> declaringClass = constructor.getDeclaringClass();
            MethodHandles.Lookup lookupTrustedLookup = JDKUtils.trustedLookup(declaringClass);
            Class<?> cls = constructor.getParameterTypes()[0];
            return (IntFunction) LambdaMetafactory.metafactory(lookupTrustedLookup, "apply", TypeUtils.METHOD_TYPE_INT_FUNCTION, TypeUtils.METHOD_TYPE_OBJECT_INT, lookupTrustedLookup.findConstructor(declaringClass, MethodType.methodType((Class<?>) Void.TYPE, cls)), MethodType.methodType(declaringClass, box(cls))).getTarget().invokeExact();
        } catch (Throwable unused) {
            return super.createIntFunction(constructor);
        }
    }

    @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory
    public LongFunction createLongFunction(Constructor constructor) {
        try {
            Class<?> declaringClass = constructor.getDeclaringClass();
            MethodHandles.Lookup lookupTrustedLookup = JDKUtils.trustedLookup(declaringClass);
            Class<?> cls = constructor.getParameterTypes()[0];
            return (LongFunction) LambdaMetafactory.metafactory(lookupTrustedLookup, "apply", TypeUtils.METHOD_TYPE_LONG_FUNCTION, TypeUtils.METHOD_TYPE_OBJECT_LONG, lookupTrustedLookup.findConstructor(declaringClass, MethodType.methodType((Class<?>) Void.TYPE, cls)), MethodType.methodType(declaringClass, box(cls))).getTarget().invokeExact();
        } catch (Throwable unused) {
            return super.createLongFunction(constructor);
        }
    }

    @Override // com.alibaba.fastjson2.introspect.PropertyAccessorFactory
    public Supplier createSupplier(Constructor constructor) {
        try {
            Class<?> declaringClass = constructor.getDeclaringClass();
            MethodHandles.Lookup lookupTrustedLookup = JDKUtils.trustedLookup(declaringClass);
            return (Supplier) LambdaMetafactory.metafactory(lookupTrustedLookup, "get", TypeUtils.METHOD_TYPE_SUPPLIER, TypeUtils.METHOD_TYPE_OBJECT, lookupTrustedLookup.findConstructor(declaringClass, MethodType.methodType(Void.TYPE)), MethodType.methodType(declaringClass)).getTarget().invokeExact();
        } catch (Throwable unused) {
            return super.createSupplier(constructor);
        }
    }

    public Predicate<Object> getBoolean(Method method) {
        if (method == null) {
            return null;
        }
        Class cls = Boolean.TYPE;
        validateMethodAndReturnType(method, cls);
        MethodHandles.Lookup lookup = lookup(method);
        try {
            return (Predicate) LambdaMetafactory.metafactory(lookup, "test", MethodType.methodType(Predicate.class), MethodType.methodType((Class<?>) cls, (Class<?>) Object.class), lookup.unreflect(method), MethodType.methodType((Class<?>) cls, method.getDeclaringClass())).getTarget().invokeExact();
        } catch (Throwable th) {
            C4965b.m20055a("Failed to create lambda for method: ", method, th);
            return null;
        }
    }

    public ToByteFunction<Object> getByte(final Method method) {
        if (method == null) {
            return null;
        }
        return new ToByteFunction() { // from class: com.alibaba.fastjson2.introspect.g
            @Override // com.alibaba.fastjson2.function.ToByteFunction
            public final byte applyAsByte(Object obj) {
                return PropertyAccessorFactoryLambda.m6293l(this.f4564a, method, obj);
            }
        };
    }

    public ToCharFunction<Object> getChar(final Method method) {
        if (method == null) {
            return null;
        }
        return new ToCharFunction() { // from class: com.alibaba.fastjson2.introspect.n
            @Override // com.alibaba.fastjson2.function.ToCharFunction
            public final char applyAsChar(Object obj) {
                return PropertyAccessorFactoryLambda.m6285d(this.f4575a, method, obj);
            }
        };
    }

    public ToDoubleFunction<Object> getDouble(Method method) {
        if (method == null) {
            return null;
        }
        Class cls = Double.TYPE;
        validateMethodAndReturnType(method, cls);
        MethodHandles.Lookup lookup = lookup(method);
        try {
            return (ToDoubleFunction) LambdaMetafactory.metafactory(lookup, "applyAsDouble", MethodType.methodType(ToDoubleFunction.class), MethodType.methodType((Class<?>) cls, (Class<?>) Object.class), lookup.unreflect(method), MethodType.methodType((Class<?>) cls, method.getDeclaringClass())).getTarget().invokeExact();
        } catch (Throwable th) {
            C4965b.m20055a("Failed to create lambda for method: ", method, th);
            return null;
        }
    }

    public ToFloatFunction<Object> getFloat(Method method) {
        if (method == null) {
            return null;
        }
        Class cls = Float.TYPE;
        validateMethodAndReturnType(method, cls);
        MethodHandles.Lookup lookup = lookup(method);
        try {
            final ToDoubleFunction toDoubleFunctionInvokeExact = (ToDoubleFunction) LambdaMetafactory.metafactory(lookup, "applyAsDouble", MethodType.methodType(ToDoubleFunction.class), MethodType.methodType((Class<?>) Double.TYPE, (Class<?>) Object.class), lookup.unreflect(method), MethodType.methodType((Class<?>) cls, method.getDeclaringClass())).getTarget().invokeExact();
            return new ToFloatFunction() { // from class: com.alibaba.fastjson2.introspect.k
                @Override // com.alibaba.fastjson2.function.ToFloatFunction
                public final float applyAsFloat(Object obj) {
                    return PropertyAccessorFactoryLambda.m6292k(toDoubleFunctionInvokeExact, obj);
                }
            };
        } catch (Throwable th) {
            C4965b.m20055a("Failed to create lambda for method: ", method, th);
            return null;
        }
    }

    public ToIntFunction<Object> getInt(Method method) {
        if (method == null) {
            return null;
        }
        Class<?> returnType = method.getReturnType();
        Class cls = Integer.TYPE;
        if (!returnType.equals(cls) && !returnType.equals(Short.TYPE) && !returnType.equals(Byte.TYPE) && !returnType.equals(Character.TYPE)) {
            throw validateMethodAndReturnTypeEror(method, cls);
        }
        MethodHandles.Lookup lookup = lookup(method);
        try {
            return (ToIntFunction) LambdaMetafactory.metafactory(lookup, "applyAsInt", MethodType.methodType(ToIntFunction.class), MethodType.methodType((Class<?>) cls, (Class<?>) Object.class), lookup.unreflect(method), MethodType.methodType((Class<?>) cls, method.getDeclaringClass())).getTarget().invokeExact();
        } catch (Throwable th) {
            C4965b.m20055a("Failed to create lambda for method: ", method, th);
            return null;
        }
    }

    public ToLongFunction<Object> getLong(Method method) {
        if (method == null) {
            return null;
        }
        Class cls = Long.TYPE;
        validateMethodAndReturnType(method, cls);
        MethodHandles.Lookup lookup = lookup(method);
        try {
            return (ToLongFunction) LambdaMetafactory.metafactory(lookup, "applyAsLong", MethodType.methodType(ToLongFunction.class), MethodType.methodType((Class<?>) cls, (Class<?>) Object.class), lookup.unreflect(method), MethodType.methodType((Class<?>) cls, method.getDeclaringClass())).getTarget().invokeExact();
        } catch (Throwable th) {
            C4965b.m20055a("Failed to create lambda for method: ", method, th);
            return null;
        }
    }

    public Function<Object, Object> getObject(Method method) {
        if (method == null) {
            return null;
        }
        MethodHandles.Lookup lookupTrustedLookup = JDKUtils.trustedLookup(method.getDeclaringClass());
        try {
            return (Function) LambdaMetafactory.metafactory(lookupTrustedLookup, "apply", MethodType.methodType(Function.class), MethodType.methodType((Class<?>) Object.class, (Class<?>) Object.class), lookupTrustedLookup.unreflect(method), MethodType.methodType(method.getReturnType(), method.getDeclaringClass())).getTarget().invokeExact();
        } catch (Throwable th) {
            C4965b.m20055a("Failed to create lambda for method: ", method, th);
            return null;
        }
    }

    public ToShortFunction<Object> getShort(final Method method) {
        if (method == null) {
            return null;
        }
        return new ToShortFunction() { // from class: com.alibaba.fastjson2.introspect.l
            @Override // com.alibaba.fastjson2.function.ToShortFunction
            public final short applyAsShort(Object obj) {
                return PropertyAccessorFactoryLambda.m6286e(this.f4572a, method, obj);
            }
        };
    }

    public MethodHandles.Lookup lookup(Class<?> cls) {
        return USE_UNSAFE ? JDKUtils.trustedLookup(cls) : MethodHandles.lookup().in(cls);
    }

    public ObjBoolConsumer setBoolean(Method method) {
        if (method == null) {
            return null;
        }
        validateMethodAndParameterType(method, Boolean.TYPE);
        MethodHandles.Lookup lookup = lookup(method);
        try {
            MethodHandle methodHandleUnreflect = lookup.unreflect(method);
            MethodType methodType = MethodType.methodType(BiConsumer.class);
            Class cls = Void.TYPE;
            final BiConsumer biConsumerInvokeExact = (BiConsumer) LambdaMetafactory.metafactory(lookup, "accept", methodType, MethodType.methodType(cls, Object.class, Object.class), methodHandleUnreflect, MethodType.methodType(cls, method.getDeclaringClass(), Boolean.class)).getTarget().invokeExact();
            Objects.requireNonNull(biConsumerInvokeExact);
            return new ObjBoolConsumer() { // from class: com.alibaba.fastjson2.introspect.m
                @Override // com.alibaba.fastjson2.function.ObjBoolConsumer
                public final void accept(Object obj, boolean z10) {
                    biConsumerInvokeExact.accept(obj, Boolean.valueOf(z10));
                }
            };
        } catch (Throwable th) {
            C4965b.m20055a("Failed to create lambda for method: ", method, th);
            return null;
        }
    }

    public ObjByteConsumer<Object> setByte(final Method method) {
        if (method == null) {
            return null;
        }
        return new ObjByteConsumer() { // from class: com.alibaba.fastjson2.introspect.i
            @Override // com.alibaba.fastjson2.function.ObjByteConsumer
            public final void accept(Object obj, byte b10) {
                this.f4568a.setInt(method).accept(obj, b10);
            }
        };
    }

    public ObjCharConsumer<Object> setChar(final Method method) {
        if (method == null) {
            return null;
        }
        return new ObjCharConsumer() { // from class: com.alibaba.fastjson2.introspect.f
            @Override // com.alibaba.fastjson2.function.ObjCharConsumer
            public final void accept(Object obj, char c10) {
                this.f4562a.setInt(method).accept(obj, c10);
            }
        };
    }

    public ObjDoubleConsumer<Object> setDouble(Method method) {
        if (method == null) {
            return null;
        }
        Class cls = Double.TYPE;
        validateMethodAndParameterType(method, cls);
        MethodHandles.Lookup lookup = lookup(method);
        try {
            MethodHandle methodHandleUnreflect = lookup.unreflect(method);
            MethodType methodType = MethodType.methodType(ObjDoubleConsumer.class);
            Class cls2 = Void.TYPE;
            return (ObjDoubleConsumer) LambdaMetafactory.metafactory(lookup, "accept", methodType, MethodType.methodType(cls2, Object.class, cls), methodHandleUnreflect, MethodType.methodType(cls2, method.getDeclaringClass(), cls)).getTarget().invokeExact();
        } catch (Throwable th) {
            C4965b.m20055a("Failed to create lambda for method: ", method, th);
            return null;
        }
    }

    public ObjFloatConsumer setFloat(Method method) {
        if (method == null) {
            return null;
        }
        validateMethodAndParameterType(method, Float.TYPE);
        MethodHandles.Lookup lookup = lookup(method);
        try {
            MethodHandle methodHandleUnreflect = lookup.unreflect(method);
            MethodType methodType = MethodType.methodType(BiConsumer.class);
            Class cls = Void.TYPE;
            final BiConsumer biConsumerInvokeExact = (BiConsumer) LambdaMetafactory.metafactory(lookup, "accept", methodType, MethodType.methodType(cls, Object.class, Object.class), methodHandleUnreflect, MethodType.methodType(cls, method.getDeclaringClass(), Float.class)).getTarget().invokeExact();
            return new ObjFloatConsumer() { // from class: com.alibaba.fastjson2.introspect.j
                @Override // com.alibaba.fastjson2.function.ObjFloatConsumer
                public final void accept(Object obj, float f10) {
                    biConsumerInvokeExact.accept(obj, Float.valueOf(f10));
                }
            };
        } catch (Throwable th) {
            C4965b.m20055a("Failed to create lambda for method: ", method, th);
            return null;
        }
    }

    public ObjIntConsumer<Object> setInt(Method method) {
        if (method == null) {
            return null;
        }
        Class<?>[] parameterTypes = method.getParameterTypes();
        int length = parameterTypes.length;
        Class cls = Integer.TYPE;
        if (length == 1) {
            Class<?> cls2 = parameterTypes[0];
            if (cls2.equals(cls) || cls2.equals(Short.TYPE) || cls2.equals(Byte.TYPE) || cls2.equals(Character.TYPE)) {
                MethodHandles.Lookup lookup = lookup(method);
                try {
                    MethodHandle methodHandleUnreflect = lookup.unreflect(method);
                    MethodType methodType = MethodType.methodType(ObjIntConsumer.class);
                    Class cls3 = Void.TYPE;
                    return (ObjIntConsumer) LambdaMetafactory.metafactory(lookup, "accept", methodType, MethodType.methodType(cls3, Object.class, cls), methodHandleUnreflect, MethodType.methodType(cls3, method.getDeclaringClass(), cls2)).getTarget().invokeExact();
                } catch (Throwable th) {
                    C4965b.m20055a("Failed to create lambda for method: ", method, th);
                    return null;
                }
            }
        }
        throw validateMethodAndParameterTypeError(cls, parameterTypes);
    }

    public ObjLongConsumer<Object> setLong(Method method) {
        if (method == null) {
            return null;
        }
        Class cls = Long.TYPE;
        validateMethodAndParameterType(method, cls);
        MethodHandles.Lookup lookup = lookup(method);
        try {
            MethodHandle methodHandleUnreflect = lookup.unreflect(method);
            MethodType methodType = MethodType.methodType(ObjLongConsumer.class);
            Class cls2 = Void.TYPE;
            return (ObjLongConsumer) LambdaMetafactory.metafactory(lookup, "accept", methodType, MethodType.methodType(cls2, Object.class, cls), methodHandleUnreflect, MethodType.methodType(cls2, method.getDeclaringClass(), cls)).getTarget().invokeExact();
        } catch (Throwable th) {
            C4965b.m20055a("Failed to create lambda for method: ", method, th);
            return null;
        }
    }

    public BiConsumer<Object, Object> setObject(final String str, Method method) {
        if (method == null) {
            return null;
        }
        MethodHandles.Lookup lookup = lookup(method);
        Class<?>[] parameterTypes = method.getParameterTypes();
        int length = parameterTypes.length;
        Class cls = Void.TYPE;
        if (length == 2 && parameterTypes[0].equals(String.class)) {
            try {
                final BiFunction biFunctionInvokeExact = (BiFunction) LambdaMetafactory.metafactory(lookup, "accept", MethodType.methodType(BiFunction.class), MethodType.methodType(cls, Object.class, Object.class, Object.class), lookup.unreflect(method), MethodType.methodType(cls, method.getDeclaringClass(), String.class, method.getParameterTypes()[1])).getTarget().invokeExact();
                return new BiConsumer() { // from class: com.alibaba.fastjson2.introspect.h
                    @Override // java.util.function.BiConsumer
                    public final void accept(Object obj, Object obj2) {
                        biFunctionInvokeExact.apply(str, obj2);
                    }
                };
            } catch (Throwable th) {
                C4965b.m20055a("Failed to create lambda for method: ", method, th);
                return null;
            }
        }
        if (parameterTypes.length != 1) {
            C9987e.m38645a("Method must have exactly one parameter");
            return null;
        }
        try {
            return (BiConsumer) LambdaMetafactory.metafactory(lookup, "accept", MethodType.methodType(BiConsumer.class), MethodType.methodType(cls, Object.class, Object.class), lookup.unreflect(method), MethodType.methodType(cls, method.getDeclaringClass(), method.getParameterTypes()[0])).getTarget().invokeExact();
        } catch (Throwable th2) {
            C4965b.m20055a("Failed to create lambda for method: ", method, th2);
            return null;
        }
    }

    public ObjShortConsumer<Object> setShort(final Method method) {
        if (method == null) {
            return null;
        }
        return new ObjShortConsumer() { // from class: com.alibaba.fastjson2.introspect.e
            @Override // com.alibaba.fastjson2.function.ObjShortConsumer
            public final void accept(Object obj, short s10) {
                this.f4560a.setInt(method).accept(obj, s10);
            }
        };
    }

    private MethodHandles.Lookup lookup(Method method) {
        return lookup(method.getDeclaringClass());
    }

    public PropertyAccessor createSupplier(String str, Method method, Method method2) {
        return super.create(str, (Class<?>) null, (Type) null, method, method2);
    }

    public BiConsumer<Object, Object> setObject(Method method) {
        return setObject(null, method);
    }
}
