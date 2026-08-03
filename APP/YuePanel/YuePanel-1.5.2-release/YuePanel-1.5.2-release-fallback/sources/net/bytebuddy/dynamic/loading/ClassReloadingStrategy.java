package net.bytebuddy.dynamic.loading;

/* JADX INFO: loaded from: classes2.dex */
@net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
public class ClassReloadingStrategy implements net.bytebuddy.dynamic.loading.ClassLoadingStrategy<java.lang.ClassLoader> {
    private static final boolean ACCESS_CONTROLLER = false;
    protected static final net.bytebuddy.dynamic.loading.ClassReloadingStrategy.Dispatcher DISPATCHER = null;
    private final net.bytebuddy.dynamic.loading.ClassReloadingStrategy.BootstrapInjection bootstrapInjection;
    private final java.lang.instrument.Instrumentation instrumentation;
    private final java.util.Map<java.lang.String, java.lang.Class<?>> preregisteredTypes;
    private final net.bytebuddy.dynamic.loading.ClassReloadingStrategy.Strategy strategy;

    /* JADX INFO: renamed from: net.bytebuddy.dynamic.loading.ClassReloadingStrategy$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public interface BootstrapInjection {

        public enum Disabled extends java.lang.Enum<net.bytebuddy.dynamic.loading.ClassReloadingStrategy.BootstrapInjection.Disabled> implements net.bytebuddy.dynamic.loading.ClassReloadingStrategy.BootstrapInjection {
            private static final /* synthetic */ net.bytebuddy.dynamic.loading.ClassReloadingStrategy.BootstrapInjection.Disabled[] $VALUES = null;
            public static final net.bytebuddy.dynamic.loading.ClassReloadingStrategy.BootstrapInjection.Disabled INSTANCE = null;

            static {
                    net.bytebuddy.dynamic.loading.ClassReloadingStrategy$BootstrapInjection$Disabled r0 = new net.bytebuddy.dynamic.loading.ClassReloadingStrategy$BootstrapInjection$Disabled
                    java.lang.String r1 = "INSTANCE"
                    r2 = 0
                    r0.<init>(r1, r2)
                    net.bytebuddy.dynamic.loading.ClassReloadingStrategy.BootstrapInjection.Disabled.INSTANCE = r0
                    net.bytebuddy.dynamic.loading.ClassReloadingStrategy$BootstrapInjection$Disabled[] r0 = new net.bytebuddy.dynamic.loading.ClassReloadingStrategy.BootstrapInjection.Disabled[]{r0}
                    net.bytebuddy.dynamic.loading.ClassReloadingStrategy.BootstrapInjection.Disabled.$VALUES = r0
                    return
            }

            Disabled(java.lang.String r1, int r2) {
                    r0 = this;
                    r0.<init>(r1, r2)
                    return
            }

            public static net.bytebuddy.dynamic.loading.ClassReloadingStrategy.BootstrapInjection.Disabled valueOf(java.lang.String r1) {
                    java.lang.Class<net.bytebuddy.dynamic.loading.ClassReloadingStrategy$BootstrapInjection$Disabled> r0 = net.bytebuddy.dynamic.loading.ClassReloadingStrategy.BootstrapInjection.Disabled.class
                    java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                    net.bytebuddy.dynamic.loading.ClassReloadingStrategy$BootstrapInjection$Disabled r1 = (net.bytebuddy.dynamic.loading.ClassReloadingStrategy.BootstrapInjection.Disabled) r1
                    return r1
            }

            public static net.bytebuddy.dynamic.loading.ClassReloadingStrategy.BootstrapInjection.Disabled[] values() {
                    net.bytebuddy.dynamic.loading.ClassReloadingStrategy$BootstrapInjection$Disabled[] r0 = net.bytebuddy.dynamic.loading.ClassReloadingStrategy.BootstrapInjection.Disabled.$VALUES
                    java.lang.Object r0 = r0.clone()
                    net.bytebuddy.dynamic.loading.ClassReloadingStrategy$BootstrapInjection$Disabled[] r0 = (net.bytebuddy.dynamic.loading.ClassReloadingStrategy.BootstrapInjection.Disabled[]) r0
                    return r0
            }

