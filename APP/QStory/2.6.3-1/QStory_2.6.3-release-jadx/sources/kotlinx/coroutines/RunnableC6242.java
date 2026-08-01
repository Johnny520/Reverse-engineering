package kotlinx.coroutines;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import kotlin.coroutines.InterfaceC5192;

/* JADX INFO: renamed from: kotlinx.coroutines.飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC6242 extends AbstractC6219 implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public static final long f15394;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public static final RunnableC6242 f15395;

    static {
        Long l;
        RunnableC6242 runnableC6242 = new RunnableC6242();
        f15395 = runnableC6242;
        runnableC6242.m11019(false);
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l = 1000L;
        }
        f15394 = TimeUnit.MILLISECONDS.toNanos(l.longValue());
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zM11013;
        AbstractC6252.f15404.set(this);
        try {
            synchronized (this) {
                int i = debugStatus;
                if (i == 2 || i == 3) {
                    if (zM11013) {
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
                    long jMo10999 = mo10999();
                    if (jMo10999 == Long.MAX_VALUE) {
                        long jNanoTime = System.nanoTime();
                        if (j == Long.MAX_VALUE) {
                            j = f15394 + jNanoTime;
                        }
                        long j2 = j - jNanoTime;
                        if (j2 <= 0) {
                            _thread = null;
                            m11070();
                            if (m11013()) {
                                return;
                            }
                            mo11012();
                            return;
                        }
                        if (jMo10999 > j2) {
                            jMo10999 = j2;
                        }
                    } else {
                        j = Long.MAX_VALUE;
                    }
                    if (jMo10999 > 0) {
                        int i2 = debugStatus;
                        if (i2 == 2 || i2 == 3) {
                            _thread = null;
                            m11070();
                            if (m11013()) {
                                return;
                            }
                            mo11012();
                            return;
                        }
                        LockSupport.parkNanos(this, jMo10999);
                    }
                }
            }
        } finally {
            _thread = null;
            m11070();
            if (!m11013()) {
                mo11012();
            }
        }
    }

    @Override // kotlinx.coroutines.AbstractC6264
    public final String toString() {
        return "DefaultExecutor";
    }

    @Override // kotlinx.coroutines.InterfaceC6238
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final InterfaceC6230 mo10899(long j, Runnable runnable, InterfaceC5192 interfaceC5192) {
        long jM11057 = AbstractC6231.m11057(j);
        if (jM11057 >= 4611686018427387903L) {
            return C6287.f15451;
        }
        long jNanoTime = System.nanoTime();
        C6221 c6221 = new C6221(jM11057 + jNanoTime, runnable);
        m11010(jNanoTime, c6221);
        return c6221;
    }

    @Override // kotlinx.coroutines.AbstractC6219
    /* JADX INFO: renamed from: 飘花落叶言子苏世哲楪兰 */
    public final void mo11003(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.mo11003(runnable);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰世楪哲, reason: contains not printable characters */
    public final synchronized void m11070() {
        int i = debugStatus;
        if (i == 2 || i == 3) {
            debugStatus = 3;
            m11011();
            notifyAll();
        }
    }

    @Override // kotlinx.coroutines.AbstractC6219
    /* JADX INFO: renamed from: 飘花落叶言子苏哲世楪兰 */
    public final void mo11009(long j, AbstractRunnableC6224 abstractRunnableC6224) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // kotlinx.coroutines.AbstractC6219
    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪世兰 */
    public final Thread mo11012() {
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
                thread.setContextClassLoader(f15395.getClass().getClassLoader());
                thread.setDaemon(true);
                thread.start();
            }
        }
        return thread;
    }

    @Override // kotlinx.coroutines.AbstractC6219, kotlinx.coroutines.AbstractC6226
    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰哲世 */
    public final void mo11014() {
        debugStatus = 4;
        super.mo11014();
    }
}
