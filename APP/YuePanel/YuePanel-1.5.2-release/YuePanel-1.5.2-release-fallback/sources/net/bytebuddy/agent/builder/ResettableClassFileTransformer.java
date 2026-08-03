package net.bytebuddy.agent.builder;

/* JADX INFO: loaded from: classes2.dex */
public interface ResettableClassFileTransformer extends java.lang.instrument.ClassFileTransformer {

    public static abstract class AbstractBase implements net.bytebuddy.agent.builder.ResettableClassFileTransformer {
        public AbstractBase() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // net.bytebuddy.agent.builder.ResettableClassFileTransformer
        public boolean reset(java.lang.instrument.Instrumentation r2, net.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy r3) {
                r1 = this;
                net.bytebuddy.agent.builder.AgentBuilder$RedefinitionStrategy$BatchAllocator$ForTotal r0 = net.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.BatchAllocator.ForTotal.INSTANCE
                boolean r2 = r1.reset(r2, r3, r0)
                return r2
        }

        @Override // net.bytebuddy.agent.builder.ResettableClassFileTransformer
        public boolean reset(java.lang.instrument.Instrumentation r2, net.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy r3, net.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.BatchAllocator r4) {
                r1 = this;
                net.bytebuddy.agent.builder.AgentBuilder$RedefinitionStrategy$Listener$NoOp r0 = net.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.Listener.NoOp.INSTANCE
                boolean r2 = r1.reset(r2, r3, r4, r0)
                return r2
        }

        @Override // net.bytebuddy.agent.builder.ResettableClassFileTransformer
        public boolean reset(java.lang.instrument.Instrumentation r7, net.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy r8, net.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.BatchAllocator r9, net.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.DiscoveryStrategy r10) {
                r6 = this;
                net.bytebuddy.agent.builder.AgentBuilder$RedefinitionStrategy$Listener$NoOp r5 = net.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.Listener.NoOp.INSTANCE
                r0 = r6
                r1 = r7
                r2 = r8
                r3 = r10
                r4 = r9
                boolean r7 = r0.reset(r1, r2, r3, r4, r5)
                return r7
        }

        @Override // net.bytebuddy.agent.builder.ResettableClassFileTransformer
        public boolean reset(java.lang.instrument.Instrumentation r7, net.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy r8, net.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.BatchAllocator r9, net.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.Listener r10) {
                r6 = this;
                net.bytebuddy.agent.builder.AgentBuilder$RedefinitionStrategy$DiscoveryStrategy$SinglePass r3 = net.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.DiscoveryStrategy.SinglePass.INSTANCE
                r0 = r6
                r1 = r7
                r2 = r8
                r4 = r9
                r5 = r10
                boolean r7 = r0.reset(r1, r2, r3, r4, r5)
                return r7
        }

        @Override // net.bytebuddy.agent.builder.ResettableClassFileTransformer
        public boolean reset(java.lang.instrument.Instrumentation r2, net.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy r3, net.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.DiscoveryStrategy r4) {
                r1 = this;
                net.bytebuddy.agent.builder.AgentBuilder$RedefinitionStrategy$Listener$NoOp r0 = net.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.Listener.NoOp.INSTANCE
                boolean r2 = r1.reset(r2, r3, r4, r0)
                return r2
        }

        @Override // net.bytebuddy.agent.builder.ResettableClassFileTransformer
        public boolean reset(java.lang.instrument.Instrumentation r8, net.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy r9, net.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.DiscoveryStrategy r10, net.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.BatchAllocator r11, net.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.Listener r12) {
                r7 = this;
                r0 = r7
                r1 = r8
                r2 = r7
                r3 = r9
                r4 = r10
                r5 = r11
                r6 = r12
                boolean r8 = r0.reset(r1, r2, r3, r4, r5, r6)
                return r8
        }

        @Override // net.bytebuddy.agent.builder.ResettableClassFileTransformer
        public boolean reset(java.lang.instrument.Instrumentation r7, net.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy r8, net.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.DiscoveryStrategy r9, net.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.Listener r10) {
                r6 = this;
                net.bytebuddy.agent.builder.AgentBuilder$RedefinitionStrategy$BatchAllocator$ForTotal r4 = net.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.BatchAllocator.ForTotal.INSTANCE
                r0 = r6
                r1 = r7
                r2 = r8
                r3 = r9
                r5 = r10
                boolean r7 = r0.reset(r1, r2, r3, r4, r5)
                return r7
        }
    }

    public interface Substitutable extends net.bytebuddy.agent.builder.ResettableClassFileTransformer {
        void substitute(net.bytebuddy.agent.builder.ResettableClassFileTransformer r1);

