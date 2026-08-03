package p249qg;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import wf.InterfaceC5561g;

/* JADX INFO: renamed from: qg.w */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC3605w extends AbstractC3580l0 implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* JADX INFO: renamed from: p */
    public static final RunnableC3605w f11630p;

    /* JADX INFO: renamed from: q */
    public static final long f11631q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        Long l10;
        RunnableC3605w runnableC3605w = new RunnableC3605w();
        f11630p = runnableC3605w;
        runnableC3605w.m7523B(false);
        try {
            l10 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l10 = 1000L;
        }
        f11631q = TimeUnit.MILLISECONDS.toNanos(l10.longValue());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p249qg.AbstractC3580l0
    /* JADX INFO: renamed from: E */
    public final void mo7531E(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.mo7531E(runnable);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p249qg.AbstractC3580l0
    /* JADX INFO: renamed from: H */
    public final Thread mo7494H() {
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
                thread.setContextClassLoader(f11630p.getClass().getClassLoader());
                thread.setDaemon(true);
                thread.start();
            }
        }
        return thread;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p249qg.AbstractC3580l0
    /* JADX INFO: renamed from: I */
    public final void mo7534I(long j3, AbstractRunnableC3574j0 abstractRunnableC3574j0) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: K */
    public final synchronized void m7572K() {
        int i9 = debugStatus;
        if (i9 == 2 || i9 == 3) {
            debugStatus = 3;
            AbstractC3580l0.f11588m.set(this, null);
            AbstractC3580l0.f11589n.set(this, null);
            notifyAll();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p249qg.AbstractC3580l0, p249qg.InterfaceC3609y
    /* JADX INFO: renamed from: q */
    public final InterfaceC3556d0 mo7536q(long j3, RunnableC3575j1 runnableC3575j1, InterfaceC5561g interfaceC5561g) {
        long j4 = j3 > 0 ? j3 >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j3 : 0L;
        if (j4 >= 4611686018427387903L) {
            return C3554c1.f11556g;
        }
        long jNanoTime = System.nanoTime();
        C3571i0 c3571i0 = new C3571i0(j4 + jNanoTime, runnableC3575j1);
        m7535J(jNanoTime, c3571i0);
        return c3571i0;
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[SPUT, INVOKE, INVOKE]}, finally: {[SPUT, INVOKE, INVOKE, INVOKE, IF] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        boolean zIsEmpty;
        AbstractC3569h1.f11575a.set(this);
        try {
            synchronized (this) {
                int i9 = debugStatus;
                if (i9 == 2 || i9 == 3) {
                    if (zIsEmpty) {
                        return;
                    } else {
                        return;
                    }
                }
                debugStatus = 1;
                notifyAll();
                long j3 = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long jMo7524C = mo7524C();
                    if (jMo7524C == Long.MAX_VALUE) {
                        long jNanoTime = System.nanoTime();
                        if (j3 == Long.MAX_VALUE) {
                            j3 = f11631q + jNanoTime;
                        }
                        long j4 = j3 - jNanoTime;
                        if (j4 <= 0) {
                            _thread = null;
                            m7572K();
                            if (isEmpty()) {
                                return;
                            }
                            mo7494H();
                            return;
                        }
                        if (jMo7524C > j4) {
                            jMo7524C = j4;
                        }
                    } else {
                        j3 = Long.MAX_VALUE;
                    }
                    if (jMo7524C > 0) {
                        int i10 = debugStatus;
                        if (i10 == 2 || i10 == 3) {
                            _thread = null;
                            m7572K();
                            if (isEmpty()) {
                                return;
                            }
                            mo7494H();
                            return;
                        }
                        LockSupport.parkNanos(this, jMo7524C);
                    }
                }
            }
        } finally {
            _thread = null;
            m7572K();
            if (!isEmpty()) {
                mo7494H();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p249qg.AbstractC3580l0, p249qg.AbstractC3565g0
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p249qg.AbstractC3591p
    public final String toString() {
        return "DefaultExecutor";
    }
}
