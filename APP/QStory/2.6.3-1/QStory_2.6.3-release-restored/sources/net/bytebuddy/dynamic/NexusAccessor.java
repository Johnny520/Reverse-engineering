package net.bytebuddy.dynamic;

import bsh.C3466;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.Arrays;
import java.util.Collections;
import net.bytebuddy.build.AccessControllerPlugin;
import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.description.method.MethodDescription;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.dynamic.ClassFileLocator;
import net.bytebuddy.dynamic.loading.ClassInjector;
import net.bytebuddy.dynamic.loading.ClassLoadingStrategy;
import net.bytebuddy.implementation.Implementation;
import net.bytebuddy.implementation.LoadedTypeInitializer;
import net.bytebuddy.implementation.bytecode.ByteCodeAppender;
import net.bytebuddy.implementation.bytecode.Removal;
import net.bytebuddy.implementation.bytecode.StackManipulation;
import net.bytebuddy.implementation.bytecode.collection.ArrayFactory;
import net.bytebuddy.implementation.bytecode.constant.ClassConstant;
import net.bytebuddy.implementation.bytecode.constant.IntegerConstant;
import net.bytebuddy.implementation.bytecode.constant.NullConstant;
import net.bytebuddy.implementation.bytecode.constant.TextConstant;
import net.bytebuddy.implementation.bytecode.member.MethodInvocation;
import net.bytebuddy.jar.asm.MethodVisitor;
import net.bytebuddy.utility.JavaModule;
import net.bytebuddy.utility.nullability.MaybeNull;
import p352.C9620;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@HashCodeAndEqualsPlugin.Enhance
public class NexusAccessor {
    private static final boolean ACCESS_CONTROLLER;
    private static final Dispatcher DISPATCHER;

