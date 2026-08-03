package a;

/* JADX INFO: loaded from: classes.dex */
public final class A1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final java.util.WeakHashMap<java.lang.Object, java.util.Map<java.lang.String, java.lang.Object>> f6a = null;

    static {
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            a.A1.f6a = r0
            return
    }

    public static final java.lang.Object a(java.lang.Object r5, java.lang.String r6, java.lang.Object... r7) {
            if (r5 != 0) goto L3
            goto L42
        L3:
            java.lang.Class r0 = r5.getClass()
        L7:
            if (r0 == 0) goto L42
            java.lang.reflect.Method[] r1 = r0.getDeclaredMethods()
            a.G1 r1 = a.C0435w1.I(r1)
        L11:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L3d
            java.lang.Object r2 = r1.next()
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2
            java.lang.String r3 = r2.getName()
            boolean r3 = a.C0193i9.a(r3, r6)
            if (r3 == 0) goto L11
            java.lang.Class[] r3 = r2.getParameterTypes()
            int r3 = r3.length
            int r4 = r7.length
            if (r3 != r4) goto L11
            r3 = 1
            r2.setAccessible(r3)
            int r3 = r7.length     // Catch: java.lang.Exception -> L11
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r7, r3)     // Catch: java.lang.Exception -> L11
            java.lang.Object r5 = r2.invoke(r5, r3)     // Catch: java.lang.Exception -> L11
            return r5
        L3d:
            java.lang.Class r0 = r0.getSuperclass()
            goto L7
        L42:
            r5 = 0
            return r5
    }

    public static final java.lang.Class b(java.lang.ClassLoader r1, java.lang.String r2) {
            java.lang.String r0 = "className"
            a.C0193i9.e(r2, r0)
            java.lang.String r0 = "classLoader"
            a.C0193i9.e(r1, r0)
            java.lang.Class r1 = r1.loadClass(r2)     // Catch: java.lang.Throwable -> Lf
            return r1
        Lf:
            r1 = 0
            return r1
    }

    public static final java.lang.reflect.Field c(java.lang.Class<?> r3, java.lang.Class<?> r4) {
        L0:
            if (r3 == 0) goto L2a
            java.lang.reflect.Field[] r0 = r3.getDeclaredFields()
            a.G1 r0 = a.C0435w1.I(r0)
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L25
            java.lang.Object r1 = r0.next()
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1
            java.lang.Class r2 = r1.getType()
            boolean r2 = a.C0193i9.a(r2, r4)
            if (r2 == 0) goto La
            r3 = 1
            r1.setAccessible(r3)
            return r1
        L25:
            java.lang.Class r3 = r3.getSuperclass()
            goto L0
        L2a:
            r3 = 0
            return r3
    }

    public static final java.lang.reflect.Method d(java.lang.Class<?> r9, java.lang.String r10, java.lang.Object... r11) {
            java.lang.String r0 = "clazz"
            a.C0193i9.e(r9, r0)
            java.lang.String r0 = "methodName"
            a.C0193i9.e(r10, r0)
            java.lang.String r0 = "parameterTypes"
            a.C0193i9.e(r11, r0)
            int r0 = r11.length
            r1 = 0
            r2 = r1
        L12:
            r3 = 1
            r4 = 0
            if (r2 >= r0) goto L4e
            r5 = r11[r2]
            if (r5 != 0) goto L4b
        L1a:
            if (r9 == 0) goto Lb4
            java.lang.reflect.Method[] r0 = r9.getDeclaredMethods()
            a.G1 r0 = a.C0435w1.I(r0)
        L24:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L46
            java.lang.Object r1 = r0.next()
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            java.lang.String r2 = r1.getName()
            boolean r2 = a.C0193i9.a(r2, r10)
            if (r2 == 0) goto L24
            java.lang.Class[] r2 = r1.getParameterTypes()
            int r2 = r2.length
            int r5 = r11.length
            if (r2 != r5) goto L24
            r1.setAccessible(r3)
            return r1
        L46:
            java.lang.Class r9 = r9.getSuperclass()
            goto L1a
        L4b:
            int r2 = r2 + 1
            goto L12
        L4e:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r2 = r11.length
            r0.<init>(r2)
            int r2 = r11.length
            r5 = r1
        L56:
            if (r5 >= r2) goto L83
            r6 = r11[r5]
            boolean r7 = r6 instanceof java.lang.Class
            if (r7 == 0) goto L61
            java.lang.Class r6 = (java.lang.Class) r6
            goto L7d
        L61:
            boolean r7 = r6 instanceof java.lang.String
            if (r7 == 0) goto L75
            java.lang.String r6 = (java.lang.String) r6
            java.lang.ClassLoader r7 = r9.getClassLoader()
            java.lang.String r8 = "getClassLoader(...)"
            a.C0193i9.d(r7, r8)
            java.lang.Class r6 = b(r7, r6)
            goto L7d
        L75:
            if (r6 == 0) goto L7c
            java.lang.Class r6 = r6.getClass()
            goto L7d
        L7c:
            r6 = r4
        L7d:
            r0.add(r6)
            int r5 = r5 + 1
            goto L56
        L83:
            java.lang.Class[] r11 = new java.lang.Class[r1]
            java.lang.Object[] r11 = r0.toArray(r11)
            java.lang.Class[] r11 = (java.lang.Class[]) r11
            int r0 = r11.length     // Catch: java.lang.NoSuchMethodException -> L9a
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r11, r0)     // Catch: java.lang.NoSuchMethodException -> L9a
            java.lang.Class[] r0 = (java.lang.Class[]) r0     // Catch: java.lang.NoSuchMethodException -> L9a
            java.lang.reflect.Method r0 = r9.getDeclaredMethod(r10, r0)     // Catch: java.lang.NoSuchMethodException -> L9a
            r0.setAccessible(r3)     // Catch: java.lang.NoSuchMethodException -> L9a
            return r0
        L9a:
            java.lang.Class r9 = r9.getSuperclass()
        L9e:
            if (r9 == 0) goto Lb4
            int r0 = r11.length     // Catch: java.lang.NoSuchMethodException -> Laf
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r11, r0)     // Catch: java.lang.NoSuchMethodException -> Laf
            java.lang.Class[] r0 = (java.lang.Class[]) r0     // Catch: java.lang.NoSuchMethodException -> Laf
            java.lang.reflect.Method r0 = r9.getDeclaredMethod(r10, r0)     // Catch: java.lang.NoSuchMethodException -> Laf
            r0.setAccessible(r3)     // Catch: java.lang.NoSuchMethodException -> Laf
            return r0
        Laf:
            java.lang.Class r9 = r9.getSuperclass()
            goto L9e
        Lb4:
            return r4
    }

    public static final java.lang.reflect.Method e(java.lang.String r1, java.lang.ClassLoader r2, java.lang.String r3, java.lang.Object... r4) {
            java.lang.String r0 = "className"
            a.C0193i9.e(r1, r0)
            java.lang.String r0 = "classLoader"
            a.C0193i9.e(r2, r0)
            java.lang.String r0 = "methodName"
            a.C0193i9.e(r3, r0)
            java.lang.String r0 = "parameterTypes"
            a.C0193i9.e(r4, r0)
            java.lang.Class r1 = b(r2, r1)
            if (r1 != 0) goto L1c
            r1 = 0
            return r1
        L1c:
            int r2 = r4.length
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r4, r2)
            java.lang.reflect.Method r1 = d(r1, r3, r2)
            return r1
    }

    public static final java.lang.reflect.Method[] f(java.lang.Class<?> r6, a.D7<? super java.lang.reflect.Method, java.lang.Boolean> r7) {
            java.lang.String r0 = "clazz"
            a.C0193i9.e(r6, r0)
            java.lang.reflect.Method[] r6 = r6.getDeclaredMethods()
            java.lang.String r0 = "getDeclaredMethods(...)"
            a.C0193i9.d(r6, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r1 = r6.length
            r2 = 0
            r3 = r2
        L16:
            if (r3 >= r1) goto L2c
            r4 = r6[r3]
            java.lang.Object r5 = r7.f(r4)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L29
            r0.add(r4)
        L29:
            int r3 = r3 + 1
            goto L16
        L2c:
            java.lang.reflect.Method[] r6 = new java.lang.reflect.Method[r2]
            java.lang.Object[] r6 = r0.toArray(r6)
            java.lang.reflect.Method[] r6 = (java.lang.reflect.Method[]) r6
            return r6
    }

    public static final synchronized java.lang.Object g(java.lang.Object r3) {
            java.lang.String r0 = "wxmask_origin_user"
            java.lang.Class<a.A1> r1 = a.A1.class
            monitor-enter(r1)
            java.util.WeakHashMap<java.lang.Object, java.util.Map<java.lang.String, java.lang.Object>> r2 = a.A1.f6a     // Catch: java.lang.Throwable -> L14
            java.lang.Object r3 = r2.get(r3)     // Catch: java.lang.Throwable -> L14
            java.util.Map r3 = (java.util.Map) r3     // Catch: java.lang.Throwable -> L14
            if (r3 == 0) goto L16
            java.lang.Object r3 = r3.get(r0)     // Catch: java.lang.Throwable -> L14
            goto L17
        L14:
            r3 = move-exception
            goto L19
        L16:
            r3 = 0
        L17:
            monitor-exit(r1)
            return r3
        L19:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L14
            throw r3
    }

    public static final java.lang.Object h(java.lang.Object r4, java.lang.String r5) {
            java.lang.String r0 = "fieldName"
            a.C0193i9.e(r5, r0)
            r0 = 0
            if (r4 != 0) goto L9
            return r0
        L9:
            java.lang.Class r1 = r4.getClass()
        Ld:
            if (r1 == 0) goto L21
            java.lang.reflect.Field r2 = r1.getDeclaredField(r5)     // Catch: java.lang.NoSuchFieldException -> L1c
            r3 = 1
            r2.setAccessible(r3)     // Catch: java.lang.NoSuchFieldException -> L1c
            java.lang.Object r4 = r2.get(r4)     // Catch: java.lang.NoSuchFieldException -> L1c
            return r4
        L1c:
            java.lang.Class r1 = r1.getSuperclass()
            goto Ld
        L21:
            return r0
    }

    public static final void i(java.lang.Object r3, java.lang.String r4, java.lang.String r5) {
            java.lang.String r0 = "fieldName"
            a.C0193i9.e(r4, r0)
            if (r3 != 0) goto L8
            goto L1f
        L8:
            java.lang.Class r0 = r3.getClass()
        Lc:
            if (r0 == 0) goto L1f
            java.lang.reflect.Field r1 = r0.getDeclaredField(r4)     // Catch: java.lang.NoSuchFieldException -> L1a
            r2 = 1
            r1.setAccessible(r2)     // Catch: java.lang.NoSuchFieldException -> L1a
            r1.set(r3, r5)     // Catch: java.lang.NoSuchFieldException -> L1a
            goto L1f
        L1a:
            java.lang.Class r0 = r0.getSuperclass()
            goto Lc
        L1f:
            return
    }
}
