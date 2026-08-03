package androidx.lifecycle;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final java.util.HashMap f307a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final java.util.HashMap f308b = null;

    static {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            androidx.lifecycle.t.f307a = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            androidx.lifecycle.t.f308b = r0
            return
    }

    public static void a(java.lang.reflect.Constructor r0, androidx.lifecycle.p r1) {
            java.lang.Object[] r1 = new java.lang.Object[]{r1}     // Catch: java.lang.reflect.InvocationTargetException -> L11 java.lang.InstantiationException -> L18 java.lang.IllegalAccessException -> L1f
            java.lang.Object r0 = r0.newInstance(r1)     // Catch: java.lang.reflect.InvocationTargetException -> L11 java.lang.InstantiationException -> L18 java.lang.IllegalAccessException -> L1f
            r0.getClass()     // Catch: java.lang.reflect.InvocationTargetException -> L11 java.lang.InstantiationException -> L18 java.lang.IllegalAccessException -> L1f
            java.lang.ClassCastException r0 = new java.lang.ClassCastException     // Catch: java.lang.reflect.InvocationTargetException -> L11 java.lang.InstantiationException -> L18 java.lang.IllegalAccessException -> L1f
            r0.<init>()     // Catch: java.lang.reflect.InvocationTargetException -> L11 java.lang.InstantiationException -> L18 java.lang.IllegalAccessException -> L1f
            throw r0     // Catch: java.lang.reflect.InvocationTargetException -> L11 java.lang.InstantiationException -> L18 java.lang.IllegalAccessException -> L1f
        L11:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
        L18:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
        L1f:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
    }

    public static int b(java.lang.Class r13) {
            java.util.HashMap r0 = androidx.lifecycle.t.f307a
            java.lang.Object r1 = r0.get(r13)
            java.lang.Integer r1 = (java.lang.Integer) r1
            if (r1 == 0) goto Lf
            int r13 = r1.intValue()
            return r13
        Lf:
            java.lang.String r1 = r13.getCanonicalName()
            r2 = 1
            if (r1 != 0) goto L18
            goto L14f
        L18:
            r1 = 0
            r3 = 0
            java.lang.Package r4 = r13.getPackage()     // Catch: java.lang.NoSuchMethodException -> L83 java.lang.ClassNotFoundException -> L8a
            java.lang.String r5 = r13.getCanonicalName()     // Catch: java.lang.NoSuchMethodException -> L83 java.lang.ClassNotFoundException -> L8a
            if (r4 == 0) goto L29
            java.lang.String r4 = r4.getName()     // Catch: java.lang.NoSuchMethodException -> L83 java.lang.ClassNotFoundException -> L8a
            goto L2b
        L29:
            java.lang.String r4 = ""
        L2b:
            r4.getClass()     // Catch: java.lang.NoSuchMethodException -> L83 java.lang.ClassNotFoundException -> L8a
            int r6 = r4.length()     // Catch: java.lang.NoSuchMethodException -> L83 java.lang.ClassNotFoundException -> L8a
            if (r6 != 0) goto L35
            goto L41
        L35:
            r5.getClass()     // Catch: java.lang.NoSuchMethodException -> L83 java.lang.ClassNotFoundException -> L8a
            int r6 = r4.length()     // Catch: java.lang.NoSuchMethodException -> L83 java.lang.ClassNotFoundException -> L8a
            int r6 = r6 + r2
            java.lang.String r5 = r5.substring(r6)     // Catch: java.lang.NoSuchMethodException -> L83 java.lang.ClassNotFoundException -> L8a
        L41:
            r5.getClass()     // Catch: java.lang.NoSuchMethodException -> L83 java.lang.ClassNotFoundException -> L8a
            java.lang.String r6 = "."
            java.lang.String r7 = "_"
            java.lang.String r5 = og.t.a0(r5, r6, r7, r1)     // Catch: java.lang.NoSuchMethodException -> L83 java.lang.ClassNotFoundException -> L8a
            java.lang.String r6 = "_LifecycleAdapter"
            java.lang.String r5 = r5.concat(r6)     // Catch: java.lang.NoSuchMethodException -> L83 java.lang.ClassNotFoundException -> L8a
            int r6 = r4.length()     // Catch: java.lang.NoSuchMethodException -> L83 java.lang.ClassNotFoundException -> L8a
            if (r6 != 0) goto L59
            goto L6d
        L59:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.NoSuchMethodException -> L83 java.lang.ClassNotFoundException -> L8a
            r6.<init>()     // Catch: java.lang.NoSuchMethodException -> L83 java.lang.ClassNotFoundException -> L8a
            r6.append(r4)     // Catch: java.lang.NoSuchMethodException -> L83 java.lang.ClassNotFoundException -> L8a
            r4 = 46
            r6.append(r4)     // Catch: java.lang.NoSuchMethodException -> L83 java.lang.ClassNotFoundException -> L8a
            r6.append(r5)     // Catch: java.lang.NoSuchMethodException -> L83 java.lang.ClassNotFoundException -> L8a
            java.lang.String r5 = r6.toString()     // Catch: java.lang.NoSuchMethodException -> L83 java.lang.ClassNotFoundException -> L8a
        L6d:
            java.lang.Class r4 = java.lang.Class.forName(r5)     // Catch: java.lang.NoSuchMethodException -> L83 java.lang.ClassNotFoundException -> L8a
            java.lang.Class[] r5 = new java.lang.Class[]{r13}     // Catch: java.lang.NoSuchMethodException -> L83 java.lang.ClassNotFoundException -> L8a
            java.lang.reflect.Constructor r4 = r4.getDeclaredConstructor(r5)     // Catch: java.lang.NoSuchMethodException -> L83 java.lang.ClassNotFoundException -> L8a
            boolean r5 = r4.isAccessible()     // Catch: java.lang.NoSuchMethodException -> L83 java.lang.ClassNotFoundException -> L8a
            if (r5 != 0) goto L8b
            r4.setAccessible(r2)     // Catch: java.lang.NoSuchMethodException -> L83 java.lang.ClassNotFoundException -> L8a
            goto L8b
        L83:
            r13 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r13)
            throw r0
        L8a:
            r4 = r3
        L8b:
            r5 = 2
            java.util.HashMap r6 = androidx.lifecycle.t.f308b
            if (r4 == 0) goto L9a
            java.util.List r1 = a.a.x0(r4)
            r6.put(r13, r1)
        L97:
            r2 = r5
            goto L14f
        L9a:
            androidx.lifecycle.c r4 = androidx.lifecycle.c.f277c
            java.util.HashMap r7 = r4.f279b
            java.lang.Object r8 = r7.get(r13)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            if (r8 == 0) goto Lab
            boolean r4 = r8.booleanValue()
            goto Lcd
        Lab:
            java.lang.reflect.Method[] r8 = r13.getDeclaredMethods()     // Catch: java.lang.NoClassDefFoundError -> L157
            int r9 = r8.length
            r10 = r1
        Lb1:
            if (r10 >= r9) goto Lc7
            r11 = r8[r10]
            java.lang.Class<androidx.lifecycle.u> r12 = androidx.lifecycle.u.class
            java.lang.annotation.Annotation r11 = r11.getAnnotation(r12)
            androidx.lifecycle.u r11 = (androidx.lifecycle.u) r11
            if (r11 == 0) goto Lc4
            r4.a(r13, r8)
            r4 = r2
            goto Lcd
        Lc4:
            int r10 = r10 + 1
            goto Lb1
        Lc7:
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            r7.put(r13, r4)
            r4 = r1
        Lcd:
            if (r4 == 0) goto Ld1
            goto L14f
        Ld1:
            java.lang.Class r4 = r13.getSuperclass()
            java.lang.Class<androidx.lifecycle.p> r7 = androidx.lifecycle.p.class
            if (r4 == 0) goto Le1
            boolean r8 = r7.isAssignableFrom(r4)
            if (r8 == 0) goto Le1
            r8 = r2
            goto Le2
        Le1:
            r8 = r1
        Le2:
            if (r8 == 0) goto Lfd
            r4.getClass()
            int r3 = b(r4)
            if (r3 != r2) goto Lef
            goto L14f
        Lef:
            java.util.ArrayList r3 = new java.util.ArrayList
            java.lang.Object r4 = r6.get(r4)
            r4.getClass()
            java.util.Collection r4 = (java.util.Collection) r4
            r3.<init>(r4)
        Lfd:
            java.lang.Class[] r4 = r13.getInterfaces()
            r4.getClass()
            r8 = r1
        L105:
            int r9 = r4.length
            if (r8 >= r9) goto L10a
            r9 = r2
            goto L10b
        L10a:
            r9 = r1
        L10b:
            if (r9 == 0) goto L148
            int r9 = r8 + 1
            r8 = r4[r8]     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L13e
            if (r8 == 0) goto L11b
            boolean r10 = r7.isAssignableFrom(r8)
            if (r10 == 0) goto L11b
            r10 = r2
            goto L11c
        L11b:
            r10 = r1
        L11c:
            if (r10 != 0) goto L120
        L11e:
            r8 = r9
            goto L105
        L120:
            r8.getClass()
            int r10 = b(r8)
            if (r10 != r2) goto L12a
            goto L14f
        L12a:
            if (r3 != 0) goto L131
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
        L131:
            java.lang.Object r8 = r6.get(r8)
            r8.getClass()
            java.util.Collection r8 = (java.util.Collection) r8
            r3.addAll(r8)
            goto L11e
        L13e:
            r13 = move-exception
            java.lang.String r13 = r13.getMessage()
            j8.o.l(r13)
            r13 = 0
            return r13
        L148:
            if (r3 == 0) goto L14f
            r6.put(r13, r3)
            goto L97
        L14f:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            r0.put(r13, r1)
            return r2
        L157:
            r13 = move-exception
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor."
            r0.<init>(r1, r13)
            throw r0
    }
}
