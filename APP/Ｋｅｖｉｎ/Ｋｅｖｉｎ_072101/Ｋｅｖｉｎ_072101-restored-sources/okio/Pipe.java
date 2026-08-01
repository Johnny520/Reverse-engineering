package okio;

/* JADX INFO: compiled from: Pipe.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010)\u001a\u00020*J\u000e\u0010+\u001a\u00020*2\u0006\u0010\u001f\u001a\u00020\u0014J\r\u0010\u001f\u001a\u00020\u0014H\u0007¢\u0006\u0002\b,J\r\u0010#\u001a\u00020$H\u0007¢\u0006\u0002\b-J&\u0010.\u001a\u00020**\u00020\u00142\u0017\u0010/\u001a\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020*00¢\u0006\u0002\b1H\u0082\bR\u0014\u0010\u0005\u001a\u00020\u0006X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0019\u001a\u00020\u001a¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u001f\u001a\u00020\u00148G¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0016R\u001a\u0010 \u001a\u00020\nX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\f\"\u0004\b\"\u0010\u000eR\u0013\u0010#\u001a\u00020$8G¢\u0006\b\n\u0000\u001a\u0004\b#\u0010%R\u001a\u0010&\u001a\u00020\nX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\f\"\u0004\b(\u0010\u000e¨\u00062"}, m115d2 = {"Lokio/Pipe;", "", "maxBufferSize", "", "(J)V", "buffer", "Lokio/Buffer;", "getBuffer$okio", "()Lokio/Buffer;", "canceled", "", "getCanceled$okio", "()Z", "setCanceled$okio", "(Z)V", "condition", "Ljava/util/concurrent/locks/Condition;", "getCondition", "()Ljava/util/concurrent/locks/Condition;", "foldedSink", "Lokio/Sink;", "getFoldedSink$okio", "()Lokio/Sink;", "setFoldedSink$okio", "(Lokio/Sink;)V", "lock", "Ljava/util/concurrent/locks/ReentrantLock;", "getLock", "()Ljava/util/concurrent/locks/ReentrantLock;", "getMaxBufferSize$okio", "()J", "sink", "sinkClosed", "getSinkClosed$okio", "setSinkClosed$okio", "source", "Lokio/Source;", "()Lokio/Source;", "sourceClosed", "getSourceClosed$okio", "setSourceClosed$okio", "cancel", "", "fold", "-deprecated_sink", "-deprecated_source", "forward", "block", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "okio"}, m116k = 1, m117mv = {1, 9, 0}, m119xi = 48)
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



    public Pipe(long r5) {
            r4 = this;
            r4.<init>()
            r4.maxBufferSize = r5
            okio.Buffer r0 = new okio.Buffer
            r0.<init>()
            r4.buffer = r0
            java.util.concurrent.locks.ReentrantLock r0 = new java.util.concurrent.locks.ReentrantLock
            r0.<init>()
            r4.lock = r0
            java.util.concurrent.locks.ReentrantLock r0 = r4.lock
            java.util.concurrent.locks.Condition r0 = r0.newCondition()
            java.lang.String r1 = "newCondition(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r4.condition = r0
            long r0 = r4.maxBufferSize
            r2 = 1
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L2b
            r0 = 1
            goto L2c
        L2b:
            r0 = 0
        L2c:
            if (r0 == 0) goto L42
        L2f:
            okio.Pipe$sink$1 r0 = new okio.Pipe$sink$1
            r0.<init>(r4)
            okio.Sink r0 = (okio.Sink) r0
            r4.sink = r0
            okio.Pipe$source$1 r0 = new okio.Pipe$source$1
            r0.<init>(r4)
            okio.Source r0 = (okio.Source) r0
            r4.source = r0
            return
        L42:
            r0 = 0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "maxBufferSize < 1: "
            java.lang.StringBuilder r1 = r1.append(r2)
            long r2 = r4.maxBufferSize
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r0 = r1.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
    }

    private final void forward(okio.Sink r17, kotlin.jvm.functions.Function1<? super okio.Sink, kotlin.Unit> r18) {
            r16 = this;
            r1 = r17
            r2 = r18
            r3 = 0
            okio.Timeout r4 = r17.timeout()
            okio.Sink r0 = r16.sink()
            okio.Timeout r0 = r0.timeout()
            r5 = r0
            r6 = 0
            long r7 = r4.timeoutNanos()
            okio.Timeout$Companion r0 = okio.Timeout.Companion
            long r9 = r5.timeoutNanos()
            long r11 = r4.timeoutNanos()
            long r9 = r0.minTimeout(r9, r11)
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.NANOSECONDS
            r4.timeout(r9, r0)
            boolean r0 = r4.hasDeadline()
            r9 = 1
            if (r0 == 0) goto L7c
            long r10 = r4.deadlineNanoTime()
            boolean r0 = r5.hasDeadline()
            if (r0 == 0) goto L4a
            long r12 = r4.deadlineNanoTime()
            long r14 = r5.deadlineNanoTime()
            long r12 = java.lang.Math.min(r12, r14)
            r4.deadlineNanoTime(r12)
        L4a:
            r0 = 0
            r2.invoke(r1)     // Catch: java.lang.Throwable -> L66
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L66
            kotlin.jvm.internal.InlineMarker.finallyStart(r9)
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.NANOSECONDS
            r4.timeout(r7, r0)
            boolean r0 = r5.hasDeadline()
            if (r0 == 0) goto L62
            r4.deadlineNanoTime(r10)
        L62:
            kotlin.jvm.internal.InlineMarker.finallyEnd(r9)
            goto La5
        L66:
            r0 = move-exception
            kotlin.jvm.internal.InlineMarker.finallyStart(r9)
            java.util.concurrent.TimeUnit r12 = java.util.concurrent.TimeUnit.NANOSECONDS
            r4.timeout(r7, r12)
            boolean r12 = r5.hasDeadline()
            if (r12 == 0) goto L78
            r4.deadlineNanoTime(r10)
        L78:
            kotlin.jvm.internal.InlineMarker.finallyEnd(r9)
            throw r0
        L7c:
            boolean r0 = r5.hasDeadline()
            if (r0 == 0) goto L89
            long r10 = r5.deadlineNanoTime()
            r4.deadlineNanoTime(r10)
        L89:
            r0 = 0
            r2.invoke(r1)     // Catch: java.lang.Throwable -> La6
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> La6
            kotlin.jvm.internal.InlineMarker.finallyStart(r9)
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.NANOSECONDS
            r4.timeout(r7, r0)
            boolean r0 = r5.hasDeadline()
            if (r0 == 0) goto La1
            r4.clearDeadline()
        La1:
            kotlin.jvm.internal.InlineMarker.finallyEnd(r9)
        La5:
            return
        La6:
            r0 = move-exception
            kotlin.jvm.internal.InlineMarker.finallyStart(r9)
            java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.NANOSECONDS
            r4.timeout(r7, r10)
            boolean r10 = r5.hasDeadline()
            if (r10 == 0) goto Lb8
            r4.clearDeadline()
        Lb8:
            kotlin.jvm.internal.InlineMarker.finallyEnd(r9)
            throw r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "sink", imports = {}))
    /* JADX INFO: renamed from: -deprecated_sink, reason: not valid java name */
    public final okio.Sink m10388deprecated_sink() {
            r1 = this;
            okio.Sink r0 = r1.sink
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "source", imports = {}))
    /* JADX INFO: renamed from: -deprecated_source, reason: not valid java name */
    public final okio.Source m10389deprecated_source() {
            r1 = this;
            okio.Source r0 = r1.source
            return r0
    }

    public final void cancel() {
            r3 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r3.lock
            java.util.concurrent.locks.Lock r0 = (java.util.concurrent.locks.Lock) r0
            r0.lock()
            r1 = 0
            r2 = 1
            r3.canceled = r2     // Catch: java.lang.Throwable -> L1c
            okio.Buffer r2 = r3.buffer     // Catch: java.lang.Throwable -> L1c
            r2.clear()     // Catch: java.lang.Throwable -> L1c
            java.util.concurrent.locks.Condition r2 = r3.condition     // Catch: java.lang.Throwable -> L1c
            r2.signalAll()     // Catch: java.lang.Throwable -> L1c
            kotlin.Unit r1 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L1c
            r0.unlock()
            return
        L1c:
            r1 = move-exception
            r0.unlock()
            throw r1
    }

    public final void fold(okio.Sink r9) throws java.io.IOException {
            r8 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
        L5:
            r0 = 0
            r1 = 0
            java.util.concurrent.locks.ReentrantLock r2 = r8.lock
            java.util.concurrent.locks.Lock r2 = (java.util.concurrent.locks.Lock) r2
            r2.lock()
            r3 = 0
            okio.Sink r4 = r8.foldedSink     // Catch: java.lang.Throwable -> L96
            r5 = 1
            if (r4 != 0) goto L17
            r4 = r5
            goto L18
        L17:
            r4 = 0
        L18:
            if (r4 == 0) goto L89
            boolean r4 = r8.canceled     // Catch: java.lang.Throwable -> L96
            if (r4 != 0) goto L7f
            okio.Buffer r4 = r8.buffer     // Catch: java.lang.Throwable -> L96
            boolean r4 = r4.exhausted()     // Catch: java.lang.Throwable -> L96
            if (r4 == 0) goto L2f
            r8.sourceClosed = r5     // Catch: java.lang.Throwable -> L96
            r8.foldedSink = r9     // Catch: java.lang.Throwable -> L96
            r2.unlock()
            return
        L2f:
            boolean r4 = r8.sinkClosed     // Catch: java.lang.Throwable -> L96
            r0 = r4
            okio.Buffer r4 = new okio.Buffer     // Catch: java.lang.Throwable -> L96
            r4.<init>()     // Catch: java.lang.Throwable -> L96
            r1 = r4
            okio.Buffer r4 = r8.buffer     // Catch: java.lang.Throwable -> L96
            okio.Buffer r6 = r8.buffer     // Catch: java.lang.Throwable -> L96
            long r6 = r6.size()     // Catch: java.lang.Throwable -> L96
            r1.write(r4, r6)     // Catch: java.lang.Throwable -> L96
            java.util.concurrent.locks.Condition r4 = r8.condition     // Catch: java.lang.Throwable -> L96
            r4.signalAll()     // Catch: java.lang.Throwable -> L96
            kotlin.Unit r3 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L96
            r2.unlock()
            r2 = 0
            long r3 = r1.size()     // Catch: java.lang.Throwable -> L63
            r9.write(r1, r3)     // Catch: java.lang.Throwable -> L63
            if (r0 == 0) goto L5d
            r9.close()     // Catch: java.lang.Throwable -> L63
            goto L60
        L5d:
            r9.flush()     // Catch: java.lang.Throwable -> L63
        L60:
            r2 = 1
            goto L5
        L63:
            r3 = move-exception
            java.util.concurrent.locks.ReentrantLock r4 = r8.lock
            java.util.concurrent.locks.Lock r4 = (java.util.concurrent.locks.Lock) r4
            r4.lock()
            r6 = 0
            r8.sourceClosed = r5     // Catch: java.lang.Throwable -> L7a
            java.util.concurrent.locks.Condition r5 = r8.condition     // Catch: java.lang.Throwable -> L7a
            r5.signalAll()     // Catch: java.lang.Throwable -> L7a
            kotlin.Unit r5 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L7a
            r4.unlock()
            throw r3
        L7a:
            r3 = move-exception
            r4.unlock()
            throw r3
        L7f:
            r8.foldedSink = r9     // Catch: java.lang.Throwable -> L96
            java.io.IOException r4 = new java.io.IOException     // Catch: java.lang.Throwable -> L96
            java.lang.String r5 = "canceled"
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L96
            throw r4     // Catch: java.lang.Throwable -> L96
        L89:
            r4 = 0
            java.lang.String r5 = "sink already folded"
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L96
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L96
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L96
            throw r4     // Catch: java.lang.Throwable -> L96
        L96:
            r3 = move-exception
            r2.unlock()
            throw r3
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
