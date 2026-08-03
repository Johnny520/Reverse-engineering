package Yue;

import Yue.AbstractC4715;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: renamed from: Yue.ۥ۟ۨۥۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC4337 extends AbstractC4715 implements Runnable {

    @InterfaceC6489
    private static volatile Thread _thread = null;
    private static volatile int debugStatus = 0;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    @InterfaceC6399
    public static final RunnableC4337 f8898;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    @InterfaceC6399
    public static final String f8899 = "kotlinx.coroutines.DefaultExecutor";

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static final long f8900 = 1000;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static final long f8901;

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public static final int f8902 = 0;

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public static final int f8903 = 1;

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static final int f8904 = 2;

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public static final int f8905 = 3;

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public static final int f8906 = 4;

    static {
        Long l;
        RunnableC4337 runnableC4337 = new RunnableC4337();
        f8898 = runnableC4337;
        AbstractC4714.m14077(runnableC4337, false, 1, null);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l = 1000L;
        }
        f8901 = timeUnit.toNanos(l.longValue());
    }

    /* JADX INFO: renamed from: ۥ۟۠۟ۧ, reason: contains not printable characters */
    public static /* synthetic */ void m12586() {
    }

    @Override // java.lang.Runnable
    public void run() {
        C8107 c8107;
        C7779.f3076.m24723(this);
        AbstractC3018 abstractC3018M84 = C3019.m84();
        if (abstractC3018M84 != null) {
            abstractC3018M84.m5893();
        }
        try {
            if (!m12596()) {
                _thread = null;
                m12590();
                AbstractC3018 abstractC3018M842 = C3019.m84();
                if (abstractC3018M842 != null) {
                    abstractC3018M842.m5897();
                }
                if (mo14084()) {
                    return;
                }
                mo9507();
                return;
            }
            long j = Long.MAX_VALUE;
            while (true) {
                Thread.interrupted();
                long jMo14087 = mo14087();
                if (jMo14087 == Long.MAX_VALUE) {
                    AbstractC3018 abstractC3018M843 = C3019.m84();
                    long jM82 = abstractC3018M843 != null ? abstractC3018M843.m82() : System.nanoTime();
                    if (j == Long.MAX_VALUE) {
                        j = f8901 + jM82;
                    }
                    long j2 = j - jM82;
                    if (j2 <= 0) {
                        _thread = null;
                        m12590();
                        AbstractC3018 abstractC3018M844 = C3019.m84();
                        if (abstractC3018M844 != null) {
                            abstractC3018M844.m5897();
                        }
                        if (mo14084()) {
                            return;
                        }
                        mo9507();
                        return;
                    }
                    jMo14087 = C7007.m21669(jMo14087, j2);
                } else {
                    j = Long.MAX_VALUE;
                }
                if (jMo14087 > 0) {
                    if (m12594()) {
                        _thread = null;
                        m12590();
                        AbstractC3018 abstractC3018M845 = C3019.m84();
                        if (abstractC3018M845 != null) {
                            abstractC3018M845.m5897();
                        }
                        if (mo14084()) {
                            return;
                        }
                        mo9507();
                        return;
                    }
                    AbstractC3018 abstractC3018M846 = C3019.m84();
                    if (abstractC3018M846 != null) {
                        abstractC3018M846.m5892(this, jMo14087);
                        c8107 = C8107.f3222;
                    } else {
                        c8107 = null;
                    }
                    if (c8107 == null) {
                        LockSupport.parkNanos(this, jMo14087);
                    }
                }
            }
        } catch (Throwable th) {
            _thread = null;
            m12590();
            AbstractC3018 abstractC3018M847 = C3019.m84();
            if (abstractC3018M847 != null) {
                abstractC3018M847.m5897();
            }
            if (!mo14084()) {
                mo9507();
            }
            throw th;
        }
    }

    @Override // Yue.AbstractC4715, Yue.AbstractC4714
    public void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    @Override // Yue.AbstractC4715, Yue.InterfaceC4364
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟۟, reason: contains not printable characters */
    public InterfaceC4433 mo12587(long j, @InterfaceC6399 Runnable runnable, @InterfaceC6399 InterfaceC4225 interfaceC4225) {
        return m14099(j, runnable);
    }

    @Override // Yue.AbstractC4718
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۨۡ */
    public Thread mo9507() {
        Thread thread = _thread;
        return thread == null ? m12591() : thread;
    }

    @Override // Yue.AbstractC4718
    /* JADX INFO: renamed from: ۥ۟۟ۨۢ, reason: contains not printable characters */
    public void mo12588(long j, @InterfaceC6399 AbstractC4715.AbstractRunnableC4716 abstractRunnableC4716) {
        m12597();
    }

    @Override // Yue.AbstractC4715
    /* JADX INFO: renamed from: ۥ۟۟ۨۧ, reason: contains not printable characters */
    public void mo12589(@InterfaceC6399 Runnable runnable) {
        if (m12593()) {
            m12597();
        }
        super.mo12589(runnable);
    }

    /* JADX INFO: renamed from: ۥ۟۠۟ۤ, reason: contains not printable characters */
    public final synchronized void m12590() {
        if (m12594()) {
            debugStatus = 3;
            m14096();
            notifyAll();
        }
    }

    /* JADX INFO: renamed from: ۥ۟۠۟ۥ, reason: contains not printable characters */
    public final synchronized Thread m12591() {
        Thread thread;
        thread = _thread;
        if (thread == null) {
            thread = new Thread(this, f8899);
            _thread = thread;
            thread.setDaemon(true);
            thread.start();
        }
        return thread;
    }

    /* JADX INFO: renamed from: ۥ۟۠۟ۦ, reason: contains not printable characters */
    public final synchronized void m12592() {
        debugStatus = 0;
        m12591();
        while (debugStatus == 0) {
            wait();
        }
    }

    /* JADX INFO: renamed from: ۥ۟۠۟ۨ, reason: contains not printable characters */
    public final boolean m12593() {
        return debugStatus == 4;
    }

    /* JADX INFO: renamed from: ۥ۟۠۠, reason: contains not printable characters */
    public final boolean m12594() {
        int i = debugStatus;
        return i == 2 || i == 3;
    }

    /* JADX INFO: renamed from: ۥ۟۠۠۟, reason: contains not printable characters */
    public final boolean m12595() {
        return _thread != null;
    }

    /* JADX INFO: renamed from: ۥ۟۠۠۠, reason: contains not printable characters */
    public final synchronized boolean m12596() {
        if (m12594()) {
            return false;
        }
        debugStatus = 1;
        notifyAll();
        return true;
    }

    /* JADX INFO: renamed from: ۥ۟۠۠ۡ, reason: contains not printable characters */
    public final void m12597() {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    /* JADX INFO: renamed from: ۥ۟۠۠ۢ, reason: contains not printable characters */
    public final synchronized void m12598(long j) {
        C8107 c8107;
        try {
            long jCurrentTimeMillis = System.currentTimeMillis() + j;
            if (!m12594()) {
                debugStatus = 2;
            }
            while (debugStatus != 3 && _thread != null) {
                Thread thread = _thread;
                if (thread != null) {
                    AbstractC3018 abstractC3018M84 = C3019.m84();
                    if (abstractC3018M84 != null) {
                        abstractC3018M84.m5896(thread);
                        c8107 = C8107.f3222;
                    } else {
                        c8107 = null;
                    }
                    if (c8107 == null) {
                        LockSupport.unpark(thread);
                    }
                }
                if (jCurrentTimeMillis - System.currentTimeMillis() <= 0) {
                    break;
                } else {
                    wait(j);
                }
            }
            debugStatus = 0;
        } catch (Throwable th) {
            throw th;
        }
    }
}
