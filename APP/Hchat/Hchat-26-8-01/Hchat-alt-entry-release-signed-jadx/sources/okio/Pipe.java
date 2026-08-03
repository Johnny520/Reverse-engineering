package okio;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import p025bc.AbstractC0255e;
import p085fg.InterfaceC1231l;
import p136j8.C2104o;
import p276sf.InterfaceC3954a;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class Pipe {
    private final Buffer buffer = new Buffer();
    private boolean canceled;
    private final Condition condition;
    private Sink foldedSink;
    private final ReentrantLock lock;
    private final long maxBufferSize;
    private final Sink sink;
    private boolean sinkClosed;
    private final Source source;
    private boolean sourceClosed;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Pipe(long j3) {
        this.maxBufferSize = j3;
        ReentrantLock reentrantLock = new ReentrantLock();
        this.lock = reentrantLock;
        Condition conditionNewCondition = reentrantLock.newCondition();
        conditionNewCondition.getClass();
        this.condition = conditionNewCondition;
        if (j3 < 1) {
            C2104o.m5291q(AbstractC0255e.m1018g(j3, "maxBufferSize < 1: "));
            throw null;
        }
        this.sink = new Sink() { // from class: okio.Pipe.sink.1
            private final Timeout timeout = new Timeout();

            /* JADX DEBUG: Another duplicated slice has different insns count: {[INVOKE, INVOKE]}, finally: {[INVOKE, INVOKE, INVOKE, IF] complete} */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                boolean zHasDeadline;
                ReentrantLock lock = Pipe.this.getLock();
                Pipe pipe = Pipe.this;
                lock.lock();
                try {
                    if (pipe.getSinkClosed$okio()) {
                        lock.unlock();
                        return;
                    }
                    Sink foldedSink$okio = pipe.getFoldedSink$okio();
                    if (foldedSink$okio == null) {
                        if (pipe.getSourceClosed$okio() && pipe.getBuffer$okio().size() > 0) {
                            throw new IOException("source is closed");
                        }
                        pipe.setSinkClosed$okio(true);
                        pipe.getCondition().signalAll();
                        foldedSink$okio = null;
                    }
                    if (foldedSink$okio != null) {
                        Pipe pipe2 = Pipe.this;
                        Timeout timeout = foldedSink$okio.timeout();
                        Timeout timeout2 = pipe2.sink().timeout();
                        long jTimeoutNanos = timeout.timeoutNanos();
                        long jMinTimeout = Timeout.Companion.minTimeout(timeout2.timeoutNanos(), timeout.timeoutNanos());
                        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                        timeout.timeout(jMinTimeout, timeUnit);
                        if (!timeout.hasDeadline()) {
                            if (timeout2.hasDeadline()) {
                                timeout.deadlineNanoTime(timeout2.deadlineNanoTime());
                            }
                            try {
                                foldedSink$okio.close();
                                if (zHasDeadline) {
                                    return;
                                } else {
                                    return;
                                }
                            } finally {
                                timeout.timeout(jTimeoutNanos, timeUnit);
                                if (timeout2.hasDeadline()) {
                                    timeout.clearDeadline();
                                }
                            }
                        }
                        long jDeadlineNanoTime = timeout.deadlineNanoTime();
                        if (timeout2.hasDeadline()) {
                            timeout.deadlineNanoTime(Math.min(timeout.deadlineNanoTime(), timeout2.deadlineNanoTime()));
                        }
                        try {
                            foldedSink$okio.close();
                        } finally {
                            timeout.timeout(jTimeoutNanos, timeUnit);
                            if (timeout2.hasDeadline()) {
                                timeout.deadlineNanoTime(jDeadlineNanoTime);
                            }
                        }
                    }
                } finally {
                    lock.unlock();
                }
            }

            /* JADX DEBUG: Another duplicated slice has different insns count: {[INVOKE, INVOKE]}, finally: {[INVOKE, INVOKE, INVOKE, IF] complete} */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // okio.Sink, java.io.Flushable
            public void flush() {
                boolean zHasDeadline;
                ReentrantLock lock = Pipe.this.getLock();
                Pipe pipe = Pipe.this;
                lock.lock();
                try {
                    if (pipe.getSinkClosed$okio()) {
                        throw new IllegalStateException("closed");
                    }
                    if (pipe.getCanceled$okio()) {
                        throw new IOException("canceled");
                    }
                    Sink foldedSink$okio = pipe.getFoldedSink$okio();
                    if (foldedSink$okio == null) {
                        if (pipe.getSourceClosed$okio() && pipe.getBuffer$okio().size() > 0) {
                            throw new IOException("source is closed");
                        }
                        foldedSink$okio = null;
                    }
                    if (foldedSink$okio != null) {
                        Pipe pipe2 = Pipe.this;
                        Timeout timeout = foldedSink$okio.timeout();
                        Timeout timeout2 = pipe2.sink().timeout();
                        long jTimeoutNanos = timeout.timeoutNanos();
                        long jMinTimeout = Timeout.Companion.minTimeout(timeout2.timeoutNanos(), timeout.timeoutNanos());
                        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                        timeout.timeout(jMinTimeout, timeUnit);
                        if (!timeout.hasDeadline()) {
                            if (timeout2.hasDeadline()) {
                                timeout.deadlineNanoTime(timeout2.deadlineNanoTime());
                            }
                            try {
                                foldedSink$okio.flush();
                                if (zHasDeadline) {
                                    return;
                                } else {
                                    return;
                                }
                            } finally {
                                timeout.timeout(jTimeoutNanos, timeUnit);
                                if (timeout2.hasDeadline()) {
                                    timeout.clearDeadline();
                                }
                            }
                        }
                        long jDeadlineNanoTime = timeout.deadlineNanoTime();
                        if (timeout2.hasDeadline()) {
                            timeout.deadlineNanoTime(Math.min(timeout.deadlineNanoTime(), timeout2.deadlineNanoTime()));
                        }
                        try {
                            foldedSink$okio.flush();
                        } finally {
                            timeout.timeout(jTimeoutNanos, timeUnit);
                            if (timeout2.hasDeadline()) {
                                timeout.deadlineNanoTime(jDeadlineNanoTime);
                            }
                        }
                    }
                } finally {
                    lock.unlock();
                }
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // okio.Sink
            public Timeout timeout() {
                return this.timeout;
            }

            /* JADX DEBUG: Another duplicated slice has different insns count: {[GOTO]}, finally: {[GOTO, INVOKE] complete} */
            /* JADX DEBUG: Another duplicated slice has different insns count: {[INVOKE, INVOKE]}, finally: {[INVOKE, INVOKE, INVOKE, IF] complete} */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX WARN: Code restructure failed: missing block: B:29:0x0079, code lost:
            
                if (r2 == null) goto L58;
             */
            /* JADX WARN: Code restructure failed: missing block: B:30:0x007b, code lost:
            
                r0 = r12.this$0;
                r1 = r2.timeout();
                r0 = r0.sink().timeout();
                r3 = r1.timeoutNanos();
                r5 = okio.Timeout.Companion.minTimeout(r0.timeoutNanos(), r1.timeoutNanos());
                r7 = java.util.concurrent.TimeUnit.NANOSECONDS;
                r1.timeout(r5, r7);
             */
            /* JADX WARN: Code restructure failed: missing block: B:31:0x00a4, code lost:
            
                if (r1.hasDeadline() == false) goto L45;
             */
            /* JADX WARN: Code restructure failed: missing block: B:32:0x00a6, code lost:
            
                r5 = r1.deadlineNanoTime();
             */
            /* JADX WARN: Code restructure failed: missing block: B:33:0x00ae, code lost:
            
                if (r0.hasDeadline() == false) goto L68;
             */
            /* JADX WARN: Code restructure failed: missing block: B:34:0x00b0, code lost:
            
                r1.deadlineNanoTime(java.lang.Math.min(r1.deadlineNanoTime(), r0.deadlineNanoTime()));
             */
            /* JADX WARN: Code restructure failed: missing block: B:35:0x00bf, code lost:
            
                r2.write(r13, r14);
             */
            /* JADX WARN: Code restructure failed: missing block: B:39:0x00ce, code lost:
            
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:40:0x00cf, code lost:
            
                r13 = move-exception;
             */
            /* JADX WARN: Code restructure failed: missing block: B:41:0x00d0, code lost:
            
                r1.timeout(r3, r7);
             */
            /* JADX WARN: Code restructure failed: missing block: B:42:0x00d7, code lost:
            
                if (r0.hasDeadline() != false) goto L43;
             */
            /* JADX WARN: Code restructure failed: missing block: B:43:0x00d9, code lost:
            
                r1.deadlineNanoTime(r5);
             */
            /* JADX WARN: Code restructure failed: missing block: B:44:0x00dc, code lost:
            
                throw r13;
             */
            /* JADX WARN: Code restructure failed: missing block: B:46:0x00e1, code lost:
            
                if (r0.hasDeadline() == false) goto L66;
             */
            /* JADX WARN: Code restructure failed: missing block: B:47:0x00e3, code lost:
            
                r1.deadlineNanoTime(r0.deadlineNanoTime());
             */
            /* JADX WARN: Code restructure failed: missing block: B:48:0x00ea, code lost:
            
                r2.write(r13, r14);
             */
            /* JADX WARN: Code restructure failed: missing block: B:52:0x00f9, code lost:
            
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:53:0x00fa, code lost:
            
                r13 = move-exception;
             */
            /* JADX WARN: Code restructure failed: missing block: B:54:0x00fb, code lost:
            
                r1.timeout(r3, r7);
             */
            /* JADX WARN: Code restructure failed: missing block: B:55:0x0102, code lost:
            
                if (r0.hasDeadline() != false) goto L56;
             */
            /* JADX WARN: Code restructure failed: missing block: B:56:0x0104, code lost:
            
                r1.clearDeadline();
             */
            /* JADX WARN: Code restructure failed: missing block: B:57:0x0107, code lost:
            
                throw r13;
             */
            /* JADX WARN: Code restructure failed: missing block: B:58:0x0108, code lost:
            
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:79:?, code lost:
            
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:80:?, code lost:
            
                return;
             */
            @Override // okio.Sink
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public void write(Buffer buffer, long j4) {
                Sink foldedSink$okio;
                buffer.getClass();
                ReentrantLock lock = Pipe.this.getLock();
                Pipe pipe = Pipe.this;
                lock.lock();
                try {
                    if (pipe.getSinkClosed$okio()) {
                        throw new IllegalStateException("closed");
                    }
                    if (!pipe.getCanceled$okio()) {
                        while (true) {
                            if (j4 <= 0) {
                                foldedSink$okio = null;
                                break;
                            }
                            foldedSink$okio = pipe.getFoldedSink$okio();
                            if (foldedSink$okio == null) {
                                if (pipe.getSourceClosed$okio()) {
                                    throw new IOException("source is closed");
                                }
                                long maxBufferSize$okio = pipe.getMaxBufferSize$okio() - pipe.getBuffer$okio().size();
                                if (maxBufferSize$okio == 0) {
                                    this.timeout.awaitSignal(pipe.getCondition());
                                    if (pipe.getCanceled$okio()) {
                                        throw new IOException("canceled");
                                    }
                                } else {
                                    long jMin = Math.min(maxBufferSize$okio, j4);
                                    pipe.getBuffer$okio().write(buffer, jMin);
                                    j4 -= jMin;
                                    pipe.getCondition().signalAll();
                                }
                            }
                        }
                    } else {
                        throw new IOException("canceled");
                    }
                } finally {
                    lock.unlock();
                }
            }
        };
        this.source = new Source() { // from class: okio.Pipe.source.1
            private final Timeout timeout = new Timeout();

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                ReentrantLock lock = Pipe.this.getLock();
                Pipe pipe = Pipe.this;
                lock.lock();
                try {
                    pipe.setSourceClosed$okio(true);
                    pipe.getCondition().signalAll();
                } finally {
                    lock.unlock();
                }
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // okio.Source
            public long read(Buffer buffer, long j4) {
                buffer.getClass();
                ReentrantLock lock = Pipe.this.getLock();
                Pipe pipe = Pipe.this;
                lock.lock();
                try {
                    if (pipe.getSourceClosed$okio()) {
                        throw new IllegalStateException("closed");
                    }
                    if (pipe.getCanceled$okio()) {
                        throw new IOException("canceled");
                    }
                    while (pipe.getBuffer$okio().size() == 0) {
                        if (pipe.getSinkClosed$okio()) {
                            lock.unlock();
                            return -1L;
                        }
                        this.timeout.awaitSignal(pipe.getCondition());
                        if (pipe.getCanceled$okio()) {
                            throw new IOException("canceled");
                        }
                    }
                    long j5 = pipe.getBuffer$okio().read(buffer, j4);
                    pipe.getCondition().signalAll();
                    lock.unlock();
                    return j5;
                } catch (Throwable th2) {
                    lock.unlock();
                    throw th2;
                }
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // okio.Source
            public Timeout timeout() {
                return this.timeout;
            }
        };
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[INVOKE, INVOKE]}, finally: {[INVOKE, INVOKE, INVOKE, IF] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final void forward(Sink sink, InterfaceC1231l interfaceC1231l) {
        boolean zHasDeadline;
        Timeout timeout = sink.timeout();
        Timeout timeout2 = sink().timeout();
        long jTimeoutNanos = timeout.timeoutNanos();
        long jMinTimeout = Timeout.Companion.minTimeout(timeout2.timeoutNanos(), timeout.timeoutNanos());
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        timeout.timeout(jMinTimeout, timeUnit);
        if (!timeout.hasDeadline()) {
            if (timeout2.hasDeadline()) {
                timeout.deadlineNanoTime(timeout2.deadlineNanoTime());
            }
            try {
                interfaceC1231l.invoke(sink);
                if (zHasDeadline) {
                    return;
                } else {
                    return;
                }
            } finally {
                timeout.timeout(jTimeoutNanos, timeUnit);
                if (timeout2.hasDeadline()) {
                    timeout.clearDeadline();
                }
            }
        }
        long jDeadlineNanoTime = timeout.deadlineNanoTime();
        if (timeout2.hasDeadline()) {
            timeout.deadlineNanoTime(Math.min(timeout.deadlineNanoTime(), timeout2.deadlineNanoTime()));
        }
        try {
            interfaceC1231l.invoke(sink);
        } finally {
            timeout.timeout(jTimeoutNanos, timeUnit);
            if (timeout2.hasDeadline()) {
                timeout.deadlineNanoTime(jDeadlineNanoTime);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC3954a
    /* JADX INFO: renamed from: -deprecated_sink, reason: not valid java name */
    public final Sink m11083deprecated_sink() {
        return this.sink;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC3954a
    /* JADX INFO: renamed from: -deprecated_source, reason: not valid java name */
    public final Source m11084deprecated_source() {
        return this.source;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void cancel() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            this.canceled = true;
            this.buffer.clear();
            this.condition.signalAll();
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    public final void fold(Sink sink) {
        sink.getClass();
        while (true) {
            this.lock.lock();
            try {
                if (this.foldedSink != null) {
                    throw new IllegalStateException("sink already folded");
                }
                if (this.canceled) {
                    this.foldedSink = sink;
                    throw new IOException("canceled");
                }
                if (this.buffer.exhausted()) {
                    this.sourceClosed = true;
                    this.foldedSink = sink;
                    return;
                }
                boolean z9 = this.sinkClosed;
                Buffer buffer = new Buffer();
                Buffer buffer2 = this.buffer;
                buffer.write(buffer2, buffer2.size());
                this.condition.signalAll();
                try {
                    sink.write(buffer, buffer.size());
                    if (z9) {
                        sink.close();
                    } else {
                        sink.flush();
                    }
                } catch (Throwable th2) {
                    this.lock.lock();
                    try {
                        this.sourceClosed = true;
                        this.condition.signalAll();
                        throw th2;
                    } finally {
                    }
                }
            } finally {
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Buffer getBuffer$okio() {
        return this.buffer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean getCanceled$okio() {
        return this.canceled;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Condition getCondition() {
        return this.condition;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Sink getFoldedSink$okio() {
        return this.foldedSink;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ReentrantLock getLock() {
        return this.lock;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long getMaxBufferSize$okio() {
        return this.maxBufferSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean getSinkClosed$okio() {
        return this.sinkClosed;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean getSourceClosed$okio() {
        return this.sourceClosed;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setCanceled$okio(boolean z9) {
        this.canceled = z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setFoldedSink$okio(Sink sink) {
        this.foldedSink = sink;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setSinkClosed$okio(boolean z9) {
        this.sinkClosed = z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setSourceClosed$okio(boolean z9) {
        this.sourceClosed = z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Sink sink() {
        return this.sink;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Source source() {
        return this.source;
    }
}
