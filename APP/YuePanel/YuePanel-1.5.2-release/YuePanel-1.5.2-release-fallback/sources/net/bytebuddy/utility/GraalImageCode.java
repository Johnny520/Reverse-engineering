package net.bytebuddy.utility;

/* JADX INFO: loaded from: classes2.dex */
public enum GraalImageCode extends java.lang.Enum<net.bytebuddy.utility.GraalImageCode> {
    private static final /* synthetic */ net.bytebuddy.utility.GraalImageCode[] $VALUES = null;
    private static final boolean ACCESS_CONTROLLER = false;
    public static final net.bytebuddy.utility.GraalImageCode AGENT = null;
    public static final net.bytebuddy.utility.GraalImageCode BUILD = null;
    public static final net.bytebuddy.utility.GraalImageCode NONE = null;
    public static final net.bytebuddy.utility.GraalImageCode RUNTIME = null;
    public static final net.bytebuddy.utility.GraalImageCode UNKNOWN = null;

    @net.bytebuddy.utility.nullability.MaybeNull
    private static net.bytebuddy.utility.GraalImageCode current;
    private final boolean defined;
    private final boolean nativeImageExecution;

    public enum ImageCodeContextAction extends java.lang.Enum<net.bytebuddy.utility.GraalImageCode.ImageCodeContextAction> implements java.security.PrivilegedAction<net.bytebuddy.utility.GraalImageCode> {
        private static final /* synthetic */ net.bytebuddy.utility.GraalImageCode.ImageCodeContextAction[] $VALUES = null;
        public static final net.bytebuddy.utility.GraalImageCode.ImageCodeContextAction INSTANCE = null;

        static {
                net.bytebuddy.utility.GraalImageCode$ImageCodeContextAction r0 = new net.bytebuddy.utility.GraalImageCode$ImageCodeContextAction
                java.lang.String r1 = "INSTANCE"
                r2 = 0
                r0.<init>(r1, r2)
                net.bytebuddy.utility.GraalImageCode.ImageCodeContextAction.INSTANCE = r0
                net.bytebuddy.utility.GraalImageCode$ImageCodeContextAction[] r0 = new net.bytebuddy.utility.GraalImageCode.ImageCodeContextAction[]{r0}
                net.bytebuddy.utility.GraalImageCode.ImageCodeContextAction.$VALUES = r0
                return
        }

        ImageCodeContextAction(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static net.bytebuddy.utility.GraalImageCode.ImageCodeContextAction valueOf(java.lang.String r1) {
                java.lang.Class<net.bytebuddy.utility.GraalImageCode$ImageCodeContextAction> r0 = net.bytebuddy.utility.GraalImageCode.ImageCodeContextAction.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                net.bytebuddy.utility.GraalImageCode$ImageCodeContextAction r1 = (net.bytebuddy.utility.GraalImageCode.ImageCodeContextAction) r1
                return r1
        }

        public static net.bytebuddy.utility.GraalImageCode.ImageCodeContextAction[] values() {
                net.bytebuddy.utility.GraalImageCode$ImageCodeContextAction[] r0 = net.bytebuddy.utility.GraalImageCode.ImageCodeContextAction.$VALUES
                java.lang.Object r0 = r0.clone()
                net.bytebuddy.utility.GraalImageCode$ImageCodeContextAction[] r0 = (net.bytebuddy.utility.GraalImageCode.ImageCodeContextAction[]) r0
                return r0
        }

        @Override // java.security.PrivilegedAction
        public /* bridge */ /* synthetic */ net.bytebuddy.utility.GraalImageCode run() {
                r1 = this;
                net.bytebuddy.utility.GraalImageCode r0 = r1.run2()
                return r0
        }

        @Override // java.security.PrivilegedAction
        /* JADX INFO: renamed from: run, reason: avoid collision after fix types in other method */
        public net.bytebuddy.utility.GraalImageCode run2() {
                r4 = this;
                java.lang.String r0 = "java.lang.management.ManagementFactory"
                java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L3c
                java.lang.String r1 = "getRuntimeMXBean"
                r2 = 0
                java.lang.reflect.Method r0 = r0.getMethod(r1, r2)     // Catch: java.lang.Throwable -> L3c
                java.lang.Class r1 = r0.getReturnType()     // Catch: java.lang.Throwable -> L3c
                java.lang.String r3 = "getInputArguments"
                java.lang.reflect.Method r1 = r1.getMethod(r3, r2)     // Catch: java.lang.Throwable -> L3c
                java.lang.Object r0 = r0.invoke(r2, r2)     // Catch: java.lang.Throwable -> L3c
                java.lang.Object r0 = r1.invoke(r0, r2)     // Catch: java.lang.Throwable -> L3c
                java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Throwable -> L3c
                java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L3c
            L25:
                boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L3c
                if (r1 == 0) goto L3c
                java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L3c
                java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L3c
                java.lang.String r2 = "-agentlib:native-image-agent"
                boolean r1 = r1.startsWith(r2)     // Catch: java.lang.Throwable -> L3c
                if (r1 == 0) goto L25
                net.bytebuddy.utility.GraalImageCode r0 = net.bytebuddy.utility.GraalImageCode.AGENT     // Catch: java.lang.Throwable -> L3c
                return r0
            L3c:
                net.bytebuddy.utility.GraalImageCode r0 = net.bytebuddy.utility.GraalImageCode.NONE
                return r0
        }
    }

