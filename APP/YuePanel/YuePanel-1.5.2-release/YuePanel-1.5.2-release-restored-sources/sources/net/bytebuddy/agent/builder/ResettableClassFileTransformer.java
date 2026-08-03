package net.bytebuddy.agent.builder;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.lang.instrument.ClassFileTransformer;
import java.lang.instrument.IllegalClassFormatException;
import java.lang.instrument.Instrumentation;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.security.ProtectionDomain;
import java.util.Iterator;
import net.bytebuddy.ByteBuddy;
import net.bytebuddy.agent.builder.AgentBuilder;
import net.bytebuddy.build.AccessControllerPlugin;
import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.dynamic.DynamicType;
import net.bytebuddy.dynamic.loading.ClassLoadingStrategy;
import net.bytebuddy.dynamic.scaffold.TypeValidation;
import net.bytebuddy.implementation.MethodCall;
import net.bytebuddy.matcher.ElementMatcher;
import net.bytebuddy.matcher.ElementMatchers;
import net.bytebuddy.utility.JavaModule;
import net.bytebuddy.utility.JavaType;
import net.bytebuddy.utility.nullability.MaybeNull;

/* JADX INFO: loaded from: classes2.dex */
public interface ResettableClassFileTransformer extends ClassFileTransformer {

    public static abstract class AbstractBase implements ResettableClassFileTransformer {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // net.bytebuddy.agent.builder.ResettableClassFileTransformer
        public boolean reset(Instrumentation instrumentation, AgentBuilder.RedefinitionStrategy redefinitionStrategy) {
            return reset(instrumentation, redefinitionStrategy, AgentBuilder.RedefinitionStrategy.BatchAllocator.ForTotal.INSTANCE);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        @Override // net.bytebuddy.agent.builder.ResettableClassFileTransformer
        public boolean reset(Instrumentation instrumentation, AgentBuilder.RedefinitionStrategy redefinitionStrategy, AgentBuilder.RedefinitionStrategy.BatchAllocator batchAllocator) {
            return reset(instrumentation, redefinitionStrategy, batchAllocator, AgentBuilder.RedefinitionStrategy.Listener.NoOp.INSTANCE);
        }

        @Override // net.bytebuddy.agent.builder.ResettableClassFileTransformer
        public boolean reset(Instrumentation instrumentation, AgentBuilder.RedefinitionStrategy redefinitionStrategy, AgentBuilder.RedefinitionStrategy.DiscoveryStrategy discoveryStrategy) {
            return reset(instrumentation, redefinitionStrategy, discoveryStrategy, AgentBuilder.RedefinitionStrategy.Listener.NoOp.INSTANCE);
        }

        @Override // net.bytebuddy.agent.builder.ResettableClassFileTransformer
        public boolean reset(Instrumentation instrumentation, AgentBuilder.RedefinitionStrategy redefinitionStrategy, AgentBuilder.RedefinitionStrategy.BatchAllocator batchAllocator, AgentBuilder.RedefinitionStrategy.DiscoveryStrategy discoveryStrategy) {
            return reset(instrumentation, redefinitionStrategy, discoveryStrategy, batchAllocator, AgentBuilder.RedefinitionStrategy.Listener.NoOp.INSTANCE);
        }

        @Override // net.bytebuddy.agent.builder.ResettableClassFileTransformer
        public boolean reset(Instrumentation instrumentation, AgentBuilder.RedefinitionStrategy redefinitionStrategy, AgentBuilder.RedefinitionStrategy.DiscoveryStrategy discoveryStrategy, AgentBuilder.RedefinitionStrategy.Listener listener) {
            return reset(instrumentation, redefinitionStrategy, discoveryStrategy, AgentBuilder.RedefinitionStrategy.BatchAllocator.ForTotal.INSTANCE, listener);
        }

        @Override // net.bytebuddy.agent.builder.ResettableClassFileTransformer
        public boolean reset(Instrumentation instrumentation, AgentBuilder.RedefinitionStrategy redefinitionStrategy, AgentBuilder.RedefinitionStrategy.BatchAllocator batchAllocator, AgentBuilder.RedefinitionStrategy.Listener listener) {
            return reset(instrumentation, redefinitionStrategy, AgentBuilder.RedefinitionStrategy.DiscoveryStrategy.SinglePass.INSTANCE, batchAllocator, listener);
        }

        @Override // net.bytebuddy.agent.builder.ResettableClassFileTransformer
        public boolean reset(Instrumentation instrumentation, AgentBuilder.RedefinitionStrategy redefinitionStrategy, AgentBuilder.RedefinitionStrategy.DiscoveryStrategy discoveryStrategy, AgentBuilder.RedefinitionStrategy.BatchAllocator batchAllocator, AgentBuilder.RedefinitionStrategy.Listener listener) {
            return reset(instrumentation, this, redefinitionStrategy, discoveryStrategy, batchAllocator, listener);
        }
    }

