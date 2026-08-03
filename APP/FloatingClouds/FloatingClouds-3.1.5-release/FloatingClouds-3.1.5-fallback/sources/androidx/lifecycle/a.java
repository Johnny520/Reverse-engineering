package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
@java.lang.Deprecated
public final class a {
    public static final androidx.lifecycle.a c = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.HashMap f929a;
    public final java.util.HashMap b;

    /* JADX INFO: renamed from: androidx.lifecycle.a$a, reason: collision with other inner class name */
    @java.lang.Deprecated
    public static class C0019a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final java.util.HashMap f930a;
        public final java.util.HashMap b;

        public C0019a(java.util.HashMap r5) {
                r4 = this;
                r4.<init>()
                r4.b = r5
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                r4.f930a = r0
                java.util.Set r5 = r5.entrySet()
                java.util.Iterator r5 = r5.iterator()
            L14:
                boolean r0 = r5.hasNext()
                if (r0 == 0) goto L44
                java.lang.Object r0 = r5.next()
                java.util.Map$Entry r0 = (java.util.Map.Entry) r0
                java.lang.Object r1 = r0.getValue()
                androidx.lifecycle.e$a r1 = (androidx.lifecycle.e.a) r1
                java.util.HashMap r2 = r4.f930a
                java.lang.Object r2 = r2.get(r1)
                java.util.List r2 = (java.util.List) r2
                if (r2 != 0) goto L3a
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>()
                java.util.HashMap r3 = r4.f930a
                r3.put(r1, r2)
            L3a:
                java.lang.Object r0 = r0.getKey()
                androidx.lifecycle.a$b r0 = (androidx.lifecycle.a.b) r0
                r2.add(r0)
                goto L14
            L44:
                return
        }

