package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class i2 extends defpackage.h implements kotlinx.coroutines.CoroutineExceptionHandler {
    private volatile java.lang.Object _preHandler;

    public i2() {
            r1 = this;
            vh r0 = defpackage.vh.c
            r1.<init>(r0)
            r1._preHandler = r1
            return
    }

    public final void d(java.lang.Throwable r4) {
            r3 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 >= r1) goto L46
            java.lang.Object r0 = r3._preHandler
            r1 = 0
            if (r0 == r3) goto Le
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            goto L2e
        Le:
            java.lang.Class<java.lang.Thread> r0 = java.lang.Thread.class
            java.lang.String r2 = "getUncaughtExceptionPreHandler"
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r2, r1)     // Catch: java.lang.Throwable -> L2b
            int r2 = r0.getModifiers()     // Catch: java.lang.Throwable -> L2b
            boolean r2 = java.lang.reflect.Modifier.isPublic(r2)     // Catch: java.lang.Throwable -> L2b
            if (r2 == 0) goto L2b
            int r2 = r0.getModifiers()     // Catch: java.lang.Throwable -> L2b
            boolean r2 = java.lang.reflect.Modifier.isStatic(r2)     // Catch: java.lang.Throwable -> L2b
            if (r2 == 0) goto L2b
            goto L2c
        L2b:
            r0 = r1
        L2c:
            r3._preHandler = r0
        L2e:
            if (r0 == 0) goto L35
            java.lang.Object r0 = r0.invoke(r1, r1)
            goto L36
        L35:
            r0 = r1
        L36:
            boolean r2 = r0 instanceof java.lang.Thread.UncaughtExceptionHandler
            if (r2 == 0) goto L3d
            r1 = r0
            java.lang.Thread$UncaughtExceptionHandler r1 = (java.lang.Thread.UncaughtExceptionHandler) r1
        L3d:
            if (r1 == 0) goto L46
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r1.uncaughtException(r0, r4)
        L46:
            return
    }
}