    public interface Substitutable extends ResettableClassFileTransformer {
        void substitute(ResettableClassFileTransformer resettableClassFileTransformer);

        ResettableClassFileTransformer unwrap();
    }

    @HashCodeAndEqualsPlugin.Enhance
    public static abstract class WithDelegation extends AbstractBase {
        protected final ResettableClassFileTransformer classFileTransformer;

        @HashCodeAndEqualsPlugin.Enhance
        public static class Substitutable extends AbstractBase implements Substitutable {
            private static final boolean ACCESS_CONTROLLER;
            private static final Factory DISPATCHER;
            protected volatile ResettableClassFileTransformer classFileTransformer;

            public interface Factory {

                public enum CreationAction implements PrivilegedAction<Factory> {
                    INSTANCE;

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
                    /* JADX DEBUG: Method merged with bridge method: run()Ljava/lang/Object; */
                    @Override // java.security.PrivilegedAction
                    @SuppressFBWarnings(justification = "Exception should not be rethrown but trigger a fallback.", value = {"REC_CATCH_EXCEPTION"})
                    public Factory run() {
                        try {
                            DynamicType.Builder builderName = new ByteBuddy().with(TypeValidation.DISABLED).subclass(Substitutable.class).name(Substitutable.class.getName() + "$ByteBuddy$ModuleSupport");
                            ElementMatcher.Junction junctionNamed = ElementMatchers.named("transform");
                            JavaType javaType = JavaType.MODULE;
                            return new ForJava9CapableVm(builderName.method(junctionNamed.and(ElementMatchers.takesArgument(0, javaType.load()))).intercept(MethodCall.invoke(ClassFileTransformer.class.getDeclaredMethod("transform", javaType.load(), ClassLoader.class, String.class, Class.class, ProtectionDomain.class, byte[].class)).onField("classFileTransformer").withAllArguments()).make().load(Substitutable.class.getClassLoader(), ClassLoadingStrategy.Default.WRAPPER_PERSISTENT.with(Substitutable.class.getProtectionDomain())).getLoaded().getDeclaredConstructor(ResettableClassFileTransformer.class));
                        } catch (Exception unused) {
                            return ForLegacyVm.INSTANCE;
                        }
                    }
                }

                @HashCodeAndEqualsPlugin.Enhance
                public static class ForJava9CapableVm implements Factory {
                    private final Constructor<? extends Substitutable> substitutable;

                    public ForJava9CapableVm(Constructor<? extends Substitutable> constructor) {
                        this.substitutable = constructor;
                    }

                    public boolean equals(@MaybeNull Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return obj != null && getClass() == obj.getClass() && this.substitutable.equals(((ForJava9CapableVm) obj).substitutable);
                    }

                    public int hashCode() {
                        return (getClass().hashCode() * 31) + this.substitutable.hashCode();
                    }

