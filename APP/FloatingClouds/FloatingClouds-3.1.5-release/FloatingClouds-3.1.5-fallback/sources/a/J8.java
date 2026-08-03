package a;

/* JADX INFO: loaded from: classes.dex */
public final class J8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.ClassLoader f136a;
    public final java.lang.String b;
    public final a.C0379t c;

    public J8(java.lang.ClassLoader r2, java.lang.String r3, a.C0379t r4) {
            r1 = this;
            java.lang.String r0 = "classLoader"
            a.C0193i9.e(r2, r0)
            java.lang.String r0 = "processName"
            a.C0193i9.e(r3, r0)
            r1.<init>()
            r1.f136a = r2
            r1.b = r3
            r1.c = r4
            return
    }

    public static io.github.libxposed.api.XposedInterface.HookHandle a(a.J8 r2, java.lang.String r3, java.lang.String r4, java.lang.Class[] r5, a.D7 r6) {
            io.github.libxposed.api.XposedInterface$ExceptionMode r0 = io.github.libxposed.api.XposedInterface.ExceptionMode.PROTECTIVE
            r2.getClass()
            java.lang.String r1 = "className"
            a.C0193i9.e(r3, r1)
            java.lang.String r1 = "methodName"
            a.C0193i9.e(r4, r1)
            java.lang.String r1 = "exceptionMode"
            a.C0193i9.e(r0, r1)
            int r1 = r5.length
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r5, r1)
            java.lang.ClassLoader r1 = r2.f136a
            java.lang.reflect.Method r5 = a.A1.e(r3, r1, r4, r5)
            if (r5 != 0) goto L40
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r5 = "findAndHook: method not found: "
            r2.<init>(r5)
            r2.append(r3)
            java.lang.String r3 = "."
            r2.append(r3)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            a.C0453x1.e(r2)
            r2 = 0
            return r2
        L40:
            io.github.libxposed.api.XposedInterface$HookBuilder r2 = r2.f(r5)
            r3 = 50
            io.github.libxposed.api.XposedInterface$HookBuilder r2 = r2.setPriority(r3)
            io.github.libxposed.api.XposedInterface$HookBuilder r2 = r2.setExceptionMode(r0)
            a.G8 r3 = new a.G8
            r4 = 0
            r3.<init>(r6, r4)
            io.github.libxposed.api.XposedInterface$HookHandle r2 = r2.intercept(r3)
            return r2
    }

    public static java.util.ArrayList b(a.J8 r6, java.lang.String r7, a.D7 r8, a.D7 r9) {
            r0 = 1
            io.github.libxposed.api.XposedInterface$ExceptionMode r1 = io.github.libxposed.api.XposedInterface.ExceptionMode.PROTECTIVE
            java.lang.String r2 = "className"
            a.C0193i9.e(r7, r2)
            java.lang.String r2 = "exceptionMode"
            a.C0193i9.e(r1, r2)
            java.util.WeakHashMap<java.lang.Object, java.util.Map<java.lang.String, java.lang.Object>> r2 = a.A1.f6a
            java.lang.String r2 = "classLoader"
            java.lang.ClassLoader r3 = r6.f136a
            a.C0193i9.e(r3, r2)
            java.lang.Class r7 = a.A1.b(r3, r7)
            r2 = 0
            if (r7 != 0) goto L20
            java.lang.reflect.Method[] r7 = new java.lang.reflect.Method[r2]
            goto L24
        L20:
            java.lang.reflect.Method[] r7 = a.A1.f(r7, r8)
        L24:
            java.util.ArrayList r8 = new java.util.ArrayList
            int r3 = r7.length
            r8.<init>(r3)
            int r3 = r7.length
        L2b:
            if (r2 >= r3) goto L4b
            r4 = r7[r2]
            io.github.libxposed.api.XposedInterface$HookBuilder r4 = r6.f(r4)
            r5 = 50
            io.github.libxposed.api.XposedInterface$HookBuilder r4 = r4.setPriority(r5)
            io.github.libxposed.api.XposedInterface$HookBuilder r4 = r4.setExceptionMode(r1)
            a.G8 r5 = new a.G8
            r5.<init>(r9, r0)
            io.github.libxposed.api.XposedInterface$HookHandle r4 = r4.intercept(r5)
            r8.add(r4)
            int r2 = r2 + r0
            goto L2b
        L4b:
            return r8
    }

    public static io.github.libxposed.api.XposedInterface.HookHandle c(a.J8 r5, java.lang.Class[] r6, a.D7 r7) {
            io.github.libxposed.api.XposedInterface$ExceptionMode r0 = io.github.libxposed.api.XposedInterface.ExceptionMode.PROTECTIVE
            java.lang.String r1 = "exceptionMode"
            a.C0193i9.e(r0, r1)
            java.lang.ClassLoader r1 = r5.f136a
            java.lang.String r2 = "java.io.FileOutputStream"
            java.lang.Class r1 = a.A1.b(r1, r2)
            r2 = 0
            if (r1 != 0) goto L13
            goto L64
        L13:
            java.util.ArrayList r3 = a.N1.c0(r6)
            r4 = 0
            java.lang.Class[] r4 = new java.lang.Class[r4]
            java.lang.Object[] r3 = r3.toArray(r4)
            java.lang.Class[] r3 = (java.lang.Class[]) r3
            int r4 = r3.length     // Catch: java.lang.NoSuchMethodException -> L48
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r4)     // Catch: java.lang.NoSuchMethodException -> L48
            java.lang.Class[] r3 = (java.lang.Class[]) r3     // Catch: java.lang.NoSuchMethodException -> L48
            java.lang.reflect.Constructor r1 = r1.getDeclaredConstructor(r3)     // Catch: java.lang.NoSuchMethodException -> L48
            r3 = 1
            r1.setAccessible(r3)     // Catch: java.lang.NoSuchMethodException -> L48
            io.github.libxposed.api.XposedInterface$HookBuilder r5 = r5.f(r1)
            r6 = 50
            io.github.libxposed.api.XposedInterface$HookBuilder r5 = r5.setPriority(r6)
            io.github.libxposed.api.XposedInterface$HookBuilder r5 = r5.setExceptionMode(r0)
            a.G8 r6 = new a.G8
            r0 = 4
            r6.<init>(r7, r0)
            io.github.libxposed.api.XposedInterface$HookHandle r5 = r5.intercept(r6)
            return r5
        L48:
            a.l8 r5 = new a.l8
            r7 = 18
            r5.<init>(r7)
            r7 = 31
            java.lang.String r5 = a.N1.e0(r6, r2, r5, r7)
            java.lang.String r6 = "findAndHookConstructor: ctor not found: java.io.FileOutputStream("
            java.lang.String r7 = ")"
            java.lang.String r5 = a.C0487z.g(r6, r5, r7)
            java.lang.Object[] r5 = new java.lang.Object[]{r5}
            a.C0453x1.e(r5)
        L64:
            return r2
    }

    public static void d(a.J8 r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.Class[] r6, a.D7 r7) {
            io.github.libxposed.api.XposedInterface$ExceptionMode r0 = io.github.libxposed.api.XposedInterface.ExceptionMode.PROTECTIVE
            java.lang.String r1 = "exceptionMode"
            a.C0193i9.e(r0, r1)
            a.o6 r3 = a.Fd.a(r3)
            int r1 = r6.length
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r6, r1)
            java.lang.ClassLoader r1 = r2.f136a
            java.lang.reflect.Method r6 = a.A1.e(r4, r1, r5, r6)
            if (r6 != 0) goto L36
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "findAndHookGuarded: method not found: "
            r2.<init>(r3)
            r2.append(r4)
            java.lang.String r3 = "."
            r2.append(r3)
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            a.C0453x1.e(r2)
            return
        L36:
            io.github.libxposed.api.XposedInterface$HookBuilder r2 = r2.f(r6)
            r4 = 50
            io.github.libxposed.api.XposedInterface$HookBuilder r2 = r2.setPriority(r4)
            io.github.libxposed.api.XposedInterface$HookBuilder r2 = r2.setExceptionMode(r0)
            a.H8 r4 = new a.H8
            r5 = 0
            r4.<init>(r3, r7, r5)
            r2.intercept(r4)
            return
    }

    public static io.github.libxposed.api.XposedInterface.HookHandle e(a.J8 r3, java.lang.String r4, java.lang.String r5, a.D7 r6) {
            io.github.libxposed.api.XposedInterface$ExceptionMode r0 = io.github.libxposed.api.XposedInterface.ExceptionMode.PROTECTIVE
            java.lang.String r1 = "exceptionMode"
            a.C0193i9.e(r0, r1)
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.ClassLoader r2 = r3.f136a
            java.lang.reflect.Method r1 = a.A1.e(r4, r2, r5, r1)
            if (r1 != 0) goto L31
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r6 = "findAndHookNoArgs: method not found: "
            r3.<init>(r6)
            r3.append(r4)
            java.lang.String r4 = "."
            r3.append(r4)
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            a.C0453x1.e(r3)
            r3 = 0
            return r3
        L31:
            io.github.libxposed.api.XposedInterface$HookBuilder r3 = r3.f(r1)
            r4 = 50
            io.github.libxposed.api.XposedInterface$HookBuilder r3 = r3.setPriority(r4)
            io.github.libxposed.api.XposedInterface$HookBuilder r3 = r3.setExceptionMode(r0)
            a.G8 r4 = new a.G8
            r5 = 3
            r4.<init>(r6, r5)
            io.github.libxposed.api.XposedInterface$HookHandle r3 = r3.intercept(r4)
            return r3
    }

    public static void g(a.J8 r2, java.lang.reflect.Method r3, a.D7 r4) {
            io.github.libxposed.api.XposedInterface$ExceptionMode r0 = io.github.libxposed.api.XposedInterface.ExceptionMode.PROTECTIVE
            java.lang.String r1 = "exceptionMode"
            a.C0193i9.e(r0, r1)
            io.github.libxposed.api.XposedInterface$HookBuilder r2 = r2.f(r3)
            r3 = 50
            io.github.libxposed.api.XposedInterface$HookBuilder r2 = r2.setPriority(r3)
            io.github.libxposed.api.XposedInterface$HookBuilder r2 = r2.setExceptionMode(r0)
            a.G8 r3 = new a.G8
            r0 = 2
            r3.<init>(r4, r0)
            io.github.libxposed.api.XposedInterface$HookHandle r2 = r2.intercept(r3)
            java.lang.String r3 = "intercept(...)"
            a.C0193i9.d(r2, r3)
            return
    }

    public static io.github.libxposed.api.XposedInterface.HookHandle h(a.J8 r2, java.lang.String r3, java.lang.reflect.Method r4, a.D7 r5) {
            io.github.libxposed.api.XposedInterface$ExceptionMode r0 = io.github.libxposed.api.XposedInterface.ExceptionMode.PROTECTIVE
            r2.getClass()
            java.lang.String r1 = "method"
            a.C0193i9.e(r4, r1)
            java.lang.String r1 = "exceptionMode"
            a.C0193i9.e(r0, r1)
            a.o6 r3 = a.Fd.a(r3)
            io.github.libxposed.api.XposedInterface$HookBuilder r2 = r2.f(r4)
            r4 = 50
            io.github.libxposed.api.XposedInterface$HookBuilder r2 = r2.setPriority(r4)
            io.github.libxposed.api.XposedInterface$HookBuilder r2 = r2.setExceptionMode(r0)
            a.H8 r4 = new a.H8
            r0 = 1
            r4.<init>(r3, r5, r0)
            io.github.libxposed.api.XposedInterface$HookHandle r2 = r2.intercept(r4)
            java.lang.String r3 = "intercept(...)"
            a.C0193i9.d(r2, r3)
            return r2
    }

    public final io.github.libxposed.api.XposedInterface.HookBuilder f(java.lang.reflect.Executable r2) {
            r1 = this;
            java.lang.String r0 = "executable"
            a.C0193i9.e(r2, r0)
            a.t r0 = r1.c
            java.lang.Object r2 = r0.f(r2)
            io.github.libxposed.api.XposedInterface$HookBuilder r2 = (io.github.libxposed.api.XposedInterface.HookBuilder) r2
            return r2
    }
}
