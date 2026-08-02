package p000;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class k50 extends qg0 implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* JADX INFO: renamed from: q */
    public static final k50 f5346q;

    /* JADX INFO: renamed from: r */
    public static final long f5347r;

    static {
        Long l;
        k50 k50Var = new k50();
        f5346q = k50Var;
        k50Var.m2906I(false);
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l = 1000L;
        }
        f5347r = TimeUnit.MILLISECONDS.toNanos(l.longValue());
    }

    @Override // p000.qg0
    /* JADX INFO: renamed from: L */
    public final void mo2602L(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.mo2602L(runnable);
    }

    @Override // p000.qg0
    /* JADX INFO: renamed from: O */
    public final Thread mo2217O() {
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
                thread.setContextClassLoader(f5346q.getClass().getClassLoader());
                thread.setDaemon(true);
                thread.start();
            }
        }
        return thread;
    }

    @Override // p000.qg0
    /* JADX INFO: renamed from: Q */
    public final void mo2603Q(long j, og0 og0Var) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    /* JADX INFO: renamed from: S */
    public final synchronized void m2604S() {
        int i = debugStatus;
        if (i == 2 || i == 3) {
            debugStatus = 3;
            qg0.f8957n.set(this, null);
            qg0.f8958o.set(this, null);
            notifyAll();
        }
    }

    @Override // p000.r60
    /* JADX INFO: renamed from: g */
    public final ca0 mo2605g(long j, q23 q23Var, a20 a20Var) {
        long j2 = j > 0 ? j >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j : 0L;
        if (j2 >= 4611686018427387903L) {
            return go1.f3642h;
        }
        long jNanoTime = System.nanoTime();
        ng0 ng0Var = new ng0(j2 + jNanoTime, q23Var);
        m4184R(jNanoTime, ng0Var);
        return ng0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zM4183P;
        a23.f41a.set(this);
        try {
            synchronized (this) {
                int i = debugStatus;
                if (i == 2 || i == 3) {
                    if (zM4183P) {
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
                    long jMo2907J = mo2907J();
                    if (jMo2907J == Long.MAX_VALUE) {
                        long jNanoTime = System.nanoTime();
                        if (j == Long.MAX_VALUE) {
                            j = f5347r + jNanoTime;
                        }
                        long j2 = j - jNanoTime;
                        if (j2 <= 0) {
                            _thread = null;
                            m2604S();
                            if (m4183P()) {
                                return;
                            }
                            mo2217O();
                            return;
                        }
                        if (jMo2907J > j2) {
                            jMo2907J = j2;
                        }
                    } else {
                        j = Long.MAX_VALUE;
                    }
                    if (jMo2907J > 0) {
                        int i2 = debugStatus;
                        if (i2 == 2 || i2 == 3) {
                            _thread = null;
                            m2604S();
                            if (m4183P()) {
                                return;
                            }
                            mo2217O();
                            return;
                        }
                        LockSupport.parkNanos(this, jMo2907J);
                    }
                }
            }
        } finally {
            _thread = null;
            m2604S();
            if (!m4183P()) {
                mo2217O();
            }
        }
    }

    @Override // p000.qg0, p000.lg0
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    @Override // p000.c20
    public final String toString() {
        return "DefaultExecutor";
    }
}
