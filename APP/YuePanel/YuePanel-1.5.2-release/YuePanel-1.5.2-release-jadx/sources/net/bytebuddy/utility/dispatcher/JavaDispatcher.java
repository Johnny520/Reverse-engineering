package net.bytebuddy.utility.dispatcher;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
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

    @Target({ElementType.METHOD})
    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    public @interface Container {
    }

    @Target({ElementType.TYPE, ElementType.METHOD})
    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    public @interface Defaults {
    }

    @HashCodeAndEqualsPlugin.Enhance
    public static class DirectInvoker implements Invoker {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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
        public Object invoke(Method method, @MaybeNull Object obj, @MaybeNull Object[] objArr) throws IllegalAccessException, InvocationTargetException {
            return method.invoke(obj, objArr);
        }

        @Override // net.bytebuddy.utility.Invoker
        public Object newInstance(Constructor<?> constructor, Object[] objArr) throws IllegalAccessException, InstantiationException, InvocationTargetException {
            return constructor.newInstance(objArr);
        }
    }

    public interface Dispatcher {

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
                return (getClass().hashCode() * 31) + this.constructor.hashCode();
            }

            @Override // net.bytebuddy.utility.dispatcher.JavaDispatcher.Dispatcher
            public Object invoke(Object[] objArr) throws Throwable {
                return JavaDispatcher.INVOKER.newInstance(this.constructor, objArr);
            }
        }

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
                return (getClass().hashCode() * 31) + this.target.hashCode();
            }

            @Override // net.bytebuddy.utility.dispatcher.JavaDispatcher.Dispatcher
            public Object invoke(Object[] objArr) {
                return Array.newInstance(this.target, ((Integer) objArr[0]).intValue());
            }
        }

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
                public static Dispatcher m5436of(Class<?> cls) {
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
                    return (getClass().hashCode() * 31) + this.componentType.hashCode();
                }

                @Override // net.bytebuddy.utility.dispatcher.JavaDispatcher.Dispatcher
                public Object invoke(Object[] objArr) {
                    return this.value;
                }
            }

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
            public static Dispatcher m5435of(Class<?> cls) {
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
                return cls == cls9 ? DOUBLE : cls.isArray() ? cls.getComponentType() == cls2 ? OfPrimitiveArray.BOOLEAN : cls.getComponentType() == cls3 ? OfPrimitiveArray.BYTE : cls.getComponentType() == cls4 ? OfPrimitiveArray.SHORT : cls.getComponentType() == cls5 ? OfPrimitiveArray.CHARACTER : cls.getComponentType() == cls6 ? OfPrimitiveArray.INTEGER : cls.getComponentType() == cls7 ? OfPrimitiveArray.LONG : cls.getComponentType() == cls8 ? OfPrimitiveArray.FLOAT : cls.getComponentType() == cls9 ? OfPrimitiveArray.DOUBLE : OfNonPrimitiveArray.m5436of(cls.getComponentType()) : REFERENCE;
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
                return (getClass().hashCode() * 31) + this.target.hashCode();
            }

            @Override // net.bytebuddy.utility.dispatcher.JavaDispatcher.Dispatcher
            public Object invoke(Object[] objArr) {
                return Boolean.valueOf(this.target.isInstance(objArr[0]));
            }
        }

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
                return (getClass().hashCode() * 31) + this.method.hashCode();
            }

            @Override // net.bytebuddy.utility.dispatcher.JavaDispatcher.Dispatcher
            public Object invoke(Object[] objArr) throws Throwable {
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
                return (getClass().hashCode() * 31) + this.method.hashCode();
            }

            @Override // net.bytebuddy.utility.dispatcher.JavaDispatcher.Dispatcher
            @MaybeNull
            public Object invoke(Object[] objArr) throws Throwable {
                return JavaDispatcher.INVOKER.invoke(this.method, null, objArr);
            }
        }

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
                return (getClass().hashCode() * 31) + this.message.hashCode();
            }

            @Override // net.bytebuddy.utility.dispatcher.JavaDispatcher.Dispatcher
            public Object invoke(Object[] objArr) throws Throwable {
                throw new IllegalStateException("Could not invoke proxy: " + this.message);
            }
        }

        int apply(MethodVisitor methodVisitor, Method method);

        @MaybeNull
        Object invoke(Object[] objArr) throws Throwable;
    }

    public static class DynamicClassLoader extends ClassLoader {

        @MaybeNull
        private static final String DUMP_FOLDER;
        private static final Class<?>[] NO_PARAMETER = new Class[0];
        private static final Object[] NO_ARGUMENT = new Object[0];

        public interface Resolver {

            public enum CreationAction implements PrivilegedAction<Resolver> {
                INSTANCE;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
                /* JADX DEBUG: Method merged with bridge method: run()Ljava/lang/Object; */
                @Override // java.security.PrivilegedAction
                @SuppressFBWarnings(justification = "Exception should not be rethrown but trigger a fallback.", value = {"REC_CATCH_EXCEPTION"})
                public Resolver run() {
                    try {
                        Class<?> cls = Class.forName("java.lang.Module", false, null);
                        return new ForModuleSystem(Class.class.getMethod("getModule", null), cls.getMethod("isExported", String.class), cls.getMethod("addExports", String.class, cls), ClassLoader.class.getMethod("getUnnamedModule", null));
                    } catch (Exception unused) {
                        return NoOp.INSTANCE;
                    }
                }
            }

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
                @SuppressFBWarnings(justification = "Exception should always be wrapped for clarity.", value = {"REC_CATCH_EXCEPTION"})
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
                            throw new IllegalStateException("Failed to adjust module graph for dispatcher", e);
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
                    return (((((((getClass().hashCode() * 31) + this.getModule.hashCode()) * 31) + this.isExported.hashCode()) * 31) + this.addExports.hashCode()) * 31) + this.getUnnamedModule.hashCode();
                }
            }

            public enum NoOp implements Resolver {
                INSTANCE;

                @Override // net.bytebuddy.utility.dispatcher.JavaDispatcher.DynamicClassLoader.Resolver
                public void accept(@MaybeNull ClassLoader classLoader, Class<?> cls) {
                }
            }

            void accept(@MaybeNull ClassLoader classLoader, Class<?> cls);
        }

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

        @SuppressFBWarnings(justification = "Expected internal invocation.", value = {"REC_CATCH_EXCEPTION", "DP_CREATE_CLASSLOADER_INSIDE_DO_PRIVILEGED"})
        public static Invoker invoker() {
            ClassWriter classWriter = new ClassWriter(0);
            classWriter.visit(ClassFileVersion.ofThisVm(ClassFileVersion.JAVA_V5).getMinorMajorVersion(), 1, Type.getInternalName(Invoker.class) + "$Dispatcher", null, Type.getInternalName(Object.class), new String[]{Type.getInternalName(Invoker.class)});
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
                throw new IllegalStateException("Failed to create invoker for " + Invoker.class.getName(), e);
            }
        }

        @SuppressFBWarnings(justification = "Expected internal invocation.", value = {"REC_CATCH_EXCEPTION", "DP_CREATE_CLASSLOADER_INSIDE_DO_PRIVILEGED"})
        public static Object proxy(Class<?> cls, Map<Method, Dispatcher> map) {
            ClassWriter classWriter = new ClassWriter(0);
            classWriter.visit(ClassFileVersion.ofThisVm(ClassFileVersion.JAVA_V5).getMinorMajorVersion(), 1, Type.getInternalName(cls) + "$Proxy", null, Type.getInternalName(Object.class), new String[]{Type.getInternalName(cls)});
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
                for (Class<?> cls2 : next.getKey().getParameterTypes()) {
                    size += Type.getType(cls2).getSize();
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
                try {
                    return new DynamicClassLoader(cls).defineClass(cls.getName() + "$Proxy", byteArray, 0, byteArray.length, JavaDispatcher.class.getProtectionDomain()).getConstructor(NO_PARAMETER).newInstance(NO_ARGUMENT);
                } catch (Exception e) {
                    e = e;
                    throw new IllegalStateException("Failed to create proxy for " + cls.getName(), e);
                }
            } catch (Exception e2) {
                e = e2;
            }
        }
    }

    @Target({ElementType.METHOD})
    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    public @interface Instance {
    }

    @HashCodeAndEqualsPlugin.Enhance
    public static class InvokerCreationAction implements PrivilegedAction<Invoker> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: run()Ljava/lang/Object; */
        @Override // java.security.PrivilegedAction
        public Invoker run() {
            return DynamicClassLoader.invoker();
        }
    }

    @Target({ElementType.METHOD})
    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    public @interface IsConstructor {
    }

    @Target({ElementType.METHOD})
    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    public @interface IsStatic {
    }

    @Target({ElementType.TYPE, ElementType.METHOD, ElementType.PARAMETER})
    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    public @interface Proxied {
        String value();
    }

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
            return (((getClass().hashCode() * 31) + this.name.hashCode()) * 31) + this.targets.hashCode();
        }

        /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
        @Override // java.lang.reflect.InvocationHandler
        @MaybeNull
        public Object invoke(Object obj, Method method, @MaybeNull Object[] objArr) throws Throwable {
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
                if (method.getName().equals("toString")) {
                    return "Call proxy for " + this.name;
                }
                throw new IllegalStateException("Unexpected object method: " + method);
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
                throw new IllegalStateException("Failed to invoke proxy for " + method, th);
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: of */
    public static <T> PrivilegedAction<T> m5432of(Class<T> cls) {
        return m5433of(cls, null);
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
        int iHashCode = ((getClass().hashCode() * 31) + this.proxy.hashCode()) * 31;
        ClassLoader classLoader = this.classLoader;
        if (classLoader != null) {
            iHashCode += classLoader.hashCode();
        }
        return (iHashCode * 31) + (this.generate ? 1 : 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:127:0x02ab, code lost:
    
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x02b2, code lost:
    
        if (r2[r6].isArray() == false) goto L438;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x02b4, code lost:
    
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x02b6, code lost:
    
        r2[r6] = r2[r6].getComponentType();
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x02bf, code lost:
    
        r27 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x02c5, code lost:
    
        if (r5 <= 0) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x02cd, code lost:
    
        if (r2[r6].isPrimitive() != false) goto L427;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x02cf, code lost:
    
        r25 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x02d7, code lost:
    
        r28 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x02dd, code lost:
    
        r29 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x02e1, code lost:
    
        r30 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x02ec, code lost:
    
        if (r2[r6].isAssignableFrom(java.lang.Class.forName(((net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied) r4).value(), false, r31.classLoader)) == false) goto L428;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x02ee, code lost:
    
        r5 = new java.lang.StringBuilder();
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x02f3, code lost:
    
        r7 = r25 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x02f5, code lost:
    
        if (r25 <= 0) goto L439;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x02f7, code lost:
    
        r5.append(net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.COMPONENT_TYPE_PATH);
        r25 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x02ff, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0300, code lost:
    
        r2 = r0;
        r14 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0307, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0308, code lost:
    
        r2 = r0;
        r14 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x030f, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0310, code lost:
    
        r2 = r0;
        r14 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0319, code lost:
    
        r5.append('L');
        r5.append(((net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied) r4).value());
        r5.append(net.bytebuddy.pool.TypePool.Default.LazyTypeDescription.GenericTypeToken.INDEXED_TYPE_DELIMITER);
        r2[r6] = java.lang.Class.forName(r5.toString(), false, r31.classLoader);
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0364, code lost:
    
        throw new java.lang.IllegalStateException("Cannot resolve to component type: " + ((net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied) r4).value() + " at " + r6 + " of " + r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0365, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0366, code lost:
    
        r30 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0369, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x036a, code lost:
    
        r30 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x036d, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x036e, code lost:
    
        r30 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0371, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0372, code lost:
    
        r30 = r7;
        r29 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0377, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0378, code lost:
    
        r30 = r7;
        r29 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x037d, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x037e, code lost:
    
        r30 = r7;
        r29 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0383, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x0384, code lost:
    
        r30 = r7;
        r29 = r9;
        r28 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x038c, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x038d, code lost:
    
        r30 = r7;
        r29 = r9;
        r28 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x0395, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x0396, code lost:
    
        r30 = r7;
        r29 = r9;
        r28 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x03c0, code lost:
    
        throw new java.lang.IllegalStateException("Primitive values are not supposed to be proxied: " + r6 + " of " + r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x03c1, code lost:
    
        r30 = r7;
        r29 = r9;
        r28 = r10;
        r4 = java.lang.Class.forName(((net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied) r4).value(), false, r31.classLoader);
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x03da, code lost:
    
        if (r2[r6].isAssignableFrom(r4) == false) goto L429;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x03dc, code lost:
    
        r2[r6] = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x0406, code lost:
    
        throw new java.lang.IllegalStateException("Cannot resolve to type: " + r4.getName() + " at " + r6 + " of " + r13);
     */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0562  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x059e A[Catch: all -> 0x0573, NoSuchMethodException -> 0x0577, ClassNotFoundException -> 0x057b, TryCatch #32 {ClassNotFoundException -> 0x057b, NoSuchMethodException -> 0x0577, all -> 0x0573, blocks: (B:259:0x0564, B:261:0x056a, B:269:0x0581, B:270:0x059d, B:271:0x059e, B:273:0x05a6, B:275:0x05b2, B:276:0x05ce), top: B:396:0x0564 }] */
    /* JADX WARN: Removed duplicated region for block: B:316:0x068d  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x06af  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x06ce  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x06f0  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01c1  */
    @Override // java.security.PrivilegedAction
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public T run() {
        Class<Instance> cls;
        String str;
        String str2;
        Method[] methodArr;
        Object objM5435of;
        Class<Instance> cls2;
        String str3;
        String str4;
        Class<?> cls3;
        Class<IsStatic> cls4;
        boolean z;
        Class<Defaults> cls5;
        int i;
        Class<Defaults> cls6;
        ClassNotFoundException classNotFoundException;
        Throwable th;
        NoSuchMethodException noSuchMethodException;
        Class<?>[] parameterTypes;
        boolean z2;
        int i2;
        Class<IsStatic> cls7;
        boolean z3;
        String str5 = "Instance check requires a single regular-typed argument: ";
        String str6 = "Instance check requires a boolean return type: ";
        Class<Instance> cls8 = Instance.class;
        Class<?> cls9 = Object.class;
        Class<IsStatic> cls10 = IsStatic.class;
        try {
            Object objInvoke = System.class.getMethod("getSecurityManager", null).invoke(null, null);
            if (objInvoke != null) {
                Class.forName("java.lang.SecurityManager").getMethod("checkPermission", Permission.class).invoke(objInvoke, new RuntimePermission("net.bytebuddy.createJavaDispatcher"));
            }
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
        } catch (IllegalAccessException e) {
            throw new IllegalStateException("Failed to access security manager", e);
        } catch (InvocationTargetException e2) {
            Throwable targetException = e2.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            throw new IllegalStateException("Failed to assert access rights using security manager", targetException);
        }
        Map linkedHashMap = this.generate ? new LinkedHashMap() : new HashMap();
        Class<Defaults> cls11 = Defaults.class;
        boolean zIsAnnotationPresent = this.proxy.isAnnotationPresent(cls11);
        String strValue = ((Proxied) this.proxy.getAnnotation(Proxied.class)).value();
        try {
            Class<?> cls12 = Class.forName(strValue, false, this.classLoader);
            boolean z4 = this.generate;
            Method[] methods = z4 ? (Method[]) GraalImageCode.getCurrent().sorted(this.proxy.getMethods(), MethodComparator.INSTANCE) : this.proxy.getMethods();
            int length = methods.length;
            int i3 = 0;
            while (i3 < length) {
                int i4 = length;
                Method method = methods[i3];
                Method[] methodArr2 = methods;
                if (method.getDeclaringClass() == cls9) {
                    cls2 = cls8;
                } else if (method.isAnnotationPresent(cls8)) {
                    cls2 = cls8;
                    if (method.getParameterTypes().length != 1 || !method.getParameterTypes()[0].isAssignableFrom(cls12)) {
                        throw new IllegalStateException(str5 + method);
                    }
                    if (method.getReturnType() != Boolean.TYPE) {
                        throw new IllegalStateException(str6 + method);
                    }
                    linkedHashMap.put(method, new Dispatcher.ForInstanceCheck(cls12));
                } else {
                    cls2 = cls8;
                    if (method.isAnnotationPresent(Container.class)) {
                        if (method.getParameterTypes().length != 1 || method.getParameterTypes()[0] != Integer.TYPE) {
                            throw new IllegalStateException("Container creation requires a single int-typed argument: " + method);
                        }
                        if (!method.getReturnType().isArray() || !method.getReturnType().getComponentType().isAssignableFrom(cls12)) {
                            throw new IllegalStateException("Container creation requires an assignable array as return value: " + method);
                        }
                        linkedHashMap.put(method, new Dispatcher.ForContainerCreation(cls12));
                    } else {
                        if (cls12.getName().equals("java.lang.invoke.MethodHandles") && method.getName().equals("lookup")) {
                            throw new UnsupportedOperationException("Cannot resolve Byte Buddy lookup via dispatcher");
                        }
                        try {
                            try {
                                parameterTypes = method.getParameterTypes();
                                try {
                                    str3 = str5;
                                } catch (ClassNotFoundException e3) {
                                    e = e3;
                                    str3 = str5;
                                    str4 = str6;
                                    cls3 = cls9;
                                    cls4 = cls10;
                                    z = zIsAnnotationPresent;
                                    cls5 = cls11;
                                    i = i3;
                                }
                            } catch (ClassNotFoundException e4) {
                                str3 = str5;
                                str4 = str6;
                                cls3 = cls9;
                                cls4 = cls10;
                                z = zIsAnnotationPresent;
                                cls6 = cls11;
                                i = i3;
                                classNotFoundException = e4;
                            }
                        } catch (NoSuchMethodException e5) {
                            e = e5;
                            str3 = str5;
                            str4 = str6;
                            cls3 = cls9;
                            cls4 = cls10;
                            z = zIsAnnotationPresent;
                            cls5 = cls11;
                            i = i3;
                        } catch (Throwable th2) {
                            th = th2;
                            str3 = str5;
                            str4 = str6;
                            cls3 = cls9;
                            cls4 = cls10;
                            z = zIsAnnotationPresent;
                            cls5 = cls11;
                            i = i3;
                        }
                        if (!method.isAnnotationPresent(cls10)) {
                            try {
                                if (method.isAnnotationPresent(IsConstructor.class)) {
                                    str4 = str6;
                                    cls3 = cls9;
                                    z2 = z4;
                                    i2 = 0;
                                } else {
                                    if (parameterTypes.length == 0) {
                                        throw new IllegalStateException("Expected self type: " + method);
                                    }
                                    str4 = str6;
                                    try {
                                        if (!parameterTypes[0].isAssignableFrom(cls12)) {
                                            throw new IllegalStateException("Cannot assign self type: " + cls12 + " on " + method);
                                        }
                                        int length2 = parameterTypes.length - 1;
                                        cls3 = cls9;
                                        try {
                                            Class<?>[] clsArr = new Class[length2];
                                            z2 = z4;
                                            try {
                                                System.arraycopy(parameterTypes, 1, clsArr, 0, length2);
                                                parameterTypes = clsArr;
                                                i2 = 1;
                                            } catch (ClassNotFoundException e6) {
                                                classNotFoundException = e6;
                                                cls4 = cls10;
                                                z = zIsAnnotationPresent;
                                                cls6 = cls11;
                                                i = i3;
                                                z4 = z2;
                                                linkedHashMap.put(method, (z || method.isAnnotationPresent(cls6)) ? Dispatcher.ForDefaultValue.m5435of(method.getReturnType()) : new Dispatcher.ForUnresolvedMethod("Class not available on current VM: " + classNotFoundException.getMessage()));
                                                i3 = i + 1;
                                                cls10 = cls4;
                                                cls11 = cls6;
                                                length = i4;
                                                methods = methodArr2;
                                                cls8 = cls2;
                                                str5 = str3;
                                                str6 = str4;
                                                cls9 = cls3;
                                                zIsAnnotationPresent = z;
                                            } catch (NoSuchMethodException e7) {
                                                noSuchMethodException = e7;
                                                cls4 = cls10;
                                                z = zIsAnnotationPresent;
                                                cls5 = cls11;
                                                i = i3;
                                                z4 = z2;
                                                cls6 = cls5;
                                                linkedHashMap.put(method, (z || method.isAnnotationPresent(cls6)) ? Dispatcher.ForDefaultValue.m5435of(method.getReturnType()) : new Dispatcher.ForUnresolvedMethod("Method not available on current VM: " + noSuchMethodException.getMessage()));
                                                i3 = i + 1;
                                                cls10 = cls4;
                                                cls11 = cls6;
                                                length = i4;
                                                methods = methodArr2;
                                                cls8 = cls2;
                                                str5 = str3;
                                                str6 = str4;
                                                cls9 = cls3;
                                                zIsAnnotationPresent = z;
                                            } catch (Throwable th3) {
                                                th = th3;
                                                cls4 = cls10;
                                                z = zIsAnnotationPresent;
                                                cls5 = cls11;
                                                i = i3;
                                                z4 = z2;
                                                linkedHashMap.put(method, new Dispatcher.ForUnresolvedMethod("Unexpected error: " + th.getMessage()));
                                                cls6 = cls5;
                                                i3 = i + 1;
                                                cls10 = cls4;
                                                cls11 = cls6;
                                                length = i4;
                                                methods = methodArr2;
                                                cls8 = cls2;
                                                str5 = str3;
                                                str6 = str4;
                                                cls9 = cls3;
                                                zIsAnnotationPresent = z;
                                            }
                                        } catch (ClassNotFoundException e8) {
                                            e = e8;
                                            classNotFoundException = e;
                                            cls4 = cls10;
                                            z = zIsAnnotationPresent;
                                            cls6 = cls11;
                                            i = i3;
                                            if (z) {
                                            }
                                            i3 = i + 1;
                                            cls10 = cls4;
                                            cls11 = cls6;
                                            length = i4;
                                            methods = methodArr2;
                                            cls8 = cls2;
                                            str5 = str3;
                                            str6 = str4;
                                            cls9 = cls3;
                                            zIsAnnotationPresent = z;
                                        } catch (NoSuchMethodException e9) {
                                            e = e9;
                                            noSuchMethodException = e;
                                            cls4 = cls10;
                                            z = zIsAnnotationPresent;
                                            cls5 = cls11;
                                            i = i3;
                                            cls6 = cls5;
                                            if (z) {
                                            }
                                            i3 = i + 1;
                                            cls10 = cls4;
                                            cls11 = cls6;
                                            length = i4;
                                            methods = methodArr2;
                                            cls8 = cls2;
                                            str5 = str3;
                                            str6 = str4;
                                            cls9 = cls3;
                                            zIsAnnotationPresent = z;
                                        } catch (Throwable th4) {
                                            th = th4;
                                            th = th;
                                            cls4 = cls10;
                                            z = zIsAnnotationPresent;
                                            cls5 = cls11;
                                            i = i3;
                                            linkedHashMap.put(method, new Dispatcher.ForUnresolvedMethod("Unexpected error: " + th.getMessage()));
                                            cls6 = cls5;
                                            i3 = i + 1;
                                            cls10 = cls4;
                                            cls11 = cls6;
                                            length = i4;
                                            methods = methodArr2;
                                            cls8 = cls2;
                                            str5 = str3;
                                            str6 = str4;
                                            cls9 = cls3;
                                            zIsAnnotationPresent = z;
                                        }
                                    } catch (ClassNotFoundException e10) {
                                        e = e10;
                                        cls3 = cls9;
                                        classNotFoundException = e;
                                        cls4 = cls10;
                                        z = zIsAnnotationPresent;
                                        cls6 = cls11;
                                        i = i3;
                                        if (z) {
                                        }
                                        i3 = i + 1;
                                        cls10 = cls4;
                                        cls11 = cls6;
                                        length = i4;
                                        methods = methodArr2;
                                        cls8 = cls2;
                                        str5 = str3;
                                        str6 = str4;
                                        cls9 = cls3;
                                        zIsAnnotationPresent = z;
                                    } catch (NoSuchMethodException e11) {
                                        e = e11;
                                        cls3 = cls9;
                                        noSuchMethodException = e;
                                        cls4 = cls10;
                                        z = zIsAnnotationPresent;
                                        cls5 = cls11;
                                        i = i3;
                                        cls6 = cls5;
                                        if (z) {
                                        }
                                        i3 = i + 1;
                                        cls10 = cls4;
                                        cls11 = cls6;
                                        length = i4;
                                        methods = methodArr2;
                                        cls8 = cls2;
                                        str5 = str3;
                                        str6 = str4;
                                        cls9 = cls3;
                                        zIsAnnotationPresent = z;
                                    } catch (Throwable th5) {
                                        th = th5;
                                        cls3 = cls9;
                                        th = th;
                                        cls4 = cls10;
                                        z = zIsAnnotationPresent;
                                        cls5 = cls11;
                                        i = i3;
                                        linkedHashMap.put(method, new Dispatcher.ForUnresolvedMethod("Unexpected error: " + th.getMessage()));
                                        cls6 = cls5;
                                        i3 = i + 1;
                                        cls10 = cls4;
                                        cls11 = cls6;
                                        length = i4;
                                        methods = methodArr2;
                                        cls8 = cls2;
                                        str5 = str3;
                                        str6 = str4;
                                        cls9 = cls3;
                                        zIsAnnotationPresent = z;
                                    }
                                }
                                try {
                                    Annotation[][] parameterAnnotations = method.getParameterAnnotations();
                                    int i5 = 0;
                                    while (i5 < parameterTypes.length) {
                                        try {
                                            Annotation[] annotationArr = parameterAnnotations[i5 + i2];
                                            int i6 = i2;
                                            int length3 = annotationArr.length;
                                            Annotation[][] annotationArr2 = parameterAnnotations;
                                            int i7 = 0;
                                            while (true) {
                                                if (i7 >= length3) {
                                                    cls7 = cls10;
                                                    z = zIsAnnotationPresent;
                                                    cls5 = cls11;
                                                    i = i3;
                                                    break;
                                                }
                                                int i8 = length3;
                                                Annotation annotation = annotationArr[i7];
                                                Annotation[] annotationArr3 = annotationArr;
                                                if (annotation instanceof Proxied) {
                                                    break;
                                                }
                                                i7++;
                                                length3 = i8;
                                                annotationArr = annotationArr3;
                                            }
                                            i5++;
                                            i2 = i6;
                                            parameterAnnotations = annotationArr2;
                                            i3 = i;
                                            cls11 = cls5;
                                            zIsAnnotationPresent = z;
                                            cls10 = cls7;
                                        } catch (ClassNotFoundException e12) {
                                            e = e12;
                                            cls7 = cls10;
                                            z = zIsAnnotationPresent;
                                            cls5 = cls11;
                                            i = i3;
                                        } catch (NoSuchMethodException e13) {
                                            e = e13;
                                            cls7 = cls10;
                                            z = zIsAnnotationPresent;
                                            cls5 = cls11;
                                            i = i3;
                                        } catch (Throwable th6) {
                                            th = th6;
                                            cls7 = cls10;
                                            z = zIsAnnotationPresent;
                                            cls5 = cls11;
                                            i = i3;
                                        }
                                    }
                                    cls7 = cls10;
                                    z = zIsAnnotationPresent;
                                    cls5 = cls11;
                                    i = i3;
                                    try {
                                        if (method.isAnnotationPresent(IsConstructor.class)) {
                                            Constructor<?> constructor = cls12.getConstructor(parameterTypes);
                                            if (!method.getReturnType().isAssignableFrom(cls12)) {
                                                throw new IllegalStateException("Cannot assign " + constructor.getDeclaringClass().getName() + " to " + method);
                                            }
                                            if ((constructor.getModifiers() & 1) == 0 || (cls12.getModifiers() & 1) == 0) {
                                                constructor.setAccessible(true);
                                                z4 = false;
                                            } else {
                                                z4 = z2;
                                            }
                                            try {
                                                linkedHashMap.put(method, new Dispatcher.ForConstructor(constructor));
                                                cls4 = cls7;
                                            } catch (ClassNotFoundException e14) {
                                                classNotFoundException = e14;
                                                cls6 = cls5;
                                                cls4 = cls7;
                                                if (z) {
                                                }
                                                i3 = i + 1;
                                                cls10 = cls4;
                                                cls11 = cls6;
                                                length = i4;
                                                methods = methodArr2;
                                                cls8 = cls2;
                                                str5 = str3;
                                                str6 = str4;
                                                cls9 = cls3;
                                                zIsAnnotationPresent = z;
                                            } catch (NoSuchMethodException e15) {
                                                noSuchMethodException = e15;
                                                cls4 = cls7;
                                                cls6 = cls5;
                                                if (z) {
                                                }
                                                i3 = i + 1;
                                                cls10 = cls4;
                                                cls11 = cls6;
                                                length = i4;
                                                methods = methodArr2;
                                                cls8 = cls2;
                                                str5 = str3;
                                                str6 = str4;
                                                cls9 = cls3;
                                                zIsAnnotationPresent = z;
                                            } catch (Throwable th7) {
                                                th = th7;
                                                cls4 = cls7;
                                                linkedHashMap.put(method, new Dispatcher.ForUnresolvedMethod("Unexpected error: " + th.getMessage()));
                                            }
                                        } else {
                                            Proxied proxied = (Proxied) method.getAnnotation(Proxied.class);
                                            Method method2 = cls12.getMethod(proxied == null ? method.getName() : proxied.value(), parameterTypes);
                                            if (method.getReturnType().isAssignableFrom(method2.getReturnType())) {
                                                for (Class<?> cls13 : method2.getExceptionTypes()) {
                                                    if (!RuntimeException.class.isAssignableFrom(cls13) && !Error.class.isAssignableFrom(cls13)) {
                                                        for (Class<?> cls14 : method.getExceptionTypes()) {
                                                            if (!cls14.isAssignableFrom(cls13)) {
                                                            }
                                                        }
                                                        throw new IllegalStateException("Resolved method for " + method + " throws undeclared checked exception " + cls13.getName());
                                                    }
                                                }
                                                try {
                                                    if ((method2.getModifiers() & 1) == 0) {
                                                        z3 = true;
                                                    } else if ((method2.getDeclaringClass().getModifiers() & 1) == 0) {
                                                        z3 = true;
                                                    } else {
                                                        z4 = z2;
                                                        if (Modifier.isStatic(method2.getModifiers())) {
                                                            cls4 = cls7;
                                                            if (method.isAnnotationPresent(cls4)) {
                                                                throw new IllegalStateException("Resolved method for " + method + " was expected to be virtual: " + method2);
                                                            }
                                                            linkedHashMap.put(method, new Dispatcher.ForNonStaticMethod(method2));
                                                        } else {
                                                            cls4 = cls7;
                                                            try {
                                                                if (!method.isAnnotationPresent(cls4)) {
                                                                    throw new IllegalStateException("Resolved method for " + method + " was expected to be static: " + method2);
                                                                }
                                                                linkedHashMap.put(method, new Dispatcher.ForStaticMethod(method2));
                                                            } catch (ClassNotFoundException e16) {
                                                                e = e16;
                                                                classNotFoundException = e;
                                                                cls6 = cls5;
                                                                if (z) {
                                                                    linkedHashMap.put(method, (z || method.isAnnotationPresent(cls6)) ? Dispatcher.ForDefaultValue.m5435of(method.getReturnType()) : new Dispatcher.ForUnresolvedMethod("Class not available on current VM: " + classNotFoundException.getMessage()));
                                                                }
                                                                i3 = i + 1;
                                                                cls10 = cls4;
                                                                cls11 = cls6;
                                                                length = i4;
                                                                methods = methodArr2;
                                                                cls8 = cls2;
                                                                str5 = str3;
                                                                str6 = str4;
                                                                cls9 = cls3;
                                                                zIsAnnotationPresent = z;
                                                            } catch (NoSuchMethodException e17) {
                                                                e = e17;
                                                                noSuchMethodException = e;
                                                                cls6 = cls5;
                                                                if (z) {
                                                                    linkedHashMap.put(method, (z || method.isAnnotationPresent(cls6)) ? Dispatcher.ForDefaultValue.m5435of(method.getReturnType()) : new Dispatcher.ForUnresolvedMethod("Method not available on current VM: " + noSuchMethodException.getMessage()));
                                                                }
                                                                i3 = i + 1;
                                                                cls10 = cls4;
                                                                cls11 = cls6;
                                                                length = i4;
                                                                methods = methodArr2;
                                                                cls8 = cls2;
                                                                str5 = str3;
                                                                str6 = str4;
                                                                cls9 = cls3;
                                                                zIsAnnotationPresent = z;
                                                            } catch (Throwable th8) {
                                                                th = th8;
                                                                th = th;
                                                                linkedHashMap.put(method, new Dispatcher.ForUnresolvedMethod("Unexpected error: " + th.getMessage()));
                                                            }
                                                        }
                                                    }
                                                    if (Modifier.isStatic(method2.getModifiers())) {
                                                    }
                                                } catch (ClassNotFoundException e18) {
                                                    e = e18;
                                                    cls4 = cls7;
                                                } catch (NoSuchMethodException e19) {
                                                    e = e19;
                                                    cls4 = cls7;
                                                } catch (Throwable th9) {
                                                    th = th9;
                                                    cls4 = cls7;
                                                }
                                                method2.setAccessible(z3);
                                                z4 = false;
                                            } else {
                                                cls4 = cls7;
                                                try {
                                                    throw new IllegalStateException("Cannot assign " + method2.getReturnType().getName() + " to " + method);
                                                } catch (ClassNotFoundException e20) {
                                                    e = e20;
                                                    classNotFoundException = e;
                                                    z4 = z2;
                                                    cls6 = cls5;
                                                    if (z) {
                                                    }
                                                    i3 = i + 1;
                                                    cls10 = cls4;
                                                    cls11 = cls6;
                                                    length = i4;
                                                    methods = methodArr2;
                                                    cls8 = cls2;
                                                    str5 = str3;
                                                    str6 = str4;
                                                    cls9 = cls3;
                                                    zIsAnnotationPresent = z;
                                                } catch (NoSuchMethodException e21) {
                                                    e = e21;
                                                    noSuchMethodException = e;
                                                    z4 = z2;
                                                    cls6 = cls5;
                                                    if (z) {
                                                    }
                                                    i3 = i + 1;
                                                    cls10 = cls4;
                                                    cls11 = cls6;
                                                    length = i4;
                                                    methods = methodArr2;
                                                    cls8 = cls2;
                                                    str5 = str3;
                                                    str6 = str4;
                                                    cls9 = cls3;
                                                    zIsAnnotationPresent = z;
                                                } catch (Throwable th10) {
                                                    th = th10;
                                                    th = th;
                                                    z4 = z2;
                                                    linkedHashMap.put(method, new Dispatcher.ForUnresolvedMethod("Unexpected error: " + th.getMessage()));
                                                    cls6 = cls5;
                                                    i3 = i + 1;
                                                    cls10 = cls4;
                                                    cls11 = cls6;
                                                    length = i4;
                                                    methods = methodArr2;
                                                    cls8 = cls2;
                                                    str5 = str3;
                                                    str6 = str4;
                                                    cls9 = cls3;
                                                    zIsAnnotationPresent = z;
                                                }
                                            }
                                        }
                                    } catch (ClassNotFoundException e22) {
                                        e = e22;
                                        cls4 = cls7;
                                    } catch (NoSuchMethodException e23) {
                                        e = e23;
                                        cls4 = cls7;
                                    } catch (Throwable th11) {
                                        th = th11;
                                        cls4 = cls7;
                                    }
                                } catch (ClassNotFoundException e24) {
                                    e = e24;
                                    cls4 = cls10;
                                    z = zIsAnnotationPresent;
                                    cls5 = cls11;
                                    i = i3;
                                } catch (NoSuchMethodException e25) {
                                    e = e25;
                                    cls4 = cls10;
                                    z = zIsAnnotationPresent;
                                    cls5 = cls11;
                                    i = i3;
                                } catch (Throwable th12) {
                                    th = th12;
                                    cls4 = cls10;
                                    z = zIsAnnotationPresent;
                                    cls5 = cls11;
                                    i = i3;
                                }
                            } catch (ClassNotFoundException e26) {
                                e = e26;
                                str4 = str6;
                            } catch (NoSuchMethodException e27) {
                                e = e27;
                                str4 = str6;
                            } catch (Throwable th13) {
                                th = th13;
                                str4 = str6;
                            }
                            cls6 = cls5;
                        }
                        i3 = i + 1;
                        cls10 = cls4;
                        cls11 = cls6;
                        length = i4;
                        methods = methodArr2;
                        cls8 = cls2;
                        str5 = str3;
                        str6 = str4;
                        cls9 = cls3;
                        zIsAnnotationPresent = z;
                    }
                }
                str3 = str5;
                str4 = str6;
                cls3 = cls9;
                cls4 = cls10;
                z = zIsAnnotationPresent;
                cls6 = cls11;
                i = i3;
                i3 = i + 1;
                cls10 = cls4;
                cls11 = cls6;
                length = i4;
                methods = methodArr2;
                cls8 = cls2;
                str5 = str3;
                str6 = str4;
                cls9 = cls3;
                zIsAnnotationPresent = z;
            }
            return z4 ? (T) DynamicClassLoader.proxy(this.proxy, linkedHashMap) : (T) Proxy.newProxyInstance(this.proxy.getClassLoader(), new Class[]{this.proxy}, new ProxiedInvocationHandler(cls12.getName(), linkedHashMap));
        } catch (ClassNotFoundException e28) {
            String str7 = "Instance check requires a single regular-typed argument: ";
            String str8 = "Instance check requires a boolean return type: ";
            Class<Instance> cls15 = cls8;
            Class<?> cls16 = cls9;
            Method[] methods2 = this.generate ? (Method[]) GraalImageCode.getCurrent().sorted(this.proxy.getMethods(), MethodComparator.INSTANCE) : this.proxy.getMethods();
            int length4 = methods2.length;
            int i9 = 0;
            while (i9 < length4) {
                Method method3 = methods2[i9];
                Class<?> cls17 = cls16;
                if (method3.getDeclaringClass() == cls17) {
                    methodArr = methods2;
                    cls = cls15;
                } else {
                    cls = cls15;
                    if (!method3.isAnnotationPresent(cls)) {
                        str = str7;
                        str2 = str8;
                        if (zIsAnnotationPresent || method3.isAnnotationPresent(cls11)) {
                            methodArr = methods2;
                            objM5435of = Dispatcher.ForDefaultValue.m5435of(method3.getReturnType());
                        } else {
                            StringBuilder sb = new StringBuilder();
                            methodArr = methods2;
                            sb.append("Type not available on current VM: ");
                            sb.append(e28.getMessage());
                            objM5435of = new Dispatcher.ForUnresolvedMethod(sb.toString());
                        }
                        linkedHashMap.put(method3, objM5435of);
                        i9++;
                        cls15 = cls;
                        cls16 = cls17;
                        str8 = str2;
                        str7 = str;
                        methods2 = methodArr;
                    } else {
                        if (method3.getParameterTypes().length != 1 || method3.getParameterTypes()[0].isPrimitive() || method3.getParameterTypes()[0].isArray()) {
                            throw new IllegalStateException(str7 + method3);
                        }
                        if (method3.getReturnType() != Boolean.TYPE) {
                            throw new IllegalStateException(str8 + method3);
                        }
                        linkedHashMap.put(method3, Dispatcher.ForDefaultValue.BOOLEAN);
                        methodArr = methods2;
                    }
                }
                str = str7;
                str2 = str8;
                i9++;
                cls15 = cls;
                cls16 = cls17;
                str8 = str2;
                str7 = str;
                methods2 = methodArr;
            }
            return this.generate ? (T) DynamicClassLoader.proxy(this.proxy, linkedHashMap) : (T) Proxy.newProxyInstance(this.proxy.getClassLoader(), new Class[]{this.proxy}, new ProxiedInvocationHandler(strValue, linkedHashMap));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX INFO: renamed from: of */
    public static <T> PrivilegedAction<T> m5433of(Class<T> cls, @MaybeNull ClassLoader classLoader) {
        return m5434of(cls, classLoader, GENERATE);
    }

    /* JADX INFO: renamed from: of */
    public static <T> PrivilegedAction<T> m5434of(Class<T> cls, @MaybeNull ClassLoader classLoader, boolean z) {
        if (cls.isInterface()) {
            if (!cls.isAnnotationPresent(Proxied.class)) {
                throw new IllegalArgumentException("Expected " + cls.getName() + " to be annotated with " + Proxied.class.getName());
            }
            if (!((Proxied) cls.getAnnotation(Proxied.class)).value().startsWith("java.security.")) {
                return new JavaDispatcher(cls, classLoader, z);
            }
            throw new IllegalArgumentException("Classes related to Java security cannot be proxied: " + cls.getName());
        }
        throw new IllegalArgumentException("Expected an interface instead of " + cls);
    }
}
