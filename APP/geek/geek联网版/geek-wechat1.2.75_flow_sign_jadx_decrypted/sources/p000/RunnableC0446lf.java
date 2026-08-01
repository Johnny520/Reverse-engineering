package p000;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: renamed from: lf */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0446lf extends AbstractC0450lj implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* JADX INFO: renamed from: i */
    public static final RunnableC0446lf f2999i;

    /* JADX INFO: renamed from: j */
    public static final long f3000j;

    static {
        Long l;
        RunnableC0446lf runnableC0446lf = new RunnableC0446lf();
        f2999i = runnableC0446lf;
        runnableC0446lf.m1825k(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l = 1000L;
        }
        f3000j = timeUnit.toNanos(l.longValue());
    }

    @Override // p000.AbstractC0487mj
    /* JADX INFO: renamed from: j */
    public final Thread mo1761j() {
        Thread thread;
        Thread thread2 = _thread;
        if (thread2 != null) {
            return thread2;
        }
        synchronized (this) {
            thread = _thread;
            if (thread == null) {
                thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                _thread = thread;
                thread.setDaemon(true);
                thread.start();
            }
        }
        return thread;
    }

    @Override // p000.AbstractC0487mj
    /* JADX INFO: renamed from: m */
    public final void mo1762m(long j, AbstractRunnableC0376jj abstractRunnableC0376jj) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // p000.AbstractC0450lj
    /* JADX INFO: renamed from: n */
    public final void mo1763n(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.mo1763n(runnable);
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zM1767p;
        z60.f5555a.set(this);
        try {
            synchronized (this) {
                int i = debugStatus;
                if (i == 2 || i == 3) {
                    if (zM1767p) {
                        return;
                    } else {
                        return;
                    }
                }
                debugStatus = 1;
                notifyAll();
                long j = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long jM1768q = m1768q();
                    if (jM1768q == Long.MAX_VALUE) {
                        long jNanoTime = System.nanoTime();
                        if (j == Long.MAX_VALUE) {
                            j = f3000j + jNanoTime;
                        }
                        long j2 = j - jNanoTime;
                        if (j2 <= 0) {
                            _thread = null;
                            m1764s();
                            if (m1767p()) {
                                return;
                            }
                            mo1761j();
                            return;
                        }
                        if (jM1768q > j2) {
                            jM1768q = j2;
                        }
                    } else {
                        j = Long.MAX_VALUE;
                    }
                    if (jM1768q > 0) {
                        int i2 = debugStatus;
                        if (i2 == 2 || i2 == 3) {
                            _thread = null;
                            m1764s();
                            if (m1767p()) {
                                return;
                            }
                            mo1761j();
                            return;
                        }
                        LockSupport.parkNanos(this, jM1768q);
                    }
                }
            }
        } finally {
            _thread = null;
            m1764s();
            if (!m1767p()) {
                mo1761j();
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public final synchronized void m1764s() {
        int i = debugStatus;
        if (i == 2 || i == 3) {
            debugStatus = 3;
            AbstractC0450lj.f3006f.set(this, null);
            AbstractC0450lj.f3007g.set(this, null);
            notifyAll();
        }
    }

    @Override // p000.AbstractC0450lj, p000.AbstractC0487mj
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }
}
