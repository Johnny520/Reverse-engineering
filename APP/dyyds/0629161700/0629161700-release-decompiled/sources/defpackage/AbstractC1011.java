package defpackage;

/* JADX INFO: renamed from: ᛶᛱᛶᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1011 {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public static volatile defpackage.C1764 f4481;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public static final boolean f4482 = false;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public static final defpackage.C1764 f4483 = null;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static volatile int f4484;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public static final defpackage.C1764 f4485 = null;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public static final java.lang.String[] f4486 = null;

    static {
            ᲀᲇᛴᛵ r0 = new ᲀᲇᛴᛵ
            r1 = 1
            r0.<init>(r1)
            defpackage.AbstractC1011.f4485 = r0
            ᲀᲇᛴᛵ r0 = new ᲀᲇᛴᛵ
            r1 = 0
            r0.<init>(r1)
            defpackage.AbstractC1011.f4483 = r0
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
            defpackage.AbstractC1011.f4482 = r1
            java.lang.String r0 = "2.0"
            java.lang.String[] r0 = new java.lang.String[]{r0}
            defpackage.AbstractC1011.f4486 = r0
            return
    }

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public static void m1960(java.util.ArrayList r3) {
            int r0 = r3.size()
            r1 = 1
            if (r0 <= r1) goto L38
            java.lang.String r0 = "Class path contains multiple SLF4J providers."
            defpackage.AbstractC0901.m1868(r0)
            java.util.Iterator r3 = r3.iterator()
        L10:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L33
            java.lang.Object r0 = r3.next()
            ᲀᲇᛴᛵ r0 = (defpackage.C1764) r0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Found provider ["
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = "]"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            defpackage.AbstractC0901.m1868(r0)
            goto L10
        L33:
            java.lang.String r3 = "See https://www.slf4j.org/codes.html#multiple_bindings for an explanation."
            defpackage.AbstractC0901.m1868(r3)
        L38:
            return
    }

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public static void m1961() {
            ᲀᲇᛴᛵ r0 = defpackage.AbstractC1011.f4485
            monitor-enter(r0)
            ᛲᛳᲁᛴ r1 = r0.f7818     // Catch: java.lang.Throwable -> L32
            ᛲᛲᲀᛷ r1 = (defpackage.C0257) r1     // Catch: java.lang.Throwable -> L32
            r2 = 1
            r1.f1511 = r2     // Catch: java.lang.Throwable -> L32
            ᛲᛳᲁᛴ r1 = r0.f7818     // Catch: java.lang.Throwable -> L32
            ᛲᛲᲀᛷ r1 = (defpackage.C0257) r1     // Catch: java.lang.Throwable -> L32
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L32
            java.util.concurrent.ConcurrentHashMap r1 = r1.f1510     // Catch: java.lang.Throwable -> L32
            java.util.Collection r1 = r1.values()     // Catch: java.lang.Throwable -> L32
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L32
            java.util.Iterator r1 = r2.iterator()     // Catch: java.lang.Throwable -> L32
        L1d:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L32
            if (r2 == 0) goto L35
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L32
            ᲁᛱᛱᲁ r2 = (defpackage.C1792) r2     // Catch: java.lang.Throwable -> L32
            java.lang.String r3 = r2.f7880     // Catch: java.lang.Throwable -> L32
            ᛱᛸᲀᛱ r3 = m1963(r3)     // Catch: java.lang.Throwable -> L32
            r2.f7879 = r3     // Catch: java.lang.Throwable -> L32
            goto L1d
        L32:
            r1 = move-exception
            goto L103
        L35:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            ᲀᲇᛴᛵ r0 = defpackage.AbstractC1011.f4485
            ᛲᛳᲁᛴ r0 = r0.f7818
            ᛲᛲᲀᛷ r0 = (defpackage.C0257) r0
            java.util.concurrent.LinkedBlockingQueue r1 = r0.f1509
            int r2 = r1.size()
            java.util.ArrayList r3 = new java.util.ArrayList
            r4 = 128(0x80, float:1.8E-43)
            r3.<init>(r4)
            r0 = 0
        L4a:
            int r5 = r1.drainTo(r3, r4)
            if (r5 != 0) goto L61
            ᲀᲇᛴᛵ r0 = defpackage.AbstractC1011.f4485
            ᛲᛳᲁᛴ r0 = r0.f7818
            ᛲᛲᲀᛷ r0 = (defpackage.C0257) r0
            java.util.concurrent.ConcurrentHashMap r1 = r0.f1510
            r1.clear()
            java.util.concurrent.LinkedBlockingQueue r0 = r0.f1509
            r0.clear()
            return
        L61:
            java.util.Iterator r5 = r3.iterator()
        L65:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto Lfe
            java.lang.Object r6 = r5.next()
            ᛴᛶᛲᛶ r6 = (defpackage.C0686) r6
            if (r6 != 0) goto L74
            goto La6
        L74:
            ᲁᛱᛱᲁ r7 = r6.f3310
            java.lang.String r8 = r7.f7880
            ᛱᛸᲀᛱ r9 = r7.f7879
            if (r9 == 0) goto Lf8
            ᛱᛸᲀᛱ r9 = r7.f7879
            boolean r9 = r9 instanceof defpackage.C0925
            if (r9 == 0) goto L83
            goto La6
        L83:
            boolean r9 = r7.m3184()
            if (r9 == 0) goto La3
            int r8 = r6.f3309
            boolean r8 = r7.mo674(r8)
            if (r8 == 0) goto La6
            boolean r8 = r7.m3184()
            if (r8 == 0) goto La6
            java.lang.reflect.Method r8 = r7.f7881     // Catch: java.lang.Throwable -> La6
            ᛱᛸᲀᛱ r7 = r7.f7879     // Catch: java.lang.Throwable -> La6
            java.lang.Object[] r9 = new java.lang.Object[]{r6}     // Catch: java.lang.Throwable -> La6
            r8.invoke(r7, r9)     // Catch: java.lang.Throwable -> La6
            goto La6
        La3:
            defpackage.AbstractC0901.m1868(r8)
        La6:
            int r7 = r0 + 1
            if (r0 != 0) goto Lf5
            ᲁᛱᛱᲁ r0 = r6.f3310
            boolean r0 = r0.m3184()
            if (r0 == 0) goto Ld3
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r6 = "A number ("
            r0.<init>(r6)
            r0.append(r2)
            java.lang.String r6 = ") of logging calls during the initialization phase have been intercepted and are"
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            defpackage.AbstractC0901.m1868(r0)
            java.lang.String r0 = "now being replayed. These are subject to the filtering rules of the underlying logging system."
            defpackage.AbstractC0901.m1868(r0)
            java.lang.String r0 = "See also https://www.slf4j.org/codes.html#replay"
            defpackage.AbstractC0901.m1868(r0)
            goto Lf5
        Ld3:
            ᲁᛱᛱᲁ r0 = r6.f3310
            ᛱᛸᲀᛱ r0 = r0.f7879
            boolean r0 = r0 instanceof defpackage.C0925
            if (r0 == 0) goto Ldc
            goto Lf5
        Ldc:
            java.lang.String r0 = "The following set of substitute loggers may have been accessed"
            defpackage.AbstractC0901.m1868(r0)
            java.lang.String r0 = "during the initialization phase. Logging calls during this"
            defpackage.AbstractC0901.m1868(r0)
            java.lang.String r0 = "phase were not honored. However, subsequent logging calls to these"
            defpackage.AbstractC0901.m1868(r0)
            java.lang.String r0 = "loggers will work as normally expected."
            defpackage.AbstractC0901.m1868(r0)
            java.lang.String r0 = "See also https://www.slf4j.org/codes.html#substituteLogger"
            defpackage.AbstractC0901.m1868(r0)
        Lf5:
            r0 = r7
            goto L65
        Lf8:
            java.lang.String r0 = "Delegate logger cannot be null at this state."
            defpackage.C2264.m3676(r0)
            return
        Lfe:
            r3.clear()
            goto L4a
        L103:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            throw r1
    }

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public static final void m1962() {
            java.util.ArrayList r0 = m1964()     // Catch: java.lang.Exception -> Lc8
            m1960(r0)     // Catch: java.lang.Exception -> Lc8
            boolean r1 = r0.isEmpty()     // Catch: java.lang.Exception -> Lc8
            r2 = 3
            r3 = 0
            if (r1 != 0) goto L27
            java.lang.Object r1 = r0.get(r3)     // Catch: java.lang.Exception -> Lc8
            ᲀᲇᛴᛵ r1 = (defpackage.C1764) r1     // Catch: java.lang.Exception -> Lc8
            defpackage.AbstractC1011.f4481 = r1     // Catch: java.lang.Exception -> Lc8
            ᲀᲇᛴᛵ r1 = defpackage.AbstractC1011.f4481     // Catch: java.lang.Exception -> Lc8
            r1.getClass()     // Catch: java.lang.Exception -> Lc8
            ᲀᲇᛴᛵ r1 = defpackage.AbstractC1011.f4481     // Catch: java.lang.Exception -> Lc8
            r1.getClass()     // Catch: java.lang.Exception -> Lc8
            defpackage.AbstractC1011.f4484 = r2     // Catch: java.lang.Exception -> Lc8
            m1966(r0)     // Catch: java.lang.Exception -> Lc8
            goto L6b
        L27:
            r0 = 4
            defpackage.AbstractC1011.f4484 = r0     // Catch: java.lang.Exception -> Lc8
            java.lang.String r0 = "No SLF4J providers were found."
            defpackage.AbstractC0901.m1868(r0)     // Catch: java.lang.Exception -> Lc8
            java.lang.String r0 = "Defaulting to no-operation (NOP) logger implementation"
            defpackage.AbstractC0901.m1868(r0)     // Catch: java.lang.Exception -> Lc8
            java.lang.String r0 = "See https://www.slf4j.org/codes.html#noProviders for further details."
            defpackage.AbstractC0901.m1868(r0)     // Catch: java.lang.Exception -> Lc8
            java.lang.String r0 = "org/slf4j/impl/StaticLoggerBinder.class"
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet     // Catch: java.lang.Exception -> Lc8
            r1.<init>()     // Catch: java.lang.Exception -> Lc8
            java.lang.Class<ᛶᛱᛶᛷ> r4 = defpackage.AbstractC1011.class
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
            defpackage.AbstractC0901.m1869(r4, r0)     // Catch: java.lang.Exception -> Lc8
        L68:
            m1967(r1)     // Catch: java.lang.Exception -> Lc8
        L6b:
            m1961()     // Catch: java.lang.Exception -> Lc8
            int r0 = defpackage.AbstractC1011.f4484
            if (r0 != r2) goto Lc7
            ᲀᲇᛴᛵ r0 = defpackage.AbstractC1011.f4481     // Catch: java.lang.Throwable -> Lc1
            int r0 = r0.f7817     // Catch: java.lang.Throwable -> Lc1
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
            java.lang.String[] r1 = defpackage.AbstractC1011.f4486     // Catch: java.lang.Throwable -> Lc1
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
            java.lang.String[] r0 = defpackage.AbstractC1011.f4486     // Catch: java.lang.Throwable -> Lc1
            java.util.List r0 = java.util.Arrays.asList(r0)     // Catch: java.lang.Throwable -> Lc1
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> Lc1
            r1.append(r0)     // Catch: java.lang.Throwable -> Lc1
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> Lc1
            defpackage.AbstractC0901.m1868(r0)     // Catch: java.lang.Throwable -> Lc1
            java.lang.String r0 = "See https://www.slf4j.org/codes.html#version_mismatch for further details."
            defpackage.AbstractC0901.m1868(r0)     // Catch: java.lang.Throwable -> Lc1
            goto Lc7
        Lc1:
            r0 = move-exception
            java.lang.String r1 = "Unexpected problem occurred during version sanity check"
            defpackage.AbstractC0901.m1869(r1, r0)
        Lc7:
            return
        Lc8:
            r0 = move-exception
            r1 = 2
            defpackage.AbstractC1011.f4484 = r1
            java.lang.String r1 = "Failed to instantiate SLF4J LoggerFactory"
            defpackage.AbstractC0901.m1869(r1, r0)
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Unexpected initialization failure"
            r1.<init>(r2, r0)
            throw r1
    }

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public static defpackage.InterfaceC0150 m1963(java.lang.String r3) {
            int r0 = defpackage.AbstractC1011.f4484
            r1 = 1
            if (r0 != 0) goto L18
            java.lang.Class<ᛶᛱᛶᛷ> r0 = defpackage.AbstractC1011.class
            monitor-enter(r0)
            int r2 = defpackage.AbstractC1011.f4484     // Catch: java.lang.Throwable -> L12
            if (r2 != 0) goto L14
            defpackage.AbstractC1011.f4484 = r1     // Catch: java.lang.Throwable -> L12
            m1962()     // Catch: java.lang.Throwable -> L12
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
            int r0 = defpackage.AbstractC1011.f4484
            if (r0 == r1) goto L38
            r1 = 2
            r2 = 0
            if (r0 == r1) goto L32
            r1 = 3
            if (r0 == r1) goto L2f
            r1 = 4
            if (r0 != r1) goto L29
            ᲀᲇᛴᛵ r0 = defpackage.AbstractC1011.f4483
            goto L3a
        L29:
            java.lang.String r3 = "Unreachable code"
            defpackage.C2264.m3676(r3)
            return r2
        L2f:
            ᲀᲇᛴᛵ r0 = defpackage.AbstractC1011.f4481
            goto L3a
        L32:
            java.lang.String r3 = "org.slf4j.LoggerFactory in failed state. Original exception was thrown EARLIER. See also https://www.slf4j.org/codes.html#unsuccessfulInit"
            defpackage.C2264.m3676(r3)
            return r2
        L38:
            ᲀᲇᛴᛵ r0 = defpackage.AbstractC1011.f4485
        L3a:
            int r1 = r0.f7817
            switch(r1) {
                case 0: goto L44;
                default: goto L3f;
            }
        L3f:
            ᛲᛳᲁᛴ r0 = r0.f7818
            ᛲᛲᲀᛷ r0 = (defpackage.C0257) r0
            goto L48
        L44:
            ᛲᛳᲁᛴ r0 = r0.f7818
            ᲈᛴᛵᲈ r0 = (defpackage.C2223) r0
        L48:
            ᛱᛸᲀᛱ r3 = r0.mo884(r3)
            return r3
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static java.util.ArrayList m1964() {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.Class<ᛶᛱᛶᛷ> r1 = defpackage.AbstractC1011.class
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
            int r3 = defpackage.AbstractC0901.f4103     // Catch: java.lang.ClassCastException -> L5a java.lang.Throwable -> L5c
            r3 = 2
            int r3 = defpackage.AbstractC0225.m812(r3)     // Catch: java.lang.ClassCastException -> L5a java.lang.Throwable -> L5c
            int r6 = defpackage.AbstractC0901.f4104     // Catch: java.lang.ClassCastException -> L5a java.lang.Throwable -> L5c
            int r6 = defpackage.AbstractC0225.m812(r6)     // Catch: java.lang.ClassCastException -> L5a java.lang.Throwable -> L5c
            if (r3 < r6) goto L4a
            java.io.PrintStream r3 = defpackage.AbstractC0901.m1870()     // Catch: java.lang.ClassCastException -> L5a java.lang.Throwable -> L5c
            java.lang.String r6 = "SLF4J(I): "
            java.lang.String r2 = r6.concat(r2)     // Catch: java.lang.ClassCastException -> L5a java.lang.Throwable -> L5c
            r3.println(r2)     // Catch: java.lang.ClassCastException -> L5a java.lang.Throwable -> L5c
        L4a:
            java.lang.Class r2 = r1.loadClass(r4)     // Catch: java.lang.ClassCastException -> L5a java.lang.Throwable -> L5c
            java.lang.reflect.Constructor r2 = r2.getConstructor(r5)     // Catch: java.lang.ClassCastException -> L5a java.lang.Throwable -> L5c
            java.lang.Object r2 = r2.newInstance(r5)     // Catch: java.lang.ClassCastException -> L5a java.lang.Throwable -> L5c
            ᲀᲇᛴᛵ r2 = (defpackage.C1764) r2     // Catch: java.lang.ClassCastException -> L5a java.lang.Throwable -> L5c
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
            defpackage.AbstractC0901.m1869(r3, r2)
            goto L8b
        L75:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r6 = "Failed to instantiate the specified SLF4JServiceProvider ("
            r3.<init>(r6)
            r3.append(r4)
            java.lang.String r4 = ")"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            defpackage.AbstractC0901.m1869(r3, r2)
        L8b:
            if (r5 == 0) goto L91
            r0.add(r5)
            return r0
        L91:
            java.lang.SecurityManager r2 = java.lang.System.getSecurityManager()
            if (r2 != 0) goto L9e
            java.lang.Class<ᲀᲇᛴᛵ> r2 = defpackage.C1764.class
            java.util.ServiceLoader r1 = java.util.ServiceLoader.load(r2, r1)
            goto La9
        L9e:
            ᲀᲇᲇᲁ r2 = new ᲀᲇᲇᲁ
            r2.<init>(r1)
            java.lang.Object r1 = java.security.AccessController.doPrivileged(r2)
            java.util.ServiceLoader r1 = (java.util.ServiceLoader) r1
        La9:
            java.util.Iterator r1 = r1.iterator()
        Lad:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto Lde
            java.lang.Object r2 = r1.next()     // Catch: java.util.ServiceConfigurationError -> Lbd
            ᲀᲇᛴᛵ r2 = (defpackage.C1764) r2     // Catch: java.util.ServiceConfigurationError -> Lbd
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
            java.io.PrintStream r3 = defpackage.AbstractC0901.m1870()
            java.lang.String r4 = "SLF4J(E): "
            java.lang.String r2 = r4.concat(r2)
            r3.println(r2)
            goto Lad
        Lde:
            return r0
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public static defpackage.InterfaceC0150 m1965(java.lang.Class r6) {
            java.lang.String r0 = r6.getName()
            ᛱᛸᲀᛱ r0 = m1963(r0)
            boolean r1 = defpackage.AbstractC1011.f4482
            if (r1 == 0) goto L89
            ᲁᲁᲇᛳ r1 = defpackage.AbstractC1849.f8083
            r2 = 0
            if (r1 == 0) goto L12
            goto L24
        L12:
            boolean r1 = defpackage.AbstractC1849.f8084
            if (r1 == 0) goto L18
            r1 = r2
            goto L24
        L18:
            ᲁᲁᲇᛳ r1 = new ᲁᲁᲇᛳ     // Catch: java.lang.SecurityException -> L1e
            r1.<init>()     // Catch: java.lang.SecurityException -> L1e
            goto L1f
        L1e:
            r1 = r2
        L1f:
            defpackage.AbstractC1849.f8083 = r1
            r3 = 1
            defpackage.AbstractC1849.f8084 = r3
        L24:
            if (r1 != 0) goto L27
            goto L4f
        L27:
            java.lang.Class[] r1 = r1.getClassContext()
            java.lang.Class<ᲁᛴᲀᛶ> r3 = defpackage.AbstractC1849.class
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
            defpackage.AbstractC0901.m1868(r6)
            java.lang.String r6 = "See https://www.slf4j.org/codes.html#loggerNameMismatch for an explanation"
            defpackage.AbstractC0901.m1868(r6)
            goto L89
        L83:
            java.lang.String r6 = "Failed to find org.slf4j.helpers.Util or its caller in the stack; this should not happen"
            defpackage.C2264.m3676(r6)
            return r2
        L89:
            return r0
    }

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public static void m1966(java.util.ArrayList r4) {
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
            int r0 = defpackage.AbstractC0901.f4103
            r0 = 2
            int r0 = defpackage.AbstractC0225.m812(r0)
            int r1 = defpackage.AbstractC0901.f4104
            int r1 = defpackage.AbstractC0225.m812(r1)
            if (r0 < r1) goto L41
            java.io.PrintStream r0 = defpackage.AbstractC0901.m1870()
            java.lang.String r1 = "SLF4J(I): "
            java.lang.String r4 = r1.concat(r4)
            r0.println(r4)
        L41:
            return
        L42:
            java.lang.Object r4 = r4.get(r3)
            ᲀᲇᛴᛵ r4 = (defpackage.C1764) r4
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "Connected with provider of type ["
            r0.<init>(r3)
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = r4.getName()
            r0.append(r4)
            r0.append(r2)
            java.lang.String r4 = r0.toString()
            int r0 = defpackage.AbstractC0901.f4103
            int r0 = defpackage.AbstractC0225.m812(r1)
            int r1 = defpackage.AbstractC0901.f4104
            int r1 = defpackage.AbstractC0225.m812(r1)
            if (r0 < r1) goto L7c
            java.io.PrintStream r0 = defpackage.AbstractC0901.m1870()
            java.lang.String r1 = "SLF4J(D): "
            java.lang.String r4 = r1.concat(r4)
            r0.println(r4)
        L7c:
            return
        L7d:
            java.lang.String r4 = "No providers were found which is impossible after successful initialization."
            defpackage.C2264.m3676(r4)
            return
    }

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public static void m1967(java.util.LinkedHashSet r3) {
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L7
            return
        L7:
            java.lang.String r0 = "Class path contains SLF4J bindings targeting slf4j-api versions 1.7.x or earlier."
            defpackage.AbstractC0901.m1868(r0)
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
            defpackage.AbstractC0901.m1868(r0)
            goto L10
        L33:
            java.lang.String r3 = "See https://www.slf4j.org/codes.html#ignoredBindings for an explanation."
            defpackage.AbstractC0901.m1868(r3)
            return
    }
}