        net.bytebuddy.agent.builder.ResettableClassFileTransformer unwrap();
    }

    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
    public static abstract class WithDelegation extends net.bytebuddy.agent.builder.ResettableClassFileTransformer.AbstractBase {
        protected final net.bytebuddy.agent.builder.ResettableClassFileTransformer classFileTransformer;

        @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
        public static class Substitutable extends net.bytebuddy.agent.builder.ResettableClassFileTransformer.AbstractBase implements net.bytebuddy.agent.builder.ResettableClassFileTransformer.Substitutable {
            private static final boolean ACCESS_CONTROLLER = false;
            private static final net.bytebuddy.agent.builder.ResettableClassFileTransformer.WithDelegation.Substitutable.Factory DISPATCHER = null;
            protected volatile net.bytebuddy.agent.builder.ResettableClassFileTransformer classFileTransformer;

            public interface Factory {

                public enum CreationAction extends java.lang.Enum<net.bytebuddy.agent.builder.ResettableClassFileTransformer.WithDelegation.Substitutable.Factory.CreationAction> implements java.security.PrivilegedAction<net.bytebuddy.agent.builder.ResettableClassFileTransformer.WithDelegation.Substitutable.Factory> {
                    private static final /* synthetic */ net.bytebuddy.agent.builder.ResettableClassFileTransformer.WithDelegation.Substitutable.Factory.CreationAction[] $VALUES = null;
                    public static final net.bytebuddy.agent.builder.ResettableClassFileTransformer.WithDelegation.Substitutable.Factory.CreationAction INSTANCE = null;

                    static {
                            net.bytebuddy.agent.builder.ResettableClassFileTransformer$WithDelegation$Substitutable$Factory$CreationAction r0 = new net.bytebuddy.agent.builder.ResettableClassFileTransformer$WithDelegation$Substitutable$Factory$CreationAction
                            java.lang.String r1 = "INSTANCE"
                            r2 = 0
                            r0.<init>(r1, r2)
                            net.bytebuddy.agent.builder.ResettableClassFileTransformer.WithDelegation.Substitutable.Factory.CreationAction.INSTANCE = r0
                            net.bytebuddy.agent.builder.ResettableClassFileTransformer$WithDelegation$Substitutable$Factory$CreationAction[] r0 = new net.bytebuddy.agent.builder.ResettableClassFileTransformer.WithDelegation.Substitutable.Factory.CreationAction[]{r0}
                            net.bytebuddy.agent.builder.ResettableClassFileTransformer.WithDelegation.Substitutable.Factory.CreationAction.$VALUES = r0
                            return
                    }

                    CreationAction(java.lang.String r1, int r2) {
                            r0 = this;
                            r0.<init>(r1, r2)
                            return
                    }

                    public static net.bytebuddy.agent.builder.ResettableClassFileTransformer.WithDelegation.Substitutable.Factory.CreationAction valueOf(java.lang.String r1) {
                            java.lang.Class<net.bytebuddy.agent.builder.ResettableClassFileTransformer$WithDelegation$Substitutable$Factory$CreationAction> r0 = net.bytebuddy.agent.builder.ResettableClassFileTransformer.WithDelegation.Substitutable.Factory.CreationAction.class
                            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                            net.bytebuddy.agent.builder.ResettableClassFileTransformer$WithDelegation$Substitutable$Factory$CreationAction r1 = (net.bytebuddy.agent.builder.ResettableClassFileTransformer.WithDelegation.Substitutable.Factory.CreationAction) r1
                            return r1
                    }

                    public static net.bytebuddy.agent.builder.ResettableClassFileTransformer.WithDelegation.Substitutable.Factory.CreationAction[] values() {
                            net.bytebuddy.agent.builder.ResettableClassFileTransformer$WithDelegation$Substitutable$Factory$CreationAction[] r0 = net.bytebuddy.agent.builder.ResettableClassFileTransformer.WithDelegation.Substitutable.Factory.CreationAction.$VALUES
                            java.lang.Object r0 = r0.clone()
                            net.bytebuddy.agent.builder.ResettableClassFileTransformer$WithDelegation$Substitutable$Factory$CreationAction[] r0 = (net.bytebuddy.agent.builder.ResettableClassFileTransformer.WithDelegation.Substitutable.Factory.CreationAction[]) r0
                            return r0
                    }

