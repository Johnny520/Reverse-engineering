package p309;

import androidx.collection.C1123;
import com.alibaba.fastjson2.C3775;
import com.alibaba.fastjson2.reader.AbstractC3630;
import com.alibaba.fastjson2.reader.C3541;
import com.alibaba.fastjson2.reader.C3542;
import com.alibaba.fastjson2.reader.C3544;
import com.alibaba.fastjson2.reader.C3556;
import com.alibaba.fastjson2.reader.C3560;
import com.alibaba.fastjson2.reader.C3563;
import com.alibaba.fastjson2.reader.C3566;
import com.alibaba.fastjson2.reader.C3571;
import com.alibaba.fastjson2.util.AbstractC3687;
import com.alibaba.fastjson2.util.AbstractC3700;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.math.BigDecimal;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.LongFunction;
import java.util.function.Supplier;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;
import p307.AbstractC9280;
import p307.AbstractC9366;
import p307.C9270;
import p307.C9273;
import p307.C9275;
import p307.C9283;
import p307.C9284;
import p307.C9286;
import p307.C9303;
import p307.C9308;
import p307.C9315;
import p307.C9367;

/* JADX INFO: renamed from: 飘花落叶言楪子哲苏世兰.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9396 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static volatile boolean f24257;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static LongFunction m14697(Constructor constructor) {
        try {
            Class<?> declaringClass = constructor.getDeclaringClass();
            MethodHandles.Lookup lookupM6328 = AbstractC3687.m6328(declaringClass);
            return (LongFunction) LambdaMetafactory.metafactory(lookupM6328, "apply", AbstractC3700.f9412, AbstractC3700.f9397, lookupM6328.findConstructor(declaringClass, AbstractC3700.f9401), MethodType.methodType(declaringClass, (Class<?>) Long.TYPE)).getTarget().invokeExact();
        } catch (Throwable unused) {
            return new C9392(constructor);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static Function m14698(Method method) {
        Class<?> cls;
        Class<?> declaringClass = method.getDeclaringClass();
        int modifiers = method.getModifiers();
        Class<?>[] parameterTypes = method.getParameterTypes();
        boolean zIsStatic = Modifier.isStatic(modifiers);
        Class<?> returnType = method.getReturnType();
        if (parameterTypes.length == 1 && zIsStatic) {
            cls = parameterTypes[0];
        } else {
            if (parameterTypes.length != 0 || zIsStatic) {
                C3775.m6964(method, "not support parameters ");
                return null;
            }
            cls = declaringClass;
        }
        try {
            MethodHandles.Lookup lookupM6328 = AbstractC3687.m6328(declaringClass);
            return (Function) LambdaMetafactory.metafactory(lookupM6328, "apply", AbstractC3700.f9409, AbstractC3700.f9405, zIsStatic ? lookupM6328.findStatic(declaringClass, method.getName(), MethodType.methodType(returnType, cls)) : lookupM6328.findVirtual(declaringClass, method.getName(), MethodType.methodType(returnType)), MethodType.methodType(returnType, cls)).getTarget().invokeExact();
        } catch (Throwable unused) {
            return !Modifier.isStatic(method.getModifiers()) ? new C9393(method, 1) : new C9393(method, 0);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static Function m14699(Constructor constructor) {
        int i = 0;
        try {
            Class<?> declaringClass = constructor.getDeclaringClass();
            MethodHandles.Lookup lookupM6328 = AbstractC3687.m6328(declaringClass);
            Class<?> cls = constructor.getParameterTypes()[0];
            return (Function) LambdaMetafactory.metafactory(lookupM6328, "apply", AbstractC3700.f9409, AbstractC3700.f9405, lookupM6328.findConstructor(declaringClass, MethodType.methodType((Class<?>) Void.TYPE, cls)), MethodType.methodType(declaringClass, (Class<?>) m14702(cls))).getTarget().invokeExact();
        } catch (Throwable unused) {
            return new C9394(constructor, i);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static BiFunction m14700(Method method) {
        MethodType methodType;
        MethodHandle methodHandle;
        try {
            Class<?> declaringClass = method.getDeclaringClass();
            Class<?> returnType = method.getReturnType();
            MethodHandles.Lookup lookupM6328 = AbstractC3687.m6328(declaringClass);
            Class<?>[] parameterTypes = method.getParameterTypes();
            Class<?> cls = parameterTypes[0];
            if (Modifier.isStatic(method.getModifiers())) {
                Class<?> cls2 = parameterTypes[1];
                MethodHandle methodHandleFindStatic = lookupM6328.findStatic(declaringClass, method.getName(), MethodType.methodType(returnType, cls, cls2));
                methodType = MethodType.methodType(returnType, cls, cls2);
                methodHandle = methodHandleFindStatic;
            } else {
                MethodHandle methodHandleFindVirtual = lookupM6328.findVirtual(declaringClass, method.getName(), MethodType.methodType(returnType, cls));
                methodType = MethodType.methodType(returnType, declaringClass, m14702(cls));
                methodHandle = methodHandleFindVirtual;
            }
            return (BiFunction) LambdaMetafactory.metafactory(lookupM6328, "apply", AbstractC3700.f9404, AbstractC3700.f9402, methodHandle, methodType).getTarget().invokeExact();
        } catch (Throwable unused) {
            return new C9395(method, 1);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static BiFunction m14701(Constructor constructor) {
        try {
            Class<?> declaringClass = constructor.getDeclaringClass();
            MethodHandles.Lookup lookupM6328 = AbstractC3687.m6328(declaringClass);
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            Class<?> cls = parameterTypes[0];
            Class<?> cls2 = parameterTypes[1];
            return (BiFunction) LambdaMetafactory.metafactory(lookupM6328, "apply", AbstractC3700.f9404, AbstractC3700.f9402, lookupM6328.findConstructor(declaringClass, MethodType.methodType(Void.TYPE, cls, cls2)), MethodType.methodType(declaringClass, m14702(cls), m14702(cls2))).getTarget().invokeExact();
        } catch (Throwable unused) {
            return new C9395(constructor, 0);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static Class m14702(Class cls) {
        return cls == Integer.TYPE ? Integer.class : cls == Long.TYPE ? Long.class : cls == Boolean.TYPE ? Boolean.class : cls == Short.TYPE ? Short.class : cls == Byte.TYPE ? Byte.class : cls == Character.TYPE ? Character.class : cls == Float.TYPE ? Float.class : cls == Double.TYPE ? Double.class : cls;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static ToIntFunction m14703(Method method) {
        Class<?> declaringClass = method.getDeclaringClass();
        try {
            MethodHandles.Lookup lookupM6328 = AbstractC3687.m6328(declaringClass);
            Class cls = Integer.TYPE;
            return (ToIntFunction) LambdaMetafactory.metafactory(lookupM6328, "applyAsInt", AbstractC3700.f9413, AbstractC3700.f9406, lookupM6328.findVirtual(declaringClass, method.getName(), MethodType.methodType(cls)), MethodType.methodType((Class<?>) cls, declaringClass)).getTarget().invokeExact();
        } catch (Throwable unused) {
            return new C9390(method);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static Supplier m14704(Method method) {
        try {
            Class<?> declaringClass = method.getDeclaringClass();
            Class<?> returnType = method.getReturnType();
            MethodHandles.Lookup lookupM6328 = AbstractC3687.m6328(declaringClass);
            return (Supplier) LambdaMetafactory.metafactory(lookupM6328, "get", AbstractC3700.f9410, AbstractC3700.f9408, lookupM6328.findStatic(declaringClass, method.getName(), MethodType.methodType(returnType)), MethodType.methodType(returnType)).getTarget().invokeExact();
        } catch (Throwable unused) {
            return new C9391(method);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x00cf, code lost:
    
        if (r1.equals("gnu.trove.list.array.TDoubleArrayList") == false) goto L53;
     */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static AbstractC9280 m14705(Class cls) {
        if (!f24257) {
            String name = cls.getName();
            if (!name.equals("com.carrotsearch.hppc.LongHashSet")) {
                if (!name.equals("gnu.trove.set.hash.TShortHashSet")) {
                    if (!name.equals("com.carrotsearch.hppc.CharHashSet") && !name.equals("com.carrotsearch.hppc.CharArrayList")) {
                        if (!name.equals("com.carrotsearch.hppc.IntArrayList")) {
                            if (!name.equals("gnu.trove.list.array.TLongArrayList")) {
                                if (name.equals("com.carrotsearch.hppc.BitSet")) {
                                    MethodHandles.Lookup lookupM6328 = AbstractC3687.m6328(cls);
                                    try {
                                        ToLongFunction toLongFunctionM14706 = m14706(cls.getMethod("size", null));
                                        BiFunction biFunctionInvokeExact = (BiFunction) LambdaMetafactory.metafactory(lookupM6328, "apply", MethodType.methodType(BiFunction.class), MethodType.methodType(Object.class, Object.class, Object.class), lookupM6328.findVirtual(cls, "get", MethodType.methodType((Class<?>) Boolean.TYPE, (Class<?>) Integer.TYPE)), MethodType.methodType(Boolean.class, cls, Integer.class)).getTarget().invokeExact();
                                        C9308 c9308 = AbstractC9366.f24121;
                                        return new C9315(new C9367(toLongFunctionM14706), 1, biFunctionInvokeExact);
                                    } catch (Throwable unused) {
                                        f24257 = true;
                                        return null;
                                    }
                                }
                                if (!name.equals("gnu.trove.list.array.TShortArrayList")) {
                                    if (!name.equals("gnu.trove.set.hash.TIntHashSet")) {
                                        if (!name.equals("com.carrotsearch.hppc.ShortArrayList")) {
                                            if (!name.equals("com.carrotsearch.hppc.DoubleArrayList")) {
                                                if (!name.equals("com.carrotsearch.hppc.ByteArrayList")) {
                                                    if (!name.equals("gnu.trove.set.hash.TLongHashSet")) {
                                                        if (!name.equals("gnu.trove.list.array.TCharArrayList")) {
                                                            if (!name.equals("gnu.trove.list.array.TFloatArrayList")) {
                                                                if (!name.equals("gnu.trove.stack.array.TByteArrayStack")) {
                                                                    if (!name.equals("com.carrotsearch.hppc.FloatArrayList")) {
                                                                        if (!name.equals("com.carrotsearch.hppc.IntHashSet") && !name.equals("gnu.trove.list.array.TIntArrayList")) {
                                                                            if (!name.equals("gnu.trove.list.array.TByteArrayList")) {
                                                                                if (name.equals("org.bson.types.Decimal128")) {
                                                                                    try {
                                                                                        Function functionM14698 = m14698(cls.getMethod("bigDecimalValue", null));
                                                                                        C9308 c93082 = AbstractC9366.f24121;
                                                                                        return new C9315(null, 0, functionM14698);
                                                                                    } catch (NoSuchMethodException | SecurityException e) {
                                                                                        C1123.m1403("illegal state", e);
                                                                                        return null;
                                                                                    }
                                                                                }
                                                                                if (!name.equals("gnu.trove.set.hash.TByteHashSet")) {
                                                                                    if (!name.equals("com.carrotsearch.hppc.LongArrayList")) {
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            try {
                                                                Function functionM146982 = m14698(cls.getMethod("toArray", null));
                                                                C9308 c93083 = AbstractC9366.f24121;
                                                                return new C9286(functionM146982);
                                                            } catch (NoSuchMethodException | SecurityException e2) {
                                                                C1123.m1403("illegal state", e2);
                                                                return null;
                                                            }
                                                        }
                                                    }
                                                }
                                                try {
                                                    Function functionM146983 = m14698(cls.getMethod("toArray", null));
                                                    C9308 c93084 = AbstractC9366.f24121;
                                                    return new C9270(functionM146983);
                                                } catch (NoSuchMethodException | SecurityException e3) {
                                                    C1123.m1403("illegal state", e3);
                                                    return null;
                                                }
                                            }
                                            try {
                                                Function functionM146984 = m14698(cls.getMethod("toArray", null));
                                                C9308 c93085 = AbstractC9366.f24121;
                                                return new C9283(functionM146984);
                                            } catch (NoSuchMethodException | SecurityException e4) {
                                                C1123.m1403("illegal state", e4);
                                                return null;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        try {
                            Function functionM146985 = m14698(cls.getMethod("toArray", null));
                            C9308 c93086 = AbstractC9366.f24121;
                            return new C9273(functionM146985);
                        } catch (NoSuchMethodException | SecurityException e5) {
                            C1123.m1403("illegal state", e5);
                            return null;
                        }
                    }
                    try {
                        Function functionM146986 = m14698(cls.getMethod("toArray", null));
                        C9308 c93087 = AbstractC9366.f24121;
                        return new C9303(functionM146986);
                    } catch (NoSuchMethodException | SecurityException e6) {
                        C1123.m1403("illegal state", e6);
                        return null;
                    }
                }
                try {
                    Function functionM146987 = m14698(cls.getMethod("toArray", null));
                    C9308 c93088 = AbstractC9366.f24121;
                    return new C9284(functionM146987);
                } catch (NoSuchMethodException | SecurityException e7) {
                    C1123.m1403("illegal state", e7);
                    return null;
                }
            }
            try {
                Function functionM146988 = m14698(cls.getMethod("toArray", null));
                C9308 c93089 = AbstractC9366.f24121;
                return new C9275(functionM146988);
            } catch (NoSuchMethodException | SecurityException e8) {
                C1123.m1403("illegal state", e8);
                return null;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static ToLongFunction m14706(Method method) {
        Class<?> declaringClass = method.getDeclaringClass();
        try {
            MethodHandles.Lookup lookupM6328 = AbstractC3687.m6328(declaringClass);
            Class cls = Long.TYPE;
            return (ToLongFunction) LambdaMetafactory.metafactory(lookupM6328, "applyAsLong", AbstractC3700.f9414, AbstractC3700.f9398, lookupM6328.findVirtual(declaringClass, method.getName(), MethodType.methodType(cls)), MethodType.methodType((Class<?>) cls, declaringClass)).getTarget().invokeExact();
        } catch (Throwable unused) {
            return new C9397(method);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static AbstractC3630 m14707(Class cls) {
        if (!f24257) {
            String name = cls.getName();
            if (!name.equals("com.carrotsearch.hppc.LongHashSet")) {
                if (!name.equals("gnu.trove.set.hash.TShortHashSet")) {
                    if (name.equals("com.carrotsearch.hppc.CharHashSet") || name.equals("com.carrotsearch.hppc.CharArrayList")) {
                        try {
                            return new C3556(m14698(cls.getMethod("from", char[].class)));
                        } catch (NoSuchMethodException | SecurityException e) {
                            C1123.m1403("illegal state", e);
                            return null;
                        }
                    }
                    if (!name.equals("com.carrotsearch.hppc.IntArrayList")) {
                        if (!name.equals("gnu.trove.list.array.TLongArrayList")) {
                            if (!name.equals("gnu.trove.list.array.TShortArrayList")) {
                                if (!name.equals("gnu.trove.set.hash.TIntHashSet")) {
                                    if (name.equals("com.carrotsearch.hppc.ShortArrayList")) {
                                        try {
                                            return new C3563(m14698(cls.getMethod("from", short[].class)));
                                        } catch (NoSuchMethodException | SecurityException e2) {
                                            C1123.m1403("illegal state", e2);
                                            return null;
                                        }
                                    }
                                    if (name.equals("com.carrotsearch.hppc.DoubleArrayList")) {
                                        try {
                                            return new C3571(m14698(cls.getMethod("from", double[].class)));
                                        } catch (NoSuchMethodException | SecurityException e3) {
                                            C1123.m1403("illegal state", e3);
                                            return null;
                                        }
                                    }
                                    if (name.equals("com.carrotsearch.hppc.ByteArrayList")) {
                                        try {
                                            return new C3542("base64", m14698(cls.getMethod("from", byte[].class)));
                                        } catch (NoSuchMethodException | SecurityException e4) {
                                            C1123.m1403("illegal state", e4);
                                            return null;
                                        }
                                    }
                                    if (!name.equals("gnu.trove.set.hash.TLongHashSet")) {
                                        if (name.equals("gnu.trove.list.array.TCharArrayList")) {
                                            try {
                                                return new C3556(m14699(cls.getConstructor(char[].class)));
                                            } catch (NoSuchMethodException | SecurityException e5) {
                                                C1123.m1403("illegal state", e5);
                                                return null;
                                            }
                                        }
                                        if (name.equals("gnu.trove.list.array.TFloatArrayList")) {
                                            try {
                                                return new C3560(m14699(cls.getConstructor(float[].class)));
                                            } catch (NoSuchMethodException | SecurityException e6) {
                                                C1123.m1403("illegal state", e6);
                                                return null;
                                            }
                                        }
                                        if (!name.equals("gnu.trove.stack.array.TByteArrayStack")) {
                                            if (name.equals("com.carrotsearch.hppc.FloatArrayList")) {
                                                try {
                                                    return new C3560(m14698(cls.getMethod("from", float[].class)));
                                                } catch (NoSuchMethodException | SecurityException e7) {
                                                    C1123.m1403("illegal state", e7);
                                                    return null;
                                                }
                                            }
                                            if (!name.equals("com.carrotsearch.hppc.IntHashSet")) {
                                                if (!name.equals("gnu.trove.list.array.TIntArrayList")) {
                                                    if (!name.equals("gnu.trove.list.array.TByteArrayList")) {
                                                        if (name.equals("org.bson.types.Decimal128")) {
                                                            try {
                                                                return new C3566(m14699(cls.getConstructor(BigDecimal.class)));
                                                            } catch (NoSuchMethodException | SecurityException e8) {
                                                                C1123.m1403("illegal state", e8);
                                                                return null;
                                                            }
                                                        }
                                                        if (!name.equals("gnu.trove.set.hash.TByteHashSet")) {
                                                            if (!name.equals("com.carrotsearch.hppc.LongArrayList")) {
                                                                if (name.equals("gnu.trove.list.array.TDoubleArrayList")) {
                                                                    try {
                                                                        return new C3571(m14699(cls.getConstructor(double[].class)));
                                                                    } catch (NoSuchMethodException | SecurityException e9) {
                                                                        C1123.m1403("illegal state", e9);
                                                                        return null;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        try {
                                            return new C3542("base64", m14699(cls.getConstructor(byte[].class)));
                                        } catch (NoSuchMethodException | SecurityException e10) {
                                            C1123.m1403("illegal state", e10);
                                            return null;
                                        }
                                    }
                                }
                                try {
                                    return new C3541(null, m14699(cls.getConstructor(int[].class)));
                                } catch (NoSuchMethodException | SecurityException e11) {
                                    C1123.m1403("illegal state", e11);
                                    return null;
                                }
                            }
                        }
                        try {
                            return new C3544(null, m14699(cls.getConstructor(long[].class)));
                        } catch (NoSuchMethodException | SecurityException e12) {
                            C1123.m1403("illegal state", e12);
                            return null;
                        }
                    }
                    try {
                        return new C3541(null, m14698(cls.getMethod("from", int[].class)));
                    } catch (NoSuchMethodException | SecurityException e13) {
                        C1123.m1403("illegal state", e13);
                        return null;
                    }
                }
                try {
                    return new C3563(m14699(cls.getConstructor(short[].class)));
                } catch (NoSuchMethodException | SecurityException e14) {
                    C1123.m1403("illegal state", e14);
                    return null;
                }
            }
            try {
                return new C3544(null, m14698(cls.getMethod("from", long[].class)));
            } catch (NoSuchMethodException | SecurityException e15) {
                C1123.m1403("illegal state", e15);
                return null;
            }
        }
        return null;
    }
}
