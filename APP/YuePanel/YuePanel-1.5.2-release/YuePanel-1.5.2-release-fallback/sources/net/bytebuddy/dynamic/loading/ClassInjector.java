package net.bytebuddy.dynamic.loading;

/* JADX INFO: loaded from: classes2.dex */
public interface ClassInjector {
    public static final boolean ALLOW_EXISTING_TYPES = false;
    public static final java.security.Permission SUPPRESS_ACCESS_CHECKS = null;

    /* JADX INFO: renamed from: net.bytebuddy.dynamic.loading.ClassInjector$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public static abstract class AbstractBase implements net.bytebuddy.dynamic.loading.ClassInjector {
        public AbstractBase() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // net.bytebuddy.dynamic.loading.ClassInjector
        public java.util.Map<net.bytebuddy.description.type.TypeDescription, java.lang.Class<?>> inject(java.util.Map<? extends net.bytebuddy.description.type.TypeDescription, byte[]> r5) {
                r4 = this;
                java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
                r0.<init>()
                java.util.Set r1 = r5.entrySet()
                java.util.Iterator r1 = r1.iterator()
            Ld:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L2b
                java.lang.Object r2 = r1.next()
                java.util.Map$Entry r2 = (java.util.Map.Entry) r2
                java.lang.Object r3 = r2.getKey()
                net.bytebuddy.description.type.TypeDescription r3 = (net.bytebuddy.description.type.TypeDescription) r3
                java.lang.String r3 = r3.getName()
                java.lang.Object r2 = r2.getValue()
                r0.put(r3, r2)
                goto Ld
            L2b:
                java.util.Map r0 = r4.injectRaw(r0)
                java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
                r1.<init>()
                java.util.Set r5 = r5.keySet()
                java.util.Iterator r5 = r5.iterator()
            L3c:
                boolean r2 = r5.hasNext()
                if (r2 == 0) goto L54
                java.lang.Object r2 = r5.next()
                net.bytebuddy.description.type.TypeDescription r2 = (net.bytebuddy.description.type.TypeDescription) r2
                java.lang.String r3 = r2.getName()
                java.lang.Object r3 = r0.get(r3)
                r1.put(r2, r3)
                goto L3c
            L54:
                return r1
        }
    }

    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
    public static class UsingInstrumentation extends net.bytebuddy.dynamic.loading.ClassInjector.AbstractBase {
        private static final boolean ACCESS_CONTROLLER = false;
        private static final java.lang.String CLASS_FILE_EXTENSION = ".class";
        private static final net.bytebuddy.dynamic.loading.ClassInjector.UsingInstrumentation.Dispatcher DISPATCHER = null;
        private static final java.lang.String JAR = "jar";
        private final java.io.File folder;
        private final java.lang.instrument.Instrumentation instrumentation;
        private final net.bytebuddy.utility.RandomString randomString;
        private final net.bytebuddy.dynamic.loading.ClassInjector.UsingInstrumentation.Target target;

        @net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied("java.lang.instrument.Instrumentation")
        public interface Dispatcher {
            @net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied("appendToBootstrapClassLoaderSearch")
            void appendToBootstrapClassLoaderSearch(java.lang.instrument.Instrumentation r1, java.util.jar.JarFile r2);

            @net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied("appendToSystemClassLoaderSearch")
            void appendToSystemClassLoaderSearch(java.lang.instrument.Instrumentation r1, java.util.jar.JarFile r2);

            @net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied("isModifiableModule")
            boolean isModifiableModule(java.lang.instrument.Instrumentation r1, @net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied("java.lang.Module") java.lang.Object r2);

            @net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied("redefineModule")
            void redefineModule(java.lang.instrument.Instrumentation r1, @net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied("java.lang.Module") java.lang.Object r2, java.util.Set<?> r3, java.util.Map<java.lang.String, java.util.Set<?>> r4, java.util.Map<java.lang.String, java.util.Set<?>> r5, java.util.Set<java.lang.Class<?>> r6, java.util.Map<java.lang.Class<?>, java.util.List<java.lang.Class<?>>> r7);
        }

        public enum Target extends java.lang.Enum<net.bytebuddy.dynamic.loading.ClassInjector.UsingInstrumentation.Target> {
            private static final /* synthetic */ net.bytebuddy.dynamic.loading.ClassInjector.UsingInstrumentation.Target[] $VALUES = null;
            public static final net.bytebuddy.dynamic.loading.ClassInjector.UsingInstrumentation.Target BOOTSTRAP = null;
            public static final net.bytebuddy.dynamic.loading.ClassInjector.UsingInstrumentation.Target SYSTEM = null;

            @net.bytebuddy.utility.nullability.MaybeNull
            private final java.lang.ClassLoader classLoader;



            static {
                    net.bytebuddy.dynamic.loading.ClassInjector$UsingInstrumentation$Target$1 r0 = new net.bytebuddy.dynamic.loading.ClassInjector$UsingInstrumentation$Target$1
                    r1 = 0
                    r2 = 0
                    java.lang.String r3 = "BOOTSTRAP"
                    r0.<init>(r3, r1, r2)
                    net.bytebuddy.dynamic.loading.ClassInjector.UsingInstrumentation.Target.BOOTSTRAP = r0
                    net.bytebuddy.dynamic.loading.ClassInjector$UsingInstrumentation$Target$2 r2 = new net.bytebuddy.dynamic.loading.ClassInjector$UsingInstrumentation$Target$2
                    r3 = 1
                    java.lang.ClassLoader r4 = java.lang.ClassLoader.getSystemClassLoader()
                    java.lang.String r5 = "SYSTEM"
                    r2.<init>(r5, r3, r4)
                    net.bytebuddy.dynamic.loading.ClassInjector.UsingInstrumentation.Target.SYSTEM = r2
                    r4 = 2
                    net.bytebuddy.dynamic.loading.ClassInjector$UsingInstrumentation$Target[] r4 = new net.bytebuddy.dynamic.loading.ClassInjector.UsingInstrumentation.Target[r4]
                    r4[r1] = r0
                    r4[r3] = r2
                    net.bytebuddy.dynamic.loading.ClassInjector.UsingInstrumentation.Target.$VALUES = r4
                    return
            }

            Target(@net.bytebuddy.utility.nullability.MaybeNull java.lang.String r1, int r2, java.lang.ClassLoader r3) {
                    r0 = this;
                    r0.<init>(r1, r2)
                    r0.classLoader = r3
                    return
            }

            /* synthetic */ Target(java.lang.String r1, int r2, java.lang.ClassLoader r3, net.bytebuddy.dynamic.loading.ClassInjector.AnonymousClass1 r4) {
                    r0 = this;
                    r0.<init>(r1, r2, r3)
                    return
            }

            public static net.bytebuddy.dynamic.loading.ClassInjector.UsingInstrumentation.Target valueOf(java.lang.String r1) {
                    java.lang.Class<net.bytebuddy.dynamic.loading.ClassInjector$UsingInstrumentation$Target> r0 = net.bytebuddy.dynamic.loading.ClassInjector.UsingInstrumentation.Target.class
                    java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                    net.bytebuddy.dynamic.loading.ClassInjector$UsingInstrumentation$Target r1 = (net.bytebuddy.dynamic.loading.ClassInjector.UsingInstrumentation.Target) r1
                    return r1
            }

            public static net.bytebuddy.dynamic.loading.ClassInjector.UsingInstrumentation.Target[] values() {
                    net.bytebuddy.dynamic.loading.ClassInjector$UsingInstrumentation$Target[] r0 = net.bytebuddy.dynamic.loading.ClassInjector.UsingInstrumentation.Target.$VALUES
                    java.lang.Object r0 = r0.clone()
                    net.bytebuddy.dynamic.loading.ClassInjector$UsingInstrumentation$Target[] r0 = (net.bytebuddy.dynamic.loading.ClassInjector.UsingInstrumentation.Target[]) r0
                    return r0
            }

            @net.bytebuddy.utility.nullability.MaybeNull
            public java.lang.ClassLoader getClassLoader() {
                    r1 = this;
                    java.lang.ClassLoader r0 = r1.classLoader
                    return r0
            }