                    @Override // java.security.PrivilegedAction
                    @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "Exception should not be rethrown but trigger a fallback.", value = {"REC_CATCH_EXCEPTION"})
                    public /* bridge */ /* synthetic */ net.bytebuddy.agent.builder.ResettableClassFileTransformer.WithDelegation.Substitutable.Factory run() {
                            r1 = this;
                            net.bytebuddy.agent.builder.ResettableClassFileTransformer$WithDelegation$Substitutable$Factory r0 = r1.run2()
                            return r0
                    }

                    @Override // java.security.PrivilegedAction
                    @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "Exception should not be rethrown but trigger a fallback.", value = {"REC_CATCH_EXCEPTION"})
                    /* JADX INFO: renamed from: run, reason: avoid collision after fix types in other method */
                    public net.bytebuddy.agent.builder.ResettableClassFileTransformer.WithDelegation.Substitutable.Factory run2() {
                            r11 = this;
                            java.lang.String r0 = "transform"
                            net.bytebuddy.agent.builder.ResettableClassFileTransformer$WithDelegation$Substitutable$Factory$ForJava9CapableVm r1 = new net.bytebuddy.agent.builder.ResettableClassFileTransformer$WithDelegation$Substitutable$Factory$ForJava9CapableVm     // Catch: java.lang.Exception -> L9d
                            net.bytebuddy.ByteBuddy r2 = new net.bytebuddy.ByteBuddy     // Catch: java.lang.Exception -> L9d
                            r2.<init>()     // Catch: java.lang.Exception -> L9d
                            net.bytebuddy.dynamic.scaffold.TypeValidation r3 = net.bytebuddy.dynamic.scaffold.TypeValidation.DISABLED     // Catch: java.lang.Exception -> L9d
                            net.bytebuddy.ByteBuddy r2 = r2.with(r3)     // Catch: java.lang.Exception -> L9d
                            java.lang.Class<net.bytebuddy.agent.builder.ResettableClassFileTransformer$WithDelegation$Substitutable> r3 = net.bytebuddy.agent.builder.ResettableClassFileTransformer.WithDelegation.Substitutable.class
                            net.bytebuddy.dynamic.DynamicType$Builder r2 = r2.subclass(r3)     // Catch: java.lang.Exception -> L9d
                            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L9d
                            r3.<init>()     // Catch: java.lang.Exception -> L9d
                            java.lang.Class<net.bytebuddy.agent.builder.ResettableClassFileTransformer$WithDelegation$Substitutable> r4 = net.bytebuddy.agent.builder.ResettableClassFileTransformer.WithDelegation.Substitutable.class
                            java.lang.String r4 = r4.getName()     // Catch: java.lang.Exception -> L9d
                            r3.append(r4)     // Catch: java.lang.Exception -> L9d
                            java.lang.String r4 = "$ByteBuddy$ModuleSupport"
                            r3.append(r4)     // Catch: java.lang.Exception -> L9d
                            java.lang.String r3 = r3.toString()     // Catch: java.lang.Exception -> L9d
                            net.bytebuddy.dynamic.DynamicType$Builder r2 = r2.name(r3)     // Catch: java.lang.Exception -> L9d
                            net.bytebuddy.matcher.ElementMatcher$Junction r3 = net.bytebuddy.matcher.ElementMatchers.named(r0)     // Catch: java.lang.Exception -> L9d
                            net.bytebuddy.utility.JavaType r4 = net.bytebuddy.utility.JavaType.MODULE     // Catch: java.lang.Exception -> L9d
                            java.lang.Class r5 = r4.load()     // Catch: java.lang.Exception -> L9d
                            r6 = 0
                            net.bytebuddy.matcher.ElementMatcher$Junction r5 = net.bytebuddy.matcher.ElementMatchers.takesArgument(r6, r5)     // Catch: java.lang.Exception -> L9d
                            net.bytebuddy.matcher.ElementMatcher$Junction r3 = r3.and(r5)     // Catch: java.lang.Exception -> L9d
                            net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ImplementationDefinition r2 = r2.method(r3)     // Catch: java.lang.Exception -> L9d
                            java.lang.Class<java.lang.instrument.ClassFileTransformer> r3 = java.lang.instrument.ClassFileTransformer.class
                            java.lang.Class r5 = r4.load()     // Catch: java.lang.Exception -> L9d
                            java.lang.Class<java.lang.ClassLoader> r6 = java.lang.ClassLoader.class
                            java.lang.Class<java.lang.String> r7 = java.lang.String.class
                            java.lang.Class<java.lang.Class> r8 = java.lang.Class.class
                            java.lang.Class<java.security.ProtectionDomain> r9 = java.security.ProtectionDomain.class
                            java.lang.Class<byte[]> r10 = byte[].class
                            java.lang.Class[] r4 = new java.lang.Class[]{r5, r6, r7, r8, r9, r10}     // Catch: java.lang.Exception -> L9d
                            java.lang.reflect.Method r0 = r3.getDeclaredMethod(r0, r4)     // Catch: java.lang.Exception -> L9d
                            net.bytebuddy.implementation.MethodCall$WithoutSpecifiedTarget r0 = net.bytebuddy.implementation.MethodCall.invoke(r0)     // Catch: java.lang.Exception -> L9d
                            java.lang.String r3 = "classFileTransformer"
                            net.bytebuddy.implementation.MethodCall r0 = r0.onField(r3)     // Catch: java.lang.Exception -> L9d
                            net.bytebuddy.implementation.MethodCall r0 = r0.withAllArguments()     // Catch: java.lang.Exception -> L9d
                            net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition r0 = r2.intercept(r0)     // Catch: java.lang.Exception -> L9d
                            net.bytebuddy.dynamic.DynamicType$Unloaded r0 = r0.make()     // Catch: java.lang.Exception -> L9d
                            java.lang.Class<net.bytebuddy.agent.builder.ResettableClassFileTransformer$WithDelegation$Substitutable> r2 = net.bytebuddy.agent.builder.ResettableClassFileTransformer.WithDelegation.Substitutable.class
                            java.lang.ClassLoader r2 = r2.getClassLoader()     // Catch: java.lang.Exception -> L9d
                            net.bytebuddy.dynamic.loading.ClassLoadingStrategy$Default r3 = net.bytebuddy.dynamic.loading.ClassLoadingStrategy.Default.WRAPPER_PERSISTENT     // Catch: java.lang.Exception -> L9d
                            java.lang.Class<net.bytebuddy.agent.builder.ResettableClassFileTransformer$WithDelegation$Substitutable> r4 = net.bytebuddy.agent.builder.ResettableClassFileTransformer.WithDelegation.Substitutable.class
                            java.security.ProtectionDomain r4 = r4.getProtectionDomain()     // Catch: java.lang.Exception -> L9d
                            net.bytebuddy.dynamic.loading.ClassLoadingStrategy$Configurable r3 = r3.with(r4)     // Catch: java.lang.Exception -> L9d
                            net.bytebuddy.dynamic.DynamicType$Loaded r0 = r0.load(r2, r3)     // Catch: java.lang.Exception -> L9d
                            java.lang.Class r0 = r0.getLoaded()     // Catch: java.lang.Exception -> L9d
                            java.lang.Class<net.bytebuddy.agent.builder.ResettableClassFileTransformer> r2 = net.bytebuddy.agent.builder.ResettableClassFileTransformer.class
                            java.lang.Class[] r2 = new java.lang.Class[]{r2}     // Catch: java.lang.Exception -> L9d
                            java.lang.reflect.Constructor r0 = r0.getDeclaredConstructor(r2)     // Catch: java.lang.Exception -> L9d
                            r1.<init>(r0)     // Catch: java.lang.Exception -> L9d
                            return r1
                        L9d:
                            net.bytebuddy.agent.builder.ResettableClassFileTransformer$WithDelegation$Substitutable$Factory$ForLegacyVm r0 = net.bytebuddy.agent.builder.ResettableClassFileTransformer.WithDelegation.Substitutable.Factory.ForLegacyVm.INSTANCE
                            return r0
                    }
                }

