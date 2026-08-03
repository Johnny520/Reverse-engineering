package net.bytebuddy.dynamic.loading;

import java.lang.ClassLoader;

/* JADX INFO: loaded from: classes2.dex */
public interface ClassLoadingStrategy<T extends java.lang.ClassLoader> {

    @net.bytebuddy.utility.nullability.AlwaysNull
    public static final java.lang.ClassLoader BOOTSTRAP_LOADER = null;

    @net.bytebuddy.utility.nullability.AlwaysNull
    public static final java.security.ProtectionDomain NO_PROTECTION_DOMAIN = null;

    public interface Configurable<S extends java.lang.ClassLoader> extends net.bytebuddy.dynamic.loading.ClassLoadingStrategy<S> {
        net.bytebuddy.dynamic.loading.ClassLoadingStrategy.Configurable<S> allowExistingTypes();

        net.bytebuddy.dynamic.loading.ClassLoadingStrategy.Configurable<S> opened();

        net.bytebuddy.dynamic.loading.ClassLoadingStrategy.Configurable<S> with(java.security.ProtectionDomain r1);

        net.bytebuddy.dynamic.loading.ClassLoadingStrategy.Configurable<S> with(net.bytebuddy.dynamic.loading.PackageDefinitionStrategy r1);
    }

    public enum Default extends java.lang.Enum<net.bytebuddy.dynamic.loading.ClassLoadingStrategy.Default> implements net.bytebuddy.dynamic.loading.ClassLoadingStrategy.Configurable<java.lang.ClassLoader> {
        private static final /* synthetic */ net.bytebuddy.dynamic.loading.ClassLoadingStrategy.Default[] $VALUES = null;
        public static final net.bytebuddy.dynamic.loading.ClassLoadingStrategy.Default CHILD_FIRST = null;
        public static final net.bytebuddy.dynamic.loading.ClassLoadingStrategy.Default CHILD_FIRST_PERSISTENT = null;
        private static final boolean DEFAULT_FORBID_EXISTING = true;
        public static final net.bytebuddy.dynamic.loading.ClassLoadingStrategy.Default INJECTION = null;
        public static final net.bytebuddy.dynamic.loading.ClassLoadingStrategy.Default WRAPPER = null;
        public static final net.bytebuddy.dynamic.loading.ClassLoadingStrategy.Default WRAPPER_PERSISTENT = null;
        private final net.bytebuddy.dynamic.loading.ClassLoadingStrategy.Configurable<java.lang.ClassLoader> dispatcher;

        @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
        public static class InjectionDispatcher implements net.bytebuddy.dynamic.loading.ClassLoadingStrategy.Configurable<java.lang.ClassLoader> {
            private final boolean forbidExisting;
            private final net.bytebuddy.dynamic.loading.PackageDefinitionStrategy packageDefinitionStrategy;

            @net.bytebuddy.utility.nullability.MaybeNull
            @net.bytebuddy.build.HashCodeAndEqualsPlugin.ValueHandling(net.bytebuddy.build.HashCodeAndEqualsPlugin.ValueHandling.Sort.REVERSE_NULLABILITY)
            private final java.security.ProtectionDomain protectionDomain;

            public InjectionDispatcher() {
                    r3 = this;
                    java.security.ProtectionDomain r0 = net.bytebuddy.dynamic.loading.ClassLoadingStrategy.NO_PROTECTION_DOMAIN
                    net.bytebuddy.dynamic.loading.PackageDefinitionStrategy$NoOp r1 = net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.NoOp.INSTANCE
                    r2 = 1
                    r3.<init>(r0, r1, r2)
                    return
            }

            private InjectionDispatcher(@net.bytebuddy.utility.nullability.MaybeNull java.security.ProtectionDomain r1, net.bytebuddy.dynamic.loading.PackageDefinitionStrategy r2, boolean r3) {
                    r0 = this;
                    r0.<init>()
                    r0.protectionDomain = r1
                    r0.packageDefinitionStrategy = r2
                    r0.forbidExisting = r3
                    return
            }

            @Override // net.bytebuddy.dynamic.loading.ClassLoadingStrategy.Configurable
            public net.bytebuddy.dynamic.loading.ClassLoadingStrategy.Configurable<java.lang.ClassLoader> allowExistingTypes() {
                    r4 = this;
                    net.bytebuddy.dynamic.loading.ClassLoadingStrategy$Default$InjectionDispatcher r0 = new net.bytebuddy.dynamic.loading.ClassLoadingStrategy$Default$InjectionDispatcher
                    java.security.ProtectionDomain r1 = r4.protectionDomain
                    net.bytebuddy.dynamic.loading.PackageDefinitionStrategy r2 = r4.packageDefinitionStrategy
                    r3 = 0
                    r0.<init>(r1, r2, r3)
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
                    boolean r2 = r4.forbidExisting
                    net.bytebuddy.dynamic.loading.ClassLoadingStrategy$Default$InjectionDispatcher r5 = (net.bytebuddy.dynamic.loading.ClassLoadingStrategy.Default.InjectionDispatcher) r5
                    boolean r3 = r5.forbidExisting
                    if (r2 == r3) goto L1c
                    return r1
                L1c:
                    java.security.ProtectionDomain r2 = r4.protectionDomain
                    java.security.ProtectionDomain r3 = r5.protectionDomain
                    if (r3 == 0) goto L2b
                    if (r2 == 0) goto L2d
                    boolean r2 = r2.equals(r3)
                    if (r2 != 0) goto L2e
                    return r1
                L2b:
                    if (r2 == 0) goto L2e
                L2d:
                    return r1
                L2e:
                    net.bytebuddy.dynamic.loading.PackageDefinitionStrategy r2 = r4.packageDefinitionStrategy
                    net.bytebuddy.dynamic.loading.PackageDefinitionStrategy r5 = r5.packageDefinitionStrategy
                    boolean r5 = r2.equals(r5)
                    if (r5 != 0) goto L39
                    return r1
                L39:
                    return r0
            }