                    @Override // net.bytebuddy.agent.builder.ResettableClassFileTransformer.WithDelegation.Substitutable.Factory
                    public Substitutable make(ResettableClassFileTransformer resettableClassFileTransformer) {
                        try {
                            return this.substitutable.newInstance(resettableClassFileTransformer);
                        } catch (IllegalAccessException e) {
                            throw new IllegalStateException("Cannot access " + this.substitutable, e);
                        } catch (InstantiationException e2) {
                            throw new IllegalStateException("Cannot instantiate " + this.substitutable.getDeclaringClass(), e2);
                        } catch (InvocationTargetException e3) {
                            throw new IllegalStateException("Cannot invoke " + this.substitutable, e3.getTargetException());
                        }
                    }
                }

                public enum ForLegacyVm implements Factory {
                    INSTANCE;

                    @Override // net.bytebuddy.agent.builder.ResettableClassFileTransformer.WithDelegation.Substitutable.Factory
                    public Substitutable make(ResettableClassFileTransformer resettableClassFileTransformer) {
                        return new Substitutable(resettableClassFileTransformer);
                    }
                }

                Substitutable make(ResettableClassFileTransformer resettableClassFileTransformer);
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
                DISPATCHER = (Factory) doPrivileged(Factory.CreationAction.INSTANCE);
            }

            public Substitutable(ResettableClassFileTransformer resettableClassFileTransformer) {
                this.classFileTransformer = resettableClassFileTransformer;
            }

            @AccessControllerPlugin.Enhance
            private static <T> T doPrivileged(PrivilegedAction<T> privilegedAction) {
                return ACCESS_CONTROLLER ? (T) AccessController.doPrivileged(privilegedAction) : privilegedAction.run();
            }

            /* JADX INFO: renamed from: of */
            public static Substitutable m5136of(ResettableClassFileTransformer resettableClassFileTransformer) {
                return DISPATCHER.make(resettableClassFileTransformer);
            }

            public boolean equals(@MaybeNull Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && getClass() == obj.getClass() && this.classFileTransformer.equals(((Substitutable) obj).classFileTransformer);
            }

            public int hashCode() {
                return (getClass().hashCode() * 31) + this.classFileTransformer.hashCode();
            }

            @Override // net.bytebuddy.agent.builder.ResettableClassFileTransformer
            public Iterator<AgentBuilder.Transformer> iterator(TypeDescription typeDescription, @MaybeNull ClassLoader classLoader, @MaybeNull JavaModule javaModule, @MaybeNull Class<?> cls, ProtectionDomain protectionDomain) {
                return this.classFileTransformer.iterator(typeDescription, classLoader, javaModule, cls, protectionDomain);
            }

            @Override // net.bytebuddy.agent.builder.ResettableClassFileTransformer
            public boolean reset(Instrumentation instrumentation, ResettableClassFileTransformer resettableClassFileTransformer, AgentBuilder.RedefinitionStrategy redefinitionStrategy, AgentBuilder.RedefinitionStrategy.DiscoveryStrategy discoveryStrategy, AgentBuilder.RedefinitionStrategy.BatchAllocator batchAllocator, AgentBuilder.RedefinitionStrategy.Listener listener) {
                return this.classFileTransformer.reset(instrumentation, resettableClassFileTransformer, redefinitionStrategy, discoveryStrategy, batchAllocator, listener);
            }

            @Override // net.bytebuddy.agent.builder.ResettableClassFileTransformer.Substitutable
            public void substitute(ResettableClassFileTransformer resettableClassFileTransformer) {
                while (resettableClassFileTransformer instanceof Substitutable) {
                    resettableClassFileTransformer = ((Substitutable) resettableClassFileTransformer).unwrap();
                }
                this.classFileTransformer = resettableClassFileTransformer;
            }

            public byte[] transform(ClassLoader classLoader, String str, Class<?> cls, ProtectionDomain protectionDomain, byte[] bArr) throws IllegalClassFormatException {
                return this.classFileTransformer.transform(classLoader, str, cls, protectionDomain, bArr);
            }

            @Override // net.bytebuddy.agent.builder.ResettableClassFileTransformer.Substitutable
            public ResettableClassFileTransformer unwrap() {
                return this.classFileTransformer;
            }
        }

