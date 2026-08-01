package defpackage;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: loaded from: classes.dex */
public final class kf extends jj implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;
    public static final kf i = null;
    public static final long j = 0;

    static {
        kf r0 = new kf();
        i = r0;
        r0.k(false);
        TimeUnit r02 = TimeUnit.MILLISECONDS;
        Long r1 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000);     // Catch: SecurityException -> L5
    L6:
        j = r02.toNanos(r1.longValue());
        return;
    L5:
        r1 = 1000L;
        goto L6
    }

    @Override // defpackage.kj
    public final Thread j() {
        Thread r0 = _thread;
        if (r0 != null) goto L15;
        monitor-enter(this);
        Thread r02 = _thread;     // Catch: Throwable -> L9
        if (r02 != null) goto L11;
        r02 = new Thread(this, "kotlinx.coroutines.DefaultExecutor");     // Catch: Throwable -> L9
        _thread = r02;     // Catch: Throwable -> L9
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

    @Override // defpackage.kj
    public final void m(long r1, hj r3) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // defpackage.jj
    public final void n(Runnable r3) {
        if (debugStatus == 4) goto L7;
        super.n(r3);
        return;
    L7:
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // java.lang.Runnable
    public final void run() {
        t60.a.set(this);
        monitor-enter(this);     // Catch: Throwable -> L26
        int r0 = debugStatus;     // Catch: Throwable -> L53
        if (r0 == 2) goto L10;
        if (r0 == 3) goto L10;
        boolean r02 = false;
    L11:
        if (r02 == false) goto L17;
        monitor-exit(this);     // Catch: Throwable -> L26
        _thread = null;
        s();
        if (p() == true) goto L69;
        j();
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
        long r11 = q();     // Catch: Throwable -> L26
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
        s();
        if (p() == true) goto L71;
        j();
        return;
    L71:
        return;
    L45:
        r04 = true;
        goto L46
    L30:
        _thread = null;
        s();
        if (p() == true) goto L70;
        j();
        return;
    L70:
        return;
    L25:
        r9 = j + r15;
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
        s();
        if (p() == true) goto L59;
        j();
    L59:
        throw th;
    }

    public final synchronized void s() {
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
        jj.f.set(this, null);     // Catch: Throwable -> L16
        jj.g.set(this, null);     // Catch: Throwable -> L16
        notifyAll();     // Catch: Throwable -> L16
        monitor-exit(this);
        return;
    L9:
        r02 = true;
    L16:
        th = move-exception;
        throw th;
    }

    @Override // defpackage.jj, defpackage.kj
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }
}
