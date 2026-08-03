package okio;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class Timeout {
    public static final okio.Timeout.Companion Companion = null;
    public static final okio.Timeout NONE = null;
    private long deadlineNanoTime;
    private boolean hasDeadline;
    private long timeoutNanos;

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class Companion {
        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Companion(gg.g r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public final long minTimeout(long r4, long r6) {
                r3 = this;
                r0 = 0
                int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r2 != 0) goto L7
                goto L11
            L7:
                int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
                if (r0 != 0) goto Lc
                goto L10
            Lc:
                int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r0 >= 0) goto L11
            L10:
                return r4
            L11:
                return r6
        }
    }

    static {
            okio.Timeout$Companion r0 = new okio.Timeout$Companion
            r1 = 0
            r0.<init>(r1)
            okio.Timeout.Companion = r0
            okio.Timeout$Companion$NONE$1 r0 = new okio.Timeout$Companion$NONE$1
            r0.<init>()
            okio.Timeout.NONE = r0
            return
    }

    public Timeout() {
            r0 = this;
            r0.<init>()
            return
    }

    public final void awaitSignal(java.util.concurrent.locks.Condition r10) {
            r9 = this;
            r10.getClass()
            boolean r0 = r9.hasDeadline()     // Catch: java.lang.InterruptedException -> L4e
            long r1 = r9.timeoutNanos()     // Catch: java.lang.InterruptedException -> L4e
            r3 = 0
            if (r0 != 0) goto L17
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L17
            r10.await()     // Catch: java.lang.InterruptedException -> L4e
            return
        L17:
            long r5 = java.lang.System.nanoTime()     // Catch: java.lang.InterruptedException -> L4e
            if (r0 == 0) goto L2b
            int r7 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r7 == 0) goto L2b
            long r7 = r9.deadlineNanoTime()     // Catch: java.lang.InterruptedException -> L4e
            long r7 = r7 - r5
            long r1 = java.lang.Math.min(r1, r7)     // Catch: java.lang.InterruptedException -> L4e
            goto L33
        L2b:
            if (r0 == 0) goto L33
            long r0 = r9.deadlineNanoTime()     // Catch: java.lang.InterruptedException -> L4e
            long r1 = r0 - r5
        L33:
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L41
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch: java.lang.InterruptedException -> L4e
            r10.await(r1, r0)     // Catch: java.lang.InterruptedException -> L4e
            long r3 = java.lang.System.nanoTime()     // Catch: java.lang.InterruptedException -> L4e
            long r3 = r3 - r5
        L41:
            int r10 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r10 >= 0) goto L46
            return
        L46:
            java.io.InterruptedIOException r10 = new java.io.InterruptedIOException     // Catch: java.lang.InterruptedException -> L4e
            java.lang.String r0 = "timeout"
            r10.<init>(r0)     // Catch: java.lang.InterruptedException -> L4e
            throw r10     // Catch: java.lang.InterruptedException -> L4e
        L4e:
            java.lang.Thread r10 = java.lang.Thread.currentThread()
            r10.interrupt()
            java.io.InterruptedIOException r10 = new java.io.InterruptedIOException
            java.lang.String r0 = "interrupted"
            r10.<init>(r0)
            throw r10
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

    public final okio.Timeout deadline(long r3, java.util.concurrent.TimeUnit r5) {
            r2 = this;
            r5.getClass()
            r0 = 0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 <= 0) goto L17
            long r0 = java.lang.System.nanoTime()
            long r3 = r5.toNanos(r3)
            long r3 = r3 + r0
            okio.Timeout r3 = r2.deadlineNanoTime(r3)
            return r3
        L17:
            java.lang.String r5 = "duration <= 0: "
            java.lang.String r3 = bc.e.g(r3, r5)
            j8.o.q(r3)
            r3 = 0
            return r3
    }

    public long deadlineNanoTime() {
            r2 = this;
            boolean r0 = r2.hasDeadline
            if (r0 == 0) goto L7
            long r0 = r2.deadlineNanoTime
            return r0
        L7:
            java.lang.String r0 = "No deadline"
            j8.o.A(r0)
            r0 = 0
            return r0
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

    public final <T> T intersectWith(okio.Timeout r10, fg.a r11) {
            r9 = this;
            r10.getClass()
            r11.getClass()
            long r0 = r9.timeoutNanos()
            okio.Timeout$Companion r2 = okio.Timeout.Companion
            long r3 = r10.timeoutNanos()
            long r5 = r9.timeoutNanos()
            long r2 = r2.minTimeout(r3, r5)
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.NANOSECONDS
            r9.timeout(r2, r4)
            boolean r2 = r9.hasDeadline()
            if (r2 == 0) goto L5b
            long r2 = r9.deadlineNanoTime()
            boolean r5 = r10.hasDeadline()
            if (r5 == 0) goto L3c
            long r5 = r9.deadlineNanoTime()
            long r7 = r10.deadlineNanoTime()
            long r5 = java.lang.Math.min(r5, r7)
            r9.deadlineNanoTime(r5)
        L3c:
            java.lang.Object r11 = r11.invoke()     // Catch: java.lang.Throwable -> L4d
            r9.timeout(r0, r4)
            boolean r10 = r10.hasDeadline()
            if (r10 == 0) goto L4c
            r9.deadlineNanoTime(r2)
        L4c:
            return r11
        L4d:
            r11 = move-exception
            r9.timeout(r0, r4)
            boolean r10 = r10.hasDeadline()
            if (r10 == 0) goto L5a
            r9.deadlineNanoTime(r2)
        L5a:
            throw r11
        L5b:
            boolean r2 = r10.hasDeadline()
            if (r2 == 0) goto L68
            long r2 = r10.deadlineNanoTime()
            r9.deadlineNanoTime(r2)
        L68:
            java.lang.Object r11 = r11.invoke()     // Catch: java.lang.Throwable -> L79
            r9.timeout(r0, r4)
            boolean r10 = r10.hasDeadline()
            if (r10 == 0) goto L78
            r9.clearDeadline()
        L78:
            return r11
        L79:
            r11 = move-exception
            r9.timeout(r0, r4)
            boolean r10 = r10.hasDeadline()
            if (r10 == 0) goto L86
            r9.clearDeadline()
        L86:
            throw r11
    }

    public void throwIfReached() {
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

    public okio.Timeout timeout(long r3, java.util.concurrent.TimeUnit r5) {
            r2 = this;
            r5.getClass()
            r0 = 0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 < 0) goto L10
            long r3 = r5.toNanos(r3)
            r2.timeoutNanos = r3
            return r2
        L10:
            java.lang.String r5 = "timeout < 0: "
            java.lang.String r3 = bc.e.g(r3, r5)
            j8.o.q(r3)
            r3 = 0
            return r3
    }

    public long timeoutNanos() {
            r2 = this;
            long r0 = r2.timeoutNanos
            return r0
    }

    public final void waitUntilNotified(java.lang.Object r10) {
            r9 = this;
            r10.getClass()
            boolean r0 = r9.hasDeadline()     // Catch: java.lang.InterruptedException -> L55
            long r1 = r9.timeoutNanos()     // Catch: java.lang.InterruptedException -> L55
            r3 = 0
            if (r0 != 0) goto L17
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L17
            r10.wait()     // Catch: java.lang.InterruptedException -> L55
            return
        L17:
            long r5 = java.lang.System.nanoTime()     // Catch: java.lang.InterruptedException -> L55
            if (r0 == 0) goto L2b
            int r7 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r7 == 0) goto L2b
            long r7 = r9.deadlineNanoTime()     // Catch: java.lang.InterruptedException -> L55
            long r7 = r7 - r5
            long r1 = java.lang.Math.min(r1, r7)     // Catch: java.lang.InterruptedException -> L55
            goto L33
        L2b:
            if (r0 == 0) goto L33
            long r0 = r9.deadlineNanoTime()     // Catch: java.lang.InterruptedException -> L55
            long r1 = r0 - r5
        L33:
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L48
            r3 = 1000000(0xf4240, double:4.940656E-318)
            long r7 = r1 / r3
            long r3 = r3 * r7
            long r3 = r1 - r3
            int r0 = (int) r3     // Catch: java.lang.InterruptedException -> L55
            r10.wait(r7, r0)     // Catch: java.lang.InterruptedException -> L55
            long r3 = java.lang.System.nanoTime()     // Catch: java.lang.InterruptedException -> L55
            long r3 = r3 - r5
        L48:
            int r10 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r10 >= 0) goto L4d
            return
        L4d:
            java.io.InterruptedIOException r10 = new java.io.InterruptedIOException     // Catch: java.lang.InterruptedException -> L55
            java.lang.String r0 = "timeout"
            r10.<init>(r0)     // Catch: java.lang.InterruptedException -> L55
            throw r10     // Catch: java.lang.InterruptedException -> L55
        L55:
            java.lang.Thread r10 = java.lang.Thread.currentThread()
            r10.interrupt()
            java.io.InterruptedIOException r10 = new java.io.InterruptedIOException
            java.lang.String r0 = "interrupted"
            r10.<init>(r0)
            throw r10
    }
}
