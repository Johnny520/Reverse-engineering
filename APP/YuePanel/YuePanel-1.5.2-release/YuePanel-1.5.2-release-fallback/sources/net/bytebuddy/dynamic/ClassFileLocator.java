package net.bytebuddy.dynamic;

/* JADX INFO: loaded from: classes2.dex */
public interface ClassFileLocator extends java.io.Closeable {
    public static final java.lang.String CLASS_FILE_EXTENSION = ".class";

    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
    public static class Compound implements net.bytebuddy.dynamic.ClassFileLocator, java.io.Closeable {
        private final java.util.List<net.bytebuddy.dynamic.ClassFileLocator> classFileLocators;

        public Compound(java.util.List<? extends net.bytebuddy.dynamic.ClassFileLocator> r3) {
                r2 = this;
                r2.<init>()
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r2.classFileLocators = r0
                java.util.Iterator r3 = r3.iterator()
            Le:
                boolean r0 = r3.hasNext()
                if (r0 == 0) goto L32
                java.lang.Object r0 = r3.next()
                net.bytebuddy.dynamic.ClassFileLocator r0 = (net.bytebuddy.dynamic.ClassFileLocator) r0
                boolean r1 = r0 instanceof net.bytebuddy.dynamic.ClassFileLocator.Compound
                if (r1 == 0) goto L28
                java.util.List<net.bytebuddy.dynamic.ClassFileLocator> r1 = r2.classFileLocators
                net.bytebuddy.dynamic.ClassFileLocator$Compound r0 = (net.bytebuddy.dynamic.ClassFileLocator.Compound) r0
                java.util.List<net.bytebuddy.dynamic.ClassFileLocator> r0 = r0.classFileLocators
                r1.addAll(r0)
                goto Le
            L28:
                boolean r1 = r0 instanceof net.bytebuddy.dynamic.ClassFileLocator.NoOp
                if (r1 != 0) goto Le
                java.util.List<net.bytebuddy.dynamic.ClassFileLocator> r1 = r2.classFileLocators
                r1.add(r0)
                goto Le
            L32:
                return
        }

        public Compound(net.bytebuddy.dynamic.ClassFileLocator... r1) {
                r0 = this;
                java.util.List r1 = java.util.Arrays.asList(r1)
                r0.<init>(r1)
                return
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws java.io.IOException {
                r2 = this;
                java.util.List<net.bytebuddy.dynamic.ClassFileLocator> r0 = r2.classFileLocators
                java.util.Iterator r0 = r0.iterator()
            L6:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L16
                java.lang.Object r1 = r0.next()
                net.bytebuddy.dynamic.ClassFileLocator r1 = (net.bytebuddy.dynamic.ClassFileLocator) r1
                r1.close()
                goto L6
            L16:
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
                java.util.List<net.bytebuddy.dynamic.ClassFileLocator> r2 = r4.classFileLocators
                net.bytebuddy.dynamic.ClassFileLocator$Compound r5 = (net.bytebuddy.dynamic.ClassFileLocator.Compound) r5
                java.util.List<net.bytebuddy.dynamic.ClassFileLocator> r5 = r5.classFileLocators
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
                java.util.List<net.bytebuddy.dynamic.ClassFileLocator> r1 = r2.classFileLocators
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                return r0
        }

        @Override // net.bytebuddy.dynamic.ClassFileLocator
        public net.bytebuddy.dynamic.ClassFileLocator.Resolution locate(java.lang.String r4) throws java.io.IOException {
                r3 = this;
                java.util.List<net.bytebuddy.dynamic.ClassFileLocator> r0 = r3.classFileLocators
                java.util.Iterator r0 = r0.iterator()
            L6:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L1d
                java.lang.Object r1 = r0.next()
                net.bytebuddy.dynamic.ClassFileLocator r1 = (net.bytebuddy.dynamic.ClassFileLocator) r1
                net.bytebuddy.dynamic.ClassFileLocator$Resolution r1 = r1.locate(r4)
                boolean r2 = r1.isResolved()
                if (r2 == 0) goto L6
                return r1
            L1d:
                net.bytebuddy.dynamic.ClassFileLocator$Resolution$Illegal r0 = new net.bytebuddy.dynamic.ClassFileLocator$Resolution$Illegal
                r0.<init>(r4)
                return r0
        }
    }

    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
    public static class Filtering implements net.bytebuddy.dynamic.ClassFileLocator {
        private final net.bytebuddy.dynamic.ClassFileLocator delegate;
        private final net.bytebuddy.matcher.ElementMatcher<? super java.lang.String> matcher;

        public Filtering(net.bytebuddy.matcher.ElementMatcher<? super java.lang.String> r1, net.bytebuddy.dynamic.ClassFileLocator r2) {
                r0 = this;
                r0.<init>()
                r0.matcher = r1
                r0.delegate = r2
                return
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws java.io.IOException {
                r1 = this;
                net.bytebuddy.dynamic.ClassFileLocator r0 = r1.delegate
                r0.close()
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
                net.bytebuddy.matcher.ElementMatcher<? super java.lang.String> r2 = r4.matcher
                net.bytebuddy.dynamic.ClassFileLocator$Filtering r5 = (net.bytebuddy.dynamic.ClassFileLocator.Filtering) r5
                net.bytebuddy.matcher.ElementMatcher<? super java.lang.String> r3 = r5.matcher
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L20
                return r1
            L20:
                net.bytebuddy.dynamic.ClassFileLocator r2 = r4.delegate
                net.bytebuddy.dynamic.ClassFileLocator r5 = r5.delegate
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
                net.bytebuddy.matcher.ElementMatcher<? super java.lang.String> r1 = r2.matcher
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                int r0 = r0 * 31
                net.bytebuddy.dynamic.ClassFileLocator r1 = r2.delegate
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                return r0
        }

        @Override // net.bytebuddy.dynamic.ClassFileLocator
        public net.bytebuddy.dynamic.ClassFileLocator.Resolution locate(java.lang.String r2) throws java.io.IOException {
                r1 = this;
                net.bytebuddy.matcher.ElementMatcher<? super java.lang.String> r0 = r1.matcher
                boolean r0 = r0.matches(r2)
                if (r0 == 0) goto Lf
                net.bytebuddy.dynamic.ClassFileLocator r0 = r1.delegate
                net.bytebuddy.dynamic.ClassFileLocator$Resolution r2 = r0.locate(r2)
                goto L15
            Lf:
                net.bytebuddy.dynamic.ClassFileLocator$Resolution$Illegal r0 = new net.bytebuddy.dynamic.ClassFileLocator$Resolution$Illegal
                r0.<init>(r2)
                r2 = r0
            L15:
                return r2
        }
    }

    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
    public static class ForClassLoader implements net.bytebuddy.dynamic.ClassFileLocator {
        private static final boolean ACCESS_CONTROLLER = false;
        private static final java.lang.ClassLoader BOOT_LOADER_PROXY = null;
        private final java.lang.ClassLoader classLoader;

        public enum BootLoaderProxyCreationAction extends java.lang.Enum<net.bytebuddy.dynamic.ClassFileLocator.ForClassLoader.BootLoaderProxyCreationAction> implements java.security.PrivilegedAction<java.lang.ClassLoader> {
            private static final /* synthetic */ net.bytebuddy.dynamic.ClassFileLocator.ForClassLoader.BootLoaderProxyCreationAction[] $VALUES = null;
            public static final net.bytebuddy.dynamic.ClassFileLocator.ForClassLoader.BootLoaderProxyCreationAction INSTANCE = null;

            static {
                    net.bytebuddy.dynamic.ClassFileLocator$ForClassLoader$BootLoaderProxyCreationAction r0 = new net.bytebuddy.dynamic.ClassFileLocator$ForClassLoader$BootLoaderProxyCreationAction
                    java.lang.String r1 = "INSTANCE"
                    r2 = 0
                    r0.<init>(r1, r2)
                    net.bytebuddy.dynamic.ClassFileLocator.ForClassLoader.BootLoaderProxyCreationAction.INSTANCE = r0
                    net.bytebuddy.dynamic.ClassFileLocator$ForClassLoader$BootLoaderProxyCreationAction[] r0 = new net.bytebuddy.dynamic.ClassFileLocator.ForClassLoader.BootLoaderProxyCreationAction[]{r0}
                    net.bytebuddy.dynamic.ClassFileLocator.ForClassLoader.BootLoaderProxyCreationAction.$VALUES = r0
                    return
            }

            BootLoaderProxyCreationAction(java.lang.String r1, int r2) {
                    r0 = this;
                    r0.<init>(r1, r2)
                    return
            }

            public static net.bytebuddy.dynamic.ClassFileLocator.ForClassLoader.BootLoaderProxyCreationAction valueOf(java.lang.String r1) {
                    java.lang.Class<net.bytebuddy.dynamic.ClassFileLocator$ForClassLoader$BootLoaderProxyCreationAction> r0 = net.bytebuddy.dynamic.ClassFileLocator.ForClassLoader.BootLoaderProxyCreationAction.class
                    java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                    net.bytebuddy.dynamic.ClassFileLocator$ForClassLoader$BootLoaderProxyCreationAction r1 = (net.bytebuddy.dynamic.ClassFileLocator.ForClassLoader.BootLoaderProxyCreationAction) r1
                    return r1
            }

            public static net.bytebuddy.dynamic.ClassFileLocator.ForClassLoader.BootLoaderProxyCreationAction[] values() {
                    net.bytebuddy.dynamic.ClassFileLocator$ForClassLoader$BootLoaderProxyCreationAction[] r0 = net.bytebuddy.dynamic.ClassFileLocator.ForClassLoader.BootLoaderProxyCreationAction.$VALUES
                    java.lang.Object r0 = r0.clone()
                    net.bytebuddy.dynamic.ClassFileLocator$ForClassLoader$BootLoaderProxyCreationAction[] r0 = (net.bytebuddy.dynamic.ClassFileLocator.ForClassLoader.BootLoaderProxyCreationAction[]) r0
                    return r0
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.security.PrivilegedAction
            public java.lang.ClassLoader run() {
                    r3 = this;
                    java.net.URLClassLoader r0 = new java.net.URLClassLoader
                    r1 = 0
                    java.net.URL[] r1 = new java.net.URL[r1]
                    java.lang.ClassLoader r2 = net.bytebuddy.dynamic.loading.ClassLoadingStrategy.BOOTSTRAP_LOADER
                    r0.<init>(r1, r2)
                    return r0
            }

            @Override // java.security.PrivilegedAction
            public /* bridge */ /* synthetic */ java.lang.ClassLoader run() {
                    r1 = this;
                    java.lang.ClassLoader r0 = r1.run()
                    return r0
            }
        }

        public static class WeaklyReferenced extends java.lang.ref.WeakReference<java.lang.ClassLoader> implements net.bytebuddy.dynamic.ClassFileLocator {
            private final int hashCode;

            public WeaklyReferenced(java.lang.ClassLoader r1) {
                    r0 = this;
                    r0.<init>(r1)
                    int r1 = java.lang.System.identityHashCode(r1)
                    r0.hashCode = r1
                    return
            }

            public static net.bytebuddy.dynamic.ClassFileLocator of(@net.bytebuddy.utility.nullability.MaybeNull java.lang.ClassLoader r1) {
                    if (r1 == 0) goto L19
                    java.lang.ClassLoader r0 = java.lang.ClassLoader.getSystemClassLoader()
                    if (r1 == r0) goto L19
                    java.lang.ClassLoader r0 = java.lang.ClassLoader.getSystemClassLoader()
                    java.lang.ClassLoader r0 = r0.getParent()
                    if (r1 != r0) goto L13
                    goto L19
                L13:
                    net.bytebuddy.dynamic.ClassFileLocator$ForClassLoader$WeaklyReferenced r0 = new net.bytebuddy.dynamic.ClassFileLocator$ForClassLoader$WeaklyReferenced
                    r0.<init>(r1)
                    goto L1d
                L19:
                    net.bytebuddy.dynamic.ClassFileLocator r0 = net.bytebuddy.dynamic.ClassFileLocator.ForClassLoader.of(r1)
                L1d:
                    return r0
            }

            @Override // java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                    r0 = this;
                    return
            }

            public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r5) {
                    r4 = this;
                    r0 = 1
                    if (r4 != r5) goto L4
                    return r0
                L4:
                    r1 = 0
                    if (r5 == 0) goto L25
                    java.lang.Class r2 = r4.getClass()
                    java.lang.Class r3 = r5.getClass()
                    if (r2 == r3) goto L12
                    goto L25
                L12:
                    net.bytebuddy.dynamic.ClassFileLocator$ForClassLoader$WeaklyReferenced r5 = (net.bytebuddy.dynamic.ClassFileLocator.ForClassLoader.WeaklyReferenced) r5
                    java.lang.Object r5 = r5.get()
                    java.lang.ClassLoader r5 = (java.lang.ClassLoader) r5
                    if (r5 == 0) goto L23
                    java.lang.Object r2 = r4.get()
                    if (r2 != r5) goto L23
                    goto L24
                L23:
                    r0 = r1
                L24:
                    return r0
                L25:
                    return r1
            }

            public int hashCode() {
                    r1 = this;
                    int r0 = r1.hashCode
                    return r0
            }

            @Override // net.bytebuddy.dynamic.ClassFileLocator
            public net.bytebuddy.dynamic.ClassFileLocator.Resolution locate(java.lang.String r2) throws java.io.IOException {
                    r1 = this;
                    java.lang.Object r0 = r1.get()
                    java.lang.ClassLoader r0 = (java.lang.ClassLoader) r0
                    if (r0 != 0) goto Le
                    net.bytebuddy.dynamic.ClassFileLocator$Resolution$Illegal r0 = new net.bytebuddy.dynamic.ClassFileLocator$Resolution$Illegal
                    r0.<init>(r2)
                    goto L12
                Le:
                    net.bytebuddy.dynamic.ClassFileLocator$Resolution r0 = net.bytebuddy.dynamic.ClassFileLocator.ForClassLoader.locate(r0, r2)
                L12:
                    return r0
            }
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
                net.bytebuddy.dynamic.ClassFileLocator.ForClassLoader.ACCESS_CONTROLLER = r1     // Catch: java.lang.SecurityException -> L16 java.lang.ClassNotFoundException -> L17
                goto L19
            L16:
                r0 = 1
            L17:
                net.bytebuddy.dynamic.ClassFileLocator.ForClassLoader.ACCESS_CONTROLLER = r0
            L19:
                net.bytebuddy.dynamic.ClassFileLocator$ForClassLoader$BootLoaderProxyCreationAction r0 = net.bytebuddy.dynamic.ClassFileLocator.ForClassLoader.BootLoaderProxyCreationAction.INSTANCE
                java.lang.Object r0 = doPrivileged(r0)
                java.lang.ClassLoader r0 = (java.lang.ClassLoader) r0
                net.bytebuddy.dynamic.ClassFileLocator.ForClassLoader.BOOT_LOADER_PROXY = r0
                return
        }