                @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
                public static class ForJava9CapableVm implements net.bytebuddy.agent.builder.ResettableClassFileTransformer.WithDelegation.Substitutable.Factory {
                    private final java.lang.reflect.Constructor<? extends net.bytebuddy.agent.builder.ResettableClassFileTransformer.Substitutable> substitutable;

                    public ForJava9CapableVm(java.lang.reflect.Constructor<? extends net.bytebuddy.agent.builder.ResettableClassFileTransformer.Substitutable> r1) {
                            r0 = this;
                            r0.<init>()
                            r0.substitutable = r1
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
                            java.lang.reflect.Constructor<? extends net.bytebuddy.agent.builder.ResettableClassFileTransformer$Substitutable> r2 = r4.substitutable
                            net.bytebuddy.agent.builder.ResettableClassFileTransformer$WithDelegation$Substitutable$Factory$ForJava9CapableVm r5 = (net.bytebuddy.agent.builder.ResettableClassFileTransformer.WithDelegation.Substitutable.Factory.ForJava9CapableVm) r5
                            java.lang.reflect.Constructor<? extends net.bytebuddy.agent.builder.ResettableClassFileTransformer$Substitutable> r5 = r5.substitutable
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
                            java.lang.reflect.Constructor<? extends net.bytebuddy.agent.builder.ResettableClassFileTransformer$Substitutable> r1 = r2.substitutable
                            int r1 = r1.hashCode()
                            int r0 = r0 + r1
                            return r0
                    }

