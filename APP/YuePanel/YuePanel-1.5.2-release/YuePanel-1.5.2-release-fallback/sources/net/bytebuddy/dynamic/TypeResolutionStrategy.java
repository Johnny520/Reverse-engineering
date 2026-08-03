package net.bytebuddy.dynamic;

/* JADX INFO: loaded from: classes2.dex */
public interface TypeResolutionStrategy {

    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
    public static class Active implements net.bytebuddy.dynamic.TypeResolutionStrategy {
        private final net.bytebuddy.dynamic.NexusAccessor nexusAccessor;

        @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
        public static class Resolved implements net.bytebuddy.dynamic.TypeResolutionStrategy.Resolved {
            private final int identification;
            private final net.bytebuddy.dynamic.NexusAccessor nexusAccessor;

            public Resolved(net.bytebuddy.dynamic.NexusAccessor r1, int r2) {
                    r0 = this;
                    r0.<init>()
                    r0.nexusAccessor = r1
                    r0.identification = r2
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
                    int r2 = r4.identification
                    net.bytebuddy.dynamic.TypeResolutionStrategy$Active$Resolved r5 = (net.bytebuddy.dynamic.TypeResolutionStrategy.Active.Resolved) r5
                    int r3 = r5.identification
                    if (r2 == r3) goto L1c
                    return r1
                L1c:
                    net.bytebuddy.dynamic.NexusAccessor r2 = r4.nexusAccessor
                    net.bytebuddy.dynamic.NexusAccessor r5 = r5.nexusAccessor
                    boolean r5 = r2.equals(r5)
                    if (r5 != 0) goto L27
                    return r1
                L27:
                    return r0
            }

            public int hashCode() {
                    r2 = this;
                    java.lang.Class r0 = r2.getClass()
                    int r0 = r0.hashCode()
                    int r0 = r0 * 31
                    net.bytebuddy.dynamic.NexusAccessor r1 = r2.nexusAccessor
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    int r0 = r0 * 31
                    int r1 = r2.identification
                    int r0 = r0 + r1
                    return r0
            }

            @Override // net.bytebuddy.dynamic.TypeResolutionStrategy.Resolved
            public <S extends java.lang.ClassLoader> java.util.Map<net.bytebuddy.description.type.TypeDescription, java.lang.Class<?>> initialize(net.bytebuddy.dynamic.DynamicType r5, @net.bytebuddy.utility.nullability.MaybeNull S r6, net.bytebuddy.dynamic.loading.ClassLoadingStrategy<? super S> r7) {
                    r4 = this;
                    java.util.HashMap r0 = new java.util.HashMap
                    java.util.Map r1 = r5.getLoadedTypeInitializers()
                    r0.<init>(r1)
                    net.bytebuddy.description.type.TypeDescription r1 = r5.getTypeDescription()
                    java.util.Map r5 = r5.getAllTypes()
                    java.util.Map r5 = r7.load(r6, r5)
                    net.bytebuddy.dynamic.NexusAccessor r6 = r4.nexusAccessor
                    java.lang.String r7 = r1.getName()
                    java.lang.Object r2 = r5.get(r1)
                    java.lang.Class r2 = (java.lang.Class) r2
                    java.lang.ClassLoader r2 = r2.getClassLoader()
                    int r3 = r4.identification
                    java.lang.Object r1 = r0.remove(r1)
                    net.bytebuddy.implementation.LoadedTypeInitializer r1 = (net.bytebuddy.implementation.LoadedTypeInitializer) r1
                    r6.register(r7, r2, r3, r1)
                    java.util.Set r6 = r0.entrySet()
                    java.util.Iterator r6 = r6.iterator()
                L38:
                    boolean r7 = r6.hasNext()
                    if (r7 == 0) goto L58
                    java.lang.Object r7 = r6.next()
                    java.util.Map$Entry r7 = (java.util.Map.Entry) r7
                    java.lang.Object r0 = r7.getValue()
                    net.bytebuddy.implementation.LoadedTypeInitializer r0 = (net.bytebuddy.implementation.LoadedTypeInitializer) r0
                    java.lang.Object r7 = r7.getKey()
                    java.lang.Object r7 = r5.get(r7)
                    java.lang.Class r7 = (java.lang.Class) r7
                    r0.onLoad(r7)
                    goto L38
                L58:
                    return r5
            }

