package p000;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: renamed from: sl */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0730sl extends AbstractC0221ft implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* JADX INFO: renamed from: o */
    public static final RunnableC0730sl f5778o;

    /* JADX INFO: renamed from: p */
    public static final long f5779p;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        Long l;
        RunnableC0730sl runnableC0730sl = new RunnableC0730sl();
        f5778o = runnableC0730sl;
        runnableC0730sl.m203m(false);
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l = 1000L;
        }
        f5779p = TimeUnit.MILLISECONDS.toNanos(l.longValue());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0221ft
    /* JADX INFO: renamed from: D */
    public final Thread mo1179D() {
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
                thread.setContextClassLoader(f5778o.getClass().getClassLoader());
                thread.setDaemon(true);
                thread.start();
            }
        }
        return thread;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0221ft
    /* JADX INFO: renamed from: F */
    public final void mo1181F(long j, AbstractRunnableC0140dt abstractRunnableC0140dt) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: L */
    public final synchronized void m4085L() {
        int i = debugStatus;
        if (i == 2 || i == 3) {
            debugStatus = 3;
            m1183H();
            notifyAll();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0221ft, p000.InterfaceC0657qm
    /* JADX INFO: renamed from: c */
    public final InterfaceC0622po mo1073c(long j, k81 k81Var, InterfaceC0618pk interfaceC0618pk) {
        long j2 = j > 0 ? j >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j : 0L;
        if (j2 >= 4611686018427387903L) {
            return xj0.f7353d;
        }
        long jNanoTime = System.nanoTime();
        C0104ct c0104ct = new C0104ct(j2 + jNanoTime, k81Var);
        m1184I(jNanoTime, c0104ct);
        return c0104ct;
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[SPUT, INVOKE, INVOKE]}, finally: {[SPUT, INVOKE, INVOKE, INVOKE, IF] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        boolean zM1180E;
        y71.f7566a.set(this);
        try {
            synchronized (this) {
                int i = debugStatus;
                if (i == 2 || i == 3) {
                    if (zM1180E) {
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
                    long jMo204q = mo204q();
                    if (jMo204q == Long.MAX_VALUE) {
                        long jNanoTime = System.nanoTime();
                        if (j == Long.MAX_VALUE) {
                            j = f5779p + jNanoTime;
                        }
                        long j2 = j - jNanoTime;
                        if (j2 <= 0) {
                            _thread = null;
                            m4085L();
                            if (m1180E()) {
                                return;
                            }
                            mo1179D();
                            return;
                        }
                        if (jMo204q > j2) {
                            jMo204q = j2;
                        }
                    } else {
                        j = Long.MAX_VALUE;
                    }
                    if (jMo204q > 0) {
                        int i2 = debugStatus;
                        if (i2 == 2 || i2 == 3) {
                            _thread = null;
                            m4085L();
                            if (m1180E()) {
                                return;
                            }
                            mo1179D();
                            return;
                        }
                        LockSupport.parkNanos(this, jMo204q);
                    }
                }
            }
        } finally {
            _thread = null;
            m4085L();
            if (!m1180E()) {
                mo1179D();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0221ft, p000.AbstractC0030at
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0692rk
    public final String toString() {
        return "DefaultExecutor";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0221ft
    /* JADX INFO: renamed from: z */
    public final void mo1189z(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.mo1189z(runnable);
    }
}
