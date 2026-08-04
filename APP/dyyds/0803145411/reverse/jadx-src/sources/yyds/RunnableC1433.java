package yyds;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: yyds.ᛶᲁᛶᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1433 extends AbstractC0467 implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public static final RunnableC1433 f6788;

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public static final long f6789;

    static {
        Long l;
        RunnableC1433 runnableC1433 = new RunnableC1433();
        f6788 = runnableC1433;
        runnableC1433.m1250(false);
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l = 1000L;
        }
        f6789 = TimeUnit.MILLISECONDS.toNanos(l.longValue());
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zM1244;
        AbstractC2567.f12653.set(this);
        try {
            synchronized (this) {
                int i = debugStatus;
                if (i == 2 || i == 3) {
                    if (zM1244) {
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
                    long jM1248 = m1248();
                    if (jM1248 == Long.MAX_VALUE) {
                        long jNanoTime = System.nanoTime();
                        if (j == Long.MAX_VALUE) {
                            j = f6789 + jNanoTime;
                        }
                        long j2 = j - jNanoTime;
                        if (j2 <= 0) {
                            _thread = null;
                            m2929();
                            if (m1244()) {
                                return;
                            }
                            mo1245();
                            return;
                        }
                        if (jM1248 > j2) {
                            jM1248 = j2;
                        }
                    } else {
                        j = Long.MAX_VALUE;
                    }
                    if (jM1248 > 0) {
                        int i2 = debugStatus;
                        if (i2 == 2 || i2 == 3) {
                            _thread = null;
                            m2929();
                            if (m1244()) {
                                return;
                            }
                            mo1245();
                            return;
                        }
                        LockSupport.parkNanos(this, jM1248);
                    }
                }
            }
        } finally {
            _thread = null;
            m2929();
            if (!m1244()) {
                mo1245();
            }
        }
    }

    @Override // yyds.AbstractC0467
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    @Override // yyds.AbstractC0974
    public final String toString() {
        return "DefaultExecutor";
    }

    @Override // yyds.AbstractC0467
    /* JADX INFO: renamed from: ᛲᲀᛵᛷ */
    public final Thread mo1245() {
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
                thread.setContextClassLoader(RunnableC1433.class.getClassLoader());
                thread.setDaemon(true);
                thread.start();
            }
        }
        return thread;
    }

    /* JADX INFO: renamed from: ᛴᛸᛴᛸ, reason: contains not printable characters */
    public final synchronized void m2929() {
        int i = debugStatus;
        if (i == 2 || i == 3) {
            debugStatus = 3;
            Unsafe unsafe = AbstractC2112.f10448;
            unsafe.putObjectVolatile(this, AbstractC0467.f2320, (Object) null);
            unsafe.putObjectVolatile(this, AbstractC0467.f2321, (Object) null);
            notifyAll();
        }
    }

    @Override // yyds.AbstractC0467
    /* JADX INFO: renamed from: ᛸᛴᛵᛶ */
    public final void mo1252(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.mo1252(runnable);
    }

    @Override // yyds.AbstractC0467, yyds.InterfaceC2800
    /* JADX INFO: renamed from: ᛸᛸᛷᛱ */
    public final InterfaceC0970 mo1253(long j, RunnableC1993 runnableC1993, InterfaceC2213 interfaceC2213) {
        long j2 = j > 0 ? j >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j : 0L;
        if (j2 >= 4611686018427387903L) {
            return C2329.f11479;
        }
        long jNanoTime = System.nanoTime();
        C1288 c1288 = new C1288(j2 + jNanoTime, runnableC1993);
        m1246(jNanoTime, c1288);
        return c1288;
    }

    @Override // yyds.AbstractC0467
    /* JADX INFO: renamed from: ᲁᛵᲁᲁ */
    public final void mo1254(long j, AbstractRunnableC1665 abstractRunnableC1665) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }
}