                    @Override // net.bytebuddy.agent.builder.ResettableClassFileTransformer.WithDelegation.Substitutable.Factory
                    public net.bytebuddy.agent.builder.ResettableClassFileTransformer.Substitutable make(net.bytebuddy.agent.builder.ResettableClassFileTransformer r4) {
                            r3 = this;
                            java.lang.reflect.Constructor<? extends net.bytebuddy.agent.builder.ResettableClassFileTransformer$Substitutable> r0 = r3.substitutable     // Catch: java.lang.reflect.InvocationTargetException -> Ld java.lang.InstantiationException -> Lf java.lang.IllegalAccessException -> L11
                            java.lang.Object[] r4 = new java.lang.Object[]{r4}     // Catch: java.lang.reflect.InvocationTargetException -> Ld java.lang.InstantiationException -> Lf java.lang.IllegalAccessException -> L11
                            java.lang.Object r4 = r0.newInstance(r4)     // Catch: java.lang.reflect.InvocationTargetException -> Ld java.lang.InstantiationException -> Lf java.lang.IllegalAccessException -> L11
                            net.bytebuddy.agent.builder.ResettableClassFileTransformer$Substitutable r4 = (net.bytebuddy.agent.builder.ResettableClassFileTransformer.Substitutable) r4     // Catch: java.lang.reflect.InvocationTargetException -> Ld java.lang.InstantiationException -> Lf java.lang.IllegalAccessException -> L11
                            return r4
                        Ld:
                            r4 = move-exception
                            goto L13
                        Lf:
                            r4 = move-exception
                            goto L30
                        L11:
                            r4 = move-exception
                            goto L4d
                        L13:
                            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                            java.lang.StringBuilder r1 = new java.lang.StringBuilder
                            r1.<init>()
                            java.lang.String r2 = "Cannot invoke "
                            r1.append(r2)
                            java.lang.reflect.Constructor<? extends net.bytebuddy.agent.builder.ResettableClassFileTransformer$Substitutable> r2 = r3.substitutable
                            r1.append(r2)
                            java.lang.String r1 = r1.toString()
                            java.lang.Throwable r4 = r4.getTargetException()
                            r0.<init>(r1, r4)
                            throw r0
                        L30:
                            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                            java.lang.StringBuilder r1 = new java.lang.StringBuilder
                            r1.<init>()
                            java.lang.String r2 = "Cannot instantiate "
                            r1.append(r2)
                            java.lang.reflect.Constructor<? extends net.bytebuddy.agent.builder.ResettableClassFileTransformer$Substitutable> r2 = r3.substitutable
                            java.lang.Class r2 = r2.getDeclaringClass()
                            r1.append(r2)
                            java.lang.String r1 = r1.toString()
                            r0.<init>(r1, r4)
                            throw r0
                        L4d:
                            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                            java.lang.StringBuilder r1 = new java.lang.StringBuilder
                            r1.<init>()
                            java.lang.String r2 = "Cannot access "
                            r1.append(r2)
                            java.lang.reflect.Constructor<? extends net.bytebuddy.agent.builder.ResettableClassFileTransformer$Substitutable> r2 = r3.substitutable
                            r1.append(r2)
                            java.lang.String r1 = r1.toString()
                            r0.<init>(r1, r4)
                            throw r0
                    }
                }

                public enum ForLegacyVm extends java.lang.Enum<net.bytebuddy.agent.builder.ResettableClassFileTransformer.WithDelegation.Substitutable.Factory.ForLegacyVm> implements net.bytebuddy.agent.builder.ResettableClassFileTransformer.WithDelegation.Substitutable.Factory {
                    private static final /* synthetic */ net.bytebuddy.agent.builder.ResettableClassFileTransformer.WithDelegation.Substitutable.Factory.ForLegacyVm[] $VALUES = null;
                    public static final net.bytebuddy.agent.builder.ResettableClassFileTransformer.WithDelegation.Substitutable.Factory.ForLegacyVm INSTANCE = null;

