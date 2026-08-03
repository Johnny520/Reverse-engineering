package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۨۥۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC1771 extends Yue.AbstractC2238 implements java.lang.Runnable {

    @Yue.InterfaceC4543
    private static volatile java.lang.Thread _thread = null;
    private static volatile int debugStatus = 0;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final Yue.RunnableC1771 f5485 = null;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final java.lang.String f5486 = "kotlinx.coroutines.DefaultExecutor";

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static final long f5487 = 1000;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static final long f5488 = 0;

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public static final int f5489 = 0;

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public static final int f5490 = 1;

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static final int f5491 = 2;

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public static final int f5492 = 3;

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public static final int f5493 = 4;

    static {
            Yue.ۥ۟ۨۥۤ r0 = new Yue.ۥ۟ۨۥۤ
            r0.<init>()
            Yue.RunnableC1771.f5485 = r0
            r1 = 1
            r2 = 0
            r3 = 0
            Yue.AbstractC2237.m10252(r0, r3, r1, r2)
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
            r1 = 1000(0x3e8, double:4.94E-321)
            java.lang.String r3 = "kotlinx.coroutines.DefaultExecutor.keepAlive"
            java.lang.Long r1 = java.lang.Long.getLong(r3, r1)     // Catch: java.lang.SecurityException -> L18
            goto L1c
        L18:
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
        L1c:
            long r1 = r1.longValue()
            long r0 = r0.toNanos(r1)
            Yue.RunnableC1771.f5488 = r0
            return
    }

    public RunnableC1771() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ۥ۟۠۟ۧ, reason: contains not printable characters */
    public static /* synthetic */ void m8437() {
            return
    }

    @Override // java.lang.Runnable
    public void run() {
            r12 = this;
            Yue.ۥۢۡۡۨ r0 = Yue.C6184.f22161
            r0.m23138(r12)
            Yue.ۥ۟۟ۢۧ r0 = Yue.C0098.m539()
            if (r0 == 0) goto Le
            r0.m532()
        Le:
            r0 = 0
            boolean r1 = r12.m8447()     // Catch: java.lang.Throwable -> L4b
            if (r1 != 0) goto L2d
            Yue.RunnableC1771._thread = r0
            r12.m8441()
            Yue.ۥ۟۟ۢۧ r0 = Yue.C0098.m539()
            if (r0 == 0) goto L23
            r0.m536()
        L23:
            boolean r0 = r12.mo10259()
            if (r0 != 0) goto L2c
            r12.mo4683()
        L2c:
            return
        L2d:
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r3 = r1
        L33:
            java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L4b
            long r5 = r12.mo10262()     // Catch: java.lang.Throwable -> L4b
            int r7 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            r8 = 0
            if (r7 != 0) goto L7b
            Yue.ۥ۟۟ۢۧ r7 = Yue.C0098.m539()     // Catch: java.lang.Throwable -> L4b
            if (r7 == 0) goto L4d
            long r10 = r7.m530()     // Catch: java.lang.Throwable -> L4b
            goto L51
        L4b:
            r1 = move-exception
            goto Lb1
        L4d:
            long r10 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L4b
        L51:
            int r7 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r7 != 0) goto L58
            long r3 = Yue.RunnableC1771.f5488     // Catch: java.lang.Throwable -> L4b
            long r3 = r3 + r10
        L58:
            long r10 = r3 - r10
            int r7 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r7 > 0) goto L76
            Yue.RunnableC1771._thread = r0
            r12.m8441()
            Yue.ۥ۟۟ۢۧ r0 = Yue.C0098.m539()
            if (r0 == 0) goto L6c
            r0.m536()
        L6c:
            boolean r0 = r12.mo10259()
            if (r0 != 0) goto L75
            r12.mo4683()
        L75:
            return
        L76:
            long r5 = Yue.C5196.m19522(r5, r10)     // Catch: java.lang.Throwable -> L4b
            goto L7c
        L7b:
            r3 = r1
        L7c:
            int r7 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r7 <= 0) goto L33
            boolean r7 = r12.m8445()     // Catch: java.lang.Throwable -> L4b
            if (r7 == 0) goto L9e
            Yue.RunnableC1771._thread = r0
            r12.m8441()
            Yue.ۥ۟۟ۢۧ r0 = Yue.C0098.m539()
            if (r0 == 0) goto L94
            r0.m536()
        L94:
            boolean r0 = r12.mo10259()
            if (r0 != 0) goto L9d
            r12.mo4683()
        L9d:
            return
        L9e:
            Yue.ۥ۟۟ۢۧ r7 = Yue.C0098.m539()     // Catch: java.lang.Throwable -> L4b
            if (r7 == 0) goto Laa
            r7.m531(r12, r5)     // Catch: java.lang.Throwable -> L4b
            Yue.ۥۣۢ۠ۤ r7 = Yue.C6593.f23016     // Catch: java.lang.Throwable -> L4b
            goto Lab
        Laa:
            r7 = r0
        Lab:
            if (r7 != 0) goto L33
            java.util.concurrent.locks.LockSupport.parkNanos(r12, r5)     // Catch: java.lang.Throwable -> L4b
            goto L33
        Lb1:
            Yue.RunnableC1771._thread = r0
            r12.m8441()
            Yue.ۥ۟۟ۢۧ r0 = Yue.C0098.m539()
            if (r0 == 0) goto Lbf
            r0.m536()
        Lbf:
            boolean r0 = r12.mo10259()
            if (r0 != 0) goto Lc8
            r12.mo4683()
        Lc8:
            throw r1
    }

    @Override // Yue.AbstractC2238, Yue.AbstractC2237
    public void shutdown() {
            r1 = this;
            r0 = 4
            Yue.RunnableC1771.debugStatus = r0
            super.shutdown()
            return
    }

    @Override // Yue.AbstractC2238, Yue.InterfaceC1802
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥۣ۟۟, reason: contains not printable characters */
    public Yue.InterfaceC1892 mo8438(long r1, @Yue.InterfaceC4418 java.lang.Runnable r3, @Yue.InterfaceC4418 Yue.InterfaceC1632 r4) {
            r0 = this;
            Yue.ۥۣۣ۠۟ r1 = r0.m10274(r1, r3)
            return r1
    }

    @Override // Yue.AbstractC2243
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟ۨۡ */
    public java.lang.Thread mo4683() {
            r1 = this;
            java.lang.Thread r0 = Yue.RunnableC1771._thread
            if (r0 != 0) goto L8
            java.lang.Thread r0 = r1.m8442()
        L8:
            return r0
    }

    @Override // Yue.AbstractC2243
    /* JADX INFO: renamed from: ۥ۟۟ۨۢ, reason: contains not printable characters */
    public void mo8439(long r1, @Yue.InterfaceC4418 Yue.AbstractC2238.AbstractRunnableC2241 r3) {
            r0 = this;
            r0.m8448()
            return
    }

    @Override // Yue.AbstractC2238
    /* JADX INFO: renamed from: ۥ۟۟ۨۧ, reason: contains not printable characters */
    public void mo8440(@Yue.InterfaceC4418 java.lang.Runnable r2) {
            r1 = this;
            boolean r0 = r1.m8444()
            if (r0 == 0) goto L9
            r1.m8448()
        L9:
            super.mo8440(r2)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۠۟ۤ, reason: contains not printable characters */
    public final synchronized void m8441() {
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.m8445()     // Catch: java.lang.Throwable -> L14
            if (r0 != 0) goto L9
            monitor-exit(r1)
            return
        L9:
            r0 = 3
            Yue.RunnableC1771.debugStatus = r0     // Catch: java.lang.Throwable -> L14
            r1.m10271()     // Catch: java.lang.Throwable -> L14
            r1.notifyAll()     // Catch: java.lang.Throwable -> L14
            monitor-exit(r1)
            return
        L14:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L14
            throw r0
    }

    /* JADX INFO: renamed from: ۥ۟۠۟ۥ, reason: contains not printable characters */
    public final synchronized java.lang.Thread m8442() {
            r2 = this;
            monitor-enter(r2)
            java.lang.Thread r0 = Yue.RunnableC1771._thread     // Catch: java.lang.Throwable -> L16
            if (r0 != 0) goto L18
            java.lang.Thread r0 = new java.lang.Thread     // Catch: java.lang.Throwable -> L16
            java.lang.String r1 = "kotlinx.coroutines.DefaultExecutor"
            r0.<init>(r2, r1)     // Catch: java.lang.Throwable -> L16
            Yue.RunnableC1771._thread = r0     // Catch: java.lang.Throwable -> L16
            r1 = 1
            r0.setDaemon(r1)     // Catch: java.lang.Throwable -> L16
            r0.start()     // Catch: java.lang.Throwable -> L16
            goto L18
        L16:
            r0 = move-exception
            goto L1a
        L18:
            monitor-exit(r2)
            return r0
        L1a:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L16
            throw r0
    }

    /* JADX INFO: renamed from: ۥ۟۠۟ۦ, reason: contains not printable characters */
    public final synchronized void m8443() {
            r1 = this;
            monitor-enter(r1)
            r0 = 0
            Yue.RunnableC1771.debugStatus = r0     // Catch: java.lang.Throwable -> Lf
            r1.m8442()     // Catch: java.lang.Throwable -> Lf
        L7:
            int r0 = Yue.RunnableC1771.debugStatus     // Catch: java.lang.Throwable -> Lf
            if (r0 != 0) goto L11
            r1.wait()     // Catch: java.lang.Throwable -> Lf
            goto L7
        Lf:
            r0 = move-exception
            goto L13
        L11:
            monitor-exit(r1)
            return
        L13:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lf
            throw r0
    }

    /* JADX INFO: renamed from: ۥ۟۠۟ۨ, reason: contains not printable characters */
    public final boolean m8444() {
            r2 = this;
            int r0 = Yue.RunnableC1771.debugStatus
            r1 = 4
            if (r0 != r1) goto L7
            r0 = 1
            goto L8
        L7:
            r0 = 0
        L8:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۠۠, reason: contains not printable characters */
    public final boolean m8445() {
            r2 = this;
            int r0 = Yue.RunnableC1771.debugStatus
            r1 = 2
            if (r0 == r1) goto Lb
            r1 = 3
            if (r0 != r1) goto L9
            goto Lb
        L9:
            r0 = 0
            goto Lc
        Lb:
            r0 = 1
        Lc:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۠۠۟, reason: contains not printable characters */
    public final boolean m8446() {
            r1 = this;
            java.lang.Thread r0 = Yue.RunnableC1771._thread
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۠۠۠, reason: contains not printable characters */
    public final synchronized boolean m8447() {
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.m8445()     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto La
            monitor-exit(r1)
            r0 = 0
            return r0
        La:
            r0 = 1
            Yue.RunnableC1771.debugStatus = r0     // Catch: java.lang.Throwable -> L12
            r1.notifyAll()     // Catch: java.lang.Throwable -> L12
            monitor-exit(r1)
            return r0
        L12:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L12
            throw r0
    }

    /* JADX INFO: renamed from: ۥ۟۠۠ۡ, reason: contains not printable characters */
    public final void m8448() {
            r2 = this;
            java.util.concurrent.RejectedExecutionException r0 = new java.util.concurrent.RejectedExecutionException
            java.lang.String r1 = "DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details"
            r0.<init>(r1)
            throw r0
    }

    /* JADX INFO: renamed from: ۥ۟۠۠ۢ, reason: contains not printable characters */
    public final synchronized void m8449(long r7) {
            r6 = this;
            monitor-enter(r6)
            long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L10
            long r0 = r0 + r7
            boolean r2 = r6.m8445()     // Catch: java.lang.Throwable -> L10
            if (r2 != 0) goto L12
            r2 = 2
            Yue.RunnableC1771.debugStatus = r2     // Catch: java.lang.Throwable -> L10
            goto L12
        L10:
            r7 = move-exception
            goto L46
        L12:
            int r2 = Yue.RunnableC1771.debugStatus     // Catch: java.lang.Throwable -> L10
            r3 = 3
            if (r2 == r3) goto L41
            java.lang.Thread r2 = Yue.RunnableC1771._thread     // Catch: java.lang.Throwable -> L10
            if (r2 == 0) goto L41
            java.lang.Thread r2 = Yue.RunnableC1771._thread     // Catch: java.lang.Throwable -> L10
            if (r2 == 0) goto L31
            Yue.ۥ۟۟ۢۧ r3 = Yue.C0098.m539()     // Catch: java.lang.Throwable -> L10
            if (r3 == 0) goto L2b
            r3.m535(r2)     // Catch: java.lang.Throwable -> L10
            Yue.ۥۣۢ۠ۤ r3 = Yue.C6593.f23016     // Catch: java.lang.Throwable -> L10
            goto L2c
        L2b:
            r3 = 0
        L2c:
            if (r3 != 0) goto L31
            java.util.concurrent.locks.LockSupport.unpark(r2)     // Catch: java.lang.Throwable -> L10
        L31:
            long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L10
            long r2 = r0 - r2
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 <= 0) goto L41
            r6.wait(r7)     // Catch: java.lang.Throwable -> L10
            goto L12
        L41:
            r7 = 0
            Yue.RunnableC1771.debugStatus = r7     // Catch: java.lang.Throwable -> L10
            monitor-exit(r6)
            return
        L46:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L10
            throw r7
    }
}
