package net.bytebuddy.dynamic.loading;

/* JADX INFO: loaded from: classes2.dex */
public class ByteArrayClassLoader extends net.bytebuddy.dynamic.loading.InjectionClassLoader {
    private static final boolean ACCESS_CONTROLLER = false;
    private static final int FROM_BEGINNING = 0;

    @net.bytebuddy.utility.nullability.AlwaysNull
    private static final java.net.URL NO_URL = null;
    private static final net.bytebuddy.dynamic.loading.ByteArrayClassLoader.PackageLookupStrategy PACKAGE_LOOKUP_STRATEGY = null;
    protected static final net.bytebuddy.dynamic.loading.ByteArrayClassLoader.SynchronizationStrategy.Initializable SYNCHRONIZATION_STRATEGY = null;
    public static final java.lang.String URL_SCHEMA = "bytebuddy";

    @net.bytebuddy.utility.nullability.MaybeNull
    protected final java.lang.Object accessControlContext;
    protected final net.bytebuddy.dynamic.loading.ClassFilePostProcessor classFilePostProcessor;
    protected final net.bytebuddy.dynamic.loading.PackageDefinitionStrategy packageDefinitionStrategy;
    protected final net.bytebuddy.dynamic.loading.ByteArrayClassLoader.PersistenceHandler persistenceHandler;

    @net.bytebuddy.utility.nullability.MaybeNull
    protected final java.security.ProtectionDomain protectionDomain;
    protected final java.util.concurrent.ConcurrentMap<java.lang.String, byte[]> typeDefinitions;

    /* JADX INFO: renamed from: net.bytebuddy.dynamic.loading.ByteArrayClassLoader$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public static class ChildFirst extends net.bytebuddy.dynamic.loading.ByteArrayClassLoader {
        private static final java.lang.String CLASS_FILE_SUFFIX = ".class";

        public static class PrependingEnumeration implements java.util.Enumeration<java.net.URL> {
            private final java.util.Enumeration<java.net.URL> enumeration;

            @net.bytebuddy.utility.nullability.MaybeNull
            private java.net.URL nextElement;

            public PrependingEnumeration(java.net.URL r1, java.util.Enumeration<java.net.URL> r2) {
                    r0 = this;
                    r0.<init>()
                    r0.nextElement = r1
                    r0.enumeration = r2
                    return
            }

            @Override // java.util.Enumeration
            public boolean hasMoreElements() {
                    r1 = this;
                    java.net.URL r0 = r1.nextElement
                    if (r0 == 0) goto Le
                    java.util.Enumeration<java.net.URL> r0 = r1.enumeration
                    boolean r0 = r0.hasMoreElements()
                    if (r0 == 0) goto Le
                    r0 = 1
                    goto Lf
                Le:
                    r0 = 0
                Lf:
                    return r0
            }

            @Override // java.util.Enumeration
            public /* bridge */ /* synthetic */ java.net.URL nextElement() {
                    r1 = this;
                    java.net.URL r0 = r1.nextElement2()
                    return r0
            }