    static {
            r0 = 1
            r1 = 0
            java.lang.String r2 = "java.security.AccessController"
            r3 = 0
            java.lang.Class.forName(r2, r1, r3)     // Catch: java.lang.SecurityException -> L17 java.lang.ClassNotFoundException -> L1a
            java.lang.String r2 = "net.bytebuddy.securitymanager"
            java.lang.String r3 = "true"
            java.lang.String r2 = java.lang.System.getProperty(r2, r3)     // Catch: java.lang.SecurityException -> L17 java.lang.ClassNotFoundException -> L1a
            boolean r2 = java.lang.Boolean.parseBoolean(r2)     // Catch: java.lang.SecurityException -> L17 java.lang.ClassNotFoundException -> L1a
            net.bytebuddy.utility.GraalImageCode.ACCESS_CONTROLLER = r2     // Catch: java.lang.SecurityException -> L17 java.lang.ClassNotFoundException -> L1a
            goto L1c
        L17:
            net.bytebuddy.utility.GraalImageCode.ACCESS_CONTROLLER = r0
            goto L1c
        L1a:
            net.bytebuddy.utility.GraalImageCode.ACCESS_CONTROLLER = r1
        L1c:
            net.bytebuddy.utility.GraalImageCode r2 = new net.bytebuddy.utility.GraalImageCode
            java.lang.String r3 = "AGENT"
            r2.<init>(r3, r1, r0, r1)
            net.bytebuddy.utility.GraalImageCode.AGENT = r2
            net.bytebuddy.utility.GraalImageCode r3 = new net.bytebuddy.utility.GraalImageCode
            java.lang.String r4 = "BUILD"
            r3.<init>(r4, r0, r0, r1)
            net.bytebuddy.utility.GraalImageCode.BUILD = r3
            net.bytebuddy.utility.GraalImageCode r4 = new net.bytebuddy.utility.GraalImageCode
            java.lang.String r5 = "RUNTIME"
            r6 = 2
            r4.<init>(r5, r6, r0, r0)
            net.bytebuddy.utility.GraalImageCode.RUNTIME = r4
            net.bytebuddy.utility.GraalImageCode r0 = new net.bytebuddy.utility.GraalImageCode
            java.lang.String r5 = "UNKNOWN"
            r6 = 3
            r0.<init>(r5, r6, r1, r1)
            net.bytebuddy.utility.GraalImageCode.UNKNOWN = r0
            net.bytebuddy.utility.GraalImageCode r5 = new net.bytebuddy.utility.GraalImageCode
            java.lang.String r6 = "NONE"
            r7 = 4
            r5.<init>(r6, r7, r1, r1)
            net.bytebuddy.utility.GraalImageCode.NONE = r5
            net.bytebuddy.utility.GraalImageCode[] r0 = new net.bytebuddy.utility.GraalImageCode[]{r2, r3, r4, r0, r5}
            net.bytebuddy.utility.GraalImageCode.$VALUES = r0
            return
    }

    GraalImageCode(java.lang.String r1, int r2, boolean r3, boolean r4) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.defined = r3
            r0.nativeImageExecution = r4
            return
    }

