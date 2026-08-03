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
    public static final RunnableC0664Pc f2120h;

    /* JADX INFO: renamed from: i */
    public static final long f2121i;

    static {
        Long l;
        RunnableC0664Pc runnableC0664Pc = new RunnableC0664Pc();
        f2120h = runnableC0664Pc;
        runnableC0664Pc.m5096y(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l = 1000L;
        }
        f2121i = timeUnit.toNanos(l.longValue());
    }

    @Override // p000.AbstractC2588ug
    /* JADX INFO: renamed from: A */
    public final void mo1322A(long j, AbstractRunnableC2459rg abstractRunnableC2459rg) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // p000.AbstractC2545tg
    /* JADX INFO: renamed from: B */
    public final void mo1323B(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.mo1323B(runnable);
    }

    /* JADX INFO: renamed from: H */
    public final synchronized void m1324H() {
        int i = debugStatus;
        if (i == 2 || i == 3) {
            debugStatus = 3;
            AbstractC2545tg.f8861e.set(this, null);
            AbstractC2545tg.f8862f.set(this, null);
            notifyAll();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zM5028E;
        AbstractC1129aB.f3579a.set(this);
        try {
            synchronized (this) {
                int i = debugStatus;
                if (i == 2 || i == 3) {
                    if (zM5028E) {
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
                    long jM5029F = m5029F();
                    if (jM5029F == Long.MAX_VALUE) {
                        long jNanoTime = System.nanoTime();
                        if (j == Long.MAX_VALUE) {
                            j = f2121i + jNanoTime;
                        }
                        long j2 = j - jNanoTime;
                        if (j2 <= 0) {
                            _thread = null;
                            m1324H();
                            if (m5028E()) {
                                return;
                            }
                            mo1325x();
                            return;
                        }
                        if (jM5029F > j2) {
                            jM5029F = j2;
                        }
                    } else {
                        j = Long.MAX_VALUE;
                    }
                    if (jM5029F > 0) {
                        int i2 = debugStatus;
                        if (i2 == 2 || i2 == 3) {
                            _thread = null;
                            m1324H();
                            if (m5028E()) {
                                return;
                            }
                            mo1325x();
                            return;
                        }
                        LockSupport.parkNanos(this, jM5029F);
                    }
                }
            }
        } finally {
            _thread = null;
            m1324H();
            if (!m5028E()) {
                mo1325x();
            }
        }
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
                thread.setContextClassLoader(RunnableC0664Pc.class.getClassLoader());
                thread.setDaemon(true);
                thread.start();
            }
        }
        return thread;
    }
}
