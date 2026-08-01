package p376zd;

import com.alibaba.fastjson2.JSONWriter;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import okhttp3.internal.p218ws.RealWebSocket;
import p010a9.InterfaceC0173a;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1057r;
import p172l8.C4700i0;
import p215oc.C5725t;

/* JADX INFO: renamed from: zd.c */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public class C9981c extends C10026x0 {
    private static final long IDLE_TIMEOUT_MILLIS;
    private static final long IDLE_TIMEOUT_NANOS;
    private static final int STATE_CANCELED = 3;
    private static final int STATE_IDLE = 0;
    private static final int STATE_IN_QUEUE = 1;
    private static final int STATE_TIMED_OUT = 2;
    private static final int TIMEOUT_WRITE_SIZE = 65536;
    private static final Condition condition;
    private static C9981c idleSentinel;
    private static final ReentrantLock lock;
    public int index = -1;
    private int state;
    private long timeoutAt;
    private static final a Companion = new a(null);
    private static final C10004m0 queue = new C10004m0();

    /* JADX INFO: renamed from: zd.c$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b extends Thread {
        public b() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            ReentrantLock reentrantLockM38634e;
            C9981c c9981cM38631b;
            while (true) {
                try {
                    reentrantLockM38634e = C9981c.Companion.m38634e();
                    reentrantLockM38634e.lock();
                    try {
                        c9981cM38631b = C9981c.Companion.m38631b();
                    } finally {
                        reentrantLockM38634e.unlock();
                    }
                } catch (InterruptedException unused) {
                }
                if (c9981cM38631b == C9981c.Companion.m38633d()) {
                    C9981c.Companion.m38637h(null);
                    return;
                }
                C4700i0 c4700i0 = C4700i0.f13910a;
                reentrantLockM38634e.unlock();
                if (c9981cM38631b != null) {
                    c9981cM38631b.timedOut();
                }
            }
        }
    }

    /* JADX INFO: renamed from: zd.c$c */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class c implements InterfaceC10020u0 {

        /* JADX INFO: renamed from: r */
        public final /* synthetic */ InterfaceC10020u0 f33557r;

        public c(InterfaceC10020u0 interfaceC10020u0) {
            this.f33557r = interfaceC10020u0;
        }

        @Override // p376zd.InterfaceC10020u0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public C9981c timeout() {
            return C9981c.this;
        }

        @Override // p376zd.InterfaceC10020u0, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            C9981c c9981c = C9981c.this;
            InterfaceC10020u0 interfaceC10020u0 = this.f33557r;
            c9981c.enter();
            try {
                interfaceC10020u0.close();
                C4700i0 c4700i0 = C4700i0.f13910a;
                if (c9981c.exit()) {
                    throw c9981c.access$newTimeoutException(null);
                }
            } catch (IOException e10) {
                if (!c9981c.exit()) {
                    throw e10;
                }
                throw c9981c.access$newTimeoutException(e10);
            } finally {
                c9981c.exit();
            }
        }

        @Override // p376zd.InterfaceC10020u0, java.io.Flushable
        public void flush() throws IOException {
            C9981c c9981c = C9981c.this;
            InterfaceC10020u0 interfaceC10020u0 = this.f33557r;
            c9981c.enter();
            try {
                interfaceC10020u0.flush();
                C4700i0 c4700i0 = C4700i0.f13910a;
                if (c9981c.exit()) {
                    throw c9981c.access$newTimeoutException(null);
                }
            } catch (IOException e10) {
                if (!c9981c.exit()) {
                    throw e10;
                }
                throw c9981c.access$newTimeoutException(e10);
            } finally {
                c9981c.exit();
            }
        }

        public String toString() {
            return "AsyncTimeout.sink(" + this.f33557r + ')';
        }

        @Override // p376zd.InterfaceC10020u0
        public void write(C9995i c9995i, long j10) throws IOException {
            c9995i.getClass();
            AbstractC9978b.m38615b(c9995i.size(), 0L, j10);
            while (true) {
                long j11 = 0;
                if (j10 <= 0) {
                    return;
                }
                C10012q0 c10012q0 = c9995i.f33561q;
                c10012q0.getClass();
                while (true) {
                    if (j11 >= JSONWriter.MASK_PRETTY_FORMAT) {
                        break;
                    }
                    j11 += (long) (c10012q0.f33618c - c10012q0.f33617b);
                    if (j11 >= j10) {
                        j11 = j10;
                        break;
                    } else {
                        c10012q0 = c10012q0.f33621f;
                        c10012q0.getClass();
                    }
                }
                C9981c c9981c = C9981c.this;
                InterfaceC10020u0 interfaceC10020u0 = this.f33557r;
                c9981c.enter();
                try {
                    try {
                        interfaceC10020u0.write(c9995i, j11);
                        C4700i0 c4700i0 = C4700i0.f13910a;
                        if (c9981c.exit()) {
                            throw c9981c.access$newTimeoutException(null);
                        }
                        j10 -= j11;
                    } catch (IOException e10) {
                        if (!c9981c.exit()) {
                            throw e10;
                        }
                        throw c9981c.access$newTimeoutException(e10);
                    }
                } catch (Throwable th) {
                    c9981c.exit();
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: zd.c$d */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class d implements InterfaceC10024w0 {

        /* JADX INFO: renamed from: r */
        public final /* synthetic */ InterfaceC10024w0 f33559r;

        public d(InterfaceC10024w0 interfaceC10024w0) {
            this.f33559r = interfaceC10024w0;
        }

        @Override // p376zd.InterfaceC10024w0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public C9981c timeout() {
            return C9981c.this;
        }

        @Override // p376zd.InterfaceC10024w0, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            C9981c c9981c = C9981c.this;
            InterfaceC10024w0 interfaceC10024w0 = this.f33559r;
            c9981c.enter();
            try {
                interfaceC10024w0.close();
                C4700i0 c4700i0 = C4700i0.f13910a;
                if (c9981c.exit()) {
                    throw c9981c.access$newTimeoutException(null);
                }
            } catch (IOException e10) {
                if (!c9981c.exit()) {
                    throw e10;
                }
                throw c9981c.access$newTimeoutException(e10);
            } finally {
                c9981c.exit();
            }
        }

        @Override // p376zd.InterfaceC10024w0
        public long read(C9995i c9995i, long j10) throws IOException {
            c9995i.getClass();
            C9981c c9981c = C9981c.this;
            InterfaceC10024w0 interfaceC10024w0 = this.f33559r;
            c9981c.enter();
            try {
                long j11 = interfaceC10024w0.read(c9995i, j10);
                if (c9981c.exit()) {
                    throw c9981c.access$newTimeoutException(null);
                }
                return j11;
            } catch (IOException e10) {
                if (c9981c.exit()) {
                    throw c9981c.access$newTimeoutException(e10);
                }
                throw e10;
            } finally {
                c9981c.exit();
            }
        }

        public String toString() {
            return "AsyncTimeout.source(" + this.f33559r + ')';
        }
    }

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        lock = reentrantLock;
        Condition conditionNewCondition = reentrantLock.newCondition();
        conditionNewCondition.getClass();
        condition = conditionNewCondition;
        IDLE_TIMEOUT_MILLIS = RealWebSocket.CANCEL_AFTER_CLOSE_MILLIS;
        IDLE_TIMEOUT_NANOS = TimeUnit.MILLISECONDS.toNanos(RealWebSocket.CANCEL_AFTER_CLOSE_MILLIS);
    }

    public static /* synthetic */ void setTimeoutAt$okio$default(C9981c c9981c, long j10, int i10, Object obj) {
        if (obj != null) {
            C5725t.m23179a("Super calls with default arguments not supported in this target, function: setTimeoutAt");
            return;
        }
        if ((i10 & 1) != 0) {
            j10 = System.nanoTime();
        }
        c9981c.setTimeoutAt$okio(j10);
    }

    public final IOException access$newTimeoutException(IOException iOException) {
        return newTimeoutException(iOException);
    }

    @Override // p376zd.C10026x0
    public void cancel() {
        super.cancel();
        ReentrantLock reentrantLock = lock;
        reentrantLock.lock();
        try {
            if (this.state == 1) {
                queue.m38802e(this);
                this.state = 3;
            }
            C4700i0 c4700i0 = C4700i0.f13910a;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void enter() {
        long jTimeoutNanos = timeoutNanos();
        boolean zHasDeadline = hasDeadline();
        if (jTimeoutNanos != 0 || zHasDeadline) {
            ReentrantLock reentrantLock = lock;
            reentrantLock.lock();
            try {
                if (this.state != 0) {
                    throw new IllegalStateException("Unbalanced enter/exit");
                }
                this.state = 1;
                Companion.m38636g(this);
                C4700i0 c4700i0 = C4700i0.f13910a;
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public final boolean exit() {
        ReentrantLock reentrantLock = lock;
        reentrantLock.lock();
        try {
            int i10 = this.state;
            this.state = 0;
            if (i10 != 1) {
                return i10 == 2;
            }
            queue.m38802e(this);
            return false;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final long getTimeoutAt$okio() {
        return this.timeoutAt;
    }

    public IOException newTimeoutException(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public final long remainingNanos$okio(long j10) {
        return this.timeoutAt - j10;
    }

    public final void setTimeoutAt$okio(long j10) {
        long jTimeoutNanos = timeoutNanos();
        boolean zHasDeadline = hasDeadline();
        if (timeoutNanos() != 0 && hasDeadline()) {
            this.timeoutAt = j10 + Math.min(jTimeoutNanos, deadlineNanoTime() - j10);
        } else if (jTimeoutNanos != 0) {
            this.timeoutAt = j10 + jTimeoutNanos;
        } else {
            if (!zHasDeadline) {
                throw new AssertionError();
            }
            this.timeoutAt = deadlineNanoTime();
        }
    }

    public final InterfaceC10020u0 sink(InterfaceC10020u0 interfaceC10020u0) {
        interfaceC10020u0.getClass();
        return new c(interfaceC10020u0);
    }

    public final InterfaceC10024w0 source(InterfaceC10024w0 interfaceC10024w0) {
        interfaceC10024w0.getClass();
        return new d(interfaceC10024w0);
    }

    public final <T> T withTimeout(InterfaceC0173a interfaceC0173a) throws IOException {
        interfaceC0173a.getClass();
        enter();
        try {
            try {
                T t10 = (T) interfaceC0173a.invoke();
                AbstractC1057r.m3834b(1);
                if (exit()) {
                    throw access$newTimeoutException(null);
                }
                AbstractC1057r.m3833a(1);
                return t10;
            } catch (IOException e10) {
                if (exit()) {
                    throw access$newTimeoutException(e10);
                }
                throw e10;
            }
        } catch (Throwable th) {
            AbstractC1057r.m3834b(1);
            exit();
            AbstractC1057r.m3833a(1);
            throw th;
        }
    }

    /* JADX INFO: renamed from: zd.c$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: b */
        public final C9981c m38631b() throws InterruptedException {
            C9981c c9981cM38799b = m38635f().m38799b();
            if (c9981cM38799b == null) {
                long jNanoTime = System.nanoTime();
                m38632c().await(C9981c.IDLE_TIMEOUT_MILLIS, TimeUnit.MILLISECONDS);
                if (m38635f().m38799b() != null || System.nanoTime() - jNanoTime < C9981c.IDLE_TIMEOUT_NANOS) {
                    return null;
                }
                return m38633d();
            }
            long jRemainingNanos$okio = c9981cM38799b.remainingNanos$okio(System.nanoTime());
            if (jRemainingNanos$okio > 0) {
                m38632c().await(jRemainingNanos$okio, TimeUnit.NANOSECONDS);
                return null;
            }
            m38635f().m38802e(c9981cM38799b);
            c9981cM38799b.state = 2;
            return c9981cM38799b;
        }

        /* JADX INFO: renamed from: c */
        public final Condition m38632c() {
            return C9981c.condition;
        }

        /* JADX INFO: renamed from: d */
        public final C9981c m38633d() {
            return C9981c.idleSentinel;
        }

        /* JADX INFO: renamed from: e */
        public final ReentrantLock m38634e() {
            return C9981c.lock;
        }

        /* JADX INFO: renamed from: f */
        public final C10004m0 m38635f() {
            return C9981c.queue;
        }

        /* JADX INFO: renamed from: g */
        public final void m38636g(C9981c c9981c) {
            if (m38633d() == null) {
                m38637h(new C9981c());
                new b().start();
            }
            C9981c.setTimeoutAt$okio$default(c9981c, 0L, 1, null);
            m38635f().m38798a(c9981c);
            if (c9981c.index == 1) {
                m38632c().signal();
            }
        }

        /* JADX INFO: renamed from: h */
        public final void m38637h(C9981c c9981c) {
            C9981c.idleSentinel = c9981c;
        }

        public a() {
        }
    }

    public void timedOut() {
    }
}
