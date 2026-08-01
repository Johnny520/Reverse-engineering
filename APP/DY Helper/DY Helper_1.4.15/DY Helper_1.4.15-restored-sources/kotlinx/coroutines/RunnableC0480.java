package kotlinx.coroutines;

/* JADX INFO: renamed from: kotlinx.coroutines.β */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0480 extends kotlinx.coroutines.AbstractC0481 implements java.lang.Runnable {
    private static volatile java.lang.Thread _thread;
    private static volatile int debugStatus;

    /* JADX INFO: renamed from: ξ */
    public static final kotlinx.coroutines.RunnableC0480 f6067 = null;

    /* JADX INFO: renamed from: ο */
    public static final long f6068 = 0;

    static {
            kotlinx.coroutines.β r0 = new kotlinx.coroutines.β
            r0.<init>()
            kotlinx.coroutines.RunnableC0480.f6067 = r0
            r1 = 0
            r0.m5766(r1)
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
            kotlinx.coroutines.RunnableC0480.f6068 = r0
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r17 = this;
            r1 = r17
            java.lang.ThreadLocal r0 = p000.d42.f2881
            r0.set(r1)
            r2 = 0
            monitor-enter(r17)     // Catch: java.lang.Throwable -> L4e
            int r0 = kotlinx.coroutines.RunnableC0480.debugStatus     // Catch: java.lang.Throwable -> L8f
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
            kotlinx.coroutines.RunnableC0480._thread = r2
            r1.m3396()
            boolean r0 = r1.m3399()
            if (r0 != 0) goto L8a
            r1.mo3183()
            return
        L29:
            kotlinx.coroutines.RunnableC0480.debugStatus = r6     // Catch: java.lang.Throwable -> L8f
            r1.notifyAll()     // Catch: java.lang.Throwable -> L8f
            monitor-exit(r17)     // Catch: java.lang.Throwable -> L4e
            r7 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r9 = r7
        L35:
            java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L4e
            long r11 = r1.mo3402()     // Catch: java.lang.Throwable -> L4e
            int r0 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            r13 = 0
            if (r0 != 0) goto L6b
            long r15 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L4e
            int r0 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r0 != 0) goto L50
            long r9 = kotlinx.coroutines.RunnableC0480.f6068     // Catch: java.lang.Throwable -> L4e
            long r9 = r9 + r15
            goto L50
        L4e:
            r0 = move-exception
            goto L92
        L50:
            long r15 = r9 - r15
            int r0 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
            if (r0 > 0) goto L65
            kotlinx.coroutines.RunnableC0480._thread = r2
            r1.m3396()
            boolean r0 = r1.m3399()
            if (r0 != 0) goto L8a
            r1.mo3183()
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
            int r0 = kotlinx.coroutines.RunnableC0480.debugStatus     // Catch: java.lang.Throwable -> L4e
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
            kotlinx.coroutines.RunnableC0480._thread = r2
            r1.m3396()
            boolean r0 = r1.m3399()
            if (r0 != 0) goto L8a
            r1.mo3183()
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
            kotlinx.coroutines.RunnableC0480._thread = r2
            r1.m3396()
            boolean r2 = r1.m3399()
            if (r2 != 0) goto La0
            r1.mo3183()
        La0:
            throw r0
    }

    @Override // kotlinx.coroutines.AbstractC0481, p000.AbstractC0853tz
    public final void shutdown() {
            r1 = this;
            r0 = 4
            kotlinx.coroutines.RunnableC0480.debugStatus = r0
            super.shutdown()
            return
    }

    @Override // kotlinx.coroutines.AbstractC0479
    public final java.lang.String toString() {
            r0 = this;
            java.lang.String r0 = "DefaultExecutor"
            return r0
    }

    @Override // kotlinx.coroutines.AbstractC0481
    /* JADX INFO: renamed from: Α */
    public final void mo3394(java.lang.Runnable r3) {
            r2 = this;
            int r0 = kotlinx.coroutines.RunnableC0480.debugStatus
            r1 = 4
            if (r0 == r1) goto L9
            super.mo3394(r3)
            return
        L9:
            java.util.concurrent.RejectedExecutionException r2 = new java.util.concurrent.RejectedExecutionException
            java.lang.String r3 = "DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details"
            r2.<init>(r3)
            throw r2
    }

    @Override // kotlinx.coroutines.AbstractC0481
    /* JADX INFO: renamed from: Δ */
    public final java.lang.Thread mo3183() {
            r2 = this;
            java.lang.Thread r0 = kotlinx.coroutines.RunnableC0480._thread
            if (r0 != 0) goto L2d
            monitor-enter(r2)
            java.lang.Thread r0 = kotlinx.coroutines.RunnableC0480._thread     // Catch: java.lang.Throwable -> L27
            if (r0 != 0) goto L29
            java.lang.Thread r0 = new java.lang.Thread     // Catch: java.lang.Throwable -> L27
            java.lang.String r1 = "kotlinx.coroutines.DefaultExecutor"
            r0.<init>(r2, r1)     // Catch: java.lang.Throwable -> L27
            kotlinx.coroutines.RunnableC0480._thread = r0     // Catch: java.lang.Throwable -> L27
            kotlinx.coroutines.β r1 = kotlinx.coroutines.RunnableC0480.f6067     // Catch: java.lang.Throwable -> L27
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

    @Override // kotlinx.coroutines.AbstractC0481
    /* JADX INFO: renamed from: Ζ */
    public final void mo3395(long r1, p000.AbstractRunnableC0928vz r3) {
            r0 = this;
            java.util.concurrent.RejectedExecutionException r0 = new java.util.concurrent.RejectedExecutionException
            java.lang.String r1 = "DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details"
            r0.<init>(r1)
            throw r0
    }

    /* JADX INFO: renamed from: Θ */
    public final synchronized void m3396() {
            r3 = this;
            monitor-enter(r3)
            int r0 = kotlinx.coroutines.RunnableC0480.debugStatus     // Catch: java.lang.Throwable -> L23
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
            kotlinx.coroutines.RunnableC0480.debugStatus = r2     // Catch: java.lang.Throwable -> L23
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.AbstractC0481.f6069     // Catch: java.lang.Throwable -> L23
            r1 = 0
            r0.set(r3, r1)     // Catch: java.lang.Throwable -> L23
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.AbstractC0481.f6070     // Catch: java.lang.Throwable -> L23
            r0.set(r3, r1)     // Catch: java.lang.Throwable -> L23
            r3.notifyAll()     // Catch: java.lang.Throwable -> L23
            monitor-exit(r3)
            return
        L23:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L23
            throw r0
    }
}
