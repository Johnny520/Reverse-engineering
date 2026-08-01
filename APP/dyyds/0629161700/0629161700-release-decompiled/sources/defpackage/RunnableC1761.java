package defpackage;

/* JADX INFO: renamed from: ᲀᲁᲁᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1761 extends defpackage.AbstractC0092 implements java.lang.Runnable {
    private static volatile java.lang.Thread _thread;
    private static volatile int debugStatus;

    /* JADX INFO: renamed from: ᛲᛲᛵ, reason: contains not printable characters */
    public static final defpackage.RunnableC1761 f7778 = null;

    /* JADX INFO: renamed from: ᛲᛴᛱᛶ, reason: contains not printable characters */
    public static final long f7779 = 0;

    static {
            ᲀᲁᲁᛳ r0 = new ᲀᲁᲁᛳ
            r0.<init>()
            defpackage.RunnableC1761.f7778 = r0
            r1 = 0
            r0.m575(r1)
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
            defpackage.RunnableC1761.f7779 = r0
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r17 = this;
            r1 = r17
            java.lang.ThreadLocal r0 = defpackage.AbstractC1054.f4655
            r0.set(r1)
            r2 = 0
            monitor-enter(r17)     // Catch: java.lang.Throwable -> L4e
            int r0 = defpackage.RunnableC1761.debugStatus     // Catch: java.lang.Throwable -> L8f
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
            defpackage.RunnableC1761._thread = r2
            r1.m3167()
            boolean r0 = r1.m583()
            if (r0 != 0) goto L8a
            r1.mo581()
            return
        L29:
            defpackage.RunnableC1761.debugStatus = r6     // Catch: java.lang.Throwable -> L8f
            r1.notifyAll()     // Catch: java.lang.Throwable -> L8f
            monitor-exit(r17)     // Catch: java.lang.Throwable -> L4e
            r7 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r9 = r7
        L35:
            java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L4e
            long r11 = r1.m582()     // Catch: java.lang.Throwable -> L4e
            int r0 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            r13 = 0
            if (r0 != 0) goto L6b
            long r15 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L4e
            int r0 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r0 != 0) goto L50
            long r9 = defpackage.RunnableC1761.f7779     // Catch: java.lang.Throwable -> L4e
            long r9 = r9 + r15
            goto L50
        L4e:
            r0 = move-exception
            goto L92
        L50:
            long r15 = r9 - r15
            int r0 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
            if (r0 > 0) goto L65
            defpackage.RunnableC1761._thread = r2
            r1.m3167()
            boolean r0 = r1.m583()
            if (r0 != 0) goto L8a
            r1.mo581()
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
            int r0 = defpackage.RunnableC1761.debugStatus     // Catch: java.lang.Throwable -> L4e
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
            defpackage.RunnableC1761._thread = r2
            r1.m3167()
            boolean r0 = r1.m583()
            if (r0 != 0) goto L8a
            r1.mo581()
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
            defpackage.RunnableC1761._thread = r2
            r1.m3167()
            boolean r2 = r1.m583()
            if (r2 != 0) goto La0
            r1.mo581()
        La0:
            throw r0
    }

    @Override // defpackage.AbstractC0092
    public final void shutdown() {
            r1 = this;
            r0 = 4
            defpackage.RunnableC1761.debugStatus = r0
            super.shutdown()
            return
    }

    @Override // defpackage.AbstractC1805
    public final java.lang.String toString() {
            r0 = this;
            java.lang.String r0 = "DefaultExecutor"
            return r0
    }

    @Override // defpackage.AbstractC0092
    /* JADX INFO: renamed from: ᛱᛳᛷ */
    public final void mo570(long r1, defpackage.AbstractRunnableC0422 r3) {
            r0 = this;
            java.util.concurrent.RejectedExecutionException r0 = new java.util.concurrent.RejectedExecutionException
            java.lang.String r1 = "DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details"
            r0.<init>(r1)
            throw r0
    }

    @Override // defpackage.AbstractC0092, defpackage.InterfaceC1925
    /* JADX INFO: renamed from: ᛲᛴᲇᛳ */
    public final defpackage.InterfaceC0843 mo573(long r3, defpackage.RunnableC1062 r5, defpackage.InterfaceC0493 r6) {
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
            ᛷᛸᛲᛴ r6 = new ᛷᛸᛲᛴ
            long r0 = r0 + r3
            r6.<init>(r0, r5)
            r2.m576(r3, r6)
            return r6
        L31:
            ᲈᛲᛴᛱ r2 = defpackage.C2187.f9280
            return r2
    }

    @Override // defpackage.AbstractC0092
    /* JADX INFO: renamed from: ᛳᛳᛳᲈ */
    public final void mo574(java.lang.Runnable r3) {
            r2 = this;
            int r0 = defpackage.RunnableC1761.debugStatus
            r1 = 4
            if (r0 == r1) goto L9
            super.mo574(r3)
            return
        L9:
            java.util.concurrent.RejectedExecutionException r2 = new java.util.concurrent.RejectedExecutionException
            java.lang.String r3 = "DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details"
            r2.<init>(r3)
            throw r2
    }

    /* JADX INFO: renamed from: ᛷᛴᲈ, reason: contains not printable characters */
    public final synchronized void m3167() {
            r4 = this;
            monitor-enter(r4)
            int r0 = defpackage.RunnableC1761.debugStatus     // Catch: java.lang.Throwable -> L25
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
            monitor-exit(r4)
            return
        L11:
            defpackage.RunnableC1761.debugStatus = r2     // Catch: java.lang.Throwable -> L25
            sun.misc.Unsafe r0 = defpackage.AbstractC0051.f569     // Catch: java.lang.Throwable -> L25
            long r1 = defpackage.AbstractC0092.f883     // Catch: java.lang.Throwable -> L25
            r3 = 0
            r0.putObjectVolatile(r4, r1, r3)     // Catch: java.lang.Throwable -> L25
            long r1 = defpackage.AbstractC0092.f885     // Catch: java.lang.Throwable -> L25
            r0.putObjectVolatile(r4, r1, r3)     // Catch: java.lang.Throwable -> L25
            r4.notifyAll()     // Catch: java.lang.Throwable -> L25
            monitor-exit(r4)
            return
        L25:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L25
            throw r0
    }

    @Override // defpackage.AbstractC0092
    /* JADX INFO: renamed from: ᛷᲇᛷᛶ */
    public final java.lang.Thread mo581() {
            r2 = this;
            java.lang.Thread r0 = defpackage.RunnableC1761._thread
            if (r0 != 0) goto L29
            monitor-enter(r2)
            java.lang.Thread r0 = defpackage.RunnableC1761._thread     // Catch: java.lang.Throwable -> L23
            if (r0 != 0) goto L25
            java.lang.Thread r0 = new java.lang.Thread     // Catch: java.lang.Throwable -> L23
            java.lang.String r1 = "kotlinx.coroutines.DefaultExecutor"
            r0.<init>(r2, r1)     // Catch: java.lang.Throwable -> L23
            defpackage.RunnableC1761._thread = r0     // Catch: java.lang.Throwable -> L23
            java.lang.Class<ᲀᲁᲁᛳ> r1 = defpackage.RunnableC1761.class
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch: java.lang.Throwable -> L23
            r0.setContextClassLoader(r1)     // Catch: java.lang.Throwable -> L23
            r1 = 1
            r0.setDaemon(r1)     // Catch: java.lang.Throwable -> L23
            r0.start()     // Catch: java.lang.Throwable -> L23
            goto L25
        L23:
            r0 = move-exception
            goto L27
        L25:
            monitor-exit(r2)
            return r0
        L27:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L23
            throw r0
        L29:
            return r0
    }
}
