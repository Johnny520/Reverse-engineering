package net.bytebuddy.utility;

/* JADX INFO: loaded from: classes2.dex */
public class JavaModule implements net.bytebuddy.description.NamedElement.WithOptionalName, net.bytebuddy.description.annotation.AnnotationSource {
    private static final boolean ACCESS_CONTROLLER = false;
    protected static final net.bytebuddy.utility.JavaModule.Module MODULE = null;
    protected static final net.bytebuddy.utility.JavaModule.Resolver RESOLVER = null;

    @net.bytebuddy.utility.nullability.AlwaysNull
    public static final net.bytebuddy.utility.JavaModule UNSUPPORTED = null;
    private final java.lang.reflect.AnnotatedElement module;

    @net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied("java.lang.Module")
    public interface Module {
        @net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied("canRead")
        boolean canRead(java.lang.Object r1, @net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied("java.lang.Module") java.lang.Object r2);

        @net.bytebuddy.utility.nullability.MaybeNull
        @net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied("getClassLoader")
        java.lang.ClassLoader getClassLoader(java.lang.Object r1);

        @net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied("getName")
        java.lang.String getName(java.lang.Object r1);

        @net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied("getPackages")
        java.util.Set<java.lang.String> getPackages(java.lang.Object r1);

        @net.bytebuddy.utility.nullability.MaybeNull
        @net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied("getResourceAsStream")
        java.io.InputStream getResourceAsStream(java.lang.Object r1, java.lang.String r2) throws java.io.IOException;

        @net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied("isExported")
        boolean isExported(java.lang.Object r1, java.lang.String r2, @net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied("java.lang.Module") java.lang.Object r3);

        @net.bytebuddy.utility.dispatcher.JavaDispatcher.Instance
        @net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied("isInstance")
        boolean isInstance(java.lang.Object r1);

        @net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied("isNamed")
        boolean isNamed(java.lang.Object r1);

        @net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied("isOpen")
        boolean isOpen(java.lang.Object r1, java.lang.String r2, @net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied("java.lang.Module") java.lang.Object r3);
    }

    @net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied("java.lang.Class")
    public interface Resolver {
        @net.bytebuddy.utility.dispatcher.JavaDispatcher.Defaults
        @net.bytebuddy.utility.nullability.MaybeNull
        @net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied("getModule")
        java.lang.Object getModule(java.lang.Class<?> r1);
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
            net.bytebuddy.utility.JavaModule.ACCESS_CONTROLLER = r2     // Catch: java.lang.SecurityException -> L16 java.lang.ClassNotFoundException -> L17
            goto L19
        L16:
            r1 = 1
        L17:
            net.bytebuddy.utility.JavaModule.ACCESS_CONTROLLER = r1
        L19:
            net.bytebuddy.utility.JavaModule.UNSUPPORTED = r0
            java.lang.Class<net.bytebuddy.utility.JavaModule$Resolver> r0 = net.bytebuddy.utility.JavaModule.Resolver.class
            java.security.PrivilegedAction r0 = net.bytebuddy.utility.dispatcher.JavaDispatcher.of(r0)
            java.lang.Object r0 = doPrivileged(r0)
            net.bytebuddy.utility.JavaModule$Resolver r0 = (net.bytebuddy.utility.JavaModule.Resolver) r0
            net.bytebuddy.utility.JavaModule.RESOLVER = r0
            java.lang.Class<net.bytebuddy.utility.JavaModule$Module> r0 = net.bytebuddy.utility.JavaModule.Module.class
            java.security.PrivilegedAction r0 = net.bytebuddy.utility.dispatcher.JavaDispatcher.of(r0)
            java.lang.Object r0 = doPrivileged(r0)
            net.bytebuddy.utility.JavaModule$Module r0 = (net.bytebuddy.utility.JavaModule.Module) r0
            net.bytebuddy.utility.JavaModule.MODULE = r0
            return
    }

    public JavaModule(java.lang.reflect.AnnotatedElement r1) {
            r0 = this;
            r0.<init>()
            r0.module = r1
            return
    }