        public ForClassLoader(java.lang.ClassLoader r1) {
                r0 = this;
                r0.<init>()
                r0.classLoader = r1
                return
        }

        @net.bytebuddy.build.AccessControllerPlugin.Enhance
        private static <T> T doPrivileged(java.security.PrivilegedAction<T> r1) {
                boolean r0 = net.bytebuddy.dynamic.ClassFileLocator.ForClassLoader.ACCESS_CONTROLLER
                if (r0 == 0) goto L9
                java.lang.Object r1 = java.security.AccessController.doPrivileged(r1)
                return r1
            L9:
                java.lang.Object r1 = r1.run()
                return r1
        }

        public static net.bytebuddy.dynamic.ClassFileLocator.Resolution locate(java.lang.ClassLoader r3, java.lang.String r4) throws java.io.IOException {
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r1 = 46
                r2 = 47
                java.lang.String r1 = r4.replace(r1, r2)
                r0.append(r1)
                java.lang.String r1 = ".class"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                java.io.InputStream r3 = r3.getResourceAsStream(r0)
                if (r3 == 0) goto L33
                net.bytebuddy.dynamic.ClassFileLocator$Resolution$Explicit r4 = new net.bytebuddy.dynamic.ClassFileLocator$Resolution$Explicit     // Catch: java.lang.Throwable -> L2e
                net.bytebuddy.utility.StreamDrainer r0 = net.bytebuddy.utility.StreamDrainer.DEFAULT     // Catch: java.lang.Throwable -> L2e
                byte[] r0 = r0.drain(r3)     // Catch: java.lang.Throwable -> L2e
                r4.<init>(r0)     // Catch: java.lang.Throwable -> L2e
                r3.close()
                return r4
            L2e:
                r4 = move-exception
                r3.close()
                throw r4
            L33:
                net.bytebuddy.dynamic.ClassFileLocator$Resolution$Illegal r3 = new net.bytebuddy.dynamic.ClassFileLocator$Resolution$Illegal
                r3.<init>(r4)
                return r3
        }

        public static net.bytebuddy.dynamic.ClassFileLocator of(@net.bytebuddy.utility.nullability.MaybeNull java.lang.ClassLoader r1) {
                net.bytebuddy.dynamic.ClassFileLocator$ForClassLoader r0 = new net.bytebuddy.dynamic.ClassFileLocator$ForClassLoader
                if (r1 != 0) goto L6
                java.lang.ClassLoader r1 = net.bytebuddy.dynamic.ClassFileLocator.ForClassLoader.BOOT_LOADER_PROXY
            L6:
                r0.<init>(r1)
                return r0
        }

        public static net.bytebuddy.dynamic.ClassFileLocator ofBootLoader() {
                net.bytebuddy.dynamic.ClassFileLocator$ForClassLoader r0 = new net.bytebuddy.dynamic.ClassFileLocator$ForClassLoader
                java.lang.ClassLoader r1 = net.bytebuddy.dynamic.ClassFileLocator.ForClassLoader.BOOT_LOADER_PROXY
                r0.<init>(r1)
                return r0
        }

        public static net.bytebuddy.dynamic.ClassFileLocator ofPlatformLoader() {
                java.lang.ClassLoader r0 = java.lang.ClassLoader.getSystemClassLoader()
                java.lang.ClassLoader r0 = r0.getParent()
                net.bytebuddy.dynamic.ClassFileLocator r0 = of(r0)
                return r0
        }

        public static net.bytebuddy.dynamic.ClassFileLocator ofSystemLoader() {
                net.bytebuddy.dynamic.ClassFileLocator$ForClassLoader r0 = new net.bytebuddy.dynamic.ClassFileLocator$ForClassLoader
                java.lang.ClassLoader r1 = java.lang.ClassLoader.getSystemClassLoader()
                r0.<init>(r1)
                return r0
        }

        public static java.util.Map<java.lang.Class<?>, byte[]> read(java.util.Collection<? extends java.lang.Class<?>> r3) {
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                java.util.Iterator r3 = r3.iterator()
            L9:
                boolean r1 = r3.hasNext()
                if (r1 == 0) goto L1d
                java.lang.Object r1 = r3.next()
                java.lang.Class r1 = (java.lang.Class) r1
                byte[] r2 = read(r1)
                r0.put(r1, r2)
                goto L9
            L1d:
                return r0
        }

        public static java.util.Map<java.lang.Class<?>, byte[]> read(java.lang.Class<?>... r0) {
                java.util.List r0 = java.util.Arrays.asList(r0)
                java.util.Map r0 = read(r0)
                return r0
        }

        public static byte[] read(java.lang.Class<?> r4) {
                java.lang.ClassLoader r0 = r4.getClassLoader()     // Catch: java.io.IOException -> L9
                if (r0 != 0) goto Lb
                java.lang.ClassLoader r0 = net.bytebuddy.dynamic.ClassFileLocator.ForClassLoader.BOOT_LOADER_PROXY     // Catch: java.io.IOException -> L9
                goto Lb
            L9:
                r0 = move-exception
                goto L18
            Lb:
                java.lang.String r1 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.getName(r4)     // Catch: java.io.IOException -> L9
                net.bytebuddy.dynamic.ClassFileLocator$Resolution r0 = locate(r0, r1)     // Catch: java.io.IOException -> L9
                byte[] r4 = r0.resolve()     // Catch: java.io.IOException -> L9
                return r4
            L18:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Cannot read class file for "
                r2.append(r3)
                r2.append(r4)
                java.lang.String r4 = r2.toString()
                r1.<init>(r4, r0)
                throw r1
        }

        public static java.util.Map<java.lang.String, byte[]> readToNames(java.util.Collection<? extends java.lang.Class<?>> r3) {
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                java.util.Iterator r3 = r3.iterator()
            L9:
                boolean r1 = r3.hasNext()
                if (r1 == 0) goto L21
                java.lang.Object r1 = r3.next()
                java.lang.Class r1 = (java.lang.Class) r1
                java.lang.String r2 = r1.getName()
                byte[] r1 = read(r1)
                r0.put(r2, r1)
                goto L9
            L21:
                return r0
        }

        public static java.util.Map<java.lang.String, byte[]> readToNames(java.lang.Class<?>... r0) {
                java.util.List r0 = java.util.Arrays.asList(r0)
                java.util.Map r0 = readToNames(r0)
                return r0
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
                r0 = this;
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
                java.lang.ClassLoader r2 = r4.classLoader
                net.bytebuddy.dynamic.ClassFileLocator$ForClassLoader r5 = (net.bytebuddy.dynamic.ClassFileLocator.ForClassLoader) r5
                java.lang.ClassLoader r5 = r5.classLoader
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
                java.lang.ClassLoader r1 = r2.classLoader
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                return r0
        }

        @Override // net.bytebuddy.dynamic.ClassFileLocator
        public net.bytebuddy.dynamic.ClassFileLocator.Resolution locate(java.lang.String r2) throws java.io.IOException {
                r1 = this;
                java.lang.ClassLoader r0 = r1.classLoader
                net.bytebuddy.dynamic.ClassFileLocator$Resolution r2 = locate(r0, r2)
                return r2
        }
    }

    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
    public static class ForFolder implements net.bytebuddy.dynamic.ClassFileLocator {
        private final java.io.File folder;

        public ForFolder(java.io.File r1) {
                r0 = this;
                r0.<init>()
                r0.folder = r1
                return
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
                r0 = this;
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
                net.bytebuddy.dynamic.ClassFileLocator$ForFolder r5 = (net.bytebuddy.dynamic.ClassFileLocator.ForFolder) r5
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

        @Override // net.bytebuddy.dynamic.ClassFileLocator
        public net.bytebuddy.dynamic.ClassFileLocator.Resolution locate(java.lang.String r6) throws java.io.IOException {
                r5 = this;
                java.io.File r0 = new java.io.File
                java.io.File r1 = r5.folder
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r3 = 46
                char r4 = java.io.File.separatorChar
                java.lang.String r3 = r6.replace(r3, r4)
                r2.append(r3)
                java.lang.String r3 = ".class"
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                r0.<init>(r1, r2)
                boolean r1 = r0.exists()
                if (r1 == 0) goto L3f
                java.io.FileInputStream r6 = new java.io.FileInputStream
                r6.<init>(r0)
                net.bytebuddy.dynamic.ClassFileLocator$Resolution$Explicit r0 = new net.bytebuddy.dynamic.ClassFileLocator$Resolution$Explicit     // Catch: java.lang.Throwable -> L3a
                net.bytebuddy.utility.StreamDrainer r1 = net.bytebuddy.utility.StreamDrainer.DEFAULT     // Catch: java.lang.Throwable -> L3a
                byte[] r1 = r1.drain(r6)     // Catch: java.lang.Throwable -> L3a
                r0.<init>(r1)     // Catch: java.lang.Throwable -> L3a
                r6.close()
                return r0
            L3a:
                r0 = move-exception
                r6.close()
                throw r0
            L3f:
                net.bytebuddy.dynamic.ClassFileLocator$Resolution$Illegal r0 = new net.bytebuddy.dynamic.ClassFileLocator$Resolution$Illegal
                r0.<init>(r6)
                return r0
        }
    }

    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
    public static class ForInstrumentation implements net.bytebuddy.dynamic.ClassFileLocator {
        private static final boolean ACCESS_CONTROLLER = false;
        private static final net.bytebuddy.dynamic.ClassFileLocator.ForInstrumentation.Dispatcher DISPATCHER = null;
        private final net.bytebuddy.dynamic.ClassFileLocator.ForInstrumentation.ClassLoadingDelegate classLoadingDelegate;
        private final java.lang.instrument.Instrumentation instrumentation;

        public interface ClassLoadingDelegate {

            @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
            public static class Default implements net.bytebuddy.dynamic.ClassFileLocator.ForInstrumentation.ClassLoadingDelegate {
                private static final java.lang.ClassLoader BOOT_LOADER_PROXY = null;
                protected final java.lang.ClassLoader classLoader;

                public enum BootLoaderProxyCreationAction extends java.lang.Enum<net.bytebuddy.dynamic.ClassFileLocator.ForInstrumentation.ClassLoadingDelegate.Default.BootLoaderProxyCreationAction> implements java.security.PrivilegedAction<java.lang.ClassLoader> {
                    private static final /* synthetic */ net.bytebuddy.dynamic.ClassFileLocator.ForInstrumentation.ClassLoadingDelegate.Default.BootLoaderProxyCreationAction[] $VALUES = null;
                    public static final net.bytebuddy.dynamic.ClassFileLocator.ForInstrumentation.ClassLoadingDelegate.Default.BootLoaderProxyCreationAction INSTANCE = null;

                    static {
                            net.bytebuddy.dynamic.ClassFileLocator$ForInstrumentation$ClassLoadingDelegate$Default$BootLoaderProxyCreationAction r0 = new net.bytebuddy.dynamic.ClassFileLocator$ForInstrumentation$ClassLoadingDelegate$Default$BootLoaderProxyCreationAction
                            java.lang.String r1 = "INSTANCE"
                            r2 = 0
                            r0.<init>(r1, r2)
                            net.bytebuddy.dynamic.ClassFileLocator.ForInstrumentation.ClassLoadingDelegate.Default.BootLoaderProxyCreationAction.INSTANCE = r0
                            net.bytebuddy.dynamic.ClassFileLocator$ForInstrumentation$ClassLoadingDelegate$Default$BootLoaderProxyCreationAction[] r0 = new net.bytebuddy.dynamic.ClassFileLocator.ForInstrumentation.ClassLoadingDelegate.Default.BootLoaderProxyCreationAction[]{r0}
                            net.bytebuddy.dynamic.ClassFileLocator.ForInstrumentation.ClassLoadingDelegate.Default.BootLoaderProxyCreationAction.$VALUES = r0
                            return
                    }

                    BootLoaderProxyCreationAction(java.lang.String r1, int r2) {
                            r0 = this;
                            r0.<init>(r1, r2)
                            return
                    }

                    public static net.bytebuddy.dynamic.ClassFileLocator.ForInstrumentation.ClassLoadingDelegate.Default.BootLoaderProxyCreationAction valueOf(java.lang.String r1) {
                            java.lang.Class<net.bytebuddy.dynamic.ClassFileLocator$ForInstrumentation$ClassLoadingDelegate$Default$BootLoaderProxyCreationAction> r0 = net.bytebuddy.dynamic.ClassFileLocator.ForInstrumentation.ClassLoadingDelegate.Default.BootLoaderProxyCreationAction.class
                            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                            net.bytebuddy.dynamic.ClassFileLocator$ForInstrumentation$ClassLoadingDelegate$Default$BootLoaderProxyCreationAction r1 = (net.bytebuddy.dynamic.ClassFileLocator.ForInstrumentation.ClassLoadingDelegate.Default.BootLoaderProxyCreationAction) r1
                            return r1
                    }

