package net.bytebuddy;

/* JADX INFO: loaded from: classes2.dex */
public class ClassFileVersion implements java.lang.Comparable<net.bytebuddy.ClassFileVersion>, java.io.Serializable {
    private static final boolean ACCESS_CONTROLLER = false;
    protected static final int BASE_VERSION = 44;
    public static final net.bytebuddy.ClassFileVersion JAVA_V1 = null;
    public static final net.bytebuddy.ClassFileVersion JAVA_V10 = null;
    public static final net.bytebuddy.ClassFileVersion JAVA_V11 = null;
    public static final net.bytebuddy.ClassFileVersion JAVA_V12 = null;
    public static final net.bytebuddy.ClassFileVersion JAVA_V13 = null;
    public static final net.bytebuddy.ClassFileVersion JAVA_V14 = null;
    public static final net.bytebuddy.ClassFileVersion JAVA_V15 = null;
    public static final net.bytebuddy.ClassFileVersion JAVA_V16 = null;
    public static final net.bytebuddy.ClassFileVersion JAVA_V17 = null;
    public static final net.bytebuddy.ClassFileVersion JAVA_V18 = null;
    public static final net.bytebuddy.ClassFileVersion JAVA_V19 = null;
    public static final net.bytebuddy.ClassFileVersion JAVA_V2 = null;
    public static final net.bytebuddy.ClassFileVersion JAVA_V20 = null;
    public static final net.bytebuddy.ClassFileVersion JAVA_V21 = null;
    public static final net.bytebuddy.ClassFileVersion JAVA_V22 = null;
    public static final net.bytebuddy.ClassFileVersion JAVA_V3 = null;
    public static final net.bytebuddy.ClassFileVersion JAVA_V4 = null;
    public static final net.bytebuddy.ClassFileVersion JAVA_V5 = null;
    public static final net.bytebuddy.ClassFileVersion JAVA_V6 = null;
    public static final net.bytebuddy.ClassFileVersion JAVA_V7 = null;
    public static final net.bytebuddy.ClassFileVersion JAVA_V8 = null;
    public static final net.bytebuddy.ClassFileVersion JAVA_V9 = null;
    private static final net.bytebuddy.ClassFileVersion.VersionLocator VERSION_LOCATOR = null;
    private static final long serialVersionUID = 1;
    private final int versionNumber;

    public interface VersionLocator {
        public static final java.lang.String EARLY_ACCESS = "-ea";
        public static final java.lang.String JAVA_VERSION = "java.version";

        @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
        public static class Resolved implements net.bytebuddy.ClassFileVersion.VersionLocator {
            private final net.bytebuddy.ClassFileVersion classFileVersion;

            public Resolved(net.bytebuddy.ClassFileVersion r1) {
                    r0 = this;
                    r0.<init>()
                    r0.classFileVersion = r1
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
                    net.bytebuddy.ClassFileVersion r2 = r4.classFileVersion
                    net.bytebuddy.ClassFileVersion$VersionLocator$Resolved r5 = (net.bytebuddy.ClassFileVersion.VersionLocator.Resolved) r5
                    net.bytebuddy.ClassFileVersion r5 = r5.classFileVersion
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
                    net.bytebuddy.ClassFileVersion r1 = r2.classFileVersion
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    return r0
            }

            @Override // net.bytebuddy.ClassFileVersion.VersionLocator
            public net.bytebuddy.ClassFileVersion resolve() {
                    r1 = this;
                    net.bytebuddy.ClassFileVersion r0 = r1.classFileVersion
                    return r0
            }
        }

        public enum Resolver extends java.lang.Enum<net.bytebuddy.ClassFileVersion.VersionLocator.Resolver> implements java.security.PrivilegedAction<net.bytebuddy.ClassFileVersion.VersionLocator> {
            private static final /* synthetic */ net.bytebuddy.ClassFileVersion.VersionLocator.Resolver[] $VALUES = null;
            public static final net.bytebuddy.ClassFileVersion.VersionLocator.Resolver INSTANCE = null;

            static {
                    net.bytebuddy.ClassFileVersion$VersionLocator$Resolver r0 = new net.bytebuddy.ClassFileVersion$VersionLocator$Resolver
                    java.lang.String r1 = "INSTANCE"
                    r2 = 0
                    r0.<init>(r1, r2)
                    net.bytebuddy.ClassFileVersion.VersionLocator.Resolver.INSTANCE = r0
                    net.bytebuddy.ClassFileVersion$VersionLocator$Resolver[] r0 = new net.bytebuddy.ClassFileVersion.VersionLocator.Resolver[]{r0}
                    net.bytebuddy.ClassFileVersion.VersionLocator.Resolver.$VALUES = r0
                    return
            }

            Resolver(java.lang.String r1, int r2) {
                    r0 = this;
                    r0.<init>(r1, r2)
                    return
            }

