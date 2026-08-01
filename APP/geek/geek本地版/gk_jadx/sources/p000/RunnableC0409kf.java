package p000;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: renamed from: kf */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0409kf extends AbstractC0376jj implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* JADX INFO: renamed from: i */
    public static final RunnableC0409kf f2886i;

    /* JADX INFO: renamed from: j */
    public static final long f2887j;

    static {
        Long l;
        RunnableC0409kf runnableC0409kf = new RunnableC0409kf();
        f2886i = runnableC0409kf;
        runnableC0409kf.m1702k(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l = 1000L;
        }
        f2887j = timeUnit.toNanos(l.longValue());
    }

    @Override // p000.AbstractC0413kj
    /* JADX INFO: renamed from: j */
    public final Thread mo1695j() {
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

    @Override // p000.AbstractC0413kj
    /* JADX INFO: renamed from: m */
    public final void mo1696m(long j, AbstractRunnableC0300hj abstractRunnableC0300hj) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // p000.AbstractC0376jj
    /* JADX INFO: renamed from: n */
    public final void mo1599n(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.mo1599n(runnable);
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zM1601p;
        t60.f4515a.set(this);
        try {
            synchronized (this) {
                int i = debugStatus;
                if (i == 2 || i == 3) {
                    if (zM1601p) {
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
                    long jM1602q = m1602q();
                    if (jM1602q == Long.MAX_VALUE) {
                        long jNanoTime = System.nanoTime();
                        if (j == Long.MAX_VALUE) {
                            j = f2887j + jNanoTime;
                        }
                        long j2 = j - jNanoTime;
                        if (j2 <= 0) {
                            _thread = null;
                            m1697s();
                            if (m1601p()) {
                                return;
                            }
                            mo1695j();
                            return;
                        }
                        if (jM1602q > j2) {
                            jM1602q = j2;
                        }
                    } else {
                        j = Long.MAX_VALUE;
                    }
                    if (jM1602q > 0) {
                        int i2 = debugStatus;
                        if (i2 == 2 || i2 == 3) {
                            _thread = null;
                            m1697s();
                            if (m1601p()) {
                                return;
                            }
                            mo1695j();
                            return;
                        }
                        LockSupport.parkNanos(this, jM1602q);
                    }
                }
            }
        } finally {
            _thread = null;
            m1697s();
            if (!m1601p()) {
                mo1695j();
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public final synchronized void m1697s() {
        int i = debugStatus;
        if (i == 2 || i == 3) {
            debugStatus = 3;
            AbstractC0376jj.f2636f.set(this, null);
            AbstractC0376jj.f2637g.set(this, null);
            notifyAll();
        }
    }

    @Override // p000.AbstractC0376jj, p000.AbstractC0413kj
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }
}