            public int hashCode() {
                    r2 = this;
                    java.lang.Class r0 = r2.getClass()
                    int r0 = r0.hashCode()
                    int r0 = r0 * 31
                    java.security.ProtectionDomain r1 = r2.protectionDomain
                    if (r1 == 0) goto L13
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                L13:
                    int r0 = r0 * 31
                    net.bytebuddy.dynamic.loading.PackageDefinitionStrategy r1 = r2.packageDefinitionStrategy
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    int r0 = r0 * 31
                    boolean r1 = r2.forbidExisting
                    int r0 = r0 + r1
                    return r0
            }

            @Override // net.bytebuddy.dynamic.loading.ClassLoadingStrategy
            public java.util.Map<net.bytebuddy.description.type.TypeDescription, java.lang.Class<?>> load(@net.bytebuddy.utility.nullability.MaybeNull java.lang.ClassLoader r5, java.util.Map<net.bytebuddy.description.type.TypeDescription, byte[]> r6) {
                    r4 = this;
                    if (r5 == 0) goto L12
                    net.bytebuddy.dynamic.loading.ClassInjector$UsingReflection r0 = new net.bytebuddy.dynamic.loading.ClassInjector$UsingReflection
                    java.security.ProtectionDomain r1 = r4.protectionDomain
                    net.bytebuddy.dynamic.loading.PackageDefinitionStrategy r2 = r4.packageDefinitionStrategy
                    boolean r3 = r4.forbidExisting
                    r0.<init>(r5, r1, r2, r3)
                    java.util.Map r5 = r0.inject(r6)
                    return r5
                L12:
                    java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
                    java.lang.String r6 = "Cannot inject classes into the bootstrap class loader"
                    r5.<init>(r6)
                    throw r5
            }

            @Override // net.bytebuddy.dynamic.loading.ClassLoadingStrategy.Configurable
            public net.bytebuddy.dynamic.loading.ClassLoadingStrategy.Configurable<java.lang.ClassLoader> opened() {
                    r0 = this;
                    return r0
            }

            @Override // net.bytebuddy.dynamic.loading.ClassLoadingStrategy.Configurable
            public net.bytebuddy.dynamic.loading.ClassLoadingStrategy.Configurable<java.lang.ClassLoader> with(java.security.ProtectionDomain r4) {
                    r3 = this;
                    net.bytebuddy.dynamic.loading.ClassLoadingStrategy$Default$InjectionDispatcher r0 = new net.bytebuddy.dynamic.loading.ClassLoadingStrategy$Default$InjectionDispatcher
                    net.bytebuddy.dynamic.loading.PackageDefinitionStrategy r1 = r3.packageDefinitionStrategy
                    boolean r2 = r3.forbidExisting
                    r0.<init>(r4, r1, r2)
                    return r0
            }

            @Override // net.bytebuddy.dynamic.loading.ClassLoadingStrategy.Configurable
            public net.bytebuddy.dynamic.loading.ClassLoadingStrategy.Configurable<java.lang.ClassLoader> with(net.bytebuddy.dynamic.loading.PackageDefinitionStrategy r4) {
                    r3 = this;
                    net.bytebuddy.dynamic.loading.ClassLoadingStrategy$Default$InjectionDispatcher r0 = new net.bytebuddy.dynamic.loading.ClassLoadingStrategy$Default$InjectionDispatcher
                    java.security.ProtectionDomain r1 = r3.protectionDomain
                    boolean r2 = r3.forbidExisting
                    r0.<init>(r1, r4, r2)
                    return r0
            }
        }

        @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
        public static class WrappingDispatcher implements net.bytebuddy.dynamic.loading.ClassLoadingStrategy.Configurable<java.lang.ClassLoader> {
            private static final boolean CHILD_FIRST = true;
            private static final boolean PARENT_FIRST = false;
            private final boolean childFirst;
            private final boolean forbidExisting;
            private final net.bytebuddy.dynamic.loading.PackageDefinitionStrategy packageDefinitionStrategy;
            private final net.bytebuddy.dynamic.loading.ByteArrayClassLoader.PersistenceHandler persistenceHandler;