            @Override // java.util.Enumeration
            /* JADX INFO: renamed from: nextElement, reason: avoid collision after fix types in other method */
            public java.net.URL nextElement2() {
                    r2 = this;
                    java.net.URL r0 = r2.nextElement
                    if (r0 == 0) goto L25
                    java.util.Enumeration<java.net.URL> r0 = r2.enumeration
                    boolean r0 = r0.hasMoreElements()
                    if (r0 == 0) goto L25
                    java.net.URL r0 = r2.nextElement     // Catch: java.lang.Throwable -> L19
                    java.util.Enumeration<java.net.URL> r1 = r2.enumeration
                    java.lang.Object r1 = r1.nextElement()
                    java.net.URL r1 = (java.net.URL) r1
                    r2.nextElement = r1
                    return r0
                L19:
                    r0 = move-exception
                    java.util.Enumeration<java.net.URL> r1 = r2.enumeration
                    java.lang.Object r1 = r1.nextElement()
                    java.net.URL r1 = (java.net.URL) r1
                    r2.nextElement = r1
                    throw r0
                L25:
                    java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                    r0.<init>()
                    throw r0
            }
        }

        static {
                doRegisterAsParallelCapable()
                return
        }

        public ChildFirst(@net.bytebuddy.utility.nullability.MaybeNull java.lang.ClassLoader r1, java.util.Map<java.lang.String, byte[]> r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public ChildFirst(@net.bytebuddy.utility.nullability.MaybeNull java.lang.ClassLoader r1, java.util.Map<java.lang.String, byte[]> r2, @net.bytebuddy.utility.nullability.MaybeNull java.security.ProtectionDomain r3, net.bytebuddy.dynamic.loading.ByteArrayClassLoader.PersistenceHandler r4, net.bytebuddy.dynamic.loading.PackageDefinitionStrategy r5) {
                r0 = this;
                r0.<init>(r1, r2, r3, r4, r5)
                return
        }

        public ChildFirst(@net.bytebuddy.utility.nullability.MaybeNull java.lang.ClassLoader r1, java.util.Map<java.lang.String, byte[]> r2, @net.bytebuddy.utility.nullability.MaybeNull java.security.ProtectionDomain r3, net.bytebuddy.dynamic.loading.ByteArrayClassLoader.PersistenceHandler r4, net.bytebuddy.dynamic.loading.PackageDefinitionStrategy r5, net.bytebuddy.dynamic.loading.ClassFilePostProcessor r6) {
                r0 = this;
                r0.<init>(r1, r2, r3, r4, r5, r6)
                return
        }

        public ChildFirst(@net.bytebuddy.utility.nullability.MaybeNull java.lang.ClassLoader r1, java.util.Map<java.lang.String, byte[]> r2, net.bytebuddy.dynamic.loading.ByteArrayClassLoader.PersistenceHandler r3) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                return
        }

        public ChildFirst(@net.bytebuddy.utility.nullability.MaybeNull java.lang.ClassLoader r1, boolean r2, java.util.Map<java.lang.String, byte[]> r3) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                return
        }

        public ChildFirst(@net.bytebuddy.utility.nullability.MaybeNull java.lang.ClassLoader r1, boolean r2, java.util.Map<java.lang.String, byte[]> r3, @net.bytebuddy.utility.nullability.MaybeNull java.security.ProtectionDomain r4, net.bytebuddy.dynamic.loading.ByteArrayClassLoader.PersistenceHandler r5, net.bytebuddy.dynamic.loading.PackageDefinitionStrategy r6) {
                r0 = this;
                r0.<init>(r1, r2, r3, r4, r5, r6)
                return
        }

        public ChildFirst(@net.bytebuddy.utility.nullability.MaybeNull java.lang.ClassLoader r1, boolean r2, java.util.Map<java.lang.String, byte[]> r3, @net.bytebuddy.utility.nullability.MaybeNull java.security.ProtectionDomain r4, net.bytebuddy.dynamic.loading.ByteArrayClassLoader.PersistenceHandler r5, net.bytebuddy.dynamic.loading.PackageDefinitionStrategy r6, net.bytebuddy.dynamic.loading.ClassFilePostProcessor r7) {
                r0 = this;
                r0.<init>(r1, r2, r3, r4, r5, r6, r7)
                return
        }

        public ChildFirst(@net.bytebuddy.utility.nullability.MaybeNull java.lang.ClassLoader r1, boolean r2, java.util.Map<java.lang.String, byte[]> r3, net.bytebuddy.dynamic.loading.ByteArrayClassLoader.PersistenceHandler r4) {
                r0 = this;
                r0.<init>(r1, r2, r3, r4)
                return
        }

        @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "Must be invoked from targeting class loader type.", value = {"DP_DO_INSIDE_DO_PRIVILEGED"})
        private static void doRegisterAsParallelCapable() {
                java.lang.Class<java.lang.ClassLoader> r0 = java.lang.ClassLoader.class
                java.lang.String r1 = "registerAsParallelCapable"
                r2 = 0
                java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r2)     // Catch: java.lang.Throwable -> L10
                r1 = 1
                r0.setAccessible(r1)     // Catch: java.lang.Throwable -> L10
                r0.invoke(r2, r2)     // Catch: java.lang.Throwable -> L10
            L10:
                return
        }

        private boolean isShadowed(java.lang.String r4) {
                r3 = this;
                net.bytebuddy.dynamic.loading.ByteArrayClassLoader$PersistenceHandler r0 = r3.persistenceHandler
                boolean r0 = r0.isManifest()
                r1 = 0
                if (r0 != 0) goto L43
                java.lang.String r0 = ".class"
                boolean r0 = r4.endsWith(r0)
                if (r0 != 0) goto L12
                goto L43
            L12:
                monitor-enter(r3)
                r0 = 47
                r2 = 46
                java.lang.String r0 = r4.replace(r0, r2)     // Catch: java.lang.Throwable -> L30
                int r4 = r4.length()     // Catch: java.lang.Throwable -> L30
                int r4 = r4 + (-6)
                java.lang.String r4 = r0.substring(r1, r4)     // Catch: java.lang.Throwable -> L30
                java.util.concurrent.ConcurrentMap<java.lang.String, byte[]> r0 = r3.typeDefinitions     // Catch: java.lang.Throwable -> L30
                boolean r0 = r0.containsKey(r4)     // Catch: java.lang.Throwable -> L30
                r2 = 1
                if (r0 == 0) goto L32
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L30
                return r2
            L30:
                r4 = move-exception
                goto L41
            L32:
                java.lang.Class r4 = r3.findLoadedClass(r4)     // Catch: java.lang.Throwable -> L30
                if (r4 == 0) goto L3f
                java.lang.ClassLoader r4 = r4.getClassLoader()     // Catch: java.lang.Throwable -> L30
                if (r4 != r3) goto L3f
                r1 = r2
            L3f:
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L30
                return r1
            L41:
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L30
                throw r4
            L43:
                return r1
        }

        public static java.util.Map<net.bytebuddy.description.type.TypeDescription, java.lang.Class<?>> load(@net.bytebuddy.utility.nullability.MaybeNull java.lang.ClassLoader r7, java.util.Map<net.bytebuddy.description.type.TypeDescription, byte[]> r8) {
                java.security.ProtectionDomain r2 = net.bytebuddy.dynamic.loading.ClassLoadingStrategy.NO_PROTECTION_DOMAIN
                net.bytebuddy.dynamic.loading.ByteArrayClassLoader$PersistenceHandler r3 = net.bytebuddy.dynamic.loading.ByteArrayClassLoader.PersistenceHandler.LATENT
                net.bytebuddy.dynamic.loading.PackageDefinitionStrategy$Trivial r4 = net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.Trivial.INSTANCE
                r5 = 0
                r6 = 1
                r0 = r7
                r1 = r8
                java.util.Map r7 = load(r0, r1, r2, r3, r4, r5, r6)
                return r7
        }

        @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "Assuring privilege is explicit user responsibility.", value = {"DP_CREATE_CLASSLOADER_INSIDE_DO_PRIVILEGED"})
        public static java.util.Map<net.bytebuddy.description.type.TypeDescription, java.lang.Class<?>> load(@net.bytebuddy.utility.nullability.MaybeNull java.lang.ClassLoader r9, java.util.Map<net.bytebuddy.description.type.TypeDescription, byte[]> r10, @net.bytebuddy.utility.nullability.MaybeNull java.security.ProtectionDomain r11, net.bytebuddy.dynamic.loading.ByteArrayClassLoader.PersistenceHandler r12, net.bytebuddy.dynamic.loading.PackageDefinitionStrategy r13, boolean r14, boolean r15) {
                java.util.HashMap r3 = new java.util.HashMap
                r3.<init>()
                java.util.Set r0 = r10.entrySet()
                java.util.Iterator r0 = r0.iterator()
            Ld:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L2b
                java.lang.Object r1 = r0.next()
                java.util.Map$Entry r1 = (java.util.Map.Entry) r1
                java.lang.Object r2 = r1.getKey()
                net.bytebuddy.description.type.TypeDescription r2 = (net.bytebuddy.description.type.TypeDescription) r2
                java.lang.String r2 = r2.getName()
                java.lang.Object r1 = r1.getValue()
                r3.put(r2, r1)
                goto Ld
            L2b:
                net.bytebuddy.dynamic.loading.ByteArrayClassLoader$ChildFirst r8 = new net.bytebuddy.dynamic.loading.ByteArrayClassLoader$ChildFirst
                net.bytebuddy.dynamic.loading.ClassFilePostProcessor$NoOp r7 = net.bytebuddy.dynamic.loading.ClassFilePostProcessor.NoOp.INSTANCE
                r0 = r8
                r1 = r9
                r2 = r15
                r4 = r11
                r5 = r12
                r6 = r13
                r0.<init>(r1, r2, r3, r4, r5, r6, r7)
                java.util.LinkedHashMap r9 = new java.util.LinkedHashMap
                r9.<init>()
                java.util.Set r10 = r10.keySet()
                java.util.Iterator r10 = r10.iterator()
            L45:
                boolean r11 = r10.hasNext()
                if (r11 == 0) goto La1
                java.lang.Object r11 = r10.next()
                net.bytebuddy.description.type.TypeDescription r11 = (net.bytebuddy.description.type.TypeDescription) r11
                java.lang.String r12 = r11.getName()     // Catch: java.lang.ClassNotFoundException -> L84
                r13 = 0
                java.lang.Class r12 = java.lang.Class.forName(r12, r13, r8)     // Catch: java.lang.ClassNotFoundException -> L84
                net.bytebuddy.utility.GraalImageCode r13 = net.bytebuddy.utility.GraalImageCode.getCurrent()     // Catch: java.lang.ClassNotFoundException -> L84
                boolean r13 = r13.isNativeImageExecution()     // Catch: java.lang.ClassNotFoundException -> L84
                if (r13 != 0) goto L86
                if (r14 == 0) goto L86
                java.lang.ClassLoader r13 = r12.getClassLoader()     // Catch: java.lang.ClassNotFoundException -> L84
                if (r13 != r8) goto L6d
                goto L86
            L6d:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.ClassNotFoundException -> L84
                java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.ClassNotFoundException -> L84
                r10.<init>()     // Catch: java.lang.ClassNotFoundException -> L84
                java.lang.String r13 = "Class already loaded: "
                r10.append(r13)     // Catch: java.lang.ClassNotFoundException -> L84
                r10.append(r12)     // Catch: java.lang.ClassNotFoundException -> L84
                java.lang.String r10 = r10.toString()     // Catch: java.lang.ClassNotFoundException -> L84
                r9.<init>(r10)     // Catch: java.lang.ClassNotFoundException -> L84
                throw r9     // Catch: java.lang.ClassNotFoundException -> L84
            L84:
                r9 = move-exception
                goto L8a
            L86:
                r9.put(r11, r12)     // Catch: java.lang.ClassNotFoundException -> L84
                goto L45
            L8a:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.lang.String r13 = "Cannot load class "
                r12.append(r13)
                r12.append(r11)
                java.lang.String r11 = r12.toString()
                r10.<init>(r11, r9)
                throw r10
            La1:
                return r9
        }

        @Override // java.lang.ClassLoader
        public java.net.URL getResource(java.lang.String r3) {
                r2 = this;
                net.bytebuddy.dynamic.loading.ByteArrayClassLoader$PersistenceHandler r0 = r2.persistenceHandler
                java.util.concurrent.ConcurrentMap<java.lang.String, byte[]> r1 = r2.typeDefinitions
                java.net.URL r0 = r0.url(r3, r1)
                if (r0 != 0) goto L15
                boolean r1 = r2.isShadowed(r3)
                if (r1 == 0) goto L11
                goto L15
            L11:
                java.net.URL r0 = super.getResource(r3)
            L15:
                return r0
        }

        @Override // java.lang.ClassLoader
        public java.util.Enumeration<java.net.URL> getResources(java.lang.String r3) throws java.io.IOException {
                r2 = this;
                net.bytebuddy.dynamic.loading.ByteArrayClassLoader$PersistenceHandler r0 = r2.persistenceHandler
                java.util.concurrent.ConcurrentMap<java.lang.String, byte[]> r1 = r2.typeDefinitions
                java.net.URL r0 = r0.url(r3, r1)
                if (r0 != 0) goto Lf
                java.util.Enumeration r3 = super.getResources(r3)
                goto L19
            Lf:
                net.bytebuddy.dynamic.loading.ByteArrayClassLoader$ChildFirst$PrependingEnumeration r1 = new net.bytebuddy.dynamic.loading.ByteArrayClassLoader$ChildFirst$PrependingEnumeration
                java.util.Enumeration r3 = super.getResources(r3)
                r1.<init>(r0, r3)
                r3 = r1
            L19:
                return r3
        }

        @Override // java.lang.ClassLoader
        public java.lang.Class<?> loadClass(java.lang.String r3, boolean r4) throws java.lang.ClassNotFoundException {
                r2 = this;
                net.bytebuddy.dynamic.loading.ByteArrayClassLoader$SynchronizationStrategy$Initializable r0 = net.bytebuddy.dynamic.loading.ByteArrayClassLoader.SYNCHRONIZATION_STRATEGY
                net.bytebuddy.dynamic.loading.ByteArrayClassLoader$SynchronizationStrategy r0 = r0.initialize()
                java.lang.Object r0 = r0.getClassLoadingLock(r2, r3)
                monitor-enter(r0)
                java.lang.Class r1 = r2.findLoadedClass(r3)     // Catch: java.lang.Throwable -> L13
                if (r1 == 0) goto L15
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
                return r1
            L13:
                r3 = move-exception
                goto L26
            L15:
                java.lang.Class r1 = r2.findClass(r3)     // Catch: java.lang.Throwable -> L13 java.lang.ClassNotFoundException -> L20
                if (r4 == 0) goto L1e
                r2.resolveClass(r1)     // Catch: java.lang.Throwable -> L13 java.lang.ClassNotFoundException -> L20
            L1e:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
                return r1
            L20:
                java.lang.Class r3 = super.loadClass(r3, r4)     // Catch: java.lang.Throwable -> L13
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
                return r3
            L26:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
                throw r3
        }
    }

    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance(includeSyntheticFields = true)
    public class ClassDefinitionAction implements java.security.PrivilegedAction<java.lang.Class<?>> {
        private final byte[] binaryRepresentation;
        private final java.lang.String name;
        final /* synthetic */ net.bytebuddy.dynamic.loading.ByteArrayClassLoader this$0;

        public ClassDefinitionAction(net.bytebuddy.dynamic.loading.ByteArrayClassLoader r1, java.lang.String r2, byte[] r3) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.name = r2
                r0.binaryRepresentation = r3
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
                java.lang.String r2 = r4.name
                net.bytebuddy.dynamic.loading.ByteArrayClassLoader$ClassDefinitionAction r5 = (net.bytebuddy.dynamic.loading.ByteArrayClassLoader.ClassDefinitionAction) r5
                java.lang.String r3 = r5.name
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L20
                return r1
            L20:
                byte[] r2 = r4.binaryRepresentation
                byte[] r3 = r5.binaryRepresentation
                boolean r2 = java.util.Arrays.equals(r2, r3)
                if (r2 != 0) goto L2b
                return r1
            L2b:
                net.bytebuddy.dynamic.loading.ByteArrayClassLoader r2 = r4.this$0
                net.bytebuddy.dynamic.loading.ByteArrayClassLoader r5 = r5.this$0
                boolean r5 = r2.equals(r5)
                if (r5 != 0) goto L36
                return r1
            L36:
                return r0
        }

        public int hashCode() {
                r2 = this;
                java.lang.Class r0 = r2.getClass()
                int r0 = r0.hashCode()
                int r0 = r0 * 31
                java.lang.String r1 = r2.name
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                int r0 = r0 * 31
                byte[] r1 = r2.binaryRepresentation
                int r1 = java.util.Arrays.hashCode(r1)
                int r0 = r0 + r1
                int r0 = r0 * 31
                net.bytebuddy.dynamic.loading.ByteArrayClassLoader r1 = r2.this$0
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                return r0
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.security.PrivilegedAction
        public java.lang.Class<?> run() {
                r12 = this;
                java.lang.String r0 = r12.name
                r1 = 46
                int r0 = r0.lastIndexOf(r1)
                r1 = -1
                if (r0 == r1) goto L6e
                java.lang.String r1 = r12.name
                r2 = 0
                java.lang.String r4 = r1.substring(r2, r0)
                net.bytebuddy.dynamic.loading.ByteArrayClassLoader r0 = r12.this$0
                net.bytebuddy.dynamic.loading.PackageDefinitionStrategy r1 = r0.packageDefinitionStrategy
                java.lang.String r2 = r12.name
                net.bytebuddy.dynamic.loading.PackageDefinitionStrategy$Definition r0 = r1.define(r0, r4, r2)
                boolean r1 = r0.isDefined()
                if (r1 == 0) goto L6e
                net.bytebuddy.dynamic.loading.ByteArrayClassLoader$PackageLookupStrategy r1 = net.bytebuddy.dynamic.loading.ByteArrayClassLoader.access$100()
                net.bytebuddy.dynamic.loading.ByteArrayClassLoader r2 = r12.this$0
                java.lang.Package r1 = r1.apply(r2, r4)
                if (r1 != 0) goto L50
                net.bytebuddy.dynamic.loading.ByteArrayClassLoader r3 = r12.this$0
                java.lang.String r5 = r0.getSpecificationTitle()
                java.lang.String r6 = r0.getSpecificationVersion()
                java.lang.String r7 = r0.getSpecificationVendor()
                java.lang.String r8 = r0.getImplementationTitle()
                java.lang.String r9 = r0.getImplementationVersion()
                java.lang.String r10 = r0.getImplementationVendor()
                java.net.URL r11 = r0.getSealBase()
                net.bytebuddy.dynamic.loading.ByteArrayClassLoader.access$200(r3, r4, r5, r6, r7, r8, r9, r10, r11)
                goto L6e
            L50:
                boolean r0 = r0.isCompatibleTo(r1)
                if (r0 == 0) goto L57
                goto L6e
            L57:
                java.lang.SecurityException r0 = new java.lang.SecurityException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Sealing violation for package "
                r1.append(r2)
                r1.append(r4)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L6e:
                net.bytebuddy.dynamic.loading.ByteArrayClassLoader r2 = r12.this$0
                java.lang.String r3 = r12.name
                byte[] r4 = r12.binaryRepresentation
                int r6 = r4.length
                java.security.ProtectionDomain r7 = r2.protectionDomain
                r5 = 0
                java.lang.Class r0 = net.bytebuddy.dynamic.loading.ByteArrayClassLoader.access$300(r2, r3, r4, r5, r6, r7)
                return r0
        }

        @Override // java.security.PrivilegedAction
        public /* bridge */ /* synthetic */ java.lang.Class<?> run() {
                r1 = this;
                java.lang.Class r0 = r1.run()
                return r0
        }
    }

    public enum EmptyEnumeration extends java.lang.Enum<net.bytebuddy.dynamic.loading.ByteArrayClassLoader.EmptyEnumeration> implements java.util.Enumeration<java.net.URL> {
        private static final /* synthetic */ net.bytebuddy.dynamic.loading.ByteArrayClassLoader.EmptyEnumeration[] $VALUES = null;
        public static final net.bytebuddy.dynamic.loading.ByteArrayClassLoader.EmptyEnumeration INSTANCE = null;

        static {
                net.bytebuddy.dynamic.loading.ByteArrayClassLoader$EmptyEnumeration r0 = new net.bytebuddy.dynamic.loading.ByteArrayClassLoader$EmptyEnumeration
                java.lang.String r1 = "INSTANCE"
                r2 = 0
                r0.<init>(r1, r2)
                net.bytebuddy.dynamic.loading.ByteArrayClassLoader.EmptyEnumeration.INSTANCE = r0
                net.bytebuddy.dynamic.loading.ByteArrayClassLoader$EmptyEnumeration[] r0 = new net.bytebuddy.dynamic.loading.ByteArrayClassLoader.EmptyEnumeration[]{r0}
                net.bytebuddy.dynamic.loading.ByteArrayClassLoader.EmptyEnumeration.$VALUES = r0
                return
        }

        EmptyEnumeration(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static net.bytebuddy.dynamic.loading.ByteArrayClassLoader.EmptyEnumeration valueOf(java.lang.String r1) {
                java.lang.Class<net.bytebuddy.dynamic.loading.ByteArrayClassLoader$EmptyEnumeration> r0 = net.bytebuddy.dynamic.loading.ByteArrayClassLoader.EmptyEnumeration.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                net.bytebuddy.dynamic.loading.ByteArrayClassLoader$EmptyEnumeration r1 = (net.bytebuddy.dynamic.loading.ByteArrayClassLoader.EmptyEnumeration) r1
                return r1
        }

        public static net.bytebuddy.dynamic.loading.ByteArrayClassLoader.EmptyEnumeration[] values() {
                net.bytebuddy.dynamic.loading.ByteArrayClassLoader$EmptyEnumeration[] r0 = net.bytebuddy.dynamic.loading.ByteArrayClassLoader.EmptyEnumeration.$VALUES
                java.lang.Object r0 = r0.clone()
                net.bytebuddy.dynamic.loading.ByteArrayClassLoader$EmptyEnumeration[] r0 = (net.bytebuddy.dynamic.loading.ByteArrayClassLoader.EmptyEnumeration[]) r0
                return r0
        }

        @Override // java.util.Enumeration
        public boolean hasMoreElements() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // java.util.Enumeration
        public /* bridge */ /* synthetic */ java.net.URL nextElement() {
                r1 = this;
                java.net.URL r0 = r1.nextElement2()
                return r0
        }

        @Override // java.util.Enumeration
        /* JADX INFO: renamed from: nextElement, reason: avoid collision after fix types in other method */
        public java.net.URL nextElement2() {
                r1 = this;
                java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                r0.<init>()
                throw r0
        }
    }

    public interface PackageLookupStrategy {

        public enum CreationAction extends java.lang.Enum<net.bytebuddy.dynamic.loading.ByteArrayClassLoader.PackageLookupStrategy.CreationAction> implements java.security.PrivilegedAction<net.bytebuddy.dynamic.loading.ByteArrayClassLoader.PackageLookupStrategy> {
            private static final /* synthetic */ net.bytebuddy.dynamic.loading.ByteArrayClassLoader.PackageLookupStrategy.CreationAction[] $VALUES = null;
            public static final net.bytebuddy.dynamic.loading.ByteArrayClassLoader.PackageLookupStrategy.CreationAction INSTANCE = null;

            static {
                    net.bytebuddy.dynamic.loading.ByteArrayClassLoader$PackageLookupStrategy$CreationAction r0 = new net.bytebuddy.dynamic.loading.ByteArrayClassLoader$PackageLookupStrategy$CreationAction
                    java.lang.String r1 = "INSTANCE"
                    r2 = 0
                    r0.<init>(r1, r2)
                    net.bytebuddy.dynamic.loading.ByteArrayClassLoader.PackageLookupStrategy.CreationAction.INSTANCE = r0
                    net.bytebuddy.dynamic.loading.ByteArrayClassLoader$PackageLookupStrategy$CreationAction[] r0 = new net.bytebuddy.dynamic.loading.ByteArrayClassLoader.PackageLookupStrategy.CreationAction[]{r0}
                    net.bytebuddy.dynamic.loading.ByteArrayClassLoader.PackageLookupStrategy.CreationAction.$VALUES = r0
                    return
            }

            CreationAction(java.lang.String r1, int r2) {
                    r0 = this;
                    r0.<init>(r1, r2)
                    return
            }

            public static net.bytebuddy.dynamic.loading.ByteArrayClassLoader.PackageLookupStrategy.CreationAction valueOf(java.lang.String r1) {
                    java.lang.Class<net.bytebuddy.dynamic.loading.ByteArrayClassLoader$PackageLookupStrategy$CreationAction> r0 = net.bytebuddy.dynamic.loading.ByteArrayClassLoader.PackageLookupStrategy.CreationAction.class
                    java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                    net.bytebuddy.dynamic.loading.ByteArrayClassLoader$PackageLookupStrategy$CreationAction r1 = (net.bytebuddy.dynamic.loading.ByteArrayClassLoader.PackageLookupStrategy.CreationAction) r1
                    return r1
            }

            public static net.bytebuddy.dynamic.loading.ByteArrayClassLoader.PackageLookupStrategy.CreationAction[] values() {
                    net.bytebuddy.dynamic.loading.ByteArrayClassLoader$PackageLookupStrategy$CreationAction[] r0 = net.bytebuddy.dynamic.loading.ByteArrayClassLoader.PackageLookupStrategy.CreationAction.$VALUES
                    java.lang.Object r0 = r0.clone()
                    net.bytebuddy.dynamic.loading.ByteArrayClassLoader$PackageLookupStrategy$CreationAction[] r0 = (net.bytebuddy.dynamic.loading.ByteArrayClassLoader.PackageLookupStrategy.CreationAction[]) r0
                    return r0
            }

            @Override // java.security.PrivilegedAction
            @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "Exception should not be rethrown but trigger a fallback.", value = {"REC_CATCH_EXCEPTION"})
            public /* bridge */ /* synthetic */ net.bytebuddy.dynamic.loading.ByteArrayClassLoader.PackageLookupStrategy run() {
                    r1 = this;
                    net.bytebuddy.dynamic.loading.ByteArrayClassLoader$PackageLookupStrategy r0 = r1.run2()
                    return r0
            }

            @Override // java.security.PrivilegedAction
            @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "Exception should not be rethrown but trigger a fallback.", value = {"REC_CATCH_EXCEPTION"})
            /* JADX INFO: renamed from: run, reason: avoid collision after fix types in other method */
            public net.bytebuddy.dynamic.loading.ByteArrayClassLoader.PackageLookupStrategy run2() {
                    r4 = this;
                    boolean r0 = net.bytebuddy.utility.JavaModule.isSupported()
                    if (r0 == 0) goto L1d
                    net.bytebuddy.dynamic.loading.ByteArrayClassLoader$PackageLookupStrategy$ForJava9CapableVm r0 = new net.bytebuddy.dynamic.loading.ByteArrayClassLoader$PackageLookupStrategy$ForJava9CapableVm     // Catch: java.lang.Exception -> L1a
                    java.lang.Class<java.lang.ClassLoader> r1 = java.lang.ClassLoader.class
                    java.lang.String r2 = "getDefinedPackage"
                    java.lang.Class<java.lang.String> r3 = java.lang.String.class
                    java.lang.Class[] r3 = new java.lang.Class[]{r3}     // Catch: java.lang.Exception -> L1a
                    java.lang.reflect.Method r1 = r1.getMethod(r2, r3)     // Catch: java.lang.Exception -> L1a
                    r0.<init>(r1)     // Catch: java.lang.Exception -> L1a
                    return r0
                L1a:
                    net.bytebuddy.dynamic.loading.ByteArrayClassLoader$PackageLookupStrategy$ForLegacyVm r0 = net.bytebuddy.dynamic.loading.ByteArrayClassLoader.PackageLookupStrategy.ForLegacyVm.INSTANCE
                    return r0
                L1d:
                    net.bytebuddy.dynamic.loading.ByteArrayClassLoader$PackageLookupStrategy$ForLegacyVm r0 = net.bytebuddy.dynamic.loading.ByteArrayClassLoader.PackageLookupStrategy.ForLegacyVm.INSTANCE
                    return r0
            }
        }

        @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
        public static class ForJava9CapableVm implements net.bytebuddy.dynamic.loading.ByteArrayClassLoader.PackageLookupStrategy {
            private final java.lang.reflect.Method getDefinedPackage;

            public ForJava9CapableVm(java.lang.reflect.Method r1) {
                    r0 = this;
                    r0.<init>()
                    r0.getDefinedPackage = r1
                    return
            }

            @Override // net.bytebuddy.dynamic.loading.ByteArrayClassLoader.PackageLookupStrategy
            @net.bytebuddy.utility.nullability.MaybeNull
            public java.lang.Package apply(net.bytebuddy.dynamic.loading.ByteArrayClassLoader r2, java.lang.String r3) {
                    r1 = this;
                    java.lang.reflect.Method r0 = r1.getDefinedPackage     // Catch: java.lang.reflect.InvocationTargetException -> Ld java.lang.IllegalAccessException -> Lf
                    java.lang.Object[] r3 = new java.lang.Object[]{r3}     // Catch: java.lang.reflect.InvocationTargetException -> Ld java.lang.IllegalAccessException -> Lf
                    java.lang.Object r2 = r0.invoke(r2, r3)     // Catch: java.lang.reflect.InvocationTargetException -> Ld java.lang.IllegalAccessException -> Lf
                    java.lang.Package r2 = (java.lang.Package) r2     // Catch: java.lang.reflect.InvocationTargetException -> Ld java.lang.IllegalAccessException -> Lf
                    return r2
                Ld:
                    r2 = move-exception
                    goto L11
                Lf:
                    r2 = move-exception
                    goto L1b
                L11:
                    java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                    java.lang.Throwable r2 = r2.getTargetException()
                    r3.<init>(r2)
                    throw r3
                L1b:
                    java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                    r3.<init>(r2)
                    throw r3
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
                    java.lang.reflect.Method r2 = r4.getDefinedPackage
                    net.bytebuddy.dynamic.loading.ByteArrayClassLoader$PackageLookupStrategy$ForJava9CapableVm r5 = (net.bytebuddy.dynamic.loading.ByteArrayClassLoader.PackageLookupStrategy.ForJava9CapableVm) r5
                    java.lang.reflect.Method r5 = r5.getDefinedPackage
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
                    java.lang.reflect.Method r1 = r2.getDefinedPackage
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    return r0
            }
        }

        public enum ForLegacyVm extends java.lang.Enum<net.bytebuddy.dynamic.loading.ByteArrayClassLoader.PackageLookupStrategy.ForLegacyVm> implements net.bytebuddy.dynamic.loading.ByteArrayClassLoader.PackageLookupStrategy {
            private static final /* synthetic */ net.bytebuddy.dynamic.loading.ByteArrayClassLoader.PackageLookupStrategy.ForLegacyVm[] $VALUES = null;
            public static final net.bytebuddy.dynamic.loading.ByteArrayClassLoader.PackageLookupStrategy.ForLegacyVm INSTANCE = null;

            static {
                    net.bytebuddy.dynamic.loading.ByteArrayClassLoader$PackageLookupStrategy$ForLegacyVm r0 = new net.bytebuddy.dynamic.loading.ByteArrayClassLoader$PackageLookupStrategy$ForLegacyVm
                    java.lang.String r1 = "INSTANCE"
                    r2 = 0
                    r0.<init>(r1, r2)
                    net.bytebuddy.dynamic.loading.ByteArrayClassLoader.PackageLookupStrategy.ForLegacyVm.INSTANCE = r0
                    net.bytebuddy.dynamic.loading.ByteArrayClassLoader$PackageLookupStrategy$ForLegacyVm[] r0 = new net.bytebuddy.dynamic.loading.ByteArrayClassLoader.PackageLookupStrategy.ForLegacyVm[]{r0}
                    net.bytebuddy.dynamic.loading.ByteArrayClassLoader.PackageLookupStrategy.ForLegacyVm.$VALUES = r0
                    return
            }

            ForLegacyVm(java.lang.String r1, int r2) {
                    r0 = this;
                    r0.<init>(r1, r2)
                    return
            }

            public static net.bytebuddy.dynamic.loading.ByteArrayClassLoader.PackageLookupStrategy.ForLegacyVm valueOf(java.lang.String r1) {
                    java.lang.Class<net.bytebuddy.dynamic.loading.ByteArrayClassLoader$PackageLookupStrategy$ForLegacyVm> r0 = net.bytebuddy.dynamic.loading.ByteArrayClassLoader.PackageLookupStrategy.ForLegacyVm.class
                    java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                    net.bytebuddy.dynamic.loading.ByteArrayClassLoader$PackageLookupStrategy$ForLegacyVm r1 = (net.bytebuddy.dynamic.loading.ByteArrayClassLoader.PackageLookupStrategy.ForLegacyVm) r1
                    return r1
            }

            public static net.bytebuddy.dynamic.loading.ByteArrayClassLoader.PackageLookupStrategy.ForLegacyVm[] values() {
                    net.bytebuddy.dynamic.loading.ByteArrayClassLoader$PackageLookupStrategy$ForLegacyVm[] r0 = net.bytebuddy.dynamic.loading.ByteArrayClassLoader.PackageLookupStrategy.ForLegacyVm.$VALUES
                    java.lang.Object r0 = r0.clone()
                    net.bytebuddy.dynamic.loading.ByteArrayClassLoader$PackageLookupStrategy$ForLegacyVm[] r0 = (net.bytebuddy.dynamic.loading.ByteArrayClassLoader.PackageLookupStrategy.ForLegacyVm[]) r0
                    return r0
            }

            @Override // net.bytebuddy.dynamic.loading.ByteArrayClassLoader.PackageLookupStrategy
            @net.bytebuddy.utility.nullability.MaybeNull
            public java.lang.Package apply(net.bytebuddy.dynamic.loading.ByteArrayClassLoader r1, java.lang.String r2) {
                    r0 = this;
                    java.lang.Package r1 = net.bytebuddy.dynamic.loading.ByteArrayClassLoader.access$400(r1, r2)
                    return r1
            }
        }

        @net.bytebuddy.utility.nullability.MaybeNull
        java.lang.Package apply(net.bytebuddy.dynamic.loading.ByteArrayClassLoader r1, java.lang.String r2);
    }

    public enum PersistenceHandler extends java.lang.Enum<net.bytebuddy.dynamic.loading.ByteArrayClassLoader.PersistenceHandler> {
        private static final /* synthetic */ net.bytebuddy.dynamic.loading.ByteArrayClassLoader.PersistenceHandler[] $VALUES = null;
        private static final java.lang.String CLASS_FILE_SUFFIX = ".class";
        public static final net.bytebuddy.dynamic.loading.ByteArrayClassLoader.PersistenceHandler LATENT = null;
        public static final net.bytebuddy.dynamic.loading.ByteArrayClassLoader.PersistenceHandler MANIFEST = null;
        private final boolean manifest;



        @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
        public static class UrlDefinitionAction implements java.security.PrivilegedAction<java.net.URL> {
            private static final boolean ACCESS_CONTROLLER = false;
            private static final net.bytebuddy.dynamic.loading.ByteArrayClassLoader.PersistenceHandler.UrlDefinitionAction.Dispatcher DISPATCHER = null;
            private static final java.lang.String ENCODING = "UTF-8";
            private static final java.lang.String NO_FILE = "";
            private static final int NO_PORT = -1;
            private final byte[] binaryRepresentation;
            private final java.lang.String typeName;

            @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
            public static class ByteArrayUrlStreamHandler extends java.net.URLStreamHandler {
                private final byte[] binaryRepresentation;

                public static class ByteArrayUrlConnection extends java.net.URLConnection {
                    private final java.io.InputStream inputStream;

                    public ByteArrayUrlConnection(java.net.URL r1, java.io.InputStream r2) {
                            r0 = this;
                            r0.<init>(r1)
                            r0.inputStream = r2
                            return
                    }

                    @Override // java.net.URLConnection
                    public void connect() {
                            r1 = this;
                            r0 = 1
                            r1.connected = r0
                            return
                    }

                    @Override // java.net.URLConnection
                    public java.io.InputStream getInputStream() {
                            r1 = this;
                            r1.connect()
                            java.io.InputStream r0 = r1.inputStream
                            return r0
                    }
                }

                public ByteArrayUrlStreamHandler(byte[] r1) {
                        r0 = this;
                        r0.<init>()
                        r0.binaryRepresentation = r1
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
                        byte[] r2 = r4.binaryRepresentation
                        net.bytebuddy.dynamic.loading.ByteArrayClassLoader$PersistenceHandler$UrlDefinitionAction$ByteArrayUrlStreamHandler r5 = (net.bytebuddy.dynamic.loading.ByteArrayClassLoader.PersistenceHandler.UrlDefinitionAction.ByteArrayUrlStreamHandler) r5
                        byte[] r5 = r5.binaryRepresentation
                        boolean r5 = java.util.Arrays.equals(r2, r5)
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
                        byte[] r1 = r2.binaryRepresentation
                        int r1 = java.util.Arrays.hashCode(r1)
                        int r0 = r0 + r1
                        return r0
                }

                @Override // java.net.URLStreamHandler
                public java.net.URLConnection openConnection(java.net.URL r4) {
                        r3 = this;
                        net.bytebuddy.dynamic.loading.ByteArrayClassLoader$PersistenceHandler$UrlDefinitionAction$ByteArrayUrlStreamHandler$ByteArrayUrlConnection r0 = new net.bytebuddy.dynamic.loading.ByteArrayClassLoader$PersistenceHandler$UrlDefinitionAction$ByteArrayUrlStreamHandler$ByteArrayUrlConnection
                        java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream
                        byte[] r2 = r3.binaryRepresentation
                        r1.<init>(r2)
                        r0.<init>(r4, r1)
                        return r0
                }
            }

            @net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied("java.net.URL")
            public interface Dispatcher {
                @net.bytebuddy.utility.dispatcher.JavaDispatcher.IsConstructor
                @net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied("make")
                java.net.URL make(java.lang.String r1, java.lang.String r2, int r3, java.lang.String r4, java.net.URLStreamHandler r5) throws java.net.MalformedURLException;

                @net.bytebuddy.utility.dispatcher.JavaDispatcher.IsStatic
                @net.bytebuddy.utility.dispatcher.JavaDispatcher.Defaults
                @net.bytebuddy.utility.nullability.MaybeNull
                @net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied("of")
                java.net.URL of(java.net.URI r1, java.net.URLStreamHandler r2) throws java.net.MalformedURLException;
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
                    net.bytebuddy.dynamic.loading.ByteArrayClassLoader.PersistenceHandler.UrlDefinitionAction.ACCESS_CONTROLLER = r1     // Catch: java.lang.SecurityException -> L16 java.lang.ClassNotFoundException -> L17
                    goto L19
                L16:
                    r0 = 1
                L17:
                    net.bytebuddy.dynamic.loading.ByteArrayClassLoader.PersistenceHandler.UrlDefinitionAction.ACCESS_CONTROLLER = r0
                L19:
                    java.lang.Class<net.bytebuddy.dynamic.loading.ByteArrayClassLoader$PersistenceHandler$UrlDefinitionAction$Dispatcher> r0 = net.bytebuddy.dynamic.loading.ByteArrayClassLoader.PersistenceHandler.UrlDefinitionAction.Dispatcher.class
                    java.security.PrivilegedAction r0 = net.bytebuddy.utility.dispatcher.JavaDispatcher.of(r0)
                    java.lang.Object r0 = doPrivileged(r0)
                    net.bytebuddy.dynamic.loading.ByteArrayClassLoader$PersistenceHandler$UrlDefinitionAction$Dispatcher r0 = (net.bytebuddy.dynamic.loading.ByteArrayClassLoader.PersistenceHandler.UrlDefinitionAction.Dispatcher) r0
                    net.bytebuddy.dynamic.loading.ByteArrayClassLoader.PersistenceHandler.UrlDefinitionAction.DISPATCHER = r0
                    return
            }

            public UrlDefinitionAction(java.lang.String r1, byte[] r2) {
                    r0 = this;
                    r0.<init>()
                    r0.typeName = r1
                    r0.binaryRepresentation = r2
                    return
            }

            @net.bytebuddy.build.AccessControllerPlugin.Enhance
            private static <T> T doPrivileged(java.security.PrivilegedAction<T> r1) {
                    boolean r0 = net.bytebuddy.dynamic.loading.ByteArrayClassLoader.PersistenceHandler.UrlDefinitionAction.ACCESS_CONTROLLER
                    if (r0 == 0) goto L9
                    java.lang.Object r1 = java.security.AccessController.doPrivileged(r1)
                    return r1
                L9:
                    java.lang.Object r1 = r1.run()
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
                    java.lang.String r2 = r4.typeName
                    net.bytebuddy.dynamic.loading.ByteArrayClassLoader$PersistenceHandler$UrlDefinitionAction r5 = (net.bytebuddy.dynamic.loading.ByteArrayClassLoader.PersistenceHandler.UrlDefinitionAction) r5
                    java.lang.String r3 = r5.typeName
                    boolean r2 = r2.equals(r3)
                    if (r2 != 0) goto L20
                    return r1
                L20:
                    byte[] r2 = r4.binaryRepresentation
                    byte[] r5 = r5.binaryRepresentation
                    boolean r5 = java.util.Arrays.equals(r2, r5)
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
                    java.lang.String r1 = r2.typeName
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    int r0 = r0 * 31
                    byte[] r1 = r2.binaryRepresentation
                    int r1 = java.util.Arrays.hashCode(r1)
                    int r0 = r0 + r1
                    return r0
            }

            @Override // java.security.PrivilegedAction
            public /* bridge */ /* synthetic */ java.net.URL run() {
                    r1 = this;
                    java.net.URL r0 = r1.run2()
                    return r0
            }

            @Override // java.security.PrivilegedAction
            /* JADX INFO: renamed from: run, reason: avoid collision after fix types in other method */
            public java.net.URL run2() {
                    r8 = this;
                    java.lang.String r0 = r8.typeName     // Catch: java.io.UnsupportedEncodingException -> L3e java.net.MalformedURLException -> L40
                    r1 = 46
                    r2 = 47
                    java.lang.String r0 = r0.replace(r1, r2)     // Catch: java.io.UnsupportedEncodingException -> L3e java.net.MalformedURLException -> L40
                    java.lang.String r1 = "UTF-8"
                    java.lang.String r4 = java.net.URLEncoder.encode(r0, r1)     // Catch: java.io.UnsupportedEncodingException -> L3e java.net.MalformedURLException -> L40
                    net.bytebuddy.dynamic.loading.ByteArrayClassLoader$PersistenceHandler$UrlDefinitionAction$ByteArrayUrlStreamHandler r7 = new net.bytebuddy.dynamic.loading.ByteArrayClassLoader$PersistenceHandler$UrlDefinitionAction$ByteArrayUrlStreamHandler     // Catch: java.io.UnsupportedEncodingException -> L3e java.net.MalformedURLException -> L40
                    byte[] r0 = r8.binaryRepresentation     // Catch: java.io.UnsupportedEncodingException -> L3e java.net.MalformedURLException -> L40
                    r7.<init>(r0)     // Catch: java.io.UnsupportedEncodingException -> L3e java.net.MalformedURLException -> L40
                    net.bytebuddy.dynamic.loading.ByteArrayClassLoader$PersistenceHandler$UrlDefinitionAction$Dispatcher r2 = net.bytebuddy.dynamic.loading.ByteArrayClassLoader.PersistenceHandler.UrlDefinitionAction.DISPATCHER     // Catch: java.io.UnsupportedEncodingException -> L3e java.net.MalformedURLException -> L40
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.io.UnsupportedEncodingException -> L3e java.net.MalformedURLException -> L40
                    r0.<init>()     // Catch: java.io.UnsupportedEncodingException -> L3e java.net.MalformedURLException -> L40
                    java.lang.String r1 = "bytebuddy://"
                    r0.append(r1)     // Catch: java.io.UnsupportedEncodingException -> L3e java.net.MalformedURLException -> L40
                    r0.append(r4)     // Catch: java.io.UnsupportedEncodingException -> L3e java.net.MalformedURLException -> L40
                    java.lang.String r0 = r0.toString()     // Catch: java.io.UnsupportedEncodingException -> L3e java.net.MalformedURLException -> L40
                    java.net.URI r0 = java.net.URI.create(r0)     // Catch: java.io.UnsupportedEncodingException -> L3e java.net.MalformedURLException -> L40
                    java.net.URL r0 = r2.of(r0, r7)     // Catch: java.io.UnsupportedEncodingException -> L3e java.net.MalformedURLException -> L40
                    if (r0 != 0) goto L42
                    java.lang.String r3 = "bytebuddy"
                    java.lang.String r6 = ""
                    r5 = -1
                    java.net.URL r0 = r2.make(r3, r4, r5, r6, r7)     // Catch: java.io.UnsupportedEncodingException -> L3e java.net.MalformedURLException -> L40
                    goto L42
                L3e:
                    r0 = move-exception
                    goto L43
                L40:
                    r0 = move-exception
                    goto L4b
                L42:
                    return r0
                L43:
                    java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                    java.lang.String r2 = "Could not find encoding: UTF-8"
                    r1.<init>(r2, r0)
                    throw r1
                L4b:
                    java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                    java.lang.StringBuilder r2 = new java.lang.StringBuilder
                    r2.<init>()
                    java.lang.String r3 = "Cannot create URL for "
                    r2.append(r3)
                    java.lang.String r3 = r8.typeName
                    r2.append(r3)
                    java.lang.String r2 = r2.toString()
                    r1.<init>(r2, r0)
                    throw r1
            }
        }

        static {
                net.bytebuddy.dynamic.loading.ByteArrayClassLoader$PersistenceHandler$1 r0 = new net.bytebuddy.dynamic.loading.ByteArrayClassLoader$PersistenceHandler$1
                java.lang.String r1 = "MANIFEST"
                r2 = 0
                r3 = 1
                r0.<init>(r1, r2, r3)
                net.bytebuddy.dynamic.loading.ByteArrayClassLoader.PersistenceHandler.MANIFEST = r0
                net.bytebuddy.dynamic.loading.ByteArrayClassLoader$PersistenceHandler$2 r1 = new net.bytebuddy.dynamic.loading.ByteArrayClassLoader$PersistenceHandler$2
                java.lang.String r4 = "LATENT"
                r1.<init>(r4, r3, r2)
                net.bytebuddy.dynamic.loading.ByteArrayClassLoader.PersistenceHandler.LATENT = r1
                r4 = 2
                net.bytebuddy.dynamic.loading.ByteArrayClassLoader$PersistenceHandler[] r4 = new net.bytebuddy.dynamic.loading.ByteArrayClassLoader.PersistenceHandler[r4]
                r4[r2] = r0
                r4[r3] = r1
                net.bytebuddy.dynamic.loading.ByteArrayClassLoader.PersistenceHandler.$VALUES = r4
                return
        }

        PersistenceHandler(java.lang.String r1, int r2, boolean r3) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.manifest = r3
                return
        }

        /* synthetic */ PersistenceHandler(java.lang.String r1, int r2, boolean r3, net.bytebuddy.dynamic.loading.ByteArrayClassLoader.AnonymousClass1 r4) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                return
        }

        public static net.bytebuddy.dynamic.loading.ByteArrayClassLoader.PersistenceHandler valueOf(java.lang.String r1) {
                java.lang.Class<net.bytebuddy.dynamic.loading.ByteArrayClassLoader$PersistenceHandler> r0 = net.bytebuddy.dynamic.loading.ByteArrayClassLoader.PersistenceHandler.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                net.bytebuddy.dynamic.loading.ByteArrayClassLoader$PersistenceHandler r1 = (net.bytebuddy.dynamic.loading.ByteArrayClassLoader.PersistenceHandler) r1
                return r1
        }

        public static net.bytebuddy.dynamic.loading.ByteArrayClassLoader.PersistenceHandler[] values() {
                net.bytebuddy.dynamic.loading.ByteArrayClassLoader$PersistenceHandler[] r0 = net.bytebuddy.dynamic.loading.ByteArrayClassLoader.PersistenceHandler.$VALUES
                java.lang.Object r0 = r0.clone()
                net.bytebuddy.dynamic.loading.ByteArrayClassLoader$PersistenceHandler[] r0 = (net.bytebuddy.dynamic.loading.ByteArrayClassLoader.PersistenceHandler[]) r0
                return r0
        }

        public boolean isManifest() {
                r1 = this;
                boolean r0 = r1.manifest
                return r0
        }

        @net.bytebuddy.utility.nullability.MaybeNull
        public abstract byte[] lookup(java.lang.String r1, java.util.concurrent.ConcurrentMap<java.lang.String, byte[]> r2);

        public abstract void release(java.lang.String r1, java.util.concurrent.ConcurrentMap<java.lang.String, byte[]> r2);

        @net.bytebuddy.utility.nullability.MaybeNull
        public abstract java.net.URL url(java.lang.String r1, java.util.concurrent.ConcurrentMap<java.lang.String, byte[]> r2);
    }

    public static class SingletonEnumeration implements java.util.Enumeration<java.net.URL> {

        @net.bytebuddy.utility.nullability.MaybeNull
        private java.net.URL element;

        public SingletonEnumeration(java.net.URL r1) {
                r0 = this;
                r0.<init>()
                r0.element = r1
                return
        }

        @Override // java.util.Enumeration
        public boolean hasMoreElements() {
                r1 = this;
                java.net.URL r0 = r1.element
                if (r0 == 0) goto L6
                r0 = 1
                goto L7
            L6:
                r0 = 0
            L7:
                return r0
        }

        @Override // java.util.Enumeration
        public /* bridge */ /* synthetic */ java.net.URL nextElement() {
                r1 = this;
                java.net.URL r0 = r1.nextElement2()
                return r0
        }

        @Override // java.util.Enumeration
        /* JADX INFO: renamed from: nextElement, reason: avoid collision after fix types in other method */
        public java.net.URL nextElement2() {
                r2 = this;
                java.net.URL r0 = r2.element
                if (r0 == 0) goto L8
                r1 = 0
                r2.element = r1
                return r0
            L8:
                java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                r0.<init>()
                throw r0
        }
    }

    public interface SynchronizationStrategy {

        public enum CreationAction extends java.lang.Enum<net.bytebuddy.dynamic.loading.ByteArrayClassLoader.SynchronizationStrategy.CreationAction> implements java.security.PrivilegedAction<net.bytebuddy.dynamic.loading.ByteArrayClassLoader.SynchronizationStrategy.Initializable> {
            private static final /* synthetic */ net.bytebuddy.dynamic.loading.ByteArrayClassLoader.SynchronizationStrategy.CreationAction[] $VALUES = null;
            public static final net.bytebuddy.dynamic.loading.ByteArrayClassLoader.SynchronizationStrategy.CreationAction INSTANCE = null;

            static {
                    net.bytebuddy.dynamic.loading.ByteArrayClassLoader$SynchronizationStrategy$CreationAction r0 = new net.bytebuddy.dynamic.loading.ByteArrayClassLoader$SynchronizationStrategy$CreationAction
                    java.lang.String r1 = "INSTANCE"
                    r2 = 0
                    r0.<init>(r1, r2)
                    net.bytebuddy.dynamic.loading.ByteArrayClassLoader.SynchronizationStrategy.CreationAction.INSTANCE = r0
                    net.bytebuddy.dynamic.loading.ByteArrayClassLoader$SynchronizationStrategy$CreationAction[] r0 = new net.bytebuddy.dynamic.loading.ByteArrayClassLoader.SynchronizationStrategy.CreationAction[]{r0}
                    net.bytebuddy.dynamic.loading.ByteArrayClassLoader.SynchronizationStrategy.CreationAction.$VALUES = r0
                    return
            }

            CreationAction(java.lang.String r1, int r2) {
                    r0 = this;
                    r0.<init>(r1, r2)
                    return
            }

            public static net.bytebuddy.dynamic.loading.ByteArrayClassLoader.SynchronizationStrategy.CreationAction valueOf(java.lang.String r1) {
                    java.lang.Class<net.bytebuddy.dynamic.loading.ByteArrayClassLoader$SynchronizationStrategy$CreationAction> r0 = net.bytebuddy.dynamic.loading.ByteArrayClassLoader.SynchronizationStrategy.CreationAction.class
                    java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                    net.bytebuddy.dynamic.loading.ByteArrayClassLoader$SynchronizationStrategy$CreationAction r1 = (net.bytebuddy.dynamic.loading.ByteArrayClassLoader.SynchronizationStrategy.CreationAction) r1
                    return r1
            }

            public static net.bytebuddy.dynamic.loading.ByteArrayClassLoader.SynchronizationStrategy.CreationAction[] values() {
                    net.bytebuddy.dynamic.loading.ByteArrayClassLoader$SynchronizationStrategy$CreationAction[] r0 = net.bytebuddy.dynamic.loading.ByteArrayClassLoader.SynchronizationStrategy.CreationAction.$VALUES
                    java.lang.Object r0 = r0.clone()
                    net.bytebuddy.dynamic.loading.ByteArrayClassLoader$SynchronizationStrategy$CreationAction[] r0 = (net.bytebuddy.dynamic.loading.ByteArrayClassLoader.SynchronizationStrategy.CreationAction[]) r0
                    return r0
            }

            @Override // java.security.PrivilegedAction
            @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "Exception should not be rethrown but trigger a fallback.", value = {"REC_CATCH_EXCEPTION"})
            public /* bridge */ /* synthetic */ net.bytebuddy.dynamic.loading.ByteArrayClassLoader.SynchronizationStrategy.Initializable run() {
                    r1 = this;
                    net.bytebuddy.dynamic.loading.ByteArrayClassLoader$SynchronizationStrategy$Initializable r0 = r1.run2()
                    return r0
            }

            @Override // java.security.PrivilegedAction
            @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "Exception should not be rethrown but trigger a fallback.", value = {"REC_CATCH_EXCEPTION"})
            /* JADX INFO: renamed from: run, reason: avoid collision after fix types in other method */
            public net.bytebuddy.dynamic.loading.ByteArrayClassLoader.SynchronizationStrategy.Initializable run2() {
                    r12 = this;
                    java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
                    java.lang.String r1 = "getClassLoadingLock"
                    java.lang.Class<java.lang.ClassLoader> r2 = java.lang.ClassLoader.class
                    java.lang.Class<java.lang.Class> r3 = java.lang.Class.class
                    java.lang.Class<java.lang.String> r4 = java.lang.String.class
                    java.lang.String r5 = "java.lang.invoke.MethodType"
                    java.lang.Class r5 = java.lang.Class.forName(r5)     // Catch: java.lang.Exception -> L67
                    java.lang.String r6 = "java.lang.invoke.MethodHandle"
                    java.lang.Class r6 = java.lang.Class.forName(r6)     // Catch: java.lang.Exception -> L67
                    net.bytebuddy.dynamic.loading.ByteArrayClassLoader$SynchronizationStrategy$ForJava8CapableVm r7 = new net.bytebuddy.dynamic.loading.ByteArrayClassLoader$SynchronizationStrategy$ForJava8CapableVm     // Catch: java.lang.Exception -> L67
                    java.lang.String r8 = "java.lang.invoke.MethodHandles$Lookup"
                    java.lang.Class r8 = java.lang.Class.forName(r8)     // Catch: java.lang.Exception -> L67
                    java.lang.String r9 = "findVirtual"
                    java.lang.Class[] r10 = new java.lang.Class[]{r3, r4, r5}     // Catch: java.lang.Exception -> L67
                    java.lang.reflect.Method r8 = r8.getMethod(r9, r10)     // Catch: java.lang.Exception -> L67
                    java.lang.Object r9 = net.bytebuddy.dynamic.loading.ByteArrayClassLoader.access$000()     // Catch: java.lang.Exception -> L67
                    java.lang.String r10 = "methodType"
                    java.lang.Class<java.lang.Class[]> r11 = java.lang.Class[].class
                    java.lang.Class[] r3 = new java.lang.Class[]{r3, r11}     // Catch: java.lang.Exception -> L67
                    java.lang.reflect.Method r3 = r5.getMethod(r10, r3)     // Catch: java.lang.Exception -> L67
                    java.lang.Class[] r5 = new java.lang.Class[]{r4}     // Catch: java.lang.Exception -> L67
                    java.lang.Object[] r5 = new java.lang.Object[]{r0, r5}     // Catch: java.lang.Exception -> L67
                    r10 = 0
                    java.lang.Object r3 = r3.invoke(r10, r5)     // Catch: java.lang.Exception -> L67
                    java.lang.Object[] r3 = new java.lang.Object[]{r2, r1, r3}     // Catch: java.lang.Exception -> L67
                    java.lang.Object r3 = r8.invoke(r9, r3)     // Catch: java.lang.Exception -> L67
                    java.lang.String r5 = "bindTo"
                    java.lang.Class[] r0 = new java.lang.Class[]{r0}     // Catch: java.lang.Exception -> L67
                    java.lang.reflect.Method r0 = r6.getMethod(r5, r0)     // Catch: java.lang.Exception -> L67
                    java.lang.String r5 = "invokeWithArguments"
                    java.lang.Class<java.lang.Object[]> r8 = java.lang.Object[].class
                    java.lang.Class[] r8 = new java.lang.Class[]{r8}     // Catch: java.lang.Exception -> L67
                    java.lang.reflect.Method r5 = r6.getMethod(r5, r8)     // Catch: java.lang.Exception -> L67
                    r7.<init>(r3, r0, r5)     // Catch: java.lang.Exception -> L67
                    return r7
                L67:
                    net.bytebuddy.ClassFileVersion r0 = net.bytebuddy.ClassFileVersion.JAVA_V5     // Catch: java.lang.Exception -> L8e
                    net.bytebuddy.ClassFileVersion r0 = net.bytebuddy.ClassFileVersion.ofThisVm(r0)     // Catch: java.lang.Exception -> L8e
                    net.bytebuddy.ClassFileVersion r3 = net.bytebuddy.ClassFileVersion.JAVA_V9     // Catch: java.lang.Exception -> L8e
                    boolean r0 = r0.isAtLeast(r3)     // Catch: java.lang.Exception -> L8e
                    if (r0 == 0) goto L80
                    java.lang.Class<net.bytebuddy.dynamic.loading.ByteArrayClassLoader> r0 = net.bytebuddy.dynamic.loading.ByteArrayClassLoader.class
                    java.lang.ClassLoader r0 = r0.getClassLoader()     // Catch: java.lang.Exception -> L8e
                    if (r0 != 0) goto L80
                    net.bytebuddy.dynamic.loading.ByteArrayClassLoader$SynchronizationStrategy$ForLegacyVm r0 = net.bytebuddy.dynamic.loading.ByteArrayClassLoader.SynchronizationStrategy.ForLegacyVm.INSTANCE     // Catch: java.lang.Exception -> L8e
                    goto L8d
                L80:
                    net.bytebuddy.dynamic.loading.ByteArrayClassLoader$SynchronizationStrategy$ForJava7CapableVm r0 = new net.bytebuddy.dynamic.loading.ByteArrayClassLoader$SynchronizationStrategy$ForJava7CapableVm     // Catch: java.lang.Exception -> L8e
                    java.lang.Class[] r3 = new java.lang.Class[]{r4}     // Catch: java.lang.Exception -> L8e
                    java.lang.reflect.Method r1 = r2.getDeclaredMethod(r1, r3)     // Catch: java.lang.Exception -> L8e
                    r0.<init>(r1)     // Catch: java.lang.Exception -> L8e
                L8d:
                    return r0
                L8e:
                    net.bytebuddy.dynamic.loading.ByteArrayClassLoader$SynchronizationStrategy$ForLegacyVm r0 = net.bytebuddy.dynamic.loading.ByteArrayClassLoader.SynchronizationStrategy.ForLegacyVm.INSTANCE
                    return r0
            }
        }

        @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
        public static class ForJava7CapableVm implements net.bytebuddy.dynamic.loading.ByteArrayClassLoader.SynchronizationStrategy, net.bytebuddy.dynamic.loading.ByteArrayClassLoader.SynchronizationStrategy.Initializable {
            private final java.lang.reflect.Method method;

            public ForJava7CapableVm(java.lang.reflect.Method r1) {
                    r0 = this;
                    r0.<init>()
                    r0.method = r1
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
                    java.lang.reflect.Method r2 = r4.method
                    net.bytebuddy.dynamic.loading.ByteArrayClassLoader$SynchronizationStrategy$ForJava7CapableVm r5 = (net.bytebuddy.dynamic.loading.ByteArrayClassLoader.SynchronizationStrategy.ForJava7CapableVm) r5
                    java.lang.reflect.Method r5 = r5.method
                    boolean r5 = r2.equals(r5)
                    if (r5 != 0) goto L20
                    return r1
                L20:
                    return r0
            }

            @Override // net.bytebuddy.dynamic.loading.ByteArrayClassLoader.SynchronizationStrategy
            public java.lang.Object getClassLoadingLock(net.bytebuddy.dynamic.loading.ByteArrayClassLoader r2, java.lang.String r3) {
                    r1 = this;
                    java.lang.reflect.Method r0 = r1.method     // Catch: java.lang.reflect.InvocationTargetException -> Lb java.lang.IllegalAccessException -> Ld
                    java.lang.Object[] r3 = new java.lang.Object[]{r3}     // Catch: java.lang.reflect.InvocationTargetException -> Lb java.lang.IllegalAccessException -> Ld
                    java.lang.Object r2 = r0.invoke(r2, r3)     // Catch: java.lang.reflect.InvocationTargetException -> Lb java.lang.IllegalAccessException -> Ld
                    return r2
                Lb:
                    r2 = move-exception
                    goto Lf
                Ld:
                    r2 = move-exception
                    goto L19
                Lf:
                    java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                    java.lang.Throwable r2 = r2.getTargetException()
                    r3.<init>(r2)
                    throw r3
                L19:
                    java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                    r3.<init>(r2)
                    throw r3
            }

            public int hashCode() {
                    r2 = this;
                    java.lang.Class r0 = r2.getClass()
                    int r0 = r0.hashCode()
                    int r0 = r0 * 31
                    java.lang.reflect.Method r1 = r2.method
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    return r0
            }

            @Override // net.bytebuddy.dynamic.loading.ByteArrayClassLoader.SynchronizationStrategy.Initializable
            @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "Assuring privilege is explicit user responsibility.", value = {"DP_DO_INSIDE_DO_PRIVILEGED"})
            public net.bytebuddy.dynamic.loading.ByteArrayClassLoader.SynchronizationStrategy initialize() {
                    r2 = this;
                    java.lang.reflect.Method r0 = r2.method     // Catch: java.lang.Exception -> L7
                    r1 = 1
                    r0.setAccessible(r1)     // Catch: java.lang.Exception -> L7
                    return r2
                L7:
                    net.bytebuddy.dynamic.loading.ByteArrayClassLoader$SynchronizationStrategy$ForLegacyVm r0 = net.bytebuddy.dynamic.loading.ByteArrayClassLoader.SynchronizationStrategy.ForLegacyVm.INSTANCE
                    return r0
            }
        }

        @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
        public static class ForJava8CapableVm implements net.bytebuddy.dynamic.loading.ByteArrayClassLoader.SynchronizationStrategy, net.bytebuddy.dynamic.loading.ByteArrayClassLoader.SynchronizationStrategy.Initializable {
            private final java.lang.reflect.Method bindTo;
            private final java.lang.reflect.Method invokeWithArguments;
            private final java.lang.Object methodHandle;

            public ForJava8CapableVm(java.lang.Object r1, java.lang.reflect.Method r2, java.lang.reflect.Method r3) {
                    r0 = this;
                    r0.<init>()
                    r0.methodHandle = r1
                    r0.bindTo = r2
                    r0.invokeWithArguments = r3
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
                    java.lang.Object r2 = r4.methodHandle
                    net.bytebuddy.dynamic.loading.ByteArrayClassLoader$SynchronizationStrategy$ForJava8CapableVm r5 = (net.bytebuddy.dynamic.loading.ByteArrayClassLoader.SynchronizationStrategy.ForJava8CapableVm) r5
                    java.lang.Object r3 = r5.methodHandle
                    boolean r2 = r2.equals(r3)
                    if (r2 != 0) goto L20
                    return r1
                L20:
                    java.lang.reflect.Method r2 = r4.bindTo
                    java.lang.reflect.Method r3 = r5.bindTo
                    boolean r2 = r2.equals(r3)
                    if (r2 != 0) goto L2b
                    return r1
                L2b:
                    java.lang.reflect.Method r2 = r4.invokeWithArguments
                    java.lang.reflect.Method r5 = r5.invokeWithArguments
                    boolean r5 = r2.equals(r5)
                    if (r5 != 0) goto L36
                    return r1
                L36:
                    return r0
            }

            @Override // net.bytebuddy.dynamic.loading.ByteArrayClassLoader.SynchronizationStrategy
            public java.lang.Object getClassLoadingLock(net.bytebuddy.dynamic.loading.ByteArrayClassLoader r4, java.lang.String r5) {
                    r3 = this;
                    java.lang.reflect.Method r0 = r3.invokeWithArguments     // Catch: java.lang.reflect.InvocationTargetException -> L1b java.lang.IllegalAccessException -> L1d
                    java.lang.reflect.Method r1 = r3.bindTo     // Catch: java.lang.reflect.InvocationTargetException -> L1b java.lang.IllegalAccessException -> L1d
                    java.lang.Object r2 = r3.methodHandle     // Catch: java.lang.reflect.InvocationTargetException -> L1b java.lang.IllegalAccessException -> L1d
                    java.lang.Object[] r4 = new java.lang.Object[]{r4}     // Catch: java.lang.reflect.InvocationTargetException -> L1b java.lang.IllegalAccessException -> L1d
                    java.lang.Object r4 = r1.invoke(r2, r4)     // Catch: java.lang.reflect.InvocationTargetException -> L1b java.lang.IllegalAccessException -> L1d
                    java.lang.Object[] r5 = new java.lang.Object[]{r5}     // Catch: java.lang.reflect.InvocationTargetException -> L1b java.lang.IllegalAccessException -> L1d
                    java.lang.Object[] r5 = new java.lang.Object[]{r5}     // Catch: java.lang.reflect.InvocationTargetException -> L1b java.lang.IllegalAccessException -> L1d
                    java.lang.Object r4 = r0.invoke(r4, r5)     // Catch: java.lang.reflect.InvocationTargetException -> L1b java.lang.IllegalAccessException -> L1d
                    return r4
                L1b:
                    r4 = move-exception
                    goto L1f
                L1d:
                    r4 = move-exception
                    goto L29
                L1f:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.Throwable r4 = r4.getTargetException()
                    r5.<init>(r4)
                    throw r5
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    r5.<init>(r4)
                    throw r5
            }

            public int hashCode() {
                    r2 = this;
                    java.lang.Class r0 = r2.getClass()
                    int r0 = r0.hashCode()
                    int r0 = r0 * 31
                    java.lang.Object r1 = r2.methodHandle
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    int r0 = r0 * 31
                    java.lang.reflect.Method r1 = r2.bindTo
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    int r0 = r0 * 31
                    java.lang.reflect.Method r1 = r2.invokeWithArguments
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    return r0
            }

            @Override // net.bytebuddy.dynamic.loading.ByteArrayClassLoader.SynchronizationStrategy.Initializable
            public net.bytebuddy.dynamic.loading.ByteArrayClassLoader.SynchronizationStrategy initialize() {
                    r0 = this;
                    return r0
            }
        }

        public enum ForLegacyVm extends java.lang.Enum<net.bytebuddy.dynamic.loading.ByteArrayClassLoader.SynchronizationStrategy.ForLegacyVm> implements net.bytebuddy.dynamic.loading.ByteArrayClassLoader.SynchronizationStrategy, net.bytebuddy.dynamic.loading.ByteArrayClassLoader.SynchronizationStrategy.Initializable {
            private static final /* synthetic */ net.bytebuddy.dynamic.loading.ByteArrayClassLoader.SynchronizationStrategy.ForLegacyVm[] $VALUES = null;
            public static final net.bytebuddy.dynamic.loading.ByteArrayClassLoader.SynchronizationStrategy.ForLegacyVm INSTANCE = null;

            static {
                    net.bytebuddy.dynamic.loading.ByteArrayClassLoader$SynchronizationStrategy$ForLegacyVm r0 = new net.bytebuddy.dynamic.loading.ByteArrayClassLoader$SynchronizationStrategy$ForLegacyVm
                    java.lang.String r1 = "INSTANCE"
                    r2 = 0
                    r0.<init>(r1, r2)
                    net.bytebuddy.dynamic.loading.ByteArrayClassLoader.SynchronizationStrategy.ForLegacyVm.INSTANCE = r0
                    net.bytebuddy.dynamic.loading.ByteArrayClassLoader$SynchronizationStrategy$ForLegacyVm[] r0 = new net.bytebuddy.dynamic.loading.ByteArrayClassLoader.SynchronizationStrategy.ForLegacyVm[]{r0}
                    net.bytebuddy.dynamic.loading.ByteArrayClassLoader.SynchronizationStrategy.ForLegacyVm.$VALUES = r0
                    return
            }

            ForLegacyVm(java.lang.String r1, int r2) {
                    r0 = this;
                    r0.<init>(r1, r2)
                    return
            }

            public static net.bytebuddy.dynamic.loading.ByteArrayClassLoader.SynchronizationStrategy.ForLegacyVm valueOf(java.lang.String r1) {
                    java.lang.Class<net.bytebuddy.dynamic.loading.ByteArrayClassLoader$SynchronizationStrategy$ForLegacyVm> r0 = net.bytebuddy.dynamic.loading.ByteArrayClassLoader.SynchronizationStrategy.ForLegacyVm.class
                    java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                    net.bytebuddy.dynamic.loading.ByteArrayClassLoader$SynchronizationStrategy$ForLegacyVm r1 = (net.bytebuddy.dynamic.loading.ByteArrayClassLoader.SynchronizationStrategy.ForLegacyVm) r1
                    return r1
            }

            public static net.bytebuddy.dynamic.loading.ByteArrayClassLoader.SynchronizationStrategy.ForLegacyVm[] values() {
                    net.bytebuddy.dynamic.loading.ByteArrayClassLoader$SynchronizationStrategy$ForLegacyVm[] r0 = net.bytebuddy.dynamic.loading.ByteArrayClassLoader.SynchronizationStrategy.ForLegacyVm.$VALUES
                    java.lang.Object r0 = r0.clone()
                    net.bytebuddy.dynamic.loading.ByteArrayClassLoader$SynchronizationStrategy$ForLegacyVm[] r0 = (net.bytebuddy.dynamic.loading.ByteArrayClassLoader.SynchronizationStrategy.ForLegacyVm[]) r0
                    return r0
            }

            @Override // net.bytebuddy.dynamic.loading.ByteArrayClassLoader.SynchronizationStrategy
            public java.lang.Object getClassLoadingLock(net.bytebuddy.dynamic.loading.ByteArrayClassLoader r1, java.lang.String r2) {
                    r0 = this;
                    return r1
            }

            @Override // net.bytebuddy.dynamic.loading.ByteArrayClassLoader.SynchronizationStrategy.Initializable
            public net.bytebuddy.dynamic.loading.ByteArrayClassLoader.SynchronizationStrategy initialize() {
                    r0 = this;
                    return r0
            }
        }

        public interface Initializable {
            net.bytebuddy.dynamic.loading.ByteArrayClassLoader.SynchronizationStrategy initialize();
        }

        java.lang.Object getClassLoadingLock(net.bytebuddy.dynamic.loading.ByteArrayClassLoader r1, java.lang.String r2);
    }

    static {
            r0 = 0
            r1 = 0
            java.lang.String r2 = "java.security.AccessController"
            java.lang.Class.forName(r2, r1, r0)     // Catch: java.lang.SecurityException -> L16 java.lang.ClassNotFoundException -> L17
            java.lang.String r2 = "net.bytebuddy.securitymanager"
            java.lang.String r3 = "true"
            java.lang.String r2 = java.lang.System.getProperty(r2, r3)     // Catch: java.lang.SecurityException -> L16 java.lang.ClassNotFoundException -> L17
            boolean r2 = java.lang.Boolean.parseBoolean(r2)     // Catch: java.lang.SecurityException -> L16 java.lang.ClassNotFoundException -> L17
            net.bytebuddy.dynamic.loading.ByteArrayClassLoader.ACCESS_CONTROLLER = r2     // Catch: java.lang.SecurityException -> L16 java.lang.ClassNotFoundException -> L17
            goto L19
        L16:
            r1 = 1
        L17:
            net.bytebuddy.dynamic.loading.ByteArrayClassLoader.ACCESS_CONTROLLER = r1
        L19:
            net.bytebuddy.dynamic.loading.ByteArrayClassLoader.NO_URL = r0
            net.bytebuddy.dynamic.loading.ByteArrayClassLoader$PackageLookupStrategy$CreationAction r0 = net.bytebuddy.dynamic.loading.ByteArrayClassLoader.PackageLookupStrategy.CreationAction.INSTANCE
            java.lang.Object r0 = doPrivileged(r0)
            net.bytebuddy.dynamic.loading.ByteArrayClassLoader$PackageLookupStrategy r0 = (net.bytebuddy.dynamic.loading.ByteArrayClassLoader.PackageLookupStrategy) r0
            net.bytebuddy.dynamic.loading.ByteArrayClassLoader.PACKAGE_LOOKUP_STRATEGY = r0
            net.bytebuddy.dynamic.loading.ByteArrayClassLoader$SynchronizationStrategy$CreationAction r0 = net.bytebuddy.dynamic.loading.ByteArrayClassLoader.SynchronizationStrategy.CreationAction.INSTANCE
            java.lang.Object r0 = doPrivileged(r0)
            net.bytebuddy.dynamic.loading.ByteArrayClassLoader$SynchronizationStrategy$Initializable r0 = (net.bytebuddy.dynamic.loading.ByteArrayClassLoader.SynchronizationStrategy.Initializable) r0
            net.bytebuddy.dynamic.loading.ByteArrayClassLoader.SYNCHRONIZATION_STRATEGY = r0
            doRegisterAsParallelCapable()
            return
    }

    public ByteArrayClassLoader(@net.bytebuddy.utility.nullability.MaybeNull java.lang.ClassLoader r2, java.util.Map<java.lang.String, byte[]> r3) {
            r1 = this;
            r0 = 1
            r1.<init>(r2, r0, r3)
            return
    }

    public ByteArrayClassLoader(@net.bytebuddy.utility.nullability.MaybeNull java.lang.ClassLoader r8, java.util.Map<java.lang.String, byte[]> r9, @net.bytebuddy.utility.nullability.MaybeNull java.security.ProtectionDomain r10, net.bytebuddy.dynamic.loading.ByteArrayClassLoader.PersistenceHandler r11, net.bytebuddy.dynamic.loading.PackageDefinitionStrategy r12) {
            r7 = this;
            r2 = 1
            r0 = r7
            r1 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
    }

    public ByteArrayClassLoader(@net.bytebuddy.utility.nullability.MaybeNull java.lang.ClassLoader r9, java.util.Map<java.lang.String, byte[]> r10, @net.bytebuddy.utility.nullability.MaybeNull java.security.ProtectionDomain r11, net.bytebuddy.dynamic.loading.ByteArrayClassLoader.PersistenceHandler r12, net.bytebuddy.dynamic.loading.PackageDefinitionStrategy r13, net.bytebuddy.dynamic.loading.ClassFilePostProcessor r14) {
            r8 = this;
            r2 = 1
            r0 = r8
            r1 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public ByteArrayClassLoader(@net.bytebuddy.utility.nullability.MaybeNull java.lang.ClassLoader r2, java.util.Map<java.lang.String, byte[]> r3, net.bytebuddy.dynamic.loading.ByteArrayClassLoader.PersistenceHandler r4) {
            r1 = this;
            r0 = 1
            r1.<init>(r2, r0, r3, r4)
            return
    }

    public ByteArrayClassLoader(@net.bytebuddy.utility.nullability.MaybeNull java.lang.ClassLoader r2, boolean r3, java.util.Map<java.lang.String, byte[]> r4) {
            r1 = this;
            net.bytebuddy.dynamic.loading.ByteArrayClassLoader$PersistenceHandler r0 = net.bytebuddy.dynamic.loading.ByteArrayClassLoader.PersistenceHandler.LATENT
            r1.<init>(r2, r3, r4, r0)
            return
    }

    public ByteArrayClassLoader(@net.bytebuddy.utility.nullability.MaybeNull java.lang.ClassLoader r9, boolean r10, java.util.Map<java.lang.String, byte[]> r11, @net.bytebuddy.utility.nullability.MaybeNull java.security.ProtectionDomain r12, net.bytebuddy.dynamic.loading.ByteArrayClassLoader.PersistenceHandler r13, net.bytebuddy.dynamic.loading.PackageDefinitionStrategy r14) {
            r8 = this;
            net.bytebuddy.dynamic.loading.ClassFilePostProcessor$NoOp r7 = net.bytebuddy.dynamic.loading.ClassFilePostProcessor.NoOp.INSTANCE
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public ByteArrayClassLoader(@net.bytebuddy.utility.nullability.MaybeNull java.lang.ClassLoader r1, boolean r2, java.util.Map<java.lang.String, byte[]> r3, @net.bytebuddy.utility.nullability.MaybeNull java.security.ProtectionDomain r4, net.bytebuddy.dynamic.loading.ByteArrayClassLoader.PersistenceHandler r5, net.bytebuddy.dynamic.loading.PackageDefinitionStrategy r6, net.bytebuddy.dynamic.loading.ClassFilePostProcessor r7) {
            r0 = this;
            r0.<init>(r1, r2)
            java.util.concurrent.ConcurrentHashMap r1 = new java.util.concurrent.ConcurrentHashMap
            r1.<init>(r3)
            r0.typeDefinitions = r1
            r0.protectionDomain = r4
            r0.persistenceHandler = r5
            r0.packageDefinitionStrategy = r6
            r0.classFilePostProcessor = r7
            java.lang.Object r1 = getContext()
            r0.accessControlContext = r1
            return
    }

    public ByteArrayClassLoader(@net.bytebuddy.utility.nullability.MaybeNull java.lang.ClassLoader r8, boolean r9, java.util.Map<java.lang.String, byte[]> r10, net.bytebuddy.dynamic.loading.ByteArrayClassLoader.PersistenceHandler r11) {
            r7 = this;
            java.security.ProtectionDomain r4 = net.bytebuddy.dynamic.loading.ClassLoadingStrategy.NO_PROTECTION_DOMAIN
            net.bytebuddy.dynamic.loading.PackageDefinitionStrategy$Trivial r6 = net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.Trivial.INSTANCE
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r5 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
    }

    public static /* synthetic */ java.lang.Object access$000() throws java.lang.Exception {
            java.lang.Object r0 = methodHandle()
            return r0
    }

    public static /* synthetic */ net.bytebuddy.dynamic.loading.ByteArrayClassLoader.PackageLookupStrategy access$100() {
            net.bytebuddy.dynamic.loading.ByteArrayClassLoader$PackageLookupStrategy r0 = net.bytebuddy.dynamic.loading.ByteArrayClassLoader.PACKAGE_LOOKUP_STRATEGY
            return r0
    }

    public static /* synthetic */ java.lang.Package access$200(net.bytebuddy.dynamic.loading.ByteArrayClassLoader r0, java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, java.net.URL r8) throws java.lang.IllegalArgumentException {
            java.lang.Package r0 = r0.definePackage(r1, r2, r3, r4, r5, r6, r7, r8)
            return r0
    }

    public static /* synthetic */ java.lang.Class access$300(net.bytebuddy.dynamic.loading.ByteArrayClassLoader r0, java.lang.String r1, byte[] r2, int r3, int r4, java.security.ProtectionDomain r5) throws java.lang.ClassFormatError {
            java.lang.Class r0 = r0.defineClass(r1, r2, r3, r4, r5)
            return r0
    }

    public static /* synthetic */ java.lang.Package access$400(net.bytebuddy.dynamic.loading.ByteArrayClassLoader r0, java.lang.String r1) {
            java.lang.Package r0 = r0.doGetPackage(r1)
            return r0
    }

    public static /* synthetic */ java.net.URL access$600() {
            java.net.URL r0 = net.bytebuddy.dynamic.loading.ByteArrayClassLoader.NO_URL
            return r0
    }

    public static /* synthetic */ java.lang.Object access$700(java.security.PrivilegedAction r0) {
            java.lang.Object r0 = doPrivileged(r0)
            return r0
    }

    @net.bytebuddy.utility.nullability.MaybeNull
    private java.lang.Package doGetPackage(java.lang.String r1) {
            r0 = this;
            java.lang.Package r1 = r0.getPackage(r1)
            return r1
    }

    @net.bytebuddy.build.AccessControllerPlugin.Enhance
    private static <T> T doPrivileged(java.security.PrivilegedAction<T> r1) {
            boolean r0 = net.bytebuddy.dynamic.loading.ByteArrayClassLoader.ACCESS_CONTROLLER
            if (r0 == 0) goto L9
            java.lang.Object r1 = java.security.AccessController.doPrivileged(r1)
            return r1
        L9:
            java.lang.Object r1 = r1.run()
            return r1
    }

    @net.bytebuddy.build.AccessControllerPlugin.Enhance
    private static <T> T doPrivileged(java.security.PrivilegedAction<T> r1, @net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r2) {
            boolean r0 = net.bytebuddy.dynamic.loading.ByteArrayClassLoader.ACCESS_CONTROLLER
            if (r0 == 0) goto Lb
            java.security.AccessControlContext r2 = (java.security.AccessControlContext) r2
            java.lang.Object r1 = java.security.AccessController.doPrivileged(r1, r2)
            return r1
        Lb:
            java.lang.Object r1 = r1.run()
            return r1
    }

    @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "Must be invoked from targeting class loader type.", value = {"DP_DO_INSIDE_DO_PRIVILEGED"})
    private static void doRegisterAsParallelCapable() {
            java.lang.Class<java.lang.ClassLoader> r0 = java.lang.ClassLoader.class
            java.lang.String r1 = "registerAsParallelCapable"
            r2 = 0
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r2)     // Catch: java.lang.Throwable -> L10
            r1 = 1
            r0.setAccessible(r1)     // Catch: java.lang.Throwable -> L10
            r0.invoke(r2, r2)     // Catch: java.lang.Throwable -> L10
        L10:
            return
    }

    @net.bytebuddy.utility.nullability.MaybeNull
    @net.bytebuddy.build.AccessControllerPlugin.Enhance
    private static java.lang.Object getContext() {
            boolean r0 = net.bytebuddy.dynamic.loading.ByteArrayClassLoader.ACCESS_CONTROLLER
            if (r0 == 0) goto L9
            java.security.AccessControlContext r0 = java.security.AccessController.getContext()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public static java.util.Map<net.bytebuddy.description.type.TypeDescription, java.lang.Class<?>> load(@net.bytebuddy.utility.nullability.MaybeNull java.lang.ClassLoader r7, java.util.Map<net.bytebuddy.description.type.TypeDescription, byte[]> r8) {
            java.security.ProtectionDomain r2 = net.bytebuddy.dynamic.loading.ClassLoadingStrategy.NO_PROTECTION_DOMAIN
            net.bytebuddy.dynamic.loading.ByteArrayClassLoader$PersistenceHandler r3 = net.bytebuddy.dynamic.loading.ByteArrayClassLoader.PersistenceHandler.LATENT
            net.bytebuddy.dynamic.loading.PackageDefinitionStrategy$Trivial r4 = net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.Trivial.INSTANCE
            r5 = 0
            r6 = 1
            r0 = r7
            r1 = r8
            java.util.Map r7 = load(r0, r1, r2, r3, r4, r5, r6)
            return r7
    }

    @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "Assuring privilege is explicit user responsibility.", value = {"DP_CREATE_CLASSLOADER_INSIDE_DO_PRIVILEGED"})
    public static java.util.Map<net.bytebuddy.description.type.TypeDescription, java.lang.Class<?>> load(@net.bytebuddy.utility.nullability.MaybeNull java.lang.ClassLoader r9, java.util.Map<net.bytebuddy.description.type.TypeDescription, byte[]> r10, @net.bytebuddy.utility.nullability.MaybeNull java.security.ProtectionDomain r11, net.bytebuddy.dynamic.loading.ByteArrayClassLoader.PersistenceHandler r12, net.bytebuddy.dynamic.loading.PackageDefinitionStrategy r13, boolean r14, boolean r15) {
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            java.util.Set r0 = r10.entrySet()
            java.util.Iterator r0 = r0.iterator()
        Ld:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2b
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            net.bytebuddy.description.type.TypeDescription r2 = (net.bytebuddy.description.type.TypeDescription) r2
            java.lang.String r2 = r2.getName()
            java.lang.Object r1 = r1.getValue()
            r3.put(r2, r1)
            goto Ld
        L2b:
            net.bytebuddy.dynamic.loading.ByteArrayClassLoader r8 = new net.bytebuddy.dynamic.loading.ByteArrayClassLoader
            net.bytebuddy.dynamic.loading.ClassFilePostProcessor$NoOp r7 = net.bytebuddy.dynamic.loading.ClassFilePostProcessor.NoOp.INSTANCE
            r0 = r8
            r1 = r9
            r2 = r15
            r4 = r11
            r5 = r12
            r6 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            java.util.LinkedHashMap r9 = new java.util.LinkedHashMap
            r9.<init>()
            java.util.Set r10 = r10.keySet()
            java.util.Iterator r10 = r10.iterator()
        L45:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto La1
            java.lang.Object r11 = r10.next()
            net.bytebuddy.description.type.TypeDescription r11 = (net.bytebuddy.description.type.TypeDescription) r11
            java.lang.String r12 = r11.getName()     // Catch: java.lang.ClassNotFoundException -> L84
            r13 = 0
            java.lang.Class r12 = java.lang.Class.forName(r12, r13, r8)     // Catch: java.lang.ClassNotFoundException -> L84
            net.bytebuddy.utility.GraalImageCode r13 = net.bytebuddy.utility.GraalImageCode.getCurrent()     // Catch: java.lang.ClassNotFoundException -> L84
            boolean r13 = r13.isNativeImageExecution()     // Catch: java.lang.ClassNotFoundException -> L84
            if (r13 != 0) goto L86
            if (r14 == 0) goto L86
            java.lang.ClassLoader r13 = r12.getClassLoader()     // Catch: java.lang.ClassNotFoundException -> L84
            if (r13 != r8) goto L6d
            goto L86
        L6d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.ClassNotFoundException -> L84
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.ClassNotFoundException -> L84
            r10.<init>()     // Catch: java.lang.ClassNotFoundException -> L84
            java.lang.String r13 = "Class already loaded: "
            r10.append(r13)     // Catch: java.lang.ClassNotFoundException -> L84
            r10.append(r12)     // Catch: java.lang.ClassNotFoundException -> L84
            java.lang.String r10 = r10.toString()     // Catch: java.lang.ClassNotFoundException -> L84
            r9.<init>(r10)     // Catch: java.lang.ClassNotFoundException -> L84
            throw r9     // Catch: java.lang.ClassNotFoundException -> L84
        L84:
            r9 = move-exception
            goto L8a
        L86:
            r9.put(r11, r12)     // Catch: java.lang.ClassNotFoundException -> L84
            goto L45
        L8a:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "Cannot load class "
            r12.append(r13)
            r12.append(r11)
            java.lang.String r11 = r12.toString()
            r10.<init>(r11, r9)
            throw r10
        La1:
            return r9
    }

    private static java.lang.Object methodHandle() throws java.lang.Exception {
            java.lang.String r0 = "java.lang.invoke.MethodHandles"
            java.lang.Class r0 = java.lang.Class.forName(r0)
            java.lang.String r1 = "lookup"
            r2 = 0
            java.lang.reflect.Method r0 = r0.getMethod(r1, r2)
            java.lang.Object r0 = r0.invoke(r2, r2)
            return r0
    }

    @Override // net.bytebuddy.dynamic.loading.InjectionClassLoader
    public java.util.Map<java.lang.String, java.lang.Class<?>> doDefineClasses(java.util.Map<java.lang.String, byte[]> r7) throws java.lang.ClassNotFoundException {
            r6 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.Set r1 = r7.entrySet()
            java.util.Iterator r1 = r1.iterator()
        Ld:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L2f
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.util.concurrent.ConcurrentMap<java.lang.String, byte[]> r4 = r6.typeDefinitions
            java.lang.Object r5 = r2.getKey()
            java.lang.Object r2 = r2.getValue()
            java.lang.Object r2 = r4.putIfAbsent(r5, r2)
            r0.put(r3, r2)
            goto Ld
        L2f:
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap     // Catch: java.lang.Throwable -> L5f
            r1.<init>()     // Catch: java.lang.Throwable -> L5f
            java.util.Set r7 = r7.keySet()     // Catch: java.lang.Throwable -> L5f
            java.util.Iterator r7 = r7.iterator()     // Catch: java.lang.Throwable -> L5f
        L3c:
            boolean r2 = r7.hasNext()     // Catch: java.lang.Throwable -> L5f
            if (r2 == 0) goto L61
            java.lang.Object r2 = r7.next()     // Catch: java.lang.Throwable -> L5f
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L5f
            net.bytebuddy.dynamic.loading.ByteArrayClassLoader$SynchronizationStrategy$Initializable r3 = net.bytebuddy.dynamic.loading.ByteArrayClassLoader.SYNCHRONIZATION_STRATEGY     // Catch: java.lang.Throwable -> L5f
            net.bytebuddy.dynamic.loading.ByteArrayClassLoader$SynchronizationStrategy r3 = r3.initialize()     // Catch: java.lang.Throwable -> L5f
            java.lang.Object r3 = r3.getClassLoadingLock(r6, r2)     // Catch: java.lang.Throwable -> L5f
            monitor-enter(r3)     // Catch: java.lang.Throwable -> L5f
            java.lang.Class r4 = r6.loadClass(r2)     // Catch: java.lang.Throwable -> L5c
            r1.put(r2, r4)     // Catch: java.lang.Throwable -> L5c
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L5c
            goto L3c
        L5c:
            r7 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L5c
            throw r7     // Catch: java.lang.Throwable -> L5f
        L5f:
            r7 = move-exception
            goto L98
        L61:
            java.util.Set r7 = r0.entrySet()
            java.util.Iterator r7 = r7.iterator()
        L69:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L97
            java.lang.Object r0 = r7.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r2 = r0.getValue()
            if (r2 != 0) goto L89
            net.bytebuddy.dynamic.loading.ByteArrayClassLoader$PersistenceHandler r2 = r6.persistenceHandler
            java.lang.Object r0 = r0.getKey()
            java.lang.String r0 = (java.lang.String) r0
            java.util.concurrent.ConcurrentMap<java.lang.String, byte[]> r3 = r6.typeDefinitions
            r2.release(r0, r3)
            goto L69
        L89:
            java.util.concurrent.ConcurrentMap<java.lang.String, byte[]> r2 = r6.typeDefinitions
            java.lang.Object r3 = r0.getKey()
            java.lang.Object r0 = r0.getValue()
            r2.put(r3, r0)
            goto L69
        L97:
            return r1
        L98:
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        La0:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Lce
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getValue()
            if (r2 != 0) goto Lc0
            net.bytebuddy.dynamic.loading.ByteArrayClassLoader$PersistenceHandler r2 = r6.persistenceHandler
            java.lang.Object r1 = r1.getKey()
            java.lang.String r1 = (java.lang.String) r1
            java.util.concurrent.ConcurrentMap<java.lang.String, byte[]> r3 = r6.typeDefinitions
            r2.release(r1, r3)
            goto La0
        Lc0:
            java.util.concurrent.ConcurrentMap<java.lang.String, byte[]> r2 = r6.typeDefinitions
            java.lang.Object r3 = r1.getKey()
            java.lang.Object r1 = r1.getValue()
            r2.put(r3, r1)
            goto La0
        Lce:
            throw r7
    }

    @Override // java.lang.ClassLoader
    public java.lang.Class<?> findClass(java.lang.String r5) throws java.lang.ClassNotFoundException {
            r4 = this;
            net.bytebuddy.dynamic.loading.ByteArrayClassLoader$PersistenceHandler r0 = r4.persistenceHandler
            java.util.concurrent.ConcurrentMap<java.lang.String, byte[]> r1 = r4.typeDefinitions
            byte[] r0 = r0.lookup(r5, r1)
            if (r0 == 0) goto L20
            net.bytebuddy.dynamic.loading.ByteArrayClassLoader$ClassDefinitionAction r1 = new net.bytebuddy.dynamic.loading.ByteArrayClassLoader$ClassDefinitionAction
            net.bytebuddy.dynamic.loading.ClassFilePostProcessor r2 = r4.classFilePostProcessor
            java.security.ProtectionDomain r3 = r4.protectionDomain
            byte[] r0 = r2.transform(r4, r5, r3, r0)
            r1.<init>(r4, r5, r0)
            java.lang.Object r5 = r4.accessControlContext
            java.lang.Object r5 = doPrivileged(r1, r5)
            java.lang.Class r5 = (java.lang.Class) r5
            return r5
        L20:
            java.lang.ClassNotFoundException r0 = new java.lang.ClassNotFoundException
            r0.<init>(r5)
            throw r0
    }

    @Override // java.lang.ClassLoader
    @net.bytebuddy.utility.nullability.MaybeNull
    public java.net.URL findResource(java.lang.String r3) {
            r2 = this;
            net.bytebuddy.dynamic.loading.ByteArrayClassLoader$PersistenceHandler r0 = r2.persistenceHandler
            java.util.concurrent.ConcurrentMap<java.lang.String, byte[]> r1 = r2.typeDefinitions
            java.net.URL r3 = r0.url(r3, r1)
            return r3
    }

    @Override // java.lang.ClassLoader
    public java.util.Enumeration<java.net.URL> findResources(java.lang.String r3) {
            r2 = this;
            net.bytebuddy.dynamic.loading.ByteArrayClassLoader$PersistenceHandler r0 = r2.persistenceHandler
            java.util.concurrent.ConcurrentMap<java.lang.String, byte[]> r1 = r2.typeDefinitions
            java.net.URL r3 = r0.url(r3, r1)
            if (r3 != 0) goto Ld
            net.bytebuddy.dynamic.loading.ByteArrayClassLoader$EmptyEnumeration r3 = net.bytebuddy.dynamic.loading.ByteArrayClassLoader.EmptyEnumeration.INSTANCE
            goto L13
        Ld:
            net.bytebuddy.dynamic.loading.ByteArrayClassLoader$SingletonEnumeration r0 = new net.bytebuddy.dynamic.loading.ByteArrayClassLoader$SingletonEnumeration
            r0.<init>(r3)
            r3 = r0
        L13:
            return r3
    }
}