            public static net.bytebuddy.ClassFileVersion.VersionLocator.Resolver valueOf(java.lang.String r1) {
                    java.lang.Class<net.bytebuddy.ClassFileVersion$VersionLocator$Resolver> r0 = net.bytebuddy.ClassFileVersion.VersionLocator.Resolver.class
                    java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                    net.bytebuddy.ClassFileVersion$VersionLocator$Resolver r1 = (net.bytebuddy.ClassFileVersion.VersionLocator.Resolver) r1
                    return r1
            }

            public static net.bytebuddy.ClassFileVersion.VersionLocator.Resolver[] values() {
                    net.bytebuddy.ClassFileVersion$VersionLocator$Resolver[] r0 = net.bytebuddy.ClassFileVersion.VersionLocator.Resolver.$VALUES
                    java.lang.Object r0 = r0.clone()
                    net.bytebuddy.ClassFileVersion$VersionLocator$Resolver[] r0 = (net.bytebuddy.ClassFileVersion.VersionLocator.Resolver[]) r0
                    return r0
            }

            @Override // java.security.PrivilegedAction
            @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "Exception should not be rethrown but trigger a fallback.", value = {"REC_CATCH_EXCEPTION"})
            public /* bridge */ /* synthetic */ net.bytebuddy.ClassFileVersion.VersionLocator run() {
                    r1 = this;
                    net.bytebuddy.ClassFileVersion$VersionLocator r0 = r1.run2()
                    return r0
            }

