package a;

/* JADX INFO: loaded from: classes.dex */
public class Nf extends a.Rf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static java.lang.Class<?> f189a = null;
    public static java.lang.reflect.Constructor<?> b = null;
    public static java.lang.reflect.Method c = null;
    public static java.lang.reflect.Method d = null;
    public static boolean e = false;

    public static boolean e(java.lang.Object r1, java.lang.String r2, int r3, boolean r4) {
            f()
            java.lang.reflect.Method r0 = a.Nf.c     // Catch: java.lang.Throwable -> L1c
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L1c
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)     // Catch: java.lang.Throwable -> L1c
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r3, r4}     // Catch: java.lang.Throwable -> L1c
            java.lang.Object r1 = r0.invoke(r1, r2)     // Catch: java.lang.Throwable -> L1c
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L1c
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L1c
            return r1
        L1c:
            r1 = move-exception
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            r2.<init>(r1)
            throw r2
    }

    public static void f() {
            boolean r0 = a.Nf.e
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            a.Nf.e = r0
            r1 = 0
            java.lang.String r2 = "android.graphics.FontFamily"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch: java.lang.NoSuchMethodException -> L3a java.lang.ClassNotFoundException -> L3c
            java.lang.reflect.Constructor r3 = r2.getConstructor(r1)     // Catch: java.lang.NoSuchMethodException -> L3a java.lang.ClassNotFoundException -> L3c
            java.lang.String r4 = "addFontWeightStyle"
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            java.lang.Class r6 = java.lang.Integer.TYPE     // Catch: java.lang.NoSuchMethodException -> L3a java.lang.ClassNotFoundException -> L3c
            java.lang.Class r7 = java.lang.Boolean.TYPE     // Catch: java.lang.NoSuchMethodException -> L3a java.lang.ClassNotFoundException -> L3c
            java.lang.Class[] r5 = new java.lang.Class[]{r5, r6, r7}     // Catch: java.lang.NoSuchMethodException -> L3a java.lang.ClassNotFoundException -> L3c
            java.lang.reflect.Method r4 = r2.getMethod(r4, r5)     // Catch: java.lang.NoSuchMethodException -> L3a java.lang.ClassNotFoundException -> L3c
            java.lang.Object r0 = java.lang.reflect.Array.newInstance(r2, r0)     // Catch: java.lang.NoSuchMethodException -> L3a java.lang.ClassNotFoundException -> L3c
            java.lang.Class<android.graphics.Typeface> r5 = android.graphics.Typeface.class
            java.lang.String r6 = "createFromFamiliesWithDefault"
            java.lang.Class r0 = r0.getClass()     // Catch: java.lang.NoSuchMethodException -> L3a java.lang.ClassNotFoundException -> L3c
            java.lang.Class[] r0 = new java.lang.Class[]{r0}     // Catch: java.lang.NoSuchMethodException -> L3a java.lang.ClassNotFoundException -> L3c
            java.lang.reflect.Method r1 = r5.getMethod(r6, r0)     // Catch: java.lang.NoSuchMethodException -> L3a java.lang.ClassNotFoundException -> L3c
            r0 = r1
            r1 = r3
            goto L4d
        L3a:
            r0 = move-exception
            goto L3d
        L3c:
            r0 = move-exception
        L3d:
            java.lang.Class r2 = r0.getClass()
            java.lang.String r2 = r2.getName()
            java.lang.String r3 = "TypefaceCompatApi21Impl"
            android.util.Log.e(r3, r2, r0)
            r0 = r1
            r2 = r0
            r4 = r2
        L4d:
            a.Nf.b = r1
            a.Nf.f189a = r2
            a.Nf.c = r4
            a.Nf.d = r0
            return
    }

    @Override // a.Rf
    public android.graphics.Typeface a(android.content.Context r9, a.S6.c r10, android.content.res.Resources r11, int r12) {
            r8 = this;
            f()
            java.lang.reflect.Constructor<?> r12 = a.Nf.b     // Catch: java.lang.reflect.InvocationTargetException -> L6a java.lang.InstantiationException -> L6c java.lang.IllegalAccessException -> L6e
            r0 = 0
            java.lang.Object r12 = r12.newInstance(r0)     // Catch: java.lang.reflect.InvocationTargetException -> L6a java.lang.InstantiationException -> L6c java.lang.IllegalAccessException -> L6e
            a.S6$d[] r10 = r10.f259a
            int r1 = r10.length
            r2 = 0
            r3 = r2
        Lf:
            if (r3 >= r1) goto L47
            r4 = r10[r3]
            java.io.File r5 = a.Sf.d(r9)
            if (r5 != 0) goto L1a
            return r0
        L1a:
            int r6 = r4.f     // Catch: java.lang.Throwable -> L3e java.lang.RuntimeException -> L43
            boolean r6 = a.Sf.b(r5, r11, r6)     // Catch: java.lang.Throwable -> L3e java.lang.RuntimeException -> L43
            if (r6 != 0) goto L26
            r5.delete()
            return r0
        L26:
            java.lang.String r6 = r5.getPath()     // Catch: java.lang.Throwable -> L3e java.lang.RuntimeException -> L43
            int r7 = r4.b     // Catch: java.lang.Throwable -> L3e java.lang.RuntimeException -> L43
            boolean r4 = r4.c     // Catch: java.lang.Throwable -> L3e java.lang.RuntimeException -> L43
            boolean r4 = e(r12, r6, r7, r4)     // Catch: java.lang.Throwable -> L3e java.lang.RuntimeException -> L43
            if (r4 != 0) goto L38
            r5.delete()
            return r0
        L38:
            r5.delete()
            int r3 = r3 + 1
            goto Lf
        L3e:
            r9 = move-exception
            r5.delete()
            throw r9
        L43:
            r5.delete()
            return r0
        L47:
            f()
            java.lang.Class<?> r9 = a.Nf.f189a     // Catch: java.lang.reflect.InvocationTargetException -> L61 java.lang.IllegalAccessException -> L63
            r10 = 1
            java.lang.Object r9 = java.lang.reflect.Array.newInstance(r9, r10)     // Catch: java.lang.reflect.InvocationTargetException -> L61 java.lang.IllegalAccessException -> L63
            java.lang.reflect.Array.set(r9, r2, r12)     // Catch: java.lang.reflect.InvocationTargetException -> L61 java.lang.IllegalAccessException -> L63
            java.lang.reflect.Method r10 = a.Nf.d     // Catch: java.lang.reflect.InvocationTargetException -> L61 java.lang.IllegalAccessException -> L63
            java.lang.Object[] r9 = new java.lang.Object[]{r9}     // Catch: java.lang.reflect.InvocationTargetException -> L61 java.lang.IllegalAccessException -> L63
            java.lang.Object r9 = r10.invoke(r0, r9)     // Catch: java.lang.reflect.InvocationTargetException -> L61 java.lang.IllegalAccessException -> L63
            android.graphics.Typeface r9 = (android.graphics.Typeface) r9     // Catch: java.lang.reflect.InvocationTargetException -> L61 java.lang.IllegalAccessException -> L63
            return r9
        L61:
            r9 = move-exception
            goto L64
        L63:
            r9 = move-exception
        L64:
            java.lang.RuntimeException r10 = new java.lang.RuntimeException
            r10.<init>(r9)
            throw r10
        L6a:
            r9 = move-exception
            goto L6f
        L6c:
            r9 = move-exception
            goto L6f
        L6e:
            r9 = move-exception
        L6f:
            java.lang.RuntimeException r10 = new java.lang.RuntimeException
            r10.<init>(r9)
            throw r10
    }
}
