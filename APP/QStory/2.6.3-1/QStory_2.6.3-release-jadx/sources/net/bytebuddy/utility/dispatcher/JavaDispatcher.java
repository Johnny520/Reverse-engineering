package net.bytebuddy.utility.dispatcher;

import androidx.activity.AbstractC0900;
import androidx.profileinstaller.AbstractC3275;
import java.io.File;
import java.io.FileOutputStream;
import java.lang.annotation.Annotation;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.security.AccessController;
import java.security.Permission;
import java.security.PrivilegedAction;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import lin.xposed.hook.javaplugin.C6385;
import net.bytebuddy.ClassFileVersion;
import net.bytebuddy.build.AccessControllerPlugin;
import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.description.method.MethodDescription;
import net.bytebuddy.dynamic.scaffold.TypeWriter;
import net.bytebuddy.jar.asm.ClassWriter;
import net.bytebuddy.jar.asm.MethodVisitor;
import net.bytebuddy.jar.asm.Type;
import net.bytebuddy.utility.GraalImageCode;
import net.bytebuddy.utility.Invoker;
import net.bytebuddy.utility.MethodComparator;
import net.bytebuddy.utility.nullability.MaybeNull;
import net.bytebuddy.utility.privilege.GetSystemPropertyAction;
import p025.AbstractC7012;
import p160.C8376;
import p352.C9620;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@HashCodeAndEqualsPlugin.Enhance
public class JavaDispatcher<T> implements PrivilegedAction<T> {
    private static final boolean ACCESS_CONTROLLER;
    private static final boolean GENERATE;
    public static final String GENERATE_PROPERTY = "net.bytebuddy.generate";
    private static final Invoker INVOKER;
    private static final DynamicClassLoader.Resolver RESOLVER;