    @MaybeNull
    @HashCodeAndEqualsPlugin.ValueHandling(HashCodeAndEqualsPlugin.ValueHandling.Sort.REVERSE_NULLABILITY)
    private final ReferenceQueue<? super ClassLoader> referenceQueue;

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public interface Dispatcher {

        /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
        @HashCodeAndEqualsPlugin.Enhance
        public static class Available implements Dispatcher {
            private final Method clean;
            private final Method register;

            public Available(Method method, Method method2) {
                this.register = method;
                this.clean = method2;
            }

            @Override // net.bytebuddy.dynamic.NexusAccessor.Dispatcher
            public void clean(Reference<? extends ClassLoader> reference) {
                try {
                    this.clean.invoke(null, reference);
                } catch (IllegalAccessException e) {
                    C3466.m5897(e);
                } catch (InvocationTargetException e2) {
                    C3466.m5897(e2.getTargetException());
                }
            }

            public boolean equals(@MaybeNull Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                Available available = (Available) obj;
                return this.register.equals(available.register) && this.clean.equals(available.clean);
            }

            public int hashCode() {
                return this.clean.hashCode() + ((this.register.hashCode() + (getClass().hashCode() * 31)) * 31);
            }

            @Override // net.bytebuddy.dynamic.NexusAccessor.Dispatcher
            public boolean isAlive() {
                return true;
            }

            @Override // net.bytebuddy.dynamic.NexusAccessor.Dispatcher
            public void register(String str, @MaybeNull ClassLoader classLoader, @MaybeNull ReferenceQueue<? super ClassLoader> referenceQueue, int i, LoadedTypeInitializer loadedTypeInitializer) {
                try {
                    this.register.invoke(null, str, classLoader, referenceQueue, Integer.valueOf(i), loadedTypeInitializer);
                } catch (IllegalAccessException e) {
                    C3466.m5897(e);
                } catch (InvocationTargetException e2) {
                    C3466.m5897(e2.getTargetException());
                }
            }
        }

        /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
        public enum CreationAction implements PrivilegedAction<Dispatcher> {
            INSTANCE;

            @Override // java.security.PrivilegedAction
            public Dispatcher run() {
                Class cls = Integer.TYPE;
                if (Boolean.getBoolean(Nexus.PROPERTY)) {
                    return new Unavailable("Nexus injection was explicitly disabled");
                }
                try {
                    Class<?> cls2 = new ClassInjector.UsingReflection(ClassLoader.getSystemClassLoader(), ClassLoadingStrategy.NO_PROTECTION_DOMAIN).inject(Collections.singletonMap(TypeDescription.ForLoadedType.m289of(Nexus.class), ClassFileLocator.ForClassLoader.read((Class<?>) Nexus.class))).get(TypeDescription.ForLoadedType.m289of(Nexus.class));
                    return new Available(cls2.getMethod("register", String.class, ClassLoader.class, ReferenceQueue.class, cls, Object.class), cls2.getMethod("clean", Reference.class));
                } catch (Exception e) {
                    try {
                        Class<?> clsLoadClass = ClassLoader.getSystemClassLoader().loadClass(Nexus.class.getName());
                        try {
                            JavaModule javaModuleOfType = JavaModule.ofType(NexusAccessor.class);
                            JavaModule javaModuleOfType2 = JavaModule.ofType(clsLoadClass);
                            if (javaModuleOfType != null && !javaModuleOfType.canRead(javaModuleOfType2)) {
                                Class<?> cls3 = Class.forName("java.lang.Module");
                                cls3.getMethod("addReads", cls3).invoke(javaModuleOfType.unwrap(), javaModuleOfType2.unwrap());
                            }
                            return new Available(clsLoadClass.getMethod("register", String.class, ClassLoader.class, ReferenceQueue.class, cls, Object.class), clsLoadClass.getMethod("clean", Reference.class));
                        } catch (Exception e2) {
                            return new Unavailable(e2.toString());
                        }
                    } catch (Exception unused) {
                        return new Unavailable(e.toString());
                    }
                }
            }
        }

        /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
        @HashCodeAndEqualsPlugin.Enhance
        public static class Unavailable implements Dispatcher {
            private final String message;

            public Unavailable(String str) {
                this.message = str;
            }

            @Override // net.bytebuddy.dynamic.NexusAccessor.Dispatcher
            public void clean(Reference<? extends ClassLoader> reference) {
                throw new UnsupportedOperationException("Could not initialize Nexus accessor: " + this.message);
            }

            public boolean equals(@MaybeNull Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && getClass() == obj.getClass() && this.message.equals(((Unavailable) obj).message);
            }

            public int hashCode() {
                return this.message.hashCode() + (getClass().hashCode() * 31);
            }

            @Override // net.bytebuddy.dynamic.NexusAccessor.Dispatcher
            public boolean isAlive() {
                return false;
            }

            @Override // net.bytebuddy.dynamic.NexusAccessor.Dispatcher
            public void register(String str, @MaybeNull ClassLoader classLoader, @MaybeNull ReferenceQueue<? super ClassLoader> referenceQueue, int i, LoadedTypeInitializer loadedTypeInitializer) {
                throw new UnsupportedOperationException("Could not initialize Nexus accessor: " + this.message);
            }
        }

        void clean(Reference<? extends ClassLoader> reference);

        boolean isAlive();

        void register(String str, @MaybeNull ClassLoader classLoader, @MaybeNull ReferenceQueue<? super ClassLoader> referenceQueue, int i, LoadedTypeInitializer loadedTypeInitializer);
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @HashCodeAndEqualsPlugin.Enhance
    public static class InitializationAppender implements ByteCodeAppender {
        private final int identification;

        public InitializationAppender(int i) {
            this.identification = i;
        }

        @Override // net.bytebuddy.implementation.bytecode.ByteCodeAppender
        public ByteCodeAppender.Size apply(MethodVisitor methodVisitor, Implementation.Context context, MethodDescription methodDescription) {
            ByteCodeAppender.Size size;
            try {
                MethodInvocation.WithImplicitInvocationTargetType withImplicitInvocationTargetTypeInvoke = MethodInvocation.invoke((MethodDescription.InDefinedShape) new MethodDescription.ForLoadedMethod(ClassLoader.class.getMethod("getSystemClassLoader", null)));
                TextConstant textConstant = new TextConstant(Nexus.class.getName());
                MethodInvocation.WithImplicitInvocationTargetType withImplicitInvocationTargetTypeInvoke2 = MethodInvocation.invoke((MethodDescription.InDefinedShape) new MethodDescription.ForLoadedMethod(ClassLoader.class.getMethod("loadClass", String.class)));
                TextConstant textConstant2 = new TextConstant("initialize");
                ArrayFactory arrayFactoryForType = ArrayFactory.forType(TypeDescription.Generic.OfNonGenericType.ForLoadedType.m296of(Class.class));
                StackManipulation stackManipulationM442of = ClassConstant.m442of(TypeDescription.ForLoadedType.m289of(Class.class));
                Class cls = Integer.TYPE;
                size = null;
                try {
                    return new ByteCodeAppender.Simple(new StackManipulation.Compound(withImplicitInvocationTargetTypeInvoke, textConstant, withImplicitInvocationTargetTypeInvoke2, textConstant2, arrayFactoryForType.withValues(Arrays.asList(stackManipulationM442of, ClassConstant.m442of(TypeDescription.ForLoadedType.m289of(cls)))), MethodInvocation.invoke((MethodDescription.InDefinedShape) new MethodDescription.ForLoadedMethod(Class.class.getMethod("getMethod", String.class, Class[].class))), NullConstant.INSTANCE, ArrayFactory.forType(TypeDescription.Generic.OfNonGenericType.ForLoadedType.m296of(Object.class)).withValues(Arrays.asList(ClassConstant.m442of(methodDescription.getDeclaringType().asErasure()), new StackManipulation.Compound(IntegerConstant.forValue(this.identification), MethodInvocation.invoke((MethodDescription.InDefinedShape) new MethodDescription.ForLoadedMethod(Integer.class.getMethod("valueOf", cls)))))), MethodInvocation.invoke((MethodDescription.InDefinedShape) new MethodDescription.ForLoadedMethod(Method.class.getMethod("invoke", Object.class, Object[].class))), Removal.SINGLE)).apply(methodVisitor, context, methodDescription);
                } catch (NoSuchMethodException e) {
                    e = e;
                    C9620.m15032("Cannot locate method", e);
                    return size;
                }
            } catch (NoSuchMethodException e2) {
                e = e2;
                size = null;
            }
        }

        public boolean equals(@MaybeNull Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass() && this.identification == ((InitializationAppender) obj).identification;
        }

        public int hashCode() {
            return (getClass().hashCode() * 31) + this.identification;
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
        DISPATCHER = (Dispatcher) doPrivileged(Dispatcher.CreationAction.INSTANCE);
    }

    public NexusAccessor(@MaybeNull ReferenceQueue<? super ClassLoader> referenceQueue) {
        this.referenceQueue = referenceQueue;
    }

    public static void clean(Reference<? extends ClassLoader> reference) {
        DISPATCHER.clean(reference);
    }

    @AccessControllerPlugin.Enhance
    private static <T> T doPrivileged(PrivilegedAction<T> privilegedAction) {
        return ACCESS_CONTROLLER ? (T) AccessController.doPrivileged(privilegedAction) : privilegedAction.run();
    }

    public static boolean isAlive() {
        return DISPATCHER.isAlive();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0027 A[RETURN] */
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
        ReferenceQueue<? super ClassLoader> referenceQueue = this.referenceQueue;
        ReferenceQueue<? super ClassLoader> referenceQueue2 = ((NexusAccessor) obj).referenceQueue;
        if (referenceQueue2 != null) {
            return referenceQueue != null && referenceQueue.equals(referenceQueue2);
        }
        if (referenceQueue != null) {
            return false;
        }
    }

    public int hashCode() {
        int iHashCode = getClass().hashCode() * 31;
        ReferenceQueue<? super ClassLoader> referenceQueue = this.referenceQueue;
        return referenceQueue != null ? referenceQueue.hashCode() + iHashCode : iHashCode;
    }

    public void register(String str, @MaybeNull ClassLoader classLoader, int i, LoadedTypeInitializer loadedTypeInitializer) {
        if (loadedTypeInitializer.isAlive()) {
            DISPATCHER.register(str, classLoader, this.referenceQueue, i, loadedTypeInitializer);
        }
    }

    public NexusAccessor() {
        this(null);
    }
}
