package a;

/* JADX INFO: loaded from: classes.dex */
public final class Gb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a.Gb f99a = null;
    public static volatile boolean b;
    public static volatile java.lang.Object c;
    public static volatile java.lang.reflect.Method d;
    public static volatile java.lang.reflect.Method e;
    public static volatile java.lang.reflect.Field f;
    public static volatile java.lang.Object g;
    public static volatile a.Rb.a h;
    public static volatile int i;
    public static volatile long j;
    public static final java.lang.Object k = null;
    public static final a.Me l = null;

    static {
            a.Gb r0 = new a.Gb
            r0.<init>()
            a.Gb.f99a = r0
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            a.Gb.k = r0
            a.w3 r0 = new a.w3
            r1 = 4
            r0.<init>(r1)
            a.Me r1 = new a.Me
            r1.<init>(r0)
            a.Gb.l = r1
            return
    }

    public static long a() {
            int r0 = a.Gb.i
            r1 = 1
            if (r0 > r1) goto L8
            r0 = 5000(0x1388, double:2.4703E-320)
            return r0
        L8:
            int r0 = a.Gb.i
            r1 = 2
            if (r0 != r1) goto L10
            r0 = 15000(0x3a98, double:7.411E-320)
            return r0
        L10:
            r0 = 60000(0xea60, double:2.9644E-319)
            return r0
    }

    public static void b(java.lang.ClassLoader r3) {
            java.lang.String r0 = "classLoader"
            a.C0193i9.e(r3, r0)
            boolean r0 = a.Gb.b
            if (r0 == 0) goto La
            return
        La:
            boolean r0 = a.Gb.b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "DIAG ensureInitialized ENTER methodsReady="
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            j(r0)
            boolean r3 = i(r3)
            if (r3 == 0) goto L2c
            r3 = 1
            a.Gb.b = r3
            java.lang.String r3 = "ensureInitialized: NATIVE path ready, methodsReady=true"
            j(r3)
            return
        L2c:
            java.lang.String r3 = "ensureInitialized: native path failed, hide will not work this session"
            j(r3)
            return
    }

    public static java.lang.reflect.Method c(java.lang.Class r5) {
        L0:
            if (r5 == 0) goto L5f
            java.lang.reflect.Method[] r0 = r5.getDeclaredMethods()
            a.G1 r0 = a.C0435w1.I(r0)
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L5a
            java.lang.Object r1 = r0.next()
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            java.lang.Class[] r2 = r1.getParameterTypes()
            int r2 = r2.length
            r3 = 2
            if (r2 != r3) goto La
            java.lang.Class[] r2 = r1.getParameterTypes()
            r3 = 0
            r2 = r2[r3]
            boolean r2 = r2.isArray()
            if (r2 == 0) goto La
            java.lang.Class[] r2 = r1.getParameterTypes()
            r2 = r2[r3]
            java.lang.Class r2 = r2.getComponentType()
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            boolean r2 = a.C0193i9.a(r2, r3)
            if (r2 == 0) goto La
            java.lang.Class[] r2 = r1.getParameterTypes()
            r4 = 1
            r2 = r2[r4]
            boolean r2 = a.C0193i9.a(r2, r3)
            if (r2 == 0) goto La
            java.lang.Class r2 = r1.getReturnType()
            java.lang.Class r3 = java.lang.Void.TYPE
            boolean r2 = a.C0193i9.a(r2, r3)
            if (r2 == 0) goto La
            r1.setAccessible(r4)
            return r1
        L5a:
            java.lang.Class r5 = r5.getSuperclass()
            goto L0
        L5f:
            r5 = 0
            return r5
    }

    public static java.lang.Object d(java.lang.Class r8) {
            java.lang.String r0 = r8.getName()
            java.lang.reflect.Method[] r1 = r8.getDeclaredMethods()
            a.G1 r1 = a.C0435w1.I(r1)
        Lc:
            boolean r2 = r1.hasNext()
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L71
            java.lang.Object r2 = r1.next()
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2
            int r5 = r2.getModifiers()
            boolean r5 = java.lang.reflect.Modifier.isStatic(r5)
            if (r5 == 0) goto Lc
            java.lang.Class[] r5 = r2.getParameterTypes()
            java.lang.String r6 = "getParameterTypes(...)"
            a.C0193i9.d(r5, r6)
            int r5 = r5.length
            if (r5 != 0) goto Lc
            java.lang.Class r5 = r2.getReturnType()
            boolean r5 = r8.isAssignableFrom(r5)
            if (r5 == 0) goto Lc
            r2.setAccessible(r3)
            java.lang.Object r3 = r2.invoke(r4, r4)     // Catch: java.lang.Throwable -> L42
            goto L47
        L42:
            r3 = move-exception
            a.wd$a r3 = a.C0465xd.a(r3)
        L47:
            boolean r5 = r3 instanceof a.C0447wd.a
            if (r5 == 0) goto L4c
            goto L4d
        L4c:
            r4 = r3
        L4d:
            if (r4 == 0) goto Lc
            java.lang.String r0 = r2.getName()
            java.lang.String r8 = r8.getSimpleName()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "findStorageInstance: static method "
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = "() on "
            r1.append(r0)
            r1.append(r8)
            java.lang.String r8 = r1.toString()
            j(r8)
            return r4
        L71:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "findStorageInstance: "
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = " — no static singleton method found"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            j(r0)
            java.lang.String r0 = "INSTANCE"
            java.lang.String r1 = "instance"
            java.lang.String r2 = "sInstance"
            java.lang.String r5 = "a"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1, r2, r5}
            java.util.List r0 = a.C0294o3.d0(r0)
            java.util.Iterator r0 = r0.iterator()
        L9b:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Le9
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.reflect.Field r2 = r8.getDeclaredField(r1)     // Catch: java.lang.NoSuchFieldException -> L9b
            int r5 = r2.getModifiers()     // Catch: java.lang.NoSuchFieldException -> L9b
            boolean r5 = java.lang.reflect.Modifier.isStatic(r5)     // Catch: java.lang.NoSuchFieldException -> L9b
            if (r5 == 0) goto L9b
            java.lang.Class r5 = r2.getType()     // Catch: java.lang.NoSuchFieldException -> L9b
            boolean r5 = r8.isAssignableFrom(r5)     // Catch: java.lang.NoSuchFieldException -> L9b
            if (r5 == 0) goto L9b
            r2.setAccessible(r3)     // Catch: java.lang.NoSuchFieldException -> L9b
            java.lang.Object r2 = r2.get(r4)     // Catch: java.lang.NoSuchFieldException -> L9b
            if (r2 == 0) goto L9b
            java.lang.String r5 = r8.getSimpleName()     // Catch: java.lang.NoSuchFieldException -> L9b
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.NoSuchFieldException -> L9b
            r6.<init>()     // Catch: java.lang.NoSuchFieldException -> L9b
            java.lang.String r7 = "findStorageInstance: static field "
            r6.append(r7)     // Catch: java.lang.NoSuchFieldException -> L9b
            r6.append(r1)     // Catch: java.lang.NoSuchFieldException -> L9b
            java.lang.String r1 = " on "
            r6.append(r1)     // Catch: java.lang.NoSuchFieldException -> L9b
            r6.append(r5)     // Catch: java.lang.NoSuchFieldException -> L9b
            java.lang.String r1 = r6.toString()     // Catch: java.lang.NoSuchFieldException -> L9b
            j(r1)     // Catch: java.lang.NoSuchFieldException -> L9b
            return r2
        Le9:
            java.lang.reflect.Constructor r0 = r8.getDeclaredConstructor(r4)     // Catch: java.lang.Throwable -> L10d
            r0.setAccessible(r3)     // Catch: java.lang.Throwable -> L10d
            java.lang.Object r0 = r0.newInstance(r4)     // Catch: java.lang.Throwable -> L10d
            java.lang.String r8 = r8.getSimpleName()     // Catch: java.lang.Throwable -> L10d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L10d
            r1.<init>()     // Catch: java.lang.Throwable -> L10d
            java.lang.String r2 = "findStorageInstance: no-arg constructor on "
            r1.append(r2)     // Catch: java.lang.Throwable -> L10d
            r1.append(r8)     // Catch: java.lang.Throwable -> L10d
            java.lang.String r8 = r1.toString()     // Catch: java.lang.Throwable -> L10d
            j(r8)     // Catch: java.lang.Throwable -> L10d
            goto L112
        L10d:
            r8 = move-exception
            a.wd$a r0 = a.C0465xd.a(r8)
        L112:
            a.C0447wd.a(r0)
            boolean r8 = r0 instanceof a.C0447wd.a
            if (r8 == 0) goto L11a
            goto L11b
        L11a:
            r4 = r0
        L11b:
            return r4
    }

    public static boolean e(java.lang.Class r5) {
        L0:
            r0 = 0
            if (r5 == 0) goto L5c
            java.lang.reflect.Method[] r1 = r5.getDeclaredMethods()
            a.G1 r1 = a.C0435w1.I(r1)
        Lb:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L57
            java.lang.Object r2 = r1.next()
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2
            java.lang.Class r3 = r2.getReturnType()
            java.lang.Class r4 = java.lang.Void.TYPE
            boolean r3 = a.C0193i9.a(r3, r4)
            if (r3 == 0) goto Lb
            java.lang.Class[] r3 = r2.getParameterTypes()
            int r3 = r3.length
            r4 = 2
            if (r3 != r4) goto Lb
            java.lang.Class[] r3 = r2.getParameterTypes()
            r3 = r3[r0]
            boolean r3 = r3.isArray()
            if (r3 == 0) goto Lb
            java.lang.Class[] r3 = r2.getParameterTypes()
            r3 = r3[r0]
            java.lang.Class r3 = r3.getComponentType()
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            boolean r3 = a.C0193i9.a(r3, r4)
            if (r3 == 0) goto Lb
            java.lang.Class[] r2 = r2.getParameterTypes()
            r3 = 1
            r2 = r2[r3]
            boolean r2 = a.C0193i9.a(r2, r4)
            if (r2 == 0) goto Lb
            return r3
        L57:
            java.lang.Class r5 = r5.getSuperclass()
            goto L0
        L5c:
            return r0
    }

    public static final void f(java.lang.Class<?> r4, java.lang.Class<?> r5, java.lang.String r6) {
            java.lang.String r0 = "injectConvStoragePair: storage="
            java.lang.Object r1 = a.Gb.k
            monitor-enter(r1)
            a.Rb$a r2 = new a.Rb$a     // Catch: java.lang.Throwable -> L43
            r2.<init>(r4, r5, r6)     // Catch: java.lang.Throwable -> L43
            a.Gb.h = r2     // Catch: java.lang.Throwable -> L43
            r2 = 0
            a.Gb.i = r2     // Catch: java.lang.Throwable -> L43
            r2 = 0
            a.Gb.j = r2     // Catch: java.lang.Throwable -> L43
            a.Gb r2 = a.Gb.f99a     // Catch: java.lang.Throwable -> L43
            java.lang.String r4 = r4.getName()     // Catch: java.lang.Throwable -> L43
            java.lang.String r5 = r5.getName()     // Catch: java.lang.Throwable -> L43
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L43
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L43
            r3.append(r4)     // Catch: java.lang.Throwable -> L43
            java.lang.String r4 = " helper="
            r3.append(r4)     // Catch: java.lang.Throwable -> L43
            r3.append(r5)     // Catch: java.lang.Throwable -> L43
            java.lang.String r4 = " getter="
            r3.append(r4)     // Catch: java.lang.Throwable -> L43
            r3.append(r6)     // Catch: java.lang.Throwable -> L43
            java.lang.String r4 = r3.toString()     // Catch: java.lang.Throwable -> L43
            r2.getClass()     // Catch: java.lang.Throwable -> L43
            j(r4)     // Catch: java.lang.Throwable -> L43
            a.Wf r4 = a.Wf.f330a     // Catch: java.lang.Throwable -> L43
            monitor-exit(r1)
            return
        L43:
            r4 = move-exception
            monitor-exit(r1)
            throw r4
    }

    public static final void g(a.J8 r9) {
            a.Gb r0 = a.Gb.f99a
            java.lang.ClassLoader r1 = r9.f136a     // Catch: java.lang.Throwable -> Lc8
            java.lang.String r2 = "com.tencent.mm.storage.m4"
            java.lang.String r3 = "com.tencent.mm.storage.l4"
            java.lang.String[] r2 = new java.lang.String[]{r2, r3}     // Catch: java.lang.Throwable -> Lc8
            java.util.ArrayList r2 = a.C0294o3.e0(r2)     // Catch: java.lang.Throwable -> Lc8
            a.Rb$a r3 = a.Gb.h     // Catch: java.lang.Throwable -> Lc8
            r4 = 0
            if (r3 == 0) goto L24
            java.lang.Class<?> r3 = r3.f247a     // Catch: java.lang.Throwable -> Lc8
            java.lang.String r3 = r3.getName()     // Catch: java.lang.Throwable -> Lc8
            boolean r5 = r2.contains(r3)     // Catch: java.lang.Throwable -> Lc8
            if (r5 != 0) goto L24
            r2.add(r4, r3)     // Catch: java.lang.Throwable -> Lc8
        L24:
            java.util.List r3 = a.C0043a5.c()     // Catch: java.lang.Throwable -> Lc8
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lc8
            r5.<init>()     // Catch: java.lang.Throwable -> Lc8
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> Lc8
        L31:
            boolean r6 = r3.hasNext()     // Catch: java.lang.Throwable -> Lc8
            if (r6 == 0) goto L48
            java.lang.Object r6 = r3.next()     // Catch: java.lang.Throwable -> Lc8
            r7 = r6
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Throwable -> Lc8
            boolean r7 = r2.contains(r7)     // Catch: java.lang.Throwable -> Lc8
            if (r7 != 0) goto L31
            r5.add(r6)     // Catch: java.lang.Throwable -> Lc8
            goto L31
        L48:
            r2.addAll(r5)     // Catch: java.lang.Throwable -> Lc8
            java.lang.String r3 = "F010"
            a.o6 r3 = a.Fd.a(r3)     // Catch: java.lang.Throwable -> Lc8
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> Lc8
        L55:
            boolean r5 = r2.hasNext()     // Catch: java.lang.Throwable -> Lc8
            if (r5 == 0) goto La9
            java.lang.Object r5 = r2.next()     // Catch: java.lang.Throwable -> Lc8
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> Lc8
            java.lang.Class r5 = a.A1.b(r1, r5)     // Catch: java.lang.Throwable -> Lc8
            if (r5 != 0) goto L68
            goto L55
        L68:
            r0.getClass()     // Catch: java.lang.Throwable -> Lc8
            boolean r6 = e(r5)     // Catch: java.lang.Throwable -> Lc8
            if (r6 == 0) goto L55
            java.lang.reflect.Constructor[] r5 = r5.getDeclaredConstructors()     // Catch: java.lang.Throwable -> Lc8
            a.G1 r5 = a.C0435w1.I(r5)     // Catch: java.lang.Throwable -> Lc8
        L79:
            boolean r6 = r5.hasNext()     // Catch: java.lang.Throwable -> Lc8
            if (r6 == 0) goto L55
            java.lang.Object r6 = r5.next()     // Catch: java.lang.Throwable -> Lc8
            java.lang.reflect.Constructor r6 = (java.lang.reflect.Constructor) r6     // Catch: java.lang.Throwable -> Lc8
            a.C0193i9.b(r6)     // Catch: java.lang.Throwable -> La4
            io.github.libxposed.api.XposedInterface$HookBuilder r6 = r9.f(r6)     // Catch: java.lang.Throwable -> La4
            r7 = 50
            io.github.libxposed.api.XposedInterface$HookBuilder r6 = r6.setPriority(r7)     // Catch: java.lang.Throwable -> La4
            io.github.libxposed.api.XposedInterface$ExceptionMode r7 = io.github.libxposed.api.XposedInterface.ExceptionMode.PROTECTIVE     // Catch: java.lang.Throwable -> La4
            io.github.libxposed.api.XposedInterface$HookBuilder r6 = r6.setExceptionMode(r7)     // Catch: java.lang.Throwable -> La4
            a.m2 r7 = new a.m2     // Catch: java.lang.Throwable -> La4
            r8 = 7
            r7.<init>(r8, r3)     // Catch: java.lang.Throwable -> La4
            r6.intercept(r7)     // Catch: java.lang.Throwable -> La4
            int r4 = r4 + 1
            goto L79
        La4:
            r6 = move-exception
            a.C0465xd.a(r6)     // Catch: java.lang.Throwable -> Lc8
            goto L79
        La9:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc8
            r9.<init>()     // Catch: java.lang.Throwable -> Lc8
            java.lang.String r1 = "registerInstanceCapture: total ctor hooks="
            r9.append(r1)     // Catch: java.lang.Throwable -> Lc8
            r9.append(r4)     // Catch: java.lang.Throwable -> Lc8
            java.lang.String r1 = " (guarded)"
            r9.append(r1)     // Catch: java.lang.Throwable -> Lc8
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Throwable -> Lc8
            r0.getClass()     // Catch: java.lang.Throwable -> Lc8
            j(r9)     // Catch: java.lang.Throwable -> Lc8
            a.Wf r9 = a.Wf.f330a     // Catch: java.lang.Throwable -> Lc8
            goto Lcd
        Lc8:
            r9 = move-exception
            a.wd$a r9 = a.C0465xd.a(r9)
        Lcd:
            java.lang.Throwable r9 = a.C0447wd.a(r9)
            if (r9 == 0) goto Led
            a.Gb r0 = a.Gb.f99a
            java.lang.String r9 = r9.getMessage()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "registerInstanceCapture: unexpected: "
            r1.<init>(r2)
            r1.append(r9)
            java.lang.String r9 = r1.toString()
            r0.getClass()
            j(r9)
        Led:
            return
    }

    public static a.Rb.a h(java.lang.ClassLoader r12) {
            java.lang.String r0 = "classLoader"
            a.C0193i9.e(r12, r0)
            java.lang.String r0 = "getConvPair FAILED via=ENGINE (count="
            java.lang.String r1 = "getConvPair via=ENGINE path="
            a.Rb$a r2 = a.Gb.h
            if (r2 == 0) goto Le
            return r2
        Le:
            long r2 = a.Gb.j
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            r3 = 0
            if (r2 <= 0) goto L27
            long r6 = java.lang.System.currentTimeMillis()
            long r8 = a.Gb.j
            long r6 = r6 - r8
            long r8 = a()
            int r2 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r2 >= 0) goto L27
            return r3
        L27:
            java.lang.Object r2 = a.Gb.k
            monitor-enter(r2)
            a.Rb$a r6 = a.Gb.h     // Catch: java.lang.Throwable -> L4c
            if (r6 == 0) goto L30
            monitor-exit(r2)
            return r6
        L30:
            long r6 = a.Gb.j     // Catch: java.lang.Throwable -> L4c
            int r6 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r6 <= 0) goto L4f
            long r6 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L4c
            long r8 = a.Gb.j     // Catch: java.lang.Throwable -> L4c
            long r6 = r6 - r8
            a.Gb r8 = a.Gb.f99a     // Catch: java.lang.Throwable -> L4c
            r8.getClass()     // Catch: java.lang.Throwable -> L4c
            long r8 = a()     // Catch: java.lang.Throwable -> L4c
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 >= 0) goto L4f
            monitor-exit(r2)
            return r3
        L4c:
            r12 = move-exception
            goto L12b
        L4f:
            a.fd r6 = new a.fd     // Catch: java.lang.Throwable -> L4c
            int r7 = a.B1.f21a     // Catch: java.lang.Throwable -> L4c
            r8 = 1
            r9 = 0
            r10 = -1
            if (r7 != r10) goto L78
            android.content.Context r7 = a.C0435w1.p     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L6a
            a.C0193i9.b(r7)     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L6a
            android.content.pm.PackageManager r7 = r7.getPackageManager()     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L6a
            java.lang.String r11 = "com.tencent.mm"
            android.content.pm.PackageInfo r7 = r7.getPackageInfo(r11, r9)     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L6a
            int r10 = r7.versionCode     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L6a
            goto L76
        L6a:
            r7 = move-exception
            java.lang.Object[] r7 = new java.lang.Object[]{r7}     // Catch: java.lang.Throwable -> L4c
            java.lang.Object[] r7 = java.util.Arrays.copyOf(r7, r8)     // Catch: java.lang.Throwable -> L4c
            a.C0453x1.a(r7)     // Catch: java.lang.Throwable -> L4c
        L76:
            a.B1.f21a = r10     // Catch: java.lang.Throwable -> L4c
        L78:
            int r7 = a.B1.f21a     // Catch: java.lang.Throwable -> L4c
            r6.<init>(r7, r12)     // Catch: java.lang.Throwable -> L4c
            a.hd r12 = a.C0179hd.f499a     // Catch: java.lang.Throwable -> L4c
            java.lang.String r7 = "F010_conv_storage_pair"
            r12.getClass()     // Catch: java.lang.Throwable -> L4c
            a.gd r12 = a.C0179hd.a(r7, r6)     // Catch: java.lang.Throwable -> L4c
            boolean r6 = r12.f485a     // Catch: java.lang.Throwable -> L4c
            if (r6 == 0) goto La8
            java.lang.Class<?> r6 = r12.b     // Catch: java.lang.Throwable -> L4c
            if (r6 == 0) goto La8
            java.lang.String r6 = "helper"
            java.lang.Class r6 = r12.a(r6)     // Catch: java.lang.Throwable -> L4c
            java.lang.String r7 = "convGetter"
            java.lang.String r7 = r12.b(r7)     // Catch: java.lang.Throwable -> L4c
            if (r6 == 0) goto La8
            if (r7 == 0) goto La8
            a.Rb$a r10 = new a.Rb$a     // Catch: java.lang.Throwable -> L4c
            java.lang.Class<?> r11 = r12.b     // Catch: java.lang.Throwable -> L4c
            r10.<init>(r11, r6, r7)     // Catch: java.lang.Throwable -> L4c
            goto La9
        La8:
            r10 = r3
        La9:
            if (r10 == 0) goto Lee
            a.Gb.h = r10     // Catch: java.lang.Throwable -> L4c
            a.Gb.i = r9     // Catch: java.lang.Throwable -> L4c
            a.Gb.j = r4     // Catch: java.lang.Throwable -> L4c
            a.Gb r0 = a.Gb.f99a     // Catch: java.lang.Throwable -> L4c
            a.cd r12 = r12.d     // Catch: java.lang.Throwable -> L4c
            java.lang.Class<?> r3 = r10.f247a     // Catch: java.lang.Throwable -> L4c
            java.lang.String r3 = r3.getName()     // Catch: java.lang.Throwable -> L4c
            java.lang.Class<?> r4 = r10.b     // Catch: java.lang.Throwable -> L4c
            java.lang.String r4 = r4.getName()     // Catch: java.lang.Throwable -> L4c
            java.lang.String r5 = r10.c     // Catch: java.lang.Throwable -> L4c
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4c
            r6.<init>(r1)     // Catch: java.lang.Throwable -> L4c
            r6.append(r12)     // Catch: java.lang.Throwable -> L4c
            java.lang.String r12 = " storage="
            r6.append(r12)     // Catch: java.lang.Throwable -> L4c
            r6.append(r3)     // Catch: java.lang.Throwable -> L4c
            java.lang.String r12 = " helper="
            r6.append(r12)     // Catch: java.lang.Throwable -> L4c
            r6.append(r4)     // Catch: java.lang.Throwable -> L4c
            java.lang.String r12 = " getter="
            r6.append(r12)     // Catch: java.lang.Throwable -> L4c
            r6.append(r5)     // Catch: java.lang.Throwable -> L4c
            java.lang.String r12 = r6.toString()     // Catch: java.lang.Throwable -> L4c
            r0.getClass()     // Catch: java.lang.Throwable -> L4c
            j(r12)     // Catch: java.lang.Throwable -> L4c
            goto L129
        Lee:
            int r1 = a.Gb.i     // Catch: java.lang.Throwable -> L4c
            int r1 = r1 + r8
            a.Gb.i = r1     // Catch: java.lang.Throwable -> L4c
            long r4 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L4c
            a.Gb.j = r4     // Catch: java.lang.Throwable -> L4c
            a.Gb r1 = a.Gb.f99a     // Catch: java.lang.Throwable -> L4c
            int r4 = a.Gb.i     // Catch: java.lang.Throwable -> L4c
            r1.getClass()     // Catch: java.lang.Throwable -> L4c
            long r5 = a()     // Catch: java.lang.Throwable -> L4c
            a.j6 r12 = r12.c     // Catch: java.lang.Throwable -> L4c
            if (r12 == 0) goto L10a
            java.lang.String r3 = r12.c     // Catch: java.lang.Throwable -> L4c
        L10a:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4c
            r12.<init>(r0)     // Catch: java.lang.Throwable -> L4c
            r12.append(r4)     // Catch: java.lang.Throwable -> L4c
            java.lang.String r0 = ", backoff="
            r12.append(r0)     // Catch: java.lang.Throwable -> L4c
            r12.append(r5)     // Catch: java.lang.Throwable -> L4c
            java.lang.String r0 = "ms) reason="
            r12.append(r0)     // Catch: java.lang.Throwable -> L4c
            r12.append(r3)     // Catch: java.lang.Throwable -> L4c
            java.lang.String r12 = r12.toString()     // Catch: java.lang.Throwable -> L4c
            j(r12)     // Catch: java.lang.Throwable -> L4c
        L129:
            monitor-exit(r2)
            return r10
        L12b:
            monitor-exit(r2)
            throw r12
    }

    public static boolean i(java.lang.ClassLoader r16) {
            r0 = r16
            java.lang.reflect.Method r1 = a.Gb.d
            r2 = 1
            if (r1 == 0) goto L11
            java.lang.Object r1 = a.Gb.c
            if (r1 == 0) goto L11
            java.lang.String r0 = "resolveNativeHide: already resolved"
            j(r0)
            return r2
        L11:
            java.lang.Object r1 = a.Gb.g
            if (r1 == 0) goto L54
            java.lang.Class r3 = r1.getClass()
            java.lang.reflect.Method r3 = c(r3)
            if (r3 == 0) goto L54
            a.Gb.c = r1
            a.Gb.d = r3
            java.lang.Class r0 = r1.getClass()
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = r3.getName()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "resolveNativeHide OK via captured live instance: store="
            r3.<init>(r4)
            r3.append(r0)
            java.lang.String r0 = " P="
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = r3.toString()
            j(r0)
            java.lang.String r0 = "ConvHide"
            java.lang.String r1 = "resolveNativeHide OK via captured live instance"
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r1}
            a.C0453x1.b(r0)
            return r2
        L54:
            java.lang.Object r1 = a.C0043a5.f384a
            if (r1 == 0) goto L69
            java.lang.String r4 = "p_method"
            java.lang.Object r1 = r1.get(r4)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 != 0) goto L63
            goto L69
        L63:
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.lang.Exception -> L69
            r4.<init>(r1)     // Catch: java.lang.Exception -> L69
            goto L6a
        L69:
            r4 = 0
        L6a:
            a.Y5 r1 = a.Y5.f351a
            r5 = 0
            if (r4 != 0) goto L70
            goto Lb4
        L70:
            java.lang.String r6 = "hits"
            org.json.JSONArray r4 = r4.optJSONArray(r6)
            if (r4 != 0) goto L79
            goto Lb4
        L79:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            int r6 = r4.length()
            r7 = r5
        L83:
            if (r7 >= r6) goto Lb4
            org.json.JSONObject r8 = r4.optJSONObject(r7)
            if (r8 != 0) goto L8c
            goto Lb1
        L8c:
            java.lang.String r9 = "class"
            java.lang.String r10 = ""
            java.lang.String r9 = r8.optString(r9, r10)
            java.lang.String r11 = "method"
            java.lang.String r11 = r8.optString(r11, r10)
            java.lang.String r12 = "sig"
            java.lang.String r8 = r8.optString(r12, r10)
            a.C0193i9.b(r9)
            int r10 = r9.length()
            if (r10 <= 0) goto Lb1
            a.Hf r10 = new a.Hf
            r10.<init>(r9, r11, r8)
            r1.add(r10)
        Lb1:
            int r7 = r7 + 1
            goto L83
        Lb4:
            int r4 = r1.size()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "resolveNativeHide: DexKit P-method hits="
            r6.<init>(r7)
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            j(r4)
            boolean r4 = r1.isEmpty()
            java.lang.String r6 = " method="
            r7 = 2
            java.lang.Class r8 = java.lang.Void.TYPE
            java.lang.Class<java.lang.String> r9 = java.lang.String.class
            if (r4 != 0) goto L190
            java.util.Iterator r1 = r1.iterator()
        Lda:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L190
            java.lang.Object r4 = r1.next()
            a.Hf r4 = (a.Hf) r4
            java.io.Serializable r10 = r4.f116a
            java.lang.String r10 = (java.lang.String) r10
            java.io.Serializable r4 = r4.b
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Class r4 = a.A1.b(r0, r10)
            if (r4 != 0) goto Lf5
            goto Lda
        Lf5:
            java.lang.Object r11 = d(r4)
            if (r11 == 0) goto L178
            r12 = 0
        Lfc:
            if (r4 == 0) goto L156
            if (r12 != 0) goto L156
            java.lang.reflect.Method[] r13 = r4.getDeclaredMethods()
            a.G1 r13 = a.C0435w1.I(r13)
        L108:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto L151
            java.lang.Object r14 = r13.next()
            java.lang.reflect.Method r14 = (java.lang.reflect.Method) r14
            java.lang.Class[] r15 = r14.getParameterTypes()
            int r15 = r15.length
            if (r15 != r7) goto L108
            java.lang.Class[] r15 = r14.getParameterTypes()
            r15 = r15[r5]
            boolean r15 = r15.isArray()
            if (r15 == 0) goto L108
            java.lang.Class[] r15 = r14.getParameterTypes()
            r15 = r15[r5]
            java.lang.Class r15 = r15.getComponentType()
            boolean r15 = a.C0193i9.a(r15, r9)
            if (r15 == 0) goto L108
            java.lang.Class[] r15 = r14.getParameterTypes()
            r15 = r15[r2]
            boolean r15 = a.C0193i9.a(r15, r9)
            if (r15 == 0) goto L108
            java.lang.Class r15 = r14.getReturnType()
            boolean r15 = a.C0193i9.a(r15, r8)
            if (r15 == 0) goto L108
            r14.setAccessible(r2)
            r12 = r14
        L151:
            java.lang.Class r4 = r4.getSuperclass()
            goto Lfc
        L156:
            if (r12 == 0) goto L178
            a.Gb.c = r11
            a.Gb.d = r12
            java.lang.String r0 = r12.getName()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "resolveNativeHide OK via DexKit P-method: cls="
            r1.<init>(r3)
            r1.append(r10)
            r1.append(r6)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            j(r0)
            return r2
        L178:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r11 = "resolveNativeHide: DexKit hit "
            r4.<init>(r11)
            r4.append(r10)
            java.lang.String r10 = " — cannot get instance, skip"
            r4.append(r10)
            java.lang.String r4 = r4.toString()
            j(r4)
            goto Lda
        L190:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            a.Rb$a r4 = a.Gb.h
            if (r4 == 0) goto L1bd
            java.lang.Class<?> r4 = r4.f247a
            java.lang.String r4 = r4.getName()
            r1.add(r4)
            a.Gb r10 = a.Gb.f99a
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "resolveNativeHide: added injected convPair storage="
            r11.<init>(r12)
            r11.append(r4)
            java.lang.String r4 = " to candidates"
            r11.append(r4)
            java.lang.String r4 = r11.toString()
            r10.getClass()
            j(r4)
        L1bd:
            java.lang.String r4 = "com.tencent.mm.storage.l4"
            r1.add(r4)
            java.lang.String r4 = "com.tencent.mm.storage.m4"
            r1.add(r4)
            java.lang.String r4 = "com.tencent.mm.storage.g9"
            r1.add(r4)
            java.util.List r4 = a.C0043a5.c()
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Iterator r4 = r4.iterator()
        L1d9:
            boolean r11 = r4.hasNext()
            if (r11 == 0) goto L1f0
            java.lang.Object r11 = r4.next()
            r12 = r11
            java.lang.String r12 = (java.lang.String) r12
            boolean r12 = r1.contains(r12)
            if (r12 != 0) goto L1d9
            r10.add(r11)
            goto L1d9
        L1f0:
            r1.addAll(r10)
            int r4 = r1.size()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = "resolveNativeHide: candidateClassNames count="
            r10.<init>(r11)
            r10.append(r4)
            java.lang.String r4 = r10.toString()
            j(r4)
            java.util.Iterator r1 = r1.iterator()
        L20c:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L330
            java.lang.Object r4 = r1.next()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Class r10 = a.A1.b(r0, r4)
            if (r10 == 0) goto L20c
            java.lang.Object r11 = d(r10)
            if (r11 == 0) goto L20c
            r12 = r10
            r13 = 0
        L226:
            if (r12 == 0) goto L280
            if (r13 != 0) goto L280
            java.lang.reflect.Method[] r14 = r12.getDeclaredMethods()
            a.G1 r14 = a.C0435w1.I(r14)
        L232:
            boolean r15 = r14.hasNext()
            if (r15 == 0) goto L27b
            java.lang.Object r15 = r14.next()
            java.lang.reflect.Method r15 = (java.lang.reflect.Method) r15
            java.lang.Class[] r3 = r15.getParameterTypes()
            int r3 = r3.length
            if (r3 != r7) goto L232
            java.lang.Class[] r3 = r15.getParameterTypes()
            r3 = r3[r5]
            boolean r3 = r3.isArray()
            if (r3 == 0) goto L232
            java.lang.Class[] r3 = r15.getParameterTypes()
            r3 = r3[r5]
            java.lang.Class r3 = r3.getComponentType()
            boolean r3 = a.C0193i9.a(r3, r9)
            if (r3 == 0) goto L232
            java.lang.Class[] r3 = r15.getParameterTypes()
            r3 = r3[r2]
            boolean r3 = a.C0193i9.a(r3, r9)
            if (r3 == 0) goto L232
            java.lang.Class r3 = r15.getReturnType()
            boolean r3 = a.C0193i9.a(r3, r8)
            if (r3 == 0) goto L232
            r15.setAccessible(r2)
            r13 = r15
        L27b:
            java.lang.Class r12 = r12.getSuperclass()
            goto L226
        L280:
            if (r13 == 0) goto L20c
            a.Gb.c = r11
            a.Gb.d = r13
            java.lang.String r0 = r13.getName()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "resolveNativeHide OK: cls="
            r1.<init>(r3)
            r1.append(r4)
            r1.append(r6)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            j(r0)
            java.lang.reflect.Method[] r0 = r10.getDeclaredMethods()
            java.lang.String r1 = "getDeclaredMethods(...)"
            a.C0193i9.d(r0, r1)
            int r1 = r0.length
            r3 = r5
        L2ac:
            if (r3 >= r1) goto L2f3
            r4 = r0[r3]
            java.lang.String r6 = r4.getName()
            java.lang.String r7 = "x"
            boolean r6 = a.C0193i9.a(r6, r7)
            if (r6 != 0) goto L2c8
            java.lang.String r6 = r4.getName()
            java.lang.String r7 = "p"
            boolean r6 = a.C0193i9.a(r6, r7)
            if (r6 == 0) goto L2f0
        L2c8:
            java.lang.Class[] r6 = r4.getParameterTypes()
            int r6 = r6.length
            if (r6 != r2) goto L2f0
            java.lang.Class[] r6 = r4.getParameterTypes()
            r6 = r6[r5]
            boolean r6 = a.C0193i9.a(r6, r9)
            if (r6 == 0) goto L2f0
            java.lang.Class r6 = r4.getReturnType()
            boolean r6 = r6.isPrimitive()
            if (r6 != 0) goto L2f0
            java.lang.Class r6 = r4.getReturnType()
            boolean r6 = a.C0193i9.a(r6, r8)
            if (r6 != 0) goto L2f0
            goto L2f4
        L2f0:
            int r3 = r3 + 1
            goto L2ac
        L2f3:
            r4 = 0
        L2f4:
            if (r4 == 0) goto L2fa
            r4.setAccessible(r2)
            goto L2fb
        L2fa:
            r4 = 0
        L2fb:
            a.Gb.e = r4
            if (r4 == 0) goto L32f
            java.lang.String r0 = "filehelper"
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.Throwable -> L30a
            java.lang.Object r0 = r4.invoke(r11, r0)     // Catch: java.lang.Throwable -> L30a
            goto L30f
        L30a:
            r0 = move-exception
            a.wd$a r0 = a.C0465xd.a(r0)
        L30f:
            boolean r1 = r0 instanceof a.C0447wd.a
            if (r1 == 0) goto L315
            r3 = 0
            goto L316
        L315:
            r3 = r0
        L316:
            if (r3 == 0) goto L32f
            java.lang.Class r0 = r3.getClass()
        L31c:
            if (r0 == 0) goto L32f
            java.lang.String r1 = "field_parentRef"
            java.lang.reflect.Field r1 = r0.getDeclaredField(r1)     // Catch: java.lang.NoSuchFieldException -> L32a
            r1.setAccessible(r2)     // Catch: java.lang.NoSuchFieldException -> L32a
            a.Gb.f = r1     // Catch: java.lang.NoSuchFieldException -> L32a
            goto L32f
        L32a:
            java.lang.Class r0 = r0.getSuperclass()
            goto L31c
        L32f:
            return r2
        L330:
            java.lang.String r0 = "resolveNativeHide: all candidates failed, native path unavailable this session"
            j(r0)
            return r5
    }

    public static void j(java.lang.String r1) {
            java.lang.String r0 = "ConvHide: "
            java.lang.String r1 = a.C0487z.k(r0, r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            r0 = 1
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r0)
            a.C0453x1.b(r1)
            return
    }
}