            public abstract void inject(java.lang.instrument.Instrumentation r1, java.util.jar.JarFile r2);
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
                net.bytebuddy.dynamic.loading.ClassInjector.UsingInstrumentation.ACCESS_CONTROLLER = r1     // Catch: java.lang.SecurityException -> L16 java.lang.ClassNotFoundException -> L17
                goto L19
            L16:
                r0 = 1
            L17:
                net.bytebuddy.dynamic.loading.ClassInjector.UsingInstrumentation.ACCESS_CONTROLLER = r0
            L19:
                java.lang.Class<net.bytebuddy.dynamic.loading.ClassInjector$UsingInstrumentation$Dispatcher> r0 = net.bytebuddy.dynamic.loading.ClassInjector.UsingInstrumentation.Dispatcher.class
                java.security.PrivilegedAction r0 = net.bytebuddy.utility.dispatcher.JavaDispatcher.of(r0)
                java.lang.Object r0 = doPrivileged(r0)
                net.bytebuddy.dynamic.loading.ClassInjector$UsingInstrumentation$Dispatcher r0 = (net.bytebuddy.dynamic.loading.ClassInjector.UsingInstrumentation.Dispatcher) r0
                net.bytebuddy.dynamic.loading.ClassInjector.UsingInstrumentation.DISPATCHER = r0
                return
        }

        public UsingInstrumentation(java.io.File r1, net.bytebuddy.dynamic.loading.ClassInjector.UsingInstrumentation.Target r2, java.lang.instrument.Instrumentation r3, net.bytebuddy.utility.RandomString r4) {
                r0 = this;
                r0.<init>()
                r0.folder = r1
                r0.target = r2
                r0.instrumentation = r3
                r0.randomString = r4
                return
        }

        public static /* synthetic */ net.bytebuddy.dynamic.loading.ClassInjector.UsingInstrumentation.Dispatcher access$600() {
                net.bytebuddy.dynamic.loading.ClassInjector$UsingInstrumentation$Dispatcher r0 = net.bytebuddy.dynamic.loading.ClassInjector.UsingInstrumentation.DISPATCHER
                return r0
        }

        @net.bytebuddy.build.AccessControllerPlugin.Enhance
        private static <T> T doPrivileged(java.security.PrivilegedAction<T> r1) {
                boolean r0 = net.bytebuddy.dynamic.loading.ClassInjector.UsingInstrumentation.ACCESS_CONTROLLER
                if (r0 == 0) goto L9
                java.lang.Object r1 = java.security.AccessController.doPrivileged(r1)
                return r1
            L9:
                java.lang.Object r1 = r1.run()
                return r1
        }

        public static boolean isAvailable() {
                net.bytebuddy.ClassFileVersion r0 = net.bytebuddy.ClassFileVersion.JAVA_V5
                net.bytebuddy.ClassFileVersion r0 = net.bytebuddy.ClassFileVersion.ofThisVm(r0)
                net.bytebuddy.ClassFileVersion r1 = net.bytebuddy.ClassFileVersion.JAVA_V6
                boolean r0 = r0.isAtLeast(r1)
                return r0
        }

        public static net.bytebuddy.dynamic.loading.ClassInjector of(java.io.File r2, net.bytebuddy.dynamic.loading.ClassInjector.UsingInstrumentation.Target r3, java.lang.instrument.Instrumentation r4) {
                net.bytebuddy.dynamic.loading.ClassInjector$UsingInstrumentation r0 = new net.bytebuddy.dynamic.loading.ClassInjector$UsingInstrumentation
                net.bytebuddy.utility.RandomString r1 = new net.bytebuddy.utility.RandomString
                r1.<init>()
                r0.<init>(r2, r3, r4, r1)
                return r0
        }

        public static void redefineModule(java.lang.instrument.Instrumentation r9, net.bytebuddy.utility.JavaModule r10, java.util.Set<net.bytebuddy.utility.JavaModule> r11, java.util.Map<java.lang.String, java.util.Set<net.bytebuddy.utility.JavaModule>> r12, java.util.Map<java.lang.String, java.util.Set<net.bytebuddy.utility.JavaModule>> r13, java.util.Set<java.lang.Class<?>> r14, java.util.Map<java.lang.Class<?>, java.util.List<java.lang.Class<?>>> r15) {
                net.bytebuddy.dynamic.loading.ClassInjector$UsingInstrumentation$Dispatcher r0 = net.bytebuddy.dynamic.loading.ClassInjector.UsingInstrumentation.DISPATCHER
                java.lang.Object r1 = r10.unwrap()
                boolean r0 = r0.isModifiableModule(r9, r1)
                if (r0 == 0) goto Lbe
                java.util.HashSet r4 = new java.util.HashSet
                r4.<init>()
                java.util.Iterator r11 = r11.iterator()
            L15:
                boolean r0 = r11.hasNext()
                if (r0 == 0) goto L29
                java.lang.Object r0 = r11.next()
                net.bytebuddy.utility.JavaModule r0 = (net.bytebuddy.utility.JavaModule) r0
                java.lang.Object r0 = r0.unwrap()
                r4.add(r0)
                goto L15
            L29:
                java.util.HashMap r5 = new java.util.HashMap
                r5.<init>()
                java.util.Set r11 = r12.entrySet()
                java.util.Iterator r11 = r11.iterator()
            L36:
                boolean r12 = r11.hasNext()
                if (r12 == 0) goto L6d
                java.lang.Object r12 = r11.next()
                java.util.Map$Entry r12 = (java.util.Map.Entry) r12
                java.util.HashSet r0 = new java.util.HashSet
                r0.<init>()
                java.lang.Object r1 = r12.getValue()
                java.util.Set r1 = (java.util.Set) r1
                java.util.Iterator r1 = r1.iterator()
            L51:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L65
                java.lang.Object r2 = r1.next()
                net.bytebuddy.utility.JavaModule r2 = (net.bytebuddy.utility.JavaModule) r2
                java.lang.Object r2 = r2.unwrap()
                r0.add(r2)
                goto L51
            L65:
                java.lang.Object r12 = r12.getKey()
                r5.put(r12, r0)
                goto L36
            L6d:
                java.util.HashMap r6 = new java.util.HashMap
                r6.<init>()
                java.util.Set r11 = r13.entrySet()
                java.util.Iterator r11 = r11.iterator()
            L7a:
                boolean r12 = r11.hasNext()
                if (r12 == 0) goto Lb1
                java.lang.Object r12 = r11.next()
                java.util.Map$Entry r12 = (java.util.Map.Entry) r12
                java.util.HashSet r13 = new java.util.HashSet
                r13.<init>()
                java.lang.Object r0 = r12.getValue()
                java.util.Set r0 = (java.util.Set) r0
                java.util.Iterator r0 = r0.iterator()
            L95:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto La9
                java.lang.Object r1 = r0.next()
                net.bytebuddy.utility.JavaModule r1 = (net.bytebuddy.utility.JavaModule) r1
                java.lang.Object r1 = r1.unwrap()
                r13.add(r1)
                goto L95
            La9:
                java.lang.Object r12 = r12.getKey()
                r6.put(r12, r13)
                goto L7a
            Lb1:
                net.bytebuddy.dynamic.loading.ClassInjector$UsingInstrumentation$Dispatcher r1 = net.bytebuddy.dynamic.loading.ClassInjector.UsingInstrumentation.DISPATCHER
                java.lang.Object r3 = r10.unwrap()
                r2 = r9
                r7 = r14
                r8 = r15
                r1.redefineModule(r2, r3, r4, r5, r6, r7, r8)
                return
            Lbe:
                java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r11 = new java.lang.StringBuilder
                r11.<init>()
                java.lang.String r12 = "Cannot modify module: "
                r11.append(r12)
                r11.append(r10)
                java.lang.String r10 = r11.toString()
                r9.<init>(r10)
                throw r9
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
                net.bytebuddy.dynamic.loading.ClassInjector$UsingInstrumentation$Target r2 = r4.target
                net.bytebuddy.dynamic.loading.ClassInjector$UsingInstrumentation r5 = (net.bytebuddy.dynamic.loading.ClassInjector.UsingInstrumentation) r5
                net.bytebuddy.dynamic.loading.ClassInjector$UsingInstrumentation$Target r3 = r5.target
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
                java.io.File r2 = r4.folder
                java.io.File r3 = r5.folder
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L36
                return r1
            L36:
                net.bytebuddy.utility.RandomString r2 = r4.randomString
                net.bytebuddy.utility.RandomString r5 = r5.randomString
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
                net.bytebuddy.dynamic.loading.ClassInjector$UsingInstrumentation$Target r1 = r2.target
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                int r0 = r0 * 31
                java.io.File r1 = r2.folder
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                int r0 = r0 * 31
                net.bytebuddy.utility.RandomString r1 = r2.randomString
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                return r0
        }

        @Override // net.bytebuddy.dynamic.loading.ClassInjector
        public java.util.Map<java.lang.String, java.lang.Class<?>> injectRaw(java.util.Map<? extends java.lang.String, byte[]> r10) {
                r9 = this;
                java.io.File r0 = new java.io.File
                java.io.File r1 = r9.folder
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "jar"
                r2.append(r3)
                net.bytebuddy.utility.RandomString r4 = r9.randomString
                java.lang.String r4 = r4.nextString()
                r2.append(r4)
                java.lang.String r4 = "."
                r2.append(r4)
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                r0.<init>(r1, r2)
                boolean r1 = r0.createNewFile()     // Catch: java.lang.ClassNotFoundException -> Lc3 java.io.IOException -> Lc5
                if (r1 == 0) goto Ldb
                java.util.jar.JarOutputStream r1 = new java.util.jar.JarOutputStream     // Catch: java.lang.Throwable -> Lb7
                java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> Lb7
                r2.<init>(r0)     // Catch: java.lang.Throwable -> Lb7
                r1.<init>(r2)     // Catch: java.lang.Throwable -> Lb7
                java.util.Set r2 = r10.entrySet()     // Catch: java.lang.Throwable -> L7b
                java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L7b
            L3e:
                boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L7b
                if (r3 == 0) goto L7d
                java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L7b
                java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch: java.lang.Throwable -> L7b
                java.util.jar.JarEntry r4 = new java.util.jar.JarEntry     // Catch: java.lang.Throwable -> L7b
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7b
                r5.<init>()     // Catch: java.lang.Throwable -> L7b
                java.lang.Object r6 = r3.getKey()     // Catch: java.lang.Throwable -> L7b
                java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Throwable -> L7b
                r7 = 46
                r8 = 47
                java.lang.String r6 = r6.replace(r7, r8)     // Catch: java.lang.Throwable -> L7b
                r5.append(r6)     // Catch: java.lang.Throwable -> L7b
                java.lang.String r6 = ".class"
                r5.append(r6)     // Catch: java.lang.Throwable -> L7b
                java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L7b
                r4.<init>(r5)     // Catch: java.lang.Throwable -> L7b
                r1.putNextEntry(r4)     // Catch: java.lang.Throwable -> L7b
                java.lang.Object r3 = r3.getValue()     // Catch: java.lang.Throwable -> L7b
                byte[] r3 = (byte[]) r3     // Catch: java.lang.Throwable -> L7b
                r1.write(r3)     // Catch: java.lang.Throwable -> L7b
                goto L3e
            L7b:
                r10 = move-exception
                goto Lcd
            L7d:
                r1.close()     // Catch: java.lang.Throwable -> Lb7
                java.util.jar.JarFile r1 = new java.util.jar.JarFile     // Catch: java.lang.Throwable -> Lb7
                r2 = 0
                r1.<init>(r0, r2)     // Catch: java.lang.Throwable -> Lb7
                net.bytebuddy.dynamic.loading.ClassInjector$UsingInstrumentation$Target r3 = r9.target     // Catch: java.lang.Throwable -> Lc8
                java.lang.instrument.Instrumentation r4 = r9.instrumentation     // Catch: java.lang.Throwable -> Lc8
                r3.inject(r4, r1)     // Catch: java.lang.Throwable -> Lc8
                r1.close()     // Catch: java.lang.Throwable -> Lb7
                java.util.HashMap r1 = new java.util.HashMap     // Catch: java.lang.Throwable -> Lb7
                r1.<init>()     // Catch: java.lang.Throwable -> Lb7
                java.util.Set r10 = r10.keySet()     // Catch: java.lang.Throwable -> Lb7
                java.util.Iterator r10 = r10.iterator()     // Catch: java.lang.Throwable -> Lb7
            L9d:
                boolean r3 = r10.hasNext()     // Catch: java.lang.Throwable -> Lb7
                if (r3 == 0) goto Lb9
                java.lang.Object r3 = r10.next()     // Catch: java.lang.Throwable -> Lb7
                java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> Lb7
                net.bytebuddy.dynamic.loading.ClassInjector$UsingInstrumentation$Target r4 = r9.target     // Catch: java.lang.Throwable -> Lb7
                java.lang.ClassLoader r4 = r4.getClassLoader()     // Catch: java.lang.Throwable -> Lb7
                java.lang.Class r4 = java.lang.Class.forName(r3, r2, r4)     // Catch: java.lang.Throwable -> Lb7
                r1.put(r3, r4)     // Catch: java.lang.Throwable -> Lb7
                goto L9d
            Lb7:
                r10 = move-exception
                goto Ld1
            Lb9:
                boolean r10 = r0.delete()     // Catch: java.lang.ClassNotFoundException -> Lc3 java.io.IOException -> Lc5
                if (r10 != 0) goto Lc7
                r0.deleteOnExit()     // Catch: java.lang.ClassNotFoundException -> Lc3 java.io.IOException -> Lc5
                goto Lc7
            Lc3:
                r10 = move-exception
                goto Lf2
            Lc5:
                r10 = move-exception
                goto Lfa
            Lc7:
                return r1
            Lc8:
                r10 = move-exception
                r1.close()     // Catch: java.lang.Throwable -> Lb7
                throw r10     // Catch: java.lang.Throwable -> Lb7
            Lcd:
                r1.close()     // Catch: java.lang.Throwable -> Lb7
                throw r10     // Catch: java.lang.Throwable -> Lb7
            Ld1:
                boolean r1 = r0.delete()     // Catch: java.lang.ClassNotFoundException -> Lc3 java.io.IOException -> Lc5
                if (r1 != 0) goto Lda
                r0.deleteOnExit()     // Catch: java.lang.ClassNotFoundException -> Lc3 java.io.IOException -> Lc5
            Lda:
                throw r10     // Catch: java.lang.ClassNotFoundException -> Lc3 java.io.IOException -> Lc5
            Ldb:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch: java.lang.ClassNotFoundException -> Lc3 java.io.IOException -> Lc5
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.ClassNotFoundException -> Lc3 java.io.IOException -> Lc5
                r1.<init>()     // Catch: java.lang.ClassNotFoundException -> Lc3 java.io.IOException -> Lc5
                java.lang.String r2 = "Cannot create file "
                r1.append(r2)     // Catch: java.lang.ClassNotFoundException -> Lc3 java.io.IOException -> Lc5
                r1.append(r0)     // Catch: java.lang.ClassNotFoundException -> Lc3 java.io.IOException -> Lc5
                java.lang.String r0 = r1.toString()     // Catch: java.lang.ClassNotFoundException -> Lc3 java.io.IOException -> Lc5
                r10.<init>(r0)     // Catch: java.lang.ClassNotFoundException -> Lc3 java.io.IOException -> Lc5
                throw r10     // Catch: java.lang.ClassNotFoundException -> Lc3 java.io.IOException -> Lc5
            Lf2:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "Cannot load injected class"
                r0.<init>(r1, r10)
                throw r0
            Lfa:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "Cannot write jar file to disk"
                r0.<init>(r1, r10)
                throw r0
        }

        @Override // net.bytebuddy.dynamic.loading.ClassInjector
        public boolean isAlive() {
                r1 = this;
                boolean r0 = isAvailable()
                return r0
        }
    }

    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
    public static class UsingJna extends net.bytebuddy.dynamic.loading.ClassInjector.AbstractBase {
        private static final boolean ACCESS_CONTROLLER = false;
        private static final java.lang.Object BOOTSTRAP_LOADER_LOCK = null;
        private static final net.bytebuddy.dynamic.loading.ClassInjector.UsingJna.Dispatcher DISPATCHER = null;

        @net.bytebuddy.utility.nullability.MaybeNull
        @net.bytebuddy.build.HashCodeAndEqualsPlugin.ValueHandling(net.bytebuddy.build.HashCodeAndEqualsPlugin.ValueHandling.Sort.REVERSE_NULLABILITY)
        private final java.lang.ClassLoader classLoader;

        @net.bytebuddy.utility.nullability.MaybeNull
        @net.bytebuddy.build.HashCodeAndEqualsPlugin.ValueHandling(net.bytebuddy.build.HashCodeAndEqualsPlugin.ValueHandling.Sort.REVERSE_NULLABILITY)
        private final java.security.ProtectionDomain protectionDomain;

        public interface Dispatcher {

            public enum CreationAction extends java.lang.Enum<net.bytebuddy.dynamic.loading.ClassInjector.UsingJna.Dispatcher.CreationAction> implements java.security.PrivilegedAction<net.bytebuddy.dynamic.loading.ClassInjector.UsingJna.Dispatcher> {
                private static final /* synthetic */ net.bytebuddy.dynamic.loading.ClassInjector.UsingJna.Dispatcher.CreationAction[] $VALUES = null;
                public static final net.bytebuddy.dynamic.loading.ClassInjector.UsingJna.Dispatcher.CreationAction INSTANCE = null;

                static {
                        net.bytebuddy.dynamic.loading.ClassInjector$UsingJna$Dispatcher$CreationAction r0 = new net.bytebuddy.dynamic.loading.ClassInjector$UsingJna$Dispatcher$CreationAction
                        java.lang.String r1 = "INSTANCE"
                        r2 = 0
                        r0.<init>(r1, r2)
                        net.bytebuddy.dynamic.loading.ClassInjector.UsingJna.Dispatcher.CreationAction.INSTANCE = r0
                        net.bytebuddy.dynamic.loading.ClassInjector$UsingJna$Dispatcher$CreationAction[] r0 = new net.bytebuddy.dynamic.loading.ClassInjector.UsingJna.Dispatcher.CreationAction[]{r0}
                        net.bytebuddy.dynamic.loading.ClassInjector.UsingJna.Dispatcher.CreationAction.$VALUES = r0
                        return
                }

                CreationAction(java.lang.String r1, int r2) {
                        r0 = this;
                        r0.<init>(r1, r2)
                        return
                }

                public static net.bytebuddy.dynamic.loading.ClassInjector.UsingJna.Dispatcher.CreationAction valueOf(java.lang.String r1) {
                        java.lang.Class<net.bytebuddy.dynamic.loading.ClassInjector$UsingJna$Dispatcher$CreationAction> r0 = net.bytebuddy.dynamic.loading.ClassInjector.UsingJna.Dispatcher.CreationAction.class
                        java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                        net.bytebuddy.dynamic.loading.ClassInjector$UsingJna$Dispatcher$CreationAction r1 = (net.bytebuddy.dynamic.loading.ClassInjector.UsingJna.Dispatcher.CreationAction) r1
                        return r1
                }

                public static net.bytebuddy.dynamic.loading.ClassInjector.UsingJna.Dispatcher.CreationAction[] values() {
                        net.bytebuddy.dynamic.loading.ClassInjector$UsingJna$Dispatcher$CreationAction[] r0 = net.bytebuddy.dynamic.loading.ClassInjector.UsingJna.Dispatcher.CreationAction.$VALUES
                        java.lang.Object r0 = r0.clone()
                        net.bytebuddy.dynamic.loading.ClassInjector$UsingJna$Dispatcher$CreationAction[] r0 = (net.bytebuddy.dynamic.loading.ClassInjector.UsingJna.Dispatcher.CreationAction[]) r0
                        return r0
                }

                @Override // java.security.PrivilegedAction
                public /* bridge */ /* synthetic */ net.bytebuddy.dynamic.loading.ClassInjector.UsingJna.Dispatcher run() {
                        r1 = this;
                        net.bytebuddy.dynamic.loading.ClassInjector$UsingJna$Dispatcher r0 = r1.run2()
                        return r0
                }

                @Override // java.security.PrivilegedAction
                /* JADX INFO: renamed from: run, reason: avoid collision after fix types in other method */
                public net.bytebuddy.dynamic.loading.ClassInjector.UsingJna.Dispatcher run2() {
                        r4 = this;
                        java.lang.String r0 = "java.vm.name"
                        java.lang.String r1 = ""
                        java.lang.String r0 = java.lang.System.getProperty(r0, r1)
                        java.util.Locale r1 = java.util.Locale.US
                        java.lang.String r0 = r0.toUpperCase(r1)
                        java.lang.String r1 = "J9"
                        boolean r0 = r0.contains(r1)
                        if (r0 == 0) goto L1e
                        net.bytebuddy.dynamic.loading.ClassInjector$UsingJna$Dispatcher$Unavailable r0 = new net.bytebuddy.dynamic.loading.ClassInjector$UsingJna$Dispatcher$Unavailable
                        java.lang.String r1 = "J9 does not support JNA-based class definition"
                        r0.<init>(r1)
                        return r0
                    L1e:
                        java.util.HashMap r0 = new java.util.HashMap     // Catch: java.lang.Throwable -> L3e
                        r0.<init>()     // Catch: java.lang.Throwable -> L3e
                        java.lang.String r1 = "allow-objects"
                        java.lang.Boolean r2 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L3e
                        r0.put(r1, r2)     // Catch: java.lang.Throwable -> L3e
                        boolean r1 = com.sun.jna.Platform.isWindows()     // Catch: java.lang.Throwable -> L3e
                        if (r1 == 0) goto L40
                        boolean r1 = com.sun.jna.Platform.is64Bit()     // Catch: java.lang.Throwable -> L3e
                        if (r1 != 0) goto L40
                        java.lang.String r1 = "function-mapper"
                        net.bytebuddy.dynamic.loading.ClassInjector$UsingJna$Dispatcher$Windows32BitFunctionMapper r2 = net.bytebuddy.dynamic.loading.ClassInjector.UsingJna.Dispatcher.Windows32BitFunctionMapper.INSTANCE     // Catch: java.lang.Throwable -> L3e
                        r0.put(r1, r2)     // Catch: java.lang.Throwable -> L3e
                        goto L40
                    L3e:
                        r0 = move-exception
                        goto L50
                    L40:
                        net.bytebuddy.dynamic.loading.ClassInjector$UsingJna$Dispatcher$Enabled r1 = new net.bytebuddy.dynamic.loading.ClassInjector$UsingJna$Dispatcher$Enabled     // Catch: java.lang.Throwable -> L3e
                        java.lang.String r2 = "jvm"
                        java.lang.Class<net.bytebuddy.dynamic.loading.ClassInjector$UsingJna$Dispatcher$Jvm> r3 = net.bytebuddy.dynamic.loading.ClassInjector.UsingJna.Dispatcher.Jvm.class
                        java.lang.Object r0 = com.sun.jna.Native.loadLibrary(r2, r3, r0)     // Catch: java.lang.Throwable -> L3e
                        net.bytebuddy.dynamic.loading.ClassInjector$UsingJna$Dispatcher$Jvm r0 = (net.bytebuddy.dynamic.loading.ClassInjector.UsingJna.Dispatcher.Jvm) r0     // Catch: java.lang.Throwable -> L3e
                        r1.<init>(r0)     // Catch: java.lang.Throwable -> L3e
                        return r1
                    L50:
                        net.bytebuddy.dynamic.loading.ClassInjector$UsingJna$Dispatcher$Unavailable r1 = new net.bytebuddy.dynamic.loading.ClassInjector$UsingJna$Dispatcher$Unavailable
                        java.lang.String r0 = r0.getMessage()
                        r1.<init>(r0)
                        return r1
                }
            }

            @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
            public static class Enabled implements net.bytebuddy.dynamic.loading.ClassInjector.UsingJna.Dispatcher {
                private final net.bytebuddy.dynamic.loading.ClassInjector.UsingJna.Dispatcher.Jvm jvm;

                public Enabled(net.bytebuddy.dynamic.loading.ClassInjector.UsingJna.Dispatcher.Jvm r1) {
                        r0 = this;
                        r0.<init>()
                        r0.jvm = r1
                        return
                }

                @Override // net.bytebuddy.dynamic.loading.ClassInjector.UsingJna.Dispatcher
                public java.lang.Class<?> defineClass(@net.bytebuddy.utility.nullability.MaybeNull java.lang.ClassLoader r8, java.lang.String r9, byte[] r10, @net.bytebuddy.utility.nullability.MaybeNull java.security.ProtectionDomain r11) {
                        r7 = this;
                        net.bytebuddy.dynamic.loading.ClassInjector$UsingJna$Dispatcher$Jvm r0 = r7.jvm
                        com.sun.jna.JNIEnv r1 = com.sun.jna.JNIEnv.CURRENT
                        r2 = 46
                        r3 = 47
                        java.lang.String r2 = r9.replace(r2, r3)
                        int r5 = r10.length
                        r3 = r8
                        r4 = r10
                        r6 = r11
                        java.lang.Class r8 = r0.JVM_DefineClass(r1, r2, r3, r4, r5, r6)
                        return r8
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
                        net.bytebuddy.dynamic.loading.ClassInjector$UsingJna$Dispatcher$Jvm r2 = r4.jvm
                        net.bytebuddy.dynamic.loading.ClassInjector$UsingJna$Dispatcher$Enabled r5 = (net.bytebuddy.dynamic.loading.ClassInjector.UsingJna.Dispatcher.Enabled) r5
                        net.bytebuddy.dynamic.loading.ClassInjector$UsingJna$Dispatcher$Jvm r5 = r5.jvm
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
                        net.bytebuddy.dynamic.loading.ClassInjector$UsingJna$Dispatcher$Jvm r1 = r2.jvm
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        return r0
                }

                @Override // net.bytebuddy.dynamic.loading.ClassInjector.UsingJna.Dispatcher
                public boolean isAvailable() {
                        r1 = this;
                        r0 = 1
                        return r0
                }
            }

            public interface Jvm extends com.sun.jna.Library {
                java.lang.Class<?> JVM_DefineClass(com.sun.jna.JNIEnv r1, java.lang.String r2, @net.bytebuddy.utility.nullability.MaybeNull java.lang.ClassLoader r3, byte[] r4, int r5, @net.bytebuddy.utility.nullability.MaybeNull java.security.ProtectionDomain r6) throws com.sun.jna.LastErrorException;
            }

            @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
            public static class Unavailable implements net.bytebuddy.dynamic.loading.ClassInjector.UsingJna.Dispatcher {
                private final java.lang.String error;

                public Unavailable(java.lang.String r1) {
                        r0 = this;
                        r0.<init>()
                        r0.error = r1
                        return
                }

                @Override // net.bytebuddy.dynamic.loading.ClassInjector.UsingJna.Dispatcher
                public java.lang.Class<?> defineClass(@net.bytebuddy.utility.nullability.MaybeNull java.lang.ClassLoader r1, java.lang.String r2, byte[] r3, @net.bytebuddy.utility.nullability.MaybeNull java.security.ProtectionDomain r4) {
                        r0 = this;
                        java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                        java.lang.StringBuilder r2 = new java.lang.StringBuilder
                        r2.<init>()
                        java.lang.String r3 = "JNA is not available and JNA-based injection cannot be used: "
                        r2.append(r3)
                        java.lang.String r3 = r0.error
                        r2.append(r3)
                        java.lang.String r2 = r2.toString()
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
                        java.lang.String r2 = r4.error
                        net.bytebuddy.dynamic.loading.ClassInjector$UsingJna$Dispatcher$Unavailable r5 = (net.bytebuddy.dynamic.loading.ClassInjector.UsingJna.Dispatcher.Unavailable) r5
                        java.lang.String r5 = r5.error
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
                        java.lang.String r1 = r2.error
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        return r0
                }

                @Override // net.bytebuddy.dynamic.loading.ClassInjector.UsingJna.Dispatcher
                public boolean isAvailable() {
                        r1 = this;
                        r0 = 0
                        return r0
                }
            }

            public enum Windows32BitFunctionMapper extends java.lang.Enum<net.bytebuddy.dynamic.loading.ClassInjector.UsingJna.Dispatcher.Windows32BitFunctionMapper> implements com.sun.jna.FunctionMapper {
                private static final /* synthetic */ net.bytebuddy.dynamic.loading.ClassInjector.UsingJna.Dispatcher.Windows32BitFunctionMapper[] $VALUES = null;
                public static final net.bytebuddy.dynamic.loading.ClassInjector.UsingJna.Dispatcher.Windows32BitFunctionMapper INSTANCE = null;

                static {
                        net.bytebuddy.dynamic.loading.ClassInjector$UsingJna$Dispatcher$Windows32BitFunctionMapper r0 = new net.bytebuddy.dynamic.loading.ClassInjector$UsingJna$Dispatcher$Windows32BitFunctionMapper
                        java.lang.String r1 = "INSTANCE"
                        r2 = 0
                        r0.<init>(r1, r2)
                        net.bytebuddy.dynamic.loading.ClassInjector.UsingJna.Dispatcher.Windows32BitFunctionMapper.INSTANCE = r0
                        net.bytebuddy.dynamic.loading.ClassInjector$UsingJna$Dispatcher$Windows32BitFunctionMapper[] r0 = new net.bytebuddy.dynamic.loading.ClassInjector.UsingJna.Dispatcher.Windows32BitFunctionMapper[]{r0}
                        net.bytebuddy.dynamic.loading.ClassInjector.UsingJna.Dispatcher.Windows32BitFunctionMapper.$VALUES = r0
                        return
                }

                Windows32BitFunctionMapper(java.lang.String r1, int r2) {
                        r0 = this;
                        r0.<init>(r1, r2)
                        return
                }

                public static net.bytebuddy.dynamic.loading.ClassInjector.UsingJna.Dispatcher.Windows32BitFunctionMapper valueOf(java.lang.String r1) {
                        java.lang.Class<net.bytebuddy.dynamic.loading.ClassInjector$UsingJna$Dispatcher$Windows32BitFunctionMapper> r0 = net.bytebuddy.dynamic.loading.ClassInjector.UsingJna.Dispatcher.Windows32BitFunctionMapper.class
                        java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                        net.bytebuddy.dynamic.loading.ClassInjector$UsingJna$Dispatcher$Windows32BitFunctionMapper r1 = (net.bytebuddy.dynamic.loading.ClassInjector.UsingJna.Dispatcher.Windows32BitFunctionMapper) r1
                        return r1
                }

                public static net.bytebuddy.dynamic.loading.ClassInjector.UsingJna.Dispatcher.Windows32BitFunctionMapper[] values() {
                        net.bytebuddy.dynamic.loading.ClassInjector$UsingJna$Dispatcher$Windows32BitFunctionMapper[] r0 = net.bytebuddy.dynamic.loading.ClassInjector.UsingJna.Dispatcher.Windows32BitFunctionMapper.$VALUES
                        java.lang.Object r0 = r0.clone()
                        net.bytebuddy.dynamic.loading.ClassInjector$UsingJna$Dispatcher$Windows32BitFunctionMapper[] r0 = (net.bytebuddy.dynamic.loading.ClassInjector.UsingJna.Dispatcher.Windows32BitFunctionMapper[]) r0
                        return r0
                }

                public java.lang.String getFunctionName(com.sun.jna.NativeLibrary r2, java.lang.reflect.Method r3) {
                        r1 = this;
                        java.lang.String r2 = r3.getName()
                        java.lang.String r0 = "JVM_DefineClass"
                        boolean r2 = r2.equals(r0)
                        if (r2 == 0) goto Lf
                        java.lang.String r2 = "_JVM_DefineClass@24"
                        return r2
                    Lf:
                        java.lang.String r2 = r3.getName()
                        return r2
                }
            }

            java.lang.Class<?> defineClass(@net.bytebuddy.utility.nullability.MaybeNull java.lang.ClassLoader r1, java.lang.String r2, byte[] r3, @net.bytebuddy.utility.nullability.MaybeNull java.security.ProtectionDomain r4);

            boolean isAvailable();
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
                net.bytebuddy.dynamic.loading.ClassInjector.UsingJna.ACCESS_CONTROLLER = r1     // Catch: java.lang.SecurityException -> L16 java.lang.ClassNotFoundException -> L17
                goto L19
            L16:
                r0 = 1
            L17:
                net.bytebuddy.dynamic.loading.ClassInjector.UsingJna.ACCESS_CONTROLLER = r0
            L19:
                net.bytebuddy.dynamic.loading.ClassInjector$UsingJna$Dispatcher$CreationAction r0 = net.bytebuddy.dynamic.loading.ClassInjector.UsingJna.Dispatcher.CreationAction.INSTANCE
                java.lang.Object r0 = doPrivileged(r0)
                net.bytebuddy.dynamic.loading.ClassInjector$UsingJna$Dispatcher r0 = (net.bytebuddy.dynamic.loading.ClassInjector.UsingJna.Dispatcher) r0
                net.bytebuddy.dynamic.loading.ClassInjector.UsingJna.DISPATCHER = r0
                java.lang.Object r0 = new java.lang.Object
                r0.<init>()
                net.bytebuddy.dynamic.loading.ClassInjector.UsingJna.BOOTSTRAP_LOADER_LOCK = r0
                return
        }

        public UsingJna(@net.bytebuddy.utility.nullability.MaybeNull java.lang.ClassLoader r2) {
                r1 = this;
                java.security.ProtectionDomain r0 = net.bytebuddy.dynamic.loading.ClassLoadingStrategy.NO_PROTECTION_DOMAIN
                r1.<init>(r2, r0)
                return
        }

        public UsingJna(@net.bytebuddy.utility.nullability.MaybeNull java.lang.ClassLoader r1, @net.bytebuddy.utility.nullability.MaybeNull java.security.ProtectionDomain r2) {
                r0 = this;
                r0.<init>()
                r0.classLoader = r1
                r0.protectionDomain = r2
                return
        }

        @net.bytebuddy.build.AccessControllerPlugin.Enhance
        private static <T> T doPrivileged(java.security.PrivilegedAction<T> r1) {
                boolean r0 = net.bytebuddy.dynamic.loading.ClassInjector.UsingJna.ACCESS_CONTROLLER
                if (r0 == 0) goto L9
                java.lang.Object r1 = java.security.AccessController.doPrivileged(r1)
                return r1
            L9:
                java.lang.Object r1 = r1.run()
                return r1
        }

        public static boolean isAvailable() {
                net.bytebuddy.dynamic.loading.ClassInjector$UsingJna$Dispatcher r0 = net.bytebuddy.dynamic.loading.ClassInjector.UsingJna.DISPATCHER
                boolean r0 = r0.isAvailable()
                return r0
        }

        public static net.bytebuddy.dynamic.loading.ClassInjector ofBootLoader() {
                net.bytebuddy.dynamic.loading.ClassInjector$UsingJna r0 = new net.bytebuddy.dynamic.loading.ClassInjector$UsingJna
                java.lang.ClassLoader r1 = net.bytebuddy.dynamic.loading.ClassLoadingStrategy.BOOTSTRAP_LOADER
                r0.<init>(r1)
                return r0
        }

        public static net.bytebuddy.dynamic.loading.ClassInjector ofPlatformLoader() {
                net.bytebuddy.dynamic.loading.ClassInjector$UsingJna r0 = new net.bytebuddy.dynamic.loading.ClassInjector$UsingJna
                java.lang.ClassLoader r1 = java.lang.ClassLoader.getSystemClassLoader()
                java.lang.ClassLoader r1 = r1.getParent()
                r0.<init>(r1)
                return r0
        }

        public static net.bytebuddy.dynamic.loading.ClassInjector ofSystemLoader() {
                net.bytebuddy.dynamic.loading.ClassInjector$UsingJna r0 = new net.bytebuddy.dynamic.loading.ClassInjector$UsingJna
                java.lang.ClassLoader r1 = java.lang.ClassLoader.getSystemClassLoader()
                r0.<init>(r1)
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
                net.bytebuddy.dynamic.loading.ClassInjector$UsingJna r5 = (net.bytebuddy.dynamic.loading.ClassInjector.UsingJna) r5
                java.lang.ClassLoader r3 = r5.classLoader
                if (r3 == 0) goto L24
                if (r2 == 0) goto L26
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L27
                return r1
            L24:
                if (r2 == 0) goto L27
            L26:
                return r1
            L27:
                java.security.ProtectionDomain r2 = r4.protectionDomain
                java.security.ProtectionDomain r5 = r5.protectionDomain
                if (r5 == 0) goto L36
                if (r2 == 0) goto L38
                boolean r5 = r2.equals(r5)
                if (r5 != 0) goto L39
                return r1
            L36:
                if (r2 == 0) goto L39
            L38:
                return r1
            L39:
                return r0
        }

        public int hashCode() {
                r2 = this;
                java.lang.Class r0 = r2.getClass()
                int r0 = r0.hashCode()
                int r0 = r0 * 31
                java.lang.ClassLoader r1 = r2.classLoader
                if (r1 == 0) goto L13
                int r1 = r1.hashCode()
                int r0 = r0 + r1
            L13:
                int r0 = r0 * 31
                java.security.ProtectionDomain r1 = r2.protectionDomain
                if (r1 == 0) goto L1e
                int r1 = r1.hashCode()
                int r0 = r0 + r1
            L1e:
                return r0
        }

        @Override // net.bytebuddy.dynamic.loading.ClassInjector
        public java.util.Map<java.lang.String, java.lang.Class<?>> injectRaw(java.util.Map<? extends java.lang.String, byte[]> r9) {
                r8 = this;
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                java.lang.ClassLoader r1 = r8.classLoader
                if (r1 != 0) goto Lb
                java.lang.Object r1 = net.bytebuddy.dynamic.loading.ClassInjector.UsingJna.BOOTSTRAP_LOADER_LOCK
            Lb:
                monitor-enter(r1)
                java.util.Set r9 = r9.entrySet()     // Catch: java.lang.Throwable -> L35
                java.util.Iterator r9 = r9.iterator()     // Catch: java.lang.Throwable -> L35
            L14:
                boolean r2 = r9.hasNext()     // Catch: java.lang.Throwable -> L35
                if (r2 == 0) goto L55
                java.lang.Object r2 = r9.next()     // Catch: java.lang.Throwable -> L35
                java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch: java.lang.Throwable -> L35
                java.lang.Object r3 = r2.getKey()     // Catch: java.lang.Throwable -> L35 java.lang.ClassNotFoundException -> L37
                java.lang.Object r4 = r2.getKey()     // Catch: java.lang.Throwable -> L35 java.lang.ClassNotFoundException -> L37
                java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L35 java.lang.ClassNotFoundException -> L37
                java.lang.ClassLoader r5 = r8.classLoader     // Catch: java.lang.Throwable -> L35 java.lang.ClassNotFoundException -> L37
                r6 = 0
                java.lang.Class r4 = java.lang.Class.forName(r4, r6, r5)     // Catch: java.lang.Throwable -> L35 java.lang.ClassNotFoundException -> L37
                r0.put(r3, r4)     // Catch: java.lang.Throwable -> L35 java.lang.ClassNotFoundException -> L37
                goto L14
            L35:
                r9 = move-exception
                goto L57
            L37:
                java.lang.Object r3 = r2.getKey()     // Catch: java.lang.Throwable -> L35
                net.bytebuddy.dynamic.loading.ClassInjector$UsingJna$Dispatcher r4 = net.bytebuddy.dynamic.loading.ClassInjector.UsingJna.DISPATCHER     // Catch: java.lang.Throwable -> L35
                java.lang.ClassLoader r5 = r8.classLoader     // Catch: java.lang.Throwable -> L35
                java.lang.Object r6 = r2.getKey()     // Catch: java.lang.Throwable -> L35
                java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Throwable -> L35
                java.lang.Object r2 = r2.getValue()     // Catch: java.lang.Throwable -> L35
                byte[] r2 = (byte[]) r2     // Catch: java.lang.Throwable -> L35
                java.security.ProtectionDomain r7 = r8.protectionDomain     // Catch: java.lang.Throwable -> L35
                java.lang.Class r2 = r4.defineClass(r5, r6, r2, r7)     // Catch: java.lang.Throwable -> L35
                r0.put(r3, r2)     // Catch: java.lang.Throwable -> L35
                goto L14
            L55:
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L35
                return r0
            L57:
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L35
                throw r9
        }

        @Override // net.bytebuddy.dynamic.loading.ClassInjector
        public boolean isAlive() {
                r1 = this;
                net.bytebuddy.dynamic.loading.ClassInjector$UsingJna$Dispatcher r0 = net.bytebuddy.dynamic.loading.ClassInjector.UsingJna.DISPATCHER
                boolean r0 = r0.isAvailable()
                return r0
        }
    }

    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
    public static class UsingLookup extends net.bytebuddy.dynamic.loading.ClassInjector.AbstractBase {
        private static final boolean ACCESS_CONTROLLER = false;
        private static final net.bytebuddy.dynamic.loading.ClassInjector.UsingLookup.MethodHandles METHOD_HANDLES = null;
        private static final net.bytebuddy.dynamic.loading.ClassInjector.UsingLookup.MethodHandles.Lookup METHOD_HANDLES_LOOKUP = null;
        private static final int PACKAGE_LOOKUP = 8;
        private final java.lang.Object lookup;

        @net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied("java.lang.invoke.MethodHandles")
        public interface MethodHandles {

            @net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied("java.lang.invoke.MethodHandles$Lookup")
            public interface Lookup {
                @net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied("defineClass")
                java.lang.Class<?> defineClass(java.lang.Object r1, byte[] r2) throws java.lang.IllegalAccessException;

                @net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied("lookupClass")
                java.lang.Class<?> lookupClass(java.lang.Object r1);

                @net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied("lookupModes")
                int lookupModes(java.lang.Object r1);
            }

            @net.bytebuddy.utility.dispatcher.JavaDispatcher.IsStatic
            @net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied("privateLookupIn")
            java.lang.Object privateLookupIn(java.lang.Class<?> r1, @net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied("java.lang.invoke.MethodHandles$Lookup") java.lang.Object r2) throws java.lang.IllegalAccessException;
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
                net.bytebuddy.dynamic.loading.ClassInjector.UsingLookup.ACCESS_CONTROLLER = r1     // Catch: java.lang.SecurityException -> L16 java.lang.ClassNotFoundException -> L17
                goto L19
            L16:
                r0 = 1
            L17:
                net.bytebuddy.dynamic.loading.ClassInjector.UsingLookup.ACCESS_CONTROLLER = r0
            L19:
                java.lang.Class<net.bytebuddy.dynamic.loading.ClassInjector$UsingLookup$MethodHandles> r0 = net.bytebuddy.dynamic.loading.ClassInjector.UsingLookup.MethodHandles.class
                java.security.PrivilegedAction r0 = net.bytebuddy.utility.dispatcher.JavaDispatcher.of(r0)
                java.lang.Object r0 = doPrivileged(r0)
                net.bytebuddy.dynamic.loading.ClassInjector$UsingLookup$MethodHandles r0 = (net.bytebuddy.dynamic.loading.ClassInjector.UsingLookup.MethodHandles) r0
                net.bytebuddy.dynamic.loading.ClassInjector.UsingLookup.METHOD_HANDLES = r0
                java.lang.Class<net.bytebuddy.dynamic.loading.ClassInjector$UsingLookup$MethodHandles$Lookup> r0 = net.bytebuddy.dynamic.loading.ClassInjector.UsingLookup.MethodHandles.Lookup.class
                java.security.PrivilegedAction r0 = net.bytebuddy.utility.dispatcher.JavaDispatcher.of(r0)
                java.lang.Object r0 = doPrivileged(r0)
                net.bytebuddy.dynamic.loading.ClassInjector$UsingLookup$MethodHandles$Lookup r0 = (net.bytebuddy.dynamic.loading.ClassInjector.UsingLookup.MethodHandles.Lookup) r0
                net.bytebuddy.dynamic.loading.ClassInjector.UsingLookup.METHOD_HANDLES_LOOKUP = r0
                return
        }

        public UsingLookup(java.lang.Object r1) {
                r0 = this;
                r0.<init>()
                r0.lookup = r1
                return
        }

        @net.bytebuddy.build.AccessControllerPlugin.Enhance
        private static <T> T doPrivileged(java.security.PrivilegedAction<T> r1) {
                boolean r0 = net.bytebuddy.dynamic.loading.ClassInjector.UsingLookup.ACCESS_CONTROLLER
                if (r0 == 0) goto L9
                java.lang.Object r1 = java.security.AccessController.doPrivileged(r1)
                return r1
            L9:
                java.lang.Object r1 = r1.run()
                return r1
        }

        public static boolean isAvailable() {
                net.bytebuddy.utility.JavaType r0 = net.bytebuddy.utility.JavaType.MODULE
                boolean r0 = r0.isAvailable()
                return r0
        }

        public static net.bytebuddy.dynamic.loading.ClassInjector.UsingLookup of(java.lang.Object r3) {
                boolean r0 = isAvailable()
                if (r0 == 0) goto L4c
                net.bytebuddy.utility.JavaType r0 = net.bytebuddy.utility.JavaType.METHOD_HANDLES_LOOKUP
                boolean r0 = r0.isInstance(r3)
                if (r0 == 0) goto L35
                net.bytebuddy.dynamic.loading.ClassInjector$UsingLookup$MethodHandles$Lookup r0 = net.bytebuddy.dynamic.loading.ClassInjector.UsingLookup.METHOD_HANDLES_LOOKUP
                int r0 = r0.lookupModes(r3)
                r0 = r0 & 8
                if (r0 == 0) goto L1e
                net.bytebuddy.dynamic.loading.ClassInjector$UsingLookup r0 = new net.bytebuddy.dynamic.loading.ClassInjector$UsingLookup
                r0.<init>(r3)
                return r0
            L1e:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Lookup does not imply package-access: "
                r1.append(r2)
                r1.append(r3)
                java.lang.String r3 = r1.toString()
                r0.<init>(r3)
                throw r0
            L35:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Not a method handle lookup: "
                r1.append(r2)
                r1.append(r3)
                java.lang.String r3 = r1.toString()
                r0.<init>(r3)
                throw r0
            L4c:
                java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                java.lang.String r0 = "The current VM does not support class definition via method handle lookups"
                r3.<init>(r0)
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
                java.lang.Object r2 = r4.lookup
                net.bytebuddy.dynamic.loading.ClassInjector$UsingLookup r5 = (net.bytebuddy.dynamic.loading.ClassInjector.UsingLookup) r5
                java.lang.Object r5 = r5.lookup
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
                java.lang.Object r1 = r2.lookup
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                return r0
        }

        public net.bytebuddy.dynamic.loading.ClassInjector.UsingLookup in(java.lang.Class<?> r5) {
                r4 = this;
                net.bytebuddy.dynamic.loading.ClassInjector$UsingLookup r0 = new net.bytebuddy.dynamic.loading.ClassInjector$UsingLookup     // Catch: java.lang.IllegalAccessException -> Le
                net.bytebuddy.dynamic.loading.ClassInjector$UsingLookup$MethodHandles r1 = net.bytebuddy.dynamic.loading.ClassInjector.UsingLookup.METHOD_HANDLES     // Catch: java.lang.IllegalAccessException -> Le
                java.lang.Object r2 = r4.lookup     // Catch: java.lang.IllegalAccessException -> Le
                java.lang.Object r1 = r1.privateLookupIn(r5, r2)     // Catch: java.lang.IllegalAccessException -> Le
                r0.<init>(r1)     // Catch: java.lang.IllegalAccessException -> Le
                return r0
            Le:
                r0 = move-exception
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Cannot access "
                r2.append(r3)
                java.lang.String r5 = r5.getName()
                r2.append(r5)
                java.lang.String r5 = " from "
                r2.append(r5)
                java.lang.Object r5 = r4.lookup
                r2.append(r5)
                java.lang.String r5 = r2.toString()
                r1.<init>(r5, r0)
                throw r1
        }

        @Override // net.bytebuddy.dynamic.loading.ClassInjector
        public java.util.Map<java.lang.String, java.lang.Class<?>> injectRaw(java.util.Map<? extends java.lang.String, byte[]> r8) {
                r7 = this;
                java.lang.Class r0 = r7.lookupType()
                net.bytebuddy.description.type.TypeDescription r0 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r0)
                net.bytebuddy.description.type.PackageDescription r0 = r0.getPackage()
                if (r0 == 0) goto L8e
                java.util.HashMap r1 = new java.util.HashMap
                r1.<init>()
                java.util.Set r8 = r8.entrySet()
                java.util.Iterator r8 = r8.iterator()
            L1b:
                boolean r2 = r8.hasNext()
                if (r2 == 0) goto L8d
                java.lang.Object r2 = r8.next()
                java.util.Map$Entry r2 = (java.util.Map.Entry) r2
                java.lang.Object r3 = r2.getKey()
                java.lang.String r3 = (java.lang.String) r3
                r4 = 46
                int r3 = r3.lastIndexOf(r4)
                java.lang.String r4 = r0.getName()
                r5 = -1
                if (r3 != r5) goto L3d
                java.lang.String r3 = ""
                goto L48
            L3d:
                java.lang.Object r5 = r2.getKey()
                java.lang.String r5 = (java.lang.String) r5
                r6 = 0
                java.lang.String r3 = r5.substring(r6, r3)
            L48:
                boolean r3 = r4.equals(r3)
                if (r3 == 0) goto L6b
                java.lang.Object r3 = r2.getKey()     // Catch: java.lang.Exception -> L64
                net.bytebuddy.dynamic.loading.ClassInjector$UsingLookup$MethodHandles$Lookup r4 = net.bytebuddy.dynamic.loading.ClassInjector.UsingLookup.METHOD_HANDLES_LOOKUP     // Catch: java.lang.Exception -> L64
                java.lang.Object r5 = r7.lookup     // Catch: java.lang.Exception -> L64
                java.lang.Object r2 = r2.getValue()     // Catch: java.lang.Exception -> L64
                byte[] r2 = (byte[]) r2     // Catch: java.lang.Exception -> L64
                java.lang.Class r2 = r4.defineClass(r5, r2)     // Catch: java.lang.Exception -> L64
                r1.put(r3, r2)     // Catch: java.lang.Exception -> L64
                goto L1b
            L64:
                r8 = move-exception
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                r0.<init>(r8)
                throw r0
            L6b:
                java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.Object r1 = r2.getKey()
                java.lang.String r1 = (java.lang.String) r1
                r0.append(r1)
                java.lang.String r1 = " must be defined in the same package as "
                r0.append(r1)
                java.lang.Object r1 = r7.lookup
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r8.<init>(r0)
                throw r8
            L8d:
                return r1
            L8e:
                java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "Cannot inject array or primitive type"
                r8.<init>(r0)
                throw r8
        }

        @Override // net.bytebuddy.dynamic.loading.ClassInjector
        public boolean isAlive() {
                r1 = this;
                boolean r0 = isAvailable()
                return r0
        }

        public java.lang.Class<?> lookupType() {
                r2 = this;
                net.bytebuddy.dynamic.loading.ClassInjector$UsingLookup$MethodHandles$Lookup r0 = net.bytebuddy.dynamic.loading.ClassInjector.UsingLookup.METHOD_HANDLES_LOOKUP
                java.lang.Object r1 = r2.lookup
                java.lang.Class r0 = r0.lookupClass(r1)
                return r0
        }
    }

    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
    public static class UsingReflection extends net.bytebuddy.dynamic.loading.ClassInjector.AbstractBase {
        private static final boolean ACCESS_CONTROLLER = false;
        private static final java.lang.reflect.Method CHECK_PERMISSION = null;
        private static final net.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.Dispatcher.Initializable DISPATCHER = null;
        private static final net.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.System SYSTEM = null;
        private final java.lang.ClassLoader classLoader;
        private final boolean forbidExisting;
        private final net.bytebuddy.dynamic.loading.PackageDefinitionStrategy packageDefinitionStrategy;

        @net.bytebuddy.utility.nullability.MaybeNull
        @net.bytebuddy.build.HashCodeAndEqualsPlugin.ValueHandling(net.bytebuddy.build.HashCodeAndEqualsPlugin.ValueHandling.Sort.REVERSE_NULLABILITY)
        private final java.security.ProtectionDomain protectionDomain;

        public interface Dispatcher {

            @net.bytebuddy.utility.nullability.AlwaysNull
            public static final java.lang.Class<?> UNDEFINED = null;

            public enum CreationAction extends java.lang.Enum<net.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.Dispatcher.CreationAction> implements java.security.PrivilegedAction<net.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.Dispatcher.Initializable> {
                private static final /* synthetic */ net.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.Dispatcher.CreationAction[] $VALUES = null;
                public static final net.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.Dispatcher.CreationAction INSTANCE = null;

                static {
                        net.bytebuddy.dynamic.loading.ClassInjector$UsingReflection$Dispatcher$CreationAction r0 = new net.bytebuddy.dynamic.loading.ClassInjector$UsingReflection$Dispatcher$CreationAction
                        java.lang.String r1 = "INSTANCE"
                        r2 = 0
                        r0.<init>(r1, r2)
                        net.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.Dispatcher.CreationAction.INSTANCE = r0
                        net.bytebuddy.dynamic.loading.ClassInjector$UsingReflection$Dispatcher$CreationAction[] r0 = new net.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.Dispatcher.CreationAction[]{r0}
                        net.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.Dispatcher.CreationAction.$VALUES = r0
                        return
                }

                CreationAction(java.lang.String r1, int r2) {
                        r0 = this;
                        r0.<init>(r1, r2)
                        return
                }

                public static net.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.Dispatcher.CreationAction valueOf(java.lang.String r1) {
                        java.lang.Class<net.bytebuddy.dynamic.loading.ClassInjector$UsingReflection$Dispatcher$CreationAction> r0 = net.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.Dispatcher.CreationAction.class
                        java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                        net.bytebuddy.dynamic.loading.ClassInjector$UsingReflection$Dispatcher$CreationAction r1 = (net.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.Dispatcher.CreationAction) r1
                        return r1
                }

                public static net.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.Dispatcher.CreationAction[] values() {
                        net.bytebuddy.dynamic.loading.ClassInjector$UsingReflection$Dispatcher$CreationAction[] r0 = net.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.Dispatcher.CreationAction.$VALUES
                        java.lang.Object r0 = r0.clone()
                        net.bytebuddy.dynamic.loading.ClassInjector$UsingReflection$Dispatcher$CreationAction[] r0 = (net.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.Dispatcher.CreationAction[]) r0
                        return r0
                }

                @Override // java.security.PrivilegedAction
                @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "Exception should not be rethrown but trigger a fallback.", value = {"REC_CATCH_EXCEPTION"})
                public /* bridge */ /* synthetic */ net.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.Dispatcher.Initializable run() {
                        r1 = this;
                        net.bytebuddy.dynamic.loading.ClassInjector$UsingReflection$Dispatcher$Initializable r0 = r1.run2()
                        return r0
                }

                @Override // java.security.PrivilegedAction
                @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "Exception should not be rethrown but trigger a fallback.", value = {"REC_CATCH_EXCEPTION"})
                /* JADX INFO: renamed from: run, reason: avoid collision after fix types in other method */
                public net.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.Dispatcher.Initializable run2() {
                        r2 = this;
                        boolean r0 = net.bytebuddy.utility.JavaModule.isSupported()     // Catch: java.lang.Exception -> L11 java.lang.reflect.InvocationTargetException -> L13
                        if (r0 == 0) goto L1a
                        boolean r0 = net.bytebuddy.dynamic.loading.ClassInjector.UsingUnsafe.isAvailable()     // Catch: java.lang.Exception -> L11 java.lang.reflect.InvocationTargetException -> L13
                        if (r0 == 0) goto L15
                        net.bytebuddy.dynamic.loading.ClassInjector$UsingReflection$Dispatcher$Initializable r0 = net.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.Dispatcher.UsingUnsafeInjection.make()     // Catch: java.lang.Exception -> L11 java.lang.reflect.InvocationTargetException -> L13
                        goto L19
                    L11:
                        r0 = move-exception
                        goto L1f
                    L13:
                        r0 = move-exception
                        goto L29
                    L15:
                        net.bytebuddy.dynamic.loading.ClassInjector$UsingReflection$Dispatcher$Initializable r0 = net.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.Dispatcher.UsingUnsafeOverride.make()     // Catch: java.lang.Exception -> L11 java.lang.reflect.InvocationTargetException -> L13
                    L19:
                        return r0
                    L1a:
                        net.bytebuddy.dynamic.loading.ClassInjector$UsingReflection$Dispatcher$Initializable r0 = net.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.Dispatcher.Direct.make()     // Catch: java.lang.Exception -> L11 java.lang.reflect.InvocationTargetException -> L13
                        return r0
                    L1f:
                        net.bytebuddy.dynamic.loading.ClassInjector$UsingReflection$Dispatcher$Initializable$Unavailable r1 = new net.bytebuddy.dynamic.loading.ClassInjector$UsingReflection$Dispatcher$Initializable$Unavailable
                        java.lang.String r0 = r0.getMessage()
                        r1.<init>(r0)
                        return r1
                    L29:
                        net.bytebuddy.dynamic.loading.ClassInjector$UsingReflection$Dispatcher$Initializable$Unavailable r1 = new net.bytebuddy.dynamic.loading.ClassInjector$UsingReflection$Dispatcher$Initializable$Unavailable
                        java.lang.Throwable r0 = r0.getTargetException()
                        java.lang.String r0 = r0.getMessage()
                        r1.<init>(r0)
                        return r1
                }
            }

            @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
            public static abstract class Direct implements net.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.Dispatcher, net.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.Dispatcher.Initializable {
                protected final java.lang.reflect.Method defineClass;
                protected final java.lang.reflect.Method definePackage;
                protected final java.lang.reflect.Method findLoadedClass;

                @net.bytebuddy.utility.nullability.UnknownNull
                protected final java.lang.reflect.Method getDefinedPackage;
                protected final java.lang.reflect.Method getPackage;

                @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
                public static class ForJava7CapableVm extends net.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.Dispatcher.Direct {
                    private final java.lang.reflect.Method getClassLoadingLock;

                    public ForJava7CapableVm(java.lang.reflect.Method r1, java.lang.reflect.Method r2, @net.bytebuddy.utility.nullability.MaybeNull java.lang.reflect.Method r3, java.lang.reflect.Method r4, java.lang.reflect.Method r5, java.lang.reflect.Method r6) {
                            r0 = this;
                            r0.<init>(r1, r2, r3, r4, r5)
                            r0.getClassLoadingLock = r6
                            return
                    }

                    @Override // net.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.Dispatcher.Direct
                    public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r5) {
                            r4 = this;
                            boolean r0 = super.equals(r5)
                            r1 = 0
                            if (r0 != 0) goto L8
                            return r1
                        L8:
                            r0 = 1
                            if (r4 != r5) goto Lc
                            return r0
                        Lc:
                            if (r5 != 0) goto Lf
                            return r1
                        Lf:
                            java.lang.Class r2 = r4.getClass()
                            java.lang.Class r3 = r5.getClass()
                            if (r2 == r3) goto L1a
                            return r1
                        L1a:
                            java.lang.reflect.Method r2 = r4.getClassLoadingLock
                            net.bytebuddy.dynamic.loading.ClassInjector$UsingReflection$Dispatcher$Direct$ForJava7CapableVm r5 = (net.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.Dispatcher.Direct.ForJava7CapableVm) r5
                            java.lang.reflect.Method r5 = r5.getClassLoadingLock
                            boolean r5 = r2.equals(r5)
                            if (r5 != 0) goto L27
                            return r1
                        L27:
                            return r0
                    }

                    @Override // net.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.Dispatcher
                    public java.lang.Object getClassLoadingLock(java.lang.ClassLoader r2, java.lang.String r3) {
                            r1 = this;
                            java.lang.reflect.Method r0 = r1.getClassLoadingLock     // Catch: java.lang.reflect.InvocationTargetException -> Lb java.lang.IllegalAccessException -> Ld
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

                    @Override // net.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.Dispatcher.Direct
                    public int hashCode() {
                            r2 = this;
                            int r0 = super.hashCode()
                            int r0 = r0 * 31
                            java.lang.reflect.Method r1 = r2.getClassLoadingLock
                            int r1 = r1.hashCode()
                            int r0 = r0 + r1
                            return r0
                    }
                }

                public static class ForLegacyVm extends net.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.Dispatcher.Direct {
                    public ForLegacyVm(java.lang.reflect.Method r1, java.lang.reflect.Method r2, @net.bytebuddy.utility.nullability.MaybeNull java.lang.reflect.Method r3, java.lang.reflect.Method r4, java.lang.reflect.Method r5) {
                            r0 = this;
                            r0.<init>(r1, r2, r3, r4, r5)
                            return
                    }

                    @Override // net.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.Dispatcher
                    public java.lang.Object getClassLoadingLock(java.lang.ClassLoader r1, java.lang.String r2) {
                            r0 = this;
                            return r1
                    }
                }

                public Direct(java.lang.reflect.Method r1, java.lang.reflect.Method r2, @net.bytebuddy.utility.nullability.MaybeNull java.lang.reflect.Method r3, java.lang.reflect.Method r4, java.lang.reflect.Method r5) {
                        r0 = this;
                        r0.<init>()
                        r0.findLoadedClass = r1
                        r0.defineClass = r2
                        r0.getDefinedPackage = r3
                        r0.getPackage = r4
                        r0.definePackage = r5
                        return
                }

                @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "Assuring privilege is explicit user responsibility.", value = {"DP_DO_INSIDE_DO_PRIVILEGED"})
                public static net.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.Dispatcher.Initializable make() throws java.lang.Exception {
                        boolean r0 = net.bytebuddy.utility.JavaModule.isSupported()
                        r1 = 0
                        java.lang.Class<java.lang.String> r2 = java.lang.String.class
                        java.lang.Class<java.lang.ClassLoader> r3 = java.lang.ClassLoader.class
                        if (r0 == 0) goto L15
                        java.lang.String r0 = "getDefinedPackage"
                        java.lang.Class[] r4 = new java.lang.Class[]{r2}     // Catch: java.lang.NoSuchMethodException -> L15
                        java.lang.reflect.Method r1 = r3.getMethod(r0, r4)     // Catch: java.lang.NoSuchMethodException -> L15
                    L15:
                        java.lang.String r0 = "getPackage"
                        java.lang.Class[] r4 = new java.lang.Class[]{r2}
                        java.lang.reflect.Method r0 = r3.getDeclaredMethod(r0, r4)
                        r4 = 1
                        r0.setAccessible(r4)
                        java.lang.String r5 = "findLoadedClass"
                        java.lang.Class[] r6 = new java.lang.Class[]{r2}
                        java.lang.reflect.Method r11 = r3.getDeclaredMethod(r5, r6)
                        r11.setAccessible(r4)
                        java.lang.Class r5 = java.lang.Integer.TYPE
                        java.lang.Class<java.security.ProtectionDomain> r6 = java.security.ProtectionDomain.class
                        java.lang.Class<byte[]> r7 = byte[].class
                        java.lang.Class[] r5 = new java.lang.Class[]{r2, r7, r5, r5, r6}
                        java.lang.String r6 = "defineClass"
                        java.lang.reflect.Method r12 = r3.getDeclaredMethod(r6, r5)
                        r12.setAccessible(r4)
                        java.lang.Class<java.lang.String> r19 = java.lang.String.class
                        java.lang.Class<java.net.URL> r20 = java.net.URL.class
                        java.lang.Class<java.lang.String> r13 = java.lang.String.class
                        java.lang.Class<java.lang.String> r14 = java.lang.String.class
                        java.lang.Class<java.lang.String> r15 = java.lang.String.class
                        java.lang.Class<java.lang.String> r16 = java.lang.String.class
                        java.lang.Class<java.lang.String> r17 = java.lang.String.class
                        java.lang.Class<java.lang.String> r18 = java.lang.String.class
                        java.lang.Class[] r5 = new java.lang.Class[]{r13, r14, r15, r16, r17, r18, r19, r20}
                        java.lang.String r6 = "definePackage"
                        java.lang.reflect.Method r13 = r3.getDeclaredMethod(r6, r5)
                        r13.setAccessible(r4)
                        java.lang.String r5 = "getClassLoadingLock"
                        java.lang.Class[] r2 = new java.lang.Class[]{r2}     // Catch: java.lang.NoSuchMethodException -> L79
                        java.lang.reflect.Method r10 = r3.getDeclaredMethod(r5, r2)     // Catch: java.lang.NoSuchMethodException -> L79
                        r10.setAccessible(r4)     // Catch: java.lang.NoSuchMethodException -> L79
                        net.bytebuddy.dynamic.loading.ClassInjector$UsingReflection$Dispatcher$Direct$ForJava7CapableVm r2 = new net.bytebuddy.dynamic.loading.ClassInjector$UsingReflection$Dispatcher$Direct$ForJava7CapableVm     // Catch: java.lang.NoSuchMethodException -> L79
                        r4 = r2
                        r5 = r11
                        r6 = r12
                        r7 = r1
                        r8 = r0
                        r9 = r13
                        r4.<init>(r5, r6, r7, r8, r9, r10)     // Catch: java.lang.NoSuchMethodException -> L79
                        return r2
                    L79:
                        net.bytebuddy.dynamic.loading.ClassInjector$UsingReflection$Dispatcher$Direct$ForLegacyVm r2 = new net.bytebuddy.dynamic.loading.ClassInjector$UsingReflection$Dispatcher$Direct$ForLegacyVm
                        r4 = r2
                        r5 = r11
                        r6 = r12
                        r7 = r1
                        r8 = r0
                        r9 = r13
                        r4.<init>(r5, r6, r7, r8, r9)
                        return r2
                }

                @Override // net.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.Dispatcher
                public java.lang.Class<?> defineClass(java.lang.ClassLoader r4, java.lang.String r5, byte[] r6, @net.bytebuddy.utility.nullability.MaybeNull java.security.ProtectionDomain r7) {
                        r3 = this;
                        java.lang.reflect.Method r0 = r3.defineClass     // Catch: java.lang.reflect.InvocationTargetException -> L17 java.lang.IllegalAccessException -> L19
                        r1 = 0
                        java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.reflect.InvocationTargetException -> L17 java.lang.IllegalAccessException -> L19
                        int r2 = r6.length     // Catch: java.lang.reflect.InvocationTargetException -> L17 java.lang.IllegalAccessException -> L19
                        java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.reflect.InvocationTargetException -> L17 java.lang.IllegalAccessException -> L19
                        java.lang.Object[] r5 = new java.lang.Object[]{r5, r6, r1, r2, r7}     // Catch: java.lang.reflect.InvocationTargetException -> L17 java.lang.IllegalAccessException -> L19
                        java.lang.Object r4 = r0.invoke(r4, r5)     // Catch: java.lang.reflect.InvocationTargetException -> L17 java.lang.IllegalAccessException -> L19
                        java.lang.Class r4 = (java.lang.Class) r4     // Catch: java.lang.reflect.InvocationTargetException -> L17 java.lang.IllegalAccessException -> L19
                        return r4
                    L17:
                        r4 = move-exception
                        goto L1b
                    L19:
                        r4 = move-exception
                        goto L25
                    L1b:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.Throwable r4 = r4.getTargetException()
                        r5.<init>(r4)
                        throw r5
                    L25:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        r5.<init>(r4)
                        throw r5
                }

                @Override // net.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.Dispatcher
                public java.lang.Package definePackage(java.lang.ClassLoader r2, java.lang.String r3, @net.bytebuddy.utility.nullability.MaybeNull java.lang.String r4, @net.bytebuddy.utility.nullability.MaybeNull java.lang.String r5, @net.bytebuddy.utility.nullability.MaybeNull java.lang.String r6, @net.bytebuddy.utility.nullability.MaybeNull java.lang.String r7, @net.bytebuddy.utility.nullability.MaybeNull java.lang.String r8, @net.bytebuddy.utility.nullability.MaybeNull java.lang.String r9, @net.bytebuddy.utility.nullability.MaybeNull java.net.URL r10) {
                        r1 = this;
                        java.lang.reflect.Method r0 = r1.definePackage     // Catch: java.lang.reflect.InvocationTargetException -> Ld java.lang.IllegalAccessException -> Lf
                        java.lang.Object[] r3 = new java.lang.Object[]{r3, r4, r5, r6, r7, r8, r9, r10}     // Catch: java.lang.reflect.InvocationTargetException -> Ld java.lang.IllegalAccessException -> Lf
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
                        java.lang.reflect.Method r2 = r4.findLoadedClass
                        net.bytebuddy.dynamic.loading.ClassInjector$UsingReflection$Dispatcher$Direct r5 = (net.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.Dispatcher.Direct) r5
                        java.lang.reflect.Method r3 = r5.findLoadedClass
                        boolean r2 = r2.equals(r3)
                        if (r2 != 0) goto L20
                        return r1
                    L20:
                        java.lang.reflect.Method r2 = r4.defineClass
                        java.lang.reflect.Method r3 = r5.defineClass
                        boolean r2 = r2.equals(r3)
                        if (r2 != 0) goto L2b
                        return r1
                    L2b:
                        java.lang.reflect.Method r2 = r4.getDefinedPackage
                        java.lang.reflect.Method r3 = r5.getDefinedPackage
                        boolean r2 = r2.equals(r3)
                        if (r2 != 0) goto L36
                        return r1
                    L36:
                        java.lang.reflect.Method r2 = r4.getPackage
                        java.lang.reflect.Method r3 = r5.getPackage
                        boolean r2 = r2.equals(r3)
                        if (r2 != 0) goto L41
                        return r1
                    L41:
                        java.lang.reflect.Method r2 = r4.definePackage
                        java.lang.reflect.Method r5 = r5.definePackage
                        boolean r5 = r2.equals(r5)
                        if (r5 != 0) goto L4c
                        return r1
                    L4c:
                        return r0
                }

                @Override // net.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.Dispatcher
                public java.lang.Class<?> findClass(java.lang.ClassLoader r2, java.lang.String r3) {
                        r1 = this;
                        java.lang.reflect.Method r0 = r1.findLoadedClass     // Catch: java.lang.reflect.InvocationTargetException -> Ld java.lang.IllegalAccessException -> Lf
                        java.lang.Object[] r3 = new java.lang.Object[]{r3}     // Catch: java.lang.reflect.InvocationTargetException -> Ld java.lang.IllegalAccessException -> Lf
                        java.lang.Object r2 = r0.invoke(r2, r3)     // Catch: java.lang.reflect.InvocationTargetException -> Ld java.lang.IllegalAccessException -> Lf
                        java.lang.Class r2 = (java.lang.Class) r2     // Catch: java.lang.reflect.InvocationTargetException -> Ld java.lang.IllegalAccessException -> Lf
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

                @Override // net.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.Dispatcher
                @net.bytebuddy.utility.nullability.MaybeNull
                public java.lang.Package getDefinedPackage(java.lang.ClassLoader r2, java.lang.String r3) {
                        r1 = this;
                        java.lang.reflect.Method r0 = r1.getDefinedPackage
                        if (r0 != 0) goto L9
                        java.lang.Package r2 = r1.getPackage(r2, r3)
                        return r2
                    L9:
                        java.lang.Object[] r3 = new java.lang.Object[]{r3}     // Catch: java.lang.reflect.InvocationTargetException -> L14 java.lang.IllegalAccessException -> L16
                        java.lang.Object r2 = r0.invoke(r2, r3)     // Catch: java.lang.reflect.InvocationTargetException -> L14 java.lang.IllegalAccessException -> L16
                        java.lang.Package r2 = (java.lang.Package) r2     // Catch: java.lang.reflect.InvocationTargetException -> L14 java.lang.IllegalAccessException -> L16
                        return r2
                    L14:
                        r2 = move-exception
                        goto L18
                    L16:
                        r2 = move-exception
                        goto L22
                    L18:
                        java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                        java.lang.Throwable r2 = r2.getTargetException()
                        r3.<init>(r2)
                        throw r3
                    L22:
                        java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                        r3.<init>(r2)
                        throw r3
                }

                @Override // net.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.Dispatcher
                public java.lang.Package getPackage(java.lang.ClassLoader r2, java.lang.String r3) {
                        r1 = this;
                        java.lang.reflect.Method r0 = r1.getPackage     // Catch: java.lang.reflect.InvocationTargetException -> Ld java.lang.IllegalAccessException -> Lf
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

                public int hashCode() {
                        r2 = this;
                        java.lang.Class r0 = r2.getClass()
                        int r0 = r0.hashCode()
                        int r0 = r0 * 31
                        java.lang.reflect.Method r1 = r2.findLoadedClass
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        int r0 = r0 * 31
                        java.lang.reflect.Method r1 = r2.defineClass
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        int r0 = r0 * 31
                        java.lang.reflect.Method r1 = r2.getDefinedPackage
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        int r0 = r0 * 31
                        java.lang.reflect.Method r1 = r2.getPackage
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        int r0 = r0 * 31
                        java.lang.reflect.Method r1 = r2.definePackage
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        return r0
                }

                @Override // net.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.Dispatcher.Initializable
                public net.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.Dispatcher initialize() {
                        r3 = this;
                        net.bytebuddy.dynamic.loading.ClassInjector$UsingReflection$System r0 = net.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.access$000()
                        java.lang.Object r0 = r0.getSecurityManager()
                        if (r0 == 0) goto L34
                        java.lang.reflect.Method r1 = net.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.access$100()     // Catch: java.lang.Exception -> L18 java.lang.reflect.InvocationTargetException -> L1a
                        java.security.Permission r2 = net.bytebuddy.dynamic.loading.ClassInjector.SUPPRESS_ACCESS_CHECKS     // Catch: java.lang.Exception -> L18 java.lang.reflect.InvocationTargetException -> L1a
                        java.lang.Object[] r2 = new java.lang.Object[]{r2}     // Catch: java.lang.Exception -> L18 java.lang.reflect.InvocationTargetException -> L1a
                        r1.invoke(r0, r2)     // Catch: java.lang.Exception -> L18 java.lang.reflect.InvocationTargetException -> L1a
                        goto L34
                    L18:
                        r0 = move-exception
                        goto L1c
                    L1a:
                        r0 = move-exception
                        goto L26
                    L1c:
                        net.bytebuddy.dynamic.loading.ClassInjector$UsingReflection$Dispatcher$Unavailable r1 = new net.bytebuddy.dynamic.loading.ClassInjector$UsingReflection$Dispatcher$Unavailable
                        java.lang.String r0 = r0.getMessage()
                        r1.<init>(r0)
                        return r1
                    L26:
                        net.bytebuddy.dynamic.loading.ClassInjector$UsingReflection$Dispatcher$Unavailable r1 = new net.bytebuddy.dynamic.loading.ClassInjector$UsingReflection$Dispatcher$Unavailable
                        java.lang.Throwable r0 = r0.getTargetException()
                        java.lang.String r0 = r0.getMessage()
                        r1.<init>(r0)
                        return r1
                    L34:
                        return r3
                }

                @Override // net.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.Dispatcher.Initializable
                public boolean isAvailable() {
                        r1 = this;
                        r0 = 1
                        return r0
                }
            }

            public interface Initializable {

                @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
                public static class Unavailable implements net.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.Dispatcher, net.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.Dispatcher.Initializable {
                    private final java.lang.String message;

                    public Unavailable(java.lang.String r1) {
                            r0 = this;
                            r0.<init>()
                            r0.message = r1
                            return
                    }

                    @Override // net.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.Dispatcher
                    public java.lang.Class<?> defineClass(java.lang.ClassLoader r1, java.lang.String r2, byte[] r3, @net.bytebuddy.utility.nullability.MaybeNull java.security.ProtectionDomain r4) {
                            r0 = this;
                            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                            java.lang.StringBuilder r2 = new java.lang.StringBuilder
                            r2.<init>()
                            java.lang.String r3 = "Cannot define class using reflection: "
                            r2.append(r3)
                            java.lang.String r3 = r0.message
                            r2.append(r3)
                            java.lang.String r2 = r2.toString()
                            r1.<init>(r2)
                            throw r1
                    }

                    @Override // net.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.Dispatcher
                    public java.lang.Package definePackage(java.lang.ClassLoader r1, java.lang.String r2, @net.bytebuddy.utility.nullability.MaybeNull java.lang.String r3, @net.bytebuddy.utility.nullability.MaybeNull java.lang.String r4, @net.bytebuddy.utility.nullability.MaybeNull java.lang.String r5, @net.bytebuddy.utility.nullability.MaybeNull java.lang.String r6, @net.bytebuddy.utility.nullability.MaybeNull java.lang.String r7, @net.bytebuddy.utility.nullability.MaybeNull java.lang.String r8, @net.bytebuddy.utility.nullability.MaybeNull java.net.URL r9) {
                            r0 = this;
                            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                            java.lang.StringBuilder r2 = new java.lang.StringBuilder
                            r2.<init>()
                            java.lang.String r3 = "Cannot define package using injection: "
                            r2.append(r3)
                            java.lang.String r3 = r0.message
                            r2.append(r3)
                            java.lang.String r2 = r2.toString()
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
                            java.lang.String r2 = r4.message
                            net.bytebuddy.dynamic.loading.ClassInjector$UsingReflection$Dispatcher$Initializable$Unavailable r5 = (net.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.Dispatcher.Initializable.Unavailable) r5
                            java.lang.String r5 = r5.message
                            boolean r5 = r2.equals(r5)
                            if (r5 != 0) goto L20
                            return r1
                        L20:
                            return r0
                    }

                    @Override // net.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.Dispatcher
                    public java.lang.Class<?> findClass(java.lang.ClassLoader r1, java.lang.String r2) {
                            r0 = this;
                            java.lang.Class r1 = r1.loadClass(r2)     // Catch: java.lang.ClassNotFoundException -> L5
                            return r1
                        L5:
                            java.lang.Class<?> r1 = net.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.Dispatcher.UNDEFINED
                            return r1
                    }

                    @Override // net.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.Dispatcher
                    public java.lang.Object getClassLoadingLock(java.lang.ClassLoader r1, java.lang.String r2) {
                            r0 = this;
                            return r1
                    }

                    @Override // net.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.Dispatcher
                    public java.lang.Package getDefinedPackage(java.lang.ClassLoader r2, java.lang.String r3) {
                            r1 = this;
                            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
                            java.lang.StringBuilder r3 = new java.lang.StringBuilder
                            r3.<init>()
                            java.lang.String r0 = "Cannot get defined package using reflection: "
                            r3.append(r0)
                            java.lang.String r0 = r1.message
                            r3.append(r0)
                            java.lang.String r3 = r3.toString()
                            r2.<init>(r3)
                            throw r2
                    }

                    @Override // net.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.Dispatcher
                    public java.lang.Package getPackage(java.lang.ClassLoader r2, java.lang.String r3) {
                            r1 = this;
                            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
                            java.lang.StringBuilder r3 = new java.lang.StringBuilder
                            r3.<init>()
                            java.lang.String r0 = "Cannot get package using reflection: "
                            r3.append(r0)
                            java.lang.String r0 = r1.message
                            r3.append(r0)
                            java.lang.String r3 = r3.toString()
                            r2.<init>(r3)
                            throw r2
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

                    @Override // net.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.Dispatcher.Initializable
                    public net.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.Dispatcher initialize() {
                            r0 = this;
                            return r0
                    }

                    @Override // net.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.Dispatcher.Initializable
                    public boolean isAvailable() {
                            r1 = this;
                            r0 = 0
                            return r0
                    }
                }

                net.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.Dispatcher initialize();

                boolean isAvailable();
            }

            @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
            public static class Unavailable implements net.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.Dispatcher {
                private final java.lang.String message;

                public Unavailable(java.lang.String r1) {
                        r0 = this;
                        r0.<init>()
                        r0.message = r1
                        return
                }

                @Override // net.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.Dispatcher
                public java.lang.Class<?> defineClass(java.lang.ClassLoader r1, java.lang.String r2, byte[] r3, @net.bytebuddy.utility.nullability.MaybeNull java.security.ProtectionDomain r4) {
                        r0 = this;
                        java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                        java.lang.StringBuilder r2 = new java.lang.StringBuilder
                        r2.<init>()
                        java.lang.String r3 = "Cannot define class using reflection: "
                        r2.append(r3)
                        java.lang.String r3 = r0.message
                        r2.append(r3)
                        java.lang.String r2 = r2.toString()
                        r1.<init>(r2)
                        throw r1
                }

                @Override // net.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.Dispatcher
                public java.lang.Package definePackage(java.lang.ClassLoader r1, java.lang.String r2, @net.bytebuddy.utility.nullability.MaybeNull java.lang.String r3, @net.bytebuddy.utility.nullability.MaybeNull java.lang.String r4, @net.bytebuddy.utility.nullability.MaybeNull java.lang.String r5, @net.bytebuddy.utility.nullability.MaybeNull java.lang.String r6, @net.bytebuddy.utility.nullability.MaybeNull java.lang.String r7, @net.bytebuddy.utility.nullability.MaybeNull java.lang.String r8, @net.bytebuddy.utility.nullability.MaybeNull java.net.URL r9) {
                        r0 = this;
                        java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                        java.lang.StringBuilder r2 = new java.lang.StringBuilder
                        r2.<init>()
                        java.lang.String r3 = "Cannot define package using injection: "
                        r2.append(r3)
                        java.lang.String r3 = r0.message
                        r2.append(r3)
                        java.lang.String r2 = r2.toString()
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
                        java.lang.String r2 = r4.message
                        net.bytebuddy.dynamic.loading.ClassInjector$UsingReflection$Dispatcher$Unavailable r5 = (net.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.Dispatcher.Unavailable) r5
                        java.lang.String r5 = r5.message
                        boolean r5 = r2.equals(r5)
                        if (r5 != 0) goto L20
                        return r1
                    L20:
                        return r0
                }

                @Override // net.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.Dispatcher
                public java.lang.Class<?> findClass(java.lang.ClassLoader r1, java.lang.String r2) {
                        r0 = this;
                        java.lang.Class r1 = r1.loadClass(r2)     // Catch: java.lang.ClassNotFoundException -> L5
                        return r1
                    L5:
                        java.lang.Class<?> r1 = net.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.Dispatcher.UNDEFINED
                        return r1
                }

                @Override // net.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.Dispatcher
                public java.lang.Object getClassLoadingLock(java.lang.ClassLoader r1, java.lang.String r2) {
                        r0 = this;
                        return r1
                }

                @Override // net.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.Dispatcher
                public java.lang.Package getDefinedPackage(java.lang.ClassLoader r2, java.lang.String r3) {
                        r1 = this;
                        java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
                        java.lang.StringBuilder r3 = new java.lang.StringBuilder
                        r3.<init>()
                        java.lang.String r0 = "Cannot get defined package using reflection: "
                        r3.append(r0)
                        java.lang.String r0 = r1.message
                        r3.append(r0)
                        java.lang.String r3 = r3.toString()
                        r2.<init>(r3)
                        throw r2
                }

                @Override // net.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.Dispatcher
                public java.lang.Package getPackage(java.lang.ClassLoader r2, java.lang.String r3) {
                        r1 = this;
                        java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
                        java.lang.StringBuilder r3 = new java.lang.StringBuilder
                        r3.<init>()
                        java.lang.String r0 = "Cannot get package using reflection: "
                        r3.append(r0)
                        java.lang.String r0 = r1.message
                        r3.append(r0)
                        java.lang.String r3 = r3.toString()
                        r2.<init>(r3)
                        throw r2
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
            }

            @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
            public static class UsingUnsafeInjection implements net.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.Dispatcher, net.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.Dispatcher.Initializable {
                private final java.lang.Object accessor;
                private final java.lang.reflect.Method defineClass;
                private final java.lang.reflect.Method definePackage;
                private final java.lang.reflect.Method findLoadedClass;
                private final java.lang.reflect.Method getClassLoadingLock;

                @net.bytebuddy.utility.nullability.UnknownNull
                private final java.lang.reflect.Method getDefinedPackage;
                private final java.lang.reflect.Method getPackage;

                public UsingUnsafeInjection(java.lang.Object r1, java.lang.reflect.Method r2, java.lang.reflect.Method r3, @net.bytebuddy.utility.nullability.MaybeNull java.lang.reflect.Method r4, java.lang.reflect.Method r5, java.lang.reflect.Method r6, java.lang.reflect.Method r7) {
                        r0 = this;
                        r0.<init>()
                        r0.accessor = r1
                        r0.findLoadedClass = r2
                        r0.defineClass = r3
                        r0.getDefinedPackage = r4
                        r0.getPackage = r5
                        r0.definePackage = r6
                        r0.getClassLoadingLock = r7
                        return
                }

                @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "Assuring privilege is explicit user responsibility.", value = {"DP_DO_INSIDE_DO_PRIVILEGED"})
                public static net.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.Dispatcher.Initializable make() throws java.lang.Exception {
                        java.lang.String r1 = "definePackage"
                        java.lang.String r2 = "getPackage"
                        java.lang.Class<java.security.ProtectionDomain> r3 = java.security.ProtectionDomain.class
                        java.lang.Class<byte[]> r4 = byte[].class
                        java.lang.String r5 = "defineClass"
                        java.lang.String r6 = "findLoadedClass"
                        java.lang.Class<java.lang.ClassLoader> r9 = java.lang.ClassLoader.class
                        java.lang.Class<java.lang.String> r10 = java.lang.String.class
                        r7 = 1
                        java.lang.String r0 = "getClassLoadingLock"
                        net.bytebuddy.utility.GraalImageCode r18 = net.bytebuddy.utility.GraalImageCode.getCurrent()
                        boolean r18 = r18.isDefined()
                        java.lang.String r11 = java.lang.Boolean.toString(r18)
                        java.lang.String r12 = "net.bytebuddy.safe"
                        java.lang.String r11 = java.lang.System.getProperty(r12, r11)
                        boolean r11 = java.lang.Boolean.parseBoolean(r11)
                        if (r11 == 0) goto L33
                        net.bytebuddy.dynamic.loading.ClassInjector$UsingReflection$Dispatcher$Initializable$Unavailable r0 = new net.bytebuddy.dynamic.loading.ClassInjector$UsingReflection$Dispatcher$Initializable$Unavailable
                        java.lang.String r1 = "Use of Unsafe was disabled by system property"
                        r0.<init>(r1)
                        return r0
                    L33:
                        java.lang.String r11 = "sun.misc.Unsafe"
                        java.lang.Class r11 = java.lang.Class.forName(r11)
                        java.lang.String r12 = "theUnsafe"
                        java.lang.reflect.Field r12 = r11.getDeclaredField(r12)
                        r12.setAccessible(r7)
                        r13 = 0
                        java.lang.Object r12 = r12.get(r13)
                        boolean r21 = net.bytebuddy.utility.JavaModule.isSupported()
                        java.lang.String r13 = "getDefinedPackage"
                        if (r21 == 0) goto L58
                        java.lang.Class[] r8 = new java.lang.Class[]{r10}     // Catch: java.lang.NoSuchMethodException -> L58
                        java.lang.reflect.Method r8 = r9.getDeclaredMethod(r13, r8)     // Catch: java.lang.NoSuchMethodException -> L58
                        goto L59
                    L58:
                        r8 = 0
                    L59:
                        net.bytebuddy.ByteBuddy r14 = new net.bytebuddy.ByteBuddy
                        r14.<init>()
                        net.bytebuddy.dynamic.scaffold.TypeValidation r15 = net.bytebuddy.dynamic.scaffold.TypeValidation.DISABLED
                        net.bytebuddy.ByteBuddy r14 = r14.with(r15)
                        net.bytebuddy.dynamic.scaffold.subclass.ConstructorStrategy$Default r15 = net.bytebuddy.dynamic.scaffold.subclass.ConstructorStrategy.Default.NO_CONSTRUCTORS
                        java.lang.Class<java.lang.Object> r7 = java.lang.Object.class
                        net.bytebuddy.dynamic.DynamicType$Builder r14 = r14.subclass(r7, r15)
                        java.lang.StringBuilder r15 = new java.lang.StringBuilder
                        r15.<init>()
                        r26 = r12
                        java.lang.String r12 = r9.getName()
                        r15.append(r12)
                        java.lang.String r12 = "$ByteBuddyAccessor$V1"
                        r15.append(r12)
                        java.lang.String r12 = r15.toString()
                        net.bytebuddy.dynamic.DynamicType$Builder r12 = r14.name(r12)
                        net.bytebuddy.description.modifier.Visibility r14 = net.bytebuddy.description.modifier.Visibility.PUBLIC
                        r27 = r11
                        r15 = 1
                        net.bytebuddy.description.modifier.ModifierContributor$ForMethod[] r11 = new net.bytebuddy.description.modifier.ModifierContributor.ForMethod[r15]
                        r15 = 0
                        r11[r15] = r14
                        java.lang.Class<java.lang.Class> r15 = java.lang.Class.class
                        net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ParameterDefinition$Initial r11 = r12.defineMethod(r6, r15, r11)
                        r12 = 2
                        r28 = r0
                        java.lang.reflect.Type[] r0 = new java.lang.reflect.Type[r12]
                        r12 = 0
                        r0[r12] = r9
                        r12 = 1
                        r0[r12] = r10
                        net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ExceptionDefinition r0 = r11.withParameters(r0)
                        java.lang.Class[] r11 = new java.lang.Class[]{r10}
                        java.lang.reflect.Method r11 = r9.getDeclaredMethod(r6, r11)
                        net.bytebuddy.implementation.MethodCall$WithoutSpecifiedTarget r11 = net.bytebuddy.implementation.MethodCall.invoke(r11)
                        r29 = r6
                        r6 = 0
                        net.bytebuddy.implementation.MethodCall r11 = r11.onArgument(r6)
                        int[] r6 = new int[]{r12}
                        net.bytebuddy.implementation.MethodCall r6 = r11.withArgument(r6)
                        net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition r0 = r0.intercept(r6)
                        net.bytebuddy.description.modifier.ModifierContributor$ForMethod[] r6 = new net.bytebuddy.description.modifier.ModifierContributor.ForMethod[r12]
                        r11 = 0
                        r6[r11] = r14
                        net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ParameterDefinition$Initial r0 = r0.defineMethod(r5, r15, r6)
                        java.lang.Class r6 = java.lang.Integer.TYPE
                        r30 = r15
                        r12 = 6
                        java.lang.reflect.Type[] r15 = new java.lang.reflect.Type[r12]
                        r15[r11] = r9
                        r12 = 1
                        r15[r12] = r10
                        r12 = 2
                        r15[r12] = r4
                        r12 = 3
                        r15[r12] = r6
                        r12 = 4
                        r15[r12] = r6
                        r12 = 5
                        r15[r12] = r3
                        net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ExceptionDefinition r0 = r0.withParameters(r15)
                        java.lang.Class[] r3 = new java.lang.Class[]{r10, r4, r6, r6, r3}
                        java.lang.reflect.Method r3 = r9.getDeclaredMethod(r5, r3)
                        net.bytebuddy.implementation.MethodCall$WithoutSpecifiedTarget r3 = net.bytebuddy.implementation.MethodCall.invoke(r3)
                        net.bytebuddy.implementation.MethodCall r3 = r3.onArgument(r11)
                        r31 = r5
                        r4 = 1
                        r6 = 2
                        r11 = 4
                        r15 = 3
                        int[] r5 = new int[]{r4, r6, r15, r11, r12}
                        net.bytebuddy.implementation.MethodCall r3 = r3.withArgument(r5)
                        net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition r0 = r0.intercept(r3)
                        net.bytebuddy.description.modifier.ModifierContributor$ForMethod[] r3 = new net.bytebuddy.description.modifier.ModifierContributor.ForMethod[r4]
                        r5 = 0
                        r3[r5] = r14
                        java.lang.Class<java.lang.Package> r11 = java.lang.Package.class
                        net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ParameterDefinition$Initial r0 = r0.defineMethod(r2, r11, r3)
                        java.lang.reflect.Type[] r3 = new java.lang.reflect.Type[r6]
                        r3[r5] = r9
                        r3[r4] = r10
                        net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ExceptionDefinition r0 = r0.withParameters(r3)
                        java.lang.Class[] r3 = new java.lang.Class[]{r10}
                        java.lang.reflect.Method r3 = r9.getDeclaredMethod(r2, r3)
                        net.bytebuddy.implementation.MethodCall$WithoutSpecifiedTarget r3 = net.bytebuddy.implementation.MethodCall.invoke(r3)
                        net.bytebuddy.implementation.MethodCall r3 = r3.onArgument(r5)
                        int[] r6 = new int[]{r4}
                        net.bytebuddy.implementation.MethodCall r3 = r3.withArgument(r6)
                        net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition r0 = r0.intercept(r3)
                        net.bytebuddy.description.modifier.ModifierContributor$ForMethod[] r3 = new net.bytebuddy.description.modifier.ModifierContributor.ForMethod[r4]
                        r3[r5] = r14
                        net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ParameterDefinition$Initial r0 = r0.defineMethod(r1, r11, r3)
                        r3 = 9
                        java.lang.reflect.Type[] r3 = new java.lang.reflect.Type[r3]
                        r3[r5] = r9
                        r3[r4] = r10
                        r4 = 2
                        r3[r4] = r10
                        r4 = 3
                        r3[r4] = r10
                        r4 = 4
                        r3[r4] = r10
                        r4 = 5
                        r3[r4] = r10
                        r4 = 6
                        r3[r4] = r10
                        r4 = 7
                        r3[r4] = r10
                        java.lang.Class<java.net.URL> r4 = java.net.URL.class
                        r5 = 8
                        r3[r5] = r4
                        net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ExceptionDefinition r0 = r0.withParameters(r3)
                        java.lang.Class<java.lang.String> r38 = java.lang.String.class
                        java.lang.Class<java.net.URL> r39 = java.net.URL.class
                        java.lang.Class<java.lang.String> r32 = java.lang.String.class
                        java.lang.Class<java.lang.String> r33 = java.lang.String.class
                        java.lang.Class<java.lang.String> r34 = java.lang.String.class
                        java.lang.Class<java.lang.String> r35 = java.lang.String.class
                        java.lang.Class<java.lang.String> r36 = java.lang.String.class
                        java.lang.Class<java.lang.String> r37 = java.lang.String.class
                        java.lang.Class[] r3 = new java.lang.Class[]{r32, r33, r34, r35, r36, r37, r38, r39}
                        java.lang.reflect.Method r3 = r9.getDeclaredMethod(r1, r3)
                        net.bytebuddy.implementation.MethodCall$WithoutSpecifiedTarget r3 = net.bytebuddy.implementation.MethodCall.invoke(r3)
                        r4 = 0
                        net.bytebuddy.implementation.MethodCall r3 = r3.onArgument(r4)
                        r5 = 8
                        int[] r5 = new int[r5]
                        r5 = {x02a6: FILL_ARRAY_DATA , data: [1, 2, 3, 4, 5, 6, 7, 8} // fill-array
                        net.bytebuddy.implementation.MethodCall r3 = r3.withArgument(r5)
                        net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition r0 = r0.intercept(r3)
                        r3 = 1
                        if (r8 == 0) goto L1c3
                        net.bytebuddy.description.modifier.ModifierContributor$ForMethod[] r5 = new net.bytebuddy.description.modifier.ModifierContributor.ForMethod[r3]
                        r5[r4] = r14
                        net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ParameterDefinition$Initial r0 = r0.defineMethod(r13, r11, r5)
                        r5 = 2
                        java.lang.reflect.Type[] r6 = new java.lang.reflect.Type[r5]
                        r6[r4] = r9
                        r6[r3] = r10
                        net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ExceptionDefinition r0 = r0.withParameters(r6)
                        net.bytebuddy.implementation.MethodCall$WithoutSpecifiedTarget r5 = net.bytebuddy.implementation.MethodCall.invoke(r8)
                        net.bytebuddy.implementation.MethodCall r5 = r5.onArgument(r4)
                        int[] r6 = new int[]{r3}
                        net.bytebuddy.implementation.MethodCall r5 = r5.withArgument(r6)
                        net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition r0 = r0.intercept(r5)
                    L1c3:
                        net.bytebuddy.description.modifier.ModifierContributor$ForMethod[] r5 = new net.bytebuddy.description.modifier.ModifierContributor.ForMethod[r3]     // Catch: java.lang.NoSuchMethodException -> L1fb
                        r5[r4] = r14     // Catch: java.lang.NoSuchMethodException -> L1fb
                        r6 = r28
                        net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ParameterDefinition$Initial r5 = r0.defineMethod(r6, r7, r5)     // Catch: java.lang.NoSuchMethodException -> L1fe
                        r11 = 2
                        java.lang.reflect.Type[] r12 = new java.lang.reflect.Type[r11]     // Catch: java.lang.NoSuchMethodException -> L1f7
                        r12[r4] = r9     // Catch: java.lang.NoSuchMethodException -> L1f7
                        r12[r3] = r10     // Catch: java.lang.NoSuchMethodException -> L1f7
                        net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ExceptionDefinition r3 = r5.withParameters(r12)     // Catch: java.lang.NoSuchMethodException -> L1f7
                        java.lang.Class[] r4 = new java.lang.Class[]{r10}     // Catch: java.lang.NoSuchMethodException -> L1f7
                        java.lang.reflect.Method r4 = r9.getDeclaredMethod(r6, r4)     // Catch: java.lang.NoSuchMethodException -> L1f7
                        net.bytebuddy.implementation.MethodCall$WithoutSpecifiedTarget r4 = net.bytebuddy.implementation.MethodCall.invoke(r4)     // Catch: java.lang.NoSuchMethodException -> L1f7
                        r5 = 0
                        net.bytebuddy.implementation.MethodCall r4 = r4.onArgument(r5)     // Catch: java.lang.NoSuchMethodException -> L1f7
                        r5 = 1
                        int[] r11 = new int[]{r5}     // Catch: java.lang.NoSuchMethodException -> L1f9
                        net.bytebuddy.implementation.MethodCall r4 = r4.withArgument(r11)     // Catch: java.lang.NoSuchMethodException -> L1f7
                        net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition r0 = r3.intercept(r4)     // Catch: java.lang.NoSuchMethodException -> L1f7
                        goto L21c
                    L1f7:
                        r3 = 1
                        goto L1fe
                    L1f9:
                        r3 = r5
                        goto L1fe
                    L1fb:
                        r6 = r28
                        goto L1f7
                    L1fe:
                        net.bytebuddy.description.modifier.ModifierContributor$ForMethod[] r4 = new net.bytebuddy.description.modifier.ModifierContributor.ForMethod[r3]
                        net.bytebuddy.description.modifier.Visibility r5 = net.bytebuddy.description.modifier.Visibility.PUBLIC
                        r11 = 0
                        r4[r11] = r5
                        net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ParameterDefinition$Initial r0 = r0.defineMethod(r6, r7, r4)
                        r4 = 2
                        java.lang.reflect.Type[] r4 = new java.lang.reflect.Type[r4]
                        r4[r11] = r9
                        r4[r3] = r10
                        net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ExceptionDefinition r0 = r0.withParameters(r4)
                        net.bytebuddy.implementation.FixedValue$AssignerConfigurable r3 = net.bytebuddy.implementation.FixedValue.argument(r11)
                        net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition r0 = r0.intercept(r3)
                    L21c:
                        net.bytebuddy.dynamic.DynamicType$Unloaded r0 = r0.make()
                        java.lang.ClassLoader r3 = net.bytebuddy.dynamic.loading.ClassLoadingStrategy.BOOTSTRAP_LOADER
                        net.bytebuddy.dynamic.loading.ClassLoadingStrategy$ForUnsafeInjection r4 = new net.bytebuddy.dynamic.loading.ClassLoadingStrategy$ForUnsafeInjection
                        r4.<init>()
                        net.bytebuddy.dynamic.DynamicType$Loaded r0 = r0.load(r3, r4)
                        java.lang.Class r0 = r0.getLoaded()
                        net.bytebuddy.dynamic.loading.ClassInjector$UsingReflection$Dispatcher$UsingUnsafeInjection r3 = new net.bytebuddy.dynamic.loading.ClassInjector$UsingReflection$Dispatcher$UsingUnsafeInjection
                        java.lang.String r4 = "allocateInstance"
                        java.lang.Class[] r5 = new java.lang.Class[]{r30}
                        r7 = r27
                        java.lang.reflect.Method r4 = r7.getMethod(r4, r5)
                        java.lang.Object[] r5 = new java.lang.Object[]{r0}
                        r7 = r26
                        java.lang.Object r15 = r4.invoke(r7, r5)
                        java.lang.Class[] r4 = new java.lang.Class[]{r9, r10}
                        r5 = r29
                        java.lang.reflect.Method r16 = r0.getMethod(r5, r4)
                        java.lang.Class r27 = java.lang.Integer.TYPE
                        java.lang.Class<java.security.ProtectionDomain> r28 = java.security.ProtectionDomain.class
                        java.lang.Class<java.lang.ClassLoader> r23 = java.lang.ClassLoader.class
                        java.lang.Class<java.lang.String> r24 = java.lang.String.class
                        java.lang.Class<byte[]> r25 = byte[].class
                        r26 = r27
                        java.lang.Class[] r4 = new java.lang.Class[]{r23, r24, r25, r26, r27, r28}
                        r5 = r31
                        java.lang.reflect.Method r17 = r0.getMethod(r5, r4)
                        if (r8 == 0) goto L274
                        java.lang.Class[] r4 = new java.lang.Class[]{r9, r10}
                        java.lang.reflect.Method r13 = r0.getMethod(r13, r4)
                        r18 = r13
                        goto L276
                    L274:
                        r18 = 0
                    L276:
                        java.lang.Class[] r4 = new java.lang.Class[]{r9, r10}
                        java.lang.reflect.Method r19 = r0.getMethod(r2, r4)
                        java.lang.Class<java.lang.String> r27 = java.lang.String.class
                        java.lang.Class<java.net.URL> r28 = java.net.URL.class
                        java.lang.Class<java.lang.ClassLoader> r20 = java.lang.ClassLoader.class
                        java.lang.Class<java.lang.String> r21 = java.lang.String.class
                        java.lang.Class<java.lang.String> r22 = java.lang.String.class
                        java.lang.Class<java.lang.String> r23 = java.lang.String.class
                        java.lang.Class<java.lang.String> r24 = java.lang.String.class
                        java.lang.Class<java.lang.String> r25 = java.lang.String.class
                        java.lang.Class<java.lang.String> r26 = java.lang.String.class
                        java.lang.Class[] r2 = new java.lang.Class[]{r20, r21, r22, r23, r24, r25, r26, r27, r28}
                        java.lang.reflect.Method r20 = r0.getMethod(r1, r2)
                        java.lang.Class[] r1 = new java.lang.Class[]{r9, r10}
                        java.lang.reflect.Method r21 = r0.getMethod(r6, r1)
                        r14 = r3
                        r14.<init>(r15, r16, r17, r18, r19, r20, r21)
                        return r3
                }

                @Override // net.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.Dispatcher
                public java.lang.Class<?> defineClass(java.lang.ClassLoader r10, java.lang.String r11, byte[] r12, @net.bytebuddy.utility.nullability.MaybeNull java.security.ProtectionDomain r13) {
                        r9 = this;
                        java.lang.reflect.Method r0 = r9.defineClass     // Catch: java.lang.reflect.InvocationTargetException -> L1d java.lang.IllegalAccessException -> L1f
                        java.lang.Object r1 = r9.accessor     // Catch: java.lang.reflect.InvocationTargetException -> L1d java.lang.IllegalAccessException -> L1f
                        r2 = 0
                        java.lang.Integer r6 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.reflect.InvocationTargetException -> L1d java.lang.IllegalAccessException -> L1f
                        int r2 = r12.length     // Catch: java.lang.reflect.InvocationTargetException -> L1d java.lang.IllegalAccessException -> L1f
                        java.lang.Integer r7 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.reflect.InvocationTargetException -> L1d java.lang.IllegalAccessException -> L1f
                        r3 = r10
                        r4 = r11
                        r5 = r12
                        r8 = r13
                        java.lang.Object[] r10 = new java.lang.Object[]{r3, r4, r5, r6, r7, r8}     // Catch: java.lang.reflect.InvocationTargetException -> L1d java.lang.IllegalAccessException -> L1f
                        java.lang.Object r10 = r0.invoke(r1, r10)     // Catch: java.lang.reflect.InvocationTargetException -> L1d java.lang.IllegalAccessException -> L1f
                        java.lang.Class r10 = (java.lang.Class) r10     // Catch: java.lang.reflect.InvocationTargetException -> L1d java.lang.IllegalAccessException -> L1f
                        return r10
                    L1d:
                        r10 = move-exception
                        goto L21
                    L1f:
                        r10 = move-exception
                        goto L2b
                    L21:
                        java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                        java.lang.Throwable r10 = r10.getTargetException()
                        r11.<init>(r10)
                        throw r11
                    L2b:
                        java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                        r11.<init>(r10)
                        throw r11
                }

                @Override // net.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.Dispatcher
                public java.lang.Package definePackage(java.lang.ClassLoader r3, java.lang.String r4, @net.bytebuddy.utility.nullability.MaybeNull java.lang.String r5, @net.bytebuddy.utility.nullability.MaybeNull java.lang.String r6, @net.bytebuddy.utility.nullability.MaybeNull java.lang.String r7, @net.bytebuddy.utility.nullability.MaybeNull java.lang.String r8, @net.bytebuddy.utility.nullability.MaybeNull java.lang.String r9, @net.bytebuddy.utility.nullability.MaybeNull java.lang.String r10, @net.bytebuddy.utility.nullability.MaybeNull java.net.URL r11) {
                        r2 = this;
                        java.lang.reflect.Method r0 = r2.definePackage     // Catch: java.lang.reflect.InvocationTargetException -> Lf java.lang.IllegalAccessException -> L11
                        java.lang.Object r1 = r2.accessor     // Catch: java.lang.reflect.InvocationTargetException -> Lf java.lang.IllegalAccessException -> L11
                        java.lang.Object[] r3 = new java.lang.Object[]{r3, r4, r5, r6, r7, r8, r9, r10, r11}     // Catch: java.lang.reflect.InvocationTargetException -> Lf java.lang.IllegalAccessException -> L11
                        java.lang.Object r3 = r0.invoke(r1, r3)     // Catch: java.lang.reflect.InvocationTargetException -> Lf java.lang.IllegalAccessException -> L11
                        java.lang.Package r3 = (java.lang.Package) r3     // Catch: java.lang.reflect.InvocationTargetException -> Lf java.lang.IllegalAccessException -> L11
                        return r3
                    Lf:
                        r3 = move-exception
                        goto L13
                    L11:
                        r3 = move-exception
                        goto L1d
                    L13:
                        java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                        java.lang.Throwable r3 = r3.getTargetException()
                        r4.<init>(r3)
                        throw r4
                    L1d:
                        java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                        r4.<init>(r3)
                        throw r4
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
                        java.lang.Object r2 = r4.accessor
                        net.bytebuddy.dynamic.loading.ClassInjector$UsingReflection$Dispatcher$UsingUnsafeInjection r5 = (net.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.Dispatcher.UsingUnsafeInjection) r5
                        java.lang.Object r3 = r5.accessor
                        boolean r2 = r2.equals(r3)
                        if (r2 != 0) goto L20
                        return r1
                    L20:
                        java.lang.reflect.Method r2 = r4.findLoadedClass
                        java.lang.reflect.Method r3 = r5.findLoadedClass
                        boolean r2 = r2.equals(r3)
                        if (r2 != 0) goto L2b
                        return r1
                    L2b:
                        java.lang.reflect.Method r2 = r4.defineClass
                        java.lang.reflect.Method r3 = r5.defineClass
                        boolean r2 = r2.equals(r3)
                        if (r2 != 0) goto L36
                        return r1
                    L36:
                        java.lang.reflect.Method r2 = r4.getDefinedPackage
                        java.lang.reflect.Method r3 = r5.getDefinedPackage
                        boolean r2 = r2.equals(r3)
                        if (r2 != 0) goto L41
                        return r1
                    L41:
                        java.lang.reflect.Method r2 = r4.getPackage
                        java.lang.reflect.Method r3 = r5.getPackage
                        boolean r2 = r2.equals(r3)
                        if (r2 != 0) goto L4c
                        return r1
                    L4c:
                        java.lang.reflect.Method r2 = r4.definePackage
                        java.lang.reflect.Method r3 = r5.definePackage
                        boolean r2 = r2.equals(r3)
                        if (r2 != 0) goto L57
                        return r1
                    L57:
                        java.lang.reflect.Method r2 = r4.getClassLoadingLock
                        java.lang.reflect.Method r5 = r5.getClassLoadingLock
                        boolean r5 = r2.equals(r5)
                        if (r5 != 0) goto L62
                        return r1
                    L62:
                        return r0
                }

                @Override // net.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.Dispatcher
                public java.lang.Class<?> findClass(java.lang.ClassLoader r3, java.lang.String r4) {
                        r2 = this;
                        java.lang.reflect.Method r0 = r2.findLoadedClass     // Catch: java.lang.reflect.InvocationTargetException -> Lf java.lang.IllegalAccessException -> L11
                        java.lang.Object r1 = r2.accessor     // Catch: java.lang.reflect.InvocationTargetException -> Lf java.lang.IllegalAccessException -> L11
                        java.lang.Object[] r3 = new java.lang.Object[]{r3, r4}     // Catch: java.lang.reflect.InvocationTargetException -> Lf java.lang.IllegalAccessException -> L11
                        java.lang.Object r3 = r0.invoke(r1, r3)     // Catch: java.lang.reflect.InvocationTargetException -> Lf java.lang.IllegalAccessException -> L11
                        java.lang.Class r3 = (java.lang.Class) r3     // Catch: java.lang.reflect.InvocationTargetException -> Lf java.lang.IllegalAccessException -> L11
                        return r3
                    Lf:
                        r3 = move-exception
                        goto L13
                    L11:
                        r3 = move-exception
                        goto L1d
                    L13:
                        java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                        java.lang.Throwable r3 = r3.getTargetException()
                        r4.<init>(r3)
                        throw r4
                    L1d:
                        java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                        r4.<init>(r3)
                        throw r4
                }

                @Override // net.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.Dispatcher
                public java.lang.Object getClassLoadingLock(java.lang.ClassLoader r3, java.lang.String r4) {
                        r2 = this;
                        java.lang.reflect.Method r0 = r2.getClassLoadingLock     // Catch: java.lang.reflect.InvocationTargetException -> Ld java.lang.IllegalAccessException -> Lf
                        java.lang.Object r1 = r2.accessor     // Catch: java.lang.reflect.InvocationTargetException -> Ld java.lang.IllegalAccessException -> Lf
                        java.lang.Object[] r3 = new java.lang.Object[]{r3, r4}     // Catch: java.lang.reflect.InvocationTargetException -> Ld java.lang.IllegalAccessException -> Lf
                        java.lang.Object r3 = r0.invoke(r1, r3)     // Catch: java.lang.reflect.InvocationTargetException -> Ld java.lang.IllegalAccessException -> Lf
                        return r3
                    Ld:
                        r3 = move-exception
                        goto L11
                    Lf:
                        r3 = move-exception
                        goto L1b
                    L11:
                        java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                        java.lang.Throwable r3 = r3.getTargetException()
                        r4.<init>(r3)
                        throw r4
                    L1b:
                        java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                        r4.<init>(r3)
                        throw r4
                }

                @Override // net.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.Dispatcher
                @net.bytebuddy.utility.nullability.MaybeNull
                public java.lang.Package getDefinedPackage(java.lang.ClassLoader r3, java.lang.String r4) {
                        r2 = this;
                        java.lang.reflect.Method r0 = r2.getDefinedPackage
                        if (r0 != 0) goto L9
                        java.lang.Package r3 = r2.getPackage(r3, r4)
                        return r3
                    L9:
                        java.lang.Object r1 = r2.accessor     // Catch: java.lang.reflect.InvocationTargetException -> L16 java.lang.IllegalAccessException -> L18
                        java.lang.Object[] r3 = new java.lang.Object[]{r3, r4}     // Catch: java.lang.reflect.InvocationTargetException -> L16 java.lang.IllegalAccessException -> L18
                        java.lang.Object r3 = r0.invoke(r1, r3)     // Catch: java.lang.reflect.InvocationTargetException -> L16 java.lang.IllegalAccessException -> L18
                        java.lang.Package r3 = (java.lang.Package) r3     // Catch: java.lang.reflect.InvocationTargetException -> L16 java.lang.IllegalAccessException -> L18
                        return r3
                    L16:
                        r3 = move-exception
                        goto L1a
                    L18:
                        r3 = move-exception
                        goto L24
                    L1a:
                        java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                        java.lang.Throwable r3 = r3.getTargetException()
                        r4.<init>(r3)
                        throw r4
                    L24:
                        java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                        r4.<init>(r3)
                        throw r4
                }

                @Override // net.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.Dispatcher
                public java.lang.Package getPackage(java.lang.ClassLoader r3, java.lang.String r4) {
                        r2 = this;
                        java.lang.reflect.Method r0 = r2.getPackage     // Catch: java.lang.reflect.InvocationTargetException -> Lf java.lang.IllegalAccessException -> L11
                        java.lang.Object r1 = r2.accessor     // Catch: java.lang.reflect.InvocationTargetException -> Lf java.lang.IllegalAccessException -> L11
                        java.lang.Object[] r3 = new java.lang.Object[]{r3, r4}     // Catch: java.lang.reflect.InvocationTargetException -> Lf java.lang.IllegalAccessException -> L11
                        java.lang.Object r3 = r0.invoke(r1, r3)     // Catch: java.lang.reflect.InvocationTargetException -> Lf java.lang.IllegalAccessException -> L11
                        java.lang.Package r3 = (java.lang.Package) r3     // Catch: java.lang.reflect.InvocationTargetException -> Lf java.lang.IllegalAccessException -> L11
                        return r3
                    Lf:
                        r3 = move-exception
                        goto L13
                    L11:
                        r3 = move-exception
                        goto L1d
                    L13:
                        java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                        java.lang.Throwable r3 = r3.getTargetException()
                        r4.<init>(r3)
                        throw r4
                    L1d:
                        java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                        r4.<init>(r3)
                        throw r4
                }

                public int hashCode() {
                        r2 = this;
                        java.lang.Class r0 = r2.getClass()
                        int r0 = r0.hashCode()
                        int r0 = r0 * 31
                        java.lang.Object r1 = r2.accessor
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        int r0 = r0 * 31
                        java.lang.reflect.Method r1 = r2.findLoadedClass
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        int r0 = r0 * 31
                        java.lang.reflect.Method r1 = r2.defineClass
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        int r0 = r0 * 31
                        java.lang.reflect.Method r1 = r2.getDefinedPackage
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        int r0 = r0 * 31
                        java.lang.reflect.Method r1 = r2.getPackage
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        int r0 = r0 * 31
                        java.lang.reflect.Method r1 = r2.definePackage
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        int r0 = r0 * 31
                        java.lang.reflect.Method r1 = r2.getClassLoadingLock
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        return r0
                }

                @Override // net.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.Dispatcher.Initializable
                public net.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.Dispatcher initialize() {
                        r3 = this;
                        net.bytebuddy.dynamic.loading.ClassInjector$UsingReflection$System r0 = net.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.access$000()
                        java.lang.Object r0 = r0.getSecurityManager()
                        if (r0 == 0) goto L34
                        java.lang.reflect.Method r1 = net.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.access$100()     // Catch: java.lang.Exception -> L18 java.lang.reflect.InvocationTargetException -> L1a
                        java.security.Permission r2 = net.bytebuddy.dynamic.loading.ClassInjector.SUPPRESS_ACCESS_CHECKS     // Catch: java.lang.Exception -> L18 java.lang.reflect.InvocationTargetException -> L1a
                        java.lang.Object[] r2 = new java.lang.Object[]{r2}     // Catch: java.lang.Exception -> L18 java.lang.reflect.InvocationTargetException -> L1a
                        r1.invoke(r0, r2)     // Catch: java.lang.Exception -> L18 java.lang.reflect.InvocationTargetException -> L1a
                        goto L34
                    L18:
                        r0 = move-exception
                        goto L1c
                    L1a:
                        r0 = move-exception
                        goto L26
                    L1c:
                        net.bytebuddy.dynamic.loading.ClassInjector$UsingReflection$Dispatcher$Unavailable r1 = new net.bytebuddy.dynamic.loading.ClassInjector$UsingReflection$Dispatcher$Unavailable
                        java.lang.String r0 = r0.getMessage()
                        r1.<init>(r0)
                        return r1
                    L26:
                        net.bytebuddy.dynamic.loading.ClassInjector$UsingReflection$Dispatcher$Unavailable r1 = new net.bytebuddy.dynamic.loading.ClassInjector$UsingReflection$Dispatcher$Unavailable
                        java.lang.Throwable r0 = r0.getTargetException()
                        java.lang.String r0 = r0.getMessage()
                        r1.<init>(r0)
                        return r1
                    L34:
                        return r3
                }

                @Override // net.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.Dispatcher.Initializable
                public boolean isAvailable() {
                        r1 = this;
                        r0 = 1
                        return r0
                }
            }

            public static abstract class UsingUnsafeOverride implements net.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.Dispatcher, net.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.Dispatcher.Initializable {
                protected final java.lang.reflect.Method defineClass;
                protected final java.lang.reflect.Method definePackage;
                protected final java.lang.reflect.Method findLoadedClass;

                @net.bytebuddy.utility.nullability.MaybeNull
                protected final java.lang.reflect.Method getDefinedPackage;
                protected final java.lang.reflect.Method getPackage;

                @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
                public static class ForJava7CapableVm extends net.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.Dispatcher.UsingUnsafeOverride {
                    private final java.lang.reflect.Method getClassLoadingLock;

                    public ForJava7CapableVm(java.lang.reflect.Method r1, java.lang.reflect.Method r2, @net.bytebuddy.utility.nullability.MaybeNull java.lang.reflect.Method r3, java.lang.reflect.Method r4, java.lang.reflect.Method r5, java.lang.reflect.Method r6) {
                            r0 = this;
                            r0.<init>(r1, r2, r3, r4, r5)
                            r0.getClassLoadingLock = r6
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
                            java.lang.reflect.Method r2 = r4.getClassLoadingLock
                            net.bytebuddy.dynamic.loading.ClassInjector$UsingReflection$Dispatcher$UsingUnsafeOverride$ForJava7CapableVm r5 = (net.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.Dispatcher.UsingUnsafeOverride.ForJava7CapableVm) r5
                            java.lang.reflect.Method r5 = r5.getClassLoadingLock
                            boolean r5 = r2.equals(r5)
                            if (r5 != 0) goto L20
                            return r1
                        L20:
                            return r0
                    }

                    @Override // net.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.Dispatcher
                    public java.lang.Object getClassLoadingLock(java.lang.ClassLoader r2, java.lang.String r3) {
                            r1 = this;
                            java.lang.reflect.Method r0 = r1.getClassLoadingLock     // Catch: java.lang.reflect.InvocationTargetException -> Lb java.lang.IllegalAccessException -> Ld
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
                            java.lang.reflect.Method r1 = r2.getClassLoadingLock
                            int r1 = r1.hashCode()
                            int r0 = r0 + r1
                            return r0
                    }
                }

                public static class ForLegacyVm extends net.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.Dispatcher.UsingUnsafeOverride {
                    public ForLegacyVm(java.lang.reflect.Method r1, java.lang.reflect.Method r2, @net.bytebuddy.utility.nullability.MaybeNull java.lang.reflect.Method r3, java.lang.reflect.Method r4, java.lang.reflect.Method r5) {
                            r0 = this;
                            r0.<init>(r1, r2, r3, r4, r5)
                            return
                    }

                    @Override // net.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.Dispatcher
                    public java.lang.Object getClassLoadingLock(java.lang.ClassLoader r1, java.lang.String r2) {
                            r0 = this;
                            return r1
                    }
                }

                public UsingUnsafeOverride(java.lang.reflect.Method r1, java.lang.reflect.Method r2, @net.bytebuddy.utility.nullability.MaybeNull java.lang.reflect.Method r3, java.lang.reflect.Method r4, java.lang.reflect.Method r5) {
                        r0 = this;
                        r0.<init>()
                        r0.findLoadedClass = r1
                        r0.defineClass = r2
                        r0.getDefinedPackage = r3
                        r0.getPackage = r4
                        r0.definePackage = r5
                        return
                }

                @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "Assuring privilege is explicit user responsibility.", value = {"DP_DO_INSIDE_DO_PRIVILEGED"})
                public static net.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.Dispatcher.Initializable make() throws java.lang.Exception {
                        java.lang.String r0 = "override"
                        java.lang.Class<java.lang.reflect.AccessibleObject> r1 = java.lang.reflect.AccessibleObject.class
                        net.bytebuddy.utility.GraalImageCode r2 = net.bytebuddy.utility.GraalImageCode.getCurrent()
                        boolean r2 = r2.isDefined()
                        java.lang.String r2 = java.lang.Boolean.toString(r2)
                        java.lang.String r3 = "net.bytebuddy.safe"
                        java.lang.String r2 = java.lang.System.getProperty(r3, r2)
                        boolean r2 = java.lang.Boolean.parseBoolean(r2)
                        if (r2 == 0) goto L24
                        net.bytebuddy.dynamic.loading.ClassInjector$UsingReflection$Dispatcher$Initializable$Unavailable r0 = new net.bytebuddy.dynamic.loading.ClassInjector$UsingReflection$Dispatcher$Initializable$Unavailable
                        java.lang.String r1 = "Use of Unsafe was disabled by system property"
                        r0.<init>(r1)
                        return r0
                    L24:
                        java.lang.String r2 = "sun.misc.Unsafe"
                        java.lang.Class r2 = java.lang.Class.forName(r2)
                        java.lang.String r3 = "theUnsafe"
                        java.lang.reflect.Field r3 = r2.getDeclaredField(r3)
                        r4 = 1
                        r3.setAccessible(r4)
                        r4 = 0
                        java.lang.Object r3 = r3.get(r4)
                        java.lang.reflect.Field r0 = r1.getDeclaredField(r0)     // Catch: java.lang.NoSuchFieldException -> L3e
                        goto L93
                    L3e:
                        net.bytebuddy.ByteBuddy r5 = new net.bytebuddy.ByteBuddy
                        r5.<init>()
                        net.bytebuddy.dynamic.DynamicType$Builder r5 = r5.redefine(r1)
                        java.lang.StringBuilder r6 = new java.lang.StringBuilder
                        r6.<init>()
                        java.lang.String r7 = "net.bytebuddy.mirror."
                        r6.append(r7)
                        java.lang.String r7 = r1.getSimpleName()
                        r6.append(r7)
                        java.lang.String r6 = r6.toString()
                        net.bytebuddy.dynamic.DynamicType$Builder r5 = r5.name(r6)
                        net.bytebuddy.dynamic.DynamicType$Builder r5 = r5.noNestMate()
                        net.bytebuddy.asm.MemberRemoval r6 = new net.bytebuddy.asm.MemberRemoval
                        r6.<init>()
                        net.bytebuddy.matcher.ElementMatcher$Junction r7 = net.bytebuddy.matcher.ElementMatchers.any()
                        net.bytebuddy.asm.MemberRemoval r6 = r6.stripInvokables(r7)
                        net.bytebuddy.dynamic.DynamicType$Builder r5 = r5.visit(r6)
                        net.bytebuddy.dynamic.DynamicType$Unloaded r5 = r5.make()
                        java.lang.ClassLoader r6 = r1.getClassLoader()
                        net.bytebuddy.dynamic.loading.ClassLoadingStrategy$Default r7 = net.bytebuddy.dynamic.loading.ClassLoadingStrategy.Default.WRAPPER
                        java.security.ProtectionDomain r1 = r1.getProtectionDomain()
                        net.bytebuddy.dynamic.loading.ClassLoadingStrategy$Configurable r1 = r7.with(r1)
                        net.bytebuddy.dynamic.DynamicType$Loaded r1 = r5.load(r6, r1)
                        java.lang.Class r1 = r1.getLoaded()
                        java.lang.reflect.Field r0 = r1.getDeclaredField(r0)
                    L93:
                        java.lang.Class<java.lang.reflect.Field> r1 = java.lang.reflect.Field.class
                        java.lang.Class[] r1 = new java.lang.Class[]{r1}
                        java.lang.String r5 = "objectFieldOffset"
                        java.lang.reflect.Method r1 = r2.getMethod(r5, r1)
                        java.lang.Object[] r0 = new java.lang.Object[]{r0}
                        java.lang.Object r0 = r1.invoke(r3, r0)
                        java.lang.Long r0 = (java.lang.Long) r0
                        r0.longValue()
                        java.lang.Class r1 = java.lang.Long.TYPE
                        java.lang.Class r5 = java.lang.Boolean.TYPE
                        java.lang.Class<java.lang.Object> r6 = java.lang.Object.class
                        java.lang.Class[] r1 = new java.lang.Class[]{r6, r1, r5}
                        java.lang.String r5 = "putBoolean"
                        java.lang.reflect.Method r1 = r2.getMethod(r5, r1)
                        boolean r2 = net.bytebuddy.utility.JavaModule.isSupported()
                        java.lang.Class<java.lang.String> r5 = java.lang.String.class
                        java.lang.Class<java.lang.ClassLoader> r6 = java.lang.ClassLoader.class
                        if (r2 == 0) goto Ld0
                        java.lang.String r2 = "getDefinedPackage"
                        java.lang.Class[] r7 = new java.lang.Class[]{r5}     // Catch: java.lang.NoSuchMethodException -> Ld0
                        java.lang.reflect.Method r4 = r6.getMethod(r2, r7)     // Catch: java.lang.NoSuchMethodException -> Ld0
                    Ld0:
                        java.lang.String r2 = "getPackage"
                        java.lang.Class[] r7 = new java.lang.Class[]{r5}
                        java.lang.reflect.Method r2 = r6.getDeclaredMethod(r2, r7)
                        java.lang.Boolean r7 = java.lang.Boolean.TRUE
                        java.lang.Object[] r8 = new java.lang.Object[]{r2, r0, r7}
                        r1.invoke(r3, r8)
                        java.lang.String r8 = "findLoadedClass"
                        java.lang.Class[] r9 = new java.lang.Class[]{r5}
                        java.lang.reflect.Method r14 = r6.getDeclaredMethod(r8, r9)
                        java.lang.Class r8 = java.lang.Integer.TYPE
                        java.lang.Class<java.security.ProtectionDomain> r9 = java.security.ProtectionDomain.class
                        java.lang.Class<byte[]> r10 = byte[].class
                        java.lang.Class[] r8 = new java.lang.Class[]{r5, r10, r8, r8, r9}
                        java.lang.String r9 = "defineClass"
                        java.lang.reflect.Method r15 = r6.getDeclaredMethod(r9, r8)
                        java.lang.Class<java.lang.String> r22 = java.lang.String.class
                        java.lang.Class<java.net.URL> r23 = java.net.URL.class
                        java.lang.Class<java.lang.String> r16 = java.lang.String.class
                        java.lang.Class<java.lang.String> r17 = java.lang.String.class
                        java.lang.Class<java.lang.String> r18 = java.lang.String.class
                        java.lang.Class<java.lang.String> r19 = java.lang.String.class
                        java.lang.Class<java.lang.String> r20 = java.lang.String.class
                        java.lang.Class<java.lang.String> r21 = java.lang.String.class
                        java.lang.Class[] r8 = new java.lang.Class[]{r16, r17, r18, r19, r20, r21, r22, r23}
                        java.lang.String r9 = "definePackage"
                        java.lang.reflect.Method r13 = r6.getDeclaredMethod(r9, r8)
                        java.lang.Object[] r8 = new java.lang.Object[]{r15, r0, r7}
                        r1.invoke(r3, r8)
                        java.lang.Object[] r8 = new java.lang.Object[]{r14, r0, r7}
                        r1.invoke(r3, r8)
                        java.lang.Object[] r8 = new java.lang.Object[]{r13, r0, r7}
                        r1.invoke(r3, r8)
                        java.lang.String r8 = "getClassLoadingLock"
                        java.lang.Class[] r5 = new java.lang.Class[]{r5}     // Catch: java.lang.NoSuchMethodException -> L14b
                        java.lang.reflect.Method r5 = r6.getDeclaredMethod(r8, r5)     // Catch: java.lang.NoSuchMethodException -> L14b
                        java.lang.Object[] r0 = new java.lang.Object[]{r5, r0, r7}     // Catch: java.lang.NoSuchMethodException -> L14b
                        r1.invoke(r3, r0)     // Catch: java.lang.NoSuchMethodException -> L14b
                        net.bytebuddy.dynamic.loading.ClassInjector$UsingReflection$Dispatcher$UsingUnsafeOverride$ForJava7CapableVm r0 = new net.bytebuddy.dynamic.loading.ClassInjector$UsingReflection$Dispatcher$UsingUnsafeOverride$ForJava7CapableVm     // Catch: java.lang.NoSuchMethodException -> L14b
                        r7 = r0
                        r8 = r14
                        r9 = r15
                        r10 = r4
                        r11 = r2
                        r12 = r13
                        r1 = r13
                        r13 = r5
                        r7.<init>(r8, r9, r10, r11, r12, r13)     // Catch: java.lang.NoSuchMethodException -> L14c
                        return r0
                    L14b:
                        r1 = r13
                    L14c:
                        net.bytebuddy.dynamic.loading.ClassInjector$UsingReflection$Dispatcher$UsingUnsafeOverride$ForLegacyVm r0 = new net.bytebuddy.dynamic.loading.ClassInjector$UsingReflection$Dispatcher$UsingUnsafeOverride$ForLegacyVm
                        r7 = r0
                        r8 = r14
                        r9 = r15
                        r10 = r4
                        r11 = r2
                        r12 = r1
                        r7.<init>(r8, r9, r10, r11, r12)
                        return r0
                }

                @Override // net.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.Dispatcher
                public java.lang.Class<?> defineClass(java.lang.ClassLoader r4, java.lang.String r5, byte[] r6, @net.bytebuddy.utility.nullability.MaybeNull java.security.ProtectionDomain r7) {
                        r3 = this;
                        java.lang.reflect.Method r0 = r3.defineClass     // Catch: java.lang.reflect.InvocationTargetException -> L17 java.lang.IllegalAccessException -> L19
                        r1 = 0
                        java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.reflect.InvocationTargetException -> L17 java.lang.IllegalAccessException -> L19
                        int r2 = r6.length     // Catch: java.lang.reflect.InvocationTargetException -> L17 java.lang.IllegalAccessException -> L19
                        java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.reflect.InvocationTargetException -> L17 java.lang.IllegalAccessException -> L19
                        java.lang.Object[] r5 = new java.lang.Object[]{r5, r6, r1, r2, r7}     // Catch: java.lang.reflect.InvocationTargetException -> L17 java.lang.IllegalAccessException -> L19
                        java.lang.Object r4 = r0.invoke(r4, r5)     // Catch: java.lang.reflect.InvocationTargetException -> L17 java.lang.IllegalAccessException -> L19
                        java.lang.Class r4 = (java.lang.Class) r4     // Catch: java.lang.reflect.InvocationTargetException -> L17 java.lang.IllegalAccessException -> L19
                        return r4
                    L17:
                        r4 = move-exception
                        goto L1b
                    L19:
                        r4 = move-exception
                        goto L25
                    L1b:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.Throwable r4 = r4.getTargetException()
                        r5.<init>(r4)
                        throw r5
                    L25:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        r5.<init>(r4)
                        throw r5
                }

                @Override // net.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.Dispatcher
                public java.lang.Package definePackage(java.lang.ClassLoader r2, java.lang.String r3, @net.bytebuddy.utility.nullability.MaybeNull java.lang.String r4, @net.bytebuddy.utility.nullability.MaybeNull java.lang.String r5, @net.bytebuddy.utility.nullability.MaybeNull java.lang.String r6, @net.bytebuddy.utility.nullability.MaybeNull java.lang.String r7, @net.bytebuddy.utility.nullability.MaybeNull java.lang.String r8, @net.bytebuddy.utility.nullability.MaybeNull java.lang.String r9, @net.bytebuddy.utility.nullability.MaybeNull java.net.URL r10) {
                        r1 = this;
                        java.lang.reflect.Method r0 = r1.definePackage     // Catch: java.lang.reflect.InvocationTargetException -> Ld java.lang.IllegalAccessException -> Lf
                        java.lang.Object[] r3 = new java.lang.Object[]{r3, r4, r5, r6, r7, r8, r9, r10}     // Catch: java.lang.reflect.InvocationTargetException -> Ld java.lang.IllegalAccessException -> Lf
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

                @Override // net.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.Dispatcher
                public java.lang.Class<?> findClass(java.lang.ClassLoader r2, java.lang.String r3) {
                        r1 = this;
                        java.lang.reflect.Method r0 = r1.findLoadedClass     // Catch: java.lang.reflect.InvocationTargetException -> Ld java.lang.IllegalAccessException -> Lf
                        java.lang.Object[] r3 = new java.lang.Object[]{r3}     // Catch: java.lang.reflect.InvocationTargetException -> Ld java.lang.IllegalAccessException -> Lf
                        java.lang.Object r2 = r0.invoke(r2, r3)     // Catch: java.lang.reflect.InvocationTargetException -> Ld java.lang.IllegalAccessException -> Lf
                        java.lang.Class r2 = (java.lang.Class) r2     // Catch: java.lang.reflect.InvocationTargetException -> Ld java.lang.IllegalAccessException -> Lf
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

                @Override // net.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.Dispatcher
                @net.bytebuddy.utility.nullability.MaybeNull
                public java.lang.Package getDefinedPackage(java.lang.ClassLoader r2, java.lang.String r3) {
                        r1 = this;
                        java.lang.reflect.Method r0 = r1.getDefinedPackage
                        if (r0 != 0) goto L9
                        java.lang.Package r2 = r1.getPackage(r2, r3)
                        return r2
                    L9:
                        java.lang.Object[] r3 = new java.lang.Object[]{r3}     // Catch: java.lang.reflect.InvocationTargetException -> L14 java.lang.IllegalAccessException -> L16
                        java.lang.Object r2 = r0.invoke(r2, r3)     // Catch: java.lang.reflect.InvocationTargetException -> L14 java.lang.IllegalAccessException -> L16
                        java.lang.Package r2 = (java.lang.Package) r2     // Catch: java.lang.reflect.InvocationTargetException -> L14 java.lang.IllegalAccessException -> L16
                        return r2
                    L14:
                        r2 = move-exception
                        goto L18
                    L16:
                        r2 = move-exception
                        goto L22
                    L18:
                        java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                        java.lang.Throwable r2 = r2.getTargetException()
                        r3.<init>(r2)
                        throw r3
                    L22:
                        java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                        r3.<init>(r2)
                        throw r3
                }

                @Override // net.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.Dispatcher
                public java.lang.Package getPackage(java.lang.ClassLoader r2, java.lang.String r3) {
                        r1 = this;
                        java.lang.reflect.Method r0 = r1.getPackage     // Catch: java.lang.reflect.InvocationTargetException -> Ld java.lang.IllegalAccessException -> Lf
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

                @Override // net.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.Dispatcher.Initializable
                public net.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.Dispatcher initialize() {
                        r3 = this;
                        net.bytebuddy.dynamic.loading.ClassInjector$UsingReflection$System r0 = net.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.access$000()
                        java.lang.Object r0 = r0.getSecurityManager()
                        if (r0 == 0) goto L34
                        java.lang.reflect.Method r1 = net.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.access$100()     // Catch: java.lang.Exception -> L18 java.lang.reflect.InvocationTargetException -> L1a
                        java.security.Permission r2 = net.bytebuddy.dynamic.loading.ClassInjector.SUPPRESS_ACCESS_CHECKS     // Catch: java.lang.Exception -> L18 java.lang.reflect.InvocationTargetException -> L1a
                        java.lang.Object[] r2 = new java.lang.Object[]{r2}     // Catch: java.lang.Exception -> L18 java.lang.reflect.InvocationTargetException -> L1a
                        r1.invoke(r0, r2)     // Catch: java.lang.Exception -> L18 java.lang.reflect.InvocationTargetException -> L1a
                        goto L34
                    L18:
                        r0 = move-exception
                        goto L1c
                    L1a:
                        r0 = move-exception
                        goto L26
                    L1c:
                        net.bytebuddy.dynamic.loading.ClassInjector$UsingReflection$Dispatcher$Unavailable r1 = new net.bytebuddy.dynamic.loading.ClassInjector$UsingReflection$Dispatcher$Unavailable
                        java.lang.String r0 = r0.getMessage()
                        r1.<init>(r0)
                        return r1
                    L26:
                        net.bytebuddy.dynamic.loading.ClassInjector$UsingReflection$Dispatcher$Unavailable r1 = new net.bytebuddy.dynamic.loading.ClassInjector$UsingReflection$Dispatcher$Unavailable
                        java.lang.Throwable r0 = r0.getTargetException()
                        java.lang.String r0 = r0.getMessage()
                        r1.<init>(r0)
                        return r1
                    L34:
                        return r3
                }

                @Override // net.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.Dispatcher.Initializable
                public boolean isAvailable() {
                        r1 = this;
                        r0 = 1
                        return r0
                }
            }

            static {
                    return
            }

            java.lang.Class<?> defineClass(java.lang.ClassLoader r1, java.lang.String r2, byte[] r3, @net.bytebuddy.utility.nullability.MaybeNull java.security.ProtectionDomain r4);

            java.lang.Package definePackage(java.lang.ClassLoader r1, java.lang.String r2, @net.bytebuddy.utility.nullability.MaybeNull java.lang.String r3, @net.bytebuddy.utility.nullability.MaybeNull java.lang.String r4, @net.bytebuddy.utility.nullability.MaybeNull java.lang.String r5, @net.bytebuddy.utility.nullability.MaybeNull java.lang.String r6, @net.bytebuddy.utility.nullability.MaybeNull java.lang.String r7, @net.bytebuddy.utility.nullability.MaybeNull java.lang.String r8, @net.bytebuddy.utility.nullability.MaybeNull java.net.URL r9);

            @net.bytebuddy.utility.nullability.MaybeNull
            java.lang.Class<?> findClass(java.lang.ClassLoader r1, java.lang.String r2);

            java.lang.Object getClassLoadingLock(java.lang.ClassLoader r1, java.lang.String r2);

            @net.bytebuddy.utility.nullability.MaybeNull
            java.lang.Package getDefinedPackage(java.lang.ClassLoader r1, java.lang.String r2);

            @net.bytebuddy.utility.nullability.MaybeNull
            java.lang.Package getPackage(java.lang.ClassLoader r1, java.lang.String r2);
        }

        @net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied("java.lang.System")
        public interface System {
            @net.bytebuddy.utility.dispatcher.JavaDispatcher.IsStatic
            @net.bytebuddy.utility.dispatcher.JavaDispatcher.Defaults
            @net.bytebuddy.utility.nullability.MaybeNull
            @net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied("getSecurityManager")
            java.lang.Object getSecurityManager();
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
                net.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.ACCESS_CONTROLLER = r1     // Catch: java.lang.SecurityException -> L16 java.lang.ClassNotFoundException -> L17
                goto L19
            L16:
                r0 = 1
            L17:
                net.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.ACCESS_CONTROLLER = r0
            L19:
                net.bytebuddy.dynamic.loading.ClassInjector$UsingReflection$Dispatcher$CreationAction r0 = net.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.Dispatcher.CreationAction.INSTANCE
                java.lang.Object r0 = doPrivileged(r0)
                net.bytebuddy.dynamic.loading.ClassInjector$UsingReflection$Dispatcher$Initializable r0 = (net.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.Dispatcher.Initializable) r0
                net.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.DISPATCHER = r0
                java.lang.Class<net.bytebuddy.dynamic.loading.ClassInjector$UsingReflection$System> r0 = net.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.System.class
                java.security.PrivilegedAction r0 = net.bytebuddy.utility.dispatcher.JavaDispatcher.of(r0)
                java.lang.Object r0 = doPrivileged(r0)
                net.bytebuddy.dynamic.loading.ClassInjector$UsingReflection$System r0 = (net.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.System) r0
                net.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.SYSTEM = r0
                net.bytebuddy.utility.privilege.GetMethodAction r0 = new net.bytebuddy.utility.privilege.GetMethodAction
                java.lang.Class<java.security.Permission> r1 = java.security.Permission.class
                java.lang.Class[] r1 = new java.lang.Class[]{r1}
                java.lang.String r2 = "java.lang.SecurityManager"
                java.lang.String r3 = "checkPermission"
                r0.<init>(r2, r3, r1)
                java.lang.Object r0 = doPrivileged(r0)
                java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
                net.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.CHECK_PERMISSION = r0
                return
        }

        public UsingReflection(java.lang.ClassLoader r2) {
                r1 = this;
                java.security.ProtectionDomain r0 = net.bytebuddy.dynamic.loading.ClassLoadingStrategy.NO_PROTECTION_DOMAIN
                r1.<init>(r2, r0)
                return
        }

        public UsingReflection(java.lang.ClassLoader r3, @net.bytebuddy.utility.nullability.MaybeNull java.security.ProtectionDomain r4) {
                r2 = this;
                net.bytebuddy.dynamic.loading.PackageDefinitionStrategy$Trivial r0 = net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.Trivial.INSTANCE
                r1 = 0
                r2.<init>(r3, r4, r0, r1)
                return
        }

        public UsingReflection(java.lang.ClassLoader r1, @net.bytebuddy.utility.nullability.MaybeNull java.security.ProtectionDomain r2, net.bytebuddy.dynamic.loading.PackageDefinitionStrategy r3, boolean r4) {
                r0 = this;
                r0.<init>()
                if (r1 == 0) goto Le
                r0.classLoader = r1
                r0.protectionDomain = r2
                r0.packageDefinitionStrategy = r3
                r0.forbidExisting = r4
                return
            Le:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r2 = "Cannot inject classes into the bootstrap class loader"
                r1.<init>(r2)
                throw r1
        }

        public static /* synthetic */ net.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.System access$000() {
                net.bytebuddy.dynamic.loading.ClassInjector$UsingReflection$System r0 = net.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.SYSTEM
                return r0
        }

        public static /* synthetic */ java.lang.reflect.Method access$100() {
                java.lang.reflect.Method r0 = net.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.CHECK_PERMISSION
                return r0
        }

        @net.bytebuddy.build.AccessControllerPlugin.Enhance
        private static <T> T doPrivileged(java.security.PrivilegedAction<T> r1) {
                boolean r0 = net.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.ACCESS_CONTROLLER
                if (r0 == 0) goto L9
                java.lang.Object r1 = java.security.AccessController.doPrivileged(r1)
                return r1
            L9:
                java.lang.Object r1 = r1.run()
                return r1
        }

        public static boolean isAvailable() {
                net.bytebuddy.dynamic.loading.ClassInjector$UsingReflection$Dispatcher$Initializable r0 = net.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.DISPATCHER
                boolean r0 = r0.isAvailable()
                return r0
        }

        public static net.bytebuddy.dynamic.loading.ClassInjector ofSystemClassLoader() {
                net.bytebuddy.dynamic.loading.ClassInjector$UsingReflection r0 = new net.bytebuddy.dynamic.loading.ClassInjector$UsingReflection
                java.lang.ClassLoader r1 = java.lang.ClassLoader.getSystemClassLoader()
                r0.<init>(r1)
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
                net.bytebuddy.dynamic.loading.ClassInjector$UsingReflection r5 = (net.bytebuddy.dynamic.loading.ClassInjector.UsingReflection) r5
                boolean r3 = r5.forbidExisting
                if (r2 == r3) goto L1c
                return r1
            L1c:
                java.lang.ClassLoader r2 = r4.classLoader
                java.lang.ClassLoader r3 = r5.classLoader
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L27
                return r1
            L27:
                java.security.ProtectionDomain r2 = r4.protectionDomain
                java.security.ProtectionDomain r3 = r5.protectionDomain
                if (r3 == 0) goto L36
                if (r2 == 0) goto L38
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L39
                return r1
            L36:
                if (r2 == 0) goto L39
            L38:
                return r1
            L39:
                net.bytebuddy.dynamic.loading.PackageDefinitionStrategy r2 = r4.packageDefinitionStrategy
                net.bytebuddy.dynamic.loading.PackageDefinitionStrategy r5 = r5.packageDefinitionStrategy
                boolean r5 = r2.equals(r5)
                if (r5 != 0) goto L44
                return r1
            L44:
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
                int r0 = r0 * 31
                java.security.ProtectionDomain r1 = r2.protectionDomain
                if (r1 == 0) goto L1c
                int r1 = r1.hashCode()
                int r0 = r0 + r1
            L1c:
                int r0 = r0 * 31
                net.bytebuddy.dynamic.loading.PackageDefinitionStrategy r1 = r2.packageDefinitionStrategy
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                int r0 = r0 * 31
                boolean r1 = r2.forbidExisting
                int r0 = r0 + r1
                return r0
        }

        @Override // net.bytebuddy.dynamic.loading.ClassInjector
        public java.util.Map<java.lang.String, java.lang.Class<?>> injectRaw(java.util.Map<? extends java.lang.String, byte[]> r20) {
                r19 = this;
                r1 = r19
                net.bytebuddy.dynamic.loading.ClassInjector$UsingReflection$Dispatcher$Initializable r0 = net.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.DISPATCHER
                net.bytebuddy.dynamic.loading.ClassInjector$UsingReflection$Dispatcher r12 = r0.initialize()
                java.util.HashMap r13 = new java.util.HashMap
                r13.<init>()
                java.util.Set r0 = r20.entrySet()
                java.util.Iterator r14 = r0.iterator()
            L15:
                boolean r0 = r14.hasNext()
                if (r0 == 0) goto L145
                java.lang.Object r0 = r14.next()
                r15 = r0
                java.util.Map$Entry r15 = (java.util.Map.Entry) r15
                java.lang.ClassLoader r0 = r1.classLoader
                java.lang.Object r2 = r15.getKey()
                java.lang.String r2 = (java.lang.String) r2
                java.lang.Object r16 = r12.getClassLoadingLock(r0, r2)
                monitor-enter(r16)
                java.lang.ClassLoader r0 = r1.classLoader     // Catch: java.lang.Throwable -> La0
                java.lang.Object r2 = r15.getKey()     // Catch: java.lang.Throwable -> La0
                java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> La0
                java.lang.Class r0 = r12.findClass(r0, r2)     // Catch: java.lang.Throwable -> La0
                if (r0 != 0) goto L115
                java.lang.Object r0 = r15.getKey()     // Catch: java.lang.Throwable -> La0
                java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> La0
                r2 = 46
                int r0 = r0.lastIndexOf(r2)     // Catch: java.lang.Throwable -> La0
                r2 = -1
                if (r0 == r2) goto Lfc
                java.lang.Object r2 = r15.getKey()     // Catch: java.lang.Throwable -> La0
                java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> La0
                r3 = 0
                java.lang.String r11 = r2.substring(r3, r0)     // Catch: java.lang.Throwable -> La0
                net.bytebuddy.dynamic.loading.PackageDefinitionStrategy r0 = r1.packageDefinitionStrategy     // Catch: java.lang.Throwable -> La0
                java.lang.ClassLoader r2 = r1.classLoader     // Catch: java.lang.Throwable -> La0
                java.lang.Object r3 = r15.getKey()     // Catch: java.lang.Throwable -> La0
                java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> La0
                net.bytebuddy.dynamic.loading.PackageDefinitionStrategy$Definition r10 = r0.define(r2, r11, r3)     // Catch: java.lang.Throwable -> La0
                boolean r0 = r10.isDefined()     // Catch: java.lang.Throwable -> La0
                if (r0 == 0) goto Lfc
                java.lang.ClassLoader r0 = r1.classLoader     // Catch: java.lang.Throwable -> La0
                java.lang.Package r0 = r12.getDefinedPackage(r0, r11)     // Catch: java.lang.Throwable -> La0
                if (r0 != 0) goto Ld8
                java.lang.ClassLoader r3 = r1.classLoader     // Catch: java.lang.Throwable -> La0 java.lang.IllegalStateException -> La5
                java.lang.String r5 = r10.getSpecificationTitle()     // Catch: java.lang.Throwable -> La0 java.lang.IllegalStateException -> La5
                java.lang.String r6 = r10.getSpecificationVersion()     // Catch: java.lang.Throwable -> La0 java.lang.IllegalStateException -> La5
                java.lang.String r7 = r10.getSpecificationVendor()     // Catch: java.lang.Throwable -> La0 java.lang.IllegalStateException -> La5
                java.lang.String r8 = r10.getImplementationTitle()     // Catch: java.lang.Throwable -> La0 java.lang.IllegalStateException -> La5
                java.lang.String r9 = r10.getImplementationVersion()     // Catch: java.lang.Throwable -> La0 java.lang.IllegalStateException -> La5
                java.lang.String r0 = r10.getImplementationVendor()     // Catch: java.lang.Throwable -> La0 java.lang.IllegalStateException -> La5
                java.net.URL r17 = r10.getSealBase()     // Catch: java.lang.Throwable -> La0 java.lang.IllegalStateException -> La5
                r2 = r12
                r4 = r11
                r20 = r14
                r14 = r10
                r10 = r0
                r18 = r13
                r13 = r11
                r11 = r17
                r2.definePackage(r3, r4, r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> La0 java.lang.IllegalStateException -> La3
                goto L100
            La0:
                r0 = move-exception
                goto L143
            La3:
                r0 = move-exception
                goto Lac
            La5:
                r0 = move-exception
                r18 = r13
                r20 = r14
                r14 = r10
                r13 = r11
            Lac:
                java.lang.ClassLoader r2 = r1.classLoader     // Catch: java.lang.Throwable -> La0
                java.lang.Package r2 = r12.getPackage(r2, r13)     // Catch: java.lang.Throwable -> La0
                if (r2 == 0) goto Ld7
                boolean r0 = r14.isCompatibleTo(r2)     // Catch: java.lang.Throwable -> La0
                if (r0 == 0) goto Lbb
                goto L100
            Lbb:
                java.lang.SecurityException r0 = new java.lang.SecurityException     // Catch: java.lang.Throwable -> La0
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La0
                r2.<init>()     // Catch: java.lang.Throwable -> La0
                java.lang.String r3 = "Sealing violation for package "
                r2.append(r3)     // Catch: java.lang.Throwable -> La0
                r2.append(r13)     // Catch: java.lang.Throwable -> La0
                java.lang.String r3 = " (getPackage fallback)"
                r2.append(r3)     // Catch: java.lang.Throwable -> La0
                java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> La0
                r0.<init>(r2)     // Catch: java.lang.Throwable -> La0
                throw r0     // Catch: java.lang.Throwable -> La0
            Ld7:
                throw r0     // Catch: java.lang.Throwable -> La0
            Ld8:
                r18 = r13
                r20 = r14
                r14 = r10
                r13 = r11
                boolean r0 = r14.isCompatibleTo(r0)     // Catch: java.lang.Throwable -> La0
                if (r0 == 0) goto Le5
                goto L100
            Le5:
                java.lang.SecurityException r0 = new java.lang.SecurityException     // Catch: java.lang.Throwable -> La0
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La0
                r2.<init>()     // Catch: java.lang.Throwable -> La0
                java.lang.String r3 = "Sealing violation for package "
                r2.append(r3)     // Catch: java.lang.Throwable -> La0
                r2.append(r13)     // Catch: java.lang.Throwable -> La0
                java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> La0
                r0.<init>(r2)     // Catch: java.lang.Throwable -> La0
                throw r0     // Catch: java.lang.Throwable -> La0
            Lfc:
                r18 = r13
                r20 = r14
            L100:
                java.lang.ClassLoader r0 = r1.classLoader     // Catch: java.lang.Throwable -> La0
                java.lang.Object r2 = r15.getKey()     // Catch: java.lang.Throwable -> La0
                java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> La0
                java.lang.Object r3 = r15.getValue()     // Catch: java.lang.Throwable -> La0
                byte[] r3 = (byte[]) r3     // Catch: java.lang.Throwable -> La0
                java.security.ProtectionDomain r4 = r1.protectionDomain     // Catch: java.lang.Throwable -> La0
                java.lang.Class r0 = r12.defineClass(r0, r2, r3, r4)     // Catch: java.lang.Throwable -> La0
                goto L11d
            L115:
                r18 = r13
                r20 = r14
                boolean r2 = r1.forbidExisting     // Catch: java.lang.Throwable -> La0
                if (r2 != 0) goto L12c
            L11d:
                java.lang.Object r2 = r15.getKey()     // Catch: java.lang.Throwable -> La0
                r3 = r18
                r3.put(r2, r0)     // Catch: java.lang.Throwable -> La0
                monitor-exit(r16)     // Catch: java.lang.Throwable -> La0
                r14 = r20
                r13 = r3
                goto L15
            L12c:
                java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> La0
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La0
                r3.<init>()     // Catch: java.lang.Throwable -> La0
                java.lang.String r4 = "Cannot inject already loaded type: "
                r3.append(r4)     // Catch: java.lang.Throwable -> La0
                r3.append(r0)     // Catch: java.lang.Throwable -> La0
                java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> La0
                r2.<init>(r0)     // Catch: java.lang.Throwable -> La0
                throw r2     // Catch: java.lang.Throwable -> La0
            L143:
                monitor-exit(r16)     // Catch: java.lang.Throwable -> La0
                throw r0
            L145:
                r3 = r13
                return r3
        }

        @Override // net.bytebuddy.dynamic.loading.ClassInjector
        public boolean isAlive() {
                r1 = this;
                boolean r0 = isAvailable()
                return r0
        }
    }

    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
    public static class UsingUnsafe extends net.bytebuddy.dynamic.loading.ClassInjector.AbstractBase {
        private static final boolean ACCESS_CONTROLLER = false;
        private static final java.lang.Object BOOTSTRAP_LOADER_LOCK = null;
        private static final java.lang.reflect.Method CHECK_PERMISSION = null;
        private static final net.bytebuddy.dynamic.loading.ClassInjector.UsingUnsafe.Dispatcher.Initializable DISPATCHER = null;
        public static final java.lang.String SAFE_PROPERTY = "net.bytebuddy.safe";
        private static final net.bytebuddy.dynamic.loading.ClassInjector.UsingUnsafe.System SYSTEM = null;

        @net.bytebuddy.utility.nullability.MaybeNull
        @net.bytebuddy.build.HashCodeAndEqualsPlugin.ValueHandling(net.bytebuddy.build.HashCodeAndEqualsPlugin.ValueHandling.Sort.REVERSE_NULLABILITY)
        private final java.lang.ClassLoader classLoader;
        private final net.bytebuddy.dynamic.loading.ClassInjector.UsingUnsafe.Dispatcher.Initializable dispatcher;

        @net.bytebuddy.utility.nullability.MaybeNull
        @net.bytebuddy.build.HashCodeAndEqualsPlugin.ValueHandling(net.bytebuddy.build.HashCodeAndEqualsPlugin.ValueHandling.Sort.REVERSE_NULLABILITY)
        private final java.security.ProtectionDomain protectionDomain;

        public interface Dispatcher {

            public enum CreationAction extends java.lang.Enum<net.bytebuddy.dynamic.loading.ClassInjector.UsingUnsafe.Dispatcher.CreationAction> implements java.security.PrivilegedAction<net.bytebuddy.dynamic.loading.ClassInjector.UsingUnsafe.Dispatcher.Initializable> {
                private static final /* synthetic */ net.bytebuddy.dynamic.loading.ClassInjector.UsingUnsafe.Dispatcher.CreationAction[] $VALUES = null;
                public static final net.bytebuddy.dynamic.loading.ClassInjector.UsingUnsafe.Dispatcher.CreationAction INSTANCE = null;

                static {
                        net.bytebuddy.dynamic.loading.ClassInjector$UsingUnsafe$Dispatcher$CreationAction r0 = new net.bytebuddy.dynamic.loading.ClassInjector$UsingUnsafe$Dispatcher$CreationAction
                        java.lang.String r1 = "INSTANCE"
                        r2 = 0
                        r0.<init>(r1, r2)
                        net.bytebuddy.dynamic.loading.ClassInjector.UsingUnsafe.Dispatcher.CreationAction.INSTANCE = r0
                        net.bytebuddy.dynamic.loading.ClassInjector$UsingUnsafe$Dispatcher$CreationAction[] r0 = new net.bytebuddy.dynamic.loading.ClassInjector.UsingUnsafe.Dispatcher.CreationAction[]{r0}
                        net.bytebuddy.dynamic.loading.ClassInjector.UsingUnsafe.Dispatcher.CreationAction.$VALUES = r0
                        return
                }

                CreationAction(java.lang.String r1, int r2) {
                        r0 = this;
                        r0.<init>(r1, r2)
                        return
                }

                public static net.bytebuddy.dynamic.loading.ClassInjector.UsingUnsafe.Dispatcher.CreationAction valueOf(java.lang.String r1) {
                        java.lang.Class<net.bytebuddy.dynamic.loading.ClassInjector$UsingUnsafe$Dispatcher$CreationAction> r0 = net.bytebuddy.dynamic.loading.ClassInjector.UsingUnsafe.Dispatcher.CreationAction.class
                        java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                        net.bytebuddy.dynamic.loading.ClassInjector$UsingUnsafe$Dispatcher$CreationAction r1 = (net.bytebuddy.dynamic.loading.ClassInjector.UsingUnsafe.Dispatcher.CreationAction) r1
                        return r1
                }

                public static net.bytebuddy.dynamic.loading.ClassInjector.UsingUnsafe.Dispatcher.CreationAction[] values() {
                        net.bytebuddy.dynamic.loading.ClassInjector$UsingUnsafe$Dispatcher$CreationAction[] r0 = net.bytebuddy.dynamic.loading.ClassInjector.UsingUnsafe.Dispatcher.CreationAction.$VALUES
                        java.lang.Object r0 = r0.clone()
                        net.bytebuddy.dynamic.loading.ClassInjector$UsingUnsafe$Dispatcher$CreationAction[] r0 = (net.bytebuddy.dynamic.loading.ClassInjector.UsingUnsafe.Dispatcher.CreationAction[]) r0
                        return r0
                }

                @Override // java.security.PrivilegedAction
                @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "Exception should not be rethrown but trigger a fallback.", value = {"REC_CATCH_EXCEPTION"})
                public /* bridge */ /* synthetic */ net.bytebuddy.dynamic.loading.ClassInjector.UsingUnsafe.Dispatcher.Initializable run() {
                        r1 = this;
                        net.bytebuddy.dynamic.loading.ClassInjector$UsingUnsafe$Dispatcher$Initializable r0 = r1.run2()
                        return r0
                }

                @Override // java.security.PrivilegedAction
                @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "Exception should not be rethrown but trigger a fallback.", value = {"REC_CATCH_EXCEPTION"})
                /* JADX INFO: renamed from: run, reason: avoid collision after fix types in other method */
                public net.bytebuddy.dynamic.loading.ClassInjector.UsingUnsafe.Dispatcher.Initializable run2() {
                        r16 = this;
                        java.lang.String r1 = "override"
                        java.lang.String r2 = "defineClass"
                        java.lang.String r3 = "theUnsafe"
                        java.lang.Class<java.lang.reflect.AccessibleObject> r4 = java.lang.reflect.AccessibleObject.class
                        net.bytebuddy.utility.GraalImageCode r0 = net.bytebuddy.utility.GraalImageCode.getCurrent()
                        boolean r0 = r0.isDefined()
                        java.lang.String r0 = java.lang.Boolean.toString(r0)
                        java.lang.String r5 = "net.bytebuddy.safe"
                        java.lang.String r0 = java.lang.System.getProperty(r5, r0)
                        boolean r0 = java.lang.Boolean.parseBoolean(r0)
                        if (r0 == 0) goto L28
                        net.bytebuddy.dynamic.loading.ClassInjector$UsingUnsafe$Dispatcher$Unavailable r0 = new net.bytebuddy.dynamic.loading.ClassInjector$UsingUnsafe$Dispatcher$Unavailable
                        java.lang.String r1 = "Use of Unsafe was disabled by system property"
                        r0.<init>(r1)
                        return r0
                    L28:
                        java.lang.String r0 = "sun.misc.Unsafe"
                        java.lang.Class r5 = java.lang.Class.forName(r0)     // Catch: java.lang.Exception -> L113
                        java.lang.reflect.Field r0 = r5.getDeclaredField(r3)     // Catch: java.lang.Exception -> L113
                        r6 = 1
                        r0.setAccessible(r6)     // Catch: java.lang.Exception -> L113
                        r7 = 0
                        java.lang.Object r8 = r0.get(r7)     // Catch: java.lang.Exception -> L113
                        java.lang.Class<java.lang.String> r9 = java.lang.String.class
                        java.lang.Class<byte[]> r10 = byte[].class
                        java.lang.Class r12 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L57
                        java.lang.Class<java.lang.ClassLoader> r13 = java.lang.ClassLoader.class
                        java.lang.Class<java.security.ProtectionDomain> r14 = java.security.ProtectionDomain.class
                        r11 = r12
                        java.lang.Class[] r0 = new java.lang.Class[]{r9, r10, r11, r12, r13, r14}     // Catch: java.lang.Exception -> L57
                        java.lang.reflect.Method r0 = r5.getMethod(r2, r0)     // Catch: java.lang.Exception -> L57
                        r0.setAccessible(r6)     // Catch: java.lang.Exception -> L57
                        net.bytebuddy.dynamic.loading.ClassInjector$UsingUnsafe$Dispatcher$Enabled r6 = new net.bytebuddy.dynamic.loading.ClassInjector$UsingUnsafe$Dispatcher$Enabled     // Catch: java.lang.Exception -> L57
                        r6.<init>(r8, r0)     // Catch: java.lang.Exception -> L57
                        return r6
                    L57:
                        r0 = move-exception
                        java.lang.reflect.Field r1 = r4.getDeclaredField(r1)     // Catch: java.lang.NoSuchFieldException -> L5d java.lang.Exception -> L112
                        goto Lb2
                    L5d:
                        net.bytebuddy.ByteBuddy r6 = new net.bytebuddy.ByteBuddy     // Catch: java.lang.Exception -> L112
                        r6.<init>()     // Catch: java.lang.Exception -> L112
                        net.bytebuddy.dynamic.DynamicType$Builder r6 = r6.redefine(r4)     // Catch: java.lang.Exception -> L112
                        java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L112
                        r9.<init>()     // Catch: java.lang.Exception -> L112
                        java.lang.String r10 = "net.bytebuddy.mirror."
                        r9.append(r10)     // Catch: java.lang.Exception -> L112
                        java.lang.String r10 = r4.getSimpleName()     // Catch: java.lang.Exception -> L112
                        r9.append(r10)     // Catch: java.lang.Exception -> L112
                        java.lang.String r9 = r9.toString()     // Catch: java.lang.Exception -> L112
                        net.bytebuddy.dynamic.DynamicType$Builder r6 = r6.name(r9)     // Catch: java.lang.Exception -> L112
                        net.bytebuddy.dynamic.DynamicType$Builder r6 = r6.noNestMate()     // Catch: java.lang.Exception -> L112
                        net.bytebuddy.asm.MemberRemoval r9 = new net.bytebuddy.asm.MemberRemoval     // Catch: java.lang.Exception -> L112
                        r9.<init>()     // Catch: java.lang.Exception -> L112
                        net.bytebuddy.matcher.ElementMatcher$Junction r10 = net.bytebuddy.matcher.ElementMatchers.any()     // Catch: java.lang.Exception -> L112
                        net.bytebuddy.asm.MemberRemoval r9 = r9.stripInvokables(r10)     // Catch: java.lang.Exception -> L112
                        net.bytebuddy.dynamic.DynamicType$Builder r6 = r6.visit(r9)     // Catch: java.lang.Exception -> L112
                        net.bytebuddy.dynamic.DynamicType$Unloaded r6 = r6.make()     // Catch: java.lang.Exception -> L112
                        java.lang.ClassLoader r9 = r4.getClassLoader()     // Catch: java.lang.Exception -> L112
                        net.bytebuddy.dynamic.loading.ClassLoadingStrategy$Default r10 = net.bytebuddy.dynamic.loading.ClassLoadingStrategy.Default.WRAPPER     // Catch: java.lang.Exception -> L112
                        java.security.ProtectionDomain r4 = r4.getProtectionDomain()     // Catch: java.lang.Exception -> L112
                        net.bytebuddy.dynamic.loading.ClassLoadingStrategy$Configurable r4 = r10.with(r4)     // Catch: java.lang.Exception -> L112
                        net.bytebuddy.dynamic.DynamicType$Loaded r4 = r6.load(r9, r4)     // Catch: java.lang.Exception -> L112
                        java.lang.Class r4 = r4.getLoaded()     // Catch: java.lang.Exception -> L112
                        java.lang.reflect.Field r1 = r4.getDeclaredField(r1)     // Catch: java.lang.Exception -> L112
                    Lb2:
                        java.lang.String r4 = "objectFieldOffset"
                        java.lang.Class<java.lang.reflect.Field> r6 = java.lang.reflect.Field.class
                        java.lang.Class[] r6 = new java.lang.Class[]{r6}     // Catch: java.lang.Exception -> L112
                        java.lang.reflect.Method r4 = r5.getMethod(r4, r6)     // Catch: java.lang.Exception -> L112
                        java.lang.Object[] r1 = new java.lang.Object[]{r1}     // Catch: java.lang.Exception -> L112
                        java.lang.Object r1 = r4.invoke(r8, r1)     // Catch: java.lang.Exception -> L112
                        java.lang.Long r1 = (java.lang.Long) r1     // Catch: java.lang.Exception -> L112
                        r1.longValue()     // Catch: java.lang.Exception -> L112
                        java.lang.String r4 = "putBoolean"
                        java.lang.Class<java.lang.Object> r6 = java.lang.Object.class
                        java.lang.Class r9 = java.lang.Long.TYPE     // Catch: java.lang.Exception -> L112
                        java.lang.Class r10 = java.lang.Boolean.TYPE     // Catch: java.lang.Exception -> L112
                        java.lang.Class[] r6 = new java.lang.Class[]{r6, r9, r10}     // Catch: java.lang.Exception -> L112
                        java.lang.reflect.Method r4 = r5.getMethod(r4, r6)     // Catch: java.lang.Exception -> L112
                        java.lang.String r5 = "jdk.internal.misc.Unsafe"
                        java.lang.Class r5 = java.lang.Class.forName(r5)     // Catch: java.lang.Exception -> L112
                        java.lang.reflect.Field r3 = r5.getDeclaredField(r3)     // Catch: java.lang.Exception -> L112
                        java.lang.Boolean r6 = java.lang.Boolean.TRUE     // Catch: java.lang.Exception -> L112
                        java.lang.Object[] r9 = new java.lang.Object[]{r3, r1, r6}     // Catch: java.lang.Exception -> L112
                        r4.invoke(r8, r9)     // Catch: java.lang.Exception -> L112
                        java.lang.Class<java.lang.String> r10 = java.lang.String.class
                        java.lang.Class<byte[]> r11 = byte[].class
                        java.lang.Class r13 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L112
                        java.lang.Class<java.lang.ClassLoader> r14 = java.lang.ClassLoader.class
                        java.lang.Class<java.security.ProtectionDomain> r15 = java.security.ProtectionDomain.class
                        r12 = r13
                        java.lang.Class[] r9 = new java.lang.Class[]{r10, r11, r12, r13, r14, r15}     // Catch: java.lang.Exception -> L112
                        java.lang.reflect.Method r2 = r5.getMethod(r2, r9)     // Catch: java.lang.Exception -> L112
                        java.lang.Object[] r1 = new java.lang.Object[]{r2, r1, r6}     // Catch: java.lang.Exception -> L112
                        r4.invoke(r8, r1)     // Catch: java.lang.Exception -> L112
                        net.bytebuddy.dynamic.loading.ClassInjector$UsingUnsafe$Dispatcher$Enabled r1 = new net.bytebuddy.dynamic.loading.ClassInjector$UsingUnsafe$Dispatcher$Enabled     // Catch: java.lang.Exception -> L112
                        java.lang.Object r3 = r3.get(r7)     // Catch: java.lang.Exception -> L112
                        r1.<init>(r3, r2)     // Catch: java.lang.Exception -> L112
                        return r1
                    L112:
                        throw r0     // Catch: java.lang.Exception -> L113
                    L113:
                        r0 = move-exception
                        net.bytebuddy.dynamic.loading.ClassInjector$UsingUnsafe$Dispatcher$Unavailable r1 = new net.bytebuddy.dynamic.loading.ClassInjector$UsingUnsafe$Dispatcher$Unavailable
                        java.lang.String r0 = r0.getMessage()
                        r1.<init>(r0)
                        return r1
                }
            }

            @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
            public static class Enabled implements net.bytebuddy.dynamic.loading.ClassInjector.UsingUnsafe.Dispatcher, net.bytebuddy.dynamic.loading.ClassInjector.UsingUnsafe.Dispatcher.Initializable {
                private final java.lang.reflect.Method defineClass;
                private final java.lang.Object unsafe;

                public Enabled(java.lang.Object r1, java.lang.reflect.Method r2) {
                        r0 = this;
                        r0.<init>()
                        r0.unsafe = r1
                        r0.defineClass = r2
                        return
                }

                @Override // net.bytebuddy.dynamic.loading.ClassInjector.UsingUnsafe.Dispatcher
                public java.lang.Class<?> defineClass(@net.bytebuddy.utility.nullability.MaybeNull java.lang.ClassLoader r10, java.lang.String r11, byte[] r12, @net.bytebuddy.utility.nullability.MaybeNull java.security.ProtectionDomain r13) {
                        r9 = this;
                        java.lang.reflect.Method r0 = r9.defineClass     // Catch: java.lang.reflect.InvocationTargetException -> L1d java.lang.IllegalAccessException -> L1f
                        java.lang.Object r1 = r9.unsafe     // Catch: java.lang.reflect.InvocationTargetException -> L1d java.lang.IllegalAccessException -> L1f
                        r2 = 0
                        java.lang.Integer r5 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.reflect.InvocationTargetException -> L1d java.lang.IllegalAccessException -> L1f
                        int r2 = r12.length     // Catch: java.lang.reflect.InvocationTargetException -> L1d java.lang.IllegalAccessException -> L1f
                        java.lang.Integer r6 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.reflect.InvocationTargetException -> L1d java.lang.IllegalAccessException -> L1f
                        r3 = r11
                        r4 = r12
                        r7 = r10
                        r8 = r13
                        java.lang.Object[] r10 = new java.lang.Object[]{r3, r4, r5, r6, r7, r8}     // Catch: java.lang.reflect.InvocationTargetException -> L1d java.lang.IllegalAccessException -> L1f
                        java.lang.Object r10 = r0.invoke(r1, r10)     // Catch: java.lang.reflect.InvocationTargetException -> L1d java.lang.IllegalAccessException -> L1f
                        java.lang.Class r10 = (java.lang.Class) r10     // Catch: java.lang.reflect.InvocationTargetException -> L1d java.lang.IllegalAccessException -> L1f
                        return r10
                    L1d:
                        r10 = move-exception
                        goto L21
                    L1f:
                        r10 = move-exception
                        goto L2b
                    L21:
                        java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                        java.lang.Throwable r10 = r10.getTargetException()
                        r11.<init>(r10)
                        throw r11
                    L2b:
                        java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                        r11.<init>(r10)
                        throw r11
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
                        java.lang.Object r2 = r4.unsafe
                        net.bytebuddy.dynamic.loading.ClassInjector$UsingUnsafe$Dispatcher$Enabled r5 = (net.bytebuddy.dynamic.loading.ClassInjector.UsingUnsafe.Dispatcher.Enabled) r5
                        java.lang.Object r3 = r5.unsafe
                        boolean r2 = r2.equals(r3)
                        if (r2 != 0) goto L20
                        return r1
                    L20:
                        java.lang.reflect.Method r2 = r4.defineClass
                        java.lang.reflect.Method r5 = r5.defineClass
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
                        java.lang.Object r1 = r2.unsafe
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        int r0 = r0 * 31
                        java.lang.reflect.Method r1 = r2.defineClass
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        return r0
                }

                @Override // net.bytebuddy.dynamic.loading.ClassInjector.UsingUnsafe.Dispatcher.Initializable
                public net.bytebuddy.dynamic.loading.ClassInjector.UsingUnsafe.Dispatcher initialize() {
                        r3 = this;
                        net.bytebuddy.dynamic.loading.ClassInjector$UsingUnsafe$System r0 = net.bytebuddy.dynamic.loading.ClassInjector.UsingUnsafe.access$200()
                        java.lang.Object r0 = r0.getSecurityManager()
                        if (r0 == 0) goto L34
                        java.lang.reflect.Method r1 = net.bytebuddy.dynamic.loading.ClassInjector.UsingUnsafe.access$300()     // Catch: java.lang.Exception -> L18 java.lang.reflect.InvocationTargetException -> L1a
                        java.security.Permission r2 = net.bytebuddy.dynamic.loading.ClassInjector.SUPPRESS_ACCESS_CHECKS     // Catch: java.lang.Exception -> L18 java.lang.reflect.InvocationTargetException -> L1a
                        java.lang.Object[] r2 = new java.lang.Object[]{r2}     // Catch: java.lang.Exception -> L18 java.lang.reflect.InvocationTargetException -> L1a
                        r1.invoke(r0, r2)     // Catch: java.lang.Exception -> L18 java.lang.reflect.InvocationTargetException -> L1a
                        goto L34
                    L18:
                        r0 = move-exception
                        goto L1c
                    L1a:
                        r0 = move-exception
                        goto L26
                    L1c:
                        net.bytebuddy.dynamic.loading.ClassInjector$UsingUnsafe$Dispatcher$Unavailable r1 = new net.bytebuddy.dynamic.loading.ClassInjector$UsingUnsafe$Dispatcher$Unavailable
                        java.lang.String r0 = r0.getMessage()
                        r1.<init>(r0)
                        return r1
                    L26:
                        net.bytebuddy.dynamic.loading.ClassInjector$UsingUnsafe$Dispatcher$Unavailable r1 = new net.bytebuddy.dynamic.loading.ClassInjector$UsingUnsafe$Dispatcher$Unavailable
                        java.lang.Throwable r0 = r0.getTargetException()
                        java.lang.String r0 = r0.getMessage()
                        r1.<init>(r0)
                        return r1
                    L34:
                        return r3
                }

                @Override // net.bytebuddy.dynamic.loading.ClassInjector.UsingUnsafe.Dispatcher.Initializable
                public boolean isAvailable() {
                        r1 = this;
                        r0 = 1
                        return r0
                }
            }

            public interface Initializable {
                net.bytebuddy.dynamic.loading.ClassInjector.UsingUnsafe.Dispatcher initialize();

                boolean isAvailable();
            }

            @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
            public static class Unavailable implements net.bytebuddy.dynamic.loading.ClassInjector.UsingUnsafe.Dispatcher, net.bytebuddy.dynamic.loading.ClassInjector.UsingUnsafe.Dispatcher.Initializable {
                private final java.lang.String message;

                public Unavailable(java.lang.String r1) {
                        r0 = this;
                        r0.<init>()
                        r0.message = r1
                        return
                }

                @Override // net.bytebuddy.dynamic.loading.ClassInjector.UsingUnsafe.Dispatcher
                public java.lang.Class<?> defineClass(@net.bytebuddy.utility.nullability.MaybeNull java.lang.ClassLoader r1, java.lang.String r2, byte[] r3, @net.bytebuddy.utility.nullability.MaybeNull java.security.ProtectionDomain r4) {
                        r0 = this;
                        java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                        java.lang.StringBuilder r2 = new java.lang.StringBuilder
                        r2.<init>()
                        java.lang.String r3 = "Could not access Unsafe class: "
                        r2.append(r3)
                        java.lang.String r3 = r0.message
                        r2.append(r3)
                        java.lang.String r2 = r2.toString()
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
                        java.lang.String r2 = r4.message
                        net.bytebuddy.dynamic.loading.ClassInjector$UsingUnsafe$Dispatcher$Unavailable r5 = (net.bytebuddy.dynamic.loading.ClassInjector.UsingUnsafe.Dispatcher.Unavailable) r5
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

                @Override // net.bytebuddy.dynamic.loading.ClassInjector.UsingUnsafe.Dispatcher.Initializable
                public net.bytebuddy.dynamic.loading.ClassInjector.UsingUnsafe.Dispatcher initialize() {
                        r3 = this;
                        java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                        java.lang.StringBuilder r1 = new java.lang.StringBuilder
                        r1.<init>()
                        java.lang.String r2 = "Could not access Unsafe class: "
                        r1.append(r2)
                        java.lang.String r2 = r3.message
                        r1.append(r2)
                        java.lang.String r1 = r1.toString()
                        r0.<init>(r1)
                        throw r0
                }

                @Override // net.bytebuddy.dynamic.loading.ClassInjector.UsingUnsafe.Dispatcher.Initializable
                public boolean isAvailable() {
                        r1 = this;
                        r0 = 0
                        return r0
                }
            }

            java.lang.Class<?> defineClass(@net.bytebuddy.utility.nullability.MaybeNull java.lang.ClassLoader r1, java.lang.String r2, byte[] r3, @net.bytebuddy.utility.nullability.MaybeNull java.security.ProtectionDomain r4);
        }

        @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
        public static class Factory {
            private final net.bytebuddy.dynamic.loading.ClassInjector.UsingUnsafe.Dispatcher.Initializable dispatcher;

            public interface AccessResolver {

                public enum Default extends java.lang.Enum<net.bytebuddy.dynamic.loading.ClassInjector.UsingUnsafe.Factory.AccessResolver.Default> implements net.bytebuddy.dynamic.loading.ClassInjector.UsingUnsafe.Factory.AccessResolver {
                    private static final /* synthetic */ net.bytebuddy.dynamic.loading.ClassInjector.UsingUnsafe.Factory.AccessResolver.Default[] $VALUES = null;
                    public static final net.bytebuddy.dynamic.loading.ClassInjector.UsingUnsafe.Factory.AccessResolver.Default INSTANCE = null;

                    static {
                            net.bytebuddy.dynamic.loading.ClassInjector$UsingUnsafe$Factory$AccessResolver$Default r0 = new net.bytebuddy.dynamic.loading.ClassInjector$UsingUnsafe$Factory$AccessResolver$Default
                            java.lang.String r1 = "INSTANCE"
                            r2 = 0
                            r0.<init>(r1, r2)
                            net.bytebuddy.dynamic.loading.ClassInjector.UsingUnsafe.Factory.AccessResolver.Default.INSTANCE = r0
                            net.bytebuddy.dynamic.loading.ClassInjector$UsingUnsafe$Factory$AccessResolver$Default[] r0 = new net.bytebuddy.dynamic.loading.ClassInjector.UsingUnsafe.Factory.AccessResolver.Default[]{r0}
                            net.bytebuddy.dynamic.loading.ClassInjector.UsingUnsafe.Factory.AccessResolver.Default.$VALUES = r0
                            return
                    }

                    Default(java.lang.String r1, int r2) {
                            r0 = this;
                            r0.<init>(r1, r2)
                            return
                    }

                    public static net.bytebuddy.dynamic.loading.ClassInjector.UsingUnsafe.Factory.AccessResolver.Default valueOf(java.lang.String r1) {
                            java.lang.Class<net.bytebuddy.dynamic.loading.ClassInjector$UsingUnsafe$Factory$AccessResolver$Default> r0 = net.bytebuddy.dynamic.loading.ClassInjector.UsingUnsafe.Factory.AccessResolver.Default.class
                            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                            net.bytebuddy.dynamic.loading.ClassInjector$UsingUnsafe$Factory$AccessResolver$Default r1 = (net.bytebuddy.dynamic.loading.ClassInjector.UsingUnsafe.Factory.AccessResolver.Default) r1
                            return r1
                    }

                    public static net.bytebuddy.dynamic.loading.ClassInjector.UsingUnsafe.Factory.AccessResolver.Default[] values() {
                            net.bytebuddy.dynamic.loading.ClassInjector$UsingUnsafe$Factory$AccessResolver$Default[] r0 = net.bytebuddy.dynamic.loading.ClassInjector.UsingUnsafe.Factory.AccessResolver.Default.$VALUES
                            java.lang.Object r0 = r0.clone()
                            net.bytebuddy.dynamic.loading.ClassInjector$UsingUnsafe$Factory$AccessResolver$Default[] r0 = (net.bytebuddy.dynamic.loading.ClassInjector.UsingUnsafe.Factory.AccessResolver.Default[]) r0
                            return r0
                    }

                    @Override // net.bytebuddy.dynamic.loading.ClassInjector.UsingUnsafe.Factory.AccessResolver
                    public void apply(java.lang.reflect.AccessibleObject r2) {
                            r1 = this;
                            r0 = 1
                            r2.setAccessible(r0)
                            return
                    }
                }

                void apply(java.lang.reflect.AccessibleObject r1);
            }

            public Factory() {
                    r1 = this;
                    net.bytebuddy.dynamic.loading.ClassInjector$UsingUnsafe$Factory$AccessResolver$Default r0 = net.bytebuddy.dynamic.loading.ClassInjector.UsingUnsafe.Factory.AccessResolver.Default.INSTANCE
                    r1.<init>(r0)
                    return
            }

            public Factory(net.bytebuddy.dynamic.loading.ClassInjector.UsingUnsafe.Dispatcher.Initializable r1) {
                    r0 = this;
                    r0.<init>()
                    r0.dispatcher = r1
                    return
            }

            @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "Exception should not be rethrown but trigger a fallback.", value = {"REC_CATCH_EXCEPTION"})
            public Factory(net.bytebuddy.dynamic.loading.ClassInjector.UsingUnsafe.Factory.AccessResolver r10) {
                    r9 = this;
                    r9.<init>()
                    net.bytebuddy.dynamic.loading.ClassInjector$UsingUnsafe$Dispatcher$Initializable r0 = net.bytebuddy.dynamic.loading.ClassInjector.UsingUnsafe.access$400()
                    boolean r0 = r0.isAvailable()
                    if (r0 == 0) goto L12
                    net.bytebuddy.dynamic.loading.ClassInjector$UsingUnsafe$Dispatcher$Initializable r10 = net.bytebuddy.dynamic.loading.ClassInjector.UsingUnsafe.access$400()
                    goto L4f
                L12:
                    java.lang.String r0 = "jdk.internal.misc.Unsafe"
                    java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Exception -> L44
                    java.lang.String r1 = "theUnsafe"
                    java.lang.reflect.Field r1 = r0.getDeclaredField(r1)     // Catch: java.lang.Exception -> L44
                    r10.apply(r1)     // Catch: java.lang.Exception -> L44
                    r2 = 0
                    java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.Exception -> L44
                    java.lang.String r2 = "defineClass"
                    java.lang.Class<java.lang.String> r3 = java.lang.String.class
                    java.lang.Class<byte[]> r4 = byte[].class
                    java.lang.Class r6 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L44
                    java.lang.Class<java.lang.ClassLoader> r7 = java.lang.ClassLoader.class
                    java.lang.Class<java.security.ProtectionDomain> r8 = java.security.ProtectionDomain.class
                    r5 = r6
                    java.lang.Class[] r3 = new java.lang.Class[]{r3, r4, r5, r6, r7, r8}     // Catch: java.lang.Exception -> L44
                    java.lang.reflect.Method r0 = r0.getMethod(r2, r3)     // Catch: java.lang.Exception -> L44
                    r10.apply(r0)     // Catch: java.lang.Exception -> L44
                    net.bytebuddy.dynamic.loading.ClassInjector$UsingUnsafe$Dispatcher$Enabled r10 = new net.bytebuddy.dynamic.loading.ClassInjector$UsingUnsafe$Dispatcher$Enabled     // Catch: java.lang.Exception -> L44
                    r10.<init>(r1, r0)     // Catch: java.lang.Exception -> L44
                    goto L4f
                L44:
                    r10 = move-exception
                    net.bytebuddy.dynamic.loading.ClassInjector$UsingUnsafe$Dispatcher$Unavailable r0 = new net.bytebuddy.dynamic.loading.ClassInjector$UsingUnsafe$Dispatcher$Unavailable
                    java.lang.String r10 = r10.getMessage()
                    r0.<init>(r10)
                    r10 = r0
                L4f:
                    r9.dispatcher = r10
                    return
            }

            public static net.bytebuddy.dynamic.loading.ClassInjector.UsingUnsafe.Factory resolve(java.lang.instrument.Instrumentation r1) {
                    r0 = 0
                    net.bytebuddy.dynamic.loading.ClassInjector$UsingUnsafe$Factory r1 = resolve(r1, r0)
                    return r1
            }

            @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "Exception intends to trigger disabled injection strategy. Modules are assumed if module system is supported.", value = {"REC_CATCH_EXCEPTION", "NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE"})
            public static net.bytebuddy.dynamic.loading.ClassInjector.UsingUnsafe.Factory resolve(java.lang.instrument.Instrumentation r11, boolean r12) {
                    java.lang.Class<net.bytebuddy.dynamic.loading.ClassInjector$UsingUnsafe$Factory$AccessResolver> r0 = net.bytebuddy.dynamic.loading.ClassInjector.UsingUnsafe.Factory.AccessResolver.class
                    boolean r1 = net.bytebuddy.dynamic.loading.ClassInjector.UsingUnsafe.isAvailable()
                    if (r1 != 0) goto Lfc
                    boolean r1 = net.bytebuddy.utility.JavaModule.isSupported()
                    if (r1 != 0) goto L10
                    goto Lfc
                L10:
                    java.lang.String r1 = "jdk.internal.misc.Unsafe"
                    java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Exception -> L35
                    net.bytebuddy.description.type.PackageDescription$ForLoadedPackage r2 = new net.bytebuddy.description.type.PackageDescription$ForLoadedPackage     // Catch: java.lang.Exception -> L35
                    java.lang.Package r3 = r1.getPackage()     // Catch: java.lang.Exception -> L35
                    r2.<init>(r3)     // Catch: java.lang.Exception -> L35
                    net.bytebuddy.utility.JavaModule r5 = net.bytebuddy.utility.JavaModule.ofType(r1)     // Catch: java.lang.Exception -> L35
                    java.lang.Class<net.bytebuddy.dynamic.loading.ClassInjector$UsingUnsafe> r1 = net.bytebuddy.dynamic.loading.ClassInjector.UsingUnsafe.class
                    net.bytebuddy.utility.JavaModule r1 = net.bytebuddy.utility.JavaModule.ofType(r1)     // Catch: java.lang.Exception -> L35
                    boolean r1 = r5.isOpened(r2, r1)     // Catch: java.lang.Exception -> L35
                    if (r1 == 0) goto L38
                    net.bytebuddy.dynamic.loading.ClassInjector$UsingUnsafe$Factory r11 = new net.bytebuddy.dynamic.loading.ClassInjector$UsingUnsafe$Factory     // Catch: java.lang.Exception -> L35
                    r11.<init>()     // Catch: java.lang.Exception -> L35
                    return r11
                L35:
                    r11 = move-exception
                    goto Led
                L38:
                    if (r12 == 0) goto L66
                    java.lang.Class<net.bytebuddy.dynamic.loading.ClassInjector$UsingUnsafe$Factory$AccessResolver$Default> r12 = net.bytebuddy.dynamic.loading.ClassInjector.UsingUnsafe.Factory.AccessResolver.Default.class
                    net.bytebuddy.utility.JavaModule r12 = net.bytebuddy.utility.JavaModule.ofType(r12)     // Catch: java.lang.Exception -> L35
                    java.util.Set r6 = java.util.Collections.singleton(r12)     // Catch: java.lang.Exception -> L35
                    java.util.Map r7 = java.util.Collections.emptyMap()     // Catch: java.lang.Exception -> L35
                    java.lang.String r0 = r2.getName()     // Catch: java.lang.Exception -> L35
                    java.util.Set r12 = java.util.Collections.singleton(r12)     // Catch: java.lang.Exception -> L35
                    java.util.Map r8 = java.util.Collections.singletonMap(r0, r12)     // Catch: java.lang.Exception -> L35
                    java.util.Set r9 = java.util.Collections.emptySet()     // Catch: java.lang.Exception -> L35
                    java.util.Map r10 = java.util.Collections.emptyMap()     // Catch: java.lang.Exception -> L35
                    r4 = r11
                    net.bytebuddy.dynamic.loading.ClassInjector.UsingInstrumentation.redefineModule(r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Exception -> L35
                    net.bytebuddy.dynamic.loading.ClassInjector$UsingUnsafe$Factory r11 = new net.bytebuddy.dynamic.loading.ClassInjector$UsingUnsafe$Factory     // Catch: java.lang.Exception -> L35
                    r11.<init>()     // Catch: java.lang.Exception -> L35
                    return r11
                L66:
                    net.bytebuddy.ByteBuddy r12 = new net.bytebuddy.ByteBuddy     // Catch: java.lang.Exception -> L35
                    r12.<init>()     // Catch: java.lang.Exception -> L35
                    net.bytebuddy.dynamic.DynamicType$Builder r12 = r12.subclass(r0)     // Catch: java.lang.Exception -> L35
                    java.lang.String r1 = "apply"
                    net.bytebuddy.matcher.ElementMatcher$Junction r1 = net.bytebuddy.matcher.ElementMatchers.named(r1)     // Catch: java.lang.Exception -> L35
                    net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ImplementationDefinition r12 = r12.method(r1)     // Catch: java.lang.Exception -> L35
                    java.lang.Class<java.lang.reflect.AccessibleObject> r1 = java.lang.reflect.AccessibleObject.class
                    java.lang.String r3 = "setAccessible"
                    java.lang.Class r4 = java.lang.Boolean.TYPE     // Catch: java.lang.Exception -> L35
                    java.lang.Class[] r4 = new java.lang.Class[]{r4}     // Catch: java.lang.Exception -> L35
                    java.lang.reflect.Method r1 = r1.getMethod(r3, r4)     // Catch: java.lang.Exception -> L35
                    net.bytebuddy.implementation.MethodCall$WithoutSpecifiedTarget r1 = net.bytebuddy.implementation.MethodCall.invoke(r1)     // Catch: java.lang.Exception -> L35
                    r3 = 0
                    net.bytebuddy.implementation.MethodCall r1 = r1.onArgument(r3)     // Catch: java.lang.Exception -> L35
                    java.lang.Boolean r3 = java.lang.Boolean.TRUE     // Catch: java.lang.Exception -> L35
                    java.lang.Object[] r3 = new java.lang.Object[]{r3}     // Catch: java.lang.Exception -> L35
                    net.bytebuddy.implementation.MethodCall r1 = r1.with(r3)     // Catch: java.lang.Exception -> L35
                    net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition r12 = r12.intercept(r1)     // Catch: java.lang.Exception -> L35
                    net.bytebuddy.dynamic.DynamicType$Unloaded r12 = r12.make()     // Catch: java.lang.Exception -> L35
                    java.lang.ClassLoader r1 = r0.getClassLoader()     // Catch: java.lang.Exception -> L35
                    net.bytebuddy.dynamic.loading.ClassLoadingStrategy$Default r3 = net.bytebuddy.dynamic.loading.ClassLoadingStrategy.Default.WRAPPER     // Catch: java.lang.Exception -> L35
                    java.security.ProtectionDomain r0 = r0.getProtectionDomain()     // Catch: java.lang.Exception -> L35
                    net.bytebuddy.dynamic.loading.ClassLoadingStrategy$Configurable r0 = r3.with(r0)     // Catch: java.lang.Exception -> L35
                    net.bytebuddy.dynamic.DynamicType$Loaded r12 = r12.load(r1, r0)     // Catch: java.lang.Exception -> L35
                    java.lang.Class r12 = r12.getLoaded()     // Catch: java.lang.Exception -> L35
                    net.bytebuddy.utility.JavaModule r0 = net.bytebuddy.utility.JavaModule.ofType(r12)     // Catch: java.lang.Exception -> L35
                    java.util.Set r6 = java.util.Collections.singleton(r0)     // Catch: java.lang.Exception -> L35
                    java.util.Map r7 = java.util.Collections.emptyMap()     // Catch: java.lang.Exception -> L35
                    java.lang.String r1 = r2.getName()     // Catch: java.lang.Exception -> L35
                    java.util.Set r0 = java.util.Collections.singleton(r0)     // Catch: java.lang.Exception -> L35
                    java.util.Map r8 = java.util.Collections.singletonMap(r1, r0)     // Catch: java.lang.Exception -> L35
                    java.util.Set r9 = java.util.Collections.emptySet()     // Catch: java.lang.Exception -> L35
                    java.util.Map r10 = java.util.Collections.emptyMap()     // Catch: java.lang.Exception -> L35
                    r4 = r11
                    net.bytebuddy.dynamic.loading.ClassInjector.UsingInstrumentation.redefineModule(r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Exception -> L35
                    net.bytebuddy.dynamic.loading.ClassInjector$UsingUnsafe$Factory r11 = new net.bytebuddy.dynamic.loading.ClassInjector$UsingUnsafe$Factory     // Catch: java.lang.Exception -> L35
                    r0 = 0
                    java.lang.reflect.Constructor r12 = r12.getConstructor(r0)     // Catch: java.lang.Exception -> L35
                    java.lang.Object r12 = r12.newInstance(r0)     // Catch: java.lang.Exception -> L35
                    net.bytebuddy.dynamic.loading.ClassInjector$UsingUnsafe$Factory$AccessResolver r12 = (net.bytebuddy.dynamic.loading.ClassInjector.UsingUnsafe.Factory.AccessResolver) r12     // Catch: java.lang.Exception -> L35
                    r11.<init>(r12)     // Catch: java.lang.Exception -> L35
                    return r11
                Led:
                    net.bytebuddy.dynamic.loading.ClassInjector$UsingUnsafe$Factory r12 = new net.bytebuddy.dynamic.loading.ClassInjector$UsingUnsafe$Factory
                    net.bytebuddy.dynamic.loading.ClassInjector$UsingUnsafe$Dispatcher$Unavailable r0 = new net.bytebuddy.dynamic.loading.ClassInjector$UsingUnsafe$Dispatcher$Unavailable
                    java.lang.String r11 = r11.getMessage()
                    r0.<init>(r11)
                    r12.<init>(r0)
                    return r12
                Lfc:
                    net.bytebuddy.dynamic.loading.ClassInjector$UsingUnsafe$Factory r11 = new net.bytebuddy.dynamic.loading.ClassInjector$UsingUnsafe$Factory
                    r11.<init>()
                    return r11
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
                    net.bytebuddy.dynamic.loading.ClassInjector$UsingUnsafe$Dispatcher$Initializable r2 = r4.dispatcher
                    net.bytebuddy.dynamic.loading.ClassInjector$UsingUnsafe$Factory r5 = (net.bytebuddy.dynamic.loading.ClassInjector.UsingUnsafe.Factory) r5
                    net.bytebuddy.dynamic.loading.ClassInjector$UsingUnsafe$Dispatcher$Initializable r5 = r5.dispatcher
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
                    net.bytebuddy.dynamic.loading.ClassInjector$UsingUnsafe$Dispatcher$Initializable r1 = r2.dispatcher
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    return r0
            }

            public boolean isAvailable() {
                    r1 = this;
                    net.bytebuddy.dynamic.loading.ClassInjector$UsingUnsafe$Dispatcher$Initializable r0 = r1.dispatcher
                    boolean r0 = r0.isAvailable()
                    return r0
            }

            public net.bytebuddy.dynamic.loading.ClassInjector make(@net.bytebuddy.utility.nullability.MaybeNull java.lang.ClassLoader r2) {
                    r1 = this;
                    java.security.ProtectionDomain r0 = net.bytebuddy.dynamic.loading.ClassLoadingStrategy.NO_PROTECTION_DOMAIN
                    net.bytebuddy.dynamic.loading.ClassInjector r2 = r1.make(r2, r0)
                    return r2
            }

            public net.bytebuddy.dynamic.loading.ClassInjector make(@net.bytebuddy.utility.nullability.MaybeNull java.lang.ClassLoader r3, @net.bytebuddy.utility.nullability.MaybeNull java.security.ProtectionDomain r4) {
                    r2 = this;
                    net.bytebuddy.dynamic.loading.ClassInjector$UsingUnsafe r0 = new net.bytebuddy.dynamic.loading.ClassInjector$UsingUnsafe
                    net.bytebuddy.dynamic.loading.ClassInjector$UsingUnsafe$Dispatcher$Initializable r1 = r2.dispatcher
                    r0.<init>(r3, r4, r1)
                    return r0
            }
        }

        @net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied("java.lang.System")
        public interface System {
            @net.bytebuddy.utility.dispatcher.JavaDispatcher.IsStatic
            @net.bytebuddy.utility.dispatcher.JavaDispatcher.Defaults
            @net.bytebuddy.utility.nullability.MaybeNull
            @net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied("getSecurityManager")
            java.lang.Object getSecurityManager();
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
                net.bytebuddy.dynamic.loading.ClassInjector.UsingUnsafe.ACCESS_CONTROLLER = r1     // Catch: java.lang.SecurityException -> L16 java.lang.ClassNotFoundException -> L17
                goto L19
            L16:
                r0 = 1
            L17:
                net.bytebuddy.dynamic.loading.ClassInjector.UsingUnsafe.ACCESS_CONTROLLER = r0
            L19:
                net.bytebuddy.dynamic.loading.ClassInjector$UsingUnsafe$Dispatcher$CreationAction r0 = net.bytebuddy.dynamic.loading.ClassInjector.UsingUnsafe.Dispatcher.CreationAction.INSTANCE
                java.lang.Object r0 = doPrivileged(r0)
                net.bytebuddy.dynamic.loading.ClassInjector$UsingUnsafe$Dispatcher$Initializable r0 = (net.bytebuddy.dynamic.loading.ClassInjector.UsingUnsafe.Dispatcher.Initializable) r0
                net.bytebuddy.dynamic.loading.ClassInjector.UsingUnsafe.DISPATCHER = r0
                java.lang.Class<net.bytebuddy.dynamic.loading.ClassInjector$UsingUnsafe$System> r0 = net.bytebuddy.dynamic.loading.ClassInjector.UsingUnsafe.System.class
                java.security.PrivilegedAction r0 = net.bytebuddy.utility.dispatcher.JavaDispatcher.of(r0)
                java.lang.Object r0 = doPrivileged(r0)
                net.bytebuddy.dynamic.loading.ClassInjector$UsingUnsafe$System r0 = (net.bytebuddy.dynamic.loading.ClassInjector.UsingUnsafe.System) r0
                net.bytebuddy.dynamic.loading.ClassInjector.UsingUnsafe.SYSTEM = r0
                net.bytebuddy.utility.privilege.GetMethodAction r0 = new net.bytebuddy.utility.privilege.GetMethodAction
                java.lang.Class<java.security.Permission> r1 = java.security.Permission.class
                java.lang.Class[] r1 = new java.lang.Class[]{r1}
                java.lang.String r2 = "java.lang.SecurityManager"
                java.lang.String r3 = "checkPermission"
                r0.<init>(r2, r3, r1)
                java.lang.Object r0 = doPrivileged(r0)
                java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
                net.bytebuddy.dynamic.loading.ClassInjector.UsingUnsafe.CHECK_PERMISSION = r0
                java.lang.Object r0 = new java.lang.Object
                r0.<init>()
                net.bytebuddy.dynamic.loading.ClassInjector.UsingUnsafe.BOOTSTRAP_LOADER_LOCK = r0
                return
        }

        public UsingUnsafe(@net.bytebuddy.utility.nullability.MaybeNull java.lang.ClassLoader r2) {
                r1 = this;
                java.security.ProtectionDomain r0 = net.bytebuddy.dynamic.loading.ClassLoadingStrategy.NO_PROTECTION_DOMAIN
                r1.<init>(r2, r0)
                return
        }

        public UsingUnsafe(@net.bytebuddy.utility.nullability.MaybeNull java.lang.ClassLoader r2, @net.bytebuddy.utility.nullability.MaybeNull java.security.ProtectionDomain r3) {
                r1 = this;
                net.bytebuddy.dynamic.loading.ClassInjector$UsingUnsafe$Dispatcher$Initializable r0 = net.bytebuddy.dynamic.loading.ClassInjector.UsingUnsafe.DISPATCHER
                r1.<init>(r2, r3, r0)
                return
        }

        public UsingUnsafe(@net.bytebuddy.utility.nullability.MaybeNull java.lang.ClassLoader r1, @net.bytebuddy.utility.nullability.MaybeNull java.security.ProtectionDomain r2, net.bytebuddy.dynamic.loading.ClassInjector.UsingUnsafe.Dispatcher.Initializable r3) {
                r0 = this;
                r0.<init>()
                r0.classLoader = r1
                r0.protectionDomain = r2
                r0.dispatcher = r3
                return
        }

        public static /* synthetic */ net.bytebuddy.dynamic.loading.ClassInjector.UsingUnsafe.System access$200() {
                net.bytebuddy.dynamic.loading.ClassInjector$UsingUnsafe$System r0 = net.bytebuddy.dynamic.loading.ClassInjector.UsingUnsafe.SYSTEM
                return r0
        }

        public static /* synthetic */ java.lang.reflect.Method access$300() {
                java.lang.reflect.Method r0 = net.bytebuddy.dynamic.loading.ClassInjector.UsingUnsafe.CHECK_PERMISSION
                return r0
        }

        public static /* synthetic */ net.bytebuddy.dynamic.loading.ClassInjector.UsingUnsafe.Dispatcher.Initializable access$400() {
                net.bytebuddy.dynamic.loading.ClassInjector$UsingUnsafe$Dispatcher$Initializable r0 = net.bytebuddy.dynamic.loading.ClassInjector.UsingUnsafe.DISPATCHER
                return r0
        }

        @net.bytebuddy.build.AccessControllerPlugin.Enhance
        private static <T> T doPrivileged(java.security.PrivilegedAction<T> r1) {
                boolean r0 = net.bytebuddy.dynamic.loading.ClassInjector.UsingUnsafe.ACCESS_CONTROLLER
                if (r0 == 0) goto L9
                java.lang.Object r1 = java.security.AccessController.doPrivileged(r1)
                return r1
            L9:
                java.lang.Object r1 = r1.run()
                return r1
        }

        public static boolean isAvailable() {
                net.bytebuddy.dynamic.loading.ClassInjector$UsingUnsafe$Dispatcher$Initializable r0 = net.bytebuddy.dynamic.loading.ClassInjector.UsingUnsafe.DISPATCHER
                boolean r0 = r0.isAvailable()
                return r0
        }

        public static net.bytebuddy.dynamic.loading.ClassInjector ofBootLoader() {
                net.bytebuddy.dynamic.loading.ClassInjector$UsingUnsafe r0 = new net.bytebuddy.dynamic.loading.ClassInjector$UsingUnsafe
                java.lang.ClassLoader r1 = net.bytebuddy.dynamic.loading.ClassLoadingStrategy.BOOTSTRAP_LOADER
                r0.<init>(r1)
                return r0
        }

        public static net.bytebuddy.dynamic.loading.ClassInjector ofPlatformLoader() {
                net.bytebuddy.dynamic.loading.ClassInjector$UsingUnsafe r0 = new net.bytebuddy.dynamic.loading.ClassInjector$UsingUnsafe
                java.lang.ClassLoader r1 = java.lang.ClassLoader.getSystemClassLoader()
                java.lang.ClassLoader r1 = r1.getParent()
                r0.<init>(r1)
                return r0
        }

        public static net.bytebuddy.dynamic.loading.ClassInjector ofSystemLoader() {
                net.bytebuddy.dynamic.loading.ClassInjector$UsingUnsafe r0 = new net.bytebuddy.dynamic.loading.ClassInjector$UsingUnsafe
                java.lang.ClassLoader r1 = java.lang.ClassLoader.getSystemClassLoader()
                r0.<init>(r1)
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
                net.bytebuddy.dynamic.loading.ClassInjector$UsingUnsafe r5 = (net.bytebuddy.dynamic.loading.ClassInjector.UsingUnsafe) r5
                java.lang.ClassLoader r3 = r5.classLoader
                if (r3 == 0) goto L24
                if (r2 == 0) goto L26
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L27
                return r1
            L24:
                if (r2 == 0) goto L27
            L26:
                return r1
            L27:
                java.security.ProtectionDomain r2 = r4.protectionDomain
                java.security.ProtectionDomain r3 = r5.protectionDomain
                if (r3 == 0) goto L36
                if (r2 == 0) goto L38
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L39
                return r1
            L36:
                if (r2 == 0) goto L39
            L38:
                return r1
            L39:
                net.bytebuddy.dynamic.loading.ClassInjector$UsingUnsafe$Dispatcher$Initializable r2 = r4.dispatcher
                net.bytebuddy.dynamic.loading.ClassInjector$UsingUnsafe$Dispatcher$Initializable r5 = r5.dispatcher
                boolean r5 = r2.equals(r5)
                if (r5 != 0) goto L44
                return r1
            L44:
                return r0
        }

        public int hashCode() {
                r2 = this;
                java.lang.Class r0 = r2.getClass()
                int r0 = r0.hashCode()
                int r0 = r0 * 31
                java.lang.ClassLoader r1 = r2.classLoader
                if (r1 == 0) goto L13
                int r1 = r1.hashCode()
                int r0 = r0 + r1
            L13:
                int r0 = r0 * 31
                java.security.ProtectionDomain r1 = r2.protectionDomain
                if (r1 == 0) goto L1e
                int r1 = r1.hashCode()
                int r0 = r0 + r1
            L1e:
                int r0 = r0 * 31
                net.bytebuddy.dynamic.loading.ClassInjector$UsingUnsafe$Dispatcher$Initializable r1 = r2.dispatcher
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                return r0
        }

        @Override // net.bytebuddy.dynamic.loading.ClassInjector
        public java.util.Map<java.lang.String, java.lang.Class<?>> injectRaw(java.util.Map<? extends java.lang.String, byte[]> r11) {
                r10 = this;
                net.bytebuddy.dynamic.loading.ClassInjector$UsingUnsafe$Dispatcher$Initializable r0 = r10.dispatcher
                net.bytebuddy.dynamic.loading.ClassInjector$UsingUnsafe$Dispatcher r0 = r0.initialize()
                java.util.HashMap r1 = new java.util.HashMap
                r1.<init>()
                java.lang.ClassLoader r2 = r10.classLoader
                if (r2 != 0) goto L11
                java.lang.Object r2 = net.bytebuddy.dynamic.loading.ClassInjector.UsingUnsafe.BOOTSTRAP_LOADER_LOCK
            L11:
                monitor-enter(r2)
                java.util.Set r11 = r11.entrySet()     // Catch: java.lang.Throwable -> L3b
                java.util.Iterator r11 = r11.iterator()     // Catch: java.lang.Throwable -> L3b
            L1a:
                boolean r3 = r11.hasNext()     // Catch: java.lang.Throwable -> L3b
                if (r3 == 0) goto L87
                java.lang.Object r3 = r11.next()     // Catch: java.lang.Throwable -> L3b
                java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch: java.lang.Throwable -> L3b
                r4 = 0
                java.lang.Object r5 = r3.getKey()     // Catch: java.lang.Throwable -> L3b java.lang.ClassNotFoundException -> L3d
                java.lang.Object r6 = r3.getKey()     // Catch: java.lang.Throwable -> L3b java.lang.ClassNotFoundException -> L3d
                java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Throwable -> L3b java.lang.ClassNotFoundException -> L3d
                java.lang.ClassLoader r7 = r10.classLoader     // Catch: java.lang.Throwable -> L3b java.lang.ClassNotFoundException -> L3d
                java.lang.Class r6 = java.lang.Class.forName(r6, r4, r7)     // Catch: java.lang.Throwable -> L3b java.lang.ClassNotFoundException -> L3d
                r1.put(r5, r6)     // Catch: java.lang.Throwable -> L3b java.lang.ClassNotFoundException -> L3d
                goto L1a
            L3b:
                r11 = move-exception
                goto L89
            L3d:
                java.lang.Object r5 = r3.getKey()     // Catch: java.lang.Throwable -> L3b java.lang.Error -> L59 java.lang.RuntimeException -> L5b
                java.lang.ClassLoader r6 = r10.classLoader     // Catch: java.lang.Throwable -> L3b java.lang.Error -> L59 java.lang.RuntimeException -> L5b
                java.lang.Object r7 = r3.getKey()     // Catch: java.lang.Throwable -> L3b java.lang.Error -> L59 java.lang.RuntimeException -> L5b
                java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Throwable -> L3b java.lang.Error -> L59 java.lang.RuntimeException -> L5b
                java.lang.Object r8 = r3.getValue()     // Catch: java.lang.Throwable -> L3b java.lang.Error -> L59 java.lang.RuntimeException -> L5b
                byte[] r8 = (byte[]) r8     // Catch: java.lang.Throwable -> L3b java.lang.Error -> L59 java.lang.RuntimeException -> L5b
                java.security.ProtectionDomain r9 = r10.protectionDomain     // Catch: java.lang.Throwable -> L3b java.lang.Error -> L59 java.lang.RuntimeException -> L5b
                java.lang.Class r6 = r0.defineClass(r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L3b java.lang.Error -> L59 java.lang.RuntimeException -> L5b
                r1.put(r5, r6)     // Catch: java.lang.Throwable -> L3b java.lang.Error -> L59 java.lang.RuntimeException -> L5b
                goto L1a
            L59:
                r5 = move-exception
                goto L5d
            L5b:
                r5 = move-exception
                goto L72
            L5d:
                java.lang.Object r6 = r3.getKey()     // Catch: java.lang.Throwable -> L3b java.lang.ClassNotFoundException -> L71
                java.lang.Object r3 = r3.getKey()     // Catch: java.lang.Throwable -> L3b java.lang.ClassNotFoundException -> L71
                java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L3b java.lang.ClassNotFoundException -> L71
                java.lang.ClassLoader r7 = r10.classLoader     // Catch: java.lang.Throwable -> L3b java.lang.ClassNotFoundException -> L71
                java.lang.Class r3 = java.lang.Class.forName(r3, r4, r7)     // Catch: java.lang.Throwable -> L3b java.lang.ClassNotFoundException -> L71
                r1.put(r6, r3)     // Catch: java.lang.Throwable -> L3b java.lang.ClassNotFoundException -> L71
                goto L1a
            L71:
                throw r5     // Catch: java.lang.Throwable -> L3b
            L72:
                java.lang.Object r6 = r3.getKey()     // Catch: java.lang.Throwable -> L3b java.lang.ClassNotFoundException -> L86
                java.lang.Object r3 = r3.getKey()     // Catch: java.lang.Throwable -> L3b java.lang.ClassNotFoundException -> L86
                java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L3b java.lang.ClassNotFoundException -> L86
                java.lang.ClassLoader r7 = r10.classLoader     // Catch: java.lang.Throwable -> L3b java.lang.ClassNotFoundException -> L86
                java.lang.Class r3 = java.lang.Class.forName(r3, r4, r7)     // Catch: java.lang.Throwable -> L3b java.lang.ClassNotFoundException -> L86
                r1.put(r6, r3)     // Catch: java.lang.Throwable -> L3b java.lang.ClassNotFoundException -> L86
                goto L1a
            L86:
                throw r5     // Catch: java.lang.Throwable -> L3b
            L87:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L3b
                return r1
            L89:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L3b
                throw r11
        }

        @Override // net.bytebuddy.dynamic.loading.ClassInjector
        public boolean isAlive() {
                r1 = this;
                net.bytebuddy.dynamic.loading.ClassInjector$UsingUnsafe$Dispatcher$Initializable r0 = r1.dispatcher
                boolean r0 = r0.isAvailable()
                return r0
        }
    }

    static {
            java.lang.reflect.ReflectPermission r0 = new java.lang.reflect.ReflectPermission
            java.lang.String r1 = "suppressAccessChecks"
            r0.<init>(r1)
            net.bytebuddy.dynamic.loading.ClassInjector.SUPPRESS_ACCESS_CHECKS = r0
            return
    }

    java.util.Map<net.bytebuddy.description.type.TypeDescription, java.lang.Class<?>> inject(java.util.Map<? extends net.bytebuddy.description.type.TypeDescription, byte[]> r1);

    java.util.Map<java.lang.String, java.lang.Class<?>> injectRaw(java.util.Map<? extends java.lang.String, byte[]> r1);

    boolean isAlive();
}