    @MaybeNull
    @HashCodeAndEqualsPlugin.ValueHandling(HashCodeAndEqualsPlugin.ValueHandling.Sort.REVERSE_NULLABILITY)
    private final ClassLoader classLoader;
    private final boolean generate;
    private final Class<T> proxy;

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Target({ElementType.METHOD})
    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    public @interface Container {
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Target({ElementType.TYPE, ElementType.METHOD})
    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    public @interface Defaults {
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @HashCodeAndEqualsPlugin.Enhance
    public static class DirectInvoker implements Invoker {
        private DirectInvoker() {
        }

        public boolean equals(@MaybeNull Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass();
        }

        public int hashCode() {
            return getClass().hashCode();
        }

        @Override // net.bytebuddy.utility.Invoker
        public Object invoke(Method method, @MaybeNull Object obj, @MaybeNull Object[] objArr) {
            return method.invoke(obj, objArr);
        }

        @Override // net.bytebuddy.utility.Invoker
        public Object newInstance(Constructor<?> constructor, Object[] objArr) {
            return constructor.newInstance(objArr);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public interface Dispatcher {

        /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
        @HashCodeAndEqualsPlugin.Enhance
        public static class ForConstructor implements Dispatcher {
            private final Constructor<?> constructor;

            public ForConstructor(Constructor<?> constructor) {
                this.constructor = constructor;
            }

            @Override // net.bytebuddy.utility.dispatcher.JavaDispatcher.Dispatcher
            public int apply(MethodVisitor methodVisitor, Method method) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                Class<?>[] parameterTypes2 = this.constructor.getParameterTypes();
                methodVisitor.visitTypeInsn(187, Type.getInternalName(this.constructor.getDeclaringClass()));
                methodVisitor.visitInsn(89);
                int size = 1;
                for (int i = 0; i < parameterTypes.length; i++) {
                    Type type = Type.getType(parameterTypes[i]);
                    methodVisitor.visitVarInsn(type.getOpcode(21), size);
                    Class<?> cls = parameterTypes[i];
                    Class<?> cls2 = parameterTypes2[i];
                    if (cls != cls2) {
                        methodVisitor.visitTypeInsn(192, Type.getInternalName(cls2));
                    }
                    size += type.getSize();
                }
                methodVisitor.visitMethodInsn(183, Type.getInternalName(this.constructor.getDeclaringClass()), MethodDescription.CONSTRUCTOR_INTERNAL_NAME, Type.getConstructorDescriptor(this.constructor), false);
                methodVisitor.visitInsn(176);
                return size + 1;
            }

            public boolean equals(@MaybeNull Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && getClass() == obj.getClass() && this.constructor.equals(((ForConstructor) obj).constructor);
            }

            public int hashCode() {
                return this.constructor.hashCode() + (getClass().hashCode() * 31);
            }

            @Override // net.bytebuddy.utility.dispatcher.JavaDispatcher.Dispatcher
            public Object invoke(Object[] objArr) {
                return JavaDispatcher.INVOKER.newInstance(this.constructor, objArr);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
        @HashCodeAndEqualsPlugin.Enhance
        public static class ForContainerCreation implements Dispatcher {
            private final Class<?> target;

            public ForContainerCreation(Class<?> cls) {
                this.target = cls;
            }

            @Override // net.bytebuddy.utility.dispatcher.JavaDispatcher.Dispatcher
            public int apply(MethodVisitor methodVisitor, Method method) {
                methodVisitor.visitVarInsn(21, 1);
                methodVisitor.visitTypeInsn(189, Type.getInternalName(this.target));
                methodVisitor.visitInsn(176);
                return 1;
            }

            public boolean equals(@MaybeNull Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && getClass() == obj.getClass() && this.target.equals(((ForContainerCreation) obj).target);
            }

            public int hashCode() {
                return this.target.hashCode() + (getClass().hashCode() * 31);
            }

            @Override // net.bytebuddy.utility.dispatcher.JavaDispatcher.Dispatcher
            public Object invoke(Object[] objArr) {
                return Array.newInstance(this.target, ((Integer) objArr[0]).intValue());
            }
        }

        /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
        public enum ForDefaultValue implements Dispatcher {
            VOID(null, 0, 177, 0),
            BOOLEAN(Boolean.FALSE, 3, 172, 1),
            BOOLEAN_REVERSE(Boolean.TRUE, 4, 172, 1),
            BYTE((byte) 0, 3, 172, 1),
            SHORT((short) 0, 3, 172, 1),
            CHARACTER((char) 0, 3, 172, 1),
            INTEGER(0, 3, 172, 1),
            LONG(0L, 9, 173, 2),
            FLOAT(Float.valueOf(0.0f), 11, 174, 1),
            DOUBLE(Double.valueOf(0.0d), 14, 175, 2),
            REFERENCE(null, 1, 176, 1);

            private final int load;
            private final int returned;
            private final int size;

            @MaybeNull
            private final Object value;

            /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
            @HashCodeAndEqualsPlugin.Enhance
            public static class OfNonPrimitiveArray implements Dispatcher {
                private final Class<?> componentType;

                @HashCodeAndEqualsPlugin.ValueHandling(HashCodeAndEqualsPlugin.ValueHandling.Sort.IGNORE)
                private final Object value;

                public OfNonPrimitiveArray(Object obj, Class<?> cls) {
                    this.value = obj;
                    this.componentType = cls;
                }

                /* JADX INFO: renamed from: of */
                public static Dispatcher m500of(Class<?> cls) {
                    return new OfNonPrimitiveArray(Array.newInstance(cls, 0), cls);
                }

                @Override // net.bytebuddy.utility.dispatcher.JavaDispatcher.Dispatcher
                public int apply(MethodVisitor methodVisitor, Method method) {
                    methodVisitor.visitInsn(3);
                    methodVisitor.visitTypeInsn(189, Type.getInternalName(this.componentType));
                    methodVisitor.visitInsn(176);
                    return 1;
                }

                public boolean equals(@MaybeNull Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return obj != null && getClass() == obj.getClass() && this.componentType.equals(((OfNonPrimitiveArray) obj).componentType);
                }

                public int hashCode() {
                    return this.componentType.hashCode() + (getClass().hashCode() * 31);
                }

                @Override // net.bytebuddy.utility.dispatcher.JavaDispatcher.Dispatcher
                public Object invoke(Object[] objArr) {
                    return this.value;
                }
            }

            /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
            public enum OfPrimitiveArray implements Dispatcher {
                BOOLEAN(new boolean[0], 4),
                BYTE(new byte[0], 8),
                SHORT(new short[0], 9),
                CHARACTER(new char[0], 5),
                INTEGER(new int[0], 10),
                LONG(new long[0], 11),
                FLOAT(new float[0], 6),
                DOUBLE(new double[0], 7);

                private final int operand;
                private final Object value;

                OfPrimitiveArray(Object obj, int i) {
                    this.value = obj;
                    this.operand = i;
                }

                @Override // net.bytebuddy.utility.dispatcher.JavaDispatcher.Dispatcher
                public int apply(MethodVisitor methodVisitor, Method method) {
                    methodVisitor.visitInsn(3);
                    methodVisitor.visitIntInsn(188, this.operand);
                    methodVisitor.visitInsn(176);
                    return 1;
                }

                @Override // net.bytebuddy.utility.dispatcher.JavaDispatcher.Dispatcher
                public Object invoke(Object[] objArr) {
                    return this.value;
                }
            }

            ForDefaultValue(@MaybeNull Object obj, int i, int i2, int i3) {
                this.value = obj;
                this.load = i;
                this.returned = i2;
                this.size = i3;
            }

            /* JADX INFO: renamed from: of */
            public static Dispatcher m499of(Class<?> cls) {
                if (cls == Void.TYPE) {
                    return VOID;
                }
                Class<?> cls2 = Boolean.TYPE;
                if (cls == cls2) {
                    return BOOLEAN;
                }
                Class<?> cls3 = Byte.TYPE;
                if (cls == cls3) {
                    return BYTE;
                }
                Class<?> cls4 = Short.TYPE;
                if (cls == cls4) {
                    return SHORT;
                }
                Class<?> cls5 = Character.TYPE;
                if (cls == cls5) {
                    return CHARACTER;
                }
                Class<?> cls6 = Integer.TYPE;
                if (cls == cls6) {
                    return INTEGER;
                }
                Class<?> cls7 = Long.TYPE;
                if (cls == cls7) {
                    return LONG;
                }
                Class<?> cls8 = Float.TYPE;
                if (cls == cls8) {
                    return FLOAT;
                }
                Class<?> cls9 = Double.TYPE;
                return cls == cls9 ? DOUBLE : cls.isArray() ? cls.getComponentType() == cls2 ? OfPrimitiveArray.BOOLEAN : cls.getComponentType() == cls3 ? OfPrimitiveArray.BYTE : cls.getComponentType() == cls4 ? OfPrimitiveArray.SHORT : cls.getComponentType() == cls5 ? OfPrimitiveArray.CHARACTER : cls.getComponentType() == cls6 ? OfPrimitiveArray.INTEGER : cls.getComponentType() == cls7 ? OfPrimitiveArray.LONG : cls.getComponentType() == cls8 ? OfPrimitiveArray.FLOAT : cls.getComponentType() == cls9 ? OfPrimitiveArray.DOUBLE : OfNonPrimitiveArray.m500of(cls.getComponentType()) : REFERENCE;
            }

            @Override // net.bytebuddy.utility.dispatcher.JavaDispatcher.Dispatcher
            public int apply(MethodVisitor methodVisitor, Method method) {
                int i = this.load;
                if (i != 0) {
                    methodVisitor.visitInsn(i);
                }
                methodVisitor.visitInsn(this.returned);
                return this.size;
            }

            @Override // net.bytebuddy.utility.dispatcher.JavaDispatcher.Dispatcher
            @MaybeNull
            public Object invoke(Object[] objArr) {
                return this.value;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
        @HashCodeAndEqualsPlugin.Enhance
        public static class ForInstanceCheck implements Dispatcher {
            private final Class<?> target;

            public ForInstanceCheck(Class<?> cls) {
                this.target = cls;
            }

            @Override // net.bytebuddy.utility.dispatcher.JavaDispatcher.Dispatcher
            public int apply(MethodVisitor methodVisitor, Method method) {
                methodVisitor.visitVarInsn(25, 1);
                methodVisitor.visitTypeInsn(193, Type.getInternalName(this.target));
                methodVisitor.visitInsn(172);
                return 1;
            }

            public boolean equals(@MaybeNull Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && getClass() == obj.getClass() && this.target.equals(((ForInstanceCheck) obj).target);
            }

            public int hashCode() {
                return this.target.hashCode() + (getClass().hashCode() * 31);
            }

            @Override // net.bytebuddy.utility.dispatcher.JavaDispatcher.Dispatcher
            public Object invoke(Object[] objArr) {
                return Boolean.valueOf(this.target.isInstance(objArr[0]));
            }
        }

        /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
        @HashCodeAndEqualsPlugin.Enhance
        public static class ForNonStaticMethod implements Dispatcher {
            private static final Object[] NO_ARGUMENTS = new Object[0];
            private final Method method;

            public ForNonStaticMethod(Method method) {
                this.method = method;
            }

            @Override // net.bytebuddy.utility.dispatcher.JavaDispatcher.Dispatcher
            public int apply(MethodVisitor methodVisitor, Method method) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                Class<?>[] parameterTypes2 = this.method.getParameterTypes();
                int i = 0;
                int size = 1;
                while (i < parameterTypes.length) {
                    Type type = Type.getType(parameterTypes[i]);
                    methodVisitor.visitVarInsn(type.getOpcode(21), size);
                    if (parameterTypes[i] != (i == 0 ? this.method.getDeclaringClass() : parameterTypes2[i - 1])) {
                        methodVisitor.visitTypeInsn(192, Type.getInternalName(i == 0 ? this.method.getDeclaringClass() : parameterTypes2[i - 1]));
                    }
                    size += type.getSize();
                    i++;
                }
                methodVisitor.visitMethodInsn(this.method.getDeclaringClass().isInterface() ? 185 : 182, Type.getInternalName(this.method.getDeclaringClass()), this.method.getName(), Type.getMethodDescriptor(this.method), this.method.getDeclaringClass().isInterface());
                methodVisitor.visitInsn(Type.getReturnType(this.method).getOpcode(172));
                return Math.max(size - 1, Type.getReturnType(this.method).getSize());
            }

            public boolean equals(@MaybeNull Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && getClass() == obj.getClass() && this.method.equals(((ForNonStaticMethod) obj).method);
            }

            public int hashCode() {
                return this.method.hashCode() + (getClass().hashCode() * 31);
            }

            @Override // net.bytebuddy.utility.dispatcher.JavaDispatcher.Dispatcher
            public Object invoke(Object[] objArr) {
                Object[] objArr2;
                if (objArr.length == 1) {
                    objArr2 = NO_ARGUMENTS;
                } else {
                    int length = objArr.length - 1;
                    Object[] objArr3 = new Object[length];
                    System.arraycopy(objArr, 1, objArr3, 0, length);
                    objArr2 = objArr3;
                }
                return JavaDispatcher.INVOKER.invoke(this.method, objArr[0], objArr2);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
        @HashCodeAndEqualsPlugin.Enhance
        public static class ForStaticMethod implements Dispatcher {
            private final Method method;

            public ForStaticMethod(Method method) {
                this.method = method;
            }

            @Override // net.bytebuddy.utility.dispatcher.JavaDispatcher.Dispatcher
            public int apply(MethodVisitor methodVisitor, Method method) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                Class<?>[] parameterTypes2 = this.method.getParameterTypes();
                int size = 1;
                for (int i = 0; i < parameterTypes.length; i++) {
                    Type type = Type.getType(parameterTypes[i]);
                    methodVisitor.visitVarInsn(type.getOpcode(21), size);
                    Class<?> cls = parameterTypes[i];
                    Class<?> cls2 = parameterTypes2[i];
                    if (cls != cls2) {
                        methodVisitor.visitTypeInsn(192, Type.getInternalName(cls2));
                    }
                    size += type.getSize();
                }
                methodVisitor.visitMethodInsn(184, Type.getInternalName(this.method.getDeclaringClass()), this.method.getName(), Type.getMethodDescriptor(this.method), this.method.getDeclaringClass().isInterface());
                methodVisitor.visitInsn(Type.getReturnType(this.method).getOpcode(172));
                return Math.max(size - 1, Type.getReturnType(this.method).getSize());
            }

            public boolean equals(@MaybeNull Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && getClass() == obj.getClass() && this.method.equals(((ForStaticMethod) obj).method);
            }

            public int hashCode() {
                return this.method.hashCode() + (getClass().hashCode() * 31);
            }

            @Override // net.bytebuddy.utility.dispatcher.JavaDispatcher.Dispatcher
            @MaybeNull
            public Object invoke(Object[] objArr) {
                return JavaDispatcher.INVOKER.invoke(this.method, null, objArr);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
        @HashCodeAndEqualsPlugin.Enhance
        public static class ForUnresolvedMethod implements Dispatcher {
            private final String message;

            public ForUnresolvedMethod(String str) {
                this.message = str;
            }

            @Override // net.bytebuddy.utility.dispatcher.JavaDispatcher.Dispatcher
            public int apply(MethodVisitor methodVisitor, Method method) {
                methodVisitor.visitTypeInsn(187, Type.getInternalName(IllegalStateException.class));
                methodVisitor.visitInsn(89);
                methodVisitor.visitLdcInsn(this.message);
                methodVisitor.visitMethodInsn(183, Type.getInternalName(IllegalStateException.class), MethodDescription.CONSTRUCTOR_INTERNAL_NAME, Type.getMethodDescriptor(Type.VOID_TYPE, Type.getType((Class<?>) String.class)), false);
                methodVisitor.visitInsn(191);
                return 3;
            }

            public boolean equals(@MaybeNull Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && getClass() == obj.getClass() && this.message.equals(((ForUnresolvedMethod) obj).message);
            }

            public int hashCode() {
                return this.message.hashCode() + (getClass().hashCode() * 31);
            }

            @Override // net.bytebuddy.utility.dispatcher.JavaDispatcher.Dispatcher
            public Object invoke(Object[] objArr) {
                throw new IllegalStateException("Could not invoke proxy: " + this.message);
            }
        }

        int apply(MethodVisitor methodVisitor, Method method);

        @MaybeNull
        Object invoke(Object[] objArr);
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Target({ElementType.METHOD})
    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    public @interface Instance {
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Target({ElementType.METHOD})
    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    public @interface IsConstructor {
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Target({ElementType.METHOD})
    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    public @interface IsStatic {
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Target({ElementType.TYPE, ElementType.METHOD, ElementType.PARAMETER})
    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    public @interface Proxied {
        String value();
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @HashCodeAndEqualsPlugin.Enhance
    public static class ProxiedInvocationHandler implements InvocationHandler {
        private static final Object[] NO_ARGUMENTS = new Object[0];
        private final String name;
        private final Map<Method, Dispatcher> targets;

        public ProxiedInvocationHandler(String str, Map<Method, Dispatcher> map) {
            this.name = str;
            this.targets = map;
        }

        public boolean equals(@MaybeNull Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            ProxiedInvocationHandler proxiedInvocationHandler = (ProxiedInvocationHandler) obj;
            return this.name.equals(proxiedInvocationHandler.name) && this.targets.equals(proxiedInvocationHandler.targets);
        }

        public int hashCode() {
            return this.targets.hashCode() + AbstractC7012.m12131(getClass().hashCode() * 31, 31, this.name);
        }

        @Override // java.lang.reflect.InvocationHandler
        @MaybeNull
        public Object invoke(Object obj, Method method, @MaybeNull Object[] objArr) {
            z = false;
            z = false;
            boolean z = false;
            if (method.getDeclaringClass() == Object.class) {
                if (method.getName().equals("hashCode")) {
                    return Integer.valueOf(hashCode());
                }
                if (method.getName().equals("equals")) {
                    Object obj2 = objArr[0];
                    if (obj2 != null && Proxy.isProxyClass(obj2.getClass()) && Proxy.getInvocationHandler(objArr[0]).equals(this)) {
                        z = true;
                    }
                    return Boolean.valueOf(z);
                }
                if (!method.getName().equals("toString")) {
                    C8376.m13333(method, "Unexpected object method: ");
                    return null;
                }
                return "Call proxy for " + this.name;
            }
            Dispatcher dispatcher = this.targets.get(method);
            try {
                try {
                    if (dispatcher != null) {
                        if (objArr == null) {
                            objArr = NO_ARGUMENTS;
                        }
                        return dispatcher.invoke(objArr);
                    }
                    throw new IllegalStateException("No proxy target found for " + method);
                } catch (InvocationTargetException e) {
                    throw e.getTargetException();
                }
            } catch (Error e2) {
                throw e2;
            } catch (RuntimeException e3) {
                throw e3;
            } catch (Throwable th) {
                for (Class<?> cls : method.getExceptionTypes()) {
                    if (cls.isInstance(th)) {
                        throw th;
                    }
                }
                C6385.m11434("Failed to invoke proxy for ", method, th);
                return null;
            }
        }
    }

    static {
        boolean z = false;
        try {
            Class.forName("java.security.AccessController", false, null);
            ACCESS_CONTROLLER = Boolean.parseBoolean(System.getProperty("net.bytebuddy.securitymanager", "true"));
        } catch (ClassNotFoundException unused) {
            ACCESS_CONTROLLER = z;
        } catch (SecurityException unused2) {
            z = true;
            ACCESS_CONTROLLER = z;
        }
        GENERATE = Boolean.parseBoolean((String) doPrivileged(new GetSystemPropertyAction(GENERATE_PROPERTY)));
        RESOLVER = (DynamicClassLoader.Resolver) doPrivileged(DynamicClassLoader.Resolver.CreationAction.INSTANCE);
        INVOKER = (Invoker) doPrivileged(new InvokerCreationAction());
    }

    public JavaDispatcher(Class<T> cls, @MaybeNull ClassLoader classLoader, boolean z) {
        this.proxy = cls;
        this.classLoader = classLoader;
        this.generate = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @AccessControllerPlugin.Enhance
    public static <T> T doPrivileged(PrivilegedAction<T> privilegedAction) {
        return ACCESS_CONTROLLER ? (T) AccessController.doPrivileged(privilegedAction) : privilegedAction.run();
    }

    /* JADX INFO: renamed from: of */
    public static <T> PrivilegedAction<T> m498of(Class<T> cls, @MaybeNull ClassLoader classLoader, boolean z) {
        if (!cls.isInterface()) {
            C6755.m11869(AbstractC0900.m714(cls, "Expected an interface instead of "));
            return null;
        }
        if (!cls.isAnnotationPresent(Proxied.class)) {
            C6385.m11430("Expected ", cls.getName(), " to be annotated with ", Proxied.class.getName());
            return null;
        }
        if (!((Proxied) cls.getAnnotation(Proxied.class)).value().startsWith("java.security.")) {
            return new JavaDispatcher(cls, classLoader, z);
        }
        C6755.m11869("Classes related to Java security cannot be proxied: ".concat(cls.getName()));
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0039 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean equals(@MaybeNull Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        JavaDispatcher javaDispatcher = (JavaDispatcher) obj;
        if (this.generate != javaDispatcher.generate || !this.proxy.equals(javaDispatcher.proxy)) {
            return false;
        }
        ClassLoader classLoader = this.classLoader;
        ClassLoader classLoader2 = javaDispatcher.classLoader;
        if (classLoader2 != null) {
            return classLoader != null && classLoader.equals(classLoader2);
        }
        if (classLoader != null) {
            return false;
        }
    }

    public int hashCode() {
        int iM5129 = AbstractC3275.m5129(getClass().hashCode() * 31, 31, this.proxy);
        ClassLoader classLoader = this.classLoader;
        if (classLoader != null) {
            iM5129 += classLoader.hashCode();
        }
        return (iM5129 * 31) + (this.generate ? 1 : 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:139:0x02a2, code lost:
    
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x02a9, code lost:
    
        if (r0[r14].isArray() == false) goto L380;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x02ab, code lost:
    
        r3 = r3 + 1;
        r0[r14] = r0[r14].getComponentType();
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x02bc, code lost:
    
        if (r3 <= 0) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x02c4, code lost:
    
        if (r0[r14].isPrimitive() != false) goto L359;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x02c6, code lost:
    
        r28 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x02ce, code lost:
    
        r31 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x02d4, code lost:
    
        r32 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x02d8, code lost:
    
        r33 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x02e3, code lost:
    
        if (r0[r14].isAssignableFrom(java.lang.Class.forName(((net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied) r2).value(), false, r34.classLoader)) == false) goto L360;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x02e5, code lost:
    
        r2 = new java.lang.StringBuilder();
        r3 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x02ec, code lost:
    
        r4 = r3 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x02ee, code lost:
    
        if (r3 <= 0) goto L381;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x02f0, code lost:
    
        r2.append(net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.COMPONENT_TYPE_PATH);
        r3 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x02f7, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x02fa, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x02fd, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0300, code lost:
    
        r2.append('L');
        r2.append(((net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied) r2).value());
        r2.append(net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.INDEXED_TYPE_DELIMITER);
        r0[r14] = java.lang.Class.forName(r2.toString(), false, r34.classLoader);
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x034e, code lost:
    
        throw new java.lang.IllegalStateException("Cannot resolve to component type: " + ((net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied) r2).value() + " at " + r14 + " of " + r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x034f, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0352, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x0355, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x0358, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x035b, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x035e, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x0383, code lost:
    
        throw new java.lang.IllegalStateException("Primitive values are not supposed to be proxied: " + r14 + " of " + r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x0384, code lost:
    
        r31 = r4;
        r32 = r5;
        r33 = r6;
        r3 = java.lang.Class.forName(((net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied) r2).value(), false, r34.classLoader);
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x039f, code lost:
    
        if (r0[r14].isAssignableFrom(r3) == false) goto L361;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x03a1, code lost:
    
        r0[r14] = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x03ca, code lost:
    
        throw new java.lang.IllegalStateException("Cannot resolve to type: " + r3.getName() + " at " + r14 + " of " + r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:271:0x05d0, code lost:
    
        r2 = new net.bytebuddy.utility.dispatcher.JavaDispatcher.Dispatcher.ForUnresolvedMethod("Method not available on current VM: " + r0.getMessage());
     */
    /* JADX WARN: Code restructure failed: missing block: B:278:0x05fd, code lost:
    
        r2 = new net.bytebuddy.utility.dispatcher.JavaDispatcher.Dispatcher.ForUnresolvedMethod("Class not available on current VM: " + r0.getMessage());
     */
    /* JADX WARN: Removed duplicated region for block: B:268:0x05c9  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x05e8  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x05f6  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0615  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0198  */
    @Override // java.security.PrivilegedAction
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public T run() {
        Class<Instance> cls;
        String str;
        String str2;
        Class<?> cls2;
        Method[] methodArr;
        Object objM499of;
        T t;
        int i;
        Method[] methods;
        boolean z;
        String str3;
        String str4;
        Class<?> cls3;
        Class<Instance> cls4;
        Class<?> cls5;
        int i2;
        boolean z2;
        int i3;
        Class<?>[] clsArr;
        String str5 = "Instance check requires a single regular-typed argument: ";
        String str6 = "Instance check requires a boolean return type: ";
        Class<?> cls6 = Boolean.TYPE;
        Class<Instance> cls7 = Instance.class;
        Class<?> cls8 = Object.class;
        try {
            Object objInvoke = System.class.getMethod("getSecurityManager", null).invoke(null, null);
            if (objInvoke != null) {
                Class.forName("java.lang.SecurityManager").getMethod("checkPermission", Permission.class).invoke(objInvoke, Class.forName("java.lang.RuntimePermission").getConstructor(String.class).newInstance("net.bytebuddy.createJavaDispatcher"));
            }
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
        } catch (IllegalAccessException e) {
            C9620.m15032("Failed to access security manager", e);
            return null;
        } catch (InstantiationException e2) {
            C9620.m15032("Failed to instantiate runtime permission", e2);
            return null;
        } catch (InvocationTargetException e3) {
            Throwable targetException = e3.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            C9620.m15032("Failed to assert access rights using security manager", targetException);
            return null;
        }
        Map linkedHashMap = this.generate ? new LinkedHashMap() : new HashMap();
        boolean zIsAnnotationPresent = this.proxy.isAnnotationPresent(Defaults.class);
        String strValue = ((Proxied) this.proxy.getAnnotation(Proxied.class)).value();
        try {
            Class<?> cls9 = Class.forName(strValue, false, this.classLoader);
            boolean z3 = this.generate;
            if (z3) {
                t = null;
                i = 0;
                methods = (Method[]) GraalImageCode.getCurrent().sorted(this.proxy.getMethods(), MethodComparator.INSTANCE);
            } else {
                t = null;
                i = 0;
                methods = this.proxy.getMethods();
            }
            int length = methods.length;
            boolean z4 = z3;
            Method[] methodArr2 = methods;
            int i4 = i;
            while (i4 < length) {
                int i5 = i4;
                Method method = methodArr2[i5];
                if (method.getDeclaringClass() == cls8) {
                    z = zIsAnnotationPresent;
                } else if (method.isAnnotationPresent(cls7)) {
                    z = zIsAnnotationPresent;
                    if (method.getParameterTypes().length != 1 || !method.getParameterTypes()[i].isAssignableFrom(cls9)) {
                        C8376.m13333(method, str5);
                        return t;
                    }
                    if (method.getReturnType() != cls6) {
                        C8376.m13333(method, str6);
                        return t;
                    }
                    linkedHashMap.put(method, new Dispatcher.ForInstanceCheck(cls9));
                } else {
                    z = zIsAnnotationPresent;
                    if (method.isAnnotationPresent(Container.class)) {
                        if (method.getParameterTypes().length != 1 || method.getParameterTypes()[i] != Integer.TYPE) {
                            C8376.m13333(method, "Container creation requires a single int-typed argument: ");
                            return t;
                        }
                        if (!method.getReturnType().isArray() || !method.getReturnType().getComponentType().isAssignableFrom(cls9)) {
                            C8376.m13333(method, "Container creation requires an assignable array as return value: ");
                            return t;
                        }
                        linkedHashMap.put(method, new Dispatcher.ForContainerCreation(cls9));
                    } else {
                        if (cls9.getName().equals("java.lang.invoke.MethodHandles") && method.getName().equals("lookup")) {
                            C6755.m11867("Cannot resolve Byte Buddy lookup via dispatcher");
                            return t;
                        }
                        try {
                            Class<?>[] parameterTypes = method.getParameterTypes();
                            if (!method.isAnnotationPresent(IsStatic.class)) {
                                try {
                                    if (method.isAnnotationPresent(IsConstructor.class)) {
                                        str3 = str5;
                                        str4 = str6;
                                        i2 = length;
                                        z2 = z4;
                                        i3 = 0;
                                    } else {
                                        i2 = length;
                                        try {
                                            if (parameterTypes.length == 0) {
                                                throw new IllegalStateException("Expected self type: " + method);
                                            }
                                            if (!parameterTypes[i].isAssignableFrom(cls9)) {
                                                throw new IllegalStateException("Cannot assign self type: " + cls9 + " on " + method);
                                            }
                                            int length2 = parameterTypes.length - 1;
                                            z2 = z4;
                                            try {
                                                Class<?>[] clsArr2 = new Class[length2];
                                                str3 = str5;
                                                str4 = str6;
                                                try {
                                                    System.arraycopy(parameterTypes, 1, clsArr2, i, length2);
                                                    parameterTypes = clsArr2;
                                                    i3 = 1;
                                                } catch (ClassNotFoundException e4) {
                                                    e = e4;
                                                    cls3 = cls6;
                                                    cls4 = cls7;
                                                    cls5 = cls8;
                                                    z4 = z2;
                                                    if (!z) {
                                                        Object objM499of2 = Dispatcher.ForDefaultValue.m499of(method.getReturnType());
                                                        linkedHashMap.put(method, objM499of2);
                                                    }
                                                    i4 = i5 + 1;
                                                    zIsAnnotationPresent = z;
                                                    length = i2;
                                                    str5 = str3;
                                                    str6 = str4;
                                                    cls6 = cls3;
                                                    cls7 = cls4;
                                                    cls8 = cls5;
                                                    i = 0;
                                                } catch (NoSuchMethodException e5) {
                                                    e = e5;
                                                    cls3 = cls6;
                                                    cls4 = cls7;
                                                    cls5 = cls8;
                                                    z4 = z2;
                                                    if (!z) {
                                                        Object objM499of3 = Dispatcher.ForDefaultValue.m499of(method.getReturnType());
                                                        linkedHashMap.put(method, objM499of3);
                                                    }
                                                    i4 = i5 + 1;
                                                    zIsAnnotationPresent = z;
                                                    length = i2;
                                                    str5 = str3;
                                                    str6 = str4;
                                                    cls6 = cls3;
                                                    cls7 = cls4;
                                                    cls8 = cls5;
                                                    i = 0;
                                                } catch (Throwable th) {
                                                    th = th;
                                                    cls3 = cls6;
                                                    cls4 = cls7;
                                                    cls5 = cls8;
                                                    z4 = z2;
                                                    linkedHashMap.put(method, new Dispatcher.ForUnresolvedMethod("Unexpected error: " + th.getMessage()));
                                                    i4 = i5 + 1;
                                                    zIsAnnotationPresent = z;
                                                    length = i2;
                                                    str5 = str3;
                                                    str6 = str4;
                                                    cls6 = cls3;
                                                    cls7 = cls4;
                                                    cls8 = cls5;
                                                    i = 0;
                                                }
                                            } catch (ClassNotFoundException e6) {
                                                e = e6;
                                                str3 = str5;
                                                str4 = str6;
                                            } catch (NoSuchMethodException e7) {
                                                e = e7;
                                                str3 = str5;
                                                str4 = str6;
                                            } catch (Throwable th2) {
                                                th = th2;
                                                str3 = str5;
                                                str4 = str6;
                                            }
                                        } catch (ClassNotFoundException e8) {
                                            e = e8;
                                            str3 = str5;
                                            str4 = str6;
                                            cls3 = cls6;
                                            cls4 = cls7;
                                            cls5 = cls8;
                                            if (!z) {
                                            }
                                            i4 = i5 + 1;
                                            zIsAnnotationPresent = z;
                                            length = i2;
                                            str5 = str3;
                                            str6 = str4;
                                            cls6 = cls3;
                                            cls7 = cls4;
                                            cls8 = cls5;
                                            i = 0;
                                        } catch (NoSuchMethodException e9) {
                                            e = e9;
                                            str3 = str5;
                                            str4 = str6;
                                            cls3 = cls6;
                                            cls4 = cls7;
                                            cls5 = cls8;
                                            if (!z) {
                                            }
                                            i4 = i5 + 1;
                                            zIsAnnotationPresent = z;
                                            length = i2;
                                            str5 = str3;
                                            str6 = str4;
                                            cls6 = cls3;
                                            cls7 = cls4;
                                            cls8 = cls5;
                                            i = 0;
                                        } catch (Throwable th3) {
                                            th = th3;
                                            str3 = str5;
                                            str4 = str6;
                                            cls3 = cls6;
                                            cls4 = cls7;
                                            cls5 = cls8;
                                            linkedHashMap.put(method, new Dispatcher.ForUnresolvedMethod("Unexpected error: " + th.getMessage()));
                                            i4 = i5 + 1;
                                            zIsAnnotationPresent = z;
                                            length = i2;
                                            str5 = str3;
                                            str6 = str4;
                                            cls6 = cls3;
                                            cls7 = cls4;
                                            cls8 = cls5;
                                            i = 0;
                                        }
                                    }
                                    Annotation[][] parameterAnnotations = method.getParameterAnnotations();
                                    int i6 = 0;
                                    while (i6 < parameterTypes.length) {
                                        Annotation[] annotationArr = parameterAnnotations[i6 + i3];
                                        int i7 = i3;
                                        int length3 = annotationArr.length;
                                        Annotation[][] annotationArr2 = parameterAnnotations;
                                        int i8 = 0;
                                        while (true) {
                                            if (i8 >= length3) {
                                                cls3 = cls6;
                                                cls4 = cls7;
                                                cls5 = cls8;
                                                break;
                                            }
                                            int i9 = length3;
                                            Annotation annotation = annotationArr[i8];
                                            int i10 = i8;
                                            if (annotation instanceof Proxied) {
                                                break;
                                            }
                                            i8 = i10 + 1;
                                            length3 = i9;
                                        }
                                        i6++;
                                        i3 = i7;
                                        parameterAnnotations = annotationArr2;
                                        cls6 = cls3;
                                        cls7 = cls4;
                                        cls8 = cls5;
                                    }
                                    cls3 = cls6;
                                    cls4 = cls7;
                                    cls5 = cls8;
                                    if (method.isAnnotationPresent(IsConstructor.class)) {
                                        Constructor<?> constructor = cls9.getConstructor(parameterTypes);
                                        if (!method.getReturnType().isAssignableFrom(cls9)) {
                                            throw new IllegalStateException("Cannot assign " + constructor.getDeclaringClass().getName() + " to " + method);
                                        }
                                        if ((constructor.getModifiers() & 1) == 0 || (cls9.getModifiers() & 1) == 0) {
                                            constructor.setAccessible(true);
                                            z4 = false;
                                        } else {
                                            z4 = z2;
                                        }
                                        try {
                                            linkedHashMap.put(method, new Dispatcher.ForConstructor(constructor));
                                        } catch (ClassNotFoundException e10) {
                                            e = e10;
                                            if (!z) {
                                            }
                                        } catch (NoSuchMethodException e11) {
                                            e = e11;
                                            if (!z) {
                                            }
                                        } catch (Throwable th4) {
                                            th = th4;
                                            linkedHashMap.put(method, new Dispatcher.ForUnresolvedMethod("Unexpected error: " + th.getMessage()));
                                        }
                                    } else {
                                        Proxied proxied = (Proxied) method.getAnnotation(Proxied.class);
                                        Method method2 = cls9.getMethod(proxied == null ? method.getName() : proxied.value(), parameterTypes);
                                        if (!method.getReturnType().isAssignableFrom(method2.getReturnType())) {
                                            throw new IllegalStateException("Cannot assign " + method2.getReturnType().getName() + " to " + method);
                                        }
                                        Class<?>[] exceptionTypes = method2.getExceptionTypes();
                                        int length4 = exceptionTypes.length;
                                        int i11 = 0;
                                        while (i11 < length4) {
                                            Class<?> cls10 = exceptionTypes[i11];
                                            if (!RuntimeException.class.isAssignableFrom(cls10) && !Error.class.isAssignableFrom(cls10)) {
                                                Class<?>[] exceptionTypes2 = method.getExceptionTypes();
                                                int length5 = exceptionTypes2.length;
                                                int i12 = 0;
                                                while (i12 < length5) {
                                                    clsArr = exceptionTypes;
                                                    if (exceptionTypes2[i12].isAssignableFrom(cls10)) {
                                                        break;
                                                    }
                                                    i12++;
                                                    exceptionTypes = clsArr;
                                                }
                                                throw new IllegalStateException("Resolved method for " + method + " throws undeclared checked exception " + cls10.getName());
                                            }
                                            clsArr = exceptionTypes;
                                            i11++;
                                            exceptionTypes = clsArr;
                                        }
                                        if ((method2.getModifiers() & 1) == 0 || (method2.getDeclaringClass().getModifiers() & 1) == 0) {
                                            method2.setAccessible(true);
                                            z4 = false;
                                        } else {
                                            z4 = z2;
                                        }
                                        if (Modifier.isStatic(method2.getModifiers())) {
                                            if (!method.isAnnotationPresent(IsStatic.class)) {
                                                throw new IllegalStateException("Resolved method for " + method + " was expected to be static: " + method2);
                                            }
                                            linkedHashMap.put(method, new Dispatcher.ForStaticMethod(method2));
                                        } else {
                                            if (method.isAnnotationPresent(IsStatic.class)) {
                                                throw new IllegalStateException("Resolved method for " + method + " was expected to be virtual: " + method2);
                                            }
                                            linkedHashMap.put(method, new Dispatcher.ForNonStaticMethod(method2));
                                        }
                                    }
                                } catch (ClassNotFoundException e12) {
                                    e = e12;
                                    str3 = str5;
                                    str4 = str6;
                                    i2 = length;
                                } catch (NoSuchMethodException e13) {
                                    e = e13;
                                    str3 = str5;
                                    str4 = str6;
                                    i2 = length;
                                } catch (Throwable th5) {
                                    th = th5;
                                    str3 = str5;
                                    str4 = str6;
                                    i2 = length;
                                }
                            }
                        } catch (ClassNotFoundException e14) {
                            e = e14;
                            str3 = str5;
                            str4 = str6;
                            cls3 = cls6;
                            cls4 = cls7;
                            cls5 = cls8;
                            i2 = length;
                        } catch (NoSuchMethodException e15) {
                            e = e15;
                            str3 = str5;
                            str4 = str6;
                            cls3 = cls6;
                            cls4 = cls7;
                            cls5 = cls8;
                            i2 = length;
                        } catch (Throwable th6) {
                            th = th6;
                            str3 = str5;
                            str4 = str6;
                            cls3 = cls6;
                            cls4 = cls7;
                            cls5 = cls8;
                            i2 = length;
                        }
                        i4 = i5 + 1;
                        zIsAnnotationPresent = z;
                        length = i2;
                        str5 = str3;
                        str6 = str4;
                        cls6 = cls3;
                        cls7 = cls4;
                        cls8 = cls5;
                        i = 0;
                    }
                }
                str3 = str5;
                str4 = str6;
                cls3 = cls6;
                cls4 = cls7;
                cls5 = cls8;
                i2 = length;
                i4 = i5 + 1;
                zIsAnnotationPresent = z;
                length = i2;
                str5 = str3;
                str6 = str4;
                cls6 = cls3;
                cls7 = cls4;
                cls8 = cls5;
                i = 0;
            }
            boolean z5 = z4;
            Class<T> cls11 = this.proxy;
            return z5 ? (T) DynamicClassLoader.proxy(cls11, linkedHashMap) : (T) Proxy.newProxyInstance(cls11.getClassLoader(), new Class[]{this.proxy}, new ProxiedInvocationHandler(cls9.getName(), linkedHashMap));
        } catch (ClassNotFoundException e16) {
            String str7 = "Instance check requires a single regular-typed argument: ";
            String str8 = "Instance check requires a boolean return type: ";
            Class<?> cls12 = cls6;
            Class<Instance> cls13 = cls7;
            Class<?> cls14 = cls8;
            Method[] methods2 = this.generate ? (Method[]) GraalImageCode.getCurrent().sorted(this.proxy.getMethods(), MethodComparator.INSTANCE) : this.proxy.getMethods();
            int length6 = methods2.length;
            int i13 = 0;
            while (i13 < length6) {
                Method method3 = methods2[i13];
                Class<?> cls15 = cls14;
                if (method3.getDeclaringClass() == cls15) {
                    methodArr = methods2;
                    str = str7;
                    str2 = str8;
                    cls2 = cls12;
                    cls = cls13;
                } else {
                    cls = cls13;
                    if (!method3.isAnnotationPresent(cls)) {
                        str = str7;
                        str2 = str8;
                        cls2 = cls12;
                        if (zIsAnnotationPresent || method3.isAnnotationPresent(Defaults.class)) {
                            methodArr = methods2;
                            objM499of = Dispatcher.ForDefaultValue.m499of(method3.getReturnType());
                        } else {
                            methodArr = methods2;
                            objM499of = new Dispatcher.ForUnresolvedMethod("Type not available on current VM: " + e16.getMessage());
                        }
                        linkedHashMap.put(method3, objM499of);
                    } else {
                        if (method3.getParameterTypes().length != 1 || method3.getParameterTypes()[0].isPrimitive() || method3.getParameterTypes()[0].isArray()) {
                            C8376.m13333(method3, str7);
                            return null;
                        }
                        cls2 = cls12;
                        if (method3.getReturnType() != cls2) {
                            C8376.m13333(method3, str8);
                            return null;
                        }
                        linkedHashMap.put(method3, Dispatcher.ForDefaultValue.BOOLEAN);
                        methodArr = methods2;
                        str = str7;
                        str2 = str8;
                    }
                }
                i13++;
                cls13 = cls;
                cls14 = cls15;
                str8 = str2;
                cls12 = cls2;
                str7 = str;
                methods2 = methodArr;
            }
            boolean z6 = this.generate;
            Class<T> cls16 = this.proxy;
            return z6 ? (T) DynamicClassLoader.proxy(cls16, linkedHashMap) : (T) Proxy.newProxyInstance(cls16.getClassLoader(), new Class[]{this.proxy}, new ProxiedInvocationHandler(strValue, linkedHashMap));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @HashCodeAndEqualsPlugin.Enhance
    public static class InvokerCreationAction implements PrivilegedAction<Invoker> {
        private InvokerCreationAction() {
        }

        public boolean equals(@MaybeNull Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass();
        }

        public int hashCode() {
            return getClass().hashCode();
        }

        @Override // java.security.PrivilegedAction
        public Invoker run() {
            return DynamicClassLoader.invoker();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static class DynamicClassLoader extends ClassLoader {

        @MaybeNull
        private static final String DUMP_FOLDER;
        private static final Class<?>[] NO_PARAMETER = new Class[0];
        private static final Object[] NO_ARGUMENT = new Object[0];

        static {
            String str;
            try {
                str = (String) JavaDispatcher.doPrivileged(new GetSystemPropertyAction(TypeWriter.DUMP_PROPERTY));
            } catch (Throwable unused) {
                str = null;
            }
            DUMP_FOLDER = str;
        }

        public DynamicClassLoader(Class<?> cls) {
            super(cls.getClassLoader());
            JavaDispatcher.RESOLVER.accept(this, cls);
        }

        public static Invoker invoker() {
            ClassWriter classWriter = new ClassWriter(0);
            classWriter.visit(ClassFileVersion.ofThisVm().getMinorMajorVersion(), 1, Type.getInternalName(Invoker.class) + "$Dispatcher", null, Type.getInternalName(Object.class), new String[]{Type.getInternalName(Invoker.class)});
            Method[] methodArr = (Method[]) GraalImageCode.getCurrent().sorted(Invoker.class.getMethods(), MethodComparator.INSTANCE);
            int length = methodArr.length;
            int i = 0;
            while (true) {
                int size = 1;
                if (i >= length) {
                    break;
                }
                Method method = methodArr[i];
                Class<?>[] exceptionTypes = method.getExceptionTypes();
                String[] strArr = new String[exceptionTypes.length];
                for (int i2 = 0; i2 < exceptionTypes.length; i2++) {
                    strArr[i2] = Type.getInternalName(exceptionTypes[i2]);
                }
                MethodVisitor methodVisitorVisitMethod = classWriter.visitMethod(1, method.getName(), Type.getMethodDescriptor(method), null, strArr);
                methodVisitorVisitMethod.visitCode();
                Type[] typeArr = new Type[method.getParameterTypes().length - 1];
                for (int i3 = 0; i3 < method.getParameterTypes().length; i3++) {
                    Type type = Type.getType(method.getParameterTypes()[i3]);
                    if (i3 > 0) {
                        typeArr[i3 - 1] = type;
                    }
                    methodVisitorVisitMethod.visitVarInsn(type.getOpcode(21), size);
                    size += type.getSize();
                }
                methodVisitorVisitMethod.visitMethodInsn(182, Type.getInternalName(method.getParameterTypes()[0]), method.getName(), Type.getMethodDescriptor(Type.getReturnType(method), typeArr), false);
                methodVisitorVisitMethod.visitInsn(Type.getReturnType(method).getOpcode(172));
                methodVisitorVisitMethod.visitMaxs(Math.max(size - 1, Type.getReturnType(method).getSize()), size);
                methodVisitorVisitMethod.visitEnd();
                i++;
            }
            Type type2 = Type.VOID_TYPE;
            MethodVisitor methodVisitorVisitMethod2 = classWriter.visitMethod(1, MethodDescription.CONSTRUCTOR_INTERNAL_NAME, Type.getMethodDescriptor(type2, new Type[0]), null, null);
            methodVisitorVisitMethod2.visitCode();
            methodVisitorVisitMethod2.visitVarInsn(25, 0);
            methodVisitorVisitMethod2.visitMethodInsn(183, Type.getInternalName(Object.class), MethodDescription.CONSTRUCTOR_INTERNAL_NAME, Type.getMethodDescriptor(type2, new Type[0]), false);
            methodVisitorVisitMethod2.visitInsn(177);
            methodVisitorVisitMethod2.visitMaxs(1, 1);
            methodVisitorVisitMethod2.visitEnd();
            classWriter.visitEnd();
            byte[] byteArray = classWriter.toByteArray();
            try {
                String property = System.getProperty(TypeWriter.DUMP_PROPERTY);
                if (property != null) {
                    FileOutputStream fileOutputStream = new FileOutputStream(new File(property, Invoker.class.getName() + "$Dispatcher.class"));
                    try {
                        fileOutputStream.write(byteArray);
                        fileOutputStream.close();
                    } catch (Throwable th) {
                        fileOutputStream.close();
                        throw th;
                    }
                }
            } catch (Throwable unused) {
            }
            try {
                return (Invoker) new DynamicClassLoader(Invoker.class).defineClass(Invoker.class.getName() + "$Dispatcher", byteArray, 0, byteArray.length, JavaDispatcher.class.getProtectionDomain()).getConstructor(NO_PARAMETER).newInstance(NO_ARGUMENT);
            } catch (UnsupportedOperationException unused2) {
                return new DirectInvoker();
            } catch (Exception e) {
                C9620.m15032("Failed to create invoker for ".concat(Invoker.class.getName()), e);
                return null;
            }
        }

        public static Object proxy(Class<?> cls, Map<Method, Dispatcher> map) {
            Class<?> cls2;
            ClassWriter classWriter = new ClassWriter(0);
            classWriter.visit(ClassFileVersion.JAVA_V5.getMinorMajorVersion(), 1, Type.getInternalName(cls) + "$Proxy", null, Type.getInternalName(Object.class), new String[]{Type.getInternalName(cls)});
            Iterator<Map.Entry<Method, Dispatcher>> it = map.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry<Method, Dispatcher> next = it.next();
                Class<?>[] exceptionTypes = next.getKey().getExceptionTypes();
                String[] strArr = new String[exceptionTypes.length];
                for (int i = 0; i < exceptionTypes.length; i++) {
                    strArr[i] = Type.getInternalName(exceptionTypes[i]);
                }
                MethodVisitor methodVisitorVisitMethod = classWriter.visitMethod(1, next.getKey().getName(), Type.getMethodDescriptor(next.getKey()), null, strArr);
                methodVisitorVisitMethod.visitCode();
                int size = (next.getKey().getModifiers() & 8) != 0 ? 0 : 1;
                for (Class<?> cls3 : next.getKey().getParameterTypes()) {
                    size += Type.getType(cls3).getSize();
                }
                methodVisitorVisitMethod.visitMaxs(next.getValue().apply(methodVisitorVisitMethod, next.getKey()), size);
                methodVisitorVisitMethod.visitEnd();
            }
            Type type = Type.VOID_TYPE;
            MethodVisitor methodVisitorVisitMethod2 = classWriter.visitMethod(1, MethodDescription.CONSTRUCTOR_INTERNAL_NAME, Type.getMethodDescriptor(type, new Type[0]), null, null);
            methodVisitorVisitMethod2.visitCode();
            methodVisitorVisitMethod2.visitVarInsn(25, 0);
            methodVisitorVisitMethod2.visitMethodInsn(183, Type.getInternalName(Object.class), MethodDescription.CONSTRUCTOR_INTERNAL_NAME, Type.getMethodDescriptor(type, new Type[0]), false);
            methodVisitorVisitMethod2.visitInsn(177);
            methodVisitorVisitMethod2.visitMaxs(1, 1);
            methodVisitorVisitMethod2.visitEnd();
            classWriter.visitEnd();
            byte[] byteArray = classWriter.toByteArray();
            String str = DUMP_FOLDER;
            if (str != null) {
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(new File(str, cls.getName() + "$Proxy.class"));
                    try {
                        fileOutputStream.write(byteArray);
                        fileOutputStream.close();
                    } catch (Throwable th) {
                        fileOutputStream.close();
                        throw th;
                    }
                } catch (Throwable unused) {
                }
            }
            try {
                cls2 = cls;
            } catch (Exception e) {
                e = e;
                cls2 = cls;
            }
            try {
                return new DynamicClassLoader(cls2).defineClass(cls2.getName() + "$Proxy", byteArray, 0, byteArray.length, JavaDispatcher.class.getProtectionDomain()).getConstructor(NO_PARAMETER).newInstance(NO_ARGUMENT);
            } catch (Exception e2) {
                e = e2;
                C9620.m15032("Failed to create proxy for ".concat(cls2.getName()), e);
                return null;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
        public interface Resolver {

            /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
            public enum CreationAction implements PrivilegedAction<Resolver> {
                INSTANCE;

                @Override // java.security.PrivilegedAction
                public Resolver run() {
                    try {
                        Class<?> cls = Class.forName("java.lang.Module", false, null);
                        return new ForModuleSystem(Class.class.getMethod("getModule", null), cls.getMethod("isExported", String.class), cls.getMethod("addExports", String.class, cls), ClassLoader.class.getMethod("getUnnamedModule", null));
                    } catch (Exception unused) {
                        return NoOp.INSTANCE;
                    }
                }
            }

            /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
            @HashCodeAndEqualsPlugin.Enhance
            public static class ForModuleSystem implements Resolver {
                private final Method addExports;
                private final Method getModule;
                private final Method getUnnamedModule;
                private final Method isExported;

                public ForModuleSystem(Method method, Method method2, Method method3, Method method4) {
                    this.getModule = method;
                    this.isExported = method2;
                    this.addExports = method3;
                    this.getUnnamedModule = method4;
                }

                @Override // net.bytebuddy.utility.dispatcher.JavaDispatcher.DynamicClassLoader.Resolver
                public void accept(@MaybeNull ClassLoader classLoader, Class<?> cls) {
                    Package r0 = cls.getPackage();
                    if (r0 != null) {
                        try {
                            Object objInvoke = this.getModule.invoke(cls, null);
                            if (((Boolean) this.isExported.invoke(objInvoke, r0.getName())).booleanValue()) {
                                return;
                            }
                            this.addExports.invoke(objInvoke, r0.getName(), this.getUnnamedModule.invoke(classLoader, null));
                        } catch (Exception e) {
                            C9620.m15032("Failed to adjust module graph for dispatcher", e);
                        }
                    }
                }

                public boolean equals(@MaybeNull Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj == null || getClass() != obj.getClass()) {
                        return false;
                    }
                    ForModuleSystem forModuleSystem = (ForModuleSystem) obj;
                    return this.getModule.equals(forModuleSystem.getModule) && this.isExported.equals(forModuleSystem.isExported) && this.addExports.equals(forModuleSystem.addExports) && this.getUnnamedModule.equals(forModuleSystem.getUnnamedModule);
                }

                public int hashCode() {
                    return this.getUnnamedModule.hashCode() + ((this.addExports.hashCode() + ((this.isExported.hashCode() + ((this.getModule.hashCode() + (getClass().hashCode() * 31)) * 31)) * 31)) * 31);
                }
            }

            void accept(@MaybeNull ClassLoader classLoader, Class<?> cls);

            /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
            public enum NoOp implements Resolver {
                INSTANCE;

                @Override // net.bytebuddy.utility.dispatcher.JavaDispatcher.DynamicClassLoader.Resolver
                public void accept(@MaybeNull ClassLoader classLoader, Class<?> cls) {
                }
            }
        }
    }

    /* JADX INFO: renamed from: of */
    public static <T> PrivilegedAction<T> m497of(Class<T> cls, @MaybeNull ClassLoader classLoader) {
        return m498of(cls, classLoader, GENERATE);
    }

    /* JADX INFO: renamed from: of */
    public static <T> PrivilegedAction<T> m496of(Class<T> cls) {
        return m497of(cls, null);
    }
}
