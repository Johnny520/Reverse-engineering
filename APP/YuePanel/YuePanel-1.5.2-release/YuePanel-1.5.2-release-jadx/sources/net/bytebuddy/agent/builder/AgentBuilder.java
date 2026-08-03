package net.bytebuddy.agent.builder;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.io.File;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintStream;
import java.io.Serializable;
import java.lang.instrument.ClassDefinition;
import java.lang.instrument.ClassFileTransformer;
import java.lang.instrument.IllegalClassFormatException;
import java.lang.instrument.Instrumentation;
import java.lang.instrument.UnmodifiableClassException;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.net.URLClassLoader;
import java.security.AccessControlContext;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.security.ProtectionDomain;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import net.bytebuddy.ByteBuddy;
import net.bytebuddy.ClassFileVersion;
import net.bytebuddy.agent.builder.ResettableClassFileTransformer;
import net.bytebuddy.asm.Advice;
import net.bytebuddy.asm.AsmVisitorWrapper;
import net.bytebuddy.build.AccessControllerPlugin;
import net.bytebuddy.build.EntryPoint;
import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.build.Plugin;
import net.bytebuddy.description.field.FieldDescription;
import net.bytebuddy.description.method.MethodDescription;
import net.bytebuddy.description.method.ParameterDescription;
import net.bytebuddy.description.modifier.FieldManifestation;
import net.bytebuddy.description.modifier.MethodManifestation;
import net.bytebuddy.description.modifier.ModifierContributor;
import net.bytebuddy.description.modifier.Ownership;
import net.bytebuddy.description.modifier.TypeManifestation;
import net.bytebuddy.description.modifier.Visibility;
import net.bytebuddy.description.type.PackageDescription;
import net.bytebuddy.description.type.TypeDefinition;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.dynamic.ClassFileLocator;
import net.bytebuddy.dynamic.DynamicType;
import net.bytebuddy.dynamic.NexusAccessor;
import net.bytebuddy.dynamic.TypeResolutionStrategy;
import net.bytebuddy.dynamic.VisibilityBridgeStrategy;
import net.bytebuddy.dynamic.loading.ClassInjector;
import net.bytebuddy.dynamic.loading.ClassLoadingStrategy;
import net.bytebuddy.dynamic.loading.ClassReloadingStrategy;
import net.bytebuddy.dynamic.scaffold.InstrumentedType;
import net.bytebuddy.dynamic.scaffold.TypeValidation;
import net.bytebuddy.dynamic.scaffold.inline.MethodNameTransformer;
import net.bytebuddy.dynamic.scaffold.subclass.ConstructorStrategy;
import net.bytebuddy.implementation.ExceptionMethod;
import net.bytebuddy.implementation.Implementation;
import net.bytebuddy.implementation.LoadedTypeInitializer;
import net.bytebuddy.implementation.MethodCall;
import net.bytebuddy.implementation.auxiliary.AuxiliaryType;
import net.bytebuddy.implementation.auxiliary.TypeProxy;
import net.bytebuddy.implementation.bytecode.ByteCodeAppender;
import net.bytebuddy.implementation.bytecode.Duplication;
import net.bytebuddy.implementation.bytecode.StackManipulation;
import net.bytebuddy.implementation.bytecode.TypeCreation;
import net.bytebuddy.implementation.bytecode.assign.Assigner;
import net.bytebuddy.implementation.bytecode.assign.TypeCasting;
import net.bytebuddy.implementation.bytecode.collection.ArrayFactory;
import net.bytebuddy.implementation.bytecode.constant.ClassConstant;
import net.bytebuddy.implementation.bytecode.constant.IntegerConstant;
import net.bytebuddy.implementation.bytecode.constant.TextConstant;
import net.bytebuddy.implementation.bytecode.member.FieldAccess;
import net.bytebuddy.implementation.bytecode.member.MethodInvocation;
import net.bytebuddy.implementation.bytecode.member.MethodReturn;
import net.bytebuddy.implementation.bytecode.member.MethodVariableAccess;
import net.bytebuddy.jar.asm.ConstantDynamic;
import net.bytebuddy.jar.asm.Handle;
import net.bytebuddy.jar.asm.Label;
import net.bytebuddy.jar.asm.MethodVisitor;
import net.bytebuddy.jar.asm.Opcodes;
import net.bytebuddy.jar.asm.Type;
import net.bytebuddy.matcher.ElementMatcher;
import net.bytebuddy.matcher.ElementMatchers;
import net.bytebuddy.matcher.LatentMatcher;
import net.bytebuddy.pool.TypePool;
import net.bytebuddy.utility.CompoundList;
import net.bytebuddy.utility.JavaConstant;
import net.bytebuddy.utility.JavaModule;
import net.bytebuddy.utility.JavaType;
import net.bytebuddy.utility.dispatcher.JavaDispatcher;
import net.bytebuddy.utility.nullability.AlwaysNull;
import net.bytebuddy.utility.nullability.MaybeNull;

/* JADX INFO: loaded from: classes2.dex */
public interface AgentBuilder {

    public interface CircularityLock {

        public static class Default implements CircularityLock {
            private final ConcurrentMap<Thread, Boolean> threads = new ConcurrentHashMap();

            @Override // net.bytebuddy.agent.builder.AgentBuilder.CircularityLock
            public boolean acquire() {
                return this.threads.putIfAbsent(Thread.currentThread(), Boolean.TRUE) == null;
            }

            public boolean isLocked() {
                return this.threads.containsKey(Thread.currentThread());
            }

            @Override // net.bytebuddy.agent.builder.AgentBuilder.CircularityLock
            public void release() {
                this.threads.remove(Thread.currentThread());
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class Global implements CircularityLock {
            private final Lock lock;
            private final long time;
            private final TimeUnit timeUnit;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public Global() {
                this(0L, TimeUnit.MILLISECONDS);
            }

            @Override // net.bytebuddy.agent.builder.AgentBuilder.CircularityLock
            public boolean acquire() {
                try {
                    long j = this.time;
                    return j == 0 ? this.lock.tryLock() : this.lock.tryLock(j, this.timeUnit);
                } catch (InterruptedException unused) {
                    return false;
                }
            }

            public boolean equals(@MaybeNull Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                Global global = (Global) obj;
                return this.time == global.time && this.timeUnit.equals(global.timeUnit) && this.lock.equals(global.lock);
            }

            public int hashCode() {
                int iHashCode = ((getClass().hashCode() * 31) + this.lock.hashCode()) * 31;
                long j = this.time;
                return ((iHashCode + ((int) (j ^ (j >>> 32)))) * 31) + this.timeUnit.hashCode();
            }

            @Override // net.bytebuddy.agent.builder.AgentBuilder.CircularityLock
            public void release() {
                this.lock.unlock();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            public Global(long j, TimeUnit timeUnit) {
                this.lock = new ReentrantLock();
                this.time = j;
                this.timeUnit = timeUnit;
            }
        }

        public enum Inactive implements CircularityLock {
            INSTANCE;

            @Override // net.bytebuddy.agent.builder.AgentBuilder.CircularityLock
            public boolean acquire() {
                return true;
            }

            @Override // net.bytebuddy.agent.builder.AgentBuilder.CircularityLock
            public void release() {
            }
        }

        boolean acquire();

        void release();
    }

    public interface ClassFileBufferStrategy {

        public enum Default implements ClassFileBufferStrategy {
            RETAINING { // from class: net.bytebuddy.agent.builder.AgentBuilder.ClassFileBufferStrategy.Default.1
                @Override // net.bytebuddy.agent.builder.AgentBuilder.ClassFileBufferStrategy
                public ClassFileLocator resolve(String str, byte[] bArr, @MaybeNull ClassLoader classLoader, @MaybeNull JavaModule javaModule, ProtectionDomain protectionDomain) {
                    return ClassFileLocator.Simple.m5267of(str, bArr);
                }

                @Override // net.bytebuddy.agent.builder.AgentBuilder.ClassFileBufferStrategy
                public TypePool typePool(PoolStrategy poolStrategy, ClassFileLocator classFileLocator, @MaybeNull ClassLoader classLoader, String str) {
                    return poolStrategy.typePool(classFileLocator, classLoader, str);
                }
            },
            DISCARDING { // from class: net.bytebuddy.agent.builder.AgentBuilder.ClassFileBufferStrategy.Default.2
                @Override // net.bytebuddy.agent.builder.AgentBuilder.ClassFileBufferStrategy
                public ClassFileLocator resolve(String str, byte[] bArr, @MaybeNull ClassLoader classLoader, @MaybeNull JavaModule javaModule, ProtectionDomain protectionDomain) {
                    return ClassFileLocator.NoOp.INSTANCE;
                }

                @Override // net.bytebuddy.agent.builder.AgentBuilder.ClassFileBufferStrategy
                public TypePool typePool(PoolStrategy poolStrategy, ClassFileLocator classFileLocator, @MaybeNull ClassLoader classLoader, String str) {
                    return poolStrategy.typePool(classFileLocator, classLoader);
                }
            }
        }

        ClassFileLocator resolve(String str, byte[] bArr, @MaybeNull ClassLoader classLoader, @MaybeNull JavaModule javaModule, ProtectionDomain protectionDomain);

        TypePool typePool(PoolStrategy poolStrategy, ClassFileLocator classFileLocator, @MaybeNull ClassLoader classLoader, String str);
    }

    @HashCodeAndEqualsPlugin.Enhance
    public static class Default implements AgentBuilder {
        private static final boolean ACCESS_CONTROLLER;
        private static final CircularityLock DEFAULT_LOCK;
        private static final Dispatcher DISPATCHER;
        private static final String INSTALLER_GETTER = "getInstrumentation";
        private static final String INSTALLER_TYPE = "net.bytebuddy.agent.Installer";

        @AlwaysNull
        private static final Class<?> NOT_PREVIOUSLY_DEFINED;

        @AlwaysNull
        private static final byte[] NO_TRANSFORMATION;
        protected final ByteBuddy byteBuddy;
        protected final CircularityLock circularityLock;
        protected final ClassFileBufferStrategy classFileBufferStrategy;
        protected final ClassFileLocator classFileLocator;
        protected final DescriptionStrategy descriptionStrategy;
        protected final FallbackStrategy fallbackStrategy;
        protected final RawMatcher ignoreMatcher;
        protected final InitializationStrategy initializationStrategy;
        protected final InjectionStrategy injectionStrategy;
        protected final InstallationListener installationListener;
        protected final LambdaInstrumentationStrategy lambdaInstrumentationStrategy;
        protected final Listener listener;
        protected final LocationStrategy locationStrategy;
        protected final NativeMethodStrategy nativeMethodStrategy;
        protected final PoolStrategy poolStrategy;
        protected final RedefinitionStrategy.BatchAllocator redefinitionBatchAllocator;
        protected final RedefinitionStrategy.DiscoveryStrategy redefinitionDiscoveryStrategy;
        protected final RedefinitionStrategy.Listener redefinitionListener;
        protected final RedefinitionStrategy.ResubmissionStrategy redefinitionResubmissionStrategy;
        protected final RedefinitionStrategy redefinitionStrategy;
        protected final List<Transformation> transformations;
        protected final TransformerDecorator transformerDecorator;
        protected final TypeStrategy typeStrategy;
        protected final WarmupStrategy warmupStrategy;

        public static abstract class Delegator implements AgentBuilder {

            public static abstract class Matchable<S extends Matchable<S>> extends Delegator implements Matchable<S> {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // net.bytebuddy.agent.builder.AgentBuilder.Matchable
                public S and(ElementMatcher<? super TypeDescription> elementMatcher) {
                    return (S) and(elementMatcher, ElementMatchers.any());
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // net.bytebuddy.agent.builder.AgentBuilder.Matchable
                /* JADX INFO: renamed from: or */
                public S mo5125or(ElementMatcher<? super TypeDescription> elementMatcher) {
                    return (S) mo5126or(elementMatcher, ElementMatchers.any());
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
                @Override // net.bytebuddy.agent.builder.AgentBuilder.Matchable
                public S and(ElementMatcher<? super TypeDescription> elementMatcher, ElementMatcher<? super ClassLoader> elementMatcher2) {
                    return (S) and(elementMatcher, elementMatcher2, ElementMatchers.any());
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
                @Override // net.bytebuddy.agent.builder.AgentBuilder.Matchable
                /* JADX INFO: renamed from: or */
                public S mo5126or(ElementMatcher<? super TypeDescription> elementMatcher, ElementMatcher<? super ClassLoader> elementMatcher2) {
                    return (S) mo5127or(elementMatcher, elementMatcher2, ElementMatchers.any());
                }

                @Override // net.bytebuddy.agent.builder.AgentBuilder.Matchable
                public S and(ElementMatcher<? super TypeDescription> elementMatcher, ElementMatcher<? super ClassLoader> elementMatcher2, ElementMatcher<? super JavaModule> elementMatcher3) {
                    return and(new RawMatcher.ForElementMatchers(elementMatcher, elementMatcher2, elementMatcher3));
                }

                @Override // net.bytebuddy.agent.builder.AgentBuilder.Matchable
                /* JADX INFO: renamed from: or */
                public S mo5127or(ElementMatcher<? super TypeDescription> elementMatcher, ElementMatcher<? super ClassLoader> elementMatcher2, ElementMatcher<? super JavaModule> elementMatcher3) {
                    return mo5128or(new RawMatcher.ForElementMatchers(elementMatcher, elementMatcher2, elementMatcher3));
                }
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // net.bytebuddy.agent.builder.AgentBuilder
            public AgentBuilder assureReadEdgeFromAndTo(Instrumentation instrumentation, Class<?>... clsArr) {
                return materialize().assureReadEdgeFromAndTo(instrumentation, clsArr);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // net.bytebuddy.agent.builder.AgentBuilder
            public AgentBuilder assureReadEdgeTo(Instrumentation instrumentation, Class<?>... clsArr) {
                return materialize().assureReadEdgeTo(instrumentation, clsArr);
            }

            @Override // net.bytebuddy.agent.builder.AgentBuilder
            public AgentBuilder disableClassFormatChanges() {
                return materialize().disableClassFormatChanges();
            }

            @Override // net.bytebuddy.agent.builder.AgentBuilder
            public AgentBuilder disableNativeMethodPrefix() {
                return materialize().disableNativeMethodPrefix();
            }

            @Override // net.bytebuddy.agent.builder.AgentBuilder
            public AgentBuilder enableNativeMethodPrefix(String str) {
                return materialize().enableNativeMethodPrefix(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // net.bytebuddy.agent.builder.AgentBuilder
            public Ignored ignore(ElementMatcher<? super TypeDescription> elementMatcher) {
                return materialize().ignore(elementMatcher);
            }

            @Override // net.bytebuddy.agent.builder.AgentBuilder
            public ResettableClassFileTransformer installOn(Instrumentation instrumentation) {
                return materialize().installOn(instrumentation);
            }

            @Override // net.bytebuddy.agent.builder.AgentBuilder
            public ResettableClassFileTransformer installOnByteBuddyAgent() {
                return materialize().installOnByteBuddyAgent();
            }

            @Override // net.bytebuddy.agent.builder.AgentBuilder
            public ClassFileTransformer makeRaw() {
                return materialize().makeRaw();
            }

            public abstract AgentBuilder materialize();

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // net.bytebuddy.agent.builder.AgentBuilder
            public ResettableClassFileTransformer patchOn(Instrumentation instrumentation, ResettableClassFileTransformer resettableClassFileTransformer) {
                return materialize().patchOn(instrumentation, resettableClassFileTransformer);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // net.bytebuddy.agent.builder.AgentBuilder
            public ResettableClassFileTransformer patchOnByteBuddyAgent(ResettableClassFileTransformer resettableClassFileTransformer) {
                return materialize().patchOnByteBuddyAgent(resettableClassFileTransformer);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // net.bytebuddy.agent.builder.AgentBuilder
            public Identified.Narrowable type(ElementMatcher<? super TypeDescription> elementMatcher) {
                return materialize().type(elementMatcher);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // net.bytebuddy.agent.builder.AgentBuilder
            public AgentBuilder warmUp(Class<?>... clsArr) {
                return materialize().warmUp(clsArr);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // net.bytebuddy.agent.builder.AgentBuilder
            public AgentBuilder with(ByteBuddy byteBuddy) {
                return materialize().with(byteBuddy);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            @Override // net.bytebuddy.agent.builder.AgentBuilder
            public AgentBuilder assureReadEdgeFromAndTo(Instrumentation instrumentation, JavaModule... javaModuleArr) {
                return materialize().assureReadEdgeFromAndTo(instrumentation, javaModuleArr);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            @Override // net.bytebuddy.agent.builder.AgentBuilder
            public AgentBuilder assureReadEdgeTo(Instrumentation instrumentation, JavaModule... javaModuleArr) {
                return materialize().assureReadEdgeTo(instrumentation, javaModuleArr);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            @Override // net.bytebuddy.agent.builder.AgentBuilder
            public Ignored ignore(ElementMatcher<? super TypeDescription> elementMatcher, ElementMatcher<? super ClassLoader> elementMatcher2) {
                return materialize().ignore(elementMatcher, elementMatcher2);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            @Override // net.bytebuddy.agent.builder.AgentBuilder
            public ResettableClassFileTransformer patchOn(Instrumentation instrumentation, ResettableClassFileTransformer resettableClassFileTransformer, RawMatcher rawMatcher) {
                return materialize().patchOn(instrumentation, resettableClassFileTransformer, rawMatcher);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            @Override // net.bytebuddy.agent.builder.AgentBuilder
            public ResettableClassFileTransformer patchOnByteBuddyAgent(ResettableClassFileTransformer resettableClassFileTransformer, PatchMode patchMode) {
                return materialize().patchOnByteBuddyAgent(resettableClassFileTransformer, patchMode);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            @Override // net.bytebuddy.agent.builder.AgentBuilder
            public Identified.Narrowable type(ElementMatcher<? super TypeDescription> elementMatcher, ElementMatcher<? super ClassLoader> elementMatcher2) {
                return materialize().type(elementMatcher, elementMatcher2);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            @Override // net.bytebuddy.agent.builder.AgentBuilder
            public AgentBuilder warmUp(Collection<Class<?>> collection) {
                return materialize().warmUp(collection);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            @Override // net.bytebuddy.agent.builder.AgentBuilder
            public AgentBuilder with(Listener listener) {
                return materialize().with(listener);
            }

            @Override // net.bytebuddy.agent.builder.AgentBuilder
            public AgentBuilder assureReadEdgeFromAndTo(Instrumentation instrumentation, Collection<? extends JavaModule> collection) {
                return materialize().assureReadEdgeFromAndTo(instrumentation, collection);
            }

            @Override // net.bytebuddy.agent.builder.AgentBuilder
            public AgentBuilder assureReadEdgeTo(Instrumentation instrumentation, Collection<? extends JavaModule> collection) {
                return materialize().assureReadEdgeTo(instrumentation, collection);
            }

            @Override // net.bytebuddy.agent.builder.AgentBuilder
            public Ignored ignore(ElementMatcher<? super TypeDescription> elementMatcher, ElementMatcher<? super ClassLoader> elementMatcher2, ElementMatcher<? super JavaModule> elementMatcher3) {
                return materialize().ignore(elementMatcher, elementMatcher2, elementMatcher3);
            }

            @Override // net.bytebuddy.agent.builder.AgentBuilder
            public ResettableClassFileTransformer patchOn(Instrumentation instrumentation, ResettableClassFileTransformer resettableClassFileTransformer, PatchMode patchMode) {
                return materialize().patchOn(instrumentation, resettableClassFileTransformer, patchMode);
            }

            @Override // net.bytebuddy.agent.builder.AgentBuilder
            public Identified.Narrowable type(ElementMatcher<? super TypeDescription> elementMatcher, ElementMatcher<? super ClassLoader> elementMatcher2, ElementMatcher<? super JavaModule> elementMatcher3) {
                return materialize().type(elementMatcher, elementMatcher2, elementMatcher3);
            }

            @Override // net.bytebuddy.agent.builder.AgentBuilder
            public AgentBuilder with(CircularityLock circularityLock) {
                return materialize().with(circularityLock);
            }

            @Override // net.bytebuddy.agent.builder.AgentBuilder
            public Ignored ignore(RawMatcher rawMatcher) {
                return materialize().ignore(rawMatcher);
            }

            @Override // net.bytebuddy.agent.builder.AgentBuilder
            public ResettableClassFileTransformer patchOn(Instrumentation instrumentation, ResettableClassFileTransformer resettableClassFileTransformer, RawMatcher rawMatcher, PatchMode patchMode) {
                return materialize().patchOn(instrumentation, resettableClassFileTransformer, rawMatcher, patchMode);
            }

            @Override // net.bytebuddy.agent.builder.AgentBuilder
            public Identified.Narrowable type(RawMatcher rawMatcher) {
                return materialize().type(rawMatcher);
            }

            @Override // net.bytebuddy.agent.builder.AgentBuilder
            public AgentBuilder with(TypeStrategy typeStrategy) {
                return materialize().with(typeStrategy);
            }

            @Override // net.bytebuddy.agent.builder.AgentBuilder
            public AgentBuilder with(PoolStrategy poolStrategy) {
                return materialize().with(poolStrategy);
            }

            @Override // net.bytebuddy.agent.builder.AgentBuilder
            public AgentBuilder with(LocationStrategy locationStrategy) {
                return materialize().with(locationStrategy);
            }

            @Override // net.bytebuddy.agent.builder.AgentBuilder
            public AgentBuilder with(ClassFileLocator classFileLocator) {
                return materialize().with(classFileLocator);
            }

            @Override // net.bytebuddy.agent.builder.AgentBuilder
            public AgentBuilder with(InitializationStrategy initializationStrategy) {
                return materialize().with(initializationStrategy);
            }

            @Override // net.bytebuddy.agent.builder.AgentBuilder
            public RedefinitionListenable.WithoutBatchStrategy with(RedefinitionStrategy redefinitionStrategy) {
                return materialize().with(redefinitionStrategy);
            }

            @Override // net.bytebuddy.agent.builder.AgentBuilder
            public AgentBuilder with(LambdaInstrumentationStrategy lambdaInstrumentationStrategy) {
                return materialize().with(lambdaInstrumentationStrategy);
            }

            @Override // net.bytebuddy.agent.builder.AgentBuilder
            public AgentBuilder with(DescriptionStrategy descriptionStrategy) {
                return materialize().with(descriptionStrategy);
            }

            @Override // net.bytebuddy.agent.builder.AgentBuilder
            public AgentBuilder with(FallbackStrategy fallbackStrategy) {
                return materialize().with(fallbackStrategy);
            }

            @Override // net.bytebuddy.agent.builder.AgentBuilder
            public AgentBuilder with(ClassFileBufferStrategy classFileBufferStrategy) {
                return materialize().with(classFileBufferStrategy);
            }

            @Override // net.bytebuddy.agent.builder.AgentBuilder
            public AgentBuilder with(InstallationListener installationListener) {
                return materialize().with(installationListener);
            }

            @Override // net.bytebuddy.agent.builder.AgentBuilder
            public AgentBuilder with(InjectionStrategy injectionStrategy) {
                return materialize().with(injectionStrategy);
            }

            @Override // net.bytebuddy.agent.builder.AgentBuilder
            public AgentBuilder with(TransformerDecorator transformerDecorator) {
                return materialize().with(transformerDecorator);
            }
        }

        @JavaDispatcher.Proxied("java.lang.instrument.Instrumentation")
        public interface Dispatcher {
            @JavaDispatcher.Proxied("addTransformer")
            void addTransformer(Instrumentation instrumentation, ClassFileTransformer classFileTransformer, boolean z);

            @JavaDispatcher.Defaults
            @JavaDispatcher.Proxied("isNativeMethodPrefixSupported")
            boolean isNativeMethodPrefixSupported(Instrumentation instrumentation);

            @JavaDispatcher.Proxied("setNativeMethodPrefix")
            void setNativeMethodPrefix(Instrumentation instrumentation, ClassFileTransformer classFileTransformer, String str);
        }

        @HashCodeAndEqualsPlugin.Enhance(includeSyntheticFields = true)
        public class Ignoring extends Delegator.Matchable<Ignored> implements Ignored {
            private final RawMatcher rawMatcher;

            public Ignoring(RawMatcher rawMatcher) {
                this.rawMatcher = rawMatcher;
            }

            public boolean equals(@MaybeNull Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                Ignoring ignoring = (Ignoring) obj;
                return this.rawMatcher.equals(ignoring.rawMatcher) && Default.this.equals(Default.this);
            }

            public int hashCode() {
                return (((getClass().hashCode() * 31) + this.rawMatcher.hashCode()) * 31) + Default.this.hashCode();
            }

            @Override // net.bytebuddy.agent.builder.AgentBuilder.Default.Delegator
            public AgentBuilder materialize() {
                Default r15 = Default.this;
                return new Default(r15.byteBuddy, r15.listener, r15.circularityLock, r15.poolStrategy, r15.typeStrategy, r15.locationStrategy, r15.classFileLocator, r15.nativeMethodStrategy, r15.warmupStrategy, r15.transformerDecorator, r15.initializationStrategy, r15.redefinitionStrategy, r15.redefinitionDiscoveryStrategy, r15.redefinitionBatchAllocator, r15.redefinitionListener, r15.redefinitionResubmissionStrategy, r15.injectionStrategy, r15.lambdaInstrumentationStrategy, r15.descriptionStrategy, r15.fallbackStrategy, r15.classFileBufferStrategy, r15.installationListener, this.rawMatcher, r15.transformations);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            /* JADX DEBUG: Method merged with bridge method: and(Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher;)Lnet/bytebuddy/agent/builder/AgentBuilder$Matchable; */
            @Override // net.bytebuddy.agent.builder.AgentBuilder.Matchable
            public Ignored and(RawMatcher rawMatcher) {
                return Default.this.new Ignoring(new RawMatcher.Conjunction(this.rawMatcher, rawMatcher));
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            /* JADX DEBUG: Method merged with bridge method: or(Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher;)Lnet/bytebuddy/agent/builder/AgentBuilder$Matchable; */
            @Override // net.bytebuddy.agent.builder.AgentBuilder.Matchable
            /* JADX INFO: renamed from: or */
            public Ignored mo5128or(RawMatcher rawMatcher) {
                return Default.this.new Ignoring(new RawMatcher.Disjunction(this.rawMatcher, rawMatcher));
            }
        }

        public interface NativeMethodStrategy {

            public enum Disabled implements NativeMethodStrategy {
                INSTANCE;

                @Override // net.bytebuddy.agent.builder.AgentBuilder.Default.NativeMethodStrategy
                public void apply(Instrumentation instrumentation, ClassFileTransformer classFileTransformer) {
                }

                @Override // net.bytebuddy.agent.builder.AgentBuilder.Default.NativeMethodStrategy
                public MethodNameTransformer resolve() {
                    return MethodNameTransformer.Suffixing.withRandomSuffix();
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class ForPrefix implements NativeMethodStrategy {
                private final String prefix;

                public ForPrefix(String str) {
                    this.prefix = str;
                }

                /* JADX INFO: renamed from: of */
                public static NativeMethodStrategy m5129of(String str) {
                    if (str.length() != 0) {
                        return new ForPrefix(str);
                    }
                    throw new IllegalArgumentException("A method name prefix must not be the empty string");
                }

                @Override // net.bytebuddy.agent.builder.AgentBuilder.Default.NativeMethodStrategy
                public void apply(Instrumentation instrumentation, ClassFileTransformer classFileTransformer) {
                    if (Default.DISPATCHER.isNativeMethodPrefixSupported(instrumentation)) {
                        Default.DISPATCHER.setNativeMethodPrefix(instrumentation, classFileTransformer, this.prefix);
                        return;
                    }
                    throw new IllegalArgumentException("A prefix for native methods is not supported: " + instrumentation);
                }

                public boolean equals(@MaybeNull Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return obj != null && getClass() == obj.getClass() && this.prefix.equals(((ForPrefix) obj).prefix);
                }

                public int hashCode() {
                    return (getClass().hashCode() * 31) + this.prefix.hashCode();
                }

                @Override // net.bytebuddy.agent.builder.AgentBuilder.Default.NativeMethodStrategy
                public MethodNameTransformer resolve() {
                    return new MethodNameTransformer.Prefixing(this.prefix);
                }
            }

            void apply(Instrumentation instrumentation, ClassFileTransformer classFileTransformer);

            MethodNameTransformer resolve();
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class Transformation {

            @AlwaysNull
            private static final byte[] NONE = null;
            private final RawMatcher matcher;
            private final boolean terminal;
            private final List<Transformer> transformers;

            @HashCodeAndEqualsPlugin.Enhance
            public static class DifferentialMatcher implements RawMatcher {
                private final ResettableClassFileTransformer classFileTransformer;
                private final RawMatcher ignoreMatcher;
                private final List<Transformation> transformations;

                public DifferentialMatcher(RawMatcher rawMatcher, List<Transformation> list, ResettableClassFileTransformer resettableClassFileTransformer) {
                    this.ignoreMatcher = rawMatcher;
                    this.transformations = list;
                    this.classFileTransformer = resettableClassFileTransformer;
                }

                public boolean equals(@MaybeNull Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj == null || getClass() != obj.getClass()) {
                        return false;
                    }
                    DifferentialMatcher differentialMatcher = (DifferentialMatcher) obj;
                    return this.ignoreMatcher.equals(differentialMatcher.ignoreMatcher) && this.transformations.equals(differentialMatcher.transformations) && this.classFileTransformer.equals(differentialMatcher.classFileTransformer);
                }

                public int hashCode() {
                    return (((((getClass().hashCode() * 31) + this.ignoreMatcher.hashCode()) * 31) + this.transformations.hashCode()) * 31) + this.classFileTransformer.hashCode();
                }

                @Override // net.bytebuddy.agent.builder.AgentBuilder.RawMatcher
                public boolean matches(TypeDescription typeDescription, @MaybeNull ClassLoader classLoader, @MaybeNull JavaModule javaModule, @MaybeNull Class<?> cls, ProtectionDomain protectionDomain) {
                    Iterator<Transformer> it = this.classFileTransformer.iterator(typeDescription, classLoader, javaModule, cls, protectionDomain);
                    if (this.ignoreMatcher.matches(typeDescription, classLoader, javaModule, cls, protectionDomain)) {
                        return it.hasNext();
                    }
                    for (Transformation transformation : this.transformations) {
                        if (transformation.getMatcher().matches(typeDescription, classLoader, javaModule, cls, protectionDomain)) {
                            for (Transformer transformer : transformation.getTransformers()) {
                                if (!it.hasNext() || !it.next().equals(transformer)) {
                                    return true;
                                }
                            }
                        }
                    }
                    return it.hasNext();
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class SimpleMatcher implements RawMatcher {
                private final RawMatcher ignoreMatcher;
                private final List<Transformation> transformations;

                public SimpleMatcher(RawMatcher rawMatcher, List<Transformation> list) {
                    this.ignoreMatcher = rawMatcher;
                    this.transformations = list;
                }

                public boolean equals(@MaybeNull Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj == null || getClass() != obj.getClass()) {
                        return false;
                    }
                    SimpleMatcher simpleMatcher = (SimpleMatcher) obj;
                    return this.ignoreMatcher.equals(simpleMatcher.ignoreMatcher) && this.transformations.equals(simpleMatcher.transformations);
                }

                public int hashCode() {
                    return (((getClass().hashCode() * 31) + this.ignoreMatcher.hashCode()) * 31) + this.transformations.hashCode();
                }

                @Override // net.bytebuddy.agent.builder.AgentBuilder.RawMatcher
                public boolean matches(TypeDescription typeDescription, @MaybeNull ClassLoader classLoader, @MaybeNull JavaModule javaModule, @MaybeNull Class<?> cls, ProtectionDomain protectionDomain) {
                    if (this.ignoreMatcher.matches(typeDescription, classLoader, javaModule, cls, protectionDomain)) {
                        return false;
                    }
                    Iterator<Transformation> it = this.transformations.iterator();
                    while (it.hasNext()) {
                        if (it.next().getMatcher().matches(typeDescription, classLoader, javaModule, cls, protectionDomain)) {
                            return true;
                        }
                    }
                    return false;
                }
            }

            public static class TransformerIterator implements Iterator<Transformer> {

                @MaybeNull
                private final Class<?> classBeingRedefined;

                @MaybeNull
                private final ClassLoader classLoader;

                @MaybeNull
                private final JavaModule module;
                private final ProtectionDomain protectionDomain;
                private final Iterator<Transformation> transformations;
                private Iterator<Transformer> transformers;
                private final TypeDescription typeDescription;

                public TransformerIterator(TypeDescription typeDescription, @MaybeNull ClassLoader classLoader, @MaybeNull JavaModule javaModule, @MaybeNull Class<?> cls, ProtectionDomain protectionDomain, List<Transformation> list) {
                    this.typeDescription = typeDescription;
                    this.classLoader = classLoader;
                    this.module = javaModule;
                    this.classBeingRedefined = cls;
                    this.protectionDomain = protectionDomain;
                    this.transformations = list.iterator();
                    this.transformers = Collections.emptySet().iterator();
                    while (!this.transformers.hasNext() && this.transformations.hasNext()) {
                        Transformation next = this.transformations.next();
                        if (next.getMatcher().matches(typeDescription, classLoader, javaModule, cls, protectionDomain)) {
                            this.transformers = next.getTransformers().iterator();
                        }
                    }
                }

                @Override // java.util.Iterator
                public boolean hasNext() {
                    return this.transformers.hasNext();
                }

                @Override // java.util.Iterator
                public void remove() {
                    throw new UnsupportedOperationException("remove");
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
                /* JADX DEBUG: Method merged with bridge method: next()Ljava/lang/Object; */
                @Override // java.util.Iterator
                public Transformer next() {
                    boolean zHasNext;
                    boolean zHasNext2;
                    try {
                        while (true) {
                            if (!zHasNext) {
                                if (!zHasNext2) {
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                        return this.transformers.next();
                    } finally {
                        while (!this.transformers.hasNext() && this.transformations.hasNext()) {
                            Transformation next = this.transformations.next();
                            if (next.getMatcher().matches(this.typeDescription, this.classLoader, this.module, this.classBeingRedefined, this.protectionDomain)) {
                                this.transformers = next.getTransformers().iterator();
                            }
                        }
                    }
                }
            }

            public Transformation(RawMatcher rawMatcher, List<Transformer> list, boolean z) {
                this.matcher = rawMatcher;
                this.transformers = list;
                this.terminal = z;
            }

            public boolean equals(@MaybeNull Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                Transformation transformation = (Transformation) obj;
                return this.terminal == transformation.terminal && this.matcher.equals(transformation.matcher) && this.transformers.equals(transformation.transformers);
            }

            public RawMatcher getMatcher() {
                return this.matcher;
            }

            public List<Transformer> getTransformers() {
                return this.transformers;
            }

            public int hashCode() {
                return (((((getClass().hashCode() * 31) + this.matcher.hashCode()) * 31) + this.transformers.hashCode()) * 31) + (this.terminal ? 1 : 0);
            }

            public boolean isTerminal() {
                return this.terminal;
            }
        }

        @HashCodeAndEqualsPlugin.Enhance(includeSyntheticFields = true)
        public class Transforming extends Delegator.Matchable<Identified.Narrowable> implements Identified.Extendable, Identified.Narrowable {
            private final RawMatcher rawMatcher;
            private final boolean terminal;
            private final List<Transformer> transformers;

            public Transforming(RawMatcher rawMatcher, List<Transformer> list, boolean z) {
                this.rawMatcher = rawMatcher;
                this.transformers = list;
                this.terminal = z;
            }

            @Override // net.bytebuddy.agent.builder.AgentBuilder.Identified.Extendable
            public AgentBuilder asTerminalTransformation() {
                return Default.this.new Transforming(this.rawMatcher, this.transformers, true);
            }

            public boolean equals(@MaybeNull Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                Transforming transforming = (Transforming) obj;
                return this.terminal == transforming.terminal && this.rawMatcher.equals(transforming.rawMatcher) && this.transformers.equals(transforming.transformers) && Default.this.equals(Default.this);
            }

            public int hashCode() {
                return (((((((getClass().hashCode() * 31) + this.rawMatcher.hashCode()) * 31) + this.transformers.hashCode()) * 31) + (this.terminal ? 1 : 0)) * 31) + Default.this.hashCode();
            }

            @Override // net.bytebuddy.agent.builder.AgentBuilder.Default.Delegator
            public AgentBuilder materialize() {
                Default r15 = Default.this;
                return new Default(r15.byteBuddy, r15.listener, r15.circularityLock, r15.poolStrategy, r15.typeStrategy, r15.locationStrategy, r15.classFileLocator, r15.nativeMethodStrategy, r15.warmupStrategy, r15.transformerDecorator, r15.initializationStrategy, r15.redefinitionStrategy, r15.redefinitionDiscoveryStrategy, r15.redefinitionBatchAllocator, r15.redefinitionListener, r15.redefinitionResubmissionStrategy, r15.injectionStrategy, r15.lambdaInstrumentationStrategy, r15.descriptionStrategy, r15.fallbackStrategy, r15.classFileBufferStrategy, r15.installationListener, r15.ignoreMatcher, CompoundList.m5413of(r15.transformations, new Transformation(this.rawMatcher, this.transformers, this.terminal)));
            }

            @Override // net.bytebuddy.agent.builder.AgentBuilder.Identified
            public Identified.Extendable transform(Transformer transformer) {
                return Default.this.new Transforming(this.rawMatcher, CompoundList.m5413of(this.transformers, transformer), this.terminal);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            /* JADX DEBUG: Method merged with bridge method: and(Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher;)Lnet/bytebuddy/agent/builder/AgentBuilder$Matchable; */
            @Override // net.bytebuddy.agent.builder.AgentBuilder.Matchable
            public Identified.Narrowable and(RawMatcher rawMatcher) {
                return Default.this.new Transforming(new RawMatcher.Conjunction(this.rawMatcher, rawMatcher), this.transformers, this.terminal);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            /* JADX DEBUG: Method merged with bridge method: or(Lnet/bytebuddy/agent/builder/AgentBuilder$RawMatcher;)Lnet/bytebuddy/agent/builder/AgentBuilder$Matchable; */
            @Override // net.bytebuddy.agent.builder.AgentBuilder.Matchable
            /* JADX INFO: renamed from: or */
            public Identified.Narrowable mo5128or(RawMatcher rawMatcher) {
                return Default.this.new Transforming(new RawMatcher.Disjunction(this.rawMatcher, rawMatcher), this.transformers, this.terminal);
            }
        }

        public interface WarmupStrategy {

            @HashCodeAndEqualsPlugin.Enhance
            public static class Enabled implements WarmupStrategy {
                private static final Dispatcher DISPATCHER = (Dispatcher) Default.doPrivileged(JavaDispatcher.m5432of(Dispatcher.class));
                private final Set<Class<?>> types;

                @JavaDispatcher.Proxied("java.lang.instrument.ClassFileTransformer")
                public interface Dispatcher {
                    @MaybeNull
                    @JavaDispatcher.Proxied("transform")
                    byte[] transform(ClassFileTransformer classFileTransformer, @MaybeNull @JavaDispatcher.Proxied("java.lang.Module") Object obj, @MaybeNull ClassLoader classLoader, String str, @MaybeNull Class<?> cls, ProtectionDomain protectionDomain, byte[] bArr) throws IllegalClassFormatException;
                }

                public Enabled(Set<Class<?>> set) {
                    this.types = set;
                }

                @Override // net.bytebuddy.agent.builder.AgentBuilder.Default.WarmupStrategy
                public void apply(ResettableClassFileTransformer resettableClassFileTransformer, LocationStrategy locationStrategy, RedefinitionStrategy redefinitionStrategy, CircularityLock circularityLock, InstallationListener installationListener) {
                    Class<?> cls;
                    JavaModule javaModuleOfType;
                    byte[] bArrResolve;
                    boolean z;
                    byte[] bArrTransform;
                    installationListener.onBeforeWarmUp(this.types, resettableClassFileTransformer);
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    boolean z2 = false;
                    for (Class<?> cls2 : this.types) {
                        try {
                            javaModuleOfType = JavaModule.ofType(cls2);
                            bArrResolve = locationStrategy.classFileLocator(cls2.getClassLoader(), javaModuleOfType).locate(cls2.getName()).resolve();
                            circularityLock.release();
                        } catch (Throwable th) {
                            th = th;
                            cls = cls2;
                        }
                        if (javaModuleOfType == null) {
                            try {
                                bArrTransform = resettableClassFileTransformer.transform(cls2.getClassLoader(), Type.getInternalName(cls2), Default.NOT_PREVIOUSLY_DEFINED, cls2.getProtectionDomain(), bArrResolve);
                                z2 |= bArrTransform != null;
                                if (redefinitionStrategy.isEnabled()) {
                                    bArrTransform = resettableClassFileTransformer.transform(cls2.getClassLoader(), Type.getInternalName(cls2), cls2, cls2.getProtectionDomain(), bArrResolve);
                                    if (bArrTransform == null) {
                                        z = false;
                                    }
                                    z2 |= z;
                                }
                                cls = cls2;
                                try {
                                    linkedHashMap.put(cls, bArrTransform);
                                    try {
                                        circularityLock.acquire();
                                    } catch (Throwable th2) {
                                        th = th2;
                                        installationListener.onWarmUpError(cls, resettableClassFileTransformer, th);
                                        linkedHashMap.put(cls, Default.NO_TRANSFORMATION);
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    circularityLock.acquire();
                                    throw th;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                cls = cls2;
                                circularityLock.acquire();
                                throw th;
                            }
                        } else {
                            Dispatcher dispatcher = DISPATCHER;
                            try {
                                byte[] bArrTransform2 = dispatcher.transform(resettableClassFileTransformer, javaModuleOfType.unwrap(), cls2.getClassLoader(), Type.getInternalName(cls2), Default.NOT_PREVIOUSLY_DEFINED, cls2.getProtectionDomain(), bArrResolve);
                                z2 |= bArrTransform2 != null;
                                if (redefinitionStrategy.isEnabled()) {
                                    bArrTransform = dispatcher.transform(resettableClassFileTransformer, javaModuleOfType.unwrap(), cls2.getClassLoader(), Type.getInternalName(cls2), cls2, cls2.getProtectionDomain(), bArrResolve);
                                    z2 |= bArrTransform != null;
                                } else {
                                    bArrTransform = bArrTransform2;
                                }
                                cls = cls2;
                                linkedHashMap.put(cls, bArrTransform);
                                circularityLock.acquire();
                            } catch (Throwable th5) {
                                th = th5;
                                cls = cls2;
                                circularityLock.acquire();
                                throw th;
                            }
                        }
                    }
                    installationListener.onAfterWarmUp(linkedHashMap, resettableClassFileTransformer, z2);
                }

                public boolean equals(@MaybeNull Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return obj != null && getClass() == obj.getClass() && this.types.equals(((Enabled) obj).types);
                }

                public int hashCode() {
                    return (getClass().hashCode() * 31) + this.types.hashCode();
                }

                @Override // net.bytebuddy.agent.builder.AgentBuilder.Default.WarmupStrategy
                public WarmupStrategy with(Collection<Class<?>> collection) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet(this.types);
                    linkedHashSet.addAll(collection);
                    return new Enabled(linkedHashSet);
                }
            }

            public enum NoOp implements WarmupStrategy {
                INSTANCE;

                @Override // net.bytebuddy.agent.builder.AgentBuilder.Default.WarmupStrategy
                public void apply(ResettableClassFileTransformer resettableClassFileTransformer, LocationStrategy locationStrategy, RedefinitionStrategy redefinitionStrategy, CircularityLock circularityLock, InstallationListener installationListener) {
                }

                @Override // net.bytebuddy.agent.builder.AgentBuilder.Default.WarmupStrategy
                public WarmupStrategy with(Collection<Class<?>> collection) {
                    return new Enabled(new LinkedHashSet(collection));
                }
            }

            void apply(ResettableClassFileTransformer resettableClassFileTransformer, LocationStrategy locationStrategy, RedefinitionStrategy redefinitionStrategy, CircularityLock circularityLock, InstallationListener installationListener);

            WarmupStrategy with(Collection<Class<?>> collection);
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
            NO_TRANSFORMATION = null;
            NOT_PREVIOUSLY_DEFINED = null;
            DISPATCHER = (Dispatcher) doPrivileged(JavaDispatcher.m5432of(Dispatcher.class));
            DEFAULT_LOCK = new CircularityLock.Default();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public Default() {
            this(new ByteBuddy());
        }

        private ResettableClassFileTransformer doInstall(Instrumentation instrumentation, RawMatcher rawMatcher, PatchMode.Handler handler) throws Throwable {
            ResettableClassFileTransformer resettableClassFileTransformer;
            RedefinitionStrategy redefinitionStrategy;
            PoolStrategy poolStrategy;
            LocationStrategy locationStrategy;
            DescriptionStrategy descriptionStrategy;
            FallbackStrategy fallbackStrategy;
            RedefinitionStrategy.DiscoveryStrategy discoveryStrategy;
            LambdaInstrumentationStrategy lambdaInstrumentationStrategy;
            Listener listener;
            RedefinitionStrategy.Listener listener2;
            RedefinitionStrategy.BatchAllocator batchAllocator;
            CircularityLock circularityLock;
            Default r1 = this;
            if (!r1.circularityLock.acquire()) {
                throw new IllegalStateException("Could not acquire the circularity lock upon installation.");
            }
            try {
                RedefinitionStrategy.ResubmissionStrategy.Installation installationApply = r1.redefinitionResubmissionStrategy.apply(instrumentation, r1.poolStrategy, r1.locationStrategy, r1.descriptionStrategy, r1.fallbackStrategy, r1.listener, r1.installationListener, r1.circularityLock, new Transformation.SimpleMatcher(r1.ignoreMatcher, r1.transformations), r1.redefinitionStrategy, r1.redefinitionBatchAllocator, r1.redefinitionListener);
                ResettableClassFileTransformer resettableClassFileTransformerDecorate = r1.transformerDecorator.decorate(r1.makeRaw(installationApply.getListener(), installationApply.getInstallationListener(), installationApply.getResubmissionEnforcer()));
                installationApply.getInstallationListener().onBeforeInstall(instrumentation, resettableClassFileTransformerDecorate);
                try {
                    r1.warmupStrategy.apply(resettableClassFileTransformerDecorate, r1.locationStrategy, r1.redefinitionStrategy, r1.circularityLock, installationApply.getInstallationListener());
                    handler.onBeforeRegistration(instrumentation);
                    if (handler.onRegistration(resettableClassFileTransformerDecorate)) {
                        if (r1.redefinitionStrategy.isRetransforming()) {
                            DISPATCHER.addTransformer(instrumentation, resettableClassFileTransformerDecorate, true);
                        } else {
                            instrumentation.addTransformer(resettableClassFileTransformerDecorate);
                        }
                    }
                    handler.onAfterRegistration(instrumentation);
                    r1.nativeMethodStrategy.apply(instrumentation, resettableClassFileTransformerDecorate);
                    r1.lambdaInstrumentationStrategy.apply(r1.byteBuddy, instrumentation, resettableClassFileTransformerDecorate);
                    redefinitionStrategy = r1.redefinitionStrategy;
                    poolStrategy = r1.poolStrategy;
                    locationStrategy = r1.locationStrategy;
                    descriptionStrategy = r1.descriptionStrategy;
                    fallbackStrategy = r1.fallbackStrategy;
                    discoveryStrategy = r1.redefinitionDiscoveryStrategy;
                    lambdaInstrumentationStrategy = r1.lambdaInstrumentationStrategy;
                    listener = installationApply.getListener();
                    listener2 = r1.redefinitionListener;
                    batchAllocator = r1.redefinitionBatchAllocator;
                    circularityLock = r1.circularityLock;
                    resettableClassFileTransformer = resettableClassFileTransformerDecorate;
                } catch (Throwable th) {
                    th = th;
                    resettableClassFileTransformer = resettableClassFileTransformerDecorate;
                }
                try {
                    redefinitionStrategy.apply(instrumentation, poolStrategy, locationStrategy, descriptionStrategy, fallbackStrategy, discoveryStrategy, lambdaInstrumentationStrategy, listener, listener2, rawMatcher, batchAllocator, circularityLock);
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        Throwable thOnError = installationApply.getInstallationListener().onError(instrumentation, resettableClassFileTransformer, th);
                        if (thOnError != null) {
                            ResettableClassFileTransformer resettableClassFileTransformer2 = resettableClassFileTransformer;
                            r1 = this;
                            instrumentation.removeTransformer(resettableClassFileTransformer2);
                            throw new IllegalStateException("Could not install class file transformer", thOnError);
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        r1 = this;
                        r1.circularityLock.release();
                        throw th;
                    }
                }
                installationApply.getInstallationListener().onInstall(instrumentation, resettableClassFileTransformer);
                ResettableClassFileTransformer resettableClassFileTransformer3 = resettableClassFileTransformer;
                this.circularityLock.release();
                return resettableClassFileTransformer3;
            } catch (Throwable th4) {
                th = th4;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        @AccessControllerPlugin.Enhance
        public static <T> T doPrivileged(PrivilegedAction<T> privilegedAction) {
            return ACCESS_CONTROLLER ? (T) AccessController.doPrivileged(privilegedAction) : privilegedAction.run();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: of */
        public static AgentBuilder m5124of(Plugin... pluginArr) {
            return m5117of((List<? extends Plugin>) Arrays.asList(pluginArr));
        }

        private static Instrumentation resolveByteBuddyAgentInstrumentation() {
            try {
                Class<?> clsLoadClass = ClassLoader.getSystemClassLoader().loadClass(INSTALLER_TYPE);
                JavaModule javaModuleOfType = JavaModule.ofType(AgentBuilder.class);
                JavaModule javaModuleOfType2 = JavaModule.ofType(clsLoadClass);
                if (javaModuleOfType != null && !javaModuleOfType.canRead(javaModuleOfType2)) {
                    Class<?> cls = Class.forName("java.lang.Module");
                    cls.getMethod("addReads", cls).invoke(javaModuleOfType.unwrap(), javaModuleOfType2.unwrap());
                }
                return (Instrumentation) clsLoadClass.getMethod(INSTALLER_GETTER, null).invoke(null, null);
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception e2) {
                throw new IllegalStateException("The Byte Buddy agent is not installed or not accessible", e2);
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // net.bytebuddy.agent.builder.AgentBuilder
        public AgentBuilder assureReadEdgeFromAndTo(Instrumentation instrumentation, Class<?>... clsArr) {
            return JavaModule.isSupported() ? with(Listener.ModuleReadEdgeCompleting.m5132of(instrumentation, true, clsArr)) : this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // net.bytebuddy.agent.builder.AgentBuilder
        public AgentBuilder assureReadEdgeTo(Instrumentation instrumentation, Class<?>... clsArr) {
            return JavaModule.isSupported() ? with(Listener.ModuleReadEdgeCompleting.m5132of(instrumentation, false, clsArr)) : this;
        }

        @Override // net.bytebuddy.agent.builder.AgentBuilder
        public AgentBuilder disableClassFormatChanges() {
            ByteBuddy byteBuddyWith = this.byteBuddy.with(Implementation.Context.Disabled.Factory.INSTANCE);
            Listener listener = this.listener;
            CircularityLock circularityLock = this.circularityLock;
            PoolStrategy poolStrategy = this.poolStrategy;
            TypeStrategy typeStrategy = this.typeStrategy;
            TypeStrategy.Default r6 = TypeStrategy.Default.DECORATE;
            if (typeStrategy != r6) {
                r6 = TypeStrategy.Default.REDEFINE_FROZEN;
            }
            return new Default(byteBuddyWith, listener, circularityLock, poolStrategy, r6, this.locationStrategy, this.classFileLocator, NativeMethodStrategy.Disabled.INSTANCE, this.warmupStrategy, this.transformerDecorator, InitializationStrategy.NoOp.INSTANCE, this.redefinitionStrategy, this.redefinitionDiscoveryStrategy, this.redefinitionBatchAllocator, this.redefinitionListener, this.redefinitionResubmissionStrategy, this.injectionStrategy, this.lambdaInstrumentationStrategy, this.descriptionStrategy, this.fallbackStrategy, this.classFileBufferStrategy, this.installationListener, this.ignoreMatcher, this.transformations);
        }

        @Override // net.bytebuddy.agent.builder.AgentBuilder
        public AgentBuilder disableNativeMethodPrefix() {
            return new Default(this.byteBuddy, this.listener, this.circularityLock, this.poolStrategy, this.typeStrategy, this.locationStrategy, this.classFileLocator, NativeMethodStrategy.Disabled.INSTANCE, this.warmupStrategy, this.transformerDecorator, this.initializationStrategy, this.redefinitionStrategy, this.redefinitionDiscoveryStrategy, this.redefinitionBatchAllocator, this.redefinitionListener, this.redefinitionResubmissionStrategy, this.injectionStrategy, this.lambdaInstrumentationStrategy, this.descriptionStrategy, this.fallbackStrategy, this.classFileBufferStrategy, this.installationListener, this.ignoreMatcher, this.transformations);
        }

        @Override // net.bytebuddy.agent.builder.AgentBuilder
        public AgentBuilder enableNativeMethodPrefix(String str) {
            return new Default(this.byteBuddy, this.listener, this.circularityLock, this.poolStrategy, this.typeStrategy, this.locationStrategy, this.classFileLocator, NativeMethodStrategy.ForPrefix.m5129of(str), this.warmupStrategy, this.transformerDecorator, this.initializationStrategy, this.redefinitionStrategy, this.redefinitionDiscoveryStrategy, this.redefinitionBatchAllocator, this.redefinitionListener, this.redefinitionResubmissionStrategy, this.injectionStrategy, this.lambdaInstrumentationStrategy, this.descriptionStrategy, this.fallbackStrategy, this.classFileBufferStrategy, this.installationListener, this.ignoreMatcher, this.transformations);
        }

        public boolean equals(@MaybeNull Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Default r5 = (Default) obj;
            return this.redefinitionStrategy.equals(r5.redefinitionStrategy) && this.lambdaInstrumentationStrategy.equals(r5.lambdaInstrumentationStrategy) && this.byteBuddy.equals(r5.byteBuddy) && this.listener.equals(r5.listener) && this.circularityLock.equals(r5.circularityLock) && this.poolStrategy.equals(r5.poolStrategy) && this.typeStrategy.equals(r5.typeStrategy) && this.locationStrategy.equals(r5.locationStrategy) && this.classFileLocator.equals(r5.classFileLocator) && this.nativeMethodStrategy.equals(r5.nativeMethodStrategy) && this.warmupStrategy.equals(r5.warmupStrategy) && this.transformerDecorator.equals(r5.transformerDecorator) && this.initializationStrategy.equals(r5.initializationStrategy) && this.redefinitionDiscoveryStrategy.equals(r5.redefinitionDiscoveryStrategy) && this.redefinitionBatchAllocator.equals(r5.redefinitionBatchAllocator) && this.redefinitionListener.equals(r5.redefinitionListener) && this.redefinitionResubmissionStrategy.equals(r5.redefinitionResubmissionStrategy) && this.injectionStrategy.equals(r5.injectionStrategy) && this.descriptionStrategy.equals(r5.descriptionStrategy) && this.fallbackStrategy.equals(r5.fallbackStrategy) && this.classFileBufferStrategy.equals(r5.classFileBufferStrategy) && this.installationListener.equals(r5.installationListener) && this.ignoreMatcher.equals(r5.ignoreMatcher) && this.transformations.equals(r5.transformations);
        }

        public int hashCode() {
            return (((((((((((((((((((((((((((((((((((((((((((((((getClass().hashCode() * 31) + this.byteBuddy.hashCode()) * 31) + this.listener.hashCode()) * 31) + this.circularityLock.hashCode()) * 31) + this.poolStrategy.hashCode()) * 31) + this.typeStrategy.hashCode()) * 31) + this.locationStrategy.hashCode()) * 31) + this.classFileLocator.hashCode()) * 31) + this.nativeMethodStrategy.hashCode()) * 31) + this.warmupStrategy.hashCode()) * 31) + this.transformerDecorator.hashCode()) * 31) + this.initializationStrategy.hashCode()) * 31) + this.redefinitionStrategy.hashCode()) * 31) + this.redefinitionDiscoveryStrategy.hashCode()) * 31) + this.redefinitionBatchAllocator.hashCode()) * 31) + this.redefinitionListener.hashCode()) * 31) + this.redefinitionResubmissionStrategy.hashCode()) * 31) + this.injectionStrategy.hashCode()) * 31) + this.lambdaInstrumentationStrategy.hashCode()) * 31) + this.descriptionStrategy.hashCode()) * 31) + this.fallbackStrategy.hashCode()) * 31) + this.classFileBufferStrategy.hashCode()) * 31) + this.installationListener.hashCode()) * 31) + this.ignoreMatcher.hashCode()) * 31) + this.transformations.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // net.bytebuddy.agent.builder.AgentBuilder
        public Ignored ignore(ElementMatcher<? super TypeDescription> elementMatcher) {
            return ignore(elementMatcher, ElementMatchers.any());
        }

        @Override // net.bytebuddy.agent.builder.AgentBuilder
        public ResettableClassFileTransformer installOn(Instrumentation instrumentation) {
            return doInstall(instrumentation, new Transformation.SimpleMatcher(this.ignoreMatcher, this.transformations), PatchMode.Handler.NoOp.INSTANCE);
        }

        @Override // net.bytebuddy.agent.builder.AgentBuilder
        public ResettableClassFileTransformer installOnByteBuddyAgent() {
            return installOn(resolveByteBuddyAgentInstrumentation());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // net.bytebuddy.agent.builder.AgentBuilder
        public ResettableClassFileTransformer patchOn(Instrumentation instrumentation, ResettableClassFileTransformer resettableClassFileTransformer) {
            return patchOn(instrumentation, resettableClassFileTransformer, PatchMode.m5133of(resettableClassFileTransformer));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // net.bytebuddy.agent.builder.AgentBuilder
        public ResettableClassFileTransformer patchOnByteBuddyAgent(ResettableClassFileTransformer resettableClassFileTransformer) {
            return patchOn(resolveByteBuddyAgentInstrumentation(), resettableClassFileTransformer);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // net.bytebuddy.agent.builder.AgentBuilder
        public Identified.Narrowable type(RawMatcher rawMatcher) {
            return new Transforming(rawMatcher, Collections.emptyList(), false);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // net.bytebuddy.agent.builder.AgentBuilder
        public AgentBuilder warmUp(Class<?>... clsArr) {
            return warmUp(Arrays.asList(clsArr));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // net.bytebuddy.agent.builder.AgentBuilder
        public AgentBuilder with(ByteBuddy byteBuddy) {
            return new Default(byteBuddy, this.listener, this.circularityLock, this.poolStrategy, this.typeStrategy, this.locationStrategy, this.classFileLocator, this.nativeMethodStrategy, this.warmupStrategy, this.transformerDecorator, this.initializationStrategy, this.redefinitionStrategy, this.redefinitionDiscoveryStrategy, this.redefinitionBatchAllocator, this.redefinitionListener, this.redefinitionResubmissionStrategy, this.injectionStrategy, this.lambdaInstrumentationStrategy, this.descriptionStrategy, this.fallbackStrategy, this.classFileBufferStrategy, this.installationListener, this.ignoreMatcher, this.transformations);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public Default(ByteBuddy byteBuddy) {
            this(byteBuddy, Listener.NoOp.INSTANCE, DEFAULT_LOCK, PoolStrategy.Default.FAST, TypeStrategy.Default.REBASE, LocationStrategy.ForClassLoader.STRONG, ClassFileLocator.NoOp.INSTANCE, NativeMethodStrategy.Disabled.INSTANCE, WarmupStrategy.NoOp.INSTANCE, TransformerDecorator.NoOp.INSTANCE, new InitializationStrategy.SelfInjection.Split(), RedefinitionStrategy.DISABLED, RedefinitionStrategy.DiscoveryStrategy.SinglePass.INSTANCE, RedefinitionStrategy.BatchAllocator.ForTotal.INSTANCE, RedefinitionStrategy.Listener.NoOp.INSTANCE, RedefinitionStrategy.ResubmissionStrategy.Disabled.INSTANCE, InjectionStrategy.UsingReflection.INSTANCE, LambdaInstrumentationStrategy.DISABLED, DescriptionStrategy.Default.HYBRID, FallbackStrategy.ByThrowableType.ofOptionalTypes(), ClassFileBufferStrategy.Default.RETAINING, InstallationListener.NoOp.INSTANCE, new RawMatcher.Disjunction(new RawMatcher.ForElementMatchers(ElementMatchers.any(), ElementMatchers.isBootstrapClassLoader().mo5389or(ElementMatchers.isExtensionClassLoader())), new RawMatcher.ForElementMatchers(ElementMatchers.nameStartsWith("net.bytebuddy.").and(ElementMatchers.not(ElementMatchers.nameStartsWith("net.bytebuddy.renamed."))).mo5389or(ElementMatchers.nameStartsWith("sun.reflect.").mo5389or(ElementMatchers.nameStartsWith("jdk.internal.reflect."))).mo5389or(ElementMatchers.isSynthetic()))), Collections.emptyList());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX INFO: renamed from: of */
        public static AgentBuilder m5117of(List<? extends Plugin> list) {
            return m5120of(EntryPoint.Default.REBASE, list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        @Override // net.bytebuddy.agent.builder.AgentBuilder
        public Ignored ignore(ElementMatcher<? super TypeDescription> elementMatcher, ElementMatcher<? super ClassLoader> elementMatcher2) {
            return ignore(elementMatcher, elementMatcher2, ElementMatchers.any());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: makeRaw()Ljava/lang/instrument/ClassFileTransformer; */
        @Override // net.bytebuddy.agent.builder.AgentBuilder
        public ResettableClassFileTransformer makeRaw() {
            return makeRaw(this.listener, InstallationListener.NoOp.INSTANCE, RedefinitionStrategy.ResubmissionEnforcer.Disabled.INSTANCE);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        @Override // net.bytebuddy.agent.builder.AgentBuilder
        public ResettableClassFileTransformer patchOn(Instrumentation instrumentation, ResettableClassFileTransformer resettableClassFileTransformer, RawMatcher rawMatcher) {
            return patchOn(instrumentation, resettableClassFileTransformer, rawMatcher, PatchMode.m5133of(resettableClassFileTransformer));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        @Override // net.bytebuddy.agent.builder.AgentBuilder
        public ResettableClassFileTransformer patchOnByteBuddyAgent(ResettableClassFileTransformer resettableClassFileTransformer, PatchMode patchMode) {
            return patchOn(resolveByteBuddyAgentInstrumentation(), resettableClassFileTransformer, patchMode);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        @Override // net.bytebuddy.agent.builder.AgentBuilder
        public Identified.Narrowable type(ElementMatcher<? super TypeDescription> elementMatcher) {
            return type(elementMatcher, ElementMatchers.any());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        @Override // net.bytebuddy.agent.builder.AgentBuilder
        public AgentBuilder warmUp(Collection<Class<?>> collection) {
            if (collection.isEmpty()) {
                return this;
            }
            for (Class<?> cls : collection) {
                if (cls.isPrimitive() || cls.isArray()) {
                    throw new IllegalArgumentException("Cannot warm up primitive or array type: " + cls);
                }
            }
            return new Default(this.byteBuddy, this.listener, this.circularityLock, this.poolStrategy, this.typeStrategy, this.locationStrategy, this.classFileLocator, this.nativeMethodStrategy, this.warmupStrategy.with(collection), this.transformerDecorator, this.initializationStrategy, this.redefinitionStrategy, this.redefinitionDiscoveryStrategy, this.redefinitionBatchAllocator, this.redefinitionListener, this.redefinitionResubmissionStrategy, this.injectionStrategy, this.lambdaInstrumentationStrategy, this.descriptionStrategy, this.fallbackStrategy, this.classFileBufferStrategy, this.installationListener, this.ignoreMatcher, this.transformations);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        @Override // net.bytebuddy.agent.builder.AgentBuilder
        public AgentBuilder with(Listener listener) {
            return new Default(this.byteBuddy, new Listener.Compound(this.listener, listener), this.circularityLock, this.poolStrategy, this.typeStrategy, this.locationStrategy, this.classFileLocator, this.nativeMethodStrategy, this.warmupStrategy, this.transformerDecorator, this.initializationStrategy, this.redefinitionStrategy, this.redefinitionDiscoveryStrategy, this.redefinitionBatchAllocator, this.redefinitionListener, this.redefinitionResubmissionStrategy, this.injectionStrategy, this.lambdaInstrumentationStrategy, this.descriptionStrategy, this.fallbackStrategy, this.classFileBufferStrategy, this.installationListener, this.ignoreMatcher, this.transformations);
        }

        public static class Redefining extends Default implements RedefinitionListenable.WithoutBatchStrategy {

            public class WithResubmission extends Delegator implements RedefinitionListenable.WithResubmissionSpecification {
                private final RedefinitionListenable.ResubmissionImmediateMatcher resubmissionImmediateMatcher;
                private final RedefinitionListenable.ResubmissionOnErrorMatcher resubmissionOnErrorMatcher;
                private final RedefinitionStrategy.ResubmissionScheduler resubmissionScheduler;

                public WithResubmission(RedefinitionStrategy.ResubmissionScheduler resubmissionScheduler, RedefinitionListenable.ResubmissionOnErrorMatcher resubmissionOnErrorMatcher, RedefinitionListenable.ResubmissionImmediateMatcher resubmissionImmediateMatcher) {
                    this.resubmissionScheduler = resubmissionScheduler;
                    this.resubmissionOnErrorMatcher = resubmissionOnErrorMatcher;
                    this.resubmissionImmediateMatcher = resubmissionImmediateMatcher;
                }

                @Override // net.bytebuddy.agent.builder.AgentBuilder.Default.Delegator
                public AgentBuilder materialize() {
                    Redefining redefining = Redefining.this;
                    ByteBuddy byteBuddy = redefining.byteBuddy;
                    Listener listener = redefining.listener;
                    CircularityLock circularityLock = redefining.circularityLock;
                    PoolStrategy poolStrategy = redefining.poolStrategy;
                    TypeStrategy typeStrategy = redefining.typeStrategy;
                    LocationStrategy locationStrategy = redefining.locationStrategy;
                    ClassFileLocator classFileLocator = redefining.classFileLocator;
                    NativeMethodStrategy nativeMethodStrategy = redefining.nativeMethodStrategy;
                    WarmupStrategy warmupStrategy = redefining.warmupStrategy;
                    TransformerDecorator transformerDecorator = redefining.transformerDecorator;
                    InitializationStrategy initializationStrategy = redefining.initializationStrategy;
                    RedefinitionStrategy redefinitionStrategy = redefining.redefinitionStrategy;
                    RedefinitionStrategy.DiscoveryStrategy discoveryStrategy = redefining.redefinitionDiscoveryStrategy;
                    RedefinitionStrategy.BatchAllocator batchAllocator = redefining.redefinitionBatchAllocator;
                    RedefinitionStrategy.Listener listener2 = redefining.redefinitionListener;
                    RedefinitionStrategy.ResubmissionStrategy.Enabled enabled = new RedefinitionStrategy.ResubmissionStrategy.Enabled(this.resubmissionScheduler, this.resubmissionOnErrorMatcher, this.resubmissionImmediateMatcher);
                    Redefining redefining2 = Redefining.this;
                    return new Default(byteBuddy, listener, circularityLock, poolStrategy, typeStrategy, locationStrategy, classFileLocator, nativeMethodStrategy, warmupStrategy, transformerDecorator, initializationStrategy, redefinitionStrategy, discoveryStrategy, batchAllocator, listener2, enabled, redefining2.injectionStrategy, redefining2.lambdaInstrumentationStrategy, redefining2.descriptionStrategy, redefining2.fallbackStrategy, redefining2.classFileBufferStrategy, redefining2.installationListener, redefining2.ignoreMatcher, redefining2.transformations);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // net.bytebuddy.agent.builder.AgentBuilder.RedefinitionListenable.WithoutResubmissionSpecification
                public RedefinitionListenable.WithResubmissionSpecification resubmitImmediate() {
                    return resubmitImmediate(ElementMatchers.any());
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // net.bytebuddy.agent.builder.AgentBuilder.RedefinitionListenable.WithoutResubmissionSpecification
                public RedefinitionListenable.WithResubmissionSpecification resubmitOnError() {
                    return resubmitOnError(ElementMatchers.any());
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
                @Override // net.bytebuddy.agent.builder.AgentBuilder.RedefinitionListenable.WithoutResubmissionSpecification
                public RedefinitionListenable.WithResubmissionSpecification resubmitImmediate(ElementMatcher<String> elementMatcher) {
                    return resubmitImmediate(elementMatcher, ElementMatchers.any());
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
                @Override // net.bytebuddy.agent.builder.AgentBuilder.RedefinitionListenable.WithoutResubmissionSpecification
                public RedefinitionListenable.WithResubmissionSpecification resubmitOnError(ElementMatcher<? super Throwable> elementMatcher) {
                    return resubmitOnError(elementMatcher, ElementMatchers.any());
                }

                @Override // net.bytebuddy.agent.builder.AgentBuilder.RedefinitionListenable.WithoutResubmissionSpecification
                public RedefinitionListenable.WithResubmissionSpecification resubmitImmediate(ElementMatcher<String> elementMatcher, ElementMatcher<? super ClassLoader> elementMatcher2) {
                    return resubmitImmediate(elementMatcher, elementMatcher2, ElementMatchers.any());
                }

                @Override // net.bytebuddy.agent.builder.AgentBuilder.RedefinitionListenable.WithoutResubmissionSpecification
                public RedefinitionListenable.WithResubmissionSpecification resubmitOnError(ElementMatcher<? super Throwable> elementMatcher, ElementMatcher<String> elementMatcher2) {
                    return resubmitOnError(elementMatcher, elementMatcher2, ElementMatchers.any());
                }

                @Override // net.bytebuddy.agent.builder.AgentBuilder.RedefinitionListenable.WithoutResubmissionSpecification
                public RedefinitionListenable.WithResubmissionSpecification resubmitImmediate(ElementMatcher<String> elementMatcher, ElementMatcher<? super ClassLoader> elementMatcher2, ElementMatcher<? super JavaModule> elementMatcher3) {
                    return resubmitImmediate(new RedefinitionListenable.ResubmissionImmediateMatcher.ForElementMatchers(elementMatcher, elementMatcher2, elementMatcher3));
                }

                @Override // net.bytebuddy.agent.builder.AgentBuilder.RedefinitionListenable.WithoutResubmissionSpecification
                public RedefinitionListenable.WithResubmissionSpecification resubmitOnError(ElementMatcher<? super Throwable> elementMatcher, ElementMatcher<String> elementMatcher2, ElementMatcher<? super ClassLoader> elementMatcher3) {
                    return resubmitOnError(elementMatcher, elementMatcher2, elementMatcher3, ElementMatchers.any());
                }

                @Override // net.bytebuddy.agent.builder.AgentBuilder.RedefinitionListenable.WithoutResubmissionSpecification
                public RedefinitionListenable.WithResubmissionSpecification resubmitImmediate(RedefinitionListenable.ResubmissionImmediateMatcher resubmissionImmediateMatcher) {
                    return Redefining.this.new WithResubmission(this.resubmissionScheduler, this.resubmissionOnErrorMatcher, new RedefinitionListenable.ResubmissionImmediateMatcher.Disjunction(this.resubmissionImmediateMatcher, resubmissionImmediateMatcher));
                }

                @Override // net.bytebuddy.agent.builder.AgentBuilder.RedefinitionListenable.WithoutResubmissionSpecification
                public RedefinitionListenable.WithResubmissionSpecification resubmitOnError(ElementMatcher<? super Throwable> elementMatcher, ElementMatcher<String> elementMatcher2, ElementMatcher<? super ClassLoader> elementMatcher3, ElementMatcher<? super JavaModule> elementMatcher4) {
                    return resubmitOnError(new RedefinitionListenable.ResubmissionOnErrorMatcher.ForElementMatchers(elementMatcher, elementMatcher2, elementMatcher3, elementMatcher4));
                }

                @Override // net.bytebuddy.agent.builder.AgentBuilder.RedefinitionListenable.WithoutResubmissionSpecification
                public RedefinitionListenable.WithResubmissionSpecification resubmitOnError(RedefinitionListenable.ResubmissionOnErrorMatcher resubmissionOnErrorMatcher) {
                    return Redefining.this.new WithResubmission(this.resubmissionScheduler, new RedefinitionListenable.ResubmissionOnErrorMatcher.Disjunction(this.resubmissionOnErrorMatcher, resubmissionOnErrorMatcher), this.resubmissionImmediateMatcher);
                }
            }

            public Redefining(ByteBuddy byteBuddy, Listener listener, CircularityLock circularityLock, PoolStrategy poolStrategy, TypeStrategy typeStrategy, LocationStrategy locationStrategy, ClassFileLocator classFileLocator, NativeMethodStrategy nativeMethodStrategy, WarmupStrategy warmupStrategy, TransformerDecorator transformerDecorator, InitializationStrategy initializationStrategy, RedefinitionStrategy redefinitionStrategy, RedefinitionStrategy.DiscoveryStrategy discoveryStrategy, RedefinitionStrategy.BatchAllocator batchAllocator, RedefinitionStrategy.Listener listener2, RedefinitionStrategy.ResubmissionStrategy resubmissionStrategy, InjectionStrategy injectionStrategy, LambdaInstrumentationStrategy lambdaInstrumentationStrategy, DescriptionStrategy descriptionStrategy, FallbackStrategy fallbackStrategy, ClassFileBufferStrategy classFileBufferStrategy, InstallationListener installationListener, RawMatcher rawMatcher, List<Transformation> list) {
                super(byteBuddy, listener, circularityLock, poolStrategy, typeStrategy, locationStrategy, classFileLocator, nativeMethodStrategy, warmupStrategy, transformerDecorator, initializationStrategy, redefinitionStrategy, discoveryStrategy, batchAllocator, listener2, resubmissionStrategy, injectionStrategy, lambdaInstrumentationStrategy, descriptionStrategy, fallbackStrategy, classFileBufferStrategy, installationListener, rawMatcher, list);
            }

            @Override // net.bytebuddy.agent.builder.AgentBuilder.Default, net.bytebuddy.agent.builder.AgentBuilder
            public /* bridge */ /* synthetic */ ClassFileTransformer makeRaw() {
                return super.makeRaw();
            }

            @Override // net.bytebuddy.agent.builder.AgentBuilder.RedefinitionListenable.WithImplicitDiscoveryStrategy
            public RedefinitionListenable redefineOnly(Class<?>... clsArr) {
                return with(new RedefinitionStrategy.DiscoveryStrategy.Explicit(clsArr));
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // net.bytebuddy.agent.builder.AgentBuilder.RedefinitionListenable.WithoutBatchStrategy
            public RedefinitionListenable.WithImplicitDiscoveryStrategy with(RedefinitionStrategy.BatchAllocator batchAllocator) {
                if (this.redefinitionStrategy.isEnabled()) {
                    return new Redefining(this.byteBuddy, this.listener, this.circularityLock, this.poolStrategy, this.typeStrategy, this.locationStrategy, this.classFileLocator, this.nativeMethodStrategy, this.warmupStrategy, this.transformerDecorator, this.initializationStrategy, this.redefinitionStrategy, this.redefinitionDiscoveryStrategy, batchAllocator, this.redefinitionListener, this.redefinitionResubmissionStrategy, this.injectionStrategy, this.lambdaInstrumentationStrategy, this.descriptionStrategy, this.fallbackStrategy, this.classFileBufferStrategy, this.installationListener, this.ignoreMatcher, this.transformations);
                }
                throw new IllegalStateException("Cannot set redefinition batch allocator when redefinition is disabled");
            }

            @Override // net.bytebuddy.agent.builder.AgentBuilder.RedefinitionListenable
            public RedefinitionListenable.WithoutResubmissionSpecification withResubmission(RedefinitionStrategy.ResubmissionScheduler resubmissionScheduler) {
                if (this.redefinitionStrategy.isEnabled()) {
                    return new WithResubmission(resubmissionScheduler, RedefinitionListenable.ResubmissionOnErrorMatcher.Trivial.NON_MATCHING, RedefinitionListenable.ResubmissionImmediateMatcher.Trivial.NON_MATCHING);
                }
                throw new IllegalStateException("Cannot enable resubmission when redefinition is disabled");
            }

            @Override // net.bytebuddy.agent.builder.AgentBuilder.RedefinitionListenable.WithImplicitDiscoveryStrategy
            public RedefinitionListenable with(RedefinitionStrategy.DiscoveryStrategy discoveryStrategy) {
                if (this.redefinitionStrategy.isEnabled()) {
                    return new Redefining(this.byteBuddy, this.listener, this.circularityLock, this.poolStrategy, this.typeStrategy, this.locationStrategy, this.classFileLocator, this.nativeMethodStrategy, this.warmupStrategy, this.transformerDecorator, this.initializationStrategy, this.redefinitionStrategy, discoveryStrategy, this.redefinitionBatchAllocator, this.redefinitionListener, this.redefinitionResubmissionStrategy, this.injectionStrategy, this.lambdaInstrumentationStrategy, this.descriptionStrategy, this.fallbackStrategy, this.classFileBufferStrategy, this.installationListener, this.ignoreMatcher, this.transformations);
                }
                throw new IllegalStateException("Cannot set redefinition discovery strategy when redefinition is disabled");
            }

            @Override // net.bytebuddy.agent.builder.AgentBuilder.RedefinitionListenable
            public RedefinitionListenable with(RedefinitionStrategy.Listener listener) {
                if (this.redefinitionStrategy.isEnabled()) {
                    return new Redefining(this.byteBuddy, this.listener, this.circularityLock, this.poolStrategy, this.typeStrategy, this.locationStrategy, this.classFileLocator, this.nativeMethodStrategy, this.warmupStrategy, this.transformerDecorator, this.initializationStrategy, this.redefinitionStrategy, this.redefinitionDiscoveryStrategy, this.redefinitionBatchAllocator, new RedefinitionStrategy.Listener.Compound(this.redefinitionListener, listener), this.redefinitionResubmissionStrategy, this.injectionStrategy, this.lambdaInstrumentationStrategy, this.descriptionStrategy, this.fallbackStrategy, this.classFileBufferStrategy, this.installationListener, this.ignoreMatcher, this.transformations);
                }
                throw new IllegalStateException("Cannot set redefinition listener when redefinition is disabled");
            }
        }

        private ResettableClassFileTransformer makeRaw(Listener listener, InstallationListener installationListener, RedefinitionStrategy.ResubmissionEnforcer resubmissionEnforcer) {
            return ExecutingTransformer.FACTORY.make(this.byteBuddy, listener, this.poolStrategy, this.typeStrategy, this.locationStrategy, this.classFileLocator, this.nativeMethodStrategy, this.initializationStrategy, this.injectionStrategy, this.lambdaInstrumentationStrategy, this.descriptionStrategy, this.fallbackStrategy, this.classFileBufferStrategy, installationListener, this.ignoreMatcher, resubmissionEnforcer, this.transformations, this.circularityLock);
        }

        /* JADX INFO: renamed from: of */
        public static AgentBuilder m5123of(EntryPoint entryPoint, Plugin... pluginArr) {
            return m5120of(entryPoint, (List<? extends Plugin>) Arrays.asList(pluginArr));
        }

        @Override // net.bytebuddy.agent.builder.AgentBuilder
        public AgentBuilder assureReadEdgeFromAndTo(Instrumentation instrumentation, JavaModule... javaModuleArr) {
            return assureReadEdgeFromAndTo(instrumentation, Arrays.asList(javaModuleArr));
        }

        @Override // net.bytebuddy.agent.builder.AgentBuilder
        public AgentBuilder assureReadEdgeTo(Instrumentation instrumentation, JavaModule... javaModuleArr) {
            return assureReadEdgeTo(instrumentation, Arrays.asList(javaModuleArr));
        }

        @Override // net.bytebuddy.agent.builder.AgentBuilder
        public Ignored ignore(ElementMatcher<? super TypeDescription> elementMatcher, ElementMatcher<? super ClassLoader> elementMatcher2, ElementMatcher<? super JavaModule> elementMatcher3) {
            return ignore(new RawMatcher.ForElementMatchers(elementMatcher, elementMatcher2, ElementMatchers.not(ElementMatchers.supportsModules()).mo5389or(elementMatcher3)));
        }

        @Override // net.bytebuddy.agent.builder.AgentBuilder
        public ResettableClassFileTransformer patchOn(Instrumentation instrumentation, ResettableClassFileTransformer resettableClassFileTransformer, PatchMode patchMode) {
            return patchOn(instrumentation, resettableClassFileTransformer, new Transformation.DifferentialMatcher(this.ignoreMatcher, this.transformations, resettableClassFileTransformer instanceof ResettableClassFileTransformer.Substitutable ? ((ResettableClassFileTransformer.Substitutable) resettableClassFileTransformer).unwrap() : resettableClassFileTransformer), patchMode);
        }

        @Override // net.bytebuddy.agent.builder.AgentBuilder
        public Identified.Narrowable type(ElementMatcher<? super TypeDescription> elementMatcher, ElementMatcher<? super ClassLoader> elementMatcher2) {
            return type(elementMatcher, elementMatcher2, ElementMatchers.any());
        }

        @Override // net.bytebuddy.agent.builder.AgentBuilder
        public AgentBuilder with(CircularityLock circularityLock) {
            return new Default(this.byteBuddy, this.listener, circularityLock, this.poolStrategy, this.typeStrategy, this.locationStrategy, this.classFileLocator, this.nativeMethodStrategy, this.warmupStrategy, this.transformerDecorator, this.initializationStrategy, this.redefinitionStrategy, this.redefinitionDiscoveryStrategy, this.redefinitionBatchAllocator, this.redefinitionListener, this.redefinitionResubmissionStrategy, this.injectionStrategy, this.lambdaInstrumentationStrategy, this.descriptionStrategy, this.fallbackStrategy, this.classFileBufferStrategy, this.installationListener, this.ignoreMatcher, this.transformations);
        }

        /* JADX INFO: renamed from: of */
        public static AgentBuilder m5120of(EntryPoint entryPoint, List<? extends Plugin> list) {
            return m5121of(entryPoint, ClassFileVersion.ofThisVm(ClassFileVersion.JAVA_V5), list);
        }

        @Override // net.bytebuddy.agent.builder.AgentBuilder
        public AgentBuilder assureReadEdgeFromAndTo(Instrumentation instrumentation, Collection<? extends JavaModule> collection) {
            return with(new Listener.ModuleReadEdgeCompleting(instrumentation, true, new HashSet(collection)));
        }

        @Override // net.bytebuddy.agent.builder.AgentBuilder
        public AgentBuilder assureReadEdgeTo(Instrumentation instrumentation, Collection<? extends JavaModule> collection) {
            return with(new Listener.ModuleReadEdgeCompleting(instrumentation, false, new HashSet(collection)));
        }

        @Override // net.bytebuddy.agent.builder.AgentBuilder
        public Ignored ignore(RawMatcher rawMatcher) {
            return new Ignoring(rawMatcher);
        }

        @Override // net.bytebuddy.agent.builder.AgentBuilder
        public Identified.Narrowable type(ElementMatcher<? super TypeDescription> elementMatcher, ElementMatcher<? super ClassLoader> elementMatcher2, ElementMatcher<? super JavaModule> elementMatcher3) {
            return type(new RawMatcher.ForElementMatchers(elementMatcher, elementMatcher2, ElementMatchers.not(ElementMatchers.supportsModules()).mo5389or(elementMatcher3)));
        }

        @Override // net.bytebuddy.agent.builder.AgentBuilder
        public AgentBuilder with(TypeStrategy typeStrategy) {
            return new Default(this.byteBuddy, this.listener, this.circularityLock, this.poolStrategy, typeStrategy, this.locationStrategy, this.classFileLocator, this.nativeMethodStrategy, this.warmupStrategy, this.transformerDecorator, this.initializationStrategy, this.redefinitionStrategy, this.redefinitionDiscoveryStrategy, this.redefinitionBatchAllocator, this.redefinitionListener, this.redefinitionResubmissionStrategy, this.injectionStrategy, this.lambdaInstrumentationStrategy, this.descriptionStrategy, this.fallbackStrategy, this.classFileBufferStrategy, this.installationListener, this.ignoreMatcher, this.transformations);
        }

        public static class ExecutingTransformer extends ResettableClassFileTransformer.AbstractBase {
            private static final boolean ACCESS_CONTROLLER;
            protected static final Factory FACTORY;

            @MaybeNull
            private final Object accessControlContext = getContext();
            private final ByteBuddy byteBuddy;
            private final CircularityLock circularityLock;
            private final ClassFileBufferStrategy classFileBufferStrategy;
            private final ClassFileLocator classFileLocator;
            private final DescriptionStrategy descriptionStrategy;
            private final FallbackStrategy fallbackStrategy;
            private final RawMatcher ignoreMatcher;
            private final InitializationStrategy initializationStrategy;
            private final InjectionStrategy injectionStrategy;
            private final InstallationListener installationListener;
            private final LambdaInstrumentationStrategy lambdaInstrumentationStrategy;
            private final Listener listener;
            private final LocationStrategy locationStrategy;
            private final NativeMethodStrategy nativeMethodStrategy;
            private final PoolStrategy poolStrategy;
            private final RedefinitionStrategy.ResubmissionEnforcer resubmissionEnforcer;
            private final List<Transformation> transformations;
            private final TypeStrategy typeStrategy;

            public interface Factory {

                public enum CreationAction implements PrivilegedAction<Factory> {
                    INSTANCE;

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
                    /* JADX DEBUG: Method merged with bridge method: run()Ljava/lang/Object; */
                    @Override // java.security.PrivilegedAction
                    @SuppressFBWarnings(justification = "Exception should not be rethrown but trigger a fallback.", value = {"REC_CATCH_EXCEPTION"})
                    public Factory run() {
                        try {
                            return new ForJava9CapableVm(new ByteBuddy().with(TypeValidation.DISABLED).subclass(ExecutingTransformer.class).name(ExecutingTransformer.class.getName() + "$ByteBuddy$ModuleSupport").method(ElementMatchers.named("transform").and(ElementMatchers.takesArgument(0, JavaType.MODULE.load()))).intercept(MethodCall.invoke(ExecutingTransformer.class.getDeclaredMethod("transform", Object.class, ClassLoader.class, String.class, Class.class, ProtectionDomain.class, byte[].class)).onSuper().withAllArguments()).make().load(ExecutingTransformer.class.getClassLoader(), ClassLoadingStrategy.Default.WRAPPER_PERSISTENT.with(ExecutingTransformer.class.getProtectionDomain())).getLoaded().getDeclaredConstructor(ByteBuddy.class, Listener.class, PoolStrategy.class, TypeStrategy.class, LocationStrategy.class, ClassFileLocator.class, NativeMethodStrategy.class, InitializationStrategy.class, InjectionStrategy.class, LambdaInstrumentationStrategy.class, DescriptionStrategy.class, FallbackStrategy.class, ClassFileBufferStrategy.class, InstallationListener.class, RawMatcher.class, RedefinitionStrategy.ResubmissionEnforcer.class, List.class, CircularityLock.class));
                        } catch (Exception unused) {
                            return ForLegacyVm.INSTANCE;
                        }
                    }
                }

                @HashCodeAndEqualsPlugin.Enhance
                public static class ForJava9CapableVm implements Factory {
                    private final Constructor<? extends ResettableClassFileTransformer> executingTransformer;

                    public ForJava9CapableVm(Constructor<? extends ResettableClassFileTransformer> constructor) {
                        this.executingTransformer = constructor;
                    }

                    public boolean equals(@MaybeNull Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return obj != null && getClass() == obj.getClass() && this.executingTransformer.equals(((ForJava9CapableVm) obj).executingTransformer);
                    }

                    public int hashCode() {
                        return (getClass().hashCode() * 31) + this.executingTransformer.hashCode();
                    }

                    @Override // net.bytebuddy.agent.builder.AgentBuilder.Default.ExecutingTransformer.Factory
                    public ResettableClassFileTransformer make(ByteBuddy byteBuddy, Listener listener, PoolStrategy poolStrategy, TypeStrategy typeStrategy, LocationStrategy locationStrategy, ClassFileLocator classFileLocator, NativeMethodStrategy nativeMethodStrategy, InitializationStrategy initializationStrategy, InjectionStrategy injectionStrategy, LambdaInstrumentationStrategy lambdaInstrumentationStrategy, DescriptionStrategy descriptionStrategy, FallbackStrategy fallbackStrategy, ClassFileBufferStrategy classFileBufferStrategy, InstallationListener installationListener, RawMatcher rawMatcher, RedefinitionStrategy.ResubmissionEnforcer resubmissionEnforcer, List<Transformation> list, CircularityLock circularityLock) {
                        try {
                            return this.executingTransformer.newInstance(byteBuddy, listener, poolStrategy, typeStrategy, locationStrategy, classFileLocator, nativeMethodStrategy, initializationStrategy, injectionStrategy, lambdaInstrumentationStrategy, descriptionStrategy, fallbackStrategy, classFileBufferStrategy, installationListener, rawMatcher, resubmissionEnforcer, list, circularityLock);
                        } catch (IllegalAccessException e) {
                            throw new IllegalStateException("Cannot access " + this.executingTransformer, e);
                        } catch (InstantiationException e2) {
                            throw new IllegalStateException("Cannot instantiate " + this.executingTransformer.getDeclaringClass(), e2);
                        } catch (InvocationTargetException e3) {
                            throw new IllegalStateException("Cannot invoke " + this.executingTransformer, e3.getTargetException());
                        }
                    }
                }

                public enum ForLegacyVm implements Factory {
                    INSTANCE;

                    @Override // net.bytebuddy.agent.builder.AgentBuilder.Default.ExecutingTransformer.Factory
                    public ResettableClassFileTransformer make(ByteBuddy byteBuddy, Listener listener, PoolStrategy poolStrategy, TypeStrategy typeStrategy, LocationStrategy locationStrategy, ClassFileLocator classFileLocator, NativeMethodStrategy nativeMethodStrategy, InitializationStrategy initializationStrategy, InjectionStrategy injectionStrategy, LambdaInstrumentationStrategy lambdaInstrumentationStrategy, DescriptionStrategy descriptionStrategy, FallbackStrategy fallbackStrategy, ClassFileBufferStrategy classFileBufferStrategy, InstallationListener installationListener, RawMatcher rawMatcher, RedefinitionStrategy.ResubmissionEnforcer resubmissionEnforcer, List<Transformation> list, CircularityLock circularityLock) {
                        return new ExecutingTransformer(byteBuddy, listener, poolStrategy, typeStrategy, locationStrategy, classFileLocator, nativeMethodStrategy, initializationStrategy, injectionStrategy, lambdaInstrumentationStrategy, descriptionStrategy, fallbackStrategy, classFileBufferStrategy, installationListener, rawMatcher, resubmissionEnforcer, list, circularityLock);
                    }
                }

                ResettableClassFileTransformer make(ByteBuddy byteBuddy, Listener listener, PoolStrategy poolStrategy, TypeStrategy typeStrategy, LocationStrategy locationStrategy, ClassFileLocator classFileLocator, NativeMethodStrategy nativeMethodStrategy, InitializationStrategy initializationStrategy, InjectionStrategy injectionStrategy, LambdaInstrumentationStrategy lambdaInstrumentationStrategy, DescriptionStrategy descriptionStrategy, FallbackStrategy fallbackStrategy, ClassFileBufferStrategy classFileBufferStrategy, InstallationListener installationListener, RawMatcher rawMatcher, RedefinitionStrategy.ResubmissionEnforcer resubmissionEnforcer, List<Transformation> list, CircularityLock circularityLock);
            }

            @HashCodeAndEqualsPlugin.Enhance(includeSyntheticFields = true)
            public class Java9CapableVmDispatcher implements PrivilegedAction<byte[]> {
                private final byte[] binaryRepresentation;

                @MaybeNull
                @HashCodeAndEqualsPlugin.ValueHandling(HashCodeAndEqualsPlugin.ValueHandling.Sort.REVERSE_NULLABILITY)
                private final Class<?> classBeingRedefined;

                @MaybeNull
                @HashCodeAndEqualsPlugin.ValueHandling(HashCodeAndEqualsPlugin.ValueHandling.Sort.REVERSE_NULLABILITY)
                private final ClassLoader classLoader;

                @MaybeNull
                @HashCodeAndEqualsPlugin.ValueHandling(HashCodeAndEqualsPlugin.ValueHandling.Sort.REVERSE_NULLABILITY)
                private final String internalTypeName;
                private final ProtectionDomain protectionDomain;
                private final Object rawModule;

                public Java9CapableVmDispatcher(Object obj, @MaybeNull ClassLoader classLoader, @MaybeNull String str, @MaybeNull Class<?> cls, ProtectionDomain protectionDomain, byte[] bArr) {
                    this.rawModule = obj;
                    this.classLoader = classLoader;
                    this.internalTypeName = str;
                    this.classBeingRedefined = cls;
                    this.protectionDomain = protectionDomain;
                    this.binaryRepresentation = bArr;
                }

                /* JADX WARN: Code restructure failed: missing block: B:17:0x0024, code lost:
                
                    if (r2 != null) goto L18;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:28:0x0041, code lost:
                
                    if (r2 != null) goto L29;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:36:0x0053, code lost:
                
                    if (r2 != null) goto L37;
                 */
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
                    String str = this.internalTypeName;
                    Java9CapableVmDispatcher java9CapableVmDispatcher = (Java9CapableVmDispatcher) obj;
                    String str2 = java9CapableVmDispatcher.internalTypeName;
                    if (str2 != null) {
                        if (str == null || !str.equals(str2)) {
                            return false;
                        }
                        if (!this.rawModule.equals(java9CapableVmDispatcher.rawModule)) {
                            return false;
                        }
                        ClassLoader classLoader = this.classLoader;
                        ClassLoader classLoader2 = java9CapableVmDispatcher.classLoader;
                        if (classLoader2 != null) {
                            if (classLoader == null || !classLoader.equals(classLoader2)) {
                                return false;
                            }
                            Class<?> cls = this.classBeingRedefined;
                            Class<?> cls2 = java9CapableVmDispatcher.classBeingRedefined;
                            if (cls2 != null) {
                                if (cls == null || !cls.equals(cls2)) {
                                    return false;
                                }
                                return this.protectionDomain.equals(java9CapableVmDispatcher.protectionDomain) && Arrays.equals(this.binaryRepresentation, java9CapableVmDispatcher.binaryRepresentation) && ExecutingTransformer.this.equals(ExecutingTransformer.this);
                            }
                        }
                    }
                }

                public int hashCode() {
                    int iHashCode = ((getClass().hashCode() * 31) + this.rawModule.hashCode()) * 31;
                    ClassLoader classLoader = this.classLoader;
                    if (classLoader != null) {
                        iHashCode += classLoader.hashCode();
                    }
                    int iHashCode2 = iHashCode * 31;
                    String str = this.internalTypeName;
                    if (str != null) {
                        iHashCode2 += str.hashCode();
                    }
                    int iHashCode3 = iHashCode2 * 31;
                    Class<?> cls = this.classBeingRedefined;
                    if (cls != null) {
                        iHashCode3 += cls.hashCode();
                    }
                    return (((((iHashCode3 * 31) + this.protectionDomain.hashCode()) * 31) + Arrays.hashCode(this.binaryRepresentation)) * 31) + ExecutingTransformer.this.hashCode();
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
                /* JADX DEBUG: Method merged with bridge method: run()Ljava/lang/Object; */
                @Override // java.security.PrivilegedAction
                @MaybeNull
                public byte[] run() {
                    return ExecutingTransformer.this.transform(JavaModule.m5430of(this.rawModule), this.classLoader, this.internalTypeName, this.classBeingRedefined, this.protectionDomain, this.binaryRepresentation);
                }
            }

            @HashCodeAndEqualsPlugin.Enhance(includeSyntheticFields = true)
            public class LegacyVmDispatcher implements PrivilegedAction<byte[]> {
                private final byte[] binaryRepresentation;

                @MaybeNull
                @HashCodeAndEqualsPlugin.ValueHandling(HashCodeAndEqualsPlugin.ValueHandling.Sort.REVERSE_NULLABILITY)
                private final Class<?> classBeingRedefined;

                @MaybeNull
                @HashCodeAndEqualsPlugin.ValueHandling(HashCodeAndEqualsPlugin.ValueHandling.Sort.REVERSE_NULLABILITY)
                private final ClassLoader classLoader;

                @MaybeNull
                @HashCodeAndEqualsPlugin.ValueHandling(HashCodeAndEqualsPlugin.ValueHandling.Sort.REVERSE_NULLABILITY)
                private final String internalTypeName;
                private final ProtectionDomain protectionDomain;

                public LegacyVmDispatcher(@MaybeNull ClassLoader classLoader, @MaybeNull String str, @MaybeNull Class<?> cls, ProtectionDomain protectionDomain, byte[] bArr) {
                    this.classLoader = classLoader;
                    this.internalTypeName = str;
                    this.classBeingRedefined = cls;
                    this.protectionDomain = protectionDomain;
                    this.binaryRepresentation = bArr;
                }

                /* JADX WARN: Code restructure failed: missing block: B:17:0x0024, code lost:
                
                    if (r2 != null) goto L18;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:25:0x0036, code lost:
                
                    if (r2 != null) goto L26;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:33:0x0048, code lost:
                
                    if (r2 != null) goto L34;
                 */
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
                    String str = this.internalTypeName;
                    LegacyVmDispatcher legacyVmDispatcher = (LegacyVmDispatcher) obj;
                    String str2 = legacyVmDispatcher.internalTypeName;
                    if (str2 != null) {
                        if (str == null || !str.equals(str2)) {
                            return false;
                        }
                        ClassLoader classLoader = this.classLoader;
                        ClassLoader classLoader2 = legacyVmDispatcher.classLoader;
                        if (classLoader2 != null) {
                            if (classLoader == null || !classLoader.equals(classLoader2)) {
                                return false;
                            }
                            Class<?> cls = this.classBeingRedefined;
                            Class<?> cls2 = legacyVmDispatcher.classBeingRedefined;
                            if (cls2 != null) {
                                if (cls == null || !cls.equals(cls2)) {
                                    return false;
                                }
                                return this.protectionDomain.equals(legacyVmDispatcher.protectionDomain) && Arrays.equals(this.binaryRepresentation, legacyVmDispatcher.binaryRepresentation) && ExecutingTransformer.this.equals(ExecutingTransformer.this);
                            }
                        }
                    }
                }

                public int hashCode() {
                    int iHashCode = getClass().hashCode() * 31;
                    ClassLoader classLoader = this.classLoader;
                    if (classLoader != null) {
                        iHashCode += classLoader.hashCode();
                    }
                    int iHashCode2 = iHashCode * 31;
                    String str = this.internalTypeName;
                    if (str != null) {
                        iHashCode2 += str.hashCode();
                    }
                    int iHashCode3 = iHashCode2 * 31;
                    Class<?> cls = this.classBeingRedefined;
                    if (cls != null) {
                        iHashCode3 += cls.hashCode();
                    }
                    return (((((iHashCode3 * 31) + this.protectionDomain.hashCode()) * 31) + Arrays.hashCode(this.binaryRepresentation)) * 31) + ExecutingTransformer.this.hashCode();
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
                /* JADX DEBUG: Method merged with bridge method: run()Ljava/lang/Object; */
                @Override // java.security.PrivilegedAction
                @MaybeNull
                public byte[] run() {
                    return ExecutingTransformer.this.transform(JavaModule.UNSUPPORTED, this.classLoader, this.internalTypeName, this.classBeingRedefined, this.protectionDomain, this.binaryRepresentation);
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
                FACTORY = (Factory) Default.doPrivileged(Factory.CreationAction.INSTANCE);
            }

            public ExecutingTransformer(ByteBuddy byteBuddy, Listener listener, PoolStrategy poolStrategy, TypeStrategy typeStrategy, LocationStrategy locationStrategy, ClassFileLocator classFileLocator, NativeMethodStrategy nativeMethodStrategy, InitializationStrategy initializationStrategy, InjectionStrategy injectionStrategy, LambdaInstrumentationStrategy lambdaInstrumentationStrategy, DescriptionStrategy descriptionStrategy, FallbackStrategy fallbackStrategy, ClassFileBufferStrategy classFileBufferStrategy, InstallationListener installationListener, RawMatcher rawMatcher, RedefinitionStrategy.ResubmissionEnforcer resubmissionEnforcer, List<Transformation> list, CircularityLock circularityLock) {
                this.byteBuddy = byteBuddy;
                this.typeStrategy = typeStrategy;
                this.poolStrategy = poolStrategy;
                this.locationStrategy = locationStrategy;
                this.classFileLocator = classFileLocator;
                this.listener = listener;
                this.nativeMethodStrategy = nativeMethodStrategy;
                this.initializationStrategy = initializationStrategy;
                this.injectionStrategy = injectionStrategy;
                this.lambdaInstrumentationStrategy = lambdaInstrumentationStrategy;
                this.descriptionStrategy = descriptionStrategy;
                this.fallbackStrategy = fallbackStrategy;
                this.classFileBufferStrategy = classFileBufferStrategy;
                this.installationListener = installationListener;
                this.ignoreMatcher = rawMatcher;
                this.resubmissionEnforcer = resubmissionEnforcer;
                this.transformations = list;
                this.circularityLock = circularityLock;
            }

            @AccessControllerPlugin.Enhance
            private static <T> T doPrivileged(PrivilegedAction<T> privilegedAction, @MaybeNull Object obj) {
                return ACCESS_CONTROLLER ? (T) AccessController.doPrivileged(privilegedAction, (AccessControlContext) obj) : privilegedAction.run();
            }

            @MaybeNull
            private byte[] doTransform(@MaybeNull JavaModule javaModule, @MaybeNull ClassLoader classLoader, String str, @MaybeNull Class<?> cls, boolean z, ProtectionDomain protectionDomain, TypePool typePool, ClassFileLocator classFileLocator) {
                TypeDescription typeDescriptionApply = this.descriptionStrategy.apply(str, cls, typePool, this.circularityLock, classLoader, javaModule);
                ArrayList arrayList = new ArrayList();
                if (!this.ignoreMatcher.matches(typeDescriptionApply, classLoader, javaModule, cls, protectionDomain)) {
                    for (Transformation transformation : this.transformations) {
                        if (transformation.getMatcher().matches(typeDescriptionApply, classLoader, javaModule, cls, protectionDomain)) {
                            arrayList.addAll(transformation.getTransformers());
                            if (transformation.isTerminal()) {
                                break;
                            }
                        }
                    }
                }
                if (arrayList.isEmpty()) {
                    this.listener.onIgnored(typeDescriptionApply, classLoader, javaModule, z);
                    return Transformation.NONE;
                }
                DynamicType.Builder<?> builder = this.typeStrategy.builder(typeDescriptionApply, this.byteBuddy, classFileLocator, this.nativeMethodStrategy.resolve(), classLoader, javaModule, protectionDomain);
                InitializationStrategy.Dispatcher dispatcher = this.initializationStrategy.dispatcher();
                Iterator it = arrayList.iterator();
                DynamicType.Builder<?> builderTransform = builder;
                while (it.hasNext()) {
                    builderTransform = ((Transformer) it.next()).transform(builderTransform, typeDescriptionApply, classLoader, javaModule, protectionDomain);
                }
                DynamicType.Unloaded<?> unloadedMake = dispatcher.apply(builderTransform).make(TypeResolutionStrategy.Disabled.INSTANCE, typePool);
                dispatcher.register(unloadedMake, classLoader, protectionDomain, this.injectionStrategy);
                this.listener.onTransformation(typeDescriptionApply, classLoader, javaModule, z, unloadedMake);
                return unloadedMake.getBytes();
            }

            @MaybeNull
            @AccessControllerPlugin.Enhance
            private static Object getContext() {
                if (ACCESS_CONTROLLER) {
                    return AccessController.getContext();
                }
                return null;
            }

            @Override // net.bytebuddy.agent.builder.ResettableClassFileTransformer
            public Iterator<Transformer> iterator(TypeDescription typeDescription, @MaybeNull ClassLoader classLoader, @MaybeNull JavaModule javaModule, @MaybeNull Class<?> cls, ProtectionDomain protectionDomain) {
                return this.ignoreMatcher.matches(typeDescription, classLoader, javaModule, cls, protectionDomain) ? Collections.emptySet().iterator() : new Transformation.TransformerIterator(typeDescription, classLoader, javaModule, cls, protectionDomain, this.transformations);
            }

            @Override // net.bytebuddy.agent.builder.ResettableClassFileTransformer
            public synchronized boolean reset(Instrumentation instrumentation, ResettableClassFileTransformer resettableClassFileTransformer, RedefinitionStrategy redefinitionStrategy, RedefinitionStrategy.DiscoveryStrategy discoveryStrategy, RedefinitionStrategy.BatchAllocator batchAllocator, RedefinitionStrategy.Listener listener) {
                if (!instrumentation.removeTransformer(resettableClassFileTransformer)) {
                    return false;
                }
                redefinitionStrategy.apply(instrumentation, this.poolStrategy, this.locationStrategy, this.descriptionStrategy, this.fallbackStrategy, discoveryStrategy, this.lambdaInstrumentationStrategy, Listener.NoOp.INSTANCE, listener, new Transformation.SimpleMatcher(this.ignoreMatcher, this.transformations), batchAllocator, CircularityLock.Inactive.INSTANCE);
                this.installationListener.onReset(instrumentation, resettableClassFileTransformer);
                return true;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @MaybeNull
            public byte[] transform(@MaybeNull ClassLoader classLoader, @MaybeNull String str, @MaybeNull Class<?> cls, ProtectionDomain protectionDomain, byte[] bArr) {
                if (!this.circularityLock.acquire()) {
                    return Default.NO_TRANSFORMATION;
                }
                try {
                    return (byte[]) doPrivileged(new LegacyVmDispatcher(classLoader, str, cls, protectionDomain, bArr), this.accessControlContext);
                } finally {
                    this.circularityLock.release();
                }
            }

            @MaybeNull
            public byte[] transform(Object obj, @MaybeNull ClassLoader classLoader, @MaybeNull String str, @MaybeNull Class<?> cls, ProtectionDomain protectionDomain, byte[] bArr) {
                if (this.circularityLock.acquire()) {
                    try {
                        return (byte[]) doPrivileged(new Java9CapableVmDispatcher(obj, classLoader, str, cls, protectionDomain, bArr), this.accessControlContext);
                    } finally {
                        this.circularityLock.release();
                    }
                }
                return Default.NO_TRANSFORMATION;
            }

            /* JADX DEBUG: Another duplicated slice has different insns count: {[IGET]}, finally: {[IGET, INVOKE, CONST, INVOKE, IF] complete} */
            /* JADX DEBUG: Another duplicated slice has different insns count: {[IGET]}, finally: {[IGET, MOVE] complete} */
            /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
            /* JADX DEBUG: Finally have unexpected throw blocks count: 3, expect 1 */
            /* JADX INFO: Access modifiers changed from: private */
            @MaybeNull
            public byte[] transform(@MaybeNull JavaModule javaModule, @MaybeNull ClassLoader classLoader, @MaybeNull String str, @MaybeNull Class<?> cls, ProtectionDomain protectionDomain, byte[] bArr) {
                String str2;
                String str3;
                if (str != null && this.lambdaInstrumentationStrategy.isInstrumented(cls)) {
                    String strReplace = str.replace('/', TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
                    try {
                        if (this.resubmissionEnforcer.isEnforced(strReplace, classLoader, javaModule, cls)) {
                            return Default.NO_TRANSFORMATION;
                        }
                        try {
                            this.listener.onDiscovery(strReplace, classLoader, javaModule, cls != null);
                            ClassFileLocator.Compound compound = new ClassFileLocator.Compound(this.classFileBufferStrategy.resolve(strReplace, bArr, classLoader, javaModule, protectionDomain), this.classFileLocator, this.locationStrategy.classFileLocator(classLoader, javaModule));
                            TypePool typePool = this.classFileBufferStrategy.typePool(this.poolStrategy, compound, classLoader, strReplace);
                            str2 = strReplace;
                            str3 = "Failed transformation of ";
                            try {
                                return doTransform(javaModule, classLoader, strReplace, cls, cls != null, protectionDomain, typePool, compound);
                            } catch (Throwable th) {
                                if (cls != null) {
                                    try {
                                        if (this.descriptionStrategy.isLoadedFirst() && this.fallbackStrategy.isFallback(cls, th)) {
                                            byte[] bArrDoTransform = doTransform(javaModule, classLoader, str2, Default.NOT_PREVIOUSLY_DEFINED, true, protectionDomain, typePool, compound);
                                            this.listener.onComplete(str2, classLoader, javaModule, true);
                                            return bArrDoTransform;
                                        }
                                        throw th;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        try {
                                            this.listener.onError(str2, classLoader, javaModule, cls != null, th);
                                            throw new IllegalStateException(str3 + str2, th);
                                        } finally {
                                            this.listener.onComplete(str2, classLoader, javaModule, cls != null);
                                        }
                                    }
                                }
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            str2 = strReplace;
                            str3 = "Failed transformation of ";
                        }
                    } catch (Throwable th4) {
                        try {
                            this.listener.onDiscovery(strReplace, classLoader, javaModule, cls != null);
                            this.listener.onError(strReplace, classLoader, javaModule, cls != null, th4);
                            throw new IllegalStateException("Failed transformation of " + strReplace, th4);
                        } catch (Throwable th5) {
                            this.listener.onError(strReplace, classLoader, javaModule, cls != null, th4);
                            throw th5;
                        }
                    }
                } else {
                    return Default.NO_TRANSFORMATION;
                }
            }
        }

        /* JADX INFO: renamed from: of */
        public static AgentBuilder m5119of(ClassFileVersion classFileVersion, Plugin... pluginArr) {
            return m5118of(classFileVersion, (List<? extends Plugin>) Arrays.asList(pluginArr));
        }

        @Override // net.bytebuddy.agent.builder.AgentBuilder
        public AgentBuilder with(PoolStrategy poolStrategy) {
            return new Default(this.byteBuddy, this.listener, this.circularityLock, poolStrategy, this.typeStrategy, this.locationStrategy, this.classFileLocator, this.nativeMethodStrategy, this.warmupStrategy, this.transformerDecorator, this.initializationStrategy, this.redefinitionStrategy, this.redefinitionDiscoveryStrategy, this.redefinitionBatchAllocator, this.redefinitionListener, this.redefinitionResubmissionStrategy, this.injectionStrategy, this.lambdaInstrumentationStrategy, this.descriptionStrategy, this.fallbackStrategy, this.classFileBufferStrategy, this.installationListener, this.ignoreMatcher, this.transformations);
        }

        /* JADX INFO: renamed from: of */
        public static AgentBuilder m5118of(ClassFileVersion classFileVersion, List<? extends Plugin> list) {
            return m5121of(EntryPoint.Default.REBASE, classFileVersion, list);
        }

        @Override // net.bytebuddy.agent.builder.AgentBuilder
        public ResettableClassFileTransformer patchOn(Instrumentation instrumentation, ResettableClassFileTransformer resettableClassFileTransformer, RawMatcher rawMatcher, PatchMode patchMode) {
            return doInstall(instrumentation, rawMatcher, patchMode.toHandler(resettableClassFileTransformer));
        }

        @Override // net.bytebuddy.agent.builder.AgentBuilder
        public AgentBuilder with(LocationStrategy locationStrategy) {
            return new Default(this.byteBuddy, this.listener, this.circularityLock, this.poolStrategy, this.typeStrategy, locationStrategy, this.classFileLocator, this.nativeMethodStrategy, this.warmupStrategy, this.transformerDecorator, this.initializationStrategy, this.redefinitionStrategy, this.redefinitionDiscoveryStrategy, this.redefinitionBatchAllocator, this.redefinitionListener, this.redefinitionResubmissionStrategy, this.injectionStrategy, this.lambdaInstrumentationStrategy, this.descriptionStrategy, this.fallbackStrategy, this.classFileBufferStrategy, this.installationListener, this.ignoreMatcher, this.transformations);
        }

        /* JADX INFO: renamed from: of */
        public static AgentBuilder m5122of(EntryPoint entryPoint, ClassFileVersion classFileVersion, Plugin... pluginArr) {
            return m5121of(entryPoint, classFileVersion, (List<? extends Plugin>) Arrays.asList(pluginArr));
        }

        @Override // net.bytebuddy.agent.builder.AgentBuilder
        public AgentBuilder with(ClassFileLocator classFileLocator) {
            return new Default(this.byteBuddy, this.listener, this.circularityLock, this.poolStrategy, this.typeStrategy, this.locationStrategy, new ClassFileLocator.Compound(this.classFileLocator, classFileLocator), this.nativeMethodStrategy, this.warmupStrategy, this.transformerDecorator, this.initializationStrategy, this.redefinitionStrategy, this.redefinitionDiscoveryStrategy, this.redefinitionBatchAllocator, this.redefinitionListener, this.redefinitionResubmissionStrategy, this.injectionStrategy, this.lambdaInstrumentationStrategy, this.descriptionStrategy, this.fallbackStrategy, this.classFileBufferStrategy, this.installationListener, this.ignoreMatcher, this.transformations);
        }

        /* JADX INFO: renamed from: of */
        public static AgentBuilder m5121of(EntryPoint entryPoint, ClassFileVersion classFileVersion, List<? extends Plugin> list) {
            AgentBuilder agentBuilderWith = new Default(entryPoint.byteBuddy(classFileVersion)).with(new TypeStrategy.ForBuildEntryPoint(entryPoint));
            for (Plugin plugin : list) {
                agentBuilderWith = agentBuilderWith.type(plugin).transform(new Transformer.ForBuildPlugin(plugin));
            }
            return agentBuilderWith;
        }

        @Override // net.bytebuddy.agent.builder.AgentBuilder
        public AgentBuilder with(TransformerDecorator transformerDecorator) {
            return new Default(this.byteBuddy, this.listener, this.circularityLock, this.poolStrategy, this.typeStrategy, this.locationStrategy, this.classFileLocator, this.nativeMethodStrategy, this.warmupStrategy, new TransformerDecorator.Compound(this.transformerDecorator, transformerDecorator), this.initializationStrategy, this.redefinitionStrategy, this.redefinitionDiscoveryStrategy, this.redefinitionBatchAllocator, this.redefinitionListener, this.redefinitionResubmissionStrategy, this.injectionStrategy, this.lambdaInstrumentationStrategy, this.descriptionStrategy, this.fallbackStrategy, this.classFileBufferStrategy, this.installationListener, this.ignoreMatcher, this.transformations);
        }

        @Override // net.bytebuddy.agent.builder.AgentBuilder
        public RedefinitionListenable.WithoutBatchStrategy with(RedefinitionStrategy redefinitionStrategy) {
            return new Redefining(this.byteBuddy, this.listener, this.circularityLock, this.poolStrategy, this.typeStrategy, this.locationStrategy, this.classFileLocator, this.nativeMethodStrategy, this.warmupStrategy, this.transformerDecorator, this.initializationStrategy, redefinitionStrategy, RedefinitionStrategy.DiscoveryStrategy.SinglePass.INSTANCE, RedefinitionStrategy.BatchAllocator.ForTotal.INSTANCE, RedefinitionStrategy.Listener.NoOp.INSTANCE, RedefinitionStrategy.ResubmissionStrategy.Disabled.INSTANCE, this.injectionStrategy, this.lambdaInstrumentationStrategy, this.descriptionStrategy, this.fallbackStrategy, this.classFileBufferStrategy, this.installationListener, this.ignoreMatcher, this.transformations);
        }

        @Override // net.bytebuddy.agent.builder.AgentBuilder
        public AgentBuilder with(InitializationStrategy initializationStrategy) {
            return new Default(this.byteBuddy, this.listener, this.circularityLock, this.poolStrategy, this.typeStrategy, this.locationStrategy, this.classFileLocator, this.nativeMethodStrategy, this.warmupStrategy, this.transformerDecorator, initializationStrategy, this.redefinitionStrategy, this.redefinitionDiscoveryStrategy, this.redefinitionBatchAllocator, this.redefinitionListener, this.redefinitionResubmissionStrategy, this.injectionStrategy, this.lambdaInstrumentationStrategy, this.descriptionStrategy, this.fallbackStrategy, this.classFileBufferStrategy, this.installationListener, this.ignoreMatcher, this.transformations);
        }

        public Default(ByteBuddy byteBuddy, Listener listener, CircularityLock circularityLock, PoolStrategy poolStrategy, TypeStrategy typeStrategy, LocationStrategy locationStrategy, ClassFileLocator classFileLocator, NativeMethodStrategy nativeMethodStrategy, WarmupStrategy warmupStrategy, TransformerDecorator transformerDecorator, InitializationStrategy initializationStrategy, RedefinitionStrategy redefinitionStrategy, RedefinitionStrategy.DiscoveryStrategy discoveryStrategy, RedefinitionStrategy.BatchAllocator batchAllocator, RedefinitionStrategy.Listener listener2, RedefinitionStrategy.ResubmissionStrategy resubmissionStrategy, InjectionStrategy injectionStrategy, LambdaInstrumentationStrategy lambdaInstrumentationStrategy, DescriptionStrategy descriptionStrategy, FallbackStrategy fallbackStrategy, ClassFileBufferStrategy classFileBufferStrategy, InstallationListener installationListener, RawMatcher rawMatcher, List<Transformation> list) {
            this.byteBuddy = byteBuddy;
            this.listener = listener;
            this.circularityLock = circularityLock;
            this.poolStrategy = poolStrategy;
            this.typeStrategy = typeStrategy;
            this.locationStrategy = locationStrategy;
            this.classFileLocator = classFileLocator;
            this.nativeMethodStrategy = nativeMethodStrategy;
            this.warmupStrategy = warmupStrategy;
            this.transformerDecorator = transformerDecorator;
            this.initializationStrategy = initializationStrategy;
            this.redefinitionStrategy = redefinitionStrategy;
            this.redefinitionDiscoveryStrategy = discoveryStrategy;
            this.redefinitionBatchAllocator = batchAllocator;
            this.redefinitionListener = listener2;
            this.redefinitionResubmissionStrategy = resubmissionStrategy;
            this.injectionStrategy = injectionStrategy;
            this.lambdaInstrumentationStrategy = lambdaInstrumentationStrategy;
            this.descriptionStrategy = descriptionStrategy;
            this.fallbackStrategy = fallbackStrategy;
            this.classFileBufferStrategy = classFileBufferStrategy;
            this.installationListener = installationListener;
            this.ignoreMatcher = rawMatcher;
            this.transformations = list;
        }

        @Override // net.bytebuddy.agent.builder.AgentBuilder
        public AgentBuilder with(LambdaInstrumentationStrategy lambdaInstrumentationStrategy) {
            return new Default(this.byteBuddy, this.listener, this.circularityLock, this.poolStrategy, this.typeStrategy, this.locationStrategy, this.classFileLocator, this.nativeMethodStrategy, this.warmupStrategy, this.transformerDecorator, this.initializationStrategy, this.redefinitionStrategy, this.redefinitionDiscoveryStrategy, this.redefinitionBatchAllocator, this.redefinitionListener, this.redefinitionResubmissionStrategy, this.injectionStrategy, lambdaInstrumentationStrategy, this.descriptionStrategy, this.fallbackStrategy, this.classFileBufferStrategy, this.installationListener, this.ignoreMatcher, this.transformations);
        }

        @Override // net.bytebuddy.agent.builder.AgentBuilder
        public AgentBuilder with(DescriptionStrategy descriptionStrategy) {
            return new Default(this.byteBuddy, this.listener, this.circularityLock, this.poolStrategy, this.typeStrategy, this.locationStrategy, this.classFileLocator, this.nativeMethodStrategy, this.warmupStrategy, this.transformerDecorator, this.initializationStrategy, this.redefinitionStrategy, this.redefinitionDiscoveryStrategy, this.redefinitionBatchAllocator, this.redefinitionListener, this.redefinitionResubmissionStrategy, this.injectionStrategy, this.lambdaInstrumentationStrategy, descriptionStrategy, this.fallbackStrategy, this.classFileBufferStrategy, this.installationListener, this.ignoreMatcher, this.transformations);
        }

        @Override // net.bytebuddy.agent.builder.AgentBuilder
        public AgentBuilder with(FallbackStrategy fallbackStrategy) {
            return new Default(this.byteBuddy, this.listener, this.circularityLock, this.poolStrategy, this.typeStrategy, this.locationStrategy, this.classFileLocator, this.nativeMethodStrategy, this.warmupStrategy, this.transformerDecorator, this.initializationStrategy, this.redefinitionStrategy, this.redefinitionDiscoveryStrategy, this.redefinitionBatchAllocator, this.redefinitionListener, this.redefinitionResubmissionStrategy, this.injectionStrategy, this.lambdaInstrumentationStrategy, this.descriptionStrategy, fallbackStrategy, this.classFileBufferStrategy, this.installationListener, this.ignoreMatcher, this.transformations);
        }

        @Override // net.bytebuddy.agent.builder.AgentBuilder
        public AgentBuilder with(ClassFileBufferStrategy classFileBufferStrategy) {
            return new Default(this.byteBuddy, this.listener, this.circularityLock, this.poolStrategy, this.typeStrategy, this.locationStrategy, this.classFileLocator, this.nativeMethodStrategy, this.warmupStrategy, this.transformerDecorator, this.initializationStrategy, this.redefinitionStrategy, this.redefinitionDiscoveryStrategy, this.redefinitionBatchAllocator, this.redefinitionListener, this.redefinitionResubmissionStrategy, this.injectionStrategy, this.lambdaInstrumentationStrategy, this.descriptionStrategy, this.fallbackStrategy, classFileBufferStrategy, this.installationListener, this.ignoreMatcher, this.transformations);
        }

        @Override // net.bytebuddy.agent.builder.AgentBuilder
        public AgentBuilder with(InstallationListener installationListener) {
            return new Default(this.byteBuddy, this.listener, this.circularityLock, this.poolStrategy, this.typeStrategy, this.locationStrategy, this.classFileLocator, this.nativeMethodStrategy, this.warmupStrategy, this.transformerDecorator, this.initializationStrategy, this.redefinitionStrategy, this.redefinitionDiscoveryStrategy, this.redefinitionBatchAllocator, this.redefinitionListener, this.redefinitionResubmissionStrategy, this.injectionStrategy, this.lambdaInstrumentationStrategy, this.descriptionStrategy, this.fallbackStrategy, this.classFileBufferStrategy, new InstallationListener.Compound(this.installationListener, installationListener), this.ignoreMatcher, this.transformations);
        }

        @Override // net.bytebuddy.agent.builder.AgentBuilder
        public AgentBuilder with(InjectionStrategy injectionStrategy) {
            return new Default(this.byteBuddy, this.listener, this.circularityLock, this.poolStrategy, this.typeStrategy, this.locationStrategy, this.classFileLocator, this.nativeMethodStrategy, this.warmupStrategy, this.transformerDecorator, this.initializationStrategy, this.redefinitionStrategy, this.redefinitionDiscoveryStrategy, this.redefinitionBatchAllocator, this.redefinitionListener, this.redefinitionResubmissionStrategy, injectionStrategy, this.lambdaInstrumentationStrategy, this.descriptionStrategy, this.fallbackStrategy, this.classFileBufferStrategy, this.installationListener, this.ignoreMatcher, this.transformations);
        }
    }

    public interface DescriptionStrategy {

        public enum Default implements DescriptionStrategy {
            HYBRID(true) { // from class: net.bytebuddy.agent.builder.AgentBuilder.DescriptionStrategy.Default.1
                @Override // net.bytebuddy.agent.builder.AgentBuilder.DescriptionStrategy
                public TypeDescription apply(String str, @MaybeNull Class<?> cls, TypePool typePool, CircularityLock circularityLock, @MaybeNull ClassLoader classLoader, @MaybeNull JavaModule javaModule) {
                    return cls == null ? typePool.describe(str).resolve() : TypeDescription.ForLoadedType.m5238of(cls);
                }
            },
            POOL_ONLY(0 == true ? 1 : 0) { // from class: net.bytebuddy.agent.builder.AgentBuilder.DescriptionStrategy.Default.2
                @Override // net.bytebuddy.agent.builder.AgentBuilder.DescriptionStrategy
                public TypeDescription apply(String str, @MaybeNull Class<?> cls, TypePool typePool, CircularityLock circularityLock, @MaybeNull ClassLoader classLoader, @MaybeNull JavaModule javaModule) {
                    return typePool.describe(str).resolve();
                }
            },
            POOL_FIRST(0 == true ? 1 : 0) { // from class: net.bytebuddy.agent.builder.AgentBuilder.DescriptionStrategy.Default.3
                @Override // net.bytebuddy.agent.builder.AgentBuilder.DescriptionStrategy
                public TypeDescription apply(String str, @MaybeNull Class<?> cls, TypePool typePool, CircularityLock circularityLock, @MaybeNull ClassLoader classLoader, @MaybeNull JavaModule javaModule) {
                    TypePool.Resolution resolutionDescribe = typePool.describe(str);
                    return (resolutionDescribe.isResolved() || cls == null) ? resolutionDescribe.resolve() : TypeDescription.ForLoadedType.m5238of(cls);
                }
            };

            private final boolean loadedFirst;

            @Override // net.bytebuddy.agent.builder.AgentBuilder.DescriptionStrategy
            public boolean isLoadedFirst() {
                return this.loadedFirst;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public DescriptionStrategy withSuperTypeLoading() {
                return new SuperTypeLoading(this);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            Default(boolean z) {
                this.loadedFirst = z;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            public DescriptionStrategy withSuperTypeLoading(ExecutorService executorService) {
                return new SuperTypeLoading.Asynchronous(this, executorService);
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class SuperTypeLoading implements DescriptionStrategy {
            private final DescriptionStrategy delegate;

            @HashCodeAndEqualsPlugin.Enhance
            public static class Asynchronous implements DescriptionStrategy {
                private final DescriptionStrategy delegate;
                private final ExecutorService executorService;

                @HashCodeAndEqualsPlugin.Enhance
                public static class ThreadSwitchingClassLoadingDelegate implements TypeDescription.SuperTypeLoading.ClassLoadingDelegate {
                    private final ExecutorService executorService;

                    @HashCodeAndEqualsPlugin.Enhance
                    public static class NotifyingClassLoadingAction implements Callable<Class<?>> {
                        private final ClassLoader classLoader;
                        private final String name;
                        private final AtomicBoolean signal;

                        public NotifyingClassLoadingAction(String str, ClassLoader classLoader, AtomicBoolean atomicBoolean) {
                            this.name = str;
                            this.classLoader = classLoader;
                            this.signal = atomicBoolean;
                        }

                        public boolean equals(@MaybeNull Object obj) {
                            if (this == obj) {
                                return true;
                            }
                            if (obj == null || getClass() != obj.getClass()) {
                                return false;
                            }
                            NotifyingClassLoadingAction notifyingClassLoadingAction = (NotifyingClassLoadingAction) obj;
                            return this.name.equals(notifyingClassLoadingAction.name) && this.classLoader.equals(notifyingClassLoadingAction.classLoader) && this.signal.equals(notifyingClassLoadingAction.signal);
                        }

                        public int hashCode() {
                            return (((((getClass().hashCode() * 31) + this.name.hashCode()) * 31) + this.classLoader.hashCode()) * 31) + this.signal.hashCode();
                        }

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
                        /* JADX DEBUG: Method merged with bridge method: call()Ljava/lang/Object; */
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // java.util.concurrent.Callable
                        public Class<?> call() throws ClassNotFoundException {
                            Class<?> cls;
                            synchronized (this.classLoader) {
                                try {
                                    try {
                                        cls = Class.forName(this.name, false, this.classLoader);
                                    } finally {
                                        this.signal.set(false);
                                        this.classLoader.notifyAll();
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                            return cls;
                        }
                    }

                    @HashCodeAndEqualsPlugin.Enhance
                    public static class SimpleClassLoadingAction implements Callable<Class<?>> {

                        @MaybeNull
                        @HashCodeAndEqualsPlugin.ValueHandling(HashCodeAndEqualsPlugin.ValueHandling.Sort.REVERSE_NULLABILITY)
                        private final ClassLoader classLoader;
                        private final String name;

                        public SimpleClassLoadingAction(String str, @MaybeNull ClassLoader classLoader) {
                            this.name = str;
                            this.classLoader = classLoader;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:22:0x0032 A[RETURN] */
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
                            SimpleClassLoadingAction simpleClassLoadingAction = (SimpleClassLoadingAction) obj;
                            if (!this.name.equals(simpleClassLoadingAction.name)) {
                                return false;
                            }
                            ClassLoader classLoader = this.classLoader;
                            ClassLoader classLoader2 = simpleClassLoadingAction.classLoader;
                            if (classLoader2 != null) {
                                return classLoader != null && classLoader.equals(classLoader2);
                            }
                            if (classLoader != null) {
                                return false;
                            }
                        }

                        public int hashCode() {
                            int iHashCode = ((getClass().hashCode() * 31) + this.name.hashCode()) * 31;
                            ClassLoader classLoader = this.classLoader;
                            return classLoader != null ? iHashCode + classLoader.hashCode() : iHashCode;
                        }

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
                        /* JADX DEBUG: Method merged with bridge method: call()Ljava/lang/Object; */
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // java.util.concurrent.Callable
                        public Class<?> call() throws ClassNotFoundException {
                            return Class.forName(this.name, false, this.classLoader);
                        }
                    }

                    public ThreadSwitchingClassLoadingDelegate(ExecutorService executorService) {
                        this.executorService = executorService;
                    }

                    public boolean equals(@MaybeNull Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return obj != null && getClass() == obj.getClass() && this.executorService.equals(((ThreadSwitchingClassLoadingDelegate) obj).executorService);
                    }

                    public int hashCode() {
                        return (getClass().hashCode() * 31) + this.executorService.hashCode();
                    }

                    @Override // net.bytebuddy.description.type.TypeDescription.SuperTypeLoading.ClassLoadingDelegate
                    public Class<?> load(String str, @MaybeNull ClassLoader classLoader) {
                        boolean z = classLoader != null && Thread.holdsLock(classLoader);
                        AtomicBoolean atomicBoolean = new AtomicBoolean(z);
                        Future futureSubmit = this.executorService.submit(z ? new NotifyingClassLoadingAction(str, classLoader, atomicBoolean) : new SimpleClassLoadingAction(str, classLoader));
                        while (z) {
                            try {
                                if (!atomicBoolean.get()) {
                                    break;
                                }
                                classLoader.wait();
                            } catch (ExecutionException e) {
                                throw new IllegalStateException("Could not load " + str + " asynchronously", e.getCause());
                            } catch (Exception e2) {
                                throw new IllegalStateException("Could not load " + str + " asynchronously", e2);
                            }
                        }
                        return (Class) futureSubmit.get();
                    }
                }

                public Asynchronous(DescriptionStrategy descriptionStrategy, ExecutorService executorService) {
                    this.delegate = descriptionStrategy;
                    this.executorService = executorService;
                }

                @Override // net.bytebuddy.agent.builder.AgentBuilder.DescriptionStrategy
                public TypeDescription apply(String str, @MaybeNull Class<?> cls, TypePool typePool, CircularityLock circularityLock, @MaybeNull ClassLoader classLoader, @MaybeNull JavaModule javaModule) {
                    TypeDescription typeDescriptionApply = this.delegate.apply(str, cls, typePool, circularityLock, classLoader, javaModule);
                    return typeDescriptionApply instanceof TypeDescription.ForLoadedType ? typeDescriptionApply : new TypeDescription.SuperTypeLoading(typeDescriptionApply, classLoader, new ThreadSwitchingClassLoadingDelegate(this.executorService));
                }

                public boolean equals(@MaybeNull Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj == null || getClass() != obj.getClass()) {
                        return false;
                    }
                    Asynchronous asynchronous = (Asynchronous) obj;
                    return this.delegate.equals(asynchronous.delegate) && this.executorService.equals(asynchronous.executorService);
                }

                public int hashCode() {
                    return (((getClass().hashCode() * 31) + this.delegate.hashCode()) * 31) + this.executorService.hashCode();
                }

                @Override // net.bytebuddy.agent.builder.AgentBuilder.DescriptionStrategy
                public boolean isLoadedFirst() {
                    return this.delegate.isLoadedFirst();
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class UnlockingClassLoadingDelegate implements TypeDescription.SuperTypeLoading.ClassLoadingDelegate {
                private final CircularityLock circularityLock;

                public UnlockingClassLoadingDelegate(CircularityLock circularityLock) {
                    this.circularityLock = circularityLock;
                }

                public boolean equals(@MaybeNull Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return obj != null && getClass() == obj.getClass() && this.circularityLock.equals(((UnlockingClassLoadingDelegate) obj).circularityLock);
                }

                public int hashCode() {
                    return (getClass().hashCode() * 31) + this.circularityLock.hashCode();
                }

                @Override // net.bytebuddy.description.type.TypeDescription.SuperTypeLoading.ClassLoadingDelegate
                public Class<?> load(String str, @MaybeNull ClassLoader classLoader) throws ClassNotFoundException {
                    this.circularityLock.release();
                    try {
                        return Class.forName(str, false, classLoader);
                    } finally {
                        this.circularityLock.acquire();
                    }
                }
            }

            public SuperTypeLoading(DescriptionStrategy descriptionStrategy) {
                this.delegate = descriptionStrategy;
            }

            @Override // net.bytebuddy.agent.builder.AgentBuilder.DescriptionStrategy
            public TypeDescription apply(String str, @MaybeNull Class<?> cls, TypePool typePool, CircularityLock circularityLock, @MaybeNull ClassLoader classLoader, @MaybeNull JavaModule javaModule) {
                TypeDescription typeDescriptionApply = this.delegate.apply(str, cls, typePool, circularityLock, classLoader, javaModule);
                return typeDescriptionApply instanceof TypeDescription.ForLoadedType ? typeDescriptionApply : new TypeDescription.SuperTypeLoading(typeDescriptionApply, classLoader, new UnlockingClassLoadingDelegate(circularityLock));
            }

            public boolean equals(@MaybeNull Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && getClass() == obj.getClass() && this.delegate.equals(((SuperTypeLoading) obj).delegate);
            }

            public int hashCode() {
                return (getClass().hashCode() * 31) + this.delegate.hashCode();
            }

            @Override // net.bytebuddy.agent.builder.AgentBuilder.DescriptionStrategy
            public boolean isLoadedFirst() {
                return this.delegate.isLoadedFirst();
            }
        }

        TypeDescription apply(String str, @MaybeNull Class<?> cls, TypePool typePool, CircularityLock circularityLock, @MaybeNull ClassLoader classLoader, @MaybeNull JavaModule javaModule);

        boolean isLoadedFirst();
    }

    public interface FallbackStrategy {

        @HashCodeAndEqualsPlugin.Enhance
        public static class ByThrowableType implements FallbackStrategy {
            private final Set<? extends Class<? extends Throwable>> types;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public ByThrowableType(Class<? extends Throwable>... clsArr) {
                this(new HashSet(Arrays.asList(clsArr)));
            }

            public static FallbackStrategy ofOptionalTypes() {
                return new ByThrowableType((Class<? extends Throwable>[]) new Class[]{LinkageError.class, TypeNotPresentException.class});
            }

            public boolean equals(@MaybeNull Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && getClass() == obj.getClass() && this.types.equals(((ByThrowableType) obj).types);
            }

            public int hashCode() {
                return (getClass().hashCode() * 31) + this.types.hashCode();
            }

            @Override // net.bytebuddy.agent.builder.AgentBuilder.FallbackStrategy
            public boolean isFallback(Class<?> cls, Throwable th) {
                Iterator<? extends Class<? extends Throwable>> it = this.types.iterator();
                while (it.hasNext()) {
                    if (it.next().isInstance(th)) {
                        return true;
                    }
                }
                return false;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            public ByThrowableType(Set<? extends Class<? extends Throwable>> set) {
                this.types = set;
            }
        }

        public enum Simple implements FallbackStrategy {
            ENABLED(true),
            DISABLED(false);

            private final boolean enabled;

            Simple(boolean z) {
                this.enabled = z;
            }

            @Override // net.bytebuddy.agent.builder.AgentBuilder.FallbackStrategy
            public boolean isFallback(Class<?> cls, Throwable th) {
                return this.enabled;
            }
        }

        boolean isFallback(Class<?> cls, Throwable th);
    }

    public interface Identified {

        public interface Extendable extends AgentBuilder, Identified {
            AgentBuilder asTerminalTransformation();
        }

        public interface Narrowable extends Matchable<Narrowable>, Identified {
        }

        Extendable transform(Transformer transformer);
    }

    public interface Ignored extends Matchable<Ignored>, AgentBuilder {
    }

    public interface InitializationStrategy {

        public interface Dispatcher {
            DynamicType.Builder<?> apply(DynamicType.Builder<?> builder);

            void register(DynamicType dynamicType, @MaybeNull ClassLoader classLoader, @MaybeNull ProtectionDomain protectionDomain, InjectionStrategy injectionStrategy);
        }

        public enum Minimal implements InitializationStrategy, Dispatcher {
            INSTANCE;

            @Override // net.bytebuddy.agent.builder.AgentBuilder.InitializationStrategy.Dispatcher
            public DynamicType.Builder<?> apply(DynamicType.Builder<?> builder) {
                return builder;
            }

            @Override // net.bytebuddy.agent.builder.AgentBuilder.InitializationStrategy
            public Dispatcher dispatcher() {
                return this;
            }

            @Override // net.bytebuddy.agent.builder.AgentBuilder.InitializationStrategy.Dispatcher
            public void register(DynamicType dynamicType, @MaybeNull ClassLoader classLoader, @MaybeNull ProtectionDomain protectionDomain, InjectionStrategy injectionStrategy) {
                Map<TypeDescription, byte[]> auxiliaryTypes = dynamicType.getAuxiliaryTypes();
                Map<? extends TypeDescription, byte[]> linkedHashMap = new LinkedHashMap<>(auxiliaryTypes);
                for (TypeDescription typeDescription : auxiliaryTypes.keySet()) {
                    if (!typeDescription.getDeclaredAnnotations().isAnnotationPresent(AuxiliaryType.SignatureRelevant.class)) {
                        linkedHashMap.remove(typeDescription);
                    }
                }
                if (linkedHashMap.isEmpty()) {
                    return;
                }
                ClassInjector classInjectorResolve = injectionStrategy.resolve(classLoader, protectionDomain);
                Map<TypeDescription, LoadedTypeInitializer> loadedTypeInitializers = dynamicType.getLoadedTypeInitializers();
                for (Map.Entry<TypeDescription, Class<?>> entry : classInjectorResolve.inject(linkedHashMap).entrySet()) {
                    loadedTypeInitializers.get(entry.getKey()).onLoad(entry.getValue());
                }
            }
        }

        public enum NoOp implements InitializationStrategy, Dispatcher {
            INSTANCE;

            @Override // net.bytebuddy.agent.builder.AgentBuilder.InitializationStrategy.Dispatcher
            public DynamicType.Builder<?> apply(DynamicType.Builder<?> builder) {
                return builder;
            }

            @Override // net.bytebuddy.agent.builder.AgentBuilder.InitializationStrategy
            public Dispatcher dispatcher() {
                return this;
            }

            @Override // net.bytebuddy.agent.builder.AgentBuilder.InitializationStrategy.Dispatcher
            public void register(DynamicType dynamicType, @MaybeNull ClassLoader classLoader, @MaybeNull ProtectionDomain protectionDomain, InjectionStrategy injectionStrategy) {
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static abstract class SelfInjection implements InitializationStrategy {
            protected final NexusAccessor nexusAccessor;

            @HashCodeAndEqualsPlugin.Enhance
            public static abstract class Dispatcher implements Dispatcher {
                protected final int identification;
                protected final NexusAccessor nexusAccessor;

                @HashCodeAndEqualsPlugin.Enhance
                public static class InjectingInitializer implements LoadedTypeInitializer {
                    private final ClassInjector classInjector;
                    private final TypeDescription instrumentedType;
                    private final Map<TypeDescription, LoadedTypeInitializer> loadedTypeInitializers;
                    private final Map<TypeDescription, byte[]> rawAuxiliaryTypes;

                    public InjectingInitializer(TypeDescription typeDescription, Map<TypeDescription, byte[]> map, Map<TypeDescription, LoadedTypeInitializer> map2, ClassInjector classInjector) {
                        this.instrumentedType = typeDescription;
                        this.rawAuxiliaryTypes = map;
                        this.loadedTypeInitializers = map2;
                        this.classInjector = classInjector;
                    }

                    public boolean equals(@MaybeNull Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (obj == null || getClass() != obj.getClass()) {
                            return false;
                        }
                        InjectingInitializer injectingInitializer = (InjectingInitializer) obj;
                        return this.instrumentedType.equals(injectingInitializer.instrumentedType) && this.rawAuxiliaryTypes.equals(injectingInitializer.rawAuxiliaryTypes) && this.loadedTypeInitializers.equals(injectingInitializer.loadedTypeInitializers) && this.classInjector.equals(injectingInitializer.classInjector);
                    }

                    public int hashCode() {
                        return (((((((getClass().hashCode() * 31) + this.instrumentedType.hashCode()) * 31) + this.rawAuxiliaryTypes.hashCode()) * 31) + this.loadedTypeInitializers.hashCode()) * 31) + this.classInjector.hashCode();
                    }

                    @Override // net.bytebuddy.implementation.LoadedTypeInitializer
                    public boolean isAlive() {
                        return true;
                    }

                    @Override // net.bytebuddy.implementation.LoadedTypeInitializer
                    public void onLoad(Class<?> cls) {
                        for (Map.Entry<TypeDescription, Class<?>> entry : this.classInjector.inject(this.rawAuxiliaryTypes).entrySet()) {
                            this.loadedTypeInitializers.get(entry.getKey()).onLoad(entry.getValue());
                        }
                        this.loadedTypeInitializers.get(this.instrumentedType).onLoad(cls);
                    }
                }

                public Dispatcher(NexusAccessor nexusAccessor, int i) {
                    this.nexusAccessor = nexusAccessor;
                    this.identification = i;
                }

                @Override // net.bytebuddy.agent.builder.AgentBuilder.InitializationStrategy.Dispatcher
                public DynamicType.Builder<?> apply(DynamicType.Builder<?> builder) {
                    return builder.initializer(new NexusAccessor.InitializationAppender(this.identification));
                }

                public boolean equals(@MaybeNull Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj == null || getClass() != obj.getClass()) {
                        return false;
                    }
                    Dispatcher dispatcher = (Dispatcher) obj;
                    return this.identification == dispatcher.identification && this.nexusAccessor.equals(dispatcher.nexusAccessor);
                }

                public int hashCode() {
                    return (((getClass().hashCode() * 31) + this.nexusAccessor.hashCode()) * 31) + this.identification;
                }
            }

            public static class Eager extends SelfInjection {

                public static class Dispatcher extends Dispatcher {
                    public Dispatcher(NexusAccessor nexusAccessor, int i) {
                        super(nexusAccessor, i);
                    }

                    @Override // net.bytebuddy.agent.builder.AgentBuilder.InitializationStrategy.Dispatcher
                    public void register(DynamicType dynamicType, @MaybeNull ClassLoader classLoader, @MaybeNull ProtectionDomain protectionDomain, InjectionStrategy injectionStrategy) {
                        Map<TypeDescription, byte[]> auxiliaryTypes = dynamicType.getAuxiliaryTypes();
                        Map<TypeDescription, LoadedTypeInitializer> loadedTypeInitializers = dynamicType.getLoadedTypeInitializers();
                        if (!auxiliaryTypes.isEmpty()) {
                            for (Map.Entry<TypeDescription, Class<?>> entry : injectionStrategy.resolve(classLoader, protectionDomain).inject(auxiliaryTypes).entrySet()) {
                                loadedTypeInitializers.get(entry.getKey()).onLoad(entry.getValue());
                            }
                        }
                        this.nexusAccessor.register(dynamicType.getTypeDescription().getName(), classLoader, this.identification, loadedTypeInitializers.get(dynamicType.getTypeDescription()));
                    }
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                public Eager() {
                    this(new NexusAccessor());
                }

                @Override // net.bytebuddy.agent.builder.AgentBuilder.InitializationStrategy.SelfInjection
                public Dispatcher dispatcher(int i) {
                    return new Dispatcher(this.nexusAccessor, i);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
                public Eager(NexusAccessor nexusAccessor) {
                    super(nexusAccessor);
                }
            }

            public static class Lazy extends SelfInjection {

                public static class Dispatcher extends Dispatcher {
                    public Dispatcher(NexusAccessor nexusAccessor, int i) {
                        super(nexusAccessor, i);
                    }

                    @Override // net.bytebuddy.agent.builder.AgentBuilder.InitializationStrategy.Dispatcher
                    public void register(DynamicType dynamicType, @MaybeNull ClassLoader classLoader, @MaybeNull ProtectionDomain protectionDomain, InjectionStrategy injectionStrategy) {
                        Map<TypeDescription, byte[]> auxiliaryTypes = dynamicType.getAuxiliaryTypes();
                        this.nexusAccessor.register(dynamicType.getTypeDescription().getName(), classLoader, this.identification, auxiliaryTypes.isEmpty() ? dynamicType.getLoadedTypeInitializers().get(dynamicType.getTypeDescription()) : new Dispatcher.InjectingInitializer(dynamicType.getTypeDescription(), auxiliaryTypes, dynamicType.getLoadedTypeInitializers(), injectionStrategy.resolve(classLoader, protectionDomain)));
                    }
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                public Lazy() {
                    this(new NexusAccessor());
                }

                @Override // net.bytebuddy.agent.builder.AgentBuilder.InitializationStrategy.SelfInjection
                public Dispatcher dispatcher(int i) {
                    return new Dispatcher(this.nexusAccessor, i);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
                public Lazy(NexusAccessor nexusAccessor) {
                    super(nexusAccessor);
                }
            }

            public static class Split extends SelfInjection {

                public static class Dispatcher extends Dispatcher {
                    public Dispatcher(NexusAccessor nexusAccessor, int i) {
                        super(nexusAccessor, i);
                    }

                    @Override // net.bytebuddy.agent.builder.AgentBuilder.InitializationStrategy.Dispatcher
                    public void register(DynamicType dynamicType, @MaybeNull ClassLoader classLoader, @MaybeNull ProtectionDomain protectionDomain, InjectionStrategy injectionStrategy) {
                        LoadedTypeInitializer injectingInitializer;
                        Map<TypeDescription, byte[]> auxiliaryTypes = dynamicType.getAuxiliaryTypes();
                        if (auxiliaryTypes.isEmpty()) {
                            injectingInitializer = dynamicType.getLoadedTypeInitializers().get(dynamicType.getTypeDescription());
                        } else {
                            TypeDescription typeDescription = dynamicType.getTypeDescription();
                            ClassInjector classInjectorResolve = injectionStrategy.resolve(classLoader, protectionDomain);
                            LinkedHashMap linkedHashMap = new LinkedHashMap(auxiliaryTypes);
                            LinkedHashMap linkedHashMap2 = new LinkedHashMap(auxiliaryTypes);
                            for (TypeDescription typeDescription2 : auxiliaryTypes.keySet()) {
                                (typeDescription2.getDeclaredAnnotations().isAnnotationPresent(AuxiliaryType.SignatureRelevant.class) ? linkedHashMap2 : linkedHashMap).remove(typeDescription2);
                            }
                            Map<TypeDescription, LoadedTypeInitializer> loadedTypeInitializers = dynamicType.getLoadedTypeInitializers();
                            if (!linkedHashMap.isEmpty()) {
                                for (Map.Entry<TypeDescription, Class<?>> entry : classInjectorResolve.inject(linkedHashMap).entrySet()) {
                                    loadedTypeInitializers.get(entry.getKey()).onLoad(entry.getValue());
                                }
                            }
                            HashMap map = new HashMap(loadedTypeInitializers);
                            loadedTypeInitializers.keySet().removeAll(linkedHashMap.keySet());
                            injectingInitializer = map.size() > 1 ? new Dispatcher.InjectingInitializer(typeDescription, linkedHashMap2, map, classInjectorResolve) : (LoadedTypeInitializer) map.get(typeDescription);
                        }
                        this.nexusAccessor.register(dynamicType.getTypeDescription().getName(), classLoader, this.identification, injectingInitializer);
                    }
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                public Split() {
                    this(new NexusAccessor());
                }

                @Override // net.bytebuddy.agent.builder.AgentBuilder.InitializationStrategy.SelfInjection
                public Dispatcher dispatcher(int i) {
                    return new Dispatcher(this.nexusAccessor, i);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
                public Split(NexusAccessor nexusAccessor) {
                    super(nexusAccessor);
                }
            }

            public SelfInjection(NexusAccessor nexusAccessor) {
                this.nexusAccessor = nexusAccessor;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // net.bytebuddy.agent.builder.AgentBuilder.InitializationStrategy
            @SuppressFBWarnings(justification = "Avoids thread-contention.", value = {"DMI_RANDOM_USED_ONLY_ONCE"})
            public Dispatcher dispatcher() {
                return dispatcher(new Random().nextInt());
            }

            public abstract Dispatcher dispatcher(int i);

            public boolean equals(@MaybeNull Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && getClass() == obj.getClass() && this.nexusAccessor.equals(((SelfInjection) obj).nexusAccessor);
            }

            public int hashCode() {
                return (getClass().hashCode() * 31) + this.nexusAccessor.hashCode();
            }
        }

        Dispatcher dispatcher();
    }

    public interface InjectionStrategy {

        public enum Disabled implements InjectionStrategy {
            INSTANCE;

            @Override // net.bytebuddy.agent.builder.AgentBuilder.InjectionStrategy
            public ClassInjector resolve(@MaybeNull ClassLoader classLoader, @MaybeNull ProtectionDomain protectionDomain) {
                throw new IllegalStateException("Class injection is disabled");
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class UsingInstrumentation implements InjectionStrategy {
            private final File folder;
            private final Instrumentation instrumentation;

            public UsingInstrumentation(Instrumentation instrumentation, File file) {
                this.instrumentation = instrumentation;
                this.folder = file;
            }

            public boolean equals(@MaybeNull Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                UsingInstrumentation usingInstrumentation = (UsingInstrumentation) obj;
                return this.instrumentation.equals(usingInstrumentation.instrumentation) && this.folder.equals(usingInstrumentation.folder);
            }

            public int hashCode() {
                return (((getClass().hashCode() * 31) + this.instrumentation.hashCode()) * 31) + this.folder.hashCode();
            }

            @Override // net.bytebuddy.agent.builder.AgentBuilder.InjectionStrategy
            public ClassInjector resolve(@MaybeNull ClassLoader classLoader, @MaybeNull ProtectionDomain protectionDomain) {
                return classLoader == null ? ClassInjector.UsingInstrumentation.m5271of(this.folder, ClassInjector.UsingInstrumentation.Target.BOOTSTRAP, this.instrumentation) : UsingReflection.INSTANCE.resolve(classLoader, protectionDomain);
            }
        }

        public enum UsingJna implements InjectionStrategy {
            INSTANCE;

            @Override // net.bytebuddy.agent.builder.AgentBuilder.InjectionStrategy
            public ClassInjector resolve(@MaybeNull ClassLoader classLoader, @MaybeNull ProtectionDomain protectionDomain) {
                if (ClassInjector.UsingJna.isAvailable()) {
                    return new ClassInjector.UsingJna(classLoader, protectionDomain);
                }
                throw new IllegalStateException("JNA-based injection is not available on the current VM");
            }
        }

        public enum UsingReflection implements InjectionStrategy {
            INSTANCE;

            @Override // net.bytebuddy.agent.builder.AgentBuilder.InjectionStrategy
            public ClassInjector resolve(@MaybeNull ClassLoader classLoader, @MaybeNull ProtectionDomain protectionDomain) {
                if (classLoader == null) {
                    throw new IllegalStateException("Cannot inject auxiliary class into bootstrap loader using reflection");
                }
                if (ClassInjector.UsingReflection.isAvailable()) {
                    return new ClassInjector.UsingReflection(classLoader, protectionDomain);
                }
                throw new IllegalStateException("Reflection-based injection is not available on the current VM");
            }
        }

        public enum UsingUnsafe implements InjectionStrategy {
            INSTANCE;

            @HashCodeAndEqualsPlugin.Enhance
            public static class OfFactory implements InjectionStrategy {
                private final ClassInjector.UsingUnsafe.Factory factory;

                public OfFactory(ClassInjector.UsingUnsafe.Factory factory) {
                    this.factory = factory;
                }

                public boolean equals(@MaybeNull Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return obj != null && getClass() == obj.getClass() && this.factory.equals(((OfFactory) obj).factory);
                }

                public int hashCode() {
                    return (getClass().hashCode() * 31) + this.factory.hashCode();
                }

                @Override // net.bytebuddy.agent.builder.AgentBuilder.InjectionStrategy
                public ClassInjector resolve(@MaybeNull ClassLoader classLoader, @MaybeNull ProtectionDomain protectionDomain) {
                    return this.factory.make(classLoader, protectionDomain);
                }
            }

            @Override // net.bytebuddy.agent.builder.AgentBuilder.InjectionStrategy
            public ClassInjector resolve(@MaybeNull ClassLoader classLoader, @MaybeNull ProtectionDomain protectionDomain) {
                if (ClassInjector.UsingUnsafe.isAvailable()) {
                    return new ClassInjector.UsingUnsafe(classLoader, protectionDomain);
                }
                throw new IllegalStateException("Unsafe-based injection is not available on the current VM");
            }
        }

        ClassInjector resolve(@MaybeNull ClassLoader classLoader, @MaybeNull ProtectionDomain protectionDomain);
    }

    public interface InstallationListener {

        @AlwaysNull
        public static final Throwable SUPPRESS_ERROR = null;

        public static abstract class Adapter implements InstallationListener {
            @Override // net.bytebuddy.agent.builder.AgentBuilder.InstallationListener
            public void onAfterWarmUp(Map<Class<?>, byte[]> map, ResettableClassFileTransformer resettableClassFileTransformer, boolean z) {
            }

            @Override // net.bytebuddy.agent.builder.AgentBuilder.InstallationListener
            public void onBeforeInstall(Instrumentation instrumentation, ResettableClassFileTransformer resettableClassFileTransformer) {
            }

            @Override // net.bytebuddy.agent.builder.AgentBuilder.InstallationListener
            public void onBeforeWarmUp(Set<Class<?>> set, ResettableClassFileTransformer resettableClassFileTransformer) {
            }

            @Override // net.bytebuddy.agent.builder.AgentBuilder.InstallationListener
            public Throwable onError(Instrumentation instrumentation, ResettableClassFileTransformer resettableClassFileTransformer, Throwable th) {
                return th;
            }

            @Override // net.bytebuddy.agent.builder.AgentBuilder.InstallationListener
            public void onInstall(Instrumentation instrumentation, ResettableClassFileTransformer resettableClassFileTransformer) {
            }

            @Override // net.bytebuddy.agent.builder.AgentBuilder.InstallationListener
            public void onReset(Instrumentation instrumentation, ResettableClassFileTransformer resettableClassFileTransformer) {
            }

            @Override // net.bytebuddy.agent.builder.AgentBuilder.InstallationListener
            public void onWarmUpError(Class<?> cls, ResettableClassFileTransformer resettableClassFileTransformer, Throwable th) {
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class Compound implements InstallationListener {
            private final List<InstallationListener> installationListeners;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public Compound(InstallationListener... installationListenerArr) {
                this((List<? extends InstallationListener>) Arrays.asList(installationListenerArr));
            }

            public boolean equals(@MaybeNull Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && getClass() == obj.getClass() && this.installationListeners.equals(((Compound) obj).installationListeners);
            }

            public int hashCode() {
                return (getClass().hashCode() * 31) + this.installationListeners.hashCode();
            }

            @Override // net.bytebuddy.agent.builder.AgentBuilder.InstallationListener
            public void onAfterWarmUp(Map<Class<?>, byte[]> map, ResettableClassFileTransformer resettableClassFileTransformer, boolean z) {
                Iterator<InstallationListener> it = this.installationListeners.iterator();
                while (it.hasNext()) {
                    it.next().onAfterWarmUp(map, resettableClassFileTransformer, z);
                }
            }

            @Override // net.bytebuddy.agent.builder.AgentBuilder.InstallationListener
            public void onBeforeInstall(Instrumentation instrumentation, ResettableClassFileTransformer resettableClassFileTransformer) {
                Iterator<InstallationListener> it = this.installationListeners.iterator();
                while (it.hasNext()) {
                    it.next().onBeforeInstall(instrumentation, resettableClassFileTransformer);
                }
            }

            @Override // net.bytebuddy.agent.builder.AgentBuilder.InstallationListener
            public void onBeforeWarmUp(Set<Class<?>> set, ResettableClassFileTransformer resettableClassFileTransformer) {
                Iterator<InstallationListener> it = this.installationListeners.iterator();
                while (it.hasNext()) {
                    it.next().onBeforeWarmUp(set, resettableClassFileTransformer);
                }
            }

            @Override // net.bytebuddy.agent.builder.AgentBuilder.InstallationListener
            @MaybeNull
            public Throwable onError(Instrumentation instrumentation, ResettableClassFileTransformer resettableClassFileTransformer, Throwable th) {
                for (InstallationListener installationListener : this.installationListeners) {
                    Throwable th2 = InstallationListener.SUPPRESS_ERROR;
                    if (th == th2) {
                        return th2;
                    }
                    th = installationListener.onError(instrumentation, resettableClassFileTransformer, th);
                }
                return th;
            }

            @Override // net.bytebuddy.agent.builder.AgentBuilder.InstallationListener
            public void onInstall(Instrumentation instrumentation, ResettableClassFileTransformer resettableClassFileTransformer) {
                Iterator<InstallationListener> it = this.installationListeners.iterator();
                while (it.hasNext()) {
                    it.next().onInstall(instrumentation, resettableClassFileTransformer);
                }
            }

            @Override // net.bytebuddy.agent.builder.AgentBuilder.InstallationListener
            public void onReset(Instrumentation instrumentation, ResettableClassFileTransformer resettableClassFileTransformer) {
                Iterator<InstallationListener> it = this.installationListeners.iterator();
                while (it.hasNext()) {
                    it.next().onReset(instrumentation, resettableClassFileTransformer);
                }
            }

            @Override // net.bytebuddy.agent.builder.AgentBuilder.InstallationListener
            public void onWarmUpError(Class<?> cls, ResettableClassFileTransformer resettableClassFileTransformer, Throwable th) {
                Iterator<InstallationListener> it = this.installationListeners.iterator();
                while (it.hasNext()) {
                    it.next().onWarmUpError(cls, resettableClassFileTransformer, th);
                }
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            public Compound(List<? extends InstallationListener> list) {
                this.installationListeners = new ArrayList();
                for (InstallationListener installationListener : list) {
                    if (installationListener instanceof Compound) {
                        this.installationListeners.addAll(((Compound) installationListener).installationListeners);
                    } else if (!(installationListener instanceof NoOp)) {
                        this.installationListeners.add(installationListener);
                    }
                }
            }
        }

        public enum ErrorSuppressing implements InstallationListener {
            INSTANCE;

            @Override // net.bytebuddy.agent.builder.AgentBuilder.InstallationListener
            public void onAfterWarmUp(Map<Class<?>, byte[]> map, ResettableClassFileTransformer resettableClassFileTransformer, boolean z) {
            }

            @Override // net.bytebuddy.agent.builder.AgentBuilder.InstallationListener
            public void onBeforeInstall(Instrumentation instrumentation, ResettableClassFileTransformer resettableClassFileTransformer) {
            }

            @Override // net.bytebuddy.agent.builder.AgentBuilder.InstallationListener
            public void onBeforeWarmUp(Set<Class<?>> set, ResettableClassFileTransformer resettableClassFileTransformer) {
            }

            @Override // net.bytebuddy.agent.builder.AgentBuilder.InstallationListener
            @MaybeNull
            public Throwable onError(Instrumentation instrumentation, ResettableClassFileTransformer resettableClassFileTransformer, Throwable th) {
                return InstallationListener.SUPPRESS_ERROR;
            }

            @Override // net.bytebuddy.agent.builder.AgentBuilder.InstallationListener
            public void onInstall(Instrumentation instrumentation, ResettableClassFileTransformer resettableClassFileTransformer) {
            }

            @Override // net.bytebuddy.agent.builder.AgentBuilder.InstallationListener
            public void onReset(Instrumentation instrumentation, ResettableClassFileTransformer resettableClassFileTransformer) {
            }

            @Override // net.bytebuddy.agent.builder.AgentBuilder.InstallationListener
            public void onWarmUpError(Class<?> cls, ResettableClassFileTransformer resettableClassFileTransformer, Throwable th) {
            }
        }

        public enum NoOp implements InstallationListener {
            INSTANCE;

            @Override // net.bytebuddy.agent.builder.AgentBuilder.InstallationListener
            public void onAfterWarmUp(Map<Class<?>, byte[]> map, ResettableClassFileTransformer resettableClassFileTransformer, boolean z) {
            }

            @Override // net.bytebuddy.agent.builder.AgentBuilder.InstallationListener
            public void onBeforeInstall(Instrumentation instrumentation, ResettableClassFileTransformer resettableClassFileTransformer) {
            }

            @Override // net.bytebuddy.agent.builder.AgentBuilder.InstallationListener
            public void onBeforeWarmUp(Set<Class<?>> set, ResettableClassFileTransformer resettableClassFileTransformer) {
            }

            @Override // net.bytebuddy.agent.builder.AgentBuilder.InstallationListener
            public Throwable onError(Instrumentation instrumentation, ResettableClassFileTransformer resettableClassFileTransformer, Throwable th) {
                return th;
            }

            @Override // net.bytebuddy.agent.builder.AgentBuilder.InstallationListener
            public void onInstall(Instrumentation instrumentation, ResettableClassFileTransformer resettableClassFileTransformer) {
            }

            @Override // net.bytebuddy.agent.builder.AgentBuilder.InstallationListener
            public void onReset(Instrumentation instrumentation, ResettableClassFileTransformer resettableClassFileTransformer) {
            }

            @Override // net.bytebuddy.agent.builder.AgentBuilder.InstallationListener
            public void onWarmUpError(Class<?> cls, ResettableClassFileTransformer resettableClassFileTransformer, Throwable th) {
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class StreamWriting implements InstallationListener {
            protected static final String PREFIX = "[Byte Buddy]";
            private final PrintStream printStream;

            public StreamWriting(PrintStream printStream) {
                this.printStream = printStream;
            }

            public static InstallationListener toSystemError() {
                return new StreamWriting(System.err);
            }

            public static InstallationListener toSystemOut() {
                return new StreamWriting(System.out);
            }

            public boolean equals(@MaybeNull Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && getClass() == obj.getClass() && this.printStream.equals(((StreamWriting) obj).printStream);
            }

            public int hashCode() {
                return (getClass().hashCode() * 31) + this.printStream.hashCode();
            }

            @Override // net.bytebuddy.agent.builder.AgentBuilder.InstallationListener
            public void onAfterWarmUp(Map<Class<?>, byte[]> map, ResettableClassFileTransformer resettableClassFileTransformer, boolean z) {
                this.printStream.printf("[Byte Buddy] AFTER_WARMUP %s %s on %s%n", z ? "transformed" : "not transformed", resettableClassFileTransformer, map.keySet());
            }

            @Override // net.bytebuddy.agent.builder.AgentBuilder.InstallationListener
            public void onBeforeInstall(Instrumentation instrumentation, ResettableClassFileTransformer resettableClassFileTransformer) {
                this.printStream.printf("[Byte Buddy] BEFORE_INSTALL %s on %s%n", resettableClassFileTransformer, instrumentation);
            }

            @Override // net.bytebuddy.agent.builder.AgentBuilder.InstallationListener
            public void onBeforeWarmUp(Set<Class<?>> set, ResettableClassFileTransformer resettableClassFileTransformer) {
                this.printStream.printf("[Byte Buddy] BEFORE_WARMUP %s on %s%n", resettableClassFileTransformer, set);
            }

            @Override // net.bytebuddy.agent.builder.AgentBuilder.InstallationListener
            public Throwable onError(Instrumentation instrumentation, ResettableClassFileTransformer resettableClassFileTransformer, Throwable th) {
                synchronized (this.printStream) {
                    this.printStream.printf("[Byte Buddy] ERROR %s on %s%n", resettableClassFileTransformer, instrumentation);
                    th.printStackTrace(this.printStream);
                }
                return th;
            }

            @Override // net.bytebuddy.agent.builder.AgentBuilder.InstallationListener
            public void onInstall(Instrumentation instrumentation, ResettableClassFileTransformer resettableClassFileTransformer) {
                this.printStream.printf("[Byte Buddy] INSTALL %s on %s%n", resettableClassFileTransformer, instrumentation);
            }

            @Override // net.bytebuddy.agent.builder.AgentBuilder.InstallationListener
            public void onReset(Instrumentation instrumentation, ResettableClassFileTransformer resettableClassFileTransformer) {
                this.printStream.printf("[Byte Buddy] RESET %s on %s%n", resettableClassFileTransformer, instrumentation);
            }

            @Override // net.bytebuddy.agent.builder.AgentBuilder.InstallationListener
            public void onWarmUpError(Class<?> cls, ResettableClassFileTransformer resettableClassFileTransformer, Throwable th) {
                synchronized (this.printStream) {
                    this.printStream.printf("[Byte Buddy] ERROR_WARMUP %s on %s%n", resettableClassFileTransformer, cls);
                    th.printStackTrace(this.printStream);
                }
            }
        }

        void onAfterWarmUp(Map<Class<?>, byte[]> map, ResettableClassFileTransformer resettableClassFileTransformer, boolean z);

        void onBeforeInstall(Instrumentation instrumentation, ResettableClassFileTransformer resettableClassFileTransformer);

        void onBeforeWarmUp(Set<Class<?>> set, ResettableClassFileTransformer resettableClassFileTransformer);

        @MaybeNull
        Throwable onError(Instrumentation instrumentation, ResettableClassFileTransformer resettableClassFileTransformer, Throwable th);

        void onInstall(Instrumentation instrumentation, ResettableClassFileTransformer resettableClassFileTransformer);

        void onReset(Instrumentation instrumentation, ResettableClassFileTransformer resettableClassFileTransformer);

        void onWarmUpError(Class<?> cls, ResettableClassFileTransformer resettableClassFileTransformer, Throwable th);
    }

    public enum LambdaInstrumentationStrategy {
        ENABLED { // from class: net.bytebuddy.agent.builder.AgentBuilder.LambdaInstrumentationStrategy.1
            @Override // net.bytebuddy.agent.builder.AgentBuilder.LambdaInstrumentationStrategy
            public void apply(ByteBuddy byteBuddy, Instrumentation instrumentation, ClassFileTransformer classFileTransformer) {
                if (LambdaFactory.register(classFileTransformer, new LambdaInstanceFactory(byteBuddy))) {
                    try {
                        Class<?> cls = Class.forName("java.lang.invoke.LambdaMetafactory");
                        byteBuddy.with(Implementation.Context.Disabled.Factory.INSTANCE).redefine(cls).method(ElementMatchers.isPublic().and(ElementMatchers.named("metafactory"))).intercept(new Implementation.Simple(LambdaMetafactoryFactory.REGULAR)).method(ElementMatchers.isPublic().and(ElementMatchers.named("altMetafactory"))).intercept(new Implementation.Simple(LambdaMetafactoryFactory.ALTERNATIVE)).make().load(cls.getClassLoader(), ClassReloadingStrategy.m5275of(instrumentation));
                    } catch (ClassNotFoundException unused) {
                    }
                }
            }

            @Override // net.bytebuddy.agent.builder.AgentBuilder.LambdaInstrumentationStrategy
            public boolean isInstrumented(@MaybeNull Class<?> cls) {
                return true;
            }
        },
        DISABLED { // from class: net.bytebuddy.agent.builder.AgentBuilder.LambdaInstrumentationStrategy.2
            @Override // net.bytebuddy.agent.builder.AgentBuilder.LambdaInstrumentationStrategy
            public void apply(ByteBuddy byteBuddy, Instrumentation instrumentation, ClassFileTransformer classFileTransformer) {
            }

            @Override // net.bytebuddy.agent.builder.AgentBuilder.LambdaInstrumentationStrategy
            public boolean isInstrumented(@MaybeNull Class<?> cls) {
                return cls == null || !cls.getName().contains("/");
            }
        };

        @HashCodeAndEqualsPlugin.Enhance
        public static class LambdaInstanceFactory {
            private static final String FIELD_PREFIX = "arg$";
            private static final String LAMBDA_FACTORY = "get$Lambda";
            private static final AtomicInteger LAMBDA_NAME_COUNTER = new AtomicInteger();
            private static final String LAMBDA_TYPE_INFIX = "$$Lambda$ByteBuddy$";

            @AlwaysNull
            private static final Class<?> NOT_PREVIOUSLY_DEFINED = null;
            private final ByteBuddy byteBuddy;

            @HashCodeAndEqualsPlugin.Enhance
            public static class BridgeMethodImplementation implements Implementation {
                private final JavaConstant.MethodType lambdaMethod;
                private final String lambdaMethodName;

                @HashCodeAndEqualsPlugin.Enhance
                public static class Appender implements ByteCodeAppender {
                    private final Implementation.SpecialMethodInvocation bridgeTargetInvocation;

                    public Appender(Implementation.SpecialMethodInvocation specialMethodInvocation) {
                        this.bridgeTargetInvocation = specialMethodInvocation;
                    }

                    @Override // net.bytebuddy.implementation.bytecode.ByteCodeAppender
                    public ByteCodeAppender.Size apply(MethodVisitor methodVisitor, Implementation.Context context, MethodDescription methodDescription) {
                        StackManipulation stackManipulationPrependThisReference = MethodVariableAccess.allArgumentsOf(methodDescription).asBridgeOf(this.bridgeTargetInvocation.getMethodDescription()).prependThisReference();
                        Implementation.SpecialMethodInvocation specialMethodInvocation = this.bridgeTargetInvocation;
                        return new ByteCodeAppender.Compound(new ByteCodeAppender.Simple(stackManipulationPrependThisReference, specialMethodInvocation, specialMethodInvocation.getMethodDescription().getReturnType().asErasure().isAssignableTo(methodDescription.getReturnType().asErasure()) ? StackManipulation.Trivial.INSTANCE : TypeCasting.m5378to(methodDescription.getReturnType()), MethodReturn.m5386of(methodDescription.getReturnType()))).apply(methodVisitor, context, methodDescription);
                    }

                    public boolean equals(@MaybeNull Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return obj != null && getClass() == obj.getClass() && this.bridgeTargetInvocation.equals(((Appender) obj).bridgeTargetInvocation);
                    }

                    public int hashCode() {
                        return (getClass().hashCode() * 31) + this.bridgeTargetInvocation.hashCode();
                    }
                }

                public BridgeMethodImplementation(String str, JavaConstant.MethodType methodType) {
                    this.lambdaMethodName = str;
                    this.lambdaMethod = methodType;
                }

                @Override // net.bytebuddy.implementation.Implementation
                public ByteCodeAppender appender(Implementation.Target target) {
                    return new Appender(target.invokeSuper(new MethodDescription.SignatureToken(this.lambdaMethodName, this.lambdaMethod.getReturnType(), this.lambdaMethod.getParameterTypes())));
                }

                public boolean equals(@MaybeNull Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj == null || getClass() != obj.getClass()) {
                        return false;
                    }
                    BridgeMethodImplementation bridgeMethodImplementation = (BridgeMethodImplementation) obj;
                    return this.lambdaMethodName.equals(bridgeMethodImplementation.lambdaMethodName) && this.lambdaMethod.equals(bridgeMethodImplementation.lambdaMethod);
                }

                public int hashCode() {
                    return (((getClass().hashCode() * 31) + this.lambdaMethodName.hashCode()) * 31) + this.lambdaMethod.hashCode();
                }

                @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
                public InstrumentedType prepare(InstrumentedType instrumentedType) {
                    return instrumentedType;
                }
            }

            public enum ConstructorImplementation implements Implementation {
                INSTANCE;

                private final transient MethodDescription.InDefinedShape objectConstructor = (MethodDescription.InDefinedShape) TypeDescription.ForLoadedType.m5238of(Object.class).getDeclaredMethods().filter(ElementMatchers.isConstructor()).getOnly();

                @HashCodeAndEqualsPlugin.Enhance
                public static class Appender implements ByteCodeAppender {
                    private final List<FieldDescription.InDefinedShape> declaredFields;

                    public Appender(List<FieldDescription.InDefinedShape> list) {
                        this.declaredFields = list;
                    }

                    @Override // net.bytebuddy.implementation.bytecode.ByteCodeAppender
                    public ByteCodeAppender.Size apply(MethodVisitor methodVisitor, Implementation.Context context, MethodDescription methodDescription) {
                        ArrayList arrayList = new ArrayList(this.declaredFields.size() * 3);
                        Iterator<?> it = methodDescription.getParameters().iterator();
                        while (it.hasNext()) {
                            ParameterDescription parameterDescription = (ParameterDescription) it.next();
                            arrayList.add(MethodVariableAccess.loadThis());
                            arrayList.add(MethodVariableAccess.load(parameterDescription));
                            arrayList.add(FieldAccess.forField(this.declaredFields.get(parameterDescription.getIndex())).write());
                        }
                        return new ByteCodeAppender.Size(new StackManipulation.Compound(MethodVariableAccess.loadThis(), MethodInvocation.invoke(ConstructorImplementation.INSTANCE.objectConstructor), new StackManipulation.Compound(arrayList), MethodReturn.VOID).apply(methodVisitor, context).getMaximalSize(), methodDescription.getStackSize());
                    }

                    public boolean equals(@MaybeNull Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return obj != null && getClass() == obj.getClass() && this.declaredFields.equals(((Appender) obj).declaredFields);
                    }

                    public int hashCode() {
                        return (getClass().hashCode() * 31) + this.declaredFields.hashCode();
                    }
                }

                ConstructorImplementation() {
                }

                @Override // net.bytebuddy.implementation.Implementation
                public ByteCodeAppender appender(Implementation.Target target) {
                    return new Appender(target.getInstrumentedType().getDeclaredFields());
                }

                @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
                public InstrumentedType prepare(InstrumentedType instrumentedType) {
                    return instrumentedType;
                }
            }

            public enum FactoryImplementation implements Implementation {
                INSTANCE;

                @HashCodeAndEqualsPlugin.Enhance
                public static class Appender implements ByteCodeAppender {
                    private final TypeDescription instrumentedType;

                    public Appender(TypeDescription typeDescription) {
                        this.instrumentedType = typeDescription;
                    }

                    @Override // net.bytebuddy.implementation.bytecode.ByteCodeAppender
                    public ByteCodeAppender.Size apply(MethodVisitor methodVisitor, Implementation.Context context, MethodDescription methodDescription) {
                        return new ByteCodeAppender.Size(new StackManipulation.Compound(TypeCreation.m5375of(this.instrumentedType), Duplication.SINGLE, MethodVariableAccess.allArgumentsOf(methodDescription), MethodInvocation.invoke((MethodDescription.InDefinedShape) this.instrumentedType.getDeclaredMethods().filter(ElementMatchers.isConstructor()).getOnly()), MethodReturn.REFERENCE).apply(methodVisitor, context).getMaximalSize(), methodDescription.getStackSize());
                    }

                    public boolean equals(@MaybeNull Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return obj != null && getClass() == obj.getClass() && this.instrumentedType.equals(((Appender) obj).instrumentedType);
                    }

                    public int hashCode() {
                        return (getClass().hashCode() * 31) + this.instrumentedType.hashCode();
                    }
                }

                @Override // net.bytebuddy.implementation.Implementation
                public ByteCodeAppender appender(Implementation.Target target) {
                    return new Appender(target.getInstrumentedType());
                }

                @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
                public InstrumentedType prepare(InstrumentedType instrumentedType) {
                    return instrumentedType;
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class LambdaMethodImplementation implements Implementation {
                private final JavaConstant.MethodType specializedLambdaMethod;
                private final JavaConstant.MethodHandle targetMethod;
                private final TypeDescription targetType;

                @HashCodeAndEqualsPlugin.Enhance
                public static class Appender implements ByteCodeAppender {
                    private static final Dispatcher LOOKUP_DATA_DISPATCHER = dispatcher();
                    private final List<FieldDescription.InDefinedShape> declaredFields;
                    private final Dispatcher dispatcher;
                    private final JavaConstant.MethodType specializedLambdaMethod;
                    private final MethodDescription targetMethod;

                    public interface Dispatcher {

                        public enum UsingDirectInvocation implements Dispatcher {
                            INSTANCE;

                            @Override // net.bytebuddy.agent.builder.AgentBuilder.LambdaInstrumentationStrategy.LambdaInstanceFactory.LambdaMethodImplementation.Appender.Dispatcher
                            public StackManipulation initialize() {
                                return StackManipulation.Trivial.INSTANCE;
                            }

                            @Override // net.bytebuddy.agent.builder.AgentBuilder.LambdaInstrumentationStrategy.LambdaInstanceFactory.LambdaMethodImplementation.Appender.Dispatcher
                            public StackManipulation invoke(MethodDescription methodDescription) {
                                return MethodInvocation.invoke(methodDescription);
                            }
                        }

                        @HashCodeAndEqualsPlugin.Enhance
                        public static class UsingMethodHandle extends StackManipulation.AbstractBase implements Dispatcher {
                            private final MethodDescription.InDefinedShape invokeExact;

                            public UsingMethodHandle(MethodDescription.InDefinedShape inDefinedShape) {
                                this.invokeExact = inDefinedShape;
                            }

                            @Override // net.bytebuddy.implementation.bytecode.StackManipulation
                            public StackManipulation.Size apply(MethodVisitor methodVisitor, Implementation.Context context) {
                                methodVisitor.visitLdcInsn(new ConstantDynamic(JavaConstant.Dynamic.DEFAULT_NAME, "Ljava/lang/invoke/MethodHandle;", new Handle(6, "java/lang/invoke/MethodHandles", "classData", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;", false), new Object[0]));
                                return new StackManipulation.Size(1, 1);
                            }

                            public boolean equals(@MaybeNull Object obj) {
                                if (this == obj) {
                                    return true;
                                }
                                return obj != null && getClass() == obj.getClass() && this.invokeExact.equals(((UsingMethodHandle) obj).invokeExact);
                            }

                            public int hashCode() {
                                return (getClass().hashCode() * 31) + this.invokeExact.hashCode();
                            }

                            @Override // net.bytebuddy.agent.builder.AgentBuilder.LambdaInstrumentationStrategy.LambdaInstanceFactory.LambdaMethodImplementation.Appender.Dispatcher
                            public StackManipulation initialize() {
                                return this;
                            }

                            @Override // net.bytebuddy.agent.builder.AgentBuilder.LambdaInstrumentationStrategy.LambdaInstanceFactory.LambdaMethodImplementation.Appender.Dispatcher
                            public StackManipulation invoke(MethodDescription methodDescription) {
                                return MethodInvocation.invoke(this.invokeExact);
                            }
                        }

                        StackManipulation initialize();

                        StackManipulation invoke(MethodDescription methodDescription);
                    }

                    public Appender(MethodDescription methodDescription, JavaConstant.MethodType methodType, List<FieldDescription.InDefinedShape> list, Dispatcher dispatcher) {
                        this.targetMethod = methodDescription;
                        this.specializedLambdaMethod = methodType;
                        this.declaredFields = list;
                        this.dispatcher = dispatcher;
                    }

                    @SuppressFBWarnings(justification = "Exception should not be rethrown but trigger a fallback.", value = {"REC_CATCH_EXCEPTION"})
                    private static Dispatcher dispatcher() {
                        try {
                            Class<?> cls = Class.forName("java.lang.invoke.MethodHandles$Lookup", false, null);
                            cls.getMethod("classData", cls, String.class, Class.class);
                            return new Dispatcher.UsingMethodHandle(new MethodDescription.ForLoadedMethod(Class.forName("java.lang.invoke.MethodHandle", false, null).getMethod("invokeExact", Object[].class)));
                        } catch (Exception unused) {
                            return Dispatcher.UsingDirectInvocation.INSTANCE;
                        }
                    }

                    /* JADX INFO: renamed from: of */
                    public static ByteCodeAppender m5131of(MethodDescription methodDescription, JavaConstant.MethodType methodType, List<FieldDescription.InDefinedShape> list, JavaConstant.MethodHandle.HandleType handleType, TypeDescription typeDescription) {
                        return new Appender(methodDescription, methodType, list, (handleType == JavaConstant.MethodHandle.HandleType.INVOKE_SPECIAL || !methodDescription.getDeclaringType().asErasure().isVisibleTo(typeDescription)) ? LOOKUP_DATA_DISPATCHER : Dispatcher.UsingDirectInvocation.INSTANCE);
                    }

                    @Override // net.bytebuddy.implementation.bytecode.ByteCodeAppender
                    public ByteCodeAppender.Size apply(MethodVisitor methodVisitor, Implementation.Context context, MethodDescription methodDescription) {
                        ArrayList arrayList = new ArrayList((this.declaredFields.size() * 2) + 1);
                        for (FieldDescription.InDefinedShape inDefinedShape : this.declaredFields) {
                            arrayList.add(MethodVariableAccess.loadThis());
                            arrayList.add(FieldAccess.forField(inDefinedShape).read());
                        }
                        ArrayList arrayList2 = new ArrayList(methodDescription.getParameters().size() * 2);
                        Iterator<?> it = methodDescription.getParameters().iterator();
                        while (it.hasNext()) {
                            ParameterDescription parameterDescription = (ParameterDescription) it.next();
                            arrayList2.add(MethodVariableAccess.load(parameterDescription));
                            arrayList2.add(Assigner.DEFAULT.assign(parameterDescription.getType(), this.specializedLambdaMethod.getParameterTypes().get(parameterDescription.getIndex()).asGenericType(), Assigner.Typing.DYNAMIC));
                        }
                        return new ByteCodeAppender.Size(new StackManipulation.Compound(this.targetMethod.isConstructor() ? new StackManipulation.Compound(TypeCreation.m5375of(this.targetMethod.getDeclaringType().asErasure()), Duplication.SINGLE) : StackManipulation.Trivial.INSTANCE, this.dispatcher.initialize(), new StackManipulation.Compound(arrayList), new StackManipulation.Compound(arrayList2), this.dispatcher.invoke(this.targetMethod), Assigner.DEFAULT.assign(this.targetMethod.isConstructor() ? this.targetMethod.getDeclaringType().asGenericType() : this.targetMethod.getReturnType(), this.specializedLambdaMethod.getReturnType().asGenericType(), Assigner.Typing.DYNAMIC), MethodReturn.m5386of(this.specializedLambdaMethod.getReturnType())).apply(methodVisitor, context).getMaximalSize(), methodDescription.getStackSize());
                    }

                    public boolean equals(@MaybeNull Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (obj == null || getClass() != obj.getClass()) {
                            return false;
                        }
                        Appender appender = (Appender) obj;
                        return this.targetMethod.equals(appender.targetMethod) && this.specializedLambdaMethod.equals(appender.specializedLambdaMethod) && this.declaredFields.equals(appender.declaredFields) && this.dispatcher.equals(appender.dispatcher);
                    }

                    public int hashCode() {
                        return (((((((getClass().hashCode() * 31) + this.targetMethod.hashCode()) * 31) + this.specializedLambdaMethod.hashCode()) * 31) + this.declaredFields.hashCode()) * 31) + this.dispatcher.hashCode();
                    }
                }

                public LambdaMethodImplementation(TypeDescription typeDescription, JavaConstant.MethodHandle methodHandle, JavaConstant.MethodType methodType) {
                    this.targetType = typeDescription;
                    this.targetMethod = methodHandle;
                    this.specializedLambdaMethod = methodType;
                }

                @Override // net.bytebuddy.implementation.Implementation
                public ByteCodeAppender appender(Implementation.Target target) {
                    return Appender.m5131of((MethodDescription) this.targetMethod.getOwnerType().getDeclaredMethods().filter(ElementMatchers.hasMethodName(this.targetMethod.getName()).and(ElementMatchers.returns(this.targetMethod.getReturnType())).and(ElementMatchers.takesArguments(this.targetMethod.getParameterTypes()))).getOnly(), this.specializedLambdaMethod, target.getInstrumentedType().getDeclaredFields(), this.targetMethod.getHandleType(), this.targetType);
                }

                public boolean equals(@MaybeNull Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj == null || getClass() != obj.getClass()) {
                        return false;
                    }
                    LambdaMethodImplementation lambdaMethodImplementation = (LambdaMethodImplementation) obj;
                    return this.targetType.equals(lambdaMethodImplementation.targetType) && this.targetMethod.equals(lambdaMethodImplementation.targetMethod) && this.specializedLambdaMethod.equals(lambdaMethodImplementation.specializedLambdaMethod);
                }

                public int hashCode() {
                    return (((((getClass().hashCode() * 31) + this.targetType.hashCode()) * 31) + this.targetMethod.hashCode()) * 31) + this.specializedLambdaMethod.hashCode();
                }

                @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
                public InstrumentedType prepare(InstrumentedType instrumentedType) {
                    return instrumentedType;
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class SerializationImplementation implements Implementation {
                private final JavaConstant.MethodType lambdaMethod;
                private final String lambdaMethodName;
                private final TypeDescription lambdaType;
                private final JavaConstant.MethodType specializedMethod;
                private final JavaConstant.MethodHandle targetMethod;
                private final TypeDescription targetType;

                public SerializationImplementation(TypeDescription typeDescription, TypeDescription typeDescription2, String str, JavaConstant.MethodType methodType, JavaConstant.MethodHandle methodHandle, JavaConstant.MethodType methodType2) {
                    this.targetType = typeDescription;
                    this.lambdaType = typeDescription2;
                    this.lambdaMethodName = str;
                    this.lambdaMethod = methodType;
                    this.targetMethod = methodHandle;
                    this.specializedMethod = methodType2;
                }

                @Override // net.bytebuddy.implementation.Implementation
                public ByteCodeAppender appender(Implementation.Target target) {
                    try {
                        TypeDescription typeDescriptionM5238of = TypeDescription.ForLoadedType.m5238of(Class.forName("java.lang.invoke.SerializedLambda"));
                        ArrayList arrayList = new ArrayList(target.getInstrumentedType().getDeclaredFields().size());
                        for (FieldDescription.InDefinedShape inDefinedShape : target.getInstrumentedType().getDeclaredFields()) {
                            arrayList.add(new StackManipulation.Compound(MethodVariableAccess.loadThis(), FieldAccess.forField(inDefinedShape).read(), Assigner.DEFAULT.assign(inDefinedShape.getType(), TypeDescription.Generic.OfNonGenericType.ForLoadedType.m5245of(Object.class), Assigner.Typing.STATIC)));
                        }
                        return new ByteCodeAppender.Simple(new StackManipulation.Compound(TypeCreation.m5375of(typeDescriptionM5238of), Duplication.SINGLE, ClassConstant.m5380of(this.targetType), new TextConstant(this.lambdaType.getInternalName()), new TextConstant(this.lambdaMethodName), new TextConstant(this.lambdaMethod.getDescriptor()), IntegerConstant.forValue(this.targetMethod.getHandleType().getIdentifier()), new TextConstant(this.targetMethod.getOwnerType().getInternalName()), new TextConstant(this.targetMethod.getName()), new TextConstant(this.targetMethod.getDescriptor()), new TextConstant(this.specializedMethod.getDescriptor()), ArrayFactory.forType(TypeDescription.Generic.OfNonGenericType.ForLoadedType.m5245of(Object.class)).withValues(arrayList), MethodInvocation.invoke((MethodDescription.InDefinedShape) typeDescriptionM5238of.getDeclaredMethods().filter(ElementMatchers.isConstructor()).getOnly()), MethodReturn.REFERENCE));
                    } catch (ClassNotFoundException e) {
                        throw new IllegalStateException("Cannot find class for lambda serialization", e);
                    }
                }

                public boolean equals(@MaybeNull Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj == null || getClass() != obj.getClass()) {
                        return false;
                    }
                    SerializationImplementation serializationImplementation = (SerializationImplementation) obj;
                    return this.lambdaMethodName.equals(serializationImplementation.lambdaMethodName) && this.targetType.equals(serializationImplementation.targetType) && this.lambdaType.equals(serializationImplementation.lambdaType) && this.lambdaMethod.equals(serializationImplementation.lambdaMethod) && this.targetMethod.equals(serializationImplementation.targetMethod) && this.specializedMethod.equals(serializationImplementation.specializedMethod);
                }

                public int hashCode() {
                    return (((((((((((getClass().hashCode() * 31) + this.targetType.hashCode()) * 31) + this.lambdaType.hashCode()) * 31) + this.lambdaMethodName.hashCode()) * 31) + this.lambdaMethod.hashCode()) * 31) + this.targetMethod.hashCode()) * 31) + this.specializedMethod.hashCode();
                }

                @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
                public InstrumentedType prepare(InstrumentedType instrumentedType) {
                    return instrumentedType;
                }
            }

            public LambdaInstanceFactory(ByteBuddy byteBuddy) {
                this.byteBuddy = byteBuddy;
            }

            public boolean equals(@MaybeNull Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && getClass() == obj.getClass() && this.byteBuddy.equals(((LambdaInstanceFactory) obj).byteBuddy);
            }

            public int hashCode() {
                return (getClass().hashCode() * 31) + this.byteBuddy.hashCode();
            }

            public byte[] make(Object obj, String str, Object obj2, Object obj3, Object obj4, Object obj5, boolean z, List<Class<?>> list, List<?> list2, Collection<? extends ClassFileTransformer> collection) {
                char c;
                JavaConstant.MethodType methodTypeOfLoaded = JavaConstant.MethodType.ofLoaded(obj2);
                JavaConstant.MethodType methodTypeOfLoaded2 = JavaConstant.MethodType.ofLoaded(obj3);
                JavaConstant.MethodHandle methodHandleOfLoaded = JavaConstant.MethodHandle.ofLoaded(obj4, obj);
                JavaConstant.MethodType methodTypeOfLoaded3 = JavaConstant.MethodType.ofLoaded(obj5);
                Class<?> clsLookupType = JavaConstant.MethodHandle.lookupType(obj);
                String str2 = clsLookupType.getName() + LAMBDA_TYPE_INFIX + LAMBDA_NAME_COUNTER.incrementAndGet();
                DynamicType.Builder<?> builderSubclass = this.byteBuddy.subclass(methodTypeOfLoaded.getReturnType(), ConstructorStrategy.Default.NO_CONSTRUCTORS);
                Visibility visibility = Visibility.PUBLIC;
                boolean z2 = false;
                DynamicType.Builder builderIntercept = builderSubclass.modifiers(TypeManifestation.FINAL, visibility).implement((List<? extends java.lang.reflect.Type>) list).name(str2).defineConstructor(visibility).withParameters((Collection<? extends TypeDefinition>) methodTypeOfLoaded.getParameterTypes()).intercept(ConstructorImplementation.INSTANCE).method(ElementMatchers.named(str).and(ElementMatchers.takesArguments(methodTypeOfLoaded2.getParameterTypes())).and(ElementMatchers.returns(methodTypeOfLoaded2.getReturnType()))).intercept(new LambdaMethodImplementation(TypeDescription.ForLoadedType.m5238of(clsLookupType), methodHandleOfLoaded, methodTypeOfLoaded3));
                int i = 0;
                for (TypeDescription typeDescription : methodTypeOfLoaded.getParameterTypes()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(FIELD_PREFIX);
                    i++;
                    sb.append(i);
                    builderIntercept = builderIntercept.defineField(sb.toString(), typeDescription, Visibility.PRIVATE, FieldManifestation.FINAL);
                    z2 = false;
                }
                boolean z3 = z2;
                if (!methodTypeOfLoaded.getParameterTypes().isEmpty()) {
                    TypeDescription returnType = methodTypeOfLoaded.getReturnType();
                    ModifierContributor.ForMethod[] forMethodArr = new ModifierContributor.ForMethod[2];
                    forMethodArr[z3 ? 1 : 0] = Visibility.PRIVATE;
                    forMethodArr[1] = Ownership.STATIC;
                    builderIntercept = builderIntercept.defineMethod(LAMBDA_FACTORY, returnType, forMethodArr).withParameters((Collection<? extends TypeDefinition>) methodTypeOfLoaded.getParameterTypes()).intercept(FactoryImplementation.INSTANCE);
                }
                if (z) {
                    if (list.contains(Serializable.class)) {
                        c = 0;
                    } else {
                        c = 0;
                        builderIntercept = builderIntercept.implement(Serializable.class);
                    }
                    ModifierContributor.ForMethod[] forMethodArr2 = new ModifierContributor.ForMethod[1];
                    forMethodArr2[c] = Visibility.PRIVATE;
                    builderIntercept = builderIntercept.defineMethod("writeReplace", Object.class, forMethodArr2).intercept(new SerializationImplementation(TypeDescription.ForLoadedType.m5238of(clsLookupType), methodTypeOfLoaded.getReturnType(), str, methodTypeOfLoaded2, methodHandleOfLoaded, JavaConstant.MethodType.ofLoaded(obj5)));
                } else if (methodTypeOfLoaded.getReturnType().isAssignableTo(Serializable.class)) {
                    Class cls = Void.TYPE;
                    Visibility visibility2 = Visibility.PRIVATE;
                    builderIntercept = builderIntercept.defineMethod("readObject", cls, visibility2).withParameters(ObjectInputStream.class).throwing(NotSerializableException.class).intercept(ExceptionMethod.throwing((Class<? extends Throwable>) NotSerializableException.class, "Non-serializable lambda")).defineMethod("writeObject", cls, visibility2).withParameters(ObjectOutputStream.class).throwing(NotSerializableException.class).intercept(ExceptionMethod.throwing((Class<? extends Throwable>) NotSerializableException.class, "Non-serializable lambda"));
                }
                Iterator<?> it = list2.iterator();
                while (it.hasNext()) {
                    JavaConstant.MethodType methodTypeOfLoaded4 = JavaConstant.MethodType.ofLoaded(it.next());
                    builderIntercept = builderIntercept.defineMethod(str, methodTypeOfLoaded4.getReturnType(), MethodManifestation.BRIDGE, Visibility.PUBLIC).withParameters((Collection<? extends TypeDefinition>) methodTypeOfLoaded4.getParameterTypes()).intercept(new BridgeMethodImplementation(str, methodTypeOfLoaded2));
                }
                byte[] bytes = builderIntercept.make().getBytes();
                Iterator<? extends ClassFileTransformer> it2 = collection.iterator();
                while (it2.hasNext()) {
                    try {
                        byte[] bArrTransform = it2.next().transform(clsLookupType.getClassLoader(), str2.replace(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH, '/'), NOT_PREVIOUSLY_DEFINED, clsLookupType.getProtectionDomain(), bytes);
                        if (bArrTransform != null) {
                            bytes = bArrTransform;
                        }
                    } catch (Throwable unused) {
                    }
                }
                return bytes;
            }
        }

        /* JADX WARN: Enum visitor error
        jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'REGULAR' uses external variables
        	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
        	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
        	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
        	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
        	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
        	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
         */
        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        public static abstract class LambdaMetafactoryFactory implements ByteCodeAppender {
            private static final /* synthetic */ LambdaMetafactoryFactory[] $VALUES;
            public static final LambdaMetafactoryFactory ALTERNATIVE;
            private static final Loader LOADER;
            public static final LambdaMetafactoryFactory REGULAR;
            private final int localVariableLength;
            private final int stackSize;

            public interface Loader {

                public enum Unavailable implements Loader {
                    INSTANCE;

                    @Override // net.bytebuddy.agent.builder.AgentBuilder.LambdaInstrumentationStrategy.LambdaMetafactoryFactory.Loader
                    public void apply(MethodVisitor methodVisitor) {
                        throw new IllegalStateException("No lambda expression loading strategy available on current VM");
                    }

                    @Override // net.bytebuddy.agent.builder.AgentBuilder.LambdaInstrumentationStrategy.LambdaMetafactoryFactory.Loader
                    public int getLocalVariableLength() {
                        throw new IllegalStateException("No lambda expression loading strategy available on current VM");
                    }

                    @Override // net.bytebuddy.agent.builder.AgentBuilder.LambdaInstrumentationStrategy.LambdaMetafactoryFactory.Loader
                    public int getStackSize() {
                        throw new IllegalStateException("No lambda expression loading strategy available on current VM");
                    }
                }

                public enum UsingMethodHandleLookup implements Loader {
                    INSTANCE;

                    @Override // net.bytebuddy.agent.builder.AgentBuilder.LambdaInstrumentationStrategy.LambdaMetafactoryFactory.Loader
                    public void apply(MethodVisitor methodVisitor) {
                        methodVisitor.visitVarInsn(25, 0);
                        methodVisitor.visitVarInsn(25, 4);
                        methodVisitor.visitMethodInsn(182, "java/lang/invoke/MethodHandles$Lookup", "revealDirect", "(Ljava/lang/invoke/MethodHandle;)Ljava/lang/invoke/MethodHandleInfo;", false);
                        methodVisitor.visitVarInsn(58, 10);
                        methodVisitor.visitVarInsn(25, 10);
                        methodVisitor.visitMethodInsn(185, "java/lang/invoke/MethodHandleInfo", "getModifiers", "()I", true);
                        methodVisitor.visitMethodInsn(184, "java/lang/reflect/Modifier", "isProtected", "(I)Z", false);
                        Label label = new Label();
                        methodVisitor.visitJumpInsn(153, label);
                        methodVisitor.visitVarInsn(25, 0);
                        methodVisitor.visitMethodInsn(182, "java/lang/invoke/MethodHandles$Lookup", "lookupClass", "()Ljava/lang/Class;", false);
                        methodVisitor.visitVarInsn(25, 10);
                        methodVisitor.visitMethodInsn(185, "java/lang/invoke/MethodHandleInfo", "getDeclaringClass", "()Ljava/lang/Class;", true);
                        methodVisitor.visitMethodInsn(184, "sun/invoke/util/VerifyAccess", "isSamePackage", "(Ljava/lang/Class;Ljava/lang/Class;)Z", false);
                        Label label2 = new Label();
                        methodVisitor.visitJumpInsn(153, label2);
                        methodVisitor.visitLabel(label);
                        Integer num = Opcodes.INTEGER;
                        methodVisitor.visitFrame(0, 11, new Object[]{"java/lang/invoke/MethodHandles$Lookup", "java/lang/String", "java/lang/invoke/MethodType", "java/lang/invoke/MethodType", "java/lang/invoke/MethodHandle", "java/lang/invoke/MethodType", num, "java/util/List", "java/util/List", "[B", "java/lang/invoke/MethodHandleInfo"}, 0, new Object[0]);
                        methodVisitor.visitVarInsn(25, 10);
                        methodVisitor.visitMethodInsn(185, "java/lang/invoke/MethodHandleInfo", "getReferenceKind", "()I", true);
                        methodVisitor.visitIntInsn(16, 7);
                        Label label3 = new Label();
                        methodVisitor.visitJumpInsn(160, label3);
                        methodVisitor.visitLabel(label2);
                        methodVisitor.visitFrame(3, 0, null, 0, null);
                        methodVisitor.visitInsn(4);
                        Label label4 = new Label();
                        methodVisitor.visitJumpInsn(167, label4);
                        methodVisitor.visitLabel(label3);
                        methodVisitor.visitFrame(3, 0, null, 0, null);
                        methodVisitor.visitInsn(3);
                        methodVisitor.visitLabel(label4);
                        methodVisitor.visitFrame(4, 0, null, 1, new Object[]{num});
                        methodVisitor.visitVarInsn(54, 11);
                        methodVisitor.visitVarInsn(21, 11);
                        Label label5 = new Label();
                        methodVisitor.visitJumpInsn(153, label5);
                        methodVisitor.visitVarInsn(25, 0);
                        methodVisitor.visitVarInsn(25, 9);
                        methodVisitor.visitVarInsn(25, 10);
                        methodVisitor.visitInsn(4);
                        methodVisitor.visitInsn(5);
                        methodVisitor.visitTypeInsn(189, "java/lang/invoke/MethodHandles$Lookup$ClassOption");
                        methodVisitor.visitInsn(89);
                        methodVisitor.visitInsn(3);
                        methodVisitor.visitFieldInsn(178, "java/lang/invoke/MethodHandles$Lookup$ClassOption", "NESTMATE", "Ljava/lang/invoke/MethodHandles$Lookup$ClassOption;");
                        methodVisitor.visitInsn(83);
                        methodVisitor.visitInsn(89);
                        methodVisitor.visitInsn(4);
                        methodVisitor.visitFieldInsn(178, "java/lang/invoke/MethodHandles$Lookup$ClassOption", "STRONG", "Ljava/lang/invoke/MethodHandles$Lookup$ClassOption;");
                        methodVisitor.visitInsn(83);
                        methodVisitor.visitMethodInsn(182, "java/lang/invoke/MethodHandles$Lookup", "defineHiddenClassWithClassData", "([BLjava/lang/Object;Z[Ljava/lang/invoke/MethodHandles$Lookup$ClassOption;)Ljava/lang/invoke/MethodHandles$Lookup;", false);
                        methodVisitor.visitVarInsn(58, 12);
                        methodVisitor.visitLabel(new Label());
                        Label label6 = new Label();
                        methodVisitor.visitJumpInsn(167, label6);
                        methodVisitor.visitLabel(label5);
                        methodVisitor.visitFrame(1, 1, new Object[]{num}, 0, null);
                        methodVisitor.visitVarInsn(25, 0);
                        methodVisitor.visitVarInsn(25, 9);
                        methodVisitor.visitInsn(4);
                        methodVisitor.visitInsn(5);
                        methodVisitor.visitTypeInsn(189, "java/lang/invoke/MethodHandles$Lookup$ClassOption");
                        methodVisitor.visitInsn(89);
                        methodVisitor.visitInsn(3);
                        methodVisitor.visitFieldInsn(178, "java/lang/invoke/MethodHandles$Lookup$ClassOption", "NESTMATE", "Ljava/lang/invoke/MethodHandles$Lookup$ClassOption;");
                        methodVisitor.visitInsn(83);
                        methodVisitor.visitInsn(89);
                        methodVisitor.visitInsn(4);
                        methodVisitor.visitFieldInsn(178, "java/lang/invoke/MethodHandles$Lookup$ClassOption", "STRONG", "Ljava/lang/invoke/MethodHandles$Lookup$ClassOption;");
                        methodVisitor.visitInsn(83);
                        methodVisitor.visitMethodInsn(182, "java/lang/invoke/MethodHandles$Lookup", "defineHiddenClass", "([BZ[Ljava/lang/invoke/MethodHandles$Lookup$ClassOption;)Ljava/lang/invoke/MethodHandles$Lookup;", false);
                        methodVisitor.visitVarInsn(58, 12);
                        methodVisitor.visitLabel(label6);
                        methodVisitor.visitFrame(1, 1, new Object[]{"java/lang/invoke/MethodHandles$Lookup"}, 0, null);
                        methodVisitor.visitVarInsn(25, 12);
                        methodVisitor.visitMethodInsn(182, "java/lang/invoke/MethodHandles$Lookup", "lookupClass", "()Ljava/lang/Class;", false);
                        methodVisitor.visitVarInsn(58, 10);
                        methodVisitor.visitFrame(0, 10, new Object[]{"java/lang/invoke/MethodHandles$Lookup", "java/lang/String", "java/lang/invoke/MethodType", "java/lang/invoke/MethodType", "java/lang/invoke/MethodHandle", "java/lang/invoke/MethodType", num, "java/util/List", "java/util/List", TypeProxy.SilentConstruction.Appender.JAVA_LANG_CLASS_INTERNAL_NAME}, 0, null);
                    }

                    @Override // net.bytebuddy.agent.builder.AgentBuilder.LambdaInstrumentationStrategy.LambdaMetafactoryFactory.Loader
                    public int getLocalVariableLength() {
                        return 15;
                    }

                    @Override // net.bytebuddy.agent.builder.AgentBuilder.LambdaInstrumentationStrategy.LambdaMetafactoryFactory.Loader
                    public int getStackSize() {
                        return 8;
                    }
                }

                public enum UsingUnsafe implements Loader {
                    JDK_INTERNAL_MISC_UNSAFE("jdk/internal/misc/Unsafe"),
                    SUN_MISC_UNSAFE("sun/misc/Unsafe");

                    private final String type;

                    UsingUnsafe(String str) {
                        this.type = str;
                    }

                    @Override // net.bytebuddy.agent.builder.AgentBuilder.LambdaInstrumentationStrategy.LambdaMetafactoryFactory.Loader
                    public void apply(MethodVisitor methodVisitor) {
                        methodVisitor.visitMethodInsn(184, this.type, "getUnsafe", "()L" + this.type + ";", false);
                        methodVisitor.visitVarInsn(58, 11);
                        methodVisitor.visitVarInsn(25, 11);
                        methodVisitor.visitVarInsn(25, 0);
                        methodVisitor.visitMethodInsn(182, "java/lang/invoke/MethodHandles$Lookup", "lookupClass", "()Ljava/lang/Class;", false);
                        methodVisitor.visitVarInsn(25, 9);
                        methodVisitor.visitInsn(1);
                        methodVisitor.visitMethodInsn(182, this.type, "defineAnonymousClass", "(Ljava/lang/Class;[B[Ljava/lang/Object;)Ljava/lang/Class;", false);
                        methodVisitor.visitVarInsn(58, 10);
                        methodVisitor.visitVarInsn(25, 11);
                        methodVisitor.visitVarInsn(25, 10);
                        methodVisitor.visitMethodInsn(182, this.type, "ensureClassInitialized", "(Ljava/lang/Class;)V", false);
                    }

                    @Override // net.bytebuddy.agent.builder.AgentBuilder.LambdaInstrumentationStrategy.LambdaMetafactoryFactory.Loader
                    public int getLocalVariableLength() {
                        return 13;
                    }

                    @Override // net.bytebuddy.agent.builder.AgentBuilder.LambdaInstrumentationStrategy.LambdaMetafactoryFactory.Loader
                    public int getStackSize() {
                        return 4;
                    }

                    public String getType() {
                        return this.type;
                    }
                }

                void apply(MethodVisitor methodVisitor);

                int getLocalVariableLength();

                int getStackSize();
            }

            static {
                int i = 6;
                LambdaMetafactoryFactory lambdaMetafactoryFactory = new LambdaMetafactoryFactory("REGULAR", 0, i, 11) { // from class: net.bytebuddy.agent.builder.AgentBuilder.LambdaInstrumentationStrategy.LambdaMetafactoryFactory.1
                    @Override // net.bytebuddy.agent.builder.AgentBuilder.LambdaInstrumentationStrategy.LambdaMetafactoryFactory
                    public void onDispatch(MethodVisitor methodVisitor) {
                        methodVisitor.visitInsn(3);
                        methodVisitor.visitVarInsn(54, 6);
                        methodVisitor.visitMethodInsn(184, "java/util/Collections", "emptyList", "()Ljava/util/List;", false);
                        methodVisitor.visitVarInsn(58, 7);
                        methodVisitor.visitMethodInsn(184, "java/util/Collections", "emptyList", "()Ljava/util/List;", false);
                        methodVisitor.visitVarInsn(58, 8);
                        methodVisitor.visitFrame(1, 3, new Object[]{Opcodes.INTEGER, "java/util/List", "java/util/List"}, 0, null);
                    }
                };
                REGULAR = lambdaMetafactoryFactory;
                LambdaMetafactoryFactory lambdaMetafactoryFactory2 = new LambdaMetafactoryFactory("ALTERNATIVE", 1, i, 16) { // from class: net.bytebuddy.agent.builder.AgentBuilder.LambdaInstrumentationStrategy.LambdaMetafactoryFactory.2
                    @Override // net.bytebuddy.agent.builder.AgentBuilder.LambdaInstrumentationStrategy.LambdaMetafactoryFactory
                    public void onDispatch(MethodVisitor methodVisitor) {
                        methodVisitor.visitVarInsn(25, 3);
                        methodVisitor.visitInsn(6);
                        methodVisitor.visitInsn(50);
                        methodVisitor.visitTypeInsn(192, "java/lang/Integer");
                        methodVisitor.visitMethodInsn(182, "java/lang/Integer", "intValue", "()I", false);
                        methodVisitor.visitVarInsn(54, 4);
                        methodVisitor.visitInsn(7);
                        methodVisitor.visitVarInsn(54, 5);
                        methodVisitor.visitVarInsn(21, 4);
                        methodVisitor.visitInsn(5);
                        methodVisitor.visitInsn(126);
                        Label label = new Label();
                        methodVisitor.visitJumpInsn(153, label);
                        methodVisitor.visitVarInsn(25, 3);
                        methodVisitor.visitVarInsn(21, 5);
                        methodVisitor.visitIincInsn(5, 1);
                        methodVisitor.visitInsn(50);
                        methodVisitor.visitTypeInsn(192, "java/lang/Integer");
                        methodVisitor.visitMethodInsn(182, "java/lang/Integer", "intValue", "()I", false);
                        methodVisitor.visitVarInsn(54, 7);
                        methodVisitor.visitVarInsn(21, 7);
                        methodVisitor.visitTypeInsn(189, TypeProxy.SilentConstruction.Appender.JAVA_LANG_CLASS_INTERNAL_NAME);
                        methodVisitor.visitVarInsn(58, 6);
                        methodVisitor.visitVarInsn(25, 3);
                        methodVisitor.visitVarInsn(21, 5);
                        methodVisitor.visitVarInsn(25, 6);
                        methodVisitor.visitInsn(3);
                        methodVisitor.visitVarInsn(21, 7);
                        methodVisitor.visitMethodInsn(184, "java/lang/System", "arraycopy", "(Ljava/lang/Object;ILjava/lang/Object;II)V", false);
                        methodVisitor.visitVarInsn(21, 5);
                        methodVisitor.visitVarInsn(21, 7);
                        methodVisitor.visitInsn(96);
                        methodVisitor.visitVarInsn(54, 5);
                        Label label2 = new Label();
                        methodVisitor.visitJumpInsn(167, label2);
                        methodVisitor.visitLabel(label);
                        Integer num = Opcodes.INTEGER;
                        methodVisitor.visitFrame(1, 2, new Object[]{num, num}, 0, null);
                        methodVisitor.visitInsn(3);
                        methodVisitor.visitTypeInsn(189, TypeProxy.SilentConstruction.Appender.JAVA_LANG_CLASS_INTERNAL_NAME);
                        methodVisitor.visitVarInsn(58, 6);
                        methodVisitor.visitLabel(label2);
                        methodVisitor.visitFrame(1, 1, new Object[]{"[Ljava/lang/Class;"}, 0, null);
                        methodVisitor.visitVarInsn(21, 4);
                        methodVisitor.visitInsn(5);
                        methodVisitor.visitInsn(126);
                        Label label3 = new Label();
                        methodVisitor.visitJumpInsn(153, label3);
                        methodVisitor.visitVarInsn(25, 3);
                        methodVisitor.visitVarInsn(21, 5);
                        methodVisitor.visitIincInsn(5, 1);
                        methodVisitor.visitInsn(50);
                        methodVisitor.visitTypeInsn(192, "java/lang/Integer");
                        methodVisitor.visitMethodInsn(182, "java/lang/Integer", "intValue", "()I", false);
                        methodVisitor.visitVarInsn(54, 8);
                        methodVisitor.visitVarInsn(21, 8);
                        methodVisitor.visitTypeInsn(189, "java/lang/invoke/MethodType");
                        methodVisitor.visitVarInsn(58, 7);
                        methodVisitor.visitVarInsn(25, 3);
                        methodVisitor.visitVarInsn(21, 5);
                        methodVisitor.visitVarInsn(25, 7);
                        methodVisitor.visitInsn(3);
                        methodVisitor.visitVarInsn(21, 8);
                        methodVisitor.visitMethodInsn(184, "java/lang/System", "arraycopy", "(Ljava/lang/Object;ILjava/lang/Object;II)V", false);
                        Label label4 = new Label();
                        methodVisitor.visitJumpInsn(167, label4);
                        methodVisitor.visitLabel(label3);
                        methodVisitor.visitFrame(3, 0, null, 0, null);
                        methodVisitor.visitInsn(3);
                        methodVisitor.visitTypeInsn(189, "java/lang/invoke/MethodType");
                        methodVisitor.visitVarInsn(58, 7);
                        methodVisitor.visitLabel(label4);
                        methodVisitor.visitFrame(1, 1, new Object[]{"[Ljava/lang/invoke/MethodType;"}, 0, null);
                        methodVisitor.visitVarInsn(25, 3);
                        methodVisitor.visitInsn(3);
                        methodVisitor.visitInsn(50);
                        methodVisitor.visitTypeInsn(192, "java/lang/invoke/MethodType");
                        methodVisitor.visitVarInsn(58, 8);
                        methodVisitor.visitVarInsn(25, 3);
                        methodVisitor.visitInsn(4);
                        methodVisitor.visitInsn(50);
                        methodVisitor.visitTypeInsn(192, "java/lang/invoke/MethodHandle");
                        methodVisitor.visitVarInsn(58, 9);
                        methodVisitor.visitVarInsn(25, 3);
                        methodVisitor.visitInsn(5);
                        methodVisitor.visitInsn(50);
                        methodVisitor.visitTypeInsn(192, "java/lang/invoke/MethodType");
                        methodVisitor.visitVarInsn(58, 10);
                        methodVisitor.visitVarInsn(21, 4);
                        methodVisitor.visitInsn(4);
                        methodVisitor.visitInsn(126);
                        Label label5 = new Label();
                        methodVisitor.visitJumpInsn(153, label5);
                        methodVisitor.visitInsn(4);
                        Label label6 = new Label();
                        methodVisitor.visitJumpInsn(167, label6);
                        methodVisitor.visitLabel(label5);
                        methodVisitor.visitFrame(1, 3, new Object[]{"java/lang/invoke/MethodType", "java/lang/invoke/MethodHandle", "java/lang/invoke/MethodType"}, 0, null);
                        methodVisitor.visitInsn(3);
                        methodVisitor.visitLabel(label6);
                        methodVisitor.visitFrame(4, 0, null, 1, new Object[]{num});
                        methodVisitor.visitVarInsn(54, 11);
                        methodVisitor.visitVarInsn(25, 6);
                        methodVisitor.visitMethodInsn(184, "java/util/Arrays", "asList", "([Ljava/lang/Object;)Ljava/util/List;", false);
                        methodVisitor.visitVarInsn(58, 12);
                        methodVisitor.visitVarInsn(25, 7);
                        methodVisitor.visitMethodInsn(184, "java/util/Arrays", "asList", "([Ljava/lang/Object;)Ljava/util/List;", false);
                        methodVisitor.visitVarInsn(58, 13);
                        methodVisitor.visitVarInsn(25, 8);
                        methodVisitor.visitVarInsn(58, 3);
                        methodVisitor.visitVarInsn(25, 9);
                        methodVisitor.visitVarInsn(58, 4);
                        methodVisitor.visitVarInsn(25, 10);
                        methodVisitor.visitVarInsn(58, 5);
                        methodVisitor.visitVarInsn(21, 11);
                        methodVisitor.visitVarInsn(54, 6);
                        methodVisitor.visitVarInsn(25, 12);
                        methodVisitor.visitVarInsn(58, 7);
                        methodVisitor.visitVarInsn(25, 13);
                        methodVisitor.visitVarInsn(58, 8);
                        methodVisitor.visitFrame(0, 9, new Object[]{"java/lang/invoke/MethodHandles$Lookup", "java/lang/String", "java/lang/invoke/MethodType", "java/lang/invoke/MethodType", "java/lang/invoke/MethodHandle", "java/lang/invoke/MethodType", num, "java/util/List", "java/util/List"}, 0, null);
                    }
                };
                ALTERNATIVE = lambdaMetafactoryFactory2;
                $VALUES = new LambdaMetafactoryFactory[]{lambdaMetafactoryFactory, lambdaMetafactoryFactory2};
                LOADER = resolve();
            }

            @SuppressFBWarnings(justification = "Exception should not be rethrown but trigger a fallback.", value = {"DE_MIGHT_IGNORE", "REC_CATCH_EXCEPTION"})
            private static Loader resolve() {
                try {
                    Class<?> cls = Class.forName("java.lang.invoke.MethodHandles$Lookup", false, null);
                    Class cls2 = Boolean.TYPE;
                    cls.getMethod("defineHiddenClass", byte[].class, cls2, Class.forName("[Ljava.lang.invoke.MethodHandles$Lookup$ClassOption;", false, null));
                    cls.getMethod("defineHiddenClassWithClassData", byte[].class, Object.class, cls2, Class.forName("[Ljava.lang.invoke.MethodHandles$Lookup$ClassOption;", false, null));
                    return Loader.UsingMethodHandleLookup.INSTANCE;
                } catch (Exception unused) {
                    for (Loader.UsingUnsafe usingUnsafe : Loader.UsingUnsafe.values()) {
                        try {
                            Class.forName(usingUnsafe.getType().replace('/', TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH), false, null).getMethod("defineAnonymousClass", Class.class, byte[].class, Object[].class);
                            return usingUnsafe;
                        } catch (Exception unused2) {
                        }
                    }
                    return Loader.Unavailable.INSTANCE;
                }
            }

            public static LambdaMetafactoryFactory valueOf(String str) {
                return (LambdaMetafactoryFactory) Enum.valueOf(LambdaMetafactoryFactory.class, str);
            }

            public static LambdaMetafactoryFactory[] values() {
                return (LambdaMetafactoryFactory[]) $VALUES.clone();
            }

            @Override // net.bytebuddy.implementation.bytecode.ByteCodeAppender
            public ByteCodeAppender.Size apply(MethodVisitor methodVisitor, Implementation.Context context, MethodDescription methodDescription) {
                onDispatch(methodVisitor);
                methodVisitor.visitMethodInsn(184, "java/lang/ClassLoader", "getSystemClassLoader", "()Ljava/lang/ClassLoader;", false);
                methodVisitor.visitLdcInsn("net.bytebuddy.agent.builder.LambdaFactory");
                methodVisitor.visitMethodInsn(182, "java/lang/ClassLoader", "loadClass", "(Ljava/lang/String;)Ljava/lang/Class;", false);
                methodVisitor.visitLdcInsn(TypeProxy.REFLECTION_METHOD);
                methodVisitor.visitIntInsn(16, 9);
                methodVisitor.visitTypeInsn(189, TypeProxy.SilentConstruction.Appender.JAVA_LANG_CLASS_INTERNAL_NAME);
                methodVisitor.visitInsn(89);
                methodVisitor.visitInsn(3);
                methodVisitor.visitLdcInsn(Type.getType(TypeProxy.SilentConstruction.Appender.JAVA_LANG_OBJECT_DESCRIPTOR));
                methodVisitor.visitInsn(83);
                methodVisitor.visitInsn(89);
                methodVisitor.visitInsn(4);
                methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/String;"));
                methodVisitor.visitInsn(83);
                methodVisitor.visitInsn(89);
                methodVisitor.visitInsn(5);
                methodVisitor.visitLdcInsn(Type.getType(TypeProxy.SilentConstruction.Appender.JAVA_LANG_OBJECT_DESCRIPTOR));
                methodVisitor.visitInsn(83);
                methodVisitor.visitInsn(89);
                methodVisitor.visitInsn(6);
                methodVisitor.visitLdcInsn(Type.getType(TypeProxy.SilentConstruction.Appender.JAVA_LANG_OBJECT_DESCRIPTOR));
                methodVisitor.visitInsn(83);
                methodVisitor.visitInsn(89);
                methodVisitor.visitInsn(7);
                methodVisitor.visitLdcInsn(Type.getType(TypeProxy.SilentConstruction.Appender.JAVA_LANG_OBJECT_DESCRIPTOR));
                methodVisitor.visitInsn(83);
                methodVisitor.visitInsn(89);
                methodVisitor.visitInsn(8);
                methodVisitor.visitLdcInsn(Type.getType(TypeProxy.SilentConstruction.Appender.JAVA_LANG_OBJECT_DESCRIPTOR));
                methodVisitor.visitInsn(83);
                methodVisitor.visitInsn(89);
                methodVisitor.visitIntInsn(16, 6);
                methodVisitor.visitFieldInsn(178, "java/lang/Boolean", "TYPE", "Ljava/lang/Class;");
                methodVisitor.visitInsn(83);
                methodVisitor.visitInsn(89);
                methodVisitor.visitIntInsn(16, 7);
                methodVisitor.visitLdcInsn(Type.getType("Ljava/util/List;"));
                methodVisitor.visitInsn(83);
                methodVisitor.visitInsn(89);
                methodVisitor.visitIntInsn(16, 8);
                methodVisitor.visitLdcInsn(Type.getType("Ljava/util/List;"));
                methodVisitor.visitInsn(83);
                methodVisitor.visitMethodInsn(182, TypeProxy.SilentConstruction.Appender.JAVA_LANG_CLASS_INTERNAL_NAME, "getDeclaredMethod", "(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;", false);
                methodVisitor.visitInsn(1);
                methodVisitor.visitIntInsn(16, 9);
                methodVisitor.visitTypeInsn(189, TypeProxy.SilentConstruction.Appender.JAVA_LANG_OBJECT_INTERNAL_NAME);
                methodVisitor.visitInsn(89);
                methodVisitor.visitInsn(3);
                methodVisitor.visitVarInsn(25, 0);
                methodVisitor.visitInsn(83);
                methodVisitor.visitInsn(89);
                methodVisitor.visitInsn(4);
                methodVisitor.visitVarInsn(25, 1);
                methodVisitor.visitInsn(83);
                methodVisitor.visitInsn(89);
                methodVisitor.visitInsn(5);
                methodVisitor.visitVarInsn(25, 2);
                methodVisitor.visitInsn(83);
                methodVisitor.visitInsn(89);
                methodVisitor.visitInsn(6);
                methodVisitor.visitVarInsn(25, 3);
                methodVisitor.visitInsn(83);
                methodVisitor.visitInsn(89);
                methodVisitor.visitInsn(7);
                methodVisitor.visitVarInsn(25, 4);
                methodVisitor.visitInsn(83);
                methodVisitor.visitInsn(89);
                methodVisitor.visitInsn(8);
                methodVisitor.visitVarInsn(25, 5);
                methodVisitor.visitInsn(83);
                methodVisitor.visitInsn(89);
                methodVisitor.visitIntInsn(16, 6);
                methodVisitor.visitVarInsn(21, 6);
                methodVisitor.visitMethodInsn(184, "java/lang/Boolean", "valueOf", "(Z)Ljava/lang/Boolean;", false);
                methodVisitor.visitInsn(83);
                methodVisitor.visitInsn(89);
                methodVisitor.visitIntInsn(16, 7);
                methodVisitor.visitVarInsn(25, 7);
                methodVisitor.visitInsn(83);
                methodVisitor.visitInsn(89);
                methodVisitor.visitIntInsn(16, 8);
                methodVisitor.visitVarInsn(25, 8);
                methodVisitor.visitInsn(83);
                methodVisitor.visitMethodInsn(182, "java/lang/reflect/Method", "invoke", "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", false);
                methodVisitor.visitTypeInsn(192, "[B");
                methodVisitor.visitVarInsn(58, 9);
                Loader loader = LOADER;
                loader.apply(methodVisitor);
                methodVisitor.visitVarInsn(25, 2);
                methodVisitor.visitMethodInsn(182, "java/lang/invoke/MethodType", "parameterCount", "()I", false);
                Label label = new Label();
                methodVisitor.visitJumpInsn(154, label);
                methodVisitor.visitTypeInsn(187, "java/lang/invoke/ConstantCallSite");
                methodVisitor.visitInsn(89);
                methodVisitor.visitVarInsn(25, 2);
                methodVisitor.visitMethodInsn(182, "java/lang/invoke/MethodType", "returnType", "()Ljava/lang/Class;", false);
                methodVisitor.visitVarInsn(25, 10);
                methodVisitor.visitMethodInsn(182, TypeProxy.SilentConstruction.Appender.JAVA_LANG_CLASS_INTERNAL_NAME, "getDeclaredConstructors", "()[Ljava/lang/reflect/Constructor;", false);
                methodVisitor.visitInsn(3);
                methodVisitor.visitInsn(50);
                methodVisitor.visitInsn(3);
                methodVisitor.visitTypeInsn(189, TypeProxy.SilentConstruction.Appender.JAVA_LANG_OBJECT_INTERNAL_NAME);
                methodVisitor.visitMethodInsn(182, TypeProxy.SilentConstruction.Appender.JAVA_LANG_CONSTRUCTOR_INTERNAL_NAME, TypeProxy.SilentConstruction.Appender.NEW_INSTANCE_METHOD_NAME, TypeProxy.SilentConstruction.Appender.NEW_INSTANCE_METHOD_DESCRIPTOR, false);
                methodVisitor.visitMethodInsn(184, "java/lang/invoke/MethodHandles", "constant", "(Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/invoke/MethodHandle;", false);
                methodVisitor.visitMethodInsn(183, "java/lang/invoke/ConstantCallSite", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/invoke/MethodHandle;)V", false);
                Label label2 = new Label();
                methodVisitor.visitJumpInsn(167, label2);
                methodVisitor.visitLabel(label);
                methodVisitor.visitFrame(0, 11, new Object[]{"java/lang/invoke/MethodHandles$Lookup", "java/lang/String", "java/lang/invoke/MethodType", "java/lang/invoke/MethodType", "java/lang/invoke/MethodHandle", "java/lang/invoke/MethodType", Opcodes.INTEGER, "java/util/List", "java/util/List", "[B", TypeProxy.SilentConstruction.Appender.JAVA_LANG_CLASS_INTERNAL_NAME}, 0, new Object[0]);
                methodVisitor.visitTypeInsn(187, "java/lang/invoke/ConstantCallSite");
                methodVisitor.visitInsn(89);
                methodVisitor.visitFieldInsn(178, "java/lang/invoke/MethodHandles$Lookup", "IMPL_LOOKUP", "Ljava/lang/invoke/MethodHandles$Lookup;");
                methodVisitor.visitVarInsn(25, 10);
                methodVisitor.visitLdcInsn("get$Lambda");
                methodVisitor.visitVarInsn(25, 2);
                methodVisitor.visitMethodInsn(182, "java/lang/invoke/MethodHandles$Lookup", "findStatic", "(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/MethodHandle;", false);
                methodVisitor.visitMethodInsn(183, "java/lang/invoke/ConstantCallSite", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/invoke/MethodHandle;)V", false);
                methodVisitor.visitLabel(label2);
                methodVisitor.visitFrame(4, 0, null, 1, new Object[]{"java/lang/invoke/CallSite"});
                methodVisitor.visitInsn(176);
                return new ByteCodeAppender.Size(Math.max(this.stackSize, loader.getStackSize()), Math.max(this.localVariableLength, loader.getLocalVariableLength()));
            }

            public abstract void onDispatch(MethodVisitor methodVisitor);

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            private LambdaMetafactoryFactory(String str, int i, int i2, int i3) {
                this.stackSize = i2;
                this.localVariableLength = i3;
            }
        }

        /* JADX INFO: renamed from: of */
        public static LambdaInstrumentationStrategy m5130of(boolean z) {
            return z ? ENABLED : DISABLED;
        }

        public static void release(ClassFileTransformer classFileTransformer, Instrumentation instrumentation) {
            if (LambdaFactory.release(classFileTransformer)) {
                try {
                    ClassReloadingStrategy.m5275of(instrumentation).reset(Class.forName("java.lang.invoke.LambdaMetafactory"));
                } catch (Exception e) {
                    throw new IllegalStateException("Could not release lambda transformer", e);
                }
            }
        }

        public abstract void apply(ByteBuddy byteBuddy, Instrumentation instrumentation, ClassFileTransformer classFileTransformer);

        public boolean isEnabled() {
            return this == ENABLED;
        }

        public abstract boolean isInstrumented(@MaybeNull Class<?> cls);
    }

    public interface Listener {
        public static final boolean LOADED = true;

        public static abstract class Adapter implements Listener {
            @Override // net.bytebuddy.agent.builder.AgentBuilder.Listener
            public void onComplete(String str, @MaybeNull ClassLoader classLoader, @MaybeNull JavaModule javaModule, boolean z) {
            }

            @Override // net.bytebuddy.agent.builder.AgentBuilder.Listener
            public void onDiscovery(String str, @MaybeNull ClassLoader classLoader, @MaybeNull JavaModule javaModule, boolean z) {
            }

            @Override // net.bytebuddy.agent.builder.AgentBuilder.Listener
            public void onError(String str, @MaybeNull ClassLoader classLoader, @MaybeNull JavaModule javaModule, boolean z, Throwable th) {
            }

            @Override // net.bytebuddy.agent.builder.AgentBuilder.Listener
            public void onIgnored(TypeDescription typeDescription, @MaybeNull ClassLoader classLoader, @MaybeNull JavaModule javaModule, boolean z) {
            }

            @Override // net.bytebuddy.agent.builder.AgentBuilder.Listener
            public void onTransformation(TypeDescription typeDescription, @MaybeNull ClassLoader classLoader, @MaybeNull JavaModule javaModule, boolean z, DynamicType dynamicType) {
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class Compound implements Listener {
            private final List<Listener> listeners;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public Compound(Listener... listenerArr) {
                this((List<? extends Listener>) Arrays.asList(listenerArr));
            }

            public boolean equals(@MaybeNull Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && getClass() == obj.getClass() && this.listeners.equals(((Compound) obj).listeners);
            }

            public int hashCode() {
                return (getClass().hashCode() * 31) + this.listeners.hashCode();
            }

            @Override // net.bytebuddy.agent.builder.AgentBuilder.Listener
            public void onComplete(String str, @MaybeNull ClassLoader classLoader, @MaybeNull JavaModule javaModule, boolean z) {
                Iterator<Listener> it = this.listeners.iterator();
                while (it.hasNext()) {
                    it.next().onComplete(str, classLoader, javaModule, z);
                }
            }

            @Override // net.bytebuddy.agent.builder.AgentBuilder.Listener
            public void onDiscovery(String str, @MaybeNull ClassLoader classLoader, @MaybeNull JavaModule javaModule, boolean z) {
                Iterator<Listener> it = this.listeners.iterator();
                while (it.hasNext()) {
                    it.next().onDiscovery(str, classLoader, javaModule, z);
                }
            }

            @Override // net.bytebuddy.agent.builder.AgentBuilder.Listener
            public void onError(String str, @MaybeNull ClassLoader classLoader, @MaybeNull JavaModule javaModule, boolean z, Throwable th) {
                Iterator<Listener> it = this.listeners.iterator();
                while (it.hasNext()) {
                    it.next().onError(str, classLoader, javaModule, z, th);
                }
            }

            @Override // net.bytebuddy.agent.builder.AgentBuilder.Listener
            public void onIgnored(TypeDescription typeDescription, @MaybeNull ClassLoader classLoader, @MaybeNull JavaModule javaModule, boolean z) {
                Iterator<Listener> it = this.listeners.iterator();
                while (it.hasNext()) {
                    it.next().onIgnored(typeDescription, classLoader, javaModule, z);
                }
            }

            @Override // net.bytebuddy.agent.builder.AgentBuilder.Listener
            public void onTransformation(TypeDescription typeDescription, @MaybeNull ClassLoader classLoader, @MaybeNull JavaModule javaModule, boolean z, DynamicType dynamicType) {
                Iterator<Listener> it = this.listeners.iterator();
                while (it.hasNext()) {
                    it.next().onTransformation(typeDescription, classLoader, javaModule, z, dynamicType);
                }
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            public Compound(List<? extends Listener> list) {
                this.listeners = new ArrayList();
                for (Listener listener : list) {
                    if (listener instanceof Compound) {
                        this.listeners.addAll(((Compound) listener).listeners);
                    } else if (!(listener instanceof NoOp)) {
                        this.listeners.add(listener);
                    }
                }
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class Filtering implements Listener {
            private final Listener delegate;
            private final ElementMatcher<? super String> matcher;

            public Filtering(ElementMatcher<? super String> elementMatcher, Listener listener) {
                this.matcher = elementMatcher;
                this.delegate = listener;
            }

            public boolean equals(@MaybeNull Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                Filtering filtering = (Filtering) obj;
                return this.matcher.equals(filtering.matcher) && this.delegate.equals(filtering.delegate);
            }

            public int hashCode() {
                return (((getClass().hashCode() * 31) + this.matcher.hashCode()) * 31) + this.delegate.hashCode();
            }

            @Override // net.bytebuddy.agent.builder.AgentBuilder.Listener
            public void onComplete(String str, @MaybeNull ClassLoader classLoader, @MaybeNull JavaModule javaModule, boolean z) {
                if (this.matcher.matches(str)) {
                    this.delegate.onComplete(str, classLoader, javaModule, z);
                }
            }

            @Override // net.bytebuddy.agent.builder.AgentBuilder.Listener
            public void onDiscovery(String str, @MaybeNull ClassLoader classLoader, @MaybeNull JavaModule javaModule, boolean z) {
                if (this.matcher.matches(str)) {
                    this.delegate.onDiscovery(str, classLoader, javaModule, z);
                }
            }

            @Override // net.bytebuddy.agent.builder.AgentBuilder.Listener
            public void onError(String str, @MaybeNull ClassLoader classLoader, @MaybeNull JavaModule javaModule, boolean z, Throwable th) {
                if (this.matcher.matches(str)) {
                    this.delegate.onError(str, classLoader, javaModule, z, th);
                }
            }

            @Override // net.bytebuddy.agent.builder.AgentBuilder.Listener
            public void onIgnored(TypeDescription typeDescription, @MaybeNull ClassLoader classLoader, @MaybeNull JavaModule javaModule, boolean z) {
                if (this.matcher.matches(typeDescription.getName())) {
                    this.delegate.onIgnored(typeDescription, classLoader, javaModule, z);
                }
            }

            @Override // net.bytebuddy.agent.builder.AgentBuilder.Listener
            public void onTransformation(TypeDescription typeDescription, @MaybeNull ClassLoader classLoader, @MaybeNull JavaModule javaModule, boolean z, DynamicType dynamicType) {
                if (this.matcher.matches(typeDescription.getName())) {
                    this.delegate.onTransformation(typeDescription, classLoader, javaModule, z, dynamicType);
                }
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class ModuleReadEdgeCompleting extends Adapter {
            private final boolean addTargetEdge;
            private final Instrumentation instrumentation;
            private final Set<? extends JavaModule> modules;

            public ModuleReadEdgeCompleting(Instrumentation instrumentation, boolean z, Set<? extends JavaModule> set) {
                this.instrumentation = instrumentation;
                this.addTargetEdge = z;
                this.modules = set;
            }

            /* JADX INFO: renamed from: of */
            public static Listener m5132of(Instrumentation instrumentation, boolean z, Class<?>... clsArr) {
                HashSet hashSet = new HashSet();
                for (Class<?> cls : clsArr) {
                    hashSet.add(JavaModule.ofType(cls));
                }
                return hashSet.isEmpty() ? NoOp.INSTANCE : new ModuleReadEdgeCompleting(instrumentation, z, hashSet);
            }

            public boolean equals(@MaybeNull Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                ModuleReadEdgeCompleting moduleReadEdgeCompleting = (ModuleReadEdgeCompleting) obj;
                return this.addTargetEdge == moduleReadEdgeCompleting.addTargetEdge && this.instrumentation.equals(moduleReadEdgeCompleting.instrumentation) && this.modules.equals(moduleReadEdgeCompleting.modules);
            }

            public int hashCode() {
                return (((((getClass().hashCode() * 31) + this.instrumentation.hashCode()) * 31) + (this.addTargetEdge ? 1 : 0)) * 31) + this.modules.hashCode();
            }

            @Override // net.bytebuddy.agent.builder.AgentBuilder.Listener.Adapter, net.bytebuddy.agent.builder.AgentBuilder.Listener
            public void onTransformation(TypeDescription typeDescription, @MaybeNull ClassLoader classLoader, @MaybeNull JavaModule javaModule, boolean z, DynamicType dynamicType) {
                if (javaModule == JavaModule.UNSUPPORTED || !javaModule.isNamed()) {
                    return;
                }
                for (JavaModule javaModule2 : this.modules) {
                    if (!javaModule.canRead(javaModule2) || (this.addTargetEdge && !javaModule.isOpened(typeDescription.getPackage(), javaModule2))) {
                        PackageDescription packageDescription = typeDescription.getPackage();
                        ClassInjector.UsingInstrumentation.redefineModule(this.instrumentation, javaModule, Collections.singleton(javaModule2), Collections.emptyMap(), (!this.addTargetEdge || packageDescription == null || packageDescription.isDefault()) ? Collections.emptyMap() : Collections.singletonMap(packageDescription.getName(), Collections.singleton(javaModule2)), Collections.emptySet(), Collections.emptyMap());
                    }
                    if (this.addTargetEdge && !javaModule2.canRead(javaModule)) {
                        ClassInjector.UsingInstrumentation.redefineModule(this.instrumentation, javaModule2, Collections.singleton(javaModule), Collections.emptyMap(), Collections.emptyMap(), Collections.emptySet(), Collections.emptyMap());
                    }
                }
            }
        }

        public enum NoOp implements Listener {
            INSTANCE;

            @Override // net.bytebuddy.agent.builder.AgentBuilder.Listener
            public void onComplete(String str, @MaybeNull ClassLoader classLoader, @MaybeNull JavaModule javaModule, boolean z) {
            }

            @Override // net.bytebuddy.agent.builder.AgentBuilder.Listener
            public void onDiscovery(String str, @MaybeNull ClassLoader classLoader, @MaybeNull JavaModule javaModule, boolean z) {
            }

            @Override // net.bytebuddy.agent.builder.AgentBuilder.Listener
            public void onError(String str, @MaybeNull ClassLoader classLoader, @MaybeNull JavaModule javaModule, boolean z, Throwable th) {
            }

            @Override // net.bytebuddy.agent.builder.AgentBuilder.Listener
            public void onIgnored(TypeDescription typeDescription, @MaybeNull ClassLoader classLoader, @MaybeNull JavaModule javaModule, boolean z) {
            }

            @Override // net.bytebuddy.agent.builder.AgentBuilder.Listener
            public void onTransformation(TypeDescription typeDescription, @MaybeNull ClassLoader classLoader, @MaybeNull JavaModule javaModule, boolean z, DynamicType dynamicType) {
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class StreamWriting implements Listener {
            protected static final String PREFIX = "[Byte Buddy]";
            private final PrintStream printStream;

            public StreamWriting(PrintStream printStream) {
                this.printStream = printStream;
            }

            public static StreamWriting toSystemError() {
                return new StreamWriting(System.err);
            }

            public static StreamWriting toSystemOut() {
                return new StreamWriting(System.out);
            }

            public boolean equals(@MaybeNull Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && getClass() == obj.getClass() && this.printStream.equals(((StreamWriting) obj).printStream);
            }

            public int hashCode() {
                return (getClass().hashCode() * 31) + this.printStream.hashCode();
            }

            @Override // net.bytebuddy.agent.builder.AgentBuilder.Listener
            public void onComplete(String str, @MaybeNull ClassLoader classLoader, @MaybeNull JavaModule javaModule, boolean z) {
                this.printStream.printf("[Byte Buddy] COMPLETE %s [%s, %s, %s, loaded=%b]%n", str, classLoader, javaModule, Thread.currentThread(), Boolean.valueOf(z));
            }

            @Override // net.bytebuddy.agent.builder.AgentBuilder.Listener
            public void onDiscovery(String str, @MaybeNull ClassLoader classLoader, @MaybeNull JavaModule javaModule, boolean z) {
                this.printStream.printf("[Byte Buddy] DISCOVERY %s [%s, %s, %s, loaded=%b]%n", str, classLoader, javaModule, Thread.currentThread(), Boolean.valueOf(z));
            }

            @Override // net.bytebuddy.agent.builder.AgentBuilder.Listener
            public void onError(String str, @MaybeNull ClassLoader classLoader, @MaybeNull JavaModule javaModule, boolean z, Throwable th) {
                synchronized (this.printStream) {
                    this.printStream.printf("[Byte Buddy] ERROR %s [%s, %s, %s, loaded=%b]%n", str, classLoader, javaModule, Thread.currentThread(), Boolean.valueOf(z));
                    th.printStackTrace(this.printStream);
                }
            }

            @Override // net.bytebuddy.agent.builder.AgentBuilder.Listener
            public void onIgnored(TypeDescription typeDescription, @MaybeNull ClassLoader classLoader, @MaybeNull JavaModule javaModule, boolean z) {
                this.printStream.printf("[Byte Buddy] IGNORE %s [%s, %s, %s, loaded=%b]%n", typeDescription.getName(), classLoader, javaModule, Thread.currentThread(), Boolean.valueOf(z));
            }

            @Override // net.bytebuddy.agent.builder.AgentBuilder.Listener
            public void onTransformation(TypeDescription typeDescription, @MaybeNull ClassLoader classLoader, @MaybeNull JavaModule javaModule, boolean z, DynamicType dynamicType) {
                this.printStream.printf("[Byte Buddy] TRANSFORM %s [%s, %s, %s, loaded=%b]%n", typeDescription.getName(), classLoader, javaModule, Thread.currentThread(), Boolean.valueOf(z));
            }

            public Listener withErrorsOnly() {
                return new WithErrorsOnly(this);
            }

            public Listener withTransformationsOnly() {
                return new WithTransformationsOnly(this);
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class WithErrorsOnly extends Adapter {
            private final Listener delegate;

            public WithErrorsOnly(Listener listener) {
                this.delegate = listener;
            }

            public boolean equals(@MaybeNull Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && getClass() == obj.getClass() && this.delegate.equals(((WithErrorsOnly) obj).delegate);
            }

            public int hashCode() {
                return (getClass().hashCode() * 31) + this.delegate.hashCode();
            }

            @Override // net.bytebuddy.agent.builder.AgentBuilder.Listener.Adapter, net.bytebuddy.agent.builder.AgentBuilder.Listener
            public void onError(String str, @MaybeNull ClassLoader classLoader, @MaybeNull JavaModule javaModule, boolean z, Throwable th) {
                this.delegate.onError(str, classLoader, javaModule, z, th);
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class WithTransformationsOnly extends Adapter {
            private final Listener delegate;

            public WithTransformationsOnly(Listener listener) {
                this.delegate = listener;
            }

            public boolean equals(@MaybeNull Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && getClass() == obj.getClass() && this.delegate.equals(((WithTransformationsOnly) obj).delegate);
            }

            public int hashCode() {
                return (getClass().hashCode() * 31) + this.delegate.hashCode();
            }

            @Override // net.bytebuddy.agent.builder.AgentBuilder.Listener.Adapter, net.bytebuddy.agent.builder.AgentBuilder.Listener
            public void onError(String str, @MaybeNull ClassLoader classLoader, @MaybeNull JavaModule javaModule, boolean z, Throwable th) {
                this.delegate.onError(str, classLoader, javaModule, z, th);
            }

            @Override // net.bytebuddy.agent.builder.AgentBuilder.Listener.Adapter, net.bytebuddy.agent.builder.AgentBuilder.Listener
            public void onTransformation(TypeDescription typeDescription, @MaybeNull ClassLoader classLoader, @MaybeNull JavaModule javaModule, boolean z, DynamicType dynamicType) {
                this.delegate.onTransformation(typeDescription, classLoader, javaModule, z, dynamicType);
            }
        }

        void onComplete(String str, @MaybeNull ClassLoader classLoader, @MaybeNull JavaModule javaModule, boolean z);

        void onDiscovery(String str, @MaybeNull ClassLoader classLoader, @MaybeNull JavaModule javaModule, boolean z);

        void onError(String str, @MaybeNull ClassLoader classLoader, @MaybeNull JavaModule javaModule, boolean z, Throwable th);

        void onIgnored(TypeDescription typeDescription, @MaybeNull ClassLoader classLoader, @MaybeNull JavaModule javaModule, boolean z);

        void onTransformation(TypeDescription typeDescription, @MaybeNull ClassLoader classLoader, @MaybeNull JavaModule javaModule, boolean z, DynamicType dynamicType);
    }

    public interface LocationStrategy {

        @HashCodeAndEqualsPlugin.Enhance
        public static class Compound implements LocationStrategy {
            private final List<LocationStrategy> locationStrategies;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public Compound(LocationStrategy... locationStrategyArr) {
                this((List<? extends LocationStrategy>) Arrays.asList(locationStrategyArr));
            }

            @Override // net.bytebuddy.agent.builder.AgentBuilder.LocationStrategy
            public ClassFileLocator classFileLocator(@MaybeNull ClassLoader classLoader, @MaybeNull JavaModule javaModule) {
                ArrayList arrayList = new ArrayList(this.locationStrategies.size());
                Iterator<LocationStrategy> it = this.locationStrategies.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().classFileLocator(classLoader, javaModule));
                }
                return new ClassFileLocator.Compound(arrayList);
            }

            public boolean equals(@MaybeNull Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && getClass() == obj.getClass() && this.locationStrategies.equals(((Compound) obj).locationStrategies);
            }

            public int hashCode() {
                return (getClass().hashCode() * 31) + this.locationStrategies.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            public Compound(List<? extends LocationStrategy> list) {
                this.locationStrategies = new ArrayList();
                for (LocationStrategy locationStrategy : list) {
                    if (locationStrategy instanceof Compound) {
                        this.locationStrategies.addAll(((Compound) locationStrategy).locationStrategies);
                    } else if (!(locationStrategy instanceof NoOp)) {
                        this.locationStrategies.add(locationStrategy);
                    }
                }
            }
        }

        public enum ForClassLoader implements LocationStrategy {
            STRONG { // from class: net.bytebuddy.agent.builder.AgentBuilder.LocationStrategy.ForClassLoader.1
                @Override // net.bytebuddy.agent.builder.AgentBuilder.LocationStrategy
                public ClassFileLocator classFileLocator(@MaybeNull ClassLoader classLoader, @MaybeNull JavaModule javaModule) {
                    return ClassFileLocator.ForClassLoader.m5258of(classLoader);
                }
            },
            WEAK { // from class: net.bytebuddy.agent.builder.AgentBuilder.LocationStrategy.ForClassLoader.2
                @Override // net.bytebuddy.agent.builder.AgentBuilder.LocationStrategy
                public ClassFileLocator classFileLocator(@MaybeNull ClassLoader classLoader, @MaybeNull JavaModule javaModule) {
                    return ClassFileLocator.ForClassLoader.WeaklyReferenced.m5259of(classLoader);
                }
            };

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public LocationStrategy withFallbackTo(ClassFileLocator... classFileLocatorArr) {
                return withFallbackTo((Collection<? extends ClassFileLocator>) Arrays.asList(classFileLocatorArr));
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            public LocationStrategy withFallbackTo(Collection<? extends ClassFileLocator> collection) {
                ArrayList arrayList = new ArrayList(collection.size());
                Iterator<? extends ClassFileLocator> it = collection.iterator();
                while (it.hasNext()) {
                    arrayList.add(new Simple(it.next()));
                }
                return withFallbackTo((List<? extends LocationStrategy>) arrayList);
            }

            public LocationStrategy withFallbackTo(LocationStrategy... locationStrategyArr) {
                return withFallbackTo(Arrays.asList(locationStrategyArr));
            }

            public LocationStrategy withFallbackTo(List<? extends LocationStrategy> list) {
                ArrayList arrayList = new ArrayList(list.size() + 1);
                arrayList.add(this);
                arrayList.addAll(list);
                return new Compound(arrayList);
            }
        }

        public enum NoOp implements LocationStrategy {
            INSTANCE;

            @Override // net.bytebuddy.agent.builder.AgentBuilder.LocationStrategy
            public ClassFileLocator classFileLocator(@MaybeNull ClassLoader classLoader, @MaybeNull JavaModule javaModule) {
                return ClassFileLocator.NoOp.INSTANCE;
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class Simple implements LocationStrategy {
            private final ClassFileLocator classFileLocator;

            public Simple(ClassFileLocator classFileLocator) {
                this.classFileLocator = classFileLocator;
            }

            @Override // net.bytebuddy.agent.builder.AgentBuilder.LocationStrategy
            public ClassFileLocator classFileLocator(@MaybeNull ClassLoader classLoader, @MaybeNull JavaModule javaModule) {
                return this.classFileLocator;
            }

            public boolean equals(@MaybeNull Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && getClass() == obj.getClass() && this.classFileLocator.equals(((Simple) obj).classFileLocator);
            }

            public int hashCode() {
                return (getClass().hashCode() * 31) + this.classFileLocator.hashCode();
            }
        }

        ClassFileLocator classFileLocator(@MaybeNull ClassLoader classLoader, @MaybeNull JavaModule javaModule);
    }

    public interface Matchable<T extends Matchable<T>> {
        T and(RawMatcher rawMatcher);

        T and(ElementMatcher<? super TypeDescription> elementMatcher);

        T and(ElementMatcher<? super TypeDescription> elementMatcher, ElementMatcher<? super ClassLoader> elementMatcher2);

        T and(ElementMatcher<? super TypeDescription> elementMatcher, ElementMatcher<? super ClassLoader> elementMatcher2, ElementMatcher<? super JavaModule> elementMatcher3);

        /* JADX INFO: renamed from: or */
        T mo5128or(RawMatcher rawMatcher);

        /* JADX INFO: renamed from: or */
        T mo5125or(ElementMatcher<? super TypeDescription> elementMatcher);

        /* JADX INFO: renamed from: or */
        T mo5126or(ElementMatcher<? super TypeDescription> elementMatcher, ElementMatcher<? super ClassLoader> elementMatcher2);

        /* JADX INFO: renamed from: or */
        T mo5127or(ElementMatcher<? super TypeDescription> elementMatcher, ElementMatcher<? super ClassLoader> elementMatcher2, ElementMatcher<? super JavaModule> elementMatcher3);
    }

    public enum PatchMode {
        GAP { // from class: net.bytebuddy.agent.builder.AgentBuilder.PatchMode.1
            @Override // net.bytebuddy.agent.builder.AgentBuilder.PatchMode
            public Handler toHandler(ResettableClassFileTransformer resettableClassFileTransformer) {
                return new Handler.ForPatchWithGap(resettableClassFileTransformer);
            }
        },
        OVERLAP { // from class: net.bytebuddy.agent.builder.AgentBuilder.PatchMode.2
            @Override // net.bytebuddy.agent.builder.AgentBuilder.PatchMode
            public Handler toHandler(ResettableClassFileTransformer resettableClassFileTransformer) {
                return new Handler.ForPatchWithOverlap(resettableClassFileTransformer);
            }
        },
        SUBSTITUTE { // from class: net.bytebuddy.agent.builder.AgentBuilder.PatchMode.3
            @Override // net.bytebuddy.agent.builder.AgentBuilder.PatchMode
            public Handler toHandler(ResettableClassFileTransformer resettableClassFileTransformer) {
                if (resettableClassFileTransformer instanceof ResettableClassFileTransformer.Substitutable) {
                    return new Handler.ForPatchWithSubstitution((ResettableClassFileTransformer.Substitutable) resettableClassFileTransformer);
                }
                throw new IllegalArgumentException("Original class file transformer is not substitutable: " + resettableClassFileTransformer);
            }
        };

        public interface Handler {

            @HashCodeAndEqualsPlugin.Enhance
            public static class ForPatchWithGap implements Handler {
                private final ResettableClassFileTransformer classFileTransformer;

                public ForPatchWithGap(ResettableClassFileTransformer resettableClassFileTransformer) {
                    this.classFileTransformer = resettableClassFileTransformer;
                }

                public boolean equals(@MaybeNull Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return obj != null && getClass() == obj.getClass() && this.classFileTransformer.equals(((ForPatchWithGap) obj).classFileTransformer);
                }

                public int hashCode() {
                    return (getClass().hashCode() * 31) + this.classFileTransformer.hashCode();
                }

                @Override // net.bytebuddy.agent.builder.AgentBuilder.PatchMode.Handler
                public void onAfterRegistration(Instrumentation instrumentation) {
                }

                @Override // net.bytebuddy.agent.builder.AgentBuilder.PatchMode.Handler
                public void onBeforeRegistration(Instrumentation instrumentation) {
                    if (this.classFileTransformer.reset(instrumentation, RedefinitionStrategy.DISABLED)) {
                        return;
                    }
                    throw new IllegalArgumentException("Failed to deregister patched class file transformer: " + this.classFileTransformer);
                }

                @Override // net.bytebuddy.agent.builder.AgentBuilder.PatchMode.Handler
                public boolean onRegistration(ResettableClassFileTransformer resettableClassFileTransformer) {
                    return true;
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class ForPatchWithOverlap implements Handler {
                private final ResettableClassFileTransformer classFileTransformer;

                public ForPatchWithOverlap(ResettableClassFileTransformer resettableClassFileTransformer) {
                    this.classFileTransformer = resettableClassFileTransformer;
                }

                public boolean equals(@MaybeNull Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return obj != null && getClass() == obj.getClass() && this.classFileTransformer.equals(((ForPatchWithOverlap) obj).classFileTransformer);
                }

                public int hashCode() {
                    return (getClass().hashCode() * 31) + this.classFileTransformer.hashCode();
                }

                @Override // net.bytebuddy.agent.builder.AgentBuilder.PatchMode.Handler
                public void onAfterRegistration(Instrumentation instrumentation) {
                    if (this.classFileTransformer.reset(instrumentation, RedefinitionStrategy.DISABLED)) {
                        return;
                    }
                    throw new IllegalArgumentException("Failed to deregister patched class file transformer: " + this.classFileTransformer);
                }

                @Override // net.bytebuddy.agent.builder.AgentBuilder.PatchMode.Handler
                public void onBeforeRegistration(Instrumentation instrumentation) {
                }

                @Override // net.bytebuddy.agent.builder.AgentBuilder.PatchMode.Handler
                public boolean onRegistration(ResettableClassFileTransformer resettableClassFileTransformer) {
                    return true;
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class ForPatchWithSubstitution implements Handler {
                private final ResettableClassFileTransformer.Substitutable classFileTransformer;

                public ForPatchWithSubstitution(ResettableClassFileTransformer.Substitutable substitutable) {
                    this.classFileTransformer = substitutable;
                }

                public boolean equals(@MaybeNull Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return obj != null && getClass() == obj.getClass() && this.classFileTransformer.equals(((ForPatchWithSubstitution) obj).classFileTransformer);
                }

                public int hashCode() {
                    return (getClass().hashCode() * 31) + this.classFileTransformer.hashCode();
                }

                @Override // net.bytebuddy.agent.builder.AgentBuilder.PatchMode.Handler
                public void onAfterRegistration(Instrumentation instrumentation) {
                }

                @Override // net.bytebuddy.agent.builder.AgentBuilder.PatchMode.Handler
                public void onBeforeRegistration(Instrumentation instrumentation) {
                }

                @Override // net.bytebuddy.agent.builder.AgentBuilder.PatchMode.Handler
                public boolean onRegistration(ResettableClassFileTransformer resettableClassFileTransformer) {
                    this.classFileTransformer.substitute(resettableClassFileTransformer);
                    return false;
                }
            }

            public enum NoOp implements Handler {
                INSTANCE;

                @Override // net.bytebuddy.agent.builder.AgentBuilder.PatchMode.Handler
                public void onAfterRegistration(Instrumentation instrumentation) {
                }

                @Override // net.bytebuddy.agent.builder.AgentBuilder.PatchMode.Handler
                public void onBeforeRegistration(Instrumentation instrumentation) {
                }

                @Override // net.bytebuddy.agent.builder.AgentBuilder.PatchMode.Handler
                public boolean onRegistration(ResettableClassFileTransformer resettableClassFileTransformer) {
                    return true;
                }
            }

            void onAfterRegistration(Instrumentation instrumentation);

            void onBeforeRegistration(Instrumentation instrumentation);

            boolean onRegistration(ResettableClassFileTransformer resettableClassFileTransformer);
        }

        /* JADX INFO: renamed from: of */
        public static PatchMode m5133of(ResettableClassFileTransformer resettableClassFileTransformer) {
            return resettableClassFileTransformer instanceof ResettableClassFileTransformer.Substitutable ? SUBSTITUTE : OVERLAP;
        }

        public abstract Handler toHandler(ResettableClassFileTransformer resettableClassFileTransformer);
    }

    public interface PoolStrategy {

        public enum ClassLoading implements PoolStrategy {
            EXTENDED(TypePool.Default.ReaderMode.EXTENDED),
            FAST(TypePool.Default.ReaderMode.FAST);

            private final TypePool.Default.ReaderMode readerMode;

            ClassLoading(TypePool.Default.ReaderMode readerMode) {
                this.readerMode = readerMode;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // net.bytebuddy.agent.builder.AgentBuilder.PoolStrategy
            public TypePool typePool(ClassFileLocator classFileLocator, @MaybeNull ClassLoader classLoader) {
                return TypePool.ClassLoading.m5403of(classLoader, new TypePool.Default.WithLazyResolution(TypePool.CacheProvider.Simple.withObjectType(), classFileLocator, this.readerMode));
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            @Override // net.bytebuddy.agent.builder.AgentBuilder.PoolStrategy
            public TypePool typePool(ClassFileLocator classFileLocator, @MaybeNull ClassLoader classLoader, String str) {
                return typePool(classFileLocator, classLoader);
            }
        }

        public enum Default implements PoolStrategy {
            EXTENDED(TypePool.Default.ReaderMode.EXTENDED),
            FAST(TypePool.Default.ReaderMode.FAST);

            private final TypePool.Default.ReaderMode readerMode;

            Default(TypePool.Default.ReaderMode readerMode) {
                this.readerMode = readerMode;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // net.bytebuddy.agent.builder.AgentBuilder.PoolStrategy
            public TypePool typePool(ClassFileLocator classFileLocator, @MaybeNull ClassLoader classLoader) {
                return new TypePool.LazyFacade(new TypePool.Default.WithLazyResolution(TypePool.CacheProvider.Simple.withObjectType(), classFileLocator, this.readerMode));
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            @Override // net.bytebuddy.agent.builder.AgentBuilder.PoolStrategy
            public TypePool typePool(ClassFileLocator classFileLocator, @MaybeNull ClassLoader classLoader, String str) {
                return typePool(classFileLocator, classLoader);
            }
        }

        public enum Eager implements PoolStrategy {
            EXTENDED(TypePool.Default.ReaderMode.EXTENDED),
            FAST(TypePool.Default.ReaderMode.FAST);

            private final TypePool.Default.ReaderMode readerMode;

            Eager(TypePool.Default.ReaderMode readerMode) {
                this.readerMode = readerMode;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // net.bytebuddy.agent.builder.AgentBuilder.PoolStrategy
            public TypePool typePool(ClassFileLocator classFileLocator, @MaybeNull ClassLoader classLoader) {
                return new TypePool.Default(TypePool.CacheProvider.Simple.withObjectType(), classFileLocator, this.readerMode);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            @Override // net.bytebuddy.agent.builder.AgentBuilder.PoolStrategy
            public TypePool typePool(ClassFileLocator classFileLocator, @MaybeNull ClassLoader classLoader, String str) {
                return typePool(classFileLocator, classLoader);
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static abstract class WithTypePoolCache implements PoolStrategy {
            protected final TypePool.Default.ReaderMode readerMode;

            @HashCodeAndEqualsPlugin.Enhance
            public static class Simple extends WithTypePoolCache {
                private static final boolean ACCESS_CONTROLLER;
                private static final ClassLoader BOOTSTRAP_MARKER;
                private final ConcurrentMap<? super ClassLoader, TypePool.CacheProvider> cacheProviders;

                public enum BootstrapMarkerAction implements PrivilegedAction<ClassLoader> {
                    INSTANCE;

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
                    /* JADX DEBUG: Method merged with bridge method: run()Ljava/lang/Object; */
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // java.security.PrivilegedAction
                    public ClassLoader run() {
                        return new URLClassLoader(new URL[0], ClassLoadingStrategy.BOOTSTRAP_LOADER);
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
                    BOOTSTRAP_MARKER = (ClassLoader) doPrivileged(BootstrapMarkerAction.INSTANCE);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                public Simple(ConcurrentMap<? super ClassLoader, TypePool.CacheProvider> concurrentMap) {
                    this(TypePool.Default.ReaderMode.FAST, concurrentMap);
                }

                @AccessControllerPlugin.Enhance
                private static <T> T doPrivileged(PrivilegedAction<T> privilegedAction) {
                    return ACCESS_CONTROLLER ? (T) AccessController.doPrivileged(privilegedAction) : privilegedAction.run();
                }

                @Override // net.bytebuddy.agent.builder.AgentBuilder.PoolStrategy.WithTypePoolCache
                public boolean equals(@MaybeNull Object obj) {
                    if (!super.equals(obj)) {
                        return false;
                    }
                    if (this == obj) {
                        return true;
                    }
                    return obj != null && getClass() == obj.getClass() && this.cacheProviders.equals(((Simple) obj).cacheProviders);
                }

                public ClassLoader getBootstrapMarkerLoader() {
                    return BOOTSTRAP_MARKER;
                }

                @Override // net.bytebuddy.agent.builder.AgentBuilder.PoolStrategy.WithTypePoolCache
                public int hashCode() {
                    return (super.hashCode() * 31) + this.cacheProviders.hashCode();
                }

                @Override // net.bytebuddy.agent.builder.AgentBuilder.PoolStrategy.WithTypePoolCache
                public TypePool.CacheProvider locate(@MaybeNull ClassLoader classLoader) {
                    if (classLoader == null) {
                        classLoader = getBootstrapMarkerLoader();
                    }
                    TypePool.CacheProvider cacheProviderWithObjectType = this.cacheProviders.get(classLoader);
                    while (cacheProviderWithObjectType == null) {
                        cacheProviderWithObjectType = TypePool.CacheProvider.Simple.withObjectType();
                        TypePool.CacheProvider cacheProviderPutIfAbsent = this.cacheProviders.putIfAbsent(classLoader, cacheProviderWithObjectType);
                        if (cacheProviderPutIfAbsent != null) {
                            cacheProviderWithObjectType = cacheProviderPutIfAbsent;
                        }
                    }
                    return cacheProviderWithObjectType;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
                public Simple(TypePool.Default.ReaderMode readerMode, ConcurrentMap<? super ClassLoader, TypePool.CacheProvider> concurrentMap) {
                    super(readerMode);
                    this.cacheProviders = concurrentMap;
                }
            }

            public WithTypePoolCache(TypePool.Default.ReaderMode readerMode) {
                this.readerMode = readerMode;
            }

            public boolean equals(@MaybeNull Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && getClass() == obj.getClass() && this.readerMode.equals(((WithTypePoolCache) obj).readerMode);
            }

            public int hashCode() {
                return (getClass().hashCode() * 31) + this.readerMode.hashCode();
            }

            public abstract TypePool.CacheProvider locate(@MaybeNull ClassLoader classLoader);

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // net.bytebuddy.agent.builder.AgentBuilder.PoolStrategy
            public TypePool typePool(ClassFileLocator classFileLocator, @MaybeNull ClassLoader classLoader) {
                return new TypePool.LazyFacade(new TypePool.Default.WithLazyResolution(locate(classLoader), classFileLocator, this.readerMode));
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            @Override // net.bytebuddy.agent.builder.AgentBuilder.PoolStrategy
            public TypePool typePool(ClassFileLocator classFileLocator, @MaybeNull ClassLoader classLoader, String str) {
                return new TypePool.LazyFacade(new TypePool.Default.WithLazyResolution(new TypePool.CacheProvider.Discriminating(ElementMatchers.m5390is(str), new TypePool.CacheProvider.Simple(), locate(classLoader)), classFileLocator, this.readerMode));
            }
        }

        TypePool typePool(ClassFileLocator classFileLocator, @MaybeNull ClassLoader classLoader);

        TypePool typePool(ClassFileLocator classFileLocator, @MaybeNull ClassLoader classLoader, String str);
    }

    public interface RawMatcher {

        @HashCodeAndEqualsPlugin.Enhance
        public static class Conjunction implements RawMatcher {
            private final List<RawMatcher> matchers;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public Conjunction(RawMatcher... rawMatcherArr) {
                this((List<? extends RawMatcher>) Arrays.asList(rawMatcherArr));
            }

            public boolean equals(@MaybeNull Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && getClass() == obj.getClass() && this.matchers.equals(((Conjunction) obj).matchers);
            }

            public int hashCode() {
                return (getClass().hashCode() * 31) + this.matchers.hashCode();
            }

            @Override // net.bytebuddy.agent.builder.AgentBuilder.RawMatcher
            public boolean matches(TypeDescription typeDescription, @MaybeNull ClassLoader classLoader, @MaybeNull JavaModule javaModule, @MaybeNull Class<?> cls, ProtectionDomain protectionDomain) {
                Iterator<RawMatcher> it = this.matchers.iterator();
                while (it.hasNext()) {
                    if (!it.next().matches(typeDescription, classLoader, javaModule, cls, protectionDomain)) {
                        return false;
                    }
                }
                return true;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            public Conjunction(List<? extends RawMatcher> list) {
                this.matchers = new ArrayList(list.size());
                for (RawMatcher rawMatcher : list) {
                    if (rawMatcher instanceof Conjunction) {
                        this.matchers.addAll(((Conjunction) rawMatcher).matchers);
                    } else if (rawMatcher != Trivial.MATCHING) {
                        this.matchers.add(rawMatcher);
                    }
                }
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class Disjunction implements RawMatcher {
            private final List<RawMatcher> matchers;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public Disjunction(RawMatcher... rawMatcherArr) {
                this((List<? extends RawMatcher>) Arrays.asList(rawMatcherArr));
            }

            public boolean equals(@MaybeNull Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && getClass() == obj.getClass() && this.matchers.equals(((Disjunction) obj).matchers);
            }

            public int hashCode() {
                return (getClass().hashCode() * 31) + this.matchers.hashCode();
            }

            @Override // net.bytebuddy.agent.builder.AgentBuilder.RawMatcher
            public boolean matches(TypeDescription typeDescription, @MaybeNull ClassLoader classLoader, @MaybeNull JavaModule javaModule, @MaybeNull Class<?> cls, ProtectionDomain protectionDomain) {
                Iterator<RawMatcher> it = this.matchers.iterator();
                while (it.hasNext()) {
                    if (it.next().matches(typeDescription, classLoader, javaModule, cls, protectionDomain)) {
                        return true;
                    }
                }
                return false;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            public Disjunction(List<? extends RawMatcher> list) {
                this.matchers = new ArrayList(list.size());
                for (RawMatcher rawMatcher : list) {
                    if (rawMatcher instanceof Disjunction) {
                        this.matchers.addAll(((Disjunction) rawMatcher).matchers);
                    } else if (rawMatcher != Trivial.NON_MATCHING) {
                        this.matchers.add(rawMatcher);
                    }
                }
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class ForElementMatchers implements RawMatcher {
            private final ElementMatcher<? super ClassLoader> classLoaderMatcher;
            private final ElementMatcher<? super JavaModule> moduleMatcher;
            private final ElementMatcher<? super TypeDescription> typeMatcher;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public ForElementMatchers(ElementMatcher<? super TypeDescription> elementMatcher) {
                this(elementMatcher, ElementMatchers.any());
            }

            public boolean equals(@MaybeNull Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                ForElementMatchers forElementMatchers = (ForElementMatchers) obj;
                return this.typeMatcher.equals(forElementMatchers.typeMatcher) && this.classLoaderMatcher.equals(forElementMatchers.classLoaderMatcher) && this.moduleMatcher.equals(forElementMatchers.moduleMatcher);
            }

            public int hashCode() {
                return (((((getClass().hashCode() * 31) + this.typeMatcher.hashCode()) * 31) + this.classLoaderMatcher.hashCode()) * 31) + this.moduleMatcher.hashCode();
            }

            @Override // net.bytebuddy.agent.builder.AgentBuilder.RawMatcher
            public boolean matches(TypeDescription typeDescription, @MaybeNull ClassLoader classLoader, @MaybeNull JavaModule javaModule, @MaybeNull Class<?> cls, ProtectionDomain protectionDomain) {
                return this.moduleMatcher.matches(javaModule) && this.classLoaderMatcher.matches(classLoader) && this.typeMatcher.matches(typeDescription);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            public ForElementMatchers(ElementMatcher<? super TypeDescription> elementMatcher, ElementMatcher<? super ClassLoader> elementMatcher2) {
                this(elementMatcher, elementMatcher2, ElementMatchers.any());
            }

            public ForElementMatchers(ElementMatcher<? super TypeDescription> elementMatcher, ElementMatcher<? super ClassLoader> elementMatcher2, ElementMatcher<? super JavaModule> elementMatcher3) {
                this.typeMatcher = elementMatcher;
                this.classLoaderMatcher = elementMatcher2;
                this.moduleMatcher = elementMatcher3;
            }
        }

        public enum ForLoadState implements RawMatcher {
            LOADED(false),
            UNLOADED(true);

            private final boolean unloaded;

            ForLoadState(boolean z) {
                this.unloaded = z;
            }

            @Override // net.bytebuddy.agent.builder.AgentBuilder.RawMatcher
            public boolean matches(TypeDescription typeDescription, @MaybeNull ClassLoader classLoader, @MaybeNull JavaModule javaModule, @MaybeNull Class<?> cls, ProtectionDomain protectionDomain) {
                return (cls == null) == this.unloaded;
            }
        }

        public enum ForResolvableTypes implements RawMatcher {
            INSTANCE;

            public RawMatcher inverted() {
                return new Inversion(this);
            }

            @Override // net.bytebuddy.agent.builder.AgentBuilder.RawMatcher
            public boolean matches(TypeDescription typeDescription, @MaybeNull ClassLoader classLoader, @MaybeNull JavaModule javaModule, @MaybeNull Class<?> cls, ProtectionDomain protectionDomain) {
                if (cls == null) {
                    return true;
                }
                try {
                    return Class.forName(cls.getName(), true, classLoader) == cls;
                } catch (Throwable unused) {
                    return false;
                }
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class Inversion implements RawMatcher {
            private final RawMatcher matcher;

            public Inversion(RawMatcher rawMatcher) {
                this.matcher = rawMatcher;
            }

            public boolean equals(@MaybeNull Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && getClass() == obj.getClass() && this.matcher.equals(((Inversion) obj).matcher);
            }

            public int hashCode() {
                return (getClass().hashCode() * 31) + this.matcher.hashCode();
            }

            @Override // net.bytebuddy.agent.builder.AgentBuilder.RawMatcher
            public boolean matches(TypeDescription typeDescription, @MaybeNull ClassLoader classLoader, @MaybeNull JavaModule javaModule, @MaybeNull Class<?> cls, ProtectionDomain protectionDomain) {
                return !this.matcher.matches(typeDescription, classLoader, javaModule, cls, protectionDomain);
            }
        }

        public enum Trivial implements RawMatcher {
            MATCHING(true),
            NON_MATCHING(false);

            private final boolean matches;

            Trivial(boolean z) {
                this.matches = z;
            }

            @Override // net.bytebuddy.agent.builder.AgentBuilder.RawMatcher
            public boolean matches(TypeDescription typeDescription, @MaybeNull ClassLoader classLoader, @MaybeNull JavaModule javaModule, @MaybeNull Class<?> cls, ProtectionDomain protectionDomain) {
                return this.matches;
            }
        }

        boolean matches(TypeDescription typeDescription, @MaybeNull ClassLoader classLoader, @MaybeNull JavaModule javaModule, @MaybeNull Class<?> cls, ProtectionDomain protectionDomain);
    }

    public interface RedefinitionListenable extends AgentBuilder {

        public interface ResubmissionImmediateMatcher {

            @HashCodeAndEqualsPlugin.Enhance
            public static class Conjunction implements ResubmissionImmediateMatcher {
                private final List<ResubmissionImmediateMatcher> matchers;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                public Conjunction(ResubmissionImmediateMatcher... resubmissionImmediateMatcherArr) {
                    this((List<? extends ResubmissionImmediateMatcher>) Arrays.asList(resubmissionImmediateMatcherArr));
                }

                public boolean equals(@MaybeNull Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return obj != null && getClass() == obj.getClass() && this.matchers.equals(((Conjunction) obj).matchers);
                }

                public int hashCode() {
                    return (getClass().hashCode() * 31) + this.matchers.hashCode();
                }

                @Override // net.bytebuddy.agent.builder.AgentBuilder.RedefinitionListenable.ResubmissionImmediateMatcher
                public boolean matches(String str, @MaybeNull ClassLoader classLoader, @MaybeNull JavaModule javaModule) {
                    Iterator<ResubmissionImmediateMatcher> it = this.matchers.iterator();
                    while (it.hasNext()) {
                        if (!it.next().matches(str, classLoader, javaModule)) {
                            return false;
                        }
                    }
                    return true;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
                public Conjunction(List<? extends ResubmissionImmediateMatcher> list) {
                    this.matchers = new ArrayList(list.size());
                    for (ResubmissionImmediateMatcher resubmissionImmediateMatcher : list) {
                        if (resubmissionImmediateMatcher instanceof Conjunction) {
                            this.matchers.addAll(((Conjunction) resubmissionImmediateMatcher).matchers);
                        } else if (resubmissionImmediateMatcher != Trivial.NON_MATCHING) {
                            this.matchers.add(resubmissionImmediateMatcher);
                        }
                    }
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class Disjunction implements ResubmissionImmediateMatcher {
                private final List<ResubmissionImmediateMatcher> matchers;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                public Disjunction(ResubmissionImmediateMatcher... resubmissionImmediateMatcherArr) {
                    this((List<? extends ResubmissionImmediateMatcher>) Arrays.asList(resubmissionImmediateMatcherArr));
                }

                public boolean equals(@MaybeNull Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return obj != null && getClass() == obj.getClass() && this.matchers.equals(((Disjunction) obj).matchers);
                }

                public int hashCode() {
                    return (getClass().hashCode() * 31) + this.matchers.hashCode();
                }

                @Override // net.bytebuddy.agent.builder.AgentBuilder.RedefinitionListenable.ResubmissionImmediateMatcher
                public boolean matches(String str, @MaybeNull ClassLoader classLoader, @MaybeNull JavaModule javaModule) {
                    Iterator<ResubmissionImmediateMatcher> it = this.matchers.iterator();
                    while (it.hasNext()) {
                        if (it.next().matches(str, classLoader, javaModule)) {
                            return true;
                        }
                    }
                    return false;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
                public Disjunction(List<? extends ResubmissionImmediateMatcher> list) {
                    this.matchers = new ArrayList(list.size());
                    for (ResubmissionImmediateMatcher resubmissionImmediateMatcher : list) {
                        if (resubmissionImmediateMatcher instanceof Disjunction) {
                            this.matchers.addAll(((Disjunction) resubmissionImmediateMatcher).matchers);
                        } else if (resubmissionImmediateMatcher != Trivial.NON_MATCHING) {
                            this.matchers.add(resubmissionImmediateMatcher);
                        }
                    }
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class ForElementMatchers implements ResubmissionImmediateMatcher {
                private final ElementMatcher<? super ClassLoader> classLoaderMatcher;
                private final ElementMatcher<? super JavaModule> moduleMatcher;
                private final ElementMatcher<String> typeNameMatcher;

                public ForElementMatchers(ElementMatcher<String> elementMatcher, ElementMatcher<? super ClassLoader> elementMatcher2, ElementMatcher<? super JavaModule> elementMatcher3) {
                    this.typeNameMatcher = elementMatcher;
                    this.classLoaderMatcher = elementMatcher2;
                    this.moduleMatcher = elementMatcher3;
                }

                public boolean equals(@MaybeNull Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj == null || getClass() != obj.getClass()) {
                        return false;
                    }
                    ForElementMatchers forElementMatchers = (ForElementMatchers) obj;
                    return this.typeNameMatcher.equals(forElementMatchers.typeNameMatcher) && this.classLoaderMatcher.equals(forElementMatchers.classLoaderMatcher) && this.moduleMatcher.equals(forElementMatchers.moduleMatcher);
                }

                public int hashCode() {
                    return (((((getClass().hashCode() * 31) + this.typeNameMatcher.hashCode()) * 31) + this.classLoaderMatcher.hashCode()) * 31) + this.moduleMatcher.hashCode();
                }

                @Override // net.bytebuddy.agent.builder.AgentBuilder.RedefinitionListenable.ResubmissionImmediateMatcher
                public boolean matches(String str, @MaybeNull ClassLoader classLoader, @MaybeNull JavaModule javaModule) {
                    return this.typeNameMatcher.matches(str) && this.classLoaderMatcher.matches(classLoader) && this.moduleMatcher.matches(javaModule);
                }
            }

            public enum Trivial implements ResubmissionImmediateMatcher {
                MATCHING(true),
                NON_MATCHING(false);

                private final boolean matching;

                Trivial(boolean z) {
                    this.matching = z;
                }

                @Override // net.bytebuddy.agent.builder.AgentBuilder.RedefinitionListenable.ResubmissionImmediateMatcher
                public boolean matches(String str, @MaybeNull ClassLoader classLoader, @MaybeNull JavaModule javaModule) {
                    return this.matching;
                }
            }

            boolean matches(String str, @MaybeNull ClassLoader classLoader, @MaybeNull JavaModule javaModule);
        }

        public interface ResubmissionOnErrorMatcher {

            @HashCodeAndEqualsPlugin.Enhance
            public static class Conjunction implements ResubmissionOnErrorMatcher {
                private final List<ResubmissionOnErrorMatcher> matchers;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                public Conjunction(ResubmissionOnErrorMatcher... resubmissionOnErrorMatcherArr) {
                    this((List<? extends ResubmissionOnErrorMatcher>) Arrays.asList(resubmissionOnErrorMatcherArr));
                }

                public boolean equals(@MaybeNull Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return obj != null && getClass() == obj.getClass() && this.matchers.equals(((Conjunction) obj).matchers);
                }

                public int hashCode() {
                    return (getClass().hashCode() * 31) + this.matchers.hashCode();
                }

                @Override // net.bytebuddy.agent.builder.AgentBuilder.RedefinitionListenable.ResubmissionOnErrorMatcher
                public boolean matches(Throwable th, String str, @MaybeNull ClassLoader classLoader, @MaybeNull JavaModule javaModule) {
                    Iterator<ResubmissionOnErrorMatcher> it = this.matchers.iterator();
                    while (it.hasNext()) {
                        if (!it.next().matches(th, str, classLoader, javaModule)) {
                            return false;
                        }
                    }
                    return true;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
                public Conjunction(List<? extends ResubmissionOnErrorMatcher> list) {
                    this.matchers = new ArrayList(list.size());
                    for (ResubmissionOnErrorMatcher resubmissionOnErrorMatcher : list) {
                        if (resubmissionOnErrorMatcher instanceof Conjunction) {
                            this.matchers.addAll(((Conjunction) resubmissionOnErrorMatcher).matchers);
                        } else if (resubmissionOnErrorMatcher != Trivial.MATCHING) {
                            this.matchers.add(resubmissionOnErrorMatcher);
                        }
                    }
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class Disjunction implements ResubmissionOnErrorMatcher {
                private final List<ResubmissionOnErrorMatcher> matchers;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                public Disjunction(ResubmissionOnErrorMatcher... resubmissionOnErrorMatcherArr) {
                    this((List<? extends ResubmissionOnErrorMatcher>) Arrays.asList(resubmissionOnErrorMatcherArr));
                }

                public boolean equals(@MaybeNull Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return obj != null && getClass() == obj.getClass() && this.matchers.equals(((Disjunction) obj).matchers);
                }

                public int hashCode() {
                    return (getClass().hashCode() * 31) + this.matchers.hashCode();
                }

                @Override // net.bytebuddy.agent.builder.AgentBuilder.RedefinitionListenable.ResubmissionOnErrorMatcher
                public boolean matches(Throwable th, String str, @MaybeNull ClassLoader classLoader, @MaybeNull JavaModule javaModule) {
                    Iterator<ResubmissionOnErrorMatcher> it = this.matchers.iterator();
                    while (it.hasNext()) {
                        if (it.next().matches(th, str, classLoader, javaModule)) {
                            return true;
                        }
                    }
                    return false;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
                public Disjunction(List<? extends ResubmissionOnErrorMatcher> list) {
                    this.matchers = new ArrayList(list.size());
                    for (ResubmissionOnErrorMatcher resubmissionOnErrorMatcher : list) {
                        if (resubmissionOnErrorMatcher instanceof Disjunction) {
                            this.matchers.addAll(((Disjunction) resubmissionOnErrorMatcher).matchers);
                        } else if (resubmissionOnErrorMatcher != Trivial.NON_MATCHING) {
                            this.matchers.add(resubmissionOnErrorMatcher);
                        }
                    }
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class ForElementMatchers implements ResubmissionOnErrorMatcher {
                private final ElementMatcher<? super ClassLoader> classLoaderMatcher;
                private final ElementMatcher<? super Throwable> exceptionMatcher;
                private final ElementMatcher<? super JavaModule> moduleMatcher;
                private final ElementMatcher<String> typeNameMatcher;

                public ForElementMatchers(ElementMatcher<? super Throwable> elementMatcher, ElementMatcher<String> elementMatcher2, ElementMatcher<? super ClassLoader> elementMatcher3, ElementMatcher<? super JavaModule> elementMatcher4) {
                    this.exceptionMatcher = elementMatcher;
                    this.typeNameMatcher = elementMatcher2;
                    this.classLoaderMatcher = elementMatcher3;
                    this.moduleMatcher = elementMatcher4;
                }

                public boolean equals(@MaybeNull Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj == null || getClass() != obj.getClass()) {
                        return false;
                    }
                    ForElementMatchers forElementMatchers = (ForElementMatchers) obj;
                    return this.exceptionMatcher.equals(forElementMatchers.exceptionMatcher) && this.typeNameMatcher.equals(forElementMatchers.typeNameMatcher) && this.classLoaderMatcher.equals(forElementMatchers.classLoaderMatcher) && this.moduleMatcher.equals(forElementMatchers.moduleMatcher);
                }

                public int hashCode() {
                    return (((((((getClass().hashCode() * 31) + this.exceptionMatcher.hashCode()) * 31) + this.typeNameMatcher.hashCode()) * 31) + this.classLoaderMatcher.hashCode()) * 31) + this.moduleMatcher.hashCode();
                }

                @Override // net.bytebuddy.agent.builder.AgentBuilder.RedefinitionListenable.ResubmissionOnErrorMatcher
                public boolean matches(Throwable th, String str, @MaybeNull ClassLoader classLoader, @MaybeNull JavaModule javaModule) {
                    return this.exceptionMatcher.matches(th) && this.typeNameMatcher.matches(str) && this.classLoaderMatcher.matches(classLoader) && this.moduleMatcher.matches(javaModule);
                }
            }

            public enum Trivial implements ResubmissionOnErrorMatcher {
                MATCHING(true),
                NON_MATCHING(false);

                private final boolean matching;

                Trivial(boolean z) {
                    this.matching = z;
                }

                @Override // net.bytebuddy.agent.builder.AgentBuilder.RedefinitionListenable.ResubmissionOnErrorMatcher
                public boolean matches(Throwable th, String str, @MaybeNull ClassLoader classLoader, @MaybeNull JavaModule javaModule) {
                    return this.matching;
                }
            }

            boolean matches(Throwable th, String str, @MaybeNull ClassLoader classLoader, @MaybeNull JavaModule javaModule);
        }

        public interface WithImplicitDiscoveryStrategy extends RedefinitionListenable {
            RedefinitionListenable redefineOnly(Class<?>... clsArr);

            RedefinitionListenable with(RedefinitionStrategy.DiscoveryStrategy discoveryStrategy);
        }

        public interface WithResubmissionSpecification extends WithoutResubmissionSpecification, AgentBuilder {
        }

        public interface WithoutBatchStrategy extends WithImplicitDiscoveryStrategy {
            WithImplicitDiscoveryStrategy with(RedefinitionStrategy.BatchAllocator batchAllocator);
        }

        public interface WithoutResubmissionSpecification {
            WithResubmissionSpecification resubmitImmediate();

            WithResubmissionSpecification resubmitImmediate(ResubmissionImmediateMatcher resubmissionImmediateMatcher);

            WithResubmissionSpecification resubmitImmediate(ElementMatcher<String> elementMatcher);

            WithResubmissionSpecification resubmitImmediate(ElementMatcher<String> elementMatcher, ElementMatcher<? super ClassLoader> elementMatcher2);

            WithResubmissionSpecification resubmitImmediate(ElementMatcher<String> elementMatcher, ElementMatcher<? super ClassLoader> elementMatcher2, ElementMatcher<? super JavaModule> elementMatcher3);

            WithResubmissionSpecification resubmitOnError();

            WithResubmissionSpecification resubmitOnError(ResubmissionOnErrorMatcher resubmissionOnErrorMatcher);

            WithResubmissionSpecification resubmitOnError(ElementMatcher<? super Throwable> elementMatcher);

            WithResubmissionSpecification resubmitOnError(ElementMatcher<? super Throwable> elementMatcher, ElementMatcher<String> elementMatcher2);

            WithResubmissionSpecification resubmitOnError(ElementMatcher<? super Throwable> elementMatcher, ElementMatcher<String> elementMatcher2, ElementMatcher<? super ClassLoader> elementMatcher3);

            WithResubmissionSpecification resubmitOnError(ElementMatcher<? super Throwable> elementMatcher, ElementMatcher<String> elementMatcher2, ElementMatcher<? super ClassLoader> elementMatcher3, ElementMatcher<? super JavaModule> elementMatcher4);
        }

        RedefinitionListenable with(RedefinitionStrategy.Listener listener);

        WithoutResubmissionSpecification withResubmission(RedefinitionStrategy.ResubmissionScheduler resubmissionScheduler);
    }

    public enum RedefinitionStrategy {
        DISABLED(0 == true ? 1 : 0, 0 == true ? 1 : 0) { // from class: net.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.1
            @Override // net.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy
            public void apply(Instrumentation instrumentation, PoolStrategy poolStrategy, LocationStrategy locationStrategy, DescriptionStrategy descriptionStrategy, FallbackStrategy fallbackStrategy, DiscoveryStrategy discoveryStrategy, LambdaInstrumentationStrategy lambdaInstrumentationStrategy, Listener listener, Listener listener2, RawMatcher rawMatcher, BatchAllocator batchAllocator, CircularityLock circularityLock) {
            }

            @Override // net.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy
            public void check(Instrumentation instrumentation) {
                throw new IllegalStateException("Cannot apply redefinition on disabled strategy");
            }

            @Override // net.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy
            public Collector make(PoolStrategy poolStrategy, LocationStrategy locationStrategy, DescriptionStrategy descriptionStrategy, FallbackStrategy fallbackStrategy, Listener listener, RawMatcher rawMatcher, CircularityLock circularityLock) {
                throw new IllegalStateException("A disabled redefinition strategy cannot create a collector");
            }
        },
        REDEFINITION(1 == true ? 1 : 0, 0 == true ? 1 : 0) { // from class: net.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.2
            @Override // net.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy
            public void check(Instrumentation instrumentation) {
                if (instrumentation.isRedefineClassesSupported()) {
                    return;
                }
                throw new IllegalStateException("Cannot apply redefinition on " + instrumentation);
            }

            @Override // net.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy
            public Collector make(PoolStrategy poolStrategy, LocationStrategy locationStrategy, DescriptionStrategy descriptionStrategy, FallbackStrategy fallbackStrategy, Listener listener, RawMatcher rawMatcher, CircularityLock circularityLock) {
                return new Collector.ForRedefinition(rawMatcher, poolStrategy, locationStrategy, descriptionStrategy, listener, fallbackStrategy, circularityLock);
            }
        },
        RETRANSFORMATION(1 == true ? 1 : 0, 1 == true ? 1 : 0) { // from class: net.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.3
            @Override // net.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy
            public void check(Instrumentation instrumentation) {
                if (RedefinitionStrategy.DISPATCHER.isRetransformClassesSupported(instrumentation)) {
                    return;
                }
                throw new IllegalStateException("Cannot apply retransformation on " + instrumentation);
            }

            @Override // net.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy
            public Collector make(PoolStrategy poolStrategy, LocationStrategy locationStrategy, DescriptionStrategy descriptionStrategy, FallbackStrategy fallbackStrategy, Listener listener, RawMatcher rawMatcher, CircularityLock circularityLock) {
                return new Collector.ForRetransformation(rawMatcher, poolStrategy, locationStrategy, descriptionStrategy, listener, fallbackStrategy, circularityLock);
            }
        };

        protected static final Dispatcher DISPATCHER = (Dispatcher) Default.doPrivileged(JavaDispatcher.m5432of(Dispatcher.class));
        private final boolean enabled;
        private final boolean retransforming;

        public interface BatchAllocator {
            public static final int FIRST_BATCH = 0;

            @HashCodeAndEqualsPlugin.Enhance
            public static class ForFixedSize implements BatchAllocator {
                private final int size;

                public ForFixedSize(int i) {
                    this.size = i;
                }

                public static BatchAllocator ofSize(int i) {
                    if (i > 0) {
                        return new ForFixedSize(i);
                    }
                    if (i == 0) {
                        return ForTotal.INSTANCE;
                    }
                    throw new IllegalArgumentException("Cannot define a batch with a negative size: " + i);
                }

                @Override // net.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.BatchAllocator
                public Iterable<? extends List<Class<?>>> batch(List<Class<?>> list) {
                    ArrayList arrayList = new ArrayList();
                    int i = 0;
                    while (i < list.size()) {
                        arrayList.add(new ArrayList(list.subList(i, Math.min(list.size(), this.size + i))));
                        i += this.size;
                    }
                    return arrayList;
                }

                public boolean equals(@MaybeNull Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return obj != null && getClass() == obj.getClass() && this.size == ((ForFixedSize) obj).size;
                }

                public int hashCode() {
                    return (getClass().hashCode() * 31) + this.size;
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class ForMatchedGrouping implements BatchAllocator {
                private final Collection<? extends ElementMatcher<? super TypeDescription>> matchers;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                public ForMatchedGrouping(ElementMatcher<? super TypeDescription>... elementMatcherArr) {
                    this(new LinkedHashSet(Arrays.asList(elementMatcherArr)));
                }

                @Override // net.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.BatchAllocator
                public Iterable<? extends List<Class<?>>> batch(List<Class<?>> list) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    ArrayList arrayList = new ArrayList();
                    Iterator<? extends ElementMatcher<? super TypeDescription>> it = this.matchers.iterator();
                    while (it.hasNext()) {
                        linkedHashMap.put(it.next(), new ArrayList());
                    }
                    for (Class<?> cls : list) {
                        Iterator<? extends ElementMatcher<? super TypeDescription>> it2 = this.matchers.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                arrayList.add(cls);
                                break;
                            }
                            ElementMatcher<? super TypeDescription> next = it2.next();
                            if (next.matches(TypeDescription.ForLoadedType.m5238of(cls))) {
                                ((List) linkedHashMap.get(next)).add(cls);
                                break;
                            }
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(this.matchers.size() + 1);
                    for (List list2 : linkedHashMap.values()) {
                        if (!list2.isEmpty()) {
                            arrayList2.add(list2);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        arrayList2.add(arrayList);
                    }
                    return arrayList2;
                }

                public boolean equals(@MaybeNull Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return obj != null && getClass() == obj.getClass() && this.matchers.equals(((ForMatchedGrouping) obj).matchers);
                }

                public int hashCode() {
                    return (getClass().hashCode() * 31) + this.matchers.hashCode();
                }

                public BatchAllocator withMaximum(int i) {
                    return Slicing.withMaximum(i, this);
                }

                public BatchAllocator withMinimum(int i) {
                    return Slicing.withMinimum(i, this);
                }

                public BatchAllocator withinRange(int i, int i2) {
                    return Slicing.withinRange(i, i2, this);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
                public ForMatchedGrouping(Collection<? extends ElementMatcher<? super TypeDescription>> collection) {
                    this.matchers = collection;
                }
            }

            public enum ForTotal implements BatchAllocator {
                INSTANCE;

                @Override // net.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.BatchAllocator
                public Iterable<? extends List<Class<?>>> batch(List<Class<?>> list) {
                    return list.isEmpty() ? Collections.emptySet() : Collections.singleton(list);
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class Partitioning implements BatchAllocator {
                private final int parts;

                public Partitioning(int i) {
                    this.parts = i;
                }

                /* JADX INFO: renamed from: of */
                public static BatchAllocator m5134of(int i) {
                    if (i >= 1) {
                        return new Partitioning(i);
                    }
                    throw new IllegalArgumentException("A batch size must be positive: " + i);
                }

                @Override // net.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.BatchAllocator
                public Iterable<? extends List<Class<?>>> batch(List<Class<?>> list) {
                    if (list.isEmpty()) {
                        return Collections.emptyList();
                    }
                    ArrayList arrayList = new ArrayList();
                    int size = list.size() / this.parts;
                    int size2 = list.size() % this.parts;
                    int i = size2;
                    while (i < list.size()) {
                        int i2 = i + size;
                        arrayList.add(new ArrayList(list.subList(i, i2)));
                        i = i2;
                    }
                    if (arrayList.isEmpty()) {
                        return Collections.singletonList(list);
                    }
                    ((List) arrayList.get(0)).addAll(0, list.subList(0, size2));
                    return arrayList;
                }

                public boolean equals(@MaybeNull Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return obj != null && getClass() == obj.getClass() && this.parts == ((Partitioning) obj).parts;
                }

                public int hashCode() {
                    return (getClass().hashCode() * 31) + this.parts;
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class Slicing implements BatchAllocator {
                private final BatchAllocator batchAllocator;
                private final int maximum;
                private final int minimum;

                public static class SlicingIterable implements Iterable<List<Class<?>>> {
                    private final Iterable<? extends List<Class<?>>> iterable;
                    private final int maximum;
                    private final int minimum;

                    public static class SlicingIterator implements Iterator<List<Class<?>>> {
                        private List<Class<?>> buffer = new ArrayList();
                        private final Iterator<? extends List<Class<?>>> iterator;
                        private final int maximum;
                        private final int minimum;

                        public SlicingIterator(int i, int i2, Iterator<? extends List<Class<?>>> it) {
                            this.minimum = i;
                            this.maximum = i2;
                            this.iterator = it;
                        }

                        @Override // java.util.Iterator
                        public boolean hasNext() {
                            return !this.buffer.isEmpty() || this.iterator.hasNext();
                        }

                        @Override // java.util.Iterator
                        public void remove() {
                            throw new UnsupportedOperationException("remove");
                        }

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
                        /* JADX DEBUG: Method merged with bridge method: next()Ljava/lang/Object; */
                        @Override // java.util.Iterator
                        public List<Class<?>> next() {
                            if (this.buffer.isEmpty()) {
                                this.buffer = this.iterator.next();
                            }
                            while (this.buffer.size() < this.minimum && this.iterator.hasNext()) {
                                this.buffer.addAll(this.iterator.next());
                            }
                            int size = this.buffer.size();
                            int i = this.maximum;
                            if (size <= i) {
                                try {
                                    return this.buffer;
                                } finally {
                                    this.buffer = new ArrayList();
                                }
                            }
                            try {
                                return this.buffer.subList(0, i);
                            } finally {
                                List<Class<?>> list = this.buffer;
                                this.buffer = new ArrayList(list.subList(this.maximum, list.size()));
                            }
                        }
                    }

                    public SlicingIterable(int i, int i2, Iterable<? extends List<Class<?>>> iterable) {
                        this.minimum = i;
                        this.maximum = i2;
                        this.iterable = iterable;
                    }

                    @Override // java.lang.Iterable
                    public Iterator<List<Class<?>>> iterator() {
                        return new SlicingIterator(this.minimum, this.maximum, this.iterable.iterator());
                    }
                }

                public Slicing(int i, int i2, BatchAllocator batchAllocator) {
                    this.minimum = i;
                    this.maximum = i2;
                    this.batchAllocator = batchAllocator;
                }

                public static BatchAllocator withMaximum(int i, BatchAllocator batchAllocator) {
                    return withinRange(1, i, batchAllocator);
                }

                public static BatchAllocator withMinimum(int i, BatchAllocator batchAllocator) {
                    return withinRange(i, Integer.MAX_VALUE, batchAllocator);
                }

                public static BatchAllocator withinRange(int i, int i2, BatchAllocator batchAllocator) {
                    if (i <= 0) {
                        throw new IllegalArgumentException("Minimum must be a positive number: " + i);
                    }
                    if (i <= i2) {
                        return new Slicing(i, i2, batchAllocator);
                    }
                    throw new IllegalArgumentException("Minimum must not be bigger than maximum: " + i + " >" + i2);
                }

                @Override // net.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.BatchAllocator
                public Iterable<? extends List<Class<?>>> batch(List<Class<?>> list) {
                    return new SlicingIterable(this.minimum, this.maximum, this.batchAllocator.batch(list));
                }

                public boolean equals(@MaybeNull Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj == null || getClass() != obj.getClass()) {
                        return false;
                    }
                    Slicing slicing = (Slicing) obj;
                    return this.minimum == slicing.minimum && this.maximum == slicing.maximum && this.batchAllocator.equals(slicing.batchAllocator);
                }

                public int hashCode() {
                    return (((((getClass().hashCode() * 31) + this.minimum) * 31) + this.maximum) * 31) + this.batchAllocator.hashCode();
                }
            }

            Iterable<? extends List<Class<?>>> batch(List<Class<?>> list);
        }

        public static abstract class Collector {
            protected final CircularityLock circularityLock;
            private final DescriptionStrategy descriptionStrategy;
            private final FallbackStrategy fallbackStrategy;
            protected final Listener listener;
            protected final LocationStrategy locationStrategy;
            private final RawMatcher matcher;
            private final PoolStrategy poolStrategy;
            protected final List<Class<?>> types = new ArrayList();

            public static class ForRedefinition extends Collector {
                public ForRedefinition(RawMatcher rawMatcher, PoolStrategy poolStrategy, LocationStrategy locationStrategy, DescriptionStrategy descriptionStrategy, Listener listener, FallbackStrategy fallbackStrategy, CircularityLock circularityLock) {
                    super(rawMatcher, poolStrategy, locationStrategy, descriptionStrategy, listener, fallbackStrategy, circularityLock);
                }

                /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
                /* JADX DEBUG: Finally have unexpected throw blocks count: 3, expect 1 */
                @Override // net.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.Collector
                public void doApply(Instrumentation instrumentation, List<Class<?>> list) throws ClassNotFoundException, UnmodifiableClassException {
                    ArrayList arrayList = new ArrayList(list.size());
                    Iterator<Class<?>> it = list.iterator();
                    while (it.hasNext()) {
                        Class<?> next = it.next();
                        try {
                            arrayList.add(new ClassDefinition(next, this.locationStrategy.classFileLocator(next.getClassLoader(), JavaModule.ofType(next)).locate(TypeDescription.ForLoadedType.getName(next)).resolve()));
                        } catch (Throwable th) {
                            try {
                                JavaModule javaModuleOfType = JavaModule.ofType(next);
                                try {
                                    this.listener.onDiscovery(TypeDescription.ForLoadedType.getName(next), next.getClassLoader(), javaModuleOfType, true);
                                    try {
                                        this.listener.onError(TypeDescription.ForLoadedType.getName(next), next.getClassLoader(), javaModuleOfType, true, th);
                                        this.listener.onComplete(TypeDescription.ForLoadedType.getName(next), next.getClassLoader(), javaModuleOfType, true);
                                    } finally {
                                    }
                                } catch (Throwable th2) {
                                    try {
                                        this.listener.onError(TypeDescription.ForLoadedType.getName(next), next.getClassLoader(), javaModuleOfType, true, th);
                                        throw th2;
                                    } finally {
                                    }
                                }
                            } catch (Throwable unused) {
                                continue;
                            }
                        }
                    }
                    if (arrayList.isEmpty()) {
                        return;
                    }
                    this.circularityLock.release();
                    try {
                        instrumentation.redefineClasses((ClassDefinition[]) arrayList.toArray(new ClassDefinition[0]));
                    } finally {
                        this.circularityLock.acquire();
                    }
                }
            }

            public static class ForRetransformation extends Collector {
                public ForRetransformation(RawMatcher rawMatcher, PoolStrategy poolStrategy, LocationStrategy locationStrategy, DescriptionStrategy descriptionStrategy, Listener listener, FallbackStrategy fallbackStrategy, CircularityLock circularityLock) {
                    super(rawMatcher, poolStrategy, locationStrategy, descriptionStrategy, listener, fallbackStrategy, circularityLock);
                }

                @Override // net.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.Collector
                public void doApply(Instrumentation instrumentation, List<Class<?>> list) throws UnmodifiableClassException {
                    if (list.isEmpty()) {
                        return;
                    }
                    this.circularityLock.release();
                    try {
                        RedefinitionStrategy.DISPATCHER.retransformClasses(instrumentation, (Class[]) list.toArray(new Class[0]));
                    } finally {
                        this.circularityLock.acquire();
                    }
                }
            }

            public static class PrependableIterator implements Iterator<List<Class<?>>> {
                private final List<Iterator<? extends List<Class<?>>>> backlog = new ArrayList();
                private Iterator<? extends List<Class<?>>> current;

                public PrependableIterator(Iterable<? extends List<Class<?>>> iterable) {
                    this.current = iterable.iterator();
                }

                @Override // java.util.Iterator
                public boolean hasNext() {
                    return this.current.hasNext();
                }

                public void prepend(Iterable<? extends List<Class<?>>> iterable) {
                    Iterator<? extends List<Class<?>>> it = iterable.iterator();
                    if (it.hasNext()) {
                        if (this.current.hasNext()) {
                            this.backlog.add(this.current);
                        }
                        this.current = it;
                    }
                }

                @Override // java.util.Iterator
                public void remove() {
                    throw new UnsupportedOperationException("remove");
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
                /* JADX DEBUG: Method merged with bridge method: next()Ljava/lang/Object; */
                @Override // java.util.Iterator
                public List<Class<?>> next() {
                    boolean zHasNext;
                    boolean zIsEmpty;
                    try {
                        while (true) {
                            if (!zHasNext) {
                                if (zIsEmpty) {
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                        return this.current.next();
                    } finally {
                        while (!this.current.hasNext() && !this.backlog.isEmpty()) {
                            this.current = this.backlog.remove(r1.size() - 1);
                        }
                    }
                }
            }

            public Collector(RawMatcher rawMatcher, PoolStrategy poolStrategy, LocationStrategy locationStrategy, DescriptionStrategy descriptionStrategy, Listener listener, FallbackStrategy fallbackStrategy, CircularityLock circularityLock) {
                this.matcher = rawMatcher;
                this.poolStrategy = poolStrategy;
                this.locationStrategy = locationStrategy;
                this.descriptionStrategy = descriptionStrategy;
                this.listener = listener;
                this.fallbackStrategy = fallbackStrategy;
                this.circularityLock = circularityLock;
            }

            /* JADX DEBUG: Another duplicated slice has different insns count: {[INVOKE, INVOKE]}, finally: {[INVOKE, INVOKE, INVOKE, MOVE, INVOKE, IF] complete} */
            private void doConsider(RawMatcher rawMatcher, Listener listener, TypeDescription typeDescription, Class<?> cls, @MaybeNull Class<?> cls2, @MaybeNull JavaModule javaModule, boolean z) {
                if (z && rawMatcher.matches(typeDescription, cls.getClassLoader(), javaModule, cls2, cls.getProtectionDomain())) {
                    this.types.add(cls);
                    return;
                }
                try {
                    try {
                        listener.onDiscovery(TypeDescription.ForLoadedType.getName(cls), cls.getClassLoader(), javaModule, cls2 != null);
                        listener.onIgnored(typeDescription, cls.getClassLoader(), javaModule, cls2 != null);
                    } catch (Throwable th) {
                        try {
                            listener.onError(TypeDescription.ForLoadedType.getName(cls), cls.getClassLoader(), javaModule, cls2 != null, th);
                            String name = TypeDescription.ForLoadedType.getName(cls);
                            ClassLoader classLoader = cls.getClassLoader();
                            if (cls2 != null) {
                            }
                        } finally {
                            listener.onComplete(TypeDescription.ForLoadedType.getName(cls), cls.getClassLoader(), javaModule, cls2 != null);
                        }
                    }
                } catch (Throwable unused) {
                }
            }

            public int apply(Instrumentation instrumentation, BatchAllocator batchAllocator, Listener listener, int i) {
                HashMap map = new HashMap();
                PrependableIterator prependableIterator = new PrependableIterator(batchAllocator.batch(this.types));
                while (prependableIterator.hasNext()) {
                    List<Class<?>> next = prependableIterator.next();
                    listener.onBatch(i, next, this.types);
                    try {
                        doApply(instrumentation, next);
                    } catch (Throwable th) {
                        prependableIterator.prepend(listener.onError(i, next, th, this.types));
                        map.put(next, th);
                    }
                    i++;
                }
                listener.onComplete(i, this.types, map);
                return i;
            }

            /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
            /* JADX DEBUG: Finally have unexpected throw blocks count: 3, expect 1 */
            public void consider(Class<?> cls, boolean z) {
                JavaModule javaModuleOfType = JavaModule.ofType(cls);
                try {
                    TypePool typePool = this.poolStrategy.typePool(this.locationStrategy.classFileLocator(cls.getClassLoader(), javaModuleOfType), cls.getClassLoader());
                    try {
                        doConsider(this.matcher, this.listener, this.descriptionStrategy.apply(TypeDescription.ForLoadedType.getName(cls), cls, typePool, this.circularityLock, cls.getClassLoader(), javaModuleOfType), cls, cls, javaModuleOfType, z);
                    } catch (Throwable th) {
                        if (!this.descriptionStrategy.isLoadedFirst() || !this.fallbackStrategy.isFallback(cls, th)) {
                            throw th;
                        }
                        doConsider(this.matcher, this.listener, typePool.describe(TypeDescription.ForLoadedType.getName(cls)).resolve(), cls, null, javaModuleOfType, true);
                    }
                } catch (Throwable th2) {
                    try {
                        try {
                            this.listener.onDiscovery(TypeDescription.ForLoadedType.getName(cls), cls.getClassLoader(), javaModuleOfType, true);
                            try {
                                this.listener.onError(TypeDescription.ForLoadedType.getName(cls), cls.getClassLoader(), javaModuleOfType, true, th2);
                                this.listener.onComplete(TypeDescription.ForLoadedType.getName(cls), cls.getClassLoader(), javaModuleOfType, true);
                            } finally {
                            }
                        } catch (Throwable th3) {
                            try {
                                this.listener.onError(TypeDescription.ForLoadedType.getName(cls), cls.getClassLoader(), javaModuleOfType, true, th2);
                                throw th3;
                            } finally {
                            }
                        }
                    } catch (Throwable unused) {
                    }
                }
            }

            public abstract void doApply(Instrumentation instrumentation, List<Class<?>> list) throws ClassNotFoundException, UnmodifiableClassException;
        }

        public interface DiscoveryStrategy {

            @HashCodeAndEqualsPlugin.Enhance
            public static class Explicit implements DiscoveryStrategy {
                private final Set<Class<?>> types;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                public Explicit(Class<?>... clsArr) {
                    this(new LinkedHashSet(Arrays.asList(clsArr)));
                }

                public boolean equals(@MaybeNull Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return obj != null && getClass() == obj.getClass() && this.types.equals(((Explicit) obj).types);
                }

                public int hashCode() {
                    return (getClass().hashCode() * 31) + this.types.hashCode();
                }

                @Override // net.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.DiscoveryStrategy
                public Iterable<Iterable<Class<?>>> resolve(Instrumentation instrumentation) {
                    return Collections.singleton(this.types);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
                public Explicit(Set<Class<?>> set) {
                    this.types = set;
                }
            }

            public enum Reiterating implements DiscoveryStrategy {
                INSTANCE;

                @HashCodeAndEqualsPlugin.Enhance
                public static class ReiteratingIterable implements Iterable<Iterable<Class<?>>> {
                    private final Instrumentation instrumentation;

                    public ReiteratingIterable(Instrumentation instrumentation) {
                        this.instrumentation = instrumentation;
                    }

                    public boolean equals(@MaybeNull Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return obj != null && getClass() == obj.getClass() && this.instrumentation.equals(((ReiteratingIterable) obj).instrumentation);
                    }

                    public int hashCode() {
                        return (getClass().hashCode() * 31) + this.instrumentation.hashCode();
                    }

                    @Override // java.lang.Iterable
                    public Iterator<Iterable<Class<?>>> iterator() {
                        return new ReiteratingIterator(this.instrumentation);
                    }
                }

                public static class ReiteratingIterator implements Iterator<Iterable<Class<?>>> {
                    private final Instrumentation instrumentation;
                    private final Set<Class<?>> processed = new HashSet();

                    @MaybeNull
                    private List<Class<?>> types;

                    public ReiteratingIterator(Instrumentation instrumentation) {
                        this.instrumentation = instrumentation;
                    }

                    @Override // java.util.Iterator
                    public boolean hasNext() {
                        if (this.types == null) {
                            this.types = new ArrayList();
                            for (Class<?> cls : this.instrumentation.getAllLoadedClasses()) {
                                if (cls != null && this.processed.add(cls)) {
                                    this.types.add(cls);
                                }
                            }
                        }
                        return !this.types.isEmpty();
                    }

                    @Override // java.util.Iterator
                    public void remove() {
                        throw new UnsupportedOperationException("remove");
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
                    /* JADX DEBUG: Method merged with bridge method: next()Ljava/lang/Object; */
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // java.util.Iterator
                    public Iterable<Class<?>> next() {
                        if (!hasNext()) {
                            throw new NoSuchElementException();
                        }
                        try {
                            return this.types;
                        } finally {
                            this.types = null;
                        }
                    }
                }

                public enum WithSortOrderAssumption implements DiscoveryStrategy {
                    INSTANCE;

                    @HashCodeAndEqualsPlugin.Enhance
                    public static class OrderedReiteratingIterable implements Iterable<Iterable<Class<?>>> {
                        private final Instrumentation instrumentation;

                        public OrderedReiteratingIterable(Instrumentation instrumentation) {
                            this.instrumentation = instrumentation;
                        }

                        public boolean equals(@MaybeNull Object obj) {
                            if (this == obj) {
                                return true;
                            }
                            return obj != null && getClass() == obj.getClass() && this.instrumentation.equals(((OrderedReiteratingIterable) obj).instrumentation);
                        }

                        public int hashCode() {
                            return (getClass().hashCode() * 31) + this.instrumentation.hashCode();
                        }

                        @Override // java.lang.Iterable
                        public Iterator<Iterable<Class<?>>> iterator() {
                            return new OrderedReiteratingIterator(this.instrumentation);
                        }
                    }

                    public static class OrderedReiteratingIterator implements Iterator<Iterable<Class<?>>> {
                        private int index = 0;
                        private final Instrumentation instrumentation;

                        @MaybeNull
                        private List<Class<?>> types;

                        public OrderedReiteratingIterator(Instrumentation instrumentation) {
                            this.instrumentation = instrumentation;
                        }

                        @Override // java.util.Iterator
                        public boolean hasNext() {
                            if (this.types == null) {
                                Class[] allLoadedClasses = this.instrumentation.getAllLoadedClasses();
                                this.types = new ArrayList(Arrays.asList(allLoadedClasses).subList(this.index, allLoadedClasses.length));
                                this.index = allLoadedClasses.length;
                            }
                            return !this.types.isEmpty();
                        }

                        @Override // java.util.Iterator
                        public void remove() {
                            throw new UnsupportedOperationException("remove");
                        }

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
                        /* JADX DEBUG: Method merged with bridge method: next()Ljava/lang/Object; */
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // java.util.Iterator
                        public Iterable<Class<?>> next() {
                            if (!hasNext()) {
                                throw new NoSuchElementException();
                            }
                            try {
                                return this.types;
                            } finally {
                                this.types = null;
                            }
                        }
                    }

                    @Override // net.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.DiscoveryStrategy
                    public Iterable<Iterable<Class<?>>> resolve(Instrumentation instrumentation) {
                        return new OrderedReiteratingIterable(instrumentation);
                    }
                }

                @Override // net.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.DiscoveryStrategy
                public Iterable<Iterable<Class<?>>> resolve(Instrumentation instrumentation) {
                    return new ReiteratingIterable(instrumentation);
                }
            }

            public enum SinglePass implements DiscoveryStrategy {
                INSTANCE;

                @Override // net.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.DiscoveryStrategy
                public Iterable<Iterable<Class<?>>> resolve(Instrumentation instrumentation) {
                    return Collections.singleton(Arrays.asList(instrumentation.getAllLoadedClasses()));
                }
            }

            Iterable<Iterable<Class<?>>> resolve(Instrumentation instrumentation);
        }

        @JavaDispatcher.Proxied("java.lang.instrument.Instrumentation")
        public interface Dispatcher {
            @JavaDispatcher.Proxied("isModifiableClass")
            boolean isModifiableClass(Instrumentation instrumentation, Class<?> cls);

            @JavaDispatcher.Defaults
            @JavaDispatcher.Proxied("isRetransformClassesSupported")
            boolean isRetransformClassesSupported(Instrumentation instrumentation);

            @JavaDispatcher.Proxied("retransformClasses")
            void retransformClasses(Instrumentation instrumentation, Class<?>[] clsArr) throws UnmodifiableClassException;
        }

        public interface Listener {

            @HashCodeAndEqualsPlugin.Enhance
            public static abstract class Adapter implements Listener {
                public boolean equals(@MaybeNull Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return obj != null && getClass() == obj.getClass();
                }

                public int hashCode() {
                    return getClass().hashCode();
                }

                @Override // net.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.Listener
                public void onBatch(int i, List<Class<?>> list, List<Class<?>> list2) {
                }

                @Override // net.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.Listener
                public void onComplete(int i, List<Class<?>> list, Map<List<Class<?>>, Throwable> map) {
                }

                @Override // net.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.Listener
                public Iterable<? extends List<Class<?>>> onError(int i, List<Class<?>> list, Throwable th, List<Class<?>> list2) {
                    return Collections.emptyList();
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class BatchReallocator extends Adapter {
                private final BatchAllocator batchAllocator;

                public BatchReallocator(BatchAllocator batchAllocator) {
                    this.batchAllocator = batchAllocator;
                }

                public static Listener splitting() {
                    return new BatchReallocator(new BatchAllocator.Partitioning(2));
                }

                @Override // net.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.Listener.Adapter
                public boolean equals(@MaybeNull Object obj) {
                    if (!super.equals(obj)) {
                        return false;
                    }
                    if (this == obj) {
                        return true;
                    }
                    return obj != null && getClass() == obj.getClass() && this.batchAllocator.equals(((BatchReallocator) obj).batchAllocator);
                }

                @Override // net.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.Listener.Adapter
                public int hashCode() {
                    return (super.hashCode() * 31) + this.batchAllocator.hashCode();
                }

                @Override // net.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.Listener.Adapter, net.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.Listener
                public Iterable<? extends List<Class<?>>> onError(int i, List<Class<?>> list, Throwable th, List<Class<?>> list2) {
                    return list.size() < 2 ? Collections.emptyList() : this.batchAllocator.batch(list);
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class Compound implements Listener {
                private final List<Listener> listeners;

                @HashCodeAndEqualsPlugin.Enhance
                public static class CompoundIterable implements Iterable<List<Class<?>>> {
                    private final List<Iterable<? extends List<Class<?>>>> iterables;

                    public static class CompoundIterator implements Iterator<List<Class<?>>> {
                        private final List<Iterable<? extends List<Class<?>>>> backlog;

                        @MaybeNull
                        private Iterator<? extends List<Class<?>>> current;

                        public CompoundIterator(List<Iterable<? extends List<Class<?>>>> list) {
                            this.backlog = list;
                            forward();
                        }

                        private void forward() {
                            while (true) {
                                Iterator<? extends List<Class<?>>> it = this.current;
                                if ((it != null && it.hasNext()) || this.backlog.isEmpty()) {
                                    return;
                                } else {
                                    this.current = this.backlog.remove(0).iterator();
                                }
                            }
                        }

                        @Override // java.util.Iterator
                        public boolean hasNext() {
                            Iterator<? extends List<Class<?>>> it = this.current;
                            return it != null && it.hasNext();
                        }

                        @Override // java.util.Iterator
                        public void remove() {
                            throw new UnsupportedOperationException("remove");
                        }

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
                        /* JADX DEBUG: Method merged with bridge method: next()Ljava/lang/Object; */
                        @Override // java.util.Iterator
                        public List<Class<?>> next() {
                            try {
                                Iterator<? extends List<Class<?>>> it = this.current;
                                if (it != null) {
                                    return it.next();
                                }
                                throw new NoSuchElementException();
                            } finally {
                                forward();
                            }
                        }
                    }

                    public CompoundIterable(List<Iterable<? extends List<Class<?>>>> list) {
                        this.iterables = list;
                    }

                    public boolean equals(@MaybeNull Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return obj != null && getClass() == obj.getClass() && this.iterables.equals(((CompoundIterable) obj).iterables);
                    }

                    public int hashCode() {
                        return (getClass().hashCode() * 31) + this.iterables.hashCode();
                    }

                    @Override // java.lang.Iterable
                    public Iterator<List<Class<?>>> iterator() {
                        return new CompoundIterator(new ArrayList(this.iterables));
                    }
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                public Compound(Listener... listenerArr) {
                    this((List<? extends Listener>) Arrays.asList(listenerArr));
                }

                public boolean equals(@MaybeNull Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return obj != null && getClass() == obj.getClass() && this.listeners.equals(((Compound) obj).listeners);
                }

                public int hashCode() {
                    return (getClass().hashCode() * 31) + this.listeners.hashCode();
                }

                @Override // net.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.Listener
                public void onBatch(int i, List<Class<?>> list, List<Class<?>> list2) {
                    Iterator<Listener> it = this.listeners.iterator();
                    while (it.hasNext()) {
                        it.next().onBatch(i, list, list2);
                    }
                }

                @Override // net.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.Listener
                public void onComplete(int i, List<Class<?>> list, Map<List<Class<?>>, Throwable> map) {
                    Iterator<Listener> it = this.listeners.iterator();
                    while (it.hasNext()) {
                        it.next().onComplete(i, list, map);
                    }
                }

                @Override // net.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.Listener
                public Iterable<? extends List<Class<?>>> onError(int i, List<Class<?>> list, Throwable th, List<Class<?>> list2) {
                    ArrayList arrayList = new ArrayList();
                    Iterator<Listener> it = this.listeners.iterator();
                    while (it.hasNext()) {
                        arrayList.add(it.next().onError(i, list, th, list2));
                    }
                    return new CompoundIterable(arrayList);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
                public Compound(List<? extends Listener> list) {
                    this.listeners = new ArrayList();
                    for (Listener listener : list) {
                        if (listener instanceof Compound) {
                            this.listeners.addAll(((Compound) listener).listeners);
                        } else if (!(listener instanceof NoOp)) {
                            this.listeners.add(listener);
                        }
                    }
                }
            }

            public enum ErrorEscalating implements Listener {
                FAIL_FAST { // from class: net.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.Listener.ErrorEscalating.1
                    @Override // net.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.Listener
                    public void onComplete(int i, List<Class<?>> list, Map<List<Class<?>>, Throwable> map) {
                    }

                    @Override // net.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.Listener
                    public Iterable<? extends List<Class<?>>> onError(int i, List<Class<?>> list, Throwable th, List<Class<?>> list2) {
                        throw new IllegalStateException("Could not transform any of " + list, th);
                    }
                },
                FAIL_LAST { // from class: net.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.Listener.ErrorEscalating.2
                    @Override // net.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.Listener
                    public void onComplete(int i, List<Class<?>> list, Map<List<Class<?>>, Throwable> map) {
                        if (map.isEmpty()) {
                            return;
                        }
                        throw new IllegalStateException("Could not transform any of " + map);
                    }

                    @Override // net.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.Listener
                    public Iterable<? extends List<Class<?>>> onError(int i, List<Class<?>> list, Throwable th, List<Class<?>> list2) {
                        return Collections.emptyList();
                    }
                };

                @Override // net.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.Listener
                public void onBatch(int i, List<Class<?>> list, List<Class<?>> list2) {
                }
            }

            public enum NoOp implements Listener {
                INSTANCE;

                @Override // net.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.Listener
                public void onBatch(int i, List<Class<?>> list, List<Class<?>> list2) {
                }

                @Override // net.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.Listener
                public void onComplete(int i, List<Class<?>> list, Map<List<Class<?>>, Throwable> map) {
                }

                @Override // net.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.Listener
                public Iterable<? extends List<Class<?>>> onError(int i, List<Class<?>> list, Throwable th, List<Class<?>> list2) {
                    return Collections.emptyList();
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class Pausing extends Adapter {
                private final long value;

                public Pausing(long j) {
                    this.value = j;
                }

                /* JADX INFO: renamed from: of */
                public static Listener m5135of(long j, TimeUnit timeUnit) {
                    if (j > 0) {
                        return new Pausing(timeUnit.toMillis(j));
                    }
                    if (j == 0) {
                        return NoOp.INSTANCE;
                    }
                    throw new IllegalArgumentException("Cannot sleep for a non-positive amount of time: " + j);
                }

                @Override // net.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.Listener.Adapter
                public boolean equals(@MaybeNull Object obj) {
                    if (!super.equals(obj)) {
                        return false;
                    }
                    if (this == obj) {
                        return true;
                    }
                    return obj != null && getClass() == obj.getClass() && this.value == ((Pausing) obj).value;
                }

                @Override // net.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.Listener.Adapter
                public int hashCode() {
                    int iHashCode = super.hashCode() * 31;
                    long j = this.value;
                    return iHashCode + ((int) (j ^ (j >>> 32)));
                }

                @Override // net.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.Listener.Adapter, net.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.Listener
                public void onBatch(int i, List<Class<?>> list, List<Class<?>> list2) {
                    if (i > 0) {
                        try {
                            Thread.sleep(this.value);
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                            throw new IllegalStateException(e);
                        }
                    }
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class StreamWriting implements Listener {
                private final PrintStream printStream;

                public StreamWriting(PrintStream printStream) {
                    this.printStream = printStream;
                }

                public static Listener toSystemError() {
                    return new StreamWriting(System.err);
                }

                public static Listener toSystemOut() {
                    return new StreamWriting(System.out);
                }

                public boolean equals(@MaybeNull Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return obj != null && getClass() == obj.getClass() && this.printStream.equals(((StreamWriting) obj).printStream);
                }

                public int hashCode() {
                    return (getClass().hashCode() * 31) + this.printStream.hashCode();
                }

                @Override // net.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.Listener
                public void onBatch(int i, List<Class<?>> list, List<Class<?>> list2) {
                    this.printStream.printf("[Byte Buddy] REDEFINE BATCH #%d [%d of %d type(s)]%n", Integer.valueOf(i), Integer.valueOf(list.size()), Integer.valueOf(list2.size()));
                }

                @Override // net.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.Listener
                public void onComplete(int i, List<Class<?>> list, Map<List<Class<?>>, Throwable> map) {
                    this.printStream.printf("[Byte Buddy] REDEFINE COMPLETE %d batch(es) containing %d types [%d failed batch(es)]%n", Integer.valueOf(i), Integer.valueOf(list.size()), Integer.valueOf(map.size()));
                }

                @Override // net.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.Listener
                public Iterable<? extends List<Class<?>>> onError(int i, List<Class<?>> list, Throwable th, List<Class<?>> list2) {
                    synchronized (this.printStream) {
                        this.printStream.printf("[Byte Buddy] REDEFINE ERROR #%d [%d of %d type(s)]%n", Integer.valueOf(i), Integer.valueOf(list.size()), Integer.valueOf(list2.size()));
                        th.printStackTrace(this.printStream);
                    }
                    return Collections.emptyList();
                }
            }

            public enum Yielding implements Listener {
                INSTANCE;

                @Override // net.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.Listener
                public void onBatch(int i, List<Class<?>> list, List<Class<?>> list2) {
                    if (i > 0) {
                        Thread.yield();
                    }
                }

                @Override // net.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.Listener
                public void onComplete(int i, List<Class<?>> list, Map<List<Class<?>>, Throwable> map) {
                }

                @Override // net.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.Listener
                public Iterable<? extends List<Class<?>>> onError(int i, List<Class<?>> list, Throwable th, List<Class<?>> list2) {
                    return Collections.emptyList();
                }
            }

            void onBatch(int i, List<Class<?>> list, List<Class<?>> list2);

            void onComplete(int i, List<Class<?>> list, Map<List<Class<?>>, Throwable> map);

            Iterable<? extends List<Class<?>>> onError(int i, List<Class<?>> list, Throwable th, List<Class<?>> list2);
        }

        public interface ResubmissionEnforcer {

            public enum Disabled implements ResubmissionEnforcer {
                INSTANCE;

                @Override // net.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.ResubmissionEnforcer
                public boolean isEnforced(String str, @MaybeNull ClassLoader classLoader, @MaybeNull JavaModule javaModule, @MaybeNull Class<?> cls) {
                    return false;
                }
            }

            boolean isEnforced(String str, @MaybeNull ClassLoader classLoader, @MaybeNull JavaModule javaModule, @MaybeNull Class<?> cls);
        }

        public interface ResubmissionScheduler {

            @HashCodeAndEqualsPlugin.Enhance
            public static class AtFixedRate implements ResubmissionScheduler {
                private final ScheduledExecutorService scheduledExecutorService;
                private final long time;
                private final TimeUnit timeUnit;

                public AtFixedRate(ScheduledExecutorService scheduledExecutorService, long j, TimeUnit timeUnit) {
                    this.scheduledExecutorService = scheduledExecutorService;
                    this.time = j;
                    this.timeUnit = timeUnit;
                }

                public boolean equals(@MaybeNull Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj == null || getClass() != obj.getClass()) {
                        return false;
                    }
                    AtFixedRate atFixedRate = (AtFixedRate) obj;
                    return this.time == atFixedRate.time && this.timeUnit.equals(atFixedRate.timeUnit) && this.scheduledExecutorService.equals(atFixedRate.scheduledExecutorService);
                }

                public int hashCode() {
                    int iHashCode = ((getClass().hashCode() * 31) + this.scheduledExecutorService.hashCode()) * 31;
                    long j = this.time;
                    return ((iHashCode + ((int) (j ^ (j >>> 32)))) * 31) + this.timeUnit.hashCode();
                }

                @Override // net.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.ResubmissionScheduler
                public boolean isAlive() {
                    return !this.scheduledExecutorService.isShutdown();
                }

                @Override // net.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.ResubmissionScheduler
                public Cancelable schedule(Runnable runnable) {
                    ScheduledExecutorService scheduledExecutorService = this.scheduledExecutorService;
                    long j = this.time;
                    return new Cancelable.ForFuture(scheduledExecutorService.scheduleAtFixedRate(runnable, j, j, this.timeUnit));
                }
            }

            public interface Cancelable {

                @HashCodeAndEqualsPlugin.Enhance
                public static class ForFuture implements Cancelable {
                    private final Future<?> future;

                    public ForFuture(Future<?> future) {
                        this.future = future;
                    }

                    @Override // net.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.ResubmissionScheduler.Cancelable
                    public void cancel() {
                        this.future.cancel(true);
                    }

                    public boolean equals(@MaybeNull Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return obj != null && getClass() == obj.getClass() && this.future.equals(((ForFuture) obj).future);
                    }

                    public int hashCode() {
                        return (getClass().hashCode() * 31) + this.future.hashCode();
                    }
                }

                public enum NoOp implements Cancelable {
                    INSTANCE;

                    @Override // net.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.ResubmissionScheduler.Cancelable
                    public void cancel() {
                    }
                }

                void cancel();
            }

            public enum NoOp implements ResubmissionScheduler {
                INSTANCE;

                @Override // net.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.ResubmissionScheduler
                public boolean isAlive() {
                    return false;
                }

                @Override // net.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.ResubmissionScheduler
                public Cancelable schedule(Runnable runnable) {
                    return Cancelable.NoOp.INSTANCE;
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class WithFixedDelay implements ResubmissionScheduler {
                private final ScheduledExecutorService scheduledExecutorService;
                private final long time;
                private final TimeUnit timeUnit;

                public WithFixedDelay(ScheduledExecutorService scheduledExecutorService, long j, TimeUnit timeUnit) {
                    this.scheduledExecutorService = scheduledExecutorService;
                    this.time = j;
                    this.timeUnit = timeUnit;
                }

                public boolean equals(@MaybeNull Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj == null || getClass() != obj.getClass()) {
                        return false;
                    }
                    WithFixedDelay withFixedDelay = (WithFixedDelay) obj;
                    return this.time == withFixedDelay.time && this.timeUnit.equals(withFixedDelay.timeUnit) && this.scheduledExecutorService.equals(withFixedDelay.scheduledExecutorService);
                }

                public int hashCode() {
                    int iHashCode = ((getClass().hashCode() * 31) + this.scheduledExecutorService.hashCode()) * 31;
                    long j = this.time;
                    return ((iHashCode + ((int) (j ^ (j >>> 32)))) * 31) + this.timeUnit.hashCode();
                }

                @Override // net.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.ResubmissionScheduler
                public boolean isAlive() {
                    return !this.scheduledExecutorService.isShutdown();
                }

                @Override // net.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.ResubmissionScheduler
                public Cancelable schedule(Runnable runnable) {
                    ScheduledExecutorService scheduledExecutorService = this.scheduledExecutorService;
                    long j = this.time;
                    return new Cancelable.ForFuture(scheduledExecutorService.scheduleWithFixedDelay(runnable, j, j, this.timeUnit));
                }
            }

            boolean isAlive();

            Cancelable schedule(Runnable runnable);
        }

        public interface ResubmissionStrategy {

            public enum Disabled implements ResubmissionStrategy {
                INSTANCE;

                @Override // net.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.ResubmissionStrategy
                public Installation apply(Instrumentation instrumentation, PoolStrategy poolStrategy, LocationStrategy locationStrategy, DescriptionStrategy descriptionStrategy, FallbackStrategy fallbackStrategy, Listener listener, InstallationListener installationListener, CircularityLock circularityLock, RawMatcher rawMatcher, RedefinitionStrategy redefinitionStrategy, BatchAllocator batchAllocator, Listener listener2) {
                    return new Installation(listener, installationListener, ResubmissionEnforcer.Disabled.INSTANCE);
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class Enabled implements ResubmissionStrategy {
                private final RedefinitionListenable.ResubmissionImmediateMatcher resubmissionImmediateMatcher;
                private final RedefinitionListenable.ResubmissionOnErrorMatcher resubmissionOnErrorMatcher;
                private final ResubmissionScheduler resubmissionScheduler;

                public static class LookupKey {

                    @MaybeNull
                    private final ClassLoader classLoader;
                    private final int hashCode;

                    public LookupKey(@MaybeNull ClassLoader classLoader) {
                        this.classLoader = classLoader;
                        this.hashCode = System.identityHashCode(classLoader);
                    }

                    @SuppressFBWarnings(justification = "Cross-comparison is intended.", value = {"EQ_CHECK_FOR_OPERAND_NOT_COMPATIBLE_WITH_THIS"})
                    public boolean equals(@MaybeNull Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (obj instanceof LookupKey) {
                            return this.classLoader == ((LookupKey) obj).classLoader;
                        }
                        if (!(obj instanceof StorageKey)) {
                            return false;
                        }
                        StorageKey storageKey = (StorageKey) obj;
                        return this.hashCode == storageKey.hashCode && this.classLoader == storageKey.get();
                    }

                    public int hashCode() {
                        return this.hashCode;
                    }
                }

                public static class ResubmissionInstallationListener extends InstallationListener.Adapter implements Runnable {

                    @MaybeNull
                    private volatile ResubmissionScheduler.Cancelable cancelable;
                    private final CircularityLock circularityLock;
                    private final DescriptionStrategy descriptionStrategy;
                    private final FallbackStrategy fallbackStrategy;
                    private final Instrumentation instrumentation;
                    private final Listener listener;
                    private final LocationStrategy locationStrategy;
                    private final RawMatcher matcher;
                    private final PoolStrategy poolStrategy;
                    private final BatchAllocator redefinitionBatchAllocator;
                    private final Listener redefinitionBatchListener;
                    private final RedefinitionStrategy redefinitionStrategy;
                    private final ResubmissionScheduler resubmissionScheduler;
                    private final ConcurrentMap<StorageKey, Set<String>> types;

                    public ResubmissionInstallationListener(Instrumentation instrumentation, ResubmissionScheduler resubmissionScheduler, PoolStrategy poolStrategy, LocationStrategy locationStrategy, DescriptionStrategy descriptionStrategy, FallbackStrategy fallbackStrategy, Listener listener, CircularityLock circularityLock, RawMatcher rawMatcher, RedefinitionStrategy redefinitionStrategy, BatchAllocator batchAllocator, Listener listener2, ConcurrentMap<StorageKey, Set<String>> concurrentMap) {
                        this.instrumentation = instrumentation;
                        this.resubmissionScheduler = resubmissionScheduler;
                        this.poolStrategy = poolStrategy;
                        this.locationStrategy = locationStrategy;
                        this.descriptionStrategy = descriptionStrategy;
                        this.fallbackStrategy = fallbackStrategy;
                        this.listener = listener;
                        this.circularityLock = circularityLock;
                        this.matcher = rawMatcher;
                        this.redefinitionStrategy = redefinitionStrategy;
                        this.redefinitionBatchAllocator = batchAllocator;
                        this.redefinitionBatchListener = listener2;
                        this.types = concurrentMap;
                    }

                    @Override // net.bytebuddy.agent.builder.AgentBuilder.InstallationListener.Adapter, net.bytebuddy.agent.builder.AgentBuilder.InstallationListener
                    public void onInstall(Instrumentation instrumentation, ResettableClassFileTransformer resettableClassFileTransformer) {
                        this.cancelable = this.resubmissionScheduler.schedule(this);
                    }

                    @Override // net.bytebuddy.agent.builder.AgentBuilder.InstallationListener.Adapter, net.bytebuddy.agent.builder.AgentBuilder.InstallationListener
                    public void onReset(Instrumentation instrumentation, ResettableClassFileTransformer resettableClassFileTransformer) {
                        ResubmissionScheduler.Cancelable cancelable = this.cancelable;
                        if (cancelable != null) {
                            cancelable.cancel();
                        }
                    }

                    /* JADX WARN: Removed duplicated region for block: B:36:0x00ac  */
                    @Override // java.lang.Runnable
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public void run() {
                        boolean z;
                        boolean zAcquire = this.circularityLock.acquire();
                        try {
                            Collector collectorMake = this.redefinitionStrategy.make(this.poolStrategy, this.locationStrategy, this.descriptionStrategy, this.fallbackStrategy, this.listener, this.matcher, this.circularityLock);
                            Iterator<Map.Entry<StorageKey, Set<String>>> it = this.types.entrySet().iterator();
                            while (it.hasNext()) {
                                if (Thread.interrupted()) {
                                    if (zAcquire) {
                                        this.circularityLock.release();
                                        return;
                                    }
                                    return;
                                }
                                Map.Entry<StorageKey, Set<String>> next = it.next();
                                ClassLoader classLoader = next.getKey().get();
                                if (classLoader != null || next.getKey().isBootstrapLoader()) {
                                    Iterator<String> it2 = next.getValue().iterator();
                                    while (it2.hasNext()) {
                                        if (Thread.interrupted()) {
                                            if (zAcquire) {
                                                this.circularityLock.release();
                                                return;
                                            }
                                            return;
                                        }
                                        try {
                                            Class<?> cls = Class.forName(it2.next(), false, classLoader);
                                            if (cls.isArray() || cls.isPrimitive()) {
                                                z = false;
                                                collectorMake.consider(cls, z);
                                            } else {
                                                if (!RedefinitionStrategy.DISPATCHER.isModifiableClass(this.instrumentation, cls)) {
                                                    ClassFileVersion classFileVersion = ClassFileVersion.JAVA_V5;
                                                    if (ClassFileVersion.ofThisVm(classFileVersion).isAtMost(classFileVersion)) {
                                                    }
                                                    collectorMake.consider(cls, z);
                                                }
                                                z = true;
                                                collectorMake.consider(cls, z);
                                            }
                                        } catch (Throwable unused) {
                                        }
                                        it2.remove();
                                    }
                                } else {
                                    it.remove();
                                }
                            }
                            collectorMake.apply(this.instrumentation, this.redefinitionBatchAllocator, this.redefinitionBatchListener, 0);
                            if (zAcquire) {
                                this.circularityLock.release();
                            }
                        } catch (Throwable th) {
                            if (zAcquire) {
                                this.circularityLock.release();
                            }
                            throw th;
                        }
                    }
                }

                public static class Resubmitter extends Listener.Adapter implements ResubmissionEnforcer {
                    private final RedefinitionListenable.ResubmissionImmediateMatcher resubmissionImmediateMatcher;
                    private final RedefinitionListenable.ResubmissionOnErrorMatcher resubmissionOnErrorMatcher;
                    private final ConcurrentMap<StorageKey, Set<String>> types;

                    public static class ConcurrentHashSet<T> extends AbstractSet<T> {
                        private final ConcurrentMap<T, Boolean> delegate = new ConcurrentHashMap();

                        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                        public boolean add(T t) {
                            return this.delegate.put(t, Boolean.TRUE) == null;
                        }

                        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
                        public Iterator<T> iterator() {
                            return this.delegate.keySet().iterator();
                        }

                        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                        public boolean remove(Object obj) {
                            return this.delegate.remove(obj) != null;
                        }

                        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                        public int size() {
                            return this.delegate.size();
                        }
                    }

                    public Resubmitter(RedefinitionListenable.ResubmissionOnErrorMatcher resubmissionOnErrorMatcher, RedefinitionListenable.ResubmissionImmediateMatcher resubmissionImmediateMatcher, ConcurrentMap<StorageKey, Set<String>> concurrentMap) {
                        this.resubmissionOnErrorMatcher = resubmissionOnErrorMatcher;
                        this.resubmissionImmediateMatcher = resubmissionImmediateMatcher;
                        this.types = concurrentMap;
                    }

                    @Override // net.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.ResubmissionEnforcer
                    @SuppressFBWarnings(justification = "Cross-comparison is intended.", value = {"GC_UNRELATED_TYPES"})
                    public boolean isEnforced(String str, @MaybeNull ClassLoader classLoader, @MaybeNull JavaModule javaModule, @MaybeNull Class<?> cls) {
                        Set<String> setPutIfAbsent;
                        if (cls != null || !this.resubmissionImmediateMatcher.matches(str, classLoader, javaModule)) {
                            return false;
                        }
                        Set<String> concurrentHashSet = this.types.get(new LookupKey(classLoader));
                        if (concurrentHashSet == null && (setPutIfAbsent = this.types.putIfAbsent(new StorageKey(classLoader), (concurrentHashSet = new ConcurrentHashSet<>()))) != null) {
                            concurrentHashSet = setPutIfAbsent;
                        }
                        concurrentHashSet.add(str);
                        return true;
                    }

                    @Override // net.bytebuddy.agent.builder.AgentBuilder.Listener.Adapter, net.bytebuddy.agent.builder.AgentBuilder.Listener
                    @SuppressFBWarnings(justification = "Cross-comparison is intended.", value = {"GC_UNRELATED_TYPES"})
                    public void onError(String str, @MaybeNull ClassLoader classLoader, @MaybeNull JavaModule javaModule, boolean z, Throwable th) {
                        Set<String> setPutIfAbsent;
                        if (z || !this.resubmissionOnErrorMatcher.matches(th, str, classLoader, javaModule)) {
                            return;
                        }
                        Set<String> concurrentHashSet = this.types.get(new LookupKey(classLoader));
                        if (concurrentHashSet == null && (setPutIfAbsent = this.types.putIfAbsent(new StorageKey(classLoader), (concurrentHashSet = new ConcurrentHashSet<>()))) != null) {
                            concurrentHashSet = setPutIfAbsent;
                        }
                        concurrentHashSet.add(str);
                    }
                }

                public static class StorageKey extends WeakReference<ClassLoader> {
                    private final int hashCode;

                    public StorageKey(@MaybeNull ClassLoader classLoader) {
                        super(classLoader);
                        this.hashCode = System.identityHashCode(classLoader);
                    }

                    @SuppressFBWarnings(justification = "Cross-comparison is intended.", value = {"EQ_CHECK_FOR_OPERAND_NOT_COMPATIBLE_WITH_THIS"})
                    public boolean equals(@MaybeNull Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (obj instanceof LookupKey) {
                            LookupKey lookupKey = (LookupKey) obj;
                            return this.hashCode == lookupKey.hashCode && get() == lookupKey.classLoader;
                        }
                        if (!(obj instanceof StorageKey)) {
                            return false;
                        }
                        StorageKey storageKey = (StorageKey) obj;
                        return this.hashCode == storageKey.hashCode && get() == storageKey.get();
                    }

                    public int hashCode() {
                        return this.hashCode;
                    }

                    public boolean isBootstrapLoader() {
                        return this.hashCode == 0;
                    }
                }

                public Enabled(ResubmissionScheduler resubmissionScheduler, RedefinitionListenable.ResubmissionOnErrorMatcher resubmissionOnErrorMatcher, RedefinitionListenable.ResubmissionImmediateMatcher resubmissionImmediateMatcher) {
                    this.resubmissionScheduler = resubmissionScheduler;
                    this.resubmissionOnErrorMatcher = resubmissionOnErrorMatcher;
                    this.resubmissionImmediateMatcher = resubmissionImmediateMatcher;
                }

                @Override // net.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.ResubmissionStrategy
                public Installation apply(Instrumentation instrumentation, PoolStrategy poolStrategy, LocationStrategy locationStrategy, DescriptionStrategy descriptionStrategy, FallbackStrategy fallbackStrategy, Listener listener, InstallationListener installationListener, CircularityLock circularityLock, RawMatcher rawMatcher, RedefinitionStrategy redefinitionStrategy, BatchAllocator batchAllocator, Listener listener2) {
                    if (this.resubmissionScheduler.isAlive()) {
                        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                        Resubmitter resubmitter = new Resubmitter(this.resubmissionOnErrorMatcher, this.resubmissionImmediateMatcher, concurrentHashMap);
                        return new Installation(new Listener.Compound(resubmitter, listener), new InstallationListener.Compound(new ResubmissionInstallationListener(instrumentation, this.resubmissionScheduler, poolStrategy, locationStrategy, descriptionStrategy, fallbackStrategy, listener, circularityLock, rawMatcher, redefinitionStrategy, batchAllocator, listener2, concurrentHashMap), installationListener), resubmitter);
                    }
                    throw new IllegalStateException("Resubmission scheduler " + this.resubmissionScheduler + " is not alive");
                }

                public boolean equals(@MaybeNull Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj == null || getClass() != obj.getClass()) {
                        return false;
                    }
                    Enabled enabled = (Enabled) obj;
                    return this.resubmissionScheduler.equals(enabled.resubmissionScheduler) && this.resubmissionOnErrorMatcher.equals(enabled.resubmissionOnErrorMatcher) && this.resubmissionImmediateMatcher.equals(enabled.resubmissionImmediateMatcher);
                }

                public int hashCode() {
                    return (((((getClass().hashCode() * 31) + this.resubmissionScheduler.hashCode()) * 31) + this.resubmissionOnErrorMatcher.hashCode()) * 31) + this.resubmissionImmediateMatcher.hashCode();
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class Installation {
                private final InstallationListener installationListener;
                private final Listener listener;
                private final ResubmissionEnforcer resubmissionEnforcer;

                public Installation(Listener listener, InstallationListener installationListener, ResubmissionEnforcer resubmissionEnforcer) {
                    this.listener = listener;
                    this.installationListener = installationListener;
                    this.resubmissionEnforcer = resubmissionEnforcer;
                }

                public boolean equals(@MaybeNull Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj == null || getClass() != obj.getClass()) {
                        return false;
                    }
                    Installation installation = (Installation) obj;
                    return this.listener.equals(installation.listener) && this.installationListener.equals(installation.installationListener) && this.resubmissionEnforcer.equals(installation.resubmissionEnforcer);
                }

                public InstallationListener getInstallationListener() {
                    return this.installationListener;
                }

                public Listener getListener() {
                    return this.listener;
                }

                public ResubmissionEnforcer getResubmissionEnforcer() {
                    return this.resubmissionEnforcer;
                }

                public int hashCode() {
                    return (((((getClass().hashCode() * 31) + this.listener.hashCode()) * 31) + this.installationListener.hashCode()) * 31) + this.resubmissionEnforcer.hashCode();
                }
            }

            Installation apply(Instrumentation instrumentation, PoolStrategy poolStrategy, LocationStrategy locationStrategy, DescriptionStrategy descriptionStrategy, FallbackStrategy fallbackStrategy, Listener listener, InstallationListener installationListener, CircularityLock circularityLock, RawMatcher rawMatcher, RedefinitionStrategy redefinitionStrategy, BatchAllocator batchAllocator, Listener listener2);
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x006c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void apply(Instrumentation instrumentation, PoolStrategy poolStrategy, LocationStrategy locationStrategy, DescriptionStrategy descriptionStrategy, FallbackStrategy fallbackStrategy, DiscoveryStrategy discoveryStrategy, LambdaInstrumentationStrategy lambdaInstrumentationStrategy, Listener listener, Listener listener2, RawMatcher rawMatcher, BatchAllocator batchAllocator, CircularityLock circularityLock) {
            check(instrumentation);
            int iApply = 0;
            for (Iterable<Class<?>> iterable : discoveryStrategy.resolve(instrumentation)) {
                Collector collectorMake = make(poolStrategy, locationStrategy, descriptionStrategy, fallbackStrategy, listener, rawMatcher, circularityLock);
                for (Class<?> cls : iterable) {
                    if (cls != null && !cls.isArray() && !cls.isPrimitive()) {
                        if (lambdaInstrumentationStrategy.isInstrumented(cls)) {
                            if (!DISPATCHER.isModifiableClass(instrumentation, cls)) {
                                ClassFileVersion classFileVersion = ClassFileVersion.JAVA_V5;
                                boolean z = ClassFileVersion.ofThisVm(classFileVersion).isAtMost(classFileVersion);
                                collectorMake.consider(cls, z);
                            }
                        }
                    }
                }
                iApply = collectorMake.apply(instrumentation, batchAllocator, listener2, iApply);
            }
        }

        public abstract void check(Instrumentation instrumentation);

        public boolean isEnabled() {
            return this.enabled;
        }

        public boolean isRetransforming() {
            return this.retransforming;
        }

        public abstract Collector make(PoolStrategy poolStrategy, LocationStrategy locationStrategy, DescriptionStrategy descriptionStrategy, FallbackStrategy fallbackStrategy, Listener listener, RawMatcher rawMatcher, CircularityLock circularityLock);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        RedefinitionStrategy(boolean z, boolean z2) {
            this.enabled = z;
            this.retransforming = z2;
        }
    }

    public interface Transformer {

        @HashCodeAndEqualsPlugin.Enhance
        public static class ForAdvice implements Transformer {
            private final Advice.WithCustomMapping advice;
            private final Assigner assigner;
            private final ClassFileLocator classFileLocator;
            private final List<Entry> entries;
            private final Advice.ExceptionHandler exceptionHandler;
            private final LocationStrategy locationStrategy;
            private final PoolStrategy poolStrategy;

            @HashCodeAndEqualsPlugin.Enhance
            public static abstract class Entry {
                private final LatentMatcher<? super MethodDescription> matcher;

                @HashCodeAndEqualsPlugin.Enhance
                public static class ForSplitAdvice extends Entry {
                    private final String enter;
                    private final String exit;

                    public ForSplitAdvice(LatentMatcher<? super MethodDescription> latentMatcher, String str, String str2) {
                        super(latentMatcher);
                        this.enter = str;
                        this.exit = str2;
                    }

                    @Override // net.bytebuddy.agent.builder.AgentBuilder.Transformer.ForAdvice.Entry
                    public boolean equals(@MaybeNull Object obj) {
                        if (!super.equals(obj)) {
                            return false;
                        }
                        if (this == obj) {
                            return true;
                        }
                        if (obj == null || getClass() != obj.getClass()) {
                            return false;
                        }
                        ForSplitAdvice forSplitAdvice = (ForSplitAdvice) obj;
                        return this.enter.equals(forSplitAdvice.enter) && this.exit.equals(forSplitAdvice.exit);
                    }

                    @Override // net.bytebuddy.agent.builder.AgentBuilder.Transformer.ForAdvice.Entry
                    public int hashCode() {
                        return (((super.hashCode() * 31) + this.enter.hashCode()) * 31) + this.exit.hashCode();
                    }

                    @Override // net.bytebuddy.agent.builder.AgentBuilder.Transformer.ForAdvice.Entry
                    public Advice resolve(Advice.WithCustomMapping withCustomMapping, TypePool typePool, ClassFileLocator classFileLocator) {
                        return withCustomMapping.m5173to(typePool.describe(this.enter).resolve(), typePool.describe(this.exit).resolve(), classFileLocator);
                    }
                }

                @HashCodeAndEqualsPlugin.Enhance
                public static class ForUnifiedAdvice extends Entry {
                    protected final String name;

                    public ForUnifiedAdvice(LatentMatcher<? super MethodDescription> latentMatcher, String str) {
                        super(latentMatcher);
                        this.name = str;
                    }

                    @Override // net.bytebuddy.agent.builder.AgentBuilder.Transformer.ForAdvice.Entry
                    public boolean equals(@MaybeNull Object obj) {
                        if (!super.equals(obj)) {
                            return false;
                        }
                        if (this == obj) {
                            return true;
                        }
                        return obj != null && getClass() == obj.getClass() && this.name.equals(((ForUnifiedAdvice) obj).name);
                    }

                    @Override // net.bytebuddy.agent.builder.AgentBuilder.Transformer.ForAdvice.Entry
                    public int hashCode() {
                        return (super.hashCode() * 31) + this.name.hashCode();
                    }

                    @Override // net.bytebuddy.agent.builder.AgentBuilder.Transformer.ForAdvice.Entry
                    public Advice resolve(Advice.WithCustomMapping withCustomMapping, TypePool typePool, ClassFileLocator classFileLocator) {
                        return withCustomMapping.m5174to(typePool.describe(this.name).resolve(), classFileLocator);
                    }
                }

                public Entry(LatentMatcher<? super MethodDescription> latentMatcher) {
                    this.matcher = latentMatcher;
                }

                public boolean equals(@MaybeNull Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return obj != null && getClass() == obj.getClass() && this.matcher.equals(((Entry) obj).matcher);
                }

                public LatentMatcher<? super MethodDescription> getMatcher() {
                    return this.matcher;
                }

                public int hashCode() {
                    return (getClass().hashCode() * 31) + this.matcher.hashCode();
                }

                public abstract Advice resolve(Advice.WithCustomMapping withCustomMapping, TypePool typePool, ClassFileLocator classFileLocator);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public ForAdvice() {
                this(Advice.withCustomMapping());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public ForAdvice advice(ElementMatcher<? super MethodDescription> elementMatcher, String str) {
                return advice(new LatentMatcher.Resolved(elementMatcher), str);
            }

            public boolean equals(@MaybeNull Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                ForAdvice forAdvice = (ForAdvice) obj;
                return this.advice.equals(forAdvice.advice) && this.exceptionHandler.equals(forAdvice.exceptionHandler) && this.assigner.equals(forAdvice.assigner) && this.classFileLocator.equals(forAdvice.classFileLocator) && this.poolStrategy.equals(forAdvice.poolStrategy) && this.locationStrategy.equals(forAdvice.locationStrategy) && this.entries.equals(forAdvice.entries);
            }

            public int hashCode() {
                return (((((((((((((getClass().hashCode() * 31) + this.advice.hashCode()) * 31) + this.exceptionHandler.hashCode()) * 31) + this.assigner.hashCode()) * 31) + this.classFileLocator.hashCode()) * 31) + this.poolStrategy.hashCode()) * 31) + this.locationStrategy.hashCode()) * 31) + this.entries.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public ForAdvice include(ClassLoader... classLoaderArr) {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                for (ClassLoader classLoader : classLoaderArr) {
                    linkedHashSet.add(ClassFileLocator.ForClassLoader.m5258of(classLoader));
                }
                return include(new ArrayList(linkedHashSet));
            }

            public ForAdvice make(Advice.WithCustomMapping withCustomMapping, Advice.ExceptionHandler exceptionHandler, Assigner assigner, ClassFileLocator classFileLocator, PoolStrategy poolStrategy, LocationStrategy locationStrategy, List<Entry> list) {
                return new ForAdvice(withCustomMapping, exceptionHandler, assigner, classFileLocator, poolStrategy, locationStrategy, list);
            }

            @Override // net.bytebuddy.agent.builder.AgentBuilder.Transformer
            public DynamicType.Builder<?> transform(DynamicType.Builder<?> builder, TypeDescription typeDescription, @MaybeNull ClassLoader classLoader, @MaybeNull JavaModule javaModule, ProtectionDomain protectionDomain) {
                ClassFileLocator.Compound compound = new ClassFileLocator.Compound(this.classFileLocator, this.locationStrategy.classFileLocator(classLoader, javaModule));
                TypePool typePool = this.poolStrategy.typePool(compound, classLoader);
                AsmVisitorWrapper.ForDeclaredMethods forDeclaredMethods = new AsmVisitorWrapper.ForDeclaredMethods();
                AsmVisitorWrapper.ForDeclaredMethods forDeclaredMethodsInvokable = forDeclaredMethods;
                for (Entry entry : this.entries) {
                    forDeclaredMethodsInvokable = forDeclaredMethodsInvokable.invokable((ElementMatcher<? super MethodDescription>) entry.getMatcher().resolve(typeDescription), wrap(typeDescription, classLoader, javaModule, protectionDomain, entry.resolve(this.advice, typePool, compound).withAssigner(this.assigner).withExceptionHandler(this.exceptionHandler)));
                }
                return builder.visit(forDeclaredMethodsInvokable);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public ForAdvice with(PoolStrategy poolStrategy) {
                return make(this.advice, this.exceptionHandler, this.assigner, this.classFileLocator, poolStrategy, this.locationStrategy, this.entries);
            }

            public ForAdvice withExceptionHandler(Advice.ExceptionHandler exceptionHandler) {
                return make(this.advice, exceptionHandler, this.assigner, this.classFileLocator, this.poolStrategy, this.locationStrategy, this.entries);
            }

            public AsmVisitorWrapper.ForDeclaredMethods.MethodVisitorWrapper wrap(TypeDescription typeDescription, @MaybeNull ClassLoader classLoader, @MaybeNull JavaModule javaModule, ProtectionDomain protectionDomain, Advice advice) {
                return advice;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            public ForAdvice(Advice.WithCustomMapping withCustomMapping) {
                this(withCustomMapping, Advice.ExceptionHandler.Default.SUPPRESSING, Assigner.DEFAULT, ClassFileLocator.NoOp.INSTANCE, PoolStrategy.Default.FAST, LocationStrategy.ForClassLoader.STRONG, Collections.emptyList());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            public ForAdvice advice(LatentMatcher<? super MethodDescription> latentMatcher, String str) {
                return make(this.advice, this.exceptionHandler, this.assigner, this.classFileLocator, this.poolStrategy, this.locationStrategy, CompoundList.m5413of(this.entries, new Entry.ForUnifiedAdvice(latentMatcher, str)));
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            public ForAdvice with(LocationStrategy locationStrategy) {
                return make(this.advice, this.exceptionHandler, this.assigner, this.classFileLocator, this.poolStrategy, locationStrategy, this.entries);
            }

            public ForAdvice with(Assigner assigner) {
                return make(this.advice, this.exceptionHandler, assigner, this.classFileLocator, this.poolStrategy, this.locationStrategy, this.entries);
            }

            public ForAdvice(Advice.WithCustomMapping withCustomMapping, Advice.ExceptionHandler exceptionHandler, Assigner assigner, ClassFileLocator classFileLocator, PoolStrategy poolStrategy, LocationStrategy locationStrategy, List<Entry> list) {
                this.advice = withCustomMapping;
                this.exceptionHandler = exceptionHandler;
                this.assigner = assigner;
                this.classFileLocator = classFileLocator;
                this.poolStrategy = poolStrategy;
                this.locationStrategy = locationStrategy;
                this.entries = list;
            }

            public ForAdvice advice(ElementMatcher<? super MethodDescription> elementMatcher, String str, String str2) {
                return advice(new LatentMatcher.Resolved(elementMatcher), str, str2);
            }

            public ForAdvice include(ClassFileLocator... classFileLocatorArr) {
                return include(Arrays.asList(classFileLocatorArr));
            }

            public ForAdvice advice(LatentMatcher<? super MethodDescription> latentMatcher, String str, String str2) {
                return make(this.advice, this.exceptionHandler, this.assigner, this.classFileLocator, this.poolStrategy, this.locationStrategy, CompoundList.m5413of(this.entries, new Entry.ForSplitAdvice(latentMatcher, str, str2)));
            }

            public ForAdvice include(List<? extends ClassFileLocator> list) {
                return make(this.advice, this.exceptionHandler, this.assigner, new ClassFileLocator.Compound((List<? extends ClassFileLocator>) CompoundList.m5412of(this.classFileLocator, list)), this.poolStrategy, this.locationStrategy, this.entries);
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class ForBuildPlugin implements Transformer {
            private final Plugin plugin;

            public ForBuildPlugin(Plugin plugin) {
                this.plugin = plugin;
            }

            public boolean equals(@MaybeNull Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && getClass() == obj.getClass() && this.plugin.equals(((ForBuildPlugin) obj).plugin);
            }

            public int hashCode() {
                return (getClass().hashCode() * 31) + this.plugin.hashCode();
            }

            @Override // net.bytebuddy.agent.builder.AgentBuilder.Transformer
            public DynamicType.Builder<?> transform(DynamicType.Builder<?> builder, TypeDescription typeDescription, @MaybeNull ClassLoader classLoader, @MaybeNull JavaModule javaModule, ProtectionDomain protectionDomain) {
                return this.plugin.apply(builder, typeDescription, ClassFileLocator.ForClassLoader.m5258of(classLoader));
            }
        }

        DynamicType.Builder<?> transform(DynamicType.Builder<?> builder, TypeDescription typeDescription, @MaybeNull ClassLoader classLoader, @MaybeNull JavaModule javaModule, ProtectionDomain protectionDomain);
    }

    public interface TransformerDecorator {

        @HashCodeAndEqualsPlugin.Enhance
        public static class Compound implements TransformerDecorator {
            private final List<TransformerDecorator> transformerDecorators;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public Compound(TransformerDecorator... transformerDecoratorArr) {
                this((List<? extends TransformerDecorator>) Arrays.asList(transformerDecoratorArr));
            }

            @Override // net.bytebuddy.agent.builder.AgentBuilder.TransformerDecorator
            public ResettableClassFileTransformer decorate(ResettableClassFileTransformer resettableClassFileTransformer) {
                Iterator<TransformerDecorator> it = this.transformerDecorators.iterator();
                while (it.hasNext()) {
                    resettableClassFileTransformer = it.next().decorate(resettableClassFileTransformer);
                }
                return resettableClassFileTransformer;
            }

            public boolean equals(@MaybeNull Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && getClass() == obj.getClass() && this.transformerDecorators.equals(((Compound) obj).transformerDecorators);
            }

            public int hashCode() {
                return (getClass().hashCode() * 31) + this.transformerDecorators.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            public Compound(List<? extends TransformerDecorator> list) {
                this.transformerDecorators = new ArrayList();
                for (TransformerDecorator transformerDecorator : list) {
                    if (transformerDecorator instanceof Compound) {
                        this.transformerDecorators.addAll(((Compound) transformerDecorator).transformerDecorators);
                    } else if (!(transformerDecorator instanceof NoOp)) {
                        this.transformerDecorators.add(transformerDecorator);
                    }
                }
            }
        }

        public enum ForSubstitution implements TransformerDecorator {
            INSTANCE;

            @Override // net.bytebuddy.agent.builder.AgentBuilder.TransformerDecorator
            public ResettableClassFileTransformer decorate(ResettableClassFileTransformer resettableClassFileTransformer) {
                return ResettableClassFileTransformer.WithDelegation.Substitutable.m5136of(resettableClassFileTransformer);
            }
        }

        public enum NoOp implements TransformerDecorator {
            INSTANCE;

            @Override // net.bytebuddy.agent.builder.AgentBuilder.TransformerDecorator
            public ResettableClassFileTransformer decorate(ResettableClassFileTransformer resettableClassFileTransformer) {
                return resettableClassFileTransformer;
            }
        }

        ResettableClassFileTransformer decorate(ResettableClassFileTransformer resettableClassFileTransformer);
    }

    public interface TypeStrategy {

        public enum Default implements TypeStrategy {
            REBASE { // from class: net.bytebuddy.agent.builder.AgentBuilder.TypeStrategy.Default.1
                @Override // net.bytebuddy.agent.builder.AgentBuilder.TypeStrategy
                public DynamicType.Builder<?> builder(TypeDescription typeDescription, ByteBuddy byteBuddy, ClassFileLocator classFileLocator, MethodNameTransformer methodNameTransformer, @MaybeNull ClassLoader classLoader, @MaybeNull JavaModule javaModule, @MaybeNull ProtectionDomain protectionDomain) {
                    return byteBuddy.rebase(typeDescription, classFileLocator, methodNameTransformer);
                }
            },
            REDEFINE { // from class: net.bytebuddy.agent.builder.AgentBuilder.TypeStrategy.Default.2
                @Override // net.bytebuddy.agent.builder.AgentBuilder.TypeStrategy
                public DynamicType.Builder<?> builder(TypeDescription typeDescription, ByteBuddy byteBuddy, ClassFileLocator classFileLocator, MethodNameTransformer methodNameTransformer, @MaybeNull ClassLoader classLoader, @MaybeNull JavaModule javaModule, @MaybeNull ProtectionDomain protectionDomain) {
                    return byteBuddy.redefine(typeDescription, classFileLocator);
                }
            },
            REDEFINE_FROZEN { // from class: net.bytebuddy.agent.builder.AgentBuilder.TypeStrategy.Default.3
                @Override // net.bytebuddy.agent.builder.AgentBuilder.TypeStrategy
                public DynamicType.Builder<?> builder(TypeDescription typeDescription, ByteBuddy byteBuddy, ClassFileLocator classFileLocator, MethodNameTransformer methodNameTransformer, @MaybeNull ClassLoader classLoader, @MaybeNull JavaModule javaModule, @MaybeNull ProtectionDomain protectionDomain) {
                    return byteBuddy.with(InstrumentedType.Factory.Default.FROZEN).with(VisibilityBridgeStrategy.Default.NEVER).redefine(typeDescription, classFileLocator).ignoreAlso(LatentMatcher.ForSelfDeclaredMethod.NOT_DECLARED);
                }
            },
            DECORATE { // from class: net.bytebuddy.agent.builder.AgentBuilder.TypeStrategy.Default.4
                @Override // net.bytebuddy.agent.builder.AgentBuilder.TypeStrategy
                public DynamicType.Builder<?> builder(TypeDescription typeDescription, ByteBuddy byteBuddy, ClassFileLocator classFileLocator, MethodNameTransformer methodNameTransformer, @MaybeNull ClassLoader classLoader, @MaybeNull JavaModule javaModule, @MaybeNull ProtectionDomain protectionDomain) {
                    return byteBuddy.decorate(typeDescription, classFileLocator);
                }
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class ForBuildEntryPoint implements TypeStrategy {
            private final EntryPoint entryPoint;

            public ForBuildEntryPoint(EntryPoint entryPoint) {
                this.entryPoint = entryPoint;
            }

            @Override // net.bytebuddy.agent.builder.AgentBuilder.TypeStrategy
            public DynamicType.Builder<?> builder(TypeDescription typeDescription, ByteBuddy byteBuddy, ClassFileLocator classFileLocator, MethodNameTransformer methodNameTransformer, @MaybeNull ClassLoader classLoader, @MaybeNull JavaModule javaModule, @MaybeNull ProtectionDomain protectionDomain) {
                return this.entryPoint.transform(typeDescription, byteBuddy, classFileLocator, methodNameTransformer);
            }

            public boolean equals(@MaybeNull Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && getClass() == obj.getClass() && this.entryPoint.equals(((ForBuildEntryPoint) obj).entryPoint);
            }

            public int hashCode() {
                return (getClass().hashCode() * 31) + this.entryPoint.hashCode();
            }
        }

        DynamicType.Builder<?> builder(TypeDescription typeDescription, ByteBuddy byteBuddy, ClassFileLocator classFileLocator, MethodNameTransformer methodNameTransformer, @MaybeNull ClassLoader classLoader, @MaybeNull JavaModule javaModule, @MaybeNull ProtectionDomain protectionDomain);
    }

    AgentBuilder assureReadEdgeFromAndTo(Instrumentation instrumentation, Collection<? extends JavaModule> collection);

    AgentBuilder assureReadEdgeFromAndTo(Instrumentation instrumentation, Class<?>... clsArr);

    AgentBuilder assureReadEdgeFromAndTo(Instrumentation instrumentation, JavaModule... javaModuleArr);

    AgentBuilder assureReadEdgeTo(Instrumentation instrumentation, Collection<? extends JavaModule> collection);

    AgentBuilder assureReadEdgeTo(Instrumentation instrumentation, Class<?>... clsArr);

    AgentBuilder assureReadEdgeTo(Instrumentation instrumentation, JavaModule... javaModuleArr);

    AgentBuilder disableClassFormatChanges();

    AgentBuilder disableNativeMethodPrefix();

    AgentBuilder enableNativeMethodPrefix(String str);

    Ignored ignore(RawMatcher rawMatcher);

    Ignored ignore(ElementMatcher<? super TypeDescription> elementMatcher);

    Ignored ignore(ElementMatcher<? super TypeDescription> elementMatcher, ElementMatcher<? super ClassLoader> elementMatcher2);

    Ignored ignore(ElementMatcher<? super TypeDescription> elementMatcher, ElementMatcher<? super ClassLoader> elementMatcher2, ElementMatcher<? super JavaModule> elementMatcher3);

    ResettableClassFileTransformer installOn(Instrumentation instrumentation);

    ResettableClassFileTransformer installOnByteBuddyAgent();

    ClassFileTransformer makeRaw();

    ResettableClassFileTransformer patchOn(Instrumentation instrumentation, ResettableClassFileTransformer resettableClassFileTransformer);

    ResettableClassFileTransformer patchOn(Instrumentation instrumentation, ResettableClassFileTransformer resettableClassFileTransformer, PatchMode patchMode);

    ResettableClassFileTransformer patchOn(Instrumentation instrumentation, ResettableClassFileTransformer resettableClassFileTransformer, RawMatcher rawMatcher);

    ResettableClassFileTransformer patchOn(Instrumentation instrumentation, ResettableClassFileTransformer resettableClassFileTransformer, RawMatcher rawMatcher, PatchMode patchMode);

    ResettableClassFileTransformer patchOnByteBuddyAgent(ResettableClassFileTransformer resettableClassFileTransformer);

    ResettableClassFileTransformer patchOnByteBuddyAgent(ResettableClassFileTransformer resettableClassFileTransformer, PatchMode patchMode);

    Identified.Narrowable type(RawMatcher rawMatcher);

    Identified.Narrowable type(ElementMatcher<? super TypeDescription> elementMatcher);

    Identified.Narrowable type(ElementMatcher<? super TypeDescription> elementMatcher, ElementMatcher<? super ClassLoader> elementMatcher2);

    Identified.Narrowable type(ElementMatcher<? super TypeDescription> elementMatcher, ElementMatcher<? super ClassLoader> elementMatcher2, ElementMatcher<? super JavaModule> elementMatcher3);

    AgentBuilder warmUp(Collection<Class<?>> collection);

    AgentBuilder warmUp(Class<?>... clsArr);

    RedefinitionListenable.WithoutBatchStrategy with(RedefinitionStrategy redefinitionStrategy);

    AgentBuilder with(ByteBuddy byteBuddy);

    AgentBuilder with(CircularityLock circularityLock);

    AgentBuilder with(ClassFileBufferStrategy classFileBufferStrategy);

    AgentBuilder with(DescriptionStrategy descriptionStrategy);

    AgentBuilder with(FallbackStrategy fallbackStrategy);

    AgentBuilder with(InitializationStrategy initializationStrategy);

    AgentBuilder with(InjectionStrategy injectionStrategy);

    AgentBuilder with(InstallationListener installationListener);

    AgentBuilder with(LambdaInstrumentationStrategy lambdaInstrumentationStrategy);

    AgentBuilder with(Listener listener);

    AgentBuilder with(LocationStrategy locationStrategy);

    AgentBuilder with(PoolStrategy poolStrategy);

    AgentBuilder with(TransformerDecorator transformerDecorator);

    AgentBuilder with(TypeStrategy typeStrategy);

    AgentBuilder with(ClassFileLocator classFileLocator);
}