                    public static net.bytebuddy.dynamic.ClassFileLocator.ForInstrumentation.ClassLoadingDelegate.Default.BootLoaderProxyCreationAction[] values() {
                            net.bytebuddy.dynamic.ClassFileLocator$ForInstrumentation$ClassLoadingDelegate$Default$BootLoaderProxyCreationAction[] r0 = net.bytebuddy.dynamic.ClassFileLocator.ForInstrumentation.ClassLoadingDelegate.Default.BootLoaderProxyCreationAction.$VALUES
                            java.lang.Object r0 = r0.clone()
                            net.bytebuddy.dynamic.ClassFileLocator$ForInstrumentation$ClassLoadingDelegate$Default$BootLoaderProxyCreationAction[] r0 = (net.bytebuddy.dynamic.ClassFileLocator.ForInstrumentation.ClassLoadingDelegate.Default.BootLoaderProxyCreationAction[]) r0
                            return r0
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // java.security.PrivilegedAction
                    public java.lang.ClassLoader run() {
                            r3 = this;
                            java.net.URLClassLoader r0 = new java.net.URLClassLoader
                            r1 = 0
                            java.net.URL[] r1 = new java.net.URL[r1]
                            java.lang.ClassLoader r2 = net.bytebuddy.dynamic.loading.ClassLoadingStrategy.BOOTSTRAP_LOADER
                            r0.<init>(r1, r2)
                            return r0
                    }

                    @Override // java.security.PrivilegedAction
                    public /* bridge */ /* synthetic */ java.lang.ClassLoader run() {
                            r1 = this;
                            java.lang.ClassLoader r0 = r1.run()
                            return r0
                    }
                }

                static {
                        net.bytebuddy.dynamic.ClassFileLocator$ForInstrumentation$ClassLoadingDelegate$Default$BootLoaderProxyCreationAction r0 = net.bytebuddy.dynamic.ClassFileLocator.ForInstrumentation.ClassLoadingDelegate.Default.BootLoaderProxyCreationAction.INSTANCE
                        java.lang.Object r0 = net.bytebuddy.dynamic.ClassFileLocator.ForInstrumentation.access$000(r0)
                        java.lang.ClassLoader r0 = (java.lang.ClassLoader) r0
                        net.bytebuddy.dynamic.ClassFileLocator.ForInstrumentation.ClassLoadingDelegate.Default.BOOT_LOADER_PROXY = r0
                        return
                }

                public Default(java.lang.ClassLoader r1) {
                        r0 = this;
                        r0.<init>()
                        r0.classLoader = r1
                        return
                }

                public static net.bytebuddy.dynamic.ClassFileLocator.ForInstrumentation.ClassLoadingDelegate of(@net.bytebuddy.utility.nullability.MaybeNull java.lang.ClassLoader r1) {
                        boolean r0 = net.bytebuddy.dynamic.ClassFileLocator.ForInstrumentation.ClassLoadingDelegate.ForDelegatingClassLoader.isDelegating(r1)
                        if (r0 == 0) goto Lc
                        net.bytebuddy.dynamic.ClassFileLocator$ForInstrumentation$ClassLoadingDelegate$ForDelegatingClassLoader r0 = new net.bytebuddy.dynamic.ClassFileLocator$ForInstrumentation$ClassLoadingDelegate$ForDelegatingClassLoader
                        r0.<init>(r1)
                        goto L15
                    Lc:
                        net.bytebuddy.dynamic.ClassFileLocator$ForInstrumentation$ClassLoadingDelegate$Default r0 = new net.bytebuddy.dynamic.ClassFileLocator$ForInstrumentation$ClassLoadingDelegate$Default
                        if (r1 != 0) goto L12
                        java.lang.ClassLoader r1 = net.bytebuddy.dynamic.ClassFileLocator.ForInstrumentation.ClassLoadingDelegate.Default.BOOT_LOADER_PROXY
                    L12:
                        r0.<init>(r1)
                    L15:
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
                        java.lang.ClassLoader r2 = r4.classLoader
                        net.bytebuddy.dynamic.ClassFileLocator$ForInstrumentation$ClassLoadingDelegate$Default r5 = (net.bytebuddy.dynamic.ClassFileLocator.ForInstrumentation.ClassLoadingDelegate.Default) r5
                        java.lang.ClassLoader r5 = r5.classLoader
                        boolean r5 = r2.equals(r5)
                        if (r5 != 0) goto L20
                        return r1
                    L20:
                        return r0
                }

                @Override // net.bytebuddy.dynamic.ClassFileLocator.ForInstrumentation.ClassLoadingDelegate
                @net.bytebuddy.utility.nullability.MaybeNull
                public java.lang.ClassLoader getClassLoader() {
                        r2 = this;
                        java.lang.ClassLoader r0 = r2.classLoader
                        java.lang.ClassLoader r1 = net.bytebuddy.dynamic.ClassFileLocator.ForInstrumentation.ClassLoadingDelegate.Default.BOOT_LOADER_PROXY
                        if (r0 != r1) goto L8
                        java.lang.ClassLoader r0 = net.bytebuddy.dynamic.loading.ClassLoadingStrategy.BOOTSTRAP_LOADER
                    L8:
                        return r0
                }

                public int hashCode() {
                        r2 = this;
                        java.lang.Class r0 = r2.getClass()
                        int r0 = r0.hashCode()
                        int r0 = r0 * 31
                        java.lang.ClassLoader r1 = r2.classLoader
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        return r0
                }

                @Override // net.bytebuddy.dynamic.ClassFileLocator.ForInstrumentation.ClassLoadingDelegate
                public java.lang.Class<?> locate(java.lang.String r2) throws java.lang.ClassNotFoundException {
                        r1 = this;
                        java.lang.ClassLoader r0 = r1.classLoader
                        java.lang.Class r2 = r0.loadClass(r2)
                        return r2
                }
            }

            @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
            public static class Explicit implements net.bytebuddy.dynamic.ClassFileLocator.ForInstrumentation.ClassLoadingDelegate {
                private final net.bytebuddy.dynamic.ClassFileLocator.ForInstrumentation.ClassLoadingDelegate fallbackDelegate;
                private final java.util.Map<java.lang.String, java.lang.Class<?>> types;

                public Explicit(@net.bytebuddy.utility.nullability.MaybeNull java.lang.ClassLoader r1, java.util.Collection<? extends java.lang.Class<?>> r2) {
                        r0 = this;
                        net.bytebuddy.dynamic.ClassFileLocator$ForInstrumentation$ClassLoadingDelegate r1 = net.bytebuddy.dynamic.ClassFileLocator.ForInstrumentation.ClassLoadingDelegate.Default.of(r1)
                        r0.<init>(r1, r2)
                        return
                }

                public Explicit(net.bytebuddy.dynamic.ClassFileLocator.ForInstrumentation.ClassLoadingDelegate r3, java.util.Collection<? extends java.lang.Class<?>> r4) {
                        r2 = this;
                        r2.<init>()
                        r2.fallbackDelegate = r3
                        java.util.HashMap r3 = new java.util.HashMap
                        r3.<init>()
                        r2.types = r3
                        java.util.Iterator r3 = r4.iterator()
                    L10:
                        boolean r4 = r3.hasNext()
                        if (r4 == 0) goto L26
                        java.lang.Object r4 = r3.next()
                        java.lang.Class r4 = (java.lang.Class) r4
                        java.util.Map<java.lang.String, java.lang.Class<?>> r0 = r2.types
                        java.lang.String r1 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.getName(r4)
                        r0.put(r1, r4)
                        goto L10
                    L26:
                        return
                }

                public static net.bytebuddy.dynamic.ClassFileLocator.ForInstrumentation.ClassLoadingDelegate of(java.lang.Class<?> r2) {
                        net.bytebuddy.dynamic.ClassFileLocator$ForInstrumentation$ClassLoadingDelegate$Explicit r0 = new net.bytebuddy.dynamic.ClassFileLocator$ForInstrumentation$ClassLoadingDelegate$Explicit
                        java.lang.ClassLoader r1 = r2.getClassLoader()
                        java.util.Set r2 = java.util.Collections.singleton(r2)
                        r0.<init>(r1, r2)
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
                        net.bytebuddy.dynamic.ClassFileLocator$ForInstrumentation$ClassLoadingDelegate r2 = r4.fallbackDelegate
                        net.bytebuddy.dynamic.ClassFileLocator$ForInstrumentation$ClassLoadingDelegate$Explicit r5 = (net.bytebuddy.dynamic.ClassFileLocator.ForInstrumentation.ClassLoadingDelegate.Explicit) r5
                        net.bytebuddy.dynamic.ClassFileLocator$ForInstrumentation$ClassLoadingDelegate r3 = r5.fallbackDelegate
                        boolean r2 = r2.equals(r3)
                        if (r2 != 0) goto L20
                        return r1
                    L20:
                        java.util.Map<java.lang.String, java.lang.Class<?>> r2 = r4.types
                        java.util.Map<java.lang.String, java.lang.Class<?>> r5 = r5.types
                        boolean r5 = r2.equals(r5)
                        if (r5 != 0) goto L2b
                        return r1
                    L2b:
                        return r0
                }

                @Override // net.bytebuddy.dynamic.ClassFileLocator.ForInstrumentation.ClassLoadingDelegate
                @net.bytebuddy.utility.nullability.MaybeNull
                public java.lang.ClassLoader getClassLoader() {
                        r1 = this;
                        net.bytebuddy.dynamic.ClassFileLocator$ForInstrumentation$ClassLoadingDelegate r0 = r1.fallbackDelegate
                        java.lang.ClassLoader r0 = r0.getClassLoader()
                        return r0
                }

                public int hashCode() {
                        r2 = this;
                        java.lang.Class r0 = r2.getClass()
                        int r0 = r0.hashCode()
                        int r0 = r0 * 31
                        net.bytebuddy.dynamic.ClassFileLocator$ForInstrumentation$ClassLoadingDelegate r1 = r2.fallbackDelegate
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        int r0 = r0 * 31
                        java.util.Map<java.lang.String, java.lang.Class<?>> r1 = r2.types
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        return r0
                }

                @Override // net.bytebuddy.dynamic.ClassFileLocator.ForInstrumentation.ClassLoadingDelegate
                public java.lang.Class<?> locate(java.lang.String r2) throws java.lang.ClassNotFoundException {
                        r1 = this;
                        java.util.Map<java.lang.String, java.lang.Class<?>> r0 = r1.types
                        java.lang.Object r0 = r0.get(r2)
                        java.lang.Class r0 = (java.lang.Class) r0
                        if (r0 != 0) goto L10
                        net.bytebuddy.dynamic.ClassFileLocator$ForInstrumentation$ClassLoadingDelegate r0 = r1.fallbackDelegate
                        java.lang.Class r0 = r0.locate(r2)
                    L10:
                        return r0
                }
            }

            public static class ForDelegatingClassLoader extends net.bytebuddy.dynamic.ClassFileLocator.ForInstrumentation.ClassLoadingDelegate.Default {
                private static final boolean ACCESS_CONTROLLER = false;
                private static final java.lang.String DELEGATING_CLASS_LOADER_NAME = "sun.reflect.DelegatingClassLoader";
                private static final net.bytebuddy.dynamic.ClassFileLocator.ForInstrumentation.ClassLoadingDelegate.ForDelegatingClassLoader.Dispatcher.Initializable DISPATCHER = null;
                private static final int ONLY = 0;

                public interface Dispatcher {

                    public enum CreationAction extends java.lang.Enum<net.bytebuddy.dynamic.ClassFileLocator.ForInstrumentation.ClassLoadingDelegate.ForDelegatingClassLoader.Dispatcher.CreationAction> implements java.security.PrivilegedAction<net.bytebuddy.dynamic.ClassFileLocator.ForInstrumentation.ClassLoadingDelegate.ForDelegatingClassLoader.Dispatcher.Initializable> {
                        private static final /* synthetic */ net.bytebuddy.dynamic.ClassFileLocator.ForInstrumentation.ClassLoadingDelegate.ForDelegatingClassLoader.Dispatcher.CreationAction[] $VALUES = null;
                        public static final net.bytebuddy.dynamic.ClassFileLocator.ForInstrumentation.ClassLoadingDelegate.ForDelegatingClassLoader.Dispatcher.CreationAction INSTANCE = null;

                        static {
                                net.bytebuddy.dynamic.ClassFileLocator$ForInstrumentation$ClassLoadingDelegate$ForDelegatingClassLoader$Dispatcher$CreationAction r0 = new net.bytebuddy.dynamic.ClassFileLocator$ForInstrumentation$ClassLoadingDelegate$ForDelegatingClassLoader$Dispatcher$CreationAction
                                java.lang.String r1 = "INSTANCE"
                                r2 = 0
                                r0.<init>(r1, r2)
                                net.bytebuddy.dynamic.ClassFileLocator.ForInstrumentation.ClassLoadingDelegate.ForDelegatingClassLoader.Dispatcher.CreationAction.INSTANCE = r0
                                net.bytebuddy.dynamic.ClassFileLocator$ForInstrumentation$ClassLoadingDelegate$ForDelegatingClassLoader$Dispatcher$CreationAction[] r0 = new net.bytebuddy.dynamic.ClassFileLocator.ForInstrumentation.ClassLoadingDelegate.ForDelegatingClassLoader.Dispatcher.CreationAction[]{r0}
                                net.bytebuddy.dynamic.ClassFileLocator.ForInstrumentation.ClassLoadingDelegate.ForDelegatingClassLoader.Dispatcher.CreationAction.$VALUES = r0
                                return
                        }

                        CreationAction(java.lang.String r1, int r2) {
                                r0 = this;
                                r0.<init>(r1, r2)
                                return
                        }

                        public static net.bytebuddy.dynamic.ClassFileLocator.ForInstrumentation.ClassLoadingDelegate.ForDelegatingClassLoader.Dispatcher.CreationAction valueOf(java.lang.String r1) {
                                java.lang.Class<net.bytebuddy.dynamic.ClassFileLocator$ForInstrumentation$ClassLoadingDelegate$ForDelegatingClassLoader$Dispatcher$CreationAction> r0 = net.bytebuddy.dynamic.ClassFileLocator.ForInstrumentation.ClassLoadingDelegate.ForDelegatingClassLoader.Dispatcher.CreationAction.class
                                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                                net.bytebuddy.dynamic.ClassFileLocator$ForInstrumentation$ClassLoadingDelegate$ForDelegatingClassLoader$Dispatcher$CreationAction r1 = (net.bytebuddy.dynamic.ClassFileLocator.ForInstrumentation.ClassLoadingDelegate.ForDelegatingClassLoader.Dispatcher.CreationAction) r1
                                return r1
                        }

