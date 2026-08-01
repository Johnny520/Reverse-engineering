package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class nr0 {

    /* JADX INFO: renamed from: α */
    public static final java.util.HashMap f7709 = null;

    /* JADX INFO: renamed from: β */
    public static final java.util.HashMap f7710 = null;

    static {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            p000.nr0.f7709 = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            p000.nr0.f7710 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public static void m4088(java.lang.reflect.Constructor r0, p000.gr0 r1) {
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

    /* JADX INFO: renamed from: β */
    public static int m4089(java.lang.Class r13) {
            java.util.HashMap r0 = p000.nr0.f7709
            java.lang.Object r1 = r0.get(r13)
            java.lang.Integer r1 = (java.lang.Integer) r1
            if (r1 == 0) goto Lf
            int r13 = r1.intValue()
            return r13
        Lf:
            java.lang.String r1 = r13.getCanonicalName()
            r2 = 1
            if (r1 != 0) goto L18
            goto L143
        L18:
            r1 = 0
            java.lang.Package r3 = r13.getPackage()     // Catch: java.lang.NoSuchMethodException -> L82 java.lang.ClassNotFoundException -> L89
            java.lang.String r4 = r13.getCanonicalName()     // Catch: java.lang.NoSuchMethodException -> L82 java.lang.ClassNotFoundException -> L89
            if (r3 == 0) goto L28
            java.lang.String r3 = r3.getName()     // Catch: java.lang.NoSuchMethodException -> L82 java.lang.ClassNotFoundException -> L89
            goto L2a
        L28:
            java.lang.String r3 = ""
        L2a:
            r3.getClass()     // Catch: java.lang.NoSuchMethodException -> L82 java.lang.ClassNotFoundException -> L89
            int r5 = r3.length()     // Catch: java.lang.NoSuchMethodException -> L82 java.lang.ClassNotFoundException -> L89
            if (r5 != 0) goto L34
            goto L40
        L34:
            r4.getClass()     // Catch: java.lang.NoSuchMethodException -> L82 java.lang.ClassNotFoundException -> L89
            int r5 = r3.length()     // Catch: java.lang.NoSuchMethodException -> L82 java.lang.ClassNotFoundException -> L89
            int r5 = r5 + r2
            java.lang.String r4 = r4.substring(r5)     // Catch: java.lang.NoSuchMethodException -> L82 java.lang.ClassNotFoundException -> L89
        L40:
            r4.getClass()     // Catch: java.lang.NoSuchMethodException -> L82 java.lang.ClassNotFoundException -> L89
            java.lang.String r5 = "."
            java.lang.String r6 = "_"
            java.lang.String r4 = p000.x02.m6483(r4, r5, r6)     // Catch: java.lang.NoSuchMethodException -> L82 java.lang.ClassNotFoundException -> L89
            java.lang.String r5 = "_LifecycleAdapter"
            java.lang.String r4 = r4.concat(r5)     // Catch: java.lang.NoSuchMethodException -> L82 java.lang.ClassNotFoundException -> L89
            int r5 = r3.length()     // Catch: java.lang.NoSuchMethodException -> L82 java.lang.ClassNotFoundException -> L89
            if (r5 != 0) goto L58
            goto L6c
        L58:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.NoSuchMethodException -> L82 java.lang.ClassNotFoundException -> L89
            r5.<init>()     // Catch: java.lang.NoSuchMethodException -> L82 java.lang.ClassNotFoundException -> L89
            r5.append(r3)     // Catch: java.lang.NoSuchMethodException -> L82 java.lang.ClassNotFoundException -> L89
            r3 = 46
            r5.append(r3)     // Catch: java.lang.NoSuchMethodException -> L82 java.lang.ClassNotFoundException -> L89
            r5.append(r4)     // Catch: java.lang.NoSuchMethodException -> L82 java.lang.ClassNotFoundException -> L89
            java.lang.String r4 = r5.toString()     // Catch: java.lang.NoSuchMethodException -> L82 java.lang.ClassNotFoundException -> L89
        L6c:
            java.lang.Class r3 = java.lang.Class.forName(r4)     // Catch: java.lang.NoSuchMethodException -> L82 java.lang.ClassNotFoundException -> L89
            java.lang.Class[] r4 = new java.lang.Class[]{r13}     // Catch: java.lang.NoSuchMethodException -> L82 java.lang.ClassNotFoundException -> L89
            java.lang.reflect.Constructor r3 = r3.getDeclaredConstructor(r4)     // Catch: java.lang.NoSuchMethodException -> L82 java.lang.ClassNotFoundException -> L89
            boolean r4 = r3.isAccessible()     // Catch: java.lang.NoSuchMethodException -> L82 java.lang.ClassNotFoundException -> L89
            if (r4 != 0) goto L8a
            r3.setAccessible(r2)     // Catch: java.lang.NoSuchMethodException -> L82 java.lang.ClassNotFoundException -> L89
            goto L8a
        L82:
            r13 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r13)
            throw r0
        L89:
            r3 = r1
        L8a:
            r4 = 2
            java.util.HashMap r5 = p000.nr0.f7710
            if (r3 == 0) goto L99
            java.util.List r1 = p000.AbstractC1021yh.m6896(r3)
            r5.put(r13, r1)
        L96:
            r2 = r4
            goto L143
        L99:
            zf r3 = p000.C1056zf.f13072
            java.util.HashMap r6 = r3.f13074
            java.lang.Object r7 = r6.get(r13)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            r8 = 0
            if (r7 == 0) goto Lab
            boolean r3 = r7.booleanValue()
            goto Lcd
        Lab:
            java.lang.reflect.Method[] r7 = r13.getDeclaredMethods()     // Catch: java.lang.NoClassDefFoundError -> L14b
            int r9 = r7.length
            r10 = r8
        Lb1:
            if (r10 >= r9) goto Lc7
            r11 = r7[r10]
            java.lang.Class<f51> r12 = p000.f51.class
            java.lang.annotation.Annotation r11 = r11.getAnnotation(r12)
            f51 r11 = (p000.f51) r11
            if (r11 == 0) goto Lc4
            r3.m7131(r13, r7)
            r3 = r2
            goto Lcd
        Lc4:
            int r10 = r10 + 1
            goto Lb1
        Lc7:
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            r6.put(r13, r3)
            r3 = r8
        Lcd:
            if (r3 == 0) goto Ld1
            goto L143
        Ld1:
            java.lang.Class r3 = r13.getSuperclass()
            java.lang.Class<gr0> r6 = p000.gr0.class
            if (r3 == 0) goto Le1
            boolean r7 = r6.isAssignableFrom(r3)
            if (r7 == 0) goto Le1
            r7 = r2
            goto Le2
        Le1:
            r7 = r8
        Le2:
            if (r7 == 0) goto Lfc
            r3.getClass()
            int r1 = m4089(r3)
            if (r1 != r2) goto Lee
            goto L143
        Lee:
            java.util.ArrayList r1 = new java.util.ArrayList
            java.lang.Object r3 = r5.get(r3)
            r3.getClass()
            java.util.Collection r3 = (java.util.Collection) r3
            r1.<init>(r3)
        Lfc:
            java.lang.Class[] r3 = r13.getInterfaces()
            τ r3 = p000.h62.m2434(r3)
        L104:
            boolean r7 = r3.hasNext()
            if (r7 == 0) goto L13c
            java.lang.Object r7 = r3.next()
            java.lang.Class r7 = (java.lang.Class) r7
            if (r7 == 0) goto L11a
            boolean r9 = r6.isAssignableFrom(r7)
            if (r9 == 0) goto L11a
            r9 = r2
            goto L11b
        L11a:
            r9 = r8
        L11b:
            if (r9 != 0) goto L11e
            goto L104
        L11e:
            r7.getClass()
            int r9 = m4089(r7)
            if (r9 != r2) goto L128
            goto L143
        L128:
            if (r1 != 0) goto L12f
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        L12f:
            java.lang.Object r7 = r5.get(r7)
            r7.getClass()
            java.util.Collection r7 = (java.util.Collection) r7
            r1.addAll(r7)
            goto L104
        L13c:
            if (r1 == 0) goto L143
            r5.put(r13, r1)
            goto L96
        L143:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            r0.put(r13, r1)
            return r2
        L14b:
            r13 = move-exception
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor."
            r0.<init>(r1, r13)
            throw r0
    }
}
