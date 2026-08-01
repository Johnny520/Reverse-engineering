package p376zd;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import p010a9.InterfaceC0173a;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1057r;

/* JADX INFO: renamed from: zd.x0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public class C10026x0 {
    public static final b Companion = new b(null);
    public static final C10026x0 NONE = new a();
    private volatile Object cancelMark;
    private long deadlineNanoTime;
    private boolean hasDeadline;
    private long timeoutNanos;

    public void awaitSignal(Condition condition) throws InterruptedIOException {
        condition.getClass();
        try {
            boolean zHasDeadline = hasDeadline();
            long jTimeoutNanos = timeoutNanos();
            if (!zHasDeadline && jTimeoutNanos == 0) {
                condition.await();
                return;
            }
            if (zHasDeadline && jTimeoutNanos != 0) {
                jTimeoutNanos = Math.min(jTimeoutNanos, deadlineNanoTime() - System.nanoTime());
            } else if (zHasDeadline) {
                jTimeoutNanos = deadlineNanoTime() - System.nanoTime();
            }
            if (jTimeoutNanos <= 0) {
                throw new InterruptedIOException("timeout");
            }
            Object obj = this.cancelMark;
            if (condition.awaitNanos(jTimeoutNanos) <= 0 && this.cancelMark == obj) {
                throw new InterruptedIOException("timeout");
            }
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        }
    }

    public void cancel() {
        this.cancelMark = new Object();
    }

    public C10026x0 clearDeadline() {
        this.hasDeadline = false;
        return this;
    }

    public C10026x0 clearTimeout() {
        this.timeoutNanos = 0L;
        return this;
    }

    public final C10026x0 deadline(long j10, TimeUnit timeUnit) {
        timeUnit.getClass();
        if (j10 > 0) {
            return deadlineNanoTime(System.nanoTime() + timeUnit.toNanos(j10));
        }
        C9991g.m38662a("duration <= 0: ", j10);
        return null;
    }

    public long deadlineNanoTime() {
        if (this.hasDeadline) {
            return this.deadlineNanoTime;
        }
        C10010p0.m38820a("No deadline");
        return 0L;
    }

    public boolean hasDeadline() {
        return this.hasDeadline;
    }

    public final <T> T intersectWith(C10026x0 c10026x0, InterfaceC0173a interfaceC0173a) {
        c10026x0.getClass();
        interfaceC0173a.getClass();
        long jTimeoutNanos = timeoutNanos();
        long jM38846a = Companion.m38846a(c10026x0.timeoutNanos(), timeoutNanos());
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        timeout(jM38846a, timeUnit);
        if (!hasDeadline()) {
            if (c10026x0.hasDeadline()) {
                deadlineNanoTime(c10026x0.deadlineNanoTime());
            }
            try {
                return (T) interfaceC0173a.invoke();
            } finally {
                AbstractC1057r.m3834b(1);
                timeout(jTimeoutNanos, timeUnit);
                if (c10026x0.hasDeadline()) {
                    clearDeadline();
                }
                AbstractC1057r.m3833a(1);
            }
        }
        long jDeadlineNanoTime = deadlineNanoTime();
        if (c10026x0.hasDeadline()) {
            deadlineNanoTime(Math.min(deadlineNanoTime(), c10026x0.deadlineNanoTime()));
        }
        try {
            return (T) interfaceC0173a.invoke();
        } finally {
            AbstractC1057r.m3834b(1);
            timeout(jTimeoutNanos, timeUnit);
            if (c10026x0.hasDeadline()) {
                deadlineNanoTime(jDeadlineNanoTime);
            }
            AbstractC1057r.m3833a(1);
        }
    }

    public void throwIfReached() throws InterruptedIOException {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        if (this.hasDeadline && this.deadlineNanoTime - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public C10026x0 timeout(long j10, TimeUnit timeUnit) {
        timeUnit.getClass();
        if (j10 >= 0) {
            this.timeoutNanos = timeUnit.toNanos(j10);
            return this;
        }
        C9991g.m38662a("timeout < 0: ", j10);
        return null;
    }

    public long timeoutNanos() {
        return this.timeoutNanos;
    }

    public void waitUntilNotified(Object obj) throws InterruptedIOException {
        obj.getClass();
        try {
            boolean zHasDeadline = hasDeadline();
            long jTimeoutNanos = timeoutNanos();
            if (!zHasDeadline && jTimeoutNanos == 0) {
                obj.wait();
                return;
            }
            long jNanoTime = System.nanoTime();
            if (zHasDeadline && jTimeoutNanos != 0) {
                jTimeoutNanos = Math.min(jTimeoutNanos, deadlineNanoTime() - jNanoTime);
            } else if (zHasDeadline) {
                jTimeoutNanos = deadlineNanoTime() - jNanoTime;
            }
            if (jTimeoutNanos <= 0) {
                throw new InterruptedIOException("timeout");
            }
            Object obj2 = this.cancelMark;
            long j10 = jTimeoutNanos / 1000000;
            obj.wait(j10, (int) (jTimeoutNanos - (1000000 * j10)));
            if (System.nanoTime() - jNanoTime >= jTimeoutNanos && this.cancelMark == obj2) {
                throw new InterruptedIOException("timeout");
            }
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        }
    }

    /* JADX INFO: renamed from: zd.x0$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b {
        public /* synthetic */ b(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final long m38846a(long j10, long j11) {
            return (j10 != 0 && (j11 == 0 || j10 < j11)) ? j10 : j11;
        }

        public b() {
        }
    }

    public C10026x0 deadlineNanoTime(long j10) {
        this.hasDeadline = true;
        this.deadlineNanoTime = j10;
        return this;
    }

    /* JADX INFO: renamed from: zd.x0$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends C10026x0 {
        @Override // p376zd.C10026x0
        public C10026x0 timeout(long j10, TimeUnit timeUnit) {
            timeUnit.getClass();
            return this;
        }

        @Override // p376zd.C10026x0
        public void throwIfReached() {
        }

        @Override // p376zd.C10026x0
        public C10026x0 deadlineNanoTime(long j10) {
            return this;
        }
    }
}