                        public static net.bytebuddy.dynamic.ClassFileLocator.ForInstrumentation.ClassLoadingDelegate.ForDelegatingClassLoader.Dispatcher.CreationAction[] values() {
                                net.bytebuddy.dynamic.ClassFileLocator$ForInstrumentation$ClassLoadingDelegate$ForDelegatingClassLoader$Dispatcher$CreationAction[] r0 = net.bytebuddy.dynamic.ClassFileLocator.ForInstrumentation.ClassLoadingDelegate.ForDelegatingClassLoader.Dispatcher.CreationAction.$VALUES
                                java.lang.Object r0 = r0.clone()
                                net.bytebuddy.dynamic.ClassFileLocator$ForInstrumentation$ClassLoadingDelegate$ForDelegatingClassLoader$Dispatcher$CreationAction[] r0 = (net.bytebuddy.dynamic.ClassFileLocator.ForInstrumentation.ClassLoadingDelegate.ForDelegatingClassLoader.Dispatcher.CreationAction[]) r0
                                return r0
                        }

                        @Override // java.security.PrivilegedAction
                        public /* bridge */ /* synthetic */ net.bytebuddy.dynamic.ClassFileLocator.ForInstrumentation.ClassLoadingDelegate.ForDelegatingClassLoader.Dispatcher.Initializable run() {
                                r1 = this;
                                net.bytebuddy.dynamic.ClassFileLocator$ForInstrumentation$ClassLoadingDelegate$ForDelegatingClassLoader$Dispatcher$Initializable r0 = r1.run2()
                                return r0
                        }

                        @Override // java.security.PrivilegedAction
                        /* JADX INFO: renamed from: run, reason: avoid collision after fix types in other method */
                        public net.bytebuddy.dynamic.ClassFileLocator.ForInstrumentation.ClassLoadingDelegate.ForDelegatingClassLoader.Dispatcher.Initializable run2() {
                                r3 = this;
                                net.bytebuddy.dynamic.ClassFileLocator$ForInstrumentation$ClassLoadingDelegate$ForDelegatingClassLoader$Dispatcher$Resolved r0 = new net.bytebuddy.dynamic.ClassFileLocator$ForInstrumentation$ClassLoadingDelegate$ForDelegatingClassLoader$Dispatcher$Resolved     // Catch: java.lang.Exception -> Le
                                java.lang.Class<java.lang.ClassLoader> r1 = java.lang.ClassLoader.class
                                java.lang.String r2 = "classes"
                                java.lang.reflect.Field r1 = r1.getDeclaredField(r2)     // Catch: java.lang.Exception -> Le
                                r0.<init>(r1)     // Catch: java.lang.Exception -> Le
                                return r0
                            Le:
                                r0 = move-exception
                                net.bytebuddy.dynamic.ClassFileLocator$ForInstrumentation$ClassLoadingDelegate$ForDelegatingClassLoader$Dispatcher$Unresolved r1 = new net.bytebuddy.dynamic.ClassFileLocator$ForInstrumentation$ClassLoadingDelegate$ForDelegatingClassLoader$Dispatcher$Unresolved
                                java.lang.String r0 = r0.getMessage()
                                r1.<init>(r0)
                                return r1
                        }
                    }

                    public interface Initializable {
                        net.bytebuddy.dynamic.ClassFileLocator.ForInstrumentation.ClassLoadingDelegate.ForDelegatingClassLoader.Dispatcher initialize();
                    }

                    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
                    public static class Resolved implements net.bytebuddy.dynamic.ClassFileLocator.ForInstrumentation.ClassLoadingDelegate.ForDelegatingClassLoader.Dispatcher, net.bytebuddy.dynamic.ClassFileLocator.ForInstrumentation.ClassLoadingDelegate.ForDelegatingClassLoader.Dispatcher.Initializable, java.security.PrivilegedAction<net.bytebuddy.dynamic.ClassFileLocator.ForInstrumentation.ClassLoadingDelegate.ForDelegatingClassLoader.Dispatcher> {
                        private static final boolean ACCESS_CONTROLLER = false;
                        private final java.lang.reflect.Field field;

                        static {
                                r0 = 0
                                java.lang.String r1 = "java.security.AccessController"
                                r2 = 0
                                java.lang.Class.forName(r1, r0, r2)     // Catch: java.lang.SecurityException -> L16 java.lang.ClassNotFoundException -> L17
                                java.lang.String r1 = "net.bytebuddy.securitymanager"
                                java.lang.String r2 = "true"
                                java.lang.String r1 = java.lang.System.getProperty(r1, r2)     // Catch: java.lang.SecurityException -> L16 java.lang.ClassNotFoundException -> L17
                                boolean r1 = java.lang.Boolean.parseBoolean(r1)     // Catch: java.lang.SecurityException -> L16 java.lang.ClassNotFoundException -> L17
                                net.bytebuddy.dynamic.ClassFileLocator.ForInstrumentation.ClassLoadingDelegate.ForDelegatingClassLoader.Dispatcher.Resolved.ACCESS_CONTROLLER = r1     // Catch: java.lang.SecurityException -> L16 java.lang.ClassNotFoundException -> L17
                                goto L19
                            L16:
                                r0 = 1
                            L17:
                                net.bytebuddy.dynamic.ClassFileLocator.ForInstrumentation.ClassLoadingDelegate.ForDelegatingClassLoader.Dispatcher.Resolved.ACCESS_CONTROLLER = r0
                            L19:
                                return
                        }

                        public Resolved(java.lang.reflect.Field r1) {
                                r0 = this;
                                r0.<init>()
                                r0.field = r1
                                return
                        }

                        @net.bytebuddy.build.AccessControllerPlugin.Enhance
                        private static <T> T doPrivileged(java.security.PrivilegedAction<T> r1) {
                                boolean r0 = net.bytebuddy.dynamic.ClassFileLocator.ForInstrumentation.ClassLoadingDelegate.ForDelegatingClassLoader.Dispatcher.Resolved.ACCESS_CONTROLLER
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
                                java.lang.reflect.Field r2 = r4.field
                                net.bytebuddy.dynamic.ClassFileLocator$ForInstrumentation$ClassLoadingDelegate$ForDelegatingClassLoader$Dispatcher$Resolved r5 = (net.bytebuddy.dynamic.ClassFileLocator.ForInstrumentation.ClassLoadingDelegate.ForDelegatingClassLoader.Dispatcher.Resolved) r5
                                java.lang.reflect.Field r5 = r5.field
                                boolean r5 = r2.equals(r5)
                                if (r5 != 0) goto L20
                                return r1
                            L20:
                                return r0
                        }

                        @Override // net.bytebuddy.dynamic.ClassFileLocator.ForInstrumentation.ClassLoadingDelegate.ForDelegatingClassLoader.Dispatcher
                        public java.util.Vector<java.lang.Class<?>> extract(java.lang.ClassLoader r3) {
                                r2 = this;
                                java.lang.reflect.Field r0 = r2.field     // Catch: java.lang.IllegalAccessException -> L9
                                java.lang.Object r3 = r0.get(r3)     // Catch: java.lang.IllegalAccessException -> L9
                                java.util.Vector r3 = (java.util.Vector) r3     // Catch: java.lang.IllegalAccessException -> L9
                                return r3
                            L9:
                                r3 = move-exception
                                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                                java.lang.String r1 = "Cannot access field"
                                r0.<init>(r1, r3)
                                throw r0
                        }

                        public int hashCode() {
                                r2 = this;
                                java.lang.Class r0 = r2.getClass()
                                int r0 = r0.hashCode()
                                int r0 = r0 * 31
                                java.lang.reflect.Field r1 = r2.field
                                int r1 = r1.hashCode()
                                int r0 = r0 + r1
                                return r0
                        }

                        @Override // net.bytebuddy.dynamic.ClassFileLocator.ForInstrumentation.ClassLoadingDelegate.ForDelegatingClassLoader.Dispatcher.Initializable
                        public net.bytebuddy.dynamic.ClassFileLocator.ForInstrumentation.ClassLoadingDelegate.ForDelegatingClassLoader.Dispatcher initialize() {
                                r1 = this;
                                java.lang.Object r0 = doPrivileged(r1)
                                net.bytebuddy.dynamic.ClassFileLocator$ForInstrumentation$ClassLoadingDelegate$ForDelegatingClassLoader$Dispatcher r0 = (net.bytebuddy.dynamic.ClassFileLocator.ForInstrumentation.ClassLoadingDelegate.ForDelegatingClassLoader.Dispatcher) r0
                                return r0
                        }

                        @Override // java.security.PrivilegedAction
                        public /* bridge */ /* synthetic */ net.bytebuddy.dynamic.ClassFileLocator.ForInstrumentation.ClassLoadingDelegate.ForDelegatingClassLoader.Dispatcher run() {
                                r1 = this;
                                net.bytebuddy.dynamic.ClassFileLocator$ForInstrumentation$ClassLoadingDelegate$ForDelegatingClassLoader$Dispatcher r0 = r1.run2()
                                return r0
                        }

                        @Override // java.security.PrivilegedAction
                        /* JADX INFO: renamed from: run, reason: avoid collision after fix types in other method */
                        public net.bytebuddy.dynamic.ClassFileLocator.ForInstrumentation.ClassLoadingDelegate.ForDelegatingClassLoader.Dispatcher run2() {
                                r2 = this;
                                java.lang.reflect.Field r0 = r2.field
                                r1 = 1
                                r0.setAccessible(r1)
                                return r2
                        }
                    }

                    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
                    public static class Unresolved implements net.bytebuddy.dynamic.ClassFileLocator.ForInstrumentation.ClassLoadingDelegate.ForDelegatingClassLoader.Dispatcher.Initializable {
                        private final java.lang.String message;

                        public Unresolved(java.lang.String r1) {
                                r0 = this;
                                r0.<init>()
                                r0.message = r1
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
                                java.lang.String r2 = r4.message
                                net.bytebuddy.dynamic.ClassFileLocator$ForInstrumentation$ClassLoadingDelegate$ForDelegatingClassLoader$Dispatcher$Unresolved r5 = (net.bytebuddy.dynamic.ClassFileLocator.ForInstrumentation.ClassLoadingDelegate.ForDelegatingClassLoader.Dispatcher.Unresolved) r5
                                java.lang.String r5 = r5.message
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
                                java.lang.String r1 = r2.message
                                int r1 = r1.hashCode()
                                int r0 = r0 + r1
                                return r0
                        }

                        @Override // net.bytebuddy.dynamic.ClassFileLocator.ForInstrumentation.ClassLoadingDelegate.ForDelegatingClassLoader.Dispatcher.Initializable
                        public net.bytebuddy.dynamic.ClassFileLocator.ForInstrumentation.ClassLoadingDelegate.ForDelegatingClassLoader.Dispatcher initialize() {
                                r3 = this;
                                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                                r1.<init>()
                                java.lang.String r2 = "Could not locate classes vector: "
                                r1.append(r2)
                                java.lang.String r2 = r3.message
                                r1.append(r2)
                                java.lang.String r1 = r1.toString()
                                r0.<init>(r1)
                                throw r0
                        }
                    }

                    java.util.Vector<java.lang.Class<?>> extract(java.lang.ClassLoader r1);
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
                        net.bytebuddy.dynamic.ClassFileLocator.ForInstrumentation.ClassLoadingDelegate.ForDelegatingClassLoader.ACCESS_CONTROLLER = r1     // Catch: java.lang.SecurityException -> L16 java.lang.ClassNotFoundException -> L17
                        goto L19
                    L16:
                        r0 = 1
                    L17:
                        net.bytebuddy.dynamic.ClassFileLocator.ForInstrumentation.ClassLoadingDelegate.ForDelegatingClassLoader.ACCESS_CONTROLLER = r0
                    L19:
                        net.bytebuddy.dynamic.ClassFileLocator$ForInstrumentation$ClassLoadingDelegate$ForDelegatingClassLoader$Dispatcher$CreationAction r0 = net.bytebuddy.dynamic.ClassFileLocator.ForInstrumentation.ClassLoadingDelegate.ForDelegatingClassLoader.Dispatcher.CreationAction.INSTANCE
                        java.lang.Object r0 = doPrivileged(r0)
                        net.bytebuddy.dynamic.ClassFileLocator$ForInstrumentation$ClassLoadingDelegate$ForDelegatingClassLoader$Dispatcher$Initializable r0 = (net.bytebuddy.dynamic.ClassFileLocator.ForInstrumentation.ClassLoadingDelegate.ForDelegatingClassLoader.Dispatcher.Initializable) r0
                        net.bytebuddy.dynamic.ClassFileLocator.ForInstrumentation.ClassLoadingDelegate.ForDelegatingClassLoader.DISPATCHER = r0
                        return
                }

                public ForDelegatingClassLoader(java.lang.ClassLoader r1) {
                        r0 = this;
                        r0.<init>(r1)
                        return
                }

                @net.bytebuddy.build.AccessControllerPlugin.Enhance
                private static <T> T doPrivileged(java.security.PrivilegedAction<T> r1) {
                        boolean r0 = net.bytebuddy.dynamic.ClassFileLocator.ForInstrumentation.ClassLoadingDelegate.ForDelegatingClassLoader.ACCESS_CONTROLLER
                        if (r0 == 0) goto L9
                        java.lang.Object r1 = java.security.AccessController.doPrivileged(r1)
                        return r1
                    L9:
                        java.lang.Object r1 = r1.run()
                        return r1
                }

                public static boolean isDelegating(@net.bytebuddy.utility.nullability.MaybeNull java.lang.ClassLoader r1) {
                        if (r1 == 0) goto L14
                        java.lang.Class r1 = r1.getClass()
                        java.lang.String r1 = r1.getName()
                        java.lang.String r0 = "sun.reflect.DelegatingClassLoader"
                        boolean r1 = r1.equals(r0)
                        if (r1 == 0) goto L14
                        r1 = 1
                        goto L15
                    L14:
                        r1 = 0
                    L15:
                        return r1
                }