            @net.bytebuddy.utility.nullability.MaybeNull
            @net.bytebuddy.build.HashCodeAndEqualsPlugin.ValueHandling(net.bytebuddy.build.HashCodeAndEqualsPlugin.ValueHandling.Sort.REVERSE_NULLABILITY)
            private final java.security.ProtectionDomain protectionDomain;
            private final boolean sealed;

            private WrappingDispatcher(@net.bytebuddy.utility.nullability.MaybeNull java.security.ProtectionDomain r1, net.bytebuddy.dynamic.loading.PackageDefinitionStrategy r2, net.bytebuddy.dynamic.loading.ByteArrayClassLoader.PersistenceHandler r3, boolean r4, boolean r5, boolean r6) {
                    r0 = this;
                    r0.<init>()
                    r0.protectionDomain = r1
                    r0.packageDefinitionStrategy = r2
                    r0.persistenceHandler = r3
                    r0.childFirst = r4
                    r0.forbidExisting = r5
                    r0.sealed = r6
                    return
            }

            public WrappingDispatcher(net.bytebuddy.dynamic.loading.ByteArrayClassLoader.PersistenceHandler r8, boolean r9) {
                    r7 = this;
                    java.security.ProtectionDomain r1 = net.bytebuddy.dynamic.loading.ClassLoadingStrategy.NO_PROTECTION_DOMAIN
                    net.bytebuddy.dynamic.loading.PackageDefinitionStrategy$Trivial r2 = net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.Trivial.INSTANCE
                    r5 = 1
                    r6 = 1
                    r0 = r7
                    r3 = r8
                    r4 = r9
                    r0.<init>(r1, r2, r3, r4, r5, r6)
                    return
            }

            @Override // net.bytebuddy.dynamic.loading.ClassLoadingStrategy.Configurable
            public net.bytebuddy.dynamic.loading.ClassLoadingStrategy.Configurable<java.lang.ClassLoader> allowExistingTypes() {
                    r8 = this;
                    net.bytebuddy.dynamic.loading.ClassLoadingStrategy$Default$WrappingDispatcher r7 = new net.bytebuddy.dynamic.loading.ClassLoadingStrategy$Default$WrappingDispatcher
                    java.security.ProtectionDomain r1 = r8.protectionDomain
                    net.bytebuddy.dynamic.loading.PackageDefinitionStrategy r2 = r8.packageDefinitionStrategy
                    net.bytebuddy.dynamic.loading.ByteArrayClassLoader$PersistenceHandler r3 = r8.persistenceHandler
                    boolean r4 = r8.childFirst
                    r5 = 0
                    boolean r6 = r8.sealed
                    r0 = r7
                    r0.<init>(r1, r2, r3, r4, r5, r6)
                    return r7
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
                    boolean r2 = r4.childFirst
                    net.bytebuddy.dynamic.loading.ClassLoadingStrategy$Default$WrappingDispatcher r5 = (net.bytebuddy.dynamic.loading.ClassLoadingStrategy.Default.WrappingDispatcher) r5
                    boolean r3 = r5.childFirst
                    if (r2 == r3) goto L1c
                    return r1
                L1c:
                    boolean r2 = r4.forbidExisting
                    boolean r3 = r5.forbidExisting
                    if (r2 == r3) goto L23
                    return r1
                L23:
                    boolean r2 = r4.sealed
                    boolean r3 = r5.sealed
                    if (r2 == r3) goto L2a
                    return r1
                L2a:
                    net.bytebuddy.dynamic.loading.ByteArrayClassLoader$PersistenceHandler r2 = r4.persistenceHandler
                    net.bytebuddy.dynamic.loading.ByteArrayClassLoader$PersistenceHandler r3 = r5.persistenceHandler
                    boolean r2 = r2.equals(r3)
                    if (r2 != 0) goto L35
                    return r1
                L35:
                    java.security.ProtectionDomain r2 = r4.protectionDomain
                    java.security.ProtectionDomain r3 = r5.protectionDomain
                    if (r3 == 0) goto L44
                    if (r2 == 0) goto L46
                    boolean r2 = r2.equals(r3)
                    if (r2 != 0) goto L47
                    return r1
                L44:
                    if (r2 == 0) goto L47
                L46:
                    return r1
                L47:
                    net.bytebuddy.dynamic.loading.PackageDefinitionStrategy r2 = r4.packageDefinitionStrategy
                    net.bytebuddy.dynamic.loading.PackageDefinitionStrategy r5 = r5.packageDefinitionStrategy
                    boolean r5 = r2.equals(r5)
                    if (r5 != 0) goto L52
                    return r1
                L52:
                    return r0
            }

            public int hashCode() {
                    r2 = this;
                    java.lang.Class r0 = r2.getClass()
                    int r0 = r0.hashCode()
                    int r0 = r0 * 31
                    java.security.ProtectionDomain r1 = r2.protectionDomain
                    if (r1 == 0) goto L13
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                L13:
                    int r0 = r0 * 31
                    net.bytebuddy.dynamic.loading.ByteArrayClassLoader$PersistenceHandler r1 = r2.persistenceHandler
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    int r0 = r0 * 31
                    net.bytebuddy.dynamic.loading.PackageDefinitionStrategy r1 = r2.packageDefinitionStrategy
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    int r0 = r0 * 31
                    boolean r1 = r2.childFirst
                    int r0 = r0 + r1
                    int r0 = r0 * 31
                    boolean r1 = r2.forbidExisting
                    int r0 = r0 + r1
                    int r0 = r0 * 31
                    boolean r1 = r2.sealed
                    int r0 = r0 + r1
                    return r0
            }

