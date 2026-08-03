package okio;

import java.io.InterruptedIOException;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import p136j8.C2104o;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class Throttler {
    private long allocatedUntil;
    private long bytesPerSecond;
    private final Condition condition;
    private final ReentrantLock lock;
    private long maxByteCount;
    private long waitByteCount;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Throttler(long j3) {
        this.allocatedUntil = j3;
        this.waitByteCount = 8192L;
        this.maxByteCount = 262144L;
        ReentrantLock reentrantLock = new ReentrantLock();
        this.lock = reentrantLock;
        Condition conditionNewCondition = reentrantLock.newCondition();
        conditionNewCondition.getClass();
        this.condition = conditionNewCondition;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ void bytesPerSecond$default(Throttler throttler, long j3, long j4, long j5, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            j4 = throttler.waitByteCount;
        }
        long j10 = j4;
        if ((i9 & 4) != 0) {
            j5 = throttler.maxByteCount;
        }
        throttler.bytesPerSecond(j3, j10, j5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final long bytesToNanos(long j3) {
        return (j3 * 1000000000) / this.bytesPerSecond;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final long nanosToBytes(long j3) {
        return (j3 * this.bytesPerSecond) / 1000000000;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long byteCountOrWaitNanos$okio(long j3, long j4) {
        if (this.bytesPerSecond == 0) {
            return j4;
        }
        long jMax = Math.max(this.allocatedUntil - j3, 0L);
        long jNanosToBytes = this.maxByteCount - nanosToBytes(jMax);
        if (jNanosToBytes >= j4) {
            this.allocatedUntil = j3 + jMax + bytesToNanos(j4);
            return j4;
        }
        long j5 = this.waitByteCount;
        if (jNanosToBytes >= j5) {
            this.allocatedUntil = j3 + bytesToNanos(this.maxByteCount);
            return jNanosToBytes;
        }
        long jMin = Math.min(j5, j4);
        long jBytesToNanos = jMax + bytesToNanos(jMin - this.maxByteCount);
        if (jBytesToNanos != 0) {
            return -jBytesToNanos;
        }
        this.allocatedUntil = j3 + bytesToNanos(this.maxByteCount);
        return jMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void bytesPerSecond(long j3, long j4, long j5) {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (j3 < 0) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (j4 <= 0) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (j5 < j4) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            this.bytesPerSecond = j3;
            this.waitByteCount = j4;
            this.maxByteCount = j5;
            this.condition.signalAll();
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Condition getCondition() {
        return this.condition;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ReentrantLock getLock() {
        return this.lock;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Sink sink(Sink sink) {
        sink.getClass();
        return new ForwardingSink(sink) { // from class: okio.Throttler.sink.1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // okio.ForwardingSink, okio.Sink
            public void write(Buffer buffer, long j3) throws InterruptedIOException {
                buffer.getClass();
                while (j3 > 0) {
                    try {
                        long jTake$okio = this.take$okio(j3);
                        super.write(buffer, jTake$okio);
                        j3 -= jTake$okio;
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        throw new InterruptedIOException("interrupted");
                    }
                }
            }
        };
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Source source(Source source) {
        source.getClass();
        return new ForwardingSource(source) { // from class: okio.Throttler.source.1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // okio.ForwardingSource, okio.Source
            public long read(Buffer buffer, long j3) throws InterruptedIOException {
                buffer.getClass();
                try {
                    return super.read(buffer, this.take$okio(j3));
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    throw new InterruptedIOException("interrupted");
                }
            }
        };
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long take$okio(long j3) {
        if (j3 <= 0) {
            C2104o.m5294t("Failed requirement.");
            return 0L;
        }
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        while (true) {
            try {
                long jByteCountOrWaitNanos$okio = byteCountOrWaitNanos$okio(System.nanoTime(), j3);
                if (jByteCountOrWaitNanos$okio >= 0) {
                    return jByteCountOrWaitNanos$okio;
                }
                this.condition.awaitNanos(-jByteCountOrWaitNanos$okio);
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public Throttler() {
        this(System.nanoTime());
    }

    public final void bytesPerSecond(long j3, long j4) {
        bytesPerSecond$default(this, j3, j4, 0L, 4, null);
    }

    public final void bytesPerSecond(long j3) {
        bytesPerSecond$default(this, j3, 0L, 0L, 6, null);
    }
}