                @Override // net.bytebuddy.dynamic.ClassFileLocator.ForInstrumentation.ClassLoadingDelegate.Default, net.bytebuddy.dynamic.ClassFileLocator.ForInstrumentation.ClassLoadingDelegate
                public java.lang.Class<?> locate(java.lang.String r4) throws java.lang.ClassNotFoundException {
                        r3 = this;
                        net.bytebuddy.dynamic.ClassFileLocator$ForInstrumentation$ClassLoadingDelegate$ForDelegatingClassLoader$Dispatcher$Initializable r0 = net.bytebuddy.dynamic.ClassFileLocator.ForInstrumentation.ClassLoadingDelegate.ForDelegatingClassLoader.DISPATCHER     // Catch: java.lang.RuntimeException -> L2f
                        net.bytebuddy.dynamic.ClassFileLocator$ForInstrumentation$ClassLoadingDelegate$ForDelegatingClassLoader$Dispatcher r0 = r0.initialize()     // Catch: java.lang.RuntimeException -> L2f
                        java.lang.ClassLoader r1 = r3.classLoader     // Catch: java.lang.RuntimeException -> L2f
                        java.util.Vector r0 = r0.extract(r1)     // Catch: java.lang.RuntimeException -> L2f
                        int r1 = r0.size()
                        r2 = 1
                        if (r1 == r2) goto L18
                        java.lang.Class r4 = super.locate(r4)
                        return r4
                    L18:
                        r1 = 0
                        java.lang.Object r0 = r0.get(r1)
                        java.lang.Class r0 = (java.lang.Class) r0
                        java.lang.String r1 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.getName(r0)
                        boolean r1 = r1.equals(r4)
                        if (r1 == 0) goto L2a
                        goto L2e
                    L2a:
                        java.lang.Class r0 = super.locate(r4)
                    L2e:
                        return r0
                    L2f:
                        java.lang.Class r4 = super.locate(r4)
                        return r4
                }
            }

            @net.bytebuddy.utility.nullability.MaybeNull
            java.lang.ClassLoader getClassLoader();

            java.lang.Class<?> locate(java.lang.String r1) throws java.lang.ClassNotFoundException;
        }

        @net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied("java.lang.instrument.Instrumentation")
        public interface Dispatcher {
            @net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied("addTransformer")
            void addTransformer(java.lang.instrument.Instrumentation r1, java.lang.instrument.ClassFileTransformer r2, boolean r3);

            @net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied("isRetransformClassesSupported")
            boolean isRetransformClassesSupported(java.lang.instrument.Instrumentation r1);

            @net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied("retransformClasses")
            void retransformClasses(java.lang.instrument.Instrumentation r1, java.lang.Class<?>[] r2) throws java.lang.instrument.UnmodifiableClassException;
        }

        public static class ExtractionClassFileTransformer implements java.lang.instrument.ClassFileTransformer {

            @net.bytebuddy.utility.nullability.AlwaysNull
            private static final byte[] DO_NOT_TRANSFORM = null;

            @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "The array is not to be modified by contract", value = {"VO_VOLATILE_REFERENCE_TO_ARRAY"})
            @net.bytebuddy.utility.nullability.MaybeNull
            private volatile byte[] binaryRepresentation;

            @net.bytebuddy.utility.nullability.MaybeNull
            private final java.lang.ClassLoader classLoader;
            private final java.lang.String typeName;

            static {
                    return
            }

            public ExtractionClassFileTransformer(@net.bytebuddy.utility.nullability.MaybeNull java.lang.ClassLoader r1, java.lang.String r2) {
                    r0 = this;
                    r0.<init>()
                    r0.classLoader = r1
                    r0.typeName = r2
                    return
            }

            @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "The array is not to be modified by contract", value = {"EI_EXPOSE_REP"})
            @net.bytebuddy.utility.nullability.MaybeNull
            public byte[] getBinaryRepresentation() {
                    r1 = this;
                    byte[] r0 = r1.binaryRepresentation
                    return r0
            }

            @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "The array is not modified by class contract.", value = {"EI_EXPOSE_REP", "EI_EXPOSE_REP2"})
            @net.bytebuddy.utility.nullability.MaybeNull
            public byte[] transform(@net.bytebuddy.utility.nullability.MaybeNull java.lang.ClassLoader r1, @net.bytebuddy.utility.nullability.MaybeNull java.lang.String r2, @net.bytebuddy.utility.nullability.MaybeNull java.lang.Class<?> r3, java.security.ProtectionDomain r4, byte[] r5) {
                    r0 = this;
                    if (r2 == 0) goto L26
                    java.lang.ClassLoader r3 = r0.classLoader
                    net.bytebuddy.matcher.ElementMatcher$Junction r3 = net.bytebuddy.matcher.ElementMatchers.isChildOf(r3)
                    boolean r1 = r3.matches(r1)
                    if (r1 == 0) goto L26
                    java.lang.String r1 = r0.typeName
                    r3 = 47
                    r4 = 46
                    java.lang.String r2 = r2.replace(r3, r4)
                    boolean r1 = r1.equals(r2)
                    if (r1 == 0) goto L26
                    java.lang.Object r1 = r5.clone()
                    byte[] r1 = (byte[]) r1
                    r0.binaryRepresentation = r1
                L26:
                    byte[] r1 = net.bytebuddy.dynamic.ClassFileLocator.ForInstrumentation.ExtractionClassFileTransformer.DO_NOT_TRANSFORM
                    return r1
            }
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
                net.bytebuddy.dynamic.ClassFileLocator.ForInstrumentation.ACCESS_CONTROLLER = r1     // Catch: java.lang.SecurityException -> L16 java.lang.ClassNotFoundException -> L17
                goto L19
            L16:
                r0 = 1
            L17:
                net.bytebuddy.dynamic.ClassFileLocator.ForInstrumentation.ACCESS_CONTROLLER = r0
            L19:
                java.lang.Class<net.bytebuddy.dynamic.ClassFileLocator$ForInstrumentation$Dispatcher> r0 = net.bytebuddy.dynamic.ClassFileLocator.ForInstrumentation.Dispatcher.class
                java.security.PrivilegedAction r0 = net.bytebuddy.utility.dispatcher.JavaDispatcher.of(r0)
                java.lang.Object r0 = doPrivileged(r0)
                net.bytebuddy.dynamic.ClassFileLocator$ForInstrumentation$Dispatcher r0 = (net.bytebuddy.dynamic.ClassFileLocator.ForInstrumentation.Dispatcher) r0
                net.bytebuddy.dynamic.ClassFileLocator.ForInstrumentation.DISPATCHER = r0
                return
        }

        public ForInstrumentation(java.lang.instrument.Instrumentation r1, @net.bytebuddy.utility.nullability.MaybeNull java.lang.ClassLoader r2) {
                r0 = this;
                net.bytebuddy.dynamic.ClassFileLocator$ForInstrumentation$ClassLoadingDelegate r2 = net.bytebuddy.dynamic.ClassFileLocator.ForInstrumentation.ClassLoadingDelegate.Default.of(r2)
                r0.<init>(r1, r2)
                return
        }

        public ForInstrumentation(java.lang.instrument.Instrumentation r2, net.bytebuddy.dynamic.ClassFileLocator.ForInstrumentation.ClassLoadingDelegate r3) {
                r1 = this;
                r1.<init>()
                net.bytebuddy.dynamic.ClassFileLocator$ForInstrumentation$Dispatcher r0 = net.bytebuddy.dynamic.ClassFileLocator.ForInstrumentation.DISPATCHER
                boolean r0 = r0.isRetransformClassesSupported(r2)
                if (r0 == 0) goto L10
                r1.instrumentation = r2
                r1.classLoadingDelegate = r3
                return
            L10:
                java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r2)
                java.lang.String r2 = " does not support retransformation"
                r0.append(r2)
                java.lang.String r2 = r0.toString()
                r3.<init>(r2)
                throw r3
        }

        public static /* synthetic */ java.lang.Object access$000(java.security.PrivilegedAction r0) {
                java.lang.Object r0 = doPrivileged(r0)
                return r0
        }

        @net.bytebuddy.build.AccessControllerPlugin.Enhance
        private static <T> T doPrivileged(java.security.PrivilegedAction<T> r1) {
                boolean r0 = net.bytebuddy.dynamic.ClassFileLocator.ForInstrumentation.ACCESS_CONTROLLER
                if (r0 == 0) goto L9
                java.lang.Object r1 = java.security.AccessController.doPrivileged(r1)
                return r1
            L9:
                java.lang.Object r1 = r1.run()
                return r1
        }

        public static net.bytebuddy.dynamic.ClassFileLocator fromInstalledAgent(@net.bytebuddy.utility.nullability.MaybeNull java.lang.ClassLoader r2) {
                net.bytebuddy.dynamic.ClassFileLocator$ForInstrumentation r0 = new net.bytebuddy.dynamic.ClassFileLocator$ForInstrumentation
                java.lang.instrument.Instrumentation r1 = resolveByteBuddyAgentInstrumentation()
                r0.<init>(r1, r2)
                return r0
        }

        public static net.bytebuddy.dynamic.ClassFileLocator of(java.lang.instrument.Instrumentation r1, java.lang.Class<?> r2) {
                net.bytebuddy.dynamic.ClassFileLocator$ForInstrumentation r0 = new net.bytebuddy.dynamic.ClassFileLocator$ForInstrumentation
                net.bytebuddy.dynamic.ClassFileLocator$ForInstrumentation$ClassLoadingDelegate r2 = net.bytebuddy.dynamic.ClassFileLocator.ForInstrumentation.ClassLoadingDelegate.Explicit.of(r2)
                r0.<init>(r1, r2)
                return r0
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

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
                r0 = this;
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
                net.bytebuddy.dynamic.ClassFileLocator$ForInstrumentation r5 = (net.bytebuddy.dynamic.ClassFileLocator.ForInstrumentation) r5
                java.lang.instrument.Instrumentation r3 = r5.instrumentation
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L20
                return r1
            L20:
                net.bytebuddy.dynamic.ClassFileLocator$ForInstrumentation$ClassLoadingDelegate r2 = r4.classLoadingDelegate
                net.bytebuddy.dynamic.ClassFileLocator$ForInstrumentation$ClassLoadingDelegate r5 = r5.classLoadingDelegate
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
                net.bytebuddy.dynamic.ClassFileLocator$ForInstrumentation$ClassLoadingDelegate r1 = r2.classLoadingDelegate
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                return r0
        }