    @net.bytebuddy.build.AccessControllerPlugin.Enhance
    private static <T> T doPrivileged(java.security.PrivilegedAction<T> r1) {
            boolean r0 = net.bytebuddy.utility.JavaModule.ACCESS_CONTROLLER
            if (r0 == 0) goto L9
            java.lang.Object r1 = java.security.AccessController.doPrivileged(r1)
            return r1
        L9:
            java.lang.Object r1 = r1.run()
            return r1
    }

    public static boolean isSupported() {
            net.bytebuddy.ClassFileVersion r0 = net.bytebuddy.ClassFileVersion.JAVA_V5
            net.bytebuddy.ClassFileVersion r0 = net.bytebuddy.ClassFileVersion.ofThisVm(r0)
            net.bytebuddy.ClassFileVersion r1 = net.bytebuddy.ClassFileVersion.JAVA_V9
            boolean r0 = r0.isAtLeast(r1)
            return r0
    }

    public static net.bytebuddy.utility.JavaModule of(java.lang.Object r3) {
            net.bytebuddy.utility.JavaModule$Module r0 = net.bytebuddy.utility.JavaModule.MODULE
            boolean r0 = r0.isInstance(r3)
            if (r0 == 0) goto L10
            net.bytebuddy.utility.JavaModule r0 = new net.bytebuddy.utility.JavaModule
            java.lang.reflect.AnnotatedElement r3 = (java.lang.reflect.AnnotatedElement) r3
            r0.<init>(r3)
            return r0
        L10:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Not a Java module: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    @net.bytebuddy.utility.nullability.MaybeNull
    public static net.bytebuddy.utility.JavaModule ofType(java.lang.Class<?> r1) {
            net.bytebuddy.utility.JavaModule$Resolver r0 = net.bytebuddy.utility.JavaModule.RESOLVER
            java.lang.Object r1 = r0.getModule(r1)
            if (r1 != 0) goto Lb
            net.bytebuddy.utility.JavaModule r1 = net.bytebuddy.utility.JavaModule.UNSUPPORTED
            goto L13
        Lb:
            net.bytebuddy.utility.JavaModule r0 = new net.bytebuddy.utility.JavaModule
            java.lang.reflect.AnnotatedElement r1 = (java.lang.reflect.AnnotatedElement) r1
            r0.<init>(r1)
            r1 = r0
        L13:
            return r1
    }

    public boolean canRead(net.bytebuddy.utility.JavaModule r3) {
            r2 = this;
            net.bytebuddy.utility.JavaModule$Module r0 = net.bytebuddy.utility.JavaModule.MODULE
            java.lang.reflect.AnnotatedElement r1 = r2.module
            java.lang.Object r3 = r3.unwrap()
            boolean r3 = r0.canRead(r1, r3)
            return r3
    }

    public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r2) {
            r1 = this;
            if (r1 != r2) goto L4
            r2 = 1
            return r2
        L4:
            boolean r0 = r2 instanceof net.bytebuddy.utility.JavaModule
            if (r0 != 0) goto La
            r2 = 0
            return r2
        La:
            net.bytebuddy.utility.JavaModule r2 = (net.bytebuddy.utility.JavaModule) r2
            java.lang.reflect.AnnotatedElement r0 = r1.module
            java.lang.reflect.AnnotatedElement r2 = r2.module
            boolean r2 = r0.equals(r2)
            return r2
    }

    @Override // net.bytebuddy.description.NamedElement
    public java.lang.String getActualName() {
            r2 = this;
            net.bytebuddy.utility.JavaModule$Module r0 = net.bytebuddy.utility.JavaModule.MODULE
            java.lang.reflect.AnnotatedElement r1 = r2.module
            java.lang.String r0 = r0.getName(r1)
            return r0
    }

    @net.bytebuddy.utility.nullability.MaybeNull
    public java.lang.ClassLoader getClassLoader() {
            r2 = this;
            net.bytebuddy.utility.JavaModule$Module r0 = net.bytebuddy.utility.JavaModule.MODULE
            java.lang.reflect.AnnotatedElement r1 = r2.module
            java.lang.ClassLoader r0 = r0.getClassLoader(r1)
            return r0
    }

