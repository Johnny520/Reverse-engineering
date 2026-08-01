package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class kf extends defpackage.jj implements java.lang.Runnable {
    private static volatile java.lang.Thread _thread;
    private static volatile int debugStatus;
    public static final defpackage.kf i = null;
    public static final long j = 0;

    static {
            kf r0 = new kf
            r0.<init>()
            defpackage.kf.i = r0
            r1 = 0
            r0.k(r1)
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
            r1 = 1000(0x3e8, double:4.94E-321)
            java.lang.String r3 = "kotlinx.coroutines.DefaultExecutor.keepAlive"
            java.lang.Long r1 = java.lang.Long.getLong(r3, r1)     // Catch: java.lang.SecurityException -> L16
            goto L1a
        L16:
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
        L1a:
            long r1 = r1.longValue()
            long r0 = r0.toNanos(r1)
            defpackage.kf.j = r0
            return
    }

    @Override // defpackage.kj
    public final java.lang.Thread j() {
            r2 = this;
            java.lang.Thread r0 = defpackage.kf._thread
            if (r0 != 0) goto L20
            monitor-enter(r2)
            java.lang.Thread r0 = defpackage.kf._thread     // Catch: java.lang.Throwable -> L1a
            if (r0 != 0) goto L1c
            java.lang.Thread r0 = new java.lang.Thread     // Catch: java.lang.Throwable -> L1a
            java.lang.String r1 = "kotlinx.coroutines.DefaultExecutor"
            r0.<init>(r2, r1)     // Catch: java.lang.Throwable -> L1a
            defpackage.kf._thread = r0     // Catch: java.lang.Throwable -> L1a
            r1 = 1
            r0.setDaemon(r1)     // Catch: java.lang.Throwable -> L1a
            r0.start()     // Catch: java.lang.Throwable -> L1a
            goto L1c
        L1a:
            r0 = move-exception
            goto L1e
        L1c:
            monitor-exit(r2)
            return r0
        L1e:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1a
            throw r0
        L20:
            return r0
    }

    @Override // defpackage.kj
    public final void m(long r1, defpackage.hj r3) {
            r0 = this;
            java.util.concurrent.RejectedExecutionException r1 = new java.util.concurrent.RejectedExecutionException
            java.lang.String r2 = "DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details"
            r1.<init>(r2)
            throw r1
    }

    @Override // defpackage.jj
    public final void n(java.lang.Runnable r3) {
            r2 = this;
            int r0 = defpackage.kf.debugStatus
            r1 = 4
            if (r0 == r1) goto L9
            super.n(r3)
            return
        L9:
            java.util.concurrent.RejectedExecutionException r3 = new java.util.concurrent.RejectedExecutionException
            java.lang.String r0 = "DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details"
            r3.<init>(r0)
            throw r3
    }

    @Override // java.lang.Runnable
    public final void run() {
            r17 = this;
            r1 = r17
            java.lang.ThreadLocal r0 = defpackage.t60.a
            r0.set(r1)
            r2 = 0
            monitor-enter(r17)     // Catch: java.lang.Throwable -> L4e
            int r0 = defpackage.kf.debugStatus     // Catch: java.lang.Throwable -> L8f
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
            defpackage.kf._thread = r2
            r1.s()
            boolean r0 = r1.p()
            if (r0 != 0) goto L8a
            r1.j()
            return
        L29:
            defpackage.kf.debugStatus = r6     // Catch: java.lang.Throwable -> L8f
            r1.notifyAll()     // Catch: java.lang.Throwable -> L8f
            monitor-exit(r17)     // Catch: java.lang.Throwable -> L4e
            r7 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r9 = r7
        L35:
            java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L4e
            long r11 = r1.q()     // Catch: java.lang.Throwable -> L4e
            int r0 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            r13 = 0
            if (r0 != 0) goto L6b
            long r15 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L4e
            int r0 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r0 != 0) goto L50
            long r9 = defpackage.kf.j     // Catch: java.lang.Throwable -> L4e
            long r9 = r9 + r15
            goto L50
        L4e:
            r0 = move-exception
            goto L92
        L50:
            long r15 = r9 - r15
            int r0 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
            if (r0 > 0) goto L65
            defpackage.kf._thread = r2
            r1.s()
            boolean r0 = r1.p()
            if (r0 != 0) goto L8a
            r1.j()
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
            int r0 = defpackage.kf.debugStatus     // Catch: java.lang.Throwable -> L4e
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
            defpackage.kf._thread = r2
            r1.s()
            boolean r0 = r1.p()
            if (r0 != 0) goto L8a
            r1.j()
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
            defpackage.kf._thread = r2
            r1.s()
            boolean r2 = r1.p()
            if (r2 != 0) goto La0
            r1.j()
        La0:
            throw r0
    }

    public final synchronized void s() {
            r3 = this;
            monitor-enter(r3)
            int r0 = defpackage.kf.debugStatus     // Catch: java.lang.Throwable -> L23
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
            defpackage.kf.debugStatus = r2     // Catch: java.lang.Throwable -> L23
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.jj.f     // Catch: java.lang.Throwable -> L23
            r1 = 0
            r0.set(r3, r1)     // Catch: java.lang.Throwable -> L23
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.jj.g     // Catch: java.lang.Throwable -> L23
            r0.set(r3, r1)     // Catch: java.lang.Throwable -> L23
            r3.notifyAll()     // Catch: java.lang.Throwable -> L23
            monitor-exit(r3)
            return
        L23:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L23
            throw r0
    }

    @Override // defpackage.jj, defpackage.kj
    public final void shutdown() {
            r1 = this;
            r0 = 4
            defpackage.kf.debugStatus = r0
            super.shutdown()
            return
    }
}
