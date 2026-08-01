package ec;

import ec.AbstractC2146j1;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import p080f9.AbstractC2368o;
import p228p8.InterfaceC5980j;

/* JADX INFO: renamed from: ec.t0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC2185t0 extends AbstractC2146j1 implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* JADX INFO: renamed from: y */
    public static final RunnableC2185t0 f6009y;

    /* JADX INFO: renamed from: z */
    public static final long f6010z;

    static {
        Long l10;
        RunnableC2185t0 runnableC2185t0 = new RunnableC2185t0();
        f6009y = runnableC2185t0;
        AbstractC2142i1.m7774P0(runnableC2185t0, false, 1, null);
        try {
            l10 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l10 = 1000L;
        }
        f6010z = TimeUnit.MILLISECONDS.toNanos(l10.longValue());
    }

    @Override // ec.AbstractC2150k1
    /* JADX INFO: renamed from: V0 */
    public Thread mo7755V0() {
        Thread thread = _thread;
        return thread == null ? m7902q1() : thread;
    }

    @Override // ec.AbstractC2150k1
    /* JADX INFO: renamed from: W0 */
    public void mo7823W0(long j10, AbstractC2146j1.c cVar) {
        m7906u1();
    }

    @Override // ec.AbstractC2146j1
    /* JADX INFO: renamed from: b1 */
    public void mo7794b1(Runnable runnable) {
        if (m7903r1()) {
            m7906u1();
        }
        super.mo7794b1(runnable);
    }

    @Override // ec.AbstractC2146j1, ec.InterfaceC2201x0
    /* JADX INFO: renamed from: k */
    public InterfaceC2126e1 mo7800k(long j10, Runnable runnable, InterfaceC5980j interfaceC5980j) {
        return m7804m1(j10, runnable);
    }

    /* JADX INFO: renamed from: p1 */
    public final synchronized void m7901p1() {
        if (m7904s1()) {
            debugStatus = 3;
            m7799j1();
            notifyAll();
        }
    }

    /* JADX INFO: renamed from: q1 */
    public final synchronized Thread m7902q1() {
        Thread thread;
        thread = _thread;
        if (thread == null) {
            thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
            _thread = thread;
            thread.setContextClassLoader(f6009y.getClass().getClassLoader());
            thread.setDaemon(true);
            thread.start();
        }
        return thread;
    }

    /* JADX INFO: renamed from: r1 */
    public final boolean m7903r1() {
        return debugStatus == 4;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean zM7797h1;
        C2187t2.f6012a.m7910d(this);
        AbstractC2115c.m7635a();
        try {
            if (!m7905t1()) {
                if (zM7797h1) {
                    return;
                } else {
                    return;
                }
            }
            long j10 = Long.MAX_VALUE;
            while (true) {
                Thread.interrupted();
                long jMo7781S0 = mo7781S0();
                if (jMo7781S0 == Long.MAX_VALUE) {
                    AbstractC2115c.m7635a();
                    long jNanoTime = System.nanoTime();
                    if (j10 == Long.MAX_VALUE) {
                        j10 = f6010z + jNanoTime;
                    }
                    long j11 = j10 - jNanoTime;
                    if (j11 <= 0) {
                        _thread = null;
                        m7901p1();
                        AbstractC2115c.m7635a();
                        if (m7797h1()) {
                            return;
                        }
                        mo7755V0();
                        return;
                    }
                    jMo7781S0 = AbstractC2368o.m8583j(jMo7781S0, j11);
                } else {
                    j10 = Long.MAX_VALUE;
                }
                if (jMo7781S0 > 0) {
                    if (m7904s1()) {
                        _thread = null;
                        m7901p1();
                        AbstractC2115c.m7635a();
                        if (m7797h1()) {
                            return;
                        }
                        mo7755V0();
                        return;
                    }
                    AbstractC2115c.m7635a();
                    LockSupport.parkNanos(this, jMo7781S0);
                }
            }
        } finally {
            _thread = null;
            m7901p1();
            AbstractC2115c.m7635a();
            if (!m7797h1()) {
                mo7755V0();
            }
        }
    }

    /* JADX INFO: renamed from: s1 */
    public final boolean m7904s1() {
        int i10 = debugStatus;
        return i10 == 2 || i10 == 3;
    }

    @Override // ec.AbstractC2146j1, ec.AbstractC2142i1
    public void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    /* JADX INFO: renamed from: t1 */
    public final synchronized boolean m7905t1() {
        if (m7904s1()) {
            return false;
        }
        debugStatus = 1;
        notifyAll();
        return true;
    }

    @Override // ec.AbstractC2149k0
    public String toString() {
        return "DefaultExecutor";
    }

    /* JADX INFO: renamed from: u1 */
    public final void m7906u1() {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }
}