        @Override // net.bytebuddy.dynamic.ClassFileLocator
        public net.bytebuddy.dynamic.ClassFileLocator.Resolution locate(java.lang.String r5) {
                r4 = this;
                net.bytebuddy.dynamic.ClassFileLocator$ForInstrumentation$ExtractionClassFileTransformer r0 = new net.bytebuddy.dynamic.ClassFileLocator$ForInstrumentation$ExtractionClassFileTransformer     // Catch: java.lang.RuntimeException -> L3c java.lang.Exception -> L44
                net.bytebuddy.dynamic.ClassFileLocator$ForInstrumentation$ClassLoadingDelegate r1 = r4.classLoadingDelegate     // Catch: java.lang.RuntimeException -> L3c java.lang.Exception -> L44
                java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch: java.lang.RuntimeException -> L3c java.lang.Exception -> L44
                r0.<init>(r1, r5)     // Catch: java.lang.RuntimeException -> L3c java.lang.Exception -> L44
                net.bytebuddy.dynamic.ClassFileLocator$ForInstrumentation$Dispatcher r1 = net.bytebuddy.dynamic.ClassFileLocator.ForInstrumentation.DISPATCHER     // Catch: java.lang.RuntimeException -> L3c java.lang.Exception -> L44
                java.lang.instrument.Instrumentation r2 = r4.instrumentation     // Catch: java.lang.RuntimeException -> L3c java.lang.Exception -> L44
                r3 = 1
                r1.addTransformer(r2, r0, r3)     // Catch: java.lang.RuntimeException -> L3c java.lang.Exception -> L44
                java.lang.instrument.Instrumentation r2 = r4.instrumentation     // Catch: java.lang.Throwable -> L2e
                net.bytebuddy.dynamic.ClassFileLocator$ForInstrumentation$ClassLoadingDelegate r3 = r4.classLoadingDelegate     // Catch: java.lang.Throwable -> L2e
                java.lang.Class r3 = r3.locate(r5)     // Catch: java.lang.Throwable -> L2e
                java.lang.Class[] r3 = new java.lang.Class[]{r3}     // Catch: java.lang.Throwable -> L2e
                r1.retransformClasses(r2, r3)     // Catch: java.lang.Throwable -> L2e
                byte[] r1 = r0.getBinaryRepresentation()     // Catch: java.lang.Throwable -> L2e
                if (r1 != 0) goto L30
                net.bytebuddy.dynamic.ClassFileLocator$Resolution$Illegal r1 = new net.bytebuddy.dynamic.ClassFileLocator$Resolution$Illegal     // Catch: java.lang.Throwable -> L2e
                r1.<init>(r5)     // Catch: java.lang.Throwable -> L2e
                goto L36
            L2e:
                r1 = move-exception
                goto L3e
            L30:
                net.bytebuddy.dynamic.ClassFileLocator$Resolution$Explicit r2 = new net.bytebuddy.dynamic.ClassFileLocator$Resolution$Explicit     // Catch: java.lang.Throwable -> L2e
                r2.<init>(r1)     // Catch: java.lang.Throwable -> L2e
                r1 = r2
            L36:
                java.lang.instrument.Instrumentation r2 = r4.instrumentation     // Catch: java.lang.RuntimeException -> L3c java.lang.Exception -> L44
                r2.removeTransformer(r0)     // Catch: java.lang.RuntimeException -> L3c java.lang.Exception -> L44
                return r1
            L3c:
                r5 = move-exception
                goto L4a
            L3e:
                java.lang.instrument.Instrumentation r2 = r4.instrumentation     // Catch: java.lang.RuntimeException -> L3c java.lang.Exception -> L44
                r2.removeTransformer(r0)     // Catch: java.lang.RuntimeException -> L3c java.lang.Exception -> L44
                throw r1     // Catch: java.lang.RuntimeException -> L3c java.lang.Exception -> L44
            L44:
                net.bytebuddy.dynamic.ClassFileLocator$Resolution$Illegal r0 = new net.bytebuddy.dynamic.ClassFileLocator$Resolution$Illegal
                r0.<init>(r5)
                return r0
            L4a:
                throw r5
        }
    }

    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
    public static class ForJarFile implements net.bytebuddy.dynamic.ClassFileLocator {
        private static final java.util.List<java.lang.String> RUNTIME_LOCATIONS = null;
        private final java.util.jar.JarFile jarFile;

        static {
                java.lang.String r0 = "../lib/rt.jar"
                java.lang.String r1 = "../Classes/classes.jar"
                java.lang.String r2 = "lib/rt.jar"
                java.lang.String[] r0 = new java.lang.String[]{r2, r0, r1}
                java.util.List r0 = java.util.Arrays.asList(r0)
                net.bytebuddy.dynamic.ClassFileLocator.ForJarFile.RUNTIME_LOCATIONS = r0
                return
        }

        public ForJarFile(java.util.jar.JarFile r1) {
                r0 = this;
                r0.<init>()
                r0.jarFile = r1
                return
        }

        public static net.bytebuddy.dynamic.ClassFileLocator of(java.io.File r2) throws java.io.IOException {
                net.bytebuddy.dynamic.ClassFileLocator$ForJarFile r0 = new net.bytebuddy.dynamic.ClassFileLocator$ForJarFile
                java.util.jar.JarFile r1 = new java.util.jar.JarFile
                r1.<init>(r2)
                r0.<init>(r1)
                return r0
        }

        public static net.bytebuddy.dynamic.ClassFileLocator ofClassPath() throws java.io.IOException {
                java.lang.String r0 = "java.class.path"
                java.lang.String r0 = java.lang.System.getProperty(r0)
                net.bytebuddy.dynamic.ClassFileLocator r0 = ofClassPath(r0)
                return r0
        }

        public static net.bytebuddy.dynamic.ClassFileLocator ofClassPath(java.lang.String r5) throws java.io.IOException {
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                java.lang.String r1 = "path.separator"
                java.lang.String r1 = java.lang.System.getProperty(r1)
                r2 = 16
                java.util.regex.Pattern r1 = java.util.regex.Pattern.compile(r1, r2)
                java.lang.String[] r5 = r1.split(r5)
                int r1 = r5.length
                r2 = 0
            L17:
                if (r2 >= r1) goto L3f
                r3 = r5[r2]
                java.io.File r4 = new java.io.File
                r4.<init>(r3)
                boolean r3 = r4.isDirectory()
                if (r3 == 0) goto L2f
                net.bytebuddy.dynamic.ClassFileLocator$ForFolder r3 = new net.bytebuddy.dynamic.ClassFileLocator$ForFolder
                r3.<init>(r4)
                r0.add(r3)
                goto L3c
            L2f:
                boolean r3 = r4.isFile()
                if (r3 == 0) goto L3c
                net.bytebuddy.dynamic.ClassFileLocator r3 = of(r4)
                r0.add(r3)
            L3c:
                int r2 = r2 + 1
                goto L17
            L3f:
                net.bytebuddy.dynamic.ClassFileLocator$Compound r5 = new net.bytebuddy.dynamic.ClassFileLocator$Compound
                r5.<init>(r0)
                return r5
        }

        public static net.bytebuddy.dynamic.ClassFileLocator ofRuntimeJar() throws java.io.IOException {
                java.lang.String r0 = "java.home"
                java.lang.String r0 = java.lang.System.getProperty(r0)
                r1 = 92
                r2 = 47
                java.lang.String r0 = r0.replace(r1, r2)
                java.util.List<java.lang.String> r1 = net.bytebuddy.dynamic.ClassFileLocator.ForJarFile.RUNTIME_LOCATIONS
                java.util.Iterator r1 = r1.iterator()
            L14:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L2c
                java.lang.Object r2 = r1.next()
                java.lang.String r2 = (java.lang.String) r2
                java.io.File r3 = new java.io.File
                r3.<init>(r0, r2)
                boolean r2 = r3.isFile()
                if (r2 == 0) goto L14
                goto L2d
            L2c:
                r3 = 0
            L2d:
                if (r3 == 0) goto L34
                net.bytebuddy.dynamic.ClassFileLocator r0 = of(r3)
                return r0
            L34:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Runtime jar does not exist in "
                r2.append(r3)
                r2.append(r0)
                java.lang.String r0 = " for any of "
                r2.append(r0)
                java.util.List<java.lang.String> r0 = net.bytebuddy.dynamic.ClassFileLocator.ForJarFile.RUNTIME_LOCATIONS
                r2.append(r0)
                java.lang.String r0 = r2.toString()
                r1.<init>(r0)
                throw r1
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws java.io.IOException {
                r1 = this;
                java.util.jar.JarFile r0 = r1.jarFile
                r0.close()
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
                java.util.jar.JarFile r2 = r4.jarFile
                net.bytebuddy.dynamic.ClassFileLocator$ForJarFile r5 = (net.bytebuddy.dynamic.ClassFileLocator.ForJarFile) r5
                java.util.jar.JarFile r5 = r5.jarFile
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
                java.util.jar.JarFile r1 = r2.jarFile
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                return r0
        }

        @Override // net.bytebuddy.dynamic.ClassFileLocator
        public net.bytebuddy.dynamic.ClassFileLocator.Resolution locate(java.lang.String r5) throws java.io.IOException {
                r4 = this;
                java.util.jar.JarFile r0 = r4.jarFile
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r2 = 46
                r3 = 47
                java.lang.String r2 = r5.replace(r2, r3)
                r1.append(r2)
                java.lang.String r2 = ".class"
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                java.util.zip.ZipEntry r0 = r0.getEntry(r1)
                if (r0 != 0) goto L27
                net.bytebuddy.dynamic.ClassFileLocator$Resolution$Illegal r0 = new net.bytebuddy.dynamic.ClassFileLocator$Resolution$Illegal
                r0.<init>(r5)
                return r0
            L27:
                java.util.jar.JarFile r5 = r4.jarFile
                java.io.InputStream r5 = r5.getInputStream(r0)
                net.bytebuddy.dynamic.ClassFileLocator$Resolution$Explicit r0 = new net.bytebuddy.dynamic.ClassFileLocator$Resolution$Explicit     // Catch: java.lang.Throwable -> L3c
                net.bytebuddy.utility.StreamDrainer r1 = net.bytebuddy.utility.StreamDrainer.DEFAULT     // Catch: java.lang.Throwable -> L3c
                byte[] r1 = r1.drain(r5)     // Catch: java.lang.Throwable -> L3c
                r0.<init>(r1)     // Catch: java.lang.Throwable -> L3c
                r5.close()
                return r0
            L3c:
                r0 = move-exception
                r5.close()
                throw r0
        }
    }

    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
    public static class ForModule implements net.bytebuddy.dynamic.ClassFileLocator {
        private static final java.lang.Object[] NO_ARGUMENT = null;
        private final net.bytebuddy.utility.JavaModule module;

        public static class WeaklyReferenced extends java.lang.ref.WeakReference<java.lang.Object> implements net.bytebuddy.dynamic.ClassFileLocator {
            private final int hashCode;

            public WeaklyReferenced(java.lang.Object r1) {
                    r0 = this;
                    r0.<init>(r1)
                    int r1 = java.lang.System.identityHashCode(r1)
                    r0.hashCode = r1
                    return
            }

            public static net.bytebuddy.dynamic.ClassFileLocator of(net.bytebuddy.utility.JavaModule r2) {
                    boolean r0 = r2.isNamed()
                    if (r0 == 0) goto L35
                    java.lang.ClassLoader r0 = r2.getClassLoader()
                    if (r0 == 0) goto L2f
                    java.lang.ClassLoader r0 = r2.getClassLoader()
                    java.lang.ClassLoader r1 = java.lang.ClassLoader.getSystemClassLoader()
                    if (r0 == r1) goto L2f
                    java.lang.ClassLoader r0 = r2.getClassLoader()
                    java.lang.ClassLoader r1 = java.lang.ClassLoader.getSystemClassLoader()
                    java.lang.ClassLoader r1 = r1.getParent()
                    if (r0 != r1) goto L25
                    goto L2f
                L25:
                    net.bytebuddy.dynamic.ClassFileLocator$ForModule$WeaklyReferenced r0 = new net.bytebuddy.dynamic.ClassFileLocator$ForModule$WeaklyReferenced
                    java.lang.Object r2 = r2.unwrap()
                    r0.<init>(r2)
                    goto L34
                L2f:
                    net.bytebuddy.dynamic.ClassFileLocator$ForModule r0 = new net.bytebuddy.dynamic.ClassFileLocator$ForModule
                    r0.<init>(r2)
                L34:
                    return r0
                L35:
                    java.lang.ClassLoader r2 = r2.getClassLoader()
                    net.bytebuddy.dynamic.ClassFileLocator r2 = net.bytebuddy.dynamic.ClassFileLocator.ForClassLoader.WeaklyReferenced.of(r2)
                    return r2
            }

            @Override // java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                    r0 = this;
                    return
            }

            public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r5) {
                    r4 = this;
                    r0 = 1
                    if (r4 != r5) goto L4
                    return r0
                L4:
                    r1 = 0
                    if (r5 == 0) goto L23
                    java.lang.Class r2 = r4.getClass()
                    java.lang.Class r3 = r5.getClass()
                    if (r2 == r3) goto L12
                    goto L23
                L12:
                    net.bytebuddy.dynamic.ClassFileLocator$ForModule$WeaklyReferenced r5 = (net.bytebuddy.dynamic.ClassFileLocator.ForModule.WeaklyReferenced) r5
                    java.lang.Object r5 = r5.get()
                    if (r5 == 0) goto L21
                    java.lang.Object r2 = r4.get()
                    if (r2 != r5) goto L21
                    goto L22
                L21:
                    r0 = r1
                L22:
                    return r0
                L23:
                    return r1
            }

            public int hashCode() {
                    r1 = this;
                    int r0 = r1.hashCode
                    return r0
            }

            @Override // net.bytebuddy.dynamic.ClassFileLocator
            public net.bytebuddy.dynamic.ClassFileLocator.Resolution locate(java.lang.String r2) throws java.io.IOException {
                    r1 = this;
                    java.lang.Object r0 = r1.get()
                    if (r0 != 0) goto Lc
                    net.bytebuddy.dynamic.ClassFileLocator$Resolution$Illegal r0 = new net.bytebuddy.dynamic.ClassFileLocator$Resolution$Illegal
                    r0.<init>(r2)
                    goto L14
                Lc:
                    net.bytebuddy.utility.JavaModule r0 = net.bytebuddy.utility.JavaModule.of(r0)
                    net.bytebuddy.dynamic.ClassFileLocator$Resolution r0 = net.bytebuddy.dynamic.ClassFileLocator.ForModule.locate(r0, r2)
                L14:
                    return r0
            }
        }

        static {
                r0 = 0
                java.lang.Object[] r0 = new java.lang.Object[r0]
                net.bytebuddy.dynamic.ClassFileLocator.ForModule.NO_ARGUMENT = r0
                return
        }

        public ForModule(net.bytebuddy.utility.JavaModule r1) {
                r0 = this;
                r0.<init>()
                r0.module = r1
                return
        }

        public static net.bytebuddy.dynamic.ClassFileLocator.Resolution locate(net.bytebuddy.utility.JavaModule r3, java.lang.String r4) throws java.io.IOException {
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r1 = 46
                r2 = 47
                java.lang.String r1 = r4.replace(r1, r2)
                r0.append(r1)
                java.lang.String r1 = ".class"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                java.io.InputStream r3 = r3.getResourceAsStream(r0)
                if (r3 == 0) goto L33
                net.bytebuddy.dynamic.ClassFileLocator$Resolution$Explicit r4 = new net.bytebuddy.dynamic.ClassFileLocator$Resolution$Explicit     // Catch: java.lang.Throwable -> L2e
                net.bytebuddy.utility.StreamDrainer r0 = net.bytebuddy.utility.StreamDrainer.DEFAULT     // Catch: java.lang.Throwable -> L2e
                byte[] r0 = r0.drain(r3)     // Catch: java.lang.Throwable -> L2e
                r4.<init>(r0)     // Catch: java.lang.Throwable -> L2e
                r3.close()
                return r4
            L2e:
                r4 = move-exception
                r3.close()
                throw r4
            L33:
                net.bytebuddy.dynamic.ClassFileLocator$Resolution$Illegal r3 = new net.bytebuddy.dynamic.ClassFileLocator$Resolution$Illegal
                r3.<init>(r4)
                return r3
        }

        public static net.bytebuddy.dynamic.ClassFileLocator of(net.bytebuddy.utility.JavaModule r1) {
                boolean r0 = r1.isNamed()
                if (r0 == 0) goto Lc
                net.bytebuddy.dynamic.ClassFileLocator$ForModule r0 = new net.bytebuddy.dynamic.ClassFileLocator$ForModule
                r0.<init>(r1)
                goto L14
            Lc:
                java.lang.ClassLoader r1 = r1.getClassLoader()
                net.bytebuddy.dynamic.ClassFileLocator r0 = net.bytebuddy.dynamic.ClassFileLocator.ForClassLoader.of(r1)
            L14:
                return r0
        }

        @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "Exception should always be wrapped for clarity", value = {"REC_CATCH_EXCEPTION"})
        public static net.bytebuddy.dynamic.ClassFileLocator ofBootLayer() {
                java.util.HashMap r0 = new java.util.HashMap     // Catch: java.lang.Exception -> L60
                r0.<init>()     // Catch: java.lang.Exception -> L60
                java.lang.String r1 = "java.lang.ModuleLayer"
                java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Exception -> L60
                net.bytebuddy.utility.JavaType r2 = net.bytebuddy.utility.JavaType.MODULE     // Catch: java.lang.Exception -> L60
                java.lang.Class r2 = r2.load()     // Catch: java.lang.Exception -> L60
                java.lang.String r3 = "getPackages"
                r4 = 0
                java.lang.reflect.Method r2 = r2.getMethod(r3, r4)     // Catch: java.lang.Exception -> L60
                java.lang.String r3 = "modules"
                java.lang.reflect.Method r3 = r1.getMethod(r3, r4)     // Catch: java.lang.Exception -> L60
                java.lang.String r5 = "boot"
                java.lang.reflect.Method r1 = r1.getMethod(r5, r4)     // Catch: java.lang.Exception -> L60
                java.lang.Object r1 = r1.invoke(r4, r4)     // Catch: java.lang.Exception -> L60
                java.lang.Object r1 = r3.invoke(r1, r4)     // Catch: java.lang.Exception -> L60
                java.util.Set r1 = (java.util.Set) r1     // Catch: java.lang.Exception -> L60
                java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Exception -> L60
            L32:
                boolean r3 = r1.hasNext()     // Catch: java.lang.Exception -> L60
                if (r3 == 0) goto L62
                java.lang.Object r3 = r1.next()     // Catch: java.lang.Exception -> L60
                net.bytebuddy.utility.JavaModule r4 = net.bytebuddy.utility.JavaModule.of(r3)     // Catch: java.lang.Exception -> L60
                net.bytebuddy.dynamic.ClassFileLocator r4 = of(r4)     // Catch: java.lang.Exception -> L60
                java.lang.Object[] r5 = net.bytebuddy.dynamic.ClassFileLocator.ForModule.NO_ARGUMENT     // Catch: java.lang.Exception -> L60
                java.lang.Object r3 = r2.invoke(r3, r5)     // Catch: java.lang.Exception -> L60
                java.util.Set r3 = (java.util.Set) r3     // Catch: java.lang.Exception -> L60
                java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Exception -> L60
            L50:
                boolean r5 = r3.hasNext()     // Catch: java.lang.Exception -> L60
                if (r5 == 0) goto L32
                java.lang.Object r5 = r3.next()     // Catch: java.lang.Exception -> L60
                java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Exception -> L60
                r0.put(r5, r4)     // Catch: java.lang.Exception -> L60
                goto L50
            L60:
                r0 = move-exception
                goto L68
            L62:
                net.bytebuddy.dynamic.ClassFileLocator$PackageDiscriminating r1 = new net.bytebuddy.dynamic.ClassFileLocator$PackageDiscriminating     // Catch: java.lang.Exception -> L60
                r1.<init>(r0)     // Catch: java.lang.Exception -> L60
                return r1
            L68:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "Cannot process boot layer"
                r1.<init>(r2, r0)
                throw r1
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
                r0 = this;
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
                net.bytebuddy.utility.JavaModule r2 = r4.module
                net.bytebuddy.dynamic.ClassFileLocator$ForModule r5 = (net.bytebuddy.dynamic.ClassFileLocator.ForModule) r5
                net.bytebuddy.utility.JavaModule r5 = r5.module
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
                net.bytebuddy.utility.JavaModule r1 = r2.module
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                return r0
        }

        @Override // net.bytebuddy.dynamic.ClassFileLocator
        public net.bytebuddy.dynamic.ClassFileLocator.Resolution locate(java.lang.String r2) throws java.io.IOException {
                r1 = this;
                net.bytebuddy.utility.JavaModule r0 = r1.module
                net.bytebuddy.dynamic.ClassFileLocator$Resolution r2 = locate(r0, r2)
                return r2
        }
    }

    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
    public static class ForModuleFile implements net.bytebuddy.dynamic.ClassFileLocator {
        private static final java.util.List<java.lang.String> BOOT_LOCATIONS = null;
        private static final java.lang.String JMOD_FILE_EXTENSION = ".jmod";
        private final java.util.zip.ZipFile zipFile;

        static {
                java.lang.String r0 = "../jmods"
                java.lang.String r1 = "modules"
                java.lang.String r2 = "jmods"
                java.lang.String[] r0 = new java.lang.String[]{r2, r0, r1}
                java.util.List r0 = java.util.Arrays.asList(r0)
                net.bytebuddy.dynamic.ClassFileLocator.ForModuleFile.BOOT_LOCATIONS = r0
                return
        }

        public ForModuleFile(java.util.zip.ZipFile r1) {
                r0 = this;
                r0.<init>()
                r0.zipFile = r1
                return
        }

        public static net.bytebuddy.dynamic.ClassFileLocator of(java.io.File r2) throws java.io.IOException {
                net.bytebuddy.dynamic.ClassFileLocator$ForModuleFile r0 = new net.bytebuddy.dynamic.ClassFileLocator$ForModuleFile
                java.util.zip.ZipFile r1 = new java.util.zip.ZipFile
                r1.<init>(r2)
                r0.<init>(r1)
                return r0
        }

        public static net.bytebuddy.dynamic.ClassFileLocator ofBootPath() throws java.io.IOException {
                java.lang.String r0 = "java.home"
                java.lang.String r0 = java.lang.System.getProperty(r0)
                r1 = 92
                r2 = 47
                java.lang.String r0 = r0.replace(r1, r2)
                java.util.List<java.lang.String> r1 = net.bytebuddy.dynamic.ClassFileLocator.ForModuleFile.BOOT_LOCATIONS
                java.util.Iterator r1 = r1.iterator()
            L14:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L2c
                java.lang.Object r2 = r1.next()
                java.lang.String r2 = (java.lang.String) r2
                java.io.File r3 = new java.io.File
                r3.<init>(r0, r2)
                boolean r2 = r3.isDirectory()
                if (r2 == 0) goto L14
                goto L2d
            L2c:
                r3 = 0
            L2d:
                if (r3 == 0) goto L34
                net.bytebuddy.dynamic.ClassFileLocator r0 = ofBootPath(r3)
                return r0
            L34:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Boot modules do not exist in "
                r2.append(r3)
                r2.append(r0)
                java.lang.String r0 = " for any of "
                r2.append(r0)
                java.util.List<java.lang.String> r0 = net.bytebuddy.dynamic.ClassFileLocator.ForModuleFile.BOOT_LOCATIONS
                r2.append(r0)
                java.lang.String r0 = r2.toString()
                r1.<init>(r0)
                throw r1
        }

        public static net.bytebuddy.dynamic.ClassFileLocator ofBootPath(java.io.File r5) throws java.io.IOException {
                java.io.File[] r5 = r5.listFiles()
                if (r5 != 0) goto L9
                net.bytebuddy.dynamic.ClassFileLocator$NoOp r5 = net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE
                return r5
            L9:
                java.util.ArrayList r0 = new java.util.ArrayList
                int r1 = r5.length
                r0.<init>(r1)
                int r1 = r5.length
                r2 = 0
            L11:
                if (r2 >= r1) goto L34
                r3 = r5[r2]
                boolean r4 = r3.isFile()
                if (r4 == 0) goto L23
                net.bytebuddy.dynamic.ClassFileLocator r3 = of(r3)
                r0.add(r3)
                goto L31
            L23:
                boolean r4 = r3.isDirectory()
                if (r4 == 0) goto L31
                net.bytebuddy.dynamic.ClassFileLocator$ForFolder r4 = new net.bytebuddy.dynamic.ClassFileLocator$ForFolder
                r4.<init>(r3)
                r0.add(r4)
            L31:
                int r2 = r2 + 1
                goto L11
            L34:
                net.bytebuddy.dynamic.ClassFileLocator$Compound r5 = new net.bytebuddy.dynamic.ClassFileLocator$Compound
                r5.<init>(r0)
                return r5
        }

        public static net.bytebuddy.dynamic.ClassFileLocator ofModulePath() throws java.io.IOException {
                java.lang.String r0 = "jdk.module.path"
                java.lang.String r0 = java.lang.System.getProperty(r0)
                if (r0 != 0) goto Lb
                net.bytebuddy.dynamic.ClassFileLocator$NoOp r0 = net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE
                goto Lf
            Lb:
                net.bytebuddy.dynamic.ClassFileLocator r0 = ofModulePath(r0)
            Lf:
                return r0
        }

        public static net.bytebuddy.dynamic.ClassFileLocator ofModulePath(java.lang.String r1) throws java.io.IOException {
                java.lang.String r0 = "user.dir"
                java.lang.String r0 = java.lang.System.getProperty(r0)
                net.bytebuddy.dynamic.ClassFileLocator r1 = ofModulePath(r1, r0)
                return r1
        }

        public static net.bytebuddy.dynamic.ClassFileLocator ofModulePath(java.lang.String r10, java.lang.String r11) throws java.io.IOException {
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                java.lang.String r1 = "path.separator"
                java.lang.String r1 = java.lang.System.getProperty(r1)
                r2 = 16
                java.util.regex.Pattern r1 = java.util.regex.Pattern.compile(r1, r2)
                java.lang.String[] r10 = r1.split(r10)
                int r1 = r10.length
                r2 = 0
                r3 = r2
            L18:
                if (r3 >= r1) goto L82
                r4 = r10[r3]
                java.io.File r5 = new java.io.File
                r5.<init>(r11, r4)
                boolean r4 = r5.isDirectory()
                java.lang.String r6 = ".jmod"
                if (r4 == 0) goto L63
                java.io.File[] r4 = r5.listFiles()
                if (r4 == 0) goto L7f
                int r5 = r4.length
                r7 = r2
            L31:
                if (r7 >= r5) goto L7f
                r8 = r4[r7]
                boolean r9 = r8.isDirectory()
                if (r9 == 0) goto L44
                net.bytebuddy.dynamic.ClassFileLocator$ForFolder r9 = new net.bytebuddy.dynamic.ClassFileLocator$ForFolder
                r9.<init>(r8)
                r0.add(r9)
                goto L60
            L44:
                boolean r9 = r8.isFile()
                if (r9 == 0) goto L60
                java.lang.String r9 = r8.getName()
                boolean r9 = r9.endsWith(r6)
                if (r9 == 0) goto L59
                net.bytebuddy.dynamic.ClassFileLocator r8 = of(r8)
                goto L5d
            L59:
                net.bytebuddy.dynamic.ClassFileLocator r8 = net.bytebuddy.dynamic.ClassFileLocator.ForJarFile.of(r8)
            L5d:
                r0.add(r8)
            L60:
                int r7 = r7 + 1
                goto L31
            L63:
                boolean r4 = r5.isFile()
                if (r4 == 0) goto L7f
                java.lang.String r4 = r5.getName()
                boolean r4 = r4.endsWith(r6)
                if (r4 == 0) goto L78
                net.bytebuddy.dynamic.ClassFileLocator r4 = of(r5)
                goto L7c
            L78:
                net.bytebuddy.dynamic.ClassFileLocator r4 = net.bytebuddy.dynamic.ClassFileLocator.ForJarFile.of(r5)
            L7c:
                r0.add(r4)
            L7f:
                int r3 = r3 + 1
                goto L18
            L82:
                net.bytebuddy.dynamic.ClassFileLocator$Compound r10 = new net.bytebuddy.dynamic.ClassFileLocator$Compound
                r10.<init>(r0)
                return r10
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws java.io.IOException {
                r1 = this;
                java.util.zip.ZipFile r0 = r1.zipFile
                r0.close()
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
                java.util.zip.ZipFile r2 = r4.zipFile
                net.bytebuddy.dynamic.ClassFileLocator$ForModuleFile r5 = (net.bytebuddy.dynamic.ClassFileLocator.ForModuleFile) r5
                java.util.zip.ZipFile r5 = r5.zipFile
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
                java.util.zip.ZipFile r1 = r2.zipFile
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                return r0
        }

        @Override // net.bytebuddy.dynamic.ClassFileLocator
        public net.bytebuddy.dynamic.ClassFileLocator.Resolution locate(java.lang.String r5) throws java.io.IOException {
                r4 = this;
                java.util.zip.ZipFile r0 = r4.zipFile
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "classes/"
                r1.append(r2)
                r2 = 46
                r3 = 47
                java.lang.String r2 = r5.replace(r2, r3)
                r1.append(r2)
                java.lang.String r2 = ".class"
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                java.util.zip.ZipEntry r0 = r0.getEntry(r1)
                if (r0 != 0) goto L2c
                net.bytebuddy.dynamic.ClassFileLocator$Resolution$Illegal r0 = new net.bytebuddy.dynamic.ClassFileLocator$Resolution$Illegal
                r0.<init>(r5)
                return r0
            L2c:
                java.util.zip.ZipFile r5 = r4.zipFile
                java.io.InputStream r5 = r5.getInputStream(r0)
                net.bytebuddy.dynamic.ClassFileLocator$Resolution$Explicit r0 = new net.bytebuddy.dynamic.ClassFileLocator$Resolution$Explicit     // Catch: java.lang.Throwable -> L41
                net.bytebuddy.utility.StreamDrainer r1 = net.bytebuddy.utility.StreamDrainer.DEFAULT     // Catch: java.lang.Throwable -> L41
                byte[] r1 = r1.drain(r5)     // Catch: java.lang.Throwable -> L41
                r0.<init>(r1)     // Catch: java.lang.Throwable -> L41
                r5.close()
                return r0
            L41:
                r0 = move-exception
                r5.close()
                throw r0
        }
    }

    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
    public static class ForUrl implements net.bytebuddy.dynamic.ClassFileLocator {
        private static final boolean ACCESS_CONTROLLER = false;
        private final java.lang.ClassLoader classLoader;

        @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
        public static class ClassLoaderCreationAction implements java.security.PrivilegedAction<java.lang.ClassLoader> {
            private final java.net.URL[] url;

            public ClassLoaderCreationAction(java.net.URL[] r1) {
                    r0 = this;
                    r0.<init>()
                    r0.url = r1
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
                    java.net.URL[] r2 = r4.url
                    net.bytebuddy.dynamic.ClassFileLocator$ForUrl$ClassLoaderCreationAction r5 = (net.bytebuddy.dynamic.ClassFileLocator.ForUrl.ClassLoaderCreationAction) r5
                    java.net.URL[] r5 = r5.url
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
                    java.net.URL[] r1 = r2.url
                    int r1 = java.util.Arrays.hashCode(r1)
                    int r0 = r0 + r1
                    return r0
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.security.PrivilegedAction
            public java.lang.ClassLoader run() {
                    r3 = this;
                    java.net.URLClassLoader r0 = new java.net.URLClassLoader
                    java.net.URL[] r1 = r3.url
                    java.lang.ClassLoader r2 = net.bytebuddy.dynamic.loading.ClassLoadingStrategy.BOOTSTRAP_LOADER
                    r0.<init>(r1, r2)
                    return r0
            }

            @Override // java.security.PrivilegedAction
            public /* bridge */ /* synthetic */ java.lang.ClassLoader run() {
                    r1 = this;
                    java.lang.ClassLoader r0 = r1.run()
                    return r0
            }
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
                net.bytebuddy.dynamic.ClassFileLocator.ForUrl.ACCESS_CONTROLLER = r1     // Catch: java.lang.SecurityException -> L16 java.lang.ClassNotFoundException -> L17
                goto L19
            L16:
                r0 = 1
            L17:
                net.bytebuddy.dynamic.ClassFileLocator.ForUrl.ACCESS_CONTROLLER = r0
            L19:
                return
        }

        public ForUrl(java.util.Collection<? extends java.net.URL> r2) {
                r1 = this;
                r0 = 0
                java.net.URL[] r0 = new java.net.URL[r0]
                java.lang.Object[] r2 = r2.toArray(r0)
                java.net.URL[] r2 = (java.net.URL[]) r2
                r1.<init>(r2)
                return
        }

        public ForUrl(java.net.URL... r2) {
                r1 = this;
                r1.<init>()
                net.bytebuddy.dynamic.ClassFileLocator$ForUrl$ClassLoaderCreationAction r0 = new net.bytebuddy.dynamic.ClassFileLocator$ForUrl$ClassLoaderCreationAction
                r0.<init>(r2)
                java.lang.Object r2 = doPrivileged(r0)
                java.lang.ClassLoader r2 = (java.lang.ClassLoader) r2
                r1.classLoader = r2
                return
        }

        @net.bytebuddy.build.AccessControllerPlugin.Enhance
        private static <T> T doPrivileged(java.security.PrivilegedAction<T> r1) {
                boolean r0 = net.bytebuddy.dynamic.ClassFileLocator.ForUrl.ACCESS_CONTROLLER
                if (r0 == 0) goto L9
                java.lang.Object r1 = java.security.AccessController.doPrivileged(r1)
                return r1
            L9:
                java.lang.Object r1 = r1.run()
                return r1
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws java.io.IOException {
                r2 = this;
                java.lang.ClassLoader r0 = r2.classLoader
                boolean r1 = r0 instanceof java.io.Closeable
                if (r1 == 0) goto Lb
                java.io.Closeable r0 = (java.io.Closeable) r0
                r0.close()
            Lb:
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
                java.lang.ClassLoader r2 = r4.classLoader
                net.bytebuddy.dynamic.ClassFileLocator$ForUrl r5 = (net.bytebuddy.dynamic.ClassFileLocator.ForUrl) r5
                java.lang.ClassLoader r5 = r5.classLoader
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
                java.lang.ClassLoader r1 = r2.classLoader
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                return r0
        }

        @Override // net.bytebuddy.dynamic.ClassFileLocator
        public net.bytebuddy.dynamic.ClassFileLocator.Resolution locate(java.lang.String r2) throws java.io.IOException {
                r1 = this;
                java.lang.ClassLoader r0 = r1.classLoader
                net.bytebuddy.dynamic.ClassFileLocator$Resolution r2 = net.bytebuddy.dynamic.ClassFileLocator.ForClassLoader.locate(r0, r2)
                return r2
        }
    }

    public enum NoOp extends java.lang.Enum<net.bytebuddy.dynamic.ClassFileLocator.NoOp> implements net.bytebuddy.dynamic.ClassFileLocator {
        private static final /* synthetic */ net.bytebuddy.dynamic.ClassFileLocator.NoOp[] $VALUES = null;
        public static final net.bytebuddy.dynamic.ClassFileLocator.NoOp INSTANCE = null;

        static {
                net.bytebuddy.dynamic.ClassFileLocator$NoOp r0 = new net.bytebuddy.dynamic.ClassFileLocator$NoOp
                java.lang.String r1 = "INSTANCE"
                r2 = 0
                r0.<init>(r1, r2)
                net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE = r0
                net.bytebuddy.dynamic.ClassFileLocator$NoOp[] r0 = new net.bytebuddy.dynamic.ClassFileLocator.NoOp[]{r0}
                net.bytebuddy.dynamic.ClassFileLocator.NoOp.$VALUES = r0
                return
        }

        NoOp(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static net.bytebuddy.dynamic.ClassFileLocator.NoOp valueOf(java.lang.String r1) {
                java.lang.Class<net.bytebuddy.dynamic.ClassFileLocator$NoOp> r0 = net.bytebuddy.dynamic.ClassFileLocator.NoOp.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                net.bytebuddy.dynamic.ClassFileLocator$NoOp r1 = (net.bytebuddy.dynamic.ClassFileLocator.NoOp) r1
                return r1
        }

        public static net.bytebuddy.dynamic.ClassFileLocator.NoOp[] values() {
                net.bytebuddy.dynamic.ClassFileLocator$NoOp[] r0 = net.bytebuddy.dynamic.ClassFileLocator.NoOp.$VALUES
                java.lang.Object r0 = r0.clone()
                net.bytebuddy.dynamic.ClassFileLocator$NoOp[] r0 = (net.bytebuddy.dynamic.ClassFileLocator.NoOp[]) r0
                return r0
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
                r0 = this;
                return
        }

        @Override // net.bytebuddy.dynamic.ClassFileLocator
        public net.bytebuddy.dynamic.ClassFileLocator.Resolution locate(java.lang.String r2) {
                r1 = this;
                net.bytebuddy.dynamic.ClassFileLocator$Resolution$Illegal r0 = new net.bytebuddy.dynamic.ClassFileLocator$Resolution$Illegal
                r0.<init>(r2)
                return r0
        }
    }

    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
    public static class PackageDiscriminating implements net.bytebuddy.dynamic.ClassFileLocator {
        private final java.util.Map<java.lang.String, net.bytebuddy.dynamic.ClassFileLocator> classFileLocators;

        public PackageDiscriminating(java.util.Map<java.lang.String, net.bytebuddy.dynamic.ClassFileLocator> r1) {
                r0 = this;
                r0.<init>()
                r0.classFileLocators = r1
                return
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws java.io.IOException {
                r2 = this;
                java.util.Map<java.lang.String, net.bytebuddy.dynamic.ClassFileLocator> r0 = r2.classFileLocators
                java.util.Collection r0 = r0.values()
                java.util.Iterator r0 = r0.iterator()
            La:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L1a
                java.lang.Object r1 = r0.next()
                net.bytebuddy.dynamic.ClassFileLocator r1 = (net.bytebuddy.dynamic.ClassFileLocator) r1
                r1.close()
                goto La
            L1a:
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
                java.util.Map<java.lang.String, net.bytebuddy.dynamic.ClassFileLocator> r2 = r4.classFileLocators
                net.bytebuddy.dynamic.ClassFileLocator$PackageDiscriminating r5 = (net.bytebuddy.dynamic.ClassFileLocator.PackageDiscriminating) r5
                java.util.Map<java.lang.String, net.bytebuddy.dynamic.ClassFileLocator> r5 = r5.classFileLocators
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
                java.util.Map<java.lang.String, net.bytebuddy.dynamic.ClassFileLocator> r1 = r2.classFileLocators
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                return r0
        }

        @Override // net.bytebuddy.dynamic.ClassFileLocator
        public net.bytebuddy.dynamic.ClassFileLocator.Resolution locate(java.lang.String r4) throws java.io.IOException {
                r3 = this;
                r0 = 46
                int r0 = r4.lastIndexOf(r0)
                java.util.Map<java.lang.String, net.bytebuddy.dynamic.ClassFileLocator> r1 = r3.classFileLocators
                r2 = -1
                if (r0 != r2) goto Le
                java.lang.String r0 = ""
                goto L13
            Le:
                r2 = 0
                java.lang.String r0 = r4.substring(r2, r0)
            L13:
                java.lang.Object r0 = r1.get(r0)
                net.bytebuddy.dynamic.ClassFileLocator r0 = (net.bytebuddy.dynamic.ClassFileLocator) r0
                if (r0 != 0) goto L21
                net.bytebuddy.dynamic.ClassFileLocator$Resolution$Illegal r0 = new net.bytebuddy.dynamic.ClassFileLocator$Resolution$Illegal
                r0.<init>(r4)
                goto L25
            L21:
                net.bytebuddy.dynamic.ClassFileLocator$Resolution r0 = r0.locate(r4)
            L25:
                return r0
        }
    }

    public interface Resolution {

        @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
        public static class Explicit implements net.bytebuddy.dynamic.ClassFileLocator.Resolution {
            private final byte[] binaryRepresentation;

            @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "The array is not modified by class contract.", value = {"EI_EXPOSE_REP2"})
            public Explicit(byte[] r1) {
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
                    net.bytebuddy.dynamic.ClassFileLocator$Resolution$Explicit r5 = (net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit) r5
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

            @Override // net.bytebuddy.dynamic.ClassFileLocator.Resolution
            public boolean isResolved() {
                    r1 = this;
                    r0 = 1
                    return r0
            }

            @Override // net.bytebuddy.dynamic.ClassFileLocator.Resolution
            @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "The array is not modified by class contract.", value = {"EI_EXPOSE_REP"})
            public byte[] resolve() {
                    r1 = this;
                    byte[] r0 = r1.binaryRepresentation
                    return r0
            }
        }

        @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
        public static class Illegal implements net.bytebuddy.dynamic.ClassFileLocator.Resolution {
            private final java.lang.String typeName;

            public Illegal(java.lang.String r1) {
                    r0 = this;
                    r0.<init>()
                    r0.typeName = r1
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
                    java.lang.String r2 = r4.typeName
                    net.bytebuddy.dynamic.ClassFileLocator$Resolution$Illegal r5 = (net.bytebuddy.dynamic.ClassFileLocator.Resolution.Illegal) r5
                    java.lang.String r5 = r5.typeName
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
                    java.lang.String r1 = r2.typeName
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    return r0
            }

            @Override // net.bytebuddy.dynamic.ClassFileLocator.Resolution
            public boolean isResolved() {
                    r1 = this;
                    r0 = 0
                    return r0
            }

            @Override // net.bytebuddy.dynamic.ClassFileLocator.Resolution
            public byte[] resolve() {
                    r3 = this;
                    java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    java.lang.String r2 = "Could not locate class file for "
                    r1.append(r2)
                    java.lang.String r2 = r3.typeName
                    r1.append(r2)
                    java.lang.String r1 = r1.toString()
                    r0.<init>(r1)
                    throw r0
            }
        }

        boolean isResolved();

        byte[] resolve();
    }

    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
    public static class Simple implements net.bytebuddy.dynamic.ClassFileLocator {
        private final java.util.Map<java.lang.String, byte[]> classFiles;

        public Simple(java.util.Map<java.lang.String, byte[]> r1) {
                r0 = this;
                r0.<init>()
                r0.classFiles = r1
                return
        }

        public static net.bytebuddy.dynamic.ClassFileLocator of(java.lang.String r1, byte[] r2) {
                net.bytebuddy.dynamic.ClassFileLocator$Simple r0 = new net.bytebuddy.dynamic.ClassFileLocator$Simple
                java.util.Map r1 = java.util.Collections.singletonMap(r1, r2)
                r0.<init>(r1)
                return r0
        }

        public static net.bytebuddy.dynamic.ClassFileLocator of(java.util.Map<net.bytebuddy.description.type.TypeDescription, byte[]> r3) {
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                java.util.Set r3 = r3.entrySet()
                java.util.Iterator r3 = r3.iterator()
            Ld:
                boolean r1 = r3.hasNext()
                if (r1 == 0) goto L2b
                java.lang.Object r1 = r3.next()
                java.util.Map$Entry r1 = (java.util.Map.Entry) r1
                java.lang.Object r2 = r1.getKey()
                net.bytebuddy.description.type.TypeDescription r2 = (net.bytebuddy.description.type.TypeDescription) r2
                java.lang.String r2 = r2.getName()
                java.lang.Object r1 = r1.getValue()
                r0.put(r2, r1)
                goto Ld
            L2b:
                net.bytebuddy.dynamic.ClassFileLocator$Simple r3 = new net.bytebuddy.dynamic.ClassFileLocator$Simple
                r3.<init>(r0)
                return r3
        }

        public static net.bytebuddy.dynamic.ClassFileLocator of(net.bytebuddy.dynamic.DynamicType r0) {
                java.util.Map r0 = r0.getAllTypes()
                net.bytebuddy.dynamic.ClassFileLocator r0 = of(r0)
                return r0
        }

        public static net.bytebuddy.dynamic.ClassFileLocator ofResources(java.util.Map<java.lang.String, byte[]> r5) {
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                java.util.Set r5 = r5.entrySet()
                java.util.Iterator r5 = r5.iterator()
            Ld:
                boolean r1 = r5.hasNext()
                if (r1 == 0) goto L4e
                java.lang.Object r1 = r5.next()
                java.util.Map$Entry r1 = (java.util.Map.Entry) r1
                java.lang.Object r2 = r1.getKey()
                java.lang.String r2 = (java.lang.String) r2
                java.lang.String r3 = ".class"
                boolean r2 = r2.endsWith(r3)
                if (r2 == 0) goto Ld
                java.lang.Object r2 = r1.getKey()
                java.lang.String r2 = (java.lang.String) r2
                java.lang.Object r3 = r1.getKey()
                java.lang.String r3 = (java.lang.String) r3
                int r3 = r3.length()
                int r3 = r3 + (-6)
                r4 = 0
                java.lang.String r2 = r2.substring(r4, r3)
                r3 = 47
                r4 = 46
                java.lang.String r2 = r2.replace(r3, r4)
                java.lang.Object r1 = r1.getValue()
                r0.put(r2, r1)
                goto Ld
            L4e:
                net.bytebuddy.dynamic.ClassFileLocator$Simple r5 = new net.bytebuddy.dynamic.ClassFileLocator$Simple
                r5.<init>(r0)
                return r5
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
                r0 = this;
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
                java.util.Map<java.lang.String, byte[]> r2 = r4.classFiles
                net.bytebuddy.dynamic.ClassFileLocator$Simple r5 = (net.bytebuddy.dynamic.ClassFileLocator.Simple) r5
                java.util.Map<java.lang.String, byte[]> r5 = r5.classFiles
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
                java.util.Map<java.lang.String, byte[]> r1 = r2.classFiles
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                return r0
        }

        @Override // net.bytebuddy.dynamic.ClassFileLocator
        public net.bytebuddy.dynamic.ClassFileLocator.Resolution locate(java.lang.String r2) {
                r1 = this;
                java.util.Map<java.lang.String, byte[]> r0 = r1.classFiles
                java.lang.Object r0 = r0.get(r2)
                byte[] r0 = (byte[]) r0
                if (r0 != 0) goto L10
                net.bytebuddy.dynamic.ClassFileLocator$Resolution$Illegal r0 = new net.bytebuddy.dynamic.ClassFileLocator$Resolution$Illegal
                r0.<init>(r2)
                goto L16
            L10:
                net.bytebuddy.dynamic.ClassFileLocator$Resolution$Explicit r2 = new net.bytebuddy.dynamic.ClassFileLocator$Resolution$Explicit
                r2.<init>(r0)
                r0 = r2
            L16:
                return r0
        }
    }

    net.bytebuddy.dynamic.ClassFileLocator.Resolution locate(java.lang.String r1) throws java.io.IOException;
}
