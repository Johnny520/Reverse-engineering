package okio;

/* JADX INFO: compiled from: Timeout.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\b\u0010\f\u001a\u00020\u0000H\u0016J\b\u0010\r\u001a\u00020\u0000H\u0016J\u0016\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0011J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u0010\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0006H\u0016J-\u0010\u0012\u001a\u0002H\u0013\"\u0004\b\u0000\u0010\u00132\u0006\u0010\u0014\u001a\u00020\u00002\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u00130\u0016H\u0086\bø\u0001\u0000¢\u0006\u0002\u0010\u0017J\b\u0010\u0018\u001a\u00020\tH\u0016J\u0018\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0007\u001a\u00020\u0004H\u0016J\u000e\u0010\u001a\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u0001R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001d"}, m115d2 = {"Lokio/Timeout;", "", "()V", "deadlineNanoTime", "", "hasDeadline", "", "timeoutNanos", "awaitSignal", "", "condition", "Ljava/util/concurrent/locks/Condition;", "clearDeadline", "clearTimeout", "deadline", "duration", "unit", "Ljava/util/concurrent/TimeUnit;", "intersectWith", "T", "other", "block", "Lkotlin/Function0;", "(Lokio/Timeout;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "throwIfReached", "timeout", "waitUntilNotified", "monitor", "Companion", "okio"}, m116k = 1, m117mv = {1, 9, 0}, m119xi = 48)
public class Timeout {
    public static final okio.Timeout.Companion Companion = null;
    public static final okio.Timeout NONE = null;
    private long deadlineNanoTime;
    private boolean hasDeadline;
    private long timeoutNanos;

    /* JADX INFO: compiled from: Timeout.kt */
    @kotlin.Metadata(m114d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, m115d2 = {"Lokio/Timeout$Companion;", "", "()V", "NONE", "Lokio/Timeout;", "minTimeout", "", "aNanos", "bNanos", "okio"}, m116k = 1, m117mv = {1, 9, 0}, m119xi = 48)
    public static final class Companion {
        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public final long minTimeout(long r4, long r6) {
                r3 = this;
                r0 = 0
                int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r2 != 0) goto L8
                goto L14
            L8:
                int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
                if (r0 != 0) goto Ld
                goto L11
            Ld:
                int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r0 >= 0) goto L13
            L11:
                r0 = r4
                goto L15
            L13:
            L14:
                r0 = r6
            L15:
                return r0
        }
    }

    static {
            okio.Timeout$Companion r0 = new okio.Timeout$Companion
            r1 = 0
            r0.<init>(r1)
            okio.Timeout.Companion = r0
            okio.Timeout$Companion$NONE$1 r0 = new okio.Timeout$Companion$NONE$1
            r0.<init>()
            okio.Timeout r0 = (okio.Timeout) r0
            okio.Timeout.NONE = r0
            return
    }

    public Timeout() {
            r0 = this;
            r0.<init>()
            return
    }

    public final void awaitSignal(java.util.concurrent.locks.Condition r12) throws java.io.InterruptedIOException {
            r11 = this;
            java.lang.String r0 = "condition"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            boolean r0 = r11.hasDeadline()     // Catch: java.lang.InterruptedException -> L57
            long r1 = r11.timeoutNanos()     // Catch: java.lang.InterruptedException -> L57
            r3 = 0
            if (r0 != 0) goto L1a
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L1a
            r12.await()     // Catch: java.lang.InterruptedException -> L57
            return
        L1a:
            long r5 = java.lang.System.nanoTime()     // Catch: java.lang.InterruptedException -> L57
            if (r0 == 0) goto L2e
            int r7 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r7 == 0) goto L2e
            long r7 = r11.deadlineNanoTime()     // Catch: java.lang.InterruptedException -> L57
            long r7 = r7 - r5
            long r9 = java.lang.Math.min(r1, r7)     // Catch: java.lang.InterruptedException -> L57
            goto L38
        L2e:
            if (r0 == 0) goto L37
            long r7 = r11.deadlineNanoTime()     // Catch: java.lang.InterruptedException -> L57
            long r9 = r7 - r5
            goto L38
        L37:
            r9 = r1
        L38:
            r7 = r9
            r9 = 0
            int r3 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r3 <= 0) goto L4a
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch: java.lang.InterruptedException -> L57
            r12.await(r7, r3)     // Catch: java.lang.InterruptedException -> L57
            long r3 = java.lang.System.nanoTime()     // Catch: java.lang.InterruptedException -> L57
            long r9 = r3 - r5
        L4a:
            int r3 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r3 >= 0) goto L4f
            return
        L4f:
            java.io.InterruptedIOException r3 = new java.io.InterruptedIOException     // Catch: java.lang.InterruptedException -> L57
            java.lang.String r4 = "timeout"
            r3.<init>(r4)     // Catch: java.lang.InterruptedException -> L57
            throw r3     // Catch: java.lang.InterruptedException -> L57
        L57:
            r0 = move-exception
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            r1.interrupt()
            java.io.InterruptedIOException r1 = new java.io.InterruptedIOException
            java.lang.String r2 = "interrupted"
            r1.<init>(r2)
            throw r1
    }

    public okio.Timeout clearDeadline() {
            r1 = this;
            r0 = 0
            r1.hasDeadline = r0
            return r1
    }

    public okio.Timeout clearTimeout() {
            r2 = this;
            r0 = 0
            r2.timeoutNanos = r0
            return r2
    }

    public final okio.Timeout deadline(long r5, java.util.concurrent.TimeUnit r7) {
            r4 = this;
            java.lang.String r0 = "unit"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            r0 = 0
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 <= 0) goto Ld
            r0 = 1
            goto Le
        Ld:
            r0 = 0
        Le:
            if (r0 == 0) goto L1e
            long r0 = java.lang.System.nanoTime()
            long r2 = r7.toNanos(r5)
            long r0 = r0 + r2
            okio.Timeout r0 = r4.deadlineNanoTime(r0)
            return r0
        L1e:
            r0 = 0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "duration <= 0: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r5)
            java.lang.String r0 = r1.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
    }

    public long deadlineNanoTime() {
            r2 = this;
            boolean r0 = r2.hasDeadline
            if (r0 == 0) goto L7
            long r0 = r2.deadlineNanoTime
            return r0
        L7:
            r0 = 0
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "No deadline"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public okio.Timeout deadlineNanoTime(long r2) {
            r1 = this;
            r0 = 1
            r1.hasDeadline = r0
            r1.deadlineNanoTime = r2
            return r1
    }

    public boolean hasDeadline() {
            r1 = this;
            boolean r0 = r1.hasDeadline
            return r0
    }

    public final <T> T intersectWith(okio.Timeout r12, kotlin.jvm.functions.Function0<? extends T> r13) {
            r11 = this;
            java.lang.String r0 = "other"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            java.lang.String r0 = "block"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            r0 = 0
            long r1 = r11.timeoutNanos()
            okio.Timeout$Companion r3 = okio.Timeout.Companion
            long r4 = r12.timeoutNanos()
            long r6 = r11.timeoutNanos()
            long r3 = r3.minTimeout(r4, r6)
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.NANOSECONDS
            r11.timeout(r3, r5)
            boolean r3 = r11.hasDeadline()
            r4 = 1
            if (r3 == 0) goto L72
            long r5 = r11.deadlineNanoTime()
            boolean r3 = r12.hasDeadline()
            if (r3 == 0) goto L42
            long r7 = r11.deadlineNanoTime()
            long r9 = r12.deadlineNanoTime()
            long r7 = java.lang.Math.min(r7, r9)
            r11.deadlineNanoTime(r7)
        L42:
            java.lang.Object r3 = r13.invoke()     // Catch: java.lang.Throwable -> L5c
            kotlin.jvm.internal.InlineMarker.finallyStart(r4)
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.NANOSECONDS
            r11.timeout(r1, r7)
            boolean r7 = r12.hasDeadline()
            if (r7 == 0) goto L58
            r11.deadlineNanoTime(r5)
        L58:
            kotlin.jvm.internal.InlineMarker.finallyEnd(r4)
            return r3
        L5c:
            r3 = move-exception
            kotlin.jvm.internal.InlineMarker.finallyStart(r4)
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.NANOSECONDS
            r11.timeout(r1, r7)
            boolean r7 = r12.hasDeadline()
            if (r7 == 0) goto L6e
            r11.deadlineNanoTime(r5)
        L6e:
            kotlin.jvm.internal.InlineMarker.finallyEnd(r4)
            throw r3
        L72:
            boolean r3 = r12.hasDeadline()
            if (r3 == 0) goto L7f
            long r5 = r12.deadlineNanoTime()
            r11.deadlineNanoTime(r5)
        L7f:
            java.lang.Object r3 = r13.invoke()     // Catch: java.lang.Throwable -> L99
            kotlin.jvm.internal.InlineMarker.finallyStart(r4)
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.NANOSECONDS
            r11.timeout(r1, r5)
            boolean r5 = r12.hasDeadline()
            if (r5 == 0) goto L95
            r11.clearDeadline()
        L95:
            kotlin.jvm.internal.InlineMarker.finallyEnd(r4)
            return r3
        L99:
            r3 = move-exception
            kotlin.jvm.internal.InlineMarker.finallyStart(r4)
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.NANOSECONDS
            r11.timeout(r1, r5)
            boolean r5 = r12.hasDeadline()
            if (r5 == 0) goto Lab
            r11.clearDeadline()
        Lab:
            kotlin.jvm.internal.InlineMarker.finallyEnd(r4)
            throw r3
    }

    public void throwIfReached() throws java.io.IOException {
            r4 = this;
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            boolean r0 = r0.isInterrupted()
            if (r0 != 0) goto L25
            boolean r0 = r4.hasDeadline
            if (r0 == 0) goto L24
            long r0 = r4.deadlineNanoTime
            long r2 = java.lang.System.nanoTime()
            long r0 = r0 - r2
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L1c
            goto L24
        L1c:
            java.io.InterruptedIOException r0 = new java.io.InterruptedIOException
            java.lang.String r1 = "deadline reached"
            r0.<init>(r1)
            throw r0
        L24:
            return
        L25:
            java.io.InterruptedIOException r0 = new java.io.InterruptedIOException
            java.lang.String r1 = "interrupted"
            r0.<init>(r1)
            throw r0
    }

    public okio.Timeout timeout(long r4, java.util.concurrent.TimeUnit r6) {
            r3 = this;
            java.lang.String r0 = "unit"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            r0 = 0
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 < 0) goto Ld
            r0 = 1
            goto Le
        Ld:
            r0 = 0
        Le:
            if (r0 == 0) goto L17
            long r0 = r6.toNanos(r4)
            r3.timeoutNanos = r0
            return r3
        L17:
            r0 = 0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "timeout < 0: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r4)
            java.lang.String r0 = r1.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
    }

    public long timeoutNanos() {
            r2 = this;
            long r0 = r2.timeoutNanos
            return r0
    }

    public final void waitUntilNotified(java.lang.Object r14) throws java.io.InterruptedIOException {
            r13 = this;
            java.lang.String r0 = "monitor"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            boolean r0 = r13.hasDeadline()     // Catch: java.lang.InterruptedException -> L5e
            long r1 = r13.timeoutNanos()     // Catch: java.lang.InterruptedException -> L5e
            r3 = 0
            if (r0 != 0) goto L1a
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L1a
            r14.wait()     // Catch: java.lang.InterruptedException -> L5e
            return
        L1a:
            long r5 = java.lang.System.nanoTime()     // Catch: java.lang.InterruptedException -> L5e
            if (r0 == 0) goto L2e
            int r7 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r7 == 0) goto L2e
            long r7 = r13.deadlineNanoTime()     // Catch: java.lang.InterruptedException -> L5e
            long r7 = r7 - r5
            long r9 = java.lang.Math.min(r1, r7)     // Catch: java.lang.InterruptedException -> L5e
            goto L38
        L2e:
            if (r0 == 0) goto L37
            long r7 = r13.deadlineNanoTime()     // Catch: java.lang.InterruptedException -> L5e
            long r9 = r7 - r5
            goto L38
        L37:
            r9 = r1
        L38:
            r7 = r9
            r9 = 0
            int r3 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r3 <= 0) goto L51
            r3 = 1000000(0xf4240, double:4.940656E-318)
            long r11 = r7 / r3
            long r3 = r3 * r11
            long r3 = r7 - r3
            int r3 = (int) r3     // Catch: java.lang.InterruptedException -> L5e
            r14.wait(r11, r3)     // Catch: java.lang.InterruptedException -> L5e
            long r3 = java.lang.System.nanoTime()     // Catch: java.lang.InterruptedException -> L5e
            long r9 = r3 - r5
        L51:
            int r3 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r3 >= 0) goto L56
            return
        L56:
            java.io.InterruptedIOException r3 = new java.io.InterruptedIOException     // Catch: java.lang.InterruptedException -> L5e
            java.lang.String r4 = "timeout"
            r3.<init>(r4)     // Catch: java.lang.InterruptedException -> L5e
            throw r3     // Catch: java.lang.InterruptedException -> L5e
        L5e:
            r0 = move-exception
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            r1.interrupt()
            java.io.InterruptedIOException r1 = new java.io.InterruptedIOException
            java.lang.String r2 = "interrupted"
            r1.<init>(r2)
            throw r1
    }
}
