package okio;

import gg.AbstractC1411g;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import p025bc.AbstractC0255e;
import p085fg.InterfaceC1220a;
import p136j8.C2104o;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class Timeout {
    public static final Companion Companion = new Companion(null);
    public static final Timeout NONE = new Timeout() { // from class: okio.Timeout$Companion$NONE$1
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // okio.Timeout
        public Timeout timeout(long j3, TimeUnit timeUnit) {
            timeUnit.getClass();
            return this;
        }

        @Override // okio.Timeout
        public void throwIfReached() {
        }

        @Override // okio.Timeout
        public Timeout deadlineNanoTime(long j3) {
            return this;
        }
    };
    private long deadlineNanoTime;
    private boolean hasDeadline;
    private long timeoutNanos;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void awaitSignal(Condition condition) throws InterruptedIOException {
        condition.getClass();
        try {
            boolean zHasDeadline = hasDeadline();
            long jTimeoutNanos = timeoutNanos();
            long jNanoTime = 0;
            if (!zHasDeadline && jTimeoutNanos == 0) {
                condition.await();
                return;
            }
            long jNanoTime2 = System.nanoTime();
            if (zHasDeadline && jTimeoutNanos != 0) {
                jTimeoutNanos = Math.min(jTimeoutNanos, deadlineNanoTime() - jNanoTime2);
            } else if (zHasDeadline) {
                jTimeoutNanos = deadlineNanoTime() - jNanoTime2;
            }
            if (jTimeoutNanos > 0) {
                condition.await(jTimeoutNanos, TimeUnit.NANOSECONDS);
                jNanoTime = System.nanoTime() - jNanoTime2;
            }
            if (jNanoTime >= jTimeoutNanos) {
                throw new InterruptedIOException("timeout");
            }
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Timeout clearDeadline() {
        this.hasDeadline = false;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Timeout clearTimeout() {
        this.timeoutNanos = 0L;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Timeout deadline(long j3, TimeUnit timeUnit) {
        timeUnit.getClass();
        if (j3 > 0) {
            return deadlineNanoTime(timeUnit.toNanos(j3) + System.nanoTime());
        }
        C2104o.m5291q(AbstractC0255e.m1018g(j3, "duration <= 0: "));
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public long deadlineNanoTime() {
        if (this.hasDeadline) {
            return this.deadlineNanoTime;
        }
        C2104o.m5276A("No deadline");
        return 0L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean hasDeadline() {
        return this.hasDeadline;
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[INVOKE, INVOKE]}, finally: {[INVOKE, INVOKE, INVOKE, IF] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final <T> T intersectWith(Timeout timeout, InterfaceC1220a interfaceC1220a) {
        timeout.getClass();
        interfaceC1220a.getClass();
        long jTimeoutNanos = timeoutNanos();
        long jMinTimeout = Companion.minTimeout(timeout.timeoutNanos(), timeoutNanos());
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        timeout(jMinTimeout, timeUnit);
        if (!hasDeadline()) {
            if (timeout.hasDeadline()) {
                deadlineNanoTime(timeout.deadlineNanoTime());
            }
            try {
                return (T) interfaceC1220a.invoke();
            } finally {
                timeout(jTimeoutNanos, timeUnit);
                if (timeout.hasDeadline()) {
                    clearDeadline();
                }
            }
        }
        long jDeadlineNanoTime = deadlineNanoTime();
        if (timeout.hasDeadline()) {
            deadlineNanoTime(Math.min(deadlineNanoTime(), timeout.deadlineNanoTime()));
        }
        try {
            return (T) interfaceC1220a.invoke();
        } finally {
            timeout(jTimeoutNanos, timeUnit);
            if (timeout.hasDeadline()) {
                deadlineNanoTime(jDeadlineNanoTime);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void throwIfReached() throws InterruptedIOException {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        if (this.hasDeadline && this.deadlineNanoTime - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Timeout timeout(long j3, TimeUnit timeUnit) {
        timeUnit.getClass();
        if (j3 >= 0) {
            this.timeoutNanos = timeUnit.toNanos(j3);
            return this;
        }
        C2104o.m5291q(AbstractC0255e.m1018g(j3, "timeout < 0: "));
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public long timeoutNanos() {
        return this.timeoutNanos;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void waitUntilNotified(Object obj) throws InterruptedIOException {
        obj.getClass();
        try {
            boolean zHasDeadline = hasDeadline();
            long jTimeoutNanos = timeoutNanos();
            long jNanoTime = 0;
            if (!zHasDeadline && jTimeoutNanos == 0) {
                obj.wait();
                return;
            }
            long jNanoTime2 = System.nanoTime();
            if (zHasDeadline && jTimeoutNanos != 0) {
                jTimeoutNanos = Math.min(jTimeoutNanos, deadlineNanoTime() - jNanoTime2);
            } else if (zHasDeadline) {
                jTimeoutNanos = deadlineNanoTime() - jNanoTime2;
            }
            if (jTimeoutNanos > 0) {
                long j3 = jTimeoutNanos / 1000000;
                obj.wait(j3, (int) (jTimeoutNanos - (1000000 * j3)));
                jNanoTime = System.nanoTime() - jNanoTime2;
            }
            if (jNanoTime >= jTimeoutNanos) {
                throw new InterruptedIOException("timeout");
            }
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: okio.Timeout.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(AbstractC1411g abstractC1411g) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final long minTimeout(long j3, long j4) {
            return (j3 != 0 && (j4 == 0 || j3 < j4)) ? j3 : j4;
        }

        private Companion() {
        }
    }

    public Timeout deadlineNanoTime(long j3) {
        this.hasDeadline = true;
        this.deadlineNanoTime = j3;
        return this;
    }
}
