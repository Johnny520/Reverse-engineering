package p000;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: renamed from: Pc */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0664Pc extends AbstractC2545tg implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* JADX INFO: renamed from: h */
    public static final RunnableC0664Pc f2120h = null;

    /* JADX INFO: renamed from: i */
    public static final long f2121i = 0;

    static {
        RunnableC0664Pc r0 = new RunnableC0664Pc();
        f2120h = r0;
        r0.m5096y(false);
        TimeUnit r02 = TimeUnit.MILLISECONDS;
        Long r1 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000);     // Catch: SecurityException -> L5
    L6:
        f2121i = r02.toNanos(r1.longValue());
        return;
    L5:
        r1 = 1000L;
        goto L6
    }

    @Override // p000.AbstractC2588ug
    /* JADX INFO: renamed from: A */
    public final void mo1322A(long r1, AbstractRunnableC2459rg r3) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // p000.AbstractC2545tg
    /* JADX INFO: renamed from: B */
    public final void mo1323B(Runnable r3) {
        if (debugStatus == 4) goto L7;
        super.mo1323B(r3);
        return;
    L7:
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    /* JADX INFO: renamed from: H */
    public final synchronized void m1324H() {
        monitor-enter(this);
        int r0 = debugStatus;     // Catch: Throwable -> L16
        if (r0 == 2) goto L9;
        if (r0 == 3) goto L9;
        boolean r02 = false;
    L10:
        if (r02 == true) goto L13;
        monitor-exit(this);
        return;
    L13:
        debugStatus = 3;     // Catch: Throwable -> L16
        AbstractC2545tg.f8861e.set(this, null);     // Catch: Throwable -> L16
        AbstractC2545tg.f8862f.set(this, null);     // Catch: Throwable -> L16
        notifyAll();     // Catch: Throwable -> L16
        monitor-exit(this);
        return;
    L9:
        r02 = true;
    L16:
        th = move-exception;
        throw th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC1129aB.f3579a.set(this);
        monitor-enter(this);     // Catch: Throwable -> L26
        int r0 = debugStatus;     // Catch: Throwable -> L53
        if (r0 == 2) goto L10;
        if (r0 == 3) goto L10;
        boolean r02 = false;
    L11:
        if (r02 == false) goto L17;
        monitor-exit(this);     // Catch: Throwable -> L26
        _thread = null;
        m1324H();
        if (m5028E() == true) goto L69;
        mo1325x();
        return;
    L69:
        return;
    L17:
        debugStatus = 1;     // Catch: Throwable -> L53
        notifyAll();     // Catch: Throwable -> L53
        monitor-exit(this);     // Catch: Throwable -> L26
        long r9 = Long.MAX_VALUE;
    L20:
        Thread.interrupted();     // Catch: Throwable -> L26
        long r11 = m5029F();     // Catch: Throwable -> L26
        if (r11 != Long.MAX_VALUE) goto L37;
        long r15 = System.nanoTime();     // Catch: Throwable -> L26
        if (r9 == Long.MAX_VALUE) goto L25;
    L28:
        long r152 = r9 - r15;
        if (r152 <= 0) goto L30;
        if (r11 <= r152) goto L39;
        r11 = r152;
    L39:
        if (r11 <= 0) goto L20;
        int r03 = debugStatus;     // Catch: Throwable -> L26
        if (r03 == 2) goto L45;
        if (r03 == 3) goto L45;
        boolean r04 = false;
    L46:
        if (r04 == true) goto L47;
        LockSupport.parkNanos(this, r11);     // Catch: Throwable -> L26
        goto L20
    L47:
        _thread = null;
        m1324H();
        if (m5028E() == true) goto L71;
        mo1325x();
        return;
    L71:
        return;
    L45:
        r04 = true;
        goto L46
    L30:
        _thread = null;
        m1324H();
        if (m5028E() == true) goto L70;
        mo1325x();
        return;
    L70:
        return;
    L25:
        r9 = f2121i + r15;
        goto L28
    L37:
        r9 = Long.MAX_VALUE;
        goto L39
    L10:
        r02 = true;
    L53:
        th = move-exception;
        throw th;     // Catch: Throwable -> L26
    L26:
        th = move-exception;
        _thread = null;
        m1324H();
        if (m5028E() == true) goto L59;
        mo1325x();
    L59:
        throw th;
    }

    @Override // p000.AbstractC2545tg, p000.AbstractC2588ug
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    @Override // p000.AbstractC1217bc
    public final String toString() {
        return "DefaultExecutor";
    }

    @Override // p000.AbstractC2588ug
    /* JADX INFO: renamed from: x */
    public final Thread mo1325x() {
        Thread r0 = _thread;
        if (r0 != null) goto L15;
        monitor-enter(this);
        Thread r02 = _thread;     // Catch: Throwable -> L9
        if (r02 != null) goto L11;
        r02 = new Thread(this, "kotlinx.coroutines.DefaultExecutor");     // Catch: Throwable -> L9
        _thread = r02;     // Catch: Throwable -> L9
        r02.setContextClassLoader(RunnableC0664Pc.class.getClassLoader());     // Catch: Throwable -> L9
        r02.setDaemon(true);     // Catch: Throwable -> L9
        r02.start();     // Catch: Throwable -> L9
    L11:
        monitor-exit(this);
        return r02;
    L9:
        th = move-exception;
        throw th;
    L15:
        return r0;
    }
}
