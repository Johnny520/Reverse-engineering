package kotlinx.coroutines;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import kotlin.coroutines.InterfaceC4359;

/* JADX INFO: renamed from: kotlinx.coroutines.飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC5409 extends AbstractC5386 implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public static final long f15049;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public static final RunnableC5409 f15050;

    static {
        Long l;
        RunnableC5409 runnableC5409 = new RunnableC5409();
        f15050 = runnableC5409;
        runnableC5409.m10456(false);
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l = 1000L;
        }
        f15049 = TimeUnit.MILLISECONDS.toNanos(l.longValue());
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zM10450;
        AbstractC5419.f15059.set(this);
        try {
            synchronized (this) {
                int i = debugStatus;
                if (i == 2 || i == 3) {
                    if (zM10450) {
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
                    long jMo10436 = mo10436();
                    if (jMo10436 == Long.MAX_VALUE) {
                        long jNanoTime = System.nanoTime();
                        if (j == Long.MAX_VALUE) {
                            j = f15049 + jNanoTime;
                        }
                        long j2 = j - jNanoTime;
                        if (j2 <= 0) {
                            _thread = null;
                            m10507();
                            if (m10450()) {
                                return;
                            }
                            mo10449();
                            return;
                        }
                        if (jMo10436 > j2) {
                            jMo10436 = j2;
                        }
                    } else {
                        j = Long.MAX_VALUE;
                    }
                    if (jMo10436 > 0) {
                        int i2 = debugStatus;
                        if (i2 == 2 || i2 == 3) {
                            _thread = null;
                            m10507();
                            if (m10450()) {
                                return;
                            }
                            mo10449();
                            return;
                        }
                        LockSupport.parkNanos(this, jMo10436);
                    }
                }
            }
        } finally {
            _thread = null;
            m10507();
            if (!m10450()) {
                mo10449();
            }
        }
    }

    @Override // kotlinx.coroutines.AbstractC5431
    public final String toString() {
        return "DefaultExecutor";
    }

    @Override // kotlinx.coroutines.InterfaceC5405
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final InterfaceC5397 mo10336(long j, Runnable runnable, InterfaceC4359 interfaceC4359) {
        long jM10494 = AbstractC5398.m10494(j);
        if (jM10494 >= 4611686018427387903L) {
            return C5454.f15106;
        }
        long jNanoTime = System.nanoTime();
        C5388 c5388 = new C5388(jM10494 + jNanoTime, runnable);
        m10447(jNanoTime, c5388);
        return c5388;
    }

    @Override // kotlinx.coroutines.AbstractC5386
    /* JADX INFO: renamed from: 飘花落叶言子苏世哲楪兰 */
    public final void mo10440(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.mo10440(runnable);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰世楪哲, reason: contains not printable characters */
    public final synchronized void m10507() {
        int i = debugStatus;
        if (i == 2 || i == 3) {
            debugStatus = 3;
            m10448();
            notifyAll();
        }
    }

    @Override // kotlinx.coroutines.AbstractC5386
    /* JADX INFO: renamed from: 飘花落叶言子苏哲世楪兰 */
    public final void mo10446(long j, AbstractRunnableC5391 abstractRunnableC5391) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // kotlinx.coroutines.AbstractC5386
    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪世兰 */
    public final Thread mo10449() {
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

    @Override // kotlinx.coroutines.AbstractC5386, kotlinx.coroutines.AbstractC5393
    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰哲世 */
    public final void mo10451() {
        debugStatus = 4;
        super.mo10451();
    }
}