            @Override // net.bytebuddy.dynamic.loading.ClassLoadingStrategy
            public java.util.Map<net.bytebuddy.description.type.TypeDescription, java.lang.Class<?>> load(@net.bytebuddy.utility.nullability.MaybeNull java.lang.ClassLoader r9, java.util.Map<net.bytebuddy.description.type.TypeDescription, byte[]> r10) {
                    r8 = this;
                    boolean r0 = r8.childFirst
                    if (r0 == 0) goto L15
                    java.security.ProtectionDomain r3 = r8.protectionDomain
                    net.bytebuddy.dynamic.loading.ByteArrayClassLoader$PersistenceHandler r4 = r8.persistenceHandler
                    net.bytebuddy.dynamic.loading.PackageDefinitionStrategy r5 = r8.packageDefinitionStrategy
                    boolean r6 = r8.forbidExisting
                    boolean r7 = r8.sealed
                    r1 = r9
                    r2 = r10
                    java.util.Map r9 = net.bytebuddy.dynamic.loading.ByteArrayClassLoader.ChildFirst.load(r1, r2, r3, r4, r5, r6, r7)
                    goto L25
                L15:
                    java.security.ProtectionDomain r2 = r8.protectionDomain
                    net.bytebuddy.dynamic.loading.ByteArrayClassLoader$PersistenceHandler r3 = r8.persistenceHandler
                    net.bytebuddy.dynamic.loading.PackageDefinitionStrategy r4 = r8.packageDefinitionStrategy
                    boolean r5 = r8.forbidExisting
                    boolean r6 = r8.sealed
                    r0 = r9
                    r1 = r10
                    java.util.Map r9 = net.bytebuddy.dynamic.loading.ByteArrayClassLoader.load(r0, r1, r2, r3, r4, r5, r6)
                L25:
                    return r9
            }

            @Override // net.bytebuddy.dynamic.loading.ClassLoadingStrategy.Configurable
            public net.bytebuddy.dynamic.loading.ClassLoadingStrategy.Configurable<java.lang.ClassLoader> opened() {
                    r8 = this;
                    net.bytebuddy.dynamic.loading.ClassLoadingStrategy$Default$WrappingDispatcher r7 = new net.bytebuddy.dynamic.loading.ClassLoadingStrategy$Default$WrappingDispatcher
                    java.security.ProtectionDomain r1 = r8.protectionDomain
                    net.bytebuddy.dynamic.loading.PackageDefinitionStrategy r2 = r8.packageDefinitionStrategy
                    net.bytebuddy.dynamic.loading.ByteArrayClassLoader$PersistenceHandler r3 = r8.persistenceHandler
                    boolean r4 = r8.childFirst
                    boolean r5 = r8.forbidExisting
                    r6 = 0
                    r0 = r7
                    r0.<init>(r1, r2, r3, r4, r5, r6)
                    return r7
            }

            @Override // net.bytebuddy.dynamic.loading.ClassLoadingStrategy.Configurable
            public net.bytebuddy.dynamic.loading.ClassLoadingStrategy.Configurable<java.lang.ClassLoader> with(java.security.ProtectionDomain r9) {
                    r8 = this;
                    net.bytebuddy.dynamic.loading.ClassLoadingStrategy$Default$WrappingDispatcher r7 = new net.bytebuddy.dynamic.loading.ClassLoadingStrategy$Default$WrappingDispatcher
                    net.bytebuddy.dynamic.loading.PackageDefinitionStrategy r2 = r8.packageDefinitionStrategy
                    net.bytebuddy.dynamic.loading.ByteArrayClassLoader$PersistenceHandler r3 = r8.persistenceHandler
                    boolean r4 = r8.childFirst
                    boolean r5 = r8.forbidExisting
                    boolean r6 = r8.sealed
                    r0 = r7
                    r1 = r9
                    r0.<init>(r1, r2, r3, r4, r5, r6)
                    return r7
            }

            @Override // net.bytebuddy.dynamic.loading.ClassLoadingStrategy.Configurable
            public net.bytebuddy.dynamic.loading.ClassLoadingStrategy.Configurable<java.lang.ClassLoader> with(net.bytebuddy.dynamic.loading.PackageDefinitionStrategy r9) {
                    r8 = this;
                    net.bytebuddy.dynamic.loading.ClassLoadingStrategy$Default$WrappingDispatcher r7 = new net.bytebuddy.dynamic.loading.ClassLoadingStrategy$Default$WrappingDispatcher
                    java.security.ProtectionDomain r1 = r8.protectionDomain
                    net.bytebuddy.dynamic.loading.ByteArrayClassLoader$PersistenceHandler r3 = r8.persistenceHandler
                    boolean r4 = r8.childFirst
                    boolean r5 = r8.forbidExisting
                    boolean r6 = r8.sealed
                    r0 = r7
                    r2 = r9
                    r0.<init>(r1, r2, r3, r4, r5, r6)
                    return r7
            }
        }

