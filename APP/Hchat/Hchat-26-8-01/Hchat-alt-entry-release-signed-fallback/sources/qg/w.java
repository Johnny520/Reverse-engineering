package qg;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class w extends qg.l0 implements java.lang.Runnable {
    private static volatile java.lang.Thread _thread;
    private static volatile int debugStatus;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final qg.w f11113p = null;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final long f11114q = 0;

    static {
            qg.w r0 = new qg.w
            r0.<init>()
            qg.w.f11113p = r0
            r1 = 0
            r0.B(r1)
            r0 = 1000(0x3e8, double:4.94E-321)
            java.lang.String r2 = "kotlinx.coroutines.DefaultExecutor.keepAlive"
            java.lang.Long r0 = java.lang.Long.getLong(r2, r0)     // Catch: java.lang.SecurityException -> L14
            goto L18
        L14:
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
        L18:
            long r0 = r0.longValue()
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r0 = r2.toNanos(r0)
            qg.w.f11114q = r0
            return
    }

    @Override // qg.l0
    public final void E(java.lang.Runnable r3) {
            r2 = this;
            int r0 = qg.w.debugStatus
            r1 = 4
            if (r0 == r1) goto L9
            super.E(r3)
            return
        L9:
            java.util.concurrent.RejectedExecutionException r3 = new java.util.concurrent.RejectedExecutionException
            java.lang.String r0 = "DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details"
            r3.<init>(r0)
            throw r3
    }

    @Override // qg.l0
    public final java.lang.Thread H() {
            r2 = this;
            java.lang.Thread r0 = qg.w._thread
            if (r0 != 0) goto L2d
            monitor-enter(r2)
            java.lang.Thread r0 = qg.w._thread     // Catch: java.lang.Throwable -> L27
            if (r0 != 0) goto L29
            java.lang.Thread r0 = new java.lang.Thread     // Catch: java.lang.Throwable -> L27
            java.lang.String r1 = "kotlinx.coroutines.DefaultExecutor"
            r0.<init>(r2, r1)     // Catch: java.lang.Throwable -> L27
            qg.w._thread = r0     // Catch: java.lang.Throwable -> L27
            qg.w r1 = qg.w.f11113p     // Catch: java.lang.Throwable -> L27
            java.lang.Class r1 = r1.getClass()     // Catch: java.lang.Throwable -> L27
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch: java.lang.Throwable -> L27
            r0.setContextClassLoader(r1)     // Catch: java.lang.Throwable -> L27
            r1 = 1
            r0.setDaemon(r1)     // Catch: java.lang.Throwable -> L27
            r0.start()     // Catch: java.lang.Throwable -> L27
            goto L29
        L27:
            r0 = move-exception
            goto L2b
        L29:
            monitor-exit(r2)
            return r0
        L2b:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L27
            throw r0
        L2d:
            return r0
    }

    @Override // qg.l0
    public final void I(long r1, qg.j0 r3) {
            r0 = this;
            java.util.concurrent.RejectedExecutionException r1 = new java.util.concurrent.RejectedExecutionException
            java.lang.String r2 = "DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details"
            r1.<init>(r2)
            throw r1
    }

    public final synchronized void K() {
            r3 = this;
            monitor-enter(r3)
            int r0 = qg.w.debugStatus     // Catch: java.lang.Throwable -> L23
            r1 = 2
            r2 = 3
            if (r0 == r1) goto Lc
            if (r0 != r2) goto La
            goto Lc
        La:
            r0 = 0
            goto Ld
        Lc:
            r0 = 1
        Ld:
            if (r0 != 0) goto L11
            monitor-exit(r3)
            return
        L11:
            qg.w.debugStatus = r2     // Catch: java.lang.Throwable -> L23
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = qg.l0.f11071m     // Catch: java.lang.Throwable -> L23
            r1 = 0
            r0.set(r3, r1)     // Catch: java.lang.Throwable -> L23
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = qg.l0.f11072n     // Catch: java.lang.Throwable -> L23
            r0.set(r3, r1)     // Catch: java.lang.Throwable -> L23
            r3.notifyAll()     // Catch: java.lang.Throwable -> L23
            monitor-exit(r3)
            return
        L23:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L23
            throw r0
    }

    @Override // qg.l0, qg.y
    public final qg.d0 q(long r3, qg.j1 r5, wf.g r6) {
            r2 = this;
            r0 = 0
            int r6 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r6 > 0) goto L7
            goto L1a
        L7:
            r0 = 9223372036854(0x8637bd05af6, double:4.5569512622224E-311)
            int r6 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r6 < 0) goto L16
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L1a
        L16:
            r0 = 1000000(0xf4240, double:4.940656E-318)
            long r0 = r0 * r3
        L1a:
            r3 = 4611686018427387903(0x3fffffffffffffff, double:1.9999999999999998)
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 >= 0) goto L31
            long r3 = java.lang.System.nanoTime()
            qg.i0 r6 = new qg.i0
            long r0 = r0 + r3
            r6.<init>(r0, r5)
            r2.J(r3, r6)
            return r6
        L31:
            qg.c1 r3 = qg.c1.f11039g
            return r3
    }

    @Override // java.lang.Runnable
    public final void run() {
            r17 = this;
            r1 = r17
            java.lang.ThreadLocal r0 = qg.h1.f11058a
            r0.set(r1)
            r2 = 0
            monitor-enter(r17)     // Catch: java.lang.Throwable -> L4e
            int r0 = qg.w.debugStatus     // Catch: java.lang.Throwable -> L8f
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            if (r0 == r5) goto L16
            if (r0 != r4) goto L14
            goto L16
        L14:
            r0 = r3
            goto L17
        L16:
            r0 = r6
        L17:
            if (r0 == 0) goto L29
            monitor-exit(r17)     // Catch: java.lang.Throwable -> L4e
            qg.w._thread = r2
            r1.K()
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L8a
            r1.H()
            return
        L29:
            qg.w.debugStatus = r6     // Catch: java.lang.Throwable -> L8f
            r1.notifyAll()     // Catch: java.lang.Throwable -> L8f
            monitor-exit(r17)     // Catch: java.lang.Throwable -> L4e
            r7 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r9 = r7
        L35:
            java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L4e
            long r11 = r1.C()     // Catch: java.lang.Throwable -> L4e
            int r0 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            r13 = 0
            if (r0 != 0) goto L6b
            long r15 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L4e
            int r0 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r0 != 0) goto L50
            long r9 = qg.w.f11114q     // Catch: java.lang.Throwable -> L4e
            long r9 = r9 + r15
            goto L50
        L4e:
            r0 = move-exception
            goto L92
        L50:
            long r15 = r9 - r15
            int r0 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
            if (r0 > 0) goto L65
            qg.w._thread = r2
            r1.K()
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L8a
            r1.H()
            return
        L65:
            int r0 = (r11 > r15 ? 1 : (r11 == r15 ? 0 : -1))
            if (r0 <= 0) goto L6c
            r11 = r15
            goto L6c
        L6b:
            r9 = r7
        L6c:
            int r0 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r0 <= 0) goto L35
            int r0 = qg.w.debugStatus     // Catch: java.lang.Throwable -> L4e
            if (r0 == r5) goto L79
            if (r0 != r4) goto L77
            goto L79
        L77:
            r0 = r3
            goto L7a
        L79:
            r0 = r6
        L7a:
            if (r0 == 0) goto L8b
            qg.w._thread = r2
            r1.K()
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L8a
            r1.H()
        L8a:
            return
        L8b:
            java.util.concurrent.locks.LockSupport.parkNanos(r1, r11)     // Catch: java.lang.Throwable -> L4e
            goto L35
        L8f:
            r0 = move-exception
            monitor-exit(r17)     // Catch: java.lang.Throwable -> L8f
            throw r0     // Catch: java.lang.Throwable -> L4e
        L92:
            qg.w._thread = r2
            r1.K()
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto La0
            r1.H()
        La0:
            throw r0
    }

    @Override // qg.l0, qg.g0
    public final void shutdown() {
            r1 = this;
            r0 = 4
            qg.w.debugStatus = r0
            super.shutdown()
            return
    }

    @Override // qg.p
    public final java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = "DefaultExecutor"
            return r0
    }
}
