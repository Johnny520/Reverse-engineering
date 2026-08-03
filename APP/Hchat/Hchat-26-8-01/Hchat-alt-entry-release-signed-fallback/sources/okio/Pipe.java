package okio;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class Pipe {
    private final okio.Buffer buffer;
    private boolean canceled;
    private final java.util.concurrent.locks.Condition condition;
    private okio.Sink foldedSink;
    private final java.util.concurrent.locks.ReentrantLock lock;
    private final long maxBufferSize;
    private final okio.Sink sink;
    private boolean sinkClosed;
    private final okio.Source source;
    private boolean sourceClosed;



    public Pipe(long r3) {
            r2 = this;
            r2.<init>()
            r2.maxBufferSize = r3
            okio.Buffer r0 = new okio.Buffer
            r0.<init>()
            r2.buffer = r0
            java.util.concurrent.locks.ReentrantLock r0 = new java.util.concurrent.locks.ReentrantLock
            r0.<init>()
            r2.lock = r0
            java.util.concurrent.locks.Condition r0 = r0.newCondition()
            r0.getClass()
            r2.condition = r0
            r0 = 1
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 < 0) goto L31
            okio.Pipe$sink$1 r3 = new okio.Pipe$sink$1
            r3.<init>(r2)
            r2.sink = r3
            okio.Pipe$source$1 r3 = new okio.Pipe$source$1
            r3.<init>(r2)
            r2.source = r3
            return
        L31:
            java.lang.String r0 = "maxBufferSize < 1: "
            java.lang.String r3 = bc.e.g(r3, r0)
            j8.o.q(r3)
            r3 = 0
            throw r3
    }

    private final void forward(okio.Sink r12, fg.l r13) {
            r11 = this;
            okio.Timeout r0 = r12.timeout()
            okio.Sink r1 = r11.sink()
            okio.Timeout r1 = r1.timeout()
            long r2 = r0.timeoutNanos()
            okio.Timeout$Companion r4 = okio.Timeout.Companion
            long r5 = r1.timeoutNanos()
            long r7 = r0.timeoutNanos()
            long r4 = r4.minTimeout(r5, r7)
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.NANOSECONDS
            r0.timeout(r4, r6)
            boolean r4 = r0.hasDeadline()
            if (r4 == 0) goto L60
            long r4 = r0.deadlineNanoTime()
            boolean r7 = r1.hasDeadline()
            if (r7 == 0) goto L42
            long r7 = r0.deadlineNanoTime()
            long r9 = r1.deadlineNanoTime()
            long r7 = java.lang.Math.min(r7, r9)
            r0.deadlineNanoTime(r7)
        L42:
            r13.invoke(r12)     // Catch: java.lang.Throwable -> L52
            r0.timeout(r2, r6)
            boolean r12 = r1.hasDeadline()
            if (r12 == 0) goto L51
            r0.deadlineNanoTime(r4)
        L51:
            return
        L52:
            r12 = move-exception
            r0.timeout(r2, r6)
            boolean r13 = r1.hasDeadline()
            if (r13 == 0) goto L5f
            r0.deadlineNanoTime(r4)
        L5f:
            throw r12
        L60:
            boolean r4 = r1.hasDeadline()
            if (r4 == 0) goto L6d
            long r4 = r1.deadlineNanoTime()
            r0.deadlineNanoTime(r4)
        L6d:
            r13.invoke(r12)     // Catch: java.lang.Throwable -> L7d
            r0.timeout(r2, r6)
            boolean r12 = r1.hasDeadline()
            if (r12 == 0) goto L7c
            r0.clearDeadline()
        L7c:
            return
        L7d:
            r12 = move-exception
            r0.timeout(r2, r6)
            boolean r13 = r1.hasDeadline()
            if (r13 == 0) goto L8a
            r0.clearDeadline()
        L8a:
            throw r12
    }

    @sf.a
    /* JADX INFO: renamed from: -deprecated_sink, reason: not valid java name */
    public final okio.Sink m173deprecated_sink() {
            r1 = this;
            okio.Sink r0 = r1.sink
            return r0
    }

    @sf.a
    /* JADX INFO: renamed from: -deprecated_source, reason: not valid java name */
    public final okio.Source m174deprecated_source() {
            r1 = this;
            okio.Source r0 = r1.source
            return r0
    }

    public final void cancel() {
            r2 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r2.lock
            r0.lock()
            r1 = 1
            r2.canceled = r1     // Catch: java.lang.Throwable -> L16
            okio.Buffer r1 = r2.buffer     // Catch: java.lang.Throwable -> L16
            r1.clear()     // Catch: java.lang.Throwable -> L16
            java.util.concurrent.locks.Condition r1 = r2.condition     // Catch: java.lang.Throwable -> L16
            r1.signalAll()     // Catch: java.lang.Throwable -> L16
            r0.unlock()
            return
        L16:
            r1 = move-exception
            r0.unlock()
            throw r1
    }

    public final void fold(okio.Sink r8) {
            r7 = this;
            r8.getClass()
        L3:
            java.util.concurrent.locks.ReentrantLock r0 = r7.lock
            r0.lock()
            okio.Sink r1 = r7.foldedSink     // Catch: java.lang.Throwable -> L21
            if (r1 != 0) goto L6d
            boolean r1 = r7.canceled     // Catch: java.lang.Throwable -> L21
            if (r1 != 0) goto L63
            okio.Buffer r1 = r7.buffer     // Catch: java.lang.Throwable -> L21
            boolean r1 = r1.exhausted()     // Catch: java.lang.Throwable -> L21
            r2 = 1
            if (r1 == 0) goto L23
            r7.sourceClosed = r2     // Catch: java.lang.Throwable -> L21
            r7.foldedSink = r8     // Catch: java.lang.Throwable -> L21
            r0.unlock()
            return
        L21:
            r8 = move-exception
            goto L75
        L23:
            boolean r1 = r7.sinkClosed     // Catch: java.lang.Throwable -> L21
            okio.Buffer r3 = new okio.Buffer     // Catch: java.lang.Throwable -> L21
            r3.<init>()     // Catch: java.lang.Throwable -> L21
            okio.Buffer r4 = r7.buffer     // Catch: java.lang.Throwable -> L21
            long r5 = r4.size()     // Catch: java.lang.Throwable -> L21
            r3.write(r4, r5)     // Catch: java.lang.Throwable -> L21
            java.util.concurrent.locks.Condition r4 = r7.condition     // Catch: java.lang.Throwable -> L21
            r4.signalAll()     // Catch: java.lang.Throwable -> L21
            r0.unlock()
            long r4 = r3.size()     // Catch: java.lang.Throwable -> L48
            r8.write(r3, r4)     // Catch: java.lang.Throwable -> L48
            if (r1 == 0) goto L4a
            r8.close()     // Catch: java.lang.Throwable -> L48
            goto L3
        L48:
            r8 = move-exception
            goto L4e
        L4a:
            r8.flush()     // Catch: java.lang.Throwable -> L48
            goto L3
        L4e:
            java.util.concurrent.locks.ReentrantLock r0 = r7.lock
            r0.lock()
            r7.sourceClosed = r2     // Catch: java.lang.Throwable -> L5e
            java.util.concurrent.locks.Condition r1 = r7.condition     // Catch: java.lang.Throwable -> L5e
            r1.signalAll()     // Catch: java.lang.Throwable -> L5e
            r0.unlock()
            throw r8
        L5e:
            r8 = move-exception
            r0.unlock()
            throw r8
        L63:
            r7.foldedSink = r8     // Catch: java.lang.Throwable -> L21
            java.io.IOException r8 = new java.io.IOException     // Catch: java.lang.Throwable -> L21
            java.lang.String r1 = "canceled"
            r8.<init>(r1)     // Catch: java.lang.Throwable -> L21
            throw r8     // Catch: java.lang.Throwable -> L21
        L6d:
            java.lang.String r8 = "sink already folded"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L21
            r1.<init>(r8)     // Catch: java.lang.Throwable -> L21
            throw r1     // Catch: java.lang.Throwable -> L21
        L75:
            r0.unlock()
            throw r8
    }

    public final okio.Buffer getBuffer$okio() {
            r1 = this;
            okio.Buffer r0 = r1.buffer
            return r0
    }

    public final boolean getCanceled$okio() {
            r1 = this;
            boolean r0 = r1.canceled
            return r0
    }

    public final java.util.concurrent.locks.Condition getCondition() {
            r1 = this;
            java.util.concurrent.locks.Condition r0 = r1.condition
            return r0
    }

    public final okio.Sink getFoldedSink$okio() {
            r1 = this;
            okio.Sink r0 = r1.foldedSink
            return r0
    }

    public final java.util.concurrent.locks.ReentrantLock getLock() {
            r1 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r1.lock
            return r0
    }

    public final long getMaxBufferSize$okio() {
            r2 = this;
            long r0 = r2.maxBufferSize
            return r0
    }

    public final boolean getSinkClosed$okio() {
            r1 = this;
            boolean r0 = r1.sinkClosed
            return r0
    }

    public final boolean getSourceClosed$okio() {
            r1 = this;
            boolean r0 = r1.sourceClosed
            return r0
    }

    public final void setCanceled$okio(boolean r1) {
            r0 = this;
            r0.canceled = r1
            return
    }

    public final void setFoldedSink$okio(okio.Sink r1) {
            r0 = this;
            r0.foldedSink = r1
            return
    }

    public final void setSinkClosed$okio(boolean r1) {
            r0 = this;
            r0.sinkClosed = r1
            return
    }

    public final void setSourceClosed$okio(boolean r1) {
            r0 = this;
            r0.sourceClosed = r1
            return
    }

    public final okio.Sink sink() {
            r1 = this;
            okio.Sink r0 = r1.sink
            return r0
    }

    public final okio.Source source() {
            r1 = this;
            okio.Source r0 = r1.source
            return r0
    }
}