        static {
                net.bytebuddy.dynamic.loading.ClassLoadingStrategy$Default r0 = new net.bytebuddy.dynamic.loading.ClassLoadingStrategy$Default
                net.bytebuddy.dynamic.loading.ClassLoadingStrategy$Default$WrappingDispatcher r1 = new net.bytebuddy.dynamic.loading.ClassLoadingStrategy$Default$WrappingDispatcher
                net.bytebuddy.dynamic.loading.ByteArrayClassLoader$PersistenceHandler r2 = net.bytebuddy.dynamic.loading.ByteArrayClassLoader.PersistenceHandler.LATENT
                r3 = 0
                r1.<init>(r2, r3)
                java.lang.String r4 = "WRAPPER"
                r0.<init>(r4, r3, r1)
                net.bytebuddy.dynamic.loading.ClassLoadingStrategy.Default.WRAPPER = r0
                net.bytebuddy.dynamic.loading.ClassLoadingStrategy$Default r1 = new net.bytebuddy.dynamic.loading.ClassLoadingStrategy$Default
                net.bytebuddy.dynamic.loading.ClassLoadingStrategy$Default$WrappingDispatcher r4 = new net.bytebuddy.dynamic.loading.ClassLoadingStrategy$Default$WrappingDispatcher
                net.bytebuddy.dynamic.loading.ByteArrayClassLoader$PersistenceHandler r5 = net.bytebuddy.dynamic.loading.ByteArrayClassLoader.PersistenceHandler.MANIFEST
                r4.<init>(r5, r3)
                java.lang.String r3 = "WRAPPER_PERSISTENT"
                r6 = 1
                r1.<init>(r3, r6, r4)
                net.bytebuddy.dynamic.loading.ClassLoadingStrategy.Default.WRAPPER_PERSISTENT = r1
                net.bytebuddy.dynamic.loading.ClassLoadingStrategy$Default r3 = new net.bytebuddy.dynamic.loading.ClassLoadingStrategy$Default
                net.bytebuddy.dynamic.loading.ClassLoadingStrategy$Default$WrappingDispatcher r4 = new net.bytebuddy.dynamic.loading.ClassLoadingStrategy$Default$WrappingDispatcher
                r4.<init>(r2, r6)
                java.lang.String r2 = "CHILD_FIRST"
                r7 = 2
                r3.<init>(r2, r7, r4)
                net.bytebuddy.dynamic.loading.ClassLoadingStrategy.Default.CHILD_FIRST = r3
                net.bytebuddy.dynamic.loading.ClassLoadingStrategy$Default r2 = new net.bytebuddy.dynamic.loading.ClassLoadingStrategy$Default
                net.bytebuddy.dynamic.loading.ClassLoadingStrategy$Default$WrappingDispatcher r4 = new net.bytebuddy.dynamic.loading.ClassLoadingStrategy$Default$WrappingDispatcher
                r4.<init>(r5, r6)
                java.lang.String r5 = "CHILD_FIRST_PERSISTENT"
                r6 = 3
                r2.<init>(r5, r6, r4)
                net.bytebuddy.dynamic.loading.ClassLoadingStrategy.Default.CHILD_FIRST_PERSISTENT = r2
                net.bytebuddy.dynamic.loading.ClassLoadingStrategy$Default r4 = new net.bytebuddy.dynamic.loading.ClassLoadingStrategy$Default
                net.bytebuddy.dynamic.loading.ClassLoadingStrategy$Default$InjectionDispatcher r5 = new net.bytebuddy.dynamic.loading.ClassLoadingStrategy$Default$InjectionDispatcher
                r5.<init>()
                java.lang.String r6 = "INJECTION"
                r7 = 4
                r4.<init>(r6, r7, r5)
                net.bytebuddy.dynamic.loading.ClassLoadingStrategy.Default.INJECTION = r4
                net.bytebuddy.dynamic.loading.ClassLoadingStrategy$Default[] r0 = new net.bytebuddy.dynamic.loading.ClassLoadingStrategy.Default[]{r0, r1, r3, r2, r4}
                net.bytebuddy.dynamic.loading.ClassLoadingStrategy.Default.$VALUES = r0
                return
        }

        Default(java.lang.String r1, int r2, net.bytebuddy.dynamic.loading.ClassLoadingStrategy.Configurable r3) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.dispatcher = r3
                return
        }

        public static net.bytebuddy.dynamic.loading.ClassLoadingStrategy.Default valueOf(java.lang.String r1) {
                java.lang.Class<net.bytebuddy.dynamic.loading.ClassLoadingStrategy$Default> r0 = net.bytebuddy.dynamic.loading.ClassLoadingStrategy.Default.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                net.bytebuddy.dynamic.loading.ClassLoadingStrategy$Default r1 = (net.bytebuddy.dynamic.loading.ClassLoadingStrategy.Default) r1
                return r1
        }