                    static {
                            net.bytebuddy.agent.builder.ResettableClassFileTransformer$WithDelegation$Substitutable$Factory$ForLegacyVm r0 = new net.bytebuddy.agent.builder.ResettableClassFileTransformer$WithDelegation$Substitutable$Factory$ForLegacyVm
                            java.lang.String r1 = "INSTANCE"
                            r2 = 0
                            r0.<init>(r1, r2)
                            net.bytebuddy.agent.builder.ResettableClassFileTransformer.WithDelegation.Substitutable.Factory.ForLegacyVm.INSTANCE = r0
                            net.bytebuddy.agent.builder.ResettableClassFileTransformer$WithDelegation$Substitutable$Factory$ForLegacyVm[] r0 = new net.bytebuddy.agent.builder.ResettableClassFileTransformer.WithDelegation.Substitutable.Factory.ForLegacyVm[]{r0}
                            net.bytebuddy.agent.builder.ResettableClassFileTransformer.WithDelegation.Substitutable.Factory.ForLegacyVm.$VALUES = r0
                            return
                    }

                    ForLegacyVm(java.lang.String r1, int r2) {
                            r0 = this;
                            r0.<init>(r1, r2)
                            return
                    }

                    public static net.bytebuddy.agent.builder.ResettableClassFileTransformer.WithDelegation.Substitutable.Factory.ForLegacyVm valueOf(java.lang.String r1) {
                            java.lang.Class<net.bytebuddy.agent.builder.ResettableClassFileTransformer$WithDelegation$Substitutable$Factory$ForLegacyVm> r0 = net.bytebuddy.agent.builder.ResettableClassFileTransformer.WithDelegation.Substitutable.Factory.ForLegacyVm.class
                            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                            net.bytebuddy.agent.builder.ResettableClassFileTransformer$WithDelegation$Substitutable$Factory$ForLegacyVm r1 = (net.bytebuddy.agent.builder.ResettableClassFileTransformer.WithDelegation.Substitutable.Factory.ForLegacyVm) r1
                            return r1
                    }

                    public static net.bytebuddy.agent.builder.ResettableClassFileTransformer.WithDelegation.Substitutable.Factory.ForLegacyVm[] values() {
                            net.bytebuddy.agent.builder.ResettableClassFileTransformer$WithDelegation$Substitutable$Factory$ForLegacyVm[] r0 = net.bytebuddy.agent.builder.ResettableClassFileTransformer.WithDelegation.Substitutable.Factory.ForLegacyVm.$VALUES
                            java.lang.Object r0 = r0.clone()
                            net.bytebuddy.agent.builder.ResettableClassFileTransformer$WithDelegation$Substitutable$Factory$ForLegacyVm[] r0 = (net.bytebuddy.agent.builder.ResettableClassFileTransformer.WithDelegation.Substitutable.Factory.ForLegacyVm[]) r0
                            return r0
                    }

                    @Override // net.bytebuddy.agent.builder.ResettableClassFileTransformer.WithDelegation.Substitutable.Factory
                    public net.bytebuddy.agent.builder.ResettableClassFileTransformer.Substitutable make(net.bytebuddy.agent.builder.ResettableClassFileTransformer r2) {
                            r1 = this;
                            net.bytebuddy.agent.builder.ResettableClassFileTransformer$WithDelegation$Substitutable r0 = new net.bytebuddy.agent.builder.ResettableClassFileTransformer$WithDelegation$Substitutable
                            r0.<init>(r2)
                            return r0
                    }
                }

                net.bytebuddy.agent.builder.ResettableClassFileTransformer.Substitutable make(net.bytebuddy.agent.builder.ResettableClassFileTransformer r1);
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
                    net.bytebuddy.agent.builder.ResettableClassFileTransformer.WithDelegation.Substitutable.ACCESS_CONTROLLER = r1     // Catch: java.lang.SecurityException -> L16 java.lang.ClassNotFoundException -> L17
                    goto L19
                L16:
                    r0 = 1
                L17:
                    net.bytebuddy.agent.builder.ResettableClassFileTransformer.WithDelegation.Substitutable.ACCESS_CONTROLLER = r0
                L19:
                    net.bytebuddy.agent.builder.ResettableClassFileTransformer$WithDelegation$Substitutable$Factory$CreationAction r0 = net.bytebuddy.agent.builder.ResettableClassFileTransformer.WithDelegation.Substitutable.Factory.CreationAction.INSTANCE
                    java.lang.Object r0 = doPrivileged(r0)
                    net.bytebuddy.agent.builder.ResettableClassFileTransformer$WithDelegation$Substitutable$Factory r0 = (net.bytebuddy.agent.builder.ResettableClassFileTransformer.WithDelegation.Substitutable.Factory) r0
                    net.bytebuddy.agent.builder.ResettableClassFileTransformer.WithDelegation.Substitutable.DISPATCHER = r0
                    return
            }

            public Substitutable(net.bytebuddy.agent.builder.ResettableClassFileTransformer r1) {
                    r0 = this;
                    r0.<init>()
                    r0.classFileTransformer = r1
                    return
            }