        public static void a(java.util.List r5, a.InterfaceC0479y9 r6, androidx.lifecycle.e.a r7, a.InterfaceC0461x9 r8) {
                if (r5 == 0) goto L4a
                int r0 = r5.size()
                r1 = 1
                int r0 = r0 - r1
            L8:
                if (r0 < 0) goto L4a
                java.lang.Object r2 = r5.get(r0)
                androidx.lifecycle.a$b r2 = (androidx.lifecycle.a.b) r2
                r2.getClass()
                int r3 = r2.f931a     // Catch: java.lang.IllegalAccessException -> L36 java.lang.reflect.InvocationTargetException -> L3d
                java.lang.reflect.Method r2 = r2.b
                if (r3 == 0) goto L2f
                if (r3 == r1) goto L27
                r4 = 2
                if (r3 == r4) goto L1f
                goto L33
            L1f:
                java.lang.Object[] r3 = new java.lang.Object[]{r6, r7}     // Catch: java.lang.IllegalAccessException -> L36 java.lang.reflect.InvocationTargetException -> L3d
                r2.invoke(r8, r3)     // Catch: java.lang.IllegalAccessException -> L36 java.lang.reflect.InvocationTargetException -> L3d
                goto L33
            L27:
                java.lang.Object[] r3 = new java.lang.Object[]{r6}     // Catch: java.lang.IllegalAccessException -> L36 java.lang.reflect.InvocationTargetException -> L3d
                r2.invoke(r8, r3)     // Catch: java.lang.IllegalAccessException -> L36 java.lang.reflect.InvocationTargetException -> L3d
                goto L33
            L2f:
                r3 = 0
                r2.invoke(r8, r3)     // Catch: java.lang.IllegalAccessException -> L36 java.lang.reflect.InvocationTargetException -> L3d
            L33:
                int r0 = r0 + (-1)
                goto L8
            L36:
                r5 = move-exception
                java.lang.RuntimeException r6 = new java.lang.RuntimeException
                r6.<init>(r5)
                throw r6
            L3d:
                r5 = move-exception
                java.lang.RuntimeException r6 = new java.lang.RuntimeException
                java.lang.String r7 = "Failed to call observer method"
                java.lang.Throwable r5 = r5.getCause()
                r6.<init>(r7, r5)
                throw r6
            L4a:
                return
        }
    }

    @java.lang.Deprecated
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f931a;
        public final java.lang.reflect.Method b;

        public b(int r1, java.lang.reflect.Method r2) {
                r0 = this;
                r0.<init>()
                r0.f931a = r1
                r0.b = r2
                r1 = 1
                r2.setAccessible(r1)
                return
        }

        public final boolean equals(java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                boolean r1 = r5 instanceof androidx.lifecycle.a.b
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                androidx.lifecycle.a$b r5 = (androidx.lifecycle.a.b) r5
                int r1 = r5.f931a
                int r3 = r4.f931a
                if (r3 != r1) goto L25
                java.lang.reflect.Method r1 = r4.b
                java.lang.String r1 = r1.getName()
                java.lang.reflect.Method r5 = r5.b
                java.lang.String r5 = r5.getName()
                boolean r5 = r1.equals(r5)
                if (r5 == 0) goto L25
                return r0
            L25:
                return r2
        }

        public final int hashCode() {
                r2 = this;
                int r0 = r2.f931a
                int r0 = r0 * 31
                java.lang.reflect.Method r1 = r2.b
                java.lang.String r1 = r1.getName()
                int r1 = r1.hashCode()
                int r1 = r1 + r0
                return r1
        }
    }

    static {
            androidx.lifecycle.a r0 = new androidx.lifecycle.a
            r0.<init>()
            androidx.lifecycle.a.c = r0
            return
    }

    public a() {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.f929a = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.b = r0
            return
    }

    public static void b(java.util.HashMap r3, androidx.lifecycle.a.b r4, androidx.lifecycle.e.a r5, java.lang.Class r6) {
            java.lang.Object r0 = r3.get(r4)
            androidx.lifecycle.e$a r0 = (androidx.lifecycle.e.a) r0
            if (r0 == 0) goto L41
            if (r5 != r0) goto Lb
            goto L41
        Lb:
            java.lang.reflect.Method r3 = r4.b
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Method "
            r1.<init>(r2)
            java.lang.String r3 = r3.getName()
            r1.append(r3)
            java.lang.String r3 = " in "
            r1.append(r3)
            java.lang.String r3 = r6.getName()
            r1.append(r3)
            java.lang.String r3 = " already declared with different @OnLifecycleEvent value: previous value "
            r1.append(r3)
            r1.append(r0)
            java.lang.String r3 = ", new value "
            r1.append(r3)
            r1.append(r5)
            java.lang.String r3 = r1.toString()
            r4.<init>(r3)
            throw r4
        L41:
            if (r0 != 0) goto L46
            r3.put(r4, r5)
        L46:
            return
    }

    public final androidx.lifecycle.a.C0019a a(java.lang.Class<?> r13, java.lang.reflect.Method[] r14) {
            r12 = this;
            java.lang.Class r0 = r13.getSuperclass()
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r2 = 0
            java.util.HashMap r3 = r12.f929a
            if (r0 == 0) goto L20
            java.lang.Object r4 = r3.get(r0)
            androidx.lifecycle.a$a r4 = (androidx.lifecycle.a.C0019a) r4
            if (r4 == 0) goto L17
            goto L1b
        L17:
            androidx.lifecycle.a$a r4 = r12.a(r0, r2)
        L1b:
            java.util.HashMap r0 = r4.b
            r1.putAll(r0)
        L20:
            java.lang.Class[] r0 = r13.getInterfaces()
            int r4 = r0.length
            r5 = 0
            r6 = r5
        L27:
            if (r6 >= r4) goto L61
            r7 = r0[r6]
            java.lang.Object r8 = r3.get(r7)
            androidx.lifecycle.a$a r8 = (androidx.lifecycle.a.C0019a) r8
            if (r8 == 0) goto L34
            goto L38
        L34:
            androidx.lifecycle.a$a r8 = r12.a(r7, r2)
        L38:
            java.util.HashMap r7 = r8.b
            java.util.Set r7 = r7.entrySet()
            java.util.Iterator r7 = r7.iterator()
        L42:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L5e
            java.lang.Object r8 = r7.next()
            java.util.Map$Entry r8 = (java.util.Map.Entry) r8
            java.lang.Object r9 = r8.getKey()
            androidx.lifecycle.a$b r9 = (androidx.lifecycle.a.b) r9
            java.lang.Object r8 = r8.getValue()
            androidx.lifecycle.e$a r8 = (androidx.lifecycle.e.a) r8
            b(r1, r9, r8, r13)
            goto L42
        L5e:
            int r6 = r6 + 1
            goto L27
        L61:
            if (r14 == 0) goto L64
            goto L68
        L64:
            java.lang.reflect.Method[] r14 = r13.getDeclaredMethods()     // Catch: java.lang.NoClassDefFoundError -> Le8
        L68:
            int r0 = r14.length
            r2 = r5
            r4 = r2
        L6b:
            if (r2 >= r0) goto Ld6
            r6 = r14[r2]
            java.lang.Class<androidx.lifecycle.i> r7 = androidx.lifecycle.i.class
            java.lang.annotation.Annotation r7 = r6.getAnnotation(r7)
            androidx.lifecycle.i r7 = (androidx.lifecycle.i) r7
            if (r7 != 0) goto L7a
            goto Lcb
        L7a:
            java.lang.Class[] r4 = r6.getParameterTypes()
            int r8 = r4.length
            r9 = 1
            if (r8 <= 0) goto L96
            java.lang.Class<a.y9> r8 = a.InterfaceC0479y9.class
            r10 = r4[r5]
            boolean r8 = r8.isAssignableFrom(r10)
            if (r8 == 0) goto L8e
            r8 = r9
            goto L97
        L8e:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.String r14 = "invalid parameter type. Must be one and instanceof LifecycleOwner"
            r13.<init>(r14)
            throw r13
        L96:
            r8 = r5
        L97:
            androidx.lifecycle.e$a r7 = r7.value()
            int r10 = r4.length
            r11 = 2
            if (r10 <= r9) goto Lbf
            java.lang.Class<androidx.lifecycle.e$a> r8 = androidx.lifecycle.e.a.class
            r10 = r4[r9]
            boolean r8 = r8.isAssignableFrom(r10)
            if (r8 == 0) goto Lb7
            androidx.lifecycle.e$a r8 = androidx.lifecycle.e.a.ON_ANY
            if (r7 != r8) goto Laf
            r8 = r11
            goto Lbf
        Laf:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.String r14 = "Second arg is supported only for ON_ANY value"
            r13.<init>(r14)
            throw r13
        Lb7:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.String r14 = "invalid parameter type. second arg must be an event"
            r13.<init>(r14)
            throw r13
        Lbf:
            int r4 = r4.length
            if (r4 > r11) goto Lce
            androidx.lifecycle.a$b r4 = new androidx.lifecycle.a$b
            r4.<init>(r8, r6)
            b(r1, r4, r7, r13)
            r4 = r9
        Lcb:
            int r2 = r2 + 1
            goto L6b
        Lce:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.String r14 = "cannot have more than 2 params"
            r13.<init>(r14)
            throw r13
        Ld6:
            androidx.lifecycle.a$a r14 = new androidx.lifecycle.a$a
            r14.<init>(r1)
            r3.put(r13, r14)
            java.util.HashMap r0 = r12.b
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r4)
            r0.put(r13, r1)
            return r14
        Le8:
            r13 = move-exception
            java.lang.IllegalArgumentException r14 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor."
            r14.<init>(r0, r13)
            throw r14
    }
}