    @net.bytebuddy.utility.nullability.MaybeNull
    @net.bytebuddy.build.AccessControllerPlugin.Enhance
    private static <T> T doPrivileged(java.security.PrivilegedAction<T> r1) {
            boolean r0 = net.bytebuddy.utility.GraalImageCode.ACCESS_CONTROLLER
            if (r0 == 0) goto L9
            java.lang.Object r1 = java.security.AccessController.doPrivileged(r1)
            return r1
        L9:
            java.lang.Object r1 = r1.run()
            return r1
    }

    @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "This behaviour is intended to avoid early binding in native images.", value = {"LI_LAZY_INIT_STATIC", "NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE"})
    public static net.bytebuddy.utility.GraalImageCode getCurrent() {
            net.bytebuddy.utility.GraalImageCode r0 = net.bytebuddy.utility.GraalImageCode.current
            if (r0 != 0) goto L61
            net.bytebuddy.utility.privilege.GetSystemPropertyAction r0 = new net.bytebuddy.utility.privilege.GetSystemPropertyAction
            java.lang.String r1 = "org.graalvm.nativeimage.imagecode"
            r0.<init>(r1)
            java.lang.Object r0 = doPrivileged(r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L3c
            net.bytebuddy.utility.privilege.GetSystemPropertyAction r0 = new net.bytebuddy.utility.privilege.GetSystemPropertyAction
            java.lang.String r1 = "java.vm.vendor"
            r0.<init>(r1)
            java.lang.Object r0 = doPrivileged(r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L39
            java.util.Locale r1 = java.util.Locale.US
            java.lang.String r0 = r0.toLowerCase(r1)
            java.lang.String r1 = "graalvm"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L39
            net.bytebuddy.utility.GraalImageCode$ImageCodeContextAction r0 = net.bytebuddy.utility.GraalImageCode.ImageCodeContextAction.INSTANCE
            java.lang.Object r0 = doPrivileged(r0)
            net.bytebuddy.utility.GraalImageCode r0 = (net.bytebuddy.utility.GraalImageCode) r0
            goto L5f
        L39:
            net.bytebuddy.utility.GraalImageCode r0 = net.bytebuddy.utility.GraalImageCode.NONE
            goto L5f
        L3c:
            java.lang.String r1 = "agent"
            boolean r1 = r0.equalsIgnoreCase(r1)
            if (r1 == 0) goto L47
            net.bytebuddy.utility.GraalImageCode r0 = net.bytebuddy.utility.GraalImageCode.AGENT
            goto L5f
        L47:
            java.lang.String r1 = "runtime"
            boolean r1 = r0.equalsIgnoreCase(r1)
            if (r1 == 0) goto L52
            net.bytebuddy.utility.GraalImageCode r0 = net.bytebuddy.utility.GraalImageCode.RUNTIME
            goto L5f
        L52:
            java.lang.String r1 = "buildtime"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L5d
            net.bytebuddy.utility.GraalImageCode r0 = net.bytebuddy.utility.GraalImageCode.BUILD
            goto L5f
        L5d:
            net.bytebuddy.utility.GraalImageCode r0 = net.bytebuddy.utility.GraalImageCode.UNKNOWN
        L5f:
            net.bytebuddy.utility.GraalImageCode.current = r0
        L61:
            return r0
    }

    public static net.bytebuddy.utility.GraalImageCode valueOf(java.lang.String r1) {
            java.lang.Class<net.bytebuddy.utility.GraalImageCode> r0 = net.bytebuddy.utility.GraalImageCode.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            net.bytebuddy.utility.GraalImageCode r1 = (net.bytebuddy.utility.GraalImageCode) r1
            return r1
    }

    public static net.bytebuddy.utility.GraalImageCode[] values() {
            net.bytebuddy.utility.GraalImageCode[] r0 = net.bytebuddy.utility.GraalImageCode.$VALUES
            java.lang.Object r0 = r0.clone()
            net.bytebuddy.utility.GraalImageCode[] r0 = (net.bytebuddy.utility.GraalImageCode[]) r0
            return r0
    }

    public boolean isDefined() {
            r1 = this;
            boolean r0 = r1.defined
            return r0
    }

    public boolean isNativeImageExecution() {
            r1 = this;
            boolean r0 = r1.nativeImageExecution
            return r0
    }

    public <T> T[] sorted(T[] r2, java.util.Comparator<? super T> r3) {
            r1 = this;
            boolean r0 = r1.defined
            if (r0 == 0) goto L7
            java.util.Arrays.sort(r2, r3)
        L7:
            return r2
    }
}
