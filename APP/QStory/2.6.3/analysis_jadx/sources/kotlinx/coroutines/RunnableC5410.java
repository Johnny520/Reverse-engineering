package kotlinx.coroutines;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import kotlin.coroutines.InterfaceC4360;

/* JADX INFO: renamed from: kotlinx.coroutines.飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC5410 extends AbstractC5387 implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public static final long f15049;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public static final RunnableC5410 f15050;

    static {
        Long l;
        RunnableC5410 runnableC5410 = new RunnableC5410();
        f15050 = runnableC5410;
        runnableC5410.m10460(false);
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l = 1000L;
        }
        f15049 = TimeUnit.MILLISECONDS.toNanos(l.longValue());
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zM10454;
        AbstractC5420.f15059.set(this);
        try {
            synchronized (this) {
                int i = debugStatus;
                if (i == 2 || i == 3) {
                    if (zM10454) {
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
                    long jMo10440 = mo10440();
                    if (jMo10440 == Long.MAX_VALUE) {
                        long jNanoTime = System.nanoTime();
                        if (j == Long.MAX_VALUE) {
                            j = f15049 + jNanoTime;
                        }
                        long j2 = j - jNanoTime;
                        if (j2 <= 0) {
                            _thread = null;
                            m10511();
                            if (m10454()) {
                                return;
                            }
                            mo10453();
                            return;
                        }
                        if (jMo10440 > j2) {
                            jMo10440 = j2;
                        }
                    } else {
                        j = Long.MAX_VALUE;
                    }
                    if (jMo10440 > 0) {
                        int i2 = debugStatus;
                        if (i2 == 2 || i2 == 3) {
                            _thread = null;
                            m10511();
                            if (m10454()) {
                                return;
                            }
                            mo10453();
                            return;
                        }
                        LockSupport.parkNanos(this, jMo10440);
                    }
                }
            }
        } finally {
            _thread = null;
            m10511();
            if (!m10454()) {
                mo10453();
            }
        }
    }

    @Override // kotlinx.coroutines.AbstractC5432
    public final String toString() {
        return "DefaultExecutor";
    }

    @Override // kotlinx.coroutines.InterfaceC5406
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final InterfaceC5398 mo10340(long j, Runnable runnable, InterfaceC4360 interfaceC4360) {
        long jM10498 = AbstractC5399.m10498(j);
        if (jM10498 >= 4611686018427387903L) {
            return C5455.f15106;
        }
        long jNanoTime = System.nanoTime();
        C5389 c5389 = new C5389(jM10498 + jNanoTime, runnable);
        m10451(jNanoTime, c5389);
        return c5389;
    }

    @Override // kotlinx.coroutines.AbstractC5387
    /* JADX INFO: renamed from: 飘花落叶言子苏世哲楪兰 */
    public final void mo10444(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.mo10444(runnable);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰世楪哲, reason: contains not printable characters */
    public final synchronized void m10511() {
        int i = debugStatus;
        if (i == 2 || i == 3) {
            debugStatus = 3;
            m10452();
            notifyAll();
        }
    }

    @Override // kotlinx.coroutines.AbstractC5387
    /* JADX INFO: renamed from: 飘花落叶言子苏哲世楪兰 */
    public final void mo10450(long j, AbstractRunnableC5392 abstractRunnableC5392) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // kotlinx.coroutines.AbstractC5387
    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪世兰 */
    public final Thread mo10453() {
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
                thread.setContextClassLoader(f15050.getClass().getClassLoader());
                thread.setDaemon(true);
                thread.start();
            }
        }
        return thread;
    }

    @Override // kotlinx.coroutines.AbstractC5387, kotlinx.coroutines.AbstractC5394
    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰哲世 */
    public final void mo10455() {
        debugStatus = 4;
        super.mo10455();
    }
}