            @net.bytebuddy.build.AccessControllerPlugin.Enhance
            private static <T> T doPrivileged(java.security.PrivilegedAction<T> r1) {
                    boolean r0 = net.bytebuddy.agent.builder.ResettableClassFileTransformer.WithDelegation.Substitutable.ACCESS_CONTROLLER
                    if (r0 == 0) goto L9
                    java.lang.Object r1 = java.security.AccessController.doPrivileged(r1)
                    return r1
                L9:
                    java.lang.Object r1 = r1.run()
                    return r1
            }

            public static net.bytebuddy.agent.builder.ResettableClassFileTransformer.Substitutable of(net.bytebuddy.agent.builder.ResettableClassFileTransformer r1) {
                    net.bytebuddy.agent.builder.ResettableClassFileTransformer$WithDelegation$Substitutable$Factory r0 = net.bytebuddy.agent.builder.ResettableClassFileTransformer.WithDelegation.Substitutable.DISPATCHER
                    net.bytebuddy.agent.builder.ResettableClassFileTransformer$Substitutable r1 = r0.make(r1)
                    return r1
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
                    net.bytebuddy.agent.builder.ResettableClassFileTransformer r2 = r4.classFileTransformer
                    net.bytebuddy.agent.builder.ResettableClassFileTransformer$WithDelegation$Substitutable r5 = (net.bytebuddy.agent.builder.ResettableClassFileTransformer.WithDelegation.Substitutable) r5
                    net.bytebuddy.agent.builder.ResettableClassFileTransformer r5 = r5.classFileTransformer
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
                    net.bytebuddy.agent.builder.ResettableClassFileTransformer r1 = r2.classFileTransformer
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    return r0
            }

            @Override // net.bytebuddy.agent.builder.ResettableClassFileTransformer
            public java.util.Iterator<net.bytebuddy.agent.builder.AgentBuilder.Transformer> iterator(net.bytebuddy.description.type.TypeDescription r7, @net.bytebuddy.utility.nullability.MaybeNull java.lang.ClassLoader r8, @net.bytebuddy.utility.nullability.MaybeNull net.bytebuddy.utility.JavaModule r9, @net.bytebuddy.utility.nullability.MaybeNull java.lang.Class<?> r10, java.security.ProtectionDomain r11) {
                    r6 = this;
                    net.bytebuddy.agent.builder.ResettableClassFileTransformer r0 = r6.classFileTransformer
                    r1 = r7
                    r2 = r8
                    r3 = r9
                    r4 = r10
                    r5 = r11
                    java.util.Iterator r7 = r0.iterator(r1, r2, r3, r4, r5)
                    return r7
            }

            @Override // net.bytebuddy.agent.builder.ResettableClassFileTransformer
            public boolean reset(java.lang.instrument.Instrumentation r8, net.bytebuddy.agent.builder.ResettableClassFileTransformer r9, net.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy r10, net.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.DiscoveryStrategy r11, net.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.BatchAllocator r12, net.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.Listener r13) {
                    r7 = this;
                    net.bytebuddy.agent.builder.ResettableClassFileTransformer r0 = r7.classFileTransformer
                    r1 = r8
                    r2 = r9
                    r3 = r10
                    r4 = r11
                    r5 = r12
                    r6 = r13
                    boolean r8 = r0.reset(r1, r2, r3, r4, r5, r6)
                    return r8
            }

            @Override // net.bytebuddy.agent.builder.ResettableClassFileTransformer.Substitutable
            public void substitute(net.bytebuddy.agent.builder.ResettableClassFileTransformer r2) {
                    r1 = this;
                L0:
                    boolean r0 = r2 instanceof net.bytebuddy.agent.builder.ResettableClassFileTransformer.Substitutable
                    if (r0 == 0) goto Lb
                    net.bytebuddy.agent.builder.ResettableClassFileTransformer$Substitutable r2 = (net.bytebuddy.agent.builder.ResettableClassFileTransformer.Substitutable) r2
                    net.bytebuddy.agent.builder.ResettableClassFileTransformer r2 = r2.unwrap()
                    goto L0
                Lb:
                    r1.classFileTransformer = r2
                    return
            }

            public byte[] transform(java.lang.ClassLoader r7, java.lang.String r8, java.lang.Class<?> r9, java.security.ProtectionDomain r10, byte[] r11) throws java.lang.instrument.IllegalClassFormatException {
                    r6 = this;
                    net.bytebuddy.agent.builder.ResettableClassFileTransformer r0 = r6.classFileTransformer
                    r1 = r7
                    r2 = r8
                    r3 = r9
                    r4 = r10
                    r5 = r11
                    byte[] r7 = r0.transform(r1, r2, r3, r4, r5)
                    return r7
            }

