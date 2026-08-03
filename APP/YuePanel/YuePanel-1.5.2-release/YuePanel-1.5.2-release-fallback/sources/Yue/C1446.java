package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۦۥۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C1446 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4543
    public static final java.lang.reflect.Method f4543 = null;

    static {
            java.lang.Class<java.util.concurrent.ScheduledThreadPoolExecutor> r0 = java.util.concurrent.ScheduledThreadPoolExecutor.class
            java.lang.String r1 = "setRemoveOnCancelPolicy"
            java.lang.Class r2 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> Lf
            java.lang.Class[] r2 = new java.lang.Class[]{r2}     // Catch: java.lang.Throwable -> Lf
            java.lang.reflect.Method r0 = r0.getMethod(r1, r2)     // Catch: java.lang.Throwable -> Lf
            goto L10
        Lf:
            r0 = 0
        L10:
            Yue.C1446.f4543 = r0
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static /* synthetic */ void m7096() {
            return
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final <E> java.util.Set<E> m7097(int r1) {
            java.util.IdentityHashMap r0 = new java.util.IdentityHashMap
            r0.<init>(r1)
            java.util.Set r1 = java.util.Collections.newSetFromMap(r0)
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final boolean m7098(@Yue.InterfaceC4418 java.util.concurrent.Executor r3) {
            r0 = 0
            boolean r1 = r3 instanceof java.util.concurrent.ScheduledThreadPoolExecutor     // Catch: java.lang.Throwable -> L1c
            if (r1 == 0) goto L8
            java.util.concurrent.ScheduledThreadPoolExecutor r3 = (java.util.concurrent.ScheduledThreadPoolExecutor) r3     // Catch: java.lang.Throwable -> L1c
            goto L9
        L8:
            r3 = 0
        L9:
            if (r3 != 0) goto Lc
            return r0
        Lc:
            java.lang.reflect.Method r1 = Yue.C1446.f4543     // Catch: java.lang.Throwable -> L1c
            if (r1 != 0) goto L11
            return r0
        L11:
            java.lang.Boolean r2 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L1c
            java.lang.Object[] r2 = new java.lang.Object[]{r2}     // Catch: java.lang.Throwable -> L1c
            r1.invoke(r3, r2)     // Catch: java.lang.Throwable -> L1c
            r3 = 1
            return r3
        L1c:
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final <E> java.util.List<E> m7099() {
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final <T> T m7100(@Yue.InterfaceC4418 java.util.concurrent.locks.ReentrantLock r1, @Yue.InterfaceC4418 Yue.InterfaceC2823<? extends T> r2) {
            r1.lock()
            r0 = 1
            java.lang.Object r2 = r2.invoke()     // Catch: java.lang.Throwable -> L12
            Yue.C3249.m13687(r0)
            r1.unlock()
            Yue.C3249.m13686(r0)
            return r2
        L12:
            r2 = move-exception
            Yue.C3249.m13687(r0)
            r1.unlock()
            Yue.C3249.m13686(r0)
            throw r2
    }
}
