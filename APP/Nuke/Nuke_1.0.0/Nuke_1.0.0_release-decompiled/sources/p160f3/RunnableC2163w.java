package p160f3;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import p074O2.InterfaceC1051i;

/* JADX INFO: renamed from: f3.w */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC2163w extends AbstractC2108K implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* JADX INFO: renamed from: m */
    public static final RunnableC2163w f7120m;

    /* JADX INFO: renamed from: n */
    public static final long f7121n;

    static {
        Long l3;
        RunnableC2163w runnableC2163w = new RunnableC2163w();
        f7120m = runnableC2163w;
        runnableC2163w.m3901J(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l3 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l3 = 1000L;
        }
        f7121n = timeUnit.toNanos(l3.longValue());
    }

    @Override // p160f3.AbstractC2109L
    /* JADX INFO: renamed from: I */
    public final Thread mo3900I() {
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
                thread.setContextClassLoader(f7120m.getClass().getClassLoader());
                thread.setDaemon(true);
                thread.start();
            }
        }
        return thread;
    }

    @Override // p160f3.AbstractC2109L
    /* JADX INFO: renamed from: M */
    public final void mo3903M(long j5, AbstractRunnableC2106I abstractRunnableC2106I) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // p160f3.AbstractC2108K
    /* JADX INFO: renamed from: N */
    public final void mo3891N(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.mo3891N(runnable);
    }

    /* JADX INFO: renamed from: S */
    public final synchronized void m4003S() {
        int i5 = debugStatus;
        if (i5 == 2 || i5 == 3) {
            debugStatus = 3;
            AbstractC2108K.f7039j.set(this, null);
            AbstractC2108K.f7040k.set(this, null);
            notifyAll();
        }
    }

    @Override // p160f3.AbstractC2108K, p160f3.InterfaceC2165y
    /* JADX INFO: renamed from: f */
    public final InterfaceC2101D mo3897f(long j5, RunnableC2148m0 runnableC2148m0, InterfaceC1051i interfaceC1051i) {
        long j6 = j5 > 0 ? j5 >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j5 : 0L;
        if (j6 >= 4611686018427387903L) {
            return C2130d0.f7071d;
        }
        long jNanoTime = System.nanoTime();
        C2105H c2105h = new C2105H(j6 + jNanoTime, runnableC2148m0);
        m3895R(jNanoTime, c2105h);
        return c2105h;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zM3894Q;
        AbstractC2144k0.f7083a.set(this);
        try {
            synchronized (this) {
                int i5 = debugStatus;
                if (i5 == 2 || i5 == 3) {
                    if (zM3894Q) {
                        return;
                    } else {
                        return;
                    }
                }
                debugStatus = 1;
                notifyAll();
                long j5 = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long jMo3890K = mo3890K();
                    if (jMo3890K == Long.MAX_VALUE) {
                        long jNanoTime = System.nanoTime();
                        if (j5 == Long.MAX_VALUE) {
                            j5 = f7121n + jNanoTime;
                        }
                        long j6 = j5 - jNanoTime;
                        if (j6 <= 0) {
                            _thread = null;
                            m4003S();
                            if (m3894Q()) {
                                return;
                            }
                            mo3900I();
                            return;
                        }
                        if (jMo3890K > j6) {
                            jMo3890K = j6;
                        }
                    } else {
                        j5 = Long.MAX_VALUE;
                    }
                    if (jMo3890K > 0) {
                        int i6 = debugStatus;
                        if (i6 == 2 || i6 == 3) {
                            _thread = null;
                            m4003S();
                            if (m3894Q()) {
                                return;
                            }
                            mo3900I();
                            return;
                        }
                        LockSupport.parkNanos(this, jMo3890K);
                    }
                }
            }
        } finally {
            _thread = null;
            m4003S();
            if (!m3894Q()) {
                mo3900I();
            }
        }
    }

    @Override // p160f3.AbstractC2108K, p160f3.AbstractC2109L
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    @Override // p160f3.AbstractC2153p
    public final String toString() {
        return "DefaultExecutor";
    }
}
