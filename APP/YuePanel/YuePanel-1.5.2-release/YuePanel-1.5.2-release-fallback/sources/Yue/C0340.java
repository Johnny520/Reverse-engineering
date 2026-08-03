package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟۠ۤۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C0340 extends Yue.AbstractC0044 implements Yue.InterfaceC1646 {

    @Yue.InterfaceC4543
    private volatile java.lang.Object _preHandler;

    public C0340() {
            r1 = this;
            Yue.ۥ۟ۧۧ$ۥ۟ r0 = Yue.InterfaceC1646.f5099
            r1.<init>(r0)
            r1._preHandler = r1
            return
    }

    @Override // Yue.InterfaceC1646
    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public void mo1412(@Yue.InterfaceC4418 Yue.InterfaceC1632 r3, @Yue.InterfaceC4418 java.lang.Throwable r4) {
            r2 = this;
            int r3 = android.os.Build.VERSION.SDK_INT
            r0 = 28
            if (r3 >= r0) goto L23
            java.lang.reflect.Method r3 = r2.m1413()
            r0 = 0
            if (r3 == 0) goto L12
            java.lang.Object r3 = r3.invoke(r0, r0)
            goto L13
        L12:
            r3 = r0
        L13:
            boolean r1 = r3 instanceof java.lang.Thread.UncaughtExceptionHandler
            if (r1 == 0) goto L1a
            r0 = r3
            java.lang.Thread$UncaughtExceptionHandler r0 = (java.lang.Thread.UncaughtExceptionHandler) r0
        L1a:
            if (r0 == 0) goto L23
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            r0.uncaughtException(r3, r4)
        L23:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧ۟, reason: contains not printable characters */
    public final java.lang.reflect.Method m1413() {
            r3 = this;
            java.lang.Object r0 = r3._preHandler
            if (r0 == r3) goto L7
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            return r0
        L7:
            r0 = 0
            java.lang.Class<java.lang.Thread> r1 = java.lang.Thread.class
            java.lang.String r2 = "getUncaughtExceptionPreHandler"
            java.lang.reflect.Method r1 = r1.getDeclaredMethod(r2, r0)     // Catch: java.lang.Throwable -> L25
            int r2 = r1.getModifiers()     // Catch: java.lang.Throwable -> L25
            boolean r2 = java.lang.reflect.Modifier.isPublic(r2)     // Catch: java.lang.Throwable -> L25
            if (r2 == 0) goto L25
            int r2 = r1.getModifiers()     // Catch: java.lang.Throwable -> L25
            boolean r2 = java.lang.reflect.Modifier.isStatic(r2)     // Catch: java.lang.Throwable -> L25
            if (r2 == 0) goto L25
            r0 = r1
        L25:
            r3._preHandler = r0
            return r0
    }
}
