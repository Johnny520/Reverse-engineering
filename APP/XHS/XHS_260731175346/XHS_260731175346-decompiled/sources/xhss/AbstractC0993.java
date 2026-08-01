package xhss;

/* JADX INFO: renamed from: xhss.ᲁᲇᛴᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0993 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public static final xhss.C0109 f3221 = null;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public static final xhss.C0109 f3222 = null;

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public static volatile xhss.C0109 f3223;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public static volatile int f3224;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public static final boolean f3225 = false;

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public static final java.lang.String[] f3226 = null;

    static {
            xhss.ᛱᲇᲁᛱ r0 = new xhss.ᛱᲇᲁᛱ
            r1 = 1
            r0.<init>(r1)
            xhss.AbstractC0993.f3221 = r0
            xhss.ᛱᲇᲁᛱ r0 = new xhss.ᛱᲇᲁᛱ
            r1 = 0
            r0.<init>(r1)
            xhss.AbstractC0993.f3222 = r0
            java.lang.String r0 = "slf4j.detectLoggerNameMismatch"
            java.lang.String r0 = java.lang.System.getProperty(r0)     // Catch: java.lang.SecurityException -> L17
            goto L18
        L17:
            r0 = 0
        L18:
            if (r0 != 0) goto L1b
            goto L21
        L1b:
            java.lang.String r1 = "true"
            boolean r1 = r0.equalsIgnoreCase(r1)
        L21:
            xhss.AbstractC0993.f3225 = r1
            java.lang.String r0 = "2.0"
            java.lang.String[] r0 = new java.lang.String[]{r0}
            xhss.AbstractC0993.f3226 = r0
            return
    }

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public static xhss.InterfaceC0869 m1628(java.lang.Class r6) {
            java.lang.String r0 = r6.getName()
            xhss.ᲀᛶᛶᲀ r0 = m1629(r0)
            boolean r1 = xhss.AbstractC0993.f3225
            if (r1 == 0) goto L89
            xhss.ᛵᲈᛱᛶ r1 = xhss.AbstractC0485.f1780
            r2 = 0
            if (r1 == 0) goto L12
            goto L24
        L12:
            boolean r1 = xhss.AbstractC0485.f1777
            if (r1 == 0) goto L18
            r1 = r2
            goto L24
        L18:
            xhss.ᛵᲈᛱᛶ r1 = new xhss.ᛵᲈᛱᛶ     // Catch: java.lang.SecurityException -> L1e
            r1.<init>()     // Catch: java.lang.SecurityException -> L1e
            goto L1f
        L1e:
            r1 = r2
        L1f:
            xhss.AbstractC0485.f1780 = r1
            r3 = 1
            xhss.AbstractC0485.f1777 = r3
        L24:
            if (r1 != 0) goto L27
            goto L4f
        L27:
            java.lang.Class[] r1 = r1.getClassContext()
            java.lang.Class<xhss.ᛵᛶᲀᲇ> r3 = xhss.AbstractC0485.class
            java.lang.String r3 = r3.getName()
            r4 = 0
        L32:
            int r5 = r1.length
            if (r4 >= r5) goto L45
            r5 = r1[r4]
            java.lang.String r5 = r5.getName()
            boolean r5 = r3.equals(r5)
            if (r5 == 0) goto L42
            goto L45
        L42:
            int r4 = r4 + 1
            goto L32
        L45:
            int r3 = r1.length
            if (r4 >= r3) goto L83
            int r4 = r4 + 2
            int r3 = r1.length
            if (r4 >= r3) goto L83
            r2 = r1[r4]
        L4f:
            if (r2 == 0) goto L89
            boolean r6 = r2.isAssignableFrom(r6)
            if (r6 != 0) goto L89
            java.lang.String r6 = r0.getName()
            java.lang.String r1 = r2.getName()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Detected logger name mismatch. Given name: \""
            r2.<init>(r3)
            r2.append(r6)
            java.lang.String r6 = "\"; computed name: \""
            r2.append(r6)
            r2.append(r1)
            java.lang.String r6 = "\"."
            r2.append(r6)
            java.lang.String r6 = r2.toString()
            xhss.AbstractC0088.m248(r6)
            java.lang.String r6 = "See https://www.slf4j.org/codes.html#loggerNameMismatch for an explanation"
            xhss.AbstractC0088.m248(r6)
            goto L89
        L83:
            java.lang.String r6 = "Failed to find org.slf4j.helpers.Util or its caller in the stack; this should not happen"
            xhss.C0532.m950(r6)
            return r2
        L89:
            return r0
    }

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public static xhss.InterfaceC0869 m1629(java.lang.String r3) {
            int r0 = xhss.AbstractC0993.f3224
            r1 = 1
            if (r0 != 0) goto L18
            java.lang.Class<xhss.ᲁᲇᛴᲀ> r0 = xhss.AbstractC0993.class
            monitor-enter(r0)
            int r2 = xhss.AbstractC0993.f3224     // Catch: java.lang.Throwable -> L12
            if (r2 != 0) goto L14
            xhss.AbstractC0993.f3224 = r1     // Catch: java.lang.Throwable -> L12
            m1634()     // Catch: java.lang.Throwable -> L12
            goto L14
        L12:
            r3 = move-exception
            goto L16
        L14:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            goto L18
        L16:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            throw r3
        L18:
            int r0 = xhss.AbstractC0993.f3224
            if (r0 == r1) goto L38
            r1 = 2
            r2 = 0
            if (r0 == r1) goto L32
            r1 = 3
            if (r0 == r1) goto L2f
            r1 = 4
            if (r0 != r1) goto L29
            xhss.ᛱᲇᲁᛱ r0 = xhss.AbstractC0993.f3222
            goto L3a
        L29:
            java.lang.String r3 = "Unreachable code"
            xhss.C0532.m950(r3)
            return r2
        L2f:
            xhss.ᛱᲇᲁᛱ r0 = xhss.AbstractC0993.f3223
            goto L3a
        L32:
            java.lang.String r3 = "org.slf4j.LoggerFactory in failed state. Original exception was thrown EARLIER. See also https://www.slf4j.org/codes.html#unsuccessfulInit"
            xhss.C0532.m950(r3)
            return r2
        L38:
            xhss.ᛱᲇᲁᛱ r0 = xhss.AbstractC0993.f3221
        L3a:
            int r1 = r0.f489
            switch(r1) {
                case 0: goto L44;
                default: goto L3f;
            }
        L3f:
            xhss.ᛶᲇᲈᛵ r0 = r0.f488
            xhss.ᲀᲈᛲᛷ r0 = (xhss.C0914) r0
            goto L48
        L44:
            xhss.ᛶᲇᲈᛵ r0 = r0.f488
            xhss.ᛶᛵᲇᛸ r0 = (xhss.C0564) r0
        L48:
            xhss.ᲀᛶᛶᲀ r3 = r0.mo1033(r3)
            return r3
    }

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public static void m1630() {
            xhss.ᛱᲇᲁᛱ r0 = xhss.AbstractC0993.f3221
            monitor-enter(r0)
            xhss.ᛶᲇᲈᛵ r1 = r0.f488     // Catch: java.lang.Throwable -> L32
            xhss.ᲀᲈᛲᛷ r1 = (xhss.C0914) r1     // Catch: java.lang.Throwable -> L32
            r2 = 1
            r1.f2946 = r2     // Catch: java.lang.Throwable -> L32
            xhss.ᛶᲇᲈᛵ r1 = r0.f488     // Catch: java.lang.Throwable -> L32
            xhss.ᲀᲈᛲᛷ r1 = (xhss.C0914) r1     // Catch: java.lang.Throwable -> L32
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L32
            java.util.concurrent.ConcurrentHashMap r1 = r1.f2947     // Catch: java.lang.Throwable -> L32
            java.util.Collection r1 = r1.values()     // Catch: java.lang.Throwable -> L32
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L32
            java.util.Iterator r1 = r2.iterator()     // Catch: java.lang.Throwable -> L32
        L1d:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L32
            if (r2 == 0) goto L35
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L32
            xhss.ᲈᛸᛷᲀ r2 = (xhss.C1166) r2     // Catch: java.lang.Throwable -> L32
            java.lang.String r3 = r2.f3769     // Catch: java.lang.Throwable -> L32
            xhss.ᲀᛶᛶᲀ r3 = m1629(r3)     // Catch: java.lang.Throwable -> L32
            r2.f3770 = r3     // Catch: java.lang.Throwable -> L32
            goto L1d
        L32:
            r1 = move-exception
            goto L103
        L35:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            xhss.ᛱᲇᲁᛱ r0 = xhss.AbstractC0993.f3221
            xhss.ᛶᲇᲈᛵ r0 = r0.f488
            xhss.ᲀᲈᛲᛷ r0 = (xhss.C0914) r0
            java.util.concurrent.LinkedBlockingQueue r1 = r0.f2948
            int r2 = r1.size()
            java.util.ArrayList r3 = new java.util.ArrayList
            r4 = 128(0x80, float:1.8E-43)
            r3.<init>(r4)
            r0 = 0
        L4a:
            int r5 = r1.drainTo(r3, r4)
            if (r5 != 0) goto L61
            xhss.ᛱᲇᲁᛱ r0 = xhss.AbstractC0993.f3221
            xhss.ᛶᲇᲈᛵ r0 = r0.f488
            xhss.ᲀᲈᛲᛷ r0 = (xhss.C0914) r0
            java.util.concurrent.ConcurrentHashMap r1 = r0.f2947
            r1.clear()
            java.util.concurrent.LinkedBlockingQueue r0 = r0.f2948
            r0.clear()
            return
        L61:
            java.util.Iterator r5 = r3.iterator()
        L65:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto Lfe
            java.lang.Object r6 = r5.next()
            xhss.ᲀᲀᛴᛴ r6 = (xhss.C0895) r6
            if (r6 != 0) goto L74
            goto La6
        L74:
            xhss.ᲈᛸᛷᲀ r7 = r6.f2890
            java.lang.String r8 = r7.f3769
            xhss.ᲀᛶᛶᲀ r9 = r7.f3770
            if (r9 == 0) goto Lf8
            xhss.ᲀᛶᛶᲀ r9 = r7.f3770
            boolean r9 = r9 instanceof xhss.C0145
            if (r9 == 0) goto L83
            goto La6
        L83:
            boolean r9 = r7.m1862()
            if (r9 == 0) goto La3
            int r8 = r6.f2892
            boolean r8 = r7.mo1441(r8)
            if (r8 == 0) goto La6
            boolean r8 = r7.m1862()
            if (r8 == 0) goto La6
            java.lang.reflect.Method r8 = r7.f3771     // Catch: java.lang.Throwable -> La6
            xhss.ᲀᛶᛶᲀ r7 = r7.f3770     // Catch: java.lang.Throwable -> La6
            java.lang.Object[] r9 = new java.lang.Object[]{r6}     // Catch: java.lang.Throwable -> La6
            r8.invoke(r7, r9)     // Catch: java.lang.Throwable -> La6
            goto La6
        La3:
            xhss.AbstractC0088.m248(r8)
        La6:
            int r7 = r0 + 1
            if (r0 != 0) goto Lf5
            xhss.ᲈᛸᛷᲀ r0 = r6.f2890
            boolean r0 = r0.m1862()
            if (r0 == 0) goto Ld3
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r6 = "A number ("
            r0.<init>(r6)
            r0.append(r2)
            java.lang.String r6 = ") of logging calls during the initialization phase have been intercepted and are"
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            xhss.AbstractC0088.m248(r0)
            java.lang.String r0 = "now being replayed. These are subject to the filtering rules of the underlying logging system."
            xhss.AbstractC0088.m248(r0)
            java.lang.String r0 = "See also https://www.slf4j.org/codes.html#replay"
            xhss.AbstractC0088.m248(r0)
            goto Lf5
        Ld3:
            xhss.ᲈᛸᛷᲀ r0 = r6.f2890
            xhss.ᲀᛶᛶᲀ r0 = r0.f3770
            boolean r0 = r0 instanceof xhss.C0145
            if (r0 == 0) goto Ldc
            goto Lf5
        Ldc:
            java.lang.String r0 = "The following set of substitute loggers may have been accessed"
            xhss.AbstractC0088.m248(r0)
            java.lang.String r0 = "during the initialization phase. Logging calls during this"
            xhss.AbstractC0088.m248(r0)
            java.lang.String r0 = "phase were not honored. However, subsequent logging calls to these"
            xhss.AbstractC0088.m248(r0)
            java.lang.String r0 = "loggers will work as normally expected."
            xhss.AbstractC0088.m248(r0)
            java.lang.String r0 = "See also https://www.slf4j.org/codes.html#substituteLogger"
            xhss.AbstractC0088.m248(r0)
        Lf5:
            r0 = r7
            goto L65
        Lf8:
            java.lang.String r0 = "Delegate logger cannot be null at this state."
            xhss.C0532.m950(r0)
            return
        Lfe:
            r3.clear()
            goto L4a
        L103:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            throw r1
    }

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public static java.util.ArrayList m1631() {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.Class<xhss.ᲁᲇᛴᲀ> r1 = xhss.AbstractC0993.class
            java.lang.ClassLoader r1 = r1.getClassLoader()
            java.lang.String r2 = "\" specified via \"slf4j.provider\" system property"
            java.lang.String r3 = "Attempting to load provider \""
            java.lang.String r4 = "slf4j.provider"
            java.lang.String r4 = java.lang.System.getProperty(r4)
            r5 = 0
            if (r4 == 0) goto L8b
            boolean r6 = r4.isEmpty()
            if (r6 == 0) goto L1f
            goto L8b
        L1f:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.ClassCastException -> L5a java.lang.Throwable -> L5c
            r6.<init>(r3)     // Catch: java.lang.ClassCastException -> L5a java.lang.Throwable -> L5c
            r6.append(r4)     // Catch: java.lang.ClassCastException -> L5a java.lang.Throwable -> L5c
            r6.append(r2)     // Catch: java.lang.ClassCastException -> L5a java.lang.Throwable -> L5c
            java.lang.String r2 = r6.toString()     // Catch: java.lang.ClassCastException -> L5a java.lang.Throwable -> L5c
            int r3 = xhss.AbstractC0088.f433     // Catch: java.lang.ClassCastException -> L5a java.lang.Throwable -> L5c
            r3 = 2
            int r3 = xhss.AbstractC0390.m784(r3)     // Catch: java.lang.ClassCastException -> L5a java.lang.Throwable -> L5c
            int r6 = xhss.AbstractC0088.f432     // Catch: java.lang.ClassCastException -> L5a java.lang.Throwable -> L5c
            int r6 = xhss.AbstractC0390.m784(r6)     // Catch: java.lang.ClassCastException -> L5a java.lang.Throwable -> L5c
            if (r3 < r6) goto L4a
            java.io.PrintStream r3 = xhss.AbstractC0088.m247()     // Catch: java.lang.ClassCastException -> L5a java.lang.Throwable -> L5c
            java.lang.String r6 = "SLF4J(I): "
            java.lang.String r2 = r6.concat(r2)     // Catch: java.lang.ClassCastException -> L5a java.lang.Throwable -> L5c
            r3.println(r2)     // Catch: java.lang.ClassCastException -> L5a java.lang.Throwable -> L5c
        L4a:
            java.lang.Class r2 = r1.loadClass(r4)     // Catch: java.lang.ClassCastException -> L5a java.lang.Throwable -> L5c
            java.lang.reflect.Constructor r2 = r2.getConstructor(r5)     // Catch: java.lang.ClassCastException -> L5a java.lang.Throwable -> L5c
            java.lang.Object r2 = r2.newInstance(r5)     // Catch: java.lang.ClassCastException -> L5a java.lang.Throwable -> L5c
            xhss.ᛱᲇᲁᛱ r2 = (xhss.C0109) r2     // Catch: java.lang.ClassCastException -> L5a java.lang.Throwable -> L5c
            r5 = r2
            goto L8b
        L5a:
            r2 = move-exception
            goto L5e
        L5c:
            r2 = move-exception
            goto L75
        L5e:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r6 = "Specified SLF4JServiceProvider ("
            r3.<init>(r6)
            r3.append(r4)
            java.lang.String r4 = ") does not implement SLF4JServiceProvider interface"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            xhss.AbstractC0088.m249(r3, r2)
            goto L8b
        L75:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r6 = "Failed to instantiate the specified SLF4JServiceProvider ("
            r3.<init>(r6)
            r3.append(r4)
            java.lang.String r4 = ")"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            xhss.AbstractC0088.m249(r3, r2)
        L8b:
            if (r5 == 0) goto L91
            r0.add(r5)
            return r0
        L91:
            java.lang.SecurityManager r2 = java.lang.System.getSecurityManager()
            if (r2 != 0) goto L9e
            java.lang.Class<xhss.ᛱᲇᲁᛱ> r2 = xhss.C0109.class
            java.util.ServiceLoader r1 = java.util.ServiceLoader.load(r2, r1)
            goto La9
        L9e:
            xhss.ᲀᲇᛷᲈ r2 = new xhss.ᲀᲇᛷᲈ
            r2.<init>(r1)
            java.lang.Object r1 = java.security.AccessController.doPrivileged(r2)
            java.util.ServiceLoader r1 = (java.util.ServiceLoader) r1
        La9:
            java.util.Iterator r1 = r1.iterator()
        Lad:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto Lde
            java.lang.Object r2 = r1.next()     // Catch: java.util.ServiceConfigurationError -> Lbd
            xhss.ᛱᲇᲁᛱ r2 = (xhss.C0109) r2     // Catch: java.util.ServiceConfigurationError -> Lbd
            r0.add(r2)     // Catch: java.util.ServiceConfigurationError -> Lbd
            goto Lad
        Lbd:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "A service provider failed to instantiate:\n"
            r3.<init>(r4)
            java.lang.String r2 = r2.getMessage()
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            java.io.PrintStream r3 = xhss.AbstractC0088.m247()
            java.lang.String r4 = "SLF4J(E): "
            java.lang.String r2 = r4.concat(r2)
            r3.println(r2)
            goto Lad
        Lde:
            return r0
    }

    /* JADX INFO: renamed from: ᛸᛴᛶᛳ, reason: contains not printable characters */
    public static void m1632(java.util.ArrayList r3) {
            int r0 = r3.size()
            r1 = 1
            if (r0 <= r1) goto L38
            java.lang.String r0 = "Class path contains multiple SLF4J providers."
            xhss.AbstractC0088.m248(r0)
            java.util.Iterator r3 = r3.iterator()
        L10:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L33
            java.lang.Object r0 = r3.next()
            xhss.ᛱᲇᲁᛱ r0 = (xhss.C0109) r0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Found provider ["
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = "]"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            xhss.AbstractC0088.m248(r0)
            goto L10
        L33:
            java.lang.String r3 = "See https://www.slf4j.org/codes.html#multiple_bindings for an explanation."
            xhss.AbstractC0088.m248(r3)
        L38:
            return
    }

    /* JADX INFO: renamed from: ᲀᲇᛳᲁ, reason: contains not printable characters */
    public static void m1633(java.util.LinkedHashSet r3) {
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L7
            return
        L7:
            java.lang.String r0 = "Class path contains SLF4J bindings targeting slf4j-api versions 1.7.x or earlier."
            xhss.AbstractC0088.m248(r0)
            java.util.Iterator r3 = r3.iterator()
        L10:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L33
            java.lang.Object r0 = r3.next()
            java.net.URL r0 = (java.net.URL) r0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Ignoring binding found at ["
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = "]"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            xhss.AbstractC0088.m248(r0)
            goto L10
        L33:
            java.lang.String r3 = "See https://www.slf4j.org/codes.html#ignoredBindings for an explanation."
            xhss.AbstractC0088.m248(r3)
            return
    }

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public static final void m1634() {
            java.util.ArrayList r0 = m1631()     // Catch: java.lang.Exception -> Lc8
            m1632(r0)     // Catch: java.lang.Exception -> Lc8
            boolean r1 = r0.isEmpty()     // Catch: java.lang.Exception -> Lc8
            r2 = 3
            r3 = 0
            if (r1 != 0) goto L27
            java.lang.Object r1 = r0.get(r3)     // Catch: java.lang.Exception -> Lc8
            xhss.ᛱᲇᲁᛱ r1 = (xhss.C0109) r1     // Catch: java.lang.Exception -> Lc8
            xhss.AbstractC0993.f3223 = r1     // Catch: java.lang.Exception -> Lc8
            xhss.ᛱᲇᲁᛱ r1 = xhss.AbstractC0993.f3223     // Catch: java.lang.Exception -> Lc8
            r1.getClass()     // Catch: java.lang.Exception -> Lc8
            xhss.ᛱᲇᲁᛱ r1 = xhss.AbstractC0993.f3223     // Catch: java.lang.Exception -> Lc8
            r1.getClass()     // Catch: java.lang.Exception -> Lc8
            xhss.AbstractC0993.f3224 = r2     // Catch: java.lang.Exception -> Lc8
            m1635(r0)     // Catch: java.lang.Exception -> Lc8
            goto L6b
        L27:
            r0 = 4
            xhss.AbstractC0993.f3224 = r0     // Catch: java.lang.Exception -> Lc8
            java.lang.String r0 = "No SLF4J providers were found."
            xhss.AbstractC0088.m248(r0)     // Catch: java.lang.Exception -> Lc8
            java.lang.String r0 = "Defaulting to no-operation (NOP) logger implementation"
            xhss.AbstractC0088.m248(r0)     // Catch: java.lang.Exception -> Lc8
            java.lang.String r0 = "See https://www.slf4j.org/codes.html#noProviders for further details."
            xhss.AbstractC0088.m248(r0)     // Catch: java.lang.Exception -> Lc8
            java.lang.String r0 = "org/slf4j/impl/StaticLoggerBinder.class"
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet     // Catch: java.lang.Exception -> Lc8
            r1.<init>()     // Catch: java.lang.Exception -> Lc8
            java.lang.Class<xhss.ᲁᲇᛴᲀ> r4 = xhss.AbstractC0993.class
            java.lang.ClassLoader r4 = r4.getClassLoader()     // Catch: java.io.IOException -> L4d java.lang.Exception -> Lc8
            if (r4 != 0) goto L4f
            java.util.Enumeration r0 = java.lang.ClassLoader.getSystemResources(r0)     // Catch: java.io.IOException -> L4d java.lang.Exception -> Lc8
            goto L53
        L4d:
            r0 = move-exception
            goto L63
        L4f:
            java.util.Enumeration r0 = r4.getResources(r0)     // Catch: java.io.IOException -> L4d java.lang.Exception -> Lc8
        L53:
            boolean r4 = r0.hasMoreElements()     // Catch: java.io.IOException -> L4d java.lang.Exception -> Lc8
            if (r4 == 0) goto L68
            java.lang.Object r4 = r0.nextElement()     // Catch: java.io.IOException -> L4d java.lang.Exception -> Lc8
            java.net.URL r4 = (java.net.URL) r4     // Catch: java.io.IOException -> L4d java.lang.Exception -> Lc8
            r1.add(r4)     // Catch: java.io.IOException -> L4d java.lang.Exception -> Lc8
            goto L53
        L63:
            java.lang.String r4 = "Error getting resources from path"
            xhss.AbstractC0088.m249(r4, r0)     // Catch: java.lang.Exception -> Lc8
        L68:
            m1633(r1)     // Catch: java.lang.Exception -> Lc8
        L6b:
            m1630()     // Catch: java.lang.Exception -> Lc8
            int r0 = xhss.AbstractC0993.f3224
            if (r0 != r2) goto Lc7
            xhss.ᛱᲇᲁᛱ r0 = xhss.AbstractC0993.f3223     // Catch: java.lang.Throwable -> Lc1
            int r0 = r0.f489     // Catch: java.lang.Throwable -> Lc1
            switch(r0) {
                case 0: goto L7f;
                default: goto L79;
            }     // Catch: java.lang.Throwable -> Lc1
        L79:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException     // Catch: java.lang.Throwable -> Lc1
            r0.<init>()     // Catch: java.lang.Throwable -> Lc1
            throw r0     // Catch: java.lang.Throwable -> Lc1
        L7f:
            java.lang.String r0 = "2.0.99"
            java.lang.String[] r1 = xhss.AbstractC0993.f3226     // Catch: java.lang.Throwable -> Lc1
            int r2 = r1.length     // Catch: java.lang.Throwable -> Lc1
            r4 = r3
        L85:
            if (r3 >= r2) goto L93
            r5 = r1[r3]     // Catch: java.lang.Throwable -> Lc1
            boolean r5 = r0.startsWith(r5)     // Catch: java.lang.Throwable -> Lc1
            if (r5 == 0) goto L90
            r4 = 1
        L90:
            int r3 = r3 + 1
            goto L85
        L93:
            if (r4 != 0) goto Lc7
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc1
            r1.<init>()     // Catch: java.lang.Throwable -> Lc1
            java.lang.String r2 = "The requested version "
            r1.append(r2)     // Catch: java.lang.Throwable -> Lc1
            r1.append(r0)     // Catch: java.lang.Throwable -> Lc1
            java.lang.String r0 = " by your slf4j provider is not compatible with "
            r1.append(r0)     // Catch: java.lang.Throwable -> Lc1
            java.lang.String[] r0 = xhss.AbstractC0993.f3226     // Catch: java.lang.Throwable -> Lc1
            java.util.List r0 = java.util.Arrays.asList(r0)     // Catch: java.lang.Throwable -> Lc1
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> Lc1
            r1.append(r0)     // Catch: java.lang.Throwable -> Lc1
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> Lc1
            xhss.AbstractC0088.m248(r0)     // Catch: java.lang.Throwable -> Lc1
            java.lang.String r0 = "See https://www.slf4j.org/codes.html#version_mismatch for further details."
            xhss.AbstractC0088.m248(r0)     // Catch: java.lang.Throwable -> Lc1
            goto Lc7
        Lc1:
            r0 = move-exception
            java.lang.String r1 = "Unexpected problem occurred during version sanity check"
            xhss.AbstractC0088.m249(r1, r0)
        Lc7:
            return
        Lc8:
            r0 = move-exception
            r1 = 2
            xhss.AbstractC0993.f3224 = r1
            java.lang.String r1 = "Failed to instantiate SLF4J LoggerFactory"
            xhss.AbstractC0088.m249(r1, r0)
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Unexpected initialization failure"
            r1.<init>(r2, r0)
            throw r1
    }

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public static void m1635(java.util.ArrayList r4) {
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L7d
            int r0 = r4.size()
            r1 = 1
            java.lang.String r2 = "]"
            r3 = 0
            if (r0 <= r1) goto L42
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Actual provider is of type ["
            r0.<init>(r1)
            java.lang.Object r4 = r4.get(r3)
            r0.append(r4)
            r0.append(r2)
            java.lang.String r4 = r0.toString()
            int r0 = xhss.AbstractC0088.f433
            r0 = 2
            int r0 = xhss.AbstractC0390.m784(r0)
            int r1 = xhss.AbstractC0088.f432
            int r1 = xhss.AbstractC0390.m784(r1)
            if (r0 < r1) goto L41
            java.io.PrintStream r0 = xhss.AbstractC0088.m247()
            java.lang.String r1 = "SLF4J(I): "
            java.lang.String r4 = r1.concat(r4)
            r0.println(r4)
        L41:
            return
        L42:
            java.lang.Object r4 = r4.get(r3)
            xhss.ᛱᲇᲁᛱ r4 = (xhss.C0109) r4
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "Connected with provider of type ["
            r0.<init>(r3)
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = r4.getName()
            r0.append(r4)
            r0.append(r2)
            java.lang.String r4 = r0.toString()
            int r0 = xhss.AbstractC0088.f433
            int r0 = xhss.AbstractC0390.m784(r1)
            int r1 = xhss.AbstractC0088.f432
            int r1 = xhss.AbstractC0390.m784(r1)
            if (r0 < r1) goto L7c
            java.io.PrintStream r0 = xhss.AbstractC0088.m247()
            java.lang.String r1 = "SLF4J(D): "
            java.lang.String r4 = r1.concat(r4)
            r0.println(r4)
        L7c:
            return
        L7d:
            java.lang.String r4 = "No providers were found which is impossible after successful initialization."
            xhss.C0532.m950(r4)
            return
    }
}