            @Override // net.bytebuddy.dynamic.loading.ClassReloadingStrategy.BootstrapInjection
            public net.bytebuddy.dynamic.loading.ClassInjector make(java.lang.instrument.Instrumentation r2) {
                    r1 = this;
                    java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                    java.lang.String r0 = "Bootstrap injection is not enabled"
                    r2.<init>(r0)
                    throw r2
            }
        }

        @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
        public static class Enabled implements net.bytebuddy.dynamic.loading.ClassReloadingStrategy.BootstrapInjection {
            private final java.io.File folder;

            public Enabled(java.io.File r1) {
                    r0 = this;
                    r0.<init>()
                    r0.folder = r1
                    return
            }

            public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r5) {
                    r4 = this;
                    r0 = 1
                    if (r4 != r5) goto L4
                    return r0
                L4:
                    r1 = 0
                    if (r5 != 0) goto L8
                    return r1
                L8:
                    java.lang.Class r2 = r4.getClass()
                    java.lang.Class r3 = r5.getClass()
                    if (r2 == r3) goto L13
                    return r1
                L13:
                    java.io.File r2 = r4.folder
                    net.bytebuddy.dynamic.loading.ClassReloadingStrategy$BootstrapInjection$Enabled r5 = (net.bytebuddy.dynamic.loading.ClassReloadingStrategy.BootstrapInjection.Enabled) r5
                    java.io.File r5 = r5.folder
                    boolean r5 = r2.equals(r5)
                    if (r5 != 0) goto L20
                    return r1
                L20:
                    return r0
            }

            public int hashCode() {
                    r2 = this;
                    java.lang.Class r0 = r2.getClass()
                    int r0 = r0.hashCode()
                    int r0 = r0 * 31
                    java.io.File r1 = r2.folder
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    return r0
            }

            @Override // net.bytebuddy.dynamic.loading.ClassReloadingStrategy.BootstrapInjection
            public net.bytebuddy.dynamic.loading.ClassInjector make(java.lang.instrument.Instrumentation r3) {
                    r2 = this;
                    java.io.File r0 = r2.folder
                    net.bytebuddy.dynamic.loading.ClassInjector$UsingInstrumentation$Target r1 = net.bytebuddy.dynamic.loading.ClassInjector.UsingInstrumentation.Target.BOOTSTRAP
                    net.bytebuddy.dynamic.loading.ClassInjector r3 = net.bytebuddy.dynamic.loading.ClassInjector.UsingInstrumentation.of(r0, r1, r3)
                    return r3
            }
        }

        net.bytebuddy.dynamic.loading.ClassInjector make(java.lang.instrument.Instrumentation r1);
    }

    @net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied("java.lang.instrument.Instrumentation")
    public interface Dispatcher {
        @net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied("addTransformer")
        void addTransformer(java.lang.instrument.Instrumentation r1, java.lang.instrument.ClassFileTransformer r2, boolean r3);

        @net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied("isModifiableClass")
        boolean isModifiableClass(java.lang.instrument.Instrumentation r1, java.lang.Class<?> r2);

        @net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied("isRetransformClassesSupported")
        boolean isRetransformClassesSupported(java.lang.instrument.Instrumentation r1);

        @net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied("retransformClasses")
        void retransformClasses(java.lang.instrument.Instrumentation r1, java.lang.Class<?>[] r2) throws java.lang.instrument.UnmodifiableClassException;
    }

    public enum Strategy extends java.lang.Enum<net.bytebuddy.dynamic.loading.ClassReloadingStrategy.Strategy> {
        private static final /* synthetic */ net.bytebuddy.dynamic.loading.ClassReloadingStrategy.Strategy[] $VALUES = null;

        @net.bytebuddy.utility.nullability.AlwaysNull
        private static final byte[] NO_REDEFINITION = null;
        private static final boolean REDEFINE_CLASSES = true;
        public static final net.bytebuddy.dynamic.loading.ClassReloadingStrategy.Strategy REDEFINITION = null;
        public static final net.bytebuddy.dynamic.loading.ClassReloadingStrategy.Strategy RETRANSFORMATION = null;
        private final boolean redefinition;



        public static class ClassRedefinitionTransformer implements java.lang.instrument.ClassFileTransformer {
            private final java.util.Map<java.lang.Class<?>, java.lang.instrument.ClassDefinition> redefinedClasses;

            public ClassRedefinitionTransformer(java.util.Map<java.lang.Class<?>, java.lang.instrument.ClassDefinition> r1) {
                    r0 = this;
                    r0.<init>()
                    r0.redefinedClasses = r1
                    return
            }

            public void assertTransformation() {
                    r3 = this;
                    java.util.Map<java.lang.Class<?>, java.lang.instrument.ClassDefinition> r0 = r3.redefinedClasses
                    boolean r0 = r0.isEmpty()
                    if (r0 == 0) goto L9
                    return
                L9:
                    java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    java.lang.String r2 = "Could not transform: "
                    r1.append(r2)
                    java.util.Map<java.lang.Class<?>, java.lang.instrument.ClassDefinition> r2 = r3.redefinedClasses
                    java.util.Set r2 = r2.keySet()
                    r1.append(r2)
                    java.lang.String r1 = r1.toString()
                    r0.<init>(r1)
                    throw r0
            }

            @net.bytebuddy.utility.nullability.MaybeNull
            public byte[] transform(@net.bytebuddy.utility.nullability.MaybeNull java.lang.ClassLoader r1, @net.bytebuddy.utility.nullability.MaybeNull java.lang.String r2, @net.bytebuddy.utility.nullability.MaybeNull java.lang.Class<?> r3, java.security.ProtectionDomain r4, byte[] r5) {
                    r0 = this;
                    if (r2 != 0) goto L7
                    byte[] r1 = net.bytebuddy.dynamic.loading.ClassReloadingStrategy.Strategy.access$100()
                    return r1
                L7:
                    java.util.Map<java.lang.Class<?>, java.lang.instrument.ClassDefinition> r1 = r0.redefinedClasses
                    java.lang.Object r1 = r1.remove(r3)
                    java.lang.instrument.ClassDefinition r1 = (java.lang.instrument.ClassDefinition) r1
                    if (r1 != 0) goto L16
                    byte[] r1 = net.bytebuddy.dynamic.loading.ClassReloadingStrategy.Strategy.access$100()
                    goto L1a
                L16:
                    byte[] r1 = r1.getDefinitionClassFile()
                L1a:
                    return r1
            }
        }

        public enum ClassResettingTransformer extends java.lang.Enum<net.bytebuddy.dynamic.loading.ClassReloadingStrategy.Strategy.ClassResettingTransformer> implements java.lang.instrument.ClassFileTransformer {
            private static final /* synthetic */ net.bytebuddy.dynamic.loading.ClassReloadingStrategy.Strategy.ClassResettingTransformer[] $VALUES = null;
            public static final net.bytebuddy.dynamic.loading.ClassReloadingStrategy.Strategy.ClassResettingTransformer INSTANCE = null;

            static {
                    net.bytebuddy.dynamic.loading.ClassReloadingStrategy$Strategy$ClassResettingTransformer r0 = new net.bytebuddy.dynamic.loading.ClassReloadingStrategy$Strategy$ClassResettingTransformer
                    java.lang.String r1 = "INSTANCE"
                    r2 = 0
                    r0.<init>(r1, r2)
                    net.bytebuddy.dynamic.loading.ClassReloadingStrategy.Strategy.ClassResettingTransformer.INSTANCE = r0
                    net.bytebuddy.dynamic.loading.ClassReloadingStrategy$Strategy$ClassResettingTransformer[] r0 = new net.bytebuddy.dynamic.loading.ClassReloadingStrategy.Strategy.ClassResettingTransformer[]{r0}
                    net.bytebuddy.dynamic.loading.ClassReloadingStrategy.Strategy.ClassResettingTransformer.$VALUES = r0
                    return
            }

            ClassResettingTransformer(java.lang.String r1, int r2) {
                    r0 = this;
                    r0.<init>(r1, r2)
                    return
            }

            public static net.bytebuddy.dynamic.loading.ClassReloadingStrategy.Strategy.ClassResettingTransformer valueOf(java.lang.String r1) {
                    java.lang.Class<net.bytebuddy.dynamic.loading.ClassReloadingStrategy$Strategy$ClassResettingTransformer> r0 = net.bytebuddy.dynamic.loading.ClassReloadingStrategy.Strategy.ClassResettingTransformer.class
                    java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                    net.bytebuddy.dynamic.loading.ClassReloadingStrategy$Strategy$ClassResettingTransformer r1 = (net.bytebuddy.dynamic.loading.ClassReloadingStrategy.Strategy.ClassResettingTransformer) r1
                    return r1
            }

            public static net.bytebuddy.dynamic.loading.ClassReloadingStrategy.Strategy.ClassResettingTransformer[] values() {
                    net.bytebuddy.dynamic.loading.ClassReloadingStrategy$Strategy$ClassResettingTransformer[] r0 = net.bytebuddy.dynamic.loading.ClassReloadingStrategy.Strategy.ClassResettingTransformer.$VALUES
                    java.lang.Object r0 = r0.clone()
                    net.bytebuddy.dynamic.loading.ClassReloadingStrategy$Strategy$ClassResettingTransformer[] r0 = (net.bytebuddy.dynamic.loading.ClassReloadingStrategy.Strategy.ClassResettingTransformer[]) r0
                    return r0
            }

            @net.bytebuddy.utility.nullability.MaybeNull
            public byte[] transform(@net.bytebuddy.utility.nullability.MaybeNull java.lang.ClassLoader r1, @net.bytebuddy.utility.nullability.MaybeNull java.lang.String r2, @net.bytebuddy.utility.nullability.MaybeNull java.lang.Class<?> r3, java.security.ProtectionDomain r4, byte[] r5) {
                    r0 = this;
                    byte[] r1 = net.bytebuddy.dynamic.loading.ClassReloadingStrategy.Strategy.access$100()
                    return r1
            }
        }

        static {
                net.bytebuddy.dynamic.loading.ClassReloadingStrategy$Strategy$1 r0 = new net.bytebuddy.dynamic.loading.ClassReloadingStrategy$Strategy$1
                java.lang.String r1 = "REDEFINITION"
                r2 = 0
                r3 = 1
                r0.<init>(r1, r2, r3)
                net.bytebuddy.dynamic.loading.ClassReloadingStrategy.Strategy.REDEFINITION = r0
                net.bytebuddy.dynamic.loading.ClassReloadingStrategy$Strategy$2 r1 = new net.bytebuddy.dynamic.loading.ClassReloadingStrategy$Strategy$2
                java.lang.String r4 = "RETRANSFORMATION"
                r1.<init>(r4, r3, r2)
                net.bytebuddy.dynamic.loading.ClassReloadingStrategy.Strategy.RETRANSFORMATION = r1
                r4 = 2
                net.bytebuddy.dynamic.loading.ClassReloadingStrategy$Strategy[] r4 = new net.bytebuddy.dynamic.loading.ClassReloadingStrategy.Strategy[r4]
                r4[r2] = r0
                r4[r3] = r1
                net.bytebuddy.dynamic.loading.ClassReloadingStrategy.Strategy.$VALUES = r4
                r0 = 0
                net.bytebuddy.dynamic.loading.ClassReloadingStrategy.Strategy.NO_REDEFINITION = r0
                return
        }

        Strategy(java.lang.String r1, int r2, boolean r3) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.redefinition = r3
                return
        }

        /* synthetic */ Strategy(java.lang.String r1, int r2, boolean r3, net.bytebuddy.dynamic.loading.ClassReloadingStrategy.AnonymousClass1 r4) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                return
        }

        public static /* synthetic */ byte[] access$100() {
                byte[] r0 = net.bytebuddy.dynamic.loading.ClassReloadingStrategy.Strategy.NO_REDEFINITION
                return r0
        }

        public static net.bytebuddy.dynamic.loading.ClassReloadingStrategy.Strategy valueOf(java.lang.String r1) {
                java.lang.Class<net.bytebuddy.dynamic.loading.ClassReloadingStrategy$Strategy> r0 = net.bytebuddy.dynamic.loading.ClassReloadingStrategy.Strategy.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                net.bytebuddy.dynamic.loading.ClassReloadingStrategy$Strategy r1 = (net.bytebuddy.dynamic.loading.ClassReloadingStrategy.Strategy) r1
                return r1
        }

        public static net.bytebuddy.dynamic.loading.ClassReloadingStrategy.Strategy[] values() {
                net.bytebuddy.dynamic.loading.ClassReloadingStrategy$Strategy[] r0 = net.bytebuddy.dynamic.loading.ClassReloadingStrategy.Strategy.$VALUES
                java.lang.Object r0 = r0.clone()
                net.bytebuddy.dynamic.loading.ClassReloadingStrategy$Strategy[] r0 = (net.bytebuddy.dynamic.loading.ClassReloadingStrategy.Strategy[]) r0
                return r0
        }

        public abstract void apply(java.lang.instrument.Instrumentation r1, java.util.Map<java.lang.Class<?>, java.lang.instrument.ClassDefinition> r2) throws java.lang.instrument.UnmodifiableClassException, java.lang.ClassNotFoundException;

        public boolean isRedefinition() {
                r1 = this;
                boolean r0 = r1.redefinition
                return r0
        }

        public abstract void reset(java.lang.instrument.Instrumentation r1, net.bytebuddy.dynamic.ClassFileLocator r2, java.util.List<java.lang.Class<?>> r3) throws java.io.IOException, java.lang.instrument.UnmodifiableClassException, java.lang.ClassNotFoundException;

        public abstract net.bytebuddy.dynamic.loading.ClassReloadingStrategy.Strategy validate(java.lang.instrument.Instrumentation r1);
    }

    static {
            r0 = 0
            java.lang.String r1 = "java.security.AccessController"
            r2 = 0
            java.lang.Class.forName(r1, r0, r2)     // Catch: java.lang.SecurityException -> L16 java.lang.ClassNotFoundException -> L17
            java.lang.String r1 = "net.bytebuddy.securitymanager"
            java.lang.String r2 = "true"
            java.lang.String r1 = java.lang.System.getProperty(r1, r2)     // Catch: java.lang.SecurityException -> L16 java.lang.ClassNotFoundException -> L17
            boolean r1 = java.lang.Boolean.parseBoolean(r1)     // Catch: java.lang.SecurityException -> L16 java.lang.ClassNotFoundException -> L17
            net.bytebuddy.dynamic.loading.ClassReloadingStrategy.ACCESS_CONTROLLER = r1     // Catch: java.lang.SecurityException -> L16 java.lang.ClassNotFoundException -> L17
            goto L19
        L16:
            r0 = 1
        L17:
            net.bytebuddy.dynamic.loading.ClassReloadingStrategy.ACCESS_CONTROLLER = r0
        L19:
            java.lang.Class<net.bytebuddy.dynamic.loading.ClassReloadingStrategy$Dispatcher> r0 = net.bytebuddy.dynamic.loading.ClassReloadingStrategy.Dispatcher.class
            java.security.PrivilegedAction r0 = net.bytebuddy.utility.dispatcher.JavaDispatcher.of(r0)
            java.lang.Object r0 = doPrivileged(r0)
            net.bytebuddy.dynamic.loading.ClassReloadingStrategy$Dispatcher r0 = (net.bytebuddy.dynamic.loading.ClassReloadingStrategy.Dispatcher) r0
            net.bytebuddy.dynamic.loading.ClassReloadingStrategy.DISPATCHER = r0
            return
    }

    public ClassReloadingStrategy(java.lang.instrument.Instrumentation r3, net.bytebuddy.dynamic.loading.ClassReloadingStrategy.Strategy r4) {
            r2 = this;
            net.bytebuddy.dynamic.loading.ClassReloadingStrategy$BootstrapInjection$Disabled r0 = net.bytebuddy.dynamic.loading.ClassReloadingStrategy.BootstrapInjection.Disabled.INSTANCE
            java.util.Map r1 = java.util.Collections.emptyMap()
            r2.<init>(r3, r4, r0, r1)
            return
    }

    public ClassReloadingStrategy(java.lang.instrument.Instrumentation r1, net.bytebuddy.dynamic.loading.ClassReloadingStrategy.Strategy r2, net.bytebuddy.dynamic.loading.ClassReloadingStrategy.BootstrapInjection r3, java.util.Map<java.lang.String, java.lang.Class<?>> r4) {
            r0 = this;
            r0.<init>()
            r0.instrumentation = r1
            net.bytebuddy.dynamic.loading.ClassReloadingStrategy$Strategy r1 = r2.validate(r1)
            r0.strategy = r1
            r0.bootstrapInjection = r3
            r0.preregisteredTypes = r4
            return
    }

    @net.bytebuddy.build.AccessControllerPlugin.Enhance
    private static <T> T doPrivileged(java.security.PrivilegedAction<T> r1) {
            boolean r0 = net.bytebuddy.dynamic.loading.ClassReloadingStrategy.ACCESS_CONTROLLER
            if (r0 == 0) goto L9
            java.lang.Object r1 = java.security.AccessController.doPrivileged(r1)
            return r1
        L9:
            java.lang.Object r1 = r1.run()
            return r1
    }

    public static net.bytebuddy.dynamic.loading.ClassReloadingStrategy fromInstalledAgent() {
            java.lang.instrument.Instrumentation r0 = resolveByteBuddyAgentInstrumentation()
            net.bytebuddy.dynamic.loading.ClassReloadingStrategy r0 = of(r0)
            return r0
    }

    public static net.bytebuddy.dynamic.loading.ClassReloadingStrategy fromInstalledAgent(net.bytebuddy.dynamic.loading.ClassReloadingStrategy.Strategy r2) {
            net.bytebuddy.dynamic.loading.ClassReloadingStrategy r0 = new net.bytebuddy.dynamic.loading.ClassReloadingStrategy
            java.lang.instrument.Instrumentation r1 = resolveByteBuddyAgentInstrumentation()
            r0.<init>(r1, r2)
            return r0
    }

    public static net.bytebuddy.dynamic.loading.ClassReloadingStrategy of(java.lang.instrument.Instrumentation r3) {
            net.bytebuddy.dynamic.loading.ClassReloadingStrategy$Dispatcher r0 = net.bytebuddy.dynamic.loading.ClassReloadingStrategy.DISPATCHER
            boolean r0 = r0.isRetransformClassesSupported(r3)
            if (r0 == 0) goto L10
            net.bytebuddy.dynamic.loading.ClassReloadingStrategy r0 = new net.bytebuddy.dynamic.loading.ClassReloadingStrategy
            net.bytebuddy.dynamic.loading.ClassReloadingStrategy$Strategy r1 = net.bytebuddy.dynamic.loading.ClassReloadingStrategy.Strategy.RETRANSFORMATION
            r0.<init>(r3, r1)
            return r0
        L10:
            boolean r0 = r3.isRedefineClassesSupported()
            if (r0 == 0) goto L1e
            net.bytebuddy.dynamic.loading.ClassReloadingStrategy r0 = new net.bytebuddy.dynamic.loading.ClassReloadingStrategy
            net.bytebuddy.dynamic.loading.ClassReloadingStrategy$Strategy r1 = net.bytebuddy.dynamic.loading.ClassReloadingStrategy.Strategy.REDEFINITION
            r0.<init>(r3, r1)
            return r0
        L1e:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Instrumentation does not support reloading of classes: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    private static java.lang.instrument.Instrumentation resolveByteBuddyAgentInstrumentation() {
            java.lang.ClassLoader r0 = java.lang.ClassLoader.getSystemClassLoader()     // Catch: java.lang.Exception -> L3c java.lang.RuntimeException -> L3e
            java.lang.String r1 = "net.bytebuddy.agent.Installer"
            java.lang.Class r0 = r0.loadClass(r1)     // Catch: java.lang.Exception -> L3c java.lang.RuntimeException -> L3e
            java.lang.Class<net.bytebuddy.agent.builder.AgentBuilder> r1 = net.bytebuddy.agent.builder.AgentBuilder.class
            net.bytebuddy.utility.JavaModule r1 = net.bytebuddy.utility.JavaModule.ofType(r1)     // Catch: java.lang.Exception -> L3c java.lang.RuntimeException -> L3e
            net.bytebuddy.utility.JavaModule r2 = net.bytebuddy.utility.JavaModule.ofType(r0)     // Catch: java.lang.Exception -> L3c java.lang.RuntimeException -> L3e
            if (r1 == 0) goto L40
            boolean r3 = r1.canRead(r2)     // Catch: java.lang.Exception -> L3c java.lang.RuntimeException -> L3e
            if (r3 != 0) goto L40
            java.lang.String r3 = "java.lang.Module"
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.Exception -> L3c java.lang.RuntimeException -> L3e
            java.lang.String r4 = "addReads"
            java.lang.Class[] r5 = new java.lang.Class[]{r3}     // Catch: java.lang.Exception -> L3c java.lang.RuntimeException -> L3e
            java.lang.reflect.Method r3 = r3.getMethod(r4, r5)     // Catch: java.lang.Exception -> L3c java.lang.RuntimeException -> L3e
            java.lang.Object r1 = r1.unwrap()     // Catch: java.lang.Exception -> L3c java.lang.RuntimeException -> L3e
            java.lang.Object r2 = r2.unwrap()     // Catch: java.lang.Exception -> L3c java.lang.RuntimeException -> L3e
            java.lang.Object[] r2 = new java.lang.Object[]{r2}     // Catch: java.lang.Exception -> L3c java.lang.RuntimeException -> L3e
            r3.invoke(r1, r2)     // Catch: java.lang.Exception -> L3c java.lang.RuntimeException -> L3e
            goto L40
        L3c:
            r0 = move-exception
            goto L4e
        L3e:
            r0 = move-exception
            goto L56
        L40:
            java.lang.String r1 = "getInstrumentation"
            r2 = 0
            java.lang.reflect.Method r0 = r0.getMethod(r1, r2)     // Catch: java.lang.Exception -> L3c java.lang.RuntimeException -> L3e
            java.lang.Object r0 = r0.invoke(r2, r2)     // Catch: java.lang.Exception -> L3c java.lang.RuntimeException -> L3e
            java.lang.instrument.Instrumentation r0 = (java.lang.instrument.Instrumentation) r0     // Catch: java.lang.Exception -> L3c java.lang.RuntimeException -> L3e
            return r0
        L4e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "The Byte Buddy agent is not installed or not accessible"
            r1.<init>(r2, r0)
            throw r1
        L56:
            throw r0
    }

    public net.bytebuddy.dynamic.loading.ClassReloadingStrategy enableBootstrapInjection(java.io.File r5) {
            r4 = this;
            net.bytebuddy.dynamic.loading.ClassReloadingStrategy r0 = new net.bytebuddy.dynamic.loading.ClassReloadingStrategy
            java.lang.instrument.Instrumentation r1 = r4.instrumentation
            net.bytebuddy.dynamic.loading.ClassReloadingStrategy$Strategy r2 = r4.strategy
            net.bytebuddy.dynamic.loading.ClassReloadingStrategy$BootstrapInjection$Enabled r3 = new net.bytebuddy.dynamic.loading.ClassReloadingStrategy$BootstrapInjection$Enabled
            r3.<init>(r5)
            java.util.Map<java.lang.String, java.lang.Class<?>> r5 = r4.preregisteredTypes
            r0.<init>(r1, r2, r3, r5)
            return r0
    }

    public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 != 0) goto L8
            return r1
        L8:
            java.lang.Class r2 = r4.getClass()
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L13
            return r1
        L13:
            net.bytebuddy.dynamic.loading.ClassReloadingStrategy$Strategy r2 = r4.strategy
            net.bytebuddy.dynamic.loading.ClassReloadingStrategy r5 = (net.bytebuddy.dynamic.loading.ClassReloadingStrategy) r5
            net.bytebuddy.dynamic.loading.ClassReloadingStrategy$Strategy r3 = r5.strategy
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L20
            return r1
        L20:
            java.lang.instrument.Instrumentation r2 = r4.instrumentation
            java.lang.instrument.Instrumentation r3 = r5.instrumentation
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L2b
            return r1
        L2b:
            net.bytebuddy.dynamic.loading.ClassReloadingStrategy$BootstrapInjection r2 = r4.bootstrapInjection
            net.bytebuddy.dynamic.loading.ClassReloadingStrategy$BootstrapInjection r3 = r5.bootstrapInjection
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L36
            return r1
        L36:
            java.util.Map<java.lang.String, java.lang.Class<?>> r2 = r4.preregisteredTypes
            java.util.Map<java.lang.String, java.lang.Class<?>> r5 = r5.preregisteredTypes
            boolean r5 = r2.equals(r5)
            if (r5 != 0) goto L41
            return r1
        L41:
            return r0
    }

    public int hashCode() {
            r2 = this;
            java.lang.Class r0 = r2.getClass()
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.lang.instrument.Instrumentation r1 = r2.instrumentation
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            net.bytebuddy.dynamic.loading.ClassReloadingStrategy$Strategy r1 = r2.strategy
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            net.bytebuddy.dynamic.loading.ClassReloadingStrategy$BootstrapInjection r1 = r2.bootstrapInjection
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.util.Map<java.lang.String, java.lang.Class<?>> r1 = r2.preregisteredTypes
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            return r0
    }

    @Override // net.bytebuddy.dynamic.loading.ClassLoadingStrategy
    public java.util.Map<net.bytebuddy.description.type.TypeDescription, java.lang.Class<?>> load(@net.bytebuddy.utility.nullability.MaybeNull java.lang.ClassLoader r9, java.util.Map<net.bytebuddy.description.type.TypeDescription, byte[]> r10) {
            r8 = this;
            java.util.HashMap r0 = new java.util.HashMap
            java.util.Map<java.lang.String, java.lang.Class<?>> r1 = r8.preregisteredTypes
            r0.<init>(r1)
            java.lang.instrument.Instrumentation r1 = r8.instrumentation
            java.lang.Class[] r1 = r1.getInitiatedClasses(r9)
            int r2 = r1.length
            r3 = 0
        Lf:
            if (r3 >= r2) goto L1d
            r4 = r1[r3]
            java.lang.String r5 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.getName(r4)
            r0.put(r5, r4)
            int r3 = r3 + 1
            goto Lf
        L1d:
            java.util.concurrent.ConcurrentHashMap r1 = new java.util.concurrent.ConcurrentHashMap
            r1.<init>()
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>()
            java.util.Set r10 = r10.entrySet()
            java.util.Iterator r10 = r10.iterator()
        L34:
            boolean r4 = r10.hasNext()
            if (r4 == 0) goto L74
            java.lang.Object r4 = r10.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r5 = r4.getKey()
            net.bytebuddy.description.type.TypeDescription r5 = (net.bytebuddy.description.type.TypeDescription) r5
            java.lang.String r5 = r5.getName()
            java.lang.Object r5 = r0.get(r5)
            java.lang.Class r5 = (java.lang.Class) r5
            if (r5 == 0) goto L68
            java.lang.instrument.ClassDefinition r6 = new java.lang.instrument.ClassDefinition
            java.lang.Object r7 = r4.getValue()
            byte[] r7 = (byte[]) r7
            r6.<init>(r5, r7)
            r1.put(r5, r6)
            java.lang.Object r4 = r4.getKey()
            r2.put(r4, r5)
            goto L34
        L68:
            java.lang.Object r5 = r4.getKey()
            java.lang.Object r4 = r4.getValue()
            r3.put(r5, r4)
            goto L34
        L74:
            net.bytebuddy.dynamic.loading.ClassReloadingStrategy$Strategy r10 = r8.strategy     // Catch: java.lang.instrument.UnmodifiableClassException -> L8c java.lang.ClassNotFoundException -> L8e
            java.lang.instrument.Instrumentation r0 = r8.instrumentation     // Catch: java.lang.instrument.UnmodifiableClassException -> L8c java.lang.ClassNotFoundException -> L8e
            r10.apply(r0, r1)     // Catch: java.lang.instrument.UnmodifiableClassException -> L8c java.lang.ClassNotFoundException -> L8e
            boolean r10 = r3.isEmpty()     // Catch: java.lang.instrument.UnmodifiableClassException -> L8c java.lang.ClassNotFoundException -> L8e
            if (r10 != 0) goto L9d
            if (r9 != 0) goto L90
            net.bytebuddy.dynamic.loading.ClassReloadingStrategy$BootstrapInjection r9 = r8.bootstrapInjection     // Catch: java.lang.instrument.UnmodifiableClassException -> L8c java.lang.ClassNotFoundException -> L8e
            java.lang.instrument.Instrumentation r10 = r8.instrumentation     // Catch: java.lang.instrument.UnmodifiableClassException -> L8c java.lang.ClassNotFoundException -> L8e
            net.bytebuddy.dynamic.loading.ClassInjector r9 = r9.make(r10)     // Catch: java.lang.instrument.UnmodifiableClassException -> L8c java.lang.ClassNotFoundException -> L8e
            goto L96
        L8c:
            r9 = move-exception
            goto L9e
        L8e:
            r9 = move-exception
            goto La6
        L90:
            net.bytebuddy.dynamic.loading.ClassInjector$UsingReflection r10 = new net.bytebuddy.dynamic.loading.ClassInjector$UsingReflection     // Catch: java.lang.instrument.UnmodifiableClassException -> L8c java.lang.ClassNotFoundException -> L8e
            r10.<init>(r9)     // Catch: java.lang.instrument.UnmodifiableClassException -> L8c java.lang.ClassNotFoundException -> L8e
            r9 = r10
        L96:
            java.util.Map r9 = r9.inject(r3)     // Catch: java.lang.instrument.UnmodifiableClassException -> L8c java.lang.ClassNotFoundException -> L8e
            r2.putAll(r9)     // Catch: java.lang.instrument.UnmodifiableClassException -> L8c java.lang.ClassNotFoundException -> L8e
        L9d:
            return r2
        L9e:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "Cannot redefine specified class"
            r10.<init>(r0, r9)
            throw r10
        La6:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Could not locate classes for redefinition"
            r10.<init>(r0, r9)
            throw r10
    }

    public net.bytebuddy.dynamic.loading.ClassReloadingStrategy preregistered(java.lang.Class<?>... r6) {
            r5 = this;
            java.util.HashMap r0 = new java.util.HashMap
            java.util.Map<java.lang.String, java.lang.Class<?>> r1 = r5.preregisteredTypes
            r0.<init>(r1)
            int r1 = r6.length
            r2 = 0
        L9:
            if (r2 >= r1) goto L17
            r3 = r6[r2]
            java.lang.String r4 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.getName(r3)
            r0.put(r4, r3)
            int r2 = r2 + 1
            goto L9
        L17:
            net.bytebuddy.dynamic.loading.ClassReloadingStrategy r6 = new net.bytebuddy.dynamic.loading.ClassReloadingStrategy
            java.lang.instrument.Instrumentation r1 = r5.instrumentation
            net.bytebuddy.dynamic.loading.ClassReloadingStrategy$Strategy r2 = r5.strategy
            net.bytebuddy.dynamic.loading.ClassReloadingStrategy$BootstrapInjection r3 = r5.bootstrapInjection
            r6.<init>(r1, r2, r3, r0)
            return r6
    }

    public net.bytebuddy.dynamic.loading.ClassReloadingStrategy reset(net.bytebuddy.dynamic.ClassFileLocator r4, java.lang.Class<?>... r5) throws java.io.IOException {
            r3 = this;
            int r0 = r5.length
            if (r0 <= 0) goto L49
            net.bytebuddy.dynamic.loading.ClassReloadingStrategy$Strategy r0 = r3.strategy     // Catch: java.lang.instrument.UnmodifiableClassException -> Lf java.lang.ClassNotFoundException -> L11
            java.lang.instrument.Instrumentation r1 = r3.instrumentation     // Catch: java.lang.instrument.UnmodifiableClassException -> Lf java.lang.ClassNotFoundException -> L11
            java.util.List r2 = java.util.Arrays.asList(r5)     // Catch: java.lang.instrument.UnmodifiableClassException -> Lf java.lang.ClassNotFoundException -> L11
            r0.reset(r1, r4, r2)     // Catch: java.lang.instrument.UnmodifiableClassException -> Lf java.lang.ClassNotFoundException -> L11
            goto L49
        Lf:
            r4 = move-exception
            goto L13
        L11:
            r4 = move-exception
            goto L2e
        L13:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Cannot reset types "
            r1.append(r2)
            java.lang.String r5 = java.util.Arrays.toString(r5)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r0.<init>(r5, r4)
            throw r0
        L2e:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Cannot locate types "
            r1.append(r2)
            java.lang.String r5 = java.util.Arrays.toString(r5)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r0.<init>(r5, r4)
            throw r0
        L49:
            return r3
    }

    public net.bytebuddy.dynamic.loading.ClassReloadingStrategy reset(java.lang.Class<?>... r2) throws java.io.IOException {
            r1 = this;
            int r0 = r2.length
            if (r0 != 0) goto L5
            r2 = r1
            goto L14
        L5:
            r0 = 0
            r0 = r2[r0]
            java.lang.ClassLoader r0 = r0.getClassLoader()
            net.bytebuddy.dynamic.ClassFileLocator r0 = net.bytebuddy.dynamic.ClassFileLocator.ForClassLoader.of(r0)
            net.bytebuddy.dynamic.loading.ClassReloadingStrategy r2 = r1.reset(r0, r2)
        L14:
            return r2
    }
}