            @Override // net.bytebuddy.dynamic.TypeResolutionStrategy.Resolved
            public net.bytebuddy.dynamic.scaffold.TypeInitializer injectedInto(net.bytebuddy.dynamic.scaffold.TypeInitializer r3) {
                    r2 = this;
                    net.bytebuddy.dynamic.NexusAccessor$InitializationAppender r0 = new net.bytebuddy.dynamic.NexusAccessor$InitializationAppender
                    int r1 = r2.identification
                    r0.<init>(r1)
                    net.bytebuddy.dynamic.scaffold.TypeInitializer r3 = r3.expandWith(r0)
                    return r3
            }
        }

        public Active() {
                r1 = this;
                net.bytebuddy.dynamic.NexusAccessor r0 = new net.bytebuddy.dynamic.NexusAccessor
                r0.<init>()
                r1.<init>(r0)
                return
        }

        public Active(net.bytebuddy.dynamic.NexusAccessor r1) {
                r0 = this;
                r0.<init>()
                r0.nexusAccessor = r1
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
                net.bytebuddy.dynamic.NexusAccessor r2 = r4.nexusAccessor
                net.bytebuddy.dynamic.TypeResolutionStrategy$Active r5 = (net.bytebuddy.dynamic.TypeResolutionStrategy.Active) r5
                net.bytebuddy.dynamic.NexusAccessor r5 = r5.nexusAccessor
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
                net.bytebuddy.dynamic.NexusAccessor r1 = r2.nexusAccessor
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                return r0
        }