            @Override // java.security.PrivilegedAction
            @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "Exception should not be rethrown but trigger a fallback.", value = {"REC_CATCH_EXCEPTION"})
            /* JADX INFO: renamed from: run, reason: avoid collision after fix types in other method */
            public net.bytebuddy.ClassFileVersion.VersionLocator run2() {
                    r9 = this;
                    java.lang.Class<java.lang.Runtime> r0 = java.lang.Runtime.class
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L47
                    r1.<init>()     // Catch: java.lang.Throwable -> L47
                    java.lang.String r2 = r0.getName()     // Catch: java.lang.Throwable -> L47
                    r1.append(r2)     // Catch: java.lang.Throwable -> L47
                    java.lang.String r2 = "$Version"
                    r1.append(r2)     // Catch: java.lang.Throwable -> L47
                    java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L47
                    java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L47
                    r2 = 0
                    java.lang.String r3 = "feature"
                    java.lang.reflect.Method r1 = r1.getMethod(r3, r2)     // Catch: java.lang.NoSuchMethodException -> L23 java.lang.Throwable -> L47
                    goto L29
                L23:
                    java.lang.String r3 = "major"
                    java.lang.reflect.Method r1 = r1.getMethod(r3, r2)     // Catch: java.lang.Throwable -> L47
                L29:
                    net.bytebuddy.ClassFileVersion$VersionLocator$Resolved r3 = new net.bytebuddy.ClassFileVersion$VersionLocator$Resolved     // Catch: java.lang.Throwable -> L47
                    java.lang.String r4 = "version"
                    java.lang.reflect.Method r0 = r0.getMethod(r4, r2)     // Catch: java.lang.Throwable -> L47
                    java.lang.Object r0 = r0.invoke(r2, r2)     // Catch: java.lang.Throwable -> L47
                    java.lang.Object r0 = r1.invoke(r0, r2)     // Catch: java.lang.Throwable -> L47
                    java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.lang.Throwable -> L47
                    int r0 = r0.intValue()     // Catch: java.lang.Throwable -> L47
                    net.bytebuddy.ClassFileVersion r0 = net.bytebuddy.ClassFileVersion.ofJavaVersion(r0)     // Catch: java.lang.Throwable -> L47
                    r3.<init>(r0)     // Catch: java.lang.Throwable -> L47
                    return r3
                L47:
                    java.lang.String r0 = "java.version"
                    java.lang.String r0 = java.lang.System.getProperty(r0)     // Catch: java.lang.Throwable -> L5f
                    if (r0 == 0) goto Lc2
                    java.lang.String r1 = "0"
                    boolean r1 = r0.equals(r1)     // Catch: java.lang.Throwable -> L5f
                    if (r1 == 0) goto L61
                    net.bytebuddy.ClassFileVersion$VersionLocator$Resolved r0 = new net.bytebuddy.ClassFileVersion$VersionLocator$Resolved     // Catch: java.lang.Throwable -> L5f
                    net.bytebuddy.ClassFileVersion r1 = net.bytebuddy.ClassFileVersion.JAVA_V6     // Catch: java.lang.Throwable -> L5f
                    r0.<init>(r1)     // Catch: java.lang.Throwable -> L5f
                    return r0
                L5f:
                    r0 = move-exception
                    goto Lca
                L61:
                    java.lang.String r1 = "-ea"
                    boolean r1 = r0.endsWith(r1)     // Catch: java.lang.Throwable -> L5f
                    r2 = 3
                    r3 = 0
                    if (r1 == 0) goto L74
                    int r1 = r0.length()     // Catch: java.lang.Throwable -> L5f
                    int r1 = r1 - r2
                    java.lang.String r0 = r0.substring(r3, r1)     // Catch: java.lang.Throwable -> L5f
                L74:
                    int[] r1 = new int[r2]     // Catch: java.lang.Throwable -> L5f
                    r4 = -1
                    r1[r3] = r4     // Catch: java.lang.Throwable -> L5f
                    r5 = 1
                    r1[r5] = r3     // Catch: java.lang.Throwable -> L5f
                    r6 = 2
                    r1[r6] = r3     // Catch: java.lang.Throwable -> L5f
                    r3 = r5
                L80:
                    if (r3 >= r2) goto Lab
                    int r7 = r3 + (-1)
                    r7 = r1[r7]     // Catch: java.lang.Throwable -> L5f
                    int r7 = r7 + r5
                    r8 = 46
                    int r7 = r0.indexOf(r8, r7)     // Catch: java.lang.Throwable -> L5f
                    r1[r3] = r7     // Catch: java.lang.Throwable -> L5f
                    if (r7 == r4) goto L94
                    int r3 = r3 + 1
                    goto L80
                L94:
                    java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L5f
                    java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5f
                    r2.<init>()     // Catch: java.lang.Throwable -> L5f
                    java.lang.String r3 = "This JVM's version string does not seem to be valid: "
                    r2.append(r3)     // Catch: java.lang.Throwable -> L5f
                    r2.append(r0)     // Catch: java.lang.Throwable -> L5f
                    java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L5f
                    r1.<init>(r0)     // Catch: java.lang.Throwable -> L5f
                    throw r1     // Catch: java.lang.Throwable -> L5f
                Lab:
                    net.bytebuddy.ClassFileVersion$VersionLocator$Resolved r2 = new net.bytebuddy.ClassFileVersion$VersionLocator$Resolved     // Catch: java.lang.Throwable -> L5f
                    r3 = r1[r5]     // Catch: java.lang.Throwable -> L5f
                    int r3 = r3 + r5
                    r1 = r1[r6]     // Catch: java.lang.Throwable -> L5f
                    java.lang.String r0 = r0.substring(r3, r1)     // Catch: java.lang.Throwable -> L5f
                    int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Throwable -> L5f
                    net.bytebuddy.ClassFileVersion r0 = net.bytebuddy.ClassFileVersion.ofJavaVersion(r0)     // Catch: java.lang.Throwable -> L5f
                    r2.<init>(r0)     // Catch: java.lang.Throwable -> L5f
                    return r2
                Lc2:
                    java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L5f
                    java.lang.String r1 = "Java version property is not set"
                    r0.<init>(r1)     // Catch: java.lang.Throwable -> L5f
                    throw r0     // Catch: java.lang.Throwable -> L5f
                Lca:
                    net.bytebuddy.ClassFileVersion$VersionLocator$Unresolved r1 = new net.bytebuddy.ClassFileVersion$VersionLocator$Unresolved
                    java.lang.String r0 = r0.getMessage()
                    r1.<init>(r0)
                    return r1
            }
        }

        @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
        public static class Unresolved implements net.bytebuddy.ClassFileVersion.VersionLocator {
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
                    net.bytebuddy.ClassFileVersion$VersionLocator$Unresolved r5 = (net.bytebuddy.ClassFileVersion.VersionLocator.Unresolved) r5
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

            @Override // net.bytebuddy.ClassFileVersion.VersionLocator
            public net.bytebuddy.ClassFileVersion resolve() {
                    r3 = this;
                    java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    java.lang.String r2 = "Failed to resolve the class file version of the current VM: "
                    r1.append(r2)
                    java.lang.String r2 = r3.message
                    r1.append(r2)
                    java.lang.String r1 = r1.toString()
                    r0.<init>(r1)
                    throw r0
            }
        }

        net.bytebuddy.ClassFileVersion resolve();
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
            net.bytebuddy.ClassFileVersion.ACCESS_CONTROLLER = r1     // Catch: java.lang.SecurityException -> L16 java.lang.ClassNotFoundException -> L17
            goto L19
        L16:
            r0 = 1
        L17:
            net.bytebuddy.ClassFileVersion.ACCESS_CONTROLLER = r0
        L19:
            net.bytebuddy.ClassFileVersion r0 = new net.bytebuddy.ClassFileVersion
            r1 = 196653(0x3002d, float:2.7557E-40)
            r0.<init>(r1)
            net.bytebuddy.ClassFileVersion.JAVA_V1 = r0
            net.bytebuddy.ClassFileVersion r0 = new net.bytebuddy.ClassFileVersion
            r1 = 46
            r0.<init>(r1)
            net.bytebuddy.ClassFileVersion.JAVA_V2 = r0
            net.bytebuddy.ClassFileVersion r0 = new net.bytebuddy.ClassFileVersion
            r1 = 47
            r0.<init>(r1)
            net.bytebuddy.ClassFileVersion.JAVA_V3 = r0
            net.bytebuddy.ClassFileVersion r0 = new net.bytebuddy.ClassFileVersion
            r1 = 48
            r0.<init>(r1)
            net.bytebuddy.ClassFileVersion.JAVA_V4 = r0
            net.bytebuddy.ClassFileVersion r0 = new net.bytebuddy.ClassFileVersion
            r1 = 49
            r0.<init>(r1)
            net.bytebuddy.ClassFileVersion.JAVA_V5 = r0
            net.bytebuddy.ClassFileVersion r0 = new net.bytebuddy.ClassFileVersion
            r1 = 50
            r0.<init>(r1)
            net.bytebuddy.ClassFileVersion.JAVA_V6 = r0
            net.bytebuddy.ClassFileVersion r0 = new net.bytebuddy.ClassFileVersion
            r1 = 51
            r0.<init>(r1)
            net.bytebuddy.ClassFileVersion.JAVA_V7 = r0
            net.bytebuddy.ClassFileVersion r0 = new net.bytebuddy.ClassFileVersion
            r1 = 52
            r0.<init>(r1)
            net.bytebuddy.ClassFileVersion.JAVA_V8 = r0
            net.bytebuddy.ClassFileVersion r0 = new net.bytebuddy.ClassFileVersion
            r1 = 53
            r0.<init>(r1)
            net.bytebuddy.ClassFileVersion.JAVA_V9 = r0
            net.bytebuddy.ClassFileVersion r0 = new net.bytebuddy.ClassFileVersion
            r1 = 54
            r0.<init>(r1)
            net.bytebuddy.ClassFileVersion.JAVA_V10 = r0
            net.bytebuddy.ClassFileVersion r0 = new net.bytebuddy.ClassFileVersion
            r1 = 55
            r0.<init>(r1)
            net.bytebuddy.ClassFileVersion.JAVA_V11 = r0
            net.bytebuddy.ClassFileVersion r0 = new net.bytebuddy.ClassFileVersion
            r1 = 56
            r0.<init>(r1)
            net.bytebuddy.ClassFileVersion.JAVA_V12 = r0
            net.bytebuddy.ClassFileVersion r0 = new net.bytebuddy.ClassFileVersion
            r1 = 57
            r0.<init>(r1)
            net.bytebuddy.ClassFileVersion.JAVA_V13 = r0
            net.bytebuddy.ClassFileVersion r0 = new net.bytebuddy.ClassFileVersion
            r1 = 58
            r0.<init>(r1)
            net.bytebuddy.ClassFileVersion.JAVA_V14 = r0
            net.bytebuddy.ClassFileVersion r0 = new net.bytebuddy.ClassFileVersion
            r1 = 59
            r0.<init>(r1)
            net.bytebuddy.ClassFileVersion.JAVA_V15 = r0
            net.bytebuddy.ClassFileVersion r0 = new net.bytebuddy.ClassFileVersion
            r1 = 60
            r0.<init>(r1)
            net.bytebuddy.ClassFileVersion.JAVA_V16 = r0
            net.bytebuddy.ClassFileVersion r0 = new net.bytebuddy.ClassFileVersion
            r1 = 61
            r0.<init>(r1)
            net.bytebuddy.ClassFileVersion.JAVA_V17 = r0
            net.bytebuddy.ClassFileVersion r0 = new net.bytebuddy.ClassFileVersion
            r1 = 62
            r0.<init>(r1)
            net.bytebuddy.ClassFileVersion.JAVA_V18 = r0
            net.bytebuddy.ClassFileVersion r0 = new net.bytebuddy.ClassFileVersion
            r1 = 63
            r0.<init>(r1)
            net.bytebuddy.ClassFileVersion.JAVA_V19 = r0
            net.bytebuddy.ClassFileVersion r0 = new net.bytebuddy.ClassFileVersion
            r1 = 64
            r0.<init>(r1)
            net.bytebuddy.ClassFileVersion.JAVA_V20 = r0
            net.bytebuddy.ClassFileVersion r0 = new net.bytebuddy.ClassFileVersion
            r1 = 65
            r0.<init>(r1)
            net.bytebuddy.ClassFileVersion.JAVA_V21 = r0
            net.bytebuddy.ClassFileVersion r0 = new net.bytebuddy.ClassFileVersion
            r1 = 66
            r0.<init>(r1)
            net.bytebuddy.ClassFileVersion.JAVA_V22 = r0
            net.bytebuddy.ClassFileVersion$VersionLocator$Resolver r0 = net.bytebuddy.ClassFileVersion.VersionLocator.Resolver.INSTANCE
            java.lang.Object r0 = doPrivileged(r0)
            net.bytebuddy.ClassFileVersion$VersionLocator r0 = (net.bytebuddy.ClassFileVersion.VersionLocator) r0
            net.bytebuddy.ClassFileVersion.VERSION_LOCATOR = r0
            return
    }

    public ClassFileVersion(int r1) {
            r0 = this;
            r0.<init>()
            r0.versionNumber = r1
            return
    }

    @net.bytebuddy.build.AccessControllerPlugin.Enhance
    private static <T> T doPrivileged(java.security.PrivilegedAction<T> r1) {
            boolean r0 = net.bytebuddy.ClassFileVersion.ACCESS_CONTROLLER
            if (r0 == 0) goto L9
            java.lang.Object r1 = java.security.AccessController.doPrivileged(r1)
            return r1
        L9:
            java.lang.Object r1 = r1.run()
            return r1
    }

    public static net.bytebuddy.ClassFileVersion latest() {
            net.bytebuddy.ClassFileVersion r0 = net.bytebuddy.ClassFileVersion.JAVA_V22
            return r0
    }

    public static net.bytebuddy.ClassFileVersion of(java.lang.Class<?> r1) throws java.io.IOException {
            java.lang.ClassLoader r0 = r1.getClassLoader()
            net.bytebuddy.dynamic.ClassFileLocator r0 = net.bytebuddy.dynamic.ClassFileLocator.ForClassLoader.of(r0)
            net.bytebuddy.ClassFileVersion r1 = of(r1, r0)
            return r1
    }

    public static net.bytebuddy.ClassFileVersion of(java.lang.Class<?> r0, net.bytebuddy.dynamic.ClassFileLocator r1) throws java.io.IOException {
            net.bytebuddy.description.type.TypeDescription r0 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r0)
            net.bytebuddy.ClassFileVersion r0 = of(r0, r1)
            return r0
    }

    public static net.bytebuddy.ClassFileVersion of(net.bytebuddy.description.type.TypeDescription r0, net.bytebuddy.dynamic.ClassFileLocator r1) throws java.io.IOException {
            java.lang.String r0 = r0.getName()
            net.bytebuddy.dynamic.ClassFileLocator$Resolution r0 = r1.locate(r0)
            byte[] r0 = r0.resolve()
            net.bytebuddy.ClassFileVersion r0 = ofClassFile(r0)
            return r0
    }

    public static net.bytebuddy.ClassFileVersion ofClassFile(byte[] r3) {
            int r0 = r3.length
            r1 = 7
            if (r0 < r1) goto L1d
            r0 = 4
            r0 = r3[r0]
            int r0 = r0 << 24
            r2 = 5
            r2 = r3[r2]
            int r2 = r2 << 16
            r0 = r0 | r2
            r2 = 6
            r2 = r3[r2]
            int r2 = r2 << 8
            r0 = r0 | r2
            r3 = r3[r1]
            r3 = r3 | r0
            net.bytebuddy.ClassFileVersion r3 = ofMinorMajor(r3)
            return r3
        L1d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Supplied byte array is too short to be a class file with "
            r1.append(r2)
            int r3 = r3.length
            r1.append(r3)
            java.lang.String r3 = " byte"
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    public static net.bytebuddy.ClassFileVersion ofJavaVersion(int r3) {
            switch(r3) {
                case 1: goto L67;
                case 2: goto L64;
                case 3: goto L61;
                case 4: goto L5e;
                case 5: goto L5b;
                case 6: goto L58;
                case 7: goto L55;
                case 8: goto L52;
                case 9: goto L4f;
                case 10: goto L4c;
                case 11: goto L49;
                case 12: goto L46;
                case 13: goto L43;
                case 14: goto L40;
                case 15: goto L3d;
                case 16: goto L3a;
                case 17: goto L37;
                case 18: goto L34;
                case 19: goto L31;
                case 20: goto L2e;
                case 21: goto L2b;
                case 22: goto L28;
                default: goto L3;
            }
        L3:
            boolean r0 = net.bytebuddy.utility.OpenedClassReader.EXPERIMENTAL
            if (r0 == 0) goto L11
            if (r3 <= 0) goto L11
            net.bytebuddy.ClassFileVersion r0 = new net.bytebuddy.ClassFileVersion
            int r3 = r3 + 44
            r0.<init>(r3)
            return r0
        L11:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unknown Java version: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
        L28:
            net.bytebuddy.ClassFileVersion r3 = net.bytebuddy.ClassFileVersion.JAVA_V22
            return r3
        L2b:
            net.bytebuddy.ClassFileVersion r3 = net.bytebuddy.ClassFileVersion.JAVA_V21
            return r3
        L2e:
            net.bytebuddy.ClassFileVersion r3 = net.bytebuddy.ClassFileVersion.JAVA_V20
            return r3
        L31:
            net.bytebuddy.ClassFileVersion r3 = net.bytebuddy.ClassFileVersion.JAVA_V19
            return r3
        L34:
            net.bytebuddy.ClassFileVersion r3 = net.bytebuddy.ClassFileVersion.JAVA_V18
            return r3
        L37:
            net.bytebuddy.ClassFileVersion r3 = net.bytebuddy.ClassFileVersion.JAVA_V17
            return r3
        L3a:
            net.bytebuddy.ClassFileVersion r3 = net.bytebuddy.ClassFileVersion.JAVA_V16
            return r3
        L3d:
            net.bytebuddy.ClassFileVersion r3 = net.bytebuddy.ClassFileVersion.JAVA_V15
            return r3
        L40:
            net.bytebuddy.ClassFileVersion r3 = net.bytebuddy.ClassFileVersion.JAVA_V14
            return r3
        L43:
            net.bytebuddy.ClassFileVersion r3 = net.bytebuddy.ClassFileVersion.JAVA_V13
            return r3
        L46:
            net.bytebuddy.ClassFileVersion r3 = net.bytebuddy.ClassFileVersion.JAVA_V12
            return r3
        L49:
            net.bytebuddy.ClassFileVersion r3 = net.bytebuddy.ClassFileVersion.JAVA_V11
            return r3
        L4c:
            net.bytebuddy.ClassFileVersion r3 = net.bytebuddy.ClassFileVersion.JAVA_V10
            return r3
        L4f:
            net.bytebuddy.ClassFileVersion r3 = net.bytebuddy.ClassFileVersion.JAVA_V9
            return r3
        L52:
            net.bytebuddy.ClassFileVersion r3 = net.bytebuddy.ClassFileVersion.JAVA_V8
            return r3
        L55:
            net.bytebuddy.ClassFileVersion r3 = net.bytebuddy.ClassFileVersion.JAVA_V7
            return r3
        L58:
            net.bytebuddy.ClassFileVersion r3 = net.bytebuddy.ClassFileVersion.JAVA_V6
            return r3
        L5b:
            net.bytebuddy.ClassFileVersion r3 = net.bytebuddy.ClassFileVersion.JAVA_V5
            return r3
        L5e:
            net.bytebuddy.ClassFileVersion r3 = net.bytebuddy.ClassFileVersion.JAVA_V4
            return r3
        L61:
            net.bytebuddy.ClassFileVersion r3 = net.bytebuddy.ClassFileVersion.JAVA_V3
            return r3
        L64:
            net.bytebuddy.ClassFileVersion r3 = net.bytebuddy.ClassFileVersion.JAVA_V2
            return r3
        L67:
            net.bytebuddy.ClassFileVersion r3 = net.bytebuddy.ClassFileVersion.JAVA_V1
            return r3
    }

    public static net.bytebuddy.ClassFileVersion ofJavaVersionString(java.lang.String r3) {
            java.lang.String r0 = "1.1"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto Lb
            net.bytebuddy.ClassFileVersion r3 = net.bytebuddy.ClassFileVersion.JAVA_V1
            return r3
        Lb:
            java.lang.String r0 = "1.2"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L16
            net.bytebuddy.ClassFileVersion r3 = net.bytebuddy.ClassFileVersion.JAVA_V2
            return r3
        L16:
            java.lang.String r0 = "1.3"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L21
            net.bytebuddy.ClassFileVersion r3 = net.bytebuddy.ClassFileVersion.JAVA_V3
            return r3
        L21:
            java.lang.String r0 = "1.4"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L2c
            net.bytebuddy.ClassFileVersion r3 = net.bytebuddy.ClassFileVersion.JAVA_V4
            return r3
        L2c:
            java.lang.String r0 = "1.5"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L1d8
            java.lang.String r0 = "5"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L3e
            goto L1d8
        L3e:
            java.lang.String r0 = "1.6"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L1d5
            java.lang.String r0 = "6"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L50
            goto L1d5
        L50:
            java.lang.String r0 = "1.7"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L1d2
            java.lang.String r0 = "7"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L62
            goto L1d2
        L62:
            java.lang.String r0 = "1.8"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L1cf
            java.lang.String r0 = "8"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L74
            goto L1cf
        L74:
            java.lang.String r0 = "1.9"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L1cc
            java.lang.String r0 = "9"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L86
            goto L1cc
        L86:
            java.lang.String r0 = "1.10"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L1c9
            java.lang.String r0 = "10"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L98
            goto L1c9
        L98:
            java.lang.String r0 = "1.11"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L1c6
            java.lang.String r0 = "11"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto Laa
            goto L1c6
        Laa:
            java.lang.String r0 = "1.12"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L1c3
            java.lang.String r0 = "12"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto Lbc
            goto L1c3
        Lbc:
            java.lang.String r0 = "1.13"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L1c0
            java.lang.String r0 = "13"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto Lce
            goto L1c0
        Lce:
            java.lang.String r0 = "1.14"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L1bd
            java.lang.String r0 = "14"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto Le0
            goto L1bd
        Le0:
            java.lang.String r0 = "1.15"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L1ba
            java.lang.String r0 = "15"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto Lf2
            goto L1ba
        Lf2:
            java.lang.String r0 = "1.16"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L1b7
            java.lang.String r0 = "16"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L104
            goto L1b7
        L104:
            java.lang.String r0 = "1.17"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L1b4
            java.lang.String r0 = "17"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L116
            goto L1b4
        L116:
            java.lang.String r0 = "1.18"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L1b1
            java.lang.String r0 = "18"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L128
            goto L1b1
        L128:
            java.lang.String r0 = "1.19"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L1ae
            java.lang.String r0 = "19"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L13a
            goto L1ae
        L13a:
            java.lang.String r0 = "1.20"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L1ab
            java.lang.String r0 = "20"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L14b
            goto L1ab
        L14b:
            java.lang.String r0 = "1.21"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L1a8
            java.lang.String r0 = "21"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L15c
            goto L1a8
        L15c:
            java.lang.String r0 = "1.22"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L1a5
            java.lang.String r0 = "22"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L16d
            goto L1a5
        L16d:
            boolean r0 = net.bytebuddy.utility.OpenedClassReader.EXPERIMENTAL
            if (r0 == 0) goto L18e
            java.lang.String r0 = "1."
            boolean r0 = r3.startsWith(r0)     // Catch: java.lang.NumberFormatException -> L18e
            if (r0 == 0) goto L17f
            r0 = 2
            java.lang.String r0 = r3.substring(r0)     // Catch: java.lang.NumberFormatException -> L18e
            goto L180
        L17f:
            r0 = r3
        L180:
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.NumberFormatException -> L18e
            if (r0 <= 0) goto L18e
            net.bytebuddy.ClassFileVersion r1 = new net.bytebuddy.ClassFileVersion     // Catch: java.lang.NumberFormatException -> L18e
            int r0 = r0 + 44
            r1.<init>(r0)     // Catch: java.lang.NumberFormatException -> L18e
            return r1
        L18e:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unknown Java version string: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
        L1a5:
            net.bytebuddy.ClassFileVersion r3 = net.bytebuddy.ClassFileVersion.JAVA_V22
            return r3
        L1a8:
            net.bytebuddy.ClassFileVersion r3 = net.bytebuddy.ClassFileVersion.JAVA_V21
            return r3
        L1ab:
            net.bytebuddy.ClassFileVersion r3 = net.bytebuddy.ClassFileVersion.JAVA_V20
            return r3
        L1ae:
            net.bytebuddy.ClassFileVersion r3 = net.bytebuddy.ClassFileVersion.JAVA_V19
            return r3
        L1b1:
            net.bytebuddy.ClassFileVersion r3 = net.bytebuddy.ClassFileVersion.JAVA_V18
            return r3
        L1b4:
            net.bytebuddy.ClassFileVersion r3 = net.bytebuddy.ClassFileVersion.JAVA_V17
            return r3
        L1b7:
            net.bytebuddy.ClassFileVersion r3 = net.bytebuddy.ClassFileVersion.JAVA_V16
            return r3
        L1ba:
            net.bytebuddy.ClassFileVersion r3 = net.bytebuddy.ClassFileVersion.JAVA_V15
            return r3
        L1bd:
            net.bytebuddy.ClassFileVersion r3 = net.bytebuddy.ClassFileVersion.JAVA_V14
            return r3
        L1c0:
            net.bytebuddy.ClassFileVersion r3 = net.bytebuddy.ClassFileVersion.JAVA_V13
            return r3
        L1c3:
            net.bytebuddy.ClassFileVersion r3 = net.bytebuddy.ClassFileVersion.JAVA_V12
            return r3
        L1c6:
            net.bytebuddy.ClassFileVersion r3 = net.bytebuddy.ClassFileVersion.JAVA_V11
            return r3
        L1c9:
            net.bytebuddy.ClassFileVersion r3 = net.bytebuddy.ClassFileVersion.JAVA_V10
            return r3
        L1cc:
            net.bytebuddy.ClassFileVersion r3 = net.bytebuddy.ClassFileVersion.JAVA_V9
            return r3
        L1cf:
            net.bytebuddy.ClassFileVersion r3 = net.bytebuddy.ClassFileVersion.JAVA_V8
            return r3
        L1d2:
            net.bytebuddy.ClassFileVersion r3 = net.bytebuddy.ClassFileVersion.JAVA_V7
            return r3
        L1d5:
            net.bytebuddy.ClassFileVersion r3 = net.bytebuddy.ClassFileVersion.JAVA_V6
            return r3
        L1d8:
            net.bytebuddy.ClassFileVersion r3 = net.bytebuddy.ClassFileVersion.JAVA_V5
            return r3
    }

    public static net.bytebuddy.ClassFileVersion ofMinorMajor(int r3) {
            net.bytebuddy.ClassFileVersion r0 = new net.bytebuddy.ClassFileVersion
            r0.<init>(r3)
            short r1 = r0.getMajorVersion()
            if (r1 <= 0) goto L30
            short r1 = r0.getMajorVersion()
            r2 = 44
            if (r1 <= r2) goto L14
            goto L30
        L14:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Class version "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = " is not valid"
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
        L30:
            return r0
    }

    public static net.bytebuddy.ClassFileVersion ofThisVm() {
            net.bytebuddy.ClassFileVersion$VersionLocator r0 = net.bytebuddy.ClassFileVersion.VERSION_LOCATOR
            net.bytebuddy.ClassFileVersion r0 = r0.resolve()
            return r0
    }

    @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "Exception should not be rethrown but trigger a fallback.", value = {"REC_CATCH_EXCEPTION"})
    public static net.bytebuddy.ClassFileVersion ofThisVm(net.bytebuddy.ClassFileVersion r0) {
            net.bytebuddy.ClassFileVersion r0 = ofThisVm()     // Catch: java.lang.Exception -> L4
        L4:
            return r0
    }

    public net.bytebuddy.ClassFileVersion asPreviewVersion() {
            r3 = this;
            net.bytebuddy.ClassFileVersion r0 = new net.bytebuddy.ClassFileVersion
            int r1 = r3.versionNumber
            r2 = -65536(0xffffffffffff0000, float:NaN)
            r1 = r1 | r2
            r0.<init>(r1)
            return r0
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(net.bytebuddy.ClassFileVersion r1) {
            r0 = this;
            net.bytebuddy.ClassFileVersion r1 = (net.bytebuddy.ClassFileVersion) r1
            int r1 = r0.compareTo2(r1)
            return r1
    }

    /* JADX INFO: renamed from: compareTo, reason: avoid collision after fix types in other method */
    public int compareTo2(net.bytebuddy.ClassFileVersion r3) {
            r2 = this;
            short r0 = r2.getMajorVersion()
            short r1 = r3.getMajorVersion()
            if (r0 != r1) goto L14
            short r0 = r2.getMinorVersion()
            short r3 = r3.getMinorVersion()
        L12:
            int r0 = r0 - r3
            goto L1d
        L14:
            short r0 = r2.getMajorVersion()
            short r3 = r3.getMajorVersion()
            goto L12
        L1d:
            int r3 = java.lang.Integer.signum(r0)
            return r3
    }

    public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L1d
            java.lang.Class r2 = r4.getClass()
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L12
            goto L1d
        L12:
            int r2 = r4.versionNumber
            net.bytebuddy.ClassFileVersion r5 = (net.bytebuddy.ClassFileVersion) r5
            int r5 = r5.versionNumber
            if (r2 != r5) goto L1b
            goto L1c
        L1b:
            r0 = r1
        L1c:
            return r0
        L1d:
            return r1
    }

    public int getJavaVersion() {
            r1 = this;
            short r0 = r1.getMajorVersion()
            int r0 = r0 + (-44)
            return r0
    }

    public short getMajorVersion() {
            r2 = this;
            int r0 = r2.versionNumber
            r1 = 65535(0xffff, float:9.1834E-41)
            r0 = r0 & r1
            short r0 = (short) r0
            return r0
    }

    public int getMinorMajorVersion() {
            r1 = this;
            int r0 = r1.versionNumber
            return r0
    }

    public short getMinorVersion() {
            r1 = this;
            int r0 = r1.versionNumber
            int r0 = r0 >>> 16
            short r0 = (short) r0
            return r0
    }

    public int hashCode() {
            r1 = this;
            int r0 = r1.versionNumber
            return r0
    }

    public boolean isAtLeast(net.bytebuddy.ClassFileVersion r2) {
            r1 = this;
            int r2 = r1.compareTo2(r2)
            r0 = -1
            if (r2 <= r0) goto L9
            r2 = 1
            goto La
        L9:
            r2 = 0
        La:
            return r2
    }

    public boolean isAtMost(net.bytebuddy.ClassFileVersion r2) {
            r1 = this;
            int r2 = r1.compareTo2(r2)
            r0 = 1
            if (r2 >= r0) goto L8
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    public boolean isGreaterThan(net.bytebuddy.ClassFileVersion r1) {
            r0 = this;
            int r1 = r0.compareTo2(r1)
            if (r1 <= 0) goto L8
            r1 = 1
            goto L9
        L8:
            r1 = 0
        L9:
            return r1
    }

    public boolean isLessThan(net.bytebuddy.ClassFileVersion r1) {
            r0 = this;
            int r1 = r0.compareTo2(r1)
            if (r1 >= 0) goto L8
            r1 = 1
            goto L9
        L8:
            r1 = 0
        L9:
            return r1
    }

    public boolean isPreviewVersion() {
            r2 = this;
            int r0 = r2.versionNumber
            r1 = -65536(0xffffffffffff0000, float:NaN)
            r0 = r0 & r1
            if (r0 != r1) goto L9
            r0 = 1
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Java "
            r0.append(r1)
            int r1 = r2.getJavaVersion()
            r0.append(r1)
            java.lang.String r1 = " ("
            r0.append(r1)
            int r1 = r2.getMinorMajorVersion()
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
