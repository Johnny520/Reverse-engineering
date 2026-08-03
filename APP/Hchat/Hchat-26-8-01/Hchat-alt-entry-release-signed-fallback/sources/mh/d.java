package mh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile int f8894a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final oh.c f8895b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final oh.c f8896c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f8897d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile oh.c f8898e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final java.lang.String[] f8899f = null;

    static {
            oh.c r0 = new oh.c
            r1 = 1
            r0.<init>(r1)
            mh.d.f8895b = r0
            oh.c r0 = new oh.c
            r1 = 0
            r0.<init>(r1)
            mh.d.f8896c = r0
            java.lang.String r0 = "slf4j.detectLoggerNameMismatch"
            java.lang.String r0 = java.lang.System.getProperty(r0)     // Catch: java.lang.SecurityException -> L17
            goto L18
        L17:
            r0 = 0
        L18:
            if (r0 != 0) goto L1c
            r0 = 0
            goto L22
        L1c:
            java.lang.String r1 = "true"
            boolean r0 = r0.equalsIgnoreCase(r1)
        L22:
            mh.d.f8897d = r0
            java.lang.String r0 = "2.0"
            java.lang.String[] r0 = new java.lang.String[]{r0}
            mh.d.f8899f = r0
            return
    }

    public static java.util.ArrayList a() {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.Class<mh.d> r1 = mh.d.class
            java.lang.ClassLoader r1 = r1.getClassLoader()
            java.lang.String r2 = "\" specified via \"slf4j.provider\" system property"
            java.lang.String r3 = "Attempting to load provider \""
            java.lang.String r4 = "slf4j.provider"
            java.lang.String r4 = java.lang.System.getProperty(r4)
            r5 = 0
            if (r4 == 0) goto L94
            boolean r6 = r4.isEmpty()
            if (r6 == 0) goto L20
            goto L94
        L20:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.ClassCastException -> L5b java.lang.reflect.InvocationTargetException -> L5d java.lang.IllegalAccessException -> L5f java.lang.InstantiationException -> L61 java.lang.NoSuchMethodException -> L63 java.lang.ClassNotFoundException -> L65
            r6.<init>(r3)     // Catch: java.lang.ClassCastException -> L5b java.lang.reflect.InvocationTargetException -> L5d java.lang.IllegalAccessException -> L5f java.lang.InstantiationException -> L61 java.lang.NoSuchMethodException -> L63 java.lang.ClassNotFoundException -> L65
            r6.append(r4)     // Catch: java.lang.ClassCastException -> L5b java.lang.reflect.InvocationTargetException -> L5d java.lang.IllegalAccessException -> L5f java.lang.InstantiationException -> L61 java.lang.NoSuchMethodException -> L63 java.lang.ClassNotFoundException -> L65
            r6.append(r2)     // Catch: java.lang.ClassCastException -> L5b java.lang.reflect.InvocationTargetException -> L5d java.lang.IllegalAccessException -> L5f java.lang.InstantiationException -> L61 java.lang.NoSuchMethodException -> L63 java.lang.ClassNotFoundException -> L65
            java.lang.String r2 = r6.toString()     // Catch: java.lang.ClassCastException -> L5b java.lang.reflect.InvocationTargetException -> L5d java.lang.IllegalAccessException -> L5f java.lang.InstantiationException -> L61 java.lang.NoSuchMethodException -> L63 java.lang.ClassNotFoundException -> L65
            int r3 = oh.d.f9843a     // Catch: java.lang.ClassCastException -> L5b java.lang.reflect.InvocationTargetException -> L5d java.lang.IllegalAccessException -> L5f java.lang.InstantiationException -> L61 java.lang.NoSuchMethodException -> L63 java.lang.ClassNotFoundException -> L65
            r3 = 2
            int r3 = t3.c.b(r3)     // Catch: java.lang.ClassCastException -> L5b java.lang.reflect.InvocationTargetException -> L5d java.lang.IllegalAccessException -> L5f java.lang.InstantiationException -> L61 java.lang.NoSuchMethodException -> L63 java.lang.ClassNotFoundException -> L65
            int r6 = oh.d.f9844b     // Catch: java.lang.ClassCastException -> L5b java.lang.reflect.InvocationTargetException -> L5d java.lang.IllegalAccessException -> L5f java.lang.InstantiationException -> L61 java.lang.NoSuchMethodException -> L63 java.lang.ClassNotFoundException -> L65
            int r6 = t3.c.b(r6)     // Catch: java.lang.ClassCastException -> L5b java.lang.reflect.InvocationTargetException -> L5d java.lang.IllegalAccessException -> L5f java.lang.InstantiationException -> L61 java.lang.NoSuchMethodException -> L63 java.lang.ClassNotFoundException -> L65
            if (r3 < r6) goto L4b
            java.io.PrintStream r3 = oh.d.b()     // Catch: java.lang.ClassCastException -> L5b java.lang.reflect.InvocationTargetException -> L5d java.lang.IllegalAccessException -> L5f java.lang.InstantiationException -> L61 java.lang.NoSuchMethodException -> L63 java.lang.ClassNotFoundException -> L65
            java.lang.String r6 = "SLF4J(I): "
            java.lang.String r2 = r6.concat(r2)     // Catch: java.lang.ClassCastException -> L5b java.lang.reflect.InvocationTargetException -> L5d java.lang.IllegalAccessException -> L5f java.lang.InstantiationException -> L61 java.lang.NoSuchMethodException -> L63 java.lang.ClassNotFoundException -> L65
            r3.println(r2)     // Catch: java.lang.ClassCastException -> L5b java.lang.reflect.InvocationTargetException -> L5d java.lang.IllegalAccessException -> L5f java.lang.InstantiationException -> L61 java.lang.NoSuchMethodException -> L63 java.lang.ClassNotFoundException -> L65
        L4b:
            java.lang.Class r2 = r1.loadClass(r4)     // Catch: java.lang.ClassCastException -> L5b java.lang.reflect.InvocationTargetException -> L5d java.lang.IllegalAccessException -> L5f java.lang.InstantiationException -> L61 java.lang.NoSuchMethodException -> L63 java.lang.ClassNotFoundException -> L65
            java.lang.reflect.Constructor r2 = r2.getConstructor(r5)     // Catch: java.lang.ClassCastException -> L5b java.lang.reflect.InvocationTargetException -> L5d java.lang.IllegalAccessException -> L5f java.lang.InstantiationException -> L61 java.lang.NoSuchMethodException -> L63 java.lang.ClassNotFoundException -> L65
            java.lang.Object r2 = r2.newInstance(r5)     // Catch: java.lang.ClassCastException -> L5b java.lang.reflect.InvocationTargetException -> L5d java.lang.IllegalAccessException -> L5f java.lang.InstantiationException -> L61 java.lang.NoSuchMethodException -> L63 java.lang.ClassNotFoundException -> L65
            oh.c r2 = (oh.c) r2     // Catch: java.lang.ClassCastException -> L5b java.lang.reflect.InvocationTargetException -> L5d java.lang.IllegalAccessException -> L5f java.lang.InstantiationException -> L61 java.lang.NoSuchMethodException -> L63 java.lang.ClassNotFoundException -> L65
            r5 = r2
            goto L94
        L5b:
            r2 = move-exception
            goto L67
        L5d:
            r2 = move-exception
            goto L7e
        L5f:
            r2 = move-exception
            goto L7e
        L61:
            r2 = move-exception
            goto L7e
        L63:
            r2 = move-exception
            goto L7e
        L65:
            r2 = move-exception
            goto L7e
        L67:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r6 = "Specified SLF4JServiceProvider ("
            r3.<init>(r6)
            r3.append(r4)
            java.lang.String r4 = ") does not implement SLF4JServiceProvider interface"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            oh.d.a(r3, r2)
            goto L94
        L7e:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r6 = "Failed to instantiate the specified SLF4JServiceProvider ("
            r3.<init>(r6)
            r3.append(r4)
            java.lang.String r4 = ")"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            oh.d.a(r3, r2)
        L94:
            if (r5 == 0) goto L9a
            r0.add(r5)
            return r0
        L9a:
            java.lang.SecurityManager r2 = java.lang.System.getSecurityManager()
            if (r2 != 0) goto La7
            java.lang.Class<oh.c> r2 = oh.c.class
            java.util.ServiceLoader r1 = java.util.ServiceLoader.load(r2, r1)
            goto Lb2
        La7:
            mh.c r2 = new mh.c
            r2.<init>(r1)
            java.lang.Object r1 = java.security.AccessController.doPrivileged(r2)
            java.util.ServiceLoader r1 = (java.util.ServiceLoader) r1
        Lb2:
            java.util.Iterator r1 = r1.iterator()
        Lb6:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto Le7
            java.lang.Object r2 = r1.next()     // Catch: java.util.ServiceConfigurationError -> Lc6
            oh.c r2 = (oh.c) r2     // Catch: java.util.ServiceConfigurationError -> Lc6
            r0.add(r2)     // Catch: java.util.ServiceConfigurationError -> Lc6
            goto Lb6
        Lc6:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "A service provider failed to instantiate:\n"
            r3.<init>(r4)
            java.lang.String r2 = r2.getMessage()
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            java.io.PrintStream r3 = oh.d.b()
            java.lang.String r4 = "SLF4J(E): "
            java.lang.String r2 = r4.concat(r2)
            r3.println(r2)
            goto Lb6
        Le7:
            return r0
    }

    public static mh.b b(java.lang.Class r5) {
            java.lang.String r0 = r5.getName()
            mh.b r0 = c(r0)
            boolean r1 = mh.d.f8897d
            if (r1 == 0) goto L8a
            oh.g r1 = oh.h.f9855a
            r2 = 0
            if (r1 == 0) goto L12
            goto L24
        L12:
            boolean r1 = oh.h.f9856b
            if (r1 == 0) goto L18
            r1 = r2
            goto L24
        L18:
            oh.g r1 = new oh.g     // Catch: java.lang.SecurityException -> L1e
            r1.<init>()     // Catch: java.lang.SecurityException -> L1e
            goto L1f
        L1e:
            r1 = r2
        L1f:
            oh.h.f9855a = r1
            r3 = 1
            oh.h.f9856b = r3
        L24:
            if (r1 != 0) goto L27
            goto L4f
        L27:
            java.lang.Class[] r1 = r1.getClassContext()
            java.lang.Class<oh.h> r2 = oh.h.class
            java.lang.String r2 = r2.getName()
            r3 = 0
        L32:
            int r4 = r1.length
            if (r3 >= r4) goto L45
            r4 = r1[r3]
            java.lang.String r4 = r4.getName()
            boolean r4 = r2.equals(r4)
            if (r4 == 0) goto L42
            goto L45
        L42:
            int r3 = r3 + 1
            goto L32
        L45:
            int r2 = r1.length
            if (r3 >= r2) goto L83
            int r3 = r3 + 2
            int r2 = r1.length
            if (r3 >= r2) goto L83
            r2 = r1[r3]
        L4f:
            if (r2 == 0) goto L8a
            boolean r5 = r2.isAssignableFrom(r5)
            if (r5 != 0) goto L8a
            java.lang.String r5 = r0.getName()
            java.lang.String r1 = r2.getName()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Detected logger name mismatch. Given name: \""
            r2.<init>(r3)
            r2.append(r5)
            java.lang.String r5 = "\"; computed name: \""
            r2.append(r5)
            r2.append(r1)
            java.lang.String r5 = "\"."
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            oh.d.c(r5)
            java.lang.String r5 = "See https://www.slf4j.org/codes.html#loggerNameMismatch for an explanation"
            oh.d.c(r5)
            goto L8a
        L83:
            java.lang.String r5 = "Failed to find org.slf4j.helpers.Util or its caller in the stack; this should not happen"
            j8.o.A(r5)
            r5 = 0
            return r5
        L8a:
            return r0
    }

    public static mh.b c(java.lang.String r3) {
            int r0 = mh.d.f8894a
            r1 = 1
            if (r0 != 0) goto L18
            java.lang.Class<mh.d> r0 = mh.d.class
            monitor-enter(r0)
            int r2 = mh.d.f8894a     // Catch: java.lang.Throwable -> L12
            if (r2 != 0) goto L14
            mh.d.f8894a = r1     // Catch: java.lang.Throwable -> L12
            d()     // Catch: java.lang.Throwable -> L12
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
            int r0 = mh.d.f8894a
            if (r0 == r1) goto L38
            r1 = 2
            if (r0 == r1) goto L32
            r1 = 3
            if (r0 == r1) goto L2f
            r1 = 4
            if (r0 != r1) goto L28
            oh.c r0 = mh.d.f8896c
            goto L3a
        L28:
            java.lang.String r3 = "Unreachable code"
            j8.o.A(r3)
        L2d:
            r3 = 0
            return r3
        L2f:
            oh.c r0 = mh.d.f8898e
            goto L3a
        L32:
            java.lang.String r3 = "org.slf4j.LoggerFactory in failed state. Original exception was thrown EARLIER. See also https://www.slf4j.org/codes.html#unsuccessfulInit"
            j8.o.A(r3)
            goto L2d
        L38:
            oh.c r0 = mh.d.f8895b
        L3a:
            int r1 = r0.f9841a
            switch(r1) {
                case 0: goto L44;
                default: goto L3f;
            }
        L3f:
            mh.a r0 = r0.f9842b
            oh.f r0 = (oh.f) r0
            goto L48
        L44:
            mh.a r0 = r0.f9842b
            l3.w r0 = (l3.w) r0
        L48:
            mh.b r3 = r0.d(r3)
            return r3
    }

    public static final void d() {
            java.util.ArrayList r0 = a()     // Catch: java.lang.Exception -> Lc8
            h(r0)     // Catch: java.lang.Exception -> Lc8
            boolean r1 = r0.isEmpty()     // Catch: java.lang.Exception -> Lc8
            r2 = 3
            r3 = 0
            if (r1 != 0) goto L27
            java.lang.Object r1 = r0.get(r3)     // Catch: java.lang.Exception -> Lc8
            oh.c r1 = (oh.c) r1     // Catch: java.lang.Exception -> Lc8
            mh.d.f8898e = r1     // Catch: java.lang.Exception -> Lc8
            oh.c r1 = mh.d.f8898e     // Catch: java.lang.Exception -> Lc8
            r1.getClass()     // Catch: java.lang.Exception -> Lc8
            oh.c r1 = mh.d.f8898e     // Catch: java.lang.Exception -> Lc8
            r1.getClass()     // Catch: java.lang.Exception -> Lc8
            mh.d.f8894a = r2     // Catch: java.lang.Exception -> Lc8
            f(r0)     // Catch: java.lang.Exception -> Lc8
            goto L6b
        L27:
            r0 = 4
            mh.d.f8894a = r0     // Catch: java.lang.Exception -> Lc8
            java.lang.String r0 = "No SLF4J providers were found."
            oh.d.c(r0)     // Catch: java.lang.Exception -> Lc8
            java.lang.String r0 = "Defaulting to no-operation (NOP) logger implementation"
            oh.d.c(r0)     // Catch: java.lang.Exception -> Lc8
            java.lang.String r0 = "See https://www.slf4j.org/codes.html#noProviders for further details."
            oh.d.c(r0)     // Catch: java.lang.Exception -> Lc8
            java.lang.String r0 = "org/slf4j/impl/StaticLoggerBinder.class"
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet     // Catch: java.lang.Exception -> Lc8
            r1.<init>()     // Catch: java.lang.Exception -> Lc8
            java.lang.Class<mh.d> r4 = mh.d.class
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
            oh.d.a(r4, r0)     // Catch: java.lang.Exception -> Lc8
        L68:
            g(r1)     // Catch: java.lang.Exception -> Lc8
        L6b:
            e()     // Catch: java.lang.Exception -> Lc8
            int r0 = mh.d.f8894a
            if (r0 != r2) goto Lc7
            oh.c r0 = mh.d.f8898e     // Catch: java.lang.Throwable -> Lc1
            int r0 = r0.f9841a     // Catch: java.lang.Throwable -> Lc1
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
            java.lang.String[] r1 = mh.d.f8899f     // Catch: java.lang.Throwable -> Lc1
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
            java.lang.String[] r0 = mh.d.f8899f     // Catch: java.lang.Throwable -> Lc1
            java.util.List r0 = java.util.Arrays.asList(r0)     // Catch: java.lang.Throwable -> Lc1
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> Lc1
            r1.append(r0)     // Catch: java.lang.Throwable -> Lc1
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> Lc1
            oh.d.c(r0)     // Catch: java.lang.Throwable -> Lc1
            java.lang.String r0 = "See https://www.slf4j.org/codes.html#version_mismatch for further details."
            oh.d.c(r0)     // Catch: java.lang.Throwable -> Lc1
            goto Lc7
        Lc1:
            r0 = move-exception
            java.lang.String r1 = "Unexpected problem occurred during version sanity check"
            oh.d.a(r1, r0)
        Lc7:
            return
        Lc8:
            r0 = move-exception
            r1 = 2
            mh.d.f8894a = r1
            java.lang.String r1 = "Failed to instantiate SLF4J LoggerFactory"
            oh.d.a(r1, r0)
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Unexpected initialization failure"
            r1.<init>(r2, r0)
            throw r1
    }

    public static void e() {
            oh.c r0 = mh.d.f8895b
            monitor-enter(r0)
            mh.a r1 = r0.f9842b     // Catch: java.lang.Throwable -> L35
            oh.f r1 = (oh.f) r1     // Catch: java.lang.Throwable -> L35
            r2 = 1
            r1.f9852g = r2     // Catch: java.lang.Throwable -> L35
            mh.a r1 = r0.f9842b     // Catch: java.lang.Throwable -> L35
            oh.f r1 = (oh.f) r1     // Catch: java.lang.Throwable -> L35
            r1.getClass()     // Catch: java.lang.Throwable -> L35
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L35
            java.util.concurrent.ConcurrentHashMap r1 = r1.f9853h     // Catch: java.lang.Throwable -> L35
            java.util.Collection r1 = r1.values()     // Catch: java.lang.Throwable -> L35
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L35
            java.util.Iterator r1 = r2.iterator()     // Catch: java.lang.Throwable -> L35
        L20:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L35
            if (r2 == 0) goto L38
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L35
            oh.e r2 = (oh.e) r2     // Catch: java.lang.Throwable -> L35
            java.lang.String r3 = r2.f9845g     // Catch: java.lang.Throwable -> L35
            mh.b r3 = c(r3)     // Catch: java.lang.Throwable -> L35
            r2.f9846h = r3     // Catch: java.lang.Throwable -> L35
            goto L20
        L35:
            r1 = move-exception
            goto L106
        L38:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L35
            oh.c r0 = mh.d.f8895b
            mh.a r0 = r0.f9842b
            oh.f r0 = (oh.f) r0
            java.util.concurrent.LinkedBlockingQueue r1 = r0.f9854i
            int r2 = r1.size()
            java.util.ArrayList r3 = new java.util.ArrayList
            r4 = 128(0x80, float:1.8E-43)
            r3.<init>(r4)
            r0 = 0
        L4d:
            int r5 = r1.drainTo(r3, r4)
            if (r5 != 0) goto L64
            oh.c r0 = mh.d.f8895b
            mh.a r0 = r0.f9842b
            oh.f r0 = (oh.f) r0
            java.util.concurrent.ConcurrentHashMap r1 = r0.f9853h
            r1.clear()
            java.util.concurrent.LinkedBlockingQueue r0 = r0.f9854i
            r0.clear()
            return
        L64:
            java.util.Iterator r5 = r3.iterator()
        L68:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L101
            java.lang.Object r6 = r5.next()
            nh.b r6 = (nh.b) r6
            if (r6 != 0) goto L77
            goto La9
        L77:
            oh.e r7 = r6.f9465b
            java.lang.String r8 = r7.f9845g
            mh.b r9 = r7.f9846h
            if (r9 == 0) goto Lfb
            mh.b r9 = r7.f9846h
            boolean r9 = r9 instanceof oh.b
            if (r9 == 0) goto L86
            goto La9
        L86:
            boolean r9 = r7.B()
            if (r9 == 0) goto La6
            int r8 = r6.f9464a
            boolean r8 = r7.w(r8)
            if (r8 == 0) goto La9
            boolean r8 = r7.B()
            if (r8 == 0) goto La9
            java.lang.reflect.Method r8 = r7.f9848j     // Catch: java.lang.Throwable -> La9
            mh.b r7 = r7.f9846h     // Catch: java.lang.Throwable -> La9
            java.lang.Object[] r9 = new java.lang.Object[]{r6}     // Catch: java.lang.Throwable -> La9
            r8.invoke(r7, r9)     // Catch: java.lang.Throwable -> La9
            goto La9
        La6:
            oh.d.c(r8)
        La9:
            int r7 = r0 + 1
            if (r0 != 0) goto Lf8
            oh.e r0 = r6.f9465b
            boolean r0 = r0.B()
            if (r0 == 0) goto Ld6
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r6 = "A number ("
            r0.<init>(r6)
            r0.append(r2)
            java.lang.String r6 = ") of logging calls during the initialization phase have been intercepted and are"
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            oh.d.c(r0)
            java.lang.String r0 = "now being replayed. These are subject to the filtering rules of the underlying logging system."
            oh.d.c(r0)
            java.lang.String r0 = "See also https://www.slf4j.org/codes.html#replay"
            oh.d.c(r0)
            goto Lf8
        Ld6:
            oh.e r0 = r6.f9465b
            mh.b r0 = r0.f9846h
            boolean r0 = r0 instanceof oh.b
            if (r0 == 0) goto Ldf
            goto Lf8
        Ldf:
            java.lang.String r0 = "The following set of substitute loggers may have been accessed"
            oh.d.c(r0)
            java.lang.String r0 = "during the initialization phase. Logging calls during this"
            oh.d.c(r0)
            java.lang.String r0 = "phase were not honored. However, subsequent logging calls to these"
            oh.d.c(r0)
            java.lang.String r0 = "loggers will work as normally expected."
            oh.d.c(r0)
            java.lang.String r0 = "See also https://www.slf4j.org/codes.html#substituteLogger"
            oh.d.c(r0)
        Lf8:
            r0 = r7
            goto L68
        Lfb:
            java.lang.String r0 = "Delegate logger cannot be null at this state."
            j8.o.A(r0)
            return
        L101:
            r3.clear()
            goto L4d
        L106:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L35
            throw r1
    }

    public static void f(java.util.ArrayList r4) {
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
            int r0 = oh.d.f9843a
            r0 = 2
            int r0 = t3.c.b(r0)
            int r1 = oh.d.f9844b
            int r1 = t3.c.b(r1)
            if (r0 < r1) goto L41
            java.io.PrintStream r0 = oh.d.b()
            java.lang.String r1 = "SLF4J(I): "
            java.lang.String r4 = r1.concat(r4)
            r0.println(r4)
        L41:
            return
        L42:
            java.lang.Object r4 = r4.get(r3)
            oh.c r4 = (oh.c) r4
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "Connected with provider of type ["
            r0.<init>(r3)
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = r4.getName()
            r0.append(r4)
            r0.append(r2)
            java.lang.String r4 = r0.toString()
            int r0 = oh.d.f9843a
            int r0 = t3.c.b(r1)
            int r1 = oh.d.f9844b
            int r1 = t3.c.b(r1)
            if (r0 < r1) goto L7c
            java.io.PrintStream r0 = oh.d.b()
            java.lang.String r1 = "SLF4J(D): "
            java.lang.String r4 = r1.concat(r4)
            r0.println(r4)
        L7c:
            return
        L7d:
            java.lang.String r4 = "No providers were found which is impossible after successful initialization."
            j8.o.A(r4)
            return
    }

    public static void g(java.util.LinkedHashSet r3) {
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L7
            return
        L7:
            java.lang.String r0 = "Class path contains SLF4J bindings targeting slf4j-api versions 1.7.x or earlier."
            oh.d.c(r0)
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
            oh.d.c(r0)
            goto L10
        L33:
            java.lang.String r3 = "See https://www.slf4j.org/codes.html#ignoredBindings for an explanation."
            oh.d.c(r3)
            return
    }

    public static void h(java.util.ArrayList r3) {
            int r0 = r3.size()
            r1 = 1
            if (r0 <= r1) goto L38
            java.lang.String r0 = "Class path contains multiple SLF4J providers."
            oh.d.c(r0)
            java.util.Iterator r3 = r3.iterator()
        L10:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L33
            java.lang.Object r0 = r3.next()
            oh.c r0 = (oh.c) r0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Found provider ["
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = "]"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            oh.d.c(r0)
            goto L10
        L33:
            java.lang.String r3 = "See https://www.slf4j.org/codes.html#multiple_bindings for an explanation."
            oh.d.c(r3)
        L38:
            return
    }
}