        public static net.bytebuddy.dynamic.loading.ClassLoadingStrategy.Default[] values() {
                net.bytebuddy.dynamic.loading.ClassLoadingStrategy$Default[] r0 = net.bytebuddy.dynamic.loading.ClassLoadingStrategy.Default.$VALUES
                java.lang.Object r0 = r0.clone()
                net.bytebuddy.dynamic.loading.ClassLoadingStrategy$Default[] r0 = (net.bytebuddy.dynamic.loading.ClassLoadingStrategy.Default[]) r0
                return r0
        }

        @Override // net.bytebuddy.dynamic.loading.ClassLoadingStrategy.Configurable
        public net.bytebuddy.dynamic.loading.ClassLoadingStrategy.Configurable<java.lang.ClassLoader> allowExistingTypes() {
                r1 = this;
                net.bytebuddy.dynamic.loading.ClassLoadingStrategy$Configurable<java.lang.ClassLoader> r0 = r1.dispatcher
                net.bytebuddy.dynamic.loading.ClassLoadingStrategy$Configurable r0 = r0.allowExistingTypes()
                return r0
        }

        @Override // net.bytebuddy.dynamic.loading.ClassLoadingStrategy
        public java.util.Map<net.bytebuddy.description.type.TypeDescription, java.lang.Class<?>> load(@net.bytebuddy.utility.nullability.MaybeNull java.lang.ClassLoader r2, java.util.Map<net.bytebuddy.description.type.TypeDescription, byte[]> r3) {
                r1 = this;
                net.bytebuddy.dynamic.loading.ClassLoadingStrategy$Configurable<java.lang.ClassLoader> r0 = r1.dispatcher
                java.util.Map r2 = r0.load(r2, r3)
                return r2
        }

        @Override // net.bytebuddy.dynamic.loading.ClassLoadingStrategy.Configurable
        public net.bytebuddy.dynamic.loading.ClassLoadingStrategy.Configurable<java.lang.ClassLoader> opened() {
                r1 = this;
                net.bytebuddy.dynamic.loading.ClassLoadingStrategy$Configurable<java.lang.ClassLoader> r0 = r1.dispatcher
                net.bytebuddy.dynamic.loading.ClassLoadingStrategy$Configurable r0 = r0.opened()
                return r0
        }

        @Override // net.bytebuddy.dynamic.loading.ClassLoadingStrategy.Configurable
        public net.bytebuddy.dynamic.loading.ClassLoadingStrategy.Configurable<java.lang.ClassLoader> with(java.security.ProtectionDomain r2) {
                r1 = this;
                net.bytebuddy.dynamic.loading.ClassLoadingStrategy$Configurable<java.lang.ClassLoader> r0 = r1.dispatcher
                net.bytebuddy.dynamic.loading.ClassLoadingStrategy$Configurable r2 = r0.with(r2)
                return r2
        }

