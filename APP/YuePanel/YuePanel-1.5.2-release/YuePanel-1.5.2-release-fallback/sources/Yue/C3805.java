package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۨۡۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C3805 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final java.lang.String f12050 = "http://www.slf4j.org/codes.html";

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final java.lang.String f12051 = "http://www.slf4j.org/codes.html#StaticLoggerBinder";

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final java.lang.String f12052 = "http://www.slf4j.org/codes.html#multiple_bindings";

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final java.lang.String f12053 = "http://www.slf4j.org/codes.html#null_LF";

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final java.lang.String f12054 = "http://www.slf4j.org/codes.html#version_mismatch";

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final java.lang.String f12055 = "http://www.slf4j.org/codes.html#substituteLogger";

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final java.lang.String f12056 = "http://www.slf4j.org/codes.html#loggerNameMismatch";

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final java.lang.String f12057 = "http://www.slf4j.org/codes.html#replay";

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final java.lang.String f12058 = "http://www.slf4j.org/codes.html#unsuccessfulInit";

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final java.lang.String f12059 = "org.slf4j.LoggerFactory in failed state. Original exception was thrown EARLIER. See also http://www.slf4j.org/codes.html#unsuccessfulInit";

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final int f12060 = 0;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final int f12061 = 1;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static final int f12062 = 2;

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static final int f12063 = 3;

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static final int f12064 = 4;

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static volatile int f12065 = 0;

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static final Yue.C6046 f12066 = null;

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static final Yue.C4358 f12067 = null;

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static final java.lang.String f12068 = "slf4j.detectLoggerNameMismatch";

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static final java.lang.String f12069 = "java.vendor.url";

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static boolean f12070;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static final java.lang.String[] f12071 = null;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static java.lang.String f12072;

    static {
            Yue.ۥۣۢ۠ۤ r0 = new Yue.ۥۣۢ۠ۤ
            r0.<init>()
            Yue.C3805.f12066 = r0
            Yue.ۥۡۢ۟ۨ r0 = new Yue.ۥۡۢ۟ۨ
            r0.<init>()
            Yue.C3805.f12067 = r0
            java.lang.String r0 = "slf4j.detectLoggerNameMismatch"
            boolean r0 = Yue.C6653.m25551(r0)
            Yue.C3805.f12070 = r0
            java.lang.String r0 = "1.6"
            java.lang.String r1 = "1.7"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            Yue.C3805.f12071 = r0
            java.lang.String r0 = "org/slf4j/impl/StaticLoggerBinder.class"
            Yue.C3805.f12072 = r0
            return
    }

    public C3805() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final void m15241() {
            boolean r0 = m15252()     // Catch: java.lang.Exception -> Le java.lang.NoSuchMethodError -> L10 java.lang.NoClassDefFoundError -> L12
            if (r0 != 0) goto L14
            java.util.Set r0 = m15246()     // Catch: java.lang.Exception -> Le java.lang.NoSuchMethodError -> L10 java.lang.NoClassDefFoundError -> L12
            m15259(r0)     // Catch: java.lang.Exception -> Le java.lang.NoSuchMethodError -> L10 java.lang.NoClassDefFoundError -> L12
            goto L15
        Le:
            r0 = move-exception
            goto L2a
        L10:
            r0 = move-exception
            goto L35
        L12:
            r0 = move-exception
            goto L56
        L14:
            r0 = 0
        L15:
            org.slf4j.impl.StaticLoggerBinder.getSingleton()     // Catch: java.lang.Exception -> Le java.lang.NoSuchMethodError -> L10 java.lang.NoClassDefFoundError -> L12
            r1 = 3
            Yue.C3805.f12065 = r1     // Catch: java.lang.Exception -> Le java.lang.NoSuchMethodError -> L10 java.lang.NoClassDefFoundError -> L12
            m15258(r0)     // Catch: java.lang.Exception -> Le java.lang.NoSuchMethodError -> L10 java.lang.NoClassDefFoundError -> L12
            m15247()     // Catch: java.lang.Exception -> Le java.lang.NoSuchMethodError -> L10 java.lang.NoClassDefFoundError -> L12
            m15256()     // Catch: java.lang.Exception -> Le java.lang.NoSuchMethodError -> L10 java.lang.NoClassDefFoundError -> L12
            Yue.ۥۣۢ۠ۤ r0 = Yue.C3805.f12066     // Catch: java.lang.Exception -> Le java.lang.NoSuchMethodError -> L10 java.lang.NoClassDefFoundError -> L12
            r0.m22727()     // Catch: java.lang.Exception -> Le java.lang.NoSuchMethodError -> L10 java.lang.NoClassDefFoundError -> L12
            goto L72
        L2a:
            m15245(r0)
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Unexpected initialization failure"
            r1.<init>(r2, r0)
            throw r1
        L35:
            java.lang.String r1 = r0.getMessage()
            if (r1 == 0) goto L55
            java.lang.String r2 = "org.slf4j.impl.StaticLoggerBinder.getSingleton()"
            boolean r1 = r1.contains(r2)
            if (r1 == 0) goto L55
            r1 = 2
            Yue.C3805.f12065 = r1
            java.lang.String r1 = "slf4j-api 1.6.x (or later) is incompatible with this binding."
            Yue.C6653.m25548(r1)
            java.lang.String r1 = "Your binding is version 1.5.5 or earlier."
            Yue.C6653.m25548(r1)
            java.lang.String r1 = "Upgrade your binding to version 1.6.x."
            Yue.C6653.m25548(r1)
        L55:
            throw r0
        L56:
            java.lang.String r1 = r0.getMessage()
            boolean r1 = m15253(r1)
            if (r1 == 0) goto L73
            r0 = 4
            Yue.C3805.f12065 = r0
            java.lang.String r0 = "Failed to load class \"org.slf4j.impl.StaticLoggerBinder\"."
            Yue.C6653.m25548(r0)
            java.lang.String r0 = "Defaulting to no-operation (NOP) logger implementation"
            Yue.C6653.m25548(r0)
            java.lang.String r0 = "See http://www.slf4j.org/codes.html#StaticLoggerBinder for further details."
            Yue.C6653.m25548(r0)
        L72:
            return
        L73:
            m15245(r0)
            throw r0
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static void m15242(Yue.C6047 r1, int r2) {
            Yue.ۥۢ۠ۤۢ r0 = r1.m22732()
            boolean r0 = r0.m22722()
            if (r0 == 0) goto Le
            m15243(r2)
            goto L1c
        Le:
            Yue.ۥۢ۠ۤۢ r1 = r1.m22732()
            boolean r1 = r1.m22723()
            if (r1 == 0) goto L19
            goto L1c
        L19:
            m15244()
        L1c:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static void m15243(int r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "A number ("
            r0.append(r1)
            r0.append(r2)
            java.lang.String r2 = ") of logging calls during the initialization phase have been intercepted and are"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            Yue.C6653.m25548(r2)
            java.lang.String r2 = "now being replayed. These are subject to the filtering rules of the underlying logging system."
            Yue.C6653.m25548(r2)
            java.lang.String r2 = "See also http://www.slf4j.org/codes.html#replay"
            Yue.C6653.m25548(r2)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static void m15244() {
            java.lang.String r0 = "The following set of substitute loggers may have been accessed"
            Yue.C6653.m25548(r0)
            java.lang.String r0 = "during the initialization phase. Logging calls during this"
            Yue.C6653.m25548(r0)
            java.lang.String r0 = "phase were not honored. However, subsequent logging calls to these"
            Yue.C6653.m25548(r0)
            java.lang.String r0 = "loggers will work as normally expected."
            Yue.C6653.m25548(r0)
            java.lang.String r0 = "See also http://www.slf4j.org/codes.html#substituteLogger"
            Yue.C6653.m25548(r0)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static void m15245(java.lang.Throwable r1) {
            r0 = 2
            Yue.C3805.f12065 = r0
            java.lang.String r0 = "Failed to instantiate SLF4J LoggerFactory"
            Yue.C6653.m25549(r0, r1)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static java.util.Set<java.net.URL> m15246() {
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            java.lang.Class<Yue.ۥ۠ۨۡۦ> r1 = Yue.C3805.class
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch: java.io.IOException -> L14
            if (r1 != 0) goto L16
            java.lang.String r1 = Yue.C3805.f12072     // Catch: java.io.IOException -> L14
            java.util.Enumeration r1 = java.lang.ClassLoader.getSystemResources(r1)     // Catch: java.io.IOException -> L14
            goto L1c
        L14:
            r1 = move-exception
            goto L2c
        L16:
            java.lang.String r2 = Yue.C3805.f12072     // Catch: java.io.IOException -> L14
            java.util.Enumeration r1 = r1.getResources(r2)     // Catch: java.io.IOException -> L14
        L1c:
            boolean r2 = r1.hasMoreElements()     // Catch: java.io.IOException -> L14
            if (r2 == 0) goto L31
            java.lang.Object r2 = r1.nextElement()     // Catch: java.io.IOException -> L14
            java.net.URL r2 = (java.net.URL) r2     // Catch: java.io.IOException -> L14
            r0.add(r2)     // Catch: java.io.IOException -> L14
            goto L1c
        L2c:
            java.lang.String r2 = "Error getting resources from path"
            Yue.C6653.m25549(r2, r1)
        L31:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static void m15247() {
            Yue.ۥۣۢ۠ۤ r0 = Yue.C3805.f12066
            monitor-enter(r0)
            r0.m22731()     // Catch: java.lang.Throwable -> L26
            java.util.List r1 = r0.m22730()     // Catch: java.lang.Throwable -> L26
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L26
        Le:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L26
            if (r2 == 0) goto L28
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L26
            Yue.ۥۢ۠ۤۢ r2 = (Yue.C6045) r2     // Catch: java.lang.Throwable -> L26
            java.lang.String r3 = r2.getName()     // Catch: java.lang.Throwable -> L26
            Yue.ۥ۠ۨۡۥ r3 = m15250(r3)     // Catch: java.lang.Throwable -> L26
            r2.m22726(r3)     // Catch: java.lang.Throwable -> L26
            goto Le
        L26:
            r1 = move-exception
            goto L2a
        L28:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L26
            return
        L2a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L26
            throw r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static org.slf4j.ILoggerFactory m15248() {
            int r0 = Yue.C3805.f12065
            r1 = 1
            if (r0 != 0) goto L18
            java.lang.Class<Yue.ۥ۠ۨۡۦ> r0 = Yue.C3805.class
            monitor-enter(r0)
            int r2 = Yue.C3805.f12065     // Catch: java.lang.Throwable -> L12
            if (r2 != 0) goto L14
            Yue.C3805.f12065 = r1     // Catch: java.lang.Throwable -> L12
            m15255()     // Catch: java.lang.Throwable -> L12
            goto L14
        L12:
            r1 = move-exception
            goto L16
        L14:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            goto L18
        L16:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            throw r1
        L18:
            int r0 = Yue.C3805.f12065
            if (r0 == r1) goto L41
            r1 = 2
            if (r0 == r1) goto L39
            r1 = 3
            if (r0 == r1) goto L30
            r1 = 4
            if (r0 != r1) goto L28
            Yue.ۥۡۢ۟ۨ r0 = Yue.C3805.f12067
            return r0
        L28:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Unreachable code"
            r0.<init>(r1)
            throw r0
        L30:
            org.slf4j.impl.StaticLoggerBinder r0 = org.slf4j.impl.StaticLoggerBinder.getSingleton()
            org.slf4j.ILoggerFactory r0 = r0.getLoggerFactory()
            return r0
        L39:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "org.slf4j.LoggerFactory in failed state. Original exception was thrown EARLIER. See also http://www.slf4j.org/codes.html#unsuccessfulInit"
            r0.<init>(r1)
            throw r0
        L41:
            Yue.ۥۣۢ۠ۤ r0 = Yue.C3805.f12066
            return r0
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static Yue.InterfaceC3804 m15249(java.lang.Class<?> r2) {
            java.lang.String r0 = r2.getName()
            Yue.ۥ۠ۨۡۥ r0 = m15250(r0)
            boolean r1 = Yue.C3805.f12070
            if (r1 == 0) goto L32
            java.lang.Class r1 = Yue.C6653.m25546()
            if (r1 == 0) goto L32
            boolean r2 = m15254(r2, r1)
            if (r2 == 0) goto L32
            java.lang.String r2 = r0.getName()
            java.lang.String r1 = r1.getName()
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r1}
            java.lang.String r1 = "Detected logger name mismatch. Given name: \"%s\"; computed name: \"%s\"."
            java.lang.String r2 = java.lang.String.format(r1, r2)
            Yue.C6653.m25548(r2)
            java.lang.String r2 = "See http://www.slf4j.org/codes.html#loggerNameMismatch for an explanation"
            Yue.C6653.m25548(r2)
        L32:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static Yue.InterfaceC3804 m15250(java.lang.String r1) {
            org.slf4j.ILoggerFactory r0 = m15248()
            Yue.ۥ۠ۨۡۥ r1 = r0.mo17186(r1)
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static boolean m15251(java.util.Set<java.net.URL> r1) {
            int r1 = r1.size()
            r0 = 1
            if (r1 <= r0) goto L8
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static boolean m15252() {
            java.lang.String r0 = "java.vendor.url"
            java.lang.String r0 = Yue.C6653.m25552(r0)
            if (r0 != 0) goto La
            r0 = 0
            return r0
        La:
            java.lang.String r0 = r0.toLowerCase()
            java.lang.String r1 = "android"
            boolean r0 = r0.contains(r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static boolean m15253(java.lang.String r3) {
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            java.lang.String r1 = "org/slf4j/impl/StaticLoggerBinder"
            boolean r1 = r3.contains(r1)
            r2 = 1
            if (r1 == 0) goto Le
            return r2
        Le:
            java.lang.String r1 = "org.slf4j.impl.StaticLoggerBinder"
            boolean r3 = r3.contains(r1)
            if (r3 == 0) goto L17
            return r2
        L17:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static boolean m15254(java.lang.Class<?> r0, java.lang.Class<?> r1) {
            boolean r0 = r1.isAssignableFrom(r0)
            r0 = r0 ^ 1
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static final void m15255() {
            m15241()
            int r0 = Yue.C3805.f12065
            r1 = 3
            if (r0 != r1) goto Lb
            m15261()
        Lb:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static void m15256() {
            Yue.ۥۣۢ۠ۤ r0 = Yue.C3805.f12066
            java.util.concurrent.LinkedBlockingQueue r0 = r0.m22728()
            int r1 = r0.size()
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 128(0x80, float:1.8E-43)
            r2.<init>(r3)
            r4 = 0
        L12:
            int r5 = r0.drainTo(r2, r3)
            if (r5 != 0) goto L19
            return
        L19:
            java.util.Iterator r5 = r2.iterator()
        L1d:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L35
            java.lang.Object r6 = r5.next()
            Yue.ۥۢ۠ۤۤ r6 = (Yue.C6047) r6
            m15257(r6)
            int r7 = r4 + 1
            if (r4 != 0) goto L33
            m15242(r6, r1)
        L33:
            r4 = r7
            goto L1d
        L35:
            r2.clear()
            goto L12
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static void m15257(Yue.C6047 r3) {
            if (r3 != 0) goto L3
            return
        L3:
            Yue.ۥۢ۠ۤۢ r0 = r3.m22732()
            java.lang.String r1 = r0.getName()
            boolean r2 = r0.m22724()
            if (r2 != 0) goto L26
            boolean r2 = r0.m22723()
            if (r2 == 0) goto L18
            goto L25
        L18:
            boolean r2 = r0.m22722()
            if (r2 == 0) goto L22
            r0.m22725(r3)
            goto L25
        L22:
            Yue.C6653.m25548(r1)
        L25:
            return
        L26:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "Delegate logger cannot be null at this state."
            r3.<init>(r0)
            throw r3
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static void m15258(java.util.Set<java.net.URL> r1) {
            if (r1 == 0) goto L29
            boolean r1 = m15251(r1)
            if (r1 == 0) goto L29
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Actual binding is of type ["
            r1.append(r0)
            org.slf4j.impl.StaticLoggerBinder r0 = org.slf4j.impl.StaticLoggerBinder.getSingleton()
            java.lang.String r0 = r0.getLoggerFactoryClassStr()
            r1.append(r0)
            java.lang.String r0 = "]"
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            Yue.C6653.m25548(r1)
        L29:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static void m15259(java.util.Set<java.net.URL> r3) {
            boolean r0 = m15251(r3)
            if (r0 == 0) goto L3a
            java.lang.String r0 = "Class path contains multiple SLF4J bindings."
            Yue.C6653.m25548(r0)
            java.util.Iterator r3 = r3.iterator()
        Lf:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L35
            java.lang.Object r0 = r3.next()
            java.net.URL r0 = (java.net.URL) r0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Found binding in ["
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = "]"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            Yue.C6653.m25548(r0)
            goto Lf
        L35:
            java.lang.String r3 = "See http://www.slf4j.org/codes.html#multiple_bindings for an explanation."
            Yue.C6653.m25548(r3)
        L3a:
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static void m15260() {
            r0 = 0
            Yue.C3805.f12065 = r0
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static final void m15261() {
            java.lang.String r0 = org.slf4j.impl.StaticLoggerBinder.REQUESTED_API_VERSION     // Catch: java.lang.Throwable -> L15 java.lang.NoSuchFieldError -> L4a
            java.lang.String[] r1 = Yue.C3805.f12071     // Catch: java.lang.Throwable -> L15 java.lang.NoSuchFieldError -> L4a
            int r2 = r1.length     // Catch: java.lang.Throwable -> L15 java.lang.NoSuchFieldError -> L4a
            r3 = 0
            r4 = r3
        L7:
            if (r3 >= r2) goto L17
            r5 = r1[r3]     // Catch: java.lang.Throwable -> L15 java.lang.NoSuchFieldError -> L4a
            boolean r5 = r0.startsWith(r5)     // Catch: java.lang.Throwable -> L15 java.lang.NoSuchFieldError -> L4a
            if (r5 == 0) goto L12
            r4 = 1
        L12:
            int r3 = r3 + 1
            goto L7
        L15:
            r0 = move-exception
            goto L45
        L17:
            if (r4 != 0) goto L4a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L15 java.lang.NoSuchFieldError -> L4a
            r1.<init>()     // Catch: java.lang.Throwable -> L15 java.lang.NoSuchFieldError -> L4a
            java.lang.String r2 = "The requested version "
            r1.append(r2)     // Catch: java.lang.Throwable -> L15 java.lang.NoSuchFieldError -> L4a
            r1.append(r0)     // Catch: java.lang.Throwable -> L15 java.lang.NoSuchFieldError -> L4a
            java.lang.String r0 = " by your slf4j binding is not compatible with "
            r1.append(r0)     // Catch: java.lang.Throwable -> L15 java.lang.NoSuchFieldError -> L4a
            java.lang.String[] r0 = Yue.C3805.f12071     // Catch: java.lang.Throwable -> L15 java.lang.NoSuchFieldError -> L4a
            java.util.List r0 = java.util.Arrays.asList(r0)     // Catch: java.lang.Throwable -> L15 java.lang.NoSuchFieldError -> L4a
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L15 java.lang.NoSuchFieldError -> L4a
            r1.append(r0)     // Catch: java.lang.Throwable -> L15 java.lang.NoSuchFieldError -> L4a
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> L15 java.lang.NoSuchFieldError -> L4a
            Yue.C6653.m25548(r0)     // Catch: java.lang.Throwable -> L15 java.lang.NoSuchFieldError -> L4a
            java.lang.String r0 = "See http://www.slf4j.org/codes.html#version_mismatch for further details."
            Yue.C6653.m25548(r0)     // Catch: java.lang.Throwable -> L15 java.lang.NoSuchFieldError -> L4a
            goto L4a
        L45:
            java.lang.String r1 = "Unexpected problem occured during version sanity check"
            Yue.C6653.m25549(r1, r0)
        L4a:
            return
    }
}