            @Override // net.bytebuddy.agent.builder.ResettableClassFileTransformer.Substitutable
            public net.bytebuddy.agent.builder.ResettableClassFileTransformer unwrap() {
                    r1 = this;
                    net.bytebuddy.agent.builder.ResettableClassFileTransformer r0 = r1.classFileTransformer
                    return r0
            }
        }

        public WithDelegation(net.bytebuddy.agent.builder.ResettableClassFileTransformer r1) {
                r0 = this;
                r0.<init>()
                r0.classFileTransformer = r1
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
                net.bytebuddy.agent.builder.ResettableClassFileTransformer r2 = r4.classFileTransformer
                net.bytebuddy.agent.builder.ResettableClassFileTransformer$WithDelegation r5 = (net.bytebuddy.agent.builder.ResettableClassFileTransformer.WithDelegation) r5
                net.bytebuddy.agent.builder.ResettableClassFileTransformer r5 = r5.classFileTransformer
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
                net.bytebuddy.agent.builder.ResettableClassFileTransformer r1 = r2.classFileTransformer
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                return r0
        }

        @Override // net.bytebuddy.agent.builder.ResettableClassFileTransformer
        public java.util.Iterator<net.bytebuddy.agent.builder.AgentBuilder.Transformer> iterator(net.bytebuddy.description.type.TypeDescription r7, @net.bytebuddy.utility.nullability.MaybeNull java.lang.ClassLoader r8, @net.bytebuddy.utility.nullability.MaybeNull net.bytebuddy.utility.JavaModule r9, @net.bytebuddy.utility.nullability.MaybeNull java.lang.Class<?> r10, java.security.ProtectionDomain r11) {
                r6 = this;
                net.bytebuddy.agent.builder.ResettableClassFileTransformer r0 = r6.classFileTransformer
                r1 = r7
                r2 = r8
                r3 = r9
                r4 = r10
                r5 = r11
                java.util.Iterator r7 = r0.iterator(r1, r2, r3, r4, r5)
                return r7
        }

        @Override // net.bytebuddy.agent.builder.ResettableClassFileTransformer
        public boolean reset(java.lang.instrument.Instrumentation r8, net.bytebuddy.agent.builder.ResettableClassFileTransformer r9, net.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy r10, net.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.DiscoveryStrategy r11, net.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.BatchAllocator r12, net.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.Listener r13) {
                r7 = this;
                net.bytebuddy.agent.builder.ResettableClassFileTransformer r0 = r7.classFileTransformer
                r1 = r8
                r2 = r9
                r3 = r10
                r4 = r11
                r5 = r12
                r6 = r13
                boolean r8 = r0.reset(r1, r2, r3, r4, r5, r6)
                return r8
        }
    }

    java.util.Iterator<net.bytebuddy.agent.builder.AgentBuilder.Transformer> iterator(net.bytebuddy.description.type.TypeDescription r1, @net.bytebuddy.utility.nullability.MaybeNull java.lang.ClassLoader r2, @net.bytebuddy.utility.nullability.MaybeNull net.bytebuddy.utility.JavaModule r3, @net.bytebuddy.utility.nullability.MaybeNull java.lang.Class<?> r4, java.security.ProtectionDomain r5);

    boolean reset(java.lang.instrument.Instrumentation r1, net.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy r2);

    boolean reset(java.lang.instrument.Instrumentation r1, net.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy r2, net.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.BatchAllocator r3);

    boolean reset(java.lang.instrument.Instrumentation r1, net.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy r2, net.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.BatchAllocator r3, net.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.DiscoveryStrategy r4);

    boolean reset(java.lang.instrument.Instrumentation r1, net.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy r2, net.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.BatchAllocator r3, net.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.Listener r4);

    boolean reset(java.lang.instrument.Instrumentation r1, net.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy r2, net.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.DiscoveryStrategy r3);

    boolean reset(java.lang.instrument.Instrumentation r1, net.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy r2, net.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.DiscoveryStrategy r3, net.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.BatchAllocator r4, net.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.Listener r5);

    boolean reset(java.lang.instrument.Instrumentation r1, net.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy r2, net.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.DiscoveryStrategy r3, net.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.Listener r4);

    boolean reset(java.lang.instrument.Instrumentation r1, net.bytebuddy.agent.builder.ResettableClassFileTransformer r2, net.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy r3, net.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.DiscoveryStrategy r4, net.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.BatchAllocator r5, net.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.Listener r6);
}