        @Override // net.bytebuddy.dynamic.loading.ClassLoadingStrategy.Configurable
        public net.bytebuddy.dynamic.loading.ClassLoadingStrategy.Configurable<java.lang.ClassLoader> with(net.bytebuddy.dynamic.loading.PackageDefinitionStrategy r2) {
                r1 = this;
                net.bytebuddy.dynamic.loading.ClassLoadingStrategy$Configurable<java.lang.ClassLoader> r0 = r1.dispatcher
                net.bytebuddy.dynamic.loading.ClassLoadingStrategy$Configurable r2 = r0.with(r2)
                return r2
        }
    }

    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
    public static class ForBootstrapInjection implements net.bytebuddy.dynamic.loading.ClassLoadingStrategy<java.lang.ClassLoader> {
        private final java.io.File folder;
        private final java.lang.instrument.Instrumentation instrumentation;

        public ForBootstrapInjection(java.lang.instrument.Instrumentation r1, java.io.File r2) {
                r0 = this;
                r0.<init>()
                r0.instrumentation = r1
                r0.folder = r2
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
                java.lang.instrument.Instrumentation r2 = r4.instrumentation
                net.bytebuddy.dynamic.loading.ClassLoadingStrategy$ForBootstrapInjection r5 = (net.bytebuddy.dynamic.loading.ClassLoadingStrategy.ForBootstrapInjection) r5
                java.lang.instrument.Instrumentation r3 = r5.instrumentation
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L20
                return r1
            L20:
                java.io.File r2 = r4.folder
                java.io.File r5 = r5.folder
                boolean r5 = r2.equals(r5)
                if (r5 != 0) goto L2b
                return r1
            L2b:
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
                java.io.File r1 = r2.folder
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                return r0
        }

        @Override // net.bytebuddy.dynamic.loading.ClassLoadingStrategy
        public java.util.Map<net.bytebuddy.description.type.TypeDescription, java.lang.Class<?>> load(@net.bytebuddy.utility.nullability.MaybeNull java.lang.ClassLoader r3, java.util.Map<net.bytebuddy.description.type.TypeDescription, byte[]> r4) {
                r2 = this;
                if (r3 != 0) goto Ld
                java.io.File r3 = r2.folder
                net.bytebuddy.dynamic.loading.ClassInjector$UsingInstrumentation$Target r0 = net.bytebuddy.dynamic.loading.ClassInjector.UsingInstrumentation.Target.BOOTSTRAP
                java.lang.instrument.Instrumentation r1 = r2.instrumentation
                net.bytebuddy.dynamic.loading.ClassInjector r3 = net.bytebuddy.dynamic.loading.ClassInjector.UsingInstrumentation.of(r3, r0, r1)
                goto L13
            Ld:
                net.bytebuddy.dynamic.loading.ClassInjector$UsingReflection r0 = new net.bytebuddy.dynamic.loading.ClassInjector$UsingReflection
                r0.<init>(r3)
                r3 = r0
            L13:
                java.util.Map r3 = r3.inject(r4)
                return r3
        }
    }

    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
    public static class ForJnaInjection implements net.bytebuddy.dynamic.loading.ClassLoadingStrategy<java.lang.ClassLoader> {

        @net.bytebuddy.utility.nullability.MaybeNull
        @net.bytebuddy.build.HashCodeAndEqualsPlugin.ValueHandling(net.bytebuddy.build.HashCodeAndEqualsPlugin.ValueHandling.Sort.REVERSE_NULLABILITY)
        private final java.security.ProtectionDomain protectionDomain;

        public ForJnaInjection() {
                r1 = this;
                java.security.ProtectionDomain r0 = net.bytebuddy.dynamic.loading.ClassLoadingStrategy.NO_PROTECTION_DOMAIN
                r1.<init>(r0)
                return
        }

        public ForJnaInjection(@net.bytebuddy.utility.nullability.MaybeNull java.security.ProtectionDomain r1) {
                r0 = this;
                r0.<init>()
                r0.protectionDomain = r1
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
                java.security.ProtectionDomain r2 = r4.protectionDomain
                net.bytebuddy.dynamic.loading.ClassLoadingStrategy$ForJnaInjection r5 = (net.bytebuddy.dynamic.loading.ClassLoadingStrategy.ForJnaInjection) r5
                java.security.ProtectionDomain r5 = r5.protectionDomain
                if (r5 == 0) goto L24
                if (r2 == 0) goto L26
                boolean r5 = r2.equals(r5)
                if (r5 != 0) goto L27
                return r1
            L24:
                if (r2 == 0) goto L27
            L26:
                return r1
            L27:
                return r0
        }

        public int hashCode() {
                r2 = this;
                java.lang.Class r0 = r2.getClass()
                int r0 = r0.hashCode()
                int r0 = r0 * 31
                java.security.ProtectionDomain r1 = r2.protectionDomain
                if (r1 == 0) goto L13
                int r1 = r1.hashCode()
                int r0 = r0 + r1
            L13:
                return r0
        }

        @Override // net.bytebuddy.dynamic.loading.ClassLoadingStrategy
        public java.util.Map<net.bytebuddy.description.type.TypeDescription, java.lang.Class<?>> load(@net.bytebuddy.utility.nullability.MaybeNull java.lang.ClassLoader r3, java.util.Map<net.bytebuddy.description.type.TypeDescription, byte[]> r4) {
                r2 = this;
                net.bytebuddy.dynamic.loading.ClassInjector$UsingUnsafe r0 = new net.bytebuddy.dynamic.loading.ClassInjector$UsingUnsafe
                java.security.ProtectionDomain r1 = r2.protectionDomain
                r0.<init>(r3, r1)
                java.util.Map r3 = r0.inject(r4)
                return r3
        }
    }

    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
    public static class ForUnsafeInjection implements net.bytebuddy.dynamic.loading.ClassLoadingStrategy<java.lang.ClassLoader> {

        @net.bytebuddy.utility.nullability.MaybeNull
        @net.bytebuddy.build.HashCodeAndEqualsPlugin.ValueHandling(net.bytebuddy.build.HashCodeAndEqualsPlugin.ValueHandling.Sort.REVERSE_NULLABILITY)
        private final java.security.ProtectionDomain protectionDomain;

        public ForUnsafeInjection() {
                r1 = this;
                java.security.ProtectionDomain r0 = net.bytebuddy.dynamic.loading.ClassLoadingStrategy.NO_PROTECTION_DOMAIN
                r1.<init>(r0)
                return
        }

        public ForUnsafeInjection(@net.bytebuddy.utility.nullability.MaybeNull java.security.ProtectionDomain r1) {
                r0 = this;
                r0.<init>()
                r0.protectionDomain = r1
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
                java.security.ProtectionDomain r2 = r4.protectionDomain
                net.bytebuddy.dynamic.loading.ClassLoadingStrategy$ForUnsafeInjection r5 = (net.bytebuddy.dynamic.loading.ClassLoadingStrategy.ForUnsafeInjection) r5
                java.security.ProtectionDomain r5 = r5.protectionDomain
                if (r5 == 0) goto L24
                if (r2 == 0) goto L26
                boolean r5 = r2.equals(r5)
                if (r5 != 0) goto L27
                return r1
            L24:
                if (r2 == 0) goto L27
            L26:
                return r1
            L27:
                return r0
        }

        public int hashCode() {
                r2 = this;
                java.lang.Class r0 = r2.getClass()
                int r0 = r0.hashCode()
                int r0 = r0 * 31
                java.security.ProtectionDomain r1 = r2.protectionDomain
                if (r1 == 0) goto L13
                int r1 = r1.hashCode()
                int r0 = r0 + r1
            L13:
                return r0
        }

        @Override // net.bytebuddy.dynamic.loading.ClassLoadingStrategy
        public java.util.Map<net.bytebuddy.description.type.TypeDescription, java.lang.Class<?>> load(@net.bytebuddy.utility.nullability.MaybeNull java.lang.ClassLoader r3, java.util.Map<net.bytebuddy.description.type.TypeDescription, byte[]> r4) {
                r2 = this;
                net.bytebuddy.dynamic.loading.ClassInjector$UsingUnsafe r0 = new net.bytebuddy.dynamic.loading.ClassInjector$UsingUnsafe
                java.security.ProtectionDomain r1 = r2.protectionDomain
                r0.<init>(r3, r1)
                java.util.Map r3 = r0.inject(r4)
                return r3
        }
    }

    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
    public static class UsingLookup implements net.bytebuddy.dynamic.loading.ClassLoadingStrategy<java.lang.ClassLoader> {
        private final net.bytebuddy.dynamic.loading.ClassInjector classInjector;

        public UsingLookup(net.bytebuddy.dynamic.loading.ClassInjector r1) {
                r0 = this;
                r0.<init>()
                r0.classInjector = r1
                return
        }

        public static net.bytebuddy.dynamic.loading.ClassLoadingStrategy<java.lang.ClassLoader> of(java.lang.Object r1) {
                net.bytebuddy.dynamic.loading.ClassLoadingStrategy$UsingLookup r0 = new net.bytebuddy.dynamic.loading.ClassLoadingStrategy$UsingLookup
                net.bytebuddy.dynamic.loading.ClassInjector$UsingLookup r1 = net.bytebuddy.dynamic.loading.ClassInjector.UsingLookup.of(r1)
                r0.<init>(r1)
                return r0
        }

        public static net.bytebuddy.dynamic.loading.ClassLoadingStrategy<java.lang.ClassLoader> withFallback(java.util.concurrent.Callable<?> r1) {
                r0 = 0
                net.bytebuddy.dynamic.loading.ClassLoadingStrategy r1 = withFallback(r1, r0)
                return r1
        }

        public static net.bytebuddy.dynamic.loading.ClassLoadingStrategy<java.lang.ClassLoader> withFallback(java.util.concurrent.Callable<?> r1, boolean r2) {
                boolean r0 = net.bytebuddy.dynamic.loading.ClassInjector.UsingLookup.isAvailable()
                if (r0 == 0) goto L16
                java.lang.Object r1 = r1.call()     // Catch: java.lang.Exception -> Lf
                net.bytebuddy.dynamic.loading.ClassLoadingStrategy r1 = of(r1)     // Catch: java.lang.Exception -> Lf
                return r1
            Lf:
                r1 = move-exception
                java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                r2.<init>(r1)
                throw r2
            L16:
                boolean r1 = net.bytebuddy.dynamic.loading.ClassInjector.UsingUnsafe.isAvailable()
                if (r1 == 0) goto L22
                net.bytebuddy.dynamic.loading.ClassLoadingStrategy$ForUnsafeInjection r1 = new net.bytebuddy.dynamic.loading.ClassLoadingStrategy$ForUnsafeInjection
                r1.<init>()
                return r1
            L22:
                if (r2 == 0) goto L27
                net.bytebuddy.dynamic.loading.ClassLoadingStrategy$Default r1 = net.bytebuddy.dynamic.loading.ClassLoadingStrategy.Default.WRAPPER
                return r1
            L27:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "Neither lookup or unsafe class injection is available"
                r1.<init>(r2)
                throw r1
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
                net.bytebuddy.dynamic.loading.ClassInjector r2 = r4.classInjector
                net.bytebuddy.dynamic.loading.ClassLoadingStrategy$UsingLookup r5 = (net.bytebuddy.dynamic.loading.ClassLoadingStrategy.UsingLookup) r5
                net.bytebuddy.dynamic.loading.ClassInjector r5 = r5.classInjector
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
                net.bytebuddy.dynamic.loading.ClassInjector r1 = r2.classInjector
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                return r0
        }

        @Override // net.bytebuddy.dynamic.loading.ClassLoadingStrategy
        public java.util.Map<net.bytebuddy.description.type.TypeDescription, java.lang.Class<?>> load(@net.bytebuddy.utility.nullability.MaybeNull java.lang.ClassLoader r1, java.util.Map<net.bytebuddy.description.type.TypeDescription, byte[]> r2) {
                r0 = this;
                net.bytebuddy.dynamic.loading.ClassInjector r1 = r0.classInjector
                java.util.Map r1 = r1.inject(r2)
                return r1
        }
    }

    static {
            return
    }

    java.util.Map<net.bytebuddy.description.type.TypeDescription, java.lang.Class<?>> load(@net.bytebuddy.utility.nullability.MaybeNull T r1, java.util.Map<net.bytebuddy.description.type.TypeDescription, byte[]> r2);
}
