package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class ko {
    private static volatile android.view.Choreographer choreographer;

    static {
            jo r0 = new jo     // Catch: java.lang.Throwable -> Lf
            android.os.Looper r1 = android.os.Looper.getMainLooper()     // Catch: java.lang.Throwable -> Lf
            android.os.Handler r1 = a(r1)     // Catch: java.lang.Throwable -> Lf
            r2 = 0
            r0.<init>(r1, r2)     // Catch: java.lang.Throwable -> Lf
            goto L14
        Lf:
            r0 = move-exception
            e10 r0 = defpackage.ct.f(r0)
        L14:
            boolean r1 = r0 instanceof defpackage.e10
            if (r1 == 0) goto L19
            r0 = 0
        L19:
            jo r0 = (defpackage.jo) r0
            return
    }

    public static final android.os.Handler a(android.os.Looper r5) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            r2 = 0
            java.lang.Class<android.os.Looper> r3 = android.os.Looper.class
            java.lang.Class<android.os.Handler> r4 = android.os.Handler.class
            if (r0 < r1) goto L25
            java.lang.String r0 = "createAsync"
            java.lang.Class[] r1 = new java.lang.Class[]{r3}
            java.lang.reflect.Method r0 = r4.getDeclaredMethod(r0, r1)
            java.lang.Object[] r5 = new java.lang.Object[]{r5}
            java.lang.Object r5 = r0.invoke(r2, r5)
            java.lang.String r0 = "null cannot be cast to non-null type android.os.Handler"
            defpackage.ip.m(r0, r5)
            android.os.Handler r5 = (android.os.Handler) r5
            return r5
        L25:
            java.lang.Class<android.os.Handler$Callback> r0 = android.os.Handler.Callback.class
            java.lang.Class r1 = java.lang.Boolean.TYPE     // Catch: java.lang.NoSuchMethodException -> L3e
            java.lang.Class[] r0 = new java.lang.Class[]{r3, r0, r1}     // Catch: java.lang.NoSuchMethodException -> L3e
            java.lang.reflect.Constructor r0 = r4.getDeclaredConstructor(r0)     // Catch: java.lang.NoSuchMethodException -> L3e
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            java.lang.Object[] r5 = new java.lang.Object[]{r5, r2, r1}
            java.lang.Object r5 = r0.newInstance(r5)
            android.os.Handler r5 = (android.os.Handler) r5
            return r5
        L3e:
            android.os.Handler r0 = new android.os.Handler
            r0.<init>(r5)
            return r0
    }
}