        public WithDelegation(ResettableClassFileTransformer resettableClassFileTransformer) {
            this.classFileTransformer = resettableClassFileTransformer;
        }

        public boolean equals(@MaybeNull Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass() && this.classFileTransformer.equals(((WithDelegation) obj).classFileTransformer);
        }

        public int hashCode() {
            return (getClass().hashCode() * 31) + this.classFileTransformer.hashCode();
        }

        @Override // net.bytebuddy.agent.builder.ResettableClassFileTransformer
        public Iterator<AgentBuilder.Transformer> iterator(TypeDescription typeDescription, @MaybeNull ClassLoader classLoader, @MaybeNull JavaModule javaModule, @MaybeNull Class<?> cls, ProtectionDomain protectionDomain) {
            return this.classFileTransformer.iterator(typeDescription, classLoader, javaModule, cls, protectionDomain);
        }

        @Override // net.bytebuddy.agent.builder.ResettableClassFileTransformer
        public boolean reset(Instrumentation instrumentation, ResettableClassFileTransformer resettableClassFileTransformer, AgentBuilder.RedefinitionStrategy redefinitionStrategy, AgentBuilder.RedefinitionStrategy.DiscoveryStrategy discoveryStrategy, AgentBuilder.RedefinitionStrategy.BatchAllocator batchAllocator, AgentBuilder.RedefinitionStrategy.Listener listener) {
            return this.classFileTransformer.reset(instrumentation, resettableClassFileTransformer, redefinitionStrategy, discoveryStrategy, batchAllocator, listener);
        }
    }

    Iterator<AgentBuilder.Transformer> iterator(TypeDescription typeDescription, @MaybeNull ClassLoader classLoader, @MaybeNull JavaModule javaModule, @MaybeNull Class<?> cls, ProtectionDomain protectionDomain);

    boolean reset(Instrumentation instrumentation, AgentBuilder.RedefinitionStrategy redefinitionStrategy);

    boolean reset(Instrumentation instrumentation, AgentBuilder.RedefinitionStrategy redefinitionStrategy, AgentBuilder.RedefinitionStrategy.BatchAllocator batchAllocator);

    boolean reset(Instrumentation instrumentation, AgentBuilder.RedefinitionStrategy redefinitionStrategy, AgentBuilder.RedefinitionStrategy.BatchAllocator batchAllocator, AgentBuilder.RedefinitionStrategy.DiscoveryStrategy discoveryStrategy);

    boolean reset(Instrumentation instrumentation, AgentBuilder.RedefinitionStrategy redefinitionStrategy, AgentBuilder.RedefinitionStrategy.BatchAllocator batchAllocator, AgentBuilder.RedefinitionStrategy.Listener listener);

    boolean reset(Instrumentation instrumentation, AgentBuilder.RedefinitionStrategy redefinitionStrategy, AgentBuilder.RedefinitionStrategy.DiscoveryStrategy discoveryStrategy);

    boolean reset(Instrumentation instrumentation, AgentBuilder.RedefinitionStrategy redefinitionStrategy, AgentBuilder.RedefinitionStrategy.DiscoveryStrategy discoveryStrategy, AgentBuilder.RedefinitionStrategy.BatchAllocator batchAllocator, AgentBuilder.RedefinitionStrategy.Listener listener);

    boolean reset(Instrumentation instrumentation, AgentBuilder.RedefinitionStrategy redefinitionStrategy, AgentBuilder.RedefinitionStrategy.DiscoveryStrategy discoveryStrategy, AgentBuilder.RedefinitionStrategy.Listener listener);

    boolean reset(Instrumentation instrumentation, ResettableClassFileTransformer resettableClassFileTransformer, AgentBuilder.RedefinitionStrategy redefinitionStrategy, AgentBuilder.RedefinitionStrategy.DiscoveryStrategy discoveryStrategy, AgentBuilder.RedefinitionStrategy.BatchAllocator batchAllocator, AgentBuilder.RedefinitionStrategy.Listener listener);
}