    @Override // net.bytebuddy.description.annotation.AnnotationSource
    public net.bytebuddy.description.annotation.AnnotationList getDeclaredAnnotations() {
            r2 = this;
            net.bytebuddy.description.annotation.AnnotationList$ForLoadedAnnotations r0 = new net.bytebuddy.description.annotation.AnnotationList$ForLoadedAnnotations
            java.lang.reflect.AnnotatedElement r1 = r2.module
            java.lang.annotation.Annotation[] r1 = r1.getDeclaredAnnotations()
            r0.<init>(r1)
            return r0
    }

    public java.util.Set<java.lang.String> getPackages() {
            r2 = this;
            net.bytebuddy.utility.JavaModule$Module r0 = net.bytebuddy.utility.JavaModule.MODULE
            java.lang.reflect.AnnotatedElement r1 = r2.module
            java.util.Set r0 = r0.getPackages(r1)
            return r0
    }

    @net.bytebuddy.utility.nullability.MaybeNull
    public java.io.InputStream getResourceAsStream(java.lang.String r3) throws java.io.IOException {
            r2 = this;
            net.bytebuddy.utility.JavaModule$Module r0 = net.bytebuddy.utility.JavaModule.MODULE
            java.lang.reflect.AnnotatedElement r1 = r2.module
            java.io.InputStream r3 = r0.getResourceAsStream(r1, r3)
            return r3
    }

    public int hashCode() {
            r1 = this;
            java.lang.reflect.AnnotatedElement r0 = r1.module
            int r0 = r0.hashCode()
            return r0
    }

    public boolean isExported(@net.bytebuddy.utility.nullability.MaybeNull net.bytebuddy.description.type.PackageDescription r3, net.bytebuddy.utility.JavaModule r4) {
            r2 = this;
            if (r3 == 0) goto L1d
            boolean r0 = r3.isDefault()
            if (r0 != 0) goto L1d
            net.bytebuddy.utility.JavaModule$Module r0 = net.bytebuddy.utility.JavaModule.MODULE
            java.lang.reflect.AnnotatedElement r1 = r2.module
            java.lang.String r3 = r3.getName()
            java.lang.Object r4 = r4.unwrap()
            boolean r3 = r0.isExported(r1, r3, r4)
            if (r3 == 0) goto L1b
            goto L1d
        L1b:
            r3 = 0
            goto L1e
        L1d:
            r3 = 1
        L1e:
            return r3
    }

    @Override // net.bytebuddy.description.NamedElement.WithOptionalName
    public boolean isNamed() {
            r2 = this;
            net.bytebuddy.utility.JavaModule$Module r0 = net.bytebuddy.utility.JavaModule.MODULE
            java.lang.reflect.AnnotatedElement r1 = r2.module
            boolean r0 = r0.isNamed(r1)
            return r0
    }

    public boolean isOpened(@net.bytebuddy.utility.nullability.MaybeNull net.bytebuddy.description.type.PackageDescription r3, net.bytebuddy.utility.JavaModule r4) {
            r2 = this;
            if (r3 == 0) goto L1d
            boolean r0 = r3.isDefault()
            if (r0 != 0) goto L1d
            net.bytebuddy.utility.JavaModule$Module r0 = net.bytebuddy.utility.JavaModule.MODULE
            java.lang.reflect.AnnotatedElement r1 = r2.module
            java.lang.String r3 = r3.getName()
            java.lang.Object r4 = r4.unwrap()
            boolean r3 = r0.isOpen(r1, r3, r4)
            if (r3 == 0) goto L1b
            goto L1d
        L1b:
            r3 = 0
            goto L1e
        L1d:
            r3 = 1
        L1e:
            return r3
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.reflect.AnnotatedElement r0 = r1.module
            java.lang.String r0 = r0.toString()
            return r0
    }

    public java.lang.Object unwrap() {
            r1 = this;
            java.lang.reflect.AnnotatedElement r0 = r1.module
            return r0
    }
}
