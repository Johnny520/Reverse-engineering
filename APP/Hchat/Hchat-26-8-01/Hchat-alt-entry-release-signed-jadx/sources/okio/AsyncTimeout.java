package okio;

import gg.AbstractC1411g;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import p085fg.InterfaceC1220a;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class AsyncTimeout extends Timeout {
    public static final Companion Companion = new Companion(null);
    private static final long IDLE_TIMEOUT_MILLIS;
    private static final long IDLE_TIMEOUT_NANOS;
    private static final int TIMEOUT_WRITE_SIZE = 65536;
    private static final Condition condition;
    private static AsyncTimeout head;
    private static final ReentrantLock lock;
    private boolean inQueue;
    private AsyncTimeout next;
    private long timeoutAt;

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class Watchdog extends Thread {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public Watchdog() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            ReentrantLock lock;
            AsyncTimeout asyncTimeoutAwaitTimeout$okio;
            while (true) {
                try {
                    Companion companion = AsyncTimeout.Companion;
                    lock = companion.getLock();
                    lock.lock();
                    try {
                        asyncTimeoutAwaitTimeout$okio = companion.awaitTimeout$okio();
                    } catch (Throwable th2) {
                        lock.unlock();
                        throw th2;
                    }
                } catch (InterruptedException unused) {
                }
                if (asyncTimeoutAwaitTimeout$okio == AsyncTimeout.head) {
                    AsyncTimeout.head = null;
                    lock.unlock();
                    return;
                } else {
                    lock.unlock();
                    if (asyncTimeoutAwaitTimeout$okio != null) {
                        asyncTimeoutAwaitTimeout$okio.timedOut();
                    }
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        lock = reentrantLock;
        Condition conditionNewCondition = reentrantLock.newCondition();
        conditionNewCondition.getClass();
        condition = conditionNewCondition;
        IDLE_TIMEOUT_MILLIS = 60000L;
        IDLE_TIMEOUT_NANOS = TimeUnit.MILLISECONDS.toNanos(60000L);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public final long remainingNanos(long j3) {
        return this.timeoutAt - j3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final IOException access$newTimeoutException(IOException iOException) {
        return newTimeoutException(iOException);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void enter() {
        long jTimeoutNanos = timeoutNanos();
        boolean zHasDeadline = hasDeadline();
        if (jTimeoutNanos != 0 || zHasDeadline) {
            Companion.scheduleTimeout(this, jTimeoutNanos, zHasDeadline);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean exit() {
        return Companion.cancelScheduledTimeout(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public IOException newTimeoutException(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Sink sink(final Sink sink) {
        sink.getClass();
        return new Sink() { // from class: okio.AsyncTimeout.sink.1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                AsyncTimeout asyncTimeout = AsyncTimeout.this;
                Sink sink2 = sink;
                asyncTimeout.enter();
                try {
                    sink2.close();
                    if (asyncTimeout.exit()) {
                        throw asyncTimeout.access$newTimeoutException(null);
                    }
                } catch (IOException e6) {
                    if (!asyncTimeout.exit()) {
                        throw e6;
                    }
                    throw asyncTimeout.access$newTimeoutException(e6);
                } finally {
                    asyncTimeout.exit();
                }
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // okio.Sink, java.io.Flushable
            public void flush() throws IOException {
                AsyncTimeout asyncTimeout = AsyncTimeout.this;
                Sink sink2 = sink;
                asyncTimeout.enter();
                try {
                    sink2.flush();
                    if (asyncTimeout.exit()) {
                        throw asyncTimeout.access$newTimeoutException(null);
                    }
                } catch (IOException e6) {
                    if (!asyncTimeout.exit()) {
                        throw e6;
                    }
                    throw asyncTimeout.access$newTimeoutException(e6);
                } finally {
                    asyncTimeout.exit();
                }
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public String toString() {
                return "AsyncTimeout.sink(" + sink + ')';
            }

            /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[INVOKE] complete} */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // okio.Sink
            public void write(Buffer buffer, long j3) throws IOException {
                buffer.getClass();
                SegmentedByteString.checkOffsetAndCount(buffer.size(), 0L, j3);
                while (true) {
                    long j4 = 0;
                    if (j3 <= 0) {
                        return;
                    }
                    Segment segment = buffer.head;
                    segment.getClass();
                    while (true) {
                        if (j4 >= 65536) {
                            break;
                        }
                        j4 += (long) (segment.limit - segment.pos);
                        if (j4 >= j3) {
                            j4 = j3;
                            break;
                        } else {
                            segment = segment.next;
                            segment.getClass();
                        }
                    }
                    AsyncTimeout asyncTimeout = AsyncTimeout.this;
                    Sink sink2 = sink;
                    asyncTimeout.enter();
                    try {
                        try {
                            sink2.write(buffer, j4);
                            if (asyncTimeout.exit()) {
                                throw asyncTimeout.access$newTimeoutException(null);
                            }
                            j3 -= j4;
                        } catch (IOException e6) {
                            if (!asyncTimeout.exit()) {
                                throw e6;
                            }
                            throw asyncTimeout.access$newTimeoutException(e6);
                        }
                    } catch (Throwable th2) {
                        asyncTimeout.exit();
                        throw th2;
                    }
                }
            }

            /* JADX DEBUG: Method merged with bridge method: timeout()Lokio/Timeout; */
            @Override // okio.Sink
            public AsyncTimeout timeout() {
                return AsyncTimeout.this;
            }
        };
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Source source(final Source source) {
        source.getClass();
        return new Source() { // from class: okio.AsyncTimeout.source.1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                AsyncTimeout asyncTimeout = AsyncTimeout.this;
                Source source2 = source;
                asyncTimeout.enter();
                try {
                    source2.close();
                    if (asyncTimeout.exit()) {
                        throw asyncTimeout.access$newTimeoutException(null);
                    }
                } catch (IOException e6) {
                    if (!asyncTimeout.exit()) {
                        throw e6;
                    }
                    throw asyncTimeout.access$newTimeoutException(e6);
                } finally {
                    asyncTimeout.exit();
                }
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // okio.Source
            public long read(Buffer buffer, long j3) throws IOException {
                buffer.getClass();
                AsyncTimeout asyncTimeout = AsyncTimeout.this;
                Source source2 = source;
                asyncTimeout.enter();
                try {
                    long j4 = source2.read(buffer, j3);
                    if (asyncTimeout.exit()) {
                        throw asyncTimeout.access$newTimeoutException(null);
                    }
                    return j4;
                } catch (IOException e6) {
                    if (asyncTimeout.exit()) {
                        throw asyncTimeout.access$newTimeoutException(e6);
                    }
                    throw e6;
                } finally {
                    asyncTimeout.exit();
                }
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public String toString() {
                return "AsyncTimeout.source(" + source + ')';
            }

            /* JADX DEBUG: Method merged with bridge method: timeout()Lokio/Timeout; */
            @Override // okio.Source
            public AsyncTimeout timeout() {
                return AsyncTimeout.this;
            }
        };
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final <T> T withTimeout(InterfaceC1220a interfaceC1220a) throws IOException {
        interfaceC1220a.getClass();
        enter();
        try {
            T t9 = (T) interfaceC1220a.invoke();
            if (exit()) {
                throw access$newTimeoutException(null);
            }
            return t9;
        } catch (IOException e6) {
            if (exit()) {
                throw access$newTimeoutException(e6);
            }
            throw e6;
        } finally {
            exit();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: okio.AsyncTimeout.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(AbstractC1411g abstractC1411g) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: Access modifiers changed from: private */
        public final boolean cancelScheduledTimeout(AsyncTimeout asyncTimeout) {
            ReentrantLock lock = AsyncTimeout.Companion.getLock();
            lock.lock();
            try {
                if (!asyncTimeout.inQueue) {
                    return false;
                }
                asyncTimeout.inQueue = false;
                for (AsyncTimeout asyncTimeout2 = AsyncTimeout.head; asyncTimeout2 != null; asyncTimeout2 = asyncTimeout2.next) {
                    if (asyncTimeout2.next == asyncTimeout) {
                        asyncTimeout2.next = asyncTimeout.next;
                        asyncTimeout.next = null;
                        return false;
                    }
                }
                lock.unlock();
                return true;
            } finally {
                lock.unlock();
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: Access modifiers changed from: private */
        public final void scheduleTimeout(AsyncTimeout asyncTimeout, long j3, boolean z9) {
            ReentrantLock lock = AsyncTimeout.Companion.getLock();
            lock.lock();
            try {
                if (asyncTimeout.inQueue) {
                    throw new IllegalStateException("Unbalanced enter/exit");
                }
                asyncTimeout.inQueue = true;
                if (AsyncTimeout.head == null) {
                    AsyncTimeout.head = new AsyncTimeout();
                    new Watchdog().start();
                }
                long jNanoTime = System.nanoTime();
                if (j3 != 0 && z9) {
                    asyncTimeout.timeoutAt = Math.min(j3, asyncTimeout.deadlineNanoTime() - jNanoTime) + jNanoTime;
                } else if (j3 != 0) {
                    asyncTimeout.timeoutAt = j3 + jNanoTime;
                } else {
                    if (!z9) {
                        throw new AssertionError();
                    }
                    asyncTimeout.timeoutAt = asyncTimeout.deadlineNanoTime();
                }
                long jRemainingNanos = asyncTimeout.remainingNanos(jNanoTime);
                AsyncTimeout asyncTimeout2 = AsyncTimeout.head;
                asyncTimeout2.getClass();
                while (asyncTimeout2.next != null) {
                    AsyncTimeout asyncTimeout3 = asyncTimeout2.next;
                    asyncTimeout3.getClass();
                    if (jRemainingNanos < asyncTimeout3.remainingNanos(jNanoTime)) {
                        break;
                    }
                    asyncTimeout2 = asyncTimeout2.next;
                    asyncTimeout2.getClass();
                }
                asyncTimeout.next = asyncTimeout2.next;
                asyncTimeout2.next = asyncTimeout;
                if (asyncTimeout2 == AsyncTimeout.head) {
                    AsyncTimeout.Companion.getCondition().signal();
                }
                lock.unlock();
            } catch (Throwable th2) {
                lock.unlock();
                throw th2;
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final AsyncTimeout awaitTimeout$okio() throws InterruptedException {
            AsyncTimeout asyncTimeout = AsyncTimeout.head;
            asyncTimeout.getClass();
            AsyncTimeout asyncTimeout2 = asyncTimeout.next;
            if (asyncTimeout2 == null) {
                long jNanoTime = System.nanoTime();
                getCondition().await(AsyncTimeout.IDLE_TIMEOUT_MILLIS, TimeUnit.MILLISECONDS);
                AsyncTimeout asyncTimeout3 = AsyncTimeout.head;
                asyncTimeout3.getClass();
                if (asyncTimeout3.next != null || System.nanoTime() - jNanoTime < AsyncTimeout.IDLE_TIMEOUT_NANOS) {
                    return null;
                }
                return AsyncTimeout.head;
            }
            long jRemainingNanos = asyncTimeout2.remainingNanos(System.nanoTime());
            if (jRemainingNanos > 0) {
                getCondition().await(jRemainingNanos, TimeUnit.NANOSECONDS);
                return null;
            }
            AsyncTimeout asyncTimeout4 = AsyncTimeout.head;
            asyncTimeout4.getClass();
            asyncTimeout4.next = asyncTimeout2.next;
            asyncTimeout2.next = null;
            return asyncTimeout2;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final Condition getCondition() {
            return AsyncTimeout.condition;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final ReentrantLock getLock() {
            return AsyncTimeout.lock;
        }

        private Companion() {
        }
    }

    public void timedOut() {
    }
}