        @Override // net.bytebuddy.dynamic.TypeResolutionStrategy
        @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "Avoids thread-contention.", value = {"DMI_RANDOM_USED_ONLY_ONCE"})
        public net.bytebuddy.dynamic.TypeResolutionStrategy.Resolved resolve() {
                r3 = this;
                net.bytebuddy.dynamic.TypeResolutionStrategy$Active$Resolved r0 = new net.bytebuddy.dynamic.TypeResolutionStrategy$Active$Resolved
                net.bytebuddy.dynamic.NexusAccessor r1 = r3.nexusAccessor
                java.util.Random r2 = new java.util.Random
                r2.<init>()
                int r2 = r2.nextInt()
                r0.<init>(r1, r2)
                return r0
        }
    }

    public enum Disabled extends java.lang.Enum<net.bytebuddy.dynamic.TypeResolutionStrategy.Disabled> implements net.bytebuddy.dynamic.TypeResolutionStrategy, net.bytebuddy.dynamic.TypeResolutionStrategy.Resolved {
        private static final /* synthetic */ net.bytebuddy.dynamic.TypeResolutionStrategy.Disabled[] $VALUES = null;
        public static final net.bytebuddy.dynamic.TypeResolutionStrategy.Disabled INSTANCE = null;

        static {
                net.bytebuddy.dynamic.TypeResolutionStrategy$Disabled r0 = new net.bytebuddy.dynamic.TypeResolutionStrategy$Disabled
                java.lang.String r1 = "INSTANCE"
                r2 = 0
                r0.<init>(r1, r2)
                net.bytebuddy.dynamic.TypeResolutionStrategy.Disabled.INSTANCE = r0
                net.bytebuddy.dynamic.TypeResolutionStrategy$Disabled[] r0 = new net.bytebuddy.dynamic.TypeResolutionStrategy.Disabled[]{r0}
                net.bytebuddy.dynamic.TypeResolutionStrategy.Disabled.$VALUES = r0
                return
        }

        Disabled(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static net.bytebuddy.dynamic.TypeResolutionStrategy.Disabled valueOf(java.lang.String r1) {
                java.lang.Class<net.bytebuddy.dynamic.TypeResolutionStrategy$Disabled> r0 = net.bytebuddy.dynamic.TypeResolutionStrategy.Disabled.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                net.bytebuddy.dynamic.TypeResolutionStrategy$Disabled r1 = (net.bytebuddy.dynamic.TypeResolutionStrategy.Disabled) r1
                return r1
        }

        public static net.bytebuddy.dynamic.TypeResolutionStrategy.Disabled[] values() {
                net.bytebuddy.dynamic.TypeResolutionStrategy$Disabled[] r0 = net.bytebuddy.dynamic.TypeResolutionStrategy.Disabled.$VALUES
                java.lang.Object r0 = r0.clone()
                net.bytebuddy.dynamic.TypeResolutionStrategy$Disabled[] r0 = (net.bytebuddy.dynamic.TypeResolutionStrategy.Disabled[]) r0
                return r0
        }

        @Override // net.bytebuddy.dynamic.TypeResolutionStrategy.Resolved
        public <S extends java.lang.ClassLoader> java.util.Map<net.bytebuddy.description.type.TypeDescription, java.lang.Class<?>> initialize(net.bytebuddy.dynamic.DynamicType r1, @net.bytebuddy.utility.nullability.MaybeNull S r2, net.bytebuddy.dynamic.loading.ClassLoadingStrategy<? super S> r3) {
                r0 = this;
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "Cannot initialize a dynamic type for a disabled type resolution strategy"
                r1.<init>(r2)
                throw r1
        }

        @Override // net.bytebuddy.dynamic.TypeResolutionStrategy.Resolved
        public net.bytebuddy.dynamic.scaffold.TypeInitializer injectedInto(net.bytebuddy.dynamic.scaffold.TypeInitializer r1) {
                r0 = this;
                return r1
        }

        @Override // net.bytebuddy.dynamic.TypeResolutionStrategy
        public net.bytebuddy.dynamic.TypeResolutionStrategy.Resolved resolve() {
                r0 = this;
                return r0
        }
    }

    public enum Lazy extends java.lang.Enum<net.bytebuddy.dynamic.TypeResolutionStrategy.Lazy> implements net.bytebuddy.dynamic.TypeResolutionStrategy, net.bytebuddy.dynamic.TypeResolutionStrategy.Resolved {
        private static final /* synthetic */ net.bytebuddy.dynamic.TypeResolutionStrategy.Lazy[] $VALUES = null;
        public static final net.bytebuddy.dynamic.TypeResolutionStrategy.Lazy INSTANCE = null;

        static {
                net.bytebuddy.dynamic.TypeResolutionStrategy$Lazy r0 = new net.bytebuddy.dynamic.TypeResolutionStrategy$Lazy
                java.lang.String r1 = "INSTANCE"
                r2 = 0
                r0.<init>(r1, r2)
                net.bytebuddy.dynamic.TypeResolutionStrategy.Lazy.INSTANCE = r0
                net.bytebuddy.dynamic.TypeResolutionStrategy$Lazy[] r0 = new net.bytebuddy.dynamic.TypeResolutionStrategy.Lazy[]{r0}
                net.bytebuddy.dynamic.TypeResolutionStrategy.Lazy.$VALUES = r0
                return
        }

        Lazy(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static net.bytebuddy.dynamic.TypeResolutionStrategy.Lazy valueOf(java.lang.String r1) {
                java.lang.Class<net.bytebuddy.dynamic.TypeResolutionStrategy$Lazy> r0 = net.bytebuddy.dynamic.TypeResolutionStrategy.Lazy.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                net.bytebuddy.dynamic.TypeResolutionStrategy$Lazy r1 = (net.bytebuddy.dynamic.TypeResolutionStrategy.Lazy) r1
                return r1
        }

        public static net.bytebuddy.dynamic.TypeResolutionStrategy.Lazy[] values() {
                net.bytebuddy.dynamic.TypeResolutionStrategy$Lazy[] r0 = net.bytebuddy.dynamic.TypeResolutionStrategy.Lazy.$VALUES
                java.lang.Object r0 = r0.clone()
                net.bytebuddy.dynamic.TypeResolutionStrategy$Lazy[] r0 = (net.bytebuddy.dynamic.TypeResolutionStrategy.Lazy[]) r0
                return r0
        }

        @Override // net.bytebuddy.dynamic.TypeResolutionStrategy.Resolved
        public <S extends java.lang.ClassLoader> java.util.Map<net.bytebuddy.description.type.TypeDescription, java.lang.Class<?>> initialize(net.bytebuddy.dynamic.DynamicType r1, @net.bytebuddy.utility.nullability.MaybeNull S r2, net.bytebuddy.dynamic.loading.ClassLoadingStrategy<? super S> r3) {
                r0 = this;
                java.util.Map r1 = r1.getAllTypes()
                java.util.Map r1 = r3.load(r2, r1)
                return r1
        }

        @Override // net.bytebuddy.dynamic.TypeResolutionStrategy.Resolved
        public net.bytebuddy.dynamic.scaffold.TypeInitializer injectedInto(net.bytebuddy.dynamic.scaffold.TypeInitializer r1) {
                r0 = this;
                return r1
        }

        @Override // net.bytebuddy.dynamic.TypeResolutionStrategy
        public net.bytebuddy.dynamic.TypeResolutionStrategy.Resolved resolve() {
                r0 = this;
                return r0
        }
    }

    public enum Passive extends java.lang.Enum<net.bytebuddy.dynamic.TypeResolutionStrategy.Passive> implements net.bytebuddy.dynamic.TypeResolutionStrategy, net.bytebuddy.dynamic.TypeResolutionStrategy.Resolved {
        private static final /* synthetic */ net.bytebuddy.dynamic.TypeResolutionStrategy.Passive[] $VALUES = null;
        public static final net.bytebuddy.dynamic.TypeResolutionStrategy.Passive INSTANCE = null;

        static {
                net.bytebuddy.dynamic.TypeResolutionStrategy$Passive r0 = new net.bytebuddy.dynamic.TypeResolutionStrategy$Passive
                java.lang.String r1 = "INSTANCE"
                r2 = 0
                r0.<init>(r1, r2)
                net.bytebuddy.dynamic.TypeResolutionStrategy.Passive.INSTANCE = r0
                net.bytebuddy.dynamic.TypeResolutionStrategy$Passive[] r0 = new net.bytebuddy.dynamic.TypeResolutionStrategy.Passive[]{r0}
                net.bytebuddy.dynamic.TypeResolutionStrategy.Passive.$VALUES = r0
                return
        }

        Passive(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static net.bytebuddy.dynamic.TypeResolutionStrategy.Passive valueOf(java.lang.String r1) {
                java.lang.Class<net.bytebuddy.dynamic.TypeResolutionStrategy$Passive> r0 = net.bytebuddy.dynamic.TypeResolutionStrategy.Passive.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                net.bytebuddy.dynamic.TypeResolutionStrategy$Passive r1 = (net.bytebuddy.dynamic.TypeResolutionStrategy.Passive) r1
                return r1
        }

        public static net.bytebuddy.dynamic.TypeResolutionStrategy.Passive[] values() {
                net.bytebuddy.dynamic.TypeResolutionStrategy$Passive[] r0 = net.bytebuddy.dynamic.TypeResolutionStrategy.Passive.$VALUES
                java.lang.Object r0 = r0.clone()
                net.bytebuddy.dynamic.TypeResolutionStrategy$Passive[] r0 = (net.bytebuddy.dynamic.TypeResolutionStrategy.Passive[]) r0
                return r0
        }

        @Override // net.bytebuddy.dynamic.TypeResolutionStrategy.Resolved
        public <S extends java.lang.ClassLoader> java.util.Map<net.bytebuddy.description.type.TypeDescription, java.lang.Class<?>> initialize(net.bytebuddy.dynamic.DynamicType r2, @net.bytebuddy.utility.nullability.MaybeNull S r3, net.bytebuddy.dynamic.loading.ClassLoadingStrategy<? super S> r4) {
                r1 = this;
                java.util.Map r0 = r2.getAllTypes()
                java.util.Map r3 = r4.load(r3, r0)
                java.util.Map r2 = r2.getLoadedTypeInitializers()
                java.util.Set r2 = r2.entrySet()
                java.util.Iterator r2 = r2.iterator()
            L14:
                boolean r4 = r2.hasNext()
                if (r4 == 0) goto L34
                java.lang.Object r4 = r2.next()
                java.util.Map$Entry r4 = (java.util.Map.Entry) r4
                java.lang.Object r0 = r4.getValue()
                net.bytebuddy.implementation.LoadedTypeInitializer r0 = (net.bytebuddy.implementation.LoadedTypeInitializer) r0
                java.lang.Object r4 = r4.getKey()
                java.lang.Object r4 = r3.get(r4)
                java.lang.Class r4 = (java.lang.Class) r4
                r0.onLoad(r4)
                goto L14
            L34:
                java.util.HashMap r2 = new java.util.HashMap
                r2.<init>(r3)
                return r2
        }

        @Override // net.bytebuddy.dynamic.TypeResolutionStrategy.Resolved
        public net.bytebuddy.dynamic.scaffold.TypeInitializer injectedInto(net.bytebuddy.dynamic.scaffold.TypeInitializer r1) {
                r0 = this;
                return r1
        }

        @Override // net.bytebuddy.dynamic.TypeResolutionStrategy
        public net.bytebuddy.dynamic.TypeResolutionStrategy.Resolved resolve() {
                r0 = this;
                return r0
        }
    }

    public interface Resolved {
        <S extends java.lang.ClassLoader> java.util.Map<net.bytebuddy.description.type.TypeDescription, java.lang.Class<?>> initialize(net.bytebuddy.dynamic.DynamicType r1, @net.bytebuddy.utility.nullability.MaybeNull S r2, net.bytebuddy.dynamic.loading.ClassLoadingStrategy<? super S> r3);

        net.bytebuddy.dynamic.scaffold.TypeInitializer injectedInto(net.bytebuddy.dynamic.scaffold.TypeInitializer r1);
    }

    net.bytebuddy.dynamic.TypeResolutionStrategy.Resolved resolve();
}
