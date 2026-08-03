package a;

/* JADX INFO: loaded from: classes.dex */
public final class Md {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final java.util.List<java.lang.Class<?>> f176a = null;
    public static final java.util.List<java.lang.Class<?>> b = null;

    static {
            java.lang.Class<android.app.Application> r0 = android.app.Application.class
            java.lang.Class<androidx.lifecycle.m> r1 = androidx.lifecycle.m.class
            java.lang.Class[] r0 = new java.lang.Class[]{r0, r1}
            java.util.List r0 = a.C0294o3.d0(r0)
            a.Md.f176a = r0
            java.util.List r0 = a.C0435w1.K(r1)
            a.Md.b = r0
            return
    }

    public static final <T> java.lang.reflect.Constructor<T> a(java.lang.Class<T> r6, java.util.List<? extends java.lang.Class<?>> r7) {
            java.lang.String r0 = "signature"
            a.C0193i9.e(r7, r0)
            java.lang.reflect.Constructor[] r0 = r6.getConstructors()
            java.lang.String r1 = "modelClass.constructors"
            a.C0193i9.d(r0, r1)
            int r1 = r0.length
            r2 = 0
        L10:
            if (r2 >= r1) goto L5c
            r3 = r0[r2]
            java.lang.Class[] r4 = r3.getParameterTypes()
            java.lang.String r5 = "constructor.parameterTypes"
            a.C0193i9.d(r4, r5)
            java.util.List r4 = a.N1.g0(r4)
            boolean r5 = r7.equals(r4)
            if (r5 == 0) goto L28
            return r3
        L28:
            int r3 = r7.size()
            int r5 = r4.size()
            if (r3 != r5) goto L59
            boolean r3 = r4.containsAll(r7)
            if (r3 != 0) goto L39
            goto L59
        L39:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Class "
            r1.<init>(r2)
            java.lang.String r6 = r6.getSimpleName()
            r1.append(r6)
            java.lang.String r6 = " must have parameters in the proper order: "
            r1.append(r6)
            r1.append(r7)
            java.lang.String r6 = r1.toString()
            r0.<init>(r6)
            throw r0
        L59:
            int r2 = r2 + 1
            goto L10
        L5c:
            r6 = 0
            return r6
    }

    public static final <T extends a.Dg> T b(java.lang.Class<T> r2, java.lang.reflect.Constructor<T> r3, java.lang.Object... r4) {
            int r0 = r4.length     // Catch: java.lang.reflect.InvocationTargetException -> Lc java.lang.InstantiationException -> Le java.lang.IllegalAccessException -> L10
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r0)     // Catch: java.lang.reflect.InvocationTargetException -> Lc java.lang.InstantiationException -> Le java.lang.IllegalAccessException -> L10
            java.lang.Object r3 = r3.newInstance(r4)     // Catch: java.lang.reflect.InvocationTargetException -> Lc java.lang.InstantiationException -> Le java.lang.IllegalAccessException -> L10
            a.Dg r3 = (a.Dg) r3     // Catch: java.lang.reflect.InvocationTargetException -> Lc java.lang.InstantiationException -> Le java.lang.IllegalAccessException -> L10
            return r3
        Lc:
            r3 = move-exception
            goto L12
        Le:
            r3 = move-exception
            goto L2a
        L10:
            r3 = move-exception
            goto L43
        L12:
            java.lang.RuntimeException r4 = new java.lang.RuntimeException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "An exception happened in constructor of "
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            java.lang.Throwable r3 = r3.getCause()
            r4.<init>(r2, r3)
            throw r4
        L2a:
            java.lang.RuntimeException r4 = new java.lang.RuntimeException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "A "
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r2 = " cannot be instantiated."
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            r4.<init>(r2, r3)
            throw r4
        L43:
            java.lang.RuntimeException r4 = new java.lang.RuntimeException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Failed to access "
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            r4.<init>(r2, r3)
            throw r4
    }
}
