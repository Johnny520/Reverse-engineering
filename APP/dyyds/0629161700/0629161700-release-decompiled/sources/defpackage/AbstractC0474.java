package defpackage;

/* JADX INFO: renamed from: ᛳᛵᛱᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0474 {

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static final java.util.HashMap f2393 = null;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public static final java.util.HashMap f2394 = null;

    static {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            defpackage.AbstractC0474.f2393 = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            defpackage.AbstractC0474.f2394 = r0
            return
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static void m1244(java.lang.reflect.Constructor r0, java.lang.Object r1) {
            java.lang.Object[] r1 = new java.lang.Object[]{r1}     // Catch: java.lang.reflect.InvocationTargetException -> Ld java.lang.InstantiationException -> L14 java.lang.IllegalAccessException -> L1b
            r0.newInstance(r1)     // Catch: java.lang.reflect.InvocationTargetException -> Ld java.lang.InstantiationException -> L14 java.lang.IllegalAccessException -> L1b
            java.lang.ClassCastException r0 = new java.lang.ClassCastException     // Catch: java.lang.reflect.InvocationTargetException -> Ld java.lang.InstantiationException -> L14 java.lang.IllegalAccessException -> L1b
            r0.<init>()     // Catch: java.lang.reflect.InvocationTargetException -> Ld java.lang.InstantiationException -> L14 java.lang.IllegalAccessException -> L1b
            throw r0     // Catch: java.lang.reflect.InvocationTargetException -> Ld java.lang.InstantiationException -> L14 java.lang.IllegalAccessException -> L1b
        Ld:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
        L14:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
        L1b:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public static int m1245(java.lang.Class r13) {
            java.util.HashMap r0 = defpackage.AbstractC0474.f2393
            java.lang.Object r1 = r0.get(r13)
            java.lang.Integer r1 = (java.lang.Integer) r1
            if (r1 == 0) goto Lf
            int r13 = r1.intValue()
            return r13
        Lf:
            java.lang.String r1 = r13.getCanonicalName()
            r2 = 1
            if (r1 != 0) goto L18
            goto L119
        L18:
            r1 = 0
            java.lang.Package r3 = r13.getPackage()     // Catch: java.lang.NoSuchMethodException -> L79 java.lang.ClassNotFoundException -> L80
            java.lang.String r4 = r13.getCanonicalName()     // Catch: java.lang.NoSuchMethodException -> L79 java.lang.ClassNotFoundException -> L80
            if (r3 == 0) goto L28
            java.lang.String r3 = r3.getName()     // Catch: java.lang.NoSuchMethodException -> L79 java.lang.ClassNotFoundException -> L80
            goto L2a
        L28:
            java.lang.String r3 = ""
        L2a:
            int r5 = r3.length()     // Catch: java.lang.NoSuchMethodException -> L79 java.lang.ClassNotFoundException -> L80
            if (r5 != 0) goto L31
            goto L3a
        L31:
            int r5 = r3.length()     // Catch: java.lang.NoSuchMethodException -> L79 java.lang.ClassNotFoundException -> L80
            int r5 = r5 + r2
            java.lang.String r4 = r4.substring(r5)     // Catch: java.lang.NoSuchMethodException -> L79 java.lang.ClassNotFoundException -> L80
        L3a:
            java.lang.String r5 = "."
            java.lang.String r6 = "_"
            java.lang.String r4 = defpackage.AbstractC0651.m1485(r4, r5, r6)     // Catch: java.lang.NoSuchMethodException -> L79 java.lang.ClassNotFoundException -> L80
            java.lang.String r5 = "_LifecycleAdapter"
            java.lang.String r4 = r4.concat(r5)     // Catch: java.lang.NoSuchMethodException -> L79 java.lang.ClassNotFoundException -> L80
            int r5 = r3.length()     // Catch: java.lang.NoSuchMethodException -> L79 java.lang.ClassNotFoundException -> L80
            if (r5 != 0) goto L4f
            goto L63
        L4f:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.NoSuchMethodException -> L79 java.lang.ClassNotFoundException -> L80
            r5.<init>()     // Catch: java.lang.NoSuchMethodException -> L79 java.lang.ClassNotFoundException -> L80
            r5.append(r3)     // Catch: java.lang.NoSuchMethodException -> L79 java.lang.ClassNotFoundException -> L80
            r3 = 46
            r5.append(r3)     // Catch: java.lang.NoSuchMethodException -> L79 java.lang.ClassNotFoundException -> L80
            r5.append(r4)     // Catch: java.lang.NoSuchMethodException -> L79 java.lang.ClassNotFoundException -> L80
            java.lang.String r4 = r5.toString()     // Catch: java.lang.NoSuchMethodException -> L79 java.lang.ClassNotFoundException -> L80
        L63:
            java.lang.Class r3 = java.lang.Class.forName(r4)     // Catch: java.lang.NoSuchMethodException -> L79 java.lang.ClassNotFoundException -> L80
            java.lang.Class[] r4 = new java.lang.Class[]{r13}     // Catch: java.lang.NoSuchMethodException -> L79 java.lang.ClassNotFoundException -> L80
            java.lang.reflect.Constructor r3 = r3.getDeclaredConstructor(r4)     // Catch: java.lang.NoSuchMethodException -> L79 java.lang.ClassNotFoundException -> L80
            boolean r4 = r3.isAccessible()     // Catch: java.lang.NoSuchMethodException -> L79 java.lang.ClassNotFoundException -> L80
            if (r4 != 0) goto L81
            r3.setAccessible(r2)     // Catch: java.lang.NoSuchMethodException -> L79 java.lang.ClassNotFoundException -> L80
            goto L81
        L79:
            r13 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r13)
            throw r0
        L80:
            r3 = r1
        L81:
            r4 = 2
            java.util.HashMap r5 = defpackage.AbstractC0474.f2394
            if (r3 == 0) goto L90
            java.util.List r1 = java.util.Collections.singletonList(r3)
            r5.put(r13, r1)
        L8d:
            r2 = r4
            goto L119
        L90:
            ᲇᛳᛵᛲ r3 = defpackage.C2018.f8719
            java.util.HashMap r6 = r3.f8721
            java.lang.Object r7 = r6.get(r13)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            r8 = 0
            if (r7 == 0) goto La2
            boolean r3 = r7.booleanValue()
            goto Lc4
        La2:
            java.lang.reflect.Method[] r7 = r13.getDeclaredMethods()     // Catch: java.lang.NoClassDefFoundError -> L121
            int r9 = r7.length
            r10 = r8
        La8:
            if (r10 >= r9) goto Lbe
            r11 = r7[r10]
            java.lang.Class<ᛲᛳᛷᲀ> r12 = defpackage.InterfaceC0266.class
            java.lang.annotation.Annotation r11 = r11.getAnnotation(r12)
            ᛲᛳᛷᲀ r11 = (defpackage.InterfaceC0266) r11
            if (r11 == 0) goto Lbb
            r3.m3411(r13, r7)
            r3 = r2
            goto Lc4
        Lbb:
            int r10 = r10 + 1
            goto La8
        Lbe:
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            r6.put(r13, r3)
            r3 = r8
        Lc4:
            if (r3 == 0) goto Lc7
            goto L119
        Lc7:
            java.lang.Class r3 = r13.getSuperclass()
            java.lang.Class<ᛸᲈᛱᲁ> r6 = defpackage.InterfaceC1597.class
            if (r3 == 0) goto Le7
            boolean r7 = r6.isAssignableFrom(r3)
            if (r7 == 0) goto Le7
            int r1 = m1245(r3)
            if (r1 != r2) goto Ldc
            goto L119
        Ldc:
            java.util.ArrayList r1 = new java.util.ArrayList
            java.lang.Object r3 = r5.get(r3)
            java.util.Collection r3 = (java.util.Collection) r3
            r1.<init>(r3)
        Le7:
            java.lang.Class[] r3 = r13.getInterfaces()
            int r7 = r3.length
        Lec:
            if (r8 >= r7) goto L112
            r9 = r3[r8]
            if (r9 == 0) goto L10f
            boolean r10 = r6.isAssignableFrom(r9)
            if (r10 == 0) goto L10f
            int r10 = m1245(r9)
            if (r10 != r2) goto Lff
            goto L119
        Lff:
            if (r1 != 0) goto L106
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        L106:
            java.lang.Object r9 = r5.get(r9)
            java.util.Collection r9 = (java.util.Collection) r9
            r1.addAll(r9)
        L10f:
            int r8 = r8 + 1
            goto Lec
        L112:
            if (r1 == 0) goto L119
            r5.put(r13, r1)
            goto L8d
        L119:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            r0.put(r13, r1)
            return r2
        L121:
            r13 = move-exception
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor."
            r0.<init>(r1, r13)
            throw r0
    }
}
