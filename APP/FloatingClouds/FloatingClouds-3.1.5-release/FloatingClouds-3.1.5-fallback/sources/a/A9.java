package a;

/* JADX INFO: loaded from: classes.dex */
public final class A9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final java.util.HashMap f14a = null;
    public static final java.util.HashMap b = null;

    static {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            a.A9.f14a = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            a.A9.b = r0
            return
    }

    public static androidx.lifecycle.b a(java.lang.reflect.Constructor r0, a.InterfaceC0461x9 r1) {
            java.lang.Object[] r1 = new java.lang.Object[]{r1}     // Catch: java.lang.reflect.InvocationTargetException -> L10 java.lang.InstantiationException -> L17 java.lang.IllegalAccessException -> L1e
            java.lang.Object r0 = r0.newInstance(r1)     // Catch: java.lang.reflect.InvocationTargetException -> L10 java.lang.InstantiationException -> L17 java.lang.IllegalAccessException -> L1e
            java.lang.String r1 = "{\n            constructo…tance(`object`)\n        }"
            a.C0193i9.d(r0, r1)     // Catch: java.lang.reflect.InvocationTargetException -> L10 java.lang.InstantiationException -> L17 java.lang.IllegalAccessException -> L1e
            androidx.lifecycle.b r0 = (androidx.lifecycle.b) r0     // Catch: java.lang.reflect.InvocationTargetException -> L10 java.lang.InstantiationException -> L17 java.lang.IllegalAccessException -> L1e
            return r0
        L10:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
        L17:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
        L1e:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
    }

    public static int b(java.lang.Class r13) {
            java.util.HashMap r0 = a.A9.f14a
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
            java.lang.Package r3 = r13.getPackage()     // Catch: java.lang.NoSuchMethodException -> L8d java.lang.ClassNotFoundException -> L94
            java.lang.String r4 = r13.getCanonicalName()     // Catch: java.lang.NoSuchMethodException -> L8d java.lang.ClassNotFoundException -> L94
            if (r3 == 0) goto L28
            java.lang.String r3 = r3.getName()     // Catch: java.lang.NoSuchMethodException -> L8d java.lang.ClassNotFoundException -> L94
            goto L2a
        L28:
            java.lang.String r3 = ""
        L2a:
            java.lang.String r5 = "fullPackage"
            a.C0193i9.d(r3, r5)     // Catch: java.lang.NoSuchMethodException -> L8d java.lang.ClassNotFoundException -> L94
            int r5 = r3.length()     // Catch: java.lang.NoSuchMethodException -> L8d java.lang.ClassNotFoundException -> L94
            if (r5 != 0) goto L36
            goto L49
        L36:
            java.lang.String r5 = "name"
            a.C0193i9.d(r4, r5)     // Catch: java.lang.NoSuchMethodException -> L8d java.lang.ClassNotFoundException -> L94
            int r5 = r3.length()     // Catch: java.lang.NoSuchMethodException -> L8d java.lang.ClassNotFoundException -> L94
            int r5 = r5 + r2
            java.lang.String r4 = r4.substring(r5)     // Catch: java.lang.NoSuchMethodException -> L8d java.lang.ClassNotFoundException -> L94
            java.lang.String r5 = "this as java.lang.String).substring(startIndex)"
            a.C0193i9.d(r4, r5)     // Catch: java.lang.NoSuchMethodException -> L8d java.lang.ClassNotFoundException -> L94
        L49:
            java.lang.String r5 = "if (fullPackage.isEmpty(…g(fullPackage.length + 1)"
            a.C0193i9.d(r4, r5)     // Catch: java.lang.NoSuchMethodException -> L8d java.lang.ClassNotFoundException -> L94
            java.lang.String r5 = "."
            java.lang.String r6 = "_"
            java.lang.String r4 = a.Ae.G(r4, r5, r6)     // Catch: java.lang.NoSuchMethodException -> L8d java.lang.ClassNotFoundException -> L94
            java.lang.String r5 = "_LifecycleAdapter"
            java.lang.String r4 = r4.concat(r5)     // Catch: java.lang.NoSuchMethodException -> L8d java.lang.ClassNotFoundException -> L94
            int r5 = r3.length()     // Catch: java.lang.NoSuchMethodException -> L8d java.lang.ClassNotFoundException -> L94
            if (r5 != 0) goto L63
            goto L77
        L63:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.NoSuchMethodException -> L8d java.lang.ClassNotFoundException -> L94
            r5.<init>()     // Catch: java.lang.NoSuchMethodException -> L8d java.lang.ClassNotFoundException -> L94
            r5.append(r3)     // Catch: java.lang.NoSuchMethodException -> L8d java.lang.ClassNotFoundException -> L94
            r3 = 46
            r5.append(r3)     // Catch: java.lang.NoSuchMethodException -> L8d java.lang.ClassNotFoundException -> L94
            r5.append(r4)     // Catch: java.lang.NoSuchMethodException -> L8d java.lang.ClassNotFoundException -> L94
            java.lang.String r4 = r5.toString()     // Catch: java.lang.NoSuchMethodException -> L8d java.lang.ClassNotFoundException -> L94
        L77:
            java.lang.Class r3 = java.lang.Class.forName(r4)     // Catch: java.lang.NoSuchMethodException -> L8d java.lang.ClassNotFoundException -> L94
            java.lang.Class[] r4 = new java.lang.Class[]{r13}     // Catch: java.lang.NoSuchMethodException -> L8d java.lang.ClassNotFoundException -> L94
            java.lang.reflect.Constructor r3 = r3.getDeclaredConstructor(r4)     // Catch: java.lang.NoSuchMethodException -> L8d java.lang.ClassNotFoundException -> L94
            boolean r4 = r3.isAccessible()     // Catch: java.lang.NoSuchMethodException -> L8d java.lang.ClassNotFoundException -> L94
            if (r4 != 0) goto L95
            r3.setAccessible(r2)     // Catch: java.lang.NoSuchMethodException -> L8d java.lang.ClassNotFoundException -> L94
            goto L95
        L8d:
            r13 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r13)
            throw r0
        L94:
            r3 = r1
        L95:
            java.util.HashMap r4 = a.A9.b
            r5 = 2
            if (r3 == 0) goto La4
            java.util.List r1 = a.C0435w1.K(r3)
            r4.put(r13, r1)
        La1:
            r2 = r5
            goto L14f
        La4:
            androidx.lifecycle.a r3 = androidx.lifecycle.a.c
            java.util.HashMap r6 = r3.b
            java.lang.Object r7 = r6.get(r13)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            r8 = 0
            if (r7 == 0) goto Lb6
            boolean r3 = r7.booleanValue()
            goto Ld8
        Lb6:
            java.lang.reflect.Method[] r7 = r13.getDeclaredMethods()     // Catch: java.lang.NoClassDefFoundError -> L157
            int r9 = r7.length
            r10 = r8
        Lbc:
            if (r10 >= r9) goto Ld2
            r11 = r7[r10]
            java.lang.Class<androidx.lifecycle.i> r12 = androidx.lifecycle.i.class
            java.lang.annotation.Annotation r11 = r11.getAnnotation(r12)
            androidx.lifecycle.i r11 = (androidx.lifecycle.i) r11
            if (r11 == 0) goto Lcf
            r3.a(r13, r7)
            r3 = r2
            goto Ld8
        Lcf:
            int r10 = r10 + 1
            goto Lbc
        Ld2:
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            r6.put(r13, r3)
            r3 = r8
        Ld8:
            if (r3 == 0) goto Ldc
            goto L14f
        Ldc:
            java.lang.Class r3 = r13.getSuperclass()
            java.lang.Class<a.x9> r6 = a.InterfaceC0461x9.class
            if (r3 == 0) goto Lec
            boolean r7 = r6.isAssignableFrom(r3)
            if (r7 == 0) goto Lec
            r7 = r2
            goto Led
        Lec:
            r7 = r8
        Led:
            if (r7 == 0) goto L109
            java.lang.String r1 = "superclass"
            a.C0193i9.d(r3, r1)
            int r1 = b(r3)
            if (r1 != r2) goto Lfb
            goto L14f
        Lfb:
            java.util.ArrayList r1 = new java.util.ArrayList
            java.lang.Object r3 = r4.get(r3)
            a.C0193i9.b(r3)
            java.util.Collection r3 = (java.util.Collection) r3
            r1.<init>(r3)
        L109:
            java.lang.Class[] r3 = r13.getInterfaces()
            java.lang.String r7 = "klass.interfaces"
            a.C0193i9.d(r3, r7)
            int r7 = r3.length
            r9 = r8
        L114:
            if (r9 >= r7) goto L148
            r10 = r3[r9]
            if (r10 == 0) goto L122
            boolean r11 = r6.isAssignableFrom(r10)
            if (r11 == 0) goto L122
            r11 = r2
            goto L123
        L122:
            r11 = r8
        L123:
            if (r11 != 0) goto L126
            goto L145
        L126:
            java.lang.String r11 = "intrface"
            a.C0193i9.d(r10, r11)
            int r11 = b(r10)
            if (r11 != r2) goto L132
            goto L14f
        L132:
            if (r1 != 0) goto L139
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        L139:
            java.lang.Object r10 = r4.get(r10)
            a.C0193i9.b(r10)
            java.util.Collection r10 = (java.util.Collection) r10
            r1.addAll(r10)
        L145:
            int r9 = r9 + 1
            goto L114
        L148:
            if (r1 == 0) goto L14f
            r4.put(r13, r1)
            goto La1
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
