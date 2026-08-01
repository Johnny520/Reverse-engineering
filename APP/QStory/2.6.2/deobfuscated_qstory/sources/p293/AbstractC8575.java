package p293;

import androidx.collection.C0276;
import com.alibaba.fastjson2.C2941;
import com.alibaba.fastjson2.reader.AbstractC2796;
import com.alibaba.fastjson2.reader.C2707;
import com.alibaba.fastjson2.reader.C2708;
import com.alibaba.fastjson2.reader.C2710;
import com.alibaba.fastjson2.reader.C2722;
import com.alibaba.fastjson2.reader.C2726;
import com.alibaba.fastjson2.reader.C2729;
import com.alibaba.fastjson2.reader.C2732;
import com.alibaba.fastjson2.reader.C2737;
import com.alibaba.fastjson2.util.AbstractC2853;
import com.alibaba.fastjson2.util.AbstractC2866;
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

/* JADX INFO: renamed from: 飘花落叶言楪子哲苏世兰.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8575 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static volatile boolean f23921;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static LongFunction m14119(Constructor constructor) {
        try {
            Class<?> declaringClass = constructor.getDeclaringClass();
            MethodHandles.Lookup lookupM5723 = AbstractC2853.m5723(declaringClass);
            return (LongFunction) LambdaMetafactory.metafactory(lookupM5723, "apply", AbstractC2866.f9065, AbstractC2866.f9050, lookupM5723.findConstructor(declaringClass, AbstractC2866.f9054), MethodType.methodType(declaringClass, (Class<?>) Long.TYPE)).getTarget().invokeExact();
        } catch (Throwable unused) {
            return new C8571(constructor);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static Function m14120(Method method) {
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
                C2941.m6346(method, "not support parameters ");
                return null;
            }
            cls = declaringClass;
        }
        try {
            MethodHandles.Lookup lookupM5723 = AbstractC2853.m5723(declaringClass);
            return (Function) LambdaMetafactory.metafactory(lookupM5723, "apply", AbstractC2866.f9062, AbstractC2866.f9058, zIsStatic ? lookupM5723.findStatic(declaringClass, method.getName(), MethodType.methodType(returnType, cls)) : lookupM5723.findVirtual(declaringClass, method.getName(), MethodType.methodType(returnType)), MethodType.methodType(returnType, cls)).getTarget().invokeExact();
        } catch (Throwable unused) {
            return !Modifier.isStatic(method.getModifiers()) ? new C8572(method, 1) : new C8572(method, 0);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static Function m14121(Constructor constructor) {
        int i = 0;
        try {
            Class<?> declaringClass = constructor.getDeclaringClass();
            MethodHandles.Lookup lookupM5723 = AbstractC2853.m5723(declaringClass);
            Class<?> cls = constructor.getParameterTypes()[0];
            return (Function) LambdaMetafactory.metafactory(lookupM5723, "apply", AbstractC2866.f9062, AbstractC2866.f9058, lookupM5723.findConstructor(declaringClass, MethodType.methodType((Class<?>) Void.TYPE, cls)), MethodType.methodType(declaringClass, (Class<?>) m14124(cls))).getTarget().invokeExact();
        } catch (Throwable unused) {
            return new C8573(constructor, i);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static BiFunction m14122(Method method) {
        MethodType methodType;
        MethodHandle methodHandle;
        try {
            Class<?> declaringClass = method.getDeclaringClass();
            Class<?> returnType = method.getReturnType();
            MethodHandles.Lookup lookupM5723 = AbstractC2853.m5723(declaringClass);
            Class<?>[] parameterTypes = method.getParameterTypes();
            Class<?> cls = parameterTypes[0];
            if (Modifier.isStatic(method.getModifiers())) {
                Class<?> cls2 = parameterTypes[1];
                MethodHandle methodHandleFindStatic = lookupM5723.findStatic(declaringClass, method.getName(), MethodType.methodType(returnType, cls, cls2));
                methodType = MethodType.methodType(returnType, cls, cls2);
                methodHandle = methodHandleFindStatic;
            } else {
                MethodHandle methodHandleFindVirtual = lookupM5723.findVirtual(declaringClass, method.getName(), MethodType.methodType(returnType, cls));
                methodType = MethodType.methodType(returnType, declaringClass, m14124(cls));
                methodHandle = methodHandleFindVirtual;
            }
            return (BiFunction) LambdaMetafactory.metafactory(lookupM5723, "apply", AbstractC2866.f9057, AbstractC2866.f9055, methodHandle, methodType).getTarget().invokeExact();
        } catch (Throwable unused) {
            return new C8574(method, 1);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static BiFunction m14123(Constructor constructor) {
        try {
            Class<?> declaringClass = constructor.getDeclaringClass();
            MethodHandles.Lookup lookupM5723 = AbstractC2853.m5723(declaringClass);
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            Class<?> cls = parameterTypes[0];
            Class<?> cls2 = parameterTypes[1];
            return (BiFunction) LambdaMetafactory.metafactory(lookupM5723, "apply", AbstractC2866.f9057, AbstractC2866.f9055, lookupM5723.findConstructor(declaringClass, MethodType.methodType(Void.TYPE, cls, cls2)), MethodType.methodType(declaringClass, m14124(cls), m14124(cls2))).getTarget().invokeExact();
        } catch (Throwable unused) {
            return new C8574(constructor, 0);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static Class m14124(Class cls) {
        return cls == Integer.TYPE ? Integer.class : cls == Long.TYPE ? Long.class : cls == Boolean.TYPE ? Boolean.class : cls == Short.TYPE ? Short.class : cls == Byte.TYPE ? Byte.class : cls == Character.TYPE ? Character.class : cls == Float.TYPE ? Float.class : cls == Double.TYPE ? Double.class : cls;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static ToIntFunction m14125(Method method) {
        Class<?> declaringClass = method.getDeclaringClass();
        try {
            MethodHandles.Lookup lookupM5723 = AbstractC2853.m5723(declaringClass);
            Class cls = Integer.TYPE;
            return (ToIntFunction) LambdaMetafactory.metafactory(lookupM5723, "applyAsInt", AbstractC2866.f9066, AbstractC2866.f9059, lookupM5723.findVirtual(declaringClass, method.getName(), MethodType.methodType(cls)), MethodType.methodType((Class<?>) cls, declaringClass)).getTarget().invokeExact();
        } catch (Throwable unused) {
            return new C8569(method);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static Supplier m14126(Method method) {
        try {
            Class<?> declaringClass = method.getDeclaringClass();
            Class<?> returnType = method.getReturnType();
            MethodHandles.Lookup lookupM5723 = AbstractC2853.m5723(declaringClass);
            return (Supplier) LambdaMetafactory.metafactory(lookupM5723, "get", AbstractC2866.f9063, AbstractC2866.f9061, lookupM5723.findStatic(declaringClass, method.getName(), MethodType.methodType(returnType)), MethodType.methodType(returnType)).getTarget().invokeExact();
        } catch (Throwable unused) {
            return new C8570(method);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x00cf, code lost:
    
        if (r1.equals("gnu.trove.list.array.TDoubleArrayList") == false) goto L53;
     */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static p291.AbstractC8459 m14127(java.lang.Class r12) {
        /*
            Method dump skipped, instruction units count: 499
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p293.AbstractC8575.m14127(java.lang.Class):飘花落叶言楪子哲兰世苏.飘花落叶言子兰哲苏世楪");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static ToLongFunction m14128(Method method) {
        Class<?> declaringClass = method.getDeclaringClass();
        try {
            MethodHandles.Lookup lookupM5723 = AbstractC2853.m5723(declaringClass);
            Class cls = Long.TYPE;
            return (ToLongFunction) LambdaMetafactory.metafactory(lookupM5723, "applyAsLong", AbstractC2866.f9067, AbstractC2866.f9051, lookupM5723.findVirtual(declaringClass, method.getName(), MethodType.methodType(cls)), MethodType.methodType((Class<?>) cls, declaringClass)).getTarget().invokeExact();
        } catch (Throwable unused) {
            return new C8576(method);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static AbstractC2796 m14129(Class cls) {
        if (!f23921) {
            String name = cls.getName();
            if (!name.equals("com.carrotsearch.hppc.LongHashSet")) {
                if (!name.equals("gnu.trove.set.hash.TShortHashSet")) {
                    if (name.equals("com.carrotsearch.hppc.CharHashSet") || name.equals("com.carrotsearch.hppc.CharArrayList")) {
                        try {
                            return new C2722(m14120(cls.getMethod("from", char[].class)));
                        } catch (NoSuchMethodException | SecurityException e) {
                            C0276.m842("illegal state", e);
                            return null;
                        }
                    }
                    if (!name.equals("com.carrotsearch.hppc.IntArrayList")) {
                        if (!name.equals("gnu.trove.list.array.TLongArrayList")) {
                            if (!name.equals("gnu.trove.list.array.TShortArrayList")) {
                                if (!name.equals("gnu.trove.set.hash.TIntHashSet")) {
                                    if (name.equals("com.carrotsearch.hppc.ShortArrayList")) {
                                        try {
                                            return new C2729(m14120(cls.getMethod("from", short[].class)));
                                        } catch (NoSuchMethodException | SecurityException e2) {
                                            C0276.m842("illegal state", e2);
                                            return null;
                                        }
                                    }
                                    if (name.equals("com.carrotsearch.hppc.DoubleArrayList")) {
                                        try {
                                            return new C2737(m14120(cls.getMethod("from", double[].class)));
                                        } catch (NoSuchMethodException | SecurityException e3) {
                                            C0276.m842("illegal state", e3);
                                            return null;
                                        }
                                    }
                                    if (name.equals("com.carrotsearch.hppc.ByteArrayList")) {
                                        try {
                                            return new C2708("base64", m14120(cls.getMethod("from", byte[].class)));
                                        } catch (NoSuchMethodException | SecurityException e4) {
                                            C0276.m842("illegal state", e4);
                                            return null;
                                        }
                                    }
                                    if (!name.equals("gnu.trove.set.hash.TLongHashSet")) {
                                        if (name.equals("gnu.trove.list.array.TCharArrayList")) {
                                            try {
                                                return new C2722(m14121(cls.getConstructor(char[].class)));
                                            } catch (NoSuchMethodException | SecurityException e5) {
                                                C0276.m842("illegal state", e5);
                                                return null;
                                            }
                                        }
                                        if (name.equals("gnu.trove.list.array.TFloatArrayList")) {
                                            try {
                                                return new C2726(m14121(cls.getConstructor(float[].class)));
                                            } catch (NoSuchMethodException | SecurityException e6) {
                                                C0276.m842("illegal state", e6);
                                                return null;
                                            }
                                        }
                                        if (!name.equals("gnu.trove.stack.array.TByteArrayStack")) {
                                            if (name.equals("com.carrotsearch.hppc.FloatArrayList")) {
                                                try {
                                                    return new C2726(m14120(cls.getMethod("from", float[].class)));
                                                } catch (NoSuchMethodException | SecurityException e7) {
                                                    C0276.m842("illegal state", e7);
                                                    return null;
                                                }
                                            }
                                            if (!name.equals("com.carrotsearch.hppc.IntHashSet")) {
                                                if (!name.equals("gnu.trove.list.array.TIntArrayList")) {
                                                    if (!name.equals("gnu.trove.list.array.TByteArrayList")) {
                                                        if (name.equals("org.bson.types.Decimal128")) {
                                                            try {
                                                                return new C2732(m14121(cls.getConstructor(BigDecimal.class)));
                                                            } catch (NoSuchMethodException | SecurityException e8) {
                                                                C0276.m842("illegal state", e8);
                                                                return null;
                                                            }
                                                        }
                                                        if (!name.equals("gnu.trove.set.hash.TByteHashSet")) {
                                                            if (!name.equals("com.carrotsearch.hppc.LongArrayList")) {
                                                                if (name.equals("gnu.trove.list.array.TDoubleArrayList")) {
                                                                    try {
                                                                        return new C2737(m14121(cls.getConstructor(double[].class)));
                                                                    } catch (NoSuchMethodException | SecurityException e9) {
                                                                        C0276.m842("illegal state", e9);
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
                                            return new C2708("base64", m14121(cls.getConstructor(byte[].class)));
                                        } catch (NoSuchMethodException | SecurityException e10) {
                                            C0276.m842("illegal state", e10);
                                            return null;
                                        }
                                    }
                                }
                                try {
                                    return new C2707(null, m14121(cls.getConstructor(int[].class)));
                                } catch (NoSuchMethodException | SecurityException e11) {
                                    C0276.m842("illegal state", e11);
                                    return null;
                                }
                            }
                        }
                        try {
                            return new C2710(null, m14121(cls.getConstructor(long[].class)));
                        } catch (NoSuchMethodException | SecurityException e12) {
                            C0276.m842("illegal state", e12);
                            return null;
                        }
                    }
                    try {
                        return new C2707(null, m14120(cls.getMethod("from", int[].class)));
                    } catch (NoSuchMethodException | SecurityException e13) {
                        C0276.m842("illegal state", e13);
                        return null;
                    }
                }
                try {
                    return new C2729(m14121(cls.getConstructor(short[].class)));
                } catch (NoSuchMethodException | SecurityException e14) {
                    C0276.m842("illegal state", e14);
                    return null;
                }
            }
            try {
                return new C2710(null, m14120(cls.getMethod("from", long[].class)));
            } catch (NoSuchMethodException | SecurityException e15) {
                C0276.m842("illegal state", e15);
                return null;
            }
        }
        return null;
    }
}
